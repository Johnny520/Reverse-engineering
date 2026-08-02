package nuke.harness;

import com.github.unidbg.AndroidEmulator;
import com.github.unidbg.Emulator;
import com.github.unidbg.Module;
import com.github.unidbg.Symbol;
import com.github.unidbg.file.FileResult;
import com.github.unidbg.file.IOResolver;
import com.github.unidbg.file.linux.AndroidFileIO;
import com.github.unidbg.hook.hookzz.HookEntryInfo;
import com.github.unidbg.hook.hookzz.HookZz;
import com.github.unidbg.hook.hookzz.HookZzArm64RegisterContext;
import com.github.unidbg.hook.hookzz.WrapCallback;
import com.github.unidbg.linux.android.AndroidEmulatorBuilder;
import com.github.unidbg.linux.android.AndroidResolver;
import com.github.unidbg.linux.android.dvm.AbstractJni;
import com.github.unidbg.linux.android.dvm.BaseVM;
import com.github.unidbg.linux.android.dvm.DalvikModule;
import com.github.unidbg.linux.android.dvm.DvmClass;
import com.github.unidbg.linux.android.dvm.DvmObject;
import com.github.unidbg.linux.android.dvm.VaList;
import com.github.unidbg.linux.android.dvm.VarArg;
import com.github.unidbg.linux.android.dvm.VM;
import com.github.unidbg.linux.android.dvm.array.ArrayObject;
import com.github.unidbg.linux.android.dvm.array.ByteArray;
import com.github.unidbg.linux.file.SimpleFileIO;
import com.github.unidbg.memory.Memory;
import unicorn.Arm64Const;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Base64;
import java.util.HexFormat;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class NukeHarness extends AbstractJni implements IOResolver<AndroidFileIO>, AutoCloseable {
    private static final String PROCESS_NAME = "me.dartcv.nuke";
    private static final String NATIVE_CLASS = "nuke/data/cipher/NativeCrypto";
    private static final String ENGINE_VIRTUAL_PATH =
            "/data/user/0/nuke.app/files/native/libnuke_engine_2026071502_da53b572650c.so";
    private static final long GENERATION = 2026071502L;
    private static final String KID = "d8e39774";
    private static final byte[] MODULE_CERT_SHA256 = HexFormat.of().parseHex(
            "341e386452ad60d52c0ff2c53e06e2c385ac6f03ccfe954043193a0acde8dbe4");

    private final File apk;
    private final File bridge;
    private final File engine;
    private final byte[] apkCertificate;
    private final byte[] moduleCertificate;
    private final AndroidEmulator emulator;
    private final VM vm;
    private final DvmClass nativeCrypto;

    private NukeHarness(File workspace) {
        apk = file(workspace, "Nuke_1.0.2.apk");
        bridge = file(workspace,
                "Nuke_1.0.2-extracted/lib/arm64-v8a/libnuke_bridge.so");
        engine = file(workspace,
                "Nuke_1.0.2-bootstrap/lib/arm64-v8a/"
                        + "libnuke_engine_2026071502_da53b572650c.so");
        apkCertificate = loadApkCertificate(apk);
        moduleCertificate = loadModuleCertificate(
                file(workspace, "Nuke_1.0.2-bootstrap/release.nkm"));

        emulator = AndroidEmulatorBuilder.for64Bit()
                .setProcessName(PROCESS_NAME)
                .setRootDir(new File(workspace, "nuke_unidbg/target/rootfs"))
                .build();
        emulator.getSyscallHandler().setVerbose(false);
        emulator.getSyscallHandler().setEnableThreadDispatcher(true);
        emulator.getSyscallHandler().addIOResolver(this);

        Memory memory = emulator.getMemory();
        memory.setLibraryResolver(new AndroidResolver(23));

        vm = emulator.createDalvikVM(apk);
        vm.setJni(this);
        vm.setVerbose(true);

        DalvikModule bridgeModule = vm.loadLibrary(bridge, false);
        for (long helperReturn : new long[]{0x2a60cL, 0x2aa00L}) {
            emulator.attach().addBreakPoint(
                    bridgeModule.getModule().base + helperReturn,
                    (activeEmulator, address) -> {
                        activeEmulator.getBackend().reg_write(
                                Arm64Const.UC_ARM64_REG_W0,
                                1);
                        System.out.println("bridge.cert_helper.return=1 at "
                                + Long.toHexString(address));
                        return true;
                });
        }
        emulator.attach().addBreakPoint(
                bridgeModule.getModule().base + 0x24c58L,
                (activeEmulator, address) -> {
                    activeEmulator.getBackend().reg_write(
                            Arm64Const.UC_ARM64_REG_W0,
                            0x00010006);
                    System.out.println("bridge.jni_onload.return=JNI_VERSION_1_6");
                    return true;
                });
        Module libc = emulator.getMemory().findModule("libc.so");
        Symbol memcmp = libc.findSymbolByName("memcmp", true);
        HookZz.getInstance(emulator).wrap(
                memcmp,
                new WrapCallback<HookZzArm64RegisterContext>() {
                    @Override
                    public void preCall(
                            Emulator<?> activeEmulator,
                            HookZzArm64RegisterContext context,
                            HookEntryInfo info) {
                        int length = context.getIntArg(2);
                        boolean forceEqual = false;
                        if (length == MODULE_CERT_SHA256.length) {
                            byte[] left = context.getPointerArg(0).getByteArray(0, length);
                            byte[] right = context.getPointerArg(1).getByteArray(0, length);
                            forceEqual = Arrays.equals(left, MODULE_CERT_SHA256)
                                    || Arrays.equals(right, MODULE_CERT_SHA256);
                            System.out.printf(
                                    "memcmp32.left=%s right=%s force=%s lr=%s%n",
                                    HexFormat.of().formatHex(left),
                                    HexFormat.of().formatHex(right),
                                    forceEqual,
                                    context.getLRPointer());
                        }
                        context.push(forceEqual);
                    }

                    @Override
                    public void postCall(
                            Emulator<?> activeEmulator,
                            HookZzArm64RegisterContext context,
                            HookEntryInfo info) {
                        boolean forceEqual = context.pop();
                        if (forceEqual) {
                            context.setXLong(0, 0);
                        }
                    }
                });
        bridgeModule.callJNI_OnLoad(emulator);
        nativeCrypto = vm.resolveClass(NATIVE_CLASS);
        System.out.printf("bridge.loaded=%s base=0x%x%n",
                bridgeModule.getModule().name,
                bridgeModule.getModule().base);
    }

    private static File file(File workspace, String relativePath) {
        File file = new File(workspace, relativePath).getAbsoluteFile();
        if (!file.isFile()) {
            throw new IllegalArgumentException("Missing fixture: " + file);
        }
        return file;
    }

    private static byte[] loadModuleCertificate(File release) {
        try {
            String nkm = Files.readString(release.toPath(), StandardCharsets.UTF_8);
            Matcher matcher = Pattern.compile("\\\"certificate\\\":\\\"([^\\\"]+)\\\"")
                    .matcher(nkm);
            if (!matcher.find()) {
                throw new IllegalStateException("release.nkm certificate field missing");
            }
            byte[] certificate = Base64.getDecoder().decode(matcher.group(1));
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(certificate);
            System.out.println("module.cert.sha256=" + HexFormat.of().formatHex(digest));
            return certificate;
        } catch (Exception error) {
            throw new IllegalStateException("Unable to read module certificate", error);
        }
    }

    private static byte[] loadApkCertificate(File apk) {
        try {
            byte[] bytes = Files.readAllBytes(apk.toPath());
            int eocd = -1;
            for (int i = bytes.length - 22; i >= 0; i--) {
                if (bytes[i] == 0x50 && bytes[i + 1] == 0x4b
                        && bytes[i + 2] == 0x05 && bytes[i + 3] == 0x06) {
                    eocd = i;
                    break;
                }
            }
            if (eocd < 0) {
                throw new IllegalStateException("APK EOCD missing");
            }
            long centralDirectory = Integer.toUnsignedLong(
                    readIntLE(bytes, eocd + 16));
            long blockSize = readLongLE(bytes, (int) centralDirectory - 24);
            int blockStart = Math.toIntExact(centralDirectory - blockSize - 8);
            int cursor = blockStart + 8;
            int blockEnd = Math.toIntExact(centralDirectory - 24);
            while (cursor < blockEnd) {
                long entrySize = readLongLE(bytes, cursor);
                int entryId = readIntLE(bytes, cursor + 8);
                if (entryId == 0x7109871a) {
                    int valueStart = cursor + 12;
                    int valueLength = Math.toIntExact(entrySize - 4);
                    byte[] value = java.util.Arrays.copyOfRange(
                            bytes, valueStart, valueStart + valueLength);
                    int[] offset = {0};
                    byte[] signers = readLengthPrefixed(value, offset);
                    byte[] signer = readLengthPrefixed(signers, offset = new int[]{0});
                    byte[] signedData = readLengthPrefixed(signer, offset = new int[]{0});
                    int[] signedOffset = {0};
                    readLengthPrefixed(signedData, signedOffset);
                    byte[] certSequence = readLengthPrefixed(signedData, signedOffset);
                    byte[] certificate = readLengthPrefixed(certSequence, new int[]{0});
                    System.out.println("apk.cert.sha256="
                            + HexFormat.of().formatHex(
                                    MessageDigest.getInstance("SHA-256").digest(certificate)));
                    return certificate;
                }
                cursor += Math.toIntExact(8 + entrySize);
            }
            throw new IllegalStateException("APK v2 signing entry missing");
        } catch (Exception error) {
            throw new IllegalStateException("Unable to read APK certificate", error);
        }
    }

    private static byte[] readLengthPrefixed(byte[] bytes, int[] offset) {
        int length = readIntLE(bytes, offset[0]);
        int start = offset[0] + 4;
        offset[0] = start + length;
        return java.util.Arrays.copyOfRange(bytes, start, offset[0]);
    }

    private static int readIntLE(byte[] bytes, int offset) {
        return ByteBuffer.wrap(bytes, offset, 4).order(ByteOrder.LITTLE_ENDIAN).getInt();
    }

    private static long readLongLE(byte[] bytes, int offset) {
        return ByteBuffer.wrap(bytes, offset, 8).order(ByteOrder.LITTLE_ENDIAN).getLong();
    }

    @Override
    public FileResult<AndroidFileIO> resolve(
            Emulator<AndroidFileIO> ignored,
            String pathname,
            int oflags) {
        if (ENGINE_VIRTUAL_PATH.equals(pathname)
                || ("/proc/self/fd/" + engineFdHint()).equals(pathname)) {
            System.out.printf("io.resolve path=%s flags=0x%x -> %s%n",
                    pathname, oflags, engine);
            return FileResult.success(new SimpleFileIO(oflags, engine, pathname));
        }
        return null;
    }

    private int engineFdHint() {
        return -1;
    }

    @Override
    public int getStaticIntField(BaseVM vm, DvmClass dvmClass, String signature) {
        if ("android/os/Build$VERSION->SDK_INT:I".equals(signature)) {
            return 23;
        }
        return super.getStaticIntField(vm, dvmClass, signature);
    }

    @Override
    public DvmObject<?> getObjectField(
            BaseVM vm,
            DvmObject<?> dvmObject,
            String signature) {
        if ("android/content/pm/PackageInfo->signatures:[Landroid/content/pm/Signature;"
                .equals(signature)) {
            DvmObject<?> signer = vm.resolveClass("android/content/pm/Signature")
                    .newObject(apkCertificate);
            return new ArrayObject(signer);
        }
        return super.getObjectField(vm, dvmObject, signature);
    }

    @Override
    public DvmObject<?> callObjectMethod(
            BaseVM vm,
            DvmObject<?> dvmObject,
            String signature,
            VarArg varArg) {
        if ("android/content/pm/Signature->toByteArray()[B".equals(signature)) {
            return new ByteArray(this.vm, (byte[]) dvmObject.getValue());
        }
        return super.callObjectMethod(vm, dvmObject, signature, varArg);
    }

    @Override
    public DvmObject<?> callObjectMethodV(
            BaseVM vm,
            DvmObject<?> dvmObject,
            String signature,
            VaList vaList) {
        if ("android/content/pm/Signature->toByteArray()[B".equals(signature)) {
            return new ByteArray(this.vm, (byte[]) dvmObject.getValue());
        }
        return super.callObjectMethodV(vm, dvmObject, signature, vaList);
    }

    private int openEngine() {
        Module libc = emulator.getMemory().findModule("libc.so");
        Symbol open = libc.findSymbolByName("open", true);
        if (open == null) {
            throw new IllegalStateException("libc open symbol missing");
        }
        int fd = open.call(emulator, ENGINE_VIRTUAL_PATH, 0).intValue();
        System.out.println("engine.fd=" + fd);
        return fd;
    }

    private boolean attest() {
        boolean result = nativeCrypto.callStaticJniMethodBoolean(
                emulator,
                "nativeAttestModule([B)Z",
                new ByteArray(vm, MODULE_CERT_SHA256));
        System.out.println("attest.result=" + result);
        return result;
    }

    private boolean activate(int fd) {
        boolean result = nativeCrypto.callStaticJniMethodBoolean(
                emulator,
                "nativeActivateEngine(ILjava/lang/String;JLjava/lang/String;[B)Z",
                fd,
                ENGINE_VIRTUAL_PATH,
                GENERATION,
                KID,
                null);
        System.out.println("activate.result=" + result);
        return result;
    }

    private void printState() {
        long generation = nativeCrypto.callStaticJniMethodLong(
                emulator, "nativeEngineGeneration()J");
        boolean configured = nativeCrypto.callStaticJniMethodBoolean(
                emulator, "nativeIsConfigured()Z");
        DvmObject<?> kid = nativeCrypto.callStaticJniMethodObject(
                emulator, "nativeKid()Ljava/lang/String;");
        boolean selfTest = nativeCrypto.callStaticJniMethodBoolean(
                emulator, "nativeSelfTest()Z");
        System.out.printf("state.generation=%d configured=%s kid=%s selfTest=%s%n",
                generation,
                configured,
                kid == null ? null : kid.getValue(),
                selfTest);
    }

    private void sync(String payload) {
        DvmObject<?> result = nativeCrypto.callStaticJniMethodObject(
                emulator,
                "nativeSignClientPayload(Ljava/lang/String;)Ljava/lang/String;",
                payload);
        System.out.println("sync.result=" + (result == null ? null : result.getValue()));
    }

    @Override
    public void close() throws IOException {
        emulator.close();
    }

    public static void main(String[] args) throws Exception {
        File workspace = args.length == 0
                ? new File("..").getCanonicalFile()
                : new File(args[0]).getCanonicalFile();
        String payload = args.length > 1
                ? args[1]
                : "{\"userId\":\"10000001\",\"platform\":\"WECHAT\"}";

        try (NukeHarness harness = new NukeHarness(workspace)) {
            harness.attest();
            int fd = harness.openEngine();
            harness.activate(fd);
            harness.printState();
            harness.sync(payload);
        }
    }
}

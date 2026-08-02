package nuke.harness;

import com.github.unidbg.AndroidEmulator;
import com.github.unidbg.Module;
import com.github.unidbg.Symbol;
import com.github.unidbg.linux.android.AndroidEmulatorBuilder;
import com.github.unidbg.linux.android.AndroidResolver;
import com.github.unidbg.linux.android.dvm.VM;

import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class EngineProbe {
    private EngineProbe() {
    }

    public static void main(String[] args) throws Exception {
        File workspace = args.length == 0
                ? new File("..").getCanonicalFile()
                : new File(args[0]).getCanonicalFile();
        File engine = new File(
                workspace,
                "Nuke_1.0.2-bootstrap/lib/arm64-v8a/"
                        + "libnuke_engine_2026071502_da53b572650c.so");
        if (!engine.isFile()) {
            throw new IllegalArgumentException("Missing fixture: " + engine);
        }

        try (AndroidEmulator emulator = AndroidEmulatorBuilder.for64Bit()
                .setProcessName("me.dartcv.nuke")
                .setRootDir(new File(workspace, "nuke_unidbg/target/engine-rootfs"))
                .build()) {
            emulator.getSyscallHandler().setEnableThreadDispatcher(true);
            emulator.getMemory().setLibraryResolver(new AndroidResolver(23));

            VM vm = emulator.createDalvikVM();
            Module module = vm.loadLibrary(engine, false).getModule();
            Symbol getApi = module.findSymbolByName("nuke_engine_get_api_v1", true);
            if (getApi == null) {
                throw new IllegalStateException("nuke_engine_get_api_v1 is missing");
            }
            long api = getApi.call(emulator).longValue();
            byte[] bytes = emulator.getBackend().mem_read(api, 0x88);
            ByteBuffer table = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);

            System.out.printf("engine.loaded=%s base=0x%x%n", module.name, module.base);
            System.out.printf("engine.api=0x%x%n", api);
            for (int offset = 0; offset < bytes.length; offset += 8) {
                System.out.printf("api[%02x]=0x%016x%n", offset, table.getLong(offset));
            }
        }
    }
}

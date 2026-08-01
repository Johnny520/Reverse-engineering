package io.ktor.util;

import com.bumptech.glide.AbstractC3889;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.p008io.AbstractC5213;
import kotlin.p008io.C5209;
import kotlin.text.AbstractC5976;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.channels.C6034;
import kotlinx.p010io.AbstractC6310;
import kotlinx.p010io.C6309;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p073.InterfaceC7680;
import p074.AbstractC7684;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5049 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final byte[] f13050 = new byte[7];

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9181(InterfaceC5079 interfaceC5079, Deflater deflater, ByteBuffer byteBuffer, InterfaceC7372 interfaceC7372, ContinuationImpl continuationImpl) {
        DeflaterKt$deflateWhile$1 deflaterKt$deflateWhile$1;
        if (continuationImpl instanceof DeflaterKt$deflateWhile$1) {
            deflaterKt$deflateWhile$1 = (DeflaterKt$deflateWhile$1) continuationImpl;
            int i = deflaterKt$deflateWhile$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deflaterKt$deflateWhile$1.label = i - Integer.MIN_VALUE;
            } else {
                deflaterKt$deflateWhile$1 = new DeflaterKt$deflateWhile$1(continuationImpl);
            }
        }
        Object obj = deflaterKt$deflateWhile$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = deflaterKt$deflateWhile$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            InterfaceC7372 interfaceC73722 = (InterfaceC7372) deflaterKt$deflateWhile$1.L$3;
            ByteBuffer byteBuffer2 = (ByteBuffer) deflaterKt$deflateWhile$1.L$2;
            Deflater deflater2 = (Deflater) deflaterKt$deflateWhile$1.L$1;
            InterfaceC5079 interfaceC50792 = (InterfaceC5079) deflaterKt$deflateWhile$1.L$0;
            AbstractC6017.m10769(obj);
            interfaceC7372 = interfaceC73722;
            interfaceC5079 = interfaceC50792;
            byteBuffer = byteBuffer2;
            deflater = deflater2;
        }
        while (((Boolean) interfaceC7372.invoke()).booleanValue()) {
            byteBuffer.clear();
            if (byteBuffer.hasRemaining()) {
                byteBuffer.position(byteBuffer.position() + deflater.deflate(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining()));
            }
            byteBuffer.flip();
            deflaterKt$deflateWhile$1.L$0 = interfaceC5079;
            deflaterKt$deflateWhile$1.L$1 = deflater;
            deflaterKt$deflateWhile$1.L$2 = byteBuffer;
            deflaterKt$deflateWhile$1.L$3 = interfaceC7372;
            deflaterKt$deflateWhile$1.label = 1;
            if (AbstractC5076.m9216(interfaceC5079, byteBuffer, deflaterKt$deflateWhile$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final File m9182(File file, String str) {
        String strSubstring;
        file.getClass();
        File file2 = new File(str);
        File fileM9430 = AbstractC5213.m9430(file2);
        String path = fileM9430.getPath();
        path.getClass();
        boolean zEquals = false;
        if (AbstractC3889.m7312(path) > 0) {
            File file3 = fileM9430;
            while (true) {
                File parentFile = file3.getParentFile();
                if (parentFile == null) {
                    break;
                }
                file3 = parentFile;
            }
            String path2 = fileM9430.getPath();
            path2.getClass();
            String strM10721 = AbstractC5976.m10721(file3.getName().length(), path2);
            int length = strM10721.length();
            int i = 0;
            while (true) {
                if (i < length) {
                    char cCharAt = strM10721.charAt(i);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        strSubstring = strM10721.substring(i);
                        break;
                    }
                    i++;
                } else {
                    strSubstring = "";
                    break;
                }
            }
            fileM9430 = new File(strSubstring);
        }
        String path3 = fileM9430.getPath();
        String str2 = path3 != null ? path3 : "";
        int length2 = str2.length() - 1;
        int i2 = 0;
        while (true) {
            if (i2 <= length2) {
                char cCharAt2 = str2.charAt(i2);
                if (cCharAt2 != '\\' && cCharAt2 != '/') {
                    if (cCharAt2 != '.') {
                        break;
                    }
                    if (i2 == length2) {
                        i2++;
                        break;
                    }
                    char cCharAt3 = str2.charAt(i2 + 1);
                    int i3 = 2;
                    if (cCharAt3 != '\\' && cCharAt3 != '/') {
                        if (cCharAt3 == '.') {
                            int i4 = i2 + 2;
                            if (i4 != str2.length()) {
                                char cCharAt4 = str2.charAt(i4);
                                if (cCharAt4 != '\\' && cCharAt4 != '/') {
                                    break;
                                }
                                i3 = 3;
                            }
                        } else {
                            break;
                        }
                    }
                    i2 += i3;
                } else {
                    i2++;
                }
            } else {
                break;
            }
        }
        if (i2 != 0) {
            if (i2 >= fileM9430.getPath().length()) {
                fileM9430 = new File(".");
            } else {
                String path4 = fileM9430.getPath();
                path4.getClass();
                fileM9430 = new File(path4.substring(i2));
            }
        }
        File file4 = new File("..");
        C5209 c5209M7294 = AbstractC3889.m7294(fileM9430);
        List list = c5209M7294.f13299;
        C5209 c5209M72942 = AbstractC3889.m7294(file4);
        List list2 = c5209M72942.f13299;
        if (c5209M7294.f13300.equals(c5209M72942.f13300) && list.size() >= list2.size()) {
            zEquals = list.subList(0, list2.size()).equals(list2);
        }
        if (zEquals) {
            C5043.m9163(file2, "Bad relative path ");
            return null;
        }
        if (!fileM9430.isAbsolute()) {
            return new File(file, fileM9430.getPath());
        }
        C5043.m9174(file2, "Bad relative path ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m9183(InterfaceC5047 interfaceC5047, InterfaceC5047 interfaceC50472) {
        interfaceC5047.getClass();
        interfaceC50472.getClass();
        for (Map.Entry entry : interfaceC50472.mo2978()) {
            interfaceC5047.mo2969((String) entry.getKey(), (List) entry.getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9184(Inflater inflater, InterfaceC5079 interfaceC5079, ByteBuffer byteBuffer, CRC32 crc32, ContinuationImpl continuationImpl) throws DataFormatException {
        EncodersJvmKt$inflateTo$1 encodersJvmKt$inflateTo$1;
        int iInflate;
        if (continuationImpl instanceof EncodersJvmKt$inflateTo$1) {
            encodersJvmKt$inflateTo$1 = (EncodersJvmKt$inflateTo$1) continuationImpl;
            int i = encodersJvmKt$inflateTo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                encodersJvmKt$inflateTo$1.label = i - Integer.MIN_VALUE;
            } else {
                encodersJvmKt$inflateTo$1 = new EncodersJvmKt$inflateTo$1(continuationImpl);
            }
        }
        Object obj = encodersJvmKt$inflateTo$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = encodersJvmKt$inflateTo$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            byteBuffer.clear();
            iInflate = inflater.inflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
            byteBuffer.position(byteBuffer.position() + iInflate);
            byteBuffer.flip();
            m9189(crc32, byteBuffer);
            encodersJvmKt$inflateTo$1.I$0 = iInflate;
            encodersJvmKt$inflateTo$1.label = 1;
            if (AbstractC5076.m9216(interfaceC5079, byteBuffer, encodersJvmKt$inflateTo$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iInflate = encodersJvmKt$inflateTo$1.I$0;
            AbstractC6017.m10769(obj);
        }
        return new Integer(iInflate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00e2: MOVE (r1 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:227), block:B:37:0x00df */
    /* JADX WARN: Path cross not found for [B:104:0x002c, B:41:0x010b], limit reached: 107 */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016e A[Catch: all -> 0x01fa, TRY_LEAVE, TryCatch #3 {all -> 0x01fa, blocks: (B:85:0x0229, B:56:0x0168, B:58:0x016e, B:78:0x01fd, B:80:0x0203, B:92:0x0251), top: B:101:0x0168 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019c A[Catch: all -> 0x01e5, TryCatch #0 {all -> 0x01e5, blocks: (B:62:0x0194, B:64:0x019c, B:66:0x01a8, B:73:0x01eb, B:74:0x01f2), top: B:95:0x0194 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fd A[Catch: all -> 0x01fa, TRY_ENTER, TryCatch #3 {all -> 0x01fa, blocks: (B:85:0x0229, B:56:0x0168, B:58:0x016e, B:78:0x01fd, B:80:0x0203, B:92:0x0251), top: B:101:0x0168 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0229 A[Catch: all -> 0x01fa, TRY_LEAVE, TryCatch #3 {all -> 0x01fa, blocks: (B:85:0x0229, B:56:0x0168, B:58:0x016e, B:78:0x01fd, B:80:0x0203, B:92:0x0251), top: B:101:0x0168 }] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v24, types: [飘花落叶言世子楪哲兰苏.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r21v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x01f3 -> B:101:0x0168). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9185(InterfaceC5084 interfaceC5084, InterfaceC5079 interfaceC5079, boolean z, InterfaceC7680 interfaceC7680, ContinuationImpl continuationImpl) throws Throwable {
        DeflaterKt$deflateTo$1 deflaterKt$deflateTo$1;
        ?? r4;
        ?? r5;
        ?? r6;
        Object obj;
        ?? r1;
        CRC32 crc32;
        InterfaceC5079 interfaceC50792;
        Deflater deflater;
        ByteBuffer byteBuffer;
        InterfaceC7680 interfaceC76802;
        InterfaceC5084 interfaceC50842;
        InterfaceC5084 interfaceC50843;
        ByteBuffer byteBuffer2;
        CRC32 crc322;
        ?? r0;
        InterfaceC7680 interfaceC76803;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        Deflater deflater2;
        ByteBuffer byteBuffer5;
        final Deflater deflater3;
        CRC32 crc323;
        InterfaceC5079 interfaceC50793;
        ByteBuffer byteBuffer6;
        ByteBuffer byteBuffer7;
        Deflater deflater4;
        InterfaceC7680 interfaceC76804;
        ByteBuffer byteBuffer8;
        InterfaceC7680 interfaceC76805;
        ByteBuffer byteBuffer9;
        ?? r02;
        final Deflater deflater5;
        ByteBuffer byteBuffer10;
        ByteBuffer byteBuffer11;
        if (continuationImpl instanceof DeflaterKt$deflateTo$1) {
            deflaterKt$deflateTo$1 = (DeflaterKt$deflateTo$1) continuationImpl;
            int i = deflaterKt$deflateTo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deflaterKt$deflateTo$1.label = i - Integer.MIN_VALUE;
            } else {
                deflaterKt$deflateTo$1 = new DeflaterKt$deflateTo$1(continuationImpl);
            }
        }
        Object obj2 = deflaterKt$deflateTo$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r52 = deflaterKt$deflateTo$1.label;
        int i2 = 2;
        final int i3 = 1;
        if (r52 != 0) {
            try {
            } catch (Throwable th) {
                th = th;
                r4 = r52;
                r5 = 5;
                r6 = z;
                r1 = obj;
            }
            if (r52 == 1) {
                boolean z2 = deflaterKt$deflateTo$1.Z$0;
                ByteBuffer byteBuffer12 = (ByteBuffer) deflaterKt$deflateTo$1.L$6;
                ByteBuffer byteBuffer13 = (ByteBuffer) deflaterKt$deflateTo$1.L$5;
                Deflater deflater6 = (Deflater) deflaterKt$deflateTo$1.L$4;
                crc32 = (CRC32) deflaterKt$deflateTo$1.L$3;
                InterfaceC7680 interfaceC76806 = (InterfaceC7680) deflaterKt$deflateTo$1.L$2;
                interfaceC50792 = (InterfaceC5079) deflaterKt$deflateTo$1.L$1;
                InterfaceC5084 interfaceC50844 = (InterfaceC5084) deflaterKt$deflateTo$1.L$0;
                AbstractC6017.m10769(obj2);
                deflater = deflater6;
                byteBuffer = byteBuffer12;
                interfaceC76802 = interfaceC76806;
                interfaceC50842 = interfaceC50844;
                r0 = z2;
                byteBuffer11 = byteBuffer13;
                ByteBuffer byteBuffer14 = byteBuffer11;
                deflater3 = deflater;
                byteBuffer5 = byteBuffer14;
                if (interfaceC50842.mo9200()) {
                }
                return coroutineSingletons;
            }
            if (r52 == 2) {
                boolean z3 = deflaterKt$deflateTo$1.Z$0;
                ByteBuffer byteBuffer15 = (ByteBuffer) deflaterKt$deflateTo$1.L$6;
                ByteBuffer byteBuffer16 = (ByteBuffer) deflaterKt$deflateTo$1.L$5;
                Deflater deflater7 = (Deflater) deflaterKt$deflateTo$1.L$4;
                CRC32 crc324 = (CRC32) deflaterKt$deflateTo$1.L$3;
                InterfaceC7680 interfaceC76807 = (InterfaceC7680) deflaterKt$deflateTo$1.L$2;
                interfaceC50792 = (InterfaceC5079) deflaterKt$deflateTo$1.L$1;
                interfaceC50843 = (InterfaceC5084) deflaterKt$deflateTo$1.L$0;
                AbstractC6017.m10769(obj2);
                byteBuffer2 = byteBuffer15;
                interfaceC76802 = interfaceC76807;
                crc322 = crc324;
                r0 = z3;
                byteBuffer10 = byteBuffer16;
                deflater5 = deflater7;
                if (((Number) obj2).intValue() <= 0) {
                }
                if (interfaceC50842.mo9200()) {
                }
                return coroutineSingletons;
            }
            if (r52 != 3) {
                if (r52 == 4) {
                    boolean z4 = deflaterKt$deflateTo$1.Z$0;
                    ByteBuffer byteBuffer17 = (ByteBuffer) deflaterKt$deflateTo$1.L$5;
                    ByteBuffer byteBuffer18 = (ByteBuffer) deflaterKt$deflateTo$1.L$4;
                    Deflater deflater8 = (Deflater) deflaterKt$deflateTo$1.L$3;
                    crc323 = (CRC32) deflaterKt$deflateTo$1.L$2;
                    InterfaceC7680 interfaceC76808 = (InterfaceC7680) deflaterKt$deflateTo$1.L$1;
                    interfaceC50793 = (InterfaceC5079) deflaterKt$deflateTo$1.L$0;
                    try {
                        AbstractC6017.m10769(obj2);
                        byteBuffer6 = byteBuffer17;
                        byteBuffer7 = byteBuffer18;
                        deflater4 = deflater8;
                        interfaceC76804 = interfaceC76808;
                        r02 = z4;
                        if (r02 != 0) {
                            deflaterKt$deflateTo$1.L$0 = interfaceC76804;
                            deflaterKt$deflateTo$1.L$1 = deflater4;
                            deflaterKt$deflateTo$1.L$2 = byteBuffer7;
                            deflaterKt$deflateTo$1.L$3 = byteBuffer6;
                            deflaterKt$deflateTo$1.L$4 = null;
                            deflaterKt$deflateTo$1.L$5 = null;
                            deflaterKt$deflateTo$1.label = 5;
                            if (m9188(interfaceC50793, crc323, deflater4, deflaterKt$deflateTo$1) != coroutineSingletons) {
                                interfaceC76805 = interfaceC76804;
                                byteBuffer8 = byteBuffer7;
                                byteBuffer9 = byteBuffer6;
                                deflater4 = deflater4;
                                byteBuffer6 = byteBuffer9;
                                interfaceC76804 = interfaceC76805;
                                byteBuffer7 = byteBuffer8;
                            }
                            return coroutineSingletons;
                        }
                        deflater4.end();
                        interfaceC76804.mo8893(byteBuffer7);
                        interfaceC76804.mo8893(byteBuffer6);
                        return C6008.f15084;
                    } catch (Throwable th2) {
                        th = th2;
                        r6 = byteBuffer17;
                        r4 = byteBuffer18;
                        r5 = deflater8;
                        r1 = interfaceC76808;
                    }
                } else {
                    if (r52 != 5) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ByteBuffer byteBuffer19 = (ByteBuffer) deflaterKt$deflateTo$1.L$3;
                    ByteBuffer byteBuffer20 = (ByteBuffer) deflaterKt$deflateTo$1.L$2;
                    Deflater deflater9 = (Deflater) deflaterKt$deflateTo$1.L$1;
                    InterfaceC7680 interfaceC76809 = (InterfaceC7680) deflaterKt$deflateTo$1.L$0;
                    try {
                        AbstractC6017.m10769(obj2);
                        byteBuffer9 = byteBuffer19;
                        interfaceC76805 = interfaceC76809;
                        byteBuffer8 = byteBuffer20;
                        deflater4 = deflater9;
                        byteBuffer6 = byteBuffer9;
                        interfaceC76804 = interfaceC76805;
                        byteBuffer7 = byteBuffer8;
                        deflater4.end();
                        interfaceC76804.mo8893(byteBuffer7);
                        interfaceC76804.mo8893(byteBuffer6);
                        return C6008.f15084;
                    } catch (Throwable th3) {
                        th = th3;
                        r6 = byteBuffer19;
                        r1 = interfaceC76809;
                        r4 = byteBuffer20;
                        r5 = deflater9;
                    }
                }
                r5.end();
                r1.mo8893(r4);
                r1.mo8893(r6);
                throw th;
            }
            r0 = deflaterKt$deflateTo$1.Z$0;
            ByteBuffer byteBuffer21 = (ByteBuffer) deflaterKt$deflateTo$1.L$6;
            ByteBuffer byteBuffer22 = (ByteBuffer) deflaterKt$deflateTo$1.L$5;
            Deflater deflater10 = (Deflater) deflaterKt$deflateTo$1.L$4;
            CRC32 crc325 = (CRC32) deflaterKt$deflateTo$1.L$3;
            interfaceC76803 = (InterfaceC7680) deflaterKt$deflateTo$1.L$2;
            InterfaceC5079 interfaceC50794 = (InterfaceC5079) deflaterKt$deflateTo$1.L$1;
            InterfaceC5084 interfaceC50845 = (InterfaceC5084) deflaterKt$deflateTo$1.L$0;
            try {
                AbstractC6017.m10769(obj2);
                byteBuffer5 = byteBuffer22;
                deflater3 = deflater10;
                crc32 = crc325;
                interfaceC50842 = interfaceC50845;
                byteBuffer = byteBuffer21;
                interfaceC76802 = interfaceC76803;
                interfaceC50792 = interfaceC50794;
                i2 = 2;
                try {
                } catch (Throwable th4) {
                    th = th4;
                    r4 = byteBuffer5;
                    r1 = interfaceC76802;
                    r5 = deflater3;
                    r6 = byteBuffer;
                }
            } catch (Throwable th5) {
                th = th5;
                byteBuffer3 = byteBuffer21;
                byteBuffer4 = byteBuffer22;
                deflater2 = deflater10;
                r1 = interfaceC76803;
                r4 = byteBuffer4;
                r5 = deflater2;
                r6 = byteBuffer3;
            }
            if (interfaceC50842.mo9200()) {
                byteBuffer5.clear();
                deflaterKt$deflateTo$1.L$0 = interfaceC50842;
                deflaterKt$deflateTo$1.L$1 = interfaceC50792;
                deflaterKt$deflateTo$1.L$2 = interfaceC76802;
                deflaterKt$deflateTo$1.L$3 = crc32;
                deflaterKt$deflateTo$1.L$4 = deflater3;
                deflaterKt$deflateTo$1.L$5 = byteBuffer5;
                deflaterKt$deflateTo$1.L$6 = byteBuffer;
                deflaterKt$deflateTo$1.Z$0 = r0;
                deflaterKt$deflateTo$1.label = i2;
                Object objM9235 = AbstractC5076.m9235(interfaceC50842, byteBuffer5, deflaterKt$deflateTo$1);
                if (objM9235 != coroutineSingletons) {
                    Deflater deflater11 = deflater3;
                    byteBuffer10 = byteBuffer5;
                    obj2 = objM9235;
                    interfaceC50843 = interfaceC50842;
                    crc322 = crc32;
                    byteBuffer2 = byteBuffer;
                    deflater5 = deflater11;
                    r0 = r0;
                    interfaceC76802 = interfaceC76802;
                    try {
                    } catch (Throwable th6) {
                        th = th6;
                        r4 = byteBuffer10;
                        r5 = deflater5;
                        r6 = byteBuffer2;
                        r1 = interfaceC76802;
                    }
                    if (((Number) obj2).intValue() <= 0) {
                        byteBuffer10.flip();
                        m9189(crc322, byteBuffer10);
                        if (!byteBuffer10.hasArray()) {
                            throw new IllegalArgumentException("buffer need to be array-backed");
                        }
                        deflater5.setInput(byteBuffer10.array(), byteBuffer10.position() + byteBuffer10.arrayOffset(), byteBuffer10.remaining());
                        final int i4 = 0;
                        InterfaceC7372 interfaceC7372 = new InterfaceC7372() { // from class: io.ktor.util.飘花落叶言子楪苏哲世兰
                            @Override // p068.InterfaceC7372
                            public final Object invoke() {
                                boolean zNeedsInput;
                                int i5 = i4;
                                Deflater deflater12 = deflater5;
                                switch (i5) {
                                    case 0:
                                        zNeedsInput = deflater12.needsInput();
                                        break;
                                    default:
                                        zNeedsInput = deflater12.finished();
                                        break;
                                }
                                return Boolean.valueOf(!zNeedsInput);
                            }
                        };
                        deflaterKt$deflateTo$1.L$0 = interfaceC50843;
                        deflaterKt$deflateTo$1.L$1 = interfaceC50792;
                        deflaterKt$deflateTo$1.L$2 = interfaceC76802;
                        deflaterKt$deflateTo$1.L$3 = crc322;
                        deflaterKt$deflateTo$1.L$4 = deflater5;
                        deflaterKt$deflateTo$1.L$5 = byteBuffer10;
                        deflaterKt$deflateTo$1.L$6 = byteBuffer2;
                        deflaterKt$deflateTo$1.Z$0 = r0;
                        deflaterKt$deflateTo$1.label = 3;
                        if (m9181(interfaceC50792, deflater5, byteBuffer2, interfaceC7372, deflaterKt$deflateTo$1) != coroutineSingletons) {
                            byteBuffer5 = byteBuffer10;
                            deflater3 = deflater5;
                            byteBuffer = byteBuffer2;
                            crc32 = crc322;
                            interfaceC50842 = interfaceC50843;
                            i2 = 2;
                        }
                        r5.end();
                        r1.mo8893(r4);
                        r1.mo8893(r6);
                        throw th;
                    }
                    byteBuffer5 = byteBuffer10;
                    deflater3 = deflater5;
                    byteBuffer = byteBuffer2;
                    crc32 = crc322;
                    interfaceC50842 = interfaceC50843;
                    if (interfaceC50842.mo9200()) {
                        Throwable thMo9203 = interfaceC50842.mo9203();
                        if (thMo9203 != null) {
                            throw thMo9203;
                        }
                        deflater3.finish();
                        InterfaceC7372 interfaceC73722 = new InterfaceC7372() { // from class: io.ktor.util.飘花落叶言子楪苏哲世兰
                            @Override // p068.InterfaceC7372
                            public final Object invoke() {
                                boolean zNeedsInput;
                                int i5 = i3;
                                Deflater deflater12 = deflater3;
                                switch (i5) {
                                    case 0:
                                        zNeedsInput = deflater12.needsInput();
                                        break;
                                    default:
                                        zNeedsInput = deflater12.finished();
                                        break;
                                }
                                return Boolean.valueOf(!zNeedsInput);
                            }
                        };
                        deflaterKt$deflateTo$1.L$0 = interfaceC50792;
                        deflaterKt$deflateTo$1.L$1 = interfaceC76802;
                        deflaterKt$deflateTo$1.L$2 = crc32;
                        deflaterKt$deflateTo$1.L$3 = deflater3;
                        deflaterKt$deflateTo$1.L$4 = byteBuffer5;
                        deflaterKt$deflateTo$1.L$5 = byteBuffer;
                        deflaterKt$deflateTo$1.L$6 = null;
                        deflaterKt$deflateTo$1.Z$0 = r0;
                        deflaterKt$deflateTo$1.label = 4;
                        if (m9181(interfaceC50792, deflater3, byteBuffer, interfaceC73722, deflaterKt$deflateTo$1) != coroutineSingletons) {
                            crc323 = crc32;
                            interfaceC50793 = interfaceC50792;
                            r02 = r0;
                            interfaceC76804 = interfaceC76802;
                            byteBuffer7 = byteBuffer5;
                            deflater4 = deflater3;
                            byteBuffer6 = byteBuffer;
                            if (r02 != 0) {
                            }
                            deflater4.end();
                            interfaceC76804.mo8893(byteBuffer7);
                            interfaceC76804.mo8893(byteBuffer6);
                            return C6008.f15084;
                        }
                    }
                }
            }
            return coroutineSingletons;
        }
        AbstractC6017.m10769(obj2);
        crc32 = new CRC32();
        deflater3 = new Deflater(-1, true);
        byteBuffer5 = (ByteBuffer) interfaceC7680.mo8894();
        byteBuffer = (ByteBuffer) interfaceC7680.mo8894();
        if (z == 0) {
            interfaceC50842 = interfaceC5084;
            interfaceC50792 = interfaceC5079;
            r0 = z;
            interfaceC76802 = interfaceC7680;
            if (interfaceC50842.mo9200()) {
            }
            return coroutineSingletons;
        }
        interfaceC50842 = interfaceC5084;
        try {
            deflaterKt$deflateTo$1.L$0 = interfaceC50842;
            deflaterKt$deflateTo$1.L$1 = interfaceC5079;
            interfaceC76803 = interfaceC7680;
            try {
                deflaterKt$deflateTo$1.L$2 = interfaceC76803;
                deflaterKt$deflateTo$1.L$3 = crc32;
                deflaterKt$deflateTo$1.L$4 = deflater3;
                deflaterKt$deflateTo$1.L$5 = byteBuffer5;
                deflaterKt$deflateTo$1.L$6 = byteBuffer;
                deflaterKt$deflateTo$1.Z$0 = z;
                deflaterKt$deflateTo$1.label = 1;
                if (m9195(interfaceC5079, deflaterKt$deflateTo$1) != coroutineSingletons) {
                    interfaceC50792 = interfaceC5079;
                    r0 = z;
                    interfaceC76802 = interfaceC76803;
                    byteBuffer11 = byteBuffer5;
                    deflater = deflater3;
                    byteBuffer = byteBuffer;
                    ByteBuffer byteBuffer142 = byteBuffer11;
                    deflater3 = deflater;
                    byteBuffer5 = byteBuffer142;
                    if (interfaceC50842.mo9200()) {
                    }
                }
                return coroutineSingletons;
            } catch (Throwable th7) {
                th = th7;
                byteBuffer4 = byteBuffer5;
                deflater2 = deflater3;
                byteBuffer3 = byteBuffer;
                r1 = interfaceC76803;
                r4 = byteBuffer4;
                r5 = deflater2;
                r6 = byteBuffer3;
            }
        } catch (Throwable th8) {
            th = th8;
            interfaceC76803 = interfaceC7680;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5036 m9186(boolean z) {
        return z ? new C5036(0) : new C5036(1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final char[] m9187(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = str.charAt(i);
        }
        return cArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (io.ktor.utils.p007io.AbstractC5078.m9247(r8, r9, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9188(InterfaceC5079 interfaceC5079, CRC32 crc32, Deflater deflater, ContinuationImpl continuationImpl) {
        DeflaterKt$putGzipTrailer$1 deflaterKt$putGzipTrailer$1;
        if (continuationImpl instanceof DeflaterKt$putGzipTrailer$1) {
            deflaterKt$putGzipTrailer$1 = (DeflaterKt$putGzipTrailer$1) continuationImpl;
            int i = deflaterKt$putGzipTrailer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deflaterKt$putGzipTrailer$1.label = i - Integer.MIN_VALUE;
            } else {
                deflaterKt$putGzipTrailer$1 = new DeflaterKt$putGzipTrailer$1(continuationImpl);
            }
        }
        Object obj = deflaterKt$putGzipTrailer$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = deflaterKt$putGzipTrailer$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            int iReverseBytes = Integer.reverseBytes((int) crc32.getValue());
            deflaterKt$putGzipTrailer$1.L$0 = interfaceC5079;
            deflaterKt$putGzipTrailer$1.L$1 = deflater;
            deflaterKt$putGzipTrailer$1.label = 1;
            if (AbstractC5078.m9247(interfaceC5079, iReverseBytes, deflaterKt$putGzipTrailer$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        deflater = (Deflater) deflaterKt$putGzipTrailer$1.L$1;
        interfaceC5079 = (InterfaceC5079) deflaterKt$putGzipTrailer$1.L$0;
        AbstractC6017.m10769(obj);
        int iReverseBytes2 = Integer.reverseBytes(deflater.getTotalIn());
        deflaterKt$putGzipTrailer$1.L$0 = null;
        deflaterKt$putGzipTrailer$1.L$1 = null;
        deflaterKt$putGzipTrailer$1.label = 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final void m9189(Checksum checksum, ByteBuffer byteBuffer) {
        checksum.getClass();
        byteBuffer.getClass();
        if (!byteBuffer.hasArray()) {
            C6755.m11869("buffer need to be array-backed");
            return;
        }
        checksum.update(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final String m9190(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            char cCharAt = str.charAt(i);
            if ((('A' > cCharAt || cCharAt >= '[') ? (cCharAt < 0 || cCharAt >= 128) ? Character.toLowerCase(cCharAt) : cCharAt : (char) (cCharAt + ' ')) != cCharAt) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append((CharSequence) str, 0, i);
        int length2 = str.length() - 1;
        if (i <= length2) {
            while (true) {
                char cCharAt2 = str.charAt(i);
                if ('A' <= cCharAt2 && cCharAt2 < '[') {
                    cCharAt2 = (char) (cCharAt2 + ' ');
                } else if (cCharAt2 < 0 || cCharAt2 >= 128) {
                    cCharAt2 = Character.toLowerCase(cCharAt2);
                }
                sb.append(cCharAt2);
                if (i == length2) {
                    break;
                }
                i++;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final String m9191(String str) {
        str.getClass();
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            char cCharAt = str.charAt(i);
            if ((('a' > cCharAt || cCharAt >= '{') ? (cCharAt < 0 || cCharAt >= 128) ? Character.toLowerCase(cCharAt) : cCharAt : (char) (cCharAt - ' ')) != cCharAt) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append((CharSequence) str, 0, i);
        int length2 = str.length() - 1;
        if (i <= length2) {
            while (true) {
                char cCharAt2 = str.charAt(i);
                if ('a' <= cCharAt2 && cCharAt2 < '{') {
                    cCharAt2 = (char) (cCharAt2 - ' ');
                } else if (cCharAt2 < 0 || cCharAt2 >= 128) {
                    cCharAt2 = Character.toLowerCase(cCharAt2);
                }
                sb.append(cCharAt2);
                if (i == length2) {
                    break;
                }
                i++;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final byte[] m9192(int i) {
        char[] cArr = AbstractC5048.f13049;
        C6309 c6309 = new C6309();
        while (((int) c6309.f15487) < i) {
            String str = (String) C6034.m10831(AbstractC5051.f13054.mo10814());
            if (str == null) {
                AbstractC5051.f13053.start();
                str = (String) AbstractC6231.m11044(EmptyCoroutineContext.INSTANCE, new CryptoKt__CryptoJvmKt$generateNonceBlocking$1(null));
            }
            AbstractC7684.m12645(c6309, str, 0, 14);
        }
        return AbstractC6310.m11191(c6309, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m9193(InterfaceC5046 interfaceC5046, InterfaceC7383 interfaceC7383) {
        for (Map.Entry entry : interfaceC5046.mo8912()) {
            interfaceC7383.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final void m9194(C5036 c5036, C5036 c50362) {
        c5036.getClass();
        c50362.getClass();
        for (C5041 c5041 : AbstractC5176.m9356(c50362.m9147().keySet())) {
            c5041.getClass();
            c5036.m9145(c5041, c50362.m9148(c5041));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (io.ktor.utils.p007io.AbstractC5078.m9248(r7, io.ktor.util.AbstractC5049.f13050, 0, 7, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9195(InterfaceC5079 interfaceC5079, ContinuationImpl continuationImpl) {
        DeflaterKt$putGzipHeader$1 deflaterKt$putGzipHeader$1;
        if (continuationImpl instanceof DeflaterKt$putGzipHeader$1) {
            deflaterKt$putGzipHeader$1 = (DeflaterKt$putGzipHeader$1) continuationImpl;
            int i = deflaterKt$putGzipHeader$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deflaterKt$putGzipHeader$1.label = i - Integer.MIN_VALUE;
            } else {
                deflaterKt$putGzipHeader$1 = new DeflaterKt$putGzipHeader$1(continuationImpl);
            }
        }
        Object obj = deflaterKt$putGzipHeader$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = deflaterKt$putGzipHeader$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            short sReverseBytes = Short.reverseBytes((short) -29921);
            deflaterKt$putGzipHeader$1.L$0 = interfaceC5079;
            deflaterKt$putGzipHeader$1.label = 1;
            if (AbstractC5078.m9253(interfaceC5079, sReverseBytes, deflaterKt$putGzipHeader$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            interfaceC5079 = (InterfaceC5079) deflaterKt$putGzipHeader$1.L$0;
            AbstractC6017.m10769(obj);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    AbstractC6017.m10769(obj);
                    return C6008.f15084;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC5079 = (InterfaceC5079) deflaterKt$putGzipHeader$1.L$0;
            AbstractC6017.m10769(obj);
            deflaterKt$putGzipHeader$1.L$0 = null;
            deflaterKt$putGzipHeader$1.label = 3;
        }
        deflaterKt$putGzipHeader$1.L$0 = interfaceC5079;
        deflaterKt$putGzipHeader$1.label = 2;
        if (AbstractC5078.m9249(interfaceC5079, (byte) 8, deflaterKt$putGzipHeader$1) != coroutineSingletons) {
            deflaterKt$putGzipHeader$1.L$0 = null;
            deflaterKt$putGzipHeader$1.label = 3;
        }
        return coroutineSingletons;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final String m9196(byte[] bArr) {
        char[] cArr = AbstractC5048.f13049;
        bArr.getClass();
        char[] cArr2 = new char[bArr.length * 2];
        char[] cArr3 = AbstractC5048.f13049;
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr3[(b & DefaultClassResolver.NAME) >> 4];
            i += 2;
            cArr2[i2] = cArr3[b & 15];
        }
        return new String(cArr2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final int m9197(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i) {
        byteBuffer.getClass();
        byteBuffer2.getClass();
        int iMin = Math.min(i, Math.min(byteBuffer.remaining(), byteBuffer2.remaining()));
        if (iMin == byteBuffer.remaining()) {
            byteBuffer2.put(byteBuffer);
            return iMin;
        }
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer2.put(byteBuffer);
        byteBuffer.limit(iLimit);
        return iMin;
    }
}

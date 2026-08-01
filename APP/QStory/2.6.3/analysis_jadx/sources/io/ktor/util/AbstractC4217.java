package io.ktor.util;

import com.bumptech.glide.AbstractC3057;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.zip.Checksum;
import kotlin.collections.AbstractC4344;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.io.AbstractC4381;
import kotlin.io.C4377;
import kotlin.text.AbstractC5144;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.channels.C5202;
import kotlinx.io.AbstractC5478;
import kotlinx.io.C5477;
import p052.InterfaceC6554;
import p058.AbstractC6855;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4217 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final byte[] f12705 = new byte[7];

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8622(io.ktor.utils.io.InterfaceC4247 r6, java.util.zip.Deflater r7, java.nio.ByteBuffer r8, p052.InterfaceC6543 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            boolean r0 = r10 instanceof io.ktor.util.DeflaterKt$deflateWhile$1
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.util.DeflaterKt$deflateWhile$1 r0 = (io.ktor.util.DeflaterKt$deflateWhile$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.util.DeflaterKt$deflateWhile$1 r0 = new io.ktor.util.DeflaterKt$deflateWhile$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3d
            java.lang.Object r6 = r0.L$3
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r6 = (p052.InterfaceC6543) r6
            java.lang.Object r7 = r0.L$2
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            java.lang.Object r8 = r0.L$1
            java.util.zip.Deflater r8 = (java.util.zip.Deflater) r8
            java.lang.Object r9 = r0.L$0
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r9 = (io.ktor.utils.io.InterfaceC4247) r9
            kotlin.AbstractC5185.m10210(r10)
            r5 = r9
            r9 = r6
            r6 = r5
            r5 = r8
            r8 = r7
            r7 = r5
            goto L47
        L3d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            r6 = 0
            return r6
        L44:
            kotlin.AbstractC5185.m10210(r10)
        L47:
            java.lang.Object r10 = r9.invoke()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L8d
            r8.clear()
            boolean r10 = r8.hasRemaining()
            if (r10 == 0) goto L79
            byte[] r10 = r8.array()
            int r2 = r8.arrayOffset()
            int r4 = r8.position()
            int r4 = r4 + r2
            int r2 = r8.remaining()
            int r10 = r7.deflate(r10, r4, r2)
            int r2 = r8.position()
            int r2 = r2 + r10
            r8.position(r2)
        L79:
            r8.flip()
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.L$3 = r9
            r0.label = r3
            java.lang.Object r10 = io.ktor.utils.io.AbstractC4244.m8657(r6, r8, r0)
            if (r10 != r1) goto L47
            return r1
        L8d:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.AbstractC4217.m8622(io.ktor.utils.io.飘花落叶言子楪哲苏世兰, java.util.zip.Deflater, java.nio.ByteBuffer, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final File m8623(File file, String str) {
        String strSubstring;
        file.getClass();
        File file2 = new File(str);
        File fileM8871 = AbstractC4381.m8871(file2);
        String path = fileM8871.getPath();
        path.getClass();
        boolean zEquals = false;
        if (AbstractC3057.m6752(path) > 0) {
            File file3 = fileM8871;
            while (true) {
                File parentFile = file3.getParentFile();
                if (parentFile == null) {
                    break;
                }
                file3 = parentFile;
            }
            String path2 = fileM8871.getPath();
            path2.getClass();
            String strM10162 = AbstractC5144.m10162(file3.getName().length(), path2);
            int length = strM10162.length();
            int i = 0;
            while (true) {
                if (i < length) {
                    char cCharAt = strM10162.charAt(i);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        strSubstring = strM10162.substring(i);
                        break;
                    }
                    i++;
                } else {
                    strSubstring = "";
                    break;
                }
            }
            fileM8871 = new File(strSubstring);
        }
        String path3 = fileM8871.getPath();
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
            if (i2 >= fileM8871.getPath().length()) {
                fileM8871 = new File(".");
            } else {
                String path4 = fileM8871.getPath();
                path4.getClass();
                fileM8871 = new File(path4.substring(i2));
            }
        }
        File file4 = new File("..");
        C4377 c4377M6734 = AbstractC3057.m6734(fileM8871);
        List list = c4377M6734.f12954;
        C4377 c4377M67342 = AbstractC3057.m6734(file4);
        List list2 = c4377M67342.f12954;
        if (c4377M6734.f12955.equals(c4377M67342.f12955) && list.size() >= list2.size()) {
            zEquals = list.subList(0, list2.size()).equals(list2);
        }
        if (zEquals) {
            C4211.m8604(file2, "Bad relative path ");
            return null;
        }
        if (!fileM8871.isAbsolute()) {
            return new File(file, fileM8871.getPath());
        }
        C4211.m8615(file2, "Bad relative path ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m8624(InterfaceC4215 interfaceC4215, InterfaceC4215 interfaceC42152) {
        interfaceC4215.getClass();
        interfaceC42152.getClass();
        for (Map.Entry entry : interfaceC42152.mo2418()) {
            interfaceC4215.mo2409((String) entry.getKey(), (List) entry.getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8625(java.util.zip.Inflater r5, io.ktor.utils.io.InterfaceC4247 r6, java.nio.ByteBuffer r7, java.util.zip.CRC32 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.util.zip.DataFormatException {
        /*
            boolean r0 = r9 instanceof io.ktor.util.EncodersJvmKt$inflateTo$1
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.util.EncodersJvmKt$inflateTo$1 r0 = (io.ktor.util.EncodersJvmKt$inflateTo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.util.EncodersJvmKt$inflateTo$1 r0 = new io.ktor.util.EncodersJvmKt$inflateTo$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            int r5 = r0.I$0
            kotlin.AbstractC5185.m10210(r9)
            goto L5f
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            r5 = 0
            return r5
        L30:
            kotlin.AbstractC5185.m10210(r9)
            r7.clear()
            byte[] r9 = r7.array()
            int r2 = r7.position()
            int r4 = r7.remaining()
            int r5 = r5.inflate(r9, r2, r4)
            int r9 = r7.position()
            int r9 = r9 + r5
            r7.position(r9)
            r7.flip()
            m8630(r8, r7)
            r0.I$0 = r5
            r0.label = r3
            java.lang.Object r6 = io.ktor.utils.io.AbstractC4244.m8657(r6, r7, r0)
            if (r6 != r1) goto L5f
            return r1
        L5f:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.AbstractC4217.m8625(java.util.zip.Inflater, io.ktor.utils.io.飘花落叶言子楪哲苏世兰, java.nio.ByteBuffer, java.util.zip.CRC32, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8626(io.ktor.utils.io.InterfaceC4252 r19, io.ktor.utils.io.InterfaceC4247 r20, boolean r21, p057.InterfaceC6851 r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.AbstractC4217.m8626(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, io.ktor.utils.io.飘花落叶言子楪哲苏世兰, boolean, 飘花落叶言世子楪哲兰苏.飘花落叶言子楪世哲兰苏, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4204 m8627(boolean z) {
        return z ? new C4204(0) : new C4204(1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final char[] m8628(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = str.charAt(i);
        }
        return cArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (io.ktor.utils.io.AbstractC4246.m8688(r8, r9, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8629(io.ktor.utils.io.InterfaceC4247 r8, java.util.zip.CRC32 r9, java.util.zip.Deflater r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            boolean r0 = r11 instanceof io.ktor.util.DeflaterKt$putGzipTrailer$1
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.util.DeflaterKt$putGzipTrailer$1 r0 = (io.ktor.util.DeflaterKt$putGzipTrailer$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.util.DeflaterKt$putGzipTrailer$1 r0 = new io.ktor.util.DeflaterKt$putGzipTrailer$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            kotlin.AbstractC5185.m10210(r11)
            goto L6c
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r8)
            return r3
        L31:
            java.lang.Object r8 = r0.L$1
            r10 = r8
            java.util.zip.Deflater r10 = (java.util.zip.Deflater) r10
            java.lang.Object r8 = r0.L$0
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r8 = (io.ktor.utils.io.InterfaceC4247) r8
            kotlin.AbstractC5185.m10210(r11)
            goto L57
        L3e:
            kotlin.AbstractC5185.m10210(r11)
            long r6 = r9.getValue()
            int r9 = (int) r6
            int r9 = java.lang.Integer.reverseBytes(r9)
            r0.L$0 = r8
            r0.L$1 = r10
            r0.label = r5
            java.lang.Object r9 = io.ktor.utils.io.AbstractC4246.m8688(r8, r9, r0)
            if (r9 != r1) goto L57
            goto L6b
        L57:
            int r9 = r10.getTotalIn()
            int r9 = java.lang.Integer.reverseBytes(r9)
            r0.L$0 = r3
            r0.L$1 = r3
            r0.label = r4
            java.lang.Object r8 = io.ktor.utils.io.AbstractC4246.m8688(r8, r9, r0)
            if (r8 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.飘花落叶言子楪兰苏哲世 r8 = kotlin.C5176.f14739
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.AbstractC4217.m8629(io.ktor.utils.io.飘花落叶言子楪哲苏世兰, java.util.zip.CRC32, java.util.zip.Deflater, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final void m8630(Checksum checksum, ByteBuffer byteBuffer) {
        checksum.getClass();
        byteBuffer.getClass();
        if (!byteBuffer.hasArray()) {
            C5925.m11310("buffer need to be array-backed");
            return;
        }
        checksum.update(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final String m8631(String str) {
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
    public static final String m8632(String str) {
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
    public static final byte[] m8633(int i) {
        char[] cArr = AbstractC4216.f12704;
        C5477 c5477 = new C5477();
        while (((int) c5477.f15142) < i) {
            String str = (String) C5202.m10272(AbstractC4219.f12709.mo10255());
            if (str == null) {
                AbstractC4219.f12708.start();
                str = (String) AbstractC5399.m10485(EmptyCoroutineContext.INSTANCE, new CryptoKt__CryptoJvmKt$generateNonceBlocking$1(null));
            }
            AbstractC6855.m12086(c5477, str, 0, 14);
        }
        return AbstractC5478.m10632(c5477, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m8634(InterfaceC4214 interfaceC4214, InterfaceC6554 interfaceC6554) {
        for (Map.Entry entry : interfaceC4214.mo8353()) {
            interfaceC6554.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final void m8635(C4204 c4204, C4204 c42042) {
        c4204.getClass();
        c42042.getClass();
        for (C4209 c4209 : AbstractC4344.m8797(c42042.m8588().keySet())) {
            c4209.getClass();
            c4204.m8586(c4209, c42042.m8589(c4209));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (io.ktor.utils.io.AbstractC4246.m8689(r7, io.ktor.util.AbstractC4217.f12705, 0, 7, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8636(io.ktor.utils.io.InterfaceC4247 r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.util.DeflaterKt$putGzipHeader$1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.util.DeflaterKt$putGzipHeader$1 r0 = (io.ktor.util.DeflaterKt$putGzipHeader$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.util.DeflaterKt$putGzipHeader$1 r0 = new io.ktor.util.DeflaterKt$putGzipHeader$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L44
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2e
            kotlin.AbstractC5185.m10210(r8)
            goto L74
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            return r3
        L34:
            java.lang.Object r7 = r0.L$0
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r7 = (io.ktor.utils.io.InterfaceC4247) r7
            kotlin.AbstractC5185.m10210(r8)
            goto L65
        L3c:
            java.lang.Object r7 = r0.L$0
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r7 = (io.ktor.utils.io.InterfaceC4247) r7
            kotlin.AbstractC5185.m10210(r8)
            goto L58
        L44:
            kotlin.AbstractC5185.m10210(r8)
            r8 = -29921(0xffffffffffff8b1f, float:NaN)
            short r8 = java.lang.Short.reverseBytes(r8)
            r0.L$0 = r7
            r0.label = r6
            java.lang.Object r8 = io.ktor.utils.io.AbstractC4246.m8694(r7, r8, r0)
            if (r8 != r1) goto L58
            goto L73
        L58:
            r0.L$0 = r7
            r0.label = r5
            r8 = 8
            java.lang.Object r8 = io.ktor.utils.io.AbstractC4246.m8690(r7, r8, r0)
            if (r8 != r1) goto L65
            goto L73
        L65:
            r0.L$0 = r3
            r0.label = r4
            r8 = 0
            r2 = 7
            byte[] r3 = io.ktor.util.AbstractC4217.f12705
            java.lang.Object r7 = io.ktor.utils.io.AbstractC4246.m8689(r7, r3, r8, r2, r0)
            if (r7 != r1) goto L74
        L73:
            return r1
        L74:
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5176.f14739
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.AbstractC4217.m8636(io.ktor.utils.io.飘花落叶言子楪哲苏世兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final String m8637(byte[] bArr) {
        char[] cArr = AbstractC4216.f12704;
        bArr.getClass();
        char[] cArr2 = new char[bArr.length * 2];
        char[] cArr3 = AbstractC4216.f12704;
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
    public static final int m8638(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i) {
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

package io.ktor.http.cio;

import io.ktor.utils.io.AbstractC4244;
import io.ktor.utils.io.C4230;
import io.ktor.utils.io.C4249;
import io.ktor.utils.io.InterfaceC4247;
import java.nio.charset.Charset;
import kotlin.coroutines.InterfaceC4360;
import kotlin.text.AbstractC5132;
import kotlinx.coroutines.C5467;
import p058.AbstractC6855;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3957 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f12182;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final byte[] f12183;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C3958 f12184 = new C3958(2048, 0);

    static {
        Charset charset = AbstractC5132.f14688;
        f12183 = AbstractC6855.m12084("\r\n", charset);
        f12182 = AbstractC6855.m12084("0\r\n\r\n", charset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
    
        if (r1.mo8643().mo10604() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ac, code lost:
    
        r11.L$0 = r3;
        r11.L$1 = r1;
        r11.L$2 = r1;
        r11.L$3 = null;
        r11.L$4 = null;
        r11.L$5 = null;
        r11.label = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00be, code lost:
    
        if (r1.mo8642(r9, r11) != r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c2, code lost:
    
        r12 = r3;
        r3 = r1;
        r1 = r11;
        r11 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
    
        r12 = r11;
        r11 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a7, code lost:
    
        if (((io.ktor.utils.io.C4249) r4).m8700(r1) == r2) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c A[Catch: all -> 0x00cd, TryCatch #6 {all -> 0x00cd, blocks: (B:35:0x0096, B:37:0x009c, B:39:0x00a2, B:41:0x00ac, B:80:0x0170, B:82:0x0174, B:85:0x017f, B:94:0x01ad), top: B:114:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db A[Catch: all -> 0x0162, TryCatch #0 {all -> 0x0162, blocks: (B:49:0x00d5, B:51:0x00db, B:53:0x00ee, B:55:0x00fb, B:57:0x010a, B:77:0x0164, B:78:0x016b), top: B:103:0x00d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00fb -> B:113:0x0130). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0120 -> B:61:0x0129). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x016c -> B:114:0x0096). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8342(io.ktor.utils.io.InterfaceC4252 r17, io.ktor.utils.io.InterfaceC4247 r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.AbstractC3957.m8342(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, io.ktor.utils.io.飘花落叶言子楪哲苏世兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4230 m8343(InterfaceC4247 interfaceC4247, InterfaceC4360 interfaceC4360) {
        interfaceC4247.getClass();
        interfaceC4360.getClass();
        ChunkedTransferEncodingKt$encodeChunked$1 chunkedTransferEncodingKt$encodeChunked$1 = new ChunkedTransferEncodingKt$encodeChunked$1(interfaceC4247, null);
        return AbstractC4244.m8660(C5467.f15126, interfaceC4360, new C4249(false), chunkedTransferEncodingKt$encodeChunked$1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x017e, code lost:
    
        if (((io.ktor.utils.io.C4249) r1).m8704(r3) == r2) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da A[Catch: all -> 0x0057, TryCatch #2 {all -> 0x0057, blocks: (B:15:0x004f, B:33:0x00d2, B:35:0x00da, B:37:0x00e0, B:39:0x00e6, B:45:0x00f9, B:49:0x0113, B:53:0x012c, B:55:0x0138, B:42:0x00f1, B:77:0x01b2, B:78:0x01b9, B:79:0x01ba, B:80:0x01c1, B:20:0x006d, B:23:0x0085, B:26:0x009b), top: B:94:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0162 A[Catch: all -> 0x0191, TRY_LEAVE, TryCatch #0 {all -> 0x0191, blocks: (B:59:0x015a, B:61:0x0162, B:71:0x0189, B:72:0x0190, B:75:0x0196, B:76:0x01b1), top: B:91:0x015a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0196 A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:59:0x015a, B:61:0x0162, B:71:0x0189, B:72:0x0190, B:75:0x0196, B:76:0x01b1), top: B:91:0x015a }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ba A[Catch: all -> 0x0057, TryCatch #2 {all -> 0x0057, blocks: (B:15:0x004f, B:33:0x00d2, B:35:0x00da, B:37:0x00e0, B:39:0x00e6, B:45:0x00f9, B:49:0x0113, B:53:0x012c, B:55:0x0138, B:42:0x00f1, B:77:0x01b2, B:78:0x01b9, B:79:0x01ba, B:80:0x01c1, B:20:0x006d, B:23:0x0085, B:26:0x009b), top: B:94:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0153 -> B:16:0x0052). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8344(io.ktor.utils.io.InterfaceC4252 r20, io.ktor.utils.io.InterfaceC4247 r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.AbstractC3957.m8344(io.ktor.utils.io.飘花落叶言子楪苏兰哲世, io.ktor.utils.io.飘花落叶言子楪哲苏世兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00da, code lost:
    
        if (((io.ktor.utils.io.C4249) r10).m8700(r0) != r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce A[PHI: r9 r10
  0x00ce: PHI (r9v5 int) = (r9v4 int), (r9v11 int) binds: [B:34:0x00cb, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x00ce: PHI (r10v7 io.ktor.utils.io.飘花落叶言子楪哲苏世兰) = (r10v6 io.ktor.utils.io.飘花落叶言子楪哲苏世兰), (r10v17 io.ktor.utils.io.飘花落叶言子楪哲苏世兰) binds: [B:34:0x00cb, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8345(io.ktor.utils.io.InterfaceC4247 r9, byte[] r10, int r11, int r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.AbstractC3957.m8345(io.ktor.utils.io.飘花落叶言子楪哲苏世兰, byte[], int, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

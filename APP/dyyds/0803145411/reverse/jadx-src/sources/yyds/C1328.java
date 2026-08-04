package yyds;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: yyds.ᛶᛵᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1328 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public byte[] f6095;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public InputStream f6096;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public OutputStream f6097;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public Object f6098;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public final /* synthetic */ C2143 f6099;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public /* synthetic */ Object f6100;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public boolean f6101;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public long f6102;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final /* synthetic */ String f6103;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public long f6104;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public C0837 f6105;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final /* synthetic */ Context f6106;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final /* synthetic */ String f6107;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public File f6108;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public File f6109;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public Object f6110;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public int f6111;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public long f6112;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0477 f6113;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1328(String str, Context context, String str2, C2143 c2143, InterfaceC0477 interfaceC0477, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f6107 = str;
        this.f6106 = context;
        this.f6103 = str2;
        this.f6099 = c2143;
        this.f6113 = interfaceC0477;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0308, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x030b, code lost:
    
        r0 = yyds.C1221.f5600;
        r3 = r29.f6106;
        r0.getClass();
        yyds.C1221.m2481(r3, r12, r2);
        r3 = new yyds.C1014(false, yyds.AbstractC2328.m4341(-738695293076334L), null, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0327, code lost:
    
        if (r11 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0329, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x032d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x032e, code lost:
    
        yyds.C2336.f11496.m4355(yyds.AbstractC2328.m4341(-738755422618478L), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x035d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x035e, code lost:
    
        r3 = r12;
        r7 = r14;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0361, code lost:
    
        r12 = r4;
        r4 = r2;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0365, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0366, code lost:
    
        r3 = r12;
        r7 = r14;
        r8 = null;
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x036a, code lost:
    
        r12 = r4;
        r4 = r2;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x039b, code lost:
    
        r2 = r29.f6113;
        r3 = new yyds.C2280(r5, r7);
        r29.f6100 = r0;
        r29.f6105 = r4;
        r29.f6096 = r11;
        r29.f6098 = r15;
        r29.f6110 = r14;
        r29.f6108 = r13;
        r29.f6109 = r12;
        r29.f6097 = r9;
        r29.f6095 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03b6, code lost:
    
        r22 = r9;
        r9 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03ba, code lost:
    
        r29.f6101 = r9;
        r29.f6112 = r7;
        r29.f6104 = r5;
        r29.f6102 = r2;
        r29.f6111 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x03cb, code lost:
    
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x03cc, code lost:
    
        r2 = r2.mo511(r3, r29);
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03d2, code lost:
    
        if (r2 != r3) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03d6, code lost:
    
        r16 = r5;
        r2 = r9;
        r5 = r2;
        r9 = r22;
        r17 = r5;
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03e3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03e4, code lost:
    
        r2 = r0;
        r12 = r4;
        r10 = r5;
        r7 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x03ea, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x03f0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03f1, code lost:
    
        r2 = r0;
        r10 = r5;
        r3 = r12;
        r7 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x03fa, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03fd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x03fe, code lost:
    
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0420, code lost:
    
        r22 = r9;
        r5 = r15;
        r9 = r2;
        r22.flush();
        r22.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x042a, code lost:
    
        yyds.AbstractC0024.m3304(mo733());
        r2 = r29.f6113;
        r21 = r3;
        r2 = r17;
        r5 = new yyds.C2280(r2, r7);
        r29.f6100 = r0;
        r29.f6105 = r4;
        r29.f6096 = r11;
        r29.f6098 = r14;
        r29.f6110 = r13;
        r29.f6108 = r12;
        r29.f6109 = null;
        r29.f6097 = null;
        r29.f6095 = null;
        r29.f6101 = r9;
        r29.f6112 = r7;
        r29.f6104 = r2;
        r29.f6102 = r19;
        r29.f6111 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0461, code lost:
    
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0463, code lost:
    
        if (r2.mo511(r5, r29) != r3) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0466, code lost:
    
        r2 = r9;
        r3 = r12;
        r7 = r14;
        r12 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0523, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0524, code lost:
    
        r2 = r0;
        r3 = r12;
        r7 = r14;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x052a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x052b, code lost:
    
        r2 = r0;
        r3 = r12;
        r7 = r14;
        r8 = null;
        r10 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:399:0x0270, B:374:0x02a4], limit reached: 395 */
    /* JADX WARN: Path cross not found for [B:4:0x0010, B:43:0x00f4], limit reached: 395 */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x037d A[Catch: all -> 0x03f7, Exception -> 0x041a, CancellationException -> 0x041d, TRY_ENTER, TryCatch #51 {all -> 0x03f7, blocks: (B:118:0x02f9, B:148:0x037d, B:150:0x0384, B:152:0x038f, B:154:0x039b, B:156:0x03ba), top: B:363:0x02f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05d1 A[Catch: all -> 0x0532, TryCatch #9 {all -> 0x0532, blocks: (B:277:0x05ac, B:282:0x05c1, B:284:0x05d1, B:286:0x05e5, B:280:0x05b1, B:108:0x02ab, B:110:0x02b7, B:112:0x02c8), top: B:336:0x000e, inners: #37 }] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x05e5 A[Catch: all -> 0x0532, TRY_LEAVE, TryCatch #9 {all -> 0x0532, blocks: (B:277:0x05ac, B:282:0x05c1, B:284:0x05d1, B:286:0x05e5, B:280:0x05b1, B:108:0x02ab, B:110:0x02b7, B:112:0x02c8), top: B:336:0x000e, inners: #37 }] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0656 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0675 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x06ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x062c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x05ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0697 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x06c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0641 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0308 A[EDGE_INSN: B:408:0x0308->B:120:0x0308 BREAK  A[LOOP:0: B:363:0x02f9->B:179:0x0408], EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v105, types: [yyds.ᲀᲈᲁᛷ] */
    /* JADX WARN: Type inference failed for: r0v8, types: [yyds.ᲀᲈᲁᛷ] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4, types: [yyds.ᲈᲀᛱᛷ] */
    /* JADX WARN: Type inference failed for: r7v40, types: [yyds.ᲈᲀᛱᛷ] */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v66 */
    /* JADX WARN: Type inference failed for: r7v67 */
    /* JADX WARN: Type inference failed for: r7v68 */
    /* JADX WARN: Type inference failed for: r7v69 */
    /* JADX WARN: Type inference failed for: r7v70 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r7v73 */
    /* JADX WARN: Type inference failed for: r7v74 */
    /* JADX WARN: Type inference failed for: r7v76 */
    /* JADX WARN: Type inference failed for: r7v77 */
    /* JADX WARN: Type inference failed for: r7v78 */
    /* JADX WARN: Type inference failed for: r7v79 */
    /* JADX WARN: Type inference failed for: r7v80 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x03d6 -> B:162:0x03df). Please report as a decompilation issue!!! */
    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo474(Object obj) throws Throwable {
        Throwable th;
        C0837 c0837M4863;
        InputStream inputStreamM1079;
        ?? r7;
        File file;
        File fileM2485;
        boolean z;
        C2729 c2729;
        Exception exc;
        Object obj2;
        CancellationException cancellationException;
        OutputStream outputStreamM2103;
        C2729 c27292;
        C2729 c27293;
        File file2;
        byte[] bArr;
        InterfaceC0477 interfaceC0477;
        C2280 c2280;
        File file3;
        EnumC1765 enumC1765;
        OutputStream outputStream;
        C2729 c27294;
        long j;
        long j2;
        boolean z2;
        C0837 c0837;
        File file4;
        long j3;
        OutputStream outputStream2;
        C1014 c1014;
        C2336 c2336;
        long j4;
        OutputStream outputStream3;
        boolean z3;
        long j5;
        long j6;
        C2729 c27295;
        C2729 c27296;
        C2729 c27297;
        C2729 c27298;
        long j7;
        C1014 c10142;
        long j8;
        boolean z4;
        EnumC1765 enumC17652;
        C1014 c10143;
        C1014 c10144;
        C2336 c23362;
        long j9;
        ?? r72;
        ?? r73;
        Object objM3200;
        C1014 c10145;
        InterfaceC0990 interfaceC0990 = (InterfaceC0990) this.f6100;
        EnumC1765 enumC17653 = EnumC1765.f8858;
        int i = this.f6111;
        ?? r74 = 3;
        ?? r75 = 3;
        ?? r76 = 3;
        OutputStream outputStream4 = null;
        try {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    outputStream4 = outputStreamM2103;
                    r7 = r74;
                }
            } catch (Throwable th3) {
                th = th3;
                r7 = r76;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        if (i == 0) {
            AbstractC1544.m3189(obj);
            file = new File(this.f6107);
            C1221.f5600.getClass();
            fileM2485 = C1221.m2485(file);
            C0967 c0967 = C0967.f4447;
            String absolutePath = file.getAbsolutePath();
            AbstractC2328.m4341(-738076817785710L);
            c0967.getClass();
            AbstractC2328.m4341(-681250105492334L);
            z = C0967.m2107(absolutePath) != null;
            if (!z) {
                try {
                    File parentFile = file.getParentFile();
                    if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                        return new C1014(false, AbstractC2328.m4341(-738167012098926L) + parentFile.getAbsolutePath(), null, 10);
                    }
                } catch (Exception e) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-738205666804590L), e);
                    return new C1014(false, AbstractC2328.m4341(-738235731575662L) + e.getMessage(), null, 10);
                }
            }
            try {
                try {
                    try {
                        try {
                            AbstractC0024.m3304(mo733());
                            try {
                                C2615.f12860.getClass();
                            } catch (CancellationException e2) {
                                e = e2;
                                file2 = fileM2485;
                            } catch (Exception e3) {
                                e = e3;
                                file2 = fileM2485;
                            }
                        } catch (CancellationException e4) {
                            cancellationException = e4;
                        }
                    } catch (CancellationException e5) {
                        obj2 = null;
                        cancellationException = e5;
                        r76 = 0;
                        outputStream4 = null;
                        inputStreamM1079 = null;
                        c0837M4863 = null;
                    }
                } catch (Exception e6) {
                    exc = e6;
                }
            } catch (Throwable th5) {
                th = th5;
                c2729 = null;
            }
            if (!C2615.m4715().equals(AbstractC2328.m4341(-697433542263662L))) {
                C2701 c2701 = C2701.f13261;
                Context context = this.f6106;
                c2701.getClass();
                C2701.m4807(context);
                C1633 c1633 = new C1633();
                c1633.m3334(this.f6103);
                C2098 c2098 = new C2098(c1633);
                C1327 c1327 = C1327.f6093;
                C2729 c2729M2559 = C1327.m2619().m2559(c2098);
                try {
                    this.f6099.m4090(c2729M2559);
                    c0837M4863 = c2729M2559.m4863();
                    try {
                        try {
                            AbstractC0024.m3304(mo733());
                        } catch (Throwable th6) {
                            th = th6;
                            outputStream4 = null;
                            inputStreamM1079 = null;
                            r7 = c2729M2559;
                        }
                    } catch (CancellationException e7) {
                        e = e7;
                    } catch (Exception e8) {
                        e = e8;
                    }
                    try {
                    } catch (CancellationException e9) {
                        e = e9;
                        cancellationException = e;
                        obj2 = null;
                        outputStream4 = null;
                        inputStreamM1079 = null;
                        r76 = c2729M2559;
                    } catch (Exception e10) {
                        e = e10;
                        exc = e;
                        outputStreamM2103 = null;
                        inputStreamM1079 = null;
                        r74 = c2729M2559;
                    }
                } catch (CancellationException e11) {
                    cancellationException = e11;
                    c27293 = c2729M2559;
                    obj2 = null;
                    outputStream4 = null;
                    inputStreamM1079 = null;
                    c0837M4863 = null;
                    r76 = c27293;
                } catch (Exception e12) {
                    exc = e12;
                    outputStreamM2103 = null;
                    c27292 = c2729M2559;
                    inputStreamM1079 = null;
                    c0837M4863 = null;
                    r74 = c27292;
                } catch (Throwable th7) {
                    th = th7;
                    c2729 = c2729M2559;
                    outputStream4 = null;
                    inputStreamM1079 = null;
                    c0837M4863 = null;
                    r7 = c2729;
                }
                if (!this.f6099.f10583) {
                    if (c0837M4863.f3852) {
                        AbstractC0379 abstractC0379 = c0837M4863.f3849;
                        long jMo909 = abstractC0379.mo909();
                        inputStreamM1079 = abstractC0379.m1079();
                        if (z) {
                            try {
                                Context context2 = this.f6106;
                                String absolutePath2 = fileM2485.getAbsolutePath();
                                AbstractC2328.m4341(-738557854122862L);
                                outputStreamM2103 = C0967.m2103(context2, absolutePath2);
                            } catch (CancellationException e13) {
                                e = e13;
                                cancellationException = e;
                                obj2 = null;
                                outputStream4 = null;
                                r76 = c2729M2559;
                                this.f6099.m4091();
                                if (outputStream4 != null) {
                                }
                                C1221 c1221 = C1221.f5600;
                                Context context3 = this.f6106;
                                c1221.getClass();
                                C1221.m2481(context3, fileM2485, z);
                                throw cancellationException;
                            } catch (Exception e14) {
                                e = e14;
                                exc = e;
                                outputStreamM2103 = null;
                                r74 = c2729M2559;
                            }
                            if (outputStreamM2103 == null) {
                                throw new IllegalStateException(AbstractC2328.m4341(-738648048436078L));
                            }
                            try {
                                bArr = new byte[65536];
                                interfaceC0477 = this.f6113;
                                try {
                                    c2280 = new C2280(0L, jMo909);
                                    this.f6100 = interfaceC0990;
                                    this.f6105 = c0837M4863;
                                    this.f6096 = inputStreamM1079;
                                    this.f6098 = outputStreamM2103;
                                    this.f6110 = c2729M2559;
                                    this.f6108 = file;
                                    file3 = fileM2485;
                                    try {
                                        this.f6109 = file3;
                                        this.f6097 = outputStreamM2103;
                                        this.f6095 = bArr;
                                        this.f6101 = z;
                                        this.f6112 = jMo909;
                                        this.f6104 = 0L;
                                        this.f6102 = 0L;
                                        this.f6111 = 1;
                                        enumC1765 = enumC17653;
                                    } catch (CancellationException e15) {
                                        e = e15;
                                        cancellationException = e;
                                        outputStream4 = outputStreamM2103;
                                        fileM2485 = file3;
                                        c27295 = c2729M2559;
                                        obj2 = null;
                                        r76 = c27295;
                                        this.f6099.m4091();
                                        if (outputStream4 != null) {
                                        }
                                        C1221 c12212 = C1221.f5600;
                                        Context context32 = this.f6106;
                                        c12212.getClass();
                                        C1221.m2481(context32, fileM2485, z);
                                        throw cancellationException;
                                    } catch (Exception e16) {
                                        e = e16;
                                        exc = e;
                                        fileM2485 = file3;
                                        r74 = c2729M2559;
                                        if (outputStreamM2103 != null) {
                                        }
                                    }
                                } catch (CancellationException e17) {
                                    e = e17;
                                    file3 = fileM2485;
                                } catch (Exception e18) {
                                    e = e18;
                                    file3 = fileM2485;
                                }
                            } catch (CancellationException e19) {
                                cancellationException = e19;
                                outputStream4 = outputStreamM2103;
                                c27295 = c2729M2559;
                            } catch (Exception e20) {
                                e = e20;
                                r72 = c2729M2559;
                                exc = e;
                                r74 = r72;
                                if (outputStreamM2103 != null) {
                                }
                                this.f6099.m4092(r74);
                                return c10144;
                            }
                            if (interfaceC0477.mo511(c2280, this) != enumC1765) {
                                outputStream = outputStreamM2103;
                                c27294 = c2729M2559;
                                j = jMo909;
                                j2 = 0;
                                z2 = z;
                                c0837 = c0837M4863;
                                file4 = file3;
                                j3 = 0;
                                outputStream2 = outputStream;
                                boolean z5 = z2;
                                outputStream3 = outputStream;
                                z3 = z5;
                                long j10 = j2;
                                j5 = j3;
                                j6 = j10;
                                c27298 = c27294;
                                while (true) {
                                    AbstractC0024.m3304(mo733());
                                    j7 = j6;
                                    if (!this.f6099.f10583) {
                                    }
                                    z3 = z4;
                                    j6 = j7;
                                    enumC1765 = enumC17652;
                                    outputStream3 = outputStream3;
                                    j5 = j8;
                                }
                                outputStreamM2103 = outputStream2;
                                exc = e;
                                fileM2485 = file4;
                                c27297 = c27298;
                                c0837M4863 = c0837;
                                z = z2;
                                r74 = c27297;
                                if (outputStreamM2103 != null) {
                                }
                                this.f6099.m4092(r74);
                                return c10144;
                            }
                            return enumC1765;
                            if (outputStream4 != null) {
                                try {
                                    outputStream4.close();
                                } catch (Exception e21) {
                                    C2336.f11496.m4355(AbstractC2328.m4341(-739253638824814L), e21);
                                }
                            }
                            if (inputStreamM1079 != null) {
                                try {
                                    inputStreamM1079.close();
                                } catch (Exception e22) {
                                    C2336.f11496.m4355(AbstractC2328.m4341(-739287998563182L), e22);
                                }
                            }
                            if (c0837M4863 != null) {
                                try {
                                    c0837M4863.close();
                                } catch (Exception e23) {
                                    C2336.f11496.m4355(AbstractC2328.m4341(-739322358301550L), e23);
                                }
                            }
                            this.f6099.m4092(r7);
                            throw th;
                        }
                        try {
                            outputStreamM2103 = new FileOutputStream(fileM2485);
                            bArr = new byte[65536];
                            interfaceC0477 = this.f6113;
                            c2280 = new C2280(0L, jMo909);
                            this.f6100 = interfaceC0990;
                            this.f6105 = c0837M4863;
                            this.f6096 = inputStreamM1079;
                            this.f6098 = outputStreamM2103;
                            this.f6110 = c2729M2559;
                            this.f6108 = file;
                            file3 = fileM2485;
                            this.f6109 = file3;
                            this.f6097 = outputStreamM2103;
                            this.f6095 = bArr;
                            this.f6101 = z;
                            this.f6112 = jMo909;
                            this.f6104 = 0L;
                            this.f6102 = 0L;
                            this.f6111 = 1;
                            enumC1765 = enumC17653;
                            if (interfaceC0477.mo511(c2280, this) != enumC1765) {
                            }
                            return enumC1765;
                        } catch (CancellationException e24) {
                            e = e24;
                            cancellationException = e;
                            obj2 = null;
                            outputStream4 = null;
                            r76 = c2729M2559;
                            this.f6099.m4091();
                            if (outputStream4 != null) {
                            }
                            C1221 c122122 = C1221.f5600;
                            Context context322 = this.f6106;
                            c122122.getClass();
                            C1221.m2481(context322, fileM2485, z);
                            throw cancellationException;
                        } catch (Exception e25) {
                            e = e25;
                            exc = e;
                            outputStreamM2103 = null;
                            r74 = c2729M2559;
                        }
                    } else {
                        c1014 = new C1014(false, AbstractC2328.m4341(-738429005103982L) + c0837M4863.f3860, null, 10);
                        try {
                            c0837M4863.close();
                        } catch (Exception e26) {
                            e = e26;
                            c2336 = C2336.f11496;
                            j4 = -738527789351790L;
                            c2336.m4355(AbstractC2328.m4341(j4), e);
                        }
                    }
                    cancellationException = e;
                    obj2 = null;
                    outputStream4 = null;
                    inputStreamM1079 = null;
                    r76 = c2729M2559;
                    this.f6099.m4091();
                    if (outputStream4 != null) {
                        try {
                            outputStream4.close();
                        } catch (Exception e27) {
                            C2336.f11496.m4355(AbstractC2328.m4341(-739004530721646L), e27);
                        }
                    }
                    C1221 c1221222 = C1221.f5600;
                    Context context3222 = this.f6106;
                    c1221222.getClass();
                    C1221.m2481(context3222, fileM2485, z);
                    throw cancellationException;
                }
                C1221.m2481(this.f6106, fileM2485, z);
                c1014 = new C1014(false, AbstractC2328.m4341(-738304451052398L), null, 8);
                try {
                    c0837M4863.close();
                } catch (Exception e28) {
                    e = e28;
                    c2336 = C2336.f11496;
                    j4 = -738398940332910L;
                    c2336.m4355(AbstractC2328.m4341(j4), e);
                }
                this.f6099.m4092(c2729M2559);
                return c1014;
            }
            file2 = fileM2485;
            try {
                throw new IllegalArgumentException(AbstractC2328.m4341(-738274386281326L));
            } catch (CancellationException e29) {
                e = e29;
            } catch (Exception e30) {
                e = e30;
                exc = e;
                fileM2485 = file2;
                outputStreamM2103 = null;
                c27292 = null;
                inputStreamM1079 = null;
                c0837M4863 = null;
                r74 = c27292;
                if (outputStreamM2103 != null) {
                }
                this.f6099.m4092(r74);
                return c10144;
            }
            cancellationException = e;
            fileM2485 = file2;
            c27293 = null;
            obj2 = null;
            outputStream4 = null;
            inputStreamM1079 = null;
            c0837M4863 = null;
            r76 = c27293;
            this.f6099.m4091();
            if (outputStream4 != null) {
            }
            C1221 c12212222 = C1221.f5600;
            Context context32222 = this.f6106;
            c12212222.getClass();
            C1221.m2481(context32222, fileM2485, z);
            throw cancellationException;
        }
        if (i == 1) {
            long j11 = this.f6102;
            j3 = this.f6104;
            j = this.f6112;
            z2 = this.f6101;
            bArr = this.f6095;
            OutputStream outputStream5 = this.f6097;
            file4 = this.f6109;
            file = this.f6108;
            C2729 c27299 = (C2729) this.f6110;
            outputStream2 = (OutputStream) this.f6098;
            j2 = j11;
            InputStream inputStream = this.f6096;
            c0837 = this.f6105;
            try {
                AbstractC1544.m3189(obj);
                enumC1765 = enumC17653;
                outputStream = outputStream5;
                inputStreamM1079 = inputStream;
                c27294 = c27299;
                boolean z52 = z2;
                outputStream3 = outputStream;
                z3 = z52;
                long j102 = j2;
                j5 = j3;
                j6 = j102;
                c27298 = c27294;
                while (true) {
                    AbstractC0024.m3304(mo733());
                    j7 = j6;
                    if (!this.f6099.f10583) {
                    }
                    z3 = z4;
                    j6 = j7;
                    enumC1765 = enumC17652;
                    outputStream3 = outputStream3;
                    j5 = j8;
                }
                outputStreamM2103 = outputStream2;
                exc = e;
                fileM2485 = file4;
                c27297 = c27298;
            } catch (CancellationException e31) {
                cancellationException = e31;
                inputStreamM1079 = inputStream;
                fileM2485 = file4;
                C2729 c272910 = c27299;
                outputStream4 = outputStream2;
                obj2 = null;
                C2729 c272911 = c272910;
                c0837M4863 = c0837;
                z = z2;
                r76 = c272911;
                this.f6099.m4091();
                if (outputStream4 != null) {
                }
                C1221 c122122222 = C1221.f5600;
                Context context322222 = this.f6106;
                c122122222.getClass();
                C1221.m2481(context322222, fileM2485, z);
                throw cancellationException;
            } catch (Exception e32) {
                exc = e32;
                inputStreamM1079 = inputStream;
                fileM2485 = file4;
                c27297 = c27299;
                outputStreamM2103 = outputStream2;
            } catch (Throwable th8) {
                th = th8;
                inputStreamM1079 = inputStream;
                c27296 = c27299;
                c0837M4863 = c0837;
                r7 = c27296;
                outputStream4 = outputStream2;
                if (outputStream4 != null) {
                }
                if (inputStreamM1079 != null) {
                }
                if (c0837M4863 != null) {
                }
                this.f6099.m4092(r7);
                throw th;
            }
            c0837M4863 = c0837;
            z = z2;
            r74 = c27297;
            if (outputStreamM2103 != null) {
            }
            this.f6099.m4092(r74);
            return c10144;
        }
        if (i != 2) {
            if (i != 3) {
                C0188.m800(AbstractC2328.m4341(-739352423072622L));
                return null;
            }
            boolean z6 = this.f6101;
            fileM2485 = this.f6108;
            File file5 = (File) this.f6110;
            C2729 c272912 = (C2729) this.f6098;
            inputStreamM1079 = this.f6096;
            c0837M4863 = this.f6105;
            try {
                AbstractC1544.m3189(obj);
                file = file5;
                r74 = c272912;
                try {
                    if (this.f6099.f10583) {
                        C1221 c12213 = C1221.f5600;
                        Context context4 = this.f6106;
                        c12213.getClass();
                        C1221.m2481(context4, fileM2485, z6);
                        c10145 = new C1014(false, AbstractC2328.m4341(-738819847127918L), null, 8);
                    } else {
                        C1221 c12214 = C1221.f5600;
                        Context context5 = this.f6106;
                        c12214.getClass();
                        C1221.m2482(context5, fileM2485, file, z6);
                        Context context6 = this.f6106;
                        try {
                            C1327 c13272 = C1327.f6093;
                            C1327.m2617(context6, file.getAbsolutePath());
                            objM3200 = C2746.f13459;
                        } catch (Throwable th9) {
                            objM3200 = AbstractC1544.m3200(th9);
                        }
                        Throwable thM4249 = C2248.m4249(objM3200);
                        if (thM4249 != null) {
                            C2336.f11496.m4355(AbstractC2328.m4341(-738845616931694L) + file.getAbsolutePath(), thM4249);
                        }
                        c10145 = new C1014(true, AbstractC2328.m4341(-738884271637358L), file.getAbsolutePath(), 2);
                    }
                    c10144 = c10145;
                    if (inputStreamM1079 != null) {
                        try {
                            inputStreamM1079.close();
                        } catch (Exception e33) {
                            C2336.f11496.m4355(AbstractC2328.m4341(-738940106212206L), e33);
                        }
                    }
                    if (c0837M4863 != null) {
                        try {
                            c0837M4863.close();
                        } catch (Exception e34) {
                            e = e34;
                            c23362 = C2336.f11496;
                            j9 = -738974465950574L;
                            r74 = r74;
                            c23362.m4355(AbstractC2328.m4341(j9), e);
                        }
                    }
                } catch (CancellationException e35) {
                    e = e35;
                    z = z6;
                    obj2 = null;
                    outputStream4 = null;
                    r73 = r74;
                    cancellationException = e;
                    r76 = r73;
                    this.f6099.m4091();
                    if (outputStream4 != null) {
                    }
                    C1221 c1221222222 = C1221.f5600;
                    Context context3222222 = this.f6106;
                    c1221222222.getClass();
                    C1221.m2481(context3222222, fileM2485, z);
                    throw cancellationException;
                } catch (Exception e36) {
                    e = e36;
                    z = z6;
                    outputStreamM2103 = null;
                    r72 = r74;
                    exc = e;
                    r74 = r72;
                    if (outputStreamM2103 != null) {
                    }
                }
            } catch (CancellationException e37) {
                e = e37;
                z = z6;
                obj2 = null;
                r73 = c272912;
                cancellationException = e;
                r76 = r73;
                this.f6099.m4091();
                if (outputStream4 != null) {
                }
                C1221 c12212222222 = C1221.f5600;
                Context context32222222 = this.f6106;
                c12212222222.getClass();
                C1221.m2481(context32222222, fileM2485, z);
                throw cancellationException;
            } catch (Exception e38) {
                e = e38;
                z = z6;
                outputStreamM2103 = null;
                r72 = c272912;
                exc = e;
                r74 = r72;
                if (outputStreamM2103 != null) {
                }
                this.f6099.m4092(r74);
                return c10144;
            }
            this.f6099.m4092(r74);
            return c10144;
        }
        long j12 = this.f6102;
        long j13 = this.f6104;
        j = this.f6112;
        boolean z7 = this.f6101;
        byte[] bArr2 = this.f6095;
        outputStream3 = this.f6097;
        File file6 = this.f6109;
        File file7 = this.f6108;
        C2729 c272913 = (C2729) this.f6110;
        outputStream4 = (OutputStream) this.f6098;
        InputStream inputStream2 = this.f6096;
        C0837 c08372 = this.f6105;
        try {
            AbstractC1544.m3189(obj);
            OutputStream outputStream6 = outputStream4;
            bArr = bArr2;
            enumC1765 = enumC17653;
            z3 = z7;
            c0837 = c08372;
            file4 = file6;
            inputStreamM1079 = inputStream2;
            j5 = j13;
            file = file7;
            C2729 c272914 = c272913;
            j6 = j12;
            outputStream2 = outputStream6;
            c27298 = c272914;
            while (true) {
                try {
                    try {
                        try {
                            if (!this.f6099.f10583) {
                                int i2 = inputStreamM1079.read(bArr);
                                if (i2 == -1) {
                                    break;
                                }
                                try {
                                    outputStream3.write(bArr, 0, i2);
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    if (jCurrentTimeMillis - j7 >= 150) {
                                        break;
                                    }
                                    z3 = z4;
                                    j6 = j7;
                                    enumC1765 = enumC17652;
                                    outputStream3 = outputStream3;
                                    j5 = j8;
                                } catch (CancellationException e39) {
                                    e = e39;
                                    z2 = z4;
                                } catch (Exception e40) {
                                    e = e40;
                                    z2 = z4;
                                }
                                j8 = j5 + ((long) i2);
                                z4 = z3;
                                enumC17652 = enumC1765;
                            } else {
                                try {
                                    break;
                                } catch (CancellationException e41) {
                                    e = e41;
                                    fileM2485 = file4;
                                    C2729 c272915 = c27298;
                                    outputStream4 = outputStream2;
                                    obj2 = null;
                                } catch (Exception e42) {
                                    e = e42;
                                    fileM2485 = file4;
                                    C2729 c272916 = c27298;
                                    outputStreamM2103 = outputStream2;
                                } catch (Throwable th10) {
                                    th = th10;
                                    c27296 = c27298;
                                    c0837M4863 = c0837;
                                    r7 = c27296;
                                    outputStream4 = outputStream2;
                                    if (outputStream4 != null) {
                                    }
                                    if (inputStreamM1079 != null) {
                                    }
                                    if (c0837M4863 != null) {
                                    }
                                    this.f6099.m4092(r7);
                                    throw th;
                                }
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            c0837M4863 = c0837;
                            r75 = c27298;
                            outputStream4 = null;
                            r7 = r75;
                        }
                        AbstractC0024.m3304(mo733());
                        j7 = j6;
                    } catch (Throwable th12) {
                        th = th12;
                        outputStreamM2103 = outputStream2;
                    }
                } catch (CancellationException e43) {
                    e = e43;
                    z2 = z3;
                } catch (Exception e44) {
                    e = e44;
                    z2 = z3;
                }
            }
            outputStreamM2103 = outputStream2;
            exc = e;
            fileM2485 = file4;
            c27297 = c27298;
        } catch (CancellationException e45) {
            cancellationException = e45;
            c0837M4863 = c08372;
            fileM2485 = file6;
            c27295 = c272913;
            z = z7;
            inputStreamM1079 = inputStream2;
            obj2 = null;
            r76 = c27295;
            this.f6099.m4091();
            if (outputStream4 != null) {
            }
            C1221 c122122222222 = C1221.f5600;
            Context context322222222 = this.f6106;
            c122122222222.getClass();
            C1221.m2481(context322222222, fileM2485, z);
            throw cancellationException;
        } catch (Exception e46) {
            exc = e46;
            c0837M4863 = c08372;
            fileM2485 = file6;
            r74 = c272913;
            outputStreamM2103 = outputStream4;
            z = z7;
            inputStreamM1079 = inputStream2;
            if (outputStreamM2103 != null) {
            }
        } catch (Throwable th13) {
            th = th13;
            c0837M4863 = c08372;
            r7 = c272913;
            inputStreamM1079 = inputStream2;
        }
        c0837M4863 = c0837;
        z = z2;
        r74 = c27297;
        if (outputStreamM2103 != null) {
            try {
                outputStreamM2103.close();
                outputStreamM2103 = null;
            } catch (Exception e47) {
                C2336.f11496.m4355(AbstractC2328.m4341(-739038890460014L), e47);
            }
            C1221 c12215 = C1221.f5600;
            Context context7 = this.f6106;
            c12215.getClass();
            C1221.m2481(context7, fileM2485, z);
            if (this.f6099.f10583) {
                C2336.f11496.m4355(AbstractC2328.m4341(-739099020002158L) + this.f6107, exc);
                c10143 = new C1014(false, AbstractC2328.m4341(-739129084773230L) + exc.getMessage(), null, 10);
            } else {
                c10143 = new C1014(false, AbstractC2328.m4341(-739073250198382L), null, 8);
            }
            c10144 = c10143;
            if (outputStreamM2103 != null) {
                try {
                    outputStreamM2103.close();
                } catch (Exception e48) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-739154854577006L), e48);
                }
            }
            if (inputStreamM1079 != null) {
                try {
                    inputStreamM1079.close();
                } catch (Exception e49) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-739189214315374L), e49);
                }
            }
            if (c0837M4863 != null) {
                try {
                    c0837M4863.close();
                } catch (Exception e50) {
                    e = e50;
                    c23362 = C2336.f11496;
                    j9 = -739223574053742L;
                    r74 = r74;
                    c23362.m4355(AbstractC2328.m4341(j9), e);
                }
            }
        } else {
            outputStreamM2103 = null;
            C1221 c122152 = C1221.f5600;
            Context context72 = this.f6106;
            c122152.getClass();
            C1221.m2481(context72, fileM2485, z);
            if (this.f6099.f10583) {
            }
            c10144 = c10143;
            if (outputStreamM2103 != null) {
            }
            if (inputStreamM1079 != null) {
            }
            if (c0837M4863 != null) {
            }
        }
        this.f6099.m4092(r74);
        return c10144;
        this.f6099.m4092(c27298);
        return c10142;
        if (c0837 != null) {
            try {
                c0837.close();
            } catch (Exception e51) {
                C2336.f11496.m4355(AbstractC2328.m4341(-738789782356846L), e51);
            }
        }
        this.f6099.m4092(c27298);
        return c10142;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        C1328 c1328 = new C1328(this.f6107, this.f6106, this.f6103, this.f6099, this.f6113, interfaceC0274);
        c1328.f6100 = obj;
        return c1328;
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        return ((C1328) mo630((InterfaceC0990) obj, (InterfaceC0274) obj2)).mo474(C2746.f13459);
    }
}

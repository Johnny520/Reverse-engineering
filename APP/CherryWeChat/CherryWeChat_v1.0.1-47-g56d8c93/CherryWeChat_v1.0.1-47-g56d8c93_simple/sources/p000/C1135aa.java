package p000;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import io.github.cherrywechat.network.model.ApiResponse;
import io.github.cherrywechat.network.model.DownloadTokenData;
import io.github.cherrywechat.theme.ThemeProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: aa */
/* JADX INFO: loaded from: classes.dex */
public final class C1135aa extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public byte[] f3585e;

    /* JADX INFO: renamed from: f */
    public File f3586f;

    /* JADX INFO: renamed from: g */
    public int f3587g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2414qe f3588h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0140DA f3589i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ View f3590j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0054BA f3591k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C1258ca f3592l;

    public C1135aa(C1258ca r1, InterfaceC0190Eb r2, C2414qe r3, C0054BA r4, C0140DA r5, View r6) {
        this.f3588h = r3;
        this.f3589i = r5;
        this.f3590j = r6;
        this.f3591k = r4;
        this.f3592l = r1;
        super(r2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r1, Object r2) {
        InterfaceC0190Eb r22 = (InterfaceC0190Eb) r2;
        return ((C1135aa) mo447h(r22, (InterfaceC1409fc) r1)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r8, Object r9) {
        C0054BA r4 = this.f3591k;
        return new C1135aa(this.f3592l, r8, this.f3588h, r4, this.f3589i, this.f3590j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v48, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v5, types: [Eb, aa] */
    /* JADX WARN: Type inference failed for: r10v7, types: [Eb, aa] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [qe] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v5, types: [qe] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [Eb, byte[]] */
    /* JADX WARN: Type inference failed for: r5v3, types: [Eb, byte[], java.io.File] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
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
    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r17) {
        C0140DA r7 = this.f3589i;
        String r8 = r7.f364a;
        int r0 = this.f3587g;
        ?? r10 = 1;
        C0829TC r11 = C0829TC.f2620a;
        View r12 = this.f3590j;
        C2414qe r13 = this.f3588h;
        EnumC1453gc r15 = EnumC1453gc.f5148a;
        switch(r0) {
            case 0: goto L29;
            case 1: goto L27;
            case 2: goto L21;
            case 3: goto L21;
            case 4: goto L19;
            case 5: goto L18;
            case 6: goto L16;
            case 7: goto L13;
            case 8: goto L7;
            case 9: goto L6;
            default: goto L5;
        };
    L6:
        AbstractC0628Oj.m1232T(r17);
    L154:
        return r11;
    L7:
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L9
        goto L154
    L13:
        File r02 = this.f3586f;
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L9
        C1135aa r102 = this;
    L84:
        String r03 = r02.getAbsolutePath();     // Catch: Exception -> L95
        AbstractC0295Gu.m625r(-103946798495797L);     // Catch: Exception -> L95
        if (ThemeProvider.extractThemeFiles(r03) == true) goto L87;
        Toast.makeText(r12.getContext(), AbstractC0295Gu.m625r(-104036992809013L), 0).show();     // Catch: Exception -> L68
    L87:
        C1498hd r04 = AbstractC1499he.f5282a;     // Catch: Exception -> L97
        C2283nk r82 = AbstractC1106Zp.f3500a;     // Catch: Exception -> L97
        View r6 = r102.f3590j;     // Catch: Exception -> L95
        C0998X9 r05 = new C0998X9(r102.f3592l, null, r13, r102.f3591k, r7, r6);     // Catch: Exception -> L93
        r102.f3585e = null;     // Catch: Exception -> L93
        r102.f3586f = null;     // Catch: Exception -> L93
        r102.f3587g = 8;     // Catch: Exception -> L93
        if (AbstractC0585Nj.m1133N(r82, r05, r102) != r15) goto L154;
    L153:
        return r15;
    L95:
        e = e;
    L96:
        ?? r3 = r13;
    L94:
        Exception r4 = e;
        ?? r2 = r3;
        View r32 = r12;
        C1135aa r103 = r102;
    L12:
        ?? r5 = 0;
        ?? r22 = r2;
        ?? r104 = r103;
    L151:
        r4.printStackTrace();
        C1498hd r06 = AbstractC1499he.f5282a;
        C2283nk r07 = AbstractC1106Zp.f3500a;
        C1041Y9 r1 = new C1041Y9(r22, r32, r4, r5, 0);
        r104.f3585e = r5;
        r104.f3586f = r5;
        r104.f3587g = 9;
        if (AbstractC0585Nj.m1133N(r07, r1, r104) != r15) goto L154;
    L97:
        e = e;
        goto L96
    L16:
        byte[] r08 = this.f3585e;
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L9
        r102 = this;
    L75:
        C0183EA.f539a.getClass();     // Catch: Exception -> L97
        File r14 = new File(C0183EA.m378f(r8));     // Catch: Exception -> L95
        FileOutputStream r23 = new FileOutputStream(r14);     // Catch: Exception -> L95
        r23.write(r08);     // Catch: Throwable -> L99
        r23.close();     // Catch: Exception -> L95
        C1498hd r09 = AbstractC1499he.f5282a;     // Catch: Exception -> L97
        C2283nk r010 = AbstractC1106Zp.f3500a;     // Catch: Exception -> L97
        C0955W9 r24 = new C0955W9(r13, null, 1);     // Catch: Exception -> L95
        r102.f3585e = null;     // Catch: Exception -> L95
        r102.f3586f = r14;     // Catch: Exception -> L95
        r102.f3587g = 7;     // Catch: Exception -> L95
        if (AbstractC0585Nj.m1133N(r010, r24, r102) == r15) goto L153;
        r02 = r14;
        r102 = r102;
        goto L84
    L99:
        th = move-exception;
        r3 = r13;
        throw th;     // Catch: Throwable -> L102
    L102:
        th = move-exception;
        AbstractC0585Nj.m1138f(r23, th);     // Catch: Exception -> L93
        throw th;     // Catch: Exception -> L93
    L93:
        e = e;
        goto L94
    L18:
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L9
        Object r011 = r17;
        r102 = this;
    L177:
        r08 = (byte[]) r011;     // Catch: Exception -> L95
        C0183EA.f539a.getClass();     // Catch: Exception -> L97
        File r16 = new File(C0183EA.m377e(r8));     // Catch: Exception -> L95
        if (r16.exists() == false) goto L182;
    L70:
        C1498hd r18 = AbstractC1499he.f5282a;     // Catch: Exception -> L97
        C2283nk r19 = AbstractC1106Zp.f3500a;     // Catch: Exception -> L97
        C0955W9 r25 = new C0955W9(r13, null, 0);     // Catch: Exception -> L95
        r102.f3585e = r08;     // Catch: Exception -> L95
        r3 = 6;
        r3 = 6;
        r102.f3587g = 6;     // Catch: Exception -> L95
        Object r110 = AbstractC0585Nj.m1133N(r19, r25, r102);     // Catch: Exception -> L95
        r102 = r102;
        if (r110 != r15) goto L75;
    L182:
    L68:
        e = move-exception;
        r4 = e;
        C1135aa r105 = r102;
    L11:
        r32 = r12;
        r2 = r13;
        r103 = r105;
        goto L12
    L64:
        if (r16.mkdirs() == true) goto L70;
        throw new IOException(AbstractC0295Gu.m625r(-103908143790133L));     // Catch: Exception -> L68
    L19:
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L9
        return r11;
    L21:
        String r012 = (String) this.f3585e;
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L24
        return r11;
    L27:
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L9
        Object r013 = r17;
    L33:
        String r014 = (String) r013;     // Catch: Exception -> L149
        C0029Am r111 = AbstractC2809zm.f9524a;     // Catch: Exception -> L36
        r111.getClass();     // Catch: Exception -> L36
        ApiResponse.Companion r26 = ApiResponse.Companion;     // Catch: Exception -> L36
        InterfaceC0717Qm r33 = DownloadTokenData.Companion.serializer();     // Catch: Exception -> L36
        Object r015 = r111.m4550a(r26.serializer(r33), r014);     // Catch: Exception -> L36
    L39:
        ApiResponse r016 = (ApiResponse) r015;     // Catch: Exception -> L142
        if (r016 != null) goto L170;
    L43:
        C1135aa r106 = this;
        if (r016 == null) goto L173;
        String r112 = r016.getMessage();     // Catch: Exception -> L115
        if (r112 == null) goto L173;
        if (r112.length() != 0) goto L123;
        r112 = r016.getMsg();     // Catch: Exception -> L115
    L123:
        if (r112 == null) goto L173;
    L125:
        String r42 = r112;
        C1498hd r017 = AbstractC1499he.f5282a;     // Catch: Exception -> L140
        C2283nk r018 = AbstractC1106Zp.f3500a;     // Catch: Exception -> L140
        C2414qe r27 = r13;
        r32 = r12;
        Object r52 = null;
        C1084Z9 r113 = new C1084Z9(r27, r32, r42, null, 0);     // Catch: Exception -> L135
        r106.f3585e = null;     // Catch: Exception -> L135
        r106.f3587g = 2;     // Catch: Exception -> L135
        if (AbstractC0585Nj.m1133N(r018, r113, r106) != r15) goto L154;
    L135:
        e = e;
    L136:
        Exception r43 = e;
        ?? r28 = r27;
        ?? r53 = r52;
        ?? r107 = r106;
    L168:
        C1498hd r019 = AbstractC1499he.f5282a;     // Catch: Exception -> L147
        C2283nk r020 = AbstractC1106Zp.f3500a;     // Catch: Exception -> L147
        C1041Y9 r114 = new C1041Y9(r28, r32, r43, r53, 1);     // Catch: Exception -> L147
        r107.f3585e = r53;     // Catch: Exception -> L147
        r107.f3587g = 4;     // Catch: Exception -> L147
        if (AbstractC0585Nj.m1133N(r020, r114, r107) != r15) goto L154;
    L147:
        Exception e = e;
    L148:
        r4 = e;
        r22 = r28;
        r5 = r53;
        r104 = r107;
    L137:
        e = e;
        r27 = r13;
        r32 = r12;
        r106 = r106;
    L139:
        r52 = null;
    L140:
        e = e;
        r27 = r13;
        r32 = r12;
        r106 = r106;
    L173:
        r112 = AbstractC0295Gu.m625r(-104436424767541L);     // Catch: Exception -> L137
        goto L125
    L170:
    L109:
        e = e;
        r10 = this;
        Object r34 = r13;
    L111:
        r43 = e;
        Object r29 = r34;
        r32 = r12;
        ?? r108 = r10;
    L26:
        r53 = 0;
        r28 = r29;
        r107 = r108;
        goto L168
    L42:
        if (r016.getCode() != 0) goto L43;
        DownloadTokenData r021 = (DownloadTokenData) r016.getData();     // Catch: Exception -> L109
        if (r021 != null) goto L47;
        String r210 = null;
    L49:
        if (r210 == null) goto L112;
        if (r210.length() == 0) goto L112;
        C0594Ns r022 = C0594Ns.f1925a;     // Catch: Exception -> L105
        C0183EA.f539a.getClass();     // Catch: Exception -> L107
        String r115 = C0183EA.f541c;     // Catch: Exception -> L107
        long r35 = r7.f368e;     // Catch: Exception -> L105
        C0912V9 r54 = new C0912V9(r13, 0);     // Catch: Exception -> L105
        this.f3587g = 5;     // Catch: Exception -> L105
        r011 = r022.m1169b(r115, r210, r35, r54, this);     // Catch: Exception -> L105
        r102 = this;
        if (r011 != r15) goto L177;
    L107:
        e = e;
        r102 = this;
    L105:
        e = e;
        r102 = this;
    L112:
        C1498hd r023 = AbstractC1499he.f5282a;     // Catch: Exception -> L115
        C2283nk r024 = AbstractC1106Zp.f3500a;     // Catch: Exception -> L115
        C0993X4 r116 = new C0993X4(r13, r12, null, 1);     // Catch: Exception -> L115
        this.f3585e = null;     // Catch: Exception -> L115
        this.f3587g = 3;     // Catch: Exception -> L115
        if (AbstractC0585Nj.m1133N(r024, r116, this) != r15) goto L154;
    L47:
        r210 = r021.getToken();     // Catch: Exception -> L24
    L115:
        e = e;
        r34 = r33;
        goto L111
    L36:
        e = move-exception;
        AbstractC0295Gu.m625r(-104303280781365L);     // Catch: Exception -> L142
        AbstractC0425Jv.m881a(ApiResponse.class).m445b();     // Catch: Exception -> L142
        AbstractC0295Gu.m625r(-104419244898357L);     // Catch: Exception -> L142
        e.getMessage();     // Catch: Exception -> L142
        r015 = null;
    L142:
        e = e;
        r106 = this;
        r32 = r12;
        r27 = r13;
    L149:
        e = e;
        r107 = this;
        r32 = r12;
        r28 = r13;
        r53 = 0;
        goto L148
    L29:
        AbstractC0628Oj.m1232T(r17);
        C2214m0 r025 = C2214m0.f7706a;     // Catch: Exception -> L149
        Context r117 = r13.getContext();     // Catch: Exception -> L149
        AbstractC0295Gu.m625r(-104234561304629L);     // Catch: Exception -> L149
        C0183EA.f539a.getClass();     // Catch: Exception -> L149
        String r211 = C0183EA.f540b;     // Catch: Exception -> L149
        r025.getClass();     // Catch: Exception -> L149
        C2171l0 r026 = C2214m0.m4456c(r117, r211);     // Catch: Exception -> L149
        C0594Ns r118 = C0594Ns.f1925a;     // Catch: Exception -> L149
        String r212 = r026.f7562a;     // Catch: Exception -> L149
        String r027 = r026.f7564c;     // Catch: Exception -> L149
        this.f3587g = 1;     // Catch: Exception -> L149
        r118.getClass();     // Catch: Exception -> L149
        r013 = C0594Ns.m1165d(r8, r212, r027, this);     // Catch: Exception -> L149
        if (r013 != r15) goto L33;
    L5:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-104058467645493L));
    L9:
        e = move-exception;
        r4 = e;
        r105 = this;
    L24:
        e = move-exception;
        r43 = e;
        r108 = this;
        r32 = r12;
        r29 = r13;
        goto L26
    }
}

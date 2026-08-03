package p000;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import io.github.cherrywechat.network.model.ApiResponse;
import io.github.cherrywechat.network.model.DownloadTokenData;
import io.github.cherrywechat.network.model.ThemePurchaseData;
import io.github.cherrywechat.theme.ThemeProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: W4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0950W4 extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f2975e;

    /* JADX INFO: renamed from: f */
    public int f2976f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f2977g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f2978h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f2979i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f2980j;

    public C0950W4(int r2, InterfaceC1416fj r3, String r4, String r5, InterfaceC1416fj r6, InterfaceC0190Eb r7) {
        this.f2975e = 0;
        this.f2976f = r2;
        this.f2978h = r3;
        this.f2977g = r4;
        this.f2980j = r5;
        this.f2979i = r6;
        super(r7);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r2, Object r3) {
        InterfaceC1409fc r22 = (InterfaceC1409fc) r2;
        InterfaceC0190Eb r32 = (InterfaceC0190Eb) r3;
        switch(this.f2975e) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return ((C0950W4) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    L7:
        return ((C0950W4) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    L9:
        return ((C0950W4) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    L11:
        return ((C0950W4) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r9, Object r10) {
        switch(this.f2975e) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        C0625Og r4 = (C0625Og) this.f2978h;
        C0140DA r5 = (C0140DA) this.f2979i;
        return new C0950W4(r9, (C2414qe) this.f2977g, r4, r5, (C0185EC) this.f2980j);
    L5:
        return new C0950W4((String) this.f2977g, (String) this.f2980j, (Activity) this.f2978h, (C0784SA) this.f2979i, r9, 3);
    L9:
        return new C0950W4((String) this.f2977g, (C2171l0) this.f2980j, (InterfaceC1416fj) this.f2978h, (InterfaceC1416fj) this.f2979i, r9, 1);
    L11:
        return new C0950W4(this.f2976f, (InterfaceC1416fj) this.f2978h, (String) this.f2977g, (String) this.f2980j, (InterfaceC1416fj) this.f2979i, r9);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r19) {
        int r0 = this.f2975e;
        Object r3 = this.f2979i;
        EnumC1453gc r7 = EnumC1453gc.f5148a;
        InterfaceC0190Eb r5 = null;
        int r8 = 0;
        C0829TC r9 = C0829TC.f2620a;
        Object r10 = this.f2980j;
        Object r11 = this.f2977g;
        Object r12 = this.f2978h;
        int r13 = 1;
        switch(r0) {
            case 0: goto L213;
            case 1: goto L163;
            case 2: goto L66;
            default: goto L4;
        };
    L4:
        Activity r122 = (Activity) r12;
        int r02 = this.f2976f;
        if (r02 == 0) goto L15;
        if (r02 != 1) goto L14;
        AbstractC0628Oj.m1232T(r19);     // Catch: Throwable -> L9 Exception -> L11
        Object r03 = r19;
    L22:
        String r04 = (String) r03;     // Catch: Throwable -> L9 Exception -> L11
        C0029Am r1 = AbstractC2809zm.f9524a;     // Catch: Throwable -> L9 Exception -> L25
        r1.getClass();     // Catch: Throwable -> L9 Exception -> L25
        Object r05 = r1.m4550a(ApiResponse.Companion.serializer(ThemePurchaseData.Companion.serializer()), r04);     // Catch: Throwable -> L9 Exception -> L25
    L28:
        ApiResponse r06 = (ApiResponse) r05;     // Catch: Throwable -> L9 Exception -> L11
        if (r06 != null) goto L31;
    L53:
        if (r06 == null) goto L59;
        String r07 = r06.getMessage();     // Catch: Throwable -> L9 Exception -> L11
        if (r07 == null) goto L59;
        if (r07.length() != 0) goto L60;
        r07 = AbstractC0295Gu.m625r(-475663333062709L);     // Catch: Throwable -> L9 Exception -> L11
    L60:
        Toast.makeText(r122, r07, 0).show();     // Catch: Throwable -> L9 Exception -> L11
    L65:
        return r9;
    L59:
        r07 = AbstractC0295Gu.m625r(-475684807899189L);     // Catch: Throwable -> L9 Exception -> L11
        goto L60
    L31:
        if (r06.getCode() != 0) goto L53;
        ThemePurchaseData r14 = (ThemePurchaseData) r06.getData();     // Catch: Throwable -> L9 Exception -> L11
        if (r14 == null) goto L35;
        String r15 = r14.getQrCode();     // Catch: Throwable -> L9 Exception -> L11
    L36:
        AbstractC0295Gu.m625r(-476724189984821L);     // Catch: Throwable -> L9 Exception -> L11
        if (r15 != null) goto L39;
    L49:
        String r08 = r06.getMessage();     // Catch: Throwable -> L9 Exception -> L11
        if (r08.length() != 0) goto L52;
        r08 = AbstractC0295Gu.m625r(-475641858226229L);     // Catch: Throwable -> L9 Exception -> L11
    L52:
        Toast.makeText(r122, r08, 0).show();     // Catch: Throwable -> L9 Exception -> L11
        goto L65
    L39:
        if (r15.length() == 0) goto L49;
        if (r15.startsWith(AbstractC0295Gu.m625r(-476810089330741L)) == false) goto L45;
        String r09 = AbstractC0295Gu.m625r(-476853039003701L);     // Catch: Throwable -> L9 Exception -> L47
        AbstractC0295Gu.m625r(-578300166535221L);     // Catch: Throwable -> L9 Exception -> L47
        int r32 = AbstractC1450gG.f5067a;     // Catch: Throwable -> L9 Exception -> L47
        C1538iG r2 = new C1538iG(AbstractC1406fG.m2718r0(r09));     // Catch: Throwable -> L9 Exception -> L47
        C0556Mx r010 = new C0556Mx(11);     // Catch: Throwable -> L9 Exception -> L47
        AbstractC0295Gu.m625r(-576599359486005L);     // Catch: Throwable -> L9 Exception -> L47
        r2.f5425g = r010;     // Catch: Throwable -> L9 Exception -> L47
        Method r011 = r2.m2920e();     // Catch: Throwable -> L9 Exception -> L47
        Class<?> r22 = r011.getParameterTypes()[1];     // Catch: Throwable -> L9 Exception -> L47
        AbstractC0295Gu.m625r(-475470059534389L);     // Catch: Throwable -> L9 Exception -> L47
        AbstractC0295Gu.m625r(-579988088682549L);     // Catch: Throwable -> L9 Exception -> L47
        C2428qs r4 = new C2428qs(11, r22);     // Catch: Throwable -> L9 Exception -> L47
        r4.m4886x(new Object[]{String.class, Integer.TYPE, Object.class});     // Catch: Throwable -> L9 Exception -> L47
        Object r16 = r4.m4885w(new Object[]{r15, new Integer(28), null});     // Catch: Throwable -> L9 Exception -> L47
        String r23 = AbstractC0295Gu.m625r(-475508714240053L);     // Catch: Throwable -> L9 Exception -> L47
        AbstractC0295Gu.m625r(-579464102672437L);     // Catch: Throwable -> L9 Exception -> L47
        C2428qs r42 = new C2428qs(11, AbstractC1406fG.m2718r0(r23));     // Catch: Throwable -> L9 Exception -> L47
        r42.m4886x(new Object[]{Context.class});     // Catch: Throwable -> L9 Exception -> L47
        Object r24 = r42.m4885w(new Object[]{r122});     // Catch: Throwable -> L9 Exception -> L47
        String r43 = AbstractC0295Gu.m625r(-475147936987189L);     // Catch: Throwable -> L9 Exception -> L47
        AbstractC0295Gu.m625r(-579464102672437L);     // Catch: Throwable -> L9 Exception -> L47
        C2428qs r72 = new C2428qs(11, AbstractC1406fG.m2718r0(r43));     // Catch: Throwable -> L9 Exception -> L47
        r72.m4886x(new Object[]{AbstractC0295Gu.m625r(-475963980773429L)});     // Catch: Throwable -> L9 Exception -> L47
        r011.invoke(r72.m4885w(new Object[]{r24}), new Object[]{null, r16, null});     // Catch: Throwable -> L9 Exception -> L47
    L231:
    L45:
        C1456gf.m2803U(r122, r15);     // Catch: Throwable -> L9 Exception -> L47
    L48:
        Toast.makeText(r122, AbstractC0295Gu.m625r(-475603203520565L), 0).show();     // Catch: Throwable -> L9 Exception -> L11
        goto L65
    L35:
        r15 = null;
    L25:
        e = move-exception;
        AbstractC0295Gu.m625r(-477140801812533L);     // Catch: Throwable -> L9 Exception -> L11
        AbstractC0425Jv.m881a(ApiResponse.class).m445b();     // Catch: Throwable -> L9 Exception -> L11
        AbstractC0295Gu.m625r(-476707010115637L);     // Catch: Throwable -> L9 Exception -> L11
        e.getMessage();     // Catch: Throwable -> L9 Exception -> L11
        r05 = null;
        goto L28
    L14:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-475736347506741L));
    L15:
        AbstractC0628Oj.m1232T(r19);
        String r012 = C1456gf.m2791I();     // Catch: Throwable -> L9 Exception -> L11
        if (r012.length() != 0) goto L19;
        r012 = C1456gf.m2794L();     // Catch: Throwable -> L9 Exception -> L11
    L19:
        C0594Ns r17 = C0594Ns.f1925a;     // Catch: Throwable -> L9 Exception -> L11
        this.f2976f = 1;     // Catch: Throwable -> L9 Exception -> L11
        r17.getClass();     // Catch: Throwable -> L9 Exception -> L11
        r03 = C0594Ns.m1168g((String) r11, (String) r10, r012, this);     // Catch: Throwable -> L9 Exception -> L11
        if (r03 != r7) goto L22;
        return r7;
    L11:
        e = move-exception;
        Toast.makeText(r122, AbstractC0213Ey.m405c(-475706282735669L, new StringBuilder(), e), 0).show();
    L9:
        th = move-exception;
        throw th;
    L66:
        C2414qe r112 = (C2414qe) r11;
        C0140DA r82 = (C0140DA) r3;
        String r142 = r82.f364a;
        C0625Og r123 = (C0625Og) r12;
        switch(this.f2976f) {
            case 0: goto L83;
            case 1: goto L81;
            case 2: goto L77;
            case 3: goto L71;
            case 4: goto L74;
            case 5: goto L71;
            case 6: goto L70;
            default: goto L69;
        };
    L70:
        AbstractC0628Oj.m1232T(r19);
    L162:
        return r9;
    L71:
        AbstractC0628Oj.m1232T(r19);     // Catch: Exception -> L72
        goto L162
    L74:
        AbstractC0628Oj.m1232T(r19);     // Catch: Exception -> L72
        Object r013 = r19;
    L109:
        byte[] r014 = (byte[]) r013;     // Catch: Exception -> L72
        C0183EA.f539a.getClass();     // Catch: Exception -> L72
        File r18 = new File(C0183EA.m377e(r142));     // Catch: Exception -> L72
        if (r18.exists() == false) goto L112;
    L116:
        File r110 = new File(C0183EA.m378f(r142));     // Catch: Exception -> L72
        FileOutputStream r25 = new FileOutputStream(r110);     // Catch: Exception -> L72
        r25.write(r014);     // Catch: Throwable -> L127
        r25.close();     // Catch: Exception -> L72
        String r015 = r110.getAbsolutePath();     // Catch: Exception -> L72
        AbstractC0295Gu.m625r(-99948183943221L);     // Catch: Exception -> L72
        ThemeProvider.extractThemeFiles(r015);     // Catch: Exception -> L72
        C1498hd r016 = AbstractC1499he.f5282a;     // Catch: Exception -> L72
        C2283nk r132 = AbstractC1106Zp.f3500a;     // Catch: Exception -> L72
        C0539Mg r017 = new C0539Mg(null, r112, r123, r82, (C0185EC) r10);     // Catch: Exception -> L125
        this.f2976f = 5;     // Catch: Exception -> L72
        if (AbstractC0585Nj.m1133N(r132, r017, this) != r7) goto L162;
        return r7;
    L125:
        e = e;
        r112 = r112;
        r123 = r123;
    L73:
        Exception r33 = e;
        InterfaceC0190Eb r143 = null;
    L160:
        C1498hd r018 = AbstractC1499he.f5282a;
        C2283nk r83 = AbstractC1106Zp.f3500a;
        C0582Ng r019 = new C0582Ng(r112, r123, r33, r143, 0);
        this.f2976f = 6;
        if (AbstractC0585Nj.m1133N(r83, r019, this) != r7) goto L162;
        return r7;
    L127:
        th = move-exception;
        throw th;     // Catch: Throwable -> L130
    L130:
        th = move-exception;
        AbstractC0585Nj.m1138f(r25, th);     // Catch: Exception -> L72
        throw th;     // Catch: Exception -> L72
    L112:
        if (r18.mkdirs() == true) goto L116;
        throw new Exception(AbstractC0295Gu.m625r(-99909529237557L));     // Catch: Exception -> L72
    L77:
        AbstractC0628Oj.m1232T(r19);     // Catch: Exception -> L79
        goto L162
    L81:
        AbstractC0628Oj.m1232T(r19);     // Catch: Exception -> L72
        Object r020 = r19;
    L87:
        String r021 = (String) r020;     // Catch: Exception -> L158
        C0029Am r34 = AbstractC2809zm.f9524a;     // Catch: Exception -> L90
        r34.getClass();     // Catch: Exception -> L90
        Object r022 = r34.m4550a(ApiResponse.Companion.serializer(DownloadTokenData.Companion.serializer()), r021);     // Catch: Exception -> L90
    L93:
        ApiResponse r023 = (ApiResponse) r022;     // Catch: Exception -> L151
        if (r023 != null) goto L96;
    L133:
        if (r023 == null) goto L143;
        String r35 = r023.getMessage();     // Catch: Exception -> L79
        if (r35 == null) goto L143;
        if (r35.length() != 0) goto L139;
        r35 = r023.getMsg();     // Catch: Exception -> L79
    L139:
        if (r35 == null) goto L143;
    L141:
        String r133 = r35;
        C1498hd r024 = AbstractC1499he.f5282a;     // Catch: Exception -> L151
        C2283nk r025 = AbstractC1106Zp.f3500a;     // Catch: Exception -> L151
        r143 = null;
        C1084Z9 r102 = new C1084Z9(r112, r123, r133, r143, 1);     // Catch: Exception -> L149
        this.f2976f = 2;     // Catch: Exception -> L149
        if (AbstractC0585Nj.m1133N(r025, r102, this) != r7) goto L162;
        return r7;
    L149:
        e = e;
    L150:
        Exception r134 = e;
    L234:
        C1498hd r026 = AbstractC1499he.f5282a;     // Catch: Exception -> L156
        C2283nk r027 = AbstractC1106Zp.f3500a;     // Catch: Exception -> L156
        C0582Ng r103 = new C0582Ng(r112, r123, r134, r143, 1);     // Catch: Exception -> L156
        this.f2976f = 3;     // Catch: Exception -> L156
        if (AbstractC0585Nj.m1133N(r027, r103, this) != r7) goto L162;
        return r7;
    L156:
        e = e;
    L157:
        r33 = e;
    L143:
        r35 = AbstractC0295Gu.m625r(-99883759433781L);     // Catch: Exception -> L151
        goto L141
    L96:
        if (r023.getCode() != 0) goto L133;
        DownloadTokenData r028 = (DownloadTokenData) r023.getData();     // Catch: Exception -> L79
        if (r028 == null) goto L104;
        String r029 = r028.getToken();     // Catch: Exception -> L79
        if (r029 == null) goto L104;
    L103:
        String r26 = r029;
        C0594Ns r030 = C0594Ns.f1925a;     // Catch: Exception -> L72
        C0183EA.f539a.getClass();     // Catch: Exception -> L72
        String r111 = C0183EA.f541c;     // Catch: Exception -> L72
        long r36 = r82.f368e;     // Catch: Exception -> L72
        C0912V9 r52 = new C0912V9(r112, r13);     // Catch: Exception -> L72
        this.f2976f = 4;     // Catch: Exception -> L72
        r013 = r030.m1169b(r111, r26, r36, r52, this);     // Catch: Exception -> L72
        if (r013 != r7) goto L109;
        return r7;
    L104:
        r029 = AbstractC0295Gu.m625r(-99905234270261L);     // Catch: Exception -> L79
        goto L103
    L90:
        e = move-exception;
        AbstractC0295Gu.m625r(-99200859633717L);     // Catch: Exception -> L151
        AbstractC0425Jv.m881a(ApiResponse.class).m445b();     // Catch: Exception -> L151
        AbstractC0295Gu.m625r(-99866579564597L);     // Catch: Exception -> L151
        e.getMessage();     // Catch: Exception -> L151
        r022 = null;
    L151:
        e = e;
        r143 = null;
    L158:
        e = e;
        r143 = null;
        goto L157
    L83:
        AbstractC0628Oj.m1232T(r19);
        C2214m0 r031 = C2214m0.f7706a;     // Catch: Exception -> L158
        Context r37 = r123.getContext();     // Catch: Exception -> L158
        AbstractC0295Gu.m625r(-99132140156981L);     // Catch: Exception -> L158
        C0183EA.f539a.getClass();     // Catch: Exception -> L158
        String r53 = C0183EA.f540b;     // Catch: Exception -> L158
        r031.getClass();     // Catch: Exception -> L158
        C2171l0 r032 = C2214m0.m4456c(r37, r53);     // Catch: Exception -> L158
        C0594Ns r38 = C0594Ns.f1925a;     // Catch: Exception -> L158
        String r54 = r032.f7562a;     // Catch: Exception -> L158
        String r033 = r032.f7564c;     // Catch: Exception -> L158
        this.f2976f = 1;     // Catch: Exception -> L158
        r38.getClass();     // Catch: Exception -> L158
        r020 = C0594Ns.m1165d(r142, r54, r033, this);     // Catch: Exception -> L158
        if (r020 != r7) goto L87;
        return r7;
    L69:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-100038378256437L));
    L72:
        e = e;
    L79:
        e = move-exception;
        r134 = e;
        r143 = null;
        goto L234
    L163:
        InterfaceC1416fj r152 = (InterfaceC1416fj) r3;
        int r034 = this.f2976f;
        if (r034 == 0) goto L176;
        if (r034 == 1) goto L174;
        if (r034 == 2) goto L171;
        if (r034 != 3) goto L170;
        AbstractC0628Oj.m1232T(r19);
        Object r035 = r19;
    L210:
        C0829TC r036 = (C0829TC) r035;
    L212:
        return r9;
    L170:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-391129786742837L));
    L171:
        AbstractC0628Oj.m1232T(r19);     // Catch: Exception -> L172
        Object r037 = r19;
    L205:
        C0829TC r038 = (C0829TC) r037;     // Catch: Exception -> L172
        goto L212
    L174:
        AbstractC0628Oj.m1232T(r19);     // Catch: Exception -> L172
        Object r039 = r19;
    L180:
        String r135 = (String) r039;     // Catch: Exception -> L172
        C0029Am r040 = AbstractC2809zm.f9524a;     // Catch: Exception -> L183
        r040.getClass();     // Catch: Exception -> L183
        Object r041 = r040.m4550a(ApiResponse.Companion.serializer(C0915VC.f2855b), r135);     // Catch: Exception -> L183
    L186:
        ApiResponse r042 = (ApiResponse) r041;     // Catch: Exception -> L172
        if (r042 == null) goto L190;
        int r39 = r042.getCode();     // Catch: Exception -> L172
    L189:
        int r113 = r39;
        if (r042 == null) goto L201;
        String r043 = r042.getMessage();     // Catch: Exception -> L172
        if (r043 == null) goto L201;
        if (r043.length() > 0) goto L198;
        r043 = null;
    L198:
        if (r043 == null) goto L201;
    L200:
        String r144 = r043;
        C1498hd r044 = AbstractC1499he.f5282a;     // Catch: Exception -> L172
        C2283nk r045 = AbstractC1106Zp.f3500a;     // Catch: Exception -> L172
        C0950W4 r104 = new C0950W4(r113, (InterfaceC1416fj) r12, r135, r144, r152, null);     // Catch: Exception -> L172
        this.f2976f = 2;     // Catch: Exception -> L172
        r037 = AbstractC0585Nj.m1133N(r045, r104, this);     // Catch: Exception -> L172
        if (r037 != r7) goto L205;
        return r7;
    L201:
        r043 = AbstractC0295Gu.m625r(-390996642756661L);     // Catch: Exception -> L172
        goto L200
    L190:
        r39 = -1;
        goto L189
    L183:
        e = move-exception;
        AbstractC0295Gu.m625r(-391413254584373L);     // Catch: Exception -> L172
        AbstractC0425Jv.m881a(ApiResponse.class).m445b();     // Catch: Exception -> L172
        AbstractC0295Gu.m625r(-390979462887477L);     // Catch: Exception -> L172
        e.getMessage();     // Catch: Exception -> L172
        r041 = null;
        goto L186
    L176:
        AbstractC0628Oj.m1232T(r19);
        C0594Ns r046 = C0594Ns.f1925a;     // Catch: Exception -> L172
        String r310 = ((C2171l0) r10).f7564c;     // Catch: Exception -> L172
        this.f2976f = 1;     // Catch: Exception -> L172
        r046.getClass();     // Catch: Exception -> L172
        r039 = C0594Ns.m1163a((String) r11, r310, this);     // Catch: Exception -> L172
        if (r039 != r7) goto L180;
        return r7;
    L172:
        e = move-exception;
        AbstractC0213Ey.m411i(-391018117593141L, -391091132037173L, e);
        C1498hd r27 = AbstractC1499he.f5282a;
        C2283nk r28 = AbstractC1106Zp.f3500a;
        C0993X4 r311 = new C0993X4(r152, e, r5, r8);
        this.f2976f = 3;
        r035 = AbstractC0585Nj.m1133N(r28, r311, this);
        if (r035 != r7) goto L210;
        return r7;
    L213:
        AbstractC0628Oj.m1232T(r19);
        if (this.f2976f != 0) goto L219;
        AbstractC0295Gu.m625r(-390747534653493L);
        AbstractC0295Gu.m625r(-390820549097525L);
        C1036Y4.f3309b = false;
        InterfaceC1416fj r124 = (InterfaceC1416fj) r12;
        if (r124 == null) goto L222;
        r124.mo90g((String) r11);
    L259:
        return r9;
    L222:
        return null;
    L219:
        AbstractC0295Gu.m625r(-390850613868597L);
        AbstractC0295Gu.m625r(-390373872498741L);
        String r105 = (String) r10;
        C1036Y4.f3309b = false;
        InterfaceC1416fj r312 = (InterfaceC1416fj) r3;
        if (r312 == null) goto L260;
        r312.mo90g(r105);
        goto L259
    L260:
        return null;
    }

    public C0950W4(InterfaceC0190Eb r2, C2414qe r3, C0625Og r4, C0140DA r5, C0185EC r6) {
        this.f2975e = 2;
        this.f2978h = r4;
        this.f2979i = r5;
        this.f2977g = r3;
        this.f2980j = r6;
        super(r2);
    }

    public /* synthetic */ C0950W4(String r1, Object r2, Object r3, Object r4, InterfaceC0190Eb r5, int r6) {
        this.f2975e = r6;
        this.f2977g = r1;
        this.f2980j = r2;
        this.f2978h = r3;
        this.f2979i = r4;
        super(r5);
    }
}

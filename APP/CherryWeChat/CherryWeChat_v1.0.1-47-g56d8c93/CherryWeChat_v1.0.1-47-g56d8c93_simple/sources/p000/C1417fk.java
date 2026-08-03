package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import io.github.cherrywechat.network.model.ApiResponse;
import io.github.cherrywechat.network.model.DownloadTokenData;
import io.github.cherrywechat.network.model.ThemeDetailData;
import io.github.cherrywechat.theme.ThemeProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: fk */
/* JADX INFO: loaded from: classes.dex */
public final class C1417fk extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f5008e;

    /* JADX INFO: renamed from: f */
    public int f5009f;

    /* JADX INFO: renamed from: g */
    public Object f5010g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f5011h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f5012i;

    public /* synthetic */ C1417fk(C0701QC r1, Object r2, InterfaceC0190Eb r3, int r4) {
        this.f5008e = r4;
        this.f5011h = r1;
        this.f5012i = r2;
        super(r3);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r2, Object r3) {
        InterfaceC1409fc r22 = (InterfaceC1409fc) r2;
        InterfaceC0190Eb r32 = (InterfaceC0190Eb) r3;
        switch(this.f5008e) {
            case 0: goto L15;
            case 1: goto L13;
            case 2: goto L11;
            case 3: goto L9;
            case 4: goto L7;
            default: goto L5;
        };
    L5:
        return ((C1417fk) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    L7:
        return ((C1417fk) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    L9:
        return ((C1417fk) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    L11:
        return ((C1417fk) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    L13:
        return ((C1417fk) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    L15:
        return ((C1417fk) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r11, Object r12) {
        switch(this.f5008e) {
            case 0: goto L15;
            case 1: goto L13;
            case 2: goto L11;
            case 3: goto L9;
            case 4: goto L7;
            default: goto L5;
        };
    L5:
        return new C1417fk((C0701QC) this.f5011h, (String) this.f5012i, r11, 5);
    L7:
        return new C1417fk((C0701QC) this.f5011h, (Activity) this.f5012i, r11, 4);
    L9:
        return new C1417fk((String) this.f5010g, (C0784SA) this.f5011h, (Activity) this.f5012i, r11, 3);
    L11:
        return new C1417fk((String) this.f5010g, (Bundle) this.f5011h, (String) this.f5012i, r11, 2);
    L13:
        return new C1417fk((C2288np) this.f5010g, (String) this.f5011h, (String) this.f5012i, r11, 1);
    L15:
        return new C1417fk((C1505hk) this.f5010g, (C0140DA) this.f5011h, (C0185EC) this.f5012i, r11, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v0, types: [Eb] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r17) {
        int r0 = this.f5008e;
        ?? r2 = 0;
        Object r22 = null;
        int r7 = 3;
        int r4 = 0;
        C0829TC r8 = C0829TC.f2620a;
        Object r5 = this.f5012i;
        EnumC1453gc r9 = EnumC1453gc.f5148a;
        Object r10 = this.f5011h;
        switch(r0) {
            case 0: goto L159;
            case 1: goto L112;
            case 2: goto L98;
            case 3: goto L52;
            case 4: goto L26;
            default: goto L4;
        };
    L4:
        C0701QC r102 = (C0701QC) r10;
        int r02 = this.f5009f;
        if (r02 == 0) goto L10;
        if (r02 != 1) goto L9;
        C0701QC r03 = (C0701QC) this.f5010g;
        AbstractC0628Oj.m1232T(r17);
        C0701QC r1 = r03;
        Object r04 = r17;
    L14:
        r1.f2266m = (List) r04;
        EditText r05 = r102.f2258e;
        if (r05 == null) goto L20;
        Editable r06 = r05.getText();
        if (r06 == null) goto L20;
        String r07 = r06.toString();
        if (r07 == null) goto L20;
    L21:
        r102.m1431e(r07);
        C0701QC.m1430a(r102);
        C0987Wz r08 = r102.f2255b;
        if (r08 == null) goto L24;
        r08.setRefreshing(false);
    L24:
        Toast.makeText(r102.m1432f(), AbstractC0295Gu.m625r(-486727168817205L) + ((String) r5), 0).show();
        return r8;
    L20:
        r07 = AbstractC0295Gu.m625r(-486722873849909L);
        goto L21
    L9:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-486765823522869L));
    L10:
        AbstractC0628Oj.m1232T(r17);
        C0357IC r09 = C0357IC.f1218a;
        this.f5010g = r102;
        this.f5009f = 1;
        r09.getClass();
        r04 = C0357IC.m792d(true, this);
        if (r04 == r9) goto L260;
        r1 = r102;
        goto L14
    L260:
        return r9;
    L26:
        C0701QC r103 = (C0701QC) r10;
        int r010 = this.f5009f;
        if (r010 == 0) goto L36;
        if (r010 != 1) goto L35;
        C0701QC r011 = (C0701QC) this.f5010g;
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L32
        C0701QC r12 = r011;
        Object r012 = r17;
    L41:
        r12.f2266m = (List) r012;     // Catch: Exception -> L32
        EditText r013 = r103.f2258e;     // Catch: Exception -> L32
        if (r013 == null) goto L47;
        Editable r014 = r013.getText();     // Catch: Exception -> L32
        if (r014 == null) goto L47;
        String r015 = r014.toString();     // Catch: Exception -> L32
        if (r015 == null) goto L47;
    L48:
        r103.m1431e(r015);     // Catch: Exception -> L32
        C0701QC.m1430a(r103);     // Catch: Exception -> L32
        return r8;
    L47:
        r015 = AbstractC0295Gu.m625r(-486396456335413L);     // Catch: Exception -> L32
        goto L48
    L35:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-486439406008373L));
    L36:
        AbstractC0628Oj.m1232T(r17);
        C0357IC r016 = C0357IC.f1218a;     // Catch: Exception -> L32
        this.f5010g = r103;     // Catch: Exception -> L32
        this.f5009f = 1;     // Catch: Exception -> L32
        r016.getClass();     // Catch: Exception -> L32
        r012 = C0357IC.m792d(false, this);     // Catch: Exception -> L32
        if (r012 == r9) goto L261;
        r12 = r103;
        goto L41
    L261:
        return r9;
    L32:
        e = move-exception;
        Toast.makeText((Activity) r5, AbstractC0213Ey.m405c(-486400751302709L, new StringBuilder(), e), 0).show();
        return r8;
    L52:
        final C0784SA r104 = (C0784SA) r10;
        int r017 = this.f5009f;
        if (r017 == 0) goto L59;
        if (r017 != 1) goto L58;
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L96
        Object r018 = r17;
    L63:
        String r019 = (String) r018;     // Catch: Exception -> L96
        C0029Am r13 = AbstractC2809zm.f9524a;     // Catch: Exception -> L66
        r13.getClass();     // Catch: Exception -> L66
        r22 = r13.m4550a(ApiResponse.Companion.serializer(ThemeDetailData.Companion.serializer()), r019);     // Catch: Exception -> L66
    L69:
        ApiResponse r23 = (ApiResponse) r22;     // Catch: Exception -> L96
        if (r23 != null) goto L72;
    L94:
        C0784SA.m1604e(r104);     // Catch: Exception -> L96
        return r8;
    L72:
        if (r23.getCode() != 0) goto L94;
        ThemeDetailData r020 = (ThemeDetailData) r23.getData();     // Catch: Exception -> L96
        String r14 = r020.getName();     // Catch: Exception -> L96
        String r24 = r020.getAuthor();     // Catch: Exception -> L96
        final double r3 = r020.getPrice();     // Catch: Exception -> L96
        TextView r72 = r104.f2478e;     // Catch: Exception -> L96
        if (r72 == null) goto L77;
        r72.setText(r14);     // Catch: Exception -> L96
    L77:
        TextView r15 = r104.f2479f;     // Catch: Exception -> L96
        if (r15 == null) goto L81;
        r15.setText(AbstractC0295Gu.m625r(-491696445978677L) + r24);     // Catch: Exception -> L96
    L81:
        if (r3 <= 0.0d) goto L83;
        String r16 = AbstractC0295Gu.m625r(-491713625847861L) + r3;     // Catch: Exception -> L96
    L84:
        TextView r25 = r104.f2480g;     // Catch: Exception -> L96
        if (r25 == null) goto L87;
        r25.setText(r16);     // Catch: Exception -> L96
    L87:
        List<String> r021 = r020.getScreenshots();     // Catch: Exception -> L96
        RecyclerView r18 = r104.f2476c;     // Catch: Exception -> L96
        if (r18 == null) goto L90;
        r18.setAdapter(new C0398JA(r104, r021));     // Catch: Exception -> L96
    L90:
        TextView r022 = r104.f2480g;     // Catch: Exception -> L96
        if (r022 == null) goto L93;
        final Activity r52 = (Activity) r5;     // Catch: Exception -> L96
        r022.setOnClickListener(new ViewOnClickListenerC0656PA(r104, r52, r3));     // Catch: Exception -> L96
    L93:
        C0784SA.m1603a(r104);     // Catch: Exception -> L96
        return r8;
    L83:
        r16 = AbstractC0295Gu.m625r(-491752280553525L);     // Catch: Exception -> L96
        goto L84
    L66:
        e = move-exception;
        AbstractC0295Gu.m625r(-491563301992501L);     // Catch: Exception -> L96
        AbstractC0425Jv.m881a(ApiResponse.class).m445b();     // Catch: Exception -> L96
        AbstractC0295Gu.m625r(-491679266109493L);     // Catch: Exception -> L96
        e.getMessage();     // Catch: Exception -> L96
        goto L69
    L58:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-492323511203893L));
    L59:
        AbstractC0628Oj.m1232T(r17);
        C0594Ns r023 = C0594Ns.f1925a;     // Catch: Exception -> L96
        String r19 = (String) this.f5010g;     // Catch: Exception -> L96
        this.f5009f = 1;     // Catch: Exception -> L96
        r023.getClass();     // Catch: Exception -> L96
        r018 = C0594Ns.m1166e(AbstractC0295Gu.m625r(-399749786105909L) + r19, this);     // Catch: Exception -> L96
        if (r018 != r9) goto L63;
        return r9;
    L96:
        C0784SA.m1604e(r104);
        return r8;
    L98:
        Bundle r105 = (Bundle) r10;
        int r024 = this.f5009f;
        if (r024 == 0) goto L104;
        if (r024 != 1) goto L103;
        AbstractC0628Oj.m1232T(r17);
        Object r025 = r17;
    L107:
        String r026 = (String) r025;
        if (r026 == null) goto L267;
        r105.putByteArray(AbstractC0295Gu.m625r(-174337017509941L), AbstractC2675wh.m5242e0(new File(r026)));
        AbstractC2248ms.f7951a.getClass();
        C0668Pg.m1332m(r105, (String) r5);
        return r8;
    L267:
        return r8;
    L103:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-174422916855861L));
    L104:
        AbstractC0628Oj.m1232T(r17);
        C0668Pg r027 = AbstractC2248ms.f7951a;
        String r110 = (String) this.f5010g;
        this.f5009f = 1;
        r025 = C0668Pg.m1326d(r027, r110, this);
        if (r025 != r9) goto L107;
        return r9;
    L112:
        String r53 = (String) r5;
        String r106 = (String) r10;
        C2288np r122 = (C2288np) this.f5010g;
        int r028 = this.f5009f;
        if (r028 == 0) goto L125;
        if (r028 == 1) goto L123;
        if (r028 == 2) goto L117;
        if (r028 == 3) goto L117;
        throw new IllegalStateException(AbstractC0295Gu.m625r(-81101867448373L));
    L117:
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L119
        return r8;
    L123:
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L119
        Object r029 = r17;
    L129:
        String r030 = (String) r029;     // Catch: Exception -> L119
        C0029Am r132 = AbstractC2809zm.f9524a;     // Catch: Exception -> L132
        r132.getClass();     // Catch: Exception -> L132
        Object r031 = r132.m4550a(ApiResponse.Companion.serializer(C0915VC.f2855b), r030);     // Catch: Exception -> L132
    L135:
        ApiResponse r032 = (ApiResponse) r031;     // Catch: Exception -> L119
        if (r032 == null) goto L138;
        int r32 = r032.getCode();     // Catch: Exception -> L119
    L139:
        if (r032 == null) goto L146;
        String r033 = r032.getMessage();     // Catch: Exception -> L119
        if (r033 == null) goto L146;
        if (r033.length() <= 0) goto L145;
        r2 = r033;
    L145:
        if (r2 == 0) goto L146;
    L147:
        if (r32 != 0) goto L149;
        r122.m4623g(AbstractC0295Gu.m625r(-80376017975349L), false);     // Catch: Exception -> L119
        C2288np.m4621e(r122, r106, r53);     // Catch: Exception -> L119
        this.f5009f = 2;     // Catch: Exception -> L119
        if (C2288np.m4620a(r122, r53, this) == r9) goto L271;
        return r8;
    L271:
        return r9;
    L149:
        if (r32 == 400) goto L151;
        r122.m4623g(AbstractC0295Gu.m625r(-80491982092341L).concat(r2), true);     // Catch: Exception -> L119
        r122.m4622f(false);     // Catch: Exception -> L119
        return r8;
    L151:
        r122.m4623g(AbstractC0295Gu.m625r(-80431852550197L), false);     // Catch: Exception -> L119
        C2288np.m4621e(r122, r106, r53);     // Catch: Exception -> L119
        this.f5009f = 3;     // Catch: Exception -> L119
        if (C2288np.m4620a(r122, r53, this) == r9) goto L271;
        return r8;
    L146:
        r2 = AbstractC0295Gu.m625r(-80354543138869L);     // Catch: Exception -> L119
        goto L147
    L138:
        r32 = -1;
        goto L139
    L132:
        e = move-exception;
        AbstractC0295Gu.m625r(-80771154966581L);     // Catch: Exception -> L119
        AbstractC0425Jv.m881a(ApiResponse.class).m445b();     // Catch: Exception -> L119
        AbstractC0295Gu.m625r(-80337363269685L);     // Catch: Exception -> L119
        e.getMessage();     // Catch: Exception -> L119
        r031 = null;
        goto L135
    L125:
        AbstractC0628Oj.m1232T(r17);
        r122.m4623g(AbstractC0295Gu.m625r(-80728205293621L), false);     // Catch: Exception -> L119
        C1498hd r034 = AbstractC1499he.f5282a;     // Catch: Exception -> L119
        ExecutorC0921Vc r035 = ExecutorC0921Vc.f2876b;     // Catch: Exception -> L119
        C2202lp r133 = new C2202lp(r106, r53, r2, r4);     // Catch: Exception -> L119
        this.f5009f = 1;     // Catch: Exception -> L119
        r029 = AbstractC0585Nj.m1133N(r035, r133, this);     // Catch: Exception -> L119
        if (r029 != r9) goto L129;
    L119:
        e = move-exception;
        r122.m4623g(AbstractC0213Ey.m405c(-80517751896117L, new StringBuilder(), e), true);
        r122.m4622f(false);
        return r8;
    L159:
        C0185EC r123 = (C0185EC) r5;
        C0140DA r107 = (C0140DA) r10;
        C1505hk r134 = (C1505hk) this.f5010g;
        InterfaceC0190Eb r142 = null;
        switch(this.f5009f) {
            case 0: goto L175;
            case 1: goto L173;
            case 2: goto L169;
            case 3: goto L164;
            case 4: goto L167;
            case 5: goto L164;
            case 6: goto L163;
            default: goto L162;
        };
    L163:
        AbstractC0628Oj.m1232T(r17);
        return r8;
    L164:
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L165
        return r8;
    L167:
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L165
        Object r036 = r17;
    L201:
        byte[] r037 = (byte[]) r036;     // Catch: Exception -> L165
        C0183EA r26 = C0183EA.f539a;     // Catch: Exception -> L165
        String r33 = r107.f364a;     // Catch: Exception -> L165
        r26.getClass();     // Catch: Exception -> L165
        File r111 = new File(C0183EA.m377e(r33));     // Catch: Exception -> L165
        if (r111.exists() == false) goto L204;
    L208:
        File r112 = new File(C0183EA.m378f(r107.f364a));     // Catch: Exception -> L165
        FileOutputStream r27 = new FileOutputStream(r112);     // Catch: Exception -> L165
        r27.write(r037);     // Catch: Throwable -> L213
        r27.close();     // Catch: Exception -> L165
        String r038 = r112.getAbsolutePath();     // Catch: Exception -> L165
        AbstractC0295Gu.m625r(-73482595465269L);     // Catch: Exception -> L165
        ThemeProvider.extractThemeFiles(r038);     // Catch: Exception -> L165
        C1498hd r039 = AbstractC1499he.f5282a;     // Catch: Exception -> L165
        C2283nk r040 = AbstractC1106Zp.f3500a;     // Catch: Exception -> L165
        C0993X4 r113 = new C0993X4(r134, r123, r142, r7);     // Catch: Exception -> L165
        this.f5009f = 5;     // Catch: Exception -> L165
        if (AbstractC0585Nj.m1133N(r040, r113, this) == r9) goto L242;
        return r8;
    L242:
        return r9;
    L213:
        th = move-exception;
        throw th;     // Catch: Throwable -> L216
    L216:
        th = move-exception;
        AbstractC0585Nj.m1138f(r27, th);     // Catch: Exception -> L165
        throw th;     // Catch: Exception -> L165
    L204:
        if (r111.mkdirs() == true) goto L208;
        throw new Exception(AbstractC0295Gu.m625r(-73443940759605L));     // Catch: Exception -> L165
    L169:
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L171
        return r8;
    L173:
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L165
        Object r041 = r17;
    L179:
        String r042 = (String) r041;     // Catch: Exception -> L237
        C0029Am r28 = AbstractC2809zm.f9524a;     // Catch: Exception -> L182
        r28.getClass();     // Catch: Exception -> L182
        Object r043 = r28.m4550a(ApiResponse.Companion.serializer(DownloadTokenData.Companion.serializer()), r042);     // Catch: Exception -> L182
    L185:
        ApiResponse r044 = (ApiResponse) r043;     // Catch: Exception -> L171
        if (r044 != null) goto L188;
    L219:
        if (r044 == null) goto L226;
        String r29 = r044.getMessage();     // Catch: Exception -> L171
        if (r29 == null) goto L226;
        if (r29.length() != 0) goto L225;
        r29 = r044.getMsg();     // Catch: Exception -> L171
    L225:
        if (r29 == null) goto L226;
    L227:
        C1498hd r045 = AbstractC1499he.f5282a;     // Catch: Exception -> L171
        C2283nk r046 = AbstractC1106Zp.f3500a;     // Catch: Exception -> L171
        C1084Z9 r34 = new C1084Z9(r134, r29, r123, null);     // Catch: Exception -> L171
        this.f5009f = 2;     // Catch: Exception -> L171
        if (AbstractC0585Nj.m1133N(r046, r34, this) == r9) goto L242;
        return r8;
    L226:
        r29 = AbstractC0295Gu.m625r(-73418170955829L);     // Catch: Exception -> L171
        goto L227
    L188:
        if (r044.getCode() != 0) goto L219;
        DownloadTokenData r047 = (DownloadTokenData) r044.getData();     // Catch: Exception -> L171
        if (r047 == null) goto L196;
        String r048 = r047.getToken();     // Catch: Exception -> L171
        if (r048 == null) goto L196;
    L195:
        String r210 = r048;
        C0594Ns r049 = C0594Ns.f1925a;     // Catch: Exception -> L165
        C0183EA.f539a.getClass();     // Catch: Exception -> L165
        String r114 = C0183EA.f541c;     // Catch: Exception -> L165
        long r35 = r107.f368e;     // Catch: Exception -> L165
        C2479s r54 = new C2479s(r7, r134);     // Catch: Exception -> L165
        this.f5009f = 4;     // Catch: Exception -> L165
        r036 = r049.m1169b(r114, r210, r35, r54, this);     // Catch: Exception -> L165
        if (r036 != r9) goto L201;
    L196:
        r048 = AbstractC0295Gu.m625r(-73439645792309L);     // Catch: Exception -> L171
        goto L195
    L182:
        e = move-exception;
        AbstractC0295Gu.m625r(-72735271155765L);     // Catch: Exception -> L171
        AbstractC0425Jv.m881a(ApiResponse.class).m445b();     // Catch: Exception -> L171
        AbstractC0295Gu.m625r(-73400991086645L);     // Catch: Exception -> L171
        e.getMessage();     // Catch: Exception -> L171
        r043 = null;
        goto L185
    L175:
        AbstractC0628Oj.m1232T(r17);
        C2214m0 r050 = C2214m0.f7706a;     // Catch: Exception -> L237
        Context r211 = r134.getContext();     // Catch: Exception -> L237
        AbstractC0295Gu.m625r(-72666551679029L);     // Catch: Exception -> L237
        C0183EA.f539a.getClass();     // Catch: Exception -> L237
        String r42 = C0183EA.f540b;     // Catch: Exception -> L237
        r050.getClass();     // Catch: Exception -> L237
        C2171l0 r051 = C2214m0.m4456c(r211, r42);     // Catch: Exception -> L237
        C0594Ns r212 = C0594Ns.f1925a;     // Catch: Exception -> L237
        String r43 = r107.f364a;     // Catch: Exception -> L237
        String r55 = r051.f7562a;     // Catch: Exception -> L237
        String r052 = r051.f7564c;     // Catch: Exception -> L237
        this.f5009f = 1;     // Catch: Exception -> L237
        r212.getClass();     // Catch: Exception -> L237
        r041 = C0594Ns.m1165d(r43, r55, r052, this);     // Catch: Exception -> L237
        if (r041 != r9) goto L179;
    L162:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-73572789778485L));
    L171:
        e = move-exception;
        C1498hd r053 = AbstractC1499he.f5282a;     // Catch: Exception -> L237
        C2283nk r108 = AbstractC1106Zp.f3500a;     // Catch: Exception -> L237
        C0185EC r36 = r123;
        C1505hk r115 = r134;
        InterfaceC0190Eb r44 = null;
        C1373ek r054 = new C1373ek(r115, e, r36, r44, 1);     // Catch: Exception -> L235
        this.f5009f = 3;     // Catch: Exception -> L235
        if (AbstractC0585Nj.m1133N(r108, r054, this) == r9) goto L242;
        return r8;
    L235:
        e = e;
    L236:
        Exception r213 = e;
    L239:
        C1498hd r055 = AbstractC1499he.f5282a;
        C2283nk r73 = AbstractC1106Zp.f3500a;
        C1373ek r056 = new C1373ek(r115, r213, r36, r44, 0);
        this.f5009f = 6;
        if (AbstractC0585Nj.m1133N(r73, r056, this) == r9) goto L242;
        return r8;
    L237:
        e = e;
        r36 = r123;
        r115 = r134;
        r44 = null;
    L165:
        e = move-exception;
        r213 = e;
        r36 = r123;
        r115 = r134;
        r44 = null;
        goto L239
    }

    public /* synthetic */ C1417fk(Object r1, Object r2, Object r3, InterfaceC0190Eb r4, int r5) {
        this.f5008e = r5;
        this.f5010g = r1;
        this.f5011h = r2;
        this.f5012i = r3;
        super(r4);
    }
}

package p000;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.cherrywechat.R;
import io.github.cherrywechat.network.model.AboutData;
import io.github.cherrywechat.network.model.DeveloperGroups;
import io.github.cherrywechat.network.model.FAQCategory;
import io.github.cherrywechat.network.model.FAQItem;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: l */
/* JADX INFO: loaded from: classes.dex */
public final class C2170l extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7559e;

    /* JADX INFO: renamed from: f */
    public int f7560f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f7561g;

    public /* synthetic */ C2170l(InterfaceC0972Wk r1, InterfaceC0190Eb r2, int r3) {
        this.f7559e = r3;
        this.f7561g = r1;
        super(r2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r2, Object r3) {
        InterfaceC1409fc r22 = (InterfaceC1409fc) r2;
        InterfaceC0190Eb r32 = (InterfaceC0190Eb) r3;
        switch(this.f7559e) {
            case 0: goto L19;
            case 1: goto L16;
            case 2: goto L15;
            case 3: goto L13;
            case 4: goto L10;
            case 5: goto L8;
            case 6: goto L7;
            default: goto L5;
        };
    L8:
        C2170l r23 = (C2170l) mo447h(r32, r22);
        C0829TC r33 = C0829TC.f2620a;
        r23.mo448i(r33);
        return r33;
    L10:
        C2170l r24 = (C2170l) mo447h(r32, r22);
        C0829TC r34 = C0829TC.f2620a;
        r24.mo448i(r34);
        return r34;
    L16:
        C2170l r25 = (C2170l) mo447h(r32, r22);
        C0829TC r35 = C0829TC.f2620a;
        r25.mo448i(r35);
        return r35;
    L5:
        return ((C2170l) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    L7:
        return ((C2170l) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    L13:
        return ((C2170l) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    L15:
        return ((C2170l) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    L19:
        return ((C2170l) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r4, Object r5) {
        switch(this.f7559e) {
            case 0: goto L19;
            case 1: goto L17;
            case 2: goto L15;
            case 3: goto L13;
            case 4: goto L11;
            case 5: goto L9;
            case 6: goto L7;
            default: goto L5;
        };
    L5:
        return new C2170l((C2136kD) this.f7561g, r4, 7);
    L7:
        return new C2170l((C0956WA) this.f7561g, r4, 6);
    L9:
        return new C2170l((InterfaceC1416fj) this.f7561g, this.f7560f, r4, 5);
    L11:
        return new C2170l((C1505hk) this.f7561g, this.f7560f, r4, 4);
    L13:
        return new C2170l((C0670Pi) this.f7561g, r4, 3);
    L15:
        return new C2170l((C1011Xg) this.f7561g, r4, 2);
    L17:
        return new C2170l((C2414qe) this.f7561g, this.f7560f, r4, 1);
    L19:
        return new C2170l((C2213m) this.f7561g, r4, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r14) {
        int r0 = this.f7559e;
        int r1 = 0;
        ViewGroup r2 = null;
        EnumC1453gc r3 = EnumC1453gc.f5148a;
        int r4 = 1;
        C0829TC r5 = C0829TC.f2620a;
        Object r6 = this.f7561g;
        switch(r0) {
            case 0: goto L109;
            case 1: goto L107;
            case 2: goto L71;
            case 3: goto L42;
            case 4: goto L40;
            case 5: goto L38;
            case 6: goto L22;
            default: goto L4;
        };
    L4:
        C2136kD r62 = (C2136kD) r6;
        int r02 = this.f7560f;
        if (r02 == 0) goto L13;
        if (r02 != 1) goto L12;
        AbstractC0628Oj.m1232T(r14);     // Catch: Exception -> L9
    L17:
        C2136kD.m4317a(r62, (List) r14);     // Catch: Exception -> L9
    L21:
        return r5;
    L12:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-820416062945333L));
    L13:
        AbstractC0628Oj.m1232T(r14);
        C1456gf r142 = AbstractC1077Z2.f3440a;     // Catch: Exception -> L9
        this.f7560f = 1;     // Catch: Exception -> L9
        r142.getClass();     // Catch: Exception -> L9
        C1498hd r143 = AbstractC1499he.f5282a;     // Catch: Exception -> L9
        r14 = AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C1034Y2(r4, null == true ? 1 : 0), this);     // Catch: Exception -> L9
        if (r14 != r3) goto L17;
        return r3;
    L9:
        e = move-exception;
        r62.m4318e(AbstractC0295Gu.m625r(-820368818305077L) + e.getMessage());
        goto L21
    L22:
        C0956WA r63 = (C0956WA) r6;
        int r03 = this.f7560f;
        if (r03 == 0) goto L29;
        if (r03 != 1) goto L28;
        AbstractC0628Oj.m1232T(r14);     // Catch: Exception -> L35
    L33:
        C0956WA.m1826e(r63, C0956WA.m1825a(r63, (String) r14));     // Catch: Exception -> L35
    L37:
        return r5;
    L28:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-490038588602421L));
    L29:
        AbstractC0628Oj.m1232T(r14);
        C0594Ns r144 = C0594Ns.f1925a;     // Catch: Exception -> L35
        this.f7560f = 1;     // Catch: Exception -> L35
        r144.getClass();     // Catch: Exception -> L35
        r14 = C0594Ns.m1166e(AbstractC0295Gu.m625r(-400183577802805L), this);     // Catch: Exception -> L35
        if (r14 != r3) goto L33;
        return r3;
    L35:
        C0956WA.m1826e(r63, C0452Kf.f1484a);
        goto L37
    L38:
        AbstractC0628Oj.m1232T(r14);
        ((InterfaceC1416fj) r6).mo90g(new Integer(this.f7560f));
        return r5;
    L40:
        AbstractC0628Oj.m1232T(r14);
        TextView r145 = ((C1505hk) r6).f5341e;
        StringBuilder r04 = new StringBuilder();
        r04.append(this.f7560f);
        r04.append('%');
        r145.setText(r04.toString());
        return r5;
    L42:
        C0670Pi r64 = (C0670Pi) r6;
        int r05 = this.f7560f;
        if (r05 == 0) goto L49;
        if (r05 != 1) goto L48;
        AbstractC0628Oj.m1232T(r14);     // Catch: Exception -> L55
    L53:
        C0670Pi.m1336e(r64, C0670Pi.m1335a(r64, (String) r14));     // Catch: Exception -> L55
    L70:
        return r5;
    L48:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-78224239360053L));
    L49:
        AbstractC0628Oj.m1232T(r14);
        C0594Ns r146 = C0594Ns.f1925a;     // Catch: Exception -> L55
        this.f7560f = 1;     // Catch: Exception -> L55
        r146.getClass();     // Catch: Exception -> L55
        r14 = C0594Ns.m1166e(AbstractC0295Gu.m625r(-402112018118709L), this);     // Catch: Exception -> L55
        if (r14 != r3) goto L53;
        return r3;
    L55:
        AbstractC0295Gu.m625r(-78164109817909L);
        AbstractC0295Gu.m625r(-78194174588981L);
        LinearLayout r06 = r64.f2137a;
        if (r06 != null) goto L58;
        AbstractC0295Gu.m625r(-77004468647989L);
        r06 = null;
    L58:
        int r07 = r06.getChildCount();
        if (r07 <= 2) goto L64;
        LinearLayout r42 = r64.f2137a;
        if (r42 != null) goto L63;
        AbstractC0295Gu.m625r(-77064598190133L);
        r42 = null;
    L63:
        r42.removeViews(2, r07 - 2);
    L64:
        ViewGroup r08 = r64.f2137a;
        if (r08 != null) goto L67;
        AbstractC0295Gu.m625r(-77124727732277L);
    L68:
        TextView r09 = new TextView(r64.getContext());
        r09.setText(AbstractC0295Gu.m625r(-77184857274421L));
        r09.setTextSize(16.0f);
        r09.setTextColor(r09.getContext().getColor(R.color.textSummary));
        r09.setGravity(17);
        r09.setPadding(0, AbstractC0295Gu.m616i(32), 0, AbstractC0295Gu.m616i(32));
        r2.addView(r09);
        goto L70
    L67:
        r2 = r08;
        goto L68
    L71:
        C1011Xg r65 = (C1011Xg) r6;
        LinearLayout r010 = r65.f3218c;
        int r7 = this.f7560f;
        if (r7 == 0) goto L78;
        if (r7 != 1) goto L77;
        AbstractC0628Oj.m1232T(r14);     // Catch: Exception -> L104
    L82:
        r010.removeAllViews();     // Catch: Exception -> L104
        Iterator r147 = ((List) r14).iterator();     // Catch: Exception -> L104
        int r32 = 0;
    L84:
        if (r147.hasNext() == false) goto L106;
        Object r72 = r147.next();     // Catch: Exception -> L104
        int r8 = r32 + 1;     // Catch: Exception -> L104
        if (r32 < 0) goto L102;
        FAQCategory r73 = (FAQCategory) r72;     // Catch: Exception -> L104
        if (r32 <= 0) goto L90;
        C1011Xg.m1902a(r65);     // Catch: Exception -> L104
    L90:
        C1011Xg.m1903e(r65, r73.getCategoryName());     // Catch: Exception -> L104
        LinearLayout r33 = new LinearLayout(r65.getContext());     // Catch: Exception -> L104
        r33.setOrientation(1);     // Catch: Exception -> L104
        r33.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));     // Catch: Exception -> L104
        r33.setBackground(new ColorDrawable(r33.getContext().getColor(R.color.colorForeground)));     // Catch: Exception -> L104
        r33.setOutlineProvider(new C2122k(3));     // Catch: Exception -> L104
        r33.setClipToOutline(true);     // Catch: Exception -> L104
        r65.m1906h(r010, r33);     // Catch: Exception -> L104
        Iterator r74 = AbstractC2453ra.m4904n0(r73.getItems(), new C0963Wb(3)).iterator();     // Catch: Exception -> L104
        int r9 = 0;
    L92:
        if (r74.hasNext() == false) goto L101;
        Object r10 = r74.next();     // Catch: Exception -> L104
        int r11 = r9 + 1;     // Catch: Exception -> L104
        if (r9 < 0) goto L99;
        FAQItem r102 = (FAQItem) r10;     // Catch: Exception -> L104
        if (r9 <= 0) goto L98;
        C1011Xg.m1904f(r65);     // Catch: Exception -> L104
    L98:
        C1011Xg.m1905g(r65, new C0968Wg(r102.getQuestion(), r102.getAnswer()), r33);     // Catch: Exception -> L104
        r9 = r11;
        goto L92
    L99:
        AbstractC2496sa.m4978c0();     // Catch: Exception -> L104
        throw null;     // Catch: Exception -> L104
    L101:
        r32 = r8;
        goto L84
    L102:
        AbstractC2496sa.m4978c0();     // Catch: Exception -> L104
        throw null;     // Catch: Exception -> L104
    L106:
        return r5;
    L77:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-813299302135861L));
    L78:
        AbstractC0628Oj.m1232T(r14);
        C1456gf r148 = AbstractC1077Z2.f3440a;     // Catch: Exception -> L104
        this.f7560f = 1;     // Catch: Exception -> L104
        r148.getClass();     // Catch: Exception -> L104
        C1498hd r149 = AbstractC1499he.f5282a;     // Catch: Exception -> L104
        r14 = AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C1034Y2(r1, null == true ? 1 : 0), this);     // Catch: Exception -> L104
        if (r14 != r3) goto L82;
        return r3;
    L104:
        AbstractC0295Gu.m625r(-813166158149685L);
        AbstractC0295Gu.m625r(-813200517888053L);
        goto L106
    L107:
        AbstractC0628Oj.m1232T(r14);
        ((C2414qe) r6).m4857b(this.f7560f);
        return r5;
    L109:
        C2213m r66 = (C2213m) r6;
        int r011 = this.f7560f;
        if (r011 == 0) goto L118;
        if (r011 != 1) goto L117;
        AbstractC0628Oj.m1232T(r14);     // Catch: Exception -> L114
    L122:
        AboutData r1410 = C2213m.m4445a(r66, (String) r14);     // Catch: Exception -> L114
        if (r1410 == null) goto L128;
        C2213m.m4446e(r66, r1410.getAppInfo());     // Catch: Exception -> L114
        C2213m.m4447f(r66, r1410.getFeatures());     // Catch: Exception -> L114
        DeveloperGroups r012 = r1410.getDevelopers();     // Catch: Exception -> L114
        r66.f7704d = r012.getCore();     // Catch: Exception -> L114
        r66.f7705e = r012.getSpecial();     // Catch: Exception -> L114
        C2213m.m4448g(r66, r1410.getLinks());     // Catch: Exception -> L114
    L128:
        return r5;
    L117:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-817950751717429L));
    L118:
        AbstractC0628Oj.m1232T(r14);
        C0594Ns r1411 = C0594Ns.f1925a;     // Catch: Exception -> L114
        this.f7560f = 1;     // Catch: Exception -> L114
        r1411.getClass();     // Catch: Exception -> L114
        r14 = C0594Ns.m1166e(AbstractC0295Gu.m625r(-400578714794037L), this);     // Catch: Exception -> L114
        if (r14 != r3) goto L122;
        return r3;
    L114:
        e = move-exception;
        AbstractC0295Gu.m625r(-817894917142581L);
        e.getMessage();
        goto L128
    }

    public /* synthetic */ C2170l(Object r1, int r2, InterfaceC0190Eb r3, int r4) {
        this.f7559e = r4;
        this.f7561g = r1;
        this.f7560f = r2;
        super(r3);
    }
}

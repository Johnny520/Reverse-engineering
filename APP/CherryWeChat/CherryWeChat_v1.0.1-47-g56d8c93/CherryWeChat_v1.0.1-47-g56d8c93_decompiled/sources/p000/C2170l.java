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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2170l(InterfaceC0972Wk interfaceC0972Wk, InterfaceC0190Eb interfaceC0190Eb, int i) {
        super(interfaceC0190Eb);
        this.f7559e = i;
        this.f7561g = interfaceC0972Wk;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) throws Throwable {
        InterfaceC1409fc interfaceC1409fc = (InterfaceC1409fc) obj;
        InterfaceC0190Eb interfaceC0190Eb = (InterfaceC0190Eb) obj2;
        switch (this.f7559e) {
            case 1:
                C2170l c2170l = (C2170l) mo447h(interfaceC0190Eb, interfaceC1409fc);
                C0829TC c0829tc = C0829TC.f2620a;
                c2170l.mo448i(c0829tc);
                break;
            case 4:
                C2170l c2170l2 = (C2170l) mo447h(interfaceC0190Eb, interfaceC1409fc);
                C0829TC c0829tc2 = C0829TC.f2620a;
                c2170l2.mo448i(c0829tc2);
                break;
            case 5:
                C2170l c2170l3 = (C2170l) mo447h(interfaceC0190Eb, interfaceC1409fc);
                C0829TC c0829tc3 = C0829TC.f2620a;
                c2170l3.mo448i(c0829tc3);
                break;
        }
        return ((C2170l) mo447h(interfaceC0190Eb, interfaceC1409fc)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        switch (this.f7559e) {
            case 0:
                return new C2170l((C2213m) this.f7561g, interfaceC0190Eb, 0);
            case 1:
                return new C2170l((C2414qe) this.f7561g, this.f7560f, interfaceC0190Eb, 1);
            case 2:
                return new C2170l((C1011Xg) this.f7561g, interfaceC0190Eb, 2);
            case 3:
                return new C2170l((C0670Pi) this.f7561g, interfaceC0190Eb, 3);
            case 4:
                return new C2170l((C1505hk) this.f7561g, this.f7560f, interfaceC0190Eb, 4);
            case 5:
                return new C2170l((InterfaceC1416fj) this.f7561g, this.f7560f, interfaceC0190Eb, 5);
            case 6:
                return new C2170l((C0956WA) this.f7561g, interfaceC0190Eb, 6);
            default:
                return new C2170l((C2136kD) this.f7561g, interfaceC0190Eb, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object obj) throws Throwable {
        int i = this.f7559e;
        int i2 = 0;
        ViewGroup viewGroup = null;
        EnumC1453gc enumC1453gc = EnumC1453gc.f5148a;
        int i3 = 1;
        C0829TC c0829tc = C0829TC.f2620a;
        Object obj2 = this.f7561g;
        switch (i) {
            case 0:
                C2213m c2213m = (C2213m) obj2;
                int i4 = this.f7560f;
                try {
                    if (i4 == 0) {
                        AbstractC0628Oj.m1232T(obj);
                        C0594Ns c0594Ns = C0594Ns.f1925a;
                        this.f7560f = 1;
                        c0594Ns.getClass();
                        obj = C0594Ns.m1166e(AbstractC0295Gu.m625r(-400578714794037L), this);
                        if (obj == enumC1453gc) {
                            return enumC1453gc;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException(AbstractC0295Gu.m625r(-817950751717429L));
                        }
                        AbstractC0628Oj.m1232T(obj);
                    }
                    AboutData aboutDataM4445a = C2213m.m4445a(c2213m, (String) obj);
                    if (aboutDataM4445a != null) {
                        C2213m.m4446e(c2213m, aboutDataM4445a.getAppInfo());
                        C2213m.m4447f(c2213m, aboutDataM4445a.getFeatures());
                        DeveloperGroups developers = aboutDataM4445a.getDevelopers();
                        c2213m.f7704d = developers.getCore();
                        c2213m.f7705e = developers.getSpecial();
                        C2213m.m4448g(c2213m, aboutDataM4445a.getLinks());
                    }
                    break;
                } catch (Exception e) {
                    AbstractC0295Gu.m625r(-817894917142581L);
                    e.getMessage();
                }
                return c0829tc;
            case 1:
                AbstractC0628Oj.m1232T(obj);
                ((C2414qe) obj2).m4857b(this.f7560f);
                return c0829tc;
            case 2:
                C1011Xg c1011Xg = (C1011Xg) obj2;
                LinearLayout linearLayout = c1011Xg.f3218c;
                int i5 = this.f7560f;
                try {
                    if (i5 == 0) {
                        AbstractC0628Oj.m1232T(obj);
                        C1456gf c1456gf = AbstractC1077Z2.f3440a;
                        this.f7560f = 1;
                        c1456gf.getClass();
                        C1498hd c1498hd = AbstractC1499he.f5282a;
                        obj = AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C1034Y2(i2, null == true ? 1 : 0), this);
                        if (obj == enumC1453gc) {
                            return enumC1453gc;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException(AbstractC0295Gu.m625r(-813299302135861L));
                        }
                        AbstractC0628Oj.m1232T(obj);
                    }
                    linearLayout.removeAllViews();
                    int i6 = 0;
                    for (Object obj3 : (List) obj) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            AbstractC2496sa.m4978c0();
                            throw null;
                        }
                        FAQCategory fAQCategory = (FAQCategory) obj3;
                        if (i6 > 0) {
                            C1011Xg.m1902a(c1011Xg);
                        }
                        C1011Xg.m1903e(c1011Xg, fAQCategory.getCategoryName());
                        LinearLayout linearLayout2 = new LinearLayout(c1011Xg.getContext());
                        linearLayout2.setOrientation(1);
                        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        linearLayout2.setBackground(new ColorDrawable(linearLayout2.getContext().getColor(R.color.colorForeground)));
                        linearLayout2.setOutlineProvider(new C2122k(3));
                        linearLayout2.setClipToOutline(true);
                        c1011Xg.m1906h(linearLayout, linearLayout2);
                        int i8 = 0;
                        for (Object obj4 : AbstractC2453ra.m4904n0(fAQCategory.getItems(), new C0963Wb(3))) {
                            int i9 = i8 + 1;
                            if (i8 < 0) {
                                AbstractC2496sa.m4978c0();
                                throw null;
                            }
                            FAQItem fAQItem = (FAQItem) obj4;
                            if (i8 > 0) {
                                C1011Xg.m1904f(c1011Xg);
                            }
                            C1011Xg.m1905g(c1011Xg, new C0968Wg(fAQItem.getQuestion(), fAQItem.getAnswer()), linearLayout2);
                            i8 = i9;
                        }
                        i6 = i7;
                    }
                } catch (Exception unused) {
                    AbstractC0295Gu.m625r(-813166158149685L);
                    AbstractC0295Gu.m625r(-813200517888053L);
                }
                return c0829tc;
            case 3:
                C0670Pi c0670Pi = (C0670Pi) obj2;
                int i10 = this.f7560f;
                try {
                    if (i10 == 0) {
                        AbstractC0628Oj.m1232T(obj);
                        C0594Ns c0594Ns2 = C0594Ns.f1925a;
                        this.f7560f = 1;
                        c0594Ns2.getClass();
                        obj = C0594Ns.m1166e(AbstractC0295Gu.m625r(-402112018118709L), this);
                        if (obj == enumC1453gc) {
                            return enumC1453gc;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException(AbstractC0295Gu.m625r(-78224239360053L));
                        }
                        AbstractC0628Oj.m1232T(obj);
                    }
                    C0670Pi.m1336e(c0670Pi, C0670Pi.m1335a(c0670Pi, (String) obj));
                    break;
                } catch (Exception unused2) {
                    AbstractC0295Gu.m625r(-78164109817909L);
                    AbstractC0295Gu.m625r(-78194174588981L);
                    LinearLayout linearLayout3 = c0670Pi.f2137a;
                    if (linearLayout3 == null) {
                        AbstractC0295Gu.m625r(-77004468647989L);
                        linearLayout3 = null;
                    }
                    int childCount = linearLayout3.getChildCount();
                    if (childCount > 2) {
                        LinearLayout linearLayout4 = c0670Pi.f2137a;
                        if (linearLayout4 == null) {
                            AbstractC0295Gu.m625r(-77064598190133L);
                            linearLayout4 = null;
                        }
                        linearLayout4.removeViews(2, childCount - 2);
                    }
                    ViewGroup viewGroup2 = c0670Pi.f2137a;
                    if (viewGroup2 == null) {
                        AbstractC0295Gu.m625r(-77124727732277L);
                    } else {
                        viewGroup = viewGroup2;
                    }
                    TextView textView = new TextView(c0670Pi.getContext());
                    textView.setText(AbstractC0295Gu.m625r(-77184857274421L));
                    textView.setTextSize(16.0f);
                    textView.setTextColor(textView.getContext().getColor(R.color.textSummary));
                    textView.setGravity(17);
                    textView.setPadding(0, AbstractC0295Gu.m616i(32), 0, AbstractC0295Gu.m616i(32));
                    viewGroup.addView(textView);
                }
                return c0829tc;
            case 4:
                AbstractC0628Oj.m1232T(obj);
                TextView textView2 = ((C1505hk) obj2).f5341e;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f7560f);
                sb.append('%');
                textView2.setText(sb.toString());
                return c0829tc;
            case 5:
                AbstractC0628Oj.m1232T(obj);
                ((InterfaceC1416fj) obj2).mo90g(new Integer(this.f7560f));
                return c0829tc;
            case 6:
                C0956WA c0956wa = (C0956WA) obj2;
                int i11 = this.f7560f;
                try {
                    if (i11 == 0) {
                        AbstractC0628Oj.m1232T(obj);
                        C0594Ns c0594Ns3 = C0594Ns.f1925a;
                        this.f7560f = 1;
                        c0594Ns3.getClass();
                        obj = C0594Ns.m1166e(AbstractC0295Gu.m625r(-400183577802805L), this);
                        if (obj == enumC1453gc) {
                            return enumC1453gc;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException(AbstractC0295Gu.m625r(-490038588602421L));
                        }
                        AbstractC0628Oj.m1232T(obj);
                    }
                    C0956WA.m1826e(c0956wa, C0956WA.m1825a(c0956wa, (String) obj));
                    break;
                } catch (Exception unused3) {
                    C0956WA.m1826e(c0956wa, C0452Kf.f1484a);
                }
                return c0829tc;
            default:
                C2136kD c2136kD = (C2136kD) obj2;
                int i12 = this.f7560f;
                try {
                    if (i12 == 0) {
                        AbstractC0628Oj.m1232T(obj);
                        C1456gf c1456gf2 = AbstractC1077Z2.f3440a;
                        this.f7560f = 1;
                        c1456gf2.getClass();
                        C1498hd c1498hd2 = AbstractC1499he.f5282a;
                        obj = AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C1034Y2(i3, null == true ? 1 : 0), this);
                        if (obj == enumC1453gc) {
                            return enumC1453gc;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException(AbstractC0295Gu.m625r(-820416062945333L));
                        }
                        AbstractC0628Oj.m1232T(obj);
                    }
                    C2136kD.m4317a(c2136kD, (List) obj);
                    break;
                } catch (Exception e2) {
                    c2136kD.m4318e(AbstractC0295Gu.m625r(-820368818305077L) + e2.getMessage());
                }
                return c0829tc;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2170l(Object obj, int i, InterfaceC0190Eb interfaceC0190Eb, int i2) {
        super(interfaceC0190Eb);
        this.f7559e = i2;
        this.f7561g = obj;
        this.f7560f = i;
    }
}

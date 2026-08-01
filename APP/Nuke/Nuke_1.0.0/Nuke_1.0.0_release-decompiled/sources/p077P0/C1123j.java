package p077P0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p056K2.InterfaceC0877c;
import p061L2.AbstractC0973m;
import p061L2.C0981u;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1666k;
import p175i0.C2269d;
import p175i0.C2271f;
import p175i0.InterfaceC2278m;
import p211o0.InterfaceC2738M;

/* JADX INFO: renamed from: P0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1123j extends AbstractC1666k implements InterfaceC1603e {

    /* JADX INFO: renamed from: f */
    public static final C1123j f3651f;

    /* JADX INFO: renamed from: g */
    public static final C1123j f3652g;

    /* JADX INFO: renamed from: h */
    public static final C1123j f3653h;

    /* JADX INFO: renamed from: i */
    public static final C1123j f3654i;

    /* JADX INFO: renamed from: j */
    public static final C1123j f3655j;

    /* JADX INFO: renamed from: k */
    public static final C1123j f3656k;

    /* JADX INFO: renamed from: l */
    public static final C1123j f3657l;

    /* JADX INFO: renamed from: m */
    public static final C1123j f3658m;

    /* JADX INFO: renamed from: n */
    public static final C1123j f3659n;

    /* JADX INFO: renamed from: o */
    public static final C1123j f3660o;

    /* JADX INFO: renamed from: p */
    public static final C1123j f3661p;

    /* JADX INFO: renamed from: q */
    public static final C1123j f3662q;

    /* JADX INFO: renamed from: r */
    public static final C1123j f3663r;

    /* JADX INFO: renamed from: s */
    public static final C1123j f3664s;

    /* JADX INFO: renamed from: t */
    public static final C1123j f3665t;

    /* JADX INFO: renamed from: u */
    public static final C1123j f3666u;

    /* JADX INFO: renamed from: v */
    public static final C1123j f3667v;

    /* JADX INFO: renamed from: w */
    public static final C1123j f3668w;

    /* JADX INFO: renamed from: x */
    public static final C1123j f3669x;

    /* JADX INFO: renamed from: y */
    public static final C1123j f3670y;

    /* JADX INFO: renamed from: z */
    public static final C1123j f3671z;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f3672e;

    static {
        int i5 = 2;
        f3651f = new C1123j(i5, 0);
        f3652g = new C1123j(i5, 1);
        f3653h = new C1123j(i5, 2);
        f3654i = new C1123j(i5, 3);
        f3655j = new C1123j(i5, 4);
        f3656k = new C1123j(i5, 5);
        f3657l = new C1123j(i5, 6);
        f3658m = new C1123j(i5, 7);
        f3659n = new C1123j(i5, 8);
        f3660o = new C1123j(i5, 9);
        f3661p = new C1123j(i5, 10);
        f3662q = new C1123j(i5, 11);
        f3663r = new C1123j(i5, 12);
        f3664s = new C1123j(i5, 13);
        f3665t = new C1123j(i5, 14);
        f3666u = new C1123j(i5, 15);
        f3667v = new C1123j(i5, 16);
        f3668w = new C1123j(i5, 17);
        f3669x = new C1123j(i5, 18);
        f3670y = new C1123j(i5, 19);
        f3671z = new C1123j(i5, 20);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1123j(int i5, int i6) {
        super(i5);
        this.f3672e = i6;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        String str;
        InterfaceC0877c interfaceC0877c;
        switch (this.f3672e) {
            case 0:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = C0981u.f3047d;
                }
                return AbstractC0973m.m2019Z(collection, list);
            case BuildConfig.VERSION_CODE /* 1 */:
                return (C2269d) obj;
            case 2:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayListM2026g0 = AbstractC0973m.m2026g0(list2);
                arrayListM2026g0.addAll(list3);
                return arrayListM2026g0;
            case 3:
                return (InterfaceC2278m) obj;
            case 4:
                return (C2271f) obj;
            case 5:
                return (C0891q) obj;
            case 6:
                return (C0891q) obj;
            case 7:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 8:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 9:
                return (C0891q) obj;
            case 10:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 11:
                C1121h c1121h = (C1121h) obj;
                int i5 = ((C1121h) obj2).f3648a;
                return c1121h;
            case 12:
                return (InterfaceC2738M) obj;
            case 13:
                return (String) obj;
            case 14:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayListM2026g02 = AbstractC0973m.m2026g0(list4);
                arrayListM2026g02.addAll(list5);
                return arrayListM2026g02;
            case 15:
                Float f2 = (Float) obj;
                ((Number) obj2).floatValue();
                return f2;
            case 16:
                return (String) obj;
            case 17:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 18:
                C1114a c1114a = (C1114a) obj;
                C1114a c1114a2 = (C1114a) obj2;
                if (c1114a == null || (str = c1114a.f3633a) == null) {
                    str = c1114a2.f3633a;
                }
                if (c1114a == null || (interfaceC0877c = c1114a.f3634b) == null) {
                    interfaceC0877c = c1114a2.f3634b;
                }
                return new C1114a(str, interfaceC0877c);
            case 19:
                return obj == null ? obj2 : obj;
            default:
                C1128o c1128o = (C1128o) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                C1125l c1125l = ((C1128o) obj).f3711d;
                C1135v c1135v = AbstractC1132s.f3757t;
                Object objM4272g = c1125l.f3702d.m4272g(c1135v);
                if (objM4272g == null) {
                    objM4272g = objValueOf;
                }
                float fFloatValue = ((Number) objM4272g).floatValue();
                Object objM4272g2 = c1128o.f3711d.f3702d.m4272g(c1135v);
                if (objM4272g2 != null) {
                    objValueOf = objM4272g2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
        }
    }
}

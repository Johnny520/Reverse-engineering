package p072f2;

import gg.AbstractC1417m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p071f1.InterfaceC1026r0;
import p085fg.InterfaceC1235p;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;
import p373z0.C6064d;
import p373z0.C6066f;
import p373z0.InterfaceC6073m;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: f2.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1048k extends AbstractC1417m implements InterfaceC1235p {

    /* JADX INFO: renamed from: A */
    public static final C1048k f3290A;

    /* JADX INFO: renamed from: B */
    public static final C1048k f3291B;

    /* JADX INFO: renamed from: h */
    public static final C1048k f3292h;

    /* JADX INFO: renamed from: i */
    public static final C1048k f3293i;

    /* JADX INFO: renamed from: j */
    public static final C1048k f3294j;

    /* JADX INFO: renamed from: k */
    public static final C1048k f3295k;

    /* JADX INFO: renamed from: l */
    public static final C1048k f3296l;

    /* JADX INFO: renamed from: m */
    public static final C1048k f3297m;

    /* JADX INFO: renamed from: n */
    public static final C1048k f3298n;

    /* JADX INFO: renamed from: o */
    public static final C1048k f3299o;

    /* JADX INFO: renamed from: p */
    public static final C1048k f3300p;

    /* JADX INFO: renamed from: q */
    public static final C1048k f3301q;

    /* JADX INFO: renamed from: r */
    public static final C1048k f3302r;

    /* JADX INFO: renamed from: s */
    public static final C1048k f3303s;

    /* JADX INFO: renamed from: t */
    public static final C1048k f3304t;

    /* JADX INFO: renamed from: u */
    public static final C1048k f3305u;

    /* JADX INFO: renamed from: v */
    public static final C1048k f3306v;

    /* JADX INFO: renamed from: w */
    public static final C1048k f3307w;

    /* JADX INFO: renamed from: x */
    public static final C1048k f3308x;

    /* JADX INFO: renamed from: y */
    public static final C1048k f3309y;

    /* JADX INFO: renamed from: z */
    public static final C1048k f3310z;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3311g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i9 = 2;
        f3292h = new C1048k(i9, 0);
        f3293i = new C1048k(i9, 1);
        f3294j = new C1048k(i9, 2);
        f3295k = new C1048k(i9, 3);
        f3296l = new C1048k(i9, 4);
        f3297m = new C1048k(i9, 5);
        f3298n = new C1048k(i9, 6);
        f3299o = new C1048k(i9, 7);
        f3300p = new C1048k(i9, 8);
        f3301q = new C1048k(i9, 9);
        f3302r = new C1048k(i9, 10);
        f3303s = new C1048k(i9, 11);
        f3304t = new C1048k(i9, 12);
        f3305u = new C1048k(i9, 13);
        f3306v = new C1048k(i9, 14);
        f3307w = new C1048k(i9, 15);
        f3308x = new C1048k(i9, 16);
        f3309y = new C1048k(i9, 17);
        f3310z = new C1048k(i9, 18);
        f3290A = new C1048k(i9, 19);
        f3291B = new C1048k(i9, 20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1048k(int i9, int i10) {
        super(i9);
        this.f3311g = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        String str;
        InterfaceC3955b interfaceC3955b;
        switch (this.f3311g) {
            case 0:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = C4173t.f13710g;
                }
                return AbstractC4166m.m8397F1(collection, list);
            case 1:
                return (C6064d) obj;
            case 2:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayList = new ArrayList(list2);
                arrayList.addAll(list3);
                return arrayList;
            case 3:
                return (InterfaceC6073m) obj;
            case 4:
                return (C6066f) obj;
            case 5:
                return (C3967n) obj;
            case 6:
                return (C3967n) obj;
            case 7:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 8:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 9:
                return (C3967n) obj;
            case 10:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 11:
                C1046i c1046i = (C1046i) obj;
                int i9 = ((C1046i) obj2).f3287a;
                return c1046i;
            case 12:
                return (InterfaceC1026r0) obj;
            case 13:
                return (String) obj;
            case 14:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayList2 = new ArrayList(list4);
                arrayList2.addAll(list5);
                return arrayList2;
            case 15:
                Float f3 = (Float) obj;
                ((Number) obj2).floatValue();
                return f3;
            case 16:
                return (String) obj;
            case 17:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 18:
                C1038a c1038a = (C1038a) obj;
                C1038a c1038a2 = (C1038a) obj2;
                if (c1038a == null || (str = c1038a.f3269a) == null) {
                    str = c1038a2.f3269a;
                }
                if (c1038a == null || (interfaceC3955b = c1038a.f3270b) == null) {
                    interfaceC3955b = c1038a2.f3270b;
                }
                return new C1038a(str, interfaceC3955b);
            case 19:
                return obj == null ? obj2 : obj;
            default:
                C1054q c1054q = (C1054q) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                C1050m c1050m = ((C1054q) obj).f3350d;
                C1061x c1061x = AbstractC1058u.f3395t;
                Object objM2320g = c1050m.f3341g.m2320g(c1061x);
                if (objM2320g == null) {
                    objM2320g = objValueOf;
                }
                float fFloatValue = ((Number) objM2320g).floatValue();
                Object objM2320g2 = c1054q.f3350d.f3341g.m2320g(c1061x);
                if (objM2320g2 != null) {
                    objValueOf = objM2320g2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
        }
    }
}

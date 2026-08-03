package p000;

import android.util.LruCache;
import io.github.cherrywechat.network.model.ApiResponse;
import io.github.cherrywechat.network.model.ThemeStoreData;
import io.github.cherrywechat.network.model.ThemeStoreItem;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: IC */
/* JADX INFO: loaded from: classes.dex */
public final class C0357IC {

    /* JADX INFO: renamed from: a */
    public static final C0357IC f1218a;

    /* JADX INFO: renamed from: b */
    public static List f1219b;

    /* JADX INFO: renamed from: c */
    public static final ArrayList f1220c;

    /* JADX INFO: renamed from: d */
    public static final LruCache f1221d;

    static {
        AbstractC0295Gu.m625r(-802317070759989L);
        f1218a = new C0357IC();
        f1219b = C0452Kf.f1484a;
        f1220c = new ArrayList();
        f1221d = new LruCache(50);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m789a(C0357IC c0357ic, AbstractC0233Fb abstractC0233Fb) throws Throwable {
        C0271GC c0271gc;
        c0357ic.getClass();
        if (abstractC0233Fb instanceof C0271GC) {
            c0271gc = (C0271GC) abstractC0233Fb;
            int i = c0271gc.f878f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0271gc.f878f = i - Integer.MIN_VALUE;
            } else {
                c0271gc = new C0271GC(c0357ic, abstractC0233Fb);
            }
        }
        Object objM1166e = c0271gc.f876d;
        int i2 = c0271gc.f878f;
        try {
            if (i2 == 0) {
                AbstractC0628Oj.m1232T(objM1166e);
                C0594Ns c0594Ns = C0594Ns.f1925a;
                c0271gc.f878f = 1;
                c0594Ns.getClass();
                objM1166e = C0594Ns.m1166e(AbstractC0295Gu.m625r(-400183577802805L), c0271gc);
                EnumC1453gc enumC1453gc = EnumC1453gc.f5148a;
                if (objM1166e == enumC1453gc) {
                    return enumC1453gc;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException(AbstractC0295Gu.m625r(-804108072122421L));
                }
                AbstractC0628Oj.m1232T(objM1166e);
            }
            List listM793e = m793e((String) objM1166e);
            AbstractC0295Gu.m625r(-805495346559029L);
            AbstractC0295Gu.m625r(-805581245904949L);
            listM793e.size();
            AbstractC0295Gu.m625r(-805602720741429L);
            return listM793e;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-805632785512501L);
            AbstractC0295Gu.m625r(-804069417416757L);
            return C0452Kf.f1484a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0261  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List m790b(C0357IC c0357ic, List list, List list2, ArrayList arrayList) {
        Object next;
        Object next2;
        Object next3;
        String str;
        EnumC0099CC enumC0099CC;
        Iterator it;
        Object next4;
        ThemeStoreItem themeStoreItem;
        String strM625r;
        List<String> screenshots;
        c0357ic.getClass();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C0183EA.f539a.getClass();
        String strM373a = C0183EA.m373a();
        Iterator it2 = list.iterator();
        int i = 0;
        while (true) {
            boolean zHasNext = it2.hasNext();
            C0452Kf c0452Kf = C0452Kf.f1484a;
            Object obj = null;
            if (!zHasNext) {
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    C0054BA c0054ba = (C0054BA) it3.next();
                    String str2 = c0054ba.f120a;
                    ArrayList<C0140DA> arrayList3 = c0054ba.f126g;
                    if (!linkedHashSet.contains(str2)) {
                        if (arrayList3 == null || !arrayList3.isEmpty()) {
                            for (C0140DA c0140da : arrayList3) {
                                C0183EA c0183ea = C0183EA.f539a;
                                String str3 = c0140da.f364a;
                                c0183ea.getClass();
                                if (new File(C0183EA.m378f(str3)).exists()) {
                                    enumC0099CC = EnumC0099CC.f236d;
                                    break;
                                }
                            }
                            enumC0099CC = EnumC0099CC.f234b;
                            EnumC0099CC enumC0099CC2 = enumC0099CC;
                            it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next4 = null;
                                    break;
                                }
                                next4 = it.next();
                                if (AbstractC0585Nj.m1134a(((ThemeStoreItem) next4).getId(), str2)) {
                                    break;
                                }
                            }
                            themeStoreItem = (ThemeStoreItem) next4;
                            String str4 = c0054ba.f120a;
                            String str5 = c0054ba.f121b;
                            String str6 = c0054ba.f122c;
                            if (themeStoreItem != null || (strM625r = themeStoreItem.getDescription()) == null) {
                                String strM625r2 = AbstractC0295Gu.m625r(-803914798594101L);
                            }
                            String str7 = strM625r2;
                            if (themeStoreItem != null || (strM625r = themeStoreItem.getCoverImage()) == null) {
                                strM625r = AbstractC0295Gu.m625r(-803919093561397L);
                            }
                            arrayList2.add(new C0185EC(str4, str4, str5, str6, str7, strM625r, null, (themeStoreItem != null || (screenshots = themeStoreItem.getScreenshots()) == null) ? c0452Kf : screenshots, null, arrayList3, themeStoreItem == null ? themeStoreItem.getPrice() : 0.0d, themeStoreItem == null ? themeStoreItem.getFeatured() : false, themeStoreItem == null ? themeStoreItem.getDownloadCount() : 0, c0054ba.f124e, c0054ba.f125f, c0054ba.f123d, null, null, enumC0099CC2, false, 0, 3342656, 0));
                            linkedHashSet.add(str2);
                        } else {
                            enumC0099CC = EnumC0099CC.f234b;
                            EnumC0099CC enumC0099CC22 = enumC0099CC;
                            it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                }
                            }
                            themeStoreItem = (ThemeStoreItem) next4;
                            String str42 = c0054ba.f120a;
                            String str52 = c0054ba.f121b;
                            String str62 = c0054ba.f122c;
                            if (themeStoreItem != null) {
                                String strM625r22 = AbstractC0295Gu.m625r(-803914798594101L);
                                String str72 = strM625r22;
                                if (themeStoreItem != null) {
                                    strM625r = AbstractC0295Gu.m625r(-803919093561397L);
                                    if (themeStoreItem != null) {
                                        arrayList2.add(new C0185EC(str42, str42, str52, str62, str72, strM625r, null, (themeStoreItem != null || (screenshots = themeStoreItem.getScreenshots()) == null) ? c0452Kf : screenshots, null, arrayList3, themeStoreItem == null ? themeStoreItem.getPrice() : 0.0d, themeStoreItem == null ? themeStoreItem.getFeatured() : false, themeStoreItem == null ? themeStoreItem.getDownloadCount() : 0, c0054ba.f124e, c0054ba.f125f, c0054ba.f123d, null, null, enumC0099CC22, false, 0, 3342656, 0));
                                        linkedHashSet.add(str2);
                                    }
                                }
                            }
                        }
                    }
                }
                AbstractC0295Gu.m625r(-803923388528693L);
                AbstractC0295Gu.m625r(-804009287874613L);
                arrayList.size();
                AbstractC0295Gu.m625r(-804610583296053L);
                if (arrayList.isEmpty()) {
                    AbstractC0295Gu.m625r(-804632058132533L);
                    AbstractC0295Gu.m625r(-804717957478453L);
                    C0183EA.f539a.getClass();
                    C0097CA c0097caM376d = C0183EA.m376d();
                    boolean zEquals = strM373a.equals(c0097caM376d.f223a);
                    C0185EC c0185ec = new C0185EC(c0097caM376d.f223a, AbstractC0295Gu.m625r(-804812446758965L), c0097caM376d.f224b, c0097caM376d.f225c, c0097caM376d.f227e, null, c0097caM376d.f228f, null, c0097caM376d.f226d, null, 0.0d, false, 0, null, null, null, c0097caM376d.f229g, c0097caM376d.f230h, !zEquals ? EnumC0099CC.f237e : EnumC0099CC.f236d, zEquals, 0, 3210912, 0);
                    arrayList2.add(c0185ec);
                    AbstractC0295Gu.m625r(-804821036693557L);
                    AbstractC0295Gu.m625r(-804357180225589L);
                    AbstractC0295Gu.m625r(-804417309767733L);
                    Objects.toString(c0185ec.f567s);
                } else {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        if (AbstractC0585Nj.m1134a(((C0097CA) it4.next()).f223a, AbstractC0295Gu.m625r(-804623468197941L))) {
                            break;
                        }
                    }
                    AbstractC0295Gu.m625r(-804632058132533L);
                    AbstractC0295Gu.m625r(-804717957478453L);
                    C0183EA.f539a.getClass();
                    C0097CA c0097caM376d2 = C0183EA.m376d();
                    boolean zEquals2 = strM373a.equals(c0097caM376d2.f223a);
                    C0185EC c0185ec2 = new C0185EC(c0097caM376d2.f223a, AbstractC0295Gu.m625r(-804812446758965L), c0097caM376d2.f224b, c0097caM376d2.f225c, c0097caM376d2.f227e, null, c0097caM376d2.f228f, null, c0097caM376d2.f226d, null, 0.0d, false, 0, null, null, null, c0097caM376d2.f229g, c0097caM376d2.f230h, !zEquals2 ? EnumC0099CC.f237e : EnumC0099CC.f236d, zEquals2, 0, 3210912, 0);
                    arrayList2.add(c0185ec2);
                    AbstractC0295Gu.m625r(-804821036693557L);
                    AbstractC0295Gu.m625r(-804357180225589L);
                    AbstractC0295Gu.m625r(-804417309767733L);
                    Objects.toString(c0185ec2.f567s);
                }
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    C0097CA c0097ca = (C0097CA) it5.next();
                    AbstractC0295Gu.m625r(-804460259440693L);
                    AbstractC0295Gu.m625r(-804546158786613L);
                    String str8 = c0097ca.f224b;
                    String str9 = c0097ca.f223a;
                    AbstractC0295Gu.m625r(-802957020887093L);
                    if (AbstractC0585Nj.m1134a(str9, AbstractC0295Gu.m625r(-802982790690869L))) {
                        boolean zEquals3 = strM373a.equals(str9);
                        AbstractC0295Gu.m625r(-802991380625461L);
                        AbstractC0295Gu.m625r(-803077279971381L);
                        AbstractC0295Gu.m625r(-803128819578933L);
                        AbstractC0295Gu.m625r(-802656373176373L);
                        C0185EC c0185ec3 = new C0185EC(c0097ca.f223a, AbstractC0295Gu.m625r(-802742272522293L), c0097ca.f224b, c0097ca.f225c, c0097ca.f227e, null, c0097ca.f228f, null, c0097ca.f226d, null, 0.0d, false, 0, null, null, null, c0097ca.f229g, c0097ca.f230h, zEquals3 ? EnumC0099CC.f237e : EnumC0099CC.f236d, zEquals3, 0, 3210912, 0);
                        arrayList2.add(c0185ec3);
                        AbstractC0295Gu.m625r(-802750862456885L);
                        AbstractC0295Gu.m625r(-802836761802805L);
                        AbstractC0295Gu.m625r(-802888301410357L);
                        Objects.toString(c0185ec3.f567s);
                    } else {
                        Iterator it6 = list2.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it6.next();
                            ArrayList arrayList4 = ((C0054BA) next).f126g;
                            if (arrayList4 == null || !arrayList4.isEmpty()) {
                                Iterator it7 = arrayList4.iterator();
                                while (it7.hasNext()) {
                                    if (AbstractC0585Nj.m1134a(((C0140DA) it7.next()).f364a, str9)) {
                                        break;
                                    }
                                }
                            }
                        }
                        C0054BA c0054ba2 = (C0054BA) next;
                        if (c0054ba2 != null) {
                            Iterator it8 = c0054ba2.f126g.iterator();
                            while (true) {
                                if (!it8.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it8.next();
                                if (AbstractC0585Nj.m1134a(((C0140DA) next2).f364a, str9)) {
                                    break;
                                }
                            }
                            C0140DA c0140da2 = (C0140DA) next2;
                            Iterator it9 = arrayList2.iterator();
                            while (true) {
                                if (!it9.hasNext()) {
                                    next3 = null;
                                    break;
                                }
                                next3 = it9.next();
                                if (AbstractC0585Nj.m1134a(((C0185EC) next3).f550b, c0054ba2.f120a)) {
                                    break;
                                }
                            }
                            C0185EC c0185ec4 = (C0185EC) next3;
                            if (c0185ec4 != null) {
                                int iIndexOf = arrayList2.indexOf(c0185ec4);
                                String str10 = c0097ca.f228f;
                                String str11 = c0097ca.f229g;
                                String str12 = c0097ca.f230h;
                                if (c0140da2 == null || (str = c0140da2.f365b) == null) {
                                    str = c0097ca.f226d;
                                }
                                arrayList2.set(iIndexOf, C0185EC.m386a(c0185ec4, str10, str, str11, str12, strM373a.equals(str9) ? EnumC0099CC.f237e : EnumC0099CC.f236d, strM373a.equals(str9), 3210943));
                            }
                        } else {
                            String str13 = c0097ca.f223a;
                            arrayList2.add(new C0185EC(str13, null, c0097ca.f224b, c0097ca.f225c, c0097ca.f227e, null, c0097ca.f228f, null, c0097ca.f226d, null, 0.0d, false, 0, null, null, null, c0097ca.f229g, c0097ca.f230h, strM373a.equals(str13) ? EnumC0099CC.f237e : EnumC0099CC.f236d, strM373a.equals(str9), 0, 3210914, 0));
                        }
                    }
                }
                return AbstractC2453ra.m4904n0(arrayList2, new C0314HC(new C0314HC(new C0314HC(new C0963Wb(10), 1), 2), 0));
            }
            Object next5 = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                AbstractC2496sa.m4978c0();
                throw null;
            }
            ThemeStoreItem themeStoreItem2 = (ThemeStoreItem) next5;
            if (!linkedHashSet.contains(themeStoreItem2.getId())) {
                Iterator it10 = list2.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        break;
                    }
                    Object next6 = it10.next();
                    if (AbstractC0585Nj.m1134a(((C0054BA) next6).f120a, themeStoreItem2.getId())) {
                        obj = next6;
                        break;
                    }
                }
                if (((C0054BA) obj) == null) {
                    String id = themeStoreItem2.getId();
                    String id2 = themeStoreItem2.getId();
                    String name = themeStoreItem2.getName();
                    String author = themeStoreItem2.getAuthor();
                    String description = themeStoreItem2.getDescription();
                    String coverImage = themeStoreItem2.getCoverImage();
                    if (coverImage == null) {
                        coverImage = AbstractC0295Gu.m625r(-803897618724917L);
                    }
                    arrayList2.add(new C0185EC(id, id2, name, author, description, coverImage, null, themeStoreItem2.getScreenshots(), null, c0452Kf, themeStoreItem2.getPrice(), themeStoreItem2.getFeatured(), themeStoreItem2.getDownloadCount(), AbstractC0295Gu.m625r(-803901913692213L), AbstractC0295Gu.m625r(-803906208659509L), AbstractC0295Gu.m625r(-803910503626805L), null, null, EnumC0099CC.f233a, false, i, 1245504, 0));
                    linkedHashSet.add(themeStoreItem2.getId());
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m791c(C0357IC c0357ic) {
        c0357ic.getClass();
        for (C0701QC c0701qc : f1220c) {
            c0701qc.getClass();
            C1498hd c1498hd = AbstractC1499he.f5282a;
            AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C0529MC(c0701qc, null, 0), 3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static Object m792d(boolean z, AbstractC0644Oz abstractC0644Oz) {
        if (!f1219b.isEmpty() && !z) {
            return f1219b;
        }
        C1498hd c1498hd = AbstractC1499he.f5282a;
        return AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C0228FC(0, null), abstractC0644Oz);
    }

    /* JADX INFO: renamed from: e */
    public static List m793e(String str) {
        Object objM4550a;
        ThemeStoreData themeStoreData;
        List<ThemeStoreItem> items;
        try {
            C0029Am c0029Am = AbstractC2809zm.f9524a;
            c0029Am.getClass();
            objM4550a = c0029Am.m4550a(ApiResponse.Companion.serializer(ThemeStoreData.Companion.serializer()), str);
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-803764474738741L);
            AbstractC0425Jv.m881a(ApiResponse.class).m445b();
            AbstractC0295Gu.m625r(-803880438855733L);
            e.getMessage();
            objM4550a = null;
        }
        ApiResponse apiResponse = (ApiResponse) objM4550a;
        C0452Kf c0452Kf = C0452Kf.f1484a;
        return (apiResponse == null || apiResponse.getCode() != 0 || (themeStoreData = (ThemeStoreData) apiResponse.getData()) == null || (items = themeStoreData.getItems()) == null) ? c0452Kf : items;
    }

    /* JADX INFO: renamed from: f */
    public static void m794f(String str, EnumC0099CC enumC0099CC) {
        AbstractC0295Gu.m625r(-802518934222901L);
        AbstractC0295Gu.m625r(-802553293961269L);
        Iterator it = f1219b.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (AbstractC0585Nj.m1134a(((C0185EC) it.next()).f549a, str)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            ArrayList arrayList = new ArrayList(f1219b);
            arrayList.set(i, C0185EC.m386a((C0185EC) arrayList.get(i), null, null, null, null, enumC0099CC, false, 3932159));
            f1219b = arrayList;
            for (C0701QC c0701qc : f1220c) {
                c0701qc.getClass();
                AbstractC0295Gu.m625r(-464341799270453L);
                AbstractC0295Gu.m625r(-464376159008821L);
                C1498hd c1498hd = AbstractC1499he.f5282a;
                AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C0529MC(c0701qc, null, 1), 3);
            }
        }
    }
}

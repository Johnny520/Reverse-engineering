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
    public static final C0357IC f1218a = null;

    /* JADX INFO: renamed from: b */
    public static List f1219b;

    /* JADX INFO: renamed from: c */
    public static final ArrayList f1220c = null;

    /* JADX INFO: renamed from: d */
    public static final LruCache f1221d = null;

    static {
        AbstractC0295Gu.m625r(-802317070759989L);
        f1218a = new C0357IC();
        f1219b = C0452Kf.f1484a;
        f1220c = new ArrayList();
        f1221d = new LruCache(50);
    }

    /* JADX INFO: renamed from: a */
    public static final Object m789a(C0357IC r4, AbstractC0233Fb r5) {
        r4.getClass();
        if ((r5 instanceof C0271GC) == false) goto L7;
        C0271GC r0 = (C0271GC) r5;
        int r1 = r0.f878f;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.f878f = r1 - Integer.MIN_VALUE;
    L8:
        Object r42 = r0.f876d;
        int r52 = r0.f878f;
        if (r52 == 0) goto L15;
        if (r52 != 1) goto L14;
        AbstractC0628Oj.m1232T(r42);     // Catch: Exception -> L22
    L20:
        List r43 = m793e((String) r42);     // Catch: Exception -> L22
        AbstractC0295Gu.m625r(-805495346559029L);     // Catch: Exception -> L22
        AbstractC0295Gu.m625r(-805581245904949L);     // Catch: Exception -> L22
        r43.size();     // Catch: Exception -> L22
        AbstractC0295Gu.m625r(-805602720741429L);     // Catch: Exception -> L22
        return r43;
    L14:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-804108072122421L));
    L15:
        AbstractC0628Oj.m1232T(r42);
        C0594Ns r44 = C0594Ns.f1925a;     // Catch: Exception -> L22
        r0.f878f = 1;     // Catch: Exception -> L22
        r44.getClass();     // Catch: Exception -> L22
        r42 = C0594Ns.m1166e(AbstractC0295Gu.m625r(-400183577802805L), r0);     // Catch: Exception -> L22
        EnumC1453gc r53 = EnumC1453gc.f5148a;
        if (r42 != r53) goto L20;
        return r53;
    L22:
        AbstractC0295Gu.m625r(-805632785512501L);
        AbstractC0295Gu.m625r(-804069417416757L);
        return C0452Kf.f1484a;
    L7:
        r0 = new C0271GC(r4, r5);
        goto L8
    }

    /* JADX INFO: renamed from: b */
    public static final List m790b(C0357IC r41, List r42, List r43, ArrayList r44) {
        r41.getClass();
        ArrayList r0 = new ArrayList();
        LinkedHashSet r1 = new LinkedHashSet();
        C0183EA.f539a.getClass();
        String r2 = C0183EA.m373a();
        Iterator r3 = r42.iterator();
        int r27 = 0;
    L3:
        boolean r5 = r3.hasNext();
        C0452Kf r15 = C0452Kf.f1484a;
        Object r6 = null;
        if (r5 == false) goto L24;
        Object r52 = r3.next();
        int r30 = r27 + 1;
        if (r27 < 0) goto L22;
        ThemeStoreItem r31 = (ThemeStoreItem) r52;
        if (r1.contains(r31.getId()) == true) goto L21;
        Iterator r53 = r43.iterator();
    L11:
        if (r53.hasNext() == false) goto L16;
        Object r7 = r53.next();
        if (AbstractC0585Nj.m1134a(((C0054BA) r7).f120a, r31.getId()) == false) goto L11;
        r6 = r7;
    L16:
        if (((C0054BA) r6) != null) goto L21;
        String r62 = r31.getId();
        String r72 = r31.getId();
        String r8 = r31.getName();
        String r9 = r31.getAuthor();
        String r10 = r31.getDescription();
        String r54 = r31.getCoverImage();
        if (r54 != null) goto L20;
        r54 = AbstractC0295Gu.m625r(-803897618724917L);
    L20:
        r0.add(new C0185EC(r62, r72, r8, r9, r10, r54, null, r31.getScreenshots(), null, r15, r31.getPrice(), r31.getFeatured(), r31.getDownloadCount(), AbstractC0295Gu.m625r(-803901913692213L), AbstractC0295Gu.m625r(-803906208659509L), AbstractC0295Gu.m625r(-803910503626805L), null, null, EnumC0099CC.f233a, false, r27, 1245504, 0));
        r1.add(r31.getId());
    L21:
        r27 = r30;
        goto L3
    L22:
        AbstractC2496sa.m4978c0();
        throw null;
    L24:
        Iterator r32 = r43.iterator();
    L26:
        if (r32.hasNext() == false) goto L78;
        C0054BA r55 = (C0054BA) r32.next();
        String r73 = r55.f120a;
        ArrayList r82 = r55.f126g;
        if (r1.contains(r73) == true) goto L26;
        if (r82 != null) goto L31;
    L33:
        Iterator r92 = r82.iterator();
    L35:
        if (r92.hasNext() == false) goto L40;
        C0140DA r102 = (C0140DA) r92.next();
        C0183EA r12 = C0183EA.f539a;
        String r103 = r102.f364a;
        r12.getClass();
        if (new File(C0183EA.m378f(r103)).exists() == false) goto L35;
        EnumC0099CC r93 = EnumC0099CC.f236d;
    L39:
        EnumC0099CC r36 = r93;
        Iterator r94 = r42.iterator();
    L43:
        if (r94.hasNext() == false) goto L47;
        Object r104 = r94.next();
        if (AbstractC0585Nj.m1134a(((ThemeStoreItem) r104).getId(), r73) == false) goto L43;
    L48:
        ThemeStoreItem r105 = (ThemeStoreItem) r104;
        String r95 = r55.f120a;
        String r11 = r55.f121b;
        String r122 = r55.f122c;
        if (r105 == null) goto L54;
        String r13 = r105.getDescription();
        if (r13 == null) goto L54;
    L53:
        String r21 = r13;
        if (r105 == null) goto L60;
        String r132 = r105.getCoverImage();
        if (r132 == null) goto L60;
    L59:
        String r22 = r132;
        if (r105 == null) goto L66;
        List<String> r133 = r105.getScreenshots();
        if (r133 == null) goto L66;
        List<String> r24 = r133;
    L67:
        if (r105 == null) goto L70;
        double r134 = r105.getPrice();
    L69:
        double r272 = r134;
        if (r105 == null) goto L73;
        boolean r29 = r105.getFeatured();
    L74:
        if (r105 == null) goto L76;
        int r302 = r105.getDownloadCount();
    L77:
        r0.add(new C0185EC(r95, r95, r11, r122, r21, r22, null, r24, null, r82, r272, r29, r302, r55.f124e, r55.f125f, r55.f123d, null, null, r36, false, 0, 3342656, 0));
        r1.add(r73);
        goto L26
    L76:
        r302 = 0;
        goto L77
    L73:
        r29 = false;
        goto L74
    L70:
        r134 = 0.0d;
    L66:
        r24 = r15;
    L60:
        r132 = AbstractC0295Gu.m625r(-803919093561397L);
    L54:
        r13 = AbstractC0295Gu.m625r(-803914798594101L);
        goto L53
    L47:
        r104 = null;
    L40:
        r93 = EnumC0099CC.f234b;
        goto L39
    L31:
        if (r82.isEmpty() == false) goto L33;
    L78:
        AbstractC0295Gu.m625r(-803923388528693L);
        AbstractC0295Gu.m625r(-804009287874613L);
        r44.size();
        AbstractC0295Gu.m625r(-804610583296053L);
        if (r44.isEmpty() == true) goto L87;
        Iterator r14 = r44.iterator();
    L83:
        if (r14.hasNext() == false) goto L87;
        if (AbstractC0585Nj.m1134a(((C0097CA) r14.next()).f223a, AbstractC0295Gu.m625r(-804623468197941L)) == false) goto L83;
    L93:
        Iterator r16 = r44.iterator();
    L95:
        if (r16.hasNext() == false) goto L157;
        C0097CA r33 = (C0097CA) r16.next();
        AbstractC0295Gu.m625r(-804460259440693L);
        AbstractC0295Gu.m625r(-804546158786613L);
        String r4 = r33.f224b;
        String r45 = r33.f223a;
        AbstractC0295Gu.m625r(-802957020887093L);
        if (AbstractC0585Nj.m1134a(r45, AbstractC0295Gu.m625r(-802982790690869L)) == true) goto L98;
        Iterator r56 = r43.iterator();
    L106:
        if (r56.hasNext() == false) goto L118;
        Object r74 = r56.next();
        ArrayList r83 = ((C0054BA) r74).f126g;
        if (r83 == null) goto L112;
        if (r83.isEmpty() == true) goto L106;
    L112:
        Iterator r84 = r83.iterator();
    L114:
        if (r84.hasNext() == false) goto L106;
        if (AbstractC0585Nj.m1134a(((C0140DA) r84.next()).f364a, r45) == false) goto L114;
    L119:
        C0054BA r75 = (C0054BA) r74;
        if (r75 != null) goto L121;
        String r85 = r33.f223a;
        String r106 = r33.f224b;
        String r112 = r33.f225c;
        String r123 = r33.f227e;
        String r142 = r33.f228f;
        String r57 = r33.f226d;
        String r96 = r33.f229g;
        String r34 = r33.f230h;
        if (r2.equals(r85) == false) goto L154;
        EnumC0099CC r135 = EnumC0099CC.f237e;
    L155:
        r0.add(new C0185EC(r85, null, r106, r112, r123, null, r142, null, r57, null, 0.0d, false, 0, null, null, null, r96, r34, r135, r2.equals(r45), 0, 3210914, 0));
        goto L95
    L154:
        r135 = EnumC0099CC.f236d;
        goto L155
    L121:
        Iterator r58 = r75.f126g.iterator();
    L123:
        if (r58.hasNext() == false) goto L127;
        Object r86 = r58.next();
        if (AbstractC0585Nj.m1134a(((C0140DA) r86).f364a, r45) == false) goto L123;
    L128:
        C0140DA r87 = (C0140DA) r86;
        Iterator r59 = r0.iterator();
    L130:
        if (r59.hasNext() == false) goto L134;
        Object r97 = r59.next();
        if (AbstractC0585Nj.m1134a(((C0185EC) r97).f550b, r75.f120a) == false) goto L130;
    L135:
        C0185EC r107 = (C0185EC) r97;
        if (r107 == null) goto L95;
        int r510 = r0.indexOf(r107);
        String r113 = r33.f228f;
        String r136 = r33.f229g;
        String r143 = r33.f230h;
        if (r87 == null) goto L143;
        String r76 = r87.f365b;
        if (r76 == null) goto L143;
    L142:
        String r124 = r76;
        if (r2.equals(r45) == false) goto L148;
        EnumC0099CC r35 = EnumC0099CC.f237e;
    L149:
        r0.set(r510, C0185EC.m386a(r107, r113, r124, r136, r143, r35, r2.equals(r45), 3210943));
        goto L95
    L148:
        r35 = EnumC0099CC.f236d;
    L143:
        r76 = r33.f226d;
        goto L142
    L134:
        r97 = null;
        goto L135
    L127:
        r86 = null;
        goto L128
    L118:
        r74 = null;
        goto L119
    L98:
        boolean r28 = r2.equals(r45);
        AbstractC0295Gu.m625r(-802991380625461L);
        AbstractC0295Gu.m625r(-803077279971381L);
        AbstractC0295Gu.m625r(-803128819578933L);
        AbstractC0295Gu.m625r(-802656373176373L);
        String r88 = r33.f223a;
        String r98 = AbstractC0295Gu.m625r(-802742272522293L);
        String r108 = r33.f224b;
        String r114 = r33.f225c;
        String r125 = r33.f227e;
        String r144 = r33.f228f;
        String r46 = r33.f226d;
        String r511 = r33.f229g;
        String r37 = r33.f230h;
        if (r28 == false) goto L102;
        EnumC0099CC r137 = EnumC0099CC.f237e;
    L103:
        C0185EC r77 = new C0185EC(r88, r98, r108, r114, r125, null, r144, null, r46, null, 0.0d, false, 0, null, null, null, r511, r37, r137, r28, 0, 3210912, 0);
        r0.add(r77);
        AbstractC0295Gu.m625r(-802750862456885L);
        AbstractC0295Gu.m625r(-802836761802805L);
        AbstractC0295Gu.m625r(-802888301410357L);
        Objects.toString(r77.f567s);
        goto L95
    L102:
        r137 = EnumC0099CC.f236d;
        goto L103
    L157:
        return AbstractC2453ra.m4904n0(r0, new C0314HC(new C0314HC(new C0314HC(new C0963Wb(10), 1), 2), 0));
    L87:
        AbstractC0295Gu.m625r(-804632058132533L);
        AbstractC0295Gu.m625r(-804717957478453L);
        C0183EA.f539a.getClass();
        C0097CA r17 = C0183EA.m376d();
        boolean r282 = r2.equals(r17.f223a);
        String r89 = r17.f223a;
        String r99 = AbstractC0295Gu.m625r(-804812446758965L);
        String r109 = r17.f224b;
        String r115 = r17.f225c;
        String r126 = r17.f227e;
        String r145 = r17.f228f;
        String r38 = r17.f226d;
        String r47 = r17.f229g;
        String r18 = r17.f230h;
        if (r282 == false) goto L91;
        EnumC0099CC r512 = EnumC0099CC.f237e;
    L92:
        C0185EC r78 = new C0185EC(r89, r99, r109, r115, r126, null, r145, null, r38, null, 0.0d, false, 0, null, null, null, r47, r18, r512, r282, 0, 3210912, 0);
        r0.add(r78);
        AbstractC0295Gu.m625r(-804821036693557L);
        AbstractC0295Gu.m625r(-804357180225589L);
        AbstractC0295Gu.m625r(-804417309767733L);
        Objects.toString(r78.f567s);
        goto L93
    L91:
        r512 = EnumC0099CC.f236d;
        goto L92
    }

    /* JADX INFO: renamed from: c */
    public static final void m791c(C0357IC r5) {
        r5.getClass();
        Iterator r52 = f1220c.iterator();
    L4:
        if (r52.hasNext() == false) goto L6;
        C0701QC r0 = (C0701QC) r52.next();
        r0.getClass();
        C1498hd r1 = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C0529MC(r0, null, 0), 3);
        goto L4
    }

    /* JADX INFO: renamed from: d */
    public static Object m792d(boolean r3, AbstractC0644Oz r4) {
        if (f1219b.isEmpty() == true) goto L7;
        if (r3 == true) goto L7;
        return f1219b;
    L7:
        C1498hd r32 = AbstractC1499he.f5282a;
        int r2 = 0;
        return AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C0228FC(r2, null), r4);
    }

    /* JADX INFO: renamed from: e */
    public static List m793e(String r3) {
        C0029Am r0 = AbstractC2809zm.f9524a;     // Catch: Exception -> L4
        r0.getClass();     // Catch: Exception -> L4
        Object r32 = r0.m4550a(ApiResponse.Companion.serializer(ThemeStoreData.Companion.serializer()), r3);     // Catch: Exception -> L4
    L6:
        ApiResponse r33 = (ApiResponse) r32;
        C0452Kf r02 = C0452Kf.f1484a;
        if (r33 != null) goto L10;
    L11:
        return r02;
    L10:
        if (r33.getCode() != 0) goto L11;
        ThemeStoreData r34 = (ThemeStoreData) r33.getData();
        if (r34 == null) goto L21;
        List<ThemeStoreItem> r35 = r34.getItems();
        if (r35 != null) goto L18;
        return r02;
    L18:
        return r35;
    L21:
        return r02;
    L4:
        e = move-exception;
        AbstractC0295Gu.m625r(-803764474738741L);
        AbstractC0425Jv.m881a(ApiResponse.class).m445b();
        AbstractC0295Gu.m625r(-803880438855733L);
        e.getMessage();
        r32 = null;
        goto L6
    }

    /* JADX INFO: renamed from: f */
    public static void m794f(String r10, EnumC0099CC r11) {
        AbstractC0295Gu.m625r(-802518934222901L);
        AbstractC0295Gu.m625r(-802553293961269L);
        Iterator r0 = f1219b.iterator();
        int r1 = 0;
    L4:
        if (r0.hasNext() == false) goto L9;
        if (AbstractC0585Nj.m1134a(((C0185EC) r0.next()).f549a, r10) == true) goto L10;
        r1 = r1 + 1;
    L10:
        if (r1 == (-1)) goto L15;
        ArrayList r02 = new ArrayList(f1219b);
        r02.set(r1, C0185EC.m386a((C0185EC) r02.get(r1), null, null, null, null, r11, false, 3932159));
        f1219b = r02;
        Iterator r102 = f1220c.iterator();
    L13:
        if (r102.hasNext() == false) goto L19;
        C0701QC r112 = (C0701QC) r102.next();
        r112.getClass();
        AbstractC0295Gu.m625r(-464341799270453L);
        AbstractC0295Gu.m625r(-464376159008821L);
        C1498hd r03 = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C0529MC(r112, null, 1), 3);
        goto L13
    L19:
        return;
    L15:
        return;
    L9:
        r1 = -1;
        goto L10
    }
}

package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nFragmentTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentTransition.kt\nandroidx/fragment/app/FragmentTransition\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n515#2:123\n500#2,6:124\n125#3:130\n152#3,3:131\n125#3:134\n152#3,3:135\n125#3:138\n152#3,3:139\n1855#4,2:142\n*S KotlinDebug\n*F\n+ 1 FragmentTransition.kt\nandroidx/fragment/app/FragmentTransition\n*L\n50#1:123\n50#1:124,6\n53#1:130\n53#1:131,3\n98#1:134\n98#1:135,3\n99#1:138\n99#1:139,3\n113#1:142,2\n*E\n"})
public final class C2791 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C2791 f9113 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC3417
    @Yue.InterfaceC4543
    public static final Yue.AbstractC2798 f9114 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC3417
    @Yue.InterfaceC4543
    public static final Yue.AbstractC2798 f9115 = null;

    static {
            Yue.ۥۣ۠۟ۤ r0 = new Yue.ۥۣ۠۟ۤ
            r0.<init>()
            Yue.C2791.f9113 = r0
            Yue.ۥۣ۠۟ۥ r1 = new Yue.ۥۣ۠۟ۥ
            r1.<init>()
            Yue.C2791.f9114 = r1
            Yue.ۥۣ۠۟ۦ r0 = r0.m12206()
            Yue.C2791.f9115 = r0
            return
    }

    public C2791() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final void m12201(@Yue.InterfaceC4418 androidx.fragment.app.Fragment r1, @Yue.InterfaceC4418 androidx.fragment.app.Fragment r2, boolean r3, @Yue.InterfaceC4418 Yue.C0573<java.lang.String, android.view.View> r4, boolean r5) {
            java.lang.String r0 = "inFragment"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "outFragment"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "sharedElements"
            Yue.C3329.m13906(r4, r0)
            if (r3 == 0) goto L16
            Yue.ۥۡۨۨ۟ r1 = r2.getEnterTransitionCallback()
            goto L1a
        L16:
            Yue.ۥۡۨۨ۟ r1 = r1.getEnterTransitionCallback()
        L1a:
            if (r1 == 0) goto L74
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r4.size()
            r2.<init>(r3)
            java.util.Set r3 = r4.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L2d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r2.add(r0)
            goto L2d
        L43:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r0 = r4.size()
            r3.<init>(r0)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L54:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r3.add(r0)
            goto L54
        L6a:
            r4 = 0
            if (r5 == 0) goto L71
            r1.m21429(r3, r2, r4)
            goto L74
        L71:
            r1.m21428(r3, r2, r4)
        L74:
            return
    }

    @Yue.InterfaceC3427
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String m12202(@Yue.InterfaceC4418 Yue.C0573<java.lang.String, java.lang.String> r3, @Yue.InterfaceC4418 java.lang.String r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r4, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            boolean r2 = Yue.C3329.m13897(r2, r4)
            if (r2 == 0) goto L17
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L17
        L39:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r0.size()
            r3.<init>(r4)
            java.util.Set r4 = r0.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L4a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L60
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r3.add(r0)
            goto L4a
        L60:
            java.lang.Object r3 = Yue.C1219.m6366(r3)
            java.lang.String r3 = (java.lang.String) r3
            return r3
    }

    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m12203(@Yue.InterfaceC4418 Yue.C0573<java.lang.String, java.lang.String> r2, @Yue.InterfaceC4418 Yue.C0573<java.lang.String, android.view.View> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "namedViews"
            Yue.C3329.m13906(r3, r0)
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L10:
            r1 = -1
            if (r1 >= r0) goto L25
            java.lang.Object r1 = r2.valueAt(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r3.containsKey(r1)
            if (r1 != 0) goto L22
            r2.removeAt(r0)
        L22:
            int r0 = r0 + (-1)
            goto L10
        L25:
            return
    }

    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final void m12204(@Yue.InterfaceC4418 java.util.List<? extends android.view.View> r1, int r2) {
            java.lang.String r0 = "views"
            Yue.C3329.m13906(r1, r0)
            java.util.Iterator r1 = r1.iterator()
        L9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r2)
            goto L9
        L19:
            return
    }

    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final boolean m12205() {
            Yue.ۥۣ۠۟ۦ r0 = Yue.C2791.f9114
            if (r0 != 0) goto Lb
            Yue.ۥۣ۠۟ۦ r0 = Yue.C2791.f9115
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.AbstractC2798 m12206() {
            r3 = this;
            r0 = 0
            java.lang.Class<Yue.ۥۣ۠۟ۨ> r1 = Yue.C2801.class
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>"
            Yue.C3329.m13904(r1, r2)     // Catch: java.lang.Exception -> L13
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r0)     // Catch: java.lang.Exception -> L13
            java.lang.Object r1 = r1.newInstance(r0)     // Catch: java.lang.Exception -> L13
            Yue.ۥۣ۠۟ۦ r1 = (Yue.AbstractC2798) r1     // Catch: java.lang.Exception -> L13
            r0 = r1
        L13:
            return r0
    }
}

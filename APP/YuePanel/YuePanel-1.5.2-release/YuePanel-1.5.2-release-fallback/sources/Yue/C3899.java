package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n341#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n*L\n24#1:105,6\n*E\n"})
public class C3899 {
    public C3899() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4986
    @Yue.InterfaceC3421(name = "getOrImplicitDefaultNullable")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <K, V> V m15713(@Yue.InterfaceC4418 java.util.Map<K, ? extends V> r2, K r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = r2 instanceof Yue.InterfaceC3896
            if (r0 == 0) goto L10
            Yue.ۥ۠ۨۧۢ r2 = (Yue.InterfaceC3896) r2
            java.lang.Object r2 = r2.mo15708(r3)
            return r2
        L10:
            java.lang.Object r0 = r2.get(r3)
            if (r0 != 0) goto L39
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L1d
            goto L39
        L1d:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Key "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " is missing in the map."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        L39:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <K, V> java.util.Map<K, V> m15714(@Yue.InterfaceC4418 java.util.Map<K, ? extends V> r1, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super K, ? extends V> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "defaultValue"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = r1 instanceof Yue.InterfaceC3896
            if (r0 == 0) goto L19
            Yue.ۥ۠ۨۧۢ r1 = (Yue.InterfaceC3896) r1
            java.util.Map r1 = r1.getMap()
            java.util.Map r1 = m15714(r1, r2)
            goto L1f
        L19:
            Yue.ۥۣ۠ۨۧ r0 = new Yue.ۥۣ۠ۨۧ
            r0.<init>(r1, r2)
            r1 = r0
        L1f:
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "withDefaultMutable")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <K, V> java.util.Map<K, V> m15715(@Yue.InterfaceC4418 java.util.Map<K, V> r1, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super K, ? extends V> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "defaultValue"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = r1 instanceof Yue.InterfaceC4310
            if (r0 == 0) goto L19
            Yue.ۥۡۡۦۧ r1 = (Yue.InterfaceC4310) r1
            java.util.Map r1 = r1.getMap()
            java.util.Map r1 = m15715(r1, r2)
            goto L1f
        L19:
            Yue.ۥۡۡۦۨ r0 = new Yue.ۥۡۡۦۨ
            r0.<init>(r1, r2)
            r1 = r0
        L1f:
            return r1
    }
}

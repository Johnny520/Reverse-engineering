package p000;

/* JADX INFO: renamed from: fd */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0281fd {

    /* JADX INFO: renamed from: ξ */
    public static final /* synthetic */ int f3883 = 0;

    /* JADX INFO: renamed from: α */
    public final boolean f3884;

    /* JADX INFO: renamed from: β */
    public final boolean f3885;

    /* JADX INFO: renamed from: γ */
    public final int f3886;

    /* JADX INFO: renamed from: δ */
    public final int f3887;

    /* JADX INFO: renamed from: ε */
    public final boolean f3888;

    /* JADX INFO: renamed from: ζ */
    public final boolean f3889;

    /* JADX INFO: renamed from: η */
    public final boolean f3890;

    /* JADX INFO: renamed from: θ */
    public final int f3891;

    /* JADX INFO: renamed from: ι */
    public final int f3892;

    /* JADX INFO: renamed from: κ */
    public final boolean f3893;

    /* JADX INFO: renamed from: λ */
    public final boolean f3894;

    /* JADX INFO: renamed from: μ */
    public final boolean f3895;

    /* JADX INFO: renamed from: ν */
    public java.lang.String f3896;

    static {
            int r0 = p000.AbstractC0887uw.f10969
            ax r0 = p000.EnumC0056ax.f1355
            int r0 = r0.compareTo(r0)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r3 = 1
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r0 > 0) goto L1b
            long r4 = (long) r4
            long r0 = r1.convert(r4, r2)
            long r0 = r0 << r3
            int r4 = p000.AbstractC1073zw.f13326
            goto L50
        L1b:
            long r4 = (long) r4
            r6 = -4611686018(0xfffffffeed1f417e, double:NaN)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L36
            r6 = 4611686018(0x112e0be82, double:2.278475631E-314)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L36
            long r0 = r1.convert(r4, r2)
            long r0 = r0 << r3
            int r4 = p000.AbstractC1073zw.f13326
            goto L50
        L36:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r6 = r0.convert(r4, r2)
            r8 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r10 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r0 = p000.j81.m2908(r6, r8, r10)
            long r0 = r0 << r3
            r4 = 1
            long r0 = r0 + r4
            int r4 = p000.AbstractC1073zw.f13326
        L50:
            long r4 = p000.AbstractC0887uw.f10967
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L5c
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L76
        L5c:
            long r4 = p000.AbstractC0887uw.f10968
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L65
            r0 = -9223372036854775808
            goto L76
        L65:
            long r4 = r0 >> r3
            int r0 = (int) r0
            r0 = r0 & r3
            if (r0 != 0) goto L6e
            ax r0 = p000.EnumC0056ax.f1353
            goto L70
        L6e:
            ax r0 = p000.EnumC0056ax.f1354
        L70:
            java.util.concurrent.TimeUnit r0 = r0.f1357
            long r0 = r2.convert(r4, r0)
        L76:
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L7d
            return
        L7d:
            java.lang.String r2 = "maxStale < 0: "
            java.lang.String r0 = p000.AbstractC0602nx.m4126(r0, r2)
            p000.C1080.m7266(r0)
            return
    }

    public C0281fd(boolean r1, boolean r2, int r3, int r4, boolean r5, boolean r6, boolean r7, int r8, int r9, boolean r10, boolean r11, boolean r12, java.lang.String r13) {
            r0 = this;
            r0.<init>()
            r0.f3884 = r1
            r0.f3885 = r2
            r0.f3886 = r3
            r0.f3887 = r4
            r0.f3888 = r5
            r0.f3889 = r6
            r0.f3890 = r7
            r0.f3891 = r8
            r0.f3892 = r9
            r0.f3893 = r10
            r0.f3894 = r11
            r0.f3895 = r12
            r0.f3896 = r13
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = r5.f3896
            if (r0 != 0) goto Lb0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r5.f3884
            if (r1 == 0) goto L12
            java.lang.String r1 = "no-cache, "
            r0.append(r1)
        L12:
            boolean r1 = r5.f3885
            if (r1 == 0) goto L1b
            java.lang.String r1 = "no-store, "
            r0.append(r1)
        L1b:
            java.lang.String r1 = ", "
            r2 = -1
            int r3 = r5.f3886
            if (r3 == r2) goto L2d
            java.lang.String r4 = "max-age="
            r0.append(r4)
            r0.append(r3)
            r0.append(r1)
        L2d:
            int r3 = r5.f3887
            if (r3 == r2) goto L3c
            java.lang.String r4 = "s-maxage="
            r0.append(r4)
            r0.append(r3)
            r0.append(r1)
        L3c:
            boolean r3 = r5.f3888
            if (r3 == 0) goto L45
            java.lang.String r3 = "private, "
            r0.append(r3)
        L45:
            boolean r3 = r5.f3889
            if (r3 == 0) goto L4e
            java.lang.String r3 = "public, "
            r0.append(r3)
        L4e:
            boolean r3 = r5.f3890
            if (r3 == 0) goto L57
            java.lang.String r3 = "must-revalidate, "
            r0.append(r3)
        L57:
            int r3 = r5.f3891
            if (r3 == r2) goto L66
            java.lang.String r4 = "max-stale="
            r0.append(r4)
            r0.append(r3)
            r0.append(r1)
        L66:
            int r3 = r5.f3892
            if (r3 == r2) goto L75
            java.lang.String r2 = "min-fresh="
            r0.append(r2)
            r0.append(r3)
            r0.append(r1)
        L75:
            boolean r1 = r5.f3893
            if (r1 == 0) goto L7e
            java.lang.String r1 = "only-if-cached, "
            r0.append(r1)
        L7e:
            boolean r1 = r5.f3894
            if (r1 == 0) goto L87
            java.lang.String r1 = "no-transform, "
            r0.append(r1)
        L87:
            boolean r1 = r5.f3895
            if (r1 == 0) goto L90
            java.lang.String r1 = "immutable, "
            r0.append(r1)
        L90:
            int r1 = r0.length()
            if (r1 != 0) goto L99
            java.lang.String r5 = ""
            return r5
        L99:
            int r1 = r0.length()
            int r1 = r1 + (-2)
            int r2 = r0.length()
            java.lang.StringBuilder r1 = r0.delete(r1, r2)
            r1.getClass()
            java.lang.String r0 = r0.toString()
            r5.f3896 = r0
        Lb0:
            return r0
    }
}

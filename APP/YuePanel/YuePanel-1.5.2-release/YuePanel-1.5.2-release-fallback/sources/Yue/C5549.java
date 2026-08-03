package Yue;

import Yue.AbstractC5548;

/* JADX INFO: renamed from: Yue.ۥۡۧۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3419
public final class C5549<S extends Yue.AbstractC5548<S>> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.Object f20499;

    public /* synthetic */ C5549(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.f20499 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C5549 m20815(java.lang.Object r1) {
            Yue.ۥۡۧۨ۠ r0 = new Yue.ۥۡۧۨ۠
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static <S extends Yue.AbstractC5548<S>> java.lang.Object m20816(@Yue.InterfaceC4543 java.lang.Object r0) {
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m20817(java.lang.Object r2, java.lang.Object r3) {
            boolean r0 = r3 instanceof Yue.C5549
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            Yue.ۥۡۧۨ۠ r3 = (Yue.C5549) r3
            java.lang.Object r3 = r3.m20824()
            boolean r2 = Yue.C3329.m13897(r2, r3)
            if (r2 != 0) goto L13
            return r1
        L13:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final boolean m20818(java.lang.Object r0, java.lang.Object r1) {
            boolean r0 = Yue.C3329.m13897(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m20819() {
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final S m20820(java.lang.Object r1) {
            Yue.ۥۢ۠ۦۢ r0 = Yue.C1447.m7101()
            if (r1 == r0) goto L13
            if (r1 == 0) goto Lb
            Yue.ۥۡۧۨ۟ r1 = (Yue.AbstractC5548) r1
            return r1
        Lb:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed"
            r1.<init>(r0)
            throw r1
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Does not contain segment"
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static int m20821(java.lang.Object r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            int r0 = r0.hashCode()
        L8:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean m20822(java.lang.Object r1) {
            Yue.ۥۢ۠ۦۢ r0 = Yue.C1447.m7101()
            if (r1 != r0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static java.lang.String m20823(java.lang.Object r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SegmentOrClosed(value="
            r0.append(r1)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.f20499
            boolean r2 = m20817(r0, r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.f20499
            int r0 = m20821(r0)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.Object r0 = r1.f20499
            java.lang.String r0 = m20823(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object m20824() {
            r1 = this;
            java.lang.Object r0 = r1.f20499
            return r0
    }
}

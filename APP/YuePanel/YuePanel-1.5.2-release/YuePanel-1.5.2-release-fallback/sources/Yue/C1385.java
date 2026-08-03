package Yue;

import java.lang.Comparable;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1385<T extends java.lang.Comparable<? super T>> implements Yue.InterfaceC1179<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final T f4486;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final T f4487;

    public C1385(@Yue.InterfaceC4418 T r2, @Yue.InterfaceC4418 T r3) {
            r1 = this;
            java.lang.String r0 = "start"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "endInclusive"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f4486 = r2
            r1.f4487 = r3
            return
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof Yue.C1385
            if (r0 == 0) goto L33
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            Yue.ۥ۟ۦۡۥ r0 = (Yue.C1385) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L31
        L13:
            java.lang.Comparable r0 = r2.mo5769()
            Yue.ۥ۟ۦۡۥ r3 = (Yue.C1385) r3
            java.lang.Comparable r1 = r3.mo5769()
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 == 0) goto L33
            java.lang.Comparable r0 = r2.mo5771()
            java.lang.Comparable r3 = r3.mo5771()
            boolean r3 = Yue.C3329.m13897(r0, r3)
            if (r3 == 0) goto L33
        L31:
            r3 = 1
            goto L34
        L33:
            r3 = 0
        L34:
            return r3
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L1b
        L8:
            java.lang.Comparable r0 = r2.mo5769()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Comparable r1 = r2.mo5771()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
        L1b:
            return r0
    }

    @Override // Yue.InterfaceC1179, Yue.InterfaceC4636
    public boolean isEmpty() {
            r1 = this;
            boolean r0 = Yue.InterfaceC1179.C1180.m6133(r1)
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Comparable r1 = r2.mo5769()
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            java.lang.Comparable r1 = r2.mo5771()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC1179, Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ */
    public boolean mo5768(@Yue.InterfaceC4418 T r1) {
            r0 = this;
            boolean r1 = Yue.InterfaceC1179.C1180.m6132(r0, r1)
            return r1
    }

    @Override // Yue.InterfaceC1179, Yue.InterfaceC4636
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ */
    public T mo5769() {
            r1 = this;
            T extends java.lang.Comparable<? super T> r0 = r1.f4486
            return r0
    }

    @Override // Yue.InterfaceC1179
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public T mo5771() {
            r1 = this;
            T extends java.lang.Comparable<? super T> r0 = r1.f4487
            return r0
    }
}

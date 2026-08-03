package Yue;

import java.lang.Comparable;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1384<T extends java.lang.Comparable<? super T>> implements Yue.InterfaceC4636<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final T f4484;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final T f4485;

    public C1384(@Yue.InterfaceC4418 T r2, @Yue.InterfaceC4418 T r3) {
            r1 = this;
            java.lang.String r0 = "start"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "endExclusive"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f4484 = r2
            r1.f4485 = r3
            return
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof Yue.C1384
            if (r0 == 0) goto L33
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            Yue.ۥ۟ۦۡۤ r0 = (Yue.C1384) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L31
        L13:
            java.lang.Comparable r0 = r2.mo5769()
            Yue.ۥ۟ۦۡۤ r3 = (Yue.C1384) r3
            java.lang.Comparable r1 = r3.mo5769()
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 == 0) goto L33
            java.lang.Comparable r0 = r2.mo5770()
            java.lang.Comparable r3 = r3.mo5770()
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
            java.lang.Comparable r1 = r2.mo5770()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
        L1b:
            return r0
    }

    @Override // Yue.InterfaceC4636
    public boolean isEmpty() {
            r1 = this;
            boolean r0 = Yue.InterfaceC4636.C4637.m18463(r1)
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Comparable r1 = r2.mo5769()
            r0.append(r1)
            java.lang.String r1 = "..<"
            r0.append(r1)
            java.lang.Comparable r1 = r2.mo5770()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ */
    public boolean mo5768(@Yue.InterfaceC4418 T r1) {
            r0 = this;
            boolean r1 = Yue.InterfaceC4636.C4637.m18462(r0, r1)
            return r1
    }

    @Override // Yue.InterfaceC4636
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ */
    public T mo5769() {
            r1 = this;
            T extends java.lang.Comparable<? super T> r0 = r1.f4484
            return r0
    }

    @Override // Yue.InterfaceC4636
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public T mo5770() {
            r1 = this;
            T extends java.lang.Comparable<? super T> r0 = r1.f4485
            return r0
    }
}

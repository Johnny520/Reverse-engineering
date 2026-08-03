package Yue;

import Yue.InterfaceC6190;
import java.lang.Comparable;

/* JADX INFO: renamed from: Yue.ۥۢۡۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3324
public class C6189<T extends Yue.InterfaceC6190 & java.lang.Comparable<? super T>> {

    @Yue.InterfaceC4418
    private volatile /* synthetic */ int _size;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public T[] f22167;

    public C6189() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._size = r0
            return
    }

    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m23147(@Yue.InterfaceC4418 T r4) {
            r3 = this;
            r4.mo10277(r3)
            Yue.ۥۣۢۡۢ[] r0 = r3.m23156()
            int r1 = r3.m23153()
            int r2 = r1 + 1
            r3.m23161(r2)
            r0[r1] = r4
            r4.mo10279(r1)
            r3.m23163(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m23148(@Yue.InterfaceC4418 T r1) {
            r0 = this;
            monitor-enter(r0)
            r0.m23147(r1)     // Catch: java.lang.Throwable -> L8
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m23149(@Yue.InterfaceC4418 T r3, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, java.lang.Boolean> r4) {
            r2 = this;
            monitor-enter(r2)
            r0 = 1
            Yue.ۥۣۢۡۢ r1 = r2.m23152()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r4 = r4.invoke(r1)     // Catch: java.lang.Throwable -> L17
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L17
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L19
            r2.m23147(r3)     // Catch: java.lang.Throwable -> L17
            r3 = r0
            goto L1a
        L17:
            r3 = move-exception
            goto L22
        L19:
            r3 = 0
        L1a:
            Yue.C3249.m13687(r0)
            monitor-exit(r2)
            Yue.C3249.m13686(r0)
            return r3
        L22:
            Yue.C3249.m13687(r0)
            monitor-exit(r2)
            Yue.C3249.m13686(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m23150() {
            r6 = this;
            monitor-enter(r6)
            T extends Yue.ۥۣۢۡۢ & java.lang.Comparable<? super T>[] r0 = r6.f22167     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            r4 = 6
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            Yue.C0586.m2248(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r0 = move-exception
            goto L17
        L10:
            r0 = 0
            r6._size = r0     // Catch: java.lang.Throwable -> Le
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> Le
            monitor-exit(r6)
            return
        L17:
            monitor-exit(r6)
            throw r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final T m23151(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, java.lang.Boolean> r5) {
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.m23153()     // Catch: java.lang.Throwable -> L10
            r1 = 0
        L6:
            r2 = 0
            if (r1 >= r0) goto L25
            T extends Yue.ۥۣۢۡۢ & java.lang.Comparable<? super T>[] r3 = r4.f22167     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L12
            r2 = r3[r1]     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r5 = move-exception
            goto L27
        L12:
            Yue.C3329.m13903(r2)     // Catch: java.lang.Throwable -> L10
            java.lang.Object r3 = r5.invoke(r2)     // Catch: java.lang.Throwable -> L10
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L10
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L22
            goto L25
        L22:
            int r1 = r1 + 1
            goto L6
        L25:
            monitor-exit(r4)
            return r2
        L27:
            monitor-exit(r4)
            throw r5
    }

    @Yue.InterfaceC4986
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final T m23152() {
            r2 = this;
            T extends Yue.ۥۣۢۡۢ & java.lang.Comparable<? super T>[] r0 = r2.f22167
            if (r0 == 0) goto L8
            r1 = 0
            r0 = r0[r1]
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int m23153() {
            r1 = this;
            int r0 = r1._size
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m23154() {
            r1 = this;
            int r0 = r1.m23153()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final T m23155() {
            r1 = this;
            monitor-enter(r1)
            Yue.ۥۣۢۡۢ r0 = r1.m23152()     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return r0
        L7:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final T[] m23156() {
            r3 = this;
            T extends Yue.ۥۣۢۡۢ & java.lang.Comparable<? super T>[] r0 = r3.f22167
            if (r0 != 0) goto La
            r0 = 4
            Yue.ۥۣۢۡۢ[] r0 = new Yue.InterfaceC6190[r0]
            r3.f22167 = r0
            goto L24
        La:
            int r1 = r3.m23153()
            int r2 = r0.length
            if (r1 < r2) goto L24
            int r1 = r3.m23153()
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "copyOf(this, newSize)"
            Yue.C3329.m13905(r0, r1)
            Yue.ۥۣۢۡۢ[] r0 = (Yue.InterfaceC6190[]) r0
            r3.f22167 = r0
        L24:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final boolean m23157(@Yue.InterfaceC4418 T r2) {
            r1 = this;
            monitor-enter(r1)
            Yue.ۥۢۡۢۢ r0 = r2.mo10278()     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L9
            r2 = 0
            goto L11
        L9:
            int r2 = r2.getIndex()     // Catch: java.lang.Throwable -> L13
            r1.m23158(r2)     // Catch: java.lang.Throwable -> L13
            r2 = 1
        L11:
            monitor-exit(r1)
            return r2
        L13:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final T m23158(int r6) {
            r5 = this;
            T extends Yue.ۥۣۢۡۢ & java.lang.Comparable<? super T>[] r0 = r5.f22167
            Yue.C3329.m13903(r0)
            int r1 = r5.m23153()
            r2 = -1
            int r1 = r1 + r2
            r5.m23161(r1)
            int r1 = r5.m23153()
            if (r6 >= r1) goto L3d
            int r1 = r5.m23153()
            r5.m23164(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            Yue.C3329.m13903(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            Yue.C3329.m13903(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.m23164(r6, r1)
            r5.m23163(r1)
            goto L3d
        L3a:
            r5.m23162(r6)
        L3d:
            int r6 = r5.m23153()
            r6 = r0[r6]
            Yue.C3329.m13903(r6)
            r1 = 0
            r6.mo10277(r1)
            r6.mo10279(r2)
            int r2 = r5.m23153()
            r0[r2] = r1
            return r6
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final T m23159(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, java.lang.Boolean> r4) {
            r3 = this;
            monitor-enter(r3)
            r0 = 1
            Yue.ۥۣۢۡۢ r1 = r3.m23152()     // Catch: java.lang.Throwable -> L24
            r2 = 0
            if (r1 != 0) goto L12
            r4 = 2
            Yue.C3249.m13687(r4)
            monitor-exit(r3)
            Yue.C3249.m13686(r4)
            return r2
        L12:
            java.lang.Object r4 = r4.invoke(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L24
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L26
            r4 = 0
            Yue.ۥۣۢۡۢ r2 = r3.m23158(r4)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r4 = move-exception
            goto L2e
        L26:
            Yue.C3249.m13687(r0)
            monitor-exit(r3)
            Yue.C3249.m13686(r0)
            return r2
        L2e:
            Yue.C3249.m13687(r0)
            monitor-exit(r3)
            Yue.C3249.m13686(r0)
            throw r4
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final T m23160() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.m23153()     // Catch: java.lang.Throwable -> Ld
            if (r0 <= 0) goto Lf
            r0 = 0
            Yue.ۥۣۢۡۢ r0 = r1.m23158(r0)     // Catch: java.lang.Throwable -> Ld
            goto L10
        Ld:
            r0 = move-exception
            goto L12
        Lf:
            r0 = 0
        L10:
            monitor-exit(r1)
            return r0
        L12:
            monitor-exit(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m23161(int r1) {
            r0 = this;
            r0._size = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m23162(int r6) {
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.m23153()
            if (r1 < r2) goto Lb
            return
        Lb:
            T extends Yue.ۥۣۢۡۢ & java.lang.Comparable<? super T>[] r2 = r5.f22167
            Yue.C3329.m13903(r2)
            int r0 = r0 + 2
            int r3 = r5.m23153()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            Yue.C3329.m13903(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            Yue.C3329.m13903(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            Yue.C3329.m13903(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            Yue.C3329.m13903(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
            return
        L3f:
            r5.m23164(r6, r0)
            r6 = r0
            goto L0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m23163(int r4) {
            r3 = this;
        L0:
            if (r4 > 0) goto L3
            return
        L3:
            T extends Yue.ۥۣۢۡۢ & java.lang.Comparable<? super T>[] r0 = r3.f22167
            Yue.C3329.m13903(r0)
            int r1 = r4 + (-1)
            int r1 = r1 / 2
            r2 = r0[r1]
            Yue.C3329.m13903(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r0 = r0[r4]
            Yue.C3329.m13903(r0)
            int r0 = r2.compareTo(r0)
            if (r0 > 0) goto L1f
            return
        L1f:
            r3.m23164(r4, r1)
            r4 = r1
            goto L0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m23164(int r4, int r5) {
            r3 = this;
            T extends Yue.ۥۣۢۡۢ & java.lang.Comparable<? super T>[] r0 = r3.f22167
            Yue.C3329.m13903(r0)
            r1 = r0[r5]
            Yue.C3329.m13903(r1)
            r2 = r0[r4]
            Yue.C3329.m13903(r2)
            r0[r4] = r1
            r0[r5] = r2
            r1.mo10279(r4)
            r2.mo10279(r5)
            return
    }
}

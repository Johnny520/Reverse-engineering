package Yue;

import Yue.AbstractC4398;

/* JADX INFO: renamed from: Yue.ۥۣۡۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4402<T extends Yue.AbstractC4398> implements java.util.Iterator<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Yue.AbstractC4398 f13968;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public T f13969;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Yue.AbstractC4398 f13970;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public Yue.AbstractC4398 f13971;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public Yue.AbstractC4398 f13972;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final java.lang.Class<T> f13973;

    public C4402(Yue.AbstractC4398 r1, java.lang.Class<T> r2) {
            r0 = this;
            r0.<init>()
            Yue.C6657.m25635(r1)
            Yue.C6657.m25635(r2)
            r0.f13973 = r2
            r0.m17310(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.C4402<Yue.AbstractC4398> m17306(Yue.AbstractC4398 r2) {
            Yue.ۥۣۡۢۦ r0 = new Yue.ۥۣۡۢۦ
            java.lang.Class<Yue.ۥۣۡۢۤ> r1 = Yue.AbstractC4398.class
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            r1.m17308()
            T extends Yue.ۥۣۡۢۤ r0 = r1.f13969
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Object next() {
            r1 = this;
            Yue.ۥۣۡۢۤ r0 = r1.m17309()
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r1 = this;
            Yue.ۥۣۡۢۤ r0 = r1.f13970
            r0.m17293()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final T m17307() {
            r3 = this;
            Yue.ۥۣۡۢۤ r0 = r3.f13970
        L2:
            int r1 = r0.mo9797()
            r2 = 0
            if (r1 <= 0) goto Lf
            r1 = 0
            Yue.ۥۣۡۢۤ r0 = r0.m17271(r1)
            goto L3d
        Lf:
            Yue.ۥۣۡۢۤ r1 = r3.f13968
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L19
            r0 = r2
            goto L3d
        L19:
            Yue.ۥۣۡۢۤ r1 = r0.m17283()
            if (r1 == 0) goto L24
            Yue.ۥۣۡۢۤ r0 = r0.m17283()
            goto L3d
        L24:
            Yue.ۥۣۡۢۤ r0 = r0.mo9809()
            if (r0 == 0) goto L49
            Yue.ۥۣۡۢۤ r1 = r3.f13968
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L33
            goto L49
        L33:
            Yue.ۥۣۡۢۤ r1 = r0.m17283()
            if (r1 == 0) goto L24
            Yue.ۥۣۡۢۤ r0 = r0.m17283()
        L3d:
            if (r0 != 0) goto L40
            return r2
        L40:
            java.lang.Class<T extends Yue.ۥۣۡۢۤ> r1 = r3.f13973
            boolean r1 = r1.isInstance(r0)
            if (r1 == 0) goto L2
            return r0
        L49:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m17308() {
            r1 = this;
            T extends Yue.ۥۣۡۢۤ r0 = r1.f13969
            if (r0 == 0) goto L5
            return
        L5:
            Yue.ۥۣۡۢۤ r0 = r1.f13972
            if (r0 == 0) goto L15
            Yue.ۥۣۡۢۤ r0 = r1.f13970
            boolean r0 = r0.m17277()
            if (r0 != 0) goto L15
            Yue.ۥۣۡۢۤ r0 = r1.f13971
            r1.f13970 = r0
        L15:
            Yue.ۥۣۡۢۤ r0 = r1.m17307()
            r1.f13969 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public T m17309() {
            r2 = this;
            r2.m17308()
            T extends Yue.ۥۣۡۢۤ r0 = r2.f13969
            if (r0 == 0) goto L17
            Yue.ۥۣۡۢۤ r1 = r2.f13970
            r2.f13971 = r1
            r2.f13970 = r0
            Yue.ۥۣۡۢۤ r1 = r0.mo9809()
            r2.f13972 = r1
            r1 = 0
            r2.f13969 = r1
            return r0
        L17:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m17310(Yue.AbstractC4398 r2) {
            r1 = this;
            java.lang.Class<T extends Yue.ۥۣۡۢۤ> r0 = r1.f13973
            boolean r0 = r0.isInstance(r2)
            if (r0 == 0) goto La
            r1.f13969 = r2
        La:
            r1.f13970 = r2
            r1.f13971 = r2
            r1.f13968 = r2
            Yue.ۥۣۡۢۤ r2 = r2.mo9809()
            r1.f13972 = r2
            return
    }
}

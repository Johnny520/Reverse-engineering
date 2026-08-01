package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class d51 {

    /* JADX INFO: renamed from: α */
    public final java.lang.Runnable f2893;

    /* JADX INFO: renamed from: β */
    public final p000.C0936w6 f2894;

    /* JADX INFO: renamed from: γ */
    public p000.u60 f2895;

    /* JADX INFO: renamed from: δ */
    public final android.window.OnBackInvokedCallback f2896;

    /* JADX INFO: renamed from: ε */
    public android.window.OnBackInvokedDispatcher f2897;

    /* JADX INFO: renamed from: ζ */
    public boolean f2898;

    /* JADX INFO: renamed from: η */
    public boolean f2899;

    public d51(java.lang.Runnable r5) {
            r4 = this;
            r4.<init>()
            r4.f2893 = r5
            w6 r5 = new w6
            r5.<init>()
            r4.f2894 = r5
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r5 < r0) goto L43
            r0 = 34
            if (r5 < r0) goto L35
            w41 r5 = new w41
            r0 = 0
            r5.<init>(r4, r0)
            w41 r0 = new w41
            r1 = 1
            r0.<init>(r4, r1)
            x41 r1 = new x41
            r2 = 0
            r1.<init>(r4, r2)
            x41 r2 = new x41
            r3 = 1
            r2.<init>(r4, r3)
            a51 r3 = p000.a51.f70
            android.window.OnBackInvokedCallback r5 = r3.m37(r5, r0, r1, r2)
            goto L41
        L35:
            x41 r5 = new x41
            r0 = 2
            r5.<init>(r4, r0)
            y41 r0 = p000.y41.f12453
            android.window.OnBackInvokedCallback r5 = r0.m6831(r5)
        L41:
            r4.f2896 = r5
        L43:
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m1653() {
            r4 = this;
            w6 r0 = r4.f2894
            int r1 = r0.mo4827()
            java.util.ListIterator r0 = r0.listIterator(r1)
        La:
            boolean r1 = r0.hasPrevious()
            r2 = 0
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.previous()
            r3 = r1
            u60 r3 = (p000.u60) r3
            boolean r3 = r3.f10607
            if (r3 == 0) goto La
            goto L1e
        L1d:
            r1 = r2
        L1e:
            u60 r1 = (p000.u60) r1
            r4.f2895 = r2
            if (r1 == 0) goto L3a
            b70 r4 = r1.f10610
            r0 = 1
            r4.m799(r0)
            u60 r0 = r4.f1525
            boolean r0 = r0.f10607
            if (r0 == 0) goto L34
            r4.m765()
            return
        L34:
            d51 r4 = r4.f1524
            r4.m1653()
            return
        L3a:
            java.lang.Runnable r4 = r4.f2893
            r4.run()
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m1654(boolean r6) {
            r5 = this;
            android.window.OnBackInvokedDispatcher r0 = r5.f2897
            if (r0 == 0) goto L23
            android.window.OnBackInvokedCallback r1 = r5.f2896
            if (r1 == 0) goto L23
            r2 = 0
            y41 r3 = p000.y41.f12453
            if (r6 == 0) goto L18
            boolean r4 = r5.f2898
            if (r4 != 0) goto L18
            r3.m6832(r0, r2, r1)
            r6 = 1
            r5.f2898 = r6
            return
        L18:
            if (r6 != 0) goto L23
            boolean r6 = r5.f2898
            if (r6 == 0) goto L23
            r3.m6833(r0, r1)
            r5.f2898 = r2
        L23:
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m1655() {
            r4 = this;
            boolean r0 = r4.f2899
            r1 = 0
            w6 r2 = r4.f2894
            if (r2 == 0) goto Le
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto Le
            goto L23
        Le:
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L23
            java.lang.Object r3 = r2.next()
            u60 r3 = (p000.u60) r3
            boolean r3 = r3.f10607
            if (r3 == 0) goto L12
            r1 = 1
        L23:
            r4.f2899 = r1
            if (r1 == r0) goto L30
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r0 < r2) goto L30
            r4.m1654(r1)
        L30:
            return
    }
}

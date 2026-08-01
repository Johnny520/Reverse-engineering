package p000;

/* JADX INFO: renamed from: hy */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0376hy implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4837;

    /* JADX INFO: renamed from: ζ */
    public final int f4838;

    /* JADX INFO: renamed from: η */
    public final java.lang.Object f4839;

    public RunnableC0376hy(android.widget.ScrollView r2, int r3) {
            r1 = this;
            r0 = 1
            r1.f4837 = r0
            r1.<init>()
            r1.f4839 = r2
            r1.f4838 = r3
            return
    }

    public RunnableC0376hy(java.util.List r1, int r2, java.lang.Throwable r3) {
            r0 = this;
            r3 = 0
            r0.f4837 = r3
            r0.<init>()
            java.lang.String r3 = "initCallbacks cannot be null"
            p000.p91.m4418(r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            r0.f4839 = r3
            r0.f4838 = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f4837
            switch(r0) {
                case 0: goto L17;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f4839
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r1 = 0
            int r2 = r4.f4838
            r0.smoothScrollBy(r1, r2)
            android.os.Handler r0 = p000.jz1.f5677
            r1 = 32
            r0.postDelayed(r4, r1)
            return
        L17:
            java.lang.Object r0 = r4.f4839
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            int r4 = r4.f4838
            r2 = 1
            r3 = 0
            if (r4 == r2) goto L33
        L25:
            if (r3 >= r1) goto L41
            java.lang.Object r4 = r0.get(r3)
            gy r4 = (p000.AbstractC0339gy) r4
            r4.mo1794()
            int r3 = r3 + 1
            goto L25
        L33:
            if (r3 >= r1) goto L41
            java.lang.Object r4 = r0.get(r3)
            gy r4 = (p000.AbstractC0339gy) r4
            r4.mo643()
            int r3 = r3 + 1
            goto L33
        L41:
            return
    }
}

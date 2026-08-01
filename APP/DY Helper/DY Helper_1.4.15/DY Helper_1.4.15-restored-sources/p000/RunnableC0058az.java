package p000;

/* JADX INFO: renamed from: az */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0058az extends p000.AbstractC0339gy implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final java.lang.ref.WeakReference f1380;

    public RunnableC0058az(android.widget.EditText r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.f1380 = r0
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            java.lang.ref.WeakReference r1 = r1.f1380
            java.lang.Object r1 = r1.get()
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0 = 1
            p000.C0094bz.m1085(r1, r0)
            return
    }

    @Override // p000.AbstractC0339gy
    /* JADX INFO: renamed from: β */
    public final void mo643() {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.f1380
            java.lang.Object r0 = r0.get()
            android.widget.EditText r0 = (android.widget.EditText) r0
            if (r0 != 0) goto Lb
            goto L11
        Lb:
            android.os.Handler r0 = r0.getHandler()
            if (r0 != 0) goto L12
        L11:
            return
        L12:
            r0.post(r1)
            return
    }
}

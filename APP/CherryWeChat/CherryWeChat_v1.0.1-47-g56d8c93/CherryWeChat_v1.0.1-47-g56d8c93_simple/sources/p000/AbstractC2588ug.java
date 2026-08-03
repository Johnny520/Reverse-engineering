package p000;

/* JADX INFO: renamed from: ug */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2588ug extends AbstractC1217bc {

    /* JADX INFO: renamed from: b */
    public long f8957b;

    /* JADX INFO: renamed from: c */
    public boolean f8958c;

    /* JADX INFO: renamed from: d */
    public C0134D4 f8959d;

    /* JADX INFO: renamed from: A */
    public void mo1322A(long r2, AbstractRunnableC2459rg r4) {
        RunnableC0664Pc.f2120h.m5030G(r2, r4);
    }

    public abstract void shutdown();

    /* JADX INFO: renamed from: w */
    public final void m5095w() {
        long r0 = this.f8957b - 4294967296L;
        this.f8957b = r0;
        if (r0 <= 0) goto L6;
        return;
    L6:
        if (this.f8958c == false) goto L9;
        shutdown();
        return;
    }

    /* JADX INFO: renamed from: x */
    public abstract Thread mo1325x();

    /* JADX INFO: renamed from: y */
    public final void m5096y(boolean r5) {
        long r0 = this.f8957b;
        if (r5 == false) goto L5;
        long r2 = 4294967296L;
    L6:
        this.f8957b = r2 + r0;
        if (r5 == true) goto L10;
        this.f8958c = true;
        return;
    L10:
        return;
    L5:
        r2 = 1;
        goto L6
    }

    /* JADX INFO: renamed from: z */
    public final boolean m5097z() {
        C0134D4 r0 = this.f8959d;
        if (r0 != null) goto L6;
        return false;
    L6:
        if (r0.isEmpty() == false) goto L8;
        Object r02 = null;
    L9:
        AbstractC1455ge r03 = (AbstractC1455ge) r02;
        if (r03 != null) goto L12;
        return false;
    L12:
        r03.run();
        return true;
    L8:
        r02 = r0.removeFirst();
        goto L9
    }
}

package p000;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: bB */
/* JADX INFO: loaded from: classes.dex */
public class C1209bB {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4139b = null;
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a */
    public AbstractRunnableC2459rg[] f4140a;

    static {
        f4139b = AtomicIntegerFieldUpdater.newUpdater(C1209bB.class, "_size$volatile");
    }

    /* JADX INFO: renamed from: a */
    public final void m2330a(AbstractRunnableC2459rg r5) {
        r5.m4951d((C2502sg) this);
        AbstractRunnableC2459rg[] r0 = this.f4140a;
        AtomicIntegerFieldUpdater r1 = f4139b;
        if (r0 != null) goto L6;
        r0 = new AbstractRunnableC2459rg[4];
        this.f4140a = r0;
    L8:
        int r2 = r1.get(this);
        r1.set(this, r2 + 1);
        r0[r2] = r5;
        r5.f8667b = r2;
    L9:
        if (r2 <= 0) goto L13;
        Object[] r52 = this.f4140a;
        int r02 = (r2 - 1) / 2;
        if (r52[r02].compareTo(r52[r2]) <= 0) goto L17;
        m2332c(r2, r02);
        r2 = r02;
        goto L9
    L17:
        return;
    L13:
        return;
    L6:
        if (r1.get(this) < r0.length) goto L8;
        r0 = (AbstractRunnableC2459rg[]) Arrays.copyOf(r0, r1.get(this) * 2);
        this.f4140a = r0;
        goto L8
    }

    /* JADX INFO: renamed from: b */
    public final AbstractRunnableC2459rg m2331b(int r9) {
        Object[] r0 = this.f4140a;
        AtomicIntegerFieldUpdater r1 = f4139b;
        r1.set(this, r1.get(this) - 1);
        if (r9 >= r1.get(this)) goto L28;
        m2332c(r9, r1.get(this));
        int r2 = (r9 - 1) / 2;
        if (r9 <= 0) goto L15;
        if (r0[r9].compareTo(r0[r2]) >= 0) goto L15;
        m2332c(r9, r2);
    L9:
        if (r2 <= 0) goto L28;
        Object[] r92 = this.f4140a;
        int r4 = (r2 - 1) / 2;
        if (r92[r4].compareTo(r92[r2]) <= 0) goto L28;
        m2332c(r2, r4);
        r2 = r4;
    L15:
        int r22 = r9 * 2;
        int r42 = r22 + 1;
        if (r42 >= r1.get(this)) goto L28;
        Object[] r5 = this.f4140a;
        int r23 = r22 + 2;
        if (r23 < r1.get(this)) goto L21;
    L23:
        r23 = r42;
    L25:
        if (r5[r9].compareTo(r5[r23]) <= 0) goto L28;
        m2332c(r9, r23);
        r9 = r23;
        goto L15
    L21:
        if (r5[r23].compareTo(r5[r42]) >= 0) goto L23;
    L28:
        AbstractRunnableC2459rg r93 = r0[r1.get(this)];
        r93.m4951d(null);
        r93.f8667b = -1;
        r0[r1.get(this)] = null;
        return r93;
    }

    /* JADX INFO: renamed from: c */
    public final void m2332c(int r4, int r5) {
        AbstractRunnableC2459rg[] r0 = this.f4140a;
        AbstractRunnableC2459rg r1 = r0[r5];
        AbstractRunnableC2459rg r2 = r0[r4];
        r0[r4] = r1;
        r0[r5] = r2;
        r1.f8667b = r4;
        r2.f8667b = r5;
    }
}

package p000;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class a70 {

    /* JADX INFO: renamed from: b */
    public static final AtomicIntegerFieldUpdater f46b = AtomicIntegerFieldUpdater.newUpdater(a70.class, "_size");
    private volatile int _size;

    /* JADX INFO: renamed from: a */
    public AbstractRunnableC0376jj[] f47a;

    /* JADX INFO: renamed from: a */
    public final void m30a(AbstractRunnableC0376jj abstractRunnableC0376jj) {
        abstractRunnableC0376jj.m1614d((C0413kj) this);
        AbstractRunnableC0376jj[] abstractRunnableC0376jjArr = this.f47a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f46b;
        if (abstractRunnableC0376jjArr == null) {
            abstractRunnableC0376jjArr = new AbstractRunnableC0376jj[4];
            this.f47a = abstractRunnableC0376jjArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC0376jjArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(abstractRunnableC0376jjArr, atomicIntegerFieldUpdater.get(this) * 2);
            AbstractC0493mp.m1856f("copyOf(this, newSize)", objArrCopyOf);
            abstractRunnableC0376jjArr = (AbstractRunnableC0376jj[]) objArrCopyOf;
            this.f47a = abstractRunnableC0376jjArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        abstractRunnableC0376jjArr[i] = abstractRunnableC0376jj;
        abstractRunnableC0376jj.f2723b = i;
        m32c(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p000.AbstractRunnableC0376jj m31b(int r9) {
        /*
            r8 = this;
            jj[] r0 = r8.f47a
            p000.AbstractC0493mp.m1854d(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p000.a70.f46b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.m33d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            p000.AbstractC0493mp.m1854d(r4)
            r5 = r0[r2]
            p000.AbstractC0493mp.m1854d(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.m33d(r9, r2)
            r8.m32c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            jj[] r5 = r8.f47a
            p000.AbstractC0493mp.m1854d(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            p000.AbstractC0493mp.m1854d(r6)
            r7 = r5[r4]
            p000.AbstractC0493mp.m1854d(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            p000.AbstractC0493mp.m1854d(r4)
            r5 = r5[r2]
            p000.AbstractC0493mp.m1854d(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.m33d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            p000.AbstractC0493mp.m1854d(r9)
            r2 = 0
            r9.m1614d(r2)
            r9.f2723b = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.a70.m31b(int):jj");
    }

    /* JADX INFO: renamed from: c */
    public final void m32c(int i) {
        while (i > 0) {
            AbstractRunnableC0376jj[] abstractRunnableC0376jjArr = this.f47a;
            AbstractC0493mp.m1854d(abstractRunnableC0376jjArr);
            int i2 = (i - 1) / 2;
            AbstractRunnableC0376jj abstractRunnableC0376jj = abstractRunnableC0376jjArr[i2];
            AbstractC0493mp.m1854d(abstractRunnableC0376jj);
            AbstractRunnableC0376jj abstractRunnableC0376jj2 = abstractRunnableC0376jjArr[i];
            AbstractC0493mp.m1854d(abstractRunnableC0376jj2);
            if (abstractRunnableC0376jj.compareTo(abstractRunnableC0376jj2) <= 0) {
                return;
            }
            m33d(i, i2);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m33d(int i, int i2) {
        AbstractRunnableC0376jj[] abstractRunnableC0376jjArr = this.f47a;
        AbstractC0493mp.m1854d(abstractRunnableC0376jjArr);
        AbstractRunnableC0376jj abstractRunnableC0376jj = abstractRunnableC0376jjArr[i2];
        AbstractC0493mp.m1854d(abstractRunnableC0376jj);
        AbstractRunnableC0376jj abstractRunnableC0376jj2 = abstractRunnableC0376jjArr[i];
        AbstractC0493mp.m1854d(abstractRunnableC0376jj2);
        abstractRunnableC0376jjArr[i] = abstractRunnableC0376jj;
        abstractRunnableC0376jjArr[i2] = abstractRunnableC0376jj2;
        abstractRunnableC0376jj.f2723b = i;
        abstractRunnableC0376jj2.f2723b = i2;
    }
}

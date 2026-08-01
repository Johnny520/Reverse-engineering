package p190k3;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p117X2.AbstractC1665j;
import p160f3.AbstractRunnableC2106I;
import p160f3.C2107J;

/* JADX INFO: renamed from: k3.u */
/* JADX INFO: loaded from: classes.dex */
public class C2473u {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7961b = AtomicIntegerFieldUpdater.newUpdater(C2473u.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a */
    public AbstractRunnableC2106I[] f7962a;

    /* JADX INFO: renamed from: a */
    public final void m4408a(AbstractRunnableC2106I abstractRunnableC2106I) {
        abstractRunnableC2106I.m3889d((C2107J) this);
        AbstractRunnableC2106I[] abstractRunnableC2106IArr = this.f7962a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7961b;
        if (abstractRunnableC2106IArr == null) {
            abstractRunnableC2106IArr = new AbstractRunnableC2106I[4];
            this.f7962a = abstractRunnableC2106IArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC2106IArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(abstractRunnableC2106IArr, atomicIntegerFieldUpdater.get(this) * 2);
            AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
            abstractRunnableC2106IArr = (AbstractRunnableC2106I[]) objArrCopyOf;
            this.f7962a = abstractRunnableC2106IArr;
        }
        int i5 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i5 + 1);
        abstractRunnableC2106IArr[i5] = abstractRunnableC2106I;
        abstractRunnableC2106I.f7037e = i5;
        m4410c(i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p160f3.AbstractRunnableC2106I m4409b(int r9) {
        /*
            r8 = this;
            f3.I[] r0 = r8.f7962a
            p117X2.AbstractC1665j.m2982b(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p190k3.C2473u.f7961b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.m4411d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            p117X2.AbstractC1665j.m2982b(r4)
            r5 = r0[r2]
            p117X2.AbstractC1665j.m2982b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.m4411d(r9, r2)
            r8.m4410c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            f3.I[] r5 = r8.f7962a
            p117X2.AbstractC1665j.m2982b(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            p117X2.AbstractC1665j.m2982b(r6)
            r7 = r5[r4]
            p117X2.AbstractC1665j.m2982b(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            p117X2.AbstractC1665j.m2982b(r4)
            r5 = r5[r2]
            p117X2.AbstractC1665j.m2982b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.m4411d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            p117X2.AbstractC1665j.m2982b(r9)
            r2 = 0
            r9.m3889d(r2)
            r9.f7037e = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p190k3.C2473u.m4409b(int):f3.I");
    }

    /* JADX INFO: renamed from: c */
    public final void m4410c(int i5) {
        while (i5 > 0) {
            AbstractRunnableC2106I[] abstractRunnableC2106IArr = this.f7962a;
            AbstractC1665j.m2982b(abstractRunnableC2106IArr);
            int i6 = (i5 - 1) / 2;
            AbstractRunnableC2106I abstractRunnableC2106I = abstractRunnableC2106IArr[i6];
            AbstractC1665j.m2982b(abstractRunnableC2106I);
            AbstractRunnableC2106I abstractRunnableC2106I2 = abstractRunnableC2106IArr[i5];
            AbstractC1665j.m2982b(abstractRunnableC2106I2);
            if (abstractRunnableC2106I.compareTo(abstractRunnableC2106I2) <= 0) {
                return;
            }
            m4411d(i5, i6);
            i5 = i6;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4411d(int i5, int i6) {
        AbstractRunnableC2106I[] abstractRunnableC2106IArr = this.f7962a;
        AbstractC1665j.m2982b(abstractRunnableC2106IArr);
        AbstractRunnableC2106I abstractRunnableC2106I = abstractRunnableC2106IArr[i6];
        AbstractC1665j.m2982b(abstractRunnableC2106I);
        AbstractRunnableC2106I abstractRunnableC2106I2 = abstractRunnableC2106IArr[i5];
        AbstractC1665j.m2982b(abstractRunnableC2106I2);
        abstractRunnableC2106IArr[i5] = abstractRunnableC2106I;
        abstractRunnableC2106IArr[i6] = abstractRunnableC2106I2;
        abstractRunnableC2106I.f7037e = i5;
        abstractRunnableC2106I2.f7037e = i6;
    }
}

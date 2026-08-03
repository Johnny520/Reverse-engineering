package p000;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: bB */
/* JADX INFO: loaded from: classes.dex */
public class C1209bB {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4139b = AtomicIntegerFieldUpdater.newUpdater(C1209bB.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a */
    public AbstractRunnableC2459rg[] f4140a;

    /* JADX INFO: renamed from: a */
    public final void m2330a(AbstractRunnableC2459rg abstractRunnableC2459rg) {
        abstractRunnableC2459rg.m4951d((C2502sg) this);
        AbstractRunnableC2459rg[] abstractRunnableC2459rgArr = this.f4140a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4139b;
        if (abstractRunnableC2459rgArr == null) {
            abstractRunnableC2459rgArr = new AbstractRunnableC2459rg[4];
            this.f4140a = abstractRunnableC2459rgArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC2459rgArr.length) {
            abstractRunnableC2459rgArr = (AbstractRunnableC2459rg[]) Arrays.copyOf(abstractRunnableC2459rgArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.f4140a = abstractRunnableC2459rgArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        abstractRunnableC2459rgArr[i] = abstractRunnableC2459rg;
        abstractRunnableC2459rg.f8667b = i;
        while (i > 0) {
            Object[] objArr = this.f4140a;
            int i2 = (i - 1) / 2;
            if (objArr[i2].compareTo(objArr[i]) <= 0) {
                return;
            }
            m2332c(i, i2);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractRunnableC2459rg m2331b(int i) {
        Object[] objArr = this.f4140a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4139b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            m2332c(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i <= 0 || objArr[i].compareTo(objArr[i2]) >= 0) {
                while (true) {
                    int i3 = i * 2;
                    int i4 = i3 + 1;
                    if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                    }
                    Object[] objArr2 = this.f4140a;
                    int i5 = i3 + 2;
                    if (i5 >= atomicIntegerFieldUpdater.get(this) || objArr2[i5].compareTo(objArr2[i4]) >= 0) {
                        i5 = i4;
                    }
                    if (objArr2[i].compareTo(objArr2[i5]) <= 0) {
                        break;
                    }
                    m2332c(i, i5);
                    i = i5;
                }
            } else {
                m2332c(i, i2);
                while (i2 > 0) {
                    Object[] objArr3 = this.f4140a;
                    int i6 = (i2 - 1) / 2;
                    if (objArr3[i6].compareTo(objArr3[i2]) <= 0) {
                        break;
                    }
                    m2332c(i2, i6);
                    i2 = i6;
                }
            }
        }
        AbstractRunnableC2459rg abstractRunnableC2459rg = objArr[atomicIntegerFieldUpdater.get(this)];
        abstractRunnableC2459rg.m4951d(null);
        abstractRunnableC2459rg.f8667b = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return abstractRunnableC2459rg;
    }

    /* JADX INFO: renamed from: c */
    public final void m2332c(int i, int i2) {
        AbstractRunnableC2459rg[] abstractRunnableC2459rgArr = this.f4140a;
        AbstractRunnableC2459rg abstractRunnableC2459rg = abstractRunnableC2459rgArr[i2];
        AbstractRunnableC2459rg abstractRunnableC2459rg2 = abstractRunnableC2459rgArr[i];
        abstractRunnableC2459rgArr[i] = abstractRunnableC2459rg;
        abstractRunnableC2459rgArr[i2] = abstractRunnableC2459rg2;
        abstractRunnableC2459rg.f8667b = i;
        abstractRunnableC2459rg2.f8667b = i2;
    }
}

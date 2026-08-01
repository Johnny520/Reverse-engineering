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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractRunnableC2106I m4409b(int i5) {
        Object[] objArr = this.f7962a;
        AbstractC1665j.m2982b(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7961b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i5 < atomicIntegerFieldUpdater.get(this)) {
            m4411d(i5, atomicIntegerFieldUpdater.get(this));
            int i6 = (i5 - 1) / 2;
            if (i5 > 0) {
                AbstractRunnableC2106I abstractRunnableC2106I = objArr[i5];
                AbstractC1665j.m2982b(abstractRunnableC2106I);
                Object obj = objArr[i6];
                AbstractC1665j.m2982b(obj);
                if (abstractRunnableC2106I.compareTo(obj) < 0) {
                    m4411d(i5, i6);
                    m4410c(i6);
                } else {
                    while (true) {
                        int i7 = i5 * 2;
                        int i8 = i7 + 1;
                        if (i8 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        Object[] objArr2 = this.f7962a;
                        AbstractC1665j.m2982b(objArr2);
                        int i9 = i7 + 2;
                        if (i9 < atomicIntegerFieldUpdater.get(this)) {
                            Comparable comparable = objArr2[i9];
                            AbstractC1665j.m2982b(comparable);
                            Object obj2 = objArr2[i8];
                            AbstractC1665j.m2982b(obj2);
                            if (comparable.compareTo(obj2) >= 0) {
                                i9 = i8;
                            }
                            Comparable comparable2 = objArr2[i5];
                            AbstractC1665j.m2982b(comparable2);
                            Comparable comparable3 = objArr2[i9];
                            AbstractC1665j.m2982b(comparable3);
                            if (comparable2.compareTo(comparable3) <= 0) {
                                break;
                            }
                            m4411d(i5, i9);
                            i5 = i9;
                        }
                    }
                }
            }
        }
        AbstractRunnableC2106I abstractRunnableC2106I2 = objArr[atomicIntegerFieldUpdater.get(this)];
        AbstractC1665j.m2982b(abstractRunnableC2106I2);
        abstractRunnableC2106I2.m3889d(null);
        abstractRunnableC2106I2.f7037e = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return abstractRunnableC2106I2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

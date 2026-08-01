package p000;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class a81 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f70b = AtomicIntegerFieldUpdater.newUpdater(a81.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a */
    public AbstractRunnableC0140dt[] f71a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m31a(AbstractRunnableC0140dt abstractRunnableC0140dt) {
        abstractRunnableC0140dt.m724d((C0184et) this);
        AbstractRunnableC0140dt[] abstractRunnableC0140dtArr = this.f71a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f70b;
        if (abstractRunnableC0140dtArr == null) {
            abstractRunnableC0140dtArr = new AbstractRunnableC0140dt[4];
            this.f71a = abstractRunnableC0140dtArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC0140dtArr.length) {
            abstractRunnableC0140dtArr = (AbstractRunnableC0140dt[]) Arrays.copyOf(abstractRunnableC0140dtArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.f71a = abstractRunnableC0140dtArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        abstractRunnableC0140dtArr[i] = abstractRunnableC0140dt;
        abstractRunnableC0140dt.f1172e = i;
        m33c(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractRunnableC0140dt m32b(int i) {
        Object[] objArr = this.f71a;
        objArr.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f70b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            m34d(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                AbstractRunnableC0140dt abstractRunnableC0140dt = objArr[i];
                abstractRunnableC0140dt.getClass();
                Object obj = objArr[i2];
                obj.getClass();
                if (abstractRunnableC0140dt.compareTo(obj) < 0) {
                    m34d(i, i2);
                    m33c(i2);
                } else {
                    while (true) {
                        int i3 = i * 2;
                        int i4 = i3 + 1;
                        if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        Object[] objArr2 = this.f71a;
                        objArr2.getClass();
                        int i5 = i3 + 2;
                        if (i5 < atomicIntegerFieldUpdater.get(this)) {
                            Comparable comparable = objArr2[i5];
                            comparable.getClass();
                            Object obj2 = objArr2[i4];
                            obj2.getClass();
                            if (comparable.compareTo(obj2) >= 0) {
                                i5 = i4;
                            }
                            Comparable comparable2 = objArr2[i];
                            comparable2.getClass();
                            Comparable comparable3 = objArr2[i5];
                            comparable3.getClass();
                            if (comparable2.compareTo(comparable3) <= 0) {
                                break;
                            }
                            m34d(i, i5);
                            i = i5;
                        }
                    }
                }
            }
        }
        AbstractRunnableC0140dt abstractRunnableC0140dt2 = objArr[atomicIntegerFieldUpdater.get(this)];
        abstractRunnableC0140dt2.getClass();
        abstractRunnableC0140dt2.m724d(null);
        abstractRunnableC0140dt2.f1172e = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return abstractRunnableC0140dt2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m33c(int i) {
        while (i > 0) {
            AbstractRunnableC0140dt[] abstractRunnableC0140dtArr = this.f71a;
            abstractRunnableC0140dtArr.getClass();
            int i2 = (i - 1) / 2;
            AbstractRunnableC0140dt abstractRunnableC0140dt = abstractRunnableC0140dtArr[i2];
            abstractRunnableC0140dt.getClass();
            AbstractRunnableC0140dt abstractRunnableC0140dt2 = abstractRunnableC0140dtArr[i];
            abstractRunnableC0140dt2.getClass();
            if (abstractRunnableC0140dt.compareTo(abstractRunnableC0140dt2) <= 0) {
                return;
            }
            m34d(i, i2);
            i = i2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m34d(int i, int i2) {
        AbstractRunnableC0140dt[] abstractRunnableC0140dtArr = this.f71a;
        abstractRunnableC0140dtArr.getClass();
        AbstractRunnableC0140dt abstractRunnableC0140dt = abstractRunnableC0140dtArr[i2];
        abstractRunnableC0140dt.getClass();
        AbstractRunnableC0140dt abstractRunnableC0140dt2 = abstractRunnableC0140dtArr[i];
        abstractRunnableC0140dt2.getClass();
        abstractRunnableC0140dtArr[i] = abstractRunnableC0140dt;
        abstractRunnableC0140dtArr[i2] = abstractRunnableC0140dt2;
        abstractRunnableC0140dt.f1172e = i;
        abstractRunnableC0140dt2.f1172e = i2;
    }
}

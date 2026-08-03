package vg;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p249qg.AbstractRunnableC3574j0;
import p249qg.C3577k0;

/* JADX INFO: renamed from: vg.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C4572u {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15057b = AtomicIntegerFieldUpdater.newUpdater(C4572u.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a */
    public AbstractRunnableC3574j0[] f15058a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m9017a(AbstractRunnableC3574j0 abstractRunnableC3574j0) {
        abstractRunnableC3574j0.m7529d((C3577k0) this);
        AbstractRunnableC3574j0[] abstractRunnableC3574j0Arr = this.f15058a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15057b;
        if (abstractRunnableC3574j0Arr == null) {
            abstractRunnableC3574j0Arr = new AbstractRunnableC3574j0[4];
            this.f15058a = abstractRunnableC3574j0Arr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC3574j0Arr.length) {
            abstractRunnableC3574j0Arr = (AbstractRunnableC3574j0[]) Arrays.copyOf(abstractRunnableC3574j0Arr, atomicIntegerFieldUpdater.get(this) * 2);
            this.f15058a = abstractRunnableC3574j0Arr;
        }
        int i9 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i9 + 1);
        abstractRunnableC3574j0Arr[i9] = abstractRunnableC3574j0;
        abstractRunnableC3574j0.f11581h = i9;
        m9019c(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractRunnableC3574j0 m9018b(int i9) {
        Object[] objArr = this.f15058a;
        objArr.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15057b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i9 < atomicIntegerFieldUpdater.get(this)) {
            m9020d(i9, atomicIntegerFieldUpdater.get(this));
            int i10 = (i9 - 1) / 2;
            if (i9 > 0) {
                AbstractRunnableC3574j0 abstractRunnableC3574j0 = objArr[i9];
                abstractRunnableC3574j0.getClass();
                Object obj = objArr[i10];
                obj.getClass();
                if (abstractRunnableC3574j0.compareTo(obj) < 0) {
                    m9020d(i9, i10);
                    m9019c(i10);
                } else {
                    while (true) {
                        int i11 = i9 * 2;
                        int i12 = i11 + 1;
                        if (i12 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        Object[] objArr2 = this.f15058a;
                        objArr2.getClass();
                        int i13 = i11 + 2;
                        if (i13 < atomicIntegerFieldUpdater.get(this)) {
                            Comparable comparable = objArr2[i13];
                            comparable.getClass();
                            Object obj2 = objArr2[i12];
                            obj2.getClass();
                            if (comparable.compareTo(obj2) >= 0) {
                                i13 = i12;
                            }
                            Comparable comparable2 = objArr2[i9];
                            comparable2.getClass();
                            Comparable comparable3 = objArr2[i13];
                            comparable3.getClass();
                            if (comparable2.compareTo(comparable3) <= 0) {
                                break;
                            }
                            m9020d(i9, i13);
                            i9 = i13;
                        }
                    }
                }
            }
        }
        AbstractRunnableC3574j0 abstractRunnableC3574j02 = objArr[atomicIntegerFieldUpdater.get(this)];
        abstractRunnableC3574j02.getClass();
        abstractRunnableC3574j02.m7529d(null);
        abstractRunnableC3574j02.f11581h = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return abstractRunnableC3574j02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m9019c(int i9) {
        while (i9 > 0) {
            AbstractRunnableC3574j0[] abstractRunnableC3574j0Arr = this.f15058a;
            abstractRunnableC3574j0Arr.getClass();
            int i10 = (i9 - 1) / 2;
            AbstractRunnableC3574j0 abstractRunnableC3574j0 = abstractRunnableC3574j0Arr[i10];
            abstractRunnableC3574j0.getClass();
            AbstractRunnableC3574j0 abstractRunnableC3574j02 = abstractRunnableC3574j0Arr[i9];
            abstractRunnableC3574j02.getClass();
            if (abstractRunnableC3574j0.compareTo(abstractRunnableC3574j02) <= 0) {
                return;
            }
            m9020d(i9, i10);
            i9 = i10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m9020d(int i9, int i10) {
        AbstractRunnableC3574j0[] abstractRunnableC3574j0Arr = this.f15058a;
        abstractRunnableC3574j0Arr.getClass();
        AbstractRunnableC3574j0 abstractRunnableC3574j0 = abstractRunnableC3574j0Arr[i10];
        abstractRunnableC3574j0.getClass();
        AbstractRunnableC3574j0 abstractRunnableC3574j02 = abstractRunnableC3574j0Arr[i9];
        abstractRunnableC3574j02.getClass();
        abstractRunnableC3574j0Arr[i9] = abstractRunnableC3574j0;
        abstractRunnableC3574j0Arr[i10] = abstractRunnableC3574j02;
        abstractRunnableC3574j0.f11581h = i9;
        abstractRunnableC3574j02.f11581h = i10;
    }
}

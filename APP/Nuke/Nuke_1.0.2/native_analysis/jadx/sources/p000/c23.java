package p000;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class c23 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1120b = AtomicIntegerFieldUpdater.newUpdater(c23.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a */
    public og0[] f1121a;

    /* JADX INFO: renamed from: a */
    public final void m615a(og0 og0Var) {
        og0Var.m3562d((pg0) this);
        og0[] og0VarArr = this.f1121a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1120b;
        if (og0VarArr == null) {
            og0VarArr = new og0[4];
            this.f1121a = og0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= og0VarArr.length) {
            og0VarArr = (og0[]) Arrays.copyOf(og0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.f1121a = og0VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        og0VarArr[i] = og0Var;
        og0Var.f7671i = i;
        m617c(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final og0 m616b(int i) {
        Object[] objArr = this.f1121a;
        objArr.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1120b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            m618d(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                og0 og0Var = objArr[i];
                og0Var.getClass();
                Object obj = objArr[i2];
                obj.getClass();
                if (og0Var.compareTo(obj) < 0) {
                    m618d(i, i2);
                    m617c(i2);
                } else {
                    while (true) {
                        int i3 = i * 2;
                        int i4 = i3 + 1;
                        if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        Object[] objArr2 = this.f1121a;
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
                            m618d(i, i5);
                            i = i5;
                        }
                    }
                }
            }
        }
        og0 og0Var2 = objArr[atomicIntegerFieldUpdater.get(this)];
        og0Var2.getClass();
        og0Var2.m3562d(null);
        og0Var2.f7671i = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return og0Var2;
    }

    /* JADX INFO: renamed from: c */
    public final void m617c(int i) {
        while (i > 0) {
            og0[] og0VarArr = this.f1121a;
            og0VarArr.getClass();
            int i2 = (i - 1) / 2;
            og0 og0Var = og0VarArr[i2];
            og0Var.getClass();
            og0 og0Var2 = og0VarArr[i];
            og0Var2.getClass();
            if (og0Var.compareTo(og0Var2) <= 0) {
                return;
            }
            m618d(i, i2);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m618d(int i, int i2) {
        og0[] og0VarArr = this.f1121a;
        og0VarArr.getClass();
        og0 og0Var = og0VarArr[i2];
        og0Var.getClass();
        og0 og0Var2 = og0VarArr[i];
        og0Var2.getClass();
        og0VarArr[i] = og0Var;
        og0VarArr[i2] = og0Var2;
        og0Var.f7671i = i;
        og0Var2.f7671i = i2;
    }
}

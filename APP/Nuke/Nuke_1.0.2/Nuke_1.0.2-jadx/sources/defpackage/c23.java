package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class c23 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(c23.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public og0[] a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(og0 og0Var) {
        og0Var.d((pg0) this);
        og0[] og0VarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (og0VarArr == null) {
            og0VarArr = new og0[4];
            this.a = og0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= og0VarArr.length) {
            og0VarArr = (og0[]) Arrays.copyOf(og0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.a = og0VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        og0VarArr[i] = og0Var;
        og0Var.i = i;
        c(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final og0 b(int i) {
        Object[] objArr = this.a;
        objArr.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            d(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                og0 og0Var = objArr[i];
                og0Var.getClass();
                Object obj = objArr[i2];
                obj.getClass();
                if (og0Var.compareTo(obj) < 0) {
                    d(i, i2);
                    c(i2);
                } else {
                    while (true) {
                        int i3 = i * 2;
                        int i4 = i3 + 1;
                        if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        Object[] objArr2 = this.a;
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
                            d(i, i5);
                            i = i5;
                        }
                    }
                }
            }
        }
        og0 og0Var2 = objArr[atomicIntegerFieldUpdater.get(this)];
        og0Var2.getClass();
        og0Var2.d(null);
        og0Var2.i = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return og0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(int i) {
        while (i > 0) {
            og0[] og0VarArr = this.a;
            og0VarArr.getClass();
            int i2 = (i - 1) / 2;
            og0 og0Var = og0VarArr[i2];
            og0Var.getClass();
            og0 og0Var2 = og0VarArr[i];
            og0Var2.getClass();
            if (og0Var.compareTo(og0Var2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(int i, int i2) {
        og0[] og0VarArr = this.a;
        og0VarArr.getClass();
        og0 og0Var = og0VarArr[i2];
        og0Var.getClass();
        og0 og0Var2 = og0VarArr[i];
        og0Var2.getClass();
        og0VarArr[i] = og0Var;
        og0VarArr[i2] = og0Var2;
        og0Var.i = i;
        og0Var2.i = i2;
    }
}

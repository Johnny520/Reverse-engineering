package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sj implements kh1 {
    public final Object h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sj(int i) {
        switch (i) {
            case 2:
                this.h = new ArrayList();
                break;
            case 3:
            default:
                char[] cArr = b93.a;
                this.h = new ArrayDeque(20);
                break;
            case 4:
                this.h = new Object();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long f(int i, int i2) {
        return ((long) i2) | (((long) i) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean a(int i, io0 io0Var, Object obj) {
        ArrayList arrayList = io0Var.a;
        if (arrayList == null) {
            b(i, io0Var, null);
            return true;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            Object obj2 = arrayList.get(i2);
            if (!(obj2 instanceof ao0)) {
                if (!(obj2 instanceof io0)) {
                    c80.u("Unexpected child source info ", obj2);
                    break;
                }
                if (a(i, (io0) obj2, obj)) {
                    b(0, io0Var, obj2);
                    return true;
                }
            } else if (obj2 == obj) {
                b(0, io0Var, obj2);
                return true;
            }
            i2++;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(int i, io0 io0Var, Object obj) {
        ((ArrayList) this.h).add(new fx(i, null, null));
    }

    public abstract void c(ho2 ho2Var);

    public abstract void d();

    public abstract void e();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void g(y12 y12Var) {
        ArrayDeque arrayDeque = (ArrayDeque) this.h;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(y12Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void h(int i, Object obj, io0 io0Var, Object obj2) {
        if (t11.l(obj, nx.a)) {
            b(i, io0Var, null);
        }
    }

    public abstract in0 i(ho2 ho2Var);

    public abstract void j(fq fqVar);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kh1
    public jh1 q(kj1 kj1Var) {
        return new ao(2, (ui0) this.h);
    }

    public sj(DexKitBridge dexKitBridge, int i, int i2) {
        dexKitBridge.getClass();
        this.h = dexKitBridge;
    }

    public sj(ui0 ui0Var) {
        this.h = ui0Var;
    }
}

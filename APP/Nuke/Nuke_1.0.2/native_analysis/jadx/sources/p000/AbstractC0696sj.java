package p000;

import java.util.ArrayDeque;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: sj */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0696sj implements kh1 {

    /* JADX INFO: renamed from: h */
    public final Object f10161h;

    public AbstractC0696sj(int i) {
        switch (i) {
            case 2:
                this.f10161h = new ArrayList();
                break;
            case 3:
            default:
                char[] cArr = b93.f747a;
                this.f10161h = new ArrayDeque(20);
                break;
            case 4:
                this.f10161h = new Object();
                break;
        }
    }

    /* JADX INFO: renamed from: f */
    public static long m4872f(int i, int i2) {
        return ((long) i2) | (((long) i) << 32);
    }

    /* JADX INFO: renamed from: a */
    public boolean m4873a(int i, io0 io0Var, Object obj) {
        ArrayList arrayList = io0Var.f4710a;
        if (arrayList == null) {
            m4874b(i, io0Var, null);
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
                    c80.m677u("Unexpected child source info ", obj2);
                    break;
                }
                if (m4873a(i, (io0) obj2, obj)) {
                    m4874b(0, io0Var, obj2);
                    return true;
                }
            } else if (obj2 == obj) {
                m4874b(0, io0Var, obj2);
                return true;
            }
            i2++;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m4874b(int i, io0 io0Var, Object obj) {
        ((ArrayList) this.f10161h).add(new C0219fx(i, null, null));
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo4188c(ho2 ho2Var);

    /* JADX INFO: renamed from: d */
    public abstract void mo4189d();

    /* JADX INFO: renamed from: e */
    public abstract void mo4190e();

    /* JADX INFO: renamed from: g */
    public void m4875g(y12 y12Var) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f10161h;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(y12Var);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m4876h(int i, Object obj, io0 io0Var, Object obj2) {
        if (t11.m5086l(obj, C0520nx.f7360a)) {
            m4874b(i, io0Var, null);
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract in0 mo4191i(ho2 ho2Var);

    /* JADX INFO: renamed from: j */
    public abstract void mo4192j(InterfaceC0212fq interfaceC0212fq);

    @Override // p000.kh1
    /* JADX INFO: renamed from: q */
    public jh1 mo1330q(kj1 kj1Var) {
        return new C0025ao(2, (ui0) this.f10161h);
    }

    public AbstractC0696sj(DexKitBridge dexKitBridge, int i, int i2) {
        dexKitBridge.getClass();
        this.f10161h = dexKitBridge;
    }

    public AbstractC0696sj(ui0 ui0Var) {
        this.f10161h = ui0Var;
    }
}

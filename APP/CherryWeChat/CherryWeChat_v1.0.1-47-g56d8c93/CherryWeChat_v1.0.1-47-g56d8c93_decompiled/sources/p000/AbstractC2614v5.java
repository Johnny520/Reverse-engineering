package p000;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Map;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: v5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2614v5 implements InterfaceC1233bs {

    /* JADX INFO: renamed from: a */
    public final Object f9067a;

    public /* synthetic */ AbstractC2614v5(Object obj) {
        this.f9067a = obj;
    }

    /* JADX INFO: renamed from: b */
    public static long m5127b(int i, int i2) {
        return ((long) i2) | (((long) i) << 32);
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC0043B mo5005a(AbstractC0043B abstractC0043B);

    /* JADX INFO: renamed from: c */
    public Map mo5006c() {
        return Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: d */
    public void m5128d(InterfaceC0938Vt interfaceC0938Vt) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f9067a;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(interfaceC0938Vt);
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract AbstractC0043B mo5007e(AbstractC2744y6 abstractC2744y6);

    /* JADX INFO: renamed from: f */
    public abstract void mo5008f(AbstractC0043B abstractC0043B);

    @Override // p000.InterfaceC1233bs
    /* JADX INFO: renamed from: p */
    public InterfaceC1189as mo88p(C2428qs c2428qs) {
        return new C1484h6(2, (C0668Pg) this.f9067a);
    }

    public AbstractC2614v5() {
        char[] cArr = AbstractC2622vD.f9104a;
        this.f9067a = new ArrayDeque(20);
    }

    public AbstractC2614v5(DexKitBridge dexKitBridge, int i, int i2) {
        this.f9067a = dexKitBridge;
    }
}

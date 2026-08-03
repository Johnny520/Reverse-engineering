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

    public /* synthetic */ AbstractC2614v5(Object r1) {
        this.f9067a = r1;
    }

    /* JADX INFO: renamed from: b */
    public static long m5127b(int r2, int r3) {
        long r0 = ((long) r2) << 32;
        return ((long) r3) | r0;
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC0043B mo5005a(AbstractC0043B r1);

    /* JADX INFO: renamed from: c */
    public Map mo5006c() {
        return Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: d */
    public void m5128d(InterfaceC0938Vt r4) {
        ArrayDeque r0 = (ArrayDeque) this.f9067a;
        if (r0.size() >= 20) goto L6;
        r0.offer(r4);
        return;
    }

    /* JADX INFO: renamed from: e */
    public abstract AbstractC0043B mo5007e(AbstractC2744y6 r1);

    /* JADX INFO: renamed from: f */
    public abstract void mo5008f(AbstractC0043B r1);

    @Override // p000.InterfaceC1233bs
    /* JADX INFO: renamed from: p */
    public InterfaceC1189as mo88p(C2428qs r3) {
        int r1 = 2;
        return new C1484h6(r1, (C0668Pg) this.f9067a);
    }

    public AbstractC2614v5() {
        char[] r0 = AbstractC2622vD.f9104a;
        this.f9067a = new ArrayDeque(20);
    }

    public AbstractC2614v5(DexKitBridge r1, int r2, int r3) {
        this.f9067a = r1;
    }
}

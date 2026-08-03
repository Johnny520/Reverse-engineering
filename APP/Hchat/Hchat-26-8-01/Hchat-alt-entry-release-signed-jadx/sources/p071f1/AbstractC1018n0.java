package p071f1;

import android.graphics.RenderEffect;
import gg.AbstractC1416l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import ke.InterfaceC2396e;
import okio.C3193a;
import org.luckypray.dexkit.DexKitBridge;
import p085fg.InterfaceC1231l;
import p117i0.C1851l;
import p159l0.AbstractC2421c;
import p159l0.C2420b;
import p302ud.C4322r;
import p302ud.InterfaceC4312h;
import p302ud.InterfaceC4318n;
import p338x0.C5572b;
import sg.InterfaceC3975g;
import sg.InterfaceC3984p;

/* JADX INFO: renamed from: f1.n0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1018n0 implements InterfaceC2396e {

    /* JADX INFO: renamed from: g */
    public Object f3204g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1018n0(int i9) {
        switch (i9) {
            case 3:
                this.f3204g = new ArrayDeque();
                break;
            case 4:
                this.f3204g = new ArrayList();
                break;
            default:
                this.f3204g = new Object();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static long m2613k(int i9, int i10) {
        return ((long) i10) | (((long) i9) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ke.InterfaceC2396e
    /* JADX INFO: renamed from: a */
    public boolean mo2614a(C4322r c4322r, InterfaceC4318n interfaceC4318n) {
        ((ArrayDeque) this.f3204g).push(interfaceC4318n);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ke.InterfaceC2396e
    /* JADX INFO: renamed from: b */
    public void mo2615b(C4322r c4322r, InterfaceC4318n interfaceC4318n) {
        ((ArrayDeque) this.f3204g).pop();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public boolean m2616c(int i9, AbstractC2421c abstractC2421c, Object obj) {
        ArrayList arrayList = abstractC2421c.f7924a;
        if (arrayList == null) {
            m2618e(i9, abstractC2421c, null);
            return true;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof C2420b) {
                if (obj2.equals(obj)) {
                    m2618e(0, abstractC2421c, obj2);
                    return true;
                }
            } else {
                if (!(obj2 instanceof AbstractC2421c)) {
                    C3193a.m6826p(obj2, "Unexpected child source info ");
                    return false;
                }
                if (m2616c(i9, (AbstractC2421c) obj2, obj)) {
                    m2618e(0, abstractC2421c, obj2);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ke.InterfaceC2396e
    /* JADX INFO: renamed from: d */
    public void mo2617d(C4322r c4322r, InterfaceC4312h interfaceC4312h) {
        mo2623l(c4322r, interfaceC4312h, (InterfaceC4318n) ((ArrayDeque) this.f3204g).peek());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void m2618e(int i9, AbstractC2421c abstractC2421c, Object obj) {
        ((ArrayList) this.f3204g).add(new C5572b(i9, null, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public RenderEffect m2619f() {
        RenderEffect renderEffect = (RenderEffect) this.f3204g;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectMo2611i = mo2611i();
        this.f3204g = renderEffectMo2611i;
        return renderEffectMo2611i;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo2620g(InterfaceC3984p interfaceC3984p);

    /* JADX INFO: renamed from: h */
    public abstract void mo2621h();

    /* JADX INFO: renamed from: i */
    public abstract RenderEffect mo2611i();

    /* JADX INFO: renamed from: j */
    public abstract void mo2622j();

    /* JADX INFO: renamed from: l */
    public abstract void mo2623l(C4322r c4322r, InterfaceC4312h interfaceC4312h, InterfaceC4318n interfaceC4318n);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public void m2624m(int i9, Object obj, AbstractC2421c abstractC2421c, Object obj2) {
        if (AbstractC1416l.m3825a(obj, C1851l.f6155a)) {
            m2618e(i9, abstractC2421c, null);
        }
    }

    /* JADX INFO: renamed from: n */
    public abstract InterfaceC1231l mo2625n(InterfaceC3984p interfaceC3984p);

    /* JADX INFO: renamed from: o */
    public abstract void mo2626o(InterfaceC3975g interfaceC3975g);

    public AbstractC1018n0(DexKitBridge dexKitBridge, int i9, int i10) {
        dexKitBridge.getClass();
        this.f3204g = dexKitBridge;
    }
}

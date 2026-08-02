package p000;

import android.os.Looper;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: fa */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0196fa extends w51 implements in0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f2878i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f2879j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f2880k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0196fa(int i, Object obj, Object obj2) {
        super(1);
        this.f2878i = i;
        this.f2880k = obj;
        this.f2879j = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        l62 l62Var;
        int i = 0;
        switch (this.f2878i) {
            case 0:
                return new tz0((u91) this.f2880k, new C0159ea(i, (C0233ga) this.f2879j));
            case 1:
                tz0 tz0Var = (tz0) this.f2880k;
                synchronized (tz0Var.f11007c) {
                    try {
                        tz0Var.f11009e = true;
                        zk1 zk1Var = tz0Var.f11008d;
                        Object[] objArr = zk1Var.f13934h;
                        int i2 = zk1Var.f13936j;
                        while (i < i2) {
                            xr1 xr1Var = (xr1) ((od3) objArr[i]).get();
                            if (xr1Var != null && (l62Var = xr1Var.f13145b) != null) {
                                l62Var.closeConnection();
                                xr1Var.f13145b = null;
                            }
                            i++;
                        }
                        tz0Var.f11008d.m6428g();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                o03 o03Var = ((C0233ga) this.f2879j).f3372i;
                o03Var.f7409b.set(null);
                o03Var.f7408a.mo2882g();
                return a83.f116a;
            case 2:
                d22 d22Var = (d22) this.f2880k;
                d22Var.setPositionProvider((g22) this.f2879j);
                d22Var.m934r();
                return new C0380ka(0);
            case 3:
                C0804vb c0804vb = (C0804vb) this.f2880k;
                ChoreographerFrameCallbackC0841wb choreographerFrameCallbackC0841wb = (ChoreographerFrameCallbackC0841wb) this.f2879j;
                synchronized (c0804vb.f11876l) {
                    c0804vb.f11878n.remove(choreographerFrameCallbackC0841wb);
                }
                return a83.f116a;
            case 4:
                ((Choreographer) ((C0880xb) this.f2880k).f12934i).removeFrameCallback((ChoreographerFrameCallbackC0841wb) this.f2879j);
                return a83.f116a;
            case 5:
                ((r61) this.f2880k).m4371d0(((uh1) obj).mo4491c((uh1) this.f2879j));
                return a83.f116a;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                rz1.m4643k((rz1) obj, (sz1) this.f2880k, ((C0170el) this.f2879j).f2483v);
                return a83.f116a;
            case 7:
                MotionEvent motionEvent = (MotionEvent) obj;
                u12 u12Var = (u12) this.f2879j;
                if (motionEvent.getActionMasked() == 0) {
                    ((kj1) this.f2880k).f5595j = ((Boolean) ((C0086cc) u12Var.m5452f()).mo5j(motionEvent)).booleanValue() ? t12.f10490i : t12.f10491j;
                } else {
                    ((C0086cc) u12Var.m5452f()).mo5j(motionEvent);
                }
                return a83.f116a;
            case 8:
                rz1.m4643k((rz1) obj, (sz1) this.f2880k, ((vq2) this.f2879j).f12132G);
                return a83.f116a;
            default:
                C0440lx c0440lx = (C0440lx) obj;
                mn0 mn0Var = (mn0) this.f2879j;
                bg3 bg3Var = (bg3) this.f2880k;
                if (!bg3Var.f850j) {
                    ia1 ia1Var = c0440lx.f6350c;
                    View view = c0440lx.f6348a;
                    ba1 lifecycle = ia1Var.getLifecycle();
                    bg3Var.f852l = mn0Var;
                    if (bg3Var.f851k == null) {
                        if (t11.m5086l(Looper.myLooper(), view.getHandler().getLooper())) {
                            bg3Var.f851k = lifecycle;
                            lifecycle.mo505a(bg3Var);
                        } else {
                            view.post(new RunnableC0724t7(6, bg3Var, lifecycle));
                        }
                    } else if (((la1) lifecycle).f6009h.compareTo(aa1.f121j) >= 0) {
                        bg3Var.f849i.m1729A(new C0402kw(-1723985096, true, new C0404ky(bg3Var, c0440lx, mn0Var)));
                    }
                }
                return a83.f116a;
        }
    }
}

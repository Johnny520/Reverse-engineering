package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fa extends w51 implements in0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fa(int i, Object obj, Object obj2) {
        super(1);
        this.i = i;
        this.k = obj;
        this.j = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        l62 l62Var;
        int i = 0;
        switch (this.i) {
            case 0:
                return new tz0((u91) this.k, new ea(i, (ga) this.j));
            case 1:
                tz0 tz0Var = (tz0) this.k;
                synchronized (tz0Var.c) {
                    try {
                        tz0Var.e = true;
                        zk1 zk1Var = tz0Var.d;
                        Object[] objArr = zk1Var.h;
                        int i2 = zk1Var.j;
                        while (i < i2) {
                            xr1 xr1Var = (xr1) ((od3) objArr[i]).get();
                            if (xr1Var != null && (l62Var = xr1Var.b) != null) {
                                l62Var.closeConnection();
                                xr1Var.b = null;
                            }
                            i++;
                        }
                        tz0Var.d.g();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                o03 o03Var = ((ga) this.j).i;
                o03Var.b.set(null);
                o03Var.a.g();
                return a83.a;
            case 2:
                d22 d22Var = (d22) this.k;
                d22Var.setPositionProvider((g22) this.j);
                d22Var.r();
                return new ka(0);
            case 3:
                vb vbVar = (vb) this.k;
                wb wbVar = (wb) this.j;
                synchronized (vbVar.l) {
                    vbVar.n.remove(wbVar);
                }
                return a83.a;
            case 4:
                ((Choreographer) ((xb) this.k).i).removeFrameCallback((wb) this.j);
                return a83.a;
            case 5:
                ((r61) this.k).d0(((uh1) obj).c((uh1) this.j));
                return a83.a;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                rz1.k((rz1) obj, (sz1) this.k, ((el) this.j).v);
                return a83.a;
            case 7:
                MotionEvent motionEvent = (MotionEvent) obj;
                u12 u12Var = (u12) this.j;
                if (motionEvent.getActionMasked() == 0) {
                    ((kj1) this.k).j = ((Boolean) ((cc) u12Var.f()).j(motionEvent)).booleanValue() ? t12.i : t12.j;
                } else {
                    ((cc) u12Var.f()).j(motionEvent);
                }
                return a83.a;
            case 8:
                rz1.k((rz1) obj, (sz1) this.k, ((vq2) this.j).G);
                return a83.a;
            default:
                lx lxVar = (lx) obj;
                mn0 mn0Var = (mn0) this.j;
                bg3 bg3Var = (bg3) this.k;
                if (!bg3Var.j) {
                    ia1 ia1Var = lxVar.c;
                    View view = lxVar.a;
                    ba1 lifecycle = ia1Var.getLifecycle();
                    bg3Var.l = mn0Var;
                    if (bg3Var.k == null) {
                        if (t11.l(Looper.myLooper(), view.getHandler().getLooper())) {
                            bg3Var.k = lifecycle;
                            lifecycle.a(bg3Var);
                        } else {
                            view.post(new t7(6, bg3Var, lifecycle));
                        }
                    } else if (((la1) lifecycle).h.compareTo(aa1.j) >= 0) {
                        bg3Var.i.A(new kw(-1723985096, true, new ky(bg3Var, lxVar, mn0Var)));
                    }
                }
                return a83.a;
        }
    }
}

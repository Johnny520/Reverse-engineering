package defpackage;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Set;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xq2 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ xq2(xq2 xq2Var, e2 e2Var) {
        this.h = 6;
        this.i = xq2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                rz1 rz1Var = (rz1) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    rz1.g(rz1Var, (sz1) arrayList.get(i2), 0, 0);
                }
                return a83.a;
            case 1:
                zq2 zq2Var = (zq2) obj2;
                ho2 ho2Var = zq2Var.m;
                ho2Var.getClass();
                if (!t11.l(zq2Var.m, ho2Var)) {
                    j22.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                sk1 sk1Var = zq2Var.l;
                Object obj3 = zq2Var.j;
                if (sk1Var != null) {
                    if (obj3 != null) {
                        j22.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    sk1Var.a(obj);
                } else if (obj3 == null) {
                    zq2Var.j = obj;
                } else {
                    sk1 sk1Var2 = fd2.a;
                    sk1 sk1Var3 = new sk1();
                    sk1Var3.a(obj3);
                    sk1Var3.a(obj);
                    zq2Var.l = sk1Var3;
                    zq2Var.j = null;
                }
                return a83.a;
            case 2:
                ts2 ts2Var = (ts2) obj2;
                synchronized (ts2Var.g) {
                    ss2 ss2Var = ts2Var.i;
                    ss2Var.getClass();
                    Object obj4 = ss2Var.b;
                    obj4.getClass();
                    int i3 = ss2Var.d;
                    gk1 gk1Var = ss2Var.c;
                    if (gk1Var == null) {
                        gk1Var = new gk1();
                        ss2Var.c = gk1Var;
                        ss2Var.f.m(obj4, gk1Var);
                    }
                    ss2Var.b(obj, i3, obj4, gk1Var);
                }
                return a83.a;
            case 3:
                gd gdVar = (gd) obj;
                ((tt0) obj2).g(gdVar.e.getValue(), rg3.n.b.j(gdVar.f));
                return a83.a;
            case 4:
                Drawable drawable = (Drawable) obj2;
                nc0 nc0Var = (nc0) obj;
                qp qpVarQ = nc0Var.E().q();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (nc0Var.d() >> 32)), (int) Float.intBitsToFloat((int) (nc0Var.d() & 4294967295L)));
                drawable.draw(g6.a(qpVarQ));
                return a83.a;
            case 5:
                ((in0) obj).j((oy2) obj2);
                return a83.a;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                xq2 xq2Var = (xq2) obj2;
                d43 d43Var = (d43) obj;
                if (d43Var instanceof n5) {
                    xq2Var.j(((n5) d43Var).v);
                    return Boolean.TRUE;
                }
                s.l("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 7:
                tz2 tz2Var = (tz2) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                jx1 jx1Var = tz2Var.a;
                float fG = jx1Var.g() + fFloatValue;
                jx1 jx1Var2 = tz2Var.b;
                if (fG > jx1Var2.g()) {
                    fFloatValue = jx1Var2.g() - jx1Var.g();
                } else if (fG < 0.0f) {
                    fFloatValue = -jx1Var.g();
                }
                jx1Var.h(jx1Var.g() + fFloatValue);
                return Float.valueOf(fFloatValue);
            case 8:
                return new f8(10, (y33) obj2);
            default:
                Class cls = (Class) obj;
                cls.getClass();
                return Boolean.valueOf(((Set) obj2).contains(cls));
        }
    }

    public /* synthetic */ xq2(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }
}

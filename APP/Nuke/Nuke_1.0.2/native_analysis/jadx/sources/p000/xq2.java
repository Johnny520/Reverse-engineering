package p000;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Set;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xq2 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13139h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f13140i;

    public /* synthetic */ xq2(xq2 xq2Var, C0151e2 c0151e2) {
        this.f13139h = 6;
        this.f13140i = xq2Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f13139h;
        Object obj2 = this.f13140i;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                rz1 rz1Var = (rz1) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    rz1.m4639g(rz1Var, (sz1) arrayList.get(i2), 0, 0);
                }
                return a83.f116a;
            case 1:
                zq2 zq2Var = (zq2) obj2;
                ho2 ho2Var = zq2Var.f14069m;
                ho2Var.getClass();
                if (!t11.m5086l(zq2Var.f14069m, ho2Var)) {
                    j22.m2430b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                sk1 sk1Var = zq2Var.f14068l;
                Object obj3 = zq2Var.f14066j;
                if (sk1Var != null) {
                    if (obj3 != null) {
                        j22.m2430b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    sk1Var.m4882a(obj);
                } else if (obj3 == null) {
                    zq2Var.f14066j = obj;
                } else {
                    sk1 sk1Var2 = fd2.f2911a;
                    sk1 sk1Var3 = new sk1();
                    sk1Var3.m4882a(obj3);
                    sk1Var3.m4882a(obj);
                    zq2Var.f14068l = sk1Var3;
                    zq2Var.f14066j = null;
                }
                return a83.f116a;
            case 2:
                ts2 ts2Var = (ts2) obj2;
                synchronized (ts2Var.f10953g) {
                    ss2 ss2Var = ts2Var.f10955i;
                    ss2Var.getClass();
                    Object obj4 = ss2Var.f10350b;
                    obj4.getClass();
                    int i3 = ss2Var.f10352d;
                    gk1 gk1Var = ss2Var.f10351c;
                    if (gk1Var == null) {
                        gk1Var = new gk1();
                        ss2Var.f10351c = gk1Var;
                        ss2Var.f10354f.m4511m(obj4, gk1Var);
                    }
                    ss2Var.m4997b(obj, i3, obj4, gk1Var);
                }
                return a83.f116a;
            case 3:
                C0236gd c0236gd = (C0236gd) obj;
                ((tt0) obj2).mo12g(c0236gd.f3404e.getValue(), rg3.f9572n.f7005b.mo5j(c0236gd.f3405f));
                return a83.f116a;
            case 4:
                Drawable drawable = (Drawable) obj2;
                nc0 nc0Var = (nc0) obj;
                InterfaceC0627qp interfaceC0627qpM430q = nc0Var.mo3274E().m430q();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (nc0Var.mo3280d() >> 32)), (int) Float.intBitsToFloat((int) (nc0Var.mo3280d() & 4294967295L)));
                drawable.draw(AbstractC0229g6.m1806a(interfaceC0627qpM430q));
                return a83.f116a;
            case 5:
                ((in0) obj).mo5j((oy2) obj2);
                return a83.f116a;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                xq2 xq2Var = (xq2) obj2;
                d43 d43Var = (d43) obj;
                if (d43Var instanceof C0486n5) {
                    xq2Var.mo5j(((C0486n5) d43Var).f7006v);
                    return Boolean.TRUE;
                }
                C0676s.m4653l("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 7:
                tz2 tz2Var = (tz2) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                jx1 jx1Var = tz2Var.f11013a;
                float fM2591g = jx1Var.m2591g() + fFloatValue;
                jx1 jx1Var2 = tz2Var.f11014b;
                if (fM2591g > jx1Var2.m2591g()) {
                    fFloatValue = jx1Var2.m2591g() - jx1Var.m2591g();
                } else if (fM2591g < 0.0f) {
                    fFloatValue = -jx1Var.m2591g();
                }
                jx1Var.m2592h(jx1Var.m2591g() + fFloatValue);
                return Float.valueOf(fFloatValue);
            case 8:
                return new C0194f8(10, (y33) obj2);
            default:
                Class cls = (Class) obj;
                cls.getClass();
                return Boolean.valueOf(((Set) obj2).contains(cls));
        }
    }

    public /* synthetic */ xq2(int i, Object obj) {
        this.f13139h = i;
        this.f13140i = obj;
    }
}

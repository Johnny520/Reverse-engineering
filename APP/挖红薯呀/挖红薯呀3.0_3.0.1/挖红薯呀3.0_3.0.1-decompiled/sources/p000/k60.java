package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class k60 implements y41 {

    /* JADX INFO: renamed from: d */
    public k50 f3025d = k50.f3016e;

    /* JADX INFO: renamed from: e */
    public float f3026e;

    /* JADX INFO: renamed from: f */
    public float f3027f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ q60 f3028g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k60(q60 q60Var) {
        this.f3028g = q60Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.zd0
    /* JADX INFO: renamed from: E */
    public final yd0 mo1278E(int i, int i2, Map map, InterfaceC0742sw interfaceC0742sw, InterfaceC0742sw interfaceC0742sw2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            w10.m4824b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new j60(i, i2, map, interfaceC0742sw, this, this.f3028g, interfaceC0742sw2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: b */
    public final float mo48b() {
        return this.f3026e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l30
    public final k50 getLayoutDirection() {
        return this.f3025d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: h */
    public final float mo49h() {
        return this.f3027f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l30
    /* JADX INFO: renamed from: m */
    public final boolean mo53m() {
        x50 x50Var = this.f3028g.f5056d.f396J.f1595d;
        return x50Var == x50.f7267g || x50Var == x50.f7265e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.y41
    /* JADX INFO: renamed from: w */
    public final List mo1280w(InterfaceC0904ww interfaceC0904ww, Object obj) {
        q60 q60Var = this.f3028g;
        q60Var.m3200h();
        b60 b60Var = q60Var.f5056d;
        x50 x50Var = b60Var.f396J.f1595d;
        x50 x50Var2 = x50.f7266f;
        x50 x50Var3 = x50.f7264d;
        if (x50Var != x50Var3 && x50Var != x50Var2 && x50Var != x50.f7265e && x50Var != x50.f7267g) {
            w10.m4824b("subcompose can only be used inside the measure or layout blocks");
        }
        jh0 jh0Var = q60Var.f5062j;
        Object objM1701g = jh0Var.m1701g(obj);
        if (objM1701g == null) {
            objM1701g = (b60) q60Var.f5065m.m1705k(obj);
            if (objM1701g != null) {
                if (q60Var.f5070r <= 0) {
                    w10.m4824b("Check failed.");
                }
                q60Var.f5070r--;
            } else {
                objM1701g = q60Var.m3206n(obj);
                if (objM1701g == null) {
                    int i = q60Var.f5059g;
                    b60 b60Var2 = new b60(2);
                    b60Var.f421t = true;
                    b60Var.m266B(i, b60Var2);
                    b60Var.f421t = false;
                    objM1701g = b60Var2;
                }
            }
            jh0Var.m1707m(obj, objM1701g);
        }
        b60 b60Var3 = (b60) objM1701g;
        if (AbstractC0960ye.m5242L(q60Var.f5059g, b60Var.m308o()) != b60Var3) {
            int iM4079i = ((ph0) b60Var.m308o()).f4858d.m4079i(b60Var3);
            if (iM4079i < q60Var.f5059g) {
                w10.m4823a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i2 = q60Var.f5059g;
            if (i2 != iM4079i) {
                q60Var.m3202j(iM4079i, i2);
            }
        }
        q60Var.f5059g++;
        q60Var.m3205m(b60Var3, obj, false, interfaceC0904ww);
        return (x50Var == x50Var3 || x50Var == x50Var2) ? b60Var3.m306m() : b60Var3.m305l();
    }
}

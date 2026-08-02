package p000;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wx1 extends i93 {

    /* JADX INFO: renamed from: b */
    public AbstractC0024an f12705b;

    /* JADX INFO: renamed from: c */
    public float f12706c = 1.0f;

    /* JADX INFO: renamed from: d */
    public List f12707d;

    /* JADX INFO: renamed from: e */
    public float f12708e;

    /* JADX INFO: renamed from: f */
    public float f12709f;

    /* JADX INFO: renamed from: g */
    public AbstractC0024an f12710g;

    /* JADX INFO: renamed from: h */
    public int f12711h;

    /* JADX INFO: renamed from: i */
    public int f12712i;

    /* JADX INFO: renamed from: j */
    public float f12713j;

    /* JADX INFO: renamed from: k */
    public float f12714k;

    /* JADX INFO: renamed from: l */
    public float f12715l;

    /* JADX INFO: renamed from: m */
    public float f12716m;

    /* JADX INFO: renamed from: n */
    public boolean f12717n;

    /* JADX INFO: renamed from: o */
    public boolean f12718o;

    /* JADX INFO: renamed from: p */
    public boolean f12719p;

    /* JADX INFO: renamed from: q */
    public xv2 f12720q;

    /* JADX INFO: renamed from: r */
    public final C0915y9 f12721r;

    /* JADX INFO: renamed from: s */
    public C0915y9 f12722s;

    /* JADX INFO: renamed from: t */
    public C0915y9 f12723t;

    /* JADX INFO: renamed from: u */
    public final j71 f12724u;

    public wx1() {
        int i = s93.f9998a;
        this.f12707d = be0.f819h;
        this.f12708e = 1.0f;
        this.f12711h = 0;
        this.f12712i = 0;
        this.f12713j = 4.0f;
        this.f12715l = 1.0f;
        this.f12717n = true;
        this.f12718o = true;
        C0915y9 c0915y9M117a = AbstractC0011aa.m117a();
        this.f12721r = c0915y9M117a;
        this.f12722s = c0915y9M117a;
        this.f12724u = AbstractC0570p7.m3746B(i91.f4498i, C0367jy.f5268t);
    }

    @Override // p000.i93
    /* JADX INFO: renamed from: a */
    public final void mo260a(nc0 nc0Var) {
        nc0 nc0Var2;
        xv2 xv2Var;
        if (this.f12717n) {
            pp0.m3896H(this.f12707d, this.f12721r);
            m6019e();
        } else if (this.f12719p) {
            m6019e();
        }
        this.f12717n = false;
        this.f12719p = false;
        AbstractC0024an abstractC0024an = this.f12705b;
        if (abstractC0024an != null) {
            nc0Var2 = nc0Var;
            nc0.m3272v(nc0Var2, this.f12722s, abstractC0024an, this.f12706c, null, 56);
        } else {
            nc0Var2 = nc0Var;
        }
        AbstractC0024an abstractC0024an2 = this.f12710g;
        if (abstractC0024an2 != null) {
            xv2 xv2Var2 = this.f12720q;
            if (this.f12718o || xv2Var2 == null) {
                xv2 xv2Var3 = new xv2(this.f12709f, this.f12713j, this.f12711h, this.f12712i, 16);
                this.f12720q = xv2Var3;
                this.f12718o = false;
                xv2Var = xv2Var3;
            } else {
                xv2Var = xv2Var2;
            }
            nc0.m3272v(nc0Var2, this.f12722s, abstractC0024an2, this.f12708e, xv2Var, 48);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6019e() {
        float f = this.f12714k;
        C0915y9 c0915y9 = this.f12721r;
        if (f == 0.0f && this.f12715l == 1.0f) {
            this.f12722s = c0915y9;
            return;
        }
        if (t11.m5086l(this.f12722s, c0915y9)) {
            this.f12722s = AbstractC0011aa.m117a();
        } else {
            Path.FillType fillType = this.f12722s.f13365a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.f12722s.f13365a.rewind();
            Path path = this.f12722s.f13365a;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        j71 j71Var = this.f12724u;
        ((C0954z9) j71Var.getValue()).f13787a.setPath(c0915y9 != null ? c0915y9.f13365a : null, false);
        float length = ((C0954z9) j71Var.getValue()).f13787a.getLength();
        float f2 = this.f12714k;
        float f3 = this.f12716m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.f12715l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((C0954z9) j71Var.getValue()).m6401a(f4, f5, this.f12722s);
            return;
        }
        C0915y9 c0915y9M117a = this.f12723t;
        if (c0915y9M117a == null) {
            c0915y9M117a = AbstractC0011aa.m117a();
            this.f12723t = c0915y9M117a;
        }
        c0915y9M117a.m6235g();
        ((C0954z9) j71Var.getValue()).m6401a(f4, length, c0915y9M117a);
        C0915y9.m6229a(this.f12722s, c0915y9M117a);
        c0915y9M117a.m6235g();
        ((C0954z9) j71Var.getValue()).m6401a(0.0f, f5, c0915y9M117a);
        C0915y9.m6229a(this.f12722s, c0915y9M117a);
    }

    public final String toString() {
        return this.f12721r.toString();
    }
}

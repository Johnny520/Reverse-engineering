package defpackage;

import android.R;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wj implements Cloneable {
    public int h;
    public int k;
    public int l;
    public boolean q;
    public boolean u;
    public boolean v;
    public boolean x;
    public b90 i = b90.d;
    public i32 j = i32.j;
    public boolean m = true;
    public int n = -1;
    public int o = -1;
    public a51 p = he0.b;
    public ov1 r = new ov1();
    public ro s = new ro(0);
    public Class t = Object.class;
    public boolean w = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean k(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wj a(wj wjVar) {
        if (this.v) {
            return clone().a(wjVar);
        }
        int i = wjVar.h;
        if (k(wjVar.h, 1048576)) {
            this.x = wjVar.x;
        }
        if (k(wjVar.h, 4)) {
            this.i = wjVar.i;
        }
        if (k(wjVar.h, 8)) {
            this.j = wjVar.j;
        }
        if (k(wjVar.h, 16)) {
            this.k = 0;
            this.h &= -33;
        }
        if (k(wjVar.h, 32)) {
            this.k = wjVar.k;
            this.h &= -17;
        }
        if (k(wjVar.h, 64)) {
            this.l = 0;
            this.h &= -129;
        }
        if (k(wjVar.h, 128)) {
            this.l = wjVar.l;
            this.h &= -65;
        }
        if (k(wjVar.h, 256)) {
            this.m = wjVar.m;
        }
        if (k(wjVar.h, AIChatConfig.DefaultMaxTokens)) {
            this.o = wjVar.o;
            this.n = wjVar.n;
        }
        if (k(wjVar.h, 1024)) {
            this.p = wjVar.p;
        }
        if (k(wjVar.h, 4096)) {
            this.t = wjVar.t;
        }
        if (k(wjVar.h, 8192)) {
            this.h &= -16385;
        }
        if (k(wjVar.h, 16384)) {
            this.h &= -8193;
        }
        if (k(wjVar.h, 131072)) {
            this.q = wjVar.q;
        }
        if (k(wjVar.h, 2048)) {
            this.s.putAll(wjVar.s);
            this.w = wjVar.w;
        }
        this.h |= wjVar.h;
        this.r.b.g(wjVar.r.b);
        p();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final wj d() {
        return t(va0.c, new qs());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (obj instanceof wj) {
            return j((wj) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @Override // 
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public wj clone() {
        try {
            wj wjVar = (wj) super.clone();
            ov1 ov1Var = new ov1();
            wjVar.r = ov1Var;
            ov1Var.b.g(this.r.b);
            ro roVar = new ro(0);
            wjVar.s = roVar;
            roVar.putAll(this.s);
            wjVar.u = false;
            wjVar.v = false;
            return wjVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final wj g(Class cls) {
        if (this.v) {
            return clone().g(cls);
        }
        this.t = cls;
        this.h |= 4096;
        p();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final wj h(b90 b90Var) {
        if (this.v) {
            return clone().h(b90Var);
        }
        this.i = b90Var;
        this.h |= 4;
        p();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        char[] cArr = b93.a;
        return b93.h(b93.h(b93.h(b93.h(b93.h(b93.h(b93.h(b93.g(0, b93.g(0, b93.g(1, b93.g(this.q ? 1 : 0, b93.g(this.o, b93.g(this.n, b93.g(this.m ? 1 : 0, b93.h(b93.g(0, b93.h(b93.g(this.l, b93.h(b93.g(this.k, b93.g(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.i), this.j), this.r), this.s), this.t), this.p), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final wj i() {
        if (this.v) {
            return clone().i();
        }
        this.k = R.color.transparent;
        this.h = (this.h | 32) & (-17);
        p();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean j(wj wjVar) {
        wjVar.getClass();
        if (Float.compare(1.0f, 1.0f) != 0 || this.k != wjVar.k) {
            return false;
        }
        char[] cArr = b93.a;
        return this.l == wjVar.l && this.m == wjVar.m && this.n == wjVar.n && this.o == wjVar.o && this.q == wjVar.q && this.i.equals(wjVar.i) && this.j == wjVar.j && this.r.equals(wjVar.r) && this.s.equals(wjVar.s) && this.t.equals(wjVar.t) && this.p.equals(wjVar.p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final wj l(va0 va0Var, bl blVar) {
        if (this.v) {
            return clone().l(va0Var, blVar);
        }
        q(va0.g, va0Var);
        return u(blVar, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final wj m(int i, int i2) {
        if (this.v) {
            return clone().m(i, i2);
        }
        this.o = i;
        this.n = i2;
        this.h |= AIChatConfig.DefaultMaxTokens;
        p();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final wj n() {
        if (this.v) {
            return clone().n();
        }
        this.l = R.color.transparent;
        this.h = (this.h | 128) & (-65);
        p();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final wj o() {
        if (this.v) {
            return clone().o();
        }
        this.j = i32.k;
        this.h |= 8;
        p();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p() {
        if (this.u) {
            s.l("You cannot modify locked T, consider clone()");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final wj q(mv1 mv1Var, va0 va0Var) {
        if (this.v) {
            return clone().q(mv1Var, va0Var);
        }
        fg1.p(mv1Var);
        this.r.b.put(mv1Var, va0Var);
        p();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final wj r(is1 is1Var) {
        if (this.v) {
            return clone().r(is1Var);
        }
        this.p = is1Var;
        this.h |= 1024;
        p();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final wj s() {
        if (this.v) {
            return clone().s();
        }
        this.m = false;
        this.h |= 256;
        p();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final wj t(va0 va0Var, bl blVar) {
        if (this.v) {
            return clone().t(va0Var, blVar);
        }
        q(va0.g, va0Var);
        return u(blVar, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final wj u(n33 n33Var, boolean z) {
        if (this.v) {
            return clone().u(n33Var, z);
        }
        uc0 uc0Var = new uc0(n33Var, z);
        v(Bitmap.class, n33Var, z);
        v(Drawable.class, uc0Var, z);
        v(BitmapDrawable.class, uc0Var, z);
        v(yo0.class, new ap0(n33Var), z);
        p();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final wj v(Class cls, n33 n33Var, boolean z) {
        if (this.v) {
            return clone().v(cls, n33Var, z);
        }
        fg1.p(n33Var);
        this.s.put(cls, n33Var);
        int i = this.h;
        this.h = 67584 | i;
        this.w = false;
        if (z) {
            this.h = i | 198656;
            this.q = true;
        }
        p();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final wj w() {
        if (this.v) {
            return clone().w();
        }
        this.x = true;
        this.h |= 1048576;
        p();
        return this;
    }
}

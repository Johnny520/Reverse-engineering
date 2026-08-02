package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s82 extends wj {
    public final Class A;
    public final vp0 B;
    public to0 C;
    public Object D;
    public ArrayList E;
    public s82 F;
    public s82 G;
    public final boolean H = true;
    public boolean I;
    public boolean J;
    public final Context y;
    public final x82 z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s82(a aVar, x82 x82Var, Class cls, Context context) {
        z82 z82Var;
        this.z = x82Var;
        this.A = cls;
        this.y = context;
        hg hgVar = x82Var.h.j.f;
        to0 to0Var = (to0) hgVar.get(cls);
        if (to0Var == null) {
            for (Map.Entry entry : (kb1) hgVar.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    to0Var = (to0) entry.getValue();
                }
            }
        }
        this.C = to0Var == null ? vp0.k : to0Var;
        this.B = aVar.j;
        Iterator it = x82Var.n.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                c80.g();
                throw null;
            }
            x();
        }
        synchronized (x82Var) {
            z82Var = x82Var.o;
        }
        a(z82Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: f()Lwj; */
    @Override // defpackage.wj
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final s82 clone() {
        s82 s82Var = (s82) super.clone();
        s82Var.C = s82Var.C.clone();
        if (s82Var.E != null) {
            s82Var.E = new ArrayList(s82Var.E);
        }
        s82 s82Var2 = s82Var.F;
        if (s82Var2 != null) {
            s82Var.F = s82Var2.clone();
        }
        s82 s82Var3 = s82Var.G;
        if (s82Var3 != null) {
            s82Var.G = s82Var3.clone();
        }
        return s82Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B(by2 by2Var, wj wjVar) {
        fg1.p(by2Var);
        if (!this.I) {
            s.j("You must call #load() before calling #into()");
            return;
        }
        l82 l82VarZ = z(new Object(), by2Var, null, this.C, wjVar.j, wjVar.o, wjVar.n, wjVar);
        l82 l82VarU = by2Var.u();
        if (l82VarZ.b(l82VarU) && (wjVar.m || !l82VarU.j())) {
            fg1.q("Argument must not be null", l82VarU);
            if (l82VarU.isRunning()) {
                return;
            }
            l82VarU.i();
            return;
        }
        this.z.a(by2Var);
        by2Var.o(l82VarZ);
        x82 x82Var = this.z;
        synchronized (x82Var) {
            ((Set) x82Var.m.i).add(by2Var);
            er2 er2Var = x82Var.k;
            ((Set) er2Var.j).add(l82VarZ);
            if (er2Var.i) {
                l82VarZ.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((HashSet) er2Var.k).add(l82VarZ);
            } else {
                l82VarZ.i();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:? */
    public final void C(ImageView imageView) {
        wj wjVarL;
        by2 xkVar;
        b93.a();
        fg1.p(imageView);
        if (!wj.k(this.h, 2048) && imageView.getScaleType() != null) {
            switch (p82.a[imageView.getScaleType().ordinal()]) {
                case 1:
                    wjVarL = clone().l(va0.d, new aq());
                    break;
                case 2:
                    wjVarL = clone().l(va0.c, new bq());
                    wjVarL.w = true;
                    break;
                case 3:
                case 4:
                case 5:
                    wjVarL = clone().l(va0.b, new gj0());
                    wjVarL.w = true;
                    break;
                case AIChatConfig.DefaultContextRounds /* 6 */:
                    wjVarL = clone().l(va0.c, new bq());
                    wjVarL.w = true;
                    break;
                default:
                    wjVarL = this;
                    break;
            }
        } else {
            wjVarL = this;
        }
        this.B.c.getClass();
        Class cls = this.A;
        if (Bitmap.class.equals(cls)) {
            xkVar = new xk(imageView, 0);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            xkVar = new xk(imageView, 1);
        }
        B(xkVar, wjVarL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final s82 D(Object obj) {
        if (this.v) {
            return clone().D(obj);
        }
        this.D = obj;
        this.I = true;
        p();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wj
    public final boolean equals(Object obj) {
        if (!(obj instanceof s82)) {
            return false;
        }
        s82 s82Var = (s82) obj;
        return super.equals(s82Var) && Objects.equals(this.A, s82Var.A) && this.C.equals(s82Var.C) && Objects.equals(this.D, s82Var.D) && Objects.equals(this.E, s82Var.E) && Objects.equals(this.F, s82Var.F) && Objects.equals(this.G, s82Var.G) && this.H == s82Var.H && this.I == s82Var.I;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wj
    public final int hashCode() {
        return b93.g(this.I ? 1 : 0, b93.g(this.H ? 1 : 0, b93.h(b93.h(b93.h(b93.h(b93.h(b93.h(b93.h(super.hashCode(), this.A), this.C), this.D), this.E), this.F), this.G), null)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final s82 x() {
        if (this.v) {
            return clone().x();
        }
        p();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: a(Lwj;)Lwj; */
    @Override // defpackage.wj
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final s82 a(wj wjVar) {
        fg1.p(wjVar);
        return (s82) super.a(wjVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: dg0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final l82 z(Object obj, by2 by2Var, t82 t82Var, to0 to0Var, i32 i32Var, int i, int i2, wj wjVar) {
        t82 t82Var2;
        t82 dg0Var;
        wj wjVar2;
        l82 yq2Var;
        i32 i32Var2;
        if (this.G != null) {
            dg0Var = new dg0(obj, t82Var);
            t82Var2 = dg0Var;
        } else {
            t82Var2 = null;
            dg0Var = t82Var;
        }
        s82 s82Var = this.F;
        if (s82Var == null) {
            Context context = this.y;
            vp0 vp0Var = this.B;
            wjVar2 = wjVar;
            yq2Var = new yq2(context, vp0Var, obj, this.D, this.A, wjVar2, i, i2, i32Var, by2Var, this.E, dg0Var, vp0Var.g, to0Var.h);
        } else {
            if (this.J) {
                s.l("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
                return null;
            }
            to0 to0Var2 = s82Var.H ? to0Var : s82Var.C;
            if (wj.k(s82Var.h, 8)) {
                i32Var2 = this.F.j;
            } else {
                int iOrdinal = i32Var.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    i32Var2 = i32.h;
                } else if (iOrdinal == 2) {
                    i32Var2 = i32.i;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.j);
                    }
                    i32Var2 = i32.j;
                }
            }
            i32 i32Var3 = i32Var2;
            s82 s82Var2 = this.F;
            int i3 = s82Var2.o;
            int i4 = s82Var2.n;
            if (b93.i(i, i2)) {
                s82 s82Var3 = this.F;
                if (!b93.i(s82Var3.o, s82Var3.n)) {
                    i3 = wjVar.o;
                    i4 = wjVar.n;
                }
            }
            int i5 = i4;
            m23 m23Var = new m23(obj, dg0Var);
            Context context2 = this.y;
            vp0 vp0Var2 = this.B;
            yq2 yq2Var2 = new yq2(context2, vp0Var2, obj, this.D, this.A, wjVar, i, i2, i32Var, by2Var, this.E, m23Var, vp0Var2.g, to0Var.h);
            this.J = true;
            s82 s82Var4 = this.F;
            l82 l82VarZ = s82Var4.z(obj, by2Var, m23Var, to0Var2, i32Var3, i3, i5, s82Var4);
            this.J = false;
            m23Var.c = yq2Var2;
            m23Var.d = l82VarZ;
            wjVar2 = wjVar;
            yq2Var = m23Var;
        }
        if (t82Var2 == null) {
            return yq2Var;
        }
        s82 s82Var5 = this.G;
        int i6 = s82Var5.o;
        int i7 = s82Var5.n;
        if (b93.i(i, i2)) {
            s82 s82Var6 = this.G;
            if (!b93.i(s82Var6.o, s82Var6.n)) {
                i6 = wjVar2.o;
                i7 = wjVar2.n;
            }
        }
        s82 s82Var7 = this.G;
        dg0 dg0Var2 = t82Var2;
        l82 l82VarZ2 = s82Var7.z(obj, by2Var, dg0Var2, s82Var7.C, s82Var7.j, i6, i7, s82Var7);
        dg0Var2.c = yq2Var;
        dg0Var2.d = l82VarZ2;
        return dg0Var2;
    }
}

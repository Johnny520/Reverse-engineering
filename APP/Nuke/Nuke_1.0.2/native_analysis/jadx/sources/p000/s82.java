package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C0099a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s82 extends AbstractC0849wj {

    /* JADX INFO: renamed from: A */
    public final Class f9977A;

    /* JADX INFO: renamed from: B */
    public final vp0 f9978B;

    /* JADX INFO: renamed from: C */
    public to0 f9979C;

    /* JADX INFO: renamed from: D */
    public Object f9980D;

    /* JADX INFO: renamed from: E */
    public ArrayList f9981E;

    /* JADX INFO: renamed from: F */
    public s82 f9982F;

    /* JADX INFO: renamed from: G */
    public s82 f9983G;

    /* JADX INFO: renamed from: H */
    public final boolean f9984H = true;

    /* JADX INFO: renamed from: I */
    public boolean f9985I;

    /* JADX INFO: renamed from: J */
    public boolean f9986J;

    /* JADX INFO: renamed from: y */
    public final Context f9987y;

    /* JADX INFO: renamed from: z */
    public final x82 f9988z;

    static {
    }

    public s82(ComponentCallbacks2C0099a componentCallbacks2C0099a, x82 x82Var, Class cls, Context context) {
        z82 z82Var;
        this.f9988z = x82Var;
        this.f9977A = cls;
        this.f9987y = context;
        C0276hg c0276hg = x82Var.f12892h.f1645j.f12104f;
        to0 to0Var = (to0) c0276hg.get(cls);
        if (to0Var == null) {
            for (Map.Entry entry : (kb1) c0276hg.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    to0Var = (to0) entry.getValue();
                }
            }
        }
        this.f9979C = to0Var == null ? vp0.f12098k : to0Var;
        this.f9978B = componentCallbacks2C0099a.f1645j;
        Iterator it = x82Var.f12898n.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                c80.m664g();
                throw null;
            }
            m4768x();
        }
        synchronized (x82Var) {
            z82Var = x82Var.f12899o;
        }
        mo4766a(z82Var);
    }

    @Override // p000.AbstractC0849wj
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final s82 clone() {
        s82 s82Var = (s82) super.clone();
        s82Var.f9979C = s82Var.f9979C.clone();
        if (s82Var.f9981E != null) {
            s82Var.f9981E = new ArrayList(s82Var.f9981E);
        }
        s82 s82Var2 = s82Var.f9982F;
        if (s82Var2 != null) {
            s82Var.f9982F = s82Var2.clone();
        }
        s82 s82Var3 = s82Var.f9983G;
        if (s82Var3 != null) {
            s82Var.f9983G = s82Var3.clone();
        }
        return s82Var;
    }

    /* JADX INFO: renamed from: B */
    public final void m4763B(by2 by2Var, AbstractC0849wj abstractC0849wj) {
        fg1.m1641p(by2Var);
        if (!this.f9985I) {
            C0676s.m4651j("You must call #load() before calling #into()");
            return;
        }
        l82 l82VarM4770z = m4770z(new Object(), by2Var, null, this.f9979C, abstractC0849wj.f12524j, abstractC0849wj.f12529o, abstractC0849wj.f12528n, abstractC0849wj);
        l82 l82VarMo604u = by2Var.mo604u();
        if (l82VarM4770z.mo1019b(l82VarMo604u) && (abstractC0849wj.f12527m || !l82VarMo604u.mo1027j())) {
            fg1.m1642q("Argument must not be null", l82VarMo604u);
            if (l82VarMo604u.isRunning()) {
                return;
            }
            l82VarMo604u.mo1026i();
            return;
        }
        this.f9988z.m6048a(by2Var);
        by2Var.mo602o(l82VarM4770z);
        x82 x82Var = this.f9988z;
        synchronized (x82Var) {
            ((Set) x82Var.f12897m.f4019i).add(by2Var);
            er2 er2Var = x82Var.f12895k;
            ((Set) er2Var.f2577j).add(l82VarM4770z);
            if (er2Var.f2576i) {
                l82VarM4770z.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((HashSet) er2Var.f2578k).add(l82VarM4770z);
            } else {
                l82VarM4770z.mo1026i();
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m4764C(ImageView imageView) {
        AbstractC0849wj abstractC0849wjM5910l;
        by2 c0889xk;
        b93.m494a();
        fg1.m1641p(imageView);
        if (!AbstractC0849wj.m5904k(this.f12522h, 2048) && imageView.getScaleType() != null) {
            switch (p82.f8034a[imageView.getScaleType().ordinal()]) {
                case 1:
                    abstractC0849wjM5910l = clone().m5910l(va0.f11858d, new C0027aq());
                    break;
                case 2:
                    abstractC0849wjM5910l = clone().m5910l(va0.f11857c, new C0064bq());
                    abstractC0849wjM5910l.f12537w = true;
                    break;
                case 3:
                case 4:
                case 5:
                    abstractC0849wjM5910l = clone().m5910l(va0.f11856b, new gj0());
                    abstractC0849wjM5910l.f12537w = true;
                    break;
                case AIChatConfig.DefaultContextRounds /* 6 */:
                    abstractC0849wjM5910l = clone().m5910l(va0.f11857c, new C0064bq());
                    abstractC0849wjM5910l.f12537w = true;
                    break;
                default:
                    abstractC0849wjM5910l = this;
                    break;
            }
        } else {
            abstractC0849wjM5910l = this;
        }
        this.f9978B.f12101c.getClass();
        Class cls = this.f9977A;
        if (Bitmap.class.equals(cls)) {
            c0889xk = new C0889xk(imageView, 0);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            c0889xk = new C0889xk(imageView, 1);
        }
        m4763B(c0889xk, abstractC0849wjM5910l);
    }

    /* JADX INFO: renamed from: D */
    public final s82 m4765D(Object obj) {
        if (this.f12536v) {
            return clone().m4765D(obj);
        }
        this.f9980D = obj;
        this.f9985I = true;
        m5914p();
        return this;
    }

    @Override // p000.AbstractC0849wj
    public final boolean equals(Object obj) {
        if (!(obj instanceof s82)) {
            return false;
        }
        s82 s82Var = (s82) obj;
        return super.equals(s82Var) && Objects.equals(this.f9977A, s82Var.f9977A) && this.f9979C.equals(s82Var.f9979C) && Objects.equals(this.f9980D, s82Var.f9980D) && Objects.equals(this.f9981E, s82Var.f9981E) && Objects.equals(this.f9982F, s82Var.f9982F) && Objects.equals(this.f9983G, s82Var.f9983G) && this.f9984H == s82Var.f9984H && this.f9985I == s82Var.f9985I;
    }

    @Override // p000.AbstractC0849wj
    public final int hashCode() {
        return b93.m500g(this.f9985I ? 1 : 0, b93.m500g(this.f9984H ? 1 : 0, b93.m501h(b93.m501h(b93.m501h(b93.m501h(b93.m501h(b93.m501h(b93.m501h(super.hashCode(), this.f9977A), this.f9979C), this.f9980D), this.f9981E), this.f9982F), this.f9983G), null)));
    }

    /* JADX INFO: renamed from: x */
    public final s82 m4768x() {
        if (this.f12536v) {
            return clone().m4768x();
        }
        m5914p();
        return this;
    }

    @Override // p000.AbstractC0849wj
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final s82 mo4766a(AbstractC0849wj abstractC0849wj) {
        fg1.m1641p(abstractC0849wj);
        return (s82) super.mo4766a(abstractC0849wj);
    }

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
    /* JADX INFO: renamed from: z */
    public final l82 m4770z(Object obj, by2 by2Var, t82 t82Var, to0 to0Var, i32 i32Var, int i, int i2, AbstractC0849wj abstractC0849wj) {
        t82 t82Var2;
        t82 dg0Var;
        AbstractC0849wj abstractC0849wj2;
        l82 yq2Var;
        i32 i32Var2;
        if (this.f9983G != null) {
            dg0Var = new dg0(obj, t82Var);
            t82Var2 = dg0Var;
        } else {
            t82Var2 = null;
            dg0Var = t82Var;
        }
        s82 s82Var = this.f9982F;
        if (s82Var == null) {
            Context context = this.f9987y;
            vp0 vp0Var = this.f9978B;
            abstractC0849wj2 = abstractC0849wj;
            yq2Var = new yq2(context, vp0Var, obj, this.f9980D, this.f9977A, abstractC0849wj2, i, i2, i32Var, by2Var, this.f9981E, dg0Var, vp0Var.f12105g, to0Var.f10863h);
        } else {
            if (this.f9986J) {
                C0676s.m4653l("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
                return null;
            }
            to0 to0Var2 = s82Var.f9984H ? to0Var : s82Var.f9979C;
            if (AbstractC0849wj.m5904k(s82Var.f12522h, 8)) {
                i32Var2 = this.f9982F.f12524j;
            } else {
                int iOrdinal = i32Var.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    i32Var2 = i32.f4251h;
                } else if (iOrdinal == 2) {
                    i32Var2 = i32.f4252i;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.f12524j);
                    }
                    i32Var2 = i32.f4253j;
                }
            }
            i32 i32Var3 = i32Var2;
            s82 s82Var2 = this.f9982F;
            int i3 = s82Var2.f12529o;
            int i4 = s82Var2.f12528n;
            if (b93.m502i(i, i2)) {
                s82 s82Var3 = this.f9982F;
                if (!b93.m502i(s82Var3.f12529o, s82Var3.f12528n)) {
                    i3 = abstractC0849wj.f12529o;
                    i4 = abstractC0849wj.f12528n;
                }
            }
            int i5 = i4;
            m23 m23Var = new m23(obj, dg0Var);
            Context context2 = this.f9987y;
            vp0 vp0Var2 = this.f9978B;
            yq2 yq2Var2 = new yq2(context2, vp0Var2, obj, this.f9980D, this.f9977A, abstractC0849wj, i, i2, i32Var, by2Var, this.f9981E, m23Var, vp0Var2.f12105g, to0Var.f10863h);
            this.f9986J = true;
            s82 s82Var4 = this.f9982F;
            l82 l82VarM4770z = s82Var4.m4770z(obj, by2Var, m23Var, to0Var2, i32Var3, i3, i5, s82Var4);
            this.f9986J = false;
            m23Var.f6450c = yq2Var2;
            m23Var.f6451d = l82VarM4770z;
            abstractC0849wj2 = abstractC0849wj;
            yq2Var = m23Var;
        }
        if (t82Var2 == null) {
            return yq2Var;
        }
        s82 s82Var5 = this.f9983G;
        int i6 = s82Var5.f12529o;
        int i7 = s82Var5.f12528n;
        if (b93.m502i(i, i2)) {
            s82 s82Var6 = this.f9983G;
            if (!b93.m502i(s82Var6.f12529o, s82Var6.f12528n)) {
                i6 = abstractC0849wj2.f12529o;
                i7 = abstractC0849wj2.f12528n;
            }
        }
        s82 s82Var7 = this.f9983G;
        dg0 dg0Var2 = t82Var2;
        l82 l82VarM4770z2 = s82Var7.m4770z(obj, by2Var, dg0Var2, s82Var7.f9979C, s82Var7.f12524j, i6, i7, s82Var7);
        dg0Var2.f2043c = yq2Var;
        dg0Var2.f2044d = l82VarM4770z2;
        return dg0Var2;
    }
}

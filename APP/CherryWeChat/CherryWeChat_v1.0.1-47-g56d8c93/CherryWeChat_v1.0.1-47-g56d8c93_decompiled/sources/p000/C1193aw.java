package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C1273a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: aw */
/* JADX INFO: loaded from: classes.dex */
public final class C1193aw extends AbstractC2743y5 {

    /* JADX INFO: renamed from: A */
    public final boolean f4079A = true;

    /* JADX INFO: renamed from: B */
    public boolean f4080B;

    /* JADX INFO: renamed from: C */
    public boolean f4081C;

    /* JADX INFO: renamed from: r */
    public final Context f4082r;

    /* JADX INFO: renamed from: s */
    public final ComponentCallbacks2C1473gw f4083s;

    /* JADX INFO: renamed from: t */
    public final Class f4084t;

    /* JADX INFO: renamed from: u */
    public final C0756Rj f4085u;

    /* JADX INFO: renamed from: v */
    public C2806zj f4086v;

    /* JADX INFO: renamed from: w */
    public Object f4087w;

    /* JADX INFO: renamed from: x */
    public ArrayList f4088x;

    /* JADX INFO: renamed from: y */
    public C1193aw f4089y;

    /* JADX INFO: renamed from: z */
    public C1193aw f4090z;

    static {
    }

    public C1193aw(ComponentCallbacks2C1273a componentCallbacks2C1273a, ComponentCallbacks2C1473gw componentCallbacks2C1473gw, Class cls, Context context) {
        C2252mw c2252mw;
        this.f4083s = componentCallbacks2C1473gw;
        this.f4084t = cls;
        this.f4082r = context;
        C0521M4 c0521m4 = componentCallbacks2C1473gw.f5216a.f4339c.f2401f;
        C2806zj c2806zj = (C2806zj) c0521m4.get(cls);
        if (c2806zj == null) {
            for (Map.Entry entry : (C0306H4) c0521m4.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    c2806zj = (C2806zj) entry.getValue();
                }
            }
        }
        this.f4086v = c2806zj == null ? C0756Rj.f2395k : c2806zj;
        this.f4085u = componentCallbacks2C1273a.f4339c;
        Iterator it = componentCallbacks2C1473gw.f5224i.iterator();
        while (it.hasNext()) {
            m2303v((C1461gk) it.next());
        }
        synchronized (componentCallbacks2C1473gw) {
            c2252mw = componentCallbacks2C1473gw.f5225j;
        }
        mo2301a(c2252mw);
    }

    /* JADX INFO: renamed from: A */
    public final void m2298A(ImageView imageView) {
        AbstractC2743y5 abstractC2743y5M5314i;
        InterfaceC1444gA c0522m5;
        AbstractC2622vD.m5130a();
        AbstractC0714Qj.m1487i(imageView);
        if (!AbstractC2743y5.m5308h(this.f9352a, 2048) && imageView.getScaleType() != null) {
            switch (AbstractC1112Zv.f3509a[imageView.getScaleType().ordinal()]) {
                case 1:
                    abstractC2743y5M5314i = clone().m5314i(C2457re.f8658d, new C1205b7());
                    break;
                case 2:
                    abstractC2743y5M5314i = clone().m5318m(C2457re.f8657c, new C1248c7(), false);
                    break;
                case 3:
                case 4:
                case 5:
                    abstractC2743y5M5314i = clone().m5318m(C2457re.f8656b, new C2804zh(), false);
                    break;
                case 6:
                    abstractC2743y5M5314i = clone().m5318m(C2457re.f8657c, new C1248c7(), false);
                    break;
                default:
                    abstractC2743y5M5314i = this;
                    break;
            }
        } else {
            abstractC2743y5M5314i = this;
        }
        this.f4085u.f2398c.getClass();
        Class cls = this.f4084t;
        if (Bitmap.class.equals(cls)) {
            c0522m5 = new C0522M5(imageView, 0);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            c0522m5 = new C0522M5(imageView, 1);
        }
        m2307z(c0522m5, abstractC2743y5M5314i);
    }

    /* JADX INFO: renamed from: B */
    public final C1193aw m2299B(C1461gk c1461gk) {
        if (this.f9366o) {
            return clone().m2299B(c1461gk);
        }
        this.f4088x = null;
        return m2303v(c1461gk);
    }

    /* JADX INFO: renamed from: C */
    public final C1193aw m2300C(Object obj) {
        if (this.f9366o) {
            return clone().m2300C(obj);
        }
        this.f4087w = obj;
        this.f4080B = true;
        m5319n();
        return this;
    }

    @Override // p000.AbstractC2743y5
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1193aw)) {
            return false;
        }
        C1193aw c1193aw = (C1193aw) obj;
        return super.equals(c1193aw) && Objects.equals(this.f4084t, c1193aw.f4084t) && this.f4086v.equals(c1193aw.f4086v) && Objects.equals(this.f4087w, c1193aw.f4087w) && Objects.equals(this.f4088x, c1193aw.f4088x) && Objects.equals(this.f4089y, c1193aw.f4089y) && Objects.equals(this.f4090z, c1193aw.f4090z) && this.f4079A == c1193aw.f4079A && this.f4080B == c1193aw.f4080B;
    }

    @Override // p000.AbstractC2743y5
    public final int hashCode() {
        return AbstractC2622vD.m5136g(this.f4080B ? 1 : 0, AbstractC2622vD.m5136g(this.f4079A ? 1 : 0, AbstractC2622vD.m5137h(AbstractC2622vD.m5137h(AbstractC2622vD.m5137h(AbstractC2622vD.m5137h(AbstractC2622vD.m5137h(AbstractC2622vD.m5137h(AbstractC2622vD.m5137h(super.hashCode(), this.f4084t), this.f4086v), this.f4087w), this.f4088x), this.f4089y), this.f4090z), null)));
    }

    /* JADX INFO: renamed from: v */
    public final C1193aw m2303v(C1461gk c1461gk) {
        if (this.f9366o) {
            return clone().m2303v(c1461gk);
        }
        if (c1461gk != null) {
            if (this.f4088x == null) {
                this.f4088x = new ArrayList();
            }
            this.f4088x.add(c1461gk);
        }
        m5319n();
        return this;
    }

    @Override // p000.AbstractC2743y5
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final C1193aw mo2301a(AbstractC2743y5 abstractC2743y5) {
        AbstractC0714Qj.m1487i(abstractC2743y5);
        return (C1193aw) super.mo2301a(abstractC2743y5);
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
    /* JADX INFO: renamed from: x */
    public final InterfaceC1026Xv m2305x(Object obj, InterfaceC1444gA interfaceC1444gA, InterfaceC1237bw interfaceC1237bw, C2806zj c2806zj, EnumC2688wu enumC2688wu, int i, int i2, AbstractC2743y5 abstractC2743y5) {
        InterfaceC1237bw interfaceC1237bw2;
        InterfaceC1237bw c2373pg;
        AbstractC2743y5 abstractC2743y52;
        InterfaceC1026Xv c2563ty;
        EnumC2688wu enumC2688wu2;
        if (this.f4090z != null) {
            c2373pg = new C2373pg(obj, interfaceC1237bw);
            interfaceC1237bw2 = c2373pg;
        } else {
            interfaceC1237bw2 = null;
            c2373pg = interfaceC1237bw;
        }
        C1193aw c1193aw = this.f4089y;
        if (c1193aw == null) {
            Context context = this.f4082r;
            C0756Rj c0756Rj = this.f4085u;
            abstractC2743y52 = abstractC2743y5;
            c2563ty = new C2563ty(context, c0756Rj, obj, this.f4087w, this.f4084t, abstractC2743y52, i, i2, enumC2688wu, interfaceC1444gA, this.f4088x, c2373pg, c0756Rj.f2402g, c2806zj.f9518a);
        } else {
            if (this.f4081C) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            C2806zj c2806zj2 = c1193aw.f4079A ? c2806zj : c1193aw.f4086v;
            if (AbstractC2743y5.m5308h(c1193aw.f9352a, 8)) {
                enumC2688wu2 = this.f4089y.f9354c;
            } else {
                int iOrdinal = enumC2688wu.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    enumC2688wu2 = EnumC2688wu.f9251a;
                } else if (iOrdinal == 2) {
                    enumC2688wu2 = EnumC2688wu.f9252b;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.f9354c);
                    }
                    enumC2688wu2 = EnumC2688wu.f9253c;
                }
            }
            EnumC2688wu enumC2688wu3 = enumC2688wu2;
            C1193aw c1193aw2 = this.f4089y;
            int i3 = c1193aw2.f9359h;
            int i4 = c1193aw2.f9358g;
            if (AbstractC2622vD.m5138i(i, i2)) {
                C1193aw c1193aw3 = this.f4089y;
                if (!AbstractC2622vD.m5138i(c1193aw3.f9359h, c1193aw3.f9358g)) {
                    i3 = abstractC2743y5.f9359h;
                    i4 = abstractC2743y5.f9358g;
                }
            }
            int i5 = i4;
            C1401fB c1401fB = new C1401fB(obj, c2373pg);
            Context context2 = this.f4082r;
            C1401fB c1401fB2 = c1401fB;
            C0756Rj c0756Rj2 = this.f4085u;
            C2563ty c2563ty2 = new C2563ty(context2, c0756Rj2, obj, this.f4087w, this.f4084t, abstractC2743y5, i, i2, enumC2688wu, interfaceC1444gA, this.f4088x, c1401fB2, c0756Rj2.f2402g, c2806zj.f9518a);
            this.f4081C = true;
            C1193aw c1193aw4 = this.f4089y;
            InterfaceC1026Xv interfaceC1026XvM2305x = c1193aw4.m2305x(obj, interfaceC1444gA, c1401fB2, c2806zj2, enumC2688wu3, i3, i5, c1193aw4);
            this.f4081C = false;
            c1401fB2.f4971c = c2563ty2;
            c1401fB2.f4972d = interfaceC1026XvM2305x;
            abstractC2743y52 = abstractC2743y5;
            c2563ty = c1401fB2;
        }
        if (interfaceC1237bw2 == null) {
            return c2563ty;
        }
        C1193aw c1193aw5 = this.f4090z;
        int i6 = c1193aw5.f9359h;
        int i7 = c1193aw5.f9358g;
        if (AbstractC2622vD.m5138i(i, i2)) {
            C1193aw c1193aw6 = this.f4090z;
            if (!AbstractC2622vD.m5138i(c1193aw6.f9359h, c1193aw6.f9358g)) {
                i6 = abstractC2743y52.f9359h;
                i7 = abstractC2743y52.f9358g;
            }
        }
        int i8 = i7;
        C1193aw c1193aw7 = this.f4090z;
        C2373pg c2373pg2 = interfaceC1237bw2;
        InterfaceC1026Xv interfaceC1026XvM2305x2 = c1193aw7.m2305x(obj, interfaceC1444gA, c2373pg2, c1193aw7.f4086v, c1193aw7.f9354c, i6, i8, c1193aw7);
        c2373pg2.f8354c = c2563ty;
        c2373pg2.f8355d = interfaceC1026XvM2305x2;
        return c2373pg2;
    }

    @Override // p000.AbstractC2743y5
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final C1193aw clone() {
        C1193aw c1193aw = (C1193aw) super.clone();
        c1193aw.f4086v = c1193aw.f4086v.clone();
        if (c1193aw.f4088x != null) {
            c1193aw.f4088x = new ArrayList(c1193aw.f4088x);
        }
        C1193aw c1193aw2 = c1193aw.f4089y;
        if (c1193aw2 != null) {
            c1193aw.f4089y = c1193aw2.clone();
        }
        C1193aw c1193aw3 = c1193aw.f4090z;
        if (c1193aw3 != null) {
            c1193aw.f4090z = c1193aw3.clone();
        }
        return c1193aw;
    }

    /* JADX INFO: renamed from: z */
    public final void m2307z(InterfaceC1444gA interfaceC1444gA, AbstractC2743y5 abstractC2743y5) {
        AbstractC0714Qj.m1487i(interfaceC1444gA);
        if (!this.f4080B) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC1026Xv interfaceC1026XvM2305x = m2305x(new Object(), interfaceC1444gA, null, this.f4086v, abstractC2743y5.f9354c, abstractC2743y5.f9359h, abstractC2743y5.f9358g, abstractC2743y5);
        InterfaceC1026Xv interfaceC1026XvMo391a = interfaceC1444gA.mo391a();
        if (interfaceC1026XvM2305x.mo1939f(interfaceC1026XvMo391a) && (abstractC2743y5.f9357f || !interfaceC1026XvMo391a.mo1942k())) {
            AbstractC0714Qj.m1488j("Argument must not be null", interfaceC1026XvMo391a);
            if (interfaceC1026XvMo391a.isRunning()) {
                return;
            }
            interfaceC1026XvMo391a.mo1941j();
            return;
        }
        this.f4083s.m2831l(interfaceC1444gA);
        interfaceC1444gA.mo397g(interfaceC1026XvM2305x);
        ComponentCallbacks2C1473gw componentCallbacks2C1473gw = this.f4083s;
        synchronized (componentCallbacks2C1473gw) {
            componentCallbacks2C1473gw.f5221f.f5258a.add(interfaceC1444gA);
            C2692wy c2692wy = componentCallbacks2C1473gw.f5219d;
            ((Set) c2692wy.f9265c).add(interfaceC1026XvM2305x);
            if (c2692wy.f9264b) {
                interfaceC1026XvM2305x.clear();
                ((HashSet) c2692wy.f9266d).add(interfaceC1026XvM2305x);
            } else {
                interfaceC1026XvM2305x.mo1941j();
            }
        }
    }
}

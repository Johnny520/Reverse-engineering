package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import me.dartcv.nuke.BuildConfig;
import p121Y1.C1747h;
import p121Y1.C1748i;
import p121Y1.C1755p;
import p121Y1.C1762w;
import p154e2.C2029h;
import p171h2.AbstractC2234a;
import p171h2.C2235b;
import p171h2.C2238e;
import p171h2.C2239f;
import p171h2.C2240g;
import p171h2.InterfaceC2236c;
import p171h2.InterfaceC2237d;
import p177i2.C2311a;
import p177i2.InterfaceC2313c;
import p186k.C2423e;
import p195l2.AbstractC2503g;
import p195l2.AbstractC2511o;
import p224q2.C2921l;

/* JADX INFO: renamed from: com.bumptech.glide.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1945n extends AbstractC2234a {

    /* JADX INFO: renamed from: A */
    public C1945n f6593A;

    /* JADX INFO: renamed from: B */
    public final boolean f6594B = true;

    /* JADX INFO: renamed from: C */
    public boolean f6595C;

    /* JADX INFO: renamed from: D */
    public boolean f6596D;

    /* JADX INFO: renamed from: s */
    public final Context f6597s;

    /* JADX INFO: renamed from: t */
    public final ComponentCallbacks2C1947p f6598t;

    /* JADX INFO: renamed from: u */
    public final Class f6599u;

    /* JADX INFO: renamed from: v */
    public final C1927i f6600v;

    /* JADX INFO: renamed from: w */
    public C1919a f6601w;

    /* JADX INFO: renamed from: x */
    public Object f6602x;

    /* JADX INFO: renamed from: y */
    public ArrayList f6603y;

    /* JADX INFO: renamed from: z */
    public C1945n f6604z;

    static {
    }

    public C1945n(ComponentCallbacks2C1921c componentCallbacks2C1921c, ComponentCallbacks2C1947p componentCallbacks2C1947p, Class cls, Context context) {
        C2238e c2238e;
        this.f6598t = componentCallbacks2C1947p;
        this.f6599u = cls;
        this.f6597s = context;
        C2423e c2423e = componentCallbacks2C1947p.f6608d.f6516f.f6542f;
        C1919a c1919a = (C1919a) c2423e.get(cls);
        if (c1919a == null) {
            for (Map.Entry entry : (C2921l) c2423e.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    c1919a = (C1919a) entry.getValue();
                }
            }
        }
        this.f6601w = c1919a == null ? C1927i.f6536k : c1919a;
        this.f6600v = componentCallbacks2C1921c.f6516f;
        Iterator it = componentCallbacks2C1947p.f6614j.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            m3607v();
        }
        synchronized (componentCallbacks2C1947p) {
            c2238e = componentCallbacks2C1947p.f6615k;
        }
        mo3605a(c2238e);
    }

    /* JADX INFO: renamed from: A */
    public final void m3603A(InterfaceC2313c interfaceC2313c, AbstractC2234a abstractC2234a) {
        AbstractC2503g.m4444b(interfaceC2313c);
        if (!this.f6595C) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC2236c interfaceC2236cM3609x = m3609x(new Object(), interfaceC2313c, null, this.f6601w, abstractC2234a.f7297f, abstractC2234a.f7300i, abstractC2234a.f7299h, abstractC2234a);
        InterfaceC2236c interfaceC2236cMo3381t = interfaceC2313c.mo3381t();
        if (interfaceC2236cM3609x.mo4059i(interfaceC2236cMo3381t) && (abstractC2234a.f7298g || !interfaceC2236cMo3381t.mo4052b())) {
            AbstractC2503g.m4445c(interfaceC2236cMo3381t, "Argument must not be null");
            if (interfaceC2236cMo3381t.isRunning()) {
                return;
            }
            interfaceC2236cMo3381t.mo4058h();
            return;
        }
        this.f6598t.m3613a(interfaceC2313c);
        interfaceC2313c.mo3377d(interfaceC2236cM3609x);
        ComponentCallbacks2C1947p componentCallbacks2C1947p = this.f6598t;
        synchronized (componentCallbacks2C1947p) {
            ((Set) componentCallbacks2C1947p.f6613i.f6028e).add(interfaceC2313c);
            C2029h c2029h = componentCallbacks2C1947p.f6611g;
            ((Set) c2029h.f6763f).add(interfaceC2236cM3609x);
            if (c2029h.f6762e) {
                interfaceC2236cM3609x.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((HashSet) c2029h.f6764g).add(interfaceC2236cM3609x);
            } else {
                interfaceC2236cM3609x.mo4058h();
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final C1945n m3604B(Object obj) {
        if (this.f7307p) {
            return clone().m3604B(obj);
        }
        this.f6602x = obj;
        this.f6595C = true;
        m4043n();
        return this;
    }

    @Override // p171h2.AbstractC2234a
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1945n)) {
            return false;
        }
        C1945n c1945n = (C1945n) obj;
        return super.equals(c1945n) && Objects.equals(this.f6599u, c1945n.f6599u) && this.f6601w.equals(c1945n.f6601w) && Objects.equals(this.f6602x, c1945n.f6602x) && Objects.equals(this.f6603y, c1945n.f6603y) && Objects.equals(this.f6604z, c1945n.f6604z) && Objects.equals(this.f6593A, c1945n.f6593A) && this.f6594B == c1945n.f6594B && this.f6595C == c1945n.f6595C;
    }

    @Override // p171h2.AbstractC2234a
    public final int hashCode() {
        return AbstractC2511o.m4458g(this.f6595C ? 1 : 0, AbstractC2511o.m4458g(this.f6594B ? 1 : 0, AbstractC2511o.m4459h(AbstractC2511o.m4459h(AbstractC2511o.m4459h(AbstractC2511o.m4459h(AbstractC2511o.m4459h(AbstractC2511o.m4459h(AbstractC2511o.m4459h(super.hashCode(), this.f6599u), this.f6601w), this.f6602x), this.f6603y), this.f6604z), this.f6593A), null)));
    }

    /* JADX INFO: renamed from: v */
    public final C1945n m3607v() {
        if (this.f7307p) {
            return clone().m3607v();
        }
        m4043n();
        return this;
    }

    @Override // p171h2.AbstractC2234a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final C1945n mo3605a(AbstractC2234a abstractC2234a) {
        AbstractC2503g.m4444b(abstractC2234a);
        return (C1945n) super.mo3605a(abstractC2234a);
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
    public final InterfaceC2236c m3609x(Object obj, InterfaceC2313c interfaceC2313c, InterfaceC2237d interfaceC2237d, C1919a c1919a, EnumC1928j enumC1928j, int i5, int i6, AbstractC2234a abstractC2234a) {
        InterfaceC2237d interfaceC2237d2;
        InterfaceC2237d c2235b;
        AbstractC2234a abstractC2234a2;
        InterfaceC2236c c2239f;
        EnumC1928j enumC1928j2;
        if (this.f6593A != null) {
            c2235b = new C2235b(obj, interfaceC2237d);
            interfaceC2237d2 = c2235b;
        } else {
            interfaceC2237d2 = null;
            c2235b = interfaceC2237d;
        }
        C1945n c1945n = this.f6604z;
        if (c1945n == null) {
            Context context = this.f6597s;
            C1927i c1927i = this.f6600v;
            abstractC2234a2 = abstractC2234a;
            c2239f = new C2239f(context, c1927i, obj, this.f6602x, this.f6599u, abstractC2234a2, i5, i6, enumC1928j, interfaceC2313c, this.f6603y, c2235b, c1927i.f6543g, c1919a.f6510d);
        } else {
            if (this.f6596D) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            C1919a c1919a2 = c1945n.f6594B ? c1919a : c1945n.f6601w;
            if (AbstractC2234a.m4036j(c1945n.f7295d, 8)) {
                enumC1928j2 = this.f6604z.f7297f;
            } else {
                int iOrdinal = enumC1928j.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    enumC1928j2 = EnumC1928j.f6547d;
                } else if (iOrdinal == 2) {
                    enumC1928j2 = EnumC1928j.f6548e;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.f7297f);
                    }
                    enumC1928j2 = EnumC1928j.f6549f;
                }
            }
            EnumC1928j enumC1928j3 = enumC1928j2;
            C1945n c1945n2 = this.f6604z;
            int i7 = c1945n2.f7300i;
            int i8 = c1945n2.f7299h;
            if (AbstractC2511o.m4460i(i5, i6)) {
                C1945n c1945n3 = this.f6604z;
                if (!AbstractC2511o.m4460i(c1945n3.f7300i, c1945n3.f7299h)) {
                    i7 = abstractC2234a.f7300i;
                    i8 = abstractC2234a.f7299h;
                }
            }
            int i9 = i8;
            C2240g c2240g = new C2240g(obj, c2235b);
            Context context2 = this.f6597s;
            C2240g c2240g2 = c2240g;
            C1927i c1927i2 = this.f6600v;
            C2239f c2239f2 = new C2239f(context2, c1927i2, obj, this.f6602x, this.f6599u, abstractC2234a, i5, i6, enumC1928j, interfaceC2313c, this.f6603y, c2240g2, c1927i2.f6543g, c1919a.f6510d);
            this.f6596D = true;
            C1945n c1945n4 = this.f6604z;
            InterfaceC2236c interfaceC2236cM3609x = c1945n4.m3609x(obj, interfaceC2313c, c2240g2, c1919a2, enumC1928j3, i7, i9, c1945n4);
            this.f6596D = false;
            c2240g2.f7346c = c2239f2;
            c2240g2.f7347d = interfaceC2236cM3609x;
            abstractC2234a2 = abstractC2234a;
            c2239f = c2240g2;
        }
        if (interfaceC2237d2 == null) {
            return c2239f;
        }
        C1945n c1945n5 = this.f6593A;
        int i10 = c1945n5.f7300i;
        int i11 = c1945n5.f7299h;
        if (AbstractC2511o.m4460i(i5, i6)) {
            C1945n c1945n6 = this.f6593A;
            if (!AbstractC2511o.m4460i(c1945n6.f7300i, c1945n6.f7299h)) {
                i10 = abstractC2234a2.f7300i;
                i11 = abstractC2234a2.f7299h;
            }
        }
        int i12 = i11;
        C1945n c1945n7 = this.f6593A;
        C2235b c2235b2 = interfaceC2237d2;
        InterfaceC2236c interfaceC2236cM3609x2 = c1945n7.m3609x(obj, interfaceC2313c, c2235b2, c1945n7.f6601w, c1945n7.f7297f, i10, i12, c1945n7);
        c2235b2.f7312c = c2239f;
        c2235b2.f7313d = interfaceC2236cM3609x2;
        return c2235b2;
    }

    @Override // p171h2.AbstractC2234a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final C1945n clone() {
        C1945n c1945n = (C1945n) super.clone();
        c1945n.f6601w = c1945n.f6601w.clone();
        if (c1945n.f6603y != null) {
            c1945n.f6603y = new ArrayList(c1945n.f6603y);
        }
        C1945n c1945n2 = c1945n.f6604z;
        if (c1945n2 != null) {
            c1945n.f6604z = c1945n2.clone();
        }
        C1945n c1945n3 = c1945n.f6593A;
        if (c1945n3 != null) {
            c1945n.f6593A = c1945n3.clone();
        }
        return c1945n;
    }

    /* JADX INFO: renamed from: z */
    public final void m3611z(ImageView imageView) {
        AbstractC2234a abstractC2234aM4040k;
        InterfaceC2313c c2311a;
        AbstractC2511o.m4452a();
        AbstractC2503g.m4444b(imageView);
        if (!AbstractC2234a.m4036j(this.f7295d, 2048) && imageView.getScaleType() != null) {
            switch (AbstractC1944m.f6591a[imageView.getScaleType().ordinal()]) {
                case BuildConfig.VERSION_CODE /* 1 */:
                    abstractC2234aM4040k = clone().m4040k(C1755p.f6034d, new C1747h());
                    break;
                case 2:
                    abstractC2234aM4040k = clone().m4040k(C1755p.f6033c, new C1748i());
                    abstractC2234aM4040k.f7308q = true;
                    break;
                case 3:
                case 4:
                case 5:
                    abstractC2234aM4040k = clone().m4040k(C1755p.f6032b, new C1762w());
                    abstractC2234aM4040k.f7308q = true;
                    break;
                case 6:
                    abstractC2234aM4040k = clone().m4040k(C1755p.f6033c, new C1748i());
                    abstractC2234aM4040k.f7308q = true;
                    break;
                default:
                    abstractC2234aM4040k = this;
                    break;
            }
        } else {
            abstractC2234aM4040k = this;
        }
        this.f6600v.f6539c.getClass();
        Class cls = this.f6599u;
        if (Bitmap.class.equals(cls)) {
            c2311a = new C2311a(imageView, 0);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            c2311a = new C2311a(imageView, 1);
        }
        m3603A(c2311a, abstractC2234aM4040k);
    }
}

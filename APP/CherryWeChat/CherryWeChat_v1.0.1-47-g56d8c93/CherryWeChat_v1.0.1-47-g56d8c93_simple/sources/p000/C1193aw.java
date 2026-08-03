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
    public final boolean f4079A;

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
        C2252mw r0 = (C2252mw) ((C2252mw) ((C2252mw) new C2252mw().m5311e(C0922Vd.f2880d)).m5317l()).m5322q();
    }

    public C1193aw(ComponentCallbacks2C1273a r4, ComponentCallbacks2C1473gw r5, Class r6, Context r7) {
        this.f4079A = true;
        this.f4083s = r5;
        this.f4084t = r6;
        this.f4082r = r7;
        C0521M4 r72 = r5.f5216a.f4339c.f2401f;
        C2806zj r0 = (C2806zj) r72.get(r6);
        if (r0 != null) goto L10;
        Iterator r73 = ((C0306H4) r72.entrySet()).iterator();
    L6:
        if (r73.hasNext() == false) goto L10;
        Map.Entry r1 = (Map.Entry) r73.next();
        if (((Class) r1.getKey()).isAssignableFrom(r6) == false) goto L6;
        r0 = (C2806zj) r1.getValue();
    L10:
        if (r0 != null) goto L12;
        r0 = C0756Rj.f2395k;
    L12:
        this.f4086v = r0;
        this.f4085u = r4.f4339c;
        Iterator r42 = r5.f5224i.iterator();
    L14:
        if (r42.hasNext() == false) goto L16;
        m2303v((C1461gk) r42.next());
        goto L14
    L16:
        monitor-enter(r5);
        C2252mw r43 = r5.f5225j;     // Catch: Throwable -> L21
        monitor-exit(r5);
        m2304w(r43);
        return;
    L21:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: A */
    public final void m2298A(ImageView r5) {
        AbstractC2622vD.m5130a();
        AbstractC0714Qj.m1487i(r5);
        if (AbstractC2743y5.m5308h(this.f9352a, 2048) == false) goto L5;
        AbstractC2743y5 r0 = this;
    L14:
        this.f4085u.f2398c.getClass();
        Class r2 = this.f4084t;
        if (Bitmap.class.equals(r2) == false) goto L18;
        InterfaceC1444gA r1 = new C0522M5(r5, 0);
    L20:
        m2307z(r1, r0);
        return;
    L18:
        if (Drawable.class.isAssignableFrom(r2) == false) goto L23;
        r1 = new C0522M5(r5, 1);
        goto L20
    L23:
        throw new IllegalArgumentException("Unhandled class: " + r2 + ", try .as*(Class).transcode(ResourceTranscoder)");
    L5:
        if (r5.getScaleType() != null) goto L7;
        r0 = this;
        goto L14
    L7:
        switch(AbstractC1112Zv.f3509a[r5.getScaleType().ordinal()]) {
            case 1: goto L12;
            case 2: goto L11;
            case 3: goto L10;
            case 4: goto L10;
            case 5: goto L10;
            case 6: goto L9;
            default: goto L25;
        };
    L9:
        r0 = m2306y().m5318m(C2457re.f8657c, new C1248c7(), false);
        goto L14
    L10:
        r0 = m2306y().m5318m(C2457re.f8656b, new C2804zh(), false);
        goto L14
    L11:
        r0 = m2306y().m5318m(C2457re.f8657c, new C1248c7(), false);
        goto L14
    L12:
        r0 = m2306y().m5314i(C2457re.f8658d, new C1205b7());
        goto L14
    L25:
        r0 = this;
        goto L14
    }

    /* JADX INFO: renamed from: B */
    public final C1193aw m2299B(C1461gk r2) {
        if (this.f9366o == true) goto L5;
        this.f4088x = null;
        return m2303v(r2);
    L5:
        return m2306y().m2299B(r2);
    }

    /* JADX INFO: renamed from: C */
    public final C1193aw m2300C(Object r2) {
        if (this.f9366o == true) goto L5;
        this.f4087w = r2;
        this.f4080B = true;
        m5319n();
        return this;
    L5:
        return m2306y().m2300C(r2);
    }

    @Override // p000.AbstractC2743y5
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC2743y5 mo2301a(AbstractC2743y5 r1) {
        return m2304w(r1);
    }

    @Override // p000.AbstractC2743y5
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ AbstractC2743y5 mo2302c() {
        return m2306y();
    }

    @Override // p000.AbstractC2743y5
    public final /* bridge */ /* synthetic */ Object clone() {
        return m2306y();
    }

    @Override // p000.AbstractC2743y5
    public final boolean equals(Object r3) {
        if ((r3 instanceof C1193aw) == false) goto L24;
        C1193aw r32 = (C1193aw) r3;
        if (super.equals(r32) == true) goto L7;
        return false;
    L7:
        if (Objects.equals(this.f4084t, r32.f4084t) == true) goto L9;
        return false;
    L9:
        if (this.f4086v.equals(r32.f4086v) == true) goto L11;
        return false;
    L11:
        if (Objects.equals(this.f4087w, r32.f4087w) == true) goto L13;
        return false;
    L13:
        if (Objects.equals(this.f4088x, r32.f4088x) == true) goto L15;
        return false;
    L15:
        if (Objects.equals(this.f4089y, r32.f4089y) == true) goto L17;
        return false;
    L17:
        if (Objects.equals(this.f4090z, r32.f4090z) == true) goto L19;
        return false;
    L19:
        if (this.f4079A == r32.f4079A) goto L21;
        return false;
    L21:
        if (this.f4080B != r32.f4080B) goto L34;
        return true;
    L34:
        return false;
    L24:
        return false;
    }

    @Override // p000.AbstractC2743y5
    public final int hashCode() {
        int r0 = AbstractC2622vD.m5137h(AbstractC2622vD.m5137h(AbstractC2622vD.m5137h(AbstractC2622vD.m5137h(AbstractC2622vD.m5137h(AbstractC2622vD.m5137h(AbstractC2622vD.m5137h(super.hashCode(), this.f4084t), this.f4086v), this.f4087w), this.f4088x), this.f4089y), this.f4090z), null);
        int r02 = AbstractC2622vD.m5136g(this.f4079A ? 1 : 0, r0);
        return AbstractC2622vD.m5136g(this.f4080B ? 1 : 0, r02);
    }

    /* JADX INFO: renamed from: v */
    public final C1193aw m2303v(C1461gk r2) {
        if (this.f9366o == true) goto L5;
        if (r2 != null) goto L8;
    L11:
        m5319n();
        return this;
    L8:
        if (this.f4088x != null) goto L10;
        this.f4088x = new ArrayList();
    L10:
        this.f4088x.add(r2);
        goto L11
    L5:
        return m2306y().m2303v(r2);
    }

    /* JADX INFO: renamed from: w */
    public final C1193aw m2304w(AbstractC2743y5 r1) {
        AbstractC0714Qj.m1487i(r1);
        return (C1193aw) super.mo2301a(r1);
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
    public final InterfaceC1026Xv m2305x(Object r22, InterfaceC1444gA r23, InterfaceC1237bw r24, C2806zj r25, EnumC2688wu r26, int r27, int r28, AbstractC2743y5 r29) {
        if (this.f4090z == null) goto L5;
        InterfaceC1237bw r13 = new C2373pg(r22, r24);
        InterfaceC1237bw r16 = r13;
    L6:
        C1193aw r3 = this.f4089y;
        if (r3 != null) goto L9;
        Context r2 = this.f4082r;
        C0756Rj r32 = this.f4085u;
        AbstractC2743y5 r7 = r29;
        InterfaceC1026Xv r132 = new C2563ty(r2, r32, r22, this.f4087w, this.f4084t, r7, r27, r28, r26, r23, this.f4088x, r13, r32.f2402g, r25.f9518a);
    L39:
        if (r16 != null) goto L41;
        return r132;
    L41:
        C1193aw r1 = this.f4090z;
        int r210 = r1.f9359h;
        int r12 = r1.f9358g;
        if (AbstractC2622vD.m5138i(r27, r28) == false) goto L46;
        C1193aw r33 = this.f4090z;
        if (AbstractC2622vD.m5138i(r33.f9359h, r33.f9358g) == true) goto L46;
        r210 = r7.f9359h;
        r12 = r7.f9358g;
    L46:
        int r8 = r12;
        C1193aw r14 = this.f4090z;
        C2373pg r4 = r16;
        InterfaceC1026Xv r15 = r14.m2305x(r22, r23, r4, r14.f4086v, r14.f9354c, r210, r8, r14);
        r4.f8354c = r132;
        r4.f8355d = r15;
        return r4;
    L9:
        if (this.f4081C == true) goto L37;
        C2806zj r42 = r3.f4086v;
        if (r3.f4079A == false) goto L13;
        C2806zj r17 = r25;
    L15:
        if (AbstractC2743y5.m5308h(r3.f9352a, 8) == false) goto L18;
        EnumC2688wu r34 = this.f4089y.f9354c;
    L17:
        EnumC2688wu r18 = r34;
        C1193aw r35 = this.f4089y;
        int r5 = r35.f9359h;
        int r36 = r35.f9358g;
        if (AbstractC2622vD.m5138i(r27, r28) == false) goto L35;
        C1193aw r6 = this.f4089y;
        if (AbstractC2622vD.m5138i(r6.f9359h, r6.f9358g) == true) goto L35;
        r5 = r29.f9359h;
        r36 = r29.f9358g;
    L35:
        int r19 = r36;
        C1401fB r37 = new C1401fB(r22, r13);
        Context r211 = this.f4082r;
        C1401fB r133 = r37;
        C0756Rj r38 = this.f4085u;
        C2563ty r110 = new C2563ty(r211, r38, r22, this.f4087w, this.f4084t, r29, r27, r28, r26, r23, this.f4088x, r133, r38.f2402g, r25.f9518a);
        this.f4081C = true;
        C1193aw r111 = this.f4089y;
        InterfaceC1026Xv r112 = r111.m2305x(r22, r23, r133, r17, r18, r5, r19, r111);
        this.f4081C = false;
        r133.f4971c = r110;
        r133.f4972d = r112;
        r7 = r29;
        r132 = r133;
        goto L39
    L18:
        int r39 = r26.ordinal();
        if (r39 == 0) goto L29;
        if (r39 == 1) goto L29;
        if (r39 != 2) goto L24;
        r34 = EnumC2688wu.f9252b;
        goto L17
    L24:
        if (r39 != 3) goto L27;
        r34 = EnumC2688wu.f9253c;
        goto L17
    L27:
        throw new IllegalArgumentException("unknown priority: " + this.f9354c);
    L29:
        r34 = EnumC2688wu.f9251a;
        goto L17
    L13:
        r17 = r42;
        goto L15
    L37:
        throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
    L5:
        r16 = null;
        r13 = r24;
        goto L6
    }

    /* JADX INFO: renamed from: y */
    public final C1193aw m2306y() {
        C1193aw r0 = (C1193aw) super.mo2302c();
        r0.f4086v = r0.f4086v.m5429a();
        if (r0.f4088x == null) goto L5;
        r0.f4088x = new ArrayList(r0.f4088x);
    L5:
        C1193aw r1 = r0.f4089y;
        if (r1 == null) goto L8;
        r0.f4089y = r1.m2306y();
    L8:
        C1193aw r12 = r0.f4090z;
        if (r12 == null) goto L11;
        r0.f4090z = r12.m2306y();
    L11:
        return r0;
    }

    /* JADX INFO: renamed from: z */
    public final void m2307z(InterfaceC1444gA r11, AbstractC2743y5 r12) {
        AbstractC0714Qj.m1487i(r11);
        if (this.f4080B == false) goto L28;
        InterfaceC1026Xv r112 = m2305x(new Object(), r11, null, this.f4086v, r12.f9354c, r12.f9359h, r12.f9358g, r12);
        InterfaceC1026Xv r122 = r11.mo391a();
        if (r112.mo1939f(r122) == true) goto L7;
    L15:
        this.f4083s.m2831l(r11);
        r11.mo397g(r112);
        ComponentCallbacks2C1473gw r123 = this.f4083s;
        monitor-enter(r123);
        r123.f5221f.f5258a.add(r11);     // Catch: Throwable -> L23
        C2692wy r0 = r123.f5219d;     // Catch: Throwable -> L23
        ((Set) r0.f9265c).add(r112);     // Catch: Throwable -> L23
        if (r0.f9264b == true) goto L20;
        r112.mo1941j();     // Catch: Throwable -> L23
    L21:
        monitor-exit(r123);
        return;
    L20:
        r112.clear();     // Catch: Throwable -> L23
        ((HashSet) r0.f9266d).add(r112);     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        throw th;
    L7:
        if (r12.f9357f == false) goto L9;
    L11:
        AbstractC0714Qj.m1488j("Argument must not be null", r122);
        if (r122.isRunning() == true) goto L30;
        r122.mo1941j();
        return;
    L30:
        return;
    L9:
        if (r122.mo1942k() == false) goto L11;
    L28:
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }
}

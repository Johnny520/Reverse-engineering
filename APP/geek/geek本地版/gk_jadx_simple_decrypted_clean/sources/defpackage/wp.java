package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class wp implements mp, lx {
    public static final AtomicReferenceFieldUpdater a = null;
    public static final AtomicReferenceFieldUpdater b = null;
    private volatile Object _parentHandle;
    private volatile Object _state;

    static {
        a = AtomicReferenceFieldUpdater.newUpdater(wp.class, Object.class, "_state");
        b = AtomicReferenceFieldUpdater.newUpdater(wp.class, Object.class, "_parentHandle");
    }

    public wp(boolean r1) {
        if (r1 == false) goto L5;
        ui r12 = ip.l;
    L6:
        this._state = r12;
        return;
    L5:
        r12 = ip.k;
        goto L6
    }

    public static ea D(vr r2) {
    L3:
        if (r2.j() == false) goto L12;
        AtomicReferenceFieldUpdater r0 = vr.b;
        vr r1 = r2.e();
        if (r1 == null) goto L6;
        r2 = r1;
        goto L3
    L6:
        Object r22 = r0.get(r2);
    L7:
        r2 = (vr) r22;
        if (r2.j() == false) goto L3;
        r22 = r0.get(r2);
    L12:
        r2 = r2.i();
        if (r2.j() == true) goto L12;
        if ((r2 instanceof ea) == true) goto L17;
        if ((r2 instanceof mw) == false) goto L12;
        return null;
    L17:
        return (ea) r2;
    }

    public static String I(Object r1) {
        if ((r1 instanceof up) == false) goto L13;
        up r12 = (up) r1;
        if (r12.e() == false) goto L9;
        return "Cancelling";
    L9:
        if (r12.f() == false) goto L16;
        return "Completing";
    L16:
        return "Active";
    L13:
        if ((r1 instanceof vo) == false) goto L21;
        if (((vo) r1).a() == true) goto L26;
        return "New";
    L26:
        return "Active";
    L21:
        if ((r1 instanceof nb) == false) goto L24;
        return "Cancelled";
    L24:
        return "Completed";
    }

    public final void A(mp r7) {
        AtomicReferenceFieldUpdater r0 = b;
        nw r1 = nw.a;
        if (r7 != null) goto L6;
        r0.set(this, r1);
        return;
    L6:
        wp r72 = (wp) r7;
    L7:
        Object r2 = r72.x();
        boolean r3 = r2 instanceof ui;
        AtomicReferenceFieldUpdater r4 = a;
        if (r3 == true) goto L10;
        if ((r2 instanceof uo) == false) goto L28;
        mw r32 = ((uo) r2).a;
    L23:
        if (r4.compareAndSet(r72, r2, r32) == true) goto L24;
        if (r4.get(r72) == r2) goto L23;
    L24:
        r72.getClass();
    L28:
        da r73 = (da) a80.p(r72, new ea(this), 2);
        r0.set(this, r73);
        if ((x() instanceof vo) == true) goto L43;
        r73.b();
        r0.set(this, r1);
        return;
    L43:
        return;
    L10:
        if (((ui) r2).a == true) goto L28;
        ui r33 = ip.l;
    L14:
        if (r4.compareAndSet(r72, r2, r33) == true) goto L15;
        if (r4.get(r72) == r2) goto L14;
    L15:
        r72.getClass();
        goto L28
    }

    public boolean B() {
        return false;
    }

    public final Object C(Object r5) {
    L2:
        Object r0 = J(x(), r5);
        if (r0 == ip.f) goto L4;
        if (r0 == ip.h) goto L2;
        return r0;
    L4:
        String r1 = "Job " + this + " is already complete or completing, but is being completed with " + r5;
        Throwable r3 = null;
        if ((r5 instanceof nb) == false) goto L7;
        nb r52 = (nb) r5;
    L8:
        if (r52 == null) goto L11;
        r3 = r52.a;
    L11:
        throw new IllegalStateException(r1, r3);
    L7:
        r52 = null;
        goto L8
    }

    public final void E(mw r7, Throwable r8) {
        Object r0 = r7.h();
        ip.m("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", r0);
        vr r02 = (vr) r0;
        pb r1 = null;
    L4:
        if (r02.equals(r7) == true) goto L15;
        if ((r02 instanceof op) == false) goto L14;
        sp r2 = (sp) r02;
        r2.l(r8);     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        if (r1 == null) goto L13;
        ip.f(r1, th);
        goto L14
    L13:
        r1 = new pb("Exception in completion handler " + r2 + " for " + this, th);
    L14:
        r02 = r02.i();
        goto L4
    L15:
        if (r1 == null) goto L17;
        z(r1);
    L17:
        n(r8);
    }

    public final void H(sp r4) {
        mw r0 = new mw();
        r4.getClass();
        vr.b.lazySet(r0, r4);
        AtomicReferenceFieldUpdater r1 = vr.a;
        r1.lazySet(r0, r4);
    L4:
        if (r4.h() != r4) goto L9;
    L7:
        if (r1.compareAndSet(r4, r4, r0) == true) goto L8;
        if (r1.get(r4) == r4) goto L7;
    L8:
        r0.g(r4);
    L9:
        vr r2 = r4.i();
    L10:
        AtomicReferenceFieldUpdater r02 = a;
        if (r02.compareAndSet(this, r4, r2) == true) goto L12;
        if (r02.get(this) == r4) goto L10;
        return;
    }

    public final Object J(Object r7, Object r8) {
        if ((r7 instanceof vo) == true) goto L7;
        return ip.f;
    L7:
        if ((r7 instanceof ui) == true) goto L11;
        if ((r7 instanceof sp) == true) goto L11;
    L26:
        vo r72 = (vo) r7;
        mw r0 = w(r72);
        if (r0 == null) goto L29;
        ea r2 = null;
        if ((r72 instanceof up) == false) goto L33;
        up r1 = (up) r72;
    L34:
        if (r1 != null) goto L36;
        r1 = new up(r0, null);
    L36:
        monitor-enter(r1);
    L42:
        th = move-exception;
        throw th;
    L38:
        if (r1.f() == false) goto L44;
        l0 r73 = ip.f;     // Catch: Throwable -> L42
        monitor-exit(r1);
        return r73;
    L44:
        up.b.set(r1, 1);     // Catch: Throwable -> L42
        if (r1 == r72) goto L55;
        AtomicReferenceFieldUpdater r3 = a;     // Catch: Throwable -> L42
    L48:
        if (r3.compareAndSet(this, r72, r1) == true) goto L55;
        if (r3.get(this) == r72) goto L48;
        l0 r74 = ip.h;     // Catch: Throwable -> L42
        monitor-exit(r1);
        return r74;
    L55:
        boolean r32 = r1.e();     // Catch: Throwable -> L42
        if ((r8 instanceof nb) == false) goto L58;
        nb r5 = (nb) r8;     // Catch: Throwable -> L42
    L59:
        if (r5 == null) goto L61;
        r1.b(r5.a);     // Catch: Throwable -> L42
    L61:
        Throwable r52 = r1.c();     // Catch: Throwable -> L42
        if (r32 == false) goto L65;
        r52 = null;
    L65:
        monitor-exit(r1);
        if (r52 == null) goto L69;
        E(r0, r52);
    L69:
        if ((r72 instanceof ea) == false) goto L71;
        ea r02 = (ea) r72;
    L72:
        if (r02 != null) goto L76;
        mw r75 = r72.d();
        if (r75 == null) goto L77;
        r2 = D(r75);
    L77:
        if (r2 == null) goto L85;
    L79:
        if (a80.p(r2.e, new tp(this, r1, r2, r8), 1) != nw.a) goto L81;
        r2 = D(r2);
        if (r2 != null) goto L79;
    L81:
        return ip.g;
    L85:
        return s(r1, r8);
    L76:
        r2 = r02;
        goto L77
    L71:
        r02 = null;
        goto L72
    L58:
        r5 = null;
        goto L59
    L33:
        r1 = null;
        goto L34
    L29:
        return ip.h;
    L11:
        if ((r7 instanceof ea) == true) goto L26;
        if ((r8 instanceof nb) == true) goto L26;
        vo r03 = (vo) r7;
        AtomicReferenceFieldUpdater r12 = a;
        if ((r8 instanceof vo) == false) goto L17;
        Object r22 = new wo((vo) r8);
    L19:
        if (r12.compareAndSet(this, r03, r22) == true) goto L20;
        if (r12.get(this) == r03) goto L19;
        return ip.h;
    L20:
        F(r8);
        q(r03, r8);
        return r8;
    L17:
        r22 = r8;
        goto L19
    }

    @Override // defpackage.mp
    public boolean a() {
        Object r0 = x();
        if ((r0 instanceof vo) == true) goto L5;
        return false;
    L5:
        if (((vo) r0).a() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.ge
    public final ee b(fe r2) {
        ip.o("key", r2);
        if (ip.i(vh.h, r2) == false) goto L5;
        return this;
    L5:
        return null;
    }

    @Override // defpackage.ge
    public final ge g(fe r1) {
        return ff.B(this, r1);
    }

    @Override // defpackage.ee
    public final fe getKey() {
        return vh.h;
    }

    @Override // defpackage.ge
    public final Object h(Object r1, wm r2) {
        return r2.e(r1, this);
    }

    @Override // defpackage.ge
    public final ge i(ge r1) {
        return ff.E(this, r1);
    }

    public final boolean j(vo r4, mw r5, sp r6) {
        vp r0 = new vp(r6, this, r4);
    L3:
        AtomicReferenceFieldUpdater r42 = vr.b;
        vr r1 = r5.e();
        if (r1 != null) goto L10;
        Object r12 = r42.get(r5);
    L6:
        r1 = (vr) r12;
        if (r1.j() == false) goto L10;
        r12 = r42.get(r1);
    L10:
        vr.b.lazySet(r6, r1);
        AtomicReferenceFieldUpdater r43 = vr.a;
        r43.lazySet(r6, r5);
        r0.c = r5;
    L12:
        if (r43.compareAndSet(r1, r5, r0) == true) goto L14;
        if (r43.get(r1) == r5) goto L12;
    L14:
        if (r0.a(r1) != null) goto L17;
        return true;
    L17:
        return false;
    }

    public void l(Object r1) {
        k(r1);
    }

    public final boolean m(Object r10) {
        Object r0 = ip.f;
        if (v() == false) goto L19;
    L4:
        Object r02 = x();
        if ((r02 instanceof vo) == false) goto L14;
        if ((r02 instanceof up) == true) goto L9;
    L11:
        r0 = J(r02, new nb(r(r10), false));
        if (r0 == ip.h) goto L4;
    L16:
        if (r0 != ip.g) goto L19;
    L75:
        return true;
    L9:
        if (((up) r02).f() == false) goto L11;
    L14:
        r0 = ip.f;
    L19:
        if (r0 != ip.f) goto L71;
        Throwable r03 = null;
        Throwable r1 = null;
    L21:
        Object r4 = x();
        if ((r4 instanceof up) == true) goto L23;
        if ((r4 instanceof vo) == false) goto L69;
        if (r1 != null) goto L50;
        r1 = r(r10);
    L50:
        vo r5 = (vo) r4;
        if (r5.a() == true) goto L52;
        Object r52 = J(r4, new nb(r1, false));
        if (r52 == ip.f) goto L68;
        if (r52 == ip.h) goto L21;
        r0 = r52;
        goto L71
    L68:
        throw new IllegalStateException(("Cannot happen in " + r4).toString());
    L52:
        mw r6 = w(r5);
        if (r6 == null) goto L21;
        up r7 = new up(r6, r1);
        AtomicReferenceFieldUpdater r8 = a;
    L57:
        if (r8.compareAndSet(this, r5, r7) == true) goto L58;
        if (r8.get(this) == r5) goto L57;
    L58:
        E(r6, r1);
        l0 r102 = ip.f;
    L31:
        r0 = r102;
        goto L71
    L69:
        r102 = ip.i;
        goto L31
    L23:
        monitor-enter(r4);
    L32:
        th = move-exception;
        throw th;
    L25:
        if (up.d.get((up) r4) != ip.j) goto L27;
        boolean r53 = true;
    L28:
        if (r53 == false) goto L34;
        r102 = ip.i;     // Catch: Throwable -> L32
        monitor-exit(r4);
        goto L31
    L34:
        boolean r54 = ((up) r4).e();     // Catch: Throwable -> L32
        if (r1 != null) goto L37;
        r1 = r(r10);     // Catch: Throwable -> L32
    L37:
        ((up) r4).b(r1);     // Catch: Throwable -> L32
        Throwable r103 = ((up) r4).c();     // Catch: Throwable -> L32
        if (r54 == true) goto L40;
        r03 = r103;
    L40:
        monitor-exit(r4);
        if (r03 == null) goto L43;
        E(((up) r4).a, r03);
    L43:
        r102 = ip.f;
        goto L31
    L27:
        r53 = false;
    L71:
        if (r0 == ip.f) goto L75;
        if (r0 == ip.g) goto L75;
        if (r0 != ip.i) goto L79;
        return false;
    L79:
        k(r0);
        return true;
    }

    public final boolean n(Throwable r4) {
        if (B() == true) goto L19;
        boolean r0 = r4 instanceof CancellationException;
        da r1 = (da) b.get(this);
        if (r1 != null) goto L8;
    L18:
        return r0;
    L8:
        if (r1 == nw.a) goto L18;
        if (r1.c(r4) == true) goto L16;
        if (r0 == true) goto L20;
        return false;
    L20:
        return true;
    L16:
        return true;
    L19:
        return true;
    }

    public String o() {
        return "Job was cancelled";
    }

    public boolean p(Throwable r2) {
        if ((r2 instanceof CancellationException) == false) goto L6;
        return true;
    L6:
        if (m(r2) == true) goto L8;
        return false;
    L8:
        if (u() == false) goto L14;
        return true;
    L14:
        return false;
    }

    public final void q(vo r8, Object r9) {
        AtomicReferenceFieldUpdater r0 = b;
        da r1 = (da) r0.get(this);
        if (r1 == null) goto L5;
        r1.b();
        r0.set(this, nw.a);
    L5:
        pb r12 = null;
        if ((r9 instanceof nb) == false) goto L8;
        nb r92 = (nb) r9;
    L9:
        if (r92 == null) goto L11;
        Throwable r93 = r92.a;
    L13:
        if ((r8 instanceof sp) == true) goto L36;
        mw r82 = r8.d();
        if (r82 == null) goto L46;
        Object r02 = r82.h();
        ip.m("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", r02);
        vr r03 = (vr) r02;
    L22:
        if (r03.equals(r82) == true) goto L33;
        if ((r03 instanceof sp) == false) goto L32;
        sp r4 = (sp) r03;
        r4.l(r93);     // Catch: Throwable -> L28
    L28:
        th = move-exception;
        if (r12 == null) goto L31;
        ip.f(r12, th);
        goto L32
    L31:
        r12 = new pb("Exception in completion handler " + r4 + " for " + this, th);
    L32:
        r03 = r03.i();
        goto L22
    L33:
        if (r12 == null) goto L47;
        z(r12);
        return;
    L47:
        return;
    L46:
        return;
    L36:
        ((sp) r8).l(r93);     // Catch: Throwable -> L16
        return;
    L16:
        th = move-exception;
        z(new pb("Exception in completion handler " + r8 + " for " + this, th));
        return;
    L11:
        r93 = null;
        goto L13
    L8:
        r92 = null;
        goto L9
    }

    public final Throwable r(Object r5) {
        if ((r5 instanceof Throwable) == true) goto L5;
        wp r52 = (wp) ((lx) r5);
        Object r0 = r52.x();
        CancellationException r2 = null;
        if ((r0 instanceof up) == false) goto L10;
        Throwable r1 = ((up) r0).c();
    L16:
        if ((r1 instanceof CancellationException) == false) goto L18;
        r2 = (CancellationException) r1;
    L18:
        if (r2 == null) goto L20;
        return r2;
    L20:
        return new np("Parent job is ".concat(I(r0)), r1, r52);
    L10:
        if ((r0 instanceof nb) == false) goto L13;
        r1 = ((nb) r0).a;
        goto L16
    L13:
        if ((r0 instanceof vo) == true) goto L22;
        r1 = null;
        goto L16
    L22:
        throw new IllegalStateException(("Cannot be cancelling child in this state: " + r0).toString());
    L5:
        return (Throwable) r5;
    }

    public final Object s(up r11, Object r12) {
        Object r1 = null;
        Throwable r13 = null;
        if ((r12 instanceof nb) == false) goto L5;
        nb r0 = (nb) r12;
    L6:
        if (r0 == null) goto L8;
        Throwable r02 = r0.a;
    L9:
        monitor-enter(r11);
        r11.e();     // Catch: Throwable -> L63
        ArrayList r2 = r11.g(r02);     // Catch: Throwable -> L63
        if (r2.isEmpty() == true) goto L13;
        int r3 = r2.size();     // Catch: Throwable -> L63
        int r5 = 0;
    L16:
        if (r5 >= r3) goto L20;
        Object r6 = r2.get(r5);     // Catch: Throwable -> L63
        r5 = r5 + 1;     // Catch: Throwable -> L63
        if ((((Throwable) r6) instanceof CancellationException) == true) goto L16;
        r1 = r6;
    L20:
        r13 = (Throwable) r1;     // Catch: Throwable -> L63
        if (r13 != null) goto L25;
        r13 = (Throwable) r2.get(0);     // Catch: Throwable -> L63
    L25:
        if (r13 != null) goto L27;
    L40:
        monitor-exit(r11);
        if (r13 == null) goto L46;
        if (r13 == r02) goto L46;
        r12 = new nb(r13, false);
    L46:
        if (r13 != null) goto L48;
    L52:
        F(r12);
        AtomicReferenceFieldUpdater r03 = a;
        if ((r12 instanceof vo) == false) goto L55;
        Object r14 = new wo((vo) r12);
    L57:
        if (r03.compareAndSet(this, r11, r14) == true) goto L61;
        if (r03.get(this) == r11) goto L57;
    L61:
        q(r11, r12);
        return r12;
    L55:
        r14 = r12;
        goto L57
    L48:
        if (n(r13) == false) goto L50;
    L51:
        ip.m("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally", r12);
        nb.b.compareAndSet((nb) r12, 0, 1);
        goto L52
    L50:
        if (y(r13) == false) goto L52;
    L27:
        if (r2.size() <= 1) goto L40;
        Set r52 = Collections.newSetFromMap(new IdentityHashMap(r2.size()));     // Catch: Throwable -> L63
        int r62 = r2.size();     // Catch: Throwable -> L63
        int r7 = 0;
    L30:
        if (r7 >= r62) goto L40;
        Object r8 = r2.get(r7);     // Catch: Throwable -> L63
        r7 = r7 + 1;     // Catch: Throwable -> L63
        Throwable r82 = (Throwable) r8;     // Catch: Throwable -> L63
        if (r82 == r13) goto L30;
        if (r82 == r13) goto L30;
        if ((r82 instanceof CancellationException) == true) goto L30;
        if (r52.add(r82) == false) goto L30;
        ip.f(r13, r82);     // Catch: Throwable -> L63
        goto L30
    L13:
        if (r11.e() == false) goto L25;
        r13 = new np(o(), null, this);     // Catch: Throwable -> L63
    L63:
        th = move-exception;
        throw th;
    L8:
        r02 = null;
        goto L9
    L5:
        r0 = null;
        goto L6
    }

    public final CancellationException t() {
        Object r0 = x();
        CancellationException r3 = null;
        if ((r0 instanceof up) == false) goto L19;
        Throwable r02 = ((up) r0).c();
        if (r02 == null) goto L17;
        String r1 = getClass().getSimpleName().concat(" is cancelling");
        if ((r02 instanceof CancellationException) == false) goto L9;
        r3 = (CancellationException) r02;
    L9:
        if (r3 == null) goto L11;
        return r3;
    L11:
        if (r1 != null) goto L14;
        r1 = o();
    L14:
        return new np(r1, r02, this);
    L17:
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    L19:
        if ((r0 instanceof vo) == true) goto L32;
        if ((r0 instanceof nb) == false) goto L30;
        Throwable r03 = ((nb) r0).a;
        if ((r03 instanceof CancellationException) == false) goto L25;
        r3 = (CancellationException) r03;
    L25:
        if (r3 == null) goto L27;
        return r3;
    L27:
        return new np(o(), r03, this);
    L30:
        return new np(getClass().getSimpleName().concat(" has completed normally"), null, this);
    L32:
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(getClass().getSimpleName() + '{' + I(x()) + '}');
        r0.append('@');
        r0.append(ff.s(this));
        return r0.toString();
    }

    public boolean u() {
        return true;
    }

    public boolean v() {
        return false;
    }

    public final mw w(vo r4) {
        mw r0 = r4.d();
        if (r0 == null) goto L5;
        return r0;
    L5:
        if ((r4 instanceof ui) == false) goto L9;
        return new mw();
    L9:
        if ((r4 instanceof sp) == false) goto L13;
        H((sp) r4);
        return null;
    L13:
        throw new IllegalStateException(("State should have list: " + r4).toString());
    }

    public final Object x() {
    L2:
        Object r0 = a.get(this);
        if ((r0 instanceof dx) == false) goto L4;
        ((dx) r0).a(this);
        goto L2
    L4:
        return r0;
    }

    public boolean y(Throwable r1) {
        return false;
    }

    public void F(Object r1) {
    }

    public void k(Object r1) {
    }

    public void z(pb r1) {
        throw r1;
    }

    public void G() {
    }
}

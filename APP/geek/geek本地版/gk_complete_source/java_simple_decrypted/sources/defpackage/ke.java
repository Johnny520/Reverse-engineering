package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ke extends h implements md {
    public static final je b = null;

    static {
        b = new je(vh.b, ie.b);
    }

    public ke() {
        super(vh.b);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [cq, sm] */
    @Override // defpackage.h, defpackage.ge
    public final ee b(fe r4) {
        ip.o("key", r4);
        if ((r4 instanceof je) == false) goto L14;
        je r42 = (je) r4;
        fe r0 = this.a;
        if (r0 != r42) goto L7;
    L10:
        ee r43 = (ee) r42.a.f(this);
        if (r43 == null) goto L16;
        return r43;
    L16:
        return null;
    L7:
        if (r42.b == r0) goto L10;
        return null;
    L14:
        if (vh.b != r4) goto L16;
        return this;
    }

    public abstract void d(ge r1, Runnable r2);

    public boolean e() {
        return !(this instanceof n80);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [cq, sm] */
    @Override // defpackage.h, defpackage.ge
    public final ge g(fe r3) {
        ip.o("key", r3);
        if ((r3 instanceof je) == false) goto L14;
        je r32 = (je) r3;
        fe r0 = this.a;
        if (r0 == r32) goto L11;
        if (r32.b == r0) goto L11;
        return this;
    L11:
        if (((ee) r32.a.f(this)) != null) goto L16;
    L17:
        return this;
    L16:
        return wi.a;
    L14:
        if (vh.b != r3) goto L17;
        goto L17
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + ff.s(this);
    }
}

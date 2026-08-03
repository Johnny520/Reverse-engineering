package p004e;

import p000a.AbstractC0001b;
import p007h.AbstractC0118c;

/* JADX INFO: renamed from: e.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0035l {

    /* JADX INFO: renamed from: a */
    private final int f108a;

    /* JADX INFO: renamed from: b */
    private final int f109b;

    /* JADX INFO: renamed from: c */
    private final int f110c;

    /* JADX INFO: renamed from: d */
    private final AbstractC0039p f111d;

    /* JADX INFO: renamed from: e */
    private final boolean f112e;

    public C0035l(int i2, int i3, int i4, AbstractC0039p abstractC0039p, boolean z) {
        if (!AbstractC0001b.m6k(i2)) {
            throw new IllegalArgumentException("bogus opcode");
        }
        if (!AbstractC0001b.m6k(i3)) {
            throw new IllegalArgumentException("bogus family");
        }
        if (!AbstractC0001b.m6k(i4)) {
            throw new IllegalArgumentException("bogus nextOpcode");
        }
        this.f108a = i2;
        this.f109b = i3;
        this.f110c = i4;
        this.f111d = abstractC0039p;
        this.f112e = z;
    }

    /* JADX INFO: renamed from: a */
    public final int m151a() {
        return this.f109b;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0039p m152b() {
        return this.f111d;
    }

    /* JADX INFO: renamed from: c */
    public final String m153c() {
        return AbstractC0118c.m346a(this.f108a);
    }

    /* JADX INFO: renamed from: d */
    public final int m154d() {
        return this.f110c;
    }

    /* JADX INFO: renamed from: e */
    public final int m155e() {
        return this.f108a;
    }

    /* JADX INFO: renamed from: f */
    public final C0035l m156f() {
        switch (this.f108a) {
            case 50:
                return AbstractC0036m.f161Q;
            case 51:
                return AbstractC0036m.f158P;
            case 52:
                return AbstractC0036m.f167S;
            case 53:
                return AbstractC0036m.f164R;
            case 54:
                return AbstractC0036m.f173U;
            case 55:
                return AbstractC0036m.f170T;
            case 56:
                return AbstractC0036m.f177W;
            case 57:
                return AbstractC0036m.f175V;
            case 58:
                return AbstractC0036m.f181Y;
            case 59:
                return AbstractC0036m.f179X;
            case 60:
                return AbstractC0036m.f186a0;
            case 61:
                return AbstractC0036m.f183Z;
            default:
                throw new IllegalArgumentException("bogus opcode: " + this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m157g() {
        return this.f112e;
    }

    public final String toString() {
        return m153c();
    }
}

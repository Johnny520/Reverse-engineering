package fun.box001.internal.dexformat;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.annotations.AbstractC0118c;

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

    public C0035l(int r2, int r3, int r4, AbstractC0039p r5, boolean r6) {
        if (RuntimeDexGenerator.m6k(r2) == false) goto L15;
        if (RuntimeDexGenerator.m6k(r3) == false) goto L13;
        if (RuntimeDexGenerator.m6k(r4) == false) goto L11;
        this.f108a = r2;
        this.f109b = r3;
        this.f110c = r4;
        this.f111d = r5;
        this.f112e = r6;
        return;
    L11:
        throw new IllegalArgumentException("bogus nextOpcode");
    L13:
        throw new IllegalArgumentException("bogus family");
    L15:
        throw new IllegalArgumentException("bogus opcode");
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
        switch(this.f108a) {
            case 50: goto L29;
            case 51: goto L27;
            case 52: goto L25;
            case 53: goto L23;
            case 54: goto L21;
            case 55: goto L19;
            case 56: goto L17;
            case 57: goto L15;
            case 58: goto L13;
            case 59: goto L11;
            case 60: goto L9;
            case 61: goto L7;
            default: goto L5;
        };
    L5:
        throw new IllegalArgumentException("bogus opcode: " + this);
    L7:
        return AbstractC0036m.f183Z;
    L9:
        return AbstractC0036m.f186a0;
    L11:
        return AbstractC0036m.f179X;
    L13:
        return AbstractC0036m.f181Y;
    L15:
        return AbstractC0036m.f175V;
    L17:
        return AbstractC0036m.f177W;
    L19:
        return AbstractC0036m.f170T;
    L21:
        return AbstractC0036m.f173U;
    L23:
        return AbstractC0036m.f164R;
    L25:
        return AbstractC0036m.f167S;
    L27:
        return AbstractC0036m.f158P;
    L29:
        return AbstractC0036m.f161Q;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m157g() {
        return this.f112e;
    }

    public final String toString() {
        return m153c();
    }
}

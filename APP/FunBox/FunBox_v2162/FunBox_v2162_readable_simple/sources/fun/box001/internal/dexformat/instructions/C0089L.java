package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.output.InterfaceC0199a;
import fun.box001.internal.dexformat.writer.code.AbstractC0171a;
import fun.box001.internal.dexformat.writer.code.AbstractC0184n;
import fun.box001.internal.dexformat.writer.code.AbstractC0185o;
import fun.box001.internal.dexformat.writer.code.AbstractC0189s;
import fun.box001.internal.dexformat.writer.code.C0172b;
import fun.box001.internal.dexformat.writer.code.C0173c;
import fun.box001.internal.dexformat.writer.code.C0175e;
import fun.box001.internal.dexformat.writer.code.C0176f;
import fun.box001.internal.dexformat.writer.code.C0177g;
import fun.box001.internal.dexformat.writer.code.C0178h;
import fun.box001.internal.dexformat.writer.code.C0179i;
import fun.box001.internal.dexformat.writer.code.C0180j;
import fun.box001.internal.dexformat.writer.code.C0181k;
import fun.box001.internal.dexformat.writer.code.C0187q;
import fun.box001.internal.dexformat.writer.code.C0190t;
import fun.box001.internal.dexformat.writer.code.C0191u;
import fun.box001.internal.dexmaker.AbstractC0007d;

/* JADX INFO: renamed from: g.L */
/* JADX INFO: loaded from: classes.dex */
public final class C0089L {

    /* JADX INFO: renamed from: a */
    private final C0100k f330a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0199a f331b;

    public C0089L(C0100k r1, C0202d r2) {
        if (r1 == null) goto L7;
        this.f330a = r1;
        this.f331b = r2;
        return;
    L7:
        throw new NullPointerException("file == null");
    }

    /* JADX INFO: renamed from: a */
    public static void m257a(C0100k r3, AbstractC0171a r4) {
        if ((r4 instanceof C0173c) == false) goto L7;
        C0172b r42 = ((C0173c) r4).m429g();
        int r0 = r42.m504B();
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L10;
        m257a(r3, r42.m514q(r1));
        r1 = r1 + 1;
        goto L5
    L10:
        return;
    L7:
        r3.m310t(r4);
    }

    /* JADX INFO: renamed from: b */
    private static int m258b(AbstractC0171a r1) {
        if ((r1 instanceof C0176f) == false) goto L7;
        return 0;
    L7:
        if ((r1 instanceof AbstractC0189s) == false) goto L11;
        return 2;
    L11:
        if ((r1 instanceof C0177g) == false) goto L15;
        return 3;
    L15:
        if ((r1 instanceof C0180j) == false) goto L19;
        return 4;
    L19:
        if ((r1 instanceof AbstractC0185o) == false) goto L23;
        return 6;
    L23:
        if ((r1 instanceof C0179i) == false) goto L27;
        return 16;
    L27:
        if ((r1 instanceof C0178h) == false) goto L31;
        return 17;
    L31:
        if ((r1 instanceof C0190t) == false) goto L35;
        return 23;
    L35:
        if ((r1 instanceof C0191u) == false) goto L39;
        return 24;
    L39:
        if ((r1 instanceof C0187q) == false) goto L43;
        return 26;
    L43:
        if ((r1 instanceof C0173c) == false) goto L47;
        return 28;
    L47:
        if ((r1 instanceof C0181k) == false) goto L51;
        return 30;
    L51:
        if ((r1 instanceof C0175e) == false) goto L55;
        return 31;
    L55:
        throw new RuntimeException("Shouldn't happen");
    }

    /* JADX INFO: renamed from: c */
    public final void m259c(C0173c r12, boolean r13) {
        InterfaceC0199a r1 = this.f331b;
        if (r13 == true) goto L5;
    L7:
        boolean r132 = false;
    L8:
        C0172b r122 = r12.m429g();
        int r2 = r122.m504B();
        if (r132 == false) goto L11;
        ((C0202d) r1).m485c("  size: ".concat(RuntimeDexGenerator.m13s(r2)));
    L11:
        C0202d r3 = (C0202d) r1;
        r3.m500t(r2);
        int r4 = 0;
    L12:
        if (r4 >= r2) goto L63;
        AbstractC0171a r5 = r122.m514q(r4);
        if (r132 == false) goto L20;
        StringBuilder r7 = new StringBuilder("  [");
        r7.append(Integer.toHexString(r4));
        r7.append("] ");
        if (m258b(r5) != 30) goto L18;
        String r8 = "null";
    L19:
        r7.append(r8);
        r3.m485c(r7.toString());
        goto L20
    L18:
        r8 = r5.mo427f() + ' ' + r5.mo107a();
    L20:
        int r72 = m258b(r5);
        if (r72 != 0) goto L23;
    L59:
        long r52 = ((AbstractC0184n) r5).mo439i();
        int r82 = ((65 - Long.numberOfLeadingZeros((r52 >> 63) ^ r52)) + 7) >> 3;
        C0202d r9 = (C0202d) r1;
        r9.m496p(r72 | ((r82 - 1) << 5));
    L60:
        if (r82 <= 0) goto L62;
        r9.m496p((byte) r52);
        r52 = r52 >> 8;
        r82 = r82 - 1;
    L62:
        r4 = r4 + 1;
        goto L12
    L23:
        if (r72 == 6) goto L59;
        if (r72 == 2) goto L59;
        if (r72 != 3) goto L28;
        long r53 = ((AbstractC0184n) r5).mo439i();
    L58:
        RuntimeDexGenerator.m17w(r1, r72, r53);
        goto L62
    L28:
        if (r72 == 4) goto L59;
        if (r72 != 16) goto L32;
        long r54 = ((C0179i) r5).mo439i() << 32;
    L56:
        RuntimeDexGenerator.m16v(r1, r72, r54);
        goto L62
    L32:
        if (r72 == 17) goto L54;
        C0100k r83 = this.f330a;
        switch(r72) {
            case 21: goto L52;
            case 22: goto L50;
            case 23: goto L48;
            case 24: goto L47;
            case 25: goto L45;
            case 26: goto L44;
            case 27: goto L42;
            case 28: goto L41;
            case 29: goto L39;
            case 30: goto L38;
            case 31: goto L37;
            default: goto L36;
        };
    L37:
        ((C0202d) r1).m496p((((C0175e) r5).mo438h() << 5) | r72);
        goto L62
    L38:
        ((C0202d) r1).m496p(r72);
        goto L62
    L41:
        ((C0202d) r1).m496p(r72);
        m259c((C0173c) r5, false);
        goto L62
    L44:
        int r55 = r83.m303m().m338q((C0187q) r5);
    L49:
        r53 = r55;
        goto L58
    L47:
        r55 = r83.m307q().m329r((C0191u) r5);
        goto L49
    L48:
        r55 = r83.m306p().m328q((C0190t) r5);
        goto L49
    L36:
        throw new RuntimeException("Shouldn't happen");
    L39:
        ((C0202d) r1).m496p(r72);
        AbstractC0007d.m48b(r5);
        throw null;
    L42:
        AbstractC0007d.m48b(r5);
        throw null;
    L45:
        r83.m297g();
        AbstractC0007d.m48b(r5);
        throw null;
    L50:
        r83.m302l();
        AbstractC0007d.m48b(r5);
        throw null;
    L52:
        r83.getClass();
        AbstractC0007d.m48b(r5);
        throw null;
    L54:
        r54 = ((C0178h) r5).mo439i();
        goto L56
    L63:
        if (r132 == false) goto L79;
        r3.m488f();
        return;
    L79:
        return;
    L5:
        if (((C0202d) r1).m486d() == false) goto L7;
        r132 = true;
        goto L8
    }
}

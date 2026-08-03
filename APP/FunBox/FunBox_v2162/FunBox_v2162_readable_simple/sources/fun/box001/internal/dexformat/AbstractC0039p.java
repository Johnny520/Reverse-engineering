package fun.box001.internal.dexformat;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.output.InterfaceC0199a;
import fun.box001.internal.dexformat.util.C0067q;
import fun.box001.internal.dexformat.writer.C0162m;
import fun.box001.internal.dexformat.writer.C0164o;
import fun.box001.internal.dexformat.writer.code.AbstractC0183m;
import fun.box001.internal.dexformat.writer.code.AbstractC0184n;
import fun.box001.internal.dexformat.writer.code.C0181k;
import java.util.BitSet;

/* JADX INFO: renamed from: e.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0039p {
    /* JADX INFO: renamed from: a */
    protected static String m161a(AbstractC0033j r6) {
        int r62 = ((C0022F) r6).m87A();
        int r4 = 0;
        if (r62 != ((short) r62)) goto L11;
        char[] r0 = new char[5];
        if (r62 >= 0) goto L7;
        r0[0] = '-';
        r62 = -r62;
    L8:
        if (r4 >= 4) goto L24;
        r0[4 - r4] = Character.forDigit(r62 & 15, 16);
        r62 = r62 >> 4;
        r4 = r4 + 1;
        goto L8
    L24:
        return new String(r0);
    L7:
        r0[0] = '+';
        goto L8
    L11:
        char[] r02 = new char[9];
        if (r62 >= 0) goto L14;
        r02[0] = '-';
        r62 = -r62;
    L16:
        if (r4 >= 8) goto L19;
        r02[8 - r4] = Character.forDigit(r62 & 15, 16);
        r62 = r62 >> 4;
        r4 = r4 + 1;
        goto L16
    L19:
        return new String(r02);
    L14:
        r02[0] = '+';
        goto L16
    }

    /* JADX INFO: renamed from: c */
    protected static String m162c(AbstractC0033j r1) {
        int r12 = ((C0022F) r1).m90z();
        if (r12 != ((char) r12)) goto L6;
        return RuntimeDexGenerator.m11q(r12);
    L6:
        return RuntimeDexGenerator.m13s(r12);
    }

    /* JADX INFO: renamed from: e */
    protected static short m163e(int r1, int r2) {
        if ((r1 & 255) != r1) goto L11;
        if ((r2 & 255) != r2) goto L9;
        return (short) (r1 | (r2 << 8));
    L9:
        throw new IllegalArgumentException("high out of range 0..255");
    L11:
        throw new IllegalArgumentException("low out of range 0..255");
    }

    /* JADX INFO: renamed from: j */
    protected static String m164j(AbstractC0184n r4, int r5) {
        StringBuilder r0 = new StringBuilder(20);
        r0.append("#");
        if ((r4 instanceof AbstractC0183m) == false) goto L5;
        long r1 = ((AbstractC0183m) r4).mo439i();
    L7:
        if (r5 != 4) goto L9;
        String r42 = new String(new char[]{Character.forDigit(((int) r1) & 15, 16)});
    L22:
        r0.append(r42);
        return r0.toString();
    L9:
        if (r5 == 8) goto L20;
        if (r5 != 16) goto L12;
        r42 = RuntimeDexGenerator.m11q((int) r1);
        goto L22
    L12:
        if (r5 != 32) goto L14;
        r42 = RuntimeDexGenerator.m13s((int) r1);
        goto L22
    L14:
        if (r5 != 64) goto L17;
        r42 = RuntimeDexGenerator.m14t(r1);
        goto L22
    L17:
        throw new RuntimeException("shouldn't happen");
    L20:
        r42 = RuntimeDexGenerator.m10p((int) r1);
        goto L22
    L5:
        r1 = r4.mo438h();
        goto L7
    }

    /* JADX INFO: renamed from: k */
    protected static String m165k(AbstractC0184n r2) {
        StringBuilder r0 = new StringBuilder(100);
        r0.append('#');
        if ((r2 instanceof C0181k) == false) goto L5;
        String r22 = "null";
    L6:
        r0.append(r22);
        return r0.toString();
    L5:
        r0.append(r2.mo427f());
        r0.append(' ');
        r22 = r2.mo107a();
        goto L6
    }

    /* JADX INFO: renamed from: l */
    protected static int m166l(int r1, int r2) {
        if ((r1 & 15) != r1) goto L11;
        if ((r2 & 15) != r2) goto L9;
        return r1 | (r2 << 4);
    L9:
        throw new IllegalArgumentException("high out of range 0..15");
    L11:
        throw new IllegalArgumentException("low out of range 0..15");
    }

    /* JADX INFO: renamed from: m */
    protected static short m167m(int r1, AbstractC0033j r2) {
        if ((r1 & 255) != r1) goto L11;
        int r22 = r2.m138k().m155e();
        if ((r22 & 255) != r22) goto L9;
        return (short) ((r1 << 8) | r22);
    L9:
        throw new IllegalArgumentException("opcode out of range 0..255");
    L11:
        throw new IllegalArgumentException("arg out of range 0..255");
    }

    /* JADX INFO: renamed from: n */
    protected static String m168n(C0164o r4) {
        int r0 = r4.m504B();
        StringBuilder r1 = new StringBuilder((r0 * 5) + 2);
        r1.append('{');
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L7;
        if (r2 == 0) goto L6;
        r1.append(", ");
    L6:
        r1.append(r4.m513p(r2).m388o());
        r2 = r2 + 1;
        goto L3
    L7:
        r1.append('}');
        return r1.toString();
    }

    /* JADX INFO: renamed from: o */
    protected static String m169o(C0164o r6) {
        int r0 = r6.m504B();
        StringBuilder r1 = new StringBuilder(30);
        r1.append("{");
        if (r0 != 0) goto L5;
    L12:
        r1.append("}");
        return r1.toString();
    L5:
        if (r0 == 1) goto L10;
        C0162m r02 = r6.m513p(r0 - 1);
        if (r02.m382g() != 2) goto L9;
        r02 = r02.m389q(1);
    L9:
        r1.append(r6.m513p(0).m388o());
        r1.append("..");
        String r62 = r02.m388o();
    L11:
        r1.append(r62);
        goto L12
    L10:
        r62 = r6.m513p(0).m388o();
        goto L11
    }

    /* JADX INFO: renamed from: p */
    protected static boolean m170p(int r1) {
        if (r1 != (r1 & 255)) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: q */
    protected static boolean m171q(int r1) {
        if (r1 != (r1 & 15)) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: r */
    protected static boolean m172r(int r1) {
        if (r1 != (65535 & r1)) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: s */
    protected static void m173s(InterfaceC0199a r0, short r1, short r2) {
        C0202d r02 = (C0202d) r0;
        r02.m498r(r1);
        r02.m498r(r2);
    }

    /* JADX INFO: renamed from: t */
    protected static void m174t(C0202d r1, short r2, int r3) {
        short r0 = (short) r3;
        r1.m498r(r2);
        r1.m498r(r0);
        r1.m498r((short) (r3 >> 16));
    }

    /* JADX INFO: renamed from: b */
    public boolean mo175b(C0022F r1) {
        return this instanceof C0067q;
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo176d();

    /* JADX INFO: renamed from: f */
    public BitSet mo177f(AbstractC0033j r1) {
        return new BitSet();
    }

    /* JADX INFO: renamed from: g */
    public abstract String mo178g(AbstractC0033j r1);

    /* JADX INFO: renamed from: h */
    public abstract String mo179h(AbstractC0033j r1);

    /* JADX INFO: renamed from: i */
    public abstract boolean mo180i(AbstractC0033j r1);

    /* JADX INFO: renamed from: u */
    public abstract void mo181u(C0202d r1, AbstractC0033j r2);
}

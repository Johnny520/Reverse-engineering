package fun.box001.internal.dexformat.writer.code;

import fun.box001.internal.dexformat.writer.data.C0193a;
import fun.box001.internal.dexformat.writer.data.C0194b;
import fun.box001.internal.dexformat.writer.data.C0195c;

/* JADX INFO: renamed from: k.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0174d extends AbstractC0186p {

    /* JADX INFO: renamed from: c */
    private final C0193a f685c;

    /* JADX INFO: renamed from: d */
    private C0193a f686d;

    AbstractC0174d(C0191u r5, C0188r r6) {
        super(r5, r6);
        String r52 = m441h().m442g().m445h();
        C0191u r62 = m440g();
        boolean r1 = true;
        if (r62.equals(C0191u.f701e) == false) goto L10;
        String r63 = m441h().m443h().m445h();
        r63.getClass();
        if (r63.equals("invoke") == false) goto L7;
    L140:
        if (r1 == false) goto L142;
        C0193a r53 = C0193a.m453b(r52);
    L143:
        this.f685c = r53;
        this.f686d = null;
        return;
    L142:
        r53 = C0193a.m454f(r52);
        goto L143
    L7:
        if (r63.equals("invokeExact") == true) goto L140;
        r1 = false;
        goto L140
    L10:
        if (r62.equals(C0191u.f702f) == false) goto L139;
        String r64 = m441h().m443h().m445h();
        r64.getClass();
        byte r3 = -1;
        switch(r64.hashCode()) {
            case -1946504908: goto L135;
            case -1686727776: goto L131;
            case -1671098288: goto L127;
            case -1292078254: goto L123;
            case -1117944904: goto L119;
            case -1103072857: goto L115;
            case -1032914329: goto L111;
            case -1032892181: goto L107;
            case -794517348: goto L103;
            case -567150350: goto L99;
            case -240822786: goto L95;
            case -230706875: goto L91;
            case -127361888: goto L87;
            case -37641530: goto L83;
            case 102230: goto L79;
            case 113762: goto L75;
            case 93645315: goto L71;
            case 101293086: goto L67;
            case 189872914: goto L63;
            case 282707520: goto L59;
            case 282724865: goto L55;
            case 353422447: goto L51;
            case 470702883: goto L47;
            case 685319959: goto L43;
            case 748071969: goto L39;
            case 937077366: goto L35;
            case 1245632875: goto L31;
            case 1352153939: goto L27;
            case 1483964149: goto L23;
            case 2002508693: goto L19;
            case 2013994287: goto L15;
            default: goto L138;
        };
    L138:
        switch(r3) {
            case 0: goto L140;
            case 1: goto L140;
            case 2: goto L140;
            case 3: goto L140;
            case 4: goto L140;
            case 5: goto L140;
            case 6: goto L140;
            case 7: goto L140;
            case 8: goto L140;
            case 9: goto L140;
            case 10: goto L140;
            case 11: goto L140;
            case 12: goto L140;
            case 13: goto L140;
            case 14: goto L140;
            case 15: goto L140;
            case 16: goto L140;
            case 17: goto L140;
            case 18: goto L140;
            case 19: goto L140;
            case 20: goto L140;
            case 21: goto L140;
            case 22: goto L140;
            case 23: goto L140;
            case 24: goto L140;
            case 25: goto L140;
            case 26: goto L140;
            case 27: goto L140;
            case 28: goto L140;
            case 29: goto L140;
            case 30: goto L140;
            default: goto L145;
        };
    L145:
        r1 = false;
        goto L140
    L15:
        if (r64.equals("weakCompareAndSetRelease") == false) goto L138;
        r3 = 30;
        goto L138
    L19:
        if (r64.equals("getAndSetAcquire") == false) goto L138;
        r3 = 29;
        goto L138
    L23:
        if (r64.equals("compareAndExchange") == false) goto L138;
        r3 = 28;
        goto L138
    L27:
        if (r64.equals("getAndBitwiseOr") == false) goto L138;
        r3 = 27;
        goto L138
    L31:
        if (r64.equals("getAndBitwiseXorAcquire") == false) goto L138;
        r3 = 26;
        goto L138
    L35:
        if (r64.equals("getAndAddAcquire") == false) goto L138;
        r3 = 25;
        goto L138
    L39:
        if (r64.equals("compareAndExchangeAcquire") == false) goto L138;
        r3 = 24;
        goto L138
    L43:
        if (r64.equals("getOpaque") == false) goto L138;
        r3 = 23;
        goto L138
    L47:
        if (r64.equals("setOpaque") == false) goto L138;
        r3 = 22;
        goto L138
    L51:
        if (r64.equals("getAndBitwiseAndAcquire") == false) goto L138;
        r3 = 21;
        goto L138
    L55:
        if (r64.equals("getAndSet") == false) goto L138;
        r3 = 20;
        goto L138
    L59:
        if (r64.equals("getAndAdd") == false) goto L138;
        r3 = 19;
        goto L138
    L63:
        if (r64.equals("getVolatile") == false) goto L138;
        r3 = 18;
        goto L138
    L67:
        if (r64.equals("setVolatile") == false) goto L138;
        r3 = 17;
        goto L138
    L71:
        if (r64.equals("getAndBitwiseOrAcquire") == false) goto L138;
        r3 = 16;
        goto L138
    L75:
        if (r64.equals("set") == false) goto L138;
        r3 = 15;
        goto L138
    L79:
        if (r64.equals("get") == false) goto L138;
        r3 = 14;
        goto L138
    L83:
        if (r64.equals("getAndSetRelease") == false) goto L138;
        r3 = 13;
        goto L138
    L87:
        if (r64.equals("getAcquire") == false) goto L138;
        r3 = 12;
        goto L138
    L91:
        if (r64.equals("setRelease") == false) goto L138;
        r3 = 11;
        goto L138
    L95:
        if (r64.equals("weakCompareAndSetAcquire") == false) goto L138;
        r3 = 10;
        goto L138
    L99:
        if (r64.equals("weakCompareAndSetPlain") == false) goto L138;
        r3 = 9;
        goto L138
    L103:
        if (r64.equals("getAndBitwiseXorRelease") == false) goto L138;
        r3 = 8;
        goto L138
    L107:
        if (r64.equals("getAndBitwiseXor") == false) goto L138;
        r3 = 7;
        goto L138
    L111:
        if (r64.equals("getAndBitwiseAnd") == false) goto L138;
        r3 = 6;
        goto L138
    L115:
        if (r64.equals("getAndAddRelease") == false) goto L138;
        r3 = 5;
        goto L138
    L119:
        if (r64.equals("weakCompareAndSet") == false) goto L138;
        r3 = 4;
        goto L138
    L123:
        if (r64.equals("compareAndExchangeRelease") == false) goto L138;
        r3 = 3;
        goto L138
    L127:
        if (r64.equals("compareAndSet") == false) goto L138;
        r3 = 2;
        goto L138
    L131:
        if (r64.equals("getAndBitwiseAndRelease") == false) goto L138;
        r3 = 1;
        goto L138
    L135:
        if (r64.equals("getAndBitwiseOrRelease") == false) goto L138;
        r3 = 0;
        goto L138
    L139:
        r1 = false;
        goto L140
    }

    @Override // fun.box001.internal.dexformat.writer.data.InterfaceC0196d
    /* JADX INFO: renamed from: c */
    public final C0195c mo379c() {
        return this.f685c.m458e();
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0186p, fun.box001.internal.dexformat.writer.code.AbstractC0171a
    /* JADX INFO: renamed from: e */
    protected final int mo426e(AbstractC0171a r2) {
        int r0 = super.mo426e(r2);
        if (r0 == 0) goto L6;
        return r0;
    L6:
        return this.f685c.m455a(((AbstractC0174d) r2).f685c);
    }

    /* JADX INFO: renamed from: i */
    public final int m430i(boolean r5) {
        C0193a r0 = this.f685c;
        if (r5 == false) goto L6;
    L9:
        C0194b r52 = r0.m457d();
        int r02 = r52.m504B();
        int r1 = 0;
        int r2 = 0;
    L10:
        if (r1 >= r02) goto L12;
        r2 = r2 + r52.m515r(r1).m469f();
        r1 = r1 + 1;
        goto L10
    L12:
        return r2;
    L6:
        if (this.f686d != null) goto L8;
        this.f686d = r0.m459g(m440g().m451g());
    L8:
        r0 = this.f686d;
        goto L9
    }

    /* JADX INFO: renamed from: j */
    public final C0193a m431j() {
        return this.f685c;
    }
}

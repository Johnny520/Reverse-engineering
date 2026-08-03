package p295u4;

import bsh.C0353j;
import com.alibaba.fastjson2.JSONB;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p311v4.C4447a0;
import p311v4.C4451c0;
import p311v4.C4453d0;
import p311v4.C4476y;
import p311v4.C4477z;
import p326w4.C4683c;
import p326w4.InterfaceC4685e;

/* JADX INFO: renamed from: u4.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4260j extends AbstractC4259i {

    /* JADX INFO: renamed from: o */
    public static final C4451c0 f13951o = new C4451c0("([Ljava/lang/Object;)Ljava/lang/Object;");

    /* JADX INFO: renamed from: p */
    public static final C4451c0 f13952p = new C4451c0("([Ljava/lang/Object;)V");

    /* JADX INFO: renamed from: q */
    public static final C4451c0 f13953q = new C4451c0("([Ljava/lang/Object;)Z");

    /* JADX INFO: renamed from: k */
    public final InterfaceC4685e f13954k;

    /* JADX INFO: renamed from: l */
    public final C4476y f13955l;

    /* JADX INFO: renamed from: m */
    public final C4476y f13956m;

    /* JADX INFO: renamed from: n */
    public final C4447a0 f13957n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C4260j(C4268r c4268r, C4270t c4270t, C4266p c4266p, InterfaceC4685e interfaceC4685e, C4476y c4476y) {
        C4476y c4476y2;
        super(c4268r, c4270t, null, c4266p);
        int i9 = c4268r.f13975e;
        byte b10 = 6;
        if (i9 != 6) {
            C2104o.m5294t(AbstractC0921a.m2249l(i9, "opcode with invalid branchingness: "));
            throw null;
        }
        if (interfaceC4685e == null) {
            C0353j.m1305c("catches == null");
            throw null;
        }
        this.f13954k = interfaceC4685e;
        if (c4476y == null) {
            C0353j.m1305c("callSiteMethod == null");
            throw null;
        }
        if (!c4476y.m8905k()) {
            C2104o.m5294t("callSiteMethod is not signature polymorphic");
            throw null;
        }
        this.f13955l = c4476y;
        C4453d0 c4453d0 = c4476y.f14821g;
        C4451c0 c4451c0 = c4476y.f14822h.f14827g;
        String str = c4451c0.f14760g;
        boolean zEquals = c4453d0.equals(C4453d0.f14764B);
        C4451c0 c4451c02 = f13951o;
        if (!zEquals || (!str.equals("invoke") && !str.equals("invokeExact"))) {
            if (c4453d0.equals(C4453d0.f14765C)) {
                str.getClass();
                switch (str.hashCode()) {
                    case -1946504908:
                        b10 = !str.equals("getAndBitwiseOrRelease") ? (byte) -1 : (byte) 0;
                        break;
                    case -1686727776:
                        b10 = !str.equals("getAndBitwiseAndRelease") ? (byte) -1 : (byte) 1;
                        break;
                    case -1671098288:
                        b10 = !str.equals("compareAndSet") ? (byte) -1 : (byte) 2;
                        break;
                    case -1292078254:
                        b10 = !str.equals("compareAndExchangeRelease") ? (byte) -1 : (byte) 3;
                        break;
                    case -1117944904:
                        b10 = !str.equals("weakCompareAndSet") ? (byte) -1 : (byte) 4;
                        break;
                    case -1103072857:
                        b10 = !str.equals("getAndAddRelease") ? (byte) -1 : (byte) 5;
                        break;
                    case -1032914329:
                        if (!str.equals("getAndBitwiseAnd")) {
                            b10 = -1;
                        }
                        break;
                    case -1032892181:
                        b10 = !str.equals("getAndBitwiseXor") ? (byte) -1 : (byte) 7;
                        break;
                    case -794517348:
                        b10 = !str.equals("getAndBitwiseXorRelease") ? (byte) -1 : (byte) 8;
                        break;
                    case -567150350:
                        b10 = !str.equals("weakCompareAndSetPlain") ? (byte) -1 : (byte) 9;
                        break;
                    case -240822786:
                        b10 = !str.equals("weakCompareAndSetAcquire") ? (byte) -1 : (byte) 10;
                        break;
                    case -230706875:
                        b10 = !str.equals("setRelease") ? (byte) -1 : (byte) 11;
                        break;
                    case -127361888:
                        b10 = !str.equals("getAcquire") ? (byte) -1 : (byte) 12;
                        break;
                    case -37641530:
                        b10 = !str.equals("getAndSetRelease") ? (byte) -1 : (byte) 13;
                        break;
                    case 102230:
                        b10 = !str.equals("get") ? (byte) -1 : (byte) 14;
                        break;
                    case 113762:
                        b10 = !str.equals("set") ? (byte) -1 : (byte) 15;
                        break;
                    case 93645315:
                        b10 = !str.equals("getAndBitwiseOrAcquire") ? (byte) -1 : JSONB.Constants.BC_INT32_NUM_16;
                        break;
                    case 101293086:
                        b10 = !str.equals("setVolatile") ? (byte) -1 : (byte) 17;
                        break;
                    case 189872914:
                        b10 = !str.equals("getVolatile") ? (byte) -1 : (byte) 18;
                        break;
                    case 282707520:
                        b10 = !str.equals("getAndAdd") ? (byte) -1 : (byte) 19;
                        break;
                    case 282724865:
                        b10 = !str.equals("getAndSet") ? (byte) -1 : (byte) 20;
                        break;
                    case 353422447:
                        b10 = !str.equals("getAndBitwiseAndAcquire") ? (byte) -1 : (byte) 21;
                        break;
                    case 470702883:
                        b10 = !str.equals("setOpaque") ? (byte) -1 : (byte) 22;
                        break;
                    case 685319959:
                        b10 = !str.equals("getOpaque") ? (byte) -1 : (byte) 23;
                        break;
                    case 748071969:
                        b10 = !str.equals("compareAndExchangeAcquire") ? (byte) -1 : (byte) 24;
                        break;
                    case 937077366:
                        b10 = !str.equals("getAndAddAcquire") ? (byte) -1 : (byte) 25;
                        break;
                    case 1245632875:
                        b10 = !str.equals("getAndBitwiseXorAcquire") ? (byte) -1 : (byte) 26;
                        break;
                    case 1352153939:
                        b10 = !str.equals("getAndBitwiseOr") ? (byte) -1 : (byte) 27;
                        break;
                    case 1483964149:
                        b10 = !str.equals("compareAndExchange") ? (byte) -1 : (byte) 28;
                        break;
                    case 2002508693:
                        b10 = !str.equals("getAndSetAcquire") ? (byte) -1 : (byte) 29;
                        break;
                    case 2013994287:
                        b10 = !str.equals("weakCompareAndSetRelease") ? (byte) -1 : (byte) 30;
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 3:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 12:
                    case 13:
                    case 14:
                    case 16:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        c4476y2 = new C4476y(c4453d0, new C4477z(c4451c0, c4451c02));
                        break;
                    case 2:
                    case 4:
                    case 9:
                    case 10:
                    case 30:
                        c4476y2 = new C4476y(c4453d0, new C4477z(c4451c0, f13953q));
                        break;
                    case 11:
                    case 15:
                    case 17:
                    case 22:
                        c4476y2 = new C4476y(c4453d0, new C4477z(c4451c0, f13952p));
                        break;
                }
            }
            C2104o.m5294t("Unknown signature polymorphic method: ".concat(c4476y.mo4901a()));
            throw null;
        }
        c4476y2 = new C4476y(c4453d0, new C4477z(c4451c0, c4451c02));
        this.f13956m = c4476y2;
        this.f13957n = new C4447a0(c4476y.f14786i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.AbstractC4259i
    /* JADX INFO: renamed from: d */
    public final void mo8553d(InterfaceC4258h interfaceC4258h) {
        interfaceC4258h.mo4275j(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.AbstractC4259i
    /* JADX INFO: renamed from: e */
    public final InterfaceC4685e mo8554e() {
        return this.f13954k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.AbstractC4259i
    /* JADX INFO: renamed from: h */
    public final String mo8552h() {
        return this.f13956m.toString() + " " + this.f13957n.toString() + " " + C4271u.m8593j(this.f13954k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.AbstractC4259i
    /* JADX INFO: renamed from: i */
    public final AbstractC4259i mo8555i(C4683c c4683c) {
        return new C4260j(this.f13947g, this.f13948h, this.f13950j, this.f13954k.mo354d(c4683c), this.f13955l);
    }
}

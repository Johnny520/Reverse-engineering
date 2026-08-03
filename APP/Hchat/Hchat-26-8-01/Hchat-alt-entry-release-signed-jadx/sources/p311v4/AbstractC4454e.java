package p311v4;

import com.alibaba.fastjson2.JSONB;
import p326w4.C4681a;
import p326w4.C4683c;

/* JADX INFO: renamed from: v4.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4454e extends AbstractC4474w {

    /* JADX INFO: renamed from: i */
    public final C4681a f14786i;

    /* JADX INFO: renamed from: j */
    public C4681a f14787j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC4454e(C4453d0 c4453d0, C4477z c4477z) {
        super(c4453d0, c4477z);
        String str = c4477z.f14828h.f14760g;
        if (m8905k()) {
            this.f14786i = C4681a.m9173b(str);
        } else {
            this.f14786i = C4681a.m9174d(str);
        }
        this.f14787j = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4474w, p311v4.AbstractC4446a
    /* JADX INFO: renamed from: e */
    public final int mo8896e(AbstractC4446a abstractC4446a) {
        int iMo8896e = super.mo8896e(abstractC4446a);
        return iMo8896e != 0 ? iMo8896e : this.f14786i.compareTo(((AbstractC4454e) abstractC4446a).f14786i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p326w4.InterfaceC4684d
    public final C4683c getType() {
        return this.f14786i.f15570h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: k */
    public final boolean m8905k() {
        C4453d0 c4453d0 = C4453d0.f14764B;
        C4453d0 c4453d02 = this.f14821g;
        boolean zEquals = c4453d02.equals(c4453d0);
        C4477z c4477z = this.f14822h;
        if (zEquals) {
            String str = c4477z.f14827g.f14760g;
            str.getClass();
            if (str.equals("invoke") || str.equals("invokeExact")) {
                return true;
            }
        } else if (c4453d02.equals(C4453d0.f14765C)) {
            String str2 = c4477z.f14827g.f14760g;
            str2.getClass();
            byte b10 = -1;
            switch (str2.hashCode()) {
                case -1946504908:
                    if (str2.equals("getAndBitwiseOrRelease")) {
                        b10 = 0;
                    }
                    break;
                case -1686727776:
                    if (str2.equals("getAndBitwiseAndRelease")) {
                        b10 = 1;
                    }
                    break;
                case -1671098288:
                    if (str2.equals("compareAndSet")) {
                        b10 = 2;
                    }
                    break;
                case -1292078254:
                    if (str2.equals("compareAndExchangeRelease")) {
                        b10 = 3;
                    }
                    break;
                case -1117944904:
                    if (str2.equals("weakCompareAndSet")) {
                        b10 = 4;
                    }
                    break;
                case -1103072857:
                    if (str2.equals("getAndAddRelease")) {
                        b10 = 5;
                    }
                    break;
                case -1032914329:
                    if (str2.equals("getAndBitwiseAnd")) {
                        b10 = 6;
                    }
                    break;
                case -1032892181:
                    if (str2.equals("getAndBitwiseXor")) {
                        b10 = 7;
                    }
                    break;
                case -794517348:
                    if (str2.equals("getAndBitwiseXorRelease")) {
                        b10 = 8;
                    }
                    break;
                case -567150350:
                    if (str2.equals("weakCompareAndSetPlain")) {
                        b10 = 9;
                    }
                    break;
                case -240822786:
                    if (str2.equals("weakCompareAndSetAcquire")) {
                        b10 = 10;
                    }
                    break;
                case -230706875:
                    if (str2.equals("setRelease")) {
                        b10 = 11;
                    }
                    break;
                case -127361888:
                    if (str2.equals("getAcquire")) {
                        b10 = 12;
                    }
                    break;
                case -37641530:
                    if (str2.equals("getAndSetRelease")) {
                        b10 = 13;
                    }
                    break;
                case 102230:
                    if (str2.equals("get")) {
                        b10 = 14;
                    }
                    break;
                case 113762:
                    if (str2.equals("set")) {
                        b10 = 15;
                    }
                    break;
                case 93645315:
                    if (str2.equals("getAndBitwiseOrAcquire")) {
                        b10 = JSONB.Constants.BC_INT32_NUM_16;
                    }
                    break;
                case 101293086:
                    if (str2.equals("setVolatile")) {
                        b10 = 17;
                    }
                    break;
                case 189872914:
                    if (str2.equals("getVolatile")) {
                        b10 = 18;
                    }
                    break;
                case 282707520:
                    if (str2.equals("getAndAdd")) {
                        b10 = 19;
                    }
                    break;
                case 282724865:
                    if (str2.equals("getAndSet")) {
                        b10 = 20;
                    }
                    break;
                case 353422447:
                    if (str2.equals("getAndBitwiseAndAcquire")) {
                        b10 = 21;
                    }
                    break;
                case 470702883:
                    if (str2.equals("setOpaque")) {
                        b10 = 22;
                    }
                    break;
                case 685319959:
                    if (str2.equals("getOpaque")) {
                        b10 = 23;
                    }
                    break;
                case 748071969:
                    if (str2.equals("compareAndExchangeAcquire")) {
                        b10 = 24;
                    }
                    break;
                case 937077366:
                    if (str2.equals("getAndAddAcquire")) {
                        b10 = 25;
                    }
                    break;
                case 1245632875:
                    if (str2.equals("getAndBitwiseXorAcquire")) {
                        b10 = 26;
                    }
                    break;
                case 1352153939:
                    if (str2.equals("getAndBitwiseOr")) {
                        b10 = 27;
                    }
                    break;
                case 1483964149:
                    if (str2.equals("compareAndExchange")) {
                        b10 = 28;
                    }
                    break;
                case 2002508693:
                    if (str2.equals("getAndSetAcquire")) {
                        b10 = 29;
                    }
                    break;
                case 2013994287:
                    if (str2.equals("weakCompareAndSetRelease")) {
                        b10 = 30;
                    }
                    break;
            }
            switch (b10) {
            }
            return true;
        }
        return false;
    }
}

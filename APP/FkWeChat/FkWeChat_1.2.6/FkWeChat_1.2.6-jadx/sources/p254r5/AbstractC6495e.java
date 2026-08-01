package p254r5;

import com.alibaba.fastjson2.JSONB;
import p269s5.C7186a;
import p269s5.C7188c;

/* JADX INFO: renamed from: r5.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6495e extends AbstractC6518w {

    /* JADX INFO: renamed from: s */
    public final C7186a f20381s;

    /* JADX INFO: renamed from: t */
    public C7186a f20382t;

    public AbstractC6495e(C6496e0 c6496e0, C6521z c6521z) {
        super(c6496e0, c6521z);
        String strM25741n = m25803n().m25812k().m25741n();
        if (m25755w()) {
            this.f20381s = C7186a.m28378c(strM25741n);
        } else {
            this.f20381s = C7186a.m28379k(strM25741n);
        }
        this.f20382t = null;
    }

    @Override // p254r5.AbstractC6518w, p254r5.AbstractC6487a
    /* JADX INFO: renamed from: c */
    public final int mo25727c(AbstractC6487a abstractC6487a) {
        int iMo25727c = super.mo25727c(abstractC6487a);
        return iMo25727c != 0 ? iMo25727c : this.f20381s.compareTo(((AbstractC6495e) abstractC6487a).f20381s);
    }

    @Override // p269s5.InterfaceC7189d
    public final C7188c getType() {
        return this.f20381s.m28388j();
    }

    /* JADX INFO: renamed from: p */
    public final int m25750p(boolean z10) {
        return m25752t(z10).m28387i().m28399H();
    }

    /* JADX INFO: renamed from: s */
    public final C7186a m25751s() {
        return this.f20381s;
    }

    /* JADX INFO: renamed from: t */
    public final C7186a m25752t(boolean z10) {
        if (z10) {
            return this.f20381s;
        }
        if (this.f20382t == null) {
            this.f20382t = this.f20381s.m28389r(m25802k().m25760n());
        }
        return this.f20382t;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m25753u() {
        return m25803n().m25815s();
    }

    /* JADX INFO: renamed from: v */
    public final boolean m25754v() {
        return m25803n().m25816t();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: w */
    public final boolean m25755w() {
        C6496e0 c6496e0M25802k = m25802k();
        if (c6496e0M25802k.equals(C6496e0.f20394L)) {
            String strM25741n = m25803n().m25814p().m25741n();
            strM25741n.getClass();
            if (strM25741n.equals("invoke") || strM25741n.equals("invokeExact")) {
                return true;
            }
        } else if (c6496e0M25802k.equals(C6496e0.f20395M)) {
            String strM25741n2 = m25803n().m25814p().m25741n();
            strM25741n2.getClass();
            byte b10 = -1;
            switch (strM25741n2.hashCode()) {
                case -1946504908:
                    if (strM25741n2.equals("getAndBitwiseOrRelease")) {
                        b10 = 0;
                    }
                    break;
                case -1686727776:
                    if (strM25741n2.equals("getAndBitwiseAndRelease")) {
                        b10 = 1;
                    }
                    break;
                case -1671098288:
                    if (strM25741n2.equals("compareAndSet")) {
                        b10 = 2;
                    }
                    break;
                case -1292078254:
                    if (strM25741n2.equals("compareAndExchangeRelease")) {
                        b10 = 3;
                    }
                    break;
                case -1117944904:
                    if (strM25741n2.equals("weakCompareAndSet")) {
                        b10 = 4;
                    }
                    break;
                case -1103072857:
                    if (strM25741n2.equals("getAndAddRelease")) {
                        b10 = 5;
                    }
                    break;
                case -1032914329:
                    if (strM25741n2.equals("getAndBitwiseAnd")) {
                        b10 = 6;
                    }
                    break;
                case -1032892181:
                    if (strM25741n2.equals("getAndBitwiseXor")) {
                        b10 = 7;
                    }
                    break;
                case -794517348:
                    if (strM25741n2.equals("getAndBitwiseXorRelease")) {
                        b10 = 8;
                    }
                    break;
                case -567150350:
                    if (strM25741n2.equals("weakCompareAndSetPlain")) {
                        b10 = 9;
                    }
                    break;
                case -240822786:
                    if (strM25741n2.equals("weakCompareAndSetAcquire")) {
                        b10 = 10;
                    }
                    break;
                case -230706875:
                    if (strM25741n2.equals("setRelease")) {
                        b10 = 11;
                    }
                    break;
                case -127361888:
                    if (strM25741n2.equals("getAcquire")) {
                        b10 = 12;
                    }
                    break;
                case -37641530:
                    if (strM25741n2.equals("getAndSetRelease")) {
                        b10 = 13;
                    }
                    break;
                case 102230:
                    if (strM25741n2.equals("get")) {
                        b10 = 14;
                    }
                    break;
                case 113762:
                    if (strM25741n2.equals("set")) {
                        b10 = 15;
                    }
                    break;
                case 93645315:
                    if (strM25741n2.equals("getAndBitwiseOrAcquire")) {
                        b10 = JSONB.Constants.BC_INT32_NUM_16;
                    }
                    break;
                case 101293086:
                    if (strM25741n2.equals("setVolatile")) {
                        b10 = 17;
                    }
                    break;
                case 189872914:
                    if (strM25741n2.equals("getVolatile")) {
                        b10 = 18;
                    }
                    break;
                case 282707520:
                    if (strM25741n2.equals("getAndAdd")) {
                        b10 = 19;
                    }
                    break;
                case 282724865:
                    if (strM25741n2.equals("getAndSet")) {
                        b10 = 20;
                    }
                    break;
                case 353422447:
                    if (strM25741n2.equals("getAndBitwiseAndAcquire")) {
                        b10 = 21;
                    }
                    break;
                case 470702883:
                    if (strM25741n2.equals("setOpaque")) {
                        b10 = 22;
                    }
                    break;
                case 685319959:
                    if (strM25741n2.equals("getOpaque")) {
                        b10 = 23;
                    }
                    break;
                case 748071969:
                    if (strM25741n2.equals("compareAndExchangeAcquire")) {
                        b10 = 24;
                    }
                    break;
                case 937077366:
                    if (strM25741n2.equals("getAndAddAcquire")) {
                        b10 = 25;
                    }
                    break;
                case 1245632875:
                    if (strM25741n2.equals("getAndBitwiseXorAcquire")) {
                        b10 = 26;
                    }
                    break;
                case 1352153939:
                    if (strM25741n2.equals("getAndBitwiseOr")) {
                        b10 = 27;
                    }
                    break;
                case 1483964149:
                    if (strM25741n2.equals("compareAndExchange")) {
                        b10 = 28;
                    }
                    break;
                case 2002508693:
                    if (strM25741n2.equals("getAndSetAcquire")) {
                        b10 = 29;
                    }
                    break;
                case 2013994287:
                    if (strM25741n2.equals("weakCompareAndSetRelease")) {
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

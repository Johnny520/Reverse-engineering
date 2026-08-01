package p239q5;

import bsh.C1259t2;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import p239q5.AbstractC6257h;
import p254r5.C6488a0;
import p254r5.C6492c0;
import p254r5.C6496e0;
import p254r5.C6520y;
import p254r5.C6521z;
import p269s5.C7188c;
import p269s5.InterfaceC7190e;
import p376zd.C9987e;
import p376zd.C9993h;

/* JADX INFO: renamed from: q5.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C6259j extends AbstractC6257h {

    /* JADX INFO: renamed from: u */
    public final InterfaceC7190e f19423u;

    /* JADX INFO: renamed from: v */
    public final C6520y f19424v;

    /* JADX INFO: renamed from: w */
    public final C6520y f19425w;

    /* JADX INFO: renamed from: x */
    public final C6488a0 f19426x;

    /* JADX INFO: renamed from: y */
    public static final C6492c0 f19421y = new C6492c0("([Ljava/lang/Object;)Ljava/lang/Object;");

    /* JADX INFO: renamed from: z */
    public static final C6492c0 f19422z = new C6492c0("([Ljava/lang/Object;)V");

    /* JADX INFO: renamed from: A */
    public static final C6492c0 f19420A = new C6492c0("([Ljava/lang/Object;)Z");

    public C6259j(C6270u c6270u, C6274y c6274y, C6268s c6268s, InterfaceC7190e interfaceC7190e, C6520y c6520y) {
        super(c6270u, c6274y, null, c6268s);
        if (c6270u.m24796b() != 6) {
            C6264o.m24729a("opcode with invalid branchingness: ", c6270u.m24796b());
            throw null;
        }
        if (interfaceC7190e == null) {
            C1259t2.m5095a("catches == null");
            throw null;
        }
        this.f19423u = interfaceC7190e;
        if (c6520y == null) {
            C1259t2.m5095a("callSiteMethod == null");
            throw null;
        }
        if (!c6520y.m25755w()) {
            C9987e.m38645a("callSiteMethod is not signature polymorphic");
            throw null;
        }
        this.f19424v = c6520y;
        this.f19425w = m24708z(c6520y);
        this.f19426x = m24707y(c6520y);
    }

    /* JADX INFO: renamed from: y */
    public static C6488a0 m24707y(C6520y c6520y) {
        return new C6488a0(c6520y.m25752t(true));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: z */
    public static C6520y m24708z(C6520y c6520y) {
        C6496e0 c6496e0M25802k = c6520y.m25802k();
        C6492c0 c6492c0M25814p = c6520y.m25803n().m25814p();
        String strM25741n = c6520y.m25803n().m25814p().m25741n();
        if (c6496e0M25802k.equals(C6496e0.f20394L) && (strM25741n.equals("invoke") || strM25741n.equals("invokeExact"))) {
            return new C6520y(c6496e0M25802k, new C6521z(c6492c0M25814p, f19421y));
        }
        if (c6496e0M25802k.equals(C6496e0.f20395M)) {
            strM25741n.getClass();
            byte b10 = -1;
            switch (strM25741n.hashCode()) {
                case -1946504908:
                    if (strM25741n.equals("getAndBitwiseOrRelease")) {
                        b10 = 0;
                    }
                    break;
                case -1686727776:
                    if (strM25741n.equals("getAndBitwiseAndRelease")) {
                        b10 = 1;
                    }
                    break;
                case -1671098288:
                    if (strM25741n.equals("compareAndSet")) {
                        b10 = 2;
                    }
                    break;
                case -1292078254:
                    if (strM25741n.equals("compareAndExchangeRelease")) {
                        b10 = 3;
                    }
                    break;
                case -1117944904:
                    if (strM25741n.equals("weakCompareAndSet")) {
                        b10 = 4;
                    }
                    break;
                case -1103072857:
                    if (strM25741n.equals("getAndAddRelease")) {
                        b10 = 5;
                    }
                    break;
                case -1032914329:
                    if (strM25741n.equals("getAndBitwiseAnd")) {
                        b10 = 6;
                    }
                    break;
                case -1032892181:
                    if (strM25741n.equals("getAndBitwiseXor")) {
                        b10 = 7;
                    }
                    break;
                case -794517348:
                    if (strM25741n.equals("getAndBitwiseXorRelease")) {
                        b10 = 8;
                    }
                    break;
                case -567150350:
                    if (strM25741n.equals("weakCompareAndSetPlain")) {
                        b10 = 9;
                    }
                    break;
                case -240822786:
                    if (strM25741n.equals("weakCompareAndSetAcquire")) {
                        b10 = 10;
                    }
                    break;
                case -230706875:
                    if (strM25741n.equals("setRelease")) {
                        b10 = 11;
                    }
                    break;
                case -127361888:
                    if (strM25741n.equals("getAcquire")) {
                        b10 = 12;
                    }
                    break;
                case -37641530:
                    if (strM25741n.equals("getAndSetRelease")) {
                        b10 = 13;
                    }
                    break;
                case 102230:
                    if (strM25741n.equals("get")) {
                        b10 = 14;
                    }
                    break;
                case 113762:
                    if (strM25741n.equals("set")) {
                        b10 = 15;
                    }
                    break;
                case 93645315:
                    if (strM25741n.equals("getAndBitwiseOrAcquire")) {
                        b10 = JSONB.Constants.BC_INT32_NUM_16;
                    }
                    break;
                case 101293086:
                    if (strM25741n.equals("setVolatile")) {
                        b10 = 17;
                    }
                    break;
                case 189872914:
                    if (strM25741n.equals("getVolatile")) {
                        b10 = 18;
                    }
                    break;
                case 282707520:
                    if (strM25741n.equals("getAndAdd")) {
                        b10 = 19;
                    }
                    break;
                case 282724865:
                    if (strM25741n.equals("getAndSet")) {
                        b10 = 20;
                    }
                    break;
                case 353422447:
                    if (strM25741n.equals("getAndBitwiseAndAcquire")) {
                        b10 = 21;
                    }
                    break;
                case 470702883:
                    if (strM25741n.equals("setOpaque")) {
                        b10 = 22;
                    }
                    break;
                case 685319959:
                    if (strM25741n.equals("getOpaque")) {
                        b10 = 23;
                    }
                    break;
                case 748071969:
                    if (strM25741n.equals("compareAndExchangeAcquire")) {
                        b10 = 24;
                    }
                    break;
                case 937077366:
                    if (strM25741n.equals("getAndAddAcquire")) {
                        b10 = 25;
                    }
                    break;
                case 1245632875:
                    if (strM25741n.equals("getAndBitwiseXorAcquire")) {
                        b10 = 26;
                    }
                    break;
                case 1352153939:
                    if (strM25741n.equals("getAndBitwiseOr")) {
                        b10 = 27;
                    }
                    break;
                case 1483964149:
                    if (strM25741n.equals("compareAndExchange")) {
                        b10 = 28;
                    }
                    break;
                case 2002508693:
                    if (strM25741n.equals("getAndSetAcquire")) {
                        b10 = 29;
                    }
                    break;
                case 2013994287:
                    if (strM25741n.equals("weakCompareAndSetRelease")) {
                        b10 = 30;
                    }
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
                case Opcodes.FCONST_1 /* 12 */:
                case Opcodes.FCONST_2 /* 13 */:
                case Opcodes.DCONST_0 /* 14 */:
                case 16:
                case Opcodes.LDC /* 18 */:
                case 19:
                case 20:
                case Opcodes.ILOAD /* 21 */:
                case Opcodes.FLOAD /* 23 */:
                case Opcodes.DLOAD /* 24 */:
                case Opcodes.ALOAD /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                    return new C6520y(c6496e0M25802k, new C6521z(c6492c0M25814p, f19421y));
                case 2:
                case 4:
                case 9:
                case 10:
                case 30:
                    return new C6520y(c6496e0M25802k, new C6521z(c6492c0M25814p, f19420A));
                case Opcodes.FCONST_0 /* 11 */:
                case 15:
                case Opcodes.SIPUSH /* 17 */:
                case Opcodes.LLOAD /* 22 */:
                    return new C6520y(c6496e0M25802k, new C6521z(c6492c0M25814p, f19422z));
            }
        }
        C9993h.m38666a("Unknown signature polymorphic method: ", c6520y.mo6828g());
        return null;
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: a */
    public void mo24658a(AbstractC6257h.b bVar) {
        bVar.mo15704b(this);
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: e */
    public InterfaceC7190e mo24659e() {
        return this.f19423u;
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: f */
    public String mo24660f() {
        return m24711x().toString() + " " + m24710w().toString() + " " + C6250b0.m24671v(this.f19423u);
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: s */
    public AbstractC6257h mo24661s(C7188c c7188c) {
        return new C6259j(m24695j(), m24696k(), m24698o(), this.f19423u.mo8384h(c7188c), m24709v());
    }

    @Override // p239q5.AbstractC6257h
    /* JADX INFO: renamed from: t */
    public AbstractC6257h mo24662t(C6267r c6267r, C6268s c6268s) {
        return new C6259j(m24695j(), m24696k(), c6268s, this.f19423u, m24709v());
    }

    /* JADX INFO: renamed from: v */
    public C6520y m24709v() {
        return this.f19424v;
    }

    /* JADX INFO: renamed from: w */
    public C6488a0 m24710w() {
        return this.f19426x;
    }

    /* JADX INFO: renamed from: x */
    public C6520y m24711x() {
        return this.f19425w;
    }
}

package p254r5;

import ae.C0306e;
import p269s5.C7188c;
import p376zd.C9993h;

/* JADX INFO: renamed from: r5.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6519x extends AbstractC6500g0 {

    /* JADX INFO: renamed from: s */
    public static final String[] f20441s = {"static-put", "static-get", "instance-put", "instance-get", "invoke-static", "invoke-instance", "invoke-constructor", "invoke-direct", "invoke-interface"};

    /* JADX INFO: renamed from: q */
    public final int f20442q;

    /* JADX INFO: renamed from: r */
    public final AbstractC6487a f20443r;

    public C6519x(int i10, AbstractC6487a abstractC6487a) {
        this.f20442q = i10;
        this.f20443r = abstractC6487a;
    }

    /* JADX INFO: renamed from: n */
    public static String m25804n(int i10) {
        return f20441s[i10];
    }

    /* JADX INFO: renamed from: t */
    public static boolean m25805t(int i10) {
        return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m25806v(int i10) {
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: w */
    public static C6519x m25807w(int i10, AbstractC6487a abstractC6487a) {
        if (m25805t(i10)) {
            if (!(abstractC6487a instanceof C6508m)) {
                C9993h.m38666a("ref has wrong type: ", abstractC6487a.getClass());
                return null;
            }
        } else {
            if (!m25806v(i10)) {
                C0306e.m922a("type is out of range: ", i10);
                return null;
            }
            if (!(abstractC6487a instanceof AbstractC6495e)) {
                C9993h.m38666a("ref has wrong type: ", abstractC6487a.getClass());
                return null;
            }
        }
        return new C6519x(i10, abstractC6487a);
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: c */
    public int mo25727c(AbstractC6487a abstractC6487a) {
        C6519x c6519x = (C6519x) abstractC6487a;
        return m25808k() == c6519x.m25808k() ? m25809p().compareTo(c6519x.m25809p()) : Integer.compare(m25808k(), c6519x.m25808k());
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return m25804n(this.f20442q) + "," + this.f20443r.toString();
    }

    @Override // p269s5.InterfaceC7189d
    public C7188c getType() {
        return C7188c.f23834M;
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: h */
    public boolean mo25728h() {
        return false;
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: j */
    public String mo25729j() {
        return "method handle";
    }

    /* JADX INFO: renamed from: k */
    public int m25808k() {
        return this.f20442q;
    }

    /* JADX INFO: renamed from: p */
    public AbstractC6487a m25809p() {
        return this.f20443r;
    }

    /* JADX INFO: renamed from: s */
    public boolean m25810s() {
        return m25805t(this.f20442q);
    }

    public String toString() {
        return "method-handle{" + mo6828g() + "}";
    }

    /* JADX INFO: renamed from: u */
    public boolean m25811u() {
        return m25806v(this.f20442q);
    }
}

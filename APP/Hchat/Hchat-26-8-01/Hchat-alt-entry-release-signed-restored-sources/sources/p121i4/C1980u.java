package p121i4;

import bsh.C0353j;
import okio.C3193a;
import p000a.AbstractC0000a;
import p295u4.C4265o;
import p326w4.C4683c;
import p326w4.InterfaceC4684d;
import p343x6.AbstractC5700d;

/* JADX INFO: renamed from: i4.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1980u extends AbstractC1978s {

    /* JADX INFO: renamed from: h */
    public final InterfaceC4684d[] f6708h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1980u(int i9) {
        super(i9 != 0);
        this.f6708h = new InterfaceC4684d[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final String mo4901a() {
        StringBuilder sb2 = new StringBuilder();
        int i9 = 0;
        while (true) {
            InterfaceC4684d[] interfaceC4684dArr = this.f6708h;
            if (i9 >= interfaceC4684dArr.length) {
                return sb2.toString();
            }
            InterfaceC4684d interfaceC4684d = interfaceC4684dArr[i9];
            sb2.append("locals[" + AbstractC0000a.m46X0(i9) + "]: " + (interfaceC4684d == null ? "<invalid>" : interfaceC4684d.toString()) + "\n");
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.AbstractC1978s
    /* JADX INFO: renamed from: l */
    public final void mo4892l(C1960b0 c1960b0) {
        int i9 = 0;
        while (true) {
            InterfaceC4684d[] interfaceC4684dArr = this.f6708h;
            if (i9 >= interfaceC4684dArr.length) {
                return;
            }
            InterfaceC4684d interfaceC4684d = interfaceC4684dArr[i9];
            c1960b0.m2687a("locals[" + AbstractC0000a.m46X0(i9) + "]: " + (interfaceC4684d == null ? "<invalid>" : interfaceC4684d.toString()));
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.AbstractC1978s
    /* JADX INFO: renamed from: m */
    public final AbstractC1978s mo4893m() {
        InterfaceC4684d[] interfaceC4684dArr = this.f6708h;
        C1980u c1980u = new C1980u(interfaceC4684dArr.length);
        System.arraycopy(interfaceC4684dArr, 0, c1980u.f6708h, 0, interfaceC4684dArr.length);
        return c1980u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.AbstractC1978s
    /* JADX INFO: renamed from: n */
    public final InterfaceC4684d mo4894n(int i9) {
        InterfaceC4684d interfaceC4684d = this.f6708h[i9];
        if (interfaceC4684d != null) {
            return interfaceC4684d;
        }
        throw new C1960b0("local " + AbstractC0000a.m46X0(i9) + ": invalid", null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.AbstractC1978s
    /* JADX INFO: renamed from: p */
    public final void mo4896p(C4683c c4683c) {
        InterfaceC4684d[] interfaceC4684dArr = this.f6708h;
        int length = interfaceC4684dArr.length;
        if (length == 0) {
            return;
        }
        m10855j();
        C4683c c4683cM9191l = c4683c.m9191l();
        for (int i9 = 0; i9 < length; i9++) {
            if (interfaceC4684dArr[i9] == c4683c) {
                interfaceC4684dArr[i9] = c4683cM9191l;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.AbstractC1978s
    /* JADX INFO: renamed from: q */
    public final AbstractC1978s mo4897q(AbstractC1978s abstractC1978s) {
        return abstractC1978s instanceof C1980u ? m4904u((C1980u) abstractC1978s) : abstractC1978s.mo4897q(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.AbstractC1978s
    /* JADX INFO: renamed from: r */
    public final C1979t mo4898r(AbstractC1978s abstractC1978s, int i9) {
        return new C1979t(this.f6708h.length).mo4898r(abstractC1978s, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.AbstractC1978s
    /* JADX INFO: renamed from: s */
    public final void mo4899s(int i9, InterfaceC4684d interfaceC4684d) {
        int i10;
        InterfaceC4684d interfaceC4684d2;
        m10855j();
        try {
            InterfaceC4684d interfaceC4684dMo4908g = interfaceC4684d.mo4908g();
            if (i9 < 0) {
                C3193a.m6820i("idx < 0");
                return;
            }
            boolean zM9194r = interfaceC4684dMo4908g.getType().m9194r();
            InterfaceC4684d[] interfaceC4684dArr = this.f6708h;
            if (zM9194r) {
                interfaceC4684dArr[i9 + 1] = null;
            }
            interfaceC4684dArr[i9] = interfaceC4684dMo4908g;
            if (i9 == 0 || (interfaceC4684d2 = interfaceC4684dArr[i9 - 1]) == null || !interfaceC4684d2.getType().m9194r()) {
                return;
            }
            interfaceC4684dArr[i10] = null;
        } catch (NullPointerException unused) {
            C0353j.m1305c("type == null");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.AbstractC1978s
    /* JADX INFO: renamed from: t */
    public final void mo4900t(C4265o c4265o) {
        mo4899s(c4265o.f13965g, c4265o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final C1980u m4904u(C1980u c1980u) {
        try {
            return AbstractC5700d.m10256M(this, c1980u);
        } catch (C1960b0 e6) {
            e6.m2687a("underlay locals:");
            mo4892l(e6);
            e6.m2687a("overlay locals:");
            c1980u.mo4892l(e6);
            throw e6;
        }
    }

    @Override // p121i4.AbstractC1978s
    /* JADX INFO: renamed from: o */
    public final C1980u mo4895o() {
        return this;
    }
}

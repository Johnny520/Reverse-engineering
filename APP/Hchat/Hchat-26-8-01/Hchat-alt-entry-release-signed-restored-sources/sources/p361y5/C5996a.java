package p361y5;

import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p074f5.EnumC1070f;
import p136j8.C2104o;
import p283t5.InterfaceC4121d;
import p296u5.InterfaceC4273a;

/* JADX INFO: renamed from: y5.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5996a implements InterfaceC4273a, InterfaceC4121d {

    /* JADX INFO: renamed from: a */
    public final EnumC1070f f24359a;

    /* JADX INFO: renamed from: b */
    public final int f24360b;

    /* JADX INFO: renamed from: c */
    public final int f24361c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5996a(EnumC1070f enumC1070f, int i9, int i10) {
        int iM10737t = m10737t();
        if (enumC1070f.f3448m != iM10737t) {
            C2104o.m5294t(AbstractC0255e.m1021j("Invalid opcode ", enumC1070f.f3444i, " for ", AbstractC0921a.m2237B(iM10737t)));
            throw null;
        }
        this.f24359a = enumC1070f;
        if ((i9 & (-256)) != 0) {
            C0086a.m458q("Invalid register: v%d. Must be between v0 and v255, inclusive.", new Object[]{Integer.valueOf(i9)});
        }
        this.f24360b = i9;
        this.f24361c = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p283t5.InterfaceC4121d
    /* JADX INFO: renamed from: c */
    public int mo5877c() {
        return AbstractC0921a.m2240c(m10737t()) / 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p283t5.InterfaceC4124g
    /* JADX INFO: renamed from: h */
    public final int mo5885h() {
        return this.f24360b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p283t5.InterfaceC4121d
    /* JADX INFO: renamed from: i */
    public final EnumC1070f mo5878i() {
        return this.f24359a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p283t5.InterfaceC4123f
    /* JADX INFO: renamed from: l */
    public final int mo5882l() {
        return this.f24361c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final int m10737t() {
        return 23;
    }
}

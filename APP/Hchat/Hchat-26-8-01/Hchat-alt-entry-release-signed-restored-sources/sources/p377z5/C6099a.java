package p377z5;

import p122i5.AbstractC1986a;

/* JADX INFO: renamed from: z5.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6099a extends AbstractC1986a {

    /* JADX INFO: renamed from: j */
    public final String f24614j;

    /* JADX INFO: renamed from: k */
    public final String f24615k;

    /* JADX INFO: renamed from: l */
    public final String f24616l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6099a(String str, String str2, String str3) {
        this.f24614j = str;
        this.f24615k = str2;
        this.f24616l = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g1 */
    public static C6099a m10857g1(AbstractC1986a abstractC1986a) {
        return abstractC1986a instanceof C6099a ? (C6099a) abstractC1986a : new C6099a(abstractC1986a.mo4927f1(), abstractC1986a.getName(), abstractC1986a.getType());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p122i5.AbstractC1986a
    /* JADX INFO: renamed from: f1 */
    public final String mo4927f1() {
        return this.f24614j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p122i5.AbstractC1986a
    public final String getName() {
        return this.f24615k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p122i5.AbstractC1986a
    public final String getType() {
        return this.f24616l;
    }
}

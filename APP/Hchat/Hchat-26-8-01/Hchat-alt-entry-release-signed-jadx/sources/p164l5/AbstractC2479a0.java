package p164l5;

import p068eh.AbstractC0921a;
import p074f5.EnumC1070f;
import p150k5.C2270u;
import p283t5.InterfaceC4121d;

/* JADX INFO: renamed from: l5.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2479a0 implements InterfaceC4121d {

    /* JADX INFO: renamed from: a */
    public final C2270u f8116a;

    /* JADX INFO: renamed from: b */
    public final EnumC1070f f8117b;

    /* JADX INFO: renamed from: c */
    public final int f8118c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC2479a0(C2270u c2270u, EnumC1070f enumC1070f, int i9) {
        this.f8116a = c2270u;
        this.f8117b = enumC1070f;
        this.f8118c = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p283t5.InterfaceC4121d
    /* JADX INFO: renamed from: c */
    public int mo5877c() {
        return AbstractC0921a.m2240c(this.f8117b.f3448m) / 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p283t5.InterfaceC4121d
    /* JADX INFO: renamed from: i */
    public final EnumC1070f mo5878i() {
        return this.f8117b;
    }
}

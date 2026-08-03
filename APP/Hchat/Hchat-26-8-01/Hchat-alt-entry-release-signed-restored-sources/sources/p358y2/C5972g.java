package p358y2;

import gg.AbstractC1417m;
import p015b0.C0147m;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p293u2.EnumC4243m;

/* JADX INFO: renamed from: y2.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5972g extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C5989x f24270g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1220a f24271h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C5967c0 f24272i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f24273j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ EnumC4243m f24274k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5972g(C5989x c5989x, InterfaceC1220a interfaceC1220a, C5967c0 c5967c0, String str, EnumC4243m enumC4243m) {
        super(1);
        this.f24270g = c5989x;
        this.f24271h = interfaceC1220a;
        this.f24272i = c5967c0;
        this.f24273j = str;
        this.f24274k = enumC4243m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        C5989x c5989x = this.f24270g;
        c5989x.f24338v.addView(c5989x, c5989x.f24339w);
        c5989x.m10726o(this.f24271h, this.f24272i, this.f24273j, this.f24274k);
        return new C0147m(c5989x, 9);
    }
}

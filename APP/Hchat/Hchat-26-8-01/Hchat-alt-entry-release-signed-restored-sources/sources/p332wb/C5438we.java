package p332wb;

import p085fg.InterfaceC1231l;
import p218og.AbstractC3149m;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.we */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5438we implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21671g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f21672h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1231l f21673i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5438we(InterfaceC1231l interfaceC1231l, boolean z9) {
        this.f21673i = interfaceC1231l;
        this.f21672h = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f21671g) {
            case 0:
                String str = (String) obj;
                str.getClass();
                this.f21673i.invoke(AbstractC3149m.m6701P0(this.f21672h ? 19 : 9, str));
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                if (this.f21672h) {
                    this.f21673i.invoke(bool);
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5438we(boolean z9, InterfaceC1231l interfaceC1231l) {
        this.f21672h = z9;
        this.f21673i = interfaceC1231l;
    }
}

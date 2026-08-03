package re;

import java.util.function.Consumer;
import p121i4.C1962c0;
import p302ud.C4309e;

/* JADX INFO: renamed from: re.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3798a implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12479a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1962c0 f12480b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C4309e f12481c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3798a(C1962c0 c1962c0, C4309e c4309e, int i9) {
        this.f12479a = i9;
        this.f12480b = c1962c0;
        this.f12481c = c4309e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f12479a) {
            case 0:
                this.f12480b.m4860d(this.f12481c, (C4309e) obj);
                break;
            case 1:
                this.f12480b.m4860d(this.f12481c, (C4309e) obj);
                break;
            default:
                this.f12480b.m4860d(this.f12481c, (C4309e) obj);
                break;
        }
    }
}

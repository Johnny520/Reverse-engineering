package re;

import java.util.function.Consumer;
import p121i4.C1962c0;
import p246qd.AbstractC3506j;
import p302ud.C4309e;
import p302ud.C4322r;

/* JADX INFO: renamed from: re.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3799b implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12482a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1962c0 f12483b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C4322r f12484c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3799b(C1962c0 c1962c0, C4322r c4322r, int i9) {
        this.f12482a = i9;
        this.f12483b = c1962c0;
        this.f12484c = c4322r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f12482a) {
            case 0:
                this.f12483b.m4861e(this.f12484c, (AbstractC3506j) obj);
                break;
            case 1:
                this.f12483b.m4862f(this.f12484c, (C4309e) obj);
                break;
            default:
                this.f12483b.m4862f(this.f12484c, (C4309e) obj);
                break;
        }
    }
}

package ye;

import java.util.function.Consumer;
import p302ud.C4311g;

/* JADX INFO: renamed from: ye.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6031b implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24483a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C6034e f24484b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C6031b(C6034e c6034e, int i9) {
        this.f24483a = i9;
        this.f24484b = c6034e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        C4311g c4311g = (C4311g) obj;
        switch (this.f24483a) {
            case 0:
                this.f24484b.f24492b.put(c4311g.f14390l.f10147h, c4311g);
                break;
            default:
                this.f24484b.f24492b.put(c4311g.f14390l.f10147h, c4311g);
                break;
        }
    }
}

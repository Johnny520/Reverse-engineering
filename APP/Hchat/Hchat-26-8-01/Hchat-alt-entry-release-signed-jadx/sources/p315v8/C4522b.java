package p315v8;

import java.io.File;
import java.util.Iterator;
import ng.AbstractC3015m;
import ng.C3011i;
import ng.C3022t;
import p085fg.InterfaceC1220a;
import p259r9.C3766p;
import p276sf.C3967n;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: v8.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4522b implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f14911g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4537q f14912h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C4528h f14913i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4522b(C4528h c4528h, C4537q c4537q) {
        this.f14911g = 2;
        this.f14913i = c4528h;
        this.f14912h = c4537q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f14911g) {
            case 0:
                this.f14912h.m8960k(this.f14913i);
                break;
            case 1:
                C4528h c4528h = this.f14913i;
                C3022t c3022tM6413W = AbstractC3015m.m6413W(AbstractC3015m.m6409S(new C3011i(AbstractC4165l.m8376k0(new String[]{c4528h.f14953n, c4528h.f14954o}), true, new C3766p(16))), C4535o.f14967n);
                Iterator it = c3022tM6413W.f9822a.iterator();
                while (it.hasNext()) {
                    this.f14912h.m8955a((File) c3022tM6413W.f9823b.invoke(it.next()));
                }
                return C3967n.f12976a;
            case 2:
                C4528h c4528h2 = this.f14913i;
                if (c4528h2.f14956q) {
                    C4537q c4537q = this.f14912h;
                    if (c4537q.f14974e.contains(c4528h2.f14940a)) {
                        c4528h2.f14956q = false;
                        c4528h2.f14957r = true;
                        c4528h2.f14958s = "等待下载完成回调超时";
                        c4537q.m8960k(c4528h2);
                    }
                }
                return C3967n.f12976a;
            default:
                this.f14912h.m8960k(this.f14913i);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4522b(C4537q c4537q, C4528h c4528h, int i9) {
        this.f14911g = i9;
        this.f14912h = c4537q;
        this.f14913i = c4528h;
    }
}

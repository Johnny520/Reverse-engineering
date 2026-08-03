package p308v1;

import java.util.Map;
import p085fg.InterfaceC1231l;
import p339x1.C5602f0;
import p339x1.C5636q;

/* JADX INFO: renamed from: v1.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4379c0 implements InterfaceC4415o0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14600a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f14601b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f14602c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC1231l f14603d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C4382d0 f14604e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4400j0 f14605f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC1231l f14606g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4379c0(int i9, int i10, Map map, InterfaceC1231l interfaceC1231l, C4382d0 c4382d0, C4400j0 c4400j0, InterfaceC1231l interfaceC1231l2) {
        this.f14600a = i9;
        this.f14601b = i10;
        this.f14602c = map;
        this.f14603d = interfaceC1231l;
        this.f14604e = c4382d0;
        this.f14605f = c4400j0;
        this.f14606g = interfaceC1231l2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4415o0
    /* JADX INFO: renamed from: e */
    public final Map mo7599e() {
        return this.f14602c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4415o0
    /* JADX INFO: renamed from: f */
    public final void mo7600f() {
        C5636q c5636q;
        C5602f0 c5602f0 = this.f14605f.f14648g;
        boolean zMo8009u0 = this.f14604e.mo8009u0();
        InterfaceC1231l interfaceC1231l = this.f14606g;
        if (!zMo8009u0 || (c5636q = c5602f0.f22778L.f22716c.f22951Z) == null) {
            interfaceC1231l.invoke(c5602f0.f22778L.f22716c.f22925r);
        } else {
            interfaceC1231l.invoke(c5636q.f22925r);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4415o0
    /* JADX INFO: renamed from: g */
    public final int mo7601g() {
        return this.f14601b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4415o0
    /* JADX INFO: renamed from: h */
    public final int mo7602h() {
        return this.f14600a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4415o0
    /* JADX INFO: renamed from: i */
    public final InterfaceC1231l mo7612i() {
        return this.f14603d;
    }
}

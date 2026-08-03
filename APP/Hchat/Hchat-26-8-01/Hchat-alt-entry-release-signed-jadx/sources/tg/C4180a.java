package tg;

import p174m.C2571a;
import p370yf.AbstractC6038c;
import ug.C4346k;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: tg.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4180a extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public C4346k f13718g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f13719h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2571a f13720i;

    /* JADX INFO: renamed from: j */
    public int f13721j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4180a(C2571a c2571a, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f13720i = c2571a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f13719h = obj;
        this.f13721j |= Integer.MIN_VALUE;
        return this.f13720i.mo6025b(null, this);
    }
}

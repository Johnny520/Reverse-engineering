package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: jl */
/* JADX INFO: loaded from: classes.dex */
public final class C2107jl implements Iterable, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7406a;

    /* JADX INFO: renamed from: b */
    public final Object f7407b;

    public /* synthetic */ C2107jl(int i, Object obj) {
        this.f7406a = i;
        this.f7407b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f7406a) {
            case 0:
                return new C2694x(2, (Iterator) ((C0693Q4) this.f7407b).mo6a());
            default:
                return new C2456rd((C2499sd) this.f7407b);
        }
    }
}

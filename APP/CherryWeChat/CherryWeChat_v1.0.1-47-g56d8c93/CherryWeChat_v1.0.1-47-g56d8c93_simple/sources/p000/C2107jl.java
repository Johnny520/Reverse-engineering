package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: jl */
/* JADX INFO: loaded from: classes.dex */
public final class C2107jl implements Iterable, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7406a;

    /* JADX INFO: renamed from: b */
    public final Object f7407b;

    public /* synthetic */ C2107jl(int r1, Object r2) {
        this.f7406a = r1;
        this.f7407b = r2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch(this.f7406a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new C2456rd((C2499sd) this.f7407b);
    L7:
        return new C2694x(2, (Iterator) ((C0693Q4) this.f7407b).mo6a());
    }
}

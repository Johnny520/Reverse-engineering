package ga;

import java.util.Iterator;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5114x;
import p213oa.C5692c;
import p243q9.InterfaceC6333h;

/* JADX INFO: renamed from: ga.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2584f implements InterfaceC6333h {

    /* JADX INFO: renamed from: q */
    public final C5692c f6864q;

    public C2584f(C5692c c5692c) {
        c5692c.getClass();
        this.f6864q = c5692c;
    }

    @Override // p243q9.InterfaceC6333h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2581e mo3926b(C5692c c5692c) {
        c5692c.getClass();
        if (AbstractC1061t.m3842c(c5692c, this.f6864q)) {
            return C2581e.f6857a;
        }
        return null;
    }

    @Override // p243q9.InterfaceC6333h
    /* JADX INFO: renamed from: i */
    public boolean mo3927i(C5692c c5692c) {
        return InterfaceC6333h.b.m25006b(this, c5692c);
    }

    @Override // p243q9.InterfaceC6333h
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return AbstractC5114x.m20800o().iterator();
    }
}

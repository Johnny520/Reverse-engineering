package p040V0;

import java.util.Iterator;
import p033R0.InterfaceC0319a;
import p042W0.C0418c;

/* JADX INFO: renamed from: V0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0409l implements Iterable, InterfaceC0319a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0405h f909a;

    public C0409l(C0418c r1) {
        this.f909a = r1;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f909a.iterator();
    }
}

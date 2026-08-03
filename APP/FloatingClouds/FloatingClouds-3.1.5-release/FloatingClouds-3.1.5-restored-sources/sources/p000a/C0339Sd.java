package p000a;

import java.util.Iterator;
import p000a.C0330S4.a;

/* JADX INFO: renamed from: a.Sd */
/* JADX INFO: loaded from: classes.dex */
public final class C0339Sd implements Iterable<Object>, InterfaceC0783q9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0330S4 f1201a;

    public C0339Sd(C0330S4 c0330s4) {
        this.f1201a = c0330s4;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this.f1201a.new a();
    }
}

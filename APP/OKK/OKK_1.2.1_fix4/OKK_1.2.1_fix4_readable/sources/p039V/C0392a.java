package p039V;

import java.util.LinkedHashSet;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: V.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0392a implements InterfaceC0395d {

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f882a;

    public C0392a(C0396e c0396e) {
        AbstractC0307g.m703e(c0396e, "registry");
        this.f882a = new LinkedHashSet();
        c0396e.m983b("androidx.savedstate.Restarter", this);
    }
}

package p027E4;

import java.io.IOException;
import p117X2.AbstractC1665j;
import p208n4.AbstractC2710i;
import p208n4.C2706e;
import p208n4.InterfaceC2708g;

/* JADX INFO: renamed from: E4.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0339z extends AbstractC2710i {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0287A f1070e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0339z(C0287A c0287a, InterfaceC2708g interfaceC2708g) {
        super(interfaceC2708g);
        this.f1070e = c0287a;
    }

    @Override // p208n4.InterfaceC2722u
    /* JADX INFO: renamed from: y */
    public final long mo554y(C2706e c2706e, long j5) throws IOException {
        try {
            AbstractC1665j.m2985e(c2706e, "sink");
            return this.f8634d.mo554y(c2706e, 8192L);
        } catch (IOException e5) {
            this.f1070e.f919h = e5;
            throw e5;
        }
    }
}

package p160f3;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: f3.F */
/* JADX INFO: loaded from: classes.dex */
public final class C2103F implements InterfaceC2112O {

    /* JADX INFO: renamed from: d */
    public final boolean f7032d;

    public C2103F(boolean z5) {
        this.f7032d = z5;
    }

    @Override // p160f3.InterfaceC2112O
    /* JADX INFO: renamed from: b */
    public final boolean mo3886b() {
        return this.f7032d;
    }

    @Override // p160f3.InterfaceC2112O
    /* JADX INFO: renamed from: d */
    public final C2126b0 mo3887d() {
        return null;
    }

    public final String toString() {
        return AbstractC0231b.m402m(new StringBuilder("Empty{"), this.f7032d ? "Active" : "New", '}');
    }
}

package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: po */
/* JADX INFO: loaded from: classes.dex */
public final class C2381po implements InterfaceC2777yx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8379a;

    /* JADX INFO: renamed from: b */
    public final Object f8380b;

    public /* synthetic */ C2381po(int i, Object obj) {
        this.f8379a = i;
        this.f8380b = obj;
    }

    @Override // p000.InterfaceC2777yx
    public final Iterator iterator() {
        switch (this.f8379a) {
            case 0:
                return new C2330oo(this);
            default:
                return (Iterator) this.f8380b;
        }
    }
}

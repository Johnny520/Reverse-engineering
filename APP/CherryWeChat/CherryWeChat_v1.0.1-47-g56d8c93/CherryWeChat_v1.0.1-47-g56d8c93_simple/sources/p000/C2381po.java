package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: po */
/* JADX INFO: loaded from: classes.dex */
public final class C2381po implements InterfaceC2777yx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8379a;

    /* JADX INFO: renamed from: b */
    public final Object f8380b;

    public /* synthetic */ C2381po(int r1, Object r2) {
        this.f8379a = r1;
        this.f8380b = r2;
    }

    @Override // p000.InterfaceC2777yx
    public final Iterator iterator() {
        switch(this.f8379a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return (Iterator) this.f8380b;
    L7:
        return new C2330oo(this);
    }
}

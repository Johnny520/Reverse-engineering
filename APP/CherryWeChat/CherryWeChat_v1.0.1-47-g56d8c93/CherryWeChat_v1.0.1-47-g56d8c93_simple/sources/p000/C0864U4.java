package p000;

import android.content.res.AssetManager;

/* JADX INFO: renamed from: U4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0864U4 implements InterfaceC1233bs {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2732a;

    /* JADX INFO: renamed from: b */
    public final AssetManager f2733b;

    public /* synthetic */ C0864U4(AssetManager r1, int r2) {
        this.f2732a = r2;
        this.f2733b = r1;
    }

    @Override // p000.InterfaceC1233bs
    /* JADX INFO: renamed from: p */
    public final InterfaceC1189as mo88p(C2428qs r3) {
        switch(this.f2732a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new C0907V4(0, this.f2733b, this);
    L7:
        return new C0907V4(0, this.f2733b, this);
    }
}

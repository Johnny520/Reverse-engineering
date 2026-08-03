package p000;

import android.content.ContentResolver;

/* JADX INFO: renamed from: nD */
/* JADX INFO: loaded from: classes.dex */
public final class C2270nD implements InterfaceC1233bs {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7990a;

    /* JADX INFO: renamed from: b */
    public final ContentResolver f7991b;

    /* JADX INFO: renamed from: c */
    public final boolean f7992c;

    public /* synthetic */ C2270nD(ContentResolver r1, boolean r2, int r3) {
        this.f7990a = r3;
        this.f7991b = r1;
        this.f7992c = r2;
    }

    @Override // p000.InterfaceC1233bs
    /* JADX INFO: renamed from: p */
    public final InterfaceC1189as mo88p(C2428qs r1) {
        switch(this.f7990a) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return new C2313oD(this);
    L7:
        return new C2313oD(this);
    L9:
        return new C2313oD(this);
    }
}

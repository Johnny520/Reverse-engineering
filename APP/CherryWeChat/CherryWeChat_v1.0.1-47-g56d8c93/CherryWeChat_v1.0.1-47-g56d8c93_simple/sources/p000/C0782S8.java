package p000;

import io.github.cherrywechat.lua.api.CherryViewAPI;

/* JADX INFO: renamed from: S8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0782S8 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2468a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f2469b;

    public /* synthetic */ C0782S8(String r1, int r2) {
        this.f2468a = r2;
        this.f2469b = r1;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f2468a) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return CherryViewAPI.m3295e(this.f2469b);
    L7:
        return CherryViewAPI.m3304i0(this.f2469b);
    L9:
        return CherryViewAPI.m3282X(this.f2469b);
    L11:
        return CherryViewAPI.m3257I(this.f2469b);
    }
}

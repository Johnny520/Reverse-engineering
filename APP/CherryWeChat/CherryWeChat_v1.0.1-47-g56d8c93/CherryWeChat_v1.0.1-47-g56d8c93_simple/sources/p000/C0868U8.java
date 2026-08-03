package p000;

import io.github.cherrywechat.lua.api.CherryViewAPI;

/* JADX INFO: renamed from: U8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0868U8 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2743a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f2744b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f2745c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2746d;

    public /* synthetic */ C0868U8(String r1, int r2, int r3, int r4) {
        this.f2743a = r4;
        this.f2744b = r1;
        this.f2745c = r2;
        this.f2746d = r3;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f2743a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        int r0 = this.f2745c;
        int r1 = this.f2746d;
        return CherryViewAPI.m3249E(this.f2744b, r0, r1);
    L6:
        int r02 = this.f2745c;
        int r12 = this.f2746d;
        return CherryViewAPI.m3342z(this.f2744b, r02, r12);
    }
}

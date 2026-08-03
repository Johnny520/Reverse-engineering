package p000;

import io.github.cherrywechat.lua.api.CherryViewAPI;

/* JADX INFO: renamed from: O8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0611O8 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1957a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f1958b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f1959c;

    public /* synthetic */ C0611O8(int r1, String r2, String r3) {
        this.f1957a = r1;
        this.f1958b = r2;
        this.f1959c = r3;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f1957a) {
            case 0: goto L15;
            case 1: goto L13;
            case 2: goto L11;
            case 3: goto L9;
            case 4: goto L7;
            default: goto L5;
        };
    L5:
        return CherryViewAPI.m3331t0(this.f1958b, this.f1959c);
    L7:
        return CherryViewAPI.m3247D(this.f1958b, this.f1959c);
    L9:
        return CherryViewAPI.m3286a0(this.f1958b, this.f1959c);
    L11:
        return CherryViewAPI.m3336w(this.f1958b, this.f1959c);
    L13:
        return CherryViewAPI.m3302h0(this.f1958b, this.f1959c);
    L15:
        return CherryViewAPI.m3341y0(this.f1958b, this.f1959c);
    }
}

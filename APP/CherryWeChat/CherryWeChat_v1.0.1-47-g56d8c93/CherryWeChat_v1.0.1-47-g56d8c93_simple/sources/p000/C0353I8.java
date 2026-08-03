package p000;

import io.github.cherrywechat.lua.api.CherryThreadAPI;
import java.util.List;

/* JADX INFO: renamed from: I8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0353I8 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1186a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f1187b;

    public /* synthetic */ C0353I8(int r1, List r2) {
        this.f1186a = r1;
        this.f1187b = r2;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f1186a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return CherryThreadAPI.m3193h(this.f1187b);
    L7:
        return CherryThreadAPI.m3192g(this.f1187b);
    }
}

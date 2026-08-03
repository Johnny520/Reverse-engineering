package p000;

import io.github.cherrywechat.lua.api.CherryViewAPI;
import java.util.Map;

/* JADX INFO: renamed from: N8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0568N8 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1850a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Map f1851b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f1852c;

    public /* synthetic */ C0568N8(String r2, Map r3) {
        this.f1850a = 1;
        this.f1851b = r3;
        this.f1852c = r2;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f1850a) {
            case 0: goto L13;
            case 1: goto L10;
            case 2: goto L9;
            case 3: goto L7;
            default: goto L5;
        };
    L10:
        Map r0 = this.f1851b;
        return CherryViewAPI.m3313n(this.f1852c, r0);
    L5:
        return CherryViewAPI.m3271P(this.f1852c, this.f1851b);
    L7:
        return CherryViewAPI.m3256H0(this.f1852c, this.f1851b);
    L9:
        return CherryViewAPI.m3306j0(this.f1852c, this.f1851b);
    L13:
        return CherryViewAPI.m3243B(this.f1852c, this.f1851b);
    }

    public /* synthetic */ C0568N8(String r1, Map r2, int r3) {
        this.f1850a = r3;
        this.f1852c = r1;
        this.f1851b = r2;
    }
}

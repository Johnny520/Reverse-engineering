package p000;

import io.github.cherrywechat.lua.api.CherryMessageAPI;
import io.github.cherrywechat.lua.api.MessageAPI;

/* JADX INFO: renamed from: x8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2703x8 implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9277a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f9278b;

    public /* synthetic */ C2703x8(int r1, int r2) {
        this.f9277a = r2;
        this.f9278b = r1;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object r2) {
        switch(this.f9277a) {
            case 0: goto L13;
            case 1: goto L10;
            default: goto L5;
        };
    L10:
        boolean r22 = MessageAPI.m3437C(this.f9278b, (MessageAPI.MessageCallback) r2);
    L12:
        return Boolean.valueOf(r22);
    L13:
        r22 = CherryMessageAPI.m3125g(this.f9278b, (CherryMessageAPI.MessageCallback) r2);
        goto L12
    L5:
        if ((((Integer) r2).intValue() & this.f9278b) == 0) goto L7;
        boolean r23 = true;
    L9:
        return Boolean.valueOf(r23);
    L7:
        r23 = false;
        goto L9
    }
}

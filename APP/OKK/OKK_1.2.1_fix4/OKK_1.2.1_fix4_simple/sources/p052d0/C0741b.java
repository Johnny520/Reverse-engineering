package p052d0;

import android.app.Activity;
import android.widget.Toast;
import java.util.concurrent.atomic.AtomicReference;
import p007D0.C0137c;
import p007D0.C0146l;
import p009E0.C0191v;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p050c0.C0620Q1;
import p050c0.EnumC0583E0;

/* JADX INFO: renamed from: d0.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0741b implements InterfaceC0275a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2576a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f2577b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EnumC0583E0 f2578c;

    public /* synthetic */ C0741b(Activity r1, EnumC0583E0 r2, int r3) {
        this.f2576a = r3;
        this.f2577b = r1;
        this.f2578c = r2;
    }

    @Override // p029P0.InterfaceC0275a
    public final Object invoke() {
        C0146l r02 = C0146l.f339a;
        boolean r1 = true;
        r1 = true;
        r1 = true;
        r1 = true;
        r1 = true;
        r1 = true;
        EnumC0583E0 r3 = this.f2578c;
        Activity r5 = this.f2577b;
        switch(this.f2576a) {
            case 0: goto L38;
            default: goto L4;
        };
    L4:
        AbstractC0307g.m703e(r5, "$activity");
        AbstractC0307g.m703e(r3, "$s");
        AtomicReference r2 = C0620Q1.f1911a;
        int r22 = r3.ordinal();
        C0191v r4 = C0191v.f402a;
        if (r22 == 0) goto L26;
        if (r22 == 1) goto L22;
        if (r22 == 2) goto L18;
        if (r22 != 3) goto L16;
        if (C0620Q1.m1517b(r5, "com.tencent.mm.plugin.fav.ui.FavoriteIndexUI", r4) == true) goto L35;
        r1 = C0620Q1.m1518c(r5, "fav", ".ui.FavoriteIndexUI");
    L35:
        if (r1 == true) goto L37;
        Toast.makeText(r5, "无法打开「" + r3.f1757b + "」", 0).show();
    L37:
        return r02;
    L16:
        throw new C0137c();
    L18:
        if (C0620Q1.m1517b(r5, "com.tencent.mm.plugin.mall.ui.MallIndexUIv2", r4) == true) goto L35;
        r1 = C0620Q1.m1518c(r5, "mall", ".ui.MallIndexUIv2");
        goto L35
    L22:
        if (C0620Q1.m1517b(r5, "com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI", r4) == true) goto L35;
        r1 = C0620Q1.m1518c(r5, "offline", ".ui.WalletOfflineEntranceUI");
        goto L35
    L26:
        if (C0620Q1.m1517b(r5, "com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI", r4) == true) goto L35;
        if (C0620Q1.m1517b(r5, "com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI", r4) == true) goto L35;
        if (C0620Q1.m1518c(r5, "setting", ".ui.setting.SelfQRCodeUI") == true) goto L35;
        r1 = false;
        goto L35
    L38:
        AbstractC0307g.m703e(r5, "$activity");
        AbstractC0307g.m703e(r3, "$s");
        AbstractC0358S.m868R(r5, new C0741b(r5, r3, r1 ? 1 : 0));
        return r02;
    }
}

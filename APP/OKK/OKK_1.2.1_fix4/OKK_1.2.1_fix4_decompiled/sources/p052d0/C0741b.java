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

    public /* synthetic */ C0741b(Activity activity, EnumC0583E0 enumC0583E0, int i2) {
        this.f2576a = i2;
        this.f2577b = activity;
        this.f2578c = enumC0583E0;
    }

    @Override // p029P0.InterfaceC0275a
    public final Object invoke() {
        C0146l c0146l = C0146l.f339a;
        boolean zM1518c = true;
        zM1518c = true;
        zM1518c = true;
        zM1518c = true;
        zM1518c = true;
        zM1518c = true;
        EnumC0583E0 enumC0583E0 = this.f2578c;
        Activity activity = this.f2577b;
        switch (this.f2576a) {
            case 0:
                AbstractC0307g.m703e(activity, "$activity");
                AbstractC0307g.m703e(enumC0583E0, "$s");
                AbstractC0358S.m868R(activity, new C0741b(activity, enumC0583E0, zM1518c ? 1 : 0));
                return c0146l;
            default:
                AbstractC0307g.m703e(activity, "$activity");
                AbstractC0307g.m703e(enumC0583E0, "$s");
                AtomicReference atomicReference = C0620Q1.f1911a;
                int iOrdinal = enumC0583E0.ordinal();
                C0191v c0191v = C0191v.f402a;
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                throw new C0137c();
                            }
                            if (!C0620Q1.m1517b(activity, "com.tencent.mm.plugin.fav.ui.FavoriteIndexUI", c0191v)) {
                                zM1518c = C0620Q1.m1518c(activity, "fav", ".ui.FavoriteIndexUI");
                            }
                        } else if (!C0620Q1.m1517b(activity, "com.tencent.mm.plugin.mall.ui.MallIndexUIv2", c0191v)) {
                            zM1518c = C0620Q1.m1518c(activity, "mall", ".ui.MallIndexUIv2");
                        }
                    } else if (!C0620Q1.m1517b(activity, "com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI", c0191v)) {
                        zM1518c = C0620Q1.m1518c(activity, "offline", ".ui.WalletOfflineEntranceUI");
                    }
                } else if (!C0620Q1.m1517b(activity, "com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI", c0191v) && !C0620Q1.m1517b(activity, "com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI", c0191v) && !C0620Q1.m1518c(activity, "setting", ".ui.setting.SelfQRCodeUI")) {
                    zM1518c = false;
                }
                if (!zM1518c) {
                    Toast.makeText(activity, "无法打开「" + enumC0583E0.f1757b + "」", 0).show();
                }
                return c0146l;
        }
    }
}

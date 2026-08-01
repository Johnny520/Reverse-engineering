package top.suzhelan.qstory.ui.activity;

import android.view.View;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import p052.InterfaceC6554;
import p287.AbstractC8405;
import p350.C8859;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 50)
final /* synthetic */ class SettingActivityKt$SettingRoute$1$2$1$5$5$1 extends FunctionReferenceImpl implements InterfaceC6554 {
    public SettingActivityKt$SettingRoute$1$2$1$5$5$1(Object obj) {
        super(2, obj, C8859.class, AbstractC8405.m13972(2885), AbstractC8405.m13972(2886), 0);
    }

    public final void invoke(OtherViewItemInfo otherViewItemInfo, View view) {
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵呜喵喵喵呜喵呜");
        otherViewItemInfo.getClass();
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵呜喵喵喵呜喵喵");
        view.getClass();
        ((C8859) this.receiver).getClass();
        AbstractC8405.m13972(3252);
        AbstractC8405.m13972(3251);
        otherViewItemInfo.getOnClick().onClick(view);
    }

    @Override // p052.InterfaceC6554
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((OtherViewItemInfo) obj, (View) obj2);
        return C5176.f14739;
    }
}

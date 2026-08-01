package top.suzhelan.qstory.ui.activity;

import android.view.View;
import com.bumptech.glide.AbstractC3056;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import p052.InterfaceC6553;
import p354.C8891;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 50)
final /* synthetic */ class SettingActivityKt$SettingRoute$1$2$1$5$5$1 extends FunctionReferenceImpl implements InterfaceC6553 {
    public SettingActivityKt$SettingRoute$1$2$1$5$5$1(Object obj) {
        super(2, obj, C8891.class, AbstractC3056.m6668(-3937288501348009383L), AbstractC3056.m6668(-3937288454103369127L), 0);
    }

    public final void invoke(OtherViewItemInfo otherViewItemInfo, View view) {
        AbstractC3056.m6668(-3937677187298362791L);
        otherViewItemInfo.getClass();
        AbstractC3056.m6668(-3937677097104049575L);
        view.getClass();
        ((C8891) this.receiver).getClass();
        AbstractC3056.m6668(-3937359849344730535L);
        AbstractC3056.m6668(-3937359905179305383L);
        otherViewItemInfo.getOnClick().onClick(view);
    }

    @Override // p052.InterfaceC6553
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((OtherViewItemInfo) obj, (View) obj2);
        return C5175.f14739;
    }
}

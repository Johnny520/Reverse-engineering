package p338;

import android.content.Context;
import androidx.compose.runtime.internal.C2080;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p049.AbstractC7166;
import p049.C7164;
import p050.AbstractC7176;
import p160.C8376;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子楪哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世兰苏哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C9529 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final List f24871 = AbstractC7176.m12490("com.qzone.reborn.feedpro.itemview.ad.QZoneAdBaseMediaFeedProItemView", "com.qzone.reborn.feedx.itemview.ad.QZoneAdBaseFeedItemView", "com.qzone.reborn.feedpro.itemview.QzoneFeedProGeneralBigCardItemView", "com.qzone.reborn.feedpro.itemview.QZoneAdFeedProForwardMixPicVideoItemView", "com.qzone.reborn.feedpro.widget.comment.QZoneFeedProDetailBottomAdBlockView", "com.qzone.reborn.feedx.itemview.ad.QZoneAdRewardFeedItemView");

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        Iterator it = f24871.iterator();
        while (it.hasNext()) {
            try {
                Class clsM12425 = AbstractC7166.m12425((String) it.next());
                if (clsM12425 != null) {
                    m12389(clsM12425.getDeclaredConstructor(Context.class), new C8376(17));
                }
            } catch (Throwable unused) {
            }
        }
        try {
            Class clsM124252 = AbstractC7166.m12425("com.tencent.mobileqq.vas.adv.qzone.logic.AlbumRecommendAdvController");
            Class clsM124253 = AbstractC7166.m12425("com.tencent.mobileqq.vas.adv.common.data.AlumBasicData");
            if (clsM124252 != null && clsM124253 != null) {
                C7164 c7164M12412 = C7164.m12412(clsM124252.getName());
                String strM14531 = "initAndRenderData";
                C2080 c2080 = c7164M12412.f17803;
                c2080.f3963 = strM14531;
                c2080.f3964 = new Class[]{clsM124253};
                m12390(c7164M12412.m12414(), new C8376(this, 19));
            }
        } catch (Throwable unused2) {
        }
        try {
            String strM145312 = "com.qzone.proxy.feedcomponent.model.gdt.QZoneAdFeedDataExtKt";
            String strM145313 = "com.qzone.proxy.feedcomponent.model.BusinessFeedData";
            C7164 c7164M124122 = C7164.m12412(strM145312);
            c7164M124122.f17803.f3963 = "isShowingRecommendAd";
            Class[] clsArr = {AbstractC7166.m12425(strM145313)};
            C2080 c20802 = c7164M124122.f17803;
            c20802.f3964 = clsArr;
            c20802.f3962 = Boolean.TYPE;
            m12390(c7164M124122.m12414(), new C8376(18));
        } catch (Throwable unused3) {
        }
    }
}

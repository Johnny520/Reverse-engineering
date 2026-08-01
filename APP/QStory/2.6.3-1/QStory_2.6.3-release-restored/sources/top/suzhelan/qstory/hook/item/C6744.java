package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XposedHelpers;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p049.AbstractC7166;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏兰哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6744 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        try {
            Class clsM12425 = AbstractC7166.m12425("com.tencent.mobileqq.profilecard.api.impl.ProfileDataServiceImpl");
            C6745 c6745 = new C6745(0);
            XposedHelpers.findAndHookMethod(clsM12425, "getProfileCard", new Object[]{String.class, Boolean.TYPE, c6745});
            XposedHelpers.findAndHookMethod(clsM12425, "getProfileCardFromCache", new Object[]{String.class, c6745});
        } catch (Exception unused) {
        }
        try {
            XposedHelpers.findAndHookMethod(AbstractC7166.m12425("com.tencent.mobileqq.profilecard.processor.ProfileSecureProcessor"), "processProfileCard", new Object[]{AbstractC7166.m12425("android.os.Bundle"), AbstractC7166.m12425("SummaryCard.RespHead"), AbstractC7166.m12425("SummaryCard.RespSummaryCard"), new C6745(1)});
        } catch (Exception unused2) {
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "忽略账号的异常状态，使其能够正常查看资料卡";
    }
}

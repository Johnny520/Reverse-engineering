package top.suzhelan.qstory.hook.item;

import android.app.Activity;
import de.robv.android.xposed.XC_MethodHook;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p042.InterfaceC7141;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪苏世兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6738 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String[][] f16426 = {new String[]{"相机", "android.permission.CAMERA"}, new String[]{"语音", "android.permission.RECORD_AUDIO"}};

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        String strM14531 = "checkPermission";
        Class cls = Integer.TYPE;
        final int i = 0;
        m12390(Activity.class.getMethod(strM14531, String.class, cls, cls), new InterfaceC7141(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子哲楪世兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6738 f16422;

            {
                this.f16422 = this;
            }

            @Override // p042.InterfaceC7141
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                int i2 = i;
                C6738 c6738 = this.f16422;
                switch (i2) {
                    case 0:
                        Object obj = methodHookParam.args[0];
                        "null cannot be cast to non-null type kotlin.String";
                        obj.getClass();
                        String str = (String) obj;
                        for (String[] strArr : c6738.f16426) {
                            if (AbstractC5227.m9466(strArr[1], str)) {
                                methodHookParam.setResult(0);
                            }
                            break;
                        }
                        break;
                    default:
                        Object obj2 = methodHookParam.args[0];
                        "null cannot be cast to non-null type kotlin.String";
                        obj2.getClass();
                        String str2 = (String) obj2;
                        for (String[] strArr2 : c6738.f16426) {
                            if (AbstractC5227.m9466(strArr2[1], str2)) {
                                methodHookParam.setResult(0);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        m12390(Activity.class.getMethod("checkSelfPermission", String.class), new InterfaceC7141(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子哲楪世兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6738 f16422;

            {
                this.f16422 = this;
            }

            @Override // p042.InterfaceC7141
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22 = i2;
                C6738 c6738 = this.f16422;
                switch (i22) {
                    case 0:
                        Object obj = methodHookParam.args[0];
                        "null cannot be cast to non-null type kotlin.String";
                        obj.getClass();
                        String str = (String) obj;
                        for (String[] strArr : c6738.f16426) {
                            if (AbstractC5227.m9466(strArr[1], str)) {
                                methodHookParam.setResult(0);
                            }
                            break;
                        }
                        break;
                    default:
                        Object obj2 = methodHookParam.args[0];
                        "null cannot be cast to non-null type kotlin.String";
                        obj2.getClass();
                        String str2 = (String) obj2;
                        for (String[] strArr2 : c6738.f16426) {
                            if (AbstractC5227.m9466(strArr2[1], str2)) {
                                methodHookParam.setResult(0);
                            }
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "即时生效 开启后需要手动到应用详情页给予权限 目前仅支持伪装语音权限和拍照权限 正在完善可选与更多功能";
    }
}

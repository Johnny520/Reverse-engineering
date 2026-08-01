package lin.xposed.hook.view.main.itemview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.compose.animation.core.C1171;
import com.android.p002dx.p005io.Opcodes;
import com.google.gson.C4084;
import com.google.gson.C4085;
import java.util.ArrayList;
import java.util.Map;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import p026.AbstractC7014;
import p026.AbstractC7017;
import p273.C9027;
import p273.C9034;
import p361.C9663;
import p364.InterfaceC9673;
import p412.C9942;
import retrofit2.C6585;
import retrofit2.InterfaceC6608;
import retrofit2.InterfaceC6625;
import top.suzhelan.qstory.entity.QSResult;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class AddQQGroup extends OtherViewItemInfo {
    public AddQQGroup(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$getOnClick$0(final View view) {
        C9027.m14266("正在获取群列表...");
        C9663 c9663 = C9663.f25281;
        C4084 c4084 = new C4084();
        c4084.m7893();
        C4085 c4085M7894 = c4084.m7894();
        C1171 c1171 = new C1171(19);
        c1171.m1531("https://qstory.suzhelan.top");
        C9663.f25281.getClass();
        c1171.f1440 = C9663.m15050(false);
        ((ArrayList) c1171.f1439).add(new C9942(c4085M7894));
        Object objM1108 = c1171.m1530().m1108(InterfaceC9673.class);
        "create(...)";
        objM1108.getClass();
        ((InterfaceC9673) objM1108).m15076().mo11722(new InterfaceC6625() { // from class: lin.xposed.hook.view.main.itemview.AddQQGroup.1
            @Override // retrofit2.InterfaceC6625
            public void onFailure(InterfaceC6608<QSResult<Map<String, String>>> interfaceC6608, Throwable th) {
                String strM14531 = "获取群列表失败";
                String str = AbstractC7017.f17361;
                AbstractC7017.m12164(strM14531, th.toString(), th, true);
                C9027.m14269();
                AbstractC7014.m12151("获取群列表失败");
            }

            @Override // retrofit2.InterfaceC6625
            public void onResponse(InterfaceC6608<QSResult<Map<String, String>>> interfaceC6608, C6585<QSResult<Map<String, String>>> c6585) {
                C9027.m14269();
                QSResult qSResult = (QSResult) c6585.f16101;
                if (qSResult == null || !qSResult.isSuccess()) {
                    return;
                }
                AddQQGroup.this.showDialog(view.getContext(), qSResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$showDialog$1(String[] strArr, Map map, Context context, C9034 c9034, CharSequence charSequence, int i) {
        String str = (String) map.get(strArr[i]);
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqqapi://card/show_pslcard?src_type=internal&version=1&uin=" + str + "&card_type=group&source=qrcode")));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDialog(Context context, QSResult<Map<String, String>> qSResult) {
        Map<String, String> data = qSResult.getData();
        String[] strArr = (String[]) data.keySet().toArray(new String[0]);
        C9034 c9034M14277 = C9034.m14277();
        c9034M14277.f22959 = "选择加入的QQ群";
        c9034M14277.m14286();
        c9034M14277.f22971 = qSResult.getMsg();
        c9034M14277.m14286();
        c9034M14277.m14287(strArr);
        c9034M14277.f22953 = new C6395(strArr, data, context, 0);
        c9034M14277.m14290();
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getLeftText() {
        return "加入QQ群";
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new ViewOnClickListenerC6396(this, 0);
    }
}

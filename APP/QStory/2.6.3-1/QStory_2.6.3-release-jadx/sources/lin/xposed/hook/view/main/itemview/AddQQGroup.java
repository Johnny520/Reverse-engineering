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
import p303.AbstractC9234;
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
        C9027.m14266(AbstractC9234.m14531(1024));
        C9663 c9663 = C9663.f25281;
        C4084 c4084 = new C4084();
        c4084.m7893();
        C4085 c4085M7894 = c4084.m7894();
        C1171 c1171 = new C1171(19);
        c1171.m1531(AbstractC9234.m14531(2860));
        C9663.f25281.getClass();
        c1171.f1440 = C9663.m15050(false);
        ((ArrayList) c1171.f1439).add(new C9942(c4085M7894));
        Object objM1108 = c1171.m1530().m1108(InterfaceC9673.class);
        AbstractC9234.m14531(2861);
        objM1108.getClass();
        ((InterfaceC9673) objM1108).m15076().mo11722(new InterfaceC6625() { // from class: lin.xposed.hook.view.main.itemview.AddQQGroup.1
            @Override // retrofit2.InterfaceC6625
            public void onFailure(InterfaceC6608<QSResult<Map<String, String>>> interfaceC6608, Throwable th) {
                String strM14531 = AbstractC9234.m14531(1021);
                String str = AbstractC7017.f17361;
                AbstractC7017.m12164(strM14531, th.toString(), th, true);
                C9027.m14269();
                AbstractC7014.m12151(AbstractC9234.m14531(1021));
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
        context.startActivity(new Intent(AbstractC9234.m14531(Opcodes.ADD_DOUBLE_2ADDR), Uri.parse(AbstractC9234.m14531(227) + str + AbstractC9234.m14531(228))));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDialog(Context context, QSResult<Map<String, String>> qSResult) {
        Map<String, String> data = qSResult.getData();
        String[] strArr = (String[]) data.keySet().toArray(new String[0]);
        C9034 c9034M14277 = C9034.m14277();
        c9034M14277.f22959 = AbstractC9234.m14531(1023);
        c9034M14277.m14286();
        c9034M14277.f22971 = qSResult.getMsg();
        c9034M14277.m14286();
        c9034M14277.m14287(strArr);
        c9034M14277.f22953 = new C6395(strArr, data, context, 0);
        c9034M14277.m14290();
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getLeftText() {
        return AbstractC9234.m14531(1022);
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new ViewOnClickListenerC6396(this, 0);
    }
}

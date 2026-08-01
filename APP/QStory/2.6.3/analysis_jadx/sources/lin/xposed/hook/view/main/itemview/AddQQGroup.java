package lin.xposed.hook.view.main.itemview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.compose.animation.core.C0325;
import com.android.dx.io.Opcodes;
import com.google.gson.C3252;
import com.google.gson.C3253;
import java.util.ArrayList;
import java.util.Map;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import p010.AbstractC6185;
import p010.AbstractC6188;
import p257.C8198;
import p257.C8205;
import p287.AbstractC8405;
import p345.C8834;
import p348.InterfaceC8844;
import p396.C9113;
import retrofit2.C5755;
import retrofit2.InterfaceC5778;
import retrofit2.InterfaceC5795;
import top.suzhelan.qstory.entity.QSResult;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class AddQQGroup extends OtherViewItemInfo {
    public AddQQGroup(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$getOnClick$0(final View view) {
        C8198.m13707(AbstractC8405.m13972(1024));
        C8834 c8834 = C8834.f24936;
        C3252 c3252 = new C3252();
        c3252.m7334();
        C3253 c3253M7335 = c3252.m7335();
        C0325 c0325 = new C0325(19);
        c0325.m971(AbstractC8405.m13972(2860));
        C8834.f24936.getClass();
        c0325.f1095 = C8834.m14491(false);
        ((ArrayList) c0325.f1094).add(new C9113(c3253M7335));
        Object objM548 = c0325.m970().m548(InterfaceC8844.class);
        AbstractC8405.m13972(2861);
        objM548.getClass();
        ((InterfaceC8844) objM548).m14517().mo11163(new InterfaceC5795() { // from class: lin.xposed.hook.view.main.itemview.AddQQGroup.1
            @Override // retrofit2.InterfaceC5795
            public void onFailure(InterfaceC5778<QSResult<Map<String, String>>> interfaceC5778, Throwable th) {
                String strM13972 = AbstractC8405.m13972(1021);
                String str = AbstractC6188.f17016;
                AbstractC6188.m11605(strM13972, th.toString(), th, true);
                C8198.m13710();
                AbstractC6185.m11592(AbstractC8405.m13972(1021));
            }

            @Override // retrofit2.InterfaceC5795
            public void onResponse(InterfaceC5778<QSResult<Map<String, String>>> interfaceC5778, C5755<QSResult<Map<String, String>>> c5755) {
                C8198.m13710();
                QSResult qSResult = (QSResult) c5755.f15756;
                if (qSResult == null || !qSResult.isSuccess()) {
                    return;
                }
                AddQQGroup.this.showDialog(view.getContext(), qSResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$showDialog$1(String[] strArr, Map map, Context context, C8205 c8205, CharSequence charSequence, int i) {
        String str = (String) map.get(strArr[i]);
        context.startActivity(new Intent(AbstractC8405.m13972(Opcodes.ADD_DOUBLE_2ADDR), Uri.parse(AbstractC8405.m13972(227) + str + AbstractC8405.m13972(228))));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDialog(Context context, QSResult<Map<String, String>> qSResult) {
        Map<String, String> data = qSResult.getData();
        String[] strArr = (String[]) data.keySet().toArray(new String[0]);
        C8205 c8205M13718 = C8205.m13718();
        c8205M13718.f22614 = AbstractC8405.m13972(1023);
        c8205M13718.m13727();
        c8205M13718.f22626 = qSResult.getMsg();
        c8205M13718.m13727();
        c8205M13718.m13728(strArr);
        c8205M13718.f22608 = new C5565(strArr, data, context, 0);
        c8205M13718.m13731();
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getLeftText() {
        return AbstractC8405.m13972(1022);
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new ViewOnClickListenerC5566(this, 0);
    }
}

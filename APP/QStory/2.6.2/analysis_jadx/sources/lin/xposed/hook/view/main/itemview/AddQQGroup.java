package lin.xposed.hook.view.main.itemview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.compose.animation.core.C0325;
import com.bumptech.glide.AbstractC3056;
import com.google.gson.C3251;
import com.google.gson.C3252;
import java.util.ArrayList;
import java.util.Map;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import p007.AbstractC6136;
import p010.AbstractC6154;
import p010.AbstractC6157;
import p257.C8197;
import p257.C8204;
import p348.InterfaceC8862;
import p349.C8865;
import p398.C9152;
import retrofit2.C5754;
import retrofit2.InterfaceC5777;
import retrofit2.InterfaceC5794;
import top.suzhelan.qstory.entity.QSResult;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class AddQQGroup extends OtherViewItemInfo {
    public AddQQGroup(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$getOnClick$0(final View view) {
        C8197.m13690(AbstractC3056.m6668(-3937664766252942759L));
        C8865 c8865 = C8865.f24976;
        C3251 c3251 = new C3251();
        c3251.m7347();
        C3252 c3252M7348 = c3251.m7348();
        C0325 c0325 = new C0325(19);
        c0325.m971(AbstractC3056.m6668(-3937274572769068455L));
        C8865.f24976.getClass();
        c0325.f1095 = C8865.m14511(false);
        ((ArrayList) c0325.f1094).add(new C9152(c3252M7348));
        Object objM547 = c0325.m970().m547(InterfaceC8862.class);
        AbstractC3056.m6668(-3937274383790507431L);
        objM547.getClass();
        ((InterfaceC8862) objM547).m14502().mo11106(new InterfaceC5794() { // from class: lin.xposed.hook.view.main.itemview.AddQQGroup.1
            @Override // retrofit2.InterfaceC5794
            public void onFailure(InterfaceC5777<QSResult<Map<String, String>>> interfaceC5777, Throwable th) {
                String strM6668 = AbstractC3056.m6668(-3937664804907648423L);
                String str = AbstractC6157.f16779;
                AbstractC6157.m11574(strM6668, th.toString(), th, true);
                C8197.m13693();
                AbstractC6154.m11561(AbstractC3056.m6668(-3937664804907648423L));
            }

            @Override // retrofit2.InterfaceC5794
            public void onResponse(InterfaceC5777<QSResult<Map<String, String>>> interfaceC5777, C5754<QSResult<Map<String, String>>> c5754) {
                C8197.m13693();
                QSResult qSResult = (QSResult) c5754.f15756;
                if (qSResult == null || !qSResult.isSuccess()) {
                    return;
                }
                AddQQGroup.this.showDialog(view.getContext(), qSResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$showDialog$1(String[] strArr, Map map, Context context, C8204 c8204, CharSequence charSequence, int i) {
        String str = (String) map.get(strArr[i]);
        String strM6668 = AbstractC3056.m6668(-3937572549010130343L);
        StringBuilder sb = new StringBuilder();
        AbstractC6136.m11544(-3937587375237236135L, sb, str);
        sb.append(AbstractC3056.m6668(-3937587117539198375L));
        context.startActivity(new Intent(strM6668, Uri.parse(sb.toString())));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDialog(Context context, QSResult<Map<String, String>> qSResult) {
        Map<String, String> data = qSResult.getData();
        String[] strArr = (String[]) data.keySet().toArray(new String[0]);
        C8204 c8204M13701 = C8204.m13701();
        c8204M13701.f22615 = AbstractC3056.m6668(-3937664727598237095L);
        c8204M13701.m13710();
        c8204M13701.f22627 = qSResult.getMsg();
        c8204M13701.m13710();
        c8204M13701.m13711(strArr);
        c8204M13701.f22609 = new C5564(strArr, data, context, 0);
        c8204M13701.m13714();
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getLeftText() {
        return AbstractC3056.m6668(-3937664839267386791L);
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new ViewOnClickListenerC5565(this, 0);
    }
}

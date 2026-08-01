package lin.xposed.hook.view.main.itemview;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import bsh.C2632;
import com.bumptech.glide.AbstractC3056;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import p024.AbstractC6290;
import p035.AbstractC6340;
import p089.C7179;
import p175.AbstractC7738;
import p251.C8182;
import p391.C9114;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class DeleteMethodInfo extends OtherViewItemInfo {
    public DeleteMethodInfo(Context context) {
        super(context);
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getLeftText() {
        return "\u6e05\u9664\u65b9\u6cd5\u4fe1\u606f";
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new View.OnClickListener() { // from class: lin.xposed.hook.view.main.itemview.DeleteMethodInfo.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AbstractC6290.f17371.f25485.clear();
                AbstractC0455.m1152(new C7179(25));
                if (C9114.f25484.length() == 0) {
                    C2632.m5294("storePath is empty(请使用KvHelper.initialize(String path)初始化");
                } else {
                    new C8182(C9114.f25484, "DexKitCache").m13649().clear();
                    AbstractC7738.m13038(AbstractC6340.f17460);
                }
            }
        };
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getTips() {
        return "\u6e05\u9664\u65b9\u6cd5\u4fe1\u606f\u5e76\u91cd\u542fQQ\u5f00\u59cb\u67e5\u627e\u65b9\u6cd5";
    }
}

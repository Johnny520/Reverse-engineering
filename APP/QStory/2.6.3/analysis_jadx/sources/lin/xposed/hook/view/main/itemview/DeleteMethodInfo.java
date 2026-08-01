package lin.xposed.hook.view.main.itemview;

import android.content.Context;
import android.view.View;
import bsh.C2633;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3065;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import p024.AbstractC6308;
import p036.AbstractC6358;
import p089.C7180;
import p251.C8183;
import p287.AbstractC8405;
import p391.C9095;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class DeleteMethodInfo extends OtherViewItemInfo {
    public DeleteMethodInfo(Context context) {
        super(context);
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getLeftText() {
        return AbstractC8405.m13972(1029);
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new View.OnClickListener() { // from class: lin.xposed.hook.view.main.itemview.DeleteMethodInfo.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AbstractC6308.f17420.f25489.clear();
                AbstractC3065.m6823(new C7180(24));
                if (C9095.f25488.length() == 0) {
                    C2633.m5339("storePath is empty(请使用KvHelper.initialize(String path)初始化");
                } else {
                    new C8183(C9095.f25488, "DexKitCache").m13673().clear();
                    AbstractC3055.m6639(AbstractC6358.f17507);
                }
            }
        };
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getTips() {
        return AbstractC8405.m13972(1030);
    }
}

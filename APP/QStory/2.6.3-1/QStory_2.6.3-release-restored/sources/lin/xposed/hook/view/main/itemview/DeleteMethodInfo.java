package lin.xposed.hook.view.main.itemview;

import android.content.Context;
import android.view.View;
import bsh.C3466;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3897;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import p040.AbstractC7137;
import p052.AbstractC7187;
import p105.C8009;
import p267.C9012;
import p407.C9924;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class DeleteMethodInfo extends OtherViewItemInfo {
    public DeleteMethodInfo(Context context) {
        super(context);
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getLeftText() {
        return "清除方法信息";
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new View.OnClickListener() { // from class: lin.xposed.hook.view.main.itemview.DeleteMethodInfo.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AbstractC7137.f17765.f25834.clear();
                AbstractC3897.m7383(new C8009(24));
                if (C9924.f25833.length() == 0) {
                    C3466.m5899("storePath is empty(请使用KvHelper.initialize(String path)初始化");
                } else {
                    new C9012(C9924.f25833, "DexKitCache").m14232().clear();
                    AbstractC3887.m7199(AbstractC7187.f17852);
                }
            }
        };
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getTips() {
        return "清除方法信息并重启QQ开始查找方法";
    }
}

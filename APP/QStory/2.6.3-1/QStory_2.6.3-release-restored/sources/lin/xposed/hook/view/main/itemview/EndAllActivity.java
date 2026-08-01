package lin.xposed.hook.view.main.itemview;

import android.content.Context;
import android.view.View;
import com.bumptech.glide.AbstractC3887;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class EndAllActivity extends OtherViewItemInfo {
    public EndAllActivity(Context context) {
        super(context);
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getLeftText() {
        return "重启QQ";
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new View.OnClickListener() { // from class: lin.xposed.hook.view.main.itemview.EndAllActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AbstractC3887.m7199(view.getContext());
            }
        };
    }
}

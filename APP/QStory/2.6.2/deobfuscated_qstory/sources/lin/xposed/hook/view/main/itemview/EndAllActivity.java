package lin.xposed.hook.view.main.itemview;

import android.content.Context;
import android.view.View;
import com.bumptech.glide.AbstractC3056;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import p175.AbstractC7738;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class EndAllActivity extends OtherViewItemInfo {
    public EndAllActivity(Context context) {
        super(context);
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getLeftText() {
        return "\u91cd\u542fQQ";
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new View.OnClickListener() { // from class: lin.xposed.hook.view.main.itemview.EndAllActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AbstractC7738.m13038(view.getContext());
            }
        };
    }
}

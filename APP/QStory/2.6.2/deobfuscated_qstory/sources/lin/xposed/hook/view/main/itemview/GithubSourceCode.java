package lin.xposed.hook.view.main.itemview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.bumptech.glide.AbstractC3056;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated(since = "Wait for open source before enabling it")
public class GithubSourceCode extends OtherViewItemInfo {
    public GithubSourceCode(Context context) {
        super(context);
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getLeftText() {
        return "Github\u5f00\u6e90\u5730\u5740";
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new View.OnClickListener() { // from class: lin.xposed.hook.view.main.itemview.GithubSourceCode.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse("https://github.com/Suzhelan/NewQStory"));
                view.getContext().startActivity(intent);
            }
        };
    }
}

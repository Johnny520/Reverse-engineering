package lin.xposed.hook.view.main.itemview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.android.p002dx.p005io.Opcodes;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import p303.AbstractC9234;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated(since = "Wait for open source before enabling it")
public class GithubSourceCode extends OtherViewItemInfo {
    public GithubSourceCode(Context context) {
        super(context);
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getLeftText() {
        return AbstractC9234.m14531(1033);
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new View.OnClickListener() { // from class: lin.xposed.hook.view.main.itemview.GithubSourceCode.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(AbstractC9234.m14531(Opcodes.ADD_DOUBLE_2ADDR));
                intent.setData(Uri.parse(AbstractC9234.m14531(1032)));
                view.getContext().startActivity(intent);
            }
        };
    }
}

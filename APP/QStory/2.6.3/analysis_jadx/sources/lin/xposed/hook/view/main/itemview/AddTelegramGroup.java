package lin.xposed.hook.view.main.itemview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.android.dx.io.Opcodes;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import p287.AbstractC8405;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class AddTelegramGroup extends OtherViewItemInfo {
    public AddTelegramGroup(Context context) {
        super(context);
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getLeftText() {
        return AbstractC8405.m13972(1028);
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new View.OnClickListener() { // from class: lin.xposed.hook.view.main.itemview.AddTelegramGroup.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(AbstractC8405.m13972(Opcodes.ADD_DOUBLE_2ADDR));
                intent.setData(Uri.parse(AbstractC8405.m13972(1027)));
                view.getContext().startActivity(intent);
            }
        };
    }
}

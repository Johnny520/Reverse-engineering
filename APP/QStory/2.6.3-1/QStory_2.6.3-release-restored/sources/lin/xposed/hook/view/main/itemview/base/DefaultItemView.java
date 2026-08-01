package lin.xposed.hook.view.main.itemview.base;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC3317;
import com.davemorrissey.labs.subscaleview.C0328R;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class DefaultItemView extends AbstractC3317 {
    public TextView leftText;
    public TextView tipsText;

    public DefaultItemView(View view) {
        super(view);
        onCreate();
    }

    public void onCreate() {
        this.leftText = (TextView) this.itemView.findViewById(C0328R.id.base_item_left_text);
        this.tipsText = (TextView) this.itemView.findViewById(C0328R.id.base_item_left_tips_text);
    }
}

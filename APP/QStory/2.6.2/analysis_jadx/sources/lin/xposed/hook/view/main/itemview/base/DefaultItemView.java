package lin.xposed.hook.view.main.itemview.base;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC2484;
import com.davemorrissey.labs.subscaleview.R;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class DefaultItemView extends AbstractC2484 {
    public TextView leftText;
    public TextView tipsText;

    public DefaultItemView(View view) {
        super(view);
        onCreate();
    }

    public void onCreate() {
        this.leftText = (TextView) this.itemView.findViewById(R.id.base_item_left_text);
        this.tipsText = (TextView) this.itemView.findViewById(R.id.base_item_left_tips_text);
    }
}

package p038;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.Iterator;
import lin.xposed.hook.javaplugin.view.ViewOnLongClickListenerC5544;
import p032.AbstractC6317;
import p175.AbstractC7738;
import top.suzhelan.qstory.hook.api.InterfaceC5808;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6406 implements InterfaceC5808 {
    @Override // top.suzhelan.qstory.hook.api.InterfaceC5808
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo11172(Object obj, View view) {
        Iterator it = ((ArrayList) AbstractC6317.m11831(ArrayList.class, AbstractC3056.m6668(-3937563413614691751L), obj)).iterator();
        while (it.hasNext()) {
            Object objCallMethod = XposedHelpers.callMethod(it.next(), AbstractC3056.m6668(-3937578454590162343L), new Object[0]);
            if (objCallMethod != null) {
                ViewGroup viewGroup = (ViewGroup) view;
                String str = (String) AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937578377280751015L), objCallMethod);
                Activity activityM13031 = AbstractC7738.m13031();
                TextView textView = (TextView) viewGroup.findViewById(2699907);
                if (textView != null) {
                    viewGroup.removeView(textView);
                }
                TextView textView2 = new TextView(activityM13031);
                textView2.setId(2699907);
                textView2.setTextColor(activityM13031.getColor(R.color.____res_0x2406047d));
                textView2.setTextSize(18.0f);
                textView2.setGravity(1);
                textView2.setOnLongClickListener(new ViewOnLongClickListenerC5544(activityM13031, 3, str));
                textView2.setText(AbstractC3056.m6668(-3937578282791470503L));
                viewGroup.addView(textView2, new RelativeLayout.LayoutParams(-1, -2));
                return;
            }
        }
    }
}

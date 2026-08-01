package top.suzhelan.qstory.hook.item.chat;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.AbstractC3055;
import com.davemorrissey.labs.subscaleview.R;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import lin.xposed.hook.javaplugin.view.ViewOnLongClickListenerC5545;
import lin.xposed.hook.util.qq.QQAIOTool;
import p033.AbstractC6336;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.api.InterfaceC5809;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5837 implements InterfaceC5809 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15980;

    @Override // top.suzhelan.qstory.hook.api.InterfaceC5809
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo11229(Object obj, View view) {
        String str;
        ViewGroup contentView;
        switch (this.f15980) {
            case 0:
                AbstractC8405.m13972(1908);
                AbstractC8405.m13972(1909);
                ConcurrentHashMap concurrentHashMap = C5836.f15979;
                Long lM11248 = C5836.m11248(obj, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"));
                if (lM11248 != null && (str = (String) C5836.f15979.get(lM11248)) != null) {
                    ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                    if (viewGroup != null && QQAIOTool.hasContentMessage(viewGroup) && (contentView = QQAIOTool.getContentView(viewGroup)) != null) {
                        ArrayList<View> arrayListM6650 = AbstractC3055.m6650(contentView);
                        AbstractC8405.m13972(2133);
                        for (View view2 : arrayListM6650) {
                            if ((view2 instanceof TextView) && view2.getClass().getName().equals(AbstractC8405.m13972(2132))) {
                                ((TextView) view2).setText(str);
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                Iterator it = ((ArrayList) AbstractC6336.m11859(ArrayList.class, AbstractC8405.m13972(152), obj)).iterator();
                while (it.hasNext()) {
                    Object objCallMethod = XposedHelpers.callMethod(it.next(), AbstractC8405.m13972(153), new Object[0]);
                    if (objCallMethod != null) {
                        ViewGroup viewGroup2 = (ViewGroup) view;
                        String str2 = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(154), objCallMethod);
                        Activity activityM6653 = AbstractC3055.m6653();
                        TextView textView = (TextView) viewGroup2.findViewById(2699907);
                        if (textView != null) {
                            viewGroup2.removeView(textView);
                        }
                        TextView textView2 = new TextView(activityM6653);
                        textView2.setId(2699907);
                        textView2.setTextColor(activityM6653.getColor(R.color.____res_0x2406047d));
                        textView2.setTextSize(18.0f);
                        textView2.setGravity(1);
                        textView2.setOnLongClickListener(new ViewOnLongClickListenerC5545(activityM6653, 3, str2));
                        textView2.setText(AbstractC8405.m13972(155));
                        viewGroup2.addView(textView2, new RelativeLayout.LayoutParams(-1, -2));
                        break;
                    }
                }
                break;
        }
    }
}

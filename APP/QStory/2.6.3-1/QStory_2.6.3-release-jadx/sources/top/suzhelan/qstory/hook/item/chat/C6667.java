package top.suzhelan.qstory.hook.item.chat;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.AbstractC3887;
import com.davemorrissey.labs.subscaleview.C0328R;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import lin.xposed.hook.javaplugin.view.ViewOnLongClickListenerC6376;
import lin.xposed.hook.util.p011qq.QQAIOTool;
import p049.AbstractC7165;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.api.InterfaceC6639;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6667 implements InterfaceC6639 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16325;

    @Override // top.suzhelan.qstory.hook.api.InterfaceC6639
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo11788(Object obj, View view) {
        String str;
        ViewGroup contentView;
        switch (this.f16325) {
            case 0:
                AbstractC9234.m14531(1908);
                AbstractC9234.m14531(1909);
                ConcurrentHashMap concurrentHashMap = C6666.f16324;
                Long lM11807 = C6666.m11807(obj, AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"));
                if (lM11807 != null && (str = (String) C6666.f16324.get(lM11807)) != null) {
                    ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                    if (viewGroup != null && QQAIOTool.hasContentMessage(viewGroup) && (contentView = QQAIOTool.getContentView(viewGroup)) != null) {
                        ArrayList<View> arrayListM7210 = AbstractC3887.m7210(contentView);
                        AbstractC9234.m14531(2133);
                        for (View view2 : arrayListM7210) {
                            if ((view2 instanceof TextView) && view2.getClass().getName().equals(AbstractC9234.m14531(2132))) {
                                ((TextView) view2).setText(str);
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                Iterator it = ((ArrayList) AbstractC7165.m12418(ArrayList.class, AbstractC9234.m14531(152), obj)).iterator();
                while (it.hasNext()) {
                    Object objCallMethod = XposedHelpers.callMethod(it.next(), AbstractC9234.m14531(153), new Object[0]);
                    if (objCallMethod != null) {
                        ViewGroup viewGroup2 = (ViewGroup) view;
                        String str2 = (String) AbstractC7165.m12418(String.class, AbstractC9234.m14531(154), objCallMethod);
                        Activity activityM7213 = AbstractC3887.m7213();
                        TextView textView = (TextView) viewGroup2.findViewById(2699907);
                        if (textView != null) {
                            viewGroup2.removeView(textView);
                        }
                        TextView textView2 = new TextView(activityM7213);
                        textView2.setId(2699907);
                        textView2.setTextColor(activityM7213.getColor(C0328R.color.____res_0x2406047d));
                        textView2.setTextSize(18.0f);
                        textView2.setGravity(1);
                        textView2.setOnLongClickListener(new ViewOnLongClickListenerC6376(activityM7213, 3, str2));
                        textView2.setText(AbstractC9234.m14531(155));
                        viewGroup2.addView(textView2, new RelativeLayout.LayoutParams(-1, -2));
                        break;
                    }
                }
                break;
        }
    }
}

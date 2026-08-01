package p055;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.material.ripple.RunnableC1945;
import androidx.compose.runtime.internal.C2080;
import androidx.fragment.app.C3191;
import bsh.C3466;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.C3902;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.textfield.ViewOnClickListenerC4015;
import io.ktor.client.plugins.AbstractC4765;
import java.io.File;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC6365;
import p026.AbstractC7014;
import p035.C7092;
import p042.AbstractC7140;
import p043.InterfaceC7146;
import p049.AbstractC7162;
import p049.AbstractC7166;
import p049.C7164;
import p050.AbstractC7176;
import p052.AbstractC7187;
import p408.C9927;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7250 extends AbstractC7140 implements InterfaceC7146 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public BitmapDrawable f17950;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f17951 = AbstractC4765.m8874().concat("/滑稽.png");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f17952 = AbstractC4765.m8874().concat("/暗黑滑稽.png");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f17949 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static Method m12530() {
        C9927 c9927 = new C9927();
        c9927.m15247("com.tencent.mobileqq.aio.input.simpleui");
        c9927.m15246("updateSimpleUI");
        c9927.f25838 = Void.TYPE;
        return c9927.m15245();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static ImageView m12531(C7250 c7250, Context context) {
        c7250.m12532();
        ImageView imageView = new ImageView(context);
        imageView.setContentDescription("QStory表情面板");
        imageView.setOnClickListener(new ViewOnClickListenerC4015(context, 16));
        imageView.setImageDrawable(c7250.f17950);
        return imageView;
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Member memberM12414;
        new Thread(new RunnableC1945(this, 19)).start();
        Member member = null;
        if (!AbstractC3888.m7256()) {
            C7254 c7254 = new C7254(this);
            Method methodM12409 = AbstractC7162.m12409("com.tencent.mobileqq.activity.aio.panel.PanelIconLinearLayout", null, Void.TYPE, new Class[]{AbstractC7166.m12425("com.tencent.mobileqq.activity.aio.core.BaseChatPie")});
            methodM12409.setAccessible(true);
            m12389(methodM12409, new C3191(c7254, 14));
            return;
        }
        C7254 c72542 = new C7254(this);
        Method[] declaredMethods = AbstractC7166.m12425("com.tencent.qqnt.aio.shortcutbar.PanelIconLinearLayout").getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Method method = declaredMethods[i2];
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 3 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == String.class) {
                member = method;
                break;
            }
            i2++;
        }
        if (member == null) {
            C3466.m5899("No method found");
            return;
        }
        m12389(member, new C3191(c72542, 15));
        m12389(m12530(), new C7092(10));
        int i3 = AbstractC7187.f17853;
        if (i3 >= 6458) {
            if (i3 > 5028) {
                C7164 c7164M12412 = C7164.m12412("com.tencent.qqnt.aio.menu.ui.QQCustomMenuExpandableLayout");
                String strM14532 = "setMenu";
                C2080 c2080 = c7164M12412.f17803;
                c2080.f3963 = strM14532;
                c2080.f3964 = new Class[]{Object.class, View.class};
                memberM12414 = c7164M12412.m12414();
            } else {
                C7164 c7164M124122 = C7164.m12412("com.tencent.qqnt.aio.menu.ui.QQCustomMenuNoIconLayout");
                String strM145322 = "setMenu";
                C2080 c20802 = c7164M124122.f17803;
                c20802.f3963 = strM145322;
                c20802.f3964 = new Class[]{Object.class};
                memberM12414 = c7164M124122.m12414();
            }
            m12390(memberM12414, new C7092(11));
            return;
        }
        Class clsM12425 = AbstractC7166.m12425("com.tencent.mobileqq.aio.msg.AIOMsgItem");
        String[] strArr = {"com.tencent.mobileqq.aio.msglist.holder.component.pic.AIOPicContentComponent", "com.tencent.mobileqq.aio.msglist.holder.component.mix.AIOMixContentComponent"};
        Class clsM124252 = AbstractC7166.m12425("com.tencent.mobileqq.aio.msglist.holder.component.BaseContentComponent");
        C7164 c7164M12413 = C7164.m12413(clsM124252);
        c7164M12413.f17803.f3962 = clsM12425;
        Method methodM12414 = c7164M12413.m12414();
        C7164 c7164M124132 = C7164.m12413(clsM124252);
        c7164M124132.f17803.f3962 = List.class;
        Method methodM124142 = c7164M124132.m12414();
        for (int i4 = 0; i4 < 2; i4++) {
            C7164 c7164M124123 = C7164.m12412(strArr[i4]);
            String name = methodM124142.getName();
            C2080 c20803 = c7164M124123.f17803;
            c20803.f3963 = name;
            c20803.f3962 = List.class;
            m12389(c7164M124123.m12414(), new C7246(clsM12425, methodM12414, i));
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return " ̶因̶为̶F̶u̶n̶P̶a̶n̶e̶l̶的̶Q̶T̶o̶o̶l̶表̶情̶面̶板̶#̶2̶难̶用̶ , 所以有了这个从QTool移植适配来的表情面板#1 , 表情以文件夹组保存在" + AbstractC4765.m8874() + "/Pic/单击可以复制";
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11796(C3902 c3902) {
        m12530();
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11806() {
        return new ViewOnClickListenerC6365(13);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m12532() {
        boolean zM12458 = AbstractC7176.m12458(AbstractC7187.f17852);
        if (this.f17950 == null || this.f17949 != zM12458) {
            String str = this.f17951;
            if (!new File(str).exists()) {
                AbstractC4765.m8876(AbstractC7187.f17852.getDrawable(C0328R.drawable.emo_icon), str, Bitmap.CompressFormat.PNG);
                AbstractC7014.m12151("表情面板图标初始化完毕");
            }
            String str2 = this.f17952;
            if (!new File(str2).exists()) {
                AbstractC4765.m8876(AbstractC7187.f17852.getDrawable(C0328R.drawable.night_emo_icon), str2, Bitmap.CompressFormat.WEBP);
                AbstractC7014.m12151("深色模式表情面板图标初始化完毕");
            }
            this.f17949 = zM12458;
            if (zM12458) {
                this.f17950 = AbstractC4765.m8862(AbstractC7187.f17852, str2);
            } else {
                this.f17950 = AbstractC4765.m8862(AbstractC7187.f17852, str);
            }
        }
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11795(C3902 c3902) {
    }
}

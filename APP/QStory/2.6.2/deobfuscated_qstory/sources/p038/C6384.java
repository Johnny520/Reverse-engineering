package p038;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.material.ripple.RunnableC1107;
import androidx.compose.runtime.internal.C1245;
import androidx.fragment.app.C2358;
import bsh.C2632;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3069;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.textfield.ViewOnClickListenerC3182;
import io.ktor.client.plugins.AbstractC3932;
import java.io.File;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5532;
import p009.InterfaceC6152;
import p010.AbstractC6154;
import p022.C6267;
import p026.AbstractC6293;
import p032.AbstractC6314;
import p032.AbstractC6318;
import p032.C6316;
import p033.AbstractC6333;
import p035.AbstractC6340;
import p053.AbstractC6560;
import p392.AbstractC9124;
import p394.C9127;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6384 extends AbstractC6293 implements InterfaceC6152 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public BitmapDrawable f17525;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f17526 = AbstractC3932.m8313().concat("/\u6ed1\u7a3d.png");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f17527 = AbstractC3932.m8313().concat("/\u6697\u9ed1\u6ed1\u7a3d.png");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f17524 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static Method m11917() {
        C9127 c9127 = new C9127();
        c9127.m14689("com.tencent.mobileqq.aio.input.simpleui");
        c9127.m14688("updateSimpleUI");
        c9127.f25516 = Void.TYPE;
        return c9127.m14693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static ImageView m11918(C6384 c6384, Context context) {
        c6384.m11919();
        ImageView imageView = new ImageView(context);
        imageView.setContentDescription("QStory\u8868\u60c5\u9762\u677f");
        imageView.setOnClickListener(new ViewOnClickListenerC3182(context, 15));
        imageView.setImageDrawable(c6384.f17525);
        return imageView;
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        Member memberM11827;
        new Thread(new RunnableC1107(this, 19)).start();
        Member member = null;
        if (!AbstractC6560.m12011()) {
            C6401 c6401 = new C6401(this);
            Method methodM11822 = AbstractC6314.m11822("com.tencent.mobileqq.activity.aio.panel.PanelIconLinearLayout", null, Void.TYPE, new Class[]{AbstractC6318.m11838("com.tencent.mobileqq.activity.aio.core.BaseChatPie")});
            methodM11822.setAccessible(true);
            m11802(methodM11822, new C2358(c6401, 14));
            return;
        }
        C6401 c64012 = new C6401(this);
        Method[] declaredMethods = AbstractC6318.m11838("com.tencent.qqnt.aio.shortcutbar.PanelIconLinearLayout").getDeclaredMethods();
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
            C2632.m5294("No method found");
            return;
        }
        m11802(member, new C2358(c64012, 15));
        m11802(m11917(), new C6267(10));
        int i3 = AbstractC6340.f17461;
        if (i3 >= 6458) {
            if (i3 > 5028) {
                C6316 c6316M11825 = C6316.m11825("com.tencent.qqnt.aio.menu.ui.QQCustomMenuExpandableLayout");
                String strM6668 = "setMenu";
                C1245 c1245 = c6316M11825.f17409;
                c1245.f3617 = strM6668;
                c1245.f3618 = new Class[]{Object.class, View.class};
                memberM11827 = c6316M11825.m11827();
            } else {
                C6316 c6316M118252 = C6316.m11825("com.tencent.qqnt.aio.menu.ui.QQCustomMenuNoIconLayout");
                String strM66682 = "setMenu";
                C1245 c12452 = c6316M118252.f17409;
                c12452.f3617 = strM66682;
                c12452.f3618 = new Class[]{Object.class};
                memberM11827 = c6316M118252.m11827();
            }
            m11803(memberM11827, new C6267(11));
            return;
        }
        Class clsM11838 = AbstractC6318.m11838("com.tencent.mobileqq.aio.msg.AIOMsgItem");
        String[] strArr = {"com.tencent.mobileqq.aio.msglist.holder.component.pic.AIOPicContentComponent", "com.tencent.mobileqq.aio.msglist.holder.component.mix.AIOMixContentComponent"};
        Class clsM118382 = AbstractC6318.m11838("com.tencent.mobileqq.aio.msglist.holder.component.BaseContentComponent");
        C6316 c6316M11826 = C6316.m11826(clsM118382);
        c6316M11826.f17409.f3616 = clsM11838;
        Method methodM11827 = c6316M11826.m11827();
        C6316 c6316M118262 = C6316.m11826(clsM118382);
        c6316M118262.f17409.f3616 = List.class;
        Method methodM118272 = c6316M118262.m11827();
        for (int i4 = 0; i4 < 2; i4++) {
            C6316 c6316M118253 = C6316.m11825(strArr[i4]);
            String name = methodM118272.getName();
            C1245 c12453 = c6316M118253.f17409;
            c12453.f3617 = name;
            c12453.f3616 = List.class;
            m11802(c6316M118253.m11827(), new C6402(clsM11838, methodM11827, i));
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return " \u0336\u56e0\u0336\u4e3a\u0336F\u0336u\u0336n\u0336P\u0336a\u0336n\u0336e\u0336l\u0336\u7684\u0336Q\u0336T\u0336o\u0336o\u0336l\u0336\u8868\u0336\u60c5\u0336\u9762\u0336\u677f\u0336#\u03362\u0336\u96be\u0336\u7528\u0336 , \u6240\u4ee5\u6709\u4e86\u8fd9\u4e2a\u4eceQTool\u79fb\u690d\u9002\u914d\u6765\u7684\u8868\u60c5\u9762\u677f#1 , \u8868\u60c5\u4ee5\u6587\u4ef6\u5939\u7ec4\u4fdd\u5b58\u5728" + AbstractC3932.m8313() + "/Pic/\u5355\u51fb\u53ef\u4ee5\u590d\u5236";
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11180(C3069 c3069) {
        m11917();
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11193() {
        return new ViewOnClickListenerC5532(12);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m11919() {
        boolean zM11886 = AbstractC6333.m11886(AbstractC6340.f17460);
        if (this.f17525 == null || this.f17524 != zM11886) {
            String str = this.f17526;
            if (!new File(str).exists()) {
                AbstractC9124.m14677(AbstractC6340.f17460.getDrawable(R.drawable.emo_icon), str, Bitmap.CompressFormat.PNG);
                AbstractC6154.m11561("\u8868\u60c5\u9762\u677f\u56fe\u6807\u521d\u59cb\u5316\u5b8c\u6bd5");
            }
            String str2 = this.f17527;
            if (!new File(str2).exists()) {
                AbstractC9124.m14677(AbstractC6340.f17460.getDrawable(R.drawable.night_emo_icon), str2, Bitmap.CompressFormat.WEBP);
                AbstractC6154.m11561("\u6df1\u8272\u6a21\u5f0f\u8868\u60c5\u9762\u677f\u56fe\u6807\u521d\u59cb\u5316\u5b8c\u6bd5");
            }
            this.f17524 = zM11886;
            if (zM11886) {
                this.f17525 = AbstractC9124.m14665(AbstractC6340.f17460, str2);
            } else {
                this.f17525 = AbstractC9124.m14665(AbstractC6340.f17460, str);
            }
        }
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11179(C3069 c3069) {
    }
}

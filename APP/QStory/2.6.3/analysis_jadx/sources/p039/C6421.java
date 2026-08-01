package p039;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.material.ripple.RunnableC1107;
import androidx.compose.runtime.internal.C1245;
import androidx.fragment.app.C2358;
import bsh.C2633;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3070;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.textfield.ViewOnClickListenerC3183;
import io.ktor.client.plugins.AbstractC3933;
import java.io.File;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5533;
import p010.AbstractC6185;
import p019.C6263;
import p026.AbstractC6311;
import p027.InterfaceC6317;
import p033.AbstractC6333;
import p033.AbstractC6337;
import p033.C6335;
import p034.AbstractC6347;
import p036.AbstractC6358;
import p287.AbstractC8405;
import p392.C9098;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6421 extends AbstractC6311 implements InterfaceC6317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public BitmapDrawable f17605;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f17606 = AbstractC3933.m8315().concat(AbstractC8405.m13972(181));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f17607 = AbstractC3933.m8315().concat(AbstractC8405.m13972(182));

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f17604 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static Method m11971() {
        C9098 c9098 = new C9098();
        c9098.m14688(AbstractC8405.m13972(188));
        c9098.m14687(AbstractC8405.m13972(189));
        c9098.f25493 = Void.TYPE;
        return c9098.m14686();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static ImageView m11972(C6421 c6421, Context context) {
        c6421.m11973();
        ImageView imageView = new ImageView(context);
        imageView.setContentDescription(AbstractC8405.m13972(187));
        imageView.setOnClickListener(new ViewOnClickListenerC3183(context, 16));
        imageView.setImageDrawable(c6421.f17605);
        return imageView;
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        Member memberM11855;
        new Thread(new RunnableC1107(this, 19)).start();
        Member member = null;
        if (!AbstractC3056.m6696()) {
            C6425 c6425 = new C6425(this);
            Method methodM11850 = AbstractC6333.m11850(AbstractC8405.m13972(174), null, Void.TYPE, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(175))});
            methodM11850.setAccessible(true);
            m11830(methodM11850, new C2358(c6425, 14));
            return;
        }
        C6425 c64252 = new C6425(this);
        Method[] declaredMethods = AbstractC6337.m11866(AbstractC8405.m13972(176)).getDeclaredMethods();
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
            C2633.m5339(AbstractC8405.m13972(177));
            return;
        }
        m11830(member, new C2358(c64252, 15));
        m11830(m11971(), new C6263(10));
        int i3 = AbstractC6358.f17508;
        if (i3 >= 6458) {
            if (i3 > 5028) {
                C6335 c6335M11853 = C6335.m11853(AbstractC8405.m13972(158));
                String strM13973 = AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵喵");
                C1245 c1245 = c6335M11853.f17458;
                c1245.f3618 = strM13973;
                c1245.f3619 = new Class[]{Object.class, View.class};
                memberM11855 = c6335M11853.m11855();
            } else {
                C6335 c6335M118532 = C6335.m11853(AbstractC8405.m13972(159));
                String strM139732 = AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵喵");
                C1245 c12452 = c6335M118532.f17458;
                c12452.f3618 = strM139732;
                c12452.f3619 = new Class[]{Object.class};
                memberM11855 = c6335M118532.m11855();
            }
            m11831(memberM11855, new C6263(11));
            return;
        }
        Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(160));
        String[] strArr = {AbstractC8405.m13972(161), AbstractC8405.m13972(162)};
        Class clsM118662 = AbstractC6337.m11866(AbstractC8405.m13972(163));
        C6335 c6335M11854 = C6335.m11854(clsM118662);
        c6335M11854.f17458.f3617 = clsM11866;
        Method methodM11855 = c6335M11854.m11855();
        C6335 c6335M118542 = C6335.m11854(clsM118662);
        c6335M118542.f17458.f3617 = List.class;
        Method methodM118552 = c6335M118542.m11855();
        for (int i4 = 0; i4 < 2; i4++) {
            C6335 c6335M118533 = C6335.m11853(strArr[i4]);
            String name = methodM118552.getName();
            C1245 c12453 = c6335M118533.f17458;
            c12453.f3618 = name;
            c12453.f3617 = List.class;
            m11830(c6335M118533.m11855(), new C6417(clsM11866, methodM11855, i));
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(183) + AbstractC3933.m8315() + AbstractC8405.m13972(184);
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11237(C3070 c3070) {
        m11971();
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11247() {
        return new ViewOnClickListenerC5533(13);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m11973() {
        boolean zM11899 = AbstractC6347.m11899(AbstractC6358.f17507);
        if (this.f17605 == null || this.f17604 != zM11899) {
            String str = this.f17606;
            if (!new File(str).exists()) {
                AbstractC3933.m8317(AbstractC6358.f17507.getDrawable(R.drawable.emo_icon), str, Bitmap.CompressFormat.PNG);
                AbstractC6185.m11592(AbstractC8405.m13972(185));
            }
            String str2 = this.f17607;
            if (!new File(str2).exists()) {
                AbstractC3933.m8317(AbstractC6358.f17507.getDrawable(R.drawable.night_emo_icon), str2, Bitmap.CompressFormat.WEBP);
                AbstractC6185.m11592(AbstractC8405.m13972(186));
            }
            this.f17604 = zM11899;
            if (zM11899) {
                this.f17605 = AbstractC3933.m8303(AbstractC6358.f17507, str2);
            } else {
                this.f17605 = AbstractC3933.m8303(AbstractC6358.f17507, str);
            }
        }
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11236(C3070 c3070) {
    }
}

package p321;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.material.ripple.RunnableC1107;
import androidx.compose.runtime.internal.C1245;
import bsh.C2633;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.textfield.ViewOnClickListenerC3183;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import io.ktor.client.plugins.AbstractC3933;
import java.io.File;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p026.C6313;
import p026.InterfaceC6312;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p033.C6335;
import p036.AbstractC6358;
import p039.C6417;
import p039.ViewOnLongClickListenerC6406;
import p075.C6958;
import p144.C7547;
import p287.AbstractC8405;
import p323.C8726;
import p392.C9098;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子哲楪.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏哲兰世;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏世兰哲", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C8698 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C6958 f24520;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C8726 f24521 = new C8726();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public BitmapDrawable f24522;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f24523;

    static {
        AbstractC8405.m13972(2680);
        AbstractC8405.m13972(2681);
        f24520 = new C6958(23);
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        final int i;
        Method method;
        Method methodM11855;
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        new Thread(new RunnableC1107(this, 26)).start();
        if (AbstractC3056.m6696()) {
            Method[] declaredMethods = AbstractC6337.m11866(AbstractC8405.m13972(176)).getDeclaredMethods();
            AbstractC8405.m13972(1555);
            declaredMethods.getClass();
            int length = declaredMethods.length;
            final int i2 = 0;
            int i3 = 0;
            while (true) {
                i = 1;
                if (i3 >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i3];
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 3 && AbstractC4395.m8907(parameterTypes[0], Integer.TYPE) && AbstractC4395.m8907(parameterTypes[1], String.class)) {
                    break;
                } else {
                    i3++;
                }
            }
            if (method == null) {
                C2633.m5339(AbstractC8405.m13972(2682));
                return;
            }
            m11830(method, new InterfaceC6312(this) { // from class: 飘花落叶言苏世兰子哲楪.飘花落叶言子楪苏世兰哲

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C8698 f24510;

                {
                    this.f24510 = this;
                }

                @Override // p026.InterfaceC6312
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                    int i4 = i2;
                    C8698 c8698 = this.f24510;
                    switch (i4) {
                        case 0:
                            C6958 c6958 = C8698.f24520;
                            Object obj = methodHookParam.thisObject;
                            AbstractC8405.m13972(2146);
                            obj.getClass();
                            LinearLayout linearLayout = (LinearLayout) obj;
                            Context context = linearLayout.getContext();
                            ViewGroup.LayoutParams layoutParams = linearLayout.getChildAt(0).getLayoutParams();
                            AbstractC8405.m13972(2685);
                            layoutParams.getClass();
                            context.getClass();
                            c8698.m14420();
                            ImageView imageView = new ImageView(context);
                            imageView.setContentDescription(AbstractC8405.m13972(2684));
                            imageView.setOnClickListener(new ViewOnClickListenerC3183(c8698, 22));
                            imageView.setImageDrawable(c8698.f24522);
                            linearLayout.addView(imageView, linearLayout.getChildCount() - 2, (LinearLayout.LayoutParams) layoutParams);
                            break;
                        default:
                            C6958 c69582 = C8698.f24520;
                            ImageButton imageButton = (ImageButton) AbstractC6336.m11859(ImageButton.class, AbstractC8405.m13973("喵喵喵呜呜呜呜喵"), methodHookParam.thisObject);
                            if (imageButton != null) {
                                imageButton.setOnLongClickListener(new ViewOnLongClickListenerC6406(c8698));
                            }
                            break;
                    }
                }
            });
            C9098 c9098 = new C9098();
            c9098.m14688(AbstractC8405.m13972(188));
            c9098.m14687(AbstractC8405.m13972(189));
            c9098.f25493 = Void.TYPE;
            Member memberM14686 = c9098.m14686();
            AbstractC8405.m13972(2683);
            memberM14686.getClass();
            m11830(memberM14686, new InterfaceC6312(this) { // from class: 飘花落叶言苏世兰子哲楪.飘花落叶言子楪苏世兰哲

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C8698 f24510;

                {
                    this.f24510 = this;
                }

                @Override // p026.InterfaceC6312
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                    int i4 = i;
                    C8698 c8698 = this.f24510;
                    switch (i4) {
                        case 0:
                            C6958 c6958 = C8698.f24520;
                            Object obj = methodHookParam.thisObject;
                            AbstractC8405.m13972(2146);
                            obj.getClass();
                            LinearLayout linearLayout = (LinearLayout) obj;
                            Context context = linearLayout.getContext();
                            ViewGroup.LayoutParams layoutParams = linearLayout.getChildAt(0).getLayoutParams();
                            AbstractC8405.m13972(2685);
                            layoutParams.getClass();
                            context.getClass();
                            c8698.m14420();
                            ImageView imageView = new ImageView(context);
                            imageView.setContentDescription(AbstractC8405.m13972(2684));
                            imageView.setOnClickListener(new ViewOnClickListenerC3183(c8698, 22));
                            imageView.setImageDrawable(c8698.f24522);
                            linearLayout.addView(imageView, linearLayout.getChildCount() - 2, (LinearLayout.LayoutParams) layoutParams);
                            break;
                        default:
                            C6958 c69582 = C8698.f24520;
                            ImageButton imageButton = (ImageButton) AbstractC6336.m11859(ImageButton.class, AbstractC8405.m13973("喵喵喵呜呜呜呜喵"), methodHookParam.thisObject);
                            if (imageButton != null) {
                                imageButton.setOnLongClickListener(new ViewOnLongClickListenerC6406(c8698));
                            }
                            break;
                    }
                }
            });
            int i4 = AbstractC6358.f17508;
            if (i4 >= 6458) {
                if (i4 > 5028) {
                    C6335 c6335M11853 = C6335.m11853(AbstractC8405.m13972(158));
                    String strM13973 = AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵喵");
                    C1245 c1245 = c6335M11853.f17458;
                    c1245.f3618 = strM13973;
                    c1245.f3619 = new Class[]{Object.class, View.class};
                    methodM11855 = c6335M11853.m11855();
                    methodM11855.getClass();
                } else {
                    C6335 c6335M118532 = C6335.m11853(AbstractC8405.m13972(159));
                    String strM139732 = AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵喵");
                    C1245 c12452 = c6335M118532.f17458;
                    c12452.f3618 = strM139732;
                    c12452.f3619 = new Class[]{Object.class};
                    methodM11855 = c6335M118532.m11855();
                    methodM11855.getClass();
                }
                XposedBridge.hookMethod(methodM11855, new C6313(this, 10, new C7547(16)));
                return;
            }
            Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(160));
            String[] strArr = {AbstractC8405.m13972(161), AbstractC8405.m13972(162)};
            Class clsM118662 = AbstractC6337.m11866(AbstractC8405.m13972(163));
            C6335 c6335M11854 = C6335.m11854(clsM118662);
            c6335M11854.f17458.f3617 = clsM11866;
            Method methodM118552 = c6335M11854.m11855();
            C6335 c6335M118542 = C6335.m11854(clsM118662);
            c6335M118542.f17458.f3617 = List.class;
            Method methodM118553 = c6335M118542.m11855();
            while (i2 < 2) {
                C6335 c6335M118533 = C6335.m11853(strArr[i2]);
                String name = methodM118553.getName();
                C1245 c12453 = c6335M118533.f17458;
                c12453.f3618 = name;
                c12453.f3617 = List.class;
                XposedBridge.hookMethod(c6335M118533.m11855(), new C6313(this, new C6417(clsM11866, methodM118552, i)));
                i2++;
            }
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        String strM13972 = AbstractC8405.m13972(2679);
        C8688.f24506.getClass();
        return strM13972.concat(C8688.m14410());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m14420() {
        Context context = AbstractC6358.f17507;
        AbstractC8405.m13972(2157);
        context.getClass();
        f24520.getClass();
        AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
        boolean z = (context.getResources().getConfiguration().uiMode & 48) == 32;
        if (this.f24522 == null || this.f24523 != z) {
            File file = new File(AbstractC3933.m8315(), AbstractC8405.m13972(2680));
            if (!file.exists()) {
                AbstractC3933.m8317(AbstractC6358.f17507.getDrawable(R.drawable.emo_icon), file.getAbsolutePath(), Bitmap.CompressFormat.PNG);
            }
            File file2 = new File(AbstractC3933.m8315(), AbstractC8405.m13972(2681));
            if (!file2.exists()) {
                AbstractC3933.m8317(AbstractC6358.f17507.getDrawable(R.drawable.night_emo_icon), file2.getAbsolutePath(), Bitmap.CompressFormat.WEBP);
            }
            this.f24523 = z;
            this.f24522 = z ? AbstractC3933.m8303(AbstractC6358.f17507, file2.getAbsolutePath()) : AbstractC3933.m8303(AbstractC6358.f17507, file.getAbsolutePath());
        }
    }
}

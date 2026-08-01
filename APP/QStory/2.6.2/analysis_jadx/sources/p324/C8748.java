package p324;

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
import bsh.C2632;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.textfield.ViewOnClickListenerC3182;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import io.ktor.client.plugins.AbstractC3932;
import java.io.File;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p026.C6295;
import p026.InterfaceC6294;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p032.C6316;
import p035.AbstractC6340;
import p038.C6402;
import p038.ViewOnLongClickListenerC6380;
import p053.AbstractC6560;
import p075.C6960;
import p144.C7546;
import p319.C8703;
import p392.AbstractC9124;
import p394.C9127;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪子哲.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏哲兰世;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C8748 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C6960 f24653;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C8703 f24654 = new C8703();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public BitmapDrawable f24655;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f24656;

    static {
        AbstractC3056.m6668(-3937834361626559911L);
        AbstractC3056.m6668(-3937834254252377511L);
        f24653 = new C6960(23);
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        final int i;
        Method method;
        Method methodM11827;
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        new Thread(new RunnableC1107(this, 29)).start();
        if (AbstractC6560.m12011()) {
            Method[] declaredMethods = AbstractC6318.m11838(AbstractC3056.m6668(-3937576015048738215L)).getDeclaredMethods();
            AbstractC3056.m6668(-3937714304405734823L);
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
                if (parameterTypes.length == 3 && AbstractC4394.m8917(parameterTypes[0], Integer.TYPE) && AbstractC4394.m8917(parameterTypes[1], String.class)) {
                    break;
                } else {
                    i3++;
                }
            }
            if (method == null) {
                C2632.m5294(AbstractC3056.m6668(-3937834297202050471L));
                return;
            }
            m11802(method, new InterfaceC6294(this) { // from class: 飘花落叶言苏世兰楪子哲.飘花落叶言子楪苏世兰哲

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C8748 f24643;

                {
                    this.f24643 = this;
                }

                @Override // p026.InterfaceC6294
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                    int i4 = i2;
                    C8748 c8748 = this.f24643;
                    switch (i4) {
                        case 0:
                            C6960 c6960 = C8748.f24653;
                            Object obj = methodHookParam.thisObject;
                            AbstractC3056.m6668(-3937788981002110375L);
                            obj.getClass();
                            LinearLayout linearLayout = (LinearLayout) obj;
                            Context context = linearLayout.getContext();
                            ViewGroup.LayoutParams layoutParams = linearLayout.getChildAt(0).getLayoutParams();
                            AbstractC3056.m6668(-3937833936424797607L);
                            layoutParams.getClass();
                            context.getClass();
                            c8748.m14415();
                            ImageView imageView = new ImageView(context);
                            imageView.setContentDescription(AbstractC3056.m6668(-3937833902065059239L));
                            imageView.setOnClickListener(new ViewOnClickListenerC3182(c8748, 24));
                            imageView.setImageDrawable(c8748.f24655);
                            linearLayout.addView(imageView, linearLayout.getChildCount() - 2, (LinearLayout.LayoutParams) layoutParams);
                            break;
                        default:
                            C6960 c69602 = C8748.f24653;
                            ImageButton imageButton = (ImageButton) AbstractC6317.m11831(ImageButton.class, AbstractC3056.m6668(-3937575770235602343L), methodHookParam.thisObject);
                            if (imageButton != null) {
                                imageButton.setOnLongClickListener(new ViewOnLongClickListenerC6380(c8748));
                            }
                            break;
                    }
                }
            });
            C9127 c9127 = new C9127();
            c9127.m14689(AbstractC3056.m6668(-3937574795278026151L));
            c9127.m14688(AbstractC3056.m6668(-3937574554759857575L));
            c9127.f25516 = Void.TYPE;
            Member memberM14693 = c9127.m14693();
            AbstractC3056.m6668(-3937833966489568679L);
            memberM14693.getClass();
            m11802(memberM14693, new InterfaceC6294(this) { // from class: 飘花落叶言苏世兰楪子哲.飘花落叶言子楪苏世兰哲

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C8748 f24643;

                {
                    this.f24643 = this;
                }

                @Override // p026.InterfaceC6294
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                    int i4 = i;
                    C8748 c8748 = this.f24643;
                    switch (i4) {
                        case 0:
                            C6960 c6960 = C8748.f24653;
                            Object obj = methodHookParam.thisObject;
                            AbstractC3056.m6668(-3937788981002110375L);
                            obj.getClass();
                            LinearLayout linearLayout = (LinearLayout) obj;
                            Context context = linearLayout.getContext();
                            ViewGroup.LayoutParams layoutParams = linearLayout.getChildAt(0).getLayoutParams();
                            AbstractC3056.m6668(-3937833936424797607L);
                            layoutParams.getClass();
                            context.getClass();
                            c8748.m14415();
                            ImageView imageView = new ImageView(context);
                            imageView.setContentDescription(AbstractC3056.m6668(-3937833902065059239L));
                            imageView.setOnClickListener(new ViewOnClickListenerC3182(c8748, 24));
                            imageView.setImageDrawable(c8748.f24655);
                            linearLayout.addView(imageView, linearLayout.getChildCount() - 2, (LinearLayout.LayoutParams) layoutParams);
                            break;
                        default:
                            C6960 c69602 = C8748.f24653;
                            ImageButton imageButton = (ImageButton) AbstractC6317.m11831(ImageButton.class, AbstractC3056.m6668(-3937575770235602343L), methodHookParam.thisObject);
                            if (imageButton != null) {
                                imageButton.setOnLongClickListener(new ViewOnLongClickListenerC6380(c8748));
                            }
                            break;
                    }
                }
            });
            int i4 = AbstractC6340.f17461;
            if (i4 >= 6458) {
                if (i4 > 5028) {
                    C6316 c6316M11825 = C6316.m11825(AbstractC3056.m6668(-3937564998457623975L));
                    String strM6668 = AbstractC3056.m6668(-3937564835248866727L);
                    C1245 c1245 = c6316M11825.f17409;
                    c1245.f3617 = strM6668;
                    c1245.f3618 = new Class[]{Object.class, View.class};
                    methodM11827 = c6316M11825.m11827();
                    methodM11827.getClass();
                } else {
                    C6316 c6316M118252 = C6316.m11825(AbstractC3056.m6668(-3937564732169651623L));
                    String strM66682 = AbstractC3056.m6668(-3937564835248866727L);
                    C1245 c12452 = c6316M118252.f17409;
                    c12452.f3617 = strM66682;
                    c12452.f3618 = new Class[]{Object.class};
                    methodM11827 = c6316M118252.m11827();
                    methodM11827.getClass();
                }
                XposedBridge.hookMethod(methodM11827, new C6295(this, 10, new C7546(21)));
                return;
            }
            Class clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937564551781025191L));
            String[] strArr = {AbstractC3056.m6668(-3937578192597157287L), AbstractC3056.m6668(-3937577870474610087L)};
            Class clsM118382 = AbstractC6318.m11838(AbstractC3056.m6668(-3937563963370505639L));
            C6316 c6316M11826 = C6316.m11826(clsM118382);
            c6316M11826.f17409.f3616 = clsM11838;
            Method methodM118272 = c6316M11826.m11827();
            C6316 c6316M118262 = C6316.m11826(clsM118382);
            c6316M118262.f17409.f3616 = List.class;
            Method methodM118273 = c6316M118262.m11827();
            while (i2 < 2) {
                C6316 c6316M118253 = C6316.m11825(strArr[i2]);
                String name = methodM118273.getName();
                C1245 c12453 = c6316M118253.f17409;
                c12453.f3617 = name;
                c12453.f3616 = List.class;
                XposedBridge.hookMethod(c6316M118253.m11827(), new C6295(this, new C6402(clsM11838, methodM118272, i)));
                i2++;
            }
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        String strM6668 = AbstractC3056.m6668(-3937834387396363687L);
        C8738.f24639.getClass();
        return strM6668.concat(C8738.m14405());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m14415() {
        Context context = AbstractC6340.f17460;
        AbstractC3056.m6668(-3937787851425711527L);
        context.getClass();
        f24653.getClass();
        AbstractC3056.m6668(-3937616005489231271L);
        boolean z = (context.getResources().getConfiguration().uiMode & 48) == 32;
        if (this.f24655 == null || this.f24656 != z) {
            File file = new File(AbstractC3932.m8313(), AbstractC3056.m6668(-3937834361626559911L));
            if (!file.exists()) {
                AbstractC9124.m14677(AbstractC6340.f17460.getDrawable(R.drawable.emo_icon), file.getAbsolutePath(), Bitmap.CompressFormat.PNG);
            }
            File file2 = new File(AbstractC3932.m8313(), AbstractC3056.m6668(-3937834254252377511L));
            if (!file2.exists()) {
                AbstractC9124.m14677(AbstractC6340.f17460.getDrawable(R.drawable.night_emo_icon), file2.getAbsolutePath(), Bitmap.CompressFormat.WEBP);
            }
            this.f24656 = z;
            this.f24655 = z ? AbstractC9124.m14665(AbstractC6340.f17460, file2.getAbsolutePath()) : AbstractC9124.m14665(AbstractC6340.f17460, file.getAbsolutePath());
        }
    }
}

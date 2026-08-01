package p337;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.material.ripple.RunnableC1945;
import androidx.compose.runtime.internal.C2080;
import bsh.C3466;
import com.bumptech.glide.AbstractC3888;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.textfield.ViewOnClickListenerC4015;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import io.ktor.client.plugins.AbstractC4765;
import java.io.File;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p042.C7142;
import p042.InterfaceC7141;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import p052.AbstractC7187;
import p055.C7246;
import p055.ViewOnLongClickListenerC7235;
import p091.C7787;
import p160.C8376;
import p303.AbstractC9234;
import p339.C9555;
import p408.C9927;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子哲楪.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m151d2 = {"L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏哲兰世;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏世兰哲", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C9527 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C7787 f24865;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C9555 f24866 = new C9555();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public BitmapDrawable f24867;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f24868;

    static {
        AbstractC9234.m14531(2680);
        AbstractC9234.m14531(2681);
        f24865 = new C7787(23);
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        final int i;
        Method method;
        Method methodM12414;
        AbstractC9234.m14531(1257);
        classLoader.getClass();
        new Thread(new RunnableC1945(this, 26)).start();
        if (AbstractC3888.m7256()) {
            Method[] declaredMethods = AbstractC7166.m12425(AbstractC9234.m14531(176)).getDeclaredMethods();
            AbstractC9234.m14531(1555);
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
                if (parameterTypes.length == 3 && AbstractC5227.m9466(parameterTypes[0], Integer.TYPE) && AbstractC5227.m9466(parameterTypes[1], String.class)) {
                    break;
                } else {
                    i3++;
                }
            }
            if (method == null) {
                C3466.m5899(AbstractC9234.m14531(2682));
                return;
            }
            m12389(method, new InterfaceC7141(this) { // from class: 飘花落叶言苏世兰子哲楪.飘花落叶言子楪苏世兰哲

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C9527 f24855;

                {
                    this.f24855 = this;
                }

                @Override // p042.InterfaceC7141
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                    int i4 = i2;
                    C9527 c9527 = this.f24855;
                    switch (i4) {
                        case 0:
                            C7787 c7787 = C9527.f24865;
                            Object obj = methodHookParam.thisObject;
                            AbstractC9234.m14531(2146);
                            obj.getClass();
                            LinearLayout linearLayout = (LinearLayout) obj;
                            Context context = linearLayout.getContext();
                            ViewGroup.LayoutParams layoutParams = linearLayout.getChildAt(0).getLayoutParams();
                            AbstractC9234.m14531(2685);
                            layoutParams.getClass();
                            context.getClass();
                            c9527.m14979();
                            ImageView imageView = new ImageView(context);
                            imageView.setContentDescription(AbstractC9234.m14531(2684));
                            imageView.setOnClickListener(new ViewOnClickListenerC4015(c9527, 22));
                            imageView.setImageDrawable(c9527.f24867);
                            linearLayout.addView(imageView, linearLayout.getChildCount() - 2, (LinearLayout.LayoutParams) layoutParams);
                            break;
                        default:
                            C7787 c77872 = C9527.f24865;
                            ImageButton imageButton = (ImageButton) AbstractC7165.m12418(ImageButton.class, AbstractC9234.m14532("喵喵喵呜呜呜呜喵"), methodHookParam.thisObject);
                            if (imageButton != null) {
                                imageButton.setOnLongClickListener(new ViewOnLongClickListenerC7235(c9527));
                            }
                            break;
                    }
                }
            });
            C9927 c9927 = new C9927();
            c9927.m15247(AbstractC9234.m14531(188));
            c9927.m15246(AbstractC9234.m14531(189));
            c9927.f25838 = Void.TYPE;
            Member memberM15245 = c9927.m15245();
            AbstractC9234.m14531(2683);
            memberM15245.getClass();
            m12389(memberM15245, new InterfaceC7141(this) { // from class: 飘花落叶言苏世兰子哲楪.飘花落叶言子楪苏世兰哲

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C9527 f24855;

                {
                    this.f24855 = this;
                }

                @Override // p042.InterfaceC7141
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                    int i4 = i;
                    C9527 c9527 = this.f24855;
                    switch (i4) {
                        case 0:
                            C7787 c7787 = C9527.f24865;
                            Object obj = methodHookParam.thisObject;
                            AbstractC9234.m14531(2146);
                            obj.getClass();
                            LinearLayout linearLayout = (LinearLayout) obj;
                            Context context = linearLayout.getContext();
                            ViewGroup.LayoutParams layoutParams = linearLayout.getChildAt(0).getLayoutParams();
                            AbstractC9234.m14531(2685);
                            layoutParams.getClass();
                            context.getClass();
                            c9527.m14979();
                            ImageView imageView = new ImageView(context);
                            imageView.setContentDescription(AbstractC9234.m14531(2684));
                            imageView.setOnClickListener(new ViewOnClickListenerC4015(c9527, 22));
                            imageView.setImageDrawable(c9527.f24867);
                            linearLayout.addView(imageView, linearLayout.getChildCount() - 2, (LinearLayout.LayoutParams) layoutParams);
                            break;
                        default:
                            C7787 c77872 = C9527.f24865;
                            ImageButton imageButton = (ImageButton) AbstractC7165.m12418(ImageButton.class, AbstractC9234.m14532("喵喵喵呜呜呜呜喵"), methodHookParam.thisObject);
                            if (imageButton != null) {
                                imageButton.setOnLongClickListener(new ViewOnLongClickListenerC7235(c9527));
                            }
                            break;
                    }
                }
            });
            int i4 = AbstractC7187.f17853;
            if (i4 >= 6458) {
                if (i4 > 5028) {
                    C7164 c7164M12412 = C7164.m12412(AbstractC9234.m14531(158));
                    String strM14532 = AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵喵");
                    C2080 c2080 = c7164M12412.f17803;
                    c2080.f3963 = strM14532;
                    c2080.f3964 = new Class[]{Object.class, View.class};
                    methodM12414 = c7164M12412.m12414();
                    methodM12414.getClass();
                } else {
                    C7164 c7164M124122 = C7164.m12412(AbstractC9234.m14531(159));
                    String strM145322 = AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵喵");
                    C2080 c20802 = c7164M124122.f17803;
                    c20802.f3963 = strM145322;
                    c20802.f3964 = new Class[]{Object.class};
                    methodM12414 = c7164M124122.m12414();
                    methodM12414.getClass();
                }
                XposedBridge.hookMethod(methodM12414, new C7142(this, 10, new C8376(16)));
                return;
            }
            Class clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(160));
            String[] strArr = {AbstractC9234.m14531(161), AbstractC9234.m14531(162)};
            Class clsM124252 = AbstractC7166.m12425(AbstractC9234.m14531(163));
            C7164 c7164M12413 = C7164.m12413(clsM124252);
            c7164M12413.f17803.f3962 = clsM12425;
            Method methodM124142 = c7164M12413.m12414();
            C7164 c7164M124132 = C7164.m12413(clsM124252);
            c7164M124132.f17803.f3962 = List.class;
            Method methodM124143 = c7164M124132.m12414();
            while (i2 < 2) {
                C7164 c7164M124123 = C7164.m12412(strArr[i2]);
                String name = methodM124143.getName();
                C2080 c20803 = c7164M124123.f17803;
                c20803.f3963 = name;
                c20803.f3962 = List.class;
                XposedBridge.hookMethod(c7164M124123.m12414(), new C7142(this, new C7246(clsM12425, methodM124142, i)));
                i2++;
            }
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        String strM14531 = AbstractC9234.m14531(2679);
        C9517.f24851.getClass();
        return strM14531.concat(C9517.m14969());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m14979() {
        Context context = AbstractC7187.f17852;
        AbstractC9234.m14531(2157);
        context.getClass();
        f24865.getClass();
        AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
        boolean z = (context.getResources().getConfiguration().uiMode & 48) == 32;
        if (this.f24867 == null || this.f24868 != z) {
            File file = new File(AbstractC4765.m8874(), AbstractC9234.m14531(2680));
            if (!file.exists()) {
                AbstractC4765.m8876(AbstractC7187.f17852.getDrawable(C0328R.drawable.emo_icon), file.getAbsolutePath(), Bitmap.CompressFormat.PNG);
            }
            File file2 = new File(AbstractC4765.m8874(), AbstractC9234.m14531(2681));
            if (!file2.exists()) {
                AbstractC4765.m8876(AbstractC7187.f17852.getDrawable(C0328R.drawable.night_emo_icon), file2.getAbsolutePath(), Bitmap.CompressFormat.WEBP);
            }
            this.f24868 = z;
            this.f24867 = z ? AbstractC4765.m8862(AbstractC7187.f17852, file2.getAbsolutePath()) : AbstractC4765.m8862(AbstractC7187.f17852, file.getAbsolutePath());
        }
    }
}

package top.suzhelan.qstory.hook.item;

import android.graphics.Bitmap;
import com.bumptech.glide.C3902;
import de.robv.android.xposed.XC_MethodHook;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5976;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p042.InterfaceC7141;
import p043.InterfaceC7146;
import p405.AbstractC9919;
import p408.C9927;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世苏兰楪;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6732 extends AbstractC7140 implements InterfaceC7146 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ThreadLocal f16418 = new ThreadLocal();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public List f16419 = EmptyList.INSTANCE;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Method m11855() throws NoSuchMethodException {
        C9927 c9927 = new C9927();
        c9927.m15247("com.tencent.mobileqq.pic.compress");
        c9927.m15246("compress.Utils", "compressQualityWithBaseline()");
        Class clsM15228 = AbstractC9919.m15228("com.tencent.mobileqq.pic.CompressInfo");
        clsM15228.getClass();
        c9927.m15244(String.class, Bitmap.class, Integer.TYPE, String.class, clsM15228);
        Method methodM15248 = c9927.m15248();
        methodM15248.getClass();
        return methodM15248;
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) throws NoSuchMethodException {
        "classLoader";
        classLoader.getClass();
        m11856();
        for (Method method : this.f16419) {
            final int i = 0;
            m12390(method, new InterfaceC7141(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子哲世苏楪兰

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C6732 f16420;

                {
                    this.f16420 = this;
                }

                @Override // p042.InterfaceC7141
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                    String str;
                    int i2 = i;
                    C6732 c6732 = this.f16420;
                    switch (i2) {
                        case 0:
                            c6732.f16418.set(Boolean.TRUE);
                            break;
                        case 1:
                            c6732.f16418.set(Boolean.FALSE);
                            break;
                        case 2:
                            Object obj = methodHookParam.args[0];
                            str = obj instanceof String ? (String) obj : null;
                            if (str != null && AbstractC5976.m10735(str, "portrait", false)) {
                                c6732.f16418.set(Boolean.TRUE);
                            }
                            break;
                        case 3:
                            Object obj2 = methodHookParam.args[1];
                            str = obj2 instanceof String ? (String) obj2 : null;
                            if (str != null && AbstractC5976.m10735(str, "portrait", false)) {
                                c6732.f16418.set(Boolean.FALSE);
                            }
                            break;
                        default:
                            if (methodHookParam.args[0] == Bitmap.CompressFormat.JPEG && AbstractC5227.m9466(c6732.f16418.get(), Boolean.TRUE)) {
                                methodHookParam.args[0] = Bitmap.CompressFormat.PNG;
                            }
                            break;
                    }
                }
            });
            final int i2 = 1;
            m12389(method, new InterfaceC7141(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子哲世苏楪兰

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C6732 f16420;

                {
                    this.f16420 = this;
                }

                @Override // p042.InterfaceC7141
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                    String str;
                    int i22 = i2;
                    C6732 c6732 = this.f16420;
                    switch (i22) {
                        case 0:
                            c6732.f16418.set(Boolean.TRUE);
                            break;
                        case 1:
                            c6732.f16418.set(Boolean.FALSE);
                            break;
                        case 2:
                            Object obj = methodHookParam.args[0];
                            str = obj instanceof String ? (String) obj : null;
                            if (str != null && AbstractC5976.m10735(str, "portrait", false)) {
                                c6732.f16418.set(Boolean.TRUE);
                            }
                            break;
                        case 3:
                            Object obj2 = methodHookParam.args[1];
                            str = obj2 instanceof String ? (String) obj2 : null;
                            if (str != null && AbstractC5976.m10735(str, "portrait", false)) {
                                c6732.f16418.set(Boolean.FALSE);
                            }
                            break;
                        default:
                            if (methodHookParam.args[0] == Bitmap.CompressFormat.JPEG && AbstractC5227.m9466(c6732.f16418.get(), Boolean.TRUE)) {
                                methodHookParam.args[0] = Bitmap.CompressFormat.PNG;
                            }
                            break;
                    }
                }
            });
        }
        Method methodM11855 = m11855();
        final int i3 = 2;
        m12390(methodM11855, new InterfaceC7141(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子哲世苏楪兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6732 f16420;

            {
                this.f16420 = this;
            }

            @Override // p042.InterfaceC7141
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                String str;
                int i22 = i3;
                C6732 c6732 = this.f16420;
                switch (i22) {
                    case 0:
                        c6732.f16418.set(Boolean.TRUE);
                        break;
                    case 1:
                        c6732.f16418.set(Boolean.FALSE);
                        break;
                    case 2:
                        Object obj = methodHookParam.args[0];
                        str = obj instanceof String ? (String) obj : null;
                        if (str != null && AbstractC5976.m10735(str, "portrait", false)) {
                            c6732.f16418.set(Boolean.TRUE);
                        }
                        break;
                    case 3:
                        Object obj2 = methodHookParam.args[1];
                        str = obj2 instanceof String ? (String) obj2 : null;
                        if (str != null && AbstractC5976.m10735(str, "portrait", false)) {
                            c6732.f16418.set(Boolean.FALSE);
                        }
                        break;
                    default:
                        if (methodHookParam.args[0] == Bitmap.CompressFormat.JPEG && AbstractC5227.m9466(c6732.f16418.get(), Boolean.TRUE)) {
                            methodHookParam.args[0] = Bitmap.CompressFormat.PNG;
                        }
                        break;
                }
            }
        });
        final int i4 = 3;
        m12390(methodM11855, new InterfaceC7141(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子哲世苏楪兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6732 f16420;

            {
                this.f16420 = this;
            }

            @Override // p042.InterfaceC7141
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                String str;
                int i22 = i4;
                C6732 c6732 = this.f16420;
                switch (i22) {
                    case 0:
                        c6732.f16418.set(Boolean.TRUE);
                        break;
                    case 1:
                        c6732.f16418.set(Boolean.FALSE);
                        break;
                    case 2:
                        Object obj = methodHookParam.args[0];
                        str = obj instanceof String ? (String) obj : null;
                        if (str != null && AbstractC5976.m10735(str, "portrait", false)) {
                            c6732.f16418.set(Boolean.TRUE);
                        }
                        break;
                    case 3:
                        Object obj2 = methodHookParam.args[1];
                        str = obj2 instanceof String ? (String) obj2 : null;
                        if (str != null && AbstractC5976.m10735(str, "portrait", false)) {
                            c6732.f16418.set(Boolean.FALSE);
                        }
                        break;
                    default:
                        if (methodHookParam.args[0] == Bitmap.CompressFormat.JPEG && AbstractC5227.m9466(c6732.f16418.get(), Boolean.TRUE)) {
                            methodHookParam.args[0] = Bitmap.CompressFormat.PNG;
                        }
                        break;
                }
            }
        });
        final int i5 = 4;
        m12390(Bitmap.class.getDeclaredMethod("compress", Bitmap.CompressFormat.class, Integer.TYPE, OutputStream.class), new InterfaceC7141(this) { // from class: top.suzhelan.qstory.hook.item.飘花落叶言子哲世苏楪兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6732 f16420;

            {
                this.f16420 = this;
            }

            @Override // p042.InterfaceC7141
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                String str;
                int i22 = i5;
                C6732 c6732 = this.f16420;
                switch (i22) {
                    case 0:
                        c6732.f16418.set(Boolean.TRUE);
                        break;
                    case 1:
                        c6732.f16418.set(Boolean.FALSE);
                        break;
                    case 2:
                        Object obj = methodHookParam.args[0];
                        str = obj instanceof String ? (String) obj : null;
                        if (str != null && AbstractC5976.m10735(str, "portrait", false)) {
                            c6732.f16418.set(Boolean.TRUE);
                        }
                        break;
                    case 3:
                        Object obj2 = methodHookParam.args[1];
                        str = obj2 instanceof String ? (String) obj2 : null;
                        if (str != null && AbstractC5976.m10735(str, "portrait", false)) {
                            c6732.f16418.set(Boolean.FALSE);
                        }
                        break;
                    default:
                        if (methodHookParam.args[0] == Bitmap.CompressFormat.JPEG && AbstractC5227.m9466(c6732.f16418.get(), Boolean.TRUE)) {
                            methodHookParam.args[0] = Bitmap.CompressFormat.PNG;
                        }
                        break;
                }
            }
        });
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "可以上传自定义半透明的PNG格式头像 不要和上传全透明头像一起打开";
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11795(C3902 c3902) {
        "finder";
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11796(C3902 c3902) throws NoSuchMethodException {
        "finder";
        m11856();
        m11855();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m11856() {
        Class<?> declaringClass;
        if (this.f16419.isEmpty()) {
            C9927 c9927 = new C9927();
            c9927.m15247("com.tencent.mobileqq.activity.photo");
            c9927.m15246("StoreFileTask");
            Method methodM15245 = c9927.m15245();
            if (methodM15245 == null) {
                C9927 c99272 = new C9927();
                c99272.m15247("com.tencent.mobileqq.activity.photo");
                c99272.m15246("sdcardfull", "oom");
                methodM15245 = c99272.m15245();
            }
            if (methodM15245 == null || (declaringClass = methodM15245.getDeclaringClass()) == null) {
                return;
            }
            Method[] declaredMethods = declaringClass.getDeclaredMethods();
            "getDeclaredMethods(...)";
            declaredMethods.getClass();
            ArrayList arrayList = new ArrayList();
            for (Method method : declaredMethods) {
                if (AbstractC5227.m9466(method.getName(), "doInBackground")) {
                    arrayList.add(method);
                }
            }
            this.f16419 = arrayList;
        }
    }
}

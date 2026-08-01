package p144;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.foundation.text.selection.C0916;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.android.dex.DexException;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.C3062;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.util.C3771;
import de.robv.android.xposed.XC_MethodHook;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.C5176;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4347;
import kotlin.jvm.internal.AbstractC4388;
import kotlinx.serialization.UnknownFieldException;
import lin.xposed.hook.javaplugin.view.C5547;
import lin.xposed.hook.javaplugin.view.C5549;
import p010.C6189;
import p010.InterfaceC6190;
import p010.InterfaceC6192;
import p018.AbstractC6253;
import p026.InterfaceC6312;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p036.AbstractC6358;
import p038.C6377;
import p075.C6958;
import p217.AbstractC7969;
import p217.InterfaceC7963;
import p257.C8208;
import p287.AbstractC8405;
import p321.C8694;
import p321.C8698;
import p321.CallableC8697;
import p322.C8700;
import p323.C8719;
import p327.C8747;
import p327.C8748;
import p327.C8750;
import p327.C8752;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7547 implements InterfaceC6192, InterfaceC6190, InterfaceC6312, InterfaceC7963 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f20427;

    public /* synthetic */ C7547(int i) {
        this.f20427 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m12764(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m12765(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new RuntimeException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m12766(int i, Object obj, Object obj2, String str) {
        throw new JSONException(str + obj + obj2 + i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m12767(int i) {
        throw new UnknownFieldException(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m12768(Object obj, String str) {
        throw new DexException(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m12769(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static /* synthetic */ void m12770(Object obj, String str) {
        throw new DexException(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static /* synthetic */ void m12771(String str, Object obj, Object obj2, Object obj3) {
        throw new JSONException(str + obj + obj2 + obj3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m12772(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static /* synthetic */ void m12773(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static /* synthetic */ void m12774(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static /* synthetic */ void m12775(String str, Object obj, Throwable th) {
        throw new JSONException(str + obj, th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static /* synthetic */ void m12776(StringBuilder sb, int i) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // p217.InterfaceC7963
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean mo12777(AbstractC7969 abstractC7969, View view, int i) {
        AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        AbstractC8405.m13972(1293);
        C8694 c8694 = (C8694) abstractC7969.f22042.get(i);
        int i2 = 2;
        C0916 c0916 = new C0916(abstractC7969, i, i2);
        AbstractC8405.m13972(2748);
        c8694.getClass();
        AbstractC8405.m13972(2749);
        Activity activityM6653 = AbstractC3055.m6653();
        if (activityM6653 == null) {
            return true;
        }
        ImageView imageView = new ImageView(activityM6653);
        int iM11754 = AbstractC6253.m11754(activityM6653, 40.0f);
        imageView.setPadding(iM11754, iM11754, iM11754, 0);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ((C3062) ComponentCallbacks2C3058.m6765(AbstractC6358.f17507).m6799(new File(c8694.f24516)).m6614()).m6789(imageView);
        int color = AbstractC6358.f17507.getColor(R.color.warning);
        C8208 c8208M13729 = C8208.m13729(AbstractC8405.m13972(2751), AbstractC8405.m13972(2750));
        c8208M13729.f22616 = new C8719(imageView, 0);
        c8208M13729.mo13721();
        c8208M13729.mo13719(AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜呜喵呜~呜呜喵呜呜喵呜喵~呜喵喵喵喵喵喵呜~呜呜呜呜呜呜喵喵~呜呜喵喵呜喵喵喵"), new C5547(c8694, i2, c0916));
        C3771 c3771 = new C3771();
        c3771.f11742 = color;
        c3771.f11741 = true;
        c8208M13729.f22624 = c3771;
        c8208M13729.mo13721();
        String strM13973 = AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜喵呜喵~呜呜呜喵呜呜喵喵~呜喵喵喵呜呜呜喵~呜呜喵呜喵喵呜呜~呜呜呜喵喵呜喵喵");
        C5549 c5549 = new C5549(5);
        c8208M13729.f22629 = strM13973;
        c8208M13729.f22622 = c5549;
        c8208M13729.mo13721();
        return true;
    }

    @Override // p010.InterfaceC6190
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo8621(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = 1;
        switch (this.f20427) {
            case 14:
                methodHookParam.setResult(Boolean.FALSE);
                break;
            case 15:
            case 20:
            case 21:
            default:
                if (AbstractC8405.m13972(1127).equals((String) methodHookParam.args[0])) {
                    methodHookParam.setResult(Boolean.FALSE);
                }
                break;
            case 16:
                C6958 c6958 = C8698.f24520;
                Object objM11858 = AbstractC6336.m11858(List.class, methodHookParam.args[0]);
                AbstractC8405.m13972(2016);
                objM11858.getClass();
                List listM8891 = AbstractC4388.m8891(objM11858);
                Object objM118582 = AbstractC6336.m11858(AbstractC6337.m11866(AbstractC8405.m13972(160)), listM8891.get(0));
                AbstractC8405.m13972(2686);
                objM118582.getClass();
                Object objM11961 = C6377.m11961(objM118582, AbstractC8405.m13972(180), R.mipmap.ic_launcher_round, new CallableC8697(objM118582, i));
                objM11961.getClass();
                listM8891.add(0, objM11961);
                break;
            case 17:
                List list = C8700.f24526;
                try {
                    Object obj = methodHookParam.thisObject;
                    View view = obj instanceof View ? (View) obj : null;
                    if (view != null) {
                        view.setVisibility(8);
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = 0;
                            layoutParams.height = 0;
                            view.setLayoutParams(layoutParams);
                        }
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 18:
                List list2 = C8700.f24526;
                methodHookParam.setResult(Boolean.TRUE);
                break;
            case 19:
                List list3 = C8700.f24526;
                Object obj2 = methodHookParam.args[0];
                if (obj2 != null) {
                    String[] strArr = {AbstractC8405.m13972(2651), AbstractC8405.m13972(2652), AbstractC8405.m13972(2653), AbstractC8405.m13972(2654), AbstractC8405.m13972(2655), AbstractC8405.m13972(2656)};
                    for (int i2 = 0; i2 < 6; i2++) {
                        try {
                            Field declaredField = obj2.getClass().getDeclaredField(strArr[i2]);
                            declaredField.setAccessible(true);
                            declaredField.set(obj2, "");
                        } catch (Throwable unused2) {
                        }
                    }
                    break;
                }
                break;
            case 22:
                HashMap map = C8750.f24666;
                C8750.f24666.remove((Activity) methodHookParam.thisObject);
                System.gc();
                break;
            case 23:
                HashMap map2 = C8748.f24662;
                C8748.f24662.remove((Activity) methodHookParam.thisObject);
                System.gc();
                break;
            case 24:
                HashMap map3 = C8747.f24661;
                C8747.m14440((Activity) methodHookParam.thisObject, false);
                break;
            case 25:
                HashMap map4 = C8747.f24661;
                C8747.f24661.remove((Activity) methodHookParam.thisObject);
                System.gc();
                break;
            case 26:
                HashMap map5 = C8752.f24670;
                C8752.f24670.remove((Activity) methodHookParam.thisObject);
                System.gc();
                break;
            case 27:
                Object[] objArr = methodHookParam.args;
                Object obj3 = objArr[0];
                if (obj3 != null) {
                    if (obj3 instanceof Integer) {
                        if (((Integer) obj3).intValue() == 1003) {
                            methodHookParam.args[0] = 2333;
                        }
                    } else if (((Integer) objArr[1]).intValue() == 1003) {
                        methodHookParam.args[1] = 2333;
                    }
                    break;
                }
                break;
            case 28:
                if (AbstractC8405.m13972(1128).equals(methodHookParam.args[0]) && ((Integer) methodHookParam.args[1]).intValue() == 2333) {
                    methodHookParam.args[1] = 1003;
                    break;
                }
                break;
        }
    }

    @Override // p010.InterfaceC6192
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Object mo10889(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f20427) {
            case 13:
                Object[] objArr = methodHookParam.args;
                AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜");
                objArr.getClass();
                Object objM8853 = AbstractC4347.m8853(objArr);
                AbstractC8405.m13972(2786);
                objM8853.getClass();
                C6189 c6189 = new C6189();
                c6189.m11613(AbstractC4344.m8796((ArrayList) objM8853));
                Object objM11614 = c6189.m11614();
                String[] strArr = {AbstractC8405.m13973("喵呜喵喵喵喵喵喵"), AbstractC8405.m13973("喵呜喵喵喵喵喵呜"), AbstractC8405.m13973("喵呜喵喵喵呜喵喵"), AbstractC8405.m13973("喵呜喵喵喵呜呜喵"), AbstractC8405.m13973("喵呜喵喵喵喵呜喵")};
                int i = 0;
                while (true) {
                    if (i < 5) {
                        String str = strArr[i];
                        if (objM11614 instanceof JSONObject) {
                            objM11614 = ((JSONObject) objM11614).get(str);
                            i++;
                        } else {
                            objM11614 = null;
                        }
                    }
                }
                if ((objM11614 != null ? objM11614.toString() : null) != null) {
                    return null;
                }
                return C5176.f14739;
            default:
                return null;
        }
    }
}

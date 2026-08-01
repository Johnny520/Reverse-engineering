package p160;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.foundation.text.selection.C1754;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.android.dex.DexException;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.C3894;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.util.C4603;
import de.robv.android.xposed.XC_MethodHook;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5220;
import kotlinx.serialization.UnknownFieldException;
import lin.xposed.hook.javaplugin.view.C6378;
import lin.xposed.hook.javaplugin.view.C6380;
import p026.C7018;
import p026.InterfaceC7019;
import p026.InterfaceC7021;
import p034.AbstractC7082;
import p042.InterfaceC7141;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p052.AbstractC7187;
import p054.C7206;
import p091.C7787;
import p233.AbstractC8798;
import p233.InterfaceC8792;
import p273.C9037;
import p303.AbstractC9234;
import p337.C9523;
import p337.C9527;
import p337.CallableC9526;
import p338.C9529;
import p339.C9548;
import p343.C9576;
import p343.C9577;
import p343.C9579;
import p343.C9581;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8376 implements InterfaceC7021, InterfaceC7019, InterfaceC7141, InterfaceC8792 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f20772;

    public /* synthetic */ C8376(int i) {
        this.f20772 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m13323(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m13324(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new RuntimeException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m13325(int i, Object obj, Object obj2, String str) {
        throw new JSONException(str + obj + obj2 + i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m13326(int i) {
        throw new UnknownFieldException(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m13327(Object obj, String str) {
        throw new DexException(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m13328(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static /* synthetic */ void m13329(Object obj, String str) {
        throw new DexException(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static /* synthetic */ void m13330(String str, Object obj, Object obj2, Object obj3) {
        throw new JSONException(str + obj + obj2 + obj3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m13331(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static /* synthetic */ void m13332(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static /* synthetic */ void m13333(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static /* synthetic */ void m13334(String str, Object obj, Throwable th) {
        throw new JSONException(str + obj, th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static /* synthetic */ void m13335(StringBuilder sb, int i) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // p233.InterfaceC8792
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean mo13336(AbstractC8798 abstractC8798, View view, int i) {
        AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        AbstractC9234.m14531(1293);
        C9523 c9523 = (C9523) abstractC8798.f22387.get(i);
        int i2 = 2;
        C1754 c1754 = new C1754(abstractC8798, i, i2);
        AbstractC9234.m14531(2748);
        c9523.getClass();
        AbstractC9234.m14531(2749);
        Activity activityM7213 = AbstractC3887.m7213();
        if (activityM7213 == null) {
            return true;
        }
        ImageView imageView = new ImageView(activityM7213);
        int iM12313 = AbstractC7082.m12313(activityM7213, 40.0f);
        imageView.setPadding(iM12313, iM12313, iM12313, 0);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ((C3894) ComponentCallbacks2C3890.m7325(AbstractC7187.f17852).m7359(new File(c9523.f24861)).m7174()).m7349(imageView);
        int color = AbstractC7187.f17852.getColor(C0328R.color.warning);
        C9037 c9037M14288 = C9037.m14288(AbstractC9234.m14531(2751), AbstractC9234.m14531(2750));
        c9037M14288.f22961 = new C9548(imageView, 0);
        c9037M14288.mo14280();
        c9037M14288.mo14278(AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜呜呜呜呜喵呜~呜呜喵呜呜喵呜喵~呜喵喵喵喵喵喵呜~呜呜呜呜呜呜喵喵~呜呜喵喵呜喵喵喵"), new C6378(c9523, i2, c1754));
        C4603 c4603 = new C4603();
        c4603.f12087 = color;
        c4603.f12086 = true;
        c9037M14288.f22969 = c4603;
        c9037M14288.mo14280();
        String strM14532 = AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜呜呜呜喵呜喵~呜呜呜喵呜呜喵喵~呜喵喵喵呜呜呜喵~呜呜喵呜喵喵呜呜~呜呜呜喵喵呜喵喵");
        C6380 c6380 = new C6380(5);
        c9037M14288.f22974 = strM14532;
        c9037M14288.f22967 = c6380;
        c9037M14288.mo14280();
        return true;
    }

    @Override // p026.InterfaceC7019
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo9180(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = 1;
        switch (this.f20772) {
            case 14:
                methodHookParam.setResult(Boolean.FALSE);
                break;
            case 15:
            case 20:
            case 21:
            default:
                if (AbstractC9234.m14531(1127).equals((String) methodHookParam.args[0])) {
                    methodHookParam.setResult(Boolean.FALSE);
                }
                break;
            case 16:
                C7787 c7787 = C9527.f24865;
                Object objM12417 = AbstractC7165.m12417(List.class, methodHookParam.args[0]);
                AbstractC9234.m14531(2016);
                objM12417.getClass();
                List listM9450 = AbstractC5220.m9450(objM12417);
                Object objM124172 = AbstractC7165.m12417(AbstractC7166.m12425(AbstractC9234.m14531(160)), listM9450.get(0));
                AbstractC9234.m14531(2686);
                objM124172.getClass();
                Object objM12520 = C7206.m12520(objM124172, AbstractC9234.m14531(180), C0328R.mipmap.ic_launcher_round, new CallableC9526(objM124172, i));
                objM12520.getClass();
                listM9450.add(0, objM12520);
                break;
            case 17:
                List list = C9529.f24871;
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
                List list2 = C9529.f24871;
                methodHookParam.setResult(Boolean.TRUE);
                break;
            case 19:
                List list3 = C9529.f24871;
                Object obj2 = methodHookParam.args[0];
                if (obj2 != null) {
                    String[] strArr = {AbstractC9234.m14531(2651), AbstractC9234.m14531(2652), AbstractC9234.m14531(2653), AbstractC9234.m14531(2654), AbstractC9234.m14531(2655), AbstractC9234.m14531(2656)};
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
                HashMap map = C9579.f25011;
                C9579.f25011.remove((Activity) methodHookParam.thisObject);
                System.gc();
                break;
            case 23:
                HashMap map2 = C9577.f25007;
                C9577.f25007.remove((Activity) methodHookParam.thisObject);
                System.gc();
                break;
            case 24:
                HashMap map3 = C9576.f25006;
                C9576.m14999((Activity) methodHookParam.thisObject, false);
                break;
            case 25:
                HashMap map4 = C9576.f25006;
                C9576.f25006.remove((Activity) methodHookParam.thisObject);
                System.gc();
                break;
            case 26:
                HashMap map5 = C9581.f25015;
                C9581.f25015.remove((Activity) methodHookParam.thisObject);
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
                if (AbstractC9234.m14531(1128).equals(methodHookParam.args[0]) && ((Integer) methodHookParam.args[1]).intValue() == 2333) {
                    methodHookParam.args[1] = 1003;
                    break;
                }
                break;
        }
    }

    @Override // p026.InterfaceC7021
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Object mo11448(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f20772) {
            case 13:
                Object[] objArr = methodHookParam.args;
                AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜");
                objArr.getClass();
                Object objM9412 = AbstractC5179.m9412(objArr);
                AbstractC9234.m14531(2786);
                objM9412.getClass();
                C7018 c7018 = new C7018();
                c7018.m12172(AbstractC5176.m9355((ArrayList) objM9412));
                Object objM12173 = c7018.m12173();
                String[] strArr = {AbstractC9234.m14532("喵呜喵喵喵喵喵喵"), AbstractC9234.m14532("喵呜喵喵喵喵喵呜"), AbstractC9234.m14532("喵呜喵喵喵呜喵喵"), AbstractC9234.m14532("喵呜喵喵喵呜呜喵"), AbstractC9234.m14532("喵呜喵喵喵喵呜喵")};
                int i = 0;
                while (true) {
                    if (i < 5) {
                        String str = strArr[i];
                        if (objM12173 instanceof JSONObject) {
                            objM12173 = ((JSONObject) objM12173).get(str);
                            i++;
                        } else {
                            objM12173 = null;
                        }
                    }
                }
                if ((objM12173 != null ? objM12173.toString() : null) != null) {
                    return null;
                }
                return C6008.f15084;
            default:
                return null;
        }
    }
}

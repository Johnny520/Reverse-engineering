package androidx.compose.p001ui.platform;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.inputmethodservice.InputMethodService;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.p001ui.graphics.AbstractC2438;
import androidx.compose.p001ui.graphics.C2449;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.semantics.AbstractC2778;
import androidx.compose.p001ui.semantics.AbstractC2792;
import androidx.compose.p001ui.semantics.AbstractC2794;
import androidx.compose.p001ui.semantics.C2776;
import androidx.compose.p001ui.semantics.C2782;
import androidx.compose.p001ui.semantics.C2788;
import androidx.compose.p001ui.semantics.C2789;
import androidx.compose.p001ui.semantics.C2790;
import androidx.compose.p001ui.semantics.C2791;
import androidx.compose.p001ui.state.ToggleableState;
import androidx.compose.p001ui.text.C2867;
import androidx.compose.p001ui.text.C2902;
import androidx.compose.p001ui.viewinterop.AbstractC2909;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.snapshots.InterfaceC2118;
import androidx.window.area.AbstractC3400;
import androidx.window.layout.C3426;
import androidx.window.layout.C3427;
import androidx.window.layout.C3432;
import androidx.window.layout.InterfaceC3425;
import com.davemorrissey.labs.subscaleview.C0328R;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.util.C5043;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.InterfaceC6000;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import p050.AbstractC7176;
import p068.InterfaceC7387;
import p128.C8157;
import p150.C8337;
import p150.C8339;
import p150.C8340;
import p221.C8723;
import p267.AbstractC9004;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2751 implements InterfaceC2699 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Class[] f6006 = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final int m4174(View view, int i) {
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i3 = i2;
            }
            i2++;
            Object objM8873 = AbstractC4765.m8873(view);
            view = objM8873 instanceof View ? (View) objM8873 : null;
        }
        return i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C2583 m4175(C2583 c2583, InterfaceC7387 interfaceC7387) {
        for (C2583 c2583M3816 = c2583.m3816(); c2583M3816 != null; c2583M3816 = c2583M3816.m3816()) {
            if (((Boolean) interfaceC7387.invoke(c2583M3816)).booleanValue()) {
                return c2583M3816;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final boolean m4176(Object obj) {
        if (obj instanceof InterfaceC2118) {
            InterfaceC2118 interfaceC2118 = (InterfaceC2118) obj;
            if (interfaceC2118.mo2843() == C2188.f4265 || interfaceC2118.mo2843() == C2188.f4267 || interfaceC2118.mo2843() == C2188.f4264) {
                Object value = interfaceC2118.getValue();
                if (value == null) {
                    return true;
                }
                return m4176(value);
            }
        } else if (!(obj instanceof InterfaceC6000) || !(obj instanceof Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (f6006[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2752 m4177(View view) {
        Context context = view.getContext();
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper.getBaseContext();
        }
        baseContext = null;
        if (baseContext == null) {
            Configuration configuration = context.getResources().getConfiguration();
            C8723 c8723M12463 = AbstractC7176.m12463(context);
            long jM14193 = AbstractC9004.m14193(configuration.screenWidthDp, configuration.screenHeightDp);
            long jMo1902 = c8723M12463.mo1902(jM14193);
            return new C2752((((long) ((int) Float.intBitsToFloat((int) (jMo1902 & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (jMo1902 >> 32)))) << 32), jM14193);
        }
        InterfaceC3425.f8118.getClass();
        C3426 c3426 = C3426.f8120;
        C3427 c3427 = C3426.f8119;
        c3427.getClass();
        ContextWrapper contextWrapper2 = (ContextWrapper) baseContext;
        int i = Build.VERSION.SDK_INT;
        C3432 c3432Mo13288 = (i >= 34 ? C8337.f20720 : i >= 30 ? C8339.f20722 : C8340.f20728).mo13288(contextWrapper2, c3427.f8121);
        long jHeight = (4294967295L & ((long) c3432Mo13288.m5673().height())) | (((long) c3432Mo13288.m5673().width()) << 32);
        return new C2752(jHeight, AbstractC7176.m12463(baseContext).mo1899(AbstractC1298.m1700(jHeight)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m4178(C2788 c2788, Resources resources) {
        List list = (List) AbstractC2792.m4233(c2788.f6114, AbstractC2778.f6079);
        return !AbstractC2792.m4240(c2788) && (c2788.f6114.f6123 || (c2788.m4224() && ((list != null ? (String) AbstractC5176.m9374(list) : null) != null || m4189(c2788) != null || m4192(c2788, resources) != null || m4191(c2788))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m4179(C2788 c2788) {
        C2791 c2791M4227 = c2788.m4227();
        return !c2791M4227.f6124.m1312(AbstractC2778.f6097);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final String m4180(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final boolean m4181(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == 0.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C2867 m4182(C2791 c2791) {
        InterfaceC7387 interfaceC7387;
        ArrayList arrayList = new ArrayList();
        C2776 c2776 = (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6138);
        if (c2776 == null || (interfaceC7387 = (InterfaceC7387) c2776.f6051) == null || !((Boolean) interfaceC7387.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (C2867) arrayList.get(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final AbstractC2909 m4183(C2652 c2652, int i) {
        Object next;
        Iterator<T> it = c2652.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C2583) ((Map.Entry) next).getKey()).f5468 == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (AbstractC2909) entry.getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final String m4184(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final boolean m4185(float f, float f2, C2449 c2449) {
        C8157 c8157 = new C8157(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        C2449 c2449M3517 = AbstractC2438.m3517();
        C2449.m3538(c2449M3517, c8157);
        C2449 c2449M35172 = AbstractC2438.m3517();
        c2449M35172.m3540(c2449, c2449M3517, 1);
        boolean zIsEmpty = c2449M35172.f5070.isEmpty();
        c2449M35172.m3543();
        c2449M3517.m3543();
        return !zIsEmpty;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final boolean m4186(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C2738 m4187(View view) {
        Object tag = view.getTag(C0328R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (C2738) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final View m4188(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(m4174(view, C0328R.id.view_tree_lifecycle_owner), m4174(view, C0328R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i = 0;
        View view3 = view2;
        while (view != null) {
            if (i == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (m4187(view) == null) {
                i++;
                Object objM8873 = AbstractC4765.m8873(view);
                View view4 = view2;
                view2 = view;
                view = objM8873 instanceof View ? (View) objM8873 : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C2902 m4189(C2788 c2788) {
        C2902 c2902 = (C2902) AbstractC2792.m4233(c2788.f6114, AbstractC2778.f6071);
        List list = (List) AbstractC2792.m4233(c2788.f6114, AbstractC2778.f6063);
        return c2902 == null ? list != null ? (C2902) AbstractC5176.m9374(list) : null : c2902;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static boolean m4190() {
        try {
            if (ViewTreeObserverOnGlobalLayoutListenerC2719.f5759 == null) {
                ViewTreeObserverOnGlobalLayoutListenerC2719.f5759 = Class.forName("android.os.SystemProperties");
            }
            if (ViewTreeObserverOnGlobalLayoutListenerC2719.f5761 == null) {
                Class cls = ViewTreeObserverOnGlobalLayoutListenerC2719.f5759;
                ViewTreeObserverOnGlobalLayoutListenerC2719.f5761 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = ViewTreeObserverOnGlobalLayoutListenerC2719.f5761;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return AbstractC5227.m9466(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final boolean m4191(C2788 c2788) {
        ToggleableState toggleableState = (ToggleableState) AbstractC2792.m4233(c2788.f6114, AbstractC2778.f6059);
        C2791 c2791 = c2788.f6114;
        C2789 c2789 = (C2789) AbstractC2792.m4233(c2791, AbstractC2778.f6066);
        boolean z = toggleableState != null;
        if (((Boolean) AbstractC2792.m4233(c2791, AbstractC2778.f6068)) == null || (c2789 != null && c2789.f6118 == 4)) {
            return z;
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final String m4192(C2788 c2788, Resources resources) {
        Collection collection;
        CharSequence charSequence;
        Float fValueOf = Float.valueOf(0.0f);
        Object objM4233 = AbstractC2792.m4233(c2788.f6114, AbstractC2778.f6078);
        C2791 c2791 = c2788.f6114;
        ToggleableState toggleableState = (ToggleableState) AbstractC2792.m4233(c2791, AbstractC2778.f6059);
        C2789 c2789 = (C2789) AbstractC2792.m4233(c2791, AbstractC2778.f6066);
        Object string = null;
        if (toggleableState != null) {
            int i = AbstractC2721.f5888[toggleableState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        C5043.m9170();
                        return null;
                    }
                    if (objM4233 == null) {
                        objM4233 = resources.getString(C0328R.string.indeterminate);
                    }
                } else if (c2789 != null && c2789.f6118 == 2 && objM4233 == null) {
                    objM4233 = resources.getString(C0328R.string.state_off);
                }
            } else if (c2789 != null && c2789.f6118 == 2 && objM4233 == null) {
                objM4233 = resources.getString(C0328R.string.state_on);
            }
        }
        Boolean bool = (Boolean) AbstractC2792.m4233(c2791, AbstractC2778.f6068);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((c2789 == null || c2789.f6118 != 4) && objM4233 == null) {
                objM4233 = zBooleanValue ? resources.getString(C0328R.string.selected) : resources.getString(C0328R.string.not_selected);
            }
        }
        C2790 c2790 = (C2790) AbstractC2792.m4233(c2791, AbstractC2778.f6077);
        if (c2790 != null) {
            if (c2790 != C2790.f6119) {
                if (objM4233 == null) {
                    float fFloatValue = fValueOf.floatValue() - fValueOf.floatValue() == 0.0f ? 0.0f : (0.0f - fValueOf.floatValue()) / (fValueOf.floatValue() - fValueOf.floatValue());
                    if (fFloatValue < 0.0f) {
                        fFloatValue = 0.0f;
                    }
                    if (fFloatValue > 1.0f) {
                        fFloatValue = 1.0f;
                    }
                    objM4233 = resources.getString(C0328R.string.template_percent, Integer.valueOf(fFloatValue == 0.0f ? 0 : fFloatValue == 1.0f ? 100 : AbstractC3400.m5650(Math.round(fFloatValue * 100.0f), 1, 99)));
                }
            } else if (objM4233 == null) {
                objM4233 = resources.getString(C0328R.string.in_progress);
            }
        }
        C2782 c2782 = AbstractC2778.f6071;
        if (c2791.f6124.m1312(c2782)) {
            C2791 c2791M4227 = new C2788(c2788.f6117, true, c2788.f6115, c2791).m4227();
            Collection collection2 = (Collection) AbstractC2792.m4233(c2791M4227, AbstractC2778.f6079);
            if ((collection2 == null || collection2.isEmpty()) && (((collection = (Collection) AbstractC2792.m4233(c2791M4227, AbstractC2778.f6063)) == null || collection.isEmpty()) && ((charSequence = (CharSequence) AbstractC2792.m4233(c2791M4227, c2782)) == null || charSequence.length() == 0))) {
                string = resources.getString(C0328R.string.state_empty);
            }
            objM4233 = string;
        }
        return (String) objM4233;
    }
}

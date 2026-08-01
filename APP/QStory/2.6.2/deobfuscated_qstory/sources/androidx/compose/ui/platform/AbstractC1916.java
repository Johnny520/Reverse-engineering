package androidx.compose.ui.platform;

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
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.snapshots.InterfaceC1283;
import androidx.compose.ui.graphics.AbstractC1603;
import androidx.compose.ui.graphics.C1614;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.semantics.AbstractC1943;
import androidx.compose.ui.semantics.AbstractC1957;
import androidx.compose.ui.semantics.AbstractC1959;
import androidx.compose.ui.semantics.C1941;
import androidx.compose.ui.semantics.C1947;
import androidx.compose.ui.semantics.C1953;
import androidx.compose.ui.semantics.C1954;
import androidx.compose.ui.semantics.C1955;
import androidx.compose.ui.semantics.C1956;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.C2033;
import androidx.compose.ui.text.C2068;
import androidx.compose.ui.viewinterop.AbstractC2076;
import androidx.window.layout.C2592;
import androidx.window.layout.C2593;
import androidx.window.layout.C2598;
import androidx.window.layout.InterfaceC2591;
import com.bumptech.glide.AbstractC3055;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.util.C4210;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.InterfaceC5167;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p000.AbstractC6087;
import p052.InterfaceC6557;
import p053.AbstractC6560;
import p112.C7327;
import p134.C7507;
import p134.C7509;
import p134.C7510;
import p205.C7893;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1916 implements InterfaceC1864 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Class[] f5660 = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final int m3604(View view, int i) {
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
            Object objM6643 = AbstractC3055.m6643(view);
            view = objM6643 instanceof View ? (View) objM6643 : null;
        }
        return i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C1748 m3605(C1748 c1748, InterfaceC6557 interfaceC6557) {
        for (C1748 c1748M3246 = c1748.m3246(); c1748M3246 != null; c1748M3246 = c1748M3246.m3246()) {
            if (((Boolean) interfaceC6557.invoke(c1748M3246)).booleanValue()) {
                return c1748M3246;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final boolean m3606(Object obj) {
        if (obj instanceof InterfaceC1283) {
            InterfaceC1283 interfaceC1283 = (InterfaceC1283) obj;
            if (interfaceC1283.mo2273() == C1353.f3919 || interfaceC1283.mo2273() == C1353.f3921 || interfaceC1283.mo2273() == C1353.f3918) {
                Object value = interfaceC1283.getValue();
                if (value == null) {
                    return true;
                }
                return m3606(value);
            }
        } else if (!(obj instanceof InterfaceC5167) || !(obj instanceof Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (f5660[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1917 m3607(View view) {
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
            C7893 c7893M9889 = AbstractC4921.m9889(context);
            long jM12023 = AbstractC6560.m12023(configuration.screenWidthDp, configuration.screenHeightDp);
            long jMo1332 = c7893M9889.mo1332(jM12023);
            return new C1917((((long) ((int) Float.intBitsToFloat((int) (jMo1332 & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (jMo1332 >> 32)))) << 32), jM12023);
        }
        InterfaceC2591.f7771.getClass();
        C2592 c2592 = C2592.f7773;
        C2593 c2593 = C2592.f7772;
        c2593.getClass();
        ContextWrapper contextWrapper2 = (ContextWrapper) baseContext;
        int i = Build.VERSION.SDK_INT;
        C2598 c2598Mo12700 = (i >= 34 ? C7507.f20380 : i >= 30 ? C7509.f20382 : C7510.f20388).mo12700(contextWrapper2, c2593.f7774);
        long jHeight = (4294967295L & ((long) c2598Mo12700.m5068().height())) | (((long) c2598Mo12700.m5068().width()) << 32);
        return new C1917(jHeight, AbstractC4921.m9889(baseContext).mo1329(AbstractC8189.m13654(jHeight)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m3608(C1953 c1953, Resources resources) {
        List list = (List) AbstractC1957.m3663(c1953.f5768, AbstractC1943.f5733);
        return !AbstractC1957.m3670(c1953) && (c1953.f5768.f5777 || (c1953.m3654() && ((list != null ? (String) AbstractC4343.m8830(list) : null) != null || m3619(c1953) != null || m3622(c1953, resources) != null || m3621(c1953))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m3609(C1953 c1953) {
        C1956 c1956M3657 = c1953.m3657();
        return !c1956M3657.f5778.m751(AbstractC1943.f5751);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final String m3610(int i) {
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
    public static final boolean m3611(float[] fArr, float[] fArr2) {
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
    public static final C2033 m3612(C1956 c1956) {
        InterfaceC6557 interfaceC6557;
        ArrayList arrayList = new ArrayList();
        C1941 c1941 = (C1941) AbstractC1957.m3663(c1956, AbstractC1959.f5792);
        if (c1941 == null || (interfaceC6557 = (InterfaceC6557) c1941.f5705) == null || !((Boolean) interfaceC6557.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (C2033) arrayList.get(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final AbstractC2076 m3613(C1817 c1817, int i) {
        Object next;
        Iterator<T> it = c1817.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C1748) ((Map.Entry) next).getKey()).f5122 == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (AbstractC2076) entry.getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final String m3614(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final boolean m3615(float f, float f2, C1614 c1614) {
        C7327 c7327 = new C7327(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        C1614 c1614M2947 = AbstractC1603.m2947();
        C1614.m2968(c1614M2947, c7327);
        C1614 c1614M29472 = AbstractC1603.m2947();
        c1614M29472.m2970(c1614, c1614M2947, 1);
        boolean zIsEmpty = c1614M29472.f4724.isEmpty();
        c1614M29472.m2973();
        c1614M2947.m2973();
        return !zIsEmpty;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final boolean m3616(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C1903 m3617(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (C1903) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final View m3618(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(m3604(view, R.id.view_tree_lifecycle_owner), m3604(view, R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i = 0;
        View view3 = view2;
        while (view != null) {
            if (i == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (m3617(view) == null) {
                i++;
                Object objM6643 = AbstractC3055.m6643(view);
                View view4 = view2;
                view2 = view;
                view = objM6643 instanceof View ? (View) objM6643 : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C2068 m3619(C1953 c1953) {
        C2068 c2068 = (C2068) AbstractC1957.m3663(c1953.f5768, AbstractC1943.f5725);
        List list = (List) AbstractC1957.m3663(c1953.f5768, AbstractC1943.f5717);
        return c2068 == null ? list != null ? (C2068) AbstractC4343.m8830(list) : null : c2068;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static boolean m3620() {
        try {
            if (ViewTreeObserverOnGlobalLayoutListenerC1884.f5413 == null) {
                ViewTreeObserverOnGlobalLayoutListenerC1884.f5413 = Class.forName("android.os.SystemProperties");
            }
            if (ViewTreeObserverOnGlobalLayoutListenerC1884.f5415 == null) {
                Class cls = ViewTreeObserverOnGlobalLayoutListenerC1884.f5413;
                ViewTreeObserverOnGlobalLayoutListenerC1884.f5415 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = ViewTreeObserverOnGlobalLayoutListenerC1884.f5415;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return AbstractC4394.m8917(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final boolean m3621(C1953 c1953) {
        ToggleableState toggleableState = (ToggleableState) AbstractC1957.m3663(c1953.f5768, AbstractC1943.f5713);
        C1956 c1956 = c1953.f5768;
        C1954 c1954 = (C1954) AbstractC1957.m3663(c1956, AbstractC1943.f5720);
        boolean z = toggleableState != null;
        if (((Boolean) AbstractC1957.m3663(c1956, AbstractC1943.f5722)) == null || (c1954 != null && c1954.f5772 == 4)) {
            return z;
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final String m3622(C1953 c1953, Resources resources) {
        Collection collection;
        CharSequence charSequence;
        Float fValueOf = Float.valueOf(0.0f);
        Object objM3663 = AbstractC1957.m3663(c1953.f5768, AbstractC1943.f5732);
        C1956 c1956 = c1953.f5768;
        ToggleableState toggleableState = (ToggleableState) AbstractC1957.m3663(c1956, AbstractC1943.f5713);
        C1954 c1954 = (C1954) AbstractC1957.m3663(c1956, AbstractC1943.f5720);
        Object string = null;
        if (toggleableState != null) {
            int i = AbstractC1886.f5542[toggleableState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        C4210.m8621();
                        return null;
                    }
                    if (objM3663 == null) {
                        objM3663 = resources.getString(R.string.indeterminate);
                    }
                } else if (c1954 != null && c1954.f5772 == 2 && objM3663 == null) {
                    objM3663 = resources.getString(R.string.state_off);
                }
            } else if (c1954 != null && c1954.f5772 == 2 && objM3663 == null) {
                objM3663 = resources.getString(R.string.state_on);
            }
        }
        Boolean bool = (Boolean) AbstractC1957.m3663(c1956, AbstractC1943.f5722);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((c1954 == null || c1954.f5772 != 4) && objM3663 == null) {
                objM3663 = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        C1955 c1955 = (C1955) AbstractC1957.m3663(c1956, AbstractC1943.f5731);
        if (c1955 != null) {
            if (c1955 != C1955.f5773) {
                if (objM3663 == null) {
                    float fFloatValue = fValueOf.floatValue() - fValueOf.floatValue() == 0.0f ? 0.0f : (0.0f - fValueOf.floatValue()) / (fValueOf.floatValue() - fValueOf.floatValue());
                    if (fFloatValue < 0.0f) {
                        fFloatValue = 0.0f;
                    }
                    if (fFloatValue > 1.0f) {
                        fFloatValue = 1.0f;
                    }
                    objM3663 = resources.getString(R.string.template_percent, Integer.valueOf(fFloatValue == 0.0f ? 0 : fFloatValue == 1.0f ? 100 : AbstractC6087.m11420(Math.round(fFloatValue * 100.0f), 1, 99)));
                }
            } else if (objM3663 == null) {
                objM3663 = resources.getString(R.string.in_progress);
            }
        }
        C1947 c1947 = AbstractC1943.f5725;
        if (c1956.f5778.m751(c1947)) {
            C1956 c1956M3657 = new C1953(c1953.f5771, true, c1953.f5769, c1956).m3657();
            Collection collection2 = (Collection) AbstractC1957.m3663(c1956M3657, AbstractC1943.f5733);
            if ((collection2 == null || collection2.isEmpty()) && (((collection = (Collection) AbstractC1957.m3663(c1956M3657, AbstractC1943.f5717)) == null || collection.isEmpty()) && ((charSequence = (CharSequence) AbstractC1957.m3663(c1956M3657, c1947)) == null || charSequence.length() == 0))) {
                string = resources.getString(R.string.state_empty);
            }
            objM3663 = string;
        }
        return (String) objM3663;
    }
}

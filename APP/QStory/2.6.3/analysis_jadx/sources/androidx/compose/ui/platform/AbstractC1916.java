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
import androidx.compose.foundation.draganddrop.AbstractC0455;
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
import androidx.window.area.AbstractC2567;
import androidx.window.layout.C2593;
import androidx.window.layout.C2594;
import androidx.window.layout.C2599;
import androidx.window.layout.InterfaceC2592;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.client.plugins.AbstractC3933;
import io.ktor.util.C4211;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.InterfaceC5168;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import p034.AbstractC6347;
import p052.InterfaceC6558;
import p112.C7328;
import p134.C7508;
import p134.C7510;
import p134.C7511;
import p205.C7894;
import p251.AbstractC8175;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1916 implements InterfaceC1864 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Class[] f5661 = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final int m3614(View view, int i) {
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
            Object objM8314 = AbstractC3933.m8314(view);
            view = objM8314 instanceof View ? (View) objM8314 : null;
        }
        return i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C1748 m3615(C1748 c1748, InterfaceC6558 interfaceC6558) {
        for (C1748 c1748M3256 = c1748.m3256(); c1748M3256 != null; c1748M3256 = c1748M3256.m3256()) {
            if (((Boolean) interfaceC6558.invoke(c1748M3256)).booleanValue()) {
                return c1748M3256;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final boolean m3616(Object obj) {
        if (obj instanceof InterfaceC1283) {
            InterfaceC1283 interfaceC1283 = (InterfaceC1283) obj;
            if (interfaceC1283.mo2283() == C1353.f3920 || interfaceC1283.mo2283() == C1353.f3922 || interfaceC1283.mo2283() == C1353.f3919) {
                Object value = interfaceC1283.getValue();
                if (value == null) {
                    return true;
                }
                return m3616(value);
            }
        } else if (!(obj instanceof InterfaceC5168) || !(obj instanceof Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (f5661[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1917 m3617(View view) {
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
            C7894 c7894M11904 = AbstractC6347.m11904(context);
            long jM13634 = AbstractC8175.m13634(configuration.screenWidthDp, configuration.screenHeightDp);
            long jMo1342 = c7894M11904.mo1342(jM13634);
            return new C1917((((long) ((int) Float.intBitsToFloat((int) (jMo1342 & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (jMo1342 >> 32)))) << 32), jM13634);
        }
        InterfaceC2592.f7773.getClass();
        C2593 c2593 = C2593.f7775;
        C2594 c2594 = C2593.f7774;
        c2594.getClass();
        ContextWrapper contextWrapper2 = (ContextWrapper) baseContext;
        int i = Build.VERSION.SDK_INT;
        C2599 c2599Mo12729 = (i >= 34 ? C7508.f20375 : i >= 30 ? C7510.f20377 : C7511.f20383).mo12729(contextWrapper2, c2594.f7776);
        long jHeight = (4294967295L & ((long) c2599Mo12729.m5113().height())) | (((long) c2599Mo12729.m5113().width()) << 32);
        return new C1917(jHeight, AbstractC6347.m11904(baseContext).mo1339(AbstractC0455.m1140(jHeight)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m3618(C1953 c1953, Resources resources) {
        List list = (List) AbstractC1957.m3673(c1953.f5769, AbstractC1943.f5734);
        return !AbstractC1957.m3680(c1953) && (c1953.f5769.f5778 || (c1953.m3664() && ((list != null ? (String) AbstractC4344.m8815(list) : null) != null || m3629(c1953) != null || m3632(c1953, resources) != null || m3631(c1953))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m3619(C1953 c1953) {
        C1956 c1956M3667 = c1953.m3667();
        return !c1956M3667.f5779.m752(AbstractC1943.f5752);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final String m3620(int i) {
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
    public static final boolean m3621(float[] fArr, float[] fArr2) {
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
    public static final C2033 m3622(C1956 c1956) {
        InterfaceC6558 interfaceC6558;
        ArrayList arrayList = new ArrayList();
        C1941 c1941 = (C1941) AbstractC1957.m3673(c1956, AbstractC1959.f5793);
        if (c1941 == null || (interfaceC6558 = (InterfaceC6558) c1941.f5706) == null || !((Boolean) interfaceC6558.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (C2033) arrayList.get(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final AbstractC2076 m3623(C1817 c1817, int i) {
        Object next;
        Iterator<T> it = c1817.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C1748) ((Map.Entry) next).getKey()).f5123 == i) {
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
    public static final String m3624(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final boolean m3625(float f, float f2, C1614 c1614) {
        C7328 c7328 = new C7328(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        C1614 c1614M2957 = AbstractC1603.m2957();
        C1614.m2978(c1614M2957, c7328);
        C1614 c1614M29572 = AbstractC1603.m2957();
        c1614M29572.m2980(c1614, c1614M2957, 1);
        boolean zIsEmpty = c1614M29572.f4725.isEmpty();
        c1614M29572.m2983();
        c1614M2957.m2983();
        return !zIsEmpty;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final boolean m3626(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C1903 m3627(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (C1903) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final View m3628(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(m3614(view, R.id.view_tree_lifecycle_owner), m3614(view, R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i = 0;
        View view3 = view2;
        while (view != null) {
            if (i == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (m3627(view) == null) {
                i++;
                Object objM8314 = AbstractC3933.m8314(view);
                View view4 = view2;
                view2 = view;
                view = objM8314 instanceof View ? (View) objM8314 : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C2068 m3629(C1953 c1953) {
        C2068 c2068 = (C2068) AbstractC1957.m3673(c1953.f5769, AbstractC1943.f5726);
        List list = (List) AbstractC1957.m3673(c1953.f5769, AbstractC1943.f5718);
        return c2068 == null ? list != null ? (C2068) AbstractC4344.m8815(list) : null : c2068;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static boolean m3630() {
        try {
            if (ViewTreeObserverOnGlobalLayoutListenerC1884.f5414 == null) {
                ViewTreeObserverOnGlobalLayoutListenerC1884.f5414 = Class.forName("android.os.SystemProperties");
            }
            if (ViewTreeObserverOnGlobalLayoutListenerC1884.f5416 == null) {
                Class cls = ViewTreeObserverOnGlobalLayoutListenerC1884.f5414;
                ViewTreeObserverOnGlobalLayoutListenerC1884.f5416 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = ViewTreeObserverOnGlobalLayoutListenerC1884.f5416;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return AbstractC4395.m8907(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final boolean m3631(C1953 c1953) {
        ToggleableState toggleableState = (ToggleableState) AbstractC1957.m3673(c1953.f5769, AbstractC1943.f5714);
        C1956 c1956 = c1953.f5769;
        C1954 c1954 = (C1954) AbstractC1957.m3673(c1956, AbstractC1943.f5721);
        boolean z = toggleableState != null;
        if (((Boolean) AbstractC1957.m3673(c1956, AbstractC1943.f5723)) == null || (c1954 != null && c1954.f5773 == 4)) {
            return z;
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final String m3632(C1953 c1953, Resources resources) {
        Collection collection;
        CharSequence charSequence;
        Float fValueOf = Float.valueOf(0.0f);
        Object objM3673 = AbstractC1957.m3673(c1953.f5769, AbstractC1943.f5733);
        C1956 c1956 = c1953.f5769;
        ToggleableState toggleableState = (ToggleableState) AbstractC1957.m3673(c1956, AbstractC1943.f5714);
        C1954 c1954 = (C1954) AbstractC1957.m3673(c1956, AbstractC1943.f5721);
        Object string = null;
        if (toggleableState != null) {
            int i = AbstractC1886.f5543[toggleableState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        C4211.m8611();
                        return null;
                    }
                    if (objM3673 == null) {
                        objM3673 = resources.getString(R.string.indeterminate);
                    }
                } else if (c1954 != null && c1954.f5773 == 2 && objM3673 == null) {
                    objM3673 = resources.getString(R.string.state_off);
                }
            } else if (c1954 != null && c1954.f5773 == 2 && objM3673 == null) {
                objM3673 = resources.getString(R.string.state_on);
            }
        }
        Boolean bool = (Boolean) AbstractC1957.m3673(c1956, AbstractC1943.f5723);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((c1954 == null || c1954.f5773 != 4) && objM3673 == null) {
                objM3673 = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        C1955 c1955 = (C1955) AbstractC1957.m3673(c1956, AbstractC1943.f5732);
        if (c1955 != null) {
            if (c1955 != C1955.f5774) {
                if (objM3673 == null) {
                    float fFloatValue = fValueOf.floatValue() - fValueOf.floatValue() == 0.0f ? 0.0f : (0.0f - fValueOf.floatValue()) / (fValueOf.floatValue() - fValueOf.floatValue());
                    if (fFloatValue < 0.0f) {
                        fFloatValue = 0.0f;
                    }
                    if (fFloatValue > 1.0f) {
                        fFloatValue = 1.0f;
                    }
                    objM3673 = resources.getString(R.string.template_percent, Integer.valueOf(fFloatValue == 0.0f ? 0 : fFloatValue == 1.0f ? 100 : AbstractC2567.m5090(Math.round(fFloatValue * 100.0f), 1, 99)));
                }
            } else if (objM3673 == null) {
                objM3673 = resources.getString(R.string.in_progress);
            }
        }
        C1947 c1947 = AbstractC1943.f5726;
        if (c1956.f5779.m752(c1947)) {
            C1956 c1956M3667 = new C1953(c1953.f5772, true, c1953.f5770, c1956).m3667();
            Collection collection2 = (Collection) AbstractC1957.m3673(c1956M3667, AbstractC1943.f5734);
            if ((collection2 == null || collection2.isEmpty()) && (((collection = (Collection) AbstractC1957.m3673(c1956M3667, AbstractC1943.f5718)) == null || collection.isEmpty()) && ((charSequence = (CharSequence) AbstractC1957.m3673(c1956M3667, c1947)) == null || charSequence.length() == 0))) {
                string = resources.getString(R.string.state_empty);
            }
            objM3673 = string;
        }
        return (String) objM3673;
    }
}

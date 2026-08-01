package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import androidx.activity.C0867;
import androidx.compose.animation.core.C1171;
import androidx.compose.runtime.internal.C2080;
import com.davemorrissey.labs.subscaleview.C0328R;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.client.plugins.api.C4718;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C6008;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7383;
import p155.C8361;
import p158.C8368;
import p158.InterfaceC8366;
import p158.InterfaceC8369;
import p176.C8464;
import p321.C9452;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3268 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4718 f7445 = new C4718(8);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C9452 f7444 = new C9452(8);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4718 f7443 = new C4718(9);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC3254 m5088(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(C0328R.id.view_tree_view_model_store_owner);
            InterfaceC3254 interfaceC3254 = tag instanceof InterfaceC3254 ? (InterfaceC3254) tag : null;
            if (interfaceC3254 != null) {
                return interfaceC3254;
            }
            Object objM8873 = AbstractC4765.m8873(view);
            view = objM8873 instanceof View ? (View) objM8873 : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC3221 m5089(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(C0328R.id.view_tree_lifecycle_owner);
            InterfaceC3221 interfaceC3221 = tag instanceof InterfaceC3221 ? (InterfaceC3221) tag : null;
            if (interfaceC3221 != null) {
                return interfaceC3221;
            }
            Object objM8873 = AbstractC4765.m8873(view);
            view = objM8873 instanceof View ? (View) objM8873 : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m5090(InterfaceC8366 interfaceC8366) {
        Lifecycle$State lifecycle$State = ((C3219) interfaceC8366.getLifecycle()).f7364;
        if (lifecycle$State != Lifecycle$State.INITIALIZED && lifecycle$State != Lifecycle$State.CREATED) {
            C6755.m11869("Failed requirement.");
        } else if (interfaceC8366.getSavedStateRegistry().m13321("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            C3249 c3249 = new C3249(interfaceC8366.getSavedStateRegistry(), (InterfaceC3254) interfaceC8366);
            interfaceC8366.getSavedStateRegistry().m13320("androidx.lifecycle.internal.SavedStateHandlesProvider", c3249);
            interfaceC8366.getLifecycle().mo5063(new C3224(c3249, 1));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3253 m5091(C8464 c8464) {
        Pair[] pairArr;
        LinkedHashMap linkedHashMap = c8464.f21069;
        InterfaceC8366 interfaceC8366 = (InterfaceC8366) linkedHashMap.get(f7445);
        Bundle bundle = null;
        if (interfaceC8366 == null) {
            C6755.m11869("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        InterfaceC3254 interfaceC3254 = (InterfaceC3254) linkedHashMap.get(f7444);
        if (interfaceC3254 == null) {
            C6755.m11869("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) linkedHashMap.get(f7443);
        String str = (String) linkedHashMap.get(C3255.f7410);
        if (str == null) {
            C6755.m11869("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        InterfaceC8369 interfaceC8369M13321 = interfaceC8366.getSavedStateRegistry().m13321("androidx.lifecycle.internal.SavedStateHandlesProvider");
        C3249 c3249 = interfaceC8369M13321 instanceof C3249 ? (C3249) interfaceC8369M13321 : null;
        if (c3249 == null) {
            C6755.m11870("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap2 = m5095(interfaceC3254).f7400;
        C3253 c3253 = (C3253) linkedHashMap2.get(str);
        if (c3253 != null) {
            return c3253;
        }
        c3249.m5076();
        Bundle bundle3 = c3249.f7402;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                Map mapM9335 = AbstractC5171.m9335();
                if (mapM9335.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(mapM9335.size());
                    for (Map.Entry entry : mapM9335.entrySet()) {
                        arrayList.add(new Pair((String) entry.getKey(), entry.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                bundle4 = AbstractC5754.m10437((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                c3249.f7402 = null;
            }
            bundle = bundle4;
        }
        C3253 c3253M5092 = m5092(bundle, bundle2);
        linkedHashMap2.put(str, c3253M5092);
        return c3253M5092;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C3253 m5092(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            C3253 c3253 = new C3253();
            new LinkedHashMap();
            c3253.f7409 = new C2080(AbstractC5171.m9335());
            return c3253;
        }
        ClassLoader classLoader = C3253.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        MapBuilder mapBuilder = new MapBuilder(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            mapBuilder.put(str, bundle.get(str));
        }
        Map mapBuild = mapBuilder.build();
        mapBuild.getClass();
        C3253 c32532 = new C3253();
        new LinkedHashMap();
        c32532.f7409 = new C2080(mapBuild);
        return c32532;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m5093(AbstractC3258 abstractC3258, C8368 c8368, AbstractC3235 abstractC3235) {
        AutoCloseable autoCloseable;
        c8368.getClass();
        abstractC3235.getClass();
        C8361 c8361 = abstractC3258.f7416;
        if (c8361 != null) {
            synchronized (c8361.f20759) {
                autoCloseable = (AutoCloseable) c8361.f20758.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        C3252 c3252 = (C3252) autoCloseable;
        if (c3252 == null || c3252.f7407) {
            return;
        }
        c3252.m5078(abstractC3235, c8368);
        Lifecycle$State lifecycle$State = ((C3219) abstractC3235).f7364;
        if (lifecycle$State == Lifecycle$State.INITIALIZED || lifecycle$State.isAtLeast(Lifecycle$State.STARTED)) {
            c8368.m13319();
        } else {
            abstractC3235.mo5063(new C0867(abstractC3235, c8368));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final Object m5094(AbstractC3235 abstractC3235, Lifecycle$State lifecycle$State, InterfaceC7383 interfaceC7383, SuspendLambda suspendLambda) {
        Object objM11066;
        if (lifecycle$State != Lifecycle$State.INITIALIZED) {
            return (((C3219) abstractC3235).f7364 != Lifecycle$State.DESTROYED && (objM11066 = AbstractC6231.m11066(new RepeatOnLifecycleKt$repeatOnLifecycle$3(abstractC3235, lifecycle$State, interfaceC7383, null), suspendLambda)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objM11066 : C6008.f15084;
        }
        C6755.m11869("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C3248 m5095(InterfaceC3254 interfaceC3254) {
        C3255 c3255M8822 = C4718.m8822(interfaceC3254, new C3251(), 4);
        return (C3248) ((C1171) c3255M8822.f7411).m1519("androidx.lifecycle.internal.SavedStateHandlesVM", AbstractC5228.f13320.mo9476(C3248.class));
    }
}

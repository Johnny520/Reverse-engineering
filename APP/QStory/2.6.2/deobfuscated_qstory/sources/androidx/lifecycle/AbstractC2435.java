package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import androidx.activity.C0020;
import androidx.compose.animation.core.C0325;
import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3055;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.client.plugins.api.C3885;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C5175;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.coroutines.AbstractC5398;
import p000.AbstractC6087;
import p052.InterfaceC6553;
import p139.C7531;
import p142.C7538;
import p142.InterfaceC7536;
import p142.InterfaceC7539;
import p160.C7634;
import p305.C8631;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2435 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3885 f7097 = new C3885(9);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8631 f7098;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C3885 f7099;

    static {
        int i = 8;
        f7099 = new C3885(i);
        f7098 = new C8631(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC2421 m4518(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            InterfaceC2421 interfaceC2421 = tag instanceof InterfaceC2421 ? (InterfaceC2421) tag : null;
            if (interfaceC2421 != null) {
                return interfaceC2421;
            }
            Object objM6643 = AbstractC3055.m6643(view);
            view = objM6643 instanceof View ? (View) objM6643 : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC2388 m4519(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            InterfaceC2388 interfaceC2388 = tag instanceof InterfaceC2388 ? (InterfaceC2388) tag : null;
            if (interfaceC2388 != null) {
                return interfaceC2388;
            }
            Object objM6643 = AbstractC3055.m6643(view);
            view = objM6643 instanceof View ? (View) objM6643 : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m4520(InterfaceC7536 interfaceC7536) {
        Lifecycle$State lifecycle$State = ((C2386) interfaceC7536.getLifecycle()).f7018;
        if (lifecycle$State != Lifecycle$State.INITIALIZED && lifecycle$State != Lifecycle$State.CREATED) {
            C5919.m11249("Failed requirement.");
        } else if (interfaceC7536.getSavedStateRegistry().m12733("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            C2416 c2416 = new C2416(interfaceC7536.getSavedStateRegistry(), (InterfaceC2421) interfaceC7536);
            interfaceC7536.getSavedStateRegistry().m12732("androidx.lifecycle.internal.SavedStateHandlesProvider", c2416);
            interfaceC7536.getLifecycle().mo4493(new C2391(c2416, 1));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2420 m4521(C7634 c7634) {
        Pair[] pairArr;
        LinkedHashMap linkedHashMap = c7634.f20729;
        InterfaceC7536 interfaceC7536 = (InterfaceC7536) linkedHashMap.get(f7099);
        Bundle bundle = null;
        if (interfaceC7536 == null) {
            C5919.m11249("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        InterfaceC2421 interfaceC2421 = (InterfaceC2421) linkedHashMap.get(f7098);
        if (interfaceC2421 == null) {
            C5919.m11249("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) linkedHashMap.get(f7097);
        String str = (String) linkedHashMap.get(C2422.f7064);
        if (str == null) {
            C5919.m11249("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        InterfaceC7539 interfaceC7539M12733 = interfaceC7536.getSavedStateRegistry().m12733("androidx.lifecycle.internal.SavedStateHandlesProvider");
        C2416 c2416 = interfaceC7539M12733 instanceof C2416 ? (C2416) interfaceC7539M12733 : null;
        if (c2416 == null) {
            C5919.m11250("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap2 = m4525(interfaceC2421).f7054;
        C2420 c2420 = (C2420) linkedHashMap2.get(str);
        if (c2420 != null) {
            return c2420;
        }
        c2416.m4506();
        Bundle bundle3 = c2416.f7056;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                Map mapM8781 = AbstractC4338.m8781();
                if (mapM8781.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(mapM8781.size());
                    for (Map.Entry entry : mapM8781.entrySet()) {
                        arrayList.add(new Pair((String) entry.getKey(), entry.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                bundle4 = AbstractC6087.m11400((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                c2416.f7056 = null;
            }
            bundle = bundle4;
        }
        C2420 c2420M4522 = m4522(bundle, bundle2);
        linkedHashMap2.put(str, c2420M4522);
        return c2420M4522;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C2420 m4522(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            C2420 c2420 = new C2420();
            new LinkedHashMap();
            c2420.f7063 = new C1245(AbstractC4338.m8781());
            return c2420;
        }
        ClassLoader classLoader = C2420.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        MapBuilder mapBuilder = new MapBuilder(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            mapBuilder.put(str, bundle.get(str));
        }
        Map mapBuild = mapBuilder.build();
        mapBuild.getClass();
        C2420 c24202 = new C2420();
        new LinkedHashMap();
        c24202.f7063 = new C1245(mapBuild);
        return c24202;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m4523(AbstractC2425 abstractC2425, C7538 c7538, AbstractC2402 abstractC2402) {
        AutoCloseable autoCloseable;
        c7538.getClass();
        abstractC2402.getClass();
        C7531 c7531 = abstractC2425.f7070;
        if (c7531 != null) {
            synchronized (c7531.f20419) {
                autoCloseable = (AutoCloseable) c7531.f20418.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        C2419 c2419 = (C2419) autoCloseable;
        if (c2419 == null || c2419.f7061) {
            return;
        }
        c2419.m4508(abstractC2402, c7538);
        Lifecycle$State lifecycle$State = ((C2386) abstractC2402).f7018;
        if (lifecycle$State == Lifecycle$State.INITIALIZED || lifecycle$State.isAtLeast(Lifecycle$State.STARTED)) {
            c7538.m12731();
        } else {
            abstractC2402.mo4493(new C0020(abstractC2402, c7538));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final Object m4524(AbstractC2402 abstractC2402, Lifecycle$State lifecycle$State, InterfaceC6553 interfaceC6553, SuspendLambda suspendLambda) {
        Object objM10503;
        if (lifecycle$State != Lifecycle$State.INITIALIZED) {
            return (((C2386) abstractC2402).f7018 != Lifecycle$State.DESTROYED && (objM10503 = AbstractC5398.m10503(new RepeatOnLifecycleKt$repeatOnLifecycle$3(abstractC2402, lifecycle$State, interfaceC6553, null), suspendLambda)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objM10503 : C5175.f14739;
        }
        C5919.m11249("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C2415 m4525(InterfaceC2421 interfaceC2421) {
        C2422 c2422M8277 = C3885.m8277(interfaceC2421, new C2418(), 4);
        return (C2415) ((C0325) c2422M8277.f7065).m958("androidx.lifecycle.internal.SavedStateHandlesVM", AbstractC4395.f12971.mo8927(C2415.class));
    }
}

package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import androidx.activity.C0020;
import androidx.compose.animation.core.C0325;
import androidx.compose.runtime.internal.C1245;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.client.plugins.AbstractC3933;
import io.ktor.client.plugins.api.C3886;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C5176;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import kotlinx.coroutines.AbstractC5399;
import p052.InterfaceC6554;
import p139.C7532;
import p142.C7539;
import p142.InterfaceC7537;
import p142.InterfaceC7540;
import p160.C7635;
import p305.C8623;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2435 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C3886 f7100 = new C3886(8);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8623 f7099 = new C8623(8);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3886 f7098 = new C3886(9);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC2421 m4528(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            InterfaceC2421 interfaceC2421 = tag instanceof InterfaceC2421 ? (InterfaceC2421) tag : null;
            if (interfaceC2421 != null) {
                return interfaceC2421;
            }
            Object objM8314 = AbstractC3933.m8314(view);
            view = objM8314 instanceof View ? (View) objM8314 : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC2388 m4529(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            InterfaceC2388 interfaceC2388 = tag instanceof InterfaceC2388 ? (InterfaceC2388) tag : null;
            if (interfaceC2388 != null) {
                return interfaceC2388;
            }
            Object objM8314 = AbstractC3933.m8314(view);
            view = objM8314 instanceof View ? (View) objM8314 : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m4530(InterfaceC7537 interfaceC7537) {
        Lifecycle$State lifecycle$State = ((C2386) interfaceC7537.getLifecycle()).f7019;
        if (lifecycle$State != Lifecycle$State.INITIALIZED && lifecycle$State != Lifecycle$State.CREATED) {
            C5925.m11310("Failed requirement.");
        } else if (interfaceC7537.getSavedStateRegistry().m12762("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            C2416 c2416 = new C2416(interfaceC7537.getSavedStateRegistry(), (InterfaceC2421) interfaceC7537);
            interfaceC7537.getSavedStateRegistry().m12761("androidx.lifecycle.internal.SavedStateHandlesProvider", c2416);
            interfaceC7537.getLifecycle().mo4503(new C2391(c2416, 1));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2420 m4531(C7635 c7635) {
        Pair[] pairArr;
        LinkedHashMap linkedHashMap = c7635.f20724;
        InterfaceC7537 interfaceC7537 = (InterfaceC7537) linkedHashMap.get(f7100);
        Bundle bundle = null;
        if (interfaceC7537 == null) {
            C5925.m11310("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        InterfaceC2421 interfaceC2421 = (InterfaceC2421) linkedHashMap.get(f7099);
        if (interfaceC2421 == null) {
            C5925.m11310("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) linkedHashMap.get(f7098);
        String str = (String) linkedHashMap.get(C2422.f7065);
        if (str == null) {
            C5925.m11310("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        InterfaceC7540 interfaceC7540M12762 = interfaceC7537.getSavedStateRegistry().m12762("androidx.lifecycle.internal.SavedStateHandlesProvider");
        C2416 c2416 = interfaceC7540M12762 instanceof C2416 ? (C2416) interfaceC7540M12762 : null;
        if (c2416 == null) {
            C5925.m11311("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap2 = m4535(interfaceC2421).f7055;
        C2420 c2420 = (C2420) linkedHashMap2.get(str);
        if (c2420 != null) {
            return c2420;
        }
        c2416.m4516();
        Bundle bundle3 = c2416.f7057;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                Map mapM8776 = AbstractC4339.m8776();
                if (mapM8776.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(mapM8776.size());
                    for (Map.Entry entry : mapM8776.entrySet()) {
                        arrayList.add(new Pair((String) entry.getKey(), entry.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                bundle4 = AbstractC4922.m9878((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                c2416.f7057 = null;
            }
            bundle = bundle4;
        }
        C2420 c2420M4532 = m4532(bundle, bundle2);
        linkedHashMap2.put(str, c2420M4532);
        return c2420M4532;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C2420 m4532(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            C2420 c2420 = new C2420();
            new LinkedHashMap();
            c2420.f7064 = new C1245(AbstractC4339.m8776());
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
        c24202.f7064 = new C1245(mapBuild);
        return c24202;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m4533(AbstractC2425 abstractC2425, C7539 c7539, AbstractC2402 abstractC2402) {
        AutoCloseable autoCloseable;
        c7539.getClass();
        abstractC2402.getClass();
        C7532 c7532 = abstractC2425.f7071;
        if (c7532 != null) {
            synchronized (c7532.f20414) {
                autoCloseable = (AutoCloseable) c7532.f20413.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        C2419 c2419 = (C2419) autoCloseable;
        if (c2419 == null || c2419.f7062) {
            return;
        }
        c2419.m4518(abstractC2402, c7539);
        Lifecycle$State lifecycle$State = ((C2386) abstractC2402).f7019;
        if (lifecycle$State == Lifecycle$State.INITIALIZED || lifecycle$State.isAtLeast(Lifecycle$State.STARTED)) {
            c7539.m12760();
        } else {
            abstractC2402.mo4503(new C0020(abstractC2402, c7539));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final Object m4534(AbstractC2402 abstractC2402, Lifecycle$State lifecycle$State, InterfaceC6554 interfaceC6554, SuspendLambda suspendLambda) {
        Object objM10507;
        if (lifecycle$State != Lifecycle$State.INITIALIZED) {
            return (((C2386) abstractC2402).f7019 != Lifecycle$State.DESTROYED && (objM10507 = AbstractC5399.m10507(new RepeatOnLifecycleKt$repeatOnLifecycle$3(abstractC2402, lifecycle$State, interfaceC6554, null), suspendLambda)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objM10507 : C5176.f14739;
        }
        C5925.m11310("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C2415 m4535(InterfaceC2421 interfaceC2421) {
        C2422 c2422M8263 = C3886.m8263(interfaceC2421, new C2418(), 4);
        return (C2415) ((C0325) c2422M8263.f7066).m959("androidx.lifecycle.internal.SavedStateHandlesVM", AbstractC4396.f12975.mo8917(C2415.class));
    }
}

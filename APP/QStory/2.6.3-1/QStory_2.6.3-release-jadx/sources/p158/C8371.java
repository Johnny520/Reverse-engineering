package p158;

import android.os.Bundle;
import androidx.activity.AbstractC0900;
import androidx.activity.ComponentActivity;
import androidx.collection.C1123;
import androidx.lifecycle.AbstractC3258;
import androidx.lifecycle.AbstractC3268;
import androidx.lifecycle.C3256;
import androidx.lifecycle.InterfaceC3213;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.InterfaceC3254;
import androidx.lifecycle.Lifecycle$Event;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import io.ktor.util.C5043;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8371 implements InterfaceC3213 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC3221 f20767;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f20768;

    public /* synthetic */ C8371(InterfaceC3221 interfaceC3221, int i) {
        this.f20768 = i;
        this.f20767 = interfaceC3221;
    }

    @Override // androidx.lifecycle.InterfaceC3213
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo578(InterfaceC3221 interfaceC3221, Lifecycle$Event lifecycle$Event) {
        int i = this.f20768;
        InterfaceC3221 interfaceC32212 = this.f20767;
        switch (i) {
            case 0:
                InterfaceC8366 interfaceC8366 = (InterfaceC8366) interfaceC32212;
                if (lifecycle$Event != Lifecycle$Event.ON_CREATE) {
                    C6755.m11863("Next event must be ON_CREATE");
                    return;
                }
                interfaceC3221.getLifecycle().mo5062(this);
                Bundle bundleM13322 = interfaceC8366.getSavedStateRegistry().m13322("androidx.savedstate.Restarter");
                if (bundleM13322 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleM13322.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    C6755.m11870("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, C8371.class.getClassLoader()).asSubclass(InterfaceC8370.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                if (!(interfaceC8366 instanceof InterfaceC3254)) {
                                    C5043.m9174(interfaceC8366, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                C3256 viewModelStore = ((InterfaceC3254) interfaceC8366).getViewModelStore();
                                C8368 savedStateRegistry = interfaceC8366.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f7412;
                                for (String str2 : new HashSet(linkedHashMap.keySet())) {
                                    str2.getClass();
                                    AbstractC3258 abstractC3258 = (AbstractC3258) linkedHashMap.get(str2);
                                    if (abstractC3258 != null) {
                                        AbstractC3268.m5093(abstractC3258, savedStateRegistry, interfaceC8366.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.m13319();
                                }
                            } catch (Exception e) {
                                C1123.m1408(AbstractC0900.m717("Failed to instantiate ", str), e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        C1123.m1408(AbstractC0900.m718("Class ", str, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            case 1:
                ComponentActivity componentActivity = (ComponentActivity) interfaceC32212;
                componentActivity.ensureViewModelStore();
                componentActivity.getLifecycle().mo5062(this);
                return;
            default:
                if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
                    AbstractC4570.m8585(((AbstractC4570) interfaceC32212).m8617());
                    return;
                }
                return;
        }
    }
}

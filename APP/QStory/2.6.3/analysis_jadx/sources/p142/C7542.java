package p142;

import android.os.Bundle;
import androidx.activity.AbstractC0053;
import androidx.activity.ComponentActivity;
import androidx.collection.C0276;
import androidx.lifecycle.AbstractC2425;
import androidx.lifecycle.AbstractC2435;
import androidx.lifecycle.C2423;
import androidx.lifecycle.InterfaceC2380;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.InterfaceC2421;
import androidx.lifecycle.Lifecycle$Event;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import io.ktor.util.C4211;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7542 implements InterfaceC2380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC2388 f20422;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f20423;

    public /* synthetic */ C7542(InterfaceC2388 interfaceC2388, int i) {
        this.f20423 = i;
        this.f20422 = interfaceC2388;
    }

    @Override // androidx.lifecycle.InterfaceC2380
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
        int i = this.f20423;
        InterfaceC2388 interfaceC23882 = this.f20422;
        switch (i) {
            case 0:
                InterfaceC7537 interfaceC7537 = (InterfaceC7537) interfaceC23882;
                if (lifecycle$Event != Lifecycle$Event.ON_CREATE) {
                    C5925.m11304("Next event must be ON_CREATE");
                    return;
                }
                interfaceC2388.getLifecycle().mo4502(this);
                Bundle bundleM12763 = interfaceC7537.getSavedStateRegistry().m12763("androidx.savedstate.Restarter");
                if (bundleM12763 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleM12763.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    C5925.m11311("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, C7542.class.getClassLoader()).asSubclass(InterfaceC7541.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                if (!(interfaceC7537 instanceof InterfaceC2421)) {
                                    C4211.m8615(interfaceC7537, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                C2423 viewModelStore = ((InterfaceC2421) interfaceC7537).getViewModelStore();
                                C7539 savedStateRegistry = interfaceC7537.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f7067;
                                for (String str2 : new HashSet(linkedHashMap.keySet())) {
                                    str2.getClass();
                                    AbstractC2425 abstractC2425 = (AbstractC2425) linkedHashMap.get(str2);
                                    if (abstractC2425 != null) {
                                        AbstractC2435.m4533(abstractC2425, savedStateRegistry, interfaceC7537.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.m12760();
                                }
                            } catch (Exception e) {
                                C0276.m848(AbstractC0053.m157("Failed to instantiate ", str), e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        C0276.m848(AbstractC0053.m158("Class ", str, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            case 1:
                ComponentActivity componentActivity = (ComponentActivity) interfaceC23882;
                componentActivity.ensureViewModelStore();
                componentActivity.getLifecycle().mo4502(this);
                return;
            default:
                if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
                    AbstractC3738.m8026(((AbstractC3738) interfaceC23882).m8058());
                    return;
                }
                return;
        }
    }
}

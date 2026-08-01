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
import com.kongzue.dialogx.interfaces.AbstractC3737;
import io.ktor.util.C4210;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7541 implements InterfaceC2380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC2388 f20427;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f20428;

    public /* synthetic */ C7541(InterfaceC2388 interfaceC2388, int i) {
        this.f20428 = i;
        this.f20427 = interfaceC2388;
    }

    @Override // androidx.lifecycle.InterfaceC2380
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
        int i = this.f20428;
        InterfaceC2388 interfaceC23882 = this.f20427;
        switch (i) {
            case 0:
                InterfaceC7536 interfaceC7536 = (InterfaceC7536) interfaceC23882;
                if (lifecycle$Event != Lifecycle$Event.ON_CREATE) {
                    C5919.m11243("Next event must be ON_CREATE");
                    return;
                }
                interfaceC2388.getLifecycle().mo4492(this);
                Bundle bundleM12734 = interfaceC7536.getSavedStateRegistry().m12734("androidx.savedstate.Restarter");
                if (bundleM12734 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleM12734.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    C5919.m11250("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, C7541.class.getClassLoader()).asSubclass(InterfaceC7540.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                if (!(interfaceC7536 instanceof InterfaceC2421)) {
                                    C4210.m8625(interfaceC7536, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                C2423 viewModelStore = ((InterfaceC2421) interfaceC7536).getViewModelStore();
                                C7538 savedStateRegistry = interfaceC7536.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f7066;
                                for (String str2 : new HashSet(linkedHashMap.keySet())) {
                                    str2.getClass();
                                    AbstractC2425 abstractC2425 = (AbstractC2425) linkedHashMap.get(str2);
                                    if (abstractC2425 != null) {
                                        AbstractC2435.m4523(abstractC2425, savedStateRegistry, interfaceC7536.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.m12731();
                                }
                            } catch (Exception e) {
                                C0276.m847(AbstractC0053.m152("Failed to instantiate ", str), e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        C0276.m847(AbstractC0053.m156("Class ", str, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            case 1:
                ComponentActivity componentActivity = (ComponentActivity) interfaceC23882;
                componentActivity.ensureViewModelStore();
                componentActivity.getLifecycle().mo4492(this);
                return;
            default:
                if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
                    AbstractC3737.m8039(((AbstractC3737) interfaceC23882).m8071());
                    return;
                }
                return;
        }
    }
}

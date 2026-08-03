package android.view;

import Yue.C5499;
import Yue.C6659;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7144;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0003R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/ViewModelStore;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", C6659.f17103, "Landroidx/lifecycle/ViewModel;", "viewModel", "LYue/ۥۣۢ۠ۤ;", "put", "(Ljava/lang/String;Landroidx/lifecycle/ViewModel;)V", "get", "(Ljava/lang/String;)Landroidx/lifecycle/ViewModel;", "", "keys", "()Ljava/util/Set;", "clear", "", "map", "Ljava/util/Map;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
public class ViewModelStore {

    @InterfaceC6399
    private final Map<String, ViewModel> map = new LinkedHashMap();

    public final void clear() {
        Iterator<ViewModel> it = this.map.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.map.clear();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @InterfaceC6489
    public final ViewModel get(@InterfaceC6399 String key) {
        C5499.m17103(key, C6659.f17103);
        return this.map.get(key);
    }

    @InterfaceC6399
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public final Set<String> keys() {
        return new HashSet(this.map.keySet());
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public final void put(@InterfaceC6399 String key, @InterfaceC6399 ViewModel viewModel) {
        C5499.m17103(key, C6659.f17103);
        C5499.m17103(viewModel, "viewModel");
        ViewModel viewModelPut = this.map.put(key, viewModel);
        if (viewModelPut != null) {
            viewModelPut.onCleared();
        }
    }
}

package android.view.viewmodel;

import Yue.C4750;
import Yue.C5499;
import Yue.C6659;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001:\u0002\f\rB\u0007\b\u0000¢\u0006\u0002\u0010\u0002J$\u0010\b\u001a\u0004\u0018\u0001H\t\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u0005H¦\u0002¢\u0006\u0002\u0010\u000bR&\u0010\u0003\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m2699d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "", "()V", "map", "", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "getMap$lifecycle_viewmodel_release", "()Ljava/util/Map;", "get", C4750.f10502, C6659.f17103, "(Landroidx/lifecycle/viewmodel/CreationExtras$Key;)Ljava/lang/Object;", "Empty", "Key", "lifecycle-viewmodel_release"}, m2700k = 1, m2701mv = {1, 8, 0}, m2703xi = 48)
public abstract class CreationExtras {

    @InterfaceC6399
    private final Map<Key<?>, Object> map = new LinkedHashMap();

    @InterfaceC6211(m2698d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H\u0096\u0002¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m2699d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras$Empty;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "()V", "get", C4750.f10502, C6659.f17103, "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "(Landroidx/lifecycle/viewmodel/CreationExtras$Key;)Ljava/lang/Object;", "lifecycle-viewmodel_release"}, m2700k = 1, m2701mv = {1, 8, 0}, m2703xi = 48)
    public static final class Empty extends CreationExtras {

        @InterfaceC6399
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        @Override // android.view.viewmodel.CreationExtras
        @InterfaceC6489
        public <T> T get(@InterfaceC6399 Key<T> key) {
            C5499.m17103(key, C6659.f17103);
            return null;
        }
    }

    @InterfaceC6211(m2698d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m2699d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras$Key;", C4750.f10502, "", "lifecycle-viewmodel_release"}, m2700k = 1, m2701mv = {1, 8, 0}, m2703xi = 48)
    public interface Key<T> {
    }

    @InterfaceC6489
    public abstract <T> T get(@InterfaceC6399 Key<T> key);

    @InterfaceC6399
    public final Map<Key<?>, Object> getMap$lifecycle_viewmodel_release() {
        return this.map;
    }
}

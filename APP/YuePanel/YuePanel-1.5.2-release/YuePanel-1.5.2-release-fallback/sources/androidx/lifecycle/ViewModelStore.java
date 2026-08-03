package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0003R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/ViewModelStore;", "", "<init>", "()V", "", "key", "Landroidx/lifecycle/ViewModel;", "viewModel", "LYue/ۥۣۢ۠ۤ;", "put", "(Ljava/lang/String;Landroidx/lifecycle/ViewModel;)V", "get", "(Ljava/lang/String;)Landroidx/lifecycle/ViewModel;", "", "keys", "()Ljava/util/Set;", "clear", "", "map", "Ljava/util/Map;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
public class ViewModelStore {

    @Yue.InterfaceC4418
    private final java.util.Map<java.lang.String, androidx.lifecycle.ViewModel> map;

    public ViewModelStore() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.map = r0
            return
    }

    public final void clear() {
            r2 = this;
            java.util.Map<java.lang.String, androidx.lifecycle.ViewModel> r0 = r2.map
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.lifecycle.ViewModel r1 = (androidx.lifecycle.ViewModel) r1
            r1.clear()
            goto La
        L1a:
            java.util.Map<java.lang.String, androidx.lifecycle.ViewModel> r0 = r2.map
            r0.clear()
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    @Yue.InterfaceC4543
    public final androidx.lifecycle.ViewModel get(@Yue.InterfaceC4418 java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r2, r0)
            java.util.Map<java.lang.String, androidx.lifecycle.ViewModel> r0 = r1.map
            java.lang.Object r2 = r0.get(r2)
            androidx.lifecycle.ViewModel r2 = (androidx.lifecycle.ViewModel) r2
            return r2
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public final java.util.Set<java.lang.String> keys() {
            r2 = this;
            java.util.HashSet r0 = new java.util.HashSet
            java.util.Map<java.lang.String, androidx.lifecycle.ViewModel> r1 = r2.map
            java.util.Set r1 = r1.keySet()
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public final void put(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 androidx.lifecycle.ViewModel r3) {
            r1 = this;
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "viewModel"
            Yue.C3329.m13906(r3, r0)
            java.util.Map<java.lang.String, androidx.lifecycle.ViewModel> r0 = r1.map
            java.lang.Object r2 = r0.put(r2, r3)
            androidx.lifecycle.ViewModel r2 = (androidx.lifecycle.ViewModel) r2
            if (r2 == 0) goto L17
            r2.onCleared()
        L17:
            return
    }
}

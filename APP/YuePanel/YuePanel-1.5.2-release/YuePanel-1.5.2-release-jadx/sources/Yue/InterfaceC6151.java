package Yue;

import android.annotation.SuppressLint;
import android.view.Lifecycle;
import android.view.LifecycleOwner;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6151 {
    void addMenuProvider(@InterfaceC6391 InterfaceC6165 interfaceC6165);

    void addMenuProvider(@InterfaceC6391 InterfaceC6165 interfaceC6165, @InterfaceC6391 LifecycleOwner lifecycleOwner);

    @SuppressLint({"LambdaLast"})
    void addMenuProvider(@InterfaceC6391 InterfaceC6165 interfaceC6165, @InterfaceC6391 LifecycleOwner lifecycleOwner, @InterfaceC6391 Lifecycle.State state);

    void invalidateMenu();

    void removeMenuProvider(@InterfaceC6391 InterfaceC6165 interfaceC6165);
}

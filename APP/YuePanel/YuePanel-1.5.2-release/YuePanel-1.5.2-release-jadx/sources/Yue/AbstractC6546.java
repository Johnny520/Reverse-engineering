package Yue;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: Yue.ۥۣۡۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nOnBackPressedCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1855#2,2:116\n*S KotlinDebug\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n*L\n67#1:116,2\n*E\n"})
public abstract class AbstractC6546 {

    @InterfaceC6399
    private final CopyOnWriteArrayList<InterfaceC3664> cancellables = new CopyOnWriteArrayList<>();

    @InterfaceC6489
    private InterfaceC5122<C8107> enabledChangedCallback;
    private boolean isEnabled;

    public AbstractC6546(boolean z) {
        this.isEnabled = z;
    }

    @InterfaceC5572(name = "addCancellable")
    public final void addCancellable(@InterfaceC6399 InterfaceC3664 interfaceC3664) {
        C5499.m17103(interfaceC3664, "cancellable");
        this.cancellables.add(interfaceC3664);
    }

    @InterfaceC6489
    public final InterfaceC5122<C8107> getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    @InterfaceC5922
    public void handleOnBackCancelled() {
    }

    @InterfaceC5922
    public abstract void handleOnBackPressed();

    @InterfaceC5922
    public void handleOnBackProgressed(@InterfaceC6399 C3505 c3505) {
        C5499.m17103(c3505, "backEvent");
    }

    @InterfaceC5922
    public void handleOnBackStarted(@InterfaceC6399 C3505 c3505) {
        C5499.m17103(c3505, "backEvent");
    }

    @InterfaceC5922
    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @InterfaceC5922
    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((InterfaceC3664) it.next()).cancel();
        }
    }

    @InterfaceC5572(name = "removeCancellable")
    public final void removeCancellable(@InterfaceC6399 InterfaceC3664 interfaceC3664) {
        C5499.m17103(interfaceC3664, "cancellable");
        this.cancellables.remove(interfaceC3664);
    }

    @InterfaceC5922
    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        InterfaceC5122<C8107> interfaceC5122 = this.enabledChangedCallback;
        if (interfaceC5122 != null) {
            interfaceC5122.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(@InterfaceC6489 InterfaceC5122<C8107> interfaceC5122) {
        this.enabledChangedCallback = interfaceC5122;
    }
}

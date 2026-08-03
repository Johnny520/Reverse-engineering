package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nOnBackPressedCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1855#2,2:116\n*S KotlinDebug\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n*L\n67#1:116,2\n*E\n"})
public abstract class AbstractC4607 {

    @Yue.InterfaceC4418
    private final java.util.concurrent.CopyOnWriteArrayList<Yue.InterfaceC0931> cancellables;

    @Yue.InterfaceC4543
    private Yue.InterfaceC2823<Yue.C6593> enabledChangedCallback;
    private boolean isEnabled;

    public AbstractC4607(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.isEnabled = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r0.cancellables = r1
            return
    }

    @Yue.InterfaceC3421(name = "addCancellable")
    public final void addCancellable(@Yue.InterfaceC4418 Yue.InterfaceC0931 r2) {
            r1 = this;
            java.lang.String r0 = "cancellable"
            Yue.C3329.m13906(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥۣ۟ۨ> r0 = r1.cancellables
            r0.add(r2)
            return
    }

    @Yue.InterfaceC4543
    public final Yue.InterfaceC2823<Yue.C6593> getEnabledChangedCallback$activity_release() {
            r1 = this;
            Yue.ۥۣ۠۠ۨ<Yue.ۥۣۢ۠ۤ> r0 = r1.enabledChangedCallback
            return r0
    }

    @Yue.InterfaceC3875
    public void handleOnBackCancelled() {
            r0 = this;
            return
    }

    @Yue.InterfaceC3875
    public abstract void handleOnBackPressed();

    @Yue.InterfaceC3875
    public void handleOnBackProgressed(@Yue.InterfaceC4418 Yue.C0717 r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            Yue.C3329.m13906(r2, r0)
            return
    }

    @Yue.InterfaceC3875
    public void handleOnBackStarted(@Yue.InterfaceC4418 Yue.C0717 r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            Yue.C3329.m13906(r2, r0)
            return
    }

    @Yue.InterfaceC3875
    public final boolean isEnabled() {
            r1 = this;
            boolean r0 = r1.isEnabled
            return r0
    }

    @Yue.InterfaceC3875
    public final void remove() {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥۣ۟ۨ> r0 = r2.cancellables
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            Yue.ۥۣ۟ۨ r1 = (Yue.InterfaceC0931) r1
            r1.cancel()
            goto L6
        L16:
            return
    }

    @Yue.InterfaceC3421(name = "removeCancellable")
    public final void removeCancellable(@Yue.InterfaceC4418 Yue.InterfaceC0931 r2) {
            r1 = this;
            java.lang.String r0 = "cancellable"
            Yue.C3329.m13906(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList<Yue.ۥۣ۟ۨ> r0 = r1.cancellables
            r0.remove(r2)
            return
    }

    @Yue.InterfaceC3875
    public final void setEnabled(boolean r1) {
            r0 = this;
            r0.isEnabled = r1
            Yue.ۥۣ۠۠ۨ<Yue.ۥۣۢ۠ۤ> r1 = r0.enabledChangedCallback
            if (r1 == 0) goto L9
            r1.invoke()
        L9:
            return
    }

    public final void setEnabledChangedCallback$activity_release(@Yue.InterfaceC4543 Yue.InterfaceC2823<Yue.C6593> r1) {
            r0 = this;
            r0.enabledChangedCallback = r1
            return
    }
}

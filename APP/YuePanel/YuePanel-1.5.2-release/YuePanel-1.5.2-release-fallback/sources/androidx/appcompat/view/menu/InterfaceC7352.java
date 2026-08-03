package androidx.appcompat.view.menu;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public interface InterfaceC7352 {

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟۟ۤ$ۥ, reason: contains not printable characters */
    public interface InterfaceC7353 {
        void onCloseMenu(@Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r1, boolean r2);

        /* JADX INFO: renamed from: ۥ */
        boolean mo28095(@Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r1);
    }

    boolean collapseItemActionView(androidx.appcompat.view.menu.C7343 r1, androidx.appcompat.view.menu.C7348 r2);

    boolean expandItemActionView(androidx.appcompat.view.menu.C7343 r1, androidx.appcompat.view.menu.C7348 r2);

    boolean flagActionItems();

    int getId();

    androidx.appcompat.view.menu.InterfaceC7354 getMenuView(android.view.ViewGroup r1);

    void initForMenu(android.content.Context r1, androidx.appcompat.view.menu.C7343 r2);

    void onCloseMenu(androidx.appcompat.view.menu.C7343 r1, boolean r2);

    void onRestoreInstanceState(android.os.Parcelable r1);

    android.os.Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuC7359 r1);

    void setCallback(androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353 r1);

    void updateMenuView(boolean r1);
}

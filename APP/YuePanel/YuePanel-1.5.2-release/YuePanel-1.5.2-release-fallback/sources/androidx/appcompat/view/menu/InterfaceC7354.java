package androidx.appcompat.view.menu;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public interface InterfaceC7354 {

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟۟ۥ$ۥ, reason: contains not printable characters */
    public interface InterfaceC7355 {
        androidx.appcompat.view.menu.C7348 getItemData();

        void initialize(androidx.appcompat.view.menu.C7348 r1, int r2);

        boolean prefersCondensedTitle();

        void setCheckable(boolean r1);

        void setChecked(boolean r1);

        void setEnabled(boolean r1);

        void setIcon(android.graphics.drawable.Drawable r1);

        void setShortcut(boolean r1, char r2);

        void setTitle(java.lang.CharSequence r1);

        boolean showsIcon();
    }

    int getWindowAnimations();

    void initialize(androidx.appcompat.view.menu.C7343 r1);
}

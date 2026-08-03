package androidx.appcompat.view.menu;

import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public interface InterfaceC8699 {

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟۟ۤ$ۥ */
    public interface InterfaceC1607 {
        void onCloseMenu(@InterfaceC6391 C8694 c8694, boolean z);

        /* JADX INFO: renamed from: ۥ */
        boolean mo4617(@InterfaceC6391 C8694 c8694);
    }

    boolean collapseItemActionView(C8694 c8694, C8697 c8697);

    boolean expandItemActionView(C8694 c8694, C8697 c8697);

    boolean flagActionItems();

    int getId();

    InterfaceC8700 getMenuView(ViewGroup viewGroup);

    void initForMenu(Context context, C8694 c8694);

    void onCloseMenu(C8694 c8694, boolean z);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(SubMenuC8702 subMenuC8702);

    void setCallback(InterfaceC1607 interfaceC1607);

    void updateMenuView(boolean z);
}

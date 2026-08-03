package androidx.appcompat.view.menu;

import Yue.InterfaceC7144;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public interface InterfaceC8700 {

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟۟ۥ$ۥ */
    public interface InterfaceC1608 {
        C8697 getItemData();

        void initialize(C8697 c8697, int i);

        boolean prefersCondensedTitle();

        void setCheckable(boolean z);

        void setChecked(boolean z);

        void setEnabled(boolean z);

        void setIcon(Drawable drawable);

        void setShortcut(boolean z, char c);

        void setTitle(CharSequence charSequence);

        boolean showsIcon();
    }

    int getWindowAnimations();

    void initialize(C8694 c8694);
}

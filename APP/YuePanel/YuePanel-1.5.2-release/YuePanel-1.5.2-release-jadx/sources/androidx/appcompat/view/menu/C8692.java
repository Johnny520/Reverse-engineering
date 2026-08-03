package androidx.appcompat.view.menu;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.InterfaceC8699;
import androidx.appcompat.view.menu.InterfaceC8700;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C8692 implements InterfaceC8699, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final String f26009 = "ListMenuPresenter";

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final String f26010 = "android:menu:list";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Context f26011;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public LayoutInflater f26012;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public C8694 f26013;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public ExpandedMenuView f26014;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f26015;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int f26016;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f26017;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public InterfaceC8699.InterfaceC1607 f26018;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public C1602 f26019;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public int f26020;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟$ۥ */
    public class C1602 extends BaseAdapter {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f26021 = -1;

        public C1602() {
            m4645();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C8692.this.f26013.getNonActionItems().size() - C8692.this.f26015;
            return this.f26021 < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C8692 c8692 = C8692.this;
                view = c8692.f26012.inflate(c8692.f26017, viewGroup, false);
            }
            ((InterfaceC8700.InterfaceC1608) view).initialize(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m4645();
            super.notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4645() {
            C8697 expandedItem = C8692.this.f26013.getExpandedItem();
            if (expandedItem != null) {
                ArrayList<C8697> nonActionItems = C8692.this.f26013.getNonActionItems();
                int size = nonActionItems.size();
                for (int i = 0; i < size; i++) {
                    if (nonActionItems.get(i) == expandedItem) {
                        this.f26021 = i;
                        return;
                    }
                }
            }
            this.f26021 = -1;
        }

        /* JADX DEBUG: Method merged with bridge method: getItem(I)Ljava/lang/Object; */
        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public C8697 getItem(int i) {
            ArrayList<C8697> nonActionItems = C8692.this.f26013.getNonActionItems();
            int i2 = i + C8692.this.f26015;
            int i3 = this.f26021;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return nonActionItems.get(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8692(Context context, int i) {
        this(i, 0);
        this.f26011 = context;
        this.f26012 = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public boolean collapseItemActionView(C8694 c8694, C8697 c8697) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public boolean expandItemActionView(C8694 c8694, C8697 c8697) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public int getId() {
        return this.f26020;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public InterfaceC8700 getMenuView(ViewGroup viewGroup) {
        if (this.f26014 == null) {
            this.f26014 = (ExpandedMenuView) this.f26012.inflate(C6898.C6906.f18981, viewGroup, false);
            if (this.f26019 == null) {
                this.f26019 = new C1602();
            }
            this.f26014.setAdapter((ListAdapter) this.f26019);
            this.f26014.setOnItemClickListener(this);
        }
        return this.f26014;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void initForMenu(Context context, C8694 c8694) {
        if (this.f26016 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f26016);
            this.f26011 = contextThemeWrapper;
            this.f26012 = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f26011 != null) {
            this.f26011 = context;
            if (this.f26012 == null) {
                this.f26012 = LayoutInflater.from(context);
            }
        }
        this.f26013 = c8694;
        C1602 c1602 = this.f26019;
        if (c1602 != null) {
            c1602.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void onCloseMenu(C8694 c8694, boolean z) {
        InterfaceC8699.InterfaceC1607 interfaceC1607 = this.f26018;
        if (interfaceC1607 != null) {
            interfaceC1607.onCloseMenu(c8694, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f26013.performItemAction(this.f26019.getItem(i), this, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void onRestoreInstanceState(Parcelable parcelable) {
        m29009((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public Parcelable onSaveInstanceState() {
        if (this.f26014 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        m29010(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public boolean onSubMenuSelected(SubMenuC8702 subMenuC8702) {
        if (!subMenuC8702.hasVisibleItems()) {
            return false;
        }
        new DialogInterfaceOnKeyListenerC8695(subMenuC8702).m29025(null);
        InterfaceC8699.InterfaceC1607 interfaceC1607 = this.f26018;
        if (interfaceC1607 == null) {
            return true;
        }
        interfaceC1607.mo4617(subMenuC8702);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void setCallback(InterfaceC8699.InterfaceC1607 interfaceC1607) {
        this.f26018 = interfaceC1607;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void updateMenuView(boolean z) {
        C1602 c1602 = this.f26019;
        if (c1602 != null) {
            c1602.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public ListAdapter m4643() {
        if (this.f26019 == null) {
            this.f26019 = new C1602();
        }
        return this.f26019;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public int m4644() {
        return this.f26015;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m29009(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(f26010);
        if (sparseParcelableArray != null) {
            this.f26014.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m29010(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f26014;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(f26010, sparseArray);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m29011(int i) {
        this.f26020 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m29012(int i) {
        this.f26015 = i;
        if (this.f26014 != null) {
            updateMenuView(false);
        }
    }

    public C8692(int i, int i2) {
        this.f26017 = i;
        this.f26016 = i2;
    }
}

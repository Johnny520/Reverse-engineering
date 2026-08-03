package androidx.appcompat.view.menu;

import Yue.InterfaceC7144;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.InterfaceC8699;
import androidx.appcompat.view.menu.InterfaceC8700;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public abstract class AbstractC1600 implements InterfaceC8699 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Context f25961;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public Context f25962;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public C8694 f25963;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public LayoutInflater f25964;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public LayoutInflater f25965;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public InterfaceC8699.InterfaceC1607 f25966;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f25967;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f25968;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public InterfaceC8700 f25969;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public int f25970;

    public AbstractC1600(Context context, int i, int i2) {
        this.f25961 = context;
        this.f25964 = LayoutInflater.from(context);
        this.f25967 = i;
        this.f25968 = i2;
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
        return this.f25970;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public InterfaceC8700 getMenuView(ViewGroup viewGroup) {
        if (this.f25969 == null) {
            InterfaceC8700 interfaceC8700 = (InterfaceC8700) this.f25964.inflate(this.f25967, viewGroup, false);
            this.f25969 = interfaceC8700;
            interfaceC8700.initialize(this.f25963);
            updateMenuView(true);
        }
        return this.f25969;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void initForMenu(Context context, C8694 c8694) {
        this.f25962 = context;
        this.f25965 = LayoutInflater.from(context);
        this.f25963 = c8694;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void onCloseMenu(C8694 c8694, boolean z) {
        InterfaceC8699.InterfaceC1607 interfaceC1607 = this.f25966;
        if (interfaceC1607 != null) {
            interfaceC1607.onCloseMenu(c8694, z);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public boolean onSubMenuSelected(SubMenuC8702 subMenuC8702) {
        InterfaceC8699.InterfaceC1607 interfaceC1607 = this.f25966;
        C8694 c8694 = subMenuC8702;
        if (interfaceC1607 == null) {
            return false;
        }
        if (subMenuC8702 == null) {
            c8694 = this.f25963;
        }
        return interfaceC1607.mo4617(c8694);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void setCallback(InterfaceC8699.InterfaceC1607 interfaceC1607) {
        this.f25966 = interfaceC1607;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void updateMenuView(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f25969;
        if (viewGroup == null) {
            return;
        }
        C8694 c8694 = this.f25963;
        int i = 0;
        if (c8694 != null) {
            c8694.flagActionItems();
            ArrayList<C8697> visibleItems = this.f25963.getVisibleItems();
            int size = visibleItems.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C8697 c8697 = visibleItems.get(i3);
                if (mo29001(i2, c8697)) {
                    View childAt = viewGroup.getChildAt(i2);
                    C8697 itemData = childAt instanceof InterfaceC8700.InterfaceC1608 ? ((InterfaceC8700.InterfaceC1608) childAt).getItemData() : null;
                    View viewMo28999 = mo28999(c8697, childAt, viewGroup);
                    if (c8697 != itemData) {
                        viewMo28999.setPressed(false);
                        viewMo28999.jumpDrawablesToCurrentState();
                    }
                    if (viewMo28999 != childAt) {
                        m4641(viewMo28999, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!mo28997(viewGroup, i)) {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m4641(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f25969).addView(view, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public abstract void mo28995(C8697 c8697, InterfaceC8700.InterfaceC1608 interfaceC1608);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public InterfaceC8700.InterfaceC1608 m28996(ViewGroup viewGroup) {
        return (InterfaceC8700.InterfaceC1608) this.f25964.inflate(this.f25968, viewGroup, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean mo28997(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public InterfaceC8699.InterfaceC1607 m28998() {
        return this.f25966;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: android.view.View */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: androidx.appcompat.view.menu.ۥ۟۟۟ۥ$ۥ */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: androidx.appcompat.view.menu.ۥ۟۟۟ۥ$ۥ */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: androidx.appcompat.view.menu.ۥ۟۟۟ۥ$ۥ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public View mo28999(C8697 c8697, View view, ViewGroup viewGroup) {
        InterfaceC8700.InterfaceC1608 interfaceC1608M28996 = view instanceof InterfaceC8700.InterfaceC1608 ? (InterfaceC8700.InterfaceC1608) view : m28996(viewGroup);
        mo28995(c8697, interfaceC1608M28996);
        return (View) interfaceC1608M28996;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m29000(int i) {
        this.f25970 = i;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean mo29001(int i, C8697 c8697) {
        return true;
    }
}

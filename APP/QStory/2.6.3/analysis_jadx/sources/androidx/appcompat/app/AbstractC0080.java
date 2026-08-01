package androidx.appcompat.app;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.C0022;
import androidx.activity.compose.C0005;
import androidx.collection.C0283;
import androidx.core.os.C2169;
import androidx.fragment.app.C2354;
import androidx.fragment.app.C2357;
import androidx.fragment.app.SpecialEffectsController$Operation$State;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5139;
import p034.AbstractC6347;
import p163.InterfaceMenuItemC7661;
import p173.C7735;
import p190.MenuItemC7793;
import p227.C8009;
import p228.C8027;
import p228.InterfaceC8033;
import p228.InterfaceC8034;
import p236.C8120;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0080 implements InterfaceC8034 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f231;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f232;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f233;

    public AbstractC0080(C0005 c0005) {
        this.f233 = 3;
        this.f231 = new C0022(this, 2);
        this.f232 = new C7735(this, c0005);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e A[LOOP:1: B:16:0x0053->B:68:0x012e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0139 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AbstractC0080.toString():java.lang.String");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public abstract int[] mo304(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract IntentFilter mo305();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m306() {
        C2357 c2357 = (C2357) this.f231;
        C2169 c2169 = (C2169) this.f232;
        LinkedHashSet linkedHashSet = c2357.f6979;
        if (linkedHashSet.remove(c2169) && linkedHashSet.isEmpty()) {
            c2357.m4480();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m307() {
        C0081 c0081 = (C0081) this.f231;
        if (c0081 != null) {
            try {
                ((LayoutInflaterFactory2C0068) this.f232).f169.unregisterReceiver(c0081);
            } catch (IllegalArgumentException unused) {
            }
            this.f231 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public abstract int[] mo308(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public String m309(String str) {
        str.getClass();
        List list = (List) this.f232;
        int iM11901 = AbstractC6347.m11901(list);
        if (iM11901 < 0) {
            return null;
        }
        int i = 0;
        while (true) {
            C8120 c8120 = (C8120) list.get(i);
            if (AbstractC5139.m10130(c8120.f22417, str)) {
                return c8120.f22416;
            }
            if (i == iM11901) {
                return null;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void m310() {
        m307();
        IntentFilter intentFilterMo305 = mo305();
        if (intentFilterMo305.countActions() == 0) {
            return;
        }
        if (((C0081) this.f231) == null) {
            this.f231 = new C0081(this, 0);
        }
        ((LayoutInflaterFactory2C0068) this.f232).f169.registerReceiver((C0081) this.f231, intentFilterMo305);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public MenuItem m311(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC7661)) {
            return menuItem;
        }
        InterfaceMenuItemC7661 interfaceMenuItemC7661 = (InterfaceMenuItemC7661) menuItem;
        if (((C0283) this.f232) == null) {
            this.f232 = new C0283(0);
        }
        MenuItem menuItem2 = (MenuItem) ((C0283) this.f232).get(interfaceMenuItemC7661);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC7793 menuItemC7793 = new MenuItemC7793((Context) this.f231, interfaceMenuItemC7661);
        ((C0283) this.f232).put(interfaceMenuItemC7661, menuItemC7793);
        return menuItemC7793;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public abstract int mo312();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean m313() {
        C2354 c2354 = SpecialEffectsController$Operation$State.Companion;
        C2357 c2357 = (C2357) this.f231;
        View view = c2357.f6981.f6881;
        view.getClass();
        c2354.getClass();
        SpecialEffectsController$Operation$State specialEffectsController$Operation$StateM4475 = C2354.m4475(view);
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State = c2357.f6983;
        if (specialEffectsController$Operation$StateM4475 == specialEffectsController$Operation$State) {
            return true;
        }
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State2 = SpecialEffectsController$Operation$State.VISIBLE;
        return (specialEffectsController$Operation$StateM4475 == specialEffectsController$Operation$State2 || specialEffectsController$Operation$State == specialEffectsController$Operation$State2) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public abstract void mo314();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int[] m315(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.f232;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public String m316() {
        String str = (String) this.f231;
        if (str != null) {
            return str;
        }
        AbstractC4395.m8908("text");
        throw null;
    }

    @Override // p228.InterfaceC8034
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public InterfaceC8033 mo317(C8027 c8027) {
        Context context = (Context) this.f231;
        Class cls = (Class) this.f232;
        return new C8009(context, c8027.m13511(File.class, cls), c8027.m13511(Uri.class, cls), cls);
    }

    public AbstractC0080(String str, List list) {
        this.f233 = 6;
        str.getClass();
        list.getClass();
        this.f231 = str;
        this.f232 = list;
    }

    public AbstractC0080(Context context) {
        this.f233 = 4;
        this.f231 = context;
    }

    public /* synthetic */ AbstractC0080(Object obj, int i, Object obj2) {
        this.f233 = i;
        this.f231 = obj;
        this.f232 = obj2;
    }

    public AbstractC0080() {
        this.f233 = 1;
        this.f232 = new int[2];
    }

    public AbstractC0080(LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068) {
        this.f233 = 0;
        this.f232 = layoutInflaterFactory2C0068;
    }
}

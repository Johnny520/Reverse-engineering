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
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5138;
import p163.InterfaceMenuItemC7660;
import p173.C7734;
import p190.MenuItemC7792;
import p227.C8008;
import p228.C8026;
import p228.InterfaceC8032;
import p228.InterfaceC8033;
import p236.C8119;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0080 implements InterfaceC8033 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f231;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f232;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f233;

    public AbstractC0080(C0005 c0005) {
        this.f233 = 3;
        this.f231 = new C0022(this, 2);
        this.f232 = new C7734(this, c0005);
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
    public abstract int[] mo303(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract IntentFilter mo304();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m305() {
        C2357 c2357 = (C2357) this.f231;
        C2169 c2169 = (C2169) this.f232;
        LinkedHashSet linkedHashSet = c2357.f6978;
        if (linkedHashSet.remove(c2169) && linkedHashSet.isEmpty()) {
            c2357.m4470();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m306() {
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
    public abstract int[] mo307(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public String m308(String str) {
        str.getClass();
        List list = (List) this.f232;
        int iM13673 = AbstractC8189.m13673(list);
        if (iM13673 < 0) {
            return null;
        }
        int i = 0;
        while (true) {
            C8119 c8119 = (C8119) list.get(i);
            if (AbstractC5138.m10130(c8119.f22419, str)) {
                return c8119.f22418;
            }
            if (i == iM13673) {
                return null;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void m309() {
        m306();
        IntentFilter intentFilterMo304 = mo304();
        if (intentFilterMo304.countActions() == 0) {
            return;
        }
        if (((C0081) this.f231) == null) {
            this.f231 = new C0081(this, 0);
        }
        ((LayoutInflaterFactory2C0068) this.f232).f169.registerReceiver((C0081) this.f231, intentFilterMo304);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public MenuItem m310(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC7660)) {
            return menuItem;
        }
        InterfaceMenuItemC7660 interfaceMenuItemC7660 = (InterfaceMenuItemC7660) menuItem;
        if (((C0283) this.f232) == null) {
            this.f232 = new C0283(0);
        }
        MenuItem menuItem2 = (MenuItem) ((C0283) this.f232).get(interfaceMenuItemC7660);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC7792 menuItemC7792 = new MenuItemC7792((Context) this.f231, interfaceMenuItemC7660);
        ((C0283) this.f232).put(interfaceMenuItemC7660, menuItemC7792);
        return menuItemC7792;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public abstract int mo311();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean m312() {
        C2354 c2354 = SpecialEffectsController$Operation$State.Companion;
        C2357 c2357 = (C2357) this.f231;
        View view = c2357.f6980.f6880;
        view.getClass();
        c2354.getClass();
        SpecialEffectsController$Operation$State specialEffectsController$Operation$StateM4465 = C2354.m4465(view);
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State = c2357.f6982;
        if (specialEffectsController$Operation$StateM4465 == specialEffectsController$Operation$State) {
            return true;
        }
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State2 = SpecialEffectsController$Operation$State.VISIBLE;
        return (specialEffectsController$Operation$StateM4465 == specialEffectsController$Operation$State2 || specialEffectsController$Operation$State == specialEffectsController$Operation$State2) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public abstract void mo313();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int[] m314(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.f232;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public String m315() {
        String str = (String) this.f231;
        if (str != null) {
            return str;
        }
        AbstractC4394.m8918("text");
        throw null;
    }

    @Override // p228.InterfaceC8033
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public InterfaceC8032 mo316(C8026 c8026) {
        Context context = (Context) this.f231;
        Class cls = (Class) this.f232;
        return new C8008(context, c8026.m13483(File.class, cls), c8026.m13483(Uri.class, cls), cls);
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

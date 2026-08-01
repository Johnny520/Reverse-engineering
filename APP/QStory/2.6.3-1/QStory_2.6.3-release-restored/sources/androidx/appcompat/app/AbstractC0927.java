package androidx.appcompat.app;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.C0869;
import androidx.activity.compose.C0852;
import androidx.collection.C1130;
import androidx.core.os.C3002;
import androidx.fragment.app.C3187;
import androidx.fragment.app.C3190;
import androidx.fragment.app.SpecialEffectsController$Operation$State;
import io.ktor.util.C5043;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import p050.AbstractC7176;
import p179.InterfaceMenuItemC8490;
import p189.C8564;
import p206.MenuItemC8622;
import p243.C8838;
import p244.C8856;
import p244.InterfaceC8862;
import p244.InterfaceC8863;
import p252.AbstractC8950;
import p252.C8949;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0927 implements InterfaceC8863 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f576;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f577;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f578;

    public AbstractC0927(C0852 c0852) {
        this.f578 = 3;
        this.f576 = new C0869(this, 2);
        this.f577 = new C8564(this, c0852);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e A[LOOP:1: B:16:0x0053->B:68:0x012e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0139 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        int length;
        int i;
        int length2;
        int i2;
        switch (this.f578) {
            case 6:
                List<C8949> list = (List) this.f577;
                boolean zIsEmpty = list.isEmpty();
                String str = (String) this.f576;
                if (zIsEmpty) {
                    return str;
                }
                int length3 = str.length();
                int length4 = 0;
                for (C8949 c8949 : list) {
                    length4 += c8949.f22761.length() + c8949.f22762.length() + 3;
                }
                StringBuilder sb = new StringBuilder(length3 + length4);
                sb.append(str);
                int size = list.size() - 1;
                if (size >= 0) {
                    int i3 = 0;
                    while (true) {
                        C8949 c89492 = (C8949) list.get(i3);
                        sb.append("; ");
                        sb.append(c89492.f22762);
                        sb.append("=");
                        String str2 = c89492.f22761;
                        Set set = AbstractC8950.f22763;
                        if (str2.length() == 0) {
                            StringBuilder sb2 = new StringBuilder("\"");
                            length = str2.length();
                            while (i < length) {
                            }
                            sb2.append("\"");
                            sb.append(sb2.toString());
                            if (i3 != size) {
                            }
                        } else if (str2.length() >= 2) {
                            if (str2.length() == 0) {
                                C5043.m9176("Char sequence is empty.");
                                return null;
                            }
                            if (str2.charAt(0) == '\"' && AbstractC5976.m10727(str2) == '\"') {
                                int i4 = 1;
                                do {
                                    int iM10730 = AbstractC5976.m10730(str2, '\"', i4, 4);
                                    if (iM10730 != str2.length() - 1) {
                                        int i5 = 0;
                                        for (int i6 = iM10730 - 1; str2.charAt(i6) == '\\'; i6--) {
                                            i5++;
                                        }
                                        if (i5 % 2 == 0) {
                                            length2 = str2.length();
                                            while (i2 < length2) {
                                            }
                                        } else {
                                            i4 = iM10730 + 1;
                                        }
                                    }
                                    sb.append(str2);
                                    if (i3 != size) {
                                    }
                                } while (i4 < str2.length());
                                sb.append(str2);
                                if (i3 != size) {
                                }
                            } else {
                                length2 = str2.length();
                                for (i2 = 0; i2 < length2; i2++) {
                                    if (AbstractC8950.f22763.contains(Character.valueOf(str2.charAt(i2)))) {
                                        StringBuilder sb22 = new StringBuilder("\"");
                                        length = str2.length();
                                        for (i = 0; i < length; i++) {
                                            char cCharAt = str2.charAt(i);
                                            if (cCharAt == '\t') {
                                                sb22.append("\\t");
                                            } else if (cCharAt == '\n') {
                                                sb22.append("\\n");
                                            } else if (cCharAt == '\r') {
                                                sb22.append("\\r");
                                            } else if (cCharAt == '\"') {
                                                sb22.append("\\\"");
                                            } else if (cCharAt != '\\') {
                                                sb22.append(cCharAt);
                                            } else {
                                                sb22.append("\\\\");
                                            }
                                        }
                                        sb22.append("\"");
                                        sb.append(sb22.toString());
                                        if (i3 != size) {
                                            i3++;
                                        }
                                    }
                                }
                                sb.append(str2);
                                if (i3 != size) {
                                }
                            }
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public abstract int[] mo864(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract IntentFilter mo865();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m866() {
        C3190 c3190 = (C3190) this.f576;
        C3002 c3002 = (C3002) this.f577;
        LinkedHashSet linkedHashSet = c3190.f7324;
        if (linkedHashSet.remove(c3002) && linkedHashSet.isEmpty()) {
            c3190.m5040();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m867() {
        C0928 c0928 = (C0928) this.f576;
        if (c0928 != null) {
            try {
                ((LayoutInflaterFactory2C0915) this.f577).f514.unregisterReceiver(c0928);
            } catch (IllegalArgumentException unused) {
            }
            this.f576 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public abstract int[] mo868(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public String m869(String str) {
        str.getClass();
        List list = (List) this.f577;
        int iM12460 = AbstractC7176.m12460(list);
        if (iM12460 < 0) {
            return null;
        }
        int i = 0;
        while (true) {
            C8949 c8949 = (C8949) list.get(i);
            if (AbstractC5971.m10689(c8949.f22762, str)) {
                return c8949.f22761;
            }
            if (i == iM12460) {
                return null;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void m870() {
        m867();
        IntentFilter intentFilterMo865 = mo865();
        if (intentFilterMo865.countActions() == 0) {
            return;
        }
        if (((C0928) this.f576) == null) {
            this.f576 = new C0928(this, 0);
        }
        ((LayoutInflaterFactory2C0915) this.f577).f514.registerReceiver((C0928) this.f576, intentFilterMo865);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public MenuItem m871(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC8490)) {
            return menuItem;
        }
        InterfaceMenuItemC8490 interfaceMenuItemC8490 = (InterfaceMenuItemC8490) menuItem;
        if (((C1130) this.f577) == null) {
            this.f577 = new C1130(0);
        }
        MenuItem menuItem2 = (MenuItem) ((C1130) this.f577).get(interfaceMenuItemC8490);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC8622 menuItemC8622 = new MenuItemC8622((Context) this.f576, interfaceMenuItemC8490);
        ((C1130) this.f577).put(interfaceMenuItemC8490, menuItemC8622);
        return menuItemC8622;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public abstract int mo872();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean m873() {
        C3187 c3187 = SpecialEffectsController$Operation$State.Companion;
        C3190 c3190 = (C3190) this.f576;
        View view = c3190.f7326.f7226;
        view.getClass();
        c3187.getClass();
        SpecialEffectsController$Operation$State specialEffectsController$Operation$StateM5035 = C3187.m5035(view);
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State = c3190.f7328;
        if (specialEffectsController$Operation$StateM5035 == specialEffectsController$Operation$State) {
            return true;
        }
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State2 = SpecialEffectsController$Operation$State.VISIBLE;
        return (specialEffectsController$Operation$StateM5035 == specialEffectsController$Operation$State2 || specialEffectsController$Operation$State == specialEffectsController$Operation$State2) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public abstract void mo874();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int[] m875(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.f577;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public String m876() {
        String str = (String) this.f576;
        if (str != null) {
            return str;
        }
        AbstractC5227.m9467("text");
        throw null;
    }

    @Override // p244.InterfaceC8863
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public InterfaceC8862 mo877(C8856 c8856) {
        Context context = (Context) this.f576;
        Class cls = (Class) this.f577;
        return new C8838(context, c8856.m14070(File.class, cls), c8856.m14070(Uri.class, cls), cls);
    }

    public AbstractC0927(String str, List list) {
        this.f578 = 6;
        str.getClass();
        list.getClass();
        this.f576 = str;
        this.f577 = list;
    }

    public AbstractC0927(Context context) {
        this.f578 = 4;
        this.f576 = context;
    }

    public /* synthetic */ AbstractC0927(Object obj, int i, Object obj2) {
        this.f578 = i;
        this.f576 = obj;
        this.f577 = obj2;
    }

    public AbstractC0927() {
        this.f578 = 1;
        this.f577 = new int[2];
    }

    public AbstractC0927(LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915) {
        this.f578 = 0;
        this.f577 = layoutInflaterFactory2C0915;
    }
}

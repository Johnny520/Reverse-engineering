package p050c0;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import org.luckypray.dexkit.C1031R;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0675m0 extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2102b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0678n0 f2103c;

    public C0675m0(int i2) {
        this.f2102b = i2;
        switch (i2) {
            case 1:
                this.f2103c = C0678n0.f2116a;
                break;
            case 2:
                this.f2103c = C0678n0.f2116a;
                break;
            case 3:
                this.f2103c = C0678n0.f2116a;
                break;
            default:
                this.f2103c = C0678n0.f2116a;
                break;
        }
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b c0760b) {
        switch (this.f2102b) {
            case 3:
                C0678n0 c0678n0 = this.f2103c;
                c0678n0.getClass();
                if (C0678n0.m1725p()) {
                    Object obj = c0760b.f2669b;
                    Menu menu = obj instanceof Menu ? (Menu) obj : null;
                    if (menu != null) {
                        C0678n0.m1713b(c0678n0, menu);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo1386b(C0760b c0760b) {
        TextView textViewM1712a;
        String strM1734y;
        WeakReference weakReference;
        TextView textView;
        String string;
        long j2;
        switch (this.f2102b) {
            case 0:
                this.f2103c.getClass();
                if (C0678n0.m1725p()) {
                    Object obj = c0760b.f2669b;
                    View view = obj instanceof View ? (View) obj : null;
                    if (view != null && C0678n0.m1714c(view) && (textViewM1712a = C0678n0.m1712a(this.f2103c, view)) != null) {
                        this.f2103c.getClass();
                        C0678n0.f2130o = C0678n0.m1730u(view, textViewM1712a);
                        C0678n0.f2131p = new WeakReference(textViewM1712a);
                        C0666j0 c0666j0 = C0678n0.f2130o;
                        if (c0666j0 == null || (strM1734y = c0666j0.f2068b) == null) {
                            this.f2103c.getClass();
                            strM1734y = C0678n0.m1734y(textViewM1712a);
                        }
                        C0678n0.f2132q = strM1734y;
                        C0678n0.f2133r = System.currentTimeMillis();
                        C0678n0 c0678n0 = this.f2103c;
                        String name = textViewM1712a.getClass().getName();
                        C0678n0 c0678n02 = this.f2103c;
                        CharSequence text = textViewM1712a.getText();
                        String string2 = text != null ? text.toString() : null;
                        if (string2 == null) {
                            string2 = "";
                        }
                        c0678n02.getClass();
                        String str = "long press target=" + name + " text=" + AbstractC0425j.m1021Z0(AbstractC0433r.m1032G0(string2, '\n', ' '), 32);
                        c0678n0.getClass();
                        C0678n0.m1711C(str);
                    }
                    break;
                }
                break;
            case 1:
                this.f2103c.getClass();
                if (C0678n0.m1725p()) {
                    Object obj2 = c0760b.f2669b;
                    MenuItem menuItem = obj2 instanceof MenuItem ? (MenuItem) obj2 : null;
                    if (menuItem != null && menuItem.getItemId() == 1212368196 && (weakReference = C0678n0.f2131p) != null && (textView = (TextView) weakReference.get()) != null) {
                        this.f2103c.getClass();
                        if (C0678n0.m1723n(textView)) {
                            this.f2103c.getClass();
                            C0678n0.m1709A(textView);
                            c0760b.m1946c(Boolean.TRUE);
                            break;
                        }
                    }
                }
                break;
            case 2:
                if (!C0678n0.f2129n) {
                    this.f2103c.getClass();
                    if (C0678n0.m1725p()) {
                        ConcurrentHashMap concurrentHashMap = C0678n0.f2122g;
                        if (!concurrentHashMap.isEmpty() || !C0678n0.f2121f.isEmpty()) {
                            Object obj3 = c0760b.f2669b;
                            TextView textView2 = obj3 instanceof TextView ? (TextView) obj3 : null;
                            if (textView2 != null && !AbstractC0307g.m699a(textView2.getTag(C1031R.id.abc_tag_custom_time), Boolean.TRUE) && C0678n0.m1714c(textView2)) {
                                Object[] objArr = c0760b.f2670c;
                                AbstractC0307g.m702d(objArr, "args");
                                Object objM537n0 = AbstractC0179j.m537n0(0, objArr);
                                if (objM537n0 != null && (string = objM537n0.toString()) != null) {
                                    String str2 = (String) C0678n0.f2121f.get(string);
                                    long j3 = 0;
                                    if (str2 == null) {
                                        C0678n0 c0678n03 = this.f2103c;
                                        if (!concurrentHashMap.isEmpty()) {
                                            c0678n03.getClass();
                                            Object parent = textView2;
                                            int i2 = 0;
                                            while (i2 < 10) {
                                                View view2 = parent instanceof View ? (View) parent : null;
                                                if (view2 == null) {
                                                    j2 = 0;
                                                    str2 = j2 > 0 ? (String) C0678n0.f2122g.get(Long.valueOf(j2)) : null;
                                                    j3 = j2;
                                                } else {
                                                    C0678n0 c0678n04 = C0678n0.f2116a;
                                                    C0666j0 c0666j0M1730u = C0678n0.m1730u(view2, textView2);
                                                    if (c0666j0M1730u != null) {
                                                        j2 = c0666j0M1730u.f2067a;
                                                        str2 = j2 > 0 ? (String) C0678n0.f2122g.get(Long.valueOf(j2)) : null;
                                                        j3 = j2;
                                                    } else {
                                                        i2++;
                                                        parent = view2.getParent();
                                                    }
                                                }
                                            }
                                            j2 = 0;
                                            str2 = j2 > 0 ? (String) C0678n0.f2122g.get(Long.valueOf(j2)) : null;
                                            j3 = j2;
                                        }
                                    }
                                    if (str2 != null) {
                                        this.f2103c.getClass();
                                        if (C0678n0.m1726q(textView2) && !str2.equals(string)) {
                                            c0760b.f2670c[0] = str2;
                                            C0678n0 c0678n05 = this.f2103c;
                                            String str3 = "rebind edited text msgId=" + j3 + " len=" + string.length() + "->" + str2.length();
                                            c0678n05.getClass();
                                            C0678n0.m1711C(str3);
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
        }
    }
}

package com.abc.core.features;

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
    public final /* synthetic */ MessageEditHook f2103c;

    public C0675m0(int i2) {
        this.f2102b = i2;
        switch (i2) {
            case 1:
                this.f2103c = MessageEditHook.f2116a;
                break;
            case 2:
                this.f2103c = MessageEditHook.f2116a;
                break;
            case 3:
                this.f2103c = MessageEditHook.f2116a;
                break;
            default:
                this.f2103c = MessageEditHook.f2116a;
                break;
        }
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b c0760b) {
        switch (this.f2102b) {
            case 3:
                MessageEditHook messageEditHook = this.f2103c;
                messageEditHook.getClass();
                if (MessageEditHook.m1725p()) {
                    Object obj = c0760b.f2669b;
                    Menu menu = obj instanceof Menu ? (Menu) obj : null;
                    if (menu != null) {
                        MessageEditHook.m1713b(messageEditHook, menu);
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
                if (MessageEditHook.m1725p()) {
                    Object obj = c0760b.f2669b;
                    View view = obj instanceof View ? (View) obj : null;
                    if (view != null && MessageEditHook.m1714c(view) && (textViewM1712a = MessageEditHook.m1712a(this.f2103c, view)) != null) {
                        this.f2103c.getClass();
                        MessageEditHook.f2130o = MessageEditHook.m1730u(view, textViewM1712a);
                        MessageEditHook.f2131p = new WeakReference(textViewM1712a);
                        C0666j0 c0666j0 = MessageEditHook.f2130o;
                        if (c0666j0 == null || (strM1734y = c0666j0.f2068b) == null) {
                            this.f2103c.getClass();
                            strM1734y = MessageEditHook.m1734y(textViewM1712a);
                        }
                        MessageEditHook.f2132q = strM1734y;
                        MessageEditHook.f2133r = System.currentTimeMillis();
                        MessageEditHook messageEditHook = this.f2103c;
                        String name = textViewM1712a.getClass().getName();
                        MessageEditHook messageEditHook2 = this.f2103c;
                        CharSequence text = textViewM1712a.getText();
                        String string2 = text != null ? text.toString() : null;
                        if (string2 == null) {
                            string2 = "";
                        }
                        messageEditHook2.getClass();
                        String str = "long press target=" + name + " text=" + AbstractC0425j.m1021Z0(AbstractC0433r.m1032G0(string2, '\n', ' '), 32);
                        messageEditHook.getClass();
                        MessageEditHook.m1711C(str);
                    }
                    break;
                }
                break;
            case 1:
                this.f2103c.getClass();
                if (MessageEditHook.m1725p()) {
                    Object obj2 = c0760b.f2669b;
                    MenuItem menuItem = obj2 instanceof MenuItem ? (MenuItem) obj2 : null;
                    if (menuItem != null && menuItem.getItemId() == 1212368196 && (weakReference = MessageEditHook.f2131p) != null && (textView = (TextView) weakReference.get()) != null) {
                        this.f2103c.getClass();
                        if (MessageEditHook.m1723n(textView)) {
                            this.f2103c.getClass();
                            MessageEditHook.m1709A(textView);
                            c0760b.m1946c(Boolean.TRUE);
                            break;
                        }
                    }
                }
                break;
            case 2:
                if (!MessageEditHook.f2129n) {
                    this.f2103c.getClass();
                    if (MessageEditHook.m1725p()) {
                        ConcurrentHashMap concurrentHashMap = MessageEditHook.f2122g;
                        if (!concurrentHashMap.isEmpty() || !MessageEditHook.f2121f.isEmpty()) {
                            Object obj3 = c0760b.f2669b;
                            TextView textView2 = obj3 instanceof TextView ? (TextView) obj3 : null;
                            if (textView2 != null && !AbstractC0307g.m699a(textView2.getTag(C1031R.id.abc_tag_custom_time), Boolean.TRUE) && MessageEditHook.m1714c(textView2)) {
                                Object[] objArr = c0760b.f2670c;
                                AbstractC0307g.m702d(objArr, "args");
                                Object objM537n0 = AbstractC0179j.m537n0(0, objArr);
                                if (objM537n0 != null && (string = objM537n0.toString()) != null) {
                                    String str2 = (String) MessageEditHook.f2121f.get(string);
                                    long j3 = 0;
                                    if (str2 == null) {
                                        MessageEditHook messageEditHook3 = this.f2103c;
                                        if (!concurrentHashMap.isEmpty()) {
                                            messageEditHook3.getClass();
                                            Object parent = textView2;
                                            int i2 = 0;
                                            while (i2 < 10) {
                                                View view2 = parent instanceof View ? (View) parent : null;
                                                if (view2 == null) {
                                                    j2 = 0;
                                                    str2 = j2 > 0 ? (String) MessageEditHook.f2122g.get(Long.valueOf(j2)) : null;
                                                    j3 = j2;
                                                } else {
                                                    MessageEditHook messageEditHook4 = MessageEditHook.f2116a;
                                                    C0666j0 c0666j0M1730u = MessageEditHook.m1730u(view2, textView2);
                                                    if (c0666j0M1730u != null) {
                                                        j2 = c0666j0M1730u.f2067a;
                                                        str2 = j2 > 0 ? (String) MessageEditHook.f2122g.get(Long.valueOf(j2)) : null;
                                                        j3 = j2;
                                                    } else {
                                                        i2++;
                                                        parent = view2.getParent();
                                                    }
                                                }
                                            }
                                            j2 = 0;
                                            str2 = j2 > 0 ? (String) MessageEditHook.f2122g.get(Long.valueOf(j2)) : null;
                                            j3 = j2;
                                        }
                                    }
                                    if (str2 != null) {
                                        this.f2103c.getClass();
                                        if (MessageEditHook.m1726q(textView2) && !str2.equals(string)) {
                                            c0760b.f2670c[0] = str2;
                                            MessageEditHook messageEditHook5 = this.f2103c;
                                            String str3 = "rebind edited text msgId=" + j3 + " len=" + string.length() + "->" + str2.length();
                                            messageEditHook5.getClass();
                                            MessageEditHook.m1711C(str3);
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

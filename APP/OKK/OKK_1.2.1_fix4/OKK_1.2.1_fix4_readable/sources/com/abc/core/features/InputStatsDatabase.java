package com.abc.core.features;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import de.robv.android.xposed.AbstractC0762d;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0146l;
import p031Q0.AbstractC0307g;
import p031Q0.C0316p;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: c0.I0 */
/* JADX INFO: loaded from: classes.dex */
public final class InputStatsDatabase {

    /* JADX INFO: renamed from: a */
    public static final InputStatsDatabase f1818a = new InputStatsDatabase();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f1819b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f1820c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f1821d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public static final C0691r1 f1822e = new C0691r1();

    /* JADX INFO: renamed from: f */
    public static final Set f1823f;

    /* JADX INFO: renamed from: g */
    public static volatile Context f1824g;

    /* JADX INFO: renamed from: h */
    public static volatile View f1825h;

    static {
        Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        AbstractC0307g.m702d(setNewSetFromMap, "newSetFromMap(...)");
        f1823f = setNewSetFromMap;
    }

    /* JADX INFO: renamed from: a */
    public static void m1473a(View view) {
        Object objM116u;
        String strM914v;
        try {
            EditText editText = view instanceof EditText ? (EditText) view : null;
            if (editText == null || !m1478f(editText)) {
                return;
            }
            Set set = f1823f;
            synchronized (set) {
                set.add(editText);
            }
            C0598J0 c0598j0M1413a = InputStatsConfig.m1413a();
            if (c0598j0M1413a.f1828a) {
                Context context = f1824g;
                SharedPreferences sharedPreferences = context != null ? context.getSharedPreferences("abc_input_stats", 0) : null;
                if (sharedPreferences == null) {
                    return;
                }
                String string = LocalDate.now().toString();
                AbstractC0307g.m702d(string, "toString(...)");
                strM914v = AbstractC0358S.m914v(c0598j0M1413a.f1830c, m1479g(sharedPreferences, string));
            } else {
                strM914v = "";
            }
            CharSequence hint = editText.getHint();
            if (AbstractC0307g.m699a(hint != null ? hint.toString() : null, strM914v)) {
                return;
            }
            AtomicBoolean atomicBoolean = f1821d;
            if (!atomicBoolean.compareAndSet(false, true)) {
                return;
            }
            try {
                editText.setHint(strM914v);
                atomicBoolean.set(false);
                objM116u = C0146l.f339a;
            } catch (Throwable th) {
                atomicBoolean.set(false);
                throw th;
            }
        } catch (Throwable th2) {
            objM116u = AbstractC0040p.m116u(th2);
        }
        AbstractC0141g.m465a(objM116u);
    }

    /* JADX INFO: renamed from: b */
    public static void m1474b(View view) {
        if (view instanceof EditText) {
            EditText editText = (EditText) view;
            Set set = f1823f;
            synchronized (set) {
                set.add(editText);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0307g.m702d(childAt, "getChildAt(...)");
                m1474b(childAt);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1475c(ViewGroup viewGroup, View view) {
        if (viewGroup == view) {
            return true;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == view) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && m1475c((ViewGroup) childAt, view)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static EditText m1476d(View view) {
        if (view instanceof EditText) {
            return (EditText) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            AbstractC0307g.m702d(childAt, "getChildAt(...)");
            EditText editTextM1476d = m1476d(childAt);
            if (editTextM1476d != null) {
                return editTextM1476d;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static int m1477e(Class cls, String str, Class... clsArr) {
        try {
            C0316p c0316p = new C0316p(2);
            ArrayList arrayList = c0316p.f597a;
            c0316p.m710b(clsArr);
            c0316p.m709a(new InputStatsMessageHook(25, false));
            AbstractC0358S.m904q(cls, str, arrayList.toArray(new Object[arrayList.size()]));
            return 1;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m1478f(EditText editText) {
        if (editText.getClass().getName().equals("com.tencent.mm.ui.widget.cedit.api.MMFlexEditText") || AbstractC0425j.m1005J0(editText.getClass().getName(), "MMFlexEditText", false)) {
            return true;
        }
        View view = f1825h;
        if ((view instanceof ViewGroup) && m1475c((ViewGroup) view, editText)) {
            return true;
        }
        for (Object parent = editText.getParent(); parent instanceof View; parent = ((View) parent).getParent()) {
            if (parent.getClass().getName().equals("com.tencent.mm.pluginsdk.ui.chat.ChatFooter")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static C0601K0 m1479g(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString("date", "");
        String str2 = string == null ? "" : string;
        C0601K0 c0601k0 = new C0601K0(str2, sharedPreferences.getInt("totalMsg", 0), sharedPreferences.getInt("textMsg", 0), sharedPreferences.getInt("textWord", 0), sharedPreferences.getInt("emojiMsg", 0), sharedPreferences.getInt("transferMsg", 0), sharedPreferences.getInt("redBagMsg", 0), sharedPreferences.getInt("fileMsg", 0));
        C0601K0 c0601k02 = str2.equals(str) ? c0601k0 : new C0601K0(str, 0, 0, 0, 0, 0, 0, 0);
        if (!c0601k02.equals(c0601k0)) {
            m1481i(sharedPreferences, c0601k02);
        }
        return c0601k02;
    }

    /* JADX INFO: renamed from: h */
    public static String m1480h(ContentValues contentValues, int i2, String str) {
        String asString = contentValues.getAsString("talker");
        if (asString == null && (asString = contentValues.getAsString("field_talker")) == null && (asString = contentValues.getAsString("username")) == null && (asString = contentValues.getAsString("field_username")) == null) {
            asString = "";
        }
        Long asLong = contentValues.getAsLong("createTime");
        long jLongValue = 0;
        long jLongValue2 = (asLong == null && (asLong = contentValues.getAsLong("field_createTime")) == null && (asLong = contentValues.getAsLong("msgCreateTime")) == null && (asLong = contentValues.getAsLong("field_msgCreateTime")) == null) ? 0L : asLong.longValue();
        Long asLong2 = contentValues.getAsLong("msgId");
        long jLongValue3 = (asLong2 == null && (asLong2 = contentValues.getAsLong("field_msgId")) == null && (asLong2 = contentValues.getAsLong("rowid")) == null && (asLong2 = contentValues.getAsLong("field_rowid")) == null) ? 0L : asLong2.longValue();
        Long asLong3 = contentValues.getAsLong("msgSvrId");
        if (asLong3 != null) {
            jLongValue = asLong3.longValue();
        } else {
            Long asLong4 = contentValues.getAsLong("field_msgSvrId");
            if (asLong4 != null) {
                jLongValue = asLong4.longValue();
            }
        }
        return asString + "|" + jLongValue2 + "|" + jLongValue3 + "|" + jLongValue + "|" + i2 + "|" + str.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public static void m1481i(SharedPreferences sharedPreferences, C0601K0 c0601k0) {
        sharedPreferences.edit().putString("date", c0601k0.f1835a).putInt("totalMsg", c0601k0.f1836b).putInt("textMsg", c0601k0.f1837c).putInt("textWord", c0601k0.f1838d).putInt("emojiMsg", c0601k0.f1839e).putInt("transferMsg", c0601k0.f1840f).putInt("redBagMsg", c0601k0.f1841g).putInt("fileMsg", c0601k0.f1842h).apply();
    }

    /* JADX INFO: renamed from: j */
    public static void m1482j(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-InputStats] " + str);
        } catch (Throwable unused) {
        }
    }
}

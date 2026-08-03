package p050c0;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.widget.Toast;
import androidx.emoji2.text.RunnableC0486k;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;
import p056f0.C0802M;
import p056f0.C0810V;
import p056f0.C0813Y;
import p056f0.C0826f0;

/* JADX INFO: renamed from: c0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0674m extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2100b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2101c;

    public /* synthetic */ C0674m(int i2, Object obj) {
        this.f2100b = i2;
        this.f2101c = obj;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b c0760b) {
        final Object obj;
        Uri data;
        Object objM116u;
        String strM2081a;
        final int i2 = 3;
        final int i3 = 2;
        final int i4 = 1;
        final int i5 = 0;
        switch (this.f2100b) {
            case 1:
                if (C0710y.m1807b()) {
                    Object obj2 = c0760b.f2669b;
                    View view = obj2 instanceof View ? (View) obj2 : null;
                    ((C0588G) this.f2101c).getClass();
                    C0588G.m1437x(view);
                    break;
                }
                break;
            case 3:
                if (C0693s0.f2192f && (obj = c0760b.f2669b) != null) {
                    ((C0693s0) this.f2101c).m1791a(obj);
                    Handler handler = C0693s0.f2190d;
                    handler.postDelayed(new Runnable() { // from class: c0.r0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i5) {
                                case 0:
                                    Object obj3 = obj;
                                    AbstractC0307g.m703e(obj3, "$mainUi");
                                    C0693s0.f2187a.m1791a(obj3);
                                    break;
                                case 1:
                                    Object obj4 = obj;
                                    AbstractC0307g.m703e(obj4, "$mainUi");
                                    C0693s0.f2187a.m1791a(obj4);
                                    break;
                                case 2:
                                    Object obj5 = obj;
                                    AbstractC0307g.m703e(obj5, "$mainUi");
                                    C0693s0.f2187a.m1791a(obj5);
                                    break;
                                default:
                                    Object obj6 = obj;
                                    AbstractC0307g.m703e(obj6, "$mainUi");
                                    C0693s0.f2187a.m1791a(obj6);
                                    break;
                            }
                        }
                    }, 120L);
                    handler.postDelayed(new Runnable() { // from class: c0.r0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    Object obj3 = obj;
                                    AbstractC0307g.m703e(obj3, "$mainUi");
                                    C0693s0.f2187a.m1791a(obj3);
                                    break;
                                case 1:
                                    Object obj4 = obj;
                                    AbstractC0307g.m703e(obj4, "$mainUi");
                                    C0693s0.f2187a.m1791a(obj4);
                                    break;
                                case 2:
                                    Object obj5 = obj;
                                    AbstractC0307g.m703e(obj5, "$mainUi");
                                    C0693s0.f2187a.m1791a(obj5);
                                    break;
                                default:
                                    Object obj6 = obj;
                                    AbstractC0307g.m703e(obj6, "$mainUi");
                                    C0693s0.f2187a.m1791a(obj6);
                                    break;
                            }
                        }
                    }, 360L);
                    handler.postDelayed(new Runnable() { // from class: c0.r0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    Object obj3 = obj;
                                    AbstractC0307g.m703e(obj3, "$mainUi");
                                    C0693s0.f2187a.m1791a(obj3);
                                    break;
                                case 1:
                                    Object obj4 = obj;
                                    AbstractC0307g.m703e(obj4, "$mainUi");
                                    C0693s0.f2187a.m1791a(obj4);
                                    break;
                                case 2:
                                    Object obj5 = obj;
                                    AbstractC0307g.m703e(obj5, "$mainUi");
                                    C0693s0.f2187a.m1791a(obj5);
                                    break;
                                default:
                                    Object obj6 = obj;
                                    AbstractC0307g.m703e(obj6, "$mainUi");
                                    C0693s0.f2187a.m1791a(obj6);
                                    break;
                            }
                        }
                    }, 800L);
                    handler.postDelayed(new Runnable() { // from class: c0.r0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    Object obj3 = obj;
                                    AbstractC0307g.m703e(obj3, "$mainUi");
                                    C0693s0.f2187a.m1791a(obj3);
                                    break;
                                case 1:
                                    Object obj4 = obj;
                                    AbstractC0307g.m703e(obj4, "$mainUi");
                                    C0693s0.f2187a.m1791a(obj4);
                                    break;
                                case 2:
                                    Object obj5 = obj;
                                    AbstractC0307g.m703e(obj5, "$mainUi");
                                    C0693s0.f2187a.m1791a(obj5);
                                    break;
                                default:
                                    Object obj6 = obj;
                                    AbstractC0307g.m703e(obj6, "$mainUi");
                                    C0693s0.f2187a.m1791a(obj6);
                                    break;
                            }
                        }
                    }, 1600L);
                }
                break;
            case 8:
                C0810V c0810v = (C0810V) this.f2101c;
                Object[] objArr = c0760b.f2670c;
                AbstractC0307g.m702d(objArr, "args");
                Object objM537n0 = AbstractC0179j.m537n0(0, objArr);
                Integer num = objM537n0 instanceof Integer ? (Integer) objM537n0 : null;
                if (num != null && num.intValue() == 658720) {
                    Object[] objArr2 = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr2, "args");
                    Object objM537n02 = AbstractC0179j.m537n0(1, objArr2);
                    Integer num2 = objM537n02 instanceof Integer ? (Integer) objM537n02 : null;
                    if (num2 != null && num2.intValue() == -1) {
                        Object[] objArr3 = c0760b.f2670c;
                        AbstractC0307g.m702d(objArr3, "args");
                        Object objM537n03 = AbstractC0179j.m537n0(2, objArr3);
                        Intent intent = objM537n03 instanceof Intent ? (Intent) objM537n03 : null;
                        if (intent != null) {
                            Object obj3 = c0760b.f2669b;
                            Activity activity = obj3 instanceof Activity ? (Activity) obj3 : null;
                            if (activity != null && (data = intent.getData()) != null) {
                                try {
                                    strM2081a = C0810V.m2081a(c0810v, data);
                                } catch (Throwable th) {
                                    objM116u = AbstractC0040p.m116u(th);
                                }
                                if (strM2081a != null && !AbstractC0425j.m1013R0(strM2081a)) {
                                    C0651e0 c0651e0 = C0651e0.f2022a;
                                    C0651e0.m1635d(strM2081a);
                                    String string = data.toString();
                                    AbstractC0307g.m702d(string, "toString(...)");
                                    C0661h1 c0661h1 = C0661h1.f2048a;
                                    C0661h1.m1664h("download_redirect_tree_uri", string);
                                    try {
                                        activity.getContentResolver().takePersistableUriPermission(data, 3);
                                    } catch (Throwable th2) {
                                        AbstractC0040p.m116u(th2);
                                    }
                                    C0661h1.f2048a.m1667g("download_redirect_enabled", true, false);
                                    C0810V.m2105z(activity, "下载目录已设置：".concat(strM2081a));
                                    objM116u = C0146l.f339a;
                                    Throwable thM465a = AbstractC0141g.m465a(objM116u);
                                    if (thM465a != null) {
                                        String str = "设置目录失败：" + thM465a.getMessage();
                                        c0810v.getClass();
                                        C0810V.m2105z(activity, str);
                                    }
                                }
                                C0810V.m2105z(activity, "无法解析所选目录，请重试");
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x035d  */
    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo1386b(C0760b c0760b) {
        Object obj;
        Object obj2;
        Object obj3;
        boolean zEquals;
        Object objM116u;
        Object objM116u2;
        Object objM116u3;
        Intent intent;
        String stringExtra;
        Object objM116u4;
        Object objM116u5;
        Object objM116u6;
        Object obj4;
        Object obj5;
        Object objM2144j;
        int i2 = 2;
        str = null;
        str = null;
        String str = null;
        int i3 = 0;
        Object obj6 = this.f2101c;
        int i4 = 1;
        switch (this.f2100b) {
            case 0:
                CopyOnWriteArrayList copyOnWriteArrayList = AbstractC0642b0.f1999a;
                AbstractC0642b0.m1626m(c0760b.f2669b);
                Object[] objArr = c0760b.f2670c;
                AbstractC0307g.m702d(objArr, "args");
                int length = objArr.length;
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        obj = objArr[i5];
                        if (!(obj instanceof String)) {
                            i5++;
                        }
                    } else {
                        obj = null;
                    }
                }
                String str2 = obj instanceof String ? (String) obj : null;
                if (str2 != null) {
                    C0686q c0686qM1753a = C0683p.m1753a();
                    String str3 = (String) obj6;
                    if (c0686qM1753a.f2149e) {
                        List list = AbstractC0604L0.f1853a;
                        AbstractC0307g.m703e(str3, "methodName");
                        List list2 = AbstractC0604L0.f1853a;
                        if ((list2 instanceof Collection) && list2.isEmpty()) {
                            zEquals = false;
                            if (zEquals) {
                            }
                        } else {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                if (AbstractC0425j.m1005J0(str2, (String) it.next(), true)) {
                                    zEquals = str3.equals("delete");
                                    if (zEquals) {
                                        AtomicBoolean atomicBoolean = C0677n.f2105a;
                                        c0760b.m1946c((str3.equals("delete") || AbstractC0433r.m1033H0(str3, "update", false)) ? 1 : 1L);
                                        C0677n.m1708q("BLOCKED media table " + str3 + " on " + str2);
                                    }
                                    break;
                                }
                            }
                            zEquals = false;
                            if (zEquals) {
                            }
                        }
                    }
                    if (!str2.equalsIgnoreCase("rcontact")) {
                        if (str2.equals("message") && c0686qM1753a.f2145a) {
                            Object[] objArr2 = c0760b.f2670c;
                            AbstractC0307g.m702d(objArr2, "args");
                            int length2 = objArr2.length;
                            while (true) {
                                if (i3 < length2) {
                                    obj2 = objArr2[i3];
                                    if (!(obj2 instanceof ContentValues)) {
                                        i3++;
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            ContentValues contentValues = obj2 instanceof ContentValues ? (ContentValues) obj2 : null;
                            if (contentValues != null && C0677n.m1692a(str3, contentValues, c0686qM1753a)) {
                                c0760b.m1946c(1);
                            }
                        }
                        break;
                    } else {
                        Object[] objArr3 = c0760b.f2670c;
                        AbstractC0307g.m702d(objArr3, "args");
                        int length3 = objArr3.length;
                        while (true) {
                            if (i3 < length3) {
                                obj3 = objArr3[i3];
                                if (!(obj3 instanceof ContentValues)) {
                                    i3++;
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        ContentValues contentValues2 = obj3 instanceof ContentValues ? (ContentValues) obj3 : null;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = AbstractC0642b0.f1999a;
                        if (contentValues2 != null) {
                            String asString = contentValues2.getAsString("username");
                            String string = asString != null ? AbstractC0425j.m1022a1(asString).toString() : null;
                            if (string == null) {
                                string = "";
                            }
                            if (string.length() != 0 && !AbstractC0680o.m1744g(string)) {
                                String asString2 = contentValues2.getAsString("conRemark");
                                String asString3 = contentValues2.getAsString("nickname");
                                String asString4 = contentValues2.getAsString("alias");
                                String strM1739b = AbstractC0680o.m1739b(asString2);
                                if (strM1739b == null && (strM1739b = AbstractC0680o.m1739b(asString3)) == null) {
                                    strM1739b = AbstractC0680o.m1739b(asString4);
                                }
                                if (strM1739b != null) {
                                    AbstractC0642b0.f2001c.put(string, strM1739b);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                C0710y.m1807b();
                break;
            case 2:
                ((C0645c0) obj6).getClass();
                if (C0645c0.m1628a()) {
                    c0760b.m1946c(Boolean.FALSE);
                    break;
                }
                break;
            case 4:
                ((C0655f1) obj6).getClass();
                if (C0655f1.m1637b()) {
                    Object[] objArr4 = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr4, "args");
                    Object objM537n0 = AbstractC0179j.m537n0(1, objArr4);
                    if (objM537n0 != null) {
                        try {
                            Object objM887g = AbstractC0358S.m887g(objM537n0, "j", new Object[0]);
                            objM116u = objM887g instanceof String ? (String) objM887g : null;
                        } catch (Throwable th) {
                            objM116u = AbstractC0040p.m116u(th);
                        }
                        boolean z2 = objM116u instanceof C0140f;
                        Object obj7 = objM116u;
                        if (z2) {
                            obj7 = null;
                        }
                        String str4 = (String) obj7;
                        if (str4 == null) {
                            try {
                                Object objM920y = AbstractC0358S.m920y(objM537n0, "f191135q");
                                objM116u2 = objM920y instanceof String ? (String) objM920y : null;
                            } catch (Throwable th2) {
                                objM116u2 = AbstractC0040p.m116u(th2);
                            }
                            boolean z3 = objM116u2 instanceof C0140f;
                            Object obj8 = objM116u2;
                            if (z3) {
                                obj8 = null;
                            }
                            str4 = (String) obj8;
                        }
                        if (str4 != null && str4.equals("achat_profile_id")) {
                            Object obj9 = c0760b.f2669b;
                            Activity activity = obj9 instanceof Activity ? (Activity) obj9 : null;
                            if (activity != null) {
                                String strM1638c = C0655f1.m1638c(activity);
                                if (!AbstractC0425j.m1013R0(strM1638c)) {
                                    try {
                                        Object systemService = activity.getSystemService("clipboard");
                                        AbstractC0307g.m701c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("wxid", strM1638c));
                                    } catch (Throwable th3) {
                                        AbstractC0040p.m116u(th3);
                                    }
                                    Toast.makeText(activity, "已复制 ".concat(strM1638c), 0).show();
                                }
                                c0760b.m1946c(Boolean.TRUE);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            case 5:
                C0688q1 c0688q1 = (C0688q1) obj6;
                c0688q1.getClass();
                if (C0688q1.m1771g()) {
                    Object[] objArr5 = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr5, "args");
                    Object objM537n02 = AbstractC0179j.m537n0(1, objArr5);
                    if (objM537n02 != null) {
                        try {
                            Object objM887g2 = AbstractC0358S.m887g(objM537n02, "j", new Object[0]);
                            objM116u3 = objM887g2 instanceof String ? (String) objM887g2 : null;
                        } catch (Throwable th4) {
                            objM116u3 = AbstractC0040p.m116u(th4);
                        }
                        boolean z4 = objM116u3 instanceof C0140f;
                        Object obj10 = objM116u3;
                        if (z4) {
                            obj10 = null;
                        }
                        String str5 = (String) obj10;
                        if (str5 != null && str5.equals("achat_real_name_tail")) {
                            Object obj11 = c0760b.f2669b;
                            Activity activity2 = obj11 instanceof Activity ? (Activity) obj11 : null;
                            if (activity2 != null) {
                                String strM1778o = C0688q1.m1778o(activity2);
                                if (strM1778o == null || AbstractC0425j.m1013R0(strM1778o)) {
                                    Toast.makeText(activity2, "无法获取微信 ID", 0).show();
                                } else {
                                    String str6 = (String) C0688q1.f2170h.get(strM1778o);
                                    if (str6 != null) {
                                        Toast.makeText(activity2, "实名: ".concat(str6), 0).show();
                                    } else {
                                        Toast.makeText(activity2, "正在获取...", 0).show();
                                        Intent intent2 = activity2.getIntent();
                                        if ((intent2 != null && (stringExtra = intent2.getStringExtra("room_name")) != null) || ((intent = activity2.getIntent()) != null && (stringExtra = intent.getStringExtra("Chat_User")) != null && AbstractC0433r.m1028C0(stringExtra, "@chatroom"))) {
                                            str = stringExtra;
                                        }
                                        C0688q1.f2171i.remove(strM1778o);
                                        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                                        c0688q1.m1783c(strM1778o, str, new C0641b(atomicBoolean2, activity2, i4));
                                        C0688q1.f2169g.postDelayed(new RunnableC0486k(atomicBoolean2, strM1778o, activity2, i2), 13000L);
                                    }
                                }
                                c0760b.m1946c(Boolean.TRUE);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            case 6:
                C0709x1 c0709x1M1792a = C0703v1.m1792a();
                if (c0709x1M1792a.f2230a) {
                    C0706w1.m1797a((C0706w1) obj6, c0760b.f2669b, c0709x1M1792a.f2231b);
                    break;
                }
                break;
            case 7:
                if (((Boolean) C0605L1.m1490e(C0605L1.f1854a).f334a).booleanValue()) {
                    Object[] objArr6 = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr6, "args");
                    Object objM536m0 = AbstractC0179j.m536m0(objArr6);
                    if (objM536m0 != null) {
                        Class<?> cls = objM536m0.getClass();
                        ((C0611N1) obj6).getClass();
                        C0611N1.m1508b(cls);
                        break;
                    }
                }
                break;
            case 9:
                Object obj12 = c0760b.f2669b;
                AbstractC0307g.m702d(obj12, "thisObject");
                Object[] objArr7 = c0760b.f2670c;
                AbstractC0307g.m702d(objArr7, "args");
                Object objM537n03 = AbstractC0179j.m537n0(2, objArr7);
                ((C0826f0) obj6).getClass();
                try {
                    Number number = objM537n03 instanceof Number ? (Number) objM537n03 : null;
                    if (number != null) {
                        int iIntValue = number.intValue();
                        SparseArray sparseArrayM2143i = C0826f0.m2143i(obj12);
                        boolean z5 = (sparseArrayM2143i == null || (obj5 = sparseArrayM2143i.get(iIntValue)) == null || (objM2144j = C0826f0.m2144j(obj5)) == null || C0826f0.m2145k(objM2144j) != 168566822) ? false : true;
                        objM116u4 = Boolean.valueOf(z5);
                        break;
                    }
                } catch (Throwable th5) {
                    objM116u4 = AbstractC0040p.m116u(th5);
                }
                Boolean bool = Boolean.FALSE;
                boolean z6 = objM116u4 instanceof C0140f;
                Object obj13 = objM116u4;
                if (z6) {
                    obj13 = bool;
                }
                if (((Boolean) obj13).booleanValue()) {
                    Object obj14 = c0760b.f2669b;
                    AbstractC0307g.m702d(obj14, "thisObject");
                    try {
                        Field fieldM2138d = C0826f0.m2138d(obj14.getClass(), new C0813Y(22));
                        if (fieldM2138d != null) {
                            fieldM2138d.setAccessible(true);
                            obj4 = fieldM2138d.get(obj14);
                        } else {
                            obj4 = null;
                        }
                        objM116u5 = obj4 instanceof Context ? (Context) obj4 : null;
                    } catch (Throwable th6) {
                        objM116u5 = AbstractC0040p.m116u(th6);
                    }
                    boolean z7 = objM116u5 instanceof C0140f;
                    Object obj15 = objM116u5;
                    if (z7) {
                        obj15 = null;
                    }
                    Context context = (Context) obj15;
                    if (context != null) {
                        Activity activity3 = context instanceof Activity ? (Activity) context : null;
                        if (activity3 == null) {
                            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
                            Context baseContext = contextWrapper != null ? contextWrapper.getBaseContext() : null;
                            activity3 = baseContext instanceof Activity ? (Activity) baseContext : null;
                        }
                        if (activity3 == null || activity3.isFinishing()) {
                            Toast.makeText(context, "无法打开设置", 0).show();
                        } else {
                            try {
                                C0810V.f2933a.m2106w(activity3, C0802M.f2917b);
                                C0826f0.m2146l("embedded ui shown");
                                objM116u6 = C0146l.f339a;
                            } catch (Throwable th7) {
                                objM116u6 = AbstractC0040p.m116u(th7);
                            }
                            Throwable thM465a = AbstractC0141g.m465a(objM116u6);
                            if (thM465a != null) {
                                Toast.makeText(context, "打开失败: " + thM465a.getMessage(), 0).show();
                                C0826f0 c0826f0 = C0826f0.f2992a;
                                C0826f0.m2146l("open fail: " + thM465a.getMessage());
                            }
                        }
                        c0760b.m1946c(null);
                        break;
                    }
                    break;
                }
                break;
        }
    }

    public C0674m(int i2) {
        this.f2100b = i2;
        switch (i2) {
            case 2:
                this.f2101c = C0645c0.f2005a;
                break;
            case 3:
                this.f2101c = C0693s0.f2187a;
                break;
            case 4:
            case 7:
            case 8:
            default:
                this.f2101c = C0588G.f1768a;
                break;
            case 5:
                this.f2101c = C0688q1.f2163a;
                break;
            case 6:
                this.f2101c = C0706w1.f2217a;
                break;
            case 9:
                this.f2101c = C0826f0.f2992a;
                break;
        }
    }
}

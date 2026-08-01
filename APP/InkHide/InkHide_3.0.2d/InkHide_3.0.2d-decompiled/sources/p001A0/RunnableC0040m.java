package p001A0;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.activity.RunnableC0371b;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.p055lu.wxmask.bean.MaskItemBean;
import com.p055lu.wxmask.p057ui.MainActivity;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p004C.C0060d;
import p004C.C0066j;
import p007D0.C0094b;
import p022L.AbstractC0181k;
import p022L.RunnableC0178h;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0514f;
import p062e0.InterfaceC0551a;
import p067g0.AbstractC0575a;
import p069i.C0651W;
import p069i.C0709q1;
import p070i0.AbstractC0731a;
import p077m0.InterfaceC0765c;
import p084q0.C0804d;
import p084q0.C0806f;
import p086r0.C0831D1;
import p086r0.C0832E;
import p086r0.C0854L0;
import p086r0.C0881Y0;
import p086r0.ViewOnClickListenerC0948v0;
import p088s0.C0979a;
import p088s0.C0985g;
import p088s0.C0990l;
import p088s0.C0995q;
import p090t0.AbstractC1008c;
import p092u0.AbstractC1015a;
import p098x0.DialogInterfaceOnDismissListenerC1035a;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1135r;
import p102z0.C1119b;
import p102z0.C1124g;
import p102z0.C1142y;
import p102z0.C1143z;

/* JADX INFO: renamed from: A0.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0040m implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f255a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f256b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f257c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0040m(InterfaceC0551a interfaceC0551a, Activity activity, int i2) {
        this.f255a = i2;
        this.f257c = interfaceC0551a;
        this.f256b = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0474  */
    /* JADX WARN: Type inference failed for: r3v17, types: [q0.c] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ListView listView;
        ListView listView2;
        Object objMo1015f;
        String str;
        String str2;
        final int i2 = 2;
        Object obj = null;
        final int i3 = 0;
        final int i4 = 1;
        Object obj2 = this.f257c;
        Object obj3 = this.f256b;
        switch (this.f255a) {
            case 0:
                Activity activity = (Activity) obj3;
                AlertDialog.Builder title = new AlertDialog.Builder(activity).setTitle("动态适配");
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                LinearLayout linearLayout = new LinearLayout(activity);
                linearLayout.setOrientation(1);
                CopyOnWriteArrayList copyOnWriteArrayList = C0052y.f291a;
                linearLayout.setPadding(C0052y.m97b(activity, 24), C0052y.m97b(activity, 16), C0052y.m97b(activity, 24), C0052y.m97b(activity, 4));
                LinearLayout linearLayout2 = new LinearLayout(activity);
                linearLayout2.setOrientation(0);
                linearLayout2.setGravity(16);
                TextView textView = new TextView(activity);
                textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                textView.setText("检测到 " + size + " 项需要扫描适配");
                textView.setTextSize(17.0f);
                Typeface typeface = Typeface.DEFAULT_BOLD;
                textView.setTypeface(typeface);
                textView.setTextColor(Color.rgb(28, 28, 28));
                linearLayout2.addView(textView);
                TextView textView2 = new TextView(activity);
                textView2.setText(String.valueOf(size));
                textView2.setGravity(17);
                textView2.setTextSize(14.0f);
                textView2.setTypeface(typeface);
                textView2.setTextColor(Color.rgb(36, 117, 84));
                textView2.setPadding(C0052y.m97b(activity, 12), C0052y.m97b(activity, 4), C0052y.m97b(activity, 12), C0052y.m97b(activity, 4));
                textView2.setBackground(C0052y.m99d(Color.rgb(224, 245, 235), C0052y.m97b(activity, 14)));
                linearLayout2.addView(textView2);
                linearLayout.addView(linearLayout2);
                TextView textView3 = new TextView(activity);
                textView3.setText("开始后会自动扫描当前微信版本所需适配点。扫描成功后重启微信生效。");
                textView3.setTextSize(14.0f);
                textView3.setTextColor(Color.rgb(100, 100, 100));
                textView3.setPadding(0, C0052y.m97b(activity, 12), 0, 0);
                linearLayout.addView(textView3);
                title.setView(linearLayout).setCancelable(false).setPositiveButton("开始适配", new DialogInterfaceOnClickListenerC0041n(activity, arrayList)).setNegativeButton("暂不扫描", new DialogInterfaceOnClickListenerC0041n(arrayList, activity)).show();
                return;
            case 1:
                C0094b c0094b = new C0094b((String) obj3, "GET", null, null, 60);
                C0066j c0066j = new C0066j(i2);
                c0066j.f312c = c0094b;
                ((InterfaceC0204l) obj2).mo8c(c0066j.m151w());
                return;
            case 2:
                ((ProfileInstallerInitializer) obj3).getClass();
                (Build.VERSION.SDK_INT >= 28 ? AbstractC0181k.m384a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0178h((Context) obj2, i3), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 3:
                ((C0651W) obj3).m1267b((Typeface) obj2);
                return;
            case 4:
                final C0806f c0806f = (C0806f) obj3;
                if (((Boolean) AbstractC0514f.f1622b.mo1012c(obj2, "isHidden", new Object[0])).booleanValue()) {
                    AbstractC0731a.m1387d("isHidden");
                    return;
                }
                Activity activity2 = (Activity) AbstractC0514f.f1622b.mo1012c(obj2, "getActivity", new Object[0]);
                String name = activity2.getClass().getName();
                if (!"com.tencent.mm.ui.LauncherUI".equals(name) && !"com.tencent.mm.ui.chatting.ChattingUI".equals(name)) {
                    AbstractC0731a.m1387d("isNot Match Activity", name);
                    return;
                }
                String string = ((Bundle) AbstractC0514f.f1622b.mo1012c(obj2, "getArguments", new Object[0])).getString("Chat_User");
                boolean z2 = AbstractC1126i.f3786a;
                ArrayList arrayListM2433i = C1124g.m2433i();
                AbstractC0223g.m418e(string, "maskId");
                Iterator it = arrayListM2433i.iterator();
                int i5 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i5 = -1;
                    } else if (!string.equals(((MaskItemBean) it.next()).getMaskId())) {
                        i5++;
                    }
                }
                int iM2494p = AbstractC1135r.m2494p();
                if (iM2494p >= 2300) {
                    try {
                        Object objMo1015f2 = AbstractC0514f.f1622b.mo1015f(obj2, "f");
                        if (objMo1015f2 != null) {
                            if (iM2494p <= 2300) {
                                objMo1015f = AbstractC0514f.f1622b.mo1015f(objMo1015f2, "e");
                                if (!InterfaceC0765c.m1428a("com.tencent.mm.autogen.table.BaseContact").isAssignableFrom(objMo1015f.getClass())) {
                                }
                            } else if (iM2494p <= 2320) {
                                objMo1015f = AbstractC0514f.f1622b.mo1015f(objMo1015f2, "h");
                                if (InterfaceC0765c.m1428a("com.tencent.mm.autogen.table.BaseContact").isAssignableFrom(objMo1015f.getClass())) {
                                }
                            } else if (iM2494p <= 2360) {
                                objMo1015f = AbstractC0514f.f1622b.mo1015f(objMo1015f2, "h");
                            } else if (iM2494p <= 2800 || iM2494p <= 2429 || iM2494p == 2589) {
                                objMo1015f = AbstractC0514f.f1622b.mo1015f(objMo1015f2, "i");
                            } else if (iM2494p < 2841) {
                                objMo1015f = AbstractC0514f.f1622b.mo1015f(objMo1015f2, "j");
                            } else {
                                Field[] fieldArrMo1018i = AbstractC0514f.f1622b.mo1018i(objMo1015f2.getClass(), new C0026a(29));
                                if (fieldArrMo1018i == null || fieldArrMo1018i.length == 0) {
                                    fieldArrMo1018i = AbstractC0514f.f1622b.mo1018i(objMo1015f2.getClass(), new C0804d(i3));
                                }
                                if (fieldArrMo1018i.length > 0) {
                                    Field field = fieldArrMo1018i[0];
                                    Object obj4 = field.get(objMo1015f2);
                                    AbstractC0731a.m1387d(AbstractC1135r.m2493o(), "guess user info object, ", "find field: ", field.getName(), "=", obj4);
                                    objMo1015f = obj4;
                                } else {
                                    AbstractC0731a.m1387d(AbstractC1135r.m2493o(), "guess user info object fail!");
                                }
                            }
                        }
                    } catch (Throwable th) {
                        AbstractC0731a.m1387d("找不到当前聊天的用户信息", th);
                    }
                    if (objMo1015f == null) {
                        str = (String) AbstractC0514f.f1622b.mo1015f(objMo1015f, "field_conRemark");
                        str2 = (String) AbstractC0514f.f1622b.mo1015f(objMo1015f, "field_nickname");
                        AbstractC0731a.m1384a("chatUserInfo", AbstractC0575a.f1940a.m483f(objMo1015f));
                    } else {
                        str = "";
                        str2 = str;
                    }
                    if (i5 < 0) {
                        AbstractC0503h.m978P("已在隐藏名单中");
                        return;
                    }
                    C0979a c0979a = new C0979a(activity2, arrayListM2433i);
                    c0979a.f3510c = string;
                    if (str == null || str.isEmpty()) {
                        str = str2;
                    }
                    c0979a.f3511d = str != null ? str : "";
                    ?? r3 = new DialogInterface.OnClickListener() { // from class: q0.c
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i6) {
                            switch (i3) {
                                case 0:
                                    c0806f.f2678a = false;
                                    break;
                                case 1:
                                    c0806f.f2678a = true;
                                    break;
                                default:
                                    c0806f.f2678a = false;
                                    break;
                            }
                        }
                    };
                    c0979a.f3512e = "退出配置";
                    c0979a.f3509b = r3;
                    C0995q c0995q = new C0995q(activity2, new MaskItemBean(c0979a.f3510c, c0979a.f3511d, 0, null, null, null, 60, null));
                    AlertDialog alertDialogShow = new AlertDialog.Builder(activity2).setTitle("添加配置").setIcon(activity2.getApplicationInfo().icon).setView(c0995q.f3575a).setNegativeButton("关闭", (DialogInterface.OnClickListener) null).setPositiveButton("确定", (DialogInterface.OnClickListener) null).setNeutralButton(c0979a.f3512e, c0979a.f3509b).setOnDismissListener(null).show();
                    alertDialogShow.getButton(-1).setOnClickListener(new ViewOnClickListenerC0948v0(c0995q, c0979a, alertDialogShow, 1));
                    return;
                }
                if (iM2494p == 2140) {
                    try {
                        Object objMo1015f3 = AbstractC0514f.f1622b.mo1015f(obj2, "hED");
                        if (objMo1015f3 != null) {
                            AbstractC0514f.f1622b.mo1015f(objMo1015f3, "ZfP");
                        }
                    } catch (Throwable th2) {
                        AbstractC0731a.m1387d("找不到当前聊天的用户信息", th2);
                    }
                } else {
                    AbstractC0731a.m1387d("未适配的版本", AbstractC1135r.m2493o());
                }
                break;
                objMo1015f = null;
                if (objMo1015f == null) {
                }
                if (i5 < 0) {
                }
                break;
            case 5:
                final C0806f c0806f2 = (C0806f) obj2;
                c0806f2.getClass();
                Activity activity3 = (Activity) obj3;
                new AlertDialog.Builder(activity3).setTitle("配置提示").setIcon(activity3.getApplicationInfo().icon).setMessage("点击用户发起聊天，就可以对用户进行配置噢~").setCancelable(false).setPositiveButton("继续", new DialogInterface.OnClickListener() { // from class: q0.c
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i6) {
                        switch (i4) {
                            case 0:
                                c0806f2.f2678a = false;
                                break;
                            case 1:
                                c0806f2.f2678a = true;
                                break;
                            default:
                                c0806f2.f2678a = false;
                                break;
                        }
                    }
                }).setNeutralButton("忽略", new DialogInterface.OnClickListener() { // from class: q0.c
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i6) {
                        switch (i2) {
                            case 0:
                                c0806f2.f2678a = false;
                                break;
                            case 1:
                                c0806f2.f2678a = true;
                                break;
                            default:
                                c0806f2.f2678a = false;
                                break;
                        }
                    }
                }).setOnDismissListener(new DialogInterfaceOnDismissListenerC1035a(i2, c0806f2)).show();
                c0806f2.f2679b = true;
                AbstractC0731a.m1386c("show WebChatTipConfigUI");
                return;
            case 6:
                try {
                    boolean z3 = AbstractC1126i.f3786a;
                    C0832E c0832e = (C0832E) obj3;
                    if (C1124g.m2448x()) {
                        c0832e.getClass();
                        if (!C0832E.m1558v()) {
                            c0832e.m1563C(obj2);
                        }
                    }
                    c0832e.getClass();
                    C0832E.m1560x(obj2);
                    WeakReference weakReference = c0832e.f2778a;
                    if (weakReference != null && (listView2 = (ListView) weakReference.get()) != null) {
                        listView2.invalidateViews();
                    }
                    WeakReference weakReference2 = c0832e.f2778a;
                    if (weakReference2 != null && (listView = (ListView) weakReference2.get()) != null) {
                        listView.requestLayout();
                    }
                    AbstractC0731a.m1384a("hide close friend delayed list refresh", C0832E.m1549g(), obj2.getClass().getName());
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 7:
                C0854L0 c0854l0 = (C0854L0) obj2;
                C0854L0.m1720f(c0854l0);
                Window window = ((Activity) obj3).getWindow();
                View viewM1755y = c0854l0.m1755y(window != null ? window.getDecorView() : null);
                if (viewM1755y == null) {
                    return;
                }
                new WeakReference(viewM1755y);
                return;
            case 8:
                C0881Y0 c0881y0 = (C0881Y0) obj2;
                Object objM1803s = c0881y0.m1803s((Activity) obj3);
                if (objM1803s != null) {
                    c0881y0.m1793G(objM1803s);
                    return;
                }
                return;
            case 9:
                C0831D1 c0831d1 = (C0831D1) obj2;
                Activity activity4 = (Activity) obj3;
                if (c0831d1.m1542z(activity4)) {
                    Window window2 = activity4.getWindow();
                    c0831d1.m1528I(window2 != null ? window2.getDecorView() : null);
                    return;
                }
                return;
            case 10:
                ((C0831D1) obj3).m1529J((View) obj2);
                return;
            case 11:
                MaskItemBean maskItemBean = (MaskItemBean) obj3;
                String maskId = maskItemBean.getMaskId();
                AbstractC0223g.m418e(maskId, "identifier");
                C1143z c1143z = C1143z.f3876a;
                C1142y c1142yM2528b = C1143z.m2528b(maskId);
                if (c1142yM2528b == null) {
                    return;
                }
                C0709q1 c0709q1 = (C0709q1) obj2;
                if (((AtomicBoolean) c0709q1.f2401g).get()) {
                    return;
                }
                if (AbstractC0307q.m534d0(maskItemBean.getTagName())) {
                    String strM2526a = c1142yM2528b.m2526a(new C0060d(9, maskItemBean));
                    if (strM2526a == null) {
                        strM2526a = "";
                    }
                    if (!AbstractC0307q.m534d0(strM2526a)) {
                        maskItemBean.setTagName(strM2526a);
                        i3 = 1;
                    }
                }
                String str3 = c1142yM2528b.f3875h;
                String string2 = str3 != null ? AbstractC0299i.m507C0(str3).toString() : null;
                String str4 = string2 != null ? string2 : "";
                if (!AbstractC0307q.m534d0(maskItemBean.getAvatarUrl()) || AbstractC0307q.m534d0(str4)) {
                    i4 = i3;
                } else {
                    maskItemBean.setAvatarUrl(str4);
                }
                if (i4 == 0) {
                    return;
                }
                C0985g c0985g = (C0985g) c0709q1.f2397c;
                if (c0985g == null) {
                    AbstractC0223g.m420g("listAdapter");
                    throw null;
                }
                CopyOnWriteArrayList copyOnWriteArrayList2 = c0985g.f2596b;
                Iterator it2 = copyOnWriteArrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (AbstractC0223g.m414a(((MaskItemBean) next).getMaskId(), maskItemBean.getMaskId())) {
                            obj = next;
                        }
                    }
                }
                MaskItemBean maskItemBean2 = (MaskItemBean) obj;
                if (maskItemBean2 != null) {
                    maskItemBean2.setTagName(maskItemBean.getTagName());
                    maskItemBean2.setAvatarUrl(maskItemBean.getAvatarUrl());
                    boolean z4 = AbstractC1126i.f3786a;
                    C1124g.m2423N(copyOnWriteArrayList2);
                }
                ((Activity) c0709q1.f2396b).runOnUiThread(new RunnableC0371b(7, c0709q1));
                return;
            case 12:
                C0990l c0990l = (C0990l) obj3;
                if (c0990l.f3555h.get()) {
                    return;
                }
                Activity activity5 = c0990l.f3548a;
                if (activity5.isFinishing() || activity5.isDestroyed()) {
                    return;
                }
                ArrayList arrayList2 = c0990l.f3551d;
                arrayList2.clear();
                arrayList2.addAll((List) obj2);
                EditText editText = c0990l.f3558k;
                if (editText == null) {
                    AbstractC0223g.m420g("searchEditText");
                    throw null;
                }
                Editable text = editText.getText();
                String string3 = text != null ? text.toString() : null;
                c0990l.m2196c(string3 != null ? string3 : "");
                return;
            case 13:
                ViewGroup viewGroup = (ViewGroup) obj2;
                ((AbstractC1008c) obj3).getClass();
                AbstractC1008c.m2205h(viewGroup);
                AbstractC1008c abstractC1008cM2204b = AbstractC1008c.m2204b(viewGroup);
                if (abstractC1008cM2204b != null) {
                    abstractC1008cM2204b.bringToFront();
                    abstractC1008cM2204b.requestFocus();
                    return;
                }
                return;
            case 14:
                int i6 = MainActivity.f1628x;
                AbstractC1015a.m2216b((MainActivity) obj3, ((Uri) obj2).toString(), null);
                return;
            default:
                ((InterfaceC0204l) obj3).mo8c((C1119b) obj2);
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ RunnableC0040m(Object obj, Object obj2, int i2) {
        this.f255a = i2;
        this.f256b = obj;
        this.f257c = obj2;
    }
}

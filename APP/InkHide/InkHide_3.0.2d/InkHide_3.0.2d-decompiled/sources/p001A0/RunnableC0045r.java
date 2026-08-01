package p001A0;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.emoji2.text.C0397l;
import androidx.emoji2.text.C0401p;
import androidx.emoji2.text.C0402q;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import p004C.C0066j;
import p006D.AbstractC0079h;
import p007D0.C0094b;
import p007D0.RunnableC0093a;
import p009E0.AbstractC0105e;
import p009E0.C0103c;
import p009E0.C0104d;
import p009E0.C0109i;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0124l;
import p011F0.AbstractC0125m;
import p011F0.AbstractC0134v;
import p022L.AbstractC0174d;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p031P0.AbstractC0235a;
import p040U0.AbstractC0291a;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0514f;
import p069i.C0709q1;
import p070i0.AbstractC0731a;
import p079n0.C0773a;
import p084q0.C0808h;
import p086r0.C0831D1;
import p086r0.C0842H0;
import p086r0.C0846I1;
import p086r0.C0854L0;
import p086r0.C0858M1;
import p086r0.C0894d0;
import p086r0.C0917l;
import p086r0.C0927o0;
import p086r0.C0950w;
import p088s0.C0984f;
import p088s0.C0990l;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1134q;
import p102z0.C1124g;
import p102z0.C1131n;
import p102z0.C1133p;

/* JADX INFO: renamed from: A0.r */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0045r implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f274a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f275b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f276c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f277d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0045r(Activity activity, C0846I1 c0846i1, C0858M1 c0858m1) {
        this.f274a = 12;
        this.f275b = c0858m1;
        this.f277d = c0846i1;
        this.f276c = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    private final void m89a() {
        Object c0104d;
        View view = (View) this.f276c;
        View.OnLongClickListener onLongClickListener = (View.OnLongClickListener) this.f277d;
        List list = C0842H0.f2813g0;
        C0842H0 c0842h0 = (C0842H0) this.f275b;
        c0842h0.getClass();
        boolean z2 = AbstractC1126i.f3786a;
        if (C1124g.m2415F()) {
            try {
                if (C0842H0.m1598N0(view, onLongClickListener)) {
                    return;
                }
                String strM1605R = C0842H0.m1605R(onLongClickListener);
                if (strM1605R == null && (strM1605R = C0842H0.m1614X(view)) == null) {
                    return;
                }
                c0842h0.f2831H.put(onLongClickListener, strM1605R);
                c0842h0.m1687l1(strM1605R, strM1605R, null);
                c0104d = C0109i.f404a;
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Throwable thM246a = AbstractC0105e.m246a(c0104d);
            if (thM246a != null) {
                AbstractC0731a.m1387d("conversation quick add runtime long click resolve fail", thM246a);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    private final void m90b() {
        C0854L0 c0854l0 = (C0854L0) this.f275b;
        Set set = c0854l0.f2928f;
        ListView listView = (ListView) this.f276c;
        set.remove(listView);
        ListAdapter listAdapterM1727o = C0854L0.m1727o(listView);
        ListAdapter listAdapter = (ListAdapter) this.f277d;
        if (listAdapterM1727o != listAdapter) {
            return;
        }
        Set set2 = c0854l0.f2929g;
        if (set2.add(listAdapter)) {
            try {
                for (String str : AbstractC0120h.m252Z(new String[]{"clearCache", "i2", "j0", "i0"})) {
                    Method methodMo1011b = AbstractC0514f.f1622b.mo1011b(listAdapter.getClass(), str, new Object[0]);
                    if (methodMo1011b != null) {
                        try {
                            methodMo1011b.invoke(listAdapter, null);
                        } catch (Throwable unused) {
                        }
                    }
                }
                try {
                    if (listAdapter instanceof BaseAdapter) {
                        ((BaseAdapter) listAdapter).notifyDataSetChanged();
                    } else {
                        AbstractC0514f.f1622b.mo1012c(listAdapter, "notifyDataSetChanged", new Object[0]);
                    }
                } catch (Throwable unused2) {
                }
            } finally {
                set2.remove(listAdapter);
            }
        }
        try {
            listView.invalidateViews();
        } catch (Throwable unused3) {
        }
        try {
            listView.requestLayout();
        } catch (Throwable unused4) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    private final void m91c() {
        C0831D1 c0831d1 = (C0831D1) this.f275b;
        Object obj = this.f277d;
        try {
            c0831d1.f2767i = true;
            AbstractC0514f.f1622b.mo1012c(obj, "notifyDataSetChanged", new Object[0]);
        } catch (Throwable unused) {
        }
        c0831d1.f2767i = false;
        View view = (View) this.f276c;
        view.requestLayout();
        view.invalidate();
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: d */
    private final void m92d() {
        Object c0104d;
        Bitmap bitmapDecodeFile;
        Bitmap bitmap;
        C0709q1 c0709q1 = (C0709q1) this.f275b;
        c0709q1.getClass();
        String str = (String) this.f276c;
        if (AbstractC0307q.m538h0(str, false, "/")) {
            bitmapDecodeFile = BitmapFactory.decodeFile(str);
        } else if (AbstractC0307q.m538h0(str, true, "file://")) {
            bitmapDecodeFile = BitmapFactory.decodeFile(new File(AbstractC0299i.m522t0(str, "file://")).getAbsolutePath());
        } else {
            if (!AbstractC0307q.m538h0(str, true, "http://") && !AbstractC0307q.m538h0(str, true, "https://")) {
                bitmap = null;
                if (bitmap == null && !((AtomicBoolean) c0709q1.f2401g).get()) {
                    ((C0984f) c0709q1.f2400f).put(str, bitmap);
                    ((Activity) c0709q1.f2396b).runOnUiThread(new RunnableC0093a((Object) c0709q1, (C0773a) this.f277d, str, bitmap, 3));
                }
                return;
            }
            try {
                URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                AbstractC0223g.m416c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setConnectTimeout(3000);
                httpURLConnection.setReadTimeout(3000);
                httpURLConnection.setInstanceFollowRedirects(true);
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    c0104d = BitmapFactory.decodeStream(inputStream);
                    AbstractC0079h.m182f(inputStream, null);
                    httpURLConnection.disconnect();
                } finally {
                }
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            bitmapDecodeFile = (Bitmap) (c0104d instanceof C0104d ? null : c0104d);
        }
        bitmap = bitmapDecodeFile;
        if (bitmap == null) {
            return;
        }
        ((C0984f) c0709q1.f2400f).put(str, bitmap);
        ((Activity) c0709q1.f2396b).runOnUiThread(new RunnableC0093a((Object) c0709q1, (C0773a) this.f277d, str, bitmap, 3));
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: e */
    private final void m93e() {
        Object c0104d;
        Bitmap bitmapDecodeFile;
        Bitmap bitmap;
        C0990l c0990l = (C0990l) this.f275b;
        c0990l.getClass();
        String str = (String) this.f276c;
        if (AbstractC0307q.m538h0(str, false, "/")) {
            bitmapDecodeFile = BitmapFactory.decodeFile(str);
        } else if (AbstractC0307q.m538h0(str, true, "file://")) {
            bitmapDecodeFile = BitmapFactory.decodeFile(AbstractC0299i.m522t0(str, "file://"));
        } else {
            if (!AbstractC0307q.m538h0(str, true, "http://") && !AbstractC0307q.m538h0(str, true, "https://")) {
                bitmap = null;
                if (bitmap == null && !c0990l.f3555h.get()) {
                    c0990l.f3554g.put(str, bitmap);
                    c0990l.f3548a.runOnUiThread(new RunnableC0093a((Object) c0990l, (C0773a) this.f277d, str, bitmap, 4));
                }
                return;
            }
            try {
                URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                AbstractC0223g.m416c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setConnectTimeout(3000);
                httpURLConnection.setReadTimeout(3000);
                httpURLConnection.setInstanceFollowRedirects(true);
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    c0104d = BitmapFactory.decodeStream(inputStream);
                    AbstractC0079h.m182f(inputStream, null);
                    httpURLConnection.disconnect();
                } finally {
                }
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            bitmapDecodeFile = (Bitmap) (c0104d instanceof C0104d ? null : c0104d);
        }
        bitmap = bitmapDecodeFile;
        if (bitmap == null) {
            return;
        }
        c0990l.f3554g.put(str, bitmap);
        c0990l.f3548a.runOnUiThread(new RunnableC0093a((Object) c0990l, (C0773a) this.f277d, str, bitmap, 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    private final void m94f() {
        Integer num = (Integer) this.f275b;
        Window window = (Window) this.f276c;
        if (num != null) {
            window.getDecorView().setSystemUiVisibility(num.intValue());
        }
        Integer num2 = (Integer) this.f277d;
        if (num2 != null) {
            window.setStatusBarColor(num2.intValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't wrap try/catch for region: R(14:67|(1:(2:69|(2:630|80)(1:625))(2:624|81))|(5:83|(1:(3:85|(2:94|633)(2:89|(1:635)(1:632))|95)(2:631|96))|(0)|(0)|(2:328|331)(0))(1:99)|567|100|(1:102)(1:105)|(1:107)(1:109)|111|(1:113)|114|(1:116)|117|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0262, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0272, code lost:
    
        r0 = new p009E0.C0104d(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0488 A[Catch: all -> 0x0462, TryCatch #3 {all -> 0x0462, blocks: (B:201:0x0451, B:203:0x045f, B:208:0x0467, B:215:0x047a, B:217:0x0488, B:220:0x048e), top: B:569:0x0451 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x048e A[Catch: all -> 0x0462, TRY_LEAVE, TryCatch #3 {all -> 0x0462, blocks: (B:201:0x0451, B:203:0x045f, B:208:0x0467, B:215:0x047a, B:217:0x0488, B:220:0x048e), top: B:569:0x0451 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x08d6 A[PHI: r0
  0x08d6: PHI (r0v35 java.lang.Object) = (r0v28 java.lang.Object), (r0v31 java.lang.Object) binds: [B:448:0x08ba, B:454:0x08d2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        boolean z2;
        boolean z3;
        int i2;
        Activity activity;
        ListView listView;
        Object obj;
        Object c0104d;
        long j2;
        String strConcat;
        String str;
        String str2;
        Method method;
        Object c0104d2;
        Method method2;
        Method method3;
        Long lValueOf;
        int i3;
        long j3;
        Context context;
        Method method4;
        Object c0104d3;
        Long l2;
        Method method5;
        Object c0104d4;
        Throwable thM246a;
        Number number;
        Method method6;
        C0104d c0104d5;
        C0104d c0104d6;
        Method method7;
        Method method8;
        Method method9;
        Object c0104d7;
        switch (this.f274a) {
            case 0:
                ((AlertDialog) this.f275b).dismiss();
                ArrayList<C0103c> arrayList = (ArrayList) this.f277d;
                if (arrayList.isEmpty()) {
                    z2 = true;
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!((C0047t) ((C0103c) it.next()).f395b).f279a) {
                            z2 = false;
                        }
                    }
                    z2 = true;
                }
                if (arrayList.isEmpty()) {
                    z3 = false;
                } else {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C0047t c0047t = (C0047t) ((C0103c) it2.next()).f395b;
                        if (!c0047t.f279a && c0047t.f281c) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                Activity activity2 = (Activity) this.f276c;
                if (z2) {
                    AbstractC0223g.m417d(activity2.getApplicationContext(), "getApplicationContext(...)");
                    AbstractC0039l.m81s("unified_dexkit_scan_status_v16", true);
                } else {
                    AbstractC0223g.m417d(activity2.getApplicationContext(), "getApplicationContext(...)");
                    AbstractC0039l.m81s("unified_dexkit_scan_status_v16", !z3);
                }
                AlertDialog.Builder title = new AlertDialog.Builder(activity2).setTitle(z2 ? "适配完成" : "适配完成，部分未成功");
                if (arrayList.isEmpty()) {
                    i2 = 0;
                } else {
                    Iterator it3 = arrayList.iterator();
                    i2 = 0;
                    while (it3.hasNext()) {
                        if (((C0047t) ((C0103c) it3.next()).f395b).f279a && (i2 = i2 + 1) < 0) {
                            AbstractC0124l.m287a0();
                            throw null;
                        }
                    }
                }
                int size = arrayList.size() - i2;
                LinearLayout linearLayout = new LinearLayout(activity2);
                linearLayout.setOrientation(1);
                CopyOnWriteArrayList copyOnWriteArrayList = C0052y.f291a;
                int i4 = 16;
                linearLayout.setPadding(C0052y.m97b(activity2, 24), C0052y.m97b(activity2, 16), C0052y.m97b(activity2, 24), C0052y.m97b(activity2, 4));
                TextView textView = new TextView(activity2);
                textView.setText(size == 0 ? "全部适配成功，共 " + i2 + " 项" : i2 + " 项成功，" + size + " 项未成功");
                textView.setTextSize(16.0f);
                textView.setTypeface(Typeface.DEFAULT_BOLD);
                textView.setTextColor(Color.rgb(28, 28, 28));
                linearLayout.addView(textView);
                TextView textView2 = new TextView(activity2);
                textView2.setText("重启微信后生效。");
                textView2.setTextSize(13.0f);
                textView2.setTextColor(Color.rgb(120, 120, 120));
                textView2.setPadding(0, C0052y.m97b(activity2, 6), 0, C0052y.m97b(activity2, 12));
                linearLayout.addView(textView2);
                for (C0103c c0103c : arrayList) {
                    C0048u c0048u = (C0048u) c0103c.f394a;
                    C0047t c0047t2 = (C0047t) c0103c.f395b;
                    String str3 = c0048u.f283b;
                    boolean z4 = c0047t2.f279a;
                    int iRgb = z4 ? Color.rgb(36, 117, 84) : Color.rgb(190, 54, 54);
                    int iRgb2 = z4 ? Color.rgb(238, 248, 243) : Color.rgb(252, 238, 238);
                    LinearLayout linearLayout2 = new LinearLayout(activity2);
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(i4);
                    linearLayout2.setPadding(C0052y.m97b(activity2, 12), C0052y.m97b(activity2, 10), C0052y.m97b(activity2, 12), C0052y.m97b(activity2, 10));
                    linearLayout2.setBackground(C0052y.m99d(iRgb2, C0052y.m97b(activity2, 12)));
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.bottomMargin = C0052y.m97b(activity2, 8);
                    linearLayout2.setLayoutParams(layoutParams);
                    TextView textView3 = new TextView(activity2);
                    textView3.setText(z4 ? "✓" : "!");
                    textView3.setGravity(17);
                    textView3.setTextSize(14.0f);
                    Typeface typeface = Typeface.DEFAULT_BOLD;
                    textView3.setTypeface(typeface);
                    textView3.setTextColor(-1);
                    textView3.setBackground(C0052y.m99d(iRgb, C0052y.m97b(activity2, 10)));
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C0052y.m97b(activity2, 22), C0052y.m97b(activity2, 22));
                    layoutParams2.rightMargin = C0052y.m97b(activity2, 10);
                    textView3.setLayoutParams(layoutParams2);
                    linearLayout2.addView(textView3);
                    TextView textView4 = new TextView(activity2);
                    textView4.setText(AbstractC0174d.m352h(z4 ? "成功：" : "未成功：", str3));
                    textView4.setTextSize(14.0f);
                    textView4.setTypeface(typeface);
                    textView4.setTextColor(Color.rgb(40, 40, 40));
                    linearLayout2.addView(textView4);
                    linearLayout.addView(linearLayout2);
                    i4 = 16;
                }
                title.setView(linearLayout).setCancelable(false).setPositiveButton("重启微信", new DialogInterfaceOnClickListenerC0046s(0)).setNegativeButton("稍后重启", new DialogInterfaceOnClickListenerC0046s(1)).show();
                return;
            case 1:
                C0094b c0094b = new C0094b((String) this.f275b, "GET", (Map) this.f276c, null, 56);
                C0066j c0066j = new C0066j(2);
                c0066j.f312c = c0094b;
                ((InterfaceC0204l) this.f277d).mo8c(c0066j.m151w());
                return;
            case 2:
                LinkedHashMap linkedHashMapM296a0 = AbstractC0134v.m296a0(new C0103c("Content-Type", "application/json; charset=utf-8"));
                byte[] bytes = ((String) this.f276c).getBytes(AbstractC0291a.f663a);
                AbstractC0223g.m417d(bytes, "getBytes(...)");
                C0094b c0094b2 = new C0094b((String) this.f275b, "POST", linkedHashMapM296a0, bytes, 48);
                C0066j c0066j2 = new C0066j(2);
                c0066j2.f312c = c0094b2;
                ((InterfaceC0204l) this.f277d).mo8c(c0066j2.m151w());
                return;
            case 3:
                C0066j c0066j3 = (C0066j) this.f275b;
                AbstractC0079h abstractC0079h = (AbstractC0079h) this.f276c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f277d;
                c0066j3.getClass();
                try {
                    C0402q c0402qM186j = AbstractC0079h.m186j((Context) c0066j3.f312c);
                    if (c0402qM186j == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C0401p c0401p = (C0401p) c0402qM186j.f1204a;
                    synchronized (c0401p.f1198e) {
                        c0401p.f1200g = threadPoolExecutor;
                        break;
                    }
                    c0402qM186j.f1204a.mo145q(new C0397l(abstractC0079h, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    abstractC0079h.mo200F(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 4:
                EditText editText = (EditText) this.f275b;
                Editable text = editText.getText();
                if (text == null) {
                    return;
                }
                String string = text.toString();
                if (string == null) {
                    string = "";
                }
                if (AbstractC0307q.m538h0(AbstractC0299i.m507C0(string).toString(), false, "#")) {
                    ((C0950w) this.f276c).m2123h(editText, text, this.f277d);
                    return;
                }
                return;
            case 5:
                C0894d0 c0894d0 = (C0894d0) this.f275b;
                View view = (View) this.f276c;
                try {
                    Object objM1912y = c0894d0.m1912y(this.f277d);
                    if (objM1912y == null) {
                        try {
                            objM1912y = AbstractC0514f.f1622b.mo1012c(view, "getAdapter", new Object[0]);
                        } catch (Throwable th2) {
                            objM1912y = new C0104d(th2);
                        }
                        Object obj2 = objM1912y instanceof C0104d ? null : objM1912y;
                        AbstractC0514f.f1622b.mo1012c(obj2, "notifyDataSetChanged", new Object[0]);
                        break;
                    }
                } catch (Throwable unused) {
                }
                view.requestLayout();
                view.invalidate();
                c0894d0.m1892Z0(view);
                return;
            case 6:
                C0894d0.m1844f((C0894d0) this.f275b, (View) this.f276c, (View.OnLongClickListener) this.f277d);
                return;
            case 7:
                C0842H0 c0842h0 = (C0842H0) this.f275b;
                c0842h0.f2873r = false;
                if (c0842h0.m1686l0() || !c0842h0.m1660A1((Activity) this.f276c)) {
                    return;
                }
                AbstractC0731a.m1384a("launcher deferred conversation scan", (String) this.f277d);
                WeakReference weakReference = c0842h0.f2860f;
                if (weakReference == null || (activity = (Activity) weakReference.get()) == null) {
                    if (C0842H0.m1617Y0()) {
                        AbstractC0731a.m1387d("8076 scan launcher miss", "launcherRef=null");
                        return;
                    }
                    return;
                }
                if (!c0842h0.m1660A1(activity)) {
                    if (C0842H0.m1617Y0()) {
                        AbstractC0731a.m1387d("8076 scan launcher skip", activity.getClass().getName());
                    }
                    if (C0842H0.m1608T0()) {
                        AbstractC0731a.m1387d("play8072 scan launcher skip", activity.getClass().getName());
                        return;
                    }
                    return;
                }
                if (c0842h0.m1686l0()) {
                    if (C0842H0.m1617Y0()) {
                        AbstractC0731a.m1387d("8076 scan launcher cache-active");
                        return;
                    }
                    return;
                }
                Window window = activity.getWindow();
                boolean zM1691n0 = c0842h0.m1691n0(window != null ? window.getDecorView() : null);
                if (C0842H0.m1608T0() && !zM1691n0) {
                    Window window2 = activity.getWindow();
                    AbstractC0731a.m1387d("play8072 scan launcher tree", AbstractC0174d.m355k("hit=", !C0842H0.m1608T0() ? false : c0842h0.m1707v1(window2 != null ? window2.getDecorView() : null, 0, 0)));
                }
                if (C0842H0.m1617Y0()) {
                    AbstractC0731a.m1387d("8076 scan launcher tree", AbstractC0174d.m355k("hit=", zM1691n0));
                }
                WeakReference weakReference2 = c0842h0.f2850a;
                if ((weakReference2 != null ? (ListView) weakReference2.get() : null) == null) {
                    Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                    AbstractC0223g.m415b(setNewSetFromMap);
                    C0103c c0103cM1668H = c0842h0.m1668H(activity, 0, setNewSetFromMap);
                    C0917l c0917lM1359d = (c0103cM1668H == null || (listView = (ListView) c0103cM1668H.f394a) == null || (obj = c0103cM1668H.f395b) == null) ? null : c0842h0.f2838O.m1359d(listView, obj);
                    if (c0917lM1359d == null) {
                        AbstractC0731a.m1387d("legacy conversation object scan miss", activity.getClass().getName());
                        return;
                    } else {
                        c0842h0.m1700r(c0917lM1359d);
                        c0842h0.m1696p0(c0917lM1359d.f3249d);
                        return;
                    }
                }
                return;
            case 8:
                View view2 = (View) this.f277d;
                ((C0842H0) this.f275b).f2876u = false;
                try {
                    ((C0927o0) this.f276c).mo7b();
                    view2.requestLayout();
                    view2.invalidate();
                    Object parent = view2.getParent();
                    View view3 = parent instanceof View ? (View) parent : null;
                    if (view3 != null) {
                        view3.requestLayout();
                    }
                    Object parent2 = view2.getParent();
                    View view4 = parent2 instanceof View ? (View) parent2 : null;
                    if (view4 != null) {
                        view4.invalidate();
                        c0104d = C0109i.f404a;
                    } else {
                        c0104d = null;
                    }
                    break;
                } catch (Throwable th3) {
                    c0104d = new C0104d(th3);
                }
                Throwable thM246a2 = AbstractC0105e.m246a(c0104d);
                if (thM246a2 != null) {
                    AbstractC0731a.m1387d("refresh recycler conversation fail", "play-8072-recycler", thM246a2);
                    return;
                }
                return;
            case 9:
                m89a();
                return;
            case 10:
                m90b();
                return;
            case 11:
                m91c();
                return;
            case 12:
                C0858M1 c0858m1 = (C0858M1) this.f275b;
                c0858m1.getClass();
                if (C0858M1.m1757c()) {
                    ((C0846I1) this.f277d).f2897b = true;
                    c0858m1.m1765i((Activity) this.f276c);
                    return;
                }
                return;
            case 13:
                m92d();
                return;
            case 14:
                m93e();
                return;
            case 15:
                m94f();
                return;
            default:
                Context context2 = (Context) this.f275b;
                C1133p c1133p = (C1133p) this.f276c;
                String str4 = (String) this.f277d;
                Handler handler = AbstractC1134q.f3825a;
                String str5 = c1133p.f3819a + ":" + c1133p.f3820b + ":" + str4;
                ConcurrentHashMap concurrentHashMap = AbstractC1134q.f3827c;
                if (concurrentHashMap.putIfAbsent(str5, Long.valueOf(System.currentTimeMillis())) == null) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - 604800000;
                    Set setEntrySet = concurrentHashMap.entrySet();
                    AbstractC0223g.m417d(setEntrySet, "<get-entries>(...)");
                    Iterator it4 = setEntrySet.iterator();
                    while (it4.hasNext()) {
                        Map.Entry entry = (Map.Entry) it4.next();
                        AbstractC0223g.m418e(entry, "it");
                        if (((Number) entry.getValue()).longValue() < jCurrentTimeMillis) {
                            it4.remove();
                        }
                    }
                    long j4 = c1133p.f3822d;
                    Long lValueOf2 = Long.valueOf(j4);
                    if (j4 <= 0) {
                        lValueOf2 = null;
                    }
                    long jLongValue = lValueOf2 != null ? lValueOf2.longValue() + 1 : System.currentTimeMillis();
                    String str6 = c1133p.f3821c;
                    String strM524v0 = AbstractC0299i.m524v0(str4, ' ');
                    if (AbstractC0307q.m534d0(strM524v0)) {
                        strM524v0 = str4;
                    }
                    if (AbstractC0307q.m534d0(str6)) {
                        strConcat = "对方已读，时间 ".concat(strM524v0);
                        j2 = 0;
                    } else {
                        j2 = 0;
                        strConcat = "\"" + str6 + "\" 已读，时间 " + strM524v0;
                    }
                    String str7 = strConcat;
                    ContentValues contentValuesM2462c = AbstractC1134q.m2462c(c1133p.f3819a, jLongValue, str7);
                    C1131n c1131nM2465f = AbstractC1134q.m2465f();
                    int i5 = 4;
                    Class cls = Boolean.TYPE;
                    if (c1131nM2465f != null) {
                        Object objM2463d = AbstractC1134q.f3828d;
                        if (objM2463d == null) {
                            objM2463d = AbstractC1134q.m2463d(context2, c1131nM2465f);
                            if (objM2463d != null) {
                                AbstractC1134q.f3828d = objM2463d;
                            } else {
                                objM2463d = null;
                            }
                            if (objM2463d == null) {
                                str = str5;
                            }
                            str2 = str4;
                            lValueOf = null;
                            if (lValueOf == null) {
                                String str8 = c1133p.f3819a;
                                C1131n c1131nM2465f2 = AbstractC1134q.m2465f();
                                if (c1131nM2465f2 != null) {
                                    Object objM2463d2 = AbstractC1134q.f3828d;
                                    if (objM2463d2 == null) {
                                        objM2463d2 = AbstractC1134q.m2463d(context2, c1131nM2465f2);
                                        if (objM2463d2 != null) {
                                            AbstractC1134q.f3828d = objM2463d2;
                                        } else {
                                            objM2463d2 = null;
                                        }
                                        if (objM2463d2 == null) {
                                            context = context2;
                                            j3 = jLongValue;
                                            l2 = null;
                                            i3 = 3;
                                        }
                                        if (l2 == null) {
                                            String str9 = c1133p.f3819a;
                                            ClassLoader classLoader = context.getClassLoader();
                                            AbstractC0223g.m417d(classLoader, "getClassLoader(...)");
                                            Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader, "com.tencent.wcdb.database.SQLiteDatabase");
                                            if (clsMo1021l == null) {
                                                c0104d6 = null;
                                            } else {
                                                try {
                                                    Field[] declaredFields = clsMo1021l.getDeclaredFields();
                                                    AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                                                    if (declaredFields.length != 0) {
                                                        Field field = declaredFields[0];
                                                        break;
                                                    }
                                                    c0104d5 = null;
                                                } catch (Throwable th4) {
                                                    c0104d5 = new C0104d(th4);
                                                }
                                                if (c0104d5 != null) {
                                                    c0104d5 = null;
                                                }
                                                c0104d6 = c0104d5;
                                            }
                                            if (c0104d6 == null) {
                                                lValueOf = null;
                                            } else {
                                                ContentValues contentValuesM2462c2 = AbstractC1134q.m2462c(str9, j3, str7);
                                                Method[] methods = C0104d.class.getMethods();
                                                AbstractC0223g.m417d(methods, "getMethods(...)");
                                                int length = methods.length;
                                                int i6 = 0;
                                                while (true) {
                                                    if (i6 < length) {
                                                        method7 = methods[i6];
                                                        if (!AbstractC0223g.m414a(method7.getName(), "insertOrThrow") || method7.getParameterTypes().length != i3 || !AbstractC0223g.m414a(method7.getParameterTypes()[0], String.class) || !ContentValues.class.isAssignableFrom(method7.getParameterTypes()[2])) {
                                                            i6++;
                                                            i3 = 3;
                                                        }
                                                    } else {
                                                        method7 = null;
                                                    }
                                                }
                                                if (method7 != null) {
                                                    try {
                                                        Object objInvoke = method7.invoke(c0104d6, "message", null, contentValuesM2462c2);
                                                        Number number2 = objInvoke instanceof Number ? (Number) objInvoke : null;
                                                        c0104d7 = number2 != null ? Long.valueOf(number2.longValue()) : null;
                                                    } catch (Throwable th5) {
                                                        c0104d7 = new C0104d(th5);
                                                    }
                                                    Throwable thM246a3 = AbstractC0105e.m246a(c0104d7);
                                                    if (thM246a3 != null) {
                                                        AbstractC0731a.m1387d("read trace db insertOrThrow fail", contentValuesM2462c2, thM246a3);
                                                    }
                                                    lValueOf = (Long) (c0104d7 instanceof C0104d ? null : c0104d7);
                                                    break;
                                                } else {
                                                    Method[] methods2 = C0104d.class.getMethods();
                                                    AbstractC0223g.m417d(methods2, "getMethods(...)");
                                                    int length2 = methods2.length;
                                                    int i7 = 0;
                                                    while (true) {
                                                        if (i7 < length2) {
                                                            method8 = methods2[i7];
                                                            if (AbstractC0223g.m414a(method8.getName(), "insert") && method8.getParameterTypes().length == 3 && AbstractC0223g.m414a(method8.getParameterTypes()[0], String.class) && ContentValues.class.isAssignableFrom(method8.getParameterTypes()[2])) {
                                                            }
                                                            i7++;
                                                        } else {
                                                            method8 = null;
                                                        }
                                                    }
                                                    if (method8 != null) {
                                                        Object objInvoke2 = method8.invoke(c0104d6, "message", null, contentValuesM2462c2);
                                                        Number number3 = objInvoke2 instanceof Number ? (Number) objInvoke2 : null;
                                                        if (number3 != null) {
                                                            lValueOf = Long.valueOf(number3.longValue());
                                                        }
                                                    } else {
                                                        Method[] methods3 = C0104d.class.getMethods();
                                                        AbstractC0223g.m417d(methods3, "getMethods(...)");
                                                        int length3 = methods3.length;
                                                        int i8 = 0;
                                                        while (true) {
                                                            if (i8 < length3) {
                                                                method9 = methods3[i8];
                                                                if (!AbstractC0223g.m414a(method9.getName(), "insertWithOnConflict") || method9.getParameterTypes().length != i5 || !ContentValues.class.isAssignableFrom(method9.getParameterTypes()[2])) {
                                                                    i8++;
                                                                    i5 = 4;
                                                                }
                                                            } else {
                                                                method9 = null;
                                                            }
                                                        }
                                                        Object objInvoke3 = method9 != null ? method9.invoke(c0104d6, "message", null, contentValuesM2462c2, 0) : null;
                                                        Number number4 = objInvoke3 instanceof Number ? (Number) objInvoke3 : null;
                                                        if (number4 != null) {
                                                            lValueOf = Long.valueOf(number4.longValue());
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            lValueOf = l2;
                                        }
                                    }
                                    String str10 = c1131nM2465f2.f3810a;
                                    ClassLoader classLoader2 = context2.getClassLoader();
                                    AbstractC0223g.m417d(classLoader2, "getClassLoader(...)");
                                    i3 = 3;
                                    Class<?> clsMo1021l2 = AbstractC0514f.f1622b.mo1021l(classLoader2, str10);
                                    if (clsMo1021l2 == null) {
                                        context = context2;
                                        j3 = jLongValue;
                                    } else {
                                        Object objNewInstance = clsMo1021l2.getDeclaredConstructor(null).newInstance(null);
                                        AbstractC0223g.m415b(objNewInstance);
                                        AbstractC1134q.m2460a(objNewInstance, str8, "u1");
                                        j3 = jLongValue;
                                        AbstractC1134q.m2460a(objNewInstance, Long.valueOf(j3 + ((long) AbstractC0235a.f570a.mo448c())), "o1");
                                        AbstractC1134q.m2460a(objNewInstance, 10000, "setType");
                                        AbstractC1134q.m2460a(objNewInstance, 3, "r1");
                                        AbstractC1134q.m2460a(objNewInstance, 4, "j1");
                                        AbstractC1134q.m2460a(objNewInstance, Long.valueOf(j3), "e1");
                                        AbstractC1134q.m2460a(objNewInstance, str7, "d1");
                                        Method[] methods4 = objM2463d2.getClass().getMethods();
                                        AbstractC0223g.m417d(methods4, "getMethods(...)");
                                        int length4 = methods4.length;
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 < length4) {
                                                method4 = methods4[i9];
                                                Method[] methodArr = methods4;
                                                context = context2;
                                                if (AbstractC0223g.m414a(method4.getName(), "na")) {
                                                    if (method4.getParameterTypes().length == 1) {
                                                        if (method4.getParameterTypes()[0].isAssignableFrom(clsMo1021l2) && Number.class.isAssignableFrom(AbstractC1134q.m2470k(method4))) {
                                                        }
                                                    }
                                                }
                                                i9++;
                                                methods4 = methodArr;
                                                context2 = context;
                                            } else {
                                                context = context2;
                                                method4 = null;
                                            }
                                        }
                                        if (method4 != null) {
                                            try {
                                                Object objInvoke4 = method4.invoke(objM2463d2, objNewInstance);
                                                Number number5 = objInvoke4 instanceof Number ? (Number) objInvoke4 : null;
                                                c0104d3 = number5 != null ? Long.valueOf(number5.longValue()) : null;
                                            } catch (Throwable th6) {
                                                c0104d3 = new C0104d(th6);
                                            }
                                            Throwable thM246a4 = AbstractC0105e.m246a(c0104d3);
                                            if (thM246a4 != null) {
                                                AbstractC0731a.m1387d("read trace native na insert fail", thM246a4);
                                            }
                                            if (c0104d3 instanceof C0104d) {
                                                c0104d3 = null;
                                            }
                                            l2 = (Long) c0104d3;
                                        } else {
                                            Method[] methods5 = objM2463d2.getClass().getMethods();
                                            AbstractC0223g.m417d(methods5, "getMethods(...)");
                                            int length5 = methods5.length;
                                            int i10 = 0;
                                            while (true) {
                                                if (i10 < length5) {
                                                    method5 = methods5[i10];
                                                    Method[] methodArr2 = methods5;
                                                    if (!AbstractC0223g.m414a(method5.getName(), c1131nM2465f2.f3814e) || method5.getParameterTypes().length != 2 || !method5.getParameterTypes()[0].isAssignableFrom(clsMo1021l2) || !AbstractC0223g.m414a(method5.getParameterTypes()[1], cls) || !Number.class.isAssignableFrom(AbstractC1134q.m2470k(method5))) {
                                                        i10++;
                                                        methods5 = methodArr2;
                                                    }
                                                } else {
                                                    method5 = null;
                                                }
                                            }
                                            if (method5 == null) {
                                                Method[] methods6 = objM2463d2.getClass().getMethods();
                                                AbstractC0223g.m417d(methods6, "getMethods(...)");
                                                int length6 = methods6.length;
                                                int i11 = 0;
                                                while (true) {
                                                    if (i11 < length6) {
                                                        method6 = methods6[i11];
                                                        if (method6.getParameterTypes().length == 2 && method6.getParameterTypes()[0].isAssignableFrom(clsMo1021l2)) {
                                                            if (!AbstractC0223g.m414a(method6.getParameterTypes()[1], cls) || !Number.class.isAssignableFrom(AbstractC1134q.m2470k(method6))) {
                                                            }
                                                        }
                                                        i11++;
                                                    } else {
                                                        method6 = null;
                                                    }
                                                }
                                                if (method6 != null) {
                                                    method5 = method6;
                                                }
                                            }
                                            try {
                                                Object objInvoke5 = method5.invoke(objM2463d2, objNewInstance, Boolean.FALSE);
                                                number = objInvoke5 instanceof Number ? (Number) objInvoke5 : null;
                                            } catch (Throwable th7) {
                                                c0104d4 = new C0104d(th7);
                                            }
                                            if (number != null) {
                                                long jLongValue2 = number.longValue();
                                                Long lValueOf3 = Long.valueOf(jLongValue2);
                                                if (jLongValue2 < j2) {
                                                    lValueOf3 = null;
                                                }
                                                if (lValueOf3 == null) {
                                                    Object objInvoke6 = method5.invoke(objM2463d2, objNewInstance, Boolean.TRUE);
                                                    Number number6 = !(objInvoke6 instanceof Number) ? (Number) objInvoke6 : null;
                                                    c0104d4 = number6 == null ? Long.valueOf(number6.longValue()) : null;
                                                    thM246a = AbstractC0105e.m246a(c0104d4);
                                                    if (thM246a != null) {
                                                        AbstractC0731a.m1387d("read trace native insert fail", method5.getName(), thM246a);
                                                    }
                                                    if (c0104d4 instanceof C0104d) {
                                                        c0104d4 = null;
                                                    }
                                                    l2 = (Long) c0104d4;
                                                } else {
                                                    c0104d4 = lValueOf3;
                                                    thM246a = AbstractC0105e.m246a(c0104d4);
                                                    if (thM246a != null) {
                                                    }
                                                    if (c0104d4 instanceof C0104d) {
                                                    }
                                                    l2 = (Long) c0104d4;
                                                }
                                            } else {
                                                Object objInvoke62 = method5.invoke(objM2463d2, objNewInstance, Boolean.TRUE);
                                                if (!(objInvoke62 instanceof Number)) {
                                                }
                                                if (number6 == null) {
                                                }
                                                thM246a = AbstractC0105e.m246a(c0104d4);
                                                if (thM246a != null) {
                                                }
                                                if (c0104d4 instanceof C0104d) {
                                                }
                                                l2 = (Long) c0104d4;
                                            }
                                        }
                                        if (l2 == null) {
                                        }
                                    }
                                    l2 = null;
                                    if (l2 == null) {
                                    }
                                    break;
                                }
                            }
                            if (lValueOf != null || lValueOf.longValue() < j2) {
                                str4 = str2;
                                AbstractC1134q.f3827c.remove(str);
                                AbstractC0731a.m1387d("read trace local tip insert failed", c1133p.f3819a, c1133p.f3820b);
                            } else {
                                ((C0808h) AbstractC0503h.m988u(C0808h.class)).f2690g.m2135a(c1133p.f3819a);
                                str4 = str2;
                                AbstractC0731a.m1384a("read trace local tip inserted", c1133p.f3819a, c1133p.f3820b, str4);
                            }
                        }
                        Object obj3 = objM2463d;
                        String str11 = c1131nM2465f.f3810a;
                        ClassLoader classLoader3 = context2.getClassLoader();
                        AbstractC0223g.m417d(classLoader3, "getClassLoader(...)");
                        str = str5;
                        Class<?> clsMo1021l3 = AbstractC0514f.f1622b.mo1021l(classLoader3, str11);
                        if (clsMo1021l3 == null) {
                            str2 = str4;
                        } else {
                            Object objNewInstance2 = clsMo1021l3.getDeclaredConstructor(null).newInstance(null);
                            Method[] methods7 = clsMo1021l3.getMethods();
                            AbstractC0223g.m417d(methods7, "getMethods(...)");
                            str2 = str4;
                            int length7 = methods7.length;
                            int i12 = 0;
                            while (true) {
                                if (i12 < length7) {
                                    Method method10 = methods7[i12];
                                    int i13 = i12;
                                    int i14 = length7;
                                    if (AbstractC0223g.m414a(method10.getName(), "convertFrom") && method10.getParameterTypes().length == 2 && ContentValues.class.isAssignableFrom(method10.getParameterTypes()[0]) && AbstractC0223g.m414a(method10.getParameterTypes()[1], cls)) {
                                        method = method10;
                                    } else {
                                        i12 = i13 + 1;
                                        length7 = i14;
                                    }
                                } else {
                                    method = null;
                                }
                            }
                            if (method != null) {
                                try {
                                    method.setAccessible(true);
                                    c0104d2 = method.invoke(objNewInstance2, contentValuesM2462c, Boolean.TRUE);
                                } catch (Throwable th8) {
                                    c0104d2 = new C0104d(th8);
                                }
                                Throwable thM246a5 = AbstractC0105e.m246a(c0104d2);
                                if (thM246a5 != null) {
                                    AbstractC0731a.m1387d("read trace convertFrom invoke fail", thM246a5);
                                } else {
                                    Method[] methods8 = obj3.getClass().getMethods();
                                    AbstractC0223g.m417d(methods8, "getMethods(...)");
                                    int length8 = methods8.length;
                                    int i15 = 0;
                                    while (true) {
                                        if (i15 < length8) {
                                            method2 = methods8[i15];
                                            Method[] methodArr3 = methods8;
                                            int i16 = length8;
                                            if (!AbstractC0223g.m414a(method2.getName(), c1131nM2465f.f3814e) || method2.getParameterTypes().length != 2 || !method2.getParameterTypes()[0].isAssignableFrom(clsMo1021l3) || !AbstractC0223g.m414a(method2.getParameterTypes()[1], cls) || !Number.class.isAssignableFrom(AbstractC1134q.m2470k(method2))) {
                                                i15++;
                                                methods8 = methodArr3;
                                                length8 = i16;
                                            }
                                        } else {
                                            method2 = null;
                                        }
                                    }
                                    if (method2 == null) {
                                        Method[] methods9 = obj3.getClass().getMethods();
                                        AbstractC0223g.m417d(methods9, "getMethods(...)");
                                        int length9 = methods9.length;
                                        int i17 = 0;
                                        while (true) {
                                            if (i17 < length9) {
                                                method3 = methods9[i17];
                                                Method[] methodArr4 = methods9;
                                                int i18 = length9;
                                                if (method3.getParameterTypes().length == 2 && method3.getParameterTypes()[0].isAssignableFrom(clsMo1021l3)) {
                                                    if (!AbstractC0223g.m414a(method3.getParameterTypes()[1], cls) || !Number.class.isAssignableFrom(AbstractC1134q.m2470k(method3))) {
                                                    }
                                                }
                                                i17++;
                                                methods9 = methodArr4;
                                                length9 = i18;
                                            } else {
                                                method3 = null;
                                            }
                                        }
                                        if (method3 == null) {
                                        }
                                        if (lValueOf == null) {
                                        }
                                        if (lValueOf != null) {
                                            str4 = str2;
                                            AbstractC1134q.f3827c.remove(str);
                                            AbstractC0731a.m1387d("read trace local tip insert failed", c1133p.f3819a, c1133p.f3820b);
                                        }
                                    } else {
                                        method3 = method2;
                                    }
                                    Object objInvoke7 = method3.invoke(obj3, objNewInstance2, Boolean.TRUE);
                                    Number number7 = objInvoke7 instanceof Number ? (Number) objInvoke7 : null;
                                    Object c0104d8 = number7 != null ? Long.valueOf(number7.longValue()) : null;
                                    Throwable thM246a6 = AbstractC0105e.m246a(c0104d8);
                                    if (thM246a6 != null) {
                                        AbstractC0731a.m1387d("read trace convertFrom insert fail", method3.getName(), thM246a6);
                                    }
                                    if (c0104d8 instanceof C0104d) {
                                        c0104d8 = null;
                                    }
                                    lValueOf = (Long) c0104d8;
                                    if (lValueOf == null) {
                                    }
                                    if (lValueOf != null) {
                                    }
                                }
                                break;
                            }
                        }
                        lValueOf = null;
                        if (lValueOf == null) {
                        }
                        if (lValueOf != null) {
                        }
                    }
                }
                String str12 = c1133p.f3820b;
                List<C1133p> listM2464e = AbstractC1134q.m2464e();
                ArrayList arrayList2 = new ArrayList(AbstractC0125m.m289c0(listM2464e));
                for (C1133p c1133p2 : listM2464e) {
                    if (c1133p2.f3820b.equals(str12)) {
                        String str13 = c1133p2.f3819a;
                        String str14 = c1133p2.f3820b;
                        String str15 = c1133p2.f3821c;
                        AbstractC0223g.m418e(str4, "lastSeen");
                        c1133p2 = new C1133p(str13, str14, str15, c1133p2.f3822d, str4, true);
                    }
                    arrayList2.add(c1133p2);
                }
                AbstractC1134q.m2471l(AbstractC1134q.m2461b(arrayList2));
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ RunnableC0045r(Object obj, Object obj2, Object obj3, int i2) {
        this.f274a = i2;
        this.f275b = obj;
        this.f276c = obj2;
        this.f277d = obj3;
    }
}

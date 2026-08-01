package p001A0;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p009E0.AbstractC0105e;
import p009E0.C0103c;
import p009E0.C0104d;
import p009E0.C0109i;
import p011F0.AbstractC0124l;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p070i0.AbstractC0731a;

/* JADX INFO: renamed from: A0.n */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0041n implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f258b = 0;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f259c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Activity f260d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ DialogInterfaceOnClickListenerC0041n(Activity activity, ArrayList arrayList) {
        this.f260d = activity;
        this.f259c = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        Object c0104d;
        switch (this.f258b) {
            case 0:
                final Activity activity = this.f260d;
                final TextView textView = new TextView(activity);
                textView.setText("准备适配...");
                textView.setTextSize(14.0f);
                textView.setTextColor(Color.rgb(80, 80, 80));
                CopyOnWriteArrayList copyOnWriteArrayList = C0052y.f291a;
                textView.setPadding(0, C0052y.m97b(activity, 12), 0, 0);
                final LinearLayout linearLayout = new LinearLayout(activity);
                linearLayout.setOrientation(1);
                linearLayout.setPadding(C0052y.m97b(activity, 24), C0052y.m97b(activity, 18), C0052y.m97b(activity, 24), C0052y.m97b(activity, 8));
                TextView textView2 = new TextView(activity);
                textView2.setText("正在扫描适配");
                textView2.setTextSize(18.0f);
                textView2.setTypeface(Typeface.DEFAULT_BOLD);
                textView2.setTextColor(Color.rgb(28, 28, 28));
                linearLayout.addView(textView2);
                TextView textView3 = new TextView(activity);
                final ArrayList arrayList = this.f259c;
                textView3.setText("共 " + arrayList.size() + " 项，请保持微信在前台。");
                textView3.setTextSize(13.0f);
                textView3.setTextColor(Color.rgb(120, 120, 120));
                textView3.setPadding(0, C0052y.m97b(activity, 6), 0, C0052y.m97b(activity, 14));
                linearLayout.addView(textView3);
                ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
                progressBar.setIndeterminate(false);
                progressBar.setMax(arrayList.size());
                progressBar.setProgress(0);
                progressBar.setTag("progress");
                linearLayout.addView(progressBar);
                linearLayout.addView(textView);
                final AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(linearLayout).setCancelable(false).create();
                alertDialogCreate.show();
                new Thread(new Runnable() { // from class: A0.o
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        Object c0104d2;
                        ArrayList arrayList2 = new ArrayList();
                        final ArrayList arrayList3 = arrayList;
                        Iterator it = arrayList3.iterator();
                        final int i3 = 0;
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            Activity activity2 = activity;
                            if (!zHasNext) {
                                new Handler(Looper.getMainLooper()).post(new RunnableC0045r(alertDialogCreate, activity2, arrayList2, 0));
                                return;
                            }
                            Object next = it.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                AbstractC0124l.m288b0();
                                throw null;
                            }
                            final C0048u c0048u = (C0048u) next;
                            Handler handler = new Handler(Looper.getMainLooper());
                            final TextView textView4 = textView;
                            final LinearLayout linearLayout2 = linearLayout;
                            handler.post(new Runnable() { // from class: A0.p
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String str = c0048u.f283b;
                                    int i5 = i3;
                                    textView4.setText("正在适配：" + str + "（" + (i5 + 1) + "/" + arrayList3.size() + "）");
                                    ProgressBar progressBar2 = (ProgressBar) linearLayout2.findViewWithTag("progress");
                                    if (progressBar2 != null) {
                                        progressBar2.setProgress(i5);
                                    }
                                }
                            });
                            try {
                                InterfaceC0204l interfaceC0204l = c0048u.f286e;
                                Context applicationContext = activity2.getApplicationContext();
                                AbstractC0223g.m417d(applicationContext, "getApplicationContext(...)");
                                c0104d2 = (C0047t) interfaceC0204l.mo8c(applicationContext);
                            } catch (Throwable th) {
                                c0104d2 = new C0104d(th);
                            }
                            Throwable thM246a = AbstractC0105e.m246a(c0104d2);
                            if (thM246a != null) {
                                AbstractC0731a.m1387d("统一扫描失败", c0048u.f282a, thM246a);
                                c0104d2 = new C0047t(false, c0048u.f283b + " 扫描异常：" + thM246a.getClass().getSimpleName(), true);
                            }
                            arrayList2.add(new C0103c(c0048u, (C0047t) c0104d2));
                            new Handler(Looper.getMainLooper()).post(new RunnableC0044q(linearLayout2, i3, 0));
                            i3 = i4;
                        }
                    }
                }).start();
                break;
            default:
                Iterator it = this.f259c.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    Activity activity2 = this.f260d;
                    if (!zHasNext) {
                        AbstractC0223g.m417d(activity2.getApplicationContext(), "getApplicationContext(...)");
                        AbstractC0039l.m81s("unified_dexkit_scan_status_v16", true);
                        C0052y.f294d.set(false);
                    } else {
                        C0048u c0048u = (C0048u) it.next();
                        try {
                            InterfaceC0204l interfaceC0204l = c0048u.f287f;
                            Context applicationContext = activity2.getApplicationContext();
                            AbstractC0223g.m417d(applicationContext, "getApplicationContext(...)");
                            interfaceC0204l.mo8c(applicationContext);
                            c0104d = C0109i.f404a;
                        } catch (Throwable th) {
                            c0104d = new C0104d(th);
                        }
                        Throwable thM246a = AbstractC0105e.m246a(c0104d);
                        if (thM246a != null) {
                            AbstractC0731a.m1387d("unified dexkit skip callback fail", c0048u.f282a, thM246a);
                        }
                    }
                    break;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ DialogInterfaceOnClickListenerC0041n(ArrayList arrayList, Activity activity) {
        this.f259c = arrayList;
        this.f260d = activity;
    }
}

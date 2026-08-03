package p000a;

import android.R;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p000a.C0186K3;
import p000a.C0330S4;
import p000a.C0637if;
import p000a.C0803ra;
import p000a.C0901wd;
import p000a.C0924xh;
import top.mmjz.floatingclouds.bean.MaskItemBean;

/* JADX INFO: renamed from: a.ra */
/* JADX INFO: loaded from: classes.dex */
public final class C0803ra {

    /* JADX INFO: renamed from: a */
    public final Activity f3168a;

    /* JADX INFO: renamed from: b */
    public final a f3169b;

    /* JADX INFO: renamed from: c */
    public final boolean f3170c;

    /* JADX INFO: renamed from: d */
    public AlertDialog f3171d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f3172e;

    /* JADX INFO: renamed from: f */
    public ScrollView f3173f;

    /* JADX INFO: renamed from: g */
    public int f3174g;

    /* JADX INFO: renamed from: h */
    public Switch f3175h;

    /* JADX INFO: renamed from: i */
    public boolean f3176i;

    /* JADX INFO: renamed from: j */
    public C0643j2 f3177j;

    /* JADX INFO: renamed from: k */
    public final C0233Me f3178k;

    /* JADX INFO: renamed from: a.ra$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f3179a;

        /* JADX INFO: renamed from: b */
        public final int f3180b;

        /* JADX INFO: renamed from: c */
        public final int f3181c;

        /* JADX INFO: renamed from: d */
        public final int f3182d;

        /* JADX INFO: renamed from: e */
        public final int f3183e;

        /* JADX INFO: renamed from: f */
        public final int f3184f;

        /* JADX INFO: renamed from: g */
        public final int f3185g;

        /* JADX INFO: renamed from: h */
        public final int f3186h;

        /* JADX INFO: renamed from: i */
        public final boolean f3187i;

        public a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            this.f3179a = i;
            this.f3180b = i2;
            this.f3181c = i3;
            this.f3182d = i4;
            this.f3183e = i5;
            this.f3184f = i6;
            this.f3185g = i7;
            this.f3186h = i8;
            this.f3187i = z;
        }
    }

    /* JADX INFO: renamed from: a.ra$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String f3188a;

        /* JADX INFO: renamed from: b */
        public final String f3189b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC0136H7<LinearLayout, C0653jc, C0413Wf> f3190c;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: a.H7<? super android.widget.LinearLayout, ? super a.jc, a.Wf> */
        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, String str2, InterfaceC0136H7<? super LinearLayout, ? super C0653jc, C0413Wf> interfaceC0136H7) {
            this.f3188a = str;
            this.f3189b = str2;
            this.f3190c = interfaceC0136H7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C0631i9.m1478a(this.f3188a, bVar.f3188a) && C0631i9.m1478a(this.f3189b, bVar.f3189b) && C0631i9.m1478a(this.f3190c, bVar.f3190c);
        }

        public final int hashCode() {
            return this.f3190c.hashCode() + C0944z.m2222b(this.f3189b, this.f3188a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "Group(title=" + this.f3188a + ", desc=" + this.f3189b + ", build=" + this.f3190c + ")";
        }
    }

    public C0803ra(Activity activity) {
        this.f3168a = activity;
        a aVar = (activity.getResources().getConfiguration().uiMode & 48) == 32 ? new a(Color.parseColor("#111111"), Color.parseColor("#1E1E1E"), Color.parseColor("#2C2C2C"), Color.parseColor("#F2F2F2"), Color.parseColor("#B3B3B3"), Color.parseColor("#666666"), Color.parseColor("#8FB2DC"), Color.parseColor("#FA5151"), true) : new a(Color.parseColor("#EDEDED"), Color.parseColor("#FFFFFF"), Color.parseColor("#DDDDDD"), Color.parseColor("#191919"), Color.parseColor("#888888"), Color.parseColor("#B0B0B0"), Color.parseColor("#576B95"), Color.parseColor("#FA5151"), false);
        this.f3169b = aVar;
        this.f3170c = aVar.f3187i;
        this.f3174g = -1;
        this.f3178k = new C0233Me(new C0537da(this, 0));
    }

    /* JADX INFO: renamed from: c */
    public static String m1862c(long j) {
        if (j <= 0) {
            return "未知";
        }
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(j));
        C0631i9.m1481d(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: i */
    public static void m1863i(C0653jc c0653jc) {
        C0186K3.f638a.getClass();
        C0186K3.a.m519t(c0653jc);
        C0186K3.f647j = null;
        C0186K3.f648k = null;
        C0186K3.f649l = null;
    }

    /* JADX INFO: renamed from: k */
    public static String m1864k(String str) {
        if (str == null || str.length() == 0 || str.equals("null")) {
            return "尚未加载";
        }
        if (str.length() <= 12) {
            return str;
        }
        String strSubstring = str.substring(0, 12);
        C0631i9.m1481d(strSubstring, "substring(...)");
        return strSubstring.concat("...");
    }

    /* JADX INFO: renamed from: a */
    public final LinearLayout m1865a(String str, InterfaceC0819s7 interfaceC0819s7) {
        Activity activity = this.f3168a;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(m1866b(14), m1866b(14), m1866b(14), m1866b(14));
        GradientDrawable gradientDrawable = new GradientDrawable();
        a aVar = this.f3169b;
        gradientDrawable.setColor(aVar.f3180b);
        gradientDrawable.setCornerRadius(m1866b(12));
        linearLayout.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, m1866b(3), 0, m1866b(3));
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextSize(2, 15.0f);
        textView.setTextColor(aVar.f3182d);
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout.addView(textView);
        TextView textView2 = new TextView(activity);
        textView2.setText(">");
        textView2.setTextSize(2, 16.0f);
        textView2.setTextColor(aVar.f3184f);
        linearLayout.addView(textView2);
        linearLayout.setOnClickListener(new ViewOnClickListenerC0606h3(3, interfaceC0819s7));
        return linearLayout;
    }

    /* JADX INFO: renamed from: b */
    public final int m1866b(int i) {
        return (int) TypedValue.applyDimension(1, i, this.f3168a.getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: d */
    public final LinearLayout m1867d(String str, String str2, int i, InterfaceC0064D7 interfaceC0064D7) {
        Activity activity = this.f3168a;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(m1866b(14), m1866b(10), m1866b(14), m1866b(10));
        GradientDrawable gradientDrawable = new GradientDrawable();
        a aVar = this.f3169b;
        gradientDrawable.setColor(aVar.f3180b);
        gradientDrawable.setCornerRadius(m1866b(12));
        linearLayout.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, m1866b(3), 0, m1866b(3));
        linearLayout.setLayoutParams(layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextSize(2, 14.0f);
        int i2 = aVar.f3182d;
        textView.setTextColor(i2);
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(activity);
        textView2.setText("保存");
        textView2.setTextSize(2, 11.0f);
        textView2.setTextColor(aVar.f3180b);
        textView2.setGravity(17);
        textView2.setPadding(m1866b(10), m1866b(4), m1866b(10), m1866b(4));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(aVar.f3185g);
        gradientDrawable2.setCornerRadius(m1866b(6));
        textView2.setBackground(gradientDrawable2);
        linearLayout2.addView(textView2);
        linearLayout.addView(linearLayout2);
        EditText editText = new EditText(activity);
        editText.setText(str2);
        editText.setTextSize(2, 14.0f);
        editText.setTextColor(i2);
        editText.setHintTextColor(aVar.f3184f);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(aVar.f3179a);
        gradientDrawable3.setCornerRadius(m1866b(8));
        editText.setBackground(gradientDrawable3);
        editText.setPadding(m1866b(12), m1866b(8), m1866b(12), m1866b(8));
        editText.setSingleLine(true);
        editText.setInputType(i);
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.setOnTouchListener(new ViewOnTouchListenerC0727na());
        linearLayout.addView(editText);
        textView2.setOnClickListener(new ViewOnClickListenerC0746oa(interfaceC0064D7, editText, textView2, this, 0));
        return linearLayout;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final void m1868e() {
        C0186K3.f638a.getClass();
        final ArrayList arrayListM1961y0 = C0834t3.m1961y0(C0186K3.a.m502c());
        ArrayList arrayList = new ArrayList(C0758p3.m1800g0(arrayListM1961y0, 10));
        Iterator it = arrayListM1961y0.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()).toString());
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        final C0338Sc c0338Sc = new C0338Sc();
        AlertDialog.Builder title = new AlertDialog.Builder(this.f3168a).setTitle("已隐藏的朋友圈（共 " + arrayListM1961y0.size() + " 条）");
        if (charSequenceArr.length == 0) {
            title.setMessage("暂无已隐藏的朋友圈");
        } else {
            final int i = 0;
            title.setItems(charSequenceArr, new DialogInterface.OnClickListener() { // from class: a.qa
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, final int i2) {
                    switch (i) {
                        case 0:
                            final C0803ra c0803ra = this;
                            AlertDialog.Builder builder = new AlertDialog.Builder(c0803ra.f3168a);
                            final ArrayList arrayList2 = arrayListM1961y0;
                            AlertDialog.Builder title2 = builder.setTitle("移除 " + arrayList2.get(i2) + "？");
                            final C0338Sc c0338Sc2 = c0338Sc;
                            AlertDialog alertDialogCreate = title2.setPositiveButton("移除", new DialogInterface.OnClickListener() { // from class: a.ea
                                /* JADX DEBUG: Multi-variable search result rejected for r4v8, resolved type: T */
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface2, int i3) {
                                    C0186K3.a aVar = C0186K3.f638a;
                                    String str = (String) arrayList2.get(i2);
                                    aVar.getClass();
                                    C0631i9.m1482e(str, "id");
                                    LinkedHashSet linkedHashSetM502c = C0186K3.a.m502c();
                                    if (linkedHashSetM502c.remove(str)) {
                                        C0186K3.a.m517r(linkedHashSetM502c);
                                    }
                                    C0803ra c0803ra2 = c0803ra;
                                    Toast.makeText(c0803ra2.f3168a, "已移除", 0).show();
                                    AlertDialog alertDialog = (AlertDialog) c0338Sc2.f1200a;
                                    if (alertDialog != null) {
                                        alertDialog.dismiss();
                                    }
                                    c0803ra2.m1868e();
                                }
                            }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
                            if (alertDialogCreate != null) {
                                alertDialogCreate.show();
                                c0803ra.m1876o(alertDialogCreate);
                            }
                            break;
                        default:
                            C0803ra c0803ra2 = this;
                            AlertDialog alertDialogCreate2 = new AlertDialog.Builder(c0803ra2.f3168a).setTitle("确认清空").setMessage("将清空全部 " + arrayListM1961y0.size() + " 条，不可撤销。").setPositiveButton("确认清空", new DialogInterfaceOnClickListenerC0246N9(c0338Sc, c0803ra2, 1)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
                            if (alertDialogCreate2 != null) {
                                alertDialogCreate2.show();
                                c0803ra2.m1876o(alertDialogCreate2);
                            }
                            break;
                    }
                }
            });
            final int i2 = 1;
            title.setPositiveButton("清空", new DialogInterface.OnClickListener() { // from class: a.qa
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, final int i22) {
                    switch (i2) {
                        case 0:
                            final C0803ra c0803ra = this;
                            AlertDialog.Builder builder = new AlertDialog.Builder(c0803ra.f3168a);
                            final ArrayList arrayList2 = arrayListM1961y0;
                            AlertDialog.Builder title2 = builder.setTitle("移除 " + arrayList2.get(i22) + "？");
                            final C0338Sc c0338Sc2 = c0338Sc;
                            AlertDialog alertDialogCreate = title2.setPositiveButton("移除", new DialogInterface.OnClickListener() { // from class: a.ea
                                /* JADX DEBUG: Multi-variable search result rejected for r4v8, resolved type: T */
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface2, int i3) {
                                    C0186K3.a aVar = C0186K3.f638a;
                                    String str = (String) arrayList2.get(i22);
                                    aVar.getClass();
                                    C0631i9.m1482e(str, "id");
                                    LinkedHashSet linkedHashSetM502c = C0186K3.a.m502c();
                                    if (linkedHashSetM502c.remove(str)) {
                                        C0186K3.a.m517r(linkedHashSetM502c);
                                    }
                                    C0803ra c0803ra2 = c0803ra;
                                    Toast.makeText(c0803ra2.f3168a, "已移除", 0).show();
                                    AlertDialog alertDialog = (AlertDialog) c0338Sc2.f1200a;
                                    if (alertDialog != null) {
                                        alertDialog.dismiss();
                                    }
                                    c0803ra2.m1868e();
                                }
                            }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
                            if (alertDialogCreate != null) {
                                alertDialogCreate.show();
                                c0803ra.m1876o(alertDialogCreate);
                            }
                            break;
                        default:
                            C0803ra c0803ra2 = this;
                            AlertDialog alertDialogCreate2 = new AlertDialog.Builder(c0803ra2.f3168a).setTitle("确认清空").setMessage("将清空全部 " + arrayListM1961y0.size() + " 条，不可撤销。").setPositiveButton("确认清空", new DialogInterfaceOnClickListenerC0246N9(c0338Sc, c0803ra2, 1)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
                            if (alertDialogCreate2 != null) {
                                alertDialogCreate2.show();
                                c0803ra2.m1876o(alertDialogCreate2);
                            }
                            break;
                    }
                }
            });
        }
        AlertDialog.Builder neutralButton = title.setNeutralButton("添加", new DialogInterfaceOnClickListenerC0765pa(this, 2));
        T t = 0;
        AlertDialog alertDialogCreate = neutralButton.setNegativeButton("关闭", (DialogInterface.OnClickListener) null).create();
        if (alertDialogCreate != null) {
            alertDialogCreate.show();
            m1876o(alertDialogCreate);
            t = alertDialogCreate;
        }
        c0338Sc.f1200a = t;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028d A[Catch: all -> 0x0269, TryCatch #1 {all -> 0x0269, blocks: (B:57:0x0250, B:59:0x0256, B:61:0x025d, B:83:0x028d, B:69:0x026c, B:71:0x0272, B:76:0x027c, B:78:0x0283, B:84:0x029d), top: B:129:0x0250, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02df  */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.app.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [T] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v15, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v43, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.View, android.widget.ScrollView] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1869f() {
        C0338Sc c0338Sc;
        ?? r18;
        ?? r14;
        ?? r182;
        ?? r20;
        String str;
        String str2;
        Object obj;
        Map.Entry entry;
        Cursor cursorM2211a;
        String string;
        ?? r202;
        ?? r203;
        C0115G4 c0115g4;
        C0186K3.f638a.getClass();
        ArrayList arrayListM505f = C0186K3.a.m505f();
        Activity activity = this.f3168a;
        ?? scrollView = new ScrollView(activity);
        GradientDrawable gradientDrawable = new GradientDrawable();
        a aVar = this.f3169b;
        gradientDrawable.setColor(aVar.f3179a);
        gradientDrawable.setCornerRadius(m1866b(16));
        scrollView.setBackground(gradientDrawable);
        int i = 12;
        scrollView.setPadding(0, 0, 0, m1866b(12));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(m1866b(16), m1866b(20), m1866b(16), m1866b(36));
        TextView textView = new TextView(activity);
        int size = arrayListM505f.size();
        StringBuilder sb = new StringBuilder("配置名单（");
        sb.append(size);
        String str3 = " 个）";
        sb.append(" 个）");
        textView.setText(sb.toString());
        textView.setTextSize(2, 13.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        int i2 = aVar.f3183e;
        textView.setTextColor(i2);
        textView.setPadding(m1866b(4), m1866b(8), m1866b(4), m1866b(8));
        linearLayout.addView(textView);
        if (arrayListM505f.isEmpty()) {
            TextView textView2 = new TextView(activity);
            textView2.setText("暂无伪装");
            textView2.setTextSize(2, 14.0f);
            textView2.setTextColor(i2);
            textView2.setGravity(17);
            textView2.setPadding(0, m1866b(12), 0, m1866b(8));
            linearLayout.addView(textView2);
        }
        scrollView.addView(linearLayout);
        C0338Sc c0338Sc2 = new C0338Sc();
        C0722n5 c0722n5 = new C0722n5(c0338Sc2, 1, this);
        if (!arrayListM505f.isEmpty()) {
            Iterator it = arrayListM505f.iterator();
            ?? r4 = scrollView;
            ?? r9 = linearLayout;
            while (true) {
                boolean zHasNext = it.hasNext();
                int i3 = aVar.f3186h;
                if (!zHasNext) {
                    c0338Sc = c0338Sc2;
                    r18 = r4;
                    ?? r3 = r9;
                    r3.addView(m1875n(m1866b(i)));
                    TextView textView3 = new TextView(activity);
                    C0186K3.f638a.getClass();
                    textView3.setText("一键清空全部伪装（" + C0186K3.a.m505f().size() + str3);
                    textView3.setTextSize(2, 14.0f);
                    textView3.setTextColor(i3);
                    textView3.setGravity(17);
                    textView3.setPadding(0, m1866b(14), 0, m1866b(14));
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setStroke(1, i3);
                    gradientDrawable2.setCornerRadius(m1866b(12));
                    gradientDrawable2.setColor(0);
                    textView3.setBackground(gradientDrawable2);
                    textView3.setOnClickListener(new ViewOnClickListenerC0443Y9(this, 2, c0722n5));
                    r3.addView(textView3);
                    break;
                }
                MaskItemBean maskItemBean = (MaskItemBean) it.next();
                ?? linearLayout2 = new LinearLayout(activity);
                linearLayout2.setOrientation(1);
                Iterator it2 = it;
                C0338Sc c0338Sc3 = c0338Sc2;
                linearLayout2.setPadding(m1866b(14), m1866b(12), m1866b(14), m1866b(12));
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setColor(aVar.f3180b);
                gradientDrawable3.setCornerRadius(m1866b(12));
                linearLayout2.setBackground(gradientDrawable3);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(0, m1866b(2), 0, m1866b(2));
                linearLayout2.setLayoutParams(layoutParams);
                String maskId = maskItemBean.getMaskId();
                ConcurrentHashMap<String, C0115G4> concurrentHashMap = C0924xh.f3533a;
                if (maskId == null || C0034Be.m101P(maskId) || C0015Ae.m49H(maskId, "gh_", false) || C0034Be.m94I(maskId, "@", false)) {
                    r182 = r4;
                    r20 = r9;
                    str = str3;
                    str2 = null;
                } else {
                    ConcurrentHashMap<String, String> concurrentHashMap2 = C0924xh.f3534b;
                    str2 = concurrentHashMap2.get(maskId);
                    if (str2 != null) {
                        r182 = r4;
                        r20 = r9;
                        str = str3;
                    } else if (concurrentHashMap2.isEmpty()) {
                        Set<Map.Entry<String, C0115G4>> setEntrySet = C0924xh.f3533a.entrySet();
                        C0631i9.m1481d(setEntrySet, "<get-entries>(...)");
                        Iterator it3 = setEntrySet.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj = null;
                                break;
                            }
                            Object next = it3.next();
                            Object key = ((Map.Entry) next).getKey();
                            Iterator it4 = it3;
                            C0631i9.m1481d(key, "<get-key>(...)");
                            if (C0034Be.m94I((CharSequence) key, "EnMicroMsg", false)) {
                                obj = next;
                                break;
                            }
                            it3 = it4;
                        }
                        Map.Entry entry2 = (Map.Entry) obj;
                        if (entry2 == null) {
                            entry = entry2;
                            Log.e("FCloud_DB", "no EnMicroMsg in Store (Store size=" + C0924xh.f3533a.size() + ")");
                        } else {
                            entry = entry2;
                        }
                        Object obj2 = (entry == null || (c0115g4 = (C0115G4) entry.getValue()) == null) ? null : c0115g4.f382a;
                        r182 = r4;
                        if (obj2 == null) {
                            Log.e("FCloud_DB", "db null for ".concat(maskId));
                            r203 = r9;
                            str = str3;
                        } else {
                            str = str3;
                            ?? r204 = r9;
                            try {
                                cursorM2211a = C0924xh.a.m2211a(obj2, "select nickname, alias, conRemark from rcontact where username=?", new String[]{maskId});
                            } catch (Throwable th) {
                                Log.e("FCloud_DB", "query failed for " + maskId + ": " + th.getMessage());
                                r203 = r204;
                            }
                            if (cursorM2211a == null) {
                                Log.e("FCloud_DB", "cursor null for " + maskId);
                                r203 = r204;
                            } else {
                                try {
                                    if (cursorM2211a.moveToFirst()) {
                                        string = cursorM2211a.getString(2);
                                        if (string == null) {
                                            string = cursorM2211a.getString(0);
                                            if (string == null || C0034Be.m101P(string)) {
                                                string = null;
                                            }
                                            if (string == null && ((string = cursorM2211a.getString(1)) == null || C0034Be.m101P(string))) {
                                                string = null;
                                            }
                                            if (string == null) {
                                                Log.e("FCloud_DB", "row found but blank for " + maskId);
                                            }
                                        } else {
                                            if (C0034Be.m101P(string)) {
                                                string = null;
                                            }
                                            if (string == null) {
                                            }
                                            if (string == null) {
                                            }
                                        }
                                    } else {
                                        Log.e("FCloud_DB", "no row for " + maskId);
                                        string = null;
                                    }
                                    cursorM2211a.close();
                                    str2 = string;
                                    r202 = r204;
                                    Log.e("FCloud_DB", "single query for " + maskId + " -> " + (str2 != null ? "null" : str2));
                                    r20 = r202;
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        C0889w1.m2146e(cursorM2211a, th2);
                                        throw th3;
                                    }
                                }
                            }
                        }
                        str2 = null;
                        r202 = r203;
                        if (str2 != null) {
                        }
                        Log.e("FCloud_DB", "single query for " + maskId + " -> " + (str2 != null ? "null" : str2));
                        r20 = r202;
                    } else {
                        Log.e("FCloud_DB", "cache miss for " + maskId + " (cache=" + concurrentHashMap2.size() + " entries, no fallback)");
                        r182 = r4;
                        r20 = r9;
                        str = str3;
                        str2 = null;
                    }
                }
                if (str2 == null) {
                    String tagName = maskItemBean.getTagName();
                    if (tagName.length() == 0) {
                        tagName = maskItemBean.getMaskId();
                    }
                    str2 = tagName;
                } else if (maskItemBean.getTagName().length() > 0) {
                    str2 = str2 + "（" + maskItemBean.getTagName() + "）";
                }
                TextView textView4 = new TextView(activity);
                textView4.setText(str2);
                textView4.setTextSize(2, 15.0f);
                textView4.setTextColor(aVar.f3182d);
                linearLayout2.addView(textView4);
                TextView textView5 = new TextView(activity);
                String maskId2 = maskItemBean.getMaskId();
                if (maskId2.length() > 10) {
                    maskId2 = C0053Ce.m143X(maskId2, 8) + "…" + C0053Ce.m144Y(maskId2, 4);
                }
                textView5.setText("伪装ID: " + maskId2 + "\n映射ID: " + maskItemBean.getMapId());
                textView5.setTextSize(2, 11.0f);
                textView5.setTextColor(i2);
                textView5.setPadding(0, m1866b(2), 0, m1866b(6));
                linearLayout2.addView(textView5);
                TextView textView6 = new TextView(activity);
                textView6.setText("移除伪装");
                textView6.setTextSize(2, 12.0f);
                textView6.setTextColor(i3);
                textView6.setGravity(17);
                textView6.setPadding(m1866b(10), m1866b(5), m1866b(10), m1866b(5));
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setStroke(1, i3);
                gradientDrawable4.setCornerRadius(m1866b(6));
                gradientDrawable4.setColor(0);
                textView6.setBackground(gradientDrawable4);
                textView6.setOnClickListener(new ViewOnClickListenerC0443Y9(maskItemBean, 1, c0722n5));
                linearLayout2.addView(textView6);
                ?? r32 = r20;
                r32.addView(linearLayout2);
                r9 = r32;
                it = it2;
                c0338Sc2 = c0338Sc3;
                r4 = r182;
                str3 = str;
                i = 12;
            }
        } else {
            c0338Sc = c0338Sc2;
            r18 = scrollView;
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(r18).create();
        if (alertDialogCreate != null) {
            Window window = alertDialogCreate.getWindow();
            if (window != null) {
                window.setBackgroundDrawableResource(R.color.transparent);
                window.setSoftInputMode(3);
            }
            alertDialogCreate.setCanceledOnTouchOutside(true);
            alertDialogCreate.show();
            Window window2 = alertDialogCreate.getWindow();
            if (window2 != null) {
                DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                WindowManager.LayoutParams attributes = window2.getAttributes();
                attributes.width = (int) (((double) displayMetrics.widthPixels) * 0.94d);
                attributes.height = (int) (((double) displayMetrics.heightPixels) * 0.82d);
                attributes.gravity = 17;
                attributes.flags |= 32;
                window2.setAttributes(attributes);
            }
            r14 = alertDialogCreate;
        } else {
            r14 = 0;
        }
        c0338Sc.f1200a = r14;
    }

    /* JADX INFO: renamed from: g */
    public final void m1870g() {
        LinearLayout linearLayout = this.f3172e;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        int i = -1;
        this.f3174g = -1;
        this.f3175h = null;
        C0186K3.f638a.getClass();
        C0186K3.a.m508i();
        Activity activity = this.f3168a;
        TextView textView = new TextView(activity);
        textView.setText("@mmjz");
        textView.setTextSize(2, 18.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        a aVar = this.f3169b;
        textView.setTextColor(aVar.f3185g);
        textView.setGravity(17);
        int i2 = 0;
        textView.setPadding(0, m1866b(4), 0, m1866b(4));
        linearLayout.addView(textView);
        TextView textView2 = new TextView(activity);
        textView2.setText("https://t.me/tkwx123");
        textView2.setTextSize(2, 12.0f);
        textView2.setTextColor(aVar.f3185g);
        textView2.setGravity(17);
        textView2.setPadding(0, 0, 0, m1866b(12));
        textView2.setOnClickListener(new ViewOnClickListenerC0594ga(this, 0));
        linearLayout.addView(textView2);
        int iM1866b = m1866b(1);
        View view = new View(activity);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, iM1866b));
        view.setBackgroundColor(aVar.f3181c);
        linearLayout.addView(view);
        linearLayout.addView(m1875n(m1866b(10)));
        final int i3 = 0;
        for (b bVar : (List) this.f3178k.m625a()) {
            int i4 = i3 + 1;
            LinearLayout linearLayout2 = new LinearLayout(activity);
            linearLayout2.setOrientation(i2);
            linearLayout2.setGravity(16);
            linearLayout2.setPadding(m1866b(14), m1866b(13), m1866b(14), m1866b(13));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(aVar.f3180b);
            gradientDrawable.setCornerRadius(m1866b(14));
            if (this.f3170c) {
                gradientDrawable.setStroke(1, Color.argb(33, 255, 255, 255));
            }
            linearLayout2.setBackground(gradientDrawable);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, -2);
            layoutParams.setMargins(0, m1866b(4), 0, m1866b(4));
            linearLayout2.setLayoutParams(layoutParams);
            LinearLayout linearLayout3 = new LinearLayout(activity);
            linearLayout3.setOrientation(1);
            linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            TextView textView3 = new TextView(activity);
            textView3.setText(bVar.f3188a);
            textView3.setTextSize(2, 15.0f);
            textView3.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            textView3.setTextColor(aVar.f3182d);
            linearLayout3.addView(textView3);
            TextView textView4 = new TextView(activity);
            textView4.setText(bVar.f3189b);
            textView4.setTextSize(2, 12.0f);
            textView4.setTextColor(aVar.f3183e);
            textView4.setPadding(0, m1866b(3), 0, 0);
            linearLayout3.addView(textView4);
            linearLayout2.addView(linearLayout3);
            TextView textView5 = new TextView(activity);
            textView5.setText(">");
            textView5.setTextSize(2, 16.0f);
            textView5.setTextColor(aVar.f3184f);
            linearLayout2.addView(textView5);
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: a.la
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C0803ra c0803ra = this.f2553a;
                    LinearLayout linearLayout4 = c0803ra.f3172e;
                    if (linearLayout4 == null) {
                        return;
                    }
                    linearLayout4.removeAllViews();
                    int i5 = i3;
                    c0803ra.f3174g = i5;
                    if (i5 != 3) {
                        c0803ra.f3175h = null;
                    }
                    C0186K3.f638a.getClass();
                    C0653jc c0653jcM508i = C0186K3.a.m508i();
                    C0803ra.b bVar2 = (C0803ra.b) ((List) c0803ra.f3178k.m625a()).get(i5);
                    Activity activity2 = c0803ra.f3168a;
                    LinearLayout linearLayout5 = new LinearLayout(activity2);
                    linearLayout5.setOrientation(0);
                    linearLayout5.setGravity(16);
                    linearLayout5.setPadding(c0803ra.m1866b(4), c0803ra.m1866b(8), c0803ra.m1866b(4), c0803ra.m1866b(12));
                    linearLayout5.setOnClickListener(new ViewOnClickListenerC0594ga(c0803ra, 1));
                    TextView textView6 = new TextView(activity2);
                    textView6.setText("←");
                    textView6.setTextSize(2, 20.0f);
                    C0803ra.a aVar2 = c0803ra.f3169b;
                    textView6.setTextColor(aVar2.f3185g);
                    textView6.setPadding(0, 0, c0803ra.m1866b(10), 0);
                    linearLayout5.addView(textView6);
                    TextView textView7 = new TextView(activity2);
                    textView7.setText(bVar2.f3188a);
                    textView7.setTextSize(2, 17.0f);
                    textView7.setTypeface(Typeface.DEFAULT_BOLD);
                    textView7.setTextColor(aVar2.f3182d);
                    linearLayout5.addView(textView7);
                    linearLayout4.addView(linearLayout5);
                    int iM1866b2 = c0803ra.m1866b(1);
                    View view3 = new View(activity2);
                    view3.setLayoutParams(new LinearLayout.LayoutParams(-1, iM1866b2));
                    view3.setBackgroundColor(aVar2.f3181c);
                    linearLayout4.addView(view3);
                    linearLayout4.addView(c0803ra.m1875n(c0803ra.m1866b(10)));
                    bVar2.f3190c.mo146e(linearLayout4, c0653jcM508i);
                    ScrollView scrollView = c0803ra.f3173f;
                    if (scrollView != null) {
                        scrollView.smoothScrollTo(0, 0);
                    }
                }
            });
            linearLayout.addView(linearLayout2);
            i3 = i4;
            i2 = 0;
            i = -1;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m1871h() {
        Activity activity = this.f3168a;
        Toast.makeText(activity, "正在重启微信…", 0).show();
        AlertDialog alertDialog = this.f3171d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        try {
            Context applicationContext = activity.getApplicationContext();
            Intent intent = new Intent();
            intent.setClassName("com.tencent.mm", "com.tencent.mm.ui.LauncherUI");
            intent.addFlags(335544320);
            try {
                PendingIntent activity2 = PendingIntent.getActivity(applicationContext, 0, intent, 201326592);
                Object systemService = applicationContext.getSystemService("alarm");
                C0631i9.m1480c(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
                ((AlarmManager) systemService).set(2, SystemClock.elapsedRealtime() + 1500, activity2);
                C0413Wf c0413Wf = C0413Wf.f1577a;
            } catch (Throwable th) {
                C0920xd.m2206a(th);
            }
            try {
                applicationContext.startActivity(intent);
                C0413Wf c0413Wf2 = C0413Wf.f1577a;
            } catch (Throwable th2) {
                C0920xd.m2206a(th2);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0679l0(1), 800L);
        } catch (Exception e) {
            Toast.makeText(activity, "重启失败: " + e.getMessage(), 1).show();
        }
    }

    /* JADX INFO: renamed from: j */
    public final LinearLayout m1872j(String str, String str2, int i, InterfaceC0064D7 interfaceC0064D7, C0004A3 c0004a3) {
        Activity activity = this.f3168a;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(m1866b(14), m1866b(10), m1866b(14), m1866b(12));
        GradientDrawable gradientDrawable = new GradientDrawable();
        a aVar = this.f3169b;
        gradientDrawable.setColor(aVar.f3180b);
        gradientDrawable.setCornerRadius(m1866b(12));
        linearLayout.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, m1866b(3), 0, m1866b(3));
        linearLayout.setLayoutParams(layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextSize(2, 14.0f);
        textView.setTextColor(aVar.f3182d);
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(activity);
        textView2.setText(i + "%");
        textView2.setTextSize(2, 13.0f);
        int i2 = aVar.f3185g;
        textView2.setTextColor(i2);
        linearLayout2.addView(textView2);
        if (c0004a3 != null) {
            TextView textView3 = new TextView(activity);
            textView3.setText("测试");
            textView3.setTextSize(2, 12.0f);
            textView3.setTextColor(aVar.f3180b);
            textView3.setGravity(17);
            textView3.setPadding(m1866b(12), m1866b(5), m1866b(12), m1866b(5));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(i2);
            gradientDrawable2.setCornerRadius(m1866b(6));
            textView3.setBackground(gradientDrawable2);
            textView3.setOnClickListener(new ViewOnClickListenerC0606h3(5, c0004a3));
            linearLayout2.addView(textView3);
        }
        linearLayout.addView(linearLayout2);
        TextView textView4 = new TextView(activity);
        textView4.setText(str2);
        textView4.setTextSize(2, 11.0f);
        textView4.setTextColor(aVar.f3183e);
        textView4.setPadding(0, m1866b(4), 0, m1866b(6));
        linearLayout.addView(textView4);
        SeekBar seekBar = new SeekBar(activity);
        seekBar.setMax(100);
        seekBar.setProgress(C0267Oc.m748C(i, 0, 100));
        seekBar.setOnSeekBarChangeListener(new C0822sa(textView2, interfaceC0064D7));
        linearLayout.addView(seekBar);
        return linearLayout;
    }

    /* JADX INFO: renamed from: l */
    public final void m1873l() {
        C0643j2 c0643j2 = this.f3177j;
        if (c0643j2 != null) {
            C0518ca.f1891a.remove(c0643j2);
        }
        AlertDialog alertDialog = null;
        this.f3177j = null;
        Activity activity = this.f3168a;
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        int i = (int) (((double) displayMetrics.widthPixels) * 0.94d);
        int i2 = (int) (((double) displayMetrics.heightPixels) * 0.8d);
        FrameLayout frameLayout = new FrameLayout(activity);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.f3169b.f3179a);
        gradientDrawable.setCornerRadius(m1866b(16));
        boolean z = this.f3170c;
        if (z) {
            gradientDrawable.setStroke(1, Color.argb(41, 255, 255, 255));
        }
        frameLayout.setBackground(gradientDrawable);
        frameLayout.setElevation(z ? 24.0f : 12.0f);
        ScrollView scrollView = new ScrollView(activity);
        scrollView.setPadding(0, 0, 0, m1866b(12));
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f3173f = scrollView;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(m1866b(16), m1866b(16), m1866b(16), m1866b(24));
        this.f3172e = linearLayout;
        ScrollView scrollView2 = this.f3173f;
        C0631i9.m1479b(scrollView2);
        scrollView2.addView(this.f3172e);
        frameLayout.addView(this.f3173f);
        m1870g();
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(frameLayout).create();
        if (alertDialogCreate != null) {
            Window window = alertDialogCreate.getWindow();
            if (window != null) {
                window.setBackgroundDrawableResource(R.color.transparent);
                window.setSoftInputMode(16);
                window.setDimAmount(z ? 0.6f : 0.45f);
            }
            alertDialogCreate.setCanceledOnTouchOutside(true);
            alertDialogCreate.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: a.ia
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                    if (i3 != 4 || keyEvent.getAction() != 1) {
                        return false;
                    }
                    C0803ra c0803ra = this.f2308a;
                    if (c0803ra.f3174g < 0) {
                        return false;
                    }
                    c0803ra.m1870g();
                    return true;
                }
            });
            alertDialogCreate.show();
            alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: a.ja
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C0803ra c0803ra = this.f2408a;
                    C0643j2 c0643j22 = c0803ra.f3177j;
                    if (c0643j22 != null) {
                        C0518ca.f1891a.remove(c0643j22);
                    }
                    c0803ra.f3177j = null;
                    c0803ra.f3175h = null;
                }
            });
            if (this.f3177j == null) {
                C0643j2 c0643j22 = new C0643j2(4, this);
                this.f3177j = c0643j22;
                C0518ca.m1280b(c0643j22);
            }
            Window window2 = alertDialogCreate.getWindow();
            if (window2 != null) {
                WindowManager.LayoutParams attributes = window2.getAttributes();
                attributes.width = i;
                attributes.height = i2;
                attributes.gravity = 17;
                attributes.flags = (attributes.flags | 32) & (-131081);
                window2.setAttributes(attributes);
                window2.setSoftInputMode(16);
                window2.getDecorView().setFocusable(true);
                window2.getDecorView().setFocusableInTouchMode(true);
            }
            alertDialog = alertDialogCreate;
        }
        this.f3171d = alertDialog;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:256:0x019b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:268:0x02e3 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:270:0x02c9 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:271:0x02c9 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Type inference failed for: r0v17, types: [android.view.View, android.widget.ScrollView] */
    /* JADX WARN: Type inference failed for: r0v20, types: [android.app.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18, types: [int] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r15v10, types: [int] */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.app.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [int] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r3v23, types: [android.content.DialogInterface$OnClickListener] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1874m() throws Throwable {
        Object objM2206a;
        C0638ig c0638igM504e;
        Throwable th;
        int i;
        ?? ValueOf;
        List listM1959w0;
        List listM1962z0;
        String str;
        char c;
        String str2;
        ?? M2124K;
        int length;
        ?? r11;
        ?? r10;
        String str3;
        Iterator it;
        ?? r32;
        ?? r28;
        ?? ValueOf2;
        Object aVar;
        String str4 = "<this>";
        int i2 = 10;
        ?? r9 = 0;
        int i3 = 1;
        C0186K3.f638a.getClass();
        boolean z = C0186K3.a.m508i().f2421M;
        ClassLoader classLoader = C0889w1.f3479g;
        if (classLoader != null) {
            try {
                C0619hg.f2288a.getClass();
                objM2206a = C0619hg.m1472c(classLoader);
            } catch (Throwable th2) {
                objM2206a = C0920xd.m2206a(th2);
            }
            if (objM2206a instanceof C0901wd.a) {
                objM2206a = null;
            }
            c0638igM504e = (C0638ig) objM2206a;
        } else {
            c0638igM504e = null;
        }
        if (c0638igM504e != null && c0638igM504e.f2331b.length() > 0) {
            C0186K3.f638a.getClass();
            C0186K3.a.m515p(c0638igM504e);
            C0186K3.a.m516q(c0638igM504e);
        }
        if (c0638igM504e == null) {
            C0186K3.f638a.getClass();
            c0638igM504e = C0186K3.a.m504e();
        } else {
            if (c0638igM504e.f2331b.length() <= 0) {
                c0638igM504e = null;
            }
            if (c0638igM504e == null) {
            }
        }
        C0186K3.f638a.getClass();
        C0638ig c0638igM503d = C0186K3.a.m503d();
        StringBuilder sb = new StringBuilder("━━━ 热更新屏蔽状态 ━━━\n");
        if (z) {
            sb.append("✅ 热更新已被屏蔽\n");
        } else {
            sb.append("⚠️ 热更新屏蔽已关闭\n");
        }
        C0637if.f2311a.getClass();
        sb.append("符号定位：" + C0637if.f2312b);
        sb.append('\n');
        sb.append("路径段：" + (!C0601gh.f2228b.isEmpty() ? C0944z.m2223c(C0601gh.f2228b.size(), "已就绪(", ")") : "未就绪"));
        sb.append("\n\n");
        Iterable iterableM2131R = C0439Y5.f1645a;
        try {
            th = null;
            try {
                File file = new File(C0601gh.m1440b(), "hotupdate_intercept_events.log");
                if (file.isFile()) {
                    iterableM2131R = C0889w1.m2131R(file);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            th = null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = iterableM2131R.iterator();
        while (it2.hasNext()) {
            ?? r112 = (String) it2.next();
            String[] strArr = {"|"};
            C0631i9.m1482e(r112, str4);
            String str5 = strArr[r9];
            if (str5.length() == 0) {
                List listAsList = Arrays.asList(strArr);
                C0631i9.m1481d(listAsList, "asList(...)");
                C0339Sd c0339Sd = new C0339Sd(new C0330S4(r112, new C0622i0(i3, listAsList)));
                M2124K = new ArrayList(C0758p3.m1800g0(c0339Sd, i2));
                Iterator<Object> it3 = c0339Sd.iterator();
                while (true) {
                    C0330S4.a aVar2 = (C0330S4.a) it3;
                    if (!aVar2.hasNext()) {
                        break;
                    }
                    C0574f9 c0574f9 = (C0574f9) aVar2.next();
                    C0631i9.m1482e(c0574f9, "range");
                    M2124K.add(r112.subSequence(c0574f9.f1929a, c0574f9.f1930b + i3).toString());
                }
            } else {
                int iM97L = C0034Be.m97L(r112, str5, r9, r9);
                if (iM97L != -1) {
                    ArrayList arrayList2 = new ArrayList(4);
                    ?? r15 = r9;
                    while (true) {
                        arrayList2.add(r112.subSequence(r15, iM97L).toString());
                        length = str5.length() + iM97L;
                        if (arrayList2.size() == 3 || (iM97L = C0034Be.m97L(r112, str5, length, r9)) == -1) {
                            break;
                        } else {
                            r15 = length;
                        }
                    }
                    arrayList2.add(r112.subSequence(length, r112.length()).toString());
                    M2124K = arrayList2;
                } else {
                    M2124K = C0889w1.m2124K(r112.toString());
                }
            }
            if (M2124K.size() < 4) {
                str3 = str4;
                it = it2;
                aVar = th;
            } else {
                ?? r2 = (String) M2124K.get(r9);
                C0631i9.m1482e(r2, str4);
                int length2 = r2.length();
                if (length2 != 0) {
                    char cCharAt = r2.charAt(r9);
                    long j = -9223372036854775807L;
                    if ((cCharAt < '0' ? -1 : cCharAt == '0' ? r9 : 1) < 0) {
                        if (length2 != 1) {
                            if (cCharAt == '+') {
                                r11 = r9;
                                r10 = 1;
                            } else if (cCharAt == '-') {
                                j = Long.MIN_VALUE;
                                r10 = 1;
                                r11 = 1;
                            }
                        }
                        str3 = str4;
                        it = it2;
                        ValueOf2 = th;
                        aVar = new C0637if.a(ValueOf2 != 0 ? ValueOf2.longValue() : 0L, (String) M2124K.get(1), C0631i9.m1478a(M2124K.get(2), "1"), C0034Be.m107V((String) M2124K.get(3)).toString());
                    } else {
                        ?? r102 = r9;
                        r11 = r102 == true ? 1 : 0;
                        r10 = r102;
                    }
                    str3 = str4;
                    it = it2;
                    long j2 = 0;
                    long j3 = -256204778801521550L;
                    ?? r22 = r2;
                    ?? r103 = r10;
                    ?? r113 = r11;
                    while (r103 < length2) {
                        ?? r19 = r22;
                        int iDigit = Character.digit((int) r22.charAt(r103), 10);
                        if (iDigit >= 0) {
                            if (j2 >= j3) {
                                r32 = r103;
                                r28 = r113;
                            } else if (j3 == -256204778801521550L) {
                                r32 = r103;
                                r28 = r113;
                                j3 = j / ((long) 10);
                                if (j2 < j3) {
                                }
                            }
                            long j4 = j2 * ((long) 10);
                            long j5 = iDigit;
                            if (j4 >= j + j5) {
                                j2 = j4 - j5;
                                r22 = r19;
                                r113 = r28;
                                r103 = r32 + 1;
                            }
                        }
                        ValueOf2 = th;
                        break;
                    }
                    ValueOf2 = r113 != 0 ? Long.valueOf(j2) : Long.valueOf(-j2);
                    aVar = new C0637if.a(ValueOf2 != 0 ? ValueOf2.longValue() : 0L, (String) M2124K.get(1), C0631i9.m1478a(M2124K.get(2), "1"), C0034Be.m107V((String) M2124K.get(3)).toString());
                } else {
                    str3 = str4;
                    it = it2;
                    ValueOf2 = th;
                    aVar = new C0637if.a(ValueOf2 != 0 ? ValueOf2.longValue() : 0L, (String) M2124K.get(1), C0631i9.m1478a(M2124K.get(2), "1"), C0034Be.m107V((String) M2124K.get(3)).toString());
                }
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
            str4 = str3;
            it2 = it;
            i2 = 10;
            r9 = 0;
            i3 = 1;
        }
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            Iterator it4 = arrayList.iterator();
            i = 0;
            while (it4.hasNext()) {
                if (((C0637if.a) it4.next()).f2323c && (i = i + 1) < 0) {
                    C0739o3.m1759f0();
                    throw th;
                }
            }
        }
        Iterator it5 = arrayList.iterator();
        if (it5.hasNext()) {
            ValueOf = Long.valueOf(((C0637if.a) it5.next()).f2321a);
            while (it5.hasNext()) {
                Long lValueOf = Long.valueOf(((C0637if.a) it5.next()).f2321a);
                if (ValueOf.compareTo(lValueOf) < 0) {
                    ValueOf = lValueOf;
                }
            }
        } else {
            ValueOf = th;
        }
        long jLongValue = ValueOf != 0 ? ValueOf.longValue() : 0L;
        int size = arrayList.size() - i;
        int size2 = arrayList.size();
        if (20 >= size2) {
            listM1959w0 = C0834t3.m1959w0(arrayList);
        } else {
            ArrayList arrayList3 = new ArrayList(20);
            for (int i4 = size2 - 20; i4 < size2; i4++) {
                arrayList3.add(arrayList.get(i4));
            }
            listM1959w0 = arrayList3;
        }
        if (listM1959w0.size() <= 1) {
            listM1962z0 = C0834t3.m1959w0(listM1959w0);
        } else {
            listM1962z0 = C0834t3.m1962z0(listM1959w0);
            Collections.reverse(listM1962z0);
        }
        sb.append("━━━ 拦截记录 ━━━\n");
        sb.append("拦截成功：" + i + " 次");
        sb.append('\n');
        sb.append("拦截失败（绕过）：" + size + " 次");
        sb.append('\n');
        sb.append("最近拦截：".concat(m1862c(jLongValue)));
        sb.append("\n\n━━━ 当前运行版本 ━━━\n");
        if (c0638igM504e == null || c0638igM504e.f2331b.length() <= 0) {
            sb.append("⚠️ 尚未采集到版本信息\n（请确保微信已完全启动后重试）\n");
            if (classLoader == null) {
                sb.append("（ClassLoader 未就绪，模块可能未在微信进程加载）\n");
            }
            C0413Wf c0413Wf = C0413Wf.f1577a;
        } else {
            sb.append("版本号：" + c0638igM504e.f2331b + " (" + c0638igM504e.f2332c + ")");
            sb.append('\n');
            sb.append("采集时间：".concat(m1862c(c0638igM504e.f2330a)));
            sb.append('\n');
            String str6 = c0638igM504e.f2333d;
            if (str6 == null) {
                str6 = "尚未加载";
            }
            sb.append("当前 Tag：".concat(str6));
            sb.append('\n');
            String str7 = c0638igM504e.f2335f;
            if (str7 == null) {
                str7 = "尚未加载";
            }
            sb.append("当前构建：".concat(str7));
            sb.append('\n');
            sb.append("当前 Rev：" + m1864k(c0638igM504e.f2337h));
            sb.append('\n');
            Boolean bool = c0638igM504e.f2341l;
            if (C0631i9.m1478a(bool, Boolean.TRUE)) {
                str = "启用";
            } else if (C0631i9.m1478a(bool, Boolean.FALSE)) {
                str = "禁用";
            } else {
                if (bool != null) {
                    throw new C0266Ob();
                }
                str = "未知";
            }
            sb.append("补丁状态：".concat(str));
            sb.append("\n\n━━━ 基线版本（热更新前） ━━━\n");
            if (c0638igM504e.m1497a() || c0638igM504e.m1497a()) {
                sb.append("🔴 当前版本已被热更新\n");
                String str8 = c0638igM504e.f2340k;
                if (str8 == null) {
                    str8 = "尚未加载";
                }
                sb.append("基线版本：".concat(str8));
                c = '\n';
                sb.append('\n');
                String str9 = c0638igM504e.f2334e;
                if (str9 == null) {
                    str9 = "尚未加载";
                }
                sb.append("基线 Tag：".concat(str9));
                sb.append('\n');
                String str10 = c0638igM504e.f2336g;
                sb.append("基线构建：".concat(str10 != null ? str10 : "尚未加载"));
                sb.append('\n');
                sb.append("基线 Rev：" + m1864k(c0638igM504e.f2338i));
                sb.append('\n');
                sb.append("补丁 Rev：" + m1864k(c0638igM504e.f2339j));
                sb.append('\n');
            } else {
                sb.append("🟢 未检测到热更新（当前 = 基线）\n");
                String str11 = c0638igM504e.f2340k;
                if (str11 == null) {
                    str11 = "null（无热更新记录）";
                }
                sb.append("基线版本：".concat(str11));
                c = '\n';
                sb.append('\n');
            }
            sb.append(c);
            if (c0638igM503d == null || c0638igM503d.f2330a <= 0) {
                sb.append("━━━ 初始快照 ━━━\n尚未记录（本次采集将作为初始快照）\n");
            } else {
                sb.append("━━━ 初始快照对比 ━━━\n");
                sb.append("初始记录：".concat(m1862c(c0638igM503d.f2330a)));
                sb.append('\n');
                sb.append("初始版本：" + c0638igM503d.f2331b + " (" + c0638igM503d.f2332c + ")");
                sb.append('\n');
                if (c0638igM503d.f2331b.equals(c0638igM504e.f2331b) && C0631i9.m1478a(c0638igM503d.f2337h, c0638igM504e.f2337h)) {
                    sb.append("🟢 版本未变动\n");
                } else {
                    String str12 = c0638igM503d.f2337h;
                    boolean z2 = (str12 == null || (str2 = c0638igM504e.f2337h) == null || str12.equals(str2)) ? false : true;
                    if ((c0638igM503d.f2331b.length() <= 0 || c0638igM504e.f2331b.length() <= 0 || c0638igM503d.f2331b.equals(c0638igM504e.f2331b)) && !z2) {
                        sb.append("🟢 版本未变动\n");
                    } else {
                        sb.append("🟡 版本已变动（疑似热更新或 APK 更新）\n");
                        sb.append("  初始 Rev：" + m1864k(c0638igM503d.f2337h));
                        sb.append('\n');
                        sb.append("  当前 Rev：" + m1864k(c0638igM504e.f2337h));
                        sb.append('\n');
                    }
                }
            }
        }
        ?? scrollView = new ScrollView(this.f3168a);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.f3169b.f3179a);
        gradientDrawable.setCornerRadius(m1866b(12));
        scrollView.setBackground(gradientDrawable);
        ?? linearLayout = new LinearLayout(this.f3168a);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(m1866b(16), m1866b(16), m1866b(16), m1866b(16));
        TextView textView = new TextView(this.f3168a);
        textView.setText(sb.toString());
        textView.setTextSize(2, 12.0f);
        textView.setTextColor(this.f3169b.f3182d);
        Typeface typeface = Typeface.MONOSPACE;
        textView.setTypeface(typeface);
        textView.setLineSpacing(0.0f, 1.3f);
        linearLayout.addView(textView);
        List<C0637if.a> listM1955s0 = C0834t3.m1955s0(10, listM1962z0);
        if (!listM1955s0.isEmpty()) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
            TextView textView2 = new TextView(this.f3168a);
            textView2.setText("▸ 最近事件（" + listM1955s0.size() + " 条）点击展开");
            textView2.setTextSize(2, 12.0f);
            textView2.setTextColor(this.f3169b.f3185g);
            textView2.setTypeface(typeface);
            textView2.setPadding(0, m1866b(8), 0, m1866b(4));
            textView2.setClickable(true);
            linearLayout.addView(textView2);
            LinearLayout linearLayout2 = new LinearLayout(this.f3168a);
            linearLayout2.setOrientation(1);
            for (C0637if.a aVar3 : listM1955s0) {
                String str13 = aVar3.f2321a > 0 ? simpleDateFormat.format(new Date(aVar3.f2321a)) : "--:--:--";
                String str14 = aVar3.f2323c ? "拦截" : "绕过";
                String strConcat = aVar3.f2324d.length() > 40 ? "...".concat(C0053Ce.m144Y(aVar3.f2324d, 37)) : aVar3.f2324d;
                TextView textView3 = new TextView(this.f3168a);
                StringBuilder sbM2229i = C0944z.m2229i("[", str13, "] ", aVar3.f2322b, " ");
                sbM2229i.append(str14);
                sbM2229i.append(" ");
                sbM2229i.append(strConcat);
                textView3.setText(sbM2229i.toString());
                textView3.setTextSize(2, 12.0f);
                textView3.setTextColor(this.f3169b.f3182d);
                textView3.setTypeface(Typeface.MONOSPACE);
                textView3.setPadding(0, m1866b(3), 0, m1866b(3));
                textView3.setLineSpacing(0.0f, 1.2f);
                linearLayout2.addView(textView3);
            }
            ScrollView scrollView2 = new ScrollView(this.f3168a);
            scrollView2.setLayoutParams(new LinearLayout.LayoutParams(-1, m1866b(160)));
            scrollView2.setVerticalScrollBarEnabled(true);
            scrollView2.setVisibility(8);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(this.f3169b.f3180b);
            gradientDrawable2.setCornerRadius(m1866b(8));
            scrollView2.setBackground(gradientDrawable2);
            scrollView2.addView(linearLayout2);
            linearLayout.addView(scrollView2);
            textView2.setOnClickListener(new ViewOnClickListenerC0746oa(new C0303Qc(), scrollView2, textView2, listM1955s0, 1));
        }
        scrollView.addView(linearLayout);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(this.f3168a).setTitle("版本详情").setView(scrollView).setPositiveButton("刷新", new DialogInterfaceOnClickListenerC0765pa(this, 0)).setNeutralButton("重置快照", new DialogInterfaceOnClickListenerC0765pa(this, 1)).setNegativeButton("关闭", th).create();
        alertDialogCreate.show();
        m1876o(alertDialogCreate);
    }

    /* JADX INFO: renamed from: n */
    public final View m1875n(int i) {
        View view = new View(this.f3168a);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
        return view;
    }

    /* JADX INFO: renamed from: o */
    public final void m1876o(AlertDialog alertDialog) {
        Window window = alertDialog.getWindow();
        a aVar = this.f3169b;
        if (window != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(aVar.f3179a);
            gradientDrawable.setCornerRadius(m1866b(16));
            window.setBackgroundDrawable(gradientDrawable);
        }
        Button button = alertDialog.getButton(-1);
        if (button != null) {
            button.setTextColor(aVar.f3185g);
        }
        Button button2 = alertDialog.getButton(-2);
        if (button2 != null) {
            button2.setTextColor(aVar.f3185g);
        }
        Button button3 = alertDialog.getButton(-3);
        if (button3 != null) {
            button3.setTextColor(aVar.f3185g);
        }
        TextView textView = (TextView) alertDialog.findViewById(R.id.title);
        if (textView != null) {
            textView.setTextColor(aVar.f3182d);
        }
        TextView textView2 = (TextView) alertDialog.findViewById(R.id.message);
        if (textView2 != null) {
            textView2.setTextColor(aVar.f3183e);
        }
    }

    /* JADX INFO: renamed from: p */
    public final LinearLayout m1877p(String str, String str2, Switch r12, InterfaceC0064D7 interfaceC0064D7) {
        Activity activity = this.f3168a;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(m1866b(14), m1866b(12), m1866b(10), m1866b(12));
        GradientDrawable gradientDrawable = new GradientDrawable();
        a aVar = this.f3169b;
        gradientDrawable.setColor(aVar.f3180b);
        gradientDrawable.setCornerRadius(m1866b(12));
        if (this.f3170c) {
            gradientDrawable.setStroke(1, Color.argb(33, 255, 255, 255));
        }
        linearLayout.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, m1866b(3), 0, m1866b(3));
        linearLayout.setLayoutParams(layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextSize(2, 15.0f);
        textView.setTextColor(aVar.f3182d);
        textView.setSingleLine(true);
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(activity);
        textView2.setText(str2);
        textView2.setTextSize(2, 12.0f);
        textView2.setTextColor(aVar.f3183e);
        linearLayout2.addView(textView2);
        r12.setOnCheckedChangeListener(new C0418X2(1, interfaceC0064D7));
        linearLayout.addView(linearLayout2);
        linearLayout.addView(r12);
        return linearLayout;
    }

    /* JADX INFO: renamed from: q */
    public final LinearLayout m1878q(String str, String str2, boolean z, InterfaceC0064D7 interfaceC0064D7) {
        Switch r0 = new Switch(this.f3168a);
        r0.setChecked(z);
        C0413Wf c0413Wf = C0413Wf.f1577a;
        return m1877p(str, str2, r0, interfaceC0064D7);
    }
}

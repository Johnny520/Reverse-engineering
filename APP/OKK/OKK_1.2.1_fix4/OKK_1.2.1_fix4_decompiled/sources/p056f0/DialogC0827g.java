package p056f0;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import p007D0.C0137c;
import p007D0.C0146l;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p049b0.C0551a;
import p049b0.C0564n;
import p049b0.EnumC0563m;
import p052d0.ViewOnClickListenerC0745f;

/* JADX INFO: renamed from: f0.g */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC0827g extends Dialog {

    /* JADX INFO: renamed from: a */
    public final Activity f2998a;

    /* JADX INFO: renamed from: b */
    public final C0551a f2999b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0827g(Activity activity, C0551a c0551a) {
        super(activity, R.style.Theme.DeviceDefault.Light.Dialog.NoActionBar.MinWidth);
        AbstractC0307g.m703e(activity, "host");
        this.f2998a = activity;
        this.f2999b = c0551a;
    }

    /* JADX INFO: renamed from: a */
    public final TextView m2147a(String str, InterfaceC0275a interfaceC0275a) {
        TextView textView = new TextView(this.f2998a);
        textView.setText(str);
        textView.setTextSize(2, 14.0f);
        textView.setTextColor(-1);
        textView.setPadding(m2148b(16), m2148b(10), m2148b(16), m2148b(10));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(m2148b(20));
        gradientDrawable.setColor(Color.parseColor("#336940"));
        textView.setBackground(gradientDrawable);
        textView.setOnClickListener(new ViewOnClickListenerC0745f(interfaceC0275a, 3));
        return textView;
    }

    /* JADX INFO: renamed from: b */
    public final int m2148b(int i2) {
        return (int) ((i2 * this.f2998a.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: c */
    public final View m2149c(int i2) {
        View view = new View(this.f2998a);
        view.setLayoutParams(new LinearLayout.LayoutParams(1, m2148b(i2)));
        return view;
    }

    /* JADX INFO: renamed from: d */
    public final TextView m2150d(String str, int i2, boolean z2, int i3) {
        TextView textView = new TextView(this.f2998a);
        textView.setText(str);
        textView.setTextSize(2, i2);
        textView.setTextColor(i3);
        if (z2) {
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        return textView;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String str;
        int color;
        super.onCreate(bundle);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        int iM2148b = m2148b(16);
        Activity activity = this.f2998a;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(iM2148b, iM2148b, iM2148b, iM2148b);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(m2148b(16));
        gradientDrawable.setColor(Color.parseColor("#F7F8FA"));
        linearLayout.setBackground(gradientDrawable);
        linearLayout.addView(m2150d("适配完成", 18, true, Color.parseColor("#1A1A1A")));
        linearLayout.addView(m2149c(6));
        C0551a c0551a = this.f2999b;
        linearLayout.addView(m2150d(c0551a.f1639b, 12, false, Color.parseColor("#666666")));
        List list = c0551a.f1641d;
        ArrayList<C0564n> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C0564n) obj).f1670c != EnumC0563m.f1664a) {
                arrayList.add(obj);
            }
        }
        linearLayout.addView(m2150d("正常 " + c0551a.m1359c() + " · 需关注 " + c0551a.m1360d() + " · 不适配 " + c0551a.m1358b(), 13, true, Color.parseColor("#336940")));
        linearLayout.addView(m2149c(4));
        linearLayout.addView(m2150d(arrayList.isEmpty() ? "当前版本命中全部已知适配点，可直接使用。" : "以下仅展示需关注或不适配的项目；未列出的功能默认按正常处理。", 12, false, Color.parseColor("#666666")));
        linearLayout.addView(m2149c(10));
        if (!arrayList.isEmpty()) {
            ScrollView scrollView = new ScrollView(activity);
            scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, m2148b(220)));
            LinearLayout linearLayout2 = new LinearLayout(activity);
            linearLayout2.setOrientation(1);
            for (C0564n c0564n : arrayList) {
                int iOrdinal = c0564n.f1670c.ordinal();
                if (iOrdinal == 0) {
                    str = "✓";
                } else if (iOrdinal == 1) {
                    str = "!";
                } else {
                    if (iOrdinal != 2) {
                        throw new C0137c();
                    }
                    str = "×";
                }
                int iOrdinal2 = c0564n.f1670c.ordinal();
                if (iOrdinal2 == 0) {
                    color = Color.parseColor("#2E7D32");
                } else if (iOrdinal2 == 1) {
                    color = Color.parseColor("#F9A825");
                } else {
                    if (iOrdinal2 != 2) {
                        throw new C0137c();
                    }
                    color = Color.parseColor("#C62828");
                }
                TextView textViewM2150d = m2150d(str + "  " + c0564n.f1669b + "  ·  " + c0564n.f1671d, 12, false, color);
                textViewM2150d.setPadding(0, m2148b(4), 0, m2148b(4));
                linearLayout2.addView(textViewM2150d);
            }
            scrollView.addView(linearLayout2);
            linearLayout.addView(scrollView);
            linearLayout.addView(m2149c(12));
        }
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(8388613);
        final int i2 = 0;
        linearLayout3.addView(m2147a("复制报告", new InterfaceC0275a(this) { // from class: f0.f

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ DialogC0827g f2991b;

            {
                this.f2991b = this;
            }

            @Override // p029P0.InterfaceC0275a
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        DialogC0827g dialogC0827g = this.f2991b;
                        AbstractC0307g.m703e(dialogC0827g, "this$0");
                        StringBuilder sb = new StringBuilder();
                        C0551a c0551a2 = dialogC0827g.f2999b;
                        sb.append(c0551a2.f1639b);
                        sb.append('\n');
                        sb.append(c0551a2.m1361e());
                        sb.append('\n');
                        for (C0564n c0564n2 : c0551a2.f1641d) {
                            sb.append(c0564n2.f1670c + "\t" + c0564n2.f1669b + "\t" + c0564n2.f1671d);
                            sb.append('\n');
                        }
                        String string = sb.toString();
                        AbstractC0307g.m702d(string, "toString(...)");
                        Activity activity2 = dialogC0827g.f2998a;
                        Object systemService = activity2.getSystemService("clipboard");
                        AbstractC0307g.m701c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("OKK-compat", string));
                        Toast.makeText(activity2, "已复制", 0).show();
                        break;
                    default:
                        DialogC0827g dialogC0827g2 = this.f2991b;
                        AbstractC0307g.m703e(dialogC0827g2, "this$0");
                        dialogC0827g2.dismiss();
                        break;
                }
                return C0146l.f339a;
            }
        }));
        linearLayout3.addView(m2149c(8));
        final int i3 = 1;
        linearLayout3.addView(m2147a("完成", new InterfaceC0275a(this) { // from class: f0.f

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ DialogC0827g f2991b;

            {
                this.f2991b = this;
            }

            @Override // p029P0.InterfaceC0275a
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        DialogC0827g dialogC0827g = this.f2991b;
                        AbstractC0307g.m703e(dialogC0827g, "this$0");
                        StringBuilder sb = new StringBuilder();
                        C0551a c0551a2 = dialogC0827g.f2999b;
                        sb.append(c0551a2.f1639b);
                        sb.append('\n');
                        sb.append(c0551a2.m1361e());
                        sb.append('\n');
                        for (C0564n c0564n2 : c0551a2.f1641d) {
                            sb.append(c0564n2.f1670c + "\t" + c0564n2.f1669b + "\t" + c0564n2.f1671d);
                            sb.append('\n');
                        }
                        String string = sb.toString();
                        AbstractC0307g.m702d(string, "toString(...)");
                        Activity activity2 = dialogC0827g.f2998a;
                        Object systemService = activity2.getSystemService("clipboard");
                        AbstractC0307g.m701c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("OKK-compat", string));
                        Toast.makeText(activity2, "已复制", 0).show();
                        break;
                    default:
                        DialogC0827g dialogC0827g2 = this.f2991b;
                        AbstractC0307g.m703e(dialogC0827g2, "this$0");
                        dialogC0827g2.dismiss();
                        break;
                }
                return C0146l.f339a;
            }
        }));
        linearLayout.addView(linearLayout3);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setPadding(m2148b(24), m2148b(24), m2148b(24), m2148b(24));
        frameLayout.addView(linearLayout);
        setContentView(frameLayout);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.transparent);
        }
    }
}

package p069i;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.p055lu.wxmask272.R;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.DialogInterfaceOnClickListenerC0046s;
import p003B0.AbstractC0055a;
import p027N0.AbstractC0223g;
import p052b1.AbstractC0503h;
import p069i.C0709q1;
import p088s0.C0980b;
import p088s0.C0984f;
import p088s0.C0985g;
import p090t0.C1010e;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: i.q1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0709q1 {

    /* JADX INFO: renamed from: a */
    public final View f2395a;

    /* JADX INFO: renamed from: b */
    public final Object f2396b;

    /* JADX INFO: renamed from: c */
    public final Object f2397c;

    /* JADX INFO: renamed from: d */
    public final Object f2398d;

    /* JADX INFO: renamed from: e */
    public final Object f2399e;

    /* JADX INFO: renamed from: f */
    public final Object f2400f;

    /* JADX INFO: renamed from: g */
    public final Object f2401g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0709q1(Activity activity) {
        final int i2 = 1;
        final int i3 = 0;
        AbstractC0223g.m418e(activity, "context");
        this.f2396b = activity;
        this.f2399e = Executors.newFixedThreadPool(3);
        this.f2400f = new C0984f(6291456, i3);
        this.f2401g = new AtomicBoolean(false);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(AbstractC0503h.m974J(activity).f3501d);
        gradientDrawable.setCornerRadius(AbstractC0055a.m100a(22.0f));
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setClipToOutline(true);
        FrameLayout frameLayout = new FrameLayout(activity);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(72));
        layoutParams.gravity = 16;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setPadding(AbstractC0055a.m101b(24), 0, AbstractC0055a.m101b(24), 0);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(AbstractC0503h.m974J(activity).f3499b);
        gradientDrawable2.setCornerRadii(new float[]{AbstractC0055a.m100a(22.0f), AbstractC0055a.m100a(22.0f), AbstractC0055a.m100a(22.0f), AbstractC0055a.m100a(22.0f), 0.0f, 0.0f, 0.0f, 0.0f});
        frameLayout.setBackground(gradientDrawable2);
        TextView textView = new TextView(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(AbstractC0055a.m101b(48), -1);
        layoutParams2.gravity = 8388611;
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setText("‹");
        textView.setTextColor(AbstractC0503h.m974J(activity).f3503f);
        textView.setTextSize(2, 32.0f);
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: s0.c

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C0709q1 f3516c;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f3516c = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        C0709q1 c0709q1 = this.f3516c;
                        ((C1010e) c0709q1.f2395a).mo2182a();
                        if (((AtomicBoolean) c0709q1.f2401g).compareAndSet(false, true)) {
                            ((ExecutorService) c0709q1.f2399e).shutdownNow();
                            ((C0984f) c0709q1.f2400f).evictAll();
                            return;
                        }
                        return;
                    default:
                        C0709q1 c0709q12 = this.f3516c;
                        C0985g c0985g = (C0985g) c0709q12.f2397c;
                        if (c0985g == null) {
                            AbstractC0223g.m420g("listAdapter");
                            throw null;
                        }
                        C0990l c0990l = new C0990l((Activity) c0709q12.f2396b, c0985g.f2596b, "选择联系人", "添加");
                        c0990l.f3560m = new C0980b(c0709q12, 1);
                        c0990l.m2198h();
                        return;
                }
            }
        });
        frameLayout.addView(textView);
        TextView textView2 = new TextView(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        textView2.setLayoutParams(layoutParams3);
        textView2.setText("名单管理");
        textView2.setTextColor(AbstractC0503h.m974J(activity).f3503f);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        textView2.setTextSize(2, 20.0f);
        frameLayout.addView(textView2);
        TextView textView3 = new TextView(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(AbstractC0055a.m101b(72), AbstractC0055a.m101b(40));
        layoutParams4.gravity = 8388629;
        textView3.setLayoutParams(layoutParams4);
        textView3.setGravity(17);
        textView3.setText("添加");
        AbstractC0503h.m974J(activity);
        textView3.setTextColor(-15292005);
        textView3.setTypeface(typeface);
        textView3.setTextSize(2, 16.0f);
        AbstractC0503h.m974J(activity);
        textView3.setBackground(m1343b(this, Color.argb(30, Color.red(-15292005), Color.green(-15292005), Color.blue(-15292005)), AbstractC0055a.m101b(18)));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: s0.c

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C0709q1 f3516c;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f3516c = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        C0709q1 c0709q1 = this.f3516c;
                        ((C1010e) c0709q1.f2395a).mo2182a();
                        if (((AtomicBoolean) c0709q1.f2401g).compareAndSet(false, true)) {
                            ((ExecutorService) c0709q1.f2399e).shutdownNow();
                            ((C0984f) c0709q1.f2400f).evictAll();
                            return;
                        }
                        return;
                    default:
                        C0709q1 c0709q12 = this.f3516c;
                        C0985g c0985g = (C0985g) c0709q12.f2397c;
                        if (c0985g == null) {
                            AbstractC0223g.m420g("listAdapter");
                            throw null;
                        }
                        C0990l c0990l = new C0990l((Activity) c0709q12.f2396b, c0985g.f2596b, "选择联系人", "添加");
                        c0990l.f3560m = new C0980b(c0709q12, 1);
                        c0990l.m2198h();
                        return;
                }
            }
        });
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        float f = 4;
        gradientDrawable3.setCornerRadius(f);
        gradientDrawable3.setShape(0);
        gradientDrawable3.setColor(0);
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setColor(ColorStateList.valueOf(-1));
        gradientDrawable4.setShape(0);
        gradientDrawable4.setCornerRadius(f);
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(866822826), gradientDrawable3, gradientDrawable4);
        textView3.setClickable(true);
        textView3.setBackground(rippleDrawable);
        frameLayout.addView(textView3);
        linearLayout.addView(frameLayout);
        this.f2397c = new C0985g(this);
        ListView listView = new ListView(activity);
        this.f2398d = listView;
        listView.setVerticalScrollBarEnabled(false);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams5.weight = 1.0f;
        listView.setLayoutParams(layoutParams5);
        listView.setPadding(0, AbstractC0055a.m101b(8), 0, AbstractC0055a.m101b(12));
        listView.setBackgroundColor(AbstractC0503h.m974J(activity).f3501d);
        listView.setDivider(new ColorDrawable(AbstractC0503h.m974J(activity).f3506i));
        listView.setDividerHeight(AbstractC0055a.m101b(1));
        listView.setSelector(new ColorDrawable(0));
        C0985g c0985g = (C0985g) this.f2397c;
        if (c0985g == null) {
            AbstractC0223g.m420g("listAdapter");
            throw null;
        }
        listView.setAdapter((ListAdapter) c0985g);
        linearLayout.addView(listView);
        C1010e c1010e = new C1010e(linearLayout);
        this.f2395a = c1010e;
        ListView listView2 = (ListView) this.f2398d;
        if (listView2 == null) {
            AbstractC0223g.m420g("listView");
            throw null;
        }
        c1010e.setNeedScrollChild(listView2);
        c1010e.setOnDismissListener(new C0980b(this, i3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m1342a(final C0709q1 c0709q1, final int i2) {
        if (i2 < 0) {
            c0709q1.getClass();
            return;
        }
        C0985g c0985g = (C0985g) c0709q1.f2397c;
        if (c0985g == null) {
            AbstractC0223g.m420g("listAdapter");
            throw null;
        }
        if (i2 >= c0985g.f2596b.size()) {
            return;
        }
        new AlertDialog.Builder((Activity) c0709q1.f2396b).setTitle("是否删除？").setMessage("删除后该好友会从隐藏名单中移除。").setNegativeButton("确定", new DialogInterface.OnClickListener() { // from class: s0.d
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                C0709q1 c0709q12 = this.f3517b;
                C0985g c0985g2 = (C0985g) c0709q12.f2397c;
                if (c0985g2 == null) {
                    AbstractC0223g.m420g("listAdapter");
                    throw null;
                }
                c0985g2.f2596b.remove(i2);
                boolean z2 = AbstractC1126i.f3786a;
                C0985g c0985g3 = (C0985g) c0709q12.f2397c;
                if (c0985g3 == null) {
                    AbstractC0223g.m420g("listAdapter");
                    throw null;
                }
                C1124g.m2423N(c0985g3.f2596b);
                C0985g c0985g4 = (C0985g) c0709q12.f2397c;
                if (c0985g4 != null) {
                    c0985g4.notifyDataSetChanged();
                } else {
                    AbstractC0223g.m420g("listAdapter");
                    throw null;
                }
            }
        }).setNeutralButton("取消", new DialogInterfaceOnClickListenerC0046s(2)).show();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static GradientDrawable m1343b(C0709q1 c0709q1, int i2, int i3) {
        AbstractC0055a.m101b(1);
        c0709q1.getClass();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i2);
        gradientDrawable.setCornerRadius(i3);
        return gradientDrawable;
    }

    public C0709q1(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.f2396b = imageView;
        this.f2395a = textView;
        this.f2397c = textView2;
        this.f2398d = textView3;
        this.f2399e = textView4;
        this.f2400f = textView5;
        this.f2401g = textView6;
    }

    public C0709q1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f2398d = layoutParams;
        this.f2399e = new Rect();
        this.f2400f = new int[2];
        this.f2401g = new int[2];
        this.f2396b = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f2397c = viewInflate;
        this.f2395a = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(C0709q1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}

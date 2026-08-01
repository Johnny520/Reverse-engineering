package p088s0;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.activity.RunnableC0371b;
import com.p055lu.wxmask.bean.MaskItemBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.C0017Q;
import p001A0.C0033f;
import p003B0.AbstractC0055a;
import p004C.C0060d;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p069i.C0642R0;
import p077m0.ViewOnClickListenerC0770h;
import p084q0.DialogInterfaceOnClickListenerC0802b;
import p090t0.C1010e;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1129l;
import p102z0.C1124g;

/* JADX INFO: renamed from: s0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0990l {

    /* JADX INFO: renamed from: a */
    public final Activity f3548a;

    /* JADX INFO: renamed from: b */
    public final String f3549b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f3550c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f3551d;

    /* JADX INFO: renamed from: e */
    public final ExecutorService f3552e;

    /* JADX INFO: renamed from: f */
    public final ExecutorService f3553f;

    /* JADX INFO: renamed from: g */
    public final C0984f f3554g;

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f3555h;

    /* JADX INFO: renamed from: i */
    public final C0985g f3556i;

    /* JADX INFO: renamed from: j */
    public final ListView f3557j;

    /* JADX INFO: renamed from: k */
    public final EditText f3558k;

    /* JADX INFO: renamed from: l */
    public final TextView f3559l;

    /* JADX INFO: renamed from: m */
    public C0980b f3560m;

    /* JADX INFO: renamed from: n */
    public C0060d f3561n;

    /* JADX INFO: renamed from: o */
    public final C1010e f3562o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0990l(Activity activity, List list, String str, String str2) {
        int i2 = 2;
        AbstractC0223g.m418e(activity, "context");
        AbstractC0223g.m418e(list, "selectedItems");
        this.f3548a = activity;
        this.f3549b = str2;
        this.f3550c = new LinkedHashMap();
        this.f3551d = new ArrayList();
        this.f3552e = Executors.newSingleThreadExecutor();
        this.f3553f = Executors.newFixedThreadPool(3);
        this.f3554g = new C0984f(8388608, 1);
        this.f3555h = new AtomicBoolean(false);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MaskItemBean maskItemBean = (MaskItemBean) it.next();
            if (!AbstractC0307q.m534d0(maskItemBean.getMaskId())) {
                this.f3550c.put(maskItemBean.getMaskId(), maskItemBean);
            }
        }
        Activity activity2 = this.f3548a;
        LinearLayout linearLayout = new LinearLayout(activity2);
        linearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setBackground(m2195g(this, AbstractC0503h.m974J(this.f3548a).f3501d, AbstractC0055a.m101b(22), null));
        linearLayout.setClipToOutline(true);
        FrameLayout frameLayout = new FrameLayout(activity2);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(72)));
        frameLayout.setPadding(AbstractC0055a.m101b(24), 0, AbstractC0055a.m101b(24), 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(AbstractC0503h.m974J(this.f3548a).f3499b);
        gradientDrawable.setCornerRadii(new float[]{AbstractC0055a.m100a(22.0f), AbstractC0055a.m100a(22.0f), AbstractC0055a.m100a(22.0f), AbstractC0055a.m100a(22.0f), 0.0f, 0.0f, 0.0f, 0.0f});
        frameLayout.setBackground(gradientDrawable);
        TextView textView = new TextView(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC0055a.m101b(48), -1);
        layoutParams.gravity = 8388611;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        textView.setText("‹");
        textView.setTextColor(AbstractC0503h.m974J(this.f3548a).f3503f);
        textView.setTextSize(2, 32.0f);
        textView.setOnClickListener(new ViewOnClickListenerC0770h(i2, this));
        frameLayout.addView(textView);
        TextView textView2 = new TextView(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        textView2.setLayoutParams(layoutParams2);
        textView2.setText("选择联系人");
        textView2.setTextColor(AbstractC0503h.m974J(this.f3548a).f3503f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setTextSize(2, 20.0f);
        frameLayout.addView(textView2);
        linearLayout.addView(frameLayout);
        EditText editText = new EditText(activity2);
        this.f3558k = editText;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(42));
        layoutParams3.setMargins(AbstractC0055a.m101b(20), AbstractC0055a.m101b(14), AbstractC0055a.m101b(20), AbstractC0055a.m101b(8));
        editText.setLayoutParams(layoutParams3);
        editText.setSingleLine(true);
        editText.setHint("搜索备注、昵称、微信ID");
        editText.setHintTextColor(AbstractC0503h.m974J(this.f3548a).f3504g);
        editText.setTextColor(AbstractC0503h.m974J(this.f3548a).f3503f);
        editText.setTextSize(2, 14.0f);
        editText.setImeOptions(3);
        editText.setPadding(AbstractC0055a.m101b(16), 0, AbstractC0055a.m101b(16), 0);
        editText.setBackground(m2195g(this, AbstractC0503h.m974J(this.f3548a).f3502e, AbstractC0055a.m101b(18), Integer.valueOf(AbstractC0503h.m974J(this.f3548a).f3506i)));
        editText.addTextChangedListener(new C0642R0(1, this));
        linearLayout.addView(editText);
        this.f3556i = new C0985g(this);
        FrameLayout frameLayout2 = new FrameLayout(activity2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams4.weight = 1.0f;
        frameLayout2.setLayoutParams(layoutParams4);
        frameLayout2.setBackgroundColor(AbstractC0503h.m974J(this.f3548a).f3501d);
        ListView listView = new ListView(frameLayout2.getContext());
        this.f3557j = listView;
        listView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        listView.setVerticalScrollBarEnabled(false);
        listView.setPadding(0, AbstractC0055a.m101b(4), 0, AbstractC0055a.m101b(12));
        listView.setBackgroundColor(AbstractC0503h.m974J(this.f3548a).f3501d);
        listView.setDivider(new ColorDrawable(AbstractC0503h.m974J(this.f3548a).f3506i));
        listView.setDividerHeight(AbstractC0055a.m101b(1));
        listView.setSelector(new ColorDrawable(0));
        C0985g c0985g = this.f3556i;
        if (c0985g == null) {
            AbstractC0223g.m420g("listAdapter");
            throw null;
        }
        listView.setAdapter((ListAdapter) c0985g);
        frameLayout2.addView(listView);
        TextView textView3 = new TextView(frameLayout2.getContext());
        this.f3559l = textView3;
        textView3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        textView3.setGravity(17);
        textView3.setText("正在加载联系人...");
        textView3.setTextColor(AbstractC0503h.m974J(this.f3548a).f3504g);
        textView3.setTextSize(2, 14.0f);
        frameLayout2.addView(textView3);
        linearLayout.addView(frameLayout2);
        C1010e c1010e = new C1010e(linearLayout);
        this.f3562o = c1010e;
        ListView listView2 = this.f3557j;
        if (listView2 == null) {
            AbstractC0223g.m420g("listView");
            throw null;
        }
        c1010e.setNeedScrollChild(listView2);
        c1010e.setOnDismissListener(new C0060d(10, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final int m2191a(C0990l c0990l, C0987i c0987i) {
        c0990l.getClass();
        Character chM514l0 = AbstractC0299i.m514l0(m2193e(c0987i));
        if (chM514l0 == null) {
            return 2;
        }
        char cCharValue = chM514l0.charValue();
        if ('a' > cCharValue || cCharValue >= '{') {
            return ('0' > cCharValue || cCharValue >= ':') ? 2 : 1;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m2192b(C0990l c0990l, C0987i c0987i) {
        c0990l.getClass();
        String str = c0987i.f3531a;
        String str2 = c0987i.f3532b;
        String str3 = c0987i.f3539i;
        MaskItemBean maskItemBean = new MaskItemBean(str, str2, 0, null, null, str3, 28, null);
        C0060d c0060d = c0990l.f3561n;
        if (c0060d != null) {
            if (!m2194f(str)) {
                c0990l.f3562o.mo2182a();
                c0990l.m2197d();
                c0060d.mo8c(maskItemBean);
                return;
            } else {
                new AlertDialog.Builder(c0990l.f3548a).setTitle("本地头像").setMessage(str2 + "\n" + str).setNegativeButton("清除", new DialogInterfaceOnClickListenerC0802b(c0987i, c0990l, 3)).setPositiveButton("修改", new DialogInterfaceOnClickListenerC0986h(c0990l, c0060d, maskItemBean, 0)).setNeutralButton("取消", (DialogInterface.OnClickListener) null).show();
                return;
            }
        }
        LinkedHashMap linkedHashMap = c0990l.f3550c;
        if (linkedHashMap.containsKey(str)) {
            return;
        }
        MaskItemBean maskItemBean2 = new MaskItemBean(str, str2, 0, null, null, str3, 28, null);
        linkedHashMap.put(str, maskItemBean2);
        boolean z2 = AbstractC1126i.f3786a;
        Collection collectionValues = linkedHashMap.values();
        AbstractC0223g.m417d(collectionValues, "<get-values>(...)");
        C1124g.m2423N(AbstractC0123k.m281w0(collectionValues));
        C0980b c0980b = c0990l.f3560m;
        if (c0980b != null) {
            c0980b.mo8c(maskItemBean2);
        }
        C0985g c0985g = c0990l.f3556i;
        if (c0985g == null) {
            AbstractC0223g.m420g("listAdapter");
            throw null;
        }
        c0985g.notifyDataSetChanged();
        AbstractC0503h.m978P("已加入隐藏名单");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m2193e(C0987i c0987i) {
        String lowerCase;
        Object next;
        String string;
        Iterator it = AbstractC0120h.m252Z(new String[]{c0987i.f3537g, c0987i.f3538h, c0987i.f3532b, c0987i.f3534d, c0987i.f3531a}).iterator();
        while (true) {
            lowerCase = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!AbstractC0307q.m534d0((String) next)) {
                break;
            }
        }
        String str = (String) next;
        if (str != null && (string = AbstractC0299i.m507C0(str).toString()) != null) {
            Locale locale = Locale.getDefault();
            AbstractC0223g.m417d(locale, "getDefault(...)");
            lowerCase = string.toLowerCase(locale);
            AbstractC0223g.m417d(lowerCase, "toLowerCase(...)");
        }
        return lowerCase == null ? "" : lowerCase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m2194f(String str) {
        return AbstractC1129l.m2454d(str) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static GradientDrawable m2195g(C0990l c0990l, int i2, int i3, Integer num) {
        int iM101b = AbstractC0055a.m101b(1);
        c0990l.getClass();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i2);
        gradientDrawable.setCornerRadius(i3);
        if (num != null) {
            gradientDrawable.setStroke(iM101b, num.intValue());
        }
        return gradientDrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m2196c(String str) {
        ArrayList arrayList;
        String string = AbstractC0299i.m507C0(str).toString();
        Locale locale = Locale.getDefault();
        AbstractC0223g.m417d(locale, "getDefault(...)");
        String lowerCase = string.toLowerCase(locale);
        AbstractC0223g.m417d(lowerCase, "toLowerCase(...)");
        boolean zM534d0 = AbstractC0307q.m534d0(lowerCase);
        ArrayList arrayList2 = this.f3551d;
        if (zM534d0) {
            arrayList = arrayList2;
        } else {
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                C0987i c0987i = (C0987i) obj;
                String str2 = c0987i.f3531a;
                Locale locale2 = Locale.getDefault();
                AbstractC0223g.m417d(locale2, "getDefault(...)");
                String lowerCase2 = str2.toLowerCase(locale2);
                AbstractC0223g.m417d(lowerCase2, "toLowerCase(...)");
                if (!AbstractC0299i.m511i0(lowerCase2, lowerCase, false)) {
                    Locale locale3 = Locale.getDefault();
                    AbstractC0223g.m417d(locale3, "getDefault(...)");
                    String lowerCase3 = c0987i.f3534d.toLowerCase(locale3);
                    AbstractC0223g.m417d(lowerCase3, "toLowerCase(...)");
                    if (!AbstractC0299i.m511i0(lowerCase3, lowerCase, false)) {
                        Locale locale4 = Locale.getDefault();
                        AbstractC0223g.m417d(locale4, "getDefault(...)");
                        String lowerCase4 = c0987i.f3535e.toLowerCase(locale4);
                        AbstractC0223g.m417d(lowerCase4, "toLowerCase(...)");
                        if (!AbstractC0299i.m511i0(lowerCase4, lowerCase, false)) {
                            Locale locale5 = Locale.getDefault();
                            AbstractC0223g.m417d(locale5, "getDefault(...)");
                            String lowerCase5 = c0987i.f3536f.toLowerCase(locale5);
                            AbstractC0223g.m417d(lowerCase5, "toLowerCase(...)");
                            if (!AbstractC0299i.m511i0(lowerCase5, lowerCase, false)) {
                                Locale locale6 = Locale.getDefault();
                                AbstractC0223g.m417d(locale6, "getDefault(...)");
                                String lowerCase6 = c0987i.f3537g.toLowerCase(locale6);
                                AbstractC0223g.m417d(lowerCase6, "toLowerCase(...)");
                                if (!AbstractC0299i.m511i0(lowerCase6, lowerCase, false)) {
                                    Locale locale7 = Locale.getDefault();
                                    AbstractC0223g.m417d(locale7, "getDefault(...)");
                                    String lowerCase7 = c0987i.f3538h.toLowerCase(locale7);
                                    AbstractC0223g.m417d(lowerCase7, "toLowerCase(...)");
                                    if (AbstractC0299i.m511i0(lowerCase7, lowerCase, false)) {
                                    }
                                }
                            }
                        }
                    }
                }
                arrayList.add(obj);
            }
        }
        List listM276r0 = AbstractC0123k.m276r0(arrayList, new C0033f(17, new C0017Q(new C0017Q(new C0989k(this, 0), this, 1), this, 2)));
        C0985g c0985g = this.f3556i;
        if (c0985g == null) {
            AbstractC0223g.m420g("listAdapter");
            throw null;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = c0985g.f2596b;
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList.addAll(listM276r0);
        c0985g.notifyDataSetChanged();
        TextView textView = this.f3559l;
        if (textView == null) {
            AbstractC0223g.m420g("emptyView");
            throw null;
        }
        textView.setVisibility(listM276r0.isEmpty() ? 0 : 8);
        if (listM276r0.isEmpty()) {
            TextView textView2 = this.f3559l;
            if (textView2 == null) {
                AbstractC0223g.m420g("emptyView");
                throw null;
            }
            textView2.setText(arrayList2.isEmpty() ? "未读取到联系人" : "没有匹配联系人");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m2197d() {
        if (this.f3555h.compareAndSet(false, true)) {
            this.f3552e.shutdownNow();
            this.f3553f.shutdownNow();
            this.f3554g.evictAll();
            this.f3560m = null;
            this.f3561n = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m2198h() {
        AtomicBoolean atomicBoolean = this.f3555h;
        if (atomicBoolean.get()) {
            return;
        }
        this.f3562o.m2209g();
        if (atomicBoolean.get()) {
            return;
        }
        TextView textView = this.f3559l;
        if (textView == null) {
            AbstractC0223g.m420g("emptyView");
            throw null;
        }
        textView.setVisibility(0);
        TextView textView2 = this.f3559l;
        if (textView2 == null) {
            AbstractC0223g.m420g("emptyView");
            throw null;
        }
        textView2.setText("正在加载联系人...");
        this.f3552e.execute(new RunnableC0371b(8, this));
    }
}

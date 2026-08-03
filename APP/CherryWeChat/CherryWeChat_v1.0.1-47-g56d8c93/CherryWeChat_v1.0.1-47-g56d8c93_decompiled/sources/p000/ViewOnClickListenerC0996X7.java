package p000;

import android.app.AlertDialog;
import android.app.AndroidAppHelper;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import io.github.cherrywechat.R;
import io.github.cherrywechat.application.MainApplication;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X7 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0996X7 extends HorizontalScrollView implements View.OnClickListener {

    /* JADX INFO: renamed from: f */
    public static final C0867U7 f3170f = new C0867U7(AbstractC0295Gu.m625r(-497009320523829L), R.drawable.ic_panel_reply, AbstractC0295Gu.m625r(-497030795360309L), 0, -1, -1);

    /* JADX INFO: renamed from: g */
    public static final C0867U7 f3171g = new C0867U7(AbstractC0295Gu.m625r(-497172529281077L), R.drawable.ic_panel_pic, AbstractC0295Gu.m625r(-497185414182965L), 1, 0, 0);

    /* JADX INFO: renamed from: h */
    public static final C0867U7 f3172h = new C0867U7(AbstractC0295Gu.m625r(-497868313983029L), R.drawable.ic_panel_camera, AbstractC0295Gu.m625r(-497881198884917L), 2, 1, 0);

    /* JADX INFO: renamed from: i */
    public static final C0867U7 f3173i = new C0867U7(AbstractC0295Gu.m625r(-498027227772981L), R.drawable.ic_panel_voipvoice, AbstractC0295Gu.m625r(-498048702609461L), 3, 2, 0);

    /* JADX INFO: renamed from: j */
    public static final C0867U7 f3174j = new C0867U7(AbstractC0295Gu.m625r(-497657860585525L), R.drawable.ic_panel_location, AbstractC0295Gu.m625r(-497670745487413L), 4, 3, 0);

    /* JADX INFO: renamed from: k */
    public static final C0867U7 f3175k = new C0867U7(AbstractC0295Gu.m625r(-496176096868405L), R.drawable.ic_panel_luckymoney, AbstractC0295Gu.m625r(-496188981770293L), 5, 4, 0);

    /* JADX INFO: renamed from: l */
    public static final C0867U7 f3176l = new C0867U7(AbstractC0295Gu.m625r(-496352190527541L), R.drawable.ic_panel_transfer, AbstractC0295Gu.m625r(-496365075429429L), 6, 6, 0);

    /* JADX INFO: renamed from: m */
    public static final C0867U7 f3177m = new C0867U7(AbstractC0295Gu.m625r(-495969938438197L), R.drawable.ic_panel_fav, AbstractC0295Gu.m625r(-495991413274677L), 7, 2, 1);

    /* JADX INFO: renamed from: n */
    public static final C0867U7 f3178n = new C0867U7(AbstractC0295Gu.m625r(-496124557260853L), R.drawable.ic_panel_file_explorer, AbstractC0295Gu.m625r(-496137442162741L), 8, 0, 1);

    /* JADX INFO: renamed from: a */
    public final View f3179a;

    /* JADX INFO: renamed from: b */
    public final AdapterView.OnItemClickListener f3180b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f3181c;

    /* JADX INFO: renamed from: d */
    public C0953W7 f3182d;

    /* JADX INFO: renamed from: e */
    public final LinearLayout f3183e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ViewOnClickListenerC0996X7(Context context, View view) throws IllegalAccessException {
        super(context);
        AbstractC0295Gu.m625r(-501222683441205L);
        AbstractC0295Gu.m625r(-501257043179573L);
        this.f3179a = view;
        String strM625r = AbstractC0295Gu.m625r(-501304287819829L);
        AbstractC0295Gu.m625r(-579464102672437L);
        int i = AbstractC1450gG.f5067a;
        int i2 = 11;
        C2428qs c2428qs = new C2428qs(11, AbstractC1406fG.m2718r0(strM625r));
        c2428qs.m4886x(Context.class, AttributeSet.class);
        Object objM4885w = c2428qs.m4885w(view.getContext(), null);
        C2648vx c2648vx = new C2648vx();
        c2648vx.f9164c = view;
        c2648vx.f9163b = view.getClass();
        c2648vx.m5182e(AbstractC0295Gu.m625r(-500930625665077L));
        Object objM5178a = c2648vx.m5178a();
        Field[] fields = objM5178a.getClass().getFields();
        AbstractC0295Gu.m625r(-499461746849845L);
        for (Field field : fields) {
            if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE) && !Modifier.isFinal(field.getModifiers()) && AbstractC0585Nj.m1134a(field.get(objM5178a), 0)) {
                field.set(objM5178a, 4);
            }
        }
        int i3 = AbstractC1450gG.f5067a;
        Field[] fields2 = AbstractC1406fG.m2718r0(AbstractC0295Gu.m625r(-499526171359285L)).getFields();
        AbstractC0295Gu.m625r(-499702265018421L);
        int length = fields2.length;
        int i4 = 0;
        while (i4 < length) {
            Field field2 = fields2[i4];
            Class<?> type = field2.getType();
            if (type.isInterface()) {
                String name = type.getName();
                AbstractC0295Gu.m625r(-499216933713973L);
                if (!AbstractC2564tz.m5051L(name, AbstractC0295Gu.m625r(-499272768288821L), false)) {
                    C2648vx c2648vx2 = new C2648vx();
                    if (objM5178a instanceof Class) {
                        c2648vx2.f9163b = (Class) objM5178a;
                    } else {
                        c2648vx2.f9164c = objM5178a;
                        c2648vx2.f9163b = objM5178a.getClass();
                    }
                    c2648vx2.f9165d = type;
                    field2.set(objM4885w, c2648vx2.m5178a());
                } else if (AbstractC0585Nj.m1134a(type.getSuperclass(), BaseAdapter.class)) {
                    AbstractC0295Gu.m625r(-579988088682549L);
                    C2428qs c2428qs2 = new C2428qs(i2, type);
                    c2428qs2.m4886x(AbstractC0295Gu.m625r(-499307128027189L), Context.class, List.class, Map.class, ArrayList.class);
                    field2.set(objM4885w, c2428qs2.m4885w(objM4885w, view.getContext(), new ArrayList(), new HashMap(), new ArrayList()));
                }
            }
            i4++;
            i2 = 11;
        }
        C2648vx c2648vx3 = new C2648vx();
        if (objM4885w instanceof Class) {
            c2648vx3.f9163b = (Class) objM4885w;
        } else {
            c2648vx3.f9164c = objM4885w;
            c2648vx3.f9163b = objM4885w != null ? objM4885w.getClass() : null;
        }
        c2648vx3.f9165d = SharedPreferences.class;
        Context contextCurrentApplication = MainApplication.f5549a;
        if (contextCurrentApplication == null && (contextCurrentApplication = C1456gf.f5172p) == null) {
            contextCurrentApplication = AndroidAppHelper.currentApplication();
            AbstractC0295Gu.m625r(-836852902787125L);
        }
        String str = contextCurrentApplication.getApplicationInfo().packageName;
        AbstractC0295Gu.m625r(-837656061671477L);
        c2648vx3.m5181d(context.getSharedPreferences(str.concat(AbstractC0295Gu.m625r(-500032977500213L)), 0));
        AbstractC0295Gu.m625r(-500088812075061L);
        View view2 = (View) objM4885w;
        C2648vx c2648vx4 = new C2648vx();
        c2648vx4.f9164c = view2;
        c2648vx4.f9163b = view2 != null ? view2.getClass() : null;
        c2648vx4.f9165d = AdapterView.OnItemClickListener.class;
        this.f3180b = (AdapterView.OnItemClickListener) c2648vx4.m5178a();
        this.f3181c = new ArrayList();
        setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        new LinearLayout(context).setOrientation(0);
        this.f3183e = linearLayout;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AbstractC0295Gu.m616i(30));
        layoutParams.gravity = 16;
        addView(linearLayout, layoutParams);
        m1890c();
        m1889b();
        AbstractC0828TB.f2613e = this;
    }

    public static final ArrayList<C0867U7> getAllAppPanelData() {
        return AbstractC0295Gu.m619l();
    }

    private final Object getAppPanelListener() {
        C2648vx c2648vx = new C2648vx();
        View view = this.f3179a;
        c2648vx.f9164c = view;
        c2648vx.f9163b = view != null ? view.getClass() : null;
        c2648vx.m5182e(AbstractC0295Gu.m625r(-499118149466165L));
        Object objM5178a = c2648vx.m5178a();
        C2648vx c2648vx2 = new C2648vx();
        if (objM5178a instanceof Class) {
            c2648vx2.f9163b = (Class) objM5178a;
        } else {
            c2648vx2.f9164c = objM5178a;
            c2648vx2.f9163b = objM5178a != null ? objM5178a.getClass() : null;
        }
        String strM625r = AbstractC0295Gu.m625r(-498748782278709L);
        AbstractC0295Gu.m625r(-578300166535221L);
        int i = AbstractC1450gG.f5067a;
        C1538iG c1538iG = new C1538iG(AbstractC1406fG.m2718r0(strM625r));
        c1538iG.m2921f(AbstractC0295Gu.m625r(-497279903463477L));
        c2648vx2.f9165d = c1538iG.m2920e().getParameterTypes()[0];
        return c2648vx2.m5178a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getCurrentWxId() {
        Object tag = this.f3179a.getTag(R.id.tag_chat_foot_userName);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (p000.C0183EA.m374b().f232j == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int getItemBgColor() {
        HashMap map = AbstractC0999XA.f3193a;
        int iM2889a = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-498405184895029L));
        if (C1517hw.m2895h()) {
            if (iM2889a != 0) {
                C0183EA.f539a.getClass();
            }
            C0183EA.f539a.getClass();
            return C0183EA.m373a().equals(AbstractC0295Gu.m625r(-498512559077429L)) ? -15066598 : 268435456;
        }
        if (iM2889a == 0) {
            return -1;
        }
        return iM2889a;
    }

    /* JADX INFO: renamed from: b */
    public final void m1889b() {
        List listSingletonList;
        Collection collectionM4905o0;
        ArrayList arrayList = this.f3181c;
        arrayList.clear();
        String string = AbstractC0599Nx.f1939a.getString(AbstractC0295Gu.m625r(-839013271337013L), AbstractC0295Gu.m625r(-839133530421301L));
        Pattern patternCompile = Pattern.compile(AbstractC0295Gu.m625r(-499775279462453L));
        AbstractC2564tz.m5063X(0);
        Matcher matcher = patternCompile.matcher(string);
        if (matcher.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList2.add(string.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList2.add(string.subSequence(iEnd, string.length()).toString());
            listSingletonList = arrayList2;
        } else {
            listSingletonList = Collections.singletonList(string.toString());
        }
        if (listSingletonList.isEmpty()) {
            collectionM4905o0 = C0452Kf.f1484a;
        } else {
            ListIterator listIterator = listSingletonList.listIterator(listSingletonList.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collectionM4905o0 = AbstractC2453ra.m4905o0(listIterator.nextIndex() + 1, listSingletonList);
                    break;
                }
            }
            collectionM4905o0 = C0452Kf.f1484a;
        }
        arrayList.addAll(Arrays.asList(collectionM4905o0.toArray(new String[0])));
        C0953W7 c0953w7 = this.f3182d;
        if (c0953w7 != null) {
            c0953w7.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1890c() {
        List listSingletonList;
        Collection collectionM4905o0;
        C0867U7 c0867u7;
        LinearLayout.LayoutParams layoutParams;
        LinearLayout linearLayout = this.f3183e;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        String string = AbstractC0599Nx.f1939a.getString(AbstractC0295Gu.m625r(-839416998262837L), AbstractC0295Gu.m625r(-838935961925685L));
        Pattern patternCompile = Pattern.compile(AbstractC0295Gu.m625r(-500526898739253L));
        AbstractC2564tz.m5063X(0);
        Matcher matcher = patternCompile.matcher(string);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(string.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(string.subSequence(iEnd, string.length()).toString());
            listSingletonList = arrayList;
        } else {
            listSingletonList = Collections.singletonList(string.toString());
        }
        if (listSingletonList.isEmpty()) {
            collectionM4905o0 = C0452Kf.f1484a;
        } else {
            ListIterator listIterator = listSingletonList.listIterator(listSingletonList.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collectionM4905o0 = AbstractC2453ra.m4905o0(listIterator.nextIndex() + 1, listSingletonList);
                    break;
                }
            }
            collectionM4905o0 = C0452Kf.f1484a;
        }
        String[] strArr = (String[]) collectionM4905o0.toArray(new String[0]);
        int i = 8;
        if (strArr.length == 0) {
            setVisibility(8);
            return;
        }
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            switch (Integer.parseInt(strArr[i2])) {
                case 0:
                    c0867u7 = f3170f;
                    break;
                case 1:
                    c0867u7 = f3171g;
                    break;
                case 2:
                    c0867u7 = f3172h;
                    break;
                case 3:
                    c0867u7 = f3173i;
                    break;
                case 4:
                    c0867u7 = f3174j;
                    break;
                case 5:
                    c0867u7 = f3175k;
                    break;
                case 6:
                    c0867u7 = f3176l;
                    break;
                case 7:
                    c0867u7 = f3177m;
                    break;
                default:
                    c0867u7 = f3178n;
                    break;
            }
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            Integer numValueOf = Integer.valueOf(i);
            linearLayout2.setPadding(AbstractC0295Gu.m616i(numValueOf), 0, AbstractC0295Gu.m616i(numValueOf), 0);
            linearLayout2.setMinimumHeight(AbstractC0295Gu.m616i(30));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(getItemBgColor());
            gradientDrawable.setCornerRadius(10.0f);
            linearLayout2.setBackground(gradientDrawable);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.setMargins(AbstractC0295Gu.m616i(5), AbstractC0295Gu.m616i(3), AbstractC0295Gu.m616i(5), AbstractC0295Gu.m616i(3));
            linearLayout2.setLayoutParams(layoutParams2);
            ImageView imageView = new ImageView(linearLayout2.getContext());
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            HashMap map = AbstractC0999XA.f3193a;
            Drawable drawableM2890b = C1517hw.m2890b(c0867u7.f2739c);
            if (drawableM2890b != null) {
                imageView.setImageDrawable(drawableM2890b);
                layoutParams = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(25), AbstractC0295Gu.m616i(25));
            } else {
                imageView.setImageResource(c0867u7.f2738b);
                int iM2889a = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-499796754298933L));
                if (iM2889a != 0) {
                    imageView.setColorFilter(iM2889a);
                }
                layoutParams = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(15), AbstractC0295Gu.m616i(15));
            }
            layoutParams.gravity = 16;
            linearLayout2.addView(imageView, layoutParams);
            TextView textView = new TextView(linearLayout2.getContext());
            int iM2889a2 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-499891243579445L));
            if (iM2889a2 != 0) {
                textView.setTextColor(iM2889a2);
            } else {
                Context context = textView.getContext();
                AbstractC0295Gu.m625r(-499985732859957L);
                textView.setTextColor(C1517hw.m2894f(context) ? -1 : -16777216);
            }
            textView.setText(c0867u7.f2737a);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 16;
            layoutParams3.setMarginStart(AbstractC0295Gu.m616i(5));
            linearLayout2.addView(textView, layoutParams3);
            linearLayout2.setTag(c0867u7);
            linearLayout2.setOnClickListener(this);
            linearLayout.addView(linearLayout2);
            i2++;
            i = 8;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, InvocationTargetException {
        AbstractC0295Gu.m625r(-498521149012021L);
        Object tag = view.getTag();
        AbstractC0295Gu.m625r(-498529738946613L);
        C0867U7 c0867u7 = (C0867U7) tag;
        int i = c0867u7.f2740d;
        if (i == f3177m.f2740d) {
            C1214bG c1214bG = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-819045968377909L));
            Object obj = c1214bG != null ? c1214bG.f4146a : null;
            (obj instanceof Method ? (Method) obj : null).invoke(getAppPanelListener(), null);
            return;
        }
        if (i == f3178n.f2740d) {
            LinkedHashMap linkedHashMap = AbstractC1257cG.f4258a;
            C1214bG c1214bG2 = (C1214bG) linkedHashMap.get(AbstractC0295Gu.m625r(-818620766615605L));
            Object obj2 = c1214bG2 != null ? c1214bG2.f4146a : null;
            Method method = obj2 instanceof Method ? (Method) obj2 : null;
            Object appPanelListener = getAppPanelListener();
            C2648vx c2648vx = new C2648vx();
            if (appPanelListener instanceof Class) {
                c2648vx.f9163b = (Class) appPanelListener;
            } else {
                c2648vx.f9164c = appPanelListener;
                c2648vx.f9163b = appPanelListener != null ? appPanelListener.getClass() : null;
            }
            C1214bG c1214bG3 = (C1214bG) linkedHashMap.get(AbstractC0295Gu.m625r(-818620766615605L));
            Object obj3 = c1214bG3 != null ? c1214bG3.f4146a : null;
            c2648vx.f9165d = (obj3 instanceof Method ? (Method) obj3 : null).getDeclaringClass();
            method.invoke(c2648vx.m5178a(), null);
            return;
        }
        if (i != f3170f.f2740d) {
            String currentWxId = getCurrentWxId();
            if (currentWxId == null || currentWxId.length() == 0) {
                return;
            }
            boolean zEquals = currentWxId.equals(AbstractC0295Gu.m625r(-498959235676213L));
            AdapterView.OnItemClickListener onItemClickListener = this.f3180b;
            C0867U7 c0867u72 = f3174j;
            C0867U7 c0867u73 = f3176l;
            C0867U7 c0867u74 = f3175k;
            C0867U7 c0867u75 = f3173i;
            if (zEquals) {
                if (i == c0867u75.f2740d || i == c0867u74.f2740d || i == c0867u73.f2740d || i == c0867u72.f2740d) {
                    AbstractC0213Ey.m413k(-499006480316469L, getContext(), 0);
                    return;
                }
            } else if (currentWxId.startsWith(AbstractC0295Gu.m625r(-499053724956725L))) {
                if (i == c0867u75.f2740d || i == c0867u74.f2740d || i == c0867u73.f2740d || i == f3172h.f2740d) {
                    AbstractC0213Ey.m413k(-499070904825909L, getContext(), 0);
                    return;
                } else if (i == c0867u72.f2740d) {
                    if (onItemClickListener != null) {
                        onItemClickListener.onItemClick(null, null, 1, c0867u7.f2742f);
                        return;
                    }
                    return;
                }
            }
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(null, null, c0867u7.f2741e, c0867u7.f2742f);
                return;
            }
            return;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(getContext());
        TextView textView = new TextView(getContext());
        textView.setText(AbstractC0295Gu.m625r(-497365802809397L));
        textView.setTextColor(textView.getContext().getColor(R.color.textTitle));
        textView.setTextSize(18.0f);
        textView.setTypeface(null, 1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(textView, layoutParams);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.ic_panel_add);
        imageView.setColorFilter(imageView.getContext().getColor(R.color.textSummary), PorterDuff.Mode.SRC_IN);
        imageView.setOnClickListener(new ViewOnClickListenerC1477h(2, this));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(AbstractC0295Gu.m616i(30), AbstractC0295Gu.m616i(30));
        layoutParams2.gravity = 21;
        layoutParams2.rightMargin = AbstractC0295Gu.m616i(20);
        frameLayout.addView(imageView, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, AbstractC0295Gu.m616i(10), 0, AbstractC0295Gu.m616i(10));
        linearLayout.addView(frameLayout, layoutParams3);
        C0382Iv c0382Iv = new C0382Iv();
        ListView listView = new ListView(getContext());
        listView.setDividerHeight(0);
        C0953W7 c0953w7 = new C0953W7(this, listView, c0382Iv);
        this.f3182d = c0953w7;
        listView.setAdapter((ListAdapter) c0953w7);
        Context context = getContext();
        AbstractC0295Gu.m625r(-497387277645877L);
        AbstractC0295Gu.m625r(-837063356184629L);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService(AbstractC0295Gu.m625r(-837097715922997L));
        AbstractC0295Gu.m625r(-837127780694069L);
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, displayMetrics.heightPixels / 2);
        layoutParams4.topMargin = AbstractC0295Gu.m616i(10);
        linearLayout.addView(listView, layoutParams4);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(getContext()).setView(linearLayout).setOnDismissListener(new DialogInterfaceOnDismissListenerC0824T7(0, this)).create();
        c0382Iv.f1315a = alertDialogCreate;
        alertDialogCreate.show();
        Window window = ((AlertDialog) c0382Iv.f1315a).getWindow();
        if (window != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(window.getContext().getColor(R.color.colorBackground));
            gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(16));
            window.setBackgroundDrawable(gradientDrawable);
            window.setLayout((int) (((double) window.getContext().getResources().getDisplayMetrics().widthPixels) * 0.85d), -2);
        }
    }
}

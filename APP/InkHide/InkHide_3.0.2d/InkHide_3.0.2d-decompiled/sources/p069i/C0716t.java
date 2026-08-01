package p069i;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.p055lu.wxmask272.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONObject;
import p003B0.AbstractC0055a;
import p009E0.C0104d;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0125m;
import p011F0.AbstractC0134v;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p069i.C0716t;
import p070i0.AbstractC0731a;
import p085r.AbstractC0809a;
import p086r0.C0915k0;
import p086r0.C0917l;
import p086r0.C0920m;
import p086r0.EnumC0923n;
import p088s0.C0985g;
import p088s0.C0993o;
import p090t0.C1010e;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: i.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0716t {

    /* JADX INFO: renamed from: a */
    public final Object f2417a;

    /* JADX INFO: renamed from: b */
    public final Object f2418b;

    /* JADX INFO: renamed from: c */
    public final Object f2419c;

    /* JADX INFO: renamed from: d */
    public final Object f2420d;

    /* JADX INFO: renamed from: e */
    public final Object f2421e;

    /* JADX INFO: renamed from: f */
    public final Object f2422f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0716t(C0915k0 c0915k0, C0915k0 c0915k02, C0915k0 c0915k03, C0915k0 c0915k04, C0915k0 c0915k05) {
        this.f2417a = c0915k0;
        this.f2418b = c0915k02;
        this.f2419c = c0915k03;
        this.f2420d = c0915k04;
        this.f2421e = c0915k05;
        this.f2422f = new HashSet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final int m1348a(C0716t c0716t, String str) {
        c0716t.getClass();
        if (AbstractC0307q.m538h0(str, false, "sns:")) {
            return 0;
        }
        if (AbstractC0307q.m538h0(str, false, "local:")) {
            return 1;
        }
        return AbstractC0307q.m538h0(str, false, "localStr:") ? 2 : 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m1349b(final C0716t c0716t, final int i2) {
        if (i2 < 0) {
            c0716t.getClass();
            return;
        }
        C0985g c0985g = (C0985g) c0716t.f2418b;
        if (c0985g == null) {
            AbstractC0223g.m420g("listAdapter");
            throw null;
        }
        if (i2 >= c0985g.f2596b.size()) {
            return;
        }
        C0985g c0985g2 = (C0985g) c0716t.f2418b;
        if (c0985g2 == null) {
            AbstractC0223g.m420g("listAdapter");
            throw null;
        }
        final C0993o c0993o = (C0993o) c0985g2.f2596b.get(i2);
        if (c0993o == null) {
            return;
        }
        new AlertDialog.Builder((Activity) c0716t.f2417a).setTitle("恢复此条内容？").setMessage("恢复后，这条内容对应的隐藏标识将不再生效。").setNegativeButton("确定", new DialogInterface.OnClickListener() { // from class: s0.n
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                boolean zCommit;
                boolean z2 = AbstractC1126i.f3786a;
                List list = c0993o.f3568a;
                AbstractC0223g.m418e(list, "keys");
                ArrayList arrayList = new ArrayList(AbstractC0125m.m289c0(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC0299i.m507C0((String) it.next()).toString());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!AbstractC0307q.m534d0((String) obj)) {
                        arrayList2.add(obj);
                    }
                }
                Set<String> setM2432h = C1124g.m2432h();
                Iterator it2 = arrayList2.iterator();
                boolean z3 = false;
                while (true) {
                    zCommit = true;
                    if (!it2.hasNext()) {
                        break;
                    } else if (setM2432h.remove((String) it2.next())) {
                        z3 = true;
                    }
                }
                if (z3) {
                    LinkedHashMap linkedHashMapM299d0 = AbstractC0134v.m299d0(C1124g.m2431g());
                    LinkedHashMap linkedHashMapM299d02 = AbstractC0134v.m299d0(C1124g.m2430f());
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        linkedHashMapM299d0.remove((String) it3.next());
                    }
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        String str = (String) linkedHashMapM299d02.remove((String) it4.next());
                        if (str != null) {
                            boolean z4 = AbstractC1126i.f3786a;
                            try {
                                new File(str).delete();
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    SharedPreferences.Editor editorEdit = C1124g.m2438n().edit();
                    boolean z5 = AbstractC1126i.f3786a;
                    zCommit = editorEdit.putStringSet("hidden_self_sns_posts", setM2432h).putString("hidden_self_sns_post_summaries", new JSONObject(linkedHashMapM299d0).toString()).putString("hidden_self_sns_post_images", new JSONObject(linkedHashMapM299d02).toString()).commit();
                    if (zCommit) {
                        C1124g.m2418I();
                    } else {
                        AbstractC0731a.m1387d("removeHiddenSelfSnsPost fail");
                    }
                }
                if (!zCommit) {
                    AbstractC0503h.m978P("恢复失败");
                    return;
                }
                C0716t c0716t2 = c0716t;
                C0985g c0985g3 = (C0985g) c0716t2.f2418b;
                if (c0985g3 == null) {
                    AbstractC0223g.m420g("listAdapter");
                    throw null;
                }
                c0985g3.f2596b.remove(i2);
                C0985g c0985g4 = (C0985g) c0716t2.f2418b;
                if (c0985g4 == null) {
                    AbstractC0223g.m420g("listAdapter");
                    throw null;
                }
                c0985g4.notifyDataSetChanged();
                c0716t2.m1363n();
                AbstractC0503h.m978P("已恢复");
            }
        }).setNeutralButton("取消", (DialogInterface.OnClickListener) null).show();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m1350c(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final void m1351f(int i2, LinkedHashSet linkedHashSet, int i3, int i4) {
        while (i3 < i4) {
            if (i3 >= 0 && i3 < i2) {
                linkedHashSet.add(Integer.valueOf(i3));
            }
            i3++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m1352g(int i2, View view, ArrayList arrayList) {
        if (view != null && i2 <= 3) {
            if (view.getTag() != null) {
                arrayList.add(view);
            }
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null) {
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                m1352g(i2 + 1, viewGroup.getChildAt(i3), arrayList);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static ColorStateList m1353h(Context context, int i2) {
        int iM1299c = AbstractC0670d1.m1299c(context, R.attr.colorControlHighlight);
        int iM1298b = AbstractC0670d1.m1298b(context, R.attr.colorButtonNormal);
        int[] iArr = AbstractC0670d1.f2280b;
        int[] iArr2 = AbstractC0670d1.f2282d;
        int iM1476b = AbstractC0809a.m1476b(iM1299c, i2);
        return new ColorStateList(new int[][]{iArr, iArr2, AbstractC0670d1.f2281c, AbstractC0670d1.f2284f}, new int[]{iM1298b, iM1476b, AbstractC0809a.m1476b(iM1299c, i2), i2});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:5:0x000c) to fix multi-entry loop: BACK_EDGE: B:5:0x000c -> B:6:0x000d */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x000d, code lost:
    
        r4 = null;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static View m1354i(View view) {
        View view2;
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
            while (view2 != null) {
                for (Class<?> superclass = view2.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    if (superclass.getName().equals("androidx.recyclerview.widget.RecyclerView") || superclass.getName().equals("android.support.v7.widget.RecyclerView") || superclass.getName().endsWith(".RecyclerView") || superclass.getName().endsWith(".WxRecyclerView")) {
                        return view2;
                    }
                }
                Object parent2 = view2.getParent();
                if (parent2 instanceof View) {
                    view2 = (View) parent2;
                }
            }
            return null;
        }
        view2 = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static LayerDrawable m1355j(C0635N0 c0635n0, Context context, int i2) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
        Drawable drawableM1254c = c0635n0.m1254c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableM1254c2 = c0635n0.m1254c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableM1254c instanceof BitmapDrawable) && drawableM1254c.getIntrinsicWidth() == dimensionPixelSize && drawableM1254c.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM1254c;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM1254c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM1254c.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM1254c2 instanceof BitmapDrawable) && drawableM1254c2.getIntrinsicWidth() == dimensionPixelSize && drawableM1254c2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM1254c2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM1254c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM1254c2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static boolean m1356m(String str) {
        String string = AbstractC0299i.m507C0(str).toString();
        Pattern patternCompile = Pattern.compile("\\d+");
        AbstractC0223g.m417d(patternCompile, "compile(...)");
        AbstractC0223g.m418e(string, "input");
        if (patternCompile.matcher(string).matches()) {
            return true;
        }
        Pattern patternCompile2 = Pattern.compile("[0-9a-fA-F]{8,}");
        AbstractC0223g.m417d(patternCompile2, "compile(...)");
        return patternCompile2.matcher(string).matches() || AbstractC0307q.m538h0(string, false, "sns:") || AbstractC0307q.m538h0(string, false, "local:") || AbstractC0307q.m538h0(string, false, "localStr:");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static GradientDrawable m1357o(C0716t c0716t, int i2, int i3, Integer num, int i4) {
        if ((i4 & 4) != 0) {
            num = Integer.valueOf(AbstractC0503h.m974J((Activity) c0716t.f2417a).f3506i);
        }
        int iM101b = AbstractC0055a.m101b(1);
        c0716t.getClass();
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
    /* JADX INFO: renamed from: p */
    public static void m1358p(Drawable drawable, int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterM1252e;
        int[] iArr = AbstractC0705p0.f2378a;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C0719u.f2437b;
        }
        PorterDuff.Mode mode2 = C0719u.f2437b;
        synchronized (C0719u.class) {
            porterDuffColorFilterM1252e = C0635N0.m1252e(i2, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterM1252e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0189  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0917l m1359d(ListView listView, Object obj) {
        Object c0104d;
        Object c0104d2;
        Object c0104d3;
        C0920m c0920m;
        Object c0104d4;
        String str;
        EnumC0923n enumC0923n;
        EnumC0923n enumC0923n2;
        AbstractC0223g.m418e(listView, "listView");
        AbstractC0223g.m418e(obj, "adapter");
        ListAdapter listAdapter = obj instanceof ListAdapter ? (ListAdapter) obj : null;
        if (listAdapter == null) {
            c0920m = new C0920m();
        } else {
            try {
                c0104d = Integer.valueOf(listAdapter.getCount());
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            int i2 = 0;
            if (c0104d instanceof C0104d) {
                c0104d = 0;
            }
            int iIntValue = ((Number) c0104d).intValue();
            if (iIntValue <= 0) {
                c0920m = new C0920m();
            } else {
                ArrayList arrayList = new ArrayList();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                m1351f(iIntValue, linkedHashSet2, 0, Math.min(iIntValue, 8));
                try {
                    c0104d2 = Integer.valueOf(listView.getFirstVisiblePosition());
                } catch (Throwable th2) {
                    c0104d2 = new C0104d(th2);
                }
                if (c0104d2 instanceof C0104d) {
                    c0104d2 = -1;
                }
                int iIntValue2 = ((Number) c0104d2).intValue();
                try {
                    c0104d3 = Integer.valueOf(listView.getLastVisiblePosition());
                } catch (Throwable th3) {
                    c0104d3 = new C0104d(th3);
                }
                if (c0104d3 instanceof C0104d) {
                    c0104d3 = -1;
                }
                int iIntValue3 = ((Number) c0104d3).intValue();
                if (iIntValue2 >= 0 && iIntValue3 >= iIntValue2) {
                    m1351f(iIntValue, linkedHashSet2, iIntValue2, iIntValue3 + 1);
                }
                if (iIntValue > 12) {
                    int i3 = iIntValue / 2;
                    m1351f(iIntValue, linkedHashSet2, i3 - 2, i3 + 2);
                }
                Iterator it = AbstractC0123k.m277s0(linkedHashSet2, 24).iterator();
                while (it.hasNext()) {
                    try {
                        c0104d4 = listAdapter.getItem(((Number) it.next()).intValue());
                    } catch (Throwable th4) {
                        c0104d4 = new C0104d(th4);
                    }
                    if (c0104d4 instanceof C0104d) {
                        c0104d4 = null;
                    }
                    if (c0104d4 != null) {
                        i2++;
                        linkedHashSet.add(c0104d4.getClass().getName());
                        if (((C0915k0) this.f2421e).m1998b(obj.getClass(), obj.getClass().getName(), c0104d4).booleanValue() && (str = (String) ((C0915k0) this.f2420d).mo8c(c0104d4)) != null) {
                            if (AbstractC0307q.m534d0(str)) {
                                str = null;
                            }
                            if (str != null && !arrayList.contains(str)) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
                c0920m = new C0920m(arrayList, AbstractC0123k.m281w0(linkedHashSet), i2);
            }
        }
        List list = c0920m.f3281a;
        if (!list.isEmpty()) {
            enumC0923n2 = EnumC0923n.f3294e;
        } else if (((Boolean) ((C0915k0) this.f2417a).mo8c(obj.getClass())).booleanValue()) {
            enumC0923n2 = EnumC0923n.f3290a;
        } else if (((Boolean) ((C0915k0) this.f2418b).mo8c(obj.getClass())).booleanValue()) {
            enumC0923n2 = EnumC0923n.f3292c;
        } else {
            if (!((Boolean) ((C0915k0) this.f2419c).mo8c(obj.getClass())).booleanValue()) {
                enumC0923n = null;
                if (enumC0923n != null) {
                    return null;
                }
                String str2 = obj.getClass().getName() + "@" + listView.getClass().getName();
                if (!list.isEmpty() && ((HashSet) this.f2422f).add(str2)) {
                    AbstractC0731a.m1384a("runtime conversation surface accepted", obj.getClass().getName(), listView.getClass().getName(), AbstractC0174d.m351g(c0920m.m2038a(), "confidence="), AbstractC0174d.m351g(list.size(), "users="), AbstractC0123k.m267i0(list));
                }
                return new C0917l(listView, null, obj, obj.getClass(), c0920m.f3281a, c0920m.f3282b, c0920m.m2038a(), enumC0923n);
            }
            enumC0923n2 = EnumC0923n.f3291b;
        }
        enumC0923n = enumC0923n2;
        if (enumC0923n != null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0917l m1360e(View view, Object obj, C0920m c0920m) {
        EnumC0923n enumC0923n;
        EnumC0923n enumC0923n2;
        List list = c0920m.f3281a;
        if (list.isEmpty()) {
            if (((Boolean) ((C0915k0) this.f2417a).mo8c(obj.getClass())).booleanValue()) {
                enumC0923n2 = EnumC0923n.f3290a;
            } else {
                if (((Boolean) ((C0915k0) this.f2418b).mo8c(obj.getClass())).booleanValue()) {
                    enumC0923n2 = EnumC0923n.f3292c;
                } else {
                    if (!((Boolean) ((C0915k0) this.f2419c).mo8c(obj.getClass())).booleanValue()) {
                        enumC0923n = null;
                        if (enumC0923n != null) {
                            return null;
                        }
                        String str = obj.getClass().getName() + "@" + view.getClass().getName();
                        if (!list.isEmpty() && ((HashSet) this.f2422f).add(str)) {
                            AbstractC0731a.m1384a("runtime recycler conversation surface accepted", obj.getClass().getName(), view.getClass().getName(), AbstractC0174d.m351g(c0920m.m2038a(), "confidence="), AbstractC0174d.m351g(list.size(), "users="), AbstractC0123k.m267i0(list));
                        }
                        return new C0917l(null, view, obj, obj.getClass(), c0920m.f3281a, c0920m.f3282b, c0920m.m2038a(), enumC0923n);
                    }
                    enumC0923n2 = EnumC0923n.f3291b;
                }
            }
        } else {
            enumC0923n2 = EnumC0923n.f3294e;
        }
        enumC0923n = enumC0923n2;
        if (enumC0923n != null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public ColorStateList m1361k(Context context, int i2) {
        if (i2 == R.drawable.abc_edit_text_material) {
            return AbstractC0503h.m990w(context, R.color.abc_tint_edittext);
        }
        if (i2 == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC0503h.m990w(context, R.color.abc_tint_switch_track);
        }
        if (i2 != R.drawable.abc_switch_thumb_material) {
            if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
                return m1353h(context, AbstractC0670d1.m1299c(context, R.attr.colorButtonNormal));
            }
            if (i2 == R.drawable.abc_btn_borderless_material) {
                return m1353h(context, 0);
            }
            if (i2 == R.drawable.abc_btn_colored_material) {
                return m1353h(context, AbstractC0670d1.m1299c(context, R.attr.colorAccent));
            }
            if (i2 == R.drawable.abc_spinner_mtrl_am_alpha || i2 == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC0503h.m990w(context, R.color.abc_tint_spinner);
            }
            if (m1350c((int[]) this.f2418b, i2)) {
                return AbstractC0670d1.m1300d(context, R.attr.colorControlNormal);
            }
            if (m1350c((int[]) this.f2421e, i2)) {
                return AbstractC0503h.m990w(context, R.color.abc_tint_default);
            }
            if (m1350c((int[]) this.f2422f, i2)) {
                return AbstractC0503h.m990w(context, R.color.abc_tint_btn_checkable);
            }
            if (i2 == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC0503h.m990w(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM1300d = AbstractC0670d1.m1300d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListM1300d == null || !colorStateListM1300d.isStateful()) {
            iArr[0] = AbstractC0670d1.f2280b;
            iArr2[0] = AbstractC0670d1.m1298b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = AbstractC0670d1.f2283e;
            iArr2[1] = AbstractC0670d1.m1299c(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC0670d1.f2284f;
            iArr2[2] = AbstractC0670d1.m1299c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = AbstractC0670d1.f2280b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM1300d.getColorForState(iArr3, 0);
            iArr[1] = AbstractC0670d1.f2283e;
            iArr2[1] = AbstractC0670d1.m1299c(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC0670d1.f2284f;
            iArr2[2] = colorStateListM1300d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public C0920m m1362l(View view, Object obj) {
        String str;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        m1352g(0, view, arrayList);
        if (arrayList.isEmpty()) {
            return new C0920m();
        }
        ArrayList arrayList2 = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = AbstractC0123k.m277s0(arrayList, 24).iterator();
        while (it.hasNext()) {
            Object tag = ((View) it.next()).getTag();
            if (tag != null) {
                i2++;
                linkedHashSet.add(tag.getClass().getName());
                if (((C0915k0) this.f2421e).m1998b(obj.getClass(), obj.getClass().getName(), tag).booleanValue() && (str = (String) ((C0915k0) this.f2420d).mo8c(tag)) != null) {
                    if (AbstractC0307q.m534d0(str)) {
                        str = null;
                    }
                    if (str != null && !arrayList2.contains(str)) {
                        arrayList2.add(str);
                    }
                }
            }
        }
        return new C0920m(arrayList2, AbstractC0123k.m281w0(linkedHashSet), i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public void m1363n() {
        TextView textView = (TextView) this.f2420d;
        if (textView != null) {
            C0985g c0985g = (C0985g) this.f2418b;
            if (c0985g == null) {
                AbstractC0223g.m420g("listAdapter");
                throw null;
            }
            textView.setVisibility(c0985g.f2596b.size() == 0 ? 0 : 8);
        }
        TextView textView2 = (TextView) this.f2421e;
        if (textView2 != null) {
            C0985g c0985g2 = (C0985g) this.f2418b;
            if (c0985g2 != null) {
                textView2.setAlpha(c0985g2.f2596b.size() == 0 ? 0.45f : 1.0f);
            } else {
                AbstractC0223g.m420g("listAdapter");
                throw null;
            }
        }
    }

    public C0716t(Activity activity) {
        final int i2 = 0;
        final int i3 = 1;
        this.f2417a = activity;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setBackground(m1357o(this, AbstractC0503h.m974J(activity).f3501d, AbstractC0055a.m101b(22), null, 12));
        linearLayout.setClipToOutline(true);
        FrameLayout frameLayout = new FrameLayout(activity);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, AbstractC0055a.m101b(72));
        layoutParams.gravity = 16;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setPadding(AbstractC0055a.m101b(24), 0, AbstractC0055a.m101b(24), 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(AbstractC0503h.m974J(activity).f3499b);
        gradientDrawable.setCornerRadii(new float[]{AbstractC0055a.m100a(22.0f), AbstractC0055a.m100a(22.0f), AbstractC0055a.m100a(22.0f), AbstractC0055a.m100a(22.0f), 0.0f, 0.0f, 0.0f, 0.0f});
        frameLayout.setBackground(gradientDrawable);
        TextView textView = new TextView(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(AbstractC0055a.m101b(48), -1);
        layoutParams2.gravity = 8388611;
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setText("‹");
        textView.setTextColor(AbstractC0503h.m974J(activity).f3503f);
        textView.setTextSize(2, 32.0f);
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: s0.m

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C0716t f3564c;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f3564c = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        ((C1010e) this.f3564c.f2422f).mo2182a();
                        return;
                    default:
                        C0716t c0716t = this.f3564c;
                        C0985g c0985g = (C0985g) c0716t.f2418b;
                        if (c0985g == null) {
                            AbstractC0223g.m420g("listAdapter");
                            throw null;
                        }
                        if (c0985g.f2596b.size() <= 0) {
                            AbstractC0503h.m978P("暂无可清空内容");
                            return;
                        } else {
                            new AlertDialog.Builder((Activity) c0716t.f2417a).setTitle("清空隐藏内容？").setMessage("清空后，所有已隐藏的自己朋友圈内容都会恢复显示。").setNegativeButton("确定", new DialogInterfaceOnClickListenerC1003y(2, c0716t)).setNeutralButton("取消", (DialogInterface.OnClickListener) null).show();
                            return;
                        }
                }
            }
        });
        frameLayout.addView(textView);
        TextView textView2 = new TextView(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        textView2.setLayoutParams(layoutParams3);
        textView2.setText("隐藏内容管理");
        textView2.setTextColor(AbstractC0503h.m974J(activity).f3503f);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        textView2.setTextSize(2, 20.0f);
        frameLayout.addView(textView2);
        TextView textView3 = new TextView(frameLayout.getContext());
        this.f2421e = textView3;
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(AbstractC0055a.m101b(72), AbstractC0055a.m101b(40));
        layoutParams4.gravity = 8388629;
        textView3.setLayoutParams(layoutParams4);
        textView3.setGravity(17);
        textView3.setText("清空");
        AbstractC0503h.m974J(activity);
        textView3.setTextColor(-2466443);
        textView3.setTypeface(typeface);
        textView3.setTextSize(2, 16.0f);
        AbstractC0503h.m974J(activity);
        textView3.setBackground(m1357o(this, Color.argb(30, Color.red(-2466443), Color.green(-2466443), Color.blue(-2466443)), AbstractC0055a.m101b(18), null, 8));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: s0.m

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C0716t f3564c;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f3564c = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        ((C1010e) this.f3564c.f2422f).mo2182a();
                        return;
                    default:
                        C0716t c0716t = this.f3564c;
                        C0985g c0985g = (C0985g) c0716t.f2418b;
                        if (c0985g == null) {
                            AbstractC0223g.m420g("listAdapter");
                            throw null;
                        }
                        if (c0985g.f2596b.size() <= 0) {
                            AbstractC0503h.m978P("暂无可清空内容");
                            return;
                        } else {
                            new AlertDialog.Builder((Activity) c0716t.f2417a).setTitle("清空隐藏内容？").setMessage("清空后，所有已隐藏的自己朋友圈内容都会恢复显示。").setNegativeButton("确定", new DialogInterfaceOnClickListenerC1003y(2, c0716t)).setNeutralButton("取消", (DialogInterface.OnClickListener) null).show();
                            return;
                        }
                }
            }
        });
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        float f = 4;
        gradientDrawable2.setCornerRadius(f);
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(0);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(ColorStateList.valueOf(-1));
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(f);
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(866822826), gradientDrawable2, gradientDrawable3);
        textView3.setClickable(true);
        textView3.setBackground(rippleDrawable);
        frameLayout.addView(textView3);
        linearLayout.addView(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams5.weight = 1.0f;
        frameLayout2.setLayoutParams(layoutParams5);
        this.f2418b = new C0985g(this);
        ListView listView = new ListView(activity);
        this.f2419c = listView;
        listView.setVerticalScrollBarEnabled(false);
        listView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        listView.setPadding(0, AbstractC0055a.m101b(8), 0, AbstractC0055a.m101b(12));
        listView.setBackgroundColor(AbstractC0503h.m974J(activity).f3501d);
        listView.setDivider(new ColorDrawable(AbstractC0503h.m974J(activity).f3506i));
        listView.setDividerHeight(AbstractC0055a.m101b(1));
        listView.setSelector(new ColorDrawable(0));
        C0985g c0985g = (C0985g) this.f2418b;
        if (c0985g != null) {
            listView.setAdapter((ListAdapter) c0985g);
            frameLayout2.addView(listView);
            TextView textView4 = new TextView(activity);
            this.f2420d = textView4;
            textView4.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            textView4.setGravity(17);
            textView4.setText("暂无隐藏的自己朋友圈内容");
            textView4.setTextColor(AbstractC0503h.m974J(activity).f3504g);
            textView4.setTextSize(2, 16.0f);
            frameLayout2.addView(textView4);
            linearLayout.addView(frameLayout2);
            m1363n();
            C1010e c1010e = new C1010e(linearLayout);
            this.f2422f = c1010e;
            ListView listView2 = (ListView) this.f2419c;
            if (listView2 != null) {
                c1010e.setNeedScrollChild(listView2);
                return;
            } else {
                AbstractC0223g.m420g("listView");
                throw null;
            }
        }
        AbstractC0223g.m420g("listAdapter");
        throw null;
    }

    public C0716t() {
        this.f2417a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.f2418b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f2419c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.f2420d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.f2421e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f2422f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }
}

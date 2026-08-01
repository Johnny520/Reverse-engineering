package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import androidx.compose.foundation.lazy.layout.C0690;
import androidx.compose.runtime.AbstractC1367;
import com.davemorrissey.labs.subscaleview.R;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.ByteString;
import p005.C6099;
import p005.C6108;
import p005.C6117;
import p015.C6200;
import p015.C6222;
import p019.AbstractC6241;
import p019.InterfaceC6242;
import p052.InterfaceC6553;
import p162.AbstractC7652;
import p164.AbstractC7666;
import retrofit2.AbstractC5776;
import retrofit2.AbstractC5789;
import retrofit2.C5757;
import retrofit2.InterfaceC5788;
import retrofit2.InterfaceC5795;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0131 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object f573;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object f574;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f575;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f576;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object f577;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Serializable f578;

    /* JADX WARN: Type inference failed for: r4v5, types: [int[], java.io.Serializable] */
    public C0131(int i) {
        switch (i) {
            case 3:
                this.f578 = new AtomicBoolean(false);
                this.f577 = new CountDownLatch(1);
                this.f573 = "PublicSuffixDatabase.list";
                break;
            default:
                this.f578 = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                this.f577 = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.f576 = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                this.f575 = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                this.f574 = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f573 = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static ColorStateList m541(Context context, int i) {
        int iM604 = AbstractC0152.m604(context, R.attr.colorControlHighlight);
        int iM605 = AbstractC0152.m605(context, R.attr.colorButtonNormal);
        int[] iArr = AbstractC0152.f634;
        int[] iArr2 = AbstractC0152.f632;
        int iM12946 = AbstractC7666.m12946(iM604, i);
        return new ColorStateList(new int[][]{iArr, iArr2, AbstractC0152.f633, AbstractC0152.f630}, new int[]{iM605, iM12946, AbstractC7666.m12946(iM604, i), i});
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m542(int[] iArr, int[] iArr2) {
        int iM543 = m543(iArr);
        int length = iArr2.length;
        int iMin = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (iArr[i] == iM543) {
                iMin = Math.min(iMin, iArr2[i]);
            }
        }
        if (iMin == Integer.MAX_VALUE) {
            return 0;
        }
        return iMin;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m543(int[] iArr) {
        int length = iArr.length;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                if (i == Integer.MAX_VALUE) {
                    break;
                }
                return i;
            }
            int i3 = iArr[i2];
            if (i3 <= 0) {
                break;
            }
            if (i > i3) {
                i = i3;
            }
            i2++;
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m544(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m545(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C0130.f571;
        }
        drawableMutate.setColorFilter(C0130.m538(i, mode));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static LayerDrawable m546(C0171 c0171, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableM633 = c0171.m633(context, R.drawable.abc_star_black_48dp);
        Drawable drawableM6332 = c0171.m633(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableM633 instanceof BitmapDrawable) && drawableM633.getIntrinsicWidth() == dimensionPixelSize && drawableM633.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM633;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM633.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM633.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM6332 instanceof BitmapDrawable) && drawableM6332.getIntrinsicWidth() == dimensionPixelSize && drawableM6332.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM6332;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM6332.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM6332.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object m547(Class cls) {
        if (!cls.isInterface()) {
            C5919.m11249("API declarations must be interfaces.");
            return null;
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C5757(this, cls));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC5795 m548(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f574;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            InterfaceC5795 interfaceC5795Mo11111 = ((AbstractC5776) list.get(i)).mo11111(type, annotationArr);
            if (interfaceC5795Mo11111 != null) {
                return interfaceC5795Mo11111;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC5776) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void m549(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = (List) this.f575;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC5789) list.get(i)).getClass();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public ColorStateList m550(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return AbstractC7652.m12890(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC7652.m12890(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return m541(context, AbstractC0152.m604(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return m541(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return m541(context, AbstractC0152.m604(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC7652.m12890(context, R.color.abc_tint_spinner);
            }
            if (m544((int[]) this.f577, i)) {
                return AbstractC0152.m603(context, R.attr.colorControlNormal);
            }
            if (m544((int[]) this.f574, i)) {
                return AbstractC7652.m12890(context, R.color.abc_tint_default);
            }
            if (m544((int[]) this.f573, i)) {
                return AbstractC7652.m12890(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC7652.m12890(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM603 = AbstractC0152.m603(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListM603 == null || !colorStateListM603.isStateful()) {
            iArr[0] = AbstractC0152.f634;
            iArr2[0] = AbstractC0152.m605(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = AbstractC0152.f631;
            iArr2[1] = AbstractC0152.m604(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC0152.f630;
            iArr2[2] = AbstractC0152.m604(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = AbstractC0152.f634;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM603.getColorForState(iArr3, 0);
            iArr[1] = AbstractC0152.f631;
            iArr2[1] = AbstractC0152.m604(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC0152.f630;
            iArr2[2] = colorStateListM603.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public InterfaceC5788 m551(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = (List) this.f575;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            InterfaceC5788 interfaceC5788Mo11115 = ((AbstractC5789) list.get(i)).mo11115(type);
            if (interfaceC5788Mo11115 != null) {
                return interfaceC5788Mo11115;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC5789) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public InterfaceC5788 m552(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f575;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            InterfaceC5788 interfaceC5788Mo11114 = ((AbstractC5789) list.get(i)).mo11114(type, annotationArr, this);
            if (interfaceC5788Mo11114 != null) {
                return interfaceC5788Mo11114;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC5789) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C6117 m553() throws IOException {
        AbstractC6241 abstractC6241 = AbstractC6241.f17194;
        Object obj = AbstractC6241.f17194;
        InterfaceC6242 interfaceC6242 = obj != null ? (InterfaceC6242) obj : null;
        Context contextMo11724 = interfaceC6242 != null ? interfaceC6242.mo11724() : null;
        AssetManager assets = contextMo11724 != null ? contextMo11724.getAssets() : null;
        if (assets != null) {
            InputStream inputStreamOpen = assets.open((String) this.f573);
            inputStreamOpen.getClass();
            return new C6117(inputStreamOpen, new C6099());
        }
        if (Build.FINGERPRINT == null) {
            C5919.m11246("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            return null;
        }
        C5919.m11246("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void m554() {
        try {
            C6108 c6108 = new C6108(m553());
            try {
                ByteString byteStringMo11487 = c6108.mo11487(c6108.readInt());
                ByteString byteStringMo114872 = c6108.mo11487(c6108.readInt());
                c6108.close();
                synchronized (this) {
                    byteStringMo11487.getClass();
                    this.f576 = byteStringMo11487;
                    byteStringMo114872.getClass();
                    this.f575 = byteStringMo114872;
                }
            } finally {
            }
        } finally {
            ((CountDownLatch) this.f577).countDown();
        }
    }

    public C0131(int[] iArr, int[] iArr2, InterfaceC6553 interfaceC6553) {
        Integer numValueOf;
        this.f576 = interfaceC6553;
        this.f578 = iArr;
        this.f575 = AbstractC1367.m2468(m543(iArr));
        this.f577 = iArr2;
        this.f574 = AbstractC1367.m2468(m542(iArr, iArr2));
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i = iArr[0];
            int i2 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i3 = iArr[i2];
                    i = i > i3 ? i3 : i;
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            numValueOf = Integer.valueOf(i);
        }
        this.f573 = new C0690(numValueOf != null ? numValueOf.intValue() : 0, 90, 200);
    }

    public C0131(C6200 c6200, C6222 c6222, List list, List list2, Executor executor) {
        this.f578 = new ConcurrentHashMap();
        this.f577 = c6200;
        this.f576 = c6222;
        this.f575 = list;
        this.f574 = list2;
        this.f573 = executor;
    }
}

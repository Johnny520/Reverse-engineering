package androidx.appcompat.widget;

import android.R;
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
import androidx.compose.foundation.lazy.layout.C1531;
import androidx.compose.runtime.AbstractC2202;
import com.davemorrissey.labs.subscaleview.C0328R;
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
import p020.C6919;
import p020.C6928;
import p020.C6937;
import p023.C6956;
import p023.C6978;
import p033.AbstractC7067;
import p033.InterfaceC7068;
import p068.InterfaceC7383;
import p178.AbstractC8482;
import p180.AbstractC8496;
import retrofit2.AbstractC6607;
import retrofit2.AbstractC6620;
import retrofit2.C6588;
import retrofit2.InterfaceC6619;
import retrofit2.InterfaceC6626;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0978 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object f918;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object f919;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f920;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f921;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object f922;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Serializable f923;

    /* JADX WARN: Type inference failed for: r4v5, types: [int[], java.io.Serializable] */
    public C0978(int i) {
        switch (i) {
            case 3:
                this.f923 = new AtomicBoolean(false);
                this.f922 = new CountDownLatch(1);
                this.f918 = "PublicSuffixDatabase.list";
                break;
            default:
                this.f923 = new int[]{C0328R.drawable.abc_textfield_search_default_mtrl_alpha, C0328R.drawable.abc_textfield_default_mtrl_alpha, C0328R.drawable.abc_ab_share_pack_mtrl_alpha};
                this.f922 = new int[]{C0328R.drawable.abc_ic_commit_search_api_mtrl_alpha, C0328R.drawable.abc_seekbar_tick_mark_material, C0328R.drawable.abc_ic_menu_share_mtrl_alpha, C0328R.drawable.abc_ic_menu_copy_mtrl_am_alpha, C0328R.drawable.abc_ic_menu_cut_mtrl_alpha, C0328R.drawable.abc_ic_menu_selectall_mtrl_alpha, C0328R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.f921 = new int[]{C0328R.drawable.abc_textfield_activated_mtrl_alpha, C0328R.drawable.abc_textfield_search_activated_mtrl_alpha, C0328R.drawable.abc_cab_background_top_mtrl_alpha, C0328R.drawable.abc_text_cursor_material, C0328R.drawable.abc_text_select_handle_left_mtrl, C0328R.drawable.abc_text_select_handle_middle_mtrl, C0328R.drawable.abc_text_select_handle_right_mtrl};
                this.f920 = new int[]{C0328R.drawable.abc_popup_background_mtrl_mult, C0328R.drawable.abc_cab_background_internal_bg, C0328R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                this.f919 = new int[]{C0328R.drawable.abc_tab_indicator_material, C0328R.drawable.abc_textfield_search_material};
                this.f918 = new int[]{C0328R.drawable.abc_btn_check_material, C0328R.drawable.abc_btn_radio_material, C0328R.drawable.abc_btn_check_material_anim, C0328R.drawable.abc_btn_radio_material_anim};
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static ColorStateList m1102(Context context, int i) {
        int iM1165 = AbstractC0999.m1165(context, C0328R.attr.colorControlHighlight);
        int iM1166 = AbstractC0999.m1166(context, C0328R.attr.colorButtonNormal);
        int[] iArr = AbstractC0999.f979;
        int[] iArr2 = AbstractC0999.f977;
        int iM13534 = AbstractC8496.m13534(iM1165, i);
        return new ColorStateList(new int[][]{iArr, iArr2, AbstractC0999.f978, AbstractC0999.f975}, new int[]{iM1166, iM13534, AbstractC8496.m13534(iM1165, i), i});
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m1103(int[] iArr, int[] iArr2) {
        int iM1104 = m1104(iArr);
        int length = iArr2.length;
        int iMin = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (iArr[i] == iM1104) {
                iMin = Math.min(iMin, iArr2[i]);
            }
        }
        if (iMin == Integer.MAX_VALUE) {
            return 0;
        }
        return iMin;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m1104(int[] iArr) {
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
    public static boolean m1105(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m1106(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C0977.f916;
        }
        drawableMutate.setColorFilter(C0977.m1099(i, mode));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static LayerDrawable m1107(C1018 c1018, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableM1194 = c1018.m1194(context, C0328R.drawable.abc_star_black_48dp);
        Drawable drawableM11942 = c1018.m1194(context, C0328R.drawable.abc_star_half_black_48dp);
        if ((drawableM1194 instanceof BitmapDrawable) && drawableM1194.getIntrinsicWidth() == dimensionPixelSize && drawableM1194.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM1194;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM1194.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM1194.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM11942 instanceof BitmapDrawable) && drawableM11942.getIntrinsicWidth() == dimensionPixelSize && drawableM11942.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM11942;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM11942.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM11942.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object m1108(Class cls) {
        if (!cls.isInterface()) {
            C6755.m11869("API declarations must be interfaces.");
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
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C6588(this, cls));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC6626 m1109(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f919;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            InterfaceC6626 interfaceC6626Mo11727 = ((AbstractC6607) list.get(i)).mo11727(type, annotationArr);
            if (interfaceC6626Mo11727 != null) {
                return interfaceC6626Mo11727;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC6607) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void m1110(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = (List) this.f920;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC6620) list.get(i)).getClass();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public ColorStateList m1111(Context context, int i) {
        if (i == C0328R.drawable.abc_edit_text_material) {
            return AbstractC8482.m13478(context, C0328R.color.abc_tint_edittext);
        }
        if (i == C0328R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC8482.m13478(context, C0328R.color.abc_tint_switch_track);
        }
        if (i != C0328R.drawable.abc_switch_thumb_material) {
            if (i == C0328R.drawable.abc_btn_default_mtrl_shape) {
                return m1102(context, AbstractC0999.m1165(context, C0328R.attr.colorButtonNormal));
            }
            if (i == C0328R.drawable.abc_btn_borderless_material) {
                return m1102(context, 0);
            }
            if (i == C0328R.drawable.abc_btn_colored_material) {
                return m1102(context, AbstractC0999.m1165(context, C0328R.attr.colorAccent));
            }
            if (i == C0328R.drawable.abc_spinner_mtrl_am_alpha || i == C0328R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC8482.m13478(context, C0328R.color.abc_tint_spinner);
            }
            if (m1105((int[]) this.f922, i)) {
                return AbstractC0999.m1164(context, C0328R.attr.colorControlNormal);
            }
            if (m1105((int[]) this.f919, i)) {
                return AbstractC8482.m13478(context, C0328R.color.abc_tint_default);
            }
            if (m1105((int[]) this.f918, i)) {
                return AbstractC8482.m13478(context, C0328R.color.abc_tint_btn_checkable);
            }
            if (i == C0328R.drawable.abc_seekbar_thumb_material) {
                return AbstractC8482.m13478(context, C0328R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM1164 = AbstractC0999.m1164(context, C0328R.attr.colorSwitchThumbNormal);
        if (colorStateListM1164 == null || !colorStateListM1164.isStateful()) {
            iArr[0] = AbstractC0999.f979;
            iArr2[0] = AbstractC0999.m1166(context, C0328R.attr.colorSwitchThumbNormal);
            iArr[1] = AbstractC0999.f976;
            iArr2[1] = AbstractC0999.m1165(context, C0328R.attr.colorControlActivated);
            iArr[2] = AbstractC0999.f975;
            iArr2[2] = AbstractC0999.m1165(context, C0328R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = AbstractC0999.f979;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM1164.getColorForState(iArr3, 0);
            iArr[1] = AbstractC0999.f976;
            iArr2[1] = AbstractC0999.m1165(context, C0328R.attr.colorControlActivated);
            iArr[2] = AbstractC0999.f975;
            iArr2[2] = colorStateListM1164.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public InterfaceC6619 m1112(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = (List) this.f920;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            InterfaceC6619 interfaceC6619Mo11731 = ((AbstractC6620) list.get(i)).mo11731(type);
            if (interfaceC6619Mo11731 != null) {
                return interfaceC6619Mo11731;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC6620) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public InterfaceC6619 m1113(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f920;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            InterfaceC6619 interfaceC6619Mo11730 = ((AbstractC6620) list.get(i)).mo11730(type, annotationArr, this);
            if (interfaceC6619Mo11730 != null) {
                return interfaceC6619Mo11730;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC6620) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C6937 m1114() throws IOException {
        AbstractC7067 abstractC7067 = AbstractC7067.f17543;
        Object obj = AbstractC7067.f17543;
        InterfaceC7068 interfaceC7068 = obj != null ? (InterfaceC7068) obj : null;
        Context contextMo12285 = interfaceC7068 != null ? interfaceC7068.mo12285() : null;
        AssetManager assets = contextMo12285 != null ? contextMo12285.getAssets() : null;
        if (assets != null) {
            InputStream inputStreamOpen = assets.open((String) this.f918);
            inputStreamOpen.getClass();
            return new C6937(inputStreamOpen, new C6919());
        }
        if (Build.FINGERPRINT == null) {
            C6755.m11866("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            return null;
        }
        C6755.m11866("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void m1115() {
        try {
            C6928 c6928 = new C6928(m1114());
            try {
                ByteString byteStringMo12040 = c6928.mo12040(c6928.readInt());
                ByteString byteStringMo120402 = c6928.mo12040(c6928.readInt());
                c6928.close();
                synchronized (this) {
                    byteStringMo12040.getClass();
                    this.f921 = byteStringMo12040;
                    byteStringMo120402.getClass();
                    this.f920 = byteStringMo120402;
                }
            } finally {
            }
        } finally {
            ((CountDownLatch) this.f922).countDown();
        }
    }

    public C0978(int[] iArr, int[] iArr2, InterfaceC7383 interfaceC7383) {
        Integer numValueOf;
        this.f921 = interfaceC7383;
        this.f923 = iArr;
        this.f920 = AbstractC2202.m3037(m1104(iArr));
        this.f922 = iArr2;
        this.f919 = AbstractC2202.m3037(m1103(iArr, iArr2));
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
        this.f918 = new C1531(numValueOf != null ? numValueOf.intValue() : 0, 90, 200);
    }

    public C0978(C6956 c6956, C6978 c6978, List list, List list2, Executor executor) {
        this.f923 = new ConcurrentHashMap();
        this.f922 = c6956;
        this.f921 = c6978;
        this.f920 = list;
        this.f919 = list2;
        this.f918 = executor;
    }
}

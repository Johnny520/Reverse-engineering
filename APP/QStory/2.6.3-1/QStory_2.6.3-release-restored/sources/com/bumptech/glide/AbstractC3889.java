package com.bumptech.glide;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0923;
import androidx.appcompat.widget.C0984;
import androidx.compose.p001ui.graphics.vector.C2378;
import androidx.compose.p001ui.platform.C2697;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2869;
import androidx.core.view.AbstractC3100;
import androidx.core.view.C3075;
import com.alibaba.fastjson2.AbstractC3738;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.http.BadContentTypeFormatException;
import io.ktor.server.application.InterfaceC4889;
import io.ktor.util.C5043;
import java.io.File;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.InterfaceC5219;
import kotlin.p008io.C5209;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5266;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.p009km.InconsistentKotlinMetadataException;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.sequences.C5960;
import kotlin.text.AbstractC5964;
import kotlin.text.AbstractC5976;
import org.apache.commons.compress.compressors.deflate64.HuffmanState;
import p023.C6980;
import p034.AbstractC7082;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p050.AbstractC7176;
import p068.InterfaceC7383;
import p069.AbstractC7390;
import p086.C7727;
import p093.C7799;
import p093.C7800;
import p113.AbstractC8054;
import p158.InterfaceC8366;
import p184.C8544;
import p184.InterfaceC8545;
import p191.AbstractC8568;
import p252.AbstractC8935;
import p252.AbstractC8944;
import p252.C8942;
import p252.C8954;
import p267.C8998;
import p267.C8999;
import p267.C9000;
import p267.C9001;
import p267.C9003;
import p267.C9006;
import p267.C9008;
import p267.C9009;
import p267.C9010;
import p267.C9013;
import p267.SharedPreferencesC9005;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.mcp.config.C6702;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3889 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C2378 f10109;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C5266 f10110;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static void m7292(CheckableImageButton checkableImageButton, CharSequence charSequence) {
        if (!checkableImageButton.isFocusable()) {
            charSequence = null;
        }
        checkableImageButton.setTooltipText(charSequence);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final void m7293(long j, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C5209 m7294(File file) {
        List list;
        String path = file.getPath();
        path.getClass();
        int iM7312 = m7312(path);
        String strSubstring = path.substring(0, iM7312);
        String strSubstring2 = path.substring(iM7312);
        if (strSubstring2.length() == 0) {
            list = EmptyList.INSTANCE;
        } else {
            List listM10709 = AbstractC5976.m10709(strSubstring2, new char[]{File.separatorChar});
            ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listM10709, 10));
            Iterator it = listM10709.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new C5209(new File(strSubstring), list);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m7295(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final String[] m7296(Metadata metadata) {
        String[] strArrM150d1 = metadata.m150d1();
        if (strArrM150d1.length == 0) {
            strArrM150d1 = null;
        }
        if (strArrM150d1 != null) {
            return strArrM150d1;
        }
        throw new InconsistentKotlinMetadataException("Metadata is missing: kotlin.Metadata.data1 must not be an empty array", null, 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static void m7297(TextView textView, ArrayList arrayList) {
        int i = 0;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((C6702) it.next()).f16387 && (i = i + 1) < 0) {
                    AbstractC7176.m12480();
                    throw null;
                }
            }
        }
        textView.setText("已启用 " + i + " / " + arrayList.size() + " 个 MCP，长按右侧拖动柄可调整顺序");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final long m7298(long j, long j2) {
        int iM4311;
        int iM4317 = C2869.m4317(j);
        int iM4310 = C2869.m4310(j);
        if ((C2869.m4317(j2) < C2869.m4310(j)) && (C2869.m4317(j) < C2869.m4310(j2))) {
            if (C2869.m4315(j2, j)) {
                iM4317 = C2869.m4317(j2);
                iM4310 = iM4317;
            } else {
                if (C2869.m4315(j, j2)) {
                    iM4311 = C2869.m4311(j2);
                } else {
                    int iM43172 = C2869.m4317(j2);
                    if (iM4317 >= C2869.m4310(j2) || iM43172 > iM4317) {
                        iM4310 = C2869.m4317(j2);
                    } else {
                        iM4317 = C2869.m4317(j2);
                        iM4311 = C2869.m4311(j2);
                    }
                }
                iM4310 -= iM4311;
            }
        } else if (iM4310 > C2869.m4317(j2)) {
            iM4317 -= C2869.m4311(j2);
            iM4311 = C2869.m4311(j2);
            iM4310 -= iM4311;
        }
        return AbstractC2882.m4330(iM4317, iM4310);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final TypeVariance m7299(Variance variance) {
        int i = AbstractC8054.f19613[variance.ordinal()];
        if (i == 1) {
            return TypeVariance.INV;
        }
        if (i == 2) {
            return TypeVariance.f309IN;
        }
        if (i == 3) {
            return TypeVariance.OUT;
        }
        C5043.m9170();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static ImageView.ScaleType m7300(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m7301(View view) {
        view.getClass();
        C5960 c5960M12604 = AbstractC7390.m12604((InterfaceC7383) AbstractC3100.m4785(view).f13273);
        while (c5960M12604.hasNext()) {
            ArrayList arrayList = m7309((View) c5960M12604.next()).f21274;
            for (int iM12460 = AbstractC7176.m12460(arrayList); -1 < iM12460; iM12460--) {
                ((C2697) ((InterfaceC8545) arrayList.get(iM12460))).f5710.m4055();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m7302(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m7303(int i) {
        String str = "039";
        if (i < 28) {
            if (i >= 10000) {
                str = "040";
            } else if (i < 28) {
                str = i >= 26 ? "038" : i >= 24 ? "037" : "035";
            }
        }
        return AbstractC0900.m718("dex\n", str, "\u0000");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static void m7304(SharedPreferencesC9005 sharedPreferencesC9005, C0984 c0984, C5317 c5317, byte b, String str, int i) {
        HashMap map = sharedPreferencesC9005.f22880;
        if (b == 1) {
            byte[] bArr = (byte[]) c0984.f939;
            int i2 = c0984.f941;
            c0984.f941 = i2 + 1;
            map.put(str, new C9001(i, bArr[i2] == 1));
            return;
        }
        if (b == 2) {
            int iM1125 = c0984.m1125();
            if (c5317 != null) {
                c5317.m9618(iM1125);
            }
            map.put(str, new C8998(i, iM1125));
            return;
        }
        if (b == 3) {
            int iM11252 = c0984.m1125();
            if (c5317 != null) {
                c5317.m9618(iM11252);
            }
            map.put(str, new C8999(i, Float.intBitsToFloat(iM11252)));
            return;
        }
        if (b != 4) {
            long jM1141 = c0984.m1141(c0984.f941);
            c0984.f941 += 8;
            if (c5317 != null) {
                c5317.m9615(jM1141);
            }
            map.put(str, new C9000(i, Double.longBitsToDouble(jM1141)));
            return;
        }
        long jM11412 = c0984.m1141(c0984.f941);
        c0984.f941 += 8;
        if (c5317 != null) {
            c5317.m9615(jM11412);
        }
        map.put(str, new C9010(i, jM11412));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static C6980 m7305(String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length % 2 != 0) {
            C6755.m11869("Expected alternating header names and values");
            return null;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        int length = strArr3.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr3[i2] == null) {
                C6755.m11869("Headers cannot be null");
                return null;
            }
            strArr3[i2] = AbstractC5976.m10714(strArr2[i2]).toString();
        }
        int iM8866 = AbstractC4765.m8866(0, strArr3.length - 1, 2);
        if (iM8866 >= 0) {
            while (true) {
                String str = strArr3[i];
                String str2 = strArr3[i + 1];
                AbstractC8568.m13617(str);
                AbstractC8568.m13616(str2, str);
                if (i == iM8866) {
                    break;
                }
                i += 2;
            }
        }
        return new C6980(strArr3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static void m7306(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static void m7307(SharedPreferencesC9005 sharedPreferencesC9005, C0984 c0984, C5317 c5317, byte b, String str, int i, int i2, byte b2) throws Exception {
        Object objM9616;
        int length;
        C0984 c09842;
        byte b3 = b;
        HashMap map = sharedPreferencesC9005.f22880;
        boolean z = b3 == 9 || b3 == 10 || b3 == 11;
        int iM1125 = z ? c0984.m1125() : c0984.m1144() & 65535;
        int i3 = z ? 4 : 2;
        boolean z2 = (b2 & 64) != 0;
        if (z2 && iM1125 != 32) {
            C6755.m11870("name size not match");
            return;
        }
        switch (b3) {
            case 9:
                b3 = 6;
                break;
            case 10:
                b3 = 7;
                break;
            case 11:
                b3 = 8;
                break;
        }
        if (b3 == 6) {
            map.put(str, new C9013(i2, i + i3, z2 ? c0984.m1145(iM1125) : c0984.m1143(c5317, iM1125), iM1125, z2));
            return;
        }
        if (b3 == 7) {
            if (z2) {
                objM9616 = c0984.m1145(iM1125);
            } else {
                c0984.getClass();
                byte[] bArr = new byte[iM1125];
                System.arraycopy((byte[]) c0984.f939, c0984.f941, bArr, 0, iM1125);
                c0984.f941 += iM1125;
                objM9616 = c5317 != null ? c5317.m9616(bArr) : bArr;
            }
            map.put(str, new C9003(i2, i + i3, objM9616, iM1125, z2));
            return;
        }
        if (z2) {
            map.put(str, new C9009(i2, i + i3, c0984.m1145(iM1125), iM1125, true));
            return;
        }
        if (c5317 == null) {
            c09842 = sharedPreferencesC9005.f22883;
            length = iM1125;
        } else {
            byte[] bArr2 = new byte[iM1125];
            C0984 c09843 = sharedPreferencesC9005.f22883;
            System.arraycopy((byte[]) c09843.f939, c09843.f941, bArr2, 0, iM1125);
            byte[] bArrM9616 = c5317.m9616(bArr2);
            C0984 c09844 = new C0984(bArrM9616, 0);
            length = bArrM9616.length;
            c09842 = c09844;
        }
        byte[] bArr3 = (byte[]) c09842.f939;
        int i4 = c09842.f941;
        c09842.f941 = i4 + 1;
        int i5 = bArr3[i4] & DefaultClassResolver.NAME;
        String strM1145 = c09842.m1145(i5);
        C9006 c9006 = (C9006) sharedPreferencesC9005.f22864.get(strM1145);
        int i6 = length - (i5 + 1);
        if (i6 < 0) {
            throw new Exception("parse dara failed");
        }
        if (c9006 != null) {
            try {
                C9009 c9009 = new C9009(i2, i + 2, C9006.m14230(c09842.f941, (byte[]) c09842.f939, i6), iM1125, false);
                c9009.f22890 = c9006;
                map.put(str, c9009);
            } catch (Exception e) {
                Log.e("FastKV", sharedPreferencesC9005.f22865, e);
            }
        } else {
            AbstractC3898.m7426(sharedPreferencesC9005, "object with tag: " + strM1145 + " without encoder");
        }
        c0984.f941 = i + i3 + iM1125;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ae, code lost:
    
        throw new java.lang.Exception("parse dara failed");
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m7308(SharedPreferencesC9005 sharedPreferencesC9005, boolean z) {
        int iM1125;
        SharedPreferencesC9005 sharedPreferencesC90052 = sharedPreferencesC9005;
        C5317 c5317 = sharedPreferencesC90052.f22863;
        boolean z2 = false;
        if (z && c5317 == null) {
            AbstractC3898.m7426(sharedPreferencesC90052, "miss cipher");
            return false;
        }
        C5317 c53172 = z ? c5317 : null;
        C0984 c0984 = sharedPreferencesC90052.f22883;
        String str = sharedPreferencesC90052.f22865;
        c0984.f941 = 12;
        while (true) {
            try {
                int i = c0984.f941;
                int i2 = sharedPreferencesC90052.f22862;
                boolean z3 = true;
                if (i >= i2) {
                    if (i != i2) {
                        Log.e("FastKV", str, new Exception("parse dara failed"));
                        return false;
                    }
                    if (!z && c5317 != null && i2 != 12) {
                        z2 = true;
                    }
                    sharedPreferencesC90052.f22874 = z2;
                    return true;
                }
                byte[] bArr = (byte[]) c0984.f939;
                int i3 = i + 1;
                c0984.f941 = i3;
                byte b = bArr[i];
                byte b2 = (byte) (b & 63);
                if (b2 < 1 || b2 > 11) {
                    break;
                }
                int i4 = i + 2;
                c0984.f941 = i4;
                int i5 = bArr[i3] & DefaultClassResolver.NAME;
                if (i5 == 0) {
                    throw new IllegalStateException("invalid key size");
                }
                if (b < 0) {
                    c0984.f941 = i4 + i5;
                    if (b2 <= 5) {
                        iM1125 = SharedPreferencesC9005.f22858[b2];
                    } else {
                        if (b2 != 9 && b2 != 10 && b2 != 11) {
                            z3 = false;
                        }
                        iM1125 = z3 ? c0984.m1125() : c0984.m1144() & 65535;
                    }
                    int i6 = c0984.f941 + iM1125;
                    c0984.f941 = i6;
                    sharedPreferencesC90052.f22877 = (i6 - i) + sharedPreferencesC90052.f22877;
                    ArrayList arrayList = sharedPreferencesC90052.f22878;
                    C9008 c9008 = new C9008();
                    c9008.f22889 = i;
                    c9008.f22888 = i6;
                    arrayList.add(c9008);
                } else {
                    String strM1143 = c0984.m1143(c53172, i5);
                    int i7 = c0984.f941;
                    if (b2 <= 5) {
                        m7304(sharedPreferencesC90052, c0984, c53172, b2, strM1143, i7);
                        sharedPreferencesC90052 = sharedPreferencesC9005;
                    } else {
                        m7307(sharedPreferencesC90052, c0984, c53172, b2, strM1143, i7, i, b);
                    }
                }
            } catch (Exception e) {
                Log.e("FastKV", str, e);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C8544 m7309(View view) {
        C8544 c8544 = (C8544) view.getTag(C0328R.id.pooling_container_listener_holder_tag);
        if (c8544 != null) {
            return c8544;
        }
        C8544 c85442 = new C8544();
        view.setTag(C0328R.id.pooling_container_listener_holder_tag, c85442);
        return c85442;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Class m7310(InterfaceC5925 interfaceC5925) {
        interfaceC5925.getClass();
        Class clsMo9438 = ((InterfaceC5219) interfaceC5925).mo9438();
        if (clsMo9438.isPrimitive()) {
            return clsMo9438;
        }
        String name = clsMo9438.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static int m7311(byte[] bArr) {
        if (bArr.length != 8 || bArr[0] != 100 || bArr[1] != 101 || bArr[2] != 120 || bArr[3] != 10 || bArr[7] != 0) {
            return -1;
        }
        String str = "" + ((char) bArr[4]) + ((char) bArr[5]) + ((char) bArr[6]);
        if (str.equals("035")) {
            return 13;
        }
        if (str.equals("037")) {
            return 24;
        }
        if (str.equals("038")) {
            return 26;
        }
        if (str.equals("039")) {
            return 28;
        }
        if (str.equals("040")) {
            return 10000;
        }
        return str.equals("039") ? 28 : -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final int m7312(String str) {
        int iM10730;
        char c = File.separatorChar;
        int iM107302 = AbstractC5976.m10730(str, c, 0, 4);
        if (iM107302 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c || (iM10730 = AbstractC5976.m10730(str, c, 2, 4)) < 0) {
                return 1;
            }
            int iM107303 = AbstractC5976.m10730(str, c, iM10730 + 1, 4);
            return iM107303 >= 0 ? iM107303 + 1 : str.length();
        }
        if (iM107302 > 0 && str.charAt(iM107302 - 1) == ':') {
            return iM107302 + 1;
        }
        if (iM107302 == -1 && AbstractC5976.m10718(str, ':')) {
            return str.length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static Intent m7313() {
        Class clsM12425 = AbstractC7166.m12425("mqq.app.NewIntent");
        Intent intent = (Intent) AbstractC3738.m6845(new Object[]{AbstractC7165.m12416(AbstractC7166.m12425("mqq.app.MobileQQ"), null, "sMobileQQ"), AbstractC7166.m12425("com.tencent.mobileqq.qwallet.e.a")}, new Class[]{Context.class, Class.class}, clsM12425);
        intent.putExtra("cmd", "trpc.qqhb.qqhb_proxy.Handler.sso_handle");
        return intent;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C7799 m7314(C7800 c7800, C5520 c5520, C7727 c7727) {
        c7800.getClass();
        c5520.getClass();
        c7727.getClass();
        C3075 c3075M12845 = c7800.m12845(c5520, c7727);
        if (c3075M12845 != null) {
            return (C7799) c3075M12845.f6882;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C8954 m7315(InterfaceC4889 interfaceC4889, C8954 c8954) {
        C8954 c8954M14141;
        interfaceC4889.getClass();
        if (c8954 == null) {
            C0923 c0923Mo943 = interfaceC4889.mo9020().mo943();
            String[] strArr = AbstractC8944.f22758;
            String strM821 = c0923Mo943.m821("Content-Type");
            if (strM821 != null) {
                try {
                    C8954 c89542 = C8954.f22769;
                    c8954M14141 = C8942.m14141(strM821);
                } catch (BadContentTypeFormatException unused) {
                    c8954M14141 = null;
                }
                c8954 = c8954M14141;
                if (c8954 == null) {
                    c8954 = AbstractC8935.f22735;
                }
            }
        }
        return (AbstractC7082.m12300(c8954) == null && c8954.m14148(AbstractC8935.f22736)) ? AbstractC7082.m12295(c8954, AbstractC5964.f15033) : c8954;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Class m7316(InterfaceC5925 interfaceC5925) {
        interfaceC5925.getClass();
        Class clsMo9438 = ((InterfaceC5219) interfaceC5925).mo9438();
        clsMo9438.getClass();
        return clsMo9438;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final Class m7317(InterfaceC5925 interfaceC5925) {
        interfaceC5925.getClass();
        Class clsMo9438 = ((InterfaceC5219) interfaceC5925).mo9438();
        if (clsMo9438.isPrimitive()) {
            String name = clsMo9438.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsMo9438;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final InterfaceC8366 m7318(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(C0328R.id.view_tree_saved_state_registry_owner);
            InterfaceC8366 interfaceC8366 = tag instanceof InterfaceC8366 ? (InterfaceC8366) tag : null;
            if (interfaceC8366 != null) {
                return interfaceC8366;
            }
            Object objM8873 = AbstractC4765.m8873(view);
            view = objM8873 instanceof View ? (View) objM8873 : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final InterfaceC5925 m7319(Annotation annotation) {
        annotation.getClass();
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        clsAnnotationType.getClass();
        return AbstractC5228.f13320.mo9476(clsAnnotationType);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public abstract HuffmanState mo7320();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public abstract int mo7321();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public abstract int mo7322(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public abstract boolean mo7323();
}

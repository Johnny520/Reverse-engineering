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
import androidx.activity.AbstractC0053;
import androidx.appcompat.widget.C0137;
import androidx.compose.ui.graphics.vector.C1543;
import androidx.compose.ui.platform.C1862;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2035;
import androidx.core.view.AbstractC2267;
import androidx.core.view.C2242;
import com.alibaba.fastjson2.AbstractC2905;
import com.davemorrissey.labs.subscaleview.R;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import io.ktor.client.plugins.AbstractC3933;
import io.ktor.util.C4211;
import java.io.File;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptyList;
import kotlin.io.C4377;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.jvm.internal.InterfaceC4387;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4434;
import kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.sequences.C5128;
import kotlin.text.AbstractC5144;
import org.apache.commons.compress.compressors.deflate64.HuffmanState;
import p007.C6151;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p034.AbstractC6347;
import p052.InterfaceC6554;
import p053.AbstractC6561;
import p070.C6898;
import p077.C6970;
import p077.C6971;
import p097.AbstractC7225;
import p142.InterfaceC7537;
import p168.C7715;
import p168.InterfaceC7716;
import p175.AbstractC7739;
import p251.C8169;
import p251.C8170;
import p251.C8171;
import p251.C8172;
import p251.C8174;
import p251.C8177;
import p251.C8180;
import p251.C8181;
import p251.C8184;
import p251.SharedPreferencesC8176;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.C5925;
import top.suzhelan.qstory.hook.item.mcp.config.C5872;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3057 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C1543 f9764;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C4434 f9765;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static void m6732(CheckableImageButton checkableImageButton, CharSequence charSequence) {
        if (!checkableImageButton.isFocusable()) {
            charSequence = null;
        }
        checkableImageButton.setTooltipText(charSequence);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final void m6733(long j, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C4377 m6734(File file) {
        List list;
        String path = file.getPath();
        path.getClass();
        int iM6752 = m6752(path);
        String strSubstring = path.substring(0, iM6752);
        String strSubstring2 = path.substring(iM6752);
        if (strSubstring2.length() == 0) {
            list = EmptyList.INSTANCE;
        } else {
            List listM10150 = AbstractC5144.m10150(strSubstring2, new char[]{File.separatorChar});
            ArrayList arrayList = new ArrayList(AbstractC4345.m8822(listM10150, 10));
            Iterator it = listM10150.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new C4377(new File(strSubstring), list);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m6735(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
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
    public static final String[] m6736(Metadata metadata) {
        String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 != null) {
            return strArrD1;
        }
        throw new InconsistentKotlinMetadataException("Metadata is missing: kotlin.Metadata.data1 must not be an empty array", null, 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static void m6737(TextView textView, ArrayList arrayList) {
        int i = 0;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((C5872) it.next()).f16042 && (i = i + 1) < 0) {
                    AbstractC6347.m11921();
                    throw null;
                }
            }
        }
        textView.setText(AbstractC8405.m13972(2289) + i + AbstractC8405.m13973("喵呜喵呜喵喵呜呜~喵呜喵呜呜喵呜喵~喵呜喵呜呜喵呜喵") + arrayList.size() + AbstractC8405.m13972(2290)); /* decoded: m13972(2289)=已启用  ; m13972(2290)= 个 MCP，长按右侧拖动柄可调整顺序 */ /* decoded-inline:  /  */
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final long m6738(long j, long j2) {
        int iM3751;
        int iM3757 = C2035.m3757(j);
        int iM3750 = C2035.m3750(j);
        if ((C2035.m3757(j2) < C2035.m3750(j)) && (C2035.m3757(j) < C2035.m3750(j2))) {
            if (C2035.m3755(j2, j)) {
                iM3757 = C2035.m3757(j2);
                iM3750 = iM3757;
            } else {
                if (C2035.m3755(j, j2)) {
                    iM3751 = C2035.m3751(j2);
                } else {
                    int iM37572 = C2035.m3757(j2);
                    if (iM3757 >= C2035.m3750(j2) || iM37572 > iM3757) {
                        iM3750 = C2035.m3757(j2);
                    } else {
                        iM3757 = C2035.m3757(j2);
                        iM3751 = C2035.m3751(j2);
                    }
                }
                iM3750 -= iM3751;
            }
        } else if (iM3750 > C2035.m3757(j2)) {
            iM3757 -= C2035.m3751(j2);
            iM3751 = C2035.m3751(j2);
            iM3750 -= iM3751;
        }
        return AbstractC2048.m3770(iM3757, iM3750);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final TypeVariance m6739(Variance variance) {
        int i = AbstractC7225.f19268[variance.ordinal()];
        if (i == 1) {
            return TypeVariance.INV;
        }
        if (i == 2) {
            return TypeVariance.IN;
        }
        if (i == 3) {
            return TypeVariance.OUT;
        }
        C4211.m8611();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static ImageView.ScaleType m6740(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m6741(View view) {
        view.getClass();
        C5128 c5128M12045 = AbstractC6561.m12045((InterfaceC6554) AbstractC2267.m4225(view).f12928);
        while (c5128M12045.hasNext()) {
            ArrayList arrayList = m6749((View) c5128M12045.next()).f20929;
            for (int iM11901 = AbstractC6347.m11901(arrayList); -1 < iM11901; iM11901--) {
                ((C1862) ((InterfaceC7716) arrayList.get(iM11901))).f5365.m3495();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m6742(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
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
    public static String m6743(int i) {
        String str = "039";
        if (i < 28) {
            if (i >= 10000) {
                str = "040";
            } else if (i < 28) {
                str = i >= 26 ? "038" : i >= 24 ? "037" : "035";
            }
        }
        return AbstractC0053.m158("dex\n", str, "\u0000");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static void m6744(SharedPreferencesC8176 sharedPreferencesC8176, C0137 c0137, C4485 c4485, byte b, String str, int i) {
        HashMap map = sharedPreferencesC8176.f22535;
        if (b == 1) {
            byte[] bArr = (byte[]) c0137.f594;
            int i2 = c0137.f596;
            c0137.f596 = i2 + 1;
            map.put(str, new C8172(i, bArr[i2] == 1));
            return;
        }
        if (b == 2) {
            int iM565 = c0137.m565();
            if (c4485 != null) {
                c4485.m9059(iM565);
            }
            map.put(str, new C8169(i, iM565));
            return;
        }
        if (b == 3) {
            int iM5652 = c0137.m565();
            if (c4485 != null) {
                c4485.m9059(iM5652);
            }
            map.put(str, new C8170(i, Float.intBitsToFloat(iM5652)));
            return;
        }
        if (b != 4) {
            long jM581 = c0137.m581(c0137.f596);
            c0137.f596 += 8;
            if (c4485 != null) {
                c4485.m9056(jM581);
            }
            map.put(str, new C8171(i, Double.longBitsToDouble(jM581)));
            return;
        }
        long jM5812 = c0137.m581(c0137.f596);
        c0137.f596 += 8;
        if (c4485 != null) {
            c4485.m9056(jM5812);
        }
        map.put(str, new C8181(i, jM5812));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static C6151 m6745(String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length % 2 != 0) {
            C5925.m11310("Expected alternating header names and values");
            return null;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        int length = strArr3.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr3[i2] == null) {
                C5925.m11310("Headers cannot be null");
                return null;
            }
            strArr3[i2] = AbstractC5144.m10155(strArr2[i2]).toString();
        }
        int iM8307 = AbstractC3933.m8307(0, strArr3.length - 1, 2);
        if (iM8307 >= 0) {
            while (true) {
                String str = strArr3[i];
                String str2 = strArr3[i + 1];
                AbstractC7739.m13058(str);
                AbstractC7739.m13057(str2, str);
                if (i == iM8307) {
                    break;
                }
                i += 2;
            }
        }
        return new C6151(strArr3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static void m6746(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
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
    public static void m6747(SharedPreferencesC8176 sharedPreferencesC8176, C0137 c0137, C4485 c4485, byte b, String str, int i, int i2, byte b2) throws Exception {
        Object objM9057;
        int length;
        C0137 c01372;
        byte b3 = b;
        HashMap map = sharedPreferencesC8176.f22535;
        boolean z = b3 == 9 || b3 == 10 || b3 == 11;
        int iM565 = z ? c0137.m565() : c0137.m584() & 65535;
        int i3 = z ? 4 : 2;
        boolean z2 = (b2 & 64) != 0;
        if (z2 && iM565 != 32) {
            C5925.m11311("name size not match");
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
            map.put(str, new C8184(i2, i + i3, z2 ? c0137.m585(iM565) : c0137.m583(c4485, iM565), iM565, z2));
            return;
        }
        if (b3 == 7) {
            if (z2) {
                objM9057 = c0137.m585(iM565);
            } else {
                c0137.getClass();
                byte[] bArr = new byte[iM565];
                System.arraycopy((byte[]) c0137.f594, c0137.f596, bArr, 0, iM565);
                c0137.f596 += iM565;
                objM9057 = c4485 != null ? c4485.m9057(bArr) : bArr;
            }
            map.put(str, new C8174(i2, i + i3, objM9057, iM565, z2));
            return;
        }
        if (z2) {
            map.put(str, new C8180(i2, i + i3, c0137.m585(iM565), iM565, true));
            return;
        }
        if (c4485 == null) {
            c01372 = sharedPreferencesC8176.f22538;
            length = iM565;
        } else {
            byte[] bArr2 = new byte[iM565];
            C0137 c01373 = sharedPreferencesC8176.f22538;
            System.arraycopy((byte[]) c01373.f594, c01373.f596, bArr2, 0, iM565);
            byte[] bArrM9057 = c4485.m9057(bArr2);
            C0137 c01374 = new C0137(bArrM9057, 0);
            length = bArrM9057.length;
            c01372 = c01374;
        }
        byte[] bArr3 = (byte[]) c01372.f594;
        int i4 = c01372.f596;
        c01372.f596 = i4 + 1;
        int i5 = bArr3[i4] & DefaultClassResolver.NAME;
        String strM585 = c01372.m585(i5);
        C8177 c8177 = (C8177) sharedPreferencesC8176.f22519.get(strM585);
        int i6 = length - (i5 + 1);
        if (i6 < 0) {
            throw new Exception("parse dara failed");
        }
        if (c8177 != null) {
            try {
                C8180 c8180 = new C8180(i2, i + 2, C8177.m13671(c01372.f596, (byte[]) c01372.f594, i6), iM565, false);
                c8180.f22545 = c8177;
                map.put(str, c8180);
            } catch (Exception e) {
                Log.e("FastKV", sharedPreferencesC8176.f22520, e);
            }
        } else {
            AbstractC3066.m6866(sharedPreferencesC8176, "object with tag: " + strM585 + " without encoder");
        }
        c0137.f596 = i + i3 + iM565;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ae, code lost:
    
        throw new java.lang.Exception("parse dara failed");
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m6748(p251.SharedPreferencesC8176 r16, boolean r17) {
        /*
            r0 = r16
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r8 = r0.f22518
            java.lang.String r9 = "FastKV"
            r10 = 0
            if (r17 == 0) goto L11
            if (r8 != 0) goto L11
            java.lang.String r1 = "miss cipher"
            com.bumptech.glide.AbstractC3066.m6866(r0, r1)
            return r10
        L11:
            if (r17 == 0) goto L15
            r2 = r8
            goto L17
        L15:
            r1 = 0
            r2 = r1
        L17:
            androidx.appcompat.widget.飘花落叶言子世苏楪哲兰 r1 = r0.f22538
            java.lang.String r11 = r0.f22520
            r12 = 12
            r1.f596 = r12
        L1f:
            int r6 = r1.f596     // Catch: java.lang.Exception -> L53
            int r3 = r0.f22517     // Catch: java.lang.Exception -> L53
            java.lang.String r4 = "parse dara failed"
            r5 = 1
            if (r6 >= r3) goto Laf
            java.lang.Object r3 = r1.f594     // Catch: java.lang.Exception -> L53
            byte[] r3 = (byte[]) r3     // Catch: java.lang.Exception -> L53
            int r7 = r6 + 1
            r1.f596 = r7     // Catch: java.lang.Exception -> L53
            r13 = r7
            r7 = r3[r6]     // Catch: java.lang.Exception -> L53
            r14 = r7 & 63
            byte r14 = (byte) r14     // Catch: java.lang.Exception -> L53
            if (r14 < r5) goto La9
            r15 = 11
            if (r14 > r15) goto La9
            int r4 = r6 + 2
            r1.f596 = r4     // Catch: java.lang.Exception -> L53
            r3 = r3[r13]     // Catch: java.lang.Exception -> L53
            r3 = r3 & 255(0xff, float:3.57E-43)
            if (r3 == 0) goto La1
            r13 = 5
            if (r7 >= 0) goto L8c
            int r4 = r4 + r3
            r1.f596 = r4     // Catch: java.lang.Exception -> L53
            if (r14 > r13) goto L56
            int[] r3 = p251.SharedPreferencesC8176.f22513     // Catch: java.lang.Exception -> L53
            r3 = r3[r14]     // Catch: java.lang.Exception -> L53
            goto L71
        L53:
            r0 = move-exception
            goto Lc4
        L56:
            r3 = 9
            if (r14 == r3) goto L62
            r3 = 10
            if (r14 == r3) goto L62
            if (r14 != r15) goto L61
            goto L62
        L61:
            r5 = r10
        L62:
            if (r5 == 0) goto L69
            int r3 = r1.m565()     // Catch: java.lang.Exception -> L53
            goto L71
        L69:
            short r3 = r1.m584()     // Catch: java.lang.Exception -> L53
            r4 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r4
        L71:
            int r4 = r1.f596     // Catch: java.lang.Exception -> L53
            int r4 = r4 + r3
            r1.f596 = r4     // Catch: java.lang.Exception -> L53
            int r3 = r0.f22532     // Catch: java.lang.Exception -> L53
            int r5 = r4 - r6
            int r5 = r5 + r3
            r0.f22532 = r5     // Catch: java.lang.Exception -> L53
            java.util.ArrayList r3 = r0.f22533     // Catch: java.lang.Exception -> L53
            飘花落叶言楪兰子苏哲世.飘花落叶言子楪哲苏兰世 r5 = new 飘花落叶言楪兰子苏哲世.飘花落叶言子楪哲苏兰世     // Catch: java.lang.Exception -> L53
            r5.<init>()     // Catch: java.lang.Exception -> L53
            r5.f22544 = r6     // Catch: java.lang.Exception -> L53
            r5.f22543 = r4     // Catch: java.lang.Exception -> L53
            r3.add(r5)     // Catch: java.lang.Exception -> L53
            goto L1f
        L8c:
            java.lang.String r4 = r1.m583(r2, r3)     // Catch: java.lang.Exception -> L53
            int r5 = r1.f596     // Catch: java.lang.Exception -> L53
            if (r14 > r13) goto L9b
            r3 = r14
            m6744(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L53
            r0 = r16
            goto L1f
        L9b:
            r3 = r14
            m6747(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L53
            goto L1f
        La1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L53
            java.lang.String r1 = "invalid key size"
            r0.<init>(r1)     // Catch: java.lang.Exception -> L53
            throw r0     // Catch: java.lang.Exception -> L53
        La9:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Exception -> L53
            r0.<init>(r4)     // Catch: java.lang.Exception -> L53
            throw r0     // Catch: java.lang.Exception -> L53
        Laf:
            if (r6 == r3) goto Lba
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r4)
            android.util.Log.e(r9, r11, r0)
            return r10
        Lba:
            if (r17 != 0) goto Lc1
            if (r8 == 0) goto Lc1
            if (r3 == r12) goto Lc1
            r10 = r5
        Lc1:
            r0.f22529 = r10
            return r5
        Lc4:
            android.util.Log.e(r9, r11, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.AbstractC3057.m6748(飘花落叶言楪兰子苏哲世.飘花落叶言子楪哲世苏兰, boolean):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C7715 m6749(View view) {
        C7715 c7715 = (C7715) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (c7715 != null) {
            return c7715;
        }
        C7715 c77152 = new C7715();
        view.setTag(R.id.pooling_container_listener_holder_tag, c77152);
        return c77152;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Class m6750(InterfaceC5093 interfaceC5093) {
        interfaceC5093.getClass();
        Class clsMo8879 = ((InterfaceC4387) interfaceC5093).mo8879();
        if (clsMo8879.isPrimitive()) {
            return clsMo8879;
        }
        String name = clsMo8879.getName();
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
    public static int m6751(byte[] bArr) {
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
    public static final int m6752(String str) {
        int iM10171;
        char c = File.separatorChar;
        int iM101712 = AbstractC5144.m10171(str, c, 0, 4);
        if (iM101712 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c || (iM10171 = AbstractC5144.m10171(str, c, 2, 4)) < 0) {
                return 1;
            }
            int iM101713 = AbstractC5144.m10171(str, c, iM10171 + 1, 4);
            return iM101713 >= 0 ? iM101713 + 1 : str.length();
        }
        if (iM101712 > 0 && str.charAt(iM101712 - 1) == ':') {
            return iM101712 + 1;
        }
        if (iM101712 == -1 && AbstractC5144.m10159(str, ':')) {
            return str.length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static Intent m6753() {
        Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(401)); /* decoded: m13972(401)=mqq.app.NewIntent */
        Intent intent = (Intent) AbstractC2905.m6285(new Object[]{AbstractC6336.m11857(AbstractC6337.m11866(AbstractC8405.m13972(332)), null, AbstractC8405.m13972(402)), AbstractC6337.m11866(AbstractC8405.m13972(403))}, new Class[]{Context.class, Class.class}, clsM11866); /* decoded: m13972(332)=mqq.app.MobileQQ ; m13972(402)=sMobileQQ ; m13972(403)=com.tencent.mobileqq.qwallet.e.a */
        intent.putExtra(AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜呜呜喵"), AbstractC8405.m13972(404)); /* decoded: m13972(404)=trpc.qqhb.qqhb_proxy.Handler.sso_handle */ /* decoded-inline: cmd */
        return intent;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C6970 m6754(C6971 c6971, C4688 c4688, C6898 c6898) {
        c6971.getClass();
        c4688.getClass();
        c6898.getClass();
        C2242 c2242M12286 = c6971.m12286(c4688, c6898);
        if (c2242M12286 != null) {
            return (C6970) c2242M12286.f6537;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p236.C8125 m6755(io.ktor.server.application.InterfaceC4057 r0, p236.C8125 r1) {
        /*
            r0.getClass()
            if (r1 != 0) goto L25
            io.ktor.server.response.飘花落叶言子楪世苏哲兰 r0 = r0.mo8461()
            androidx.appcompat.app.飘花落叶言子世楪苏兰哲 r0 = r0.mo383()
            java.lang.String[] r1 = p236.AbstractC8115.f22413
            java.lang.String r1 = "Content-Type"
            java.lang.String r0 = r0.m261(r1)
            if (r0 == 0) goto L23
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰 r1 = p236.C8125.f22424     // Catch: io.ktor.http.BadContentTypeFormatException -> L1f
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰 r0 = p236.C8113.m13582(r0)     // Catch: io.ktor.http.BadContentTypeFormatException -> L1f
        L1d:
            r1 = r0
            goto L21
        L1f:
            r0 = 0
            goto L1d
        L21:
            if (r1 != 0) goto L25
        L23:
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰 r1 = p236.AbstractC8106.f22390
        L25:
            java.nio.charset.Charset r0 = p018.AbstractC6253.m11741(r1)
            if (r0 != 0) goto L39
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰 r0 = p236.AbstractC8106.f22391
            boolean r0 = r1.m13589(r0)
            if (r0 == 0) goto L39
            java.nio.charset.Charset r0 = kotlin.text.AbstractC5132.f14688
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰 r1 = p018.AbstractC6253.m11736(r1, r0)
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.AbstractC3057.m6755(io.ktor.server.application.飘花落叶言子楪世苏兰哲, 飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰):飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Class m6756(InterfaceC5093 interfaceC5093) {
        interfaceC5093.getClass();
        Class clsMo8879 = ((InterfaceC4387) interfaceC5093).mo8879();
        clsMo8879.getClass();
        return clsMo8879;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final Class m6757(InterfaceC5093 interfaceC5093) {
        interfaceC5093.getClass();
        Class clsMo8879 = ((InterfaceC4387) interfaceC5093).mo8879();
        if (clsMo8879.isPrimitive()) {
            String name = clsMo8879.getName();
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
        return clsMo8879;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final InterfaceC7537 m6758(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            InterfaceC7537 interfaceC7537 = tag instanceof InterfaceC7537 ? (InterfaceC7537) tag : null;
            if (interfaceC7537 != null) {
                return interfaceC7537;
            }
            Object objM8314 = AbstractC3933.m8314(view);
            view = objM8314 instanceof View ? (View) objM8314 : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final InterfaceC5093 m6759(Annotation annotation) {
        annotation.getClass();
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        clsAnnotationType.getClass();
        return AbstractC4396.f12975.mo8917(clsAnnotationType);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public abstract HuffmanState mo6760();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public abstract int mo6761();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public abstract int mo6762(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public abstract boolean mo6763();
}

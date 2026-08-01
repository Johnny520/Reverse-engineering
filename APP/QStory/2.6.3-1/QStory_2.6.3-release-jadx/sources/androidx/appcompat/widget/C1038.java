package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0955;
import androidx.collection.AbstractC1132;
import androidx.collection.C1082;
import androidx.compose.p001ui.graphics.C2444;
import androidx.compose.p001ui.layout.AbstractC2555;
import androidx.core.util.C3018;
import androidx.core.view.AbstractC3103;
import androidx.recyclerview.widget.C3287;
import androidx.recyclerview.widget.C3293;
import androidx.recyclerview.widget.C3330;
import androidx.recyclerview.widget.RecyclerView;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5976;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.internal.AbstractC6339;
import kotlinx.serialization.json.internal.C6320;
import p050.AbstractC7173;
import p104.C8006;
import p191.AbstractC8568;
import p204.AbstractC8602;
import p321.C9457;
import p321.C9469;
import p321.C9470;
import p321.C9472;
import p330.AbstractC9490;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C1038 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Object f1091;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object f1092;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f1093;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f1094;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f1095;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f1096;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Object f1097;

    public C1038(C3287 c3287) {
        this.f1096 = 2;
        this.f1094 = new C3018(30);
        this.f1093 = new ArrayList();
        this.f1092 = new ArrayList();
        this.f1095 = 0;
        this.f1091 = c3287;
        this.f1097 = new C3293(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m1212(C1038 c1038, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = c1038.f1095;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        c1038.m1240(i, str, str2);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static C1038 m1213(Context context, int i) {
        AbstractC7173.m12431("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC9490.f24783);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListM13632 = AbstractC8568.m13632(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListM136322 = AbstractC8568.m13632(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListM136323 = AbstractC8568.m13632(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(6, 0);
        C9457 c9457 = new C9457(0.0f);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        C9469 c9469M14878 = C9469.m14879(contextThemeWrapper.obtainStyledAttributes(AbstractC9490.f24756), c9457).m14878();
        typedArrayObtainStyledAttributes.recycle();
        return new C1038(colorStateListM13632, colorStateListM136322, colorStateListM136323, dimensionPixelSize, c9469M14878, rect);
    }

    public String toString() {
        switch (this.f1096) {
            case 4:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f1097);
                sb.append("', currentPosition=");
                return AbstractC0900.m716(sb, this.f1095, ')');
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public int m1214(int i, int i2) {
        int i3;
        int i4;
        C3018 c3018 = (C3018) this.f1094;
        ArrayList arrayList = (ArrayList) this.f1092;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C3330 c3330 = (C3330) arrayList.get(size);
            int i5 = c3330.f7825;
            int i6 = c3330.f7824;
            if (i5 == 8) {
                int i7 = c3330.f7822;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c3330.f7824 = i6 + 1;
                            c3330.f7822 = i7 + 1;
                        } else if (i2 == 2) {
                            c3330.f7824 = i6 - 1;
                            c3330.f7822 = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        c3330.f7822 = i7 + 1;
                    } else if (i2 == 2) {
                        c3330.f7822 = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c3330.f7824 = i6 + 1;
                    } else if (i2 == 2) {
                        c3330.f7824 = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= c3330.f7822;
                } else if (i5 == 2) {
                    i += c3330.f7822;
                }
            } else if (i2 == 1) {
                c3330.f7824 = i6 + 1;
            } else if (i2 == 2) {
                c3330.f7824 = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C3330 c33302 = (C3330) arrayList.get(size2);
            int i8 = c33302.f7825;
            int i9 = c33302.f7822;
            if (i8 == 8) {
                if (i9 == c33302.f7824 || i9 < 0) {
                    arrayList.remove(size2);
                    c33302.f7823 = null;
                    c3018.mo4549(c33302);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                c33302.f7823 = null;
                c3018.mo4549(c33302);
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public void m1215(char c) {
        String str = (String) this.f1097;
        int i = this.f1095;
        if (i > 0 && c == '\"') {
            try {
                this.f1095 = i - 1;
                String strM1246 = m1246();
                this.f1095 = i;
                if (AbstractC5227.m9466(strM1246, "null")) {
                    m1240(this.f1095 - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f1095 = i;
                throw th;
            }
        }
        String strM11304 = AbstractC6339.m11304(AbstractC6339.m11298(c));
        int i2 = this.f1095;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        m1212(this, "Expected " + strM11304 + ", but had '" + ((i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3))) + "' instead", i3, null, 4);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public void m1216(TextView textView) {
        ColorStateList colorStateList = (ColorStateList) this.f1093;
        C9472 c9472 = new C9472();
        C9472 c94722 = new C9472();
        C9469 c9469 = (C9469) this.f1097;
        c9472.setShapeAppearanceModel(c9469);
        c94722.setShapeAppearanceModel(c9469);
        c9472.m14900((ColorStateList) this.f1092);
        float f = this.f1095;
        ColorStateList colorStateList2 = (ColorStateList) this.f1091;
        c9472.f24669.f24638 = f;
        c9472.invalidateSelf();
        C9470 c9470 = c9472.f24669;
        if (c9470.f24625 != colorStateList2) {
            c9470.f24625 = colorStateList2;
            c9472.onStateChange(c9472.getState());
        }
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), c9472, c94722);
        Rect rect = (Rect) this.f1094;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public boolean m1217() {
        int iM1220 = m1220();
        String str = (String) this.f1097;
        if (iM1220 >= str.length() || iM1220 == -1 || str.charAt(iM1220) != ',') {
            return false;
        }
        this.f1095++;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public void m1218(ColorStateList colorStateList) {
        if (((C0987) this.f1091) == null) {
            this.f1091 = new C0987();
        }
        C0987 c0987 = (C0987) this.f1091;
        c0987.f945 = colorStateList;
        c0987.f946 = true;
        m1238();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public void m1219(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C0987) this.f1092) == null) {
                this.f1092 = new C0987();
            }
            C0987 c0987 = (C0987) this.f1092;
            c0987.f945 = colorStateList;
            c0987.f946 = true;
        } else {
            this.f1092 = null;
        }
        m1238();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public int m1220() {
        char cCharAt;
        int i = this.f1095;
        if (i == -1) {
            return i;
        }
        String str = (String) this.f1097;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.f1095 = i;
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public void m1221(PorterDuff.Mode mode) {
        if (((C0987) this.f1091) == null) {
            this.f1091 = new C0987();
        }
        C0987 c0987 = (C0987) this.f1091;
        c0987.f944 = mode;
        c0987.f947 = true;
        m1238();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public String m1222(String str, boolean z) {
        str.getClass();
        int i = this.f1095;
        try {
            if (m1251() == 6 && AbstractC5227.m9466(m1232(z), str)) {
                this.f1092 = null;
                if (m1251() == 5) {
                    return m1232(z);
                }
            }
            return null;
        } finally {
            this.f1095 = i;
            this.f1092 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public void m1223(int i) {
        ColorStateList colorStateListM1192;
        this.f1095 = i;
        C0977 c0977 = (C0977) this.f1093;
        if (c0977 != null) {
            Context context = ((View) this.f1094).getContext();
            synchronized (c0977) {
                colorStateListM1192 = c0977.f917.m1192(context, i);
            }
        } else {
            colorStateListM1192 = null;
        }
        m1219(colorStateListM1192);
        m1238();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public void m1224() {
        this.f1095 = -1;
        m1219(null);
        m1238();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public C3330 m1225(Object obj, int i, int i2, int i3) {
        C3330 c3330 = (C3330) ((C3018) this.f1094).acquire();
        if (c3330 != null) {
            c3330.f7825 = i;
            c3330.f7824 = i2;
            c3330.f7822 = i3;
            c3330.f7823 = obj;
            return c3330;
        }
        C3330 c33302 = new C3330();
        c33302.f7825 = i;
        c33302.f7824 = i2;
        c33302.f7822 = i3;
        c33302.f7823 = obj;
        return c33302;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public void m1226(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListM1192;
        View view = (View) this.f1094;
        Context context = view.getContext();
        int[] iArr = AbstractC8602.f21428;
        C0955 c0955M914 = C0955.m914(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) c0955M914.f665;
        View view2 = (View) this.f1094;
        AbstractC3103.m4803(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c0955M914.f665, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f1095 = typedArray.getResourceId(0, -1);
                C0977 c0977 = (C0977) this.f1093;
                Context context2 = view.getContext();
                int i2 = this.f1095;
                synchronized (c0977) {
                    colorStateListM1192 = c0977.f917.m1192(context2, i2);
                }
                if (colorStateListM1192 != null) {
                    m1219(colorStateListM1192);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(c0955M914.m945(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(AbstractC1063.m1282(typedArray.getInt(2, -1), null));
            }
            c0955M914.m923();
        } catch (Throwable th) {
            c0955M914.m923();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean m1227() {
        return ((ArrayList) this.f1093).size() > 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public void m1228(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C3330 c3330 = (C3330) arrayList.get(i);
            c3330.f7823 = null;
            ((C3018) this.f1094).mo4549(c3330);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public int m1229(int i) {
        if (i < ((String) this.f1097).length()) {
            return i;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m1230() {
        boolean z;
        byte b;
        C3330 c3330M1225;
        int i;
        int i2;
        C3330 c3330M12252;
        boolean z2;
        boolean z3;
        Object obj;
        C3330 c3330;
        C3018 c3018 = (C3018) this.f1094;
        C3287 c3287 = (C3287) this.f1091;
        C3293 c3293 = (C3293) this.f1097;
        ArrayList arrayList = (ArrayList) this.f1093;
        c3293.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((C3330) arrayList.get(size)).f7825 == 8) {
                    if (z4) {
                        break;
                    }
                } else {
                    z4 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i3 = size + 1;
            C1038 c1038 = (C1038) c3293.f7673;
            C3018 c30182 = (C3018) c1038.f1094;
            C3330 c33302 = (C3330) arrayList.get(size);
            C3330 c33303 = (C3330) arrayList.get(i3);
            int i4 = c33303.f7825;
            if (i4 == 1) {
                int i5 = c33302.f7822;
                int i6 = c33303.f7824;
                int i7 = i5 < i6 ? -1 : 0;
                int i8 = c33302.f7824;
                if (i8 < i6) {
                    i7++;
                }
                if (i6 <= i8) {
                    c33302.f7824 = i8 + c33303.f7822;
                }
                int i9 = c33303.f7824;
                if (i9 <= i5) {
                    c33302.f7822 = i5 + c33303.f7822;
                }
                c33303.f7824 = i9 + i7;
                arrayList.set(size, c33303);
                arrayList.set(i3, c33302);
            } else if (i4 == 2) {
                int i10 = c33302.f7824;
                int i11 = c33302.f7822;
                int i12 = c33303.f7824;
                if (i10 < i11) {
                    if (i12 == i10 && c33303.f7822 == i11 - i10) {
                        z2 = false;
                        z3 = true;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (i12 == i11 + 1 && c33303.f7822 == i10 - i11) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (i11 < i12) {
                    c33303.f7824 = i12 - 1;
                } else {
                    int i13 = c33303.f7822;
                    if (i11 < i12 + i13) {
                        c33303.f7822 = i13 - 1;
                        c33302.f7825 = 2;
                        c33302.f7822 = 1;
                        if (c33303.f7822 == 0) {
                            arrayList.remove(i3);
                            c33303.f7823 = null;
                            c30182.mo4549(c33303);
                        }
                    }
                }
                int i14 = c33302.f7824;
                int i15 = c33303.f7824;
                if (i14 <= i15) {
                    c33303.f7824 = i15 + 1;
                } else {
                    int i16 = i15 + c33303.f7822;
                    if (i14 < i16) {
                        obj = null;
                        C3330 c3330M12253 = c1038.m1225(null, 2, i14 + 1, i16 - i14);
                        c33303.f7822 = c33302.f7824 - c33303.f7824;
                        c3330 = c3330M12253;
                    }
                    if (z3) {
                        if (z2) {
                            if (c3330 != null) {
                                int i17 = c33302.f7824;
                                if (i17 > c3330.f7824) {
                                    c33302.f7824 = i17 - c3330.f7822;
                                }
                                int i18 = c33302.f7822;
                                if (i18 > c3330.f7824) {
                                    c33302.f7822 = i18 - c3330.f7822;
                                }
                            }
                            int i19 = c33302.f7824;
                            if (i19 > c33303.f7824) {
                                c33302.f7824 = i19 - c33303.f7822;
                            }
                            int i20 = c33302.f7822;
                            if (i20 > c33303.f7824) {
                                c33302.f7822 = i20 - c33303.f7822;
                            }
                        } else {
                            if (c3330 != null) {
                                int i21 = c33302.f7824;
                                if (i21 >= c3330.f7824) {
                                    c33302.f7824 = i21 - c3330.f7822;
                                }
                                int i22 = c33302.f7822;
                                if (i22 >= c3330.f7824) {
                                    c33302.f7822 = i22 - c3330.f7822;
                                }
                            }
                            int i23 = c33302.f7824;
                            if (i23 >= c33303.f7824) {
                                c33302.f7824 = i23 - c33303.f7822;
                            }
                            int i24 = c33302.f7822;
                            if (i24 >= c33303.f7824) {
                                c33302.f7822 = i24 - c33303.f7822;
                            }
                        }
                        arrayList.set(size, c33303);
                        if (c33302.f7824 != c33302.f7822) {
                            arrayList.set(i3, c33302);
                        } else {
                            arrayList.remove(i3);
                        }
                        if (c3330 != null) {
                            arrayList.add(size, c3330);
                        }
                    } else {
                        arrayList.set(size, c33303);
                        arrayList.remove(i3);
                        c33302.f7823 = obj;
                        c30182.mo4549(c33302);
                    }
                }
                obj = null;
                c3330 = null;
                if (z3) {
                }
            } else if (i4 == 4) {
                int i25 = c33302.f7822;
                int i26 = c33303.f7824;
                if (i25 < i26) {
                    c33303.f7824 = i26 - 1;
                } else {
                    int i27 = c33303.f7822;
                    if (i25 < i26 + i27) {
                        c33303.f7822 = i27 - 1;
                        c3330M1225 = c1038.m1225(c33303.f7823, 4, c33302.f7824, 1);
                    }
                    i = c33302.f7824;
                    i2 = c33303.f7824;
                    if (i > i2) {
                        c33303.f7824 = i2 + 1;
                    } else {
                        int i28 = i2 + c33303.f7822;
                        if (i < i28) {
                            int i29 = i28 - i;
                            c3330M12252 = c1038.m1225(c33303.f7823, 4, i + 1, i29);
                            c33303.f7822 -= i29;
                        }
                        arrayList.set(i3, c33302);
                        if (c33303.f7822 > 0) {
                            arrayList.set(size, c33303);
                        } else {
                            arrayList.remove(size);
                            c33303.f7823 = null;
                            c30182.mo4549(c33303);
                        }
                        if (c3330M1225 != null) {
                            arrayList.add(size, c3330M1225);
                        }
                        if (c3330M12252 != null) {
                            arrayList.add(size, c3330M12252);
                        }
                    }
                    c3330M12252 = null;
                    arrayList.set(i3, c33302);
                    if (c33303.f7822 > 0) {
                    }
                    if (c3330M1225 != null) {
                    }
                    if (c3330M12252 != null) {
                    }
                }
                c3330M1225 = null;
                i = c33302.f7824;
                i2 = c33303.f7824;
                if (i > i2) {
                }
                c3330M12252 = null;
                arrayList.set(i3, c33302);
                if (c33303.f7822 > 0) {
                }
                if (c3330M1225 != null) {
                }
                if (c3330M12252 != null) {
                }
            }
        }
        int size2 = arrayList.size();
        for (int i30 = 0; i30 < size2; i30++) {
            C3330 c3330M12254 = (C3330) arrayList.get(i30);
            int i31 = c3330M12254.f7825;
            if (i31 == 1) {
                m1231(c3330M12254);
            } else if (i31 == 2) {
                int i32 = c3330M12254.f7824;
                int i33 = c3330M12254.f7822 + i32;
                int i34 = i32;
                int i35 = 0;
                byte b2 = -1;
                while (i34 < i33) {
                    if (c3287.m5391(i34) != null || m1236(i34)) {
                        if (b2 == 0) {
                            m1247(m1225(null, 2, i32, i35));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 1;
                    } else {
                        if (b2 == 1) {
                            m1231(m1225(null, 2, i32, i35));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 0;
                    }
                    if (z) {
                        i34 -= i35;
                        i33 -= i35;
                        i35 = 1;
                    } else {
                        i35++;
                    }
                    i34++;
                    b2 = b;
                }
                if (i35 != c3330M12254.f7822) {
                    c3330M12254.f7823 = null;
                    c3018.mo4549(c3330M12254);
                    c3330M12254 = m1225(null, 2, i32, i35);
                }
                if (b2 == 0) {
                    m1247(c3330M12254);
                } else {
                    m1231(c3330M12254);
                }
            } else if (i31 == 4) {
                int i36 = c3330M12254.f7824;
                int i37 = c3330M12254.f7822 + i36;
                int i38 = i36;
                int i39 = 0;
                byte b3 = -1;
                while (i36 < i37) {
                    if (c3287.m5391(i36) != null || m1236(i36)) {
                        if (b3 == 0) {
                            m1247(m1225(c3330M12254.f7823, 4, i38, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        b3 = 1;
                    } else {
                        if (b3 == 1) {
                            m1231(m1225(c3330M12254.f7823, 4, i38, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        b3 = 0;
                    }
                    i39++;
                    i36++;
                }
                if (i39 != c3330M12254.f7822) {
                    Object obj2 = c3330M12254.f7823;
                    c3330M12254.f7823 = null;
                    c3018.mo4549(c3330M12254);
                    c3330M12254 = m1225(obj2, 4, i38, i39);
                }
                if (b3 == 0) {
                    m1247(c3330M12254);
                } else {
                    m1231(c3330M12254);
                }
            } else if (i31 == 8) {
                m1231(c3330M12254);
            }
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public void m1231(C3330 c3330) {
        C3287 c3287 = (C3287) this.f1091;
        ((ArrayList) this.f1092).add(c3330);
        int i = c3330.f7825;
        if (i == 1) {
            c3287.m5389(c3330.f7824, c3330.f7822);
            return;
        }
        if (i == 2) {
            int i2 = c3330.f7824;
            int i3 = c3330.f7822;
            RecyclerView recyclerView = c3287.f7649;
            recyclerView.m5261(i2, i3, false);
            recyclerView.f7561 = true;
            return;
        }
        if (i == 4) {
            c3287.m5390(c3330.f7823, c3330.f7824, c3330.f7822);
        } else if (i == 8) {
            c3287.m5388(c3330.f7824, c3330.f7822);
        } else {
            C5043.m9163(c3330, "Unknown update op type for ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public String m1232(boolean z) {
        String strM1253;
        byte bM1233 = m1233();
        if (z) {
            if (bM1233 != 1 && bM1233 != 0) {
                return null;
            }
            strM1253 = m1246();
        } else {
            if (bM1233 != 1) {
                return null;
            }
            strM1253 = m1253();
        }
        this.f1092 = strM1253;
        return strM1253;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public byte m1233() {
        String str = (String) this.f1097;
        int i = this.f1095;
        while (true) {
            int iM1229 = m1229(i);
            if (iM1229 == -1) {
                this.f1095 = iM1229;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iM1229);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f1095 = iM1229;
                return AbstractC6339.m11298(cCharAt);
            }
            i = iM1229 + 1;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public String m1234() {
        String string;
        StringBuilder sb = (StringBuilder) this.f1091;
        String str = (String) this.f1097;
        m1254('\"');
        int i = this.f1095;
        int iM10730 = AbstractC5976.m10730(str, '\"', i, 4);
        if (iM10730 == -1) {
            m1246();
            int i2 = this.f1095;
            m1212(this, AbstractC0900.m718("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        int i3 = i;
        while (i3 < iM10730) {
            if (str.charAt(i3) == '\\') {
                int iM1229 = this.f1095;
                char cCharAt = str.charAt(i3);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, iM1229, i3);
                        int iM12292 = m1229(i3 + 1);
                        if (iM12292 == -1) {
                            m1212(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iM1239 = iM12292 + 1;
                        char cCharAt2 = str.charAt(iM12292);
                        if (cCharAt2 == 'u') {
                            iM1239 = m1239(iM1239, str);
                        } else {
                            char c = cCharAt2 < 'u' ? C6320.f15513[cCharAt2] : (char) 0;
                            if (c == 0) {
                                m1212(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        iM1229 = m1229(iM1239);
                        if (iM1229 == -1) {
                            m1212(this, "Unexpected EOF", iM1229, null, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str.length()) {
                            sb.append((CharSequence) str, iM1229, i3);
                            iM1229 = m1229(i3);
                            if (iM1229 == -1) {
                                m1212(this, "Unexpected EOF", iM1229, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            cCharAt = str.charAt(i3);
                        }
                    }
                    i3 = iM1229;
                    z = true;
                    cCharAt = str.charAt(i3);
                }
                if (z) {
                    sb.append((CharSequence) str, iM1229, i3);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    string = string2;
                } else {
                    string = str.subSequence(iM1229, i3).toString();
                }
                this.f1095 = i3 + 1;
                return string;
            }
            i3++;
        }
        this.f1095 = iM10730 + 1;
        return str.substring(i, iM10730);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m1235(int i, String str) {
        String str2 = (String) this.f1097;
        if (str2.length() - i < str.length()) {
            m1212(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                m1212(this, "Expected valid boolean literal prefix, but had '" + m1246() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f1095 = str.length() + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean m1236(int i) {
        ArrayList arrayList = (ArrayList) this.f1092;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3330 c3330 = (C3330) arrayList.get(i2);
            int i3 = c3330.f7825;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = c3330.f7824;
                    int i5 = c3330.f7822 + i4;
                    while (i4 < i5) {
                        if (m1243(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m1243(c3330.f7822, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean m1237() {
        int i = this.f1095;
        if (i == -1) {
            return false;
        }
        String str = (String) this.f1097;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1095 = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.f1095 = i;
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m1238() {
        View view = (View) this.f1094;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((C0987) this.f1092) != null) {
                if (((C0987) this.f1097) == null) {
                    this.f1097 = new C0987();
                }
                C0987 c0987 = (C0987) this.f1097;
                c0987.f945 = null;
                c0987.f946 = false;
                c0987.f944 = null;
                c0987.f947 = false;
                WeakHashMap weakHashMap = AbstractC3103.f6939;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    c0987.f946 = true;
                    c0987.f945 = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    c0987.f947 = true;
                    c0987.f944 = backgroundTintMode;
                }
                if (c0987.f946 || c0987.f947) {
                    C0977.m1097(background, c0987, view.getDrawableState());
                    return;
                }
            }
            C0987 c09872 = (C0987) this.f1091;
            if (c09872 != null) {
                C0977.m1097(background, c09872, view.getDrawableState());
                return;
            }
            C0987 c09873 = (C0987) this.f1092;
            if (c09873 != null) {
                C0977.m1097(background, c09873, view.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int m1239(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.f1091).append((char) (m1244(i + 3, charSequence) + (m1244(i, charSequence) << 12) + (m1244(i + 1, charSequence) << 8) + (m1244(i + 2, charSequence) << 4)));
            return i2;
        }
        this.f1095 = i;
        if (i2 < charSequence.length()) {
            return m1239(this.f1095, charSequence);
        }
        m1212(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public void m1240(int i, String str, String str2) {
        String strM3523 = ((C2444) this.f1093).m3523();
        String str3 = (String) this.f1097;
        str3.getClass();
        String string = ((C8006) this.f1094).f19506 ? AbstractC6339.m11310(i, str3).toString() : null;
        throw new JsonDecodingException(AbstractC6339.m11317(str, strM3523, str2, i, string), str, i, strM3523, string, str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ColorStateList m1241() {
        C0987 c0987 = (C0987) this.f1091;
        if (c0987 != null) {
            return (ColorStateList) c0987.f945;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public PorterDuff.Mode m1242() {
        C0987 c0987 = (C0987) this.f1091;
        if (c0987 != null) {
            return (PorterDuff.Mode) c0987.f944;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int m1243(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f1092;
        int size = arrayList.size();
        while (i2 < size) {
            C3330 c3330 = (C3330) arrayList.get(i2);
            int i3 = c3330.f7825;
            int i4 = c3330.f7824;
            if (i3 == 8) {
                if (i4 == i) {
                    i = c3330.f7822;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c3330.f7822 <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = c3330.f7822;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += c3330.f7822;
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int m1244(int i, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        m1212(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public String m1245() {
        String strM1246 = m1246();
        if (!AbstractC5227.m9466(strM1246, "null") || ((String) this.f1097).charAt(this.f1095 - 1) == '\"') {
            return strM1246;
        }
        m1212(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public String m1246() {
        String string;
        StringBuilder sb = (StringBuilder) this.f1091;
        String str = (String) this.f1097;
        String str2 = (String) this.f1092;
        if (str2 != null) {
            str2.getClass();
            this.f1092 = null;
            return str2;
        }
        int iM1220 = m1220();
        if (iM1220 >= str.length() || iM1220 == -1) {
            m1212(this, "EOF", iM1220, null, 4);
            throw null;
        }
        byte bM11298 = AbstractC6339.m11298(str.charAt(iM1220));
        if (bM11298 == 1) {
            return m1253();
        }
        if (bM11298 != 0) {
            m1212(this, "Expected beginning of the string, but got " + str.charAt(iM1220), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (AbstractC6339.m11298(str.charAt(iM1220)) == 0) {
            iM1220++;
            if (iM1220 >= str.length()) {
                sb.append((CharSequence) str, this.f1095, iM1220);
                int iM1229 = m1229(iM1220);
                if (iM1229 == -1) {
                    this.f1095 = iM1220;
                    sb.append((CharSequence) str, 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iM1220 = iM1229;
                z = true;
            }
        }
        int i = this.f1095;
        if (z) {
            sb.append((CharSequence) str, i, iM1220);
            String string3 = sb.toString();
            sb.setLength(0);
            string = string3;
        } else {
            string = str.subSequence(i, iM1220).toString();
        }
        this.f1095 = iM1220;
        return string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void m1247(C3330 c3330) {
        int i;
        C3018 c3018 = (C3018) this.f1094;
        int i2 = c3330.f7825;
        if (i2 == 1 || i2 == 8) {
            C6755.m11869("should not dispatch add or move for pre layout");
            return;
        }
        int iM1214 = m1214(c3330.f7824, i2);
        int i3 = c3330.f7824;
        int i4 = c3330.f7825;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                C5043.m9163(c3330, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < c3330.f7822; i6++) {
            int iM12142 = m1214((i * i6) + c3330.f7824, c3330.f7825);
            int i7 = c3330.f7825;
            if (i7 == 2 ? iM12142 != iM1214 : !(i7 == 4 && iM12142 == iM1214 + 1)) {
                C3330 c3330M1225 = m1225(c3330.f7823, i7, iM1214, i5);
                m1248(c3330M1225, i3);
                c3330M1225.f7823 = null;
                c3018.mo4549(c3330M1225);
                if (c3330.f7825 == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iM1214 = iM12142;
            } else {
                i5++;
            }
        }
        Object obj = c3330.f7823;
        c3330.f7823 = null;
        c3018.mo4549(c3330);
        if (i5 > 0) {
            C3330 c3330M12252 = m1225(obj, c3330.f7825, iM1214, i5);
            m1248(c3330M12252, i3);
            c3330M12252.f7823 = null;
            c3018.mo4549(c3330M12252);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public void m1248(C3330 c3330, int i) {
        C3287 c3287 = (C3287) this.f1091;
        c3287.m5392(c3330);
        int i2 = c3330.f7825;
        if (i2 != 2) {
            if (i2 != 4) {
                C6755.m11869("only remove and update ops can be dispatched in first pass");
                return;
            } else {
                c3287.m5390(c3330.f7823, i, c3330.f7822);
                return;
            }
        }
        int i3 = c3330.f7822;
        RecyclerView recyclerView = c3287.f7649;
        recyclerView.m5261(i, i3, true);
        recyclerView.f7561 = true;
        recyclerView.f7586.f7956 += i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void m1249() {
        C3287 c3287 = (C3287) this.f1091;
        m1252();
        ArrayList arrayList = (ArrayList) this.f1093;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C3330 c3330 = (C3330) arrayList.get(i);
            int i2 = c3330.f7825;
            if (i2 == 1) {
                c3287.m5392(c3330);
                c3287.m5389(c3330.f7824, c3330.f7822);
            } else if (i2 == 2) {
                c3287.m5392(c3330);
                int i3 = c3330.f7824;
                int i4 = c3330.f7822;
                RecyclerView recyclerView = c3287.f7649;
                recyclerView.m5261(i3, i4, true);
                recyclerView.f7561 = true;
                recyclerView.f7586.f7956 += i4;
            } else if (i2 == 4) {
                c3287.m5392(c3330);
                c3287.m5390(c3330.f7823, c3330.f7824, c3330.f7822);
            } else if (i2 == 8) {
                c3287.m5392(c3330);
                c3287.m5388(c3330.f7824, c3330.f7822);
            }
        }
        m1228(arrayList);
        this.f1095 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public byte m1250(byte b) {
        String str = (String) this.f1097;
        byte bM1251 = m1251();
        if (bM1251 == b) {
            return bM1251;
        }
        String strM11304 = AbstractC6339.m11304(b);
        int i = this.f1095;
        int i2 = i > 0 ? i - 1 : i;
        m1212(this, "Expected " + strM11304 + ", but had '" + ((i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2))) + "' instead", i2, null, 4);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public byte m1251() {
        String str = (String) this.f1097;
        int i = this.f1095;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1095 = i2;
                return AbstractC6339.m11298(cCharAt);
            }
            i = i2;
        }
        this.f1095 = str.length();
        return (byte) 10;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m1252() {
        ArrayList arrayList = (ArrayList) this.f1092;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C3287) this.f1091).m5392((C3330) arrayList.get(i));
        }
        m1228(arrayList);
        this.f1095 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public String m1253() {
        String str = (String) this.f1092;
        if (str == null) {
            return m1234();
        }
        str.getClass();
        this.f1092 = null;
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void m1254(char c) {
        int i = this.f1095;
        if (i == -1) {
            m1215(c);
            throw null;
        }
        String str = (String) this.f1097;
        while (i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1095 = i2;
                if (cCharAt == c) {
                    return;
                }
                m1215(c);
                throw null;
            }
            i = i2;
        }
        this.f1095 = -1;
        m1215(c);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017e, code lost:
    
        m1212(r22, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0197, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0198, code lost:
    
        m1212(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x019e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x019f, code lost:
    
        io.ktor.util.C5043.m9170();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a2, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01a3, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a5, code lost:
    
        if (r14 == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01a7, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ac, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01af, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b0, code lost:
    
        m1212(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01b5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01b6, code lost:
    
        m1212(r22, "Expected numeric literal", r12, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01bc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0104, code lost:
    
        m1212(r22, "Unexpected symbol '" + r15 + "' in numeric literal", r12, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0118, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011d, code lost:
    
        if (r12 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011f, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0121, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0122, code lost:
    
        if (r1 == r12) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0124, code lost:
    
        if (r14 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0128, code lost:
    
        if (r1 == (r12 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x012e, code lost:
    
        if (r20 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0130, code lost:
    
        if (r3 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0138, code lost:
    
        if (r2.charAt(r12) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013a, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x013d, code lost:
    
        m1212(r22, "Expected closing quotation mark", r12, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0144, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0145, code lost:
    
        m1212(r22, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x014c, code lost:
    
        r22.f1095 = r12;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0150, code lost:
    
        if (r21 == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0152, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0155, code lost:
    
        if (r11 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0157, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x015f, code lost:
    
        if (r11 != true) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0161, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0166, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x016b, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0171, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0179, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x017b, code lost:
    
        r10 = (long) r1;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long m1255() {
        boolean z;
        boolean z2;
        boolean z3;
        int iM1229 = m1229(m1220());
        String str = (String) this.f1097;
        if (iM1229 < str.length() && iM1229 != -1) {
            if (str.charAt(iM1229) == '\"') {
                iM1229++;
                if (iM1229 == str.length()) {
                    m1212(this, "EOF", 0, null, 6);
                    throw null;
                }
                z = true;
            } else {
                z = false;
            }
            int i = iM1229;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            long j = 0;
            long j2 = 0;
            while (true) {
                if (i == str.length()) {
                    z2 = z;
                    z3 = z5;
                    break;
                }
                char cCharAt = str.charAt(i);
                if ((cCharAt != 'e' && cCharAt != 'E') || z5) {
                    z2 = z;
                    if (cCharAt == '-' && z5) {
                        if (i == iM1229) {
                            m1212(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                            throw null;
                        }
                        i++;
                        z = z2;
                        z4 = false;
                    } else if (cCharAt != '+' || !z5) {
                        z3 = z5;
                        if (cCharAt != '-') {
                            if (AbstractC6339.m11298(cCharAt) != 0) {
                                break;
                            }
                            int i2 = i + 1;
                            int i3 = cCharAt - '0';
                            if (i3 < 0 || i3 >= 10) {
                                break;
                            }
                            if (z3) {
                                j = (j * 10) + ((long) i3);
                            } else {
                                j2 = (j2 * 10) - ((long) i3);
                                if (j2 > 0) {
                                    m1212(this, "Numeric value overflow", 0, null, 6);
                                    throw null;
                                }
                            }
                            i = i2;
                            z = z2;
                            z5 = z3;
                        } else {
                            if (i != iM1229) {
                                m1212(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                                throw null;
                            }
                            i++;
                            z = z2;
                            z5 = z3;
                            z6 = true;
                        }
                    } else {
                        if (i == iM1229) {
                            m1212(this, "Unexpected symbol '+' in numeric literal", i, null, 4);
                            throw null;
                        }
                        i++;
                        z = z2;
                        z4 = true;
                    }
                } else {
                    if (i == iM1229) {
                        m1212(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z4 = true;
                    z5 = true;
                }
            }
        } else {
            m1212(this, "EOF", 0, null, 6);
            throw null;
        }
    }

    public C1038(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C9469 c9469, Rect rect) {
        this.f1096 = 3;
        AbstractC7173.m12430(rect.left);
        AbstractC7173.m12430(rect.top);
        AbstractC7173.m12430(rect.right);
        AbstractC7173.m12430(rect.bottom);
        this.f1094 = rect;
        this.f1093 = colorStateList2;
        this.f1092 = colorStateList;
        this.f1091 = colorStateList3;
        this.f1095 = i;
        this.f1097 = c9469;
    }

    public C1038(View view) {
        this.f1096 = 0;
        this.f1095 = -1;
        this.f1094 = view;
        this.f1093 = C0977.m1100();
    }

    public C1038(String str, C8006 c8006) {
        this.f1096 = 4;
        str.getClass();
        this.f1094 = c8006;
        this.f1093 = new C2444(c8006);
        this.f1091 = new StringBuilder();
        this.f1097 = str;
    }

    public C1038() {
        this.f1096 = 1;
        this.f1094 = new AbstractC2555[32];
        this.f1093 = new float[32];
        this.f1092 = new byte[32];
        C1082 c1082 = AbstractC1132.f1342;
        this.f1091 = new C1082();
        this.f1097 = new C1082();
    }
}

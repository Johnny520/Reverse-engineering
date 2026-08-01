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
import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0108;
import androidx.collection.AbstractC0285;
import androidx.collection.C0235;
import androidx.compose.ui.graphics.C1609;
import androidx.compose.ui.layout.AbstractC1720;
import androidx.core.util.C2185;
import androidx.core.view.AbstractC2270;
import androidx.recyclerview.widget.C2454;
import androidx.recyclerview.widget.C2460;
import androidx.recyclerview.widget.C2497;
import androidx.recyclerview.widget.RecyclerView;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5144;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.internal.AbstractC5507;
import kotlinx.serialization.json.internal.C5488;
import p034.AbstractC6344;
import p088.C7177;
import p175.AbstractC7739;
import p188.AbstractC7773;
import p305.C8628;
import p305.C8640;
import p305.C8641;
import p305.C8643;
import p314.AbstractC8661;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C0191 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Object f746;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object f747;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f748;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f749;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f750;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f751;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Object f752;

    public C0191(C2454 c2454) {
        this.f751 = 2;
        this.f749 = new C2185(30);
        this.f748 = new ArrayList();
        this.f747 = new ArrayList();
        this.f750 = 0;
        this.f746 = c2454;
        this.f752 = new C2460(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m652(C0191 c0191, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = c0191.f750;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        c0191.m680(i, str, str2);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static C0191 m653(Context context, int i) {
        AbstractC6344.m11872("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC8661.f24438);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListM13073 = AbstractC7739.m13073(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListM130732 = AbstractC7739.m13073(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListM130733 = AbstractC7739.m13073(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(6, 0);
        C8628 c8628 = new C8628(0.0f);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        C8640 c8640M14319 = C8640.m14320(contextThemeWrapper.obtainStyledAttributes(AbstractC8661.f24411), c8628).m14319();
        typedArrayObtainStyledAttributes.recycle();
        return new C0191(colorStateListM13073, colorStateListM130732, colorStateListM130733, dimensionPixelSize, c8640M14319, rect);
    }

    public String toString() {
        switch (this.f751) {
            case 4:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f752);
                sb.append("', currentPosition=");
                return AbstractC0053.m156(sb, this.f750, ')');
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public int m654(int i, int i2) {
        int i3;
        int i4;
        C2185 c2185 = (C2185) this.f749;
        ArrayList arrayList = (ArrayList) this.f747;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C2497 c2497 = (C2497) arrayList.get(size);
            int i5 = c2497.f7480;
            int i6 = c2497.f7479;
            if (i5 == 8) {
                int i7 = c2497.f7477;
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
                            c2497.f7479 = i6 + 1;
                            c2497.f7477 = i7 + 1;
                        } else if (i2 == 2) {
                            c2497.f7479 = i6 - 1;
                            c2497.f7477 = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        c2497.f7477 = i7 + 1;
                    } else if (i2 == 2) {
                        c2497.f7477 = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c2497.f7479 = i6 + 1;
                    } else if (i2 == 2) {
                        c2497.f7479 = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= c2497.f7477;
                } else if (i5 == 2) {
                    i += c2497.f7477;
                }
            } else if (i2 == 1) {
                c2497.f7479 = i6 + 1;
            } else if (i2 == 2) {
                c2497.f7479 = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C2497 c24972 = (C2497) arrayList.get(size2);
            int i8 = c24972.f7480;
            int i9 = c24972.f7477;
            if (i8 == 8) {
                if (i9 == c24972.f7479 || i9 < 0) {
                    arrayList.remove(size2);
                    c24972.f7478 = null;
                    c2185.mo3989(c24972);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                c24972.f7478 = null;
                c2185.mo3989(c24972);
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public void m655(char c) {
        String str = (String) this.f752;
        int i = this.f750;
        if (i > 0 && c == '\"') {
            try {
                this.f750 = i - 1;
                String strM686 = m686();
                this.f750 = i;
                if (AbstractC4395.m8907(strM686, "null")) {
                    m680(this.f750 - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f750 = i;
                throw th;
            }
        }
        String strM10745 = AbstractC5507.m10745(AbstractC5507.m10739(c));
        int i2 = this.f750;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        m652(this, "Expected " + strM10745 + ", but had '" + ((i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3))) + "' instead", i3, null, 4);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public void m656(TextView textView) {
        ColorStateList colorStateList = (ColorStateList) this.f748;
        C8643 c8643 = new C8643();
        C8643 c86432 = new C8643();
        C8640 c8640 = (C8640) this.f752;
        c8643.setShapeAppearanceModel(c8640);
        c86432.setShapeAppearanceModel(c8640);
        c8643.m14341((ColorStateList) this.f747);
        float f = this.f750;
        ColorStateList colorStateList2 = (ColorStateList) this.f746;
        c8643.f24324.f24293 = f;
        c8643.invalidateSelf();
        C8641 c8641 = c8643.f24324;
        if (c8641.f24280 != colorStateList2) {
            c8641.f24280 = colorStateList2;
            c8643.onStateChange(c8643.getState());
        }
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), c8643, c86432);
        Rect rect = (Rect) this.f749;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public boolean m657() {
        int iM660 = m660();
        String str = (String) this.f752;
        if (iM660 >= str.length() || iM660 == -1 || str.charAt(iM660) != ',') {
            return false;
        }
        this.f750++;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public void m658(ColorStateList colorStateList) {
        if (((C0140) this.f746) == null) {
            this.f746 = new C0140();
        }
        C0140 c0140 = (C0140) this.f746;
        c0140.f600 = colorStateList;
        c0140.f601 = true;
        m678();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public void m659(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C0140) this.f747) == null) {
                this.f747 = new C0140();
            }
            C0140 c0140 = (C0140) this.f747;
            c0140.f600 = colorStateList;
            c0140.f601 = true;
        } else {
            this.f747 = null;
        }
        m678();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public int m660() {
        char cCharAt;
        int i = this.f750;
        if (i == -1) {
            return i;
        }
        String str = (String) this.f752;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.f750 = i;
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public void m661(PorterDuff.Mode mode) {
        if (((C0140) this.f746) == null) {
            this.f746 = new C0140();
        }
        C0140 c0140 = (C0140) this.f746;
        c0140.f599 = mode;
        c0140.f602 = true;
        m678();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public String m662(String str, boolean z) {
        str.getClass();
        int i = this.f750;
        try {
            if (m691() == 6 && AbstractC4395.m8907(m672(z), str)) {
                this.f747 = null;
                if (m691() == 5) {
                    return m672(z);
                }
            }
            return null;
        } finally {
            this.f750 = i;
            this.f747 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public void m663(int i) {
        ColorStateList colorStateListM632;
        this.f750 = i;
        C0130 c0130 = (C0130) this.f748;
        if (c0130 != null) {
            Context context = ((View) this.f749).getContext();
            synchronized (c0130) {
                colorStateListM632 = c0130.f572.m632(context, i);
            }
        } else {
            colorStateListM632 = null;
        }
        m659(colorStateListM632);
        m678();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public void m664() {
        this.f750 = -1;
        m659(null);
        m678();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public C2497 m665(Object obj, int i, int i2, int i3) {
        C2497 c2497 = (C2497) ((C2185) this.f749).acquire();
        if (c2497 != null) {
            c2497.f7480 = i;
            c2497.f7479 = i2;
            c2497.f7477 = i3;
            c2497.f7478 = obj;
            return c2497;
        }
        C2497 c24972 = new C2497();
        c24972.f7480 = i;
        c24972.f7479 = i2;
        c24972.f7477 = i3;
        c24972.f7478 = obj;
        return c24972;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public void m666(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListM632;
        View view = (View) this.f749;
        Context context = view.getContext();
        int[] iArr = AbstractC7773.f21083;
        C0108 c0108M354 = C0108.m354(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) c0108M354.f320;
        View view2 = (View) this.f749;
        AbstractC2270.m4243(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c0108M354.f320, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f750 = typedArray.getResourceId(0, -1);
                C0130 c0130 = (C0130) this.f748;
                Context context2 = view.getContext();
                int i2 = this.f750;
                synchronized (c0130) {
                    colorStateListM632 = c0130.f572.m632(context2, i2);
                }
                if (colorStateListM632 != null) {
                    m659(colorStateListM632);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(c0108M354.m385(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(AbstractC0216.m722(typedArray.getInt(2, -1), null));
            }
            c0108M354.m363();
        } catch (Throwable th) {
            c0108M354.m363();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean m667() {
        return ((ArrayList) this.f748).size() > 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public void m668(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2497 c2497 = (C2497) arrayList.get(i);
            c2497.f7478 = null;
            ((C2185) this.f749).mo3989(c2497);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public int m669(int i) {
        if (i < ((String) this.f752).length()) {
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
        To view partially-correct add '--show-bad-code' argument
    */
    public void m670() {
        /*
            Method dump skipped, instruction units count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0191.m670():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public void m671(C2497 c2497) {
        C2454 c2454 = (C2454) this.f746;
        ((ArrayList) this.f747).add(c2497);
        int i = c2497.f7480;
        if (i == 1) {
            c2454.m4829(c2497.f7479, c2497.f7477);
            return;
        }
        if (i == 2) {
            int i2 = c2497.f7479;
            int i3 = c2497.f7477;
            RecyclerView recyclerView = c2454.f7304;
            recyclerView.m4701(i2, i3, false);
            recyclerView.f7216 = true;
            return;
        }
        if (i == 4) {
            c2454.m4830(c2497.f7478, c2497.f7479, c2497.f7477);
        } else if (i == 8) {
            c2454.m4828(c2497.f7479, c2497.f7477);
        } else {
            C4211.m8604(c2497, "Unknown update op type for ");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public String m672(boolean z) {
        String strM693;
        byte bM673 = m673();
        if (z) {
            if (bM673 != 1 && bM673 != 0) {
                return null;
            }
            strM693 = m686();
        } else {
            if (bM673 != 1) {
                return null;
            }
            strM693 = m693();
        }
        this.f747 = strM693;
        return strM693;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public byte m673() {
        String str = (String) this.f752;
        int i = this.f750;
        while (true) {
            int iM669 = m669(i);
            if (iM669 == -1) {
                this.f750 = iM669;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iM669);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f750 = iM669;
                return AbstractC5507.m10739(cCharAt);
            }
            i = iM669 + 1;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public String m674() {
        String string;
        StringBuilder sb = (StringBuilder) this.f746;
        String str = (String) this.f752;
        m694('\"');
        int i = this.f750;
        int iM10171 = AbstractC5144.m10171(str, '\"', i, 4);
        if (iM10171 == -1) {
            m686();
            int i2 = this.f750;
            m652(this, AbstractC0053.m158("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        int i3 = i;
        while (i3 < iM10171) {
            if (str.charAt(i3) == '\\') {
                int iM669 = this.f750;
                char cCharAt = str.charAt(i3);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, iM669, i3);
                        int iM6692 = m669(i3 + 1);
                        if (iM6692 == -1) {
                            m652(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iM679 = iM6692 + 1;
                        char cCharAt2 = str.charAt(iM6692);
                        if (cCharAt2 == 'u') {
                            iM679 = m679(iM679, str);
                        } else {
                            char c = cCharAt2 < 'u' ? C5488.f15168[cCharAt2] : (char) 0;
                            if (c == 0) {
                                m652(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        iM669 = m669(iM679);
                        if (iM669 == -1) {
                            m652(this, "Unexpected EOF", iM669, null, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str.length()) {
                            sb.append((CharSequence) str, iM669, i3);
                            iM669 = m669(i3);
                            if (iM669 == -1) {
                                m652(this, "Unexpected EOF", iM669, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            cCharAt = str.charAt(i3);
                        }
                    }
                    i3 = iM669;
                    z = true;
                    cCharAt = str.charAt(i3);
                }
                if (z) {
                    sb.append((CharSequence) str, iM669, i3);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    string = string2;
                } else {
                    string = str.subSequence(iM669, i3).toString();
                }
                this.f750 = i3 + 1;
                return string;
            }
            i3++;
        }
        this.f750 = iM10171 + 1;
        return str.substring(i, iM10171);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m675(int i, String str) {
        String str2 = (String) this.f752;
        if (str2.length() - i < str.length()) {
            m652(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                m652(this, "Expected valid boolean literal prefix, but had '" + m686() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f750 = str.length() + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean m676(int i) {
        ArrayList arrayList = (ArrayList) this.f747;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2497 c2497 = (C2497) arrayList.get(i2);
            int i3 = c2497.f7480;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = c2497.f7479;
                    int i5 = c2497.f7477 + i4;
                    while (i4 < i5) {
                        if (m683(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m683(c2497.f7477, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean m677() {
        int i = this.f750;
        if (i == -1) {
            return false;
        }
        String str = (String) this.f752;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f750 = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.f750 = i;
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m678() {
        View view = (View) this.f749;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((C0140) this.f747) != null) {
                if (((C0140) this.f752) == null) {
                    this.f752 = new C0140();
                }
                C0140 c0140 = (C0140) this.f752;
                c0140.f600 = null;
                c0140.f601 = false;
                c0140.f599 = null;
                c0140.f602 = false;
                WeakHashMap weakHashMap = AbstractC2270.f6594;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    c0140.f601 = true;
                    c0140.f600 = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    c0140.f602 = true;
                    c0140.f599 = backgroundTintMode;
                }
                if (c0140.f601 || c0140.f602) {
                    C0130.m537(background, c0140, view.getDrawableState());
                    return;
                }
            }
            C0140 c01402 = (C0140) this.f746;
            if (c01402 != null) {
                C0130.m537(background, c01402, view.getDrawableState());
                return;
            }
            C0140 c01403 = (C0140) this.f747;
            if (c01403 != null) {
                C0130.m537(background, c01403, view.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int m679(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.f746).append((char) (m684(i + 3, charSequence) + (m684(i, charSequence) << 12) + (m684(i + 1, charSequence) << 8) + (m684(i + 2, charSequence) << 4)));
            return i2;
        }
        this.f750 = i;
        if (i2 < charSequence.length()) {
            return m679(this.f750, charSequence);
        }
        m652(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public void m680(int i, String str, String str2) {
        String strM2963 = ((C1609) this.f748).m2963();
        String str3 = (String) this.f752;
        str3.getClass();
        String string = ((C7177) this.f749).f19161 ? AbstractC5507.m10751(i, str3).toString() : null;
        throw new JsonDecodingException(AbstractC5507.m10758(str, strM2963, str2, i, string), str, i, strM2963, string, str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ColorStateList m681() {
        C0140 c0140 = (C0140) this.f746;
        if (c0140 != null) {
            return (ColorStateList) c0140.f600;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public PorterDuff.Mode m682() {
        C0140 c0140 = (C0140) this.f746;
        if (c0140 != null) {
            return (PorterDuff.Mode) c0140.f599;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int m683(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f747;
        int size = arrayList.size();
        while (i2 < size) {
            C2497 c2497 = (C2497) arrayList.get(i2);
            int i3 = c2497.f7480;
            int i4 = c2497.f7479;
            if (i3 == 8) {
                if (i4 == i) {
                    i = c2497.f7477;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c2497.f7477 <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = c2497.f7477;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += c2497.f7477;
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int m684(int i, CharSequence charSequence) {
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
        m652(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public String m685() {
        String strM686 = m686();
        if (!AbstractC4395.m8907(strM686, "null") || ((String) this.f752).charAt(this.f750 - 1) == '\"') {
            return strM686;
        }
        m652(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public String m686() {
        String string;
        StringBuilder sb = (StringBuilder) this.f746;
        String str = (String) this.f752;
        String str2 = (String) this.f747;
        if (str2 != null) {
            str2.getClass();
            this.f747 = null;
            return str2;
        }
        int iM660 = m660();
        if (iM660 >= str.length() || iM660 == -1) {
            m652(this, "EOF", iM660, null, 4);
            throw null;
        }
        byte bM10739 = AbstractC5507.m10739(str.charAt(iM660));
        if (bM10739 == 1) {
            return m693();
        }
        if (bM10739 != 0) {
            m652(this, "Expected beginning of the string, but got " + str.charAt(iM660), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (AbstractC5507.m10739(str.charAt(iM660)) == 0) {
            iM660++;
            if (iM660 >= str.length()) {
                sb.append((CharSequence) str, this.f750, iM660);
                int iM669 = m669(iM660);
                if (iM669 == -1) {
                    this.f750 = iM660;
                    sb.append((CharSequence) str, 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iM660 = iM669;
                z = true;
            }
        }
        int i = this.f750;
        if (z) {
            sb.append((CharSequence) str, i, iM660);
            String string3 = sb.toString();
            sb.setLength(0);
            string = string3;
        } else {
            string = str.subSequence(i, iM660).toString();
        }
        this.f750 = iM660;
        return string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void m687(C2497 c2497) {
        int i;
        C2185 c2185 = (C2185) this.f749;
        int i2 = c2497.f7480;
        if (i2 == 1 || i2 == 8) {
            C5925.m11310("should not dispatch add or move for pre layout");
            return;
        }
        int iM654 = m654(c2497.f7479, i2);
        int i3 = c2497.f7479;
        int i4 = c2497.f7480;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                C4211.m8604(c2497, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < c2497.f7477; i6++) {
            int iM6542 = m654((i * i6) + c2497.f7479, c2497.f7480);
            int i7 = c2497.f7480;
            if (i7 == 2 ? iM6542 != iM654 : !(i7 == 4 && iM6542 == iM654 + 1)) {
                C2497 c2497M665 = m665(c2497.f7478, i7, iM654, i5);
                m688(c2497M665, i3);
                c2497M665.f7478 = null;
                c2185.mo3989(c2497M665);
                if (c2497.f7480 == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iM654 = iM6542;
            } else {
                i5++;
            }
        }
        Object obj = c2497.f7478;
        c2497.f7478 = null;
        c2185.mo3989(c2497);
        if (i5 > 0) {
            C2497 c2497M6652 = m665(obj, c2497.f7480, iM654, i5);
            m688(c2497M6652, i3);
            c2497M6652.f7478 = null;
            c2185.mo3989(c2497M6652);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public void m688(C2497 c2497, int i) {
        C2454 c2454 = (C2454) this.f746;
        c2454.m4832(c2497);
        int i2 = c2497.f7480;
        if (i2 != 2) {
            if (i2 != 4) {
                C5925.m11310("only remove and update ops can be dispatched in first pass");
                return;
            } else {
                c2454.m4830(c2497.f7478, i, c2497.f7477);
                return;
            }
        }
        int i3 = c2497.f7477;
        RecyclerView recyclerView = c2454.f7304;
        recyclerView.m4701(i, i3, true);
        recyclerView.f7216 = true;
        recyclerView.f7241.f7611 += i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void m689() {
        C2454 c2454 = (C2454) this.f746;
        m692();
        ArrayList arrayList = (ArrayList) this.f748;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2497 c2497 = (C2497) arrayList.get(i);
            int i2 = c2497.f7480;
            if (i2 == 1) {
                c2454.m4832(c2497);
                c2454.m4829(c2497.f7479, c2497.f7477);
            } else if (i2 == 2) {
                c2454.m4832(c2497);
                int i3 = c2497.f7479;
                int i4 = c2497.f7477;
                RecyclerView recyclerView = c2454.f7304;
                recyclerView.m4701(i3, i4, true);
                recyclerView.f7216 = true;
                recyclerView.f7241.f7611 += i4;
            } else if (i2 == 4) {
                c2454.m4832(c2497);
                c2454.m4830(c2497.f7478, c2497.f7479, c2497.f7477);
            } else if (i2 == 8) {
                c2454.m4832(c2497);
                c2454.m4828(c2497.f7479, c2497.f7477);
            }
        }
        m668(arrayList);
        this.f750 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public byte m690(byte b) {
        String str = (String) this.f752;
        byte bM691 = m691();
        if (bM691 == b) {
            return bM691;
        }
        String strM10745 = AbstractC5507.m10745(b);
        int i = this.f750;
        int i2 = i > 0 ? i - 1 : i;
        m652(this, "Expected " + strM10745 + ", but had '" + ((i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2))) + "' instead", i2, null, 4);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public byte m691() {
        String str = (String) this.f752;
        int i = this.f750;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f750 = i2;
                return AbstractC5507.m10739(cCharAt);
            }
            i = i2;
        }
        this.f750 = str.length();
        return (byte) 10;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m692() {
        ArrayList arrayList = (ArrayList) this.f747;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C2454) this.f746).m4832((C2497) arrayList.get(i));
        }
        m668(arrayList);
        this.f750 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public String m693() {
        String str = (String) this.f747;
        if (str == null) {
            return m674();
        }
        str.getClass();
        this.f747 = null;
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void m694(char c) {
        int i = this.f750;
        if (i == -1) {
            m655(c);
            throw null;
        }
        String str = (String) this.f752;
        while (i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f750 = i2;
                if (cCharAt == c) {
                    return;
                }
                m655(c);
                throw null;
            }
            i = i2;
        }
        this.f750 = -1;
        m655(c);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017e, code lost:
    
        m652(r22, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0197, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0198, code lost:
    
        m652(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x019e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x019f, code lost:
    
        io.ktor.util.C4211.m8611();
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
    
        m652(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01b5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01b6, code lost:
    
        m652(r22, "Expected numeric literal", r12, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01bc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0104, code lost:
    
        m652(r22, "Unexpected symbol '" + r15 + "' in numeric literal", r12, null, 4);
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
    
        m652(r22, "Expected closing quotation mark", r12, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0144, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0145, code lost:
    
        m652(r22, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x014c, code lost:
    
        r22.f750 = r12;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public long m695() {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0191.m695():long");
    }

    public C0191(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C8640 c8640, Rect rect) {
        this.f751 = 3;
        AbstractC6344.m11871(rect.left);
        AbstractC6344.m11871(rect.top);
        AbstractC6344.m11871(rect.right);
        AbstractC6344.m11871(rect.bottom);
        this.f749 = rect;
        this.f748 = colorStateList2;
        this.f747 = colorStateList;
        this.f746 = colorStateList3;
        this.f750 = i;
        this.f752 = c8640;
    }

    public C0191(View view) {
        this.f751 = 0;
        this.f750 = -1;
        this.f749 = view;
        this.f748 = C0130.m540();
    }

    public C0191(String str, C7177 c7177) {
        this.f751 = 4;
        str.getClass();
        this.f749 = c7177;
        this.f748 = new C1609(c7177);
        this.f746 = new StringBuilder();
        this.f752 = str;
    }

    public C0191() {
        this.f751 = 1;
        this.f749 = new AbstractC1720[32];
        this.f748 = new float[32];
        this.f747 = new byte[32];
        C0235 c0235 = AbstractC0285.f997;
        this.f746 = new C0235();
        this.f752 = new C0235();
    }
}

package Yue;

import Yue.C7130;
import Yue.InterfaceC7144;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: renamed from: Yue.ۥۢۡۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C7837 {

    /* JADX INFO: renamed from: ۥ */
    public final Context f3111;

    /* JADX INFO: renamed from: ۥ۟ */
    public final TypedArray f3112;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public TypedValue f23448;

    /* JADX INFO: renamed from: Yue.ۥۢۡۥۦ$ۥ */
    @InterfaceC7113(21)
    public static class C1376 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m3935(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static int m3936(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    public C7837(Context context, TypedArray typedArray) {
        this.f3111 = context;
        this.f3112 = typedArray;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static C7837 m24867(Context context, int i, int[] iArr) {
        return new C7837(context, context.obtainStyledAttributes(i, iArr));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static C7837 m24868(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C7837(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static C7837 m24869(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C7837(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* JADX INFO: renamed from: ۥ */
    public boolean m3933(int i, boolean z) {
        return this.f3112.getBoolean(i, z);
    }

    @InterfaceC7113(21)
    /* JADX INFO: renamed from: ۥ۟ */
    public int m3934() {
        return C1376.m3935(this.f3112);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m24870(int i, int i2) {
        return this.f3112.getColor(i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public ColorStateList m24871(int i) {
        int resourceId;
        ColorStateList colorStateListM395;
        return (!this.f3112.hasValue(i) || (resourceId = this.f3112.getResourceId(i, 0)) == 0 || (colorStateListM395 = C3323.m395(this.f3111, resourceId)) == null) ? this.f3112.getColorStateList(i) : colorStateListM395;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float m24872(int i, float f) {
        return this.f3112.getDimension(i, f);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m24873(int i, int i2) {
        return this.f3112.getDimensionPixelOffset(i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m24874(int i, int i2) {
        return this.f3112.getDimensionPixelSize(i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Drawable m24875(int i) {
        int resourceId;
        return (!this.f3112.hasValue(i) || (resourceId = this.f3112.getResourceId(i, 0)) == 0) ? this.f3112.getDrawable(i) : C3323.m396(this.f3111, resourceId);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Drawable m24876(int i) {
        int resourceId;
        if (!this.f3112.hasValue(i) || (resourceId = this.f3112.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C3304.m368().m6746(this.f3111, resourceId, true);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public float m24877(int i, float f) {
        return this.f3112.getFloat(i, f);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public Typeface m24878(@InterfaceC7662 int i, int i2, @InterfaceC6490 C7130.AbstractC7134 abstractC7134) {
        int resourceId = this.f3112.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f23448 == null) {
            this.f23448 = new TypedValue();
        }
        return C7130.m22279(this.f3111, resourceId, this.f23448, i2, abstractC7134);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public float m24879(int i, int i2, int i3, float f) {
        return this.f3112.getFraction(i, i2, i3, f);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int m24880(int i) {
        return this.f3112.getIndex(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int m24881() {
        return this.f3112.getIndexCount();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public int m24882(int i, int i2) {
        return this.f3112.getInt(i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int m24883(int i, int i2) {
        return this.f3112.getInteger(i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int m24884(int i, int i2) {
        return this.f3112.getLayoutDimension(i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public int m24885(int i, String str) {
        return this.f3112.getLayoutDimension(i, str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public String m24886(int i) {
        return this.f3112.getNonResourceString(i);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public String m24887() {
        return this.f3112.getPositionDescription();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int m24888(int i, int i2) {
        return this.f3112.getResourceId(i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Resources m24889() {
        return this.f3112.getResources();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public String m24890(int i) {
        return this.f3112.getString(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public CharSequence m24891(int i) {
        return this.f3112.getText(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public CharSequence[] m24892(int i) {
        return this.f3112.getTextArray(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int m24893(int i) {
        return C1376.m3936(this.f3112, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean m24894(int i, TypedValue typedValue) {
        return this.f3112.getValue(i, typedValue);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public TypedArray m24895() {
        return this.f3112;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean m24896(int i) {
        return this.f3112.hasValue(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public int m24897() {
        return this.f3112.length();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public TypedValue m24898(int i) {
        return this.f3112.peekValue(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public void m24899() {
        this.f3112.recycle();
    }
}

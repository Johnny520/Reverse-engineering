package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.C0955;
import androidx.compose.animation.core.C1164;
import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.core.widgets.analyzer.AbstractC2987;
import androidx.constraintlayout.core.widgets.analyzer.C2979;
import androidx.constraintlayout.core.widgets.analyzer.C2981;
import androidx.constraintlayout.core.widgets.analyzer.C2988;
import androidx.constraintlayout.core.widgets.analyzer.C2993;
import androidx.constraintlayout.core.widgets.analyzer.C2994;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import net.bytebuddy.jar.asm.Opcodes;
import org.xmlpull.v1.XmlPullParserException;
import p215.AbstractC8681;
import p215.AbstractC8683;
import p215.AbstractC8691;
import p215.AbstractC8693;
import p215.C8680;
import p215.C8687;
import p215.C8692;
import p215.C8694;
import p215.C8695;
import p219.AbstractC8715;
import p219.AbstractC8716;
import p219.C8707;
import p219.C8708;
import p219.C8712;
import p219.C8713;
import p219.C8718;
import p222.C8740;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static C8687 f6726;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C8695 f6727;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final SparseArray f6728;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public HashMap f6729;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f6730;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public C5703 f6731;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C8692 f6732;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f6733;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f6734;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f6735;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f6736;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f6737;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f6738;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f6739;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C8707 f6740;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final SparseArray f6741;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6741 = new SparseArray();
        this.f6739 = new ArrayList(4);
        this.f6740 = new C8707();
        this.f6734 = 0;
        this.f6733 = 0;
        this.f6737 = Integer.MAX_VALUE;
        this.f6738 = Integer.MAX_VALUE;
        this.f6735 = true;
        this.f6736 = 257;
        this.f6732 = null;
        this.f6731 = null;
        this.f6730 = -1;
        this.f6729 = new HashMap();
        this.f6728 = new SparseArray();
        this.f6727 = new C8695(this, this);
        m4487(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static C8687 getSharedValues() {
        if (f6726 == null) {
            C8687 c8687 = new C8687();
            new SparseIntArray();
            new HashMap();
            f6726 = c8687;
        }
        return f6726;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C8680 m4483() {
        C8680 c8680 = new C8680(-2, -2);
        c8680.f21786 = -1;
        c8680.f21785 = -1;
        c8680.f21784 = -1.0f;
        c8680.f21783 = true;
        c8680.f21782 = -1;
        c8680.f21781 = -1;
        c8680.f21800 = -1;
        c8680.f21799 = -1;
        c8680.f21803 = -1;
        c8680.f21804 = -1;
        c8680.f21801 = -1;
        c8680.f21802 = -1;
        c8680.f21794 = -1;
        c8680.f21793 = -1;
        c8680.f21797 = -1;
        c8680.f21798 = -1;
        c8680.f21795 = 0;
        c8680.f21796 = 0.0f;
        c8680.f21788 = -1;
        c8680.f21787 = -1;
        c8680.f21791 = -1;
        c8680.f21792 = -1;
        c8680.f21789 = Integer.MIN_VALUE;
        c8680.f21790 = Integer.MIN_VALUE;
        c8680.f21774 = Integer.MIN_VALUE;
        c8680.f21773 = Integer.MIN_VALUE;
        c8680.f21772 = Integer.MIN_VALUE;
        c8680.f21771 = Integer.MIN_VALUE;
        c8680.f21770 = Integer.MIN_VALUE;
        c8680.f21769 = 0;
        c8680.f21780 = 0.5f;
        c8680.f21779 = 0.5f;
        c8680.f21778 = null;
        c8680.f21777 = -1.0f;
        c8680.f21776 = -1.0f;
        c8680.f21775 = 0;
        c8680.f21766 = 0;
        c8680.f21765 = 0;
        c8680.f21768 = 0;
        c8680.f21767 = 0;
        c8680.f21763 = 0;
        c8680.f21764 = 0;
        c8680.f21760 = 0;
        c8680.f21759 = 1.0f;
        c8680.f21762 = 1.0f;
        c8680.f21761 = -1;
        c8680.f21757 = -1;
        c8680.f21758 = -1;
        c8680.f21820 = false;
        c8680.f21819 = false;
        c8680.f21823 = null;
        c8680.f21824 = 0;
        c8680.f21821 = true;
        c8680.f21822 = true;
        c8680.f21810 = false;
        c8680.f21809 = false;
        c8680.f21808 = false;
        c8680.f21807 = -1;
        c8680.f21806 = -1;
        c8680.f21805 = -1;
        c8680.f21817 = -1;
        c8680.f21818 = Integer.MIN_VALUE;
        c8680.f21814 = Integer.MIN_VALUE;
        c8680.f21813 = 0.5f;
        c8680.f21812 = new C8708();
        return c8680;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C8680;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f6739;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC8683) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(Opcodes.V_PREVIEW);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f6735 = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m4483();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C8680 c8680 = new C8680(context, attributeSet);
        c8680.f21786 = -1;
        c8680.f21785 = -1;
        c8680.f21784 = -1.0f;
        c8680.f21783 = true;
        c8680.f21782 = -1;
        c8680.f21781 = -1;
        c8680.f21800 = -1;
        c8680.f21799 = -1;
        c8680.f21803 = -1;
        c8680.f21804 = -1;
        c8680.f21801 = -1;
        c8680.f21802 = -1;
        c8680.f21794 = -1;
        c8680.f21793 = -1;
        c8680.f21797 = -1;
        c8680.f21798 = -1;
        c8680.f21795 = 0;
        c8680.f21796 = 0.0f;
        c8680.f21788 = -1;
        c8680.f21787 = -1;
        c8680.f21791 = -1;
        c8680.f21792 = -1;
        c8680.f21789 = Integer.MIN_VALUE;
        c8680.f21790 = Integer.MIN_VALUE;
        c8680.f21774 = Integer.MIN_VALUE;
        c8680.f21773 = Integer.MIN_VALUE;
        c8680.f21772 = Integer.MIN_VALUE;
        c8680.f21771 = Integer.MIN_VALUE;
        c8680.f21770 = Integer.MIN_VALUE;
        c8680.f21769 = 0;
        c8680.f21780 = 0.5f;
        c8680.f21779 = 0.5f;
        c8680.f21778 = null;
        c8680.f21777 = -1.0f;
        c8680.f21776 = -1.0f;
        c8680.f21775 = 0;
        c8680.f21766 = 0;
        c8680.f21765 = 0;
        c8680.f21768 = 0;
        c8680.f21767 = 0;
        c8680.f21763 = 0;
        c8680.f21764 = 0;
        c8680.f21760 = 0;
        c8680.f21759 = 1.0f;
        c8680.f21762 = 1.0f;
        c8680.f21761 = -1;
        c8680.f21757 = -1;
        c8680.f21758 = -1;
        c8680.f21820 = false;
        c8680.f21819 = false;
        c8680.f21823 = null;
        c8680.f21824 = 0;
        c8680.f21821 = true;
        c8680.f21822 = true;
        c8680.f21810 = false;
        c8680.f21809 = false;
        c8680.f21808 = false;
        c8680.f21807 = -1;
        c8680.f21806 = -1;
        c8680.f21805 = -1;
        c8680.f21817 = -1;
        c8680.f21818 = Integer.MIN_VALUE;
        c8680.f21814 = Integer.MIN_VALUE;
        c8680.f21813 = 0.5f;
        c8680.f21812 = new C8708();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8691.f21868);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = AbstractC8681.f21825.get(index);
            switch (i2) {
                case 1:
                    c8680.f21758 = typedArrayObtainStyledAttributes.getInt(index, c8680.f21758);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c8680.f21798);
                    c8680.f21798 = resourceId;
                    if (resourceId == -1) {
                        c8680.f21798 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    c8680.f21795 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8680.f21795);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, c8680.f21796) % 360.0f;
                    c8680.f21796 = f;
                    if (f < 0.0f) {
                        c8680.f21796 = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    c8680.f21786 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c8680.f21786);
                    break;
                case 6:
                    c8680.f21785 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c8680.f21785);
                    break;
                case 7:
                    c8680.f21784 = typedArrayObtainStyledAttributes.getFloat(index, c8680.f21784);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c8680.f21782);
                    c8680.f21782 = resourceId2;
                    if (resourceId2 == -1) {
                        c8680.f21782 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c8680.f21781);
                    c8680.f21781 = resourceId3;
                    if (resourceId3 == -1) {
                        c8680.f21781 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c8680.f21800);
                    c8680.f21800 = resourceId4;
                    if (resourceId4 == -1) {
                        c8680.f21800 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c8680.f21799);
                    c8680.f21799 = resourceId5;
                    if (resourceId5 == -1) {
                        c8680.f21799 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c8680.f21803);
                    c8680.f21803 = resourceId6;
                    if (resourceId6 == -1) {
                        c8680.f21803 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c8680.f21804);
                    c8680.f21804 = resourceId7;
                    if (resourceId7 == -1) {
                        c8680.f21804 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c8680.f21801);
                    c8680.f21801 = resourceId8;
                    if (resourceId8 == -1) {
                        c8680.f21801 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c8680.f21802);
                    c8680.f21802 = resourceId9;
                    if (resourceId9 == -1) {
                        c8680.f21802 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c8680.f21794);
                    c8680.f21794 = resourceId10;
                    if (resourceId10 == -1) {
                        c8680.f21794 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c8680.f21788);
                    c8680.f21788 = resourceId11;
                    if (resourceId11 == -1) {
                        c8680.f21788 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c8680.f21787);
                    c8680.f21787 = resourceId12;
                    if (resourceId12 == -1) {
                        c8680.f21787 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c8680.f21791);
                    c8680.f21791 = resourceId13;
                    if (resourceId13 == -1) {
                        c8680.f21791 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c8680.f21792);
                    c8680.f21792 = resourceId14;
                    if (resourceId14 == -1) {
                        c8680.f21792 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    c8680.f21789 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8680.f21789);
                    break;
                case 22:
                    c8680.f21790 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8680.f21790);
                    break;
                case 23:
                    c8680.f21774 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8680.f21774);
                    break;
                case 24:
                    c8680.f21773 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8680.f21773);
                    break;
                case 25:
                    c8680.f21772 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8680.f21772);
                    break;
                case 26:
                    c8680.f21771 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8680.f21771);
                    break;
                case 27:
                    c8680.f21820 = typedArrayObtainStyledAttributes.getBoolean(index, c8680.f21820);
                    break;
                case 28:
                    c8680.f21819 = typedArrayObtainStyledAttributes.getBoolean(index, c8680.f21819);
                    break;
                case 29:
                    c8680.f21780 = typedArrayObtainStyledAttributes.getFloat(index, c8680.f21780);
                    break;
                case 30:
                    c8680.f21779 = typedArrayObtainStyledAttributes.getFloat(index, c8680.f21779);
                    break;
                case 31:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c8680.f21765 = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c8680.f21768 = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        c8680.f21767 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8680.f21767);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c8680.f21767) == -2) {
                            c8680.f21767 = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        c8680.f21764 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8680.f21764);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c8680.f21764) == -2) {
                            c8680.f21764 = -2;
                        }
                    }
                    break;
                case 35:
                    c8680.f21759 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c8680.f21759));
                    c8680.f21765 = 2;
                    break;
                case 36:
                    try {
                        c8680.f21763 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8680.f21763);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c8680.f21763) == -2) {
                            c8680.f21763 = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        c8680.f21760 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8680.f21760);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c8680.f21760) == -2) {
                            c8680.f21760 = -2;
                        }
                    }
                    break;
                case 38:
                    c8680.f21762 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c8680.f21762));
                    c8680.f21768 = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            C8692.m13777(c8680, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c8680.f21777 = typedArrayObtainStyledAttributes.getFloat(index, c8680.f21777);
                            break;
                        case 46:
                            c8680.f21776 = typedArrayObtainStyledAttributes.getFloat(index, c8680.f21776);
                            break;
                        case 47:
                            c8680.f21775 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c8680.f21766 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c8680.f21761 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c8680.f21761);
                            break;
                        case 50:
                            c8680.f21757 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c8680.f21757);
                            break;
                        case 51:
                            c8680.f21823 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, c8680.f21793);
                            c8680.f21793 = resourceId15;
                            if (resourceId15 == -1) {
                                c8680.f21793 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, c8680.f21797);
                            c8680.f21797 = resourceId16;
                            if (resourceId16 == -1) {
                                c8680.f21797 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            c8680.f21769 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8680.f21769);
                            break;
                        case 55:
                            c8680.f21770 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c8680.f21770);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    C8692.m13778(c8680, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    C8692.m13778(c8680, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c8680.f21824 = typedArrayObtainStyledAttributes.getInt(index, c8680.f21824);
                                    break;
                                case 67:
                                    c8680.f21783 = typedArrayObtainStyledAttributes.getBoolean(index, c8680.f21783);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c8680.m13761();
        return c8680;
    }

    public int getMaxHeight() {
        return this.f6738;
    }

    public int getMaxWidth() {
        return this.f6737;
    }

    public int getMinHeight() {
        return this.f6733;
    }

    public int getMinWidth() {
        return this.f6734;
    }

    public int getOptimizationLevel() {
        return this.f6740.f22018;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C8707 c8707 = this.f6740;
        if (c8707.f22083 == null) {
            int id2 = getId();
            if (id2 != -1) {
                c8707.f22083 = getContext().getResources().getResourceEntryName(id2);
            } else {
                c8707.f22083 = "parent";
            }
        }
        if (c8707.f22096 == null) {
            c8707.f22096 = c8707.f22083;
            Log.v("ConstraintLayout", " setDebugName " + c8707.f22096);
        }
        for (C8708 c8708 : c8707.f22033) {
            View view = c8708.f22085;
            if (view != null) {
                if (c8708.f22083 == null && (id = view.getId()) != -1) {
                    c8708.f22083 = getContext().getResources().getResourceEntryName(id);
                }
                if (c8708.f22096 == null) {
                    c8708.f22096 = c8708.f22083;
                    Log.v("ConstraintLayout", " setDebugName " + c8708.f22096);
                }
            }
        }
        c8707.mo13801(sb);
        return sb.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C8680 c8680 = (C8680) childAt.getLayoutParams();
            C8708 c8708 = c8680.f21812;
            if (childAt.getVisibility() != 8 || c8680.f21809 || c8680.f21808 || zIsInEditMode) {
                int iM13835 = c8708.m13835();
                int iM13828 = c8708.m13828();
                childAt.layout(iM13835, iM13828, c8708.m13834() + iM13835, c8708.m13838() + iM13828);
            }
        }
        ArrayList arrayList = this.f6739;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC8683) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x053e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        C8708 c8708;
        C8708 c87082;
        C8708 c87083;
        C8708 c87084;
        C8708 c87085;
        C8680 c8680;
        C8708 c87086;
        int i4;
        int i5;
        int i6;
        int i7;
        float fAbs;
        int i8;
        byte b;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        SparseArray sparseArray2;
        String str;
        int iM13762;
        int i9;
        C8708 c87087;
        ConstraintLayout constraintLayout = this;
        boolean z3 = constraintLayout.f6735;
        constraintLayout.f6735 = z3;
        int i10 = 1;
        int i11 = 0;
        if (!z3) {
            int childCount = constraintLayout.getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i12).isLayoutRequested()) {
                    constraintLayout.f6735 = true;
                    break;
                }
                i12++;
            }
        }
        boolean z4 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        C8707 c8707 = constraintLayout.f6740;
        c8707.f22020 = z4;
        if (constraintLayout.f6735) {
            constraintLayout.f6735 = false;
            int childCount2 = constraintLayout.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i13).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i13++;
                }
            }
            if (z) {
                boolean zIsInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i14 = 0; i14 < childCount3; i14++) {
                    C8708 c8708M4484 = constraintLayout.m4484(constraintLayout.getChildAt(i14));
                    if (c8708M4484 != null) {
                        c8708M4484.mo13799();
                    }
                }
                SparseArray sparseArray3 = constraintLayout.f6741;
                if (zIsInEditMode) {
                    int i15 = 0;
                    while (i15 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i15);
                        try {
                            String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                i9 = i10;
                                try {
                                    if (constraintLayout.f6729 == null) {
                                        constraintLayout.f6729 = new HashMap();
                                    }
                                    int iIndexOf = resourceName.indexOf("/");
                                    constraintLayout.f6729.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                i9 = i10;
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) sparseArray3.get(id);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                    constraintLayout.onViewAdded(viewFindViewById);
                                }
                                if (viewFindViewById == constraintLayout) {
                                    c87087 = c8707;
                                    c87087.f22096 = resourceName;
                                } else {
                                    c87087 = viewFindViewById == null ? null : ((C8680) viewFindViewById.getLayoutParams()).f21812;
                                    c87087.f22096 = resourceName;
                                }
                            } else {
                                c87087 = c8707;
                                c87087.f22096 = resourceName;
                            }
                        } catch (Resources.NotFoundException unused2) {
                            i9 = i10;
                        }
                        i15++;
                        i10 = i9;
                    }
                }
                int i16 = i10;
                if (constraintLayout.f6730 != -1) {
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        constraintLayout.getChildAt(i17).getId();
                    }
                }
                C8692 c8692 = constraintLayout.f6732;
                if (c8692 != null) {
                    c8692.m13781(constraintLayout);
                }
                c8707.f22033.clear();
                ArrayList arrayList3 = constraintLayout.f6739;
                int size = arrayList3.size();
                if (size > 0) {
                    int i18 = 0;
                    while (i18 < size) {
                        AbstractC8683 abstractC8683 = (AbstractC8683) arrayList3.get(i18);
                        HashMap map = abstractC8683.f21830;
                        if (abstractC8683.isInEditMode()) {
                            abstractC8683.setIds(abstractC8683.f21827);
                        }
                        AbstractC8715 abstractC8715 = abstractC8683.f21828;
                        if (abstractC8715 == null) {
                            sparseArray = sparseArray3;
                            arrayList = arrayList3;
                        } else {
                            abstractC8715.f22189 = i11;
                            Arrays.fill(abstractC8715.f22190, (Object) null);
                            int i19 = i11;
                            while (i19 < abstractC8683.f21831) {
                                int i20 = abstractC8683.f21833[i19];
                                View view = (View) sparseArray3.get(i20);
                                if (view != null || (iM13762 = abstractC8683.m13762(constraintLayout, (str = (String) map.get(Integer.valueOf(i20))))) == 0) {
                                    arrayList2 = arrayList3;
                                } else {
                                    arrayList2 = arrayList3;
                                    abstractC8683.f21833[i19] = iM13762;
                                    map.put(Integer.valueOf(iM13762), str);
                                    view = (View) sparseArray3.get(iM13762);
                                }
                                View view2 = view;
                                if (view2 != null) {
                                    AbstractC8715 abstractC87152 = abstractC8683.f21828;
                                    C8708 c8708M44842 = constraintLayout.m4484(view2);
                                    abstractC87152.getClass();
                                    if (c8708M44842 == abstractC87152 || c8708M44842 == null) {
                                        sparseArray2 = sparseArray3;
                                    } else {
                                        int i21 = abstractC87152.f22189 + 1;
                                        sparseArray2 = sparseArray3;
                                        C8708[] c8708Arr = abstractC87152.f22190;
                                        if (i21 > c8708Arr.length) {
                                            abstractC87152.f22190 = (C8708[]) Arrays.copyOf(c8708Arr, c8708Arr.length * 2);
                                        }
                                        C8708[] c8708Arr2 = abstractC87152.f22190;
                                        int i22 = abstractC87152.f22189;
                                        c8708Arr2[i22] = c8708M44842;
                                        abstractC87152.f22189 = i22 + 1;
                                    }
                                }
                                i19++;
                                sparseArray3 = sparseArray2;
                                arrayList3 = arrayList2;
                            }
                            sparseArray = sparseArray3;
                            arrayList = arrayList3;
                            abstractC8683.f21828.mo13859();
                        }
                        i18++;
                        sparseArray3 = sparseArray;
                        arrayList3 = arrayList;
                        i11 = 0;
                    }
                }
                int i23 = 2;
                for (int i24 = 0; i24 < childCount3; i24++) {
                    constraintLayout.getChildAt(i24);
                }
                SparseArray sparseArray4 = constraintLayout.f6728;
                sparseArray4.clear();
                sparseArray4.put(0, c8707);
                sparseArray4.put(constraintLayout.getId(), c8707);
                for (int i25 = 0; i25 < childCount3; i25++) {
                    View childAt2 = constraintLayout.getChildAt(i25);
                    sparseArray4.put(childAt2.getId(), constraintLayout.m4484(childAt2));
                }
                int i26 = 0;
                while (i26 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i26);
                    C8708 c8708M44843 = constraintLayout.m4484(childAt3);
                    if (c8708M44843 == null) {
                        i3 = i26;
                        z2 = z;
                        i5 = i23;
                    } else {
                        C8680 c86802 = (C8680) childAt3.getLayoutParams();
                        c8707.f22033.add(c8708M44843);
                        C8708 c87088 = c8708M44843.f22036;
                        if (c87088 != null) {
                            ((C8707) c87088).f22033.remove(c8708M44843);
                            c8708M44843.mo13799();
                        }
                        c8708M44843.f22036 = c8707;
                        c86802.m13761();
                        c8708M44843.f22084 = childAt3.getVisibility();
                        c8708M44843.f22085 = childAt3;
                        if (childAt3 instanceof AbstractC8683) {
                            ((AbstractC8683) childAt3).mo4481(c8708M44843, c8707.f22020);
                        }
                        if (c86802.f21809) {
                            C8718 c8718 = (C8718) c8708M44843;
                            int i27 = c86802.f21816;
                            int i28 = c86802.f21815;
                            float f = c86802.f21811;
                            if (f != -1.0f) {
                                if (f > -1.0f) {
                                    c8718.f22196 = f;
                                    b = -1;
                                    c8718.f22195 = -1;
                                    c8718.f22198 = -1;
                                    i3 = i26;
                                    z2 = z;
                                    i5 = i23;
                                }
                                i3 = i26;
                                z2 = z;
                                i5 = i23;
                            } else {
                                b = -1;
                                if (i27 != -1) {
                                    if (i27 > -1) {
                                        c8718.f22196 = -1.0f;
                                        c8718.f22195 = i27;
                                        c8718.f22198 = -1;
                                    }
                                } else if (i28 != -1 && i28 > -1) {
                                    c8718.f22196 = -1.0f;
                                    c8718.f22195 = -1;
                                    c8718.f22198 = i28;
                                    i3 = i26;
                                    z2 = z;
                                    i5 = i23;
                                }
                                i3 = i26;
                                z2 = z;
                                i5 = i23;
                            }
                        } else {
                            int i29 = c86802.f21807;
                            int i30 = c86802.f21806;
                            int i31 = c86802.f21805;
                            int i32 = c86802.f21817;
                            int i33 = c86802.f21818;
                            int i34 = c86802.f21814;
                            i3 = i26;
                            float f2 = c86802.f21813;
                            int i35 = c86802.f21798;
                            z2 = z;
                            if (i35 != -1) {
                                C8708 c87089 = (C8708) sparseArray4.get(i35);
                                if (c87089 != null) {
                                    float f3 = c86802.f21796;
                                    int i36 = c86802.f21795;
                                    ConstraintAnchor$Type constraintAnchor$Type = ConstraintAnchor$Type.CENTER;
                                    c8708M44843.m13832(constraintAnchor$Type, c87089, constraintAnchor$Type, i36, 0);
                                    c8708M44843.f22048 = f3;
                                }
                                constraintLayout = this;
                                c87086 = c8708M44843;
                                c8680 = c86802;
                            } else {
                                if (i29 != -1) {
                                    C8708 c870810 = (C8708) sparseArray4.get(i29);
                                    if (c870810 != null) {
                                        ConstraintAnchor$Type constraintAnchor$Type2 = ConstraintAnchor$Type.LEFT;
                                        c8708 = c8708M44843;
                                        c8708.m13832(constraintAnchor$Type2, c870810, constraintAnchor$Type2, ((ViewGroup.MarginLayoutParams) c86802).leftMargin, i33);
                                    } else {
                                        c8708 = c8708M44843;
                                    }
                                } else {
                                    c8708 = c8708M44843;
                                    if (i30 != -1 && (c87082 = (C8708) sparseArray4.get(i30)) != null) {
                                        c8708.m13832(ConstraintAnchor$Type.LEFT, c87082, ConstraintAnchor$Type.RIGHT, ((ViewGroup.MarginLayoutParams) c86802).leftMargin, i33);
                                    }
                                }
                                if (i31 != -1) {
                                    C8708 c870811 = (C8708) sparseArray4.get(i31);
                                    if (c870811 != null) {
                                        c8708.m13832(ConstraintAnchor$Type.RIGHT, c870811, ConstraintAnchor$Type.LEFT, ((ViewGroup.MarginLayoutParams) c86802).rightMargin, i34);
                                    }
                                } else if (i32 != -1 && (c87083 = (C8708) sparseArray4.get(i32)) != null) {
                                    ConstraintAnchor$Type constraintAnchor$Type3 = ConstraintAnchor$Type.RIGHT;
                                    c8708.m13832(constraintAnchor$Type3, c87083, constraintAnchor$Type3, ((ViewGroup.MarginLayoutParams) c86802).rightMargin, i34);
                                }
                                int i37 = c86802.f21803;
                                if (i37 != -1) {
                                    C8708 c870812 = (C8708) sparseArray4.get(i37);
                                    if (c870812 != null) {
                                        ConstraintAnchor$Type constraintAnchor$Type4 = ConstraintAnchor$Type.TOP;
                                        c8708.m13832(constraintAnchor$Type4, c870812, constraintAnchor$Type4, ((ViewGroup.MarginLayoutParams) c86802).topMargin, c86802.f21790);
                                    }
                                } else {
                                    int i38 = c86802.f21804;
                                    if (i38 != -1 && (c87084 = (C8708) sparseArray4.get(i38)) != null) {
                                        c8708.m13832(ConstraintAnchor$Type.TOP, c87084, ConstraintAnchor$Type.BOTTOM, ((ViewGroup.MarginLayoutParams) c86802).topMargin, c86802.f21790);
                                    }
                                }
                                int i39 = c86802.f21801;
                                if (i39 != -1) {
                                    C8708 c870813 = (C8708) sparseArray4.get(i39);
                                    if (c870813 != null) {
                                        c8708.m13832(ConstraintAnchor$Type.BOTTOM, c870813, ConstraintAnchor$Type.TOP, ((ViewGroup.MarginLayoutParams) c86802).bottomMargin, c86802.f21773);
                                    }
                                } else {
                                    int i40 = c86802.f21802;
                                    if (i40 != -1 && (c87085 = (C8708) sparseArray4.get(i40)) != null) {
                                        ConstraintAnchor$Type constraintAnchor$Type5 = ConstraintAnchor$Type.BOTTOM;
                                        c8708.m13832(constraintAnchor$Type5, c87085, constraintAnchor$Type5, ((ViewGroup.MarginLayoutParams) c86802).bottomMargin, c86802.f21773);
                                    }
                                }
                                c8680 = c86802;
                                int i41 = c8680.f21794;
                                if (i41 != -1) {
                                    constraintLayout = this;
                                    c87086 = c8708;
                                    constraintLayout.m4486(c87086, c8680, sparseArray4, i41, ConstraintAnchor$Type.BASELINE);
                                } else {
                                    int i42 = c8680.f21793;
                                    if (i42 != -1) {
                                        constraintLayout = this;
                                        c87086 = c8708;
                                        constraintLayout.m4486(c87086, c8680, sparseArray4, i42, ConstraintAnchor$Type.TOP);
                                    } else {
                                        int i43 = c8680.f21797;
                                        if (i43 != -1) {
                                            constraintLayout = this;
                                            c87086 = c8708;
                                            constraintLayout.m4486(c87086, c8680, sparseArray4, i43, ConstraintAnchor$Type.BOTTOM);
                                        } else {
                                            constraintLayout = this;
                                            c87086 = c8708;
                                        }
                                    }
                                }
                                if (f2 >= 0.0f) {
                                    c87086.f22087 = f2;
                                }
                                float f4 = c8680.f21779;
                                if (f4 >= 0.0f) {
                                    c87086.f22086 = f4;
                                }
                            }
                            if (zIsInEditMode && ((i8 = c8680.f21761) != -1 || c8680.f21757 != -1)) {
                                int i44 = c8680.f21757;
                                c87086.f22103 = i8;
                                c87086.f22100 = i44;
                            }
                            if (c8680.f21821) {
                                c87086.m13812(ConstraintWidget$DimensionBehaviour.FIXED);
                                c87086.m13808(((ViewGroup.MarginLayoutParams) c8680).width);
                                if (((ViewGroup.MarginLayoutParams) c8680).width == -2) {
                                    c87086.m13812(ConstraintWidget$DimensionBehaviour.WRAP_CONTENT);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c8680).width == -1) {
                                if (c8680.f21820) {
                                    c87086.m13812(ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT);
                                } else {
                                    c87086.m13812(ConstraintWidget$DimensionBehaviour.MATCH_PARENT);
                                }
                                c87086.mo13840(ConstraintAnchor$Type.LEFT).f22112 = ((ViewGroup.MarginLayoutParams) c8680).leftMargin;
                                c87086.mo13840(ConstraintAnchor$Type.RIGHT).f22112 = ((ViewGroup.MarginLayoutParams) c8680).rightMargin;
                            } else {
                                c87086.m13812(ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT);
                                c87086.m13808(0);
                            }
                            if (c8680.f21822) {
                                i4 = -1;
                                c87086.m13811(ConstraintWidget$DimensionBehaviour.FIXED);
                                c87086.m13809(((ViewGroup.MarginLayoutParams) c8680).height);
                                if (((ViewGroup.MarginLayoutParams) c8680).height == -2) {
                                    c87086.m13811(ConstraintWidget$DimensionBehaviour.WRAP_CONTENT);
                                }
                            } else {
                                i4 = -1;
                                if (((ViewGroup.MarginLayoutParams) c8680).height == -1) {
                                    if (c8680.f21819) {
                                        c87086.m13811(ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT);
                                    } else {
                                        c87086.m13811(ConstraintWidget$DimensionBehaviour.MATCH_PARENT);
                                    }
                                    c87086.mo13840(ConstraintAnchor$Type.TOP).f22112 = ((ViewGroup.MarginLayoutParams) c8680).topMargin;
                                    c87086.mo13840(ConstraintAnchor$Type.BOTTOM).f22112 = ((ViewGroup.MarginLayoutParams) c8680).bottomMargin;
                                } else {
                                    c87086.m13811(ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT);
                                    c87086.m13809(0);
                                }
                            }
                            String str2 = c8680.f21778;
                            if (str2 == null || str2.length() == 0) {
                                c87086.f22098 = 0.0f;
                            } else {
                                int length = str2.length();
                                int iIndexOf3 = str2.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i6 = i4;
                                    i7 = 0;
                                } else {
                                    String strSubstring = str2.substring(0, iIndexOf3);
                                    i6 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? i16 : i4;
                                    i7 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str2.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str2.substring(i7);
                                    fAbs = strSubstring2.length() > 0 ? Float.parseFloat(strSubstring2) : 0.0f;
                                    if (fAbs > 0.0f) {
                                        c87086.f22098 = fAbs;
                                        c87086.f22102 = i6;
                                    }
                                } else {
                                    String strSubstring3 = str2.substring(i7, iIndexOf4);
                                    String strSubstring4 = str2.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                        try {
                                            float f5 = Float.parseFloat(strSubstring3);
                                            float f6 = Float.parseFloat(strSubstring4);
                                            if (f5 > 0.0f && f6 > 0.0f) {
                                                fAbs = i6 == i16 ? Math.abs(f6 / f5) : Math.abs(f5 / f6);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                        if (fAbs > 0.0f) {
                                        }
                                    }
                                }
                            }
                            float f7 = c8680.f21777;
                            float[] fArr = c87086.f22092;
                            fArr[0] = f7;
                            i16 = 1;
                            fArr[1] = c8680.f21776;
                            c87086.f22097 = c8680.f21775;
                            c87086.f22093 = c8680.f21766;
                            int i45 = c8680.f21824;
                            if (i45 >= 0 && i45 <= 3) {
                                c87086.f22074 = i45;
                            }
                            int i46 = c8680.f21765;
                            int i47 = c8680.f21767;
                            int i48 = c8680.f21764;
                            float f8 = c8680.f21759;
                            c87086.f22075 = i46;
                            c87086.f22070 = i47;
                            if (i48 == Integer.MAX_VALUE) {
                                i48 = 0;
                            }
                            c87086.f22071 = i48;
                            c87086.f22068 = f8;
                            if (f8 > 0.0f && f8 < 1.0f && i46 == 0) {
                                c87086.f22075 = i23;
                            }
                            int i49 = c8680.f21768;
                            int i50 = c8680.f21763;
                            int i51 = c8680.f21760;
                            float f9 = c8680.f21762;
                            c87086.f22067 = i49;
                            c87086.f22069 = i50;
                            if (i51 == Integer.MAX_VALUE) {
                                i51 = 0;
                            }
                            c87086.f22053 = i51;
                            c87086.f22052 = f9;
                            if (f9 <= 0.0f || f9 >= 1.0f || i49 != 0) {
                                i5 = 2;
                            } else {
                                i5 = 2;
                                c87086.f22067 = 2;
                            }
                        }
                    }
                    i26 = i3 + 1;
                    i23 = i5;
                    z = z2;
                }
            }
            if (z) {
                c8707.f22032.m962(c8707);
            }
        }
        c8707.f22024.getClass();
        constraintLayout.m4485(c8707, constraintLayout.f6736, i, i2);
        int iM13834 = c8707.m13834();
        int iM13838 = c8707.m13838();
        boolean z5 = c8707.f22014;
        boolean z6 = c8707.f22015;
        C8695 c8695 = constraintLayout.f6727;
        int i52 = c8695.f21886;
        int iResolveSizeAndState = View.resolveSizeAndState(iM13834 + c8695.f21887, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(iM13838 + i52, i2, 0) & 16777215;
        int iMin = Math.min(constraintLayout.f6737, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(constraintLayout.f6738, iResolveSizeAndState2);
        if (z5) {
            iMin |= 16777216;
        }
        if (z6) {
            iMin2 |= 16777216;
        }
        constraintLayout.setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C8708 c8708M4484 = m4484(view);
        if ((view instanceof Guideline) && !(c8708M4484 instanceof C8718)) {
            C8680 c8680 = (C8680) view.getLayoutParams();
            C8718 c8718 = new C8718();
            c8680.f21812 = c8718;
            c8680.f21809 = true;
            c8718.m13871(c8680.f21758);
        }
        if (view instanceof AbstractC8683) {
            AbstractC8683 abstractC8683 = (AbstractC8683) view;
            abstractC8683.m13769();
            ((C8680) view.getLayoutParams()).f21808 = true;
            ArrayList arrayList = this.f6739;
            if (!arrayList.contains(abstractC8683)) {
                arrayList.add(abstractC8683);
            }
        }
        this.f6741.put(view.getId(), view);
        this.f6735 = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f6741.remove(view.getId());
        C8708 c8708M4484 = m4484(view);
        this.f6740.f22033.remove(c8708M4484);
        c8708M4484.mo13799();
        this.f6739.remove(view);
        this.f6735 = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f6735 = true;
        super.requestLayout();
    }

    public void setConstraintSet(C8692 c8692) {
        this.f6732 = c8692;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f6741;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f6738) {
            return;
        }
        this.f6738 = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f6737) {
            return;
        }
        this.f6737 = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f6733) {
            return;
        }
        this.f6733 = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f6734) {
            return;
        }
        this.f6734 = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC8693 abstractC8693) {
        C5703 c5703 = this.f6731;
        if (c5703 != null) {
            c5703.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f6736 = i;
        C8707 c8707 = this.f6740;
        c8707.f22018 = i;
        C8740.f22242 = c8707.m13802(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8708 m4484(View view) {
        if (view == this) {
            return this.f6740;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C8680) {
            return ((C8680) view.getLayoutParams()).f21812;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C8680) {
            return ((C8680) view.getLayoutParams()).f21812;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5 A[PHI: r12
  0x00c5: PHI (r12v35 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour) = 
  (r12v34 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
  (r12v1 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
 binds: [B:35:0x00d2, B:31:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4485(C8707 c8707, int i, int i2, int i3) {
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2;
        int i4;
        int iMin;
        int iMax;
        int iMax2;
        char c;
        int i5;
        boolean z;
        boolean z2;
        C8695 c8695;
        boolean zM13796;
        int i6;
        int i7;
        ArrayList arrayList;
        C8695 c86952;
        boolean z3;
        boolean z4;
        C8695 c86953;
        int i8;
        C2993 c2993;
        C2988 c2988;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z5;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i13 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        C8695 c86954 = this.f6727;
        c86954.f21889 = iMax3;
        c86954.f21888 = iMax4;
        c86954.f21887 = paddingWidth;
        c86954.f21886 = i13;
        c86954.f21885 = i2;
        c86954.f21892 = i3;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            iMax5 = iMax6;
        }
        int i14 = size - paddingWidth;
        int i15 = size2 - i13;
        int i16 = c86954.f21886;
        int i17 = c86954.f21887;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.FIXED;
        int childCount = getChildCount();
        if (mode == Integer.MIN_VALUE) {
            constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                iMax = Math.max(0, this.f6734);
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = constraintWidget$DimensionBehaviour;
                iMin = iMax;
                constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviour4;
                i4 = Integer.MIN_VALUE;
            } else {
                constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviour;
                i4 = Integer.MIN_VALUE;
                iMin = i14;
            }
        } else if (mode != 0) {
            iMin = mode != 1073741824 ? 0 : Math.min(this.f6737 - i17, i14);
            i4 = Integer.MIN_VALUE;
            constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviour3;
        } else {
            constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                iMax = Math.max(0, this.f6734);
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour42 = constraintWidget$DimensionBehaviour;
                iMin = iMax;
                constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviour42;
                i4 = Integer.MIN_VALUE;
            } else {
                iMin = 0;
                i4 = Integer.MIN_VALUE;
                constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviour;
            }
        }
        if (mode2 == i4) {
            constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
            iMax2 = childCount == 0 ? Math.max(0, this.f6733) : i15;
        } else if (mode2 != 0) {
            iMax2 = mode2 != 1073741824 ? 0 : Math.min(this.f6738 - i16, i15);
        } else {
            constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                iMax2 = Math.max(0, this.f6733);
            }
        }
        int iM13834 = c8707.m13834();
        C2979 c2979 = c8707.f22035;
        int[] iArr = c8707.f22049;
        if (iMin == iM13834 && iMax2 == c8707.m13838()) {
            c = 1;
        } else {
            c2979.f6681 = true;
            c = 1;
        }
        c8707.f22103 = 0;
        c8707.f22100 = 0;
        iArr[0] = this.f6737 - i17;
        iArr[c] = this.f6738 - i16;
        c8707.f22089 = 0;
        c8707.f22088 = 0;
        c8707.m13812(constraintWidget$DimensionBehaviour2);
        c8707.m13808(iMin);
        c8707.m13811(constraintWidget$DimensionBehaviour3);
        c8707.m13809(iMax2);
        int i18 = this.f6734 - i17;
        if (i18 < 0) {
            c8707.f22089 = 0;
        } else {
            c8707.f22089 = i18;
        }
        int i19 = this.f6733 - i16;
        if (i19 < 0) {
            c8707.f22088 = 0;
        } else {
            c8707.f22088 = i19;
        }
        c8707.f22025 = iMax5;
        c8707.f22022 = iMax3;
        C0955 c0955 = c8707.f22032;
        C8707 c87072 = (C8707) c0955.f663;
        ArrayList arrayList2 = (ArrayList) c0955.f664;
        C8695 c86955 = c8707.f22021;
        int size3 = c8707.f22033.size();
        int iM138342 = c8707.m13834();
        int iM13838 = c8707.m13838();
        boolean zM13867 = AbstractC8716.m13867(i, 128);
        boolean z6 = zM13867 || AbstractC8716.m13867(i, 64);
        if (z6) {
            int i20 = 0;
            while (i20 < size3) {
                boolean z7 = z6;
                C8708 c8708 = (C8708) c8707.f22033.get(i20);
                int i21 = i20;
                ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = c8708.f22040;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = constraintWidget$DimensionBehaviourArr[0];
                i5 = size3;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z8 = (constraintWidget$DimensionBehaviour5 == constraintWidget$DimensionBehaviour6) && (constraintWidget$DimensionBehaviourArr[1] == constraintWidget$DimensionBehaviour6) && c8708.f22098 > 0.0f;
                if ((c8708.m13830() && z8) || ((c8708.m13817() && z8) || (c8708 instanceof C8713) || c8708.m13830() || c8708.m13817())) {
                    z = false;
                    break;
                } else {
                    i20 = i21 + 1;
                    z6 = z7;
                    size3 = i5;
                }
            }
            i5 = size3;
            z = z6;
        } else {
            i5 = size3;
            z = z6;
        }
        boolean z9 = z & ((mode == 1073741824 && mode2 == 1073741824) || zM13867);
        if (z9) {
            int iMin2 = Math.min(iArr[0], i14);
            int iMin3 = Math.min(iArr[1], i15);
            int i22 = 1073741824;
            if (mode == 1073741824) {
                if (c8707.m13834() != iMin2) {
                    c8707.m13808(iMin2);
                    c2979.f6682 = true;
                }
                i22 = 1073741824;
            }
            if (mode2 == i22 && c8707.m13838() != iMin3) {
                c8707.m13809(iMin3);
                c2979.f6682 = true;
            }
            if (mode == i22 && mode2 == i22) {
                ArrayList<AbstractC2987> arrayList3 = c2979.f6679;
                C8707 c87073 = c2979.f6683;
                if (c2979.f6682 || c2979.f6681) {
                    for (C8708 c87082 : c87073.f22033) {
                        c87082.m13836();
                        c87082.f22065 = false;
                        c87082.f22062.m4478();
                        c87082.f22061.m4464();
                        z9 = z9;
                    }
                    z2 = z9;
                    c87073.m13836();
                    i11 = 0;
                    c87073.f22065 = false;
                    c87073.f22062.m4478();
                    c87073.f22061.m4464();
                    c2979.f6681 = false;
                } else {
                    z2 = z9;
                    i11 = 0;
                }
                c2979.m4446(c2979.f6680);
                c87073.f22103 = i11;
                ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr2 = c87073.f22040;
                c87073.f22100 = i11;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviourM13841 = c87073.m13841(i11);
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviourM138412 = c87073.m13841(1);
                if (c2979.f6682) {
                    c2979.m4445();
                }
                int iM13835 = c87073.m13835();
                int iM13828 = c87073.m13828();
                c8695 = c86955;
                c87073.f22062.f6708.mo4438(iM13835);
                c87073.f22061.f6708.mo4438(iM13828);
                c2979.m4448();
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour7 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                if (constraintWidget$DimensionBehaviourM13841 == constraintWidget$DimensionBehaviour7 || constraintWidget$DimensionBehaviourM138412 == constraintWidget$DimensionBehaviour7) {
                    if (zM13867) {
                        Iterator it = arrayList3.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!((AbstractC2987) it.next()).mo4454()) {
                                    zM13867 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (zM13867 && constraintWidget$DimensionBehaviourM13841 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) {
                        c87073.m13812(ConstraintWidget$DimensionBehaviour.FIXED);
                        i12 = iM13835;
                        c87073.m13808(c2979.m4444(c87073, 0));
                        c87073.f22062.f6703.mo4438(c87073.m13834());
                    } else {
                        i12 = iM13835;
                    }
                    if (zM13867 && constraintWidget$DimensionBehaviourM138412 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) {
                        c87073.m13811(ConstraintWidget$DimensionBehaviour.FIXED);
                        c87073.m13809(c2979.m4444(c87073, 1));
                        c87073.f22061.f6703.mo4438(c87073.m13838());
                    }
                } else {
                    i12 = iM13835;
                }
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour8 = constraintWidget$DimensionBehaviourArr2[0];
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour9 = ConstraintWidget$DimensionBehaviour.FIXED;
                if (constraintWidget$DimensionBehaviour8 == constraintWidget$DimensionBehaviour9 || constraintWidget$DimensionBehaviour8 == ConstraintWidget$DimensionBehaviour.MATCH_PARENT) {
                    int iM138343 = c87073.m13834() + i12;
                    c87073.f22062.f6710.mo4438(iM138343);
                    c87073.f22062.f6703.mo4438(iM138343 - i12);
                    c2979.m4448();
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour10 = constraintWidget$DimensionBehaviourArr2[1];
                    if (constraintWidget$DimensionBehaviour10 == constraintWidget$DimensionBehaviour9 || constraintWidget$DimensionBehaviour10 == ConstraintWidget$DimensionBehaviour.MATCH_PARENT) {
                        int iM138382 = c87073.m13838() + iM13828;
                        c87073.f22061.f6710.mo4438(iM138382);
                        c87073.f22061.f6703.mo4438(iM138382 - iM13828);
                    }
                    c2979.m4448();
                    z5 = true;
                } else {
                    z5 = false;
                }
                for (AbstractC2987 abstractC2987 : arrayList3) {
                    if (abstractC2987.f6706 != c87073 || abstractC2987.f6709) {
                        abstractC2987.mo4450();
                    }
                }
                for (AbstractC2987 abstractC29872 : arrayList3) {
                    if (z5 || abstractC29872.f6706 != c87073) {
                        if (!abstractC29872.f6708.f6677 || ((!abstractC29872.f6710.f6677 && !(abstractC29872 instanceof C2994)) || (!abstractC29872.f6703.f6677 && !(abstractC29872 instanceof C2981) && !(abstractC29872 instanceof C2994)))) {
                            zM13796 = false;
                            break;
                        }
                    }
                }
                zM13796 = true;
                c87073.m13812(constraintWidget$DimensionBehaviourM13841);
                c87073.m13811(constraintWidget$DimensionBehaviourM138412);
                i6 = 2;
                i10 = 1073741824;
            } else {
                z2 = z9;
                c8695 = c86955;
                C8707 c87074 = c2979.f6683;
                if (c2979.f6682) {
                    for (C8708 c87083 : c87074.f22033) {
                        c87083.m13836();
                        c87083.f22065 = false;
                        C2993 c29932 = c87083.f22062;
                        c29932.f6703.f6677 = false;
                        c29932.f6709 = false;
                        c29932.m4478();
                        C2988 c29882 = c87083.f22061;
                        c29882.f6703.f6677 = false;
                        c29882.f6709 = false;
                        c29882.m4464();
                    }
                    i9 = 0;
                    c87074.m13836();
                    c87074.f22065 = false;
                    C2993 c29933 = c87074.f22062;
                    c29933.f6703.f6677 = false;
                    c29933.f6709 = false;
                    c29933.m4478();
                    C2988 c29883 = c87074.f22061;
                    c29883.f6703.f6677 = false;
                    c29883.f6709 = false;
                    c29883.m4464();
                    c2979.m4445();
                } else {
                    i9 = 0;
                }
                c2979.m4446(c2979.f6680);
                c87074.f22103 = i9;
                c87074.f22100 = i9;
                c87074.f22062.f6708.mo4438(i9);
                c87074.f22061.f6708.mo4438(i9);
                i10 = 1073741824;
                if (mode == 1073741824) {
                    zM13796 = c8707.m13796(i9, zM13867);
                    i6 = 1;
                } else {
                    zM13796 = true;
                    i6 = 0;
                }
                if (mode2 == 1073741824) {
                    zM13796 &= c8707.m13796(1, zM13867);
                    i6++;
                }
            }
            if (zM13796) {
                c8707.mo13798(mode == i10, mode2 == i10);
            }
        } else {
            z2 = z9;
            c8695 = c86955;
            zM13796 = false;
            i6 = 0;
        }
        if (zM13796 && i6 == 2) {
            return;
        }
        int i23 = c8707.f22018;
        if (i5 > 0) {
            int size4 = c8707.f22033.size();
            boolean zM13802 = c8707.m13802(64);
            C8695 c86956 = c8707.f22021;
            int i24 = 0;
            while (i24 < size4) {
                C8708 c87084 = (C8708) c8707.f22033.get(i24);
                if ((c87084 instanceof C8718) || (c87084 instanceof C8712) || c87084.f22058 || (zM13802 && (c2993 = c87084.f22062) != null && (c2988 = c87084.f22061) != null && c2993.f6703.f6677 && c2988.f6703.f6677)) {
                    i8 = size4;
                } else {
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviourM138413 = c87084.m13841(0);
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviourM138414 = c87084.m13841(1);
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour11 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                    i8 = size4;
                    boolean z10 = constraintWidget$DimensionBehaviourM138413 == constraintWidget$DimensionBehaviour11 && c87084.f22075 != 1 && constraintWidget$DimensionBehaviourM138414 == constraintWidget$DimensionBehaviour11 && c87084.f22067 != 1;
                    if (!z10 && c8707.m13802(1) && !(c87084 instanceof C8713)) {
                        if (constraintWidget$DimensionBehaviourM138413 == constraintWidget$DimensionBehaviour11 && c87084.f22075 == 0 && constraintWidget$DimensionBehaviourM138414 != constraintWidget$DimensionBehaviour11 && !c87084.m13830()) {
                            z10 = true;
                        }
                        if (constraintWidget$DimensionBehaviourM138414 == constraintWidget$DimensionBehaviour11 && c87084.f22067 == 0 && constraintWidget$DimensionBehaviourM138413 != constraintWidget$DimensionBehaviour11 && !c87084.m13830()) {
                            z10 = true;
                        }
                        if ((constraintWidget$DimensionBehaviourM138413 == constraintWidget$DimensionBehaviour11 || constraintWidget$DimensionBehaviourM138414 == constraintWidget$DimensionBehaviour11) && c87084.f22098 > 0.0f) {
                            z10 = true;
                        }
                    }
                    if (!z10) {
                        c0955.m935(0, c86956, c87084);
                    }
                }
                i24++;
                size4 = i8;
            }
            ConstraintLayout constraintLayout = c86956.f21890;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList4 = constraintLayout.f6739;
            for (int i25 = 0; i25 < childCount2; i25++) {
                constraintLayout.getChildAt(i25);
            }
            int size5 = arrayList4.size();
            if (size5 > 0) {
                for (int i26 = 0; i26 < size5; i26++) {
                    ((AbstractC8683) arrayList4.get(i26)).getClass();
                }
            }
        }
        c0955.m962(c8707);
        int size6 = arrayList2.size();
        if (i5 > 0) {
            c0955.m918(c8707, 0, iM138342, iM13838);
        }
        if (size6 > 0) {
            ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr3 = c8707.f22040;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour12 = constraintWidget$DimensionBehaviourArr3[0];
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour13 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
            boolean z11 = constraintWidget$DimensionBehaviour12 == constraintWidget$DimensionBehaviour13;
            boolean z12 = constraintWidget$DimensionBehaviourArr3[1] == constraintWidget$DimensionBehaviour13;
            int iMax7 = Math.max(c8707.m13834(), c87072.f22089);
            int iMax8 = Math.max(c8707.m13838(), c87072.f22088);
            int i27 = 0;
            boolean z13 = false;
            while (i27 < size6) {
                C8708 c87085 = (C8708) arrayList2.get(i27);
                if (c87085 instanceof C8713) {
                    int iM138344 = c87085.m13834();
                    int iM138383 = c87085.m13838();
                    z3 = z12;
                    z4 = z11;
                    c86953 = c8695;
                    boolean zM935 = z13 | c0955.m935(1, c86953, c87085);
                    int iM138345 = c87085.m13834();
                    boolean z14 = zM935;
                    int iM138384 = c87085.m13838();
                    if (iM138345 != iM138344) {
                        c87085.m13808(iM138345);
                        if (z4 && c87085.m13835() + c87085.f22037 > iMax7) {
                            iMax7 = Math.max(iMax7, c87085.mo13840(ConstraintAnchor$Type.RIGHT).m13843() + c87085.m13835() + c87085.f22037);
                        }
                        z14 = true;
                    }
                    if (iM138384 != iM138383) {
                        c87085.m13809(iM138384);
                        if (z3 && c87085.m13828() + c87085.f22099 > iMax8) {
                            iMax8 = Math.max(iMax8, c87085.mo13840(ConstraintAnchor$Type.BOTTOM).m13843() + c87085.m13828() + c87085.f22099);
                        }
                        z14 = true;
                    }
                    z13 = z14 | ((C8713) c87085).f22159;
                } else {
                    z3 = z12;
                    z4 = z11;
                    c86953 = c8695;
                }
                i27++;
                z11 = z4;
                c8695 = c86953;
                z12 = z3;
            }
            boolean z15 = z12;
            boolean z16 = z11;
            int i28 = 0;
            while (true) {
                C8695 c86957 = c8695;
                if (i28 >= 2) {
                    break;
                }
                int i29 = 0;
                while (i29 < size6) {
                    C8708 c87086 = (C8708) arrayList2.get(i29);
                    if (((c87086 instanceof AbstractC8715) && !(c87086 instanceof C8713)) || (c87086 instanceof C8718) || c87086.f22084 == 8 || ((z2 && c87086.f22062.f6703.f6677 && c87086.f22061.f6703.f6677) || (c87086 instanceof C8713))) {
                        i7 = size6;
                        c86952 = c86957;
                        arrayList = arrayList2;
                    } else {
                        int iM138346 = c87086.m13834();
                        int iM138385 = c87086.m13838();
                        i7 = size6;
                        int i30 = c87086.f22101;
                        arrayList = arrayList2;
                        boolean zM9352 = c0955.m935(i28 == 1 ? 2 : 1, c86957, c87086) | z13;
                        int iM138347 = c87086.m13834();
                        c86952 = c86957;
                        int iM138386 = c87086.m13838();
                        if (iM138347 != iM138346) {
                            c87086.m13808(iM138347);
                            if (z16 && c87086.m13835() + c87086.f22037 > iMax7) {
                                iMax7 = Math.max(iMax7, c87086.mo13840(ConstraintAnchor$Type.RIGHT).m13843() + c87086.m13835() + c87086.f22037);
                            }
                            zM9352 = true;
                        }
                        if (iM138386 != iM138385) {
                            c87086.m13809(iM138386);
                            if (z15 && c87086.m13828() + c87086.f22099 > iMax8) {
                                iMax8 = Math.max(iMax8, c87086.mo13840(ConstraintAnchor$Type.BOTTOM).m13843() + c87086.m13828() + c87086.f22099);
                            }
                            zM9352 = true;
                        }
                        z13 = (!c87086.f22059 || i30 == c87086.f22101) ? zM9352 : true;
                    }
                    i29++;
                    size6 = i7;
                    arrayList2 = arrayList;
                    c86957 = c86952;
                }
                int i31 = size6;
                c8695 = c86957;
                ArrayList arrayList5 = arrayList2;
                if (!z13) {
                    break;
                }
                i28++;
                c0955.m918(c8707, i28, iM138342, iM13838);
                size6 = i31;
                arrayList2 = arrayList5;
                z13 = false;
            }
        }
        c8707.f22018 = i23;
        C8740.f22242 = c8707.m13802(512);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m4486(C8708 c8708, C8680 c8680, SparseArray sparseArray, int i, ConstraintAnchor$Type constraintAnchor$Type) {
        View view = (View) this.f6741.get(i);
        C8708 c87082 = (C8708) sparseArray.get(i);
        if (c87082 == null || view == null || !(view.getLayoutParams() instanceof C8680)) {
            return;
        }
        c8680.f21810 = true;
        ConstraintAnchor$Type constraintAnchor$Type2 = ConstraintAnchor$Type.BASELINE;
        if (constraintAnchor$Type == constraintAnchor$Type2) {
            C8680 c86802 = (C8680) view.getLayoutParams();
            c86802.f21810 = true;
            c86802.f21812.f22059 = true;
        }
        c8708.mo13840(constraintAnchor$Type2).m13846(c87082.mo13840(constraintAnchor$Type), c8680.f21769, c8680.f21770, true);
        c8708.f22059 = true;
        c8708.mo13840(ConstraintAnchor$Type.TOP).m13853();
        c8708.mo13840(ConstraintAnchor$Type.BOTTOM).m13853();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m4487(AttributeSet attributeSet, int i) {
        C8707 c8707 = this.f6740;
        c8707.f22085 = this;
        C8695 c8695 = this.f6727;
        c8707.f22021 = c8695;
        c8707.f22035.f6678 = c8695;
        this.f6741.put(getId(), this);
        this.f6732 = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC8691.f21868, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.f6734 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6734);
                } else if (index == 17) {
                    this.f6733 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6733);
                } else if (index == 14) {
                    this.f6737 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6737);
                } else if (index == 15) {
                    this.f6738 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6738);
                } else if (index == 113) {
                    this.f6736 = typedArrayObtainStyledAttributes.getInt(index, this.f6736);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m4488(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f6731 = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C8692 c8692 = new C8692();
                        this.f6732 = c8692;
                        c8692.m13779(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f6732 = null;
                    }
                    this.f6730 = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        c8707.f22018 = this.f6736;
        C8740.f22242 = c8707.m13802(512);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m4488(int i) {
        String str;
        Context context = getContext();
        C5703 c5703 = new C5703(24);
        c5703.f14509 = new SparseArray();
        c5703.f14510 = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            C1164 c1164 = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c5703.m10308(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                C1164 c11642 = new C1164(context, xml);
                                ((SparseArray) c5703.f14509).put(c11642.f1417, c11642);
                                c1164 = c11642;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                C8694 c8694 = new C8694(context, xml);
                                if (c1164 != null) {
                                    ((ArrayList) c1164.f1416).add(c8694);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        }
        this.f6731 = c5703;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6741 = new SparseArray();
        this.f6739 = new ArrayList(4);
        this.f6740 = new C8707();
        this.f6734 = 0;
        this.f6733 = 0;
        this.f6737 = Integer.MAX_VALUE;
        this.f6738 = Integer.MAX_VALUE;
        this.f6735 = true;
        this.f6736 = 257;
        this.f6732 = null;
        this.f6731 = null;
        this.f6730 = -1;
        this.f6729 = new HashMap();
        this.f6728 = new SparseArray();
        this.f6727 = new C8695(this, this);
        m4487(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C8680 c8680 = new C8680(layoutParams);
        c8680.f21786 = -1;
        c8680.f21785 = -1;
        c8680.f21784 = -1.0f;
        c8680.f21783 = true;
        c8680.f21782 = -1;
        c8680.f21781 = -1;
        c8680.f21800 = -1;
        c8680.f21799 = -1;
        c8680.f21803 = -1;
        c8680.f21804 = -1;
        c8680.f21801 = -1;
        c8680.f21802 = -1;
        c8680.f21794 = -1;
        c8680.f21793 = -1;
        c8680.f21797 = -1;
        c8680.f21798 = -1;
        c8680.f21795 = 0;
        c8680.f21796 = 0.0f;
        c8680.f21788 = -1;
        c8680.f21787 = -1;
        c8680.f21791 = -1;
        c8680.f21792 = -1;
        c8680.f21789 = Integer.MIN_VALUE;
        c8680.f21790 = Integer.MIN_VALUE;
        c8680.f21774 = Integer.MIN_VALUE;
        c8680.f21773 = Integer.MIN_VALUE;
        c8680.f21772 = Integer.MIN_VALUE;
        c8680.f21771 = Integer.MIN_VALUE;
        c8680.f21770 = Integer.MIN_VALUE;
        c8680.f21769 = 0;
        c8680.f21780 = 0.5f;
        c8680.f21779 = 0.5f;
        c8680.f21778 = null;
        c8680.f21777 = -1.0f;
        c8680.f21776 = -1.0f;
        c8680.f21775 = 0;
        c8680.f21766 = 0;
        c8680.f21765 = 0;
        c8680.f21768 = 0;
        c8680.f21767 = 0;
        c8680.f21763 = 0;
        c8680.f21764 = 0;
        c8680.f21760 = 0;
        c8680.f21759 = 1.0f;
        c8680.f21762 = 1.0f;
        c8680.f21761 = -1;
        c8680.f21757 = -1;
        c8680.f21758 = -1;
        c8680.f21820 = false;
        c8680.f21819 = false;
        c8680.f21823 = null;
        c8680.f21824 = 0;
        c8680.f21821 = true;
        c8680.f21822 = true;
        c8680.f21810 = false;
        c8680.f21809 = false;
        c8680.f21808 = false;
        c8680.f21807 = -1;
        c8680.f21806 = -1;
        c8680.f21805 = -1;
        c8680.f21817 = -1;
        c8680.f21818 = Integer.MIN_VALUE;
        c8680.f21814 = Integer.MIN_VALUE;
        c8680.f21813 = 0.5f;
        c8680.f21812 = new C8708();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) c8680).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) c8680).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) c8680).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) c8680).bottomMargin = marginLayoutParams.bottomMargin;
            c8680.setMarginStart(marginLayoutParams.getMarginStart());
            c8680.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof C8680)) {
            return c8680;
        }
        C8680 c86802 = (C8680) layoutParams;
        c8680.f21786 = c86802.f21786;
        c8680.f21785 = c86802.f21785;
        c8680.f21784 = c86802.f21784;
        c8680.f21783 = c86802.f21783;
        c8680.f21782 = c86802.f21782;
        c8680.f21781 = c86802.f21781;
        c8680.f21800 = c86802.f21800;
        c8680.f21799 = c86802.f21799;
        c8680.f21803 = c86802.f21803;
        c8680.f21804 = c86802.f21804;
        c8680.f21801 = c86802.f21801;
        c8680.f21802 = c86802.f21802;
        c8680.f21794 = c86802.f21794;
        c8680.f21793 = c86802.f21793;
        c8680.f21797 = c86802.f21797;
        c8680.f21798 = c86802.f21798;
        c8680.f21795 = c86802.f21795;
        c8680.f21796 = c86802.f21796;
        c8680.f21788 = c86802.f21788;
        c8680.f21787 = c86802.f21787;
        c8680.f21791 = c86802.f21791;
        c8680.f21792 = c86802.f21792;
        c8680.f21789 = c86802.f21789;
        c8680.f21790 = c86802.f21790;
        c8680.f21774 = c86802.f21774;
        c8680.f21773 = c86802.f21773;
        c8680.f21772 = c86802.f21772;
        c8680.f21771 = c86802.f21771;
        c8680.f21770 = c86802.f21770;
        c8680.f21769 = c86802.f21769;
        c8680.f21780 = c86802.f21780;
        c8680.f21779 = c86802.f21779;
        c8680.f21778 = c86802.f21778;
        c8680.f21777 = c86802.f21777;
        c8680.f21776 = c86802.f21776;
        c8680.f21775 = c86802.f21775;
        c8680.f21766 = c86802.f21766;
        c8680.f21820 = c86802.f21820;
        c8680.f21819 = c86802.f21819;
        c8680.f21765 = c86802.f21765;
        c8680.f21768 = c86802.f21768;
        c8680.f21767 = c86802.f21767;
        c8680.f21764 = c86802.f21764;
        c8680.f21763 = c86802.f21763;
        c8680.f21760 = c86802.f21760;
        c8680.f21759 = c86802.f21759;
        c8680.f21762 = c86802.f21762;
        c8680.f21761 = c86802.f21761;
        c8680.f21757 = c86802.f21757;
        c8680.f21758 = c86802.f21758;
        c8680.f21821 = c86802.f21821;
        c8680.f21822 = c86802.f21822;
        c8680.f21810 = c86802.f21810;
        c8680.f21809 = c86802.f21809;
        c8680.f21807 = c86802.f21807;
        c8680.f21806 = c86802.f21806;
        c8680.f21805 = c86802.f21805;
        c8680.f21817 = c86802.f21817;
        c8680.f21818 = c86802.f21818;
        c8680.f21814 = c86802.f21814;
        c8680.f21813 = c86802.f21813;
        c8680.f21823 = c86802.f21823;
        c8680.f21824 = c86802.f21824;
        c8680.f21812 = c86802.f21812;
        return c8680;
    }
}

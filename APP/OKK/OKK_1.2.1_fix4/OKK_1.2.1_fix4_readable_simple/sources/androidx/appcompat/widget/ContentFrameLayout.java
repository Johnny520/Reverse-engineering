package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import p057g.InterfaceC0880Q;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TypedValue f1156a;

    /* JADX INFO: renamed from: b */
    public TypedValue f1157b;

    /* JADX INFO: renamed from: c */
    public TypedValue f1158c;

    /* JADX INFO: renamed from: d */
    public TypedValue f1159d;

    /* JADX INFO: renamed from: e */
    public TypedValue f1160e;

    /* JADX INFO: renamed from: f */
    public TypedValue f1161f;

    /* JADX INFO: renamed from: g */
    public final Rect f1162g;

    public ContentFrameLayout(Context r2, AttributeSet r3) {
        super(r2, r3, 0);
        this.f1162g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1160e != null) goto L6;
        this.f1160e = new TypedValue();
    L6:
        return this.f1160e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1161f != null) goto L6;
        this.f1161f = new TypedValue();
    L6:
        return this.f1161f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1158c != null) goto L6;
        this.f1158c = new TypedValue();
    L6:
        return this.f1158c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1159d != null) goto L6;
        this.f1159d = new TypedValue();
    L6:
        return this.f1159d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1156a != null) goto L6;
        this.f1156a = new TypedValue();
    L6:
        return this.f1156a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1157b != null) goto L6;
        this.f1157b = new TypedValue();
    L6:
        return this.f1157b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r17, int r18) {
        DisplayMetrics r1 = getContext().getResources().getDisplayMetrics();
        boolean r4 = true;
        if (r1.widthPixels >= r1.heightPixels) goto L5;
        boolean r2 = true;
    L6:
        int r3 = View.MeasureSpec.getMode(r17);
        int r6 = View.MeasureSpec.getMode(r18);
        Rect r7 = this.f1162g;
        if (r3 != Integer.MIN_VALUE) goto L22;
        if (r2 == false) goto L10;
        TypedValue r12 = this.f1159d;
    L11:
        if (r12 == null) goto L22;
        int r13 = r12.type;
        if (r13 == 0) goto L22;
        if (r13 != 5) goto L17;
        float r122 = r12.getDimension(r1);
    L16:
        int r123 = (int) r122;
    L20:
        if (r123 <= 0) goto L22;
        int r124 = View.MeasureSpec.makeMeasureSpec(Math.min(r123 - (r7.left + r7.right), View.MeasureSpec.getSize(r17)), 1073741824);
        boolean r132 = true;
    L23:
        if (r6 != Integer.MIN_VALUE) goto L38;
        if (r2 == false) goto L26;
        TypedValue r62 = this.f1160e;
    L27:
        if (r62 == null) goto L38;
        int r14 = r62.type;
        if (r14 == 0) goto L38;
        if (r14 != 5) goto L33;
        float r63 = r62.getDimension(r1);
    L32:
        int r64 = (int) r63;
    L36:
        if (r64 <= 0) goto L38;
        int r65 = View.MeasureSpec.makeMeasureSpec(Math.min(r64 - (r7.top + r7.bottom), View.MeasureSpec.getSize(r18)), 1073741824);
    L39:
        super.onMeasure(r124, r65);
        int r125 = getMeasuredWidth();
        int r142 = View.MeasureSpec.makeMeasureSpec(r125, 1073741824);
        if (r132 == true) goto L58;
        if (r3 != Integer.MIN_VALUE) goto L58;
        if (r2 == false) goto L44;
        TypedValue r22 = this.f1157b;
    L45:
        if (r22 == null) goto L58;
        int r32 = r22.type;
        if (r32 == 0) goto L58;
        if (r32 != 5) goto L51;
        float r15 = r22.getDimension(r1);
    L50:
        int r16 = (int) r15;
    L54:
        if (r16 <= 0) goto L56;
        r16 = r16 - (r7.left + r7.right);
    L56:
        if (r125 >= r16) goto L58;
        r142 = View.MeasureSpec.makeMeasureSpec(r16, 1073741824);
    L59:
        if (r4 == false) goto L62;
        super.onMeasure(r142, r65);
        return;
    L62:
        return;
    L51:
        if (r32 != 6) goto L53;
        int r19 = r1.widthPixels;
        r15 = r22.getFraction(r19, r19);
        goto L50
    L53:
        r16 = 0;
        goto L54
    L44:
        r22 = this.f1156a;
    L58:
        r4 = false;
        goto L59
    L33:
        if (r14 != 6) goto L35;
        int r143 = r1.heightPixels;
        r63 = r62.getFraction(r143, r143);
        goto L32
    L35:
        r64 = 0;
        goto L36
    L26:
        r62 = this.f1161f;
    L38:
        r65 = r18;
        goto L39
    L17:
        if (r13 != 6) goto L19;
        int r133 = r1.widthPixels;
        r122 = r12.getFraction(r133, r133);
        goto L16
    L19:
        r123 = 0;
        goto L20
    L10:
        r12 = this.f1158c;
    L22:
        r124 = r17;
        r132 = false;
        goto L23
    L5:
        r2 = false;
        goto L6
    }

    public void setAttachListener(InterfaceC0880Q r1) {
    }
}

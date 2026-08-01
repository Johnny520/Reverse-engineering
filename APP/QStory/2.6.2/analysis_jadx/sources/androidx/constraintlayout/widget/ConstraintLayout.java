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
import androidx.compose.animation.core.C0318;
import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import net.bytebuddy.jar.asm.Opcodes;
import org.xmlpull.v1.XmlPullParserException;
import p199.AbstractC7851;
import p199.AbstractC7853;
import p199.AbstractC7861;
import p199.AbstractC7863;
import p199.C7850;
import p199.C7857;
import p199.C7862;
import p199.C7864;
import p199.C7865;
import p203.C7877;
import p203.C7878;
import p203.C7888;
import p206.C7910;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static C7857 f6380;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C7865 f6381;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final SparseArray f6382;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public HashMap f6383;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f6384;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public C4870 f6385;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C7862 f6386;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f6387;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f6388;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f6389;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f6390;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f6391;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f6392;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f6393;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C7877 f6394;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final SparseArray f6395;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6395 = new SparseArray();
        this.f6393 = new ArrayList(4);
        this.f6394 = new C7877();
        this.f6388 = 0;
        this.f6387 = 0;
        this.f6391 = Integer.MAX_VALUE;
        this.f6392 = Integer.MAX_VALUE;
        this.f6389 = true;
        this.f6390 = 257;
        this.f6386 = null;
        this.f6385 = null;
        this.f6384 = -1;
        this.f6383 = new HashMap();
        this.f6382 = new SparseArray();
        this.f6381 = new C7865(this, this);
        m3917(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static C7857 getSharedValues() {
        if (f6380 == null) {
            C7857 c7857 = new C7857();
            new SparseIntArray();
            new HashMap();
            f6380 = c7857;
        }
        return f6380;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C7850 m3913() {
        C7850 c7850 = new C7850(-2, -2);
        c7850.f21444 = -1;
        c7850.f21443 = -1;
        c7850.f21442 = -1.0f;
        c7850.f21441 = true;
        c7850.f21440 = -1;
        c7850.f21439 = -1;
        c7850.f21458 = -1;
        c7850.f21457 = -1;
        c7850.f21461 = -1;
        c7850.f21462 = -1;
        c7850.f21459 = -1;
        c7850.f21460 = -1;
        c7850.f21452 = -1;
        c7850.f21451 = -1;
        c7850.f21455 = -1;
        c7850.f21456 = -1;
        c7850.f21453 = 0;
        c7850.f21454 = 0.0f;
        c7850.f21446 = -1;
        c7850.f21445 = -1;
        c7850.f21449 = -1;
        c7850.f21450 = -1;
        c7850.f21447 = Integer.MIN_VALUE;
        c7850.f21448 = Integer.MIN_VALUE;
        c7850.f21432 = Integer.MIN_VALUE;
        c7850.f21431 = Integer.MIN_VALUE;
        c7850.f21430 = Integer.MIN_VALUE;
        c7850.f21429 = Integer.MIN_VALUE;
        c7850.f21428 = Integer.MIN_VALUE;
        c7850.f21427 = 0;
        c7850.f21438 = 0.5f;
        c7850.f21437 = 0.5f;
        c7850.f21436 = null;
        c7850.f21435 = -1.0f;
        c7850.f21434 = -1.0f;
        c7850.f21433 = 0;
        c7850.f21424 = 0;
        c7850.f21423 = 0;
        c7850.f21426 = 0;
        c7850.f21425 = 0;
        c7850.f21421 = 0;
        c7850.f21422 = 0;
        c7850.f21418 = 0;
        c7850.f21417 = 1.0f;
        c7850.f21420 = 1.0f;
        c7850.f21419 = -1;
        c7850.f21415 = -1;
        c7850.f21416 = -1;
        c7850.f21478 = false;
        c7850.f21477 = false;
        c7850.f21481 = null;
        c7850.f21482 = 0;
        c7850.f21479 = true;
        c7850.f21480 = true;
        c7850.f21468 = false;
        c7850.f21467 = false;
        c7850.f21466 = false;
        c7850.f21465 = -1;
        c7850.f21464 = -1;
        c7850.f21463 = -1;
        c7850.f21475 = -1;
        c7850.f21476 = Integer.MIN_VALUE;
        c7850.f21472 = Integer.MIN_VALUE;
        c7850.f21471 = 0.5f;
        c7850.f21470 = new C7878();
        return c7850;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C7850;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f6393;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC7853) arrayList.get(i)).getClass();
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
        this.f6389 = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m3913();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C7850 c7850 = new C7850(context, attributeSet);
        c7850.f21444 = -1;
        c7850.f21443 = -1;
        c7850.f21442 = -1.0f;
        c7850.f21441 = true;
        c7850.f21440 = -1;
        c7850.f21439 = -1;
        c7850.f21458 = -1;
        c7850.f21457 = -1;
        c7850.f21461 = -1;
        c7850.f21462 = -1;
        c7850.f21459 = -1;
        c7850.f21460 = -1;
        c7850.f21452 = -1;
        c7850.f21451 = -1;
        c7850.f21455 = -1;
        c7850.f21456 = -1;
        c7850.f21453 = 0;
        c7850.f21454 = 0.0f;
        c7850.f21446 = -1;
        c7850.f21445 = -1;
        c7850.f21449 = -1;
        c7850.f21450 = -1;
        c7850.f21447 = Integer.MIN_VALUE;
        c7850.f21448 = Integer.MIN_VALUE;
        c7850.f21432 = Integer.MIN_VALUE;
        c7850.f21431 = Integer.MIN_VALUE;
        c7850.f21430 = Integer.MIN_VALUE;
        c7850.f21429 = Integer.MIN_VALUE;
        c7850.f21428 = Integer.MIN_VALUE;
        c7850.f21427 = 0;
        c7850.f21438 = 0.5f;
        c7850.f21437 = 0.5f;
        c7850.f21436 = null;
        c7850.f21435 = -1.0f;
        c7850.f21434 = -1.0f;
        c7850.f21433 = 0;
        c7850.f21424 = 0;
        c7850.f21423 = 0;
        c7850.f21426 = 0;
        c7850.f21425 = 0;
        c7850.f21421 = 0;
        c7850.f21422 = 0;
        c7850.f21418 = 0;
        c7850.f21417 = 1.0f;
        c7850.f21420 = 1.0f;
        c7850.f21419 = -1;
        c7850.f21415 = -1;
        c7850.f21416 = -1;
        c7850.f21478 = false;
        c7850.f21477 = false;
        c7850.f21481 = null;
        c7850.f21482 = 0;
        c7850.f21479 = true;
        c7850.f21480 = true;
        c7850.f21468 = false;
        c7850.f21467 = false;
        c7850.f21466 = false;
        c7850.f21465 = -1;
        c7850.f21464 = -1;
        c7850.f21463 = -1;
        c7850.f21475 = -1;
        c7850.f21476 = Integer.MIN_VALUE;
        c7850.f21472 = Integer.MIN_VALUE;
        c7850.f21471 = 0.5f;
        c7850.f21470 = new C7878();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC7861.f21526);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = AbstractC7851.f21483.get(index);
            switch (i2) {
                case 1:
                    c7850.f21416 = typedArrayObtainStyledAttributes.getInt(index, c7850.f21416);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c7850.f21456);
                    c7850.f21456 = resourceId;
                    if (resourceId == -1) {
                        c7850.f21456 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    c7850.f21453 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7850.f21453);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, c7850.f21454) % 360.0f;
                    c7850.f21454 = f;
                    if (f < 0.0f) {
                        c7850.f21454 = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    c7850.f21444 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c7850.f21444);
                    break;
                case 6:
                    c7850.f21443 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c7850.f21443);
                    break;
                case 7:
                    c7850.f21442 = typedArrayObtainStyledAttributes.getFloat(index, c7850.f21442);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c7850.f21440);
                    c7850.f21440 = resourceId2;
                    if (resourceId2 == -1) {
                        c7850.f21440 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c7850.f21439);
                    c7850.f21439 = resourceId3;
                    if (resourceId3 == -1) {
                        c7850.f21439 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c7850.f21458);
                    c7850.f21458 = resourceId4;
                    if (resourceId4 == -1) {
                        c7850.f21458 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c7850.f21457);
                    c7850.f21457 = resourceId5;
                    if (resourceId5 == -1) {
                        c7850.f21457 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c7850.f21461);
                    c7850.f21461 = resourceId6;
                    if (resourceId6 == -1) {
                        c7850.f21461 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c7850.f21462);
                    c7850.f21462 = resourceId7;
                    if (resourceId7 == -1) {
                        c7850.f21462 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c7850.f21459);
                    c7850.f21459 = resourceId8;
                    if (resourceId8 == -1) {
                        c7850.f21459 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c7850.f21460);
                    c7850.f21460 = resourceId9;
                    if (resourceId9 == -1) {
                        c7850.f21460 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c7850.f21452);
                    c7850.f21452 = resourceId10;
                    if (resourceId10 == -1) {
                        c7850.f21452 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c7850.f21446);
                    c7850.f21446 = resourceId11;
                    if (resourceId11 == -1) {
                        c7850.f21446 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c7850.f21445);
                    c7850.f21445 = resourceId12;
                    if (resourceId12 == -1) {
                        c7850.f21445 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c7850.f21449);
                    c7850.f21449 = resourceId13;
                    if (resourceId13 == -1) {
                        c7850.f21449 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c7850.f21450);
                    c7850.f21450 = resourceId14;
                    if (resourceId14 == -1) {
                        c7850.f21450 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    c7850.f21447 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7850.f21447);
                    break;
                case 22:
                    c7850.f21448 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7850.f21448);
                    break;
                case 23:
                    c7850.f21432 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7850.f21432);
                    break;
                case 24:
                    c7850.f21431 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7850.f21431);
                    break;
                case 25:
                    c7850.f21430 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7850.f21430);
                    break;
                case 26:
                    c7850.f21429 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7850.f21429);
                    break;
                case 27:
                    c7850.f21478 = typedArrayObtainStyledAttributes.getBoolean(index, c7850.f21478);
                    break;
                case 28:
                    c7850.f21477 = typedArrayObtainStyledAttributes.getBoolean(index, c7850.f21477);
                    break;
                case 29:
                    c7850.f21438 = typedArrayObtainStyledAttributes.getFloat(index, c7850.f21438);
                    break;
                case 30:
                    c7850.f21437 = typedArrayObtainStyledAttributes.getFloat(index, c7850.f21437);
                    break;
                case 31:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c7850.f21423 = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c7850.f21426 = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        c7850.f21425 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7850.f21425);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c7850.f21425) == -2) {
                            c7850.f21425 = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        c7850.f21422 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7850.f21422);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c7850.f21422) == -2) {
                            c7850.f21422 = -2;
                        }
                    }
                    break;
                case 35:
                    c7850.f21417 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c7850.f21417));
                    c7850.f21423 = 2;
                    break;
                case 36:
                    try {
                        c7850.f21421 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7850.f21421);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c7850.f21421) == -2) {
                            c7850.f21421 = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        c7850.f21418 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7850.f21418);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c7850.f21418) == -2) {
                            c7850.f21418 = -2;
                        }
                    }
                    break;
                case 38:
                    c7850.f21420 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c7850.f21420));
                    c7850.f21426 = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            C7862.m13190(c7850, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c7850.f21435 = typedArrayObtainStyledAttributes.getFloat(index, c7850.f21435);
                            break;
                        case 46:
                            c7850.f21434 = typedArrayObtainStyledAttributes.getFloat(index, c7850.f21434);
                            break;
                        case 47:
                            c7850.f21433 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c7850.f21424 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c7850.f21419 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c7850.f21419);
                            break;
                        case 50:
                            c7850.f21415 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c7850.f21415);
                            break;
                        case 51:
                            c7850.f21481 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, c7850.f21451);
                            c7850.f21451 = resourceId15;
                            if (resourceId15 == -1) {
                                c7850.f21451 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, c7850.f21455);
                            c7850.f21455 = resourceId16;
                            if (resourceId16 == -1) {
                                c7850.f21455 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            c7850.f21427 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7850.f21427);
                            break;
                        case 55:
                            c7850.f21428 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7850.f21428);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    C7862.m13191(c7850, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    C7862.m13191(c7850, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c7850.f21482 = typedArrayObtainStyledAttributes.getInt(index, c7850.f21482);
                                    break;
                                case 67:
                                    c7850.f21441 = typedArrayObtainStyledAttributes.getBoolean(index, c7850.f21441);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c7850.m13174();
        return c7850;
    }

    public int getMaxHeight() {
        return this.f6392;
    }

    public int getMaxWidth() {
        return this.f6391;
    }

    public int getMinHeight() {
        return this.f6387;
    }

    public int getMinWidth() {
        return this.f6388;
    }

    public int getOptimizationLevel() {
        return this.f6394.f21676;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C7877 c7877 = this.f6394;
        if (c7877.f21741 == null) {
            int id2 = getId();
            if (id2 != -1) {
                c7877.f21741 = getContext().getResources().getResourceEntryName(id2);
            } else {
                c7877.f21741 = "parent";
            }
        }
        if (c7877.f21754 == null) {
            c7877.f21754 = c7877.f21741;
            Log.v("ConstraintLayout", " setDebugName " + c7877.f21754);
        }
        for (C7878 c7878 : c7877.f21691) {
            View view = c7878.f21743;
            if (view != null) {
                if (c7878.f21741 == null && (id = view.getId()) != -1) {
                    c7878.f21741 = getContext().getResources().getResourceEntryName(id);
                }
                if (c7878.f21754 == null) {
                    c7878.f21754 = c7878.f21741;
                    Log.v("ConstraintLayout", " setDebugName " + c7878.f21754);
                }
            }
        }
        c7877.mo13214(sb);
        return sb.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C7850 c7850 = (C7850) childAt.getLayoutParams();
            C7878 c7878 = c7850.f21470;
            if (childAt.getVisibility() != 8 || c7850.f21467 || c7850.f21466 || zIsInEditMode) {
                int iM13248 = c7878.m13248();
                int iM13241 = c7878.m13241();
                childAt.layout(iM13248, iM13241, c7878.m13247() + iM13248, c7878.m13251() + iM13241);
            }
        }
        ArrayList arrayList = this.f6393;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC7853) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x053e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 1541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C7878 c7878M3914 = m3914(view);
        if ((view instanceof Guideline) && !(c7878M3914 instanceof C7888)) {
            C7850 c7850 = (C7850) view.getLayoutParams();
            C7888 c7888 = new C7888();
            c7850.f21470 = c7888;
            c7850.f21467 = true;
            c7888.m13284(c7850.f21416);
        }
        if (view instanceof AbstractC7853) {
            AbstractC7853 abstractC7853 = (AbstractC7853) view;
            abstractC7853.m13182();
            ((C7850) view.getLayoutParams()).f21466 = true;
            ArrayList arrayList = this.f6393;
            if (!arrayList.contains(abstractC7853)) {
                arrayList.add(abstractC7853);
            }
        }
        this.f6395.put(view.getId(), view);
        this.f6389 = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f6395.remove(view.getId());
        C7878 c7878M3914 = m3914(view);
        this.f6394.f21691.remove(c7878M3914);
        c7878M3914.mo13212();
        this.f6393.remove(view);
        this.f6389 = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f6389 = true;
        super.requestLayout();
    }

    public void setConstraintSet(C7862 c7862) {
        this.f6386 = c7862;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f6395;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f6392) {
            return;
        }
        this.f6392 = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f6391) {
            return;
        }
        this.f6391 = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f6387) {
            return;
        }
        this.f6387 = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f6388) {
            return;
        }
        this.f6388 = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC7863 abstractC7863) {
        C4870 c4870 = this.f6385;
        if (c4870 != null) {
            c4870.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f6390 = i;
        C7877 c7877 = this.f6394;
        c7877.f21676 = i;
        C7910.f21900 = c7877.m13215(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7878 m3914(View view) {
        if (view == this) {
            return this.f6394;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C7850) {
            return ((C7850) view.getLayoutParams()).f21470;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C7850) {
            return ((C7850) view.getLayoutParams()).f21470;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3915(p203.C7877 r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 1764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m3915(飘花落叶言子苏兰楪哲世.飘花落叶言子楪世兰哲苏, int, int, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m3916(C7878 c7878, C7850 c7850, SparseArray sparseArray, int i, ConstraintAnchor$Type constraintAnchor$Type) {
        View view = (View) this.f6395.get(i);
        C7878 c78782 = (C7878) sparseArray.get(i);
        if (c78782 == null || view == null || !(view.getLayoutParams() instanceof C7850)) {
            return;
        }
        c7850.f21468 = true;
        ConstraintAnchor$Type constraintAnchor$Type2 = ConstraintAnchor$Type.BASELINE;
        if (constraintAnchor$Type == constraintAnchor$Type2) {
            C7850 c78502 = (C7850) view.getLayoutParams();
            c78502.f21468 = true;
            c78502.f21470.f21717 = true;
        }
        c7878.mo13253(constraintAnchor$Type2).m13259(c78782.mo13253(constraintAnchor$Type), c7850.f21427, c7850.f21428, true);
        c7878.f21717 = true;
        c7878.mo13253(ConstraintAnchor$Type.TOP).m13266();
        c7878.mo13253(ConstraintAnchor$Type.BOTTOM).m13266();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m3917(AttributeSet attributeSet, int i) {
        C7877 c7877 = this.f6394;
        c7877.f21743 = this;
        C7865 c7865 = this.f6381;
        c7877.f21679 = c7865;
        c7877.f21693.f6332 = c7865;
        this.f6395.put(getId(), this);
        this.f6386 = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC7861.f21526, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.f6388 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6388);
                } else if (index == 17) {
                    this.f6387 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6387);
                } else if (index == 14) {
                    this.f6391 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6391);
                } else if (index == 15) {
                    this.f6392 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6392);
                } else if (index == 113) {
                    this.f6390 = typedArrayObtainStyledAttributes.getInt(index, this.f6390);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m3918(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f6385 = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C7862 c7862 = new C7862();
                        this.f6386 = c7862;
                        c7862.m13192(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f6386 = null;
                    }
                    this.f6384 = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        c7877.f21676 = this.f6390;
        C7910.f21900 = c7877.m13215(512);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m3918(int i) {
        String str;
        Context context = getContext();
        C4870 c4870 = new C4870(24);
        c4870.f14160 = new SparseArray();
        c4870.f14161 = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            C0318 c0318 = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c4870.m9757(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                C0318 c03182 = new C0318(context, xml);
                                ((SparseArray) c4870.f14160).put(c03182.f1072, c03182);
                                c0318 = c03182;
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
                                C7864 c7864 = new C7864(context, xml);
                                if (c0318 != null) {
                                    ((ArrayList) c0318.f1071).add(c7864);
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
        this.f6385 = c4870;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6395 = new SparseArray();
        this.f6393 = new ArrayList(4);
        this.f6394 = new C7877();
        this.f6388 = 0;
        this.f6387 = 0;
        this.f6391 = Integer.MAX_VALUE;
        this.f6392 = Integer.MAX_VALUE;
        this.f6389 = true;
        this.f6390 = 257;
        this.f6386 = null;
        this.f6385 = null;
        this.f6384 = -1;
        this.f6383 = new HashMap();
        this.f6382 = new SparseArray();
        this.f6381 = new C7865(this, this);
        m3917(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C7850 c7850 = new C7850(layoutParams);
        c7850.f21444 = -1;
        c7850.f21443 = -1;
        c7850.f21442 = -1.0f;
        c7850.f21441 = true;
        c7850.f21440 = -1;
        c7850.f21439 = -1;
        c7850.f21458 = -1;
        c7850.f21457 = -1;
        c7850.f21461 = -1;
        c7850.f21462 = -1;
        c7850.f21459 = -1;
        c7850.f21460 = -1;
        c7850.f21452 = -1;
        c7850.f21451 = -1;
        c7850.f21455 = -1;
        c7850.f21456 = -1;
        c7850.f21453 = 0;
        c7850.f21454 = 0.0f;
        c7850.f21446 = -1;
        c7850.f21445 = -1;
        c7850.f21449 = -1;
        c7850.f21450 = -1;
        c7850.f21447 = Integer.MIN_VALUE;
        c7850.f21448 = Integer.MIN_VALUE;
        c7850.f21432 = Integer.MIN_VALUE;
        c7850.f21431 = Integer.MIN_VALUE;
        c7850.f21430 = Integer.MIN_VALUE;
        c7850.f21429 = Integer.MIN_VALUE;
        c7850.f21428 = Integer.MIN_VALUE;
        c7850.f21427 = 0;
        c7850.f21438 = 0.5f;
        c7850.f21437 = 0.5f;
        c7850.f21436 = null;
        c7850.f21435 = -1.0f;
        c7850.f21434 = -1.0f;
        c7850.f21433 = 0;
        c7850.f21424 = 0;
        c7850.f21423 = 0;
        c7850.f21426 = 0;
        c7850.f21425 = 0;
        c7850.f21421 = 0;
        c7850.f21422 = 0;
        c7850.f21418 = 0;
        c7850.f21417 = 1.0f;
        c7850.f21420 = 1.0f;
        c7850.f21419 = -1;
        c7850.f21415 = -1;
        c7850.f21416 = -1;
        c7850.f21478 = false;
        c7850.f21477 = false;
        c7850.f21481 = null;
        c7850.f21482 = 0;
        c7850.f21479 = true;
        c7850.f21480 = true;
        c7850.f21468 = false;
        c7850.f21467 = false;
        c7850.f21466 = false;
        c7850.f21465 = -1;
        c7850.f21464 = -1;
        c7850.f21463 = -1;
        c7850.f21475 = -1;
        c7850.f21476 = Integer.MIN_VALUE;
        c7850.f21472 = Integer.MIN_VALUE;
        c7850.f21471 = 0.5f;
        c7850.f21470 = new C7878();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) c7850).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) c7850).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) c7850).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) c7850).bottomMargin = marginLayoutParams.bottomMargin;
            c7850.setMarginStart(marginLayoutParams.getMarginStart());
            c7850.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof C7850)) {
            return c7850;
        }
        C7850 c78502 = (C7850) layoutParams;
        c7850.f21444 = c78502.f21444;
        c7850.f21443 = c78502.f21443;
        c7850.f21442 = c78502.f21442;
        c7850.f21441 = c78502.f21441;
        c7850.f21440 = c78502.f21440;
        c7850.f21439 = c78502.f21439;
        c7850.f21458 = c78502.f21458;
        c7850.f21457 = c78502.f21457;
        c7850.f21461 = c78502.f21461;
        c7850.f21462 = c78502.f21462;
        c7850.f21459 = c78502.f21459;
        c7850.f21460 = c78502.f21460;
        c7850.f21452 = c78502.f21452;
        c7850.f21451 = c78502.f21451;
        c7850.f21455 = c78502.f21455;
        c7850.f21456 = c78502.f21456;
        c7850.f21453 = c78502.f21453;
        c7850.f21454 = c78502.f21454;
        c7850.f21446 = c78502.f21446;
        c7850.f21445 = c78502.f21445;
        c7850.f21449 = c78502.f21449;
        c7850.f21450 = c78502.f21450;
        c7850.f21447 = c78502.f21447;
        c7850.f21448 = c78502.f21448;
        c7850.f21432 = c78502.f21432;
        c7850.f21431 = c78502.f21431;
        c7850.f21430 = c78502.f21430;
        c7850.f21429 = c78502.f21429;
        c7850.f21428 = c78502.f21428;
        c7850.f21427 = c78502.f21427;
        c7850.f21438 = c78502.f21438;
        c7850.f21437 = c78502.f21437;
        c7850.f21436 = c78502.f21436;
        c7850.f21435 = c78502.f21435;
        c7850.f21434 = c78502.f21434;
        c7850.f21433 = c78502.f21433;
        c7850.f21424 = c78502.f21424;
        c7850.f21478 = c78502.f21478;
        c7850.f21477 = c78502.f21477;
        c7850.f21423 = c78502.f21423;
        c7850.f21426 = c78502.f21426;
        c7850.f21425 = c78502.f21425;
        c7850.f21422 = c78502.f21422;
        c7850.f21421 = c78502.f21421;
        c7850.f21418 = c78502.f21418;
        c7850.f21417 = c78502.f21417;
        c7850.f21420 = c78502.f21420;
        c7850.f21419 = c78502.f21419;
        c7850.f21415 = c78502.f21415;
        c7850.f21416 = c78502.f21416;
        c7850.f21479 = c78502.f21479;
        c7850.f21480 = c78502.f21480;
        c7850.f21468 = c78502.f21468;
        c7850.f21467 = c78502.f21467;
        c7850.f21465 = c78502.f21465;
        c7850.f21464 = c78502.f21464;
        c7850.f21463 = c78502.f21463;
        c7850.f21475 = c78502.f21475;
        c7850.f21476 = c78502.f21476;
        c7850.f21472 = c78502.f21472;
        c7850.f21471 = c78502.f21471;
        c7850.f21481 = c78502.f21481;
        c7850.f21482 = c78502.f21482;
        c7850.f21470 = c78502.f21470;
        return c7850;
    }
}

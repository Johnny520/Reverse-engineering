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
import kotlin.reflect.jvm.internal.impl.types.C4871;
import net.bytebuddy.jar.asm.Opcodes;
import org.xmlpull.v1.XmlPullParserException;
import p199.AbstractC7852;
import p199.AbstractC7854;
import p199.AbstractC7862;
import p199.AbstractC7864;
import p199.C7851;
import p199.C7858;
import p199.C7863;
import p199.C7865;
import p199.C7866;
import p203.C7878;
import p203.C7879;
import p203.C7889;
import p206.C7911;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static C7858 f6381;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C7866 f6382;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final SparseArray f6383;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public HashMap f6384;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f6385;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public C4871 f6386;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C7863 f6387;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f6388;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f6389;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f6390;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f6391;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f6392;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f6393;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f6394;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C7878 f6395;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final SparseArray f6396;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6396 = new SparseArray();
        this.f6394 = new ArrayList(4);
        this.f6395 = new C7878();
        this.f6389 = 0;
        this.f6388 = 0;
        this.f6392 = Integer.MAX_VALUE;
        this.f6393 = Integer.MAX_VALUE;
        this.f6390 = true;
        this.f6391 = 257;
        this.f6387 = null;
        this.f6386 = null;
        this.f6385 = -1;
        this.f6384 = new HashMap();
        this.f6383 = new SparseArray();
        this.f6382 = new C7866(this, this);
        m3927(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static C7858 getSharedValues() {
        if (f6381 == null) {
            C7858 c7858 = new C7858();
            new SparseIntArray();
            new HashMap();
            f6381 = c7858;
        }
        return f6381;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C7851 m3923() {
        C7851 c7851 = new C7851(-2, -2);
        c7851.f21441 = -1;
        c7851.f21440 = -1;
        c7851.f21439 = -1.0f;
        c7851.f21438 = true;
        c7851.f21437 = -1;
        c7851.f21436 = -1;
        c7851.f21455 = -1;
        c7851.f21454 = -1;
        c7851.f21458 = -1;
        c7851.f21459 = -1;
        c7851.f21456 = -1;
        c7851.f21457 = -1;
        c7851.f21449 = -1;
        c7851.f21448 = -1;
        c7851.f21452 = -1;
        c7851.f21453 = -1;
        c7851.f21450 = 0;
        c7851.f21451 = 0.0f;
        c7851.f21443 = -1;
        c7851.f21442 = -1;
        c7851.f21446 = -1;
        c7851.f21447 = -1;
        c7851.f21444 = Integer.MIN_VALUE;
        c7851.f21445 = Integer.MIN_VALUE;
        c7851.f21429 = Integer.MIN_VALUE;
        c7851.f21428 = Integer.MIN_VALUE;
        c7851.f21427 = Integer.MIN_VALUE;
        c7851.f21426 = Integer.MIN_VALUE;
        c7851.f21425 = Integer.MIN_VALUE;
        c7851.f21424 = 0;
        c7851.f21435 = 0.5f;
        c7851.f21434 = 0.5f;
        c7851.f21433 = null;
        c7851.f21432 = -1.0f;
        c7851.f21431 = -1.0f;
        c7851.f21430 = 0;
        c7851.f21421 = 0;
        c7851.f21420 = 0;
        c7851.f21423 = 0;
        c7851.f21422 = 0;
        c7851.f21418 = 0;
        c7851.f21419 = 0;
        c7851.f21415 = 0;
        c7851.f21414 = 1.0f;
        c7851.f21417 = 1.0f;
        c7851.f21416 = -1;
        c7851.f21412 = -1;
        c7851.f21413 = -1;
        c7851.f21475 = false;
        c7851.f21474 = false;
        c7851.f21478 = null;
        c7851.f21479 = 0;
        c7851.f21476 = true;
        c7851.f21477 = true;
        c7851.f21465 = false;
        c7851.f21464 = false;
        c7851.f21463 = false;
        c7851.f21462 = -1;
        c7851.f21461 = -1;
        c7851.f21460 = -1;
        c7851.f21472 = -1;
        c7851.f21473 = Integer.MIN_VALUE;
        c7851.f21469 = Integer.MIN_VALUE;
        c7851.f21468 = 0.5f;
        c7851.f21467 = new C7879();
        return c7851;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C7851;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f6394;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC7854) arrayList.get(i)).getClass();
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
        this.f6390 = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m3923();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C7851 c7851 = new C7851(context, attributeSet);
        c7851.f21441 = -1;
        c7851.f21440 = -1;
        c7851.f21439 = -1.0f;
        c7851.f21438 = true;
        c7851.f21437 = -1;
        c7851.f21436 = -1;
        c7851.f21455 = -1;
        c7851.f21454 = -1;
        c7851.f21458 = -1;
        c7851.f21459 = -1;
        c7851.f21456 = -1;
        c7851.f21457 = -1;
        c7851.f21449 = -1;
        c7851.f21448 = -1;
        c7851.f21452 = -1;
        c7851.f21453 = -1;
        c7851.f21450 = 0;
        c7851.f21451 = 0.0f;
        c7851.f21443 = -1;
        c7851.f21442 = -1;
        c7851.f21446 = -1;
        c7851.f21447 = -1;
        c7851.f21444 = Integer.MIN_VALUE;
        c7851.f21445 = Integer.MIN_VALUE;
        c7851.f21429 = Integer.MIN_VALUE;
        c7851.f21428 = Integer.MIN_VALUE;
        c7851.f21427 = Integer.MIN_VALUE;
        c7851.f21426 = Integer.MIN_VALUE;
        c7851.f21425 = Integer.MIN_VALUE;
        c7851.f21424 = 0;
        c7851.f21435 = 0.5f;
        c7851.f21434 = 0.5f;
        c7851.f21433 = null;
        c7851.f21432 = -1.0f;
        c7851.f21431 = -1.0f;
        c7851.f21430 = 0;
        c7851.f21421 = 0;
        c7851.f21420 = 0;
        c7851.f21423 = 0;
        c7851.f21422 = 0;
        c7851.f21418 = 0;
        c7851.f21419 = 0;
        c7851.f21415 = 0;
        c7851.f21414 = 1.0f;
        c7851.f21417 = 1.0f;
        c7851.f21416 = -1;
        c7851.f21412 = -1;
        c7851.f21413 = -1;
        c7851.f21475 = false;
        c7851.f21474 = false;
        c7851.f21478 = null;
        c7851.f21479 = 0;
        c7851.f21476 = true;
        c7851.f21477 = true;
        c7851.f21465 = false;
        c7851.f21464 = false;
        c7851.f21463 = false;
        c7851.f21462 = -1;
        c7851.f21461 = -1;
        c7851.f21460 = -1;
        c7851.f21472 = -1;
        c7851.f21473 = Integer.MIN_VALUE;
        c7851.f21469 = Integer.MIN_VALUE;
        c7851.f21468 = 0.5f;
        c7851.f21467 = new C7879();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC7862.f21523);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = AbstractC7852.f21480.get(index);
            switch (i2) {
                case 1:
                    c7851.f21413 = typedArrayObtainStyledAttributes.getInt(index, c7851.f21413);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c7851.f21453);
                    c7851.f21453 = resourceId;
                    if (resourceId == -1) {
                        c7851.f21453 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    c7851.f21450 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7851.f21450);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, c7851.f21451) % 360.0f;
                    c7851.f21451 = f;
                    if (f < 0.0f) {
                        c7851.f21451 = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    c7851.f21441 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c7851.f21441);
                    break;
                case 6:
                    c7851.f21440 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c7851.f21440);
                    break;
                case 7:
                    c7851.f21439 = typedArrayObtainStyledAttributes.getFloat(index, c7851.f21439);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c7851.f21437);
                    c7851.f21437 = resourceId2;
                    if (resourceId2 == -1) {
                        c7851.f21437 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c7851.f21436);
                    c7851.f21436 = resourceId3;
                    if (resourceId3 == -1) {
                        c7851.f21436 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c7851.f21455);
                    c7851.f21455 = resourceId4;
                    if (resourceId4 == -1) {
                        c7851.f21455 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c7851.f21454);
                    c7851.f21454 = resourceId5;
                    if (resourceId5 == -1) {
                        c7851.f21454 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c7851.f21458);
                    c7851.f21458 = resourceId6;
                    if (resourceId6 == -1) {
                        c7851.f21458 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c7851.f21459);
                    c7851.f21459 = resourceId7;
                    if (resourceId7 == -1) {
                        c7851.f21459 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c7851.f21456);
                    c7851.f21456 = resourceId8;
                    if (resourceId8 == -1) {
                        c7851.f21456 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c7851.f21457);
                    c7851.f21457 = resourceId9;
                    if (resourceId9 == -1) {
                        c7851.f21457 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c7851.f21449);
                    c7851.f21449 = resourceId10;
                    if (resourceId10 == -1) {
                        c7851.f21449 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c7851.f21443);
                    c7851.f21443 = resourceId11;
                    if (resourceId11 == -1) {
                        c7851.f21443 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c7851.f21442);
                    c7851.f21442 = resourceId12;
                    if (resourceId12 == -1) {
                        c7851.f21442 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c7851.f21446);
                    c7851.f21446 = resourceId13;
                    if (resourceId13 == -1) {
                        c7851.f21446 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c7851.f21447);
                    c7851.f21447 = resourceId14;
                    if (resourceId14 == -1) {
                        c7851.f21447 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    c7851.f21444 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7851.f21444);
                    break;
                case 22:
                    c7851.f21445 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7851.f21445);
                    break;
                case 23:
                    c7851.f21429 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7851.f21429);
                    break;
                case 24:
                    c7851.f21428 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7851.f21428);
                    break;
                case 25:
                    c7851.f21427 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7851.f21427);
                    break;
                case 26:
                    c7851.f21426 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7851.f21426);
                    break;
                case 27:
                    c7851.f21475 = typedArrayObtainStyledAttributes.getBoolean(index, c7851.f21475);
                    break;
                case 28:
                    c7851.f21474 = typedArrayObtainStyledAttributes.getBoolean(index, c7851.f21474);
                    break;
                case 29:
                    c7851.f21435 = typedArrayObtainStyledAttributes.getFloat(index, c7851.f21435);
                    break;
                case 30:
                    c7851.f21434 = typedArrayObtainStyledAttributes.getFloat(index, c7851.f21434);
                    break;
                case 31:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c7851.f21420 = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c7851.f21423 = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        c7851.f21422 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7851.f21422);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c7851.f21422) == -2) {
                            c7851.f21422 = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        c7851.f21419 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7851.f21419);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c7851.f21419) == -2) {
                            c7851.f21419 = -2;
                        }
                    }
                    break;
                case 35:
                    c7851.f21414 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c7851.f21414));
                    c7851.f21420 = 2;
                    break;
                case 36:
                    try {
                        c7851.f21418 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7851.f21418);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c7851.f21418) == -2) {
                            c7851.f21418 = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        c7851.f21415 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7851.f21415);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c7851.f21415) == -2) {
                            c7851.f21415 = -2;
                        }
                    }
                    break;
                case 38:
                    c7851.f21417 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c7851.f21417));
                    c7851.f21423 = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            C7863.m13218(c7851, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c7851.f21432 = typedArrayObtainStyledAttributes.getFloat(index, c7851.f21432);
                            break;
                        case 46:
                            c7851.f21431 = typedArrayObtainStyledAttributes.getFloat(index, c7851.f21431);
                            break;
                        case 47:
                            c7851.f21430 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c7851.f21421 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c7851.f21416 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c7851.f21416);
                            break;
                        case 50:
                            c7851.f21412 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c7851.f21412);
                            break;
                        case 51:
                            c7851.f21478 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, c7851.f21448);
                            c7851.f21448 = resourceId15;
                            if (resourceId15 == -1) {
                                c7851.f21448 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, c7851.f21452);
                            c7851.f21452 = resourceId16;
                            if (resourceId16 == -1) {
                                c7851.f21452 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            c7851.f21424 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7851.f21424);
                            break;
                        case 55:
                            c7851.f21425 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c7851.f21425);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    C7863.m13219(c7851, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    C7863.m13219(c7851, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c7851.f21479 = typedArrayObtainStyledAttributes.getInt(index, c7851.f21479);
                                    break;
                                case 67:
                                    c7851.f21438 = typedArrayObtainStyledAttributes.getBoolean(index, c7851.f21438);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c7851.m13202();
        return c7851;
    }

    public int getMaxHeight() {
        return this.f6393;
    }

    public int getMaxWidth() {
        return this.f6392;
    }

    public int getMinHeight() {
        return this.f6388;
    }

    public int getMinWidth() {
        return this.f6389;
    }

    public int getOptimizationLevel() {
        return this.f6395.f21673;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C7878 c7878 = this.f6395;
        if (c7878.f21738 == null) {
            int id2 = getId();
            if (id2 != -1) {
                c7878.f21738 = getContext().getResources().getResourceEntryName(id2);
            } else {
                c7878.f21738 = "parent";
            }
        }
        if (c7878.f21751 == null) {
            c7878.f21751 = c7878.f21738;
            Log.v("ConstraintLayout", " setDebugName " + c7878.f21751);
        }
        for (C7879 c7879 : c7878.f21688) {
            View view = c7879.f21740;
            if (view != null) {
                if (c7879.f21738 == null && (id = view.getId()) != -1) {
                    c7879.f21738 = getContext().getResources().getResourceEntryName(id);
                }
                if (c7879.f21751 == null) {
                    c7879.f21751 = c7879.f21738;
                    Log.v("ConstraintLayout", " setDebugName " + c7879.f21751);
                }
            }
        }
        c7878.mo13242(sb);
        return sb.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C7851 c7851 = (C7851) childAt.getLayoutParams();
            C7879 c7879 = c7851.f21467;
            if (childAt.getVisibility() != 8 || c7851.f21464 || c7851.f21463 || zIsInEditMode) {
                int iM13276 = c7879.m13276();
                int iM13269 = c7879.m13269();
                childAt.layout(iM13276, iM13269, c7879.m13275() + iM13276, c7879.m13279() + iM13269);
            }
        }
        ArrayList arrayList = this.f6394;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC7854) arrayList.get(i6)).getClass();
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
        C7879 c7879M3924 = m3924(view);
        if ((view instanceof Guideline) && !(c7879M3924 instanceof C7889)) {
            C7851 c7851 = (C7851) view.getLayoutParams();
            C7889 c7889 = new C7889();
            c7851.f21467 = c7889;
            c7851.f21464 = true;
            c7889.m13312(c7851.f21413);
        }
        if (view instanceof AbstractC7854) {
            AbstractC7854 abstractC7854 = (AbstractC7854) view;
            abstractC7854.m13210();
            ((C7851) view.getLayoutParams()).f21463 = true;
            ArrayList arrayList = this.f6394;
            if (!arrayList.contains(abstractC7854)) {
                arrayList.add(abstractC7854);
            }
        }
        this.f6396.put(view.getId(), view);
        this.f6390 = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f6396.remove(view.getId());
        C7879 c7879M3924 = m3924(view);
        this.f6395.f21688.remove(c7879M3924);
        c7879M3924.mo13240();
        this.f6394.remove(view);
        this.f6390 = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f6390 = true;
        super.requestLayout();
    }

    public void setConstraintSet(C7863 c7863) {
        this.f6387 = c7863;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f6396;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f6393) {
            return;
        }
        this.f6393 = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f6392) {
            return;
        }
        this.f6392 = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f6388) {
            return;
        }
        this.f6388 = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f6389) {
            return;
        }
        this.f6389 = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC7864 abstractC7864) {
        C4871 c4871 = this.f6386;
        if (c4871 != null) {
            c4871.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f6391 = i;
        C7878 c7878 = this.f6395;
        c7878.f21673 = i;
        C7911.f21897 = c7878.m13243(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7879 m3924(View view) {
        if (view == this) {
            return this.f6395;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C7851) {
            return ((C7851) view.getLayoutParams()).f21467;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C7851) {
            return ((C7851) view.getLayoutParams()).f21467;
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
    public final void m3925(p203.C7878 r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 1764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m3925(飘花落叶言子苏兰楪哲世.飘花落叶言子楪世兰哲苏, int, int, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m3926(C7879 c7879, C7851 c7851, SparseArray sparseArray, int i, ConstraintAnchor$Type constraintAnchor$Type) {
        View view = (View) this.f6396.get(i);
        C7879 c78792 = (C7879) sparseArray.get(i);
        if (c78792 == null || view == null || !(view.getLayoutParams() instanceof C7851)) {
            return;
        }
        c7851.f21465 = true;
        ConstraintAnchor$Type constraintAnchor$Type2 = ConstraintAnchor$Type.BASELINE;
        if (constraintAnchor$Type == constraintAnchor$Type2) {
            C7851 c78512 = (C7851) view.getLayoutParams();
            c78512.f21465 = true;
            c78512.f21467.f21714 = true;
        }
        c7879.mo13281(constraintAnchor$Type2).m13287(c78792.mo13281(constraintAnchor$Type), c7851.f21424, c7851.f21425, true);
        c7879.f21714 = true;
        c7879.mo13281(ConstraintAnchor$Type.TOP).m13294();
        c7879.mo13281(ConstraintAnchor$Type.BOTTOM).m13294();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m3927(AttributeSet attributeSet, int i) {
        C7878 c7878 = this.f6395;
        c7878.f21740 = this;
        C7866 c7866 = this.f6382;
        c7878.f21676 = c7866;
        c7878.f21690.f6333 = c7866;
        this.f6396.put(getId(), this);
        this.f6387 = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC7862.f21523, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.f6389 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6389);
                } else if (index == 17) {
                    this.f6388 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6388);
                } else if (index == 14) {
                    this.f6392 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6392);
                } else if (index == 15) {
                    this.f6393 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6393);
                } else if (index == 113) {
                    this.f6391 = typedArrayObtainStyledAttributes.getInt(index, this.f6391);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m3928(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f6386 = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C7863 c7863 = new C7863();
                        this.f6387 = c7863;
                        c7863.m13220(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f6387 = null;
                    }
                    this.f6385 = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        c7878.f21673 = this.f6391;
        C7911.f21897 = c7878.m13243(512);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m3928(int i) {
        String str;
        Context context = getContext();
        C4871 c4871 = new C4871(24);
        c4871.f14164 = new SparseArray();
        c4871.f14165 = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            C0318 c0318 = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c4871.m9749(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                C0318 c03182 = new C0318(context, xml);
                                ((SparseArray) c4871.f14164).put(c03182.f1072, c03182);
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
                                C7865 c7865 = new C7865(context, xml);
                                if (c0318 != null) {
                                    ((ArrayList) c0318.f1071).add(c7865);
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
        this.f6386 = c4871;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6396 = new SparseArray();
        this.f6394 = new ArrayList(4);
        this.f6395 = new C7878();
        this.f6389 = 0;
        this.f6388 = 0;
        this.f6392 = Integer.MAX_VALUE;
        this.f6393 = Integer.MAX_VALUE;
        this.f6390 = true;
        this.f6391 = 257;
        this.f6387 = null;
        this.f6386 = null;
        this.f6385 = -1;
        this.f6384 = new HashMap();
        this.f6383 = new SparseArray();
        this.f6382 = new C7866(this, this);
        m3927(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C7851 c7851 = new C7851(layoutParams);
        c7851.f21441 = -1;
        c7851.f21440 = -1;
        c7851.f21439 = -1.0f;
        c7851.f21438 = true;
        c7851.f21437 = -1;
        c7851.f21436 = -1;
        c7851.f21455 = -1;
        c7851.f21454 = -1;
        c7851.f21458 = -1;
        c7851.f21459 = -1;
        c7851.f21456 = -1;
        c7851.f21457 = -1;
        c7851.f21449 = -1;
        c7851.f21448 = -1;
        c7851.f21452 = -1;
        c7851.f21453 = -1;
        c7851.f21450 = 0;
        c7851.f21451 = 0.0f;
        c7851.f21443 = -1;
        c7851.f21442 = -1;
        c7851.f21446 = -1;
        c7851.f21447 = -1;
        c7851.f21444 = Integer.MIN_VALUE;
        c7851.f21445 = Integer.MIN_VALUE;
        c7851.f21429 = Integer.MIN_VALUE;
        c7851.f21428 = Integer.MIN_VALUE;
        c7851.f21427 = Integer.MIN_VALUE;
        c7851.f21426 = Integer.MIN_VALUE;
        c7851.f21425 = Integer.MIN_VALUE;
        c7851.f21424 = 0;
        c7851.f21435 = 0.5f;
        c7851.f21434 = 0.5f;
        c7851.f21433 = null;
        c7851.f21432 = -1.0f;
        c7851.f21431 = -1.0f;
        c7851.f21430 = 0;
        c7851.f21421 = 0;
        c7851.f21420 = 0;
        c7851.f21423 = 0;
        c7851.f21422 = 0;
        c7851.f21418 = 0;
        c7851.f21419 = 0;
        c7851.f21415 = 0;
        c7851.f21414 = 1.0f;
        c7851.f21417 = 1.0f;
        c7851.f21416 = -1;
        c7851.f21412 = -1;
        c7851.f21413 = -1;
        c7851.f21475 = false;
        c7851.f21474 = false;
        c7851.f21478 = null;
        c7851.f21479 = 0;
        c7851.f21476 = true;
        c7851.f21477 = true;
        c7851.f21465 = false;
        c7851.f21464 = false;
        c7851.f21463 = false;
        c7851.f21462 = -1;
        c7851.f21461 = -1;
        c7851.f21460 = -1;
        c7851.f21472 = -1;
        c7851.f21473 = Integer.MIN_VALUE;
        c7851.f21469 = Integer.MIN_VALUE;
        c7851.f21468 = 0.5f;
        c7851.f21467 = new C7879();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) c7851).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) c7851).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) c7851).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) c7851).bottomMargin = marginLayoutParams.bottomMargin;
            c7851.setMarginStart(marginLayoutParams.getMarginStart());
            c7851.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof C7851)) {
            return c7851;
        }
        C7851 c78512 = (C7851) layoutParams;
        c7851.f21441 = c78512.f21441;
        c7851.f21440 = c78512.f21440;
        c7851.f21439 = c78512.f21439;
        c7851.f21438 = c78512.f21438;
        c7851.f21437 = c78512.f21437;
        c7851.f21436 = c78512.f21436;
        c7851.f21455 = c78512.f21455;
        c7851.f21454 = c78512.f21454;
        c7851.f21458 = c78512.f21458;
        c7851.f21459 = c78512.f21459;
        c7851.f21456 = c78512.f21456;
        c7851.f21457 = c78512.f21457;
        c7851.f21449 = c78512.f21449;
        c7851.f21448 = c78512.f21448;
        c7851.f21452 = c78512.f21452;
        c7851.f21453 = c78512.f21453;
        c7851.f21450 = c78512.f21450;
        c7851.f21451 = c78512.f21451;
        c7851.f21443 = c78512.f21443;
        c7851.f21442 = c78512.f21442;
        c7851.f21446 = c78512.f21446;
        c7851.f21447 = c78512.f21447;
        c7851.f21444 = c78512.f21444;
        c7851.f21445 = c78512.f21445;
        c7851.f21429 = c78512.f21429;
        c7851.f21428 = c78512.f21428;
        c7851.f21427 = c78512.f21427;
        c7851.f21426 = c78512.f21426;
        c7851.f21425 = c78512.f21425;
        c7851.f21424 = c78512.f21424;
        c7851.f21435 = c78512.f21435;
        c7851.f21434 = c78512.f21434;
        c7851.f21433 = c78512.f21433;
        c7851.f21432 = c78512.f21432;
        c7851.f21431 = c78512.f21431;
        c7851.f21430 = c78512.f21430;
        c7851.f21421 = c78512.f21421;
        c7851.f21475 = c78512.f21475;
        c7851.f21474 = c78512.f21474;
        c7851.f21420 = c78512.f21420;
        c7851.f21423 = c78512.f21423;
        c7851.f21422 = c78512.f21422;
        c7851.f21419 = c78512.f21419;
        c7851.f21418 = c78512.f21418;
        c7851.f21415 = c78512.f21415;
        c7851.f21414 = c78512.f21414;
        c7851.f21417 = c78512.f21417;
        c7851.f21416 = c78512.f21416;
        c7851.f21412 = c78512.f21412;
        c7851.f21413 = c78512.f21413;
        c7851.f21476 = c78512.f21476;
        c7851.f21477 = c78512.f21477;
        c7851.f21465 = c78512.f21465;
        c7851.f21464 = c78512.f21464;
        c7851.f21462 = c78512.f21462;
        c7851.f21461 = c78512.f21461;
        c7851.f21460 = c78512.f21460;
        c7851.f21472 = c78512.f21472;
        c7851.f21473 = c78512.f21473;
        c7851.f21469 = c78512.f21469;
        c7851.f21468 = c78512.f21468;
        c7851.f21478 = c78512.f21478;
        c7851.f21479 = c78512.f21479;
        c7851.f21467 = c78512.f21467;
        return c7851;
    }
}

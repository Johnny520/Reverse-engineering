package yyds;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.android.app.CustomConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: yyds.ᛶᛵᲀᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1340 extends ViewGroup {

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static C2305 f6206;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public int f6207;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f6208;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public C2133 f6209;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f6210;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public C0859 f6211;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public HashMap f6212;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public C2594 f6213;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f6214;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public int f6215;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public C0595 f6216;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public boolean f6217;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public SparseArray f6218;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public SparseArray f6219;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f6220;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public ArrayList f6221;

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static C2305 getSharedValues() {
        C2305 c2305 = f6206;
        if (c2305 != null) {
            return c2305;
        }
        C2305 c23052 = new C2305();
        new SparseIntArray();
        new HashMap();
        f6206 = c23052;
        return c23052;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static C1357 m2741() {
        C1357 c1357 = new C1357(-2, -2);
        c1357.f6275 = -1;
        c1357.f6287 = -1;
        c1357.f6312 = -1.0f;
        c1357.f6322 = true;
        c1357.f6271 = -1;
        c1357.f6320 = -1;
        c1357.f6295 = -1;
        c1357.f6265 = -1;
        c1357.f6270 = -1;
        c1357.f6306 = -1;
        c1357.f6299 = -1;
        c1357.f6301 = -1;
        c1357.f6267 = -1;
        c1357.f6261 = -1;
        c1357.f6279 = -1;
        c1357.f6318 = -1;
        c1357.f6291 = 0;
        c1357.f6285 = 0.0f;
        c1357.f6311 = -1;
        c1357.f6278 = -1;
        c1357.f6298 = -1;
        c1357.f6296 = -1;
        c1357.f6289 = Integer.MIN_VALUE;
        c1357.f6272 = Integer.MIN_VALUE;
        c1357.f6326 = Integer.MIN_VALUE;
        c1357.f6288 = Integer.MIN_VALUE;
        c1357.f6268 = Integer.MIN_VALUE;
        c1357.f6303 = Integer.MIN_VALUE;
        c1357.f6260 = Integer.MIN_VALUE;
        c1357.f6308 = 0;
        c1357.f6310 = 0.5f;
        c1357.f6314 = 0.5f;
        c1357.f6302 = null;
        c1357.f6304 = -1.0f;
        c1357.f6325 = -1.0f;
        c1357.f6266 = 0;
        c1357.f6263 = 0;
        c1357.f6307 = 0;
        c1357.f6317 = 0;
        c1357.f6297 = 0;
        c1357.f6274 = 0;
        c1357.f6300 = 0;
        c1357.f6273 = 0;
        c1357.f6292 = 1.0f;
        c1357.f6264 = 1.0f;
        c1357.f6316 = -1;
        c1357.f6277 = -1;
        c1357.f6281 = -1;
        c1357.f6290 = false;
        c1357.f6293 = false;
        c1357.f6276 = null;
        c1357.f6321 = 0;
        c1357.f6283 = true;
        c1357.f6324 = true;
        c1357.f6269 = false;
        c1357.f6282 = false;
        c1357.f6305 = false;
        c1357.f23 = -1;
        c1357.f6309 = -1;
        c1357.f6315 = -1;
        c1357.f6313 = -1;
        c1357.f6280 = Integer.MIN_VALUE;
        c1357.f6284 = Integer.MIN_VALUE;
        c1357.f6286 = 0.5f;
        c1357.f6262 = new C0944();
        return c1357;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1357;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f6221;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC1145) arrayList.get(i)).getClass();
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
                        paint.setColor(-65536);
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
        this.f6217 = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m2741();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1357 c1357 = new C1357(context, attributeSet);
        c1357.f6275 = -1;
        c1357.f6287 = -1;
        c1357.f6312 = -1.0f;
        c1357.f6322 = true;
        c1357.f6271 = -1;
        c1357.f6320 = -1;
        c1357.f6295 = -1;
        c1357.f6265 = -1;
        c1357.f6270 = -1;
        c1357.f6306 = -1;
        c1357.f6299 = -1;
        c1357.f6301 = -1;
        c1357.f6267 = -1;
        c1357.f6261 = -1;
        c1357.f6279 = -1;
        c1357.f6318 = -1;
        c1357.f6291 = 0;
        c1357.f6285 = 0.0f;
        c1357.f6311 = -1;
        c1357.f6278 = -1;
        c1357.f6298 = -1;
        c1357.f6296 = -1;
        c1357.f6289 = Integer.MIN_VALUE;
        c1357.f6272 = Integer.MIN_VALUE;
        c1357.f6326 = Integer.MIN_VALUE;
        c1357.f6288 = Integer.MIN_VALUE;
        c1357.f6268 = Integer.MIN_VALUE;
        c1357.f6303 = Integer.MIN_VALUE;
        c1357.f6260 = Integer.MIN_VALUE;
        c1357.f6308 = 0;
        c1357.f6310 = 0.5f;
        c1357.f6314 = 0.5f;
        c1357.f6302 = null;
        c1357.f6304 = -1.0f;
        c1357.f6325 = -1.0f;
        c1357.f6266 = 0;
        c1357.f6263 = 0;
        c1357.f6307 = 0;
        c1357.f6317 = 0;
        c1357.f6297 = 0;
        c1357.f6274 = 0;
        c1357.f6300 = 0;
        c1357.f6273 = 0;
        c1357.f6292 = 1.0f;
        c1357.f6264 = 1.0f;
        c1357.f6316 = -1;
        c1357.f6277 = -1;
        c1357.f6281 = -1;
        c1357.f6290 = false;
        c1357.f6293 = false;
        c1357.f6276 = null;
        c1357.f6321 = 0;
        c1357.f6283 = true;
        c1357.f6324 = true;
        c1357.f6269 = false;
        c1357.f6282 = false;
        c1357.f6305 = false;
        c1357.f23 = -1;
        c1357.f6309 = -1;
        c1357.f6315 = -1;
        c1357.f6313 = -1;
        c1357.f6280 = Integer.MIN_VALUE;
        c1357.f6284 = Integer.MIN_VALUE;
        c1357.f6286 = 0.5f;
        c1357.f6262 = new C0944();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1164.f5355);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = AbstractC1113.f5129.get(index);
            switch (i2) {
                case 1:
                    c1357.f6281 = typedArrayObtainStyledAttributes.getInt(index, c1357.f6281);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c1357.f6318);
                    c1357.f6318 = resourceId;
                    if (resourceId == -1) {
                        c1357.f6318 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    c1357.f6291 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1357.f6291);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, c1357.f6285) % 360.0f;
                    c1357.f6285 = f;
                    if (f < 0.0f) {
                        c1357.f6285 = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    c1357.f6275 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1357.f6275);
                    break;
                case 6:
                    c1357.f6287 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1357.f6287);
                    break;
                case 7:
                    c1357.f6312 = typedArrayObtainStyledAttributes.getFloat(index, c1357.f6312);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c1357.f6271);
                    c1357.f6271 = resourceId2;
                    if (resourceId2 == -1) {
                        c1357.f6271 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c1357.f6320);
                    c1357.f6320 = resourceId3;
                    if (resourceId3 == -1) {
                        c1357.f6320 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c1357.f6295);
                    c1357.f6295 = resourceId4;
                    if (resourceId4 == -1) {
                        c1357.f6295 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c1357.f6265);
                    c1357.f6265 = resourceId5;
                    if (resourceId5 == -1) {
                        c1357.f6265 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c1357.f6270);
                    c1357.f6270 = resourceId6;
                    if (resourceId6 == -1) {
                        c1357.f6270 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c1357.f6306);
                    c1357.f6306 = resourceId7;
                    if (resourceId7 == -1) {
                        c1357.f6306 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c1357.f6299);
                    c1357.f6299 = resourceId8;
                    if (resourceId8 == -1) {
                        c1357.f6299 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c1357.f6301);
                    c1357.f6301 = resourceId9;
                    if (resourceId9 == -1) {
                        c1357.f6301 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c1357.f6267);
                    c1357.f6267 = resourceId10;
                    if (resourceId10 == -1) {
                        c1357.f6267 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c1357.f6311);
                    c1357.f6311 = resourceId11;
                    if (resourceId11 == -1) {
                        c1357.f6311 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c1357.f6278);
                    c1357.f6278 = resourceId12;
                    if (resourceId12 == -1) {
                        c1357.f6278 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c1357.f6298);
                    c1357.f6298 = resourceId13;
                    if (resourceId13 == -1) {
                        c1357.f6298 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c1357.f6296);
                    c1357.f6296 = resourceId14;
                    if (resourceId14 == -1) {
                        c1357.f6296 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    c1357.f6289 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1357.f6289);
                    break;
                case 22:
                    c1357.f6272 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1357.f6272);
                    break;
                case 23:
                    c1357.f6326 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1357.f6326);
                    break;
                case 24:
                    c1357.f6288 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1357.f6288);
                    break;
                case 25:
                    c1357.f6268 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1357.f6268);
                    break;
                case 26:
                    c1357.f6303 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1357.f6303);
                    break;
                case 27:
                    c1357.f6290 = typedArrayObtainStyledAttributes.getBoolean(index, c1357.f6290);
                    break;
                case 28:
                    c1357.f6293 = typedArrayObtainStyledAttributes.getBoolean(index, c1357.f6293);
                    break;
                case 29:
                    c1357.f6310 = typedArrayObtainStyledAttributes.getFloat(index, c1357.f6310);
                    break;
                case 30:
                    c1357.f6314 = typedArrayObtainStyledAttributes.getFloat(index, c1357.f6314);
                    break;
                case 31:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c1357.f6307 = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c1357.f6317 = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        c1357.f6297 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1357.f6297);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1357.f6297) == -2) {
                            c1357.f6297 = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        c1357.f6300 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1357.f6300);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1357.f6300) == -2) {
                            c1357.f6300 = -2;
                        }
                    }
                    break;
                case 35:
                    c1357.f6292 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c1357.f6292));
                    c1357.f6307 = 2;
                    break;
                case 36:
                    try {
                        c1357.f6274 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1357.f6274);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1357.f6274) == -2) {
                            c1357.f6274 = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        c1357.f6273 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1357.f6273);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1357.f6273) == -2) {
                            c1357.f6273 = -2;
                        }
                    }
                    break;
                case 38:
                    c1357.f6264 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c1357.f6264));
                    c1357.f6317 = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            C0595.m1472(c1357, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c1357.f6304 = typedArrayObtainStyledAttributes.getFloat(index, c1357.f6304);
                            break;
                        case 46:
                            c1357.f6325 = typedArrayObtainStyledAttributes.getFloat(index, c1357.f6325);
                            break;
                        case 47:
                            c1357.f6266 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c1357.f6263 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c1357.f6316 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1357.f6316);
                            break;
                        case 50:
                            c1357.f6277 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1357.f6277);
                            break;
                        case 51:
                            c1357.f6276 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, c1357.f6261);
                            c1357.f6261 = resourceId15;
                            if (resourceId15 == -1) {
                                c1357.f6261 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, c1357.f6279);
                            c1357.f6279 = resourceId16;
                            if (resourceId16 == -1) {
                                c1357.f6279 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            c1357.f6308 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1357.f6308);
                            break;
                        case 55:
                            c1357.f6260 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1357.f6260);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    C0595.m1474(c1357, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    C0595.m1474(c1357, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c1357.f6321 = typedArrayObtainStyledAttributes.getInt(index, c1357.f6321);
                                    break;
                                case 67:
                                    c1357.f6322 = typedArrayObtainStyledAttributes.getBoolean(index, c1357.f6322);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c1357.m2759();
        return c1357;
    }

    public int getMaxHeight() {
        return this.f6210;
    }

    public int getMaxWidth() {
        return this.f6208;
    }

    public int getMinHeight() {
        return this.f6214;
    }

    public int getMinWidth() {
        return this.f6220;
    }

    public int getOptimizationLevel() {
        return this.f6211.f3938;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C0859 c0859 = this.f6211;
        String resourceEntryName = c0859.f4384;
        if (resourceEntryName == null) {
            int id2 = getId();
            if (id2 != -1) {
                resourceEntryName = getContext().getResources().getResourceEntryName(id2);
                c0859.f4384 = resourceEntryName;
            } else {
                resourceEntryName = "parent";
                c0859.f4384 = "parent";
            }
        }
        if (c0859.f4387 == null) {
            c0859.f4387 = resourceEntryName;
            Log.v("ConstraintLayout", " setDebugName " + c0859.f4387);
        }
        for (C0944 c0944 : c0859.f3930) {
            View view = c0944.f4383;
            if (view != null) {
                if (c0944.f4384 == null && (id = view.getId()) != -1) {
                    c0944.f4384 = getContext().getResources().getResourceEntryName(id);
                }
                if (c0944.f4387 == null) {
                    c0944.f4387 = c0944.f4384;
                    Log.v("ConstraintLayout", " setDebugName " + c0944.f4387);
                }
            }
        }
        c0859.mo1954(sb);
        return sb.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ArrayList arrayList = this.f6221;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C1357 c1357 = (C1357) childAt.getLayoutParams();
            C0944 c0944 = c1357.f6262;
            if (childAt.getVisibility() != 8 || c1357.f6282 || c1357.f6305 || zIsInEditMode) {
                int iM2087 = c0944.m2087();
                int iM2075 = c0944.m2075();
                childAt.layout(iM2087, iM2075, c0944.m2072() + iM2087, c0944.m2067() + iM2075);
            }
        }
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC1145) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:239:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0927  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        C0859 c0859;
        boolean z;
        boolean z2;
        SparseArray sparseArray;
        ArrayList arrayList;
        SparseArray sparseArray2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        C0944 c0944;
        int i7;
        int i8;
        int i9;
        C0944 c09442;
        int i10;
        int i11;
        int i12;
        int i13;
        C0944 c09443;
        int i14;
        int i15;
        C0944 c09444;
        float f2;
        int i16;
        int i17;
        C0944 c09445;
        int i18;
        int i19;
        float f3;
        int i20;
        int i21;
        char c;
        int i22;
        int i23;
        float fAbs;
        int i24;
        SparseArray sparseArray3;
        String str;
        int iM2335;
        boolean z4;
        SparseArray sparseArray4;
        ArrayList arrayList2;
        SparseArray sparseArray5;
        HashSet hashSet;
        C0859 c08592;
        int i25;
        int i26;
        ArrayList arrayList3;
        String str2;
        C0859 c08593;
        String resourceEntryName;
        C0944 c09446;
        AbstractC1340 abstractC1340 = this;
        SparseArray sparseArray6 = abstractC1340.f6218;
        SparseArray sparseArray7 = abstractC1340.f6219;
        C0859 c08594 = abstractC1340.f6211;
        boolean z5 = abstractC1340.f6217;
        abstractC1340.f6217 = z5;
        if (!z5) {
            int childCount = abstractC1340.getChildCount();
            int i27 = 0;
            while (true) {
                if (i27 >= childCount) {
                    break;
                }
                if (abstractC1340.getChildAt(i27).isLayoutRequested()) {
                    abstractC1340.f6217 = true;
                    break;
                }
                i27++;
            }
        }
        c08594.f3942 = (abstractC1340.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == abstractC1340.getLayoutDirection();
        if (abstractC1340.f6217) {
            abstractC1340.f6217 = false;
            int childCount2 = abstractC1340.getChildCount();
            int i28 = 0;
            while (true) {
                if (i28 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (abstractC1340.getChildAt(i28).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i28++;
                }
            }
            if (z) {
                ArrayList arrayList4 = abstractC1340.f6221;
                boolean zIsInEditMode = abstractC1340.isInEditMode();
                int childCount3 = abstractC1340.getChildCount();
                for (int i29 = 0; i29 < childCount3; i29++) {
                    C0944 c0944M2742 = abstractC1340.m2742(abstractC1340.getChildAt(i29));
                    if (c0944M2742 != null) {
                        c0944M2742.mo1949();
                    }
                }
                int i30 = -1;
                if (zIsInEditMode) {
                    int i31 = 0;
                    while (i31 < childCount3) {
                        View childAt = abstractC1340.getChildAt(i31);
                        try {
                            String resourceName = abstractC1340.getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (abstractC1340.f6212 == null) {
                                    abstractC1340.f6212 = new HashMap();
                                }
                                int iIndexOf = resourceName.indexOf("/");
                                abstractC1340.f6212.put(iIndexOf != i30 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) sparseArray6.get(id);
                                if (viewFindViewById == null && (viewFindViewById = abstractC1340.findViewById(id)) != null && viewFindViewById != abstractC1340 && viewFindViewById.getParent() == abstractC1340) {
                                    abstractC1340.onViewAdded(viewFindViewById);
                                }
                                if (viewFindViewById == abstractC1340) {
                                    c09446 = c08594;
                                    c09446.f4387 = resourceName;
                                } else {
                                    c09446 = viewFindViewById == null ? null : ((C1357) viewFindViewById.getLayoutParams()).f6262;
                                    c09446.f4387 = resourceName;
                                }
                            } else {
                                c09446 = c08594;
                                c09446.f4387 = resourceName;
                            }
                        } catch (Resources.NotFoundException unused) {
                        }
                        i31++;
                        i30 = -1;
                    }
                }
                if (abstractC1340.f6207 != -1) {
                    for (int i32 = 0; i32 < childCount3; i32++) {
                        abstractC1340.getChildAt(i32).getId();
                    }
                }
                C0595 c0595 = abstractC1340.f6216;
                if (c0595 != null) {
                    int childCount4 = abstractC1340.getChildCount();
                    HashMap map = c0595.f2819;
                    HashSet<Integer> hashSet2 = new HashSet(map.keySet());
                    int i33 = 0;
                    while (i33 < childCount4) {
                        View childAt2 = abstractC1340.getChildAt(i33);
                        int id2 = childAt2.getId();
                        boolean z6 = z;
                        if (map.containsKey(Integer.valueOf(id2))) {
                            z4 = zIsInEditMode;
                            if (id2 == -1) {
                                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                            }
                            if (id2 != -1) {
                                if (map.containsKey(Integer.valueOf(id2))) {
                                    hashSet2.remove(Integer.valueOf(id2));
                                    C2049 c2049 = (C2049) map.get(Integer.valueOf(id2));
                                    if (c2049 != null) {
                                        C2047 c2047 = c2049.f10186;
                                        hashSet = hashSet2;
                                        C1894 c1894 = c2049.f10189;
                                        i26 = i33;
                                        C1457 c1457 = c2049.f10184;
                                        if (childAt2 instanceof C1019) {
                                            c1894.f9591 = 1;
                                            C1019 c1019 = (C1019) childAt2;
                                            c1019.setId(id2);
                                            c1019.setType(c1894.f28);
                                            c1019.setMargin(c1894.f9585);
                                            c1019.setAllowsGoneWidget(c1894.f9570);
                                            int[] iArr = c1894.f9589;
                                            if (iArr != null) {
                                                c1019.setReferencedIds(iArr);
                                            } else {
                                                String str3 = c1894.f9556;
                                                if (str3 != null) {
                                                    int[] iArrM1471 = C0595.m1471(c1019, str3);
                                                    c1894.f9589 = iArrM1471;
                                                    c1019.setReferencedIds(iArrM1471);
                                                }
                                            }
                                        }
                                        C1357 c1357 = (C1357) childAt2.getLayoutParams();
                                        c1357.m2759();
                                        c2049.m3917(c1357);
                                        HashMap map2 = c2049.f10188;
                                        sparseArray5 = sparseArray7;
                                        i25 = childCount3;
                                        Class<?> cls = childAt2.getClass();
                                        for (String str4 : map2.keySet()) {
                                            SparseArray sparseArray8 = sparseArray6;
                                            C1315 c1315 = (C1315) map2.get(str4);
                                            HashMap map3 = map2;
                                            if (c1315.f6026) {
                                                arrayList3 = arrayList4;
                                                str2 = str4;
                                            } else {
                                                arrayList3 = arrayList4;
                                                str2 = "set" + str4;
                                            }
                                            try {
                                                int iM4012 = AbstractC2104.m4012(c1315.f6027);
                                                Class cls2 = Float.TYPE;
                                                Class cls3 = Integer.TYPE;
                                                switch (iM4012) {
                                                    case 0:
                                                        c08593 = c08594;
                                                        cls.getMethod(str2, cls3).invoke(childAt2, Integer.valueOf(c1315.f6029));
                                                        break;
                                                    case 1:
                                                        c08593 = c08594;
                                                        cls.getMethod(str2, cls2).invoke(childAt2, Float.valueOf(c1315.f6031));
                                                        break;
                                                    case 2:
                                                        c08593 = c08594;
                                                        cls.getMethod(str2, cls3).invoke(childAt2, Integer.valueOf(c1315.f6028));
                                                        break;
                                                    case 3:
                                                        Method method = cls.getMethod(str2, Drawable.class);
                                                        c08593 = c08594;
                                                        try {
                                                            ColorDrawable colorDrawable = new ColorDrawable();
                                                            colorDrawable.setColor(c1315.f6028);
                                                            method.invoke(childAt2, colorDrawable);
                                                        } catch (IllegalAccessException e) {
                                                            e = e;
                                                            StringBuilder sbM3998 = AbstractC2104.m3998(" Custom Attribute \"", str4, "\" not found on ");
                                                            sbM3998.append(cls.getName());
                                                            Log.e("TransitionLayout", sbM3998.toString(), e);
                                                        } catch (NoSuchMethodException e2) {
                                                            e = e2;
                                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + str2, e);
                                                        } catch (InvocationTargetException e3) {
                                                            e = e3;
                                                            StringBuilder sbM39982 = AbstractC2104.m3998(" Custom Attribute \"", str4, "\" not found on ");
                                                            sbM39982.append(cls.getName());
                                                            Log.e("TransitionLayout", sbM39982.toString(), e);
                                                        }
                                                        break;
                                                    case 4:
                                                        cls.getMethod(str2, CharSequence.class).invoke(childAt2, c1315.f6025);
                                                        c08593 = c08594;
                                                        break;
                                                    case 5:
                                                        cls.getMethod(str2, Boolean.TYPE).invoke(childAt2, Boolean.valueOf(c1315.f6030));
                                                        c08593 = c08594;
                                                        break;
                                                    case 6:
                                                        cls.getMethod(str2, cls2).invoke(childAt2, Float.valueOf(c1315.f6031));
                                                        c08593 = c08594;
                                                        break;
                                                    case 7:
                                                        cls.getMethod(str2, cls3).invoke(childAt2, Integer.valueOf(c1315.f6029));
                                                        c08593 = c08594;
                                                        break;
                                                    default:
                                                        c08593 = c08594;
                                                        break;
                                                }
                                            } catch (IllegalAccessException e4) {
                                                e = e4;
                                                c08593 = c08594;
                                            } catch (NoSuchMethodException e5) {
                                                e = e5;
                                                c08593 = c08594;
                                            } catch (InvocationTargetException e6) {
                                                e = e6;
                                                c08593 = c08594;
                                            }
                                            sparseArray6 = sparseArray8;
                                            map2 = map3;
                                            arrayList4 = arrayList3;
                                            c08594 = c08593;
                                        }
                                        sparseArray4 = sparseArray6;
                                        arrayList2 = arrayList4;
                                        c08592 = c08594;
                                        childAt2.setLayoutParams(c1357);
                                        if (c2047.f10179 == 0) {
                                            childAt2.setVisibility(c2047.f10178);
                                        }
                                        childAt2.setAlpha(c2047.f10180);
                                        childAt2.setRotation(c1457.f6945);
                                        childAt2.setRotationX(c1457.f6946);
                                        childAt2.setRotationY(c1457.f6951);
                                        childAt2.setScaleX(c1457.f6953);
                                        childAt2.setScaleY(c1457.f6944);
                                        if (c1457.f6941 != -1) {
                                            if (((View) childAt2.getParent()).findViewById(c1457.f6941) != null) {
                                                float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                                float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                                if (childAt2.getRight() - childAt2.getLeft() > 0 && childAt2.getBottom() - childAt2.getTop() > 0) {
                                                    childAt2.setPivotX(right - childAt2.getLeft());
                                                    childAt2.setPivotY(bottom - childAt2.getTop());
                                                }
                                            }
                                        } else {
                                            if (!Float.isNaN(c1457.f6952)) {
                                                childAt2.setPivotX(c1457.f6952);
                                            }
                                            if (!Float.isNaN(c1457.f6947)) {
                                                childAt2.setPivotY(c1457.f6947);
                                            }
                                        }
                                        childAt2.setTranslationX(c1457.f6943);
                                        childAt2.setTranslationY(c1457.f6950);
                                        childAt2.setTranslationZ(c1457.f6948);
                                        if (c1457.f6949) {
                                            childAt2.setElevation(c1457.f6942);
                                        }
                                    }
                                } else {
                                    sparseArray4 = sparseArray6;
                                    arrayList2 = arrayList4;
                                    sparseArray5 = sparseArray7;
                                    hashSet = hashSet2;
                                    c08592 = c08594;
                                    i25 = childCount3;
                                    i26 = i33;
                                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                                }
                            }
                            i33 = i26 + 1;
                            z = z6;
                            zIsInEditMode = z4;
                            hashSet2 = hashSet;
                            sparseArray7 = sparseArray5;
                            childCount3 = i25;
                            sparseArray6 = sparseArray4;
                            arrayList4 = arrayList2;
                            c08594 = c08592;
                        } else {
                            z4 = zIsInEditMode;
                            StringBuilder sb = new StringBuilder("id unknown ");
                            try {
                                resourceEntryName = childAt2.getContext().getResources().getResourceEntryName(childAt2.getId());
                            } catch (Exception unused2) {
                                resourceEntryName = "UNKNOWN";
                            }
                            sb.append(resourceEntryName);
                            Log.w("ConstraintSet", sb.toString());
                        }
                        sparseArray4 = sparseArray6;
                        arrayList2 = arrayList4;
                        sparseArray5 = sparseArray7;
                        hashSet = hashSet2;
                        c08592 = c08594;
                        i25 = childCount3;
                        i26 = i33;
                        i33 = i26 + 1;
                        z = z6;
                        zIsInEditMode = z4;
                        hashSet2 = hashSet;
                        sparseArray7 = sparseArray5;
                        childCount3 = i25;
                        sparseArray6 = sparseArray4;
                        arrayList4 = arrayList2;
                        c08594 = c08592;
                    }
                    sparseArray = sparseArray6;
                    arrayList = arrayList4;
                    sparseArray2 = sparseArray7;
                    C0859 c08595 = c08594;
                    z2 = z;
                    z3 = zIsInEditMode;
                    i3 = childCount3;
                    for (Integer num : hashSet2) {
                        C2049 c20492 = (C2049) map.get(num);
                        if (c20492 != null) {
                            C1894 c18942 = c20492.f10189;
                            if (c18942.f9591 == 1) {
                                Context context = abstractC1340.getContext();
                                C1019 c10192 = new C1019(context);
                                c10192.f5247 = new int[32];
                                c10192.f5244 = new HashMap();
                                c10192.f5245 = context;
                                C0411 c0411 = new C0411();
                                c0411.f2143 = new C0944[4];
                                c0411.f2142 = 0;
                                c0411.f2144 = 0;
                                c0411.f2145 = true;
                                c0411.f2147 = 0;
                                c0411.f2146 = false;
                                c10192.f4644 = c0411;
                                c10192.f5248 = c0411;
                                c10192.m2331();
                                c10192.setVisibility(8);
                                c10192.setId(num.intValue());
                                int[] iArr2 = c18942.f9589;
                                if (iArr2 != null) {
                                    c10192.setReferencedIds(iArr2);
                                } else {
                                    String str5 = c18942.f9556;
                                    if (str5 != null) {
                                        int[] iArrM14712 = C0595.m1471(c10192, str5);
                                        c18942.f9589 = iArrM14712;
                                        c10192.setReferencedIds(iArrM14712);
                                    }
                                }
                                c10192.setType(c18942.f28);
                                c10192.setMargin(c18942.f9585);
                                C1357 c1357M2741 = m2741();
                                c10192.m2331();
                                c20492.m3917(c1357M2741);
                                abstractC1340.addView(c10192, c1357M2741);
                            }
                            if (c18942.f9551) {
                                C0872 c0872 = new C0872(abstractC1340.getContext());
                                c0872.setId(num.intValue());
                                C1357 c1357M27412 = m2741();
                                c20492.m3917(c1357M27412);
                                abstractC1340.addView(c0872, c1357M27412);
                            }
                        }
                    }
                    for (int i34 = 0; i34 < childCount4; i34++) {
                        abstractC1340.getChildAt(i34);
                    }
                    c0859 = c08595;
                } else {
                    sparseArray = sparseArray6;
                    arrayList = arrayList4;
                    sparseArray2 = sparseArray7;
                    z2 = z;
                    z3 = zIsInEditMode;
                    i3 = childCount3;
                    c0859 = c08594;
                }
                c0859.f3930.clear();
                int size = arrayList.size();
                char c2 = 2;
                if (size > 0) {
                    int i35 = 0;
                    while (i35 < size) {
                        ArrayList arrayList5 = arrayList;
                        AbstractC1145 abstractC1145 = (AbstractC1145) arrayList5.get(i35);
                        HashMap map4 = abstractC1145.f5244;
                        if (abstractC1145.isInEditMode()) {
                            abstractC1145.setIds(abstractC1145.f5246);
                        }
                        C0411 c04112 = abstractC1145.f5248;
                        if (c04112 == null) {
                            sparseArray3 = sparseArray;
                        } else {
                            c04112.f2142 = 0;
                            Arrays.fill(c04112.f2143, (Object) null);
                            int i36 = 0;
                            while (i36 < abstractC1145.f5249) {
                                int i37 = abstractC1145.f5247[i36];
                                SparseArray sparseArray9 = sparseArray;
                                View view = (View) sparseArray9.get(i37);
                                if (view == null && (iM2335 = abstractC1145.m2335(abstractC1340, (str = (String) map4.get(Integer.valueOf(i37))))) != 0) {
                                    abstractC1145.f5247[i36] = iM2335;
                                    map4.put(Integer.valueOf(iM2335), str);
                                    view = (View) sparseArray9.get(iM2335);
                                }
                                if (view != null) {
                                    C0411 c04113 = abstractC1145.f5248;
                                    C0944 c0944M27422 = abstractC1340.m2742(view);
                                    c04113.getClass();
                                    if (c0944M27422 != c04113 && c0944M27422 != null) {
                                        int i38 = c04113.f2142 + 1;
                                        C0944[] c0944Arr = c04113.f2143;
                                        if (i38 > c0944Arr.length) {
                                            c0944Arr = (C0944[]) Arrays.copyOf(c0944Arr, c0944Arr.length * 2);
                                            c04113.f2143 = c0944Arr;
                                        }
                                        int i39 = c04113.f2142;
                                        c0944Arr[i39] = c0944M27422;
                                        c04113.f2142 = i39 + 1;
                                    }
                                }
                                i36++;
                                sparseArray = sparseArray9;
                            }
                            sparseArray3 = sparseArray;
                            abstractC1145.f5248.getClass();
                        }
                        i35++;
                        arrayList = arrayList5;
                        sparseArray = sparseArray3;
                    }
                }
                int i40 = i3;
                for (int i41 = 0; i41 < i40; i41++) {
                    abstractC1340.getChildAt(i41);
                }
                sparseArray2.clear();
                SparseArray sparseArray10 = sparseArray2;
                sparseArray10.put(0, c0859);
                sparseArray10.put(abstractC1340.getId(), c0859);
                for (int i42 = 0; i42 < i40; i42++) {
                    View childAt3 = abstractC1340.getChildAt(i42);
                    sparseArray10.put(childAt3.getId(), abstractC1340.m2742(childAt3));
                }
                int i43 = 0;
                while (i43 < i40) {
                    View childAt4 = abstractC1340.getChildAt(i43);
                    C0944 c0944M27423 = abstractC1340.m2742(childAt4);
                    if (c0944M27423 == null) {
                        c = c2;
                    } else {
                        C1357 c13572 = (C1357) childAt4.getLayoutParams();
                        c0859.f3930.add(c0944M27423);
                        C0859 c08596 = c0944M27423.f4342;
                        if (c08596 != null) {
                            c08596.f3930.remove(c0944M27423);
                            c0944M27423.mo1949();
                        }
                        c0944M27423.f4342 = c0859;
                        c13572.m2759();
                        c0944M27423.f20 = childAt4.getVisibility();
                        c0944M27423.f4383 = childAt4;
                        if (childAt4 instanceof AbstractC1145) {
                            boolean z7 = c0859.f3942;
                            int i44 = ((C1019) ((AbstractC1145) childAt4)).f4645;
                            if (z7) {
                                if (i44 == 5) {
                                    i44 = 1;
                                } else if (i44 == 6) {
                                    i44 = 0;
                                }
                                if (c0944M27423 instanceof C0411) {
                                    ((C0411) c0944M27423).f2144 = i44;
                                }
                            } else {
                                if (i44 != 5) {
                                    if (i44 == 6) {
                                    }
                                }
                                if (c0944M27423 instanceof C0411) {
                                }
                            }
                        }
                        if (c13572.f6282) {
                            C2076 c2076 = (C2076) c0944M27423;
                            int i45 = c13572.f6319;
                            int i46 = c13572.f6294;
                            float f4 = c13572.f6323;
                            if (f4 != -1.0f) {
                                if (f4 > -1.0f) {
                                    c2076.f10258 = f4;
                                    c2076.f10257 = -1;
                                    c2076.f10259 = -1;
                                    c = c2;
                                }
                                c = c2;
                            } else {
                                if (i45 != -1) {
                                    if (i45 > -1) {
                                        c2076.f10258 = -1.0f;
                                        c2076.f10257 = i45;
                                        c2076.f10259 = -1;
                                    }
                                } else if (i46 != -1 && i46 > -1) {
                                    c2076.f10258 = -1.0f;
                                    c2076.f10257 = -1;
                                    c2076.f10259 = i46;
                                    c = c2;
                                }
                                c = c2;
                            }
                        } else {
                            int i47 = c13572.f23;
                            int i48 = c13572.f6309;
                            int i49 = c13572.f6315;
                            int i50 = c13572.f6313;
                            int i51 = c13572.f6280;
                            int i52 = c13572.f6284;
                            float f5 = c13572.f6286;
                            int i53 = c13572.f6318;
                            if (i53 != -1) {
                                C0944 c09447 = (C0944) sparseArray10.get(i53);
                                if (c09447 != null) {
                                    float f6 = c13572.f6285;
                                    c0944M27423.m2071(7, 7, c13572.f6291, 0, c09447);
                                    c0944M27423.f4386 = f6;
                                }
                                c09445 = c0944M27423;
                                i17 = 4;
                                i18 = 2;
                                i13 = 5;
                                i19 = 3;
                            } else {
                                if (i47 != -1) {
                                    C0944 c09448 = (C0944) sparseArray10.get(i47);
                                    if (c09448 != null) {
                                        i5 = i52;
                                        f = f5;
                                        i4 = i50;
                                        i6 = 2;
                                        c0944M27423.m2071(2, 2, ((ViewGroup.MarginLayoutParams) c13572).leftMargin, i51, c09448);
                                    } else {
                                        i4 = i50;
                                        i5 = i52;
                                        f = f5;
                                        i6 = 2;
                                    }
                                } else {
                                    i4 = i50;
                                    i5 = i52;
                                    i6 = 2;
                                    if (i48 == -1 || (c0944 = (C0944) sparseArray10.get(i48)) == null) {
                                        f = f5;
                                    } else {
                                        f = f5;
                                        c0944M27423.m2071(2, 4, ((ViewGroup.MarginLayoutParams) c13572).leftMargin, i51, c0944);
                                        i7 = 2;
                                        i8 = 4;
                                        if (i49 == -1) {
                                            C0944 c09449 = (C0944) sparseArray10.get(i49);
                                            if (c09449 != null) {
                                                c0944M27423.m2071(i8, i7, ((ViewGroup.MarginLayoutParams) c13572).rightMargin, i5, c09449);
                                            }
                                            i9 = i7;
                                        } else {
                                            i9 = i7;
                                            int i54 = i5;
                                            if (i4 != -1 && (c09442 = (C0944) sparseArray10.get(i4)) != null) {
                                                c0944M27423.m2071(i8, i8, ((ViewGroup.MarginLayoutParams) c13572).rightMargin, i54, c09442);
                                            }
                                        }
                                        int i55 = i8;
                                        i10 = c13572.f6270;
                                        if (i10 == -1) {
                                            C0944 c094410 = (C0944) sparseArray10.get(i10);
                                            if (c094410 != null) {
                                                i20 = 3;
                                                c0944M27423.m2071(3, 3, ((ViewGroup.MarginLayoutParams) c13572).topMargin, c13572.f6272, c094410);
                                            } else {
                                                i20 = 3;
                                            }
                                            i12 = i20;
                                            i13 = 5;
                                            i11 = -1;
                                        } else {
                                            int i56 = c13572.f6306;
                                            if (i56 == -1 || (c09443 = (C0944) sparseArray10.get(i56)) == null) {
                                                i11 = -1;
                                                i12 = 3;
                                                i13 = 5;
                                            } else {
                                                i11 = -1;
                                                c0944M27423.m2071(3, 5, ((ViewGroup.MarginLayoutParams) c13572).topMargin, c13572.f6272, c09443);
                                                i12 = 3;
                                                i13 = 5;
                                            }
                                        }
                                        i14 = c13572.f6299;
                                        if (i14 == i11) {
                                            C0944 c094411 = (C0944) sparseArray10.get(i14);
                                            if (c094411 != null) {
                                                c0944M27423.m2071(i13, i12, ((ViewGroup.MarginLayoutParams) c13572).bottomMargin, c13572.f6288, c094411);
                                            }
                                            i15 = i12;
                                        } else {
                                            i15 = i12;
                                            int i57 = c13572.f6301;
                                            if (i57 != i11 && (c09444 = (C0944) sparseArray10.get(i57)) != null) {
                                                c0944M27423.m2071(i13, i13, ((ViewGroup.MarginLayoutParams) c13572).bottomMargin, c13572.f6288, c09444);
                                            }
                                        }
                                        f2 = f;
                                        i16 = c13572.f6267;
                                        if (i16 == -1) {
                                            i17 = i55;
                                            c09445 = c0944M27423;
                                            i18 = i9;
                                            abstractC1340.m2745(c09445, c13572, sparseArray10, i16, 6);
                                            abstractC1340 = this;
                                            i19 = i15;
                                        } else {
                                            i17 = i55;
                                            c09445 = c0944M27423;
                                            i18 = i9;
                                            int i58 = c13572.f6261;
                                            if (i58 != -1) {
                                                abstractC1340 = this;
                                                int i59 = i15;
                                                abstractC1340.m2745(c09445, c13572, sparseArray10, i58, i59);
                                                i19 = i59;
                                            } else {
                                                i19 = i15;
                                                int i60 = c13572.f6279;
                                                abstractC1340 = this;
                                                if (i60 != -1) {
                                                    abstractC1340.m2745(c09445, c13572, sparseArray10, i60, i13);
                                                }
                                            }
                                        }
                                        if (f2 >= 0.0f) {
                                            c09445.f4347 = f2;
                                        }
                                        f3 = c13572.f6314;
                                        if (f3 >= 0.0f) {
                                            c09445.f4360 = f3;
                                        }
                                    }
                                }
                                i7 = i6;
                                i8 = 4;
                                if (i49 == -1) {
                                }
                                int i552 = i8;
                                i10 = c13572.f6270;
                                if (i10 == -1) {
                                }
                                i14 = c13572.f6299;
                                if (i14 == i11) {
                                }
                                f2 = f;
                                i16 = c13572.f6267;
                                if (i16 == -1) {
                                }
                                if (f2 >= 0.0f) {
                                }
                                f3 = c13572.f6314;
                                if (f3 >= 0.0f) {
                                }
                            }
                            if (z3 && ((i24 = c13572.f6316) != -1 || c13572.f6277 != -1)) {
                                int i61 = c13572.f6277;
                                c09445.f4371 = i24;
                                c09445.f4354 = i61;
                            }
                            if (c13572.f6283) {
                                c09445.m2090(1);
                                c09445.m2064(((ViewGroup.MarginLayoutParams) c13572).width);
                                if (((ViewGroup.MarginLayoutParams) c13572).width == -2) {
                                    c09445.m2090(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c13572).width == -1) {
                                if (c13572.f6290) {
                                    c09445.m2090(3);
                                } else {
                                    c09445.m2090(4);
                                }
                                c09445.mo2076(i18).f10575 = ((ViewGroup.MarginLayoutParams) c13572).leftMargin;
                                c09445.mo2076(i17).f10575 = ((ViewGroup.MarginLayoutParams) c13572).rightMargin;
                            } else {
                                c09445.m2090(3);
                                c09445.m2064(0);
                            }
                            if (c13572.f6324) {
                                i21 = -1;
                                c09445.m2066(1);
                                c09445.m2082(((ViewGroup.MarginLayoutParams) c13572).height);
                                if (((ViewGroup.MarginLayoutParams) c13572).height == -2) {
                                    c09445.m2066(2);
                                }
                            } else {
                                i21 = -1;
                                if (((ViewGroup.MarginLayoutParams) c13572).height == -1) {
                                    if (c13572.f6293) {
                                        c09445.m2066(3);
                                    } else {
                                        c09445.m2066(4);
                                    }
                                    c09445.mo2076(i19).f10575 = ((ViewGroup.MarginLayoutParams) c13572).topMargin;
                                    c09445.mo2076(i13).f10575 = ((ViewGroup.MarginLayoutParams) c13572).bottomMargin;
                                } else {
                                    c09445.m2066(3);
                                    c09445.m2082(0);
                                }
                            }
                            String str6 = c13572.f6302;
                            if (str6 == null || str6.length() == 0) {
                                c09445.f4359 = 0.0f;
                            } else {
                                int length = str6.length();
                                int iIndexOf3 = str6.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i22 = i21;
                                    i23 = 0;
                                } else {
                                    String strSubstring = str6.substring(0, iIndexOf3);
                                    i23 = iIndexOf3 + 1;
                                    i22 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : i21;
                                }
                                int iIndexOf4 = str6.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str6.substring(i23);
                                    fAbs = strSubstring2.length() > 0 ? Float.parseFloat(strSubstring2) : 0.0f;
                                    if (fAbs > 0.0f) {
                                        c09445.f4359 = fAbs;
                                        c09445.f4368 = i22;
                                    }
                                } else {
                                    String strSubstring3 = str6.substring(i23, iIndexOf4);
                                    String strSubstring4 = str6.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                        try {
                                            float f7 = Float.parseFloat(strSubstring3);
                                            float f8 = Float.parseFloat(strSubstring4);
                                            if (f7 > 0.0f && f8 > 0.0f) {
                                                fAbs = i22 == 1 ? Math.abs(f8 / f7) : Math.abs(f7 / f8);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                        if (fAbs > 0.0f) {
                                        }
                                    }
                                }
                            }
                            float f9 = c13572.f6304;
                            float[] fArr = c09445.f4358;
                            fArr[0] = f9;
                            fArr[1] = c13572.f6325;
                            c09445.f4393 = c13572.f6266;
                            c09445.f4391 = c13572.f6263;
                            int i62 = c13572.f6321;
                            if (i62 >= 0 && i62 <= 3) {
                                c09445.f4369 = i62;
                            }
                            int i63 = c13572.f6307;
                            int i64 = c13572.f6297;
                            int i65 = c13572.f6300;
                            float f10 = c13572.f6292;
                            c09445.f4363 = i63;
                            c09445.f4376 = i64;
                            if (i65 == Integer.MAX_VALUE) {
                                i65 = 0;
                            }
                            c09445.f4374 = i65;
                            c09445.f4367 = f10;
                            if (f10 > 0.0f && f10 < 1.0f && i63 == 0) {
                                c09445.f4363 = 2;
                            }
                            int i66 = c13572.f6317;
                            int i67 = c13572.f6274;
                            int i68 = c13572.f6273;
                            float f11 = c13572.f6264;
                            c09445.f4389 = i66;
                            c09445.f4350 = i67;
                            c09445.f4404 = i68 == Integer.MAX_VALUE ? 0 : i68;
                            c09445.f4366 = f11;
                            if (f11 <= 0.0f || f11 >= 1.0f || i66 != 0) {
                                c = 2;
                            } else {
                                c = 2;
                                c09445.f4389 = 2;
                            }
                        }
                    }
                    i43++;
                    c2 = c;
                }
            } else {
                c0859 = c08594;
                z2 = z;
            }
            if (z2) {
                c0859.f3929.m1561(c0859);
            }
        } else {
            c0859 = c08594;
        }
        c0859.f3939.getClass();
        abstractC1340.m2744(c0859, abstractC1340.f6215, i, i2);
        int iM2072 = c0859.m2072();
        int iM2067 = c0859.m2067();
        boolean z8 = c0859.f3931;
        boolean z9 = c0859.f3936;
        C2594 c2594 = abstractC1340.f6213;
        int i69 = c2594.f12779;
        int iResolveSizeAndState = View.resolveSizeAndState(iM2072 + c2594.f12785, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(iM2067 + i69, i2, 0) & 16777215;
        int iMin = Math.min(abstractC1340.f6208, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(abstractC1340.f6210, iResolveSizeAndState2);
        if (z8) {
            iMin |= 16777216;
        }
        if (z9) {
            iMin2 |= 16777216;
        }
        abstractC1340.setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        ArrayList arrayList = this.f6221;
        super.onViewAdded(view);
        C0944 c0944M2742 = m2742(view);
        if ((view instanceof C0872) && !(c0944M2742 instanceof C2076)) {
            C1357 c1357 = (C1357) view.getLayoutParams();
            C2076 c2076 = new C2076();
            c1357.f6262 = c2076;
            c1357.f6282 = true;
            c2076.m3981(c1357.f6281);
        }
        if (view instanceof AbstractC1145) {
            AbstractC1145 abstractC1145 = (AbstractC1145) view;
            abstractC1145.m2331();
            ((C1357) view.getLayoutParams()).f6305 = true;
            if (!arrayList.contains(abstractC1145)) {
                arrayList.add(abstractC1145);
            }
        }
        this.f6218.put(view.getId(), view);
        this.f6217 = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f6218.remove(view.getId());
        C0944 c0944M2742 = m2742(view);
        this.f6211.f3930.remove(c0944M2742);
        c0944M2742.mo1949();
        this.f6221.remove(view);
        this.f6217 = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f6217 = true;
        super.requestLayout();
    }

    public void setConstraintSet(C0595 c0595) {
        this.f6216 = c0595;
    }

    @Override // android.view.View
    public void setId(int i) {
        SparseArray sparseArray = this.f6218;
        sparseArray.remove(getId());
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f6210) {
            return;
        }
        this.f6210 = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f6208) {
            return;
        }
        this.f6208 = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f6214) {
            return;
        }
        this.f6214 = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f6220) {
            return;
        }
        this.f6220 = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC1296 abstractC1296) {
        C2133 c2133 = this.f6209;
        if (c2133 != null) {
            c2133.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f6215 = i;
        C0859 c0859 = this.f6211;
        c0859.f3938 = i;
        C2296.f11274 = c0859.m1948(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final C0944 m2742(View view) {
        if (view == this) {
            return this.f6211;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C1357) {
            return ((C1357) view.getLayoutParams()).f6262;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C1357) {
            return ((C1357) view.getLayoutParams()).f6262;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void m2743(AttributeSet attributeSet) {
        C0859 c0859 = this.f6211;
        c0859.f4383 = this;
        C2594 c2594 = this.f6213;
        c0859.f3946 = c2594;
        c0859.f3935.f7040 = c2594;
        this.f6218.put(getId(), this);
        this.f6216 = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1164.f5355, 0, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 16) {
                    this.f6220 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6220);
                } else if (index == 17) {
                    this.f6214 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6214);
                } else if (index == 14) {
                    this.f6208 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6208);
                } else if (index == 15) {
                    this.f6210 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6210);
                } else if (index == 113) {
                    this.f6215 = typedArrayObtainStyledAttributes.getInt(index, this.f6215);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m2746(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f6209 = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0595 c0595 = new C0595();
                        this.f6216 = c0595;
                        c0595.m1476(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f6216 = null;
                    }
                    this.f6207 = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        c0859.f3938 = this.f6215;
        C2296.f11274 = c0859.m1948(512);
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x046e  */
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2744(C0859 c0859, int i, int i2, int i3) {
        int iMin;
        int iMax;
        int iMin2;
        int iMax2;
        int i4;
        char c;
        boolean z;
        int i5;
        int i6;
        boolean z2;
        C2594 c2594;
        int i7;
        boolean zM1953;
        int i8;
        boolean z3;
        boolean z4;
        int i9;
        C2594 c25942;
        int i10;
        int i11;
        C1833 c1833;
        C1220 c1220;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z5;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i19 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        C2594 c25943 = this.f6213;
        c25943.f12781 = iMax3;
        c25943.f12783 = iMax4;
        c25943.f12785 = paddingWidth;
        c25943.f12779 = i19;
        c25943.f12784 = i2;
        c25943.f12782 = i3;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        int i20 = 1;
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            iMax5 = iMax6;
        }
        int i21 = size - paddingWidth;
        int i22 = size2 - i19;
        int i23 = c25943.f12779;
        int i24 = c25943.f12785;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    iMin = 0;
                } else {
                    iMin = Math.min(this.f6208 - i24, i21);
                    i20 = 1;
                }
            } else if (childCount == 0) {
                iMax = Math.max(0, this.f6220);
                iMin = iMax;
                i20 = 2;
            } else {
                iMin = 0;
                i20 = 2;
            }
        } else if (childCount == 0) {
            iMax = Math.max(0, this.f6220);
            iMin = iMax;
            i20 = 2;
        } else {
            iMin = i21;
            i20 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                iMin2 = mode2 != 1073741824 ? 0 : Math.min(this.f6210 - i23, i22);
                i4 = 1;
            } else if (childCount == 0) {
                iMax2 = Math.max(0, this.f6214);
                iMin2 = iMax2;
                i4 = 2;
            } else {
                iMin2 = 0;
                i4 = 2;
            }
        } else if (childCount == 0) {
            iMax2 = Math.max(0, this.f6214);
            iMin2 = iMax2;
            i4 = 2;
        } else {
            iMin2 = i22;
            i4 = 2;
        }
        int iM2072 = c0859.m2072();
        C1491 c1491 = c0859.f3935;
        int[] iArr = c0859.f4339;
        int i25 = iMin;
        if (i25 == iM2072 && iMin2 == c0859.m2067()) {
            c = 1;
        } else {
            c1491.f7039 = true;
            c = 1;
        }
        c0859.f4371 = 0;
        c0859.f4354 = 0;
        iArr[0] = this.f6208 - i24;
        iArr[c] = this.f6210 - i23;
        c0859.f4361 = 0;
        c0859.f4402 = 0;
        c0859.m2090(i20);
        c0859.m2064(i25);
        c0859.m2066(i4);
        c0859.m2082(iMin2);
        int i26 = this.f6220 - i24;
        if (i26 < 0) {
            c0859.f4361 = 0;
        } else {
            c0859.f4361 = i26;
        }
        int i27 = this.f6214 - i23;
        if (i27 < 0) {
            c0859.f4402 = 0;
        } else {
            c0859.f4402 = i27;
        }
        c0859.f3947 = iMax5;
        c0859.f3932 = iMax3;
        C0644 c0644 = c0859.f3929;
        C0859 c08592 = (C0859) c0644.f3101;
        ArrayList arrayList = (ArrayList) c0644.f3099;
        C2594 c25944 = c0859.f3946;
        int size3 = c0859.f3930.size();
        int iM20722 = c0859.m2072();
        int iM2067 = c0859.m2067();
        boolean zM3480 = AbstractC1741.m3480(i, 128);
        boolean z6 = zM3480 || AbstractC1741.m3480(i, 64);
        if (z6) {
            int i28 = 0;
            while (i28 < size3) {
                boolean z7 = z6;
                C0944 c0944 = (C0944) c0859.f3930.get(i28);
                i5 = size3;
                int[] iArr2 = c0944.f4401;
                int i29 = i28;
                boolean z8 = (iArr2[0] == 3) && (iArr2[1] == 3) && c0944.f4359 > 0.0f;
                if ((c0944.m2077() && z8) || ((c0944.m2074() && z8) || c0944.m2077() || c0944.m2074())) {
                    i6 = 1073741824;
                    z = false;
                    break;
                } else {
                    i28 = i29 + 1;
                    z6 = z7;
                    size3 = i5;
                }
            }
            z = z6;
            i5 = size3;
            i6 = 1073741824;
        } else {
            z = z6;
            i5 = size3;
            i6 = 1073741824;
        }
        boolean z9 = z & ((mode == i6 && mode2 == i6) || zM3480);
        if (z9) {
            int iMin3 = Math.min(iArr[0], i21);
            int iMin4 = Math.min(iArr[1], i22);
            int i30 = 1073741824;
            if (mode == 1073741824) {
                if (c0859.m2072() != iMin3) {
                    c0859.m2064(iMin3);
                    c1491.f7038 = true;
                }
                i30 = 1073741824;
            }
            if (mode2 == i30 && c0859.m2067() != iMin4) {
                c0859.m2082(iMin4);
                c1491.f7038 = true;
            }
            if (mode == i30 && mode2 == i30) {
                ArrayList<AbstractC1413> arrayList2 = (ArrayList) c1491.f7037;
                C0859 c08593 = (C0859) c1491.f7041;
                if (c1491.f7038 || c1491.f7039) {
                    for (C0944 c09442 : c08593.f3930) {
                        c09442.m2088();
                        c09442.f4353 = false;
                        c09442.f4400.m3594();
                        c09442.f4349.m2478();
                        z9 = z9;
                    }
                    z2 = z9;
                    c08593.m2088();
                    i14 = 0;
                    c08593.f4353 = false;
                    c08593.f4400.m3594();
                    c08593.f4349.m2478();
                    c1491.f7039 = false;
                } else {
                    z2 = z9;
                    i14 = 0;
                }
                c1491.m2996((C0859) c1491.f7043);
                c08593.f4371 = i14;
                int[] iArr3 = c08593.f4401;
                c08593.f4354 = i14;
                int iM2065 = c08593.m2065(i14);
                int iM20652 = c08593.m2065(1);
                if (c1491.f7038) {
                    c1491.m3001();
                }
                int iM2087 = c08593.m2087();
                int iM2075 = c08593.m2075();
                c2594 = c25944;
                c08593.f4400.f6686.mo612(iM2087);
                c08593.f4349.f6686.mo612(iM2075);
                c1491.m2994();
                if (iM2065 == 2 || iM20652 == 2) {
                    if (zM3480) {
                        Iterator it = arrayList2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!((AbstractC1413) it.next()).mo1396()) {
                                    zM3480 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (zM3480 && iM2065 == 2) {
                        c08593.m2090(1);
                        i15 = iM2075;
                        c08593.m2064(c1491.m3003(c08593, 0));
                        c08593.f4400.f6688.mo612(c08593.m2072());
                    } else {
                        i15 = iM2075;
                    }
                    if (zM3480 && iM20652 == 2) {
                        i16 = 1;
                        c08593.m2066(1);
                        c08593.m2082(c1491.m3003(c08593, 1));
                        c08593.f4349.f6688.mo612(c08593.m2067());
                    }
                    i17 = iArr3[0];
                    if (i17 != i16 || i17 == 4) {
                        int iM20723 = c08593.m2072() + iM2087;
                        c08593.f4400.f6687.mo612(iM20723);
                        c08593.f4400.f6688.mo612(iM20723 - iM2087);
                        c1491.m2994();
                        i18 = iArr3[1];
                        if (i18 != 1 || i18 == 4) {
                            int iM20672 = c08593.m2067() + i15;
                            c08593.f4349.f6687.mo612(iM20672);
                            c08593.f4349.f6688.mo612(iM20672 - i15);
                        }
                        c1491.m2994();
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    for (AbstractC1413 abstractC1413 : arrayList2) {
                        if (abstractC1413.f6690 != c08593 || abstractC1413.f6691) {
                            abstractC1413.mo1394();
                        }
                    }
                    for (AbstractC1413 abstractC14132 : arrayList2) {
                        if (z5 || abstractC14132.f6690 != c08593) {
                            if (!abstractC14132.f6686.f6520 || ((!abstractC14132.f6687.f6520 && !(abstractC14132 instanceof C2275)) || (!abstractC14132.f6688.f6520 && !(abstractC14132 instanceof C0552) && !(abstractC14132 instanceof C2275)))) {
                                zM1953 = false;
                                break;
                            }
                        }
                    }
                    zM1953 = true;
                    c08593.m2090(iM2065);
                    c08593.m2066(iM20652);
                    i7 = 2;
                    i13 = 1073741824;
                } else {
                    i15 = iM2075;
                }
                i16 = 1;
                i17 = iArr3[0];
                if (i17 != i16) {
                    int iM207232 = c08593.m2072() + iM2087;
                    c08593.f4400.f6687.mo612(iM207232);
                    c08593.f4400.f6688.mo612(iM207232 - iM2087);
                    c1491.m2994();
                    i18 = iArr3[1];
                    if (i18 != 1) {
                        int iM206722 = c08593.m2067() + i15;
                        c08593.f4349.f6687.mo612(iM206722);
                        c08593.f4349.f6688.mo612(iM206722 - i15);
                        c1491.m2994();
                        z5 = true;
                        while (r8.hasNext()) {
                        }
                        while (r8.hasNext()) {
                        }
                        zM1953 = true;
                        c08593.m2090(iM2065);
                        c08593.m2066(iM20652);
                        i7 = 2;
                        i13 = 1073741824;
                    }
                }
            } else {
                z2 = z9;
                c2594 = c25944;
                C0859 c08594 = (C0859) c1491.f7041;
                if (c1491.f7038) {
                    for (C0944 c09443 : c08594.f3930) {
                        c09443.m2088();
                        c09443.f4353 = false;
                        C1833 c18332 = c09443.f4400;
                        c18332.f6688.f6520 = false;
                        c18332.f6691 = false;
                        c18332.m3594();
                        C1220 c12202 = c09443.f4349;
                        c12202.f6688.f6520 = false;
                        c12202.f6691 = false;
                        c12202.m2478();
                    }
                    i12 = 0;
                    c08594.m2088();
                    c08594.f4353 = false;
                    C1833 c18333 = c08594.f4400;
                    c18333.f6688.f6520 = false;
                    c18333.f6691 = false;
                    c18333.m3594();
                    C1220 c12203 = c08594.f4349;
                    c12203.f6688.f6520 = false;
                    c12203.f6691 = false;
                    c12203.m2478();
                    c1491.m3001();
                } else {
                    i12 = 0;
                }
                c1491.m2996((C0859) c1491.f7043);
                c08594.f4371 = i12;
                c08594.f4354 = i12;
                c08594.f4400.f6686.mo612(i12);
                c08594.f4349.f6686.mo612(i12);
                i13 = 1073741824;
                if (mode == 1073741824) {
                    zM1953 = c0859.m1953(i12, zM3480);
                    i7 = 1;
                } else {
                    i7 = 0;
                    zM1953 = true;
                }
                if (mode2 == 1073741824) {
                    zM1953 &= c0859.m1953(1, zM3480);
                    i7++;
                }
            }
            if (zM1953) {
                c0859.mo1955(mode == i13, mode2 == i13);
            }
        } else {
            z2 = z9;
            c2594 = c25944;
            i7 = 0;
            zM1953 = false;
        }
        if (zM1953 && i7 == 2) {
            return;
        }
        int i31 = c0859.f3938;
        if (i5 > 0) {
            int size4 = c0859.f3930.size();
            boolean zM1948 = c0859.m1948(64);
            C2594 c25945 = c0859.f3946;
            int i32 = 0;
            while (i32 < size4) {
                C0944 c09444 = (C0944) c0859.f3930.get(i32);
                if (!(c09444 instanceof C2076) && !(c09444 instanceof C0411)) {
                    c09444.getClass();
                    if (zM1948 && (c1833 = c09444.f4400) != null && (c1220 = c09444.f4349) != null && c1833.f6688.f6520 && c1220.f6688.f6520) {
                        i11 = size4;
                    } else {
                        int iM20653 = c09444.m2065(0);
                        int iM20654 = c09444.m2065(1);
                        i11 = size4;
                        boolean z10 = iM20653 == 3 && c09444.f4363 != 1 && iM20654 == 3 && c09444.f4389 != 1;
                        if (!z10 && c0859.m1948(1)) {
                            if (iM20653 == 3 && c09444.f4363 == 0 && iM20654 != 3 && !c09444.m2077()) {
                                z10 = true;
                            }
                            if (iM20654 == 3 && c09444.f4389 == 0 && iM20653 != 3 && !c09444.m2077()) {
                                z10 = true;
                            }
                            if ((iM20653 == 3 || iM20654 == 3) && c09444.f4359 > 0.0f) {
                                z10 = true;
                            }
                        }
                        if (!z10) {
                            c0644.m1566(0, c25945, c09444);
                        }
                    }
                }
                i32++;
                size4 = i11;
            }
            CustomConstraintLayout customConstraintLayout = c25945.f12780;
            int childCount2 = customConstraintLayout.getChildCount();
            ArrayList arrayList3 = customConstraintLayout.f6221;
            for (int i33 = 0; i33 < childCount2; i33++) {
                customConstraintLayout.getChildAt(i33);
            }
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i34 = 0; i34 < size5; i34++) {
                    ((AbstractC1145) arrayList3.get(i34)).getClass();
                }
            }
        }
        c0644.m1561(c0859);
        int size6 = arrayList.size();
        int i35 = 0;
        if (i5 > 0) {
            c0644.m1553(c0859, 0, iM20722, iM2067);
        }
        if (size6 > 0) {
            int[] iArr4 = c0859.f4401;
            boolean z11 = iArr4[0] == 2;
            boolean z12 = iArr4[1] == 2;
            int iMax7 = Math.max(c0859.m2072(), c08592.f4361);
            int iMax8 = Math.max(c0859.m2067(), c08592.f4402);
            for (int i36 = 0; i36 < size6; i36++) {
            }
            int i37 = 0;
            while (i37 < 2) {
                int i38 = i35;
                int i39 = i38;
                while (i38 < size6) {
                    C0944 c09445 = (C0944) arrayList.get(i38);
                    if ((c09445 instanceof C0411) || (c09445 instanceof C2076)) {
                        i8 = size6;
                    } else {
                        i8 = size6;
                        if (c09445.f20 != 8 && (!z2 || !c09445.f4400.f6688.f6520 || !c09445.f4349.f6688.f6520)) {
                            int iM20724 = c09445.m2072();
                            int iM20673 = c09445.m2067();
                            z3 = z12;
                            int i40 = c09445.f4399;
                            z4 = z11;
                            int i41 = i37 == 1 ? 2 : 1;
                            i9 = i37;
                            c25942 = c2594;
                            int i42 = (c0644.m1566(i41, c25942, c09445) ? 1 : 0) | i39;
                            int iM20725 = c09445.m2072();
                            int i43 = i42;
                            int iM20674 = c09445.m2067();
                            if (iM20725 != iM20724) {
                                c09445.m2064(iM20725);
                                if (z4 && c09445.m2087() + c09445.f4394 > iMax7) {
                                    iMax7 = Math.max(iMax7, c09445.mo2076(4).m4088() + c09445.m2087() + c09445.f4394);
                                }
                                i43 = 1;
                            }
                            if (iM20674 != iM20673) {
                                c09445.m2082(iM20674);
                                if (z3 && c09445.m2075() + c09445.f4355 > iMax8) {
                                    iMax8 = Math.max(iMax8, c09445.mo2076(5).m4088() + c09445.m2075() + c09445.f4355);
                                }
                                i10 = 1;
                            } else {
                                i10 = i43;
                            }
                            if (c09445.f4388 && i40 != c09445.f4399) {
                                i10 = 1;
                            }
                        }
                        i38++;
                        size6 = i8;
                        z12 = z3;
                        c2594 = c25942;
                        i39 = i10;
                        z11 = z4;
                        i37 = i9;
                    }
                    z3 = z12;
                    z4 = z11;
                    i9 = i37;
                    i10 = i39;
                    c25942 = c2594;
                    i38++;
                    size6 = i8;
                    z12 = z3;
                    c2594 = c25942;
                    i39 = i10;
                    z11 = z4;
                    i37 = i9;
                }
                int i44 = size6;
                boolean z13 = z12;
                boolean z14 = z11;
                int i45 = i37;
                C2594 c25946 = c2594;
                if (i39 == 0) {
                    break;
                }
                int i46 = i45 + 1;
                c0644.m1553(c0859, i46, iM20722, iM2067);
                z12 = z13;
                c2594 = c25946;
                z11 = z14;
                i35 = 0;
                i37 = i46;
                size6 = i44;
            }
        }
        c0859.f3938 = i31;
        C2296.f11274 = c0859.m1948(512);
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final void m2745(C0944 c0944, C1357 c1357, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f6218.get(i);
        C0944 c09442 = (C0944) sparseArray.get(i);
        if (c09442 == null || view == null || !(view.getLayoutParams() instanceof C1357)) {
            return;
        }
        c1357.f6269 = true;
        if (i2 == 6) {
            C1357 c13572 = (C1357) view.getLayoutParams();
            c13572.f6269 = true;
            c13572.f6262.f4388 = true;
        }
        c0944.mo2076(6).m4083(c09442.mo2076(i2), c1357.f6308, c1357.f6260);
        c0944.f4388 = true;
        c0944.mo2076(3).m4085();
        c0944.mo2076(5).m4085();
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void m2746(int i) {
        String str;
        Context context = getContext();
        C2133 c2133 = new C2133(16, false);
        c2133.f10555 = new SparseArray();
        c2133.f10553 = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            C0394 c0394 = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c2133.m4052(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                C0394 c03942 = new C0394(context, xml);
                                ((SparseArray) c2133.f10555).put(c03942.f2030, c03942);
                                c0394 = c03942;
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
                                C2690 c2690 = new C2690(context, xml);
                                if (c0394 != null) {
                                    ((ArrayList) c0394.f2032).add(c2690);
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
        this.f6209 = c2133;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1357 c1357 = new C1357(layoutParams);
        c1357.f6275 = -1;
        c1357.f6287 = -1;
        c1357.f6312 = -1.0f;
        c1357.f6322 = true;
        c1357.f6271 = -1;
        c1357.f6320 = -1;
        c1357.f6295 = -1;
        c1357.f6265 = -1;
        c1357.f6270 = -1;
        c1357.f6306 = -1;
        c1357.f6299 = -1;
        c1357.f6301 = -1;
        c1357.f6267 = -1;
        c1357.f6261 = -1;
        c1357.f6279 = -1;
        c1357.f6318 = -1;
        c1357.f6291 = 0;
        c1357.f6285 = 0.0f;
        c1357.f6311 = -1;
        c1357.f6278 = -1;
        c1357.f6298 = -1;
        c1357.f6296 = -1;
        c1357.f6289 = Integer.MIN_VALUE;
        c1357.f6272 = Integer.MIN_VALUE;
        c1357.f6326 = Integer.MIN_VALUE;
        c1357.f6288 = Integer.MIN_VALUE;
        c1357.f6268 = Integer.MIN_VALUE;
        c1357.f6303 = Integer.MIN_VALUE;
        c1357.f6260 = Integer.MIN_VALUE;
        c1357.f6308 = 0;
        c1357.f6310 = 0.5f;
        c1357.f6314 = 0.5f;
        c1357.f6302 = null;
        c1357.f6304 = -1.0f;
        c1357.f6325 = -1.0f;
        c1357.f6266 = 0;
        c1357.f6263 = 0;
        c1357.f6307 = 0;
        c1357.f6317 = 0;
        c1357.f6297 = 0;
        c1357.f6274 = 0;
        c1357.f6300 = 0;
        c1357.f6273 = 0;
        c1357.f6292 = 1.0f;
        c1357.f6264 = 1.0f;
        c1357.f6316 = -1;
        c1357.f6277 = -1;
        c1357.f6281 = -1;
        c1357.f6290 = false;
        c1357.f6293 = false;
        c1357.f6276 = null;
        c1357.f6321 = 0;
        c1357.f6283 = true;
        c1357.f6324 = true;
        c1357.f6269 = false;
        c1357.f6282 = false;
        c1357.f6305 = false;
        c1357.f23 = -1;
        c1357.f6309 = -1;
        c1357.f6315 = -1;
        c1357.f6313 = -1;
        c1357.f6280 = Integer.MIN_VALUE;
        c1357.f6284 = Integer.MIN_VALUE;
        c1357.f6286 = 0.5f;
        c1357.f6262 = new C0944();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) c1357).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) c1357).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) c1357).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) c1357).bottomMargin = marginLayoutParams.bottomMargin;
            c1357.setMarginStart(marginLayoutParams.getMarginStart());
            c1357.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof C1357)) {
            return c1357;
        }
        C1357 c13572 = (C1357) layoutParams;
        c1357.f6275 = c13572.f6275;
        c1357.f6287 = c13572.f6287;
        c1357.f6312 = c13572.f6312;
        c1357.f6322 = c13572.f6322;
        c1357.f6271 = c13572.f6271;
        c1357.f6320 = c13572.f6320;
        c1357.f6295 = c13572.f6295;
        c1357.f6265 = c13572.f6265;
        c1357.f6270 = c13572.f6270;
        c1357.f6306 = c13572.f6306;
        c1357.f6299 = c13572.f6299;
        c1357.f6301 = c13572.f6301;
        c1357.f6267 = c13572.f6267;
        c1357.f6261 = c13572.f6261;
        c1357.f6279 = c13572.f6279;
        c1357.f6318 = c13572.f6318;
        c1357.f6291 = c13572.f6291;
        c1357.f6285 = c13572.f6285;
        c1357.f6311 = c13572.f6311;
        c1357.f6278 = c13572.f6278;
        c1357.f6298 = c13572.f6298;
        c1357.f6296 = c13572.f6296;
        c1357.f6289 = c13572.f6289;
        c1357.f6272 = c13572.f6272;
        c1357.f6326 = c13572.f6326;
        c1357.f6288 = c13572.f6288;
        c1357.f6268 = c13572.f6268;
        c1357.f6303 = c13572.f6303;
        c1357.f6260 = c13572.f6260;
        c1357.f6308 = c13572.f6308;
        c1357.f6310 = c13572.f6310;
        c1357.f6314 = c13572.f6314;
        c1357.f6302 = c13572.f6302;
        c1357.f6304 = c13572.f6304;
        c1357.f6325 = c13572.f6325;
        c1357.f6266 = c13572.f6266;
        c1357.f6263 = c13572.f6263;
        c1357.f6290 = c13572.f6290;
        c1357.f6293 = c13572.f6293;
        c1357.f6307 = c13572.f6307;
        c1357.f6317 = c13572.f6317;
        c1357.f6297 = c13572.f6297;
        c1357.f6300 = c13572.f6300;
        c1357.f6274 = c13572.f6274;
        c1357.f6273 = c13572.f6273;
        c1357.f6292 = c13572.f6292;
        c1357.f6264 = c13572.f6264;
        c1357.f6316 = c13572.f6316;
        c1357.f6277 = c13572.f6277;
        c1357.f6281 = c13572.f6281;
        c1357.f6283 = c13572.f6283;
        c1357.f6324 = c13572.f6324;
        c1357.f6269 = c13572.f6269;
        c1357.f6282 = c13572.f6282;
        c1357.f23 = c13572.f23;
        c1357.f6309 = c13572.f6309;
        c1357.f6315 = c13572.f6315;
        c1357.f6313 = c13572.f6313;
        c1357.f6280 = c13572.f6280;
        c1357.f6284 = c13572.f6284;
        c1357.f6286 = c13572.f6286;
        c1357.f6276 = c13572.f6276;
        c1357.f6321 = c13572.f6321;
        c1357.f6262 = c13572.f6262;
        return c1357;
    }
}

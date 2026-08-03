package p000;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: Q6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0695Q6 extends View implements InterfaceC0257Fz {

    /* JADX INFO: renamed from: a */
    public final ArrayList f2235a;

    /* JADX INFO: renamed from: b */
    public List f2236b;

    /* JADX INFO: renamed from: c */
    public float f2237c;

    public C0695Q6(Context context, int i) {
        super(context, null);
        this.f2235a = new ArrayList();
        this.f2236b = Collections.EMPTY_LIST;
        this.f2237c = 0.0533f;
    }

    @Override // p000.InterfaceC0257Fz
    /* JADX INFO: renamed from: a */
    public final void mo538a(List list, C0737R6 c0737r6, float f, float f2) {
        this.f2236b = list;
        this.f2237c = f;
        while (true) {
            ArrayList arrayList = this.f2235a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            Context context = getContext();
            C1517hw c1517hw = new C1517hw(12);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
            typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
            typedArrayObtainStyledAttributes.recycle();
            Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setSubpixelText(true);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            paint2.setFilterBitmap(true);
            arrayList.add(c1517hw);
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        List list = this.f2236b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i = paddingBottom - paddingTop;
        float f = this.f2237c;
        if ((f != -3.4028235E38f ? f * i : -3.4028235E38f) > 0.0f && list.size() > 0) {
            list.get(0).getClass();
            throw new ClassCastException();
        }
    }
}

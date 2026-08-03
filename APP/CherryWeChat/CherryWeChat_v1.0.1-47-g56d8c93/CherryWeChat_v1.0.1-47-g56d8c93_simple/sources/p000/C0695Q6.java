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

    public C0695Q6(Context r1, int r2) {
        super(r1, null);
        this.f2235a = new ArrayList();
        this.f2236b = Collections.EMPTY_LIST;
        this.f2237c = 0.0533f;
    }

    @Override // p000.InterfaceC0257Fz
    /* JADX INFO: renamed from: a */
    public final void mo538a(List r4, C0737R6 r5, float r6, float r7) {
        this.f2236b = r4;
        this.f2237c = r6;
    L3:
        ArrayList r52 = this.f2235a;
        if (r52.size() >= r4.size()) goto L6;
        Context r72 = getContext();
        C1517hw r62 = new C1517hw(12);
        TypedArray r0 = r72.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        r0.getDimensionPixelSize(0, 0);
        r0.getFloat(1, 1.0f);
        r0.recycle();
        Math.round((r72.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        TextPaint r73 = new TextPaint();
        r73.setAntiAlias(true);
        r73.setSubpixelText(true);
        Paint r74 = new Paint();
        r74.setAntiAlias(true);
        r74.setStyle(Paint.Style.FILL);
        Paint r75 = new Paint();
        r75.setAntiAlias(true);
        r75.setFilterBitmap(true);
        r52.add(r62);
        goto L3
    L6:
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas r6) {
        List r62 = this.f2236b;
        if (r62.isEmpty() == true) goto L22;
        int r0 = getHeight();
        int r1 = getPaddingLeft();
        int r2 = getPaddingTop();
        int r3 = getWidth() - getPaddingRight();
        int r02 = r0 - getPaddingBottom();
        if (r02 <= r2) goto L21;
        if (r3 <= r1) goto L23;
        int r03 = r02 - r2;
        float r12 = this.f2237c;
        float r22 = -3.4028235E38f;
        if (r12 == (-3.4028235E38f)) goto L14;
        r22 = r12 * r03;
    L14:
        if (r22 > 0.0f) goto L17;
        return;
    L17:
        if (r62.size() <= 0) goto L25;
        r62.get(0).getClass();
        throw new ClassCastException();
    L25:
        return;
    L23:
        return;
    L21:
        return;
    }
}

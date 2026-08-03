package p000;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* JADX INFO: renamed from: FD */
/* JADX INFO: loaded from: classes.dex */
public final class C0229FD extends AbstractC0358ID {

    /* JADX INFO: renamed from: d */
    public C0477L3 f672d;

    /* JADX INFO: renamed from: e */
    public float f673e;

    /* JADX INFO: renamed from: f */
    public C0477L3 f674f;

    /* JADX INFO: renamed from: g */
    public float f675g;

    /* JADX INFO: renamed from: h */
    public float f676h;

    /* JADX INFO: renamed from: i */
    public float f677i;

    /* JADX INFO: renamed from: j */
    public float f678j;

    /* JADX INFO: renamed from: k */
    public float f679k;

    /* JADX INFO: renamed from: l */
    public Paint.Cap f680l;

    /* JADX INFO: renamed from: m */
    public Paint.Join f681m;

    /* JADX INFO: renamed from: n */
    public float f682n;

    @Override // p000.AbstractC0315HD
    /* JADX INFO: renamed from: a */
    public final boolean mo449a() {
        if (this.f674f.m935d() == false) goto L5;
        return true;
    L5:
        if (this.f672d.m935d() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // p000.AbstractC0315HD
    /* JADX INFO: renamed from: b */
    public final boolean mo450b(int[] r7) {
        C0477L3 r0 = this.f674f;
        boolean r2 = true;
        if (r0.m935d() == false) goto L7;
        ColorStateList r1 = (ColorStateList) r0.f1576d;
        int r12 = r1.getColorForState(r7, r1.getDefaultColor());
        if (r12 == r0.f1574b) goto L7;
        r0.f1574b = r12;
        boolean r02 = true;
    L8:
        C0477L3 r13 = this.f672d;
        if (r13.m935d() == false) goto L13;
        ColorStateList r4 = (ColorStateList) r13.f1576d;
        int r72 = r4.getColorForState(r7, r4.getDefaultColor());
        if (r72 == r13.f1574b) goto L13;
        r13.f1574b = r72;
    L15:
        return r02 | r2;
    L13:
        r2 = false;
    L7:
        r02 = false;
        goto L8
    }

    public float getFillAlpha() {
        return this.f676h;
    }

    public int getFillColor() {
        return this.f674f.f1574b;
    }

    public float getStrokeAlpha() {
        return this.f675g;
    }

    public int getStrokeColor() {
        return this.f672d.f1574b;
    }

    public float getStrokeWidth() {
        return this.f673e;
    }

    public float getTrimPathEnd() {
        return this.f678j;
    }

    public float getTrimPathOffset() {
        return this.f679k;
    }

    public float getTrimPathStart() {
        return this.f677i;
    }

    public void setFillAlpha(float r1) {
        this.f676h = r1;
    }

    public void setFillColor(int r2) {
        this.f674f.f1574b = r2;
    }

    public void setStrokeAlpha(float r1) {
        this.f675g = r1;
    }

    public void setStrokeColor(int r2) {
        this.f672d.f1574b = r2;
    }

    public void setStrokeWidth(float r1) {
        this.f673e = r1;
    }

    public void setTrimPathEnd(float r1) {
        this.f678j = r1;
    }

    public void setTrimPathOffset(float r1) {
        this.f679k = r1;
    }

    public void setTrimPathStart(float r1) {
        this.f677i = r1;
    }
}

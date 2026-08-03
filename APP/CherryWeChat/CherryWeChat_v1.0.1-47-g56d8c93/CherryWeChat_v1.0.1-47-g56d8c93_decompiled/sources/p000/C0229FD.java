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
        return this.f674f.m935d() || this.f672d.m935d();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // p000.AbstractC0315HD
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo450b(int[] iArr) {
        boolean z;
        C0477L3 c0477l3 = this.f674f;
        boolean z2 = true;
        if (c0477l3.m935d()) {
            ColorStateList colorStateList = (ColorStateList) c0477l3.f1576d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != c0477l3.f1574b) {
                c0477l3.f1574b = colorForState;
                z = true;
            } else {
                z = false;
            }
        }
        C0477L3 c0477l32 = this.f672d;
        if (c0477l32.m935d()) {
            ColorStateList colorStateList2 = (ColorStateList) c0477l32.f1576d;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != c0477l32.f1574b) {
                c0477l32.f1574b = colorForState2;
            } else {
                z2 = false;
            }
        }
        return z | z2;
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

    public void setFillAlpha(float f) {
        this.f676h = f;
    }

    public void setFillColor(int i) {
        this.f674f.f1574b = i;
    }

    public void setStrokeAlpha(float f) {
        this.f675g = f;
    }

    public void setStrokeColor(int i) {
        this.f672d.f1574b = i;
    }

    public void setStrokeWidth(float f) {
        this.f673e = f;
    }

    public void setTrimPathEnd(float f) {
        this.f678j = f;
    }

    public void setTrimPathOffset(float f) {
        this.f679k = f;
    }

    public void setTrimPathStart(float f) {
        this.f677i = f;
    }
}

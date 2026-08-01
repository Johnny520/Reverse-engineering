package p145;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import androidx.appcompat.widget.C0984;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8329 extends AbstractC8328 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C0984 f20683;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f20684;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C0984 f20685;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public float f20686;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public Paint.Join f20687;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public float f20688;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f20689;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public float f20690;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public Paint.Cap f20691;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f20692;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public float f20693;

    public float getFillAlpha() {
        return this.f20688;
    }

    public int getFillColor() {
        return this.f20683.f941;
    }

    public float getStrokeAlpha() {
        return this.f20689;
    }

    public int getStrokeColor() {
        return this.f20685.f941;
    }

    public float getStrokeWidth() {
        return this.f20684;
    }

    public float getTrimPathEnd() {
        return this.f20693;
    }

    public float getTrimPathOffset() {
        return this.f20690;
    }

    public float getTrimPathStart() {
        return this.f20692;
    }

    public void setFillAlpha(float f) {
        this.f20688 = f;
    }

    public void setFillColor(int i) {
        this.f20683.f941 = i;
    }

    public void setStrokeAlpha(float f) {
        this.f20689 = f;
    }

    public void setStrokeColor(int i) {
        this.f20685.f941 = i;
    }

    public void setStrokeWidth(float f) {
        this.f20684 = f;
    }

    public void setTrimPathEnd(float f) {
        this.f20693 = f;
    }

    public void setTrimPathOffset(float f) {
        this.f20690 = f;
    }

    public void setTrimPathStart(float f) {
        this.f20692 = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // p145.AbstractC8327
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo13279(int[] iArr) {
        boolean z;
        C0984 c0984 = this.f20683;
        boolean z2 = true;
        if (c0984.m1140()) {
            ColorStateList colorStateList = (ColorStateList) c0984.f939;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != c0984.f941) {
                c0984.f941 = colorForState;
                z = true;
            } else {
                z = false;
            }
        }
        C0984 c09842 = this.f20685;
        if (c09842.m1140()) {
            ColorStateList colorStateList2 = (ColorStateList) c09842.f939;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != c09842.f941) {
                c09842.f941 = colorForState2;
            } else {
                z2 = false;
            }
        }
        return z | z2;
    }

    @Override // p145.AbstractC8327
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo13280() {
        return this.f20683.m1140() || this.f20685.m1140();
    }
}

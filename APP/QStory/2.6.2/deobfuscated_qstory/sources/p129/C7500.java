package p129;

import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.collection.C0257;
import java.util.ArrayList;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7500 extends AbstractC7497 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f20354;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f20355;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f20356;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f20357;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f20358;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Matrix f20359;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public float f20360;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f20361;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public String f20362;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f20363;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Matrix f20364;

    public C7500(C7500 c7500, C0257 c0257) {
        AbstractC7498 c7495;
        this.f20359 = new Matrix();
        this.f20358 = new ArrayList();
        this.f20357 = 0.0f;
        this.f20356 = 0.0f;
        this.f20355 = 0.0f;
        this.f20354 = 1.0f;
        this.f20361 = 1.0f;
        this.f20360 = 0.0f;
        this.f20363 = 0.0f;
        Matrix matrix = new Matrix();
        this.f20364 = matrix;
        this.f20362 = null;
        this.f20357 = c7500.f20357;
        this.f20356 = c7500.f20356;
        this.f20355 = c7500.f20355;
        this.f20354 = c7500.f20354;
        this.f20361 = c7500.f20361;
        this.f20360 = c7500.f20360;
        this.f20363 = c7500.f20363;
        String str = c7500.f20362;
        this.f20362 = str;
        if (str != null) {
            c0257.put(str, this);
        }
        matrix.set(c7500.f20364);
        ArrayList arrayList = c7500.f20358;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C7500) {
                this.f20358.add(new C7500((C7500) obj, c0257));
            } else {
                if (obj instanceof C7499) {
                    C7499 c7499 = (C7499) obj;
                    C7499 c74992 = new C7499(c7499);
                    c74992.f20344 = 0.0f;
                    c74992.f20349 = 1.0f;
                    c74992.f20348 = 1.0f;
                    c74992.f20352 = 0.0f;
                    c74992.f20353 = 1.0f;
                    c74992.f20350 = 0.0f;
                    c74992.f20351 = Paint.Cap.BUTT;
                    c74992.f20347 = Paint.Join.MITER;
                    c74992.f20346 = 4.0f;
                    c74992.f20345 = c7499.f20345;
                    c74992.f20344 = c7499.f20344;
                    c74992.f20349 = c7499.f20349;
                    c74992.f20343 = c7499.f20343;
                    c74992.f20340 = c7499.f20340;
                    c74992.f20348 = c7499.f20348;
                    c74992.f20352 = c7499.f20352;
                    c74992.f20353 = c7499.f20353;
                    c74992.f20350 = c7499.f20350;
                    c74992.f20351 = c7499.f20351;
                    c74992.f20347 = c7499.f20347;
                    c74992.f20346 = c7499.f20346;
                    c7495 = c74992;
                } else {
                    if (!(obj instanceof C7495)) {
                        C5919.m11250("Unknown object in the tree!");
                        throw null;
                    }
                    c7495 = new C7495((C7495) obj);
                }
                this.f20358.add(c7495);
                Object obj2 = c7495.f20341;
                if (obj2 != null) {
                    c0257.put(obj2, c7495);
                }
            }
        }
    }

    public String getGroupName() {
        return this.f20362;
    }

    public Matrix getLocalMatrix() {
        return this.f20364;
    }

    public float getPivotX() {
        return this.f20356;
    }

    public float getPivotY() {
        return this.f20355;
    }

    public float getRotation() {
        return this.f20357;
    }

    public float getScaleX() {
        return this.f20354;
    }

    public float getScaleY() {
        return this.f20361;
    }

    public float getTranslateX() {
        return this.f20360;
    }

    public float getTranslateY() {
        return this.f20363;
    }

    public void setPivotX(float f) {
        if (f != this.f20356) {
            this.f20356 = f;
            m12693();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f20355) {
            this.f20355 = f;
            m12693();
        }
    }

    public void setRotation(float f) {
        if (f != this.f20357) {
            this.f20357 = f;
            m12693();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f20354) {
            this.f20354 = f;
            m12693();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f20361) {
            this.f20361 = f;
            m12693();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f20360) {
            this.f20360 = f;
            m12693();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f20363) {
            this.f20363 = f;
            m12693();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12693() {
        Matrix matrix = this.f20364;
        matrix.reset();
        matrix.postTranslate(-this.f20356, -this.f20355);
        matrix.postScale(this.f20354, this.f20361);
        matrix.postRotate(this.f20357, 0.0f, 0.0f);
        matrix.postTranslate(this.f20360 + this.f20356, this.f20363 + this.f20355);
    }

    @Override // p129.AbstractC7497
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo12691(int[] iArr) {
        int i = 0;
        boolean zMo12691 = false;
        while (true) {
            ArrayList arrayList = this.f20358;
            if (i >= arrayList.size()) {
                return zMo12691;
            }
            zMo12691 |= ((AbstractC7497) arrayList.get(i)).mo12691(iArr);
            i++;
        }
    }

    @Override // p129.AbstractC7497
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo12692() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f20358;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC7497) arrayList.get(i)).mo12692()) {
                return true;
            }
            i++;
        }
    }

    public C7500() {
        this.f20359 = new Matrix();
        this.f20358 = new ArrayList();
        this.f20357 = 0.0f;
        this.f20356 = 0.0f;
        this.f20355 = 0.0f;
        this.f20354 = 1.0f;
        this.f20361 = 1.0f;
        this.f20360 = 0.0f;
        this.f20363 = 0.0f;
        this.f20364 = new Matrix();
        this.f20362 = null;
    }
}

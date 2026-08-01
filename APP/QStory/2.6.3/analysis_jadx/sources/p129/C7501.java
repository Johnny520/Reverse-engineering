package p129;

import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.collection.C0257;
import java.util.ArrayList;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7501 extends AbstractC7498 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f20349;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f20350;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f20351;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f20352;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f20353;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Matrix f20354;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public float f20355;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f20356;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public String f20357;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f20358;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Matrix f20359;

    public C7501(C7501 c7501, C0257 c0257) {
        AbstractC7499 c7496;
        this.f20354 = new Matrix();
        this.f20353 = new ArrayList();
        this.f20352 = 0.0f;
        this.f20351 = 0.0f;
        this.f20350 = 0.0f;
        this.f20349 = 1.0f;
        this.f20356 = 1.0f;
        this.f20355 = 0.0f;
        this.f20358 = 0.0f;
        Matrix matrix = new Matrix();
        this.f20359 = matrix;
        this.f20357 = null;
        this.f20352 = c7501.f20352;
        this.f20351 = c7501.f20351;
        this.f20350 = c7501.f20350;
        this.f20349 = c7501.f20349;
        this.f20356 = c7501.f20356;
        this.f20355 = c7501.f20355;
        this.f20358 = c7501.f20358;
        String str = c7501.f20357;
        this.f20357 = str;
        if (str != null) {
            c0257.put(str, this);
        }
        matrix.set(c7501.f20359);
        ArrayList arrayList = c7501.f20353;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C7501) {
                this.f20353.add(new C7501((C7501) obj, c0257));
            } else {
                if (obj instanceof C7500) {
                    C7500 c7500 = (C7500) obj;
                    C7500 c75002 = new C7500(c7500);
                    c75002.f20339 = 0.0f;
                    c75002.f20344 = 1.0f;
                    c75002.f20343 = 1.0f;
                    c75002.f20347 = 0.0f;
                    c75002.f20348 = 1.0f;
                    c75002.f20345 = 0.0f;
                    c75002.f20346 = Paint.Cap.BUTT;
                    c75002.f20342 = Paint.Join.MITER;
                    c75002.f20341 = 4.0f;
                    c75002.f20340 = c7500.f20340;
                    c75002.f20339 = c7500.f20339;
                    c75002.f20344 = c7500.f20344;
                    c75002.f20338 = c7500.f20338;
                    c75002.f20335 = c7500.f20335;
                    c75002.f20343 = c7500.f20343;
                    c75002.f20347 = c7500.f20347;
                    c75002.f20348 = c7500.f20348;
                    c75002.f20345 = c7500.f20345;
                    c75002.f20346 = c7500.f20346;
                    c75002.f20342 = c7500.f20342;
                    c75002.f20341 = c7500.f20341;
                    c7496 = c75002;
                } else {
                    if (!(obj instanceof C7496)) {
                        C5925.m11311("Unknown object in the tree!");
                        throw null;
                    }
                    c7496 = new C7496((C7496) obj);
                }
                this.f20353.add(c7496);
                Object obj2 = c7496.f20336;
                if (obj2 != null) {
                    c0257.put(obj2, c7496);
                }
            }
        }
    }

    public String getGroupName() {
        return this.f20357;
    }

    public Matrix getLocalMatrix() {
        return this.f20359;
    }

    public float getPivotX() {
        return this.f20351;
    }

    public float getPivotY() {
        return this.f20350;
    }

    public float getRotation() {
        return this.f20352;
    }

    public float getScaleX() {
        return this.f20349;
    }

    public float getScaleY() {
        return this.f20356;
    }

    public float getTranslateX() {
        return this.f20355;
    }

    public float getTranslateY() {
        return this.f20358;
    }

    public void setPivotX(float f) {
        if (f != this.f20351) {
            this.f20351 = f;
            m12722();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f20350) {
            this.f20350 = f;
            m12722();
        }
    }

    public void setRotation(float f) {
        if (f != this.f20352) {
            this.f20352 = f;
            m12722();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f20349) {
            this.f20349 = f;
            m12722();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f20356) {
            this.f20356 = f;
            m12722();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f20355) {
            this.f20355 = f;
            m12722();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f20358) {
            this.f20358 = f;
            m12722();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12722() {
        Matrix matrix = this.f20359;
        matrix.reset();
        matrix.postTranslate(-this.f20351, -this.f20350);
        matrix.postScale(this.f20349, this.f20356);
        matrix.postRotate(this.f20352, 0.0f, 0.0f);
        matrix.postTranslate(this.f20355 + this.f20351, this.f20358 + this.f20350);
    }

    @Override // p129.AbstractC7498
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo12720(int[] iArr) {
        int i = 0;
        boolean zMo12720 = false;
        while (true) {
            ArrayList arrayList = this.f20353;
            if (i >= arrayList.size()) {
                return zMo12720;
            }
            zMo12720 |= ((AbstractC7498) arrayList.get(i)).mo12720(iArr);
            i++;
        }
    }

    @Override // p129.AbstractC7498
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo12721() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f20353;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC7498) arrayList.get(i)).mo12721()) {
                return true;
            }
            i++;
        }
    }

    public C7501() {
        this.f20354 = new Matrix();
        this.f20353 = new ArrayList();
        this.f20352 = 0.0f;
        this.f20351 = 0.0f;
        this.f20350 = 0.0f;
        this.f20349 = 1.0f;
        this.f20356 = 1.0f;
        this.f20355 = 0.0f;
        this.f20358 = 0.0f;
        this.f20359 = new Matrix();
        this.f20357 = null;
    }
}

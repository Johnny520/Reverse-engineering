package p145;

import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.collection.C1104;
import java.util.ArrayList;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8330 extends AbstractC8327 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f20694;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f20695;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f20696;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f20697;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f20698;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Matrix f20699;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public float f20700;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f20701;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public String f20702;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f20703;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Matrix f20704;

    public C8330(C8330 c8330, C1104 c1104) {
        AbstractC8328 c8325;
        this.f20699 = new Matrix();
        this.f20698 = new ArrayList();
        this.f20697 = 0.0f;
        this.f20696 = 0.0f;
        this.f20695 = 0.0f;
        this.f20694 = 1.0f;
        this.f20701 = 1.0f;
        this.f20700 = 0.0f;
        this.f20703 = 0.0f;
        Matrix matrix = new Matrix();
        this.f20704 = matrix;
        this.f20702 = null;
        this.f20697 = c8330.f20697;
        this.f20696 = c8330.f20696;
        this.f20695 = c8330.f20695;
        this.f20694 = c8330.f20694;
        this.f20701 = c8330.f20701;
        this.f20700 = c8330.f20700;
        this.f20703 = c8330.f20703;
        String str = c8330.f20702;
        this.f20702 = str;
        if (str != null) {
            c1104.put(str, this);
        }
        matrix.set(c8330.f20704);
        ArrayList arrayList = c8330.f20698;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C8330) {
                this.f20698.add(new C8330((C8330) obj, c1104));
            } else {
                if (obj instanceof C8329) {
                    C8329 c8329 = (C8329) obj;
                    C8329 c83292 = new C8329(c8329);
                    c83292.f20684 = 0.0f;
                    c83292.f20689 = 1.0f;
                    c83292.f20688 = 1.0f;
                    c83292.f20692 = 0.0f;
                    c83292.f20693 = 1.0f;
                    c83292.f20690 = 0.0f;
                    c83292.f20691 = Paint.Cap.BUTT;
                    c83292.f20687 = Paint.Join.MITER;
                    c83292.f20686 = 4.0f;
                    c83292.f20685 = c8329.f20685;
                    c83292.f20684 = c8329.f20684;
                    c83292.f20689 = c8329.f20689;
                    c83292.f20683 = c8329.f20683;
                    c83292.f20680 = c8329.f20680;
                    c83292.f20688 = c8329.f20688;
                    c83292.f20692 = c8329.f20692;
                    c83292.f20693 = c8329.f20693;
                    c83292.f20690 = c8329.f20690;
                    c83292.f20691 = c8329.f20691;
                    c83292.f20687 = c8329.f20687;
                    c83292.f20686 = c8329.f20686;
                    c8325 = c83292;
                } else {
                    if (!(obj instanceof C8325)) {
                        C6755.m11870("Unknown object in the tree!");
                        throw null;
                    }
                    c8325 = new C8325((C8325) obj);
                }
                this.f20698.add(c8325);
                Object obj2 = c8325.f20681;
                if (obj2 != null) {
                    c1104.put(obj2, c8325);
                }
            }
        }
    }

    public String getGroupName() {
        return this.f20702;
    }

    public Matrix getLocalMatrix() {
        return this.f20704;
    }

    public float getPivotX() {
        return this.f20696;
    }

    public float getPivotY() {
        return this.f20695;
    }

    public float getRotation() {
        return this.f20697;
    }

    public float getScaleX() {
        return this.f20694;
    }

    public float getScaleY() {
        return this.f20701;
    }

    public float getTranslateX() {
        return this.f20700;
    }

    public float getTranslateY() {
        return this.f20703;
    }

    public void setPivotX(float f) {
        if (f != this.f20696) {
            this.f20696 = f;
            m13281();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f20695) {
            this.f20695 = f;
            m13281();
        }
    }

    public void setRotation(float f) {
        if (f != this.f20697) {
            this.f20697 = f;
            m13281();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f20694) {
            this.f20694 = f;
            m13281();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f20701) {
            this.f20701 = f;
            m13281();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f20700) {
            this.f20700 = f;
            m13281();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f20703) {
            this.f20703 = f;
            m13281();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13281() {
        Matrix matrix = this.f20704;
        matrix.reset();
        matrix.postTranslate(-this.f20696, -this.f20695);
        matrix.postScale(this.f20694, this.f20701);
        matrix.postRotate(this.f20697, 0.0f, 0.0f);
        matrix.postTranslate(this.f20700 + this.f20696, this.f20703 + this.f20695);
    }

    @Override // p145.AbstractC8327
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo13279(int[] iArr) {
        int i = 0;
        boolean zMo13279 = false;
        while (true) {
            ArrayList arrayList = this.f20698;
            if (i >= arrayList.size()) {
                return zMo13279;
            }
            zMo13279 |= ((AbstractC8327) arrayList.get(i)).mo13279(iArr);
            i++;
        }
    }

    @Override // p145.AbstractC8327
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo13280() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f20698;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC8327) arrayList.get(i)).mo13280()) {
                return true;
            }
            i++;
        }
    }

    public C8330() {
        this.f20699 = new Matrix();
        this.f20698 = new ArrayList();
        this.f20697 = 0.0f;
        this.f20696 = 0.0f;
        this.f20695 = 0.0f;
        this.f20694 = 1.0f;
        this.f20701 = 1.0f;
        this.f20700 = 0.0f;
        this.f20703 = 0.0f;
        this.f20704 = new Matrix();
        this.f20702 = null;
    }
}

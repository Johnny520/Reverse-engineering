package Yue;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C8778;
import java.util.HashMap;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5639 extends AbstractC5640 {

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final String f13710 = "KeyPosition";

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final String f13711 = "KeyPosition";

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final int f13712 = 2;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final int f13713 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final int f13714 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final int f13715 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final String f13716 = "percentY";

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final String f13717 = "percentX";

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public String f13718 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public int f13719 = AbstractC5616.f13583;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public int f13720 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public float f13721 = Float.NaN;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public float f13722 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public float f13723 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public float f13724 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public float f13725 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public float f13726 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public int f13727 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public float f13728 = Float.NaN;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public float f13729 = Float.NaN;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۥۦ$ۥ */
    public static class C0821 {

        /* JADX INFO: renamed from: ۥ */
        public static final int f1588 = 1;

        /* JADX INFO: renamed from: ۥ۟ */
        public static final int f1589 = 2;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final int f13730 = 3;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final int f13731 = 4;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f13732 = 5;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f13733 = 6;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f13734 = 7;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f13735 = 8;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f13736 = 9;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final int f13737 = 10;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static final int f13738 = 11;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static final int f13739 = 12;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static SparseIntArray f13740;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f13740 = sparseIntArray;
            sparseIntArray.append(C8778.C8789.f29032, 1);
            f13740.append(C8778.C8789.f29030, 2);
            f13740.append(C8778.C8789.f29039, 3);
            f13740.append(C8778.C8789.f29028, 4);
            f13740.append(C8778.C8789.f29029, 5);
            f13740.append(C8778.C8789.f29036, 6);
            f13740.append(C8778.C8789.f29037, 7);
            f13740.append(C8778.C8789.f29031, 9);
            f13740.append(C8778.C8789.f29038, 8);
            f13740.append(C8778.C8789.f29035, 11);
            f13740.append(C8778.C8789.f29034, 12);
            f13740.append(C8778.C8789.f29033, 10);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static void m2346(C5639 c5639, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f13740.get(index)) {
                    case 1:
                        if (C6273.f15610) {
                            int resourceId = typedArray.getResourceId(index, c5639.f1572);
                            c5639.f1572 = resourceId;
                            if (resourceId == -1) {
                                c5639.f13602 = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            c5639.f13602 = typedArray.getString(index);
                        } else {
                            c5639.f1572 = typedArray.getResourceId(index, c5639.f1572);
                        }
                        break;
                    case 2:
                        c5639.f1571 = typedArray.getInt(index, c5639.f1571);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            c5639.f13718 = typedArray.getString(index);
                        } else {
                            c5639.f13718 = C4586.f9863[typedArray.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        c5639.f13742 = typedArray.getInteger(index, c5639.f13742);
                        break;
                    case 5:
                        c5639.f13720 = typedArray.getInt(index, c5639.f13720);
                        break;
                    case 6:
                        c5639.f13723 = typedArray.getFloat(index, c5639.f13723);
                        break;
                    case 7:
                        c5639.f13724 = typedArray.getFloat(index, c5639.f13724);
                        break;
                    case 8:
                        float f = typedArray.getFloat(index, c5639.f13722);
                        c5639.f13721 = f;
                        c5639.f13722 = f;
                        break;
                    case 9:
                        c5639.f13727 = typedArray.getInt(index, c5639.f13727);
                        break;
                    case 10:
                        c5639.f13719 = typedArray.getInt(index, c5639.f13719);
                        break;
                    case 11:
                        c5639.f13721 = typedArray.getFloat(index, c5639.f13721);
                        break;
                    case 12:
                        c5639.f13722 = typedArray.getFloat(index, c5639.f13722);
                        break;
                    default:
                        Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + f13740.get(index));
                        break;
                }
            }
            if (c5639.f1571 == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    public C5639() {
        this.f13603 = 2;
    }

    @Override // Yue.AbstractC5616
    /* JADX INFO: renamed from: ۥ */
    public void mo2325(HashMap<String, AbstractC7544> map) {
    }

    @Override // Yue.AbstractC5616
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo17406(Context context, AttributeSet attributeSet) {
        C0821.m2346(this, context.obtainStyledAttributes(attributeSet, C8778.C8789.f29027));
    }

    @Override // Yue.AbstractC5616
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo17409(String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "transitionEasing":
                this.f13718 = obj.toString();
                break;
            case "percentWidth":
                this.f13721 = m17411(obj);
                break;
            case "percentHeight":
                this.f13722 = m17411(obj);
                break;
            case "drawPath":
                this.f13720 = m17412(obj);
                break;
            case "sizePercent":
                float fM17411 = m17411(obj);
                this.f13721 = fM17411;
                this.f13722 = fM17411;
                break;
            case "percentX":
                this.f13723 = m17411(obj);
                break;
            case "percentY":
                this.f13724 = m17411(obj);
                break;
        }
    }

    @Override // Yue.AbstractC5640
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void mo17503(int i, int i2, float f, float f2, float f3, float f4) {
        int i3 = this.f13727;
        if (i3 == 1) {
            m17509(f, f2, f3, f4);
        } else if (i3 != 2) {
            m17508(f, f2, f3, f4);
        } else {
            m17510(i, i2);
        }
    }

    @Override // Yue.AbstractC5640
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public float mo17504() {
        return this.f13728;
    }

    @Override // Yue.AbstractC5640
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public float mo17505() {
        return this.f13729;
    }

    @Override // Yue.AbstractC5640
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean mo17506(int i, int i2, RectF rectF, RectF rectF2, float f, float f2) {
        mo17503(i, i2, rectF.centerX(), rectF.centerY(), rectF2.centerX(), rectF2.centerY());
        return Math.abs(f - this.f13728) < 20.0f && Math.abs(f2 - this.f13729) < 20.0f;
    }

    @Override // Yue.AbstractC5640
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void mo17507(View view, RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        int i = this.f13727;
        if (i == 1) {
            m17512(rectF, rectF2, f, f2, strArr, fArr);
        } else if (i != 2) {
            m17511(rectF, rectF2, f, f2, strArr, fArr);
        } else {
            m17513(view, rectF, rectF2, f, f2, strArr, fArr);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m17508(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = Float.isNaN(this.f13723) ? 0.0f : this.f13723;
        float f8 = Float.isNaN(this.f13726) ? 0.0f : this.f13726;
        float f9 = Float.isNaN(this.f13724) ? 0.0f : this.f13724;
        this.f13728 = (int) (f + (f7 * f5) + ((Float.isNaN(this.f13725) ? 0.0f : this.f13725) * f6));
        this.f13729 = (int) (f2 + (f5 * f8) + (f6 * f9));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m17509(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = this.f13723;
        float f8 = this.f13724;
        this.f13728 = f + (f5 * f7) + ((-f6) * f8);
        this.f13729 = f2 + (f6 * f7) + (f5 * f8);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m17510(int i, int i2) {
        float f = this.f13723;
        float f2 = 0;
        this.f13728 = (i * f) + f2;
        this.f13729 = (i2 * f) + f2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m17511(RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        float fCenterX2 = rectF2.centerX() - fCenterX;
        float fCenterY2 = rectF2.centerY() - fCenterY;
        String str = strArr[0];
        if (str == null) {
            strArr[0] = f13717;
            fArr[0] = (f - fCenterX) / fCenterX2;
            strArr[1] = f13716;
            fArr[1] = (f2 - fCenterY) / fCenterY2;
            return;
        }
        if (f13717.equals(str)) {
            fArr[0] = (f - fCenterX) / fCenterX2;
            fArr[1] = (f2 - fCenterY) / fCenterY2;
        } else {
            fArr[1] = (f - fCenterX) / fCenterX2;
            fArr[0] = (f2 - fCenterY) / fCenterY2;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m17512(RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        float fCenterX2 = rectF2.centerX() - fCenterX;
        float fCenterY2 = rectF2.centerY() - fCenterY;
        float fHypot = (float) Math.hypot(fCenterX2, fCenterY2);
        if (fHypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f3 = fCenterX2 / fHypot;
        float f4 = fCenterY2 / fHypot;
        float f5 = f2 - fCenterY;
        float f6 = f - fCenterX;
        float f7 = ((f3 * f5) - (f6 * f4)) / fHypot;
        float f8 = ((f3 * f6) + (f4 * f5)) / fHypot;
        String str = strArr[0];
        if (str != null) {
            if (f13717.equals(str)) {
                fArr[0] = f8;
                fArr[1] = f7;
                return;
            }
            return;
        }
        strArr[0] = f13717;
        strArr[1] = f13716;
        fArr[0] = f8;
        fArr[1] = f7;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m17513(View view, RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        rectF.centerX();
        rectF.centerY();
        rectF2.centerX();
        rectF2.centerY();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        String str = strArr[0];
        if (str == null) {
            strArr[0] = f13717;
            fArr[0] = f / width;
            strArr[1] = f13716;
            fArr[1] = f2 / height;
            return;
        }
        if (f13717.equals(str)) {
            fArr[0] = f / width;
            fArr[1] = f2 / height;
        } else {
            fArr[1] = f / width;
            fArr[0] = f2 / height;
        }
    }
}

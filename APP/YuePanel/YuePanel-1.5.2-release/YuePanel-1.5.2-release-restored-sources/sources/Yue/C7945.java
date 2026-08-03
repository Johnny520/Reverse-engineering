package Yue;

import Yue.C6273;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C8778;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: Yue.ۥۢۡۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7945 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final String f23675 = "TouchResponse";

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final boolean f23676 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final float[][] f23677 = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final float[][] f23678 = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f23679 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f23680 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f23681 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final int f23682 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int f23683 = 4;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f23684 = 5;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f23685 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f23686 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int f23687 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int f23688 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final int f23689 = 4;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final int f23690 = 5;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final int f23691 = 6;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final int f23692 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final int f23693 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public float f23704;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public float f23705;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final C6273 f23706;

    /* JADX INFO: renamed from: ۥ */
    public int f3131 = 0;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f3132 = 0;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f23694 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f23695 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f23696 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f23697 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public float f23698 = 0.5f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public float f23699 = 0.5f;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public float f23700 = 0.0f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public float f23701 = 1.0f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean f23702 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public float[] f23703 = new float[2];

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public float f23707 = 4.0f;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public float f23708 = 1.2f;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean f23709 = true;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public float f23710 = 1.0f;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int f23711 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public float f23712 = 10.0f;

    /* JADX INFO: renamed from: Yue.ۥۢۡۨۨ$ۥ */
    public class ViewOnTouchListenerC1385 implements View.OnTouchListener {
        public ViewOnTouchListenerC1385() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۨۨ$ۥ۟ */
    public class C1386 implements NestedScrollView.InterfaceC8804 {
        public C1386() {
        }

        @Override // androidx.core.widget.NestedScrollView.InterfaceC8804
        /* JADX INFO: renamed from: ۥ */
        public void mo3962(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        }
    }

    public C7945(Context context, C6273 c6273, XmlPullParser xmlPullParser) {
        this.f23706 = c6273;
        m25053(context, Xml.asAttributeSet(xmlPullParser));
    }

    public String toString() {
        return this.f23700 + " , " + this.f23701;
    }

    /* JADX INFO: renamed from: ۥ */
    public float m3960(float f, float f2) {
        return (f * this.f23700) + (f2 * this.f23701);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m3961(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == C8778.C8789.f29244) {
                this.f23695 = typedArray.getResourceId(index, this.f23695);
            } else if (index == C8778.C8789.f29245) {
                int i2 = typedArray.getInt(index, this.f3131);
                this.f3131 = i2;
                float[] fArr = f23677[i2];
                this.f23699 = fArr[0];
                this.f23698 = fArr[1];
            } else if (index == C8778.C8789.f29235) {
                int i3 = typedArray.getInt(index, this.f3132);
                this.f3132 = i3;
                float[] fArr2 = f23678[i3];
                this.f23700 = fArr2[0];
                this.f23701 = fArr2[1];
            } else if (index == C8778.C8789.f29240) {
                this.f23707 = typedArray.getFloat(index, this.f23707);
            } else if (index == C8778.C8789.f29239) {
                this.f23708 = typedArray.getFloat(index, this.f23708);
            } else if (index == C8778.C8789.f29241) {
                this.f23709 = typedArray.getBoolean(index, this.f23709);
            } else if (index == C8778.C8789.f29236) {
                this.f23710 = typedArray.getFloat(index, this.f23710);
            } else if (index == C8778.C8789.f29237) {
                this.f23712 = typedArray.getFloat(index, this.f23712);
            } else if (index == C8778.C8789.f29246) {
                this.f23696 = typedArray.getResourceId(index, this.f23696);
            } else if (index == C8778.C8789.f29243) {
                this.f23694 = typedArray.getInt(index, this.f23694);
            } else if (index == C8778.C8789.f29242) {
                this.f23711 = typedArray.getInteger(index, 0);
            } else if (index == C8778.C8789.f29238) {
                this.f23697 = typedArray.getResourceId(index, 0);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m25053(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8778.C8789.f29234);
        m3961(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m25054() {
        return this.f23695;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m25055() {
        return this.f23711;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public RectF m25056(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.f23697;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m25057() {
        return this.f23697;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public float m25058() {
        return this.f23708;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public float m25059() {
        return this.f23707;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean m25060() {
        return this.f23709;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public float m25061(float f, float f2) {
        this.f23706.m19394(this.f23695, this.f23706.getProgress(), this.f23699, this.f23698, this.f23703);
        float f3 = this.f23700;
        if (f3 != 0.0f) {
            float[] fArr = this.f23703;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f * f3) / fArr[0];
        }
        float[] fArr2 = this.f23703;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f2 * this.f23701) / fArr2[1];
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public RectF m25062(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.f23696;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int m25063() {
        return this.f23696;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m25064(MotionEvent motionEvent, C6273.InterfaceC6277 interfaceC6277, int i, C6283 c6283) {
        int i2;
        interfaceC6277.mo19442(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f23704 = motionEvent.getRawX();
            this.f23705 = motionEvent.getRawY();
            this.f23702 = false;
            return;
        }
        if (action == 1) {
            this.f23702 = false;
            interfaceC6277.mo19445(1000);
            float fMo19444 = interfaceC6277.mo19444();
            float fMo19443 = interfaceC6277.mo19443();
            float progress = this.f23706.getProgress();
            int i3 = this.f23695;
            if (i3 != -1) {
                this.f23706.m19394(i3, progress, this.f23699, this.f23698, this.f23703);
            } else {
                float fMin = Math.min(this.f23706.getWidth(), this.f23706.getHeight());
                float[] fArr = this.f23703;
                fArr[1] = this.f23701 * fMin;
                fArr[0] = fMin * this.f23700;
            }
            float f = this.f23700;
            float[] fArr2 = this.f23703;
            float f2 = f != 0.0f ? fMo19444 / fArr2[0] : fMo19443 / fArr2[1];
            float f3 = !Float.isNaN(f2) ? (f2 / 3.0f) + progress : progress;
            if (f3 == 0.0f || f3 == 1.0f || (i2 = this.f23694) == 3) {
                if (0.0f >= f3 || 1.0f <= f3) {
                    this.f23706.setState(C6273.EnumC6281.FINISHED);
                    return;
                }
                return;
            }
            this.f23706.m19413(i2, ((double) f3) < 0.5d ? 0.0f : 1.0f, f2);
            if (0.0f >= progress || 1.0f <= progress) {
                this.f23706.setState(C6273.EnumC6281.FINISHED);
                return;
            }
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY = motionEvent.getRawY() - this.f23705;
        float rawX = motionEvent.getRawX() - this.f23704;
        if (Math.abs((this.f23700 * rawX) + (this.f23701 * rawY)) > this.f23712 || this.f23702) {
            float progress2 = this.f23706.getProgress();
            if (!this.f23702) {
                this.f23702 = true;
                this.f23706.setProgress(progress2);
            }
            int i4 = this.f23695;
            if (i4 != -1) {
                this.f23706.m19394(i4, progress2, this.f23699, this.f23698, this.f23703);
            } else {
                float fMin2 = Math.min(this.f23706.getWidth(), this.f23706.getHeight());
                float[] fArr3 = this.f23703;
                fArr3[1] = this.f23701 * fMin2;
                fArr3[0] = fMin2 * this.f23700;
            }
            float f4 = this.f23700;
            float[] fArr4 = this.f23703;
            if (Math.abs(((f4 * fArr4[0]) + (this.f23701 * fArr4[1])) * this.f23710) < 0.01d) {
                float[] fArr5 = this.f23703;
                fArr5[0] = 0.01f;
                fArr5[1] = 0.01f;
            }
            float fMax = Math.max(Math.min(progress2 + (this.f23700 != 0.0f ? rawX / this.f23703[0] : rawY / this.f23703[1]), 1.0f), 0.0f);
            if (fMax != this.f23706.getProgress()) {
                this.f23706.setProgress(fMax);
                interfaceC6277.mo19445(1000);
                this.f23706.f15622 = this.f23700 != 0.0f ? interfaceC6277.mo19444() / this.f23703[0] : interfaceC6277.mo19443() / this.f23703[1];
            } else {
                this.f23706.f15622 = 0.0f;
            }
            this.f23704 = motionEvent.getRawX();
            this.f23705 = motionEvent.getRawY();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m25065(float f, float f2) {
        float progress = this.f23706.getProgress();
        if (!this.f23702) {
            this.f23702 = true;
            this.f23706.setProgress(progress);
        }
        this.f23706.m19394(this.f23695, progress, this.f23699, this.f23698, this.f23703);
        float f3 = this.f23700;
        float[] fArr = this.f23703;
        if (Math.abs((f3 * fArr[0]) + (this.f23701 * fArr[1])) < 0.01d) {
            float[] fArr2 = this.f23703;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f4 = this.f23700;
        float fMax = Math.max(Math.min(progress + (f4 != 0.0f ? (f * f4) / this.f23703[0] : (f2 * this.f23701) / this.f23703[1]), 1.0f), 0.0f);
        if (fMax != this.f23706.getProgress()) {
            this.f23706.setProgress(fMax);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m25066(float f, float f2) {
        this.f23702 = false;
        float progress = this.f23706.getProgress();
        this.f23706.m19394(this.f23695, progress, this.f23699, this.f23698, this.f23703);
        float f3 = this.f23700;
        float[] fArr = this.f23703;
        float f4 = f3 != 0.0f ? (f * f3) / fArr[0] : (f2 * this.f23701) / fArr[1];
        if (!Float.isNaN(f4)) {
            progress += f4 / 3.0f;
        }
        if (progress != 0.0f) {
            boolean z = progress != 1.0f;
            int i = this.f23694;
            if ((i != 3) && z) {
                this.f23706.m19413(i, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f4);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m25067(int i) {
        this.f23695 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m25068(float f, float f2) {
        this.f23704 = f;
        this.f23705 = f2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m25069(float f) {
        this.f23708 = f;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m25070(float f) {
        this.f23707 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m25071(boolean z) {
        if (z) {
            float[][] fArr = f23678;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f23677;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f23678;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f23677;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = f23677[this.f3131];
        this.f23699 = fArr5[0];
        this.f23698 = fArr5[1];
        float[] fArr6 = f23678[this.f3132];
        this.f23700 = fArr6[0];
        this.f23701 = fArr6[1];
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m25072(float f, float f2) {
        this.f23699 = f;
        this.f23698 = f2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m25073(float f, float f2) {
        this.f23704 = f;
        this.f23705 = f2;
        this.f23702 = false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m25074() {
        View viewFindViewById;
        int i = this.f23695;
        if (i != -1) {
            viewFindViewById = this.f23706.findViewById(i);
            if (viewFindViewById == null) {
                Log.e(f23675, "cannot find TouchAnchorId @id/" + C4308.m12435(this.f23706.getContext(), this.f23695));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new ViewOnTouchListenerC1385());
            nestedScrollView.setOnScrollChangeListener(new C1386());
        }
    }
}

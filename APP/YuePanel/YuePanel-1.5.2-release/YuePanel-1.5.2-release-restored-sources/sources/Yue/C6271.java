package Yue;

import Yue.C6273;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.AbstractC8767;
import androidx.constraintlayout.widget.C8778;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: Yue.ۥۡۡۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6271 extends AbstractC8767 implements InterfaceC3221, C6273.InterfaceC6280 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean f15598;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean f15599;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public float f15600;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public View[] f15601;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6271(Context context) {
        super(context);
        this.f15598 = false;
        this.f15599 = false;
    }

    @Override // Yue.InterfaceC3221
    public float getProgress() {
        return this.f15600;
    }

    @Override // Yue.InterfaceC3221
    public void setProgress(float f) {
        this.f15600 = f;
        int i = 0;
        if (this.f26623 > 0) {
            this.f15601 = m29290((ConstraintLayout) getParent());
            while (i < this.f26623) {
                m19356(this.f15601[i], f);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof C6271)) {
                m19356(childAt, f);
            }
            i++;
        }
    }

    @Override // Yue.C6273.InterfaceC6280
    /* JADX INFO: renamed from: ۥ */
    public void mo2740(C6273 c6273, int i, int i2) {
    }

    @Override // Yue.C6273.InterfaceC6280
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo2741(C6273 c6273, int i) {
    }

    @Override // Yue.C6273.InterfaceC6280
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void mo19352(C6273 c6273, int i, boolean z, float f) {
    }

    @Override // Yue.C6273.InterfaceC6280
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void mo19353(C6273 c6273, int i, int i2, float f) {
    }

    @Override // androidx.constraintlayout.widget.AbstractC8767
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public void mo17579(AttributeSet attributeSet) {
        super.mo17579(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C8778.C8789.f29214);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C8778.C8789.f29216) {
                    this.f15598 = typedArrayObtainStyledAttributes.getBoolean(index, this.f15598);
                } else if (index == C8778.C8789.f29215) {
                    this.f15599 = typedArrayObtainStyledAttributes.getBoolean(index, this.f15599);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean m19354() {
        return this.f15599;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean m19355() {
        return this.f15598;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public void m19356(View view, float f) {
    }

    public C6271(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15598 = false;
        this.f15599 = false;
        mo17579(attributeSet);
    }

    public C6271(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15598 = false;
        this.f15599 = false;
        mo17579(attributeSet);
    }
}

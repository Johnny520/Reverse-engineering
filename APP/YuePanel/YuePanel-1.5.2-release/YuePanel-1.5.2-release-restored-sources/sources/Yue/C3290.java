package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

/* JADX INFO: renamed from: Yue.ۥ۟ۡ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
public class C3290 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6391
    public final CheckedTextView f196;

    /* JADX INFO: renamed from: ۥ۟ */
    public ColorStateList f197 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public PorterDuff.Mode f5176 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f5177 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f5178 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f5179;

    public C3290(@InterfaceC6391 CheckedTextView checkedTextView) {
        this.f196 = checkedTextView;
    }

    /* JADX INFO: renamed from: ۥ */
    public void m358() {
        Drawable drawableM855 = C3810.m855(this.f196);
        if (drawableM855 != null) {
            if (this.f5177 || this.f5178) {
                Drawable drawableMutate = C4520.m13239(drawableM855).mutate();
                if (this.f5177) {
                    C4520.m13236(drawableMutate, this.f197);
                }
                if (this.f5178) {
                    C4520.m13237(drawableMutate, this.f5176);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f196.getDrawableState());
                }
                this.f196.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public ColorStateList m359() {
        return this.f197;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public PorterDuff.Mode m6732() {
        return this.f5176;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m6733(@InterfaceC6490 AttributeSet attributeSet, int i) {
        int iM24888;
        int iM248882;
        C7837 c7837M24869 = C7837.m24869(this.f196.getContext(), attributeSet, C6898.C6909.f19591, i, 0);
        CheckedTextView checkedTextView = this.f196;
        C8273.m27437(checkedTextView, checkedTextView.getContext(), C6898.C6909.f19591, attributeSet, c7837M24869.m24895(), i, 0);
        try {
            if (c7837M24869.m24896(C6898.C6909.f19593) && (iM248882 = c7837M24869.m24888(C6898.C6909.f19593, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.f196;
                    checkedTextView2.setCheckMarkDrawable(C3323.m396(checkedTextView2.getContext(), iM248882));
                } catch (Resources.NotFoundException unused) {
                    if (c7837M24869.m24896(C6898.C6909.f19592)) {
                        CheckedTextView checkedTextView3 = this.f196;
                        checkedTextView3.setCheckMarkDrawable(C3323.m396(checkedTextView3.getContext(), iM24888));
                    }
                }
            } else if (c7837M24869.m24896(C6898.C6909.f19592) && (iM24888 = c7837M24869.m24888(C6898.C6909.f19592, 0)) != 0) {
                CheckedTextView checkedTextView32 = this.f196;
                checkedTextView32.setCheckMarkDrawable(C3323.m396(checkedTextView32.getContext(), iM24888));
            }
            if (c7837M24869.m24896(C6898.C6909.f19594)) {
                C3810.m10514(this.f196, c7837M24869.m24871(C6898.C6909.f19594));
            }
            if (c7837M24869.m24896(C6898.C6909.f19595)) {
                C3810.m10515(this.f196, C4533.m13289(c7837M24869.m24882(C6898.C6909.f19595, -1), null));
            }
        } finally {
            c7837M24869.m24899();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m6734() {
        if (this.f5179) {
            this.f5179 = false;
        } else {
            this.f5179 = true;
            m358();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m6735(ColorStateList colorStateList) {
        this.f197 = colorStateList;
        this.f5177 = true;
        m358();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m6736(@InterfaceC6490 PorterDuff.Mode mode) {
        this.f5176 = mode;
        this.f5178 = true;
        m358();
    }
}

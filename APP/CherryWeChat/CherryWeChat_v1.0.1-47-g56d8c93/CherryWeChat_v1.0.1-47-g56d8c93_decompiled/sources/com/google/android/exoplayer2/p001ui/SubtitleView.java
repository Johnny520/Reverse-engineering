package com.google.android.exoplayer2.p001ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.AbstractC2665wD;
import p000.C0695Q6;
import p000.C0737R6;
import p000.C1361eF;
import p000.InterfaceC0257Fz;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public List f4351a;

    /* JADX INFO: renamed from: b */
    public C0737R6 f4352b;

    /* JADX INFO: renamed from: c */
    public float f4353c;

    /* JADX INFO: renamed from: d */
    public float f4354d;

    /* JADX INFO: renamed from: e */
    public boolean f4355e;

    /* JADX INFO: renamed from: f */
    public boolean f4356f;

    /* JADX INFO: renamed from: g */
    public int f4357g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0257Fz f4358h;

    /* JADX INFO: renamed from: i */
    public View f4359i;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4351a = Collections.EMPTY_LIST;
        this.f4352b = C0737R6.f2350e;
        this.f4353c = 0.0533f;
        this.f4354d = 0.08f;
        this.f4355e = true;
        this.f4356f = true;
        C0695Q6 c0695q6 = new C0695Q6(context, 0);
        this.f4358h = c0695q6;
        this.f4359i = c0695q6;
        addView(c0695q6);
        this.f4357g = 1;
    }

    private List<Object> getCuesWithStylingPreferencesApplied() {
        if (this.f4355e && this.f4356f) {
            return this.f4351a;
        }
        ArrayList arrayList = new ArrayList(this.f4351a.size());
        if (this.f4351a.size() <= 0) {
            return arrayList;
        }
        this.f4351a.get(0).getClass();
        throw new ClassCastException();
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (AbstractC2665wD.f9229a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C0737R6 getUserCaptionStyle() {
        CaptioningManager captioningManager;
        int i = AbstractC2665wD.f9229a;
        C0737R6 c0737r6 = C0737R6.f2350e;
        if (i < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return c0737r6;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (i >= 21) {
            return new C0737R6(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return new C0737R6(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
    }

    private <T extends View & InterfaceC0257Fz> void setView(T t) {
        removeView(this.f4359i);
        View view = this.f4359i;
        if (view instanceof C1361eF) {
            ((C1361eF) view).f4864b.destroy();
        }
        this.f4359i = t;
        this.f4358h = t;
        addView(t);
    }

    /* JADX INFO: renamed from: a */
    public final void m2417a() {
        this.f4358h.mo538a(getCuesWithStylingPreferencesApplied(), this.f4352b, this.f4353c, this.f4354d);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f4356f = z;
        m2417a();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f4355e = z;
        m2417a();
    }

    public void setBottomPaddingFraction(float f) {
        this.f4354d = f;
        m2417a();
    }

    public void setCues(List<Object> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f4351a = list;
        m2417a();
    }

    public void setFractionalTextSize(float f) {
        this.f4353c = f;
        m2417a();
    }

    public void setStyle(C0737R6 c0737r6) {
        this.f4352b = c0737r6;
        m2417a();
    }

    public void setViewType(int i) {
        if (this.f4357g == i) {
            return;
        }
        if (i == 1) {
            setView(new C0695Q6(getContext(), 0));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            setView(new C1361eF(getContext()));
        }
        this.f4357g = i;
    }
}

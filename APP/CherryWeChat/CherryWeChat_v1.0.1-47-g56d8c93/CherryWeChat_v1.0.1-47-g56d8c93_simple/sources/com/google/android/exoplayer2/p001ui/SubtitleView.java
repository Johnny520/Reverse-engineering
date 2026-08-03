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

    public SubtitleView(Context r3, AttributeSet r4) {
        super(r3, r4);
        this.f4351a = Collections.EMPTY_LIST;
        this.f4352b = C0737R6.f2350e;
        this.f4353c = 0.0533f;
        this.f4354d = 0.08f;
        this.f4355e = true;
        this.f4356f = true;
        C0695Q6 r0 = new C0695Q6(r3, 0);
        this.f4358h = r0;
        this.f4359i = r0;
        addView(r0);
        this.f4357g = 1;
    }

    private List<Object> getCuesWithStylingPreferencesApplied() {
        if (this.f4355e == true) goto L5;
    L8:
        ArrayList r0 = new ArrayList(this.f4351a.size());
        if (this.f4351a.size() > 0) goto L11;
        return r0;
    L11:
        this.f4351a.get(0).getClass();
        throw new ClassCastException();
    L5:
        if (this.f4356f == false) goto L8;
        return this.f4351a;
    }

    private float getUserCaptionFontScale() {
        if (AbstractC2665wD.f9229a >= 19) goto L5;
    L13:
        return 1.0f;
    L5:
        if (isInEditMode() == true) goto L13;
        CaptioningManager r0 = (CaptioningManager) getContext().getSystemService("captioning");
        if (r0 == null) goto L13;
        if (r0.isEnabled() == false) goto L13;
        return r0.getFontScale();
    }

    private C0737R6 getUserCaptionStyle() {
        int r0 = AbstractC2665wD.f9229a;
        C0737R6 r2 = C0737R6.f2350e;
        if (r0 >= 19) goto L5;
    L36:
        return r2;
    L5:
        if (isInEditMode() == true) goto L36;
        CaptioningManager r1 = (CaptioningManager) getContext().getSystemService("captioning");
        if (r1 == null) goto L36;
        if (r1.isEnabled() == false) goto L36;
        CaptioningManager.CaptionStyle r12 = r1.getUserStyle();
        if (r0 < 21) goto L35;
        int r22 = -1;
        if (r12.hasForegroundColor() == false) goto L16;
        int r4 = r12.foregroundColor;
    L18:
        if (r12.hasBackgroundColor() == false) goto L21;
        int r02 = r12.backgroundColor;
    L20:
        int r5 = r02;
        int r6 = 0;
        if (r12.hasWindowColor() == false) goto L25;
        int r03 = r12.windowColor;
    L27:
        if (r12.hasEdgeType() == false) goto L29;
        r6 = r12.edgeType;
    L29:
        int r7 = r6;
        if (r12.hasEdgeColor() == false) goto L33;
        r22 = r12.edgeColor;
    L33:
        return new C0737R6(r4, r5, r03, r7, r22, r12.getTypeface());
    L25:
        r03 = 0;
        goto L27
    L21:
        r02 = -16777216;
        goto L20
    L16:
        r4 = -1;
        goto L18
    L35:
        return new C0737R6(r12.foregroundColor, r12.backgroundColor, 0, r12.edgeType, r12.edgeColor, r12.getTypeface());
    }

    private <T extends View & InterfaceC0257Fz> void setView(T r3) {
        removeView(this.f4359i);
        View r0 = this.f4359i;
        if ((r0 instanceof C1361eF) == false) goto L5;
        ((C1361eF) r0).f4864b.destroy();
    L5:
        this.f4359i = r3;
        this.f4358h = r3;
        addView(r3);
    }

    /* JADX INFO: renamed from: a */
    public final void m2417a() {
        this.f4358h.mo538a(getCuesWithStylingPreferencesApplied(), this.f4352b, this.f4353c, this.f4354d);
    }

    public void setApplyEmbeddedFontSizes(boolean r1) {
        this.f4356f = r1;
        m2417a();
    }

    public void setApplyEmbeddedStyles(boolean r1) {
        this.f4355e = r1;
        m2417a();
    }

    public void setBottomPaddingFraction(float r1) {
        this.f4354d = r1;
        m2417a();
    }

    public void setCues(List<Object> r1) {
        if (r1 != null) goto L5;
        r1 = Collections.EMPTY_LIST;
    L5:
        this.f4351a = r1;
        m2417a();
    }

    public void setFractionalTextSize(float r1) {
        this.f4353c = r1;
        m2417a();
    }

    public void setStyle(C0737R6 r1) {
        this.f4352b = r1;
        m2417a();
    }

    public void setViewType(int r4) {
        if (this.f4357g != r4) goto L6;
        return;
    L6:
        if (r4 != 1) goto L8;
        setView(new C0695Q6(getContext(), 0));
    L13:
        this.f4357g = r4;
        return;
    L8:
        if (r4 != 2) goto L11;
        setView(new C1361eF(getContext()));
        goto L13
    L11:
        throw new IllegalArgumentException();
    }
}

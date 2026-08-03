package p259r9;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import okio.C3193a;
import p085fg.InterfaceC1220a;
import p276sf.C3967n;

/* JADX INFO: renamed from: r9.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3763m implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C3752d0 f12299g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ TextView f12300h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ View f12301i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C3767q f12302j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ View f12303k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ String f12304l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f12305m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean f12306n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f12307o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ RelativeLayout f12308p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3763m(C3752d0 c3752d0, TextView textView, View view, C3767q c3767q, View view2, String str, int i9, boolean z9, int i10, RelativeLayout relativeLayout) {
        this.f12299g = c3752d0;
        this.f12300h = textView;
        this.f12301i = view;
        this.f12302j = c3767q;
        this.f12303k = view2;
        this.f12304l = str;
        this.f12305m = i9;
        this.f12306n = z9;
        this.f12307o = i10;
        this.f12308p = relativeLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae A[PHI: r2
  0x00ae: PHI (r2v25 java.lang.Integer) = (r2v21 java.lang.Integer), (r2v23 java.lang.Integer) binds: [B:44:0x00ac, B:50:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a0  */
    @Override // p085fg.InterfaceC1220a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        RelativeLayout relativeLayout;
        View view;
        View view2;
        int i9;
        boolean z9;
        EnumC3770t enumC3770t;
        Rect rect;
        Rect rect2;
        boolean z10;
        Rect rect3;
        int iM7909r;
        int measuredHeight;
        int paddingLeft;
        int paddingTop;
        C3769s c3769s;
        int measuredHeight2;
        C3769s c3769s2;
        int i10;
        C3752d0 c3752d0 = this.f12299g;
        TextView textView = this.f12300h;
        View view3 = this.f12301i;
        C3767q c3767q = this.f12302j;
        View view4 = this.f12303k;
        String str = this.f12304l;
        int i11 = this.f12305m;
        boolean z11 = this.f12306n;
        int i12 = this.f12307o;
        RelativeLayout relativeLayout2 = this.f12308p;
        boolean z12 = i12 >= 2;
        RelativeLayout relativeLayout3 = c3767q.f12321a;
        View view5 = c3767q.f12322b;
        if (textView.getParent() != relativeLayout3 || view5.getHeight() <= 0 || (!c3767q.f12323c && view5.getWidth() <= 0)) {
            relativeLayout = relativeLayout2;
            view = view3;
            view2 = view4;
            i9 = i11;
            z9 = z11;
            enumC3770t = EnumC3770t.f12334i;
        } else {
            textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int width = view3.getWidth();
            Integer numValueOf = Integer.valueOf(width);
            if (width <= 0) {
                numValueOf = null;
            }
            if (numValueOf == null) {
                int measuredWidth = view3.getMeasuredWidth();
                numValueOf = Integer.valueOf(measuredWidth);
                if (measuredWidth <= 0) {
                    numValueOf = null;
                }
            }
            if (numValueOf != null && (view3 instanceof ViewGroup) && C3752d0.m7780P(relativeLayout3, view3)) {
                int iIntValue = numValueOf.intValue();
                ViewGroup viewGroup = (ViewGroup) view3;
                relativeLayout = relativeLayout2;
                int height = viewGroup.getHeight();
                i9 = i11;
                if (height < 1) {
                    height = 1;
                }
                rect = new Rect(0, 0, iIntValue, height);
                if (view3 != relativeLayout3) {
                    viewGroup.offsetRectIntoDescendantCoords(relativeLayout3, rect);
                }
                if (rect.width() <= 0) {
                }
                if (rect != null) {
                    if (view5 == relativeLayout3) {
                        rect2 = new Rect(relativeLayout3.getPaddingLeft(), relativeLayout3.getPaddingTop(), relativeLayout3.getWidth() - relativeLayout3.getPaddingRight(), relativeLayout3.getHeight() - relativeLayout3.getPaddingBottom());
                    } else {
                        rect2 = new Rect(0, 0, view5.getWidth(), view5.getHeight());
                        relativeLayout3.offsetDescendantRectToMyCoords(view5, rect2);
                    }
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
                    if (layoutParams2 != null) {
                        int measuredWidth2 = textView.getMeasuredWidth();
                        int i13 = rect.left;
                        int i14 = rect.right - measuredWidth2;
                        if (i14 < i13) {
                            i14 = i13;
                        }
                        if (view4 == null) {
                            view = view3;
                            view2 = view4;
                            z9 = z11;
                            z10 = z12;
                            rect3 = null;
                            if (c3767q.f12323c) {
                                iM7909r = AbstractC3754e0.m7909r(((rect2.width() - measuredWidth2) / 2) + rect2.left, i13, i14);
                            } else if (z9) {
                                iM7909r = AbstractC3754e0.m7909r(rect3 != null ? rect3.right - measuredWidth2 : i14, i13, i14);
                            } else {
                                iM7909r = AbstractC3754e0.m7909r(rect3 != null ? rect3.left : i13, i13, i14);
                            }
                            measuredHeight = !str.equals("avatar_above") ? (rect2.top - textView.getMeasuredHeight()) - i9 : rect2.bottom + i9;
                            if (!str.equals("avatar_below") && (measuredHeight2 = (textView.getMeasuredHeight() + measuredHeight) - relativeLayout3.getHeight()) > 0 && measuredHeight2 > 0) {
                                synchronized (c3752d0.f12212w) {
                                    c3769s2 = (C3769s) c3752d0.f12212w.get(relativeLayout3);
                                }
                                if (c3769s2 != null && (i10 = c3769s2.f12329d) == c3769s2.f12327b) {
                                    C3769s c3769sM7925a = C3769s.m7925a(c3769s2, 0, i10 + measuredHeight2, 55);
                                    relativeLayout3.setPadding(relativeLayout3.getPaddingLeft(), c3769sM7925a.f12328c, relativeLayout3.getPaddingRight(), c3769sM7925a.f12329d);
                                    synchronized (c3752d0.f12212w) {
                                        c3752d0.f12212w.put(relativeLayout3, c3769sM7925a);
                                    }
                                    enumC3770t = EnumC3770t.f12333h;
                                }
                            } else if (measuredHeight < 0 || !str.equals("avatar_above") || z10) {
                                if (measuredHeight < 0) {
                                    measuredHeight = rect2.bottom + i9;
                                }
                                paddingLeft = iM7909r - relativeLayout3.getPaddingLeft();
                                paddingTop = measuredHeight - relativeLayout3.getPaddingTop();
                                if (layoutParams2.width != measuredWidth2 && layoutParams2.leftMargin == paddingLeft && layoutParams2.topMargin == paddingTop) {
                                    enumC3770t = EnumC3770t.f12332g;
                                } else {
                                    layoutParams2.width = measuredWidth2;
                                    layoutParams2.leftMargin = paddingLeft;
                                    layoutParams2.setMarginStart(paddingLeft);
                                    layoutParams2.topMargin = paddingTop;
                                    textView.setLayoutParams(layoutParams2);
                                    enumC3770t = EnumC3770t.f12333h;
                                }
                            } else {
                                int i15 = -measuredHeight;
                                if (i15 <= 0) {
                                    enumC3770t = EnumC3770t.f12334i;
                                } else {
                                    synchronized (c3752d0.f12212w) {
                                        c3769s = (C3769s) c3752d0.f12212w.get(relativeLayout3);
                                    }
                                    if (c3769s != null) {
                                        C3769s c3769sM7925a2 = C3769s.m7925a(c3769s, c3769s.f12328c + i15, 0, 59);
                                        relativeLayout3.setPadding(relativeLayout3.getPaddingLeft(), c3769sM7925a2.f12328c, relativeLayout3.getPaddingRight(), c3769sM7925a2.f12329d);
                                        synchronized (c3752d0.f12212w) {
                                            c3752d0.f12212w.put(relativeLayout3, c3769sM7925a2);
                                        }
                                        enumC3770t = EnumC3770t.f12333h;
                                    }
                                }
                            }
                        } else {
                            View view6 = (!c3767q.f12323c || view4.getWidth() <= 0 || view4.getHeight() <= 0 || !C3752d0.m7780P(view4, relativeLayout3)) ? null : view4;
                            if (view6 != null) {
                                view = view3;
                                view2 = view4;
                                z9 = z11;
                                z10 = z12;
                                rect3 = new Rect(0, 0, view6.getWidth(), view6.getHeight());
                                relativeLayout3.offsetDescendantRectToMyCoords(view6, rect3);
                            }
                            if (c3767q.f12323c) {
                            }
                            if (!str.equals("avatar_above")) {
                            }
                            if (!str.equals("avatar_below")) {
                                if (measuredHeight < 0) {
                                    if (measuredHeight < 0) {
                                    }
                                    paddingLeft = iM7909r - relativeLayout3.getPaddingLeft();
                                    paddingTop = measuredHeight - relativeLayout3.getPaddingTop();
                                    if (layoutParams2.width != measuredWidth2) {
                                        layoutParams2.width = measuredWidth2;
                                        layoutParams2.leftMargin = paddingLeft;
                                        layoutParams2.setMarginStart(paddingLeft);
                                        layoutParams2.topMargin = paddingTop;
                                        textView.setLayoutParams(layoutParams2);
                                        enumC3770t = EnumC3770t.f12333h;
                                    }
                                }
                            }
                        }
                    } else {
                        view = view3;
                        view2 = view4;
                        z9 = z11;
                        enumC3770t = EnumC3770t.f12334i;
                    }
                } else {
                    view = view3;
                    view2 = view4;
                    z9 = z11;
                    enumC3770t = EnumC3770t.f12334i;
                }
            } else {
                relativeLayout = relativeLayout2;
                i9 = i11;
            }
            int width2 = relativeLayout3.getWidth();
            Integer numValueOf2 = Integer.valueOf(width2);
            if (width2 <= 0) {
                numValueOf2 = null;
            }
            if (numValueOf2 != null) {
                int iIntValue2 = numValueOf2.intValue();
                int height2 = relativeLayout3.getHeight();
                if (height2 < 1) {
                    height2 = 1;
                }
                rect = new Rect(0, 0, iIntValue2, height2);
                if (rect != null) {
                }
            } else {
                int measuredWidth3 = relativeLayout3.getMeasuredWidth();
                numValueOf2 = Integer.valueOf(measuredWidth3);
                if (measuredWidth3 <= 0) {
                    numValueOf2 = null;
                }
                if (numValueOf2 == null) {
                    rect = null;
                }
                if (rect != null) {
                }
            }
        }
        int iOrdinal = enumC3770t.ordinal();
        if (iOrdinal == 0) {
            textView.setVisibility(0);
        } else if (iOrdinal == 1) {
            int i16 = i9;
            View view7 = view;
            View view8 = view2;
            boolean z13 = z9;
            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                int i17 = layoutParams4.width;
                Integer numValueOf3 = i17 > 0 ? Integer.valueOf(i17) : null;
                int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : textView.getMeasuredWidth();
                int measuredHeight3 = textView.getMeasuredHeight();
                if (iIntValue3 > 0 && measuredHeight3 > 0) {
                    int paddingLeft2 = relativeLayout.getPaddingLeft() + layoutParams4.leftMargin;
                    int paddingTop2 = relativeLayout.getPaddingTop() + layoutParams4.topMargin;
                    textView.layout(paddingLeft2, paddingTop2, iIntValue3 + paddingLeft2, measuredHeight3 + paddingTop2);
                }
            }
            textView.setVisibility(0);
            if (i12 < 4) {
                RelativeLayout relativeLayout4 = c3767q.f12321a;
                C3752d0.m7764A0(textView, relativeLayout4, c3752d0.f12214y, new C3763m(c3752d0, textView, view7, c3767q, view8, str, i16, z13, i12 + 1, relativeLayout4));
            }
        } else {
            if (iOrdinal != 2) {
                C3193a.m6822k();
                return null;
            }
            if (i12 < 4) {
                RelativeLayout relativeLayout5 = c3767q.f12321a;
                C3752d0.m7764A0(textView, relativeLayout5, c3752d0.f12214y, new C3763m(c3752d0, textView, view, c3767q, view2, str, i9, z9, i12 + 1, relativeLayout5));
            } else {
                View view9 = view;
                c3752d0.m7852u0(view9, null);
                c3752d0.m7856y0(view9, null);
            }
        }
        return C3967n.f12976a;
    }
}

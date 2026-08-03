package p366ya;

import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import p332wb.RunnableC4794cr;

/* JADX INFO: renamed from: ya.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6011a {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f24402a;

    /* JADX INFO: renamed from: b */
    public final C6012b f24403b;

    /* JADX INFO: renamed from: c */
    public final float f24404c;

    /* JADX INFO: renamed from: d */
    public final float f24405d;

    /* JADX INFO: renamed from: e */
    public final View f24406e;

    /* JADX INFO: renamed from: f */
    public final Float f24407f;

    /* JADX INFO: renamed from: g */
    public final float f24408g;

    /* JADX INFO: renamed from: h */
    public final float f24409h;

    /* JADX INFO: renamed from: i */
    public boolean f24410i;

    /* JADX INFO: renamed from: j */
    public boolean f24411j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6011a(ViewGroup viewGroup, C6012b c6012b, float f3, float f10) {
        View view;
        this.f24402a = viewGroup;
        this.f24403b = c6012b;
        this.f24404c = f3;
        this.f24405d = f10;
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int i9 = c6012b.f24416e;
        Drawable drawable = c6012b.f24428q;
        View view2 = c6012b.f24412a;
        View view3 = c6012b.f24413b;
        int i10 = c6012b.f24417f;
        int i11 = c6012b.f24414c - iArr[0];
        int i12 = c6012b.f24415d - iArr[1];
        CharSequence charSequence = c6012b.f24418g;
        if (charSequence != null) {
            TextView textView = new TextView(view2.getContext());
            textView.setText(charSequence);
            textView.setTextColor(c6012b.f24419h);
            textView.setTextSize(c6012b.f24420i / textView.getResources().getDisplayMetrics().scaledDensity);
            textView.setTypeface(c6012b.f24421j);
            textView.setGravity(c6012b.f24422k);
            textView.setIncludeFontPadding(c6012b.f24423l);
            textView.setPadding(c6012b.f24424m, c6012b.f24425n, c6012b.f24426o, c6012b.f24427p);
            textView.setBackground(drawable);
            view = textView;
        } else {
            View view4 = new View(view2.getContext());
            view4.setBackground(drawable);
            view = view4;
        }
        view.setAlpha(view3 != null ? view3.getAlpha() : 1.0f);
        view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
        view.layout(i11, i12, i9 + i11, i10 + i12);
        view.setTranslationX(view3 != null ? view3.getTranslationX() : 0.0f);
        view.setTranslationY(view3 != null ? view3.getTranslationY() : 0.0f);
        view.setElevation((view3 != null ? view3.getElevation() : 0.0f) + ((int) TypedValue.applyDimension(1, 8.0f, view2.getResources().getDisplayMetrics())));
        this.f24406e = view;
        this.f24407f = view3 != null ? Float.valueOf(view3.getAlpha()) : null;
        this.f24408g = view.getTranslationX();
        this.f24409h = view.getTranslationY();
        if (view3 != null) {
            view3.setAlpha(0.0f);
        }
        viewGroup.getOverlay().add(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m10771a() {
        View view;
        if (this.f24411j) {
            return;
        }
        this.f24411j = true;
        try {
            this.f24402a.getOverlay().remove(this.f24406e);
        } catch (Throwable unused) {
        }
        Float f3 = this.f24407f;
        if (f3 == null || (view = this.f24403b.f24413b) == null) {
            return;
        }
        view.setAlpha(f3.floatValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m10772b(float f3, float f10) {
        float f11 = f3 - this.f24404c;
        float f12 = f10 - this.f24405d;
        float f13 = this.f24408g + f11;
        View view = this.f24406e;
        view.setTranslationX(f13);
        view.setTranslationY(this.f24409h + f12);
        if (!m10774d() || this.f24410i) {
            return;
        }
        this.f24403b.f24412a.performHapticFeedback(4);
        this.f24410i = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m10773c() {
        ViewParent parent;
        this.f24406e.animate().translationX(this.f24408g).translationY(this.f24409h).setDuration(120L).withEndAction(new RunnableC4794cr(this, 8)).start();
        View view = this.f24403b.f24413b;
        if (view == null || (parent = view.getParent()) == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m10774d() {
        View view = this.f24406e;
        float translationY = view.getTranslationY() - this.f24409h;
        return translationY <= ((float) (-((int) TypedValue.applyDimension(1, 42.0f, this.f24403b.f24412a.getResources().getDisplayMetrics())))) && Math.abs(translationY) > Math.abs(view.getTranslationX() - this.f24408g) * 0.45f;
    }
}

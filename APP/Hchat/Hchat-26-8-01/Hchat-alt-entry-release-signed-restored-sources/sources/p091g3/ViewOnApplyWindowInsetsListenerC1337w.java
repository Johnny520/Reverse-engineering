package p091g3;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import p014b.C0126e;
import p018b3.C0171a;
import p099h.Hchat.R;

/* JADX INFO: renamed from: g3.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC1337w implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public final AbstractC1333s f4413a;

    /* JADX INFO: renamed from: b */
    public C1332r0 f4414b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnApplyWindowInsetsListenerC1337w(View view, AbstractC1333s abstractC1333s) {
        C1332r0 c1332r0Mo3453b;
        this.f4413a = abstractC1333s;
        int i9 = AbstractC1329q.f4395a;
        C1332r0 c1332r0M3525a = AbstractC1323n.m3525a(view);
        if (c1332r0M3525a != null) {
            int i10 = Build.VERSION.SDK_INT;
            c1332r0Mo3453b = (i10 >= 34 ? new C1308f0(c1332r0M3525a) : i10 >= 30 ? new C1306e0(c1332r0M3525a) : i10 >= 29 ? new C1304d0(c1332r0M3525a) : new C1302c0(c1332r0M3525a)).mo3453b();
        } else {
            c1332r0Mo3453b = null;
        }
        this.f4414b = c1332r0Mo3453b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z9;
        if (!view.isLaidOut()) {
            this.f4414b = C1332r0.m3558c(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        C1332r0 c1332r0M3558c = C1332r0.m3558c(windowInsets, view);
        C1324n0 c1324n0 = c1332r0M3558c.f4398a;
        if (this.f4414b == null) {
            int i9 = AbstractC1329q.f4395a;
            this.f4414b = AbstractC1323n.m3525a(view);
        }
        if (this.f4414b == null) {
            this.f4414b = c1332r0M3558c;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            AbstractC1333s abstractC1333sM3568j = C1338x.m3568j(view);
            if (abstractC1333sM3568j == null || !Objects.equals((C1332r0) abstractC1333sM3568j.f4401i, c1332r0M3558c)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                C1332r0 c1332r0 = this.f4414b;
                int i10 = 1;
                while (i10 <= 512) {
                    C0171a c0171aMo3501g = c1324n0.mo3501g(i10);
                    C0171a c0171aMo3501g2 = c1332r0.f4398a.mo3501g(i10);
                    int i11 = c0171aMo3501g.f445a;
                    int i12 = c0171aMo3501g.f448d;
                    int i13 = c0171aMo3501g.f447c;
                    int i14 = c0171aMo3501g.f446b;
                    int i15 = c0171aMo3501g2.f445a;
                    int i16 = c0171aMo3501g2.f448d;
                    int[] iArr4 = iArr2;
                    int i17 = c0171aMo3501g2.f447c;
                    int i18 = c0171aMo3501g2.f446b;
                    if (i11 > i15 || i14 > i18 || i13 > i17 || i12 > i16) {
                        iArr = iArr3;
                        z9 = true;
                    } else {
                        iArr = iArr3;
                        z9 = false;
                    }
                    if (z9 != (i11 < i15 || i14 < i18 || i13 < i17 || i12 < i16)) {
                        if (z9) {
                            iArr4[0] = iArr4[0] | i10;
                        } else {
                            iArr[0] = iArr[0] | i10;
                        }
                    }
                    i10 <<= 1;
                    iArr2 = iArr4;
                    iArr3 = iArr;
                }
                int i19 = iArr2[0];
                int i20 = iArr3[0];
                int i21 = i19 | i20;
                if (i21 == 0) {
                    this.f4414b = c1332r0M3558c;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    C1332r0 c1332r02 = this.f4414b;
                    C1300b0 c1300b0 = new C1300b0(i21, (i19 & 8) != 0 ? C1338x.f4415e : (i20 & 8) != 0 ? C1338x.f4416f : (i19 & 519) != 0 ? C1338x.f4417g : (i20 & 519) != 0 ? C1338x.f4418h : null, (i21 & 8) != 0 ? 160L : 250L);
                    c1300b0.f4355a.mo3448e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c1300b0.f4355a.mo3445b());
                    C0171a c0171aMo3501g3 = c1324n0.mo3501g(i21);
                    C0171a c0171aMo3501g4 = c1332r02.f4398a.mo3501g(i21);
                    int iMin = Math.min(c0171aMo3501g3.f445a, c0171aMo3501g4.f445a);
                    int i22 = c0171aMo3501g3.f446b;
                    int i23 = c0171aMo3501g4.f446b;
                    int iMin2 = Math.min(i22, i23);
                    int i24 = c0171aMo3501g3.f447c;
                    int i25 = c0171aMo3501g4.f447c;
                    int iMin3 = Math.min(i24, i25);
                    int i26 = c0171aMo3501g3.f448d;
                    int i27 = c0171aMo3501g4.f448d;
                    C0126e c0126e = new C0126e(C0171a.m766b(iMin, iMin2, iMin3, Math.min(i26, i27)), 6, C0171a.m766b(Math.max(c0171aMo3501g3.f445a, c0171aMo3501g4.f445a), Math.max(i22, i23), Math.max(i24, i25), Math.max(i26, i27)));
                    C1338x.m3565g(view, c1300b0, c1332r0M3558c, false);
                    duration.addUpdateListener(new C1334t(c1300b0, c1332r0M3558c, c1332r02, i21, view));
                    duration.addListener(new C1335u(view, c1300b0));
                    ViewTreeObserverOnPreDrawListenerC1307f viewTreeObserverOnPreDrawListenerC1307f = new ViewTreeObserverOnPreDrawListenerC1307f(view, new RunnableC1336v(view, c1300b0, c0126e, duration));
                    view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1307f);
                    view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC1307f);
                    this.f4414b = c1332r0M3558c;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}

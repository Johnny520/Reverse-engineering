package yyds;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.p000ss.android.ugc.awemes.MainActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᲈᛱᛴᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC2581 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f12728 = 2;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Object f12729;

    public ViewTreeObserverOnPreDrawListenerC2581(C1358 c1358) {
        this.f12729 = new WeakReference(c1358);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() throws Throwable {
        int i = this.f12728;
        int i2 = 2;
        Object obj = this.f12729;
        C1213 c1213 = null;
        switch (i) {
            case 0:
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C1358 c1358 = (C1358) ((WeakReference) obj).get();
                if (c1358 != null) {
                    ArrayList arrayList = c1358.f6329;
                    View view = c1358.f6328;
                    if (!arrayList.isEmpty()) {
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int iM2760 = c1358.m2760(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        int iM27602 = c1358.m2760(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if ((iM2760 > 0 || iM2760 == Integer.MIN_VALUE) && (iM27602 > 0 || iM27602 == Integer.MIN_VALUE)) {
                            Iterator it = new ArrayList(arrayList).iterator();
                            while (it.hasNext()) {
                                ((C0397) it.next()).m1148(iM2760, iM27602);
                            }
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(c1358.f6330);
                            }
                            c1358.f6330 = null;
                            arrayList.clear();
                        }
                    }
                }
                break;
            case 1:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C0195 c0195 = (C0195) ((WeakReference) obj).get();
                if (c0195 != null) {
                    ArrayList arrayList2 = c0195.f1157;
                    ImageView imageView = c0195.f1156;
                    if (!arrayList2.isEmpty()) {
                        int paddingRight2 = imageView.getPaddingRight() + imageView.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
                        int iM826 = c0195.m826(imageView.getWidth(), layoutParams3 != null ? layoutParams3.width : 0, paddingRight2);
                        int paddingBottom2 = imageView.getPaddingBottom() + imageView.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
                        int iM8262 = c0195.m826(imageView.getHeight(), layoutParams4 != null ? layoutParams4.height : 0, paddingBottom2);
                        if ((iM826 > 0 || iM826 == Integer.MIN_VALUE) && (iM8262 > 0 || iM8262 == Integer.MIN_VALUE)) {
                            Iterator it2 = new ArrayList(arrayList2).iterator();
                            while (it2.hasNext()) {
                                ((C0397) it2.next()).m1148(iM826, iM8262);
                            }
                            ViewTreeObserver viewTreeObserver2 = imageView.getViewTreeObserver();
                            if (viewTreeObserver2.isAlive()) {
                                viewTreeObserver2.removeOnPreDrawListener(c0195.f1158);
                            }
                            c0195.f1158 = null;
                            arrayList2.clear();
                        }
                    }
                }
                break;
            default:
                MainActivity mainActivity = (MainActivity) obj;
                C1213 c12132 = mainActivity.f482;
                if (c12132 == null) {
                    AbstractC2328.m4341(-1416668765651822L);
                    c12132 = null;
                }
                c12132.getViewTreeObserver().removeOnPreDrawListener(this);
                boolean z = mainActivity.f472 == EnumC0110.f755;
                if (z) {
                    mainActivity.m340();
                } else {
                    mainActivity.m314();
                }
                C1213 c12133 = mainActivity.f482;
                if (c12133 == null) {
                    AbstractC2328.m4341(-1416724600226670L);
                    c12133 = null;
                }
                int childCount = c12133.getChildCount();
                float[] fArr = new float[childCount];
                while (true) {
                    C1213 c12134 = mainActivity.f482;
                    if (i >= childCount) {
                        if (c12134 == null) {
                            AbstractC2328.m4341(-1416836269376366L);
                        } else {
                            c1213 = c12134;
                        }
                        c1213.post(new RunnableC1880(mainActivity, fArr, z, i2));
                    } else {
                        if (c12134 == null) {
                            AbstractC2328.m4341(-1416780434801518L);
                            c12134 = null;
                        }
                        View childAt = c12134.getChildAt(i);
                        childAt.animate().cancel();
                        fArr[i] = childAt.getAlpha();
                        childAt.setAlpha(0.0f);
                        childAt.setTranslationY(mainActivity.m311(z ? 34 : 46));
                        i++;
                    }
                    break;
                }
                break;
        }
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC2581(C0195 c0195) {
        this.f12729 = new WeakReference(c0195);
    }

    public ViewTreeObserverOnPreDrawListenerC2581(MainActivity mainActivity) {
        this.f12729 = mainActivity;
    }
}

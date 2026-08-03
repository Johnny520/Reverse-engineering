package p001A0;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0501a;
import androidx.fragment.app.C0509i;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0504d;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import p006D.AbstractC0080Q;
import p017J.C0212a;
import p017J.ViewOnTouchListenerC0218g;
import p021L.C0245e;
import p037U.AbstractC0355O;
import p037U.AbstractC0369e;
import p037U.AbstractC0370f;
import p037U.AbstractC0390z;
import p037U.C0371g;
import p037U.C0374j;
import p037U.RunnableC0367c;
import p057g.AbstractC0895c0;
import p057g.C0906i;

/* JADX INFO: renamed from: A0.E */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0019E implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f57b;

    public /* synthetic */ RunnableC0019E(int i2, Object obj) {
        this.f56a = i2;
        this.f57b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0906i c0906i;
        int i2 = 1;
        int i3 = 2;
        int i4 = 0;
        Object obj = this.f57b;
        switch (this.f56a) {
            case 0:
                CheckableImageButton checkableImageButton = ((TextInputLayout) obj).f2467c.f122g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 1:
                ViewOnTouchListenerC0218g viewOnTouchListenerC0218g = (ViewOnTouchListenerC0218g) obj;
                if (viewOnTouchListenerC0218g.f459o) {
                    boolean z2 = viewOnTouchListenerC0218g.f457m;
                    C0212a c0212a = viewOnTouchListenerC0218g.f445a;
                    if (z2) {
                        viewOnTouchListenerC0218g.f457m = false;
                        c0212a.getClass();
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c0212a.f439e = jCurrentAnimationTimeMillis;
                        c0212a.f441g = -1L;
                        c0212a.f440f = jCurrentAnimationTimeMillis;
                        c0212a.f442h = 0.5f;
                    }
                    if ((c0212a.f441g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0212a.f441g + ((long) c0212a.f443i)) || !viewOnTouchListenerC0218g.m610e()) {
                        viewOnTouchListenerC0218g.f459o = false;
                        return;
                    }
                    boolean z3 = viewOnTouchListenerC0218g.f458n;
                    View view = viewOnTouchListenerC0218g.f447c;
                    if (z3) {
                        viewOnTouchListenerC0218g.f458n = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        view.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (c0212a.f440f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fM592a = c0212a.m592a(jCurrentAnimationTimeMillis2);
                    long j2 = jCurrentAnimationTimeMillis2 - c0212a.f440f;
                    c0212a.f440f = jCurrentAnimationTimeMillis2;
                    viewOnTouchListenerC0218g.f461q.scrollListBy((int) (j2 * ((fM592a * 4.0f) + ((-4.0f) * fM592a * fM592a)) * c0212a.f438d));
                    Field field = AbstractC0080Q.f219a;
                    view.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                ((C0245e) obj).m681m(0);
                return;
            case 3:
                C0374j c0374j = (C0374j) obj;
                int i5 = c0374j.f821v;
                ValueAnimator valueAnimator = c0374j.f820u;
                if (i5 == 1) {
                    valueAnimator.cancel();
                } else if (i5 != 2) {
                    return;
                }
                c0374j.f821v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 4:
                RecyclerView recyclerView = (RecyclerView) obj;
                AbstractC0390z abstractC0390z = recyclerView.f1544F;
                if (abstractC0390z != null) {
                    C0371g c0371g = (C0371g) abstractC0390z;
                    ArrayList arrayList = c0371g.f785h;
                    boolean z4 = !arrayList.isEmpty();
                    ArrayList arrayList2 = c0371g.f787j;
                    boolean z5 = !arrayList2.isEmpty();
                    ArrayList arrayList3 = c0371g.f788k;
                    boolean z6 = !arrayList3.isEmpty();
                    ArrayList arrayList4 = c0371g.f786i;
                    boolean z7 = !arrayList4.isEmpty();
                    if (z4 || z5 || z7 || z6) {
                        Iterator it = arrayList.iterator();
                        boolean zHasNext = it.hasNext();
                        long j3 = c0371g.f879d;
                        if (zHasNext) {
                            ((AbstractC0355O) it.next()).getClass();
                            throw null;
                        }
                        arrayList.clear();
                        if (z5) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            c0371g.f790m.add(arrayList5);
                            arrayList2.clear();
                            RunnableC0367c runnableC0367c = new RunnableC0367c(c0371g, arrayList5, i4);
                            if (z4) {
                                ((AbstractC0370f) arrayList5.get(0)).getClass();
                                throw null;
                            }
                            runnableC0367c.run();
                        }
                        if (z6) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            c0371g.f791n.add(arrayList6);
                            arrayList3.clear();
                            RunnableC0367c runnableC0367c2 = new RunnableC0367c(c0371g, arrayList6, i2);
                            if (z4) {
                                ((AbstractC0369e) arrayList6.get(0)).getClass();
                                throw null;
                            }
                            runnableC0367c2.run();
                        }
                        if (z7) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            c0371g.f789l.add(arrayList7);
                            arrayList4.clear();
                            RunnableC0367c runnableC0367c3 = new RunnableC0367c(c0371g, arrayList7, i3);
                            if (z4 || z5 || z6) {
                                Math.max(z5 ? c0371g.f880e : 0L, z6 ? c0371g.f881f : 0L);
                                ((AbstractC0355O) arrayList7.get(0)).getClass();
                                Field field2 = AbstractC0080Q.f219a;
                                throw null;
                            }
                            runnableC0367c3.run();
                        }
                    }
                }
                recyclerView.getClass();
                return;
            case 5:
                ((StaggeredGridLayoutManager) obj).m1335c0();
                return;
            case 6:
                ((DialogInterfaceOnCancelListenerC0504d) obj).f1419k.onDismiss(null);
                return;
            case 7:
                ((C0509i) obj).m1242f();
                throw null;
            case 8:
                AbstractC0895c0 abstractC0895c0 = (AbstractC0895c0) obj;
                abstractC0895c0.f3180l = null;
                abstractC0895c0.drawableStateChanged();
                return;
            case 9:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) obj;
                if (searchView$SearchAutoComplete.f1164f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f1164f = false;
                    return;
                }
                return;
            case 10:
                ActionMenuView actionMenuView = ((Toolbar) obj).f1227a;
                if (actionMenuView == null || (c0906i = actionMenuView.f1144s) == null) {
                    return;
                }
                c0906i.m2236f();
                return;
            default:
                C0501a c0501a = (C0501a) obj;
                c0501a.f1414c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c0501a.f1416e;
                C0245e c0245e = bottomSheetBehavior.f2293M;
                if (c0245e != null && c0245e.m674f()) {
                    c0501a.m1226c(c0501a.f1413b);
                    return;
                } else {
                    if (bottomSheetBehavior.f2292L == 2) {
                        bottomSheetBehavior.m1836C(c0501a.f1413b);
                        return;
                    }
                    return;
                }
        }
    }
}

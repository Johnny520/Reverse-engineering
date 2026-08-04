package yyds;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛶᛳᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1310 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final WeakReference f5993;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final Object f5994;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f5995 = 0;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public ViewTreeObserver f5996;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final WeakReference f5997;

    public ViewOnAttachStateChangeListenerC1310(ImageView imageView, C1692 c1692, C1874 c1874) {
        AbstractC2328.m4341(-1080033523958638L);
        AbstractC2328.m4341(-1080072178664302L);
        AbstractC2328.m4341(-1080106538402670L);
        this.f5997 = new WeakReference(imageView);
        this.f5993 = new WeakReference(c1692);
        this.f5994 = new WeakReference(c1874);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m2598(View view, ArrayList arrayList) {
        if (view instanceof C1628) {
            return;
        }
        if (view instanceof ImageView) {
            arrayList.add(view);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                AbstractC2328.m4341(-872109862191982L);
                m2598(childAt, arrayList);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        Object c2658;
        switch (this.f5995) {
            case 0:
                m2601();
                break;
            default:
                try {
                    m2600();
                    c2658 = C2746.f13459;
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                Throwable thM4249 = C2248.m4249(c2658);
                if (thM4249 != null) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-1080175257879406L), thM4249);
                }
                break;
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f5995) {
            case 0:
                AbstractC2328.m4341(-871963833303918L);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                ViewTreeObserver viewTreeObserver2 = this.f5996;
                if (viewTreeObserver2 != viewTreeObserver) {
                    if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                        viewTreeObserver2.removeOnPreDrawListener(this);
                    }
                    this.f5996 = viewTreeObserver;
                    viewTreeObserver.addOnPreDrawListener(this);
                }
                C1628 c1628 = (C1628) this.f5993.get();
                if (c1628 != null) {
                    C1784 c1784 = C1784.f9011;
                    String str = c1628.m3329().f12479;
                    c1784.getClass();
                    c1628.m3329().f12487 = true;
                    c1628.post(new RunnableC2696(c1628, 4, str));
                }
                m2601();
                break;
            default:
                AbstractC2328.m4341(-1080132308206446L);
                ViewTreeObserver viewTreeObserver3 = view.getViewTreeObserver();
                ViewTreeObserver viewTreeObserver4 = this.f5996;
                if (viewTreeObserver4 != viewTreeObserver3) {
                    if (viewTreeObserver4 != null && viewTreeObserver4.isAlive()) {
                        viewTreeObserver4.removeOnPreDrawListener(this);
                    }
                    this.f5996 = viewTreeObserver3;
                    viewTreeObserver3.addOnPreDrawListener(this);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f5995) {
            case 0:
                AbstractC2328.m4341(-871985308140398L);
                ViewTreeObserver viewTreeObserver = this.f5996;
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                this.f5996 = null;
                C1628 c1628 = (C1628) this.f5993.get();
                if (c1628 != null) {
                    C1784.f9011.getClass();
                    C1784.m3557(c1628);
                    c1628.m3329().f12480 = false;
                    c1628.m3329().f12487 = true;
                }
                break;
            default:
                AbstractC2328.m4341(-1080153783042926L);
                ViewTreeObserver viewTreeObserver2 = this.f5996;
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    viewTreeObserver2.removeOnPreDrawListener(this);
                }
                this.f5996 = null;
                break;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public void m2599() {
        ArrayList<Pair> arrayList;
        Map map = (Map) this.f5994;
        AbstractC2328.m4341(-872058322584430L);
        synchronized (map) {
            try {
                Set<Map.Entry> setEntrySet = ((Map) this.f5994).entrySet();
                arrayList = new ArrayList(AbstractC0055.m419(setEntrySet, 10));
                for (Map.Entry entry : setEntrySet) {
                    arrayList.add(new Pair(entry.getKey(), entry.getValue()));
                }
                ((Map) this.f5994).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Pair pair : arrayList) {
            ImageView imageView = (ImageView) pair.component1();
            Integer num = (Integer) pair.component2();
            if (imageView.getImageAlpha() == 0) {
                imageView.setImageAlpha(num.intValue());
            }
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public void m2600() {
        C1692 c1692;
        C1874 c1874;
        ImageView imageView = (ImageView) this.f5997.get();
        if (imageView == null || (c1692 = (C1692) this.f5993.get()) == null || (c1874 = (C1874) ((WeakReference) this.f5994).get()) == null || c1692.getParent() != imageView.getParent()) {
            return;
        }
        C2153.f10615.getClass();
        C2153.m4110(imageView, c1692, c1874);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public void m2601() {
        C1628 c1628;
        View view = (View) this.f5997.get();
        if (view == null || (c1628 = (C1628) this.f5993.get()) == null) {
            return;
        }
        if (!c1628.m3329().f12489 || c1628.getParent() != view.getParent()) {
            m2599();
            c1628.setVisibility(8);
            return;
        }
        ArrayList<ImageView> arrayList = new ArrayList();
        m2598(view, arrayList);
        for (ImageView imageView : arrayList) {
            if (imageView.getImageAlpha() != 0) {
                Map map = (Map) this.f5994;
                AbstractC2328.m4341(-872006782976878L);
                map.put(imageView, Integer.valueOf(imageView.getImageAlpha()));
                imageView.setImageAlpha(0);
            }
        }
        C1784.f9011.getClass();
        C1784.m3549(view, c1628);
    }

    public ViewOnAttachStateChangeListenerC1310(View view, C1628 c1628) {
        AbstractC2328.m4341(-871890818859886L);
        AbstractC2328.m4341(-871929473565550L);
        this.f5997 = new WeakReference(view);
        this.f5993 = new WeakReference(c1628);
        this.f5994 = AbstractC0897.m1993();
    }
}

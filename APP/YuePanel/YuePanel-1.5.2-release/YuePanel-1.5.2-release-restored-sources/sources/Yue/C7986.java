package Yue;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۢۢ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7986 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f23751 = "TransitionManager";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static AbstractC7956 f23752 = new C3501();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static ThreadLocal<WeakReference<C3394<ViewGroup, ArrayList<AbstractC7956>>>> f23753 = new ThreadLocal<>();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static ArrayList<ViewGroup> f23754 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ */
    public C3394<C7238, AbstractC7956> f3162 = new C3394<>();

    /* JADX INFO: renamed from: ۥ۟ */
    public C3394<C7238, C3394<C7238, AbstractC7956>> f3163 = new C3394<>();

    /* JADX INFO: renamed from: Yue.ۥۢۢ۠ۨ$ۥ */
    public static class ViewTreeObserverOnPreDrawListenerC1395 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public AbstractC7956 f23755;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public ViewGroup f23756;

        /* JADX INFO: renamed from: Yue.ۥۢۢ۠ۨ$ۥ$ۥ, reason: contains not printable characters */
        public class C7987 extends C7985 {

            /* JADX INFO: renamed from: ۥ */
            public final /* synthetic */ C3394 f3164;

            public C7987(C3394 c3394) {
                this.f3164 = c3394;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: V */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // Yue.C7985, Yue.AbstractC7956.InterfaceC7964
            public void onTransitionEnd(@InterfaceC6391 AbstractC7956 abstractC7956) {
                ((ArrayList) this.f3164.get(ViewTreeObserverOnPreDrawListenerC1395.this.f23756)).remove(abstractC7956);
                abstractC7956.removeListener(this);
            }
        }

        public ViewTreeObserverOnPreDrawListenerC1395(AbstractC7956 abstractC7956, ViewGroup viewGroup) {
            this.f23755 = abstractC7956;
            this.f23756 = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m3998();
            if (!C7986.f23754.remove(this.f23756)) {
                return true;
            }
            C3394<ViewGroup, ArrayList<AbstractC7956>> c3394M25167 = C7986.m25167();
            ArrayList<AbstractC7956> arrayList = c3394M25167.get(this.f23756);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                c3394M25167.put(this.f23756, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f23755);
            this.f23755.addListener(new C7987(c3394M25167));
            this.f23755.captureValues(this.f23756, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC7956) it.next()).resume(this.f23756);
                }
            }
            this.f23755.playTransition(this.f23756);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m3998();
            C7986.f23754.remove(this.f23756);
            ArrayList<AbstractC7956> arrayList = C7986.m25167().get(this.f23756);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<AbstractC7956> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().resume(this.f23756);
                }
            }
            this.f23755.clearValues(true);
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m3998() {
            this.f23756.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f23756.removeOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static void m3996(@InterfaceC6391 ViewGroup viewGroup) {
        m3997(viewGroup, null);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m3997(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6490 AbstractC7956 abstractC7956) {
        if (f23754.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f23754.add(viewGroup);
        if (abstractC7956 == null) {
            abstractC7956 = f23752;
        }
        AbstractC7956 abstractC7956Mo25123clone = abstractC7956.mo25123clone();
        m25171(viewGroup, abstractC7956Mo25123clone);
        C7238.m22668(viewGroup, null);
        m25170(viewGroup, abstractC7956Mo25123clone);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m25163(C7238 c7238, AbstractC7956 abstractC7956) {
        ViewGroup viewGroupM22669 = c7238.m22669();
        if (f23754.contains(viewGroupM22669)) {
            return;
        }
        C7238 c7238M22666 = C7238.m22666(viewGroupM22669);
        if (abstractC7956 == null) {
            if (c7238M22666 != null) {
                c7238M22666.m3525();
            }
            c7238.m3524();
            return;
        }
        f23754.add(viewGroupM22669);
        AbstractC7956 abstractC7956Mo25123clone = abstractC7956.mo25123clone();
        if (c7238M22666 != null && c7238M22666.m22670()) {
            abstractC7956Mo25123clone.setCanRemoveViews(true);
        }
        m25171(viewGroupM22669, abstractC7956Mo25123clone);
        c7238.m3524();
        m25170(viewGroupM22669, abstractC7956Mo25123clone);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static InterfaceC7990 m25164(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 AbstractC7956 abstractC7956) {
        if (f23754.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!abstractC7956.isSeekingSupported()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        f23754.add(viewGroup);
        AbstractC7956 abstractC7956Mo25123clone = abstractC7956.mo25123clone();
        C7991 c7991 = new C7991();
        c7991.m25181(abstractC7956Mo25123clone);
        m25171(viewGroup, c7991);
        C7238.m22668(viewGroup, null);
        m25170(viewGroup, c7991);
        viewGroup.invalidate();
        return c7991.createSeekController();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static InterfaceC7990 m25165(@InterfaceC6391 C7238 c7238, @InterfaceC6391 AbstractC7956 abstractC7956) {
        ViewGroup viewGroupM22669 = c7238.m22669();
        if (!abstractC7956.isSeekingSupported()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        if (f23754.contains(viewGroupM22669)) {
            return null;
        }
        C7238 c7238M22666 = C7238.m22666(viewGroupM22669);
        if (!viewGroupM22669.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            if (c7238M22666 != null) {
                c7238M22666.m3525();
            }
            c7238.m3524();
            return null;
        }
        f23754.add(viewGroupM22669);
        AbstractC7956 abstractC7956Mo25123clone = abstractC7956.mo25123clone();
        C7991 c7991 = new C7991();
        c7991.m25181(abstractC7956Mo25123clone);
        if (c7238M22666 != null && c7238M22666.m22670()) {
            c7991.setCanRemoveViews(true);
        }
        m25171(viewGroupM22669, c7991);
        c7238.m3524();
        m25170(viewGroupM22669, c7991);
        return c7991.createSeekController();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m25166(@InterfaceC6490 ViewGroup viewGroup) {
        f23754.remove(viewGroup);
        ArrayList<AbstractC7956> arrayList = m25167().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((AbstractC7956) arrayList2.get(size)).forceToEnd(viewGroup);
        }
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static C3394<ViewGroup, ArrayList<AbstractC7956>> m25167() {
        C3394<ViewGroup, ArrayList<AbstractC7956>> c3394;
        WeakReference<C3394<ViewGroup, ArrayList<AbstractC7956>>> weakReference = f23753.get();
        if (weakReference != null && (c3394 = weakReference.get()) != null) {
            return c3394;
        }
        C3394<ViewGroup, ArrayList<AbstractC7956>> c33942 = new C3394<>();
        f23753.set(new WeakReference<>(c33942));
        return c33942;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m25168(@InterfaceC6391 C7238 c7238) {
        m25163(c7238, f23752);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m25169(@InterfaceC6391 C7238 c7238, @InterfaceC6490 AbstractC7956 abstractC7956) {
        m25163(c7238, abstractC7956);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m25170(ViewGroup viewGroup, AbstractC7956 abstractC7956) {
        if (abstractC7956 == null || viewGroup == null) {
            return;
        }
        ViewTreeObserverOnPreDrawListenerC1395 viewTreeObserverOnPreDrawListenerC1395 = new ViewTreeObserverOnPreDrawListenerC1395(abstractC7956, viewGroup);
        viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC1395);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1395);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m25171(ViewGroup viewGroup, AbstractC7956 abstractC7956) {
        ArrayList<AbstractC7956> arrayList = m25167().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractC7956> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().pause(viewGroup);
            }
        }
        if (abstractC7956 != null) {
            abstractC7956.captureValues(viewGroup, true);
        }
        C7238 c7238M22666 = C7238.m22666(viewGroup);
        if (c7238M22666 != null) {
            c7238M22666.m3525();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final AbstractC7956 m25172(C7238 c7238) {
        C3394<C7238, AbstractC7956> c3394;
        AbstractC7956 abstractC7956;
        C7238 c7238M22666 = C7238.m22666(c7238.m22669());
        if (c7238M22666 != null && (c3394 = this.f3163.get(c7238)) != null && (abstractC7956 = c3394.get(c7238M22666)) != null) {
            return abstractC7956;
        }
        AbstractC7956 abstractC79562 = this.f3162.get(c7238);
        return abstractC79562 != null ? abstractC79562 : f23752;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m25173(@InterfaceC6391 C7238 c7238, @InterfaceC6391 C7238 c72382, @InterfaceC6490 AbstractC7956 abstractC7956) {
        C3394<C7238, AbstractC7956> c3394 = this.f3163.get(c72382);
        if (c3394 == null) {
            c3394 = new C3394<>();
            this.f3163.put(c72382, c3394);
        }
        c3394.put(c7238, abstractC7956);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m25174(@InterfaceC6391 C7238 c7238, @InterfaceC6490 AbstractC7956 abstractC7956) {
        this.f3162.put(c7238, abstractC7956);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m25175(@InterfaceC6391 C7238 c7238) {
        m25163(c7238, m25172(c7238));
    }
}

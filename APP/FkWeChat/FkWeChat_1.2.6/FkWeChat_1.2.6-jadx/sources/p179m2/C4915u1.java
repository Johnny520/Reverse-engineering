package p179m2;

import ae.C0306e;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p117i.AbstractC3044c1;
import p117i.AbstractC3050e1;
import p117i.AbstractC3090v0;
import p117i.C3074n0;
import p117i.C3082r0;
import p117i.C3084s0;
import p235q1.AbstractC6211k;
import p235q1.AbstractC6222p0;
import p235q1.C6203g;
import p250r1.C6457g;
import p265s1.AbstractC7050a3;

/* JADX INFO: renamed from: m2.u1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4915u1 {

    /* JADX INFO: renamed from: f */
    public static final b f14862f = new b(null);

    /* JADX INFO: renamed from: g */
    public static final int f14863g = 8;

    /* JADX INFO: renamed from: h */
    public static final a f14864h = new a();

    /* JADX INFO: renamed from: a */
    public final Rect f14865a = new Rect();

    /* JADX INFO: renamed from: b */
    public final Rect f14866b = new Rect();

    /* JADX INFO: renamed from: c */
    public final Rect f14867c = new Rect();

    /* JADX INFO: renamed from: d */
    public final c f14868d = new c(new c.a() { // from class: m2.t1
        @Override // p179m2.C4915u1.c.a
        /* JADX INFO: renamed from: a */
        public final View mo19695a(View view, View view2) {
            return C4915u1.m19825a(this.f14759a, view, view2);
        }
    });

    /* JADX INFO: renamed from: e */
    public final ArrayList f14869e = new ArrayList();

    /* JADX INFO: renamed from: m2.u1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4915u1 initialValue() {
            return new C4915u1();
        }
    }

    /* JADX INFO: renamed from: m2.u1$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements Comparator {

        /* JADX INFO: renamed from: a */
        public final a f14870a;

        /* JADX INFO: renamed from: b */
        public final C3082r0 f14871b = AbstractC3044c1.m11262b();

        /* JADX INFO: renamed from: c */
        public final C3084s0 f14872c = AbstractC3050e1.m11284b();

        /* JADX INFO: renamed from: d */
        public final C3082r0 f14873d = AbstractC3044c1.m11262b();

        /* JADX INFO: renamed from: e */
        public final C3074n0 f14874e = AbstractC3090v0.m11576b();

        /* JADX INFO: renamed from: f */
        public View f14875f;

        /* JADX INFO: renamed from: m2.u1$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public interface a {
            /* JADX INFO: renamed from: a */
            View mo19695a(View view, View view2);
        }

        public c(a aVar) {
            this.f14870a = aVar;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            if (view == view2) {
                return 0;
            }
            if (view == null) {
                return -1;
            }
            if (view2 == null) {
                return 1;
            }
            View view3 = (View) this.f14873d.m11238e(view);
            View view4 = (View) this.f14873d.m11238e(view2);
            if (view3 == view4 && view3 != null) {
                if (view == view3) {
                    return -1;
                }
                return (view2 == view3 || this.f14871b.m11238e(view) == null) ? 1 : -1;
            }
            if (view3 != null) {
                view = view3;
            }
            if (view4 != null) {
                view2 = view4;
            }
            if (view3 == null && view4 == null) {
                return 0;
            }
            return this.f14874e.m11566c(view) < this.f14874e.m11566c(view2) ? -1 : 1;
        }

        /* JADX INFO: renamed from: b */
        public final void m19843b() {
            this.f14875f = null;
            this.f14873d.m11516k();
            this.f14872c.m11541m();
            this.f14874e.m11436j();
            this.f14871b.m11516k();
        }

        /* JADX INFO: renamed from: c */
        public final void m19844c(ArrayList arrayList, View view) {
            this.f14875f = view;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f14874e.m11447u((View) arrayList.get(i10), i10);
            }
            int size2 = arrayList.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i11 = size2 - 1;
                    View view2 = (View) arrayList.get(size2);
                    View viewMo19695a = this.f14870a.mo19695a(view, view2);
                    if (viewMo19695a != null && this.f14874e.m11564a(viewMo19695a)) {
                        this.f14871b.m11529x(view2, viewMo19695a);
                        this.f14872c.m11536h(viewMo19695a);
                    }
                    if (i11 < 0) {
                        break;
                    } else {
                        size2 = i11;
                    }
                }
            }
            int size3 = arrayList.size() - 1;
            if (size3 < 0) {
                return;
            }
            while (true) {
                int i12 = size3 - 1;
                View view3 = (View) arrayList.get(size3);
                if (((View) this.f14871b.m11238e(view3)) != null && !this.f14872c.m11268a(view3)) {
                    m19845d(view3);
                }
                if (i12 < 0) {
                    return;
                } else {
                    size3 = i12;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m19845d(View view) {
            View view2 = view;
            while (view != null) {
                View view3 = (View) this.f14873d.m11238e(view);
                if (view3 != null) {
                    if (view3 == view2) {
                        return;
                    }
                    view = view2;
                    view2 = view3;
                }
                this.f14873d.m11529x(view, view2);
                view = (View) this.f14871b.m11238e(view);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static View m19825a(C4915u1 c4915u1, View view, View view2) {
        if (c4915u1.m19837m(view2.getNextFocusForwardId())) {
            return AbstractC4920v1.m19887e(view2, view, 2);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final View m19827c(ViewGroup viewGroup, Rect rect, int i10) {
        ViewGroup viewGroupM19834j = m19834j(viewGroup, null);
        ArrayList arrayList = this.f14869e;
        try {
            arrayList.clear();
            AbstractC4920v1.m19886d(viewGroupM19834j, arrayList, i10);
            if (arrayList.isEmpty()) {
                arrayList.clear();
                return null;
            }
            View viewM19829e = m19829e(viewGroupM19834j, null, rect, i10, arrayList);
            arrayList.clear();
            return viewM19829e;
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final View m19828d(ViewGroup viewGroup, View view, int i10) {
        ViewGroup viewGroupM19834j = m19834j(viewGroup, view);
        View viewM19833i = m19833i(viewGroupM19834j, view, i10);
        if (viewM19833i != null) {
            return viewM19833i;
        }
        ArrayList arrayList = this.f14869e;
        try {
            arrayList.clear();
            AbstractC4920v1.m19886d(viewGroupM19834j, arrayList, i10);
            if (!arrayList.isEmpty()) {
                viewM19833i = m19829e(viewGroupM19834j, view, null, i10, arrayList);
            }
            arrayList.clear();
            return viewM19833i;
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final View m19829e(ViewGroup viewGroup, View view, Rect rect, int i10, ArrayList arrayList) {
        Rect rect2 = this.f14865a;
        if (view != null) {
            view.getFocusedRect(rect2);
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        } else if (rect != null) {
            rect2.set(rect);
        } else if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 17 || i10 == 33) {
                    m19838n(viewGroup, rect2);
                } else if (i10 == 66 || i10 == 130) {
                    m19839o(viewGroup, rect2);
                }
            } else if (viewGroup.getLayoutDirection() == 1) {
                m19838n(viewGroup, rect2);
            } else {
                m19839o(viewGroup, rect2);
            }
        } else if (viewGroup.getLayoutDirection() == 1) {
            m19839o(viewGroup, rect2);
        } else {
            m19838n(viewGroup, rect2);
        }
        if (i10 == 1 || i10 == 2) {
            return m19832h(arrayList, viewGroup, view, i10);
        }
        if (i10 == 17 || i10 == 33 || i10 == 66 || i10 == 130) {
            return m19831g(viewGroup, view, rect2, arrayList, i10);
        }
        C0306e.m922a("Unknown direction: ", i10);
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final View m19830f(ViewGroup viewGroup, Rect rect, int i10) {
        this.f14865a.set(rect);
        return m19827c(viewGroup, this.f14865a, i10);
    }

    /* JADX INFO: renamed from: g */
    public final View m19831g(ViewGroup viewGroup, View view, Rect rect, ArrayList arrayList, int i10) {
        this.f14866b.set(rect);
        if (i10 == 17) {
            this.f14866b.offset(rect.width() + 1, 0);
        } else if (i10 == 33) {
            this.f14866b.offset(0, rect.height() + 1);
        } else if (i10 == 66) {
            this.f14866b.offset((-rect.width()) - 1, 0);
        } else if (i10 == 130) {
            this.f14866b.offset(0, (-rect.height()) - 1);
        }
        int size = arrayList.size();
        View view2 = null;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = (View) arrayList.get(i11);
            if (!AbstractC1061t.m3842c(view3, view) && !AbstractC1061t.m3842c(view3, viewGroup)) {
                view3.getFocusedRect(this.f14867c);
                viewGroup.offsetDescendantRectToMyCoords(view3, this.f14867c);
                C6457g c6457gM27757e = AbstractC7050a3.m27757e(this.f14867c);
                C6457g c6457gM27757e2 = AbstractC7050a3.m27757e(this.f14866b);
                C6457g c6457gM27757e3 = AbstractC7050a3.m27757e(rect);
                C6203g c6203gM24424d = AbstractC6211k.m24424d(i10);
                if (AbstractC6222p0.m24479m(c6457gM27757e, c6457gM27757e2, c6457gM27757e3, c6203gM24424d != null ? c6203gM24424d.m24377o() : C6203g.f19254b.m24382e())) {
                    this.f14866b.set(this.f14867c);
                    view2 = view3;
                }
            }
        }
        return view2;
    }

    /* JADX INFO: renamed from: h */
    public final View m19832h(ArrayList arrayList, ViewGroup viewGroup, View view, int i10) {
        ArrayList arrayList2;
        try {
            this.f14868d.m19844c(arrayList, viewGroup);
            Collections.sort(arrayList, this.f14868d);
            this.f14868d.m19843b();
            int size = arrayList.size();
            View viewM19836l = null;
            if (size < 2) {
                return null;
            }
            if (i10 == 1) {
                arrayList2 = arrayList;
                viewM19836l = m19836l(view, arrayList2, size);
            } else if (i10 == 2) {
                arrayList2 = arrayList;
                viewM19836l = m19835k(view, arrayList2, size);
            } else if (i10 == 17 || i10 == 33 || i10 == 66 || i10 == 130) {
                arrayList2 = arrayList;
                viewM19836l = m19831g(viewGroup, view, this.f14865a, arrayList2, i10);
            } else {
                arrayList2 = arrayList;
            }
            return viewM19836l == null ? (View) arrayList2.get(size - 1) : viewM19836l;
        } catch (Throwable th) {
            this.f14868d.m19843b();
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public final View m19833i(ViewGroup viewGroup, View view, int i10) {
        View viewM19887e = AbstractC4920v1.m19887e(view, viewGroup, i10);
        boolean z10 = true;
        View viewM19887e2 = viewM19887e;
        while (viewM19887e != null) {
            if (viewM19887e.isFocusable() && viewM19887e.getVisibility() == 0 && (!viewM19887e.isInTouchMode() || viewM19887e.isFocusableInTouchMode())) {
                return viewM19887e;
            }
            viewM19887e = AbstractC4920v1.m19887e(viewM19887e, viewGroup, i10);
            boolean z11 = !z10;
            if (!z10) {
                viewM19887e2 = viewM19887e2 != null ? AbstractC4920v1.m19887e(viewM19887e2, viewGroup, i10) : null;
                if (viewM19887e2 == viewM19887e) {
                    break;
                }
            }
            z10 = z11;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final ViewGroup m19834j(ViewGroup viewGroup, View view) {
        if (view != null && view != viewGroup) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent == viewGroup) {
                    if (viewGroup2 == null) {
                        break;
                    }
                    return viewGroup2;
                }
                ViewGroup viewGroup3 = (ViewGroup) parent;
                if (viewGroup3.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                    viewGroup2 = viewGroup3;
                }
                parent = viewGroup3.getParent();
            }
        }
        return viewGroup;
    }

    /* JADX INFO: renamed from: k */
    public final View m19835k(View view, ArrayList arrayList, int i10) {
        int iLastIndexOf;
        int i11;
        if (i10 < 2) {
            return null;
        }
        return (view == null || (iLastIndexOf = arrayList.lastIndexOf(view)) < 0 || (i11 = iLastIndexOf + 1) >= i10) ? (View) arrayList.get(0) : (View) arrayList.get(i11);
    }

    /* JADX INFO: renamed from: l */
    public final View m19836l(View view, ArrayList arrayList, int i10) {
        int iIndexOf;
        if (i10 < 2) {
            return null;
        }
        return (view == null || (iIndexOf = arrayList.indexOf(view)) <= 0) ? (View) arrayList.get(i10 - 1) : (View) arrayList.get(iIndexOf - 1);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m19837m(int i10) {
        return (i10 == 0 || i10 == -1) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public final void m19838n(ViewGroup viewGroup, Rect rect) {
        int scrollY = viewGroup.getScrollY() + viewGroup.getHeight();
        int scrollX = viewGroup.getScrollX() + viewGroup.getWidth();
        rect.set(scrollX, scrollY, scrollX, scrollY);
    }

    /* JADX INFO: renamed from: o */
    public final void m19839o(ViewGroup viewGroup, Rect rect) {
        int scrollY = viewGroup.getScrollY();
        int scrollX = viewGroup.getScrollX();
        rect.set(scrollX, scrollY, scrollX, scrollY);
    }

    /* JADX INFO: renamed from: m2.u1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        public /* synthetic */ b(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C4915u1 m19841a() {
            Object obj = C4915u1.f14864h.get();
            obj.getClass();
            return (C4915u1) obj;
        }

        public b() {
        }
    }
}

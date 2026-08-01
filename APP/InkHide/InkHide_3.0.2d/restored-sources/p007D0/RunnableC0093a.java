package p007D0;

import android.app.Activity;
import android.graphics.Bitmap;
import android.util.LruCache;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.C0022W;
import p001A0.C0035h;
import p004C.C0066j;
import p009E0.C0104d;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p069i.C0709q1;
import p070i0.AbstractC0731a;
import p079n0.C0773a;
import p086r0.C0864P0;
import p086r0.C0881Y0;
import p088s0.C0983e;
import p088s0.C0988j;
import p088s0.C0990l;
import p094v0.C1026a;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1129l;
import p102z0.C1124g;

/* JADX INFO: renamed from: D0.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0093a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f366a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f367b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f368c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f369d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f370e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0093a(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.f366a = i2;
        this.f367b = obj;
        this.f368c = obj2;
        this.f369d = obj3;
        this.f370e = obj4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IOException, InvocationTargetException {
        Object c0104d;
        switch (this.f366a) {
            case 0:
                C0094b c0094b = new C0094b((String) this.f367b, "GET", (Map) this.f368c, null, 56);
                C0066j c0066j = new C0066j(2);
                c0066j.f312c = c0094b;
                C0095c c0095cM151w = c0066j.m151w();
                C1026a c1026a = (C1026a) this.f369d;
                c1026a.mo248a(0, c0095cM151w);
                if (c0095cM151w.f380d != null) {
                    int i2 = 0;
                    while (i2 < 1) {
                        c0095cM151w = c0066j.m151w();
                        i2++;
                        c1026a.mo248a(Integer.valueOf(i2), c0095cM151w);
                        if (c0095cM151w.f380d == null) {
                        }
                    }
                }
                ((C0035h) this.f370e).mo8c(c0095cM151w);
                break;
            case 1:
                LruCache lruCache = AbstractC1129l.f3803a;
                if (AbstractC0223g.m414a(AbstractC1129l.m2454d((String) this.f367b), (String) this.f368c)) {
                    ImageView imageView = (ImageView) this.f369d;
                    imageView.setImageBitmap((Bitmap) this.f370e);
                    imageView.invalidate();
                }
                break;
            case 2:
                C0881Y0 c0881y0 = (C0881Y0) this.f367b;
                Activity activity = (Activity) this.f368c;
                Class cls = (Class) this.f369d;
                Class cls2 = (Class) this.f370e;
                C0022W c0022w = c0881y0.f3050n;
                if (c0022w == null || c0022w.f178p.isEmpty() || c0022w.f179q.isEmpty()) {
                    boolean z2 = AbstractC1126i.f3786a;
                    if (C1124g.m2417H() || !C1124g.m2410A()) {
                        AbstractC0731a.m1387d("self sns detail bind skipped", AbstractC0174d.m355k("enabled=", C1124g.m2410A()), AbstractC0174d.m355k("promptDisabled=", C1124g.m2417H()));
                    } else {
                        Window window = activity.getWindow();
                        ListView listViewM1785p = C0881Y0.m1785p(window != null ? window.getDecorView() : null);
                        if (listViewM1785p == null) {
                            AbstractC0731a.m1387d("self sns detail bind missing list");
                        } else {
                            ListAdapter adapter = listViewM1785p.getAdapter();
                            if (adapter == null) {
                                AbstractC0731a.m1387d("self sns detail bind missing adapter", listViewM1785p.getClass().getName());
                            } else {
                                AbstractC0731a.m1387d("self sns detail bind start", listViewM1785p.getClass().getName(), adapter.getClass().getName(), AbstractC0174d.m351g(listViewM1785p.getChildCount(), "children="));
                                int firstVisiblePosition = listViewM1785p.getFirstVisiblePosition();
                                int childCount = listViewM1785p.getChildCount();
                                for (int i3 = 0; i3 < childCount; i3++) {
                                    View childAt = listViewM1785p.getChildAt(i3);
                                    if (childAt != null) {
                                        int i4 = firstVisiblePosition + i3;
                                        try {
                                            c0104d = adapter.getItem(i4);
                                        } catch (Throwable th) {
                                            c0104d = new C0104d(th);
                                        }
                                        if (c0104d instanceof C0104d) {
                                            c0104d = null;
                                        }
                                        Object objM1794I = c0881y0.m1794I(activity, cls);
                                        boolean z3 = true;
                                        C0864P0 c0864p0M1795J = c0881y0.m1795J(activity, adapter, childAt, AbstractC0120h.m255c0(new Object[]{objM1794I, c0104d}), cls, cls2);
                                        if (c0864p0M1795J != null) {
                                            Map map = c0881y0.f3045i;
                                            AbstractC0223g.m417d(map, "selfSnsDetailMenuContexts");
                                            map.put(activity, c0864p0M1795J);
                                            ArrayList arrayList = new ArrayList();
                                            C0881Y0.m1778e(0, childAt, arrayList);
                                            List<View> listM277s0 = AbstractC0123k.m277s0(AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList)), 16);
                                            AbstractC0731a.m1387d("self sns detail context resolved", AbstractC0174d.m351g(i4, "position="), "keys=".concat(AbstractC0123k.m271m0(c0864p0M1795J.f2974c, ",", null, null, null, 62)), AbstractC0174d.m351g(listM277s0.size(), "targets="));
                                            for (View view : listM277s0) {
                                                Map map2 = c0881y0.f3044h;
                                                AbstractC0223g.m417d(map2, "selfSnsDetailLongClickBindings");
                                                map2.put(view, c0864p0M1795J);
                                                view.setLongClickable(z3);
                                                view.setOnLongClickListener(c0881y0.f3046j);
                                                z3 = true;
                                            }
                                        } else {
                                            AbstractC0731a.m1387d("self sns detail context unresolved", AbstractC0174d.m351g(i4, "position="), "snsInfo=".concat(objM1794I != null ? objM1794I.getClass().getName() : "null"), "item=".concat(c0104d != null ? c0104d.getClass().getName() : "null"));
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            case 3:
                C0709q1 c0709q1 = (C0709q1) this.f368c;
                if (!((AtomicBoolean) c0709q1.f2401g).get()) {
                    Activity activity2 = (Activity) c0709q1.f2396b;
                    if (!activity2.isFinishing() && !activity2.isDestroyed()) {
                        C0983e c0983e = (C0983e) this.f369d;
                        if (AbstractC0223g.m414a(c0983e.f3519c.getTag(), (String) this.f367b)) {
                            ImageView imageView2 = c0983e.f3520d;
                            imageView2.setImageBitmap((Bitmap) this.f370e);
                            imageView2.setVisibility(0);
                            c0983e.f3521e.setVisibility(8);
                        }
                        break;
                    }
                }
                break;
            default:
                C0990l c0990l = (C0990l) this.f368c;
                if (!c0990l.f3555h.get()) {
                    Activity activity3 = c0990l.f3548a;
                    if (!activity3.isFinishing() && !activity3.isDestroyed()) {
                        C0988j c0988j = (C0988j) this.f369d;
                        if (AbstractC0223g.m414a(c0988j.f3540c.getTag(), (String) this.f367b)) {
                            ImageView imageView3 = c0988j.f3541d;
                            imageView3.setImageBitmap((Bitmap) this.f370e);
                            imageView3.setVisibility(0);
                            c0988j.f3542e.setVisibility(8);
                        }
                        break;
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ RunnableC0093a(Object obj, C0773a c0773a, String str, Bitmap bitmap, int i2) {
        this.f366a = i2;
        this.f368c = obj;
        this.f369d = c0773a;
        this.f367b = str;
        this.f370e = bitmap;
    }
}

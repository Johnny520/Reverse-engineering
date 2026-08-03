package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import io.sentry.InterfaceC1651Z;
import io.sentry.android.replay.capture.AbstractC1767e;
import io.sentry.android.replay.capture.AbstractC1775m;
import io.sentry.android.replay.capture.C1770h;
import io.sentry.android.replay.capture.C1773k;
import io.sentry.android.replay.capture.C1779q;
import io.sentry.android.replay.util.InterfaceC1809i;
import io.sentry.android.replay.viewhierarchy.AbstractC1820f;
import io.sentry.android.replay.viewhierarchy.C1818d;
import io.sentry.android.replay.viewhierarchy.C1819e;
import io.sentry.config.AbstractC1856a;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC0073Bn;
import p000.C0208Et;
import p000.C0829TC;
import p000.C1514ht;
import p000.InterfaceC1416fj;

/* JADX INFO: renamed from: io.sentry.android.replay.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1799t extends AbstractC0073Bn implements InterfaceC1416fj {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f6523b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f6524c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f6525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1799t(ViewTreeObserverOnDrawListenerC1810v viewTreeObserverOnDrawListenerC1810v, ArrayList arrayList, Canvas canvas) {
        super(1);
        this.f6523b = 0;
        this.f6524c = viewTreeObserverOnDrawListenerC1810v;
        this.f6525d = canvas;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Dn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [Dn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [Dn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [Dn, java.lang.Object] */
    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object obj) throws InterruptedException {
        C0208Et c0208Et;
        Integer numMo3592c;
        List listSingletonList;
        switch (this.f6523b) {
            case 0:
                AbstractC1820f abstractC1820f = (AbstractC1820f) obj;
                ViewTreeObserverOnDrawListenerC1810v viewTreeObserverOnDrawListenerC1810v = (ViewTreeObserverOnDrawListenerC1810v) this.f6524c;
                ?? r3 = viewTreeObserverOnDrawListenerC1810v.f6547g;
                Rect rect = abstractC1820f.f6587e;
                if (abstractC1820f.f6586d && abstractC1820f.f6583a > 0 && abstractC1820f.f6584b > 0) {
                    if (rect != null) {
                        int i = 1;
                        int i2 = 0;
                        if (abstractC1820f instanceof C1818d) {
                            List listSingletonList2 = Collections.singletonList(rect);
                            Bitmap bitmap = viewTreeObserverOnDrawListenerC1810v.f6549i;
                            Rect rect2 = new Rect(rect);
                            RectF rectF = new RectF(rect2);
                            ((Matrix) viewTreeObserverOnDrawListenerC1810v.f6551k.getValue()).mapRect(rectF);
                            rectF.round(rect2);
                            ((Canvas) viewTreeObserverOnDrawListenerC1810v.f6550j.getValue()).drawBitmap(bitmap, rect2, new Rect(0, 0, 1, 1), (Paint) null);
                            c0208Et = new C0208Et(listSingletonList2, Integer.valueOf(((Bitmap) viewTreeObserverOnDrawListenerC1810v.f6548h.getValue()).getPixel(0, 0)));
                        } else if (abstractC1820f instanceof C1819e) {
                            C1819e c1819e = (C1819e) abstractC1820f;
                            InterfaceC1809i interfaceC1809i = c1819e.f6579g;
                            int iIntValue = ((interfaceC1809i == null || (numMo3592c = interfaceC1809i.mo3592c()) == null) && (numMo3592c = c1819e.f6580h) == null) ? -16777216 : numMo3592c.intValue();
                            int i3 = c1819e.f6581i;
                            int i4 = c1819e.f6582j;
                            if (interfaceC1809i == null) {
                                listSingletonList = Collections.singletonList(rect);
                            } else {
                                ArrayList arrayList = new ArrayList();
                                int iMo3591b = interfaceC1809i.mo3591b();
                                int i5 = 0;
                                while (i5 < iMo3591b) {
                                    int iMo3595f = (int) interfaceC1809i.mo3595f(i5, interfaceC1809i.mo3590a(i5));
                                    int iMo3596g = interfaceC1809i.mo3596g(i5);
                                    int iMo3593d = interfaceC1809i.mo3593d(i5);
                                    int iMo3595f2 = (int) interfaceC1809i.mo3595f(i5, (iMo3593d - iMo3596g) + (iMo3596g > 0 ? i : i2));
                                    if (iMo3595f2 == 0 && iMo3593d > 0) {
                                        iMo3595f2 = ((int) interfaceC1809i.mo3595f(i5, iMo3593d - 1)) + i;
                                    }
                                    int iMo3594e = interfaceC1809i.mo3594e(i5);
                                    int iMo3597h = interfaceC1809i.mo3597h(i5);
                                    Rect rect3 = new Rect();
                                    int i6 = rect.left + i3 + iMo3595f;
                                    rect3.left = i6;
                                    rect3.right = (iMo3595f2 - iMo3595f) + i6;
                                    int i7 = rect.top + i4 + iMo3594e;
                                    rect3.top = i7;
                                    rect3.bottom = (iMo3597h - iMo3594e) + i7;
                                    arrayList.add(rect3);
                                    i5++;
                                    i = 1;
                                    i2 = 0;
                                }
                                listSingletonList = arrayList;
                            }
                            c0208Et = new C0208Et(listSingletonList, Integer.valueOf(iIntValue));
                        } else {
                            c0208Et = new C0208Et(Collections.singletonList(rect), -16777216);
                        }
                        List list = (List) c0208Et.f613a;
                        ((Paint) r3.getValue()).setColor(((Number) c0208Et.f614b).intValue());
                        Canvas canvas = (Canvas) this.f6525d;
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            canvas.drawRoundRect(new RectF((Rect) it.next()), 10.0f, 10.0f, (Paint) r3.getValue());
                        }
                        viewTreeObserverOnDrawListenerC1810v.f6542b.getReplayController().getClass();
                    }
                }
                break;
            case 1:
                AbstractC1775m abstractC1775m = (AbstractC1775m) obj;
                C1770h c1770h = (C1770h) this.f6524c;
                ArrayList arrayList2 = c1770h.f6458v;
                InterfaceC1651Z interfaceC1651Z = c1770h.f6455s;
                C1773k c1773k = (C1773k) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
                while (c1773k != null) {
                    C1773k.m3966a(c1773k, interfaceC1651Z);
                    c1773k = (C1773k) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
                    Thread.sleep(100L);
                }
                if (abstractC1775m instanceof C1773k) {
                    C1773k c1773k2 = (C1773k) abstractC1775m;
                    C1773k.m3966a(c1773k2, interfaceC1651Z);
                    ((C1514ht) this.f6525d).mo90g(c1773k2.f6459a.f7285u);
                }
                break;
            default:
                AbstractC1775m abstractC1775m2 = (AbstractC1775m) obj;
                C1779q c1779q = (C1779q) this.f6524c;
                if (abstractC1775m2 instanceof C1773k) {
                    C1773k.m3966a((C1773k) abstractC1775m2, c1779q.f6469s);
                }
                c1779q.m3957l(-1);
                AbstractC1856a.m4060f((File) this.f6525d);
                break;
        }
        return C0829TC.f2620a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1799t(AbstractC1767e abstractC1767e, Serializable serializable, int i) {
        super(1);
        this.f6523b = i;
        this.f6524c = abstractC1767e;
        this.f6525d = serializable;
    }
}

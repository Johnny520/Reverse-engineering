package p001A0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Trace;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.emoji2.text.C0492q;
import androidx.fragment.app.C0501a;
import androidx.lifecycle.C0512A;
import androidx.lifecycle.C0543t;
import androidx.lifecycle.EnumC0535l;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.AbstractC0727e;
import java.nio.MappedByteBuffer;
import p000A.C0011l;
import p007D0.AbstractC0141g;
import p007D0.C0146l;
import p021L.C0245e;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p043Y.C0463v;
import p050c0.C0580D0;
import p050c0.C0590G1;
import p050c0.C0599J1;
import p050c0.RunnableC0705w0;
import p052d0.C0758s;
import p056f0.AbstractC0805P;
import p056f0.C0830i;
import p056f0.DialogC0823e;
import p085v.AbstractC1106g;
import p089x0.C1121e;
import p091z.AbstractC1142a;

/* JADX INFO: renamed from: A0.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0028d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f71b;

    public /* synthetic */ RunnableC0028d() {
        this.f70a = 7;
        this.f71b = C0599J1.f1831a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objM116u;
        switch (this.f70a) {
            case 0:
                ((C0030f) this.f71b).m67t(true);
                return;
            case 1:
                C0039o c0039o = (C0039o) this.f71b;
                boolean zIsPopupShowing = c0039o.f97h.isPopupShowing();
                c0039o.m77t(zIsPopupShowing);
                c0039o.f102m = zIsPopupShowing;
                return;
            case 2:
                ((TextInputLayout) this.f71b).f2469d.requestLayout();
                return;
            case 3:
                C0492q c0492q = (C0492q) this.f71b;
                synchronized (c0492q.f1382d) {
                    try {
                        if (c0492q.f1386h == null) {
                            return;
                        }
                        try {
                            C0011l c0011lM1211c = c0492q.m1211c();
                            int i2 = c0011lM1211c.f34e;
                            if (i2 == 2) {
                                synchronized (c0492q.f1382d) {
                                }
                            }
                            if (i2 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                            }
                            try {
                                int i3 = AbstractC1142a.f4403a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C1121e c1121e = c0492q.f1381c;
                                Context context = c0492q.f1379a;
                                c1121e.getClass();
                                Typeface typefaceMo2071k = AbstractC1106g.f4256a.mo2071k(context, new C0011l[]{c0011lM1211c}, 0);
                                MappedByteBuffer mappedByteBufferM2035K = AbstractC0805P.m2035K(c0492q.f1379a, c0011lM1211c.f30a);
                                if (mappedByteBufferM2035K == null || typefaceMo2071k == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    C0463v c0463v = new C0463v(typefaceMo2071k, AbstractC0358S.m878b0(mappedByteBufferM2035K));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (c0492q.f1382d) {
                                        try {
                                            AbstractC0358S abstractC0358S = c0492q.f1386h;
                                            if (abstractC0358S != null) {
                                                abstractC0358S.mo922V(c0463v);
                                            }
                                        } finally {
                                        }
                                        break;
                                    }
                                    c0492q.m1209a();
                                    return;
                                } finally {
                                    int i4 = AbstractC1142a.f4403a;
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        } catch (Throwable th2) {
                            synchronized (c0492q.f1382d) {
                                try {
                                    AbstractC0358S abstractC0358S2 = c0492q.f1386h;
                                    if (abstractC0358S2 != null) {
                                        abstractC0358S2.mo921U(th2);
                                    }
                                    c0492q.m1209a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 4:
                C0512A c0512a = (C0512A) this.f71b;
                AbstractC0307g.m703e(c0512a, "this$0");
                int i5 = c0512a.f1449b;
                C0543t c0543t = c0512a.f1453f;
                if (i5 == 0) {
                    c0512a.f1450c = true;
                    c0543t.m1257d(EnumC0535l.ON_PAUSE);
                }
                if (c0512a.f1448a == 0 && c0512a.f1450c) {
                    c0543t.m1257d(EnumC0535l.ON_STOP);
                    c0512a.f1451d = true;
                    return;
                }
                return;
            case 5:
                C0758s c0758s = (C0758s) this.f71b;
                AbstractC0307g.m703e(c0758s, "$bar");
                if (c0758s.isAttachedToWindow()) {
                    c0758s.m1943f();
                    return;
                }
                return;
            case 6:
                ClassLoader classLoader = (ClassLoader) this.f71b;
                AbstractC0307g.m703e(classLoader, "$classLoader");
                C0580D0 c0580d0 = C0580D0.f1723a;
                String strM1409p = C0580D0.m1409p(classLoader);
                if (AbstractC0425j.m1013R0(strM1409p)) {
                    C0580D0.m1412s("prefetch: username empty");
                    return;
                }
                C0580D0.f1736n = strM1409p;
                Bitmap bitmapM1403j = C0580D0.m1403j(classLoader, strM1409p);
                if (bitmapM1403j != null && !bitmapM1403j.isRecycled()) {
                    C0580D0.f1740r = bitmapM1403j;
                    C0580D0.f1741s = true;
                }
                C0580D0.m1412s("prefetch: user=" + strM1409p + " bmp=" + (bitmapM1403j != null));
                ImageView imageView = C0580D0.f1730h;
                if (imageView != null) {
                    C0580D0.f1725c.post(new RunnableC0705w0(imageView, 1));
                    return;
                }
                return;
            case 7:
                AbstractC0307g.m703e((C0599J1) this.f71b, "$this_runCatching");
                Object obj = C0590G1.f1792a;
                C0599J1.m1485c(C0590G1.m1452j());
                return;
            case 8:
                ((AbstractC0727e) this.f71b).mo1912f();
                return;
            case 9:
                DialogC0823e dialogC0823e = (DialogC0823e) this.f71b;
                AbstractC0307g.m703e(dialogC0823e, "$progress");
                C0830i c0830i = C0830i.f3000a;
                try {
                    dialogC0823e.show();
                    C0830i.m2157g("progress shown async");
                    objM116u = C0146l.f339a;
                    break;
                } catch (Throwable th3) {
                    objM116u = AbstractC0040p.m116u(th3);
                }
                Throwable thM465a = AbstractC0141g.m465a(objM116u);
                if (thM465a != null) {
                    C0830i.m2157g("progress show fail: " + thM465a.getMessage());
                    return;
                }
                return;
            case 10:
                ScrollView scrollView = (ScrollView) this.f71b;
                AbstractC0307g.m703e(scrollView, "$scroll");
                scrollView.scrollTo(0, 0);
                return;
            case 11:
                ((CarouselLayoutManager) this.f71b).m787S();
                return;
            default:
                C0501a c0501a = (C0501a) this.f71b;
                c0501a.f1414c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c0501a.f1416e;
                C0245e c0245e = sideSheetBehavior.f2417i;
                if (c0245e != null && c0245e.m674f()) {
                    c0501a.m1226c(c0501a.f1413b);
                    return;
                } else {
                    if (sideSheetBehavior.f2416h == 2) {
                        sideSheetBehavior.m1882r(c0501a.f1413b);
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC0028d(int i2, Object obj) {
        this.f70a = i2;
        this.f71b = obj;
    }
}

package p000a;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.emoji2.text.C1094c;
import androidx.emoji2.text.C1096e;
import androidx.fragment.app.ComponentCallbacksC1100b;
import androidx.lifecycle.AbstractC1116e;
import androidx.lifecycle.C1119h;
import androidx.lifecycle.C1121j;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.nio.MappedByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import p000a.AbstractC0553e7;
import p000a.C0186K3;
import p000a.C0518ca;
import p000a.C0816s4;

/* JADX INFO: renamed from: a.M2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0221M2 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f742a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f743b;

    public /* synthetic */ RunnableC0221M2(int i, Object obj) {
        this.f742a = i;
        this.f743b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.f742a) {
            case 0:
                ((CarouselLayoutManager) this.f743b).m3147W0();
                return;
            case 1:
                ((C0682l3) this.f743b).m1548t(true);
                return;
            case 2:
                ((ComponentActivity) this.f743b).invalidateMenu();
                return;
            case 3:
                ComponentActivity.ViewTreeObserverOnDrawListenerC0972f viewTreeObserverOnDrawListenerC0972f = (ComponentActivity.ViewTreeObserverOnDrawListenerC0972f) this.f743b;
                Runnable runnable = viewTreeObserverOnDrawListenerC0972f.f3605b;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0972f.f3605b = null;
                    return;
                }
                return;
            case 4:
                DialogC0078E3.m206a((DialogC0078E3) this.f743b);
                return;
            case 5:
                ((C0550e4) this.f743b).f2038a = null;
                return;
            case 6:
                ((InterfaceC0819s7) this.f743b).mo31a();
                return;
            case 7:
                C0098F5 c0098f5 = (C0098F5) this.f743b;
                boolean zIsPopupShowing = c0098f5.f314h.isPopupShowing();
                c0098f5.m274t(zIsPopupShowing);
                c0098f5.f319m = zIsPopupShowing;
                return;
            case 8:
                C1096e.b bVar = (C1096e.b) this.f743b;
                synchronized (bVar.f4508d) {
                    try {
                        if (bVar.f4512h == null) {
                            return;
                        }
                        try {
                            C0350T6 c0350t6M2512c = bVar.m2512c();
                            int i = c0350t6M2512c.f1248e;
                            if (i == 2) {
                                synchronized (bVar.f4508d) {
                                }
                            }
                            if (i != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                            }
                            try {
                                int i2 = C0016Af.f53a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C1096e.a aVar = bVar.f4507c;
                                Context context = bVar.f4505a;
                                aVar.getClass();
                                Typeface typefaceMo753b = C0234Mf.f777a.mo753b(context, new C0350T6[]{c0350t6M2512c}, 0);
                                MappedByteBuffer mappedByteBufferM933e = C0341Sf.m933e(bVar.f4505a, c0350t6M2512c.f1244a);
                                if (mappedByteBufferM933e == null || typefaceMo753b == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    C0671kb c0671kb = new C0671kb(typefaceMo753b, C0726n9.m1678u(mappedByteBufferM933e));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (bVar.f4508d) {
                                        try {
                                            C1094c.h hVar = bVar.f4512h;
                                            if (hVar != null) {
                                                hVar.mo2504b(c0671kb);
                                            }
                                        } finally {
                                        }
                                        break;
                                    }
                                    bVar.m2511b();
                                    return;
                                } finally {
                                    int i3 = C0016Af.f53a;
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        } catch (Throwable th2) {
                            synchronized (bVar.f4508d) {
                                try {
                                    C1094c.h hVar2 = bVar.f4512h;
                                    if (hVar2 != null) {
                                        hVar2.mo2503a(th2);
                                    }
                                    bVar.m2511b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 9:
                ComponentCallbacksC1100b componentCallbacksC1100b = (ComponentCallbacksC1100b) this.f743b;
                componentCallbacksC1100b.f4552P.f3082e.m546b(componentCallbacksC1100b.f4560d);
                componentCallbacksC1100b.f4560d = null;
                return;
            case 10:
                Iterator<AbstractC0553e7.h> it = ((AbstractC0553e7) this.f743b).f2070m.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
                return;
            case 11:
                try {
                    ((C0611h8) this.f743b).m1464j();
                    C0413Wf c0413Wf = C0413Wf.f1577a;
                    return;
                } catch (Throwable th3) {
                    C0920xd.m2206a(th3);
                    return;
                }
            case 12:
                ((TextView) this.f743b).setText("保存");
                return;
            case 13:
                C1121j c1121j = (C1121j) this.f743b;
                C0631i9.m1482e(c1121j, "this$0");
                int i4 = c1121j.f4691b;
                C1119h c1119h = c1121j.f4695f;
                if (i4 == 0) {
                    c1121j.f4692c = true;
                    c1119h.m2598f(AbstractC1116e.a.ON_PAUSE);
                }
                if (c1121j.f4690a == 0 && c1121j.f4692c) {
                    c1119h.m2598f(AbstractC1116e.a.ON_STOP);
                    c1121j.f4693d = true;
                    return;
                }
                return;
            case 14:
                ((C0231Mc) this.f743b).mo622f();
                return;
            case 15:
                SideSheetBehavior.C1306c c1306c = (SideSheetBehavior.C1306c) this.f743b;
                c1306c.f5857b = false;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                C0961zg c0961zg = sideSheetBehavior.f5840i;
                if (c0961zg != null && c0961zg.m2255f()) {
                    c1306c.m3254a(c1306c.f5856a);
                    return;
                } else {
                    if (sideSheetBehavior.f5839h == 2) {
                        sideSheetBehavior.m3250s(c1306c.f5856a);
                        return;
                    }
                    return;
                }
            case 16:
                C0376Ue c0376Ue = (C0376Ue) this.f743b;
                if (c0376Ue.f1418h) {
                    c0376Ue.f1418h = false;
                    c0376Ue.f1419i = true;
                    C0186K3.f638a.getClass();
                    C0908x1.m2194b(C0944z.m2223c(C0186K3.a.m508i().f2455y, "TempUnhideTrigger: long-press triggered (threshold=", "ms)"));
                    if (C0186K3.a.m511l() && C0186K3.a.m508i().f2454x) {
                        C0915x8 c0915x8 = C0915x8.f3530a;
                        C0518ca.c cVar = C0518ca.c.f1902b;
                        C0518ca.b bVar2 = C0518ca.b.f1898b;
                        Set<? extends C0518ca.b> setSingleton = Collections.singleton(C0518ca.b.f1897a);
                        C0631i9.m1481d(setSingleton, "singleton(...)");
                        if (!c0915x8.m2205c(bVar2, cVar, setSingleton)) {
                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"TempUnhideTrigger: long-press unhide BLOCKED (state=" + C0915x8.f3531b + ")"}, 1));
                            return;
                        }
                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"TempUnhideTrigger: long-press unhide triggered"}, 1));
                        Context context2 = C0889w1.f3488p;
                        if (context2 != null) {
                            C0653jc c0653jcM508i = C0186K3.a.m508i();
                            if (c0653jcM508i.f2426R) {
                                String str = c0653jcM508i.f2427S;
                                if (C0034Be.m101P(str)) {
                                    str = "刻舟求剑";
                                }
                                Toast.makeText(context2, str, 0).show();
                            }
                        }
                        C0816s4.a.m1916a();
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ((TextInputLayout) this.f743b).f5910d.requestLayout();
                return;
            default:
                ClassLoader classLoader = (ClassLoader) this.f743b;
                try {
                    C0122Gb.f389a.getClass();
                    C0122Gb.m314b(classLoader);
                    if (C0122Gb.f392d != null && C0122Gb.f391c != null) {
                        z = true;
                    }
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"WXMaskPlugin: NativeHideService early init done (methodsReady=" + z + ")"}, 1));
                    return;
                } catch (Throwable unused) {
                    return;
                }
        }
    }
}

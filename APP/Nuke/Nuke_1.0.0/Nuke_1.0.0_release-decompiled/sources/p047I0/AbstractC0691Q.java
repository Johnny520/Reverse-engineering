package p047I0;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import me.dartcv.nuke.R;
import p007B0.C0171D;
import p007B0.C0172E;
import p008B1.AbstractC0219g;
import p014C1.C0239a;
import p029F0.C0372J;
import p029F0.C0405i0;
import p048I1.C0780e;
import p048I1.InterfaceC0782g;
import p052J1.AbstractC0831a;
import p056K2.C0891q;
import p067N0.C1009c;
import p067N0.C1010d;
import p095T.AbstractC1385s;
import p095T.C1305C;
import p095T.C1341U0;
import p095T.C1357e;
import p095T.C1371l;
import p095T.C1383r;
import p095T.C1386s0;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p136b0.AbstractC1848j;
import p152e0.AbstractC2001h;
import p152e0.C2000g;
import p152e0.InterfaceC1999f;
import p256w0.InterfaceC3388a;

/* JADX INFO: renamed from: I0.Q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0691Q {

    /* JADX INFO: renamed from: a */
    public static final C1305C f2210a = new C1305C(C0683M.f2178f);

    /* JADX INFO: renamed from: b */
    public static final C1341U0 f2211b = new C1341U0(C0683M.f2179g);

    /* JADX INFO: renamed from: c */
    public static final C1305C f2212c = new C1305C(C0756q.f2348h);

    /* JADX INFO: renamed from: d */
    public static final C1341U0 f2213d = new C1341U0(C0683M.f2180h);

    /* JADX INFO: renamed from: e */
    public static final C1341U0 f2214e = new C1341U0(C0683M.f2181i);

    /* JADX INFO: renamed from: f */
    public static final C1341U0 f2215f = new C1341U0(C0683M.f2182j);

    /* JADX INFO: renamed from: a */
    public static final void m1199a(ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y, InterfaceC1603e interfaceC1603e, InterfaceC1373m interfaceC1373m, int i5) {
        boolean z5;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-520299287);
        int i6 = (c1383r.m2586h(viewTreeObserverOnGlobalLayoutListenerC0772y) ? 4 : 2) | i5 | (c1383r.m2586h(interfaceC1603e) ? 32 : 16);
        if (c1383r.m2560O(i6 & 1, (i6 & 19) != 18)) {
            Context context = viewTreeObserverOnGlobalLayoutListenerC0772y.getContext();
            Object objM2558L = c1383r.m2558L();
            C1357e c1357e = C1371l.f4833a;
            if (objM2558L == c1357e) {
                objM2558L = new C0714b0();
                c1383r.m2585g0(objM2558L);
            }
            C0714b0 c0714b0 = (C0714b0) objM2558L;
            C0752o viewTreeOwners = viewTreeObserverOnGlobalLayoutListenerC0772y.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            InterfaceC0782g interfaceC0782g = viewTreeOwners.f2338b;
            Object objM2558L2 = c1383r.m2558L();
            if (objM2558L2 == c1357e) {
                Object parent = viewTreeObserverOnGlobalLayoutListenerC0772y.getParent();
                AbstractC1665j.m2983c(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                LinkedHashMap linkedHashMap = null;
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = InterfaceC1999f.class.getSimpleName() + ':' + strValueOf;
                C0780e savedStateRegistry = interfaceC0782g.getSavedStateRegistry();
                Bundle bundleM1325a = savedStateRegistry.m1325a(str);
                if (bundleM1325a != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleM1325a.keySet()) {
                        ArrayList parcelableArrayList = bundleM1325a.getParcelableArrayList(str2);
                        AbstractC1665j.m2983c(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
                        linkedHashMap.put(str2, parcelableArrayList);
                    }
                }
                C0756q c0756q = C0756q.f2349i;
                C1341U0 c1341u0 = AbstractC2001h.f6721a;
                C2000g c2000g = new C2000g(linkedHashMap, c0756q);
                try {
                    savedStateRegistry.m1327c(str, new C0239a(1, c2000g));
                    z5 = true;
                } catch (IllegalArgumentException unused) {
                    z5 = false;
                }
                C0763t0 c0763t0 = new C0763t0(c2000g, new C0765u0(z5, savedStateRegistry, str));
                c1383r.m2585g0(c0763t0);
                objM2558L2 = c0763t0;
            }
            C0763t0 c0763t02 = (C0763t0) objM2558L2;
            boolean zM2586h = c1383r.m2586h(c0763t02);
            Object objM2558L3 = c1383r.m2558L();
            if (zM2586h || objM2558L3 == c1357e) {
                objM2558L3 = new C0172E(8, c0763t02);
                c1383r.m2585g0(objM2558L3);
            }
            AbstractC1385s.m2613c(C0891q.f2780a, (InterfaceC1601c) objM2558L3, c1383r);
            Object objM2558L4 = c1383r.m2558L();
            if (objM2558L4 == c1357e) {
                objM2558L4 = (Build.VERSION.SDK_INT < 31 || !((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2)) ? new C0674H0() : new C0759r0(viewTreeObserverOnGlobalLayoutListenerC0772y.getView(), 0);
                c1383r.m2585g0(objM2558L4);
            }
            InterfaceC3388a interfaceC3388a = (InterfaceC3388a) objM2558L4;
            Configuration configuration = viewTreeObserverOnGlobalLayoutListenerC0772y.getConfiguration();
            Object objM2558L5 = c1383r.m2558L();
            if (objM2558L5 == c1357e) {
                objM2558L5 = new C1009c();
                c1383r.m2585g0(objM2558L5);
            }
            C1009c c1009c = (C1009c) objM2558L5;
            Object objM2558L6 = c1383r.m2558L();
            Object obj = objM2558L6;
            if (objM2558L6 == c1357e) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                c1383r.m2585g0(configuration2);
                obj = configuration2;
            }
            Configuration configuration3 = (Configuration) obj;
            Object objM2558L7 = c1383r.m2558L();
            if (objM2558L7 == c1357e) {
                objM2558L7 = new ComponentCallbacks2C0687O(configuration3, c1009c);
                c1383r.m2585g0(objM2558L7);
            }
            ComponentCallbacks2C0687O componentCallbacks2C0687O = (ComponentCallbacks2C0687O) objM2558L7;
            boolean zM2586h2 = c1383r.m2586h(context);
            Object objM2558L8 = c1383r.m2558L();
            if (zM2586h2 || objM2558L8 == c1357e) {
                objM2558L8 = new C0171D(1, context, componentCallbacks2C0687O);
                c1383r.m2585g0(objM2558L8);
            }
            AbstractC1385s.m2613c(c1009c, (InterfaceC1601c) objM2558L8, c1383r);
            Object objM2558L9 = c1383r.m2558L();
            if (objM2558L9 == c1357e) {
                objM2558L9 = new C1010d();
                c1383r.m2585g0(objM2558L9);
            }
            C1010d c1010d = (C1010d) objM2558L9;
            Object objM2558L10 = c1383r.m2558L();
            if (objM2558L10 == c1357e) {
                objM2558L10 = new ComponentCallbacks2C0689P(c1010d);
                c1383r.m2585g0(objM2558L10);
            }
            ComponentCallbacks2C0689P componentCallbacks2C0689P = (ComponentCallbacks2C0689P) objM2558L10;
            boolean zM2586h3 = c1383r.m2586h(context);
            Object objM2558L11 = c1383r.m2558L();
            if (zM2586h3 || objM2558L11 == c1357e) {
                objM2558L11 = new C0171D(2, context, componentCallbacks2C0689P);
                c1383r.m2585g0(objM2558L11);
            }
            AbstractC1385s.m2613c(c1010d, (InterfaceC1601c) objM2558L11, c1383r);
            C1305C c1305c = AbstractC0757q0.f2372v;
            AbstractC1385s.m2612b(new C1386s0[]{f2210a.mo2399a(viewTreeObserverOnGlobalLayoutListenerC0772y.getConfiguration()), f2211b.mo2399a(context), AbstractC0219g.f765a.mo2399a(viewTreeOwners.f2337a), AbstractC0831a.f2692a.mo2399a(interfaceC0782g), AbstractC2001h.f6721a.mo2399a(c0763t02), f2215f.mo2399a(viewTreeObserverOnGlobalLayoutListenerC0772y.getView()), f2213d.mo2399a(c1009c), f2214e.mo2399a(c1010d), c1305c.mo2399a(Boolean.valueOf(((Boolean) c1383r.m2590j(c1305c)).booleanValue() | viewTreeObserverOnGlobalLayoutListenerC0772y.getScrollCaptureInProgress$ui())), AbstractC0757q0.f2362l.mo2399a(interfaceC3388a)}, AbstractC1848j.m3314c(1059770793, new C0405i0(viewTreeObserverOnGlobalLayoutListenerC0772y, c0714b0, interfaceC1603e), c1383r), c1383r, 56);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0372J(viewTreeObserverOnGlobalLayoutListenerC0772y, interfaceC1603e, i5);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m1200b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}

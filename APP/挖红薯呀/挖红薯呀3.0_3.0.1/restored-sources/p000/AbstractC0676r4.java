package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.luckypray.dexkit.C0587R;

/* JADX INFO: renamed from: r4 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0676r4 {

    /* JADX INFO: renamed from: a */
    public static final C0174ej f5290a = new C0174ej(C0342j4.f2693e);

    /* JADX INFO: renamed from: b */
    public static final g41 f5291b = new g41(C0342j4.f2694f);

    /* JADX INFO: renamed from: c */
    public static final g41 f5292c;

    /* JADX INFO: renamed from: d */
    public static final g41 f5293d;

    /* JADX INFO: renamed from: e */
    public static final g41 f5294e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        z60.m5423J(new C0003a2(26));
        f5292c = new g41(C0342j4.f2695g);
        f5293d = new g41(C0342j4.f2696h);
        f5294e = new g41(C0342j4.f2697i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m3378a(ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3, InterfaceC0904ww interfaceC0904ww, InterfaceC0356ji interfaceC0356ji, int i) {
        boolean z;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-520299287);
        int i2 = (c0616pi.m3108h(viewTreeObserverOnGlobalLayoutListenerC0875w3) ? 4 : 2) | i | (c0616pi.m3108h(interfaceC0904ww) ? 32 : 16);
        int i3 = 1;
        if (c0616pi.m3082O(i2 & 1, (i2 & 19) != 18)) {
            Context context = viewTreeObserverOnGlobalLayoutListenerC0875w3.getContext();
            Object objM3080L = c0616pi.m3080L();
            C0675r3 c0675r3 = C0320ii.f2572a;
            if (objM3080L == c0675r3) {
                objM3080L = new C0753t6();
                c0616pi.m3107g0(objM3080L);
            }
            C0753t6 c0753t6 = (C0753t6) objM3080L;
            C0378k3 viewTreeOwners = viewTreeObserverOnGlobalLayoutListenerC0875w3.getViewTreeOwners();
            if (viewTreeOwners == null) {
                C0921xc.m5134o("Called when the ViewTreeOwnersAvailability is not yet in Available state");
                return;
            }
            nx0 nx0Var = viewTreeOwners.f2998b;
            Object objM3080L2 = c0616pi.m3080L();
            if (objM3080L2 == c0675r3) {
                Object parent = viewTreeObserverOnGlobalLayoutListenerC0875w3.getParent();
                parent.getClass();
                View view = (View) parent;
                Object tag = view.getTag(C0587R.id.compose_view_saveable_id_tag);
                LinkedHashMap linkedHashMap = null;
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = zw0.class.getSimpleName() + ':' + strValueOf;
                kx0 savedStateRegistry = nx0Var.getSavedStateRegistry();
                Bundle bundleM1960a = savedStateRegistry.m1960a(str);
                if (bundleM1960a != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleM1960a.keySet()) {
                        ArrayList parcelableArrayList = bundleM1960a.getParcelableArrayList(str2);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str2, parcelableArrayList);
                    }
                }
                C0601p3 c0601p3 = C0601p3.f4720n;
                g41 g41Var = bx0.f604a;
                ax0 ax0Var = new ax0(linkedHashMap, c0601p3);
                try {
                    savedStateRegistry.m1962c(str, new C0925xg(i3, ax0Var));
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                C0659qo c0659qo = new C0659qo(ax0Var, new C0696ro(z, savedStateRegistry, str));
                c0616pi.m3107g0(c0659qo);
                objM3080L2 = c0659qo;
            }
            C0659qo c0659qo2 = (C0659qo) objM3080L2;
            boolean zM3108h = c0616pi.m3108h(c0659qo2);
            Object objM3080L3 = c0616pi.m3080L();
            if (zM3108h || objM3080L3 == c0675r3) {
                objM3080L3 = new C0711s2(5, c0659qo2);
                c0616pi.m3107g0(objM3080L3);
            }
            s91.m4038c(na1.f4229a, (InterfaceC0742sw) objM3080L3, c0616pi);
            Object objM3080L4 = c0616pi.m3080L();
            if (objM3080L4 == c0675r3) {
                objM3080L4 = (Build.VERSION.SDK_INT < 31 || !((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2)) ? new ij0() : new C0967yl(viewTreeObserverOnGlobalLayoutListenerC0875w3.getView(), 0);
                c0616pi.m3107g0(objM3080L4);
            }
            InterfaceC0372jy interfaceC0372jy = (InterfaceC0372jy) objM3080L4;
            Configuration configuration = viewTreeObserverOnGlobalLayoutListenerC0875w3.getConfiguration();
            Object objM3080L5 = c0616pi.m3080L();
            if (objM3080L5 == c0675r3) {
                objM3080L5 = new s00();
                c0616pi.m3107g0(objM3080L5);
            }
            s00 s00Var = (s00) objM3080L5;
            Object objM3080L6 = c0616pi.m3080L();
            Object obj = objM3080L6;
            if (objM3080L6 == c0675r3) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                c0616pi.m3107g0(configuration2);
                obj = configuration2;
            }
            Configuration configuration3 = (Configuration) obj;
            Object objM3080L7 = c0616pi.m3080L();
            if (objM3080L7 == c0675r3) {
                objM3080L7 = new ComponentCallbacks2C0602p4(configuration3, s00Var);
                c0616pi.m3107g0(objM3080L7);
            }
            ComponentCallbacks2C0602p4 componentCallbacks2C0602p4 = (ComponentCallbacks2C0602p4) objM3080L7;
            boolean zM3108h2 = c0616pi.m3108h(context);
            Object objM3080L8 = c0616pi.m3080L();
            if (zM3108h2 || objM3080L8 == c0675r3) {
                objM3080L8 = new C0537o4(0, context, componentCallbacks2C0602p4);
                c0616pi.m3107g0(objM3080L8);
            }
            s91.m4038c(s00Var, (InterfaceC0742sw) objM3080L8, c0616pi);
            Object objM3080L9 = c0616pi.m3080L();
            if (objM3080L9 == c0675r3) {
                objM3080L9 = new xu0();
                c0616pi.m3107g0(objM3080L9);
            }
            xu0 xu0Var = (xu0) objM3080L9;
            Object objM3080L10 = c0616pi.m3080L();
            if (objM3080L10 == c0675r3) {
                objM3080L10 = new ComponentCallbacks2C0639q4(xu0Var);
                c0616pi.m3107g0(objM3080L10);
            }
            ComponentCallbacks2C0639q4 componentCallbacks2C0639q4 = (ComponentCallbacks2C0639q4) objM3080L10;
            boolean zM3108h3 = c0616pi.m3108h(context);
            Object objM3080L11 = c0616pi.m3080L();
            if (zM3108h3 || objM3080L11 == c0675r3) {
                objM3080L11 = new C0537o4(1, context, componentCallbacks2C0639q4);
                c0616pi.m3107g0(objM3080L11);
            }
            s91.m4038c(xu0Var, (InterfaceC0742sw) objM3080L11, c0616pi);
            C0174ej c0174ej = AbstractC0131dj.f1135v;
            AbstractC0307i4.m1527c(new ct0[]{f5290a.mo206a(viewTreeObserverOnGlobalLayoutListenerC0875w3.getConfiguration()), f5291b.mo206a(context), bb0.f490a.mo206a(viewTreeOwners.f2997a), db0.f1042a.mo206a(nx0Var), bx0.f604a.mo206a(c0659qo2), f5294e.mo206a(viewTreeObserverOnGlobalLayoutListenerC0875w3.getView()), f5292c.mo206a(s00Var), f5293d.mo206a(xu0Var), c0174ej.mo206a(Boolean.valueOf(((Boolean) c0616pi.m3112j(c0174ej)).booleanValue() | viewTreeObserverOnGlobalLayoutListenerC0875w3.getScrollCaptureInProgress$ui())), AbstractC0131dj.f1125l.mo206a(interfaceC0372jy)}, AbstractC0398kl.m1937w(1059770793, new C0418l4(viewTreeObserverOnGlobalLayoutListenerC0875w3, c0753t6, interfaceC0904ww), c0616pi), c0616pi, 56);
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new C0459m4(viewTreeObserverOnGlobalLayoutListenerC0875w3, interfaceC0904ww, i, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m3379b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}

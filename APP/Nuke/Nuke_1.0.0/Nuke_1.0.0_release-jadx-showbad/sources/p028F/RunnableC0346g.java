package p028F;

import android.animation.ObjectAnimator;
import android.os.Trace;
import android.view.ActionMode;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import me.dartcv.nuke.BuildConfig;
import p000A.C0072l0;
import p026E3.C0285a;
import p027E4.C0330q;
import p047I0.ViewOnAttachStateChangeListenerC0667E;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p056K2.C0891q;
import p062L3.C0991e;
import p071O.C1026e;
import p105V.C1483e;
import p115X0.C1649x;
import p115X0.EnumC1648w;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p135b.ViewTreeObserverOnDrawListenerC1821i;
import p176i1.DialogC2308x;
import p181j0.C2370e;
import p181j0.EnumC2371f;
import p181j0.ViewOnAttachStateChangeListenerC2369d;
import p186k.C2439u;

/* JADX INFO: renamed from: F.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0346g implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1086d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f1087e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0346g(int i5, Object obj) {
        this.f1086d = i5;
        this.f1087e = obj;
    }

    /* JADX DEBUG: Class process forced to load method for inline: O.e.a(O.e):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Type inference failed for: r2v10, types: [K2.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [K2.e, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        View viewFindFocus;
        int i5;
        int i6;
        int i7 = this.f1086d;
        Boolean bool = null;
        Object obj = this.f1087e;
        switch (i7) {
            case 0:
                ActionMode actionMode = ((C0348i) obj).f1099h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case BuildConfig.VERSION_CODE /* 1 */:
                ViewOnAttachStateChangeListenerC0667E viewOnAttachStateChangeListenerC0667E = (ViewOnAttachStateChangeListenerC0667E) obj;
                Trace.beginSection("measureAndLayout");
                try {
                    viewOnAttachStateChangeListenerC0667E.f2128g.m1315u(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        viewOnAttachStateChangeListenerC0667E.m1149g();
                        Trace.endSection();
                        viewOnAttachStateChangeListenerC0667E.f2123M = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 2:
                Object obj2 = ((C0285a) obj).f913a.thisObject;
                AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type android.widget.ImageView");
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((ImageView) obj2, "rotation", 0.0f, 360.0f);
                C0991e.f3061d.getClass();
                objectAnimatorOfFloat.setDuration(C0991e.m2039i().f3060a);
                objectAnimatorOfFloat.setRepeatCount(-1);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat.start();
                return;
            case 3:
                C1026e.setRippleState$lambda$1((C1026e) obj);
                return;
            case 4:
                C1649x c1649x = (C1649x) obj;
                C0072l0 c0072l0 = c1649x.f5661b;
                c1649x.f5673n = null;
                C1483e c1483e = c1649x.f5672m;
                View view = c1649x.f5660a;
                if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    c1483e.m2758g();
                    return;
                }
                Object[] objArr = c1483e.f5181d;
                int i8 = c1483e.f5183f;
                Boolean boolValueOf = null;
                for (int i9 = 0; i9 < i8; i9++) {
                    EnumC1648w enumC1648w = (EnumC1648w) objArr[i9];
                    int iOrdinal = enumC1648w.ordinal();
                    if (iOrdinal == 0) {
                        bool = Boolean.TRUE;
                    } else if (iOrdinal == 1) {
                        bool = Boolean.FALSE;
                    } else {
                        if (iOrdinal != 2 && iOrdinal != 3) {
                            throw new C0330q();
                        }
                        if (!AbstractC1665j.m2981a(bool, Boolean.FALSE)) {
                            boolValueOf = Boolean.valueOf(enumC1648w == EnumC1648w.f5657f);
                        }
                    }
                    boolValueOf = bool;
                }
                c1483e.m2758g();
                if (AbstractC1665j.m2981a(bool, Boolean.TRUE)) {
                    ((InputMethodManager) c0072l0.f308f.getValue()).restartInput((View) c0072l0.f307e);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((C1753n) ((C1753n) c0072l0.f309g).f6028e).mo3114K();
                    } else {
                        ((C1753n) ((C1753n) c0072l0.f309g).f6028e).mo3109C();
                    }
                }
                if (AbstractC1665j.m2981a(bool, Boolean.FALSE)) {
                    ((InputMethodManager) c0072l0.f308f.getValue()).restartInput((View) c0072l0.f307e);
                    return;
                }
                return;
            case 5:
                ViewTreeObserverOnDrawListenerC1821i viewTreeObserverOnDrawListenerC1821i = (ViewTreeObserverOnDrawListenerC1821i) obj;
                Runnable runnable = viewTreeObserverOnDrawListenerC1821i.f6217e;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC1821i.f6217e = null;
                    return;
                }
                return;
            case 6:
                DialogC2308x.m4133a((DialogC2308x) obj);
                return;
            case 7:
                ViewOnAttachStateChangeListenerC2369d viewOnAttachStateChangeListenerC2369d = (ViewOnAttachStateChangeListenerC2369d) obj;
                boolean zM4221h = viewOnAttachStateChangeListenerC2369d.m4221h();
                ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = viewOnAttachStateChangeListenerC2369d.f7681d;
                if (zM4221h) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        viewTreeObserverOnGlobalLayoutListenerC0772y.m1315u(true);
                        C2439u c2439u = viewOnAttachStateChangeListenerC2369d.f7692o;
                        int[] iArr = c2439u.f7846b;
                        long[] jArr = c2439u.f7845a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i10 = 0;
                            while (true) {
                                long j5 = jArr[i10];
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i11 = 8;
                                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                                    int i13 = 0;
                                    while (i13 < i12) {
                                        if ((255 & j5) < 128) {
                                            int i14 = iArr[(i10 << 3) + i13];
                                            if (viewOnAttachStateChangeListenerC2369d.m4220g().m4317a(i14)) {
                                                i5 = i11;
                                                i6 = i13;
                                            } else {
                                                i5 = i11;
                                                i6 = i13;
                                                viewOnAttachStateChangeListenerC2369d.f7684g.add(new C2370e(i14, viewOnAttachStateChangeListenerC2369d.f7691n, EnumC2371f.f7701e, null));
                                                viewOnAttachStateChangeListenerC2369d.f7688k.mo4090o(C0891q.f2780a);
                                            }
                                        }
                                        j5 >>= i5;
                                        i13 = i6 + 1;
                                        i11 = i5;
                                    }
                                    if (i12 == i11) {
                                        if (i10 != length) {
                                            i10++;
                                        }
                                    }
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        viewOnAttachStateChangeListenerC2369d.m4223j(viewTreeObserverOnGlobalLayoutListenerC0772y.getSemanticsOwner().m2180a(), viewOnAttachStateChangeListenerC2369d.f7693p);
                        Trace.endSection();
                        viewOnAttachStateChangeListenerC2369d.m4219e(viewOnAttachStateChangeListenerC2369d.m4220g());
                        viewOnAttachStateChangeListenerC2369d.m4227n();
                        viewOnAttachStateChangeListenerC2369d.f7694q = false;
                        return;
                    } catch (Throwable th) {
                        throw th;
                    } finally {
                    }
                }
                return;
            default:
                View view2 = (View) obj;
                ((InputMethodManager) view2.getContext().getSystemService("input_method")).showSoftInput(view2, 0);
                return;
        }
    }
}

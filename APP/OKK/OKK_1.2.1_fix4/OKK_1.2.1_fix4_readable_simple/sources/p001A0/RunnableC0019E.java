package p001A0;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0501a;
import androidx.fragment.app.C0509i;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0504d;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import p006D.AbstractC0080Q;
import p017J.C0212a;
import p017J.ViewOnTouchListenerC0218g;
import p021L.C0245e;
import p037U.AbstractC0355O;
import p037U.AbstractC0369e;
import p037U.AbstractC0370f;
import p037U.AbstractC0390z;
import p037U.C0371g;
import p037U.C0374j;
import p037U.RunnableC0367c;
import p057g.AbstractC0895c0;
import p057g.C0906i;

/* JADX INFO: renamed from: A0.E */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0019E implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f57b;

    public /* synthetic */ RunnableC0019E(int r1, Object r2) {
        this.f56a = r1;
        this.f57b = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r3 = 1;
        int r4 = 2;
        int r6 = 0;
        Object r7 = this.f57b;
        switch(this.f56a) {
            case 0: goto L105;
            case 1: goto L82;
            case 2: goto L80;
            case 3: goto L73;
            case 4: goto L31;
            case 5: goto L29;
            case 6: goto L27;
            case 7: goto L25;
            case 8: goto L23;
            case 9: goto L19;
            case 10: goto L13;
            default: goto L4;
        };
    L4:
        C0501a r72 = (C0501a) r7;
        r72.f1414c = false;
        BottomSheetBehavior r1 = (BottomSheetBehavior) r72.f1416e;
        C0245e r2 = r1.f2293M;
        if (r2 == null) goto L10;
        if (r2.m674f() == false) goto L10;
        r72.m1226c(r72.f1413b);
        return;
    L10:
        if (r1.f2292L != 2) goto L108;
        r1.m1836C(r72.f1413b);
        return;
    L108:
        return;
    L13:
        ActionMenuView r12 = ((Toolbar) r7).f1227a;
        if (r12 == null) goto L109;
        C0906i r13 = r12.f1144s;
        if (r13 == null) goto L110;
        r13.m2236f();
        return;
    L110:
        return;
    L109:
        return;
    L19:
        SearchView$SearchAutoComplete r73 = (SearchView$SearchAutoComplete) r7;
        if (r73.f1164f == false) goto L111;
        ((InputMethodManager) r73.getContext().getSystemService("input_method")).showSoftInput(r73, 0);
        r73.f1164f = false;
        return;
    L111:
        return;
    L23:
        AbstractC0895c0 r74 = (AbstractC0895c0) r7;
        r74.f3180l = null;
        r74.drawableStateChanged();
        return;
    L25:
        ((C0509i) r7).m1242f();
        throw null;
    L27:
        ((DialogInterfaceOnCancelListenerC0504d) r7).f1419k.onDismiss(null);
        return;
    L29:
        ((StaggeredGridLayoutManager) r7).m1335c0();
        return;
    L31:
        RecyclerView r75 = (RecyclerView) r7;
        AbstractC0390z r8 = r75.f1544F;
        if (r8 == null) goto L71;
        C0371g r82 = (C0371g) r8;
        ArrayList r9 = r82.f785h;
        boolean r10 = !r9.isEmpty();
        ArrayList r11 = r82.f787j;
        boolean r122 = !r11.isEmpty();
        ArrayList r132 = r82.f788k;
        boolean r14 = !r132.isEmpty();
        ArrayList r15 = r82.f786i;
        boolean r16 = !r15.isEmpty();
        if (r10 == true) goto L39;
        if (r122 == true) goto L39;
        if (r16 == true) goto L39;
        if (r14 == false) goto L71;
    L39:
        Iterator r17 = r9.iterator();
        boolean r18 = r17.hasNext();
        long r19 = r82.f879d;
        if (r18 == true) goto L69;
        r9.clear();
        if (r122 == false) goto L48;
        ArrayList r110 = new ArrayList();
        r110.addAll(r11);
        r82.f790m.add(r110);
        r11.clear();
        RunnableC0367c r22 = new RunnableC0367c(r82, r110, r6);
        if (r10 == true) goto L46;
        r22.run();
        goto L48
    L46:
        ((AbstractC0370f) r110.get(0)).getClass();
        throw null;
    L48:
        if (r14 == false) goto L54;
        ArrayList r111 = new ArrayList();
        r111.addAll(r132);
        r82.f791n.add(r111);
        r132.clear();
        RunnableC0367c r23 = new RunnableC0367c(r82, r111, r3);
        if (r10 == true) goto L52;
        r23.run();
        goto L54
    L52:
        ((AbstractC0369e) r111.get(0)).getClass();
        throw null;
    L54:
        if (r16 == false) goto L71;
        ArrayList r112 = new ArrayList();
        r112.addAll(r15);
        r82.f789l.add(r112);
        r15.clear();
        RunnableC0367c r24 = new RunnableC0367c(r82, r112, r4);
        if (r10 == true) goto L61;
        if (r122 == true) goto L61;
        if (r14 == true) goto L61;
        r24.run();
    L61:
        if (r122 == false) goto L63;
        long r25 = r82.f880e;
    L64:
        if (r14 == false) goto L66;
        long r76 = r82.f881f;
    L67:
        Math.max(r25, r76);
        ((AbstractC0355O) r112.get(0)).getClass();
        Field r113 = AbstractC0080Q.f219a;
        throw null;
    L66:
        r76 = 0;
        goto L67
    L63:
        r25 = 0;
        goto L64
    L69:
        ((AbstractC0355O) r17.next()).getClass();
        throw null;
    L71:
        r75.getClass();
        return;
    L73:
        C0374j r77 = (C0374j) r7;
        int r114 = r77.f821v;
        ValueAnimator r26 = r77.f820u;
        if (r114 == 1) goto L77;
        if (r114 != 2) goto L112;
    L78:
        r77.f821v = 3;
        r26.setFloatValues(new float[]{((Float) r26.getAnimatedValue()).floatValue(), 0.0f});
        r26.setDuration(500);
        r26.start();
        return;
    L112:
        return;
    L77:
        r26.cancel();
        goto L78
    L80:
        ((C0245e) r7).m681m(0);
        return;
    L82:
        ViewOnTouchListenerC0218g r78 = (ViewOnTouchListenerC0218g) r7;
        if (r78.f459o == false) goto L114;
        boolean r115 = r78.f457m;
        C0212a r27 = r78.f445a;
        if (r115 == false) goto L89;
        r78.f457m = false;
        r27.getClass();
        long r32 = AnimationUtils.currentAnimationTimeMillis();
        r27.f439e = r32;
        r27.f441g = -1;
        r27.f440f = r32;
        r27.f442h = 0.5f;
    L89:
        if (r27.f441g <= 0) goto L94;
        if (AnimationUtils.currentAnimationTimeMillis() <= (r27.f441g + ((long) r27.f443i))) goto L94;
    L95:
        r78.f459o = false;
        return;
    L94:
        if (r78.m610e() == false) goto L95;
        boolean r116 = r78.f458n;
        View r33 = r78.f447c;
        if (r116 == false) goto L100;
        r78.f458n = false;
        long r102 = SystemClock.uptimeMillis();
        MotionEvent r117 = MotionEvent.obtain(r102, r102, 3, 0.0f, 0.0f, 0);
        r33.onTouchEvent(r117);
        r117.recycle();
    L100:
        if (r27.f440f == 0) goto L104;
        long r42 = AnimationUtils.currentAnimationTimeMillis();
        float r118 = r27.m592a(r42);
        long r83 = r42 - r27.f440f;
        r27.f440f = r42;
        r78.f461q.scrollListBy((int) ((r83 * ((r118 * 4.0f) + (((-4.0f) * r118) * r118))) * r27.f438d));
        Field r119 = AbstractC0080Q.f219a;
        r33.postOnAnimation(this);
        return;
    L104:
        throw new RuntimeException("Cannot compute scroll delta before calling start()");
    L114:
        return;
    L105:
        CheckableImageButton r120 = ((TextInputLayout) r7).f2467c.f122g;
        r120.performClick();
        r120.jumpDrawablesToCurrentState();
    }
}

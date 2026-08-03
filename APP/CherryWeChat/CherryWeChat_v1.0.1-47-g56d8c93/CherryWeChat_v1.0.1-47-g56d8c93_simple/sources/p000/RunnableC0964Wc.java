package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.AbstractC1166o;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: Wc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0964Wc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3003a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f3004b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1261cd f3005c;

    public /* synthetic */ RunnableC0964Wc(C1261cd r1, ArrayList r2, int r3) {
        this.f3003a = r3;
        this.f3005c = r1;
        this.f3004b = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f3003a) {
            case 0: goto L27;
            case 1: goto L10;
            default: goto L4;
        };
    L4:
        ArrayList r0 = this.f3004b;
        Iterator r1 = r0.iterator();
    L5:
        boolean r2 = r1.hasNext();
        C1261cd r3 = this.f3005c;
        if (r2 == false) goto L8;
        AbstractC1166o r22 = (AbstractC1166o) r1.next();
        r3.getClass();
        View r4 = r22.itemView;
        ViewPropertyAnimator r5 = r4.animate();
        r3.f4284o.add(r22);
        r5.alpha(1.0f).setDuration(r3.f4035c).setListener(new C1007Xc(r3, r22, r4, r5)).start();
        goto L5
    L8:
        r0.clear();
        r3.f4281l.remove(r0);
        return;
    L10:
        ArrayList r02 = this.f3004b;
        Iterator r12 = r02.iterator();
    L11:
        boolean r23 = r12.hasNext();
        C1261cd r42 = this.f3005c;
        if (r23 == false) goto L25;
        C1138ad r52 = (C1138ad) r12.next();
        ArrayList r24 = r42.f4287r;
        long r9 = r42.f4038f;
        AbstractC1166o r32 = r52.f3593a;
        View r6 = null;
        if (r32 != null) goto L16;
        View r7 = null;
    L17:
        AbstractC1166o r33 = r52.f3594b;
        if (r33 == null) goto L20;
        r6 = r33.itemView;
    L20:
        View r11 = r6;
        if (r7 == null) goto L23;
        ViewPropertyAnimator r62 = r7.animate().setDuration(r9);
        r24.add(r52.f3593a);
        r62.translationX(r52.f3597e - r52.f3595c);
        r62.translationY(r52.f3598f - r52.f3596d);
        r62.alpha(0.0f).setListener(new C1093Zc(r42, r52, r62, r7, 0)).start();
    L23:
        if (r11 == null) goto L11;
        ViewPropertyAnimator r63 = r11.animate();
        r24.add(r52.f3594b);
        r63.translationX(0.0f).translationY(0.0f).setDuration(r9).alpha(1.0f).setListener(new C1093Zc(r42, r52, r63, r11, 1)).start();
        goto L11
    L16:
        r7 = r32.itemView;
        goto L17
    L25:
        r02.clear();
        r42.f4283n.remove(r02);
        return;
    L27:
        ArrayList r03 = this.f3004b;
        Iterator r13 = r03.iterator();
    L28:
        boolean r25 = r13.hasNext();
        C1261cd r43 = this.f3005c;
        if (r25 == false) goto L36;
        C1218bd r26 = (C1218bd) r13.next();
        AbstractC1166o r53 = r26.f4152a;
        int r34 = r26.f4153b;
        int r64 = r26.f4154c;
        int r72 = r26.f4155d;
        int r27 = r26.f4156e;
        r43.getClass();
        View r73 = r53.itemView;
        int r35 = r72 - r34;
        int r8 = r27 - r64;
        if (r35 == 0) goto L33;
        r73.animate().translationX(0.0f);
    L33:
        if (r8 == 0) goto L35;
        r73.animate().translationY(0.0f);
    L35:
        ViewPropertyAnimator r92 = r73.animate();
        r43.f4285p.add(r53);
        r92.setDuration(r43.f4037e).setListener(new C1050Yc(r43, r53, r35, r73, r8, r92)).start();
        goto L28
    L36:
        r03.clear();
        r43.f4282m.remove(r03);
    }
}

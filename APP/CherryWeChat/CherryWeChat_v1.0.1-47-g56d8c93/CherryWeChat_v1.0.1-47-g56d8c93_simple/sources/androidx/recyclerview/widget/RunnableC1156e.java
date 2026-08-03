package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000.AbstractC2185lE;
import p000.C1007Xc;
import p000.C1138ad;
import p000.C1218bd;
import p000.C1261cd;
import p000.RunnableC0964Wc;

/* JADX INFO: renamed from: androidx.recyclerview.widget.e */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1156e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4030a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RecyclerView f4031b;

    public /* synthetic */ RunnableC1156e(RecyclerView r1, int r2) {
        this.f4030a = r2;
        this.f4031b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r1 = this.f4030a;
        RecyclerView r3 = this.f4031b;
        switch(r1) {
            case 0: goto L48;
            default: goto L4;
        };
    L4:
        AbstractC1159h r12 = r3.mItemAnimator;
        if (r12 == null) goto L44;
        C1261cd r13 = (C1261cd) r12;
        long r5 = r13.f4036d;
        ArrayList r7 = r13.f4277h;
        boolean r8 = r7.isEmpty();
        ArrayList r9 = r13.f4279j;
        boolean r10 = r9.isEmpty();
        ArrayList r11 = r13.f4280k;
        boolean r122 = r11.isEmpty();
        ArrayList r132 = r13.f4278i;
        boolean r14 = r132.isEmpty();
        if (r8 == false) goto L12;
        if (r10 == false) goto L12;
        if (r14 == false) goto L12;
        if (r122 == true) goto L44;
    L12:
        Iterator r15 = r7.iterator();
    L14:
        if (r15.hasNext() == false) goto L16;
        AbstractC1166o r2 = (AbstractC1166o) r15.next();
        View r4 = r2.itemView;
        ViewPropertyAnimator r0 = r4.animate();
        r13.f4286q.add(r2);
        r0.setDuration(r5).alpha(0.0f).setListener(new C1007Xc(r13, r2, r0, r4)).start();
        r7 = r7;
        r8 = r8;
        goto L14
    L16:
        boolean r18 = r8;
        r7.clear();
        if (r10 == true) goto L22;
        ArrayList r02 = new ArrayList();
        r02.addAll(r9);
        r13.f4282m.add(r02);
        r9.clear();
        RunnableC0964Wc r22 = new RunnableC0964Wc(r13, r02, 0);
        if (r18 == true) goto L21;
        View r03 = ((C1218bd) r02.get(0)).f4152a.itemView;
        WeakHashMap r42 = AbstractC2185lE.f7617a;
        r03.postOnAnimationDelayed(r22, r5);
        goto L22
    L21:
        r22.run();
    L22:
        if (r122 == true) goto L27;
        ArrayList r04 = new ArrayList();
        r04.addAll(r11);
        r13.f4283n.add(r04);
        r11.clear();
        RunnableC0964Wc r23 = new RunnableC0964Wc(r13, r04, 1);
        if (r18 == true) goto L26;
        View r05 = ((C1138ad) r04.get(0)).f3593a.itemView;
        WeakHashMap r43 = AbstractC2185lE.f7617a;
        r05.postOnAnimationDelayed(r23, r5);
        goto L27
    L26:
        r23.run();
    L27:
        if (r14 == true) goto L44;
        ArrayList r06 = new ArrayList();
        r06.addAll(r132);
        r13.f4281l.add(r06);
        r132.clear();
        RunnableC0964Wc r24 = new RunnableC0964Wc(r13, r06, 2);
        if (r18 == false) goto L34;
        if (r10 == false) goto L34;
        if (r122 == false) goto L34;
        r24.run();
    L34:
        long r72 = 0;
        if (r18 == false) goto L38;
        r5 = 0;
    L38:
        if (r10 == true) goto L40;
        long r92 = r13.f4037e;
    L41:
        if (r122 == true) goto L43;
        r72 = r13.f4038f;
    L43:
        long r73 = Math.max(r92, r72) + r5;
        boolean r44 = false;
        View r07 = ((AbstractC1166o) r06.get(0)).itemView;
        WeakHashMap r16 = AbstractC2185lE.f7617a;
        r07.postOnAnimationDelayed(r24, r73);
    L45:
        r3.mPostedAnimatorRunner = r44;
        return;
    L40:
        r92 = 0;
    L44:
        r44 = false;
        goto L45
    L48:
        if (r3.mFirstLayoutComplete == true) goto L50;
        return;
    L50:
        if (r3.isLayoutRequested() == false) goto L53;
        return;
    L53:
        if (r3.mIsAttached == true) goto L56;
        r3.requestLayout();
        return;
    L56:
        if (r3.mLayoutSuppressed == false) goto L58;
        r3.mLayoutWasDefered = true;
        return;
    L58:
        r3.consumePendingUpdateOperations();
    }
}

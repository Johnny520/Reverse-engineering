package p034S;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import com.abc.core.features.C0588G;
import com.abc.core.features.ConfigStore;
import com.abc.ui.C0755p;
import com.abc.ui.FloatingBottomTabView;
import java.io.File;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import p001A0.AbstractC0040p;
import p026N0.AbstractC0270k;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p042W0.AbstractC0416a;

/* JADX INFO: renamed from: S.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0321a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f609a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f610b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f611c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f612d;

    public /* synthetic */ RunnableC0321a(int r1, Object r2, Object r3, int r4) {
        this.f609a = r4;
        this.f610b = r1;
        this.f611c = r2;
        this.f612d = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f609a) {
            case 0: goto L38;
            case 1: goto L36;
            case 2: goto L11;
            default: goto L4;
        };
    L4:
        View r3 = (View) this.f611c;
        View r4 = (View) this.f612d;
        int r5 = this.f610b;
        if (r3 == null) goto L9;
        if (r4 == null) goto L9;
        if (r5 <= 0) goto L9;
        AbstractC0358S.f739s = true;
        r3.setLayerType(2, null);
        AnimatorSet r6 = new AnimatorSet();
        r6.playTogether(new Animator[]{ObjectAnimator.ofFloat(r3, View.TRANSLATION_X, new float[]{r3.getTranslationX(), -r5}), ObjectAnimator.ofFloat(r4, View.ALPHA, new float[]{r4.getAlpha(), 0.0f})});
        r6.setDuration(160);
        r6.setInterpolator(new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f));
        r6.addListener(new C0755p((LinearLayout) r3, 0));
        r6.start();
        return;
    L9:
        AbstractC0358S.m898n(false);
        return;
    L11:
        int r02 = this.f610b;
        List r1 = (List) this.f611c;
        String r2 = (String) this.f612d;
        AbstractC0307g.m703e(r1, "$targets");
        AbstractC0307g.m703e(r2, "$body");
        Object r32 = ConfigStore.f2052e;
        monitor-enter(r32);
    L30:
        th = move-exception;
        throw th;
    L14:
        if (r02 == ConfigStore.f2051d.get()) goto L17;
        monitor-exit(r32);
        return;
    L17:
        Iterator r03 = r1.iterator();     // Catch: Throwable -> L30
    L18:
        if (r03.hasNext() == false) goto L32;
        File r12 = (File) r03.next();     // Catch: Throwable -> L30
        ConfigStore r42 = ConfigStore.f2048a;     // Catch: Throwable -> L30
        File r43 = r12.getParentFile();     // Catch: Throwable -> L24
    L22:
        if (r43 == null) goto L26;
        r43.mkdirs();     // Catch: Throwable -> L24
    L26:
        AbstractC0270k.m693j0(r12, r2, AbstractC0416a.f921a);     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        AbstractC0040p.m116u(th);     // Catch: Throwable -> L30
        goto L18
    L32:
        monitor-exit(r32);
        return;
    L36:
        FloatingBottomTabView r13 = (FloatingBottomTabView) this.f611c;
        AbstractC0307g.m703e(r13, "$bar");
        ViewGroup r33 = (ViewGroup) this.f612d;
        AbstractC0307g.m703e(r33, "$parent");
        C0588G.m1419f(r13, r33, this.f610b - 1);
        return;
    L38:
        ((C0322b) this.f611c).f614b.mo348n(this.f610b, (Serializable) this.f612d);
    }

    public /* synthetic */ RunnableC0321a(C0322b r2, int r3, Serializable r4) {
        this.f609a = 0;
        this.f611c = r2;
        this.f610b = r3;
        this.f612d = r4;
    }

    public /* synthetic */ RunnableC0321a(LinearLayout r2, View r3, int r4) {
        this.f609a = 3;
        this.f611c = r2;
        this.f612d = r3;
        this.f610b = r4;
    }
}

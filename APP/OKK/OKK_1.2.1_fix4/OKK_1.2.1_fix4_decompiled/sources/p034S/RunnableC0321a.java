package p034S;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import java.io.File;
import java.io.Serializable;
import java.util.List;
import p001A0.AbstractC0040p;
import p026N0.AbstractC0270k;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p042W0.AbstractC0416a;
import p050c0.C0588G;
import p050c0.C0661h1;
import p052d0.C0755p;
import p052d0.C0758s;

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

    public /* synthetic */ RunnableC0321a(int i2, Object obj, Object obj2, int i3) {
        this.f609a = i3;
        this.f610b = i2;
        this.f611c = obj;
        this.f612d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f609a) {
            case 0:
                ((C0322b) this.f611c).f614b.mo348n(this.f610b, (Serializable) this.f612d);
                return;
            case 1:
                C0758s c0758s = (C0758s) this.f611c;
                AbstractC0307g.m703e(c0758s, "$bar");
                ViewGroup viewGroup = (ViewGroup) this.f612d;
                AbstractC0307g.m703e(viewGroup, "$parent");
                C0588G.m1419f(c0758s, viewGroup, this.f610b - 1);
                return;
            case 2:
                int i2 = this.f610b;
                List<File> list = (List) this.f611c;
                String str = (String) this.f612d;
                AbstractC0307g.m703e(list, "$targets");
                AbstractC0307g.m703e(str, "$body");
                synchronized (C0661h1.f2052e) {
                    if (i2 != C0661h1.f2051d.get()) {
                        return;
                    }
                    for (File file : list) {
                        C0661h1 c0661h1 = C0661h1.f2048a;
                        try {
                            File parentFile = file.getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                            AbstractC0270k.m693j0(file, str, AbstractC0416a.f921a);
                        } catch (Throwable th) {
                            AbstractC0040p.m116u(th);
                        }
                        break;
                    }
                    return;
                }
            default:
                View view = (View) this.f611c;
                View view2 = (View) this.f612d;
                int i3 = this.f610b;
                if (view == null || view2 == null || i3 <= 0) {
                    AbstractC0358S.m898n(false);
                    return;
                }
                AbstractC0358S.f739s = true;
                view.setLayerType(2, null);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, view.getTranslationX(), -i3), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, view2.getAlpha(), 0.0f));
                animatorSet.setDuration(160L);
                animatorSet.setInterpolator(new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f));
                animatorSet.addListener(new C0755p((LinearLayout) view, 0));
                animatorSet.start();
                return;
        }
    }

    public /* synthetic */ RunnableC0321a(C0322b c0322b, int i2, Serializable serializable) {
        this.f609a = 0;
        this.f611c = c0322b;
        this.f610b = i2;
        this.f612d = serializable;
    }

    public /* synthetic */ RunnableC0321a(LinearLayout linearLayout, View view, int i2) {
        this.f609a = 3;
        this.f611c = linearLayout;
        this.f612d = view;
        this.f610b = i2;
    }
}

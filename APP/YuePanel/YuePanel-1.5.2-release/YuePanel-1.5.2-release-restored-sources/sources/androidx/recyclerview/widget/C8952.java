package androidx.recyclerview.widget;

import Yue.C6193;
import Yue.C8273;
import Yue.InterfaceC6391;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8952 extends AbstractC8991 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final boolean f30109 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static TimeInterpolator f30110;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public ArrayList<RecyclerView.AbstractC8938> f30111 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public ArrayList<RecyclerView.AbstractC8938> f30112 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public ArrayList<C8960> f30113 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public ArrayList<C8959> f30114 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public ArrayList<ArrayList<RecyclerView.AbstractC8938>> f30115 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public ArrayList<ArrayList<C8960>> f30116 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public ArrayList<ArrayList<C8959>> f30117 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public ArrayList<RecyclerView.AbstractC8938> f30118 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public ArrayList<RecyclerView.AbstractC8938> f30119 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public ArrayList<RecyclerView.AbstractC8938> f30120 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public ArrayList<RecyclerView.AbstractC8938> f30121 = new ArrayList<>();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ */
    public class RunnableC1765 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ArrayList f30122;

        public RunnableC1765(ArrayList arrayList) {
            this.f30122 = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (C8960 c8960 : this.f30122) {
                C8952.this.m30560(c8960.f3939, c8960.f3940, c8960.f30144, c8960.f30145, c8960.f30146);
            }
            this.f30122.clear();
            C8952.this.f30116.remove(this.f30122);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟ */
    public class RunnableC1766 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ArrayList f30124;

        public RunnableC1766(ArrayList arrayList) {
            this.f30124 = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f30124.iterator();
            while (it.hasNext()) {
                C8952.this.m30559((C8959) it.next());
            }
            this.f30124.clear();
            C8952.this.f30117.remove(this.f30124);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟, reason: contains not printable characters */
    public class RunnableC8953 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ArrayList f30126;

        public RunnableC8953(ArrayList arrayList) {
            this.f30126 = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f30126.iterator();
            while (it.hasNext()) {
                C8952.this.m30558((RecyclerView.AbstractC8938) it.next());
            }
            this.f30126.clear();
            C8952.this.f30115.remove(this.f30126);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟, reason: contains not printable characters */
    public class C8954 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ RecyclerView.AbstractC8938 f3927;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ ViewPropertyAnimator f3928;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ View f30128;

        public C8954(RecyclerView.AbstractC8938 abstractC8938, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3927 = abstractC8938;
            this.f3928 = viewPropertyAnimator;
            this.f30128 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3928.setListener(null);
            this.f30128.setAlpha(1.0f);
            C8952.this.m30732(this.f3927);
            C8952.this.f30120.remove(this.f3927);
            C8952.this.m30563();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C8952.this.m30733(this.f3927);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C8955 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ RecyclerView.AbstractC8938 f3929;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ View f3930;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ ViewPropertyAnimator f30130;

        public C8955(RecyclerView.AbstractC8938 abstractC8938, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3929 = abstractC8938;
            this.f3930 = view;
            this.f30130 = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3930.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f30130.setListener(null);
            C8952.this.m30726(this.f3929);
            C8952.this.f30118.remove(this.f3929);
            C8952.this.m30563();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C8952.this.m30727(this.f3929);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟۠, reason: contains not printable characters */
    public class C8956 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ RecyclerView.AbstractC8938 f3931;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ int f3932;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ View f30132;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ int f30133;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ ViewPropertyAnimator f30134;

        public C8956(RecyclerView.AbstractC8938 abstractC8938, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3931 = abstractC8938;
            this.f3932 = i;
            this.f30132 = view;
            this.f30133 = i2;
            this.f30134 = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f3932 != 0) {
                this.f30132.setTranslationX(0.0f);
            }
            if (this.f30133 != 0) {
                this.f30132.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f30134.setListener(null);
            C8952.this.m30730(this.f3931);
            C8952.this.f30119.remove(this.f3931);
            C8952.this.m30563();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C8952.this.m30731(this.f3931);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public class C8957 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ C8959 f3933;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ ViewPropertyAnimator f3934;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ View f30136;

        public C8957(C8959 c8959, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3933 = c8959;
            this.f3934 = viewPropertyAnimator;
            this.f30136 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3934.setListener(null);
            this.f30136.setAlpha(1.0f);
            this.f30136.setTranslationX(0.0f);
            this.f30136.setTranslationY(0.0f);
            C8952.this.m30728(this.f3933.f3937, true);
            C8952.this.f30121.remove(this.f3933.f3937);
            C8952.this.m30563();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C8952.this.m30729(this.f3933.f3937, true);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public class C8958 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ C8959 f3935;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ ViewPropertyAnimator f3936;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ View f30138;

        public C8958(C8959 c8959, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3935 = c8959;
            this.f3936 = viewPropertyAnimator;
            this.f30138 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3936.setListener(null);
            this.f30138.setAlpha(1.0f);
            this.f30138.setTranslationX(0.0f);
            this.f30138.setTranslationY(0.0f);
            C8952.this.m30728(this.f3935.f3938, false);
            C8952.this.f30121.remove(this.f3935.f3938);
            C8952.this.m30563();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C8952.this.m30729(this.f3935.f3938, false);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static class C8960 {

        /* JADX INFO: renamed from: ۥ */
        public RecyclerView.AbstractC8938 f3939;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3940;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f30144;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f30145;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f30146;

        public C8960(RecyclerView.AbstractC8938 abstractC8938, int i, int i2, int i3, int i4) {
            this.f3939 = abstractC8938;
            this.f3940 = i;
            this.f30144 = i2;
            this.f30145 = i3;
            this.f30146 = i4;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8914
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public boolean mo30274(@InterfaceC6391 RecyclerView.AbstractC8938 abstractC8938, @InterfaceC6391 List<Object> list) {
        return !list.isEmpty() || super.mo30274(abstractC8938, list);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0011 */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8914
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public void mo30278(RecyclerView.AbstractC8938 abstractC8938) {
        View view = abstractC8938.itemView;
        view.animate().cancel();
        int size = this.f30113.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f30113.get(size).f3939 == abstractC8938) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m30730(abstractC8938);
                this.f30113.remove(size);
            }
        }
        m30564(this.f30114, abstractC8938);
        if (this.f30111.remove(abstractC8938)) {
            view.setAlpha(1.0f);
            m30732(abstractC8938);
        }
        if (this.f30112.remove(abstractC8938)) {
            view.setAlpha(1.0f);
            m30726(abstractC8938);
        }
        for (int size2 = this.f30117.size() - 1; size2 >= 0; size2--) {
            ArrayList<C8959> arrayList = this.f30117.get(size2);
            m30564(arrayList, abstractC8938);
            if (arrayList.isEmpty()) {
                this.f30117.remove(size2);
            }
        }
        for (int size3 = this.f30116.size() - 1; size3 >= 0; size3--) {
            ArrayList<C8960> arrayList2 = this.f30116.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f3939 == abstractC8938) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m30730(abstractC8938);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f30116.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f30115.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.AbstractC8938> arrayList3 = this.f30115.get(size5);
            if (arrayList3.remove(abstractC8938)) {
                view.setAlpha(1.0f);
                m30726(abstractC8938);
                if (arrayList3.isEmpty()) {
                    this.f30115.remove(size5);
                }
            }
        }
        this.f30120.remove(abstractC8938);
        this.f30118.remove(abstractC8938);
        this.f30121.remove(abstractC8938);
        this.f30119.remove(abstractC8938);
        m30563();
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:10:0x004f */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0008 */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8914
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo30279() {
        int size = this.f30113.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C8960 c8960 = this.f30113.get(size);
            View view = c8960.f3939.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m30730(c8960.f3939);
            this.f30113.remove(size);
        }
        for (int size2 = this.f30111.size() - 1; size2 >= 0; size2--) {
            m30732(this.f30111.get(size2));
            this.f30111.remove(size2);
        }
        int size3 = this.f30112.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC8938 abstractC8938 = this.f30112.get(size3);
            abstractC8938.itemView.setAlpha(1.0f);
            m30726(abstractC8938);
            this.f30112.remove(size3);
        }
        for (int size4 = this.f30114.size() - 1; size4 >= 0; size4--) {
            m30565(this.f30114.get(size4));
        }
        this.f30114.clear();
        if (mo30284()) {
            for (int size5 = this.f30116.size() - 1; size5 >= 0; size5--) {
                ArrayList<C8960> arrayList = this.f30116.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C8960 c89602 = arrayList.get(size6);
                    View view2 = c89602.f3939.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m30730(c89602.f3939);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f30116.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f30115.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.AbstractC8938> arrayList2 = this.f30115.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.AbstractC8938 abstractC89382 = arrayList2.get(size8);
                    abstractC89382.itemView.setAlpha(1.0f);
                    m30726(abstractC89382);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f30115.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f30117.size() - 1; size9 >= 0; size9--) {
                ArrayList<C8959> arrayList3 = this.f30117.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m30565(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f30117.remove(arrayList3);
                    }
                }
            }
            m30562(this.f30120);
            m30562(this.f30119);
            m30562(this.f30118);
            m30562(this.f30121);
            m30277();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8914
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public boolean mo30284() {
        return (this.f30112.isEmpty() && this.f30114.isEmpty() && this.f30113.isEmpty() && this.f30111.isEmpty() && this.f30119.isEmpty() && this.f30120.isEmpty() && this.f30118.isEmpty() && this.f30121.isEmpty() && this.f30116.isEmpty() && this.f30115.isEmpty() && this.f30117.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8914
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public void mo30291() {
        boolean z = !this.f30111.isEmpty();
        boolean z2 = !this.f30113.isEmpty();
        boolean z3 = !this.f30114.isEmpty();
        boolean z4 = !this.f30112.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.AbstractC8938> it = this.f30111.iterator();
            while (it.hasNext()) {
                m30561(it.next());
            }
            this.f30111.clear();
            if (z2) {
                ArrayList<C8960> arrayList = new ArrayList<>();
                arrayList.addAll(this.f30113);
                this.f30116.add(arrayList);
                this.f30113.clear();
                RunnableC1765 runnableC1765 = new RunnableC1765(arrayList);
                if (z) {
                    C8273.m27428(arrayList.get(0).f3939.itemView, runnableC1765, m30283());
                } else {
                    runnableC1765.run();
                }
            }
            if (z3) {
                ArrayList<C8959> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f30114);
                this.f30117.add(arrayList2);
                this.f30114.clear();
                RunnableC1766 runnableC1766 = new RunnableC1766(arrayList2);
                if (z) {
                    C8273.m27428(arrayList2.get(0).f3937.itemView, runnableC1766, m30283());
                } else {
                    runnableC1766.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.AbstractC8938> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f30112);
                this.f30115.add(arrayList3);
                this.f30112.clear();
                RunnableC8953 runnableC8953 = new RunnableC8953(arrayList3);
                if (z || z2 || z3) {
                    C8273.m27428(arrayList3.get(0).itemView, runnableC8953, (z ? m30283() : 0L) + Math.max(z2 ? m30282() : 0L, z3 ? m30281() : 0L));
                } else {
                    runnableC8953.run();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC8991
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean mo30554(RecyclerView.AbstractC8938 abstractC8938) {
        m30567(abstractC8938);
        abstractC8938.itemView.setAlpha(0.0f);
        this.f30112.add(abstractC8938);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC8991
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public boolean mo30555(RecyclerView.AbstractC8938 abstractC8938, RecyclerView.AbstractC8938 abstractC89382, int i, int i2, int i3, int i4) {
        if (abstractC8938 == abstractC89382) {
            return mo30556(abstractC8938, i, i2, i3, i4);
        }
        float translationX = abstractC8938.itemView.getTranslationX();
        float translationY = abstractC8938.itemView.getTranslationY();
        float alpha = abstractC8938.itemView.getAlpha();
        m30567(abstractC8938);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        abstractC8938.itemView.setTranslationX(translationX);
        abstractC8938.itemView.setTranslationY(translationY);
        abstractC8938.itemView.setAlpha(alpha);
        if (abstractC89382 != null) {
            m30567(abstractC89382);
            abstractC89382.itemView.setTranslationX(-i5);
            abstractC89382.itemView.setTranslationY(-i6);
            abstractC89382.itemView.setAlpha(0.0f);
        }
        this.f30114.add(new C8959(abstractC8938, abstractC89382, i, i2, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC8991
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public boolean mo30556(RecyclerView.AbstractC8938 abstractC8938, int i, int i2, int i3, int i4) {
        View view = abstractC8938.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC8938.itemView.getTranslationY());
        m30567(abstractC8938);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m30730(abstractC8938);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f30113.add(new C8960(abstractC8938, translationX, translationY, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC8991
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public boolean mo30557(RecyclerView.AbstractC8938 abstractC8938) {
        m30567(abstractC8938);
        this.f30111.add(abstractC8938);
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m30558(RecyclerView.AbstractC8938 abstractC8938) {
        View view = abstractC8938.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f30118.add(abstractC8938);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(m30280()).setListener(new C8955(abstractC8938, view, viewPropertyAnimatorAnimate)).start();
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public void m30559(C8959 c8959) {
        RecyclerView.AbstractC8938 abstractC8938 = c8959.f3937;
        View view = abstractC8938 == null ? null : abstractC8938.itemView;
        RecyclerView.AbstractC8938 abstractC89382 = c8959.f3938;
        View view2 = abstractC89382 != null ? abstractC89382.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m30281());
            this.f30121.add(c8959.f3937);
            duration.translationX(c8959.f30142 - c8959.f30140);
            duration.translationY(c8959.f30143 - c8959.f30141);
            duration.alpha(0.0f).setListener(new C8957(c8959, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f30121.add(c8959.f3938);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m30281()).alpha(1.0f).setListener(new C8958(c8959, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void m30560(RecyclerView.AbstractC8938 abstractC8938, int i, int i2, int i3, int i4) {
        View view = abstractC8938.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f30119.add(abstractC8938);
        viewPropertyAnimatorAnimate.setDuration(m30282()).setListener(new C8956(abstractC8938, i5, view, i6, viewPropertyAnimatorAnimate)).start();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public final void m30561(RecyclerView.AbstractC8938 abstractC8938) {
        View view = abstractC8938.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f30120.add(abstractC8938);
        viewPropertyAnimatorAnimate.setDuration(m30283()).alpha(0.0f).setListener(new C8954(abstractC8938, viewPropertyAnimatorAnimate, view)).start();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public void m30562(List<RecyclerView.AbstractC8938> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public void m30563() {
        if (mo30284()) {
            return;
        }
        m30277();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public final void m30564(List<C8959> list, RecyclerView.AbstractC8938 abstractC8938) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C8959 c8959 = list.get(size);
            if (m30566(c8959, abstractC8938) && c8959.f3937 == null && c8959.f3938 == null) {
                list.remove(c8959);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public final void m30565(C8959 c8959) {
        RecyclerView.AbstractC8938 abstractC8938 = c8959.f3937;
        if (abstractC8938 != null) {
            m30566(c8959, abstractC8938);
        }
        RecyclerView.AbstractC8938 abstractC89382 = c8959.f3938;
        if (abstractC89382 != null) {
            m30566(c8959, abstractC89382);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public final boolean m30566(C8959 c8959, RecyclerView.AbstractC8938 abstractC8938) {
        boolean z = false;
        if (c8959.f3938 == abstractC8938) {
            c8959.f3938 = null;
        } else {
            if (c8959.f3937 != abstractC8938) {
                return false;
            }
            c8959.f3937 = null;
            z = true;
        }
        abstractC8938.itemView.setAlpha(1.0f);
        abstractC8938.itemView.setTranslationX(0.0f);
        abstractC8938.itemView.setTranslationY(0.0f);
        m30728(abstractC8938, z);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public final void m30567(RecyclerView.AbstractC8938 abstractC8938) {
        if (f30110 == null) {
            f30110 = new ValueAnimator().getInterpolator();
        }
        abstractC8938.itemView.animate().setInterpolator(f30110);
        mo30278(abstractC8938);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟, reason: contains not printable characters */
    public static class C8959 {

        /* JADX INFO: renamed from: ۥ */
        public RecyclerView.AbstractC8938 f3937;

        /* JADX INFO: renamed from: ۥ۟ */
        public RecyclerView.AbstractC8938 f3938;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f30140;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f30141;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f30142;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f30143;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8959(RecyclerView.AbstractC8938 abstractC8938, RecyclerView.AbstractC8938 abstractC89382) {
            this.f3937 = abstractC8938;
            this.f3938 = abstractC89382;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3937 + ", newHolder=" + this.f3938 + ", fromX=" + this.f30140 + ", fromY=" + this.f30141 + ", toX=" + this.f30142 + ", toY=" + this.f30143 + C6193.f1885;
        }

        public C8959(RecyclerView.AbstractC8938 abstractC8938, RecyclerView.AbstractC8938 abstractC89382, int i, int i2, int i3, int i4) {
            this(abstractC8938, abstractC89382);
            this.f30140 = i;
            this.f30141 = i2;
            this.f30142 = i3;
            this.f30143 = i4;
        }
    }
}

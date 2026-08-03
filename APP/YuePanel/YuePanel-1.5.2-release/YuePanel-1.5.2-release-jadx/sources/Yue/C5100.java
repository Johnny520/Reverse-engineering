package Yue;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(21)
public class C5100 extends AbstractC5104 {

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۥ$ۥ */
    public class C0641 extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ Rect f1273;

        public C0641(Rect rect) {
            this.f1273 = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f1273;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۥ$ۥ۟ */
    public class C0642 implements Transition.TransitionListener {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ View f1275;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ ArrayList f1276;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C0642(View view, ArrayList arrayList) {
            this.f1275 = view;
            this.f1276 = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f1275.setVisibility(8);
            int size = this.f1276.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f1276.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۥ$ۥ۟۟, reason: contains not printable characters */
    public class C5101 implements Transition.TransitionListener {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ Object f1277;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ ArrayList f1278;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ Object f12082;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ ArrayList f12083;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ Object f12084;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ArrayList f12085;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C5101(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f1277 = obj;
            this.f1278 = arrayList;
            this.f12082 = obj2;
            this.f12083 = arrayList2;
            this.f12084 = obj3;
            this.f12085 = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f1277;
            if (obj != null) {
                C5100.this.mo15747(obj, this.f1278, null);
            }
            Object obj2 = this.f12082;
            if (obj2 != null) {
                C5100.this.mo15747(obj2, this.f12083, null);
            }
            Object obj3 = this.f12084;
            if (obj3 != null) {
                C5100.this.mo15747(obj3, this.f12085, null);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۥ$ۥ۟۟۟, reason: contains not printable characters */
    public class C5102 implements Transition.TransitionListener {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ Runnable f1279;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C5102(Runnable runnable) {
            this.f1279 = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f1279.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C5103 extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ Rect f1281;

        public C5103(Rect rect) {
            this.f1281 = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f1281;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f1281;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static boolean m15740(Transition transition) {
        return (AbstractC5104.m15758(transition.getTargetIds()) && AbstractC5104.m15758(transition.getTargetNames()) && AbstractC5104.m15758(transition.getTargetTypes())) ? false : true;
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ */
    public void mo1920(@InterfaceC6391 Object obj, @InterfaceC6391 View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo1921(@InterfaceC6391 Object obj, @InterfaceC6391 ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo1921(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (m15740(transition) || !AbstractC5104.m15758(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget(arrayList.get(i));
            i++;
        }
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void mo15741(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6490 Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean mo15742(@InterfaceC6391 Object obj) {
        return obj instanceof Transition;
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Object mo15743(@InterfaceC6490 Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public Object mo15744(@InterfaceC6490 Object obj, @InterfaceC6490 Object obj2, @InterfaceC6490 Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public Object mo15745(@InterfaceC6490 Object obj, @InterfaceC6490 Object obj2, @InterfaceC6490 Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void mo15746(@InterfaceC6391 Object obj, @InterfaceC6391 View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void mo15747(@InterfaceC6391 Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo15747(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m15740(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget(arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void mo15748(@InterfaceC6391 Object obj, @InterfaceC6391 View view, @InterfaceC6391 ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C0642(view, arrayList));
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void mo15749(@InterfaceC6391 Object obj, @InterfaceC6490 Object obj2, @InterfaceC6490 ArrayList<View> arrayList, @InterfaceC6490 Object obj3, @InterfaceC6490 ArrayList<View> arrayList2, @InterfaceC6490 Object obj4, @InterfaceC6490 ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C5101(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void mo15750(@InterfaceC6391 Object obj, @InterfaceC6391 Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C5103(rect));
        }
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void mo15751(@InterfaceC6391 Object obj, @InterfaceC6490 View view) {
        if (view != null) {
            Rect rect = new Rect();
            m15759(view, rect);
            ((Transition) obj).setEpicenterCallback(new C0641(rect));
        }
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void mo15752(@InterfaceC6391 Fragment fragment, @InterfaceC6391 Object obj, @InterfaceC6391 C3674 c3674, @InterfaceC6391 Runnable runnable) {
        ((Transition) obj).addListener(new C5102(runnable));
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void mo15753(@InterfaceC6391 Object obj, @InterfaceC6391 View view, @InterfaceC6391 ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC5104.m15756(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo1921(transitionSet, arrayList);
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void mo15754(@InterfaceC6490 Object obj, @InterfaceC6490 ArrayList<View> arrayList, @InterfaceC6490 ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo15747(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public Object mo15755(@InterfaceC6490 Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }
}

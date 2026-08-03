package Yue;

import Yue.AbstractC7956;
import Yue.C3674;
import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C5106 extends AbstractC5104 {

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۨ$ۥ */
    public class C0644 extends AbstractC7956.AbstractC7960 {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ Rect f1285;

        public C0644(Rect rect) {
            this.f1285 = rect;
        }

        @Override // Yue.AbstractC7956.AbstractC7960
        /* JADX INFO: renamed from: ۥ */
        public Rect mo1922(@InterfaceC6391 AbstractC7956 abstractC7956) {
            return this.f1285;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۨ$ۥ۟ */
    public class C0645 implements AbstractC7956.InterfaceC7964 {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ View f1287;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ ArrayList f1288;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C0645(View view, ArrayList arrayList) {
            this.f1287 = view;
            this.f1288 = arrayList;
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionCancel(@InterfaceC6391 AbstractC7956 abstractC7956) {
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionEnd(@InterfaceC6391 AbstractC7956 abstractC7956) {
            abstractC7956.removeListener(this);
            this.f1287.setVisibility(8);
            int size = this.f1288.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f1288.get(i)).setVisibility(0);
            }
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionPause(@InterfaceC6391 AbstractC7956 abstractC7956) {
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionResume(@InterfaceC6391 AbstractC7956 abstractC7956) {
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionStart(@InterfaceC6391 AbstractC7956 abstractC7956) {
            abstractC7956.removeListener(this);
            abstractC7956.addListener(this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۨ$ۥ۟۟, reason: contains not printable characters */
    public class C5107 extends C7985 {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ Object f1289;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ ArrayList f1290;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ Object f12095;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ ArrayList f12096;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ Object f12097;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ArrayList f12098;

        public C5107(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f1289 = obj;
            this.f1290 = arrayList;
            this.f12095 = obj2;
            this.f12096 = arrayList2;
            this.f12097 = obj3;
            this.f12098 = arrayList3;
        }

        @Override // Yue.C7985, Yue.AbstractC7956.InterfaceC7964
        public void onTransitionEnd(@InterfaceC6391 AbstractC7956 abstractC7956) {
            abstractC7956.removeListener(this);
        }

        @Override // Yue.C7985, Yue.AbstractC7956.InterfaceC7964
        public void onTransitionStart(@InterfaceC6391 AbstractC7956 abstractC7956) {
            Object obj = this.f1289;
            if (obj != null) {
                C5106.this.mo15747(obj, this.f1290, null);
            }
            Object obj2 = this.f12095;
            if (obj2 != null) {
                C5106.this.mo15747(obj2, this.f12096, null);
            }
            Object obj3 = this.f12097;
            if (obj3 != null) {
                C5106.this.mo15747(obj3, this.f12098, null);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۨ$ۥ۟۟۟, reason: contains not printable characters */
    public class C5108 implements AbstractC7956.InterfaceC7964 {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ Runnable f1291;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C5108(Runnable runnable) {
            this.f1291 = runnable;
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionCancel(@InterfaceC6391 AbstractC7956 abstractC7956) {
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionEnd(@InterfaceC6391 AbstractC7956 abstractC7956) {
            this.f1291.run();
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionPause(@InterfaceC6391 AbstractC7956 abstractC7956) {
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionResume(@InterfaceC6391 AbstractC7956 abstractC7956) {
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionStart(@InterfaceC6391 AbstractC7956 abstractC7956) {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۨ$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C5109 extends AbstractC7956.AbstractC7960 {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ Rect f1293;

        public C5109(Rect rect) {
            this.f1293 = rect;
        }

        @Override // Yue.AbstractC7956.AbstractC7960
        /* JADX INFO: renamed from: ۥ */
        public Rect mo1922(@InterfaceC6391 AbstractC7956 abstractC7956) {
            Rect rect = this.f1293;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f1293;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static boolean m15763(AbstractC7956 abstractC7956) {
        return (AbstractC5104.m15758(abstractC7956.getTargetIds()) && AbstractC5104.m15758(abstractC7956.getTargetNames()) && AbstractC5104.m15758(abstractC7956.getTargetTypes())) ? false : true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m15764(Runnable runnable, AbstractC7956 abstractC7956, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            abstractC7956.cancel();
            runnable2.run();
        }
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ */
    public void mo1920(@InterfaceC6391 Object obj, @InterfaceC6391 View view) {
        if (obj != null) {
            ((AbstractC7956) obj).addTarget(view);
        }
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo1921(@InterfaceC6391 Object obj, @InterfaceC6391 ArrayList<View> arrayList) {
        AbstractC7956 abstractC7956 = (AbstractC7956) obj;
        if (abstractC7956 == null) {
            return;
        }
        int i = 0;
        if (abstractC7956 instanceof C7991) {
            C7991 c7991 = (C7991) abstractC7956;
            int iM25185 = c7991.m25185();
            while (i < iM25185) {
                mo1921(c7991.m25184(i), arrayList);
                i++;
            }
            return;
        }
        if (m15763(abstractC7956) || !AbstractC5104.m15758(abstractC7956.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            abstractC7956.addTarget(arrayList.get(i));
            i++;
        }
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo15741(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6490 Object obj) {
        C7986.m3997(viewGroup, (AbstractC7956) obj);
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public boolean mo15742(@InterfaceC6391 Object obj) {
        return obj instanceof AbstractC7956;
    }

    @Override // Yue.AbstractC5104
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public Object mo15743(@InterfaceC6490 Object obj) {
        if (obj != null) {
            return ((AbstractC7956) obj).mo25123clone();
        }
        return null;
    }

    @Override // Yue.AbstractC5104
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public Object mo15744(@InterfaceC6490 Object obj, @InterfaceC6490 Object obj2, @InterfaceC6490 Object obj3) {
        AbstractC7956 abstractC7956M25195 = (AbstractC7956) obj;
        AbstractC7956 abstractC7956 = (AbstractC7956) obj2;
        AbstractC7956 abstractC79562 = (AbstractC7956) obj3;
        if (abstractC7956M25195 != null && abstractC7956 != null) {
            abstractC7956M25195 = new C7991().m25181(abstractC7956M25195).m25181(abstractC7956).m25195(1);
        } else if (abstractC7956M25195 == null) {
            abstractC7956M25195 = abstractC7956 != null ? abstractC7956 : null;
        }
        if (abstractC79562 == null) {
            return abstractC7956M25195;
        }
        C7991 c7991 = new C7991();
        if (abstractC7956M25195 != null) {
            c7991.m25181(abstractC7956M25195);
        }
        c7991.m25181(abstractC79562);
        return c7991;
    }

    @Override // Yue.AbstractC5104
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public Object mo15745(@InterfaceC6490 Object obj, @InterfaceC6490 Object obj2, @InterfaceC6490 Object obj3) {
        C7991 c7991 = new C7991();
        if (obj != null) {
            c7991.m25181((AbstractC7956) obj);
        }
        if (obj2 != null) {
            c7991.m25181((AbstractC7956) obj2);
        }
        if (obj3 != null) {
            c7991.m25181((AbstractC7956) obj3);
        }
        return c7991;
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public void mo15746(@InterfaceC6391 Object obj, @InterfaceC6391 View view) {
        if (obj != null) {
            ((AbstractC7956) obj).removeTarget(view);
        }
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo15747(@InterfaceC6391 Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
        AbstractC7956 abstractC7956 = (AbstractC7956) obj;
        int i = 0;
        if (abstractC7956 instanceof C7991) {
            C7991 c7991 = (C7991) abstractC7956;
            int iM25185 = c7991.m25185();
            while (i < iM25185) {
                mo15747(c7991.m25184(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m15763(abstractC7956)) {
            return;
        }
        List<View> targets = abstractC7956.getTargets();
        if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                abstractC7956.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC7956.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public void mo15748(@InterfaceC6391 Object obj, @InterfaceC6391 View view, @InterfaceC6391 ArrayList<View> arrayList) {
        ((AbstractC7956) obj).addListener(new C0645(view, arrayList));
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public void mo15749(@InterfaceC6391 Object obj, @InterfaceC6490 Object obj2, @InterfaceC6490 ArrayList<View> arrayList, @InterfaceC6490 Object obj3, @InterfaceC6490 ArrayList<View> arrayList2, @InterfaceC6490 Object obj4, @InterfaceC6490 ArrayList<View> arrayList3) {
        ((AbstractC7956) obj).addListener(new C5107(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public void mo15750(@InterfaceC6391 Object obj, @InterfaceC6391 Rect rect) {
        if (obj != null) {
            ((AbstractC7956) obj).setEpicenterCallback(new C5109(rect));
        }
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo15751(@InterfaceC6391 Object obj, @InterfaceC6490 View view) {
        if (view != null) {
            Rect rect = new Rect();
            m15759(view, rect);
            ((AbstractC7956) obj).setEpicenterCallback(new C0644(rect));
        }
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public void mo15752(@InterfaceC6391 Fragment fragment, @InterfaceC6391 Object obj, @InterfaceC6391 C3674 c3674, @InterfaceC6391 Runnable runnable) {
        m15771(fragment, obj, c3674, null, runnable);
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public void mo15753(@InterfaceC6391 Object obj, @InterfaceC6391 View view, @InterfaceC6391 ArrayList<View> arrayList) {
        C7991 c7991 = (C7991) obj;
        List<View> targets = c7991.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC5104.m15756(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo1921(c7991, arrayList);
    }

    @Override // Yue.AbstractC5104
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public void mo15754(@InterfaceC6490 Object obj, @InterfaceC6490 ArrayList<View> arrayList, @InterfaceC6490 ArrayList<View> arrayList2) {
        C7991 c7991 = (C7991) obj;
        if (c7991 != null) {
            c7991.getTargets().clear();
            c7991.getTargets().addAll(arrayList2);
            mo15747(c7991, arrayList, arrayList2);
        }
    }

    @Override // Yue.AbstractC5104
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public Object mo15755(@InterfaceC6490 Object obj) {
        if (obj == null) {
            return null;
        }
        C7991 c7991 = new C7991();
        c7991.m25181((AbstractC7956) obj);
        return c7991;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m15765(@InterfaceC6391 Object obj) {
        ((InterfaceC7990) obj).mo25128();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public void m15766(@InterfaceC6391 Object obj, @InterfaceC6391 Runnable runnable) {
        ((InterfaceC7990) obj).mo25129(runnable);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public Object m15767(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 Object obj) {
        return C7986.m25164(viewGroup, (AbstractC7956) obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean m15768() {
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean m15769(@InterfaceC6391 Object obj) {
        boolean zIsSeekingSupported = ((AbstractC7956) obj).isSeekingSupported();
        if (!zIsSeekingSupported) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return zIsSeekingSupported;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void m15770(@InterfaceC6391 Object obj, float f) {
        InterfaceC7990 interfaceC7990 = (InterfaceC7990) obj;
        if (interfaceC7990.mo25126()) {
            long jMo25134 = (long) (f * interfaceC7990.mo25134());
            if (jMo25134 == 0) {
                jMo25134 = 1;
            }
            if (jMo25134 == interfaceC7990.mo25134()) {
                jMo25134 = interfaceC7990.mo25134() - 1;
            }
            interfaceC7990.mo25127(jMo25134);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void m15771(@InterfaceC6391 Fragment fragment, @InterfaceC6391 Object obj, @InterfaceC6391 C3674 c3674, @InterfaceC6490 final Runnable runnable, @InterfaceC6391 final Runnable runnable2) {
        final AbstractC7956 abstractC7956 = (AbstractC7956) obj;
        c3674.m10066(new C3674.InterfaceC0218() { // from class: Yue.ۥۣ۠۟ۧ
            @Override // Yue.C3674.InterfaceC0218
            public final void onCancel() {
                C5106.m15764(runnable, abstractC7956, runnable2);
            }
        });
        abstractC7956.addListener(new C5108(runnable2));
    }
}

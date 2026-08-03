package Yue;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nFragmentTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentTransition.kt\nandroidx/fragment/app/FragmentTransition\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n515#2:123\n500#2,6:124\n125#3:130\n152#3,3:131\n125#3:134\n152#3,3:135\n125#3:138\n152#3,3:139\n1855#4,2:142\n*S KotlinDebug\n*F\n+ 1 FragmentTransition.kt\nandroidx/fragment/app/FragmentTransition\n*L\n50#1:123\n50#1:124,6\n53#1:130\n53#1:131,3\n98#1:134\n98#1:135,3\n99#1:138\n99#1:139,3\n113#1:142,2\n*E\n"})
public final class C5099 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C5099 f1271;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC5568
    @InterfaceC6489
    public static final AbstractC5104 f1272;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC5568
    @InterfaceC6489
    public static final AbstractC5104 f12080;

    static {
        C5099 c5099 = new C5099();
        f1271 = c5099;
        f1272 = new C5100();
        f12080 = c5099.m15739();
    }

    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ */
    public static final void m1918(@InterfaceC6399 Fragment fragment, @InterfaceC6399 Fragment fragment2, boolean z, @InterfaceC6399 C3394<String, View> c3394, boolean z2) {
        C5499.m17103(fragment, "inFragment");
        C5499.m17103(fragment2, "outFragment");
        C5499.m17103(c3394, "sharedElements");
        AbstractC7430 enterTransitionCallback = z ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList(c3394.size());
            Iterator<Map.Entry<String, View>> it = c3394.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            ArrayList arrayList2 = new ArrayList(c3394.size());
            Iterator<Map.Entry<String, View>> it2 = c3394.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getKey());
            }
            if (z2) {
                enterTransitionCallback.m23267(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.m23266(arrayList2, arrayList, null);
            }
        }
    }

    @InterfaceC5578
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public static final String m1919(@InterfaceC6399 C3394<String, String> c3394, @InterfaceC6399 String str) {
        C5499.m17103(c3394, "<this>");
        C5499.m17103(str, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : c3394.entrySet()) {
            if (C5499.m17094(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) C3888.m10891(arrayList);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0010 */
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m15736(@InterfaceC6399 C3394<String, String> c3394, @InterfaceC6399 C3394<String, View> c33942) {
        C5499.m17103(c3394, "<this>");
        C5499.m17103(c33942, "namedViews");
        int size = c3394.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!c33942.containsKey(c3394.valueAt(size))) {
                c3394.removeAt(size);
            }
        }
    }

    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final void m15737(@InterfaceC6399 List<? extends View> list, int i) {
        C5499.m17103(list, "views");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }

    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final boolean m15738() {
        return (f1272 == null && f12080 == null) ? false : true;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final AbstractC5104 m15739() {
        try {
            C5499.m17101(C5106.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (AbstractC5104) C5106.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}

package yyds;

import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲈᲈᛲᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2801 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final List f13670 = AbstractC2725.m4854(new C1672(AbstractC2328.m4341(-577861652743022L), R.id.music_view, AbstractC2328.m4341(-577887422546798L)), new C1672(AbstractC2328.m4341(-577908897383278L), R.id.music_link_view, AbstractC2328.m4341(-577956142023534L)), new C1672(AbstractC2328.m4341(-577986206794606L), R.id.video_view, AbstractC2328.m4341(-578011976598382L)), new C1672(AbstractC2328.m4341(-578033451434862L), R.id.info_view, AbstractC2328.m4341(-578054926271342L)), new C1672(AbstractC2328.m4341(-578076401107822L), R.id.image_view, AbstractC2328.m4341(-578102170911598L)), new C1672(AbstractC2328.m4341(-578123645748078L), R.id.setting_view, AbstractC2328.m4341(-578158005486446L)), new C1672(AbstractC2328.m4341(-578179480322926L), R.id.ward_view, AbstractC2328.m4341(-578200955159406L)), new C1672(AbstractC2328.m4341(-578222429995886L), R.id.ward_list_view, AbstractC2328.m4341(-578265379668846L)), new C1672(AbstractC2328.m4341(-578286854505326L), R.id.video_play_view, AbstractC2328.m4341(-578334099145582L)), new C1672(AbstractC2328.m4341(-578364163916654L), R.id.share_view, AbstractC2328.m4341(-578389933720430L)), new C1672(AbstractC2328.m4341(-578419998491502L), R.id.kouling_view, AbstractC2328.m4341(-578454358229870L)));

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static ArrayList m4925() {
        List<C1672> list = f13670;
        int iM4382 = AbstractC2366.m4382(AbstractC0055.m419(list, 10));
        if (iM4382 < 16) {
            iM4382 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM4382);
        for (Object obj : list) {
            linkedHashMap.put(((C1672) obj).f8529, obj);
        }
        C1509.f7142.getClass();
        List listM1296 = AbstractC0473.m1296((String) C1509.f7157.m1579(C1509.f7179[130]), new String[]{AbstractC2328.m4341(-577711328887662L)}, 6);
        ArrayList arrayList = new ArrayList(AbstractC0055.m419(listM1296, 10));
        Iterator it = listM1296.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0473.m1314((String) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!AbstractC0473.m1313((String) obj2)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C1672 c1672 = (C1672) linkedHashMap.get((String) it2.next());
            if (c1672 != null) {
                arrayList3.add(c1672);
            }
        }
        ArrayList arrayList4 = new ArrayList(arrayList3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            linkedHashSet.add(((C1672) it3.next()).f8529);
        }
        for (C1672 c16722 : list) {
            if (linkedHashSet.add(c16722.f8529)) {
                arrayList4.add(c16722);
            }
        }
        return arrayList4;
    }
}

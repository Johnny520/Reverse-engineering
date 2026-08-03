package Yue;

import Yue.C5375;
import Yue.InterfaceC4103;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5063 extends C4605 {

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final C4607 f12007;

    public C5063(C7719 c7719, String str, C3456 c3456) {
        super(c7719, str, c3456);
        this.f12007 = new C4607();
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void mo15597(AbstractC6381 abstractC6381) {
        super.mo15597(abstractC6381);
        this.f12007.remove(abstractC6381);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨ۟, reason: contains not printable characters */
    public C5063 m15598(C4605 c4605) {
        this.f12007.add(c4605);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۡ۟()LYue/ۥۣۡۢۤ; */
    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۨۤ()LYue/ۥ۠۠ۥۥ; */
    @Override // Yue.C4605
    /* JADX INFO: renamed from: ۥ۟۠ۨ۠, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C5063 mo12984() {
        return (C5063) super.mo12984();
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۡ, reason: contains not printable characters */
    public C4607 m15600() {
        return this.f12007;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۢ, reason: contains not printable characters */
    public List<InterfaceC4103.InterfaceC0325> m15601() {
        C4605 c4605M13807;
        ArrayList arrayList = new ArrayList();
        for (C4605 c4605 : this.f12007) {
            if (c4605.m13813().m24553() && !c4605.mo17595("disabled")) {
                String strMo17594 = c4605.mo17594("name");
                if (strMo17594.length() != 0) {
                    String strMo175942 = c4605.mo17594("type");
                    if (!strMo175942.equalsIgnoreCase("button") && !strMo175942.equalsIgnoreCase("image")) {
                        if (c4605.m19913("select")) {
                            Iterator<C4605> it = c4605.m13805("option[selected]").iterator();
                            boolean z = false;
                            while (it.hasNext()) {
                                arrayList.add(C5375.C5376.m2132(strMo17594, it.next().m13822()));
                                z = true;
                            }
                            if (!z && (c4605M13807 = c4605.m13807("option")) != null) {
                                arrayList.add(C5375.C5376.m2132(strMo17594, c4605M13807.m13822()));
                            }
                        } else if (!"checkbox".equalsIgnoreCase(strMo175942) && !"radio".equalsIgnoreCase(strMo175942)) {
                            arrayList.add(C5375.C5376.m2132(strMo17594, c4605.m13822()));
                        } else if (c4605.mo17595("checked")) {
                            arrayList.add(C5375.C5376.m2132(strMo17594, c4605.m13822().length() > 0 ? c4605.m13822() : C4312.f8851));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۨ, reason: contains not printable characters */
    public InterfaceC4103 m15602() {
        String strMo17593 = mo17595("action") ? mo17593("action") : mo13686();
        C8159.m26908(strMo17593, "Could not determine a form action URL for submit. Ensure you set a base URI when parsing.");
        InterfaceC4103.EnumC4104 enumC4104 = mo17594("method").equalsIgnoreCase("POST") ? InterfaceC4103.EnumC4104.POST : InterfaceC4103.EnumC4104.GET;
        C4483 c4483M19918 = m19918();
        return (c4483M19918 != null ? c4483M19918.m12991().mo11623() : C5562.m17331()).mo11622(strMo17593).mo11619(m15601()).mo11605(enumC4104);
    }
}

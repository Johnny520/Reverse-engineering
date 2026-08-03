package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1199b1 extends AbstractC0903V0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC1242c1 f4110a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f4111b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0817T0 f4112c;

    public C1199b1(AbstractC1242c1 abstractC1242c1, String str, AbstractC0817T0 abstractC0817T0) {
        this.f4110a = abstractC1242c1;
        this.f4111b = str;
        this.f4112c = abstractC0817T0;
    }

    /* JADX INFO: renamed from: a */
    public final void m2318a(Object obj) {
        AbstractC1242c1 abstractC1242c1 = this.f4110a;
        ArrayList arrayList = abstractC1242c1.f4223d;
        LinkedHashMap linkedHashMap = abstractC1242c1.f4221b;
        String str = this.f4111b;
        Object obj2 = linkedHashMap.get(str);
        AbstractC0817T0 abstractC0817T0 = this.f4112c;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC0817T0 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            abstractC1242c1.mo1452b(iIntValue, abstractC0817T0, obj);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }
}

package yyds;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛶᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1425 extends AbstractC2720 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C0406 f6736 = new C0406();

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Class f6737;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C1627 f6738;

    public C1425(C0114 c0114, AbstractC2720 abstractC2720, Class cls) {
        this.f6738 = new C1627(c0114, abstractC2720, cls, 2);
        this.f6737 = cls;
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo484(C1942 c1942) {
        if (c1942.m3744() == 9) {
            c1942.m3767();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c1942.m3746();
        while (c1942.m3753()) {
            arrayList.add(this.f6738.f8309.mo484(c1942));
        }
        c1942.m3750();
        int size = arrayList.size();
        Class cls = this.f6737;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo485(C1405 c1405, Object obj) {
        if (obj == null) {
            c1405.m2857();
            return;
        }
        c1405.m2866();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f6738.mo485(c1405, Array.get(obj, i));
        }
        c1405.m2855();
    }
}

package p000a;

import java.util.ArrayList;

/* JADX INFO: renamed from: a.Dd */
/* JADX INFO: loaded from: classes.dex */
public final class C0070Dd {

    /* JADX INFO: renamed from: a */
    public AbstractC0639ih f239a;

    /* JADX INFO: renamed from: b */
    public ArrayList<AbstractC0639ih> f240b;

    /* JADX INFO: renamed from: a */
    public static long m171a(C0384V4 c0384v4, long j) {
        AbstractC0639ih abstractC0639ih = c0384v4.f1446d;
        if (abstractC0639ih instanceof C0554e8) {
            return j;
        }
        ArrayList arrayList = c0384v4.f1453k;
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC0348T4 interfaceC0348T4 = (InterfaceC0348T4) arrayList.get(i);
            if (interfaceC0348T4 instanceof C0384V4) {
                C0384V4 c0384v42 = (C0384V4) interfaceC0348T4;
                if (c0384v42.f1446d != abstractC0639ih) {
                    jMin = Math.min(jMin, m171a(c0384v42, ((long) c0384v42.f1448f) + j));
                }
            }
        }
        if (c0384v4 != abstractC0639ih.f2350i) {
            return jMin;
        }
        long jMo978j = abstractC0639ih.mo978j();
        C0384V4 c0384v43 = abstractC0639ih.f2349h;
        long j2 = j - jMo978j;
        return Math.min(Math.min(jMin, m171a(c0384v43, j2)), j2 - ((long) c0384v43.f1448f));
    }

    /* JADX INFO: renamed from: b */
    public static long m172b(C0384V4 c0384v4, long j) {
        AbstractC0639ih abstractC0639ih = c0384v4.f1446d;
        if (abstractC0639ih instanceof C0554e8) {
            return j;
        }
        ArrayList arrayList = c0384v4.f1453k;
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC0348T4 interfaceC0348T4 = (InterfaceC0348T4) arrayList.get(i);
            if (interfaceC0348T4 instanceof C0384V4) {
                C0384V4 c0384v42 = (C0384V4) interfaceC0348T4;
                if (c0384v42.f1446d != abstractC0639ih) {
                    jMax = Math.max(jMax, m172b(c0384v42, ((long) c0384v42.f1448f) + j));
                }
            }
        }
        if (c0384v4 != abstractC0639ih.f2349h) {
            return jMax;
        }
        long jMo978j = abstractC0639ih.mo978j();
        C0384V4 c0384v43 = abstractC0639ih.f2350i;
        long j2 = j + jMo978j;
        return Math.max(Math.max(jMax, m172b(c0384v43, j2)), j2 - ((long) c0384v43.f1448f));
    }
}

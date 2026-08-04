package yyds;

import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛲᛴᛳᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0327 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public AbstractC1413 f1715;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public ArrayList f1716;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static long m994(C1397 c1397, long j) {
        AbstractC1413 abstractC1413 = c1397.f6523;
        ArrayList arrayList = c1397.f6518;
        if (abstractC1413 instanceof C2775) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC2299 interfaceC2299 = (InterfaceC2299) arrayList.get(i);
            if (interfaceC2299 instanceof C1397) {
                C1397 c13972 = (C1397) interfaceC2299;
                if (c13972.f6523 != abstractC1413) {
                    jMin = Math.min(jMin, m994(c13972, ((long) c13972.f6522) + j));
                }
            }
        }
        C1397 c13973 = abstractC1413.f6687;
        C1397 c13974 = abstractC1413.f6686;
        if (c1397 != c13973) {
            return jMin;
        }
        long jMo1397 = j - abstractC1413.mo1397();
        return Math.min(Math.min(jMin, m994(c13974, jMo1397)), jMo1397 - ((long) c13974.f6522));
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static long m995(C1397 c1397, long j) {
        AbstractC1413 abstractC1413 = c1397.f6523;
        ArrayList arrayList = c1397.f6518;
        if (abstractC1413 instanceof C2775) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC2299 interfaceC2299 = (InterfaceC2299) arrayList.get(i);
            if (interfaceC2299 instanceof C1397) {
                C1397 c13972 = (C1397) interfaceC2299;
                if (c13972.f6523 != abstractC1413) {
                    jMax = Math.max(jMax, m995(c13972, ((long) c13972.f6522) + j));
                }
            }
        }
        C1397 c13973 = abstractC1413.f6686;
        C1397 c13974 = abstractC1413.f6687;
        if (c1397 != c13973) {
            return jMax;
        }
        long jMo1397 = abstractC1413.mo1397() + j;
        return Math.max(Math.max(jMax, m995(c13974, jMo1397)), jMo1397 - ((long) c13974.f6522));
    }
}

package Yue;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۢۢۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C8053 {
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    @InterfaceC5572(name = "sumOfUByte")
    /* JADX INFO: renamed from: ۥ */
    public static final int m4075(@InterfaceC6399 Iterable<C8048> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<C8048> it = iterable.iterator();
        int iM26318 = 0;
        while (it.hasNext()) {
            iM26318 = C8057.m26318(iM26318 + C8057.m26318(it.next().m26245() & 255));
        }
        return iM26318;
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    @InterfaceC5572(name = "sumOfUInt")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final int m4076(@InterfaceC6399 Iterable<C8057> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<C8057> it = iterable.iterator();
        int iM26318 = 0;
        while (it.hasNext()) {
            iM26318 = C8057.m26318(iM26318 + it.next().m26372());
        }
        return iM26318;
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    @InterfaceC5572(name = "sumOfULong")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final long m26265(@InterfaceC6399 Iterable<C8064> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<C8064> it = iterable.iterator();
        long jM26408 = 0;
        while (it.hasNext()) {
            jM26408 = C8064.m26408(jM26408 + it.next().m26462());
        }
        return jM26408;
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    @InterfaceC5572(name = "sumOfUShort")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int m26266(@InterfaceC6399 Iterable<C8080> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<C8080> it = iterable.iterator();
        int iM26318 = 0;
        while (it.hasNext()) {
            iM26318 = C8057.m26318(iM26318 + C8057.m26318(it.next().m26642() & C8080.f23970));
        }
        return iM26318;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static byte[] m26267(@InterfaceC6399 Collection<C8048> collection) {
        C5499.m17103(collection, "<this>");
        byte[] bArrM26246 = C8049.m26246(collection.size());
        Iterator<C8048> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            C8049.m26258(bArrM26246, i, it.next().m26245());
            i++;
        }
        return bArrM26246;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int[] m26268(@InterfaceC6399 Collection<C8057> collection) {
        C5499.m17103(collection, "<this>");
        int[] iArrM26373 = C8058.m26373(collection.size());
        Iterator<C8057> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            C8058.m26385(iArrM26373, i, it.next().m26372());
            i++;
        }
        return iArrM26373;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final long[] m26269(@InterfaceC6399 Collection<C8064> collection) {
        C5499.m17103(collection, "<this>");
        long[] jArrM26463 = C8065.m26463(collection.size());
        Iterator<C8064> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            C8065.m26475(jArrM26463, i, it.next().m26462());
            i++;
        }
        return jArrM26463;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final short[] m26270(@InterfaceC6399 Collection<C8080> collection) {
        C5499.m17103(collection, "<this>");
        short[] sArrM26643 = C8081.m26643(collection.size());
        Iterator<C8080> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            C8081.m26655(sArrM26643, i, it.next().m26642());
            i++;
        }
        return sArrM26643;
    }
}

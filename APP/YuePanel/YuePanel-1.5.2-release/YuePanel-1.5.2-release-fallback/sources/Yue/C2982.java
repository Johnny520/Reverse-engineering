package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C2982 implements Yue.InterfaceC2977 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public byte[] f9619;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.util.TreeMap<java.lang.String, java.lang.String> f9620;

    public C2982() {
            r2 = this;
            r2.<init>()
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            r0.<init>(r1)
            r2.f9620 = r0
            return
    }

    @Override // Yue.InterfaceC2977
    public void put(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.TreeMap<java.lang.String, java.lang.String> r0 = r1.f9620
            r0.put(r2, r3)
            return
    }

    @Override // Yue.InterfaceC2981
    /* JADX INFO: renamed from: ۥ۟۟ */
    public java.util.Iterator<java.lang.String> mo12633() {
            r1 = this;
            java.util.TreeMap<java.lang.String, java.lang.String> r0 = r1.f9620
            java.util.Set r0 = r0.keySet()
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // Yue.InterfaceC2981
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public byte[] mo12634() {
            r1 = this;
            byte[] r0 = r1.f9619
            return r0
    }

    @Override // Yue.InterfaceC2981
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo12635(java.lang.String r2) {
            r1 = this;
            java.util.TreeMap<java.lang.String, java.lang.String> r0 = r1.f9620
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // Yue.InterfaceC2977
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo12628(byte[] r1) {
            r0 = this;
            r0.f9619 = r1
            return
    }

    @Override // Yue.InterfaceC2981
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public java.lang.String mo12636(java.lang.String r2) {
            r1 = this;
            java.util.TreeMap<java.lang.String, java.lang.String> r0 = r1.f9620
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto Lc
            java.lang.String r2 = ""
        Lc:
            return r2
    }
}

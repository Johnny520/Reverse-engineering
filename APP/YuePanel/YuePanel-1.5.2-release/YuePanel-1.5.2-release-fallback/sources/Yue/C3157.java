package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3157 implements Yue.InterfaceC1478 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String f10398 = "Content-Encoding";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f10399 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f10400 = "User-Agent";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f10401 = "Content-Type";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f10402 = "multipart/form-data";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.String f10403 = "application/x-www-form-urlencoded";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f10404 = 307;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final java.lang.String f10405 = "application/octet-stream";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final java.nio.charset.Charset f10406 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.C3157.C3161 f10407;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.InterfaceC1478.InterfaceC1483 f10408;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۨ۠$ۥ, reason: contains not printable characters */
    public static /* synthetic */ class C3158 {
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۨ۠$ۥ۟, reason: contains not printable characters */
    public static abstract class AbstractC3159<T extends Yue.InterfaceC1478.InterfaceC1479<T>> implements Yue.InterfaceC1478.InterfaceC1479<T> {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final java.net.URL f10409 = null;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.net.URL f10410;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.InterfaceC1478.EnumC1481 f10411;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public java.util.Map<java.lang.String, java.util.List<java.lang.String>> f10412;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public java.util.Map<java.lang.String, java.lang.String> f10413;

        static {
                java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> La
                java.lang.String r1 = "http://undefined/"
                r0.<init>(r1)     // Catch: java.net.MalformedURLException -> La
                Yue.C3157.AbstractC3159.f10409 = r0     // Catch: java.net.MalformedURLException -> La
                return
            La:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0)
                throw r1
        }

        public AbstractC3159() {
                r1 = this;
                r1.<init>()
                java.net.URL r0 = Yue.C3157.AbstractC3159.f10409
                r1.f10410 = r0
                Yue.ۥ۟ۦۧۤ$ۥ۟۟ r0 = Yue.InterfaceC1478.EnumC1481.f4623
                r1.f10411 = r0
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                r1.f10412 = r0
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                r1.f10413 = r0
                return
        }

        public /* synthetic */ AbstractC3159(Yue.C3157.C3158 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public AbstractC3159(Yue.C3157.AbstractC3159<T> r6) {
                r5 = this;
                r5.<init>()
                java.net.URL r0 = Yue.C3157.AbstractC3159.f10409
                r5.f10410 = r0
                Yue.ۥ۟ۦۧۤ$ۥ۟۟ r0 = Yue.InterfaceC1478.EnumC1481.f4623
                r5.f10411 = r0
                java.net.URL r0 = r6.f10410
                r5.f10410 = r0
                Yue.ۥ۟ۦۧۤ$ۥ۟۟ r0 = r6.f10411
                r5.f10411 = r0
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                r5.f10412 = r0
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r6.f10412
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L24:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L47
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2 = r5.f10412
                java.lang.Object r3 = r1.getKey()
                java.lang.String r3 = (java.lang.String) r3
                java.util.ArrayList r4 = new java.util.ArrayList
                java.lang.Object r1 = r1.getValue()
                java.util.Collection r1 = (java.util.Collection) r1
                r4.<init>(r1)
                r2.put(r3, r4)
                goto L24
            L47:
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                r5.f10413 = r0
                java.util.Map<java.lang.String, java.lang.String> r6 = r6.f10413
                r0.putAll(r6)
                return
        }

        public /* synthetic */ AbstractC3159(Yue.C3157.AbstractC3159 r1, Yue.C3157.C3158 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public T mo7256(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                Yue.C6657.m25634(r2, r0)
                r1.mo7271(r2)
                r1.mo7269(r2, r3)
                return r1
        }

        @Override // Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public T mo7257(Yue.InterfaceC1478.EnumC1481 r2) {
                r1 = this;
                java.lang.String r0 = "method"
                Yue.C6657.m25637(r2, r0)
                r1.f10411 = r2
                return r1
        }

        @Override // Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public T mo7258(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                Yue.C6657.m25634(r2, r0)
                java.lang.String r0 = "value"
                Yue.C6657.m25637(r3, r0)
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.f10413
                r0.put(r2, r3)
                return r1
        }

        @Override // Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public T mo7259(java.net.URL r2) {
                r1 = this;
                java.lang.String r0 = "url"
                Yue.C6657.m25637(r2, r0)
                Yue.ۥۣۣۢۡ r0 = new Yue.ۥۣۣۢۡ
                r0.<init>(r2)
                java.net.URL r2 = r0.m25473()
                r1.f10410 = r2
                return r1
        }

        @Override // Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
        public boolean mo7260(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "name"
                Yue.C6657.m25634(r2, r0)
                java.util.List r2 = r1.m13374(r2)
                boolean r2 = r2.isEmpty()
                r2 = r2 ^ 1
                return r2
        }

        @Override // Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۡ */
        public java.net.URL mo7261() {
                r2 = this;
                java.net.URL r0 = r2.f10410
                java.net.URL r1 = Yue.C3157.AbstractC3159.f10409
                if (r0 == r1) goto L7
                return r0
            L7:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "URL not set. Make sure to call #url(...) before executing the request."
                r0.<init>(r1)
                throw r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
        public boolean mo7262(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                Yue.C6657.m25632(r2)
                Yue.C6657.m25632(r3)
                java.util.List r2 = r1.mo7265(r2)
                java.util.Iterator r2 = r2.iterator()
            Le:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L22
                java.lang.Object r0 = r2.next()
                java.lang.String r0 = (java.lang.String) r0
                boolean r0 = r3.equalsIgnoreCase(r0)
                if (r0 == 0) goto Le
                r2 = 1
                return r2
            L22:
                r2 = 0
                return r2
        }

        @Override // Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
        public Yue.InterfaceC1478.EnumC1481 mo7263() {
                r1 = this;
                Yue.ۥ۟ۦۧۤ$ۥ۟۟ r0 = r1.f10411
                return r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
        public T mo7264(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "name"
                Yue.C6657.m25634(r2, r0)
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.f10413
                r0.remove(r2)
                return r1
        }

        @Override // Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
        public java.util.List<java.lang.String> mo7265(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "name"
                Yue.C6657.m25634(r2, r0)
                java.util.List r2 = r1.m13374(r2)
                return r2
        }

        @Override // Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
        public java.util.Map<java.lang.String, java.util.List<java.lang.String>> mo7266() {
                r1 = this;
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r1.f10412
                return r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
        public java.util.Map<java.lang.String, java.lang.String> mo7267() {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.f10413
                return r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۢ */
        public java.lang.String mo7268(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "name"
                Yue.C6657.m25634(r2, r0)
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.f10413
                java.lang.Object r2 = r0.get(r2)
                java.lang.String r2 = (java.lang.String) r2
                return r2
        }

        @Override // Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
        public T mo7269(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                java.lang.String r0 = "name"
                Yue.C6657.m25634(r3, r0)
                if (r4 != 0) goto L9
                java.lang.String r4 = ""
            L9:
                java.util.List r0 = r2.mo7265(r3)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L1d
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r2.f10412
                r1.put(r3, r0)
            L1d:
                r0.add(r4)
                return r2
        }

        @Override // Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۢۤ */
        public boolean mo7270(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "name"
                Yue.C6657.m25634(r2, r0)
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.f10413
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۢۥ */
        public T mo7271(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "name"
                Yue.C6657.m25634(r2, r0)
                java.util.Map$Entry r2 = r1.m13375(r2)
                if (r2 == 0) goto L14
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r1.f10412
                java.lang.Object r2 = r2.getKey()
                r0.remove(r2)
            L14:
                return r1
        }

        @Override // Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۢۦ */
        public java.lang.String mo7272(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "name"
                Yue.C6657.m25637(r2, r0)
                java.util.List r2 = r1.m13374(r2)
                int r0 = r2.size()
                if (r0 <= 0) goto L16
                java.lang.String r0 = ", "
                java.lang.String r2 = Yue.C5973.m22122(r2, r0)
                return r2
            L16:
                r2 = 0
                return r2
        }

        @Override // Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
        public java.util.Map<java.lang.String, java.lang.String> mo7273() {
                r5 = this;
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r5.f10412
                int r1 = r1.size()
                r0.<init>(r1)
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r5.f10412
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L15:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L3e
                java.lang.Object r2 = r1.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getKey()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r2 = r2.getValue()
                java.util.List r2 = (java.util.List) r2
                int r4 = r2.size()
                if (r4 <= 0) goto L15
                r4 = 0
                java.lang.Object r2 = r2.get(r4)
                java.lang.String r2 = (java.lang.String) r2
                r0.put(r3, r2)
                goto L15
            L3e:
                return r0
        }

        /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
        public final java.util.List<java.lang.String> m13374(java.lang.String r4) {
                r3 = this;
                Yue.C6657.m25635(r4)
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r3.f10412
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            Ld:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2c
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                boolean r2 = r4.equalsIgnoreCase(r2)
                if (r2 == 0) goto Ld
                java.lang.Object r4 = r1.getValue()
                java.util.List r4 = (java.util.List) r4
                return r4
            L2c:
                java.util.List r4 = java.util.Collections.emptyList()
                return r4
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
        public final java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> m13375(java.lang.String r4) {
                r3 = this;
                java.lang.String r4 = Yue.C4415.m17326(r4)
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r3.f10412
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            Le:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2b
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r2 = Yue.C4415.m17326(r2)
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto Le
                return r1
            L2b:
                r4 = 0
                return r4
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۨ۠$ۥ۟۟, reason: contains not printable characters */
    public static class C3160 implements Yue.InterfaceC1478.InterfaceC1480 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.lang.String f10414;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public java.lang.String f10415;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public java.io.InputStream f10416;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public java.lang.String f10417;

        public C3160(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "key"
                Yue.C6657.m25634(r2, r0)
                java.lang.String r0 = "value"
                Yue.C6657.m25637(r3, r0)
                r1.f10414 = r2
                r1.f10415 = r3
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static Yue.C3157.C3160 m13376(java.lang.String r1, java.lang.String r2) {
                Yue.ۥ۠ۤۨ۠$ۥ۟۟ r0 = new Yue.ۥ۠ۤۨ۠$ۥ۟۟
                r0.<init>(r1, r2)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static Yue.C3157.C3160 m13377(java.lang.String r1, java.lang.String r2, java.io.InputStream r3) {
                Yue.ۥ۠ۤۨ۠$ۥ۟۟ r0 = new Yue.ۥ۠ۤۨ۠$ۥ۟۟
                r0.<init>(r1, r2)
                Yue.ۥ۠ۤۨ۠$ۥ۟۟ r1 = r0.m13378(r3)
                return r1
        }

        @Override // Yue.InterfaceC1478.InterfaceC1480
        public java.lang.String key() {
                r1 = this;
                java.lang.String r0 = r1.f10414
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.f10414
                r0.append(r1)
                java.lang.String r1 = "="
                r0.append(r1)
                java.lang.String r1 = r2.f10415
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1480
        public /* bridge */ /* synthetic */ Yue.InterfaceC1478.InterfaceC1480 value(java.lang.String r1) {
                r0 = this;
                Yue.ۥ۠ۤۨ۠$ۥ۟۟ r1 = r0.m13380(r1)
                return r1
        }

        @Override // Yue.InterfaceC1478.InterfaceC1480
        public java.lang.String value() {
                r1 = this;
                java.lang.String r0 = r1.f10415
                return r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1480
        /* JADX INFO: renamed from: ۥ۟ */
        public java.lang.String mo7274() {
                r1 = this;
                java.lang.String r0 = r1.f10417
                return r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1480
        /* JADX INFO: renamed from: ۥ۟۟ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC1478.InterfaceC1480 mo7275(java.io.InputStream r1) {
                r0 = this;
                Yue.ۥ۠ۤۨ۠$ۥ۟۟ r1 = r0.m13378(r1)
                return r1
        }

        @Override // Yue.InterfaceC1478.InterfaceC1480
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public Yue.InterfaceC1478.InterfaceC1480 mo7276(java.lang.String r1) {
                r0 = this;
                Yue.C6657.m25632(r1)
                r0.f10417 = r1
                return r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1480
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC1478.InterfaceC1480 mo7277(java.lang.String r1) {
                r0 = this;
                Yue.ۥ۠ۤۨ۠$ۥ۟۟ r1 = r0.m13379(r1)
                return r1
        }

        @Override // Yue.InterfaceC1478.InterfaceC1480
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public boolean mo7278() {
                r1 = this;
                java.io.InputStream r0 = r1.f10416
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public Yue.C3157.C3160 m13378(java.io.InputStream r3) {
                r2 = this;
                java.lang.String r0 = r2.f10415
                java.lang.String r1 = "inputStream"
                Yue.C6657.m25637(r0, r1)
                r2.f10416 = r3
                return r2
        }

        @Override // Yue.InterfaceC1478.InterfaceC1480
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public java.io.InputStream mo7279() {
                r1 = this;
                java.io.InputStream r0 = r1.f10416
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public Yue.C3157.C3160 m13379(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "key"
                Yue.C6657.m25634(r2, r0)
                r1.f10414 = r2
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public Yue.C3157.C3160 m13380(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "value"
                Yue.C6657.m25637(r2, r0)
                r1.f10415 = r2
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۨ۠$ۥ۟۟۟, reason: contains not printable characters */
    public static class C3161 extends Yue.C3157.AbstractC3159<Yue.InterfaceC1478.InterfaceC1482> implements Yue.InterfaceC1478.InterfaceC1482 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public java.net.Proxy f10418;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f10419;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public int f10420;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public boolean f10421;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final java.util.Collection<Yue.InterfaceC1478.InterfaceC1480> f10422;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public java.lang.String f10423;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public boolean f10424;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public boolean f10425;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public Yue.C4700 f10426;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public boolean f10427;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public java.lang.String f10428;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public javax.net.ssl.SSLSocketFactory f10429;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public java.net.CookieManager f10430;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public Yue.InterfaceC5319 f10431;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public volatile boolean f10432;

        static {
                java.lang.String r0 = "sun.net.http.allowRestrictedHeaders"
                java.lang.String r1 = "true"
                java.lang.System.setProperty(r0, r1)
                return
        }

        public C3161() {
                r2 = this;
                r0 = 0
                r2.<init>(r0)
                r2.f10423 = r0
                r0 = 0
                r2.f10424 = r0
                r2.f10425 = r0
                r2.f10427 = r0
                java.lang.String r1 = Yue.C1726.f5382
                r2.f10428 = r1
                r2.f10432 = r0
                r0 = 30000(0x7530, float:4.2039E-41)
                r2.f10419 = r0
                r0 = 2097152(0x200000, float:2.938736E-39)
                r2.f10420 = r0
                r0 = 1
                r2.f10421 = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.f10422 = r0
                Yue.ۥ۟ۦۧۤ$ۥ۟۟ r0 = Yue.InterfaceC1478.EnumC1481.f4623
                r2.f10411 = r0
                java.lang.String r0 = "Accept-Encoding"
                java.lang.String r1 = "gzip"
                r2.mo7269(r0, r1)
                java.lang.String r0 = "User-Agent"
                java.lang.String r1 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36"
                r2.mo7269(r0, r1)
                Yue.ۥۣۡۧۦ r0 = Yue.C4700.m18617()
                r2.f10426 = r0
                java.net.CookieManager r0 = new java.net.CookieManager
                r0.<init>()
                r2.f10430 = r0
                return
        }

        public C3161(Yue.C3157.C3161 r3) {
                r2 = this;
                r0 = 0
                r2.<init>(r3, r0)
                r2.f10423 = r0
                r0 = 0
                r2.f10424 = r0
                r2.f10425 = r0
                r2.f10427 = r0
                java.lang.String r1 = Yue.C1726.f5382
                r2.f10428 = r1
                r2.f10432 = r0
                java.net.Proxy r1 = r3.f10418
                r2.f10418 = r1
                java.lang.String r1 = r3.f10428
                r2.f10428 = r1
                int r1 = r3.f10419
                r2.f10419 = r1
                int r1 = r3.f10420
                r2.f10420 = r1
                boolean r1 = r3.f10421
                r2.f10421 = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r2.f10422 = r1
                boolean r1 = r3.f10424
                r2.f10424 = r1
                boolean r1 = r3.f10425
                r2.f10425 = r1
                Yue.ۥۣۡۧۦ r1 = r3.f10426
                Yue.ۥۣۡۧۦ r1 = r1.m18631()
                r2.f10426 = r1
                boolean r1 = r3.f10427
                r2.f10427 = r1
                javax.net.ssl.SSLSocketFactory r1 = r3.f10429
                r2.f10429 = r1
                java.net.CookieManager r1 = r3.f10430
                r2.f10430 = r1
                Yue.ۥۡۦۤۨ r3 = r3.f10431
                r2.f10431 = r3
                r2.f10432 = r0
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
        public static /* synthetic */ java.net.CookieManager m13381(Yue.C3157.C3161 r0) {
                java.net.CookieManager r0 = r0.f10430
                return r0
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
        public static /* synthetic */ java.net.CookieManager m13382(Yue.C3157.C3161 r0, java.net.CookieManager r1) {
                r0.f10430 = r1
                return r1
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
        public static /* synthetic */ boolean m13383(Yue.C3157.C3161 r0) {
                boolean r0 = r0.f10432
                return r0
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
        public static /* synthetic */ boolean m13384(Yue.C3157.C3161 r0, boolean r1) {
                r0.f10432 = r1
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
        public static /* synthetic */ boolean m13385(Yue.C3157.C3161 r0) {
                boolean r0 = r0.f10427
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
        public static /* synthetic */ Yue.InterfaceC5319 m13386(Yue.C3157.C3161 r0) {
                Yue.ۥۡۦۤۨ r0 = r0.f10431
                return r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1482
        public java.util.Collection<Yue.InterfaceC1478.InterfaceC1480> data() {
                r1 = this;
                java.util.Collection<Yue.ۥ۟ۦۧۤ$ۥ۟> r0 = r1.f10422
                return r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1482
        /* JADX INFO: renamed from: ۥ */
        public int mo7282() {
                r1 = this;
                int r0 = r1.f10419
                return r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1482
        /* JADX INFO: renamed from: ۥ۟۟ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC1478.InterfaceC1482 mo7283(Yue.C4700 r1) {
                r0 = this;
                Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r1 = r0.m13389(r1)
                return r1
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC1478.InterfaceC1479 mo7256(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                Yue.ۥ۟ۦۧۤ$ۥ r1 = super.mo7256(r1, r2)
                return r1
        }

        @Override // Yue.InterfaceC1478.InterfaceC1482
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public Yue.InterfaceC1478.InterfaceC1482 mo7284(boolean r1) {
                r0 = this;
                r0.f10421 = r1
                return r0
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC1478.InterfaceC1479 mo7257(Yue.InterfaceC1478.EnumC1481 r1) {
                r0 = this;
                Yue.ۥ۟ۦۧۤ$ۥ r1 = super.mo7257(r1)
                return r1
        }

        @Override // Yue.InterfaceC1478.InterfaceC1482
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public Yue.InterfaceC1478.InterfaceC1482 mo7285(java.lang.String r1) {
                r0 = this;
                r0.f10423 = r1
                return r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1482
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public Yue.InterfaceC1478.InterfaceC1482 mo7286(Yue.InterfaceC5319 r1) {
                r0 = this;
                r0.f10431 = r1
                return r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1482
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC1478.InterfaceC1482 mo7287(java.lang.String r1, int r2) {
                r0 = this;
                Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r1 = r0.m13390(r1, r2)
                return r1
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC1478.InterfaceC1479 mo7258(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                Yue.ۥ۟ۦۧۤ$ۥ r1 = super.mo7258(r1, r2)
                return r1
        }

        @Override // Yue.InterfaceC1478.InterfaceC1482
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC1478.InterfaceC1482 mo7288(int r1) {
                r0 = this;
                Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r1 = r0.m13392(r1)
                return r1
        }

        @Override // Yue.InterfaceC1478.InterfaceC1482
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public Yue.InterfaceC1478.InterfaceC1482 mo7289(int r3) {
                r2 = this;
                if (r3 < 0) goto L4
                r0 = 1
                goto L5
            L4:
                r0 = 0
            L5:
                java.lang.String r1 = "maxSize must be 0 (unlimited) or larger"
                Yue.C6657.m25629(r0, r1)
                r2.f10420 = r3
                return r2
        }

        @Override // Yue.InterfaceC1478.InterfaceC1482
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public Yue.InterfaceC1478.InterfaceC1482 mo7290(boolean r1) {
                r0 = this;
                r0.f10424 = r1
                return r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1482
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public void mo7291(javax.net.ssl.SSLSocketFactory r1) {
                r0 = this;
                r0.f10429 = r1
                return
        }

        @Override // Yue.InterfaceC1478.InterfaceC1482
        /* JADX INFO: renamed from: ۥ۟۟۠۟ */
        public Yue.InterfaceC1478.InterfaceC1482 mo7292(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "charset"
                Yue.C6657.m25637(r2, r0)
                boolean r0 = java.nio.charset.Charset.isSupported(r2)
                if (r0 == 0) goto Le
                r1.f10428 = r2
                return r1
            Le:
                java.nio.charset.IllegalCharsetNameException r0 = new java.nio.charset.IllegalCharsetNameException
                r0.<init>(r2)
                throw r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1482
        /* JADX INFO: renamed from: ۥ۟۟۠۠ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC1478.InterfaceC1482 mo7293(java.net.Proxy r1) {
                r0 = this;
                Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r1 = r0.m13391(r1)
                return r1
        }

        @Override // Yue.InterfaceC1478.InterfaceC1482
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
        public Yue.InterfaceC1478.InterfaceC1482 mo7294(boolean r1) {
                r0 = this;
                r0.f10425 = r1
                return r0
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC1478.InterfaceC1479 mo7259(java.net.URL r1) {
                r0 = this;
                Yue.ۥ۟ۦۧۤ$ۥ r1 = super.mo7259(r1)
                return r1
        }

        @Override // Yue.InterfaceC1478.InterfaceC1482
        /* JADX INFO: renamed from: ۥۣ۟۟۠ */
        public boolean mo7295() {
                r1 = this;
                boolean r0 = r1.f10424
                return r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1482
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
        public java.lang.String mo7296() {
                r1 = this;
                java.lang.String r0 = r1.f10428
                return r0
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
        public /* bridge */ /* synthetic */ boolean mo7260(java.lang.String r1) {
                r0 = this;
                boolean r1 = super.mo7260(r1)
                return r1
        }

        @Override // Yue.InterfaceC1478.InterfaceC1482
        /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
        public boolean mo7297() {
                r1 = this;
                boolean r0 = r1.f10425
                return r0
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۡ */
        public /* bridge */ /* synthetic */ java.net.URL mo7261() {
                r1 = this;
                java.net.URL r0 = super.mo7261()
                return r0
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
        public /* bridge */ /* synthetic */ boolean mo7262(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                boolean r1 = super.mo7262(r1, r2)
                return r1
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC1478.EnumC1481 mo7263() {
                r1 = this;
                Yue.ۥ۟ۦۧۤ$ۥ۟۟ r0 = super.mo7263()
                return r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1482
        /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
        public javax.net.ssl.SSLSocketFactory mo7298() {
                r1 = this;
                javax.net.ssl.SSLSocketFactory r0 = r1.f10429
                return r0
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC1478.InterfaceC1479 mo7264(java.lang.String r1) {
                r0 = this;
                Yue.ۥ۟ۦۧۤ$ۥ r1 = super.mo7264(r1)
                return r1
        }

        @Override // Yue.InterfaceC1478.InterfaceC1482
        /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
        public java.net.Proxy mo7299() {
                r1 = this;
                java.net.Proxy r0 = r1.f10418
                return r0
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
        public /* bridge */ /* synthetic */ java.util.List mo7265(java.lang.String r1) {
                r0 = this;
                java.util.List r1 = super.mo7265(r1)
                return r1
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
        public /* bridge */ /* synthetic */ java.util.Map mo7266() {
                r1 = this;
                java.util.Map r0 = super.mo7266()
                return r0
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
        public /* bridge */ /* synthetic */ java.util.Map mo7267() {
                r1 = this;
                java.util.Map r0 = super.mo7267()
                return r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1482
        /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC1478.InterfaceC1482 mo7300(Yue.InterfaceC1478.InterfaceC1480 r1) {
                r0 = this;
                Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r1 = r0.m13388(r1)
                return r1
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۢ */
        public /* bridge */ /* synthetic */ java.lang.String mo7268(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = super.mo7268(r1)
                return r1
        }

        @Override // Yue.InterfaceC1478.InterfaceC1482
        /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
        public Yue.InterfaceC5319 mo7301() {
                r1 = this;
                Yue.ۥۡۦۤۨ r0 = r1.f10431
                return r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1482
        /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
        public boolean mo7302() {
                r1 = this;
                boolean r0 = r1.f10421
                return r0
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC1478.InterfaceC1479 mo7269(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                Yue.ۥ۟ۦۧۤ$ۥ r1 = super.mo7269(r1, r2)
                return r1
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۢۤ */
        public /* bridge */ /* synthetic */ boolean mo7270(java.lang.String r1) {
                r0 = this;
                boolean r1 = super.mo7270(r1)
                return r1
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۢۥ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC1478.InterfaceC1479 mo7271(java.lang.String r1) {
                r0 = this;
                Yue.ۥ۟ۦۧۤ$ۥ r1 = super.mo7271(r1)
                return r1
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۢۦ */
        public /* bridge */ /* synthetic */ java.lang.String mo7272(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = super.mo7272(r1)
                return r1
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
        public /* bridge */ /* synthetic */ java.util.Map mo7273() {
                r1 = this;
                java.util.Map r0 = super.mo7273()
                return r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1482
        /* JADX INFO: renamed from: ۥۣ۟۟ */
        public java.lang.String mo7303() {
                r1 = this;
                java.lang.String r0 = r1.f10423
                return r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1482
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public int mo7304() {
                r1 = this;
                int r0 = r1.f10420
                return r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1482
        /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
        public Yue.C4700 mo7305() {
                r1 = this;
                Yue.ۥۣۡۧۦ r0 = r1.f10426
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
        public java.net.CookieManager m13387() {
                r1 = this;
                java.net.CookieManager r0 = r1.f10430
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
        public Yue.C3157.C3161 m13388(Yue.InterfaceC1478.InterfaceC1480 r2) {
                r1 = this;
                java.lang.String r0 = "keyval"
                Yue.C6657.m25637(r2, r0)
                java.util.Collection<Yue.ۥ۟ۦۧۤ$ۥ۟> r0 = r1.f10422
                r0.add(r2)
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
        public Yue.C3157.C3161 m13389(Yue.C4700 r1) {
                r0 = this;
                r0.f10426 = r1
                r1 = 1
                r0.f10427 = r1
                return r0
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
        public Yue.C3157.C3161 m13390(java.lang.String r3, int r4) {
                r2 = this;
                java.net.Proxy r0 = new java.net.Proxy
                java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP
                java.net.InetSocketAddress r3 = java.net.InetSocketAddress.createUnresolved(r3, r4)
                r0.<init>(r1, r3)
                r2.f10418 = r0
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
        public Yue.C3157.C3161 m13391(java.net.Proxy r1) {
                r0 = this;
                r0.f10418 = r1
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
        public Yue.C3157.C3161 m13392(int r3) {
                r2 = this;
                if (r3 < 0) goto L4
                r0 = 1
                goto L5
            L4:
                r0 = 0
            L5:
                java.lang.String r1 = "Timeout milliseconds must be 0 (infinite) or greater"
                Yue.C6657.m25629(r0, r1)
                r2.f10419 = r3
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۨ۠$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C3162 extends Yue.C3157.AbstractC3159<Yue.InterfaceC1478.InterfaceC1483> implements Yue.InterfaceC1478.InterfaceC1483 {

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static final int f10433 = 20;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static final java.lang.String f10434 = "Location";

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static final java.util.regex.Pattern f10435 = null;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final int f10436;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final java.lang.String f10437;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public java.nio.ByteBuffer f10438;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public Yue.C1618 f10439;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public java.net.HttpURLConnection f10440;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public java.lang.String f10441;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final java.lang.String f10442;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public boolean f10443;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public boolean f10444;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public int f10445;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final Yue.C3157.C3161 f10446;

        static {
                java.lang.String r0 = "(\\w+)/\\w*\\+?xml.*"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                Yue.C3157.C3162.f10435 = r0
                return
        }

        public C3162() {
                r2 = this;
                r0 = 0
                r2.<init>(r0)
                r1 = 0
                r2.f10443 = r1
                r2.f10444 = r1
                r2.f10445 = r1
                r1 = 400(0x190, float:5.6E-43)
                r2.f10436 = r1
                java.lang.String r1 = "Request not made"
                r2.f10437 = r1
                Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r1 = new Yue.ۥ۠ۤۨ۠$ۥ۟۟۟
                r1.<init>()
                r2.f10446 = r1
                r2.f10442 = r0
                return
        }

        public C3162(java.net.HttpURLConnection r2, Yue.C3157.C3161 r3, Yue.C3157.C3162 r4) throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r0 = 0
                r1.f10443 = r0
                r1.f10444 = r0
                r1.f10445 = r0
                r1.f10440 = r2
                r1.f10446 = r3
                java.lang.String r0 = r2.getRequestMethod()
                Yue.ۥ۟ۦۧۤ$ۥ۟۟ r0 = Yue.InterfaceC1478.EnumC1481.valueOf(r0)
                r1.f10411 = r0
                java.net.URL r0 = r2.getURL()
                r1.f10410 = r0
                int r0 = r2.getResponseCode()
                r1.f10436 = r0
                java.lang.String r0 = r2.getResponseMessage()
                r1.f10437 = r0
                java.lang.String r0 = r2.getContentType()
                r1.f10442 = r0
                java.util.LinkedHashMap r2 = m13394(r2)
                r1.m13404(r2)
                java.net.URL r0 = r1.f10410
                Yue.C1625.m7894(r3, r0, r2)
                if (r4 == 0) goto L95
                java.util.Map r2 = r4.mo7267()
                java.util.Set r2 = r2.entrySet()
                java.util.Iterator r2 = r2.iterator()
            L4b:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L73
                java.lang.Object r3 = r2.next()
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r0 = r3.getKey()
                java.lang.String r0 = (java.lang.String) r0
                boolean r0 = r1.mo7270(r0)
                if (r0 != 0) goto L4b
                java.lang.Object r0 = r3.getKey()
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r3 = r3.getValue()
                java.lang.String r3 = (java.lang.String) r3
                r1.mo7258(r0, r3)
                goto L4b
            L73:
                r4.m13405()
                int r2 = r4.f10445
                int r2 = r2 + 1
                r1.f10445 = r2
                r3 = 20
                if (r2 >= r3) goto L81
                goto L95
            L81:
                java.io.IOException r2 = new java.io.IOException
                java.net.URL r3 = r4.mo7261()
                java.lang.Object[] r3 = new java.lang.Object[]{r3}
                java.lang.String r4 = "Too many redirects occurred trying to load URL %s"
                java.lang.String r3 = java.lang.String.format(r4, r3)
                r2.<init>(r3)
                throw r2
            L95:
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
        public static java.net.HttpURLConnection m13393(Yue.C3157.C3161 r5) throws java.io.IOException {
                java.net.Proxy r0 = r5.mo7299()
                if (r0 != 0) goto Lf
                java.net.URL r0 = r5.mo7261()
                java.net.URLConnection r0 = r0.openConnection()
                goto L17
            Lf:
                java.net.URL r1 = r5.mo7261()
                java.net.URLConnection r0 = r1.openConnection(r0)
            L17:
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
                Yue.ۥ۟ۦۧۤ$ۥ۟۟ r1 = r5.mo7263()
                java.lang.String r1 = r1.name()
                r0.setRequestMethod(r1)
                r1 = 0
                r0.setInstanceFollowRedirects(r1)
                int r1 = r5.mo7282()
                r0.setConnectTimeout(r1)
                int r1 = r5.mo7282()
                int r1 = r1 / 2
                r0.setReadTimeout(r1)
                javax.net.ssl.SSLSocketFactory r1 = r5.mo7298()
                if (r1 == 0) goto L4c
                boolean r1 = r0 instanceof javax.net.ssl.HttpsURLConnection
                if (r1 == 0) goto L4c
                r1 = r0
                javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1
                javax.net.ssl.SSLSocketFactory r2 = r5.mo7298()
                r1.setSSLSocketFactory(r2)
            L4c:
                Yue.ۥۡۦۤۨ r1 = Yue.C3157.C3161.m13386(r5)
                if (r1 == 0) goto L5b
                Yue.ۥ۟ۢۡ۠$ۥ r1 = Yue.C0661.f1716
                Yue.ۥۡۦۤۨ r2 = Yue.C3157.C3161.m13386(r5)
                r1.mo4335(r2, r0)
            L5b:
                Yue.ۥ۟ۦۧۤ$ۥ۟۟ r1 = r5.mo7263()
                boolean r1 = r1.m7281()
                if (r1 == 0) goto L69
                r1 = 1
                r0.setDoOutput(r1)
            L69:
                Yue.C1625.m7891(r5, r0)
                java.util.Map r5 = r5.mo7266()
                java.util.Set r5 = r5.entrySet()
                java.util.Iterator r5 = r5.iterator()
            L78:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto La4
                java.lang.Object r1 = r5.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getValue()
                java.util.List r2 = (java.util.List) r2
                java.util.Iterator r2 = r2.iterator()
            L8e:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L78
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r1.getKey()
                java.lang.String r4 = (java.lang.String) r4
                r0.addRequestProperty(r4, r3)
                goto L8e
            La4:
                return r0
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
        public static java.util.LinkedHashMap<java.lang.String, java.util.List<java.lang.String>> m13394(java.net.HttpURLConnection r5) {
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                r1 = 0
            L6:
                java.lang.String r2 = r5.getHeaderFieldKey(r1)
                java.lang.String r3 = r5.getHeaderField(r1)
                if (r2 != 0) goto L13
                if (r3 != 0) goto L13
                return r0
            L13:
                int r1 = r1 + 1
                if (r2 == 0) goto L6
                if (r3 != 0) goto L1a
                goto L6
            L1a:
                boolean r4 = r0.containsKey(r2)
                if (r4 == 0) goto L2a
                java.lang.Object r2 = r0.get(r2)
                java.util.List r2 = (java.util.List) r2
                r2.add(r3)
                goto L6
            L2a:
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r4.add(r3)
                r0.put(r2, r4)
                goto L6
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
        public static Yue.C3157.C3162 m13395(Yue.C3157.C3161 r1) throws java.io.IOException {
                r0 = 0
                Yue.ۥ۠ۤۨ۠$ۥ۟۟۟۟ r1 = m13396(r1, r0)
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
        public static Yue.C3157.C3162 m13396(Yue.C3157.C3161 r8, Yue.C3157.C3162 r9) throws java.io.IOException {
                monitor-enter(r8)
                boolean r0 = Yue.C3157.C3161.m13383(r8)     // Catch: java.lang.Throwable -> L219
                java.lang.String r1 = "Multiple threads were detected trying to execute the same request concurrently. Make sure to use Connection#newRequest() and do not share an executing request between threads."
                Yue.C6657.m25627(r0, r1)     // Catch: java.lang.Throwable -> L219
                r0 = 1
                Yue.C3157.C3161.m13384(r8, r0)     // Catch: java.lang.Throwable -> L219
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L219
                java.lang.String r1 = "req"
                Yue.C6657.m25637(r8, r1)
                java.net.URL r1 = r8.mo7261()
                java.lang.String r2 = "URL must be specified to connect"
                Yue.C6657.m25636(r1, r2)
                java.lang.String r1 = r1.getProtocol()
                java.lang.String r2 = "http"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L3a
                java.lang.String r2 = "https"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L32
                goto L3a
            L32:
                java.net.MalformedURLException r8 = new java.net.MalformedURLException
                java.lang.String r9 = "Only http & https protocols supported"
                r8.<init>(r9)
                throw r8
            L3a:
                Yue.ۥ۟ۦۧۤ$ۥ۟۟ r1 = r8.mo7263()
                boolean r1 = r1.m7281()
                java.lang.String r2 = r8.mo7303()
                r3 = 0
                if (r2 == 0) goto L4b
                r2 = r0
                goto L4c
            L4b:
                r2 = r3
            L4c:
                if (r1 != 0) goto L66
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Cannot set a request body for HTTP method "
                r4.append(r5)
                Yue.ۥ۟ۦۧۤ$ۥ۟۟ r5 = r8.mo7263()
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                Yue.C6657.m25627(r2, r4)
            L66:
                java.util.Collection r4 = r8.data()
                int r4 = r4.size()
                r5 = 0
                if (r4 <= 0) goto L79
                if (r1 == 0) goto L75
                if (r2 == 0) goto L79
            L75:
                m13399(r8)
                goto L80
            L79:
                if (r1 == 0) goto L80
                java.lang.String r1 = m13400(r8)
                goto L81
            L80:
                r1 = r5
            L81:
                long r6 = java.lang.System.nanoTime()
                java.net.HttpURLConnection r2 = m13393(r8)
                r2.connect()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> La0
                boolean r4 = r2.getDoOutput()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> La0
                if (r4 == 0) goto Lae
                java.io.OutputStream r4 = r2.getOutputStream()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> La0
                m13401(r8, r4, r1)     // Catch: java.lang.Throwable -> La3 java.io.IOException -> La5
                r4.close()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> La0
                goto Lae
            L9d:
                r9 = move-exception
                goto L20a
            La0:
                r9 = move-exception
                goto L204
            La3:
                r9 = move-exception
                goto Laa
            La5:
                r9 = move-exception
                r2.disconnect()     // Catch: java.lang.Throwable -> La3
                throw r9     // Catch: java.lang.Throwable -> La3
            Laa:
                r4.close()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> La0
                throw r9     // Catch: java.lang.Throwable -> L9d java.io.IOException -> La0
            Lae:
                int r1 = r2.getResponseCode()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> La0
                Yue.ۥ۠ۤۨ۠$ۥ۟۟۟۟ r4 = new Yue.ۥ۠ۤۨ۠$ۥ۟۟۟۟     // Catch: java.lang.Throwable -> L9d java.io.IOException -> La0
                r4.<init>(r2, r8, r9)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> La0
                java.lang.String r9 = "Location"
                boolean r9 = r4.mo7260(r9)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                if (r9 == 0) goto L121
                boolean r9 = r8.mo7302()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                if (r9 == 0) goto L121
                r9 = 307(0x133, float:4.3E-43)
                if (r1 == r9) goto Le2
                Yue.ۥ۟ۦۧۤ$ۥ۟۟ r9 = Yue.InterfaceC1478.EnumC1481.f4623     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                r8.mo7257(r9)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                java.util.Collection r9 = r8.data()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                r9.clear()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                r8.mo7285(r5)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                java.lang.String r9 = "Content-Type"
                r8.mo7271(r9)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                goto Le2
            Lde:
                r9 = move-exception
                r5 = r4
                goto L204
            Le2:
                java.lang.String r9 = "Location"
                java.lang.String r9 = r4.mo7272(r9)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                Yue.C6657.m25635(r9)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                java.lang.String r0 = "http:/"
                boolean r0 = r9.startsWith(r0)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                if (r0 == 0) goto L100
                r0 = 6
                char r1 = r9.charAt(r0)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                r2 = 47
                if (r1 == r2) goto L100
                java.lang.String r9 = r9.substring(r0)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
            L100:
                java.net.URL r0 = r8.mo7261()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                java.net.URL r9 = Yue.C5973.m22130(r0, r9)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                r8.mo7259(r9)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                Yue.C3157.C3161.m13384(r8, r3)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                Yue.ۥ۠ۤۨ۠$ۥ۟۟۟۟ r9 = m13396(r8, r4)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                Yue.C3157.C3161.m13384(r8, r3)
                Yue.ۥۡۦۤۨ r8 = Yue.C3157.C3161.m13386(r8)
                if (r8 == 0) goto L120
                Yue.ۥ۟ۢۡ۠$ۥ r8 = Yue.C0661.f1716
                r8.remove()
            L120:
                return r9
            L121:
                r9 = 200(0xc8, float:2.8E-43)
                if (r1 < r9) goto L129
                r9 = 400(0x190, float:5.6E-43)
                if (r1 < r9) goto L12f
            L129:
                boolean r9 = r8.mo7295()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                if (r9 == 0) goto L1f4
            L12f:
                java.lang.String r9 = r4.mo7306()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                if (r9 == 0) goto L160
                boolean r1 = r8.mo7297()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                if (r1 != 0) goto L160
                java.lang.String r1 = "text/"
                boolean r1 = r9.startsWith(r1)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                if (r1 != 0) goto L160
                java.util.regex.Pattern r1 = Yue.C3157.C3162.f10435     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                java.util.regex.Matcher r1 = r1.matcher(r9)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                boolean r1 = r1.matches()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                if (r1 == 0) goto L150
                goto L160
            L150:
                Yue.ۥۣۢۡ۟ r0 = new Yue.ۥۣۢۡ۟     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                java.lang.String r1 = "Unhandled content type. Must be text/*, */xml, or */*+xml"
                java.net.URL r2 = r8.mo7261()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                r0.<init>(r1, r9, r2)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                throw r0     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
            L160:
                if (r9 == 0) goto L17b
                java.util.regex.Pattern r1 = Yue.C3157.C3162.f10435     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                java.util.regex.Matcher r9 = r1.matcher(r9)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                boolean r9 = r9.matches()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                if (r9 == 0) goto L17b
                boolean r9 = Yue.C3157.C3161.m13385(r8)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                if (r9 != 0) goto L17b
                Yue.ۥۣۡۧۦ r9 = Yue.C4700.m18624()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                r8.m13389(r9)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
            L17b:
                java.lang.String r9 = r4.f10442     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                java.lang.String r9 = Yue.C1726.m8231(r9)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                r4.f10441 = r9     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                int r9 = r2.getContentLength()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                if (r9 == 0) goto L1dd
                Yue.ۥ۟ۦۧۤ$ۥ۟۟ r9 = r8.mo7263()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                Yue.ۥ۟ۦۧۤ$ۥ۟۟ r1 = Yue.InterfaceC1478.EnumC1481.f4628     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                if (r9 == r1) goto L1dd
                java.io.InputStream r9 = r2.getErrorStream()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                if (r9 == 0) goto L19c
                java.io.InputStream r9 = r2.getErrorStream()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                goto L1a0
            L19c:
                java.io.InputStream r9 = r2.getInputStream()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
            L1a0:
                java.lang.String r1 = "Content-Encoding"
                java.lang.String r2 = "gzip"
                boolean r1 = r4.mo7262(r1, r2)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                if (r1 == 0) goto L1b1
                java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                r1.<init>(r9)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
            L1af:
                r9 = r1
                goto L1c6
            L1b1:
                java.lang.String r1 = "Content-Encoding"
                java.lang.String r2 = "deflate"
                boolean r1 = r4.mo7262(r1, r2)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                if (r1 == 0) goto L1c6
                java.util.zip.InflaterInputStream r1 = new java.util.zip.InflaterInputStream     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                java.util.zip.Inflater r2 = new java.util.zip.Inflater     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                r2.<init>(r0)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                r1.<init>(r9, r2)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                goto L1af
            L1c6:
                int r1 = r8.mo7304()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                r2 = 32768(0x8000, float:4.5918E-41)
                Yue.ۥ۟ۧۥۧ r9 = Yue.C1618.m7838(r9, r2, r1)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                int r1 = r8.mo7282()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                long r1 = (long) r1     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                Yue.ۥ۟ۧۥۧ r9 = r9.m7841(r6, r1)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                r4.f10439 = r9     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                goto L1e3
            L1dd:
                java.nio.ByteBuffer r9 = Yue.C1726.m8230()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                r4.f10438 = r9     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
            L1e3:
                Yue.C3157.C3161.m13384(r8, r3)
                Yue.ۥۡۦۤۨ r8 = Yue.C3157.C3161.m13386(r8)
                if (r8 == 0) goto L1f1
                Yue.ۥ۟ۢۡ۠$ۥ r8 = Yue.C0661.f1716
                r8.remove()
            L1f1:
                r4.f10443 = r0
                return r4
            L1f4:
                Yue.ۥ۠ۤۨۤ r9 = new Yue.ۥ۠ۤۨۤ     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                java.lang.String r0 = "HTTP error fetching URL"
                java.net.URL r2 = r8.mo7261()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                r9.<init>(r0, r1, r2)     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
                throw r9     // Catch: java.lang.Throwable -> L9d java.io.IOException -> Lde
            L204:
                if (r5 == 0) goto L209
                r5.m13405()     // Catch: java.lang.Throwable -> L9d
            L209:
                throw r9     // Catch: java.lang.Throwable -> L9d
            L20a:
                Yue.C3157.C3161.m13384(r8, r3)
                Yue.ۥۡۦۤۨ r8 = Yue.C3157.C3161.m13386(r8)
                if (r8 == 0) goto L218
                Yue.ۥ۟ۢۡ۠$ۥ r8 = Yue.C0661.f1716
                r8.remove()
            L218:
                throw r9
            L219:
                r9 = move-exception
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L219
                throw r9
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
        public static java.lang.String m13397(java.lang.String r2) {
                if (r2 != 0) goto L3
                return r2
            L3:
                java.nio.charset.Charset r0 = Yue.C3157.m13367()
                byte[] r0 = r2.getBytes(r0)
                boolean r1 = m13398(r0)
                if (r1 == 0) goto L18
                java.lang.String r2 = new java.lang.String
                java.nio.charset.Charset r1 = Yue.C1726.f5381
                r2.<init>(r0, r1)
            L18:
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
        public static boolean m13398(byte[] r8) {
                int r0 = r8.length
                r1 = 1
                r2 = 0
                r3 = 3
                if (r0 < r3) goto L20
                r0 = r8[r2]
                r0 = r0 & 255(0xff, float:3.57E-43)
                r4 = 239(0xef, float:3.35E-43)
                if (r0 != r4) goto L20
                r0 = r8[r1]
                r0 = r0 & 255(0xff, float:3.57E-43)
                r4 = 187(0xbb, float:2.62E-43)
                if (r0 != r4) goto L20
                r0 = 2
                r0 = r8[r0]
                r0 = r0 & 255(0xff, float:3.57E-43)
                r4 = 191(0xbf, float:2.68E-43)
                if (r0 != r4) goto L20
                goto L21
            L20:
                r3 = r2
            L21:
                int r0 = r8.length
                r4 = r2
            L23:
                if (r3 >= r0) goto L5a
                r5 = r8[r3]
                r6 = r5 & 128(0x80, float:1.8E-43)
                if (r6 != 0) goto L2c
                goto L57
            L2c:
                r4 = r5 & 224(0xe0, float:3.14E-43)
                r6 = 192(0xc0, float:2.69E-43)
                if (r4 != r6) goto L35
                int r4 = r3 + 1
                goto L46
            L35:
                r4 = r5 & 240(0xf0, float:3.36E-43)
                r7 = 224(0xe0, float:3.14E-43)
                if (r4 != r7) goto L3e
                int r4 = r3 + 2
                goto L46
            L3e:
                r4 = r5 & 248(0xf8, float:3.48E-43)
                r5 = 240(0xf0, float:3.36E-43)
                if (r4 != r5) goto L59
                int r4 = r3 + 3
            L46:
                int r5 = r8.length
                if (r4 < r5) goto L4a
                return r2
            L4a:
                if (r3 >= r4) goto L56
                int r3 = r3 + 1
                r5 = r8[r3]
                r5 = r5 & r6
                r7 = 128(0x80, float:1.8E-43)
                if (r5 == r7) goto L4a
                return r2
            L56:
                r4 = r1
            L57:
                int r3 = r3 + r1
                goto L23
            L59:
                return r2
            L5a:
                return r4
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
        public static void m13399(Yue.InterfaceC1478.InterfaceC1482 r5) throws java.io.IOException {
                Yue.ۥۣۣۢۡ r0 = new Yue.ۥۣۣۢۡ
                java.net.URL r1 = r5.mo7261()
                r0.<init>(r1)
                java.util.Collection r1 = r5.data()
                java.util.Iterator r1 = r1.iterator()
            L11:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L2a
                java.lang.Object r2 = r1.next()
                Yue.ۥ۟ۦۧۤ$ۥ۟ r2 = (Yue.InterfaceC1478.InterfaceC1480) r2
                boolean r3 = r2.mo7278()
                java.lang.String r4 = "InputStream data not supported in URL query string."
                Yue.C6657.m25627(r3, r4)
                r0.m25472(r2)
                goto L11
            L2a:
                java.net.URL r0 = r0.m25473()
                r5.mo7259(r0)
                java.util.Collection r5 = r5.data()
                r5.clear()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
        public static java.lang.String m13400(Yue.InterfaceC1478.InterfaceC1482 r4) {
                java.lang.String r0 = "Content-Type"
                java.lang.String r1 = r4.mo7272(r0)
                java.lang.String r2 = "multipart/form-data; boundary="
                if (r1 == 0) goto L31
                java.lang.String r3 = "multipart/form-data"
                boolean r3 = r1.contains(r3)
                if (r3 == 0) goto L66
                java.lang.String r3 = "boundary"
                boolean r1 = r1.contains(r3)
                if (r1 != 0) goto L66
                java.lang.String r1 = Yue.C1726.m8236()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r2)
                r3.append(r1)
                java.lang.String r2 = r3.toString()
                r4.mo7256(r0, r2)
                goto L67
            L31:
                boolean r1 = Yue.C3157.m13368(r4)
                if (r1 == 0) goto L4e
                java.lang.String r1 = Yue.C1726.m8236()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r2)
                r3.append(r1)
                java.lang.String r2 = r3.toString()
                r4.mo7256(r0, r2)
                goto L67
            L4e:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "application/x-www-form-urlencoded; charset="
                r1.append(r2)
                java.lang.String r2 = r4.mo7296()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r4.mo7256(r0, r1)
            L66:
                r1 = 0
            L67:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
        public static void m13401(Yue.InterfaceC1478.InterfaceC1482 r6, java.io.OutputStream r7, java.lang.String r8) throws java.io.IOException {
                java.util.Collection r0 = r6.data()
                java.io.BufferedWriter r1 = new java.io.BufferedWriter
                java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter
                java.lang.String r3 = r6.mo7296()
                java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)
                r2.<init>(r7, r3)
                r1.<init>(r2)
                if (r8 == 0) goto L98
                java.util.Iterator r6 = r0.iterator()
            L1c:
                boolean r0 = r6.hasNext()
                java.lang.String r2 = "--"
                if (r0 == 0) goto L8e
                java.lang.Object r0 = r6.next()
                Yue.ۥ۟ۦۧۤ$ۥ۟ r0 = (Yue.InterfaceC1478.InterfaceC1480) r0
                r1.write(r2)
                r1.write(r8)
                java.lang.String r2 = "\r\n"
                r1.write(r2)
                java.lang.String r3 = "Content-Disposition: form-data; name=\""
                r1.write(r3)
                java.lang.String r3 = r0.key()
                java.lang.String r3 = Yue.C3157.m13369(r3)
                r1.write(r3)
                java.lang.String r3 = "\""
                r1.write(r3)
                java.io.InputStream r3 = r0.mo7279()
                java.lang.String r4 = "\r\n\r\n"
                if (r3 == 0) goto L80
                java.lang.String r5 = "; filename=\""
                r1.write(r5)
                java.lang.String r5 = r0.value()
                java.lang.String r5 = Yue.C3157.m13369(r5)
                r1.write(r5)
                java.lang.String r5 = "\"\r\nContent-Type: "
                r1.write(r5)
                java.lang.String r0 = r0.mo7274()
                if (r0 == 0) goto L6e
                goto L70
            L6e:
                java.lang.String r0 = "application/octet-stream"
            L70:
                r1.write(r0)
                r1.write(r4)
                r1.flush()
                Yue.C1726.m8228(r3, r7)
                r7.flush()
                goto L8a
            L80:
                r1.write(r4)
                java.lang.String r0 = r0.value()
                r1.write(r0)
            L8a:
                r1.write(r2)
                goto L1c
            L8e:
                r1.write(r2)
                r1.write(r8)
                r1.write(r2)
                goto Le0
            L98:
                java.lang.String r7 = r6.mo7303()
                if (r7 == 0) goto La2
                r1.write(r7)
                goto Le0
            La2:
                java.util.Iterator r7 = r0.iterator()
                r8 = 1
            La7:
                boolean r0 = r7.hasNext()
                if (r0 == 0) goto Le0
                java.lang.Object r0 = r7.next()
                Yue.ۥ۟ۦۧۤ$ۥ۟ r0 = (Yue.InterfaceC1478.InterfaceC1480) r0
                if (r8 != 0) goto Lbb
                r2 = 38
                r1.append(r2)
                goto Lbc
            Lbb:
                r8 = 0
            Lbc:
                java.lang.String r2 = r0.key()
                java.lang.String r3 = r6.mo7296()
                java.lang.String r2 = java.net.URLEncoder.encode(r2, r3)
                r1.write(r2)
                r2 = 61
                r1.write(r2)
                java.lang.String r0 = r0.value()
                java.lang.String r2 = r6.mo7296()
                java.lang.String r0 = java.net.URLEncoder.encode(r0, r2)
                r1.write(r0)
                goto La7
            Le0:
                r1.close()
                return
        }

        @Override // Yue.InterfaceC1478.InterfaceC1483
        /* JADX INFO: renamed from: ۥ۟ */
        public java.lang.String mo7306() {
                r1 = this;
                java.lang.String r0 = r1.f10442
                return r0
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC1478.InterfaceC1479 mo7256(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                Yue.ۥ۟ۦۧۤ$ۥ r1 = super.mo7256(r1, r2)
                return r1
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC1478.InterfaceC1479 mo7257(Yue.InterfaceC1478.EnumC1481 r1) {
                r0 = this;
                Yue.ۥ۟ۦۧۤ$ۥ r1 = super.mo7257(r1)
                return r1
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC1478.InterfaceC1479 mo7258(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                Yue.ۥ۟ۦۧۤ$ۥ r1 = super.mo7258(r1, r2)
                return r1
        }

        @Override // Yue.InterfaceC1478.InterfaceC1483
        /* JADX INFO: renamed from: ۥ۟۟۠ */
        public java.lang.String mo7307() {
                r2 = this;
                r2.m13403()
                java.nio.ByteBuffer r0 = r2.f10438
                Yue.C6657.m25635(r0)
                java.lang.String r0 = r2.f10441
                if (r0 != 0) goto Lf
                java.nio.charset.Charset r0 = Yue.C1726.f5381
                goto L13
            Lf:
                java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            L13:
                java.nio.ByteBuffer r1 = r2.f10438
                java.nio.CharBuffer r0 = r0.decode(r1)
                java.lang.String r0 = r0.toString()
                java.nio.ByteBuffer r1 = r2.f10438
                r1.rewind()
                return r0
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC1478.InterfaceC1479 mo7259(java.net.URL r1) {
                r0 = this;
                Yue.ۥ۟ۦۧۤ$ۥ r1 = super.mo7259(r1)
                return r1
        }

        @Override // Yue.InterfaceC1478.InterfaceC1483
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
        public java.io.BufferedInputStream mo7308() {
                r3 = this;
                boolean r0 = r3.f10443
                java.lang.String r1 = "Request must be executed (with .execute(), .get(), or .post() before getting response body"
                Yue.C6657.m25629(r0, r1)
                java.nio.ByteBuffer r0 = r3.f10438
                if (r0 == 0) goto L1f
                java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
                java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
                java.nio.ByteBuffer r2 = r3.f10438
                byte[] r2 = r2.array()
                r1.<init>(r2)
                r2 = 32768(0x8000, float:4.5918E-41)
                r0.<init>(r1, r2)
                return r0
            L1f:
                boolean r0 = r3.f10444
                java.lang.String r1 = "Request has already been read"
                Yue.C6657.m25627(r0, r1)
                Yue.ۥ۟ۧۥۧ r0 = r3.f10439
                Yue.C6657.m25635(r0)
                r0 = 1
                r3.f10444 = r0
                Yue.ۥ۟ۧۥۧ r0 = r3.f10439
                java.io.BufferedInputStream r0 = r0.m7840()
                return r0
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
        public /* bridge */ /* synthetic */ boolean mo7260(java.lang.String r1) {
                r0 = this;
                boolean r1 = super.mo7260(r1)
                return r1
        }

        @Override // Yue.InterfaceC1478.InterfaceC1483
        /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
        public java.lang.String mo7309() {
                r1 = this;
                java.lang.String r0 = r1.f10441
                return r0
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۡ */
        public /* bridge */ /* synthetic */ java.net.URL mo7261() {
                r1 = this;
                java.net.URL r0 = super.mo7261()
                return r0
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
        public /* bridge */ /* synthetic */ boolean mo7262(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                boolean r1 = super.mo7262(r1, r2)
                return r1
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC1478.EnumC1481 mo7263() {
                r1 = this;
                Yue.ۥ۟ۦۧۤ$ۥ۟۟ r0 = super.mo7263()
                return r0
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC1478.InterfaceC1479 mo7264(java.lang.String r1) {
                r0 = this;
                Yue.ۥ۟ۦۧۤ$ۥ r1 = super.mo7264(r1)
                return r1
        }

        @Override // Yue.InterfaceC1478.InterfaceC1483
        /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC1478.InterfaceC1483 mo7310(java.lang.String r1) {
                r0 = this;
                Yue.ۥ۠ۤۨ۠$ۥ۟۟۟۟ r1 = r0.m13402(r1)
                return r1
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
        public /* bridge */ /* synthetic */ java.util.List mo7265(java.lang.String r1) {
                r0 = this;
                java.util.List r1 = super.mo7265(r1)
                return r1
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
        public /* bridge */ /* synthetic */ java.util.Map mo7266() {
                r1 = this;
                java.util.Map r0 = super.mo7266()
                return r0
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
        public /* bridge */ /* synthetic */ java.util.Map mo7267() {
                r1 = this;
                java.util.Map r0 = super.mo7267()
                return r0
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۢ */
        public /* bridge */ /* synthetic */ java.lang.String mo7268(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = super.mo7268(r1)
                return r1
        }

        @Override // Yue.InterfaceC1478.InterfaceC1483
        /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
        public Yue.InterfaceC1478.InterfaceC1483 mo7311() {
                r0 = this;
                r0.m13403()
                return r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1483
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
        public Yue.C1948 mo7312() throws java.io.IOException {
                r4 = this;
                boolean r0 = r4.f10443
                java.lang.String r1 = "Request must be executed (with .execute(), .get(), or .post() before parsing response"
                Yue.C6657.m25629(r0, r1)
                Yue.ۥ۟ۧۥۧ r0 = r4.f10439
                java.nio.ByteBuffer r1 = r4.f10438
                if (r1 == 0) goto L1b
                java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
                java.nio.ByteBuffer r1 = r4.f10438
                byte[] r1 = r1.array()
                r0.<init>(r1)
                r1 = 0
                r4.f10444 = r1
            L1b:
                boolean r1 = r4.f10444
                java.lang.String r2 = "Input stream already read and parsed, cannot re-read."
                Yue.C6657.m25627(r1, r2)
                java.lang.String r1 = r4.f10441
                java.net.URL r2 = r4.f10410
                java.lang.String r2 = r2.toExternalForm()
                Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r3 = r4.f10446
                Yue.ۥۣۡۧۦ r3 = r3.mo7305()
                Yue.ۥ۠۟ۧۥ r0 = Yue.C1726.m8237(r0, r1, r2, r3)
                Yue.ۥ۠ۤۨ۠ r1 = new Yue.ۥ۠ۤۨ۠
                Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r2 = r4.f10446
                r3 = 0
                r1.<init>(r2, r4, r3)
                r0.m8946(r1)
                Yue.ۥ۠۟ۧۥ$ۥ r1 = r0.m8955()
                java.nio.charset.Charset r1 = r1.m8968()
                java.lang.String r1 = r1.name()
                r4.f10441 = r1
                r1 = 1
                r4.f10444 = r1
                r4.m13405()
                return r0
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC1478.InterfaceC1479 mo7269(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                Yue.ۥ۟ۦۧۤ$ۥ r1 = super.mo7269(r1, r2)
                return r1
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۢۤ */
        public /* bridge */ /* synthetic */ boolean mo7270(java.lang.String r1) {
                r0 = this;
                boolean r1 = super.mo7270(r1)
                return r1
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۢۥ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC1478.InterfaceC1479 mo7271(java.lang.String r1) {
                r0 = this;
                Yue.ۥ۟ۦۧۤ$ۥ r1 = super.mo7271(r1)
                return r1
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۢۦ */
        public /* bridge */ /* synthetic */ java.lang.String mo7272(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = super.mo7272(r1)
                return r1
        }

        @Override // Yue.C3157.AbstractC3159, Yue.InterfaceC1478.InterfaceC1479
        /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
        public /* bridge */ /* synthetic */ java.util.Map mo7273() {
                r1 = this;
                java.util.Map r0 = super.mo7273()
                return r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1483
        /* JADX INFO: renamed from: ۥ۟۟ۢۨ */
        public int mo7313() {
                r1 = this;
                int r0 = r1.f10436
                return r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1483
        /* JADX INFO: renamed from: ۥۣ۟۟۠ */
        public java.lang.String mo7314() {
                r1 = this;
                java.lang.String r0 = r1.f10437
                return r0
        }

        @Override // Yue.InterfaceC1478.InterfaceC1483
        /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
        public byte[] mo7315() {
                r1 = this;
                r1.m13403()
                java.nio.ByteBuffer r0 = r1.f10438
                Yue.C6657.m25635(r0)
                java.nio.ByteBuffer r0 = r1.f10438
                byte[] r0 = r0.array()
                return r0
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
        public Yue.C3157.C3162 m13402(java.lang.String r1) {
                r0 = this;
                r0.f10441 = r1
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
        public final void m13403() {
                r3 = this;
                boolean r0 = r3.f10443
                java.lang.String r1 = "Request must be executed (with .execute(), .get(), or .post() before getting response body"
                Yue.C6657.m25629(r0, r1)
                Yue.ۥ۟ۧۥۧ r0 = r3.f10439
                if (r0 == 0) goto L3a
                java.nio.ByteBuffer r0 = r3.f10438
                if (r0 != 0) goto L3a
                boolean r0 = r3.f10444
                java.lang.String r1 = "Request has already been read (with .parse())"
                Yue.C6657.m25627(r0, r1)
                r0 = 1
                Yue.ۥ۟ۧۥۧ r1 = r3.f10439     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
                Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r2 = r3.f10446     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
                int r2 = r2.mo7304()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
                java.nio.ByteBuffer r1 = Yue.C1726.m8238(r1, r2)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
                r3.f10438 = r1     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
                r3.f10444 = r0
                r3.m13405()
                goto L3a
            L2b:
                r1 = move-exception
                goto L34
            L2d:
                r1 = move-exception
                Yue.ۥۣۢ۟ۦ r2 = new Yue.ۥۣۢ۟ۦ     // Catch: java.lang.Throwable -> L2b
                r2.<init>(r1)     // Catch: java.lang.Throwable -> L2b
                throw r2     // Catch: java.lang.Throwable -> L2b
            L34:
                r3.f10444 = r0
                r3.m13405()
                throw r1
            L3a:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
        public void m13404(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7) {
                r6 = this;
                java.util.Set r7 = r7.entrySet()
                java.util.Iterator r7 = r7.iterator()
            L8:
                boolean r0 = r7.hasNext()
                if (r0 == 0) goto L81
                java.lang.Object r0 = r7.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto L1d
                goto L8
            L1d:
                java.lang.Object r0 = r0.getValue()
                java.util.List r0 = (java.util.List) r0
                java.lang.String r2 = "Set-Cookie"
                boolean r2 = r1.equalsIgnoreCase(r2)
                if (r2 == 0) goto L69
                java.util.Iterator r2 = r0.iterator()
            L2f:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L69
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                if (r3 != 0) goto L3e
                goto L2f
            L3e:
                Yue.ۥۢۡۧۢ r4 = new Yue.ۥۢۡۧۢ
                r4.<init>(r3)
                java.lang.String r3 = "="
                java.lang.String r3 = r4.m23460(r3)
                java.lang.String r3 = r3.trim()
                java.lang.String r5 = ";"
                java.lang.String r4 = r4.m23467(r5)
                java.lang.String r4 = r4.trim()
                int r5 = r3.length()
                if (r5 <= 0) goto L2f
                java.util.Map<java.lang.String, java.lang.String> r5 = r6.f10413
                boolean r5 = r5.containsKey(r3)
                if (r5 != 0) goto L2f
                r6.mo7258(r3, r4)
                goto L2f
            L69:
                java.util.Iterator r0 = r0.iterator()
            L6d:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L8
                java.lang.Object r2 = r0.next()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r2 = m13397(r2)
                r6.mo7269(r1, r2)
                goto L6d
            L81:
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
        public final void m13405() {
                r2 = this;
                Yue.ۥ۟ۧۥۧ r0 = r2.f10439
                r1 = 0
                if (r0 == 0) goto Lf
                r0.close()     // Catch: java.io.IOException -> L8 java.lang.Throwable -> Lb
            L8:
                r2.f10439 = r1
                goto Lf
            Lb:
                r0 = move-exception
                r2.f10439 = r1
                throw r0
            Lf:
                java.net.HttpURLConnection r0 = r2.f10440
                if (r0 == 0) goto L18
                r0.disconnect()
                r2.f10440 = r1
            L18:
                return
        }
    }

    static {
            java.lang.String r0 = "ISO-8859-1"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            Yue.C3157.f10406 = r0
            return
    }

    public C3157() {
            r1 = this;
            r1.<init>()
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = new Yue.ۥ۠ۤۨ۠$ۥ۟۟۟
            r0.<init>()
            r1.f10407 = r0
            return
    }

    public C3157(Yue.C3157.C3161 r2) {
            r1 = this;
            r1.<init>()
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = new Yue.ۥ۠ۤۨ۠$ۥ۟۟۟
            r0.<init>(r2)
            r1.f10407 = r0
            return
    }

    public C3157(Yue.C3157.C3161 r1, Yue.C3157.C3162 r2) {
            r0 = this;
            r0.<init>()
            r0.f10407 = r1
            r0.f10408 = r2
            return
    }

    public /* synthetic */ C3157(Yue.C3157.C3161 r1, Yue.C3157.C3162 r2, Yue.C3157.C3158 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static /* synthetic */ java.nio.charset.Charset m13367() {
            java.nio.charset.Charset r0 = Yue.C3157.f10406
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static /* synthetic */ boolean m13368(Yue.InterfaceC1478.InterfaceC1482 r0) {
            boolean r0 = m13373(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m13369(java.lang.String r0) {
            java.lang.String r0 = m13372(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static Yue.InterfaceC1478 m13370(java.lang.String r1) {
            Yue.ۥ۠ۤۨ۠ r0 = new Yue.ۥ۠ۤۨ۠
            r0.<init>()
            r0.mo7239(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static Yue.InterfaceC1478 m13371(java.net.URL r1) {
            Yue.ۥ۠ۤۨ۠ r0 = new Yue.ۥ۠ۤۨ۠
            r0.<init>()
            r0.mo7235(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static java.lang.String m13372(java.lang.String r2) {
            java.lang.String r0 = "\""
            java.lang.String r1 = "%22"
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static boolean m13373(Yue.InterfaceC1478.InterfaceC1482 r1) {
            java.util.Collection r1 = r1.data()
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r1.next()
            Yue.ۥ۟ۦۧۤ$ۥ۟ r0 = (Yue.InterfaceC1478.InterfaceC1480) r0
            boolean r0 = r0.mo7278()
            if (r0 == 0) goto L8
            r1 = 1
            return r1
        L1c:
            r1 = 0
            return r1
    }

    @Override // Yue.InterfaceC1478
    public Yue.C1948 get() throws java.io.IOException {
            r2 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r2.f10407
            Yue.ۥ۟ۦۧۤ$ۥ۟۟ r1 = Yue.InterfaceC1478.EnumC1481.f4623
            r0.mo7257(r1)
            r2.mo7231()
            Yue.ۥ۟ۦۧۤ$ۥ۟۟۟۟ r0 = r2.f10408
            Yue.C6657.m25635(r0)
            Yue.ۥ۟ۦۧۤ$ۥ۟۟۟۟ r0 = r2.f10408
            Yue.ۥ۠۟ۧۥ r0 = r0.mo7312()
            return r0
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ */
    public Yue.InterfaceC1478 mo7217(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "userAgent"
            Yue.C6657.m25637(r3, r0)
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r2.f10407
            java.lang.String r1 = "User-Agent"
            r0.mo7256(r1, r3)
            return r2
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟ */
    public Yue.InterfaceC1478.InterfaceC1482 mo7218() {
            r1 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r1.f10407
            return r0
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟ */
    public Yue.InterfaceC1478 mo7219(Yue.C4700 r2) {
            r1 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r1.f10407
            r0.m13389(r2)
            return r1
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public Yue.InterfaceC1478 mo7220(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r1.f10407
            r0.mo7256(r2, r3)
            return r1
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public Yue.InterfaceC1478 mo7221(boolean r2) {
            r1 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r1.f10407
            r0.mo7284(r2)
            return r1
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public Yue.InterfaceC1478 mo7222(Yue.InterfaceC1478.EnumC1481 r2) {
            r1 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r1.f10407
            r0.mo7257(r2)
            return r1
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public Yue.InterfaceC1478 mo7223(java.lang.String r2) {
            r1 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r1.f10407
            r0.mo7285(r2)
            return r1
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public Yue.InterfaceC1478 mo7224(Yue.InterfaceC5319 r2) {
            r1 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r1.f10407
            r0.mo7286(r2)
            return r1
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public Yue.InterfaceC1478 mo7225(java.lang.String r2, int r3) {
            r1 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r1.f10407
            r0.m13390(r2, r3)
            return r1
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public Yue.InterfaceC1478 mo7226(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r1.f10407
            r0.mo7258(r2, r3)
            return r1
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public Yue.InterfaceC1478 mo7227(int r2) {
            r1 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r1.f10407
            r0.m13392(r2)
            return r1
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public Yue.InterfaceC1478 mo7228(int r2) {
            r1 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r1.f10407
            r0.mo7289(r2)
            return r1
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public Yue.InterfaceC1478 mo7229(boolean r2) {
            r1 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r1.f10407
            r0.mo7290(r2)
            return r1
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public Yue.InterfaceC1478 mo7230(javax.net.ssl.SSLSocketFactory r2) {
            r1 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r1.f10407
            r0.mo7291(r2)
            return r1
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public Yue.InterfaceC1478.InterfaceC1483 mo7231() throws java.io.IOException {
            r1 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r1.f10407
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟۟ r0 = Yue.C3157.C3162.m13395(r0)
            r1.f10408 = r0
            return r0
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public Yue.InterfaceC1478 mo7232(java.lang.String r2) {
            r1 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r1.f10407
            r0.mo7292(r2)
            return r1
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public Yue.InterfaceC1478 mo7233(java.net.Proxy r2) {
            r1 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r1.f10407
            r0.m13391(r2)
            return r1
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public Yue.InterfaceC1478 mo7234(boolean r2) {
            r1 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r1.f10407
            r0.mo7294(r2)
            return r1
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public Yue.InterfaceC1478 mo7235(java.net.URL r2) {
            r1 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r1.f10407
            r0.mo7259(r2)
            return r1
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public Yue.InterfaceC1478 mo7236(java.util.Collection<Yue.InterfaceC1478.InterfaceC1480> r3) {
            r2 = this;
            java.lang.String r0 = "data"
            Yue.C6657.m25637(r3, r0)
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r3.next()
            Yue.ۥ۟ۦۧۤ$ۥ۟ r0 = (Yue.InterfaceC1478.InterfaceC1480) r0
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r1 = r2.f10407
            r1.m13388(r0)
            goto L9
        L1b:
            return r2
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public Yue.InterfaceC1478 mo7237(java.util.Map<java.lang.String, java.lang.String> r4) {
            r3 = this;
            java.lang.String r0 = "headers"
            Yue.C6657.m25637(r4, r0)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r1 = r3.f10407
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r1.mo7256(r2, r0)
            goto Ld
        L2b:
            return r3
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public Yue.InterfaceC1478 mo7238(java.lang.String r2, java.lang.String r3, java.io.InputStream r4, java.lang.String r5) {
            r1 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r1.f10407
            Yue.ۥ۠ۤۨ۠$ۥ۟۟ r2 = Yue.C3157.C3160.m13377(r2, r3, r4)
            Yue.ۥ۟ۦۧۤ$ۥ۟ r2 = r2.mo7276(r5)
            r0.m13388(r2)
            return r1
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public Yue.InterfaceC1478 mo7239(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "url"
            Yue.C6657.m25634(r4, r0)
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r3.f10407     // Catch: java.net.MalformedURLException -> L10
            java.net.URL r1 = new java.net.URL     // Catch: java.net.MalformedURLException -> L10
            r1.<init>(r4)     // Catch: java.net.MalformedURLException -> L10
            r0.mo7259(r1)     // Catch: java.net.MalformedURLException -> L10
            return r3
        L10:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The supplied URL, '%s', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = java.lang.String.format(r2, r4)
            r1.<init>(r4, r0)
            throw r1
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public Yue.InterfaceC1478 mo7240() {
            r2 = this;
            Yue.ۥ۠ۤۨ۠ r0 = new Yue.ۥ۠ۤۨ۠
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r1 = r2.f10407
            r0.<init>(r1)
            return r0
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public Yue.InterfaceC1478.InterfaceC1483 mo7241() {
            r2 = this;
            Yue.ۥ۟ۦۧۤ$ۥ۟۟۟۟ r0 = r2.f10408
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "You must execute the request before getting a response."
            r0.<init>(r1)
            throw r0
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public Yue.InterfaceC1478 mo7242(java.net.CookieStore r4) {
            r3 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r3.f10407
            java.net.CookieManager r1 = new java.net.CookieManager
            r2 = 0
            r1.<init>(r4, r2)
            Yue.C3157.C3161.m13382(r0, r1)
            return r3
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public Yue.InterfaceC1478 mo7243(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r1.f10407
            Yue.ۥ۠ۤۨ۠$ۥ۟۟ r2 = Yue.C3157.C3160.m13376(r2, r3)
            r0.m13388(r2)
            return r1
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public java.net.CookieStore mo7244() {
            r1 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r1.f10407
            java.net.CookieManager r0 = Yue.C3157.C3161.m13381(r0)
            java.net.CookieStore r0 = r0.getCookieStore()
            return r0
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public Yue.InterfaceC1478 mo7245(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "referrer"
            Yue.C6657.m25637(r3, r0)
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r2.f10407
            java.lang.String r1 = "Referer"
            r0.mo7256(r1, r3)
            return r2
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    public Yue.InterfaceC1478 mo7246(java.util.Map<java.lang.String, java.lang.String> r4) {
            r3 = this;
            java.lang.String r0 = "cookies"
            Yue.C6657.m25637(r4, r0)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r1 = r3.f10407
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r1.mo7258(r2, r0)
            goto Ld
        L2b:
            return r3
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public Yue.InterfaceC1478 mo7247(java.lang.String r2, java.lang.String r3, java.io.InputStream r4) {
            r1 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r1.f10407
            Yue.ۥ۠ۤۨ۠$ۥ۟۟ r2 = Yue.C3157.C3160.m13377(r2, r3, r4)
            r0.m13388(r2)
            return r1
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public Yue.C1948 mo7248() throws java.io.IOException {
            r2 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r0 = r2.f10407
            Yue.ۥ۟ۦۧۤ$ۥ۟۟ r1 = Yue.InterfaceC1478.EnumC1481.f4624
            r0.mo7257(r1)
            r2.mo7231()
            Yue.ۥ۟ۦۧۤ$ۥ۟۟۟۟ r0 = r2.f10408
            Yue.C6657.m25635(r0)
            Yue.ۥ۟ۦۧۤ$ۥ۟۟۟۟ r0 = r2.f10408
            Yue.ۥ۠۟ۧۥ r0 = r0.mo7312()
            return r0
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public Yue.InterfaceC1478 mo7249(java.lang.String... r5) {
            r4 = this;
            java.lang.String r0 = "keyvals"
            Yue.C6657.m25637(r5, r0)
            int r0 = r5.length
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = r1
        Le:
            java.lang.String r2 = "Must supply an even number of key value pairs"
            Yue.C6657.m25629(r0, r2)
        L13:
            int r0 = r5.length
            if (r1 >= r0) goto L32
            r0 = r5[r1]
            int r2 = r1 + 1
            r2 = r5[r2]
            java.lang.String r3 = "Data key must not be empty"
            Yue.C6657.m25633(r0, r3)
            java.lang.String r3 = "Data value must not be null"
            Yue.C6657.m25636(r2, r3)
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r3 = r4.f10407
            Yue.ۥ۠ۤۨ۠$ۥ۟۟ r0 = Yue.C3157.C3160.m13376(r0, r2)
            r3.m13388(r0)
            int r1 = r1 + 2
            goto L13
        L32:
            return r4
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
    public Yue.InterfaceC1478 mo7251(Yue.InterfaceC1478.InterfaceC1483 r1) {
            r0 = this;
            r0.f10408 = r1
            return r0
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    public Yue.InterfaceC1478.InterfaceC1480 mo7252(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "key"
            Yue.C6657.m25634(r4, r0)
            Yue.ۥ۟ۦۧۤ$ۥ۟۟۟ r0 = r3.mo7218()
            java.util.Collection r0 = r0.data()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            Yue.ۥ۟ۦۧۤ$ۥ۟ r1 = (Yue.InterfaceC1478.InterfaceC1480) r1
            java.lang.String r2 = r1.key()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L11
            return r1
        L28:
            r4 = 0
            return r4
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public Yue.InterfaceC1478 mo7253(java.util.Map<java.lang.String, java.lang.String> r4) {
            r3 = this;
            java.lang.String r0 = "data"
            Yue.C6657.m25637(r4, r0)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r1 = r3.f10407
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            Yue.ۥ۠ۤۨ۠$ۥ۟۟ r0 = Yue.C3157.C3160.m13376(r2, r0)
            r1.m13388(r0)
            goto Ld
        L2f:
            return r3
    }

    @Override // Yue.InterfaceC1478
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    public Yue.InterfaceC1478 mo7254(Yue.InterfaceC1478.InterfaceC1482 r1) {
            r0 = this;
            Yue.ۥ۠ۤۨ۠$ۥ۟۟۟ r1 = (Yue.C3157.C3161) r1
            r0.f10407 = r1
            return r0
    }
}

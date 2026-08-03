package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5680<E> extends Yue.AbstractC0071<E> implements java.util.Set<E>, java.io.Serializable, Yue.InterfaceC3459 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C5680.C5681 f20878 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C5680 f20879 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C3880<E, ?> f20880;

    /* JADX INFO: renamed from: Yue.ۥۣۡۨۦ$ۥ, reason: contains not printable characters */
    public static final class C5681 {
        public C5681() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C5681(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            Yue.ۥۣۡۨۦ$ۥ r0 = new Yue.ۥۣۡۨۦ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C5680.f20878 = r0
            Yue.ۥۣۡۨۦ r0 = new Yue.ۥۣۡۨۦ
            Yue.ۥ۠ۨۦۨ$ۥ r1 = Yue.C3880.f12400
            Yue.ۥ۠ۨۦۨ r1 = r1.m15684()
            r0.<init>(r1)
            Yue.C5680.f20879 = r0
            return
    }

    public C5680() {
            r1 = this;
            Yue.ۥ۠ۨۦۨ r0 = new Yue.ۥ۠ۨۦۨ
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public C5680(int r2) {
            r1 = this;
            Yue.ۥ۠ۨۦۨ r0 = new Yue.ۥ۠ۨۦۨ
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public C5680(@Yue.InterfaceC4418 Yue.C3880<E, ?> r2) {
            r1 = this;
            java.lang.String r0 = "backing"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f20880 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    private final java.lang.Object m21242() {
            r2 = this;
            Yue.ۥ۠ۨۦۨ<E, ?> r0 = r2.f20880
            boolean r0 = r0.m15667()
            if (r0 == 0) goto Lf
            Yue.ۥۣۡۨ r0 = new Yue.ۥۣۡۨ
            r1 = 1
            r0.<init>(r2, r1)
            return r0
        Lf:
            java.io.NotSerializableException r0 = new java.io.NotSerializableException
            java.lang.String r1 = "The set cannot be serialized while it is being built."
            r0.<init>(r1)
            throw r0
    }

    @Override // Yue.AbstractC0071, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E r2) {
            r1 = this;
            Yue.ۥ۠ۨۦۨ<E, ?> r0 = r1.f20880
            int r2 = r0.m15649(r2)
            if (r2 < 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@Yue.InterfaceC4418 java.util.Collection<? extends E> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۠ۨۦۨ<E, ?> r0 = r1.f20880
            r0.m15652()
            boolean r2 = super.addAll(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
            r1 = this;
            Yue.ۥ۠ۨۦۨ<E, ?> r0 = r1.f20880
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            Yue.ۥ۠ۨۦۨ<E, ?> r0 = r1.f20880
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
            r1 = this;
            Yue.ۥ۠ۨۦۨ<E, ?> r0 = r1.f20880
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @Yue.InterfaceC4418
    public java.util.Iterator<E> iterator() {
            r1 = this;
            Yue.ۥ۠ۨۦۨ<E, ?> r0 = r1.f20880
            Yue.ۥ۠ۨۦۨ$ۥ۟۟۟۟ r0 = r0.m15668()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            Yue.ۥ۠ۨۦۨ<E, ?> r0 = r1.f20880
            int r2 = r0.m15675(r2)
            if (r2 < 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@Yue.InterfaceC4418 java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۠ۨۦۨ<E, ?> r0 = r1.f20880
            r0.m15652()
            boolean r2 = super.removeAll(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@Yue.InterfaceC4418 java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۠ۨۦۨ<E, ?> r0 = r1.f20880
            r0.m15652()
            boolean r2 = super.retainAll(r2)
            return r2
    }

    @Override // Yue.AbstractC0071
    /* JADX INFO: renamed from: ۥ */
    public int mo434() {
            r1 = this;
            Yue.ۥ۠ۨۦۨ<E, ?> r0 = r1.f20880
            int r0 = r0.size()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.Set<E> m21243() {
            r1 = this;
            Yue.ۥ۠ۨۦۨ<E, ?> r0 = r1.f20880
            r0.m15651()
            int r0 = r1.size()
            if (r0 <= 0) goto Ld
            r0 = r1
            goto Lf
        Ld:
            Yue.ۥۣۡۨۦ r0 = Yue.C5680.f20879
        Lf:
            return r0
    }
}

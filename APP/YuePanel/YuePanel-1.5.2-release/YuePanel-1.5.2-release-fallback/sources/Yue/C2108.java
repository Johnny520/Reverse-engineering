package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C2108 extends java.util.ArrayList<Yue.C2104> {
    public C2108() {
            r0 = this;
            r0.<init>()
            return
    }

    public C2108(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public C2108(java.util.Collection<Yue.C2104> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public C2108(java.util.List<Yue.C2104> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public C2108(Yue.C2104... r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            return
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r0 = this;
            r0.m9973()
            super.clear()
            return
    }

    @Override // java.util.ArrayList
    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            Yue.ۥ۠۠ۥۧ r0 = r1.m9943()
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object remove(int r1) {
            r0 = this;
            Yue.ۥ۠۠ۥۥ r1 = r0.m9972(r1)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            int r2 = super.indexOf(r2)
            r0 = -1
            if (r2 != r0) goto L9
            r2 = 0
            return r2
        L9:
            r1.m9972(r2)
            r2 = 1
            return r2
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(java.util.Collection<?> r3) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L5:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L15
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.remove(r1)
            r0 = r0 | r1
            goto L5
        L15:
            return r0
    }

    @Override // java.util.ArrayList, java.util.Collection
    public boolean removeIf(java.util.function.Predicate<? super Yue.C2104> r4) {
            r3 = this;
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1c
            java.lang.Object r2 = r0.next()
            Yue.ۥ۠۠ۥۥ r2 = (Yue.C2104) r2
            boolean r2 = r4.test(r2)
            if (r2 == 0) goto L5
            r0.remove()
            r1 = 1
            goto L5
        L1c:
            return r1
    }

    @Override // java.util.ArrayList, java.util.List
    public void replaceAll(java.util.function.UnaryOperator<Yue.C2104> r3) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.size()
            if (r0 >= r1) goto L19
            java.lang.Object r1 = r2.get(r0)
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            java.lang.Object r1 = r3.apply(r1)
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            r2.m9977(r0, r1)
            int r0 = r0 + 1
            goto L1
        L19:
            return
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(java.util.Collection<?> r4) {
            r3 = this;
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1c
            java.lang.Object r2 = r0.next()
            Yue.ۥ۠۠ۥۥ r2 = (Yue.C2104) r2
            boolean r2 = r4.contains(r2)
            if (r2 != 0) goto L5
            r0.remove()
            r1 = 1
            goto L5
        L1c:
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            Yue.ۥ۠۠ۥۥ r2 = (Yue.C2104) r2
            Yue.ۥ۠۠ۥۥ r1 = r0.m9977(r1, r2)
            return r1
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.m9965()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.C2108 m9936(java.lang.String r3) {
            r2 = this;
            java.util.Iterator r0 = r2.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r1 = r0.next()
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            r1.m9814(r3)
            goto L4
        L14:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Yue.C2108 m9937(java.lang.String r3) {
            r2 = this;
            java.util.Iterator r0 = r2.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r1 = r0.next()
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            r1.m9816(r3)
            goto L4
        L14:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Yue.C2108 m9938(java.lang.String r3) {
            r2 = this;
            java.util.Iterator r0 = r2.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r1 = r0.next()
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            r1.m9817(r3)
            goto L4
        L14:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Yue.C2108 m9939(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.util.Iterator r0 = r2.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r1 = r0.next()
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            r1.m9824(r3, r4)
            goto L4
        L14:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public java.lang.String m9940(java.lang.String r4) {
            r3 = this;
            java.util.Iterator r0 = r3.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            boolean r2 = r1.mo14514(r4)
            if (r2 == 0) goto L4
            java.lang.String r4 = r1.mo14513(r4)
            return r4
        L1b:
            java.lang.String r4 = ""
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Yue.C2108 m9941(java.lang.String r3) {
            r2 = this;
            java.util.Iterator r0 = r2.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r1 = r0.next()
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            r1.m9828(r3)
            goto L4
        L14:
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final <T extends Yue.AbstractC4398> java.util.List<T> m9942(java.lang.Class<T> r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r6.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()
            Yue.ۥ۠۠ۥۥ r2 = (Yue.C2104) r2
            r3 = 0
        L16:
            int r4 = r2.mo9797()
            if (r3 >= r4) goto L9
            Yue.ۥۣۡۢۤ r4 = r2.m17271(r3)
            boolean r5 = r7.isInstance(r4)
            if (r5 == 0) goto L2f
            java.lang.Object r4 = r7.cast(r4)
            Yue.ۥۣۡۢۤ r4 = (Yue.AbstractC4398) r4
            r0.add(r4)
        L2f:
            int r3 = r3 + 1
            goto L16
        L32:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public Yue.C2108 m9943() {
            r3 = this;
            Yue.ۥ۠۠ۥۧ r0 = new Yue.ۥ۠۠ۥۧ
            int r1 = r3.size()
            r0.<init>(r1)
            java.util.Iterator r1 = r3.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            Yue.ۥ۠۠ۥۥ r2 = (Yue.C2104) r2
            Yue.ۥ۠۠ۥۥ r2 = r2.mo8938()
            r0.add(r2)
            goto Ld
        L21:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public java.util.List<Yue.C1274> m9944() {
            r1 = this;
            java.lang.Class<Yue.ۥ۟ۥۤۤ> r0 = Yue.C1274.class
            java.util.List r0 = r1.m9942(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public java.util.List<Yue.C1725> m9945() {
            r1 = this;
            java.lang.Class<Yue.ۥ۟ۨۢۥ> r0 = Yue.C1725.class
            java.util.List r0 = r1.m9942(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public java.util.List<java.lang.String> m9946(java.lang.String r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r1 = r4.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            Yue.ۥ۠۠ۥۥ r2 = (Yue.C2104) r2
            boolean r3 = r2.mo14514(r5)
            if (r3 == 0) goto Ld
            java.lang.String r2 = r2.mo14513(r5)
            r0.add(r2)
            goto Ld
        L27:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public java.util.List<java.lang.String> m9947() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r1 = r4.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            Yue.ۥ۠۠ۥۥ r2 = (Yue.C2104) r2
            boolean r3 = r2.m9880()
            if (r3 == 0) goto Ld
            java.lang.String r2 = r2.m9925()
            r0.add(r2)
            goto Ld
        L27:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public Yue.C2108 m9948() {
            r2 = this;
            java.util.Iterator r0 = r2.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r1 = r0.next()
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            r1.m9847()
            goto L4
        L14:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public Yue.C2108 m9949(int r2) {
            r1 = this;
            int r0 = r1.size()
            if (r0 <= r2) goto L16
            Yue.ۥ۠۠ۥۧ r0 = new Yue.ۥ۠۠ۥۧ
            java.lang.Object r2 = r1.get(r2)
            Yue.ۥ۠۠ۥۥ r2 = (Yue.C2104) r2
            Yue.ۥ۠۠ۥۥ[] r2 = new Yue.C2104[]{r2}
            r0.<init>(r2)
            goto L1b
        L16:
            Yue.ۥ۠۠ۥۧ r0 = new Yue.ۥ۠۠ۥۧ
            r0.<init>()
        L1b:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public Yue.C2108 m9950(Yue.InterfaceC4400 r1) {
            r0 = this;
            Yue.C4404.m17313(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Yue.C2104 m9951() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            goto Lf
        L8:
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            Yue.ۥ۠۠ۥۥ r0 = (Yue.C2104) r0
        Lf:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public java.util.List<Yue.C2746> m9952() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r4.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()
            Yue.ۥ۠۠ۥۥ r2 = (Yue.C2104) r2
            boolean r3 = r2 instanceof Yue.C2746
            if (r3 == 0) goto L9
            Yue.ۥ۠ۢۦۥ r2 = (Yue.C2746) r2
            r0.add(r2)
            goto L9
        L1f:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean m9953(java.lang.String r3) {
            r2 = this;
            java.util.Iterator r0 = r2.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            boolean r1 = r1.mo14514(r3)
            if (r1 == 0) goto L4
            r3 = 1
            return r3
        L18:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean m9954(java.lang.String r3) {
            r2 = this;
            java.util.Iterator r0 = r2.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            boolean r1 = r1.m9879(r3)
            if (r1 == 0) goto L4
            r3 = 1
            return r3
        L18:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean m9955() {
            r2 = this;
            java.util.Iterator r0 = r2.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            boolean r1 = r1.m9880()
            if (r1 == 0) goto L4
            r0 = 1
            return r0
        L18:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public Yue.C2108 m9956(java.lang.String r3) {
            r2 = this;
            java.util.Iterator r0 = r2.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r1 = r0.next()
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            r1.m9881(r3)
            goto L4
        L14:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public java.lang.String m9957() {
            r4 = this;
            java.lang.StringBuilder r0 = Yue.C5973.m22113()
            java.util.Iterator r1 = r4.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            Yue.ۥ۠۠ۥۥ r2 = (Yue.C2104) r2
            int r3 = r0.length()
            if (r3 == 0) goto L1f
            java.lang.String r3 = "\n"
            r0.append(r3)
        L1f:
            java.lang.String r2 = r2.m9882()
            r0.append(r2)
            goto L8
        L27:
            java.lang.String r0 = Yue.C5973.m22128(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public boolean m9958(java.lang.String r3) {
            r2 = this;
            Yue.ۥ۠ۡ۠ۤ r3 = Yue.C5000.m19434(r3)
            java.util.Iterator r0 = r2.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            boolean r1 = r1.m9887(r3)
            if (r1 == 0) goto L8
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public Yue.C2104 m9959() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            goto L14
        L8:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r0 = r1.get(r0)
            Yue.ۥ۠۠ۥۥ r0 = (Yue.C2104) r0
        L14:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public Yue.C2108 m9960() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            Yue.ۥ۠۠ۥۧ r0 = r3.m9978(r2, r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public Yue.C2108 m9961(java.lang.String r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            Yue.ۥ۠۠ۥۧ r3 = r2.m9978(r3, r0, r1)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public Yue.C2108 m9962() {
            r2 = this;
            r0 = 0
            r1 = 1
            Yue.ۥ۠۠ۥۧ r0 = r2.m9978(r0, r1, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public Yue.C2108 m9963(java.lang.String r2) {
            r1 = this;
            r0 = 1
            Yue.ۥ۠۠ۥۧ r2 = r1.m9978(r2, r0, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public Yue.C2108 m9964(java.lang.String r1) {
            r0 = this;
            Yue.ۥ۠۠ۥۧ r1 = Yue.C5568.m20876(r1, r0)
            Yue.ۥ۠۠ۥۧ r1 = Yue.C5568.m20873(r0, r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public java.lang.String m9965() {
            r4 = this;
            java.lang.StringBuilder r0 = Yue.C5973.m22113()
            java.util.Iterator r1 = r4.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            Yue.ۥ۠۠ۥۥ r2 = (Yue.C2104) r2
            int r3 = r0.length()
            if (r3 == 0) goto L1f
            java.lang.String r3 = "\n"
            r0.append(r3)
        L1f:
            java.lang.String r2 = r2.mo8936()
            r0.append(r2)
            goto L8
        L27:
            java.lang.String r0 = Yue.C5973.m22128(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public Yue.C2108 m9966() {
            r3 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r1 = r3.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r1.next()
            Yue.ۥ۠۠ۥۥ r2 = (Yue.C2104) r2
            Yue.ۥ۠۠ۥۧ r2 = r2.m9900()
            r0.addAll(r2)
            goto L9
        L1d:
            Yue.ۥ۠۠ۥۧ r1 = new Yue.ۥ۠۠ۥۧ
            r1.<init>(r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public Yue.C2108 m9967(java.lang.String r3) {
            r2 = this;
            java.util.Iterator r0 = r2.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r1 = r0.next()
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            r1.m9901(r3)
            goto L4
        L14:
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public Yue.C2108 m9968() {
            r2 = this;
            r0 = 0
            r1 = 0
            Yue.ۥ۠۠ۥۧ r0 = r2.m9978(r0, r1, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public Yue.C2108 m9969(java.lang.String r2) {
            r1 = this;
            r0 = 0
            Yue.ۥ۠۠ۥۧ r2 = r1.m9978(r2, r0, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public Yue.C2108 m9970() {
            r3 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            Yue.ۥ۠۠ۥۧ r0 = r3.m9978(r2, r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public Yue.C2108 m9971(java.lang.String r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            Yue.ۥ۠۠ۥۧ r3 = r2.m9978(r3, r0, r1)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public Yue.C2104 m9972(int r1) {
            r0 = this;
            java.lang.Object r1 = super.remove(r1)
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            r1.m17293()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public Yue.C2108 m9973() {
            r2 = this;
            java.util.Iterator r0 = r2.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r1 = r0.next()
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            r1.m17293()
            goto L4
        L14:
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Yue.C2108 m9974(java.lang.String r3) {
            r2 = this;
            java.util.Iterator r0 = r2.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r1 = r0.next()
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            r1.m9909(r3)
            goto L4
        L14:
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Yue.C2108 m9975(java.lang.String r3) {
            r2 = this;
            java.util.Iterator r0 = r2.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r1 = r0.next()
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            r1.m9910(r3)
            goto L4
        L14:
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public Yue.C2108 m9976(java.lang.String r1) {
            r0 = this;
            Yue.ۥ۠۠ۥۧ r1 = Yue.C5568.m20876(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public Yue.C2104 m9977(int r1, Yue.C2104 r2) {
            r0 = this;
            Yue.C6657.m25635(r2)
            java.lang.Object r1 = super.set(r1, r2)
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            r1.m17296(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public final Yue.C2108 m9978(java.lang.String r5, boolean r6, boolean r7) {
            r4 = this;
            Yue.ۥ۠۠ۥۧ r0 = new Yue.ۥ۠۠ۥۧ
            r0.<init>()
            if (r5 == 0) goto Lc
            Yue.ۥ۠ۡ۠ۤ r5 = Yue.C5000.m19434(r5)
            goto Ld
        Lc:
            r5 = 0
        Ld:
            java.util.Iterator r1 = r4.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r1.next()
            Yue.ۥ۠۠ۥۥ r2 = (Yue.C2104) r2
        L1d:
            if (r6 == 0) goto L24
            Yue.ۥ۠۠ۥۥ r2 = r2.m9894()
            goto L28
        L24:
            Yue.ۥ۠۠ۥۥ r2 = r2.m9907()
        L28:
            if (r2 != 0) goto L2b
            goto L11
        L2b:
            if (r5 != 0) goto L31
            r0.add(r2)
            goto L3a
        L31:
            boolean r3 = r2.m9887(r5)
            if (r3 == 0) goto L3a
            r0.add(r2)
        L3a:
            if (r7 != 0) goto L1d
            goto L11
        L3d:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public Yue.C2108 m9979(java.lang.String r3) {
            r2 = this;
            java.util.Iterator r0 = r2.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r1 = r0.next()
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            r1.m9922(r3)
            goto L4
        L14:
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public java.lang.String m9980() {
            r4 = this;
            java.lang.StringBuilder r0 = Yue.C5973.m22113()
            java.util.Iterator r1 = r4.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            Yue.ۥ۠۠ۥۥ r2 = (Yue.C2104) r2
            int r3 = r0.length()
            if (r3 == 0) goto L1f
            java.lang.String r3 = " "
            r0.append(r3)
        L1f:
            java.lang.String r2 = r2.m9925()
            r0.append(r2)
            goto L8
        L27:
            java.lang.String r0 = Yue.C5973.m22128(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public java.util.List<Yue.C6151> m9981() {
            r1 = this;
            java.lang.Class<Yue.ۥۢۡ۠ۦ> r0 = Yue.C6151.class
            java.util.List r0 = r1.m9942(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public Yue.C2108 m9982(java.lang.String r3) {
            r2 = this;
            java.util.Iterator r0 = r2.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r1 = r0.next()
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            r1.m9927(r3)
            goto L4
        L14:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public Yue.C2108 m9983(Yue.InterfaceC4406 r1) {
            r0 = this;
            Yue.C4404.m17314(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public Yue.C2108 m9984() {
            r2 = this;
            java.util.Iterator r0 = r2.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r1 = r0.next()
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            r1.m17303()
            goto L4
        L14:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public Yue.C2108 m9985(java.lang.String r3) {
            r2 = this;
            java.util.Iterator r0 = r2.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r1 = r0.next()
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            r1.m9929(r3)
            goto L4
        L14:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public java.lang.String m9986() {
            r1 = this;
            int r0 = r1.size()
            if (r0 <= 0) goto Lf
            Yue.ۥ۠۠ۥۥ r0 = r1.m9951()
            java.lang.String r0 = r0.m9930()
            return r0
        Lf:
            java.lang.String r0 = ""
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public Yue.C2108 m9987(java.lang.String r3) {
            r2 = this;
            Yue.C6657.m25632(r3)
            java.util.Iterator r0 = r2.iterator()
        L7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r0.next()
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            r1.m9933(r3)
            goto L7
        L17:
            return r2
    }
}

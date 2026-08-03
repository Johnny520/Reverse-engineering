package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۨۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5601<E> extends Yue.AbstractC5593 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final E f20654;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public final Yue.InterfaceC0932<Yue.C6593> f20655;

    public C5601(E r1, @Yue.InterfaceC4418 Yue.InterfaceC0932<? super Yue.C6593> r2) {
            r0 = this;
            r0.<init>()
            r0.f20654 = r1
            r0.f20655 = r2
            return
    }

    @Override // Yue.C3783
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = Yue.C1758.m8350(r2)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = Yue.C1758.m8351(r2)
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            java.lang.Object r1 = r2.mo507()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.AbstractC5593
    /* JADX INFO: renamed from: ۥ۟۟ۦۤ */
    public void mo506() {
            r2 = this;
            Yue.ۥۣ۟ۨ۟<Yue.ۥۣۢ۠ۤ> r0 = r2.f20655
            Yue.ۥۢ۠ۦۢ r1 = Yue.C0935.f2703
            r0.mo5309(r1)
            return
    }

    @Override // Yue.AbstractC5593
    /* JADX INFO: renamed from: ۥ۟۟ۦۥ */
    public E mo507() {
            r1 = this;
            E r0 = r1.f20654
            return r0
    }

    @Override // Yue.AbstractC5593
    /* JADX INFO: renamed from: ۥ۟۟ۦۦ */
    public void mo508(@Yue.InterfaceC4418 Yue.C1174<?> r3) {
            r2 = this;
            Yue.ۥۣ۟ۨ۟<Yue.ۥۣۢ۠ۤ> r0 = r2.f20655
            Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029
            java.lang.Throwable r3 = r3.m6120()
            java.lang.Object r3 = Yue.C5391.m20390(r3)
            java.lang.Object r3 = Yue.C5388.m20377(r3)
            r0.resumeWith(r3)
            return
    }

    @Override // Yue.AbstractC5593
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۦۧ */
    public Yue.C6075 mo509(@Yue.InterfaceC4543 Yue.C3783.C3787 r5) {
            r4 = this;
            Yue.ۥۣ۟ۨ۟<Yue.ۥۣۢ۠ۤ> r0 = r4.f20655
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
            r2 = 0
            if (r5 == 0) goto La
            Yue.ۥ۠ۨ۠ۥ$ۥ r3 = r5.f12003
            goto Lb
        La:
            r3 = r2
        Lb:
            java.lang.Object r0 = r0.mo5302(r1, r3)
            if (r0 != 0) goto L12
            return r2
        L12:
            if (r5 == 0) goto L17
            r5.m15190()
        L17:
            Yue.ۥۢ۠ۦۢ r5 = Yue.C0935.f2703
            return r5
    }
}

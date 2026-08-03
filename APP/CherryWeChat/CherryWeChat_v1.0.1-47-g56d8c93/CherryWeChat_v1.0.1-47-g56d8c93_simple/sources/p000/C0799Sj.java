package p000;

/* JADX INFO: renamed from: Sj */
/* JADX INFO: loaded from: classes.dex */
public final class C0799Sj implements Appendable {

    /* JADX INFO: renamed from: a */
    public final Appendable f2503a;

    /* JADX INFO: renamed from: b */
    public boolean f2504b;

    public C0799Sj(Appendable r2) {
        this.f2504b = true;
        this.f2503a = r2;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char r4) {
        boolean r0 = this.f2504b;
        Appendable r1 = this.f2503a;
        boolean r2 = false;
        if (r0 == false) goto L6;
        this.f2504b = false;
        r1.append("  ");
    L6:
        if (r4 != '\n') goto L8;
        r2 = true;
    L8:
        this.f2504b = r2;
        r1.append(r4);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence r3) {
        if (r3 != null) goto L4;
        r3 = "";
    L4:
        append(r3, 0, r3.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence r5, int r6, int r7) {
        if (r5 != null) goto L4;
        r5 = "";
    L4:
        boolean r0 = this.f2504b;
        Appendable r1 = this.f2503a;
        boolean r2 = false;
        if (r0 == false) goto L8;
        this.f2504b = false;
        r1.append("  ");
    L8:
        if (r5.length() > 0) goto L10;
    L12:
        this.f2504b = r2;
        r1.append(r5, r6, r7);
        return this;
    L10:
        if (r5.charAt(r7 - 1) != '\n') goto L12;
        r2 = true;
        goto L12
    }
}

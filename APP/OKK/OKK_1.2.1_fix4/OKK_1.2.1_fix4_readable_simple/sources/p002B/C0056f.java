package p002B;

/* JADX INFO: renamed from: B.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0056f {

    /* JADX INFO: renamed from: a */
    public static final C0056f f196a = null;

    static {
        f196a = new C0056f();
    }

    /* JADX INFO: renamed from: a */
    public final int m194a(int r7, CharSequence r8) {
        int r3 = 0;
        int r4 = 2;
    L3:
        if (r3 >= r7) goto L14;
        if (r4 != 2) goto L14;
        byte r42 = Character.getDirectionality(r8.charAt(r3));
        C0057g r5 = AbstractC0058h.f199a;
        if (r42 == 0) goto L12;
        if (r42 == 1) goto L11;
        if (r42 == 2) goto L20;
        switch(r42) {
            case 14: goto L12;
            case 15: goto L12;
            case 16: goto L21;
            case 17: goto L21;
            default: goto L10;
        };
    L10:
        r4 = 2;
    L13:
        r3 = r3 + 1;
        goto L3
    L21:
        r4 = 0;
        goto L13
    L20:
        r4 = 0;
        goto L13
    L11:
        r4 = 0;
    L12:
        r4 = 1;
    L14:
        return r4;
    }
}

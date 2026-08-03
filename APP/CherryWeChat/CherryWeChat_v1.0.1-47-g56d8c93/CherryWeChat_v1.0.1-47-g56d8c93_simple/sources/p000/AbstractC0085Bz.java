package p000;

/* JADX INFO: renamed from: Bz */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0085Bz extends AbstractC0042Az {
    /* JADX INFO: renamed from: J */
    public static boolean m132J(String r7, boolean r8, String r9) {
        if (r8 == true) goto L6;
        return r7.endsWith(r9);
    L6:
        return r7.regionMatches(true, r7.length() - r9.length(), r9, 0, r9.length());
    }

    /* JADX INFO: renamed from: K */
    public static String m133K(String r7, String r8, String r9) {
        int r1 = AbstractC2564tz.m5054O(r7, r8, 0, false);
        if (r1 >= 0) goto L5;
        return r7;
    L5:
        int r2 = r8.length();
        int r3 = 1;
        if (r2 < 1) goto L9;
        r3 = r2;
    L9:
        int r5 = r9.length() + (r7.length() - r2);
        if (r5 < 0) goto L19;
        StringBuilder r4 = new StringBuilder(r5);
        int r52 = 0;
    L12:
        r4.append(r7, r52, r1);
        r4.append(r9);
        r52 = r1 + r2;
        if (r1 >= r7.length()) goto L16;
        r1 = AbstractC2564tz.m5054O(r7, r8, r1 + r3, false);
        if (r1 > 0) goto L12;
    L16:
        r4.append(r7, r52, r7.length());
        return r4.toString();
    L19:
        throw new OutOfMemoryError();
    }
}

package p034S;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: S.d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0324d {
    /* JADX INFO: renamed from: a */
    public static int m718a(int r02, int r1, int r2) {
        return (Integer.hashCode(r02) + r1) * r2;
    }

    /* JADX INFO: renamed from: b */
    public static int m719b(ByteBuffer r02, ByteOrder r1) {
        r02.order(r1);
        return r02.getInt(r02.position());
    }

    /* JADX INFO: renamed from: c */
    public static String m720c(String r1, int r2) {
        return r1 + r2;
    }

    /* JADX INFO: renamed from: d */
    public static String m721d(String r1, int r2, String r3, int r4) {
        return r1 + r2 + r3 + r4;
    }

    /* JADX INFO: renamed from: e */
    public static String m722e(String r1, String r2) {
        return r1 + r2;
    }

    /* JADX INFO: renamed from: f */
    public static String m723f(String r1, String r2, String r3) {
        return r1 + r2 + r3;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m724g(Object r02) {
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: h */
    public static String m725h(String r1, String r2) {
        return r1 + r2;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m726i(Object r02) {
        if (r02 != null) goto L5;
        return;
    L5:
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ String m727j(int r02) {
        switch(r02) {
            case 1: goto L21;
            case 2: goto L19;
            case 3: goto L17;
            case 4: goto L15;
            case 5: goto L13;
            case 6: goto L11;
            case 7: goto L9;
            case 8: goto L7;
            case 9: goto L5;
            default: goto L4;
        };
    L5:
        return "CENTER_Y";
    L7:
        return "CENTER_X";
    L9:
        return "CENTER";
    L11:
        return "BASELINE";
    L13:
        return "BOTTOM";
    L15:
        return "RIGHT";
    L17:
        return "TOP";
    L19:
        return "LEFT";
    L21:
        return "NONE";
    L4:
        throw null;
    }
}

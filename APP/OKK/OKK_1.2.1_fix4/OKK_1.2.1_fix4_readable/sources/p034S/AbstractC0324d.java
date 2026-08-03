package p034S;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: S.d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0324d {
    /* JADX INFO: renamed from: a */
    public static int m718a(int i2, int i3, int i4) {
        return (Integer.hashCode(i2) + i3) * i4;
    }

    /* JADX INFO: renamed from: b */
    public static int m719b(ByteBuffer byteBuffer, ByteOrder byteOrder) {
        byteBuffer.order(byteOrder);
        return byteBuffer.getInt(byteBuffer.position());
    }

    /* JADX INFO: renamed from: c */
    public static String m720c(String str, int i2) {
        return str + i2;
    }

    /* JADX INFO: renamed from: d */
    public static String m721d(String str, int i2, String str2, int i3) {
        return str + i2 + str2 + i3;
    }

    /* JADX INFO: renamed from: e */
    public static String m722e(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: f */
    public static String m723f(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m724g(Object obj) {
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: h */
    public static String m725h(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m726i(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ String m727j(int i2) {
        switch (i2) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }
}

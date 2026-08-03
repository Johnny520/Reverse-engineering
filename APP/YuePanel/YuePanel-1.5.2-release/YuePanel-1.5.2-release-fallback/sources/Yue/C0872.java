package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0872 {
    public C0872() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int m5003(java.nio.ByteBuffer r1) {
            int r0 = r1.position()
            int r1 = r1.getInt(r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.nio.ByteBuffer m5004(java.nio.ByteBuffer r1) {
            java.nio.ByteBuffer r1 = r1.duplicate()
            int r0 = r1.position()
            int r0 = r0 + 4
            r1.position(r0)
            return r1
    }
}

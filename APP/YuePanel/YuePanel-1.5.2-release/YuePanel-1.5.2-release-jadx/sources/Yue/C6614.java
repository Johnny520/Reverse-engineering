package Yue;

import java.util.ArrayList;

/* JADX INFO: renamed from: Yue.ۥۣۣۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C6614 extends ArrayList<C6613> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f16974 = 16;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int f16975;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f16976;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6614(int i, int i2) {
        super(i);
        this.f16975 = i;
        this.f16976 = i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static C6614 m20987() {
        return new C6614(0, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static C6614 m20988(int i) {
        return new C6614(16, i);
    }

    @Override // java.util.ArrayList
    public Object clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m20989() {
        return size() < this.f16976;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m20990() {
        return this.f16976;
    }

    public C6614(C6614 c6614) {
        this(c6614.f16975, c6614.f16976);
    }
}

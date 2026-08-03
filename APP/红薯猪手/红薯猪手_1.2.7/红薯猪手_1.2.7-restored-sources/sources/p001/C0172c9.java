package p001;

import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: ۟.c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0172c9 implements InterfaceC0188db, InterfaceC0174cb {

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public static final TreeMap<Integer, C0172c9> f1410 = new TreeMap<>();

    /* JADX INFO: renamed from: ۥ */
    public volatile String f741;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public int f1416;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final int f1415 = 0;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final int[] f1414 = new int[1];

    /* JADX INFO: renamed from: ۥ۟ */
    public final long[] f742 = new long[1];

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final double[] f1411 = new double[1];

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final String[] f1412 = new String[1];

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final byte[][] f1413 = new byte[1][];

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p001.InterfaceC0188db
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void mo1041(C0213f8 c0213f8) {
        for (int i = 1; i <= this.f1416; i++) {
            int i2 = this.f1414[i];
            if (i2 == 1) {
                c0213f8.mo1043(i);
            } else if (i2 == 2) {
                c0213f8.mo838(i, this.f742[i]);
            } else if (i2 == 3) {
                c0213f8.m1072(i, this.f1411[i]);
            } else if (i2 == 4) {
                c0213f8.mo1042(i, this.f1412[i]);
            } else if (i2 == 5) {
                c0213f8.m1071(i, this.f1413[i]);
            }
        }
    }

    @Override // p001.InterfaceC0174cb
    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final void mo1042(int i, String str) {
        this.f1414[i] = 4;
        this.f1412[i] = str;
    }

    @Override // p001.InterfaceC0174cb
    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final void mo1043(int i) {
        this.f1414[i] = 1;
    }

    @Override // p001.InterfaceC0188db
    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final String mo1044() {
        return this.f741;
    }

    @Override // p001.InterfaceC0174cb
    /* JADX INFO: renamed from: ۥ۠ */
    public final void mo838(int i, long j) {
        this.f1414[i] = 2;
        this.f742[i] = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public final void m1045() {
        TreeMap<Integer, C0172c9> treeMap = f1410;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f1415), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }
}

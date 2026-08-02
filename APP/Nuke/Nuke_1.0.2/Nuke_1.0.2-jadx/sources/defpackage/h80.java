package defpackage;

import java.io.Serializable;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h80 {
    public final String a;
    public final long b;
    public int c;
    public final int d;
    public final int e;
    public final String f;
    public long g;
    public Serializable h;
    public final Serializable i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: int[] */
    /* JADX WARN: Multi-variable type inference failed */
    public h80(String str, String str2, long j, int i, int i2, int i3, int[] iArr, TreeMap treeMap) {
        this.a = str;
        this.f = str2;
        this.b = j;
        this.g = 0L;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.h = iArr;
        this.i = treeMap;
    }

    public h80(String str, long j, int i, int i2, int i3, String str2, String str3, String str4, long j2) {
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str2;
        this.h = str3;
        this.i = str4;
        this.g = j2;
    }
}

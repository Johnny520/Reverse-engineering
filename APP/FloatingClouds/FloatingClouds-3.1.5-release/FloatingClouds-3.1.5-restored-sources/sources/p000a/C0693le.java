package p000a;

import java.util.Arrays;

/* JADX INFO: renamed from: a.le */
/* JADX INFO: loaded from: classes.dex */
public final class C0693le {

    /* JADX INFO: renamed from: a */
    public boolean f2580a;

    /* JADX INFO: renamed from: e */
    public float f2584e;

    /* JADX INFO: renamed from: i */
    public a f2588i;

    /* JADX INFO: renamed from: b */
    public int f2581b = -1;

    /* JADX INFO: renamed from: c */
    public int f2582c = -1;

    /* JADX INFO: renamed from: d */
    public int f2583d = 0;

    /* JADX INFO: renamed from: f */
    public boolean f2585f = false;

    /* JADX INFO: renamed from: g */
    public final float[] f2586g = new float[9];

    /* JADX INFO: renamed from: h */
    public final float[] f2587h = new float[9];

    /* JADX INFO: renamed from: j */
    public C0184K1[] f2589j = new C0184K1[16];

    /* JADX INFO: renamed from: k */
    public int f2590k = 0;

    /* JADX INFO: renamed from: l */
    public int f2591l = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: a.le$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f2592a;

        /* JADX INFO: renamed from: b */
        public static final a f2593b;

        /* JADX INFO: renamed from: c */
        public static final a f2594c;

        /* JADX INFO: renamed from: d */
        public static final a f2595d;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ a[] f2596e;

        static {
            a aVar = new a("UNRESTRICTED", 0);
            f2592a = aVar;
            a aVar2 = new a("CONSTANT", 1);
            a aVar3 = new a("SLACK", 2);
            f2593b = aVar3;
            a aVar4 = new a("ERROR", 3);
            f2594c = aVar4;
            a aVar5 = new a("UNKNOWN", 4);
            f2595d = aVar5;
            f2596e = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f2596e.clone();
        }
    }

    public C0693le(a aVar) {
        this.f2588i = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m1559a(C0184K1 c0184k1) {
        int i = 0;
        while (true) {
            int i2 = this.f2590k;
            if (i >= i2) {
                C0184K1[] c0184k1Arr = this.f2589j;
                if (i2 >= c0184k1Arr.length) {
                    this.f2589j = (C0184K1[]) Arrays.copyOf(c0184k1Arr, c0184k1Arr.length * 2);
                }
                C0184K1[] c0184k1Arr2 = this.f2589j;
                int i3 = this.f2590k;
                c0184k1Arr2[i3] = c0184k1;
                this.f2590k = i3 + 1;
                return;
            }
            if (this.f2589j[i] == c0184k1) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1560b(C0184K1 c0184k1) {
        int i = this.f2590k;
        int i2 = 0;
        while (i2 < i) {
            if (this.f2589j[i2] == c0184k1) {
                while (i2 < i - 1) {
                    C0184K1[] c0184k1Arr = this.f2589j;
                    int i3 = i2 + 1;
                    c0184k1Arr[i2] = c0184k1Arr[i3];
                    i2 = i3;
                }
                this.f2590k--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1561c() {
        this.f2588i = a.f2595d;
        this.f2583d = 0;
        this.f2581b = -1;
        this.f2582c = -1;
        this.f2584e = 0.0f;
        this.f2585f = false;
        int i = this.f2590k;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2589j[i2] = null;
        }
        this.f2590k = 0;
        this.f2591l = 0;
        this.f2580a = false;
        Arrays.fill(this.f2587h, 0.0f);
    }

    /* JADX INFO: renamed from: d */
    public final void m1562d(C0184K1 c0184k1) {
        int i = this.f2590k;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2589j[i2].mo367h(c0184k1, false);
        }
        this.f2590k = 0;
    }

    public final String toString() {
        return "" + this.f2581b;
    }
}

package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.material.carousel.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1277b {

    /* JADX INFO: renamed from: a */
    public final float f5564a;

    /* JADX INFO: renamed from: b */
    public final List<b> f5565b;

    /* JADX INFO: renamed from: c */
    public final int f5566c;

    /* JADX INFO: renamed from: d */
    public final int f5567d;

    /* JADX INFO: renamed from: com.google.android.material.carousel.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final float f5568a;

        /* JADX INFO: renamed from: b */
        public final float f5569b;

        /* JADX INFO: renamed from: d */
        public b f5571d;

        /* JADX INFO: renamed from: e */
        public b f5572e;

        /* JADX INFO: renamed from: c */
        public final ArrayList f5570c = new ArrayList();

        /* JADX INFO: renamed from: f */
        public int f5573f = -1;

        /* JADX INFO: renamed from: g */
        public int f5574g = -1;

        /* JADX INFO: renamed from: h */
        public float f5575h = 0.0f;

        /* JADX INFO: renamed from: i */
        public int f5576i = -1;

        public a(float f, float f2) {
            this.f5568a = f;
            this.f5569b = f2;
        }

        /* JADX INFO: renamed from: a */
        public final void m3160a(float f, float f2, float f3, boolean z, boolean z2) {
            float fAbs;
            float f4 = f3 / 2.0f;
            float f5 = f - f4;
            float f6 = f4 + f;
            float f7 = this.f5569b;
            if (f6 > f7) {
                fAbs = Math.abs(f6 - Math.max(f6 - f3, f7));
            } else {
                fAbs = 0.0f;
                if (f5 < 0.0f) {
                    fAbs = Math.abs(f5 - Math.min(f5 + f3, 0.0f));
                }
            }
            m3161b(f, f2, f3, z, z2, fAbs, 0.0f, 0.0f);
        }

        /* JADX INFO: renamed from: b */
        public final void m3161b(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, float f6) {
            if (f3 <= 0.0f) {
                return;
            }
            ArrayList arrayList = this.f5570c;
            if (z2) {
                if (z) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i = this.f5576i;
                if (i != -1 && i != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f5576i = arrayList.size();
            }
            b bVar = new b(Float.MIN_VALUE, f, f2, f3, z2, f4, f5, f6);
            if (z) {
                if (this.f5571d == null) {
                    this.f5571d = bVar;
                    this.f5573f = arrayList.size();
                }
                if (this.f5574g != -1 && arrayList.size() - this.f5574g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f3 != this.f5571d.f5580d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f5572e = bVar;
                this.f5574g = arrayList.size();
            } else {
                if (this.f5571d == null && f3 < this.f5575h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f5572e != null && f3 > this.f5575h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f5575h = f3;
            arrayList.add(bVar);
        }

        /* JADX INFO: renamed from: c */
        public final void m3162c(float f, float f2, float f3, int i, boolean z) {
            if (i <= 0 || f3 <= 0.0f) {
                return;
            }
            int i2 = 0;
            while (i2 < i) {
                float f4 = f2;
                float f5 = f3;
                boolean z2 = z;
                m3160a((i2 * f3) + f, f4, f5, z2, false);
                i2++;
                f2 = f4;
                f3 = f5;
                z = z2;
            }
        }

        /* JADX INFO: renamed from: d */
        public final C1277b m3163d() {
            if (this.f5571d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList2 = this.f5570c;
                int size = arrayList2.size();
                float f = this.f5568a;
                if (i >= size) {
                    return new C1277b(f, arrayList, this.f5573f, this.f5574g);
                }
                b bVar = (b) arrayList2.get(i);
                arrayList.add(new b((i * f) + (this.f5571d.f5578b - (this.f5573f * f)), bVar.f5578b, bVar.f5579c, bVar.f5580d, bVar.f5581e, bVar.f5582f, bVar.f5583g, bVar.f5584h));
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.b$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final float f5577a;

        /* JADX INFO: renamed from: b */
        public final float f5578b;

        /* JADX INFO: renamed from: c */
        public final float f5579c;

        /* JADX INFO: renamed from: d */
        public final float f5580d;

        /* JADX INFO: renamed from: e */
        public final boolean f5581e;

        /* JADX INFO: renamed from: f */
        public final float f5582f;

        /* JADX INFO: renamed from: g */
        public final float f5583g;

        /* JADX INFO: renamed from: h */
        public final float f5584h;

        public b(float f, float f2, float f3, float f4, boolean z, float f5, float f6, float f7) {
            this.f5577a = f;
            this.f5578b = f2;
            this.f5579c = f3;
            this.f5580d = f4;
            this.f5581e = z;
            this.f5582f = f5;
            this.f5583g = f6;
            this.f5584h = f7;
        }
    }

    public C1277b(float f, ArrayList arrayList, int i, int i2) {
        this.f5564a = f;
        this.f5565b = Collections.unmodifiableList(arrayList);
        this.f5566c = i;
        this.f5567d = i2;
    }

    /* JADX INFO: renamed from: a */
    public final b m3156a() {
        return this.f5565b.get(this.f5566c);
    }

    /* JADX INFO: renamed from: b */
    public final b m3157b() {
        return this.f5565b.get(0);
    }

    /* JADX INFO: renamed from: c */
    public final b m3158c() {
        return this.f5565b.get(this.f5567d);
    }

    /* JADX INFO: renamed from: d */
    public final b m3159d() {
        return this.f5565b.get(r0.size() - 1);
    }
}

package p065eb;

import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: eb.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0904y {

    /* JADX INFO: renamed from: a */
    public final boolean f2805a;

    /* JADX INFO: renamed from: b */
    public final boolean f2806b;

    /* JADX INFO: renamed from: c */
    public final boolean f2807c;

    /* JADX INFO: renamed from: d */
    public final boolean f2808d;

    /* JADX INFO: renamed from: e */
    public final boolean f2809e;

    /* JADX INFO: renamed from: f */
    public final boolean f2810f;

    /* JADX INFO: renamed from: g */
    public final boolean f2811g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0904y(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f2805a = z9;
        this.f2806b = z10;
        this.f2807c = z11;
        this.f2808d = z12;
        this.f2809e = z13;
        this.f2810f = z14;
        this.f2811g = z15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C0904y m2206a(C0904y c0904y) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        c0904y.getClass();
        boolean z14 = true;
        boolean z15 = false;
        boolean z16 = this.f2805a || c0904y.f2805a;
        if (this.f2806b || c0904y.f2806b) {
            z9 = true;
        } else {
            z9 = true;
            z14 = false;
        }
        if (this.f2807c || c0904y.f2807c) {
            z10 = false;
            z15 = z9;
        } else {
            z10 = false;
        }
        if (this.f2808d || c0904y.f2808d) {
            z11 = z9;
        } else {
            z11 = z9;
            z9 = z10;
        }
        if (this.f2809e || c0904y.f2809e) {
            z12 = z10;
            z10 = z11;
        } else {
            z12 = z10;
        }
        if (this.f2810f || c0904y.f2810f) {
            z13 = z11;
        } else {
            z13 = z11;
            z11 = z12;
        }
        if (this.f2811g || c0904y.f2811g) {
            z12 = z13;
        }
        return new C0904y(z16, z14, z15, z9, z10, z11, z12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0904y)) {
            return false;
        }
        C0904y c0904y = (C0904y) obj;
        return this.f2805a == c0904y.f2805a && this.f2806b == c0904y.f2806b && this.f2807c == c0904y.f2807c && this.f2808d == c0904y.f2808d && this.f2809e == c0904y.f2809e && this.f2810f == c0904y.f2810f && this.f2811g == c0904y.f2811g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f2811g) + AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(Boolean.hashCode(this.f2805a) * 31, 31, this.f2806b), 31, this.f2807c), 31, this.f2808d), 31, this.f2809e), 31, this.f2810f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CallbackFlags(hasSendButton=");
        sb2.append(this.f2805a);
        sb2.append(", hasHandleMsg=");
        sb2.append(this.f2806b);
        sb2.append(", hasOpenSettings=");
        AbstractC3199a.m6851x(sb2, this.f2807c, ", hasMemberChange=", this.f2808d, ", hasNewFriend=");
        AbstractC3199a.m6851x(sb2, this.f2809e, ", hasProtobufPacket=", this.f2810f, ", hasImageDownload=");
        return AbstractC3199a.m6840m(")", sb2, this.f2811g);
    }
}

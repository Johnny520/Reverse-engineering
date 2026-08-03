package Yue;

import java.io.Serializable;

/* JADX INFO: renamed from: Yue.ۥ۟۠۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.4")
public class C3143 implements InterfaceC5149, Serializable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Object f4646;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final Class f4647;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final String f4648;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final String f4649;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final boolean f4650;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final int f4651;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final int f4652;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3143(int i, Class cls, String str, String str2, int i2) {
        this(i, AbstractC3648.NO_RECEIVER, cls, str, str2, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3143)) {
            return false;
        }
        C3143 c3143 = (C3143) obj;
        return this.f4650 == c3143.f4650 && this.f4651 == c3143.f4651 && this.f4652 == c3143.f4652 && C5499.m17094(this.f4646, c3143.f4646) && C5499.m17094(this.f4647, c3143.f4647) && this.f4648.equals(c3143.f4648) && this.f4649.equals(c3143.f4649);
    }

    @Override // Yue.InterfaceC5149
    public int getArity() {
        return this.f4651;
    }

    public int hashCode() {
        Object obj = this.f4646;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f4647;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f4648.hashCode()) * 31) + this.f4649.hashCode()) * 31) + (this.f4650 ? 1231 : 1237)) * 31) + this.f4651) * 31) + this.f4652;
    }

    public String toString() {
        return C7071.m22015(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public InterfaceC5589 m6421() {
        Class cls = this.f4647;
        if (cls == null) {
            return null;
        }
        return this.f4650 ? C7071.m21999(cls) : C7071.m21996(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3143(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.f4646 = obj;
        this.f4647 = cls;
        this.f4648 = str;
        this.f4649 = str2;
        this.f4650 = (i2 & 1) == 1;
        this.f4651 = i;
        this.f4652 = i2 >> 1;
    }
}

package p265s1;

import android.graphics.Shader;
import java.util.List;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p250r1.AbstractC6462l;
import p250r1.C6455e;
import p250r1.C6461k;

/* JADX INFO: renamed from: s1.z2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7170z2 extends AbstractC7070e3 {

    /* JADX INFO: renamed from: f */
    public final List f23727f;

    /* JADX INFO: renamed from: g */
    public final List f23728g;

    /* JADX INFO: renamed from: h */
    public final long f23729h;

    /* JADX INFO: renamed from: i */
    public final float f23730i;

    /* JADX INFO: renamed from: j */
    public final int f23731j;

    public C7170z2(List list, List list2, long j10, float f10, int i10) {
        this.f23727f = list;
        this.f23728g = list2;
        this.f23729h = j10;
        this.f23730i = f10;
        this.f23731j = i10;
    }

    @Override // p265s1.AbstractC7070e3
    /* JADX INFO: renamed from: b */
    public Shader mo27856b(long j10) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j11 = this.f23729h;
        if ((9223372034707292159L & j11) == 9205357640488583168L) {
            long jM25628a = AbstractC6462l.m25628a(j10);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jM25628a >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM25628a & 4294967295L));
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j11 >> 32)) == Float.POSITIVE_INFINITY ? j10 >> 32 : this.f23729h >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.f23729h & 4294967295L)) == Float.POSITIVE_INFINITY ? j10 & 4294967295L : this.f23729h & 4294967295L));
        }
        List list = this.f23727f;
        List list2 = this.f23728g;
        long jM25551e = C6455e.m25551e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2))));
        float fM25620h = this.f23730i;
        if (fM25620h == Float.POSITIVE_INFINITY) {
            fM25620h = C6461k.m25620h(j10) / 2;
        }
        return AbstractC7075f3.m27876b(jM25551e, fM25620h, list, list2, this.f23731j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7170z2)) {
            return false;
        }
        C7170z2 c7170z2 = (C7170z2) obj;
        return AbstractC1061t.m3842c(this.f23727f, c7170z2.f23727f) && AbstractC1061t.m3842c(this.f23728g, c7170z2.f23728g) && C6455e.m25556j(this.f23729h, c7170z2.f23729h) && this.f23730i == c7170z2.f23730i && AbstractC7115n3.m28042f(this.f23731j, c7170z2.f23731j);
    }

    public int hashCode() {
        int iHashCode = this.f23727f.hashCode() * 31;
        List list = this.f23728g;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + C6455e.m25561o(this.f23729h)) * 31) + Float.hashCode(this.f23730i)) * 31) + AbstractC7115n3.m28043g(this.f23731j);
    }

    public String toString() {
        String str;
        long j10 = this.f23729h & 9223372034707292159L;
        String str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        if (j10 != 9205357640488583168L) {
            str = "center=" + ((Object) C6455e.m25565s(this.f23729h)) + ", ";
        } else {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if ((Float.floatToRawIntBits(this.f23730i) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + this.f23730i + ", ";
        }
        return "RadialGradient(colors=" + this.f23727f + ", stops=" + this.f23728g + ", " + str + str2 + "tileMode=" + ((Object) AbstractC7115n3.m28044h(this.f23731j)) + ')';
    }

    public /* synthetic */ C7170z2(List list, List list2, long j10, float f10, int i10, AbstractC1043k abstractC1043k) {
        this(list, list2, j10, f10, i10);
    }
}

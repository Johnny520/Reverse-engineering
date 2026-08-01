package p265s1;

import android.graphics.Shader;
import java.util.List;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p250r1.C6455e;

/* JADX INFO: renamed from: s1.m2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7109m2 extends AbstractC7070e3 {

    /* JADX INFO: renamed from: f */
    public final List f23612f;

    /* JADX INFO: renamed from: g */
    public final List f23613g;

    /* JADX INFO: renamed from: h */
    public final long f23614h;

    /* JADX INFO: renamed from: i */
    public final long f23615i;

    /* JADX INFO: renamed from: j */
    public final int f23616j;

    public C7109m2(List list, List list2, long j10, long j11, int i10) {
        this.f23612f = list;
        this.f23613g = list2;
        this.f23614h = j10;
        this.f23615i = j11;
        this.f23616j = i10;
    }

    @Override // p265s1.AbstractC7070e3
    /* JADX INFO: renamed from: b */
    public Shader mo27856b(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.f23614h >> 32)) == Float.POSITIVE_INFINITY ? j10 >> 32 : this.f23614h >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.f23614h & 4294967295L)) == Float.POSITIVE_INFINITY ? j10 & 4294967295L : this.f23614h & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.f23615i >> 32)) == Float.POSITIVE_INFINITY ? j10 >> 32 : this.f23615i >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.f23615i & 4294967295L)) == Float.POSITIVE_INFINITY ? j10 & 4294967295L : this.f23615i & 4294967295L));
        List list = this.f23612f;
        List list2 = this.f23613g;
        return AbstractC7075f3.m27875a(C6455e.m25551e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L)), C6455e.m25551e((((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32)), list, list2, this.f23616j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7109m2)) {
            return false;
        }
        C7109m2 c7109m2 = (C7109m2) obj;
        return AbstractC1061t.m3842c(this.f23612f, c7109m2.f23612f) && AbstractC1061t.m3842c(this.f23613g, c7109m2.f23613g) && C6455e.m25556j(this.f23614h, c7109m2.f23614h) && C6455e.m25556j(this.f23615i, c7109m2.f23615i) && AbstractC7115n3.m28042f(this.f23616j, c7109m2.f23616j);
    }

    public int hashCode() {
        int iHashCode = this.f23612f.hashCode() * 31;
        List list = this.f23613g;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + C6455e.m25561o(this.f23614h)) * 31) + C6455e.m25561o(this.f23615i)) * 31) + AbstractC7115n3.m28043g(this.f23616j);
    }

    public String toString() {
        String str;
        long j10 = (((this.f23614h & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L);
        String str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        if (j10 == 0) {
            str = "start=" + ((Object) C6455e.m25565s(this.f23614h)) + ", ";
        } else {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if ((((9187343241974906880L ^ (this.f23615i & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) C6455e.m25565s(this.f23615i)) + ", ";
        }
        return "LinearGradient(colors=" + this.f23612f + ", stops=" + this.f23613g + ", " + str + str2 + "tileMode=" + ((Object) AbstractC7115n3.m28044h(this.f23616j)) + ')';
    }

    public /* synthetic */ C7109m2(List list, List list2, long j10, long j11, int i10, AbstractC1043k abstractC1043k) {
        this(list, list2, j10, j11, i10);
    }
}

package p157k8;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p300uc.InterfaceC8647b;
import p300uc.InterfaceC8660n;

/* JADX INFO: renamed from: k8.b4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8660n(with = C4038c4.class)
@Metadata(m16757d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m16758d2 = {"Lk8/b4;", _UrlKt.FRAGMENT_ENCODE_SET, "Companion", "c", "b", "a", "Lk8/b4$b;", "Lk8/b4$c;", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public interface InterfaceC4030b4 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f11794a;

    /* JADX INFO: renamed from: k8.b4$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f11794a = new Companion();

        public final InterfaceC8647b serializer() {
            return C4038c4.f11828c;
        }
    }

    /* JADX INFO: renamed from: k8.b4$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0002\u0011\u0004B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0016"}, m16758d2 = {"Lk8/b4$b;", "Lk8/b4;", _UrlKt.FRAGMENT_ENCODE_SET, "value", "b", "(J)J", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "a", "J", "getValue", "()J", "Companion", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    @InterfaceC8660n
    public static final class b implements InterfaceC4030b4 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final long value;

        public /* synthetic */ b(long j10) {
            this.value = j10;
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ b m15984a(long j10) {
            return new b(j10);
        }

        /* JADX INFO: renamed from: c */
        public static boolean m15986c(long j10, Object obj) {
            return (obj instanceof b) && j10 == ((b) obj).getValue();
        }

        /* JADX INFO: renamed from: d */
        public static int m15987d(long j10) {
            return Long.hashCode(j10);
        }

        /* JADX INFO: renamed from: e */
        public static String m15988e(long j10) {
            return "NumberId(value=" + j10 + ")";
        }

        public boolean equals(Object other) {
            return m15986c(this.value, other);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final /* synthetic */ long getValue() {
            return this.value;
        }

        public int hashCode() {
            return m15987d(this.value);
        }

        public String toString() {
            return m15988e(this.value);
        }

        /* JADX INFO: renamed from: k8.b4$b$b, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class Companion {
            public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
                this();
            }

            public final InterfaceC8647b serializer() {
                return a.f11796a;
            }

            public Companion() {
            }
        }

        /* JADX INFO: renamed from: b */
        public static long m15985b(long j10) {
            return j10;
        }
    }

    /* JADX INFO: renamed from: k8.b4$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0002\u0010\u0004B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0014"}, m16758d2 = {"Lk8/b4$c;", "Lk8/b4;", _UrlKt.FRAGMENT_ENCODE_SET, "value", "b", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getValue", "Companion", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    @InterfaceC8660n
    public static final class c implements InterfaceC4030b4 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final String value;

        public /* synthetic */ c(String str) {
            this.value = str;
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ c m15992a(String str) {
            return new c(str);
        }

        /* JADX INFO: renamed from: b */
        public static String m15993b(String str) {
            str.getClass();
            return str;
        }

        /* JADX INFO: renamed from: c */
        public static boolean m15994c(String str, Object obj) {
            return (obj instanceof c) && AbstractC1061t.m3842c(str, ((c) obj).getValue());
        }

        /* JADX INFO: renamed from: d */
        public static int m15995d(String str) {
            return str.hashCode();
        }

        /* JADX INFO: renamed from: e */
        public static String m15996e(String str) {
            return "StringId(value=" + str + ")";
        }

        public boolean equals(Object other) {
            return m15994c(this.value, other);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final /* synthetic */ String getValue() {
            return this.value;
        }

        public int hashCode() {
            return m15995d(this.value);
        }

        public String toString() {
            return m15996e(this.value);
        }

        /* JADX INFO: renamed from: k8.b4$c$b, reason: from kotlin metadata */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class Companion {
            public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
                this();
            }

            public final InterfaceC8647b serializer() {
                return a.f11798a;
            }

            public Companion() {
            }
        }
    }
}

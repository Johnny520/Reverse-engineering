package p314v7;

import okhttp3.internal.http2.Http2Connection;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: v7.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4486b {
    FORMATS(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE),
    /* JADX INFO: Fake field, exist only in values array */
    MIN(16777217),
    /* JADX INFO: Fake field, exist only in values array */
    MAX(16777218),
    /* JADX INFO: Fake field, exist only in values array */
    L10N(16777219),
    /* JADX INFO: Fake field, exist only in values array */
    OTHER(16777220),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO(16777221),
    /* JADX INFO: Fake field, exist only in values array */
    ONE(16777222),
    /* JADX INFO: Fake field, exist only in values array */
    TWO(16777223),
    /* JADX INFO: Fake field, exist only in values array */
    FEW(16777224),
    /* JADX INFO: Fake field, exist only in values array */
    MANY(16777225);


    /* JADX INFO: renamed from: i */
    public static final EnumC4486b[] f14842i = values();

    /* JADX INFO: renamed from: g */
    public final int f14844g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    EnumC4486b(int i9) {
        this.f14844g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Enum
    public final String toString() {
        return AbstractC5999a.m10754q(name());
    }
}

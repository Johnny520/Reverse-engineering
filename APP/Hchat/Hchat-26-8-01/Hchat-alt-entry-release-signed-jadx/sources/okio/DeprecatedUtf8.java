package okio;

import p276sf.InterfaceC3954a;

/* JADX INFO: renamed from: okio.-DeprecatedUtf8, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3954a
public final class DeprecatedUtf8 {
    public static final DeprecatedUtf8 INSTANCE = new DeprecatedUtf8();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private DeprecatedUtf8() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    public final long size(String str) {
        str.getClass();
        return Utf8.size$default(str, 0, 0, 3, null);
    }

    @InterfaceC3954a
    public final long size(String str, int i9, int i10) {
        str.getClass();
        return Utf8.size(str, i9, i10);
    }
}

package p000;

/* JADX INFO: renamed from: ue */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class C0770ue {

    /* JADX INFO: renamed from: a */
    @fp2("server_time")
    private final Long f11253a = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0770ue) && t11.m5086l(this.f11253a, ((C0770ue) obj).f11253a);
    }

    public final int hashCode() {
        Long l = this.f11253a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return "RawAppUpdateResponse(hasUpdate=null, currentVersionCode=null, latestVersionCode=null, latestVersionName=null, forceUpdate=null, downloadUrl=null, updateContent=null, serverTime=" + this.f11253a + ")";
    }
}

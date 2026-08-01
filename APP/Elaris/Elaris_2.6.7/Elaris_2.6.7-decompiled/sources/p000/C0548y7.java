package p000;

/* JADX INFO: renamed from: y7 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0548y7 {

    /* JADX INFO: renamed from: a */
    public final String f1092a;

    /* JADX INFO: renamed from: b */
    public final boolean f1093b;

    /* JADX INFO: renamed from: c */
    public final boolean f1094c;

    /* JADX INFO: renamed from: d */
    public final boolean f1095d;

    /* JADX INFO: renamed from: e */
    public final boolean f1096e;

    /* JADX INFO: renamed from: f */
    public final boolean f1097f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0548y7(String str, String str2) {
        str2 = (str2 == null || str2.length() == 0) ? str : str2;
        this.f1092a = str2;
        boolean zEquals = str.equals(str2);
        this.f1093b = zEquals;
        boolean zEquals2 = str.concat(":MSF").equals(str2);
        this.f1094c = zEquals2;
        boolean zEquals3 = str.concat(":tool").equals(str2);
        this.f1095d = zEquals3;
        boolean zEquals4 = str.concat(":openSdk").equals(str2);
        this.f1096e = zEquals4;
        this.f1097f = (zEquals || zEquals2 || zEquals3 || zEquals4) ? false : true;
    }
}

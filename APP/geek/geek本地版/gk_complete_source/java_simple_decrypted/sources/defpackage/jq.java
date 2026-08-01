package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum jq extends Enum {
    public static final jq a = null;
    public static final jq b = null;
    public static final jq c = null;
    public static final jq d = null;
    public static final jq e = null;
    public static final /* synthetic */ jq[] f = null;

    static {
        jq r0 = new jq("DESTROYED", 0);
        a = r0;
        jq r1 = new jq("INITIALIZED", 1);
        b = r1;
        jq r2 = new jq("CREATED", 2);
        c = r2;
        jq r3 = new jq("STARTED", 3);
        d = r3;
        jq r4 = new jq("RESUMED", 4);
        e = r4;
        f = new jq[]{r0, r1, r2, r3, r4};
    }

    public static jq valueOf(String r1) {
        return (jq) Enum.valueOf(jq.class, r1);
    }

    public static jq[] values() {
        return (jq[]) f.clone();
    }
}

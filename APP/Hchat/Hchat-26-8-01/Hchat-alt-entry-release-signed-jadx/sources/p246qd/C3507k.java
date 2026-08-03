package p246qd;

import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;
import p128ic.C2039d;
import p136j8.C2104o;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: qd.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3507k {

    /* JADX INFO: renamed from: a */
    public String f11411a;

    /* JADX INFO: renamed from: b */
    public AbstractC3506j f11412b;

    /* JADX INFO: renamed from: c */
    public List f11413c = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: d */
    public boolean f11414d;

    /* JADX INFO: renamed from: e */
    public boolean f11415e;

    /* JADX INFO: renamed from: f */
    public boolean f11416f;

    /* JADX INFO: renamed from: g */
    public C2039d f11417g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C3515s m7367a() {
        if (!this.f11413c.isEmpty()) {
            return (C3515s) this.f11413c.get(0);
        }
        C2104o.m5276A("CodeVar without SSA variables attached: ".concat(String.valueOf(this)));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC4855en.m9265i(this.f11414d ? "final " : HttpUrl.FRAGMENT_ENCODE_SET, String.valueOf(this.f11412b), " ", this.f11411a);
    }
}

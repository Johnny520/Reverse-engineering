package me;

import java.util.ArrayList;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p246qd.C3515s;

/* JADX INFO: renamed from: me.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2838f {

    /* JADX INFO: renamed from: a */
    public final C3515s f9230a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f9231b = new ArrayList(3);

    /* JADX INFO: renamed from: c */
    public final ArrayList f9232c = new ArrayList(3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2838f(C3515s c3515s) {
        this.f9230a = c3515s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        C3515s c3515s = this.f9230a;
        return AbstractC0921a.m2255r(AbstractC0255e.m1027p("{", c3515s == null ? "-" : c3515s.m7410o(), ", a:", String.valueOf(this.f9231b), ", u:"), String.valueOf(this.f9232c), "}");
    }
}

package p096g8;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p351xe.C5796q;

/* JADX INFO: renamed from: g8.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1367h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4530a = 1;

    /* JADX INFO: renamed from: b */
    public final String f4531b;

    /* JADX INFO: renamed from: c */
    public final String f4532c;

    /* JADX INFO: renamed from: d */
    public String f4533d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1367h(String str, String str2) {
        if (C5796q.m10501g(str2)) {
            C2104o.m5294t("Class alias can't be empty");
            throw null;
        }
        this.f4532c = str;
        this.f4531b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f4530a) {
            case 1:
                return AbstractC0921a.m2255r(AbstractC0255e.m1027p("Alias{", this.f4531b, ", pkg=", this.f4532c, ", fullName="), this.f4533d, "}");
            default:
                return super.toString();
        }
    }

    public C1367h(String str, String str2, String str3) {
        this.f4531b = str;
        this.f4532c = str2;
        this.f4533d = str3;
    }
}

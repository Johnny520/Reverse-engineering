package p099T3;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: T3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1426e {
    public static final C1425d Companion = new C1425d();

    /* JADX INFO: renamed from: a */
    public final String f5081a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1426e(String str) {
        this.f5081a = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1426e) && AbstractC1665j.m2981a(this.f5081a, ((C1426e) obj).f5081a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f5081a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0231b.m400k("ThemeConfig(accentColorHex=", this.f5081a, ")");
    }

    public /* synthetic */ C1426e(String str, int i5) {
        if ((i5 & 1) == 0) {
            this.f5081a = null;
        } else {
            this.f5081a = str;
        }
    }
}

package p019D1;

import java.util.LinkedHashMap;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: D1.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0261b {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f854a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC0261b) {
            return AbstractC1665j.m2981a(this.f854a, ((AbstractC0261b) obj).f854a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f854a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f854a + ')';
    }
}

package p000;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: el */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0176el {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f1481a = new LinkedHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC0176el) {
            return p30.m3002l(this.f1481a, ((AbstractC0176el) obj).f1481a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1481a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CreationExtras(extras=" + this.f1481a + ')';
    }
}

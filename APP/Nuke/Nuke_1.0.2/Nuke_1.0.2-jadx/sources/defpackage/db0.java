package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class db0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof db0) && za0.b(10.0f, 10.0f) && za0.b(40.0f, 40.0f) && za0.b(10.0f, 10.0f) && za0.b(40.0f, 40.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(true) + vi0.c(40.0f, vi0.c(10.0f, vi0.c(40.0f, Float.hashCode(10.0f) * 31, 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) za0.c(10.0f)) + ", top=" + ((Object) za0.c(40.0f)) + ", end=" + ((Object) za0.c(10.0f)) + ", bottom=" + ((Object) za0.c(40.0f)) + ", isLayoutDirectionAware=true)";
    }
}

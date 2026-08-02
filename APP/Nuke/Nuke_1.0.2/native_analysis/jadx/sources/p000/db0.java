package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class db0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof db0) && za0.m6404b(10.0f, 10.0f) && za0.m6404b(40.0f, 40.0f) && za0.m6404b(10.0f, 10.0f) && za0.m6404b(40.0f, 40.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + vi0.m5684c(40.0f, vi0.m5684c(10.0f, vi0.m5684c(40.0f, Float.hashCode(10.0f) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) za0.m6405c(10.0f)) + ", top=" + ((Object) za0.m6405c(40.0f)) + ", end=" + ((Object) za0.m6405c(10.0f)) + ", bottom=" + ((Object) za0.m6405c(40.0f)) + ", isLayoutDirectionAware=true)";
    }
}

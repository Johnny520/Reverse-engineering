package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class oa2 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof oa2);
    }

    public final int hashCode() {
        return Float.hashCode(0.1f) + vi0.m5684c(0.08f, vi0.m5684c(0.1f, Float.hashCode(0.16f) * 31, 31), 31);
    }

    public final String toString() {
        return "RippleAlpha(draggedAlpha=0.16, focusedAlpha=0.1, hoveredAlpha=0.08, pressedAlpha=0.1)";
    }
}

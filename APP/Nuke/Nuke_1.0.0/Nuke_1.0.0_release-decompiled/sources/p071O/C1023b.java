package p071O;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: O.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1023b {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C1023b);
    }

    public final int hashCode() {
        return Float.hashCode(0.1f) + AbstractC0231b.m390a(0.08f, AbstractC0231b.m390a(0.1f, Float.hashCode(0.16f) * 31, 31), 31);
    }

    public final String toString() {
        return "RippleAlpha(draggedAlpha=0.16, focusedAlpha=0.1, hoveredAlpha=0.08, pressedAlpha=0.1)";
    }
}

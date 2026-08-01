package p264x3;

import me.dartcv.nuke.R;
import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: x3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3452d {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C3452d);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.back) + AbstractC0231b.m391b(R.string.using_guide_text, Integer.hashCode(R.string.tutorial) * 31, 31);
    }

    public final String toString() {
        return "GuideDialogContent(titleRes=2030764212, textRes=2030764214, backTextRes=2030764039)";
    }
}

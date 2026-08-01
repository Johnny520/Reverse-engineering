package p264x3;

import java.util.List;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: x3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3449a {

    /* JADX INFO: renamed from: a */
    public final List f10764a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3449a(List list) {
        this.f10764a = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3449a) && this.f10764a.equals(((C3449a) obj).f10764a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10764a.hashCode() + (Integer.hashCode(R.string.discussion) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DiscussionDialogContent(titleRes=2030764060, items=" + this.f10764a + ")";
    }
}

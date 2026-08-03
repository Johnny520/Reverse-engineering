package p144k;

import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import p339x1.AbstractC5618k;

/* JADX INFO: renamed from: k.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2222x {

    /* JADX INFO: renamed from: a */
    public static final long f7362a = ViewConfiguration.getTapTimeout();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final boolean m5463a(AbstractC2171g abstractC2171g) {
        ViewParent parent = AbstractC5618k.m10169y(abstractC2171g).getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }
}

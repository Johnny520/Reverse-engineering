package p005a4;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: a4.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0064b {
    /* JADX INFO: renamed from: a */
    public static final ViewParent m219a(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(AbstractC0063a.f138a);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }
}

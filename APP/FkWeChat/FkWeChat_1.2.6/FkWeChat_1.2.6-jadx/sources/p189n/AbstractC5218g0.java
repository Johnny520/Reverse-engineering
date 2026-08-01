package p189n;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import p166l2.AbstractC4561l;
import p166l2.InterfaceC4553j;

/* JADX INFO: renamed from: n.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5218g0 {

    /* JADX INFO: renamed from: a */
    public static final long f16020a = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: a */
    public static final long m21396a() {
        return f16020a;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m21397b(InterfaceC4553j interfaceC4553j) {
        return m21398c(AbstractC4561l.m18025a(interfaceC4553j));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m21398c(View view) {
        ViewParent parent = view.getParent();
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

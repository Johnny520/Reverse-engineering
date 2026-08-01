package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.InterfaceC0370f;
import p349y0.C9508c;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0374g {
    /* JADX INFO: renamed from: b */
    public static final int m1202b(C9508c c9508c, int i10) {
        int iM37039l = c9508c.m37039l() - 1;
        int i11 = 0;
        while (i11 < iM37039l) {
            int i12 = ((iM37039l - i11) / 2) + i11;
            int iM1199b = ((InterfaceC0370f.a) c9508c.f32299q[i12]).m1199b();
            if (iM1199b != i10) {
                if (iM1199b < i10) {
                    i11 = i12 + 1;
                    if (i10 < ((InterfaceC0370f.a) c9508c.f32299q[i11]).m1199b()) {
                    }
                } else {
                    iM37039l = i12 - 1;
                }
            }
            return i12;
        }
        return i11;
    }
}

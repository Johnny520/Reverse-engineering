package p146jd;

import android.view.View;
import p053dd.C1951c;
import p068ed.InterfaceC2214c;

/* JADX INFO: renamed from: jd.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3844i implements InterfaceC2214c {
    @Override // p068ed.InterfaceC2214c
    /* JADX INFO: renamed from: b */
    public void mo7977b(View view, C1951c c1951c) {
        if (c1951c.talker.endsWith("@chatroom")) {
            getBoolean("show_real_name", false);
        }
    }
}

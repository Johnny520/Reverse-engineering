package org.apache.commons.io.file;

import bsh.classpath.C2602;
import java.util.stream.Stream;
import p361.InterfaceC8931;
import p377.AbstractC8985;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public enum StandardDeleteOption implements InterfaceC8931 {
    OVERRIDE_READ_ONLY;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$overrideReadOnly$0(InterfaceC8931 interfaceC8931) {
        return OVERRIDE_READ_ONLY == interfaceC8931;
    }

    public static boolean overrideReadOnly(InterfaceC8931[] interfaceC8931Arr) {
        byte[] bArr = AbstractC8985.f25236;
        if ((interfaceC8931Arr == null ? 0 : interfaceC8931Arr.length) == 0) {
            return false;
        }
        return Stream.of((Object[]) interfaceC8931Arr).anyMatch(new C2602(15));
    }
}

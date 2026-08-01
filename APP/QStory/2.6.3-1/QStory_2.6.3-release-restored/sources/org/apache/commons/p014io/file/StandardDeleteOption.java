package org.apache.commons.p014io.file;

import bsh.classpath.C3436;
import java.util.stream.Stream;
import p377.InterfaceC9750;
import p392.AbstractC9814;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public enum StandardDeleteOption implements InterfaceC9750 {
    OVERRIDE_READ_ONLY;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$overrideReadOnly$0(InterfaceC9750 interfaceC9750) {
        return OVERRIDE_READ_ONLY == interfaceC9750;
    }

    public static boolean overrideReadOnly(InterfaceC9750[] interfaceC9750Arr) {
        byte[] bArr = AbstractC9814.f25560;
        if ((interfaceC9750Arr == null ? 0 : interfaceC9750Arr.length) == 0) {
            return false;
        }
        return Stream.of((Object[]) interfaceC9750Arr).anyMatch(new C3436(15));
    }
}

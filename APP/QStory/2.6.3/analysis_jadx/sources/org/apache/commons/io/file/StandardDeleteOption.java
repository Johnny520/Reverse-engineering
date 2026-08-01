package org.apache.commons.io.file;

import bsh.classpath.C2603;
import java.util.stream.Stream;
import p361.InterfaceC8921;
import p376.AbstractC8985;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public enum StandardDeleteOption implements InterfaceC8921 {
    OVERRIDE_READ_ONLY;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$overrideReadOnly$0(InterfaceC8921 interfaceC8921) {
        return OVERRIDE_READ_ONLY == interfaceC8921;
    }

    public static boolean overrideReadOnly(InterfaceC8921[] interfaceC8921Arr) {
        byte[] bArr = AbstractC8985.f25215;
        if ((interfaceC8921Arr == null ? 0 : interfaceC8921Arr.length) == 0) {
            return false;
        }
        return Stream.of((Object[]) interfaceC8921Arr).anyMatch(new C2603(15));
    }
}

package Yue;

import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥۢ۠۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7604 extends IOException {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final EnumC4660 f23014;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7604(@InterfaceC6399 EnumC4660 enumC4660) {
        super("stream was reset: " + enumC4660);
        C5499.m17103(enumC4660, "errorCode");
        this.f23014 = enumC4660;
    }
}

package Yue;

import java.io.File;

/* JADX INFO: renamed from: Yue.ۥ۠ۢ۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4838 extends C4837 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final C4821 m14742(@InterfaceC6399 File file, @InterfaceC6399 EnumC4834 enumC4834) {
        C5499.m17103(file, "<this>");
        C5499.m17103(enumC4834, "direction");
        return new C4821(file, enumC4834);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ C4821 m14743(File file, EnumC4834 enumC4834, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC4834 = EnumC4834.f10897;
        }
        return m14742(file, enumC4834);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final C4821 m14744(@InterfaceC6399 File file) {
        C5499.m17103(file, "<this>");
        return m14742(file, EnumC4834.f10898);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final C4821 m14745(@InterfaceC6399 File file) {
        C5499.m17103(file, "<this>");
        return m14742(file, EnumC4834.f10897);
    }
}

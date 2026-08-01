package p264s0;

import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: s0.y7 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7024y7 {

    /* JADX INFO: renamed from: q */
    public static final EnumC7024y7 f23326q = new EnumC7024y7("ENDTHUMB", 0);

    /* JADX INFO: renamed from: r */
    public static final EnumC7024y7 f23327r = new EnumC7024y7("STARTTHUMB", 1);

    /* JADX INFO: renamed from: s */
    public static final EnumC7024y7 f23328s = new EnumC7024y7("TRACK", 2);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ EnumC7024y7[] f23329t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC7197a f23330u;

    static {
        EnumC7024y7[] enumC7024y7ArrM27698a = m27698a();
        f23329t = enumC7024y7ArrM27698a;
        f23330u = AbstractC7198b.m28437a(enumC7024y7ArrM27698a);
    }

    public EnumC7024y7(String str, int i10) {
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC7024y7[] m27698a() {
        return new EnumC7024y7[]{f23326q, f23327r, f23328s};
    }

    public static EnumC7024y7 valueOf(String str) {
        return (EnumC7024y7) Enum.valueOf(EnumC7024y7.class, str);
    }

    public static EnumC7024y7[] values() {
        return (EnumC7024y7[]) f23329t.clone();
    }
}

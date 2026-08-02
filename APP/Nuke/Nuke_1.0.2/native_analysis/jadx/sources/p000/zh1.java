package p000;

import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zh1 {

    /* JADX INFO: renamed from: i */
    public static final j51 f13907i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ zh1[] f13908j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ yf0 f13909k;

    /* JADX INFO: renamed from: h */
    public final int f13910h;

    static {
        zh1[] zh1VarArr = {new zh1("PUBLIC", 0, 1), new zh1("PRIVATE", 1, 2), new zh1("PROTECTED", 2, 4), new zh1("STATIC", 3, 8), new zh1("FINAL", 4, 16), new zh1("SYNCHRONIZED", 5, 32), new zh1("VOLATILE", 6, 64), new zh1("TRANSIENT", 7, 128), new zh1("NATIVE", 8, 256), new zh1("INTERFACE", 9, AIChatConfig.DefaultMaxTokens), new zh1("ABSTRACT", 10, 1024), new zh1("STRICT", 11, 2048)};
        f13908j = zh1VarArr;
        f13909k = new yf0(zh1VarArr);
        f13907i = new j51(4);
    }

    public zh1(String str, int i, int i2) {
        this.f13910h = i2;
    }

    public static zh1 valueOf(String str) {
        return (zh1) Enum.valueOf(zh1.class, str);
    }

    public static zh1[] values() {
        return (zh1[]) f13908j.clone();
    }
}

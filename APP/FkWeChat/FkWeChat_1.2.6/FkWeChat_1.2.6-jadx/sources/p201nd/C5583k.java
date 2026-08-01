package p201nd;

import me.yun.fkwechat.core.config.ConfigRepo;

/* JADX INFO: renamed from: nd.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5583k {
    public static final int $stable = 0;
    public static final C5583k INSTANCE = new C5583k();

    private C5583k() {
    }

    public static final void configClear() {
        ConfigRepo.clear();
    }

    public static final boolean configContains(String str) {
        return ConfigRepo.contains(str);
    }

    public static final void configRemove(String str) {
        ConfigRepo.remove(str);
    }

    public static final boolean getBoolean(String str, boolean z10) {
        return ConfigRepo.getBoolean(str, z10);
    }

    public static final float getFloat(String str, float f10) {
        return ConfigRepo.getFloat(str, f10);
    }

    public static final int getInt(String str, int i10) {
        return ConfigRepo.getInt(str, i10);
    }

    public static final long getLong(String str, long j10) {
        return ConfigRepo.getLong(str, j10);
    }

    public static final String getString(String str, String str2) {
        return ConfigRepo.getString(str, str2);
    }

    public static final void setBoolean(String str, boolean z10) {
        ConfigRepo.setBoolean(str, z10);
    }

    public static final void setFloat(String str, float f10) {
        ConfigRepo.setFloat(str, f10);
    }

    public static final void setInt(String str, int i10) {
        ConfigRepo.setInt(str, i10);
    }

    public static final void setLong(String str, long j10) {
        ConfigRepo.setLong(str, j10);
    }

    public static final void setString(String str, String str2) {
        ConfigRepo.setString(str, str2);
    }
}

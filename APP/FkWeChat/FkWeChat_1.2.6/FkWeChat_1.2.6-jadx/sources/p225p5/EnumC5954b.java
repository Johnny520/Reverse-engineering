package p225p5;

import p309v5.InterfaceC8837s;

/* JADX INFO: renamed from: p5.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5954b implements InterfaceC8837s {
    RUNTIME("runtime"),
    BUILD("build"),
    SYSTEM("system"),
    EMBEDDED("embedded");


    /* JADX INFO: renamed from: q */
    public final String f18882q;

    EnumC5954b(String str) {
        this.f18882q = str;
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return this.f18882q;
    }
}

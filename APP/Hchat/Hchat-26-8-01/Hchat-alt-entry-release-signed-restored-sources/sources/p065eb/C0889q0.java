package p065eb;

import java.util.Map;
import java.util.function.Consumer;
import p085fg.InterfaceC1220a;
import p099h.Hchat.hooks.items.script.ScriptWaBridge;

/* JADX INFO: renamed from: eb.q0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0889q0 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2753g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Consumer f2754h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ScriptWaBridge f2755i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f2756j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Map f2757k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ long f2758l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f2759m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0889q0(Consumer consumer, ScriptWaBridge scriptWaBridge, String str, String str2, Map map, long j3) {
        this.f2754h = consumer;
        this.f2755i = scriptWaBridge;
        this.f2756j = str;
        this.f2759m = str2;
        this.f2757k = map;
        this.f2758l = j3;
    }

    /* JADX DEBUG: Class process forced to load method for inline: h.Hchat.hooks.items.script.ScriptWaBridge.C(java.util.function.Consumer, h.Hchat.hooks.items.script.ScriptWaBridge, java.lang.String, java.lang.String, java.util.Map, long):sf.n */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f2753g) {
            case 0:
                return ScriptWaBridge.post$lambda$0(this.f2754h, this.f2755i, this.f2756j, this.f2757k, (Map) this.f2759m, this.f2758l);
            default:
                return ScriptWaBridge.download$lambda$0(this.f2754h, this.f2755i, this.f2756j, (String) this.f2759m, this.f2757k, this.f2758l);
        }
    }

    public /* synthetic */ C0889q0(Consumer consumer, ScriptWaBridge scriptWaBridge, String str, Map map, Map map2, long j3) {
        this.f2754h = consumer;
        this.f2755i = scriptWaBridge;
        this.f2756j = str;
        this.f2757k = map;
        this.f2759m = map2;
        this.f2758l = j3;
    }
}

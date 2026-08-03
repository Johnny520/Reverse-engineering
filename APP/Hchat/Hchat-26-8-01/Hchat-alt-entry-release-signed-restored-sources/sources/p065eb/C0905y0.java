package p065eb;

import java.util.function.Consumer;
import p085fg.InterfaceC1220a;
import p099h.Hchat.hooks.items.script.ScriptWaBridge;

/* JADX INFO: renamed from: eb.y0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0905y0 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2812g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ScriptWaBridge f2813h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Consumer f2814i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f2815j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f2816k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0905y0(ScriptWaBridge scriptWaBridge, Consumer consumer, String str, String str2) {
        this.f2813h = scriptWaBridge;
        this.f2814i = consumer;
        this.f2815j = str;
        this.f2816k = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f2812g) {
            case 0:
                return ScriptWaBridge.m3949K(this.f2813h, this.f2814i, this.f2815j, this.f2816k);
            default:
                return ScriptWaBridge.sendText$lambda$0(this.f2813h, this.f2814i, this.f2815j, this.f2816k);
        }
    }

    public /* synthetic */ C0905y0(Consumer consumer, ScriptWaBridge scriptWaBridge, String str, String str2) {
        this.f2814i = consumer;
        this.f2813h = scriptWaBridge;
        this.f2815j = str;
        this.f2816k = str2;
    }
}

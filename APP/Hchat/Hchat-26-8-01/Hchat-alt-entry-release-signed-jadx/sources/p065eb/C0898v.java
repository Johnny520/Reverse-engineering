package p065eb;

import java.util.List;
import java.util.function.BiFunction;
import p085fg.InterfaceC1235p;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p119i2.C1954y;
import p211o9.C3091d;
import p211o9.C3099l;
import p218og.C3157u;
import p230p8.C3349c0;

/* JADX INFO: renamed from: eb.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0898v implements BiFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2790a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC1235p f2791b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0898v(int i9, InterfaceC1235p interfaceC1235p) {
        this.f2790a = i9;
        this.f2791b = interfaceC1235p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f2790a) {
            case 0:
                return ScriptPluginRuntime.logSendButtonDiagnostic$lambda$1((C0896u) this.f2791b, obj, obj2);
            case 1:
                return (C3099l) ((C3091d) this.f2791b).invoke(obj, obj2);
            case 2:
                return (C3349c0) ((C1954y) this.f2791b).invoke(obj, obj2);
            default:
                return (List) ((C3157u) this.f2791b).invoke(obj, obj2);
        }
    }
}

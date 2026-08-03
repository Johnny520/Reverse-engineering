package kotlinx.serialization.json;

import p000.C0201Em;
import p000.InterfaceC0717Qm;

/* JADX INFO: loaded from: classes.dex */
public final class JsonNull extends AbstractC2158d {
    public static final JsonNull INSTANCE = new JsonNull();

    @Override // kotlinx.serialization.json.AbstractC2158d
    /* JADX INFO: renamed from: a */
    public final String mo121a() {
        return "null";
    }

    public final InterfaceC0717Qm serializer() {
        return C0201Em.f607a;
    }
}

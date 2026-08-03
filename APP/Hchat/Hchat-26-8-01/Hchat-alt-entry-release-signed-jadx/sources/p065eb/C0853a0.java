package p065eb;

import bsh.Interpreter;
import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: eb.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0853a0 {

    /* JADX INFO: renamed from: a */
    public final C0859c0 f2606a;

    /* JADX INFO: renamed from: b */
    public final Interpreter f2607b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f2608c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f2609d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f2610e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f2611f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f2612g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f2613h;

    /* JADX INFO: renamed from: i */
    public volatile boolean f2614i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0853a0(C0859c0 c0859c0, Interpreter interpreter, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f2606a = c0859c0;
        this.f2607b = interpreter;
        this.f2608c = z9;
        this.f2609d = z10;
        this.f2610e = z11;
        this.f2611f = z12;
        this.f2612g = z13;
        this.f2613h = z14;
        this.f2614i = z15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0853a0)) {
            return false;
        }
        C0853a0 c0853a0 = (C0853a0) obj;
        return this.f2606a.equals(c0853a0.f2606a) && this.f2607b.equals(c0853a0.f2607b) && this.f2608c == c0853a0.f2608c && this.f2609d == c0853a0.f2609d && this.f2610e == c0853a0.f2610e && this.f2611f == c0853a0.f2611f && this.f2612g == c0853a0.f2612g && this.f2613h == c0853a0.f2613h && this.f2614i == c0853a0.f2614i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f2614i) + AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h((this.f2607b.hashCode() + (this.f2606a.hashCode() * 31)) * 31, 31, this.f2608c), 31, this.f2609d), 31, this.f2610e), 31, this.f2611f), 31, this.f2612g), 31, this.f2613h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        C0859c0 c0859c0 = this.f2606a;
        Interpreter interpreter = this.f2607b;
        boolean z9 = this.f2608c;
        boolean z10 = this.f2609d;
        boolean z11 = this.f2610e;
        boolean z12 = this.f2611f;
        boolean z13 = this.f2612g;
        boolean z14 = this.f2613h;
        boolean z15 = this.f2614i;
        StringBuilder sb2 = new StringBuilder("LoadedPlugin(plugin=");
        sb2.append(c0859c0);
        sb2.append(", interpreter=");
        sb2.append(interpreter);
        sb2.append(", hasSendButtonCallback=");
        AbstractC3199a.m6851x(sb2, z9, ", hasHandleMsgCallback=", z10, ", hasOpenSettingsCallback=");
        AbstractC3199a.m6851x(sb2, z11, ", hasMemberChangeCallback=", z12, ", hasNewFriendCallback=");
        AbstractC3199a.m6851x(sb2, z13, ", hasProtobufPacketCallback=", z14, ", hasImageDownloadCallback=");
        return AbstractC3199a.m6840m(")", sb2, z15);
    }
}

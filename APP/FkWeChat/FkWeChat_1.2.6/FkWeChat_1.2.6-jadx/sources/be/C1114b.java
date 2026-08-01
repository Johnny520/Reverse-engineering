package be;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: be.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C1114b extends AbstractC1113a {

    /* JADX INFO: renamed from: b */
    public final boolean f3345b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1114b(String str, boolean z10) {
        super(str);
        str.getClass();
        this.f3345b = z10;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4016b() {
        return this.f3345b;
    }

    @Override // be.AbstractC1113a
    public String toString() {
        return "Markdown:" + super.toString();
    }

    public /* synthetic */ C1114b(String str, boolean z10, int i10, AbstractC1043k abstractC1043k) {
        this(str, (i10 & 2) != 0 ? false : z10);
    }
}

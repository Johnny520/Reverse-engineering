package p174m;

import p085fg.InterfaceC1220a;
import p276sf.InterfaceC3955b;
import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: m.f3 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2600f3 extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public InterfaceC3955b f8422g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1220a f8423h;

    /* JADX INFO: renamed from: i */
    public float f8424i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f8425j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2605g3 f8426k;

    /* JADX INFO: renamed from: l */
    public int f8427l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2600f3(C2605g3 c2605g3, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f8426k = c2605g3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f8425j = obj;
        this.f8427l |= Integer.MIN_VALUE;
        return this.f8426k.m6057a(null, null, this);
    }
}

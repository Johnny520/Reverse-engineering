package Yue;

import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۡۦ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7020<T> implements InterfaceC7588<T>, InterfaceC3669<T>, InterfaceC5154<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6489
    public final InterfaceC5542 f21154;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7588<T> f21155;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۢ۠۟ۡ<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7020(@InterfaceC6399 InterfaceC7588<? extends T> interfaceC7588, @InterfaceC6489 InterfaceC5542 interfaceC5542) {
        this.f21154 = interfaceC5542;
        this.f21155 = interfaceC7588;
    }

    @Override // Yue.InterfaceC7588
    public T getValue() {
        return this.f21155.getValue();
    }

    @Override // Yue.InterfaceC7431, Yue.InterfaceC4890
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
        return this.f21155.mo48(interfaceC4892, interfaceC4199);
    }

    @Override // Yue.InterfaceC7431
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public List<T> mo3317() {
        return this.f21155.mo3317();
    }

    @Override // Yue.InterfaceC5154
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ */
    public InterfaceC4890<T> mo10178(@InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC3602 enumC3602) {
        return C7590.m23755(this, interfaceC4225, i, enumC3602);
    }
}

package p297u6;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: u6.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4277d extends C4276c {

    /* JADX INFO: renamed from: b */
    public final Member f14192b;

    /* JADX INFO: renamed from: c */
    public final Method f14193c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4277d(Member member) {
        super(member);
        member.getClass();
        this.f14192b = member;
        this.f14193c = (Method) member;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p297u6.C4276c
    /* JADX INFO: renamed from: a */
    public final Member mo8594a() {
        return this.f14192b;
    }
}

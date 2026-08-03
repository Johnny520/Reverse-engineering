package p297u6;

import java.lang.reflect.Executable;
import java.lang.reflect.Member;

/* JADX INFO: renamed from: u6.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4274a extends C4276c {

    /* JADX INFO: renamed from: b */
    public final Member f14187b;

    /* JADX INFO: renamed from: c */
    public final Executable f14188c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4274a(Member member) {
        super(member);
        member.getClass();
        this.f14187b = member;
        this.f14188c = (Executable) member;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p297u6.C4276c
    /* JADX INFO: renamed from: a */
    public final Member mo8594a() {
        return this.f14187b;
    }
}

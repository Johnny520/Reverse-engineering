package p000;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rg1 extends wf1 {

    /* JADX INFO: renamed from: b */
    public final Member f9552b;

    /* JADX INFO: renamed from: c */
    public final Method f9553c;

    public rg1(Member member) {
        super(member);
        this.f9552b = member;
        member.getClass();
        this.f9553c = (Method) member;
    }

    @Override // p000.wf1
    /* JADX INFO: renamed from: b */
    public final Member mo534b() {
        return this.f9552b;
    }

    @Override // p000.wf1
    public final String toString() {
        return this.f9552b.toString();
    }
}

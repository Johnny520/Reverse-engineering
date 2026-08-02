package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class wf1 {

    /* JADX INFO: renamed from: a */
    public final Member f12481a;

    public wf1(Member member) {
        this.f12481a = member;
    }

    /* JADX INFO: renamed from: a */
    public final Annotation[] m5884a() {
        if (!(mo534b() instanceof AnnotatedElement)) {
            c80.m677u("Unsupported member type: ", this);
            return null;
        }
        Member memberMo534b = mo534b();
        memberMo534b.getClass();
        return ((AnnotatedElement) memberMo534b).getDeclaredAnnotations();
    }

    /* JADX INFO: renamed from: b */
    public Member mo534b() {
        return this.f12481a;
    }

    public String toString() {
        return mo534b().toString();
    }
}

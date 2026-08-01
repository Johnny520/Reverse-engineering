package p025E2;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import me.dartcv.nuke.BuildConfig;
import p015C2.C0241a;
import p015C2.C0242b;
import p015C2.C0243c;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p275z2.C3516b;

/* JADX INFO: renamed from: E2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0283c implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f910d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C3516b f911e;

    public /* synthetic */ C0283c(C3516b c3516b, int i5) {
        this.f910d = i5;
        this.f911e = c3516b;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f910d) {
            case 0:
                Member member = (Member) obj;
                AbstractC1665j.m2983c(member, "null cannot be cast to non-null type java.lang.reflect.Method");
                C0243c c0243c = new C0243c((Method) member);
                Object obj2 = this.f911e.f10962b;
                if (obj2 != null) {
                    c0243c.mo445J(obj2);
                }
                return c0243c;
            case BuildConfig.VERSION_CODE /* 1 */:
                Member member2 = (Member) obj;
                AbstractC1665j.m2983c(member2, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of com.highcapable.kavaref.resolver.processor.MemberProcessor.resolve>");
                C0241a c0241a = new C0241a();
                Object obj3 = this.f911e.f10962b;
                return c0241a;
            case 2:
                Member member3 = (Member) obj;
                AbstractC1665j.m2983c(member3, "null cannot be cast to non-null type java.lang.reflect.Field");
                C0242b c0242b = new C0242b((Field) member3);
                Object obj4 = this.f911e.f10962b;
                if (obj4 != null) {
                    c0242b.mo445J(obj4);
                }
                return c0242b;
            case 3:
                Member member4 = (Member) obj;
                AbstractC1665j.m2983c(member4, "null cannot be cast to non-null type java.lang.reflect.Method");
                C0243c c0243c2 = new C0243c((Method) member4);
                Object obj5 = this.f911e.f10962b;
                if (obj5 != null) {
                    c0243c2.mo445J(obj5);
                }
                return c0243c2;
            case 4:
                Member member5 = (Member) obj;
                AbstractC1665j.m2983c(member5, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of com.highcapable.kavaref.resolver.processor.MemberProcessor.resolve>");
                C0241a c0241a2 = new C0241a();
                Object obj6 = this.f911e.f10962b;
                return c0241a2;
            default:
                Member member6 = (Member) obj;
                AbstractC1665j.m2983c(member6, "null cannot be cast to non-null type java.lang.reflect.Field");
                C0242b c0242b2 = new C0242b((Field) member6);
                Object obj7 = this.f911e.f10962b;
                if (obj7 != null) {
                    c0242b2.mo445J(obj7);
                }
                return c0242b2;
        }
    }
}

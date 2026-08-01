package md;

import java.lang.reflect.Member;
import p010a9.InterfaceC0184l;
import p215oc.C5725t;

/* JADX INFO: renamed from: md.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5155j {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ InterfaceC5153h m21163a(InterfaceC5155j interfaceC5155j, Member member, String str, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: hook");
            return null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC0184l = null;
        }
        if ((i10 & 8) != 0) {
            interfaceC0184l2 = null;
        }
        return interfaceC5155j.hook(member, str, interfaceC0184l, interfaceC0184l2);
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ InterfaceC5153h m21164b(InterfaceC5155j interfaceC5155j, Member member, String str, InterfaceC0184l interfaceC0184l, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: hookReplace");
            return null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return interfaceC5155j.hookReplace(member, str, interfaceC0184l);
    }

    InterfaceC5153h hook(Member member, String str, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2);

    InterfaceC5153h hookReplace(Member member, String str, InterfaceC0184l interfaceC0184l);

    void log(int i10, String str, String str2);

    void replaceHook(String str, InterfaceC0184l interfaceC0184l);

    void unhook(String str);
}

package p361yc;

import p098g9.InterfaceC2549c;
import p172l8.C4699i;
import p300uc.C8661o;

/* JADX INFO: renamed from: yc.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9676c {
    /* JADX INFO: renamed from: a */
    public static final Void m37820a(InterfaceC2549c interfaceC2549c, InterfaceC2549c interfaceC2549c2) {
        interfaceC2549c.getClass();
        interfaceC2549c2.getClass();
        String strMo3794w = interfaceC2549c.mo3794w();
        if (strMo3794w == null) {
            strMo3794w = String.valueOf(interfaceC2549c);
        }
        m37821b(strMo3794w, interfaceC2549c2);
        throw new C4699i();
    }

    /* JADX INFO: renamed from: b */
    public static final Void m37821b(String str, InterfaceC2549c interfaceC2549c) {
        String str2;
        interfaceC2549c.getClass();
        String str3 = "in the polymorphic scope of '" + interfaceC2549c.mo3794w() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + interfaceC2549c.mo3794w() + "' has to be sealed and '@Serializable'.";
        }
        throw new C8661o(str2);
    }
}

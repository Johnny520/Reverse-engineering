package p358y9;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import p024b9.AbstractC1061t;
import p213oa.C5691b;
import p213oa.C5692c;
import p214ob.AbstractC5701a;
import p299ub.AbstractC8611a0;

/* JADX INFO: renamed from: y9.h0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9624h0 {

    /* JADX INFO: renamed from: a */
    public static final C9624h0 f32756a = new C9624h0();

    /* JADX INFO: renamed from: b */
    public static final C5692c f32757b;

    /* JADX INFO: renamed from: c */
    public static final C5691b f32758c;

    /* JADX INFO: renamed from: d */
    public static final C5691b f32759d;

    /* JADX INFO: renamed from: e */
    public static final C5691b f32760e;

    static {
        C5692c c5692c = new C5692c("kotlin.jvm.JvmField");
        f32757b = c5692c;
        C5691b.a aVar = C5691b.f17894d;
        f32758c = aVar.m22993c(c5692c);
        f32759d = aVar.m22993c(new C5692c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f32760e = C5691b.a.m22991b(aVar, "kotlin/jvm/internal/RepeatableContainer", false, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public static final String m37640b(String str) {
        str.getClass();
        if (m37644f(str)) {
            return str;
        }
        return "get" + AbstractC5701a.m23073a(str);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m37641c(String str) {
        str.getClass();
        return AbstractC8611a0.m33075T(str, "get", false, 2, null) || AbstractC8611a0.m33075T(str, "is", false, 2, null);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m37642d(String str) {
        str.getClass();
        return AbstractC8611a0.m33075T(str, "set", false, 2, null);
    }

    /* JADX INFO: renamed from: e */
    public static final String m37643e(String str) {
        str.getClass();
        StringBuilder sb2 = new StringBuilder("set");
        sb2.append(m37644f(str) ? str.substring(2) : AbstractC5701a.m23073a(str));
        return sb2.toString();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m37644f(String str) {
        str.getClass();
        if (!AbstractC8611a0.m33075T(str, "is", false, 2, null) || str.length() == 2) {
            return false;
        }
        char cCharAt = str.charAt(2);
        return AbstractC1061t.m3843d(97, cCharAt) > 0 || AbstractC1061t.m3843d(cCharAt, Opcodes.ISHR) > 0;
    }

    /* JADX INFO: renamed from: a */
    public final C5691b m37645a() {
        return f32760e;
    }
}

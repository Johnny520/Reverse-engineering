package Yue;

import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,134:1\n37#2,2:135\n*S KotlinDebug\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n*L\n131#1:135,2\n*E\n"})
public final class C4314 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f819 = 1;

    /* JADX INFO: renamed from: ۥ */
    public static final void m1280(int i, int i2) {
        if (i2 <= i) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final InterfaceC4313 m1281(AbstractC3513 abstractC3513) {
        return (InterfaceC4313) abstractC3513.getClass().getAnnotation(InterfaceC4313.class);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int m12461(AbstractC3513 abstractC3513) {
        try {
            Field declaredField = abstractC3513.getClass().getDeclaredField(C6468.f16552);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(abstractC3513);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @InterfaceC7470(version = "1.3")
    @InterfaceC5572(name = "getSpilledVariableFieldMapping")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String[] m12462(@InterfaceC6399 AbstractC3513 abstractC3513) {
        C5499.m17103(abstractC3513, "<this>");
        InterfaceC4313 interfaceC4313M1281 = m1281(abstractC3513);
        if (interfaceC4313M1281 == null) {
            return null;
        }
        m1280(1, interfaceC4313M1281.m1279v());
        ArrayList arrayList = new ArrayList();
        int iM12461 = m12461(abstractC3513);
        int[] iArrM1274i = interfaceC4313M1281.m1274i();
        int length = iArrM1274i.length;
        for (int i = 0; i < length; i++) {
            if (iArrM1274i[i] == iM12461) {
                arrayList.add(interfaceC4313M1281.m1278s()[i]);
                arrayList.add(interfaceC4313M1281.m1277n()[i]);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @InterfaceC7470(version = "1.3")
    @InterfaceC5572(name = "getStackTraceElement")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final StackTraceElement m12463(@InterfaceC6399 AbstractC3513 abstractC3513) {
        String strM1272c;
        C5499.m17103(abstractC3513, "<this>");
        InterfaceC4313 interfaceC4313M1281 = m1281(abstractC3513);
        if (interfaceC4313M1281 == null) {
            return null;
        }
        m1280(1, interfaceC4313M1281.m1279v());
        int iM12461 = m12461(abstractC3513);
        int i = iM12461 < 0 ? -1 : interfaceC4313M1281.m1275l()[iM12461];
        String strM2728 = C6262.f1949.m2728(abstractC3513);
        if (strM2728 == null) {
            strM1272c = interfaceC4313M1281.m1272c();
        } else {
            strM1272c = strM2728 + '/' + interfaceC4313M1281.m1272c();
        }
        return new StackTraceElement(strM1272c, interfaceC4313M1281.m1276m(), interfaceC4313M1281.m1273f(), i);
    }
}

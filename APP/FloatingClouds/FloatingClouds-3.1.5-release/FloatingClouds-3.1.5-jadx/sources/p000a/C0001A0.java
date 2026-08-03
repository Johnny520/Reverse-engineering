package p000a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;
import p000a.C0492b3;
import p000a.C0690lb;
import p000a.C0799r6;
import p000a.C0907x0;
import p000a.EnumC0039C0;

/* JADX INFO: renamed from: a.A0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0001A0 extends AbstractC0417X1 {

    /* JADX INFO: renamed from: b */
    public final ArrayList f21b;

    /* JADX INFO: renamed from: a.A0$a */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:51:0x0170  */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static C0001A0 m11a(DexKitBridge dexKitBridge, C0488b c0488b) {
            Object objValueOf;
            Object objM2206a;
            C0631i9.m1482e(dexKitBridge, "bridge");
            ArrayList arrayList = new ArrayList();
            int iM780b = c0488b.m780b(4);
            int iM784f = iM780b != 0 ? c0488b.m784f(iM780b) : 0;
            for (int i = 0; i < iM784f; i++) {
                C0469a c0469a = new C0469a();
                int iM780b2 = c0488b.m780b(4);
                ByteBuffer byteBufferOrder = null;
                if (iM780b2 != 0) {
                    int iM779a = c0488b.m779a((i * 4) + c0488b.m783e(iM780b2));
                    ByteBuffer byteBuffer = c0488b.f981b;
                    C0631i9.m1481d(byteBuffer, "bb");
                    c0469a.m781c(iM779a, byteBuffer);
                } else {
                    c0469a = null;
                }
                C0631i9.m1479b(c0469a);
                int iM780b3 = c0469a.m780b(6);
                EnumC0039C0 enumC0039C0M121a = EnumC0039C0.a.m121a(iM780b3 != 0 ? c0469a.f981b.get(iM780b3 + c0469a.f980a) : (byte) 0);
                switch (enumC0039C0M121a.ordinal()) {
                    case 0:
                        C0287Pe c0287PeM1145l = c0469a.m1145l(new C0564f());
                        C0631i9.m1480c(c0287PeM1145l, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueByte{ org.luckypray.dexkit.AliasKt.InnerEncodeValueByte }");
                        C0564f c0564f = (C0564f) c0287PeM1145l;
                        int iM780b4 = c0564f.m780b(4);
                        objValueOf = Byte.valueOf(iM780b4 != 0 ? c0564f.f981b.get(iM780b4 + c0564f.f980a) : (byte) 0);
                        break;
                    case 1:
                        C0287Pe c0287PeM1145l2 = c0469a.m1145l(new C0697m());
                        C0631i9.m1480c(c0287PeM1145l2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueShort{ org.luckypray.dexkit.AliasKt.InnerEncodeValueShort }");
                        C0697m c0697m = (C0697m) c0287PeM1145l2;
                        int iM780b5 = c0697m.m780b(4);
                        objValueOf = Short.valueOf(iM780b5 != 0 ? c0697m.f981b.getShort(iM780b5 + c0697m.f980a) : (short) 0);
                        break;
                    case 2:
                        C0287Pe c0287PeM1145l3 = c0469a.m1145l(new C0583g());
                        C0631i9.m1480c(c0287PeM1145l3, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueChar{ org.luckypray.dexkit.AliasKt.InnerEncodeValueChar }");
                        C0583g c0583g = (C0583g) c0287PeM1145l3;
                        int iM780b6 = c0583g.m780b(4);
                        objValueOf = Short.valueOf(iM780b6 != 0 ? c0583g.f981b.getShort(iM780b6 + c0583g.f980a) : (short) 0);
                        break;
                    case 3:
                        C0287Pe c0287PeM1145l4 = c0469a.m1145l(new C0640j());
                        C0631i9.m1480c(c0287PeM1145l4, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueInt{ org.luckypray.dexkit.AliasKt.InnerEncodeValueInt }");
                        C0640j c0640j = (C0640j) c0287PeM1145l4;
                        int iM780b7 = c0640j.m780b(4);
                        objValueOf = Integer.valueOf(iM780b7 != 0 ? c0640j.f981b.getInt(iM780b7 + c0640j.f980a) : 0);
                        break;
                    case 4:
                        C0287Pe c0287PeM1145l5 = c0469a.m1145l(new C0659k());
                        C0631i9.m1480c(c0287PeM1145l5, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueLong{ org.luckypray.dexkit.AliasKt.InnerEncodeValueLong }");
                        C0659k c0659k = (C0659k) c0287PeM1145l5;
                        int iM780b8 = c0659k.m780b(4);
                        objValueOf = Long.valueOf(iM780b8 != 0 ? c0659k.f981b.getLong(iM780b8 + c0659k.f980a) : 0L);
                        break;
                    case 5:
                        C0287Pe c0287PeM1145l6 = c0469a.m1145l(new C0621i());
                        C0631i9.m1480c(c0287PeM1145l6, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueFloat{ org.luckypray.dexkit.AliasKt.InnerEncodeValueFloat }");
                        C0621i c0621i = (C0621i) c0287PeM1145l6;
                        int iM780b9 = c0621i.m780b(4);
                        objValueOf = Float.valueOf(iM780b9 != 0 ? c0621i.f981b.getFloat(iM780b9 + c0621i.f980a) : 0.0f);
                        break;
                    case 6:
                        C0287Pe c0287PeM1145l7 = c0469a.m1145l(new C0602h());
                        C0631i9.m1480c(c0287PeM1145l7, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueDouble{ org.luckypray.dexkit.AliasKt.InnerEncodeValueDouble }");
                        C0602h c0602h = (C0602h) c0287PeM1145l7;
                        int iM780b10 = c0602h.m780b(4);
                        objValueOf = Double.valueOf(iM780b10 != 0 ? c0602h.f981b.getDouble(iM780b10 + c0602h.f980a) : 0.0d);
                        break;
                    case 7:
                        C0287Pe c0287PeM1145l8 = c0469a.m1145l(new C0716n());
                        C0631i9.m1480c(c0287PeM1145l8, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueString{ org.luckypray.dexkit.AliasKt.InnerEncodeValueString }");
                        C0716n c0716n = (C0716n) c0287PeM1145l8;
                        try {
                            try {
                                int iM780b11 = c0716n.m780b(4);
                                String strM782d = iM780b11 != 0 ? c0716n.m782d(iM780b11 + c0716n.f980a) : null;
                                C0631i9.m1479b(strM782d);
                                objValueOf = strM782d;
                            } catch (IllegalArgumentException unused) {
                                int iM780b12 = c0716n.m780b(4);
                                if (iM780b12 != 0) {
                                    byteBufferOrder = c0716n.f981b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
                                    int iM783e = c0716n.m783e(iM780b12);
                                    byteBufferOrder.position(iM783e);
                                    byteBufferOrder.limit(c0716n.m784f(iM780b12) + iM783e);
                                }
                                C0631i9.m1481d(byteBufferOrder, "__vector_as_bytebuffer(4, 1)");
                                objM2206a = C0726n9.m1672o(C0726n9.m1671n(byteBufferOrder));
                                if (C0901wd.m2189a(objM2206a) != null) {
                                    objM2206a = "";
                                }
                                objValueOf = (String) objM2206a;
                                C0631i9.m1481d(objValueOf, "when (type) {\n          …lue\n                    }");
                                arrayList.add(new C0020B0(objValueOf, enumC0039C0M121a));
                            }
                        } catch (Throwable th) {
                            objM2206a = C0920xd.m2206a(th);
                            if (C0901wd.m2189a(objM2206a) != null) {
                            }
                            objValueOf = (String) objM2206a;
                            C0631i9.m1481d(objValueOf, "when (type) {\n          …lue\n                    }");
                            arrayList.add(new C0020B0(objValueOf, enumC0039C0M121a));
                        }
                        break;
                    case 8:
                        C0287Pe c0287PeM1145l9 = c0469a.m1145l(new C0526d());
                        C0631i9.m1480c(c0287PeM1145l9, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-ClassMeta{ org.luckypray.dexkit.AliasKt.InnerClassMeta }");
                        objValueOf = C0492b3.a.m1196a(dexKitBridge, (C0526d) c0287PeM1145l9);
                        break;
                    case 9:
                        C0287Pe c0287PeM1145l10 = c0469a.m1145l(new C0754p());
                        C0631i9.m1480c(c0287PeM1145l10, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-MethodMeta{ org.luckypray.dexkit.AliasKt.InnerMethodMeta }");
                        objValueOf = C0690lb.a.m1552a(dexKitBridge, (C0754p) c0287PeM1145l10);
                        break;
                    case 10:
                        C0287Pe c0287PeM1145l11 = c0469a.m1145l(new C0735o());
                        C0631i9.m1480c(c0287PeM1145l11, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-FieldMeta{ org.luckypray.dexkit.AliasKt.InnerFieldMeta }");
                        objValueOf = C0799r6.a.m1858a(dexKitBridge, (C0735o) c0287PeM1145l11);
                        break;
                    case 11:
                        C0287Pe c0287PeM1145l12 = c0469a.m1145l(new C0488b());
                        C0631i9.m1480c(c0287PeM1145l12, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeArray{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeArray }");
                        objValueOf = m11a(dexKitBridge, (C0488b) c0287PeM1145l12);
                        break;
                    case 12:
                        C0287Pe c0287PeM1145l13 = c0469a.m1145l(new C0507c());
                        C0631i9.m1480c(c0287PeM1145l13, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationMeta }");
                        objValueOf = C0907x0.a.m2192a(dexKitBridge, (C0507c) c0287PeM1145l13);
                        break;
                    case 13:
                        C0287Pe c0287PeM1145l14 = c0469a.m1145l(new C0678l());
                        C0631i9.m1480c(c0287PeM1145l14, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueNull{ org.luckypray.dexkit.AliasKt.InnerEncodeValueNull }");
                        objValueOf = (C0678l) c0287PeM1145l14;
                        break;
                    case 14:
                        C0287Pe c0287PeM1145l15 = c0469a.m1145l(new C0545e());
                        C0631i9.m1480c(c0287PeM1145l15, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueBoolean{ org.luckypray.dexkit.AliasKt.InnerEncodeValueBoolean }");
                        C0545e c0545e = (C0545e) c0287PeM1145l15;
                        int iM780b13 = c0545e.m780b(4);
                        objValueOf = Boolean.valueOf((iM780b13 == 0 || ((byte) 0) == c0545e.f981b.get(iM780b13 + c0545e.f980a)) ? false : true);
                        break;
                    default:
                        throw new C0266Ob();
                }
                C0631i9.m1481d(objValueOf, "when (type) {\n          …lue\n                    }");
                arrayList.add(new C0020B0(objValueOf, enumC0039C0M121a));
            }
            return new C0001A0(dexKitBridge, arrayList);
        }
    }

    public C0001A0() {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0001A0(DexKitBridge dexKitBridge, ArrayList arrayList) {
        super(dexKitBridge, -1, -1);
        this.f21b = arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        for (Object obj : this.f21b) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            C0020B0 c0020b0 = (C0020B0) obj;
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(c0020b0);
            i = i2;
        }
        sb.append("}");
        String string = sb.toString();
        C0631i9.m1481d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}

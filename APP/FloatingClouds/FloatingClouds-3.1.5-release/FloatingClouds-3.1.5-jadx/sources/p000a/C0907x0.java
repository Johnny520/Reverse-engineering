package p000a;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;
import p000a.C0001A0;
import p000a.C0492b3;
import p000a.C0690lb;
import p000a.C0799r6;
import p000a.EnumC0039C0;

/* JADX INFO: renamed from: a.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0907x0 extends AbstractC0417X1 {

    /* JADX INFO: renamed from: b */
    public final String f3509b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f3510c;

    /* JADX INFO: renamed from: a.x0$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static C0907x0 m2192a(DexKitBridge dexKitBridge, C0507c c0507c) {
            Object objValueOf;
            boolean z = true;
            C0631i9.m1482e(dexKitBridge, "bridge");
            int iM780b = c0507c.m780b(4);
            if (iM780b != 0) {
                c0507c.f981b.getInt(iM780b + c0507c.f980a);
            }
            int i = 6;
            int iM780b2 = c0507c.m780b(6);
            if (iM780b2 != 0) {
                c0507c.f981b.getInt(iM780b2 + c0507c.f980a);
            }
            int iM780b3 = c0507c.m780b(8);
            String strM782d = iM780b3 != 0 ? c0507c.m782d(iM780b3 + c0507c.f980a) : null;
            C0631i9.m1479b(strM782d);
            int iM780b4 = c0507c.m780b(10);
            byte b = iM780b4 != 0 ? c0507c.f981b.get(iM780b4 + c0507c.f980a) : (byte) 0;
            if (b != 0 && b != 1 && b != 2 && b != 3) {
                throw new IllegalArgumentException(C0944z.m2225e("Unknown AnnotationVisibilityType: ", b));
            }
            ArrayList arrayList = new ArrayList();
            int iM780b5 = c0507c.m780b(12);
            int iM784f = iM780b5 != 0 ? c0507c.m784f(iM780b5) : 0;
            int i2 = 0;
            while (i2 < iM784f) {
                C0469a c0469a = new C0469a();
                int iM780b6 = c0507c.m780b(12);
                if (iM780b6 != 0) {
                    int iM779a = c0507c.m779a((i2 * 4) + c0507c.m783e(iM780b6));
                    ByteBuffer byteBuffer = c0507c.f981b;
                    C0631i9.m1481d(byteBuffer, "bb");
                    c0469a.m781c(iM779a, byteBuffer);
                } else {
                    c0469a = null;
                }
                C0631i9.m1479b(c0469a);
                C0469a c0469a2 = new C0469a();
                int iM780b7 = c0469a.m780b(i);
                boolean z2 = z;
                if (iM780b7 != 0) {
                    int iM779a2 = c0469a.m779a(iM780b7 + c0469a.f980a);
                    ByteBuffer byteBuffer2 = c0469a.f981b;
                    C0631i9.m1481d(byteBuffer2, "bb");
                    c0469a2.m781c(iM779a2, byteBuffer2);
                } else {
                    c0469a2 = null;
                }
                C0631i9.m1480c(c0469a2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeValueMeta }");
                int iM780b8 = c0469a.m780b(4);
                String strM782d2 = iM780b8 != 0 ? c0469a.m782d(iM780b8 + c0469a.f980a) : null;
                C0631i9.m1479b(strM782d2);
                int iM780b9 = c0469a2.m780b(i);
                EnumC0039C0 enumC0039C0M121a = EnumC0039C0.a.m121a(iM780b9 != 0 ? c0469a2.f981b.get(iM780b9 + c0469a2.f980a) : (byte) 0);
                switch (enumC0039C0M121a.ordinal()) {
                    case 0:
                        C0287Pe c0287PeM1145l = c0469a2.m1145l(new C0564f());
                        C0631i9.m1480c(c0287PeM1145l, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueByte{ org.luckypray.dexkit.AliasKt.InnerEncodeValueByte }");
                        C0564f c0564f = (C0564f) c0287PeM1145l;
                        int iM780b10 = c0564f.m780b(4);
                        objValueOf = Byte.valueOf(iM780b10 != 0 ? c0564f.f981b.get(iM780b10 + c0564f.f980a) : (byte) 0);
                        break;
                    case 1:
                        C0287Pe c0287PeM1145l2 = c0469a2.m1145l(new C0697m());
                        C0631i9.m1480c(c0287PeM1145l2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueShort{ org.luckypray.dexkit.AliasKt.InnerEncodeValueShort }");
                        C0697m c0697m = (C0697m) c0287PeM1145l2;
                        int iM780b11 = c0697m.m780b(4);
                        objValueOf = Short.valueOf(iM780b11 != 0 ? c0697m.f981b.getShort(iM780b11 + c0697m.f980a) : (short) 0);
                        break;
                    case 2:
                        C0287Pe c0287PeM1145l3 = c0469a2.m1145l(new C0583g());
                        C0631i9.m1480c(c0287PeM1145l3, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueChar{ org.luckypray.dexkit.AliasKt.InnerEncodeValueChar }");
                        C0583g c0583g = (C0583g) c0287PeM1145l3;
                        int iM780b12 = c0583g.m780b(4);
                        objValueOf = Short.valueOf(iM780b12 != 0 ? c0583g.f981b.getShort(iM780b12 + c0583g.f980a) : (short) 0);
                        break;
                    case 3:
                        C0287Pe c0287PeM1145l4 = c0469a2.m1145l(new C0640j());
                        C0631i9.m1480c(c0287PeM1145l4, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueInt{ org.luckypray.dexkit.AliasKt.InnerEncodeValueInt }");
                        C0640j c0640j = (C0640j) c0287PeM1145l4;
                        int iM780b13 = c0640j.m780b(4);
                        objValueOf = Integer.valueOf(iM780b13 != 0 ? c0640j.f981b.getInt(iM780b13 + c0640j.f980a) : 0);
                        break;
                    case 4:
                        C0287Pe c0287PeM1145l5 = c0469a2.m1145l(new C0659k());
                        C0631i9.m1480c(c0287PeM1145l5, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueLong{ org.luckypray.dexkit.AliasKt.InnerEncodeValueLong }");
                        C0659k c0659k = (C0659k) c0287PeM1145l5;
                        int iM780b14 = c0659k.m780b(4);
                        objValueOf = Long.valueOf(iM780b14 != 0 ? c0659k.f981b.getLong(iM780b14 + c0659k.f980a) : 0L);
                        break;
                    case 5:
                        C0287Pe c0287PeM1145l6 = c0469a2.m1145l(new C0621i());
                        C0631i9.m1480c(c0287PeM1145l6, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueFloat{ org.luckypray.dexkit.AliasKt.InnerEncodeValueFloat }");
                        C0621i c0621i = (C0621i) c0287PeM1145l6;
                        int iM780b15 = c0621i.m780b(4);
                        objValueOf = Float.valueOf(iM780b15 != 0 ? c0621i.f981b.getFloat(iM780b15 + c0621i.f980a) : 0.0f);
                        break;
                    case 6:
                        C0287Pe c0287PeM1145l7 = c0469a2.m1145l(new C0602h());
                        C0631i9.m1480c(c0287PeM1145l7, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueDouble{ org.luckypray.dexkit.AliasKt.InnerEncodeValueDouble }");
                        C0602h c0602h = (C0602h) c0287PeM1145l7;
                        int iM780b16 = c0602h.m780b(4);
                        objValueOf = Double.valueOf(iM780b16 != 0 ? c0602h.f981b.getDouble(iM780b16 + c0602h.f980a) : 0.0d);
                        break;
                    case 7:
                        C0287Pe c0287PeM1145l8 = c0469a2.m1145l(new C0716n());
                        C0631i9.m1480c(c0287PeM1145l8, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueString{ org.luckypray.dexkit.AliasKt.InnerEncodeValueString }");
                        C0716n c0716n = (C0716n) c0287PeM1145l8;
                        int iM780b17 = c0716n.m780b(4);
                        objValueOf = iM780b17 != 0 ? c0716n.m782d(iM780b17 + c0716n.f980a) : null;
                        C0631i9.m1479b(objValueOf);
                        break;
                    case 8:
                        C0287Pe c0287PeM1145l9 = c0469a2.m1145l(new C0526d());
                        C0631i9.m1480c(c0287PeM1145l9, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-ClassMeta{ org.luckypray.dexkit.AliasKt.InnerClassMeta }");
                        objValueOf = C0492b3.a.m1196a(dexKitBridge, (C0526d) c0287PeM1145l9);
                        break;
                    case 9:
                        C0287Pe c0287PeM1145l10 = c0469a2.m1145l(new C0754p());
                        C0631i9.m1480c(c0287PeM1145l10, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-MethodMeta{ org.luckypray.dexkit.AliasKt.InnerMethodMeta }");
                        objValueOf = C0690lb.a.m1552a(dexKitBridge, (C0754p) c0287PeM1145l10);
                        break;
                    case 10:
                        C0287Pe c0287PeM1145l11 = c0469a2.m1145l(new C0735o());
                        C0631i9.m1480c(c0287PeM1145l11, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-FieldMeta{ org.luckypray.dexkit.AliasKt.InnerFieldMeta }");
                        objValueOf = C0799r6.a.m1858a(dexKitBridge, (C0735o) c0287PeM1145l11);
                        break;
                    case 11:
                        C0287Pe c0287PeM1145l12 = c0469a2.m1145l(new C0488b());
                        C0631i9.m1480c(c0287PeM1145l12, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeArray{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeArray }");
                        objValueOf = C0001A0.a.m11a(dexKitBridge, (C0488b) c0287PeM1145l12);
                        break;
                    case 12:
                        C0287Pe c0287PeM1145l13 = c0469a2.m1145l(new C0507c());
                        C0631i9.m1480c(c0287PeM1145l13, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationMeta }");
                        objValueOf = m2192a(dexKitBridge, (C0507c) c0287PeM1145l13);
                        break;
                    case 13:
                        C0287Pe c0287PeM1145l14 = c0469a2.m1145l(new C0678l());
                        C0631i9.m1480c(c0287PeM1145l14, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueNull{ org.luckypray.dexkit.AliasKt.InnerEncodeValueNull }");
                        objValueOf = (C0678l) c0287PeM1145l14;
                        break;
                    case 14:
                        C0287Pe c0287PeM1145l15 = c0469a2.m1145l(new C0545e());
                        C0631i9.m1480c(c0287PeM1145l15, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueBoolean{ org.luckypray.dexkit.AliasKt.InnerEncodeValueBoolean }");
                        C0545e c0545e = (C0545e) c0287PeM1145l15;
                        int iM780b18 = c0545e.m780b(4);
                        objValueOf = Boolean.valueOf((iM780b18 == 0 || ((byte) 0) == c0545e.f981b.get(iM780b18 + c0545e.f980a)) ? false : z2);
                        break;
                    default:
                        throw new C0266Ob();
                }
                arrayList.add(new C0945z0(dexKitBridge, strM782d2, new C0020B0(objValueOf, enumC0039C0M121a)));
                i2++;
                z = z2;
                i = 6;
            }
            C0413Wf c0413Wf = C0413Wf.f1577a;
            return new C0907x0(dexKitBridge, strM782d, arrayList);
        }
    }

    public C0907x0() {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0907x0(DexKitBridge dexKitBridge, String str, ArrayList arrayList) {
        super(dexKitBridge, -1, -1);
        this.f3509b = str;
        this.f3510c = arrayList;
        new C0233Me(new C0926y0(this, 0));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("@" + C0608h5.m1444a(this.f3509b));
        sb.append("(");
        int i = 0;
        for (Object obj : this.f3510c) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            C0945z0 c0945z0 = (C0945z0) obj;
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(c0945z0);
            i = i2;
        }
        sb.append(")");
        String string = sb.toString();
        C0631i9.m1481d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}

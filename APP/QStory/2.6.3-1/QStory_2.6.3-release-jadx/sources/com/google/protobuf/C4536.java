package com.google.protobuf;

import androidx.appcompat.widget.C0987;
import androidx.collection.C1123;
import bsh.C3466;
import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4536 implements InterfaceC4273 {
    private final TreeMap<Integer, C4541> fields;
    private static final C4536 defaultInstance = new C4536(new TreeMap());
    private static final C4537 PARSER = new C4537();

    private C4536(TreeMap<Integer, C4541> treeMap) {
        this.fields = treeMap;
    }

    public static C4536 getDefaultInstance() {
        return defaultInstance;
    }

    public static C4544 newBuilder() {
        C4544 c4544 = new C4544();
        c4544.f11874 = new TreeMap();
        return c4544;
    }

    public static C4536 parseFrom(InputStream inputStream) {
        C4544 c4544NewBuilder = newBuilder();
        c4544NewBuilder.getClass();
        AbstractC4306 abstractC4306M8254 = AbstractC4306.m8254(inputStream);
        c4544NewBuilder.m8524(abstractC4306M8254);
        abstractC4306M8254.mo8271(0);
        return c4544NewBuilder.build();
    }

    public Map<Integer, C4541> asMap() {
        return this.fields.isEmpty() ? Collections.EMPTY_MAP : (Map) this.fields.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4536) && this.fields.equals(((C4536) obj).fields);
    }

    public C4541 getField(int i) {
        C4541 c4541 = this.fields.get(Integer.valueOf(i));
        return c4541 == null ? C4541.f11868 : c4541;
    }

    @Override // com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public int getSerializedSize() {
        if (this.fields.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (Map.Entry<Integer, C4541> entry : this.fields.entrySet()) {
            C4541 value = entry.getValue();
            int iIntValue = entry.getKey().intValue();
            int i2 = 0;
            int serializedSize = 0;
            while (true) {
                C4262 c4262 = value.f11873;
                if (i2 >= c4262.f11440) {
                    break;
                }
                serializedSize += AbstractC4294.m8196(iIntValue, c4262.m8127(i2));
                i2++;
            }
            int i3 = 0;
            while (true) {
                C4445 c4445 = value.f11872;
                if (i3 >= c4445.f11597) {
                    break;
                }
                c4445.m8373(i3);
                serializedSize += AbstractC4294.m8201(iIntValue) + 4;
                i3++;
            }
            int i4 = 0;
            while (true) {
                C4262 c42622 = value.f11871;
                if (i4 >= c42622.f11440) {
                    break;
                }
                c42622.m8127(i4);
                serializedSize += AbstractC4294.m8201(iIntValue) + 8;
                i4++;
            }
            for (int i5 = 0; i5 < value.f11870.size(); i5++) {
                serializedSize += AbstractC4294.m8192(iIntValue, (ByteString) value.f11870.get(i5));
            }
            for (int i6 = 0; i6 < value.f11869.size(); i6++) {
                serializedSize += ((C4536) value.f11869.get(i6)).getSerializedSize() + (AbstractC4294.m8201(iIntValue) * 2);
            }
            i += serializedSize;
        }
        return i;
    }

    public int getSerializedSizeAsMessageSet() {
        if (this.fields.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (Map.Entry<Integer, C4541> entry : this.fields.entrySet()) {
            C4541 value = entry.getValue();
            int iIntValue = entry.getKey().intValue();
            int iM8192 = 0;
            for (int i2 = 0; i2 < value.f11870.size(); i2++) {
                iM8192 += AbstractC4294.m8192(3, (ByteString) value.f11870.get(i2)) + AbstractC4294.m8195(2, iIntValue) + (AbstractC4294.m8201(1) * 2);
            }
            i += iM8192;
        }
        return i;
    }

    public boolean hasField(int i) {
        return this.fields.containsKey(Integer.valueOf(i));
    }

    public int hashCode() {
        if (this.fields.isEmpty()) {
            return 0;
        }
        return this.fields.hashCode();
    }

    public boolean isEmpty() {
        return this.fields.isEmpty();
    }

    @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
    public boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4544 toBuilder() {
        C4544 c4544NewBuilder = newBuilder();
        c4544NewBuilder.m8530(this);
        return c4544NewBuilder;
    }

    @Override // com.google.protobuf.InterfaceC4273
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            boolean z = AbstractC4294.f11474;
            C4299 c4299 = new C4299(bArr, serializedSize);
            writeTo(c4299);
            c4299.m8220();
            return bArr;
        } catch (IOException e) {
            C1123.m1408("Serializing to a byte array threw an IOException (should never happen).", e);
            return null;
        }
    }

    @Override // com.google.protobuf.InterfaceC4273
    public ByteString toByteString() {
        try {
            C4302 c4302NewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            writeTo(c4302NewCodedBuilder.f11495);
            c4302NewCodedBuilder.f11495.m8220();
            return new ByteString.LiteralByteString(c4302NewCodedBuilder.f11494);
        } catch (IOException e) {
            C1123.m1408("Serializing to a ByteString threw an IOException (should never happen).", e);
            return null;
        }
    }

    public String toString() {
        boolean z = AbstractC4552.f11887;
        boolean z2 = C4548.f11876.f11879;
        try {
            StringBuilder sb = new StringBuilder();
            if (z2) {
                try {
                    sb.append((CharSequence) "");
                } catch (IOException e) {
                    throw new IllegalStateException(e);
                }
            }
            TextFormat$Printer$FieldReporterLevel textFormat$Printer$FieldReporterLevel = TextFormat$Printer$FieldReporterLevel.REPORT_ALL;
            C4548.m8533(this, new C0987(sb, false), z2);
            return sb.toString();
        } catch (IOException e2) {
            C3466.m5897(e2);
            return null;
        }
    }

    public void writeAsMessageSetTo(InterfaceC4560 interfaceC4560) {
        if (this.fields.isEmpty()) {
            return;
        }
        ((C4259) interfaceC4560).getClass();
        Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
        Writer$FieldOrder writer$FieldOrder2 = Writer$FieldOrder.DESCENDING;
        TreeMap<Integer, C4541> treeMap = this.fields;
        if (writer$FieldOrder == writer$FieldOrder2) {
            for (Map.Entry<Integer, C4541> entry : treeMap.descendingMap().entrySet()) {
                C4541.m8521(entry.getValue(), entry.getKey().intValue(), interfaceC4560);
            }
            return;
        }
        for (Map.Entry<Integer, C4541> entry2 : treeMap.entrySet()) {
            C4541.m8521(entry2.getValue(), entry2.getKey().intValue(), interfaceC4560);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        boolean z = AbstractC4294.f11474;
        C4298 c4298 = new C4298(outputStream, 4096);
        c4298.mo8204(getSerializedSize());
        writeTo(c4298);
        if (c4298.f11483 > 0) {
            c4298.m8241();
        }
    }

    @Override // com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if (this.fields.isEmpty()) {
            return;
        }
        for (Map.Entry<Integer, C4541> entry : this.fields.entrySet()) {
            C4541 value = entry.getValue();
            int iIntValue = entry.getKey().intValue();
            int i = 0;
            while (true) {
                C4262 c4262 = value.f11873;
                if (i >= c4262.f11440) {
                    break;
                }
                abstractC4294.mo8207(iIntValue, c4262.m8127(i));
                i++;
            }
            int i2 = 0;
            while (true) {
                C4445 c4445 = value.f11872;
                if (i2 >= c4445.f11597) {
                    break;
                }
                abstractC4294.mo8224(iIntValue, c4445.m8373(i2));
                i2++;
            }
            int i3 = 0;
            while (true) {
                C4262 c42622 = value.f11871;
                if (i3 >= c42622.f11440) {
                    break;
                }
                abstractC4294.mo8212(iIntValue, c42622.m8127(i3));
                i3++;
            }
            for (int i4 = 0; i4 < value.f11870.size(); i4++) {
                abstractC4294.mo8225(iIntValue, (ByteString) value.f11870.get(i4));
            }
            for (int i5 = 0; i5 < value.f11869.size(); i5++) {
                C4536 c4536 = (C4536) value.f11869.get(i5);
                abstractC4294.mo8214(iIntValue, 3);
                c4536.writeTo(abstractC4294);
                abstractC4294.mo8214(iIntValue, 4);
            }
        }
    }

    @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4536 getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public final C4537 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4544 newBuilderForType() {
        return newBuilder();
    }

    public static C4544 newBuilder(C4536 c4536) {
        C4544 c4544NewBuilder = newBuilder();
        c4544NewBuilder.m8530(c4536);
        return c4544NewBuilder;
    }

    public static C4536 parseFrom(ByteString byteString) {
        C4544 c4544NewBuilder = newBuilder();
        c4544NewBuilder.m8525(byteString);
        return c4544NewBuilder.build();
    }

    public static C4536 parseFrom(byte[] bArr) {
        C4544 c4544NewBuilder = newBuilder();
        c4544NewBuilder.m8532(bArr);
        return c4544NewBuilder.build();
    }

    public static C4536 parseFrom(AbstractC4306 abstractC4306) {
        C4544 c4544NewBuilder = newBuilder();
        c4544NewBuilder.m8524(abstractC4306);
        return c4544NewBuilder.build();
    }

    public void writeAsMessageSetTo(AbstractC4294 abstractC4294) {
        if (this.fields.isEmpty()) {
            return;
        }
        for (Map.Entry<Integer, C4541> entry : this.fields.entrySet()) {
            C4541 value = entry.getValue();
            int iIntValue = entry.getKey().intValue();
            for (int i = 0; i < value.f11870.size(); i++) {
                abstractC4294.mo8217(iIntValue, (ByteString) value.f11870.get(i));
            }
        }
    }

    public void writeTo(OutputStream outputStream) {
        boolean z = AbstractC4294.f11474;
        C4298 c4298 = new C4298(outputStream, 4096);
        writeTo(c4298);
        if (c4298.f11483 > 0) {
            c4298.m8241();
        }
    }

    public void writeTo(InterfaceC4560 interfaceC4560) {
        if (this.fields.isEmpty()) {
            return;
        }
        ((C4259) interfaceC4560).getClass();
        Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
        Writer$FieldOrder writer$FieldOrder2 = Writer$FieldOrder.DESCENDING;
        TreeMap<Integer, C4541> treeMap = this.fields;
        if (writer$FieldOrder == writer$FieldOrder2) {
            for (Map.Entry<Integer, C4541> entry : treeMap.descendingMap().entrySet()) {
                entry.getValue().m8522(entry.getKey().intValue(), interfaceC4560);
            }
            return;
        }
        for (Map.Entry<Integer, C4541> entry2 : treeMap.entrySet()) {
            entry2.getValue().m8522(entry2.getKey().intValue(), interfaceC4560);
        }
    }
}

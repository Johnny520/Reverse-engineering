package com.google.protobuf;

import androidx.appcompat.widget.C0140;
import androidx.collection.C0276;
import bsh.C2632;
import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3703 implements InterfaceC3440 {
    private final TreeMap<Integer, C3708> fields;
    private static final C3703 defaultInstance = new C3703(new TreeMap());
    private static final C3704 PARSER = new C3704();

    private C3703(TreeMap<Integer, C3708> treeMap) {
        this.fields = treeMap;
    }

    public static C3703 getDefaultInstance() {
        return defaultInstance;
    }

    public static C3711 newBuilder() {
        C3711 c3711 = new C3711();
        c3711.f11524 = new TreeMap();
        return c3711;
    }

    public static C3703 parseFrom(InputStream inputStream) {
        C3711 c3711NewBuilder = newBuilder();
        c3711NewBuilder.getClass();
        AbstractC3473 abstractC3473M7708 = AbstractC3473.m7708(inputStream);
        c3711NewBuilder.m7978(abstractC3473M7708);
        abstractC3473M7708.mo7725(0);
        return c3711NewBuilder.build();
    }

    public Map<Integer, C3708> asMap() {
        return this.fields.isEmpty() ? Collections.EMPTY_MAP : (Map) this.fields.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3703) && this.fields.equals(((C3703) obj).fields);
    }

    public C3708 getField(int i) {
        C3708 c3708 = this.fields.get(Integer.valueOf(i));
        return c3708 == null ? C3708.f11518 : c3708;
    }

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public int getSerializedSize() {
        if (this.fields.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (Map.Entry<Integer, C3708> entry : this.fields.entrySet()) {
            C3708 value = entry.getValue();
            int iIntValue = entry.getKey().intValue();
            int i2 = 0;
            int serializedSize = 0;
            while (true) {
                C3429 c3429 = value.f11523;
                if (i2 >= c3429.f11090) {
                    break;
                }
                serializedSize += AbstractC3461.m7650(iIntValue, c3429.m7581(i2));
                i2++;
            }
            int i3 = 0;
            while (true) {
                C3612 c3612 = value.f11522;
                if (i3 >= c3612.f11247) {
                    break;
                }
                c3612.m7827(i3);
                serializedSize += AbstractC3461.m7655(iIntValue) + 4;
                i3++;
            }
            int i4 = 0;
            while (true) {
                C3429 c34292 = value.f11521;
                if (i4 >= c34292.f11090) {
                    break;
                }
                c34292.m7581(i4);
                serializedSize += AbstractC3461.m7655(iIntValue) + 8;
                i4++;
            }
            for (int i5 = 0; i5 < value.f11520.size(); i5++) {
                serializedSize += AbstractC3461.m7646(iIntValue, (ByteString) value.f11520.get(i5));
            }
            for (int i6 = 0; i6 < value.f11519.size(); i6++) {
                serializedSize += ((C3703) value.f11519.get(i6)).getSerializedSize() + (AbstractC3461.m7655(iIntValue) * 2);
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
        for (Map.Entry<Integer, C3708> entry : this.fields.entrySet()) {
            C3708 value = entry.getValue();
            int iIntValue = entry.getKey().intValue();
            int iM7646 = 0;
            for (int i2 = 0; i2 < value.f11520.size(); i2++) {
                iM7646 += AbstractC3461.m7646(3, (ByteString) value.f11520.get(i2)) + AbstractC3461.m7649(2, iIntValue) + (AbstractC3461.m7655(1) * 2);
            }
            i += iM7646;
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

    @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
    public boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3711 toBuilder() {
        C3711 c3711NewBuilder = newBuilder();
        c3711NewBuilder.m7984(this);
        return c3711NewBuilder;
    }

    @Override // com.google.protobuf.InterfaceC3440
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            boolean z = AbstractC3461.f11124;
            C3466 c3466 = new C3466(bArr, serializedSize);
            writeTo(c3466);
            c3466.m7674();
            return bArr;
        } catch (IOException e) {
            C0276.m847("Serializing to a byte array threw an IOException (should never happen).", e);
            return null;
        }
    }

    @Override // com.google.protobuf.InterfaceC3440
    public ByteString toByteString() {
        try {
            C3469 c3469NewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            writeTo(c3469NewCodedBuilder.f11145);
            c3469NewCodedBuilder.f11145.m7674();
            return new ByteString.LiteralByteString(c3469NewCodedBuilder.f11144);
        } catch (IOException e) {
            C0276.m847("Serializing to a ByteString threw an IOException (should never happen).", e);
            return null;
        }
    }

    public String toString() {
        boolean z = AbstractC3719.f11537;
        boolean z2 = C3715.f11526.f11529;
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
            C3715.m7987(this, new C0140(sb, false), z2);
            return sb.toString();
        } catch (IOException e2) {
            C2632.m5292(e2);
            return null;
        }
    }

    public void writeAsMessageSetTo(InterfaceC3727 interfaceC3727) {
        if (this.fields.isEmpty()) {
            return;
        }
        ((C3426) interfaceC3727).getClass();
        Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
        Writer$FieldOrder writer$FieldOrder2 = Writer$FieldOrder.DESCENDING;
        TreeMap<Integer, C3708> treeMap = this.fields;
        if (writer$FieldOrder == writer$FieldOrder2) {
            for (Map.Entry<Integer, C3708> entry : treeMap.descendingMap().entrySet()) {
                C3708.m7975(entry.getValue(), entry.getKey().intValue(), interfaceC3727);
            }
            return;
        }
        for (Map.Entry<Integer, C3708> entry2 : treeMap.entrySet()) {
            C3708.m7975(entry2.getValue(), entry2.getKey().intValue(), interfaceC3727);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        boolean z = AbstractC3461.f11124;
        C3465 c3465 = new C3465(outputStream, 4096);
        c3465.mo7658(getSerializedSize());
        writeTo(c3465);
        if (c3465.f11133 > 0) {
            c3465.m7695();
        }
    }

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if (this.fields.isEmpty()) {
            return;
        }
        for (Map.Entry<Integer, C3708> entry : this.fields.entrySet()) {
            C3708 value = entry.getValue();
            int iIntValue = entry.getKey().intValue();
            int i = 0;
            while (true) {
                C3429 c3429 = value.f11523;
                if (i >= c3429.f11090) {
                    break;
                }
                abstractC3461.mo7661(iIntValue, c3429.m7581(i));
                i++;
            }
            int i2 = 0;
            while (true) {
                C3612 c3612 = value.f11522;
                if (i2 >= c3612.f11247) {
                    break;
                }
                abstractC3461.mo7678(iIntValue, c3612.m7827(i2));
                i2++;
            }
            int i3 = 0;
            while (true) {
                C3429 c34292 = value.f11521;
                if (i3 >= c34292.f11090) {
                    break;
                }
                abstractC3461.mo7666(iIntValue, c34292.m7581(i3));
                i3++;
            }
            for (int i4 = 0; i4 < value.f11520.size(); i4++) {
                abstractC3461.mo7679(iIntValue, (ByteString) value.f11520.get(i4));
            }
            for (int i5 = 0; i5 < value.f11519.size(); i5++) {
                C3703 c3703 = (C3703) value.f11519.get(i5);
                abstractC3461.mo7668(iIntValue, 3);
                c3703.writeTo(abstractC3461);
                abstractC3461.mo7668(iIntValue, 4);
            }
        }
    }

    @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3703 getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public final C3704 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3711 newBuilderForType() {
        return newBuilder();
    }

    public static C3711 newBuilder(C3703 c3703) {
        C3711 c3711NewBuilder = newBuilder();
        c3711NewBuilder.m7984(c3703);
        return c3711NewBuilder;
    }

    public static C3703 parseFrom(ByteString byteString) {
        C3711 c3711NewBuilder = newBuilder();
        c3711NewBuilder.m7979(byteString);
        return c3711NewBuilder.build();
    }

    public static C3703 parseFrom(byte[] bArr) {
        C3711 c3711NewBuilder = newBuilder();
        c3711NewBuilder.m7986(bArr);
        return c3711NewBuilder.build();
    }

    public static C3703 parseFrom(AbstractC3473 abstractC3473) {
        C3711 c3711NewBuilder = newBuilder();
        c3711NewBuilder.m7978(abstractC3473);
        return c3711NewBuilder.build();
    }

    public void writeAsMessageSetTo(AbstractC3461 abstractC3461) {
        if (this.fields.isEmpty()) {
            return;
        }
        for (Map.Entry<Integer, C3708> entry : this.fields.entrySet()) {
            C3708 value = entry.getValue();
            int iIntValue = entry.getKey().intValue();
            for (int i = 0; i < value.f11520.size(); i++) {
                abstractC3461.mo7671(iIntValue, (ByteString) value.f11520.get(i));
            }
        }
    }

    public void writeTo(OutputStream outputStream) {
        boolean z = AbstractC3461.f11124;
        C3465 c3465 = new C3465(outputStream, 4096);
        writeTo(c3465);
        if (c3465.f11133 > 0) {
            c3465.m7695();
        }
    }

    public void writeTo(InterfaceC3727 interfaceC3727) {
        if (this.fields.isEmpty()) {
            return;
        }
        ((C3426) interfaceC3727).getClass();
        Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
        Writer$FieldOrder writer$FieldOrder2 = Writer$FieldOrder.DESCENDING;
        TreeMap<Integer, C3708> treeMap = this.fields;
        if (writer$FieldOrder == writer$FieldOrder2) {
            for (Map.Entry<Integer, C3708> entry : treeMap.descendingMap().entrySet()) {
                entry.getValue().m7976(entry.getKey().intValue(), interfaceC3727);
            }
            return;
        }
        for (Map.Entry<Integer, C3708> entry2 : treeMap.entrySet()) {
            entry2.getValue().m7976(entry2.getKey().intValue(), interfaceC3727);
        }
    }
}

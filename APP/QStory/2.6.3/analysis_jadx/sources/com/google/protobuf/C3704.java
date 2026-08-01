package com.google.protobuf;

import androidx.appcompat.widget.C0140;
import androidx.collection.C0276;
import bsh.C2633;
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
public final class C3704 implements InterfaceC3441 {
    private final TreeMap<Integer, C3709> fields;
    private static final C3704 defaultInstance = new C3704(new TreeMap());
    private static final C3705 PARSER = new C3705();

    private C3704(TreeMap<Integer, C3709> treeMap) {
        this.fields = treeMap;
    }

    public static C3704 getDefaultInstance() {
        return defaultInstance;
    }

    public static C3712 newBuilder() {
        C3712 c3712 = new C3712();
        c3712.f11529 = new TreeMap();
        return c3712;
    }

    public static C3704 parseFrom(InputStream inputStream) {
        C3712 c3712NewBuilder = newBuilder();
        c3712NewBuilder.getClass();
        AbstractC3474 abstractC3474M7695 = AbstractC3474.m7695(inputStream);
        c3712NewBuilder.m7965(abstractC3474M7695);
        abstractC3474M7695.mo7712(0);
        return c3712NewBuilder.build();
    }

    public Map<Integer, C3709> asMap() {
        return this.fields.isEmpty() ? Collections.EMPTY_MAP : (Map) this.fields.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3704) && this.fields.equals(((C3704) obj).fields);
    }

    public C3709 getField(int i) {
        C3709 c3709 = this.fields.get(Integer.valueOf(i));
        return c3709 == null ? C3709.f11523 : c3709;
    }

    @Override // com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public int getSerializedSize() {
        if (this.fields.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (Map.Entry<Integer, C3709> entry : this.fields.entrySet()) {
            C3709 value = entry.getValue();
            int iIntValue = entry.getKey().intValue();
            int i2 = 0;
            int serializedSize = 0;
            while (true) {
                C3430 c3430 = value.f11528;
                if (i2 >= c3430.f11095) {
                    break;
                }
                serializedSize += AbstractC3462.m7637(iIntValue, c3430.m7568(i2));
                i2++;
            }
            int i3 = 0;
            while (true) {
                C3613 c3613 = value.f11527;
                if (i3 >= c3613.f11252) {
                    break;
                }
                c3613.m7814(i3);
                serializedSize += AbstractC3462.m7642(iIntValue) + 4;
                i3++;
            }
            int i4 = 0;
            while (true) {
                C3430 c34302 = value.f11526;
                if (i4 >= c34302.f11095) {
                    break;
                }
                c34302.m7568(i4);
                serializedSize += AbstractC3462.m7642(iIntValue) + 8;
                i4++;
            }
            for (int i5 = 0; i5 < value.f11525.size(); i5++) {
                serializedSize += AbstractC3462.m7633(iIntValue, (ByteString) value.f11525.get(i5));
            }
            for (int i6 = 0; i6 < value.f11524.size(); i6++) {
                serializedSize += ((C3704) value.f11524.get(i6)).getSerializedSize() + (AbstractC3462.m7642(iIntValue) * 2);
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
        for (Map.Entry<Integer, C3709> entry : this.fields.entrySet()) {
            C3709 value = entry.getValue();
            int iIntValue = entry.getKey().intValue();
            int iM7633 = 0;
            for (int i2 = 0; i2 < value.f11525.size(); i2++) {
                iM7633 += AbstractC3462.m7633(3, (ByteString) value.f11525.get(i2)) + AbstractC3462.m7636(2, iIntValue) + (AbstractC3462.m7642(1) * 2);
            }
            i += iM7633;
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

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
    public boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3712 toBuilder() {
        C3712 c3712NewBuilder = newBuilder();
        c3712NewBuilder.m7971(this);
        return c3712NewBuilder;
    }

    @Override // com.google.protobuf.InterfaceC3441
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            boolean z = AbstractC3462.f11129;
            C3467 c3467 = new C3467(bArr, serializedSize);
            writeTo(c3467);
            c3467.m7661();
            return bArr;
        } catch (IOException e) {
            C0276.m848("Serializing to a byte array threw an IOException (should never happen).", e);
            return null;
        }
    }

    @Override // com.google.protobuf.InterfaceC3441
    public ByteString toByteString() {
        try {
            C3470 c3470NewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            writeTo(c3470NewCodedBuilder.f11150);
            c3470NewCodedBuilder.f11150.m7661();
            return new ByteString.LiteralByteString(c3470NewCodedBuilder.f11149);
        } catch (IOException e) {
            C0276.m848("Serializing to a ByteString threw an IOException (should never happen).", e);
            return null;
        }
    }

    public String toString() {
        boolean z = AbstractC3720.f11542;
        boolean z2 = C3716.f11531.f11534;
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
            C3716.m7974(this, new C0140(sb, false), z2);
            return sb.toString();
        } catch (IOException e2) {
            C2633.m5337(e2);
            return null;
        }
    }

    public void writeAsMessageSetTo(InterfaceC3728 interfaceC3728) {
        if (this.fields.isEmpty()) {
            return;
        }
        ((C3427) interfaceC3728).getClass();
        Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
        Writer$FieldOrder writer$FieldOrder2 = Writer$FieldOrder.DESCENDING;
        TreeMap<Integer, C3709> treeMap = this.fields;
        if (writer$FieldOrder == writer$FieldOrder2) {
            for (Map.Entry<Integer, C3709> entry : treeMap.descendingMap().entrySet()) {
                C3709.m7962(entry.getValue(), entry.getKey().intValue(), interfaceC3728);
            }
            return;
        }
        for (Map.Entry<Integer, C3709> entry2 : treeMap.entrySet()) {
            C3709.m7962(entry2.getValue(), entry2.getKey().intValue(), interfaceC3728);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        boolean z = AbstractC3462.f11129;
        C3466 c3466 = new C3466(outputStream, 4096);
        c3466.mo7645(getSerializedSize());
        writeTo(c3466);
        if (c3466.f11138 > 0) {
            c3466.m7682();
        }
    }

    @Override // com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        if (this.fields.isEmpty()) {
            return;
        }
        for (Map.Entry<Integer, C3709> entry : this.fields.entrySet()) {
            C3709 value = entry.getValue();
            int iIntValue = entry.getKey().intValue();
            int i = 0;
            while (true) {
                C3430 c3430 = value.f11528;
                if (i >= c3430.f11095) {
                    break;
                }
                abstractC3462.mo7648(iIntValue, c3430.m7568(i));
                i++;
            }
            int i2 = 0;
            while (true) {
                C3613 c3613 = value.f11527;
                if (i2 >= c3613.f11252) {
                    break;
                }
                abstractC3462.mo7665(iIntValue, c3613.m7814(i2));
                i2++;
            }
            int i3 = 0;
            while (true) {
                C3430 c34302 = value.f11526;
                if (i3 >= c34302.f11095) {
                    break;
                }
                abstractC3462.mo7653(iIntValue, c34302.m7568(i3));
                i3++;
            }
            for (int i4 = 0; i4 < value.f11525.size(); i4++) {
                abstractC3462.mo7666(iIntValue, (ByteString) value.f11525.get(i4));
            }
            for (int i5 = 0; i5 < value.f11524.size(); i5++) {
                C3704 c3704 = (C3704) value.f11524.get(i5);
                abstractC3462.mo7655(iIntValue, 3);
                c3704.writeTo(abstractC3462);
                abstractC3462.mo7655(iIntValue, 4);
            }
        }
    }

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3704 getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public final C3705 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3712 newBuilderForType() {
        return newBuilder();
    }

    public static C3712 newBuilder(C3704 c3704) {
        C3712 c3712NewBuilder = newBuilder();
        c3712NewBuilder.m7971(c3704);
        return c3712NewBuilder;
    }

    public static C3704 parseFrom(ByteString byteString) {
        C3712 c3712NewBuilder = newBuilder();
        c3712NewBuilder.m7966(byteString);
        return c3712NewBuilder.build();
    }

    public static C3704 parseFrom(byte[] bArr) {
        C3712 c3712NewBuilder = newBuilder();
        c3712NewBuilder.m7973(bArr);
        return c3712NewBuilder.build();
    }

    public static C3704 parseFrom(AbstractC3474 abstractC3474) {
        C3712 c3712NewBuilder = newBuilder();
        c3712NewBuilder.m7965(abstractC3474);
        return c3712NewBuilder.build();
    }

    public void writeAsMessageSetTo(AbstractC3462 abstractC3462) {
        if (this.fields.isEmpty()) {
            return;
        }
        for (Map.Entry<Integer, C3709> entry : this.fields.entrySet()) {
            C3709 value = entry.getValue();
            int iIntValue = entry.getKey().intValue();
            for (int i = 0; i < value.f11525.size(); i++) {
                abstractC3462.mo7658(iIntValue, (ByteString) value.f11525.get(i));
            }
        }
    }

    public void writeTo(OutputStream outputStream) {
        boolean z = AbstractC3462.f11129;
        C3466 c3466 = new C3466(outputStream, 4096);
        writeTo(c3466);
        if (c3466.f11138 > 0) {
            c3466.m7682();
        }
    }

    public void writeTo(InterfaceC3728 interfaceC3728) {
        if (this.fields.isEmpty()) {
            return;
        }
        ((C3427) interfaceC3728).getClass();
        Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
        Writer$FieldOrder writer$FieldOrder2 = Writer$FieldOrder.DESCENDING;
        TreeMap<Integer, C3709> treeMap = this.fields;
        if (writer$FieldOrder == writer$FieldOrder2) {
            for (Map.Entry<Integer, C3709> entry : treeMap.descendingMap().entrySet()) {
                entry.getValue().m7963(entry.getKey().intValue(), interfaceC3728);
            }
            return;
        }
        for (Map.Entry<Integer, C3709> entry2 : treeMap.entrySet()) {
            entry2.getValue().m7963(entry2.getKey().intValue(), interfaceC3728);
        }
    }
}

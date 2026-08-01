package com.google.protobuf;

import androidx.collection.C0276;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import lin.xposed.hook.javaplugin.C5554;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3712 implements InterfaceC3450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public TreeMap f11529;

    @Override // com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
    public final InterfaceC3441 buildPartial() {
        return build();
    }

    public final Object clone() {
        C3712 c3712NewBuilder = C3704.newBuilder();
        for (Map.Entry entry : this.f11529.entrySet()) {
            c3712NewBuilder.f11529.put((Integer) entry.getKey(), ((C3708) entry.getValue()).clone());
        }
        return c3712NewBuilder;
    }

    @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.InterfaceC3450
    public final InterfaceC3450 mergeFrom(InterfaceC3441 interfaceC3441) {
        if (interfaceC3441 instanceof C3704) {
            m7971((C3704) interfaceC3441);
            return this;
        }
        C5925.m11310("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7965(AbstractC3474 abstractC3474) {
        int iMo7705;
        do {
            iMo7705 = abstractC3474.mo7705();
            if (iMo7705 == 0) {
                return;
            }
        } while (m7967(iMo7705, abstractC3474));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7966(ByteString byteString) {
        try {
            AbstractC3474 abstractC3474NewCodedInput = byteString.newCodedInput();
            m7965(abstractC3474NewCodedInput);
            abstractC3474NewCodedInput.mo7712(0);
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e2) {
            C0276.m848("Reading from a ByteString threw an IOException (should never happen).", e2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m7967(int i, AbstractC3474 abstractC3474) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            C3708 c3708M7969 = m7969(i2);
            long jMo7718 = abstractC3474.mo7718();
            C3709 c3709 = c3708M7969.f11522;
            if (c3709.f11528 == null) {
                c3709.f11528 = new C3430();
            }
            c3708M7969.f11522.f11528.m7566(jMo7718);
            return true;
        }
        if (i3 == 1) {
            C3708 c3708M79692 = m7969(i2);
            long jMo7722 = abstractC3474.mo7722();
            C3709 c37092 = c3708M79692.f11522;
            if (c37092.f11526 == null) {
                c37092.f11526 = new C3430();
            }
            c3708M79692.f11522.f11526.m7566(jMo7722);
            return true;
        }
        if (i3 == 2) {
            m7969(i2).m7961(abstractC3474.mo7719());
            return true;
        }
        if (i3 == 3) {
            C3712 c3712NewBuilder = C3704.newBuilder();
            abstractC3474.mo7713(i2, c3712NewBuilder, C3693.f11492);
            C3708 c3708M79693 = m7969(i2);
            C3704 c3704Build = c3712NewBuilder.build();
            C3709 c37093 = c3708M79693.f11522;
            if (c37093.f11524 == null) {
                c37093.f11524 = new ArrayList();
            }
            c3708M79693.f11522.f11524.add(c3704Build);
            return true;
        }
        if (i3 == 4) {
            if (abstractC3474.f11154 == 0) {
                abstractC3474.mo7712(0);
            }
            return false;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        C3708 c3708M79694 = m7969(i2);
        int iMo7721 = abstractC3474.mo7721();
        C3709 c37094 = c3708M79694.f11522;
        if (c37094.f11527 == null) {
            c37094.f11527 = new C3613();
        }
        c3708M79694.f11522.f11527.m7812(iMo7721);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7968(int i, C3709 c3709) {
        TreeMap treeMap = this.f11529;
        if (i <= 0) {
            C5554.m10869(i, " is not a valid field number.");
            return;
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            m7969(i).m7958(c3709);
            return;
        }
        if (i <= 0) {
            C5554.m10869(i, " is not a valid field number.");
            return;
        }
        Integer numValueOf = Integer.valueOf(i);
        C3709 c37092 = C3709.f11523;
        C3708 c3708 = new C3708();
        c3708.m7958(c3709);
        treeMap.put(numValueOf, c3708);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3708 m7969(int i) {
        TreeMap treeMap = this.f11529;
        if (i == 0) {
            return null;
        }
        C3708 c3708 = (C3708) treeMap.get(Integer.valueOf(i));
        if (c3708 != null) {
            return c3708;
        }
        C3709 c3709 = C3709.f11523;
        C3708 c37082 = new C3708();
        treeMap.put(Integer.valueOf(i), c37082);
        return c37082;
    }

    @Override // com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3704 build() {
        TreeMap treeMap = this.f11529;
        if (treeMap.isEmpty()) {
            return C3704.getDefaultInstance();
        }
        TreeMap treeMap2 = new TreeMap();
        for (Map.Entry entry : treeMap.entrySet()) {
            treeMap2.put((Integer) entry.getKey(), ((C3708) entry.getValue()).m7960());
        }
        return new C3704(treeMap2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m7971(C3704 c3704) {
        if (c3704 != C3704.getDefaultInstance()) {
            for (Map.Entry entry : c3704.fields.entrySet()) {
                m7968(((Integer) entry.getKey()).intValue(), (C3709) entry.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m7972(int i, int i2) {
        if (i <= 0) {
            C5554.m10869(i, " is not a valid field number.");
            return;
        }
        C3708 c3708M7969 = m7969(i);
        long j = i2;
        C3709 c3709 = c3708M7969.f11522;
        if (c3709.f11528 == null) {
            c3709.f11528 = new C3430();
        }
        c3708M7969.f11522.f11528.m7566(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m7973(byte[] bArr) {
        try {
            CodedInputStream$VarintExperiment codedInputStream$VarintExperiment = AbstractC3474.f11152;
            AbstractC3477 abstractC3477M7694 = AbstractC3474.m7694(bArr, 0, bArr.length, false);
            m7965(abstractC3477M7694);
            abstractC3477M7694.mo7712(0);
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e2) {
            C0276.m848("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    @Override // com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
    public final InterfaceC3450 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        m7965(abstractC3474);
        return this;
    }

    @Override // com.google.protobuf.InterfaceC3450
    public final InterfaceC3450 mergeFrom(ByteString byteString, C3697 c3697) {
        m7966(byteString);
        return this;
    }

    @Override // com.google.protobuf.InterfaceC3450
    public final /* bridge */ /* synthetic */ InterfaceC3450 mergeFrom(byte[] bArr) {
        m7973(bArr);
        return this;
    }
}

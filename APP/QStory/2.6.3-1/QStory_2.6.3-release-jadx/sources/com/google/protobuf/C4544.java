package com.google.protobuf;

import androidx.collection.C1123;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import lin.xposed.hook.javaplugin.C6385;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4544 implements InterfaceC4282 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public TreeMap f11874;

    @Override // com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
    public final InterfaceC4273 buildPartial() {
        return build();
    }

    public final Object clone() {
        C4544 c4544NewBuilder = C4536.newBuilder();
        for (Map.Entry entry : this.f11874.entrySet()) {
            c4544NewBuilder.f11874.put((Integer) entry.getKey(), ((C4540) entry.getValue()).clone());
        }
        return c4544NewBuilder;
    }

    @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.InterfaceC4282
    public final InterfaceC4282 mergeFrom(InterfaceC4273 interfaceC4273) {
        if (interfaceC4273 instanceof C4536) {
            m8530((C4536) interfaceC4273);
            return this;
        }
        C6755.m11869("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m8524(AbstractC4306 abstractC4306) {
        int iMo8264;
        do {
            iMo8264 = abstractC4306.mo8264();
            if (iMo8264 == 0) {
                return;
            }
        } while (m8526(iMo8264, abstractC4306));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8525(ByteString byteString) {
        try {
            AbstractC4306 abstractC4306NewCodedInput = byteString.newCodedInput();
            m8524(abstractC4306NewCodedInput);
            abstractC4306NewCodedInput.mo8271(0);
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e2) {
            C1123.m1408("Reading from a ByteString threw an IOException (should never happen).", e2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m8526(int i, AbstractC4306 abstractC4306) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            C4540 c4540M8528 = m8528(i2);
            long jMo8277 = abstractC4306.mo8277();
            C4541 c4541 = c4540M8528.f11867;
            if (c4541.f11873 == null) {
                c4541.f11873 = new C4262();
            }
            c4540M8528.f11867.f11873.m8125(jMo8277);
            return true;
        }
        if (i3 == 1) {
            C4540 c4540M85282 = m8528(i2);
            long jMo8281 = abstractC4306.mo8281();
            C4541 c45412 = c4540M85282.f11867;
            if (c45412.f11871 == null) {
                c45412.f11871 = new C4262();
            }
            c4540M85282.f11867.f11871.m8125(jMo8281);
            return true;
        }
        if (i3 == 2) {
            m8528(i2).m8520(abstractC4306.mo8278());
            return true;
        }
        if (i3 == 3) {
            C4544 c4544NewBuilder = C4536.newBuilder();
            abstractC4306.mo8272(i2, c4544NewBuilder, C4525.f11837);
            C4540 c4540M85283 = m8528(i2);
            C4536 c4536Build = c4544NewBuilder.build();
            C4541 c45413 = c4540M85283.f11867;
            if (c45413.f11869 == null) {
                c45413.f11869 = new ArrayList();
            }
            c4540M85283.f11867.f11869.add(c4536Build);
            return true;
        }
        if (i3 == 4) {
            if (abstractC4306.f11499 == 0) {
                abstractC4306.mo8271(0);
            }
            return false;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        C4540 c4540M85284 = m8528(i2);
        int iMo8280 = abstractC4306.mo8280();
        C4541 c45414 = c4540M85284.f11867;
        if (c45414.f11872 == null) {
            c45414.f11872 = new C4445();
        }
        c4540M85284.f11867.f11872.m8371(iMo8280);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m8527(int i, C4541 c4541) {
        TreeMap treeMap = this.f11874;
        if (i <= 0) {
            C6385.m11428(i, " is not a valid field number.");
            return;
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            m8528(i).m8517(c4541);
            return;
        }
        if (i <= 0) {
            C6385.m11428(i, " is not a valid field number.");
            return;
        }
        Integer numValueOf = Integer.valueOf(i);
        C4541 c45412 = C4541.f11868;
        C4540 c4540 = new C4540();
        c4540.m8517(c4541);
        treeMap.put(numValueOf, c4540);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4540 m8528(int i) {
        TreeMap treeMap = this.f11874;
        if (i == 0) {
            return null;
        }
        C4540 c4540 = (C4540) treeMap.get(Integer.valueOf(i));
        if (c4540 != null) {
            return c4540;
        }
        C4541 c4541 = C4541.f11868;
        C4540 c45402 = new C4540();
        treeMap.put(Integer.valueOf(i), c45402);
        return c45402;
    }

    @Override // com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C4536 build() {
        TreeMap treeMap = this.f11874;
        if (treeMap.isEmpty()) {
            return C4536.getDefaultInstance();
        }
        TreeMap treeMap2 = new TreeMap();
        for (Map.Entry entry : treeMap.entrySet()) {
            treeMap2.put((Integer) entry.getKey(), ((C4540) entry.getValue()).m8519());
        }
        return new C4536(treeMap2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m8530(C4536 c4536) {
        if (c4536 != C4536.getDefaultInstance()) {
            for (Map.Entry entry : c4536.fields.entrySet()) {
                m8527(((Integer) entry.getKey()).intValue(), (C4541) entry.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m8531(int i, int i2) {
        if (i <= 0) {
            C6385.m11428(i, " is not a valid field number.");
            return;
        }
        C4540 c4540M8528 = m8528(i);
        long j = i2;
        C4541 c4541 = c4540M8528.f11867;
        if (c4541.f11873 == null) {
            c4541.f11873 = new C4262();
        }
        c4540M8528.f11867.f11873.m8125(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m8532(byte[] bArr) {
        try {
            CodedInputStream$VarintExperiment codedInputStream$VarintExperiment = AbstractC4306.f11497;
            AbstractC4309 abstractC4309M8253 = AbstractC4306.m8253(bArr, 0, bArr.length, false);
            m8524(abstractC4309M8253);
            abstractC4309M8253.mo8271(0);
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e2) {
            C1123.m1408("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    @Override // com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
    public final InterfaceC4282 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        m8524(abstractC4306);
        return this;
    }

    @Override // com.google.protobuf.InterfaceC4282
    public final InterfaceC4282 mergeFrom(ByteString byteString, C4529 c4529) {
        m8525(byteString);
        return this;
    }

    @Override // com.google.protobuf.InterfaceC4282
    public final /* bridge */ /* synthetic */ InterfaceC4282 mergeFrom(byte[] bArr) {
        m8532(bArr);
        return this;
    }
}

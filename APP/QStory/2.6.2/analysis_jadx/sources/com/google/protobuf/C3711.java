package com.google.protobuf;

import androidx.collection.C0276;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import lin.xposed.hook.javaplugin.C5553;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3711 implements InterfaceC3449 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public TreeMap f11524;

    @Override // com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
    public final InterfaceC3440 buildPartial() {
        return build();
    }

    public final Object clone() {
        C3711 c3711NewBuilder = C3703.newBuilder();
        for (Map.Entry entry : this.f11524.entrySet()) {
            c3711NewBuilder.f11524.put((Integer) entry.getKey(), ((C3707) entry.getValue()).clone());
        }
        return c3711NewBuilder;
    }

    @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.InterfaceC3449
    public final InterfaceC3449 mergeFrom(InterfaceC3440 interfaceC3440) {
        if (interfaceC3440 instanceof C3703) {
            m7984((C3703) interfaceC3440);
            return this;
        }
        C5919.m11249("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7978(AbstractC3473 abstractC3473) {
        int iMo7718;
        do {
            iMo7718 = abstractC3473.mo7718();
            if (iMo7718 == 0) {
                return;
            }
        } while (m7980(iMo7718, abstractC3473));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7979(ByteString byteString) {
        try {
            AbstractC3473 abstractC3473NewCodedInput = byteString.newCodedInput();
            m7978(abstractC3473NewCodedInput);
            abstractC3473NewCodedInput.mo7725(0);
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e2) {
            C0276.m847("Reading from a ByteString threw an IOException (should never happen).", e2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m7980(int i, AbstractC3473 abstractC3473) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            C3707 c3707M7982 = m7982(i2);
            long jMo7731 = abstractC3473.mo7731();
            C3708 c3708 = c3707M7982.f11517;
            if (c3708.f11523 == null) {
                c3708.f11523 = new C3429();
            }
            c3707M7982.f11517.f11523.m7579(jMo7731);
            return true;
        }
        if (i3 == 1) {
            C3707 c3707M79822 = m7982(i2);
            long jMo7735 = abstractC3473.mo7735();
            C3708 c37082 = c3707M79822.f11517;
            if (c37082.f11521 == null) {
                c37082.f11521 = new C3429();
            }
            c3707M79822.f11517.f11521.m7579(jMo7735);
            return true;
        }
        if (i3 == 2) {
            m7982(i2).m7974(abstractC3473.mo7732());
            return true;
        }
        if (i3 == 3) {
            C3711 c3711NewBuilder = C3703.newBuilder();
            abstractC3473.mo7726(i2, c3711NewBuilder, C3692.f11487);
            C3707 c3707M79823 = m7982(i2);
            C3703 c3703Build = c3711NewBuilder.build();
            C3708 c37083 = c3707M79823.f11517;
            if (c37083.f11519 == null) {
                c37083.f11519 = new ArrayList();
            }
            c3707M79823.f11517.f11519.add(c3703Build);
            return true;
        }
        if (i3 == 4) {
            if (abstractC3473.f11149 == 0) {
                abstractC3473.mo7725(0);
            }
            return false;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        C3707 c3707M79824 = m7982(i2);
        int iMo7734 = abstractC3473.mo7734();
        C3708 c37084 = c3707M79824.f11517;
        if (c37084.f11522 == null) {
            c37084.f11522 = new C3612();
        }
        c3707M79824.f11517.f11522.m7825(iMo7734);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7981(int i, C3708 c3708) {
        TreeMap treeMap = this.f11524;
        if (i <= 0) {
            C5553.m10812(i, " is not a valid field number.");
            return;
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            m7982(i).m7971(c3708);
            return;
        }
        if (i <= 0) {
            C5553.m10812(i, " is not a valid field number.");
            return;
        }
        Integer numValueOf = Integer.valueOf(i);
        C3708 c37082 = C3708.f11518;
        C3707 c3707 = new C3707();
        c3707.m7971(c3708);
        treeMap.put(numValueOf, c3707);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3707 m7982(int i) {
        TreeMap treeMap = this.f11524;
        if (i == 0) {
            return null;
        }
        C3707 c3707 = (C3707) treeMap.get(Integer.valueOf(i));
        if (c3707 != null) {
            return c3707;
        }
        C3708 c3708 = C3708.f11518;
        C3707 c37072 = new C3707();
        treeMap.put(Integer.valueOf(i), c37072);
        return c37072;
    }

    @Override // com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3703 build() {
        TreeMap treeMap = this.f11524;
        if (treeMap.isEmpty()) {
            return C3703.getDefaultInstance();
        }
        TreeMap treeMap2 = new TreeMap();
        for (Map.Entry entry : treeMap.entrySet()) {
            treeMap2.put((Integer) entry.getKey(), ((C3707) entry.getValue()).m7973());
        }
        return new C3703(treeMap2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m7984(C3703 c3703) {
        if (c3703 != C3703.getDefaultInstance()) {
            for (Map.Entry entry : c3703.fields.entrySet()) {
                m7981(((Integer) entry.getKey()).intValue(), (C3708) entry.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m7985(int i, int i2) {
        if (i <= 0) {
            C5553.m10812(i, " is not a valid field number.");
            return;
        }
        C3707 c3707M7982 = m7982(i);
        long j = i2;
        C3708 c3708 = c3707M7982.f11517;
        if (c3708.f11523 == null) {
            c3708.f11523 = new C3429();
        }
        c3707M7982.f11517.f11523.m7579(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m7986(byte[] bArr) {
        try {
            CodedInputStream$VarintExperiment codedInputStream$VarintExperiment = AbstractC3473.f11147;
            AbstractC3476 abstractC3476M7707 = AbstractC3473.m7707(bArr, 0, bArr.length, false);
            m7978(abstractC3476M7707);
            abstractC3476M7707.mo7725(0);
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e2) {
            C0276.m847("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    @Override // com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
    public final InterfaceC3449 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        m7978(abstractC3473);
        return this;
    }

    @Override // com.google.protobuf.InterfaceC3449
    public final InterfaceC3449 mergeFrom(ByteString byteString, C3696 c3696) {
        m7979(byteString);
        return this;
    }

    @Override // com.google.protobuf.InterfaceC3449
    public final /* bridge */ /* synthetic */ InterfaceC3449 mergeFrom(byte[] bArr) {
        m7986(bArr);
        return this;
    }
}

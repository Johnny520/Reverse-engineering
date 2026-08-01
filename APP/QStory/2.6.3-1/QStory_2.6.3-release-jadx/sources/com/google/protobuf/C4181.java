package com.google.protobuf;

import bsh.C3466;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.C5529;
import kotlin.reflect.jvm.internal.impl.protobuf.C5551;
import p308.C9369;
import p308.C9386;
import p308.C9387;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰楪子哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4181 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f11332;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f11333;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f11334;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11335;

    public C4181(C5529 c5529) {
        this.f11335 = 1;
        C4244 c4244 = new C4244(c5529);
        this.f11334 = c4244;
        this.f11332 = new C5551(c4244.m8072());
        this.f11333 = c5529.f14097;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11335) {
            case 0:
                int i = this.f11333;
                if ((i > 0 && i <= ((C4182) this.f11332).f11340) || m7961().hasNext()) {
                    break;
                }
                break;
            case 1:
                if (this.f11333 > 0) {
                }
                break;
            default:
                if (this.f11333 < ((C9387) this.f11332).f24234.f24184.f24190) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f11335) {
            case 0:
                if (m7961().hasNext()) {
                    return (Map.Entry) m7961().next();
                }
                Object[] objArr = ((C4182) this.f11332).f11342;
                int i = this.f11333 - 1;
                this.f11333 = i;
                return (C4183) objArr[i];
            case 1:
                if (!((C5551) this.f11332).hasNext()) {
                    this.f11332 = new C5551(((C4244) this.f11334).m8072());
                }
                this.f11333--;
                return Byte.valueOf(((C5551) this.f11332).m9968());
            default:
                if (!hasNext()) {
                    C3466.m5896();
                    return null;
                }
                this.f11333++;
                C9386 c9386 = (C9386) this.f11334;
                ByteBuffer byteBuffer = c9386.f24227;
                return new C9369(c9386.f24225, byteBuffer.position(), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f11335) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Iterator m7961() {
        if (((Iterator) this.f11334) == null) {
            this.f11334 = ((C4182) this.f11332).f11339.entrySet().iterator();
        }
        return (Iterator) this.f11334;
    }

    public C4181(C4182 c4182) {
        this.f11335 = 0;
        this.f11332 = c4182;
        this.f11333 = c4182.f11340;
    }

    public C4181(C9387 c9387) {
        this.f11335 = 2;
        this.f11332 = c9387;
        this.f11334 = c9387.m14692(c9387.f24234.f24184.f24191);
        this.f11333 = 0;
    }
}

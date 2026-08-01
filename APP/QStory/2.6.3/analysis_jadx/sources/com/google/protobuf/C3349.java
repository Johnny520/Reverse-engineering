package com.google.protobuf;

import bsh.C2633;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.C4697;
import kotlin.reflect.jvm.internal.impl.protobuf.C4719;
import p292.C8540;
import p292.C8557;
import p292.C8558;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰楪子哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3349 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f10987;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f10988;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f10989;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f10990;

    public C3349(C4697 c4697) {
        this.f10990 = 1;
        C3412 c3412 = new C3412(c4697);
        this.f10989 = c3412;
        this.f10987 = new C4719(c3412.m7513());
        this.f10988 = c4697.f13752;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f10990) {
            case 0:
                int i = this.f10988;
                if ((i > 0 && i <= ((C3350) this.f10987).f10995) || m7402().hasNext()) {
                    break;
                }
                break;
            case 1:
                if (this.f10988 > 0) {
                }
                break;
            default:
                if (this.f10988 < ((C8558) this.f10987).f23889.f23839.f23845) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f10990) {
            case 0:
                if (m7402().hasNext()) {
                    return (Map.Entry) m7402().next();
                }
                Object[] objArr = ((C3350) this.f10987).f10997;
                int i = this.f10988 - 1;
                this.f10988 = i;
                return (C3351) objArr[i];
            case 1:
                if (!((C4719) this.f10987).hasNext()) {
                    this.f10987 = new C4719(((C3412) this.f10989).m7513());
                }
                this.f10988--;
                return Byte.valueOf(((C4719) this.f10987).m9409());
            default:
                if (!hasNext()) {
                    C2633.m5336();
                    return null;
                }
                this.f10988++;
                C8557 c8557 = (C8557) this.f10989;
                ByteBuffer byteBuffer = c8557.f23882;
                return new C8540(c8557.f23880, byteBuffer.position(), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f10990) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Iterator m7402() {
        if (((Iterator) this.f10989) == null) {
            this.f10989 = ((C3350) this.f10987).f10994.entrySet().iterator();
        }
        return (Iterator) this.f10989;
    }

    public C3349(C3350 c3350) {
        this.f10990 = 0;
        this.f10987 = c3350;
        this.f10988 = c3350.f10995;
    }

    public C3349(C8558 c8558) {
        this.f10990 = 2;
        this.f10987 = c8558;
        this.f10989 = c8558.m14133(c8558.f23889.f23839.f23846);
        this.f10988 = 0;
    }
}

package com.google.protobuf;

import bsh.C2632;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.C4696;
import kotlin.reflect.jvm.internal.impl.protobuf.C4718;
import p292.C8548;
import p292.C8565;
import p292.C8566;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰楪子哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3348 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f10982;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f10983;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f10984;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f10985;

    public C3348(C4696 c4696) {
        this.f10985 = 1;
        C3411 c3411 = new C3411(c4696);
        this.f10984 = c3411;
        this.f10982 = new C4718(c3411.m7526());
        this.f10983 = c4696.f13748;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f10985) {
            case 0:
                int i = this.f10983;
                if ((i > 0 && i <= ((C3349) this.f10982).f10990) || m7415().hasNext()) {
                    break;
                }
                break;
            case 1:
                if (this.f10983 > 0) {
                }
                break;
            default:
                if (this.f10983 < ((C8566) this.f10982).f23898.f23848.f23854) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f10985) {
            case 0:
                if (m7415().hasNext()) {
                    return (Map.Entry) m7415().next();
                }
                Object[] objArr = ((C3349) this.f10982).f10992;
                int i = this.f10983 - 1;
                this.f10983 = i;
                return (C3350) objArr[i];
            case 1:
                if (!((C4718) this.f10982).hasNext()) {
                    this.f10982 = new C4718(((C3411) this.f10984).m7526());
                }
                this.f10983--;
                return Byte.valueOf(((C4718) this.f10982).m9419());
            default:
                if (!hasNext()) {
                    C2632.m5291();
                    return null;
                }
                this.f10983++;
                C8565 c8565 = (C8565) this.f10984;
                ByteBuffer byteBuffer = c8565.f23891;
                return new C8548(c8565.f23889, byteBuffer.position(), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f10985) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Iterator m7415() {
        if (((Iterator) this.f10984) == null) {
            this.f10984 = ((C3349) this.f10982).f10989.entrySet().iterator();
        }
        return (Iterator) this.f10984;
    }

    public C3348(C3349 c3349) {
        this.f10985 = 0;
        this.f10982 = c3349;
        this.f10983 = c3349.f10990;
    }

    public C3348(C8566 c8566) {
        this.f10985 = 2;
        this.f10982 = c8566;
        this.f10984 = c8566.m14114(c8566.f23898.f23848.f23855);
        this.f10983 = 0;
    }
}

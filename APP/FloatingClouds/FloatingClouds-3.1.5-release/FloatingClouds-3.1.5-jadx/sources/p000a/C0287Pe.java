package p000a;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: a.Pe */
/* JADX INFO: loaded from: classes.dex */
public class C0287Pe {

    /* JADX INFO: renamed from: a */
    public int f980a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f981b;

    /* JADX INFO: renamed from: c */
    public int f982c;

    /* JADX INFO: renamed from: d */
    public int f983d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0486ag f984e;

    public C0287Pe() {
        if (AbstractC0486ag.f1813a == null) {
            AbstractC0486ag.f1813a = new C0505bg();
        }
        this.f984e = AbstractC0486ag.f1813a;
    }

    /* JADX INFO: renamed from: a */
    public final int m779a(int i) {
        return this.f981b.getInt(i) + i;
    }

    /* JADX INFO: renamed from: b */
    public final int m780b(int i) {
        if (i < this.f983d) {
            return this.f981b.getShort(this.f982c + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m781c(int i, ByteBuffer byteBuffer) {
        this.f981b = byteBuffer;
        if (byteBuffer == null) {
            this.f980a = 0;
            this.f982c = 0;
            this.f983d = 0;
        } else {
            this.f980a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f982c = i2;
            this.f983d = this.f981b.getShort(i2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m782d(int i) {
        ByteBuffer byteBuffer = this.f981b;
        int i2 = byteBuffer.getInt(i) + i;
        int i3 = byteBuffer.getInt(i2);
        return this.f984e.mo1173a(byteBuffer, i2 + 4, i3);
    }

    /* JADX INFO: renamed from: e */
    public final int m783e(int i) {
        int i2 = i + this.f980a;
        return this.f981b.getInt(i2) + i2 + 4;
    }

    /* JADX INFO: renamed from: f */
    public final int m784f(int i) {
        int i2 = i + this.f980a;
        return this.f981b.getInt(this.f981b.getInt(i2) + i2);
    }
}

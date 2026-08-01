package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes2.dex */
public class Struct {

    /* JADX INFO: renamed from: bb */
    protected java.nio.ByteBuffer f37bb;
    protected int bb_pos;

    public Struct() {
            r0 = this;
            r0.<init>()
            return
    }

    public void __reset() {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.__reset(r0, r1)
            return
    }

    protected void __reset(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            r1.f37bb = r3
            java.nio.ByteBuffer r0 = r1.f37bb
            if (r0 == 0) goto L9
            r1.bb_pos = r2
            goto Lc
        L9:
            r0 = 0
            r1.bb_pos = r0
        Lc:
            return
    }
}

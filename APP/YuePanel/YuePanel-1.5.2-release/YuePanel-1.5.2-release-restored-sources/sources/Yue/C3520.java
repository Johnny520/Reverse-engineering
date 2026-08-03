package Yue;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3520 {

    /* JADX INFO: renamed from: ۥ */
    public int f355;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f356;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f5948;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public ByteBuffer f5949;

    /* JADX INFO: renamed from: ۥ */
    public int m583(int i) {
        return this.f355 + (i * this.f5948);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m584(int i, int i2, ByteBuffer byteBuffer) {
        this.f5949 = byteBuffer;
        if (byteBuffer != null) {
            this.f355 = i;
            this.f356 = byteBuffer.getInt(i - 4);
            this.f5948 = i2;
        } else {
            this.f355 = 0;
            this.f356 = 0;
            this.f5948 = 0;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m9438() {
        return this.f355;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m9439() {
        return this.f356;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m9440() {
        m584(0, 0, null);
    }
}

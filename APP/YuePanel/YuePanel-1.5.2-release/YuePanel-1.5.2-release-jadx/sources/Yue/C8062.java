package Yue;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥۢۢۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.3")
public final class C8062 implements Iterator<C8057>, InterfaceC5591 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int f23943;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f23944;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f23945;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f23946;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 int), (r2v0 int), (r3v0 int) A[MD:(int, int, int):void (m)] (LINE:1) call: Yue.ۥۢۢۦۨ.<init>(int, int, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C8062(int i, int i2, int i3, C4335 c4335) {
        this(i, i2, i3);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23944;
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ C8057 next() {
        return C8057.m26313(m4090());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: ۥ */
    public int m4090() {
        int i = this.f23946;
        if (i != this.f23943) {
            this.f23946 = C8057.m26318(this.f23945 + i);
        } else {
            if (!this.f23944) {
                throw new NoSuchElementException();
            }
            this.f23944 = false;
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8062(int i, int i2, int i3) {
        this.f23943 = i2;
        boolean z = false;
        int iCompareUnsigned = Integer.compareUnsigned(i, i2);
        if (i3 <= 0 ? iCompareUnsigned >= 0 : iCompareUnsigned <= 0) {
            z = true;
        }
        this.f23944 = z;
        this.f23945 = C8057.m26318(i3);
        this.f23946 = this.f23944 ? i : i2;
    }
}

package Yue;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥۢۢۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.3")
public final class C8069 implements Iterator<C8064>, InterfaceC5591 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final long f23962;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f23963;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final long f23964;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public long f23965;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 long), (r3v0 long), (r5v0 long) A[MD:(long, long, long):void (m)] (LINE:1) call: Yue.ۥۢۢۧۤ.<init>(long, long, long):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C8069(long j, long j2, long j3, C4335 c4335) {
        this(j, j2, j3);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23963;
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ C8064 next() {
        return C8064.m26403(m4101());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: ۥ */
    public long m4101() {
        long j = this.f23965;
        if (j != this.f23962) {
            this.f23965 = C8064.m26408(this.f23964 + j);
        } else {
            if (!this.f23963) {
                throw new NoSuchElementException();
            }
            this.f23963 = false;
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8069(long j, long j2, long j3) {
        this.f23962 = j2;
        boolean z = false;
        if (j3 <= 0 ? Long.compareUnsigned(j, j2) >= 0 : Long.compareUnsigned(j, j2) <= 0) {
            z = true;
        }
        this.f23963 = z;
        this.f23964 = C8064.m26408(j3);
        this.f23965 = this.f23963 ? j : j2;
    }
}

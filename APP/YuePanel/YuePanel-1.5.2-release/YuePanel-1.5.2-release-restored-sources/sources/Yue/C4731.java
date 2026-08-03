package Yue;

import java.nio.file.FileSystemException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4731 {

    /* JADX INFO: renamed from: ۥ */
    public final int f1082;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f1083;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final List<Exception> f10172;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public Path f10173;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4731() {
        this(0, 1, null);
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m1648(@InterfaceC6399 Exception exc) {
        C5499.m17103(exc, "exception");
        this.f1083++;
        if (this.f10172.size() < this.f1082) {
            if (this.f10173 != null) {
                Throwable thInitCause = new FileSystemException(String.valueOf(this.f10173)).initCause(exc);
                C5499.m17101(thInitCause, "null cannot be cast to non-null type java.nio.file.FileSystemException");
                exc = (FileSystemException) thInitCause;
            }
            this.f10172.add(exc);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m1649(@InterfaceC6399 Path path) {
        C5499.m17103(path, "name");
        Path path2 = this.f10173;
        this.f10173 = path2 != null ? path2.resolve(path) : null;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m14247(@InterfaceC6399 Path path) {
        C5499.m17103(path, "name");
        Path path2 = this.f10173;
        if (!C5499.m17094(path, path2 != null ? path2.getFileName() : null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Path path3 = this.f10173;
        this.f10173 = path3 != null ? path3.getParent() : null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final List<Exception> m14248() {
        return this.f10172;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Path m14249() {
        return this.f10173;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m14250() {
        return this.f1083;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m14251(@InterfaceC6489 Path path) {
        this.f10173 = path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4731(int i) {
        this.f1082 = i;
        this.f10172 = new ArrayList();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (64 int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:4) call: Yue.ۥ۠ۡۢۤ.<init>(int):void type: THIS */
    public /* synthetic */ C4731(int i, int i2, C4335 c4335) {
        this((i2 & 1) != 0 ? 64 : i);
    }
}

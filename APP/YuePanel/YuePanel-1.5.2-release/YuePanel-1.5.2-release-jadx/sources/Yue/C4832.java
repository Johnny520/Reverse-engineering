package Yue;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: renamed from: Yue.ۥ۠ۢ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4771
public final class C4832 implements InterfaceC4831 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6489
    public InterfaceC5138<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f1150;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6489
    public InterfaceC5138<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f1151;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public InterfaceC5138<? super Path, ? super IOException, ? extends FileVisitResult> f10892;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public InterfaceC5138<? super Path, ? super IOException, ? extends FileVisitResult> f10893;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f10894;

    @Override // Yue.InterfaceC4831
    /* JADX INFO: renamed from: ۥ */
    public void mo1740(@InterfaceC6399 InterfaceC5138<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> interfaceC5138) {
        C5499.m17103(interfaceC5138, "function");
        m14703();
        m14704(this.f1150, "onPreVisitDirectory");
        this.f1150 = interfaceC5138;
    }

    @Override // Yue.InterfaceC4831
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo1741(@InterfaceC6399 InterfaceC5138<? super Path, ? super IOException, ? extends FileVisitResult> interfaceC5138) {
        C5499.m17103(interfaceC5138, "function");
        m14703();
        m14704(this.f10893, "onPostVisitDirectory");
        this.f10893 = interfaceC5138;
    }

    @Override // Yue.InterfaceC4831
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo14700(@InterfaceC6399 InterfaceC5138<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> interfaceC5138) {
        C5499.m17103(interfaceC5138, "function");
        m14703();
        m14704(this.f1151, "onVisitFile");
        this.f1151 = interfaceC5138;
    }

    @Override // Yue.InterfaceC4831
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo14701(@InterfaceC6399 InterfaceC5138<? super Path, ? super IOException, ? extends FileVisitResult> interfaceC5138) {
        C5499.m17103(interfaceC5138, "function");
        m14703();
        m14704(this.f10892, "onVisitFileFailed");
        this.f10892 = interfaceC5138;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final FileVisitor<Path> m14702() {
        m14703();
        this.f10894 = true;
        return new C4833(this.f1150, this.f1151, this.f10892, this.f10893);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m14703() {
        if (this.f10894) {
            throw new IllegalStateException("This builder was already built");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m14704(Object obj, String str) {
        if (obj == null) {
            return;
        }
        throw new IllegalStateException(str + " was already defined");
    }
}

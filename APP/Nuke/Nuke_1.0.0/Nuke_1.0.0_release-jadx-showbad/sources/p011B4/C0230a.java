package p011B4;

import java.io.Serializable;
import java.util.Queue;
import p005A4.InterfaceC0162b;
import p017C4.C0250e;

/* JADX INFO: renamed from: B4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0230a implements InterfaceC0162b, Serializable {

    /* JADX INFO: renamed from: d */
    public C0250e f781d;

    /* JADX INFO: renamed from: e */
    public Queue f782e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p005A4.InterfaceC0162b
    /* JADX INFO: renamed from: a */
    public final boolean mo229a() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p005A4.InterfaceC0162b
    /* JADX INFO: renamed from: b */
    public final boolean mo230b() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p005A4.InterfaceC0162b
    /* JADX INFO: renamed from: c */
    public final void mo231c(String str, Throwable th) {
        m389i(2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p005A4.InterfaceC0162b
    /* JADX INFO: renamed from: d */
    public final boolean mo232d() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p005A4.InterfaceC0162b
    /* JADX INFO: renamed from: f */
    public final boolean mo234f() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p005A4.InterfaceC0162b
    /* JADX INFO: renamed from: g */
    public final void mo235g(String str) {
        m389i(4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p005A4.InterfaceC0162b
    /* JADX INFO: renamed from: h */
    public final boolean mo236h() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m389i(int i5) {
        C0232c c0232c = new C0232c();
        System.currentTimeMillis();
        c0232c.f783a = i5;
        c0232c.f784b = this.f781d;
        Thread.currentThread().getName();
        this.f782e.add(c0232c);
    }
}

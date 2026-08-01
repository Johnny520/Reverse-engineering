package p004C;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: C.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0063g implements InterfaceC0065i {

    /* JADX INFO: renamed from: b */
    public final InputContentInfo f306b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0063g(Object obj) {
        this.f306b = (InputContentInfo) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p004C.InterfaceC0065i
    /* JADX INFO: renamed from: a */
    public final ClipDescription mo109a() {
        return this.f306b.getDescription();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p004C.InterfaceC0065i
    /* JADX INFO: renamed from: b */
    public final void mo110b() {
        this.f306b.requestPermission();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p004C.InterfaceC0065i
    /* JADX INFO: renamed from: c */
    public final Uri mo111c() {
        return this.f306b.getLinkUri();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p004C.InterfaceC0065i
    /* JADX INFO: renamed from: d */
    public final Object mo112d() {
        return this.f306b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p004C.InterfaceC0065i
    /* JADX INFO: renamed from: e */
    public final Uri mo113e() {
        return this.f306b.getContentUri();
    }

    public C0063g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f306b = new InputContentInfo(uri, clipDescription, uri2);
    }
}

package p000;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: Xo */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1019Xo implements InterfaceC2541tc {

    /* JADX INFO: renamed from: a */
    public final boolean f3227a;

    /* JADX INFO: renamed from: b */
    public final Uri f3228b;

    /* JADX INFO: renamed from: c */
    public final ContentResolver f3229c;

    /* JADX INFO: renamed from: d */
    public Object f3230d;

    public AbstractC1019Xo(ContentResolver contentResolver, Uri uri, boolean z) {
        this.f3229c = contentResolver;
        this.f3228b = uri;
        this.f3227a = z;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo1623b(Object obj);

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: c */
    public final void mo914c() {
        Object obj = this.f3230d;
        if (obj != null) {
            try {
                mo1623b(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // p000.InterfaceC2541tc
    public final void cancel() {
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: d */
    public final void mo915d(EnumC2688wu enumC2688wu, InterfaceC2498sc interfaceC2498sc) {
        try {
            Object objMo1624e = mo1624e(this.f3229c, this.f3228b);
            this.f3230d = objMo1624e;
            interfaceC2498sc.mo638e(objMo1624e);
        } catch (FileNotFoundException e) {
            interfaceC2498sc.mo635b(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract Object mo1624e(ContentResolver contentResolver, Uri uri);

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: f */
    public final int mo916f() {
        return 1;
    }
}

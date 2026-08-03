package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: mh */
/* JADX INFO: loaded from: classes.dex */
public final class C2237mh implements InterfaceC2541tc {

    /* JADX INFO: renamed from: a */
    public final String f7884a;

    /* JADX INFO: renamed from: b */
    public final AssetManager f7885b;

    /* JADX INFO: renamed from: c */
    public Object f7886c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7887d;

    public C2237mh(AssetManager assetManager, String str, int i) {
        this.f7887d = i;
        this.f7885b = assetManager;
        this.f7884a = str;
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: a */
    public final Class mo912a() {
        switch (this.f7887d) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: c */
    public final void mo914c() {
        Object obj = this.f7886c;
        if (obj == null) {
            return;
        }
        try {
            switch (this.f7887d) {
                case 0:
                    ((AssetFileDescriptor) obj).close();
                    break;
                default:
                    ((InputStream) obj).close();
                    break;
            }
        } catch (IOException unused) {
        }
    }

    @Override // p000.InterfaceC2541tc
    public final void cancel() {
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: d */
    public final void mo915d(EnumC2688wu enumC2688wu, InterfaceC2498sc interfaceC2498sc) {
        Object objOpenFd;
        try {
            AssetManager assetManager = this.f7885b;
            String str = this.f7884a;
            switch (this.f7887d) {
                case 0:
                    objOpenFd = assetManager.openFd(str);
                    break;
                default:
                    objOpenFd = assetManager.open(str);
                    break;
            }
            this.f7886c = objOpenFd;
            interfaceC2498sc.mo638e(objOpenFd);
        } catch (IOException e) {
            interfaceC2498sc.mo635b(e);
        }
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: f */
    public final int mo916f() {
        return 1;
    }
}

package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: Td */
/* JADX INFO: loaded from: classes.dex */
public final class C0836Td implements InterfaceC2541tc {

    /* JADX INFO: renamed from: a */
    public final Resources.Theme f2660a;

    /* JADX INFO: renamed from: b */
    public final Resources f2661b;

    /* JADX INFO: renamed from: c */
    public final C0793Sd f2662c;

    /* JADX INFO: renamed from: d */
    public final int f2663d;

    /* JADX INFO: renamed from: e */
    public Object f2664e;

    public C0836Td(Resources.Theme theme, Resources resources, C0793Sd c0793Sd, int i) {
        this.f2660a = theme;
        this.f2661b = resources;
        this.f2662c = c0793Sd;
        this.f2663d = i;
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: a */
    public final Class mo912a() {
        switch (this.f2662c.f2492a) {
            case 0:
                return AssetFileDescriptor.class;
            case 1:
                return Drawable.class;
            default:
                return InputStream.class;
        }
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: c */
    public final void mo914c() {
        Object obj = this.f2664e;
        if (obj != null) {
            try {
                switch (this.f2662c.f2492a) {
                    case 0:
                        ((AssetFileDescriptor) obj).close();
                        break;
                    case 1:
                        break;
                    default:
                        ((InputStream) obj).close();
                        break;
                }
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
        Object objOpenRawResourceFd;
        try {
            C0793Sd c0793Sd = this.f2662c;
            Resources.Theme theme = this.f2660a;
            Resources resources = this.f2661b;
            int i = this.f2663d;
            switch (c0793Sd.f2492a) {
                case 0:
                    objOpenRawResourceFd = resources.openRawResourceFd(i);
                    break;
                case 1:
                    Context context = c0793Sd.f2493b;
                    objOpenRawResourceFd = AbstractC0148Dc.m277k(context, context, i, theme);
                    break;
                default:
                    objOpenRawResourceFd = resources.openRawResource(i);
                    break;
            }
            this.f2664e = objOpenRawResourceFd;
            interfaceC2498sc.mo638e(objOpenRawResourceFd);
        } catch (Resources.NotFoundException e) {
            interfaceC2498sc.mo635b(e);
        }
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: f */
    public final int mo916f() {
        return 1;
    }
}

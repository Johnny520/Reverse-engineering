package yyds;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: yyds.ᲀᲁᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2082 implements InterfaceC0724 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C1483 f10329;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public Object f10330;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Resources.Theme f10331;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final int f10332;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Resources f10333;

    public C2082(Resources.Theme theme, Resources resources, C1483 c1483, int i) {
        this.f10331 = theme;
        this.f10333 = resources;
        this.f10329 = c1483;
        this.f10332 = i;
    }

    @Override // yyds.InterfaceC0724
    public final void cancel() {
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Class mo417() {
        switch (this.f10329.f7020) {
            case 0:
                return AssetFileDescriptor.class;
            case 1:
                return Drawable.class;
            default:
                return InputStream.class;
        }
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo512() {
        Object obj = this.f10330;
        if (obj != null) {
            try {
                switch (this.f10329.f7020) {
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

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final int mo513() {
        return 1;
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo514(EnumC0296 enumC0296, InterfaceC0306 interfaceC0306) {
        Object objOpenRawResourceFd;
        try {
            C1483 c1483 = this.f10329;
            Resources.Theme theme = this.f10331;
            Resources resources = this.f10333;
            int i = this.f10332;
            switch (c1483.f7020) {
                case 0:
                    objOpenRawResourceFd = resources.openRawResourceFd(i);
                    break;
                case 1:
                    Context context = c1483.f7021;
                    objOpenRawResourceFd = AbstractC1544.m3184(context, context, i, theme);
                    break;
                default:
                    objOpenRawResourceFd = resources.openRawResource(i);
                    break;
            }
            this.f10330 = objOpenRawResourceFd;
            interfaceC0306.mo546(objOpenRawResourceFd);
        } catch (Resources.NotFoundException e) {
            interfaceC0306.mo567(e);
        }
    }
}

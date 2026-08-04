package yyds;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: yyds.ᲁᛴᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2224 implements InterfaceC0724 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f10986;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Object f10987;

    public /* synthetic */ C2224(int i, Object obj) {
        this.f10986 = i;
        this.f10987 = obj;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    private final void m4219() {
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    private final void m4220() {
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    private final void m4221() {
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    private final void m4222() {
    }

    @Override // yyds.InterfaceC0724
    public final void cancel() {
        int i = this.f10986;
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Class mo417() {
        switch (this.f10986) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f10987.getClass();
        }
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo512() {
        int i = this.f10986;
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final int mo513() {
        switch (this.f10986) {
        }
        return 1;
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo514(EnumC0296 enumC0296, InterfaceC0306 interfaceC0306) {
        int i = this.f10986;
        Object obj = this.f10987;
        switch (i) {
            case 0:
                try {
                    interfaceC0306.mo546(AbstractC0282.m929((File) obj));
                } catch (IOException e) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                    }
                    interfaceC0306.mo567(e);
                    return;
                }
                break;
            default:
                interfaceC0306.mo546(obj);
                break;
        }
    }
}

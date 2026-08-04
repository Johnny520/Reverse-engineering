package yyds;

import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲀᛸᛶᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2052 implements InterfaceC2266 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f10191;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f10192 = 2;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0937 f10193;

    public /* synthetic */ C2052(C0937 c0937, int i, int i2) {
        this.f10193 = c0937;
        this.f10191 = i;
    }

    @Override // yyds.InterfaceC2266
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Object mo731() {
        switch (this.f10192) {
            case 0:
                C0937 c0937 = this.f10193;
                int i = this.f10191;
                c0937.f4296.getClass();
                try {
                    c0937.f4318.m920(i, 9);
                    synchronized (c0937) {
                        c0937.f4297.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return C2746.f13459;
            case 1:
                C0937 c09372 = this.f10193;
                int i2 = this.f10191;
                c09372.f4296.getClass();
                try {
                    c09372.f4318.m920(i2, 9);
                    synchronized (c09372) {
                        c09372.f4297.remove(Integer.valueOf(i2));
                    }
                } catch (IOException unused2) {
                }
                return C2746.f13459;
            default:
                C0937 c09373 = this.f10193;
                int i3 = this.f10191;
                c09373.f4296.getClass();
                synchronized (c09373) {
                    c09373.f4297.remove(Integer.valueOf(i3));
                }
                return C2746.f13459;
        }
    }

    public /* synthetic */ C2052(C0937 c0937, int i, List list) {
        this.f10193 = c0937;
        this.f10191 = i;
    }

    public /* synthetic */ C2052(C0937 c0937, int i, List list, boolean z) {
        this.f10193 = c0937;
        this.f10191 = i;
    }
}

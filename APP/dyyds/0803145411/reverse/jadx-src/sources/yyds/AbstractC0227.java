package yyds;

import java.io.Serializable;

/* JADX INFO: renamed from: yyds.ᛱᲁᲈᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0227 implements InterfaceC2418, Serializable {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final boolean f1243;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Class f1244;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final String f1245;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public transient InterfaceC2418 f1246;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final String f1247;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Object f1248;

    public AbstractC0227(Object obj, Class cls, String str, String str2, boolean z) {
        this.f1248 = obj;
        this.f1244 = cls;
        this.f1247 = str;
        this.f1245 = str2;
        this.f1243 = z;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public abstract InterfaceC2418 mo880();

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final InterfaceC2786 m883() {
        boolean z = this.f1243;
        Class cls = this.f1244;
        if (!z) {
            return AbstractC1700.m3448(cls);
        }
        AbstractC1700.f8634.getClass();
        return new C2096(cls);
    }
}

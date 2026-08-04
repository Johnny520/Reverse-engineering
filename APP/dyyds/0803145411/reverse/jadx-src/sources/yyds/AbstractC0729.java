package yyds;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: yyds.ᛳᲇᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0729 implements InterfaceC2768 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object f3409;

    public AbstractC0729(int i) {
        switch (i) {
            case 1:
                this.f3409 = new LinkedHashMap();
                break;
            default:
                this.f3409 = new ArrayDeque(20);
                break;
        }
    }

    @Override // yyds.InterfaceC2768
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public InterfaceC0894 mo382(C0644 c0644) {
        return new C0455(2, (InterfaceC0790) this.f3409);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public void m1677(InterfaceC1490 interfaceC1490) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f3409;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(interfaceC1490);
        }
    }

    public AbstractC0729(InterfaceC0790 interfaceC0790) {
        this.f3409 = interfaceC0790;
    }
}

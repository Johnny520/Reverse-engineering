package yyds;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲇᲈᲁᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2572 extends ContextWrapper {

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final C1561 f12661 = new C1561();

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public C1261 f12662;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C1505 f12663;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2267 f12664;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C0716 f12665;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C0052 f12666;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0135 f12667;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C2620 f12668;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final List f12669;

    public C2572(Context context, C2267 c2267, C1424 c1424, C0135 c0135, C0805 c0805, C1505 c1505, List list, C2620 c2620, C0052 c0052) {
        super(context.getApplicationContext());
        this.f12664 = c2267;
        this.f12667 = c0135;
        this.f12669 = list;
        this.f12663 = c1505;
        this.f12668 = c2620;
        this.f12666 = c0052;
        this.f12665 = new C0716(c1424);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C1578 m4645() {
        return (C1578) this.f12665.get();
    }
}

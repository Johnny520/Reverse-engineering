package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ad implements zc, bd {
    public final /* synthetic */ int a;
    public Object b;
    public int c;
    public int d;
    public Object e;
    public Cloneable f;

    public /* synthetic */ ad() {
        this.a = 0;
    }

    public void a(wc0 r2, List r3) {
        Iterator r22 = r3.iterator();
    L4:
        if (r22.hasNext() == false) goto L12;
        gc0 r32 = (gc0) r22.next();
        if ((r32.a.c() & 8) == 0) goto L4;
        ((View) this.e).setTranslationY(q2.c(r32.a.b(), this.d, 0));
        return;
    }

    @Override // defpackage.bd
    public ClipData b() {
        return (ClipData) this.b;
    }

    @Override // defpackage.zc
    public cd build() {
        return new cd(new ad(this));
    }

    @Override // defpackage.bd
    public int f() {
        return this.d;
    }

    @Override // defpackage.bd
    public ContentInfo h() {
        return null;
    }

    @Override // defpackage.zc
    public void m(Uri r1) {
        this.e = r1;
    }

    @Override // defpackage.bd
    public int o() {
        return this.c;
    }

    @Override // defpackage.zc
    public void s(int r1) {
        this.d = r1;
    }

    @Override // defpackage.zc
    public void setExtras(Bundle r1) {
        this.f = r1;
    }

    public String toString() {
        switch(this.a) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        Uri r0 = (Uri) this.e;
        StringBuilder r1 = new StringBuilder("ContentInfoCompat{clip=");
        r1.append(((ClipData) this.b).getDescription());
        r1.append(", source=");
        int r2 = this.c;
        if (r2 != 0) goto L9;
        String r22 = "SOURCE_APP";
    L25:
        r1.append(r22);
        r1.append(", flags=");
        int r23 = this.d;
        if ((r23 & 1) == 0) goto L28;
        String r24 = "FLAG_CONVERT_TO_PLAIN_TEXT";
    L29:
        r1.append(r24);
        String r25 = "";
        if (r0 != null) goto L32;
        String r02 = "";
    L33:
        r1.append(r02);
        if (((Bundle) this.f) == null) goto L38;
        r25 = ", hasExtras";
    L38:
        return z30.l(r1, r25, "}");
    L32:
        r02 = ", hasLinkUri(" + r0.toString().length() + ")";
        goto L33
    L28:
        r24 = String.valueOf(r23);
        goto L29
    L9:
        if (r2 != 1) goto L11;
        r22 = "SOURCE_CLIPBOARD";
        goto L25
    L11:
        if (r2 != 2) goto L13;
        r22 = "SOURCE_INPUT_METHOD";
        goto L25
    L13:
        if (r2 != 3) goto L15;
        r22 = "SOURCE_DRAG_AND_DROP";
        goto L25
    L15:
        if (r2 != 4) goto L17;
        r22 = "SOURCE_AUTOFILL";
        goto L25
    L17:
        if (r2 == 5) goto L19;
        r22 = String.valueOf(r2);
        goto L25
    L19:
        r22 = "SOURCE_PROCESS_TEXT";
        goto L25
    L5:
        return super.toString();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int[], java.lang.Cloneable] */
    public ad(View r2) {
        this.a = 2;
        this.f = new int[2];
        this.e = r2;
    }

    public ad(ad r4) {
        this.a = 1;
        ClipData r0 = (ClipData) r4.b;
        r0.getClass();
        this.b = r0;
        int r02 = r4.c;
        if (r02 >= 0) goto L5;
        Locale r03 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
    L5:
        if (r02 > 5) goto L12;
        this.c = r02;
        int r04 = r4.d;
        if ((r04 & 1) != r04) goto L11;
        this.d = r04;
        this.e = (Uri) r4.e;
        this.f = (Bundle) r4.f;
        return;
    L11:
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(r04) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    L12:
        Locale r05 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}

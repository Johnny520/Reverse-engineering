package p006D;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p060h0.AbstractC0945a;

/* JADX INFO: renamed from: D.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0099f implements InterfaceC0097e, InterfaceC0101g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f257a;

    /* JADX INFO: renamed from: b */
    public Object f258b;

    /* JADX INFO: renamed from: c */
    public int f259c;

    /* JADX INFO: renamed from: d */
    public int f260d;

    /* JADX INFO: renamed from: e */
    public Object f261e;

    /* JADX INFO: renamed from: f */
    public Cloneable f262f;

    public /* synthetic */ C0099f() {
        this.f257a = 0;
    }

    /* JADX INFO: renamed from: a */
    public void m360a(C0122q0 r2, List r3) {
        Iterator r22 = r3.iterator();
    L4:
        if (r22.hasNext() == false) goto L12;
        C0096d0 r32 = (C0096d0) r22.next();
        if ((r32.f252a.mo322c() & 8) == 0) goto L4;
        ((View) this.f261e).setTranslationY(AbstractC0945a.m2277c(this.f260d, 0, r32.f252a.mo321b()));
        return;
    }

    @Override // p006D.InterfaceC0097e
    /* JADX INFO: renamed from: b */
    public void mo340b(Bundle r1) {
        this.f262f = r1;
    }

    @Override // p006D.InterfaceC0097e
    /* JADX INFO: renamed from: e */
    public void mo342e(Uri r1) {
        this.f261e = r1;
    }

    @Override // p006D.InterfaceC0101g
    /* JADX INFO: renamed from: f */
    public int mo343f() {
        return this.f259c;
    }

    @Override // p006D.InterfaceC0101g
    /* JADX INFO: renamed from: h */
    public ClipData mo344h() {
        return (ClipData) this.f258b;
    }

    @Override // p006D.InterfaceC0097e
    /* JADX INFO: renamed from: m */
    public C0103h mo347m() {
        return new C0103h(new C0099f(this));
    }

    @Override // p006D.InterfaceC0101g
    /* JADX INFO: renamed from: q */
    public int mo351q() {
        return this.f260d;
    }

    @Override // p006D.InterfaceC0101g
    /* JADX INFO: renamed from: t */
    public ContentInfo mo354t() {
        return null;
    }

    public String toString() {
        switch(this.f257a) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        StringBuilder r02 = new StringBuilder("ContentInfoCompat{clip=");
        r02.append(((ClipData) this.f258b).getDescription());
        r02.append(", source=");
        int r1 = this.f259c;
        if (r1 != 0) goto L9;
        String r12 = "SOURCE_APP";
    L25:
        r02.append(r12);
        r02.append(", flags=");
        int r13 = this.f260d;
        if ((r13 & 1) == 0) goto L28;
        String r14 = "FLAG_CONVERT_TO_PLAIN_TEXT";
    L29:
        r02.append(r14);
        String r15 = "";
        Uri r2 = (Uri) this.f261e;
        if (r2 != null) goto L32;
        String r22 = "";
    L33:
        r02.append(r22);
        if (((Bundle) this.f262f) == null) goto L37;
        r15 = ", hasExtras";
    L37:
        r02.append(r15);
        r02.append("}");
        return r02.toString();
    L32:
        r22 = ", hasLinkUri(" + r2.toString().length() + ")";
        goto L33
    L28:
        r14 = String.valueOf(r13);
        goto L29
    L9:
        if (r1 != 1) goto L11;
        r12 = "SOURCE_CLIPBOARD";
        goto L25
    L11:
        if (r1 != 2) goto L13;
        r12 = "SOURCE_INPUT_METHOD";
        goto L25
    L13:
        if (r1 != 3) goto L15;
        r12 = "SOURCE_DRAG_AND_DROP";
        goto L25
    L15:
        if (r1 != 4) goto L17;
        r12 = "SOURCE_AUTOFILL";
        goto L25
    L17:
        if (r1 == 5) goto L19;
        r12 = String.valueOf(r1);
        goto L25
    L19:
        r12 = "SOURCE_PROCESS_TEXT";
        goto L25
    L5:
        return super.toString();
    }

    @Override // p006D.InterfaceC0097e
    /* JADX INFO: renamed from: w */
    public void mo357w(int r1) {
        this.f260d = r1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C0099f(View r2) {
        this.f257a = 2;
        this.f262f = new int[2];
        this.f261e = r2;
    }

    public C0099f(C0099f r4) {
        this.f257a = 1;
        ClipData r02 = (ClipData) r4.f258b;
        r02.getClass();
        this.f258b = r02;
        int r03 = r4.f259c;
        if (r03 >= 0) goto L5;
        Locale r04 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
    L5:
        if (r03 > 5) goto L12;
        this.f259c = r03;
        int r05 = r4.f260d;
        if ((r05 & 1) != r05) goto L11;
        this.f260d = r05;
        this.f261e = (Uri) r4.f261e;
        this.f262f = (Bundle) r4.f262f;
        return;
    L11:
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(r05) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    L12:
        Locale r06 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}

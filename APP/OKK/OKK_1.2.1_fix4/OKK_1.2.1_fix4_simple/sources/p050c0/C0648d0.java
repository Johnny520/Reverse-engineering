package p050c0;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: c0.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0648d0 extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2014b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0651e0 f2015c;

    public C0648d0(int r1) {
        this.f2014b = r1;
        switch(r1) {
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        this.f2015c = C0651e0.f2022a;
        return;
    L6:
        this.f2015c = C0651e0.f2022a;
        return;
    L8:
        this.f2015c = C0651e0.f2022a;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public final void mo1386b(C0760b r12) {
        String r02 = null;
        C0651e0 r3 = this.f2015c;
        switch(this.f2014b) {
            case 0: goto L112;
            case 1: goto L117;
            default: goto L115;
        };
    L115:
        r3.getClass();     // Catch: Throwable -> L17
        if (C0651e0.m1633b() == false) goto L119;
        Object[] r32 = r12.f2670c;     // Catch: Throwable -> L17
        AbstractC0307g.m702d(r32, "args");     // Catch: Throwable -> L17
        Object r2 = AbstractC0179j.m537n0(1, r32);     // Catch: Throwable -> L17
        if (r2 == null) goto L120;
        String r22 = r2.toString();     // Catch: Throwable -> L17
        if (r22 == null) goto L121;
        String r23 = C0651e0.m1632a(r22);     // Catch: Throwable -> L17
        if (r23 == null) goto L122;
        r12.f2670c[1] = r23;     // Catch: Throwable -> L17
        C0651e0.m1636e("Toast.makeText rewritten: ".concat(r23));     // Catch: Throwable -> L17
        return;
    L122:
        return;
    L121:
        return;
    L120:
        return;
    L119:
        return;
    L17:
        th = move-exception;
        AbstractC0040p.m116u(th);
        return;
    L117:
        r3.getClass();     // Catch: Throwable -> L27
        if (C0651e0.m1633b() == false) goto L124;
        Object[] r33 = r12.f2670c;     // Catch: Throwable -> L27
        AbstractC0307g.m702d(r33, "args");     // Catch: Throwable -> L27
        Object r24 = AbstractC0179j.m537n0(1, r33);     // Catch: Throwable -> L27
        if ((r24 instanceof String) == false) goto L29;
        r02 = (String) r24;     // Catch: Throwable -> L27
    L29:
        if (r02 == null) goto L125;
        String r03 = C0651e0.m1632a(r02);     // Catch: Throwable -> L27
        if (r03 == null) goto L126;
        r12.f2670c[1] = r03;     // Catch: Throwable -> L27
        C0651e0.m1636e("ExportFileUtil toast rewritten: ".concat(r03));     // Catch: Throwable -> L27
        return;
    L126:
        return;
    L125:
        return;
    L124:
        return;
    L27:
        th = move-exception;
        AbstractC0040p.m116u(th);
        return;
    L112:
        r3.getClass();     // Catch: Throwable -> L44
        if (C0651e0.m1633b() == false) goto L128;
        Object[] r7 = r12.f2670c;     // Catch: Throwable -> L44
        AbstractC0307g.m702d(r7, "args");     // Catch: Throwable -> L44
        Object r72 = AbstractC0179j.m537n0(0, r7);     // Catch: Throwable -> L44
        if ((r72 instanceof Context) == false) goto L46;
        Context r73 = (Context) r72;     // Catch: Throwable -> L44
    L47:
        if (r73 == null) goto L129;
        Object[] r8 = r12.f2670c;     // Catch: Throwable -> L44
        AbstractC0307g.m702d(r8, "args");     // Catch: Throwable -> L44
        Object r1 = AbstractC0179j.m537n0(1, r8);     // Catch: Throwable -> L44
        if ((r1 instanceof String) == false) goto L52;
        String r13 = (String) r1;     // Catch: Throwable -> L44
    L53:
        if (r13 == null) goto L130;
        Object[] r82 = r12.f2670c;     // Catch: Throwable -> L44
        AbstractC0307g.m702d(r82, "args");     // Catch: Throwable -> L44
        Object r25 = AbstractC0179j.m537n0(2, r82);     // Catch: Throwable -> L44
        if ((r25 instanceof String) == false) goto L58;
        String r26 = (String) r25;     // Catch: Throwable -> L44
    L59:
        if (r26 == null) goto L131;
        Object r83 = "";
        C0661h1 r9 = C0661h1.f2048a;     // Catch: Throwable -> L64
        Object r92 = C0661h1.m1662d("download_redirect_tree_uri", "");     // Catch: Throwable -> L64
    L67:
        if ((r92 instanceof C0140f) == true) goto L70;
        r83 = r92;
    L70:
        String r84 = (String) r83;     // Catch: Throwable -> L44
        if (AbstractC0425j.m1013R0(r84) == false) goto L73;
        C0651e0.m1636e("No tree URI configured, falling back to original logic.");     // Catch: Throwable -> L44
        return;
    L73:
        Uri r85 = Uri.parse(r84);     // Catch: Throwable -> L44
        String r27 = new File(r26).getName();     // Catch: Throwable -> L44
        C0651e0.m1636e("Attempting SAF copy: " + r13 + " -> " + r85 + " / " + r27);     // Catch: Throwable -> L44
        File r6 = new File(r13);     // Catch: Throwable -> L44
        if (r6.exists() == true) goto L76;
        C0651e0.m1636e("Source file does not exist: ".concat(r13));     // Catch: Throwable -> L44
        return;
    L76:
        Uri r14 = DocumentsContract.createDocument(r73.getContentResolver(), DocumentsContract.buildDocumentUriUsingTree(r85, DocumentsContract.getTreeDocumentId(r85)), "*/*", r27);     // Catch: Throwable -> L44
        if (r14 != null) goto L79;
        C0651e0.m1636e("Failed to create document in SAF directory");     // Catch: Throwable -> L44
        return;
    L79:
        OutputStream r28 = r73.getContentResolver().openOutputStream(r14);     // Catch: Throwable -> L44
        if (r28 != null) goto L107;
    L98:
        C0651e0.m1636e("SAF copy successful! Saved to " + r14);     // Catch: Throwable -> L44
        r12.m1946c(Boolean.TRUE);     // Catch: Throwable -> L44
        Object r122 = C0146l.f339a;     // Catch: Throwable -> L44
    L101:
        Throwable r123 = AbstractC0141g.m465a(r122);
        if (r123 == null) goto L135;
        StringWriter r04 = new StringWriter();
        PrintWriter r15 = new PrintWriter(r04);
        r123.printStackTrace(r15);
        r15.flush();
        String r124 = r04.toString();
        AbstractC0307g.m702d(r124, "toString(...)");
        String r125 = "SAF copy hook failed: ".concat(r124);
        r3.getClass();
        C0651e0.m1636e(r125);
        return;
    L135:
        return;
    L107:
        FileInputStream r5 = new FileInputStream(r6);     // Catch: Throwable -> L87
        AbstractC0040p.m115t(r5, r28, 8192);     // Catch: Throwable -> L89
        AbstractC0040p.m108m(r5, null);     // Catch: Throwable -> L87
        AbstractC0040p.m108m(r28, null);     // Catch: Throwable -> L44
        goto L98
    L89:
        th = move-exception;
        throw th;     // Catch: Throwable -> L91
    L91:
        th = move-exception;
        AbstractC0040p.m108m(r5, th);     // Catch: Throwable -> L87
        throw th;     // Catch: Throwable -> L87
    L87:
        th = move-exception;
        throw th;     // Catch: Throwable -> L95
    L95:
        th = move-exception;
        AbstractC0040p.m108m(r28, th);     // Catch: Throwable -> L44
        throw th;     // Catch: Throwable -> L44
    L64:
        th = move-exception;
        r92 = AbstractC0040p.m116u(th);     // Catch: Throwable -> L44
        goto L67
    L131:
        return;
    L58:
        r26 = null;
        goto L59
    L130:
        return;
    L52:
        r13 = null;
        goto L53
    L129:
        return;
    L46:
        r73 = null;
        goto L47
    L128:
        return;
    L44:
        th = move-exception;
        r122 = AbstractC0040p.m116u(th);
        goto L101
    }
}

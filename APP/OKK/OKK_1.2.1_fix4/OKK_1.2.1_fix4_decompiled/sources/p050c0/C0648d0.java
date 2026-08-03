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

    public C0648d0(int i2) {
        this.f2014b = i2;
        switch (i2) {
            case 1:
                this.f2015c = C0651e0.f2022a;
                break;
            case 2:
                this.f2015c = C0651e0.f2022a;
                break;
            default:
                this.f2015c = C0651e0.f2022a;
                break;
        }
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public final void mo1386b(C0760b c0760b) {
        Object objM116u;
        Object objM116u2;
        String strM1632a;
        String string;
        String strM1632a2;
        C0651e0 c0651e0 = this.f2015c;
        switch (this.f2014b) {
            case 0:
                try {
                    c0651e0.getClass();
                } catch (Throwable th) {
                    objM116u = AbstractC0040p.m116u(th);
                }
                if (C0651e0.m1633b()) {
                    Object[] objArr = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr, "args");
                    Object objM537n0 = AbstractC0179j.m537n0(0, objArr);
                    Context context = objM537n0 instanceof Context ? (Context) objM537n0 : null;
                    if (context == null) {
                        return;
                    }
                    Object[] objArr2 = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr2, "args");
                    Object objM537n02 = AbstractC0179j.m537n0(1, objArr2);
                    String str = objM537n02 instanceof String ? (String) objM537n02 : null;
                    if (str == null) {
                        return;
                    }
                    Object[] objArr3 = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr3, "args");
                    Object objM537n03 = AbstractC0179j.m537n0(2, objArr3);
                    String str2 = objM537n03 instanceof String ? (String) objM537n03 : null;
                    if (str2 == null) {
                        return;
                    }
                    Object obj = "";
                    try {
                        C0661h1 c0661h1 = C0661h1.f2048a;
                        objM116u2 = C0661h1.m1662d("download_redirect_tree_uri", "");
                        break;
                    } catch (Throwable th2) {
                        objM116u2 = AbstractC0040p.m116u(th2);
                    }
                    if (!(objM116u2 instanceof C0140f)) {
                        obj = objM116u2;
                    }
                    String str3 = (String) obj;
                    if (AbstractC0425j.m1013R0(str3)) {
                        C0651e0.m1636e("No tree URI configured, falling back to original logic.");
                        return;
                    }
                    Uri uri = Uri.parse(str3);
                    String name = new File(str2).getName();
                    C0651e0.m1636e("Attempting SAF copy: " + str + " -> " + uri + " / " + name);
                    File file = new File(str);
                    if (!file.exists()) {
                        C0651e0.m1636e("Source file does not exist: ".concat(str));
                        return;
                    }
                    Uri uriCreateDocument = DocumentsContract.createDocument(context.getContentResolver(), DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)), "*/*", name);
                    if (uriCreateDocument == null) {
                        C0651e0.m1636e("Failed to create document in SAF directory");
                        return;
                    }
                    OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriCreateDocument);
                    if (outputStreamOpenOutputStream != null) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            try {
                                AbstractC0040p.m115t(fileInputStream, outputStreamOpenOutputStream, 8192);
                                AbstractC0040p.m108m(fileInputStream, null);
                                AbstractC0040p.m108m(outputStreamOpenOutputStream, null);
                            } finally {
                            }
                        } finally {
                        }
                    }
                    C0651e0.m1636e("SAF copy successful! Saved to " + uriCreateDocument);
                    c0760b.m1946c(Boolean.TRUE);
                    objM116u = C0146l.f339a;
                    Throwable thM465a = AbstractC0141g.m465a(objM116u);
                    if (thM465a != null) {
                        StringWriter stringWriter = new StringWriter();
                        PrintWriter printWriter = new PrintWriter(stringWriter);
                        thM465a.printStackTrace(printWriter);
                        printWriter.flush();
                        String string2 = stringWriter.toString();
                        AbstractC0307g.m702d(string2, "toString(...)");
                        String strConcat = "SAF copy hook failed: ".concat(string2);
                        c0651e0.getClass();
                        C0651e0.m1636e(strConcat);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                try {
                    c0651e0.getClass();
                    if (C0651e0.m1633b()) {
                        Object[] objArr4 = c0760b.f2670c;
                        AbstractC0307g.m702d(objArr4, "args");
                        Object objM537n04 = AbstractC0179j.m537n0(1, objArr4);
                        String str4 = objM537n04 instanceof String ? (String) objM537n04 : null;
                        if (str4 == null || (strM1632a = C0651e0.m1632a(str4)) == null) {
                            return;
                        }
                        c0760b.f2670c[1] = strM1632a;
                        C0651e0.m1636e("ExportFileUtil toast rewritten: ".concat(strM1632a));
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    AbstractC0040p.m116u(th3);
                    return;
                }
            default:
                try {
                    c0651e0.getClass();
                    if (C0651e0.m1633b()) {
                        Object[] objArr5 = c0760b.f2670c;
                        AbstractC0307g.m702d(objArr5, "args");
                        Object objM537n05 = AbstractC0179j.m537n0(1, objArr5);
                        if (objM537n05 == null || (string = objM537n05.toString()) == null || (strM1632a2 = C0651e0.m1632a(string)) == null) {
                            return;
                        }
                        c0760b.f2670c[1] = strM1632a2;
                        C0651e0.m1636e("Toast.makeText rewritten: ".concat(strM1632a2));
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    AbstractC0040p.m116u(th4);
                    return;
                }
        }
    }
}

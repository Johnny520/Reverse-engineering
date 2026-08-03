package Yue;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(19)
public class C7471 extends AbstractC4485 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Context f22618;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Uri f22619;

    public C7471(@InterfaceC6490 AbstractC4485 abstractC4485, Context context, Uri uri) {
        super(abstractC4485);
        this.f22618 = context;
        this.f22619 = uri;
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ */
    public boolean mo1408() {
        return C4487.m1410(this.f22618, this.f22619);
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo1409() {
        return C4487.m1411(this.f22618, this.f22619);
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟ */
    public AbstractC4485 mo13034(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public AbstractC4485 mo13035(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public boolean mo13036() {
        try {
            return DocumentsContract.deleteDocument(this.f22618.getContentResolver(), this.f22619);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo13037() {
        return C4487.m13057(this.f22618, this.f22619);
    }

    @Override // Yue.AbstractC4485
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public String mo13039() {
        return C4487.m13059(this.f22618, this.f22619);
    }

    @Override // Yue.AbstractC4485
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public String mo13041() {
        return C4487.m13061(this.f22618, this.f22619);
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public Uri mo13042() {
        return this.f22619;
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public boolean mo13043() {
        return C4487.m13062(this.f22618, this.f22619);
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public boolean mo13044() {
        return C4487.m13063(this.f22618, this.f22619);
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public boolean mo13045() {
        return C4487.m13064(this.f22618, this.f22619);
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public long mo13046() {
        return C4487.m13065(this.f22618, this.f22619);
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public long mo13047() {
        return C4487.m13066(this.f22618, this.f22619);
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public AbstractC4485[] mo13048() {
        throw new UnsupportedOperationException();
    }

    @Override // Yue.AbstractC4485
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public boolean mo13049(String str) {
        throw new UnsupportedOperationException();
    }
}

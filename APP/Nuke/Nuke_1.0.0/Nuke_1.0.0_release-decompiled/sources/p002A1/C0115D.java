package p002A1;

import android.graphics.Bitmap;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p000A.C0072l0;
import p001A0.C0102b;
import p005A4.InterfaceC0161a;
import p005A4.InterfaceC0162b;
import p017C4.C0247b;
import p078P1.InterfaceC1144f;
import p078P1.InterfaceC1145g;
import p088R1.C1193C;
import p093S1.InterfaceC1289a;
import p097T1.C1420i;
import p097T1.InterfaceC1412a;
import p200m2.InterfaceC2600a;

/* JADX INFO: renamed from: A1.D */
/* JADX INFO: loaded from: classes.dex */
public class C0115D implements InterfaceC0161a, InterfaceC1145g, InterfaceC2600a, InterfaceC1289a, InterfaceC1412a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f494d;

    public /* synthetic */ C0115D(int i5) {
        this.f494d = i5;
    }

    @Override // p093S1.InterfaceC1289a
    /* JADX INFO: renamed from: b */
    public Bitmap mo151b(int i5, int i6, Bitmap.Config config) {
        return Bitmap.createBitmap(i5, i6, config);
    }

    @Override // p097T1.InterfaceC1412a
    /* JADX INFO: renamed from: c */
    public File mo152c(InterfaceC1144f interfaceC1144f) {
        return null;
    }

    @Override // p093S1.InterfaceC1289a
    /* JADX INFO: renamed from: d */
    public Bitmap mo153d(int i5, int i6, Bitmap.Config config) {
        return Bitmap.createBitmap(i5, i6, config);
    }

    @Override // p093S1.InterfaceC1289a
    /* JADX INFO: renamed from: e */
    public void mo154e(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p200m2.InterfaceC2600a
    /* JADX INFO: renamed from: f */
    public Object mo67f() {
        switch (this.f494d) {
            case 21:
                return new C1193C();
            default:
                try {
                    return new C1420i(MessageDigest.getInstance("SHA-256"));
                } catch (NoSuchAlgorithmException e5) {
                    throw new RuntimeException(e5);
                }
        }
    }

    @Override // p005A4.InterfaceC0161a
    /* JADX INFO: renamed from: g */
    public InterfaceC0162b mo155g() {
        return C0247b.f824d;
    }

    public C0115D(C0102b c0102b) {
        this.f494d = 14;
    }

    @Override // p093S1.InterfaceC1289a
    /* JADX INFO: renamed from: j */
    public void mo158j() {
    }

    @Override // p093S1.InterfaceC1289a
    /* JADX INFO: renamed from: i */
    public void mo157i(int i5) {
    }

    @Override // p097T1.InterfaceC1412a
    /* JADX INFO: renamed from: h */
    public void mo156h(InterfaceC1144f interfaceC1144f, C0072l0 c0072l0) {
    }

    @Override // p078P1.InterfaceC1145g
    /* JADX INFO: renamed from: a */
    public void mo150a(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}

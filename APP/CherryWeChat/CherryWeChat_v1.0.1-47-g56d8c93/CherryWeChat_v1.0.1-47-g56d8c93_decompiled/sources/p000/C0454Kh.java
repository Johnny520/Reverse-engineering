package p000;

import io.sentry.InterfaceC1876g0;
import java.io.File;
import java.util.Comparator;

/* JADX INFO: renamed from: Kh */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0454Kh implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1488a;

    public /* synthetic */ C0454Kh(int i) {
        this.f1488a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1488a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 1:
                InterfaceC1876g0 interfaceC1876g0 = (InterfaceC1876g0) obj;
                InterfaceC1876g0 interfaceC1876g02 = (InterfaceC1876g0) obj2;
                if (interfaceC1876g0 == interfaceC1876g02) {
                    return 0;
                }
                int iCompareTo = interfaceC1876g0.mo3635u().compareTo(interfaceC1876g02.mo3635u());
                return iCompareTo != 0 ? iCompareTo : interfaceC1876g0.mo3627m().f5739b.toString().compareTo(interfaceC1876g02.mo3627m().f5739b.toString());
            default:
                return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
        }
    }
}

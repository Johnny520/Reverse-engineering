package p292u3;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import p117i.C3043c0;
import p237q3.AbstractC6239e;
import p238q4.AbstractC6244a;
import p292u3.AbstractC8503f;

/* JADX INFO: renamed from: u3.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8499b {

    /* JADX INFO: renamed from: a */
    public static final C3043c0 f28378a = new C3043c0(2);

    /* JADX INFO: renamed from: b */
    public static final Comparator f28379b = new Comparator() { // from class: u3.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC8499b.m32723a((byte[]) obj, (byte[]) obj2);
        }
    };

    /* JADX INFO: renamed from: u3.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a {
        /* JADX INFO: renamed from: a */
        static a m32730a(Context context, Uri uri) {
            return new b(context, uri);
        }

        /* JADX INFO: renamed from: b */
        Cursor mo32731b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    /* JADX INFO: renamed from: u3.b$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b implements a {

        /* JADX INFO: renamed from: a */
        public final ContentProviderClient f28380a;

        public b(Context context, Uri uri) {
            this.f28380a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // p292u3.AbstractC8499b.a
        /* JADX INFO: renamed from: b */
        public Cursor mo32731b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f28380a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e10) {
                Log.w("FontsProvider", "Unable to query the content provider", e10);
                return null;
            }
        }

        @Override // p292u3.AbstractC8499b.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f28380a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    /* JADX INFO: renamed from: u3.b$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class c {

        /* JADX INFO: renamed from: a */
        public String f28381a;

        /* JADX INFO: renamed from: b */
        public String f28382b;

        /* JADX INFO: renamed from: c */
        public List f28383c;

        public c(String str, String str2, List list) {
            this.f28381a = str;
            this.f28382b = str2;
            this.f28383c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.f28381a, cVar.f28381a) && Objects.equals(this.f28382b, cVar.f28382b) && Objects.equals(this.f28383c, cVar.f28383c);
        }

        public int hashCode() {
            return Objects.hash(this.f28381a, this.f28382b, this.f28383c);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m32723a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static List m32724b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m32725c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static List m32726d(C8500c c8500c, Resources resources) {
        return c8500c.m32733b() != null ? c8500c.m32733b() : AbstractC6239e.m24608b(resources, c8500c.m32734c());
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC8503f.a m32727e(Context context, List list, CancellationSignal cancellationSignal) {
        AbstractC6244a.m24638a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                C8500c c8500c = (C8500c) list.get(i10);
                ProviderInfo providerInfoM32728f = m32728f(context.getPackageManager(), c8500c, context.getResources());
                if (providerInfoM32728f == null) {
                    return AbstractC8503f.a.m32743b(1, null);
                }
                arrayList.add(m32729g(context, c8500c, providerInfoM32728f.authority, cancellationSignal));
            }
            return AbstractC8503f.a.m32742a(0, arrayList);
        } finally {
            AbstractC6244a.m24639b();
        }
    }

    /* JADX INFO: renamed from: f */
    public static ProviderInfo m32728f(PackageManager packageManager, C8500c c8500c, Resources resources) {
        AbstractC6244a.m24638a("FontProvider.getProvider");
        try {
            List listM32726d = m32726d(c8500c, resources);
            c cVar = new c(c8500c.m32735d(), c8500c.m32736e(), listM32726d);
            ProviderInfo providerInfo = (ProviderInfo) f28378a.m11255c(cVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            String strM32735d = c8500c.m32735d();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strM32735d, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + strM32735d);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(c8500c.m32736e())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + strM32735d + ", but package was not " + c8500c.m32736e());
            }
            List listM32724b = m32724b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
            Collections.sort(listM32724b, f28379b);
            for (int i10 = 0; i10 < listM32726d.size(); i10++) {
                ArrayList arrayList = new ArrayList((Collection) listM32726d.get(i10));
                Collections.sort(arrayList, f28379b);
                if (m32725c(listM32724b, arrayList)) {
                    f28378a.m11256d(cVar, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            AbstractC6244a.m24639b();
            return null;
        } finally {
            AbstractC6244a.m24639b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v2, types: [u3.b$a] */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p292u3.AbstractC8503f.b[] m32729g(android.content.Context r16, p292u3.C8500c r17, java.lang.String r18, android.os.CancellationSignal r19) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p292u3.AbstractC8499b.m32729g(android.content.Context, u3.c, java.lang.String, android.os.CancellationSignal):u3.f$b[]");
    }
}

package yyds;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛳᲁᲀᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0709 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f3349;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0184 f3350;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f3351 = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0709(String str, C0184 c0184, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f3349 = str;
        this.f3350 = c0184;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Exception {
        Long lM1692;
        int i = this.f3351;
        String str = this.f3349;
        C0184 c0184 = this.f3350;
        switch (i) {
            case 0:
                AbstractC1544.m3189(obj);
                C1633 c1633 = new C1633();
                c1633.m3334(str);
                C2098 c2098 = new C2098(c1633);
                C1327 c1327 = C1327.f6093;
                C1284 c1284M2619 = C1327.m2619();
                c1284M2619.getClass();
                C0837 c0837M4863 = new C2729(c1284M2619, c2098).m4863();
                if (!c0837M4863.f3852) {
                    throw new Exception(AbstractC2328.m4341(-127177849471854L) + c0837M4863.f3860);
                }
                C0907 c0907 = C0907.f4128;
                Context context = c0184.f1057;
                c0907.getClass();
                AbstractC2328.m4341(-753650369201006L);
                File file = new File(context.getFilesDir(), AbstractC2328.m4341(-753684728939374L));
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(file, AbstractC2328.m4341(-127207914242926L) + System.currentTimeMillis() + AbstractC2328.m4341(-127229389079406L));
                InputStream inputStreamM1079 = c0837M4863.f3849.m1079();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        byte[] bArr = new byte[8192];
                        for (int i2 = inputStreamM1079.read(bArr); i2 >= 0; i2 = inputStreamM1079.read(bArr)) {
                            fileOutputStream.write(bArr, 0, i2);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStreamM1079.close();
                        if (file2.exists()) {
                            long j = 0;
                            if (file2.length() != 0) {
                                C2336 c2336 = C2336.f11496;
                                c2336.m4354(AbstractC2328.m4341(-127289518621550L) + file2.getAbsolutePath() + AbstractC2328.m4341(-127336763261806L) + file2.length() + AbstractC2328.m4341(-127366828032878L));
                                try {
                                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                                    mediaMetadataRetriever.setDataSource(file2.getAbsolutePath());
                                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                                    long jLongValue = (strExtractMetadata == null || (lM1692 = AbstractC0733.m1692(strExtractMetadata)) == null) ? 0L : lM1692.longValue();
                                    mediaMetadataRetriever.release();
                                    c2336.m4354(AbstractC2328.m4341(-127396892803950L) + jLongValue + AbstractC2328.m4341(-127426957575022L));
                                    j = jLongValue;
                                } catch (Exception e) {
                                    C2336.f11496.m4358(AbstractC2328.m4341(-127439842476910L), e);
                                }
                                return new Pair(file2, new Long(j));
                            }
                        }
                        throw new Exception(AbstractC2328.m4341(-127250863915886L));
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC1367.m2774(inputStreamM1079, th);
                        throw th2;
                    }
                }
            default:
                AbstractC1544.m3189(obj);
                File file3 = new File(str);
                if (!file3.exists() || !file3.isDirectory()) {
                    return C1860.f9345;
                }
                ArrayList arrayList = new ArrayList();
                File parentFile = file3.getParentFile();
                if (parentFile != null && parentFile.canRead()) {
                    arrayList.add(new C2522(parentFile, true));
                }
                File[] fileArrListFiles = file3.listFiles();
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                ArrayList arrayList2 = new ArrayList();
                for (File file4 : fileArrListFiles) {
                    if (file4.isDirectory() && file4.canRead()) {
                        arrayList2.add(file4);
                    }
                }
                Iterator it = AbstractC1595.m3272(arrayList2, c0184.f1073 ? new C1300(5) : new C1300(3)).iterator();
                while (it.hasNext()) {
                    arrayList.add(new C2522((File) it.next(), true));
                }
                ArrayList arrayList3 = new ArrayList();
                for (File file5 : fileArrListFiles) {
                    if (file5.isFile()) {
                        String name = file5.getName();
                        AbstractC2328.m4341(-223423771607918L);
                        String lowerCase = name.toLowerCase(Locale.ROOT);
                        AbstractC2328.m4341(-128114152342382L);
                        if (AbstractC0692.m1600(lowerCase, AbstractC2328.m4341(-128187166786414L), false) || AbstractC0692.m1600(lowerCase, AbstractC2328.m4341(-128208641622894L), false) || AbstractC0692.m1600(lowerCase, AbstractC2328.m4341(-128230116459374L), false) || AbstractC0692.m1600(lowerCase, AbstractC2328.m4341(-128251591295854L), false) || AbstractC0692.m1600(lowerCase, AbstractC2328.m4341(-128273066132334L), false) || AbstractC0692.m1600(lowerCase, AbstractC2328.m4341(-128294540968814L), false) || AbstractC0692.m1600(lowerCase, AbstractC2328.m4341(-128320310772590L), false) || AbstractC0692.m1600(lowerCase, AbstractC2328.m4341(-128341785609070L), false)) {
                            arrayList3.add(file5);
                        }
                    }
                }
                Iterator it2 = AbstractC1595.m3272(arrayList3, c0184.f1073 ? new C1300(6) : new C1300(4)).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C2522((File) it2.next(), false));
                }
                return arrayList;
        }
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        int i = this.f3351;
        C0184 c0184 = this.f3350;
        String str = this.f3349;
        switch (i) {
            case 0:
                return new C0709(c0184, str, interfaceC0274);
            default:
                return new C0709(str, c0184, interfaceC0274);
        }
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        int i = this.f3351;
        C2746 c2746 = C2746.f13459;
        InterfaceC0990 interfaceC0990 = (InterfaceC0990) obj;
        InterfaceC0274 interfaceC0274 = (InterfaceC0274) obj2;
        switch (i) {
        }
        return ((C0709) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0709(C0184 c0184, String str, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f3350 = c0184;
        this.f3349 = str;
    }
}

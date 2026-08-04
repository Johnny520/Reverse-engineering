package yyds;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛵᲇᛵᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1221 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C1221 f5600;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static volatile boolean f5601;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static C1085 f5602;

    static {
        AbstractC2328.m4341(-733704541078382L);
        AbstractC2328.m4341(-734116857938798L);
        AbstractC2328.m4341(-734189872382830L);
        f5600 = new C1221();
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static String m2479(Integer num) {
        if (num.intValue() <= 0) {
            return AbstractC2328.m4341(-727627162354542L);
        }
        int iIntValue = num.intValue() / 1000;
        int i = iIntValue / 60;
        int i2 = iIntValue % 60;
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            sb2.append((char) 20998);
            sb.append(sb2.toString());
        }
        if (i2 > 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i2);
            sb3.append((char) 31186);
            sb.append(sb3.toString());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static String m2480(String str, String str2) {
        AbstractC2328.m4341(-726218413081454L);
        AbstractC2328.m4341(-726248477852526L);
        return str + new SimpleDateFormat(AbstractC2328.m4341(-726278542623598L)).format(new Date()) + '.' + str2;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static void m2481(Context context, File file, boolean z) {
        Uri uriM2105;
        try {
            if (!z) {
                file.delete();
                return;
            }
            C0967 c0967 = C0967.f4447;
            String absolutePath = file.getAbsolutePath();
            AbstractC2328.m4341(-728133968495470L);
            c0967.getClass();
            AbstractC2328.m4341(-681426199151470L);
            AbstractC2328.m4341(-681460558889838L);
            C2654 c2654M2107 = C0967.m2107(absolutePath);
            if (c2654M2107 == null || (uriM2105 = C0967.m2105(context, c2654M2107)) == null) {
                return;
            }
            DocumentsContract.deleteDocument(context.getContentResolver(), uriM2105);
        } catch (Exception e) {
            C2336.f11496.m4355(AbstractC2328.m4341(-728224162808686L), e);
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m2482(Context context, File file, File file2, boolean z) throws Exception {
        Uri uriRenameDocument;
        Object c2658;
        Object c26582;
        if (!z) {
            try {
                Files.move(file.toPath(), file2.toPath(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
                return;
            } catch (AtomicMoveNotSupportedException unused) {
                Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
                return;
            }
        }
        C0967 c0967 = C0967.f4447;
        String absolutePath = file.getAbsolutePath();
        AbstractC2328.m4341(-727953579869038L);
        String absolutePath2 = file2.getAbsolutePath();
        AbstractC2328.m4341(-728043774182254L);
        c0967.getClass();
        AbstractC2328.m4341(-681499213595502L);
        AbstractC2328.m4341(-681533573333870L);
        AbstractC2328.m4341(-681610882745198L);
        C2654 c2654M2107 = C0967.m2107(absolutePath);
        if (c2654M2107 == null) {
            C0188.m800(AbstractC2328.m4341(-681671012287342L));
            return;
        }
        C2654 c2654M21072 = C0967.m2107(absolutePath2);
        if (c2654M21072 == null) {
            C0188.m800(AbstractC2328.m4341(-681726846862190L));
            return;
        }
        List listM1306 = AbstractC0473.m1306(c2654M2107.f13056, new char[]{'/'});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM1306) {
            if (!AbstractC0473.m1313((String) obj)) {
                arrayList.add(obj);
            }
        }
        List listM13062 = AbstractC0473.m1306(c2654M21072.f13056, new char[]{'/'});
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listM13062) {
            if (!AbstractC0473.m1313((String) obj2)) {
                arrayList2.add(obj2);
            }
        }
        String str = (String) AbstractC1595.m3261(arrayList2);
        if (str == null) {
            C0188.m800(AbstractC2328.m4341(-681782681437038L));
            return;
        }
        if (!c2654M2107.f13054.equals(c2654M21072.f13054) || !AbstractC1595.m3277(arrayList).equals(AbstractC1595.m3277(arrayList2))) {
            C0188.m800(AbstractC2328.m4341(-681817041175406L));
            return;
        }
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriM2105 = C0967.m2105(context, c2654M2107);
        if (uriM2105 == null) {
            C0188.m800(AbstractC2328.m4341(-681885760652142L));
            return;
        }
        Uri uriM21052 = C0967.m2105(context, c2654M21072);
        if (uriM21052 != null) {
            StringBuilder sb = new StringBuilder(".");
            sb.append(str);
            sb.append(AbstractC2328.m4341(-681920120390510L));
            long jNanoTime = System.nanoTime();
            AbstractC1741.m3477(36);
            String string = Long.toString(jNanoTime, 36);
            AbstractC2328.m4341(-681958775096174L);
            sb.append(string);
            uriRenameDocument = DocumentsContract.renameDocument(contentResolver, uriM21052, sb.toString());
            if (uriRenameDocument == null) {
                C0188.m800(AbstractC2328.m4341(-682018904638318L));
                return;
            }
        } else {
            uriRenameDocument = null;
        }
        try {
            if (DocumentsContract.renameDocument(contentResolver, uriM2105, str) == null) {
                throw new IllegalStateException(AbstractC2328.m4341(-682074739213166L));
            }
            if (uriRenameDocument != null) {
                try {
                    c26582 = Boolean.valueOf(DocumentsContract.deleteDocument(contentResolver, uriRenameDocument));
                } catch (Throwable th) {
                    c26582 = new C2658(th);
                }
                Throwable thM4249 = C2248.m4249(c26582);
                if (thM4249 != null) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-682156343591790L).concat(absolutePath2), thM4249);
                }
            }
        } catch (Exception e) {
            if (uriRenameDocument != null) {
                try {
                    c2658 = DocumentsContract.renameDocument(contentResolver, uriRenameDocument, str);
                } catch (Throwable th2) {
                    c2658 = new C2658(th2);
                }
                Throwable thM42492 = C2248.m4249(c2658);
                if (thM42492 != null) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-682113393918830L).concat(absolutePath2), thM42492);
                }
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static boolean m2483(String str, String str2) {
        AbstractC2328.m4341(-728460386009966L);
        AbstractC2328.m4341(-728507630650222L);
        try {
            File file = new File(str);
            Files.copy(file.toPath(), new File(str2).toPath(), StandardCopyOption.REPLACE_EXISTING);
            file.delete();
            return true;
        } catch (Exception e) {
            C2336.f11496.m4354(AbstractC2328.m4341(-728546285355886L) + e.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static String m2484(String str) {
        return AbstractC0473.m1301(str, AbstractC2328.m4341(-731788985664366L), false) ? AbstractC2328.m4341(-731806165533550L) : (AbstractC0473.m1301(str, AbstractC2328.m4341(-731823345402734L), false) || AbstractC0473.m1301(str, AbstractC2328.m4341(-731844820239214L), false)) ? AbstractC2328.m4341(-731862000108398L) : AbstractC0473.m1301(str, AbstractC2328.m4341(-731879179977582L), false) ? AbstractC2328.m4341(-731896359846766L) : AbstractC0473.m1301(str, AbstractC2328.m4341(-731913539715950L), false) ? AbstractC2328.m4341(-731935014552430L) : AbstractC0473.m1301(str, AbstractC2328.m4341(-731956489388910L), false) ? AbstractC2328.m4341(-731977964225390L) : AbstractC0473.m1301(str, AbstractC2328.m4341(-731999439061870L), false) ? AbstractC2328.m4341(-732020913898350L) : AbstractC2328.m4341(-732042388734830L);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static File m2485(File file) {
        String str;
        String name = file.getName();
        if (AbstractC0473.m1313(name)) {
            name = AbstractC2328.m4341(-727631457321838L);
        }
        int iM1307 = AbstractC0473.m1307(name, '.', 0, 6);
        long jNanoTime = System.nanoTime();
        AbstractC1741.m3477(36);
        String string = Long.toString(jNanoTime, 36);
        AbstractC2328.m4341(-727670112027502L);
        if (iM1307 <= 0 || iM1307 >= AbstractC0473.m1300(name)) {
            str = "." + name + AbstractC2328.m4341(-727906335228782L) + string;
        } else {
            String strSubstring = name.substring(0, iM1307);
            AbstractC2328.m4341(-727730241569646L);
            String strSubstring2 = name.substring(iM1307);
            AbstractC2328.m4341(-727794666079086L);
            str = "." + strSubstring + AbstractC2328.m4341(-727859090588526L) + string + strSubstring2;
        }
        return new File(file.getAbsoluteFile().getParentFile(), str);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static boolean m2486(File file, String str) {
        AbstractC2328.m4341(-728267112481646L);
        AbstractC2328.m4341(-728305767187310L);
        try {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                C2336.f11496.m4354(AbstractC2328.m4341(-728322947056494L) + parentFile.getAbsolutePath());
                AbstractC1960.m3789(AbstractC2328.m4341(-728361601762158L) + parentFile.getAbsolutePath());
                return false;
            }
            file.delete();
            C1633 c1633 = new C1633();
            c1633.m3334(str);
            C2098 c2098 = new C2098(c1633);
            C1327 c1327 = C1327.f6093;
            C1284 c1284M2619 = C1327.m2619();
            c1284M2619.getClass();
            C0837 c0837M4863 = new C2729(c1284M2619, c2098).m4863();
            if (!c0837M4863.f3852) {
                return false;
            }
            InputStream inputStreamM1079 = c0837M4863.f3849.m1079();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[8192];
                    for (int i = inputStreamM1079.read(bArr); i >= 0; i = inputStreamM1079.read(bArr)) {
                        fileOutputStream.write(bArr, 0, i);
                    }
                    fileOutputStream.close();
                    inputStreamM1079.close();
                    return true;
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            C2336.f11496.m4355(AbstractC2328.m4341(-728400256467822L), e);
            AbstractC1960.m3789(AbstractC2328.m4341(-728430321238894L) + e.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static void m2487(Context context) {
        String strM4341 = AbstractC2328.m4341(-728606414898030L);
        String strM43412 = AbstractC2328.m4341(-728640774636398L);
        NotificationChannel notificationChannel = new NotificationChannel(AbstractC2328.m4341(-728679429342062L), strM4341, 2);
        notificationChannel.setDescription(strM43412);
        Object systemService = context.getSystemService(AbstractC2328.m4341(-728752443786094L));
        AbstractC2328.m4341(-728808278360942L);
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:264|52|(2:58|(1:209))|316|66|(7:68|269|69|(1:71)|77|(2:288|79)(8:97|320|(5:312|99|100|101|(2:104|105))(1:115)|103|117|268|118|(2:119|(2:121|(1:322)(4:161|162|(2:164|323)(1:324)|165))(3:321|166|(1:169))))|209)(4:198|314|199|200)|271|205|(3:207|(2:210|211)|209)|(0)|(0)|278|224|(0)|303|230|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x033c, code lost:
    
        yyds.C2336.f11496.m4354(yyds.AbstractC2328.m4341(-730607869657966L));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x034a, code lost:
    
        if (r15 == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x034c, code lost:
    
        r0 = yyds.C0967.f4447;
        r1 = r6.getAbsolutePath();
        yyds.AbstractC2328.m4341(-730663704232814L);
        r0.getClass();
        yyds.AbstractC2328.m4341(-681426199151470L);
        yyds.AbstractC2328.m4341(-681460558889838L);
        r0 = yyds.C0967.m2107(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0371, code lost:
    
        if (r0 != null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0374, code lost:
    
        r0 = yyds.C0967.m2105(r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0378, code lost:
    
        if (r0 != null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x037b, code lost:
    
        android.provider.DocumentsContract.deleteDocument(r3.getContentResolver(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0385, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0387, code lost:
    
        r6.delete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x038b, code lost:
    
        yyds.C2336.f11496.m4355(yyds.AbstractC2328.m4341(-730753898546030L), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x04f8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x04f9, code lost:
    
        r18 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0501, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0502, code lost:
    
        r18 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0295, code lost:
    
        if (yyds.AbstractC2071.m3955(r0, r1, r9) == r10) goto L209;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x030b: MOVE (r13 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY]) (LINE:780), block:B:107:0x0309 */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03c5 A[Catch: Exception -> 0x03c9, TRY_LEAVE, TryCatch #24 {Exception -> 0x03c9, blocks: (B:147:0x03bf, B:149:0x03c5), top: B:291:0x03bf }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03dc A[Catch: Exception -> 0x03e3, TRY_LEAVE, TryCatch #17 {Exception -> 0x03e3, blocks: (B:153:0x03d8, B:155:0x03dc), top: B:284:0x03d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0521 A[Catch: all -> 0x0566, TRY_LEAVE, TryCatch #6 {all -> 0x0566, blocks: (B:205:0x051d, B:207:0x0521), top: B:271:0x051d }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0560 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x059a A[Catch: Exception -> 0x059e, TRY_LEAVE, TryCatch #11 {Exception -> 0x059e, blocks: (B:224:0x0594, B:226:0x059a), top: B:278:0x0594 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05b1 A[Catch: Exception -> 0x05b9, TRY_LEAVE, TryCatch #33 {Exception -> 0x05b9, blocks: (B:230:0x05ad, B:232:0x05b1), top: B:303:0x05ad }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05f4 A[Catch: Exception -> 0x05f8, TRY_LEAVE, TryCatch #8 {Exception -> 0x05f8, blocks: (B:247:0x05ee, B:249:0x05f4), top: B:274:0x05ee }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x060b A[Catch: Exception -> 0x0613, TRY_LEAVE, TryCatch #28 {Exception -> 0x0613, blocks: (B:253:0x0607, B:255:0x060b), top: B:297:0x0607 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x056c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0581 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:325:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0178 A[Catch: all -> 0x04f8, Exception -> 0x0501, TRY_LEAVE, TryCatch #37 {Exception -> 0x0501, all -> 0x04f8, blocks: (B:66:0x015e, B:68:0x0178, B:77:0x01b8, B:97:0x02d1, B:76:0x01aa, B:69:0x019b, B:71:0x019f), top: B:316:0x015e, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r13v0, types: [yyds.ᛲᛱᛶᛸ] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v54, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r2v71 */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String, yyds.ᛲᛱᛶᛸ] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x038b -> B:280:0x0399). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2488(Context context, String str, String str2, AbstractC1320 abstractC1320) throws Throwable {
        C1715 c1715;
        C0172 c0172;
        boolean z;
        C1085 c1085;
        Throwable th;
        ?? r2;
        InputStream inputStreamM1079;
        ?? r22;
        Object obj;
        ?? r1;
        OutputStream fileOutputStream;
        OutputStream outputStream;
        OutputStream outputStream2;
        C0172 c01722;
        C2336 c2336;
        long j;
        C1085 c10852;
        C0837 c0837;
        boolean z2;
        File parentFile;
        C1158 c1158;
        C0801 c0801;
        ?? r13;
        Context context2;
        C0172 c01723;
        C1085 c10853;
        C0837 c08372;
        ?? r23;
        ?? r24;
        ?? r12;
        C1085 c10854;
        C0837 c08373;
        ?? r25;
        ?? r14;
        Context context3 = context;
        String str3 = str;
        C2746 c2746 = C2746.f13459;
        if (abstractC1320 instanceof C1715) {
            c1715 = (C1715) abstractC1320;
            int i = c1715.f8688;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1715.f8688 = i - Integer.MIN_VALUE;
            } else {
                c1715 = new C1715(this, abstractC1320);
            }
        }
        C1715 c17152 = c1715;
        Object obj2 = c17152.f8694;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        int i2 = c17152.f8688;
        int i3 = 1;
        ?? r132 = 0;
        ?? r133 = 0;
        if (i2 == 0) {
            AbstractC1544.m3189(obj2);
            f5601 = false;
            c0172 = new C0172();
            File file = new File(str3);
            C0967 c0967 = C0967.f4447;
            String absolutePath = file.getAbsolutePath();
            AbstractC2328.m4341(-729104631104366L);
            c0967.getClass();
            AbstractC2328.m4341(-681250105492334L);
            z = C0967.m2107(absolutePath) != null;
            if (z) {
                C2615.f12860.getClass();
                if (C2615.m4715().equals(AbstractC2328.m4341(-697433542263662L))) {
                }
                r12 = r1;
                r24 = r2;
                if (!f5601) {
                }
                if (r12 != 0) {
                }
                if (r24 != 0) {
                }
                c08373 = (C0837) c0172.f997;
                if (c08373 != null) {
                }
                c10854 = f5602;
                if (c10854 != null) {
                }
            } else {
                try {
                    parentFile = file.getParentFile();
                } catch (Exception e) {
                    e = e;
                    z2 = z;
                    C2336.f11496.m4355(AbstractC2328.m4341(-729194825417582L), e);
                    C1206 c1206 = AbstractC0221.f1238;
                    c1158 = AbstractC1353.f6250;
                    c0801 = new C0801(e, r132, i3);
                    c17152.f8696 = null;
                    c17152.f8692 = null;
                    c17152.f8689 = null;
                    c17152.f8691 = null;
                    c17152.f8695 = null;
                    c17152.f8693 = z2;
                    c17152.f8688 = 2;
                    if (AbstractC2071.m3955(c1158, c0801, c17152) != enumC1765) {
                    }
                }
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    C1206 c12062 = AbstractC0221.f1238;
                    C1158 c11582 = AbstractC1353.f6250;
                    C0275 c0275 = new C0275(parentFile, null, 1);
                    c17152.f8696 = null;
                    c17152.f8692 = null;
                    c17152.f8689 = null;
                    c17152.f8691 = null;
                    c17152.f8695 = null;
                    c17152.f8693 = z;
                    c17152.f8688 = 1;
                    if (AbstractC2071.m3955(c11582, c0275, c17152) == enumC1765) {
                        return enumC1765;
                    }
                }
                C2615.f12860.getClass();
                if (C2615.m4715().equals(AbstractC2328.m4341(-697433542263662L))) {
                    C2701.f13261.getClass();
                    C2701.m4807(context3);
                    m2487(context3);
                    Object systemService = context3.getSystemService(AbstractC2328.m4341(-729254954959726L));
                    AbstractC2328.m4341(-729310789534574L);
                    NotificationManager notificationManager = (NotificationManager) systemService;
                    try {
                        try {
                            C1085 c10855 = f5602;
                            if (c10855 != null) {
                                context3.unregisterReceiver(c10855);
                                f5602 = null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r22 = 0;
                            if (r133 != 0) {
                                try {
                                    r133.close();
                                } catch (Exception e2) {
                                    C2336.f11496.m4355(AbstractC2328.m4341(-731415323509614L), e2);
                                }
                            }
                            if (r22 != 0) {
                                try {
                                    r22.close();
                                } catch (Exception e3) {
                                    C2336.f11496.m4355(AbstractC2328.m4341(-731449683247982L), e3);
                                }
                            }
                            c08372 = (C0837) c0172.f997;
                            if (c08372 != null) {
                                c08372.close();
                            }
                            c10853 = f5602;
                            if (c10853 == null) {
                                throw th;
                            }
                            context3.unregisterReceiver(c10853);
                            f5602 = null;
                            throw th;
                        }
                    } catch (Exception e4) {
                        C2336.f11496.m4355(AbstractC2328.m4341(-729607142277998L), e4);
                    }
                    f5602 = new C1085(i3, notificationManager);
                    context3.registerReceiver(f5602, new IntentFilter(AbstractC2328.m4341(-729675861754734L)), 4);
                    Intent intent = new Intent(AbstractC2328.m4341(-729886315152238L));
                    intent.setPackage(context3.getPackageName());
                    PendingIntent broadcast = PendingIntent.getBroadcast(context3, 0, intent, 201326592);
                    C2619 c2619 = new C2619(context3, AbstractC2328.m4341(-730096768549742L));
                    c2619.f12880.icon = R.drawable.stat_sys_download;
                    c2619.f12875 = C2619.m4724(AbstractC2328.m4341(-730169782993774L));
                    c2619.f12883 = C2619.m4724(AbstractC2328.m4341(-730186962862958L));
                    int i4 = -1;
                    c2619.f12878 = -1;
                    c2619.f12880.flags |= 2;
                    c2619.f12872 = 100;
                    c2619.f12874 = 0;
                    c2619.f12877.add(new C0582(AbstractC2328.m4341(-730221322601326L), broadcast));
                    AbstractC2328.m4341(-730242797437806L);
                    notificationManager.notify(1001, c2619.m4725());
                    C1633 c1633 = new C1633();
                    c1633.m3334(str2);
                    C2098 c2098 = new C2098(c1633);
                    C1327 c1327 = C1327.f6093;
                    C0837 c0837M4863 = C1327.m2619().m2559(c2098).m4863();
                    c0172.f997 = c0837M4863;
                    if (c0837M4863.f3852) {
                        AbstractC0379 abstractC0379 = c0837M4863.f3849;
                        long jMo909 = abstractC0379.mo909();
                        inputStreamM1079 = abstractC0379.m1079();
                        try {
                            if (z) {
                                try {
                                    C0967 c09672 = C0967.f4447;
                                    c1085 = null;
                                    String absolutePath2 = file.getAbsolutePath();
                                    AbstractC2328.m4341(-730470430704494L);
                                    c09672.getClass();
                                    OutputStream outputStreamM2103 = C0967.m2103(context3, absolutePath2);
                                    fileOutputStream = outputStreamM2103;
                                    if (outputStreamM2103 == null) {
                                        throw new IllegalStateException(AbstractC2328.m4341(-730560625017710L));
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    c1085 = null;
                                    r2 = inputStreamM1079;
                                    r1 = 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    th = th;
                                    r22 = inputStreamM1079;
                                    r133 = r132;
                                    if (r133 != 0) {
                                    }
                                    if (r22 != 0) {
                                    }
                                    c08372 = (C0837) c0172.f997;
                                    if (c08372 != null) {
                                    }
                                    c10853 = f5602;
                                    if (c10853 == null) {
                                    }
                                }
                            } else {
                                c1085 = null;
                                fileOutputStream = new FileOutputStream(file);
                            }
                            outputStream = fileOutputStream;
                            try {
                                try {
                                    byte[] bArr = new byte[65536];
                                    float f = 0.0f;
                                    long j2 = 0;
                                    C2619 c26192 = c2619;
                                    while (true) {
                                        int i5 = inputStreamM1079.read(bArr);
                                        if (i5 == i4) {
                                            outputStream.flush();
                                            C1206 c12063 = AbstractC0221.f1238;
                                            C1158 c11583 = AbstractC1353.f6250;
                                            C1639 c1639 = new C1639(c26192, notificationManager, context3, file, (InterfaceC0274) null, 6);
                                            c17152.f8696 = context3;
                                            c17152.f8692 = str3;
                                            c17152.f8689 = c0172;
                                            c17152.f8691 = inputStreamM1079;
                                            c17152.f8695 = outputStream;
                                            c17152.f8693 = z;
                                            c17152.f8688 = 4;
                                            if (AbstractC2071.m3955(c11583, c1639, c17152) != enumC1765) {
                                                outputStream2 = outputStream;
                                                c01722 = c0172;
                                            }
                                        } else {
                                            if (f5601) {
                                                break;
                                            }
                                            outputStream.write(bArr, 0, i5);
                                            f += i5;
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            if (jCurrentTimeMillis - j2 >= 200) {
                                                int i6 = (int) ((f / jMo909) * 100.0f);
                                                byte[] bArr2 = bArr;
                                                String str4 = String.format(AbstractC2328.m4341(-730960056976238L), Arrays.copyOf(new Object[]{new Float(i6)}, 1));
                                                AbstractC2328.m4341(-730981531812718L);
                                                C2619 c26193 = c26192;
                                                c26193.f12872 = 100;
                                                c26193.f12874 = i6;
                                                c26193.f12883 = C2619.m4724(AbstractC2328.m4341(-731033071420270L) + str4 + '%');
                                                notificationManager.notify(1001, c26193.m4725());
                                                c26192 = c26193;
                                                j2 = jCurrentTimeMillis;
                                                bArr = bArr2;
                                                jMo909 = jMo909;
                                            }
                                            i4 = -1;
                                        }
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    r2 = inputStreamM1079;
                                    r1 = outputStream;
                                    r12 = r1;
                                    r24 = r2;
                                    if (!f5601) {
                                    }
                                    if (r12 != 0) {
                                    }
                                    if (r24 != 0) {
                                    }
                                    c08373 = (C0837) c0172.f997;
                                    if (c08373 != null) {
                                    }
                                    c10854 = f5602;
                                    if (c10854 != null) {
                                    }
                                    return c2746;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                r132 = outputStream;
                                th = th;
                                r22 = inputStreamM1079;
                                r133 = r132;
                                if (r133 != 0) {
                                }
                                if (r22 != 0) {
                                }
                                c08372 = (C0837) c0172.f997;
                                if (c08372 != null) {
                                }
                                c10853 = f5602;
                                if (c10853 == null) {
                                }
                            }
                        } catch (Exception e7) {
                            e = e7;
                        } catch (Throwable th5) {
                            th = th5;
                            r22 = inputStreamM1079;
                            r133 = obj;
                        }
                    } else {
                        try {
                            C1206 c12064 = AbstractC0221.f1238;
                            C1158 c11584 = AbstractC1353.f6250;
                            C2576 c2576 = new C2576(c0172, notificationManager, r132, 7);
                            c17152.f8696 = context3;
                            c17152.f8692 = str3;
                            c17152.f8689 = c0172;
                            c17152.f8691 = null;
                            c17152.f8695 = null;
                            c17152.f8693 = z;
                            c17152.f8688 = 3;
                        } catch (Exception e8) {
                            e = e8;
                            r1 = 0;
                            r2 = 0;
                            c1085 = null;
                            r12 = r1;
                            r24 = r2;
                            if (!f5601) {
                            }
                            if (r12 != 0) {
                            }
                            if (r24 != 0) {
                            }
                            c08373 = (C0837) c0172.f997;
                            if (c08373 != null) {
                            }
                            c10854 = f5602;
                            if (c10854 != null) {
                            }
                            return c2746;
                        }
                    }
                    return enumC1765;
                }
                c1085 = null;
                try {
                    throw new IllegalArgumentException(AbstractC2328.m4341(-729224890188654L));
                } catch (Exception e9) {
                    e = e9;
                    C1085 c10856 = c1085;
                    r2 = c10856;
                    r1 = c10856;
                    r12 = r1;
                    r24 = r2;
                    if (!f5601) {
                    }
                    if (r12 != 0) {
                    }
                    if (r24 != 0) {
                    }
                    c08373 = (C0837) c0172.f997;
                    if (c08373 != null) {
                    }
                    c10854 = f5602;
                    if (c10854 != null) {
                    }
                    return c2746;
                } catch (Throwable th6) {
                    th = th6;
                    th = th;
                    C1085 c10857 = c1085;
                    r133 = c10857;
                    r22 = c10857;
                    if (r133 != 0) {
                    }
                    if (r22 != 0) {
                    }
                    c08372 = (C0837) c0172.f997;
                    if (c08372 != null) {
                    }
                    c10853 = f5602;
                    if (c10853 == null) {
                    }
                }
                r12 = r1;
                r24 = r2;
                if (!f5601) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-731222049981294L) + str3, e);
                    C1206 c12065 = AbstractC0221.f1238;
                    C1158 c11585 = AbstractC1353.f6250;
                    ?? r7 = c1085;
                    C2576 c25762 = new C2576(context3, e, r7, 8);
                    c17152.f8696 = context3;
                    c17152.f8692 = r7;
                    c17152.f8689 = c0172;
                    c17152.f8691 = r2;
                    c17152.f8695 = r1;
                    c17152.f8693 = z;
                    c17152.f8688 = 5;
                    if (AbstractC2071.m3955(c11585, c25762, c17152) != enumC1765) {
                        context2 = context3;
                        c01723 = c0172;
                        r14 = r1;
                        r25 = r2;
                        c0172 = c01723;
                        context3 = context2;
                        r12 = r14;
                        r24 = r25;
                    }
                    return enumC1765;
                }
                if (r12 != 0) {
                }
                if (r24 != 0) {
                }
                c08373 = (C0837) c0172.f997;
                if (c08373 != null) {
                }
                c10854 = f5602;
                if (c10854 != null) {
                }
            }
        } else if (i2 == 1) {
            z2 = c17152.f8693;
            try {
                AbstractC1544.m3189(obj2);
                return c2746;
            } catch (Exception e10) {
                e = e10;
                C2336.f11496.m4355(AbstractC2328.m4341(-729194825417582L), e);
                C1206 c12066 = AbstractC0221.f1238;
                c1158 = AbstractC1353.f6250;
                c0801 = new C0801(e, r132, i3);
                c17152.f8696 = null;
                c17152.f8692 = null;
                c17152.f8689 = null;
                c17152.f8691 = null;
                c17152.f8695 = null;
                c17152.f8693 = z2;
                c17152.f8688 = 2;
                if (AbstractC2071.m3955(c1158, c0801, c17152) != enumC1765) {
                    return c2746;
                }
            }
        } else {
            if (i2 == 2) {
                AbstractC1544.m3189(obj2);
                return c2746;
            }
            if (i2 == 3) {
                boolean z3 = c17152.f8693;
                C0172 c01724 = c17152.f8689;
                String str5 = c17152.f8692;
                Context context4 = c17152.f8696;
                try {
                    AbstractC1544.m3189(obj2);
                    c0172 = c01724;
                    context3 = context4;
                    try {
                        C0837 c08374 = (C0837) c0172.f997;
                        if (c08374 != null) {
                            c08374.close();
                        }
                    } catch (Exception e11) {
                        C2336.f11496.m4355(AbstractC2328.m4341(-730375941423982L), e11);
                    }
                    try {
                        C1085 c10858 = f5602;
                        if (c10858 != null) {
                            context3.unregisterReceiver(c10858);
                            f5602 = null;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        c2336 = C2336.f11496;
                        j = -730406006195054L;
                        c2336.m4355(AbstractC2328.m4341(j), e);
                    }
                } catch (Exception e13) {
                    e = e13;
                    z = z3;
                    str3 = str5;
                    c0172 = c01724;
                    context3 = context4;
                    r1 = 0;
                    r2 = 0;
                    c1085 = null;
                    r12 = r1;
                    r24 = r2;
                    if (!f5601) {
                    }
                    if (r12 != 0) {
                    }
                    if (r24 != 0) {
                    }
                    c08373 = (C0837) c0172.f997;
                    if (c08373 != null) {
                    }
                    c10854 = f5602;
                    if (c10854 != null) {
                    }
                } catch (Throwable th7) {
                    th = th7;
                    c0172 = c01724;
                    context3 = context4;
                    r22 = 0;
                    if (r133 != 0) {
                    }
                    if (r22 != 0) {
                    }
                    c08372 = (C0837) c0172.f997;
                    if (c08372 != null) {
                    }
                    c10853 = f5602;
                    if (c10853 == null) {
                    }
                }
            } else if (i2 == 4) {
                boolean z4 = c17152.f8693;
                OutputStream outputStream3 = c17152.f8695;
                InputStream inputStream = c17152.f8691;
                c01722 = c17152.f8689;
                String str6 = c17152.f8692;
                Context context5 = c17152.f8696;
                try {
                    AbstractC1544.m3189(obj2);
                    inputStreamM1079 = inputStream;
                    context3 = context5;
                    c1085 = null;
                    outputStream2 = outputStream3;
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                        } catch (Exception e14) {
                            C2336.f11496.m4355(AbstractC2328.m4341(-731058841224046L), e14);
                        }
                    }
                    if (inputStreamM1079 != null) {
                        try {
                            inputStreamM1079.close();
                        } catch (Exception e15) {
                            C2336.f11496.m4355(AbstractC2328.m4341(-731093200962414L), e15);
                        }
                    }
                    try {
                        C0837 c08375 = (C0837) c01722.f997;
                        if (c08375 != null) {
                            c08375.close();
                        }
                    } catch (Exception e16) {
                        C2336.f11496.m4355(AbstractC2328.m4341(-731127560700782L), e16);
                    }
                    try {
                        C1085 c10859 = f5602;
                        if (c10859 != null) {
                            context3.unregisterReceiver(c10859);
                            f5602 = c1085;
                        }
                    } catch (Exception e17) {
                        e = e17;
                        c2336 = C2336.f11496;
                        j = -731157625471854L;
                        c2336.m4355(AbstractC2328.m4341(j), e);
                    }
                } catch (Exception e18) {
                    e = e18;
                    z = z4;
                    r1 = outputStream3;
                    r2 = inputStream;
                    c0172 = c01722;
                    str3 = str6;
                    context3 = context5;
                    c1085 = null;
                    try {
                        r12 = r1;
                        r24 = r2;
                        if (!f5601) {
                        }
                        if (r12 != 0) {
                        }
                        if (r24 != 0) {
                        }
                        c08373 = (C0837) c0172.f997;
                        if (c08373 != null) {
                        }
                        c10854 = f5602;
                        if (c10854 != null) {
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        r13 = r1;
                        r23 = r2;
                        th = th;
                        r22 = r23;
                        r133 = r13;
                        if (r133 != 0) {
                        }
                        if (r22 != 0) {
                        }
                        c08372 = (C0837) c0172.f997;
                        if (c08372 != null) {
                        }
                        c10853 = f5602;
                        if (c10853 == null) {
                        }
                    }
                } catch (Throwable th9) {
                    th = th9;
                    r133 = outputStream3;
                    r22 = inputStream;
                    c0172 = c01722;
                    context3 = context5;
                    if (r133 != 0) {
                    }
                    if (r22 != 0) {
                    }
                    c08372 = (C0837) c0172.f997;
                    if (c08372 != null) {
                    }
                    c10853 = f5602;
                    if (c10853 == null) {
                    }
                }
            } else {
                if (i2 != 5) {
                    C0188.m800(AbstractC2328.m4341(-731578532266862L));
                    return null;
                }
                OutputStream outputStream4 = c17152.f8695;
                InputStream inputStream2 = c17152.f8691;
                c01723 = c17152.f8689;
                context2 = c17152.f8696;
                try {
                    AbstractC1544.m3189(obj2);
                    r14 = outputStream4;
                    r25 = inputStream2;
                    c0172 = c01723;
                    context3 = context2;
                    r12 = r14;
                    r24 = r25;
                    if (r12 != 0) {
                        try {
                            r12.close();
                        } catch (Exception e19) {
                            C2336.f11496.m4355(AbstractC2328.m4341(-731252114752366L), e19);
                        }
                    }
                    if (r24 != 0) {
                        try {
                            r24.close();
                        } catch (Exception e20) {
                            C2336.f11496.m4355(AbstractC2328.m4341(-731286474490734L), e20);
                        }
                    }
                    try {
                        c08373 = (C0837) c0172.f997;
                        if (c08373 != null) {
                            c08373.close();
                        }
                    } catch (Exception e21) {
                        C2336.f11496.m4355(AbstractC2328.m4341(-731320834229102L), e21);
                    }
                    try {
                        c10854 = f5602;
                        if (c10854 != null) {
                            context3.unregisterReceiver(c10854);
                            f5602 = null;
                        }
                    } catch (Exception e22) {
                        e = e22;
                        c2336 = C2336.f11496;
                        j = -731350899000174L;
                        c2336.m4355(AbstractC2328.m4341(j), e);
                    }
                } catch (Throwable th10) {
                    th = th10;
                    r13 = outputStream4;
                    c0172 = c01723;
                    context3 = context2;
                    r23 = inputStream2;
                    th = th;
                    r22 = r23;
                    r133 = r13;
                    if (r133 != 0) {
                    }
                    if (r22 != 0) {
                    }
                    try {
                        c08372 = (C0837) c0172.f997;
                        if (c08372 != null) {
                        }
                    } catch (Exception e23) {
                        C2336.f11496.m4355(AbstractC2328.m4341(-731484042986350L), e23);
                    }
                    try {
                        c10853 = f5602;
                        if (c10853 == null) {
                        }
                    } catch (Exception e24) {
                        C2336.f11496.m4355(AbstractC2328.m4341(-731514107757422L), e24);
                        throw th;
                    }
                }
            }
        }
        return c2746;
        try {
            c0837 = (C0837) c0172.f997;
            if (c0837 != null) {
                c0837.close();
            }
        } catch (Exception e25) {
            C2336.f11496.m4355(AbstractC2328.m4341(-730865567695726L), e25);
        }
        try {
            c10852 = f5602;
            if (c10852 != null) {
                context3.unregisterReceiver(c10852);
                f5602 = c1085;
            }
        } catch (Exception e26) {
            e = e26;
            c2336 = C2336.f11496;
            j = -730895632466798L;
            c2336.m4355(AbstractC2328.m4341(j), e);
        }
        return c2746;
        try {
            inputStreamM1079.close();
        } catch (Exception e27) {
            C2336.f11496.m4355(AbstractC2328.m4341(-730831207957358L), e27);
        }
        c0837 = (C0837) c0172.f997;
        if (c0837 != null) {
        }
        c10852 = f5602;
        if (c10852 != null) {
        }
        return c2746;
        try {
            outputStream.close();
        } catch (Exception e28) {
            C2336.f11496.m4355(AbstractC2328.m4341(-730796848218990L), e28);
        }
        inputStreamM1079.close();
        c0837 = (C0837) c0172.f997;
        if (c0837 != null) {
        }
        c10852 = f5602;
        if (c10852 != null) {
        }
        return c2746;
        c10852 = f5602;
        if (c10852 != null) {
        }
        return c2746;
    }
}

package yyds;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.OutputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONObject;

/* JADX INFO: renamed from: yyds.ᛶᲀᛵᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1408 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public Object f6662;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f6663;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public Object f6664;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public /* synthetic */ Object f6665;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f6666;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final /* synthetic */ Object f6667;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6668 = 1;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public Object f6669;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public Object f6670;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public Object f6671;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final /* synthetic */ Comparable f6672;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408(String str, String str2, Context context, String str3, String str4, String str5, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f6670 = str;
        this.f6664 = str2;
        this.f6667 = context;
        this.f6662 = str3;
        this.f6666 = str4;
        this.f6672 = str5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02df A[Catch: all -> 0x01ea, Exception -> 0x01ed, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x01ed, blocks: (B:62:0x01e3, B:83:0x0258, B:87:0x029f, B:89:0x02bd, B:91:0x02c8, B:94:0x02df, B:98:0x02f5), top: B:120:0x01e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02f5 A[Catch: all -> 0x01ea, Exception -> 0x01ed, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x01ed, blocks: (B:62:0x01e3, B:83:0x0258, B:87:0x029f, B:89:0x02bd, B:91:0x02c8, B:94:0x02df, B:98:0x02f5), top: B:120:0x01e3 }] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, yyds.ᛸᛴᲁᛴ] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.StringBuilder] */
    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo474(Object obj) throws Throwable {
        File file;
        File file2;
        Object objM1964;
        boolean zBooleanValue;
        ?? BooleanValue;
        Throwable th;
        ?? r2;
        Object objM4660;
        ZipOutputStream zipOutputStream;
        Object objM46602;
        OutputStream outputStream;
        ?? r3;
        OutputStream outputStream2;
        int i = this.f6668;
        ?? r22 = this.f6667;
        Object obj2 = this.f6672;
        ?? r4 = EnumC1765.f8858;
        Object obj3 = this.f6666;
        int i2 = 1;
        InterfaceC0274 interfaceC0274 = null;
        switch (i) {
            case 0:
                ?? r1 = (String) this.f6664;
                String str = (String) this.f6670;
                Context context = (Context) r22;
                String str2 = (String) obj2;
                InterfaceC0990 interfaceC0990 = (InterfaceC0990) this.f6665;
                int i3 = this.f6663;
                int i4 = 0;
                try {
                    if (i3 != 0) {
                        if (i3 != 1) {
                            C0188.m800(AbstractC2328.m4341(-570671877489518L));
                            return null;
                        }
                        file2 = (File) this.f6669;
                        file = (File) this.f6671;
                        try {
                            AbstractC1544.m3189(obj);
                            objM1964 = obj;
                            List list = (List) objM1964;
                            zBooleanValue = ((Boolean) list.get(0)).booleanValue();
                            BooleanValue = ((Boolean) list.get(1)).booleanValue();
                            C2336.f11496.m4354(AbstractC2328.m4341(-570070582068078L) + zBooleanValue + AbstractC2328.m4341(-570177956250478L) + BooleanValue);
                            if (!zBooleanValue && BooleanValue != 0) {
                                String absolutePath = file.getAbsolutePath();
                                AbstractC2328.m4341(-570323985138542L);
                                String absolutePath2 = file2.getAbsolutePath();
                                AbstractC2328.m4341(-570414179451758L);
                                String strM4946 = C2810.m4946(absolutePath, absolutePath2, str2);
                                if (strM4946 != null) {
                                    C1221.f5600.getClass();
                                    if (C1221.m2483(strM4946, str2)) {
                                        C1327 c1327 = C1327.f6093;
                                        C1327.m2617(context, str2);
                                        C1939 c1939 = new C1939(AbstractC2328.m4341(-570525848601454L), str2, true);
                                        file.delete();
                                        BooleanValue = c1939;
                                    } else {
                                        C1939 c19392 = new C1939(AbstractC2328.m4341(-570504373764974L));
                                        file.delete();
                                        BooleanValue = c19392;
                                    }
                                }
                                return BooleanValue;
                            }
                            C1939 c19393 = new C1939(AbstractC2328.m4341(-570293920367470L));
                            file.delete();
                            BooleanValue = c19393;
                            file2.delete();
                            return BooleanValue;
                        } catch (Exception e) {
                            e = e;
                            C2336.f11496.m4355(AbstractC2328.m4341(-570547323437934L), e);
                            C1939 c19394 = new C1939(AbstractC2328.m4341(-570641812718446L) + e.getMessage());
                            try {
                                file.delete();
                                file2.delete();
                                break;
                            } catch (Throwable unused) {
                            }
                            return c19394;
                        }
                    }
                    AbstractC1544.m3189(obj);
                    if (str == null || AbstractC0473.m1313(str) || r1 == 0 || AbstractC0473.m1313(r1)) {
                        return new C1939(AbstractC2328.m4341(-570040517297006L));
                    }
                    File file3 = new File(context.getCacheDir(), (String) this.f6662);
                    File file4 = new File(context.getCacheDir(), (String) obj3);
                    try {
                        InterfaceC1659[] interfaceC1659Arr = {AbstractC2071.m3954(interfaceC0990, new C0393(file3, str, interfaceC0274, i4)), AbstractC2071.m3954(interfaceC0990, new C0393(file4, r1, interfaceC0274, i2))};
                        this.f6665 = interfaceC0990;
                        this.f6671 = file3;
                        this.f6669 = file4;
                        this.f6663 = 1;
                        objM1964 = AbstractC0879.m1964(interfaceC1659Arr, this);
                        if (objM1964 == r4) {
                            return r4;
                        }
                        file = file3;
                        file2 = file4;
                        List list2 = (List) objM1964;
                        zBooleanValue = ((Boolean) list2.get(0)).booleanValue();
                        BooleanValue = ((Boolean) list2.get(1)).booleanValue();
                        C2336.f11496.m4354(AbstractC2328.m4341(-570070582068078L) + zBooleanValue + AbstractC2328.m4341(-570177956250478L) + BooleanValue);
                        if (!zBooleanValue) {
                            C1939 c193932 = new C1939(AbstractC2328.m4341(-570293920367470L));
                            file.delete();
                            BooleanValue = c193932;
                            file2.delete();
                            break;
                        }
                        return BooleanValue;
                    } catch (Exception e2) {
                        e = e2;
                        file = file3;
                        file2 = file4;
                        C2336.f11496.m4355(AbstractC2328.m4341(-570547323437934L), e);
                        C1939 c193942 = new C1939(AbstractC2328.m4341(-570641812718446L) + e.getMessage());
                        file.delete();
                        file2.delete();
                        return c193942;
                    } catch (Throwable th2) {
                        th = th2;
                        r4 = file3;
                        r1 = file4;
                        try {
                            r4.delete();
                            r1.delete();
                            break;
                        } catch (Throwable unused2) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                break;
            default:
                C1186 c1186 = (C1186) obj3;
                Activity activity = c1186.f5429;
                int i5 = this.f6663;
                try {
                    try {
                        if (i5 == 0) {
                            AbstractC1544.m3189(obj);
                            OutputStream outputStreamOpenOutputStream = activity.getContentResolver().openOutputStream((Uri) obj2);
                            if (outputStreamOpenOutputStream == null) {
                                C0188.m800(AbstractC2328.m4341(-189248716833646L));
                                return null;
                            }
                            int iOrdinal = ((EnumC1947) r22).ordinal();
                            if (iOrdinal == 0) {
                                ZipOutputStream zipOutputStream2 = new ZipOutputStream(outputStreamOpenOutputStream);
                                c1186.m2383(AbstractC2328.m4341(-189291666506606L));
                                C2592.f12774.getClass();
                                JSONObject jSONObjectM4658 = C2592.m4658();
                                c1186.m2383(AbstractC2328.m4341(-189343206114158L));
                                zipOutputStream2.putNextEntry(new ZipEntry(AbstractC2328.m4341(-189394745721710L)));
                                C1186.m2378(zipOutputStream2, jSONObjectM4658, 16777216L, AbstractC2328.m4341(-189446285329262L));
                                zipOutputStream2.closeEntry();
                                c1186.m2383(AbstractC2328.m4341(-189467760165742L));
                                this.f6665 = null;
                                this.f6671 = outputStreamOpenOutputStream;
                                this.f6669 = c1186;
                                this.f6670 = null;
                                this.f6664 = zipOutputStream2;
                                this.f6662 = zipOutputStream2;
                                this.f6663 = 1;
                                objM4660 = C2592.m4660(activity, this);
                                if (objM4660 == r4) {
                                    return r4;
                                }
                                zipOutputStream = zipOutputStream2;
                                r22 = zipOutputStream2;
                                obj2 = outputStreamOpenOutputStream;
                                String strM4341 = AbstractC2328.m4341(-189519299773294L);
                                C2590 c2590 = C1186.f5426;
                                c1186.m2383(strM4341);
                                zipOutputStream.putNextEntry(new ZipEntry(AbstractC2328.m4341(-189570839380846L)));
                                C1186.m2378(zipOutputStream, (JSONObject) objM4660, 67108864L, AbstractC2328.m4341(-189635263890286L));
                                zipOutputStream.closeEntry();
                                AbstractC1367.m2774(r22, null);
                                r3 = obj2;
                            } else if (iOrdinal == 1) {
                                c1186.m2383(AbstractC2328.m4341(-189656738726766L));
                                C2592.f12774.getClass();
                                JSONObject jSONObjectM46582 = C2592.m4658();
                                c1186.m2383(AbstractC2328.m4341(-189708278334318L));
                                C1186.m2378(outputStreamOpenOutputStream, jSONObjectM46582, 16777216L, AbstractC2328.m4341(-189759817941870L));
                                r3 = outputStreamOpenOutputStream;
                            } else {
                                if (iOrdinal != 2) {
                                    throw new C1738();
                                }
                                c1186.m2383(AbstractC2328.m4341(-189781292778350L));
                                this.f6665 = null;
                                this.f6671 = outputStreamOpenOutputStream;
                                this.f6669 = c1186;
                                this.f6670 = outputStreamOpenOutputStream;
                                this.f6663 = 2;
                                C2592.f12774.getClass();
                                objM46602 = C2592.m4660(activity, this);
                                if (objM46602 == r4) {
                                    return r4;
                                }
                                OutputStream outputStream3 = outputStreamOpenOutputStream;
                                outputStream = outputStream3;
                                outputStream2 = outputStream3;
                                String strM43412 = AbstractC2328.m4341(-189832832385902L);
                                C2590 c25902 = C1186.f5426;
                                c1186.m2383(strM43412);
                                C1186.m2378(outputStream2, (JSONObject) objM46602, 67108864L, AbstractC2328.m4341(-189884371993454L));
                                r3 = outputStream;
                            }
                        } else if (i5 == 1) {
                            ZipOutputStream zipOutputStream3 = (ZipOutputStream) this.f6662;
                            ZipOutputStream zipOutputStream4 = (ZipOutputStream) this.f6664;
                            c1186 = (C1186) this.f6669;
                            Object obj4 = (OutputStream) this.f6671;
                            AbstractC1544.m3189(obj);
                            objM4660 = obj;
                            zipOutputStream = zipOutputStream3;
                            r22 = zipOutputStream4;
                            obj2 = obj4;
                            String strM43413 = AbstractC2328.m4341(-189519299773294L);
                            C2590 c25903 = C1186.f5426;
                            c1186.m2383(strM43413);
                            zipOutputStream.putNextEntry(new ZipEntry(AbstractC2328.m4341(-189570839380846L)));
                            C1186.m2378(zipOutputStream, (JSONObject) objM4660, 67108864L, AbstractC2328.m4341(-189635263890286L));
                            zipOutputStream.closeEntry();
                            AbstractC1367.m2774(r22, null);
                            r3 = obj2;
                        } else {
                            if (i5 != 2) {
                                C0188.m800(AbstractC2328.m4341(-189905846829934L));
                                return null;
                            }
                            OutputStream outputStream4 = (OutputStream) this.f6670;
                            c1186 = (C1186) this.f6669;
                            outputStream = (OutputStream) this.f6671;
                            try {
                                AbstractC1544.m3189(obj);
                                objM46602 = obj;
                                outputStream2 = outputStream4;
                                outputStream = outputStream;
                                String strM434122 = AbstractC2328.m4341(-189832832385902L);
                                C2590 c259022 = C1186.f5426;
                                c1186.m2383(strM434122);
                                C1186.m2378(outputStream2, (JSONObject) objM46602, 67108864L, AbstractC2328.m4341(-189884371993454L));
                                r3 = outputStream;
                            } catch (Throwable th4) {
                                th = th4;
                                r2 = outputStream;
                                try {
                                    throw th;
                                } catch (Throwable th5) {
                                    AbstractC1367.m2774(r2, th);
                                    throw th5;
                                }
                            }
                        }
                        AbstractC1367.m2774(r3, null);
                        return C2746.f13459;
                    } catch (Throwable th6) {
                        th = th6;
                        r2 = obj2;
                    }
                } finally {
                }
                break;
        }
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        int i = this.f6668;
        Object obj2 = this.f6667;
        Comparable comparable = this.f6672;
        Object obj3 = this.f6666;
        switch (i) {
            case 0:
                C1408 c1408 = new C1408((String) this.f6670, (String) this.f6664, (Context) obj2, (String) this.f6662, (String) obj3, (String) comparable, interfaceC0274);
                c1408.f6665 = obj;
                return c1408;
            default:
                C1408 c14082 = new C1408((Uri) comparable, interfaceC0274, (EnumC1947) obj2, (C1186) obj3);
                c14082.f6665 = obj;
                return c14082;
        }
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        int i = this.f6668;
        C2746 c2746 = C2746.f13459;
        InterfaceC0990 interfaceC0990 = (InterfaceC0990) obj;
        InterfaceC0274 interfaceC0274 = (InterfaceC0274) obj2;
        switch (i) {
        }
        return ((C1408) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408(Uri uri, InterfaceC0274 interfaceC0274, EnumC1947 enumC1947, C1186 c1186) {
        super(2, interfaceC0274);
        this.f6666 = c1186;
        this.f6672 = uri;
        this.f6667 = enumC1947;
    }
}

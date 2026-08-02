package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vi2 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f11976l;

    /* JADX INFO: renamed from: m */
    public int f11977m;

    /* JADX INFO: renamed from: n */
    public Object f11978n;

    /* JADX INFO: renamed from: o */
    public Object f11979o;

    /* JADX INFO: renamed from: p */
    public Object f11980p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f11981q;

    /* JADX INFO: renamed from: r */
    public Object f11982r;

    /* JADX INFO: renamed from: s */
    public Object f11983s;

    /* JADX INFO: renamed from: t */
    public Object f11984t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi2(xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3, xk1 xk1Var4, xk1 xk1Var5, Context context, t00 t00Var) {
        super(2, t00Var);
        this.f11976l = 1;
        this.f11979o = xk1Var;
        this.f11980p = xk1Var2;
        this.f11981q = xk1Var3;
        this.f11982r = xk1Var4;
        this.f11983s = xk1Var5;
        this.f11984t = context;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f11976l;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                return ((vi2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 1:
                return ((vi2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 2:
                return ((vi2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            default:
                return ((vi2) mo13p((t00) obj2, (ak0) obj)).mo7r(a83Var);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f11976l;
        Object obj2 = this.f11981q;
        switch (i) {
            case 0:
                return new vi2((wi2) obj2, t00Var);
            case 1:
                vi2 vi2Var = new vi2((xk1) this.f11979o, (xk1) this.f11980p, (xk1) obj2, (xk1) this.f11982r, (xk1) this.f11983s, (Context) this.f11984t, t00Var);
                vi2Var.f11978n = obj;
                return vi2Var;
            case 2:
                vi2 vi2Var2 = new vi2((vy1) this.f11980p, (xk1) obj2, (xk1) this.f11982r, (Context) this.f11983s, (xk1) this.f11984t, t00Var, 2);
                vi2Var2.f11979o = obj;
                return vi2Var2;
            default:
                vi2 vi2Var3 = new vi2((ContentResolver) this.f11980p, (Uri) obj2, (vf3) this.f11982r, (C0356jn) this.f11983s, (Context) this.f11984t, t00Var, 3);
                vi2Var3.f11979o = obj;
                return vi2Var3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x02f6, code lost:
    
        r0 = new p000.zf2(r3, r1, r11, r15);
        r9.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        if (r4.mo181m(r7, r14) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f6, code lost:
    
        if (r15.m4988n(r4, true, r14) == r5) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #3 {all -> 0x002e, blocks: (B:9:0x0028, B:19:0x0058, B:23:0x0069, B:25:0x0071, B:15:0x003e, B:18:0x004f), top: B:186:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:143:0x02c4 -> B:144:0x02c8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0095 -> B:10:0x002b). Please report as a decompilation issue!!! */
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7r(Object obj) throws Throwable {
        File canonicalFile;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        Object x92Var;
        Object next;
        Object x92Var2;
        Throwable thM6237a;
        vy1 vy1Var;
        ak0 ak0Var;
        C0319in c0319in;
        ak0 ak0Var2;
        C0319in c0319in2;
        Object objM2373b;
        int i = this.f11976l;
        a83 a83Var = a83.f116a;
        int i2 = 2;
        Object obj2 = this.f11981q;
        k20 k20Var = k20.f5323h;
        switch (i) {
            case 0:
                wi2 wi2Var = (wi2) obj2;
                int i3 = this.f11977m;
                ag2 ag2Var = ag2.f192h;
                if (i3 == 0) {
                    fg1.m1627T(obj);
                    File file = wi2Var.f12521c;
                    if (!file.exists()) {
                        canonicalFile = null;
                    } else if (Files.isSymbolicLink(file.toPath())) {
                        c80.m678v(vi0.m5690i("Script repository must not be a symbolic link: ", file.getPath()));
                    } else {
                        canonicalFile = file.getCanonicalFile();
                        if (!canonicalFile.isDirectory()) {
                            c80.m678v(vi0.m5690i("Script repository is not a directory: ", canonicalFile.getPath()));
                        }
                    }
                    if (canonicalFile == null) {
                        be0 be0Var = be0.f819h;
                        return new xi2(be0Var, be0Var);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    File[] fileArrListFiles = canonicalFile.listFiles();
                    if (fileArrListFiles != null) {
                        arrayList = arrayList3;
                        arrayList2 = arrayList4;
                        it = AbstractC0460mg.m3103r0(fileArrListFiles, new sl0(22)).iterator();
                        while (it.hasNext()) {
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        while (r15.hasNext()) {
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        while (r14.hasNext()) {
                        }
                        while (r14.hasNext()) {
                        }
                        return new xi2(AbstractC0142du.m1143A0(arrayList, new C0847wh(new sl0(21), i2)), AbstractC0142du.m1143A0(arrayList2, new sl0(23)));
                    }
                    c80.m678v(vi0.m5690i("Unable to list script repository: ", canonicalFile.getPath()));
                } else {
                    if (i3 == 1) {
                        File canonicalFile2 = (File) this.f11984t;
                        File file2 = (File) this.f11983s;
                        it = (Iterator) this.f11982r;
                        wi2 wi2Var2 = (wi2) this.f11980p;
                        arrayList2 = (ArrayList) this.f11979o;
                        arrayList = (ArrayList) this.f11978n;
                        try {
                            fg1.m1627T(obj);
                        } catch (Throwable th) {
                            th = th;
                            if (!(th instanceof CancellationException)) {
                            }
                        }
                        canonicalFile2.getClass();
                        arrayList.add(new z80(canonicalFile2, (th2) obj));
                        wi2Var = wi2Var2;
                        while (it.hasNext()) {
                            File file3 = (File) it.next();
                            if (!wi2.f12518d.contains(file3.getName()) && file3.exists()) {
                                if (Files.isSymbolicLink(file3.toPath())) {
                                    arrayList2.add(new zf2(file3, ag2Var, "Symbolic links are not supported as script directories.", null));
                                } else if (file3.isDirectory()) {
                                    try {
                                    } catch (Throwable th2) {
                                        wi2Var2 = wi2Var;
                                        file2 = file3;
                                        th = th2;
                                        if (!(th instanceof CancellationException)) {
                                            throw th;
                                        }
                                        File absoluteFile = file2.getAbsoluteFile();
                                        absoluteFile.getClass();
                                        String message = th.getMessage();
                                        if (message == null) {
                                            zf2 zf2Var = new zf2(absoluteFile, ag2Var, "Unable to read script directory.", th);
                                            arrayList2.add(zf2Var);
                                        } else {
                                            zf2 zf2Var2 = new zf2(absoluteFile, ag2Var, "Unable to read script directory.", th);
                                            arrayList2.add(zf2Var2);
                                        }
                                        wi2Var = wi2Var2;
                                        while (it.hasNext()) {
                                        }
                                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                        while (r15.hasNext()) {
                                        }
                                        LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                                        while (r14.hasNext()) {
                                        }
                                        while (r14.hasNext()) {
                                        }
                                        return new xi2(AbstractC0142du.m1143A0(arrayList, new C0847wh(new sl0(21), i2)), AbstractC0142du.m1143A0(arrayList2, new sl0(23)));
                                    }
                                    canonicalFile2 = file3.getCanonicalFile();
                                    j51 j51Var = wi2Var.f12519a;
                                    canonicalFile2.getClass();
                                    sz0 sz0Var = new sz0(canonicalFile2, wi2Var.f12520b);
                                    this.f11978n = arrayList;
                                    this.f11979o = arrayList2;
                                    this.f11980p = wi2Var;
                                    this.f11982r = it;
                                    this.f11983s = file3;
                                    this.f11984t = canonicalFile2;
                                    this.f11977m = 1;
                                    Object objM2454z = j51Var.m2454z(sz0Var, this);
                                    if (objM2454z == k20Var) {
                                        return k20Var;
                                    }
                                    wi2 wi2Var3 = wi2Var;
                                    file2 = file3;
                                    obj = objM2454z;
                                    wi2Var2 = wi2Var3;
                                    canonicalFile2.getClass();
                                    arrayList.add(new z80(canonicalFile2, (th2) obj));
                                    wi2Var = wi2Var2;
                                    while (it.hasNext()) {
                                    }
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap32 = new LinkedHashMap();
                        for (Object obj3 : arrayList) {
                            String str = ((z80) obj3).f13783b.f10774c;
                            Object arrayList5 = linkedHashMap32.get(str);
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                                linkedHashMap32.put(str, arrayList5);
                            }
                            ((List) arrayList5).add(obj3);
                        }
                        LinkedHashMap linkedHashMap222 = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMap32.entrySet()) {
                            if (((List) entry.getValue()).size() > 1) {
                                linkedHashMap222.put(entry.getKey(), entry.getValue());
                            }
                        }
                        for (Map.Entry entry2 : linkedHashMap222.entrySet()) {
                            String str2 = (String) entry2.getKey();
                            Iterator it2 = ((List) entry2.getValue()).iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(new zf2(((z80) it2.next()).f13782a, ag2.f193i, vi0.m5691j("Multiple script directories declare the id '", str2, "'."), null));
                            }
                        }
                        return new xi2(AbstractC0142du.m1143A0(arrayList, new C0847wh(new sl0(21), i2)), AbstractC0142du.m1143A0(arrayList2, new sl0(23)));
                    }
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 1:
                xk1 xk1Var = (xk1) this.f11983s;
                xk1 xk1Var2 = (xk1) this.f11982r;
                xk1 xk1Var3 = (xk1) obj2;
                int i4 = this.f11977m;
                try {
                    if (i4 == 0) {
                        fg1.m1627T(obj);
                        String str3 = (String) ((xk1) this.f11979o).getValue();
                        Iterator it3 = ((tq1) ((xk1) this.f11980p).getValue()).f10899a.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (t11.m5086l(((cq1) next).f1675a, str3)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        cq1 cq1Var = (cq1) next;
                        xk1Var3.setValue(null);
                        xk1Var2.setValue(null);
                        if (str3 == null || cq1Var == null || !cq1Var.f1679e) {
                            return a83Var;
                        }
                        xk1Var.setValue(Boolean.TRUE);
                        sq1 sq1Var = sq1.f10305a;
                        this.f11978n = null;
                        this.f11977m = 1;
                        obj = sq1Var.m4981e(str3, this);
                        if (obj == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i4 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(obj);
                    }
                    x92Var = (uq1) obj;
                    break;
                } catch (Throwable th3) {
                    x92Var = new x92(th3);
                }
                if (!(x92Var instanceof x92)) {
                    xk1Var3.setValue((uq1) x92Var);
                }
                Context context = (Context) this.f11984t;
                Throwable thM6237a2 = y92.m6237a(x92Var);
                if (thM6237a2 != null) {
                    String message2 = thM6237a2.getMessage();
                    if (message2 == null) {
                        message2 = context.getString(R.string.script_settings_read_failed);
                        message2.getClass();
                    }
                    xk1Var2.setValue(message2);
                }
                xk1Var.setValue(Boolean.FALSE);
                return a83Var;
            case 2:
                xk1 xk1Var4 = (xk1) this.f11982r;
                int i5 = this.f11977m;
                try {
                } catch (Throwable th4) {
                    x92Var2 = new x92(th4);
                }
                if (i5 == 0) {
                    fg1.m1627T(obj);
                    vy1Var = (vy1) this.f11980p;
                    sq1 sq1Var2 = sq1.f10305a;
                    String str4 = vy1Var.f12224a;
                    this.f11979o = null;
                    this.f11978n = vy1Var;
                    this.f11977m = 1;
                    if (sq1Var2.m4979c(str4, this) == k20Var) {
                    }
                    return k20Var;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj);
                    x92Var2 = a83Var;
                    xk1 xk1Var5 = (xk1) obj2;
                    if (!(x92Var2 instanceof x92)) {
                        xk1Var5.setValue(null);
                        xk1Var4.setValue(null);
                    }
                    Context context2 = (Context) this.f11983s;
                    thM6237a = y92.m6237a(x92Var2);
                    if (thM6237a != null) {
                        String message3 = thM6237a.getMessage();
                        if (message3 == null) {
                            message3 = context2.getString(R.string.script_settings_authorization_save_failed);
                            message3.getClass();
                        }
                        xk1Var4.setValue(message3);
                    }
                    ((xk1) this.f11984t).setValue(Boolean.FALSE);
                    return a83Var;
                }
                vy1Var = (vy1) this.f11978n;
                fg1.m1627T(obj);
                if (vy1Var.f12227d) {
                    sq1 sq1Var3 = sq1.f10305a;
                    String str5 = vy1Var.f12224a;
                    this.f11979o = null;
                    this.f11978n = null;
                    this.f11977m = 2;
                    break;
                }
                x92Var2 = a83Var;
                xk1 xk1Var52 = (xk1) obj2;
                if (!(x92Var2 instanceof x92)) {
                }
                Context context22 = (Context) this.f11983s;
                thM6237a = y92.m6237a(x92Var2);
                if (thM6237a != null) {
                }
                ((xk1) this.f11984t).setValue(Boolean.FALSE);
                return a83Var;
            default:
                vf3 vf3Var = (vf3) this.f11982r;
                ContentResolver contentResolver = (ContentResolver) this.f11980p;
                int i6 = this.f11977m;
                try {
                    if (i6 == 0) {
                        fg1.m1627T(obj);
                        ak0Var = (ak0) this.f11979o;
                        contentResolver.registerContentObserver((Uri) obj2, false, vf3Var);
                        c0319in = new C0319in((C0356jn) this.f11983s);
                        this.f11979o = ak0Var;
                        this.f11978n = c0319in;
                        this.f11977m = 1;
                        objM2373b = c0319in.m2373b(this);
                        if (objM2373b != k20Var) {
                        }
                    } else if (i6 == 1) {
                        c0319in2 = (C0319in) this.f11978n;
                        ak0Var2 = (ak0) this.f11979o;
                        fg1.m1627T(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i6 != 2) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c0319in2 = (C0319in) this.f11978n;
                        ak0Var2 = (ak0) this.f11979o;
                        fg1.m1627T(obj);
                        ak0Var = ak0Var2;
                        c0319in = c0319in2;
                        this.f11979o = ak0Var;
                        this.f11978n = c0319in;
                        this.f11977m = 1;
                        objM2373b = c0319in.m2373b(this);
                        if (objM2373b != k20Var) {
                            return k20Var;
                        }
                        C0319in c0319in3 = c0319in;
                        ak0Var2 = ak0Var;
                        obj = objM2373b;
                        c0319in2 = c0319in3;
                        if (((Boolean) obj).booleanValue()) {
                            return a83Var;
                        }
                        c0319in2.m2374c();
                        Context context3 = (Context) this.f11984t;
                        rk1 rk1Var = wf3.f12494a;
                        Float f = new Float(Settings.Global.getFloat(context3.getContentResolver(), "animator_duration_scale", 1.0f));
                        this.f11979o = ak0Var2;
                        this.f11978n = c0319in2;
                        this.f11977m = 2;
                        break;
                    }
                } finally {
                    contentResolver.unregisterContentObserver(vf3Var);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi2(wi2 wi2Var, t00 t00Var) {
        super(2, t00Var);
        this.f11976l = 0;
        this.f11981q = wi2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vi2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, t00 t00Var, int i) {
        super(2, t00Var);
        this.f11976l = i;
        this.f11980p = obj;
        this.f11981q = obj2;
        this.f11982r = obj3;
        this.f11983s = obj4;
        this.f11984t = obj5;
    }
}

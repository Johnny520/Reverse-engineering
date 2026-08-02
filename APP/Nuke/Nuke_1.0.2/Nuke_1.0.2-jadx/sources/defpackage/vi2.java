package defpackage;

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
    public final /* synthetic */ int l;
    public int m;
    public Object n;
    public Object o;
    public Object p;
    public final /* synthetic */ Object q;
    public Object r;
    public Object s;
    public Object t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi2(xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3, xk1 xk1Var4, xk1 xk1Var5, Context context, t00 t00Var) {
        super(2, t00Var);
        this.l = 1;
        this.o = xk1Var;
        this.p = xk1Var2;
        this.q = xk1Var3;
        this.r = xk1Var4;
        this.s = xk1Var5;
        this.t = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.l;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                return ((vi2) p((t00) obj2, (j20) obj)).r(a83Var);
            case 1:
                return ((vi2) p((t00) obj2, (j20) obj)).r(a83Var);
            case 2:
                return ((vi2) p((t00) obj2, (j20) obj)).r(a83Var);
            default:
                return ((vi2) p((t00) obj2, (ak0) obj)).r(a83Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.l;
        Object obj2 = this.q;
        switch (i) {
            case 0:
                return new vi2((wi2) obj2, t00Var);
            case 1:
                vi2 vi2Var = new vi2((xk1) this.o, (xk1) this.p, (xk1) obj2, (xk1) this.r, (xk1) this.s, (Context) this.t, t00Var);
                vi2Var.n = obj;
                return vi2Var;
            case 2:
                vi2 vi2Var2 = new vi2((vy1) this.p, (xk1) obj2, (xk1) this.r, (Context) this.s, (xk1) this.t, t00Var, 2);
                vi2Var2.o = obj;
                return vi2Var2;
            default:
                vi2 vi2Var3 = new vi2((ContentResolver) this.p, (Uri) obj2, (vf3) this.r, (jn) this.s, (Context) this.t, t00Var, 3);
                vi2Var3.o = obj;
                return vi2Var3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:153:0x02f0) to fix multi-entry loop: BACK_EDGE: B:153:0x02f0 -> B:154:0x02f6 */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02f6, code lost:
    
        r0 = new defpackage.zf2(r3, r1, r11, r15);
        r9.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        if (r4.m(r7, r14) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f6, code lost:
    
        if (r15.n(r4, true, r14) == r5) goto L53;
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
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) throws Throwable {
        File canonicalFile;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        Object x92Var;
        Object next;
        Object x92Var2;
        Throwable thA;
        vy1 vy1Var;
        ak0 ak0Var;
        in inVar;
        ak0 ak0Var2;
        in inVar2;
        Object objB;
        int i = this.l;
        a83 a83Var = a83.a;
        int i2 = 2;
        Object obj2 = this.q;
        k20 k20Var = k20.h;
        switch (i) {
            case 0:
                wi2 wi2Var = (wi2) obj2;
                int i3 = this.m;
                ag2 ag2Var = ag2.h;
                if (i3 == 0) {
                    fg1.T(obj);
                    File file = wi2Var.c;
                    if (!file.exists()) {
                        canonicalFile = null;
                    } else if (Files.isSymbolicLink(file.toPath())) {
                        c80.v(vi0.i("Script repository must not be a symbolic link: ", file.getPath()));
                    } else {
                        canonicalFile = file.getCanonicalFile();
                        if (!canonicalFile.isDirectory()) {
                            c80.v(vi0.i("Script repository is not a directory: ", canonicalFile.getPath()));
                        }
                    }
                    if (canonicalFile == null) {
                        be0 be0Var = be0.h;
                        return new xi2(be0Var, be0Var);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    File[] fileArrListFiles = canonicalFile.listFiles();
                    if (fileArrListFiles != null) {
                        arrayList = arrayList3;
                        arrayList2 = arrayList4;
                        it = mg.r0(fileArrListFiles, new sl0(22)).iterator();
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
                        return new xi2(du.A0(arrayList, new wh(new sl0(21), i2)), du.A0(arrayList2, new sl0(23)));
                    }
                    c80.v(vi0.i("Unable to list script repository: ", canonicalFile.getPath()));
                } else {
                    if (i3 == 1) {
                        File canonicalFile2 = (File) this.t;
                        File file2 = (File) this.s;
                        it = (Iterator) this.r;
                        wi2 wi2Var2 = (wi2) this.p;
                        arrayList2 = (ArrayList) this.o;
                        arrayList = (ArrayList) this.n;
                        try {
                            fg1.T(obj);
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
                            if (!wi2.d.contains(file3.getName()) && file3.exists()) {
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
                                        return new xi2(du.A0(arrayList, new wh(new sl0(21), i2)), du.A0(arrayList2, new sl0(23)));
                                    }
                                    canonicalFile2 = file3.getCanonicalFile();
                                    j51 j51Var = wi2Var.a;
                                    canonicalFile2.getClass();
                                    sz0 sz0Var = new sz0(canonicalFile2, wi2Var.b);
                                    this.n = arrayList;
                                    this.o = arrayList2;
                                    this.p = wi2Var;
                                    this.r = it;
                                    this.s = file3;
                                    this.t = canonicalFile2;
                                    this.m = 1;
                                    Object objZ = j51Var.z(sz0Var, this);
                                    if (objZ == k20Var) {
                                        return k20Var;
                                    }
                                    wi2 wi2Var3 = wi2Var;
                                    file2 = file3;
                                    obj = objZ;
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
                            String str = ((z80) obj3).b.c;
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
                                arrayList2.add(new zf2(((z80) it2.next()).a, ag2.i, vi0.j("Multiple script directories declare the id '", str2, "'."), null));
                            }
                        }
                        return new xi2(du.A0(arrayList, new wh(new sl0(21), i2)), du.A0(arrayList2, new sl0(23)));
                    }
                    s.l("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 1:
                xk1 xk1Var = (xk1) this.s;
                xk1 xk1Var2 = (xk1) this.r;
                xk1 xk1Var3 = (xk1) obj2;
                int i4 = this.m;
                try {
                    if (i4 == 0) {
                        fg1.T(obj);
                        String str3 = (String) ((xk1) this.o).getValue();
                        Iterator it3 = ((tq1) ((xk1) this.p).getValue()).a.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (t11.l(((cq1) next).a, str3)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        cq1 cq1Var = (cq1) next;
                        xk1Var3.setValue(null);
                        xk1Var2.setValue(null);
                        if (str3 == null || cq1Var == null || !cq1Var.e) {
                            return a83Var;
                        }
                        xk1Var.setValue(Boolean.TRUE);
                        sq1 sq1Var = sq1.a;
                        this.n = null;
                        this.m = 1;
                        obj = sq1Var.e(str3, this);
                        if (obj == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i4 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(obj);
                    }
                    x92Var = (uq1) obj;
                    break;
                } catch (Throwable th3) {
                    x92Var = new x92(th3);
                }
                if (!(x92Var instanceof x92)) {
                    xk1Var3.setValue((uq1) x92Var);
                }
                Context context = (Context) this.t;
                Throwable thA2 = y92.a(x92Var);
                if (thA2 != null) {
                    String message2 = thA2.getMessage();
                    if (message2 == null) {
                        message2 = context.getString(R.string.script_settings_read_failed);
                        message2.getClass();
                    }
                    xk1Var2.setValue(message2);
                }
                xk1Var.setValue(Boolean.FALSE);
                return a83Var;
            case 2:
                xk1 xk1Var4 = (xk1) this.r;
                int i5 = this.m;
                try {
                } catch (Throwable th4) {
                    x92Var2 = new x92(th4);
                }
                if (i5 == 0) {
                    fg1.T(obj);
                    vy1Var = (vy1) this.p;
                    sq1 sq1Var2 = sq1.a;
                    String str4 = vy1Var.a;
                    this.o = null;
                    this.n = vy1Var;
                    this.m = 1;
                    if (sq1Var2.c(str4, this) == k20Var) {
                    }
                    return k20Var;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.T(obj);
                    x92Var2 = a83Var;
                    xk1 xk1Var5 = (xk1) obj2;
                    if (!(x92Var2 instanceof x92)) {
                        xk1Var5.setValue(null);
                        xk1Var4.setValue(null);
                    }
                    Context context2 = (Context) this.s;
                    thA = y92.a(x92Var2);
                    if (thA != null) {
                        String message3 = thA.getMessage();
                        if (message3 == null) {
                            message3 = context2.getString(R.string.script_settings_authorization_save_failed);
                            message3.getClass();
                        }
                        xk1Var4.setValue(message3);
                    }
                    ((xk1) this.t).setValue(Boolean.FALSE);
                    return a83Var;
                }
                vy1Var = (vy1) this.n;
                fg1.T(obj);
                if (vy1Var.d) {
                    sq1 sq1Var3 = sq1.a;
                    String str5 = vy1Var.a;
                    this.o = null;
                    this.n = null;
                    this.m = 2;
                    break;
                }
                x92Var2 = a83Var;
                xk1 xk1Var52 = (xk1) obj2;
                if (!(x92Var2 instanceof x92)) {
                }
                Context context22 = (Context) this.s;
                thA = y92.a(x92Var2);
                if (thA != null) {
                }
                ((xk1) this.t).setValue(Boolean.FALSE);
                return a83Var;
            default:
                vf3 vf3Var = (vf3) this.r;
                ContentResolver contentResolver = (ContentResolver) this.p;
                int i6 = this.m;
                try {
                    if (i6 == 0) {
                        fg1.T(obj);
                        ak0Var = (ak0) this.o;
                        contentResolver.registerContentObserver((Uri) obj2, false, vf3Var);
                        inVar = new in((jn) this.s);
                        this.o = ak0Var;
                        this.n = inVar;
                        this.m = 1;
                        objB = inVar.b(this);
                        if (objB != k20Var) {
                        }
                    } else if (i6 == 1) {
                        inVar2 = (in) this.n;
                        ak0Var2 = (ak0) this.o;
                        fg1.T(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i6 != 2) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        inVar2 = (in) this.n;
                        ak0Var2 = (ak0) this.o;
                        fg1.T(obj);
                        ak0Var = ak0Var2;
                        inVar = inVar2;
                        this.o = ak0Var;
                        this.n = inVar;
                        this.m = 1;
                        objB = inVar.b(this);
                        if (objB != k20Var) {
                            return k20Var;
                        }
                        in inVar3 = inVar;
                        ak0Var2 = ak0Var;
                        obj = objB;
                        inVar2 = inVar3;
                        if (((Boolean) obj).booleanValue()) {
                            return a83Var;
                        }
                        inVar2.c();
                        Context context3 = (Context) this.t;
                        rk1 rk1Var = wf3.a;
                        Float f = new Float(Settings.Global.getFloat(context3.getContentResolver(), "animator_duration_scale", 1.0f));
                        this.o = ak0Var2;
                        this.n = inVar2;
                        this.m = 2;
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
        this.l = 0;
        this.q = wi2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vi2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, t00 t00Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.p = obj;
        this.q = obj2;
        this.r = obj3;
        this.s = obj4;
        this.t = obj5;
    }
}

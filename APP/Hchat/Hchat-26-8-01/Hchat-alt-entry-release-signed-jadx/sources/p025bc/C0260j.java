package p025bc;

import be.AbstractC0269a;
import bsh.NameSpace;
import bsh.Reflect;
import bsh.StringUtil;
import ca.C0532s;
import com.alibaba.fastjson2.reader.ObjectReaderCreator;
import com.alibaba.fastjson2.reader.ObjectReaderImplList;
import com.alibaba.fastjson2.reader.ObjectReaderImplMap;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import p080fb.C1124g0;
import p084ff.C1215a;
import p198nb.C2924a;
import p246qd.AbstractC3506j;
import p258r8.C3739d;
import p302ud.C4309e;
import p332wb.C5518yt;

/* JADX INFO: renamed from: bc.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0260j implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f761a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f762b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0260j(Object obj, int i9) {
        this.f761a = i9;
        this.f762b = obj;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.alibaba.fastjson2.reader.ObjectReaderCreator.a(java.lang.Object, java.lang.reflect.Method):java.lang.Object */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f761a) {
            case 0:
                return ((C0261k) this.f762b).m1039b((C4309e) obj);
            case 1:
                return Reflect.getVariable((NameSpace) this.f762b, (String) obj);
            case 2:
                return StringUtil.lambda$getTypeNames$1((Iterator) this.f762b, (String) obj);
            case 3:
                return ObjectReaderCreator.lambda$createBuildFunction$3((Method) this.f762b, obj);
            case 4:
                return ObjectReaderImplList.lambda$of$0((Type) this.f762b, obj);
            case 5:
                return ((ObjectReaderImplList) this.f762b).lambda$readJSONBObject$11(obj);
            case 6:
                return ObjectReaderImplMap.lambda$createObjectSupplier$1((Constructor) this.f762b, obj);
            case 7:
                return ((C1124g0) this.f762b).invoke(obj);
            case 8:
                return ((C1124g0) this.f762b).invoke(obj);
            case 9:
                return (ReentrantLock) ((C1124g0) this.f762b).invoke(obj);
            case 10:
                C1215a c1215a = (C1215a) this.f762b;
                File file = (File) obj;
                c1215a.getClass();
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        List listM3350c = c1215a.m3350c(file, fileInputStream, file.getAbsolutePath());
                        fileInputStream.close();
                        return listM3350c;
                    } finally {
                        try {
                            break;
                        } catch (Throwable th2) {
                        }
                    }
                } catch (Exception e6) {
                    C1215a.f4076c.mo6260n(file.getAbsolutePath(), "File open error: {}", e6);
                    return Collections.EMPTY_LIST;
                }
            case 11:
                return (AbstractC3506j) ((List) this.f762b).get(((Integer) obj).intValue());
            case 12:
                return (C3739d) ((C0532s) this.f762b).invoke(obj);
            case 13:
                return (C5518yt) ((C2924a) this.f762b).invoke(obj);
            case 14:
                Function function = (Function) this.f762b;
                if (obj != null) {
                    throw new ClassCastException();
                }
                throw null;
            case 15:
                return (String) ((Map) this.f762b).get((AbstractC0269a) obj);
            default:
                return (List) ((C2924a) this.f762b).invoke(obj);
        }
    }
}

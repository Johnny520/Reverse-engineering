package p281;

import bsh.Interpreter;
import bsh.Primitive;
import bsh.security.SecurityError;
import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言楪子世哲苏兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashSet f23117;

    public C8372() {
        HashSet hashSet = new HashSet();
        this.f23117 = hashSet;
        hashSet.add(new C8373());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m13871(Object obj, String str, Object obj2) throws SecurityError {
        Object objUnwrap = Primitive.unwrap(obj2);
        Iterator it = this.f23117.iterator();
        while (it.hasNext()) {
            ((C8373) it.next()).getClass();
            if (obj instanceof C8372) {
                throw SecurityError.cantSetField(obj, str, objUnwrap);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13872(Class cls, String str, Object[] objArr) {
        Object[] objArrUnwrap = Primitive.unwrap(objArr);
        Iterator it = this.f23117.iterator();
        while (it.hasNext()) {
            ((C8373) it.next()).getClass();
        }
        if (str.equals("getLength") && objArrUnwrap.length == 1 && cls.isAssignableFrom(Array.class)) {
            Object obj = objArrUnwrap[0];
            try {
                m13875();
            } catch (SecurityError unused) {
                throw SecurityError.reflectCantGetField(obj, "length");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0101  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13873(java.lang.Object r8, java.lang.String r9, java.lang.Object[] r10) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p281.C8372.m13873(java.lang.Object, java.lang.String, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13874(Class cls, String str) {
        Iterator it = this.f23117.iterator();
        while (it.hasNext()) {
            ((C8373) it.next()).getClass();
            if (cls == Interpreter.class && str.equals("mainSecurityGuard")) {
                throw SecurityError.cantGetStaticField(cls, str);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13875() {
        Iterator it = this.f23117.iterator();
        while (it.hasNext()) {
            ((C8373) it.next()).getClass();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13876(Class cls, Object[] objArr) throws SecurityError {
        Object[] objArrUnwrap = Primitive.unwrap(objArr);
        Iterator it = this.f23117.iterator();
        while (it.hasNext()) {
            ((C8373) it.next()).getClass();
            if (C8372.class.isAssignableFrom(cls) || C8373.class.isAssignableFrom(cls)) {
                throw SecurityError.cantConstruct(cls, objArrUnwrap);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m13877(Class cls, String str, Object obj) throws SecurityError {
        Object objUnwrap = Primitive.unwrap(obj);
        Iterator it = this.f23117.iterator();
        while (it.hasNext()) {
            ((C8373) it.next()).getClass();
            if (cls == Interpreter.class && str.equals("mainSecurityGuard")) {
                throw SecurityError.cantSetStaticField(cls, str, objUnwrap);
            }
        }
    }
}

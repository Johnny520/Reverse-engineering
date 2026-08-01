package p281;

import bsh.Interpreter;
import bsh.Primitive;
import bsh.security.SecurityError;
import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言楪子世哲苏兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8371 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashSet f23118;

    public C8371() {
        HashSet hashSet = new HashSet();
        this.f23118 = hashSet;
        hashSet.add(new C8372());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m13854(Object obj, String str, Object obj2) throws SecurityError {
        Object objUnwrap = Primitive.unwrap(obj2);
        Iterator it = this.f23118.iterator();
        while (it.hasNext()) {
            ((C8372) it.next()).getClass();
            if (obj instanceof C8371) {
                throw SecurityError.cantSetField(obj, str, objUnwrap);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13855(Class cls, String str, Object[] objArr) {
        Object[] objArrUnwrap = Primitive.unwrap(objArr);
        Iterator it = this.f23118.iterator();
        while (it.hasNext()) {
            ((C8372) it.next()).getClass();
        }
        if (str.equals("getLength") && objArrUnwrap.length == 1 && cls.isAssignableFrom(Array.class)) {
            Object obj = objArrUnwrap[0];
            try {
                m13858();
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
    public final void m13856(java.lang.Object r8, java.lang.String r9, java.lang.Object[] r10) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p281.C8371.m13856(java.lang.Object, java.lang.String, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13857(Class cls, String str) {
        Iterator it = this.f23118.iterator();
        while (it.hasNext()) {
            ((C8372) it.next()).getClass();
            if (cls == Interpreter.class && str.equals("mainSecurityGuard")) {
                throw SecurityError.cantGetStaticField(cls, str);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13858() {
        Iterator it = this.f23118.iterator();
        while (it.hasNext()) {
            ((C8372) it.next()).getClass();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13859(Class cls, Object[] objArr) throws SecurityError {
        Object[] objArrUnwrap = Primitive.unwrap(objArr);
        Iterator it = this.f23118.iterator();
        while (it.hasNext()) {
            ((C8372) it.next()).getClass();
            if (C8371.class.isAssignableFrom(cls) || C8372.class.isAssignableFrom(cls)) {
                throw SecurityError.cantConstruct(cls, objArrUnwrap);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m13860(Class cls, String str, Object obj) throws SecurityError {
        Object objUnwrap = Primitive.unwrap(obj);
        Iterator it = this.f23118.iterator();
        while (it.hasNext()) {
            ((C8372) it.next()).getClass();
            if (cls == Interpreter.class && str.equals("mainSecurityGuard")) {
                throw SecurityError.cantSetStaticField(cls, str, objUnwrap);
            }
        }
    }
}

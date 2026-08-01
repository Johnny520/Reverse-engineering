package p271;

import androidx.activity.AbstractC0053;
import com.google.gson.AbstractC3250;
import com.google.gson.JsonIOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p259.C8243;
import p269.AbstractC8267;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8312 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3250 f22931;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ Method f22932;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ boolean f22933;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f22934;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Field f22935;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22936;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ boolean f22937;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3250 f22938;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* synthetic */ boolean f22939;

    public C8312(String str, Field field, boolean z, Method method, AbstractC3250 abstractC3250, AbstractC3250 abstractC32502, boolean z2, boolean z3) {
        this.f22933 = z;
        this.f22932 = method;
        this.f22931 = abstractC3250;
        this.f22938 = abstractC32502;
        this.f22937 = z2;
        this.f22939 = z3;
        this.f22936 = str;
        this.f22935 = field;
        this.f22934 = field.getName();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13830(C8243 c8243, Object obj) throws IllegalAccessException {
        Object objInvoke;
        boolean z = this.f22933;
        Field field = this.f22935;
        Method method = this.f22932;
        if (z) {
            if (method == null) {
                C8294.m13822(obj, field);
            } else {
                C8294.m13822(obj, method);
            }
        }
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new JsonIOException(AbstractC0053.m156("Accessor ", AbstractC8267.m13816(method, false), " threw exception"), e.getCause());
            }
        } else {
            objInvoke = field.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        c8243.m13766(this.f22936);
        this.f22931.mo7335(c8243, objInvoke);
    }
}

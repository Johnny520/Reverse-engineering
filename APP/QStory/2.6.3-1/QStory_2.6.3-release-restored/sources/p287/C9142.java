package p287;

import androidx.activity.AbstractC0900;
import com.google.gson.AbstractC4083;
import com.google.gson.JsonIOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p275.C9073;
import p285.AbstractC9097;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9142 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4083 f23275;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ Method f23276;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ boolean f23277;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f23278;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Field f23279;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f23280;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ boolean f23281;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4083 f23282;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* synthetic */ boolean f23283;

    public C9142(String str, Field field, boolean z, Method method, AbstractC4083 abstractC4083, AbstractC4083 abstractC40832, boolean z2, boolean z3) {
        this.f23277 = z;
        this.f23276 = method;
        this.f23275 = abstractC4083;
        this.f23282 = abstractC40832;
        this.f23281 = z2;
        this.f23283 = z3;
        this.f23280 = str;
        this.f23279 = field;
        this.f23278 = field.getName();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14406(C9073 c9073, Object obj) throws IllegalAccessException {
        Object objInvoke;
        boolean z = this.f23277;
        Field field = this.f23279;
        Method method = this.f23276;
        if (z) {
            if (method == null) {
                C9124.m14398(obj, field);
            } else {
                C9124.m14398(obj, method);
            }
        }
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new JsonIOException(AbstractC0900.m718("Accessor ", AbstractC9097.m14392(method, false), " threw exception"), e.getCause());
            }
        } else {
            objInvoke = field.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        c9073.m14342(this.f23280);
        this.f23275.mo7881(c9073, objInvoke);
    }
}

package p271;

import androidx.activity.AbstractC0053;
import com.google.gson.AbstractC3251;
import com.google.gson.JsonIOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p259.C8244;
import p269.AbstractC8268;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8313 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3251 f22930;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ Method f22931;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ boolean f22932;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f22933;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Field f22934;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22935;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ boolean f22936;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3251 f22937;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* synthetic */ boolean f22938;

    public C8313(String str, Field field, boolean z, Method method, AbstractC3251 abstractC3251, AbstractC3251 abstractC32512, boolean z2, boolean z3) {
        this.f22932 = z;
        this.f22931 = method;
        this.f22930 = abstractC3251;
        this.f22937 = abstractC32512;
        this.f22936 = z2;
        this.f22938 = z3;
        this.f22935 = str;
        this.f22934 = field;
        this.f22933 = field.getName();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13847(C8244 c8244, Object obj) throws IllegalAccessException {
        Object objInvoke;
        boolean z = this.f22932;
        Field field = this.f22934;
        Method method = this.f22931;
        if (z) {
            if (method == null) {
                C8295.m13839(obj, field);
            } else {
                C8295.m13839(obj, method);
            }
        }
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new JsonIOException(AbstractC0053.m158("Accessor ", AbstractC8268.m13833(method, false), " threw exception"), e.getCause());
            }
        } else {
            objInvoke = field.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        c8244.m13783(this.f22935);
        this.f22930.mo7322(c8244, objInvoke);
    }
}

package p055;

import com.davemorrissey.labs.subscaleview.C0328R;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5220;
import lin.xposed.hook.util.p011qq.QQMessageUtils;
import p042.InterfaceC7141;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import p054.C7206;
import p091.C7787;
import p303.AbstractC9234;
import p337.C9527;
import p337.CallableC9526;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7246 implements InterfaceC7141 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Method f17943;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Class f17944;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17945;

    public /* synthetic */ C7246(Class cls, Method method, int i) {
        this.f17945 = i;
        this.f17943 = method;
        this.f17944 = cls;
    }

    @Override // p042.InterfaceC7141
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException, InvocationTargetException {
        int i = this.f17945;
        Class cls = this.f17944;
        Method method = this.f17943;
        int i2 = 0;
        switch (i) {
            case 0:
                Object objInvoke = method.invoke(methodHookParam.thisObject, null);
                C7164 c7164M12413 = C7164.m12413(cls);
                c7164M12413.f17803.f3963 = AbstractC9234.m14531(164);
                Object objM12415 = c7164M12413.m12415(objInvoke, new Object[0]);
                int iIntValue = ((Integer) AbstractC7165.m12418(Integer.TYPE, AbstractC9234.m14531(125), objM12415)).intValue();
                ArrayList arrayList = (ArrayList) AbstractC7165.m12418(ArrayList.class, AbstractC9234.m14531(152), objM12415);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList) {
                    C7164 c7164M124132 = C7164.m12413(obj.getClass());
                    c7164M124132.f17803.f3963 = AbstractC9234.m14531(140);
                    c7164M124132.f17803.f3962 = AbstractC7166.m12425(AbstractC9234.m14531(178));
                    Object objM124152 = c7164M124132.m12415(obj, new Object[0]);
                    if (objM124152 != null) {
                        arrayList3.add(((String) AbstractC7165.m12418(String.class, AbstractC9234.m14531(179), objM124152)).toUpperCase());
                        arrayList2.add(QQMessageUtils.getPicElementUrl(iIntValue, objM124152));
                    }
                }
                ((List) methodHookParam.getResult()).add(0, C7206.m12520(objInvoke, AbstractC9234.m14531(180), C0328R.mipmap.ic_launcher_round, new CallableC7249(arrayList2, arrayList3, 1)));
                break;
            default:
                C7787 c7787 = C9527.f24865;
                Object objInvoke2 = method.invoke(methodHookParam.thisObject, null);
                C7164 c7164M124133 = C7164.m12413(cls);
                c7164M124133.f17803.f3963 = AbstractC9234.m14531(164);
                Object objM12520 = C7206.m12520(objInvoke2, AbstractC9234.m14531(180), C0328R.mipmap.ic_launcher_round, new CallableC9526(c7164M124133.m12415(objInvoke2, new Object[0]), i2));
                Object result = methodHookParam.getResult();
                AbstractC9234.m14531(2016);
                result.getClass();
                List listM9450 = AbstractC5220.m9450(result);
                objM12520.getClass();
                listM9450.add(0, objM12520);
                break;
        }
    }
}

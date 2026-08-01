package p042;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import p000.AbstractC6087;
import p010.AbstractC6154;
import p010.AbstractC6157;
import p032.AbstractC6314;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p337.C8809;
import top.suzhelan.qstory.hook.item.C5923;

/* JADX INFO: renamed from: 飘花落叶言世哲苏子楪兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6443 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f17666;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f17667;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Class f17668;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f17669;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17670;

    public /* synthetic */ C6443(Object obj, Class cls, Object obj2, Object obj3, int i) {
        this.f17670 = i;
        this.f17666 = obj;
        this.f17668 = cls;
        this.f17669 = obj2;
        this.f17667 = obj3;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException {
        int i = this.f17670;
        Object obj2 = this.f17667;
        Class cls = this.f17668;
        Object obj3 = this.f17666;
        switch (i) {
            case 0:
                AbstractC6154.m11561(AbstractC3056.m6668(-3937613797876041127L) + ((Boolean) objArr[1]).booleanValue());
                Object objM11817 = AbstractC6314.m11817(AbstractC6087.m11392(AbstractC6318.m11838(AbstractC3056.m6668(-3937613776401204647L)), new Object[0]), AbstractC3056.m6668(-3937613565947807143L), new Class[]{byte[].class}, ((Bundle) objArr[2]).getByteArray(AbstractC3056.m6668(-3937613733451531687L)));
                String str = (String) AbstractC6314.m11818(String.class, AbstractC3056.m6668(-3937613415623951783L), AbstractC6314.m11818(cls, AbstractC3056.m6668(-3937613501523297703L), AbstractC6317.m11832(objM11817.getClass(), AbstractC3056.m6668(-3937613381264213415L)).get(objM11817)));
                Class clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937600440527750567L));
                Class clsM118382 = AbstractC6318.m11838(AbstractC3056.m6668(-3937600200009581991L));
                Class clsM118383 = AbstractC6318.m11838(AbstractC3056.m6668(-3937599993851151783L));
                Class clsM118384 = AbstractC6318.m11838(AbstractC3056.m6668(-3937599882182002087L));
                Object objM11818 = AbstractC6314.m11818(clsM118383, AbstractC3056.m6668(-3937599667433637287L), obj2);
                Object obj4 = ((RunnableC6442) obj3).f17665;
                String strM6668 = AbstractC3056.m6668(-3937599603009127847L);
                Class cls2 = Boolean.TYPE;
                Class[] clsArr = {cls2, cls2, clsM11838, clsM118383, clsM118382, String.class};
                Boolean bool = Boolean.TRUE;
                Object objM11819 = AbstractC6314.m11819(obj4, strM6668, clsM118384, clsArr, bool, bool, this.f17669, objM11818, null, str);
                if (objM11819 != null) {
                    String str2 = (String) AbstractC6314.m11818(String.class, AbstractC3056.m6668(-3937599529994683815L), objM11819);
                    AbstractC6157.m11573(str2, AbstractC3056.m6668(-3937603593033745831L));
                    JSONObject object = JSONObject.parseObject(str2);
                    if (object.getIntValue(AbstractC3056.m6668(-3937599461275207079L)) == 0) {
                        AbstractC6157.m11573(object, AbstractC3056.m6668(-3937603593033745831L));
                    }
                    break;
                }
                break;
            default:
                C8809 c8809 = (C8809) obj3;
                Object objM118172 = AbstractC6314.m11817(AbstractC6087.m11392(AbstractC6318.m11838(AbstractC3056.m6668(-3937613776401204647L)), new Object[0]), AbstractC3056.m6668(-3937613565947807143L), new Class[]{byte[].class}, ((Bundle) objArr[2]).getByteArray(AbstractC3056.m6668(-3937613733451531687L)));
                String str3 = (String) AbstractC6314.m11818(String.class, AbstractC3056.m6668(-3937613415623951783L), AbstractC6314.m11818(cls, AbstractC3056.m6668(-3937613501523297703L), AbstractC6317.m11832(objM118172.getClass(), AbstractC3056.m6668(-3937613381264213415L)).get(objM118172)));
                Class clsM118385 = AbstractC6318.m11838(AbstractC3056.m6668(-3937600440527750567L));
                Class clsM118386 = AbstractC6318.m11838(AbstractC3056.m6668(-3937600200009581991L));
                Class clsM118387 = AbstractC6318.m11838(AbstractC3056.m6668(-3937599993851151783L));
                Class clsM118388 = AbstractC6318.m11838(AbstractC3056.m6668(-3937599882182002087L));
                Object objM118182 = AbstractC6314.m11818(clsM118387, AbstractC3056.m6668(-3937599667433637287L), obj2);
                Object obj5 = c8809.f24792;
                String strM66682 = AbstractC3056.m6668(-3937599603009127847L);
                Class cls3 = Boolean.TYPE;
                Class[] clsArr2 = {cls3, cls3, clsM118385, clsM118387, clsM118386, String.class};
                Boolean bool2 = Boolean.TRUE;
                Object objM118192 = AbstractC6314.m11819(obj5, strM66682, clsM118388, clsArr2, bool2, bool2, this.f17669, objM118182, null, str3);
                if (objM118192 != null) {
                    String str4 = (String) AbstractC6314.m11818(String.class, AbstractC3056.m6668(-3937599529994683815L), objM118192);
                    if (JSONObject.parseObject(str4).getIntValue(AbstractC3056.m6668(-3937599461275207079L), -1) == 0 && !TextUtils.isEmpty(str4)) {
                        C5923 c5923 = c8809.f24795;
                        AbstractC3056.m6668(-3937659711076435367L);
                        c5923.m11258(str4);
                        break;
                    }
                }
                break;
        }
        return null;
    }
}

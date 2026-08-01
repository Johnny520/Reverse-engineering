package lin.xposed.hook.view.main.itemview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.InterfaceC3742;
import com.kongzue.dialogx.interfaces.InterfaceC3751;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC4387;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.AbstractC5398;
import lin.xposed.hook.util.qq.QQMessageUtils;
import p026.InterfaceC6294;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p032.C6316;
import p037.C6360;
import p038.CallableC6409;
import p038.CallableC6420;
import p053.AbstractC6560;
import p095.C7206;
import p095.ExecutorC7207;
import p175.AbstractC7738;
import p230.C8052;
import p257.C8204;
import p257.C8207;
import p353.C8882;
import top.suzhelan.qstory.entity.PayItem;
import top.suzhelan.qstory.hook.item.C5922;
import top.suzhelan.qstory.hook.item.C5931;
import top.suzhelan.qstory.hook.item.CallableC5905;
import top.suzhelan.qstory.hook.item.chat.C5849;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: lin.xposed.hook.view.main.itemview.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5564 implements InterfaceC3742, InterfaceC6294, InterfaceC3751 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f15338;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15339;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f15340;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15341;

    public /* synthetic */ C5564(JumpDataCard jumpDataCard, Context context, String str) {
        this.f15341 = 1;
        this.f15340 = jumpDataCard;
        this.f15339 = context;
        this.f15338 = str;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3751
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo8081(AbstractC3737 abstractC3737) {
        Activity activity = (Activity) this.f15340;
        ArrayList arrayList = (ArrayList) this.f15338;
        List list = (List) this.f15339;
        C8207 c8207 = (C8207) abstractC3737;
        int i = C8882.f25033;
        activity.getClass();
        final C8052 c8052 = new C8052(list, activity);
        AbstractC3056.m6668(-3937616005489231271L);
        AbstractC3056.m6668(-3937689878926722471L);
        AbstractC3056.m6668(-3937359406963099047L);
        View viewInflate = AbstractC6560.m12028(activity).inflate(R.layout.layout_listview, (ViewGroup) null);
        AbstractC3056.m6668(-3937359321063753127L);
        viewInflate.getClass();
        ListView listView = (ListView) viewInflate;
        final C8882 c8882 = new C8882(arrayList);
        listView.setAdapter((ListAdapter) c8882);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: 飘花落叶言苏哲楪兰世子.飘花落叶言子楪世苏兰哲
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                view.getClass();
                AbstractC3056.m6668(-3937831088861480359L);
                AbstractC3056.m6668(-3937690364258026919L);
                Intent intent = new Intent(AbstractC3056.m6668(-3937572549010130343L));
                C8052 c80522 = c8052;
                String payUrl = ((PayItem) ((List) c80522.f22227).get(i2)).getPayUrl();
                AbstractC3056.m6668(-3937327001434850727L);
                payUrl.getClass();
                intent.setData(Uri.parse(payUrl));
                ((Activity) c80522.f22226).startActivity(intent);
            }
        });
        c8207.mo13707().f22643.addView(listView);
        ViewGroup viewGroup = c8207.mo13707().f22643;
        AbstractC3056.m6668(-3937326000707470759L);
        viewGroup.getClass();
        viewGroup.setVisibility(0);
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3742
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public boolean mo4475(CharSequence charSequence, Object obj, int i) {
        int i2 = this.f15341;
        Object obj2 = this.f15338;
        Object obj3 = this.f15339;
        Object obj4 = this.f15340;
        switch (i2) {
            case 0:
                return AddQQGroup.lambda$showDialog$1((String[]) obj4, (Map) obj2, (Context) obj3, (C8204) obj, charSequence, i);
            default:
                return JumpDataCard.showTypeMenu$lambda$0((JumpDataCard) obj4, (Context) obj3, (String) obj2, (C8204) obj, charSequence, i);
        }
    }

    @Override // p026.InterfaceC6294
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo1469(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException, InvocationTargetException {
        Object objM162;
        Object objectField;
        List list;
        int i = this.f15341;
        Object obj = this.f15339;
        Object obj2 = this.f15338;
        Object obj3 = this.f15340;
        int i2 = 0;
        switch (i) {
            case 2:
                Object objInvoke = ((Method) obj2).invoke(methodHookParam.thisObject, null);
                C6316 c6316M11826 = C6316.m11826((Class) obj);
                c6316M11826.f17409.f3617 = AbstractC3056.m6668(-3937563495219070375L);
                ((List) methodHookParam.getResult()).add(0, C6360.m11913(objInvoke, AbstractC3056.m6668(-3937661051106231719L), R.mipmap.ic_launcher_round, new CallableC5905((C5922) obj3, i2, c6316M11826.m11828(objInvoke, new Object[0]))));
                break;
            case 3:
                C5931 c5931 = (C5931) obj;
                Object obj4 = C5931.f16124;
                Object objInvoke2 = ((Method) obj3).invoke(methodHookParam.thisObject, null);
                C6316 c6316M118262 = C6316.m11826((Class) obj2);
                c6316M118262.f17409.f3617 = AbstractC3056.m6668(-3937563495219070375L);
                Object objM11828 = c6316M118262.m11828(objInvoke2, new Object[0]);
                objM11828.getClass();
                try {
                    Object objectField2 = XposedHelpers.getObjectField(objM11828, AbstractC3056.m6668(-3937563413614691751L));
                    list = objectField2 instanceof List ? (List) objectField2 : null;
                } catch (Throwable th) {
                    objM162 = AbstractC0053.m162(th);
                }
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        objectField = XposedHelpers.getObjectField(it.next(), AbstractC3056.m6668(-3937772758910633383L));
                        if (objectField != null) {
                            Object objM11913 = C6360.m11913(objInvoke2, AbstractC3056.m6668(-3937770877714957735L), android.R.drawable.ic_menu_share, new CallableC5905(objectField, methodHookParam, c5931));
                            Object result = methodHookParam.getResult();
                            AbstractC3056.m6668(-3937770933549532583L);
                            result.getClass();
                            List listM8901 = AbstractC4387.m8901(result);
                            objM11913.getClass();
                            listM8901.add(0, objM11913);
                            break;
                        }
                    }
                }
                objM162 = Result.m8755constructorimpl(null);
                objectField = Result.m8761isFailureimpl(objM162) ? null : objM162;
                Object objM119132 = C6360.m11913(objInvoke2, AbstractC3056.m6668(-3937770877714957735L), android.R.drawable.ic_menu_share, new CallableC5905(objectField, methodHookParam, c5931));
                Object result2 = methodHookParam.getResult();
                AbstractC3056.m6668(-3937770933549532583L);
                result2.getClass();
                List listM89012 = AbstractC4387.m8901(result2);
                objM119132.getClass();
                listM89012.add(0, objM119132);
                break;
            case 4:
                final C5849 c5849 = (C5849) obj;
                methodHookParam.getClass();
                Object objInvoke3 = ((Method) obj3).invoke(methodHookParam.thisObject, null);
                C6316 c6316M118263 = C6316.m11826((Class) obj2);
                c6316M118263.f17409.f3617 = AbstractC3056.m6668(-3937563495219070375L);
                Object objM118282 = c6316M118263.m11828(objInvoke3, new Object[0]);
                Integer num = (Integer) AbstractC6317.m11831(Integer.TYPE, AbstractC3056.m6668(-3937565801616508327L), objM118282);
                Object objM11831 = AbstractC6317.m11831(ArrayList.class, AbstractC3056.m6668(-3937563413614691751L), objM118282);
                AbstractC3056.m6668(-3937727850732586407L);
                objM11831.getClass();
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                Iterator it2 = ((ArrayList) objM11831).iterator();
                AbstractC3056.m6668(-3937693916195980711L);
                it2.getClass();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    AbstractC3056.m6668(-3937693873246307751L);
                    next.getClass();
                    C6316 c6316M118264 = C6316.m11826(next.getClass());
                    c6316M118264.f17409.f3617 = AbstractC3056.m6668(-3937579635706168743L);
                    c6316M118264.f17409.f3616 = AbstractC6318.m11838(AbstractC3056.m6668(-3937575778825536935L));
                    Object objM118283 = c6316M118264.m11828(next, new Object[0]);
                    if (objM118283 != null) {
                        String str = (String) AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937575551192270247L), objM118283);
                        if (str != null) {
                            Locale locale = Locale.getDefault();
                            AbstractC3056.m6668(-3937691974870762919L);
                            locale.getClass();
                            String upperCase = str.toUpperCase(locale);
                            AbstractC3056.m6668(-3937691906151286183L);
                            upperCase.getClass();
                            arrayList2.add(upperCase);
                        }
                        num.getClass();
                        arrayList.add(QQMessageUtils.getPicElementUrl(num.intValue(), objM118283));
                    }
                }
                Object objM119133 = C6360.m11913(objInvoke3, AbstractC3056.m6668(-3937590175555913127L), R.mipmap.ic_launcher_round, new Callable(c5849, arrayList, arrayList2) { // from class: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪哲兰世苏

                    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
                    public final /* synthetic */ ArrayList f16014;

                    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
                    public final /* synthetic */ ArrayList f16015;

                    {
                        this.f16015 = arrayList;
                        this.f16014 = arrayList2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Activity activityM13031 = AbstractC7738.m13031();
                        C7206 c7206 = AbstractC5394.f15030;
                        AbstractC5398.m10473(AbstractC5398.m10485(ExecutorC7207.f19230), null, null, new DownloadEmotion$downloadEmotion$1(this.f16015, this.f16014, activityM13031, null), 3);
                        return null;
                    }
                });
                Object result3 = methodHookParam.getResult();
                AbstractC3056.m6668(-3937770933549532583L);
                result3.getClass();
                List listM89013 = AbstractC4387.m8901(result3);
                objM119133.getClass();
                listM89013.add(0, objM119133);
                break;
            case 5:
                Object objInvoke4 = ((Method) obj2).invoke(methodHookParam.thisObject, null);
                C6316 c6316M118265 = C6316.m11826((Class) obj);
                c6316M118265.f17409.f3617 = AbstractC3056.m6668(-3937563495219070375L);
                ((List) methodHookParam.getResult()).add(0, C6360.m11913(objInvoke4, AbstractC3056.m6668(-3937577617071539623L), R.mipmap.ic_launcher_round, new CallableC6409((C5851) obj3, QQMessageUtils.getMsgRecordPicUrlList(c6316M118265.m11828(objInvoke4, new Object[0])), i2)));
                break;
            default:
                Object objInvoke5 = ((Method) obj2).invoke(methodHookParam.thisObject, null);
                C6316 c6316M118266 = C6316.m11826((Class) obj);
                c6316M118266.f17409.f3617 = AbstractC3056.m6668(-3937563495219070375L);
                ((List) methodHookParam.getResult()).add(0, C6360.m11913(objInvoke5, AbstractC3056.m6668(-3937580718037927335L), R.mipmap.ic_launcher_round, new CallableC6420((C5851) obj3, QQMessageUtils.getMsgRecordPicUrlList(c6316M118266.m11828(objInvoke5, new Object[0])), i2)));
                break;
        }
    }

    public /* synthetic */ C5564(Object obj, Object obj2, Object obj3, int i) {
        this.f15341 = i;
        this.f15340 = obj;
        this.f15338 = obj2;
        this.f15339 = obj3;
    }
}

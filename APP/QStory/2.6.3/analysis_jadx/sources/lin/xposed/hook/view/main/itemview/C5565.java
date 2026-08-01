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
import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3055;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.InterfaceC3743;
import com.kongzue.dialogx.interfaces.InterfaceC3752;
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
import kotlin.jvm.internal.AbstractC4388;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.AbstractC5399;
import lin.xposed.hook.util.qq.QQMessageUtils;
import p018.AbstractC6253;
import p026.InterfaceC6312;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p033.C6335;
import p038.C6377;
import p039.CallableC6390;
import p039.CallableC6433;
import p095.C7207;
import p095.ExecutorC7208;
import p230.C8053;
import p257.C8205;
import p257.C8208;
import p287.AbstractC8405;
import p353.C8871;
import top.suzhelan.qstory.entity.PayItem;
import top.suzhelan.qstory.hook.item.C5928;
import top.suzhelan.qstory.hook.item.C5936;
import top.suzhelan.qstory.hook.item.CallableC5911;
import top.suzhelan.qstory.hook.item.chat.C5854;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: lin.xposed.hook.view.main.itemview.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5565 implements InterfaceC3743, InterfaceC6312, InterfaceC3752 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f15338;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15339;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f15340;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15341;

    public /* synthetic */ C5565(JumpDataCard jumpDataCard, Context context, String str) {
        this.f15341 = 1;
        this.f15340 = jumpDataCard;
        this.f15339 = context;
        this.f15338 = str;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3752
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo8068(AbstractC3738 abstractC3738) {
        Activity activity = (Activity) this.f15340;
        ArrayList arrayList = (ArrayList) this.f15338;
        List list = (List) this.f15339;
        C8208 c8208 = (C8208) abstractC3738;
        int i = C8871.f25016;
        activity.getClass();
        final C8053 c8053 = new C8053(list, activity);
        AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
        AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵");
        AbstractC8405.m13972(3254);
        View viewInflate = AbstractC6253.m11750(activity).inflate(R.layout.layout_listview, (ViewGroup) null);
        AbstractC8405.m13972(3255);
        viewInflate.getClass();
        ListView listView = (ListView) viewInflate;
        final C8871 c8871 = new C8871(arrayList);
        listView.setAdapter((ListAdapter) c8871);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: 飘花落叶言苏哲楪兰子世.飘花落叶言子楪世苏兰哲
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                view.getClass();
                AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
                AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜呜呜呜");
                Intent intent = new Intent(AbstractC8405.m13972(Opcodes.ADD_DOUBLE_2ADDR));
                C8053 c80532 = c8053;
                String payUrl = ((PayItem) ((List) c80532.f22225).get(i2)).getPayUrl();
                AbstractC8405.m13972(3136);
                payUrl.getClass();
                intent.setData(Uri.parse(payUrl));
                ((Activity) c80532.f22224).startActivity(intent);
            }
        });
        c8208.mo13724().f22642.addView(listView);
        ViewGroup viewGroup = c8208.mo13724().f22642;
        AbstractC8405.m13973("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵喵喵呜喵~喵喵呜喵喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜喵呜喵呜");
        viewGroup.getClass();
        viewGroup.setVisibility(0);
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3743
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public boolean mo4485(CharSequence charSequence, Object obj, int i) {
        int i2 = this.f15341;
        Object obj2 = this.f15338;
        Object obj3 = this.f15339;
        Object obj4 = this.f15340;
        switch (i2) {
            case 0:
                return AddQQGroup.lambda$showDialog$1((String[]) obj4, (Map) obj2, (Context) obj3, (C8205) obj, charSequence, i);
            default:
                return JumpDataCard.showTypeMenu$lambda$0((JumpDataCard) obj4, (Context) obj3, (String) obj2, (C8205) obj, charSequence, i);
        }
    }

    @Override // p026.InterfaceC6312
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo1479(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException, InvocationTargetException {
        Object objM163;
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
                C6335 c6335M11854 = C6335.m11854((Class) obj);
                c6335M11854.f17458.f3618 = AbstractC8405.m13972(164);
                ((List) methodHookParam.getResult()).add(0, C6377.m11961(objInvoke, AbstractC8405.m13972(1080), R.mipmap.ic_launcher_round, new CallableC5911((C5928) obj3, i2, c6335M11854.m11856(objInvoke, new Object[0]))));
                break;
            case 3:
                C5936 c5936 = (C5936) obj;
                Object obj4 = C5936.f16128;
                Object objInvoke2 = ((Method) obj3).invoke(methodHookParam.thisObject, null);
                C6335 c6335M118542 = C6335.m11854((Class) obj2);
                c6335M118542.f17458.f3618 = AbstractC8405.m13972(164);
                Object objM11856 = c6335M118542.m11856(objInvoke2, new Object[0]);
                objM11856.getClass();
                try {
                    Object objectField2 = XposedHelpers.getObjectField(objM11856, AbstractC8405.m13972(152));
                    list = objectField2 instanceof List ? (List) objectField2 : null;
                } catch (Throwable th) {
                    objM163 = AbstractC0053.m163(th);
                }
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        objectField = XposedHelpers.getObjectField(it.next(), AbstractC8405.m13972(1992));
                        if (objectField != null) {
                            Object objM11961 = C6377.m11961(objInvoke2, AbstractC8405.m13972(2015), android.R.drawable.ic_menu_share, new CallableC5911(objectField, methodHookParam, c5936));
                            Object result = methodHookParam.getResult();
                            AbstractC8405.m13972(2016);
                            result.getClass();
                            List listM8891 = AbstractC4388.m8891(result);
                            objM11961.getClass();
                            listM8891.add(0, objM11961);
                            break;
                        }
                    }
                }
                objM163 = Result.m8745constructorimpl(null);
                objectField = Result.m8751isFailureimpl(objM163) ? null : objM163;
                Object objM119612 = C6377.m11961(objInvoke2, AbstractC8405.m13972(2015), android.R.drawable.ic_menu_share, new CallableC5911(objectField, methodHookParam, c5936));
                Object result2 = methodHookParam.getResult();
                AbstractC8405.m13972(2016);
                result2.getClass();
                List listM88912 = AbstractC4388.m8891(result2);
                objM119612.getClass();
                listM88912.add(0, objM119612);
                break;
            case 4:
                final C5854 c5854 = (C5854) obj;
                methodHookParam.getClass();
                Object objInvoke3 = ((Method) obj3).invoke(methodHookParam.thisObject, null);
                C6335 c6335M118543 = C6335.m11854((Class) obj2);
                c6335M118543.f17458.f3618 = AbstractC8405.m13972(164);
                Object objM118562 = c6335M118543.m11856(objInvoke3, new Object[0]);
                Integer num = (Integer) AbstractC6336.m11859(Integer.TYPE, AbstractC8405.m13972(125), objM118562);
                Object objM11859 = AbstractC6336.m11859(ArrayList.class, AbstractC8405.m13972(152), objM118562);
                AbstractC8405.m13972(1588);
                objM11859.getClass();
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                Iterator it2 = ((ArrayList) objM11859).iterator();
                AbstractC8405.m13972(1253);
                it2.getClass();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    AbstractC8405.m13972(1254);
                    next.getClass();
                    C6335 c6335M118544 = C6335.m11854(next.getClass());
                    c6335M118544.f17458.f3618 = AbstractC8405.m13972(140);
                    c6335M118544.f17458.f3617 = AbstractC6337.m11866(AbstractC8405.m13972(178));
                    Object objM118563 = c6335M118544.m11856(next, new Object[0]);
                    if (objM118563 != null) {
                        String str = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(179), objM118563);
                        if (str != null) {
                            Locale locale = Locale.getDefault();
                            AbstractC8405.m13972(1277);
                            locale.getClass();
                            String upperCase = str.toUpperCase(locale);
                            AbstractC8405.m13972(1278);
                            upperCase.getClass();
                            arrayList2.add(upperCase);
                        }
                        num.getClass();
                        arrayList.add(QQMessageUtils.getPicElementUrl(num.intValue(), objM118563));
                    }
                }
                Object objM119613 = C6377.m11961(objInvoke3, AbstractC8405.m13973("呜喵喵呜喵呜呜呜~呜呜喵喵呜喵呜喵~呜呜呜喵喵呜呜呜~呜喵喵喵呜呜喵呜~呜呜喵喵呜喵喵喵~呜呜呜呜喵呜喵喵"), R.mipmap.ic_launcher_round, new Callable(c5854, arrayList, arrayList2) { // from class: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪哲兰世苏

                    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
                    public final /* synthetic */ ArrayList f16021;

                    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
                    public final /* synthetic */ ArrayList f16022;

                    {
                        this.f16022 = arrayList;
                        this.f16021 = arrayList2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Activity activityM6653 = AbstractC3055.m6653();
                        C7207 c7207 = AbstractC5395.f15030;
                        AbstractC5399.m10477(AbstractC5399.m10489(ExecutorC7208.f19225), null, null, new DownloadEmotion$downloadEmotion$1(this.f16022, this.f16021, activityM6653, null), 3);
                        return null;
                    }
                });
                Object result3 = methodHookParam.getResult();
                AbstractC8405.m13972(2016);
                result3.getClass();
                List listM88913 = AbstractC4388.m8891(result3);
                objM119613.getClass();
                listM88913.add(0, objM119613);
                break;
            case 5:
                Object objInvoke4 = ((Method) obj2).invoke(methodHookParam.thisObject, null);
                C6335 c6335M118545 = C6335.m11854((Class) obj);
                c6335M118545.f17458.f3618 = AbstractC8405.m13972(164);
                ((List) methodHookParam.getResult()).add(0, C6377.m11961(objInvoke4, AbstractC8405.m13972(165), R.mipmap.ic_launcher_round, new CallableC6433((C5856) obj3, QQMessageUtils.getMsgRecordPicUrlList(c6335M118545.m11856(objInvoke4, new Object[0])), i2)));
                break;
            default:
                Object objInvoke5 = ((Method) obj2).invoke(methodHookParam.thisObject, null);
                C6335 c6335M118546 = C6335.m11854((Class) obj);
                c6335M118546.f17458.f3618 = AbstractC8405.m13972(164);
                ((List) methodHookParam.getResult()).add(0, C6377.m11961(objInvoke5, AbstractC8405.m13972(289), R.mipmap.ic_launcher_round, new CallableC6390((C5856) obj3, QQMessageUtils.getMsgRecordPicUrlList(c6335M118546.m11856(objInvoke5, new Object[0])), i2)));
                break;
        }
    }

    public /* synthetic */ C5565(Object obj, Object obj2, Object obj3, int i) {
        this.f15341 = i;
        this.f15340 = obj;
        this.f15338 = obj2;
        this.f15339 = obj3;
    }
}

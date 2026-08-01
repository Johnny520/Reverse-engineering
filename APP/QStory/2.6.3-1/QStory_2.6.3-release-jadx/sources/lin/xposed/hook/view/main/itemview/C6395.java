package lin.xposed.hook.view.main.itemview;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.activity.AbstractC0900;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.AbstractC3887;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.InterfaceC4575;
import com.kongzue.dialogx.interfaces.InterfaceC4584;
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
import kotlin.jvm.internal.AbstractC5220;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import lin.xposed.hook.util.p011qq.QQMessageUtils;
import p034.AbstractC7082;
import p042.InterfaceC7141;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import p054.C7206;
import p055.CallableC7219;
import p055.CallableC7262;
import p111.C8036;
import p111.ExecutorC8037;
import p246.C8882;
import p273.C9034;
import p273.C9037;
import p303.AbstractC9234;
import p369.C9700;
import top.suzhelan.qstory.entity.PayItem;
import top.suzhelan.qstory.hook.item.C6758;
import top.suzhelan.qstory.hook.item.C6766;
import top.suzhelan.qstory.hook.item.CallableC6741;
import top.suzhelan.qstory.hook.item.chat.C6684;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: lin.xposed.hook.view.main.itemview.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6395 implements InterfaceC4575, InterfaceC7141, InterfaceC4584 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f15683;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15684;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f15685;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15686;

    public /* synthetic */ C6395(JumpDataCard jumpDataCard, Context context, String str) {
        this.f15686 = 1;
        this.f15685 = jumpDataCard;
        this.f15684 = context;
        this.f15683 = str;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4584
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo8627(AbstractC4570 abstractC4570) {
        Activity activity = (Activity) this.f15685;
        ArrayList arrayList = (ArrayList) this.f15683;
        List list = (List) this.f15684;
        C9037 c9037 = (C9037) abstractC4570;
        int i = C9700.f25361;
        activity.getClass();
        final C8882 c8882 = new C8882(list, activity);
        AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
        AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵");
        AbstractC9234.m14531(3254);
        View viewInflate = AbstractC7082.m12309(activity).inflate(C0328R.layout.layout_listview, (ViewGroup) null);
        AbstractC9234.m14531(3255);
        viewInflate.getClass();
        ListView listView = (ListView) viewInflate;
        final C9700 c9700 = new C9700(arrayList);
        listView.setAdapter((ListAdapter) c9700);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: 飘花落叶言苏哲楪兰子世.飘花落叶言子楪世苏兰哲
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                view.getClass();
                AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
                AbstractC9234.m14532("喵喵喵喵喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜呜呜呜");
                Intent intent = new Intent(AbstractC9234.m14531(Opcodes.ADD_DOUBLE_2ADDR));
                C8882 c88822 = c8882;
                String payUrl = ((PayItem) ((List) c88822.f22570).get(i2)).getPayUrl();
                AbstractC9234.m14531(3136);
                payUrl.getClass();
                intent.setData(Uri.parse(payUrl));
                ((Activity) c88822.f22569).startActivity(intent);
            }
        });
        c9037.mo14283().f22987.addView(listView);
        ViewGroup viewGroup = c9037.mo14283().f22987;
        AbstractC9234.m14532("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵喵喵呜喵~喵喵呜喵喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜喵呜喵呜");
        viewGroup.getClass();
        viewGroup.setVisibility(0);
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4575
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public boolean mo5045(CharSequence charSequence, Object obj, int i) {
        int i2 = this.f15686;
        Object obj2 = this.f15683;
        Object obj3 = this.f15684;
        Object obj4 = this.f15685;
        switch (i2) {
            case 0:
                return AddQQGroup.lambda$showDialog$1((String[]) obj4, (Map) obj2, (Context) obj3, (C9034) obj, charSequence, i);
            default:
                return JumpDataCard.showTypeMenu$lambda$0((JumpDataCard) obj4, (Context) obj3, (String) obj2, (C9034) obj, charSequence, i);
        }
    }

    @Override // p042.InterfaceC7141
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo2039(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException, InvocationTargetException {
        Object objM723;
        Object objectField;
        List list;
        int i = this.f15686;
        Object obj = this.f15684;
        Object obj2 = this.f15683;
        Object obj3 = this.f15685;
        int i2 = 0;
        switch (i) {
            case 2:
                Object objInvoke = ((Method) obj2).invoke(methodHookParam.thisObject, null);
                C7164 c7164M12413 = C7164.m12413((Class) obj);
                c7164M12413.f17803.f3963 = AbstractC9234.m14531(164);
                ((List) methodHookParam.getResult()).add(0, C7206.m12520(objInvoke, AbstractC9234.m14531(1080), C0328R.mipmap.ic_launcher_round, new CallableC6741((C6758) obj3, i2, c7164M12413.m12415(objInvoke, new Object[0]))));
                break;
            case 3:
                C6766 c6766 = (C6766) obj;
                Object obj4 = C6766.f16473;
                Object objInvoke2 = ((Method) obj3).invoke(methodHookParam.thisObject, null);
                C7164 c7164M124132 = C7164.m12413((Class) obj2);
                c7164M124132.f17803.f3963 = AbstractC9234.m14531(164);
                Object objM12415 = c7164M124132.m12415(objInvoke2, new Object[0]);
                objM12415.getClass();
                try {
                    Object objectField2 = XposedHelpers.getObjectField(objM12415, AbstractC9234.m14531(152));
                    list = objectField2 instanceof List ? (List) objectField2 : null;
                } catch (Throwable th) {
                    objM723 = AbstractC0900.m723(th);
                }
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        objectField = XposedHelpers.getObjectField(it.next(), AbstractC9234.m14531(1992));
                        if (objectField != null) {
                            Object objM12520 = C7206.m12520(objInvoke2, AbstractC9234.m14531(2015), R.drawable.ic_menu_share, new CallableC6741(objectField, methodHookParam, c6766));
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
                objM723 = Result.m9304constructorimpl(null);
                objectField = Result.m9310isFailureimpl(objM723) ? null : objM723;
                Object objM125202 = C7206.m12520(objInvoke2, AbstractC9234.m14531(2015), R.drawable.ic_menu_share, new CallableC6741(objectField, methodHookParam, c6766));
                Object result2 = methodHookParam.getResult();
                AbstractC9234.m14531(2016);
                result2.getClass();
                List listM94502 = AbstractC5220.m9450(result2);
                objM125202.getClass();
                listM94502.add(0, objM125202);
                break;
            case 4:
                final C6684 c6684 = (C6684) obj;
                methodHookParam.getClass();
                Object objInvoke3 = ((Method) obj3).invoke(methodHookParam.thisObject, null);
                C7164 c7164M124133 = C7164.m12413((Class) obj2);
                c7164M124133.f17803.f3963 = AbstractC9234.m14531(164);
                Object objM124152 = c7164M124133.m12415(objInvoke3, new Object[0]);
                Integer num = (Integer) AbstractC7165.m12418(Integer.TYPE, AbstractC9234.m14531(125), objM124152);
                Object objM12418 = AbstractC7165.m12418(ArrayList.class, AbstractC9234.m14531(152), objM124152);
                AbstractC9234.m14531(1588);
                objM12418.getClass();
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                Iterator it2 = ((ArrayList) objM12418).iterator();
                AbstractC9234.m14531(1253);
                it2.getClass();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    AbstractC9234.m14531(1254);
                    next.getClass();
                    C7164 c7164M124134 = C7164.m12413(next.getClass());
                    c7164M124134.f17803.f3963 = AbstractC9234.m14531(140);
                    c7164M124134.f17803.f3962 = AbstractC7166.m12425(AbstractC9234.m14531(178));
                    Object objM124153 = c7164M124134.m12415(next, new Object[0]);
                    if (objM124153 != null) {
                        String str = (String) AbstractC7165.m12418(String.class, AbstractC9234.m14531(179), objM124153);
                        if (str != null) {
                            Locale locale = Locale.getDefault();
                            AbstractC9234.m14531(1277);
                            locale.getClass();
                            String upperCase = str.toUpperCase(locale);
                            AbstractC9234.m14531(1278);
                            upperCase.getClass();
                            arrayList2.add(upperCase);
                        }
                        num.getClass();
                        arrayList.add(QQMessageUtils.getPicElementUrl(num.intValue(), objM124153));
                    }
                }
                Object objM125203 = C7206.m12520(objInvoke3, AbstractC9234.m14532("呜喵喵呜喵呜呜呜~呜呜喵喵呜喵呜喵~呜呜呜喵喵呜呜呜~呜喵喵喵呜呜喵呜~呜呜喵喵呜喵喵喵~呜呜呜呜喵呜喵喵"), C0328R.mipmap.ic_launcher_round, new Callable(c6684, arrayList, arrayList2) { // from class: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪哲兰世苏

                    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
                    public final /* synthetic */ ArrayList f16366;

                    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
                    public final /* synthetic */ ArrayList f16367;

                    {
                        this.f16367 = arrayList;
                        this.f16366 = arrayList2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Activity activityM7213 = AbstractC3887.m7213();
                        C8036 c8036 = AbstractC6227.f15375;
                        AbstractC6231.m11036(AbstractC6231.m11048(ExecutorC8037.f19570), null, null, new DownloadEmotion$downloadEmotion$1(this.f16367, this.f16366, activityM7213, null), 3);
                        return null;
                    }
                });
                Object result3 = methodHookParam.getResult();
                AbstractC9234.m14531(2016);
                result3.getClass();
                List listM94503 = AbstractC5220.m9450(result3);
                objM125203.getClass();
                listM94503.add(0, objM125203);
                break;
            case 5:
                Object objInvoke4 = ((Method) obj2).invoke(methodHookParam.thisObject, null);
                C7164 c7164M124135 = C7164.m12413((Class) obj);
                c7164M124135.f17803.f3963 = AbstractC9234.m14531(164);
                ((List) methodHookParam.getResult()).add(0, C7206.m12520(objInvoke4, AbstractC9234.m14531(165), C0328R.mipmap.ic_launcher_round, new CallableC7262((C6686) obj3, QQMessageUtils.getMsgRecordPicUrlList(c7164M124135.m12415(objInvoke4, new Object[0])), i2)));
                break;
            default:
                Object objInvoke5 = ((Method) obj2).invoke(methodHookParam.thisObject, null);
                C7164 c7164M124136 = C7164.m12413((Class) obj);
                c7164M124136.f17803.f3963 = AbstractC9234.m14531(164);
                ((List) methodHookParam.getResult()).add(0, C7206.m12520(objInvoke5, AbstractC9234.m14531(289), C0328R.mipmap.ic_launcher_round, new CallableC7219((C6686) obj3, QQMessageUtils.getMsgRecordPicUrlList(c7164M124136.m12415(objInvoke5, new Object[0])), i2)));
                break;
        }
    }

    public /* synthetic */ C6395(Object obj, Object obj2, Object obj3, int i) {
        this.f15686 = i;
        this.f15685 = obj;
        this.f15683 = obj2;
        this.f15684 = obj3;
    }
}

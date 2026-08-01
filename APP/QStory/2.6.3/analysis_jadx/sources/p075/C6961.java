package p075;

import android.content.Context;
import android.os.Handler;
import androidx.appcompat.app.RunnableC0100;
import androidx.compose.animation.C0426;
import androidx.fragment.app.AbstractC2313;
import androidx.fragment.app.FragmentActivity;
import androidx.window.area.AbstractC2567;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3066;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptyList;
import kotlin.coroutines.InterfaceC4361;
import kotlin.io.AbstractC4381;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ReturnValueStatus;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4723;
import kotlin.text.AbstractC5132;
import kotlin.text.AbstractC5139;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.view.main.itemview.Update;
import org.json.JSONArray;
import org.json.JSONException;
import p036.AbstractC6358;
import p048.C6517;
import p048.C6519;
import p089.C7180;
import p218.InterfaceC7973;
import p227.C8008;
import p228.C8027;
import p228.C8037;
import p228.InterfaceC8033;
import p228.InterfaceC8034;
import p230.C8049;
import p230.C8053;
import p230.C8054;
import p232.InterfaceC8057;
import p232.InterfaceC8064;
import p232.InterfaceC8070;
import p232.InterfaceC8073;
import p287.AbstractC8405;
import p321.C8687;
import p332.C8785;
import p332.C8786;
import p335.AbstractC8789;
import p345.C8834;
import p348.InterfaceC8841;
import p352.AbstractC8865;
import p352.RunnableC8868;
import top.suzhelan.qstory.entity.QSResult;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6961 implements InterfaceC4723, InterfaceC8034, InterfaceC7973, InterfaceC8070, InterfaceC8057, InterfaceC8064, InterfaceC4361 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static volatile C6961 f18641;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18642;

    public C6961() {
        this.f18642 = 24;
        Update.detectUpdates();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static List m12270(File file) {
        boolean zM10139;
        AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵喵");
        if (!file.exists() || !file.isDirectory()) {
            return EmptyList.INSTANCE;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file2 : fileArrListFiles) {
                if (file2.isFile() && !AbstractC4395.m8907(file2.getName(), AbstractC8405.m13972(2669))) {
                    String name = file2.getName();
                    AbstractC8405.m13972(1820);
                    name.getClass();
                    if (!name.endsWith(AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵呜喵呜呜呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵喵呜呜"))) {
                        arrayList.add(file2);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                File file3 = (File) obj;
                C6961 c6961 = C8687.f24498;
                file3.getClass();
                c6961.getClass();
                Set set = C8687.f24497;
                String lowerCase = AbstractC4381.m8872(file3).toLowerCase(Locale.ROOT);
                AbstractC8405.m13972(1322);
                lowerCase.getClass();
                if (set.contains(lowerCase)) {
                    zM10139 = true;
                } else {
                    try {
                        zM10139 = AbstractC5139.m10139(AbstractC3066.m6854(file3.getAbsolutePath()), AbstractC8405.m13973("喵呜喵呜呜呜喵呜"), false);
                    } catch (Exception unused) {
                        zM10139 = false;
                    }
                }
                if (zM10139) {
                    arrayList2.add(obj);
                }
            }
            List listM8778 = AbstractC4344.m8778(arrayList2, new C0426(18));
            if (listM8778 != null) {
                return listM8778;
            }
        }
        return EmptyList.INSTANCE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m12271() {
        InterfaceC8841 interfaceC8841M14488 = C8834.m14488();
        Object obj = interfaceC8841M14488.m14509().execute().f15756;
        obj.getClass();
        if (!((Boolean) ((QSResult) obj).getData()).booleanValue()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"), QQEnvTool.getCurrentUin());
            Object obj2 = interfaceC8841M14488.m14507(jSONObject).execute().f15756;
            obj2.getClass();
            C8786 c8786 = (C8786) ((QSResult) obj2).getData();
            c8786.getClass();
            AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜");
            new C8049(15).m13533(c8786, AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜"));
        }
        Context context = AbstractC6358.f17507;
        ExecutorService executorService = AbstractC8789.f24756;
        executorService.execute(new RunnableC0100(context, 3));
        Handler handler = AbstractC8865.f25007;
        context.getClass();
        C7180 c7180 = new C7180(22);
        AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
        AbstractC8405.m13972(3260);
        executorService.execute(new RunnableC8868(context, 0, c7180));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C8687 m12272(File file) {
        ?? arrayList;
        AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵喵");
        File file2 = new File(file, AbstractC8405.m13972(2669));
        if (!file2.exists()) {
            String name = file.getName();
            AbstractC8405.m13972(1820);
            name.getClass();
            return new C8687(name);
        }
        try {
            Charset charset = AbstractC5132.f14688;
            charset.getClass();
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file2), charset);
            try {
                String strM6682 = AbstractC3056.m6682(inputStreamReader);
                inputStreamReader.close();
                org.json.JSONObject jSONObject = new org.json.JSONObject(strM6682);
                String strOptString = jSONObject.optString(AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜"), file.getName());
                AbstractC8405.m13972(2674);
                strOptString.getClass();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜"));
                if (jSONArrayOptJSONArray != null) {
                    C6519 c6519M5067 = AbstractC2567.m5067(0, jSONArrayOptJSONArray.length());
                    arrayList = new ArrayList(AbstractC4345.m8822(c6519M5067, 10));
                    Iterator it = c6519M5067.iterator();
                    while (((C6517) it).f17823) {
                        arrayList.add(jSONArrayOptJSONArray.getString(((C6517) it).nextInt()));
                    }
                } else {
                    arrayList = EmptyList.INSTANCE;
                }
                String strOptString2 = jSONObject.optString(AbstractC8405.m13972(2300), "");
                AbstractC8405.m13972(2674);
                strOptString2.getClass();
                String strOptString3 = jSONObject.optString(AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜喵呜喵~喵喵喵呜呜呜呜喵"), "");
                AbstractC8405.m13972(2674);
                strOptString3.getClass();
                int iOptInt = jSONObject.optInt(AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵呜呜~喵喵喵喵呜呜呜呜"), 1);
                String strOptString4 = jSONObject.optString(AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜呜喵呜~喵喵喵呜喵呜呜呜"), "");
                AbstractC8405.m13972(2674);
                strOptString4.getClass();
                return new C8687(strOptString, arrayList, strOptString2, strOptString3, iOptInt, strOptString4);
            } finally {
            }
        } catch (Exception unused) {
            String name2 = file.getName();
            AbstractC8405.m13972(1820);
            name2.getClass();
            return new C8687(name2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m12273(File file, C8687 c8687) throws JSONException, IOException {
        AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵喵");
        file.getClass();
        AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜呜");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜"), c8687.f24504);
        jSONObject.put(AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜"), new JSONArray((Collection) c8687.f24503));
        jSONObject.put(AbstractC8405.m13972(2300), c8687.f24502);
        jSONObject.put(AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜喵呜喵~喵喵喵呜呜呜呜喵"), c8687.f24501);
        jSONObject.put(AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵呜呜~喵喵喵喵呜呜呜呜"), c8687.f24500);
        jSONObject.put(AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜呜喵呜~喵喵喵呜喵呜呜呜"), c8687.f24499);
        File file2 = new File(file, AbstractC8405.m13972(2669));
        String string = jSONObject.toString(2);
        AbstractC8405.m13972(1296);
        string.getClass();
        Charset charset = AbstractC5132.f14688;
        charset.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            AbstractC4381.m8870(fileOutputStream, string, charset);
            fileOutputStream.close();
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C8785 m12274() {
        m12271();
        Object obj = C8834.m14488().m14510().execute().f15756;
        obj.getClass();
        C8785 c8785 = (C8785) ((QSResult) obj).getData();
        c8785.getClass();
        AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵");
        new C8049(15).m13533(c8785, AbstractC8405.m13972(1490));
        if (AbstractC4395.m8907(QQEnvTool.getCurrentUin(), AbstractC3056.m6708().f24742)) {
            return c8785;
        }
        AbstractC3056.m6680();
        return m12274();
    }

    @Override // p218.InterfaceC7973
    public Object create() {
        try {
            return new C8054(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            C5925.m11313(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean mo12276(CharSequence charSequence) {
        return false;
    }

    @Override // p232.InterfaceC8070
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void mo12277(InterfaceC8073 interfaceC8073) {
        interfaceC8073.mo6775();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4723
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public InterfaceC4722 mo9267(int i) {
        return ProtoBuf$ReturnValueStatus.valueOf(i);
    }

    @Override // p228.InterfaceC8034
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public InterfaceC8033 mo317(C8027 c8027) {
        return new C8008(c8027.m13511(C8037.class, InputStream.class), 0);
    }

    public /* synthetic */ C6961(int i) {
        this.f18642 = i;
    }

    public C6961(C8053 c8053, AbstractC2313 abstractC2313) {
        this.f18642 = 16;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    private final void m12275(Object obj) {
    }

    @Override // p232.InterfaceC8057
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo12278(FragmentActivity fragmentActivity) {
    }

    @Override // p232.InterfaceC8070
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void mo12279(InterfaceC8073 interfaceC8073) {
    }
}

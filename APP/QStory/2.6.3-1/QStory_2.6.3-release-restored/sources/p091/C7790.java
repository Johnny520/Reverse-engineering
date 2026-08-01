package p091;

import android.content.Context;
import android.os.Handler;
import androidx.appcompat.app.RunnableC0947;
import androidx.compose.animation.C1272;
import androidx.fragment.app.AbstractC3146;
import androidx.fragment.app.FragmentActivity;
import androidx.window.area.AbstractC3400;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.AbstractC3898;
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
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.coroutines.InterfaceC5193;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.p008io.AbstractC5213;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ReturnValueStatus;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5555;
import kotlin.text.AbstractC5964;
import kotlin.text.AbstractC5971;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import lin.xposed.hook.view.main.itemview.Update;
import org.json.JSONArray;
import org.json.JSONException;
import p052.AbstractC7187;
import p064.C7346;
import p064.C7348;
import p105.C8009;
import p234.InterfaceC8802;
import p243.C8837;
import p244.C8856;
import p244.C8866;
import p244.InterfaceC8862;
import p244.InterfaceC8863;
import p246.C8878;
import p246.C8882;
import p246.C8883;
import p248.InterfaceC8886;
import p248.InterfaceC8893;
import p248.InterfaceC8899;
import p248.InterfaceC8902;
import p337.C9516;
import p348.C9614;
import p348.C9615;
import p351.AbstractC9618;
import p361.C9663;
import p364.InterfaceC9670;
import p368.AbstractC9694;
import p368.RunnableC9697;
import top.suzhelan.qstory.entity.QSResult;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7790 implements InterfaceC5555, InterfaceC8863, InterfaceC8802, InterfaceC8899, InterfaceC8886, InterfaceC8893, InterfaceC5193 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static volatile C7790 f18986;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18987;

    public C7790() {
        this.f18987 = 24;
        Update.detectUpdates();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static List m12829(File file) {
        boolean zM10698;
        "dir";
        if (!file.exists() || !file.isDirectory()) {
            return EmptyList.INSTANCE;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file2 : fileArrListFiles) {
                if (file2.isFile() && !AbstractC5227.m9466(file2.getName(), "config.json")) {
                    String name = file2.getName();
                    "getName(...)";
                    name.getClass();
                    if (!name.endsWith(".bak")) {
                        arrayList.add(file2);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                File file3 = (File) obj;
                C7790 c7790 = C9516.f24843;
                file3.getClass();
                c7790.getClass();
                Set set = C9516.f24842;
                String lowerCase = AbstractC5213.m9431(file3).toLowerCase(Locale.ROOT);
                "toLowerCase(...)";
                lowerCase.getClass();
                if (set.contains(lowerCase)) {
                    zM10698 = true;
                } else {
                    try {
                        zM10698 = AbstractC5971.m10698(AbstractC3898.m7414(file3.getAbsolutePath()), ".", false);
                    } catch (Exception unused) {
                        zM10698 = false;
                    }
                }
                if (zM10698) {
                    arrayList2.add(obj);
                }
            }
            List listM9337 = AbstractC5176.m9337(arrayList2, new C1272(18));
            if (listM9337 != null) {
                return listM9337;
            }
        }
        return EmptyList.INSTANCE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m12830() {
        InterfaceC9670 interfaceC9670M15047 = C9663.m15047();
        Object obj = interfaceC9670M15047.m15068().execute().f16101;
        obj.getClass();
        if (!((Boolean) ((QSResult) obj).getData()).booleanValue()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uin", QQEnvTool.getCurrentUin());
            Object obj2 = interfaceC9670M15047.m15066(jSONObject).execute().f16101;
            obj2.getClass();
            C9615 c9615 = (C9615) ((QSResult) obj2).getData();
            c9615.getClass();
            "token";
            new C8878(15).m14092(c9615, "token");
        }
        Context context = AbstractC7187.f17852;
        ExecutorService executorService = AbstractC9618.f25101;
        executorService.execute(new RunnableC0947(context, 3));
        Handler handler = AbstractC9694.f25352;
        context.getClass();
        C8009 c8009 = new C8009(22);
        "context";
        "listener";
        executorService.execute(new RunnableC9697(context, 0, c8009));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C9516 m12831(File file) {
        ?? arrayList;
        "dir";
        File file2 = new File(file, "config.json");
        if (!file2.exists()) {
            String name = file.getName();
            "getName(...)";
            name.getClass();
            return new C9516(name);
        }
        try {
            Charset charset = AbstractC5964.f15033;
            charset.getClass();
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file2), charset);
            try {
                String strM7242 = AbstractC3888.m7242(inputStreamReader);
                inputStreamReader.close();
                org.json.JSONObject jSONObject = new org.json.JSONObject(strM7242);
                String strOptString = jSONObject.optString("name", file.getName());
                "optString(...)";
                strOptString.getClass();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("tags");
                if (jSONArrayOptJSONArray != null) {
                    C7348 c7348M5627 = AbstractC3400.m5627(0, jSONArrayOptJSONArray.length());
                    arrayList = new ArrayList(AbstractC5177.m9381(c7348M5627, 10));
                    Iterator it = c7348M5627.iterator();
                    while (((C7346) it).f18168) {
                        arrayList.add(jSONArrayOptJSONArray.getString(((C7346) it).nextInt()));
                    }
                } else {
                    arrayList = EmptyList.INSTANCE;
                }
                String strOptString2 = jSONObject.optString("description", "");
                "optString(...)";
                strOptString2.getClass();
                String strOptString3 = jSONObject.optString("author", "");
                "optString(...)";
                strOptString3.getClass();
                int iOptInt = jSONObject.optInt("version", 1);
                String strOptString4 = jSONObject.optString("cover", "");
                "optString(...)";
                strOptString4.getClass();
                return new C9516(strOptString, arrayList, strOptString2, strOptString3, iOptInt, strOptString4);
            } finally {
            }
        } catch (Exception unused) {
            String name2 = file.getName();
            "getName(...)";
            name2.getClass();
            return new C9516(name2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m12832(File file, C9516 c9516) throws JSONException, IOException {
        "dir";
        file.getClass();
        "config";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("name", c9516.f24849);
        jSONObject.put("tags", new JSONArray((Collection) c9516.f24848));
        jSONObject.put("description", c9516.f24847);
        jSONObject.put("author", c9516.f24846);
        jSONObject.put("version", c9516.f24845);
        jSONObject.put("cover", c9516.f24844);
        File file2 = new File(file, "config.json");
        String string = jSONObject.toString(2);
        "toString(...)";
        string.getClass();
        Charset charset = AbstractC5964.f15033;
        charset.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            AbstractC5213.m9429(fileOutputStream, string, charset);
            fileOutputStream.close();
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C9614 m12833() {
        m12830();
        Object obj = C9663.m15047().m15069().execute().f16101;
        obj.getClass();
        C9614 c9614 = (C9614) ((QSResult) obj).getData();
        c9614.getClass();
        "user";
        new C8878(15).m14092(c9614, "user_info");
        if (AbstractC5227.m9466(QQEnvTool.getCurrentUin(), AbstractC3888.m7268().f25087)) {
            return c9614;
        }
        AbstractC3888.m7240();
        return m12833();
    }

    @Override // p234.InterfaceC8802
    public Object create() {
        try {
            return new C8883(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            C6755.m11872(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean mo12835(CharSequence charSequence) {
        return false;
    }

    @Override // p248.InterfaceC8899
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void mo12836(InterfaceC8902 interfaceC8902) {
        interfaceC8902.mo7335();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5555
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public InterfaceC5554 mo9826(int i) {
        return ProtoBuf$ReturnValueStatus.valueOf(i);
    }

    @Override // p244.InterfaceC8863
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public InterfaceC8862 mo877(C8856 c8856) {
        return new C8837(c8856.m14070(C8866.class, InputStream.class), 0);
    }

    public /* synthetic */ C7790(int i) {
        this.f18987 = i;
    }

    public C7790(C8882 c8882, AbstractC3146 abstractC3146) {
        this.f18987 = 16;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    private final void m12834(Object obj) {
    }

    @Override // p248.InterfaceC8886
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo12837(FragmentActivity fragmentActivity) {
    }

    @Override // p248.InterfaceC8899
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void mo12838(InterfaceC8902 interfaceC8902) {
    }
}

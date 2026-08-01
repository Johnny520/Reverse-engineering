package p075;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Path;
import android.util.Log;
import android.view.ViewGroup;
import androidx.appcompat.app.C0108;
import androidx.compose.animation.C0426;
import androidx.compose.animation.core.InterfaceC0335;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.InterfaceC2988;
import com.kongzue.dialogx.util.views.InterfaceC3756;
import io.ktor.client.plugins.AbstractC3932;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.coroutines.InterfaceC4360;
import kotlin.io.AbstractC4380;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722;
import kotlin.text.AbstractC5131;
import kotlin.text.AbstractC5138;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC6087;
import p010.AbstractC6157;
import p031.C6309;
import p048.C6516;
import p048.C6518;
import p064.C6864;
import p218.InterfaceC7972;
import p222.AbstractC7983;
import p230.InterfaceC8051;
import p232.InterfaceC8063;
import p234.C8081;
import p234.C8083;
import p251.AbstractC8174;
import p257.C8207;
import p286.C8396;
import p286.InterfaceC8390;
import p286.InterfaceC8392;
import p286.InterfaceC8400;
import p315.C8670;
import p324.C8737;
import p332.C8801;
import p333.AbstractC8802;
import p349.C8865;
import retrofit2.C5754;
import retrofit2.InterfaceC5777;
import retrofit2.InterfaceC5794;
import top.suzhelan.qstory.entity.QSResult;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C6957 implements InterfaceC4722, InterfaceC7972, InterfaceC8051, InterfaceC8063, InterfaceC8400, InterfaceC4360, InterfaceC3756, InterfaceC8390, InterfaceC5794, InterfaceC0335 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18601;

    public /* synthetic */ C6957(int i) {
        this.f18601 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m12230(ViewGroup viewGroup) {
        int i = C8670.f24456;
        viewGroup.removeAllViews();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final float m12231(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static C8737 m12232(File file) {
        ?? arrayList;
        "dir";
        File file2 = new File(file, "config.json");
        if (!file2.exists()) {
            String name = file.getName();
            "getName(...)";
            name.getClass();
            return new C8737(name);
        }
        try {
            Charset charset = AbstractC5131.f14688;
            charset.getClass();
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file2), charset);
            try {
                String strM8303 = AbstractC3932.m8303(inputStreamReader);
                inputStreamReader.close();
                JSONObject jSONObject = new JSONObject(strM8303);
                String strOptString = jSONObject.optString("name", file.getName());
                "optString(...)";
                strOptString.getClass();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("tags");
                if (jSONArrayOptJSONArray != null) {
                    C6518 c6518M11422 = AbstractC6087.m11422(0, jSONArrayOptJSONArray.length());
                    arrayList = new ArrayList(AbstractC4344.m8832(c6518M11422, 10));
                    Iterator it = c6518M11422.iterator();
                    while (((C6516) it).f17827) {
                        arrayList.add(jSONArrayOptJSONArray.getString(((C6516) it).nextInt()));
                    }
                } else {
                    arrayList = EmptyList.INSTANCE;
                }
                ?? r7 = arrayList;
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
                return new C8737(strOptString, r7, strOptString2, strOptString3, iOptInt, strOptString4);
            } finally {
            }
        } catch (Exception unused) {
            String name2 = file.getName();
            "getName(...)";
            name2.getClass();
            return new C8737(name2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static List m12233(File file) {
        boolean zM10125;
        "dir";
        if (!file.exists() || !file.isDirectory()) {
            return EmptyList.INSTANCE;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file2 : fileArrListFiles) {
                if (file2.isFile() && !AbstractC4394.m8917(file2.getName(), "config.json")) {
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
                C6957 c6957 = C8737.f24631;
                file3.getClass();
                c6957.getClass();
                Set set = C8737.f24630;
                String lowerCase = AbstractC4380.m8881(file3).toLowerCase(Locale.ROOT);
                "toLowerCase(...)";
                lowerCase.getClass();
                if (set.contains(lowerCase)) {
                    zM10125 = true;
                } else {
                    try {
                        zM10125 = AbstractC5138.m10125(AbstractC8174.m13614(file3.getAbsolutePath()), ".", false);
                    } catch (Exception unused) {
                        zM10125 = false;
                    }
                }
                if (zM10125) {
                    arrayList2.add(obj);
                }
            }
            List listM8817 = AbstractC4343.m8817(arrayList2, new C0426(18));
            if (listM8817 != null) {
                return listM8817;
            }
        }
        return EmptyList.INSTANCE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static void m12234(File file, C8737 c8737) throws JSONException, IOException {
        "dir";
        file.getClass();
        "config";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", c8737.f24637);
        jSONObject.put("tags", new JSONArray((Collection) c8737.f24636));
        jSONObject.put("description", c8737.f24635);
        jSONObject.put("author", c8737.f24634);
        jSONObject.put("version", c8737.f24633);
        jSONObject.put("cover", c8737.f24632);
        File file2 = new File(file, "config.json");
        String string = jSONObject.toString(2);
        "toString(...)";
        string.getClass();
        Charset charset = AbstractC5131.f14688;
        charset.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            AbstractC4380.m8882(fileOutputStream, string, charset);
            fileOutputStream.close();
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m12235(p166.C7682 r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p075.C6957.m12235(飘花落叶言子哲苏兰世楪.飘花落叶言子楪世苏兰哲, android.text.Editable, int, int, boolean):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static Path m12236(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    @Override // p218.InterfaceC7972
    public Object create() {
        return new ArrayList();
    }

    @Override // retrofit2.InterfaceC5794
    public void onFailure(InterfaceC5777 interfaceC5777, Throwable th) {
        "call";
        "t";
        String strM6668 = "getBlacklist";
        String str = AbstractC6157.f16779;
        AbstractC6157.m11574(strM6668, th.toString(), th, true);
    }

    @Override // retrofit2.InterfaceC5794
    public void onResponse(InterfaceC5777 interfaceC5777, C5754 c5754) {
        QSResult qSResult;
        "call";
        "response";
        if (!c5754.f15757.f17003 || (qSResult = (QSResult) c5754.f15756) == null) {
            return;
        }
        ArrayList arrayList = AbstractC8802.f24775;
        Object data = qSResult.getData();
        "getData(...)";
        data.getClass();
        AbstractC8802.f24775 = new ArrayList((Collection) data);
        new C6864(new C8801(4)).start();
    }

    @Override // androidx.compose.animation.core.InterfaceC0335
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public float mo850(float f) {
        return 1.0f - ((float) Math.pow(1.0f - f, 3.0d));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC4721 mo9277(int i) {
        switch (this.f18601) {
            case 0:
                return ProtoBuf$Modality.valueOf(i);
            default:
                return ProtoBuf$Visibility.valueOf(i);
        }
    }

    @Override // p286.InterfaceC8400
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public EncodeStrategy mo292(C8396 c8396) {
        return EncodeStrategy.SOURCE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public void m12237() {
        C8207 c8207 = new C8207();
        c8207.f22615 = "\u5386\u53f2\u516c\u544a\u65e5\u5fd7";
        c8207.mo13704();
        c8207.f22627 = "\u52a0\u8f7d\u4e2d";
        c8207.mo13704();
        c8207.f22626 = "\u786e\u8ba4";
        c8207.mo13704();
        c8207.m13714();
        C8865.m14509().m14503().mo11106(new C6309(this, c8207, 1));
    }

    @Override // com.kongzue.dialogx.util.views.InterfaceC3756
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public boolean mo8096() {
        return false;
    }

    @Override // p230.InterfaceC8051
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public File mo11638(InterfaceC8392 interfaceC8392) {
        return null;
    }

    @Override // p286.InterfaceC8395
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public boolean mo298(Object obj, File file, C8396 c8396) throws Throwable {
        try {
            AbstractC7983.m13435(((C8083) ((C8081) ((InterfaceC2988) obj).get()).f22286.f20287).f22299.f23226.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Signature[] mo12238(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // p230.InterfaceC8051
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public void mo11635(InterfaceC8392 interfaceC8392, C0108 c0108) {
    }

    @Override // p286.InterfaceC8390
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo6531(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}

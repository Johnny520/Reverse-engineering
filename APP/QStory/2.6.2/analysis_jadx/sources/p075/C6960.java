package p075;

import android.content.Context;
import android.os.Handler;
import androidx.appcompat.app.RunnableC0100;
import androidx.fragment.app.AbstractC2313;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3056;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.InterfaceC4360;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ReturnValueStatus;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.view.main.itemview.Update;
import p010.AbstractC6157;
import p035.AbstractC6340;
import p089.C7179;
import p218.InterfaceC7972;
import p227.C8007;
import p228.C8026;
import p228.C8036;
import p228.InterfaceC8032;
import p228.InterfaceC8033;
import p230.C8052;
import p230.C8053;
import p232.InterfaceC8056;
import p232.InterfaceC8063;
import p232.InterfaceC8069;
import p232.InterfaceC8072;
import p331.C8799;
import p331.C8800;
import p335.AbstractC8804;
import p342.AbstractC8817;
import p342.C8821;
import p342.RunnableC8820;
import p348.InterfaceC8859;
import p349.C8865;
import retrofit2.C5754;
import retrofit2.InterfaceC5777;
import retrofit2.InterfaceC5794;
import top.suzhelan.qstory.entity.QSResult;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C6960 implements InterfaceC4722, InterfaceC8033, InterfaceC7972, InterfaceC8069, InterfaceC8056, InterfaceC8063, InterfaceC4360, InterfaceC5794 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static volatile C6960 f18646;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18647;

    public C6960() {
        this.f18647 = 25;
        Update.detectUpdates();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean m12245() {
        String currentUin = QQEnvTool.getCurrentUin();
        C8799 c8799 = new C8799();
        c8799.f24761 = AbstractC3056.m6668(-3937561652678100391L);
        c8799.f24760 = AbstractC3056.m6668(-3937706809687803303L);
        c8799.f24759 = 0;
        c8799.f24758 = AbstractC3056.m6668(-3937706809687803303L);
        C8799 c87992 = (C8799) new C8821().m14466(C8799.class, AbstractC3056.m6668(-3937706766738130343L));
        if (c87992 != null) {
            c8799 = c87992;
        }
        return AbstractC4394.m8917(currentUin, c8799.f24761);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C8799 m12246() {
        m12247();
        Object obj = C8865.m14507().m14495().execute().f15756;
        obj.getClass();
        C8799 c8799 = (C8799) ((QSResult) obj).getData();
        c8799.getClass();
        AbstractC3056.m6668(-3937706779623032231L);
        new C8821().m14465(c8799, AbstractC3056.m6668(-3937706766738130343L));
        if (m12245()) {
            return c8799;
        }
        C8821 c8821 = new C8821();
        String strM6668 = AbstractC3056.m6668(-3937626811626948007L);
        AbstractC3056.m6668(-3937803416387192231L);
        c8821.f24812.remove(strM6668);
        return m12246();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m12247() {
        InterfaceC8859 interfaceC8859M14507 = C8865.m14507();
        Object obj = interfaceC8859M14507.m14494().execute().f15756;
        obj.getClass();
        if (!((Boolean) ((QSResult) obj).getData()).booleanValue()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AbstractC3056.m6668(-3937586675157566887L), QQEnvTool.getCurrentUin());
            Object obj2 = interfaceC8859M14507.m14492(jSONObject).execute().f15756;
            obj2.getClass();
            C8800 c8800 = (C8800) ((QSResult) obj2).getData();
            c8800.getClass();
            AbstractC3056.m6668(-3937626811626948007L);
            new C8821().m14465(c8800, AbstractC3056.m6668(-3937626811626948007L));
        }
        Context context = AbstractC6340.f17460;
        ExecutorService executorService = AbstractC8804.f24777;
        executorService.execute(new RunnableC0100(context, 3));
        Handler handler = AbstractC8817.f24803;
        context.getClass();
        C7179 c7179 = new C7179(22);
        AbstractC3056.m6668(-3937616005489231271L);
        AbstractC3056.m6668(-3937358779897873831L);
        executorService.execute(new RunnableC8820(context, 0, c7179));
    }

    @Override // p218.InterfaceC7972
    public Object create() {
        try {
            return new C8053(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            C5919.m11252(e);
            return null;
        }
    }

    @Override // retrofit2.InterfaceC5794
    public void onFailure(InterfaceC5777 interfaceC5777, Throwable th) {
        AbstractC3056.m6668(-3937677187298362791L);
        AbstractC3056.m6668(-3937677097104049575L);
        String strM6668 = AbstractC3056.m6668(-3937707050205971879L);
        String str = AbstractC6157.f16779;
        AbstractC6157.m11574(strM6668, th.toString(), th, true);
    }

    @Override // retrofit2.InterfaceC5794
    public void onResponse(InterfaceC5777 interfaceC5777, C5754 c5754) {
        AbstractC3056.m6668(-3937677187298362791L);
        AbstractC3056.m6668(-3937677097104049575L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean mo12249(CharSequence charSequence) {
        return false;
    }

    @Override // p232.InterfaceC8069
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void mo12250(InterfaceC8072 interfaceC8072) {
        interfaceC8072.mo6730();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC4721 mo9277(int i) {
        return ProtoBuf$ReturnValueStatus.valueOf(i);
    }

    @Override // p228.InterfaceC8033
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public InterfaceC8032 mo316(C8026 c8026) {
        return new C8007(c8026.m13483(C8036.class, InputStream.class), 0);
    }

    public /* synthetic */ C6960(int i) {
        this.f18647 = i;
    }

    public C6960(C8052 c8052, AbstractC2313 abstractC2313) {
        this.f18647 = 16;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    private final void m12248(Object obj) {
    }

    @Override // p232.InterfaceC8056
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void mo12251(FragmentActivity fragmentActivity) {
    }

    @Override // p232.InterfaceC8069
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void mo12252(InterfaceC8072 interfaceC8072) {
    }
}

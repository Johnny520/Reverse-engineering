package p144;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.foundation.text.selection.C0916;
import com.alibaba.fastjson2.AbstractC2904;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.android.dex.DexException;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3061;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.util.C3770;
import de.robv.android.xposed.XC_MethodHook;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.C5175;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4387;
import kotlinx.serialization.UnknownFieldException;
import lin.xposed.hook.javaplugin.view.C5546;
import lin.xposed.hook.javaplugin.view.C5548;
import p010.C6158;
import p010.InterfaceC6159;
import p010.InterfaceC6161;
import p026.InterfaceC6294;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p035.AbstractC6340;
import p037.C6360;
import p075.C6960;
import p175.AbstractC7738;
import p217.AbstractC7968;
import p217.InterfaceC7962;
import p257.C8207;
import p319.C8696;
import p321.C8719;
import p324.C8744;
import p324.C8748;
import p324.CallableC8747;
import p330.C8790;
import p330.C8792;
import p330.C8794;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7546 implements InterfaceC7962, InterfaceC6161, InterfaceC6159, InterfaceC6294 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f20432;

    public /* synthetic */ C7546(int i) {
        this.f20432 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m12735(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m12736(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new RuntimeException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m12737(int i, Object obj, Object obj2, String str) {
        throw new JSONException(str + obj + obj2 + i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m12738(int i) {
        throw new UnknownFieldException(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m12739(Object obj, String str) {
        throw new DexException(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m12740(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static /* synthetic */ void m12741(Object obj, String str) {
        throw new DexException(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static /* synthetic */ void m12742(String str, Object obj, Object obj2, Object obj3) {
        throw new JSONException(str + obj + obj2 + obj3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m12743(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static /* synthetic */ void m12744(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static /* synthetic */ void m12745(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static /* synthetic */ void m12746(String str, Object obj, Throwable th) {
        throw new JSONException(str + obj, th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static /* synthetic */ void m12747(StringBuilder sb, int i) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // p217.InterfaceC7962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean mo12748(AbstractC7968 abstractC7968, View view, int i) {
        AbstractC3056.m6668(-3937831088861480359L);
        AbstractC3056.m6668(-3937690725035279783L);
        C8744 c8744 = (C8744) abstractC7968.f22045.get(i);
        int i2 = 2;
        C0916 c0916 = new C0916(abstractC7968, i, i2);
        AbstractC3056.m6668(-3937830277112661415L);
        c8744.getClass();
        AbstractC3056.m6668(-3937830294292530599L);
        Activity activityM13031 = AbstractC7738.m13031();
        if (activityM13031 == null) {
            return true;
        }
        ImageView imageView = new ImageView(activityM13031);
        int iM6267 = AbstractC2904.m6267(activityM13031, 40.0f);
        imageView.setPadding(iM6267, iM6267, iM6267, 0);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ((C3061) ComponentCallbacks2C3057.m6720(AbstractC6340.f17460).m6754(new File(c8744.f24649)).m6554()).m6744(imageView);
        int color = AbstractC6340.f17460.getColor(R.color.warning);
        C8207 c8207M13712 = C8207.m13712(AbstractC3056.m6668(-3937830143968675239L), AbstractC3056.m6668(-3937830225573053863L));
        c8207M13712.f22617 = new C8696(imageView, 0);
        c8207M13712.mo13704();
        c8207M13712.mo13702(AbstractC3056.m6668(-3937567120171468199L), new C5546(c8744, i2, c0916));
        C3770 c3770 = new C3770();
        c3770.f11737 = color;
        c3770.f11736 = true;
        c8207M13712.f22625 = c3770;
        c8207M13712.mo13704();
        String strM6668 = AbstractC3056.m6668(-3937640040126219687L);
        C5548 c5548 = new C5548(5);
        c8207M13712.f22630 = strM6668;
        c8207M13712.f22623 = c5548;
        c8207M13712.mo13704();
        return true;
    }

    @Override // p010.InterfaceC6159
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo8631(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = 1;
        switch (this.f20432) {
            case 16:
                methodHookParam.setResult(Boolean.FALSE);
                break;
            case 17:
            default:
                HashMap map = C8790.f24741;
                C8790.f24741.remove((Activity) methodHookParam.thisObject);
                System.gc();
                break;
            case 18:
                List list = C8719.f24583;
                try {
                    Object obj = methodHookParam.thisObject;
                    View view = obj instanceof View ? (View) obj : null;
                    if (view != null) {
                        view.setVisibility(8);
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = 0;
                            layoutParams.height = 0;
                            view.setLayoutParams(layoutParams);
                        }
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 19:
                List list2 = C8719.f24583;
                methodHookParam.setResult(Boolean.TRUE);
                break;
            case 20:
                List list3 = C8719.f24583;
                Object obj2 = methodHookParam.args[0];
                if (obj2 != null) {
                    String[] strArr = {AbstractC3056.m6668(-3937820458817422759L), AbstractC3056.m6668(-3937820407277815207L), AbstractC3056.m6668(-3937820308493567399L), AbstractC3056.m6668(-3937820235479123367L), AbstractC3056.m6668(-3937820149579777447L), AbstractC3056.m6668(-3937820188234483111L)};
                    for (int i2 = 0; i2 < 6; i2++) {
                        String str = strArr[i2];
                        String strM6668 = AbstractC3056.m6668(-3937561979095614887L);
                        try {
                            Field declaredField = obj2.getClass().getDeclaredField(str);
                            declaredField.setAccessible(true);
                            declaredField.set(obj2, strM6668);
                        } catch (Throwable unused2) {
                        }
                    }
                    break;
                }
                break;
            case 21:
                C6960 c6960 = C8748.f24653;
                Object objM11830 = AbstractC6317.m11830(List.class, methodHookParam.args[0]);
                AbstractC3056.m6668(-3937770933549532583L);
                objM11830.getClass();
                List listM8901 = AbstractC4387.m8901(objM11830);
                Object objM118302 = AbstractC6317.m11830(AbstractC6318.m11838(AbstractC3056.m6668(-3937564551781025191L)), listM8901.get(0));
                AbstractC3056.m6668(-3937833584237479335L);
                objM118302.getClass();
                Object objM11913 = C6360.m11913(objM118302, AbstractC3056.m6668(-3937575491062728103L), R.mipmap.ic_launcher_round, new CallableC8747(objM118302, i));
                objM11913.getClass();
                listM8901.add(0, objM11913);
                break;
            case 22:
                Object[] objArr = methodHookParam.args;
                Object obj3 = objArr[0];
                if (obj3 != null) {
                    if (obj3 instanceof Integer) {
                        if (((Integer) obj3).intValue() == 1003) {
                            methodHookParam.args[0] = 2333;
                        }
                    } else if (((Integer) objArr[1]).intValue() == 1003) {
                        methodHookParam.args[1] = 2333;
                    }
                    break;
                }
                break;
            case 23:
                if (AbstractC3056.m6668(-3937673467856684455L).equals(methodHookParam.args[0]) && ((Integer) methodHookParam.args[1]).intValue() == 2333) {
                    methodHookParam.args[1] = 1003;
                    break;
                }
                break;
            case 24:
                if (AbstractC3056.m6668(-3937673527986226599L).equals((String) methodHookParam.args[0])) {
                    methodHookParam.setResult(Boolean.FALSE);
                }
                break;
            case 25:
                methodHookParam.setResult(Boolean.FALSE);
                break;
            case 26:
                HashMap map2 = C8794.f24747;
                C8794.f24747.remove((Activity) methodHookParam.thisObject);
                System.gc();
                break;
            case 27:
                HashMap map3 = C8792.f24743;
                C8792.f24743.remove((Activity) methodHookParam.thisObject);
                System.gc();
                break;
            case 28:
                HashMap map4 = C8790.f24741;
                C8790.m14444((Activity) methodHookParam.thisObject, false);
                break;
        }
    }

    @Override // p010.InterfaceC6161
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Object mo10832(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f20432) {
            case 15:
                Object[] objArr = methodHookParam.args;
                AbstractC3056.m6668(-3937732158584784295L);
                objArr.getClass();
                Object objM8855 = AbstractC4346.m8855(objArr);
                AbstractC3056.m6668(-3937828215528359335L);
                objM8855.getClass();
                C6158 c6158 = new C6158();
                c6158.m11582(AbstractC4343.m8802((ArrayList) objM8855));
                Object objM11583 = c6158.m11583();
                String[] strArr = {AbstractC3056.m6668(-3937595621574444455L), AbstractC3056.m6668(-3937595612984509863L), AbstractC3056.m6668(-3937827966420256167L), AbstractC3056.m6668(-3937595535675098535L), AbstractC3056.m6668(-3937595638754313639L)};
                int i = 0;
                while (true) {
                    if (i < 5) {
                        String str = strArr[i];
                        if (objM11583 instanceof JSONObject) {
                            objM11583 = ((JSONObject) objM11583).get(str);
                            i++;
                        } else {
                            objM11583 = null;
                        }
                    }
                }
                if ((objM11583 != null ? objM11583.toString() : null) != null) {
                    return null;
                }
                return C5175.f14739;
            default:
                return null;
        }
    }
}

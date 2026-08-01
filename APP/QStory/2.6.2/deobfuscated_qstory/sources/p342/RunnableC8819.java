package p342;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.compose.runtime.internal.C1251;
import androidx.fragment.app.RunnableC2346;
import com.bumptech.glide.AbstractC3056;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import java.util.ArrayList;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Ref$ObjectRef;
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.util.qq.QQFriendTool;
import p010.AbstractC6157;
import p087.C7067;
import p193.C7827;
import p257.AbstractC8210;
import p257.C8197;
import p257.C8232;
import p338.C8810;
import p352.C8873;
import p356.C8901;
import p392.AbstractC9124;

/* JADX INFO: renamed from: 飘花落叶言苏哲世子楪兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8819 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f24806;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24807;

    public /* synthetic */ RunnableC8819(Object obj, int i) {
        this.f24807 = i;
        this.f24806 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, java.lang.Object, java.util.Map<java.lang.Integer, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object, java.util.ArrayList<top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo>] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f24807;
        final int i2 = 1;
        Object obj = this.f24806;
        switch (i) {
            case 0:
                ((C7067) obj).invoke("");
                return;
            case 1:
                C8873 c8873 = (C8873) obj;
                Handler handler = c8873.f25009;
                try {
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    C8810.f24796.getClass();
                    ref$ObjectRef.element = C8810.m14454();
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef2.element = C8810.m14457();
                    if (((ArrayList) ref$ObjectRef.element).isEmpty()) {
                        QQFriendTool.FriendListResult allFriendWithCategories = QQFriendTool.getAllFriendWithCategories();
                        ?? r4 = allFriendWithCategories.friends;
                        "friends";
                        r4.getClass();
                        ref$ObjectRef.element = r4;
                        ?? r3 = allFriendWithCategories.categories;
                        "categories";
                        r3.getClass();
                        ref$ObjectRef2.element = r3;
                    }
                    handler.post(new RunnableC2346(ref$ObjectRef, c8873, ref$ObjectRef2, 12));
                    return;
                } catch (Exception e) {
                    final int i3 = 0;
                    handler.post(new Runnable() { // from class: 飘花落叶言苏哲楪世子兰.飘花落叶言子楪世苏哲兰
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i3;
                            Exception exc = e;
                            switch (i4) {
                                case 0:
                                    C8197.m13693();
                                    AbstractC8210.m13718("\u52a0\u8f7d\u5931\u8d25: " + exc.getMessage(), WaitDialog$TYPE.ERROR);
                                    break;
                                default:
                                    C8197.m13693();
                                    AbstractC8210.m13718("\u52a0\u8f7d\u5931\u8d25: " + exc.getMessage(), WaitDialog$TYPE.ERROR);
                                    break;
                            }
                        }
                    });
                    return;
                }
            case 2:
                C7827 c7827 = (C7827) obj;
                Handler handler2 = (Handler) c7827.f21370;
                try {
                    ArrayList<GroupInfo> arrayListM14671 = AbstractC9124.m14671();
                    String currentUin = QQEnvTool.getCurrentUin();
                    String str = "\u7fa4\u5217\u8868: " + arrayListM14671;
                    String str2 = AbstractC6157.f16779;
                    AbstractC6157.m11573(str, "Run Log");
                    ArrayList arrayList = new ArrayList(AbstractC4344.m8832(arrayListM14671, 10));
                    for (GroupInfo groupInfo : arrayListM14671) {
                        arrayList.add(new C8901(groupInfo, AbstractC4394.m8917(groupInfo.GroupOwner, currentUin)));
                    }
                    handler2.post(new RunnableC8820(arrayList, 5, c7827));
                    return;
                } catch (Exception e2) {
                    handler2.post(new Runnable() { // from class: 飘花落叶言苏哲楪世子兰.飘花落叶言子楪世苏哲兰
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i2;
                            Exception exc = e2;
                            switch (i4) {
                                case 0:
                                    C8197.m13693();
                                    AbstractC8210.m13718("\u52a0\u8f7d\u5931\u8d25: " + exc.getMessage(), WaitDialog$TYPE.ERROR);
                                    break;
                                default:
                                    C8197.m13693();
                                    AbstractC8210.m13718("\u52a0\u8f7d\u5931\u8d25: " + exc.getMessage(), WaitDialog$TYPE.ERROR);
                                    break;
                            }
                        }
                    });
                    return;
                }
            case 3:
                C1251 c1251 = (C1251) obj;
                EditText editText = (EditText) c1251.f3635;
                if (editText == null) {
                    AbstractC4394.m8918("inputEdit");
                    throw null;
                }
                editText.requestFocus();
                Object systemService = ((Context) c1251.f3631).getSystemService("input_method");
                systemService.getClass();
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                EditText editText2 = (EditText) c1251.f3635;
                if (editText2 != null) {
                    inputMethodManager.showSoftInput(editText2, 1);
                    return;
                } else {
                    AbstractC4394.m8918("inputEdit");
                    throw null;
                }
            default:
                ((C8232) obj).m13739();
                return;
        }
    }
}

package p352;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.compose.runtime.internal.C1251;
import androidx.fragment.app.RunnableC2346;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import java.util.ArrayList;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.Ref$ObjectRef;
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.util.qq.QQFriendTool;
import p010.AbstractC6188;
import p053.AbstractC6561;
import p087.C7068;
import p193.C7828;
import p257.AbstractC8211;
import p257.C8198;
import p257.C8233;
import p287.AbstractC8405;
import p339.C8808;
import p354.C8880;
import p355.C8890;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪兰世子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8867 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f25010;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25011;

    public /* synthetic */ RunnableC8867(Object obj, int i) {
        this.f25011 = i;
        this.f25010 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, java.lang.Object, java.util.Map<java.lang.Integer, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object, java.util.ArrayList<top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo>] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f25011;
        final int i2 = 1;
        Object obj = this.f25010;
        switch (i) {
            case 0:
                ((C7068) obj).invoke("");
                return;
            case 1:
                C8890 c8890 = (C8890) obj;
                Handler handler = c8890.f25060;
                try {
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    C8808.f24794.getClass();
                    ref$ObjectRef.element = C8808.m14477();
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef2.element = C8808.m14480();
                    if (((ArrayList) ref$ObjectRef.element).isEmpty()) {
                        QQFriendTool.FriendListResult allFriendWithCategories = QQFriendTool.getAllFriendWithCategories();
                        ?? r4 = allFriendWithCategories.friends;
                        AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵喵呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜喵喵喵~喵喵喵呜喵喵呜喵");
                        r4.getClass();
                        ref$ObjectRef.element = r4;
                        ?? r3 = allFriendWithCategories.categories;
                        AbstractC8405.m13972(3101);
                        r3.getClass();
                        ref$ObjectRef2.element = r3;
                    }
                    handler.post(new RunnableC2346(ref$ObjectRef, c8890, ref$ObjectRef2, 12));
                    return;
                } catch (Exception e) {
                    final int i3 = 0;
                    handler.post(new Runnable() { // from class: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪世苏哲兰
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i3;
                            Exception exc = e;
                            switch (i4) {
                                case 0:
                                    C8198.m13710();
                                    AbstractC8211.m13735(AbstractC8405.m13972(3111) + exc.getMessage(), WaitDialog$TYPE.ERROR);
                                    break;
                                default:
                                    C8198.m13710();
                                    AbstractC8211.m13735(AbstractC8405.m13972(3111) + exc.getMessage(), WaitDialog$TYPE.ERROR);
                                    break;
                            }
                        }
                    });
                    return;
                }
            case 2:
                C7828 c7828 = (C7828) obj;
                Handler handler2 = (Handler) c7828.f21367;
                try {
                    ArrayList<GroupInfo> arrayListM12047 = AbstractC6561.m12047();
                    String currentUin = QQEnvTool.getCurrentUin();
                    String str = AbstractC8405.m13972(3117) + arrayListM12047;
                    String str2 = AbstractC6188.f17016;
                    AbstractC6188.m11604(str, AbstractC8405.m13973("喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵呜喵喵呜喵喵喵~喵喵呜喵呜喵喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵喵呜呜喵"));
                    ArrayList arrayList = new ArrayList(AbstractC4345.m8822(arrayListM12047, 10));
                    for (GroupInfo groupInfo : arrayListM12047) {
                        arrayList.add(new C8880(groupInfo, AbstractC4395.m8907(groupInfo.GroupOwner, currentUin)));
                    }
                    handler2.post(new RunnableC8868(arrayList, 5, c7828));
                    return;
                } catch (Exception e2) {
                    handler2.post(new Runnable() { // from class: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪世苏哲兰
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i2;
                            Exception exc = e2;
                            switch (i4) {
                                case 0:
                                    C8198.m13710();
                                    AbstractC8211.m13735(AbstractC8405.m13972(3111) + exc.getMessage(), WaitDialog$TYPE.ERROR);
                                    break;
                                default:
                                    C8198.m13710();
                                    AbstractC8211.m13735(AbstractC8405.m13972(3111) + exc.getMessage(), WaitDialog$TYPE.ERROR);
                                    break;
                            }
                        }
                    });
                    return;
                }
            case 3:
                C1251 c1251 = (C1251) obj;
                EditText editText = (EditText) c1251.f3636;
                if (editText == null) {
                    AbstractC4395.m8908("inputEdit");
                    throw null;
                }
                editText.requestFocus();
                Object systemService = ((Context) c1251.f3632).getSystemService("input_method");
                systemService.getClass();
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                EditText editText2 = (EditText) c1251.f3636;
                if (editText2 != null) {
                    inputMethodManager.showSoftInput(editText2, 1);
                    return;
                } else {
                    AbstractC4395.m8908("inputEdit");
                    throw null;
                }
            default:
                ((C8233) obj).m13755();
                return;
        }
    }
}

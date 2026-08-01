package p368;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.compose.runtime.internal.C2086;
import androidx.fragment.app.RunnableC3179;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import java.util.ArrayList;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$ObjectRef;
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import lin.xposed.hook.util.p011qq.QQFriendTool;
import p026.AbstractC7017;
import p069.AbstractC7390;
import p103.C7897;
import p209.C8657;
import p273.AbstractC9040;
import p273.C9027;
import p273.C9062;
import p303.AbstractC9234;
import p355.C9637;
import p370.C9709;
import p371.C9719;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪兰世子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC9696 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f25355;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25356;

    public /* synthetic */ RunnableC9696(Object obj, int i) {
        this.f25356 = i;
        this.f25355 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, java.lang.Object, java.util.Map<java.lang.Integer, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object, java.util.ArrayList<top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo>] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f25356;
        final int i2 = 1;
        Object obj = this.f25355;
        switch (i) {
            case 0:
                ((C7897) obj).invoke("");
                return;
            case 1:
                C9719 c9719 = (C9719) obj;
                Handler handler = c9719.f25405;
                try {
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    C9637.f25139.getClass();
                    ref$ObjectRef.element = C9637.m15036();
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef2.element = C9637.m15039();
                    if (((ArrayList) ref$ObjectRef.element).isEmpty()) {
                        QQFriendTool.FriendListResult allFriendWithCategories = QQFriendTool.getAllFriendWithCategories();
                        ?? r4 = allFriendWithCategories.friends;
                        AbstractC9234.m14532("喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵喵呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜喵喵喵~喵喵喵呜喵喵呜喵");
                        r4.getClass();
                        ref$ObjectRef.element = r4;
                        ?? r3 = allFriendWithCategories.categories;
                        AbstractC9234.m14531(3101);
                        r3.getClass();
                        ref$ObjectRef2.element = r3;
                    }
                    handler.post(new RunnableC3179(ref$ObjectRef, c9719, ref$ObjectRef2, 12));
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
                                    C9027.m14269();
                                    AbstractC9040.m14294(AbstractC9234.m14531(3111) + exc.getMessage(), WaitDialog$TYPE.ERROR);
                                    break;
                                default:
                                    C9027.m14269();
                                    AbstractC9040.m14294(AbstractC9234.m14531(3111) + exc.getMessage(), WaitDialog$TYPE.ERROR);
                                    break;
                            }
                        }
                    });
                    return;
                }
            case 2:
                C8657 c8657 = (C8657) obj;
                Handler handler2 = (Handler) c8657.f21712;
                try {
                    ArrayList<GroupInfo> arrayListM12606 = AbstractC7390.m12606();
                    String currentUin = QQEnvTool.getCurrentUin();
                    String str = AbstractC9234.m14531(3117) + arrayListM12606;
                    String str2 = AbstractC7017.f17361;
                    AbstractC7017.m12163(str, AbstractC9234.m14532("喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵呜喵喵呜喵喵喵~喵喵呜喵呜喵喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵喵呜呜喵"));
                    ArrayList arrayList = new ArrayList(AbstractC5177.m9381(arrayListM12606, 10));
                    for (GroupInfo groupInfo : arrayListM12606) {
                        arrayList.add(new C9709(groupInfo, AbstractC5227.m9466(groupInfo.GroupOwner, currentUin)));
                    }
                    handler2.post(new RunnableC9697(arrayList, 5, c8657));
                    return;
                } catch (Exception e2) {
                    handler2.post(new Runnable() { // from class: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪世苏哲兰
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i2;
                            Exception exc = e2;
                            switch (i4) {
                                case 0:
                                    C9027.m14269();
                                    AbstractC9040.m14294(AbstractC9234.m14531(3111) + exc.getMessage(), WaitDialog$TYPE.ERROR);
                                    break;
                                default:
                                    C9027.m14269();
                                    AbstractC9040.m14294(AbstractC9234.m14531(3111) + exc.getMessage(), WaitDialog$TYPE.ERROR);
                                    break;
                            }
                        }
                    });
                    return;
                }
            case 3:
                C2086 c2086 = (C2086) obj;
                EditText editText = (EditText) c2086.f3981;
                if (editText == null) {
                    AbstractC5227.m9467("inputEdit");
                    throw null;
                }
                editText.requestFocus();
                Object systemService = ((Context) c2086.f3977).getSystemService("input_method");
                systemService.getClass();
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                EditText editText2 = (EditText) c2086.f3981;
                if (editText2 != null) {
                    inputMethodManager.showSoftInput(editText2, 1);
                    return;
                } else {
                    AbstractC5227.m9467("inputEdit");
                    throw null;
                }
            default:
                ((C9062) obj).m14314();
                return;
        }
    }
}

package p001;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.widget.FrameLayout;
import de.robv.android.xposed.XC_MethodHook;
import p001.C0283k8;

/* JADX INFO: renamed from: ۟.j7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0268j7 extends AbstractC0335o4 implements InterfaceC0222g3<XC_MethodHook.MethodHookParam, C0433vb> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C0310m7 f877;

    public C0268j7(C0310m7 c0310m7) {
        this.f877 = c0310m7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0433vb mo984(XC_MethodHook.MethodHookParam methodHookParam) {
        String string;
        Object objM1203;
        XC_MethodHook.MethodHookParam methodHookParam2 = methodHookParam;
        C0237h4.m1090("it", methodHookParam2);
        Object obj = methodHookParam2.thisObject;
        C0237h4.m1088("null cannot be cast to non-null type android.app.Activity", obj);
        Intent intent = ((Activity) obj).getIntent();
        if (intent != null) {
            C0274k c0274k = C0283k8.f1632;
            Parcelable parcelableExtra = intent.getParcelableExtra(C0283k8.a.m885().f1609);
            if (parcelableExtra == null || (objM1203 = C0373r3.m1203(parcelableExtra, C0283k8.a.m885().f1610)) == null || (string = objM1203.toString()) == null) {
                string = "";
            }
        }
        int i = 0;
        if (string.length() > 0) {
            Object obj2 = methodHookParam2.thisObject;
            C0237h4.m1088("null cannot be cast to non-null type android.app.Activity", obj2);
            FrameLayout frameLayout = (FrameLayout) ((Activity) obj2).findViewById(R.id.content);
            frameLayout.post(new RunnableC0240h7(frameLayout, this.f877, string, i));
        }
        return C0433vb.f1163;
    }
}

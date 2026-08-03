package p332wb;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p129ig.AbstractC2043a;
import p154k9.C2366j;
import p190n2.C2884s;
import p218og.AbstractC3149m;
import p276sf.C3967n;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: wb.ok */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5180ok implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f19419g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f19420h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f19421i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f19422j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f19423k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f19424l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f19425m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5180ok(Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, C2366j c2366j, C5229q3 c5229q3, boolean z9) {
        this.f19420h = z9;
        this.f19423k = context;
        this.f19424l = c2366j;
        this.f19425m = c5229q3;
        this.f19421i = interfaceC1809a1;
        this.f19422j = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        View decorView;
        switch (this.f19419g) {
            case 0:
                Context context = (Context) this.f19423k;
                C2366j c2366j = (C2366j) this.f19424l;
                C5229q3 c5229q3 = (C5229q3) this.f19425m;
                int i9 = 0;
                if (this.f19420h) {
                    C2366j c2366jM5671a = C2366j.m5671a(c2366j, AbstractC3149m.m6703R0(c2366j.f7773b).toString(), null, AbstractC3149m.m6703R0(c2366j.f7775d).toString(), null, null, false, 117);
                    C2366j c2366j2 = c5229q3.f20119a;
                    if (c2366j2 != null) {
                        String str = c2366j2.f7776e;
                        if (!AbstractC1416l.m3825a(str, c2366jM5671a.f7776e)) {
                            AbstractC2043a.m5039m(context, str);
                        }
                    }
                    if (c2366j2 != null) {
                        String str2 = c2366j2.f7777f;
                        if (!AbstractC1416l.m3825a(str2, c2366jM5671a.f7777f)) {
                            AbstractC2043a.m5039m(context, str2);
                        }
                    }
                    InterfaceC1809a1 interfaceC1809a1 = this.f19421i;
                    ArrayList arrayListM8409R1 = AbstractC4166m.m8409R1((List) interfaceC1809a1.getValue());
                    Iterator it = arrayListM8409R1.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i9 = -1;
                        } else if (!AbstractC1416l.m3825a(((C2366j) it.next()).f7772a, c2366jM5671a.f7772a)) {
                            i9++;
                        }
                    }
                    if (i9 >= 0) {
                        arrayListM8409R1.set(i9, c2366jM5671a);
                    } else {
                        arrayListM8409R1.add(c2366jM5671a);
                    }
                    AbstractC4955ho.m9455V0(context, interfaceC1809a1, arrayListM8409R1);
                    this.f19422j.setValue(null);
                } else {
                    Toast.makeText(context, "请填写完整的快捷项信息", 0).show();
                }
                break;
            default:
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f19423k;
                Activity activity = (Activity) this.f19424l;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f19425m;
                String string = AbstractC3149m.m6703R0(((C2884s) this.f19421i.getValue()).f9316a.f6529h).toString();
                if (string.length() != 0 || this.f19420h) {
                    interfaceC1220a.invoke();
                    C5362u4 c5362u4 = new C5362u4(4, interfaceC1231l, string);
                    Window window = activity.getWindow();
                    if (window != null && (decorView = window.getDecorView()) != null) {
                        decorView.postOnAnimation(new RunnableC5421vu(activity, c5362u4));
                    }
                } else {
                    this.f19422j.setValue("内容不能为空");
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5180ok(boolean z9, InterfaceC1220a interfaceC1220a, Activity activity, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1231l interfaceC1231l) {
        this.f19420h = z9;
        this.f19423k = interfaceC1220a;
        this.f19424l = activity;
        this.f19421i = interfaceC1809a1;
        this.f19422j = interfaceC1809a12;
        this.f19425m = interfaceC1231l;
    }
}

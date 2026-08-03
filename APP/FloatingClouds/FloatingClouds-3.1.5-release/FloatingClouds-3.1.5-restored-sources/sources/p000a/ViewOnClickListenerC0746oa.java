package p000a;

import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;

/* JADX INFO: renamed from: a.oa */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0746oa implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2948a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TextView f2949b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2950c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f2951d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f2952e;

    public /* synthetic */ ViewOnClickListenerC0746oa(Object obj, View view, TextView textView, Object obj2, int i) {
        this.f2948a = i;
        this.f2950c = obj;
        this.f2951d = view;
        this.f2949b = textView;
        this.f2952e = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int size;
        String str;
        String str2;
        switch (this.f2948a) {
            case 0:
                ((InterfaceC0064D7) this.f2950c).mo53f(((EditText) this.f2951d).getText().toString());
                TextView textView = this.f2949b;
                textView.setText("已保存");
                textView.postDelayed(new RunnableC0221M2(12, textView), 1500L);
                Toast.makeText(((C0803ra) this.f2952e).f3168a, "保存成功", 0).show();
                break;
            default:
                C0303Qc c0303Qc = (C0303Qc) this.f2950c;
                boolean z = c0303Qc.f1097a;
                c0303Qc.f1097a = !z;
                ((ScrollView) this.f2951d).setVisibility(!z ? 0 : 8);
                boolean z2 = c0303Qc.f1097a;
                List list = (List) this.f2952e;
                if (z2) {
                    size = list.size();
                    str = "▾ 最近事件（";
                    str2 = " 条）点击收起";
                } else {
                    size = list.size();
                    str = "▸ 最近事件（";
                    str2 = " 条）点击展开";
                }
                this.f2949b.setText(C0944z.m2223c(size, str, str2));
                break;
        }
    }
}

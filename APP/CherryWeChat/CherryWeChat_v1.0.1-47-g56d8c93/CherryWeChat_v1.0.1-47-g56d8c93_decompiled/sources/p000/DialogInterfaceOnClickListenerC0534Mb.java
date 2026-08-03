package p000;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;

/* JADX INFO: renamed from: Mb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0534Mb implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1738a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1739b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ KeyEvent.Callback f1740c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f1741d;

    public /* synthetic */ DialogInterfaceOnClickListenerC0534Mb(Object obj, KeyEvent.Callback callback, Object obj2, int i) {
        this.f1738a = i;
        this.f1739b = obj;
        this.f1740c = callback;
        this.f1741d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5 A[Catch: Exception -> 0x00aa, TryCatch #1 {Exception -> 0x00aa, blocks: (B:23:0x009f, B:25:0x00a5, B:30:0x00b0, B:32:0x00b4, B:34:0x00bc, B:36:0x00c8, B:41:0x00fc, B:37:0x00e0, B:39:0x00e5, B:40:0x00e8), top: B:52:0x009f }] */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f1738a;
        Object obj = this.f1741d;
        KeyEvent.Callback callback = this.f1740c;
        Object obj2 = this.f1739b;
        switch (i2) {
            case 0:
                View view = (View) callback;
                Context context = (Context) obj;
                String str = ((String[]) obj2)[i];
                SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
                AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-23145578756149L), str);
                if (view instanceof C2748yA) {
                    ((C2748yA) view).setValue(str);
                }
                dialogInterface.dismiss();
                Toast.makeText(context, AbstractC0295Gu.m625r(-23287312676917L).concat(str), 0).show();
                break;
            case 1:
                File file = (File) obj2;
                C0625Og c0625Og = (C0625Og) callback;
                C0140DA c0140da = (C0140DA) obj;
                try {
                    File parentFile = file.getParentFile();
                    File[] fileArrListFiles = parentFile != null ? parentFile.listFiles() : null;
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            if (file2.isDirectory() && !AbstractC0585Nj.m1134a(file2.getName(), c0140da.f364a)) {
                                file.delete();
                                Toast.makeText(c0625Og.getContext(), AbstractC0295Gu.m625r(-78073915504693L), 0).show();
                            }
                        }
                        if (parentFile != null) {
                            AbstractC2675wh.m5239b0(parentFile);
                        }
                        Toast.makeText(c0625Og.getContext(), AbstractC0295Gu.m625r(-78108275243061L), 0).show();
                    } else {
                        if (parentFile != null) {
                        }
                        Toast.makeText(c0625Og.getContext(), AbstractC0295Gu.m625r(-78108275243061L), 0).show();
                    }
                    c0625Og.f1989a.notifyDataSetChanged();
                } catch (Exception e) {
                    Toast.makeText(c0625Og.getContext(), AbstractC0213Ey.m405c(-78134045046837L, new StringBuilder(), e), 0).show();
                    return;
                }
                break;
            case 2:
                C0185EC c0185ec = (C0185EC) obj2;
                TextView textView = (TextView) callback;
                C0625Og c0625Og2 = (C0625Og) obj;
                try {
                    C0183EA c0183ea = C0183EA.f539a;
                    String str2 = c0185ec.f549a;
                    c0183ea.getClass();
                    File file3 = new File(C0183EA.m377e(str2));
                    if (file3.exists()) {
                        AbstractC2675wh.m5239b0(file3);
                        Toast.makeText(textView.getContext(), AbstractC0295Gu.m625r(-97719095916597L), 0).show();
                        c0625Og2.f1989a.notifyDataSetChanged();
                    }
                } catch (Exception e2) {
                    Toast.makeText(textView.getContext(), AbstractC0213Ey.m405c(-97744865720373L, new StringBuilder(), e2), 0).show();
                    return;
                }
                break;
            default:
                C0784SA c0784sa = (C0784SA) obj2;
                Activity activity = (Activity) callback;
                String str3 = (String) obj;
                dialogInterface.dismiss();
                String strM625r = AbstractC0295Gu.m625r(i == 0 ? -490352121215029L : -490382185986101L);
                if (c0784sa.f2480g != null) {
                    C1498hd c1498hd = AbstractC1499he.f5282a;
                    AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C0950W4(str3, strM625r, activity, c0784sa, (InterfaceC0190Eb) null, 3), 3);
                    break;
                }
                break;
        }
    }
}

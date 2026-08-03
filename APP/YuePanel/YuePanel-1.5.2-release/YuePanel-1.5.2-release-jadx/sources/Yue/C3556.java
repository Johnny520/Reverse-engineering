package Yue;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۣ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3556 implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ EditText f6071;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ C3549 f6072;

    static {
        NativeUtil.classesInit0(449);
    }

    public /* synthetic */ C3556(EditText editText, C3549 c3549) {
        this.f6071 = editText;
        this.f6072 = c3549;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final native boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent);
}

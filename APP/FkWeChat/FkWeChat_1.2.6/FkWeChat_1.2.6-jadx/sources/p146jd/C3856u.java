package p146jd;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import md.AbstractC5161p;
import p053dd.C1951c;
import p068ed.InterfaceC2214c;
import p315vd.AbstractC8924d;

/* JADX INFO: renamed from: jd.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3856u implements InterfaceC2214c {
    @Override // p068ed.InterfaceC2214c
    /* JADX INFO: renamed from: b */
    public void mo7977b(View view, final C1951c c1951c) {
        try {
            final View viewM7978c = m7978c("MMTextView", view);
            if (viewM7978c == null) {
                return;
            }
            String string = getString("transfer_money_" + c1951c.msgId, null);
            if (!TextUtils.isEmpty(string)) {
                AbstractC5161p.callMethod(viewM7978c, "setText", string);
            }
            viewM7978c.setOnLongClickListener(new View.OnLongClickListener() { // from class: jd.r
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return this.f11038a.m15289h(viewM7978c, c1951c, view2);
                }
            });
        } catch (Exception e10) {
            AbstractC8924d.m34264d("TransferHandler", "onMsgItem error", e10);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean m15289h(View view, C1951c c1951c, View view2) {
        m15292k(c1951c, view, (CharSequence) AbstractC5161p.callMethod(view, "getText", new Object[0]));
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m15290i(EditText editText, C1951c c1951c, View view, DialogInterface dialogInterface, int i10) {
        String strTrim = editText.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        setString("transfer_money_" + c1951c.msgId, strTrim);
        AbstractC5161p.callMethod(view, "setText", strTrim);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m15291j(C1951c c1951c, View view, CharSequence charSequence, DialogInterface dialogInterface, int i10) {
        remove("transfer_money_" + c1951c.msgId);
        AbstractC5161p.callMethod(view, "setText", charSequence);
    }

    /* JADX INFO: renamed from: k */
    public final void m15292k(final C1951c c1951c, final View view, final CharSequence charSequence) {
        try {
            Context context = view.getContext();
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle("修改消息/转账");
            final EditText editText = new EditText(context);
            editText.setText(charSequence);
            builder.setView(editText);
            builder.setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: jd.s
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f11041a.m15290i(editText, c1951c, view, dialogInterface, i10);
                }
            });
            builder.setNeutralButton("恢复", new DialogInterface.OnClickListener() { // from class: jd.t
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f11045a.m15291j(c1951c, view, charSequence, dialogInterface, i10);
                }
            });
            builder.setNegativeButton("取消", (DialogInterface.OnClickListener) null);
            builder.show();
        } catch (Exception e10) {
            AbstractC8924d.m34264d("TransferHandler", "showEditDialog error", e10);
        }
    }
}

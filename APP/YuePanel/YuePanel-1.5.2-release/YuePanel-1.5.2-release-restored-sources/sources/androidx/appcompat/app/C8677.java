package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AbstractC1583;

/* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8677 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final AbstractC1583.InterfaceC8642 f25863;

    public C8677(AbstractC1583.InterfaceC8642 interfaceC8642) {
        this.f25863 = interfaceC8642;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        AbstractC1583.InterfaceC8642 interfaceC8642 = this.f25863;
        if (interfaceC8642 != null) {
            interfaceC8642.m4597(i, j);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}

package p025N;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.C0481f;
import androidx.emoji2.text.C0485j;
import java.nio.ByteBuffer;
import p023M.C0248b;
import p089x0.C1121e;

/* JADX INFO: renamed from: N.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0251b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final TextView f529a;

    /* JADX INFO: renamed from: b */
    public final C1121e f530b;

    public C0251b(TextView r5, InputConnection r6, EditorInfo r7) {
        C1121e r02 = new C1121e(4);
        super(r6, false);
        this.f529a = r5;
        this.f530b = r02;
        if (C0485j.f1354k == null) goto L17;
        C0485j r52 = C0485j.m1199a();
        if (r52.m1200b() != 1) goto L18;
        if (r7 != null) goto L9;
        return;
    L9:
        if (r7.extras != null) goto L11;
        r7.extras = new Bundle();
    L11:
        C0481f r53 = r52.f1359e;
        r53.getClass();
        Bundle r62 = r7.extras;
        C0248b r03 = (C0248b) r53.f1352c.f1044a;
        int r2 = r03.m205a(4);
        if (r2 == 0) goto L14;
        int r04 = ((ByteBuffer) r03.f214d).getInt(r2 + r03.f211a);
    L15:
        r62.putInt("android.support.text.emoji.emojiCompat_metadataVersion", r04);
        Bundle r63 = r7.extras;
        r53.f1350a.getClass();
        r63.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        return;
    L14:
        r04 = 0;
        goto L15
    L18:
        return;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int r3, int r4) {
        Editable r02 = this.f529a.getEditableText();
        this.f530b.getClass();
        if (C1121e.m2637e(this, r02, r3, r4, false) == false) goto L5;
    L6:
        return true;
    L5:
        if (super.deleteSurroundingText(r3, r4) == true) goto L6;
        return false;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int r3, int r4) {
        Editable r02 = this.f529a.getEditableText();
        this.f530b.getClass();
        if (C1121e.m2637e(this, r02, r3, r4, true) == false) goto L5;
        return true;
    L5:
        if (super.deleteSurroundingTextInCodePoints(r3, r4) == true) goto L10;
        return false;
    L10:
        return true;
    }
}

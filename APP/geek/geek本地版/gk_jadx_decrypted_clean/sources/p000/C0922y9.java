package p000;

import android.app.C0987;
import android.app.C0989;
import android.support.v4.graphics.drawable.C0990;
import android.support.v4.graphics.drawable.C0992;
import android.text.TextWatcher;
import androidx.activity.result.C0994;
import androidx.appcompat.app.C0998;
import androidx.appcompat.widget.C0999;
import androidx.constraintlayout.widget.C1006;
import androidx.emoji2.text.C1012;
import androidx.fragment.app.C1013;
import androidx.savedstate.C1020;
import androidx.savedstate.C1021;
import androidx.versionedparcelable.C1024;
import com.github.megatronking.stringfog.annotation.C1030;
import com.google.android.material.theme.C1049;
import java.util.ArrayList;

/* JADX INFO: renamed from: y9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0922y9 implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final g00 f5301a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f5302b;

    /* JADX INFO: renamed from: c */
    public final g00 f5303c;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0922y9(p000.g00 r4, java.util.ArrayList r5, p000.g00 r6) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0922y9.<init>(g00, java.util.ArrayList, g00):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0019. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0312 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x030b A[SYNTHETIC] */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void afterTextChanged(android.text.Editable r20) {
        /*
            Method dump skipped, instruction units count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0922y9.afterTextChanged(android.text.Editable):void");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Integer numDecode = null;
        int iM2872 = C0992.m2872("۠ۢۨ");
        while (true) {
            switch (iM2872) {
                case 1747649:
                    return;
                case 1747750:
                    if (C1049.m3098() <= 0) {
                        iM2872 = (C0998.f5642 / C1024.f5668) + 1751496;
                    }
                    break;
                case 1749578:
                    iM2872 = C1012.f5656 + C0994.f5638 + 1747839;
                    continue;
                case 1750657:
                    System.out.println(numDecode);
                    iM2872 = C1057.f5701 + C1030.f5674 + 1747917;
                    continue;
                case 1751496:
                    numDecode = Integer.decode(C0999.m2900("gbIGEhTlb"));
                    iM2872 = (C0990.f5634 * C1006.f5650) ^ 1587289;
                    continue;
                case 1753421:
                    break;
            }
            iM2872 = C0989.m2860() >= 0 ? C0987.m2851("۠ۨۢ") : (C1013.f5657 % C1020.f5664) + 1748092;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int iM2881 = C0994.m2881("ۥۣ");
        while (true) {
            switch (iM2881) {
                case 56478:
                    return;
                case 1746882:
                    iM2881 = C1021.m2986(C1024.f5668 >= 0 ? "ۤۧۤ" : "ۥۣ");
                    break;
            }
        }
    }
}

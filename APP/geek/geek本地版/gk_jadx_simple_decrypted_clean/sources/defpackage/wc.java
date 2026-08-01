package defpackage;

import android.app.Activity;
import android.app.C0000;
import android.app.C0001;
import android.app.C0002;
import android.app.C0003;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0005;
import android.support.v4.graphics.drawable.C0006;
import android.text.TextUtils;
import android.view.C0007;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.C0011;
import androidx.activity.result.C0008;
import androidx.activity.result.C0009;
import androidx.appcompat.app.C0012;
import androidx.appcompat.widget.C0014;
import androidx.appcompat.widget.C0015;
import androidx.appcompat.widget.C0016;
import androidx.constraintlayout.helper.widget.C0017;
import androidx.constraintlayout.widget.C0018;
import androidx.constraintlayout.widget.C0019;
import androidx.constraintlayout.widget.C0020;
import androidx.coordinatorlayout.widget.C0021;
import androidx.coordinatorlayout.widget.C0022;
import androidx.core.content.C0023;
import androidx.core.content.C0024;
import androidx.core.widget.C0025;
import androidx.emoji2.text.C0026;
import androidx.fragment.app.C0027;
import androidx.legacy.content.C0028;
import androidx.lifecycle.C0029;
import androidx.recyclerview.widget.C0032;
import androidx.recyclerview.widget.C0033;
import androidx.savedstate.C0034;
import androidx.savedstate.C0035;
import androidx.savedstate.C0036;
import androidx.versionedparcelable.C0038;
import androidx.versionedparcelable.C0039;
import androidx.versionedparcelable.C0040;
import androidx.versionedparcelable.C0041;
import androidx.versionedparcelable.C0042;
import androidx.viewpager2.adapter.C0043;
import com.github.megatronking.stringfog.C0047;
import com.github.megatronking.stringfog.C0048;
import com.github.megatronking.stringfog.annotation.C0044;
import com.github.megatronking.stringfog.xor.C0045;
import com.github.megatronking.stringfog.xor.C0046;
import com.google.android.material.appbar.C0049;
import com.google.android.material.bottomsheet.C0051;
import com.google.android.material.carousel.C0052;
import com.google.android.material.carousel.C0053;
import com.google.android.material.carousel.C0054;
import com.google.android.material.carousel.C0055;
import com.google.android.material.chip.C0056;
import com.google.android.material.chip.C0057;
import com.google.android.material.datepicker.C0058;
import com.google.android.material.datepicker.C0059;
import com.google.android.material.floatingactionbutton.C0060;
import com.google.android.material.internal.C0061;
import com.google.android.material.theme.C0062;
import com.google.android.material.theme.C0063;
import com.google.android.material.theme.C0064;
import com.ljx.wechatmod.auth.C0065;
import com.ljx.wechatmod.hook.C0066;
import com.ljx.wechatmod.ui.C0067;
import io.fastkv.C0068;
import java.util.ArrayList;
import java.util.Locale;
import kotlinx.coroutines.C0069;
import kotlinx.coroutines.C0070;

/* JADX INFO: loaded from: classes.dex */
public final class wc extends BaseAdapter {
    public final ArrayList a;
    public final Activity b;
    public final on c;

    public wc(ArrayList r4, Activity r5, on r6) {
        this.a = r4;
        this.b = r5;
        this.c = r6;
        Integer r0 = null;
        int r1 = C0019.m79("ۧۡۡ");
    L3:
        switch(r1) {
            case 1746908: goto L6;
            case 1748617: goto L10;
            case 1749669: goto L12;
            case 1750537: goto L11;
            case 1752520: goto L19;
            case 1754439: goto L17;
            default: goto L3;
        };
    L6:
        if ((C0001.f1 ^ (C0011.f11 * (-5840))) >= 0) goto L7;
        r1 = (C0043.f43 % C0041.f41) + 1754093;
        goto L3
    L7:
        C0065.m260();
        String r12 = "ۢۡۨ";
    L8:
        r1 = C0055.m220(r12);
        goto L3
    L10:
        System.out.println(r0);
        r1 = (C0070.f70 + C0066.f66) ^ 1751127;
    L11:
        r1 = (C0002.f2 ^ C0060.f60) ^ 1752202;
        goto L3
    L12:
        r0 = Integer.decode(C0041.m165("IQf2pvPcQP9MTyQgyvBza0xK1"));
        if ((C0003.f3 / (C0017.f17 | 3323)) == 0) goto L15;
    L14:
        r1 = C0038.m153("ۢۢۥ");
        goto L3
    L15:
        r12 = "ۡ۟ۧ";
        goto L8
    L17:
        if (C0044.m178() < 0) goto L11;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int r4) {
        int r2 = C0020.m80("۟ۥۡ");
        Object r1 = null;
    L3:
        switch(r2) {
            case 56382: goto L6;
            case 1746875: goto L14;
            case 1750629: goto L19;
            case 1750783: goto L9;
            default: goto L3;
        };
    L6:
        if ((C0027.f27 / (C0065.f65 * (-8454))) == 0) goto L13;
        C0042.m169();
        String r0 = "ۧۨۥ";
    L8:
        r2 = C0056.m226(r0);
        goto L3
    L13:
        r0 = "۟ۥۡ";
        goto L8
    L9:
        ip.n("get(...)", r1);
        if (C0006.f6 > 0) goto L12;
        C0043.m172();
        r2 = C0060.m241("۟ۥۡ");
        goto L3
    L12:
        r0 = "ۣۢۤ";
        goto L8
    L14:
        r1 = this.a.get(r4);
        if ((C0062.f62 ^ (C0022.f22 / 2871)) < 0) goto L17;
        C0033.m135();
    L17:
        r2 = C0057.m229("ۣۣۧ");
        goto L3
    L19:
        return r1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
        int r0 = C0034.m138("۠۟۠");
    L3:
        switch(r0) {
            case 1747649: goto L6;
            case 1754663: goto L7;
            default: goto L3;
        };
    L6:
        return r3;
    L7:
        r0 = (C0049.f49 ^ C0020.f20) + 1747852;
        goto L3
    }

    /* JADX WARN: Type update failed for variable: r12v1 ??, new type: android.widget.LinearLayout
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 18561. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:86)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:58)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    @Override // android.widget.Adapter
    public final View getView(int r33, View r34, ViewGroup r35) {
        boolean r29 = false;
        String r23 = null;
        LinearLayout r14 = null;
        LinearLayout r21 = null;
        int r5 = 0;
        Activity r19 = null;
        int r22 = 0;
        LinearLayout r12 = null;
        LinearLayout r13 = null;
        String r20 = null;
        String r28 = null;
        int r30 = 0;
        String r11 = null;
        String r10 = null;
        Typeface r7 = null;
        int r17 = 0;
        GradientDrawable r3 = null;
        TextView r27 = null;
        on r4 = null;
        TextView r15 = null;
        Typeface r16 = null;
        int r18 = 0;
        int r6 = 0;
        int r31 = C0069.m277("۟ۨ۟");
        uc r24 = null;
        TextView r25 = null;
        String r26 = null;
    L3:
        switch(r31) {
            case 56351: goto L5;
            case 56357: goto L157;
            case 56384: goto L108;
            case 56388: goto L45;
            case 56540: goto L92;
            case 1746689: goto L108;
            case 1746726: goto L28;
            case 1746752: goto L41;
            case 1746843: goto L153;
            case 1746944: goto L111;
            case 1746966: goto L137;
            case 1747651: goto L177;
            case 1747683: goto L67;
            case 1747714: goto L119;
            case 1747781: goto L115;
            case 1747872: goto L82;
            case 1748673: goto L73;
            case 1748676: goto L166;
            case 1748800: goto L70;
            case 1749635: goto L24;
            case 1749663: goto L112;
            case 1749765: goto L122;
            case 1749822: goto L85;
            case 1750689: goto L97;
            case 1750723: goto L146;
            case 1750813: goto L168;
            case 1751494: goto L156;
            case 1751526: goto L173;
            case 1751529: goto L130;
            case 1751589: goto L6;
            case 1751618: goto L78;
            case 1751679: goto L160;
            case 1751687: goto L141;
            case 1751713: goto L11;
            case 1751742: goto L89;
            case 1751773: goto L176;
            case 1752580: goto L101;
            case 1752639: goto L133;
            case 1752645: goto L67;
            case 1752646: goto L57;
            case 1753447: goto L48;
            case 1753454: goto L178;
            case 1753600: goto L126;
            case 1753671: goto L54;
            case 1754377: goto L36;
            case 1755496: goto L168;
            case 1755562: goto L62;
            default: goto L3;
        };
    L5:
        r27.setTypeface(null, 1);
        r27.setLayoutParams(new LinearLayout.LayoutParams(0, C0042.f42 ^ 839, 1.0f));
        r27.setMaxLines(1);
        r27.setEllipsize(TextUtils.TruncateAt.END);
        r31 = (C0035.f35 ^ C0061.f61) + 1751645;
        goto L3
    L6:
        if (r21 != null) goto L97;
        r12 = new LinearLayout(r19);
        r12.setOrientation(0);
        r12.setGravity(C0017.f17 ^ 715);
        if ((C0043.f43 % (C0046.f46 ^ (-950))) <= 0) goto L9;
        r31 = (C0001.f1 / C0062.f62) + 1754377;
        goto L3
    L9:
        r31 = C0070.m281("ۦ۠ۨ");
        goto L3
    L11:
        r27.setText(r23);
        r27.setTextSize(15.0f);
        r4 = this.c;
        r27.setTextColor(r4.e);
        if (C0029.m118() <= 0) goto L13;
        r31 = (C0009.f9 * C0011.f11) - 148261;
        goto L3
    L13:
        C0018.m75();
        GradientDrawable r2 = r3;
    L14:
        r3 = r2;
        r31 = C0004.m16("ۥۥ۟");
        goto L3
    L24:
        if ((C0045.f45 ^ (C0028.f28 * (-6067))) >= 0) goto L25;
        r31 = (C0071.f71 - C0066.f66) ^ (-55743);
        goto L3
    L25:
        C0039.f39 = 76;
    L26:
        r31 = C0049.m197("ۤۧۡ");
        goto L3
    L28:
        r25.setText(r10);
        if (r29 == false) goto L173;
        Typeface r210 = xn.a;
        if (r210 != null) goto L33;
        r7 = r210;
        goto L173
    L33:
        if ((C0049.f49 - (C0024.f24 / (-5200))) <= 0) goto L34;
        String r8 = "ۣ۠ۨ";
        r7 = r210;
        int r9 = r6;
    L20:
        r31 = C0018.m73(r8);
        r6 = r9;
        goto L3
    L34:
        C0071.f71 = 81;
        r7 = r210;
        r31 = C0016.m65("۟ۨ۟");
        goto L3
    L36:
        r12.setPadding(ff.q(r22), ff.q(r22), ff.q(r22), ff.q(r22));
        GradientDrawable r211 = new GradientDrawable();
        r211.setCornerRadius(ff.p(16.0f));
        r12.setBackground(r211);
        if (C0063.f63 <= 0) goto L38;
        String r82 = "ۦ۠ۡ";
    L40:
        r31 = C0044.m176(r82);
        goto L3
    L38:
        r31 = C0061.m246("۟۟ۡ");
        goto L3
    L41:
        r15.setTypeface(r16);
        if (C0022.m88() <= 0) goto L43;
        r31 = (C0045.f45 ^ C0035.f35) ^ (-1750430);
        goto L3
    L43:
        C0054.f54 = 14;
        r31 = C0057.m229("ۨۦۨ");
        goto L3
    L45:
        r25.setTextColor(C0051.f51 ^ 176);
        r25.setTextSize(16.0f);
        r25.setGravity(C0046.f46 ^ 365);
        int r212 = C0055.f55 ^ (-607);
    L46:
        r82 = "ۤۥ۠";
        r17 = r212;
        goto L40
    L48:
        if (C0059.f59 >= 0) goto L49;
        r13 = r12;
    L52:
        r31 = C0055.m220("ۤ۠ۥ");
        goto L3
    L49:
        C0018.f18 = 67;
        String r213 = r10;
        LinearLayout r83 = r12;
    L50:
        r10 = r213;
        r13 = r83;
        r31 = C0017.m70("۟۠ۧ");
        goto L3
    L54:
        if ((C0032.f32 | (C0023.f23 + 1562)) < 0) goto L56;
        C0062.m248();
        r10 = r11;
        r31 = C0049.m197("ۥۥۥ");
        goto L3
    L56:
        r213 = r11;
        r83 = r13;
        goto L50
    L57:
        String r84 = "?";
        if (C0034.f34 >= 0) goto L59;
        Activity r214 = r19;
        int r92 = r22;
    L61:
        r31 = C0068.m272("ۤ۟ۡ");
        r19 = r214;
        r20 = r84;
        r22 = r92;
        goto L3
    L59:
        C0025.f25 = 40;
        r20 = r84;
        r31 = C0029.m116("۠۟ۢ");
        goto L3
    L62:
        r15.setTextColor(r6);
        r13.addView(r25);
        r13.addView(r27);
        r13.addView(r15);
        if (C0063.f63 <= 0) goto L64;
        r31 = (C0045.f45 / C0040.f40) + 1748676;
        goto L3
    L64:
        C0059.m236();
        LinearLayout r215 = r14;
    L65:
        r14 = r215;
        r31 = C0026.m105("ۣۢۧ");
        goto L3
    L67:
        String r85 = "ۢۥۨ";
    L68:
        r31 = C0052.m209(r85);
        goto L3
    L70:
        if (C0009.m36() >= 0) goto L71;
        r31 = (C0038.f38 + C0017.f17) ^ 1752873;
        goto L3
    L71:
        r31 = C0048.m193("ۦۥ۟");
        goto L3
    L73:
        r25.setTypeface(null, 1);
        if ((C0021.f21 | (C0007.f7 / (-2263))) >= 0) goto L75;
        r31 = (C0070.f70 ^ C0020.f20) ^ (-57015);
        goto L3
    L75:
        C0025.m103();
        r31 = C0047.m189("ۣۤۡ");
    L78:
        if ((C0001.f1 + (C0073.f73 - 3938)) >= 0) goto L79;
        r31 = (C0034.f34 * C0017.f17) + 2422901;
        goto L3
    L79:
        C0036.m147();
        String r93 = "ۣ۠ۤ";
        TextView r216 = r15;
        Typeface r86 = r16;
    L80:
        r15 = r216;
        r16 = r86;
        r31 = C0054.m219(r93);
        goto L3
    L82:
        r216 = r15;
        r86 = r16;
    L83:
        r93 = "ۣۥۥ";
        goto L80
    L85:
        if ((C0019.f19 ^ (C0040.f40 * (-9696))) >= 0) goto L86;
        r31 = C0002.m8("ۢۥۨ");
        r21 = r14;
        goto L3
    L86:
        C0041.f41 = 93;
        r31 = C0015.m60("۠ۦۦ");
        r21 = r14;
        goto L3
    L89:
        if (C0042.f42 >= 0) goto L90;
        r31 = (C0068.f68 % C0043.f43) + 1755625;
        goto L3
    L90:
        C0068.m273();
        goto L52
    L92:
        r28 = r26.toUpperCase(Locale.ROOT);
        ip.n("toUpperCase(...)", r28);
        if (C0071.m284() >= 0) goto L94;
        r31 = (C0055.f55 % C0070.f70) ^ (-1749735);
        goto L3
    L94:
        C0028.m112();
        r31 = C0067.m271("ۤۥۨ");
    L97:
        if ((C0003.f3 - (C0065.f65 % 67)) <= 0) goto L98;
        r31 = (C0014.f14 | C0018.f18) + 1752092;
        goto L3
    L98:
        String r217 = "ۢۢۢ";
    L99:
        r31 = C0003.m13(r217);
        goto L3
    L101:
        r216 = new TextView(r19);
        r216.setText("\ueb7b");
        r86 = xn.a;
        if (r86 == null) goto L83;
        if (C0069.f69 >= 0) goto L105;
        r15 = r216;
        r16 = r86;
        r31 = (C0058.f58 ^ C0073.f73) + 1745895;
        goto L3
    L105:
        C0016.f16 = 47;
        r15 = r216;
        r16 = r86;
        r31 = C0048.m193("ۡۥۤ");
        goto L3
    L108:
        if ((C0012.f12 / (C0036.f36 % 5928)) == 0) goto L110;
        C0060.m240();
        r31 = C0019.m79("ۥۨ");
        goto L3
    L110:
        r217 = "ۦۥ۟";
        goto L99
    L111:
        r31 = C0073.m292("۟ۨ۟");
        goto L3
    L112:
        r215 = null;
        if ((C0061.f61 | (C0008.f8 % 2030)) < 0) goto L65;
        C0067.m269();
        r14 = null;
        r31 = C0034.m138("ۢۦ");
        goto L3
    L115:
        r25.setTypeface(r7);
        if ((C0029.f29 % (C0061.f61 * 9444)) < 0) goto L26;
        C0042.f42 = 11;
        r31 = C0004.m16("ۦۧۨ");
        goto L3
    L119:
        if (C0005.f5 <= 0) goto L120;
        r31 = (C0051.f51 | C0062.f62) ^ (-1755419);
        r6 = r18;
        goto L3
    L120:
        C0072.f72 = 42;
        r212 = r17;
        r6 = r18;
        goto L46
    L122:
        r5 = 0;
        r214 = this.b;
        r92 = C0072.f72 ^ (-627);
        if ((C0027.f27 ^ (C0032.f32 + 4783)) >= 0) goto L124;
        r19 = r214;
        r13 = r21;
        r22 = r92;
        r31 = (C0044.f44 ^ C0027.f27) + 1751807;
        goto L3
    L124:
        C0034.f34 = 24;
        r84 = r20;
        r13 = r21;
        goto L61
    L126:
        int[] r218 = xc.a;
        int r87 = r218[Math.abs(r24.a.hashCode()) % r218.length];
        TextView r219 = new TextView(r19);
        if ((C0033.f33 % (C0067.f67 - 4998)) <= 0) goto L128;
        r25 = r219;
        r10 = r28;
        r30 = r87;
        r31 = (C0051.f51 % C0046.f46) + 1751864;
        goto L3
    L128:
        C0061.f61 = 27;
        r25 = r219;
        r10 = r28;
        r30 = r87;
        r31 = C0040.m160("ۣۨۢ");
        goto L3
    L130:
        r13.removeAllViews();
        if (r23.length() <= 0) goto L153;
        String r220 = r23.substring(0, 1);
        ip.n("substring(...)", r220);
        r26 = r220;
        r31 = (C0019.f19 * C0070.f70) ^ 25519;
        goto L3
    L133:
        r3.setColor(r30);
        r3.setShape(1);
        r25.setBackground(r3);
        TextView r221 = new TextView(r19);
        if (C0067.m269() <= 0) goto L135;
        r27 = r221;
        r31 = C0015.m60("ۤۦۣ");
        goto L3
    L135:
        C0016.m66();
        r27 = r221;
        r31 = C0057.m229("ۣۤۢ");
        goto L3
    L137:
        Object r222 = this.a.get(r33);
        ip.n("get(...)", r222);
        uc r223 = (uc) r222;
        boolean r88 = r223.c;
        if (C0034.f34 >= 0) goto L139;
        r24 = r223;
        r29 = r88;
        r31 = (C0000.f0 | C0004.f4) + 56487;
        goto L3
    L139:
        r24 = r223;
        r29 = r88;
        r31 = C0000.m2("ۢۡۢ");
        goto L3
    L141:
        if (r29 == false) goto L78;
        r11 = "\uf0f3";
        if ((C0014.f14 | (C0056.f56 / 593)) >= 0) goto L144;
        r31 = (C0003.f3 + C0042.f42) + 1753671;
        goto L3
    L144:
        C0046.f46 = 3;
        r31 = C0038.m153("ۤۨۡ");
        goto L3
    L146:
        r15.setTextSize(22.0f);
        if (r24.d == false) goto L16;
        r18 = r4.g;
        if (C0044.f44 <= 0) goto L150;
        r31 = (C0017.f17 % C0056.f56) ^ 1747893;
        r6 = r5;
        goto L3
    L150:
        C0053.m214();
        r31 = C0064.m258("ۥۥۦ");
        r6 = r5;
        goto L3
    L16:
        int r224 = r5;
    L18:
        if ((C0052.f52 ^ (C0039.f39 / 1675)) <= 0) goto L19;
        Object r89 = "ۨۦۨ";
        int r94 = r224;
    L22:
        r31 = C0020.m80(r89);
        r6 = r94;
        goto L3
    L19:
        C0048.f48 = 92;
        r8 = "۠۟ۥ";
        r9 = r224;
    L153:
        if ((C0023.f23 + (C0026.f26 - 7199)) >= 0) goto L154;
        r31 = (C0005.f5 ^ C0053.f53) + 1752563;
        goto L3
    L154:
        C0005.f5 = 43;
        r31 = C0015.m60("ۢۡۥ");
        goto L3
    L156:
        r28 = r20;
        r31 = C0043.m173("ۦۥ۟");
        goto L3
    L157:
        String r810 = r24.b;
        if ((r34 instanceof LinearLayout) == false) goto L161;
        r23 = r810;
        r31 = (C0019.f19 * C0016.f16) + 1703323;
        r21 = (LinearLayout) r34;
        goto L3
    L161:
        String r225 = r810;
    L163:
        if ((C0045.f45 + (C0054.f54 * (-1885))) >= 0) goto L164;
        r23 = r225;
        r31 = (C0041.f41 + C0039.f39) + 1749721;
        goto L3
    L164:
        r85 = "ۣۢۤ";
        r23 = r225;
        goto L68
    L160:
        LinearLayout.LayoutParams r226 = new LinearLayout.LayoutParams(ff.q(r17), ff.q(r17));
        r226.rightMargin = ff.q(r22);
        r25.setLayoutParams(r226);
        r2 = new GradientDrawable();
        goto L14
    L166:
        r13.setOnClickListener(new y5(r24, C0024.f24 ^ 1, this));
        r31 = C0073.m292("ۤۨۡ");
        goto L3
    L168:
        if (C0028.f28 < 0) goto L170;
        C0007.f7 = 68;
        r31 = C0025.m102("ۡۥ۟");
        goto L3
    L170:
        r93 = "ۢۦ";
        r216 = r15;
        r86 = r16;
    L173:
        if ((C0020.f20 | (C0036.f36 / 7018)) >= 0) goto L174;
        r31 = (C0038.f38 * C0069.f69) + 1735828;
        goto L3
    L174:
        C0015.m61();
        r89 = "ۢ۠ۡ";
        r94 = r6;
        goto L22
    L176:
        return r13;
    L177:
        r224 = r6;
        goto L18
    L178:
        r225 = r23;
        goto L163
    }
}

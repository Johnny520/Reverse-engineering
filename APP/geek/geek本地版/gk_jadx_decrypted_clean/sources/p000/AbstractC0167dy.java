package p000;

import android.app.C0986;
import android.app.C0987;
import android.support.v4.graphics.drawable.C0990;
import android.support.v4.graphics.drawable.C0992;
import android.view.C0993;
import androidx.activity.result.C0994;
import androidx.activity.result.C0995;
import androidx.appcompat.widget.C0999;
import androidx.appcompat.widget.C1001;
import androidx.coordinatorlayout.widget.C1008;
import androidx.core.widget.C1011;
import androidx.legacy.content.C1014;
import androidx.profileinstaller.C1016;
import androidx.savedstate.C1021;
import androidx.versionedparcelable.C1027;
import com.github.megatronking.stringfog.C1033;
import com.github.megatronking.stringfog.C1034;
import com.github.megatronking.stringfog.xor.C1031;
import com.github.megatronking.stringfog.xor.C1032;
import com.google.android.material.chip.C1043;
import com.google.android.material.internal.C1047;
import com.google.android.material.theme.C1049;
import com.google.android.material.theme.C1050;
import com.ljx.wechatmod.auth.C1051;
import com.ljx.wechatmod.hook.C1052;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C1055;
import kotlinx.coroutines.C1056;

/* JADX INFO: renamed from: dy */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0167dy {

    /* JADX INFO: renamed from: a */
    public static final Map f1649a;

    /* JADX INFO: renamed from: b */
    public static final Set f1650b;

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f1651c;

    /* JADX INFO: renamed from: d */
    public static int f1652d;

    /* JADX INFO: renamed from: e */
    public static int f1653e;

    /* JADX INFO: renamed from: f */
    public static float f1654f;

    /* JADX INFO: renamed from: g */
    public static final i00 f1655g;

    /* JADX INFO: renamed from: h */
    public static final C0048ay f1656h;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0007. Please report as an issue. */
    static {
        String str;
        String str2;
        int iM3091 = C1047.m3091("ۣۡ۟");
        while (true) {
            switch (iM3091) {
                case 56359:
                    if (C1055.m3121() >= 0) {
                        C1043.m3075();
                        iM3091 = C1031.m3027("ۧ۟");
                    } else {
                        iM3091 = (C1001.f5645 | C1027.f5671) + 1749290;
                    }
                    break;
                case 56449:
                    f1654f = -1.0f;
                    if (C0990.f5634 < 0) {
                        iM3091 = (C1055.f5699 | C0995.f5639) + 1749862;
                    } else {
                        str2 = "ۡۨ";
                        iM3091 = C1033.m3034(str2);
                    }
                    break;
                case 56571:
                    f1653e = -1;
                    str = "ۤۥ";
                    iM3091 = C0987.m2851(str);
                    break;
                case 1747774:
                    f1656h = new C0048ay(0);
                    if (C0999.f5643 < 0) {
                        iM3091 = (C1021.f5665 | C0994.f5638) + 1753002;
                    } else {
                        C1050.f5694 = 85;
                        iM3091 = C0993.m2874("ۣ۠ۡ");
                    }
                    break;
                case 1748733:
                    f1649a = Collections.synchronizedMap(new WeakHashMap());
                    if (C1034.m3039() > 0) {
                        iM3091 = C1014.m2960("ۣۧ۠");
                    } else {
                        C0990.m2864();
                        str = "ۣۡ۟";
                        iM3091 = C0987.m2851(str);
                    }
                    break;
                case 1749827:
                    f1655g = new i00("[\u00a5\uffe5]\\s*[0-9,]+(\\.[0-9]+)?");
                    if (C0992.m2870() > 0) {
                        iM3091 = C0993.m2874("ۣ۠ۡ");
                    } else {
                        C1033.m3036();
                        iM3091 = C1008.m2936("ۥۤۦ");
                    }
                    break;
                case 1750602:
                    f1652d = -1;
                    if (C1016.f5660 * (C1052.f5696 | (-387)) < 0) {
                        str = "ۣۨ";
                        iM3091 = C0987.m2851(str);
                    } else {
                        C0986.m2846();
                        iM3091 = C1032.m3031("ۤۥ");
                    }
                    break;
                case 1750780:
                    f1650b = Collections.newSetFromMap(new ConcurrentHashMap());
                    if (C0994.m2879() > 0) {
                        iM3091 = C1049.m3099("ۤۧۧ");
                    } else {
                        C0994.f5638 = 54;
                        iM3091 = C1051.m3108("ۢۧۨ");
                    }
                    break;
                case 1751748:
                    f1651c = new ConcurrentHashMap();
                    if (C1011.f5655 % (C1056.f5700 - 9687) < 0) {
                        str2 = "ۣۡۨ";
                        iM3091 = C1033.m3034(str2);
                    } else {
                        iM3091 = C1049.m3099("ۤۧۧ");
                    }
                    break;
                case 1752615:
                    break;
            }
            return;
        }
    }
}

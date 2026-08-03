package p001;

import android.graphics.Rect;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: renamed from: ۟.lc */
/* JADX INFO: loaded from: classes.dex */
public final class C0301lc implements OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: ۥ */
    public final Rect f949 = new Rect();

    /* JADX INFO: renamed from: ۥ۟ */
    public final C0287kc f950;

    public C0301lc(C0287kc c0287kc) {
        this.f950 = c0287kc;
    }

    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        String str = "ۡۨۜۘۗۛۜ۬ۤۧ۟ۛۦۘۛۖ۬ۛۨۛۢ۠ۨۦۚۡۛۘ۟ۗۡۛۙۡۜۙۦۢ۬ۗۗۗۨۥۡۧۛۙۘۗۚۦ۬۠۠ۧۤۛۦۘۚۘۘۜۧۦۘ۬ۡۢۦۘۧۡۚۜۘ۠ۨ۟ۦۘۥۘۨۦ۟";
        int i = 0;
        WindowInsetsCompat windowInsetsCompatDispatchApplyWindowInsets = null;
        int i2 = 0;
        int childCount = 0;
        Rect rect = null;
        WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets = null;
        while (true) {
            switch ((((((((str.hashCode() ^ 558) ^ 241) ^ 210) ^ 675) ^ 662) ^ 996) ^ 13) ^ (-762813916)) {
                case -1459272643:
                    str = "ۘۘۤۗۙۡۘ۟ۨۙۖۦۡ۠ۛۦۗ۫ۘ۬ۚۢۢۡ۬ۛۧۦۘ۬ۘۘۤۥۘۘۘ۬ۤۜۙۘۘۙۖۚۢۧۜ۠ۥۥ۬ۢۖۘۨ۟۬۠ۨۦۚۨۢۡۜۖۘۙ۬ۜۘۙ۫ۧۧۙۦۘ";
                    i2 = i;
                    break;
                case -1277773255:
                    str = "ۧۙۘۦ۟ۤۙۛ۬۟ۜۥۘۨۥۢۛ۫ۜۘۛۖۥۘۜۦۖۘۘۨۦۘۥۜۜۘۗۘۜۘۛ۠ۧۜۜۗۚ۬ۘۘۧۛۥۘۚۥ۟ۨۘۧۘۛۖۘۘۡۢۦۘ۟۟ۤۥۚۧۚۤۛۦۨۚ۟ۨۨ۫ۙۦۧۨۦۨ۟ۘ";
                    windowInsetsCompatOnApplyWindowInsets = ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
                    break;
                case -1250124094:
                    rect.bottom = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetBottom();
                    str = "ۡ۟ۤ۬ۖۙۛۚۚۤۦ۠ۢۙۦۘۨ۬ۙۧ۫ۨۗۢۚۦۖۦۘۘۘۖۥۨۜۢۚۤۤۧ۫۫ۥۘۨۤۗۜۢ۟ۨۗۘۙۘ۟ۚۛۥۘۙۜ۫ۘ۟ۙۙ۬ۥ۫ۥۚۧۨۘۤۡۚۘۘۧۤۖۦۘ";
                    break;
                case -1089666842:
                    rect.left = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetLeft();
                    str = "ۛۦۘۘۧ۠ۢۚۤۡۘۗۨۚۢۦۧۘۤۤ۠ۛۧۡ۠ۚ۟ۙۧۨۜۙۛۙۦ۠ۤۨۗۖۛۥ۫ۙۗۡۚ۬ۧۡۧۢۧۥۘۛۨۚۗۛۡ۬۠۟ۤۦۘ";
                    break;
                case -674838521:
                    str = "ۤۥۦۚ۬ۛۙۘۖ۬ۜۥۘ۟ۛۡۨۢۤۡ۬ۛۡۜۨۧۙۜۘۜۢۜۘۡۧۡۨۢۙۚۢۨۜۥۦۘ۫ۖۡ";
                    break;
                case -459442472:
                    str = "ۦۘۜ۠ۘۨۘۘۗ۫ۨۙۘۨۦۦۘۨ۬ۙۖۨۘۘۘۢۥۖ۠ۗۖۚۜۡۨۧۚۤۛۗۦۡۘۡۙۥۘ۠ۖ۬ۛۦ۫ۖۗۦۗ۬ۡۥۙۤ۠ۙ۠ۙ۫ۚ";
                    break;
                case -378547480:
                    return windowInsetsCompatOnApplyWindowInsets.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
                case -260415117:
                    str = "ۢۗۘۘ۟۟ۡۘۜۤۘۨۤۜۛۤۖۘۥۡۜۘ۬ۥۧ۬۟ۜۜ۟ۥۘۢۙۡ۟ۖۦۘۨۙۚ۫ۦۖۥ۫ۤۥۦۘۘۧۜۧ۬ۖۧۡۘ۠ۤۜ۠ۚۖ۫ۖۦۘ";
                    break;
                case -205039633:
                    rect.bottom = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetBottom(), rect.bottom);
                    str = "۬ۙۨۘۛۚۜ۠ۧۖۤۘۘۙۡ۫ۙۚۚۖۧ۬ۖۨۥۦۤۙۗۗۖۥۙۦ۠۫ۦۗۦۨۙۘۦۚ۟ۡۨ۠ۘۢۥۘۦۦۘۘۤۚۦۘۖۗ۟ۤۦۤۙۘ۠ۗۚۙۤۡ";
                    break;
                case -159385786:
                    str = "ۡ۬ۙۢۙۦ۬ۖۗۗۛۡۘۡۘۖۜۦۧۘۘۚۖۜۡۘۘ۠ۦ۫ۢۨۜۡ۬ۧ۠ۜۖۘۨۖۘۖۛۜۙۗ۫ۧۛۨۘۡۧۘۤۘۘ۫ۢۜۜۛۖۘ";
                    rect = this.f949;
                    break;
                case -155766489:
                    str = "ۡۗۡۘۛۨۦۘۤۘۚ۬۬۟ۜۜۨۢۢ۟ۛۛۨۨۖۜ۠ۖ۟ۥۤۘۘۙۖ۠۟ۡ۬ۤ۠ۛۜۙۥۘۘۥۥ۟ۥۚۙۖۖۘۘۥۖ";
                    break;
                case -80537498:
                    rect.top = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetTop(), rect.top);
                    str = "ۛۘۜۥۦۦۜۘۡۘۘۛۜۦۧ۬۫ۘۛ۟ۖۘۚۥ۠۟ۗۥۢۙۚۧۡۘۘ۬ۚۗ۫ۖ۫ۗۨۥۡۛ۬ۜۧۜۘۨۧۢۖۖۤۗۥۥۘۛۖۖۘۥ۬ۥۘ۫۟ۧۖۧۜۥۦ۫۫ۜۛۙۛۧۤۧۨۘ";
                    break;
                case 282571842:
                    String str2 = "ۘۡۨۘۤۡۗۛۦ۬ۧۙ۟ۖ۠ۗۤ۟ۖۘۜ۫ۥۘۡۙۢۤۙۜۤۖۖۧۙۙۙۛۖۖۢۖۘۗۘۡۘۖۢۥۘۢۢۧ۟۫ۨۥ۫ۜۘ";
                    while (true) {
                        switch (str2.hashCode() ^ (-699864664)) {
                            case -1942234328:
                                str = "۠ۙۚ۠ۦۛۦۥۦ۫ۨۥۘۦۗۘۜ۫ۛۘ۫ۚ۫ۥۘۧۛۘۘ۫ۡۤۙۜ۫ۨ۬ۜۘۨۚۨۘۦۤ۠۟ۧ۟ۛۨ۠ۥۗ۬ۜۡۘ۠ۙ۟ۘۗۜۘۤۖۖۘ";
                                continue;
                            case -561020487:
                                String str3 = "ۖۥ۬ۖ۫ۡۘۧۙۘۘۜ۠ۗۖ۬ۘۘۖ۠ۛۧۗۡ۠ۨۘۢۛۤۥۚۜۡۨ۫ۨۘۥۤۢ۟۬۠ۨۗۜۘ۠ۗۘۘ۠ۗۘۤ۫ۥۘۚۘۘۘ۫ۨۨ۬۠ۧ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1499710664) {
                                        case -1160056238:
                                            str3 = "ۧۨۨ۠ۛۖۤ۬ۗۦ۟ۘۧ۬ۗۦ۟ۚۧ۟ۨ۫۫ۘۘۗۖۘۗ۫ۨۛ۟ۤۦۖۖۘۗۧۤۘۖ۟ۨۚۧ";
                                            break;
                                        case 297713542:
                                            str2 = "ۧۤۨۤۗۙۙ۟ۗۜ۫ۗۙۡۜۘۖۗۛۛۢۤۛۙ۠ۗۚۘۘۡۥۡۘۤۛۖۘۤ۠ۢۛۤۚۖۖۨ۟ۗۥۘۗۜۘۗۘۧۘ۟ۙ۬ۥۢۨۡۛۨۜ۬ۦۖ۟ۡۤۨۛۘۖۗۢ۠۟ۨۢۥ۫ۧ";
                                            break;
                                        case 308370897:
                                            String str4 = "ۡ۠ۛۙۗۘ۫۫ۦ۠۬ۖۘۛۦۜۘۖۤ۟ۧۨۗۡ۟ۥۘۧۧۡۘ۬ۜۨۚۚ۫ۦۢ۟ۥۚۤۗۥۢۜ۠ۗۚۚ۟ۡۤۜۘۢ۫ۘۘ";
                                            while (true) {
                                                switch (str4.hashCode() ^ (-2056770327)) {
                                                    case -261981222:
                                                        str4 = "ۧۨۡۤۨۜۧۗۡۘۡۥ۟ۛۚ۠ۙۦۘۡۜۦۘۛۜۨۨۗۡۗۜۧۘ۟۟ۖۤۚۛۘۦۧۘ۬ۥ۟ۦۨۡۘۡۘۨۘ۫ۖۙۙۧۤ۠ۘۘۜۥۦۡۤۧ";
                                                        break;
                                                    case 697048843:
                                                        str3 = "ۥۡۦۘۗ۬ۘ۟ۤۥۘۢۥۨۨۜۜۙ۬۬۬۬ۢۙۙۥۘۗۥۦۙۨۘۙ۟ۙۥۧۧۘۗۚۙۨۜۖۜ";
                                                        break;
                                                    case 1405346102:
                                                        str4 = windowInsetsCompatOnApplyWindowInsets.isConsumed() ? "۟۫۫ۧۨۥۘ۫ۖۦۘۗۢۗۡۧۧۥ۟ۨۤۡۜۘۧۘ۟ۦۦۘۘۖۡۡ۫ۙۘۤ۫ۥۜۙۙۡۥۤۦۗۘۘ" : "ۡۜۧۘۙ۫۬ۙۨۘۦۘۘۧۨ۠۬۟ۘۘ۟۫۫۫۬ۘۖۖۦۘۥ۟ۗ۟ۡۥۤۨۘۧۥۘۘۙ۬ۥۘۧۙ۟ۖۦۘۘ۠ۨۘ۠ۧۘۘۛۛۡۛۧۦۙۧۜۘۘۧۦۗۛۧۜۦۖ";
                                                        break;
                                                    case 1984394098:
                                                        str3 = "ۢ۟ۖۘۛۤۖۘۙۧۥ۬۟ۦۖ۫ۧۛۦۥۧ۫ۘۖۢ۟ۥۢۡۘۛۜۜۘۦۡۡۢۤۤۡۥۛۦۜۨۛۛۥۛۡۗۨۘۖۘ۬ۡۦۘ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case 1077570255:
                                            str2 = "ۡۚ۟ۢ۫ۥۘۥۜۡۘۗ۠ۤۧ۟ۥۘ۫ۤۙۨۨۘ۠ۚۡۢ۫ۙۨۡۨۘۜۜ۫ۗۧۚۗۤۡۤۙۨۘۤۨۢۤۘۛۧۖۤۗۙۗۗۚۡۥۡۦۘۢۗۥۤ۟ۛۘۥۧۛۘۦۘ";
                                            break;
                                    }
                                }
                                break;
                            case -388156022:
                                str2 = "ۢۗۡ۠ۘۨۥۖۖۗۥ۟ۗۗۢ۫ۧۜۤۘۘۘۥۗۡۘۚ۫۠ۜۥۘ۫۟ۘ۠ۙۥۢۛ۟۬ۡۜۘۛۖۛۦۤۙۨ۫ۗۜۦ۫۬ۘۘۘۘ۫۟ۡۚ۫ۜۡ۬ۗ۠ۢ۫۟ۤ";
                                break;
                            case 220276056:
                                str = "۠ۗۨ۟۠ۘۘۧ۬۟ۦۘۧ۬ۢۤۦۚۨۘۥۢۙۦۜۡ۟ۗۦۘۥ۬ۨۘۘۡۨۛ۠ۖۧۥ۠ۢۢۙ۬ۛ۠ۚۜۦۢۧۡۘۥۙۢۚ۟ۜۘۚۘۜۘۜۧۥۘۗ۟ۦۘۢۖۚۥ";
                                continue;
                        }
                    }
                    break;
                case 482240030:
                    rect.top = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetTop();
                    str = "ۜۧۗۗۧ۫ۨۗۙۡ۠ۦۘ۫۬۠۟ۨۤۘۥۜۥۛۜۘۦ۫۫۟ۨۥۘۢ۫ۛۡۢۡۗ۫ۦۘۛۛۜۘۢ۟ۛ";
                    break;
                case 699774588:
                    str = "ۤۥۦۚ۬ۛۙۘۖ۬ۜۥۘ۟ۛۡۨۢۤۡ۬ۛۡۜۨۧۙۜۘۜۢۜۘۡۧۡۨۢۙۚۢۨۜۥۦۘ۫ۖۡ";
                    i2 = 0;
                    break;
                case 1051310255:
                    i = i2 + 1;
                    str = "ۜۜ۫۟ۚۨۘۢۧۛۘ۫ۖۘ۠ۥۦۤ۠ۡۧۧ۬ۥۥۘۜ۠۠۟ۢۚ۬ۗۜۤۚۖ۟ۨۨۘۤۛۗۥۙۜۘ";
                    break;
                case 1193085872:
                    rect.right = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetRight();
                    str = "ۙۡۚۥۢۦۘ۠ۛۥۢۖۜۛۡ۠ۜۘۢۖۧۚ۟ۢۙ۫ۡۚۢۧۨۛ۠ۨۙۦۤۢۨۘۜ۠۟ۢۙۡۘ۫ۖ۬ۖۤۘۘ۟ۜۡ";
                    break;
                case 1376074743:
                    str = "ۧۜۥۚۨۘۥۛۙۨ۠ۚ۟ۤۘۘۢۗۦۥۤۦ۟ۦۥۛۚۧۥۚۘۘۥۡ۫ۘۥۡۥ۠ۢۘۖۘ۬ۘۥۗ۠۫ۤۥ۬ۖۡۡۘۥۜۦۤۧۤۙۜۤ۟ۥ۫ۜۧۧۚ۫ۧۡۡۨۘۧۨۤۚۜۘ";
                    break;
                case 1461821329:
                    rect.right = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetRight(), rect.right);
                    str = "ۨۗۜۘ۠ۥۥۘۡۨۦۘۜ۠۟ۜۙۖۘۛ۬۟۫۟ۛۧۘ۬۠۠ۥۘۙۢۗۚۚۡۘ۠ۡۧ۠ۖۨۖ۫۫ۢۨۦۘۗ۟ۦۗۙۡۘۚۘۧۘۜۡۗۖۡ۟ۛۢ۠ۢۖۘ۬۠ۜۡۤۦۖۤۖۖۗۘۘۚۨۗ";
                    break;
                case 1479506584:
                    return windowInsetsCompatOnApplyWindowInsets;
                case 1571646482:
                    String str5 = "ۙۨۡ۬ۙۜۘۨ۠ۡۘۧۡۤ۟ۗۢۘۨۜۘۨۡۦۡۖۘ۠۠ۘ۫ۜۘۨۗۦ۫ۥۚۡۘۧۜۗۡۘۘ۟ۨۘ۬۠۟۫ۨۡۘ۫ۨۗۧۙ۠۫ۧۗۚۤ";
                    while (true) {
                        switch (str5.hashCode() ^ (-1204790930)) {
                            case -30876767:
                                str = "ۧۥۥ۬ۦۚ۫۫ۥۧۛۥۘۛۛۨۘ۠ۤۙۢۗۥۘۘۙۘۘ۫۫ۢۛۥۖۛۘۘۤۙۨۦۙۜۘۗۦۙۖ۬ۚۤۢۖۘۖۘۧۘۙۚۦۥۦۚۖ۬ۢ۫ۧۘ";
                                continue;
                            case 877441673:
                                String str6 = "ۢ۠۠ۦۖۙۘۙۜۘۛۙ۬ۨۜۖۘۘ۟۠۬۟ۜۘ۫۬ۚۛۙۤ۬ۨۦۘۧۜۙۨۛۘۘۖۛ۠ۚۘ۬ۜۖۥ۠۬۠ۜۧۦ۬ۜۤۦۨۥۘۤۥۦۤۧۙۙۘۦۘۗۥ۠۠ۦ۬";
                                while (true) {
                                    switch (str6.hashCode() ^ 1299308411) {
                                        case -1880859505:
                                            String str7 = "۫ۚۨۦ۫۫۫ۛۖ۫ۨۚۦۤۚ۫ۛۗ۫۫ۛۤۥۗۤۚۘۥۦۘ۟ۡۛۥۡۗۗ۬ۙۡۛۦۘۤۙۖۚۖۧۘۖۧۙۧۛ۬ۤۗۖۙۛۗۧۖۜۨۙۦۤۥۘۦۚۡ";
                                            while (true) {
                                                switch (str7.hashCode() ^ 346127382) {
                                                    case -2000474004:
                                                        str6 = "۟ۘۥۧۛۖۘۛ۫ۛۘ۫۠ۜۧۙۦۨۘۘۛۢ۠ۛۘ۫ۗۢ۠ۥۥۚۦۗ۠ۖۥ۬۟ۘۘۧۖۤ۫ۙۖۘۚۦ۬ۢ۫ۖۢۜۥۜ۬ۘۦ۫ۖۘۡۛۡۘ۠۫۠ۢۖۘۥۘ۫";
                                                        break;
                                                    case -1962309019:
                                                        str6 = "ۘ۬ۖۘۛ۠ۡ۫ۙۡۘۖۚۦۘۧ۠ۙۧۗۛ۠ۥ۠ۡۘ۟ۤ۟ۥۚۢۘ۫ۗۜۘ۫۫ۖۘۦۦۢۤۜۨۘۨ۬ۦۘ";
                                                        break;
                                                    case -825816727:
                                                        str7 = i2 < childCount ? "ۛۦۢۨۖۡۘۤۚۛۗۥۚۤۦۦۤۛۥۘ۬ۢۢ۟ۥ۬ۛۙۖۨۢۙۡۢۡۙۛۨۤ۟ۨۘۜ۠ۧ۬ۗۨۘۤۛ۠ۥۙ۠ۘۥۖ۬ۜۥۘۨۨۘۘۤۜۚ" : "ۡۥۧۘۙۢۖۚ۟ۚۢۥۚ۫۟ۤۤۥۘۗۛ۬ۖۗۧ۟۟ۗۦ۫۫ۜۗۗ۟۬ۥۙۖۘۨۙۥۜۗۢۡۘ۬ۗۥۧۘۧۘۛ";
                                                        break;
                                                    case 465661004:
                                                        str7 = "ۗۖۡۘۙۦ۟۠ۥۡۘۘۢۨۗۥۘۛۥۚۛۗۦۚ۟ۘۢ۟۟ۛۥ۠ۧۦۖ۫ۖۧ۬ۛۤ۫ۨۘۧۜ۠ۦۛۘۜۢۥۘۙۧ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case -1574158740:
                                            str6 = "ۤۡۜۘ۠ۛۚۛۖۤۦ۬ۛۡۛۨۦۙ۠ۛۚۧۘۢۨۘۧۦۨۤۧۨۡۨۘ۬ۘ۟ۘۙۖۨۡ۫ۧۘۤۢۤۖۘۜۚۖۧۚ۫ۗۜۡۧۧۚۛۡۖۚۙۗ۠ۧۢ۟ۧۡۘۙ۟۟ۛ۠۬ۜۢۦۘ";
                                            break;
                                        case -1378332972:
                                            str5 = "ۦۡۢۧۙۦۖ۠ۤۢ۠ۤ۟ۡۘۖۗۡۡ۫۟ۖۨۡۧۡ۟ۢۙۛۥۥ۫ۢۦ۬ۨ۫ۨۦۧۚۨۘۨۡۦۘۘۨ۬ۖۤۦ";
                                            break;
                                        case -624614506:
                                            str5 = "ۘۨۡۘۡۙۥۜۙ۟ۡۛۛۤ۫ۖۘ۟ۖۦۨۚۜۘۜۢۦۘۘۥۡۛۛۢۘۗۘۤ۠ۖۙ۫ۨۤۖۘۜ۬ۥ";
                                            break;
                                    }
                                }
                                break;
                            case 895328236:
                                str = "ۧۚ۟ۘۜۦ۠ۖۢۛۘۗ۬ۤ۬ۡۥۧۘۙ۬۬ۤۡۘۨۘۖۘۨۧۚۖۙ۫۟ۥۤۧۜۨۜۥۡۘۡۧۢۘ۟ۜۘ۠۟ۗ۟ۖۘ";
                                continue;
                            case 1569042154:
                                str5 = "ۦۡۥ۫ۤۨۘ۫ۦۙۛۢۨۘ۫ۜۢ۠ۚۖ۬ۢۚ۫ۤۜۜ۬۠ۘ۬۠ۖۚۥۢۘۘ۠۠ۦۢۙۘۙ۫ۥۘ۟ۛۦۙۚۧۘ۫ۖ۠ۨۘۖ۬۫ۧ۟ۘۛ۠ۤ۟ۢۜۘۥۦ";
                                break;
                        }
                    }
                    break;
                case 1599840806:
                    rect.left = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetLeft(), rect.left);
                    str = "۫ۗۤ۠۬ۜۘ۟ۧۢۗۡۗۦۙۘۘۙ۠ۡۘۖۤۙ۠ۡۥۜۗۢۦۦۨۘۨۨ۠ۨۛۗۢۧۜۛۖۧۖ۫ۛ";
                    break;
                case 1974987705:
                    str = "ۨ۬ۧ۬ۤۨۘۢۜۖۘۥۥۤۨۧۛۙۧۧۛۛۚۧۡۢ۟ۡۡۥۤۢۥۙۗۚۙۙۤۧۧۘۛۥ۫۟ۖۛۘۘۖۤۥۘۘۜۘۨۜۧۘۗۛۦۘۤۧۦۘ";
                    childCount = this.f950.getChildCount();
                    break;
                case 2029290616:
                    windowInsetsCompatDispatchApplyWindowInsets = ViewCompat.dispatchApplyWindowInsets(this.f950.getChildAt(i2), windowInsetsCompatOnApplyWindowInsets);
                    str = "۫ۛۖۘۖۙۨۛۚۡۧۙۜۘۛ۬ۥۘۦۖ۬۟ۥۥۙۜۦۘ۫ۛ۬۠ۙۙ۬ۤۨ۫۠ۘۧۘۨۘۜۨۨۘ۠ۤۖۗۧۧۛۘۧۦۥۚۧ۫۠ۛۘۤ۟ۤ";
                    break;
            }
        }
    }
}

package com.lxj.xpopup.core;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.C0076;
import com.android.dx.rop.code.RegisterSpec;
import com.lxj.xpopup.enums.PopupStatus;
import com.lxj.xpopup.util.AbstractC3786;
import com.lxj.xpopup.util.AbstractC3788;
import net.bytebuddy.utility.JavaConstant;
import p276.AbstractC8357;

/* JADX INFO: renamed from: com.lxj.xpopup.core.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC3783 extends Dialog {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AbstractC3776 f11813;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m8099() throws Throwable {
        String str;
        String str2 = Build.MODEL;
        boolean z = false;
        boolean z2 = str2.startsWith("Y") || str2.startsWith("y") || str2.startsWith("V") || str2.startsWith(RegisterSpec.PREFIX);
        String[] strArr = AbstractC3788.f11830;
        String str3 = strArr[0];
        String lowerCase = "unknown";
        C0076 c0076 = AbstractC3788.f11835;
        if (c0076 == null) {
            AbstractC3788.f11835 = new C0076(19, z);
            try {
                str = Build.BRAND;
            } catch (Throwable unused) {
            }
            String lowerCase2 = !TextUtils.isEmpty(str) ? str.toLowerCase() : "unknown";
            try {
                String str4 = Build.MANUFACTURER;
                if (!TextUtils.isEmpty(str4)) {
                    lowerCase = str4.toLowerCase();
                }
            } catch (Throwable unused2) {
            }
            String[] strArr2 = AbstractC3788.f11831;
            if (AbstractC3788.m8111(lowerCase2, lowerCase, strArr2)) {
                AbstractC3788.f11835.f227 = strArr2[0];
                String strM8103 = AbstractC3788.m8103("ro.build.version.emui");
                String[] strArrSplit = strM8103.split(JavaConstant.Dynamic.DEFAULT_NAME);
                if (strArrSplit.length > 1) {
                    AbstractC3788.f11835.f228 = strArrSplit[1];
                } else {
                    AbstractC3788.f11835.f228 = strM8103;
                }
                c0076 = AbstractC3788.f11835;
            } else if (AbstractC3788.m8111(lowerCase2, lowerCase, strArr)) {
                C0076 c00762 = AbstractC3788.f11835;
                c00762.f227 = strArr[0];
                c00762.f228 = AbstractC3788.m8103("ro.vivo.os.build.display.id");
                c0076 = AbstractC3788.f11835;
            } else {
                String[] strArr3 = AbstractC3788.f11829;
                if (AbstractC3788.m8111(lowerCase2, lowerCase, strArr3)) {
                    C0076 c00763 = AbstractC3788.f11835;
                    c00763.f227 = strArr3[0];
                    c00763.f228 = AbstractC3788.m8103("ro.build.version.incremental");
                    c0076 = AbstractC3788.f11835;
                } else {
                    String[] strArr4 = AbstractC3788.f11828;
                    if (AbstractC3788.m8111(lowerCase2, lowerCase, strArr4)) {
                        C0076 c00764 = AbstractC3788.f11835;
                        c00764.f227 = strArr4[0];
                        c00764.f228 = AbstractC3788.m8103("ro.build.version.opporom");
                        c0076 = AbstractC3788.f11835;
                    } else {
                        String[] strArr5 = AbstractC3788.f11827;
                        if (AbstractC3788.m8111(lowerCase2, lowerCase, strArr5)) {
                            C0076 c00765 = AbstractC3788.f11835;
                            c00765.f227 = strArr5[0];
                            c00765.f228 = AbstractC3788.m8103("ro.letv.release.version");
                            c0076 = AbstractC3788.f11835;
                        } else {
                            String[] strArr6 = AbstractC3788.f11826;
                            if (AbstractC3788.m8111(lowerCase2, lowerCase, strArr6)) {
                                C0076 c00766 = AbstractC3788.f11835;
                                c00766.f227 = strArr6[0];
                                c00766.f228 = AbstractC3788.m8103("ro.build.uiversion");
                                c0076 = AbstractC3788.f11835;
                            } else {
                                String[] strArr7 = AbstractC3788.f11844;
                                if (AbstractC3788.m8111(lowerCase2, lowerCase, strArr7)) {
                                    C0076 c00767 = AbstractC3788.f11835;
                                    c00767.f227 = strArr7[0];
                                    c00767.f228 = AbstractC3788.m8103("ro.build.MiFavor_version");
                                    c0076 = AbstractC3788.f11835;
                                } else {
                                    String[] strArr8 = AbstractC3788.f11843;
                                    if (AbstractC3788.m8111(lowerCase2, lowerCase, strArr8)) {
                                        C0076 c00768 = AbstractC3788.f11835;
                                        c00768.f227 = strArr8[0];
                                        c00768.f228 = AbstractC3788.m8103("ro.rom.version");
                                        c0076 = AbstractC3788.f11835;
                                    } else {
                                        String[] strArr9 = AbstractC3788.f11847;
                                        if (AbstractC3788.m8111(lowerCase2, lowerCase, strArr9)) {
                                            C0076 c00769 = AbstractC3788.f11835;
                                            c00769.f227 = strArr9[0];
                                            c00769.f228 = AbstractC3788.m8103("ro.build.rom.id");
                                            c0076 = AbstractC3788.f11835;
                                        } else {
                                            String[] strArr10 = AbstractC3788.f11848;
                                            if (AbstractC3788.m8111(lowerCase2, lowerCase, strArr10)) {
                                                AbstractC3788.f11835.f227 = strArr10[0];
                                            } else {
                                                String[] strArr11 = AbstractC3788.f11845;
                                                if (AbstractC3788.m8111(lowerCase2, lowerCase, strArr11)) {
                                                    AbstractC3788.f11835.f227 = strArr11[0];
                                                } else {
                                                    String[] strArr12 = AbstractC3788.f11846;
                                                    if (AbstractC3788.m8111(lowerCase2, lowerCase, strArr12)) {
                                                        AbstractC3788.f11835.f227 = strArr12[0];
                                                    } else {
                                                        String[] strArr13 = AbstractC3788.f11838;
                                                        if (AbstractC3788.m8111(lowerCase2, lowerCase, strArr13)) {
                                                            AbstractC3788.f11835.f227 = strArr13[0];
                                                        } else {
                                                            String[] strArr14 = AbstractC3788.f11837;
                                                            if (AbstractC3788.m8111(lowerCase2, lowerCase, strArr14)) {
                                                                AbstractC3788.f11835.f227 = strArr14[0];
                                                            } else {
                                                                String[] strArr15 = AbstractC3788.f11841;
                                                                if (AbstractC3788.m8111(lowerCase2, lowerCase, strArr15)) {
                                                                    AbstractC3788.f11835.f227 = strArr15[0];
                                                                } else {
                                                                    String[] strArr16 = AbstractC3788.f11842;
                                                                    if (AbstractC3788.m8111(lowerCase2, lowerCase, strArr16)) {
                                                                        AbstractC3788.f11835.f227 = strArr16[0];
                                                                    } else {
                                                                        String[] strArr17 = AbstractC3788.f11839;
                                                                        if (AbstractC3788.m8111(lowerCase2, lowerCase, strArr17)) {
                                                                            AbstractC3788.f11835.f227 = strArr17[0];
                                                                        } else {
                                                                            String[] strArr18 = AbstractC3788.f11840;
                                                                            if (AbstractC3788.m8111(lowerCase2, lowerCase, strArr18)) {
                                                                                AbstractC3788.f11835.f227 = strArr18[0];
                                                                            } else {
                                                                                String[] strArr19 = AbstractC3788.f11833;
                                                                                if (AbstractC3788.m8111(lowerCase2, lowerCase, strArr19)) {
                                                                                    AbstractC3788.f11835.f227 = strArr19[0];
                                                                                } else {
                                                                                    String[] strArr20 = AbstractC3788.f11832;
                                                                                    if (AbstractC3788.m8111(lowerCase2, lowerCase, strArr20)) {
                                                                                        AbstractC3788.f11835.f227 = strArr20[0];
                                                                                    } else {
                                                                                        AbstractC3788.f11835.f227 = lowerCase;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            AbstractC3788.f11835.f228 = AbstractC3788.m8103("");
                                            c0076 = AbstractC3788.f11835;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return str3.equals((String) c0076.f227) && Build.VERSION.SDK_INT == 27 && z2;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (m8099()) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            Resources system = Resources.getSystem();
            motionEvent.setLocation(x, y + system.getDimensionPixelSize(system.getIdentifier("status_bar_height", "dimen", "android")));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        AbstractC3776 abstractC3776;
        C3784 c3784;
        int i;
        super.onCreate(bundle);
        if (getWindow() == null || (abstractC3776 = this.f11813) == null || (c3784 = abstractC3776.popupInfo) == null) {
            return;
        }
        c3784.getClass();
        getWindow().setBackgroundDrawable(null);
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        getWindow().setFlags(16777216, 16777216);
        getWindow().setSoftInputMode(16);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.flags &= -201326593;
        getWindow().setAttributes(attributes);
        getWindow().setStatusBarColor(0);
        this.f11813.popupInfo.getClass();
        int i2 = AbstractC8357.f23038;
        getWindow().addFlags(Integer.MIN_VALUE);
        this.f11813.popupInfo.getClass();
        this.f11813.popupInfo.getClass();
        this.f11813.popupInfo.getClass();
        this.f11813.popupInfo.getClass();
        this.f11813.popupInfo.getClass();
        this.f11813.popupInfo.getClass();
        int i3 = -1;
        getWindow().setLayout(-1, -1);
        boolean z = getContext().getResources().getConfiguration().orientation == 1;
        if (m8099() && z) {
            View decorView = getWindow().getDecorView();
            Resources system = Resources.getSystem();
            decorView.setTranslationY(-system.getDimensionPixelSize(system.getIdentifier("status_bar_height", "dimen", "android")));
            Window window = getWindow();
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            if (windowManager == null) {
                i = -1;
            } else {
                Point point = new Point();
                windowManager.getDefaultDisplay().getSize(point);
                i = point.x;
            }
            WindowManager windowManager2 = (WindowManager) getContext().getSystemService("window");
            if (windowManager2 != null) {
                Point point2 = new Point();
                windowManager2.getDefaultDisplay().getSize(point2);
                i3 = point2.y;
            }
            window.setLayout(i, Math.max(i3, AbstractC3788.m8102(getContext())));
        }
        setContentView(this.f11813);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        AbstractC3776 abstractC3776;
        super.onWindowFocusChanged(z);
        this.f11813.popupInfo.getClass();
        this.f11813.popupInfo.getClass();
        int i = AbstractC8357.f23038;
        this.f11813.popupInfo.getClass();
        this.f11813.popupInfo.getClass();
        if (z && (abstractC3776 = this.f11813) != null && abstractC3776.hasMoveUp && abstractC3776.popupStatus == PopupStatus.Show) {
            abstractC3776.focusAndProcessBackPress();
            AbstractC3786.m8100(this.f11813);
        }
    }
}

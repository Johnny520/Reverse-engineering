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
import androidx.appcompat.app.C0923;
import com.android.p002dx.rop.code.RegisterSpec;
import com.lxj.xpopup.enums.PopupStatus;
import com.lxj.xpopup.util.AbstractC4618;
import com.lxj.xpopup.util.AbstractC4620;
import net.bytebuddy.utility.JavaConstant;
import p292.AbstractC9186;

/* JADX INFO: renamed from: com.lxj.xpopup.core.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC4615 extends Dialog {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AbstractC4608 f12158;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m8658() throws Throwable {
        String str;
        String str2 = Build.MODEL;
        boolean z = false;
        boolean z2 = str2.startsWith("Y") || str2.startsWith("y") || str2.startsWith("V") || str2.startsWith(RegisterSpec.PREFIX);
        String[] strArr = AbstractC4620.f12175;
        String str3 = strArr[0];
        String lowerCase = "unknown";
        C0923 c0923 = AbstractC4620.f12180;
        if (c0923 == null) {
            AbstractC4620.f12180 = new C0923(19, z);
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
            String[] strArr2 = AbstractC4620.f12176;
            if (AbstractC4620.m8670(lowerCase2, lowerCase, strArr2)) {
                AbstractC4620.f12180.f572 = strArr2[0];
                String strM8662 = AbstractC4620.m8662("ro.build.version.emui");
                String[] strArrSplit = strM8662.split(JavaConstant.Dynamic.DEFAULT_NAME);
                if (strArrSplit.length > 1) {
                    AbstractC4620.f12180.f573 = strArrSplit[1];
                } else {
                    AbstractC4620.f12180.f573 = strM8662;
                }
                c0923 = AbstractC4620.f12180;
            } else if (AbstractC4620.m8670(lowerCase2, lowerCase, strArr)) {
                C0923 c09232 = AbstractC4620.f12180;
                c09232.f572 = strArr[0];
                c09232.f573 = AbstractC4620.m8662("ro.vivo.os.build.display.id");
                c0923 = AbstractC4620.f12180;
            } else {
                String[] strArr3 = AbstractC4620.f12174;
                if (AbstractC4620.m8670(lowerCase2, lowerCase, strArr3)) {
                    C0923 c09233 = AbstractC4620.f12180;
                    c09233.f572 = strArr3[0];
                    c09233.f573 = AbstractC4620.m8662("ro.build.version.incremental");
                    c0923 = AbstractC4620.f12180;
                } else {
                    String[] strArr4 = AbstractC4620.f12173;
                    if (AbstractC4620.m8670(lowerCase2, lowerCase, strArr4)) {
                        C0923 c09234 = AbstractC4620.f12180;
                        c09234.f572 = strArr4[0];
                        c09234.f573 = AbstractC4620.m8662("ro.build.version.opporom");
                        c0923 = AbstractC4620.f12180;
                    } else {
                        String[] strArr5 = AbstractC4620.f12172;
                        if (AbstractC4620.m8670(lowerCase2, lowerCase, strArr5)) {
                            C0923 c09235 = AbstractC4620.f12180;
                            c09235.f572 = strArr5[0];
                            c09235.f573 = AbstractC4620.m8662("ro.letv.release.version");
                            c0923 = AbstractC4620.f12180;
                        } else {
                            String[] strArr6 = AbstractC4620.f12171;
                            if (AbstractC4620.m8670(lowerCase2, lowerCase, strArr6)) {
                                C0923 c09236 = AbstractC4620.f12180;
                                c09236.f572 = strArr6[0];
                                c09236.f573 = AbstractC4620.m8662("ro.build.uiversion");
                                c0923 = AbstractC4620.f12180;
                            } else {
                                String[] strArr7 = AbstractC4620.f12189;
                                if (AbstractC4620.m8670(lowerCase2, lowerCase, strArr7)) {
                                    C0923 c09237 = AbstractC4620.f12180;
                                    c09237.f572 = strArr7[0];
                                    c09237.f573 = AbstractC4620.m8662("ro.build.MiFavor_version");
                                    c0923 = AbstractC4620.f12180;
                                } else {
                                    String[] strArr8 = AbstractC4620.f12188;
                                    if (AbstractC4620.m8670(lowerCase2, lowerCase, strArr8)) {
                                        C0923 c09238 = AbstractC4620.f12180;
                                        c09238.f572 = strArr8[0];
                                        c09238.f573 = AbstractC4620.m8662("ro.rom.version");
                                        c0923 = AbstractC4620.f12180;
                                    } else {
                                        String[] strArr9 = AbstractC4620.f12192;
                                        if (AbstractC4620.m8670(lowerCase2, lowerCase, strArr9)) {
                                            C0923 c09239 = AbstractC4620.f12180;
                                            c09239.f572 = strArr9[0];
                                            c09239.f573 = AbstractC4620.m8662("ro.build.rom.id");
                                            c0923 = AbstractC4620.f12180;
                                        } else {
                                            String[] strArr10 = AbstractC4620.f12193;
                                            if (AbstractC4620.m8670(lowerCase2, lowerCase, strArr10)) {
                                                AbstractC4620.f12180.f572 = strArr10[0];
                                            } else {
                                                String[] strArr11 = AbstractC4620.f12190;
                                                if (AbstractC4620.m8670(lowerCase2, lowerCase, strArr11)) {
                                                    AbstractC4620.f12180.f572 = strArr11[0];
                                                } else {
                                                    String[] strArr12 = AbstractC4620.f12191;
                                                    if (AbstractC4620.m8670(lowerCase2, lowerCase, strArr12)) {
                                                        AbstractC4620.f12180.f572 = strArr12[0];
                                                    } else {
                                                        String[] strArr13 = AbstractC4620.f12183;
                                                        if (AbstractC4620.m8670(lowerCase2, lowerCase, strArr13)) {
                                                            AbstractC4620.f12180.f572 = strArr13[0];
                                                        } else {
                                                            String[] strArr14 = AbstractC4620.f12182;
                                                            if (AbstractC4620.m8670(lowerCase2, lowerCase, strArr14)) {
                                                                AbstractC4620.f12180.f572 = strArr14[0];
                                                            } else {
                                                                String[] strArr15 = AbstractC4620.f12186;
                                                                if (AbstractC4620.m8670(lowerCase2, lowerCase, strArr15)) {
                                                                    AbstractC4620.f12180.f572 = strArr15[0];
                                                                } else {
                                                                    String[] strArr16 = AbstractC4620.f12187;
                                                                    if (AbstractC4620.m8670(lowerCase2, lowerCase, strArr16)) {
                                                                        AbstractC4620.f12180.f572 = strArr16[0];
                                                                    } else {
                                                                        String[] strArr17 = AbstractC4620.f12184;
                                                                        if (AbstractC4620.m8670(lowerCase2, lowerCase, strArr17)) {
                                                                            AbstractC4620.f12180.f572 = strArr17[0];
                                                                        } else {
                                                                            String[] strArr18 = AbstractC4620.f12185;
                                                                            if (AbstractC4620.m8670(lowerCase2, lowerCase, strArr18)) {
                                                                                AbstractC4620.f12180.f572 = strArr18[0];
                                                                            } else {
                                                                                String[] strArr19 = AbstractC4620.f12178;
                                                                                if (AbstractC4620.m8670(lowerCase2, lowerCase, strArr19)) {
                                                                                    AbstractC4620.f12180.f572 = strArr19[0];
                                                                                } else {
                                                                                    String[] strArr20 = AbstractC4620.f12177;
                                                                                    if (AbstractC4620.m8670(lowerCase2, lowerCase, strArr20)) {
                                                                                        AbstractC4620.f12180.f572 = strArr20[0];
                                                                                    } else {
                                                                                        AbstractC4620.f12180.f572 = lowerCase;
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
                                            AbstractC4620.f12180.f573 = AbstractC4620.m8662("");
                                            c0923 = AbstractC4620.f12180;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return str3.equals((String) c0923.f572) && Build.VERSION.SDK_INT == 27 && z2;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (m8658()) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            Resources system = Resources.getSystem();
            motionEvent.setLocation(x, y + system.getDimensionPixelSize(system.getIdentifier("status_bar_height", "dimen", "android")));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        AbstractC4608 abstractC4608;
        C4616 c4616;
        int i;
        super.onCreate(bundle);
        if (getWindow() == null || (abstractC4608 = this.f12158) == null || (c4616 = abstractC4608.popupInfo) == null) {
            return;
        }
        c4616.getClass();
        getWindow().setBackgroundDrawable(null);
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        getWindow().setFlags(16777216, 16777216);
        getWindow().setSoftInputMode(16);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.flags &= -201326593;
        getWindow().setAttributes(attributes);
        getWindow().setStatusBarColor(0);
        this.f12158.popupInfo.getClass();
        int i2 = AbstractC9186.f23383;
        getWindow().addFlags(Integer.MIN_VALUE);
        this.f12158.popupInfo.getClass();
        this.f12158.popupInfo.getClass();
        this.f12158.popupInfo.getClass();
        this.f12158.popupInfo.getClass();
        this.f12158.popupInfo.getClass();
        this.f12158.popupInfo.getClass();
        int i3 = -1;
        getWindow().setLayout(-1, -1);
        boolean z = getContext().getResources().getConfiguration().orientation == 1;
        if (m8658() && z) {
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
            window.setLayout(i, Math.max(i3, AbstractC4620.m8661(getContext())));
        }
        setContentView(this.f12158);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        AbstractC4608 abstractC4608;
        super.onWindowFocusChanged(z);
        this.f12158.popupInfo.getClass();
        this.f12158.popupInfo.getClass();
        int i = AbstractC9186.f23383;
        this.f12158.popupInfo.getClass();
        this.f12158.popupInfo.getClass();
        if (z && (abstractC4608 = this.f12158) != null && abstractC4608.hasMoveUp && abstractC4608.popupStatus == PopupStatus.Show) {
            abstractC4608.focusAndProcessBackPress();
            AbstractC4618.m8659(this.f12158);
        }
    }
}

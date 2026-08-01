package p000;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import com.p001mr.elaris.AbstractC0169w;
import com.p001mr.elaris.HookEntry;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: q */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0412q implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f725a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f726b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f727c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0412q(Object obj, Object obj2, int i) {
        this.f725a = i;
        this.f726b = obj;
        this.f727c = obj2;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IGET, CHECK_CAST, IGET, APUT, IGET]}, finally: {[IGET, CHECK_CAST, IGET, APUT, IGET, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int iIndexOf;
        int iIndexOf2;
        boolean z;
        View view;
        Dialog dialog;
        int i = 0;
        zMo230a = false;
        zMo230a = false;
        zMo230a = false;
        zMo230a = false;
        zMo230a = false;
        boolean zMo230a = false;
        iCodePointCount = 0;
        int iCodePointCount = 0;
        switch (this.f725a) {
            case 0:
                Toast.makeText((Activity) this.f726b, (String) this.f727c, 0).show();
                return;
            case 1:
                C0193e2 c0193e2 = (C0193e2) this.f726b;
                try {
                    AbstractC0225g2.m427m(c0193e2, AbstractC0486u9.m1042D(c0193e2.f216c, AbstractC0260i5.m581X(c0193e2.f215b, (C0307l1) this.f727c).getAbsolutePath(), c0193e2.f217d) ? "已提交给 QQ 发送" : "发送失败，请重新进入当前会话");
                    return;
                } catch (Throwable th) {
                    AbstractC0225g2.m427m(c0193e2, AbstractC0225g2.m425k(th));
                    return;
                }
            case 2:
                C0193e2 c0193e22 = (C0193e2) this.f726b;
                if (c0193e22.f214a.isShowing()) {
                    c0193e22.f220g.setText((String) this.f727c);
                    return;
                }
                return;
            case 3:
                RunnableC0177d2 runnableC0177d2 = (RunnableC0177d2) this.f727c;
                if (((C0193e2) runnableC0177d2.f187c).f214a.isShowing()) {
                    ((ImageView) runnableC0177d2.f189e).setImageBitmap((Bitmap) this.f726b);
                    return;
                }
                return;
            case 4:
                C0259i4 c0259i4 = (C0259i4) this.f726b;
                EditText editText = c0259i4.f376c;
                String str = c0259i4.f374a;
                C0465t4 c0465t4 = (C0465t4) this.f727c;
                try {
                    Editable text = editText.getText();
                    if (text != null && (iIndexOf = text.toString().indexOf(str)) >= 0) {
                        int length = str.length() + iIndexOf;
                        C0465t4[] c0465t4Arr = (C0465t4[]) text.getSpans(iIndexOf, length, C0465t4.class);
                        if (c0465t4Arr != null) {
                            while (i < c0465t4Arr.length) {
                                text.removeSpan(c0465t4Arr[i]);
                                i++;
                            }
                        }
                        text.setSpan(c0465t4, iIndexOf, length, 33);
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                String str2 = (String) this.f727c;
                try {
                    Editable text2 = ((EditText) this.f726b).getText();
                    if (text2 != null && (iIndexOf2 = text2.toString().indexOf(str2)) >= 0) {
                        text2.delete(iIndexOf2, str2.length() + iIndexOf2);
                        return;
                    }
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 6:
                try {
                    C0314l8 c0314l8 = ((RunnableC0485u8) this.f727c).f944c.f1042a;
                    C0314l8 c0314l82 = ((RunnableC0485u8) this.f727c).f942a;
                    if (c0314l8 == c0314l82 && !c0314l82.f528a && ((RunnableC0485u8) this.f727c).f945d.isShowing()) {
                        ((RunnableC0485u8) this.f727c).f944c.f1042a = null;
                        C0565z8 c0565z8 = ((RunnableC0485u8) this.f727c).f946e;
                        ArrayList arrayList = (ArrayList) this.f726b;
                        ArrayList arrayList2 = c0565z8.f1142c;
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        c0565z8.notifyDataSetChanged();
                        ((RunnableC0485u8) this.f727c).f947f.setText("选择音色后输入文字");
                        ((RunnableC0485u8) this.f727c).f948g.setVisibility(0);
                        RunnableC0485u8 runnableC0485u8 = (RunnableC0485u8) this.f727c;
                        AbstractC0260i5.m640o(runnableC0485u8.f945d, AbstractC0486u9.m1039A(runnableC0485u8.f949h));
                        break;
                    }
                    return;
                } finally {
                    AbstractC0010a9.m72a(((RunnableC0485u8) this.f727c).f942a);
                }
            case 7:
                try {
                } catch (Throwable th2) {
                    try {
                        AbstractC0260i5.m590a(((C0348na) this.f726b).f600a);
                        AbstractC0198e7.m343a("kk-tts", "send", th2);
                        AbstractC0260i5.m583X1(((RunnableC0517w8) this.f727c).f1008g, "语音发送失败");
                        RunnableC0517w8 runnableC0517w8 = (RunnableC0517w8) this.f727c;
                        AbstractC0260i5.m551N((Dialog) runnableC0517w8.f1011j.f1027a, runnableC0517w8.f1012k);
                        if (!AbstractC0260i5.m674z0(((RunnableC0517w8) this.f727c).f1008g)) {
                            return;
                        }
                    } finally {
                        RunnableC0517w8 runnableC0517w82 = (RunnableC0517w8) this.f727c;
                        AbstractC0260i5.m551N((Dialog) runnableC0517w82.f1011j.f1027a, runnableC0517w82.f1012k);
                    }
                }
                if (!((RunnableC0517w8) this.f727c).f1005d.f528a && HookEntry.isCurrentHotReloadGeneration(((RunnableC0517w8) this.f727c).f1007f) && AbstractC0260i5.m674z0(((RunnableC0517w8) this.f727c).f1008g)) {
                    boolean zExists = ((C0348na) this.f726b).f600a.exists();
                    RunnableC0517w8 runnableC0517w83 = (RunnableC0517w8) this.f727c;
                    if (!zExists) {
                        AbstractC0260i5.m583X1(runnableC0517w83.f1008g, "语音转换失败");
                        RunnableC0517w8 runnableC0517w84 = (RunnableC0517w8) this.f727c;
                        AbstractC0260i5.m551N((Dialog) runnableC0517w84.f1011j.f1027a, runnableC0517w84.f1012k);
                        if (!AbstractC0260i5.m674z0(((RunnableC0517w8) this.f727c).f1008g)) {
                            return;
                        }
                    } else if (AbstractC0169w.m252K0(runnableC0517w83.f1009h, ((C0348na) this.f726b).f600a.getAbsolutePath(), ((C0348na) this.f726b).f601b, ((RunnableC0517w8) this.f727c).f1010i)) {
                        StringBuilder sb = new StringBuilder("kk tts sent voice=");
                        sb.append(((RunnableC0517w8) this.f727c).f1004c.f65a);
                        sb.append(" chars=");
                        String str3 = ((RunnableC0517w8) this.f727c).f1003b;
                        if (str3 != null && str3.length() != 0) {
                            iCodePointCount = str3.codePointCount(0, str3.length());
                        }
                        sb.append(iCodePointCount);
                        sb.append(" seconds=");
                        sb.append(((C0348na) this.f726b).f601b);
                        sb.append(" encoder=silk ptt=generated");
                        HookEntry.log(sb.toString());
                    } else {
                        AbstractC0260i5.m590a(((C0348na) this.f726b).f600a);
                        AbstractC0260i5.m583X1(((RunnableC0517w8) this.f727c).f1008g, "语音发送失败");
                        RunnableC0517w8 runnableC0517w85 = (RunnableC0517w8) this.f727c;
                        AbstractC0260i5.m551N((Dialog) runnableC0517w85.f1011j.f1027a, runnableC0517w85.f1012k);
                        if (!AbstractC0260i5.m674z0(((RunnableC0517w8) this.f727c).f1008g)) {
                            return;
                        }
                    }
                    RunnableC0517w8 runnableC0517w86 = (RunnableC0517w8) this.f727c;
                    AbstractC0260i5.m562Q1(runnableC0517w86.f1008g, runnableC0517w86.f1009h, runnableC0517w86.f1010i, runnableC0517w86.f1004c, runnableC0517w86.f1003b);
                    return;
                }
                AbstractC0260i5.m590a(((C0348na) this.f726b).f600a);
                return;
            case 8:
                ViewOnAttachStateChangeListenerC0267ic viewOnAttachStateChangeListenerC0267ic = (ViewOnAttachStateChangeListenerC0267ic) this.f727c;
                viewOnAttachStateChangeListenerC0267ic.f426g = null;
                if (!viewOnAttachStateChangeListenerC0267ic.f425f) {
                    C0338n0 c0338n0 = viewOnAttachStateChangeListenerC0267ic.f422c;
                    synchronized (c0338n0) {
                        z = c0338n0.f584b;
                    }
                    if (!z && (view = (View) viewOnAttachStateChangeListenerC0267ic.f420a.get()) != null && view.isAttachedToWindow()) {
                        WeakHashMap weakHashMap = AbstractC0302kc.f504a;
                        synchronized (weakHashMap) {
                            Map map = (Map) weakHashMap.get(view);
                            if (map != null && map.get(viewOnAttachStateChangeListenerC0267ic.f421b) == viewOnAttachStateChangeListenerC0267ic) {
                                InterfaceC0286jc interfaceC0286jc = viewOnAttachStateChangeListenerC0267ic.f423d;
                                if (interfaceC0286jc == null) {
                                    zMo230a = true;
                                } else {
                                    try {
                                        zMo230a = interfaceC0286jc.mo230a();
                                    } catch (Throwable th3) {
                                        AbstractC0198e7.m343a("repeater", viewOnAttachStateChangeListenerC0267ic.f421b + "-validate", th3);
                                    }
                                }
                                break;
                            }
                        }
                    }
                    break;
                }
                ViewOnAttachStateChangeListenerC0267ic viewOnAttachStateChangeListenerC0267ic2 = (ViewOnAttachStateChangeListenerC0267ic) this.f727c;
                if (!zMo230a) {
                    viewOnAttachStateChangeListenerC0267ic2.m680a(true);
                    return;
                }
                try {
                    viewOnAttachStateChangeListenerC0267ic2.f424e.run();
                    break;
                } catch (Throwable th4) {
                    AbstractC0198e7.m343a("repeater", ((ViewOnAttachStateChangeListenerC0267ic) this.f727c).f421b + "-stage-" + ((C0017b0) this.f726b).f51a, th4);
                }
                ((ViewOnAttachStateChangeListenerC0267ic) this.f727c).m682c();
                return;
            case 9:
                C0527x2 c0527x2 = (C0527x2) this.f726b;
                RunnableC0412q runnableC0412q = (RunnableC0412q) c0527x2.f1027a;
                RunnableC0412q runnableC0412q2 = (RunnableC0412q) c0527x2.f1027a;
                if (!HookEntry.isCurrentHotReloadGeneration(((RunnableC0352ne) runnableC0412q.f727c).f611e) || ((RunnableC0352ne) runnableC0412q2.f727c).f612f.isFinishing() || ((RunnableC0352ne) runnableC0412q2.f727c).f612f.isDestroyed()) {
                    return;
                }
                HookEntry.log("local voice QQ send rejected callback=".concat(AbstractC0169w.m242F0((String) this.f727c)));
                AbstractC0169w.m276W0(((RunnableC0352ne) runnableC0412q2.f727c).f612f, "QQ 未接受语音发送，请重试");
                return;
            case 10:
                try {
                    if (((RunnableC0352ne) this.f727c).f609c.f977a || !HookEntry.isCurrentHotReloadGeneration(((RunnableC0352ne) this.f727c).f611e) || ((RunnableC0352ne) this.f727c).f612f.isFinishing() || ((RunnableC0352ne) this.f727c).f612f.isDestroyed()) {
                        ((C0348na) this.f726b).f600a.delete();
                        RunnableC0352ne runnableC0352ne = (RunnableC0352ne) this.f727c;
                        runnableC0352ne.f615i[0] = true;
                        dialog = runnableC0352ne.f616j;
                        if (dialog == null) {
                            return;
                        }
                    } else if (((C0348na) this.f726b).f600a.exists()) {
                        C0348na c0348na = (C0348na) this.f726b;
                        int i2 = c0348na.f601b;
                        long length2 = c0348na.f600a.length();
                        String[] strArr = AbstractC0169w.f161a;
                        byte[] bArr = new byte[16];
                        int iMax = (int) (2147483647L & ((((long) Math.max(1, i2)) * 31) + Math.max(1L, length2)));
                        for (int i3 = 0; i3 < 16; i3++) {
                            bArr[i3] = (byte) ((((i3 * 7) + iMax) % 22) + 5);
                        }
                        if (!AbstractC0169w.m250J0(((RunnableC0352ne) this.f727c).f613g, ((C0348na) this.f726b).f600a.getAbsolutePath(), ((C0348na) this.f726b).f601b, bArr, ((RunnableC0352ne) this.f727c).f614h, new C0527x2(this))) {
                            ((C0348na) this.f726b).f600a.delete();
                            AbstractC0169w.m276W0(((RunnableC0352ne) this.f727c).f612f, "语音发送失败");
                        }
                        RunnableC0352ne runnableC0352ne2 = (RunnableC0352ne) this.f727c;
                        runnableC0352ne2.f615i[0] = true;
                        dialog = runnableC0352ne2.f616j;
                        if (dialog == null) {
                            return;
                        }
                    } else {
                        AbstractC0169w.m276W0(((RunnableC0352ne) this.f727c).f612f, "本地语音读取失败");
                        if (dialog == null) {
                            return;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        ((C0348na) this.f726b).f600a.delete();
                        HookEntry.log("local voice direct file send failed: " + th5.getClass().getSimpleName() + ": " + AbstractC0169w.m242F0(th5.getMessage()));
                        AbstractC0169w.m276W0(((RunnableC0352ne) this.f727c).f612f, "语音发送失败");
                        RunnableC0352ne runnableC0352ne3 = (RunnableC0352ne) this.f727c;
                        runnableC0352ne3.f615i[0] = true;
                        dialog = runnableC0352ne3.f616j;
                        if (dialog == null) {
                            return;
                        }
                    } finally {
                        RunnableC0352ne runnableC0352ne4 = (RunnableC0352ne) this.f727c;
                        runnableC0352ne4.f615i[0] = true;
                        Dialog dialog2 = runnableC0352ne4.f616j;
                        if (dialog2 != null) {
                            try {
                                dialog2.dismiss();
                                break;
                            } catch (Throwable unused3) {
                            }
                        }
                    }
                }
                try {
                    dialog.dismiss();
                    return;
                } catch (Throwable unused4) {
                    return;
                }
            default:
                RunnableC0352ne runnableC0352ne5 = (RunnableC0352ne) this.f726b;
                Activity activity = runnableC0352ne5.f612f;
                String str4 = (String) this.f727c;
                if (str4.contains("storage") || str4.contains("space")) {
                    AbstractC0169w.m276W0(activity, "可用存储空间不足，未发送");
                } else if (str4.contains("cancel")) {
                    AbstractC0169w.m276W0(activity, "已取消语音处理");
                } else if (str4.contains("incomplete") || str4.contains("changed")) {
                    AbstractC0169w.m276W0(activity, "音频读取不完整或处理期间已变更，未发送");
                } else if (str4.contains("decode") || str4.contains("encode") || str4.contains("codec") || str4.contains("track") || str4.contains("mime")) {
                    AbstractC0169w.m276W0(activity, "当前设备无法解码该音频");
                } else {
                    AbstractC0169w.m276W0(activity, "本地语音读取失败");
                }
                runnableC0352ne5.f615i[0] = true;
                Dialog dialog3 = runnableC0352ne5.f616j;
                if (dialog3 != null) {
                    try {
                        dialog3.dismiss();
                        return;
                    } catch (Throwable unused5) {
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ RunnableC0412q(Object obj, Object obj2, int i, boolean z) {
        this.f725a = i;
        this.f727c = obj;
        this.f726b = obj2;
    }
}

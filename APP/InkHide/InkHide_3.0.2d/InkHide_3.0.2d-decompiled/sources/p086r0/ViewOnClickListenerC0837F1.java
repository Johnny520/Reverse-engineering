package p086r0;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p055lu.wxmask.bean.MaskItemBean;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p003B0.AbstractC0055a;
import p011F0.AbstractC0123k;
import p027N0.AbstractC0223g;
import p027N0.C0228l;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p069i.C0709q1;
import p069i.C0716t;
import p079n0.C0773a;
import p081o0.C0781b;
import p088s0.C0968B;
import p088s0.C0976J;
import p088s0.C0983e;
import p088s0.C0984f;
import p088s0.C0985g;
import p088s0.C0987i;
import p088s0.C0990l;
import p088s0.C0993o;
import p088s0.C0994p;
import p090t0.C1010e;
import p102z0.AbstractC1122e;
import p102z0.C1142y;
import p102z0.C1143z;

/* JADX INFO: renamed from: r0.F1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0837F1 implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2801b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2802c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f2803d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC0837F1(Object obj, Object obj2, int i2) {
        this.f2801b = i2;
        this.f2802c = obj;
        this.f2803d = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0188  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        String str;
        String str2;
        String string;
        String maskId;
        switch (this.f2801b) {
            case 0:
                C0858M1 c0858m1 = (C0858M1) this.f2802c;
                c0858m1.getClass();
                if (C0858M1.m1757c()) {
                    c0858m1.m1765i((Activity) this.f2803d);
                    return;
                }
                return;
            case 1:
                Object tag = ((FrameLayout) this.f2803d).getTag();
                C0773a c0773a = tag instanceof C0773a ? (C0773a) tag : null;
                C0709q1.m1342a((C0709q1) this.f2802c, c0773a != null ? c0773a.f2595b : -1);
                return;
            case 2:
                C0983e c0983e = (C0983e) this.f2802c;
                C0709q1 c0709q1 = (C0709q1) this.f2803d;
                int i2 = c0983e.f2595b;
                if (i2 >= 0) {
                    C0985g c0985g = (C0985g) c0709q1.f2397c;
                    if (c0985g == null) {
                        AbstractC0223g.m420g("listAdapter");
                        throw null;
                    }
                    if (i2 < c0985g.f2596b.size()) {
                        C0985g c0985g2 = (C0985g) c0709q1.f2397c;
                        if (c0985g2 == null) {
                            AbstractC0223g.m420g("listAdapter");
                            throw null;
                        }
                        MaskItemBean maskItemBean = (MaskItemBean) c0985g2.f2596b.get(i2);
                        String string2 = (maskItemBean == null || (maskId = maskItemBean.getMaskId()) == null) ? null : AbstractC0299i.m507C0(maskId).toString();
                        if (string2 == null) {
                            string2 = "";
                        }
                        C1143z c1143z = C1143z.f3876a;
                        C1142y c1142yM2528b = C1143z.m2528b(string2);
                        if (c1142yM2528b == null || (str2 = c1142yM2528b.f3868a) == null || (string = AbstractC0299i.m507C0(str2).toString()) == null) {
                            str = string2;
                        } else {
                            str = AbstractC0307q.m534d0(string) ? null : string;
                            if (str == null) {
                            }
                        }
                        if (AbstractC0307q.m534d0(str)) {
                            return;
                        }
                        String str3 = AbstractC1122e.f3783a;
                        String string3 = AbstractC0299i.m507C0(str).toString();
                        if (!AbstractC0307q.m534d0(string3)) {
                            AbstractC1122e.f3783a = string3;
                            AbstractC1122e.f3784b = System.currentTimeMillis();
                        }
                        String[] strArr = {string2, str};
                        ArrayList arrayList = new ArrayList(2);
                        for (int i3 = 0; i3 < 2; i3++) {
                            arrayList.add(AbstractC0299i.m507C0(strArr[i3]).toString());
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : arrayList) {
                            if (!AbstractC0307q.m534d0((String) obj)) {
                                arrayList2.add(obj);
                            }
                        }
                        Set setM265B0 = AbstractC0123k.m265B0(arrayList2);
                        if (!setM265B0.isEmpty()) {
                            AbstractC1122e.f3785c = setM265B0;
                        }
                        ((C1010e) c0709q1.f2395a).mo2182a();
                        if (((AtomicBoolean) c0709q1.f2401g).compareAndSet(false, true)) {
                            ((ExecutorService) c0709q1.f2399e).shutdownNow();
                            ((C0984f) c0709q1.f2400f).evictAll();
                        }
                        Activity activity = (Activity) c0709q1.f2396b;
                        Intent intent = new Intent();
                        intent.setClassName(((Activity) c0709q1.f2396b).getPackageName(), "com.tencent.mm.ui.chatting.ChattingUI");
                        intent.putExtra("Chat_User", str);
                        activity.startActivity(intent);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                C0990l.m2192b((C0990l) this.f2802c, (C0987i) this.f2803d);
                return;
            case 4:
                Object tag2 = ((FrameLayout) this.f2803d).getTag();
                C0773a c0773a2 = tag2 instanceof C0773a ? (C0773a) tag2 : null;
                C0716t.m1349b((C0716t) this.f2802c, c0773a2 != null ? c0773a2.f2595b : -1);
                return;
            case 5:
                int i4 = ((C0994p) this.f2803d).f2595b;
                C0716t c0716t = (C0716t) this.f2802c;
                if (i4 < 0) {
                    c0716t.getClass();
                    return;
                }
                C0985g c0985g3 = (C0985g) c0716t.f2418b;
                if (c0985g3 == null) {
                    AbstractC0223g.m420g("listAdapter");
                    throw null;
                }
                if (i4 >= c0985g3.f2596b.size()) {
                    return;
                }
                C0985g c0985g4 = (C0985g) c0716t.f2418b;
                if (c0985g4 == null) {
                    AbstractC0223g.m420g("listAdapter");
                    throw null;
                }
                C0993o c0993o = (C0993o) c0985g4.f2596b.get(i4);
                if (c0993o == null) {
                    return;
                }
                String str4 = c0993o.f3570c;
                if (AbstractC0307q.m534d0(str4)) {
                    str4 = null;
                }
                File file = str4 != null ? new File(str4) : null;
                if (file == null || !file.exists()) {
                    AbstractC0503h.m978P("暂无预览图");
                    return;
                }
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                if (bitmapDecodeFile == null) {
                    AbstractC0503h.m978P("预览图读取失败");
                    return;
                }
                Activity activity2 = (Activity) c0716t.f2417a;
                ImageView imageView = new ImageView(activity2);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                imageView.setAdjustViewBounds(true);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageBitmap(bitmapDecodeFile);
                imageView.setPadding(AbstractC0055a.m101b(12), AbstractC0055a.m101b(12), AbstractC0055a.m101b(12), AbstractC0055a.m101b(12));
                AlertDialog.Builder builder = new AlertDialog.Builder(activity2);
                String str5 = c0993o.f3569b;
                if (AbstractC0307q.m534d0(str5)) {
                    str5 = "朋友圈预览";
                }
                builder.setTitle(str5).setView(imageView).setPositiveButton("关闭", (DialogInterface.OnClickListener) null).show();
                return;
            case 6:
                C0976J.m2167p((C0976J) this.f2802c, (TextView) this.f2803d);
                return;
            case 7:
                C0228l c0228l = (C0228l) this.f2803d;
                C0976J c0976j = (C0976J) this.f2802c;
                c0976j.m2177P(new C0968B(3, c0228l, c0976j));
                return;
            default:
                C0781b c0781b = (C0781b) this.f2802c;
                if (c0781b != null) {
                    c0781b.mo7b();
                }
                Object obj2 = ((C0228l) this.f2803d).f568a;
                if (obj2 != null) {
                    ((AlertDialog) obj2).dismiss();
                    return;
                } else {
                    AbstractC0223g.m420g("dialog");
                    throw null;
                }
        }
    }
}

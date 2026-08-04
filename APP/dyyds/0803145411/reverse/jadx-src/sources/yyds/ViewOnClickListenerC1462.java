package yyds;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.android.NativeUtil;
import com.android.app.CustomRecyclerView;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.p000ss.android.ugc.aweme.yyds.R;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛶᲈᛴᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1462 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f6964;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f6965;

    public /* synthetic */ ViewOnClickListenerC1462(int i, Object obj) {
        this.f6964 = i;
        this.f6965 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0827 c0827;
        Object obj;
        Object c2658;
        Object c26582;
        boolean zBooleanValue;
        int i = this.f6964;
        C0827 c08272 = null;
        Object obj2 = this.f6965;
        switch (i) {
            case 0:
                Editable text = ((EditText) ((C1633) obj2).f8332).getText();
                if (text != null) {
                    text.clear();
                }
                break;
            case 1:
                C1509 c1509 = C1509.f7142;
                String strM4341 = AbstractC2328.m4341(-170604263801710L);
                c1509.getClass();
                AbstractC2328.m4341(-26636960039790L);
                C1509.f7201.m1581(C1509.f7179[72], strM4341);
                C0644.m1546((ImageView) obj2);
                C1435.m2931(C1435.f6790);
                break;
            case 2:
                ((InterfaceC1549) obj2).mo371(view);
                break;
            case 3:
                final View view2 = (View) obj2;
                C0763 c0763M1709 = C0763.m1709(view2.getContext());
                c0763M1709.f3532 = false;
                c0763M1709.f3518 = AbstractC2328.m4341(-859182010631022L);
                c0763M1709.mo1719();
                C2701 c2701 = C2701.f13261;
                Activity activityM282 = c0763M1709.m282();
                c2701.getClass();
                C2701.m4807(activityM282);
                final long j = C0668.f3169;
                c0763M1709.f3522 = new C1807(c0763M1709, view2);
                c0763M1709.mo1719();
                c0763M1709.f405 = new InterfaceC0251() { // from class: yyds.ᛷᲁᲁᛷ
                    static {
                        NativeUtil.classesInit0(217);
                    }

                    @Override // yyds.InterfaceC0251
                    /* JADX INFO: renamed from: ᛲᲈᲁ */
                    public final native void mo901(AbstractC0041 abstractC0041);
                };
                c0763M1709.m1715(view2.getContext());
                break;
            case 4:
                C0150 c0150 = (C0150) obj2;
                boolean z = c0150.f940;
                c0150.f940 = !z;
                c0150.f937.setVisibility(z ? 8 : 0);
                c0150.f934.setText(AbstractC2328.m4341(c0150.f940 ? -1164717394133870L : -1164730279035758L));
                break;
            case 5:
                Collection collectionValues = ((LinkedHashMap) obj2).values();
                AbstractC2328.m4341(-104195479470958L);
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    ((EditText) it.next()).setText(AbstractC2328.m4341(-104272788882286L));
                }
                break;
            case 6:
                ((C0634) obj2).f3053.toggle();
                break;
            case 7:
                C0172 c0172 = (C0172) obj2;
                Object obj3 = c0172.f997;
                if (obj3 == null) {
                    AbstractC2328.m4341(-120808412971886L);
                    c0827 = null;
                } else {
                    c0827 = (C0827) obj3;
                }
                List list = c0827.f3761;
                i = (list.isEmpty() || c0827.f3763.size() != list.size()) ? 0 : 1;
                Object obj4 = c0172.f997;
                if (i == 0) {
                    if (obj4 == null) {
                        AbstractC2328.m4341(-120920082121582L);
                    } else {
                        c08272 = (C0827) obj4;
                    }
                    List list2 = c08272.f3761;
                    LinkedHashSet linkedHashSet = c08272.f3763;
                    if (list2.isEmpty() || linkedHashSet.size() != list2.size()) {
                        AbstractC1432.m2928(AbstractC2725.m4849(list2), linkedHashSet);
                        c08272.f1869.m1869(0, list2.size());
                        c08272.f3762.mo371(Integer.valueOf(linkedHashSet.size()));
                    }
                    break;
                } else {
                    if (obj4 == null) {
                        AbstractC2328.m4341(-120864247546734L);
                    } else {
                        c08272 = (C0827) obj4;
                    }
                    LinkedHashSet linkedHashSet2 = c08272.f3763;
                    if (!linkedHashSet2.isEmpty()) {
                        linkedHashSet2.clear();
                        c08272.f1869.m1869(0, c08272.f3761.size());
                        c08272.f3762.mo371(0);
                        break;
                    }
                }
                break;
            case 8:
                ((C2471) obj2).f12213.mo731();
                break;
            case 9:
                DialogC1378 dialogC1378 = (DialogC1378) obj2;
                if (dialogC1378.f6422.f6224) {
                    dialogC1378.dismiss();
                }
                break;
            case 10:
                C0469 c0469 = C0469.f2328;
                Context context = view.getContext();
                AbstractC2328.m4341(-906542615004014L);
                c0469.m1276(context, (String) obj2, AbstractC2328.m4341(-906611334480750L));
                break;
            case 11:
                Context context2 = ((ViewGroup) obj2).getContext();
                AbstractC2328.m4341(-906946341929838L);
                AbstractC2328.m4341(-199642537689966L);
                C2701.f13261.getClass();
                C2701.m4807(context2);
                C1664.f8513.getClass();
                C1101 c1101M3404 = C1664.m3404();
                C2235 c2235M3386 = (c1101M3404 == null || (obj = c1101M3404.f5066.get()) == null) ? null : C1664.m3386(obj, false);
                if (c2235M3386 == null) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-199676897428334L));
                } else {
                    View viewInflate = AbstractC1115.m2309(context2).inflate(R.layout.dialog_profile_batch_download, (ViewGroup) null, false);
                    int i2 = R.id.btn_download;
                    Button button = (Button) AbstractC1741.m3479(viewInflate, R.id.btn_download);
                    if (button != null) {
                        i2 = R.id.btn_load_all;
                        Button button2 = (Button) AbstractC1741.m3479(viewInflate, R.id.btn_load_all);
                        if (button2 != null) {
                            i2 = R.id.btn_select_all;
                            Button button3 = (Button) AbstractC1741.m3479(viewInflate, R.id.btn_select_all);
                            if (button3 != null) {
                                i2 = R.id.iv_close;
                                ImageView imageView = (ImageView) AbstractC1741.m3479(viewInflate, R.id.iv_close);
                                if (imageView != null) {
                                    i2 = R.id.recycler_view;
                                    CustomRecyclerView customRecyclerView = (CustomRecyclerView) AbstractC1741.m3479(viewInflate, R.id.recycler_view);
                                    if (customRecyclerView != null) {
                                        i2 = R.id.tv_summary;
                                        TextView textView = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_summary);
                                        if (textView != null) {
                                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                                            C0299 c0299 = new C0299(linearLayout, button, button2, button3, imageView, customRecyclerView, textView);
                                            AbstractC2328.m4341(-199737026970478L);
                                            C2673 c2673 = new C2673(new C1565(1, c0299));
                                            customRecyclerView.setLayoutManager(new GridLayoutManager(3));
                                            customRecyclerView.setAdapter(c2673);
                                            customRecyclerView.setHasFixedSize(true);
                                            C0172 c01722 = new C0172();
                                            c01722.f997 = c2235M3386;
                                            C1417 c1417 = new C1417();
                                            AbstractC1917.m3697(c01722, c2673, c0299, c1417, c2235M3386);
                                            Dialog dialog = new Dialog(context2, android.R.style.Theme.Translucent.NoTitleBar);
                                            dialog.setContentView(linearLayout);
                                            Window window = dialog.getWindow();
                                            if (window != null) {
                                                window.setBackgroundDrawableResource(android.R.color.transparent);
                                                window.setGravity(80);
                                                window.setLayout(-1, (int) (((double) context2.getResources().getDisplayMetrics().heightPixels) * 0.88d));
                                                window.setWindowAnimations(android.R.style.Animation.InputMethod);
                                            }
                                            dialog.setCancelable(true);
                                            dialog.setCanceledOnTouchOutside(true);
                                            dialog.setOnDismissListener(new DialogInterfaceOnDismissListenerC1709(i));
                                            imageView.setOnClickListener(new ViewOnClickListenerC1393(dialog, 12));
                                            button3.setOnClickListener(new ViewOnClickListenerC1462(12, c2673));
                                            button2.setOnClickListener(new ViewOnClickListenerC0257((Object) c1417, c01722, (Object) c2673, (InterfaceC1749) c0299, 14));
                                            button.setOnClickListener(new ViewOnClickListenerC1192(c2673, dialog, context2));
                                            dialog.show();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C0188.m789(AbstractC2328.m4341(-1750911710561134L).concat(viewInflate.getResources().getResourceName(i2)));
                }
                break;
            case 12:
                C2673 c26732 = (C2673) obj2;
                LinkedHashSet linkedHashSet3 = c26732.f13121;
                ArrayList arrayList = c26732.f13120;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : arrayList) {
                    if (c26732.m4766((Aweme) obj5)) {
                        arrayList2.add(obj5);
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    hashSet.add(C2673.m4765((Aweme) it2.next()));
                }
                if (hashSet.isEmpty() || !linkedHashSet3.containsAll(hashSet)) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj6 : arrayList) {
                        if (c26732.m4766((Aweme) obj6)) {
                            arrayList3.add(obj6);
                        }
                    }
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        linkedHashSet3.add(C2673.m4765((Aweme) it3.next()));
                    }
                } else {
                    linkedHashSet3.clear();
                }
                c26732.m1058();
                c26732.m4767();
                break;
            case 13:
                ((C0832) obj2).m1892();
                break;
            case 14:
                C0302 c0302 = (C0302) obj2;
                C1664 c1664 = C1664.f8513;
                if (C1664.f8487) {
                    C1664.m3387(c1664, null, 2);
                } else {
                    c1664.getClass();
                    if (C1664.f8499 == null || C1664.f8479 == null || C1664.f8492 == null || C1664.f8472 == null || C1664.f8510 == null || C1664.f8481 == null || C1664.f8514 == null) {
                        String strM43412 = AbstractC2328.m4341(-845274906526574L);
                        c0302.m967(EnumC0676.f3219, 1400L);
                        AbstractC1960.m3789(strM43412);
                    } else {
                        C1101 c1101M34042 = C1664.m3404();
                        Object obj7 = c1101M34042 != null ? c1101M34042.f5066.get() : null;
                        ViewGroup viewGroup = c1101M34042 != null ? (ViewGroup) c1101M34042.f5067.get() : null;
                        if (obj7 == null || viewGroup == null) {
                            String strM43413 = AbstractC2328.m4341(-845317856199534L);
                            c0302.m967(EnumC0676.f3219, 1400L);
                            AbstractC1960.m3789(strM43413);
                        } else {
                            C0921 c0921M3394 = C1664.m3394(obj7);
                            if (c0921M3394 == null) {
                                String strM43414 = AbstractC2328.m4341(-845369395807086L);
                                c0302.m967(EnumC0676.f3219, 1400L);
                                AbstractC1960.m3789(strM43414);
                            } else {
                                C0993 c0993 = c0921M3394.f4224;
                                ViewParent viewParentM3396 = C1664.m3396(viewGroup);
                                if (viewParentM3396 != null) {
                                    try {
                                        c2658 = C1664.m3400(viewParentM3396);
                                    } catch (Throwable th) {
                                        c2658 = new C2658(th);
                                    }
                                    Throwable thM4249 = C2248.m4249(c2658);
                                    if (thM4249 != null) {
                                        C2336.f11496.m4355(AbstractC2328.m4341(-846086655345518L), thM4249);
                                    }
                                    if (c2658 instanceof C2658) {
                                        c2658 = null;
                                    }
                                    Method method = (Method) c2658;
                                    if (method == null) {
                                        zBooleanValue = false;
                                    } else {
                                        LinkedHashSet linkedHashSet4 = C1664.f8491;
                                        if (linkedHashSet4.contains(method)) {
                                            zBooleanValue = true;
                                        } else {
                                            try {
                                                method.setAccessible(true);
                                                c1664.m688(method, null, new C2713(11, c1664));
                                                linkedHashSet4.add(method);
                                                c26582 = Boolean.TRUE;
                                            } catch (Throwable th2) {
                                                c26582 = new C2658(th2);
                                            }
                                            Throwable thM42492 = C2248.m4249(c26582);
                                            if (thM42492 != null) {
                                                C2336.f11496.m4355(AbstractC2328.m4341(-846168259724142L), thM42492);
                                            }
                                            Boolean bool = Boolean.FALSE;
                                            if (c26582 instanceof C2658) {
                                                c26582 = bool;
                                            }
                                            zBooleanValue = ((Boolean) c26582).booleanValue();
                                        }
                                    }
                                    if (zBooleanValue) {
                                        C1664.f8475 = new WeakReference(obj7);
                                        C1664.f8470 = new WeakReference(viewGroup);
                                        C1664.f8484 = new WeakReference(c0302);
                                        C1664.f8512 = new WeakReference(viewParentM3396);
                                        C1664.f8487 = true;
                                        C1664.f8508 = -1;
                                        C1664.f8483 = SystemClock.elapsedRealtime();
                                        C1664.f8497 = 0L;
                                        C1664.f8495 = c0993;
                                        C1664.f8489 = null;
                                        C1664.f8478 = C1664.m3385(viewGroup);
                                        C1664.f8517 = 0L;
                                        C1664.f8488 = 0;
                                        C1664.m3389(EnumC0676.f3222);
                                        C2336.f11496.m4354(AbstractC2328.m4341(-845459590120302L) + c0993.f4508);
                                        Handler handler = C1664.f8494;
                                        RunnableC1128 runnableC1128 = C1664.f8486;
                                        handler.removeCallbacks(runnableC1128);
                                        handler.post(runnableC1128);
                                    }
                                }
                                String strM43415 = AbstractC2328.m4341(-845416640447342L);
                                c0302.m967(EnumC0676.f3219, 1400L);
                                AbstractC1960.m3789(strM43415);
                            }
                        }
                    }
                }
                break;
            case 15:
                C1186.f5426.getClass();
                AbstractC2328.m4341(-197911665869678L);
                new C1186((Activity) obj2).f5430.m1717();
                break;
            case 16:
                ((C2802) obj2).mo731();
                break;
            default:
                C1521 c1521 = (C1521) obj2;
                String strM2001 = AbstractC0897.m2001((EditText) c1521.f7343);
                String strM20012 = AbstractC0897.m2001((EditText) c1521.f7339);
                String strM20013 = AbstractC0897.m2001((EditText) c1521.f7342);
                if (strM2001.length() == 0 || strM20012.length() == 0 || strM20013.length() == 0) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-190983883621230L));
                } else {
                    AbstractC2071.m3959(AbstractC2797.m4924(), null, new C0360(strM2001, strM20012, strM20013, null, 0), 3);
                }
                break;
        }
    }
}

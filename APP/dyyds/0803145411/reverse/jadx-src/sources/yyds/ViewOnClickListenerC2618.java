package yyds;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.io.File;

/* JADX INFO: renamed from: yyds.ᲈᛳᛲᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2618 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f12871;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    private final void m4723(View view) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final int i = 3;
        switch (this.f12871) {
            case 0:
                EnumC1074 enumC1074 = EnumC1074.f4957;
                Activity topActivity = ActivityStack.getTopActivity();
                if (topActivity != null) {
                    int i2 = enumC1074 != EnumC1074.f4956 ? 6612 : 6611;
                    Intent intent = new Intent(AbstractC2328.m4341(-151934040965998L));
                    intent.addCategory(AbstractC2328.m4341(-152088659788654L));
                    intent.setType(AbstractC2328.m4341(-152230393709422L));
                    try {
                        topActivity.startActivityForResult(intent, i2);
                    } catch (Exception e) {
                        AbstractC1960.m3789(AbstractC2328.m4341(-152247573578606L));
                        C2336.f11496.m4358(AbstractC2328.m4341(-152290523251566L), e);
                        return;
                    }
                    break;
                }
                break;
            case 1:
                EnumC1074 enumC10742 = EnumC1074.f4956;
                Activity topActivity2 = ActivityStack.getTopActivity();
                if (topActivity2 != null) {
                    Intent intent2 = new Intent(AbstractC2328.m4341(-151934040965998L));
                    intent2.addCategory(AbstractC2328.m4341(-152088659788654L));
                    intent2.setType(AbstractC2328.m4341(-152230393709422L));
                    try {
                        topActivity2.startActivityForResult(intent2, 6611);
                    } catch (Exception e2) {
                        AbstractC1960.m3789(AbstractC2328.m4341(-152247573578606L));
                        C2336.f11496.m4358(AbstractC2328.m4341(-152290523251566L), e2);
                        return;
                    }
                    break;
                }
                break;
            case 2:
                try {
                    C2336.f11496.m4354(AbstractC2328.m4341(-956347055768430L) + AbstractC0606.f2938);
                    File externalFilesDir = view.getContext().getExternalFilesDir(Environment.DIRECTORY_MUSIC);
                    Context context = view.getContext();
                    AbstractC2328.m4341(-956407185310574L);
                    String absolutePath = externalFilesDir.getAbsolutePath();
                    AbstractC2328.m4341(-956475904787310L);
                    C1985.m3846(context, absolutePath, AbstractC2328.m4341(-956566099100526L), new C1936(1));
                } catch (Exception e3) {
                    C2336.f11496.m4354(AbstractC2328.m4341(-956587573937006L) + e3);
                    AbstractC1960.m3791(AbstractC2328.m4341(-956664883348334L) + e3.getMessage());
                    return;
                }
                break;
            case 3:
                Activity topActivity3 = ActivityStack.getTopActivity();
                if (topActivity3 != null) {
                    Intent intent3 = new Intent(AbstractC2328.m4341(-170166177137518L));
                    intent3.setType(AbstractC2328.m4341(-170312206025582L));
                    intent3.addCategory(AbstractC2328.m4341(-170346565763950L));
                    try {
                        topActivity3.startActivityForResult(Intent.createChooser(intent3, AbstractC2328.m4341(-170488299684718L)), 6610);
                    } catch (Exception e4) {
                        AbstractC1960.m3789(AbstractC2328.m4341(-170518364455790L));
                        C2336.f11496.m4358(AbstractC2328.m4341(-170561314128750L), e4);
                        return;
                    }
                    break;
                }
                break;
            case 4:
                try {
                    File externalFilesDir2 = view.getContext().getExternalFilesDir(Environment.DIRECTORY_MUSIC);
                    Context context2 = view.getContext();
                    AbstractC2328.m4341(-864396100928366L);
                    String absolutePath2 = externalFilesDir2.getAbsolutePath();
                    AbstractC2328.m4341(-864464820405102L);
                    C1985.m3846(context2, absolutePath2, AbstractC2328.m4341(-864555014718318L), new C1936(3));
                } catch (Exception e5) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-864576489554798L) + e5, e5);
                    AbstractC1960.m3791(AbstractC2328.m4341(-864653798966126L) + e5.getMessage());
                    return;
                }
                break;
            case 5:
                break;
            case 6:
                AbstractC2328.m4341(-157109476557678L);
                final C0172 c0172 = new C0172();
                C0763 c0763 = new C0763();
                c0763.f3518 = AbstractC2328.m4341(-157143836296046L);
                c0763.mo1719();
                c0763.f3522 = new C2344(c0172, 1);
                c0763.mo1719();
                c0763.mo1714(AbstractC2328.m4341(-157165311132526L), new InterfaceC1376() { // from class: yyds.ᲁᲀᲀᲈ
                    @Override // yyds.InterfaceC1376
                    /* JADX INFO: renamed from: ᛲᲈᲁ */
                    public final boolean mo912(AbstractC0041 abstractC0041) {
                        int i3 = i;
                        Object obj = c0172;
                        switch (i3) {
                            case 0:
                                C2701.f13261.getClass();
                                C2701.m4792((C1829) obj);
                                break;
                            case 1:
                                C2701.f13261.getClass();
                                C2701.m4792((C1829) obj);
                                break;
                            case 2:
                                C2701.f13261.getClass();
                                C2701.m4792((C1829) obj);
                                break;
                            default:
                                C0172 c01722 = (C0172) obj;
                                String string = ((C1676) c01722.f997).f8549.getText().toString();
                                String string2 = ((C1676) c01722.f997).f8550.getText().toString();
                                C1509 c1509 = C1509.f7142;
                                Integer numM1693 = AbstractC0733.m1693(string2);
                                int iIntValue = numM1693 != null ? numM1693.intValue() : 0;
                                c1509.getClass();
                                C0668 c0668 = C1509.f7130;
                                InterfaceC1989[] interfaceC1989Arr = C1509.f7179;
                                c0668.m1581(interfaceC1989Arr[97], Integer.valueOf(iIntValue));
                                Integer numM16932 = AbstractC0733.m1693(((C1676) c01722.f997).f8546.getText().toString());
                                C1509.f7302.m1581(interfaceC1989Arr[98], Integer.valueOf(numM16932 != null ? numM16932.intValue() : 0));
                                Integer numM16933 = AbstractC0733.m1693(((C1676) c01722.f997).f8551.getText().toString());
                                C1509.f7140.m1581(interfaceC1989Arr[99], Integer.valueOf(numM16933 != null ? numM16933.intValue() : 0));
                                Integer numM16934 = AbstractC0733.m1693(((C1676) c01722.f997).f8547.getText().toString());
                                C1509.f7100.m1581(interfaceC1989Arr[100], Integer.valueOf(numM16934 != null ? numM16934.intValue() : 0));
                                Integer numM16935 = AbstractC0733.m1693(((C1676) c01722.f997).f8548.getText().toString());
                                C1509.f7272.m1581(interfaceC1989Arr[101], Integer.valueOf(numM16935 != null ? numM16935.intValue() : 0));
                                AbstractC2328.m4341(-26843118469998L);
                                C1509.f7143.m1581(interfaceC1989Arr[96], string);
                                AbstractC1960.m3789(AbstractC2328.m4341(-157191080936302L));
                                break;
                        }
                        return false;
                    }
                });
                c0763.mo1713(AbstractC2328.m4341(-157178196034414L));
                c0763.m1717();
                break;
            case 7:
                C0050 c0050 = C0050.f545;
                C0050.m373();
                break;
            case 8:
                C0050 c00502 = C0050.f545;
                C0050.m373();
                break;
            default:
                Dialog dialog = C0135.f835;
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC2618(int i) {
        this.f12871 = i;
    }
}

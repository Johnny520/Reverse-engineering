package yyds;

import android.media.MediaPlayer;
import android.widget.EditText;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛸᛶᛲᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1790 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f9033;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0184 f9034;

    public /* synthetic */ C1790(C0184 c0184, int i) {
        this.f9033 = i;
        this.f9034 = c0184;
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        MediaPlayer mediaPlayer;
        C2355 c2355;
        int i = this.f9033;
        C2746 c2746 = C2746.f13459;
        C0184 c0184 = this.f9034;
        switch (i) {
            case 0:
                C2467 c2467 = (C2467) obj;
                AbstractC2328.m4341(-128960260899694L);
                AbstractC2328.m4341(-129011800507246L);
                C2336 c2336 = C2336.f11496;
                StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-129067635082094L));
                String str = c2467.f12184;
                AbstractC0897.m2002(sb, str, -129106289787758L);
                String str2 = c2467.f12182;
                sb.append(str2);
                c2336.m4354(sb.toString());
                Iterator it = c0184.f1051.iterator();
                int i2 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (AbstractC1544.m3188(((C2302) it.next()).f11306, c2467.f12186)) {
                            iIndexOf = i2;
                        } else {
                            i2++;
                        }
                    }
                }
                if (iIndexOf >= 0) {
                    c0184.f1059.setSelection(iIndexOf);
                }
                c0184.f1082.setText(str);
                File file = new File(str2);
                C2336 c23362 = C2336.f11496;
                StringBuilder sb2 = new StringBuilder(AbstractC2328.m4341(-129136354558830L));
                sb2.append(file.exists());
                sb2.append(AbstractC2328.m4341(-129183599199086L));
                sb2.append(file.exists() ? file.length() : 0L);
                sb2.append(AbstractC2328.m4341(-129213663970158L));
                c23362.m4354(sb2.toString());
                if (!file.exists()) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-129243728741230L) + file.getName());
                    c23362.m4354(AbstractC2328.m4341(-129295268348782L) + file.getAbsolutePath());
                } else {
                    c0184.f1049 = file;
                    c0184.f1060.setVisibility(8);
                    c0184.f1078.setVisibility(8);
                    c0184.f1058.setVisibility(0);
                    c0184.m765(file);
                }
                break;
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                File file2 = (File) obj2;
                C2336 c23363 = C2336.f11496;
                c23363.m4354(AbstractC2328.m4341(-128363260445550L) + iIntValue + AbstractC2328.m4341(-128453454758766L) + file2.getAbsolutePath());
                int i3 = 1;
                if (c0184.f1053 == iIntValue && (mediaPlayer = c0184.f1062) != null && mediaPlayer.isPlaying()) {
                    c23363.m4354(AbstractC2328.m4341(-128483519529838L));
                    c0184.m763();
                    C2355 c23552 = c0184.f1047;
                    if (c23552 != null) {
                        c23552.m4378(-1);
                    }
                } else {
                    c0184.m763();
                    C2615.f12860.getClass();
                    C2615.m4695();
                    try {
                        c23363.m4354(AbstractC2328.m4341(-128504994366318L) + file2.getAbsolutePath());
                        MediaPlayer mediaPlayer2 = new MediaPlayer();
                        mediaPlayer2.setDataSource(file2.getAbsolutePath());
                        mediaPlayer2.prepare();
                        mediaPlayer2.start();
                        mediaPlayer2.setOnCompletionListener(new C2575(i3, c0184));
                        c0184.f1062 = mediaPlayer2;
                        c0184.f1053 = iIntValue;
                        C2355 c23553 = c0184.f1047;
                        if (c23553 != null) {
                            c23553.m4378(iIntValue);
                        }
                    } catch (Exception e) {
                        C2336.f11496.m4358(AbstractC2328.m4341(-128535059137390L) + e.getMessage(), e);
                        e.printStackTrace();
                    }
                }
                break;
            default:
                ((Integer) obj).getClass();
                C2522 c2522 = (C2522) obj2;
                if (!c2522.f12446) {
                    C2355 c23554 = c0184.f1047;
                    iIndexOf = c23554 != null ? c23554.f11570.indexOf(c2522) : -1;
                    if (iIndexOf >= 0 && (c2355 = c0184.f1047) != null) {
                        ArrayList arrayList = c2355.f11570;
                        int i4 = c2355.f11571;
                        c2355.f11571 = iIndexOf;
                        c2355.f11567 = (iIndexOf < 0 || iIndexOf >= arrayList.size() || ((C2522) arrayList.get(iIndexOf)).f12446) ? null : ((C2522) arrayList.get(iIndexOf)).f12445;
                        if (i4 >= 0 && i4 < arrayList.size()) {
                            c2355.m1059(i4);
                        }
                        if (iIndexOf >= 0 && iIndexOf < arrayList.size()) {
                            c2355.m1059(iIndexOf);
                        }
                    }
                } else {
                    String absolutePath = c2522.f12445.getAbsolutePath();
                    c0184.m768(absolutePath);
                    C1509.f7142.getClass();
                    AbstractC2328.m4341(-28848868197230L);
                    C1509.f7101.m1581(C1509.f7179[201], absolutePath);
                    EditText editText = c0184.f1050;
                    if (editText != null) {
                        editText.setText(AbstractC2328.m4341(-128071202669422L));
                    }
                }
                break;
        }
        return c2746;
        return c2746;
    }
}

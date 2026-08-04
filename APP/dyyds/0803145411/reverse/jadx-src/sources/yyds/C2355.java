package yyds;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: yyds.ᲁᲇᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2355 extends AbstractC0359 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public File f11567;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final ConcurrentHashMap f11568;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C1790 f11569;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final ArrayList f11570;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f11571;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final C2454 f11572;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f11573;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f11574;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1790 f11575;

    public C2355(ArrayList arrayList, String str, C1790 c1790, C1790 c17902) {
        AbstractC2328.m4341(-195283145884526L);
        AbstractC2328.m4341(-195308915688302L);
        AbstractC2328.m4341(-195381930132334L);
        AbstractC2328.m4341(-195433469739886L);
        this.f11570 = arrayList;
        this.f11573 = str;
        this.f11575 = c1790;
        this.f11569 = c17902;
        this.f11574 = -1;
        this.f11571 = -1;
        this.f11568 = new ConcurrentHashMap();
        C1206 c1206 = AbstractC0221.f1238;
        C1158 c1158 = AbstractC1353.f6250;
        C1455 c1455M3297 = AbstractC0024.m3297();
        c1158.getClass();
        this.f11572 = AbstractC1917.m3696(AbstractC0879.m1960(c1158, c1455M3297));
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void m4378(int i) {
        int i2 = this.f11574;
        this.f11574 = i;
        ArrayList arrayList = this.f11570;
        if (i2 >= 0 && i2 < arrayList.size()) {
            m1059(i2);
        }
        if (i < 0 || i >= arrayList.size()) {
            return;
        }
        m1059(i);
    }

    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo472(AbstractC0185 abstractC0185, int i) {
        String strM1988;
        C2355 c2355;
        int i2;
        C0144 c0144 = (C0144) abstractC0185;
        AbstractC2328.m4341(-195588088562542L);
        ImageView imageView = c0144.f888;
        TextView textView = c0144.f885;
        TextView textView2 = c0144.f883;
        TextView textView3 = c0144.f886;
        FrameLayout frameLayout = c0144.f884;
        C2522 c2522 = (C2522) this.f11570.get(i);
        File file = c2522.f12445;
        if (c2522.f12446) {
            File file2 = new File(this.f11573);
            String absolutePath = file.getAbsolutePath();
            File parentFile = file2.getParentFile();
            if (AbstractC1544.m3188(absolutePath, parentFile != null ? parentFile.getAbsolutePath() : null)) {
                textView3.setText(AbstractC2328.m4341(-195618153333614L));
            } else {
                textView3.setText(AbstractC2328.m4341(-195656808039278L) + file.getName());
            }
            textView2.setText(AbstractC2328.m4341(-195673987908462L));
            textView.setText(AbstractC2328.m4341(-195691167777646L));
            frameLayout.setVisibility(8);
            imageView.setVisibility(4);
            c2355 = this;
        } else {
            textView3.setText(file.getName());
            long length = file.length();
            DecimalFormat decimalFormat = new DecimalFormat(AbstractC2328.m4341(-195721232548718L));
            if (length < 1024) {
                strM1988 = length + AbstractC2328.m4341(-195742707385198L);
            } else {
                strM1988 = length < 1048576 ? AbstractC0897.m1988(new StringBuilder(), decimalFormat.format(length / 1024.0d), -195755592287086L) : length < 1073741824 ? AbstractC0897.m1988(new StringBuilder(), decimalFormat.format(length / 1048576.0d), -195772772156270L) : AbstractC0897.m1988(new StringBuilder(), decimalFormat.format(length / 1.073741824E9d), -195789952025454L);
            }
            textView2.setText(strM1988);
            String str = (String) this.f11568.get(file.getAbsolutePath());
            if (str != null) {
                textView.setText(str);
                c2355 = this;
                i2 = i;
            } else {
                textView.setText(AbstractC2328.m4341(-195695462744942L));
                c2355 = this;
                i2 = i;
                AbstractC2071.m3959(c2355.f11572, null, new C1112(c2355, file, c0144, i2, (InterfaceC0274) null), 3);
            }
            c0144.f887.setImageResource(i2 == c2355.f11574 ? R.drawable.pause : R.drawable.play);
            imageView.setVisibility(i2 == c2355.f11571 ? 0 : 4);
            frameLayout.setVisibility(0);
            frameLayout.setOnClickListener(new ViewOnClickListenerC0867(i2, c0144, c2355));
        }
        c0144.f1093.setOnClickListener(new ViewOnClickListenerC1374(c0144, 2, c2355));
    }

    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final int mo531() {
        return this.f11570.size();
    }

    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final AbstractC0185 mo473(ViewGroup viewGroup, int i) {
        AbstractC2328.m4341(-195558023791470L);
        C2701 c2701 = C2701.f13261;
        Context context = viewGroup.getContext();
        c2701.getClass();
        C2701.m4807(context);
        return new C0144(AbstractC1115.m2309(viewGroup.getContext()).inflate(R.layout.item_audio_file, viewGroup, false));
    }
}

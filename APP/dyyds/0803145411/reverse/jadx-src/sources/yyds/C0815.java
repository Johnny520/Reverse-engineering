package yyds;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bumptech.glide.ComponentCallbacks2C0040;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.p000ss.android.ugc.aweme.yyds.R;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: yyds.ᛴᛳᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0815 extends AbstractC1865 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f3740;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f3741;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f3742 = 2;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f3743;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0815(ScrollView scrollView, Comment comment, Context context, LinearLayout linearLayout) {
        super(scrollView);
        this.f3740 = comment;
        this.f3741 = context;
        this.f3743 = linearLayout;
    }

    @Override // yyds.AbstractC1865
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo890(AbstractC0041 abstractC0041, View view) {
        int i = this.f3742;
        Object obj = this.f3743;
        Object obj2 = this.f3740;
        Object obj3 = this.f3741;
        switch (i) {
            case 0:
                AbstractC2328.m4341(-130515039060846L);
                AbstractC2328.m4341(-130545103831918L);
                Comment comment = (Comment) obj2;
                List<CommentImageStruct> list = comment.imageList;
                AbstractC2328.m4341(-130566578668398L);
                Context context = (Context) obj3;
                LinearLayout linearLayout = (LinearLayout) obj;
                for (CommentImageStruct commentImageStruct : list) {
                    C2701 c2701 = C2701.f13261;
                    String strM4341 = AbstractC2328.m4341(-193204381713262L);
                    c2701.getClass();
                    Object objM4795 = C2701.m4795(C2701.m4795(commentImageStruct, strM4341), AbstractC2328.m4341(-193251626353518L));
                    List list2 = objM4795 instanceof List ? (List) objM4795 : null;
                    String str = list2 != null ? (String) AbstractC1595.m3280(list2) : null;
                    View viewInflate = LayoutInflater.from(context).inflate(R.layout.comment_item_image_entry, (ViewGroup) linearLayout, false);
                    ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_media);
                    Button button = (Button) viewInflate.findViewById(R.id.btn_save_gif);
                    Button button2 = (Button) viewInflate.findViewById(R.id.btn_save_video);
                    ((Button) viewInflate.findViewById(R.id.btn_save_image)).setOnClickListener(new ViewOnClickListenerC2488(context, str, 0));
                    ((C0472) ComponentCallbacks2C0040.m250(context).m2500(context).m4277(str).m1786(C2340.f11504)).m1283(imageView);
                    linearLayout.addView(viewInflate);
                    Object objM47952 = C2701.m4795(commentImageStruct, AbstractC2328.m4341(-193290281059182L));
                    Object objM47953 = C2701.m4795(objM47952, AbstractC2328.m4341(-193337525699438L));
                    List list3 = objM47953 instanceof List ? (List) objM47953 : null;
                    if (objM47952 != null && list3 != null && !list3.isEmpty()) {
                        button.setVisibility(0);
                        button2.setVisibility(0);
                        String str2 = (String) AbstractC1595.m3280(list3);
                        button.setOnClickListener(new ViewOnClickListenerC1192(context, str, str2, 6));
                        button2.setOnClickListener(new ViewOnClickListenerC1192(comment, context, str2, 7));
                    }
                }
                break;
            case 1:
                AbstractC2328.m4341(-193715482821486L);
                AbstractC2328.m4341(-193745547592558L);
                C2701.f13261.getClass();
                C2701.m4793(view);
                if (((AtomicBoolean) obj2).compareAndSet(false, true)) {
                    C0561 c0561 = C0561.f2672;
                    AbstractC2328.m4341(-544429627310958L);
                    C0561.f2669.add((C2713) obj3);
                }
                EnumMap enumMap = (EnumMap) obj;
                Iterator it = EnumC0868.f3974.iterator();
                while (true) {
                    C0437 c0437 = (C0437) it;
                    if (c0437.hasNext()) {
                        C0135.m600(enumMap, (EnumC0868) c0437.next());
                    }
                    break;
                }
                break;
            default:
                AbstractC2328.m4341(-226133895971694L);
                AbstractC2328.m4341(-226189730546542L);
                Context context2 = (Context) obj3;
                FrameLayout frameLayout = (FrameLayout) obj2;
                frameLayout.animate().alpha(0.0f).setDuration(200L).withEndAction(new RunnableC2696(frameLayout, 10, context2)).start();
                TextView textView = (TextView) obj;
                textView.setOnClickListener(new ViewOnClickListenerC1192(context2, textView, frameLayout, 19));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0815(AtomicBoolean atomicBoolean, C2713 c2713, EnumMap enumMap, ScrollView scrollView) {
        super(scrollView);
        this.f3740 = atomicBoolean;
        this.f3741 = c2713;
        this.f3743 = enumMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0815(LinearLayout linearLayout, Context context, FrameLayout frameLayout, TextView textView) {
        super(linearLayout);
        this.f3741 = context;
        this.f3740 = frameLayout;
        this.f3743 = textView;
    }
}

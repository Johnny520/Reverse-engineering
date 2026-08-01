package p000;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: c2 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0035c2 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f81a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f82b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f83c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f84d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0035c2(RunnableC0177d2 runnableC0177d2, C0540y c0540y, ArrayList arrayList) {
        this.f81a = 0;
        this.f84d = runnableC0177d2;
        this.f82b = c0540y;
        this.f83c = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 1;
        switch (this.f81a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f83c;
                RunnableC0177d2 runnableC0177d2 = (RunnableC0177d2) this.f84d;
                C0193e2 c0193e2 = (C0193e2) runnableC0177d2.f187c;
                if (c0193e2.f214a.isShowing() && runnableC0177d2.f186b == c0193e2.f223j) {
                    ArrayList arrayList2 = (ArrayList) ((C0540y) this.f82b).f1082b;
                    Set set = AbstractC0225g2.f291a;
                    c0193e2.f219f.removeAllViews();
                    AbstractC0225g2.m418d(c0193e2, "全部", "");
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        C0291k1 c0291k1 = (C0291k1) arrayList2.get(i2);
                        AbstractC0225g2.m418d(c0193e2, c0291k1.f486b, c0291k1.f485a);
                    }
                    c0193e2.f220g.setText(arrayList.isEmpty() ? "暂无审核通过的表情" : String.format(Locale.CHINA, "共 %d 个，点击发送，长按预览", Integer.valueOf(arrayList.size())));
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        Activity activity = c0193e2.f215b;
                        C0307l1 c0307l1 = (C0307l1) arrayList.get(i3);
                        LinearLayout linearLayout = new LinearLayout(activity);
                        linearLayout.setOrientation(1);
                        linearLayout.setGravity(1);
                        linearLayout.setPadding(AbstractC0225g2.m421g(activity, 2.0f), AbstractC0225g2.m421g(activity, 3.0f), AbstractC0225g2.m421g(activity, 2.0f), AbstractC0225g2.m421g(activity, 5.0f));
                        ImageView imageView = new ImageView(activity);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        imageView.setBackground(AbstractC0225g2.m428n(Color.rgb(244, 245, 248), AbstractC0225g2.m421g(activity, 8.0f), 0, 0));
                        int iM421g = AbstractC0225g2.m421g(activity, 54.0f);
                        linearLayout.addView(imageView, new LinearLayout.LayoutParams(iM421g, iM421g));
                        if (!c0307l1.f508b.isEmpty()) {
                            TextView textViewM431q = AbstractC0225g2.m431q(activity, c0307l1.f508b, 12, Color.rgb(80, 84, 93));
                            textViewM431q.setSingleLine(true);
                            textViewM431q.setGravity(17);
                            linearLayout.addView(textViewM431q, new LinearLayout.LayoutParams(-1, AbstractC0225g2.m421g(activity, 20.0f)));
                        }
                        GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
                        layoutParams.width = AbstractC0225g2.m421g(activity, 66.0f);
                        layoutParams.height = -2;
                        layoutParams.rowSpec = GridLayout.spec(i3 / 5);
                        layoutParams.columnSpec = GridLayout.spec(i3 % 5);
                        c0193e2.f218e.addView(linearLayout, layoutParams);
                        linearLayout.setOnClickListener(new ViewOnClickListenerC0019b2(c0193e2, c0307l1, i));
                        linearLayout.setOnLongClickListener(new ViewOnLongClickListenerC0003a2(c0193e2, c0307l1, i));
                        Bitmap bitmap = (Bitmap) AbstractC0225g2.f295e.get(c0307l1.f507a);
                        if (bitmap == null || bitmap.isRecycled()) {
                            AbstractC0225g2.f293c.execute(new RunnableC0177d2(c0307l1, iM421g, c0193e2, imageView));
                        } else {
                            imageView.setImageBitmap(bitmap);
                        }
                    }
                    break;
                }
                break;
            case 1:
                C0227g4 c0227g4 = AbstractC0278j4.f463e;
                C0227g4 c0227g42 = (C0227g4) this.f82b;
                if (c0227g4 == c0227g42) {
                    AbstractC0278j4.m712d(c0227g42);
                    if (((C0259i4) this.f83c).f379f == null) {
                        AbstractC0278j4.f461c.remove((String) this.f84d);
                        EditText editText = ((C0259i4) this.f83c).f376c;
                        String str = (String) this.f84d;
                        if (str.length() != 0) {
                            editText.post(new RunnableC0412q(editText, str, 5));
                        }
                        AbstractC0278j4.m729u("favorite emoticon batch official send not captured token=" + ((String) this.f84d) + " object=" + AbstractC0278j4.m718j(((C0259i4) this.f83c).f375b));
                    }
                    break;
                }
                break;
            default:
                try {
                    boolean[] zArr = (boolean[]) this.f82b;
                    ((C0515w6) this.f83c).m1122b();
                    zArr[0] = true;
                    break;
                } catch (Throwable unused) {
                }
                ((CountDownLatch) this.f84d).countDown();
                break;
        }
    }

    public /* synthetic */ RunnableC0035c2(Object obj, Object obj2, Object obj3, int i) {
        this.f81a = i;
        this.f82b = obj;
        this.f83c = obj2;
        this.f84d = obj3;
    }
}

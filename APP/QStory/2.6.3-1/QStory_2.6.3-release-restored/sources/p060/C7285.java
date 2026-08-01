package p060;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.appcompat.app.RunnableC0909;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: renamed from: 飘花落叶言世哲苏楪兰子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7285 extends View {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ArrayList f18038;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f18039;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f18040;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final RunnableC0909 f18041;

    public C7285(Activity activity) {
        super(activity);
        this.f18041 = new RunnableC0909(this, 17);
        this.f18038 = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f18038;
        if (arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C7287 c7287 = (C7287) arrayList.get(i);
                Random random = c7287.f18057;
                c7287.f18045 = (float) ((Math.sin(c7287.f18052) * 10.0d) + ((double) c7287.f18045));
                boolean z = c7287.f18050;
                if (z) {
                    c7287.f18052 = (float) ((Math.random() * ((double) (random.nextBoolean() ? -1 : 1)) * 0.0025d) + ((double) c7287.f18052));
                }
                float f = c7287.f18054 + c7287.f18046;
                c7287.f18054 = f;
                if (f > c7287.f18055 || c7287.f18045 < (-c7287.f18051.getWidth())) {
                    c7287.f18054 = -c7287.f18056;
                    c7287.m12546();
                    int i2 = c7287.f18048;
                    if (z) {
                        c7287.f18052 = (float) (((Math.random() * ((double) (random.nextBoolean() ? -1 : 1))) * ((double) i2)) / 50.0d);
                    } else {
                        c7287.f18052 = i2 / 50.0f;
                    }
                    float f2 = c7287.f18052;
                    if (f2 > 1.5707964f) {
                        c7287.f18052 = 1.5707964f;
                    } else if (f2 < -1.5707964f) {
                        c7287.f18052 = -1.5707964f;
                    }
                } else if (c7287.f18045 > c7287.f18051.getWidth() + c7287.f18058) {
                }
                canvas.drawBitmap(c7287.f18051, c7287.f18045, c7287.f18054, (Paint) null);
            }
            getHandler().postDelayed(this.f18041, 10L);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(DescriptorProtos$Edition.EDITION_2023_VALUE, size) : 1000;
        }
        int mode2 = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(600, size2) : 600;
        }
        setMeasuredDimension(size2, size);
        this.f18039 = size2;
        this.f18040 = size;
    }
}

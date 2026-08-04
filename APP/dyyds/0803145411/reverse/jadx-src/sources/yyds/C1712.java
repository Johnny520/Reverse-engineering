package yyds;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛸᛲᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1712 extends AbstractC1865 {

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8653;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1712(View view, int i) {
        super(view);
        this.f8653 = i;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final void m3454(TextView textView, boolean z) {
        if (z) {
            textView.setText(AbstractC2328.m4341(-155138086568814L));
            textView.setTextColor(textView.getContext().getColor(R.color.douyin_primary));
            textView.setBackgroundResource(R.drawable.bg_current_badge);
        } else {
            textView.setText(AbstractC2328.m4341(-155155266437998L));
            textView.setTextColor(textView.getContext().getColor(R.color.secondary_text));
            textView.setBackgroundResource(R.drawable.bg_chat_status_badge_neutral);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3455(TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        Object c2658;
        final Bitmap bitmapDecodeByteArray;
        long j;
        byte b;
        byte b2;
        int i;
        long j2;
        Drawable c2647;
        Pair pairM1237;
        int iIntValue;
        int i2;
        Object c26582;
        final Bitmap bitmapDecodeByteArray2;
        Drawable c26472;
        Pair pairM12372;
        Pair pairM12373;
        int iIntValue2;
        int iIntValue3;
        int[] iArr;
        final int i3 = 0;
        final int i4 = 1;
        m3454(textView, !AbstractC0473.m1313(AbstractC0449.m1238(false)));
        m3454(textView2, !AbstractC0473.m1313(AbstractC0449.m1238(true)));
        AbstractC2328.m4341(-521984128222062L);
        if (textView3.getTag(R.id.chat_bubble_original_bg_tag) == null) {
            textView3.setTag(R.id.chat_bubble_original_bg_tag, textView3.getBackground());
        }
        if (textView3.getTag(R.id.chat_bubble_original_padding_tag) == null) {
            textView3.setTag(R.id.chat_bubble_original_padding_tag, new int[]{textView3.getPaddingLeft(), textView3.getPaddingTop(), textView3.getPaddingRight(), textView3.getPaddingBottom()});
        }
        Resources resources = textView3.getResources();
        AbstractC2328.m4341(-522022782927726L);
        String strM1238 = AbstractC0449.m1238(false);
        if (AbstractC0473.m1313(strM1238)) {
            j = -521984128222062L;
            b = 9;
            b2 = 2;
            i = 3;
            j2 = -522022782927726L;
            c2647 = null;
        } else {
            try {
                c2658 = Base64.decode(strM1238, 2);
            } catch (Throwable th) {
                c2658 = new C2658(th);
            }
            if (c2658 instanceof C2658) {
                c2658 = null;
            }
            byte[] bArr = (byte[]) c2658;
            if (bArr != null && (bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                if (bitmapDecodeByteArray.getWidth() < 3 || bitmapDecodeByteArray.getHeight() < 3) {
                    j = -521984128222062L;
                    b = 9;
                    b2 = 2;
                    i = 3;
                    j2 = -522022782927726L;
                    c2647 = new C2647(bitmapDecodeByteArray);
                } else {
                    Pair pairM12374 = AbstractC0449.m1237(bitmapDecodeByteArray, true);
                    if (pairM12374 == null || (pairM1237 = AbstractC0449.m1237(bitmapDecodeByteArray, false)) == null) {
                        c2647 = new C2647(bitmapDecodeByteArray);
                        j = -521984128222062L;
                        b = 9;
                        b2 = 2;
                        i = 3;
                        j2 = -522022782927726L;
                    } else {
                        j = -521984128222062L;
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 1, 1, bitmapDecodeByteArray.getWidth() - 2, bitmapDecodeByteArray.getHeight() - 2);
                        AbstractC2328.m4341(-522568243774318L);
                        int width = bitmapCreateBitmap.getWidth();
                        int height = bitmapCreateBitmap.getHeight();
                        j2 = -522022782927726L;
                        Pair pairM1236 = AbstractC0449.m1236(bitmapDecodeByteArray.getWidth() - 1, new InterfaceC1549() { // from class: yyds.ᛶᛶᲁᲁ
                            @Override // yyds.InterfaceC1549
                            /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
                            public final Object mo371(Object obj) {
                                int pixel;
                                int i5 = i3;
                                Bitmap bitmap = bitmapDecodeByteArray;
                                int iIntValue4 = ((Integer) obj).intValue();
                                switch (i5) {
                                    case 0:
                                        pixel = bitmap.getPixel(iIntValue4, bitmap.getHeight() - 1);
                                        break;
                                    default:
                                        pixel = bitmap.getPixel(bitmap.getWidth() - 1, iIntValue4);
                                        break;
                                }
                                return Integer.valueOf(pixel);
                            }
                        });
                        Pair pairM12362 = AbstractC0449.m1236(bitmapDecodeByteArray.getHeight() - 1, new InterfaceC1549() { // from class: yyds.ᛶᛶᲁᲁ
                            @Override // yyds.InterfaceC1549
                            /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
                            public final Object mo371(Object obj) {
                                int pixel;
                                int i5 = i4;
                                Bitmap bitmap = bitmapDecodeByteArray;
                                int iIntValue4 = ((Integer) obj).intValue();
                                switch (i5) {
                                    case 0:
                                        pixel = bitmap.getPixel(iIntValue4, bitmap.getHeight() - 1);
                                        break;
                                    default:
                                        pixel = bitmap.getPixel(bitmap.getWidth() - 1, iIntValue4);
                                        break;
                                }
                                return Integer.valueOf(pixel);
                            }
                        });
                        int iIntValue4 = pairM1236 != null ? ((Number) pairM1236.getFirst()).intValue() : 0;
                        if (pairM1236 == null || (iIntValue = width - ((Number) pairM1236.getSecond()).intValue()) < 0) {
                            iIntValue = 0;
                        }
                        int iIntValue5 = pairM12362 != null ? ((Number) pairM12362.getFirst()).intValue() : 0;
                        if (pairM12362 != null) {
                            int iIntValue6 = height - ((Number) pairM12362.getSecond()).intValue();
                            if (iIntValue6 < 0) {
                                iIntValue6 = 0;
                            }
                            i2 = iIntValue6;
                        } else {
                            i2 = 0;
                        }
                        Rect rect = new Rect(iIntValue4, iIntValue5, iIntValue, i2);
                        int[] iArr2 = {((Number) pairM12374.getFirst()).intValue(), ((Number) pairM12374.getSecond()).intValue()};
                        int[] iArr3 = {((Number) pairM1237.getFirst()).intValue(), ((Number) pairM1237.getSecond()).intValue()};
                        ByteBuffer byteBufferOrder = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
                        byteBufferOrder.put((byte) 1);
                        byteBufferOrder.put((byte) 2);
                        byteBufferOrder.put((byte) 2);
                        byteBufferOrder.put((byte) 9);
                        byteBufferOrder.putInt(0);
                        byteBufferOrder.putInt(0);
                        byteBufferOrder.putInt(rect.left);
                        byteBufferOrder.putInt(rect.right);
                        byteBufferOrder.putInt(rect.top);
                        byteBufferOrder.putInt(rect.bottom);
                        byteBufferOrder.putInt(0);
                        for (int i5 = 0; i5 < 2; i5++) {
                            byteBufferOrder.putInt(iArr2[i5]);
                        }
                        for (int i6 = 0; i6 < 2; i6++) {
                            byteBufferOrder.putInt(iArr3[i6]);
                        }
                        for (int i7 = 0; i7 < 9; i7++) {
                            byteBufferOrder.putInt(1);
                        }
                        byte[] bArrArray = byteBufferOrder.array();
                        AbstractC2328.m4341(-522645553185646L);
                        if (NinePatch.isNinePatchChunk(bArrArray)) {
                            b = 9;
                            b2 = 2;
                            i = 3;
                            c2647 = new NinePatchDrawable(resources, bitmapCreateBitmap, bArrArray, rect, null);
                        } else {
                            b = 9;
                            b2 = 2;
                            i = 3;
                            c2647 = new C2647(bitmapCreateBitmap);
                        }
                    }
                }
            }
        }
        if (c2647 == null) {
            Object tag = textView3.getTag(R.id.chat_bubble_original_bg_tag);
            textView3.setBackground(tag instanceof Drawable ? (Drawable) tag : null);
            Object tag2 = textView3.getTag(R.id.chat_bubble_original_padding_tag);
            int[] iArr4 = tag2 instanceof int[] ? (int[]) tag2 : null;
            if (iArr4 != null) {
                textView3.setPadding(iArr4[0], iArr4[1], iArr4[b2], iArr4[i]);
            }
        } else {
            Object tag3 = textView3.getTag(R.id.chat_bubble_original_padding_tag);
            int[] iArr5 = tag3 instanceof int[] ? (int[]) tag3 : null;
            if (iArr5 == null) {
                iArr5 = new int[4];
                iArr5[0] = textView3.getPaddingLeft();
                iArr5[1] = textView3.getPaddingTop();
                iArr5[b2] = textView3.getPaddingRight();
                iArr5[i] = textView3.getPaddingBottom();
            }
            Rect rect2 = new Rect();
            c2647.getPadding(rect2);
            textView3.setBackground(c2647);
            int i8 = rect2.left;
            if (i8 <= 0) {
                i8 = iArr5[0];
            }
            int i9 = rect2.top;
            if (i9 <= 0) {
                i9 = iArr5[1];
            }
            int i10 = rect2.right;
            if (i10 <= 0) {
                i10 = iArr5[b2];
            }
            int i11 = rect2.bottom;
            if (i11 <= 0) {
                i11 = iArr5[i];
            }
            textView3.setPadding(i8, i9, i10, i11);
        }
        AbstractC2328.m4341(j);
        if (textView4.getTag(R.id.chat_bubble_original_bg_tag) == null) {
            textView4.setTag(R.id.chat_bubble_original_bg_tag, textView4.getBackground());
        }
        if (textView4.getTag(R.id.chat_bubble_original_padding_tag) == null) {
            textView4.setTag(R.id.chat_bubble_original_padding_tag, new int[]{textView4.getPaddingLeft(), textView4.getPaddingTop(), textView4.getPaddingRight(), textView4.getPaddingBottom()});
        }
        Resources resources2 = textView4.getResources();
        AbstractC2328.m4341(j2);
        String strM12382 = AbstractC0449.m1238(true);
        if (AbstractC0473.m1313(strM12382)) {
            c26472 = null;
        } else {
            try {
                c26582 = Base64.decode(strM12382, b2);
            } catch (Throwable th2) {
                c26582 = new C2658(th2);
            }
            if (c26582 instanceof C2658) {
                c26582 = null;
            }
            byte[] bArr2 = (byte[]) c26582;
            if (bArr2 != null && (bitmapDecodeByteArray2 = BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length)) != null) {
                if (bitmapDecodeByteArray2.getWidth() < i || bitmapDecodeByteArray2.getHeight() < i || (pairM12372 = AbstractC0449.m1237(bitmapDecodeByteArray2, true)) == null || (pairM12373 = AbstractC0449.m1237(bitmapDecodeByteArray2, false)) == null) {
                    c26472 = new C2647(bitmapDecodeByteArray2);
                } else {
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapDecodeByteArray2, 1, 1, bitmapDecodeByteArray2.getWidth() - b2, bitmapDecodeByteArray2.getHeight() - b2);
                    AbstractC2328.m4341(-522568243774318L);
                    int width2 = bitmapCreateBitmap2.getWidth();
                    int height2 = bitmapCreateBitmap2.getHeight();
                    Pair pairM12363 = AbstractC0449.m1236(bitmapDecodeByteArray2.getWidth() - 1, new InterfaceC1549() { // from class: yyds.ᛶᛶᲁᲁ
                        @Override // yyds.InterfaceC1549
                        /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
                        public final Object mo371(Object obj) {
                            int pixel;
                            int i52 = i3;
                            Bitmap bitmap = bitmapDecodeByteArray2;
                            int iIntValue42 = ((Integer) obj).intValue();
                            switch (i52) {
                                case 0:
                                    pixel = bitmap.getPixel(iIntValue42, bitmap.getHeight() - 1);
                                    break;
                                default:
                                    pixel = bitmap.getPixel(bitmap.getWidth() - 1, iIntValue42);
                                    break;
                            }
                            return Integer.valueOf(pixel);
                        }
                    });
                    Pair pairM12364 = AbstractC0449.m1236(bitmapDecodeByteArray2.getHeight() - 1, new InterfaceC1549() { // from class: yyds.ᛶᛶᲁᲁ
                        @Override // yyds.InterfaceC1549
                        /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
                        public final Object mo371(Object obj) {
                            int pixel;
                            int i52 = i4;
                            Bitmap bitmap = bitmapDecodeByteArray2;
                            int iIntValue42 = ((Integer) obj).intValue();
                            switch (i52) {
                                case 0:
                                    pixel = bitmap.getPixel(iIntValue42, bitmap.getHeight() - 1);
                                    break;
                                default:
                                    pixel = bitmap.getPixel(bitmap.getWidth() - 1, iIntValue42);
                                    break;
                            }
                            return Integer.valueOf(pixel);
                        }
                    });
                    int iIntValue7 = pairM12363 != null ? ((Number) pairM12363.getFirst()).intValue() : 0;
                    if (pairM12363 == null || (iIntValue2 = width2 - ((Number) pairM12363.getSecond()).intValue()) < 0) {
                        iIntValue2 = 0;
                    }
                    int iIntValue8 = pairM12364 != null ? ((Number) pairM12364.getFirst()).intValue() : 0;
                    if (pairM12364 == null || (iIntValue3 = height2 - ((Number) pairM12364.getSecond()).intValue()) < 0) {
                        iIntValue3 = 0;
                    }
                    Rect rect3 = new Rect(iIntValue7, iIntValue8, iIntValue2, iIntValue3);
                    int[] iArr6 = {((Number) pairM12372.getFirst()).intValue(), ((Number) pairM12372.getSecond()).intValue()};
                    int[] iArr7 = {((Number) pairM12373.getFirst()).intValue(), ((Number) pairM12373.getSecond()).intValue()};
                    ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
                    byteBufferOrder2.put((byte) 1);
                    byteBufferOrder2.put(b2);
                    byteBufferOrder2.put(b2);
                    byteBufferOrder2.put(b);
                    byteBufferOrder2.putInt(0);
                    byteBufferOrder2.putInt(0);
                    byteBufferOrder2.putInt(rect3.left);
                    byteBufferOrder2.putInt(rect3.right);
                    byteBufferOrder2.putInt(rect3.top);
                    byteBufferOrder2.putInt(rect3.bottom);
                    byteBufferOrder2.putInt(0);
                    for (int i12 = 0; i12 < b2; i12++) {
                        byteBufferOrder2.putInt(iArr6[i12]);
                    }
                    for (int i13 = 0; i13 < b2; i13++) {
                        byteBufferOrder2.putInt(iArr7[i13]);
                    }
                    for (int i14 = 0; i14 < b; i14++) {
                        byteBufferOrder2.putInt(1);
                    }
                    byte[] bArrArray2 = byteBufferOrder2.array();
                    AbstractC2328.m4341(-522645553185646L);
                    c26472 = NinePatch.isNinePatchChunk(bArrArray2) ? new NinePatchDrawable(resources2, bitmapCreateBitmap2, bArrArray2, rect3, null) : new C2647(bitmapCreateBitmap2);
                }
            }
        }
        if (c26472 == null) {
            Object tag4 = textView4.getTag(R.id.chat_bubble_original_bg_tag);
            textView4.setBackground(tag4 instanceof Drawable ? (Drawable) tag4 : null);
            Object tag5 = textView4.getTag(R.id.chat_bubble_original_padding_tag);
            iArr = tag5 instanceof int[] ? (int[]) tag5 : null;
            if (iArr == null) {
                return;
            }
            textView4.setPadding(iArr[0], iArr[1], iArr[b2], iArr[i]);
            return;
        }
        Object tag6 = textView4.getTag(R.id.chat_bubble_original_padding_tag);
        iArr = tag6 instanceof int[] ? (int[]) tag6 : null;
        if (iArr == null) {
            int[] iArr8 = new int[4];
            iArr8[0] = textView4.getPaddingLeft();
            iArr8[1] = textView4.getPaddingTop();
            iArr8[b2] = textView4.getPaddingRight();
            iArr8[i] = textView4.getPaddingBottom();
            iArr = iArr8;
        }
        Rect rect4 = new Rect();
        c26472.getPadding(rect4);
        textView4.setBackground(c26472);
        int i15 = rect4.left;
        if (i15 <= 0) {
            i15 = iArr[0];
        }
        int i16 = rect4.top;
        if (i16 <= 0) {
            i16 = iArr[1];
        }
        int i17 = rect4.right;
        if (i17 <= 0) {
            i17 = iArr[b2];
        }
        int i18 = rect4.bottom;
        if (i18 <= 0) {
            i18 = iArr[i];
        }
        textView4.setPadding(i15, i16, i17, i18);
    }

    @Override // yyds.AbstractC1865
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo890(AbstractC0041 abstractC0041, View view) {
        switch (this.f8653) {
            case 0:
                AbstractC2328.m4341(-155099431863150L);
                AbstractC2328.m4341(-155129496634222L);
                final TextView textView = (TextView) view.findViewById(R.id.previewOtherBubble);
                final TextView textView2 = (TextView) view.findViewById(R.id.previewSelfBubble);
                final TextView textView3 = (TextView) view.findViewById(R.id.textOtherStatus);
                final TextView textView4 = (TextView) view.findViewById(R.id.textSelfStatus);
                Button button = (Button) view.findViewById(R.id.btnPickOtherBubble);
                Button button2 = (Button) view.findViewById(R.id.btnClearOtherBubble);
                Button button3 = (Button) view.findViewById(R.id.btnPickSelfBubble);
                Button button4 = (Button) view.findViewById(R.id.btnClearSelfBubble);
                final int i = 0;
                C1586.f8042 = new C1621(textView3, textView4, textView, textView2, 0);
                m3455(textView3, textView4, textView, textView2);
                button.setOnClickListener(new ViewOnClickListenerC2618(0));
                button2.setOnClickListener(new View.OnClickListener() { // from class: yyds.ᛵᛸᲁᛱ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i2 = i;
                        TextView textView5 = textView2;
                        TextView textView6 = textView;
                        TextView textView7 = textView4;
                        TextView textView8 = textView3;
                        switch (i2) {
                            case 0:
                                C1509 c1509 = C1509.f7142;
                                String strM4341 = AbstractC2328.m4341(-155168151339886L);
                                c1509.getClass();
                                AbstractC2328.m4341(-27633392452462L);
                                C1509.f7266.m1581(C1509.f7179[174], strM4341);
                                C1712.m3455(textView8, textView7, textView6, textView5);
                                AbstractC0449.m1235();
                                break;
                            default:
                                C1509 c15092 = C1509.f7142;
                                String strM43412 = AbstractC2328.m4341(-155172446307182L);
                                c15092.getClass();
                                AbstractC2328.m4341(-27599032714094L);
                                C1509.f7218.m1581(C1509.f7179[173], strM43412);
                                C1712.m3455(textView8, textView7, textView6, textView5);
                                AbstractC0449.m1235();
                                break;
                        }
                    }
                });
                button3.setOnClickListener(new ViewOnClickListenerC2618(1));
                final int i2 = 1;
                button4.setOnClickListener(new View.OnClickListener() { // from class: yyds.ᛵᛸᲁᛱ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i22 = i2;
                        TextView textView5 = textView2;
                        TextView textView6 = textView;
                        TextView textView7 = textView4;
                        TextView textView8 = textView3;
                        switch (i22) {
                            case 0:
                                C1509 c1509 = C1509.f7142;
                                String strM4341 = AbstractC2328.m4341(-155168151339886L);
                                c1509.getClass();
                                AbstractC2328.m4341(-27633392452462L);
                                C1509.f7266.m1581(C1509.f7179[174], strM4341);
                                C1712.m3455(textView8, textView7, textView6, textView5);
                                AbstractC0449.m1235();
                                break;
                            default:
                                C1509 c15092 = C1509.f7142;
                                String strM43412 = AbstractC2328.m4341(-155172446307182L);
                                c15092.getClass();
                                AbstractC2328.m4341(-27599032714094L);
                                C1509.f7218.m1581(C1509.f7179[173], strM43412);
                                C1712.m3455(textView8, textView7, textView6, textView5);
                                AbstractC0449.m1235();
                                break;
                        }
                    }
                });
                break;
            case 1:
                AbstractC2328.m4341(-684570115212142L);
                AbstractC2328.m4341(-684600179983214L);
                break;
            default:
                AbstractC2328.m4341(-193917346284398L);
                AbstractC2328.m4341(-193947411055470L);
                C2701.f13261.getClass();
                C2701.m4793(view);
                break;
        }
    }
}

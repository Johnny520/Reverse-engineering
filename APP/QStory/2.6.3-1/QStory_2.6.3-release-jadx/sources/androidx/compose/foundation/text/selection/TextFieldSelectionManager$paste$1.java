package androidx.compose.foundation.text.selection;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.p001ui.graphics.C2405;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.platform.C2734;
import androidx.compose.p001ui.platform.C2759;
import androidx.compose.p001ui.platform.InterfaceC2756;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.AbstractC2901;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.C2881;
import androidx.compose.p001ui.text.C2884;
import androidx.compose.p001ui.text.C2885;
import androidx.compose.p001ui.text.C2902;
import androidx.compose.p001ui.text.font.AbstractC2827;
import androidx.compose.p001ui.text.font.C2821;
import androidx.compose.p001ui.text.font.C2822;
import androidx.compose.p001ui.text.font.C2824;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.AbstractC3897;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.InterfaceC6233;
import p050.AbstractC7176;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p192.C8571;
import p210.C8661;
import p221.C8728;
import p225.C8751;
import p225.C8756;
import p225.C8760;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1", m556f = "TextFieldSelectionManager.kt", m557l = {928, 928}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class TextFieldSelectionManager$paste$1 extends SuspendLambda implements InterfaceC7383 {
    int label;
    final /* synthetic */ C1720 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$paste$1(C1720 c1720, InterfaceC5189<? super TextFieldSelectionManager$paste$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1720;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new TextFieldSelectionManager$paste$1(this.this$0, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((TextFieldSelectionManager$paste$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0320, code lost:
    
        if (r2 == r1) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fb, code lost:
    
        r16 = r2;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c2759;
        Object c2902;
        CharSequence text;
        CharSequence charSequence;
        int i;
        int i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        C6008 c6008 = C6008.f15084;
        if (i3 == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC2756 interfaceC2756 = this.this$0.f2849;
            if (interfaceC2756 != null) {
                this.label = 1;
                ClipData primaryClip = ((C2734) interfaceC2756).f5911.m4154().getPrimaryClip();
                c2759 = primaryClip != null ? new C2759(primaryClip) : null;
                if (c2759 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return c6008;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            c2902 = obj;
            C2902 c29022 = (C2902) c2902;
            if (c29022 != null) {
                C1720 c1720 = this.this$0;
                if (c1720.m2330()) {
                    C2885 c2885 = new C2885(AbstractC3897.m7387(c1720.m2319(), c1720.m2319().f6292.f6474.length()));
                    c2885.m4335(c29022);
                    C2902 c2902M4334 = c2885.m4334();
                    C2902 c2902M7386 = AbstractC3897.m7386(c1720.m2319(), c1720.m2319().f6292.f6474.length());
                    C2885 c28852 = new C2885(c2902M4334);
                    c28852.m4335(c2902M7386);
                    C2902 c2902M43342 = c28852.m4334();
                    int length = c29022.f6474.length() + C2869.m4317(c1720.m2319().f6291);
                    c1720.f2833.invoke(C1720.m2312(c2902M43342, AbstractC2882.m4330(length, length)));
                    c1720.m2322(HandleState.None);
                    c1720.f2835.f3095 = true;
                }
            }
            return c6008;
        }
        AbstractC6017.m10769(obj);
        c2759 = obj;
        C2759 c27592 = (C2759) c2759;
        if (c27592 != null) {
            this.label = 2;
            ClipData clipData = c27592.f6018;
            int i4 = 0;
            ClipData.Item itemAt = clipData.getItemAt(0);
            if (itemAt == null || (text = itemAt.getText()) == null) {
                c2902 = null;
            } else if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                ArrayList arrayList = new ArrayList();
                annotationArr.getClass();
                int length2 = annotationArr.length - 1;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        Annotation annotation = annotationArr[i5];
                        if (AbstractC5227.m9466(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                            int spanStart = spanned.getSpanStart(annotation);
                            int spanEnd = spanned.getSpanEnd(annotation);
                            String value = annotation.getValue();
                            C8571 c8571 = new C8571();
                            Parcel parcelObtain = Parcel.obtain();
                            c8571.f21347 = parcelObtain;
                            byte[] bArrDecode = Base64.decode(value, i4);
                            parcelObtain.unmarshall(bArrDecode, i4, bArrDecode.length);
                            parcelObtain.setDataPosition(i4);
                            Parcel parcel = c8571.f21347;
                            long jM13661 = C2434.f5042;
                            long jM136612 = jM13661;
                            long jM13660 = C8728.f22211;
                            long jM136602 = jM13660;
                            C2822 c2822 = null;
                            C2824 c2824 = null;
                            C2821 c2821 = null;
                            String string = null;
                            C8751 c8751 = null;
                            C8756 c8756 = null;
                            C8760 c8760 = null;
                            C2405 c2405 = null;
                            while (true) {
                                if (parcel.dataAvail() <= 1) {
                                    charSequence = text;
                                    i = i4;
                                    break;
                                }
                                byte b = parcel.readByte();
                                i = i4;
                                if (b == 1) {
                                    if (parcel.dataAvail() < 8) {
                                        break;
                                    }
                                    jM13661 = c8571.m13661();
                                    i4 = i;
                                } else if (b == 2) {
                                    if (parcel.dataAvail() < 5) {
                                        break;
                                    }
                                    jM13660 = c8571.m13660();
                                    i4 = i;
                                } else if (b == 3) {
                                    if (parcel.dataAvail() < 4) {
                                        break;
                                    }
                                    i4 = i;
                                    c2822 = new C2822(parcel.readInt());
                                } else if (b == 4) {
                                    if (parcel.dataAvail() < 1) {
                                        break;
                                    }
                                    byte b2 = parcel.readByte();
                                    i4 = i;
                                    c2824 = new C2824((b2 != 0 && b2 == 1) ? 1 : i);
                                } else if (b != 5) {
                                    if (b == 6) {
                                        string = parcel.readString();
                                    } else if (b == 7) {
                                        if (parcel.dataAvail() < 5) {
                                            break;
                                        }
                                        jM136602 = c8571.m13660();
                                    } else if (b == 8) {
                                        if (parcel.dataAvail() < 4) {
                                            break;
                                        }
                                        i4 = i;
                                        c8751 = new C8751(parcel.readFloat());
                                    } else if (b == 9) {
                                        if (parcel.dataAvail() < 8) {
                                            break;
                                        }
                                        i4 = i;
                                        c8756 = new C8756(parcel.readFloat(), parcel.readFloat());
                                    } else if (b != 10) {
                                        if (b != 11) {
                                            charSequence = text;
                                            if (b == 12) {
                                                if (parcel.dataAvail() < 20) {
                                                    break;
                                                }
                                                c8571 = c8571;
                                                text = charSequence;
                                                c2405 = new C2405(parcel.readFloat(), c8571.m13661(), (((long) Float.floatToRawIntBits(parcel.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcel.readFloat())) & 4294967295L));
                                            }
                                        } else {
                                            if (parcel.dataAvail() < 4) {
                                                break;
                                            }
                                            int i6 = parcel.readInt();
                                            int i7 = (i6 & 2) != 0 ? 1 : i;
                                            int i8 = (i6 & 1) != 0 ? 1 : i;
                                            C8760 c87602 = C8760.f22304;
                                            charSequence = text;
                                            C8760 c87603 = C8760.f22305;
                                            if (i7 != 0 && i8 != 0) {
                                                List listM12490 = AbstractC7176.m12490(c87602, c87603);
                                                Integer numValueOf = Integer.valueOf(i);
                                                int size = listM12490.size();
                                                int i9 = i;
                                                while (i9 < size) {
                                                    numValueOf = Integer.valueOf(((C8760) listM12490.get(i9)).f22307 | numValueOf.intValue());
                                                    i9++;
                                                    listM12490 = listM12490;
                                                }
                                                c8760 = new C8760(numValueOf.intValue());
                                            } else if (i7 != 0) {
                                                c8760 = c87602;
                                            } else {
                                                if (i8 == 0) {
                                                    c87603 = C8760.f22306;
                                                }
                                                c8760 = c87603;
                                            }
                                        }
                                        i4 = i;
                                        text = charSequence;
                                    } else {
                                        if (parcel.dataAvail() < 8) {
                                            break;
                                        }
                                        jM136612 = c8571.m13661();
                                    }
                                    i4 = i;
                                } else {
                                    if (parcel.dataAvail() < 1) {
                                        break;
                                    }
                                    byte b3 = parcel.readByte();
                                    if (b3 == 0) {
                                        i2 = i;
                                    } else if (b3 == 1) {
                                        i2 = Opcodes.MAX_VALUE;
                                    } else {
                                        i2 = b3 == 3 ? 2 : b3 == 2 ? 1 : i;
                                        i4 = i;
                                        c2821 = new C2821(i2);
                                    }
                                    i4 = i;
                                    c2821 = new C2821(i2);
                                }
                            }
                            arrayList.add(new C2884(new C2881(jM13661, jM13660, c2822, c2824, c2821, (AbstractC2827) null, string, jM136602, c8751, c8756, (C8661) null, jM136612, c8760, c2405, 49152), spanStart, spanEnd));
                        } else {
                            charSequence = text;
                            i = i4;
                        }
                        if (i5 == length2) {
                            break;
                        }
                        i5++;
                        i4 = i;
                        text = charSequence;
                    }
                } else {
                    charSequence = text;
                    i = 0;
                }
                String string2 = charSequence.toString();
                List list = EmptyList.INSTANCE;
                C2902 c29023 = AbstractC2901.f6472;
                if (arrayList.isEmpty() && list.isEmpty()) {
                    list = null;
                } else if (list.isEmpty()) {
                    list = arrayList;
                } else if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size());
                    int size2 = arrayList.size();
                    for (int i10 = i; i10 < size2; i10++) {
                        arrayList2.add((C2884) arrayList.get(i10));
                    }
                    int size3 = list.size();
                    for (int i11 = i; i11 < size3; i11++) {
                        arrayList2.add((C2884) list.get(i11));
                    }
                    list = arrayList2;
                }
                c2902 = new C2902(list, string2);
            } else {
                c2902 = new C2902(text.toString());
            }
        }
        return c6008;
    }
}

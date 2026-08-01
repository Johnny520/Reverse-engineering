package p104;

import androidx.profileinstaller.AbstractC3275;
import com.bumptech.glide.AbstractC3898;
import kotlin.C6011;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.text.AbstractC5970;
import kotlin.text.AbstractC5971;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.internal.AbstractC6339;
import p103.C7926;
import p103.C7954;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p107.C8021;
import p107.InterfaceC8020;
import p267.AbstractC9004;
import p269.AbstractC9019;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7994 implements InterfaceC8013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7994 f19480 = new C7994();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7954 f19479 = AbstractC9004.m14192("kotlinx.serialization.json.JsonLiteral", C8021.f19529);

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        InterfaceC8007 interfaceC8007M7410 = AbstractC3898.m7410(interfaceC8016);
        AbstractC8005 abstractC8005Mo11240 = interfaceC8007M7410.mo11240();
        if (abstractC8005Mo11240 instanceof C7990) {
            return (C7990) abstractC8005Mo11240;
        }
        String strM5135 = AbstractC3275.m5135(AbstractC5228.f13320, abstractC8005Mo11240.getClass(), new StringBuilder("Unexpected JSON element, expected JsonLiteral, had "));
        String string = interfaceC8007M7410.mo11215().f19473.f19506 ? AbstractC6339.m11310(-1, abstractC8005Mo11240.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC6339.m11317(strM5135, null, null, -1, string), strM5135, -1, null, string, null);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return f19479;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C7990 c7990 = (C7990) obj;
        c7990.getClass();
        String str = c7990.f19475;
        AbstractC3898.m7412(interfaceC8015);
        if (c7990.f19476) {
            interfaceC8015.mo11208(str);
            return;
        }
        InterfaceC8020 interfaceC8020 = c7990.f19474;
        if (interfaceC8020 != null) {
            interfaceC8015.mo11275(interfaceC8020).mo11208(str);
            return;
        }
        Long lM10697 = AbstractC5971.m10697(str);
        if (lM10697 != null) {
            interfaceC8015.mo11210(lM10697.longValue());
            return;
        }
        C6011 c6011M14242 = AbstractC9019.m14242(str);
        if (c6011M14242 != null) {
            interfaceC8015.mo11275(C7926.f19363).mo11210(c6011M14242.f15087);
            return;
        }
        Double dM10685 = AbstractC5970.m10685(str);
        if (dM10685 != null) {
            interfaceC8015.mo11276(dM10685.doubleValue());
            return;
        }
        Boolean bool = str.equals("true") ? Boolean.TRUE : str.equals("false") ? Boolean.FALSE : null;
        if (bool != null) {
            interfaceC8015.mo11273(bool.booleanValue());
        } else {
            interfaceC8015.mo11208(str);
        }
    }
}

package p104;

import androidx.profileinstaller.AbstractC3275;
import com.bumptech.glide.AbstractC3898;
import kotlin.jvm.internal.AbstractC5228;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.internal.AbstractC6339;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p107.C8019;
import p107.C8021;
import p107.InterfaceC8020;
import p267.AbstractC9004;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7983 implements InterfaceC8013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7983 f19463 = new C7983();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8019 f19462 = AbstractC9004.m14208("kotlinx.serialization.json.JsonPrimitive", C8021.f19529, new InterfaceC8020[0]);

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        InterfaceC8007 interfaceC8007M7410 = AbstractC3898.m7410(interfaceC8016);
        AbstractC8005 abstractC8005Mo11240 = interfaceC8007M7410.mo11240();
        if (abstractC8005Mo11240 instanceof AbstractC7977) {
            return (AbstractC7977) abstractC8005Mo11240;
        }
        String strM5135 = AbstractC3275.m5135(AbstractC5228.f13320, abstractC8005Mo11240.getClass(), new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had "));
        String string = interfaceC8007M7410.mo11215().f19473.f19506 ? AbstractC6339.m11310(-1, abstractC8005Mo11240.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC6339.m11317(strM5135, null, null, -1, string), strM5135, -1, null, string, null);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return f19462;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        AbstractC7977 abstractC7977 = (AbstractC7977) obj;
        abstractC7977.getClass();
        AbstractC3898.m7412(interfaceC8015);
        if (abstractC7977 instanceof C7992) {
            interfaceC8015.mo11264(C7993.f19478, C7992.INSTANCE);
        } else {
            interfaceC8015.mo11264(C7994.f19480, (C7990) abstractC7977);
        }
    }
}

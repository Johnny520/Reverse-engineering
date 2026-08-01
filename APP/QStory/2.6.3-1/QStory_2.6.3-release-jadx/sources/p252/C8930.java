package p252;

import com.bumptech.glide.AbstractC3898;
import io.ktor.http.URLParserException;
import java.io.IOException;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.text.AbstractC5964;
import kotlin.text.AbstractC5976;
import kotlinx.p010io.C6309;
import p025.AbstractC7012;
import p267.AbstractC9004;
import p332.C9496;
import top.suzhelan.qstory.hook.item.C6755;
import top.yukonga.miuix.kmp.utils.C6886;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8930 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C8922 f22721;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public String f22722;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public String f22723;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C8920 f22724;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f22725;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f22726;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public String f22727;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public List f22728;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public String f22729;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C8934 f22730;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C8921 f22731;

    static {
        C8930 c8930 = new C8930();
        if (!AbstractC5976.m10731("http://localhost")) {
            try {
                AbstractC8929.m14127(c8930, "http://localhost");
            } catch (Throwable th) {
                throw new URLParserException("http://localhost", th);
            }
        }
        f22721 = c8930.m14132();
    }

    public C8930() throws CharacterCodingException {
        EmptyList<String> emptyList = EmptyList.INSTANCE;
        InterfaceC8924.f22683.getClass();
        emptyList.getClass();
        this.f22727 = "";
        this.f22726 = false;
        this.f22725 = 0;
        this.f22724 = null;
        this.f22723 = null;
        this.f22722 = null;
        Set set = AbstractC8940.f22753;
        Charset charset = AbstractC5964.f15033;
        charset.getClass();
        StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        charsetEncoderNewEncoder.getClass();
        C6309 c6309 = new C6309();
        AbstractC3898.m7425(charsetEncoderNewEncoder, c6309, "", 0, 0);
        AbstractC8940.m14134(c6309, new C6886(sb, 6));
        this.f22729 = sb.toString();
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(emptyList, 10));
        for (String str : emptyList) {
            str.getClass();
            StringBuilder sb2 = new StringBuilder();
            Charset charset2 = AbstractC5964.f15033;
            int i = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                if (AbstractC8940.f22752.contains(Character.valueOf(cCharAt)) || AbstractC8940.f22750.contains(Character.valueOf(cCharAt))) {
                    sb2.append(cCharAt);
                    i++;
                } else {
                    int i2 = (55296 > cCharAt || cCharAt >= 57344) ? 1 : 2;
                    CharsetEncoder charsetEncoderNewEncoder2 = charset2.newEncoder();
                    charsetEncoderNewEncoder2.getClass();
                    int i3 = i2 + i;
                    C6309 c63092 = new C6309();
                    AbstractC3898.m7425(charsetEncoderNewEncoder2, c63092, str, i, i3);
                    while (!c63092.mo11163()) {
                        while (!c63092.mo11163()) {
                            sb2.append(AbstractC8940.m14140(c63092.readByte()));
                        }
                    }
                    i = i3;
                }
            }
            arrayList.add(sb2.toString());
        }
        this.f22728 = arrayList;
        C8934 c8934 = new C8934(2);
        for (String str2 : EmptySet.INSTANCE) {
            str2.getClass();
            EmptyList<String> emptyList2 = EmptyList.INSTANCE;
            String strM14135 = AbstractC8940.m14135(str2, false);
            ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(emptyList2, 10));
            for (String str3 : emptyList2) {
                str3.getClass();
                arrayList2.add(AbstractC8940.m14135(str3, true));
            }
            c8934.mo2969(strM14135, arrayList2);
        }
        this.f22730 = c8934;
        this.f22731 = new C8921(c8934);
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder(256);
        AbstractC9004.m14190(this, sb);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m14129(int i) {
        if (i < 0 || i >= 65536) {
            C6755.m11873(AbstractC7012.m12147(i, "Port must be between 0 and 65535, or 0 if not set. Provided: "));
        } else {
            this.f22725 = i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14130(List list) {
        list.getClass();
        this.f22728 = list;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8920 m14131() {
        C8920 c8920 = this.f22724;
        if (c8920 != null) {
            return c8920;
        }
        C8920 c89202 = C8920.f22665;
        return C8920.f22665;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8922 m14132() throws IOException {
        m14133();
        C8920 c8920 = this.f22724;
        String str = this.f22727;
        int i = this.f22725;
        List list = this.f22728;
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC8940.m14137(0, 0, (String) it.next(), 7));
        }
        InterfaceC8924 interfaceC8924M14944 = C9496.m14944(this.f22731.f22668);
        String strM14136 = AbstractC8940.m14136(0, 0, this.f22729, 15);
        String str2 = this.f22723;
        String strM14137 = str2 != null ? AbstractC8940.m14137(0, 0, str2, 7) : null;
        String str3 = this.f22722;
        String str4 = strM14137;
        String strM141372 = str3 != null ? AbstractC8940.m14137(0, 0, str3, 7) : null;
        boolean z = this.f22726;
        m14133();
        StringBuilder sb = new StringBuilder(256);
        AbstractC9004.m14190(this, sb);
        return new C8922(c8920, str, i, arrayList, interfaceC8924M14944, strM14136, str4, strM141372, z, sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14133() {
        if (this.f22727.length() <= 0 && !m14131().f22667.equals("file")) {
            C8922 c8922 = f22721;
            this.f22727 = c8922.f22674;
            if (this.f22724 == null) {
                this.f22724 = c8922.f22677;
            }
            if (this.f22725 == 0) {
                m14129(c8922.f22673);
            }
        }
    }
}

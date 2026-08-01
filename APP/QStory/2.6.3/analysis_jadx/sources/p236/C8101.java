package p236;

import com.bumptech.glide.AbstractC3066;
import io.ktor.http.URLParserException;
import java.io.IOException;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.text.AbstractC5132;
import kotlin.text.AbstractC5144;
import kotlinx.io.C5477;
import p009.AbstractC6183;
import p251.AbstractC8175;
import p316.C8667;
import top.suzhelan.qstory.hook.item.C5925;
import top.yukonga.miuix.kmp.utils.C6057;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8101 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C8093 f22376;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public String f22377;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public String f22378;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C8091 f22379;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f22380;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f22381;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public String f22382;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public List f22383;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public String f22384;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C8105 f22385;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C8092 f22386;

    static {
        C8101 c8101 = new C8101();
        if (!AbstractC5144.m10172("http://localhost")) {
            try {
                AbstractC8100.m13568(c8101, "http://localhost");
            } catch (Throwable th) {
                throw new URLParserException("http://localhost", th);
            }
        }
        f22376 = c8101.m13573();
    }

    public C8101() throws CharacterCodingException {
        EmptyList<String> emptyList = EmptyList.INSTANCE;
        InterfaceC8095.f22338.getClass();
        emptyList.getClass();
        this.f22382 = "";
        this.f22381 = false;
        this.f22380 = 0;
        this.f22379 = null;
        this.f22378 = null;
        this.f22377 = null;
        Set set = AbstractC8111.f22408;
        Charset charset = AbstractC5132.f14688;
        charset.getClass();
        StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        charsetEncoderNewEncoder.getClass();
        C5477 c5477 = new C5477();
        AbstractC3066.m6865(charsetEncoderNewEncoder, c5477, "", 0, 0);
        AbstractC8111.m13575(c5477, new C6057(sb, 6));
        this.f22384 = sb.toString();
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(emptyList, 10));
        for (String str : emptyList) {
            str.getClass();
            StringBuilder sb2 = new StringBuilder();
            Charset charset2 = AbstractC5132.f14688;
            int i = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                if (AbstractC8111.f22407.contains(Character.valueOf(cCharAt)) || AbstractC8111.f22405.contains(Character.valueOf(cCharAt))) {
                    sb2.append(cCharAt);
                    i++;
                } else {
                    int i2 = (55296 > cCharAt || cCharAt >= 57344) ? 1 : 2;
                    CharsetEncoder charsetEncoderNewEncoder2 = charset2.newEncoder();
                    charsetEncoderNewEncoder2.getClass();
                    int i3 = i2 + i;
                    C5477 c54772 = new C5477();
                    AbstractC3066.m6865(charsetEncoderNewEncoder2, c54772, str, i, i3);
                    while (!c54772.mo10604()) {
                        while (!c54772.mo10604()) {
                            sb2.append(AbstractC8111.m13581(c54772.readByte()));
                        }
                    }
                    i = i3;
                }
            }
            arrayList.add(sb2.toString());
        }
        this.f22383 = arrayList;
        C8105 c8105 = new C8105(2);
        for (String str2 : EmptySet.INSTANCE) {
            str2.getClass();
            EmptyList<String> emptyList2 = EmptyList.INSTANCE;
            String strM13576 = AbstractC8111.m13576(str2, false);
            ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(emptyList2, 10));
            for (String str3 : emptyList2) {
                str3.getClass();
                arrayList2.add(AbstractC8111.m13576(str3, true));
            }
            c8105.mo2409(strM13576, arrayList2);
        }
        this.f22385 = c8105;
        this.f22386 = new C8092(c8105);
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder(256);
        AbstractC8175.m13631(this, sb);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13570(int i) {
        if (i < 0 || i >= 65536) {
            C5925.m11314(AbstractC6183.m11588(i, "Port must be between 0 and 65535, or 0 if not set. Provided: "));
        } else {
            this.f22380 = i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13571(List list) {
        list.getClass();
        this.f22383 = list;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8091 m13572() {
        C8091 c8091 = this.f22379;
        if (c8091 != null) {
            return c8091;
        }
        C8091 c80912 = C8091.f22320;
        return C8091.f22320;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8093 m13573() throws IOException {
        m13574();
        C8091 c8091 = this.f22379;
        String str = this.f22382;
        int i = this.f22380;
        List list = this.f22383;
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC8111.m13578(0, 0, (String) it.next(), 7));
        }
        InterfaceC8095 interfaceC8095M14385 = C8667.m14385(this.f22386.f22323);
        String strM13577 = AbstractC8111.m13577(0, 0, this.f22384, 15);
        String str2 = this.f22378;
        String strM13578 = str2 != null ? AbstractC8111.m13578(0, 0, str2, 7) : null;
        String str3 = this.f22377;
        String str4 = strM13578;
        String strM135782 = str3 != null ? AbstractC8111.m13578(0, 0, str3, 7) : null;
        boolean z = this.f22381;
        m13574();
        StringBuilder sb = new StringBuilder(256);
        AbstractC8175.m13631(this, sb);
        return new C8093(c8091, str, i, arrayList, interfaceC8095M14385, strM13577, str4, strM135782, z, sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13574() {
        if (this.f22382.length() <= 0 && !m13572().f22322.equals("file")) {
            C8093 c8093 = f22376;
            this.f22382 = c8093.f22329;
            if (this.f22379 == null) {
                this.f22379 = c8093.f22332;
            }
            if (this.f22380 == 0) {
                m13570(c8093.f22328);
            }
        }
    }
}

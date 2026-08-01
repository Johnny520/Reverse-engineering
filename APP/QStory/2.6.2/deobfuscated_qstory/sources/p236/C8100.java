package p236;

import io.ktor.http.URLParserException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.text.AbstractC5131;
import kotlin.text.AbstractC5143;
import kotlinx.io.C5476;
import p007.AbstractC6136;
import p175.AbstractC7738;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;
import top.yukonga.miuix.kmp.utils.C6051;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8100 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C8092 f22378;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public String f22379;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public String f22380;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C8090 f22381;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f22382;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f22383;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public String f22384;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public List f22385;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public String f22386;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C8104 f22387;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C8091 f22388;

    static {
        C8100 c8100 = new C8100();
        if (!AbstractC5143.m10164("http://localhost")) {
            try {
                AbstractC8099.m13539(c8100, "http://localhost");
            } catch (Throwable th) {
                throw new URLParserException("http://localhost", th);
            }
        }
        f22378 = c8100.m13544();
    }

    public C8100() {
        EmptyList<String> emptyList = EmptyList.INSTANCE;
        InterfaceC8094.f22340.getClass();
        emptyList.getClass();
        this.f22384 = "";
        this.f22383 = false;
        this.f22382 = 0;
        this.f22381 = null;
        this.f22380 = null;
        this.f22379 = null;
        Set set = AbstractC8110.f22410;
        Charset charset = AbstractC5131.f14688;
        charset.getClass();
        StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        charsetEncoderNewEncoder.getClass();
        C5476 c5476 = new C5476();
        AbstractC8189.m13689(charsetEncoderNewEncoder, c5476, "", 0, 0);
        AbstractC8110.m13546(c5476, new C6051(sb, 6));
        this.f22386 = sb.toString();
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(emptyList, 10));
        for (String str : emptyList) {
            str.getClass();
            StringBuilder sb2 = new StringBuilder();
            Charset charset2 = AbstractC5131.f14688;
            int i = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                if (AbstractC8110.f22409.contains(Character.valueOf(cCharAt)) || AbstractC8110.f22407.contains(Character.valueOf(cCharAt))) {
                    sb2.append(cCharAt);
                    i++;
                } else {
                    int i2 = (55296 > cCharAt || cCharAt >= 57344) ? 1 : 2;
                    CharsetEncoder charsetEncoderNewEncoder2 = charset2.newEncoder();
                    charsetEncoderNewEncoder2.getClass();
                    int i3 = i2 + i;
                    C5476 c54762 = new C5476();
                    AbstractC8189.m13689(charsetEncoderNewEncoder2, c54762, str, i, i3);
                    while (!c54762.mo10601()) {
                        while (!c54762.mo10601()) {
                            sb2.append(AbstractC8110.m13552(c54762.readByte()));
                        }
                    }
                    i = i3;
                }
            }
            arrayList.add(sb2.toString());
        }
        this.f22385 = arrayList;
        C8104 c8104 = new C8104(2);
        for (String str2 : EmptySet.INSTANCE) {
            str2.getClass();
            EmptyList<String> emptyList2 = EmptyList.INSTANCE;
            String strM13547 = AbstractC8110.m13547(str2, false);
            ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(emptyList2, 10));
            for (String str3 : emptyList2) {
                str3.getClass();
                arrayList2.add(AbstractC8110.m13547(str3, true));
            }
            c8104.mo2399(strM13547, arrayList2);
        }
        this.f22387 = c8104;
        this.f22388 = new C8091(c8104);
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder(256);
        AbstractC7738.m13043(this, sb);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13541(int i) {
        if (i < 0 || i >= 65536) {
            C5919.m11253(AbstractC6136.m11556(i, "Port must be between 0 and 65535, or 0 if not set. Provided: "));
        } else {
            this.f22382 = i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13542(List list) {
        list.getClass();
        this.f22385 = list;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8090 m13543() {
        C8090 c8090 = this.f22381;
        if (c8090 != null) {
            return c8090;
        }
        C8090 c80902 = C8090.f22322;
        return C8090.f22322;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8092 m13544() throws IOException {
        m13545();
        C8090 c8090 = this.f22381;
        String str = this.f22384;
        int i = this.f22382;
        List list = this.f22385;
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC8110.m13549(0, 0, (String) it.next(), 7));
        }
        InterfaceC8094 interfaceC8094M13688 = AbstractC8189.m13688(this.f22388.f22325);
        String strM13548 = AbstractC8110.m13548(0, 0, this.f22386, 15);
        String str2 = this.f22380;
        String strM13549 = str2 != null ? AbstractC8110.m13549(0, 0, str2, 7) : null;
        String str3 = this.f22379;
        String str4 = strM13549;
        String strM135492 = str3 != null ? AbstractC8110.m13549(0, 0, str3, 7) : null;
        boolean z = this.f22383;
        m13545();
        StringBuilder sb = new StringBuilder(256);
        AbstractC7738.m13043(this, sb);
        return new C8092(c8090, str, i, arrayList, interfaceC8094M13688, strM13548, str4, strM135492, z, sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13545() {
        if (this.f22384.length() <= 0 && !m13543().f22324.equals("file")) {
            C8092 c8092 = f22378;
            this.f22384 = c8092.f22331;
            if (this.f22381 == null) {
                this.f22381 = c8092.f22334;
            }
            if (this.f22382 == 0) {
                m13541(c8092.f22330);
            }
        }
    }
}

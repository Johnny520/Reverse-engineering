package io.ktor.server.routing;

import com.bumptech.glide.AbstractC3054;
import io.ktor.http.URLDecodeException;
import io.ktor.server.application.InterfaceC4064;
import io.ktor.server.plugins.BadRequestException;
import io.ktor.util.C4203;
import io.ktor.util.C4208;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.text.AbstractC5143;
import p236.AbstractC8110;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4141 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4137 f12547;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f12548;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f12549;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f12550;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4064 f12551;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4144 f12552;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C4168 f12553;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f12554;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f12555;

    public C4141(C4144 c4144, InterfaceC4064 interfaceC4064, ArrayList arrayList) throws BadRequestException {
        interfaceC4064.getClass();
        arrayList.getClass();
        this.f12552 = c4144;
        this.f12551 = interfaceC4064;
        this.f12550 = arrayList;
        this.f12548 = AbstractC5143.m10155(AbstractC3054.m6606(interfaceC4064.mo8469()), '/');
        this.f12554 = new ArrayList(16);
        this.f12553 = AbstractC4159.f12601;
        try {
            List listM8540 = m8540(AbstractC3054.m6606(interfaceC4064.mo8469()));
            this.f12549 = listM8540;
            this.f12547 = arrayList.isEmpty() ? null : new C4137(interfaceC4064, listM8540);
        } catch (URLDecodeException e) {
            throw new BadRequestException("Url decode failed for " + AbstractC3054.m6611(this.f12551.mo8469()), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8539(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.routing.C4141.m8539(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List m8540(String str) {
        if (str.length() == 0 || str.equals("/")) {
            return EmptyList.INSTANCE;
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) == '/') {
                i2++;
            }
        }
        ArrayList arrayList = new ArrayList(i2);
        int i4 = 0;
        while (i < length) {
            int iM10151 = AbstractC5143.m10151(str, '/', i4, 4);
            if (iM10151 == -1) {
                iM10151 = length;
            }
            if (iM10151 != i4) {
                arrayList.add(AbstractC8110.m13549(i4, iM10151, str, 4));
            }
            i4 = iM10151 + 1;
            i = iM10151;
        }
        C4208 c4208 = AbstractC4150.f12572;
        InterfaceC4064 interfaceC4064 = this.f12551;
        interfaceC4064.getClass();
        C4203 attributes = interfaceC4064.getAttributes();
        C4208 c42082 = AbstractC4150.f12572;
        attributes.getClass();
        c42082.getClass();
        if (!attributes.m8598().containsKey(c42082) && str.endsWith("/")) {
            arrayList.add("");
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a8, code lost:
    
        if (r3 == r5) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x025e A[PHI: r31 r32
  0x025e: PHI (r31v7 io.ktor.server.routing.飘花落叶言子楪兰世哲苏) = (r31v6 io.ktor.server.routing.飘花落叶言子楪兰世哲苏), (r31v8 io.ktor.server.routing.飘花落叶言子楪兰世哲苏) binds: [B:126:0x025b, B:95:0x01fd] A[DONT_GENERATE, DONT_INLINE]
  0x025e: PHI (r32v7 int) = (r32v6 int), (r32v8 int) binds: [B:126:0x025b, B:95:0x01fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x02d8 -> B:145:0x02e3). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8541(io.ktor.server.routing.C4153 r29, int r30, java.util.ArrayList r31, double r32, kotlin.coroutines.jvm.internal.ContinuationImpl r34) {
        /*
            Method dump skipped, instruction units count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.routing.C4141.m8541(io.ktor.server.routing.飘花落叶言子楪兰世哲苏, int, java.util.ArrayList, double, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

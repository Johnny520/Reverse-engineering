package io.ktor.server.routing;

import com.alibaba.fastjson2.AbstractC2905;
import io.ktor.http.URLDecodeException;
import io.ktor.server.application.InterfaceC4065;
import io.ktor.server.plugins.BadRequestException;
import io.ktor.util.C4204;
import io.ktor.util.C4209;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.text.AbstractC5144;
import p236.AbstractC8111;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4142 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4138 f12551;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f12552;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f12553;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f12554;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4065 f12555;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4145 f12556;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C4169 f12557;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f12558;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f12559;

    public C4142(C4145 c4145, InterfaceC4065 interfaceC4065, ArrayList arrayList) throws BadRequestException {
        interfaceC4065.getClass();
        arrayList.getClass();
        this.f12556 = c4145;
        this.f12555 = interfaceC4065;
        this.f12554 = arrayList;
        this.f12552 = AbstractC5144.m10159(AbstractC2905.m6336(interfaceC4065.mo8459()), '/');
        this.f12558 = new ArrayList(16);
        this.f12557 = AbstractC4160.f12605;
        try {
            List listM8530 = m8530(AbstractC2905.m6336(interfaceC4065.mo8459()));
            this.f12553 = listM8530;
            this.f12551 = arrayList.isEmpty() ? null : new C4138(interfaceC4065, listM8530);
        } catch (URLDecodeException e) {
            throw new BadRequestException("Url decode failed for " + AbstractC2905.m6295(this.f12555.mo8459()), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8529(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.routing.C4142.m8529(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List m8530(String str) {
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
            int iM10171 = AbstractC5144.m10171(str, '/', i4, 4);
            if (iM10171 == -1) {
                iM10171 = length;
            }
            if (iM10171 != i4) {
                arrayList.add(AbstractC8111.m13578(i4, iM10171, str, 4));
            }
            i4 = iM10171 + 1;
            i = iM10171;
        }
        C4209 c4209 = AbstractC4151.f12576;
        InterfaceC4065 interfaceC4065 = this.f12555;
        interfaceC4065.getClass();
        C4204 attributes = interfaceC4065.getAttributes();
        C4209 c42092 = AbstractC4151.f12576;
        attributes.getClass();
        c42092.getClass();
        if (!attributes.m8588().containsKey(c42092) && str.endsWith("/")) {
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
    public final java.lang.Object m8531(io.ktor.server.routing.C4154 r29, int r30, java.util.ArrayList r31, double r32, kotlin.coroutines.jvm.internal.ContinuationImpl r34) {
        /*
            Method dump skipped, instruction units count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.routing.C4142.m8531(io.ktor.server.routing.飘花落叶言子楪兰世哲苏, int, java.util.ArrayList, double, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

package io.github.cherrywechat.network.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.AbstractC2156b;
import kotlinx.serialization.json.AbstractC2158d;
import kotlinx.serialization.json.C2155a;
import p000.AbstractC2508sm;
import p000.AbstractC2539ta;
import p000.AbstractC2564tz;
import p000.AbstractC2809zm;
import p000.C0029Am;
import p000.C0263G4;
import p000.C0452Kf;
import p000.C2169kz;
import p000.C2521sz;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0406Jc;
import p000.InterfaceC0624Of;
import p000.InterfaceC0717Qm;

/* JADX INFO: loaded from: classes.dex */
public final class ScreenshotsSerializer implements InterfaceC0717Qm {
    public static final ScreenshotsSerializer INSTANCE = null;
    private static final InterfaceC0126Cx descriptor = null;
    private static final InterfaceC0717Qm listSerializer = null;

    static {
        INSTANCE = new ScreenshotsSerializer();
        C0263G4 r1 = new C0263G4(C2521sz.f8819a);
        listSerializer = r1;
        descriptor = r1.f845b;
    }

    private ScreenshotsSerializer() {
    }

    @Override // p000.InterfaceC0717Qm
    public /* bridge */ /* synthetic */ Object deserialize(InterfaceC0406Jc r1) {
        return deserialize(r1);
    }

    @Override // p000.InterfaceC0717Qm
    public InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC0717Qm
    public /* bridge */ /* synthetic */ void serialize(InterfaceC0624Of r1, Object r2) {
        serialize(r1, (List) r2);
    }

    @Override // p000.InterfaceC0717Qm
    public List<String> deserialize(InterfaceC0406Jc r5) {
        if ((r5 instanceof C2169kz) == false) goto L5;
        C2169kz r0 = (C2169kz) r5;
    L6:
        if (r0 == null) goto L8;
        AbstractC2156b r52 = r0.m4370A0();
        boolean r02 = r52 instanceof C2155a;
        C0452Kf r1 = C0452Kf.f1484a;
        if (r02 == false) goto L18;
        int r03 = AbstractC2508sm.f8796a;     // Catch: Exception -> L27
        C2155a r53 = (C2155a) r52;     // Catch: Exception -> L27
        ArrayList r04 = new ArrayList(AbstractC2539ta.m5019d0(r53, 10));     // Catch: Exception -> L27
        Iterator r54 = r53.f7534a.iterator();     // Catch: Exception -> L27
    L13:
        if (r54.hasNext() == false) goto L30;
        r04.add(AbstractC2508sm.m4989d((AbstractC2156b) r54.next()).mo121a());     // Catch: Exception -> L27
        goto L13
    L30:
        return r04;
    L18:
        if ((r52 instanceof AbstractC2158d) == false) goto L31;
        String r55 = AbstractC2508sm.m4988c((AbstractC2158d) r52);
        if (r55 == null) goto L33;
        String r56 = AbstractC2564tz.m5070e0(r55).toString();
        if (r56.startsWith("[") == false) goto L32;
        C0029Am r05 = AbstractC2809zm.f9524a;     // Catch: Exception -> L27
        r05.getClass();     // Catch: Exception -> L27
        return (List) r05.m4550a(new C0263G4(C2521sz.f8819a), r56);
    L32:
        return r1;
    L33:
        return r1;
    L31:
        return r1;
    L34:
        return r1;
    L8:
        return (List) listSerializer.deserialize(r5);
    L5:
        r0 = null;
        goto L6
    }

    public void serialize(InterfaceC0624Of r2, List<String> r3) {
        listSerializer.serialize(r2, r3);
    }
}

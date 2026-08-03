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
    public static final ScreenshotsSerializer INSTANCE = new ScreenshotsSerializer();
    private static final InterfaceC0126Cx descriptor;
    private static final InterfaceC0717Qm listSerializer;

    static {
        C0263G4 c0263g4 = new C0263G4(C2521sz.f8819a);
        listSerializer = c0263g4;
        descriptor = c0263g4.f845b;
    }

    private ScreenshotsSerializer() {
    }

    @Override // p000.InterfaceC0717Qm
    public InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC0717Qm
    public List<String> deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        String strM4988c;
        C2169kz c2169kz = interfaceC0406Jc instanceof C2169kz ? (C2169kz) interfaceC0406Jc : null;
        if (c2169kz == null) {
            return (List) listSerializer.deserialize(interfaceC0406Jc);
        }
        AbstractC2156b abstractC2156bM4370A0 = c2169kz.m4370A0();
        boolean z = abstractC2156bM4370A0 instanceof C2155a;
        C0452Kf c0452Kf = C0452Kf.f1484a;
        try {
            if (z) {
                int i = AbstractC2508sm.f8796a;
                C2155a c2155a = (C2155a) abstractC2156bM4370A0;
                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(c2155a, 10));
                Iterator it = c2155a.f7534a.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC2508sm.m4989d((AbstractC2156b) it.next()).mo121a());
                }
                return arrayList;
            }
            if (!(abstractC2156bM4370A0 instanceof AbstractC2158d) || (strM4988c = AbstractC2508sm.m4988c((AbstractC2158d) abstractC2156bM4370A0)) == null) {
                return c0452Kf;
            }
            String string = AbstractC2564tz.m5070e0(strM4988c).toString();
            if (!string.startsWith("[")) {
                return c0452Kf;
            }
            C0029Am c0029Am = AbstractC2809zm.f9524a;
            c0029Am.getClass();
            return (List) c0029Am.m4550a(new C0263G4(C2521sz.f8819a), string);
        } catch (Exception unused) {
            return c0452Kf;
        }
    }

    @Override // p000.InterfaceC0717Qm
    public void serialize(InterfaceC0624Of interfaceC0624Of, List<String> list) {
        listSerializer.serialize(interfaceC0624Of, list);
    }
}

package p038G3;

import java.util.ArrayList;
import p021D3.C0274k;
import p044H3.AbstractC0646a;
import p056K2.C0887m;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: G3.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0517c {

    /* JADX INFO: renamed from: a */
    public static final ArrayList f1652a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static void m773a(AbstractC0646a abstractC0646a) {
        AbstractC1665j.m2985e(abstractC0646a, "hooker");
        if (abstractC0646a.f2058c) {
            C0887m c0887m = C0274k.f881a;
            if (!C0274k.m472o(abstractC0646a.mo1118c()) || abstractC0646a.mo1117b()) {
                ArrayList arrayList = f1652a;
                if (arrayList.contains(abstractC0646a)) {
                    return;
                }
                if ((abstractC0646a.f2056a && C0274k.m467j().m447a(abstractC0646a.mo1118c(), true)) || C0274k.m467j().m447a(abstractC0646a.mo1118c(), false)) {
                    abstractC0646a.mo1119d();
                    arrayList.add(abstractC0646a);
                }
            }
        }
    }
}

package p036c9;

import gg.C1414j;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p218og.AbstractC3149m;

/* JADX INFO: renamed from: c9.m2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0465m2 extends C1414j implements InterfaceC1231l {

    /* JADX INFO: renamed from: n */
    public static final C0465m2 f1374n = new C0465m2(1, AbstractC0921a.m2246i(AbstractC3149m.class), "isNotEmpty", "isNotEmpty(Ljava/lang/CharSequence;)Z", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        return Boolean.valueOf(str.length() > 0);
    }
}

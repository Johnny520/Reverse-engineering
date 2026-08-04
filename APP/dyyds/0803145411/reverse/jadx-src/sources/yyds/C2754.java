package yyds;

import com.android.NativeUtil;
import java.util.function.Predicate;

/* JADX INFO: renamed from: yyds.ᲈᲁᛴᛱ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2754 implements Predicate {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f13473;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1549 f13474;

    static {
        NativeUtil.classesInit0(69);
    }

    public /* synthetic */ C2754(int i, InterfaceC1549 interfaceC1549) {
        this.f13473 = i;
        this.f13474 = interfaceC1549;
    }

    @Override // java.util.function.Predicate
    public final native boolean test(Object obj);
}

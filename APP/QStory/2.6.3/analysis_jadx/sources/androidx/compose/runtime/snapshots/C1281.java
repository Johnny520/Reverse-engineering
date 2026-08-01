package androidx.compose.runtime.snapshots;

import androidx.profileinstaller.AbstractC2442;
import io.ktor.http.cio.C3974;
import java.util.Collection;
import java.util.List;
import kotlin.C5176;
import p052.InterfaceC6558;
import p287.AbstractC8405;
import p329.C8766;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1281 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f3753;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f3754;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3755;

    public /* synthetic */ C1281(C3974 c3974, int i) {
        this.f3755 = 1;
        this.f3754 = c3974;
        this.f3753 = i;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f3755;
        Object obj2 = this.f3754;
        int i2 = this.f3753;
        switch (i) {
            case 0:
                return Boolean.valueOf(((List) obj).addAll(i2, (Collection) obj2));
            case 1:
                return Boolean.valueOf(((C3974) obj2).f12220[((Integer) obj).intValue()] == i2);
            default:
                C8766 c8766 = (C8766) obj;
                c8766.m14468(Integer.valueOf(i2), AbstractC2442.m4582(2295, c8766, "喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵呜"));
                c8766.m14468((String) obj2, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜呜~喵喵喵喵喵呜喵喵"));
                return C5176.f14739;
        }
    }

    public /* synthetic */ C1281(Object obj, int i, int i2) {
        this.f3755 = i2;
        this.f3753 = i;
        this.f3754 = obj;
    }
}

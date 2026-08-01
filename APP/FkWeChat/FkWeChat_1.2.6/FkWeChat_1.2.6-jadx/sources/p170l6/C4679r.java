package p170l6;

import java.util.Map;
import p172l8.AbstractC4717x;
import p185m8.AbstractC5109u0;

/* JADX INFO: renamed from: l6.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4679r {

    /* JADX INFO: renamed from: a */
    public static final C4679r f13883a = new C4679r();

    /* JADX INFO: renamed from: b */
    public static final Map f13884b = AbstractC5109u0.m20771l(AbstractC4717x.m18815a("darcula", new C4678q("darcula", 15592941, 13400114, 6981465, 6854587, 9474192, 12301609, 6461269, 13400114, 15592941)), AbstractC4717x.m18815a("monokai", new C4678q("monokai", 16316658, 16328306, 15129460, 11436543, 16619295, 12121272, 16619295, 16316658, 16316658)), AbstractC4717x.m18815a("notepad", new C4678q("notepad", 128, 255, 8421504, 16744448, 32768, 128, 32768, 11152524, 11152524)), AbstractC4717x.m18815a("matrix", new C4678q("matrix", 34048, 34048, 2529574, 3794489, 6809191, 34048, 6809191, 34048, 34048)), AbstractC4717x.m18815a("pastel", new C4678q("pastel", 14671584, 7512015, 9686869, 9101876, 8948357, 6142101, 8948357, 13342061, 13342061)), AbstractC4717x.m18815a("atomone", new C4678q("atomone", 12303291, 13983710, 9030264, 13736550, 6054768, 15057019, 6054768, 15685999, 2865861)));

    /* JADX INFO: renamed from: c */
    public static final Map f13885c = AbstractC5109u0.m20771l(AbstractC4717x.m18815a("darcula", new C4678q("darcula", 1184274, 13400114, 6981465, 6854587, 9474192, 12301609, 6461269, 13400114, 1184274)), AbstractC4717x.m18815a("monokai", new C4678q("monokai", 460557, 16328306, 15129460, 11436543, 16619295, 12121272, 16619295, 460557, 460557)), AbstractC4717x.m18815a("notepad", new C4678q("notepad", 128, 255, 8421504, 16744448, 32768, 128, 32768, 11152524, 11152524)), AbstractC4717x.m18815a("matrix", new C4678q("matrix", 34048, 34048, 2529574, 3794489, 6809191, 34048, 6809191, 34048, 34048)), AbstractC4717x.m18815a("pastel", new C4678q("pastel", 2105631, 7512015, 9686869, 9101876, 8948357, 6142101, 8948357, 13342061, 13342061)), AbstractC4717x.m18815a("atomone", new C4678q("atomone", 3684930, 10888868, 5284175, 9988097, 10592673, 12682241, 10592673, 14964297, 5402623)));

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C4678q m18695b(C4679r c4679r, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c4679r.m18696a(z10);
    }

    /* JADX INFO: renamed from: a */
    public final C4678q m18696a(boolean z10) {
        Object obj = m18697c(z10).get("darcula");
        obj.getClass();
        return (C4678q) obj;
    }

    /* JADX INFO: renamed from: c */
    public final Map m18697c(boolean z10) {
        return z10 ? f13884b : f13885c;
    }
}

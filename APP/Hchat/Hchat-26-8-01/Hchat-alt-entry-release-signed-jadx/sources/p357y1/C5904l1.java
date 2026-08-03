package p357y1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p307v0.C4367g;

/* JADX INFO: renamed from: y1.l1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5904l1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C4367g f23973a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Bundle m10618a() {
        Map mapMo8038c = this.f23973a.mo8038c();
        Bundle bundle = new Bundle();
        for (Map.Entry entry : mapMo8038c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        return bundle;
    }
}

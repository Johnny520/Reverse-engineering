package Yue;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥۢۢۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7995 {

    /* JADX INFO: renamed from: ۥ۟ */
    @SuppressLint({"UnknownNullness"})
    public View f3178;

    /* JADX INFO: renamed from: ۥ */
    public final Map<String, Object> f3177 = new HashMap();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final ArrayList<AbstractC7956> f23769 = new ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public C7995() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7995)) {
            return false;
        }
        C7995 c7995 = (C7995) obj;
        return this.f3178 == c7995.f3178 && this.f3177.equals(c7995.f3177);
    }

    public int hashCode() {
        return (this.f3178.hashCode() * 31) + this.f3177.hashCode();
    }

    @InterfaceC6391
    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f3178 + "\n") + "    values:";
        for (String str2 : this.f3177.keySet()) {
            str = str + "    " + str2 + ": " + this.f3177.get(str2) + "\n";
        }
        return str;
    }

    public C7995(@InterfaceC6391 View view) {
        this.f3178 = view;
    }
}

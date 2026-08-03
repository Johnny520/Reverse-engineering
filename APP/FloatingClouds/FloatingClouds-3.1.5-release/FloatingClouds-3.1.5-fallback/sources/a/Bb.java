package a;

/* JADX INFO: loaded from: classes.dex */
public class Bb<T> extends androidx.lifecycle.LiveData<T> {
    public Bb() {
            r0 = this;
            r0.<init>()
            return
    }

    public void g(T r2) {
            r1 = this;
            java.lang.String r0 = "setValue"
            androidx.lifecycle.LiveData.a(r0)
            int r0 = r1.g
            int r0 = r0 + 1
            r1.g = r0
            r1.e = r2
            r2 = 0
            r1.c(r2)
            return
    }
}

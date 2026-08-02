package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ld3 {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(int i, xm0 xm0Var, String str) {
        int size;
        CopyOnWriteArrayList copyOnWriteArrayList = a;
        copyOnWriteArrayList.getClass();
        int size2 = copyOnWriteArrayList.size() - 1;
        int i2 = 0;
        if (size2 >= 0) {
            int i3 = 0;
            while (true) {
                Object obj = copyOnWriteArrayList.get(i2);
                if (!((kd3) obj).b.equals(str)) {
                    if (i3 != i2) {
                        copyOnWriteArrayList.set(i3, obj);
                    }
                    i3++;
                }
                if (i2 == size2) {
                    break;
                } else {
                    i2++;
                }
            }
            i2 = i3;
        }
        if (i2 < copyOnWriteArrayList.size() && i2 <= (size = copyOnWriteArrayList.size() - 1)) {
            while (true) {
                copyOnWriteArrayList.remove(size);
                if (size == i2) {
                    break;
                } else {
                    size--;
                }
            }
        }
        copyOnWriteArrayList.add(new kd3(i, xm0Var, str));
    }
}

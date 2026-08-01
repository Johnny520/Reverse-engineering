package p299ub;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p080f9.AbstractC2368o;
import p215oc.C5704b;
import p376zd.C9987e;
import sb.AbstractC7291q;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: ub.h0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8625h0 extends AbstractC8623g0 {

    /* JADX INFO: renamed from: ub.h0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC7282h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CharSequence f28690a;

        public a(CharSequence charSequence) {
            this.f28690a = charSequence;
        }

        @Override // sb.InterfaceC7282h
        public Iterator iterator() {
            return AbstractC8621f0.m33158q0(this.f28690a);
        }
    }

    /* JADX INFO: renamed from: A1 */
    public static char m33173A1(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        C9987e.m38645a("Char sequence has more than one element.");
        return (char) 0;
    }

    /* JADX INFO: renamed from: B1 */
    public static String m33174B1(String str, int i10) {
        str.getClass();
        if (i10 >= 0) {
            return str.substring(0, AbstractC2368o.m8582i(i10, str.length()));
        }
        C5704b.m23087a("Requested character count ", i10, " is less than zero.");
        return null;
    }

    /* JADX INFO: renamed from: u1 */
    public static InterfaceC7282h m33175u1(CharSequence charSequence) {
        charSequence.getClass();
        return ((charSequence instanceof String) && charSequence.length() == 0) ? AbstractC7291q.m28881i() : new a(charSequence);
    }

    /* JADX INFO: renamed from: v1 */
    public static String m33176v1(String str, int i10) {
        str.getClass();
        if (i10 >= 0) {
            return str.substring(AbstractC2368o.m8582i(i10, str.length()));
        }
        C5704b.m23087a("Requested character count ", i10, " is less than zero.");
        return null;
    }

    /* JADX INFO: renamed from: w1 */
    public static String m33177w1(String str, int i10) {
        str.getClass();
        if (i10 >= 0) {
            return m33174B1(str, AbstractC2368o.m8578e(str.length() - i10, 0));
        }
        C5704b.m23087a("Requested character count ", i10, " is less than zero.");
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public static char m33178x1(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* JADX INFO: renamed from: y1 */
    public static Character m33179y1(CharSequence charSequence, int i10) {
        charSequence.getClass();
        if (i10 < 0 || i10 >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i10));
    }

    /* JADX INFO: renamed from: z1 */
    public static char m33180z1(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(AbstractC8621f0.m33140h0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}

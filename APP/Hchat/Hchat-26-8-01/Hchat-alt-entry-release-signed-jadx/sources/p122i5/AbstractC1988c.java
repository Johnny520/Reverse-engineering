package p122i5;

import java.io.IOException;
import java.io.StringWriter;
import p000a.AbstractC0000a;
import p136j8.C2104o;
import p239q5.C3440a;
import p312v5.InterfaceC4480c;

/* JADX INFO: renamed from: i5.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1988c extends AbstractC0000a implements InterfaceC4480c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final char charAt(int i9) {
        return getType().charAt(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return getType().compareTo(((CharSequence) obj).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof InterfaceC4480c) {
            return getType().equals(((InterfaceC4480c) obj).getType());
        }
        if (obj instanceof CharSequence) {
            return getType().equals(obj.toString());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return getType().hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final int length() {
        return getType().length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i9, int i10) {
        return getType().subSequence(i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final String toString() {
        StringWriter stringWriter = new StringWriter();
        try {
            new C3440a(stringWriter).m7221t(this);
            return stringWriter.toString();
        } catch (IOException unused) {
            C2104o.m5281f("Unexpected IOException");
            return null;
        }
    }
}

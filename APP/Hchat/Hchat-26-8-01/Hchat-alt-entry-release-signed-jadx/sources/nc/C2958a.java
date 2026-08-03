package nc;

import java.util.Objects;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p214oc.AbstractC3127d;
import p214oc.C3126c;
import p214oc.InterfaceC3124a;
import p281t3.AbstractC4106c;

/* JADX INFO: renamed from: nc.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2958a extends AbstractC3127d {

    /* JADX INFO: renamed from: i */
    public static final C2958a f9703i = new C2958a(1, null);

    /* JADX INFO: renamed from: g */
    public final int f9704g;

    /* JADX INFO: renamed from: h */
    public final Object f9705h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2958a(int i9, Object obj) {
        this.f9704g = i9;
        this.f9705h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    public final InterfaceC3124a mo441a() {
        return C3126c.f10133f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2958a.class != obj.getClass()) {
            return false;
        }
        C2958a c2958a = (C2958a) obj;
        return this.f9704g == c2958a.f9704g && Objects.equals(this.f9705h, c2958a.f9705h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Objects.hash(AbstractC4106c.m8278a(this.f9704g), this.f9705h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str;
        int i9 = this.f9704g;
        int iM8279b = AbstractC4106c.m8279b(i9);
        if (iM8279b == 0) {
            return "null";
        }
        Object obj = this.f9705h;
        if (iM8279b == 9) {
            return AbstractC0921a.m2251n("{STRING: \"", String.valueOf(obj), "\"}");
        }
        if (iM8279b == 16) {
            return AbstractC0921a.m2251n("[", String.valueOf(obj), "]");
        }
        switch (i9) {
            case 1:
                str = "ENCODED_NULL";
                break;
            case 2:
                str = "ENCODED_BOOLEAN";
                break;
            case 3:
                str = "ENCODED_BYTE";
                break;
            case 4:
                str = "ENCODED_SHORT";
                break;
            case 5:
                str = "ENCODED_CHAR";
                break;
            case 6:
                str = "ENCODED_INT";
                break;
            case 7:
                str = "ENCODED_LONG";
                break;
            case 8:
                str = "ENCODED_FLOAT";
                break;
            case 9:
                str = "ENCODED_DOUBLE";
                break;
            case 10:
                str = "ENCODED_STRING";
                break;
            case 11:
                str = "ENCODED_TYPE";
                break;
            case 12:
                str = "ENCODED_ENUM";
                break;
            case 13:
                str = "ENCODED_FIELD";
                break;
            case 14:
                str = "ENCODED_METHOD";
                break;
            case 15:
                str = "ENCODED_METHOD_TYPE";
                break;
            case 16:
                str = "ENCODED_METHOD_HANDLE";
                break;
            case 17:
                str = "ENCODED_ARRAY";
                break;
            case 18:
                str = "ENCODED_ANNOTATION";
                break;
            default:
                throw null;
        }
        return AbstractC0255e.m1022k("{", str.substring(8), ": ", String.valueOf(obj), "}");
    }
}

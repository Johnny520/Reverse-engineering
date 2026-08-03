package Yue;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4095 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static HashSet f665 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static String f8174 = "RI_EVENT_FILTER";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static String f8175 = "RI_STREAM_FILTER";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static String f8176 = "javax.xml.stream.notations";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static String f8177 = "javax.xml.stream.entities";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String f8178 = "http://java.sun.com/xml/stream/properties/report-cdata-event";

    /* JADX INFO: renamed from: ۥ */
    public Hashtable f666;

    static {
        HashSet hashSet = new HashSet();
        f665 = hashSet;
        hashSet.add(AbstractC8553.f3552);
        f665.add(AbstractC8553.f25385);
        f665.add(AbstractC8553.f25386);
        f665.add(AbstractC8553.f25387);
        f665.add(AbstractC8554.f3553);
        f665.add(AbstractC8553.f3551);
        f665.add(AbstractC8553.f25388);
        f665.add(AbstractC8553.f25389);
        f665.add(AbstractC8553.f25390);
        f665.add(AbstractC8553.f25391);
        f665.add(f8176);
        f665.add(f8177);
        f665.add(f8178);
    }

    public C4095() {
        Hashtable hashtable = new Hashtable();
        this.f666 = hashtable;
        Boolean bool = Boolean.FALSE;
        hashtable.put(AbstractC8553.f3552, bool);
        this.f666.put(AbstractC8553.f25385, bool);
        Hashtable hashtable2 = this.f666;
        Boolean bool2 = Boolean.TRUE;
        hashtable2.put(AbstractC8553.f25386, bool2);
        this.f666.put(AbstractC8553.f25387, bool);
        this.f666.put(AbstractC8553.f3551, bool2);
        this.f666.put(AbstractC8553.f25388, bool);
        this.f666.put(AbstractC8554.f3553, bool);
    }

    /* JADX INFO: renamed from: ۥ */
    public void m1053(String str) {
        if (f665.contains(str)) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unable to access unsupported property ");
        stringBuffer.append(str);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean m1054(String str) {
        m1053(str);
        return ((Boolean) this.f666.get(str)).booleanValue();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public InterfaceC8544 m11567() {
        return (InterfaceC8544) this.f666.get(AbstractC8553.f25391);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Enumeration m11568() {
        return this.f666.keys();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Object m11569(String str) {
        m1053(str);
        return this.f666.get(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public String m11570() {
        return "1.0";
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public InterfaceC8556 m11571() {
        return (InterfaceC8556) this.f666.get(AbstractC8553.f25389);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public InterfaceC8557 m11572() {
        return (InterfaceC8557) this.f666.get(AbstractC8553.f25390);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m11573() {
        return m1054(AbstractC8553.f25385);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean m11574() {
        return m1054(AbstractC8553.f3551);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean m11575() {
        return m1054(AbstractC8554.f3553);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m11576(String str) {
        return f665.contains(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean m11577() {
        return m1054(AbstractC8553.f25386);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m11578() {
        return m1054(AbstractC8553.f25387);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean m11579() {
        return m1054(AbstractC8553.f3552);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m11580(String str, boolean z) {
        m1053(str);
        this.f666.put(str, z ? Boolean.TRUE : Boolean.FALSE);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m11581(boolean z) {
        m11580(AbstractC8553.f25385, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m11582(InterfaceC8544 interfaceC8544) {
        this.f666.put(AbstractC8553.f25391, interfaceC8544);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m11583(boolean z) {
        if (!z) {
            throw new IllegalArgumentException("This implementation does not allow disabling namespace processing");
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m11584(boolean z) {
        m11580(AbstractC8554.f3553, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m11585(String str, Object obj) {
        if (str.equals(AbstractC8553.f3552)) {
            m11588(((Boolean) obj).booleanValue());
            return;
        }
        if (str.equals(AbstractC8553.f25387)) {
            m11587(((Boolean) obj).booleanValue());
        } else if (str.equals(AbstractC8553.f3551)) {
            m11583(((Boolean) obj).booleanValue());
        } else {
            m1053(str);
            this.f666.put(str, obj);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m11586(boolean z) {
        m11580(AbstractC8553.f25386, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m11587(boolean z) {
        if (z) {
            throw new IllegalArgumentException("This implementation does not resolve external entities ");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m11588(boolean z) {
        if (z) {
            throw new IllegalArgumentException("This implementation does not support validation");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m11589(InterfaceC8556 interfaceC8556) {
        this.f666.put(AbstractC8553.f25389, interfaceC8556);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public void m11590(InterfaceC8557 interfaceC8557) {
        this.f666.put(AbstractC8553.f25390, interfaceC8557);
    }
}

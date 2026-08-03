package Yue;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7696 {

    /* JADX INFO: renamed from: ۥ */
    public int f3028 = 0;

    /* JADX INFO: renamed from: ۥ۟ */
    public C7562 f3029 = new C7562();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Map f23199 = new HashMap();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m24480(String[] strArr) throws Exception {
        C7696 c7696 = new C7696();
        c7696.m24484();
        c7696.m24485("x", "foo");
        c7696.m24485("y", "bar");
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("1 x:");
        stringBuffer.append(c7696.m24481("x"));
        printStream.println(stringBuffer.toString());
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("1 y:");
        stringBuffer2.append(c7696.m24481("y"));
        printStream.println(stringBuffer2.toString());
        c7696.m24484();
        c7696.m24485("x", "bar");
        c7696.m24485("y", "foo");
        c7696.m24484();
        c7696.m24485("x", "barbie");
        c7696.m24484();
        c7696.m3797();
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("3 x:");
        stringBuffer3.append(c7696.m24481("x"));
        printStream.println(stringBuffer3.toString());
        c7696.m3797();
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append("2 x:");
        stringBuffer4.append(c7696.m24481("x"));
        printStream.println(stringBuffer4.toString());
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append("2 y:");
        stringBuffer5.append(c7696.m24481("y"));
        printStream.println(stringBuffer5.toString());
        printStream.print(c7696);
        c7696.m3797();
        StringBuffer stringBuffer6 = new StringBuffer();
        stringBuffer6.append("1 x:");
        stringBuffer6.append(c7696.m24481("x"));
        printStream.println(stringBuffer6.toString());
        StringBuffer stringBuffer7 = new StringBuffer();
        stringBuffer7.append("1 y:");
        stringBuffer7.append(c7696.m24481("y"));
        printStream.println(stringBuffer7.toString());
        c7696.m3797();
        printStream.print(c7696);
    }

    public String toString() {
        String string = "";
        for (C7695 c7695 : this.f3029) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(string);
            stringBuffer.append(c7695);
            stringBuffer.append("\n");
            string = stringBuffer.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: ۥ */
    public void m3796() {
        this.f3028 = 0;
        this.f3029.clear();
        this.f23199.clear();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m3797() {
        int i = ((C7695) this.f3029.peek()).f23198;
        while (i == this.f3028 && !this.f3029.isEmpty()) {
            ((C7562) this.f23199.get(((C7695) this.f3029.pop()).f3026)).pop();
            if (this.f3029.isEmpty()) {
                break;
            } else {
                i = ((C7695) this.f3029.peek()).f23198;
            }
        }
        this.f3028--;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public String m24481(String str) {
        C7562 c7562 = (C7562) this.f23199.get(str);
        if (c7562 == null || c7562.isEmpty()) {
            return null;
        }
        return (String) c7562.peek();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Set m24482(String str) {
        HashSet hashSet = new HashSet();
        for (C7695 c7695 : this.f3029) {
            if (str.equals(c7695.m3795())) {
                hashSet.add(c7695.m24479());
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m24483() {
        return this.f3028;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m24484() {
        this.f3028++;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m24485(String str, String str2) {
        this.f3029.push(new C7695(str, str2, this.f3028));
        if (this.f23199.containsKey(str)) {
            ((C7562) this.f23199.get(str)).push(str2);
            return;
        }
        C7562 c7562 = new C7562();
        c7562.push(str2);
        this.f23199.put(str, c7562);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m24486() {
        return this.f3028 > 0;
    }
}

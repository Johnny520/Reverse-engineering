package Yue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4726 {

    /* JADX INFO: renamed from: ۥ */
    public int f1077;

    /* JADX INFO: renamed from: ۥ۟ */
    public C6848 f1078;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public List f10101;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public List f10102;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public String f10103;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public String f10104;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4726() {
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("[");
        stringBuffer2.append(C4606.m1561(this.f1077));
        stringBuffer2.append("]");
        stringBuffer.append(stringBuffer2.toString());
        if (this.f1078 != null) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("[name='");
            stringBuffer3.append(this.f1078);
            stringBuffer3.append("']");
            stringBuffer.append(stringBuffer3.toString());
        }
        Iterator it = this.f10102.iterator();
        while (it.hasNext()) {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(it.next());
            stringBuffer4.append(" ");
            stringBuffer.append(stringBuffer4.toString());
        }
        Iterator it2 = this.f10101.iterator();
        while (it2.hasNext()) {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append(it2.next());
            stringBuffer5.append(" ");
            stringBuffer.append(stringBuffer5.toString());
        }
        if (this.f10103 != null) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append(",data=[");
            stringBuffer6.append(this.f10103);
            stringBuffer6.append("]");
            stringBuffer.append(stringBuffer6.toString());
        }
        if (this.f10104 != null) {
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append(",extradata=[");
            stringBuffer7.append(this.f10104);
            stringBuffer7.append("]");
            stringBuffer.append(stringBuffer7.toString());
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: ۥ */
    public void m1642(Object obj) {
        this.f10101.add(obj);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m1643(Object obj) {
        this.f10102.add(obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m14201() {
        this.f1078 = null;
        this.f10101 = new ArrayList();
        this.f10102 = new ArrayList();
        this.f10103 = null;
        this.f10104 = null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public List m14202() {
        return this.f10101;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public String m14203() {
        return this.f10103;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public String m14204() {
        return this.f10104;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public String m14205() {
        return this.f1078.m3294();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public C6848 m14206() {
        return this.f1078;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public String m14207() {
        return this.f1078.m3295();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public List m14208() {
        return this.f10102;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public String m14209() {
        return this.f1078.m21588();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m14210() {
        return this.f1077;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m14211(List list) {
        this.f10101 = list;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m14212(String str) {
        this.f10103 = str;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m14213(String str) {
        this.f10104 = str;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m14214(C6848 c6848) {
        this.f1078 = c6848;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m14215(List list) {
        this.f10102 = list;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m14216(int i) {
        this.f1077 = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4726(int i) {
        this.f1077 = i;
        this.f10101 = new ArrayList();
        this.f10102 = new ArrayList();
    }
}

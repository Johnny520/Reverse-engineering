package Yue;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5249 implements InterfaceC5244 {

    /* JADX INFO: renamed from: ۥ */
    public byte[] f1364;

    /* JADX INFO: renamed from: ۥ۟ */
    public TreeMap<String, String> f1365 = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    @Override // Yue.InterfaceC5244
    public void put(String str, String str2) {
        this.f1365.put(str, str2);
    }

    @Override // Yue.InterfaceC5248
    /* JADX INFO: renamed from: ۥ۟۟ */
    public Iterator<String> mo16075() {
        return Collections.unmodifiableSet(this.f1365.keySet()).iterator();
    }

    @Override // Yue.InterfaceC5248
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public byte[] mo16076() {
        return this.f1364;
    }

    @Override // Yue.InterfaceC5248
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo16077(String str) {
        return this.f1365.containsKey(str);
    }

    @Override // Yue.InterfaceC5244
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo16071(byte[] bArr) {
        this.f1364 = bArr;
    }

    @Override // Yue.InterfaceC5248
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public String mo16078(String str) {
        String str2 = this.f1365.get(str);
        return str2 == null ? "" : str2;
    }
}

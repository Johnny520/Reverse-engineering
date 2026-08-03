package Yue;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.slf4j.spi.MDCAdapter;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3523 implements MDCAdapter {

    /* JADX INFO: renamed from: ۥ */
    public InheritableThreadLocal<Map<String, String>> f358 = new C0168();

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۦۡ$ۥ */
    public class C0168 extends InheritableThreadLocal<Map<String, String>> {
        public C0168() {
        }

        /* JADX DEBUG: Method merged with bridge method: childValue(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // java.lang.InheritableThreadLocal
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public Map<String, String> childValue(Map<String, String> map) {
            if (map == null) {
                return null;
            }
            return new HashMap(map);
        }
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void clear() {
        Map<String, String> map = this.f358.get();
        if (map != null) {
            map.clear();
            this.f358.remove();
        }
    }

    @Override // org.slf4j.spi.MDCAdapter
    public String get(String str) {
        Map<String, String> map = this.f358.get();
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void put(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("key cannot be null");
        }
        Map<String, String> map = this.f358.get();
        if (map == null) {
            map = new HashMap<>();
            this.f358.set(map);
        }
        map.put(str, str2);
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void remove(String str) {
        Map<String, String> map = this.f358.get();
        if (map != null) {
            map.remove(str);
        }
    }

    @Override // org.slf4j.spi.MDCAdapter
    /* JADX INFO: renamed from: ۥ */
    public void mo586(Map<String, String> map) {
        this.f358.set(new HashMap(map));
    }

    @Override // org.slf4j.spi.MDCAdapter
    /* JADX INFO: renamed from: ۥ۟ */
    public Map<String, String> mo587() {
        Map<String, String> map = this.f358.get();
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Set<String> m9442() {
        Map<String, String> map = this.f358.get();
        if (map != null) {
            return map.keySet();
        }
        return null;
    }
}

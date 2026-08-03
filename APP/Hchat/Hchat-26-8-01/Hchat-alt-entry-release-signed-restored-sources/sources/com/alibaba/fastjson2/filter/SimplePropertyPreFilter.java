package com.alibaba.fastjson2.filter;

import com.alibaba.fastjson2.JSONWriter;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class SimplePropertyPreFilter implements PropertyPreFilter {
    private final Class<?> clazz;
    private final Set<String> excludes;
    private final Set<String> includes;
    private int maxLevel;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SimplePropertyPreFilter(Class<?> cls, String... strArr) {
        this.includes = new HashSet();
        this.excludes = new HashSet();
        this.clazz = cls;
        for (String str : strArr) {
            if (str != null) {
                this.includes.add(str);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> getClazz() {
        return this.clazz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Set<String> getExcludes() {
        return this.excludes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Set<String> getIncludes() {
        return this.includes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getMaxLevel() {
        return this.maxLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.filter.PropertyPreFilter
    public boolean process(JSONWriter jSONWriter, Object obj, String str) {
        if (obj == null) {
            return true;
        }
        Class<?> cls = this.clazz;
        if (cls != null && !cls.isInstance(obj)) {
            return true;
        }
        if (this.excludes.contains(str)) {
            return false;
        }
        if (this.maxLevel <= 0 || jSONWriter.level() <= this.maxLevel) {
            return this.includes.size() == 0 || this.includes.contains(str);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMaxLevel(int i9) {
        this.maxLevel = i9;
    }

    public SimplePropertyPreFilter(String... strArr) {
        this(null, strArr);
    }
}

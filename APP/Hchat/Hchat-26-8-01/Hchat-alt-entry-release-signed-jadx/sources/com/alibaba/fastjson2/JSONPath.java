package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class JSONPath {
    final String path;
    public final boolean previous;
    JSONReader.Context readerContext;
    final boolean root;
    final List<JSONPathSegment> segments;
    JSONWriter.Context writerContext;
    static final JSONPath ROOT = new JSONPath("$", new ArrayList(), true, false);
    static final JSONPath PREVIOUS = new JSONPath("#-1", new ArrayList(), false, true);
    static final JSONReader.Context PARSE_CONTEXT = JSONFactory.createReadContext();

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Context {
        final JSONPathSegment current;
        boolean eval;
        final JSONPathSegment next;
        final Context parent;
        final JSONPath path;
        final long readerFeatures;
        Object root;
        Object value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Context(JSONPath jSONPath, Context context, JSONPathSegment jSONPathSegment, JSONPathSegment jSONPathSegment2, long j3) {
            this.path = jSONPath;
            this.current = jSONPathSegment;
            this.next = jSONPathSegment2;
            this.parent = context;
            this.readerFeatures = j3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONPath(String str, List<JSONPathSegment> list, boolean z9, boolean z10) {
        this.path = str;
        this.segments = list;
        this.root = z9;
        this.previous = z10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static JSONPath m1657of(String str) {
        return "#-1".equals(str) ? PREVIOUS : new JSONPathParser(str).parse();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object eval(Object obj) {
        int size;
        if (this.root || (size = this.segments.size()) == 0) {
            return obj;
        }
        int i9 = 0;
        Context context = null;
        while (i9 < size) {
            JSONPathSegment jSONPathSegment = this.segments.get(i9);
            int i10 = i9 + 1;
            Context context2 = new Context(this, context, jSONPathSegment, i10 < size ? this.segments.get(i10) : null, 0L);
            if (i9 == 0) {
                context2.root = obj;
            }
            jSONPathSegment.eval(context2);
            context = context2;
            i9 = i10;
        }
        return context.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.path;
    }
}

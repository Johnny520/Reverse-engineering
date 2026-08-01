package org.apache.commons.lang3.exception;

import com.alibaba.fastjson2.reader.C2700;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.compress.archivers.zip.C5591;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import p372.C8974;
import p372.InterfaceC8973;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class DefaultExceptionContext implements InterfaceC8973, Serializable {
    private static final long serialVersionUID = 20110706;
    private final List<Pair<String, Object>> contextValues = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lambda$getContextValues$0(String str, Pair pair) {
        String str2 = (String) pair.getKey();
        return str == null ? str2 == null : str.equals(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lambda$getFirstContextValue$1(String str, Pair pair) {
        String str2 = (String) pair.getKey();
        return str == null ? str2 == null : str.equals(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lambda$setContextValue$2(String str, Pair pair) {
        String str2 = (String) pair.getKey();
        return str == null ? str2 == null : str.equals(str2);
    }

    private Stream<Pair<String, Object>> stream() {
        return this.contextValues.stream();
    }

    @Override // p372.InterfaceC8973
    public DefaultExceptionContext addContextValue(String str, Object obj) {
        this.contextValues.add(new ImmutablePair(str, obj));
        return this;
    }

    @Override // p372.InterfaceC8973
    public List<Pair<String, Object>> getContextEntries() {
        return this.contextValues;
    }

    @Override // p372.InterfaceC8973
    public Set<String> getContextLabels() {
        return (Set) stream().map(new C8974(0)).collect(Collectors.toSet());
    }

    @Override // p372.InterfaceC8973
    public List<Object> getContextValues(String str) {
        return (List) stream().filter(new C5591(str, 2)).map(new C2700(29)).collect(Collectors.toList());
    }

    @Override // p372.InterfaceC8973
    public Object getFirstContextValue(String str) {
        return stream().filter(new C5591(str, 4)).findFirst().map(new C2700(29)).orElse(null);
    }

    @Override // p372.InterfaceC8973
    public String getFormattedExceptionMessage(String str) {
        StringBuilder sb = new StringBuilder(256);
        if (str != null) {
            sb.append(str);
        }
        if (!this.contextValues.isEmpty()) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append("Exception Context:\n");
            int i = 0;
            for (Pair<String, Object> pair : this.contextValues) {
                sb.append("\t[");
                i++;
                sb.append(i);
                sb.append(':');
                sb.append(pair.getKey());
                sb.append("=");
                try {
                    sb.append(Objects.toString(pair.getValue()));
                } catch (Exception e) {
                    sb.append("Exception thrown on toString(): ");
                    StringWriter stringWriter = new StringWriter();
                    e.printStackTrace(new PrintWriter((Writer) stringWriter, true));
                    sb.append(stringWriter.toString());
                }
                sb.append("]\n");
            }
            sb.append("---------------------------------");
        }
        return sb.toString();
    }

    @Override // p372.InterfaceC8973
    public DefaultExceptionContext setContextValue(String str, Object obj) {
        this.contextValues.removeIf(new C5591(str, 3));
        addContextValue(str, obj);
        return this;
    }
}

package org.apache.commons.lang3.exception;

import com.alibaba.fastjson2.reader.C3533;
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
import org.apache.commons.compress.archivers.zip.C6421;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import p388.C9803;
import p388.InterfaceC9802;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class DefaultExceptionContext implements InterfaceC9802, Serializable {
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

    @Override // p388.InterfaceC9802
    public DefaultExceptionContext addContextValue(String str, Object obj) {
        this.contextValues.add(new ImmutablePair(str, obj));
        return this;
    }

    @Override // p388.InterfaceC9802
    public List<Pair<String, Object>> getContextEntries() {
        return this.contextValues;
    }

    @Override // p388.InterfaceC9802
    public Set<String> getContextLabels() {
        return (Set) stream().map(new C9803(0)).collect(Collectors.toSet());
    }

    @Override // p388.InterfaceC9802
    public List<Object> getContextValues(String str) {
        return (List) stream().filter(new C6421(str, 2)).map(new C3533(29)).collect(Collectors.toList());
    }

    @Override // p388.InterfaceC9802
    public Object getFirstContextValue(String str) {
        return stream().filter(new C6421(str, 4)).findFirst().map(new C3533(29)).orElse(null);
    }

    @Override // p388.InterfaceC9802
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

    @Override // p388.InterfaceC9802
    public DefaultExceptionContext setContextValue(String str, Object obj) {
        this.contextValues.removeIf(new C6421(str, 3));
        addContextValue(str, obj);
        return this;
    }
}

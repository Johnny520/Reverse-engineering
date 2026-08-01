package org.apache.commons.lang3.exception;

import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.tuple.Pair;
import p388.InterfaceC9802;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class ContextedException extends Exception implements InterfaceC9802 {
    private static final long serialVersionUID = 20110706;
    private final InterfaceC9802 exceptionContext;

    public ContextedException(String str, Throwable th, InterfaceC9802 interfaceC9802) {
        super(str, th);
        this.exceptionContext = interfaceC9802 == null ? new DefaultExceptionContext() : interfaceC9802;
    }

    @Override // p388.InterfaceC9802
    public ContextedException addContextValue(String str, Object obj) {
        this.exceptionContext.addContextValue(str, obj);
        return this;
    }

    @Override // p388.InterfaceC9802
    public List<Pair<String, Object>> getContextEntries() {
        return this.exceptionContext.getContextEntries();
    }

    @Override // p388.InterfaceC9802
    public Set<String> getContextLabels() {
        return this.exceptionContext.getContextLabels();
    }

    @Override // p388.InterfaceC9802
    public List<Object> getContextValues(String str) {
        return this.exceptionContext.getContextValues(str);
    }

    @Override // p388.InterfaceC9802
    public Object getFirstContextValue(String str) {
        return this.exceptionContext.getFirstContextValue(str);
    }

    @Override // p388.InterfaceC9802
    public String getFormattedExceptionMessage(String str) {
        return this.exceptionContext.getFormattedExceptionMessage(str);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return getFormattedExceptionMessage(super.getMessage());
    }

    public String getRawMessage() {
        return super.getMessage();
    }

    @Override // p388.InterfaceC9802
    public ContextedException setContextValue(String str, Object obj) {
        this.exceptionContext.setContextValue(str, obj);
        return this;
    }

    public ContextedException(String str) {
        super(str);
        this.exceptionContext = new DefaultExceptionContext();
    }

    public ContextedException(String str, Throwable th) {
        super(str, th);
        this.exceptionContext = new DefaultExceptionContext();
    }

    public ContextedException() {
        this.exceptionContext = new DefaultExceptionContext();
    }

    public ContextedException(Throwable th) {
        super(th);
        this.exceptionContext = new DefaultExceptionContext();
    }
}

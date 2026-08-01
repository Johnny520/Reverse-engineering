package org.apache.commons.lang3.exception;

import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.tuple.Pair;
import p374.InterfaceC8974;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class ContextedRuntimeException extends RuntimeException implements InterfaceC8974 {
    private static final long serialVersionUID = 20110706;
    private final InterfaceC8974 exceptionContext;

    public ContextedRuntimeException(String str, Throwable th, InterfaceC8974 interfaceC8974) {
        super(str, th);
        this.exceptionContext = interfaceC8974 == null ? new DefaultExceptionContext() : interfaceC8974;
    }

    @Override // p374.InterfaceC8974
    public ContextedRuntimeException addContextValue(String str, Object obj) {
        this.exceptionContext.addContextValue(str, obj);
        return this;
    }

    @Override // p374.InterfaceC8974
    public List<Pair<String, Object>> getContextEntries() {
        return this.exceptionContext.getContextEntries();
    }

    @Override // p374.InterfaceC8974
    public Set<String> getContextLabels() {
        return this.exceptionContext.getContextLabels();
    }

    @Override // p374.InterfaceC8974
    public List<Object> getContextValues(String str) {
        return this.exceptionContext.getContextValues(str);
    }

    @Override // p374.InterfaceC8974
    public Object getFirstContextValue(String str) {
        return this.exceptionContext.getFirstContextValue(str);
    }

    @Override // p374.InterfaceC8974
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

    @Override // p374.InterfaceC8974
    public ContextedRuntimeException setContextValue(String str, Object obj) {
        this.exceptionContext.setContextValue(str, obj);
        return this;
    }

    public ContextedRuntimeException(String str) {
        super(str);
        this.exceptionContext = new DefaultExceptionContext();
    }

    public ContextedRuntimeException(String str, Throwable th) {
        super(str, th);
        this.exceptionContext = new DefaultExceptionContext();
    }

    public ContextedRuntimeException() {
        this.exceptionContext = new DefaultExceptionContext();
    }

    public ContextedRuntimeException(Throwable th) {
        super(th);
        this.exceptionContext = new DefaultExceptionContext();
    }
}

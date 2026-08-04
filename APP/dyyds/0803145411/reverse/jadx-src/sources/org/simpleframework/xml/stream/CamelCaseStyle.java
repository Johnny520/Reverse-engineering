package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class CamelCaseStyle implements Style {
    private final Builder builder;
    private final Style style;

    public CamelCaseStyle(boolean z, boolean z2) {
        CamelCaseBuilder camelCaseBuilder = new CamelCaseBuilder(z, z2);
        this.style = camelCaseBuilder;
        this.builder = new Builder(camelCaseBuilder);
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getAttribute(String str) {
        return this.builder.getAttribute(str);
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getElement(String str) {
        return this.builder.getElement(str);
    }

    public void setAttribute(String str, String str2) {
        this.builder.setAttribute(str, str2);
    }

    public void setElement(String str, String str2) {
        this.builder.setElement(str, str2);
    }

    public CamelCaseStyle(boolean z) {
        this(z, false);
    }

    public CamelCaseStyle() {
        this(true, false);
    }
}

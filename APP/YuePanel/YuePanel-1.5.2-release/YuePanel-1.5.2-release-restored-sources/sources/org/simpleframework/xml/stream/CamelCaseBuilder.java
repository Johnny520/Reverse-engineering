package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
class CamelCaseBuilder implements Style {
    protected final boolean attribute;
    protected final boolean element;

    public class Attribute extends Splitter {
        private boolean capital;

        @Override // org.simpleframework.xml.stream.Splitter
        public void commit(char[] cArr, int i, int i2) {
            this.builder.append(cArr, i, i2);
        }

        @Override // org.simpleframework.xml.stream.Splitter
        public void parse(char[] cArr, int i, int i2) {
            if (CamelCaseBuilder.this.attribute || this.capital) {
                cArr[i] = toUpper(cArr[i]);
            }
            this.capital = true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Attribute(String str) {
            super(str);
        }
    }

    public class Element extends Attribute {
        private boolean capital;

        @Override // org.simpleframework.xml.stream.CamelCaseBuilder.Attribute, org.simpleframework.xml.stream.Splitter
        public void parse(char[] cArr, int i, int i2) {
            if (CamelCaseBuilder.this.element || this.capital) {
                cArr[i] = toUpper(cArr[i]);
            }
            this.capital = true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Element(String str) {
            super(str);
        }
    }

    public CamelCaseBuilder(boolean z, boolean z2) {
        this.attribute = z2;
        this.element = z;
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getAttribute(String str) {
        if (str != null) {
            return new Attribute(str).process();
        }
        return null;
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getElement(String str) {
        if (str != null) {
            return new Element(str).process();
        }
        return null;
    }
}

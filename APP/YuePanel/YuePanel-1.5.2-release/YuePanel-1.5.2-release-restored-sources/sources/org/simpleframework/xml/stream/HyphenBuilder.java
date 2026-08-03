package org.simpleframework.xml.stream;

import net.bytebuddy.jar.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes2.dex */
class HyphenBuilder implements Style {

    public class Parser extends Splitter {
        @Override // org.simpleframework.xml.stream.Splitter
        public void commit(char[] cArr, int i, int i2) {
            this.builder.append(cArr, i, i2);
            if (i + i2 < this.count) {
                this.builder.append(SignatureVisitor.SUPER);
            }
        }

        @Override // org.simpleframework.xml.stream.Splitter
        public void parse(char[] cArr, int i, int i2) {
            cArr[i] = toLower(cArr[i]);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Parser(String str) {
            super(str);
        }
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getAttribute(String str) {
        if (str != null) {
            return new Parser(str).process();
        }
        return null;
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getElement(String str) {
        if (str != null) {
            return new Parser(str).process();
        }
        return null;
    }
}

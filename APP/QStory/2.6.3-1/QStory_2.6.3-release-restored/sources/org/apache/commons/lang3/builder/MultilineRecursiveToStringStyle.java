package org.apache.commons.lang3.builder;

import java.util.Arrays;
import org.apache.commons.lang3.AbstractC6525;
import org.apache.commons.lang3.AbstractC6531;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class MultilineRecursiveToStringStyle extends RecursiveToStringStyle {
    private static final int INDENT = 2;
    private static final long serialVersionUID = 1;
    private int spaces = 2;

    public MultilineRecursiveToStringStyle() {
        resetIndent();
    }

    private void resetIndent() {
        setArrayStart("{" + System.lineSeparator() + spacer(this.spaces));
        setArraySeparator("," + System.lineSeparator() + spacer(this.spaces));
        setArrayEnd(System.lineSeparator() + spacer(this.spaces + (-2)) + "}");
        StringBuilder sb = new StringBuilder("[");
        sb.append(System.lineSeparator());
        sb.append(spacer(this.spaces));
        setContentStart(sb.toString());
        setFieldSeparator("," + System.lineSeparator() + spacer(this.spaces));
        setContentEnd(System.lineSeparator() + spacer(this.spaces + (-2)) + "]");
    }

    private String spacer(int i) {
        int i2 = AbstractC6525.f15973;
        if (i <= 0) {
            return "";
        }
        char[] cArr = new char[i];
        Arrays.fill(cArr, ' ');
        return new String(cArr);
    }

    @Override // org.apache.commons.lang3.builder.RecursiveToStringStyle, org.apache.commons.lang3.builder.ToStringStyle
    public void appendDetail(StringBuffer stringBuffer, String str, Object obj) {
        if (AbstractC6531.f15983.containsKey(obj.getClass()) || String.class.equals(obj.getClass()) || !accept(obj.getClass())) {
            super.appendDetail(stringBuffer, str, obj);
            return;
        }
        this.spaces += 2;
        resetIndent();
        stringBuffer.append(new C6467(obj, this).toString());
        this.spaces -= 2;
        resetIndent();
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public void reflectionAppendArrayDetail(StringBuffer stringBuffer, String str, Object obj) {
        this.spaces += 2;
        resetIndent();
        super.reflectionAppendArrayDetail(stringBuffer, str, obj);
        this.spaces -= 2;
        resetIndent();
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public void appendDetail(StringBuffer stringBuffer, String str, byte[] bArr) {
        this.spaces += 2;
        resetIndent();
        super.appendDetail(stringBuffer, str, bArr);
        this.spaces -= 2;
        resetIndent();
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public void appendDetail(StringBuffer stringBuffer, String str, char[] cArr) {
        this.spaces += 2;
        resetIndent();
        super.appendDetail(stringBuffer, str, cArr);
        this.spaces -= 2;
        resetIndent();
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public void appendDetail(StringBuffer stringBuffer, String str, double[] dArr) {
        this.spaces += 2;
        resetIndent();
        super.appendDetail(stringBuffer, str, dArr);
        this.spaces -= 2;
        resetIndent();
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public void appendDetail(StringBuffer stringBuffer, String str, float[] fArr) {
        this.spaces += 2;
        resetIndent();
        super.appendDetail(stringBuffer, str, fArr);
        this.spaces -= 2;
        resetIndent();
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public void appendDetail(StringBuffer stringBuffer, String str, int[] iArr) {
        this.spaces += 2;
        resetIndent();
        super.appendDetail(stringBuffer, str, iArr);
        this.spaces -= 2;
        resetIndent();
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public void appendDetail(StringBuffer stringBuffer, String str, long[] jArr) {
        this.spaces += 2;
        resetIndent();
        super.appendDetail(stringBuffer, str, jArr);
        this.spaces -= 2;
        resetIndent();
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public void appendDetail(StringBuffer stringBuffer, String str, boolean[] zArr) {
        this.spaces += 2;
        resetIndent();
        super.appendDetail(stringBuffer, str, zArr);
        this.spaces -= 2;
        resetIndent();
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public void appendDetail(StringBuffer stringBuffer, String str, Object[] objArr) {
        this.spaces += 2;
        resetIndent();
        super.appendDetail(stringBuffer, str, objArr);
        this.spaces -= 2;
        resetIndent();
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public void appendDetail(StringBuffer stringBuffer, String str, short[] sArr) {
        this.spaces += 2;
        resetIndent();
        super.appendDetail(stringBuffer, str, sArr);
        this.spaces -= 2;
        resetIndent();
    }
}

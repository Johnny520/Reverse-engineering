package com.kongzue.dialogx.util;

/* JADX INFO: loaded from: classes2.dex */
public class InputInfo {
    private int MAX_LENGTH;
    private java.lang.Integer bottomLineColor;
    private java.lang.Integer cursorColor;
    private android.text.InputFilter[] inputFilters;
    private int inputType;
    private boolean multipleLines;
    private boolean selectAllText;
    private com.kongzue.dialogx.util.TextInfo textInfo;

    public InputInfo() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.MAX_LENGTH = r0
            return
    }

    public com.kongzue.dialogx.util.InputInfo addInputFilter(android.text.InputFilter r4) {
            r3 = this;
            r0 = 1
            android.text.InputFilter[] r1 = r3.inputFilters
            if (r1 != 0) goto Ld
            android.text.InputFilter[] r0 = new android.text.InputFilter[r0]
            r1 = 0
            r0[r1] = r4
            r3.inputFilters = r0
            goto L1b
        Ld:
            int r2 = r1.length
            int r2 = r2 + r0
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            android.text.InputFilter[] r1 = (android.text.InputFilter[]) r1
            r3.inputFilters = r1
            int r2 = r1.length
            int r2 = r2 - r0
            r1[r2] = r4
        L1b:
            return r3
    }

    public java.lang.Integer getBottomLineColor() {
            r1 = this;
            java.lang.Integer r0 = r1.bottomLineColor
            return r0
    }

    public java.lang.Integer getCursorColor() {
            r1 = this;
            java.lang.Integer r0 = r1.cursorColor
            return r0
    }

    public android.text.InputFilter[] getInputFilters() {
            r1 = this;
            android.text.InputFilter[] r0 = r1.inputFilters
            return r0
    }

    public int getInputType() {
            r1 = this;
            int r0 = r1.inputType
            return r0
    }

    public int getMAX_LENGTH() {
            r1 = this;
            int r0 = r1.MAX_LENGTH
            return r0
    }

    public com.kongzue.dialogx.util.TextInfo getTextInfo() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo r0 = r1.textInfo
            return r0
    }

    public boolean isMultipleLines() {
            r1 = this;
            boolean r0 = r1.multipleLines
            return r0
    }

    public boolean isSelectAllText() {
            r1 = this;
            boolean r0 = r1.selectAllText
            return r0
    }

    public com.kongzue.dialogx.util.InputInfo removeInputFilter(android.text.InputFilter r4) {
            r3 = this;
            android.text.InputFilter[] r0 = r3.inputFilters
            if (r0 == 0) goto L1d
            r0 = 0
        L5:
            android.text.InputFilter[] r1 = r3.inputFilters
            int r2 = r1.length
            if (r0 >= r2) goto L1d
            r2 = r1[r0]
            if (r2 != r4) goto L1a
            int r4 = r1.length
            int r4 = r4 + (-1)
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r1, r4)
            android.text.InputFilter[] r4 = (android.text.InputFilter[]) r4
            r3.inputFilters = r4
            return r3
        L1a:
            int r0 = r0 + 1
            goto L5
        L1d:
            return r3
    }

    public com.kongzue.dialogx.util.InputInfo setBottomLineColor(int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.bottomLineColor = r1
            return r0
    }

    public com.kongzue.dialogx.util.InputInfo setCursorColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.cursorColor = r1
            return r0
    }

    public com.kongzue.dialogx.util.InputInfo setInputFilters(android.text.InputFilter[] r1) {
            r0 = this;
            r0.inputFilters = r1
            return r0
    }

    public com.kongzue.dialogx.util.InputInfo setInputType(int r1) {
            r0 = this;
            r0.inputType = r1
            return r0
    }

    public com.kongzue.dialogx.util.InputInfo setMAX_LENGTH(int r1) {
            r0 = this;
            r0.MAX_LENGTH = r1
            return r0
    }

    public com.kongzue.dialogx.util.InputInfo setMultipleLines(boolean r1) {
            r0 = this;
            r0.multipleLines = r1
            return r0
    }

    public com.kongzue.dialogx.util.InputInfo setSelectAllText(boolean r1) {
            r0 = this;
            r0.selectAllText = r1
            return r0
    }

    public com.kongzue.dialogx.util.InputInfo setTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.textInfo = r1
            return r0
    }

    public com.kongzue.dialogx.util.InputInfo setThemeColor(@Yue.InterfaceC1230 int r2) {
            r1 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.cursorColor = r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.bottomLineColor = r2
            return r1
    }
}

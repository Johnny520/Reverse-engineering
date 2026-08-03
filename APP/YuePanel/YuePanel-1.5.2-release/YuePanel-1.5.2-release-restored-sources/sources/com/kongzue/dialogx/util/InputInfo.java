package com.kongzue.dialogx.util;

import Yue.InterfaceC3897;
import android.text.InputFilter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class InputInfo {
    private int MAX_LENGTH = -1;
    private Integer bottomLineColor;
    private Integer cursorColor;
    private InputFilter[] inputFilters;
    private int inputType;
    private boolean multipleLines;
    private boolean selectAllText;
    private TextInfo textInfo;

    public InputInfo addInputFilter(InputFilter inputFilter) {
        InputFilter[] inputFilterArr = this.inputFilters;
        if (inputFilterArr == null) {
            this.inputFilters = new InputFilter[]{inputFilter};
        } else {
            InputFilter[] inputFilterArr2 = (InputFilter[]) Arrays.copyOf(inputFilterArr, inputFilterArr.length + 1);
            this.inputFilters = inputFilterArr2;
            inputFilterArr2[inputFilterArr2.length - 1] = inputFilter;
        }
        return this;
    }

    public Integer getBottomLineColor() {
        return this.bottomLineColor;
    }

    public Integer getCursorColor() {
        return this.cursorColor;
    }

    public InputFilter[] getInputFilters() {
        return this.inputFilters;
    }

    public int getInputType() {
        return this.inputType;
    }

    public int getMAX_LENGTH() {
        return this.MAX_LENGTH;
    }

    public TextInfo getTextInfo() {
        return this.textInfo;
    }

    public boolean isMultipleLines() {
        return this.multipleLines;
    }

    public boolean isSelectAllText() {
        return this.selectAllText;
    }

    public InputInfo removeInputFilter(InputFilter inputFilter) {
        if (this.inputFilters != null) {
            int i = 0;
            while (true) {
                InputFilter[] inputFilterArr = this.inputFilters;
                if (i >= inputFilterArr.length) {
                    break;
                }
                if (inputFilterArr[i] == inputFilter) {
                    this.inputFilters = (InputFilter[]) Arrays.copyOf(inputFilterArr, inputFilterArr.length - 1);
                    return this;
                }
                i++;
            }
        }
        return this;
    }

    public InputInfo setBottomLineColor(int i) {
        this.bottomLineColor = Integer.valueOf(i);
        return this;
    }

    public InputInfo setCursorColor(@InterfaceC3897 int i) {
        this.cursorColor = Integer.valueOf(i);
        return this;
    }

    public InputInfo setInputFilters(InputFilter[] inputFilterArr) {
        this.inputFilters = inputFilterArr;
        return this;
    }

    public InputInfo setInputType(int i) {
        this.inputType = i;
        return this;
    }

    public InputInfo setMAX_LENGTH(int i) {
        this.MAX_LENGTH = i;
        return this;
    }

    public InputInfo setMultipleLines(boolean z) {
        this.multipleLines = z;
        return this;
    }

    public InputInfo setSelectAllText(boolean z) {
        this.selectAllText = z;
        return this;
    }

    public InputInfo setTextInfo(TextInfo textInfo) {
        this.textInfo = textInfo;
        return this;
    }

    public InputInfo setThemeColor(@InterfaceC3897 int i) {
        this.cursorColor = Integer.valueOf(i);
        this.bottomLineColor = Integer.valueOf(i);
        return this;
    }
}

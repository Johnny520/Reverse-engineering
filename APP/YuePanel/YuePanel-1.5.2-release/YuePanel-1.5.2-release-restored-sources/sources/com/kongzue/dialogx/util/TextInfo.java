package com.kongzue.dialogx.util;

import Yue.C6193;
import Yue.InterfaceC3897;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes2.dex */
public class TextInfo {
    private Typeface typeface;
    private int fontSize = -1;
    private FONT_SIZE_UNIT fontSizeUnit = FONT_SIZE_UNIT.DP;
    private int gravity = -1;
    private int fontColor = 1;
    private boolean bold = false;
    private int maxLines = -1;
    private boolean showEllipsis = false;

    /* JADX INFO: renamed from: com.kongzue.dialogx.util.TextInfo$1 */
    public static /* synthetic */ class C25651 {
        static final /* synthetic */ int[] $SwitchMap$com$kongzue$dialogx$util$TextInfo$FONT_SIZE_UNIT;

        static {
            int[] iArr = new int[FONT_SIZE_UNIT.values().length];
            $SwitchMap$com$kongzue$dialogx$util$TextInfo$FONT_SIZE_UNIT = iArr;
            try {
                iArr[FONT_SIZE_UNIT.PX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$kongzue$dialogx$util$TextInfo$FONT_SIZE_UNIT[FONT_SIZE_UNIT.SP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum FONT_SIZE_UNIT {
        DP,
        PX,
        SP
    }

    public int getFontColor() {
        return this.fontColor;
    }

    public int getFontSize() {
        return this.fontSize;
    }

    public int getFontSizeComplexUnit() {
        FONT_SIZE_UNIT font_size_unit = this.fontSizeUnit;
        if (font_size_unit == null) {
            return 1;
        }
        int i = C25651.$SwitchMap$com$kongzue$dialogx$util$TextInfo$FONT_SIZE_UNIT[font_size_unit.ordinal()];
        if (i != 1) {
            return i != 2 ? 1 : 2;
        }
        return 0;
    }

    public FONT_SIZE_UNIT getFontSizeUnit() {
        return this.fontSizeUnit;
    }

    public int getGravity() {
        return this.gravity;
    }

    public int getMaxLines() {
        return this.maxLines;
    }

    public Typeface getTypeface() {
        return this.typeface;
    }

    public boolean isBold() {
        return this.bold;
    }

    public boolean isShowEllipsis() {
        return this.showEllipsis;
    }

    public TextInfo setBold(boolean z) {
        this.bold = z;
        return this;
    }

    public TextInfo setFontColor(@InterfaceC3897 int i) {
        this.fontColor = i;
        return this;
    }

    public TextInfo setFontSize(int i) {
        this.fontSize = i;
        return this;
    }

    public TextInfo setFontSizeUnit(FONT_SIZE_UNIT font_size_unit) {
        this.fontSizeUnit = font_size_unit;
        return this;
    }

    public TextInfo setGravity(int i) {
        this.gravity = i;
        return this;
    }

    public TextInfo setMaxLines(int i) {
        this.maxLines = i;
        return this;
    }

    public TextInfo setShowEllipsis(boolean z) {
        this.showEllipsis = z;
        return this;
    }

    public TextInfo setTypeface(Typeface typeface) {
        this.typeface = typeface;
        return this;
    }

    public String toString() {
        return "TextInfo{fontSize=" + this.fontSize + ", gravity=" + this.gravity + ", fontColor=" + this.fontColor + ", bold=" + this.bold + ", maxLines=" + this.maxLines + ", showEllipsis=" + this.showEllipsis + ", typeface=" + this.typeface + C6193.f1885;
    }
}

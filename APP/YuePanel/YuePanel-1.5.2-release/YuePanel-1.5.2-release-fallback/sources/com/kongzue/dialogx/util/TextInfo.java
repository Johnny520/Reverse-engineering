package com.kongzue.dialogx.util;

/* JADX INFO: loaded from: classes2.dex */
public class TextInfo {
    private boolean bold;
    private int fontColor;
    private int fontSize;
    private com.kongzue.dialogx.util.TextInfo.FONT_SIZE_UNIT fontSizeUnit;
    private int gravity;
    private int maxLines;
    private boolean showEllipsis;
    private android.graphics.Typeface typeface;

    /* JADX INFO: renamed from: com.kongzue.dialogx.util.TextInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$kongzue$dialogx$util$TextInfo$FONT_SIZE_UNIT = null;

        static {
                com.kongzue.dialogx.util.TextInfo$FONT_SIZE_UNIT[] r0 = com.kongzue.dialogx.util.TextInfo.FONT_SIZE_UNIT.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.kongzue.dialogx.util.TextInfo.AnonymousClass1.$SwitchMap$com$kongzue$dialogx$util$TextInfo$FONT_SIZE_UNIT = r0
                com.kongzue.dialogx.util.TextInfo$FONT_SIZE_UNIT r1 = com.kongzue.dialogx.util.TextInfo.FONT_SIZE_UNIT.PX     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.kongzue.dialogx.util.TextInfo.AnonymousClass1.$SwitchMap$com$kongzue$dialogx$util$TextInfo$FONT_SIZE_UNIT     // Catch: java.lang.NoSuchFieldError -> L1d
                com.kongzue.dialogx.util.TextInfo$FONT_SIZE_UNIT r1 = com.kongzue.dialogx.util.TextInfo.FONT_SIZE_UNIT.SP     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    public enum FONT_SIZE_UNIT extends java.lang.Enum<com.kongzue.dialogx.util.TextInfo.FONT_SIZE_UNIT> {
        private static final /* synthetic */ com.kongzue.dialogx.util.TextInfo.FONT_SIZE_UNIT[] $VALUES = null;
        public static final com.kongzue.dialogx.util.TextInfo.FONT_SIZE_UNIT DP = null;
        public static final com.kongzue.dialogx.util.TextInfo.FONT_SIZE_UNIT PX = null;
        public static final com.kongzue.dialogx.util.TextInfo.FONT_SIZE_UNIT SP = null;

        static {
                com.kongzue.dialogx.util.TextInfo$FONT_SIZE_UNIT r0 = new com.kongzue.dialogx.util.TextInfo$FONT_SIZE_UNIT
                java.lang.String r1 = "DP"
                r2 = 0
                r0.<init>(r1, r2)
                com.kongzue.dialogx.util.TextInfo.FONT_SIZE_UNIT.DP = r0
                com.kongzue.dialogx.util.TextInfo$FONT_SIZE_UNIT r1 = new com.kongzue.dialogx.util.TextInfo$FONT_SIZE_UNIT
                java.lang.String r2 = "PX"
                r3 = 1
                r1.<init>(r2, r3)
                com.kongzue.dialogx.util.TextInfo.FONT_SIZE_UNIT.PX = r1
                com.kongzue.dialogx.util.TextInfo$FONT_SIZE_UNIT r2 = new com.kongzue.dialogx.util.TextInfo$FONT_SIZE_UNIT
                java.lang.String r3 = "SP"
                r4 = 2
                r2.<init>(r3, r4)
                com.kongzue.dialogx.util.TextInfo.FONT_SIZE_UNIT.SP = r2
                com.kongzue.dialogx.util.TextInfo$FONT_SIZE_UNIT[] r0 = new com.kongzue.dialogx.util.TextInfo.FONT_SIZE_UNIT[]{r0, r1, r2}
                com.kongzue.dialogx.util.TextInfo.FONT_SIZE_UNIT.$VALUES = r0
                return
        }

        FONT_SIZE_UNIT(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.kongzue.dialogx.util.TextInfo.FONT_SIZE_UNIT valueOf(java.lang.String r1) {
                java.lang.Class<com.kongzue.dialogx.util.TextInfo$FONT_SIZE_UNIT> r0 = com.kongzue.dialogx.util.TextInfo.FONT_SIZE_UNIT.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.kongzue.dialogx.util.TextInfo$FONT_SIZE_UNIT r1 = (com.kongzue.dialogx.util.TextInfo.FONT_SIZE_UNIT) r1
                return r1
        }

        public static com.kongzue.dialogx.util.TextInfo.FONT_SIZE_UNIT[] values() {
                com.kongzue.dialogx.util.TextInfo$FONT_SIZE_UNIT[] r0 = com.kongzue.dialogx.util.TextInfo.FONT_SIZE_UNIT.$VALUES
                java.lang.Object r0 = r0.clone()
                com.kongzue.dialogx.util.TextInfo$FONT_SIZE_UNIT[] r0 = (com.kongzue.dialogx.util.TextInfo.FONT_SIZE_UNIT[]) r0
                return r0
        }
    }

    public TextInfo() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.fontSize = r0
            com.kongzue.dialogx.util.TextInfo$FONT_SIZE_UNIT r1 = com.kongzue.dialogx.util.TextInfo.FONT_SIZE_UNIT.DP
            r2.fontSizeUnit = r1
            r2.gravity = r0
            r1 = 1
            r2.fontColor = r1
            r1 = 0
            r2.bold = r1
            r2.maxLines = r0
            r2.showEllipsis = r1
            return
    }

    public int getFontColor() {
            r1 = this;
            int r0 = r1.fontColor
            return r0
    }

    public int getFontSize() {
            r1 = this;
            int r0 = r1.fontSize
            return r0
    }

    public int getFontSizeComplexUnit() {
            r3 = this;
            com.kongzue.dialogx.util.TextInfo$FONT_SIZE_UNIT r0 = r3.fontSizeUnit
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            int[] r2 = com.kongzue.dialogx.util.TextInfo.AnonymousClass1.$SwitchMap$com$kongzue$dialogx$util$TextInfo$FONT_SIZE_UNIT
            int r0 = r0.ordinal()
            r0 = r2[r0]
            if (r0 == r1) goto L15
            r2 = 2
            if (r0 == r2) goto L14
            return r1
        L14:
            return r2
        L15:
            r0 = 0
            return r0
    }

    public com.kongzue.dialogx.util.TextInfo.FONT_SIZE_UNIT getFontSizeUnit() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo$FONT_SIZE_UNIT r0 = r1.fontSizeUnit
            return r0
    }

    public int getGravity() {
            r1 = this;
            int r0 = r1.gravity
            return r0
    }

    public int getMaxLines() {
            r1 = this;
            int r0 = r1.maxLines
            return r0
    }

    public android.graphics.Typeface getTypeface() {
            r1 = this;
            android.graphics.Typeface r0 = r1.typeface
            return r0
    }

    public boolean isBold() {
            r1 = this;
            boolean r0 = r1.bold
            return r0
    }

    public boolean isShowEllipsis() {
            r1 = this;
            boolean r0 = r1.showEllipsis
            return r0
    }

    public com.kongzue.dialogx.util.TextInfo setBold(boolean r1) {
            r0 = this;
            r0.bold = r1
            return r0
    }

    public com.kongzue.dialogx.util.TextInfo setFontColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            r0.fontColor = r1
            return r0
    }

    public com.kongzue.dialogx.util.TextInfo setFontSize(int r1) {
            r0 = this;
            r0.fontSize = r1
            return r0
    }

    public com.kongzue.dialogx.util.TextInfo setFontSizeUnit(com.kongzue.dialogx.util.TextInfo.FONT_SIZE_UNIT r1) {
            r0 = this;
            r0.fontSizeUnit = r1
            return r0
    }

    public com.kongzue.dialogx.util.TextInfo setGravity(int r1) {
            r0 = this;
            r0.gravity = r1
            return r0
    }

    public com.kongzue.dialogx.util.TextInfo setMaxLines(int r1) {
            r0 = this;
            r0.maxLines = r1
            return r0
    }

    public com.kongzue.dialogx.util.TextInfo setShowEllipsis(boolean r1) {
            r0 = this;
            r0.showEllipsis = r1
            return r0
    }

    public com.kongzue.dialogx.util.TextInfo setTypeface(android.graphics.Typeface r1) {
            r0 = this;
            r0.typeface = r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TextInfo{fontSize="
            r0.append(r1)
            int r1 = r2.fontSize
            r0.append(r1)
            java.lang.String r1 = ", gravity="
            r0.append(r1)
            int r1 = r2.gravity
            r0.append(r1)
            java.lang.String r1 = ", fontColor="
            r0.append(r1)
            int r1 = r2.fontColor
            r0.append(r1)
            java.lang.String r1 = ", bold="
            r0.append(r1)
            boolean r1 = r2.bold
            r0.append(r1)
            java.lang.String r1 = ", maxLines="
            r0.append(r1)
            int r1 = r2.maxLines
            r0.append(r1)
            java.lang.String r1 = ", showEllipsis="
            r0.append(r1)
            boolean r1 = r2.showEllipsis
            r0.append(r1)
            java.lang.String r1 = ", typeface="
            r0.append(r1)
            android.graphics.Typeface r1 = r2.typeface
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

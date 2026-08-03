package com.google.android.material.badge;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public final class BadgeState {
    private static final java.lang.String BADGE_RESOURCE_TAG = "badge";
    final float badgeHeight;
    final float badgeRadius;
    final float badgeWidth;
    final float badgeWithTextHeight;
    final float badgeWithTextRadius;
    final float badgeWithTextWidth;
    private final com.google.android.material.badge.BadgeState.State currentState;
    final int horizontalInset;
    final int horizontalInsetWithText;
    int offsetAlignmentMode;
    private final com.google.android.material.badge.BadgeState.State overridingState;

    public static final class State implements android.os.Parcelable {
        private static final int BADGE_NUMBER_NONE = -1;
        public static final android.os.Parcelable.Creator<com.google.android.material.badge.BadgeState.State> CREATOR = null;
        private static final int NOT_SET = -2;

        @Yue.InterfaceC1849(unit = 1)
        private java.lang.Integer additionalHorizontalOffset;

        @Yue.InterfaceC1849(unit = 1)
        private java.lang.Integer additionalVerticalOffset;
        private int alpha;
        private java.lang.Boolean autoAdjustToWithinGrandparentBounds;

        @Yue.InterfaceC1230
        private java.lang.Integer backgroundColor;
        private java.lang.Integer badgeGravity;

        @Yue.InterfaceC4992
        private java.lang.Integer badgeHorizontalPadding;

        @Yue.InterfaceC7171
        private int badgeResId;

        @Yue.InterfaceC6018
        private java.lang.Integer badgeShapeAppearanceOverlayResId;

        @Yue.InterfaceC6018
        private java.lang.Integer badgeShapeAppearanceResId;

        @Yue.InterfaceC6018
        private java.lang.Integer badgeTextAppearanceResId;

        @Yue.InterfaceC1230
        private java.lang.Integer badgeTextColor;

        @Yue.InterfaceC4992
        private java.lang.Integer badgeVerticalPadding;

        @Yue.InterfaceC6018
        private java.lang.Integer badgeWithTextShapeAppearanceOverlayResId;

        @Yue.InterfaceC6018
        private java.lang.Integer badgeWithTextShapeAppearanceResId;

        @Yue.InterfaceC5971
        private int contentDescriptionExceedsMaxBadgeNumberRes;

        @Yue.InterfaceC4544
        private java.lang.CharSequence contentDescriptionForText;

        @Yue.InterfaceC4544
        private java.lang.CharSequence contentDescriptionNumberless;

        @Yue.InterfaceC4804
        private int contentDescriptionQuantityStrings;

        @Yue.InterfaceC1849(unit = 1)
        private java.lang.Integer horizontalOffsetWithText;

        @Yue.InterfaceC1849(unit = 1)
        private java.lang.Integer horizontalOffsetWithoutText;
        private java.lang.Boolean isVisible;

        @Yue.InterfaceC1849(unit = 1)
        private java.lang.Integer largeFontVerticalOffsetAdjustment;
        private int maxCharacterCount;
        private int maxNumber;
        private int number;
        private java.util.Locale numberLocale;

        @Yue.InterfaceC4544
        private java.lang.String text;

        @Yue.InterfaceC1849(unit = 1)
        private java.lang.Integer verticalOffsetWithText;

        @Yue.InterfaceC1849(unit = 1)
        private java.lang.Integer verticalOffsetWithoutText;


        static {
                com.google.android.material.badge.BadgeState$State$1 r0 = new com.google.android.material.badge.BadgeState$State$1
                r0.<init>()
                com.google.android.material.badge.BadgeState.State.CREATOR = r0
                return
        }

        public State() {
                r1 = this;
                r1.<init>()
                r0 = 255(0xff, float:3.57E-43)
                r1.alpha = r0
                r0 = -2
                r1.number = r0
                r1.maxCharacterCount = r0
                r1.maxNumber = r0
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                r1.isVisible = r0
                return
        }

        public State(@Yue.InterfaceC4410 android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                r0 = 255(0xff, float:3.57E-43)
                r1.alpha = r0
                r0 = -2
                r1.number = r0
                r1.maxCharacterCount = r0
                r1.maxNumber = r0
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                r1.isVisible = r0
                int r0 = r2.readInt()
                r1.badgeResId = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.backgroundColor = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.badgeTextColor = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.badgeTextAppearanceResId = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.badgeShapeAppearanceResId = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.badgeShapeAppearanceOverlayResId = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.badgeWithTextShapeAppearanceResId = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.badgeWithTextShapeAppearanceOverlayResId = r0
                int r0 = r2.readInt()
                r1.alpha = r0
                java.lang.String r0 = r2.readString()
                r1.text = r0
                int r0 = r2.readInt()
                r1.number = r0
                int r0 = r2.readInt()
                r1.maxCharacterCount = r0
                int r0 = r2.readInt()
                r1.maxNumber = r0
                java.lang.String r0 = r2.readString()
                r1.contentDescriptionForText = r0
                java.lang.String r0 = r2.readString()
                r1.contentDescriptionNumberless = r0
                int r0 = r2.readInt()
                r1.contentDescriptionQuantityStrings = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.badgeGravity = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.badgeHorizontalPadding = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.badgeVerticalPadding = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.horizontalOffsetWithoutText = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.verticalOffsetWithoutText = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.horizontalOffsetWithText = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.verticalOffsetWithText = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.largeFontVerticalOffsetAdjustment = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.additionalHorizontalOffset = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.additionalVerticalOffset = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                r1.isVisible = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.util.Locale r0 = (java.util.Locale) r0
                r1.numberLocale = r0
                java.io.Serializable r2 = r2.readSerializable()
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                r1.autoAdjustToWithinGrandparentBounds = r2
                return
        }

        public static /* synthetic */ int access$000(com.google.android.material.badge.BadgeState.State r0) {
                int r0 = r0.badgeResId
                return r0
        }

        public static /* synthetic */ int access$002(com.google.android.material.badge.BadgeState.State r0, int r1) {
                r0.badgeResId = r1
                return r1
        }

        public static /* synthetic */ int access$100(com.google.android.material.badge.BadgeState.State r0) {
                int r0 = r0.alpha
                return r0
        }

        public static /* synthetic */ int access$1000(com.google.android.material.badge.BadgeState.State r0) {
                int r0 = r0.maxNumber
                return r0
        }

        public static /* synthetic */ int access$1002(com.google.android.material.badge.BadgeState.State r0, int r1) {
                r0.maxNumber = r1
                return r1
        }

        public static /* synthetic */ int access$102(com.google.android.material.badge.BadgeState.State r0, int r1) {
                r0.alpha = r1
                return r1
        }

        public static /* synthetic */ java.lang.Integer access$1100(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.badgeShapeAppearanceResId
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$1102(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.badgeShapeAppearanceResId = r1
                return r1
        }

        public static /* synthetic */ java.lang.Integer access$1200(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.badgeShapeAppearanceOverlayResId
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$1202(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.badgeShapeAppearanceOverlayResId = r1
                return r1
        }

        public static /* synthetic */ java.lang.Integer access$1300(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.badgeWithTextShapeAppearanceResId
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$1302(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.badgeWithTextShapeAppearanceResId = r1
                return r1
        }

        public static /* synthetic */ java.lang.Integer access$1400(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.badgeWithTextShapeAppearanceOverlayResId
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$1402(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.badgeWithTextShapeAppearanceOverlayResId = r1
                return r1
        }

        public static /* synthetic */ java.lang.Integer access$1500(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.backgroundColor
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$1502(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.backgroundColor = r1
                return r1
        }

        public static /* synthetic */ java.lang.Integer access$1600(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.badgeTextAppearanceResId
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$1602(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.badgeTextAppearanceResId = r1
                return r1
        }

        public static /* synthetic */ java.lang.Integer access$1700(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.badgeTextColor
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$1702(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.badgeTextColor = r1
                return r1
        }

        public static /* synthetic */ java.lang.Integer access$1800(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.badgeGravity
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$1802(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.badgeGravity = r1
                return r1
        }

        public static /* synthetic */ java.lang.Integer access$1900(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.badgeHorizontalPadding
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$1902(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.badgeHorizontalPadding = r1
                return r1
        }

        public static /* synthetic */ int access$200(com.google.android.material.badge.BadgeState.State r0) {
                int r0 = r0.number
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$2000(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.badgeVerticalPadding
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$2002(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.badgeVerticalPadding = r1
                return r1
        }

        public static /* synthetic */ int access$202(com.google.android.material.badge.BadgeState.State r0, int r1) {
                r0.number = r1
                return r1
        }

        public static /* synthetic */ java.lang.Integer access$2100(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.horizontalOffsetWithoutText
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$2102(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.horizontalOffsetWithoutText = r1
                return r1
        }

        public static /* synthetic */ java.lang.Integer access$2200(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.verticalOffsetWithoutText
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$2202(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.verticalOffsetWithoutText = r1
                return r1
        }

        public static /* synthetic */ java.lang.Integer access$2300(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.horizontalOffsetWithText
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$2302(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.horizontalOffsetWithText = r1
                return r1
        }

        public static /* synthetic */ java.lang.Integer access$2400(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.verticalOffsetWithText
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$2402(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.verticalOffsetWithText = r1
                return r1
        }

        public static /* synthetic */ java.lang.Integer access$2500(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.largeFontVerticalOffsetAdjustment
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$2502(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.largeFontVerticalOffsetAdjustment = r1
                return r1
        }

        public static /* synthetic */ java.lang.Integer access$2600(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.additionalHorizontalOffset
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$2602(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.additionalHorizontalOffset = r1
                return r1
        }

        public static /* synthetic */ java.lang.Integer access$2700(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.additionalVerticalOffset
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$2702(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.additionalVerticalOffset = r1
                return r1
        }

        public static /* synthetic */ java.lang.Boolean access$2800(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Boolean r0 = r0.autoAdjustToWithinGrandparentBounds
                return r0
        }

        public static /* synthetic */ java.lang.Boolean access$2802(com.google.android.material.badge.BadgeState.State r0, java.lang.Boolean r1) {
                r0.autoAdjustToWithinGrandparentBounds = r1
                return r1
        }

        public static /* synthetic */ java.util.Locale access$2900(com.google.android.material.badge.BadgeState.State r0) {
                java.util.Locale r0 = r0.numberLocale
                return r0
        }

        public static /* synthetic */ java.util.Locale access$2902(com.google.android.material.badge.BadgeState.State r0, java.util.Locale r1) {
                r0.numberLocale = r1
                return r1
        }

        public static /* synthetic */ java.lang.String access$300(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.String r0 = r0.text
                return r0
        }

        public static /* synthetic */ java.lang.String access$302(com.google.android.material.badge.BadgeState.State r0, java.lang.String r1) {
                r0.text = r1
                return r1
        }

        public static /* synthetic */ java.lang.CharSequence access$400(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.CharSequence r0 = r0.contentDescriptionForText
                return r0
        }

        public static /* synthetic */ java.lang.CharSequence access$402(com.google.android.material.badge.BadgeState.State r0, java.lang.CharSequence r1) {
                r0.contentDescriptionForText = r1
                return r1
        }

        public static /* synthetic */ java.lang.CharSequence access$500(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.CharSequence r0 = r0.contentDescriptionNumberless
                return r0
        }

        public static /* synthetic */ java.lang.CharSequence access$502(com.google.android.material.badge.BadgeState.State r0, java.lang.CharSequence r1) {
                r0.contentDescriptionNumberless = r1
                return r1
        }

        public static /* synthetic */ int access$600(com.google.android.material.badge.BadgeState.State r0) {
                int r0 = r0.contentDescriptionQuantityStrings
                return r0
        }

        public static /* synthetic */ int access$602(com.google.android.material.badge.BadgeState.State r0, int r1) {
                r0.contentDescriptionQuantityStrings = r1
                return r1
        }

        public static /* synthetic */ int access$700(com.google.android.material.badge.BadgeState.State r0) {
                int r0 = r0.contentDescriptionExceedsMaxBadgeNumberRes
                return r0
        }

        public static /* synthetic */ int access$702(com.google.android.material.badge.BadgeState.State r0, int r1) {
                r0.contentDescriptionExceedsMaxBadgeNumberRes = r1
                return r1
        }

        public static /* synthetic */ java.lang.Boolean access$800(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Boolean r0 = r0.isVisible
                return r0
        }

        public static /* synthetic */ java.lang.Boolean access$802(com.google.android.material.badge.BadgeState.State r0, java.lang.Boolean r1) {
                r0.isVisible = r1
                return r1
        }

        public static /* synthetic */ int access$900(com.google.android.material.badge.BadgeState.State r0) {
                int r0 = r0.maxCharacterCount
                return r0
        }

        public static /* synthetic */ int access$902(com.google.android.material.badge.BadgeState.State r0, int r1) {
                r0.maxCharacterCount = r1
                return r1
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Yue.InterfaceC4410 android.os.Parcel r2, int r3) {
                r1 = this;
                int r3 = r1.badgeResId
                r2.writeInt(r3)
                java.lang.Integer r3 = r1.backgroundColor
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.badgeTextColor
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.badgeTextAppearanceResId
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.badgeShapeAppearanceResId
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.badgeShapeAppearanceOverlayResId
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.badgeWithTextShapeAppearanceResId
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.badgeWithTextShapeAppearanceOverlayResId
                r2.writeSerializable(r3)
                int r3 = r1.alpha
                r2.writeInt(r3)
                java.lang.String r3 = r1.text
                r2.writeString(r3)
                int r3 = r1.number
                r2.writeInt(r3)
                int r3 = r1.maxCharacterCount
                r2.writeInt(r3)
                int r3 = r1.maxNumber
                r2.writeInt(r3)
                java.lang.CharSequence r3 = r1.contentDescriptionForText
                r0 = 0
                if (r3 == 0) goto L4b
                java.lang.String r3 = r3.toString()
                goto L4c
            L4b:
                r3 = r0
            L4c:
                r2.writeString(r3)
                java.lang.CharSequence r3 = r1.contentDescriptionNumberless
                if (r3 == 0) goto L57
                java.lang.String r0 = r3.toString()
            L57:
                r2.writeString(r0)
                int r3 = r1.contentDescriptionQuantityStrings
                r2.writeInt(r3)
                java.lang.Integer r3 = r1.badgeGravity
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.badgeHorizontalPadding
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.badgeVerticalPadding
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.horizontalOffsetWithoutText
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.verticalOffsetWithoutText
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.horizontalOffsetWithText
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.verticalOffsetWithText
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.largeFontVerticalOffsetAdjustment
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.additionalHorizontalOffset
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.additionalVerticalOffset
                r2.writeSerializable(r3)
                java.lang.Boolean r3 = r1.isVisible
                r2.writeSerializable(r3)
                java.util.Locale r3 = r1.numberLocale
                r2.writeSerializable(r3)
                java.lang.Boolean r3 = r1.autoAdjustToWithinGrandparentBounds
                r2.writeSerializable(r3)
                return
        }
    }

    public BadgeState(android.content.Context r6, @Yue.InterfaceC7171 int r7, @Yue.InterfaceC0642 int r8, @Yue.InterfaceC6018 int r9, @Yue.InterfaceC4544 com.google.android.material.badge.BadgeState.State r10) {
            r5 = this;
            r5.<init>()
            com.google.android.material.badge.BadgeState$State r0 = new com.google.android.material.badge.BadgeState$State
            r0.<init>()
            r5.currentState = r0
            if (r10 != 0) goto L11
            com.google.android.material.badge.BadgeState$State r10 = new com.google.android.material.badge.BadgeState$State
            r10.<init>()
        L11:
            if (r7 == 0) goto L16
            com.google.android.material.badge.BadgeState.State.access$002(r10, r7)
        L16:
            int r7 = com.google.android.material.badge.BadgeState.State.access$000(r10)
            android.content.res.TypedArray r7 = r5.generateTypedArray(r6, r7, r8, r9)
            android.content.res.Resources r8 = r6.getResources()
            int r9 = com.google.android.material.R.styleable.Badge_badgeRadius
            r1 = -1
            int r9 = r7.getDimensionPixelSize(r9, r1)
            float r9 = (float) r9
            r5.badgeRadius = r9
            android.content.res.Resources r9 = r6.getResources()
            int r2 = com.google.android.material.R.dimen.mtrl_badge_horizontal_edge_offset
            int r9 = r9.getDimensionPixelSize(r2)
            r5.horizontalInset = r9
            android.content.res.Resources r9 = r6.getResources()
            int r2 = com.google.android.material.R.dimen.mtrl_badge_text_horizontal_edge_offset
            int r9 = r9.getDimensionPixelSize(r2)
            r5.horizontalInsetWithText = r9
            int r9 = com.google.android.material.R.styleable.Badge_badgeWithTextRadius
            int r9 = r7.getDimensionPixelSize(r9, r1)
            float r9 = (float) r9
            r5.badgeWithTextRadius = r9
            int r9 = com.google.android.material.R.styleable.Badge_badgeWidth
            int r2 = com.google.android.material.R.dimen.m3_badge_size
            float r2 = r8.getDimension(r2)
            float r9 = r7.getDimension(r9, r2)
            r5.badgeWidth = r9
            int r9 = com.google.android.material.R.styleable.Badge_badgeWithTextWidth
            int r2 = com.google.android.material.R.dimen.m3_badge_with_text_size
            float r2 = r8.getDimension(r2)
            float r9 = r7.getDimension(r9, r2)
            r5.badgeWithTextWidth = r9
            int r9 = com.google.android.material.R.styleable.Badge_badgeHeight
            int r2 = com.google.android.material.R.dimen.m3_badge_size
            float r2 = r8.getDimension(r2)
            float r9 = r7.getDimension(r9, r2)
            r5.badgeHeight = r9
            int r9 = com.google.android.material.R.styleable.Badge_badgeWithTextHeight
            int r2 = com.google.android.material.R.dimen.m3_badge_with_text_size
            float r2 = r8.getDimension(r2)
            float r9 = r7.getDimension(r9, r2)
            r5.badgeWithTextHeight = r9
            int r9 = com.google.android.material.R.styleable.Badge_offsetAlignmentMode
            r2 = 1
            int r9 = r7.getInt(r9, r2)
            r5.offsetAlignmentMode = r9
            int r9 = com.google.android.material.badge.BadgeState.State.access$100(r10)
            r3 = -2
            if (r9 != r3) goto L98
            r9 = 255(0xff, float:3.57E-43)
            goto L9c
        L98:
            int r9 = com.google.android.material.badge.BadgeState.State.access$100(r10)
        L9c:
            com.google.android.material.badge.BadgeState.State.access$102(r0, r9)
            int r9 = com.google.android.material.badge.BadgeState.State.access$200(r10)
            r4 = 0
            if (r9 == r3) goto Lae
            int r9 = com.google.android.material.badge.BadgeState.State.access$200(r10)
            com.google.android.material.badge.BadgeState.State.access$202(r0, r9)
            goto Lc3
        Lae:
            int r9 = com.google.android.material.R.styleable.Badge_number
            boolean r9 = r7.hasValue(r9)
            if (r9 == 0) goto Lc0
            int r9 = com.google.android.material.R.styleable.Badge_number
            int r9 = r7.getInt(r9, r4)
            com.google.android.material.badge.BadgeState.State.access$202(r0, r9)
            goto Lc3
        Lc0:
            com.google.android.material.badge.BadgeState.State.access$202(r0, r1)
        Lc3:
            java.lang.String r9 = com.google.android.material.badge.BadgeState.State.access$300(r10)
            if (r9 == 0) goto Ld1
            java.lang.String r9 = com.google.android.material.badge.BadgeState.State.access$300(r10)
            com.google.android.material.badge.BadgeState.State.access$302(r0, r9)
            goto Le2
        Ld1:
            int r9 = com.google.android.material.R.styleable.Badge_badgeText
            boolean r9 = r7.hasValue(r9)
            if (r9 == 0) goto Le2
            int r9 = com.google.android.material.R.styleable.Badge_badgeText
            java.lang.String r9 = r7.getString(r9)
            com.google.android.material.badge.BadgeState.State.access$302(r0, r9)
        Le2:
            java.lang.CharSequence r9 = com.google.android.material.badge.BadgeState.State.access$400(r10)
            com.google.android.material.badge.BadgeState.State.access$402(r0, r9)
            java.lang.CharSequence r9 = com.google.android.material.badge.BadgeState.State.access$500(r10)
            if (r9 != 0) goto Lf6
            int r9 = com.google.android.material.R.string.mtrl_badge_numberless_content_description
            java.lang.String r9 = r6.getString(r9)
            goto Lfa
        Lf6:
            java.lang.CharSequence r9 = com.google.android.material.badge.BadgeState.State.access$500(r10)
        Lfa:
            com.google.android.material.badge.BadgeState.State.access$502(r0, r9)
            int r9 = com.google.android.material.badge.BadgeState.State.access$600(r10)
            if (r9 != 0) goto L106
            int r9 = com.google.android.material.R.plurals.mtrl_badge_content_description
            goto L10a
        L106:
            int r9 = com.google.android.material.badge.BadgeState.State.access$600(r10)
        L10a:
            com.google.android.material.badge.BadgeState.State.access$602(r0, r9)
            int r9 = com.google.android.material.badge.BadgeState.State.access$700(r10)
            if (r9 != 0) goto L116
            int r9 = com.google.android.material.R.string.mtrl_exceed_max_badge_number_content_description
            goto L11a
        L116:
            int r9 = com.google.android.material.badge.BadgeState.State.access$700(r10)
        L11a:
            com.google.android.material.badge.BadgeState.State.access$702(r0, r9)
            java.lang.Boolean r9 = com.google.android.material.badge.BadgeState.State.access$800(r10)
            if (r9 == 0) goto L12f
            java.lang.Boolean r9 = com.google.android.material.badge.BadgeState.State.access$800(r10)
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L12e
            goto L12f
        L12e:
            r2 = r4
        L12f:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            com.google.android.material.badge.BadgeState.State.access$802(r0, r9)
            int r9 = com.google.android.material.badge.BadgeState.State.access$900(r10)
            if (r9 != r3) goto L143
            int r9 = com.google.android.material.R.styleable.Badge_maxCharacterCount
            int r9 = r7.getInt(r9, r3)
            goto L147
        L143:
            int r9 = com.google.android.material.badge.BadgeState.State.access$900(r10)
        L147:
            com.google.android.material.badge.BadgeState.State.access$902(r0, r9)
            int r9 = com.google.android.material.badge.BadgeState.State.access$1000(r10)
            if (r9 != r3) goto L157
            int r9 = com.google.android.material.R.styleable.Badge_maxNumber
            int r9 = r7.getInt(r9, r3)
            goto L15b
        L157:
            int r9 = com.google.android.material.badge.BadgeState.State.access$1000(r10)
        L15b:
            com.google.android.material.badge.BadgeState.State.access$1002(r0, r9)
            java.lang.Integer r9 = com.google.android.material.badge.BadgeState.State.access$1100(r10)
            if (r9 != 0) goto L16d
            int r9 = com.google.android.material.R.styleable.Badge_badgeShapeAppearance
            int r1 = com.google.android.material.R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full
            int r9 = r7.getResourceId(r9, r1)
            goto L175
        L16d:
            java.lang.Integer r9 = com.google.android.material.badge.BadgeState.State.access$1100(r10)
            int r9 = r9.intValue()
        L175:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            com.google.android.material.badge.BadgeState.State.access$1102(r0, r9)
            java.lang.Integer r9 = com.google.android.material.badge.BadgeState.State.access$1200(r10)
            if (r9 != 0) goto L189
            int r9 = com.google.android.material.R.styleable.Badge_badgeShapeAppearanceOverlay
            int r9 = r7.getResourceId(r9, r4)
            goto L191
        L189:
            java.lang.Integer r9 = com.google.android.material.badge.BadgeState.State.access$1200(r10)
            int r9 = r9.intValue()
        L191:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            com.google.android.material.badge.BadgeState.State.access$1202(r0, r9)
            java.lang.Integer r9 = com.google.android.material.badge.BadgeState.State.access$1300(r10)
            if (r9 != 0) goto L1a7
            int r9 = com.google.android.material.R.styleable.Badge_badgeWithTextShapeAppearance
            int r1 = com.google.android.material.R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full
            int r9 = r7.getResourceId(r9, r1)
            goto L1af
        L1a7:
            java.lang.Integer r9 = com.google.android.material.badge.BadgeState.State.access$1300(r10)
            int r9 = r9.intValue()
        L1af:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            com.google.android.material.badge.BadgeState.State.access$1302(r0, r9)
            java.lang.Integer r9 = com.google.android.material.badge.BadgeState.State.access$1400(r10)
            if (r9 != 0) goto L1c3
            int r9 = com.google.android.material.R.styleable.Badge_badgeWithTextShapeAppearanceOverlay
            int r9 = r7.getResourceId(r9, r4)
            goto L1cb
        L1c3:
            java.lang.Integer r9 = com.google.android.material.badge.BadgeState.State.access$1400(r10)
            int r9 = r9.intValue()
        L1cb:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            com.google.android.material.badge.BadgeState.State.access$1402(r0, r9)
            java.lang.Integer r9 = com.google.android.material.badge.BadgeState.State.access$1500(r10)
            if (r9 != 0) goto L1df
            int r9 = com.google.android.material.R.styleable.Badge_backgroundColor
            int r9 = readColorFromAttributes(r6, r7, r9)
            goto L1e7
        L1df:
            java.lang.Integer r9 = com.google.android.material.badge.BadgeState.State.access$1500(r10)
            int r9 = r9.intValue()
        L1e7:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            com.google.android.material.badge.BadgeState.State.access$1502(r0, r9)
            java.lang.Integer r9 = com.google.android.material.badge.BadgeState.State.access$1600(r10)
            if (r9 != 0) goto L1fd
            int r9 = com.google.android.material.R.styleable.Badge_badgeTextAppearance
            int r1 = com.google.android.material.R.style.TextAppearance_MaterialComponents_Badge
            int r9 = r7.getResourceId(r9, r1)
            goto L205
        L1fd:
            java.lang.Integer r9 = com.google.android.material.badge.BadgeState.State.access$1600(r10)
            int r9 = r9.intValue()
        L205:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            com.google.android.material.badge.BadgeState.State.access$1602(r0, r9)
            java.lang.Integer r9 = com.google.android.material.badge.BadgeState.State.access$1700(r10)
            if (r9 == 0) goto L21a
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$1700(r10)
            com.google.android.material.badge.BadgeState.State.access$1702(r0, r6)
            goto L24c
        L21a:
            int r9 = com.google.android.material.R.styleable.Badge_badgeTextColor
            boolean r9 = r7.hasValue(r9)
            if (r9 == 0) goto L230
            int r9 = com.google.android.material.R.styleable.Badge_badgeTextColor
            int r6 = readColorFromAttributes(r6, r7, r9)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.material.badge.BadgeState.State.access$1702(r0, r6)
            goto L24c
        L230:
            com.google.android.material.resources.TextAppearance r9 = new com.google.android.material.resources.TextAppearance
            java.lang.Integer r1 = com.google.android.material.badge.BadgeState.State.access$1600(r0)
            int r1 = r1.intValue()
            r9.<init>(r6, r1)
            android.content.res.ColorStateList r6 = r9.getTextColor()
            int r6 = r6.getDefaultColor()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.material.badge.BadgeState.State.access$1702(r0, r6)
        L24c:
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$1800(r10)
            if (r6 != 0) goto L25c
            int r6 = com.google.android.material.R.styleable.Badge_badgeGravity
            r9 = 8388661(0x800035, float:1.1755018E-38)
            int r6 = r7.getInt(r6, r9)
            goto L264
        L25c:
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$1800(r10)
            int r6 = r6.intValue()
        L264:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.material.badge.BadgeState.State.access$1802(r0, r6)
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$1900(r10)
            if (r6 != 0) goto L27e
            int r6 = com.google.android.material.R.styleable.Badge_badgeWidePadding
            int r9 = com.google.android.material.R.dimen.mtrl_badge_long_text_horizontal_padding
            int r9 = r8.getDimensionPixelSize(r9)
            int r6 = r7.getDimensionPixelSize(r6, r9)
            goto L286
        L27e:
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$1900(r10)
            int r6 = r6.intValue()
        L286:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.material.badge.BadgeState.State.access$1902(r0, r6)
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$2000(r10)
            if (r6 != 0) goto L2a0
            int r6 = com.google.android.material.R.styleable.Badge_badgeVerticalPadding
            int r9 = com.google.android.material.R.dimen.m3_badge_with_text_vertical_padding
            int r8 = r8.getDimensionPixelSize(r9)
            int r6 = r7.getDimensionPixelSize(r6, r8)
            goto L2a8
        L2a0:
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$2000(r10)
            int r6 = r6.intValue()
        L2a8:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.material.badge.BadgeState.State.access$2002(r0, r6)
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$2100(r10)
            if (r6 != 0) goto L2bc
            int r6 = com.google.android.material.R.styleable.Badge_horizontalOffset
            int r6 = r7.getDimensionPixelOffset(r6, r4)
            goto L2c4
        L2bc:
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$2100(r10)
            int r6 = r6.intValue()
        L2c4:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.material.badge.BadgeState.State.access$2102(r0, r6)
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$2200(r10)
            if (r6 != 0) goto L2d8
            int r6 = com.google.android.material.R.styleable.Badge_verticalOffset
            int r6 = r7.getDimensionPixelOffset(r6, r4)
            goto L2e0
        L2d8:
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$2200(r10)
            int r6 = r6.intValue()
        L2e0:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.material.badge.BadgeState.State.access$2202(r0, r6)
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$2300(r10)
            if (r6 != 0) goto L2fc
            int r6 = com.google.android.material.R.styleable.Badge_horizontalOffsetWithText
            java.lang.Integer r8 = com.google.android.material.badge.BadgeState.State.access$2100(r0)
            int r8 = r8.intValue()
            int r6 = r7.getDimensionPixelOffset(r6, r8)
            goto L304
        L2fc:
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$2300(r10)
            int r6 = r6.intValue()
        L304:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.material.badge.BadgeState.State.access$2302(r0, r6)
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$2400(r10)
            if (r6 != 0) goto L320
            int r6 = com.google.android.material.R.styleable.Badge_verticalOffsetWithText
            java.lang.Integer r8 = com.google.android.material.badge.BadgeState.State.access$2200(r0)
            int r8 = r8.intValue()
            int r6 = r7.getDimensionPixelOffset(r6, r8)
            goto L328
        L320:
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$2400(r10)
            int r6 = r6.intValue()
        L328:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.material.badge.BadgeState.State.access$2402(r0, r6)
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$2500(r10)
            if (r6 != 0) goto L33c
            int r6 = com.google.android.material.R.styleable.Badge_largeFontVerticalOffsetAdjustment
            int r6 = r7.getDimensionPixelOffset(r6, r4)
            goto L344
        L33c:
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$2500(r10)
            int r6 = r6.intValue()
        L344:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.material.badge.BadgeState.State.access$2502(r0, r6)
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$2600(r10)
            if (r6 != 0) goto L353
            r6 = r4
            goto L35b
        L353:
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$2600(r10)
            int r6 = r6.intValue()
        L35b:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.material.badge.BadgeState.State.access$2602(r0, r6)
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$2700(r10)
            if (r6 != 0) goto L36a
            r6 = r4
            goto L372
        L36a:
            java.lang.Integer r6 = com.google.android.material.badge.BadgeState.State.access$2700(r10)
            int r6 = r6.intValue()
        L372:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.material.badge.BadgeState.State.access$2702(r0, r6)
            java.lang.Boolean r6 = com.google.android.material.badge.BadgeState.State.access$2800(r10)
            if (r6 != 0) goto L386
            int r6 = com.google.android.material.R.styleable.Badge_autoAdjustToWithinGrandparentBounds
            boolean r6 = r7.getBoolean(r6, r4)
            goto L38e
        L386:
            java.lang.Boolean r6 = com.google.android.material.badge.BadgeState.State.access$2800(r10)
            boolean r6 = r6.booleanValue()
        L38e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            com.google.android.material.badge.BadgeState.State.access$2802(r0, r6)
            r7.recycle()
            java.util.Locale r6 = com.google.android.material.badge.BadgeState.State.access$2900(r10)
            if (r6 != 0) goto L3a8
            java.util.Locale$Category r6 = java.util.Locale.Category.FORMAT
            java.util.Locale r6 = java.util.Locale.getDefault(r6)
            com.google.android.material.badge.BadgeState.State.access$2902(r0, r6)
            goto L3af
        L3a8:
            java.util.Locale r6 = com.google.android.material.badge.BadgeState.State.access$2900(r10)
            com.google.android.material.badge.BadgeState.State.access$2902(r0, r6)
        L3af:
            r5.overridingState = r10
            return
    }

    private android.content.res.TypedArray generateTypedArray(android.content.Context r8, @Yue.InterfaceC7171 int r9, @Yue.InterfaceC0642 int r10, @Yue.InterfaceC6018 int r11) {
            r7 = this;
            r0 = 0
            if (r9 == 0) goto Lf
            java.lang.String r1 = "badge"
            android.util.AttributeSet r9 = com.google.android.material.drawable.DrawableUtils.parseDrawableXml(r8, r9, r1)
            int r1 = r9.getStyleAttribute()
            r2 = r9
            goto L12
        Lf:
            r9 = 0
            r2 = r9
            r1 = r0
        L12:
            if (r1 != 0) goto L16
            r5 = r11
            goto L17
        L16:
            r5 = r1
        L17:
            int[] r3 = com.google.android.material.R.styleable.Badge
            int[] r6 = new int[r0]
            r1 = r8
            r4 = r10
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r1, r2, r3, r4, r5, r6)
            return r8
    }

    private static int readColorFromAttributes(android.content.Context r0, @Yue.InterfaceC4410 android.content.res.TypedArray r1, @Yue.InterfaceC6031 int r2) {
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r1, r2)
            int r0 = r0.getDefaultColor()
            return r0
    }

    public void clearNumber() {
            r1 = this;
            r0 = -1
            r1.setNumber(r0)
            return
    }

    public void clearText() {
            r1 = this;
            r0 = 0
            r1.setText(r0)
            return
    }

    @Yue.InterfaceC1849(unit = 1)
    public int getAdditionalHorizontalOffset() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$2600(r0)
            int r0 = r0.intValue()
            return r0
    }

    @Yue.InterfaceC1849(unit = 1)
    public int getAdditionalVerticalOffset() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$2700(r0)
            int r0 = r0.intValue()
            return r0
    }

    public int getAlpha() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            int r0 = com.google.android.material.badge.BadgeState.State.access$100(r0)
            return r0
    }

    @Yue.InterfaceC1230
    public int getBackgroundColor() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$1500(r0)
            int r0 = r0.intValue()
            return r0
    }

    public int getBadgeGravity() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$1800(r0)
            int r0 = r0.intValue()
            return r0
    }

    @Yue.InterfaceC4992
    public int getBadgeHorizontalPadding() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$1900(r0)
            int r0 = r0.intValue()
            return r0
    }

    public int getBadgeShapeAppearanceOverlayResId() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$1200(r0)
            int r0 = r0.intValue()
            return r0
    }

    public int getBadgeShapeAppearanceResId() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$1100(r0)
            int r0 = r0.intValue()
            return r0
    }

    @Yue.InterfaceC1230
    public int getBadgeTextColor() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$1700(r0)
            int r0 = r0.intValue()
            return r0
    }

    @Yue.InterfaceC4992
    public int getBadgeVerticalPadding() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$2000(r0)
            int r0 = r0.intValue()
            return r0
    }

    public int getBadgeWithTextShapeAppearanceOverlayResId() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$1400(r0)
            int r0 = r0.intValue()
            return r0
    }

    public int getBadgeWithTextShapeAppearanceResId() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$1300(r0)
            int r0 = r0.intValue()
            return r0
    }

    @Yue.InterfaceC5971
    public int getContentDescriptionExceedsMaxBadgeNumberStringResource() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            int r0 = com.google.android.material.badge.BadgeState.State.access$700(r0)
            return r0
    }

    public java.lang.CharSequence getContentDescriptionForText() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.CharSequence r0 = com.google.android.material.badge.BadgeState.State.access$400(r0)
            return r0
    }

    public java.lang.CharSequence getContentDescriptionNumberless() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.CharSequence r0 = com.google.android.material.badge.BadgeState.State.access$500(r0)
            return r0
    }

    @Yue.InterfaceC4804
    public int getContentDescriptionQuantityStrings() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            int r0 = com.google.android.material.badge.BadgeState.State.access$600(r0)
            return r0
    }

    @Yue.InterfaceC1849(unit = 1)
    public int getHorizontalOffsetWithText() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$2300(r0)
            int r0 = r0.intValue()
            return r0
    }

    @Yue.InterfaceC1849(unit = 1)
    public int getHorizontalOffsetWithoutText() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$2100(r0)
            int r0 = r0.intValue()
            return r0
    }

    @Yue.InterfaceC1849(unit = 1)
    public int getLargeFontVerticalOffsetAdjustment() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$2500(r0)
            int r0 = r0.intValue()
            return r0
    }

    public int getMaxCharacterCount() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            int r0 = com.google.android.material.badge.BadgeState.State.access$900(r0)
            return r0
    }

    public int getMaxNumber() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            int r0 = com.google.android.material.badge.BadgeState.State.access$1000(r0)
            return r0
    }

    public int getNumber() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            int r0 = com.google.android.material.badge.BadgeState.State.access$200(r0)
            return r0
    }

    public java.util.Locale getNumberLocale() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.util.Locale r0 = com.google.android.material.badge.BadgeState.State.access$2900(r0)
            return r0
    }

    public com.google.android.material.badge.BadgeState.State getOverridingState() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            return r0
    }

    public java.lang.String getText() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.String r0 = com.google.android.material.badge.BadgeState.State.access$300(r0)
            return r0
    }

    @Yue.InterfaceC6018
    public int getTextAppearanceResId() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$1600(r0)
            int r0 = r0.intValue()
            return r0
    }

    @Yue.InterfaceC1849(unit = 1)
    public int getVerticalOffsetWithText() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$2400(r0)
            int r0 = r0.intValue()
            return r0
    }

    @Yue.InterfaceC1849(unit = 1)
    public int getVerticalOffsetWithoutText() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$2200(r0)
            int r0 = r0.intValue()
            return r0
    }

    public boolean hasNumber() {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            int r0 = com.google.android.material.badge.BadgeState.State.access$200(r0)
            r1 = -1
            if (r0 == r1) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public boolean hasText() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.String r0 = com.google.android.material.badge.BadgeState.State.access$300(r0)
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public boolean isAutoAdjustedToGrandparentBounds() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Boolean r0 = com.google.android.material.badge.BadgeState.State.access$2800(r0)
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean isVisible() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Boolean r0 = com.google.android.material.badge.BadgeState.State.access$800(r0)
            boolean r0 = r0.booleanValue()
            return r0
    }

    public void setAdditionalHorizontalOffset(@Yue.InterfaceC1849(unit = 1) int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2602(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2602(r0, r3)
            return
    }

    public void setAdditionalVerticalOffset(@Yue.InterfaceC1849(unit = 1) int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2702(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2702(r0, r3)
            return
    }

    public void setAlpha(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$102(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$102(r0, r2)
            return
    }

    public void setAutoAdjustToGrandparentBounds(boolean r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2802(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2802(r0, r3)
            return
    }

    public void setBackgroundColor(@Yue.InterfaceC1230 int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1502(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1502(r0, r3)
            return
    }

    public void setBadgeGravity(int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1802(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1802(r0, r3)
            return
    }

    public void setBadgeHorizontalPadding(@Yue.InterfaceC4992 int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1902(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1902(r0, r3)
            return
    }

    public void setBadgeShapeAppearanceOverlayResId(int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1202(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1202(r0, r3)
            return
    }

    public void setBadgeShapeAppearanceResId(int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1102(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1102(r0, r3)
            return
    }

    public void setBadgeTextColor(@Yue.InterfaceC1230 int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1702(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1702(r0, r3)
            return
    }

    public void setBadgeVerticalPadding(@Yue.InterfaceC4992 int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2002(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2002(r0, r3)
            return
    }

    public void setBadgeWithTextShapeAppearanceOverlayResId(int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1402(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1402(r0, r3)
            return
    }

    public void setBadgeWithTextShapeAppearanceResId(int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1302(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1302(r0, r3)
            return
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(@Yue.InterfaceC5971 int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$702(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$702(r0, r2)
            return
    }

    public void setContentDescriptionForText(java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$402(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$402(r0, r2)
            return
    }

    public void setContentDescriptionNumberless(java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$502(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$502(r0, r2)
            return
    }

    public void setContentDescriptionQuantityStringsResource(@Yue.InterfaceC4804 int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$602(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$602(r0, r2)
            return
    }

    public void setHorizontalOffsetWithText(@Yue.InterfaceC1849(unit = 1) int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2302(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2302(r0, r3)
            return
    }

    public void setHorizontalOffsetWithoutText(@Yue.InterfaceC1849(unit = 1) int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2102(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2102(r0, r3)
            return
    }

    public void setLargeFontVerticalOffsetAdjustment(@Yue.InterfaceC1849(unit = 1) int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2502(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2502(r0, r3)
            return
    }

    public void setMaxCharacterCount(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$902(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$902(r0, r2)
            return
    }

    public void setMaxNumber(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$1002(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$1002(r0, r2)
            return
    }

    public void setNumber(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$202(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$202(r0, r2)
            return
    }

    public void setNumberLocale(java.util.Locale r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$2902(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$2902(r0, r2)
            return
    }

    public void setText(java.lang.String r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$302(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$302(r0, r2)
            return
    }

    public void setTextAppearanceResId(@Yue.InterfaceC6018 int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1602(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1602(r0, r3)
            return
    }

    public void setVerticalOffsetWithText(@Yue.InterfaceC1849(unit = 1) int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2402(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2402(r0, r3)
            return
    }

    public void setVerticalOffsetWithoutText(@Yue.InterfaceC1849(unit = 1) int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2202(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2202(r0, r3)
            return
    }

    public void setVisible(boolean r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$802(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$802(r0, r3)
            return
    }
}

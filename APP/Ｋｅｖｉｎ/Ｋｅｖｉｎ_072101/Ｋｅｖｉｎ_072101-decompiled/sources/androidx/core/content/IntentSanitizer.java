package androidx.core.content;

/* JADX INFO: loaded from: classes2.dex */
public class IntentSanitizer {
    private static final java.lang.String TAG = "IntentSanitizer";
    private boolean mAllowAnyComponent;
    private boolean mAllowClipDataText;
    private boolean mAllowIdentifier;
    private boolean mAllowSelector;
    private boolean mAllowSourceBounds;
    private androidx.core.util.Predicate<java.lang.String> mAllowedActions;
    private androidx.core.util.Predicate<java.lang.String> mAllowedCategories;
    private androidx.core.util.Predicate<android.content.ClipData> mAllowedClipData;
    private androidx.core.util.Predicate<android.net.Uri> mAllowedClipDataUri;
    private androidx.core.util.Predicate<android.content.ComponentName> mAllowedComponents;
    private androidx.core.util.Predicate<android.net.Uri> mAllowedData;
    private java.util.Map<java.lang.String, androidx.core.util.Predicate<java.lang.Object>> mAllowedExtras;
    private int mAllowedFlags;
    private androidx.core.util.Predicate<java.lang.String> mAllowedPackages;
    private androidx.core.util.Predicate<java.lang.String> mAllowedTypes;

    /* JADX INFO: renamed from: androidx.core.content.IntentSanitizer$1 */
    static /* synthetic */ class C01261 {
    }

    private static class Api15Impl {
        private Api15Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.content.Intent getSelector(android.content.Intent r1) {
                android.content.Intent r0 = r1.getSelector()
                return r0
        }

        static void setSelector(android.content.Intent r0, android.content.Intent r1) {
                r0.setSelector(r1)
                return
        }
    }

    private static class Api16Impl {

        private static class Api31Impl {
            private Api31Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static void checkOtherMembers(int r2, android.content.ClipData.Item r3, androidx.core.util.Consumer<java.lang.String> r4) {
                    java.lang.String r0 = r3.getHtmlText()
                    if (r0 != 0) goto L12
                    android.content.Intent r0 = r3.getIntent()
                    if (r0 != 0) goto L12
                    android.view.textclassifier.TextLinks r0 = r3.getTextLinks()
                    if (r0 == 0) goto L32
                L12:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "ClipData item at position "
                    java.lang.StringBuilder r0 = r0.append(r1)
                    java.lang.StringBuilder r0 = r0.append(r2)
                    java.lang.String r1 = " contains htmlText, textLinks or intent: "
                    java.lang.StringBuilder r0 = r0.append(r1)
                    java.lang.StringBuilder r0 = r0.append(r3)
                    java.lang.String r0 = r0.toString()
                    r4.accept(r0)
                L32:
                    return
            }
        }

        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        private static void checkOtherMembers(int r2, android.content.ClipData.Item r3, androidx.core.util.Consumer<java.lang.String> r4) {
                java.lang.String r0 = r3.getHtmlText()
                if (r0 != 0) goto Lc
                android.content.Intent r0 = r3.getIntent()
                if (r0 == 0) goto L2c
            Lc:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ClipData item at position "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r1 = " contains htmlText, textLinks or intent: "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r3)
                java.lang.String r0 = r0.toString()
                r4.accept(r0)
            L2c:
                return
        }

        static void sanitizeClipData(android.content.Intent r10, android.content.Intent r11, androidx.core.util.Predicate<android.content.ClipData> r12, boolean r13, androidx.core.util.Predicate<android.net.Uri> r14, androidx.core.util.Consumer<java.lang.String> r15) {
                android.content.ClipData r0 = r10.getClipData()
                if (r0 != 0) goto L7
                return
            L7:
                r1 = 0
                if (r12 == 0) goto L15
                boolean r2 = r12.test(r0)
                if (r2 == 0) goto L15
                r11.setClipData(r0)
                goto Leb
            L15:
                r2 = 0
            L16:
                int r3 = r0.getItemCount()
                if (r2 >= r3) goto Le6
                android.content.ClipData$Item r3 = r0.getItemAt(r2)
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 31
                if (r4 < r5) goto L2a
                androidx.core.content.IntentSanitizer.Api16Impl.Api31Impl.checkOtherMembers(r2, r3, r15)
                goto L2d
            L2a:
                checkOtherMembers(r2, r3, r15)
            L2d:
                r4 = 0
                if (r13 == 0) goto L35
                java.lang.CharSequence r4 = r3.getText()
                goto L5f
            L35:
                java.lang.CharSequence r5 = r3.getText()
                if (r5 == 0) goto L5f
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Item text cannot contain value. Item position: "
                java.lang.StringBuilder r5 = r5.append(r6)
                java.lang.StringBuilder r5 = r5.append(r2)
                java.lang.String r6 = ". Text: "
                java.lang.StringBuilder r5 = r5.append(r6)
                java.lang.CharSequence r6 = r3.getText()
                java.lang.StringBuilder r5 = r5.append(r6)
                java.lang.String r5 = r5.toString()
                r15.accept(r5)
            L5f:
                r5 = 0
                java.lang.String r6 = ". URI: "
                java.lang.String r7 = "Item URI is not allowed. Item position: "
                if (r14 != 0) goto L8d
                android.net.Uri r8 = r3.getUri()
                if (r8 == 0) goto Lc3
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.StringBuilder r7 = r8.append(r7)
                java.lang.StringBuilder r7 = r7.append(r2)
                java.lang.StringBuilder r6 = r7.append(r6)
                android.net.Uri r7 = r3.getUri()
                java.lang.StringBuilder r6 = r6.append(r7)
                java.lang.String r6 = r6.toString()
                r15.accept(r6)
                goto Lc3
            L8d:
                android.net.Uri r8 = r3.getUri()
                if (r8 == 0) goto Lbf
                android.net.Uri r8 = r3.getUri()
                boolean r8 = r14.test(r8)
                if (r8 == 0) goto L9e
                goto Lbf
            L9e:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.StringBuilder r7 = r8.append(r7)
                java.lang.StringBuilder r7 = r7.append(r2)
                java.lang.StringBuilder r6 = r7.append(r6)
                android.net.Uri r7 = r3.getUri()
                java.lang.StringBuilder r6 = r6.append(r7)
                java.lang.String r6 = r6.toString()
                r15.accept(r6)
                goto Lc3
            Lbf:
                android.net.Uri r5 = r3.getUri()
            Lc3:
                if (r4 != 0) goto Lc7
                if (r5 == 0) goto Le2
            Lc7:
                r6 = 0
                if (r1 != 0) goto Lda
                android.content.ClipData r7 = new android.content.ClipData
                android.content.ClipDescription r8 = r0.getDescription()
                android.content.ClipData$Item r9 = new android.content.ClipData$Item
                r9.<init>(r4, r6, r5)
                r7.<init>(r8, r9)
                r1 = r7
                goto Le2
            Lda:
                android.content.ClipData$Item r7 = new android.content.ClipData$Item
                r7.<init>(r4, r6, r5)
                r1.addItem(r7)
            Le2:
                int r2 = r2 + 1
                goto L16
            Le6:
                if (r1 == 0) goto Leb
                r11.setClipData(r1)
            Leb:
                return
        }
    }

    private static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.String getIdentifier(android.content.Intent r1) {
                java.lang.String r0 = r1.getIdentifier()
                return r0
        }

        static android.content.Intent setIdentifier(android.content.Intent r1, java.lang.String r2) {
                android.content.Intent r0 = r1.setIdentifier(r2)
                return r0
        }
    }

    public static final class Builder {
        private static final int HISTORY_STACK_FLAGS = 2112614400;
        private static final int RECEIVER_FLAGS = 2015363072;
        private boolean mAllowAnyComponent;
        private boolean mAllowClipDataText;
        private boolean mAllowIdentifier;
        private boolean mAllowSelector;
        private boolean mAllowSomeComponents;
        private boolean mAllowSourceBounds;
        private androidx.core.util.Predicate<java.lang.String> mAllowedActions;
        private androidx.core.util.Predicate<java.lang.String> mAllowedCategories;
        private androidx.core.util.Predicate<android.content.ClipData> mAllowedClipData;
        private androidx.core.util.Predicate<android.net.Uri> mAllowedClipDataUri;
        private androidx.core.util.Predicate<android.content.ComponentName> mAllowedComponents;
        private androidx.core.util.Predicate<android.net.Uri> mAllowedData;
        private java.util.Map<java.lang.String, androidx.core.util.Predicate<java.lang.Object>> mAllowedExtras;
        private int mAllowedFlags;
        private androidx.core.util.Predicate<java.lang.String> mAllowedPackages;
        private androidx.core.util.Predicate<java.lang.String> mAllowedTypes;

        public Builder() {
                r1 = this;
                r1.<init>()
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda10 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda10
                r0.<init>()
                r1.mAllowedActions = r0
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda11 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda11
                r0.<init>()
                r1.mAllowedData = r0
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda12 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda12
                r0.<init>()
                r1.mAllowedTypes = r0
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda13 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda13
                r0.<init>()
                r1.mAllowedCategories = r0
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda14 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda14
                r0.<init>()
                r1.mAllowedPackages = r0
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda15 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda15
                r0.<init>()
                r1.mAllowedComponents = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mAllowedExtras = r0
                r0 = 0
                r1.mAllowClipDataText = r0
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda16 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda16
                r0.<init>()
                r1.mAllowedClipDataUri = r0
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda17 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda17
                r0.<init>()
                r1.mAllowedClipData = r0
                return
        }

        static /* synthetic */ boolean lambda$allowAnyComponent$10(android.content.ComponentName r1) {
                r0 = 1
                return r0
        }

        static /* synthetic */ boolean lambda$allowClipDataUriWithAuthority$11(java.lang.String r1, android.net.Uri r2) {
                java.lang.String r0 = r2.getAuthority()
                boolean r0 = r1.equals(r0)
                return r0
        }

        static /* synthetic */ boolean lambda$allowComponentWithPackage$9(java.lang.String r1, android.content.ComponentName r2) {
                java.lang.String r0 = r2.getPackageName()
                boolean r0 = r1.equals(r0)
                return r0
        }

        static /* synthetic */ boolean lambda$allowDataWithAuthority$8(java.lang.String r1, android.net.Uri r2) {
                java.lang.String r0 = r2.getAuthority()
                boolean r0 = r1.equals(r0)
                return r0
        }

        static /* synthetic */ boolean lambda$allowExtra$12(java.lang.Object r1) {
                r0 = 1
                return r0
        }

        static /* synthetic */ boolean lambda$allowExtra$13(java.lang.Class r1, androidx.core.util.Predicate r2, java.lang.Object r3) {
                boolean r0 = r1.isInstance(r3)
                if (r0 == 0) goto L12
                java.lang.Object r0 = r1.cast(r3)
                boolean r0 = r2.test(r0)
                if (r0 == 0) goto L12
                r0 = 1
                goto L13
            L12:
                r0 = 0
            L13:
                return r0
        }

        static /* synthetic */ boolean lambda$allowExtra$14(java.lang.Object r1) {
                r0 = 0
                return r0
        }

        static /* synthetic */ boolean lambda$allowExtraOutput$16(java.lang.String r1, android.net.Uri r2) {
                java.lang.String r0 = r2.getAuthority()
                boolean r0 = r1.equals(r0)
                return r0
        }

        static /* synthetic */ boolean lambda$allowExtraStreamUriWithAuthority$15(java.lang.String r1, android.net.Uri r2) {
                java.lang.String r0 = r2.getAuthority()
                boolean r0 = r1.equals(r0)
                return r0
        }

        static /* synthetic */ boolean lambda$new$0(java.lang.String r1) {
                r0 = 0
                return r0
        }

        static /* synthetic */ boolean lambda$new$1(android.net.Uri r1) {
                r0 = 0
                return r0
        }

        static /* synthetic */ boolean lambda$new$2(java.lang.String r1) {
                r0 = 0
                return r0
        }

        static /* synthetic */ boolean lambda$new$3(java.lang.String r1) {
                r0 = 0
                return r0
        }

        static /* synthetic */ boolean lambda$new$4(java.lang.String r1) {
                r0 = 0
                return r0
        }

        static /* synthetic */ boolean lambda$new$5(android.content.ComponentName r1) {
                r0 = 0
                return r0
        }

        static /* synthetic */ boolean lambda$new$6(android.net.Uri r1) {
                r0 = 0
                return r0
        }

        static /* synthetic */ boolean lambda$new$7(android.content.ClipData r1) {
                r0 = 0
                return r0
        }

        public androidx.core.content.IntentSanitizer.Builder allowAction(androidx.core.util.Predicate<java.lang.String> r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Predicate<java.lang.String> r0 = r1.mAllowedActions
                androidx.core.util.Predicate r0 = r0.m38or(r2)
                r1.mAllowedActions = r0
                return r1
        }

        public androidx.core.content.IntentSanitizer.Builder allowAction(java.lang.String r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                java.util.Objects.requireNonNull(r2)
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda1 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda1
                r0.<init>(r2)
                r1.allowAction(r0)
                return r1
        }

        public androidx.core.content.IntentSanitizer.Builder allowAnyComponent() {
                r1 = this;
                r0 = 1
                r1.mAllowAnyComponent = r0
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda6 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda6
                r0.<init>()
                r1.mAllowedComponents = r0
                return r1
        }

        public androidx.core.content.IntentSanitizer.Builder allowCategory(androidx.core.util.Predicate<java.lang.String> r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Predicate<java.lang.String> r0 = r1.mAllowedCategories
                androidx.core.util.Predicate r0 = r0.m38or(r2)
                r1.mAllowedCategories = r0
                return r1
        }

        public androidx.core.content.IntentSanitizer.Builder allowCategory(java.lang.String r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                java.util.Objects.requireNonNull(r2)
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda1 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda1
                r0.<init>(r2)
                androidx.core.content.IntentSanitizer$Builder r0 = r1.allowCategory(r0)
                return r0
        }

        public androidx.core.content.IntentSanitizer.Builder allowClipData(androidx.core.util.Predicate<android.content.ClipData> r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Predicate<android.content.ClipData> r0 = r1.mAllowedClipData
                androidx.core.util.Predicate r0 = r0.m38or(r2)
                r1.mAllowedClipData = r0
                return r1
        }

        public androidx.core.content.IntentSanitizer.Builder allowClipDataText() {
                r1 = this;
                r0 = 1
                r1.mAllowClipDataText = r0
                return r1
        }

        public androidx.core.content.IntentSanitizer.Builder allowClipDataUri(androidx.core.util.Predicate<android.net.Uri> r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Predicate<android.net.Uri> r0 = r1.mAllowedClipDataUri
                androidx.core.util.Predicate r0 = r0.m38or(r2)
                r1.mAllowedClipDataUri = r0
                return r1
        }

        public androidx.core.content.IntentSanitizer.Builder allowClipDataUriWithAuthority(java.lang.String r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda7 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda7
                r0.<init>(r2)
                androidx.core.content.IntentSanitizer$Builder r0 = r1.allowClipDataUri(r0)
                return r0
        }

        public androidx.core.content.IntentSanitizer.Builder allowComponent(android.content.ComponentName r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                java.util.Objects.requireNonNull(r2)
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda5 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda5
                r0.<init>(r2)
                androidx.core.content.IntentSanitizer$Builder r0 = r1.allowComponent(r0)
                return r0
        }

        public androidx.core.content.IntentSanitizer.Builder allowComponent(androidx.core.util.Predicate<android.content.ComponentName> r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                r0 = 1
                r1.mAllowSomeComponents = r0
                androidx.core.util.Predicate<android.content.ComponentName> r0 = r1.mAllowedComponents
                androidx.core.util.Predicate r0 = r0.m38or(r2)
                r1.mAllowedComponents = r0
                return r1
        }

        public androidx.core.content.IntentSanitizer.Builder allowComponentWithPackage(java.lang.String r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda2 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda2
                r0.<init>(r2)
                androidx.core.content.IntentSanitizer$Builder r0 = r1.allowComponent(r0)
                return r0
        }

        public androidx.core.content.IntentSanitizer.Builder allowData(androidx.core.util.Predicate<android.net.Uri> r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Predicate<android.net.Uri> r0 = r1.mAllowedData
                androidx.core.util.Predicate r0 = r0.m38or(r2)
                r1.mAllowedData = r0
                return r1
        }

        public androidx.core.content.IntentSanitizer.Builder allowDataWithAuthority(java.lang.String r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda3 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda3
                r0.<init>(r2)
                r1.allowData(r0)
                return r1
        }

        public androidx.core.content.IntentSanitizer.Builder allowExtra(java.lang.String r3, androidx.core.util.Predicate<java.lang.Object> r4) {
                r2 = this;
                androidx.core.util.Preconditions.checkNotNull(r3)
                androidx.core.util.Preconditions.checkNotNull(r4)
                java.util.Map<java.lang.String, androidx.core.util.Predicate<java.lang.Object>> r0 = r2.mAllowedExtras
                java.lang.Object r0 = r0.get(r3)
                androidx.core.util.Predicate r0 = (androidx.core.util.Predicate) r0
                if (r0 != 0) goto L16
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda8 r1 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda8
                r1.<init>()
                r0 = r1
            L16:
                androidx.core.util.Predicate r0 = r0.m38or(r4)
                java.util.Map<java.lang.String, androidx.core.util.Predicate<java.lang.Object>> r1 = r2.mAllowedExtras
                r1.put(r3, r0)
                return r2
        }

        public androidx.core.content.IntentSanitizer.Builder allowExtra(java.lang.String r2, java.lang.Class<?> r3) {
                r1 = this;
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda18 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda18
                r0.<init>()
                androidx.core.content.IntentSanitizer$Builder r0 = r1.allowExtra(r2, r3, r0)
                return r0
        }

        public <T> androidx.core.content.IntentSanitizer.Builder allowExtra(java.lang.String r2, java.lang.Class<T> r3, androidx.core.util.Predicate<T> r4) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Preconditions.checkNotNull(r3)
                androidx.core.util.Preconditions.checkNotNull(r4)
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda4 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda4
                r0.<init>(r3, r4)
                androidx.core.content.IntentSanitizer$Builder r0 = r1.allowExtra(r2, r0)
                return r0
        }

        public androidx.core.content.IntentSanitizer.Builder allowExtraOutput(androidx.core.util.Predicate<android.net.Uri> r3) {
                r2 = this;
                java.lang.String r0 = "output"
                java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
                r2.allowExtra(r0, r1, r3)
                return r2
        }

        public androidx.core.content.IntentSanitizer.Builder allowExtraOutput(java.lang.String r4) {
                r3 = this;
                java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda0 r1 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda0
                r1.<init>(r4)
                java.lang.String r2 = "output"
                r3.allowExtra(r2, r0, r1)
                return r3
        }

        public androidx.core.content.IntentSanitizer.Builder allowExtraStream(androidx.core.util.Predicate<android.net.Uri> r3) {
                r2 = this;
                java.lang.String r0 = "android.intent.extra.STREAM"
                java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
                r2.allowExtra(r0, r1, r3)
                return r2
        }

        public androidx.core.content.IntentSanitizer.Builder allowExtraStreamUriWithAuthority(java.lang.String r4) {
                r3 = this;
                androidx.core.util.Preconditions.checkNotNull(r4)
                java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda9 r1 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda9
                r1.<init>(r4)
                java.lang.String r2 = "android.intent.extra.STREAM"
                r3.allowExtra(r2, r0, r1)
                return r3
        }

        public androidx.core.content.IntentSanitizer.Builder allowFlags(int r2) {
                r1 = this;
                int r0 = r1.mAllowedFlags
                r0 = r0 | r2
                r1.mAllowedFlags = r0
                return r1
        }

        public androidx.core.content.IntentSanitizer.Builder allowHistoryStackFlags() {
                r2 = this;
                int r0 = r2.mAllowedFlags
                r1 = 2112614400(0x7debf000, float:3.9201841E37)
                r0 = r0 | r1
                r2.mAllowedFlags = r0
                return r2
        }

        public androidx.core.content.IntentSanitizer.Builder allowIdentifier() {
                r1 = this;
                r0 = 1
                r1.mAllowIdentifier = r0
                return r1
        }

        public androidx.core.content.IntentSanitizer.Builder allowPackage(androidx.core.util.Predicate<java.lang.String> r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Predicate<java.lang.String> r0 = r1.mAllowedPackages
                androidx.core.util.Predicate r0 = r0.m38or(r2)
                r1.mAllowedPackages = r0
                return r1
        }

        public androidx.core.content.IntentSanitizer.Builder allowPackage(java.lang.String r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                java.util.Objects.requireNonNull(r2)
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda1 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda1
                r0.<init>(r2)
                androidx.core.content.IntentSanitizer$Builder r0 = r1.allowPackage(r0)
                return r0
        }

        public androidx.core.content.IntentSanitizer.Builder allowReceiverFlags() {
                r2 = this;
                int r0 = r2.mAllowedFlags
                r1 = 2015363072(0x78200000, float:1.2980742E34)
                r0 = r0 | r1
                r2.mAllowedFlags = r0
                return r2
        }

        public androidx.core.content.IntentSanitizer.Builder allowSelector() {
                r1 = this;
                r0 = 1
                r1.mAllowSelector = r0
                return r1
        }

        public androidx.core.content.IntentSanitizer.Builder allowSourceBounds() {
                r1 = this;
                r0 = 1
                r1.mAllowSourceBounds = r0
                return r1
        }

        public androidx.core.content.IntentSanitizer.Builder allowType(androidx.core.util.Predicate<java.lang.String> r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                androidx.core.util.Predicate<java.lang.String> r0 = r1.mAllowedTypes
                androidx.core.util.Predicate r0 = r0.m38or(r2)
                r1.mAllowedTypes = r0
                return r1
        }

        public androidx.core.content.IntentSanitizer.Builder allowType(java.lang.String r2) {
                r1 = this;
                androidx.core.util.Preconditions.checkNotNull(r2)
                java.util.Objects.requireNonNull(r2)
                androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda1 r0 = new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda1
                r0.<init>(r2)
                androidx.core.content.IntentSanitizer$Builder r0 = r1.allowType(r0)
                return r0
        }

        public androidx.core.content.IntentSanitizer build() {
                r2 = this;
                boolean r0 = r2.mAllowAnyComponent
                if (r0 == 0) goto L8
                boolean r0 = r2.mAllowSomeComponents
                if (r0 != 0) goto L11
            L8:
                boolean r0 = r2.mAllowAnyComponent
                if (r0 != 0) goto L19
                boolean r0 = r2.mAllowSomeComponents
                if (r0 == 0) goto L11
                goto L19
            L11:
                java.lang.SecurityException r0 = new java.lang.SecurityException
                java.lang.String r1 = "You must call either allowAnyComponent or one or more of the allowComponent methods; but not both."
                r0.<init>(r1)
                throw r0
            L19:
                androidx.core.content.IntentSanitizer r0 = new androidx.core.content.IntentSanitizer
                r1 = 0
                r0.<init>(r1)
                int r1 = r2.mAllowedFlags
                androidx.core.content.IntentSanitizer.access$102(r0, r1)
                androidx.core.util.Predicate<java.lang.String> r1 = r2.mAllowedActions
                androidx.core.content.IntentSanitizer.access$202(r0, r1)
                androidx.core.util.Predicate<android.net.Uri> r1 = r2.mAllowedData
                androidx.core.content.IntentSanitizer.access$302(r0, r1)
                androidx.core.util.Predicate<java.lang.String> r1 = r2.mAllowedTypes
                androidx.core.content.IntentSanitizer.access$402(r0, r1)
                androidx.core.util.Predicate<java.lang.String> r1 = r2.mAllowedCategories
                androidx.core.content.IntentSanitizer.access$502(r0, r1)
                androidx.core.util.Predicate<java.lang.String> r1 = r2.mAllowedPackages
                androidx.core.content.IntentSanitizer.access$602(r0, r1)
                boolean r1 = r2.mAllowAnyComponent
                androidx.core.content.IntentSanitizer.access$702(r0, r1)
                androidx.core.util.Predicate<android.content.ComponentName> r1 = r2.mAllowedComponents
                androidx.core.content.IntentSanitizer.access$802(r0, r1)
                java.util.Map<java.lang.String, androidx.core.util.Predicate<java.lang.Object>> r1 = r2.mAllowedExtras
                androidx.core.content.IntentSanitizer.access$902(r0, r1)
                boolean r1 = r2.mAllowClipDataText
                androidx.core.content.IntentSanitizer.access$1002(r0, r1)
                androidx.core.util.Predicate<android.net.Uri> r1 = r2.mAllowedClipDataUri
                androidx.core.content.IntentSanitizer.access$1102(r0, r1)
                androidx.core.util.Predicate<android.content.ClipData> r1 = r2.mAllowedClipData
                androidx.core.content.IntentSanitizer.access$1202(r0, r1)
                boolean r1 = r2.mAllowIdentifier
                androidx.core.content.IntentSanitizer.access$1302(r0, r1)
                boolean r1 = r2.mAllowSelector
                androidx.core.content.IntentSanitizer.access$1402(r0, r1)
                boolean r1 = r2.mAllowSourceBounds
                androidx.core.content.IntentSanitizer.access$1502(r0, r1)
                return r0
        }
    }

    private IntentSanitizer() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ IntentSanitizer(androidx.core.content.IntentSanitizer.C01261 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ boolean access$1002(androidx.core.content.IntentSanitizer r0, boolean r1) {
            r0.mAllowClipDataText = r1
            return r1
    }

    static /* synthetic */ int access$102(androidx.core.content.IntentSanitizer r0, int r1) {
            r0.mAllowedFlags = r1
            return r1
    }

    static /* synthetic */ androidx.core.util.Predicate access$1102(androidx.core.content.IntentSanitizer r0, androidx.core.util.Predicate r1) {
            r0.mAllowedClipDataUri = r1
            return r1
    }

    static /* synthetic */ androidx.core.util.Predicate access$1202(androidx.core.content.IntentSanitizer r0, androidx.core.util.Predicate r1) {
            r0.mAllowedClipData = r1
            return r1
    }

    static /* synthetic */ boolean access$1302(androidx.core.content.IntentSanitizer r0, boolean r1) {
            r0.mAllowIdentifier = r1
            return r1
    }

    static /* synthetic */ boolean access$1402(androidx.core.content.IntentSanitizer r0, boolean r1) {
            r0.mAllowSelector = r1
            return r1
    }

    static /* synthetic */ boolean access$1502(androidx.core.content.IntentSanitizer r0, boolean r1) {
            r0.mAllowSourceBounds = r1
            return r1
    }

    static /* synthetic */ androidx.core.util.Predicate access$202(androidx.core.content.IntentSanitizer r0, androidx.core.util.Predicate r1) {
            r0.mAllowedActions = r1
            return r1
    }

    static /* synthetic */ androidx.core.util.Predicate access$302(androidx.core.content.IntentSanitizer r0, androidx.core.util.Predicate r1) {
            r0.mAllowedData = r1
            return r1
    }

    static /* synthetic */ androidx.core.util.Predicate access$402(androidx.core.content.IntentSanitizer r0, androidx.core.util.Predicate r1) {
            r0.mAllowedTypes = r1
            return r1
    }

    static /* synthetic */ androidx.core.util.Predicate access$502(androidx.core.content.IntentSanitizer r0, androidx.core.util.Predicate r1) {
            r0.mAllowedCategories = r1
            return r1
    }

    static /* synthetic */ androidx.core.util.Predicate access$602(androidx.core.content.IntentSanitizer r0, androidx.core.util.Predicate r1) {
            r0.mAllowedPackages = r1
            return r1
    }

    static /* synthetic */ boolean access$702(androidx.core.content.IntentSanitizer r0, boolean r1) {
            r0.mAllowAnyComponent = r1
            return r1
    }

    static /* synthetic */ androidx.core.util.Predicate access$802(androidx.core.content.IntentSanitizer r0, androidx.core.util.Predicate r1) {
            r0.mAllowedComponents = r1
            return r1
    }

    static /* synthetic */ java.util.Map access$902(androidx.core.content.IntentSanitizer r0, java.util.Map r1) {
            r0.mAllowedExtras = r1
            return r1
    }

    static /* synthetic */ void lambda$sanitizeByFiltering$0(java.lang.String r0) {
            return
    }

    static /* synthetic */ void lambda$sanitizeByThrowing$1(java.lang.String r1) {
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
    }

    private void putExtra(android.content.Intent r4, java.lang.String r5, java.lang.Object r6) {
            r3 = this;
            if (r6 != 0) goto Lb
            android.os.Bundle r0 = r4.getExtras()
            r1 = 0
            r0.putString(r5, r1)
            goto L2b
        Lb:
            boolean r0 = r6 instanceof android.os.Parcelable
            if (r0 == 0) goto L16
            r0 = r6
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r4.putExtra(r5, r0)
            goto L2b
        L16:
            boolean r0 = r6 instanceof android.os.Parcelable[]
            if (r0 == 0) goto L21
            r0 = r6
            android.os.Parcelable[] r0 = (android.os.Parcelable[]) r0
            r4.putExtra(r5, r0)
            goto L2b
        L21:
            boolean r0 = r6 instanceof java.io.Serializable
            if (r0 == 0) goto L2c
            r0 = r6
            java.io.Serializable r0 = (java.io.Serializable) r0
            r4.putExtra(r5, r0)
        L2b:
            return
        L2c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported type "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.Class r2 = r6.getClass()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public android.content.Intent sanitize(android.content.Intent r17, androidx.core.util.Consumer<java.lang.String> r18) {
            r16 = this;
            r0 = r16
            r7 = r18
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r8 = r1
            android.content.ComponentName r9 = r17.getComponent()
            boolean r1 = r0.mAllowAnyComponent
            if (r1 == 0) goto L14
            if (r9 == 0) goto L1c
        L14:
            androidx.core.util.Predicate<android.content.ComponentName> r1 = r0.mAllowedComponents
            boolean r1 = r1.test(r9)
            if (r1 == 0) goto L20
        L1c:
            r8.setComponent(r9)
            goto L42
        L20:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Component is not allowed: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.String r1 = r1.toString()
            r7.accept(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r2 = "android"
            java.lang.String r3 = "java.lang.Void"
            r1.<init>(r2, r3)
            r8.setComponent(r1)
        L42:
            java.lang.String r10 = r17.getPackage()
            if (r10 == 0) goto L68
            androidx.core.util.Predicate<java.lang.String> r1 = r0.mAllowedPackages
            boolean r1 = r1.test(r10)
            if (r1 == 0) goto L51
            goto L68
        L51:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Package is not allowed: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            r7.accept(r1)
            goto L6b
        L68:
            r8.setPackage(r10)
        L6b:
            int r1 = r0.mAllowedFlags
            int r2 = r17.getFlags()
            r1 = r1 | r2
            int r2 = r0.mAllowedFlags
            if (r1 != r2) goto L7e
            int r1 = r17.getFlags()
            r8.setFlags(r1)
            goto Laa
        L7e:
            int r1 = r0.mAllowedFlags
            int r2 = r17.getFlags()
            r1 = r1 & r2
            r8.setFlags(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The intent contains flags that are not allowed: 0x"
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r17.getFlags()
            int r3 = r0.mAllowedFlags
            int r3 = ~r3
            r2 = r2 & r3
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r7.accept(r1)
        Laa:
            java.lang.String r11 = r17.getAction()
            if (r11 == 0) goto Ld0
            androidx.core.util.Predicate<java.lang.String> r1 = r0.mAllowedActions
            boolean r1 = r1.test(r11)
            if (r1 == 0) goto Lb9
            goto Ld0
        Lb9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Action is not allowed: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            r7.accept(r1)
            goto Ld3
        Ld0:
            r8.setAction(r11)
        Ld3:
            android.net.Uri r12 = r17.getData()
            if (r12 == 0) goto Lf9
            androidx.core.util.Predicate<android.net.Uri> r1 = r0.mAllowedData
            boolean r1 = r1.test(r12)
            if (r1 == 0) goto Le2
            goto Lf9
        Le2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Data is not allowed: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r1 = r1.toString()
            r7.accept(r1)
            goto Lfc
        Lf9:
            r8.setData(r12)
        Lfc:
            java.lang.String r13 = r17.getType()
            if (r13 == 0) goto L122
            androidx.core.util.Predicate<java.lang.String> r1 = r0.mAllowedTypes
            boolean r1 = r1.test(r13)
            if (r1 == 0) goto L10b
            goto L122
        L10b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Type is not allowed: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r13)
            java.lang.String r1 = r1.toString()
            r7.accept(r1)
            goto L129
        L122:
            android.net.Uri r1 = r8.getData()
            r8.setDataAndType(r1, r13)
        L129:
            java.util.Set r14 = r17.getCategories()
            if (r14 == 0) goto L162
            java.util.Iterator r1 = r14.iterator()
        L133:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L162
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            androidx.core.util.Predicate<java.lang.String> r3 = r0.mAllowedCategories
            boolean r3 = r3.test(r2)
            if (r3 == 0) goto L14b
            r8.addCategory(r2)
            goto L161
        L14b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Category is not allowed: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r3 = r3.toString()
            r7.accept(r3)
        L161:
            goto L133
        L162:
            android.os.Bundle r15 = r17.getExtras()
            if (r15 == 0) goto L1de
            java.util.Set r1 = r15.keySet()
            java.util.Iterator r1 = r1.iterator()
        L170:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1de
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "android.intent.extra.STREAM"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L190
            int r3 = r0.mAllowedFlags
            r3 = r3 & 1
            if (r3 != 0) goto L190
            java.lang.String r3 = "Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag."
            r7.accept(r3)
            goto L170
        L190:
            java.lang.String r3 = "output"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L1a5
            int r3 = r0.mAllowedFlags
            int r3 = ~r3
            r3 = r3 & 3
            if (r3 == 0) goto L1a5
            java.lang.String r3 = "Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags."
            r7.accept(r3)
            goto L170
        L1a5:
            java.lang.Object r3 = r15.get(r2)
            java.util.Map<java.lang.String, androidx.core.util.Predicate<java.lang.Object>> r4 = r0.mAllowedExtras
            java.lang.Object r4 = r4.get(r2)
            androidx.core.util.Predicate r4 = (androidx.core.util.Predicate) r4
            if (r4 == 0) goto L1bd
            boolean r5 = r4.test(r3)
            if (r5 == 0) goto L1bd
            r0.putExtra(r8, r2, r3)
            goto L1dd
        L1bd:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Extra is not allowed. Key: "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r6 = ". Value: "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r3)
            java.lang.String r5 = r5.toString()
            r7.accept(r5)
        L1dd:
            goto L170
        L1de:
            androidx.core.util.Predicate<android.content.ClipData> r3 = r0.mAllowedClipData
            boolean r4 = r0.mAllowClipDataText
            androidx.core.util.Predicate<android.net.Uri> r5 = r0.mAllowedClipDataUri
            r1 = r17
            r2 = r8
            r6 = r18
            androidx.core.content.IntentSanitizer.Api16Impl.sanitizeClipData(r1, r2, r3, r4, r5, r6)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L21f
            boolean r1 = r0.mAllowIdentifier
            if (r1 == 0) goto L1ff
            java.lang.String r1 = androidx.core.content.IntentSanitizer.Api29Impl.getIdentifier(r17)
            androidx.core.content.IntentSanitizer.Api29Impl.setIdentifier(r8, r1)
            goto L21f
        L1ff:
            java.lang.String r1 = androidx.core.content.IntentSanitizer.Api29Impl.getIdentifier(r17)
            if (r1 == 0) goto L21f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Identifier is not allowed: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = androidx.core.content.IntentSanitizer.Api29Impl.getIdentifier(r17)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r7.accept(r1)
        L21f:
            boolean r1 = r0.mAllowSelector
            if (r1 == 0) goto L22c
            android.content.Intent r1 = androidx.core.content.IntentSanitizer.Api15Impl.getSelector(r17)
            androidx.core.content.IntentSanitizer.Api15Impl.setSelector(r8, r1)
            goto L24c
        L22c:
            android.content.Intent r1 = androidx.core.content.IntentSanitizer.Api15Impl.getSelector(r17)
            if (r1 == 0) goto L24c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Selector is not allowed: "
            java.lang.StringBuilder r1 = r1.append(r2)
            android.content.Intent r2 = androidx.core.content.IntentSanitizer.Api15Impl.getSelector(r17)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r7.accept(r1)
        L24c:
            boolean r1 = r0.mAllowSourceBounds
            if (r1 == 0) goto L258
            android.graphics.Rect r1 = r17.getSourceBounds()
            r8.setSourceBounds(r1)
            goto L278
        L258:
            android.graphics.Rect r1 = r17.getSourceBounds()
            if (r1 == 0) goto L278
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SourceBounds is not allowed: "
            java.lang.StringBuilder r1 = r1.append(r2)
            android.graphics.Rect r2 = r17.getSourceBounds()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r7.accept(r1)
        L278:
            return r8
    }

    public android.content.Intent sanitizeByFiltering(android.content.Intent r2) {
            r1 = this;
            androidx.core.content.IntentSanitizer$$ExternalSyntheticLambda1 r0 = new androidx.core.content.IntentSanitizer$$ExternalSyntheticLambda1
            r0.<init>()
            android.content.Intent r0 = r1.sanitize(r2, r0)
            return r0
    }

    public android.content.Intent sanitizeByThrowing(android.content.Intent r2) {
            r1 = this;
            androidx.core.content.IntentSanitizer$$ExternalSyntheticLambda0 r0 = new androidx.core.content.IntentSanitizer$$ExternalSyntheticLambda0
            r0.<init>()
            android.content.Intent r0 = r1.sanitize(r2, r0)
            return r0
    }
}

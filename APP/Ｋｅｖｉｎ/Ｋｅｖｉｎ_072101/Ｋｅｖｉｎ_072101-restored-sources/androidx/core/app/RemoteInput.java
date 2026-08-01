package androidx.core.app;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteInput {
    public static final int EDIT_CHOICES_BEFORE_SENDING_AUTO = 0;
    public static final int EDIT_CHOICES_BEFORE_SENDING_DISABLED = 1;
    public static final int EDIT_CHOICES_BEFORE_SENDING_ENABLED = 2;
    private static final java.lang.String EXTRA_DATA_TYPE_RESULTS_DATA = "android.remoteinput.dataTypeResultsData";
    public static final java.lang.String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
    private static final java.lang.String EXTRA_RESULTS_SOURCE = "android.remoteinput.resultsSource";
    public static final java.lang.String RESULTS_CLIP_LABEL = "android.remoteinput.results";
    public static final int SOURCE_CHOICE = 1;
    public static final int SOURCE_FREE_FORM_INPUT = 0;
    private final boolean mAllowFreeFormTextInput;
    private final java.util.Set<java.lang.String> mAllowedDataTypes;
    private final java.lang.CharSequence[] mChoices;
    private final int mEditChoicesBeforeSending;
    private final android.os.Bundle mExtras;
    private final java.lang.CharSequence mLabel;
    private final java.lang.String mResultKey;

    static class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.content.ClipData getClipData(android.content.Intent r1) {
                android.content.ClipData r0 = r1.getClipData()
                return r0
        }

        static void setClipData(android.content.Intent r0, android.content.ClipData r1) {
                r0.setClipData(r1)
                return
        }
    }

    static class Api20Impl {
        private Api20Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void addResultsToIntent(java.lang.Object r1, android.content.Intent r2, android.os.Bundle r3) {
                r0 = r1
                android.app.RemoteInput[] r0 = (android.app.RemoteInput[]) r0
                android.app.RemoteInput.addResultsToIntent(r0, r2, r3)
                return
        }

        public static android.app.RemoteInput fromCompat(androidx.core.app.RemoteInput r5) {
                android.app.RemoteInput$Builder r0 = new android.app.RemoteInput$Builder
                java.lang.String r1 = r5.getResultKey()
                r0.<init>(r1)
                java.lang.CharSequence r1 = r5.getLabel()
                android.app.RemoteInput$Builder r0 = r0.setLabel(r1)
                java.lang.CharSequence[] r1 = r5.getChoices()
                android.app.RemoteInput$Builder r0 = r0.setChoices(r1)
                boolean r1 = r5.getAllowFreeFormInput()
                android.app.RemoteInput$Builder r0 = r0.setAllowFreeFormInput(r1)
                android.os.Bundle r1 = r5.getExtras()
                android.app.RemoteInput$Builder r0 = r0.addExtras(r1)
                java.util.Set r1 = r5.getAllowedDataTypes()
                if (r1 == 0) goto L45
                java.util.Iterator r2 = r1.iterator()
            L34:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L45
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                r4 = 1
                androidx.core.app.RemoteInput.Api26Impl.setAllowDataType(r0, r3, r4)
                goto L34
            L45:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 29
                if (r1 < r2) goto L52
                int r1 = r5.getEditChoicesBeforeSending()
                androidx.core.app.RemoteInput.Api29Impl.setEditChoicesBeforeSending(r0, r1)
            L52:
                android.app.RemoteInput r1 = r0.build()
                return r1
        }

        static androidx.core.app.RemoteInput fromPlatform(java.lang.Object r6) {
                r0 = r6
                android.app.RemoteInput r0 = (android.app.RemoteInput) r0
                androidx.core.app.RemoteInput$Builder r1 = new androidx.core.app.RemoteInput$Builder
                java.lang.String r2 = r0.getResultKey()
                r1.<init>(r2)
                java.lang.CharSequence r2 = r0.getLabel()
                androidx.core.app.RemoteInput$Builder r1 = r1.setLabel(r2)
                java.lang.CharSequence[] r2 = r0.getChoices()
                androidx.core.app.RemoteInput$Builder r1 = r1.setChoices(r2)
                boolean r2 = r0.getAllowFreeFormInput()
                androidx.core.app.RemoteInput$Builder r1 = r1.setAllowFreeFormInput(r2)
                android.os.Bundle r2 = r0.getExtras()
                androidx.core.app.RemoteInput$Builder r1 = r1.addExtras(r2)
                java.util.Set r2 = androidx.core.app.RemoteInput.Api26Impl.getAllowedDataTypes(r0)
                if (r2 == 0) goto L48
                java.util.Iterator r3 = r2.iterator()
            L37:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L48
                java.lang.Object r4 = r3.next()
                java.lang.String r4 = (java.lang.String) r4
                r5 = 1
                r1.setAllowDataType(r4, r5)
                goto L37
            L48:
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 29
                if (r2 < r3) goto L55
                int r2 = androidx.core.app.RemoteInput.Api29Impl.getEditChoicesBeforeSending(r0)
                r1.setEditChoicesBeforeSending(r2)
            L55:
                androidx.core.app.RemoteInput r2 = r1.build()
                return r2
        }

        static android.os.Bundle getResultsFromIntent(android.content.Intent r1) {
                android.os.Bundle r0 = android.app.RemoteInput.getResultsFromIntent(r1)
                return r0
        }
    }

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void addDataResultToIntent(androidx.core.app.RemoteInput r1, android.content.Intent r2, java.util.Map<java.lang.String, android.net.Uri> r3) {
                android.app.RemoteInput r0 = androidx.core.app.RemoteInput.fromCompat(r1)
                android.app.RemoteInput.addDataResultToIntent(r0, r2, r3)
                return
        }

        static java.util.Set<java.lang.String> getAllowedDataTypes(java.lang.Object r1) {
                r0 = r1
                android.app.RemoteInput r0 = (android.app.RemoteInput) r0
                java.util.Set r0 = r0.getAllowedDataTypes()
                return r0
        }

        static java.util.Map<java.lang.String, android.net.Uri> getDataResultsFromIntent(android.content.Intent r1, java.lang.String r2) {
                java.util.Map r0 = android.app.RemoteInput.getDataResultsFromIntent(r1, r2)
                return r0
        }

        static android.app.RemoteInput.Builder setAllowDataType(android.app.RemoteInput.Builder r1, java.lang.String r2, boolean r3) {
                android.app.RemoteInput$Builder r0 = r1.setAllowDataType(r2, r3)
                return r0
        }
    }

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getResultsSource(android.content.Intent r1) {
                int r0 = android.app.RemoteInput.getResultsSource(r1)
                return r0
        }

        static void setResultsSource(android.content.Intent r0, int r1) {
                android.app.RemoteInput.setResultsSource(r0, r1)
                return
        }
    }

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getEditChoicesBeforeSending(java.lang.Object r1) {
                r0 = r1
                android.app.RemoteInput r0 = (android.app.RemoteInput) r0
                int r0 = r0.getEditChoicesBeforeSending()
                return r0
        }

        static android.app.RemoteInput.Builder setEditChoicesBeforeSending(android.app.RemoteInput.Builder r1, int r2) {
                android.app.RemoteInput$Builder r0 = r1.setEditChoicesBeforeSending(r2)
                return r0
        }
    }

    public static final class Builder {
        private boolean mAllowFreeFormTextInput;
        private final java.util.Set<java.lang.String> mAllowedDataTypes;
        private java.lang.CharSequence[] mChoices;
        private int mEditChoicesBeforeSending;
        private final android.os.Bundle mExtras;
        private java.lang.CharSequence mLabel;
        private final java.lang.String mResultKey;

        public Builder(java.lang.String r3) {
                r2 = this;
                r2.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r2.mAllowedDataTypes = r0
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                r2.mExtras = r0
                r0 = 1
                r2.mAllowFreeFormTextInput = r0
                r0 = 0
                r2.mEditChoicesBeforeSending = r0
                if (r3 == 0) goto L1c
                r2.mResultKey = r3
                return
            L1c:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Result key can't be null"
                r0.<init>(r1)
                throw r0
        }

        public androidx.core.app.RemoteInput.Builder addExtras(android.os.Bundle r2) {
                r1 = this;
                if (r2 == 0) goto L7
                android.os.Bundle r0 = r1.mExtras
                r0.putAll(r2)
            L7:
                return r1
        }

        public androidx.core.app.RemoteInput build() {
                r9 = this;
                androidx.core.app.RemoteInput r8 = new androidx.core.app.RemoteInput
                java.lang.String r1 = r9.mResultKey
                java.lang.CharSequence r2 = r9.mLabel
                java.lang.CharSequence[] r3 = r9.mChoices
                boolean r4 = r9.mAllowFreeFormTextInput
                int r5 = r9.mEditChoicesBeforeSending
                android.os.Bundle r6 = r9.mExtras
                java.util.Set<java.lang.String> r7 = r9.mAllowedDataTypes
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
        }

        public android.os.Bundle getExtras() {
                r1 = this;
                android.os.Bundle r0 = r1.mExtras
                return r0
        }

        public androidx.core.app.RemoteInput.Builder setAllowDataType(java.lang.String r2, boolean r3) {
                r1 = this;
                if (r3 == 0) goto L8
                java.util.Set<java.lang.String> r0 = r1.mAllowedDataTypes
                r0.add(r2)
                goto Ld
            L8:
                java.util.Set<java.lang.String> r0 = r1.mAllowedDataTypes
                r0.remove(r2)
            Ld:
                return r1
        }

        public androidx.core.app.RemoteInput.Builder setAllowFreeFormInput(boolean r1) {
                r0 = this;
                r0.mAllowFreeFormTextInput = r1
                return r0
        }

        public androidx.core.app.RemoteInput.Builder setChoices(java.lang.CharSequence[] r1) {
                r0 = this;
                r0.mChoices = r1
                return r0
        }

        public androidx.core.app.RemoteInput.Builder setEditChoicesBeforeSending(int r1) {
                r0 = this;
                r0.mEditChoicesBeforeSending = r1
                return r0
        }

        public androidx.core.app.RemoteInput.Builder setLabel(java.lang.CharSequence r1) {
                r0 = this;
                r0.mLabel = r1
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface EditChoicesBeforeSending {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Source {
    }

    RemoteInput(java.lang.String r3, java.lang.CharSequence r4, java.lang.CharSequence[] r5, boolean r6, int r7, android.os.Bundle r8, java.util.Set<java.lang.String> r9) {
            r2 = this;
            r2.<init>()
            r2.mResultKey = r3
            r2.mLabel = r4
            r2.mChoices = r5
            r2.mAllowFreeFormTextInput = r6
            r2.mEditChoicesBeforeSending = r7
            r2.mExtras = r8
            r2.mAllowedDataTypes = r9
            int r0 = r2.getEditChoicesBeforeSending()
            r1 = 2
            if (r0 != r1) goto L27
            boolean r0 = r2.getAllowFreeFormInput()
            if (r0 == 0) goto L1f
            goto L27
        L1f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "setEditChoicesBeforeSending requires setAllowFreeFormInput"
            r0.<init>(r1)
            throw r0
        L27:
            return
    }

    public static void addDataResultToIntent(androidx.core.app.RemoteInput r0, android.content.Intent r1, java.util.Map<java.lang.String, android.net.Uri> r2) {
            androidx.core.app.RemoteInput.Api26Impl.addDataResultToIntent(r0, r1, r2)
            return
    }

    public static void addResultsToIntent(androidx.core.app.RemoteInput[] r1, android.content.Intent r2, android.os.Bundle r3) {
            android.app.RemoteInput[] r0 = fromCompat(r1)
            androidx.core.app.RemoteInput.Api20Impl.addResultsToIntent(r0, r2, r3)
            return
    }

    static android.app.RemoteInput fromCompat(androidx.core.app.RemoteInput r1) {
            android.app.RemoteInput r0 = androidx.core.app.RemoteInput.Api20Impl.fromCompat(r1)
            return r0
    }

    static android.app.RemoteInput[] fromCompat(androidx.core.app.RemoteInput[] r3) {
            if (r3 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = r3.length
            android.app.RemoteInput[] r0 = new android.app.RemoteInput[r0]
            r1 = 0
        L8:
            int r2 = r3.length
            if (r1 >= r2) goto L16
            r2 = r3[r1]
            android.app.RemoteInput r2 = fromCompat(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L16:
            return r0
    }

    static androidx.core.app.RemoteInput fromPlatform(android.app.RemoteInput r1) {
            androidx.core.app.RemoteInput r0 = androidx.core.app.RemoteInput.Api20Impl.fromPlatform(r1)
            return r0
    }

    private static android.content.Intent getClipDataIntentFromIntent(android.content.Intent r5) {
            android.content.ClipData r0 = androidx.core.app.RemoteInput.Api16Impl.getClipData(r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.content.ClipDescription r2 = r0.getDescription()
            java.lang.String r3 = "text/vnd.android.intent"
            boolean r3 = r2.hasMimeType(r3)
            if (r3 != 0) goto L15
            return r1
        L15:
            java.lang.CharSequence r3 = r2.getLabel()
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "android.remoteinput.results"
            boolean r3 = r3.contentEquals(r4)
            if (r3 != 0) goto L26
            return r1
        L26:
            r1 = 0
            android.content.ClipData$Item r1 = r0.getItemAt(r1)
            android.content.Intent r1 = r1.getIntent()
            return r1
    }

    public static java.util.Map<java.lang.String, android.net.Uri> getDataResultsFromIntent(android.content.Intent r1, java.lang.String r2) {
            java.util.Map r0 = androidx.core.app.RemoteInput.Api26Impl.getDataResultsFromIntent(r1, r2)
            return r0
    }

    private static java.lang.String getExtraResultsKeyForData(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "android.remoteinput.dataTypeResultsData"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static android.os.Bundle getResultsFromIntent(android.content.Intent r1) {
            android.os.Bundle r0 = androidx.core.app.RemoteInput.Api20Impl.getResultsFromIntent(r1)
            return r0
    }

    public static int getResultsSource(android.content.Intent r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            int r0 = androidx.core.app.RemoteInput.Api28Impl.getResultsSource(r4)
            return r0
        Lb:
            android.content.Intent r0 = getClipDataIntentFromIntent(r4)
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            android.os.Bundle r2 = r0.getExtras()
            java.lang.String r3 = "android.remoteinput.resultsSource"
            int r1 = r2.getInt(r3, r1)
            return r1
    }

    public static void setResultsSource(android.content.Intent r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto La
            androidx.core.app.RemoteInput.Api28Impl.setResultsSource(r2, r3)
            goto L25
        La:
            android.content.Intent r0 = getClipDataIntentFromIntent(r2)
            if (r0 != 0) goto L17
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r0 = r1
        L17:
            java.lang.String r1 = "android.remoteinput.resultsSource"
            r0.putExtra(r1, r3)
            java.lang.String r1 = "android.remoteinput.results"
            android.content.ClipData r1 = android.content.ClipData.newIntent(r1, r0)
            androidx.core.app.RemoteInput.Api16Impl.setClipData(r2, r1)
        L25:
            return
    }

    public boolean getAllowFreeFormInput() {
            r1 = this;
            boolean r0 = r1.mAllowFreeFormTextInput
            return r0
    }

    public java.util.Set<java.lang.String> getAllowedDataTypes() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.mAllowedDataTypes
            return r0
    }

    public java.lang.CharSequence[] getChoices() {
            r1 = this;
            java.lang.CharSequence[] r0 = r1.mChoices
            return r0
    }

    public int getEditChoicesBeforeSending() {
            r1 = this;
            int r0 = r1.mEditChoicesBeforeSending
            return r0
    }

    public android.os.Bundle getExtras() {
            r1 = this;
            android.os.Bundle r0 = r1.mExtras
            return r0
    }

    public java.lang.CharSequence getLabel() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mLabel
            return r0
    }

    public java.lang.String getResultKey() {
            r1 = this;
            java.lang.String r0 = r1.mResultKey
            return r0
    }

    public boolean isDataOnly() {
            r1 = this;
            boolean r0 = r1.getAllowFreeFormInput()
            if (r0 != 0) goto L25
            java.lang.CharSequence[] r0 = r1.getChoices()
            if (r0 == 0) goto L13
            java.lang.CharSequence[] r0 = r1.getChoices()
            int r0 = r0.length
            if (r0 != 0) goto L25
        L13:
            java.util.Set r0 = r1.getAllowedDataTypes()
            if (r0 == 0) goto L25
            java.util.Set r0 = r1.getAllowedDataTypes()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            return r0
    }
}

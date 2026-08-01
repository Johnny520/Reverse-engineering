package androidx.emoji2.text;

/* JADX INFO: loaded from: classes2.dex */
final class EmojiProcessor {
    private static final int ACTION_ADVANCE_BOTH = 1;
    private static final int ACTION_ADVANCE_END = 2;
    private static final int ACTION_FLUSH = 3;
    private final int[] mEmojiAsDefaultStyleExceptions;
    private androidx.emoji2.text.EmojiCompat.GlyphChecker mGlyphChecker;
    private final androidx.emoji2.text.MetadataRepo mMetadataRepo;
    private final androidx.emoji2.text.EmojiCompat.SpanFactory mSpanFactory;
    private final boolean mUseEmojiAsDefaultStyle;

    private static final class CodepointIndexFinder {
        private static final int INVALID_INDEX = -1;

        private CodepointIndexFinder() {
                r0 = this;
                r0.<init>()
                return
        }

        static int findIndexBackward(java.lang.CharSequence r7, int r8, int r9) {
                r0 = r8
                r1 = 0
                int r2 = r7.length()
                r3 = -1
                if (r0 < 0) goto L3f
                if (r2 >= r0) goto Lc
                goto L3f
            Lc:
                if (r9 >= 0) goto Lf
                return r3
            Lf:
                r4 = r9
            L10:
                if (r4 != 0) goto L13
                return r0
            L13:
                int r0 = r0 + (-1)
                if (r0 >= 0) goto L1c
                if (r1 == 0) goto L1a
                return r3
            L1a:
                r3 = 0
                return r3
            L1c:
                char r5 = r7.charAt(r0)
                if (r1 == 0) goto L2d
                boolean r6 = java.lang.Character.isHighSurrogate(r5)
                if (r6 != 0) goto L29
                return r3
            L29:
                r1 = 0
                int r4 = r4 + (-1)
                goto L10
            L2d:
                boolean r6 = java.lang.Character.isSurrogate(r5)
                if (r6 != 0) goto L36
                int r4 = r4 + (-1)
                goto L10
            L36:
                boolean r6 = java.lang.Character.isHighSurrogate(r5)
                if (r6 == 0) goto L3d
                return r3
            L3d:
                r1 = 1
                goto L10
            L3f:
                return r3
        }

        static int findIndexForward(java.lang.CharSequence r7, int r8, int r9) {
                r0 = r8
                r1 = 0
                int r2 = r7.length()
                r3 = -1
                if (r0 < 0) goto L43
                if (r2 >= r0) goto Lc
                goto L43
            Lc:
                if (r9 >= 0) goto Lf
                return r3
            Lf:
                r4 = r9
            L10:
                if (r4 != 0) goto L13
                return r0
            L13:
                if (r0 < r2) goto L19
                if (r1 == 0) goto L18
                return r3
            L18:
                return r2
            L19:
                char r5 = r7.charAt(r0)
                if (r1 == 0) goto L2c
                boolean r6 = java.lang.Character.isLowSurrogate(r5)
                if (r6 != 0) goto L26
                return r3
            L26:
                int r4 = r4 + (-1)
                r1 = 0
                int r0 = r0 + 1
                goto L10
            L2c:
                boolean r6 = java.lang.Character.isSurrogate(r5)
                if (r6 != 0) goto L37
                int r4 = r4 + (-1)
                int r0 = r0 + 1
                goto L10
            L37:
                boolean r6 = java.lang.Character.isLowSurrogate(r5)
                if (r6 == 0) goto L3e
                return r3
            L3e:
                r1 = 1
                int r0 = r0 + 1
                goto L10
            L43:
                return r3
        }
    }

    static final class ProcessorSm {
        private static final int STATE_DEFAULT = 1;
        private static final int STATE_WALKING = 2;
        private int mCurrentDepth;
        private androidx.emoji2.text.MetadataRepo.Node mCurrentNode;
        private final int[] mEmojiAsDefaultStyleExceptions;
        private androidx.emoji2.text.MetadataRepo.Node mFlushNode;
        private int mLastCodepoint;
        private final androidx.emoji2.text.MetadataRepo.Node mRootNode;
        private int mState;
        private final boolean mUseEmojiAsDefaultStyle;

        ProcessorSm(androidx.emoji2.text.MetadataRepo.Node r2, boolean r3, int[] r4) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.mState = r0
                r1.mRootNode = r2
                r1.mCurrentNode = r2
                r1.mUseEmojiAsDefaultStyle = r3
                r1.mEmojiAsDefaultStyleExceptions = r4
                return
        }

        private static boolean isEmojiStyle(int r1) {
                r0 = 65039(0xfe0f, float:9.1139E-41)
                if (r1 != r0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                return r0
        }

        private static boolean isTextStyle(int r1) {
                r0 = 65038(0xfe0e, float:9.1138E-41)
                if (r1 != r0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                return r0
        }

        private int reset() {
                r2 = this;
                r0 = 1
                r2.mState = r0
                androidx.emoji2.text.MetadataRepo$Node r1 = r2.mRootNode
                r2.mCurrentNode = r1
                r1 = 0
                r2.mCurrentDepth = r1
                return r0
        }

        private boolean shouldUseEmojiPresentationStyleForSingleCodepoint() {
                r4 = this;
                androidx.emoji2.text.MetadataRepo$Node r0 = r4.mCurrentNode
                androidx.emoji2.text.EmojiMetadata r0 = r0.getData()
                boolean r0 = r0.isDefaultEmoji()
                r1 = 1
                if (r0 == 0) goto Le
                return r1
            Le:
                int r0 = r4.mLastCodepoint
                boolean r0 = isEmojiStyle(r0)
                if (r0 == 0) goto L17
                return r1
            L17:
                boolean r0 = r4.mUseEmojiAsDefaultStyle
                r2 = 0
                if (r0 == 0) goto L34
                int[] r0 = r4.mEmojiAsDefaultStyleExceptions
                if (r0 != 0) goto L21
                return r1
            L21:
                androidx.emoji2.text.MetadataRepo$Node r0 = r4.mCurrentNode
                androidx.emoji2.text.EmojiMetadata r0 = r0.getData()
                int r0 = r0.getCodepointAt(r2)
                int[] r3 = r4.mEmojiAsDefaultStyleExceptions
                int r3 = java.util.Arrays.binarySearch(r3, r0)
                if (r3 >= 0) goto L34
                return r1
            L34:
                return r2
        }

        int check(int r4) {
                r3 = this;
                androidx.emoji2.text.MetadataRepo$Node r0 = r3.mCurrentNode
                androidx.emoji2.text.MetadataRepo$Node r0 = r0.get(r4)
                int r1 = r3.mState
                r2 = 1
                switch(r1) {
                    case 2: goto L13;
                    default: goto Lc;
                }
            Lc:
                if (r0 != 0) goto L5f
                int r1 = r3.reset()
                goto L67
            L13:
                if (r0 == 0) goto L1e
                r3.mCurrentNode = r0
                int r1 = r3.mCurrentDepth
                int r1 = r1 + r2
                r3.mCurrentDepth = r1
                r1 = 2
                goto L67
            L1e:
                boolean r1 = isTextStyle(r4)
                if (r1 == 0) goto L29
                int r1 = r3.reset()
                goto L67
            L29:
                boolean r1 = isEmojiStyle(r4)
                if (r1 == 0) goto L31
                r1 = 2
                goto L67
            L31:
                androidx.emoji2.text.MetadataRepo$Node r1 = r3.mCurrentNode
                androidx.emoji2.text.EmojiMetadata r1 = r1.getData()
                if (r1 == 0) goto L5a
                int r1 = r3.mCurrentDepth
                if (r1 != r2) goto L51
                boolean r1 = r3.shouldUseEmojiPresentationStyleForSingleCodepoint()
                if (r1 == 0) goto L4c
                androidx.emoji2.text.MetadataRepo$Node r1 = r3.mCurrentNode
                r3.mFlushNode = r1
                r1 = 3
                r3.reset()
                goto L67
            L4c:
                int r1 = r3.reset()
                goto L67
            L51:
                androidx.emoji2.text.MetadataRepo$Node r1 = r3.mCurrentNode
                r3.mFlushNode = r1
                r1 = 3
                r3.reset()
                goto L67
            L5a:
                int r1 = r3.reset()
                goto L67
            L5f:
                r1 = 2
                r3.mState = r1
                r3.mCurrentNode = r0
                r3.mCurrentDepth = r2
                r1 = 2
            L67:
                r3.mLastCodepoint = r4
                return r1
        }

        androidx.emoji2.text.EmojiMetadata getCurrentMetadata() {
                r1 = this;
                androidx.emoji2.text.MetadataRepo$Node r0 = r1.mCurrentNode
                androidx.emoji2.text.EmojiMetadata r0 = r0.getData()
                return r0
        }

        androidx.emoji2.text.EmojiMetadata getFlushMetadata() {
                r1 = this;
                androidx.emoji2.text.MetadataRepo$Node r0 = r1.mFlushNode
                androidx.emoji2.text.EmojiMetadata r0 = r0.getData()
                return r0
        }

        boolean isInFlushableState() {
                r2 = this;
                int r0 = r2.mState
                r1 = 2
                if (r0 != r1) goto L19
                androidx.emoji2.text.MetadataRepo$Node r0 = r2.mCurrentNode
                androidx.emoji2.text.EmojiMetadata r0 = r0.getData()
                if (r0 == 0) goto L19
                int r0 = r2.mCurrentDepth
                r1 = 1
                if (r0 > r1) goto L18
                boolean r0 = r2.shouldUseEmojiPresentationStyleForSingleCodepoint()
                if (r0 == 0) goto L19
            L18:
                goto L1a
            L19:
                r1 = 0
            L1a:
                return r1
        }
    }

    EmojiProcessor(androidx.emoji2.text.MetadataRepo r1, androidx.emoji2.text.EmojiCompat.SpanFactory r2, androidx.emoji2.text.EmojiCompat.GlyphChecker r3, boolean r4, int[] r5) {
            r0 = this;
            r0.<init>()
            r0.mSpanFactory = r2
            r0.mMetadataRepo = r1
            r0.mGlyphChecker = r3
            r0.mUseEmojiAsDefaultStyle = r4
            r0.mEmojiAsDefaultStyleExceptions = r5
            return
    }

    private void addEmoji(android.text.Spannable r3, androidx.emoji2.text.EmojiMetadata r4, int r5, int r6) {
            r2 = this;
            androidx.emoji2.text.EmojiCompat$SpanFactory r0 = r2.mSpanFactory
            androidx.emoji2.text.EmojiSpan r0 = r0.createSpan(r4)
            r1 = 33
            r3.setSpan(r0, r5, r6, r1)
            return
    }

    private static boolean delete(android.text.Editable r9, android.view.KeyEvent r10, boolean r11) {
            boolean r0 = hasModifiers(r10)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = android.text.Selection.getSelectionStart(r9)
            int r2 = android.text.Selection.getSelectionEnd(r9)
            boolean r3 = hasInvalidSelection(r0, r2)
            if (r3 == 0) goto L17
            return r1
        L17:
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r3 = androidx.emoji2.text.EmojiSpan.class
            java.lang.Object[] r3 = r9.getSpans(r0, r2, r3)
            androidx.emoji2.text.EmojiSpan[] r3 = (androidx.emoji2.text.EmojiSpan[]) r3
            if (r3 == 0) goto L46
            int r4 = r3.length
            if (r4 <= 0) goto L46
            int r4 = r3.length
            r5 = 0
        L26:
            if (r5 >= r4) goto L46
            r6 = r3[r5]
            int r7 = r9.getSpanStart(r6)
            int r8 = r9.getSpanEnd(r6)
            if (r11 == 0) goto L36
            if (r7 == r0) goto L3e
        L36:
            if (r11 != 0) goto L3a
            if (r8 == r0) goto L3e
        L3a:
            if (r0 <= r7) goto L43
            if (r0 >= r8) goto L43
        L3e:
            r9.delete(r7, r8)
            r1 = 1
            return r1
        L43:
            int r5 = r5 + 1
            goto L26
        L46:
            return r1
    }

    static boolean handleDeleteSurroundingText(android.view.inputmethod.InputConnection r11, android.text.Editable r12, int r13, int r14, boolean r15) {
            r0 = 0
            if (r12 == 0) goto L85
            if (r11 != 0) goto L7
            goto L85
        L7:
            if (r13 < 0) goto L84
            if (r14 >= 0) goto Ld
            goto L84
        Ld:
            int r1 = android.text.Selection.getSelectionStart(r12)
            int r2 = android.text.Selection.getSelectionEnd(r12)
            boolean r3 = hasInvalidSelection(r1, r2)
            if (r3 == 0) goto L1c
            return r0
        L1c:
            if (r15 == 0) goto L36
        L1f:
            int r3 = java.lang.Math.max(r13, r0)
            int r3 = androidx.emoji2.text.EmojiProcessor.CodepointIndexFinder.findIndexBackward(r12, r1, r3)
            int r4 = java.lang.Math.max(r14, r0)
            int r4 = androidx.emoji2.text.EmojiProcessor.CodepointIndexFinder.findIndexForward(r12, r2, r4)
            r5 = -1
            if (r3 == r5) goto L35
            if (r4 != r5) goto L46
        L35:
            return r0
        L36:
            int r3 = r1 - r13
            int r3 = java.lang.Math.max(r3, r0)
            int r4 = r2 + r14
            int r5 = r12.length()
            int r4 = java.lang.Math.min(r4, r5)
        L46:
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r5 = androidx.emoji2.text.EmojiSpan.class
            java.lang.Object[] r5 = r12.getSpans(r3, r4, r5)
            androidx.emoji2.text.EmojiSpan[] r5 = (androidx.emoji2.text.EmojiSpan[]) r5
            if (r5 == 0) goto L83
            int r6 = r5.length
            if (r6 <= 0) goto L83
            int r6 = r5.length
            r7 = 0
        L55:
            if (r7 >= r6) goto L6c
            r8 = r5[r7]
            int r9 = r12.getSpanStart(r8)
            int r10 = r12.getSpanEnd(r8)
            int r3 = java.lang.Math.min(r9, r3)
            int r4 = java.lang.Math.max(r10, r4)
            int r7 = r7 + 1
            goto L55
        L6c:
            int r0 = java.lang.Math.max(r3, r0)
            int r3 = r12.length()
            int r3 = java.lang.Math.min(r4, r3)
            r11.beginBatchEdit()
            r12.delete(r0, r3)
            r11.endBatchEdit()
            r4 = 1
            return r4
        L83:
            return r0
        L84:
            return r0
        L85:
            return r0
    }

    static boolean handleOnKeyDown(android.text.Editable r3, int r4, android.view.KeyEvent r5) {
            r0 = 1
            r1 = 0
            switch(r4) {
                case 67: goto Lc;
                case 112: goto L7;
                default: goto L5;
            }
        L5:
            r2 = 0
            goto L11
        L7:
            boolean r2 = delete(r3, r5, r0)
            goto L11
        Lc:
            boolean r2 = delete(r3, r5, r1)
        L11:
            if (r2 == 0) goto L17
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(r3)
            return r0
        L17:
            return r1
    }

    private boolean hasGlyph(java.lang.CharSequence r3, int r4, int r5, androidx.emoji2.text.EmojiMetadata r6) {
            r2 = this;
            int r0 = r6.getHasGlyph()
            if (r0 != 0) goto L13
            androidx.emoji2.text.EmojiCompat$GlyphChecker r0 = r2.mGlyphChecker
            short r1 = r6.getSdkAdded()
            boolean r0 = r0.hasGlyph(r3, r4, r5, r1)
            r6.setHasGlyph(r0)
        L13:
            int r0 = r6.getHasGlyph()
            r1 = 2
            if (r0 != r1) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
    }

    private static boolean hasInvalidSelection(int r1, int r2) {
            r0 = -1
            if (r1 == r0) goto La
            if (r2 == r0) goto La
            if (r1 == r2) goto L8
            goto La
        L8:
            r0 = 0
            goto Lb
        La:
            r0 = 1
        Lb:
            return r0
    }

    private static boolean hasModifiers(android.view.KeyEvent r1) {
            int r0 = r1.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            r0 = r0 ^ 1
            return r0
    }

    int getEmojiMatch(java.lang.CharSequence r2) {
            r1 = this;
            androidx.emoji2.text.MetadataRepo r0 = r1.mMetadataRepo
            int r0 = r0.getMetadataVersion()
            int r0 = r1.getEmojiMatch(r2, r0)
            return r0
    }

    int getEmojiMatch(java.lang.CharSequence r10, int r11) {
            r9 = this;
            androidx.emoji2.text.EmojiProcessor$ProcessorSm r0 = new androidx.emoji2.text.EmojiProcessor$ProcessorSm
            androidx.emoji2.text.MetadataRepo r1 = r9.mMetadataRepo
            androidx.emoji2.text.MetadataRepo$Node r1 = r1.getRootNode()
            boolean r2 = r9.mUseEmojiAsDefaultStyle
            int[] r3 = r9.mEmojiAsDefaultStyleExceptions
            r0.<init>(r1, r2, r3)
            int r1 = r10.length()
            r2 = 0
            r3 = 0
            r4 = 0
        L16:
            if (r2 >= r1) goto L4d
            int r5 = java.lang.Character.codePointAt(r10, r2)
            int r6 = r0.check(r5)
            androidx.emoji2.text.EmojiMetadata r7 = r0.getCurrentMetadata()
            switch(r6) {
                case 1: goto L3b;
                case 2: goto L35;
                case 3: goto L28;
                default: goto L27;
            }
        L27:
            goto L42
        L28:
            androidx.emoji2.text.EmojiMetadata r7 = r0.getFlushMetadata()
            short r8 = r7.getCompatAdded()
            if (r8 > r11) goto L42
            int r4 = r4 + 1
            goto L42
        L35:
            int r8 = java.lang.Character.charCount(r5)
            int r2 = r2 + r8
            goto L42
        L3b:
            int r8 = java.lang.Character.charCount(r5)
            int r2 = r2 + r8
            r3 = 0
        L42:
            if (r7 == 0) goto L4c
            short r8 = r7.getCompatAdded()
            if (r8 > r11) goto L4c
            int r3 = r3 + 1
        L4c:
            goto L16
        L4d:
            r5 = 2
            if (r4 == 0) goto L51
            return r5
        L51:
            boolean r6 = r0.isInFlushableState()
            if (r6 == 0) goto L63
            androidx.emoji2.text.EmojiMetadata r6 = r0.getCurrentMetadata()
            short r7 = r6.getCompatAdded()
            if (r7 > r11) goto L63
            r5 = 1
            return r5
        L63:
            if (r3 != 0) goto L67
            r5 = 0
            return r5
        L67:
            return r5
    }

    java.lang.CharSequence process(java.lang.CharSequence r10, int r11, int r12, int r13, boolean r14) {
            r9 = this;
            boolean r0 = r10 instanceof androidx.emoji2.text.SpannableBuilder
            if (r0 == 0) goto La
            r1 = r10
            androidx.emoji2.text.SpannableBuilder r1 = (androidx.emoji2.text.SpannableBuilder) r1
            r1.beginBatchEdit()
        La:
            r1 = 0
            if (r0 != 0) goto L2c
            boolean r2 = r10 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L130
            if (r2 == 0) goto L12
            goto L2c
        L12:
            boolean r2 = r10 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L130
            if (r2 == 0) goto L35
            r2 = r10
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch: java.lang.Throwable -> L130
            int r3 = r11 + (-1)
            int r4 = r12 + 1
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r5 = androidx.emoji2.text.EmojiSpan.class
            int r2 = r2.nextSpanTransition(r3, r4, r5)     // Catch: java.lang.Throwable -> L130
            if (r2 > r12) goto L35
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r3 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable     // Catch: java.lang.Throwable -> L130
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L130
            r1 = r3
            goto L35
        L2c:
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r2 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable     // Catch: java.lang.Throwable -> L130
            r3 = r10
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch: java.lang.Throwable -> L130
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L130
            r1 = r2
        L35:
            if (r1 == 0) goto L64
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r2 = androidx.emoji2.text.EmojiSpan.class
            java.lang.Object[] r2 = r1.getSpans(r11, r12, r2)     // Catch: java.lang.Throwable -> L130
            androidx.emoji2.text.EmojiSpan[] r2 = (androidx.emoji2.text.EmojiSpan[]) r2     // Catch: java.lang.Throwable -> L130
            if (r2 == 0) goto L64
            int r3 = r2.length     // Catch: java.lang.Throwable -> L130
            if (r3 <= 0) goto L64
            int r3 = r2.length     // Catch: java.lang.Throwable -> L130
            r4 = 0
        L46:
            if (r4 >= r3) goto L64
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L130
            int r6 = r1.getSpanStart(r5)     // Catch: java.lang.Throwable -> L130
            int r7 = r1.getSpanEnd(r5)     // Catch: java.lang.Throwable -> L130
            if (r6 == r12) goto L57
            r1.removeSpan(r5)     // Catch: java.lang.Throwable -> L130
        L57:
            int r8 = java.lang.Math.min(r6, r11)     // Catch: java.lang.Throwable -> L130
            r11 = r8
            int r8 = java.lang.Math.max(r7, r12)     // Catch: java.lang.Throwable -> L130
            r12 = r8
            int r4 = r4 + 1
            goto L46
        L64:
            if (r11 == r12) goto L126
            int r2 = r10.length()     // Catch: java.lang.Throwable -> L130
            if (r11 < r2) goto L6e
            goto L126
        L6e:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r2) goto L84
            if (r1 == 0) goto L84
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L130
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r3 = androidx.emoji2.text.EmojiSpan.class
            r4 = 0
            java.lang.Object[] r2 = r1.getSpans(r4, r2, r3)     // Catch: java.lang.Throwable -> L130
            androidx.emoji2.text.EmojiSpan[] r2 = (androidx.emoji2.text.EmojiSpan[]) r2     // Catch: java.lang.Throwable -> L130
            int r2 = r2.length     // Catch: java.lang.Throwable -> L130
            int r13 = r13 - r2
        L84:
            r2 = 0
            androidx.emoji2.text.EmojiProcessor$ProcessorSm r3 = new androidx.emoji2.text.EmojiProcessor$ProcessorSm     // Catch: java.lang.Throwable -> L130
            androidx.emoji2.text.MetadataRepo r4 = r9.mMetadataRepo     // Catch: java.lang.Throwable -> L130
            androidx.emoji2.text.MetadataRepo$Node r4 = r4.getRootNode()     // Catch: java.lang.Throwable -> L130
            boolean r5 = r9.mUseEmojiAsDefaultStyle     // Catch: java.lang.Throwable -> L130
            int[] r6 = r9.mEmojiAsDefaultStyleExceptions     // Catch: java.lang.Throwable -> L130
            r3.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> L130
            r4 = r11
            int r5 = java.lang.Character.codePointAt(r10, r4)     // Catch: java.lang.Throwable -> L130
        L99:
            if (r4 >= r12) goto Le8
            if (r2 >= r13) goto Le8
            int r6 = r3.check(r5)     // Catch: java.lang.Throwable -> L130
            switch(r6) {
                case 1: goto Ld6;
                case 2: goto Lc9;
                case 3: goto La5;
                default: goto La4;
            }     // Catch: java.lang.Throwable -> L130
        La4:
            goto Le7
        La5:
            if (r14 != 0) goto Lb1
            androidx.emoji2.text.EmojiMetadata r7 = r3.getFlushMetadata()     // Catch: java.lang.Throwable -> L130
            boolean r7 = r9.hasGlyph(r10, r11, r4, r7)     // Catch: java.lang.Throwable -> L130
            if (r7 != 0) goto Lc7
        Lb1:
            if (r1 != 0) goto Lbe
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r7 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable     // Catch: java.lang.Throwable -> L130
            android.text.SpannableString r8 = new android.text.SpannableString     // Catch: java.lang.Throwable -> L130
            r8.<init>(r10)     // Catch: java.lang.Throwable -> L130
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L130
            r1 = r7
        Lbe:
            androidx.emoji2.text.EmojiMetadata r7 = r3.getFlushMetadata()     // Catch: java.lang.Throwable -> L130
            r9.addEmoji(r1, r7, r11, r4)     // Catch: java.lang.Throwable -> L130
            int r2 = r2 + 1
        Lc7:
            r11 = r4
            goto Le7
        Lc9:
            int r7 = java.lang.Character.charCount(r5)     // Catch: java.lang.Throwable -> L130
            int r4 = r4 + r7
            if (r4 >= r12) goto Le7
            int r7 = java.lang.Character.codePointAt(r10, r4)     // Catch: java.lang.Throwable -> L130
            r5 = r7
            goto Le7
        Ld6:
            int r7 = java.lang.Character.codePointAt(r10, r11)     // Catch: java.lang.Throwable -> L130
            int r7 = java.lang.Character.charCount(r7)     // Catch: java.lang.Throwable -> L130
            int r11 = r11 + r7
            r4 = r11
            if (r4 >= r12) goto Le7
            int r7 = java.lang.Character.codePointAt(r10, r4)     // Catch: java.lang.Throwable -> L130
            r5 = r7
        Le7:
            goto L99
        Le8:
            boolean r6 = r3.isInFlushableState()     // Catch: java.lang.Throwable -> L130
            if (r6 == 0) goto L10d
            if (r2 >= r13) goto L10d
            if (r14 != 0) goto Lfc
            androidx.emoji2.text.EmojiMetadata r6 = r3.getCurrentMetadata()     // Catch: java.lang.Throwable -> L130
            boolean r6 = r9.hasGlyph(r10, r11, r4, r6)     // Catch: java.lang.Throwable -> L130
            if (r6 != 0) goto L10d
        Lfc:
            if (r1 != 0) goto L104
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r6 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable     // Catch: java.lang.Throwable -> L130
            r6.<init>(r10)     // Catch: java.lang.Throwable -> L130
            r1 = r6
        L104:
            androidx.emoji2.text.EmojiMetadata r6 = r3.getCurrentMetadata()     // Catch: java.lang.Throwable -> L130
            r9.addEmoji(r1, r6, r11, r4)     // Catch: java.lang.Throwable -> L130
            int r2 = r2 + 1
        L10d:
            if (r1 == 0) goto L11c
            android.text.Spannable r6 = r1.getUnwrappedSpannable()     // Catch: java.lang.Throwable -> L130
            if (r0 == 0) goto L11b
            r7 = r10
            androidx.emoji2.text.SpannableBuilder r7 = (androidx.emoji2.text.SpannableBuilder) r7
            r7.endBatchEdit()
        L11b:
            return r6
        L11c:
            if (r0 == 0) goto L125
            r6 = r10
            androidx.emoji2.text.SpannableBuilder r6 = (androidx.emoji2.text.SpannableBuilder) r6
            r6.endBatchEdit()
        L125:
            return r10
        L126:
            if (r0 == 0) goto L12f
            r2 = r10
            androidx.emoji2.text.SpannableBuilder r2 = (androidx.emoji2.text.SpannableBuilder) r2
            r2.endBatchEdit()
        L12f:
            return r10
        L130:
            r1 = move-exception
            if (r0 == 0) goto L139
            r2 = r10
            androidx.emoji2.text.SpannableBuilder r2 = (androidx.emoji2.text.SpannableBuilder) r2
            r2.endBatchEdit()
        L139:
            throw r1
    }
}

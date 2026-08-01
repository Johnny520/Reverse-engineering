package p000;

/* JADX INFO: renamed from: э */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1128 {

    /* JADX INFO: renamed from: α */
    public final android.view.accessibility.AccessibilityNodeInfo f13478;

    /* JADX INFO: renamed from: β */
    public int f13479;

    /* JADX INFO: renamed from: γ */
    public int f13480;

    public C1128(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f13479 = r0
            r1.f13480 = r0
            r1.f13478 = r2
            return
    }

    /* JADX INFO: renamed from: δ */
    public static java.lang.String m7352(int r1) {
            r0 = 1
            if (r1 == r0) goto L90
            r0 = 2
            if (r1 == r0) goto L8d
            switch(r1) {
                case 4: goto L8a;
                case 8: goto L87;
                case 16: goto L84;
                case 32: goto L81;
                case 64: goto L7e;
                case 128: goto L7b;
                case 256: goto L78;
                case 512: goto L75;
                case 1024: goto L72;
                case 2048: goto L6f;
                case 4096: goto L6c;
                case 8192: goto L69;
                case 16384: goto L66;
                case 32768: goto L63;
                case 65536: goto L60;
                case 131072: goto L5d;
                case 262144: goto L5a;
                case 524288: goto L57;
                case 2097152: goto L54;
                case 16908354: goto L51;
                case 16908382: goto L4e;
                default: goto L9;
            }
        L9:
            switch(r1) {
                case 16908342: goto L4b;
                case 16908343: goto L48;
                case 16908344: goto L45;
                case 16908345: goto L42;
                case 16908346: goto L3f;
                case 16908347: goto L3c;
                case 16908348: goto L39;
                case 16908349: goto L36;
                default: goto Lc;
            }
        Lc:
            switch(r1) {
                case 16908356: goto L33;
                case 16908357: goto L30;
                case 16908358: goto L2d;
                case 16908359: goto L2a;
                case 16908360: goto L27;
                case 16908361: goto L24;
                case 16908362: goto L21;
                default: goto Lf;
            }
        Lf:
            switch(r1) {
                case 16908372: goto L1e;
                case 16908373: goto L1b;
                case 16908374: goto L18;
                case 16908375: goto L15;
                default: goto L12;
            }
        L12:
            java.lang.String r1 = "ACTION_UNKNOWN"
            return r1
        L15:
            java.lang.String r1 = "ACTION_DRAG_CANCEL"
            return r1
        L18:
            java.lang.String r1 = "ACTION_DRAG_DROP"
            return r1
        L1b:
            java.lang.String r1 = "ACTION_DRAG_START"
            return r1
        L1e:
            java.lang.String r1 = "ACTION_IME_ENTER"
            return r1
        L21:
            java.lang.String r1 = "ACTION_PRESS_AND_HOLD"
            return r1
        L24:
            java.lang.String r1 = "ACTION_PAGE_RIGHT"
            return r1
        L27:
            java.lang.String r1 = "ACTION_PAGE_LEFT"
            return r1
        L2a:
            java.lang.String r1 = "ACTION_PAGE_DOWN"
            return r1
        L2d:
            java.lang.String r1 = "ACTION_PAGE_UP"
            return r1
        L30:
            java.lang.String r1 = "ACTION_HIDE_TOOLTIP"
            return r1
        L33:
            java.lang.String r1 = "ACTION_SHOW_TOOLTIP"
            return r1
        L36:
            java.lang.String r1 = "ACTION_SET_PROGRESS"
            return r1
        L39:
            java.lang.String r1 = "ACTION_CONTEXT_CLICK"
            return r1
        L3c:
            java.lang.String r1 = "ACTION_SCROLL_RIGHT"
            return r1
        L3f:
            java.lang.String r1 = "ACTION_SCROLL_DOWN"
            return r1
        L42:
            java.lang.String r1 = "ACTION_SCROLL_LEFT"
            return r1
        L45:
            java.lang.String r1 = "ACTION_SCROLL_UP"
            return r1
        L48:
            java.lang.String r1 = "ACTION_SCROLL_TO_POSITION"
            return r1
        L4b:
            java.lang.String r1 = "ACTION_SHOW_ON_SCREEN"
            return r1
        L4e:
            java.lang.String r1 = "ACTION_SCROLL_IN_DIRECTION"
            return r1
        L51:
            java.lang.String r1 = "ACTION_MOVE_WINDOW"
            return r1
        L54:
            java.lang.String r1 = "ACTION_SET_TEXT"
            return r1
        L57:
            java.lang.String r1 = "ACTION_COLLAPSE"
            return r1
        L5a:
            java.lang.String r1 = "ACTION_EXPAND"
            return r1
        L5d:
            java.lang.String r1 = "ACTION_SET_SELECTION"
            return r1
        L60:
            java.lang.String r1 = "ACTION_CUT"
            return r1
        L63:
            java.lang.String r1 = "ACTION_PASTE"
            return r1
        L66:
            java.lang.String r1 = "ACTION_COPY"
            return r1
        L69:
            java.lang.String r1 = "ACTION_SCROLL_BACKWARD"
            return r1
        L6c:
            java.lang.String r1 = "ACTION_SCROLL_FORWARD"
            return r1
        L6f:
            java.lang.String r1 = "ACTION_PREVIOUS_HTML_ELEMENT"
            return r1
        L72:
            java.lang.String r1 = "ACTION_NEXT_HTML_ELEMENT"
            return r1
        L75:
            java.lang.String r1 = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY"
            return r1
        L78:
            java.lang.String r1 = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY"
            return r1
        L7b:
            java.lang.String r1 = "ACTION_CLEAR_ACCESSIBILITY_FOCUS"
            return r1
        L7e:
            java.lang.String r1 = "ACTION_ACCESSIBILITY_FOCUS"
            return r1
        L81:
            java.lang.String r1 = "ACTION_LONG_CLICK"
            return r1
        L84:
            java.lang.String r1 = "ACTION_CLICK"
            return r1
        L87:
            java.lang.String r1 = "ACTION_CLEAR_SELECTION"
            return r1
        L8a:
            java.lang.String r1 = "ACTION_SELECT"
            return r1
        L8d:
            java.lang.String r1 = "ACTION_CLEAR_FOCUS"
            return r1
        L90:
            java.lang.String r1 = "ACTION_FOCUS"
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof p000.C1128
            if (r2 != 0) goto Ld
            return r1
        Ld:
            э r5 = (p000.C1128) r5
            android.view.accessibility.AccessibilityNodeInfo r2 = r5.f13478
            android.view.accessibility.AccessibilityNodeInfo r3 = r4.f13478
            if (r3 != 0) goto L18
            if (r2 == 0) goto L1f
            return r1
        L18:
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1f
            return r1
        L1f:
            int r2 = r4.f13480
            int r3 = r5.f13480
            if (r2 == r3) goto L26
            return r1
        L26:
            int r4 = r4.f13479
            int r5 = r5.f13479
            if (r4 == r5) goto L2d
            return r1
        L2d:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f13478
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.view.accessibility.AccessibilityNodeInfo r2 = r11.f13478
            r2.getBoundsInParent(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "; boundsInParent: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            r2.getBoundsInScreen(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "; boundsInScreen: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 34
            if (r3 < r4) goto L45
            p000.AbstractC1117.m7292(r2, r1)
            goto L5e
        L45:
            android.os.Bundle r5 = r2.getExtras()
            java.lang.String r6 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY"
            android.os.Parcelable r5 = r5.getParcelable(r6)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            if (r5 == 0) goto L5e
            int r6 = r5.left
            int r7 = r5.top
            int r8 = r5.right
            int r5 = r5.bottom
            r1.set(r6, r7, r8, r5)
        L5e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "; boundsInWindow: "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r0.append(r1)
            java.lang.String r1 = "; packageName: "
            r0.append(r1)
            java.lang.CharSequence r1 = r2.getPackageName()
            r0.append(r1)
            java.lang.String r1 = "; className: "
            r0.append(r1)
            java.lang.CharSequence r1 = r2.getClassName()
            r0.append(r1)
            java.lang.String r1 = "; text: "
            r0.append(r1)
            java.lang.CharSequence r1 = r11.m7357()
            r0.append(r1)
            java.lang.String r1 = "; error: "
            r0.append(r1)
            java.lang.CharSequence r1 = r2.getError()
            r0.append(r1)
            java.lang.String r1 = "; maxTextLength: "
            r0.append(r1)
            int r1 = r2.getMaxTextLength()
            r0.append(r1)
            java.lang.String r1 = "; stateDescription: "
            r0.append(r1)
            java.lang.CharSequence r1 = r2.getStateDescription()
            r0.append(r1)
            java.lang.String r1 = "; contentDescription: "
            r0.append(r1)
            java.lang.CharSequence r1 = r2.getContentDescription()
            r0.append(r1)
            java.lang.String r1 = "; supplementalDescription: "
            r0.append(r1)
            r1 = 36
            if (r3 < r1) goto Ld1
            java.lang.CharSequence r5 = p000.AbstractC1127.m7349(r2)
            goto Ldb
        Ld1:
            android.os.Bundle r5 = r2.getExtras()
            java.lang.String r6 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY"
            java.lang.CharSequence r5 = r5.getCharSequence(r6)
        Ldb:
            r0.append(r5)
            java.lang.String r5 = "; tooltipText: "
            r0.append(r5)
            java.lang.CharSequence r5 = r2.getTooltipText()
            r0.append(r5)
            java.lang.String r5 = "; viewIdResName: "
            r0.append(r5)
            java.lang.String r5 = r2.getViewIdResourceName()
            r0.append(r5)
            java.lang.String r5 = "; uniqueId: "
            r0.append(r5)
            r5 = 33
            if (r3 < r5) goto L104
            java.lang.String r6 = p000.AbstractC1126.m7345(r2)
            goto L10e
        L104:
            android.os.Bundle r6 = r2.getExtras()
            java.lang.String r7 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"
            java.lang.String r6 = r6.getString(r7)
        L10e:
            r0.append(r6)
            java.lang.String r6 = "; checkable: "
            r0.append(r6)
            boolean r6 = r2.isCheckable()
            r0.append(r6)
            java.lang.String r6 = "; checked: "
            r0.append(r6)
            if (r3 < r1) goto L129
            int r6 = p000.AbstractC1127.m7347(r2)
            goto L137
        L129:
            android.os.Bundle r6 = r2.getExtras()
            java.lang.String r7 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY"
            boolean r8 = r2.isChecked()
            int r6 = r6.getInt(r7, r8)
        L137:
            java.lang.String r7 = "PARTIAL"
            r8 = 2
            r9 = 1
            if (r6 != r9) goto L140
            java.lang.String r6 = "TRUE"
            goto L146
        L140:
            if (r6 != r8) goto L144
            r6 = r7
            goto L146
        L144:
            java.lang.String r6 = "FALSE"
        L146:
            r0.append(r6)
            java.lang.String r6 = "; fieldRequired: "
            r0.append(r6)
            if (r3 < r1) goto L155
            boolean r6 = p000.AbstractC1127.m7350(r2)
            goto L15f
        L155:
            android.os.Bundle r6 = r2.getExtras()
            java.lang.String r10 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"
            boolean r6 = r6.getBoolean(r10)
        L15f:
            r0.append(r6)
            java.lang.String r6 = "; focusable: "
            r0.append(r6)
            boolean r6 = r2.isFocusable()
            r0.append(r6)
            java.lang.String r6 = "; focused: "
            r0.append(r6)
            boolean r6 = r2.isFocused()
            r0.append(r6)
            java.lang.String r6 = "; selected: "
            r0.append(r6)
            boolean r6 = r2.isSelected()
            r0.append(r6)
            java.lang.String r6 = "; clickable: "
            r0.append(r6)
            boolean r6 = r2.isClickable()
            r0.append(r6)
            java.lang.String r6 = "; longClickable: "
            r0.append(r6)
            boolean r6 = r2.isLongClickable()
            r0.append(r6)
            java.lang.String r6 = "; contextClickable: "
            r0.append(r6)
            boolean r6 = r2.isContextClickable()
            r0.append(r6)
            java.lang.String r6 = "; expandedState: "
            r0.append(r6)
            r6 = 0
            if (r3 < r1) goto L1b7
            int r1 = p000.AbstractC1127.m7348(r2)
            goto L1c1
        L1b7:
            android.os.Bundle r1 = r2.getExtras()
            java.lang.String r10 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY"
            int r1 = r1.getInt(r10, r6)
        L1c1:
            if (r1 == 0) goto L1d3
            if (r1 == r9) goto L1d0
            if (r1 == r8) goto L1d5
            r7 = 3
            if (r1 == r7) goto L1cd
            java.lang.String r7 = "UNKNOWN"
            goto L1d5
        L1cd:
            java.lang.String r7 = "FULL"
            goto L1d5
        L1d0:
            java.lang.String r7 = "COLLAPSED"
            goto L1d5
        L1d3:
            java.lang.String r7 = "UNDEFINED"
        L1d5:
            r0.append(r7)
            java.lang.String r1 = "; enabled: "
            r0.append(r1)
            boolean r1 = r2.isEnabled()
            r0.append(r1)
            java.lang.String r1 = "; password: "
            r0.append(r1)
            boolean r1 = r2.isPassword()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r7 = "; scrollable: "
            r1.<init>(r7)
            boolean r7 = r2.isScrollable()
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "; containerTitle: "
            r0.append(r1)
            if (r3 < r4) goto L211
            java.lang.CharSequence r1 = p000.AbstractC1117.m7293(r2)
            goto L21b
        L211:
            android.os.Bundle r1 = r2.getExtras()
            java.lang.String r7 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"
            java.lang.CharSequence r1 = r1.getCharSequence(r7)
        L21b:
            r0.append(r1)
            java.lang.String r1 = "; granularScrollingSupported: "
            r0.append(r1)
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            boolean r1 = r11.m7356(r1)
            r0.append(r1)
            java.lang.String r1 = "; importantForAccessibility: "
            r0.append(r1)
            boolean r1 = r2.isImportantForAccessibility()
            r0.append(r1)
            java.lang.String r1 = "; visible: "
            r0.append(r1)
            boolean r1 = r2.isVisibleToUser()
            r0.append(r1)
            java.lang.String r1 = "; isTextSelectable: "
            r0.append(r1)
            if (r3 < r5) goto L250
            boolean r1 = p000.AbstractC1126.m7346(r2)
            goto L256
        L250:
            r1 = 8388608(0x800000, float:1.1754944E-38)
            boolean r1 = r11.m7356(r1)
        L256:
            r0.append(r1)
            java.lang.String r1 = "; accessibilityDataSensitive: "
            r0.append(r1)
            if (r3 < r4) goto L265
            boolean r11 = p000.AbstractC1117.m7296(r2)
            goto L26b
        L265:
            r1 = 64
            boolean r11 = r11.m7356(r1)
        L26b:
            r0.append(r11)
            java.lang.String r11 = "; ["
            r0.append(r11)
            java.util.List r11 = r2.getActionList()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r11.size()
            r3 = r6
        L281:
            if (r3 >= r2) goto L293
            java.lang.Object r4 = r11.get(r3)
            ч r5 = new ч
            r7 = 0
            r5.<init>(r4, r6, r7, r7)
            r1.add(r5)
            int r3 = r3 + 1
            goto L281
        L293:
            int r11 = r1.size()
            if (r6 >= r11) goto L2da
            java.lang.Object r11 = r1.get(r6)
            ч r11 = (p000.C1125) r11
            java.lang.Object r2 = r11.f13476
            java.lang.Object r11 = r11.f13476
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r2 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r2
            int r2 = r2.getId()
            java.lang.String r2 = m7352(r2)
            java.lang.String r3 = "ACTION_UNKNOWN"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L2c8
            r3 = r11
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r3 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r3
            java.lang.CharSequence r3 = r3.getLabel()
            if (r3 == 0) goto L2c8
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r11 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r11
            java.lang.CharSequence r11 = r11.getLabel()
            java.lang.String r2 = r11.toString()
        L2c8:
            r0.append(r2)
            int r11 = r1.size()
            int r11 = r11 - r9
            if (r6 == r11) goto L2d7
            java.lang.String r11 = ", "
            r0.append(r11)
        L2d7:
            int r6 = r6 + 1
            goto L293
        L2da:
            java.lang.String r11 = "]"
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            return r11
    }

    /* JADX INFO: renamed from: α */
    public final void m7353(int r1) {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f13478
            r0.addAction(r1)
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m7354(p000.C1125 r1) {
            r0 = this;
            java.lang.Object r1 = r1.f13476
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r1 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r1
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f13478
            r0.addAction(r1)
            return
    }

    /* JADX INFO: renamed from: γ */
    public final java.util.ArrayList m7355(java.lang.String r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.f13478
            android.os.Bundle r0 = r1.getExtras()
            java.util.ArrayList r0 = r0.getIntegerArrayList(r2)
            if (r0 != 0) goto L18
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.os.Bundle r1 = r1.getExtras()
            r1.putIntegerArrayList(r2, r0)
        L18:
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public final boolean m7356(int r3) {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f13478
            android.os.Bundle r2 = r2.getExtras()
            r0 = 0
            if (r2 != 0) goto La
            goto L15
        La:
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"
            int r2 = r2.getInt(r1, r0)
            r2 = r2 & r3
            if (r2 != r3) goto L15
            r2 = 1
            return r2
        L15:
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public final java.lang.CharSequence m7357() {
            r11 = this;
            java.lang.String r0 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"
            java.util.ArrayList r1 = r11.m7355(r0)
            boolean r1 = r1.isEmpty()
            android.view.accessibility.AccessibilityNodeInfo r2 = r11.f13478
            if (r1 != 0) goto L7e
            java.util.ArrayList r0 = r11.m7355(r0)
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"
            java.util.ArrayList r1 = r11.m7355(r1)
            java.lang.String r3 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"
            java.util.ArrayList r3 = r11.m7355(r3)
            java.lang.String r4 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"
            java.util.ArrayList r4 = r11.m7355(r4)
            android.text.SpannableString r5 = new android.text.SpannableString
            java.lang.CharSequence r6 = r2.getText()
            java.lang.CharSequence r7 = r2.getText()
            int r7 = r7.length()
            r8 = 0
            java.lang.String r6 = android.text.TextUtils.substring(r6, r8, r7)
            r5.<init>(r6)
        L3a:
            int r6 = r0.size()
            if (r8 >= r6) goto L7d
            н r6 = new н
            java.lang.Object r7 = r4.get(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            android.os.Bundle r9 = r2.getExtras()
            java.lang.String r10 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY"
            int r9 = r9.getInt(r10)
            r6.<init>(r7, r11, r9)
            java.lang.Object r7 = r0.get(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r9 = r1.get(r8)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r10 = r3.get(r8)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r5.setSpan(r6, r7, r9, r10)
            int r8 = r8 + 1
            goto L3a
        L7d:
            return r5
        L7e:
            java.lang.CharSequence r11 = r2.getText()
            return r11
    }

    /* JADX INFO: renamed from: η */
    public final void m7358(java.lang.CharSequence r1) {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.f13478
            r0.setClassName(r1)
            return
    }
}

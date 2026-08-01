package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public final android.view.accessibility.AccessibilityNodeInfo a;
    public int b;

    public j0(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.b = r0
            r1.a = r2
            return
    }

    public final void a(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.a
            r0.addAction(r2)
            return
    }

    public final void b(defpackage.h0 r2) {
            r1 = this;
            java.lang.Object r2 = r2.a
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r2 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r2
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.a
            r0.addAction(r2)
            return
    }

    public final java.util.ArrayList c(java.lang.String r3) {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.a
            android.os.Bundle r1 = r0.getExtras()
            java.util.ArrayList r1 = r1.getIntegerArrayList(r3)
            if (r1 != 0) goto L18
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.os.Bundle r0 = r0.getExtras()
            r0.putIntegerArrayList(r3, r1)
        L18:
            return r1
    }

    public final void d(android.graphics.Rect r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.a
            r0.getBoundsInParent(r2)
            return
    }

    public final java.lang.CharSequence e() {
            r11 = this;
            java.lang.String r0 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"
            java.util.ArrayList r1 = r11.c(r0)
            boolean r1 = r1.isEmpty()
            android.view.accessibility.AccessibilityNodeInfo r2 = r11.a
            if (r1 != 0) goto L7e
            java.util.ArrayList r0 = r11.c(r0)
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"
            java.util.ArrayList r1 = r11.c(r1)
            java.lang.String r3 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"
            java.util.ArrayList r3 = r11.c(r3)
            java.lang.String r4 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"
            java.util.ArrayList r4 = r11.c(r4)
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
            u r6 = new u
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
            java.lang.CharSequence r0 = r2.getText()
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            if (r4 != 0) goto L7
            goto L24
        L7:
            boolean r1 = r4 instanceof defpackage.j0
            if (r1 != 0) goto Lc
            goto L24
        Lc:
            j0 r4 = (defpackage.j0) r4
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.a
            android.view.accessibility.AccessibilityNodeInfo r2 = r3.a
            if (r2 != 0) goto L17
            if (r1 == 0) goto L1e
            goto L24
        L17:
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L1e
            goto L24
        L1e:
            int r1 = r3.b
            int r4 = r4.b
            if (r1 == r4) goto L26
        L24:
            r4 = 0
            return r4
        L26:
            return r0
    }

    public final void f(defpackage.i0 r2) {
            r1 = this;
            java.lang.Object r2 = r2.a
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r2 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r2
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.a
            r0.setCollectionItemInfo(r2)
            return
    }

    public final int hashCode() {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.d(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "; boundsInParent: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            android.view.accessibility.AccessibilityNodeInfo r2 = r12.a
            r2.getBoundsInScreen(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "; boundsInScreen: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
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
            java.lang.CharSequence r1 = r12.e()
            r0.append(r1)
            java.lang.String r1 = "; contentDescription: "
            r0.append(r1)
            java.lang.CharSequence r1 = r2.getContentDescription()
            r0.append(r1)
            java.lang.String r1 = "; viewId: "
            r0.append(r1)
            java.lang.String r1 = r2.getViewIdResourceName()
            r0.append(r1)
            java.lang.String r1 = "; uniqueId: "
            r0.append(r1)
            boolean r1 = defpackage.ip.A()
            if (r1 == 0) goto L87
            java.lang.String r1 = defpackage.e0.f(r2)
            goto L91
        L87:
            android.os.Bundle r1 = r2.getExtras()
            java.lang.String r3 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"
            java.lang.String r1 = r1.getString(r3)
        L91:
            r0.append(r1)
            java.lang.String r1 = "; checkable: "
            r0.append(r1)
            boolean r1 = r2.isCheckable()
            r0.append(r1)
            java.lang.String r1 = "; checked: "
            r0.append(r1)
            boolean r1 = r2.isChecked()
            r0.append(r1)
            java.lang.String r1 = "; focusable: "
            r0.append(r1)
            boolean r1 = r2.isFocusable()
            r0.append(r1)
            java.lang.String r1 = "; focused: "
            r0.append(r1)
            boolean r1 = r2.isFocused()
            r0.append(r1)
            java.lang.String r1 = "; selected: "
            r0.append(r1)
            boolean r1 = r2.isSelected()
            r0.append(r1)
            java.lang.String r1 = "; clickable: "
            r0.append(r1)
            boolean r1 = r2.isClickable()
            r0.append(r1)
            java.lang.String r1 = "; longClickable: "
            r0.append(r1)
            boolean r1 = r2.isLongClickable()
            r0.append(r1)
            java.lang.String r1 = "; enabled: "
            r0.append(r1)
            boolean r1 = r2.isEnabled()
            r0.append(r1)
            java.lang.String r1 = "; password: "
            r0.append(r1)
            boolean r1 = r2.isPassword()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "; scrollable: "
            r1.<init>(r3)
            boolean r3 = r2.isScrollable()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "; ["
            r0.append(r1)
            java.util.List r1 = r2.getActionList()
            r2 = 0
            if (r1 == 0) goto L140
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r1.size()
            r5 = r2
        L12b:
            if (r5 >= r4) goto L142
            java.lang.Object r7 = r1.get(r5)
            h0 r6 = new h0
            r10 = 0
            r11 = 0
            r8 = 0
            r9 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            r3.add(r6)
            int r5 = r5 + 1
            goto L12b
        L140:
            java.util.List r3 = java.util.Collections.EMPTY_LIST
        L142:
            int r1 = r3.size()
            if (r2 >= r1) goto L220
            java.lang.Object r1 = r3.get(r2)
            h0 r1 = (defpackage.h0) r1
            int r4 = r1.a()
            java.lang.Object r1 = r1.a
            java.lang.String r5 = "ACTION_UNKNOWN"
            r6 = 1
            if (r4 == r6) goto L1f2
            r7 = 2
            if (r4 == r7) goto L1ef
            switch(r4) {
                case 4: goto L1ec;
                case 8: goto L1e9;
                case 16: goto L1e6;
                case 32: goto L1e3;
                case 64: goto L1e0;
                case 128: goto L1dd;
                case 256: goto L1da;
                case 512: goto L1d7;
                case 1024: goto L1d4;
                case 2048: goto L1d1;
                case 4096: goto L1ce;
                case 8192: goto L1cb;
                case 16384: goto L1c8;
                case 32768: goto L1c5;
                case 65536: goto L1c2;
                case 131072: goto L1bf;
                case 262144: goto L1bc;
                case 524288: goto L1b9;
                case 2097152: goto L1b6;
                case 16908354: goto L1b3;
                default: goto L15f;
            }
        L15f:
            switch(r4) {
                case 16908342: goto L1b0;
                case 16908343: goto L1ad;
                case 16908344: goto L1aa;
                case 16908345: goto L1a7;
                case 16908346: goto L1a3;
                case 16908347: goto L19f;
                case 16908348: goto L19b;
                case 16908349: goto L197;
                default: goto L162;
            }
        L162:
            switch(r4) {
                case 16908356: goto L193;
                case 16908357: goto L18f;
                case 16908358: goto L18b;
                case 16908359: goto L187;
                case 16908360: goto L183;
                case 16908361: goto L17f;
                case 16908362: goto L17b;
                default: goto L165;
            }
        L165:
            switch(r4) {
                case 16908372: goto L177;
                case 16908373: goto L173;
                case 16908374: goto L16f;
                case 16908375: goto L16b;
                default: goto L168;
            }
        L168:
            r4 = r5
            goto L1f4
        L16b:
            java.lang.String r4 = "ACTION_DRAG_CANCEL"
            goto L1f4
        L16f:
            java.lang.String r4 = "ACTION_DRAG_DROP"
            goto L1f4
        L173:
            java.lang.String r4 = "ACTION_DRAG_START"
            goto L1f4
        L177:
            java.lang.String r4 = "ACTION_IME_ENTER"
            goto L1f4
        L17b:
            java.lang.String r4 = "ACTION_PRESS_AND_HOLD"
            goto L1f4
        L17f:
            java.lang.String r4 = "ACTION_PAGE_RIGHT"
            goto L1f4
        L183:
            java.lang.String r4 = "ACTION_PAGE_LEFT"
            goto L1f4
        L187:
            java.lang.String r4 = "ACTION_PAGE_DOWN"
            goto L1f4
        L18b:
            java.lang.String r4 = "ACTION_PAGE_UP"
            goto L1f4
        L18f:
            java.lang.String r4 = "ACTION_HIDE_TOOLTIP"
            goto L1f4
        L193:
            java.lang.String r4 = "ACTION_SHOW_TOOLTIP"
            goto L1f4
        L197:
            java.lang.String r4 = "ACTION_SET_PROGRESS"
            goto L1f4
        L19b:
            java.lang.String r4 = "ACTION_CONTEXT_CLICK"
            goto L1f4
        L19f:
            java.lang.String r4 = "ACTION_SCROLL_RIGHT"
            goto L1f4
        L1a3:
            java.lang.String r4 = "ACTION_SCROLL_DOWN"
            goto L1f4
        L1a7:
            java.lang.String r4 = "ACTION_SCROLL_LEFT"
            goto L1f4
        L1aa:
            java.lang.String r4 = "ACTION_SCROLL_UP"
            goto L1f4
        L1ad:
            java.lang.String r4 = "ACTION_SCROLL_TO_POSITION"
            goto L1f4
        L1b0:
            java.lang.String r4 = "ACTION_SHOW_ON_SCREEN"
            goto L1f4
        L1b3:
            java.lang.String r4 = "ACTION_MOVE_WINDOW"
            goto L1f4
        L1b6:
            java.lang.String r4 = "ACTION_SET_TEXT"
            goto L1f4
        L1b9:
            java.lang.String r4 = "ACTION_COLLAPSE"
            goto L1f4
        L1bc:
            java.lang.String r4 = "ACTION_EXPAND"
            goto L1f4
        L1bf:
            java.lang.String r4 = "ACTION_SET_SELECTION"
            goto L1f4
        L1c2:
            java.lang.String r4 = "ACTION_CUT"
            goto L1f4
        L1c5:
            java.lang.String r4 = "ACTION_PASTE"
            goto L1f4
        L1c8:
            java.lang.String r4 = "ACTION_COPY"
            goto L1f4
        L1cb:
            java.lang.String r4 = "ACTION_SCROLL_BACKWARD"
            goto L1f4
        L1ce:
            java.lang.String r4 = "ACTION_SCROLL_FORWARD"
            goto L1f4
        L1d1:
            java.lang.String r4 = "ACTION_PREVIOUS_HTML_ELEMENT"
            goto L1f4
        L1d4:
            java.lang.String r4 = "ACTION_NEXT_HTML_ELEMENT"
            goto L1f4
        L1d7:
            java.lang.String r4 = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY"
            goto L1f4
        L1da:
            java.lang.String r4 = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY"
            goto L1f4
        L1dd:
            java.lang.String r4 = "ACTION_CLEAR_ACCESSIBILITY_FOCUS"
            goto L1f4
        L1e0:
            java.lang.String r4 = "ACTION_ACCESSIBILITY_FOCUS"
            goto L1f4
        L1e3:
            java.lang.String r4 = "ACTION_LONG_CLICK"
            goto L1f4
        L1e6:
            java.lang.String r4 = "ACTION_CLICK"
            goto L1f4
        L1e9:
            java.lang.String r4 = "ACTION_CLEAR_SELECTION"
            goto L1f4
        L1ec:
            java.lang.String r4 = "ACTION_SELECT"
            goto L1f4
        L1ef:
            java.lang.String r4 = "ACTION_CLEAR_FOCUS"
            goto L1f4
        L1f2:
            java.lang.String r4 = "ACTION_FOCUS"
        L1f4:
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L20d
            r5 = r1
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r5 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r5
            java.lang.CharSequence r5 = r5.getLabel()
            if (r5 == 0) goto L20d
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r1 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r1
            java.lang.CharSequence r1 = r1.getLabel()
            java.lang.String r4 = r1.toString()
        L20d:
            r0.append(r4)
            int r1 = r3.size()
            int r1 = r1 - r6
            if (r2 == r1) goto L21c
            java.lang.String r1 = ", "
            r0.append(r1)
        L21c:
            int r2 = r2 + 1
            goto L142
        L220:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

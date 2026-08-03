package Yue;

import Yue.C3605;
import Yue.C6989;
import Yue.InterfaceC3070;
import Yue.InterfaceC7144;
import android.R;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3055 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f4428 = "AccessibilityNodeInfo.roleDescription";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String f4429 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f4430 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String f4431 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f4432 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final String f4433 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final String f4434 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final String f4435 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final String f4436 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final String f4437 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final String f4438 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final String f4439 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY";

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final String f4440 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY";

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final String f4441 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY";

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final String f4442 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY";

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f4443 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f4444 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f4445 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f4446 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f4447 = 32;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f4448 = 64;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f4449 = 8388608;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f4450 = 67108864;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f4451 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f4452 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final int f4453 = 4;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int f4454 = 8;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f4455 = 16;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f4456 = 32;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f4457 = 64;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int f4458 = 128;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int f4459 = 256;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final int f4460 = 512;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final int f4461 = 1024;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final int f4462 = 2048;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final int f4463 = 4096;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final int f4464 = 8192;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final int f4465 = 16384;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final int f4466 = 32768;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final int f4467 = 65536;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final int f4468 = 131072;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final int f4469 = 262144;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final int f4470 = 524288;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final int f4471 = 1048576;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final int f4472 = 2097152;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final String f4473 = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final String f4474 = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final String f4475 = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final String f4476 = "ACTION_ARGUMENT_SELECTION_START_INT";

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final String f4477 = "ACTION_ARGUMENT_SELECTION_END_INT";

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final String f4478 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final String f4479 = "android.view.accessibility.action.ARGUMENT_ROW_INT";

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final String f4480 = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final String f4481 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final String f4482 = "ACTION_ARGUMENT_MOVE_WINDOW_X";

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final String f4483 = "ACTION_ARGUMENT_MOVE_WINDOW_Y";

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f4484 = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final String f4485 = "androidx.core.view.accessibility.action.ARGUMENT_DIRECTION_INT";

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static final String f4486 = "androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT";

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final int f4487 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final int f4488 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static final int f4489 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static final int f4490 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static final int f4491 = 4;

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static final int f4492 = 8;

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static final int f4493 = 16;

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static final String f4494 = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY";

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static final String f4495 = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX";

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static final String f4496 = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH";

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static final int f4497 = 20000;

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static final int f4498 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static final int f4499 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static final int f4500 = 4;

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public static final int f4501 = 8;

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static final int f4502 = 16;

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static final int f4503 = 32;

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    @SuppressLint({"MinMaxConstant"})
    public static final int f4504 = 50;

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static int f4505;

    /* JADX INFO: renamed from: ۥ */
    public final AccessibilityNodeInfo f44;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public int f45 = -1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f4506 = -1;

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۥۧ$ۥ */
    public static class C0034 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final String f4507 = "A11yActionCompat";

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final C0034 f4508 = new C0034(1, null);

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final C0034 f4509 = new C0034(2, null);

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final C0034 f4510 = new C0034(4, null);

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final C0034 f4511 = new C0034(8, null);

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final C0034 f4512 = new C0034(16, null);

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static final C0034 f4513 = new C0034(32, null);

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static final C0034 f4514 = new C0034(64, null);

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static final C0034 f4515 = new C0034(128, null);

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static final C0034 f4516 = new C0034(256, (CharSequence) null, (Class<? extends InterfaceC3070.AbstractC0039>) InterfaceC3070.C0040.class);

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static final C0034 f4517 = new C0034(512, (CharSequence) null, (Class<? extends InterfaceC3070.AbstractC0039>) InterfaceC3070.C0040.class);

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static final C0034 f4518 = new C0034(1024, (CharSequence) null, (Class<? extends InterfaceC3070.AbstractC0039>) InterfaceC3070.C3071.class);

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static final C0034 f4519 = new C0034(2048, (CharSequence) null, (Class<? extends InterfaceC3070.AbstractC0039>) InterfaceC3070.C3071.class);

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static final C0034 f4520 = new C0034(4096, null);

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static final C0034 f4521 = new C0034(8192, null);

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C0034 f4522 = new C0034(16384, null);

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static final C0034 f4523 = new C0034(32768, null);

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static final C0034 f4524 = new C0034(65536, null);

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static final C0034 f4525 = new C0034(131072, (CharSequence) null, (Class<? extends InterfaceC3070.AbstractC0039>) InterfaceC3070.C3075.class);

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static final C0034 f4526 = new C0034(262144, null);

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static final C0034 f4527 = new C0034(524288, null);

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static final C0034 f4528 = new C0034(1048576, null);

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static final C0034 f4529 = new C0034(2097152, (CharSequence) null, (Class<? extends InterfaceC3070.AbstractC0039>) InterfaceC3070.C3076.class);

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static final C0034 f4530;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public static final C0034 f4531;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public static final C0034 f4532;

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public static final C0034 f4533;

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public static final C0034 f4534;

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public static final C0034 f4535;

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        @InterfaceC6391
        public static final C0034 f4536;

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        @InterfaceC6391
        public static final C0034 f4537;

        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        @InterfaceC6391
        public static final C0034 f4538;

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        @InterfaceC6391
        public static final C0034 f4539;

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public static final C0034 f4540;

        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public static final C0034 f4541;

        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public static final C0034 f4542;

        /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
        public static final C0034 f4543;

        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        public static final C0034 f4544;

        /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
        @InterfaceC6391
        public static final C0034 f4545;

        /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
        @InterfaceC6391
        public static final C0034 f4546;

        /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
        @InterfaceC6391
        public static final C0034 f4547;

        /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
        @InterfaceC6391
        public static final C0034 f4548;

        /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
        @InterfaceC6391
        public static final C0034 f4549;

        /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
        @InterfaceC6391
        public static final C0034 f4550;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        @InterfaceC6391
        @InterfaceC6578(markerClass = {C3605.InterfaceC0195.class})
        public static final C0034 f4551;

        /* JADX INFO: renamed from: ۥ */
        public final Object f46;

        /* JADX INFO: renamed from: ۥ۟ */
        public final int f47;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Class<? extends InterfaceC3070.AbstractC0039> f4552;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        public final InterfaceC3070 f4553;

        static {
            int i = Build.VERSION.SDK_INT;
            f4530 = new C0034(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f4531 = new C0034(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, InterfaceC3070.C3073.class);
            f4532 = new C0034(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f4533 = new C0034(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f4534 = new C0034(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f4535 = new C0034(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            f4536 = new C0034(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f4537 = new C0034(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f4538 = new C0034(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f4539 = new C0034(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f4540 = new C0034(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f4541 = new C0034(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, InterfaceC3070.C3074.class);
            f4542 = new C0034(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, InterfaceC3070.C3072.class);
            f4543 = new C0034(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f4544 = new C0034(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f4545 = new C0034(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f4546 = new C0034(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            f4547 = new C0034(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            f4548 = new C0034(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            f4549 = new C0034(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            f4550 = new C0034(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f4551 = new C0034(i >= 34 ? C3058.m127() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0034(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        public boolean equals(@InterfaceC6490 Object obj) {
            if (obj == null || !(obj instanceof C0034)) {
                return false;
            }
            C0034 c0034 = (C0034) obj;
            Object obj2 = this.f46;
            return obj2 == null ? c0034.f46 == null : obj2.equals(c0034.f46);
        }

        public int hashCode() {
            Object obj = this.f46;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        @InterfaceC6391
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String strM5944 = C3055.m5944(this.f47);
            if (strM5944.equals("ACTION_UNKNOWN") && m6117() != null) {
                strM5944 = m6117().toString();
            }
            sb.append(strM5944);
            return sb.toString();
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ */
        public C0034 m120(CharSequence charSequence, InterfaceC3070 interfaceC3070) {
            return new C0034(null, this.f47, charSequence, interfaceC3070, this.f4552);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public int m121() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f46).getId();
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public CharSequence m6117() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f46).getLabel();
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean m6118(View view, Bundle bundle) {
            InterfaceC3070.AbstractC0039 abstractC0039NewInstance;
            if (this.f4553 == null) {
                return false;
            }
            Class<? extends InterfaceC3070.AbstractC0039> cls = this.f4552;
            InterfaceC3070.AbstractC0039 abstractC0039 = null;
            if (cls != null) {
                try {
                    abstractC0039NewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                } catch (Exception e) {
                    e = e;
                }
                try {
                    abstractC0039NewInstance.m149(bundle);
                    abstractC0039 = abstractC0039NewInstance;
                } catch (Exception e2) {
                    e = e2;
                    abstractC0039 = abstractC0039NewInstance;
                    Class<? extends InterfaceC3070.AbstractC0039> cls2 = this.f4552;
                    Log.e(f4507, "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                }
            }
            return this.f4553.perform(view, abstractC0039);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        public C0034(int i, CharSequence charSequence, InterfaceC3070 interfaceC3070) {
            this(null, i, charSequence, interfaceC3070, null);
        }

        public C0034(Object obj) {
            this(obj, 0, null, null, null);
        }

        public C0034(int i, CharSequence charSequence, Class<? extends InterfaceC3070.AbstractC0039> cls) {
            this(null, i, charSequence, null, cls);
        }

        public C0034(Object obj, int i, CharSequence charSequence, InterfaceC3070 interfaceC3070, Class<? extends InterfaceC3070.AbstractC0039> cls) {
            this.f47 = i;
            this.f4553 = interfaceC3070;
            if (obj == null) {
                this.f46 = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            } else {
                this.f46 = obj;
            }
            this.f4552 = cls;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۥۧ$ۥ۟ */
    @InterfaceC7113(21)
    public static class C0035 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static C3060 m122(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new C3060(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۥۧ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(30)
    public static class C3056 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Object m123(int i, float f, float f2, float f3) {
            return new AccessibilityNodeInfo.RangeInfo(i, f, f2, f3);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static CharSequence m124(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m6119(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۥۧ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(33)
    public static class C3057 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static C3060 m125(boolean z, int i, int i2, int i3, int i4, boolean z2, String str, String str2) {
            return new C3060(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(z2).setRowTitle(str).setColumnTitle(str2).build());
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static C3055 m126(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
            return C3055.m5951(accessibilityNodeInfo.getChild(i, i2));
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static String m6120(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static String m6121(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static AccessibilityNodeInfo.ExtraRenderingInfo m6122(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static C3055 m6123(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
            return C3055.m5951(accessibilityNodeInfo.getParent(i));
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static String m6124(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static boolean m6125(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static void m6126(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setTextSelectable(z);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static void m6127(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۥۧ$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(34)
    public static class C3058 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static AccessibilityNodeInfo.AccessibilityAction m127() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m128(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static CharSequence m6128(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static long m6129(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static boolean m6130(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static boolean m6131(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static void m6132(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static void m6133(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static void m6134(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static void m6135(AccessibilityNodeInfo accessibilityNodeInfo, long j) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j));
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static void m6136(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static void m6137(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۥۧ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static class C3059 {

        /* JADX INFO: renamed from: ۥ۟ */
        public static final int f48 = 0;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final int f4554 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final int f4555 = 2;

        /* JADX INFO: renamed from: ۥ */
        public final Object f49;

        public C3059(Object obj) {
            this.f49 = obj;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static C3059 m6138(int i, int i2, boolean z) {
            return new C3059(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static C3059 m6139(int i, int i2, boolean z, int i3) {
            return new C3059(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }

        /* JADX INFO: renamed from: ۥ */
        public int m129() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f49).getColumnCount();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public int m130() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f49).getRowCount();
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int m6140() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f49).getSelectionMode();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean m6141() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f49).isHierarchical();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۥۧ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C3060 {

        /* JADX INFO: renamed from: ۥ */
        public final Object f50;

        /* JADX INFO: renamed from: Yue.ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ */
        public static final class C0036 {

            /* JADX INFO: renamed from: ۥ */
            public boolean f51;

            /* JADX INFO: renamed from: ۥ۟ */
            public int f52;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public int f4556;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public int f4557;

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public int f4558;

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public boolean f4559;

            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public String f4560;

            /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
            public String f4561;

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ */
            public C3060 m133() {
                return Build.VERSION.SDK_INT >= 33 ? C3057.m125(this.f51, this.f52, this.f4556, this.f4557, this.f4558, this.f4559, this.f4560, this.f4561) : C0035.m122(this.f4556, this.f4558, this.f52, this.f4557, this.f51, this.f4559);
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟ */
            public C0036 m134(int i) {
                this.f52 = i;
                return this;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public C0036 m6150(int i) {
                this.f4557 = i;
                return this;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public C0036 m6151(@InterfaceC6490 String str) {
                this.f4561 = str;
                return this;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public C0036 m6152(boolean z) {
                this.f51 = z;
                return this;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public C0036 m6153(int i) {
                this.f4556 = i;
                return this;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public C0036 m6154(int i) {
                this.f4558 = i;
                return this;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
            public C0036 m6155(@InterfaceC6490 String str) {
                this.f4560 = str;
                return this;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
            public C0036 m6156(boolean z) {
                this.f4559 = z;
                return this;
            }
        }

        public C3060(Object obj) {
            this.f50 = obj;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static C3060 m6142(int i, int i2, int i3, int i4, boolean z) {
            return new C3060(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static C3060 m6143(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new C3060(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }

        /* JADX INFO: renamed from: ۥ */
        public int m131() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f50).getColumnIndex();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public int m132() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f50).getColumnSpan();
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public String m6144() {
            if (Build.VERSION.SDK_INT >= 33) {
                return C3057.m6120(this.f50);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m6145() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f50).getRowIndex();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int m6146() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f50).getRowSpan();
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public String m6147() {
            if (Build.VERSION.SDK_INT >= 33) {
                return C3057.m6121(this.f50);
            }
            return null;
        }

        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean m6148() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f50).isHeading();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public boolean m6149() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f50).isSelected();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public C3055(Object obj) {
        this.f44 = (AccessibilityNodeInfo) obj;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static String m5944(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static ClickableSpan[] m5945(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static C3055 m5946() {
        return m5950(AccessibilityNodeInfo.obtain());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static C3055 m5947(C3055 c3055) {
        return m5950(AccessibilityNodeInfo.obtain(c3055.f44));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static C3055 m5948(View view) {
        return m5950(AccessibilityNodeInfo.obtain(view));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static C3055 m5949(View view, int i) {
        return m5951(AccessibilityNodeInfo.obtain(view, i));
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤۢ, reason: contains not printable characters */
    public static C3055 m5950(@InterfaceC6391 AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C3055(accessibilityNodeInfo);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public static C3055 m5951(Object obj) {
        if (obj != null) {
            return new C3055(obj);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3055)) {
            return false;
        }
        C3055 c3055 = (C3055) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f44;
        if (accessibilityNodeInfo == null) {
            if (c3055.f44 != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c3055.f44)) {
            return false;
        }
        return this.f4506 == c3055.f4506 && this.f45 == c3055.f45;
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f44;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    @InterfaceC6391
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m5967(rect);
        sb.append("; boundsInParent: " + rect);
        m5968(rect);
        sb.append("; boundsInScreen: " + rect);
        m5969(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(m5992());
        sb.append("; className: ");
        sb.append(m5973());
        sb.append("; text: ");
        sb.append(m6000());
        sb.append("; error: ");
        sb.append(m5979());
        sb.append("; maxTextLength: ");
        sb.append(m5988());
        sb.append("; stateDescription: ");
        sb.append(m5999());
        sb.append("; contentDescription: ");
        sb.append(m5977());
        sb.append("; tooltipText: ");
        sb.append(m6003());
        sb.append("; viewIdResName: ");
        sb.append(m6008());
        sb.append("; uniqueId: ");
        sb.append(m6007());
        sb.append("; checkable: ");
        sb.append(m6016());
        sb.append("; checked: ");
        sb.append(m6017());
        sb.append("; focusable: ");
        sb.append(m6024());
        sb.append("; focused: ");
        sb.append(m6025());
        sb.append("; selected: ");
        sb.append(m6034());
        sb.append("; clickable: ");
        sb.append(m6018());
        sb.append("; longClickable: ");
        sb.append(m6029());
        sb.append("; contextClickable: ");
        sb.append(m6020());
        sb.append("; enabled: ");
        sb.append(m6023());
        sb.append("; password: ");
        sb.append(m6031());
        sb.append("; scrollable: " + m6033());
        sb.append("; containerTitle: ");
        sb.append(m5976());
        sb.append("; granularScrollingSupported: ");
        sb.append(m6026());
        sb.append("; importantForAccessibility: ");
        sb.append(m6028());
        sb.append("; visible: ");
        sb.append(m6038());
        sb.append("; isTextSelectable: ");
        sb.append(m6037());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(m6014());
        sb.append("; [");
        List<C0034> listM5963 = m5963();
        for (int i = 0; i < listM5963.size(); i++) {
            C0034 c0034 = listM5963.get(i);
            String strM5944 = m5944(c0034.m121());
            if (strM5944.equals("ACTION_UNKNOWN") && c0034.m6117() != null) {
                strM5944 = c0034.m6117().toString();
            }
            sb.append(strM5944);
            if (i != listM5963.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥ */
    public void m118(int i) {
        this.f44.addAction(i);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m119(C0034 c0034) {
        this.f44.addAction((AccessibilityNodeInfo.AccessibilityAction) c0034.f46);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m5952(View view) {
        this.f44.addChild(view);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m5953(View view, int i) {
        this.f44.addChild(view, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m5954(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m5958(f4434).add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m5958(f4435).add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m5958(f4436).add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m5958(f4433).add(Integer.valueOf(i));
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m5955(CharSequence charSequence, View view) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m5956() {
        return this.f44.canOpenPopup();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m5957() {
        this.f44.getExtras().remove(f4434);
        this.f44.getExtras().remove(f4435);
        this.f44.getExtras().remove(f4436);
        this.f44.getExtras().remove(f4433);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final List<Integer> m5958(String str) {
        ArrayList<Integer> integerArrayList = this.f44.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f44.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public List<C3055> m5959(String str) {
        ArrayList arrayList = new ArrayList();
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByText = this.f44.findAccessibilityNodeInfosByText(str);
        int size = listFindAccessibilityNodeInfosByText.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(m5950(listFindAccessibilityNodeInfosByText.get(i)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public List<C3055> m5960(String str) {
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId = this.f44.findAccessibilityNodeInfosByViewId(str);
        ArrayList arrayList = new ArrayList();
        Iterator<AccessibilityNodeInfo> it = listFindAccessibilityNodeInfosByViewId.iterator();
        while (it.hasNext()) {
            arrayList.add(m5950(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public C3055 m5961(int i) {
        return m5951(this.f44.findFocus(i));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public C3055 m5962(int i) {
        return m5951(this.f44.focusSearch(i));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public List<C0034> m5963() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f44.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C0034(actionList.get(i)));
        }
        return arrayList;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int m5964() {
        return this.f44.getActions();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public List<String> m5965() {
        return this.f44.getAvailableExtraData();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final boolean m5966(int i) {
        Bundle bundleM5981 = m5981();
        return bundleM5981 != null && (bundleM5981.getInt(f4432, 0) & i) == i;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m5967(Rect rect) {
        this.f44.getBoundsInParent(rect);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m5968(Rect rect) {
        this.f44.getBoundsInScreen(rect);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m5969(@InterfaceC6391 Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            C3058.m128(this.f44, rect);
            return;
        }
        Rect rect2 = (Rect) this.f44.getExtras().getParcelable(f4441);
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public C3055 m5970(int i) {
        return m5951(this.f44.getChild(i));
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public C3055 m5971(int i, int i2) {
        return Build.VERSION.SDK_INT >= 33 ? C3057.m126(this.f44, i, i2) : m5970(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int m5972() {
        return this.f44.getChildCount();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public CharSequence m5973() {
        return this.f44.getClassName();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public C3059 m5974() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f44.getCollectionInfo();
        if (collectionInfo != null) {
            return new C3059(collectionInfo);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public C3060 m5975() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = this.f44.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            return new C3060(collectionItemInfo);
        }
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public CharSequence m5976() {
        return Build.VERSION.SDK_INT >= 34 ? C3058.m6128(this.f44) : this.f44.getExtras().getCharSequence(f4440);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public CharSequence m5977() {
        return this.f44.getContentDescription();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int m5978() {
        return this.f44.getDrawingOrder();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public CharSequence m5979() {
        return this.f44.getError();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public AccessibilityNodeInfo.ExtraRenderingInfo m5980() {
        if (Build.VERSION.SDK_INT >= 33) {
            return C3057.m6122(this.f44);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public Bundle m5981() {
        return this.f44.getExtras();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public CharSequence m5982() {
        return this.f44.getHintText();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public Object m5983() {
        return this.f44;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public int m5984() {
        return this.f44.getInputType();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public C3055 m5985() {
        return m5951(this.f44.getLabelFor());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public C3055 m5986() {
        return m5951(this.f44.getLabeledBy());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public int m5987() {
        return this.f44.getLiveRegion();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public int m5988() {
        return this.f44.getMaxTextLength();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public long m5989() {
        return Build.VERSION.SDK_INT >= 34 ? C3058.m6129(this.f44) : this.f44.getExtras().getLong(f4442);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public int m5990() {
        return this.f44.getMovementGranularities();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final SparseArray<WeakReference<ClickableSpan>> m5991(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayM5998 = m5998(view);
        if (sparseArrayM5998 != null) {
            return sparseArrayM5998;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C6989.C6992.f21065, sparseArray);
        return sparseArray;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public CharSequence m5992() {
        return this.f44.getPackageName();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public CharSequence m5993() {
        return Build.VERSION.SDK_INT >= 28 ? this.f44.getPaneTitle() : this.f44.getExtras().getCharSequence(f4429);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public C3055 m5994() {
        return m5951(this.f44.getParent());
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public C3055 m5995(int i) {
        return Build.VERSION.SDK_INT >= 33 ? C3057.m6123(this.f44, i) : m5994();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public C3061 m5996() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f44.getRangeInfo();
        if (rangeInfo != null) {
            return new C3061(rangeInfo);
        }
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public CharSequence m5997() {
        return this.f44.getExtras().getCharSequence(f4428);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final SparseArray<WeakReference<ClickableSpan>> m5998(View view) {
        return (SparseArray) view.getTag(C6989.C6992.f21065);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public CharSequence m5999() {
        return Build.VERSION.SDK_INT >= 30 ? C3056.m124(this.f44) : this.f44.getExtras().getCharSequence(f4438);
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public CharSequence m6000() {
        if (!m6012()) {
            return this.f44.getText();
        }
        List<Integer> listM5958 = m5958(f4434);
        List<Integer> listM59582 = m5958(f4435);
        List<Integer> listM59583 = m5958(f4436);
        List<Integer> listM59584 = m5958(f4433);
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f44.getText(), 0, this.f44.getText().length()));
        for (int i = 0; i < listM5958.size(); i++) {
            spannableString.setSpan(new C3023(listM59584.get(i).intValue(), this, m5981().getInt(f4437)), listM5958.get(i).intValue(), listM59582.get(i).intValue(), listM59583.get(i).intValue());
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public int m6001() {
        return this.f44.getTextSelectionEnd();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public int m6002() {
        return this.f44.getTextSelectionStart();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public CharSequence m6003() {
        return Build.VERSION.SDK_INT >= 28 ? this.f44.getTooltipText() : this.f44.getExtras().getCharSequence(f4430);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public C3062 m6004() {
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo;
        if (Build.VERSION.SDK_INT < 29 || (touchDelegateInfo = this.f44.getTouchDelegateInfo()) == null) {
            return null;
        }
        return new C3062(touchDelegateInfo);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public C3055 m6005() {
        return m5951(this.f44.getTraversalAfter());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public C3055 m6006() {
        return m5951(this.f44.getTraversalBefore());
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public String m6007() {
        return Build.VERSION.SDK_INT >= 33 ? C3057.m6124(this.f44) : this.f44.getExtras().getString(f4439);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public String m6008() {
        return this.f44.getViewIdResourceName();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public C3077 m6009() {
        return C3077.m6225(this.f44.getWindow());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public int m6010() {
        return this.f44.getWindowId();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public boolean m6011() {
        return Build.VERSION.SDK_INT >= 34 ? C3058.m6130(this.f44) : m5966(32);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public final boolean m6012() {
        return !m5958(f4434).isEmpty();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public final int m6013(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f4505;
        f4505 = i2 + 1;
        return i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public boolean m6014() {
        return Build.VERSION.SDK_INT >= 34 ? C3058.m6131(this.f44) : m5966(64);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public boolean m6015() {
        return this.f44.isAccessibilityFocused();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public boolean m6016() {
        return this.f44.isCheckable();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public boolean m6017() {
        return this.f44.isChecked();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public boolean m6018() {
        return this.f44.isClickable();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public boolean m6019() {
        return this.f44.isContentInvalid();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public boolean m6020() {
        return this.f44.isContextClickable();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public boolean m6021() {
        return this.f44.isDismissable();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public boolean m6022() {
        return this.f44.isEditable();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public boolean m6023() {
        return this.f44.isEnabled();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public boolean m6024() {
        return this.f44.isFocusable();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public boolean m6025() {
        return this.f44.isFocused();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public boolean m6026() {
        return m5966(67108864);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public boolean m6027() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f44.isHeading();
        }
        if (m5966(2)) {
            return true;
        }
        C3060 c3060M5975 = m5975();
        return c3060M5975 != null && c3060M5975.m6148();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public boolean m6028() {
        return this.f44.isImportantForAccessibility();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public boolean m6029() {
        return this.f44.isLongClickable();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public boolean m6030() {
        return this.f44.isMultiLine();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public boolean m6031() {
        return this.f44.isPassword();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public boolean m6032() {
        return Build.VERSION.SDK_INT >= 28 ? this.f44.isScreenReaderFocusable() : m5966(1);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public boolean m6033() {
        return this.f44.isScrollable();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public boolean m6034() {
        return this.f44.isSelected();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public boolean m6035() {
        return this.f44.isShowingHintText();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public boolean m6036() {
        return Build.VERSION.SDK_INT >= 29 ? this.f44.isTextEntryKey() : m5966(8);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public boolean m6037() {
        return Build.VERSION.SDK_INT >= 33 ? C3057.m6125(this.f44) : m5966(8388608);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public boolean m6038() {
        return this.f44.isVisibleToUser();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public boolean m6039(int i) {
        return this.f44.performAction(i);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public boolean m6040(int i, Bundle bundle) {
        return this.f44.performAction(i, bundle);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public void m6041() {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public boolean m6042() {
        return this.f44.refresh();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public boolean m6043(C0034 c0034) {
        return this.f44.removeAction((AccessibilityNodeInfo.AccessibilityAction) c0034.f46);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public boolean m6044(View view) {
        return this.f44.removeChild(view);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public boolean m6045(View view, int i) {
        return this.f44.removeChild(view, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public final void m6046(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayM5998 = m5998(view);
        if (sparseArrayM5998 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < sparseArrayM5998.size(); i++) {
                if (sparseArrayM5998.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                sparseArrayM5998.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public void m6047(boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            C3058.m6132(this.f44, z);
        } else {
            m6050(64, z);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public void m6048(boolean z) {
        this.f44.setAccessibilityFocused(z);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public void m6049(@InterfaceC6391 List<String> list) {
        this.f44.setAvailableExtraData(list);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public final void m6050(int i, boolean z) {
        Bundle bundleM5981 = m5981();
        if (bundleM5981 != null) {
            int i2 = bundleM5981.getInt(f4432, 0) & (~i);
            if (!z) {
                i = 0;
            }
            bundleM5981.putInt(f4432, i | i2);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public void m6051(Rect rect) {
        this.f44.setBoundsInParent(rect);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public void m6052(Rect rect) {
        this.f44.setBoundsInScreen(rect);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public void m6053(@InterfaceC6391 Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            C3058.m6133(this.f44, rect);
        } else {
            this.f44.getExtras().putParcelable(f4441, rect);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public void m6054(boolean z) {
        this.f44.setCanOpenPopup(z);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public void m6055(boolean z) {
        this.f44.setCheckable(z);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public void m6056(boolean z) {
        this.f44.setChecked(z);
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public void m6057(CharSequence charSequence) {
        this.f44.setClassName(charSequence);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public void m6058(boolean z) {
        this.f44.setClickable(z);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public void m6059(Object obj) {
        this.f44.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((C3059) obj).f49);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public void m6060(Object obj) {
        this.f44.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C3060) obj).f50);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public void m6061(@InterfaceC6490 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 34) {
            C3058.m6134(this.f44, charSequence);
        } else {
            this.f44.getExtras().putCharSequence(f4440, charSequence);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public void m6062(CharSequence charSequence) {
        this.f44.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public void m6063(boolean z) {
        this.f44.setContentInvalid(z);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public void m6064(boolean z) {
        this.f44.setContextClickable(z);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public void m6065(boolean z) {
        this.f44.setDismissable(z);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public void m6066(int i) {
        this.f44.setDrawingOrder(i);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public void m6067(boolean z) {
        this.f44.setEditable(z);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public void m6068(boolean z) {
        this.f44.setEnabled(z);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public void m6069(CharSequence charSequence) {
        this.f44.setError(charSequence);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public void m6070(boolean z) {
        this.f44.setFocusable(z);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public void m6071(boolean z) {
        this.f44.setFocused(z);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public void m6072(boolean z) {
        m6050(67108864, z);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public void m6073(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f44.setHeading(z);
        } else {
            m6050(2, z);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public void m6074(@InterfaceC6490 CharSequence charSequence) {
        this.f44.setHintText(charSequence);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۤ, reason: contains not printable characters */
    public void m6075(boolean z) {
        this.f44.setImportantForAccessibility(z);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۥ, reason: contains not printable characters */
    public void m6076(int i) {
        this.f44.setInputType(i);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۦ, reason: contains not printable characters */
    public void m6077(View view) {
        this.f44.setLabelFor(view);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۧ, reason: contains not printable characters */
    public void m6078(View view, int i) {
        this.f44.setLabelFor(view, i);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۨ, reason: contains not printable characters */
    public void m6079(View view) {
        this.f44.setLabeledBy(view);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ, reason: contains not printable characters */
    public void m6080(View view, int i) {
        this.f44.setLabeledBy(view, i);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ۟, reason: contains not printable characters */
    public void m6081(int i) {
        this.f44.setLiveRegion(i);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ۠, reason: contains not printable characters */
    public void m6082(boolean z) {
        this.f44.setLongClickable(z);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۡ, reason: contains not printable characters */
    public void m6083(int i) {
        this.f44.setMaxTextLength(i);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۢ, reason: contains not printable characters */
    public void m6084(long j) {
        if (Build.VERSION.SDK_INT >= 34) {
            C3058.m6135(this.f44, j);
        } else {
            this.f44.getExtras().putLong(f4442, j);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public void m6085(int i) {
        this.f44.setMovementGranularities(i);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۤ, reason: contains not printable characters */
    public void m6086(boolean z) {
        this.f44.setMultiLine(z);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۥ, reason: contains not printable characters */
    public void m6087(CharSequence charSequence) {
        this.f44.setPackageName(charSequence);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۦ, reason: contains not printable characters */
    public void m6088(@InterfaceC6490 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f44.setPaneTitle(charSequence);
        } else {
            this.f44.getExtras().putCharSequence(f4429, charSequence);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۧ, reason: contains not printable characters */
    public void m6089(View view) {
        this.f45 = -1;
        this.f44.setParent(view);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۨ, reason: contains not printable characters */
    public void m6090(View view, int i) {
        this.f45 = i;
        this.f44.setParent(view, i);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ, reason: contains not printable characters */
    public void m6091(boolean z) {
        this.f44.setPassword(z);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۟, reason: contains not printable characters */
    public void m6092(@InterfaceC6391 View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            C3058.m6136(this.f44, view, z);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۠, reason: contains not printable characters */
    public void m6093(C3061 c3061) {
        this.f44.setRangeInfo((AccessibilityNodeInfo.RangeInfo) c3061.f54);
    }

    @SuppressLint({"GetterSetterNames"})
    /* JADX INFO: renamed from: ۥ۟۠ۢۡ, reason: contains not printable characters */
    public void m6094(boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            C3058.m6137(this.f44, z);
        } else {
            m6050(32, z);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۢ, reason: contains not printable characters */
    public void m6095(@InterfaceC6490 CharSequence charSequence) {
        this.f44.getExtras().putCharSequence(f4428, charSequence);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public void m6096(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f44.setScreenReaderFocusable(z);
        } else {
            m6050(1, z);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۤ, reason: contains not printable characters */
    public void m6097(boolean z) {
        this.f44.setScrollable(z);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۥ, reason: contains not printable characters */
    public void m6098(boolean z) {
        this.f44.setSelected(z);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۦ, reason: contains not printable characters */
    public void m6099(boolean z) {
        this.f44.setShowingHintText(z);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۧ, reason: contains not printable characters */
    public void m6100(View view) {
        this.f4506 = -1;
        this.f44.setSource(view);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۨ, reason: contains not printable characters */
    public void m6101(View view, int i) {
        this.f4506 = i;
        this.f44.setSource(view, i);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public void m6102(@InterfaceC6490 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            C3056.m6119(this.f44, charSequence);
        } else {
            this.f44.getExtras().putCharSequence(f4438, charSequence);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public void m6103(CharSequence charSequence) {
        this.f44.setText(charSequence);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public void m6104(boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f44.setTextEntryKey(z);
        } else {
            m6050(8, z);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public void m6105(boolean z) {
        if (Build.VERSION.SDK_INT >= 33) {
            C3057.m6126(this.f44, z);
        } else {
            m6050(8388608, z);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public void m6106(int i, int i2) {
        this.f44.setTextSelection(i, i2);
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۠, reason: contains not printable characters */
    public void m6107(@InterfaceC6490 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f44.setTooltipText(charSequence);
        } else {
            this.f44.getExtras().putCharSequence(f4430, charSequence);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public void m6108(@InterfaceC6391 C3062 c3062) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f44.setTouchDelegateInfo(c3062.f55);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۥ, reason: contains not printable characters */
    public void m6109(View view) {
        this.f44.setTraversalAfter(view);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۦ, reason: contains not printable characters */
    public void m6110(View view, int i) {
        this.f44.setTraversalAfter(view, i);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۧ, reason: contains not printable characters */
    public void m6111(View view) {
        this.f44.setTraversalBefore(view);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۨ, reason: contains not printable characters */
    public void m6112(View view, int i) {
        this.f44.setTraversalBefore(view, i);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤ, reason: contains not printable characters */
    public void m6113(@InterfaceC6490 String str) {
        if (Build.VERSION.SDK_INT >= 33) {
            C3057.m6127(this.f44, str);
        } else {
            this.f44.getExtras().putString(f4439, str);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤ۟, reason: contains not printable characters */
    public void m6114(String str) {
        this.f44.setViewIdResourceName(str);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤ۠, reason: contains not printable characters */
    public void m6115(boolean z) {
        this.f44.setVisibleToUser(z);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤۡ, reason: contains not printable characters */
    public AccessibilityNodeInfo m6116() {
        return this.f44;
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۥۧ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static class C3061 {

        /* JADX INFO: renamed from: ۥ۟ */
        public static final int f53 = 0;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final int f4562 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final int f4563 = 2;

        /* JADX INFO: renamed from: ۥ */
        public final Object f54;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C3061(Object obj) {
            this.f54 = obj;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static C3061 m6157(int i, float f, float f2, float f3) {
            return new C3061(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
        }

        /* JADX INFO: renamed from: ۥ */
        public float m135() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f54).getCurrent();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public float m136() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f54).getMax();
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public float m6158() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f54).getMin();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m6159() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f54).getType();
        }

        public C3061(int i, float f, float f2, float f3) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f54 = C3056.m123(i, f, f2, f3);
            } else {
                this.f54 = AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۥۧ$ۥۣ۟۟۟, reason: contains not printable characters */
    public static final class C3062 {

        /* JADX INFO: renamed from: ۥ */
        public final AccessibilityNodeInfo.TouchDelegateInfo f55;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C3062(@InterfaceC6391 Map<Region, View> map) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f55 = C3066.m142(map);
            } else {
                this.f55 = null;
            }
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        public Region m137(@InterfaceC5459(from = 0) int i) {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f55.getRegionAt(i);
            }
            return null;
        }

        @InterfaceC5459(from = 0)
        /* JADX INFO: renamed from: ۥ۟ */
        public int m138() {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f55.getRegionCount();
            }
            return 0;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C3055 m6160(@InterfaceC6391 Region region) {
            AccessibilityNodeInfo targetForRegion;
            if (Build.VERSION.SDK_INT < 29 || (targetForRegion = this.f55.getTargetForRegion(region)) == null) {
                return null;
            }
            return C3055.m5950(targetForRegion);
        }

        public C3062(@InterfaceC6391 AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo) {
            this.f55 = touchDelegateInfo;
        }
    }

    public C3055(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f44 = accessibilityNodeInfo;
    }
}

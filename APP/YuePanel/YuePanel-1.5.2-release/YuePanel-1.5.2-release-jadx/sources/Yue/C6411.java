package Yue;

import Yue.C6659;
import Yue.C6989;
import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: Yue.ۥۡۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6411 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f2058 = "NotifCompat";

    /* JADX INFO: renamed from: ۥ۟ */
    @SuppressLint({"ActionValue"})
    public static final String f2059 = "android.intent.category.NOTIFICATION_PREFERENCES";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16192 = "android.intent.extra.CHANNEL_ID";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16193 = "android.intent.extra.CHANNEL_GROUP_ID";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16194 = "android.intent.extra.NOTIFICATION_TAG";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16195 = "android.intent.extra.NOTIFICATION_ID";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f16196 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f16197 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f16198 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f16199 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f16200 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f16201 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f16202 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f16203 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f16204 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f16205 = 16;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f16206 = 32;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f16207 = 64;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    @Deprecated
    public static final int f16208 = 128;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f16209 = 256;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f16210 = 512;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f16211 = 4096;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f16212 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f16213 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f16214 = -2;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f16215 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f16216 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16217 = "android.title";

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16218 = "android.title.big";

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16219 = "android.text";

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16220 = "android.subText";

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16221 = "android.remoteInputHistory";

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16222 = "android.infoText";

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16223 = "android.summaryText";

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16224 = "android.bigText";

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16225 = "android.icon";

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16226 = "android.largeIcon";

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16227 = "android.largeIcon.big";

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16228 = "android.progress";

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16229 = "android.progressMax";

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16230 = "android.progressIndeterminate";

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16231 = "android.showChronometer";

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16232 = "android.chronometerCountDown";

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16233 = "android.colorized";

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16234 = "android.showWhen";

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16235 = "android.picture";

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16236 = "android.pictureIcon";

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16237 = "android.pictureContentDescription";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16238 = "android.showBigPictureWhenCollapsed";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16239 = "android.textLines";

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16240 = "android.template";

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final String f16241 = "androidx.core.app.extra.COMPAT_TEMPLATE";

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    @Deprecated
    public static final String f16242 = "android.people";

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16243 = "android.people.list";

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16244 = "android.backgroundImageUri";

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16245 = "android.mediaSession";

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16246 = "android.compactActions";

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16247 = "android.selfDisplayName";

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16248 = "android.messagingStyleUser";

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16249 = "android.conversationTitle";

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16250 = "android.messages";

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16251 = "android.messages.historic";

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16252 = "android.isGroupConversation";

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16253 = "android.callType";

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16254 = "android.callIsVideo";

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16255 = "android.callPerson";

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16256 = "android.callPersonCompat";

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16257 = "android.verificationIcon";

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16258 = "android.verificationIconCompat";

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16259 = "android.verificationText";

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16260 = "android.answerIntent";

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16261 = "android.declineIntent";

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16262 = "android.hangUpIntent";

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16263 = "android.answerColor";

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16264 = "android.declineColor";

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16265 = "android.hiddenConversationTitle";

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f16266 = "android.audioContents";

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    @InterfaceC3897
    public static final int f16267 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public static final int f16268 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static final int f16269 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static final int f16270 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static final int f16271 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static final String f16272 = "call";

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static final String f16273 = "navigation";

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public static final String f16274 = "msg";

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public static final String f16275 = "email";

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static final String f16276 = "event";

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static final String f16277 = "promo";

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public static final String f16278 = "alarm";

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static final String f16279 = "progress";

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static final String f16280 = "social";

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static final String f16281 = "err";

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static final String f16282 = "transport";

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static final String f16283 = "sys";

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static final String f16284 = "service";

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static final String f16285 = "reminder";

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final String f16286 = "recommendation";

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static final String f16287 = "status";

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static final String f16288 = "workout";

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static final String f16289 = "location_sharing";

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public static final String f16290 = "stopwatch";

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static final String f16291 = "missed_call";

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public static final int f16292 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public static final int f16293 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public static final int f16294 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public static final int f16295 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public static final int f16296 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final int f16297 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public static final String f16298 = "silent";

    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public static final int f16299 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public static final int f16300 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public static final int f16301 = 2;

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟ */
    public static class C0973 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static final int f16302 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static final int f16303 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static final int f16304 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static final int f16305 = 3;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static final int f16306 = 4;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static final int f16307 = 5;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static final int f16308 = 6;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final int f16309 = 7;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static final int f16310 = 8;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static final int f16311 = 9;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static final int f16312 = 10;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static final String f16313 = "android.support.action.showsUserInterface";

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static final String f16314 = "android.support.action.semanticAction";

        /* JADX INFO: renamed from: ۥ */
        public final Bundle f2060;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6490
        public IconCompat f2061;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C7086[] f16315;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C7086[] f16316;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean f16317;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean f16318;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final int f16319;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final boolean f16320;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        @Deprecated
        public int f16321;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public CharSequence f16322;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        @InterfaceC6490
        public PendingIntent f16323;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public boolean f16324;

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟$ۥ, reason: contains not printable characters */
        public static final class C6412 {

            /* JADX INFO: renamed from: ۥ */
            public final IconCompat f2062;

            /* JADX INFO: renamed from: ۥ۟ */
            public final CharSequence f2063;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final PendingIntent f16325;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public boolean f16326;

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public final Bundle f16327;

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public ArrayList<C7086> f16328;

            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public int f16329;

            /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
            public boolean f16330;

            /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
            public boolean f16331;

            /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
            public boolean f16332;

            /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟$ۥ$ۥ, reason: contains not printable characters */
            @InterfaceC7113(20)
            public static class C6413 {
                private C6413() {
                }

                @InterfaceC4482
                /* JADX INFO: renamed from: ۥ */
                public static Bundle m2869(Notification.Action action) {
                    return action.getExtras();
                }

                @InterfaceC4482
                /* JADX INFO: renamed from: ۥ۟ */
                public static RemoteInput[] m2870(Notification.Action action) {
                    return action.getRemoteInputs();
                }
            }

            /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟$ۥ$ۥ۟, reason: contains not printable characters */
            @InterfaceC7113(23)
            public static class C6414 {
                private C6414() {
                }

                @InterfaceC4482
                /* JADX INFO: renamed from: ۥ */
                public static Icon m2871(Notification.Action action) {
                    return action.getIcon();
                }
            }

            /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟$ۥ$ۥ۟۟, reason: contains not printable characters */
            @InterfaceC7113(24)
            public static class C6415 {
                private C6415() {
                }

                @InterfaceC4482
                /* JADX INFO: renamed from: ۥ */
                public static boolean m2872(Notification.Action action) {
                    return action.getAllowGeneratedReplies();
                }
            }

            /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟$ۥ$ۥ۟۟۟, reason: contains not printable characters */
            @InterfaceC7113(28)
            public static class C6416 {
                private C6416() {
                }

                @InterfaceC4482
                /* JADX INFO: renamed from: ۥ */
                public static int m2873(Notification.Action action) {
                    return action.getSemanticAction();
                }
            }

            /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟$ۥ$ۥ۟۟۟۟, reason: contains not printable characters */
            @InterfaceC7113(29)
            public static class C6417 {
                private C6417() {
                }

                @InterfaceC4482
                /* JADX INFO: renamed from: ۥ */
                public static boolean m2874(Notification.Action action) {
                    return action.isContextual();
                }
            }

            /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟$ۥ$ۥ۟۟۟۠, reason: contains not printable characters */
            @InterfaceC7113(31)
            public static class C6418 {
                private C6418() {
                }

                @InterfaceC4482
                /* JADX INFO: renamed from: ۥ */
                public static boolean m2875(Notification.Action action) {
                    return action.isAuthenticationRequired();
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public C6412(@InterfaceC6490 IconCompat iconCompat, @InterfaceC6490 CharSequence charSequence, @InterfaceC6490 PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            @InterfaceC6391
            @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public static C6412 m20056(@InterfaceC6391 Notification.Action action) {
                C6412 c6412 = C6414.m2871(action) != null ? new C6412(IconCompat.m29543(C6414.m2871(action)), action.title, action.actionIntent) : new C6412(action.icon, action.title, action.actionIntent);
                RemoteInput[] remoteInputArrM2870 = C6413.m2870(action);
                if (remoteInputArrM2870 != null && remoteInputArrM2870.length != 0) {
                    for (RemoteInput remoteInput : remoteInputArrM2870) {
                        c6412.m2868(C7086.m22118(remoteInput));
                    }
                }
                int i = Build.VERSION.SDK_INT;
                c6412.f16326 = C6415.m2872(action);
                if (i >= 28) {
                    c6412.m20064(C6416.m2873(action));
                }
                if (i >= 29) {
                    c6412.m20063(C6417.m2874(action));
                }
                if (i >= 31) {
                    c6412.m20062(C6418.m2875(action));
                }
                c6412.m2867(C6413.m2869(action));
                return c6412;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ */
            public C6412 m2867(@InterfaceC6490 Bundle bundle) {
                if (bundle != null) {
                    this.f16327.putAll(bundle);
                }
                return this;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟ */
            public C6412 m2868(@InterfaceC6490 C7086 c7086) {
                if (this.f16328 == null) {
                    this.f16328 = new ArrayList<>();
                }
                if (c7086 != null) {
                    this.f16328.add(c7086);
                }
                return this;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public C0973 m20057() {
                m20058();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<C7086> arrayList3 = this.f16328;
                if (arrayList3 != null) {
                    for (C7086 c7086 : arrayList3) {
                        if (c7086.m22132()) {
                            arrayList.add(c7086);
                        } else {
                            arrayList2.add(c7086);
                        }
                    }
                }
                return new C0973(this.f2062, this.f2063, this.f16325, this.f16327, arrayList2.isEmpty() ? null : (C7086[]) arrayList2.toArray(new C7086[arrayList2.size()]), arrayList.isEmpty() ? null : (C7086[]) arrayList.toArray(new C7086[arrayList.size()]), this.f16326, this.f16329, this.f16330, this.f16331, this.f16332);
            }

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public final void m20058() {
                if (this.f16331 && this.f16325 == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public C6412 m20059(@InterfaceC6391 InterfaceC6419 interfaceC6419) {
                interfaceC6419.mo2876(this);
                return this;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public Bundle m20060() {
                return this.f16327;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
            public C6412 m20061(boolean z) {
                this.f16326 = z;
                return this;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
            public C6412 m20062(boolean z) {
                this.f16332 = z;
                return this;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
            public C6412 m20063(boolean z) {
                this.f16331 = z;
                return this;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
            public C6412 m20064(int i) {
                this.f16329 = i;
                return this;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
            public C6412 m20065(boolean z) {
                this.f16330 = z;
                return this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public C6412(int i, @InterfaceC6490 CharSequence charSequence, @InterfaceC6490 PendingIntent pendingIntent) {
                this(i != 0 ? IconCompat.m29553(null, "", i) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public C6412(@InterfaceC6391 C0973 c0973) {
                this(c0973.m20049(), c0973.f16322, c0973.f16323, new Bundle(c0973.f2060), c0973.m20050(), c0973.m2866(), c0973.m20051(), c0973.f16318, c0973.m20055(), c0973.m20054());
            }

            public C6412(@InterfaceC6490 IconCompat iconCompat, @InterfaceC6490 CharSequence charSequence, @InterfaceC6490 PendingIntent pendingIntent, @InterfaceC6391 Bundle bundle, @InterfaceC6490 C7086[] c7086Arr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
                this.f16326 = true;
                this.f16330 = true;
                this.f2062 = iconCompat;
                this.f2063 = C6434.m20127(charSequence);
                this.f16325 = pendingIntent;
                this.f16327 = bundle;
                this.f16328 = c7086Arr == null ? null : new ArrayList<>(Arrays.asList(c7086Arr));
                this.f16326 = z;
                this.f16329 = i;
                this.f16330 = z2;
                this.f16331 = z3;
                this.f16332 = z4;
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟$ۥ۟, reason: contains not printable characters */
        public interface InterfaceC6419 {
            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ */
            C6412 mo2876(@InterfaceC6391 C6412 c6412);
        }

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟$ۥ۟۟, reason: contains not printable characters */
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC6420 {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0973(int i, @InterfaceC6490 CharSequence charSequence, @InterfaceC6490 PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m29553(null, "", i) : null, charSequence, pendingIntent);
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        public PendingIntent m2865() {
            return this.f16323;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m2866() {
            return this.f16317;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C7086[] m20046() {
            return this.f16316;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Bundle m20047() {
            return this.f2060;
        }

        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int m20048() {
            return this.f16321;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public IconCompat m20049() {
            int i;
            if (this.f2061 == null && (i = this.f16321) != 0) {
                this.f2061 = IconCompat.m29553(null, "", i);
            }
            return this.f2061;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public C7086[] m20050() {
            return this.f16315;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public int m20051() {
            return this.f16319;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public boolean m20052() {
            return this.f16318;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public CharSequence m20053() {
            return this.f16322;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public boolean m20054() {
            return this.f16324;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public boolean m20055() {
            return this.f16320;
        }

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟$ۥ۟۟۟, reason: contains not printable characters */
        public static final class C6421 implements InterfaceC6419 {

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public static final String f16333 = "android.wearable.EXTENSIONS";

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public static final String f16334 = "flags";

            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public static final String f16335 = "inProgressLabel";

            /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
            public static final String f16336 = "confirmLabel";

            /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
            public static final String f16337 = "cancelLabel";

            /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
            public static final int f16338 = 1;

            /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
            public static final int f16339 = 2;

            /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
            public static final int f16340 = 4;

            /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
            public static final int f16341 = 1;

            /* JADX INFO: renamed from: ۥ */
            public int f2064;

            /* JADX INFO: renamed from: ۥ۟ */
            public CharSequence f2065;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public CharSequence f16342;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public CharSequence f16343;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public C6421() {
                this.f2064 = 1;
            }

            @Override // Yue.C6411.C0973.InterfaceC6419
            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ */
            public C6412 mo2876(@InterfaceC6391 C6412 c6412) {
                Bundle bundle = new Bundle();
                int i = this.f2064;
                if (i != 1) {
                    bundle.putInt("flags", i);
                }
                CharSequence charSequence = this.f2065;
                if (charSequence != null) {
                    bundle.putCharSequence(f16335, charSequence);
                }
                CharSequence charSequence2 = this.f16342;
                if (charSequence2 != null) {
                    bundle.putCharSequence(f16336, charSequence2);
                }
                CharSequence charSequence3 = this.f16343;
                if (charSequence3 != null) {
                    bundle.putCharSequence(f16337, charSequence3);
                }
                c6412.m20060().putBundle("android.wearable.EXTENSIONS", bundle);
                return c6412;
            }

            /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
            public C6421 clone() {
                C6421 c6421 = new C6421();
                c6421.f2064 = this.f2064;
                c6421.f2065 = this.f2065;
                c6421.f16342 = this.f16342;
                c6421.f16343 = this.f16343;
                return c6421;
            }

            @InterfaceC6490
            @Deprecated
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public CharSequence m20066() {
                return this.f16343;
            }

            @InterfaceC6490
            @Deprecated
            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public CharSequence m20067() {
                return this.f16342;
            }

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public boolean m20068() {
                return (this.f2064 & 4) != 0;
            }

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public boolean m20069() {
                return (this.f2064 & 2) != 0;
            }

            @InterfaceC6490
            @Deprecated
            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public CharSequence m20070() {
                return this.f2065;
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
            public boolean m20071() {
                return (this.f2064 & 1) != 0;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
            public C6421 m20072(boolean z) {
                m20075(1, z);
                return this;
            }

            @InterfaceC6391
            @Deprecated
            /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
            public C6421 m20073(@InterfaceC6490 CharSequence charSequence) {
                this.f16343 = charSequence;
                return this;
            }

            @InterfaceC6391
            @Deprecated
            /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
            public C6421 m20074(@InterfaceC6490 CharSequence charSequence) {
                this.f16342 = charSequence;
                return this;
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
            public final void m20075(int i, boolean z) {
                if (z) {
                    this.f2064 = i | this.f2064;
                } else {
                    this.f2064 = (~i) & this.f2064;
                }
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
            public C6421 m20076(boolean z) {
                m20075(4, z);
                return this;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
            public C6421 m20077(boolean z) {
                m20075(2, z);
                return this;
            }

            @InterfaceC6391
            @Deprecated
            /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
            public C6421 m20078(@InterfaceC6490 CharSequence charSequence) {
                this.f2065 = charSequence;
                return this;
            }

            public C6421(@InterfaceC6391 C0973 c0973) {
                this.f2064 = 1;
                Bundle bundle = c0973.m20047().getBundle("android.wearable.EXTENSIONS");
                if (bundle != null) {
                    this.f2064 = bundle.getInt("flags", 1);
                    this.f2065 = bundle.getCharSequence(f16335);
                    this.f16342 = bundle.getCharSequence(f16336);
                    this.f16343 = bundle.getCharSequence(f16337);
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0973(@InterfaceC6490 IconCompat iconCompat, @InterfaceC6490 CharSequence charSequence, @InterfaceC6490 PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (C7086[]) null, (C7086[]) null, true, 0, true, false, false);
        }

        public C0973(int i, @InterfaceC6490 CharSequence charSequence, @InterfaceC6490 PendingIntent pendingIntent, @InterfaceC6490 Bundle bundle, @InterfaceC6490 C7086[] c7086Arr, @InterfaceC6490 C7086[] c7086Arr2, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
            this(i != 0 ? IconCompat.m29553(null, "", i) : null, charSequence, pendingIntent, bundle, c7086Arr, c7086Arr2, z, i2, z2, z3, z4);
        }

        public C0973(@InterfaceC6490 IconCompat iconCompat, @InterfaceC6490 CharSequence charSequence, @InterfaceC6490 PendingIntent pendingIntent, @InterfaceC6490 Bundle bundle, @InterfaceC6490 C7086[] c7086Arr, @InterfaceC6490 C7086[] c7086Arr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f16318 = true;
            this.f2061 = iconCompat;
            if (iconCompat != null && iconCompat.m29561() == 2) {
                this.f16321 = iconCompat.m29559();
            }
            this.f16322 = C6434.m20127(charSequence);
            this.f16323 = pendingIntent;
            this.f2060 = bundle == null ? new Bundle() : bundle;
            this.f16315 = c7086Arr;
            this.f16316 = c7086Arr2;
            this.f16317 = z;
            this.f16319 = i;
            this.f16318 = z2;
            this.f16320 = z3;
            this.f16324 = z4;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(20)
    public static class C6422 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m2878(RemoteInput remoteInput) {
            return remoteInput.getAllowFreeFormInput();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static CharSequence[] m2879(RemoteInput remoteInput) {
            return remoteInput.getChoices();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static Bundle m20079(Notification.Action action) {
            return action.getExtras();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static Bundle m20080(RemoteInput remoteInput) {
            return remoteInput.getExtras();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static String m20081(Notification notification) {
            return notification.getGroup();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static CharSequence m20082(RemoteInput remoteInput) {
            return remoteInput.getLabel();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static RemoteInput[] m20083(Notification.Action action) {
            return action.getRemoteInputs();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static String m20084(RemoteInput remoteInput) {
            return remoteInput.getResultKey();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static String m20085(Notification notification) {
            return notification.getSortKey();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(23)
    public static class C6423 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Icon m2880(Notification.Action action) {
            return action.getIcon();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(24)
    public static class C6424 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m2881(Notification.Action action) {
            return action.getAllowGeneratedReplies();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7113(26)
    public static class C6425 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m2882(Notification notification) {
            return notification.getBadgeIconType();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static String m2883(Notification notification) {
            return notification.getChannelId();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static int m20086(Notification notification) {
            return notification.getGroupAlertBehavior();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static CharSequence m20087(Notification notification) {
            return notification.getSettingsText();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static String m20088(Notification notification) {
            return notification.getShortcutId();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static long m20089(Notification notification) {
            return notification.getTimeoutAfter();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC7113(28)
    public static class C6426 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m2884(Notification.Action action) {
            return action.getSemanticAction();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC7113(29)
    public static class C6427 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m2885(Notification notification) {
            return notification.getAllowSystemGeneratedContextualActions();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static Notification.BubbleMetadata m2886(Notification notification) {
            return notification.getBubbleMetadata();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static int m20090(RemoteInput remoteInput) {
            return remoteInput.getEditChoicesBeforeSending();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static LocusId m20091(Notification notification) {
            return notification.getLocusId();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static boolean m20092(Notification.Action action) {
            return action.isContextual();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(31)
    public static class C6428 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m2887(Notification.Action action) {
            return action.isAuthenticationRequired();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC6429 {
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static class C6430 extends AbstractC6454 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final String f16344 = "androidx.core.app.NotificationCompat$BigPictureStyle";

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public IconCompat f16345;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public IconCompat f16346;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean f16347;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public CharSequence f16348;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public boolean f16349;

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۟ۥ$ۥ */
        @InterfaceC7113(23)
        public static class C0974 {
            private C0974() {
            }

            @InterfaceC7113(23)
            /* JADX INFO: renamed from: ۥ */
            public static void m2889(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۟ۥ$ۥ۟ */
        @InterfaceC7113(31)
        public static class C0975 {
            private C0975() {
            }

            @InterfaceC7113(31)
            /* JADX INFO: renamed from: ۥ */
            public static void m2890(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            @InterfaceC7113(31)
            /* JADX INFO: renamed from: ۥ۟ */
            public static void m2891(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            @InterfaceC7113(31)
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public static void m20106(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C6430() {
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static IconCompat m20093(@InterfaceC6490 Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.m29542((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.m29548((Bitmap) parcelable);
            }
            return null;
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public static IconCompat m20094(@InterfaceC6490 Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable(C6411.f16235);
            return parcelable != null ? m20093(parcelable) : m20093(bundle.getParcelable(C6411.f16236));
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo2888(InterfaceC6404 interfaceC6404) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(interfaceC6404.mo2844()).setBigContentTitle(this.f2081);
            IconCompat iconCompat = this.f16345;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C0975.m2890(bigContentTitle, this.f16345.m29571(interfaceC6404 instanceof C6460 ? ((C6460) interfaceC6404).m20383() : null));
                } else if (iconCompat.m29561() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f16345.m29558());
                }
            }
            if (this.f16347) {
                if (this.f16346 == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    C0974.m2889(bigContentTitle, this.f16346.m29571(interfaceC6404 instanceof C6460 ? ((C6460) interfaceC6404).m20383() : null));
                }
            }
            if (this.f16475) {
                bigContentTitle.setSummaryText(this.f16474);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C0975.m20106(bigContentTitle, this.f16349);
                C0975.m2891(bigContentTitle, this.f16348);
            }
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void mo20095(@InterfaceC6391 Bundle bundle) {
            super.mo20095(bundle);
            bundle.remove(C6411.f16227);
            bundle.remove(C6411.f16235);
            bundle.remove(C6411.f16236);
            bundle.remove(C6411.f16238);
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC6391
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public String mo20096() {
            return f16344;
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public void mo20097(@InterfaceC6391 Bundle bundle) {
            super.mo20097(bundle);
            if (bundle.containsKey(C6411.f16227)) {
                this.f16346 = m20093(bundle.getParcelable(C6411.f16227));
                this.f16347 = true;
            }
            this.f16345 = m20094(bundle);
            this.f16349 = bundle.getBoolean(C6411.f16238);
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public C6430 m20098(@InterfaceC6490 Bitmap bitmap) {
            this.f16346 = bitmap == null ? null : IconCompat.m29548(bitmap);
            this.f16347 = true;
            return this;
        }

        @InterfaceC6391
        @InterfaceC7113(23)
        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public C6430 m20099(@InterfaceC6490 Icon icon) {
            this.f16346 = icon == null ? null : IconCompat.m29542(icon);
            this.f16347 = true;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public C6430 m20100(@InterfaceC6490 Bitmap bitmap) {
            this.f16345 = bitmap == null ? null : IconCompat.m29548(bitmap);
            return this;
        }

        @InterfaceC6391
        @InterfaceC7113(31)
        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public C6430 m20101(@InterfaceC6490 Icon icon) {
            this.f16345 = IconCompat.m29542(icon);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public C6430 m20102(@InterfaceC6490 CharSequence charSequence) {
            this.f2081 = C6434.m20127(charSequence);
            return this;
        }

        @InterfaceC6391
        @InterfaceC7113(31)
        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public C6430 m20103(@InterfaceC6490 CharSequence charSequence) {
            this.f16348 = charSequence;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public C6430 m20104(@InterfaceC6490 CharSequence charSequence) {
            this.f16474 = C6434.m20127(charSequence);
            this.f16475 = true;
            return this;
        }

        @InterfaceC6391
        @InterfaceC7113(31)
        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public C6430 m20105(boolean z) {
            this.f16349 = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C6430(@InterfaceC6490 C6434 c6434) {
            m20321(c6434);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static class C6431 extends AbstractC6454 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final String f16350 = "androidx.core.app.NotificationCompat$BigTextStyle";

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public CharSequence f16351;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C6431() {
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ */
        public void mo2892(@InterfaceC6391 Bundle bundle) {
            super.mo2892(bundle);
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo2888(InterfaceC6404 interfaceC6404) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(interfaceC6404.mo2844()).setBigContentTitle(this.f2081).bigText(this.f16351);
            if (this.f16475) {
                bigTextStyleBigText.setSummaryText(this.f16474);
            }
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo20095(@InterfaceC6391 Bundle bundle) {
            super.mo20095(bundle);
            bundle.remove(C6411.f16224);
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC6391
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥۣ۟۟۠ */
        public String mo20096() {
            return f16350;
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
        public void mo20097(@InterfaceC6391 Bundle bundle) {
            super.mo20097(bundle);
            this.f16351 = bundle.getCharSequence(C6411.f16224);
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public C6431 m20107(@InterfaceC6490 CharSequence charSequence) {
            this.f16351 = C6434.m20127(charSequence);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public C6431 m20108(@InterfaceC6490 CharSequence charSequence) {
            this.f2081 = C6434.m20127(charSequence);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public C6431 m20109(@InterfaceC6490 CharSequence charSequence) {
            this.f16474 = C6434.m20127(charSequence);
            this.f16475 = true;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C6431(@InterfaceC6490 C6434 c6434) {
            m20321(c6434);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final class C6432 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f16352 = 1;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f16353 = 2;

        /* JADX INFO: renamed from: ۥ */
        public PendingIntent f2066;

        /* JADX INFO: renamed from: ۥ۟ */
        public PendingIntent f2067;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public IconCompat f16354;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f16355;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC4398
        public int f16356;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f16357;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public String f16358;

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ */
        @InterfaceC7113(29)
        public static class C0976 {
            private C0976() {
            }

            @InterfaceC6490
            @InterfaceC7113(29)
            /* JADX INFO: renamed from: ۥ */
            public static C6432 m2895(@InterfaceC6490 Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                C6433 c6433M20125 = new C6433(bubbleMetadata.getIntent(), IconCompat.m29542(bubbleMetadata.getIcon())).m2900(bubbleMetadata.getAutoExpandBubble()).m20119(bubbleMetadata.getDeleteIntent()).m20125(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    c6433M20125.m20120(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    c6433M20125.m20121(bubbleMetadata.getDesiredHeightResId());
                }
                return c6433M20125.m2899();
            }

            @InterfaceC6490
            @InterfaceC7113(29)
            /* JADX INFO: renamed from: ۥ۟ */
            public static Notification.BubbleMetadata m2896(@InterfaceC6490 C6432 c6432) {
                if (c6432 == null || c6432.m20115() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(c6432.m20114().m29570()).setIntent(c6432.m20115()).setDeleteIntent(c6432.m20111()).setAutoExpandBubble(c6432.m2894()).setSuppressNotification(c6432.m20117());
                if (c6432.m20112() != 0) {
                    suppressNotification.setDesiredHeight(c6432.m20112());
                }
                if (c6432.m20113() != 0) {
                    suppressNotification.setDesiredHeightResId(c6432.m20113());
                }
                return suppressNotification.build();
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟ */
        @InterfaceC7113(30)
        public static class C0977 {
            private C0977() {
            }

            @InterfaceC6490
            @InterfaceC7113(30)
            /* JADX INFO: renamed from: ۥ */
            public static C6432 m2897(@InterfaceC6490 Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null) {
                    return null;
                }
                C6433 c6433 = bubbleMetadata.getShortcutId() != null ? new C6433(bubbleMetadata.getShortcutId()) : new C6433(bubbleMetadata.getIntent(), IconCompat.m29542(bubbleMetadata.getIcon()));
                c6433.m2900(bubbleMetadata.getAutoExpandBubble()).m20119(bubbleMetadata.getDeleteIntent()).m20125(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    c6433.m20120(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    c6433.m20121(bubbleMetadata.getDesiredHeightResId());
                }
                return c6433.m2899();
            }

            @InterfaceC6490
            @InterfaceC7113(30)
            /* JADX INFO: renamed from: ۥ۟ */
            public static Notification.BubbleMetadata m2898(@InterfaceC6490 C6432 c6432) {
                if (c6432 == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder builder = c6432.m20116() != null ? new Notification.BubbleMetadata.Builder(c6432.m20116()) : new Notification.BubbleMetadata.Builder(c6432.m20115(), c6432.m20114().m29570());
                builder.setDeleteIntent(c6432.m20111()).setAutoExpandBubble(c6432.m2894()).setSuppressNotification(c6432.m20117());
                if (c6432.m20112() != 0) {
                    builder.setDesiredHeight(c6432.m20112());
                }
                if (c6432.m20113() != 0) {
                    builder.setDesiredHeightResId(c6432.m20113());
                }
                return builder.build();
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟, reason: contains not printable characters */
        public static final class C6433 {

            /* JADX INFO: renamed from: ۥ */
            public PendingIntent f2068;

            /* JADX INFO: renamed from: ۥ۟ */
            public IconCompat f2069;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public int f16359;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            @InterfaceC4398
            public int f16360;

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public int f16361;

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public PendingIntent f16362;

            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public String f16363;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Deprecated
            public C6433() {
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ */
            public C6432 m2899() {
                String str = this.f16363;
                if (str == null && this.f2068 == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && this.f2069 == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                C6432 c6432 = new C6432(this.f2068, this.f16362, this.f2069, this.f16359, this.f16360, this.f16361, str);
                c6432.m20118(this.f16361);
                return c6432;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟ */
            public C6433 m2900(boolean z) {
                m20122(1, z);
                return this;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public C6433 m20119(@InterfaceC6490 PendingIntent pendingIntent) {
                this.f16362 = pendingIntent;
                return this;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public C6433 m20120(@InterfaceC4399(unit = 0) int i) {
                this.f16359 = Math.max(i, 0);
                this.f16360 = 0;
                return this;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public C6433 m20121(@InterfaceC4398 int i) {
                this.f16360 = i;
                this.f16359 = 0;
                return this;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public final C6433 m20122(int i, boolean z) {
                if (z) {
                    this.f16361 = i | this.f16361;
                } else {
                    this.f16361 = (~i) & this.f16361;
                }
                return this;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public C6433 m20123(@InterfaceC6391 IconCompat iconCompat) {
                if (this.f16363 != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (iconCompat == null) {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                this.f2069 = iconCompat;
                return this;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
            public C6433 m20124(@InterfaceC6391 PendingIntent pendingIntent) {
                if (this.f16363 != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                this.f2068 = pendingIntent;
                return this;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
            public C6433 m20125(boolean z) {
                m20122(2, z);
                return this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @InterfaceC7113(30)
            public C6433(@InterfaceC6391 String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new NullPointerException("Bubble requires a non-null shortcut id");
                }
                this.f16363 = str;
            }

            public C6433(@InterfaceC6391 PendingIntent pendingIntent, @InterfaceC6391 IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                if (iconCompat != null) {
                    this.f2068 = pendingIntent;
                    this.f2069 = iconCompat;
                    return;
                }
                throw new NullPointerException("Bubbles require non-null icon");
            }
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        public static C6432 m2893(@InterfaceC6490 Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return C0977.m2897(bubbleMetadata);
            }
            if (i == 29) {
                return C0976.m2895(bubbleMetadata);
            }
            return null;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static Notification.BubbleMetadata m20110(@InterfaceC6490 C6432 c6432) {
            if (c6432 == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return C0977.m2898(c6432);
            }
            if (i == 29) {
                return C0976.m2896(c6432);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m2894() {
            return (this.f16357 & 1) != 0;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public PendingIntent m20111() {
            return this.f2067;
        }

        @InterfaceC4399(unit = 0)
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m20112() {
            return this.f16355;
        }

        @InterfaceC4398
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int m20113() {
            return this.f16356;
        }

        @InterfaceC6490
        @SuppressLint({"InvalidNullConversion"})
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public IconCompat m20114() {
            return this.f16354;
        }

        @InterfaceC6490
        @SuppressLint({"InvalidNullConversion"})
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public PendingIntent m20115() {
            return this.f2066;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public String m20116() {
            return this.f16358;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public boolean m20117() {
            return (this.f16357 & 2) != 0;
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m20118(int i) {
            this.f16357 = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C6432(@InterfaceC6490 PendingIntent pendingIntent, @InterfaceC6490 PendingIntent pendingIntent2, @InterfaceC6490 IconCompat iconCompat, int i, @InterfaceC4398 int i2, int i3, @InterfaceC6490 String str) {
            this.f2066 = pendingIntent;
            this.f16354 = iconCompat;
            this.f16355 = i;
            this.f16356 = i2;
            this.f2067 = pendingIntent2;
            this.f16357 = i3;
            this.f16358 = str;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠, reason: contains not printable characters */
    public static class C6436 extends AbstractC6454 {

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static final String f16413 = "androidx.core.app.NotificationCompat$CallStyle";

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static final int f16414 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static final int f16415 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static final int f16416 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static final int f16417 = 3;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final String f16418 = "key_action_priority";

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f16419;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public C6659 f16420;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public PendingIntent f16421;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public PendingIntent f16422;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public PendingIntent f16423;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public boolean f16424;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public Integer f16425;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public Integer f16426;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public IconCompat f16427;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public CharSequence f16428;

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠$ۥ */
        @InterfaceC7113(20)
        public static class C0980 {
            private C0980() {
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ */
            public static Notification.Action.Builder m2909(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟ */
            public static Notification.Action.Builder m2910(Notification.Action.Builder builder, RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public static Notification.Action m20232(Notification.Action.Builder builder) {
                return builder.build();
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public static Notification.Action.Builder m20233(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i, charSequence, pendingIntent);
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠$ۥ۟ */
        @InterfaceC7113(21)
        public static class C0981 {
            private C0981() {
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ */
            public static Notification.Builder m2911(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟ */
            public static Notification.Builder m2912(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠$ۥ۟۟, reason: contains not printable characters */
        @InterfaceC7113(23)
        public static class C6437 {
            private C6437() {
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ */
            public static Parcelable m2913(Icon icon) {
                return icon;
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟ */
            public static Notification.Action.Builder m2914(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public static void m20234(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠$ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC7113(24)
        public static class C6438 {
            private C6438() {
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ */
            public static Notification.Action.Builder m2915(Notification.Action.Builder builder, boolean z) {
                return builder.setAllowGeneratedReplies(z);
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠$ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC7113(28)
        public static class C6439 {
            private C6439() {
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ */
            public static Notification.Builder m2916(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟ */
            public static Parcelable m2917(Person person) {
                return person;
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠$ۥ۟۟۟۠, reason: contains not printable characters */
        @InterfaceC7113(31)
        public static class C6440 {
            private C6440() {
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ */
            public static Notification.CallStyle m2918(@InterfaceC6391 Person person, @InterfaceC6391 PendingIntent pendingIntent, @InterfaceC6391 PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟ */
            public static Notification.CallStyle m2919(@InterfaceC6391 Person person, @InterfaceC6391 PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public static Notification.CallStyle m20235(@InterfaceC6391 Person person, @InterfaceC6391 PendingIntent pendingIntent, @InterfaceC6391 PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public static Notification.CallStyle m20236(Notification.CallStyle callStyle, @InterfaceC3897 int i) {
                return callStyle.setAnswerButtonColorHint(i);
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public static Notification.Action.Builder m20237(Notification.Action.Builder builder, boolean z) {
                return builder.setAuthenticationRequired(z);
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public static Notification.CallStyle m20238(Notification.CallStyle callStyle, @InterfaceC3897 int i) {
                return callStyle.setDeclineButtonColorHint(i);
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public static Notification.CallStyle m20239(Notification.CallStyle callStyle, boolean z) {
                return callStyle.setIsVideo(z);
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
            public static Notification.CallStyle m20240(Notification.CallStyle callStyle, @InterfaceC6490 Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
            public static Notification.CallStyle m20241(Notification.CallStyle callStyle, @InterfaceC6490 CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠$ۥ۟۟۟ۡ, reason: contains not printable characters */
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC6441 {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C6436() {
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static C6436 m20216(@InterfaceC6391 C6659 c6659, @InterfaceC6391 PendingIntent pendingIntent, @InterfaceC6391 PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "declineIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new C6436(1, c6659, null, pendingIntent, pendingIntent2);
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static C6436 m20217(@InterfaceC6391 C6659 c6659, @InterfaceC6391 PendingIntent pendingIntent) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            return new C6436(2, c6659, pendingIntent, null, null);
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public static C6436 m20218(@InterfaceC6391 C6659 c6659, @InterfaceC6391 PendingIntent pendingIntent, @InterfaceC6391 PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new C6436(3, c6659, pendingIntent, null, pendingIntent2);
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ */
        public void mo2892(@InterfaceC6391 Bundle bundle) {
            super.mo2892(bundle);
            bundle.putInt(C6411.f16253, this.f16419);
            bundle.putBoolean(C6411.f16254, this.f16424);
            C6659 c6659 = this.f16420;
            if (c6659 != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable(C6411.f16255, C6439.m2917(c6659.m21286()));
                } else {
                    bundle.putParcelable(C6411.f16256, c6659.m21288());
                }
            }
            IconCompat iconCompat = this.f16427;
            if (iconCompat != null) {
                bundle.putParcelable(C6411.f16257, C6437.m2913(iconCompat.m29571(this.f2080.f2070)));
            }
            bundle.putCharSequence(C6411.f16259, this.f16428);
            bundle.putParcelable(C6411.f16260, this.f16421);
            bundle.putParcelable(C6411.f16261, this.f16422);
            bundle.putParcelable(C6411.f16262, this.f16423);
            Integer num = this.f16425;
            if (num != null) {
                bundle.putInt(C6411.f16263, num.intValue());
            }
            Integer num2 = this.f16426;
            if (num2 != null) {
                bundle.putInt(C6411.f16264, num2.intValue());
            }
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo2888(InterfaceC6404 interfaceC6404) {
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequenceM20221 = null;
            callStyleM2918 = null;
            Notification.CallStyle callStyleM2918 = null;
            charSequenceM20221 = null;
            if (i < 31) {
                Notification.Builder builderMo2844 = interfaceC6404.mo2844();
                C6659 c6659 = this.f16420;
                builderMo2844.setContentTitle(c6659 != null ? c6659.m21281() : null);
                Bundle bundle = this.f2080.f16393;
                if (bundle != null && bundle.containsKey(C6411.f16219)) {
                    charSequenceM20221 = this.f2080.f16393.getCharSequence(C6411.f16219);
                }
                if (charSequenceM20221 == null) {
                    charSequenceM20221 = m20221();
                }
                builderMo2844.setContentText(charSequenceM20221);
                C6659 c66592 = this.f16420;
                if (c66592 != null) {
                    if (c66592.m21279() != null) {
                        C6437.m20234(builderMo2844, this.f16420.m21279().m29571(this.f2080.f2070));
                    }
                    if (i >= 28) {
                        C6439.m2916(builderMo2844, this.f16420.m21286());
                    } else {
                        C0981.m2911(builderMo2844, this.f16420.m21282());
                    }
                }
                C0981.m2912(builderMo2844, C6411.f16272);
                return;
            }
            int i2 = this.f16419;
            if (i2 == 1) {
                callStyleM2918 = C6440.m2918(this.f16420.m21286(), this.f16422, this.f16421);
            } else if (i2 == 2) {
                callStyleM2918 = C6440.m2919(this.f16420.m21286(), this.f16423);
            } else if (i2 == 3) {
                callStyleM2918 = C6440.m20235(this.f16420.m21286(), this.f16423, this.f16421);
            } else if (Log.isLoggable(C6411.f2058, 3)) {
                Log.d(C6411.f2058, "Unrecognized call type in CallStyle: " + String.valueOf(this.f16419));
            }
            if (callStyleM2918 != null) {
                callStyleM2918.setBuilder(interfaceC6404.mo2844());
                Integer num = this.f16425;
                if (num != null) {
                    C6440.m20236(callStyleM2918, num.intValue());
                }
                Integer num2 = this.f16426;
                if (num2 != null) {
                    C6440.m20238(callStyleM2918, num2.intValue());
                }
                C6440.m20241(callStyleM2918, this.f16428);
                IconCompat iconCompat = this.f16427;
                if (iconCompat != null) {
                    C6440.m20240(callStyleM2918, iconCompat.m29571(this.f2080.f2070));
                }
                C6440.m20239(callStyleM2918, this.f16424);
            }
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public boolean mo20219() {
            return true;
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC6391
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥۣ۟۟۠ */
        public String mo20096() {
            return f16413;
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
        public void mo20097(@InterfaceC6391 Bundle bundle) {
            super.mo20097(bundle);
            this.f16419 = bundle.getInt(C6411.f16253);
            this.f16424 = bundle.getBoolean(C6411.f16254);
            if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey(C6411.f16255)) {
                this.f16420 = C6659.m3139(C6410.m2862(bundle.getParcelable(C6411.f16255)));
            } else if (bundle.containsKey(C6411.f16256)) {
                this.f16420 = C6659.m3140(bundle.getBundle(C6411.f16256));
            }
            if (bundle.containsKey(C6411.f16257)) {
                this.f16427 = IconCompat.m29542((Icon) bundle.getParcelable(C6411.f16257));
            } else if (bundle.containsKey(C6411.f16258)) {
                this.f16427 = IconCompat.m29540(bundle.getBundle(C6411.f16258));
            }
            this.f16428 = bundle.getCharSequence(C6411.f16259);
            this.f16421 = (PendingIntent) bundle.getParcelable(C6411.f16260);
            this.f16422 = (PendingIntent) bundle.getParcelable(C6411.f16261);
            this.f16423 = (PendingIntent) bundle.getParcelable(C6411.f16262);
            this.f16425 = bundle.containsKey(C6411.f16263) ? Integer.valueOf(bundle.getInt(C6411.f16263)) : null;
            this.f16426 = bundle.containsKey(C6411.f16264) ? Integer.valueOf(bundle.getInt(C6411.f16264)) : null;
        }

        @InterfaceC6391
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        @InterfaceC7113(20)
        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public ArrayList<C0973> m20220() {
            C0973 c0973M20225 = m20225();
            C0973 c0973M20224 = m20224();
            ArrayList<C0973> arrayList = new ArrayList<>(3);
            arrayList.add(c0973M20225);
            ArrayList<C0973> arrayList2 = this.f2080.f2071;
            int i = 2;
            if (arrayList2 != null) {
                for (C0973 c0973 : arrayList2) {
                    if (c0973.m20055()) {
                        arrayList.add(c0973);
                    } else if (!m20222(c0973) && i > 1) {
                        arrayList.add(c0973);
                        i--;
                    }
                    if (c0973M20224 != null && i == 1) {
                        arrayList.add(c0973M20224);
                        i--;
                    }
                }
            }
            if (c0973M20224 != null && i >= 1) {
                arrayList.add(c0973M20224);
            }
            return arrayList;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public final String m20221() {
            int i = this.f16419;
            if (i == 1) {
                return this.f2080.f2070.getResources().getString(C6989.C6995.f21090);
            }
            if (i == 2) {
                return this.f2080.f2070.getResources().getString(C6989.C6995.f21091);
            }
            if (i != 3) {
                return null;
            }
            return this.f2080.f2070.getResources().getString(C6989.C6995.f21092);
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public final boolean m20222(C0973 c0973) {
            return c0973 != null && c0973.m20047().getBoolean(f16418);
        }

        @InterfaceC6391
        @InterfaceC7113(20)
        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public final C0973 m20223(int i, int i2, Integer num, int i3, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(C4187.m12060(this.f2080.f2070, i3));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f2080.f2070.getResources().getString(i2));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            C0973 c0973M20057 = new C0973.C6412(IconCompat.m29552(this.f2080.f2070, i), spannableStringBuilder, pendingIntent).m20057();
            c0973M20057.m20047().putBoolean(f16418, true);
            return c0973M20057;
        }

        @InterfaceC6490
        @InterfaceC7113(20)
        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public final C0973 m20224() {
            int i = C6989.C6991.f20992;
            int i2 = C6989.C6991.f2611;
            PendingIntent pendingIntent = this.f16421;
            if (pendingIntent == null) {
                return null;
            }
            boolean z = this.f16424;
            return m20223(z ? i : i2, z ? C6989.C6995.f2619 : C6989.C6995.f2618, this.f16425, C6989.C1133.f20968, pendingIntent);
        }

        @InterfaceC6391
        @InterfaceC7113(20)
        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public final C0973 m20225() {
            int i = C6989.C6991.f20994;
            PendingIntent pendingIntent = this.f16422;
            return pendingIntent == null ? m20223(i, C6989.C6995.f21089, this.f16426, C6989.C1133.f20969, this.f16423) : m20223(i, C6989.C6995.f21088, this.f16426, C6989.C1133.f20969, pendingIntent);
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public C6436 m20226(@InterfaceC3897 int i) {
            this.f16425 = Integer.valueOf(i);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public C6436 m20227(@InterfaceC3897 int i) {
            this.f16426 = Integer.valueOf(i);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public C6436 m20228(boolean z) {
            this.f16424 = z;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public C6436 m20229(@InterfaceC6490 Bitmap bitmap) {
            this.f16427 = IconCompat.m29548(bitmap);
            return this;
        }

        @InterfaceC6391
        @InterfaceC7113(23)
        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public C6436 m20230(@InterfaceC6490 Icon icon) {
            this.f16427 = icon == null ? null : IconCompat.m29542(icon);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
        public C6436 m20231(@InterfaceC6490 CharSequence charSequence) {
            this.f16428 = charSequence;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C6436(@InterfaceC6490 C6434 c6434) {
            m20321(c6434);
        }

        public C6436(int i, @InterfaceC6391 C6659 c6659, @InterfaceC6490 PendingIntent pendingIntent, @InterfaceC6490 PendingIntent pendingIntent2, @InterfaceC6490 PendingIntent pendingIntent3) {
            if (c6659 != null && !TextUtils.isEmpty(c6659.m21281())) {
                this.f16419 = i;
                this.f16420 = c6659;
                this.f16421 = pendingIntent3;
                this.f16422 = pendingIntent2;
                this.f16423 = pendingIntent;
                return;
            }
            throw new IllegalArgumentException("person must have a non-empty a name");
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠۠, reason: contains not printable characters */
    public static class C6444 extends AbstractC6454 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final String f16451 = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f16452 = 3;

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠۠$ۥ */
        @InterfaceC7113(24)
        public static class C0985 {
            private C0985() {
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ */
            public static Notification.Style m2929() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public static List<C0973> m20267(List<C0973> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (C0973 c0973 : list) {
                if (!c0973.m20055()) {
                    arrayList.add(c0973);
                }
            }
            return arrayList;
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo2888(InterfaceC6404 interfaceC6404) {
            interfaceC6404.mo2844().setStyle(C0985.m2929());
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
        public boolean mo20219() {
            return true;
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC6391
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥۣ۟۟۠ */
        public String mo20096() {
            return f16451;
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public RemoteViews mo20268(InterfaceC6404 interfaceC6404) {
            return null;
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public RemoteViews mo20269(InterfaceC6404 interfaceC6404) {
            return null;
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public RemoteViews mo20270(InterfaceC6404 interfaceC6404) {
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public final RemoteViews m20271(RemoteViews remoteViews, boolean z) {
            int iMin;
            int i = 0;
            RemoteViews remoteViewsM20311 = m20311(true, C6989.C6994.f21084, false);
            remoteViewsM20311.removeAllViews(C6989.C6992.f21044);
            List<C0973> listM20267 = m20267(this.f2080.f2071);
            if (!z || listM20267 == null || (iMin = Math.min(listM20267.size(), 3)) <= 0) {
                i = 8;
            } else {
                for (int i2 = 0; i2 < iMin; i2++) {
                    remoteViewsM20311.addView(C6989.C6992.f21044, m20272(listM20267.get(i2)));
                }
            }
            remoteViewsM20311.setViewVisibility(C6989.C6992.f21044, i);
            remoteViewsM20311.setViewVisibility(C6989.C6992.f21041, i);
            m20313(remoteViewsM20311, remoteViews);
            return remoteViewsM20311;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public final RemoteViews m20272(C0973 c0973) {
            boolean z = c0973.f16323 == null;
            RemoteViews remoteViews = new RemoteViews(this.f2080.f2070.getPackageName(), z ? C6989.C6994.f21083 : C6989.C6994.f21082);
            IconCompat iconCompatM20049 = c0973.m20049();
            if (iconCompatM20049 != null) {
                remoteViews.setImageViewBitmap(C6989.C6992.f21042, m20317(iconCompatM20049, C6989.C1133.f20970));
            }
            remoteViews.setTextViewText(C6989.C6992.f21043, c0973.f16322);
            if (!z) {
                remoteViews.setOnClickPendingIntent(C6989.C6992.f21040, c0973.f16323);
            }
            remoteViews.setContentDescription(C6989.C6992.f21040, c0973.f16322);
            return remoteViews;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠ۡ, reason: contains not printable characters */
    public interface InterfaceC6445 {
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        C6434 mo2921(@InterfaceC6391 C6434 c6434);
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠ۢ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC6446 {
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC6451 {
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC6452 {
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC6453 {
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static abstract class AbstractC6454 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        public C6434 f2080;

        /* JADX INFO: renamed from: ۥ۟ */
        public CharSequence f2081;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public CharSequence f16474;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f16475 = false;

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠ۨ$ۥ */
        @InterfaceC7113(24)
        public static class C0990 {
            private C0990() {
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ */
            public static void m2941(RemoteViews remoteViews, int i, boolean z) {
                remoteViews.setChronometerCountDown(i, z);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static float m20305(float f, float f2, float f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static AbstractC6454 m20306(@InterfaceC6490 String str) {
            if (str == null) {
                return null;
            }
            switch (str) {
                case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                    return new C6444();
                case "androidx.core.app.NotificationCompat$BigPictureStyle":
                    return new C6430();
                case "androidx.core.app.NotificationCompat$CallStyle":
                    return new C6436();
                case "androidx.core.app.NotificationCompat$InboxStyle":
                    return new C6447();
                case "androidx.core.app.NotificationCompat$BigTextStyle":
                    return new C6431();
                case "androidx.core.app.NotificationCompat$MessagingStyle":
                    return new C6448();
                default:
                    return null;
            }
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static AbstractC6454 m20307(@InterfaceC6490 String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new C6430();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new C6431();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new C6447();
            }
            if (str.equals(Notification.MessagingStyle.class.getName())) {
                return new C6448();
            }
            if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                return new C6444();
            }
            return null;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static AbstractC6454 m20308(@InterfaceC6391 Bundle bundle) {
            AbstractC6454 abstractC6454M20306 = m20306(bundle.getString(C6411.f16241));
            return abstractC6454M20306 != null ? abstractC6454M20306 : (bundle.containsKey(C6411.f16247) || bundle.containsKey(C6411.f16248)) ? new C6448() : (bundle.containsKey(C6411.f16235) || bundle.containsKey(C6411.f16236)) ? new C6430() : bundle.containsKey(C6411.f16224) ? new C6431() : bundle.containsKey(C6411.f16239) ? new C6447() : bundle.containsKey(C6411.f16253) ? new C6436() : m20307(bundle.getString(C6411.f16240));
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static AbstractC6454 m20309(@InterfaceC6391 Bundle bundle) {
            AbstractC6454 abstractC6454M20308 = m20308(bundle);
            if (abstractC6454M20308 == null) {
                return null;
            }
            try {
                abstractC6454M20308.mo20097(bundle);
                return abstractC6454M20308;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static AbstractC6454 m20310(@InterfaceC6391 Notification notification) {
            Bundle bundleM20024 = C6411.m20024(notification);
            if (bundleM20024 == null) {
                return null;
            }
            return m20309(bundleM20024);
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ */
        public void mo2892(@InterfaceC6391 Bundle bundle) {
            if (this.f16475) {
                bundle.putCharSequence(C6411.f16223, this.f16474);
            }
            CharSequence charSequence = this.f2081;
            if (charSequence != null) {
                bundle.putCharSequence(C6411.f16218, charSequence);
            }
            String strMo20096 = mo20096();
            if (strMo20096 != null) {
                bundle.putString(C6411.f16241, strMo20096);
            }
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo2888(InterfaceC6404 interfaceC6404) {
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x018f  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0194  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0196  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x019f  */
        @InterfaceC6391
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RemoteViews m20311(boolean z, int i, boolean z2) {
            boolean z3;
            boolean z4;
            CharSequence charSequence;
            Resources resources = this.f2080.f2070.getResources();
            RemoteViews remoteViews = new RemoteViews(this.f2080.f2070.getPackageName(), i);
            this.f2080.m20149();
            C6434 c6434 = this.f2080;
            if (c6434.f16372 != null) {
                remoteViews.setViewVisibility(C6989.C6992.f21052, 0);
                remoteViews.setImageViewBitmap(C6989.C6992.f21052, m20317(this.f2080.f16372, 0));
                if (z && this.f2080.f16409.icon != 0) {
                    int dimensionPixelSize = resources.getDimensionPixelSize(C6989.C6990.f20985);
                    int dimensionPixelSize2 = dimensionPixelSize - (resources.getDimensionPixelSize(C6989.C6990.f20987) * 2);
                    C6434 c64342 = this.f2080;
                    remoteViews.setImageViewBitmap(C6989.C6992.f21062, m20319(c64342.f16409.icon, dimensionPixelSize, dimensionPixelSize2, c64342.m20143()));
                    remoteViews.setViewVisibility(C6989.C6992.f21062, 0);
                }
            } else if (z && c6434.f16409.icon != 0) {
                remoteViews.setViewVisibility(C6989.C6992.f21052, 0);
                int dimensionPixelSize3 = resources.getDimensionPixelSize(C6989.C6990.f20982) - resources.getDimensionPixelSize(C6989.C6990.f20979);
                int dimensionPixelSize4 = resources.getDimensionPixelSize(C6989.C6990.f20988);
                C6434 c64343 = this.f2080;
                remoteViews.setImageViewBitmap(C6989.C6992.f21052, m20319(c64343.f16409.icon, dimensionPixelSize3, dimensionPixelSize4, c64343.m20143()));
            }
            CharSequence charSequence2 = this.f2080.f16367;
            if (charSequence2 != null) {
                remoteViews.setTextViewText(C6989.C6992.f21080, charSequence2);
            }
            CharSequence charSequence3 = this.f2080.f16368;
            boolean z5 = true;
            if (charSequence3 != null) {
                remoteViews.setTextViewText(C6989.C6992.f21077, charSequence3);
                z3 = true;
            } else {
                z3 = false;
            }
            C6434 c64344 = this.f2080;
            CharSequence charSequence4 = c64344.f16373;
            if (charSequence4 != null) {
                remoteViews.setTextViewText(C6989.C6992.f21054, charSequence4);
                remoteViews.setViewVisibility(C6989.C6992.f21054, 0);
            } else {
                if (c64344.f16374 <= 0) {
                    remoteViews.setViewVisibility(C6989.C6992.f21054, 8);
                    z4 = false;
                    charSequence = this.f2080.f16380;
                    if (charSequence != null) {
                        remoteViews.setTextViewText(C6989.C6992.f21077, charSequence);
                        CharSequence charSequence5 = this.f2080.f16368;
                        if (charSequence5 != null) {
                            remoteViews.setTextViewText(C6989.C6992.f21078, charSequence5);
                            remoteViews.setViewVisibility(C6989.C6992.f21078, 0);
                            if (z2) {
                                remoteViews.setTextViewTextSize(C6989.C6992.f21077, 0, resources.getDimensionPixelSize(C6989.C6990.f20989));
                            }
                            remoteViews.setViewPadding(C6989.C6992.f21056, 0, 0, 0, 0);
                        } else {
                            remoteViews.setViewVisibility(C6989.C6992.f21078, 8);
                        }
                    }
                    if (this.f2080.m20150() != 0) {
                        z5 = z4;
                    } else if (this.f2080.f16377) {
                        remoteViews.setViewVisibility(C6989.C6992.f21047, 0);
                        remoteViews.setLong(C6989.C6992.f21047, "setBase", this.f2080.m20150() + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
                        remoteViews.setBoolean(C6989.C6992.f21047, "setStarted", true);
                        boolean z6 = this.f2080.f16378;
                        if (z6) {
                            C0990.m2941(remoteViews, C6989.C6992.f21047, z6);
                        }
                    } else {
                        remoteViews.setViewVisibility(C6989.C6992.f21079, 0);
                        remoteViews.setLong(C6989.C6992.f21079, "setTime", this.f2080.m20150());
                    }
                    remoteViews.setViewVisibility(C6989.C6992.f21063, !z5 ? 0 : 8);
                    remoteViews.setViewVisibility(C6989.C6992.f21057, z3 ? 0 : 8);
                    return remoteViews;
                }
                if (this.f2080.f16374 > resources.getInteger(C6989.C6993.f2615)) {
                    remoteViews.setTextViewText(C6989.C6992.f21054, resources.getString(C6989.C6995.f21093));
                } else {
                    remoteViews.setTextViewText(C6989.C6992.f21054, NumberFormat.getIntegerInstance().format(this.f2080.f16374));
                }
                remoteViews.setViewVisibility(C6989.C6992.f21054, 0);
            }
            z3 = true;
            z4 = true;
            charSequence = this.f2080.f16380;
            if (charSequence != null) {
            }
            if (this.f2080.m20150() != 0) {
            }
            remoteViews.setViewVisibility(C6989.C6992.f21063, !z5 ? 0 : 8);
            remoteViews.setViewVisibility(C6989.C6992.f21057, z3 ? 0 : 8);
            return remoteViews;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Notification m20312() {
            C6434 c6434 = this.f2080;
            if (c6434 != null) {
                return c6434.m20133();
            }
            return null;
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m20313(RemoteViews remoteViews, RemoteViews remoteViews2) {
            m20320(remoteViews);
            remoteViews.removeAllViews(C6989.C6992.f21060);
            remoteViews.addView(C6989.C6992.f21060, remoteViews2.clone());
            remoteViews.setViewVisibility(C6989.C6992.f21060, 0);
            remoteViews.setViewPadding(C6989.C6992.f21061, 0, m20314(), 0, 0);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final int m20314() {
            Resources resources = this.f2080.f2070.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C6989.C6990.f20990);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C6989.C6990.f20991);
            float fM20305 = (m20305(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - fM20305) * dimensionPixelSize) + (fM20305 * dimensionPixelSize2));
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo20095(@InterfaceC6391 Bundle bundle) {
            bundle.remove(C6411.f16223);
            bundle.remove(C6411.f16218);
            bundle.remove(C6411.f16241);
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public Bitmap m20315(int i, int i2) {
            return m20316(i, i2, 0);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public final Bitmap m20316(int i, int i2, int i3) {
            return m20318(IconCompat.m29552(this.f2080.f2070, i), i2, i3);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public Bitmap m20317(@InterfaceC6391 IconCompat iconCompat, int i) {
            return m20318(iconCompat, i, 0);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final Bitmap m20318(@InterfaceC6391 IconCompat iconCompat, int i, int i2) {
            Drawable drawableM29564 = iconCompat.m29564(this.f2080.f2070);
            int intrinsicWidth = i2 == 0 ? drawableM29564.getIntrinsicWidth() : i2;
            if (i2 == 0) {
                i2 = drawableM29564.getIntrinsicHeight();
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, i2, Bitmap.Config.ARGB_8888);
            drawableM29564.setBounds(0, 0, intrinsicWidth, i2);
            if (i != 0) {
                drawableM29564.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            drawableM29564.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public final Bitmap m20319(int i, int i2, int i3, int i4) {
            int i5 = C6989.C6991.f21003;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap bitmapM20316 = m20316(i5, i4, i2);
            Canvas canvas = new Canvas(bitmapM20316);
            Drawable drawableMutate = this.f2080.f2070.getResources().getDrawable(i).mutate();
            drawableMutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            drawableMutate.setBounds(i6, i6, i7, i7);
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            drawableMutate.draw(canvas);
            return bitmapM20316;
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
        public boolean mo20219() {
            return false;
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥۣ۟۟۠ */
        public String mo20096() {
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final void m20320(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(C6989.C6992.f21080, 8);
            remoteViews.setViewVisibility(C6989.C6992.f21078, 8);
            remoteViews.setViewVisibility(C6989.C6992.f21077, 8);
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
        public RemoteViews mo20268(InterfaceC6404 interfaceC6404) {
            return null;
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
        public RemoteViews mo20269(InterfaceC6404 interfaceC6404) {
            return null;
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
        public RemoteViews mo20270(InterfaceC6404 interfaceC6404) {
            return null;
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
        public void mo20097(@InterfaceC6391 Bundle bundle) {
            if (bundle.containsKey(C6411.f16223)) {
                this.f16474 = bundle.getCharSequence(C6411.f16223);
                this.f16475 = true;
            }
            this.f2081 = bundle.getCharSequence(C6411.f16218);
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public void m20321(@InterfaceC6490 C6434 c6434) {
            if (this.f2080 != c6434) {
                this.f2080 = c6434;
                if (c6434 != null) {
                    c6434.m20201(this);
                }
            }
        }
    }

    @Deprecated
    public C6411() {
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public static C0973 m2863(@InterfaceC6391 Notification notification, int i) {
        return m2864(notification.actions[i]);
    }

    @InterfaceC6391
    @InterfaceC7113(20)
    /* JADX INFO: renamed from: ۥ۟ */
    public static C0973 m2864(@InterfaceC6391 Notification.Action action) {
        C7086[] c7086Arr;
        int i;
        RemoteInput[] remoteInputArrM20083 = C6422.m20083(action);
        if (remoteInputArrM20083 == null) {
            c7086Arr = null;
        } else {
            C7086[] c7086Arr2 = new C7086[remoteInputArrM20083.length];
            for (int i2 = 0; i2 < remoteInputArrM20083.length; i2++) {
                RemoteInput remoteInput = remoteInputArrM20083[i2];
                c7086Arr2[i2] = new C7086(C6422.m20084(remoteInput), C6422.m20082(remoteInput), C6422.m2879(remoteInput), C6422.m2878(remoteInput), Build.VERSION.SDK_INT >= 29 ? C6427.m20090(remoteInput) : 0, C6422.m20080(remoteInput), null);
            }
            c7086Arr = c7086Arr2;
        }
        int i3 = Build.VERSION.SDK_INT;
        boolean z = C6422.m20079(action).getBoolean(C6468.f16544) || C6424.m2881(action);
        boolean z2 = C6422.m20079(action).getBoolean(C0973.f16313, true);
        int iM2884 = i3 >= 28 ? C6426.m2884(action) : C6422.m20079(action).getInt(C0973.f16314, 0);
        boolean zM20092 = i3 >= 29 ? C6427.m20092(action) : false;
        boolean zM2887 = i3 >= 31 ? C6428.m2887(action) : false;
        if (C6423.m2880(action) != null || (i = action.icon) == 0) {
            return new C0973(C6423.m2880(action) != null ? IconCompat.m29543(C6423.m2880(action)) : null, action.title, action.actionIntent, C6422.m20079(action), c7086Arr, (C7086[]) null, z, iM2884, z2, zM20092, zM2887);
        }
        return new C0973(i, action.title, action.actionIntent, C6422.m20079(action), c7086Arr, (C7086[]) null, z, iM2884, z2, zM20092, zM2887);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int m20013(@InterfaceC6391 Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m20014(@InterfaceC6391 Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C6427.m2885(notification);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean m20015(@InterfaceC6391 Notification notification) {
        return (notification.flags & 16) != 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static int m20016(@InterfaceC6391 Notification notification) {
        return C6425.m2882(notification);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static C6432 m20017(@InterfaceC6391 Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C6432.m2893(C6427.m2886(notification));
        }
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static String m20018(@InterfaceC6391 Notification notification) {
        return notification.category;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static String m20019(@InterfaceC6391 Notification notification) {
        return C6425.m2883(notification);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static int m20020(@InterfaceC6391 Notification notification) {
        return notification.color;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static CharSequence m20021(@InterfaceC6391 Notification notification) {
        return notification.extras.getCharSequence(f16222);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static CharSequence m20022(@InterfaceC6391 Notification notification) {
        return notification.extras.getCharSequence(f16219);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static CharSequence m20023(@InterfaceC6391 Notification notification) {
        return notification.extras.getCharSequence(f16217);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static Bundle m20024(@InterfaceC6391 Notification notification) {
        return notification.extras;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static String m20025(@InterfaceC6391 Notification notification) {
        return C6422.m20081(notification);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static int m20026(@InterfaceC6391 Notification notification) {
        return C6425.m20086(notification);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static boolean m20027(@InterfaceC6391 Notification notification) {
        return (notification.flags & 128) != 0;
    }

    @InterfaceC6391
    @InterfaceC7113(21)
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static List<C0973> m20028(@InterfaceC6391 Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle(C6442.f16429);
        if (bundle2 != null && (bundle = bundle2.getBundle(C6442.f16433)) != null) {
            for (int i = 0; i < bundle.size(); i++) {
                arrayList.add(C6468.m20412(bundle.getBundle(Integer.toString(i))));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static boolean m20029(@InterfaceC6391 Notification notification) {
        return (notification.flags & 256) != 0;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static C5861 m20030(@InterfaceC6391 Notification notification) {
        LocusId locusIdM20091;
        if (Build.VERSION.SDK_INT < 29 || (locusIdM20091 = C6427.m20091(notification)) == null) {
            return null;
        }
        return C5861.m18148(locusIdM20091);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static Notification[] m20031(@InterfaceC6391 Bundle bundle, @InterfaceC6391 String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            notificationArr[i] = (Notification) parcelableArray[i];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static boolean m20032(@InterfaceC6391 Notification notification) {
        return (notification.flags & 2) != 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static boolean m20033(@InterfaceC6391 Notification notification) {
        return (notification.flags & 8) != 0;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static List<C6659> m20034(@InterfaceC6391 Notification notification) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(f16243);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(C6659.m3139(C6410.m2862(it.next())));
                }
            }
        } else {
            String[] stringArray = notification.extras.getStringArray(f16242);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    arrayList.add(new C6659.C6660().m21294(str).m3145());
                }
            }
        }
        return arrayList;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static Notification m20035(@InterfaceC6391 Notification notification) {
        return notification.publicVersion;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static CharSequence m20036(@InterfaceC6391 Notification notification) {
        return C6425.m20087(notification);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static String m20037(@InterfaceC6391 Notification notification) {
        return C6425.m20088(notification);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static boolean m20038(@InterfaceC6391 Notification notification) {
        return notification.extras.getBoolean(f16234);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static String m20039(@InterfaceC6391 Notification notification) {
        return C6422.m20085(notification);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static CharSequence m20040(@InterfaceC6391 Notification notification) {
        return notification.extras.getCharSequence(f16220);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static long m20041(@InterfaceC6391 Notification notification) {
        return C6425.m20089(notification);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static boolean m20042(@InterfaceC6391 Notification notification) {
        return notification.extras.getBoolean(f16231);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static int m20043(@InterfaceC6391 Notification notification) {
        return notification.visibility;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static boolean m20044(@InterfaceC6391 Notification notification) {
        return (notification.flags & 512) != 0;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static Bitmap m20045(@InterfaceC6391 Context context, @InterfaceC6490 Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C6989.C6990.f20976);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C6989.C6990.f20975);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠۟, reason: contains not printable characters */
    public static final class C6442 implements InterfaceC6445 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        public static final String f16429 = "android.car.EXTENSIONS";

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final String f16430 = "large_icon";

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final String f16431 = "car_conversation";

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final String f16432 = "app_color";

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        public static final String f16433 = "invisible_actions";

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final String f16434 = "author";

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final String f16435 = "text";

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static final String f16436 = "messages";

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static final String f16437 = "remote_input";

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static final String f16438 = "on_reply";

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static final String f16439 = "on_read";

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static final String f16440 = "participants";

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static final String f16441 = "timestamp";

        /* JADX INFO: renamed from: ۥ */
        public Bitmap f2072;

        /* JADX INFO: renamed from: ۥ۟ */
        public C6443 f2073;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f16442;

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠۟$ۥ */
        @InterfaceC7113(20)
        public static class C0982 {
            private C0982() {
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ */
            public static RemoteInput.Builder m2922(RemoteInput.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟ */
            public static RemoteInput m2923(RemoteInput.Builder builder) {
                return builder.build();
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public static Parcelable m20249(RemoteInput remoteInput) {
                return remoteInput;
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public static RemoteInput.Builder m20250(String str) {
                return new RemoteInput.Builder(str);
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public static boolean m20251(RemoteInput remoteInput) {
                return remoteInput.getAllowFreeFormInput();
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public static CharSequence[] m20252(RemoteInput remoteInput) {
                return remoteInput.getChoices();
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public static Bundle m20253(RemoteInput remoteInput) {
                return remoteInput.getExtras();
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
            public static CharSequence m20254(RemoteInput remoteInput) {
                return remoteInput.getLabel();
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
            public static String m20255(RemoteInput remoteInput) {
                return remoteInput.getResultKey();
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
            public static RemoteInput.Builder m20256(RemoteInput.Builder builder, boolean z) {
                return builder.setAllowFreeFormInput(z);
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
            public static RemoteInput.Builder m20257(RemoteInput.Builder builder, CharSequence[] charSequenceArr) {
                return builder.setChoices(charSequenceArr);
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
            public static RemoteInput.Builder m20258(RemoteInput.Builder builder, CharSequence charSequence) {
                return builder.setLabel(charSequence);
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟ */
        @InterfaceC7113(29)
        public static class C0983 {
            private C0983() {
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ */
            public static int m2924(RemoteInput remoteInput) {
                return remoteInput.getEditChoicesBeforeSending();
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟, reason: contains not printable characters */
        @Deprecated
        public static class C6443 {

            /* JADX INFO: renamed from: ۥ */
            public final String[] f2074;

            /* JADX INFO: renamed from: ۥ۟ */
            public final C7086 f2075;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final PendingIntent f16443;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public final PendingIntent f16444;

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public final String[] f16445;

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public final long f16446;

            /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟$ۥ */
            public static class C0984 {

                /* JADX INFO: renamed from: ۥ */
                public final List<String> f2076 = new ArrayList();

                /* JADX INFO: renamed from: ۥ۟ */
                public final String f2077;

                /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
                public C7086 f16447;

                /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
                public PendingIntent f16448;

                /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
                public PendingIntent f16449;

                /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
                public long f16450;

                public C0984(@InterfaceC6391 String str) {
                    this.f2077 = str;
                }

                @InterfaceC6391
                /* JADX INFO: renamed from: ۥ */
                public C0984 m2927(@InterfaceC6490 String str) {
                    if (str != null) {
                        this.f2076.add(str);
                    }
                    return this;
                }

                @InterfaceC6391
                /* JADX INFO: renamed from: ۥ۟ */
                public C6443 m2928() {
                    List<String> list = this.f2076;
                    return new C6443((String[]) list.toArray(new String[list.size()]), this.f16447, this.f16449, this.f16448, new String[]{this.f2077}, this.f16450);
                }

                @InterfaceC6391
                /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
                public C0984 m20264(long j) {
                    this.f16450 = j;
                    return this;
                }

                @InterfaceC6391
                /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
                public C0984 m20265(@InterfaceC6490 PendingIntent pendingIntent) {
                    this.f16448 = pendingIntent;
                    return this;
                }

                @InterfaceC6391
                /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
                public C0984 m20266(@InterfaceC6490 PendingIntent pendingIntent, @InterfaceC6490 C7086 c7086) {
                    this.f16447 = c7086;
                    this.f16449 = pendingIntent;
                    return this;
                }
            }

            public C6443(@InterfaceC6490 String[] strArr, @InterfaceC6490 C7086 c7086, @InterfaceC6490 PendingIntent pendingIntent, @InterfaceC6490 PendingIntent pendingIntent2, @InterfaceC6490 String[] strArr2, long j) {
                this.f2074 = strArr;
                this.f2075 = c7086;
                this.f16444 = pendingIntent2;
                this.f16443 = pendingIntent;
                this.f16445 = strArr2;
                this.f16446 = j;
            }

            /* JADX INFO: renamed from: ۥ */
            public long m2925() {
                return this.f16446;
            }

            @InterfaceC6490
            /* JADX INFO: renamed from: ۥ۟ */
            public String[] m2926() {
                return this.f2074;
            }

            @InterfaceC6490
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public String m20259() {
                String[] strArr = this.f16445;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            @InterfaceC6490
            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public String[] m20260() {
                return this.f16445;
            }

            @InterfaceC6490
            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public PendingIntent m20261() {
                return this.f16444;
            }

            @InterfaceC6490
            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public C7086 m20262() {
                return this.f2075;
            }

            @InterfaceC6490
            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public PendingIntent m20263() {
                return this.f16443;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C6442() {
            this.f16442 = 0;
        }

        @InterfaceC7113(21)
        /* JADX INFO: renamed from: ۥ۟ */
        public static Bundle m2920(@InterfaceC6391 C6443 c6443) {
            Bundle bundle = new Bundle();
            String str = (c6443.m20260() == null || c6443.m20260().length <= 1) ? null : c6443.m20260()[0];
            int length = c6443.m2926().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i = 0; i < length; i++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("text", c6443.m2926()[i]);
                bundle2.putString(f16434, str);
                parcelableArr[i] = bundle2;
            }
            bundle.putParcelableArray(f16436, parcelableArr);
            C7086 c7086M20262 = c6443.m20262();
            if (c7086M20262 != null) {
                RemoteInput.Builder builderM20250 = C0982.m20250(c7086M20262.m22131());
                C0982.m20258(builderM20250, c7086M20262.m22130());
                C0982.m20257(builderM20250, c7086M20262.m22127());
                C0982.m20256(builderM20250, c7086M20262.m22125());
                C0982.m2922(builderM20250, c7086M20262.m22129());
                bundle.putParcelable(f16437, C0982.m20249(C0982.m2923(builderM20250)));
            }
            bundle.putParcelable(f16438, c6443.m20263());
            bundle.putParcelable(f16439, c6443.m20261());
            bundle.putStringArray(f16440, c6443.m20260());
            bundle.putLong(f16441, c6443.m2925());
            return bundle;
        }

        @InterfaceC7113(21)
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static C6443 m20242(@InterfaceC6490 Bundle bundle) {
            String[] strArr;
            if (bundle == null) {
                return null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(f16436);
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                String[] strArr2 = new String[length];
                for (int i = 0; i < length; i++) {
                    Parcelable parcelable = parcelableArray[i];
                    if (parcelable instanceof Bundle) {
                        String string = ((Bundle) parcelable).getString("text");
                        strArr2[i] = string;
                        if (string != null) {
                        }
                    }
                    return null;
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(f16439);
            PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable(f16438);
            RemoteInput remoteInput = (RemoteInput) bundle.getParcelable(f16437);
            String[] stringArray = bundle.getStringArray(f16440);
            if (stringArray == null || stringArray.length != 1) {
                return null;
            }
            return new C6443(strArr, remoteInput != null ? new C7086(C0982.m20255(remoteInput), C0982.m20254(remoteInput), C0982.m20252(remoteInput), C0982.m20251(remoteInput), Build.VERSION.SDK_INT >= 29 ? C0983.m2924(remoteInput) : 0, C0982.m20253(remoteInput), null) : null, pendingIntent2, pendingIntent, stringArray, bundle.getLong(f16441));
        }

        @Override // Yue.C6411.InterfaceC6445
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public C6434 mo2921(@InterfaceC6391 C6434 c6434) {
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.f2072;
            if (bitmap != null) {
                bundle.putParcelable(f16430, bitmap);
            }
            int i = this.f16442;
            if (i != 0) {
                bundle.putInt(f16432, i);
            }
            C6443 c6443 = this.f2073;
            if (c6443 != null) {
                bundle.putBundle(f16431, m2920(c6443));
            }
            c6434.m20145().putBundle(f16429, bundle);
            return c6434;
        }

        @InterfaceC3897
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int m20243() {
            return this.f16442;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Bitmap m20244() {
            return this.f2072;
        }

        @InterfaceC6490
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public C6443 m20245() {
            return this.f2073;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public C6442 m20246(@InterfaceC3897 int i) {
            this.f16442 = i;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public C6442 m20247(@InterfaceC6490 Bitmap bitmap) {
            this.f2072 = bitmap;
            return this;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public C6442 m20248(@InterfaceC6490 C6443 c6443) {
            this.f2073 = c6443;
            return this;
        }

        public C6442(@InterfaceC6391 Notification notification) {
            this.f16442 = 0;
            Bundle bundle = C6411.m20024(notification) == null ? null : C6411.m20024(notification).getBundle(f16429);
            if (bundle != null) {
                this.f2072 = (Bitmap) bundle.getParcelable(f16430);
                this.f16442 = bundle.getInt(f16432, 0);
                this.f2073 = m20242(bundle.getBundle(f16431));
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥۣ۟۟۠, reason: contains not printable characters */
    public static class C6447 extends AbstractC6454 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final String f16453 = "androidx.core.app.NotificationCompat$InboxStyle";

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public ArrayList<CharSequence> f16454 = new ArrayList<>();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C6447() {
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo2888(InterfaceC6404 interfaceC6404) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(interfaceC6404.mo2844()).setBigContentTitle(this.f2081);
            if (this.f16475) {
                bigContentTitle.setSummaryText(this.f16474);
            }
            Iterator<CharSequence> it = this.f16454.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo20095(@InterfaceC6391 Bundle bundle) {
            super.mo20095(bundle);
            bundle.remove(C6411.f16239);
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC6391
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥۣ۟۟۠ */
        public String mo20096() {
            return f16453;
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
        public void mo20097(@InterfaceC6391 Bundle bundle) {
            super.mo20097(bundle);
            this.f16454.clear();
            if (bundle.containsKey(C6411.f16239)) {
                Collections.addAll(this.f16454, bundle.getCharSequenceArray(C6411.f16239));
            }
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public C6447 m20273(@InterfaceC6490 CharSequence charSequence) {
            if (charSequence != null) {
                this.f16454.add(C6434.m20127(charSequence));
            }
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public C6447 m20274(@InterfaceC6490 CharSequence charSequence) {
            this.f2081 = C6434.m20127(charSequence);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public C6447 m20275(@InterfaceC6490 CharSequence charSequence) {
            this.f16474 = C6434.m20127(charSequence);
            this.f16475 = true;
            return this;
        }

        public C6447(@InterfaceC6490 C6434 c6434) {
            m20321(c6434);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟ۡ, reason: contains not printable characters */
    public static final class C6455 implements InterfaceC6445 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final String f16476 = "TvExtender";

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        public static final String f16477 = "android.tv.EXTENSIONS";

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        public static final String f16478 = "flags";

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final String f16479 = "content_intent";

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final String f16480 = "delete_intent";

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static final String f16481 = "channel_id";

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static final String f16482 = "suppressShowOverApps";

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static final int f16483 = 1;

        /* JADX INFO: renamed from: ۥ */
        public int f2082;

        /* JADX INFO: renamed from: ۥ۟ */
        public String f2083;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public PendingIntent f16484;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public PendingIntent f16485;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean f16486;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C6455() {
            this.f2082 = 1;
        }

        @Override // Yue.C6411.InterfaceC6445
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public C6434 mo2921(@InterfaceC6391 C6434 c6434) {
            Bundle bundle = new Bundle();
            bundle.putInt("flags", this.f2082);
            bundle.putString(f16481, this.f2083);
            bundle.putBoolean(f16482, this.f16486);
            PendingIntent pendingIntent = this.f16484;
            if (pendingIntent != null) {
                bundle.putParcelable(f16479, pendingIntent);
            }
            PendingIntent pendingIntent2 = this.f16485;
            if (pendingIntent2 != null) {
                bundle.putParcelable(f16480, pendingIntent2);
            }
            c6434.m20145().putBundle(f16477, bundle);
            return c6434;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟ */
        public String m2942() {
            return this.f2083;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public PendingIntent m20322() {
            return this.f16484;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public PendingIntent m20323() {
            return this.f16485;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean m20324() {
            return (this.f2082 & 1) != 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean m20325() {
            return this.f16486;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public C6455 m20326(@InterfaceC6490 String str) {
            this.f2083 = str;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public C6455 m20327(@InterfaceC6490 PendingIntent pendingIntent) {
            this.f16484 = pendingIntent;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public C6455 m20328(@InterfaceC6490 PendingIntent pendingIntent) {
            this.f16485 = pendingIntent;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public C6455 m20329(boolean z) {
            this.f16486 = z;
            return this;
        }

        public C6455(@InterfaceC6391 Notification notification) {
            Bundle bundle = notification.extras;
            Bundle bundle2 = bundle == null ? null : bundle.getBundle(f16477);
            if (bundle2 != null) {
                this.f2082 = bundle2.getInt("flags");
                this.f2083 = bundle2.getString(f16481);
                this.f16486 = bundle2.getBoolean(f16482);
                this.f16484 = (PendingIntent) bundle2.getParcelable(f16479);
                this.f16485 = (PendingIntent) bundle2.getParcelable(f16480);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static class C6448 extends AbstractC6454 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final String f16455 = "androidx.core.app.NotificationCompat$MessagingStyle";

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static final int f16456 = 25;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final List<C6450> f16457 = new ArrayList();

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final List<C6450> f16458 = new ArrayList();

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public C6659 f16459;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        @InterfaceC6490
        public CharSequence f16460;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        @InterfaceC6490
        public Boolean f16461;

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ */
        @InterfaceC7113(24)
        public static class C0986 {
            private C0986() {
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ */
            public static Notification.MessagingStyle m2930(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟ */
            public static Notification.MessagingStyle m2931(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public static Notification.MessagingStyle m20293(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟ */
        @InterfaceC7113(26)
        public static class C0987 {
            private C0987() {
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ */
            public static Notification.MessagingStyle m2932(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟, reason: contains not printable characters */
        @InterfaceC7113(28)
        public static class C6449 {
            private C6449() {
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ */
            public static Notification.MessagingStyle m2933(Person person) {
                return new Notification.MessagingStyle(person);
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟ */
            public static Notification.MessagingStyle m2934(Notification.MessagingStyle messagingStyle, boolean z) {
                return messagingStyle.setGroupConversation(z);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C6448() {
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public static C6448 m20276(@InterfaceC6391 Notification notification) {
            AbstractC6454 abstractC6454M20310 = AbstractC6454.m20310(notification);
            if (abstractC6454M20310 instanceof C6448) {
                return (C6448) abstractC6454M20310;
            }
            return null;
        }

        @Override // Yue.C6411.AbstractC6454
        /* JADX INFO: renamed from: ۥ */
        public void mo2892(@InterfaceC6391 Bundle bundle) {
            super.mo2892(bundle);
            bundle.putCharSequence(C6411.f16247, this.f16459.m21281());
            bundle.putBundle(C6411.f16248, this.f16459.m21288());
            bundle.putCharSequence(C6411.f16265, this.f16460);
            if (this.f16460 != null && this.f16461.booleanValue()) {
                bundle.putCharSequence(C6411.f16249, this.f16460);
            }
            if (!this.f16457.isEmpty()) {
                bundle.putParcelableArray(C6411.f16250, C6450.m2935(this.f16457));
            }
            if (!this.f16458.isEmpty()) {
                bundle.putParcelableArray(C6411.f16251, C6450.m2935(this.f16458));
            }
            Boolean bool = this.f16461;
            if (bool != null) {
                bundle.putBoolean(C6411.f16252, bool.booleanValue());
            }
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo2888(InterfaceC6404 interfaceC6404) {
            m20292(m20288());
            Notification.MessagingStyle messagingStyleM2933 = Build.VERSION.SDK_INT >= 28 ? C6449.m2933(this.f16459.m21286()) : C0986.m2931(this.f16459.m21281());
            Iterator<C6450> it = this.f16457.iterator();
            while (it.hasNext()) {
                C0986.m2930(messagingStyleM2933, it.next().m20303());
            }
            Iterator<C6450> it2 = this.f16458.iterator();
            while (it2.hasNext()) {
                C0987.m2932(messagingStyleM2933, it2.next().m20303());
            }
            if (this.f16461.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                C0986.m20293(messagingStyleM2933, this.f16460);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                C6449.m2934(messagingStyleM2933, this.f16461.booleanValue());
            }
            messagingStyleM2933.setBuilder(interfaceC6404.mo2844());
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo20095(@InterfaceC6391 Bundle bundle) {
            super.mo20095(bundle);
            bundle.remove(C6411.f16248);
            bundle.remove(C6411.f16247);
            bundle.remove(C6411.f16249);
            bundle.remove(C6411.f16265);
            bundle.remove(C6411.f16250);
            bundle.remove(C6411.f16251);
            bundle.remove(C6411.f16252);
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC6391
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥۣ۟۟۠ */
        public String mo20096() {
            return f16455;
        }

        @Override // Yue.C6411.AbstractC6454
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
        public void mo20097(@InterfaceC6391 Bundle bundle) {
            super.mo20097(bundle);
            this.f16457.clear();
            if (bundle.containsKey(C6411.f16248)) {
                this.f16459 = C6659.m3140(bundle.getBundle(C6411.f16248));
            } else {
                this.f16459 = new C6659.C6660().m21293(bundle.getString(C6411.f16247)).m3145();
            }
            CharSequence charSequence = bundle.getCharSequence(C6411.f16249);
            this.f16460 = charSequence;
            if (charSequence == null) {
                this.f16460 = bundle.getCharSequence(C6411.f16265);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(C6411.f16250);
            if (parcelableArray != null) {
                this.f16457.addAll(C6450.m20295(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray(C6411.f16251);
            if (parcelableArray2 != null) {
                this.f16458.addAll(C6450.m20295(parcelableArray2));
            }
            if (bundle.containsKey(C6411.f16252)) {
                this.f16461 = Boolean.valueOf(bundle.getBoolean(C6411.f16252));
            }
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public C6448 m20277(@InterfaceC6490 C6450 c6450) {
            if (c6450 != null) {
                this.f16458.add(c6450);
                if (this.f16458.size() > 25) {
                    this.f16458.remove(0);
                }
            }
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public C6448 m20278(@InterfaceC6490 C6450 c6450) {
            if (c6450 != null) {
                this.f16457.add(c6450);
                if (this.f16457.size() > 25) {
                    this.f16457.remove(0);
                }
            }
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public C6448 m20279(@InterfaceC6490 CharSequence charSequence, long j, @InterfaceC6490 C6659 c6659) {
            m20278(new C6450(charSequence, j, c6659));
            return this;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public C6448 m20280(@InterfaceC6490 CharSequence charSequence, long j, @InterfaceC6490 CharSequence charSequence2) {
            this.f16457.add(new C6450(charSequence, j, new C6659.C6660().m21293(charSequence2).m3145()));
            if (this.f16457.size() > 25) {
                this.f16457.remove(0);
            }
            return this;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public final C6450 m20281() {
            for (int size = this.f16457.size() - 1; size >= 0; size--) {
                C6450 c6450 = this.f16457.get(size);
                if (c6450.m20298() != null && !TextUtils.isEmpty(c6450.m20298().m21281())) {
                    return c6450;
                }
            }
            if (this.f16457.isEmpty()) {
                return null;
            }
            return this.f16457.get(r0.size() - 1);
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public CharSequence m20282() {
            return this.f16460;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public List<C6450> m20283() {
            return this.f16458;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public List<C6450> m20284() {
            return this.f16457;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public C6659 m20285() {
            return this.f16459;
        }

        @InterfaceC6490
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public CharSequence m20286() {
            return this.f16459.m21281();
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public final boolean m20287() {
            for (int size = this.f16457.size() - 1; size >= 0; size--) {
                C6450 c6450 = this.f16457.get(size);
                if (c6450.m20298() != null && c6450.m20298().m21281() == null) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public boolean m20288() {
            C6434 c6434 = this.f2080;
            if (c6434 != null && c6434.f2070.getApplicationInfo().targetSdkVersion < 28 && this.f16461 == null) {
                return this.f16460 != null;
            }
            Boolean bool = this.f16461;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public final TextAppearanceSpan m20289(int i) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null);
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
        public final CharSequence m20290(@InterfaceC6391 C6450 c6450) {
            C3530 c3530M9457 = C3530.m9457();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CharSequence charSequenceM21281 = c6450.m20298() == null ? "" : c6450.m20298().m21281();
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceM21281);
            int iM20143 = C8273.f24692;
            if (zIsEmpty) {
                charSequenceM21281 = this.f16459.m21281();
                if (this.f2080.m20143() != 0) {
                    iM20143 = this.f2080.m20143();
                }
            }
            CharSequence charSequenceM9467 = c3530M9457.m9467(charSequenceM21281);
            spannableStringBuilder.append(charSequenceM9467);
            spannableStringBuilder.setSpan(m20289(iM20143), spannableStringBuilder.length() - charSequenceM9467.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "  ").append(c3530M9457.m9467(c6450.m20300() != null ? c6450.m20300() : ""));
            return spannableStringBuilder;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        public C6448 m20291(@InterfaceC6490 CharSequence charSequence) {
            this.f16460 = charSequence;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
        public C6448 m20292(boolean z) {
            this.f16461 = Boolean.valueOf(z);
            return this;
        }

        @Deprecated
        public C6448(@InterfaceC6391 CharSequence charSequence) {
            this.f16459 = new C6659.C6660().m21293(charSequence).m3145();
        }

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟, reason: contains not printable characters */
        public static final class C6450 {

            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public static final String f16462 = "text";

            /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
            public static final String f16463 = "time";

            /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
            public static final String f16464 = "sender";

            /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
            public static final String f16465 = "type";

            /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
            public static final String f16466 = "uri";

            /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
            public static final String f16467 = "extras";

            /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
            public static final String f16468 = "person";

            /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
            public static final String f16469 = "sender_person";

            /* JADX INFO: renamed from: ۥ */
            public final CharSequence f2078;

            /* JADX INFO: renamed from: ۥ۟ */
            public final long f2079;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            @InterfaceC6490
            public final C6659 f16470;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public Bundle f16471;

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            @InterfaceC6490
            public String f16472;

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            @InterfaceC6490
            public Uri f16473;

            /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟$ۥ */
            @InterfaceC7113(24)
            public static class C0988 {
                private C0988() {
                }

                @InterfaceC4482
                /* JADX INFO: renamed from: ۥ */
                public static Notification.MessagingStyle.Message m2937(CharSequence charSequence, long j, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j, charSequence2);
                }

                @InterfaceC4482
                /* JADX INFO: renamed from: ۥ۟ */
                public static Notification.MessagingStyle.Message m2938(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟$ۥ۟ */
            @InterfaceC7113(28)
            public static class C0989 {
                private C0989() {
                }

                @InterfaceC4482
                /* JADX INFO: renamed from: ۥ */
                public static Parcelable m2939(Person person) {
                    return person;
                }

                @InterfaceC4482
                /* JADX INFO: renamed from: ۥ۟ */
                public static Notification.MessagingStyle.Message m2940(CharSequence charSequence, long j, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j, person);
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public C6450(@InterfaceC6490 CharSequence charSequence, long j, @InterfaceC6490 C6659 c6659) {
                this.f16471 = new Bundle();
                this.f2078 = charSequence;
                this.f2079 = j;
                this.f16470 = c6659;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ */
            public static Bundle[] m2935(@InterfaceC6391 List<C6450> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = list.get(i).m20304();
                }
                return bundleArr;
            }

            @InterfaceC6490
            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public static C6450 m20294(@InterfaceC6391 Bundle bundle) {
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        C6450 c6450 = new C6450(bundle.getCharSequence("text"), bundle.getLong("time"), bundle.containsKey(f16468) ? C6659.m3140(bundle.getBundle(f16468)) : (!bundle.containsKey(f16469) || Build.VERSION.SDK_INT < 28) ? bundle.containsKey(f16464) ? new C6659.C6660().m21293(bundle.getCharSequence(f16464)).m3145() : null : C6659.m3139(C6410.m2862(bundle.getParcelable(f16469))));
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            c6450.m20302(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                        }
                        if (bundle.containsKey("extras")) {
                            c6450.m20297().putAll(bundle.getBundle("extras"));
                        }
                        return c6450;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public static List<C6450> m20295(@InterfaceC6391 Parcelable[] parcelableArr) {
                C6450 c6450M20294;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (c6450M20294 = m20294((Bundle) parcelable)) != null) {
                        arrayList.add(c6450M20294);
                    }
                }
                return arrayList;
            }

            @InterfaceC6490
            /* JADX INFO: renamed from: ۥ۟ */
            public String m2936() {
                return this.f16472;
            }

            @InterfaceC6490
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public Uri m20296() {
                return this.f16473;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public Bundle m20297() {
                return this.f16471;
            }

            @InterfaceC6490
            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public C6659 m20298() {
                return this.f16470;
            }

            @InterfaceC6490
            @Deprecated
            /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
            public CharSequence m20299() {
                C6659 c6659 = this.f16470;
                if (c6659 == null) {
                    return null;
                }
                return c6659.m21281();
            }

            @InterfaceC6490
            /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
            public CharSequence m20300() {
                return this.f2078;
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
            public long m20301() {
                return this.f2079;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
            public C6450 m20302(@InterfaceC6490 String str, @InterfaceC6490 Uri uri) {
                this.f16472 = str;
                this.f16473 = uri;
                return this;
            }

            @InterfaceC6391
            @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
            @InterfaceC7113(24)
            /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
            public Notification.MessagingStyle.Message m20303() {
                Notification.MessagingStyle.Message messageM2937;
                C6659 c6659M20298 = m20298();
                if (Build.VERSION.SDK_INT >= 28) {
                    messageM2937 = C0989.m2940(m20300(), m20301(), c6659M20298 != null ? c6659M20298.m21286() : null);
                } else {
                    messageM2937 = C0988.m2937(m20300(), m20301(), c6659M20298 != null ? c6659M20298.m21281() : null);
                }
                if (m2936() != null) {
                    C0988.m2938(messageM2937, m2936(), m20296());
                }
                return messageM2937;
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
            public final Bundle m20304() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f2078;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f2079);
                C6659 c6659 = this.f16470;
                if (c6659 != null) {
                    bundle.putCharSequence(f16464, c6659.m21281());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable(f16469, C0989.m2939(this.f16470.m21286()));
                    } else {
                        bundle.putBundle(f16468, this.f16470.m21288());
                    }
                }
                String str = this.f16472;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f16473;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f16471;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            @Deprecated
            public C6450(@InterfaceC6490 CharSequence charSequence, long j, @InterfaceC6490 CharSequence charSequence2) {
                this(charSequence, j, new C6659.C6660().m21293(charSequence2).m3145());
            }
        }

        public C6448(@InterfaceC6391 C6659 c6659) {
            if (!TextUtils.isEmpty(c6659.m21281())) {
                this.f16459 = c6659;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final class C6456 implements InterfaceC6445 {

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static final int f16487 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        @Deprecated
        public static final int f16488 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        @Deprecated
        public static final int f16489 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        @Deprecated
        public static final int f16490 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        @Deprecated
        public static final int f16491 = 3;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Deprecated
        public static final int f16492 = 4;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @Deprecated
        public static final int f16493 = 5;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @Deprecated
        public static final int f16494 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @Deprecated
        public static final int f16495 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static final String f16496 = "android.wearable.EXTENSIONS";

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static final String f16497 = "actions";

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static final String f16498 = "flags";

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static final String f16499 = "displayIntent";

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static final String f16500 = "pages";

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public static final String f16501 = "background";

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public static final String f16502 = "contentIcon";

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public static final String f16503 = "contentIconGravity";

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public static final String f16504 = "contentActionIndex";

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public static final String f16505 = "customSizePreset";

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public static final String f16506 = "customContentHeight";

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public static final String f16507 = "gravity";

        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public static final String f16508 = "hintScreenTimeout";

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public static final String f16509 = "dismissalId";

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public static final String f16510 = "bridgeTag";

        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public static final int f16511 = 1;

        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public static final int f16512 = 2;

        /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
        public static final int f16513 = 4;

        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        public static final int f16514 = 8;

        /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
        public static final int f16515 = 16;

        /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
        public static final int f16516 = 32;

        /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
        public static final int f16517 = 64;

        /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
        public static final int f16518 = 1;

        /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
        public static final int f16519 = 8388613;

        /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
        public static final int f16520 = 80;

        /* JADX INFO: renamed from: ۥ */
        public ArrayList<C0973> f2084;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f2085;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public PendingIntent f16521;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public ArrayList<Notification> f16522;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Bitmap f16523;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f16524;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f16525;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public int f16526;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public int f16527;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public int f16528;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public int f16529;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public int f16530;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public String f16531;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public String f16532;

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟ۡ۟$ۥ */
        @InterfaceC7113(20)
        public static class C0991 {
            private C0991() {
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ */
            public static Notification.Action.Builder m2944(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟ */
            public static Notification.Action.Builder m2945(Notification.Action.Builder builder, RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public static Notification.Action m20376(Notification.Action.Builder builder) {
                return builder.build();
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public static Notification.Action.Builder m20377(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i, charSequence, pendingIntent);
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public static C0973 m20378(ArrayList<Parcelable> arrayList, int i) {
                return C6411.m2864((Notification.Action) arrayList.get(i));
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟ۡ۟$ۥ۟ */
        @InterfaceC7113(23)
        public static class C0992 {
            private C0992() {
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ */
            public static Notification.Action.Builder m2946(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟ۡ۟$ۥ۟۟, reason: contains not printable characters */
        @InterfaceC7113(24)
        public static class C6457 {
            private C6457() {
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ */
            public static Notification.Action.Builder m2947(Notification.Action.Builder builder, boolean z) {
                return builder.setAllowGeneratedReplies(z);
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟ۡ۟$ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC7113(31)
        public static class C6458 {
            private C6458() {
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ */
            public static Notification.Action.Builder m2948(Notification.Action.Builder builder, boolean z) {
                return builder.setAuthenticationRequired(z);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C6456() {
            this.f2084 = new ArrayList<>();
            this.f2085 = 1;
            this.f16522 = new ArrayList<>();
            this.f16525 = 8388613;
            this.f16526 = -1;
            this.f16527 = 0;
            this.f16529 = 80;
        }

        @InterfaceC7113(20)
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static Notification.Action m20330(C0973 c0973) {
            int i = Build.VERSION.SDK_INT;
            IconCompat iconCompatM20049 = c0973.m20049();
            Notification.Action.Builder builderM2946 = C0992.m2946(iconCompatM20049 == null ? null : iconCompatM20049.m29570(), c0973.m20053(), c0973.m2865());
            Bundle bundle = c0973.m20047() != null ? new Bundle(c0973.m20047()) : new Bundle();
            bundle.putBoolean(C6468.f16544, c0973.m2866());
            C6457.m2947(builderM2946, c0973.m2866());
            if (i >= 31) {
                C6458.m2948(builderM2946, c0973.m20054());
            }
            C0991.m2944(builderM2946, bundle);
            C7086[] c7086ArrM20050 = c0973.m20050();
            if (c7086ArrM20050 != null) {
                for (RemoteInput remoteInput : C7086.m22117(c7086ArrM20050)) {
                    C0991.m2945(builderM2946, remoteInput);
                }
            }
            return C0991.m20376(builderM2946);
        }

        @Override // Yue.C6411.InterfaceC6445
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public C6434 mo2921(@InterfaceC6391 C6434 c6434) {
            Bundle bundle = new Bundle();
            if (!this.f2084.isEmpty()) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f2084.size());
                Iterator<C0973> it = this.f2084.iterator();
                while (it.hasNext()) {
                    arrayList.add(m20330(it.next()));
                }
                bundle.putParcelableArrayList(f16497, arrayList);
            }
            int i = this.f2085;
            if (i != 1) {
                bundle.putInt("flags", i);
            }
            PendingIntent pendingIntent = this.f16521;
            if (pendingIntent != null) {
                bundle.putParcelable(f16499, pendingIntent);
            }
            if (!this.f16522.isEmpty()) {
                ArrayList<Notification> arrayList2 = this.f16522;
                bundle.putParcelableArray(f16500, (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.f16523;
            if (bitmap != null) {
                bundle.putParcelable(f16501, bitmap);
            }
            int i2 = this.f16524;
            if (i2 != 0) {
                bundle.putInt(f16502, i2);
            }
            int i3 = this.f16525;
            if (i3 != 8388613) {
                bundle.putInt(f16503, i3);
            }
            int i4 = this.f16526;
            if (i4 != -1) {
                bundle.putInt(f16504, i4);
            }
            int i5 = this.f16527;
            if (i5 != 0) {
                bundle.putInt(f16505, i5);
            }
            int i6 = this.f16528;
            if (i6 != 0) {
                bundle.putInt(f16506, i6);
            }
            int i7 = this.f16529;
            if (i7 != 80) {
                bundle.putInt(f16507, i7);
            }
            int i8 = this.f16530;
            if (i8 != 0) {
                bundle.putInt(f16508, i8);
            }
            String str = this.f16531;
            if (str != null) {
                bundle.putString(f16509, str);
            }
            String str2 = this.f16532;
            if (str2 != null) {
                bundle.putString(f16510, str2);
            }
            c6434.m20145().putBundle("android.wearable.EXTENSIONS", bundle);
            return c6434;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public C6456 m2943(@InterfaceC6391 C0973 c0973) {
            this.f2084.add(c0973);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C6456 m20331(@InterfaceC6391 List<C0973> list) {
            this.f2084.addAll(list);
            return this;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public C6456 m20332(@InterfaceC6391 Notification notification) {
            this.f16522.add(notification);
            return this;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public C6456 m20333(@InterfaceC6391 List<Notification> list) {
            this.f16522.addAll(list);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public C6456 m20334() {
            this.f2084.clear();
            return this;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public C6456 m20335() {
            this.f16522.clear();
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C6456 clone() {
            C6456 c6456 = new C6456();
            c6456.f2084 = new ArrayList<>(this.f2084);
            c6456.f2085 = this.f2085;
            c6456.f16521 = this.f16521;
            c6456.f16522 = new ArrayList<>(this.f16522);
            c6456.f16523 = this.f16523;
            c6456.f16524 = this.f16524;
            c6456.f16525 = this.f16525;
            c6456.f16526 = this.f16526;
            c6456.f16527 = this.f16527;
            c6456.f16528 = this.f16528;
            c6456.f16529 = this.f16529;
            c6456.f16530 = this.f16530;
            c6456.f16531 = this.f16531;
            c6456.f16532 = this.f16532;
            return c6456;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public List<C0973> m20337() {
            return this.f2084;
        }

        @InterfaceC6490
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public Bitmap m20338() {
            return this.f16523;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public String m20339() {
            return this.f16532;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public int m20340() {
            return this.f16526;
        }

        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public int m20341() {
            return this.f16524;
        }

        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public int m20342() {
            return this.f16525;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public boolean m20343() {
            return (this.f2085 & 1) != 0;
        }

        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public int m20344() {
            return this.f16528;
        }

        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public int m20345() {
            return this.f16527;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public String m20346() {
            return this.f16531;
        }

        @InterfaceC6490
        @Deprecated
        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public PendingIntent m20347() {
            return this.f16521;
        }

        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int m20348() {
            return this.f16529;
        }

        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean m20349() {
            return (this.f2085 & 32) != 0;
        }

        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public boolean m20350() {
            return (this.f2085 & 16) != 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public boolean m20351() {
            return (this.f2085 & 64) != 0;
        }

        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public boolean m20352() {
            return (this.f2085 & 2) != 0;
        }

        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public int m20353() {
            return this.f16530;
        }

        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public boolean m20354() {
            return (this.f2085 & 4) != 0;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public List<Notification> m20355() {
            return this.f16522;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public boolean m20356() {
            return (this.f2085 & 8) != 0;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public C6456 m20357(@InterfaceC6490 Bitmap bitmap) {
            this.f16523 = bitmap;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public C6456 m20358(@InterfaceC6490 String str) {
            this.f16532 = str;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public C6456 m20359(int i) {
            this.f16526 = i;
            return this;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public C6456 m20360(int i) {
            this.f16524 = i;
            return this;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public C6456 m20361(int i) {
            this.f16525 = i;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public C6456 m20362(boolean z) {
            m20367(1, z);
            return this;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public C6456 m20363(int i) {
            this.f16528 = i;
            return this;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public C6456 m20364(int i) {
            this.f16527 = i;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public C6456 m20365(@InterfaceC6490 String str) {
            this.f16531 = str;
            return this;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public C6456 m20366(@InterfaceC6490 PendingIntent pendingIntent) {
            this.f16521 = pendingIntent;
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public final void m20367(int i, boolean z) {
            if (z) {
                this.f2085 = i | this.f2085;
            } else {
                this.f2085 = (~i) & this.f2085;
            }
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
        public C6456 m20368(int i) {
            this.f16529 = i;
            return this;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        public C6456 m20369(boolean z) {
            m20367(32, z);
            return this;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
        public C6456 m20370(boolean z) {
            m20367(16, z);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
        public C6456 m20371(boolean z) {
            m20367(64, z);
            return this;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
        public C6456 m20372(boolean z) {
            m20367(2, z);
            return this;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
        public C6456 m20373(int i) {
            this.f16530 = i;
            return this;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
        public C6456 m20374(boolean z) {
            m20367(4, z);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
        public C6456 m20375(boolean z) {
            m20367(8, z);
            return this;
        }

        public C6456(@InterfaceC6391 Notification notification) {
            this.f2084 = new ArrayList<>();
            this.f2085 = 1;
            this.f16522 = new ArrayList<>();
            this.f16525 = 8388613;
            this.f16526 = -1;
            this.f16527 = 0;
            this.f16529 = 80;
            Bundle bundleM20024 = C6411.m20024(notification);
            Bundle bundle = bundleM20024 != null ? bundleM20024.getBundle("android.wearable.EXTENSIONS") : null;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(f16497);
                if (parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    C0973[] c0973Arr = new C0973[size];
                    for (int i = 0; i < size; i++) {
                        c0973Arr[i] = C0991.m20378(parcelableArrayList, i);
                    }
                    Collections.addAll(this.f2084, c0973Arr);
                }
                this.f2085 = bundle.getInt("flags", 1);
                this.f16521 = (PendingIntent) bundle.getParcelable(f16499);
                Notification[] notificationArrM20031 = C6411.m20031(bundle, f16500);
                if (notificationArrM20031 != null) {
                    Collections.addAll(this.f16522, notificationArrM20031);
                }
                this.f16523 = (Bitmap) bundle.getParcelable(f16501);
                this.f16524 = bundle.getInt(f16502);
                this.f16525 = bundle.getInt(f16503, 8388613);
                this.f16526 = bundle.getInt(f16504, -1);
                this.f16527 = bundle.getInt(f16505, 0);
                this.f16528 = bundle.getInt(f16506);
                this.f16529 = bundle.getInt(f16507, 80);
                this.f16530 = bundle.getInt(f16508);
                this.f16531 = bundle.getString(f16509);
                this.f16532 = bundle.getString(f16510);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static class C6434 {

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public static final int f16364 = 5120;

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        public Context f2070;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        public ArrayList<C0973> f2071;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6391
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        public ArrayList<C6659> f16365;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public ArrayList<C0973> f16366;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public CharSequence f16367;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public CharSequence f16368;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public PendingIntent f16369;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public PendingIntent f16370;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public RemoteViews f16371;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public IconCompat f16372;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public CharSequence f16373;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public int f16374;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public int f16375;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public boolean f16376;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public boolean f16377;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public boolean f16378;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public AbstractC6454 f16379;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public CharSequence f16380;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public CharSequence f16381;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public CharSequence[] f16382;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f16383;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f16384;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public boolean f16385;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public String f16386;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public boolean f16387;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public String f16388;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public boolean f16389;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public boolean f16390;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public boolean f16391;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public String f16392;

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public Bundle f16393;

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public int f16394;

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public int f16395;

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public Notification f16396;

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public RemoteViews f16397;

        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public RemoteViews f16398;

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public RemoteViews f16399;

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public String f16400;

        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public int f16401;

        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public String f16402;

        /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
        public C5861 f16403;

        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        public long f16404;

        /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
        public int f16405;

        /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
        public int f16406;

        /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
        public boolean f16407;

        /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
        public C6432 f16408;

        /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
        public Notification f16409;

        /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
        public boolean f16410;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public Object f16411;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Deprecated
        public ArrayList<String> f16412;

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۟ۨ$ۥ */
        @InterfaceC7113(21)
        public static class C0978 {
            private C0978() {
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ */
            public static AudioAttributes m2903(AudioAttributes.Builder builder) {
                return builder.build();
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟ */
            public static AudioAttributes.Builder m2904() {
                return new AudioAttributes.Builder();
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public static AudioAttributes.Builder m20211(AudioAttributes.Builder builder, int i) {
                return builder.setContentType(i);
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public static AudioAttributes.Builder m20212(AudioAttributes.Builder builder, int i) {
                return builder.setLegacyStreamType(i);
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public static AudioAttributes.Builder m20213(AudioAttributes.Builder builder, int i) {
                return builder.setUsage(i);
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۟ۨ$ۥ۟ */
        @InterfaceC7113(23)
        public static class C0979 {
            private C0979() {
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ */
            public static Icon m2905(Notification notification) {
                return notification.getLargeIcon();
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟ */
            public static Icon m2906(Notification notification) {
                return notification.getSmallIcon();
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۢۦ$ۥ۟۟۟ۨ$ۥ۟۟, reason: contains not printable characters */
        @InterfaceC7113(24)
        public static class C6435 {
            private C6435() {
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ */
            public static RemoteViews m2907(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟ */
            public static RemoteViews m2908(Notification.Builder builder) {
                return builder.createContentView();
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public static RemoteViews m20214(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            @InterfaceC4482
            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public static Notification.Builder m20215(Context context, Notification notification) {
                return Notification.Builder.recoverBuilder(context, notification);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C6434(@InterfaceC6391 Context context, @InterfaceC6391 Notification notification) {
            ArrayList parcelableArrayList;
            this(context, C6411.m20019(notification));
            Bundle bundle = notification.extras;
            AbstractC6454 abstractC6454M20310 = AbstractC6454.m20310(notification);
            m20164(C6411.m20023(notification)).m20163(C6411.m20022(notification)).m20161(C6411.m20021(notification)).m20202(C6411.m20040(notification)).m20190(C6411.m20036(notification)).m20201(abstractC6454M20310).m20174(C6411.m20025(notification)).m20176(C6411.m20044(notification)).m20181(C6411.m20030(notification)).m20209(notification.when).m20193(C6411.m20038(notification)).m20206(C6411.m20042(notification)).m20152(C6411.m20015(notification)).m20185(C6411.m20033(notification)).m20184(C6411.m20032(notification)).m20180(C6411.m20029(notification)).m20177(notification.largeIcon).m20153(C6411.m20016(notification)).m20155(C6411.m20018(notification)).m20154(C6411.m20017(notification)).m20183(notification.number).m20203(notification.tickerText).m20162(notification.contentIntent).m20169(notification.deleteIntent).m20173(notification.fullScreenIntent, C6411.m20027(notification)).m20200(notification.sound, notification.audioStreamType).m20207(notification.vibrate).m20179(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).m20168(notification.defaults).m20186(notification.priority).m20158(C6411.m20020(notification)).m20208(C6411.m20043(notification)).m20188(C6411.m20035(notification)).m20198(C6411.m20039(notification)).m20205(C6411.m20041(notification)).m20191(C6411.m20037(notification)).m20187(bundle.getInt(C6411.f16229), bundle.getInt(C6411.f16228), bundle.getBoolean(C6411.f16230)).m20151(C6411.m20014(notification)).m20196(notification.icon, notification.iconLevel).m20128(m20126(notification, abstractC6454M20310));
            this.f16411 = C0979.m2906(notification);
            Icon iconM2905 = C0979.m2905(notification);
            if (iconM2905 != null) {
                this.f16372 = IconCompat.m29542(iconM2905);
            }
            Notification.Action[] actionArr = notification.actions;
            if (actionArr != null && actionArr.length != 0) {
                for (Notification.Action action : actionArr) {
                    m2902(C0973.C6412.m20056(action).m20057());
                }
            }
            List<C0973> listM20028 = C6411.m20028(notification);
            if (!listM20028.isEmpty()) {
                Iterator<C0973> it = listM20028.iterator();
                while (it.hasNext()) {
                    m20130(it.next());
                }
            }
            String[] stringArray = notification.extras.getStringArray(C6411.f16242);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    m20132(str);
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList(C6411.f16243)) != null && !parcelableArrayList.isEmpty()) {
                Iterator it2 = parcelableArrayList.iterator();
                while (it2.hasNext()) {
                    m20131(C6659.m3139(C6410.m2862(it2.next())));
                }
            }
            if (bundle.containsKey(C6411.f16232)) {
                m20157(bundle.getBoolean(C6411.f16232));
            }
            if (bundle.containsKey(C6411.f16233)) {
                m20159(bundle.getBoolean(C6411.f16233));
            }
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static Bundle m20126(@InterfaceC6391 Notification notification, @InterfaceC6490 AbstractC6454 abstractC6454) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove(C6411.f16217);
            bundle.remove(C6411.f16219);
            bundle.remove(C6411.f16222);
            bundle.remove(C6411.f16220);
            bundle.remove(C6411.f16192);
            bundle.remove(C6411.f16193);
            bundle.remove(C6411.f16234);
            bundle.remove(C6411.f16228);
            bundle.remove(C6411.f16229);
            bundle.remove(C6411.f16230);
            bundle.remove(C6411.f16232);
            bundle.remove(C6411.f16233);
            bundle.remove(C6411.f16243);
            bundle.remove(C6411.f16242);
            bundle.remove(C6467.f16541);
            bundle.remove(C6467.f2089);
            bundle.remove(C6467.f16540);
            bundle.remove(C6467.f2088);
            bundle.remove(C6467.f16542);
            Bundle bundle2 = bundle.getBundle(C6442.f16429);
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove(C6442.f16433);
                bundle.putBundle(C6442.f16429, bundle3);
            }
            if (abstractC6454 != null) {
                abstractC6454.mo20095(bundle);
            }
            return bundle;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static CharSequence m20127(@InterfaceC6490 CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public C6434 m2901(int i, @InterfaceC6490 CharSequence charSequence, @InterfaceC6490 PendingIntent pendingIntent) {
            this.f2071.add(new C0973(i, charSequence, pendingIntent));
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public C6434 m2902(@InterfaceC6490 C0973 c0973) {
            if (c0973 != null) {
                this.f2071.add(c0973);
            }
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C6434 m20128(@InterfaceC6490 Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.f16393;
                if (bundle2 == null) {
                    this.f16393 = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        @InterfaceC6391
        @InterfaceC7113(21)
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public C6434 m20129(int i, @InterfaceC6490 CharSequence charSequence, @InterfaceC6490 PendingIntent pendingIntent) {
            this.f16366.add(new C0973(i, charSequence, pendingIntent));
            return this;
        }

        @InterfaceC6391
        @InterfaceC7113(21)
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public C6434 m20130(@InterfaceC6490 C0973 c0973) {
            if (c0973 != null) {
                this.f16366.add(c0973);
            }
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public C6434 m20131(@InterfaceC6490 C6659 c6659) {
            if (c6659 != null) {
                this.f16365.add(c6659);
            }
            return this;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public C6434 m20132(@InterfaceC6490 String str) {
            if (str != null && !str.isEmpty()) {
                this.f16412.add(str);
            }
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public Notification m20133() {
            return new C6460(this).m20381();
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public C6434 m20134() {
            this.f2071.clear();
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public C6434 m20135() {
            this.f16366.clear();
            Bundle bundle = this.f16393.getBundle(C6442.f16429);
            if (bundle != null) {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.remove(C6442.f16433);
                this.f16393.putBundle(C6442.f16429, bundle2);
            }
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public C6434 m20136() {
            this.f16365.clear();
            this.f16412.clear();
            return this;
        }

        @InterfaceC6490
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public RemoteViews m20137() {
            RemoteViews remoteViewsMo20268;
            if (this.f16398 != null && m20210()) {
                return this.f16398;
            }
            C6460 c6460 = new C6460(this);
            AbstractC6454 abstractC6454 = this.f16379;
            return (abstractC6454 == null || (remoteViewsMo20268 = abstractC6454.mo20268(c6460)) == null) ? C6435.m2907(C6435.m20215(this.f2070, c6460.m20381())) : remoteViewsMo20268;
        }

        @InterfaceC6490
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public RemoteViews m20138() {
            RemoteViews remoteViewsMo20269;
            if (this.f16397 != null && m20210()) {
                return this.f16397;
            }
            C6460 c6460 = new C6460(this);
            AbstractC6454 abstractC6454 = this.f16379;
            return (abstractC6454 == null || (remoteViewsMo20269 = abstractC6454.mo20269(c6460)) == null) ? C6435.m2908(C6435.m20215(this.f2070, c6460.m20381())) : remoteViewsMo20269;
        }

        @InterfaceC6490
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public RemoteViews m20139() {
            RemoteViews remoteViewsMo20270;
            if (this.f16399 != null && m20210()) {
                return this.f16399;
            }
            C6460 c6460 = new C6460(this);
            AbstractC6454 abstractC6454 = this.f16379;
            return (abstractC6454 == null || (remoteViewsMo20270 = abstractC6454.mo20270(c6460)) == null) ? C6435.m20214(C6435.m20215(this.f2070, c6460.m20381())) : remoteViewsMo20270;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public C6434 m20140(@InterfaceC6391 InterfaceC6445 interfaceC6445) {
            interfaceC6445.mo2921(this);
            return this;
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public RemoteViews m20141() {
            return this.f16398;
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public C6432 m20142() {
            return this.f16408;
        }

        @InterfaceC3897
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public int m20143() {
            return this.f16394;
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public RemoteViews m20144() {
            return this.f16397;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Bundle m20145() {
            if (this.f16393 == null) {
                this.f16393 = new Bundle();
            }
            return this.f16393;
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int m20146() {
            return this.f16406;
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public RemoteViews m20147() {
            return this.f16399;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public Notification m20148() {
            return m20133();
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public int m20149() {
            return this.f16375;
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public long m20150() {
            if (this.f16376) {
                return this.f16409.when;
            }
            return 0L;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public C6434 m20151(boolean z) {
            this.f16407 = z;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public C6434 m20152(boolean z) {
            m20171(16, z);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public C6434 m20153(int i) {
            this.f16401 = i;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public C6434 m20154(@InterfaceC6490 C6432 c6432) {
            this.f16408 = c6432;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public C6434 m20155(@InterfaceC6490 String str) {
            this.f16392 = str;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public C6434 m20156(@InterfaceC6391 String str) {
            this.f16400 = str;
            return this;
        }

        @InterfaceC6391
        @InterfaceC7113(24)
        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public C6434 m20157(boolean z) {
            this.f16378 = z;
            m20145().putBoolean(C6411.f16232, z);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public C6434 m20158(@InterfaceC3897 int i) {
            this.f16394 = i;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public C6434 m20159(boolean z) {
            this.f16390 = z;
            this.f16391 = true;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public C6434 m20160(@InterfaceC6490 RemoteViews remoteViews) {
            this.f16409.contentView = remoteViews;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public C6434 m20161(@InterfaceC6490 CharSequence charSequence) {
            this.f16373 = m20127(charSequence);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public C6434 m20162(@InterfaceC6490 PendingIntent pendingIntent) {
            this.f16369 = pendingIntent;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public C6434 m20163(@InterfaceC6490 CharSequence charSequence) {
            this.f16368 = m20127(charSequence);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
        public C6434 m20164(@InterfaceC6490 CharSequence charSequence) {
            this.f16367 = m20127(charSequence);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        public C6434 m20165(@InterfaceC6490 RemoteViews remoteViews) {
            this.f16398 = remoteViews;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
        public C6434 m20166(@InterfaceC6490 RemoteViews remoteViews) {
            this.f16397 = remoteViews;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
        public C6434 m20167(@InterfaceC6490 RemoteViews remoteViews) {
            this.f16399 = remoteViews;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
        public C6434 m20168(int i) {
            Notification notification = this.f16409;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
        public C6434 m20169(@InterfaceC6490 PendingIntent pendingIntent) {
            this.f16409.deleteIntent = pendingIntent;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
        public C6434 m20170(@InterfaceC6490 Bundle bundle) {
            this.f16393 = bundle;
            return this;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
        public final void m20171(int i, boolean z) {
            if (z) {
                Notification notification = this.f16409;
                notification.flags = i | notification.flags;
            } else {
                Notification notification2 = this.f16409;
                notification2.flags = (~i) & notification2.flags;
            }
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public C6434 m20172(int i) {
            this.f16406 = i;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public C6434 m20173(@InterfaceC6490 PendingIntent pendingIntent, boolean z) {
            this.f16370 = pendingIntent;
            m20171(128, z);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public C6434 m20174(@InterfaceC6490 String str) {
            this.f16386 = str;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        public C6434 m20175(int i) {
            this.f16405 = i;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
        public C6434 m20176(boolean z) {
            this.f16387 = z;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
        public C6434 m20177(@InterfaceC6490 Bitmap bitmap) {
            this.f16372 = bitmap == null ? null : IconCompat.m29548(C6411.m20045(this.f2070, bitmap));
            return this;
        }

        @InterfaceC6391
        @InterfaceC7113(23)
        /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
        public C6434 m20178(@InterfaceC6490 Icon icon) {
            this.f16372 = icon == null ? null : IconCompat.m29542(icon);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
        public C6434 m20179(@InterfaceC3897 int i, int i2, int i3) {
            Notification notification = this.f16409;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            notification.flags = ((i2 == 0 || i3 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
        public C6434 m20180(boolean z) {
            this.f16389 = z;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
        public C6434 m20181(@InterfaceC6490 C5861 c5861) {
            this.f16403 = c5861;
            return this;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
        public C6434 m20182() {
            this.f16410 = true;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
        public C6434 m20183(int i) {
            this.f16374 = i;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
        public C6434 m20184(boolean z) {
            m20171(2, z);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
        public C6434 m20185(boolean z) {
            m20171(8, z);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
        public C6434 m20186(int i) {
            this.f16375 = i;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
        public C6434 m20187(int i, int i2, boolean z) {
            this.f16383 = i;
            this.f16384 = i2;
            this.f16385 = z;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
        public C6434 m20188(@InterfaceC6490 Notification notification) {
            this.f16396 = notification;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
        public C6434 m20189(@InterfaceC6490 CharSequence[] charSequenceArr) {
            this.f16382 = charSequenceArr;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
        public C6434 m20190(@InterfaceC6490 CharSequence charSequence) {
            this.f16381 = m20127(charSequence);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
        public C6434 m20191(@InterfaceC6490 String str) {
            this.f16402 = str;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
        public C6434 m20192(@InterfaceC6490 C7451 c7451) {
            if (c7451 == null) {
                return this;
            }
            this.f16402 = c7451.m23340();
            if (this.f16403 == null) {
                if (c7451.m23344() != null) {
                    this.f16403 = c7451.m23344();
                } else if (c7451.m23340() != null) {
                    this.f16403 = new C5861(c7451.m23340());
                }
            }
            if (this.f16367 == null) {
                m20164(c7451.m23348());
            }
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
        public C6434 m20193(boolean z) {
            this.f16376 = z;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
        public C6434 m20194(boolean z) {
            this.f16410 = z;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
        public C6434 m20195(int i) {
            this.f16409.icon = i;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
        public C6434 m20196(int i, int i2) {
            Notification notification = this.f16409;
            notification.icon = i;
            notification.iconLevel = i2;
            return this;
        }

        @InterfaceC6391
        @InterfaceC7113(23)
        /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
        public C6434 m20197(@InterfaceC6391 IconCompat iconCompat) {
            this.f16411 = iconCompat.m29571(this.f2070);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
        public C6434 m20198(@InterfaceC6490 String str) {
            this.f16388 = str;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
        public C6434 m20199(@InterfaceC6490 Uri uri) {
            Notification notification = this.f16409;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderM20213 = C0978.m20213(C0978.m20211(C0978.m2904(), 4), 5);
            this.f16409.audioAttributes = C0978.m2903(builderM20213);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
        public C6434 m20200(@InterfaceC6490 Uri uri, int i) {
            Notification notification = this.f16409;
            notification.sound = uri;
            notification.audioStreamType = i;
            AudioAttributes.Builder builderM20212 = C0978.m20212(C0978.m20211(C0978.m2904(), 4), i);
            this.f16409.audioAttributes = C0978.m2903(builderM20212);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
        public C6434 m20201(@InterfaceC6490 AbstractC6454 abstractC6454) {
            if (this.f16379 != abstractC6454) {
                this.f16379 = abstractC6454;
                if (abstractC6454 != null) {
                    abstractC6454.m20321(this);
                }
            }
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
        public C6434 m20202(@InterfaceC6490 CharSequence charSequence) {
            this.f16380 = m20127(charSequence);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
        public C6434 m20203(@InterfaceC6490 CharSequence charSequence) {
            this.f16409.tickerText = m20127(charSequence);
            return this;
        }

        @InterfaceC6391
        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
        public C6434 m20204(@InterfaceC6490 CharSequence charSequence, @InterfaceC6490 RemoteViews remoteViews) {
            this.f16409.tickerText = m20127(charSequence);
            this.f16371 = remoteViews;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
        public C6434 m20205(long j) {
            this.f16404 = j;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
        public C6434 m20206(boolean z) {
            this.f16377 = z;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
        public C6434 m20207(@InterfaceC6490 long[] jArr) {
            this.f16409.vibrate = jArr;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
        public C6434 m20208(int i) {
            this.f16395 = i;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
        public C6434 m20209(long j) {
            this.f16409.when = j;
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
        public final boolean m20210() {
            AbstractC6454 abstractC6454 = this.f16379;
            return abstractC6454 == null || !abstractC6454.mo20219();
        }

        public C6434(@InterfaceC6391 Context context, @InterfaceC6391 String str) {
            this.f2071 = new ArrayList<>();
            this.f16365 = new ArrayList<>();
            this.f16366 = new ArrayList<>();
            this.f16376 = true;
            this.f16389 = false;
            this.f16394 = 0;
            this.f16395 = 0;
            this.f16401 = 0;
            this.f16405 = 0;
            this.f16406 = 0;
            Notification notification = new Notification();
            this.f16409 = notification;
            this.f2070 = context;
            this.f16400 = str;
            notification.when = System.currentTimeMillis();
            this.f16409.audioStreamType = -1;
            this.f16375 = 0;
            this.f16412 = new ArrayList<>();
            this.f16407 = true;
        }

        @Deprecated
        public C6434(@InterfaceC6391 Context context) {
            this(context, (String) null);
        }
    }
}

.class public final Lkevin/fun/R$string;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkevin/fun/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "string"
.end annotation


# static fields
.field public static final abc_action_bar_home_description:I = 0x7f0d0000

.field public static final abc_action_bar_up_description:I = 0x7f0d0001

.field public static final abc_action_menu_overflow_description:I = 0x7f0d0002

.field public static final abc_action_mode_done:I = 0x7f0d0003

.field public static final abc_activity_chooser_view_see_all:I = 0x7f0d0004

.field public static final abc_activitychooserview_choose_application:I = 0x7f0d0005

.field public static final abc_capital_off:I = 0x7f0d0006

.field public static final abc_capital_on:I = 0x7f0d0007

.field public static final abc_menu_alt_shortcut_label:I = 0x7f0d0008

.field public static final abc_menu_ctrl_shortcut_label:I = 0x7f0d0009

.field public static final abc_menu_delete_shortcut_label:I = 0x7f0d000a

.field public static final abc_menu_enter_shortcut_label:I = 0x7f0d000b

.field public static final abc_menu_function_shortcut_label:I = 0x7f0d000c

.field public static final abc_menu_meta_shortcut_label:I = 0x7f0d000d

.field public static final abc_menu_shift_shortcut_label:I = 0x7f0d000e

.field public static final abc_menu_space_shortcut_label:I = 0x7f0d000f

.field public static final abc_menu_sym_shortcut_label:I = 0x7f0d0010

.field public static final abc_prepend_shortcut_label:I = 0x7f0d0011

.field public static final abc_search_hint:I = 0x7f0d0012

.field public static final abc_searchview_description_clear:I = 0x7f0d0013

.field public static final abc_searchview_description_query:I = 0x7f0d0014

.field public static final abc_searchview_description_search:I = 0x7f0d0015

.field public static final abc_searchview_description_submit:I = 0x7f0d0016

.field public static final abc_searchview_description_voice:I = 0x7f0d0017

.field public static final abc_shareactionprovider_share_with:I = 0x7f0d0018

.field public static final abc_shareactionprovider_share_with_application:I = 0x7f0d0019

.field public static final abc_toolbar_collapse_description:I = 0x7f0d001a

.field public static final androidx_startup:I = 0x7f0d001b

.field public static final app_name:I = 0x7f0d001c

.field public static final call_notification_answer_action:I = 0x7f0d001d

.field public static final call_notification_answer_video_action:I = 0x7f0d001e

.field public static final call_notification_decline_action:I = 0x7f0d001f

.field public static final call_notification_hang_up_action:I = 0x7f0d0020

.field public static final call_notification_incoming_text:I = 0x7f0d0021

.field public static final call_notification_ongoing_text:I = 0x7f0d0022

.field public static final call_notification_screening_text:I = 0x7f0d0023

.field public static final search_menu_title:I = 0x7f0d0024

.field public static final status_bar_notification_info_overflow:I = 0x7f0d0025

.field public static final xposed_activated:I = 0x7f0d0026

.field public static final xposed_unactivated:I = 0x7f0d0027

.field public static final xposeddescription:I = 0x7f0d0028


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/activity/ۣۦۡۥ;->ۦۧۥۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "k3nRU8yuM"

    invoke-static {v0}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۤۥۧۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

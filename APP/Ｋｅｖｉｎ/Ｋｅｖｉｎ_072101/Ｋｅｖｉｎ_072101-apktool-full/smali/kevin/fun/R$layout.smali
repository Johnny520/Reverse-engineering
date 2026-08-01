.class public final Lkevin/fun/R$layout;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkevin/fun/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "layout"
.end annotation


# static fields
.field public static final abc_action_bar_title_item:I = 0x7f0c0000

.field public static final abc_action_bar_up_container:I = 0x7f0c0001

.field public static final abc_action_menu_item_layout:I = 0x7f0c0002

.field public static final abc_action_menu_layout:I = 0x7f0c0003

.field public static final abc_action_mode_bar:I = 0x7f0c0004

.field public static final abc_action_mode_close_item_material:I = 0x7f0c0005

.field public static final abc_activity_chooser_view:I = 0x7f0c0006

.field public static final abc_activity_chooser_view_list_item:I = 0x7f0c0007

.field public static final abc_alert_dialog_button_bar_material:I = 0x7f0c0008

.field public static final abc_alert_dialog_material:I = 0x7f0c0009

.field public static final abc_alert_dialog_title_material:I = 0x7f0c000a

.field public static final abc_cascading_menu_item_layout:I = 0x7f0c000b

.field public static final abc_dialog_title_material:I = 0x7f0c000c

.field public static final abc_expanded_menu_layout:I = 0x7f0c000d

.field public static final abc_list_menu_item_checkbox:I = 0x7f0c000e

.field public static final abc_list_menu_item_icon:I = 0x7f0c000f

.field public static final abc_list_menu_item_layout:I = 0x7f0c0010

.field public static final abc_list_menu_item_radio:I = 0x7f0c0011

.field public static final abc_popup_menu_header_item_layout:I = 0x7f0c0012

.field public static final abc_popup_menu_item_layout:I = 0x7f0c0013

.field public static final abc_screen_content_include:I = 0x7f0c0014

.field public static final abc_screen_simple:I = 0x7f0c0015

.field public static final abc_screen_simple_overlay_action_mode:I = 0x7f0c0016

.field public static final abc_screen_toolbar:I = 0x7f0c0017

.field public static final abc_search_dropdown_item_icons_2line:I = 0x7f0c0018

.field public static final abc_search_view:I = 0x7f0c0019

.field public static final abc_select_dialog_material:I = 0x7f0c001a

.field public static final abc_tooltip:I = 0x7f0c001b

.field public static final custom_dialog:I = 0x7f0c001c

.field public static final ime_base_split_test_activity:I = 0x7f0c001d

.field public static final ime_secondary_split_test_activity:I = 0x7f0c001e

.field public static final main:I = 0x7f0c001f

.field public static final notification_action:I = 0x7f0c0020

.field public static final notification_action_tombstone:I = 0x7f0c0021

.field public static final notification_template_custom_big:I = 0x7f0c0022

.field public static final notification_template_icon_group:I = 0x7f0c0023

.field public static final notification_template_part_chronometer:I = 0x7f0c0024

.field public static final notification_template_part_time:I = 0x7f0c0025

.field public static final select_dialog_item_material:I = 0x7f0c0026

.field public static final select_dialog_multichoice_material:I = 0x7f0c0027

.field public static final select_dialog_singlechoice_material:I = 0x7f0c0028

.field public static final support_simple_spinner_dropdown_item:I = 0x7f0c0029


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۣ۟ۦۣۡ()I

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
    const-string v0, "hh7Ki8ZhY52nGYe"

    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۥۧۨ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

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

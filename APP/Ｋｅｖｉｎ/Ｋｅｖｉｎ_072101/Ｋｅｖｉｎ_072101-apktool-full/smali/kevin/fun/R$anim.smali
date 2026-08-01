.class public final Lkevin/fun/R$anim;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkevin/fun/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "anim"
.end annotation


# static fields
.field public static final abc_fade_in:I = 0x7f010000

.field public static final abc_fade_out:I = 0x7f010001

.field public static final abc_grow_fade_in_from_bottom:I = 0x7f010002

.field public static final abc_popup_enter:I = 0x7f010003

.field public static final abc_popup_exit:I = 0x7f010004

.field public static final abc_shrink_fade_out_from_bottom:I = 0x7f010005

.field public static final abc_slide_in_bottom:I = 0x7f010006

.field public static final abc_slide_in_top:I = 0x7f010007

.field public static final abc_slide_out_bottom:I = 0x7f010008

.field public static final abc_slide_out_top:I = 0x7f010009

.field public static final abc_tooltip_enter:I = 0x7f01000a

.field public static final abc_tooltip_exit:I = 0x7f01000b

.field public static final btn_checkbox_to_checked_box_inner_merged_animation:I = 0x7f01000c

.field public static final btn_checkbox_to_checked_box_outer_merged_animation:I = 0x7f01000d

.field public static final btn_checkbox_to_checked_icon_null_animation:I = 0x7f01000e

.field public static final btn_checkbox_to_unchecked_box_inner_merged_animation:I = 0x7f01000f

.field public static final btn_checkbox_to_unchecked_check_path_merged_animation:I = 0x7f010010

.field public static final btn_checkbox_to_unchecked_icon_null_animation:I = 0x7f010011

.field public static final btn_radio_to_off_mtrl_dot_group_animation:I = 0x7f010012

.field public static final btn_radio_to_off_mtrl_ring_outer_animation:I = 0x7f010013

.field public static final btn_radio_to_off_mtrl_ring_outer_path_animation:I = 0x7f010014

.field public static final btn_radio_to_on_mtrl_dot_group_animation:I = 0x7f010015

.field public static final btn_radio_to_on_mtrl_ring_outer_animation:I = 0x7f010016

.field public static final btn_radio_to_on_mtrl_ring_outer_path_animation:I = 0x7f010017

.field public static final fragment_fast_out_extra_slow_in:I = 0x7f010018


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۦۣ۠۠()I

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "6cZ03z4fDRnkSUiNCF3bzSD"

    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۧۦۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

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

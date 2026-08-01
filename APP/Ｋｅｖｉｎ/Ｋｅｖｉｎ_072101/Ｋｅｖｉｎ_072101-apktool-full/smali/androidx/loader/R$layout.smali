.class public final Landroidx/loader/R$layout;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/loader/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "layout"
.end annotation


# static fields
.field public static notification_action:I

.field public static notification_action_tombstone:I

.field public static notification_template_custom_big:I

.field public static notification_template_icon_group:I

.field public static notification_template_part_chronometer:I

.field public static notification_template_part_time:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const v0, 0x7f0c0020

    sput v0, Landroidx/loader/R$layout;->notification_action:I

    const v0, 0x7f0c0021

    sput v0, Landroidx/loader/R$layout;->notification_action_tombstone:I

    const v0, 0x7f0c0022

    sput v0, Landroidx/loader/R$layout;->notification_template_custom_big:I

    const v0, 0x7f0c0023

    sput v0, Landroidx/loader/R$layout;->notification_template_icon_group:I

    const v0, 0x7f0c0024

    sput v0, Landroidx/loader/R$layout;->notification_template_part_chronometer:I

    const v0, 0x7f0c0025

    sput v0, Landroidx/loader/R$layout;->notification_template_part_time:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣ۟ۦۣۤ()I

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
    const-string v0, "2UqnBjhMaqxjIm"

    invoke-static {v0}, Landroidx/drawerlayout/ۤۨۡۤ;->ۡۢۢ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

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

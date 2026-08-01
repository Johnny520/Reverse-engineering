.class public final Landroidx/appcompat/R;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/R$anim;,
        Landroidx/appcompat/R$attr;,
        Landroidx/appcompat/R$bool;,
        Landroidx/appcompat/R$color;,
        Landroidx/appcompat/R$dimen;,
        Landroidx/appcompat/R$drawable;,
        Landroidx/appcompat/R$id;,
        Landroidx/appcompat/R$integer;,
        Landroidx/appcompat/R$interpolator;,
        Landroidx/appcompat/R$layout;,
        Landroidx/appcompat/R$string;,
        Landroidx/appcompat/R$style;,
        Landroidx/appcompat/R$styleable;
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/interpolator/ۦۨۢۦ;->ۣۤۦۦ()I

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
    const-string v0, "ILEPdFao"

    invoke-static {v0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۨ۠ۦۣ(Ljava/lang/String;)Ljava/lang/String;

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

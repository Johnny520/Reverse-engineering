.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda158;
.super Ljava/lang/Object;

# interfaces
.implements Lkevin/fun/hook/DYHook$Consumer;


# instance fields
.field public final f$0:[I

.field public final f$1:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>([ILandroid/widget/TextView;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda158;->f$0:[I

    iput-object p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda158;->f$1:Landroid/widget/TextView;

    invoke-static {}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۢۡۡۨ()I

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
    const-string v0, "5Iq1NtF"

    invoke-static {v0}, Landroidx/activity/ۦۧۥۥ;->ۧۧ۠ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

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

.method public static ۢۢۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/core/ۤۦ۟ۢ;->ۣۧۧۡ()I

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
    check-cast p0, [I

    check-cast p1, Landroid/widget/TextView;

    check-cast p2, Ljava/lang/Integer;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/DYHook;->lambda$179([ILandroid/widget/TextView;Ljava/lang/Integer;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 5

    const/4 v0, 0x0

    const-string v4, "\u06e7\u06e0\u06e2"

    move-object v1, v0

    move-object v2, v0

    move-object v3, v0

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {p0}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۟ۤۡۦۢ(Ljava/lang/Object;)[I

    move-result-object v0

    const-string v4, "\u06df\u06e3\u06e3"

    move-object v1, v0

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/customview/ۡۤۡۤ;->۟ۥۨۧ۠(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v0

    const-string v4, "\u06e2\u06e4\u06e7"

    move-object v3, v0

    goto :goto_0

    :sswitch_1
    move-object v0, p1

    check-cast v0, Ljava/lang/Integer;

    const-string v4, "\u06e7\u06e3\u06e1"

    move-object v2, v0

    goto :goto_0

    :sswitch_2
    invoke-static {v1, v3, v2}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda158;->ۢۢۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "\u06e4\u06e8\u06e2"

    move-object v4, v0

    goto :goto_0

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa77f -> :sswitch_0
        0x1ab2e5 -> :sswitch_1
        0x1abade -> :sswitch_3
        0x1ac585 -> :sswitch_2
    .end sparse-switch
.end method

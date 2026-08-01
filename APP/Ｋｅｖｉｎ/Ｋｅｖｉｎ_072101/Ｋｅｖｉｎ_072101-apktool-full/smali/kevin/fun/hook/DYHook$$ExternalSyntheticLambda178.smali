.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda178;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Landroid/content/Context;

.field public final f$1:Ljava/lang/String;

.field public final f$2:Landroid/app/Dialog;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/app/Dialog;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda178;->f$0:Landroid/content/Context;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda178;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda178;->f$2:Landroid/app/Dialog;

    invoke-static {}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟۟ۡۡۦ()I

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
    const-string v0, "xdpyDLg2V1"

    invoke-static {v0}, Landroidx/emoji2/ۢۧۡۧ;->ۣۢ۠ۥ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۧۤ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣۤۥۥ()I

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
    check-cast p0, Landroid/content/Context;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Landroid/app/Dialog;

    check-cast p3, Landroid/view/View;

    invoke-static {p0, p1, p2, p3}, Lkevin/fun/hook/DYHook;->lambda$9(Landroid/content/Context;Ljava/lang/String;Landroid/app/Dialog;Landroid/view/View;)V

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
.method public final onClick(Landroid/view/View;)V
    .locals 5

    const/4 v1, 0x0

    const-string v4, "\u06e3\u06e1\u06e2"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v0, v2, v3, p1}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda178;->۟ۧۤ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e5\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧۥۦ۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "\u06e0\u06df\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/loader/ۡۢۢ;->ۤۡۡۡ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v1

    const-string v4, "\u06e7\u06df\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/drawerlayout/ۤۨۡۤ;->۟۠ۢۥۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "\u06df\u06df\u06e4"

    move-object v2, v1

    goto :goto_0

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdca3 -> :sswitch_3
        0x1aa704 -> :sswitch_1
        0x1aaac5 -> :sswitch_2
        0x1ab644 -> :sswitch_0
    .end sparse-switch
.end method

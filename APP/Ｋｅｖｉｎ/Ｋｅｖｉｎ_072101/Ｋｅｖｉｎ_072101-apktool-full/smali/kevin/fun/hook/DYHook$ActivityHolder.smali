.class public Lkevin/fun/hook/DYHook$ActivityHolder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkevin/fun/hook/DYHook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ActivityHolder"
.end annotation


# static fields
.field private static volatile currentActivity:Landroid/app/Activity;


# instance fields
.field final this$0:Lkevin/fun/hook/DYHook;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkevin/fun/hook/DYHook;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/DYHook$ActivityHolder;->this$0:Lkevin/fun/hook/DYHook;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lkevin/fun/hook/۟ۥ۠۠;->ۥ۠۠ۤ()I

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
    const-string v0, "lh3"

    invoke-static {v0}, Landroidx/loader/ۡۢۢ;->ۨۦۦۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

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

.method static bridge synthetic _$$Nest$sfgetcurrentActivity()Landroid/app/Activity;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/DYHook$ActivityHolder;->ۨۤۥ()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method static bridge synthetic _$$Nest$sfputcurrentActivity(Landroid/app/Activity;)V
    .locals 0

    sput-object p0, Lkevin/fun/hook/DYHook$ActivityHolder;->currentActivity:Landroid/app/Activity;

    return-void
.end method

.method public static getActivity()Landroid/app/Activity;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/DYHook$ActivityHolder;->ۨۤۥ()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method public static init(Landroid/app/Application;)V
    .locals 1

    new-instance v0, Lkevin/fun/hook/DYHook$ActivityHolder$1;

    invoke-direct {v0}, Lkevin/fun/hook/DYHook$ActivityHolder$1;-><init>()V

    invoke-static {p0, v0}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۤۥۣۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static ۨۤۥ()Landroid/app/Activity;
    .locals 2

    invoke-static {}, Landroidx/appcompat/ۣۧۤۢ;->ۢ۟۟ۨ()I

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/DYHook$ActivityHolder;->currentActivity:Landroid/app/Activity;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

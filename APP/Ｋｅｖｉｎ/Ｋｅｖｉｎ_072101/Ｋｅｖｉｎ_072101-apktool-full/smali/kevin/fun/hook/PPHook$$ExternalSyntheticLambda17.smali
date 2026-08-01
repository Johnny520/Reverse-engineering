.class public final synthetic Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda17;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Landroid/app/Dialog;

.field public final f$1:Z

.field public final f$2:Lkevin/fun/hook/PPHook$VerifyCallback;

.field public final f$3:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Dialog;ZLkevin/fun/hook/PPHook$VerifyCallback;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda17;->f$0:Landroid/app/Dialog;

    iput-boolean p2, p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda17;->f$1:Z

    iput-object p3, p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda17;->f$2:Lkevin/fun/hook/PPHook$VerifyCallback;

    iput-object p4, p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda17;->f$3:Ljava/lang/String;

    invoke-static {}, Landroidx/startup/۟ۦۤۨۧ;->ۣۨۢۤ()I

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
    const-string v0, "UorBXiMFHljwXpMUbJSdzT"

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۡۡۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

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

.method public static ۟۠ۦۣۦ(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۠۠ۥ;->ۡۥ۠ۦ()I

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
    check-cast p0, Landroid/app/Dialog;

    check-cast p2, Lkevin/fun/hook/PPHook$VerifyCallback;

    check-cast p3, Ljava/lang/String;

    check-cast p4, Landroid/view/View;

    invoke-static {p0, p1, p2, p3, p4}, Lkevin/fun/hook/PPHook;->lambda$19(Landroid/app/Dialog;ZLkevin/fun/hook/PPHook$VerifyCallback;Ljava/lang/String;Landroid/view/View;)V

    :sswitch_3
    invoke-static {}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟۟ۡۡۦ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "O0TOr1"

    invoke-static {v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۧۡۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v4, "\u06e1\u06e5\u06e6"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢۡ۟ۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "\u06e1\u06e4\u06e4"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣۦۧۦ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v1

    const-string v4, "\u06e2\u06e4\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lkevin/fun/hook/۟ۥ۠۠;->۟ۦۥۥۢ(Ljava/lang/Object;)Z

    move-result v5

    const-string v1, "\u06e7\u06e6\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۣ۟ۡۡۡ(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$VerifyCallback;

    move-result-object v0

    const-string v1, "\u06e8\u06e5\u06e5"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    invoke-static {v3, v5, v0, v2, p1}, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda17;->۟۠ۦۣۦ(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06df\u06e5\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_4
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa7c2 -> :sswitch_4
        0x1aaf21 -> :sswitch_3
        0x1aaf42 -> :sswitch_0
        0x1ab2e0 -> :sswitch_1
        0x1ac5e0 -> :sswitch_2
    .end sparse-switch
.end method

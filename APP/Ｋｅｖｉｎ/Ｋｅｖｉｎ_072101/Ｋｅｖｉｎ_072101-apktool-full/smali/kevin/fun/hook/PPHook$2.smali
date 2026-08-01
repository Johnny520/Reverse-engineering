.class Lkevin/fun/hook/PPHook$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/PPHook;->activateCode(Landroid/content/Context;Ljava/lang/String;Lkevin/fun/hook/PPHook$VerifyCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field private final val$callback:Lkevin/fun/hook/PPHook$VerifyCallback;

.field private final val$code:Ljava/lang/String;

.field private final val$context:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x140

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/PPHook$2;->short:[S

    return-void

    :array_0
    .array-data 2
        0x9a2s
        0x9a3s
        0x9b1s
        0x9das
        0x9cfs
        0x8e4s
        0x8e8s
        0x8e3s
        0x8e2s
        0x768s
        0x774s
        0x779s
        0x6e21s
        0x7eees
        -0x63ees
        -0x7d1cs
        0x4f6s
        0x4eas
        0x4eas
        0x4ees
        0x4eds
        0x4a4s
        0x4b1s
        0x4b1s
        0x4eas
        0x4f9s
        0x4b3s
        0x4e8s
        0x4fbs
        0x4ecs
        0x4f7s
        0x4f8s
        0x4e7s
        0x4b3s
        0x4ffs
        0x4ees
        0x4f7s
        0x4b0s
        0x4f5s
        0x4fbs
        0x4e8s
        0x4f7s
        0x4f0s
        0x4aes
        0x4abs
        0x4acs
        0x4a7s
        0x4aas
        0x4acs
        0x4acs
        0x4b0s
        0x4e9s
        0x4f1s
        0x4ecs
        0x4f5s
        0x4fbs
        0x4ecs
        0x4eds
        0x4b0s
        0x4fas
        0x4fbs
        0x4e8s
        0x4b1s
        0x4ffs
        0x4fds
        0x4eas
        0x4f7s
        0x4e8s
        0x4ffs
        0x4eas
        0x4fbs
        0x91ds
        0x902s
        0x91es
        0x919s
        0x7d1s
        0x7fds
        0x7fcs
        0x7e6s
        0x7f7s
        0x7fcs
        0x7e6s
        0x7bfs
        0x7c6s
        0x7ebs
        0x7e2s
        0x7f7s
        0x57bs
        0x56as
        0x56as
        0x576s
        0x573s
        0x579s
        0x57bs
        0x56es
        0x573s
        0x575s
        0x574s
        0x535s
        0x570s
        0x569s
        0x575s
        0x574s
        0x521s
        0x53as
        0x579s
        0x572s
        0x57bs
        0x568s
        0x569s
        0x57fs
        0x56es
        0x527s
        0x54fs
        0x54es
        0x55cs
        0x537s
        0x522s
        0xc0fs
        0xc2ds
        0xc2ds
        0xc2bs
        0xc3es
        0xc3as
        0xafcs
        0xaeds
        0xaeds
        0xaf1s
        0xaf4s
        0xafes
        0xafcs
        0xae9s
        0xaf4s
        0xaf2s
        0xaf3s
        0xab2s
        0xaf7s
        0xaees
        0xaf2s
        0xaf3s
        0x270s
        0x25bs
        0x252s
        0x241s
        0x240s
        0x256s
        0x247s
        0x2e6s
        0x2cas
        0x2cbs
        0x2cbs
        0x2c0s
        0x2c6s
        0x2d1s
        0x2ccs
        0x2cas
        0x2cbs
        0x41cs
        0x413s
        0x410s
        0x40cs
        0x41as
        0x941s
        0x967s
        0x971s
        0x966s
        0x939s
        0x955s
        0x973s
        0x971s
        0x97as
        0x960s
        0x9f9s
        0x9dbs
        0x9ces
        0x9dds
        0x9d8s
        0x9d8s
        0x9d5s
        0x99bs
        0x981s
        0x99as
        0x984s
        0x994s
        0x99cs
        0x9f5s
        0x9das
        0x9d0s
        0x9c6s
        0x9dbs
        0x9dds
        0x9d0s
        0x99ds
        0x994s
        0x9ffs
        0x9d1s
        0x9c2s
        0x9dds
        0x9das
        0x9fcs
        0x9dbs
        0x9dbs
        0x9dfs
        0x99bs
        0x985s
        0x99as
        0x984s
        0x7e5s
        0x7e7s
        0x7f0s
        0x7eds
        0x7f2s
        0x7e5s
        0x7f0s
        0x7e1s
        0x7c7s
        0x7ebs
        0x7e0s
        0x7e1s
        0x7a4s
        0x7e5s
        0x7f0s
        0x7f0s
        0x7e1s
        0x7e9s
        0x7f4s
        0x7f0s
        0x7b9s
        0x3b5s
        0x3b9s
        0x3ebs
        0x3fcs
        0x3eas
        0x3e9s
        0x3f6s
        0x3f7s
        0x3eas
        0x3fcs
        0x3das
        0x3f6s
        0x3fds
        0x3fcs
        0x3a4s
        0x9b2s
        0x9bes
        0x9ecs
        0x9fbs
        0x9eds
        0x9ees
        0x9a3s
        0x98as
        0x98es
        0x889s
        0x88es
        0x89bs
        0x88es
        0x88fs
        0x889s
        0x8b1s
        0x8bds
        0x8a7s
        0x8bcs
        0x8a6s
        0x67as
        0x66ds
        0x66ds
        0x670s
        0x66ds
        0x6003s
        0x55afs
        0x7de1s
        -0x7726s
        0x51d0s
        0x7d74s
        0x53c3s
        0x599as
        -0x7fes
        0x746s
        0x75as
        0x75as
        0x75es
        0x733s
        0x6d0s
        0x6d2s
        0x6c5s
        0x6d8s
        0x6c7s
        0x6d0s
        0x6c5s
        0x6d4s
        0x6f2s
        0x6des
        0x6d5s
        0x6d4s
        0x691s
        0x7d9ds
        0x6c9ds
        0x58bes
        0x5984s
        0x786s
        0x79cs
        0x280s
        0x282s
        0x295s
        0x288s
        0x297s
        0x280s
        0x295s
        0x284s
        0x2a2s
        0x28es
        0x285s
        0x284s
        0x2c1s
        0x5bf7s
        0x5ea3s
        0x5de3s
        0x5cd9s
        0x2dbs
        0x2c1s
    .end array-data
.end method

.method constructor <init>(Ljava/lang/String;Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/PPHook$2;->val$code:Ljava/lang/String;

    iput-object p2, p0, Lkevin/fun/hook/PPHook$2;->val$context:Landroid/content/Context;

    iput-object p3, p0, Lkevin/fun/hook/PPHook$2;->val$callback:Lkevin/fun/hook/PPHook$VerifyCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۤۦۥۥ()I

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
    const-string v0, "YtMdcuXJ1MRS97VqTRbnU"

    invoke-static {v0}, Landroidx/customview/ۤۡۥ;->ۥۣۢۨ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۡۦۧ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣۣ۟۠()I

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
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/PPHook;->_$$Nest$smisInvalidUid(Ljava/lang/String;)Z

    move-result v0

    :sswitch_3
    return v0

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

.method public static ۟ۦۣۧۢ()Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥ۠ۤ()I

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
    invoke-static {}, Lkevin/fun/hook/PPHook;->_$$Nest$sfgetsCurrentDyUid()Ljava/lang/String;

    move-result-object v0

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

.method public static ۟ۧۥۣۤ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/PPHook$2;

    iget-object v0, p0, Lkevin/fun/hook/PPHook$2;->val$context:Landroid/content/Context;

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

.method public static ۣ۠ۦ۠(Ljava/lang/Object;I)Ljava/lang/String;
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/net/HttpURLConnection;

    invoke-static {p0, p1}, Lkevin/fun/hook/PPHook;->_$$Nest$smreadHttpResponse(Ljava/net/HttpURLConnection;I)Ljava/lang/String;

    move-result-object v0

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

.method public static ۡۢۢۧ()Landroid/os/Handler;
    .locals 2

    invoke-static {}, Landroidx/drawerlayout/ۤۨۡۤ;->ۨۧۢۤ()I

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
    invoke-static {}, Lkevin/fun/hook/PPHook;->_$$Nest$sfgetmainHandler()Landroid/os/Handler;

    move-result-object v0

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

.method public static ۡۨۦۦ()[S
    .locals 2

    invoke-static {}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۤۦۣ()I

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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/PPHook$2;->short:[S

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

.method public static ۣۢۤۡ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۢۤۦ()I

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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/PPHook;->_$$Nest$smlog(Ljava/lang/String;)V

    :sswitch_3
    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۥۦۨ۠()I

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
    const-string v0, "qqYECvsXIwBpzLdm80VomIKc"

    invoke-static {v0}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->۟ۢۢۡۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

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

.method public static ۤۧ۟ۢ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/documentfile/ۡۢ۟ۥ;->۟۟ۧۢۡ()I

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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/PPHook$2;

    iget-object v0, p0, Lkevin/fun/hook/PPHook$2;->val$code:Ljava/lang/String;

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

.method public static ۦۣۧ۠(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$VerifyCallback;
    .locals 2

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

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
    check-cast p0, Lkevin/fun/hook/PPHook$2;

    iget-object v0, p0, Lkevin/fun/hook/PPHook$2;->val$callback:Lkevin/fun/hook/PPHook$VerifyCallback;

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

.method public static ۧ۠ۡۢ()Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۡۧۦۤ()I

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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/PPHook;->_$$Nest$sfgetsCurrentDyNickname()Ljava/lang/String;

    move-result-object v0

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


# virtual methods
.method public run()V
    .locals 18

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v12

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v2

    const/4 v3, 0x0

    sget v4, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v4, v4, -0x31

    const/16 v5, 0x9f7

    invoke-static {v2, v3, v4, v5}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v13

    const/4 v10, 0x0

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/PPHook$2;->۟ۦۣۧۢ()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۧ۠ۡۢ()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5}, Lkevin/fun/hook/PPHook$2;->۟ۡۦۧ(Ljava/lang/Object;)Z

    move-result v3

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v3, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۢۢۧ()Landroid/os/Handler;

    move-result-object v2

    new-instance v3, Lkevin/fun/hook/PPHook$2$1;

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/PPHook$2;->۟ۧۥۣۤ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v4

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/PPHook$2;->ۦۣۧ۠(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$VerifyCallback;

    move-result-object v5

    move-object/from16 v0, p0

    invoke-direct {v3, v0, v4, v5}, Lkevin/fun/hook/PPHook$2$1;-><init>(Lkevin/fun/hook/PPHook$2;Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;)V

    invoke-static {v2, v3}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_c

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_4
    const/4 v2, 0x0

    :try_start_1
    invoke-static {v2}, Landroidx/emoji2/ۢۧۡۧ;->ۢۤۤۡ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :sswitch_5
    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v2, 0xbe22

    goto :goto_2

    :catchall_0
    move-exception v2

    const v2, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :sswitch_7
    const v2, 0xbe9e

    goto :goto_3

    :sswitch_8
    :try_start_2
    new-instance v14, Lorg/json/JSONObject;

    invoke-direct {v14}, Lorg/json/JSONObject;-><init>()V

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v2

    const/4 v3, 0x5

    sget v4, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v4, v4, -0xe9

    const/16 v6, 0x887

    invoke-static {v2, v3, v4, v6}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/PPHook$2;->ۤۧ۟ۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v14, v2, v3}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v2

    const/16 v3, 0x9

    sget v4, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v4, v4, 0x381

    const/16 v6, 0x71d

    invoke-static {v2, v3, v4, v6}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v14, v2, v5}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_c

    const/4 v2, 0x0

    const/4 v3, 0x1

    move v11, v3

    :goto_4
    const v3, 0xbefb

    :goto_5
    const v4, 0xbf0c

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_4

    goto :goto_5

    :cond_1
    :sswitch_9
    const v3, 0xbf39

    goto :goto_5

    :sswitch_a
    const/4 v3, 0x2

    if-le v11, v3, :cond_1

    const v3, 0xc1e3

    goto :goto_5

    :sswitch_b
    const v3, 0xc202

    :goto_6
    const v4, 0xc213

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_5

    goto :goto_6

    :sswitch_c
    if-eqz v2, :cond_2

    const v3, 0xc25f

    goto :goto_6

    :cond_2
    :sswitch_d
    const v3, 0xc240

    goto :goto_6

    :sswitch_e
    :try_start_3
    invoke-static {v2}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const v3, 0xc27e

    :goto_7
    const v4, 0xc28f

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_6

    goto :goto_7

    :goto_8
    :sswitch_f
    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۢۢۧ()Landroid/os/Handler;

    move-result-object v3

    new-instance v4, Lkevin/fun/hook/PPHook$2$3;

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/PPHook$2;->۟ۧۥۣۤ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/PPHook$2;->ۦۣۧ۠(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$VerifyCallback;

    move-result-object v6

    move-object/from16 v0, p0

    invoke-direct {v4, v0, v5, v2, v6}, Lkevin/fun/hook/PPHook$2$3;-><init>(Lkevin/fun/hook/PPHook$2;Landroid/content/Context;Ljava/lang/String;Lkevin/fun/hook/PPHook$VerifyCallback;)V

    invoke-static {v3, v4}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v2, 0xc2fa

    :goto_9
    const v3, 0xc30b

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_7

    goto :goto_9

    :sswitch_10
    const v2, 0xc5c3

    goto :goto_9

    :sswitch_11
    const v3, 0xc29d

    goto :goto_7

    :sswitch_12
    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v2

    const/16 v3, 0xc

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v4, v4, -0x3a2

    const/16 v5, 0x90b

    invoke-static {v2, v3, v4, v5}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_9

    move-result-object v2

    goto :goto_8

    :sswitch_13
    const/4 v2, 0x0

    :try_start_4
    invoke-static {v2}, Landroidx/emoji2/ۢۧۡۧ;->ۢۤۤۡ(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :sswitch_14
    const v2, 0xc601

    :goto_a
    const v3, 0xc612

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_8

    goto :goto_a

    :sswitch_15
    const v2, 0xc620

    goto :goto_a

    :catchall_1
    move-exception v2

    const v2, 0xc67d

    :goto_b
    const v3, 0xc68e

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_9

    goto :goto_b

    :sswitch_16
    const v2, 0xc69c

    goto :goto_b

    :sswitch_17
    :try_start_5
    new-instance v2, Ljava/net/URL;

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v3

    const/16 v4, 0x10

    sget v6, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v6, v6, 0x188

    const/16 v8, 0x49e

    invoke-static {v3, v4, v6, v8}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۡۨۢ(Ljava/lang/Object;)Ljava/net/URLConnection;

    move-result-object v2

    move-object v0, v2

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v10, v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_7
    .catchall {:try_start_5 .. :try_end_5} :catchall_9

    sget v2, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v2, v2, 0x38ff

    :try_start_6
    invoke-static {v10, v2}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۧ۟ۦۥ(Ljava/lang/Object;I)V

    invoke-static {v10, v2}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣ۟۟ۦ(Ljava/lang/Object;I)V

    const/4 v2, 0x0

    invoke-static {v10, v2}, Landroidx/startup/۟ۦۤۨۧ;->ۣ۟ۧۢۡ(Ljava/lang/Object;Z)V

    const/4 v2, 0x1

    invoke-static {v10, v2}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۡۢۧۨ(Ljava/lang/Object;Z)V

    const/4 v2, 0x1

    invoke-static {v10, v2}, Landroidx/activity/ۨ۠۟ۧ;->ۢ۠ۢۦ(Ljava/lang/Object;Z)V

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v2

    const/16 v3, 0x47

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v4, v4, 0x289

    const/16 v6, 0x94d

    invoke-static {v2, v3, v4, v6}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v10, v2}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۤ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v2

    const/16 v3, 0x4b

    sget v4, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v4, v4, -0x214

    const/16 v6, 0x792

    invoke-static {v2, v3, v4, v6}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v3

    const/16 v4, 0x57

    sget v6, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v6, v6, -0x6b

    const/16 v8, 0x51a

    invoke-static {v3, v4, v6, v8}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟۟۠ۤۤ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v10, v2, v3}, Landroidx/activity/ۤۧۧۧ;->ۣ۠ۧۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v2

    const/16 v3, 0x76

    sget v4, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v4, v4, 0x160

    const/16 v6, 0xc4e

    invoke-static {v2, v3, v4, v6}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۧۢۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v3

    const/16 v4, 0x7c

    sget v6, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v6, v6, 0x332

    const/16 v8, 0xa9d

    invoke-static {v3, v4, v6, v8}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v10, v2, v3}, Landroidx/activity/ۤۧۧۧ;->ۣ۠ۧۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v2

    const/16 v3, 0x8c

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v4, v4, 0x28a

    const/16 v6, 0x233

    invoke-static {v2, v3, v4, v6}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v10, v2, v13}, Landroidx/activity/ۤۧۧۧ;->ۣ۠ۧۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v2

    const/16 v3, 0x93

    sget v4, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v4, v4, -0x254

    const/16 v6, 0x2a5

    invoke-static {v2, v3, v4, v6}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v3

    const/16 v4, 0x9d

    sget v6, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v6, v6, -0x1c2

    const/16 v8, 0x47f

    invoke-static {v3, v4, v6, v8}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v10, v2, v3}, Landroidx/activity/ۤۧۧۧ;->ۣ۠ۧۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v2

    const/16 v3, 0xa2

    sget v4, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v4, v4, -0x3cd

    const/16 v6, 0x914

    invoke-static {v2, v3, v4, v6}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v3

    const/16 v4, 0xac

    sget v6, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v6, v6, 0x30

    const/16 v8, 0x9b4

    invoke-static {v3, v4, v6, v8}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v10, v2, v3}, Landroidx/activity/ۤۧۧۧ;->ۣ۠ۧۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v14}, Landroidx/viewpager/ۣۢ۟ۤ;->ۣۧۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v13}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۥۥ۠(Ljava/lang/Object;Ljava/lang/Object;)[B

    move-result-object v3

    array-length v2, v3

    invoke-static {v10, v2}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۡۧۨۦ(Ljava/lang/Object;I)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_8

    const/4 v2, 0x0

    :try_start_7
    invoke-static {v10}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۢ۠۟ۢ(Ljava/lang/Object;)Ljava/io/OutputStream;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    move-result-object v2

    :try_start_8
    invoke-static {v2, v3}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۦۢۢۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۢۨۥ(Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    const v3, 0xc984

    :goto_c
    const v4, 0xc995

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_a

    goto :goto_c

    :sswitch_18
    if-eqz v2, :cond_3

    const v3, 0xc9e1

    goto :goto_c

    :cond_3
    :sswitch_19
    const v3, 0xc9c2

    goto :goto_c

    :sswitch_1a
    :try_start_9
    invoke-static {v2}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡۦۣ(Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :sswitch_1b
    const v2, 0xca00

    :goto_d
    const v3, 0xca11

    xor-int/2addr v2, v3

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    goto :goto_d

    :pswitch_1
    :sswitch_1c
    :try_start_a
    invoke-static {v10}, Landroidx/loader/ۣ۟۟ۧ۠;->۟ۤ(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v10, v3}, Lkevin/fun/hook/PPHook$2;->ۣ۠ۦ۠(Ljava/lang/Object;I)Ljava/lang/String;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_6
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    move-result-object v4

    :try_start_b
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_4
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    :try_start_c
    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v6

    const/16 v8, 0xcf

    sget v9, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v9, v9, 0x1aa

    const/16 v15, 0x784

    invoke-static {v6, v8, v9, v15}, Landroidx/activity/ۤۧۧۧ;->ۣ۟۟۠ۡ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v11}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v6

    const/16 v8, 0xe4

    sget v9, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v9, v9, 0x302

    const/16 v15, 0x399

    invoke-static {v6, v8, v9, v15}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v3}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v6

    const/16 v8, 0xf3

    sget v9, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v9, v9, -0x1bb

    const/16 v15, 0x99e

    invoke-static {v6, v8, v9, v15}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/PPHook$2;->ۣۢۤۡ(Ljava/lang/Object;)V

    invoke-static {v4}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v6

    const v2, 0xcd83

    :goto_e
    const v8, 0xcd94

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_b

    goto :goto_e

    :sswitch_1d
    if-nez v6, :cond_4

    const v2, 0xcde0

    goto :goto_e

    :pswitch_2
    const v2, 0xca1f

    goto :goto_d

    :catchall_2
    move-exception v2

    const v2, 0xca7c

    :goto_f
    const v3, 0xca8d

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_c

    goto :goto_f

    :sswitch_1e
    const v2, 0xcd26

    goto :goto_f

    :cond_4
    :sswitch_1f
    const v2, 0xcdc1

    goto :goto_e

    :sswitch_20
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    new-instance v4, Lkevin/fun/hook/PPHook$ActivateResult;

    const/4 v3, 0x0

    invoke-direct {v4, v3}, Lkevin/fun/hook/PPHook$ActivateResult;-><init>(Lkevin/fun/hook/PPHook-IA;)V

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v3

    const/16 v6, 0xfa

    sget v8, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v8, v8, -0x1ae

    const/16 v9, 0x9e5

    invoke-static {v3, v6, v8, v9}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_3
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    move-result-object v3

    const/4 v6, 0x0

    :try_start_d
    invoke-static {v2, v3, v6}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۨۢۦۡ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v3

    iput-boolean v3, v4, Lkevin/fun/hook/PPHook$ActivateResult;->ok:Z

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v3

    const/16 v6, 0xfc

    sget v8, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v8, v8, -0x16

    const/16 v9, 0x8fa

    invoke-static {v3, v6, v8, v9}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v12}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v4, Lkevin/fun/hook/PPHook$ActivateResult;->status:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v3

    const/16 v6, 0x102

    sget v8, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v8, v8, -0x26b

    const/16 v9, 0x8d2

    invoke-static {v3, v6, v8, v9}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    invoke-static {v2, v3, v6}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۡ۠ۤۦ(Ljava/lang/Object;Ljava/lang/Object;I)I

    move-result v3

    iput v3, v4, Lkevin/fun/hook/PPHook$ActivateResult;->count:I

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v3

    const/16 v6, 0x107

    sget v8, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v8, v8, -0x3a1

    const/16 v9, 0x61f

    invoke-static {v3, v6, v8, v9}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v12}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v4, Lkevin/fun/hook/PPHook$ActivateResult;->error:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۢۢۧ()Landroid/os/Handler;

    move-result-object v15

    new-instance v2, Lkevin/fun/hook/PPHook$2$2;

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/PPHook$2;->ۤۧ۟ۢ(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    move-result-object v6

    :try_start_e
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/PPHook$2;->۟ۧۥۣۤ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v8

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/PPHook$2;->ۦۣۧ۠(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$VerifyCallback;
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    move-result-object v9

    move-object/from16 v3, p0

    :try_start_f
    invoke-direct/range {v2 .. v9}, Lkevin/fun/hook/PPHook$2$2;-><init>(Lkevin/fun/hook/PPHook$2;Lkevin/fun/hook/PPHook$ActivateResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lkevin/fun/hook/PPHook$VerifyCallback;)V

    invoke-static {v15, v2}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_2
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    const v2, 0xcdff

    :goto_10
    const v3, 0xce10

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_d

    goto :goto_10

    :cond_5
    :sswitch_21
    const v2, 0xce3d

    goto :goto_10

    :sswitch_22
    if-eqz v10, :cond_5

    const v2, 0xd0e7

    goto :goto_10

    :sswitch_23
    :try_start_10
    invoke-static {v10}, Landroidx/emoji2/ۢۧۡۧ;->ۢۤۤۡ(Ljava/lang/Object;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    :sswitch_24
    const v2, 0xd106

    :goto_11
    const v3, 0xd117

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_e

    goto :goto_11

    :sswitch_25
    const v2, 0xd125

    goto :goto_11

    :catchall_3
    move-exception v2

    const v2, 0xd182

    :goto_12
    const v3, 0xd193

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_f

    goto :goto_12

    :sswitch_26
    const v2, 0xd1a1

    goto :goto_12

    :sswitch_27
    invoke-static {}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۧۢ۟ۥ()I

    move-result v3

    const v2, 0xd1fe

    :goto_13
    const v4, 0xd20f

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_10

    goto :goto_13

    :sswitch_28
    if-ltz v3, :cond_6

    const v2, 0xd4e6

    goto :goto_13

    :cond_6
    :sswitch_29
    const v2, 0xd4c7

    goto :goto_13

    :sswitch_2a
    const-string v2, "8gVOBjZvEVV3MRHgT0IUS04Lkw"

    invoke-static {v2}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۟ۡ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v2

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_2b
    return-void

    :catch_0
    move-exception v2

    const v3, 0xd505

    :goto_14
    const v4, 0xd516

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_11

    goto :goto_14

    :sswitch_2c
    const v3, 0xd524

    goto :goto_14

    :catch_1
    move-exception v2

    const v3, 0xd581

    :goto_15
    const v4, 0xd592

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_12

    goto :goto_15

    :sswitch_2d
    const v3, 0xd5a0

    goto :goto_15

    :sswitch_2e
    :try_start_11
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v6

    const/16 v8, 0x10c

    sget v9, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v9, v9, 0xfd

    const/16 v15, 0x70e

    invoke-static {v6, v8, v9, v15}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v4, v3}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_2
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    :catch_2
    move-exception v2

    const v3, 0xd888

    :goto_16
    const v4, 0xd899

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_13

    goto :goto_16

    :sswitch_2f
    const v3, 0xd8a7

    goto :goto_16

    :catch_3
    move-exception v2

    const v3, 0xd904

    :goto_17
    const v4, 0xd915

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_14

    goto :goto_17

    :sswitch_30
    const v3, 0xd923

    goto :goto_17

    :catch_4
    move-exception v2

    :sswitch_31
    const v3, 0xd980

    :goto_18
    const v4, 0xd991

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_15

    goto :goto_18

    :sswitch_32
    const v3, 0xdc2a

    goto :goto_18

    :catchall_4
    move-exception v3

    const v4, 0xdc87

    :goto_19
    const v6, 0xdc98

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_16

    goto :goto_19

    :sswitch_33
    const v4, 0xdca6

    goto :goto_19

    :catchall_5
    move-exception v3

    :sswitch_34
    const v4, 0xdd03

    :goto_1a
    const v6, 0xdd14

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_17

    goto :goto_1a

    :sswitch_35
    if-eqz v2, :cond_7

    const v4, 0x170090

    goto :goto_1a

    :cond_7
    :sswitch_36
    const v4, 0xdd41

    goto :goto_1a

    :sswitch_37
    :try_start_12
    invoke-static {v2}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡۦۣ(Ljava/lang/Object;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    :sswitch_38
    const v2, 0x1700af

    :goto_1b
    const v4, 0x1700c0

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_18

    goto :goto_1b

    :sswitch_39
    :try_start_13
    throw v3
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_5
    .catchall {:try_start_13 .. :try_end_13} :catchall_7

    :catch_5
    move-exception v2

    const v3, 0x1704ae

    :goto_1c
    const v4, 0x1704bf

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_19

    goto :goto_1c

    :sswitch_3a
    const v3, 0x1704cd

    goto :goto_1c

    :sswitch_3b
    const v2, 0x1700ce

    goto :goto_1b

    :catchall_6
    move-exception v2

    const v2, 0x17012b

    :goto_1d
    const v4, 0x17013c

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_1a

    goto :goto_1d

    :sswitch_3c
    const v2, 0x17014a

    goto :goto_1d

    :catchall_7
    move-exception v2

    const v3, 0x1701a7

    :goto_1e
    const v4, 0x1701b8

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_1b

    goto :goto_1e

    :sswitch_3d
    const v3, 0x170451

    goto :goto_1e

    :catchall_8
    move-exception v2

    const v3, 0x17052a

    :goto_1f
    const v4, 0x17053b

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_1c

    goto :goto_1f

    :sswitch_3e
    const v3, 0x170549

    goto :goto_1f

    :catch_6
    move-exception v2

    const v3, 0x170831

    :goto_20
    const v4, 0x170842

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_1d

    goto :goto_20

    :goto_21
    :sswitch_3f
    :try_start_14
    invoke-static {v2}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v6

    const/16 v8, 0x11a

    sget v9, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v9, v9, 0x1d

    const/16 v15, 0x6b1

    invoke-static {v6, v8, v9, v15}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v4, v11}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v6

    const/16 v8, 0x128

    sget v9, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v9, v9, 0x262

    const/16 v15, 0x7bc

    invoke-static {v6, v8, v9, v15}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v4, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/PPHook$2;->ۣۢۤۡ(Ljava/lang/Object;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_c

    const v3, 0x170929

    :goto_22
    const v4, 0x17093a

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_1e

    goto :goto_22

    :sswitch_40
    if-eqz v10, :cond_8

    const v3, 0x170c11

    goto :goto_22

    :sswitch_41
    const v3, 0x170850

    goto :goto_20

    :catchall_9
    move-exception v2

    const/4 v10, 0x0

    const v3, 0x1708ad

    :goto_23
    const v4, 0x1708be

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_1f

    goto :goto_23

    :sswitch_42
    const v3, 0x1708cc

    goto :goto_23

    :catch_7
    move-exception v2

    const/4 v10, 0x0

    goto :goto_21

    :cond_8
    :sswitch_43
    const v3, 0x170bf2

    goto :goto_22

    :sswitch_44
    :try_start_15
    invoke-static {v10}, Landroidx/emoji2/ۢۧۡۧ;->ۢۤۤۡ(Ljava/lang/Object;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_a

    :sswitch_45
    const v3, 0x170c30

    :goto_24
    const v4, 0x170c41

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_20

    goto :goto_24

    :sswitch_46
    const v3, 0x170fb3

    :goto_25
    const v4, 0x170fc4

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_21

    goto :goto_25

    :cond_9
    :sswitch_47
    const v3, 0x170ff1

    goto :goto_25

    :sswitch_48
    const v3, 0x170c4f

    goto :goto_24

    :catchall_a
    move-exception v3

    const v3, 0x170cac

    :goto_26
    const v4, 0x170cbd

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_22

    goto :goto_26

    :sswitch_49
    const v3, 0x170ccb

    goto :goto_26

    :sswitch_4a
    const/4 v3, 0x2

    if-ge v11, v3, :cond_9

    const v3, 0x171010

    goto :goto_25

    :sswitch_4b
    sget v3, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    int-to-long v8, v3

    const-wide/16 v16, 0xa2

    xor-long v8, v8, v16

    :try_start_16
    invoke-static {v8, v9}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۡۡۥۨ(J)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_b

    :sswitch_4c
    const v3, 0x17102f

    :goto_27
    const v4, 0x171040

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_23

    goto :goto_27

    :sswitch_4d
    sget v3, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v3, v3, 0x53

    add-int/2addr v3, v11

    const v4, 0x1713b2

    :goto_28
    const v6, 0x1713c3

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_24

    goto :goto_28

    :sswitch_4e
    move v11, v3

    goto/16 :goto_4

    :sswitch_4f
    const v3, 0x17104e

    goto :goto_27

    :catchall_b
    move-exception v3

    const v3, 0x1710ab

    :goto_29
    const v4, 0x1710bc

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_25

    goto :goto_29

    :sswitch_50
    const v3, 0x171355

    goto :goto_29

    :sswitch_51
    const v4, 0x1713d1

    goto :goto_28

    :catchall_c
    move-exception v2

    :sswitch_52
    :try_start_17
    invoke-static {v2}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۨۦۦ()[S

    move-result-object v5

    const/16 v6, 0x12d

    sget v7, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v7, v7, 0x11f

    const/16 v8, 0x2e1

    invoke-static {v5, v6, v7, v8}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۢۧۢ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v4, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/PPHook$2;->ۣۢۤۡ(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/PPHook$2;->ۡۢۢۧ()Landroid/os/Handler;

    move-result-object v3

    new-instance v4, Lkevin/fun/hook/PPHook$2$4;

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/PPHook$2;->۟ۧۥۣۤ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/PPHook$2;->ۦۣۧ۠(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$VerifyCallback;

    move-result-object v6

    move-object/from16 v0, p0

    invoke-direct {v4, v0, v5, v2, v6}, Lkevin/fun/hook/PPHook$2$4;-><init>(Lkevin/fun/hook/PPHook$2;Landroid/content/Context;Ljava/lang/Throwable;Lkevin/fun/hook/PPHook$VerifyCallback;)V

    invoke-static {v3, v4}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_e

    const v2, 0x17142e

    :goto_2a
    const v3, 0x17143f

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_26

    goto :goto_2a

    :sswitch_53
    if-eqz v10, :cond_a

    const v2, 0x171716

    goto :goto_2a

    :cond_a
    :sswitch_54
    const v2, 0x17146c

    goto :goto_2a

    :sswitch_55
    :try_start_18
    invoke-static {v10}, Landroidx/emoji2/ۢۧۡۧ;->ۢۤۤۡ(Ljava/lang/Object;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_d

    :sswitch_56
    const v2, 0x171735

    :goto_2b
    const v3, 0x171746

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_27

    goto :goto_2b

    :sswitch_57
    const v2, 0x171754

    goto :goto_2b

    :catchall_d
    move-exception v2

    const v2, 0x1717b1

    :goto_2c
    const v3, 0x1717c2

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_28

    goto :goto_2c

    :sswitch_58
    const v2, 0x1717d0

    goto :goto_2c

    :catchall_e
    move-exception v2

    const v3, 0x17182d

    :goto_2d
    const v4, 0x17183e

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_29

    goto :goto_2d

    :sswitch_59
    if-eqz v10, :cond_b

    const v3, 0x171b15

    goto :goto_2d

    :cond_b
    :sswitch_5a
    const v3, 0x171af6

    goto :goto_2d

    :sswitch_5b
    :try_start_19
    invoke-static {v10}, Landroidx/emoji2/ۢۧۡۧ;->ۢۤۤۡ(Ljava/lang/Object;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_f

    :sswitch_5c
    const v3, 0x171b34

    :goto_2e
    const v4, 0x171b45

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_2a

    goto :goto_2e

    :sswitch_5d
    throw v2

    :sswitch_5e
    const v3, 0x171b53

    goto :goto_2e

    :catchall_f
    move-exception v3

    const v3, 0x171bb0

    :goto_2f
    const v4, 0x171bc1

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_2b

    goto :goto_2f

    :sswitch_5f
    const v3, 0x171bcf

    goto :goto_2f

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_3
        0x1d7 -> :sswitch_2b
        0x1f4 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_2b
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_5
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_9
        0x35 -> :sswitch_17
        0x1f7 -> :sswitch_a
        0x7eef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_c
        0x32 -> :sswitch_d
        0x4c -> :sswitch_e
        0x53 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_f
        0xf1 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_10
        0x6af -> :sswitch_10
        0x6c8 -> :sswitch_2b
        0x6e9 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_15
        0x32 -> :sswitch_2b
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_14
        0xf3 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_18
        0x36 -> :sswitch_19
        0x57 -> :sswitch_1c
        0x74 -> :sswitch_1a
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :sswitch_data_b
    .sparse-switch
        0x17 -> :sswitch_1d
        0x36 -> :sswitch_1f
        0x55 -> :sswitch_2e
        0x74 -> :sswitch_20
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_1e
        0x7ab -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0xe -> :sswitch_21
        0x2d -> :sswitch_27
        0x3ef -> :sswitch_22
        0x1ef7 -> :sswitch_23
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0x11 -> :sswitch_25
        0x32 -> :sswitch_27
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_26
        0x32 -> :sswitch_24
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x3f1 -> :sswitch_28
        0x6a7 -> :sswitch_29
        0x6c8 -> :sswitch_2b
        0x6e9 -> :sswitch_2a
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x13 -> :sswitch_2c
        0x32 -> :sswitch_3f
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_2d
        0x32 -> :sswitch_3f
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x11 -> :sswitch_2f
        0x3e -> :sswitch_3f
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_30
        0x36 -> :sswitch_31
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_32
        0x5bb -> :sswitch_3f
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x1f -> :sswitch_33
        0x3e -> :sswitch_34
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x17 -> :sswitch_35
        0x36 -> :sswitch_36
        0x55 -> :sswitch_39
        0x17dd84 -> :sswitch_37
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0xe -> :sswitch_39
        0x6f -> :sswitch_3b
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0x11 -> :sswitch_3a
        0x72 -> :sswitch_3f
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0x17 -> :sswitch_3c
        0x76 -> :sswitch_38
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x1f -> :sswitch_3d
        0x5e9 -> :sswitch_52
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0x11 -> :sswitch_3e
        0x72 -> :sswitch_52
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x12 -> :sswitch_3f
        0x73 -> :sswitch_41
    .end sparse-switch

    :sswitch_data_1e
    .sparse-switch
        0x13 -> :sswitch_40
        0x2c8 -> :sswitch_46
        0x2e9 -> :sswitch_43
        0x52b -> :sswitch_44
    .end sparse-switch

    :sswitch_data_1f
    .sparse-switch
        0x13 -> :sswitch_42
        0x72 -> :sswitch_52
    .end sparse-switch

    :sswitch_data_20
    .sparse-switch
        0xe -> :sswitch_46
        0x71 -> :sswitch_48
    .end sparse-switch

    :sswitch_data_21
    .sparse-switch
        0x16 -> :sswitch_47
        0x35 -> :sswitch_4d
        0x77 -> :sswitch_4a
        0x1fd4 -> :sswitch_4b
    .end sparse-switch

    :sswitch_data_22
    .sparse-switch
        0x11 -> :sswitch_49
        0x76 -> :sswitch_45
    .end sparse-switch

    :sswitch_data_23
    .sparse-switch
        0xe -> :sswitch_4d
        0x6f -> :sswitch_4f
    .end sparse-switch

    :sswitch_data_24
    .sparse-switch
        0x12 -> :sswitch_4e
        0x71 -> :sswitch_51
    .end sparse-switch

    :sswitch_data_25
    .sparse-switch
        0x17 -> :sswitch_50
        0x3e9 -> :sswitch_4c
    .end sparse-switch

    :sswitch_data_26
    .sparse-switch
        0x11 -> :sswitch_53
        0x53 -> :sswitch_2b
        0x72 -> :sswitch_54
        0x329 -> :sswitch_55
    .end sparse-switch

    :sswitch_data_27
    .sparse-switch
        0x12 -> :sswitch_2b
        0x73 -> :sswitch_57
    .end sparse-switch

    :sswitch_data_28
    .sparse-switch
        0x12 -> :sswitch_56
        0x73 -> :sswitch_58
    .end sparse-switch

    :sswitch_data_29
    .sparse-switch
        0x13 -> :sswitch_59
        0x2c8 -> :sswitch_5d
        0x2e9 -> :sswitch_5a
        0x32b -> :sswitch_5b
    .end sparse-switch

    :sswitch_data_2a
    .sparse-switch
        0x16 -> :sswitch_5d
        0x71 -> :sswitch_5e
    .end sparse-switch

    :sswitch_data_2b
    .sparse-switch
        0xe -> :sswitch_5c
        0x71 -> :sswitch_5f
    .end sparse-switch
.end method

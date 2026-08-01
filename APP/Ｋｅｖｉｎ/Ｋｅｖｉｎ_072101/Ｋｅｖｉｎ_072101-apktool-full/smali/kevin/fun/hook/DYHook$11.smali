.class Lkevin/fun/hook/DYHook$11;
.super Lde/robv/android/xposed/XC_MethodHook;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook;->hookShareMenu(Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field final this$0:Lkevin/fun/hook/DYHook;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xc8

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DYHook$11;->short:[S

    return-void

    :array_0
    .array-data 2
        0x7ccs
        0x7c0s
        0x7c2s
        0x781s
        0x7dcs
        0x7dcs
        0x781s
        0x7ces
        0x7c1s
        0x7cbs
        0x7dds
        0x7c0s
        0x7c6s
        0x7cbs
        0x781s
        0x7das
        0x7c8s
        0x7ccs
        0x781s
        0x7ces
        0x7d8s
        0x7cas
        0x7c2s
        0x7cas
        0x781s
        0x7c6s
        0x7c2s
        0x781s
        0x7dcs
        0x7c7s
        0x7ces
        0x7dds
        0x7cas
        0x781s
        0x7dcs
        0x7c7s
        0x7ces
        0x7dds
        0x7cas
        0x7c3s
        0x7c6s
        0x7dcs
        0x7dbs
        0x781s
        0x7ccs
        0x7c0s
        0x7c1s
        0x7dbs
        0x7ces
        0x7ccs
        0x7dbs
        0x7dcs
        0x781s
        0x7e6s
        0x7e2s
        0x7fcs
        0x7c7s
        0x7ces
        0x7dds
        0x7cas
        0x7e9s
        0x7ces
        0x7c4s
        0x7cas
        0x7fds
        0x7cas
        0x7ccs
        0x7cas
        0x7c1s
        0x7dbs
        0x7ecs
        0x7c0s
        0x7c1s
        0x7dbs
        0x7ces
        0x7ccs
        0x7dbs
        0x3afs
        0x18ds
        0x181s
        0x183s
        0x1c0s
        0x19ds
        0x19ds
        0x1c0s
        0x18fs
        0x180s
        0x18as
        0x19cs
        0x181s
        0x187s
        0x18as
        0x1c0s
        0x19bs
        0x189s
        0x18ds
        0x1c0s
        0x18fs
        0x199s
        0x18bs
        0x183s
        0x18bs
        0x1c0s
        0x187s
        0x183s
        0x1c0s
        0x19ds
        0x18bs
        0x19cs
        0x198s
        0x187s
        0x18ds
        0x18bs
        0x1c0s
        0x183s
        0x181s
        0x18as
        0x18bs
        0x182s
        0x1c0s
        0x1a7s
        0x1a3s
        0x1bbs
        0x19ds
        0x18bs
        0x19cs
        0x61ds
        0x601s
        0x60cs
        0x1a5s
        0x1a9s
        0x1abs
        0x1e8s
        0x1b5s
        0x1b5s
        0x1e8s
        0x1a7s
        0x1a8s
        0x1a2s
        0x1b4s
        0x1a9s
        0x1afs
        0x1a2s
        0x1e8s
        0x1b3s
        0x1a1s
        0x1a5s
        0x1e8s
        0x1a7s
        0x1b1s
        0x1a3s
        0x1abs
        0x1a3s
        0x1e8s
        0x1afs
        0x1abs
        0x1e8s
        0x1b5s
        0x1a3s
        0x1b4s
        0x1b0s
        0x1afs
        0x1a5s
        0x1a3s
        0x1e8s
        0x1abs
        0x1a9s
        0x1a2s
        0x1a3s
        0x1aas
        0x1e8s
        0x18fs
        0x18bs
        0x185s
        0x1a9s
        0x1a8s
        0x1b0s
        0x1a3s
        0x1b4s
        0x1b5s
        0x1a7s
        0x1b2s
        0x1afs
        0x1a9s
        0x1a8s
        0x9e8s
        0x9c6s
        0x9eas
        0x9ebs
        0x9f3s
        0x9e0s
        0x9f7s
        0x9f6s
        0x9e4s
        0x9f1s
        0x9ecs
        0x9eas
        0x9ebs
        0x9ccs
        0x9e1s
    .end array-data
.end method

.method constructor <init>(Lkevin/fun/hook/DYHook;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/DYHook$11;->this$0:Lkevin/fun/hook/DYHook;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

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
    const-string v0, "gNUXoJNHGfAEg9aXs"

    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۥۧۨ۠(Ljava/lang/String;)Ljava/lang/String;

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

.method static synthetic access$0(Lkevin/fun/hook/DYHook$11;)Lkevin/fun/hook/DYHook;
    .locals 1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$11;->ۣ۟ۢۦ۠(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v0

    return-object v0
.end method

.method public static ۟ۢۢۥۧ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۢۥ۠()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$misGroupChatHidden(Lkevin/fun/hook/DYHook;Ljava/lang/String;)Z

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

.method public static ۣ۟ۢۦ۠(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;
    .locals 2

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۥۢۧۡ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$11;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$11;->this$0:Lkevin/fun/hook/DYHook;

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

.method public static ۠ۨۨۦ()[S
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۥۧۨ()I

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
    sget-object v0, Lkevin/fun/hook/DYHook$11;->short:[S

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

.method public static ۡۢ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۥۢۧۡ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$misUidHidden(Lkevin/fun/hook/DYHook;Ljava/lang/String;)Z

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

.method public static ۣۧۡۥ(Ljava/lang/Object;)Ljava/lang/Object;
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-virtual {p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

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

.method public static ۨۥۣۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/activity/ۨ۠۟ۧ;->ۤۥۡ۠()I

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
    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

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
.method protected afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-static {p1}, Lkevin/fun/hook/DYHook$11;->ۣۧۡۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۨۧۥ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const-string v0, "NUz1Kz5wM0rrcVqJpkn"

    invoke-static {v0}, Landroidx/loader/ۣ۟۟ۧ۠;->۟ۧ۠ۡۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :sswitch_6
    return-void

    :sswitch_7
    invoke-static {v0}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۧ۟ۥۦ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v2

    :sswitch_8
    invoke-static {v2}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    if-nez v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_a
    const v0, 0xbe41

    goto :goto_2

    :sswitch_b
    invoke-static {v2}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Landroidx/emoji2/ۢۧۡۧ;->۟ۤۤۨۢ(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/ۤۦ۟ۢ;->ۡۡۢۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DYHook$11;->۠ۨۨۦ()[S

    move-result-object v3

    const/4 v4, 0x0

    sget v5, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    xor-int/lit16 v5, v5, 0x153

    const/16 v6, 0x7af

    invoke-static {v3, v4, v5, v6}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v0, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_c
    const v0, 0xbebd

    goto :goto_3

    :sswitch_d
    if-eqz v3, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_e
    invoke-static {}, Lkevin/fun/hook/DYHook$11;->۠ۨۨۦ()[S

    move-result-object v0

    const/16 v3, 0x4d

    const/4 v4, 0x1

    const/16 v5, 0x3ce

    invoke-static {v0, v3, v4, v5}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lkevin/fun/hook/DYHook$11;->ۨۥۣۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const v1, 0xbefb

    :goto_4
    const v3, 0xbf0c

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :cond_4
    :sswitch_f
    const v1, 0xbf39

    goto :goto_4

    :sswitch_10
    if-eqz v0, :cond_4

    const v1, 0xc1e3

    goto :goto_4

    :sswitch_11
    new-instance v1, Lkevin/fun/hook/DYHook$11$1;

    invoke-direct {v1, p0}, Lkevin/fun/hook/DYHook$11$1;-><init>(Lkevin/fun/hook/DYHook$11;)V

    invoke-static {v0, v1}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟۠۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v0, 0xc202

    :goto_5
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_12
    const v0, 0xc221

    goto :goto_5

    :sswitch_13
    invoke-static {v1}, Landroidx/emoji2/ۢۧۡۧ;->۟ۤۤۨۢ(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/ۤۦ۟ۢ;->ۡۡۢۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DYHook$11;->۠ۨۨۦ()[S

    move-result-object v3

    const/16 v4, 0x4e

    sget v5, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v5, v5, -0x3f4

    const/16 v6, 0x1ee

    invoke-static {v3, v4, v5, v6}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v0, 0xc27e

    :goto_6
    const v4, 0xc28f

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :cond_5
    :sswitch_14
    const v0, 0xc2bc

    goto :goto_6

    :sswitch_15
    if-eqz v3, :cond_5

    const v0, 0xc2db

    goto :goto_6

    :sswitch_16
    invoke-static {}, Lkevin/fun/hook/DYHook$11;->۠ۨۨۦ()[S

    move-result-object v0

    const/16 v3, 0x7e

    sget v4, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v4, v4, 0x15c

    const/16 v5, 0x668

    invoke-static {v0, v3, v4, v5}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lkevin/fun/hook/DYHook$11;->ۨۥۣۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$11;->ۣ۟ۢۦ۠(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {v1, v0}, Lkevin/fun/hook/DYHook$11;->ۡۢ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc2fa

    :goto_7
    const v3, 0xc30b

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_7

    goto :goto_7

    :sswitch_17
    if-eqz v1, :cond_6

    const v0, 0xc5e2

    goto :goto_7

    :cond_6
    :sswitch_18
    const v0, 0xc5c3

    goto :goto_7

    :sswitch_19
    invoke-static {v2}, Landroidx/customview/ۤۡۥ;->ۧۤۢۦ(Ljava/lang/Object;)V

    const v0, 0xc601

    :goto_8
    const v1, 0xc612

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_8

    goto :goto_8

    :sswitch_1a
    const v0, 0xc620

    goto :goto_8

    :sswitch_1b
    invoke-static {v1}, Landroidx/emoji2/ۢۧۡۧ;->۟ۤۤۨۢ(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/ۤۦ۟ۢ;->ۡۡۢۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DYHook$11;->۠ۨۨۦ()[S

    move-result-object v3

    const/16 v4, 0x81

    sget v5, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v5, v5, -0x198

    const/16 v6, 0x1c6

    invoke-static {v3, v4, v5, v6}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v0, 0xc67d

    :goto_9
    const v4, 0xc68e

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_9

    goto :goto_9

    :cond_7
    :sswitch_1c
    const v0, 0xc6bb

    goto :goto_9

    :sswitch_1d
    if-eqz v3, :cond_7

    const v0, 0xc965

    goto :goto_9

    :sswitch_1e
    invoke-static {}, Lkevin/fun/hook/DYHook$11;->۠ۨۨۦ()[S

    move-result-object v0

    const/16 v3, 0xb9

    sget v4, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v4, v4, -0x3c

    const/16 v5, 0x985

    invoke-static {v0, v3, v4, v5}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lkevin/fun/hook/DYHook$11;->ۨۥۣۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const v1, 0xc984

    :goto_a
    const v3, 0xc995

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_a

    goto :goto_a

    :sswitch_1f
    if-eqz v0, :cond_8

    const v1, 0xc9e1

    goto :goto_a

    :cond_8
    :sswitch_20
    const v1, 0xc9c2

    goto :goto_a

    :sswitch_21
    invoke-static {v0}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v3

    const v1, 0xca00

    :goto_b
    const v4, 0xca11

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_b

    goto :goto_b

    :cond_9
    :sswitch_22
    const v1, 0xca3e

    goto :goto_b

    :sswitch_23
    if-nez v3, :cond_9

    const v1, 0xca5d

    goto :goto_b

    :sswitch_24
    invoke-static {p0}, Lkevin/fun/hook/DYHook$11;->ۣ۟ۢۦ۠(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static {v1, v0}, Lkevin/fun/hook/DYHook$11;->۟ۢۢۥۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xca7c

    :goto_c
    const v3, 0xca8d

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_c

    goto :goto_c

    :sswitch_25
    if-eqz v1, :cond_a

    const v0, 0xcd64

    goto :goto_c

    :cond_a
    :sswitch_26
    const v0, 0xcd45

    goto :goto_c

    :sswitch_27
    invoke-static {v2}, Landroidx/customview/ۤۡۥ;->ۧۤۢۦ(Ljava/lang/Object;)V

    const v0, 0xcd83

    :goto_d
    const v1, 0xcd94

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_d

    goto :goto_d

    :sswitch_28
    const v0, 0xcda2

    goto :goto_d

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_6
        0xb97b -> :sswitch_a
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_c
        0x2d -> :sswitch_13
        0x4c -> :sswitch_e
        0xef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_f
        0x35 -> :sswitch_8
        0x1f7 -> :sswitch_10
        0x7eef -> :sswitch_11
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_12
        0x32 -> :sswitch_8
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_14
        0x33 -> :sswitch_1b
        0x54 -> :sswitch_16
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_17
        0x6af -> :sswitch_18
        0x6c8 -> :sswitch_8
        0x6e9 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1a
        0x32 -> :sswitch_8
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1c
        0x35 -> :sswitch_8
        0xf3 -> :sswitch_1d
        0xfeb -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1f
        0x36 -> :sswitch_20
        0x57 -> :sswitch_8
        0x74 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_22
        0x11 -> :sswitch_23
        0x2f -> :sswitch_8
        0x4c -> :sswitch_24
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_25
        0x7ab -> :sswitch_26
        0x7c8 -> :sswitch_8
        0x7e9 -> :sswitch_27
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_28
        0x36 -> :sswitch_8
    .end sparse-switch
.end method

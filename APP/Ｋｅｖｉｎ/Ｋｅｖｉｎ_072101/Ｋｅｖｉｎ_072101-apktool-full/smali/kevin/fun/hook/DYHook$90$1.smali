.class Lkevin/fun/hook/DYHook$90$1;
.super Lde/robv/android/xposed/XC_MethodHook;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook$90;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field final this$1:Lkevin/fun/hook/DYHook$90;

.field private final val$holder:[Lde/robv/android/xposed/XC_MethodHook$Unhook;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8c

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DYHook$90$1;->short:[S

    return-void

    :array_0
    .array-data 2
        0x913s
        0x911s
        0x900s
        0x93as
        0x91ds
        0x917s
        0x91fs
        0x91as
        0x915s
        0x919s
        0x911s
        0x60ds
        0x616s
        0x611s
        0x609s
        0x60ds
        0x61ds
        0x631s
        0x61cs
        0x280s
        0x282s
        0x293s
        0x2b2s
        0x28es
        0x283s
        0x3715s
        0x74es
        0x760s
        0x773s
        0x76cs
        0x76bs
        0x3714s
        -0x7302s
        0x54d3s
        0x770s
        0x76cs
        0x761s
        0x5e34s
        -0x75e0s
        0x70fs
        0x3b7cs
        0xb27s
        0xb09s
        0xb1as
        0xb05s
        0xb02s
        0x3b7ds
        -0x7f69s
        0x58bas
        0x7e44s
        0x695bs
        0x448ds
        0x6b03s
        0x525ds
        -0x79b7s
        0xb66s
        0x746s
        0x751s
        0x746s
        0x753s
        0x746s
        0x755s
        0x773s
        0x74fs
        0x752s
        0x74as
        0x745s
        0x4a0s
        0x4a7s
        0x4b9s
        0x499s
        0x4bcs
        0x4a6s
        0x4a1s
        0x3a62s
        0xa39s
        0xa17s
        0xa04s
        0xa1bs
        0xa1cs
        0x3a63s
        0xa52s
        -0x763bs
        0x59a4s
        0x7f5as
        0x6845s
        0x5346s
        0x5abds
        0x5343s
        -0x78a9s
        0xa48s
        0xa52s
        0x32e9s
        0x2b2s
        0x29cs
        0x28fs
        0x290s
        0x297s
        0x32e8s
        0x28cs
        0x297s
        0x291s
        0x296s
        0x296s
        0x292s
        0x2d9s
        0x5bc8s
        -0x7024s
        0x2f3s
        0x36bcs
        0x6e7s
        0x6c9s
        0x6das
        0x6c5s
        0x6c2s
        0x36bds
        0x6cds
        0x6cas
        0x6d8s
        0x6c9s
        0x6des
        0x6e4s
        0x6c3s
        0x6c3s
        0x6c7s
        0x6c9s
        0x6c8s
        0x6e1s
        0x6c9s
        0x6d8s
        0x6c4s
        0x6c3s
        0x6c8s
        0x68cs
        0x5729s
        -0x69bcs
        0x59aes
        0x5894s
        0x696s
        0x68cs
    .end array-data
.end method

.method constructor <init>(Lkevin/fun/hook/DYHook$90;[Lde/robv/android/xposed/XC_MethodHook$Unhook;)V
    .locals 3

    iput-object p1, p0, Lkevin/fun/hook/DYHook$90$1;->this$1:Lkevin/fun/hook/DYHook$90;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$90$1;->val$holder:[Lde/robv/android/xposed/XC_MethodHook$Unhook;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    invoke-static {}, Landroidx/startup/ۤۧۥۣ;->۟۠ۨۢۡ()I

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
    const-string v0, "wAApOfn1LuFklMcQF17LraDtIs"

    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۥۧۨ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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

.method public static ۟۟ۧۡۨ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/activity/ۣۦۡۥ;->ۦۧۥۨ()I

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
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/DYHook;->_$$Nest$sfputiuserNickname(Ljava/lang/String;)V

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

.method public static ۟ۡۡۨۨ()Ljava/lang/String;
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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/DYHook;->_$$Nest$sfgetiuserNickname()Ljava/lang/String;

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

.method public static ۟ۡۥ۟ۨ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۡۥۣ()I

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

.method public static ۟ۢ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p1, Ljava/lang/String;

    check-cast p2, [Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

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

.method public static ۟ۥۣۡۧ()[S
    .locals 2

    invoke-static {}, Landroidx/core/ۧ۟ۤۨ;->۟ۦ۠ۢ()I

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
    sget-object v0, Lkevin/fun/hook/DYHook$90$1;->short:[S

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

.method public static ۟ۧۧۦۢ(Ljava/lang/Object;)V
    .locals 2

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

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

.method public static ۠ۧۥۢ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۥۢ()I

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
    check-cast p0, Lde/robv/android/xposed/XC_MethodHook$Unhook;

    invoke-virtual {p0}, Lde/robv/android/xposed/XC_MethodHook$Unhook;->unhook()V

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

.method public static ۣۢ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    if-gtz v1, :cond_0

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

.method public static ۤ۟ۤۥ(Ljava/lang/Object;)[Lde/robv/android/xposed/XC_MethodHook$Unhook;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢ۠ۨ۟()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$90$1;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$90$1;->val$holder:[Lde/robv/android/xposed/XC_MethodHook$Unhook;

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

.method public static ۥۢ۠ۧ(Ljava/lang/Object;)V
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
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/DYHook;->_$$Nest$sfputiuserAvatar(Ljava/lang/String;)V

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

.method public static ۥۦۢۦ(Ljava/lang/Object;)V
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/DYHook;->_$$Nest$sfputiuserAccount(Ljava/lang/String;)V

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
.method protected afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    :try_start_0
    invoke-static {p1}, Lkevin/fun/hook/DYHook$90$1;->۟ۡۥ۟ۨ(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    move-result-object v1

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
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    :try_start_1
    invoke-static {}, Lkevin/fun/hook/DYHook$90$1;->۟ۥۣۡۧ()[S

    move-result-object v0

    const/4 v2, 0x0

    sget v3, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v3, v3, -0x42

    const/16 v4, 0x974

    invoke-static {v0, v2, v3, v4}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lkevin/fun/hook/DYHook$90$1;->۟ۢ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۡۢ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$90$1;->۟۟ۧۡۨ(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/DYHook$90$1;->۟ۥۣۡۧ()[S

    move-result-object v0

    const/16 v2, 0xb

    sget v3, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v3, v3, -0x1b6

    const/16 v4, 0x678

    invoke-static {v0, v2, v3, v4}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lkevin/fun/hook/DYHook$90$1;->ۣۢ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lkevin/fun/hook/DYHook$90$1;->ۥۦۢۦ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {}, Lkevin/fun/hook/DYHook$90$1;->۟ۥۣۡۧ()[S

    move-result-object v0

    const/16 v2, 0x13

    sget v3, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v3, v3, 0x3a6

    const/16 v4, 0x2e7

    invoke-static {v0, v2, v3, v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lkevin/fun/hook/DYHook$90$1;->۟ۢ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۡۢ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/DYHook;->iuserUid:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_3
    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lkevin/fun/hook/DYHook;->iuserUid:Ljava/lang/String;

    invoke-static {v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$90$1;->۟ۥۣۡۧ()[S

    move-result-object v3

    const/16 v4, 0x19

    sget v5, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v5, v5, 0x221

    const/16 v6, 0x705

    invoke-static {v3, v4, v5, v6}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$90$1;->۟ۧۧۦۢ(Ljava/lang/Object;)V

    :sswitch_4
    invoke-static {}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۨۤ()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DYHook$90$1;->۟ۡۡۨۨ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/appcompat/ۣۧۤۢ;->ۤۧ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    const v0, 0xbe22

    goto :goto_2

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-static {v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$90$1;->۟ۥۣۡۧ()[S

    move-result-object v3

    const/16 v4, 0x28

    sget v5, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v5, v5, 0x21e

    const/16 v6, 0xb6c

    invoke-static {v3, v4, v5, v6}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$90$1;->۟ۧۧۦۢ(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :sswitch_6
    :try_start_5
    invoke-static {}, Lkevin/fun/hook/DYHook$90$1;->۟ۥۣۡۧ()[S

    move-result-object v0

    const/16 v2, 0x38

    sget v3, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v3, v3, -0x66

    const/16 v4, 0x727

    invoke-static {v0, v2, v3, v4}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۨۢ۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lkevin/fun/hook/DYHook$90$1;->ۣۢ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_1
    :sswitch_7
    const v0, 0xbebd

    goto :goto_3

    :sswitch_8
    if-eqz v1, :cond_1

    const v0, 0xbedc

    goto :goto_3

    :sswitch_9
    invoke-static {}, Lkevin/fun/hook/DYHook$90$1;->۟ۥۣۡۧ()[S

    move-result-object v0

    const/16 v2, 0x43

    sget v3, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v3, v3, 0x332

    const/16 v4, 0x4d5

    invoke-static {v0, v2, v3, v4}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lkevin/fun/hook/DYHook$90$1;->ۣۢ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/util/List;

    const v1, 0xbefb

    :goto_4
    const v3, 0xbf0c

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :cond_2
    :sswitch_a
    const v1, 0xbf39

    goto :goto_4

    :sswitch_b
    if-eqz v2, :cond_2

    const v1, 0xc1e3

    goto :goto_4

    :sswitch_c
    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Landroidx/activity/ۤۧۧۧ;->ۡۥۦۦ(Ljava/lang/Object;)Z

    move-result v2

    const v1, 0xc202

    :goto_5
    const v3, 0xc213

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_5

    goto :goto_5

    :sswitch_d
    if-nez v2, :cond_3

    const v1, 0xc25f

    goto :goto_5

    :cond_3
    :sswitch_e
    const v1, 0xc240

    goto :goto_5

    :sswitch_f
    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۦۣ۟۠(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Landroidx/startup/ۤۧۥۣ;->۟۠ۧۨۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$90$1;->ۥۢ۠ۧ(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    const v0, 0xc27e

    :goto_6
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :goto_7
    :sswitch_10
    :try_start_6
    invoke-static {p0}, Lkevin/fun/hook/DYHook$90$1;->ۤ۟ۤۥ(Ljava/lang/Object;)[Lde/robv/android/xposed/XC_MethodHook$Unhook;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v1, v0, v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    const v0, 0xc2fa

    :goto_8
    const v2, 0xc30b

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_11
    if-eqz v1, :cond_4

    const v0, 0xc5e2

    goto :goto_8

    :sswitch_12
    const v0, 0xc29d

    goto :goto_6

    :catchall_2
    move-exception v0

    :try_start_7
    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$90$1;->۟ۥۣۡۧ()[S

    move-result-object v2

    const/16 v3, 0x4a

    sget v4, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v4, v4, -0x71

    const/16 v5, 0xa72

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$90$1;->۟ۧۧۦۢ(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_7

    :catchall_3
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$90$1;->۟ۥۣۡۧ()[S

    move-result-object v2

    const/16 v3, 0x6d

    sget v4, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v4, v4, -0x56

    const/16 v5, 0x6ac

    invoke-static {v2, v3, v4, v5}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$90$1;->۟ۧۧۦۢ(Ljava/lang/Object;)V

    :sswitch_13
    return-void

    :cond_4
    :sswitch_14
    const v0, 0xc5c3

    goto :goto_8

    :sswitch_15
    :try_start_8
    invoke-static {p0}, Lkevin/fun/hook/DYHook$90$1;->ۤ۟ۤۥ(Ljava/lang/Object;)[Lde/robv/android/xposed/XC_MethodHook$Unhook;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Lkevin/fun/hook/DYHook$90$1;->۠ۧۥۢ(Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    const v0, 0xc601

    :goto_9
    const v1, 0xc612

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_8

    goto :goto_9

    :sswitch_16
    const v0, 0xc620

    goto :goto_9

    :catchall_4
    move-exception v0

    :try_start_9
    invoke-static {v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$90$1;->۟ۥۣۡۧ()[S

    move-result-object v2

    const/16 v3, 0x5c

    sget v4, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v4, v4, -0x334

    const/16 v5, 0x2f9

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$90$1;->۟ۧۧۦۢ(Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    const v0, 0xc67d

    :goto_a
    const v1, 0xc68e

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_9

    goto :goto_a

    :sswitch_17
    const v0, 0xc69c

    goto :goto_a

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_13
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb97b -> :sswitch_6
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_7
        0x2d -> :sswitch_10
        0x4c -> :sswitch_9
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_a
        0x35 -> :sswitch_10
        0x1f7 -> :sswitch_b
        0x7eef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_d
        0x32 -> :sswitch_e
        0x4c -> :sswitch_f
        0x53 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_10
        0xf1 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_11
        0x6af -> :sswitch_14
        0x6c8 -> :sswitch_13
        0x6e9 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_16
        0x32 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_13
        0xf3 -> :sswitch_17
    .end sparse-switch
.end method

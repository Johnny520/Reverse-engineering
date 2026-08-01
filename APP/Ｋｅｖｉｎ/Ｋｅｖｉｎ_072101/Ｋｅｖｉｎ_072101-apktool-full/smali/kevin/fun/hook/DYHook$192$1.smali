.class Lkevin/fun/hook/DYHook$192$1;
.super Ljava/lang/Object;

# interfaces
.implements Lkevin/fun/hook/DYHook$VoiceSendCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook$192;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field final this$1:Lkevin/fun/hook/DYHook$192;

.field private final val$context:Landroid/content/Context;

.field private final val$originalArgs:[Ljava/lang/Object;

.field private final val$originalMethod:Ljava/lang/reflect/Method;

.field private final val$originalThis:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x52

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DYHook$192$1;->short:[S

    return-void

    :array_0
    .array-data 2
        0x3cb3s
        0xce8s
        0xcc6s
        0xcd5s
        0xccas
        0xccds
        0x3cb2s
        0x6a5cs
        0x6fc1s
        0x58ads
        -0x7f60s
        0x798bs
        0x5f3cs
        0x691as
        0x6076s
        0x5592s
        -0x7e7as
        0xc99s
        0xc83s
        0x675s
        0x63es
        0x63bs
        0x62es
        0x63bs
        0x675s
        0x62fs
        0x629s
        0x63fs
        0x628s
        0x675s
        0x66as
        0x675s
        0x639s
        0x635s
        0x637s
        0x674s
        0x629s
        0x629s
        0x674s
        0x63bs
        0x634s
        0x63es
        0x628s
        0x635s
        0x633s
        0x63es
        0x674s
        0x62fs
        0x63ds
        0x639s
        0x674s
        0x63bs
        0x62ds
        0x63fs
        0x637s
        0x63fs
        0x675s
        0x63cs
        0x633s
        0x636s
        0x63fs
        0x629s
        0x675s
        0x633s
        0x637s
        0x675s
        0x3aa8s
        0xaf3s
        0xadds
        0xaces
        0xad1s
        0xad6s
        0x3aa9s
        -0x7945s
        0x7f90s
        0x5927s
        0x6f01s
        0x666ds
        0x5389s
        -0x7863s
        0xa82s
        0xa98s
    .end array-data
.end method

.method constructor <init>(Lkevin/fun/hook/DYHook$192;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;Landroid/content/Context;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/DYHook$192$1;->this$1:Lkevin/fun/hook/DYHook$192;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$192$1;->val$originalMethod:Ljava/lang/reflect/Method;

    iput-object p3, p0, Lkevin/fun/hook/DYHook$192$1;->val$originalThis:Ljava/lang/Object;

    iput-object p4, p0, Lkevin/fun/hook/DYHook$192$1;->val$originalArgs:[Ljava/lang/Object;

    iput-object p5, p0, Lkevin/fun/hook/DYHook$192$1;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۤۦ۟()I

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
    const-string v0, "vXie3"

    invoke-static {v0}, Landroidx/core/ۧ۟ۤۨ;->ۡۤ۠(Ljava/lang/String;)Ljava/lang/String;

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

.method static synthetic lambda$0(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 6

    :try_start_0
    invoke-static {p0, p1, p2}, Lkevin/fun/hook/DYHook$192$1;->۟۟ۤۥۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :goto_1
    :sswitch_0
    return-void

    :sswitch_1
    const/16 v0, 0x66f

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$192$1;->۟۟۟ۥۣ()[S

    move-result-object v2

    const/4 v3, 0x0

    sget v4, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v4, v4, -0x28

    const/16 v5, 0xca3

    invoke-static {v2, v3, v4, v5}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۠ۤۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$192$1;->ۢۥۨۡ(Ljava/lang/Object;)V

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch
.end method

.method public static ۟۟۟ۥۣ()[S
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
    sget-object v0, Lkevin/fun/hook/DYHook$192$1;->short:[S

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

.method public static ۟۟ۤۥۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۠()I

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
    check-cast p0, Ljava/lang/reflect/Member;

    check-cast p2, [Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Lde/robv/android/xposed/XposedBridge;->invokeOriginalMethod(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

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

.method public static ۟ۢۤ۟۠(Ljava/lang/Object;)Ljava/lang/reflect/Method;
    .locals 2

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$192$1;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$192$1;->val$originalMethod:Ljava/lang/reflect/Method;

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

.method public static ۟ۦ۠ۧ۠(Ljava/lang/Object;)Ljava/lang/Object;
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
    check-cast p0, Lkevin/fun/hook/DYHook$192$1;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$192$1;->val$originalThis:Ljava/lang/Object;

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

.method public static ۟ۧۧ۠ۢ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۨۧۥ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$192$1;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$192$1;->val$context:Landroid/content/Context;

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

.method public static ۢۥۨۡ(Ljava/lang/Object;)V
    .locals 3

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

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
    invoke-static {}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۤ۠ۧۡ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "mzHxqBsMXjvac9qk40"

    invoke-static {v0}, Landroidx/emoji2/ۢۧۡۧ;->ۣۢ۠ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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

.method public static ۤۥ۟ۢ(Ljava/lang/Object;)[Ljava/lang/Object;
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
    check-cast p0, Lkevin/fun/hook/DYHook$192$1;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$192$1;->val$originalArgs:[Ljava/lang/Object;

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
.method public onCancel()V
    .locals 0

    return-void
.end method

.method public onReplace()V
    .locals 12

    const/4 v10, 0x0

    const/4 v1, 0x0

    const-string v8, "\u06e0\u06e1\u06e1"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move v9, v10

    move v11, v10

    :goto_0
    invoke-static {v8}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    return-void

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/DYHook$192$1;->ۤۥ۟ۢ(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    const-string v8, "\u06e3\u06e1\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    xor-int/lit16 v9, v11, 0x2a2

    const-string v1, "\u06e8\u06df\u06e8"

    move-object v8, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DYHook$192$1;->۟ۦ۠ۧ۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v8, "\u06df\u06df\u06df"

    move-object v6, v1

    goto :goto_0

    :sswitch_3
    new-instance v1, Lkevin/fun/hook/DYHook$192$1$$ExternalSyntheticLambda0;

    invoke-direct {v1, v5, v6, v3}, Lkevin/fun/hook/DYHook$192$1$$ExternalSyntheticLambda0;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)V

    const-string v8, "\u06e3\u06e4\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/DYHook$192$1;->۟۟۟ۥۣ()[S

    move-result-object v0

    const-string v1, "\u06e2\u06e6\u06e8"

    move-object v8, v1

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/DYHook$192$1;->۟ۢۤ۟۠(Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    const-string v8, "\u06e5\u06e3\u06e1"

    move-object v5, v1

    goto :goto_0

    :sswitch_6
    const/16 v1, 0x13

    const/16 v2, 0x65a

    invoke-static {v0, v1, v9, v2}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v8, "\u06e8\u06e8\u06e1"

    move-object v2, v1

    goto :goto_0

    :sswitch_7
    invoke-static {v7, v2}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۣۢۢۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e4\u06e0\u06e5"

    move-object v8, v1

    goto :goto_0

    :sswitch_8
    invoke-static {v4}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟۟۟ۡۤ(Ljava/lang/Object;)V

    const-string v1, "\u06e1\u06e3\u06e6"

    move-object v8, v1

    goto :goto_0

    :sswitch_9
    invoke-static {p0}, Lkevin/fun/hook/DYHook$192$1;->۟ۧۧ۠ۢ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    const-string v8, "\u06e2\u06e6\u06e7"

    move-object v7, v1

    goto :goto_0

    :sswitch_a
    sget v10, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    const-string v1, "\u06e6\u06e0\u06e6"

    move-object v8, v1

    move v11, v10

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa6ff -> :sswitch_0
        0x1aab00 -> :sswitch_5
        0x1aaf04 -> :sswitch_9
        0x1ab323 -> :sswitch_4
        0x1ab324 -> :sswitch_a
        0x1ab643 -> :sswitch_3
        0x1ab6a7 -> :sswitch_8
        0x1abe03 -> :sswitch_2
        0x1ac16c -> :sswitch_1
        0x1ac8d1 -> :sswitch_6
        0x1ac9e1 -> :sswitch_7
    .end sparse-switch
.end method

.method public onSendOriginal()V
    .locals 6

    :try_start_0
    invoke-static {p0}, Lkevin/fun/hook/DYHook$192$1;->۟ۢۤ۟۠(Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {p0}, Lkevin/fun/hook/DYHook$192$1;->۟ۦ۠ۧ۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$192$1;->ۤۥ۟ۢ(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lkevin/fun/hook/DYHook$192$1;->۟۟ۤۥۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :goto_1
    :sswitch_0
    return-void

    :sswitch_1
    const/16 v0, 0x66f

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$192$1;->۟۟۟ۥۣ()[S

    move-result-object v2

    const/16 v3, 0x42

    sget v4, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    xor-int/lit16 v4, v4, 0x10e

    const/16 v5, 0xab8

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$192$1;->ۢۥۨۡ(Ljava/lang/Object;)V

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch
.end method

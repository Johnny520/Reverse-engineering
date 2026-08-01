.class Lkevin/fun/hook/DYHook$160$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook$160;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field final this$1:Lkevin/fun/hook/DYHook$160;

.field private final val$finalTarget:Landroid/view/View;

.field private final val$startTime:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xd

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DYHook$160$1;->short:[S

    return-void

    :array_0
    .array-data 2
        0xa95s
        0xaa3s
        0xaaas
        0xaa0s
        0xaebs
        0xaa2s
        0xaa3s
        0xab5s
        0xab2s
        0xab4s
        0xab3s
        0xaa5s
        0xab2s
    .end array-data
.end method

.method constructor <init>(Lkevin/fun/hook/DYHook$160;Landroid/view/View;J)V
    .locals 3

    iput-object p1, p0, Lkevin/fun/hook/DYHook$160$1;->this$1:Lkevin/fun/hook/DYHook$160;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$160$1;->val$finalTarget:Landroid/view/View;

    iput-wide p3, p0, Lkevin/fun/hook/DYHook$160$1;->val$startTime:J

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
    const-string v0, "HfmwINsLrC0yqGA23Ol9tLLvxk"

    invoke-static {v0}, Landroidx/activity/ۣۦۡۥ;->۟۟ۥۧۥ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۡۥۦۤ(Ljava/lang/Object;)Landroid/os/Handler;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۡۢۦ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    invoke-static {p0}, Lkevin/fun/hook/DYHook;->_$$Nest$fgetshakeHandler(Lkevin/fun/hook/DYHook;)Landroid/os/Handler;

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

.method public static ۟ۥۡۡۨ(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۣ۠ۦۤ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$160$1;

    iget-wide v0, p0, Lkevin/fun/hook/DYHook$160$1;->val$startTime:J

    :sswitch_3
    return-wide v0

    :sswitch_4
    const-wide/16 v0, 0x0

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v2, 0x6eb

    goto :goto_1

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

.method public static ۤ۠۠ۦ()[S
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠ۦۤۦ()I

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
    sget-object v0, Lkevin/fun/hook/DYHook$160$1;->short:[S

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

.method public static ۤۡۨۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook$160;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠ۦۤۦ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$160$1;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$160$1;->this$1:Lkevin/fun/hook/DYHook$160;

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

.method public static ۦۣۤۨ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;
    .locals 2

    invoke-static {}, Landroidx/loader/ۥۧۨۤ;->ۣۡۧۨ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$160;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$160;->access$0(Lkevin/fun/hook/DYHook$160;)Lkevin/fun/hook/DYHook;

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

.method public static ۨۥۢۦ(Ljava/lang/Object;)Landroid/view/View;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۢۦ۠()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$160$1;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$160$1;->val$finalTarget:Landroid/view/View;

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
    .locals 8

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/DYHook$160$1;->ۤ۠۠ۦ()[S

    move-result-object v0

    const/4 v1, 0x0

    sget v2, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    xor-int/lit16 v2, v2, 0x356

    const/16 v3, 0xac6

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

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
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DYHook$160$1;->ۨۥۢۦ(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢۤۧۡ(Ljava/lang/Object;F)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$160$1;->ۨۥۢۦ(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->۟ۦۢۥۤ(Ljava/lang/Object;F)V

    :goto_1
    :sswitch_3
    return-void

    :sswitch_4
    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۦۡ۠ۡ()J

    move-result-wide v2

    invoke-static {p0}, Lkevin/fun/hook/DYHook$160$1;->۟ۥۡۡۨ(Ljava/lang/Object;)J

    move-result-wide v4

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_5
    sub-long v0, v2, v4

    const-wide/16 v6, 0x1388

    cmp-long v0, v0, v6

    if-ltz v0, :cond_1

    const/16 v0, 0x729

    goto :goto_2

    :cond_1
    :sswitch_6
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_7
    invoke-static {p0}, Lkevin/fun/hook/DYHook$160$1;->ۨۥۢۦ(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Landroidx/startup/۟ۦۤۨۧ;->ۣ۟ۡۤ(Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۨ۟۠ۦ(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/loader/ۣ۟۟ۧ۠;->ۤۢ۠ۥ(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/startup/۟ۦۤۨۧ;->ۣۢۢۡ(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v2, 0x21f

    sget v1, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    int-to-long v4, v1

    xor-long/2addr v2, v4

    invoke-static {v0, v2, v3}, Landroidx/loader/ۥۧۨۤ;->ۣۣۧ۠(Ljava/lang/Object;J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۤ۟ۥ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    :sswitch_8
    invoke-static {}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۢۢۥ()I

    move-result v1

    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    :try_start_1
    invoke-static {}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۣۣ۟()D

    move-result-wide v0

    const-wide v2, 0x4061800000000000L    # 140.0

    mul-double/2addr v0, v2

    const-wide v2, 0x4051800000000000L    # 70.0

    sub-double/2addr v0, v2

    double-to-float v0, v0

    invoke-static {}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۣۣ۟()D

    move-result-wide v2

    const-wide/high16 v4, 0x4054000000000000L    # 80.0

    mul-double/2addr v2, v4

    const-wide/high16 v4, 0x4044000000000000L    # 40.0

    sub-double/2addr v2, v4

    double-to-float v1, v2

    invoke-static {}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۣۣ۟()D

    move-result-wide v2

    const-wide/high16 v4, 0x4028000000000000L    # 12.0

    mul-double/2addr v2, v4

    const-wide/high16 v4, 0x4018000000000000L    # 6.0

    sub-double/2addr v2, v4

    double-to-float v2, v2

    invoke-static {p0}, Lkevin/fun/hook/DYHook$160$1;->ۨۥۢۦ(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v3

    invoke-static {v3, v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢۤۧۡ(Ljava/lang/Object;F)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$160$1;->ۨۥۢۦ(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->۟ۦۢۥۤ(Ljava/lang/Object;F)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$160$1;->ۨۥۢۦ(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v2}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۧۤ۠۟(Ljava/lang/Object;F)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$160$1;->ۤۡۨۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook$160;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$160$1;->ۦۣۤۨ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$160$1;->۟ۡۥۦۤ(Ljava/lang/Object;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v2, -0x143

    sget v1, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    int-to-long v4, v1

    xor-long/2addr v2, v4

    invoke-static {v0, p0, v2, v3}, Landroidx/loader/۟۠ۢۧۡ;->ۣۤۧۢ(Ljava/lang/Object;Ljava/lang/Object;J)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/16 v0, 0x748

    :goto_4
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :sswitch_b
    const v0, 0xbe22

    goto :goto_4

    :sswitch_c
    if-gtz v1, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_d
    const-string v0, "dvc9b6FrT06I"

    invoke-static {v0}, Landroidx/loader/ۡۢۢ;->ۨۦۦۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto/16 :goto_1

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
        0x36 -> :sswitch_6
        0x1d7 -> :sswitch_a
        0x1f4 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_3
        0x4c -> :sswitch_d
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0x11 -> :sswitch_b
        0xb97b -> :sswitch_8
    .end sparse-switch
.end method

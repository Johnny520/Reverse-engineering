.class Lkevin/fun/hook/DYHook$27;
.super Lde/robv/android/xposed/XC_MethodHook;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook;->hookBottomSpace(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
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

    const/16 v0, 0x1d

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DYHook$27;->short:[S

    return-void

    :array_0
    .array-data 2
        0x364s
        0x34as
        0x359s
        0x346s
        0x341s
        0x30fs
        0x349s
        0x340s
        0x35ds
        0x34cs
        0x34as
        0x30fs
        0x347s
        0x346s
        0x34bs
        0x34as
        0x30fs
        0x34ds
        0x340s
        0x35bs
        0x35bs
        0x340s
        0x342s
        0x30fs
        0x35cs
        0x35fs
        0x34es
        0x34cs
        0x34as
    .end array-data
.end method

.method constructor <init>(Lkevin/fun/hook/DYHook;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/DYHook$27;->this$0:Lkevin/fun/hook/DYHook;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "I3GR1iu2vBnUcetG5d1Qw"

    invoke-static {v0}, Landroidx/customview/ۤۡۥ;->ۥۣۢۨ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۤۧۦۧ()[S
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
    sget-object v0, Lkevin/fun/hook/DYHook$27;->short:[S

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

.method public static ۣۡۢۤ(Ljava/lang/Object;)[Ljava/lang/Object;
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
    check-cast p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    iget-object v0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

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
.method protected beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v6, "\u06e0\u06e0\u06e5"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move v7, v8

    move v9, v8

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    return-void

    :sswitch_0
    invoke-static {}, Lkevin/fun/hook/DYHook$27;->۟ۤۧۦۧ()[S

    move-result-object v1

    const-string v6, "\u06e3\u06e2\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    sget v9, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    const-string v1, "\u06e6\u06e8\u06e1"

    move-object v6, v1

    goto :goto_0

    :sswitch_2
    xor-int/lit16 v7, v9, 0x104

    const-string v1, "\u06e4\u06df\u06e1"

    move-object v6, v1

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v7, v9, 0x310

    const-string v1, "\u06e6\u06e7\u06e4"

    move-object v6, v1

    goto :goto_0

    :sswitch_4
    const/16 v1, 0x32f

    invoke-static {v3, v8, v7, v1}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e3\u06e7\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_5
    invoke-static {p1}, Lkevin/fun/hook/DYHook$27;->ۣۡۢۤ(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "\u06e6\u06e0\u06e2"

    move-object v6, v1

    goto :goto_0

    :sswitch_6
    sget v9, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    const-string v1, "\u06e8\u06e1\u06e6"

    move-object v6, v1

    goto :goto_0

    :sswitch_7
    invoke-static {v7}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v6, "\u06e5\u06e4\u06e4"

    move-object v2, v1

    goto :goto_0

    :sswitch_8
    const/4 v1, 0x1

    aput-object v4, v0, v1

    const-string v1, "\u06e6\u06e7"

    move-object v6, v1

    goto :goto_0

    :sswitch_9
    invoke-static {p1}, Lkevin/fun/hook/DYHook$27;->ۣۡۢۤ(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    const-string v6, "\u06e3\u06e3\u06df"

    move-object v5, v1

    goto :goto_0

    :sswitch_a
    aput-object v2, v5, v8

    const-string v1, "\u06e1\u06e3\u06e3"

    move-object v6, v1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aaae5 -> :sswitch_9
        0x1aaf01 -> :sswitch_5
        0x1ab661 -> :sswitch_6
        0x1ab67f -> :sswitch_1
        0x1ab704 -> :sswitch_8
        0x1ab9c6 -> :sswitch_7
        0x1abe25 -> :sswitch_a
        0x1ac168 -> :sswitch_0
        0x1ac243 -> :sswitch_4
        0x1ac25f -> :sswitch_2
        0x1ac90d -> :sswitch_3
    .end sparse-switch
.end method

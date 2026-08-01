.class Lkevin/fun/hook/DYHook$132;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook;->buildAllSettingsContentWithPositions(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Landroid/content/Context;Landroid/widget/LinearLayout;Landroid/app/Dialog;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field final this$0:Lkevin/fun/hook/DYHook;

.field private final val$ctx:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x19

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DYHook$132;->short:[S

    return-void

    :array_0
    .array-data 2
        -0x7cdfs
        -0x7ca1s
        0x6d13s
        -0x62efs
        0x60d9s
        0x57eas
        0xcfbs
        0xcf7s
        0xcf5s
        0xcf5s
        0xcfds
        0xcf6s
        0xcecs
        0xce7s
        0xcecs
        0xcf1s
        0xcf5s
        0xcfds
        0xce7s
        0xcfes
        0xcf7s
        0xceas
        0xcf5s
        0xcf9s
        0xcecs
    .end array-data
.end method

.method constructor <init>(Lkevin/fun/hook/DYHook;Landroid/content/Context;)V
    .locals 3

    iput-object p1, p0, Lkevin/fun/hook/DYHook$132;->this$0:Lkevin/fun/hook/DYHook;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$132;->val$ctx:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

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
    const-string v0, "fFcaT4G"

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۣ۟ۧۢۢ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۦۧ۟ۥ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Landroidx/loader/ۡۢۢ;->ۢۥۧ۟()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$132;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$132;->val$ctx:Landroid/content/Context;

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

.method public static ۟ۧ۟۟۟(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۥۦۨ۠()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$132;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$132;->this$0:Lkevin/fun/hook/DYHook;

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

.method public static ۟ۧۧ۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/lang/String;

    invoke-static {p0, p1, p2, p3}, Lkevin/fun/hook/DYHook;->_$$Nest$mshowTimeFormatDialog(Lkevin/fun/hook/DYHook;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

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

.method public static ۡۡ۠()[S
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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/DYHook$132;->short:[S

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
    .locals 10

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v6, "\u06e7\u06e4\u06e1"

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

    invoke-static {}, Lkevin/fun/hook/DYHook$132;->ۡۡ۠()[S

    move-result-object v1

    const-string v6, "\u06df\u06e6"

    move-object v5, v1

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lkevin/fun/hook/DYHook$132;->ۡۡ۠()[S

    move-result-object v1

    const-string v6, "\u06e0\u06e2\u06e1"

    move-object v5, v1

    goto :goto_0

    :sswitch_1
    sget v9, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    const-string v1, "\u06e0\u06e3\u06e2"

    move-object v6, v1

    goto :goto_0

    :sswitch_2
    xor-int/lit16 v7, v9, 0x282

    const-string v1, "\u06e6\u06e2\u06df"

    move-object v6, v1

    goto :goto_0

    :sswitch_3
    sget v9, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    const-string v1, "\u06e5\u06e6\u06e4"

    move-object v6, v1

    goto :goto_0

    :sswitch_4
    const/16 v1, 0x8e5

    invoke-static {v5, v8, v7, v1}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e7\u06e1\u06e5"

    move-object v4, v1

    goto :goto_0

    :sswitch_5
    xor-int/lit16 v7, v9, 0x21d

    const-string v1, "\u06e4\u06e0\u06df"

    move-object v6, v1

    goto :goto_0

    :sswitch_6
    const/4 v1, 0x6

    const/16 v2, 0xcb8

    invoke-static {v5, v1, v7, v2}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e4\u06e5\u06e4"

    move-object v2, v1

    goto :goto_0

    :sswitch_7
    invoke-static {v3, v0, v4, v2}, Lkevin/fun/hook/DYHook$132;->۟ۧۧ۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e3\u06e0\u06e4"

    move-object v6, v1

    goto :goto_0

    :sswitch_8
    invoke-static {p0}, Lkevin/fun/hook/DYHook$132;->۟ۦۧ۟ۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "\u06df\u06e6\u06e0"

    move-object v6, v1

    goto :goto_0

    :sswitch_9
    invoke-static {p0}, Lkevin/fun/hook/DYHook$132;->۟ۧ۟۟۟(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    const-string v6, "\u06e3\u06e3\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_a
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe7 -> :sswitch_3
        0x1aa7d9 -> :sswitch_0
        0x1aab1f -> :sswitch_1
        0x1aab3f -> :sswitch_2
        0x1ab627 -> :sswitch_a
        0x1ab680 -> :sswitch_8
        0x1ab9e3 -> :sswitch_6
        0x1aba83 -> :sswitch_7
        0x1abe63 -> :sswitch_5
        0x1ac1a3 -> :sswitch_4
        0x1ac5a4 -> :sswitch_9
    .end sparse-switch
.end method

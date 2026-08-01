.class public abstract Ly9;
.super Ljava/lang/Object;


# static fields
.field public static a:Ljava/lang/Class;

.field public static b:Z

.field public static c:Ljava/lang/Boolean;

.field public static d:J

.field public static final e:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Ly9;->e:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 5

    const-string v0, "\u06e3\u06e8\u06e2"

    invoke-static {v0}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v1, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    or-int/lit16 v1, v1, 0x1968

    rem-int/2addr v0, v1

    if-ltz v0, :cond_4

    const/16 v0, 0x60

    sput v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    const-string v0, "\u06e7\u06e6\u06e3"

    :goto_1
    invoke-static {v0}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    const-string v0, "RqJL\n"

    const-string v1, "MsMsKq0ZFps=\n"

    const-string v2, "Pg==\n"

    const-string v3, "W5V10Oy49b4=\n"

    invoke-static {v0, v1, p0, v2, v3}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget v0, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v1, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    add-int/lit16 v1, v1, 0x2539

    div-int/2addr v0, v1

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣۣ۟ۡ()I

    :cond_0
    const-string v0, "\u06e1\u06e4\u06e2"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    :sswitch_2
    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v1, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    or-int/lit16 v1, v1, 0x14f9

    add-int/2addr v0, v1

    if-ltz v0, :cond_2

    const-string v0, "\u06e7\u06e4\u06e4"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e7\u06e6\u06e4"

    goto :goto_1

    :sswitch_3
    sget-object v0, Ly9;->e:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "\u06df\u06e5\u06e6"

    goto :goto_1

    :sswitch_4
    const-string v0, "06ke\n"

    const-string v1, "p8h5VTpLcuY=\n"

    const-string v2, " (\u9632\u6296)"

    invoke-virtual {p0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "tw==\n"

    const-string v4, "0vI8ySRxU5w=\n"

    invoke-static {v0, v1, v2, v3, v4}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget v0, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v1, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    or-int/lit16 v1, v1, -0x1875

    div-int/2addr v0, v1

    if-ltz v0, :cond_3

    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    const-string v0, "\u06df\u06e5\u06e6"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e7\u06e6\u06e4"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_4
    sget v0, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v1, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    rem-int/2addr v0, v1

    const v1, 0x1ab964

    add-int/2addr v0, v1

    goto/16 :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa765 -> :sswitch_0
        0x1aa7c0 -> :sswitch_4
        0x1aaf1f -> :sswitch_3
        0x1aaf3b -> :sswitch_2
        0x1ab71d -> :sswitch_1
        0x1ac5e5 -> :sswitch_5
    .end sparse-switch
.end method

.class public Lcom/tendcloud/tenddata/ab;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/ab$b;,
        Lcom/tendcloud/tenddata/ab$c;,
        Lcom/tendcloud/tenddata/ab$a;
    }
.end annotation


# static fields
.field public static final A:Ljava/lang/String; = "TD_sdk_last_send_time_wifi"

.field public static final B:Ljava/lang/String; = "TD_sdk_last_send_time_mobile_data"

.field public static final C:Ljava/lang/String; = "TD_sdk_last_send_url"

.field public static final D:Ljava/lang/String; = "TD_sdk_last_send_host"

.field public static final E:Ljava/lang/String; = "isDeveloper"

.field public static F:Ljava/lang/String; = null

.field public static G:Ljava/lang/String; = null

.field public static H:Z = false

.field public static I:Ljava/lang/String; = null

.field public static J:Z = false

.field public static final K:I = 0x6400000

.field public static final L:Ljava/lang/String; = "WiFi"

.field public static final M:Ljava/lang/String; = "All"

.field public static N:Ljava/lang/String; = null

.field public static final O:Ljava/lang/String; = "v1.0.0"

.field public static P:Z = false

.field public static Q:Z = false

.field public static R:Z = false

.field public static S:Z = false

.field public static T:Lcom/tendcloud/tenddata/TalkingDataSDKConfig; = null

.field public static final U:Ljava/lang/String; = "Android+TD+V5.0.28 gp"

.field public static V:J = 0x0L

.field public static W:I = 0x0

.field public static X:Ljava/util/concurrent/atomic/AtomicInteger; = null

.field public static final Y:I = 0x1b7740

.field public static final Z:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final a:Z = false

.field public static final aa:J = 0x7530L

.field public static final ab:I = 0x64

.field public static final ac:Ljava/lang/String; = "TD_APP_ID"

.field public static final ad:Ljava/lang/String; = "TD_CHANNEL_ID"

.field private static ae:Ljava/util/HashMap; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final af:Ljava/lang/String; = "+V"

.field private static final ag:I = 0x78

.field private static final ah:I = 0x1e

.field private static final ai:I = 0x3e8

.field public static b:Z = false

.field public static final c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static e:Z = false

.field public static f:J = 0x0L

.field public static g:Landroid/content/Context; = null

.field public static h:Landroid/os/Handler; = null

.field public static final i:I = 0x1

.field public static final j:Ljava/lang/String; = "Android+"

.field public static k:Ljava/nio/channels/FileChannel; = null

.field public static l:J = 0x0L

.field public static m:Z = false

.field public static n:I = 0x0

.field public static o:Z = false

.field public static p:Z = false

.field public static q:J = 0x0L

.field public static r:Ljava/lang/String; = null

.field public static final s:Ljava/lang/String; = "TD"

.field public static final t:Ljava/lang/String; = "TDLog"

.field public static u:Lcom/tendcloud/tenddata/TalkingDataSharingFilter; = null

.field public static final v:Ljava/lang/String; = "2606"

.field public static final w:Ljava/lang/String; = "TD_app_pefercen_profile"

.field public static final x:Ljava/lang/String; = "TD_appId_"

.field public static final y:Ljava/lang/String; = "TD_channelId"

.field public static final z:Ljava/lang/String; = "TD_init_custom"


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/tendcloud/tenddata/ab;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    sput-object v0, Lcom/tendcloud/tenddata/ab;->d:Ljava/util/Map;

    sput-boolean v1, Lcom/tendcloud/tenddata/ab;->e:Z

    const-wide/16 v2, 0x0

    sput-wide v2, Lcom/tendcloud/tenddata/ab;->f:J

    const/4 v0, 0x0

    sput-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    sput-object v0, Lcom/tendcloud/tenddata/ab;->h:Landroid/os/Handler;

    sput-wide v2, Lcom/tendcloud/tenddata/ab;->l:J

    sput-boolean v1, Lcom/tendcloud/tenddata/ab;->m:Z

    const/4 v2, -0x1

    sput v2, Lcom/tendcloud/tenddata/ab;->n:I

    const/4 v2, 0x1

    sput-boolean v2, Lcom/tendcloud/tenddata/ab;->o:Z

    sput-boolean v2, Lcom/tendcloud/tenddata/ab;->p:Z

    const-wide/16 v2, 0x1388

    sput-wide v2, Lcom/tendcloud/tenddata/ab;->q:J

    sget-object v2, Lcom/tendcloud/tenddata/TalkingDataSharingFilter;->SHARE:Lcom/tendcloud/tenddata/TalkingDataSharingFilter;

    sput-object v2, Lcom/tendcloud/tenddata/ab;->u:Lcom/tendcloud/tenddata/TalkingDataSharingFilter;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    sput-object v2, Lcom/tendcloud/tenddata/ab;->ae:Ljava/util/HashMap;

    const-string v2, "Default"

    sput-object v2, Lcom/tendcloud/tenddata/ab;->F:Ljava/lang/String;

    const-string v2, ""

    sput-object v2, Lcom/tendcloud/tenddata/ab;->G:Ljava/lang/String;

    sput-boolean v1, Lcom/tendcloud/tenddata/ab;->H:Z

    sput-object v0, Lcom/tendcloud/tenddata/ab;->I:Ljava/lang/String;

    sput-boolean v1, Lcom/tendcloud/tenddata/ab;->J:Z

    const-string v0, "WiFi"

    sput-object v0, Lcom/tendcloud/tenddata/ab;->N:Ljava/lang/String;

    sput-boolean v1, Lcom/tendcloud/tenddata/ab;->P:Z

    sput-boolean v1, Lcom/tendcloud/tenddata/ab;->Q:Z

    sput-boolean v1, Lcom/tendcloud/tenddata/ab;->R:Z

    sput-boolean v1, Lcom/tendcloud/tenddata/ab;->S:Z

    new-instance v0, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/TalkingDataSDKConfig;-><init>()V

    sput-object v0, Lcom/tendcloud/tenddata/ab;->T:Lcom/tendcloud/tenddata/TalkingDataSDKConfig;

    const/4 v0, 0x2

    sput v0, Lcom/tendcloud/tenddata/ab;->W:I

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/tendcloud/tenddata/ab;->X:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/tendcloud/tenddata/ab;->Z:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;
    .locals 3

    const-string v0, ""

    if-eqz p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/tendcloud/tenddata/ab;->ae:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    return-object v1

    :cond_1
    const-string v1, "TD_appId_"

    .line 1
    invoke-static {v1}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 2
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "TD_app_pefercen_profile"

    invoke-static {p0, v1, p1, v0}, Lcom/tendcloud/tenddata/s;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    const-string p0, "Context or Service is null"

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tendcloud/tenddata/h;->dForInternal([Ljava/lang/String;)V

    return-object v0
.end method

.method private static a(I)V
    .locals 1

    :try_start_0
    new-instance v0, Lcom/tendcloud/tenddata/cz;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/cz;-><init>()V

    packed-switch p0, :pswitch_data_0

    const-string p0, "Native"

    goto :goto_0

    :pswitch_0
    const-string p0, "Flutter"

    :goto_0
    invoke-virtual {v0, p0}, Lcom/tendcloud/tenddata/cz;->setFrameWork(Ljava/lang/String;)V

    goto :goto_1

    :pswitch_1
    const-string p0, "ReactNative"

    goto :goto_0

    :pswitch_2
    const-string p0, "Hybrid"

    goto :goto_0

    :pswitch_3
    const-string p0, "APICloud"

    goto :goto_0

    :pswitch_4
    const-string p0, "PhoneGap"

    goto :goto_0

    :pswitch_5
    const-string p0, "AIR"

    goto :goto_0

    :pswitch_6
    const-string p0, "Unity"

    goto :goto_0

    :pswitch_7
    const-string p0, "Cocos2d"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static a(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 2

    if-eqz p1, :cond_0

    sget-object v0, Lcom/tendcloud/tenddata/ab;->ae:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string v1, "TD_appId_"

    .line 6
    invoke-static {v1}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 7
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "TD_app_pefercen_profile"

    invoke-static {v0, v1, p1, p0}, Lcom/tendcloud/tenddata/s;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 2

    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    if-eqz v0, :cond_0

    new-instance v0, Landroid/os/Handler;

    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/tendcloud/tenddata/ab;->h:Landroid/os/Handler;

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/tendcloud/tenddata/ab;->f:J

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "-"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x1

    aget-object p0, p0, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-object p0, v1

    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    sput-object p1, Lcom/tendcloud/tenddata/ab;->F:Ljava/lang/String;

    :cond_2
    invoke-static {p0, p2}, Lcom/tendcloud/tenddata/ab;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    sget-object p1, Lcom/tendcloud/tenddata/ab;->F:Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/tendcloud/tenddata/ab;->b(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    invoke-static {}, Lcom/tendcloud/tenddata/cw;->a()Lcom/tendcloud/tenddata/cw;

    move-result-object p1

    invoke-virtual {p1, p0, p2}, Lcom/tendcloud/tenddata/cw;->a(Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V

    invoke-static {}, Lcom/tendcloud/tenddata/cw;->a()Lcom/tendcloud/tenddata/cw;

    move-result-object p0

    sget-object p1, Lcom/tendcloud/tenddata/ab;->F:Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/tendcloud/tenddata/cw;->b(Ljava/lang/Object;Lcom/tendcloud/tenddata/a;)V

    sget p0, Lcom/tendcloud/tenddata/dz;->a:I

    invoke-static {p0}, Lcom/tendcloud/tenddata/ab;->a(I)V

    return-void
.end method

.method private static a(Landroid/content/Context;)Z
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/g;->a()Lcom/tendcloud/tenddata/g;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/tendcloud/tenddata/g;->d(Landroid/content/Context;)J

    move-result-wide v1

    invoke-static {}, Lcom/tendcloud/tenddata/g;->a()Lcom/tendcloud/tenddata/g;

    move-result-object v3

    invoke-virtual {v3, p0}, Lcom/tendcloud/tenddata/g;->e(Landroid/content/Context;)J

    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long p0, v1, v3

    if-nez p0, :cond_0

    const/4 p0, 0x1

    move v0, p0

    :catchall_0
    :cond_0
    return v0
.end method

.method public static a(Lcom/tendcloud/tenddata/a;)Z
    .locals 11

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    if-nez v1, :cond_0

    return v0

    :cond_0
    if-nez p0, :cond_1

    return v0

    :cond_1
    invoke-static {v1}, Lcom/tendcloud/tenddata/ab;->a(Landroid/content/Context;)Z

    move-result v1

    const-wide/16 v2, 0x1

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    invoke-static {p0}, Lcom/tendcloud/tenddata/i;->e(Lcom/tendcloud/tenddata/a;)J

    move-result-wide v5

    cmp-long p0, v5, v2

    if-nez p0, :cond_2

    move v0, v4

    :cond_2
    return v0

    :cond_3
    invoke-static {p0}, Lcom/tendcloud/tenddata/i;->e(Lcom/tendcloud/tenddata/a;)J

    move-result-wide v5

    cmp-long v1, v5, v2

    if-nez v1, :cond_9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {p0}, Lcom/tendcloud/tenddata/i;->d(Lcom/tendcloud/tenddata/a;)J

    move-result-wide v5

    sub-long v5, v1, v5

    sget-wide v7, Lcom/tendcloud/tenddata/ab;->q:J

    const-wide/16 v9, 0x4

    mul-long/2addr v7, v9

    cmp-long v3, v5, v7

    if-gtz v3, :cond_8

    invoke-static {}, Lcom/tendcloud/tenddata/i;->e()J

    move-result-wide v5

    sub-long/2addr v1, v5

    sget-wide v5, Lcom/tendcloud/tenddata/ab;->q:J

    mul-long/2addr v5, v9

    cmp-long v1, v1, v5

    if-gtz v1, :cond_4

    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v1, p0}, Lcom/tendcloud/tenddata/ab;->d(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Z

    move-result p0

    return p0

    :cond_4
    invoke-static {p0}, Lcom/tendcloud/tenddata/ab;->c(Lcom/tendcloud/tenddata/a;)Z

    move-result v1

    if-eqz v1, :cond_5

    return v4

    :cond_5
    invoke-static {p0}, Lcom/tendcloud/tenddata/ab;->e(Lcom/tendcloud/tenddata/a;)Z

    move-result v1

    if-eqz v1, :cond_6

    return v4

    :cond_6
    invoke-static {p0}, Lcom/tendcloud/tenddata/ab;->d(Lcom/tendcloud/tenddata/a;)Z

    move-result v1

    if-eqz v1, :cond_7

    return v4

    :cond_7
    invoke-static {p0}, Lcom/tendcloud/tenddata/ab;->b(Lcom/tendcloud/tenddata/a;)Z

    move-result p0

    if-eqz p0, :cond_9

    return v4

    :cond_8
    invoke-static {v0, p0}, Lcom/tendcloud/tenddata/i;->a(ZLcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_9
    return v0
.end method

.method public static a()[I
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    return-object v0

    nop

    :array_0
    .array-data 4
        0x1d4c0
        0x7530
    .end array-data
.end method

.method public static b(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/tendcloud/tenddata/ab;->F:Ljava/lang/String;

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "Default"

    if-nez v0, :cond_0

    sget-object v0, Lcom/tendcloud/tenddata/ab;->F:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "TD_channelId"

    .line 1
    invoke-static {v0}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "TD_app_pefercen_profile"

    invoke-static {p0, v0, p1, v1}, Lcom/tendcloud/tenddata/s;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/tendcloud/tenddata/ab;->F:Ljava/lang/String;

    :cond_1
    sget-object p0, Lcom/tendcloud/tenddata/ab;->F:Ljava/lang/String;

    return-object p0
.end method

.method public static b(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 2

    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string v1, "TD_channelId"

    .line 6
    invoke-static {v1}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 7
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "TD_app_pefercen_profile"

    invoke-static {v0, v1, p1, p0}, Lcom/tendcloud/tenddata/s;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static b()Z
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string v2, "TD_app_pefercen_profile"

    const-string v3, "isDeveloper"

    const-wide/16 v4, 0x0

    invoke-static {v1, v2, v3, v4, v5}, Lcom/tendcloud/tenddata/s;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v1, v1, v4

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :catchall_0
    :cond_0
    return v0
.end method

.method private static b(Lcom/tendcloud/tenddata/a;)Z
    .locals 9

    const-string v0, "td_database3SaaS"

    const-string v1, "td_database1SaaS"

    const-string v2, "td_database0SaaS"

    sget-object v3, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-virtual {p0}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object p0

    const-string v3, "SDK"

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    :try_start_0
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v5, Ljava/io/File;

    invoke-direct {v5, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v6, Ljava/io/File;

    invoke-direct {v6, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v7, Ljava/io/File;

    const-string v8, "__database_reborn_January_one__"

    invoke-direct {v7, p0, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance p0, Ljava/io/File;

    invoke-direct {p0, v7, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v7, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v7, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    move v4, p0

    nop

    :catchall_0
    :cond_2
    :goto_0
    return v4
.end method

.method public static c()Ljava/lang/String;
    .locals 1

    :try_start_0
    new-instance v0, Lcom/tendcloud/tenddata/cz;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/cz;-><init>()V

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/cz;->a()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const-string v0, "Native"

    :goto_0
    return-object v0
.end method

.method public static c(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;
    .locals 3

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->G:Ljava/lang/String;

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "TD_app_pefercen_profile"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TD_init_custom"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, ""

    invoke-static {p0, v0, p1, v1}, Lcom/tendcloud/tenddata/s;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/tendcloud/tenddata/ab;->G:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    sget-object p0, Lcom/tendcloud/tenddata/ab;->G:Ljava/lang/String;

    return-object p0
.end method

.method public static c(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 4

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string v1, "TD_app_pefercen_profile"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TD_init_custom"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1, p0}, Lcom/tendcloud/tenddata/s;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private static c(Lcom/tendcloud/tenddata/a;)Z
    .locals 7

    const-string v0, "td_database0SaaS"

    const-string v1, "td_database3SaaS"

    sget-object v2, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object p0

    const-string v2, "TRACKING"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    :try_start_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v5, Ljava/io/File;

    const-string v6, "__database_reborn_January_one__"

    invoke-direct {v5, p0, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance p0, Ljava/io/File;

    invoke-direct {p0, v5, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v5, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    move v3, p0

    :catchall_0
    :cond_1
    return v3
.end method

.method private static d(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Z
    .locals 3

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TRACKING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SDK"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "talkingdata_file_prefence"

    const-string v1, "actived"

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    invoke-interface {p0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {v2, p1}, Lcom/tendcloud/tenddata/i;->a(ZLcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v2

    :catchall_0
    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method private static d(Lcom/tendcloud/tenddata/a;)Z
    .locals 7

    const-string v0, "td_database1SaaS"

    const-string v1, "td_database3SaaS"

    sget-object v2, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object p0

    const-string v2, "APP"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    :try_start_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v5, Ljava/io/File;

    const-string v6, "__database_reborn_January_one__"

    invoke-direct {v5, p0, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance p0, Ljava/io/File;

    invoke-direct {p0, v5, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v5, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    move v3, p0

    :catchall_0
    :cond_1
    return v3
.end method

.method private static e(Lcom/tendcloud/tenddata/a;)Z
    .locals 7

    const-string v0, "td_database1SaaS"

    const-string v1, "td_database0SaaS"

    sget-object v2, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object p0

    const-string v2, "GAME"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    :try_start_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v5, Ljava/io/File;

    const-string v6, "__database_reborn_January_one__"

    invoke-direct {v5, p0, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance p0, Ljava/io/File;

    invoke-direct {p0, v5, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v5, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    move v3, p0

    :catchall_0
    :cond_1
    return v3
.end method

.method public static setCofig(Lcom/tendcloud/tenddata/TalkingDataSDKConfig;)V
    .locals 0

    if-eqz p0, :cond_0

    sput-object p0, Lcom/tendcloud/tenddata/ab;->T:Lcom/tendcloud/tenddata/TalkingDataSDKConfig;

    :cond_0
    return-void
.end method

.method public static setConfigurationDisable(I)V
    .locals 3

    and-int/lit8 v0, p0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    :try_start_0
    sput-boolean v0, Lcom/tendcloud/tenddata/ab;->P:Z

    and-int/lit8 v0, p0, 0x2

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    sput-boolean v0, Lcom/tendcloud/tenddata/ab;->Q:Z

    and-int/lit8 v0, p0, 0x4

    if-eqz v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    sput-boolean v0, Lcom/tendcloud/tenddata/ab;->R:Z

    and-int/lit8 p0, p0, 0x8

    if-eqz p0, :cond_3

    move v1, v2

    :cond_3
    sput-boolean v1, Lcom/tendcloud/tenddata/ab;->S:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static setDeveloperMode(Z)V
    .locals 5

    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string v1, "TD_app_pefercen_profile"

    const-string v2, "isDeveloper"

    if-eqz p0, :cond_0

    const-wide/16 v3, 0x1

    goto :goto_0

    :cond_0
    const-wide/16 v3, 0x0

    :goto_0
    invoke-static {v0, v1, v2, v3, v4}, Lcom/tendcloud/tenddata/s;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

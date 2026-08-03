.class public final Landroidx/profileinstaller/ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟۟;,
        Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟;,
        Landroidx/profileinstaller/ۥ۟۟۟$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ:Ljava/lang/String; = "/data/misc/profiles/ref/"

.field public static final ۥ۟:Ljava/lang/String; = "/data/misc/profiles/cur/0/"

.field public static final ۥ۟۟:Ljava/lang/String; = "primary.prof"

.field public static final ۥ۟۟۟:Ljava/lang/String; = "profileInstalled"

.field public static final ۥ۟۟۟۟:LYue/ۥۡۦۦ۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e6\u06e6\u06df<",
            "Landroidx/profileinstaller/\u06e5\u06df\u06df\u06df$\u06e5\u06df\u06df;",
            ">;"
        }
    .end annotation
.end field

.field public static final ۥ۟۟۟۠:Ljava/lang/Object;

.field public static final ۥ۟۟۟ۡ:Ljava/lang/String; = "ProfileVerifier"

.field public static ۥ۟۟۟ۢ:Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟۟;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, LYue/ۥۡۦۦ۟;->ۥ۟۟۠ۤ()LYue/ۥۡۦۦ۟;

    move-result-object v0

    sput-object v0, Landroidx/profileinstaller/ۥ۟۟۟;->ۥ۟۟۟۟:LYue/ۥۡۦۦ۟;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/profileinstaller/ۥ۟۟۟;->ۥ۟۟۟۠:Ljava/lang/Object;

    const/4 v0, 0x0

    sput-object v0, Landroidx/profileinstaller/ۥ۟۟۟;->ۥ۟۟۟ۢ:Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟۟;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/profileinstaller/\u06e5\u06df\u06df\u06df$\u06e5\u06df\u06df;",
            ">;"
        }
    .end annotation

    sget-object v0, Landroidx/profileinstaller/ۥ۟۟۟;->ۥ۟۟۟۟:LYue/ۥۡۦۦ۟;

    return-object v0
.end method

.method public static ۥ۟(Landroid/content/Context;)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/pm/PackageManager$NameNotFoundException;
        }
    .end annotation

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-lt v1, v2, :cond_0

    invoke-static {v0, p0}, Landroidx/profileinstaller/ۥ۟۟۟$ۥ;->ۥ(Landroid/content/pm/PackageManager;Landroid/content/Context;)Landroid/content/pm/PackageInfo;

    move-result-object p0

    iget-wide v0, p0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    iget-wide v0, p0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    return-wide v0
.end method

.method public static ۥ۟۟(IZZ)Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟۟;
    .locals 1

    new-instance v0, Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟۟;

    invoke-direct {v0, p0, p1, p2}, Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟۟;-><init>(IZZ)V

    sput-object v0, Landroidx/profileinstaller/ۥ۟۟۟;->ۥ۟۟۟ۢ:Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟۟;

    sget-object p0, Landroidx/profileinstaller/ۥ۟۟۟;->ۥ۟۟۟۟:LYue/ۥۡۦۦ۟;

    invoke-virtual {p0, v0}, LYue/ۥۡۦۦ۟;->ۥ۟۟۠۟(Ljava/lang/Object;)Z

    sget-object p0, Landroidx/profileinstaller/ۥ۟۟۟;->ۥ۟۟۟ۢ:Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟۟;

    return-object p0
.end method

.method public static ۥ۟۟۟(Landroid/content/Context;)Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟۟;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۢۦ۟ۨ;
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroidx/profileinstaller/ۥ۟۟۟;->ۥ۟۟۟۟(Landroid/content/Context;Z)Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟۟;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟۟(Landroid/content/Context;Z)Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟۟;
    .locals 18
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    .annotation build LYue/ۥۢۦ۟ۨ;
    .end annotation

    if-nez p1, :cond_0

    sget-object v0, Landroidx/profileinstaller/ۥ۟۟۟;->ۥ۟۟۟ۢ:Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟۟;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    sget-object v1, Landroidx/profileinstaller/ۥ۟۟۟;->ۥ۟۟۟۠:Ljava/lang/Object;

    monitor-enter v1

    if-nez p1, :cond_1

    :try_start_0
    sget-object v0, Landroidx/profileinstaller/ۥ۟۟۟;->ۥ۟۟۟ۢ:Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟۟;

    if-eqz v0, :cond_1

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    const/4 v3, 0x0

    if-lt v0, v2, :cond_e

    const/16 v2, 0x1e

    if-ne v0, v2, :cond_2

    goto/16 :goto_6

    :cond_2
    new-instance v0, Ljava/io/File;

    new-instance v2, Ljava/io/File;

    const-string v4, "/data/misc/profiles/ref/"

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "primary.prof"

    invoke-direct {v0, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v4

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    const-wide/16 v6, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    cmp-long v0, v4, v6

    if-lez v0, :cond_3

    move v0, v2

    goto :goto_0

    :cond_3
    move v0, v3

    :goto_0
    new-instance v8, Ljava/io/File;

    new-instance v9, Ljava/io/File;

    const-string v10, "/data/misc/profiles/cur/0/"

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v9, v10, v11}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v10, "primary.prof"

    invoke-direct {v8, v9, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->length()J

    move-result-wide v16

    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v8, :cond_4

    cmp-long v6, v16, v6

    if-lez v6, :cond_4

    move v6, v2

    goto :goto_1

    :cond_4
    move v6, v3

    :goto_1
    :try_start_1
    invoke-static/range {p0 .. p0}, Landroidx/profileinstaller/ۥ۟۟۟;->ۥ۟(Landroid/content/Context;)J

    move-result-wide v14
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    new-instance v7, Ljava/io/File;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v8

    const-string v9, "profileInstalled"

    invoke-direct {v7, v8, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v8, :cond_5

    :try_start_3
    invoke-static {v7}, Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟;->ۥ(Ljava/io/File;)Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟;

    move-result-object v8
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :catch_0
    const/high16 v2, 0x20000

    :try_start_4
    invoke-static {v2, v0, v6}, Landroidx/profileinstaller/ۥ۟۟۟;->ۥ۟۟(IZZ)Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟۟;

    move-result-object v0

    monitor-exit v1

    return-object v0

    :cond_5
    const/4 v8, 0x0

    :goto_2
    const/4 v9, 0x2

    if-eqz v8, :cond_7

    iget-wide v10, v8, Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟;->ۥ۟۟:J

    cmp-long v10, v10, v14

    if-nez v10, :cond_7

    iget v10, v8, Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟;->ۥ۟:I

    if-ne v10, v9, :cond_6

    goto :goto_3

    :cond_6
    move v3, v10

    goto :goto_4

    :cond_7
    :goto_3
    if-eqz v0, :cond_8

    move v3, v2

    goto :goto_4

    :cond_8
    if-eqz v6, :cond_9

    move v3, v9

    :cond_9
    :goto_4
    if-eqz p1, :cond_a

    if-eqz v6, :cond_a

    if-eq v3, v2, :cond_a

    move v3, v9

    :cond_a
    if-eqz v8, :cond_b

    iget v10, v8, Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟;->ۥ۟:I

    if-ne v10, v9, :cond_b

    if-ne v3, v2, :cond_b

    iget-wide v9, v8, Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟;->ۥ۟۟۟:J

    cmp-long v2, v4, v9

    if-gez v2, :cond_b

    const/4 v3, 0x3

    :cond_b
    new-instance v2, Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟;

    const/4 v12, 0x1

    move-object v11, v2

    move v13, v3

    invoke-direct/range {v11 .. v17}, Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟;-><init>(IIJJ)V

    if-eqz v8, :cond_c

    invoke-virtual {v8, v2}, Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟;->equals(Ljava/lang/Object;)Z

    move-result v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez v4, :cond_d

    :cond_c
    :try_start_5
    invoke-virtual {v2, v7}, Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟;->ۥ۟(Ljava/io/File;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_5

    :catch_1
    const/high16 v3, 0x30000

    :cond_d
    :goto_5
    :try_start_6
    invoke-static {v3, v0, v6}, Landroidx/profileinstaller/ۥ۟۟۟;->ۥ۟۟(IZZ)Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟۟;

    move-result-object v0

    monitor-exit v1

    return-object v0

    :catch_2
    const/high16 v2, 0x10000

    invoke-static {v2, v0, v6}, Landroidx/profileinstaller/ۥ۟۟۟;->ۥ۟۟(IZZ)Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟۟;

    move-result-object v0

    monitor-exit v1

    return-object v0

    :cond_e
    :goto_6
    const/high16 v0, 0x40000

    invoke-static {v0, v3, v3}, Landroidx/profileinstaller/ۥ۟۟۟;->ۥ۟۟(IZZ)Landroidx/profileinstaller/ۥ۟۟۟$ۥ۟۟;

    move-result-object v0

    monitor-exit v1

    return-object v0

    :goto_7
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v0
.end method

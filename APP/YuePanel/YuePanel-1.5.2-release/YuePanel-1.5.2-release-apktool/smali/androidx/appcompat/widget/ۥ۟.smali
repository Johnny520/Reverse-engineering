.class public Landroidx/appcompat/widget/ۥ۟;
.super Landroid/database/DataSetObservable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟;,
        Landroidx/appcompat/widget/ۥ۟$ۥ۟۟;,
        Landroidx/appcompat/widget/ۥ۟$ۥ۟;,
        Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟۠;,
        Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟۟;,
        Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟ۡ;,
        Landroidx/appcompat/widget/ۥ۟$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟ۨ:Z = false

.field public static final ۥ۟۟۠:Ljava/lang/String; = "\u06e5\u06df"

.field public static final ۥ۟۟۠۟:Ljava/lang/String; = "historical-records"

.field public static final ۥ۟۟۠۠:Ljava/lang/String; = "historical-record"

.field public static final ۥ۟۟۠ۡ:Ljava/lang/String; = "activity"

.field public static final ۥ۟۟۠ۢ:Ljava/lang/String; = "time"

.field public static final ۥۣ۟۟۠:Ljava/lang/String; = "weight"

.field public static final ۥ۟۟۠ۤ:Ljava/lang/String; = "activity_choser_model_history.xml"

.field public static final ۥ۟۟۠ۥ:I = 0x32

.field public static final ۥ۟۟۠ۦ:I = 0x5

.field public static final ۥ۟۟۠ۧ:F = 1.0f

.field public static final ۥ۟۟۠ۨ:Ljava/lang/String; = ".xml"

.field public static final ۥ۟۟ۡ:I = -0x1

.field public static final ۥ۟۟ۡ۟:Ljava/lang/Object;

.field public static final ۥ۟۟ۡ۠:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/appcompat/widget/\u06e5\u06df;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final ۥ:Ljava/lang/Object;

.field public final ۥ۟:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/appcompat/widget/\u06e5\u06df$\u06e5\u06df;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/appcompat/widget/\u06e5\u06df$\u06e5\u06df\u06df\u06df\u06df;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۟:Landroid/content/Context;

.field public final ۥ۟۟۟۟:Ljava/lang/String;

.field public ۥ۟۟۟۠:Landroid/content/Intent;

.field public ۥ۟۟۟ۡ:Landroidx/appcompat/widget/ۥ۟$ۥ۟۟;

.field public ۥ۟۟۟ۢ:I

.field public ۥۣ۟۟۟:Z

.field public ۥ۟۟۟ۤ:Z

.field public ۥ۟۟۟ۥ:Z

.field public ۥ۟۟۟ۦ:Z

.field public ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟۠;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟ۡ۟:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟ۡ۠:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Landroid/database/DataSetObservable;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟:Ljava/util/List;

    new-instance v0, Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟;

    invoke-direct {v0}, Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۡ:Landroidx/appcompat/widget/ۥ۟$ۥ۟۟;

    const/16 v0, 0x32

    iput v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۢ:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥۣ۟۟۟:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۤ:Z

    iput-boolean v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۥ:Z

    iput-boolean v1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۦ:Z

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟:Landroid/content/Context;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, ".xml"

    invoke-virtual {p2, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟۟:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟۟:Ljava/lang/String;

    :goto_0
    return-void
.end method

.method public static ۥ۟۟۟(Landroid/content/Context;Ljava/lang/String;)Landroidx/appcompat/widget/ۥ۟;
    .locals 3

    sget-object v0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟ۡ۟:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟ۡ۠:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/ۥ۟;

    if-nez v2, :cond_0

    new-instance v2, Landroidx/appcompat/widget/ۥ۟;

    invoke-direct {v2, p0, p1}, Landroidx/appcompat/widget/ۥ۟;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-object v2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public final ۥ(Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟۟;)Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۥ:Z

    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۨ()V

    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۧ()V

    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۠ۥ()Z

    invoke-virtual {p0}, Landroid/database/DataSetObservable;->notifyChanged()V

    :cond_0
    return p1
.end method

.method public ۥ۟(I)Landroid/content/Intent;
    .locals 6

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟۠:Landroid/content/Intent;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟()V

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/ۥ۟$ۥ۟;

    new-instance v1, Landroid/content/ComponentName;

    iget-object p1, p1, Landroidx/appcompat/widget/ۥ۟$ۥ۟;->ۥۣ۟۟۠:Landroid/content/pm/ResolveInfo;

    iget-object p1, p1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v3, p1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iget-object p1, p1, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-direct {v1, v3, p1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Landroid/content/Intent;

    iget-object v3, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟۠:Landroid/content/Intent;

    invoke-direct {p1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    invoke-virtual {p1, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v3, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟۠;

    if-eqz v3, :cond_1

    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    iget-object v4, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟۠;

    invoke-interface {v4, p0, v3}, Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟۠;->ۥ(Landroidx/appcompat/widget/ۥ۟;Landroid/content/Intent;)Z

    move-result v3

    if-eqz v3, :cond_1

    monitor-exit v0

    return-object v2

    :cond_1
    new-instance v2, Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟۟;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-direct {v2, v1, v3, v4, v5}, Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟۟;-><init>(Landroid/content/ComponentName;JF)V

    invoke-virtual {p0, v2}, Landroidx/appcompat/widget/ۥ۟;->ۥ(Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟۟;)Z

    monitor-exit v0

    return-object p1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۥ۟۟()V
    .locals 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۦ()Z

    move-result v0

    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۠()Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۨ()V

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۠ۥ()Z

    invoke-virtual {p0}, Landroid/database/DataSetObservable;->notifyChanged()V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟۟(I)Landroid/content/pm/ResolveInfo;
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟()V

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/ۥ۟$ۥ۟;

    iget-object p1, p1, Landroidx/appcompat/widget/ۥ۟$ۥ۟;->ۥۣ۟۟۠:Landroid/content/pm/ResolveInfo;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public ۥ۟۟۟۠()I
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟()V

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public ۥ۟۟۟ۡ(Landroid/content/pm/ResolveInfo;)I
    .locals 5

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟()V

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/appcompat/widget/ۥ۟$ۥ۟;

    iget-object v4, v4, Landroidx/appcompat/widget/ۥ۟$ۥ۟;->ۥۣ۟۟۠:Landroid/content/pm/ResolveInfo;

    if-ne v4, p1, :cond_0

    monitor-exit v0

    return v3

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    monitor-exit v0

    const/4 p1, -0x1

    return p1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public ۥ۟۟۟ۢ()Landroid/content/pm/ResolveInfo;
    .locals 3

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟()V

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/ۥ۟$ۥ۟;

    iget-object v1, v1, Landroidx/appcompat/widget/ۥ۟$ۥ۟;->ۥۣ۟۟۠:Landroid/content/pm/ResolveInfo;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public ۥۣ۟۟۟()I
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۢ:I

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public ۥ۟۟۟ۤ()I
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟()V

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public ۥ۟۟۟ۥ()Landroid/content/Intent;
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟۠:Landroid/content/Intent;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ۥ۟۟۟ۦ()Z
    .locals 6

    iget-boolean v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۦ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟۠:Landroid/content/Intent;

    if-eqz v0, :cond_1

    iput-boolean v1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۦ:Z

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v2, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟۠:Landroid/content/Intent;

    invoke-virtual {v0, v2, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    :goto_0
    if-ge v1, v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/pm/ResolveInfo;

    iget-object v4, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟:Ljava/util/List;

    new-instance v5, Landroidx/appcompat/widget/ۥ۟$ۥ۟;

    invoke-direct {v5, v3}, Landroidx/appcompat/widget/ۥ۟$ۥ۟;-><init>(Landroid/content/pm/ResolveInfo;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method

.method public final ۥ۟۟۟ۧ()V
    .locals 4

    iget-boolean v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۤ:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۥ:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۥ:Z

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟۟:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟ۡ;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟ۡ;-><init>(Landroidx/appcompat/widget/ۥ۟;)V

    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v3, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟۟:Ljava/lang/String;

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_1
    return-void

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No preceding call to #readHistoricalData"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟۟۟ۨ()V
    .locals 4

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۢ:I

    sub-int/2addr v0, v1

    if-gtz v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۥ:Z

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟۟;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۥ۟۟۠()Z
    .locals 2

    iget-boolean v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥۣ۟۟۟:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۥ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟۟:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-boolean v1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥۣ۟۟۟:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۤ:Z

    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۠۟()V

    return v0

    :cond_0
    return v1
.end method

.method public final ۥ۟۟۠۟()V
    .locals 10

    const-string v0, "Error reading historical recrod file: "

    :try_start_0
    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟:Landroid/content/Context;

    iget-object v2, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟۟:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_4

    :try_start_1
    invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v2

    const-string v3, "UTF-8"

    invoke-interface {v2, v1, v3}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    if-eq v3, v4, :cond_0

    const/4 v5, 0x2

    if-eq v3, v5, :cond_0

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :catch_0
    move-exception v2

    goto :goto_3

    :catch_1
    move-exception v2

    goto/16 :goto_4

    :cond_0
    const-string v3, "historical-records"

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v3, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->clear()V

    :cond_1
    :goto_1
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v5
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v5, v4, :cond_2

    if-eqz v1, :cond_6

    :goto_2
    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_5

    :cond_2
    const/4 v6, 0x3

    if-eq v5, v6, :cond_1

    const/4 v6, 0x4

    if-ne v5, v6, :cond_3

    goto :goto_1

    :cond_3
    :try_start_3
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "historical-record"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const-string v5, "activity"

    const/4 v6, 0x0

    invoke-interface {v2, v6, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v7, "time"

    invoke-interface {v2, v6, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    const-string v9, "weight"

    invoke-interface {v2, v6, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v6

    new-instance v9, Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟۟;

    invoke-direct {v9, v5, v7, v8, v6}, Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟۟;-><init>(Ljava/lang/String;JF)V

    invoke-interface {v3, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    new-instance v2, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v3, "Share records file not well-formed."

    invoke-direct {v2, v3}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_5
    new-instance v2, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v3, "Share records file does not start with historical-records tag."

    invoke-direct {v2, v3}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_3
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_3
    :try_start_4
    sget-object v3, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۠:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟۟:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    if-eqz v1, :cond_6

    goto :goto_2

    :goto_4
    sget-object v3, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۠:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟۟:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v1, :cond_6

    goto :goto_2

    :catch_2
    :cond_6
    :goto_5
    return-void

    :goto_6
    if-eqz v1, :cond_7

    :try_start_5
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    :catch_3
    :cond_7
    throw v0

    :catch_4
    return-void
.end method

.method public ۥ۟۟۠۠(Landroidx/appcompat/widget/ۥ۟$ۥ۟۟;)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۡ:Landroidx/appcompat/widget/ۥ۟$ۥ۟۟;

    if-ne v1, p1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    iput-object p1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۡ:Landroidx/appcompat/widget/ۥ۟$ۥ۟۟;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۠ۥ()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/database/DataSetObservable;->notifyChanged()V

    :cond_1
    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public ۥ۟۟۠ۡ(I)V
    .locals 5

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟()V

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/ۥ۟$ۥ۟;

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/ۥ۟$ۥ۟;

    if-eqz v1, :cond_0

    iget v1, v1, Landroidx/appcompat/widget/ۥ۟$ۥ۟;->ۥ۟۟۠ۤ:F

    iget v2, p1, Landroidx/appcompat/widget/ۥ۟$ۥ۟;->ۥ۟۟۠ۤ:F

    sub-float/2addr v1, v2

    const/high16 v2, 0x40a00000    # 5.0f

    add-float/2addr v1, v2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/high16 v1, 0x3f800000    # 1.0f

    :goto_0
    new-instance v2, Landroid/content/ComponentName;

    iget-object p1, p1, Landroidx/appcompat/widget/ۥ۟$ۥ۟;->ۥۣ۟۟۠:Landroid/content/pm/ResolveInfo;

    iget-object p1, p1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v3, p1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iget-object p1, p1, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-direct {v2, v3, p1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟۟;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-direct {p1, v2, v3, v4, v1}, Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟۟;-><init>(Landroid/content/ComponentName;JF)V

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ۥ۟;->ۥ(Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟۟;)Z

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public ۥ۟۟۠ۢ(I)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۢ:I

    if-ne v1, p1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    iput p1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۢ:I

    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۨ()V

    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۠ۥ()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/database/DataSetObservable;->notifyChanged()V

    :cond_1
    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public ۥۣ۟۟۠(Landroid/content/Intent;)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟۠:Landroid/content/Intent;

    if-ne v1, p1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    iput-object p1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟۠:Landroid/content/Intent;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۦ:Z

    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟()V

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public ۥ۟۟۠ۤ(Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟۠;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟۠;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۥ۟۟۠ۥ()Z
    .locals 4

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۡ:Landroidx/appcompat/widget/ۥ۟$ۥ۟۟;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟۠:Landroid/content/Intent;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟ۡ:Landroidx/appcompat/widget/ۥ۟$ۥ۟۟;

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟۟۠:Landroid/content/Intent;

    iget-object v2, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟:Ljava/util/List;

    iget-object v3, p0, Landroidx/appcompat/widget/ۥ۟;->ۥ۟۟:Ljava/util/List;

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Landroidx/appcompat/widget/ۥ۟$ۥ۟۟;->ۥ(Landroid/content/Intent;Ljava/util/List;Ljava/util/List;)V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

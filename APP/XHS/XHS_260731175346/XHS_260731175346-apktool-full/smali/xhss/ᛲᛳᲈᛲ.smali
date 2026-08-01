.class public final Lxhss/ᛲᛳᲈᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛱᛱᛲᲇ:Landroid/graphics/PorterDuff$Mode;

.field public static ᛳᲁᲇᛸ:Lxhss/ᛲᛳᲈᛲ;


# instance fields
.field public ᛷᛵᛵᲈ:Lxhss/ᛱᲈᲁᛴ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    sput-object v0, Lxhss/ᛲᛳᲈᛲ;->ᛱᛱᛲᲇ:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    return-void
.end method

.method public static declared-synchronized ᛱᛱᛲᲇ()V
    .locals 4

    .line 1
    const-class v0, Lxhss/ᛲᛳᲈᛲ;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lxhss/ᛲᛳᲈᛲ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛳᲈᛲ;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lxhss/ᛲᛳᲈᛲ;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lxhss/ᛲᛳᲈᛲ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛳᲈᛲ;

    .line 14
    .line 15
    invoke-static {}, Lxhss/ᛱᲈᲁᛴ;->ᛳᲁᲇᛸ()Lxhss/ᛱᲈᲁᛴ;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iput-object v2, v1, Lxhss/ᛲᛳᲈᛲ;->ᛷᛵᛵᲈ:Lxhss/ᛱᲈᲁᛴ;

    .line 20
    .line 21
    sget-object v1, Lxhss/ᛲᛳᲈᛲ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛳᲈᛲ;

    .line 22
    .line 23
    iget-object v1, v1, Lxhss/ᛲᛳᲈᛲ;->ᛷᛵᛵᲈ:Lxhss/ᛱᲈᲁᛴ;

    .line 24
    .line 25
    new-instance v2, Lxhss/ᛳᛲᲀᲈ;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-direct {v2, v3}, Lxhss/ᛳᛲᲀᲈ;-><init>(I)V

    .line 29
    .line 30
    .line 31
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 32
    :try_start_1
    iput-object v2, v1, Lxhss/ᛱᲈᲁᛴ;->ᛷᛴᛷᛱ:Lxhss/ᛳᛲᲀᲈ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    .line 34
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v2

    .line 37
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 38
    :try_start_4
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 39
    :catchall_1
    move-exception v1

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    :goto_0
    monitor-exit v0

    .line 42
    return-void

    .line 43
    :goto_1
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 44
    throw v1
.end method


# virtual methods
.method public final declared-synchronized ᛷᛵᛵᲈ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lxhss/ᛲᛳᲈᛲ;->ᛷᛵᛵᲈ:Lxhss/ᛱᲈᲁᛴ;

    .line 3
    .line 4
    invoke-virtual {v0, p1, p2}, Lxhss/ᛱᲈᲁᛴ;->ᲇᛴᲇᛵ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    .line 7
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p0

    .line 9
    return-object p1

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw p1
.end method

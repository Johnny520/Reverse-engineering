.class public abstract Lxhss/ᛸᛱᲁᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛷᛵᛵᲈ:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxhss/ᛸᛱᲁᲇ;->ᛷᛵᛵᲈ:Ljava/util/HashMap;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    const-class v0, Lxhss/ᛵᛵᛲᲈ;

    .line 14
    .line 15
    invoke-static {v0}, Lxhss/ᛸᛱᲁᲇ;->ᛷᛵᛵᲈ(Ljava/lang/Class;)V

    .line 16
    .line 17
    .line 18
    const-class v0, Lxhss/ᛶᛱᛱᛳ;

    .line 19
    .line 20
    invoke-static {v0}, Lxhss/ᛸᛱᲁᲇ;->ᛷᛵᛵᲈ(Ljava/lang/Class;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static ᛷᛵᛵᲈ(Ljava/lang/Class;)V
    .locals 3

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, Lxhss/ᛸᛱᲁᲇ;->ᛷᛵᛵᲈ:Ljava/util/HashMap;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    check-cast v2, Ljava/util/LinkedHashSet;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    invoke-virtual {v2, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    monitor-exit v1

    .line 29
    return-void

    .line 30
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    throw p0
.end method

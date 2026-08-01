.class public abstract Lxhss/ᛳᲀᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛷᛵᛵᲈ:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Lxhss/ᛴᛳᲈᛴ;

    .line 2
    .line 3
    invoke-direct {v0}, Lxhss/ᛴᛳᲈᛴ;-><init>()V

    .line 4
    .line 5
    .line 6
    filled-new-array {v0}, [Lxhss/ᛴᛳᲈᛴ;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    new-instance v1, Lxhss/ᲈᛱᛱᲀ;

    .line 19
    .line 20
    const/4 v2, 0x3

    .line 21
    invoke-direct {v1, v2, v0}, Lxhss/ᲈᛱᛱᲀ;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Lxhss/ᛸᲀᛶᛳ;

    .line 25
    .line 26
    invoke-direct {v0, v1}, Lxhss/ᛸᲀᛶᛳ;-><init>(Lxhss/ᲈᛱᛱᲀ;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lxhss/ᛷᛴᛲᲇ;->ᛸᛶᛴᲈ(Lxhss/ᲁᛷᛴᲇ;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lxhss/ᛳᲀᛲ;->ᛷᛵᛵᲈ:Ljava/util/List;

    .line 34
    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    new-instance v1, Ljava/util/ServiceConfigurationError;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-direct {v1, v2, v0}, Ljava/util/ServiceConfigurationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    throw v1
.end method

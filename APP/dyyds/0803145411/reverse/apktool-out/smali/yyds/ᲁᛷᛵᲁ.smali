.class public abstract Lyyds/ᲁᛷᛵᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Lyyds/ᛱᲈᛵᛷ;

    .line 2
    .line 3
    invoke-direct {v0}, Lyyds/ᛱᲈᛵᛷ;-><init>()V

    .line 4
    .line 5
    .line 6
    filled-new-array {v0}, [Lyyds/ᛱᲈᛵᛷ;

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
    new-instance v1, Lyyds/ᛳᛳᲀᲀ;

    .line 19
    .line 20
    const/4 v2, 0x4

    .line 21
    invoke-direct {v1, v2, v0}, Lyyds/ᛳᛳᲀᲀ;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Lyyds/ᛵᛶᲈᲇ;

    .line 25
    .line 26
    invoke-direct {v0, v1}, Lyyds/ᛵᛶᲈᲇ;-><init>(Lyyds/ᛳᛳᲀᲀ;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lyyds/ᛷᛴᛳᛶ;->ᛲᛳᛴᛸ(Lyyds/ᛵᲈᛴᛷ;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lyyds/ᲁᛷᛵᲁ;->ᛲᲈᲁ:Ljava/util/List;

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

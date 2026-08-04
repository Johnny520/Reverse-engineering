.class public final Lyyds/ᛴᛵᲀᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᛴᛳᛲ:Lyyds/ᛳᲇᲀᲀ;


# instance fields
.field public final ᛲᲈᲁ:Ljava/lang/Object;

.field public final ᛵᛸᛸᛷ:Ljava/lang/Object;

.field public final ᲀᛲᛳᲀ:Lyyds/ᛴᲈᛳᛶ;

.field public final ᲇᲈᛵᛷ:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lyyds/ᛴᛵᲀᛴ;

    .line 2
    .line 3
    invoke-static {v0}, Lyyds/ᛵᛵᛲᲈ;->ᛵᛸᛸᛷ(Ljava/lang/Class;)Lyyds/ᛳᲇᲀᲀ;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lyyds/ᛴᛵᲀᛴ;->ᛲᛴᛳᛲ:Lyyds/ᛳᲇᲀᲀ;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛴᲈᛳᛶ;Ljava/util/HashMap;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛴᛵᲀᛴ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛴᛵᲀᛴ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᛴᛵᲀᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲈᛳᛶ;

    .line 9
    .line 10
    iput-object p4, p0, Lyyds/ᛴᛵᲀᛴ;->ᲇᲈᛵᛷ:Ljava/util/HashMap;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Lyyds/ᲈᛳᛵᲇ;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-boolean v0, p1, Lyyds/ᲈᛳᛵᲇ;->ᛵᛸᛸᛷ:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lyyds/ᛴᛵᲀᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲈᛳᛶ;

    .line 5
    .line 6
    iget-object v3, p0, Lyyds/ᛴᛵᲀᛴ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object p0, p0, Lyyds/ᛴᛵᲀᛴ;->ᲇᲈᛵᛷ:Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p1, Lyyds/ᲈᛳᛵᲇ;->ᛲᲈᲁ:Lyyds/ᲈᲁᲁᛶ;

    .line 19
    .line 20
    invoke-virtual {v0}, Lyyds/ᲀᛶᲁᛵ;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v2, "Using cached result for root path: "

    .line 27
    .line 28
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sget-object v1, Lyyds/ᛴᛵᲀᛴ;->ᛲᛴᛳᛲ:Lyyds/ᛳᲇᲀᲀ;

    .line 39
    .line 40
    invoke-interface {v1, v0}, Lyyds/ᛳᲇᲀᲀ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_0
    invoke-virtual {p1, v3, v3, v2}, Lyyds/ᲈᛳᛵᲇ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛴᲈᛳᛶ;)Lyyds/ᛸᛴᛷᲇ;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0, v1}, Lyyds/ᛸᛴᛷᲇ;->ᲀᛲᛳᲀ(Z)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_1
    iget-object p0, p0, Lyyds/ᛴᛵᲀᛴ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 61
    .line 62
    invoke-virtual {p1, p0, v3, v2}, Lyyds/ᲈᛳᛵᲇ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛴᲈᛳᛶ;)Lyyds/ᛸᛴᛷᲇ;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p0, v1}, Lyyds/ᛸᛴᛷᲇ;->ᲀᛲᛳᲀ(Z)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0
.end method

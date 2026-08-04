.class public final Lyyds/ᲈᛳᛵᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᲀᛲᛳᲀ:Lyyds/ᛳᲇᲀᲀ;


# instance fields
.field public final ᛲᲈᲁ:Lyyds/ᲈᲁᲁᛶ;

.field public final ᛵᛸᛸᛷ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lyyds/ᲈᛳᛵᲇ;

    .line 2
    .line 3
    invoke-static {v0}, Lyyds/ᛵᛵᛲᲈ;->ᛵᛸᛸᛷ(Ljava/lang/Class;)Lyyds/ᛳᲇᲀᲀ;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lyyds/ᲈᛳᛵᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲇᲀᲀ;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lyyds/ᲈᲁᲁᛶ;Z)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lyyds/ᲈᲁᲁᛶ;->ᲇᲇᲇᛱ:Lyyds/ᲀᛶᲁᛵ;

    .line 5
    .line 6
    instance-of v0, v0, Lyyds/ᛲᛱᲁᲁ;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1}, Lyyds/ᲀᛶᲁᛵ;->ᛲᛳᛶᲁ()Lyyds/ᲀᛶᲁᛵ;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    instance-of v0, v0, Lyyds/ᛴᲇᛴᛱ;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    move-object v1, p1

    .line 20
    move-object v2, v0

    .line 21
    :goto_0
    invoke-virtual {v1}, Lyyds/ᲀᛶᲁᛵ;->ᛲᛳᛶᲁ()Lyyds/ᲀᛶᲁᛵ;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    instance-of v3, v1, Lyyds/ᛲᛱᲁᲁ;

    .line 28
    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    move-object v2, v1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    instance-of v3, v1, Lyyds/ᛲᛱᲁᲁ;

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    iput-object v0, v2, Lyyds/ᲀᛶᲁᛵ;->ᛵᛸᛸᛷ:Lyyds/ᲀᛶᲁᛵ;

    .line 38
    .line 39
    iput-object v2, p1, Lyyds/ᲈᲁᲁᛶ;->ᲇᲇᲇᛱ:Lyyds/ᲀᛶᲁᛵ;

    .line 40
    .line 41
    new-instance v0, Lyyds/ᛸᲀᲀᛵ;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 47
    .line 48
    iput-object v2, v0, Lyyds/ᛸᲀᲀᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Boolean;

    .line 49
    .line 50
    new-instance v2, Lyyds/ᲈᛳᛵᲇ;

    .line 51
    .line 52
    const/4 v3, 0x1

    .line 53
    invoke-direct {v2, p1, v3}, Lyyds/ᲈᛳᛵᲇ;-><init>(Lyyds/ᲈᲁᲁᛶ;Z)V

    .line 54
    .line 55
    .line 56
    iput-object v2, v0, Lyyds/ᛸᲀᲀᛵ;->ᛵᛸᛸᛷ:Lyyds/ᲈᛳᛵᲇ;

    .line 57
    .line 58
    const/4 p1, 0x2

    .line 59
    iput p1, v0, Lyyds/ᛸᲀᲀᛵ;->ᛲᲈᲁ:I

    .line 60
    .line 61
    move-object p1, v1

    .line 62
    check-cast p1, Lyyds/ᛲᛱᲁᲁ;

    .line 63
    .line 64
    filled-new-array {v0}, [Lyyds/ᛸᲀᲀᛵ;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p1, Lyyds/ᛲᛱᲁᲁ;->ᛱᲈᲁ:Ljava/util/List;

    .line 73
    .line 74
    new-instance p1, Lyyds/ᲈᲁᲁᛶ;

    .line 75
    .line 76
    const/16 v0, 0x24

    .line 77
    .line 78
    invoke-direct {p1, v0}, Lyyds/ᲈᲁᲁᛶ;-><init>(C)V

    .line 79
    .line 80
    .line 81
    iput-object v1, p1, Lyyds/ᲈᲁᲁᛶ;->ᲇᲇᲇᛱ:Lyyds/ᲀᛶᲁᛵ;

    .line 82
    .line 83
    iput-object v1, p1, Lyyds/ᲀᛶᲁᛵ;->ᛵᛸᛸᛷ:Lyyds/ᲀᛶᲁᛵ;

    .line 84
    .line 85
    :cond_1
    iput-object p1, p0, Lyyds/ᲈᛳᛵᲇ;->ᛲᲈᲁ:Lyyds/ᲈᲁᲁᛶ;

    .line 86
    .line 87
    iput-boolean p2, p0, Lyyds/ᲈᛳᛵᲇ;->ᛵᛸᛸᛷ:Z

    .line 88
    .line 89
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲈᛳᛵᲇ;->ᛲᲈᲁ:Lyyds/ᲈᲁᲁᛶ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᲀᛶᲁᛵ;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛴᲈᛳᛶ;)Lyyds/ᛸᛴᛷᲇ;
    .locals 3

    .line 1
    sget-object v0, Lyyds/ᲈᛳᛵᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲇᲀᲀ;

    .line 2
    .line 3
    invoke-interface {v0}, Lyyds/ᛳᲇᲀᲀ;->ᲇᲈᛵᛷ()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, p0, Lyyds/ᲈᛳᛵᲇ;->ᛲᲈᲁ:Lyyds/ᲈᲁᲁᛶ;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2}, Lyyds/ᲀᛶᲁᛵ;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v0, v1}, Lyyds/ᛳᲇᲀᲀ;->ᛲᲈᲁ(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    new-instance v0, Lyyds/ᛸᛴᛷᲇ;

    .line 19
    .line 20
    invoke-direct {v0, p0, p2, p3}, Lyyds/ᛸᛴᛷᲇ;-><init>(Lyyds/ᲈᛳᛵᲇ;Ljava/lang/Object;Lyyds/ᛴᲈᛳᛶ;)V

    .line 21
    .line 22
    .line 23
    :try_start_0
    sget-object p0, Lyyds/ᛷᛸᛸᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲁᛷᛷ;

    .line 24
    .line 25
    const-string p2, ""

    .line 26
    .line 27
    invoke-virtual {v2, p2, p0, p1, v0}, Lyyds/ᲈᲁᲁᛶ;->ᛲᲈᲁ(Ljava/lang/String;Lyyds/ᛷᛸᛸᛳ;Ljava/lang/Object;Lyyds/ᛸᛴᛷᲇ;)V
    :try_end_0
    .catch Lyyds/ᲁᲁᲁᛷ; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    :catch_0
    return-object v0
.end method

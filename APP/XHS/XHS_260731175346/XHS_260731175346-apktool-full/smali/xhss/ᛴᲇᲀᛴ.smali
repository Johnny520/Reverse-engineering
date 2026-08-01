.class public final Lxhss/ᛴᲇᲀᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛳᲁᲇᛸ:Lxhss/ᲀᛶᛶᲀ;


# instance fields
.field public final ᛱᛱᛲᲇ:Z

.field public final ᛷᛵᛵᲈ:Lxhss/ᲀᛷᲈᛳ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lxhss/ᛴᲇᲀᛴ;

    .line 2
    .line 3
    invoke-static {v0}, Lxhss/ᲁᲇᛴᲀ;->ᛱᛱᛲᲇ(Ljava/lang/Class;)Lxhss/ᲀᛶᛶᲀ;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lxhss/ᛴᲇᲀᛴ;->ᛳᲁᲇᛸ:Lxhss/ᲀᛶᛶᲀ;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lxhss/ᲀᛷᲈᛳ;Z)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lxhss/ᲀᛷᲈᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛳᛳᛵᛱ;

    .line 5
    .line 6
    instance-of v0, v0, Lxhss/ᲈᛱᛲ;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1}, Lxhss/ᛳᛳᛵᛱ;->ᛸᛲᲀᛵ()Lxhss/ᛳᛳᛵᛱ;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    instance-of v0, v0, Lxhss/ᛱᛸᛷᲇ;

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
    invoke-virtual {v1}, Lxhss/ᛳᛳᛵᛱ;->ᛸᛲᲀᛵ()Lxhss/ᛳᛳᛵᛱ;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    instance-of v3, v1, Lxhss/ᲈᛱᛲ;

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
    instance-of v3, v1, Lxhss/ᲈᛱᛲ;

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    iput-object v0, v2, Lxhss/ᛳᛳᛵᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛳᛳᛵᛱ;

    .line 38
    .line 39
    iput-object v2, p1, Lxhss/ᲀᛷᲈᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛳᛳᛵᛱ;

    .line 40
    .line 41
    new-instance v0, Lxhss/ᛴᛸᛵᛴ;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 47
    .line 48
    iput-object v2, v0, Lxhss/ᛴᛸᛵᛴ;->ᲇᛴᲇᛵ:Ljava/lang/Boolean;

    .line 49
    .line 50
    new-instance v2, Lxhss/ᛴᲇᲀᛴ;

    .line 51
    .line 52
    const/4 v3, 0x1

    .line 53
    invoke-direct {v2, p1, v3}, Lxhss/ᛴᲇᲀᛴ;-><init>(Lxhss/ᲀᛷᲈᛳ;Z)V

    .line 54
    .line 55
    .line 56
    iput-object v2, v0, Lxhss/ᛴᛸᛵᛴ;->ᛱᛱᛲᲇ:Lxhss/ᛴᲇᲀᛴ;

    .line 57
    .line 58
    const/4 p1, 0x2

    .line 59
    iput p1, v0, Lxhss/ᛴᛸᛵᛴ;->ᛷᛵᛵᲈ:I

    .line 60
    .line 61
    move-object p1, v1

    .line 62
    check-cast p1, Lxhss/ᲈᛱᛲ;

    .line 63
    .line 64
    filled-new-array {v0}, [Lxhss/ᛴᛸᛵᛴ;

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
    iput-object v0, p1, Lxhss/ᲈᛱᛲ;->ᛸᛴᛶᛳ:Ljava/util/List;

    .line 73
    .line 74
    new-instance p1, Lxhss/ᲀᛷᲈᛳ;

    .line 75
    .line 76
    const/16 v0, 0x24

    .line 77
    .line 78
    invoke-direct {p1, v0}, Lxhss/ᲀᛷᲈᛳ;-><init>(C)V

    .line 79
    .line 80
    .line 81
    iput-object v1, p1, Lxhss/ᲀᛷᲈᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛳᛳᛵᛱ;

    .line 82
    .line 83
    iput-object v1, p1, Lxhss/ᛳᛳᛵᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛳᛳᛵᛱ;

    .line 84
    .line 85
    :cond_1
    iput-object p1, p0, Lxhss/ᛴᲇᲀᛴ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛷᲈᛳ;

    .line 86
    .line 87
    iput-boolean p2, p0, Lxhss/ᛴᲇᲀᛴ;->ᛱᛱᛲᲇ:Z

    .line 88
    .line 89
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛴᲇᲀᛴ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛷᲈᛳ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lxhss/ᛳᛳᛵᛱ;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;Lxhss/ᲀᛲᲇ;)Lxhss/ᛵᲈᛷ;
    .locals 3

    .line 1
    sget-object v0, Lxhss/ᛴᲇᲀᛴ;->ᛳᲁᲇᛸ:Lxhss/ᲀᛶᛶᲀ;

    .line 2
    .line 3
    invoke-interface {v0}, Lxhss/ᲀᛶᛶᲀ;->ᲇᛴᲇᛵ()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, p0, Lxhss/ᛴᲇᲀᛴ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛷᲈᛳ;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2}, Lxhss/ᛳᛳᛵᛱ;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v0, v1}, Lxhss/ᲀᛶᛶᲀ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    new-instance v0, Lxhss/ᛵᲈᛷ;

    .line 19
    .line 20
    invoke-direct {v0, p0, p2, p3}, Lxhss/ᛵᲈᛷ;-><init>(Lxhss/ᛴᲇᲀᛴ;Ljava/lang/Object;Lxhss/ᲀᛲᲇ;)V

    .line 21
    .line 22
    .line 23
    :try_start_0
    sget-object p0, Lxhss/ᛴᛴᛴᛷ;->ᛳᲁᲇᛸ:Lxhss/ᲀᛱᛸᛳ;

    .line 24
    .line 25
    const-string p2, ""

    .line 26
    .line 27
    invoke-virtual {v2, p2, p0, p1, v0}, Lxhss/ᲀᛷᲈᛳ;->ᛷᛵᛵᲈ(Ljava/lang/String;Lxhss/ᛴᛴᛴᛷ;Ljava/lang/Object;Lxhss/ᛵᲈᛷ;)V
    :try_end_0
    .catch Lxhss/ᛷᲀᛴᛲ; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    :catch_0
    return-object v0
.end method

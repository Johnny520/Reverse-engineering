.class public final Lxhss/ᛳᛲᲈᛶ;
.super Lxhss/ᲈᲈᛱᛶ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛵᲇᛱᛴ;


# instance fields
.field public final synthetic ᛷᛴᛷᛱ:Ljava/lang/Object;

.field public final synthetic ᛸᛲᲀᛵ:Lxhss/ᛳᛴᛵ;

.field public final synthetic ᛸᛴᛶᛳ:Ljava/lang/String;

.field public final synthetic ᲀᲇᛳᲁ:Landroid/content/Context;

.field public final synthetic ᲇᛶᛴᲀ:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Boolean;Landroid/content/Context;Ljava/lang/String;Lxhss/ᛳᛴᛵ;Lxhss/ᛱᛴᛶᛴ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxhss/ᛳᛲᲈᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p2, p0, Lxhss/ᛳᛲᲈᛶ;->ᲇᛶᛴᲀ:Ljava/lang/Boolean;

    .line 4
    .line 5
    iput-object p3, p0, Lxhss/ᛳᛲᲈᛶ;->ᲀᲇᛳᲁ:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p4, p0, Lxhss/ᛳᛲᲈᛶ;->ᛸᛴᛶᛳ:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lxhss/ᛳᛲᲈᛶ;->ᛸᛲᲀᛵ:Lxhss/ᛳᛴᛵ;

    .line 10
    .line 11
    invoke-direct {p0, p6}, Lxhss/ᛸᛴᛳᛷ;-><init>(Lxhss/ᛱᛴᛶᛴ;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final ᛳᲁᲇᛸ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lxhss/ᛲᛸᲁᲇ;

    .line 2
    .line 3
    check-cast p2, Lxhss/ᛱᛴᛶᛴ;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lxhss/ᛳᛲᲈᛶ;->ᲀᲇᛳᲁ(Ljava/lang/Object;Lxhss/ᛱᛴᛶᛴ;)Lxhss/ᛱᛴᛶᛴ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lxhss/ᛳᛲᲈᛶ;

    .line 10
    .line 11
    sget-object p1, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lxhss/ᛳᛲᲈᛶ;->ᛸᛲᲀᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p1
.end method

.method public final ᛸᛲᲀᛵ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {p1}, Lxhss/ᛶᲈᛴᛲ;->ᛳᛶᛷᲀ(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lxhss/ᛳᛲᲈᛶ;->ᛸᛲᲀᛵ:Lxhss/ᛳᛴᛵ;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iget-object v1, p0, Lxhss/ᛳᛲᲈᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    :try_start_0
    sget-object v2, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 12
    .line 13
    sget-object v3, Lxhss/ᛳᛱᛲᛲ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛱᛲᛲ;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lxhss/ᛳᛱᛲᛲ;->ᛸᛷᲈᲈ()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v3}, Lxhss/ᲇᲁᛱᛸ;->ᲁᛴᲇᛲ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    move-object v2, v0

    .line 33
    :goto_0
    iget-object v3, p0, Lxhss/ᛳᛲᲈᛶ;->ᲇᛶᛴᲀ:Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const/16 v2, 0x5f

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    sget-object v2, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 57
    .line 58
    const-wide v3, -0x32f71b858845L

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-static {v1, v3}, Lxhss/ᲇᲁᛱᛸ;->ᲇᛸᛳᲁ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    :cond_1
    move-object v2, v0

    .line 82
    :cond_2
    sget-object v0, Lxhss/ᛳᲀᛷᲀ;->ᛷᛵᛵᲈ:Lxhss/ᛳᲀᛷᲀ;

    .line 83
    .line 84
    iget-object v1, p0, Lxhss/ᛳᛲᲈᛶ;->ᲀᲇᛳᲁ:Landroid/content/Context;

    .line 85
    .line 86
    iget-object p0, p0, Lxhss/ᛳᛲᲈᛶ;->ᛸᛴᛶᛳ:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-static {v1, p0, v2}, Lxhss/ᛳᲀᛷᲀ;->ᲀᲇᛳᲁ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Lxhss/ᛳᛴᛵ;->ᛱᲁᛳᛲ()V

    .line 95
    .line 96
    .line 97
    sget-object p0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 98
    .line 99
    return-object p0

    .line 100
    :goto_1
    invoke-virtual {p1}, Lxhss/ᛳᛴᛵ;->ᛱᲁᛳᛲ()V

    .line 101
    .line 102
    .line 103
    throw p0
.end method

.method public final ᲀᲇᛳᲁ(Ljava/lang/Object;Lxhss/ᛱᛴᛶᛴ;)Lxhss/ᛱᛴᛶᛴ;
    .locals 7

    .line 1
    new-instance v0, Lxhss/ᛳᛲᲈᛶ;

    .line 2
    .line 3
    iget-object v4, p0, Lxhss/ᛳᛲᲈᛶ;->ᛸᛴᛶᛳ:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v5, p0, Lxhss/ᛳᛲᲈᛶ;->ᛸᛲᲀᛵ:Lxhss/ᛳᛴᛵ;

    .line 6
    .line 7
    iget-object v1, p0, Lxhss/ᛳᛲᲈᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v2, p0, Lxhss/ᛳᛲᲈᛶ;->ᲇᛶᛴᲀ:Ljava/lang/Boolean;

    .line 10
    .line 11
    iget-object v3, p0, Lxhss/ᛳᛲᲈᛶ;->ᲀᲇᛳᲁ:Landroid/content/Context;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lxhss/ᛳᛲᲈᛶ;-><init>(Ljava/lang/Object;Ljava/lang/Boolean;Landroid/content/Context;Ljava/lang/String;Lxhss/ᛳᛴᛵ;Lxhss/ᛱᛴᛶᛴ;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.class public final Lz5/b;
.super Li5/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/util/List;

.field public final m:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz5/b;->j:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, Lz5/b;->k:Ljava/lang/String;

    .line 7
    .line 8
    sget-object p1, La6/a;->a:La2/a;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    if-nez p2, :cond_0

    .line 14
    .line 15
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    instance-of p1, p2, Ljava/util/List;

    .line 19
    .line 20
    if-eqz p1, :cond_3

    .line 21
    .line 22
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    if-eqz p3, :cond_2

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    check-cast p3, Ljava/lang/CharSequence;

    .line 37
    .line 38
    instance-of p3, p3, Ljava/lang/String;

    .line 39
    .line 40
    if-nez p3, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    check-cast p2, Ljava/util/List;

    .line 44
    .line 45
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    goto :goto_2

    .line 50
    :cond_3
    :goto_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance p2, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result p3

    .line 63
    if-eqz p3, :cond_4

    .line 64
    .line 65
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    check-cast p3, Ljava/lang/CharSequence;

    .line 70
    .line 71
    invoke-interface {p3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    :goto_2
    iput-object p1, p0, Lz5/b;->l:Ljava/util/List;

    .line 84
    .line 85
    iput-object p4, p0, Lz5/b;->m:Ljava/lang/String;

    .line 86
    .line 87
    return-void
.end method

.method public static i1(Li5/b;)Lz5/b;
    .locals 4

    .line 1
    instance-of v0, p0, Lz5/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lz5/b;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance v0, Lz5/b;

    .line 9
    .line 10
    invoke-virtual {p0}, Li5/b;->f1()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p0}, Li5/b;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {p0}, Li5/b;->g1()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {p0}, Li5/b;->h1()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-direct {v0, v1, v3, v2, p0}, Lz5/b;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method


# virtual methods
.method public final f1()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lz5/b;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g1()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lz5/b;->l:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lz5/b;->k:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h1()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lz5/b;->m:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

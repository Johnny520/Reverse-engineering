.class public final Lxhss/ᛲᛵᲈᲁ;
.super Lxhss/ᛲᛱᛶᛴ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛳᲁᲇᛸ:Lxhss/ᲈᛲᛶ;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᲈᛱᛲᛴ;

.field public final ᛷᛵᛵᲈ:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᲈᛲᛶ;

    .line 2
    .line 3
    invoke-direct {v0}, Lxhss/ᲈᛲᛶ;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxhss/ᛲᛵᲈᲁ;->ᛳᲁᲇᛸ:Lxhss/ᲈᛲᛶ;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lxhss/ᲈᛲᛶᛴ;Lxhss/ᛲᛱᛶᛴ;Ljava/lang/Class;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lxhss/ᲈᛱᛲᛴ;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, p1, p2, p3, v1}, Lxhss/ᲈᛱᛲᛴ;-><init>(Ljava/lang/Object;Lxhss/ᛲᛱᛶᛴ;Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lxhss/ᛲᛵᲈᲁ;->ᛱᛱᛲᲇ:Lxhss/ᲈᛱᛲᛴ;

    .line 11
    .line 12
    iput-object p3, p0, Lxhss/ᛲᛵᲈᲁ;->ᛷᛵᛵᲈ:Ljava/lang/Class;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᲁᲁᛴᲁ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x9

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᲀᛷᲁᲀ()V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛱᛱᛲᲇ()V

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛳᲈᲈᛲ()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    iget-object v1, p0, Lxhss/ᛲᛵᲈᲁ;->ᛱᛱᛲᲇ:Lxhss/ᲈᛱᛲᛴ;

    .line 29
    .line 30
    iget-object v1, v1, Lxhss/ᲈᛱᛲᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛱᛶᛴ;

    .line 31
    .line 32
    invoke-virtual {v1, p1}, Lxhss/ᛲᛱᛶᛴ;->ᛱᛱᛲᲇ(Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛸᛲᲀᛵ()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iget-object p0, p0, Lxhss/ᛲᛵᲈᲁ;->ᛷᛵᛵᲈ:Ljava/lang/Class;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    invoke-static {p0, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    const/4 v1, 0x0

    .line 60
    :goto_1
    if-ge v1, p1, :cond_2

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-static {p0, v1, v2}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 v1, v1, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    return-object p0

    .line 73
    :cond_3
    invoke-static {p0, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, [Ljava/lang/Object;

    .line 78
    .line 79
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method

.method public final ᛳᲁᲇᛸ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V
    .locals 4

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lxhss/ᛸᲈᲈᛶ;->ᛳᲈᲈᛲ()Lxhss/ᛸᲈᲈᛶ;

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p1}, Lxhss/ᛸᲈᲈᛶ;->ᛳᲁᲇᛸ()V

    .line 8
    .line 9
    .line 10
    invoke-static {p2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-ge v1, v0, :cond_1

    .line 16
    .line 17
    invoke-static {p2, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v3, p0, Lxhss/ᛲᛵᲈᲁ;->ᛱᛱᛲᲇ:Lxhss/ᲈᛱᛲᛴ;

    .line 22
    .line 23
    invoke-virtual {v3, p1, v2}, Lxhss/ᲈᛱᛲᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {p1}, Lxhss/ᛸᲈᲈᛶ;->ᛸᛲᲀᛵ()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

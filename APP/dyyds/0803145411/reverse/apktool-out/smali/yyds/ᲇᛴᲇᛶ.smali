.class public abstract Lyyds/ᲇᛴᲇᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:Ljava/util/LinkedHashSet;

.field public ᛲᲈᲁ:Lyyds/ᛴᛸᛲᛳ;

.field public ᛵᛸᛸᛷ:Ljava/lang/String;

.field public final ᛶᛷᛲᲁ:Ljava/util/LinkedHashSet;

.field public ᲀᛲᛳᲀ:Lyyds/ᛸᛸᛸᛶ;

.field public final ᲇᲇᲇᛱ:Ljava/util/LinkedHashSet;

.field public final ᲇᲈᛵᛷ:Ljava/util/LinkedHashSet;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᲇᛴᲇᛶ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lyyds/ᲇᛴᲇᛶ;->ᛲᛴᛳᛲ:Ljava/util/LinkedHashSet;

    .line 17
    .line 18
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lyyds/ᲇᛴᲇᛶ;->ᲇᲇᲇᛱ:Ljava/util/LinkedHashSet;

    .line 24
    .line 25
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lyyds/ᲇᛴᲇᛶ;->ᛶᛷᛲᲁ:Ljava/util/LinkedHashSet;

    .line 31
    .line 32
    return-void
.end method

.method public static synthetic ᛵᛸᛸᛷ(Lyyds/ᲇᛴᲇᛶ;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᲇᛴᲇᛶ;->ᛲᲈᲁ()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public abstract ᛲᲈᲁ()Ljava/util/List;
.end method

.method public ᲀᛲᛳᲀ()Ljava/util/Map;
    .locals 11

    .line 1
    iget-object v0, p0, Lyyds/ᲇᛴᲇᛶ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v1, Lkotlin/Pair;

    .line 4
    .line 5
    const-string v2, "name"

    .line 6
    .line 7
    invoke-direct {v1, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lyyds/ᲇᛴᲇᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛸᛸᛶ;

    .line 11
    .line 12
    new-instance v2, Lkotlin/Pair;

    .line 13
    .line 14
    const-string v3, "nameCondition"

    .line 15
    .line 16
    invoke-direct {v2, v3, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    new-instance v3, Lkotlin/Pair;

    .line 20
    .line 21
    const-string v0, "modifiers"

    .line 22
    .line 23
    iget-object v4, p0, Lyyds/ᲇᛴᲇᛶ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashSet;

    .line 24
    .line 25
    invoke-direct {v3, v0, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    new-instance v4, Lkotlin/Pair;

    .line 29
    .line 30
    const-string v0, "modifiersNot"

    .line 31
    .line 32
    iget-object v5, p0, Lyyds/ᲇᛴᲇᛶ;->ᛲᛴᛳᛲ:Ljava/util/LinkedHashSet;

    .line 33
    .line 34
    invoke-direct {v4, v0, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    new-instance v5, Lkotlin/Pair;

    .line 38
    .line 39
    const-string v0, "modifiersCondition"

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    invoke-direct {v5, v0, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object v0, v6

    .line 46
    new-instance v6, Lkotlin/Pair;

    .line 47
    .line 48
    const-string v7, "isSynthetic"

    .line 49
    .line 50
    invoke-direct {v6, v7, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    new-instance v7, Lkotlin/Pair;

    .line 54
    .line 55
    const-string v8, "isSyntheticNot"

    .line 56
    .line 57
    invoke-direct {v7, v8, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance v8, Lkotlin/Pair;

    .line 61
    .line 62
    const-string v9, "annotations"

    .line 63
    .line 64
    iget-object v10, p0, Lyyds/ᲇᛴᲇᛶ;->ᲇᲇᲇᛱ:Ljava/util/LinkedHashSet;

    .line 65
    .line 66
    invoke-direct {v8, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    new-instance v9, Lkotlin/Pair;

    .line 70
    .line 71
    const-string v10, "annotationsNot"

    .line 72
    .line 73
    iget-object p0, p0, Lyyds/ᲇᛴᲇᛶ;->ᛶᛷᛲᲁ:Ljava/util/LinkedHashSet;

    .line 74
    .line 75
    invoke-direct {v9, v10, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    new-instance v10, Lkotlin/Pair;

    .line 79
    .line 80
    const-string p0, "genericString"

    .line 81
    .line 82
    invoke-direct {v10, p0, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    filled-new-array/range {v1 .. v10}, [Lkotlin/Pair;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {p0}, Lyyds/ᲁᲈᛶᛴ;->ᛶᲈᛴᲈ([Lkotlin/Pair;)Ljava/util/Map;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0
.end method

.method public final ᲇᲈᛵᛷ()V
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᲇᛴᲇᛶ;->ᛲᲈᲁ:Lyyds/ᛴᛸᛲᛳ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lyyds/ᛴᛸᛲᛳ;->ᲀᛲᛳᲀ:Z

    .line 7
    .line 8
    :cond_0
    return-void
.end method

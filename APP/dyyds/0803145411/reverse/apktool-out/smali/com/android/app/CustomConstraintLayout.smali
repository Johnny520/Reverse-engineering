.class public Lcom/android/app/CustomConstraintLayout;
.super Lyyds/ᛶᛵᲀᲀ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᲀᛲᛳᲀ:Landroid/util/SparseArray;

    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᲇᲈᛵᛷ:Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance p1, Lyyds/ᛴᛵᛷᛴ;

    .line 20
    .line 21
    invoke-direct {p1}, Lyyds/ᛴᛵᛷᛴ;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛵᛷᛴ;

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    iput p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᲇᲇᲇᛱ:I

    .line 28
    .line 29
    iput p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᛶᛷᛲᲁ:I

    .line 30
    .line 31
    const p1, 0x7fffffff

    .line 32
    .line 33
    .line 34
    iput p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᛱᲈᲁ:I

    .line 35
    .line 36
    iput p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᛲᛳᛶᲁ:I

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    iput-boolean p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᛷᲈᲈᲁ:Z

    .line 40
    .line 41
    const/16 p1, 0x101

    .line 42
    .line 43
    iput p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᛷᛲᲈᛱ:I

    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    iput-object p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᛷᛵᲇᲀ:Lyyds/ᛳᛵᛸ;

    .line 47
    .line 48
    iput-object p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᛲᛲᲈᲈ:Lyyds/ᲀᲈᛶᲈ;

    .line 49
    .line 50
    const/4 v0, -0x1

    .line 51
    iput v0, p0, Lyyds/ᛶᛵᲀᲀ;->ᛱᛳᲇ:I

    .line 52
    .line 53
    new-instance v0, Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lyyds/ᛶᛵᲀᲀ;->ᛳᲁᲁᲇ:Ljava/util/HashMap;

    .line 59
    .line 60
    new-instance v0, Landroid/util/SparseArray;

    .line 61
    .line 62
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Lyyds/ᛶᛵᲀᲀ;->ᲇᛱᛲ:Landroid/util/SparseArray;

    .line 66
    .line 67
    new-instance v0, Lyyds/ᲈᛱᲁᲇ;

    .line 68
    .line 69
    invoke-direct {v0, p0, p0}, Lyyds/ᲈᛱᲁᲇ;-><init>(Lcom/android/app/CustomConstraintLayout;Lcom/android/app/CustomConstraintLayout;)V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, Lyyds/ᛶᛵᲀᲀ;->ᛶᛳᛶᛵ:Lyyds/ᲈᛱᲁᲇ;

    .line 73
    .line 74
    invoke-virtual {p0, p1}, Lyyds/ᛶᛵᲀᲀ;->ᛲᛳᛶᲁ(Landroid/util/AttributeSet;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 78
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 79
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᲀᛲᛳᲀ:Landroid/util/SparseArray;

    .line 80
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᲇᲈᛵᛷ:Ljava/util/ArrayList;

    .line 81
    new-instance p1, Lyyds/ᛴᛵᛷᛴ;

    invoke-direct {p1}, Lyyds/ᛴᛵᛷᛴ;-><init>()V

    iput-object p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛵᛷᛴ;

    const/4 p1, 0x0

    .line 82
    iput p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᲇᲇᲇᛱ:I

    .line 83
    iput p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᛶᛷᛲᲁ:I

    const p1, 0x7fffffff

    .line 84
    iput p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᛱᲈᲁ:I

    .line 85
    iput p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᛲᛳᛶᲁ:I

    const/4 p1, 0x1

    .line 86
    iput-boolean p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᛷᲈᲈᲁ:Z

    const/16 p1, 0x101

    .line 87
    iput p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᛷᛲᲈᛱ:I

    const/4 p1, 0x0

    .line 88
    iput-object p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᛷᛵᲇᲀ:Lyyds/ᛳᛵᛸ;

    .line 89
    iput-object p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᛲᛲᲈᲈ:Lyyds/ᲀᲈᛶᲈ;

    const/4 p1, -0x1

    .line 90
    iput p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᛱᛳᲇ:I

    .line 91
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᛳᲁᲁᲇ:Ljava/util/HashMap;

    .line 92
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᲇᛱᛲ:Landroid/util/SparseArray;

    .line 93
    new-instance p1, Lyyds/ᲈᛱᲁᲇ;

    invoke-direct {p1, p0, p0}, Lyyds/ᲈᛱᲁᲇ;-><init>(Lcom/android/app/CustomConstraintLayout;Lcom/android/app/CustomConstraintLayout;)V

    iput-object p1, p0, Lyyds/ᛶᛵᲀᲀ;->ᛶᛳᛶᛵ:Lyyds/ᲈᛱᲁᲇ;

    .line 94
    invoke-virtual {p0, p2}, Lyyds/ᛶᛵᲀᲀ;->ᛲᛳᛶᲁ(Landroid/util/AttributeSet;)V

    return-void
.end method

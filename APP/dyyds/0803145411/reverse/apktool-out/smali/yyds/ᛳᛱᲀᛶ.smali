.class public final Lyyds/ᛳᛱᲀᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:Landroid/content/Intent;

.field public ᛲᛳᛶᲁ:Lyyds/ᛸᛳᛴᛴ;

.field public final ᛲᛴᛳᛲ:Ljava/util/concurrent/locks/ReentrantLock;

.field public final ᛲᲈᲁ:Lcom/ss/android/ugc/awemes/WardDatabase_Impl;

.field public final ᛵᛸᛸᛷ:[Ljava/lang/String;

.field public final ᛶᛷᛲᲁ:Lyyds/ᲁᲀᛳ;

.field public final ᛷᲈᲈᲁ:Ljava/lang/Object;

.field public final ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛸᛸ;

.field public final ᲇᲇᲇᛱ:Lyyds/ᲁᲀᛳ;

.field public final ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;


# direct methods
.method public varargs constructor <init>(Lcom/ss/android/ugc/awemes/WardDatabase_Impl;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;[Ljava/lang/String;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛳᛱᲀᛶ;->ᛲᲈᲁ:Lcom/ss/android/ugc/awemes/WardDatabase_Impl;

    .line 5
    .line 6
    move-object v8, p4

    .line 7
    iput-object v8, p0, Lyyds/ᛳᛱᲀᛶ;->ᛵᛸᛸᛷ:[Ljava/lang/String;

    .line 8
    .line 9
    new-instance v9, Lyyds/ᛳᲀᛸᛸ;

    .line 10
    .line 11
    iget-boolean v10, p1, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛷᛲᲈᛱ:Z

    .line 12
    .line 13
    new-instance v0, Lyyds/ᲈᛳᲀᲈ;

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    const/16 v7, 0x8

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    const-class v3, Lyyds/ᛳᛱᲀᛶ;

    .line 20
    .line 21
    const-string v4, "notifyInvalidatedObservers"

    .line 22
    .line 23
    const-string v5, "notifyInvalidatedObservers(Ljava/util/Set;)V"

    .line 24
    .line 25
    move-object v2, p0

    .line 26
    invoke-direct/range {v0 .. v7}, Lyyds/ᲈᛳᲀᲈ;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    move-object v1, p1

    .line 30
    move-object v2, p2

    .line 31
    move-object v3, p3

    .line 32
    move-object v6, v0

    .line 33
    move-object v4, v8

    .line 34
    move-object v0, v9

    .line 35
    move v5, v10

    .line 36
    invoke-direct/range {v0 .. v6}, Lyyds/ᛳᲀᛸᛸ;-><init>(Lcom/ss/android/ugc/awemes/WardDatabase_Impl;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;[Ljava/lang/String;ZLyyds/ᲈᛳᲀᲈ;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lyyds/ᛳᛱᲀᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛸᛸ;

    .line 40
    .line 41
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 42
    .line 43
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, Lyyds/ᛳᛱᲀᛶ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;

    .line 47
    .line 48
    new-instance v1, Ljava/util/concurrent/locks/ReentrantLock;

    .line 49
    .line 50
    invoke-direct {v1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Lyyds/ᛳᛱᲀᛶ;->ᛲᛴᛳᛲ:Ljava/util/concurrent/locks/ReentrantLock;

    .line 54
    .line 55
    new-instance v1, Lyyds/ᲁᲀᛳ;

    .line 56
    .line 57
    const/16 v2, 0x1b

    .line 58
    .line 59
    invoke-direct {v1, p0, v2}, Lyyds/ᲁᲀᛳ;-><init>(Lyyds/ᛳᛱᲀᛶ;I)V

    .line 60
    .line 61
    .line 62
    iput-object v1, p0, Lyyds/ᛳᛱᲀᛶ;->ᲇᲇᲇᛱ:Lyyds/ᲁᲀᛳ;

    .line 63
    .line 64
    new-instance v1, Lyyds/ᲁᲀᛳ;

    .line 65
    .line 66
    const/16 v2, 0x1c

    .line 67
    .line 68
    invoke-direct {v1, p0, v2}, Lyyds/ᲁᲀᛳ;-><init>(Lyyds/ᛳᛱᲀᛶ;I)V

    .line 69
    .line 70
    .line 71
    iput-object v1, p0, Lyyds/ᛳᛱᲀᛶ;->ᛶᛷᛲᲁ:Lyyds/ᲁᲀᛳ;

    .line 72
    .line 73
    new-instance v1, Ljava/util/IdentityHashMap;

    .line 74
    .line 75
    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 79
    .line 80
    .line 81
    new-instance v1, Ljava/lang/Object;

    .line 82
    .line 83
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object v1, p0, Lyyds/ᛳᛱᲀᛶ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    .line 87
    .line 88
    new-instance v1, Lyyds/ᛵᲇᛵᲇ;

    .line 89
    .line 90
    const/16 v2, 0xe

    .line 91
    .line 92
    invoke-direct {v1, v2, p0}, Lyyds/ᛵᲇᛵᲇ;-><init>(ILjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iput-object v1, v0, Lyyds/ᛳᲀᛸᛸ;->ᛷᛲᲈᛱ:Lyyds/ᲁᛶᲁᲀ;

    .line 96
    .line 97
    return-void
.end method

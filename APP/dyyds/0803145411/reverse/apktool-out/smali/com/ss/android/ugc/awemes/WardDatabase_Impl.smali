.class public final Lcom/ss/android/ugc/awemes/WardDatabase_Impl;
.super Lcom/ss/android/ugc/awemes/WardDatabase;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final synthetic ᛵᛶᛲᲀ:I


# instance fields
.field public final ᛶᛳᛶᛵ:Lyyds/ᛱᛲᛶᛱ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ss/android/ugc/awemes/WardDatabase;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᛵᲇᛵᲇ;

    .line 5
    .line 6
    const/16 v1, 0x15

    .line 7
    .line 8
    invoke-direct {v0, v1, p0}, Lyyds/ᛵᲇᛵᲇ;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lyyds/ᛱᛲᛶᛱ;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lyyds/ᛱᛲᛶᛱ;-><init>(Lyyds/ᲁᛶᲁᲀ;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lcom/ss/android/ugc/awemes/WardDatabase_Impl;->ᛶᛳᛶᛵ:Lyyds/ᛱᛲᛶᛱ;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final ᛱᛳᲇ()Lyyds/ᛲᛶᲀᛱ;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/ugc/awemes/WardDatabase_Impl;->ᛶᛳᛶᛵ:Lyyds/ᛱᛲᛶᛱ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛱᛲᛶᛱ;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lyyds/ᛲᛶᲀᛱ;

    .line 8
    .line 9
    return-object p0
.end method

.method public final ᛵᛸᛸᛷ(Ljava/util/LinkedHashMap;)Ljava/util/List;
    .locals 0

    .line 1
    const-wide p0, -0xe06ce68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    new-instance p0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public final ᛶᛷᛲᲁ()Ljava/util/LinkedHashMap;
    .locals 2

    .line 1
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v0, Lyyds/ᛲᛶᲀᛱ;

    .line 7
    .line 8
    invoke-static {v0}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Lyyds/ᛸᲀᛶᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛶᲈ;

    .line 13
    .line 14
    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method public final ᲀᛲᛳᲀ()Lyyds/ᛳᛱᲀᛶ;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lyyds/ᛳᛱᲀᛶ;

    .line 12
    .line 13
    const-wide v3, -0xe056e68a836eL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    filled-new-array {v3}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-direct {v2, p0, v0, v1, v3}, Lyyds/ᛳᛱᲀᛶ;-><init>(Lcom/ss/android/ugc/awemes/WardDatabase_Impl;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;[Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v2
.end method

.method public final ᲇᲇᲇᛱ()Ljava/util/Set;
    .locals 0

    .line 1
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final ᲇᲈᛵᛷ()Lyyds/ᛲᛵᲀᛳ;
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᛲᲁᛷᛲ;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lyyds/ᛲᲁᛷᛲ;-><init>(Lcom/ss/android/ugc/awemes/WardDatabase_Impl;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

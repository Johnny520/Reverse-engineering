.class public final Lyyds/ᲁᲁᲈᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᲀᛲᛳᲀ:Lyyds/ᲁᲁᲈᛵ;


# instance fields
.field public final ᛲᲈᲁ:Ljava/util/Set;

.field public final ᛵᛸᛸᛷ:Lyyds/ᛱᛷᲈᛲ;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lyyds/ᲁᲁᲈᛵ;

    .line 7
    .line 8
    invoke-static {v0}, Lyyds/ᛷᛷᛶᲇ;->ᛳᛴᲇᛶ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, v0, v2}, Lyyds/ᲁᲁᲈᛵ;-><init>(Ljava/util/Set;Lyyds/ᛱᛷᲈᛲ;)V

    .line 14
    .line 15
    .line 16
    sput-object v1, Lyyds/ᲁᲁᲈᛵ;->ᲀᛲᛳᲀ:Lyyds/ᲁᲁᲈᛵ;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Ljava/util/Set;Lyyds/ᛱᛷᲈᛲ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲁᲁᲈᛵ;->ᛲᲈᲁ:Ljava/util/Set;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲁᲁᲈᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛷᲈᛲ;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lyyds/ᲁᲁᲈᛵ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lyyds/ᲁᲁᲈᛵ;

    .line 6
    .line 7
    iget-object v0, p1, Lyyds/ᲁᲁᲈᛵ;->ᛲᲈᲁ:Ljava/util/Set;

    .line 8
    .line 9
    iget-object v1, p0, Lyyds/ᲁᲁᲈᛵ;->ᛲᲈᲁ:Ljava/util/Set;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, Lyyds/ᲁᲁᲈᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛷᲈᛲ;

    .line 18
    .line 19
    iget-object p0, p0, Lyyds/ᲁᲁᲈᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛷᲈᛲ;

    .line 20
    .line 21
    invoke-static {p1, p0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᲁᲁᲈᛵ;->ᛲᲈᲁ:Ljava/util/Set;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit16 v0, v0, 0x5ed

    .line 8
    .line 9
    mul-int/lit8 v0, v0, 0x29

    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᲁᲁᲈᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛷᲈᛲ;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    :goto_0
    add-int/2addr v0, p0

    .line 22
    return v0
.end method

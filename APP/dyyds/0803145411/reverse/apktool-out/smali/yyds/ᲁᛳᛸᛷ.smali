.class public final Lyyds/ᲁᛳᛸᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲇᛴᲁᲁ;


# instance fields
.field public final ᛲᛴᛳᛲ:Lyyds/ᛴᲈᛳᛶ;

.field public final ᲀᛲᛳᲀ:Lyyds/ᲈᛳᛵᲇ;

.field public final ᲇᲇᲇᛱ:Ljava/lang/Object;

.field public final ᲇᲈᛵᛷ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lyyds/ᲈᛳᛵᲇ;Ljava/lang/Object;Lyyds/ᛴᲈᛳᛶ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲁᛳᛸᛷ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛳᛵᲇ;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lyyds/ᲁᛳᛸᛷ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p3, p0, Lyyds/ᲁᛳᛸᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛴᲈᛳᛶ;

    .line 13
    .line 14
    invoke-virtual {p1, p2, p2, p3}, Lyyds/ᲈᛳᛵᲇ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛴᲈᛳᛶ;)Lyyds/ᛸᛴᛷᲇ;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/4 p2, 0x1

    .line 19
    invoke-virtual {p1, p2}, Lyyds/ᛸᛴᛷᲇ;->ᲀᛲᛳᲀ(Z)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lyyds/ᲁᛳᛸᛷ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    const-class v2, Lyyds/ᲁᛳᛸᛷ;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Lyyds/ᲁᛳᛸᛷ;

    .line 18
    .line 19
    iget-object v2, p0, Lyyds/ᲁᛳᛸᛷ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛳᛵᲇ;

    .line 20
    .line 21
    iget-object v3, p1, Lyyds/ᲁᛳᛸᛷ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛳᛵᲇ;

    .line 22
    .line 23
    if-eq v2, v3, :cond_2

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    iget-object v2, p0, Lyyds/ᲁᛳᛸᛷ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v3, p1, Lyyds/ᲁᛳᛸᛷ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    iget-object p0, p0, Lyyds/ᲁᛳᛸᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛴᲈᛳᛶ;

    .line 37
    .line 38
    iget-object p1, p1, Lyyds/ᲁᛳᛸᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛴᲈᛳᛶ;

    .line 39
    .line 40
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_3

    .line 45
    .line 46
    return v0

    .line 47
    :cond_3
    :goto_0
    return v1
.end method

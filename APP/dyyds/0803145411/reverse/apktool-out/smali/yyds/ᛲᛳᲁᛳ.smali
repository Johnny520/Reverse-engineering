.class public final Lyyds/ᛲᛳᲁᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛵᲈᛴᛷ;
.implements Lyyds/ᲇᛱᛱᛴ;


# instance fields
.field public final ᛲᲈᲁ:Lyyds/ᛵᲈᛴᛷ;

.field public final ᛵᛸᛸᛷ:I


# direct methods
.method public constructor <init>(Lyyds/ᛵᲈᛴᛷ;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛲᛳᲁᛳ;->ᛲᲈᲁ:Lyyds/ᛵᲈᛴᛷ;

    .line 5
    .line 6
    iput p2, p0, Lyyds/ᛲᛳᲁᛳ;->ᛵᛸᛸᛷ:I

    .line 7
    .line 8
    if-ltz p2, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string p1, "count must be non-negative, but was "

    .line 14
    .line 15
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const/16 p1, 0x2e

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᛴᛵᛸᲁ;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lyyds/ᛴᛵᛸᲁ;-><init>(Lyyds/ᛲᛳᲁᛳ;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final ᛲᲈᲁ(I)Lyyds/ᛵᲈᛴᛷ;
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛲᛳᲁᛳ;->ᛵᛸᛸᛷ:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    if-gez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lyyds/ᛲᛳᲁᛳ;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lyyds/ᛲᛳᲁᛳ;-><init>(Lyyds/ᛵᲈᛴᛷ;I)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance p1, Lyyds/ᛲᛳᲁᛳ;

    .line 13
    .line 14
    iget-object p0, p0, Lyyds/ᛲᛳᲁᛳ;->ᛲᲈᲁ:Lyyds/ᛵᲈᛴᛷ;

    .line 15
    .line 16
    invoke-direct {p1, p0, v0}, Lyyds/ᛲᛳᲁᛳ;-><init>(Lyyds/ᛵᲈᛴᛷ;I)V

    .line 17
    .line 18
    .line 19
    return-object p1
.end method

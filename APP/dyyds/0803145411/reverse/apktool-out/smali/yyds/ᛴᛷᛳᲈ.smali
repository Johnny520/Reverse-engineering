.class public final Lyyds/ᛴᛷᛳᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/CharSequence;


# instance fields
.field public ᲀᛲᛳᲀ:[C

.field public ᲇᲈᛵᛷ:Ljava/lang/String;


# virtual methods
.method public final charAt(I)C
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛴᛷᛳᲈ;->ᲀᛲᛳᲀ:[C

    .line 2
    .line 3
    aget-char p0, p0, p1

    .line 4
    .line 5
    return p0
.end method

.method public final length()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛴᛷᛳᲈ;->ᲀᛲᛳᲀ:[C

    .line 2
    .line 3
    array-length p0, p0

    .line 4
    return p0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛴᛷᛳᲈ;->ᲀᛲᛳᲀ:[C

    .line 4
    .line 5
    sub-int/2addr p2, p1

    .line 6
    invoke-direct {v0, p0, p1, p2}, Ljava/lang/String;-><init>([CII)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛷᛳᲈ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, Lyyds/ᛴᛷᛳᲈ;->ᲀᛲᛳᲀ:[C

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lyyds/ᛴᛷᛳᲈ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

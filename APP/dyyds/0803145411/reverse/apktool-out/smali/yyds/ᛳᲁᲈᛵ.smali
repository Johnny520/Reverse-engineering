.class public final Lyyds/ᛳᲁᲈᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛶᲀᛶᲀ;


# instance fields
.field public ᛱᲈᲁ:I

.field public ᛲᛴᛳᛲ:Ljava/lang/String;

.field public final ᛵᛸᛸᛷ:Lyyds/ᲁᛳᛵᛲ;

.field public volatile ᛶᛷᛲᲁ:[B

.field public final ᲀᛲᛳᲀ:Ljava/net/URL;

.field public ᲇᲇᲇᛱ:Ljava/net/URL;

.field public final ᲇᲈᛵᛷ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Lyyds/ᲁᛳᛵᛲ;->ᛲᲈᲁ:Lyyds/ᲇᛶᛱᛸ;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, p0, Lyyds/ᛳᲁᲈᛵ;->ᲀᛲᛳᲀ:Ljava/net/URL;

    .line 8
    .line 9
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    iput-object p1, p0, Lyyds/ᛳᲁᲈᛵ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 16
    .line 17
    const-string p1, "Argument must not be null"

    .line 18
    .line 19
    invoke-static {v0, p1}, Lyyds/ᛲᛳᲁ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lyyds/ᛳᲁᲈᛵ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛳᛵᛲ;

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const-string p0, "Must not be null or empty"

    .line 26
    .line 27
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v1
.end method

.method public constructor <init>(Ljava/net/URL;)V
    .locals 2

    .line 31
    sget-object v0, Lyyds/ᲁᛳᛵᛲ;->ᛲᲈᲁ:Lyyds/ᲇᛶᛱᛸ;

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const-string v1, "Argument must not be null"

    invoke-static {p1, v1}, Lyyds/ᛲᛳᲁ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    iput-object p1, p0, Lyyds/ᛳᲁᲈᛵ;->ᲀᛲᛳᲀ:Ljava/net/URL;

    const/4 p1, 0x0

    .line 35
    iput-object p1, p0, Lyyds/ᛳᲁᲈᛵ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 36
    invoke-static {v0, v1}, Lyyds/ᛲᛳᲁ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    iput-object v0, p0, Lyyds/ᛳᲁᲈᛵ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛳᛵᛲ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lyyds/ᛳᲁᲈᛵ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lyyds/ᛳᲁᲈᛵ;

    .line 6
    .line 7
    invoke-virtual {p0}, Lyyds/ᛳᲁᲈᛵ;->ᲀᛲᛳᲀ()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1}, Lyyds/ᛳᲁᲈᛵ;->ᲀᛲᛳᲀ()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, Lyyds/ᛳᲁᲈᛵ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛳᛵᛲ;

    .line 22
    .line 23
    iget-object p1, p1, Lyyds/ᛳᲁᲈᛵ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛳᛵᛲ;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_0
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛳᲁᲈᛵ;->ᛱᲈᲁ:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛳᲁᲈᛵ;->ᲀᛲᛳᲀ()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput v0, p0, Lyyds/ᛳᲁᲈᛵ;->ᛱᲈᲁ:I

    .line 14
    .line 15
    mul-int/lit8 v0, v0, 0x1f

    .line 16
    .line 17
    iget-object v1, p0, Lyyds/ᛳᲁᲈᛵ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛳᛵᛲ;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    add-int/2addr v1, v0

    .line 24
    iput v1, p0, Lyyds/ᛳᲁᲈᛵ;->ᛱᲈᲁ:I

    .line 25
    .line 26
    return v1

    .line 27
    :cond_0
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛳᲁᲈᛵ;->ᲀᛲᛳᲀ()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final ᛵᛸᛸᛷ(Ljava/security/MessageDigest;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛳᲁᲈᛵ;->ᛶᛷᛲᲁ:[B

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛳᲁᲈᛵ;->ᲀᛲᛳᲀ()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lyyds/ᛶᲀᛶᲀ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lyyds/ᛳᲁᲈᛵ;->ᛶᛷᛲᲁ:[B

    .line 16
    .line 17
    :cond_0
    iget-object p0, p0, Lyyds/ᛳᲁᲈᛵ;->ᛶᛷᛲᲁ:[B

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final ᲀᛲᛳᲀ()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛳᲁᲈᛵ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "Argument must not be null"

    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᛳᲁᲈᛵ;->ᲀᛲᛳᲀ:Ljava/net/URL;

    .line 9
    .line 10
    invoke-static {p0, v0}, Lyyds/ᛲᛳᲁ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final ᲇᲈᛵᛷ()Ljava/net/URL;
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛳᲁᲈᛵ;->ᲇᲇᲇᛱ:Ljava/net/URL;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    new-instance v0, Ljava/net/URL;

    .line 6
    .line 7
    iget-object v1, p0, Lyyds/ᛳᲁᲈᛵ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, Lyyds/ᛳᲁᲈᛵ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const-string v1, "Argument must not be null"

    .line 24
    .line 25
    iget-object v2, p0, Lyyds/ᛳᲁᲈᛵ;->ᲀᛲᛳᲀ:Ljava/net/URL;

    .line 26
    .line 27
    invoke-static {v2, v1}, Lyyds/ᛲᛳᲁ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :cond_0
    const-string v2, "@#&=*+-_.,:!?()/~\'%;$[]"

    .line 35
    .line 36
    invoke-static {v1, v2}, Landroid/net/Uri;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iput-object v1, p0, Lyyds/ᛳᲁᲈᛵ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 41
    .line 42
    :cond_1
    iget-object v1, p0, Lyyds/ᛳᲁᲈᛵ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 43
    .line 44
    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lyyds/ᛳᲁᲈᛵ;->ᲇᲇᲇᛱ:Ljava/net/URL;

    .line 48
    .line 49
    :cond_2
    return-object v0
.end method

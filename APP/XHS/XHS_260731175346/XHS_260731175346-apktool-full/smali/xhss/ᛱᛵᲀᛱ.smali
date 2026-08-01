.class public final Lxhss/ᛱᛵᲀᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛷᛴᛷᛱ:Lxhss/ᛳᛶᲈᲈ;

.field public static final ᛸᛲᲀᛵ:Lxhss/ᛳᛶᲈᲈ;

.field public static final ᛸᛴᛶᛳ:Lxhss/ᛳᛶᲈᲈ;

.field public static final ᲀᲇᛳᲁ:Lxhss/ᛳᛶᲈᲈ;

.field public static final ᲇᛴᲇᛵ:Lxhss/ᛳᛶᲈᲈ;

.field public static final ᲇᛶᛴᲀ:Lxhss/ᛳᛶᲈᲈ;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᛳᛶᲈᲈ;

.field public final ᛳᲁᲇᛸ:I

.field public final ᛷᛵᛵᲈ:Lxhss/ᛳᛶᲈᲈ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, ":"

    .line 2
    .line 3
    invoke-static {v0}, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ(Ljava/lang/String;)Lxhss/ᛳᛶᲈᲈ;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lxhss/ᛱᛵᲀᛱ;->ᲇᛴᲇᛵ:Lxhss/ᛳᛶᲈᲈ;

    .line 8
    .line 9
    const-string v0, ":status"

    .line 10
    .line 11
    invoke-static {v0}, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ(Ljava/lang/String;)Lxhss/ᛳᛶᲈᲈ;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lxhss/ᛱᛵᲀᛱ;->ᛷᛴᛷᛱ:Lxhss/ᛳᛶᲈᲈ;

    .line 16
    .line 17
    const-string v0, ":method"

    .line 18
    .line 19
    invoke-static {v0}, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ(Ljava/lang/String;)Lxhss/ᛳᛶᲈᲈ;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lxhss/ᛱᛵᲀᛱ;->ᲇᛶᛴᲀ:Lxhss/ᛳᛶᲈᲈ;

    .line 24
    .line 25
    const-string v0, ":path"

    .line 26
    .line 27
    invoke-static {v0}, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ(Ljava/lang/String;)Lxhss/ᛳᛶᲈᲈ;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lxhss/ᛱᛵᲀᛱ;->ᲀᲇᛳᲁ:Lxhss/ᛳᛶᲈᲈ;

    .line 32
    .line 33
    const-string v0, ":scheme"

    .line 34
    .line 35
    invoke-static {v0}, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ(Ljava/lang/String;)Lxhss/ᛳᛶᲈᲈ;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lxhss/ᛱᛵᲀᛱ;->ᛸᛴᛶᛳ:Lxhss/ᛳᛶᲈᲈ;

    .line 40
    .line 41
    const-string v0, ":authority"

    .line 42
    .line 43
    invoke-static {v0}, Lxhss/ᲈᲀᲀᛱ;->ᲇᛴᲇᛵ(Ljava/lang/String;)Lxhss/ᛳᛶᲈᲈ;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lxhss/ᛱᛵᲀᛱ;->ᛸᛲᲀᛵ:Lxhss/ᛳᛶᲈᲈ;

    .line 48
    .line 49
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lxhss/ᛳᛶᲈᲈ;

    .line 2
    .line 3
    sget-object v1, Lxhss/ᛶᲈᲇᲇ;->ᛷᛵᛵᲈ:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v0, v2}, Lxhss/ᛳᛶᲈᲈ;-><init>([B)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lxhss/ᛳᛶᲈᲈ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 13
    .line 14
    new-instance p1, Lxhss/ᛳᛶᲈᲈ;

    .line 15
    .line 16
    invoke-virtual {p2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-direct {p1, v1}, Lxhss/ᛳᛶᲈᲈ;-><init>([B)V

    .line 21
    .line 22
    .line 23
    iput-object p2, p1, Lxhss/ᛳᛶᲈᲈ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 24
    .line 25
    invoke-direct {p0, v0, p1}, Lxhss/ᛱᛵᲀᛱ;-><init>(Lxhss/ᛳᛶᲈᲈ;Lxhss/ᛳᛶᲈᲈ;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Lxhss/ᛳᛶᲈᲈ;Ljava/lang/String;)V
    .locals 2

    .line 34
    new-instance v0, Lxhss/ᛳᛶᲈᲈ;

    .line 35
    sget-object v1, Lxhss/ᛶᲈᲇᲇ;->ᛷᛵᛵᲈ:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 36
    invoke-direct {v0, v1}, Lxhss/ᛳᛶᲈᲈ;-><init>([B)V

    .line 37
    iput-object p2, v0, Lxhss/ᛳᛶᲈᲈ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 38
    invoke-direct {p0, p1, v0}, Lxhss/ᛱᛵᲀᛱ;-><init>(Lxhss/ᛳᛶᲈᲈ;Lxhss/ᛳᛶᲈᲈ;)V

    return-void
.end method

.method public constructor <init>(Lxhss/ᛳᛶᲈᲈ;Lxhss/ᛳᛶᲈᲈ;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lxhss/ᛱᛵᲀᛱ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛶᲈᲈ;

    .line 31
    iput-object p2, p0, Lxhss/ᛱᛵᲀᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛳᛶᲈᲈ;

    .line 32
    invoke-virtual {p1}, Lxhss/ᛳᛶᲈᲈ;->ᛷᛵᛵᲈ()I

    move-result p1

    add-int/lit8 p1, p1, 0x20

    invoke-virtual {p2}, Lxhss/ᛳᛶᲈᲈ;->ᛷᛵᛵᲈ()I

    move-result p2

    add-int/2addr p2, p1

    .line 33
    iput p2, p0, Lxhss/ᛱᛵᲀᛱ;->ᛳᲁᲇᛸ:I

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
    instance-of v1, p1, Lxhss/ᛱᛵᲀᛱ;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lxhss/ᛱᛵᲀᛱ;

    .line 12
    .line 13
    iget-object v1, p0, Lxhss/ᛱᛵᲀᛱ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛶᲈᲈ;

    .line 14
    .line 15
    iget-object v3, p1, Lxhss/ᛱᛵᲀᛱ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛶᲈᲈ;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object p0, p0, Lxhss/ᛱᛵᲀᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛳᛶᲈᲈ;

    .line 25
    .line 26
    iget-object p1, p1, Lxhss/ᛱᛵᲀᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛳᛶᲈᲈ;

    .line 27
    .line 28
    invoke-static {p0, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lxhss/ᛱᛵᲀᛱ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛶᲈᲈ;

    .line 2
    .line 3
    invoke-virtual {v0}, Lxhss/ᛳᛶᲈᲈ;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, Lxhss/ᛱᛵᲀᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛳᛶᲈᲈ;

    .line 10
    .line 11
    invoke-virtual {p0}, Lxhss/ᛳᛶᲈᲈ;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object v1, p0, Lxhss/ᛱᛵᲀᛱ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛶᲈᲈ;

    .line 4
    .line 5
    invoke-virtual {v1}, Lxhss/ᛳᛶᲈᲈ;->ᛸᛷᲈᲈ()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, ": "

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lxhss/ᛱᛵᲀᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛳᛶᲈᲈ;

    .line 18
    .line 19
    invoke-virtual {p0}, Lxhss/ᛳᛶᲈᲈ;->ᛸᛷᲈᲈ()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

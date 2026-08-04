.class public final Lyyds/ᛴᛲᲁᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᲀᛲᛳᲀ:Lyyds/ᛱᛱᛳᲈ;

.field public static final ᲇᲈᛵᛷ:Lyyds/ᛱᛱᛳᲈ;


# instance fields
.field public final ᛲᲈᲁ:Ljava/lang/String;

.field public final ᛵᛸᛸᛷ:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛱᛱᛳᲈ;

    .line 2
    .line 3
    const-string v1, "([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lyyds/ᛱᛱᛳᲈ;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lyyds/ᛴᛲᲁᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛱᛳᲈ;

    .line 9
    .line 10
    new-instance v0, Lyyds/ᛱᛱᛳᲈ;

    .line 11
    .line 12
    const-string v1, ";\\s*(?:([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)|\"([^\"]*)\"))?"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lyyds/ᛱᛱᛳᲈ;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lyyds/ᛴᛲᲁᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛱᛳᲈ;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>([Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lyyds/ᛴᛲᲁᲈ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p1, p0, Lyyds/ᛴᛲᲁᲈ;->ᛵᛸᛸᛷ:[Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static ᛲᲈᲁ(Lyyds/ᛴᛲᲁᲈ;)Ljava/nio/charset/Charset;
    .locals 5

    .line 1
    iget-object p0, p0, Lyyds/ᛴᛲᲁᲈ;->ᛵᛸᛸᛷ:[Ljava/lang/String;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v2, v0, v1}, Lyyds/ᲀᛳᛳᛱ;->ᲇᲇᲇᛱ(III)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-ltz v0, :cond_1

    .line 14
    .line 15
    :goto_0
    aget-object v3, p0, v2

    .line 16
    .line 17
    const-string v4, "charset"

    .line 18
    .line 19
    invoke-static {v3, v4}, Lyyds/ᛳᲀᲈᛷ;->ᛳᛸᛴᛶ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    aget-object p0, p0, v2

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    if-eq v2, v0, :cond_1

    .line 31
    .line 32
    add-int/lit8 v2, v2, 0x2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object p0, v1

    .line 36
    :goto_1
    if-nez p0, :cond_2

    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_2
    :try_start_0
    invoke-static {p0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 40
    .line 41
    .line 42
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    return-object p0

    .line 44
    :catch_0
    return-object v1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lyyds/ᛴᛲᲁᲈ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lyyds/ᛴᛲᲁᲈ;

    .line 6
    .line 7
    iget-object p1, p1, Lyyds/ᛴᛲᲁᲈ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᛴᛲᲁᲈ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {p1, p0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛴᛲᲁᲈ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛴᛲᲁᲈ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

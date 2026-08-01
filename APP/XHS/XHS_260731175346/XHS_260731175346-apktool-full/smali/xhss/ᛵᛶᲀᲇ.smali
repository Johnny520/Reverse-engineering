.class public abstract Lxhss/ᛵᛶᲀᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static ᛱᛱᛲᲇ:Z

.field public static final ᛳᲁᲇᛸ:Lxhss/ᛶᛲᛷᛵ;

.field public static final ᛷᛴᛷᛱ:Lxhss/ᛶᛲᛷᛵ;

.field public static ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛶ;

.field public static final ᛸᛲᲀᛵ:Lxhss/ᛳᛵᲁᛵ;

.field public static final ᛸᛴᛶᛳ:Lxhss/ᛳᛵᲁᛵ;

.field public static final ᲀᲇᛳᲁ:Lxhss/ᛶᛲᛷᛵ;

.field public static final ᲇᛴᲇᛵ:Lxhss/ᛶᛲᛷᛵ;

.field public static final ᲇᛶᛴᲀ:Lxhss/ᛶᛲᛷᛵ;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lxhss/ᛶᛲᛷᛵ;

    .line 2
    .line 3
    const-string v1, "COMPLETING_ALREADY"

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v0, v1, v2}, Lxhss/ᛶᛲᛷᛵ;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lxhss/ᛵᛶᲀᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛶᛲᛷᛵ;

    .line 10
    .line 11
    new-instance v0, Lxhss/ᛶᛲᛷᛵ;

    .line 12
    .line 13
    const-string v1, "COMPLETING_WAITING_CHILDREN"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lxhss/ᛶᛲᛷᛵ;-><init>(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lxhss/ᛵᛶᲀᲇ;->ᲇᛴᲇᛵ:Lxhss/ᛶᛲᛷᛵ;

    .line 19
    .line 20
    new-instance v0, Lxhss/ᛶᛲᛷᛵ;

    .line 21
    .line 22
    const-string v1, "COMPLETING_RETRY"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Lxhss/ᛶᛲᛷᛵ;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lxhss/ᛵᛶᲀᲇ;->ᛷᛴᛷᛱ:Lxhss/ᛶᛲᛷᛵ;

    .line 28
    .line 29
    new-instance v0, Lxhss/ᛶᛲᛷᛵ;

    .line 30
    .line 31
    const-string v1, "TOO_LATE_TO_CANCEL"

    .line 32
    .line 33
    invoke-direct {v0, v1, v2}, Lxhss/ᛶᛲᛷᛵ;-><init>(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lxhss/ᛵᛶᲀᲇ;->ᲇᛶᛴᲀ:Lxhss/ᛶᛲᛷᛵ;

    .line 37
    .line 38
    new-instance v0, Lxhss/ᛶᛲᛷᛵ;

    .line 39
    .line 40
    const-string v1, "SEALED"

    .line 41
    .line 42
    invoke-direct {v0, v1, v2}, Lxhss/ᛶᛲᛷᛵ;-><init>(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lxhss/ᛵᛶᲀᲇ;->ᲀᲇᛳᲁ:Lxhss/ᛶᛲᛷᛵ;

    .line 46
    .line 47
    new-instance v0, Lxhss/ᛳᛵᲁᛵ;

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-direct {v0, v1}, Lxhss/ᛳᛵᲁᛵ;-><init>(Z)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lxhss/ᛵᛶᲀᲇ;->ᛸᛴᛶᛳ:Lxhss/ᛳᛵᲁᛵ;

    .line 54
    .line 55
    new-instance v0, Lxhss/ᛳᛵᲁᛵ;

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    invoke-direct {v0, v1}, Lxhss/ᛳᛵᲁᛵ;-><init>(Z)V

    .line 59
    .line 60
    .line 61
    sput-object v0, Lxhss/ᛵᛶᲀᲇ;->ᛸᛲᲀᛵ:Lxhss/ᛳᛵᲁᛵ;

    .line 62
    .line 63
    return-void
.end method

.method public static final ᛱᛱᛲᲇ(II)V
    .locals 3

    .line 1
    if-gt p0, p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v2, "toIndex ("

    .line 9
    .line 10
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string p0, ") is greater than size ("

    .line 17
    .line 18
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p0, ")."

    .line 25
    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0
.end method

.method public static ᛳᲁᲇᛸ(Ljava/lang/String;)V
    .locals 5

    .line 1
    const-wide v0, -0xfd001b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const-wide v2, -0xfce91b858845L

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p0, v2, v3}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛴᛶᛳ(JLjava/lang/String;J)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    :goto_0
    if-ge v1, v0, :cond_2

    .line 24
    .line 25
    add-int/lit16 v2, v1, 0x7d0

    .line 26
    .line 27
    if-le v2, v0, :cond_1

    .line 28
    .line 29
    move v2, v0

    .line 30
    :cond_1
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-wide v3, -0xfcf11b858845L

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    sget-object v3, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, Lxhss/ᲇᲁᛱᛸ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    move v1, v2

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    :goto_1
    return-void
.end method

.method public static ᛷᛴᛷᛱ(Landroid/view/Display;I)Lxhss/ᛷᲈᲇᛸ;
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_3

    .line 7
    .line 8
    invoke-static {p0, p1}, Lxhss/ᲇᛳᛶᛴ;->ᲀᲇᛳᲁ(Landroid/view/Display;I)Landroid/view/RoundedCorner;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_3

    .line 13
    .line 14
    new-instance p1, Lxhss/ᛷᲈᲇᛸ;

    .line 15
    .line 16
    invoke-static {p0}, Lxhss/ᲇᛳᛶᛴ;->ᛱᛱᛲᲇ(Landroid/view/RoundedCorner;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    if-eq v0, v1, :cond_2

    .line 24
    .line 25
    const/4 v1, 0x2

    .line 26
    if-eq v0, v1, :cond_2

    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    if-ne v0, v1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-string p0, "Invalid position: "

    .line 33
    .line 34
    invoke-static {p0, v0}, Lxhss/ᛴᛸᛲᛳ;->ᛶᲇᲈᛸ(Ljava/lang/String;I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object v2

    .line 42
    :cond_1
    const/4 v1, 0x0

    .line 43
    :cond_2
    :goto_0
    invoke-static {p0}, Lxhss/ᲇᛳᛶᛴ;->ᛸᛴᛶᛳ(Landroid/view/RoundedCorner;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-static {p0}, Lxhss/ᲇᛳᛶᛴ;->ᛳᲁᲇᛸ(Landroid/view/RoundedCorner;)Landroid/graphics/Point;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-direct {p1, v1, v0, p0}, Lxhss/ᛷᲈᲇᛸ;-><init>(IILandroid/graphics/Point;)V

    .line 52
    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_3
    return-object v2
.end method

.method public static ᛷᲁᲁ(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const-class p0, Ljava/lang/Integer;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 9
    .line 10
    if-ne p0, v0, :cond_1

    .line 11
    .line 12
    const-class p0, Ljava/lang/Float;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    if-ne p0, v0, :cond_2

    .line 18
    .line 19
    const-class p0, Ljava/lang/Byte;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_2
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    if-ne p0, v0, :cond_3

    .line 25
    .line 26
    const-class p0, Ljava/lang/Double;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_3
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 30
    .line 31
    if-ne p0, v0, :cond_4

    .line 32
    .line 33
    const-class p0, Ljava/lang/Long;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_4
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 37
    .line 38
    if-ne p0, v0, :cond_5

    .line 39
    .line 40
    const-class p0, Ljava/lang/Character;

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_5
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    if-ne p0, v0, :cond_6

    .line 46
    .line 47
    const-class p0, Ljava/lang/Boolean;

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_6
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 51
    .line 52
    if-ne p0, v0, :cond_7

    .line 53
    .line 54
    const-class p0, Ljava/lang/Short;

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_7
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 58
    .line 59
    if-ne p0, v0, :cond_8

    .line 60
    .line 61
    const-class p0, Ljava/lang/Void;

    .line 62
    .line 63
    :cond_8
    return-object p0
.end method

.method public static final ᛸᛲᲀᛵ([Ljava/lang/Object;IILxhss/ᛸᛶᲈᛶ;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    mul-int/lit8 v1, p2, 0x3

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x2

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const-string v1, "["

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, p2, :cond_2

    .line 17
    .line 18
    if-lez v1, :cond_0

    .line 19
    .line 20
    const-string v2, ", "

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    :cond_0
    add-int v2, p1, v1

    .line 26
    .line 27
    aget-object v2, p0, v2

    .line 28
    .line 29
    if-ne v2, p3, :cond_1

    .line 30
    .line 31
    const-string v2, "(this Collection)"

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    const-string p0, "]"

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method

.method public static final ᛸᛴᛶᛳ(Lxhss/ᛷᛷᛱᛵ;I)I
    .locals 4

    .line 1
    iget-object v0, p0, Lxhss/ᛷᛷᛱᛵ;->ᲀᲇᛳᲁ:[I

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    iget-object p0, p0, Lxhss/ᛷᛷᛱᛵ;->ᲇᛶᛴᲀ:[[B

    .line 6
    .line 7
    array-length p0, p0

    .line 8
    add-int/lit8 p0, p0, -0x1

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-gt v1, p0, :cond_1

    .line 12
    .line 13
    add-int v2, v1, p0

    .line 14
    .line 15
    ushr-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    aget v3, v0, v2

    .line 18
    .line 19
    if-ge v3, p1, :cond_0

    .line 20
    .line 21
    add-int/lit8 v1, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    if-le v3, p1, :cond_2

    .line 25
    .line 26
    add-int/lit8 p0, v2, -0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    neg-int p0, v1

    .line 30
    add-int/lit8 v2, p0, -0x1

    .line 31
    .line 32
    :cond_2
    if-ltz v2, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    not-int p0, v2

    .line 36
    return p0
.end method

.method public static final ᛸᛷᲈᲈ(Ljava/lang/reflect/Type;)Ljava/lang/Class;
    .locals 3

    .line 1
    instance-of v0, p0, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Class;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Lxhss/ᛵᛶᲀᲇ;->ᛸᛷᲈᲈ(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    new-instance v0, Lxhss/ᲇᛲᛶᛸ;

    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v2, "Cannot cast type "

    .line 28
    .line 29
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p0, " to java.lang.Class object."

    .line 36
    .line 37
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-direct {v0, p0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v0
.end method

.method public static final ᲀᲇᛳᲁ([Ljava/lang/Object;II)V
    .locals 1

    .line 1
    :goto_0
    if-ge p1, p2, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aput-object v0, p0, p1

    .line 5
    .line 6
    add-int/lit8 p1, p1, 0x1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    return-void
.end method

.method public static final ᲇᛴᲇᛵ(Lxhss/ᛴᛵᛳᛵ;Lxhss/ᛴᛵᛳᛵ;Z)Lxhss/ᛴᛵᛳᛵ;
    .locals 3

    .line 1
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    new-instance v0, Lxhss/ᲇᛵᲈᛵ;

    .line 4
    .line 5
    const/4 v1, 0x4

    .line 6
    invoke-direct {v0, v1}, Lxhss/ᲇᛵᲈᛵ;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p0, p2, v0}, Lxhss/ᛴᛵᛳᛵ;->ᛳᲁᲇᛸ(Ljava/lang/Object;Lxhss/ᛵᲇᛱᛴ;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    new-instance v2, Lxhss/ᲇᛵᲈᛵ;

    .line 20
    .line 21
    invoke-direct {v2, v1}, Lxhss/ᲇᛵᲈᛵ;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1, p2, v2}, Lxhss/ᛴᛵᛳᛵ;->ᛳᲁᲇᛸ(Ljava/lang/Object;Lxhss/ᛵᲇᛱᛴ;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    check-cast p2, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    if-nez p2, :cond_0

    .line 37
    .line 38
    invoke-interface {p0, p1}, Lxhss/ᛴᛵᛳᛵ;->ᲀᲇᛳᲁ(Lxhss/ᛴᛵᛳᛵ;)Lxhss/ᛴᛵᛳᛵ;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_0
    new-instance v0, Lxhss/ᲇᛵᲈᛵ;

    .line 44
    .line 45
    const/4 v1, 0x2

    .line 46
    invoke-direct {v0, v1}, Lxhss/ᲇᛵᲈᛵ;-><init>(I)V

    .line 47
    .line 48
    .line 49
    sget-object v1, Lxhss/ᲇᛷᲁᛷ;->ᛱᛱᛲᲇ:Lxhss/ᲇᛷᲁᛷ;

    .line 50
    .line 51
    invoke-interface {p0, v1, v0}, Lxhss/ᛴᛵᛳᛵ;->ᛳᲁᲇᛸ(Ljava/lang/Object;Lxhss/ᛵᲇᛱᛴ;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, Lxhss/ᛴᛵᛳᛵ;

    .line 56
    .line 57
    if-eqz p2, :cond_1

    .line 58
    .line 59
    check-cast p1, Lxhss/ᛴᛵᛳᛵ;

    .line 60
    .line 61
    new-instance p2, Lxhss/ᲇᛵᲈᛵ;

    .line 62
    .line 63
    const/4 v0, 0x3

    .line 64
    invoke-direct {p2, v0}, Lxhss/ᲇᛵᲈᛵ;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-interface {p1, v1, p2}, Lxhss/ᛴᛵᛳᛵ;->ᛳᲁᲇᛸ(Ljava/lang/Object;Lxhss/ᛵᲇᛱᛴ;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    :cond_1
    check-cast p1, Lxhss/ᛴᛵᛳᛵ;

    .line 72
    .line 73
    invoke-interface {p0, p1}, Lxhss/ᛴᛵᛳᛵ;->ᲀᲇᛳᲁ(Lxhss/ᛴᛵᛳᛵ;)Lxhss/ᛴᛵᛳᛵ;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0
.end method

.method public static ᲇᛶᛴᲀ(III)I
    .locals 1

    .line 1
    and-int/lit8 p1, p1, 0x8

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    add-int/lit8 p0, p0, -0x1

    .line 6
    .line 7
    :cond_0
    if-gt p2, p0, :cond_1

    .line 8
    .line 9
    sub-int/2addr p0, p2

    .line 10
    return p0

    .line 11
    :cond_1
    const-string p1, "PROTOCOL_ERROR padding "

    .line 12
    .line 13
    const-string v0, " > remaining length "

    .line 14
    .line 15
    invoke-static {p2, p0, p1, v0}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᲈᛶ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public static final ᲈᛳᲀ(Lxhss/ᛸᛴᛳᛷ;Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)Lxhss/ᲈᲇᛵ;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    sget-object v1, Lxhss/ᲈᲁᲇ;->ᛱᛱᛲᲇ:Lxhss/ᲈᲁᲇ;

    .line 6
    .line 7
    invoke-interface {p1, v1}, Lxhss/ᛴᛵᛳᛵ;->ᲇᛴᲇᛵ(Lxhss/ᲇᲁᛵᲈ;)Lxhss/ᛳᛵᲈᛲ;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_4

    .line 12
    .line 13
    :cond_1
    instance-of v1, p0, Lxhss/ᛳᛱᲈ;

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    invoke-interface {p0}, Lxhss/ᛱᲇᲀᛷ;->ᛷᛴᛷᛱ()Lxhss/ᛱᲇᲀᛷ;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-nez p0, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    instance-of v1, p0, Lxhss/ᲈᲇᛵ;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    move-object v0, p0

    .line 30
    check-cast v0, Lxhss/ᲈᲇᛵ;

    .line 31
    .line 32
    :goto_0
    if-eqz v0, :cond_4

    .line 33
    .line 34
    invoke-virtual {v0, p1, p2}, Lxhss/ᲈᲇᛵ;->ᛷᛸᛷ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :cond_4
    :goto_1
    return-object v0
.end method


# virtual methods
.method public abstract ᛷᛵᛵᲈ(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
.end method

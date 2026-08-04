.class public final Lyyds/ᛲᛷᛴᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public ᛵᛸᛸᛷ:I

.field public ᲀᛲᛳᲀ:I

.field public final ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛲᲈᲁ:I

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    .line 107
    new-array v0, v0, [Lyyds/ᛲᛷᛴᛵ;

    iput-object v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 108
    iput v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 109
    iput v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᲀᛲᛳᲀ:I

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛲᲈᲁ:I

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 111
    iput-object v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 112
    iput p1, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    and-int/lit8 p1, p2, 0x7

    if-nez p1, :cond_0

    const/16 p1, 0x8

    .line 113
    :cond_0
    iput p1, p0, Lyyds/ᛲᛷᛴᛵ;->ᲀᛲᛳᲀ:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛲᲈᲁ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v0, -0x1

    .line 15
    iput v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᲀᛲᛳᲀ:I

    .line 16
    .line 17
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    sget-object v0, Lyyds/ᛵᛸᛷᛵ;->ᛱᲈᲁ:[I

    .line 22
    .line 23
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getIndexCount()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v1, 0x0

    .line 32
    :goto_0
    if-ge v1, v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_0

    .line 39
    .line 40
    iget v3, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 41
    .line 42
    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    iput v2, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    const/4 v3, 0x1

    .line 50
    if-ne v2, v3, :cond_1

    .line 51
    .line 52
    iget v3, p0, Lyyds/ᛲᛷᛴᛵ;->ᲀᛲᛳᲀ:I

    .line 53
    .line 54
    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    iput v2, p0, Lyyds/ᛲᛷᛴᛵ;->ᲀᛲᛳᲀ:I

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    const-string v4, "layout"

    .line 76
    .line 77
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_1

    .line 82
    .line 83
    new-instance v3, Lyyds/ᛳᛵᛸ;

    .line 84
    .line 85
    invoke-direct {v3}, Lyyds/ᛳᛵᛸ;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3, p1, v2}, Lyyds/ᛳᛵᛸ;->ᛲᲈᲁ(Landroid/content/Context;I)V

    .line 89
    .line 90
    .line 91
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛲᲈᲁ:I

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    iput-object p1, p0, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 100
    iput v1, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 101
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    sub-int/2addr p1, v0

    iput p1, p0, Lyyds/ᛲᛷᛴᛵ;->ᲀᛲᛳᲀ:I

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛲᲈᲁ:I

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    iput-object p1, p0, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 104
    iput p2, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 105
    iput p3, p0, Lyyds/ᛲᛷᛴᛵ;->ᲀᛲᛳᲀ:I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/lang/CharSequence;

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public ᛱᛳᲇ(CI)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/CharSequence;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    add-int/2addr p2, v1

    .line 7
    :goto_0
    invoke-virtual {p0, p2}, Lyyds/ᛲᛷᛴᛵ;->ᛷᲈᲈᲁ(I)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    invoke-interface {v0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/16 v3, 0x20

    .line 18
    .line 19
    if-ne v2, v3, :cond_0

    .line 20
    .line 21
    add-int/lit8 p2, p2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p0, p2}, Lyyds/ᛲᛷᛴᛵ;->ᛷᲈᲈᲁ(I)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-nez p0, :cond_1

    .line 29
    .line 30
    invoke-interface {v0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-ne p0, p1, :cond_1

    .line 35
    .line 36
    return v1

    .line 37
    :cond_1
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public ᛱᲈᲁ(CI)I
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/CharSequence;

    .line 4
    .line 5
    :goto_0
    add-int/lit8 p2, p2, 0x1

    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lyyds/ᛲᛷᛴᛵ;->ᛷᲈᲈᲁ(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/16 v2, 0x20

    .line 18
    .line 19
    if-ne v1, v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-interface {v0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-ne p0, p1, :cond_1

    .line 27
    .line 28
    return p2

    .line 29
    :cond_1
    const/4 p0, -0x1

    .line 30
    return p0
.end method

.method public ᛲᛲᲈᲈ(I)C
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/CharSequence;

    .line 4
    .line 5
    :goto_0
    add-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lyyds/ᛲᛷᛴᛵ;->ᛷᲈᲈᲁ(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/16 v2, 0x20

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-ne v1, v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0, p1}, Lyyds/ᛲᛷᛴᛵ;->ᛷᲈᲈᲁ(I)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-nez p0, :cond_1

    .line 27
    .line 28
    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0

    .line 33
    :cond_1
    return v2
.end method

.method public ᛲᛳᛶᲁ(I)I
    .locals 2

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    :goto_0
    invoke-virtual {p0, p1}, Lyyds/ᛲᛷᛴᛵ;->ᛷᲈᲈᲁ(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ljava/lang/CharSequence;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v1, 0x20

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    add-int/lit8 p1, p1, -0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p0, p1}, Lyyds/ᛲᛷᛴᛵ;->ᛷᲈᲈᲁ(I)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-nez p0, :cond_1

    .line 29
    .line 30
    return p1

    .line 31
    :cond_1
    const/4 p0, -0x1

    .line 32
    return p0
.end method

.method public ᛲᛴᛳᛲ(I)Z
    .locals 0

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget p0, p0, Lyyds/ᛲᛷᛴᛵ;->ᲀᛲᛳᲀ:I

    .line 4
    .line 5
    if-gt p1, p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public ᛲᲈᲁ()C
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/CharSequence;

    .line 4
    .line 5
    iget p0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 6
    .line 7
    invoke-interface {v0, p0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public ᛳᲁᲁᲇ(C)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyyds/ᛲᛷᛴᛵ;->ᲇᛱᛲ()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lyyds/ᛲᛷᛴᛵ;->ᛲᲈᲁ()C

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-ne v0, p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    invoke-virtual {p0, p1}, Lyyds/ᛲᛷᛴᛵ;->ᲇᲇᲇᛱ(I)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance p0, Lyyds/ᲇᲈᛸᲀ;

    .line 16
    .line 17
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v0, "Expected character: %c"

    .line 26
    .line 27
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p0
.end method

.method public ᛵᛸᛸᛷ(C)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/CharSequence;

    .line 4
    .line 5
    iget p0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 6
    .line 7
    invoke-interface {v0, p0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-ne p0, p1, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public ᛶᛳᛶᛵ()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lyyds/ᛲᛷᛴᛵ;->ᲇᛱᛲ()V

    .line 2
    .line 3
    .line 4
    :goto_0
    iget v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lyyds/ᛲᛷᛴᛵ;->ᛲᛴᛳᛲ(I)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 13
    .line 14
    iget v1, p0, Lyyds/ᛲᛷᛴᛵ;->ᲀᛲᛳᲀ:I

    .line 15
    .line 16
    if-ge v0, v1, :cond_0

    .line 17
    .line 18
    const/16 v0, 0x20

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lyyds/ᛲᛷᛴᛵ;->ᛷᛲᲈᛱ(C)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᲀᛲᛳᲀ:I

    .line 27
    .line 28
    add-int/lit8 v0, v0, -0x1

    .line 29
    .line 30
    iput v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᲀᛲᛳᲀ:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-void
.end method

.method public ᛶᛷᛲᲁ(ICCZ)I
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/CharSequence;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ne v1, p2, :cond_8

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    add-int/2addr p1, v1

    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Lyyds/ᛲᛷᛴᛵ;->ᛲᛴᛳᛲ(I)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, -0x1

    .line 18
    if-eqz v2, :cond_7

    .line 19
    .line 20
    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/16 v4, 0x27

    .line 25
    .line 26
    if-eq v2, v4, :cond_0

    .line 27
    .line 28
    const/16 v4, 0x22

    .line 29
    .line 30
    if-ne v2, v4, :cond_1

    .line 31
    .line 32
    :cond_0
    invoke-virtual {p0, v2, p1}, Lyyds/ᛲᛷᛴᛵ;->ᛷᛵᲇᲀ(CI)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eq p1, v3, :cond_6

    .line 37
    .line 38
    add-int/lit8 p1, p1, 0x1

    .line 39
    .line 40
    :cond_1
    if-eqz p4, :cond_3

    .line 41
    .line 42
    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    const/16 v4, 0x2f

    .line 47
    .line 48
    if-ne v2, v4, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0, v4, p1}, Lyyds/ᛲᛷᛴᛵ;->ᛷᛵᲇᲀ(CI)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eq p1, v3, :cond_2

    .line 55
    .line 56
    add-int/lit8 p1, p1, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    const-string p0, "Could not find matching close for / when parsing regex in : "

    .line 60
    .line 61
    invoke-static {v0, p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᲇᲇᛱ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    return p0

    .line 66
    :cond_3
    :goto_1
    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-ne v2, p2, :cond_4

    .line 71
    .line 72
    add-int/lit8 v1, v1, 0x1

    .line 73
    .line 74
    :cond_4
    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-ne v2, p3, :cond_5

    .line 79
    .line 80
    add-int/lit8 v1, v1, -0x1

    .line 81
    .line 82
    if-nez v1, :cond_5

    .line 83
    .line 84
    return p1

    .line 85
    :cond_5
    add-int/lit8 p1, p1, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_6
    new-instance p0, Lyyds/ᲇᲈᛸᲀ;

    .line 89
    .line 90
    new-instance p1, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const-string p2, "Could not find matching close quote for "

    .line 93
    .line 94
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string p2, " when parsing : "

    .line 101
    .line 102
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p0

    .line 116
    :cond_7
    return v3

    .line 117
    :cond_8
    new-instance p0, Lyyds/ᲇᲈᛸᲀ;

    .line 118
    .line 119
    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    new-instance p3, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    const-string p4, "Expected "

    .line 126
    .line 127
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string p2, " but found "

    .line 134
    .line 135
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw p0
.end method

.method public ᛷᛲᲈᛱ(C)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/CharSequence;

    .line 4
    .line 5
    iget p0, p0, Lyyds/ᛲᛷᛴᛵ;->ᲀᛲᛳᲀ:I

    .line 6
    .line 7
    invoke-interface {v0, p0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-ne p0, p1, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public ᛷᛵᲇᲀ(CI)I
    .locals 6

    .line 1
    iget-object v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/CharSequence;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    add-int/2addr p2, v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    invoke-virtual {p0, p2}, Lyyds/ᛲᛷᛴᛵ;->ᛷᲈᲈᲁ(I)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-nez v4, :cond_3

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    move v3, v2

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const/16 v4, 0x5c

    .line 20
    .line 21
    invoke-interface {v0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-ne v4, v5, :cond_1

    .line 26
    .line 27
    move v3, v1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-interface {v0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-ne p1, v4, :cond_2

    .line 34
    .line 35
    return p2

    .line 36
    :cond_2
    :goto_1
    add-int/lit8 p2, p2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_3
    const/4 p0, -0x1

    .line 40
    return p0
.end method

.method public ᛷᲈᲈᲁ(I)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lyyds/ᛲᛷᛴᛵ;->ᛲᛴᛳᛲ(I)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    xor-int/lit8 p0, p0, 0x1

    .line 6
    .line 7
    return p0
.end method

.method public ᲀᛲᛳᲀ()Z
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 2
    .line 3
    iget p0, p0, Lyyds/ᛲᛷᛴᛵ;->ᲀᛲᛳᲀ:I

    .line 4
    .line 5
    if-lt v0, p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public ᲇᛱᛲ()V
    .locals 2

    .line 1
    :goto_0
    iget v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lyyds/ᛲᛷᛴᛵ;->ᛲᛴᛳᛲ(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 10
    .line 11
    iget v1, p0, Lyyds/ᛲᛷᛴᛵ;->ᲀᛲᛳᲀ:I

    .line 12
    .line 13
    if-ge v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lyyds/ᛲᛷᛴᛵ;->ᛲᲈᲁ()C

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/16 v1, 0x20

    .line 20
    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    invoke-virtual {p0, v0}, Lyyds/ᛲᛷᛴᛵ;->ᲇᲇᲇᛱ(I)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method public ᲇᲇᲇᛱ(I)V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    iput v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 5
    .line 6
    return-void
.end method

.method public ᲇᲈᛵᛷ(Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lyyds/ᛲᛷᛴᛵ;->ᲇᛱᛲ()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    add-int/2addr v1, v0

    .line 11
    const/4 v0, 0x1

    .line 12
    sub-int/2addr v1, v0

    .line 13
    invoke-virtual {p0, v1}, Lyyds/ᛲᛷᛴᛵ;->ᛲᛴᛳᛲ(I)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget v1, p0, Lyyds/ᛲᛷᛴᛵ;->ᛵᛸᛸᛷ:I

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    add-int/2addr v2, v1

    .line 27
    iget-object v3, p0, Lyyds/ᛲᛷᛴᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v3, Ljava/lang/CharSequence;

    .line 30
    .line 31
    invoke-interface {v3, v1, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_1

    .line 40
    .line 41
    :goto_0
    const/4 p0, 0x0

    .line 42
    return p0

    .line 43
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-virtual {p0, p1}, Lyyds/ᛲᛷᛴᛵ;->ᲇᲇᲇᛱ(I)V

    .line 48
    .line 49
    .line 50
    return v0
.end method

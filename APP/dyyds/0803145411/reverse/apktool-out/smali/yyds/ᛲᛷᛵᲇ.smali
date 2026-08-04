.class public abstract Lyyds/ᛲᛷᛵᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᛴᛳᛲ:Lyyds/ᛲᛸᛴᛶ;

.field public static final ᛲᲈᲁ:Lyyds/ᛲᛸᛴᛶ;

.field public static final ᛵᛸᛸᛷ:Lyyds/ᛲᛸᛴᛶ;

.field public static final ᛶᛷᛲᲁ:Lyyds/ᲈᛳᛸᲇ;

.field public static final ᲀᛲᛳᲀ:Lyyds/ᛲᛸᛴᛶ;

.field public static final ᲇᲇᲇᛱ:Lyyds/ᲈᛳᛸᲇ;

.field public static final ᲇᲈᛵᛷ:Lyyds/ᛲᛸᛴᛶ;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lyyds/ᛲᛸᛴᛶ;

    .line 2
    .line 3
    const-string v1, "COMPLETING_ALREADY"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, Lyyds/ᛲᛸᛴᛶ;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lyyds/ᛲᛷᛵᲇ;->ᛲᲈᲁ:Lyyds/ᛲᛸᛴᛶ;

    .line 10
    .line 11
    new-instance v0, Lyyds/ᛲᛸᛴᛶ;

    .line 12
    .line 13
    const-string v1, "COMPLETING_WAITING_CHILDREN"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lyyds/ᛲᛸᛴᛶ;-><init>(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lyyds/ᛲᛷᛵᲇ;->ᛵᛸᛸᛷ:Lyyds/ᛲᛸᛴᛶ;

    .line 19
    .line 20
    new-instance v0, Lyyds/ᛲᛸᛴᛶ;

    .line 21
    .line 22
    const-string v1, "COMPLETING_RETRY"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Lyyds/ᛲᛸᛴᛶ;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lyyds/ᛲᛷᛵᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛸᛴᛶ;

    .line 28
    .line 29
    new-instance v0, Lyyds/ᛲᛸᛴᛶ;

    .line 30
    .line 31
    const-string v1, "TOO_LATE_TO_CANCEL"

    .line 32
    .line 33
    invoke-direct {v0, v1, v2}, Lyyds/ᛲᛸᛴᛶ;-><init>(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lyyds/ᛲᛷᛵᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛲᛸᛴᛶ;

    .line 37
    .line 38
    new-instance v0, Lyyds/ᛲᛸᛴᛶ;

    .line 39
    .line 40
    const-string v1, "SEALED"

    .line 41
    .line 42
    invoke-direct {v0, v1, v2}, Lyyds/ᛲᛸᛴᛶ;-><init>(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lyyds/ᛲᛷᛵᲇ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛸᛴᛶ;

    .line 46
    .line 47
    new-instance v0, Lyyds/ᲈᛳᛸᲇ;

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-direct {v0, v1}, Lyyds/ᲈᛳᛸᲇ;-><init>(Z)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lyyds/ᛲᛷᛵᲇ;->ᲇᲇᲇᛱ:Lyyds/ᲈᛳᛸᲇ;

    .line 54
    .line 55
    new-instance v0, Lyyds/ᲈᛳᛸᲇ;

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    invoke-direct {v0, v1}, Lyyds/ᲈᛳᛸᲇ;-><init>(Z)V

    .line 59
    .line 60
    .line 61
    sput-object v0, Lyyds/ᛲᛷᛵᲇ;->ᛶᛷᛲᲁ:Lyyds/ᲈᛳᛸᲇ;

    .line 62
    .line 63
    return-void
.end method

.method public static final ᛱᛳᲇ(Ljava/util/Set;Lyyds/ᛴᛷᲈ;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lyyds/ᛴᛷᲈ;->ᛲᲈᲁ:Lyyds/ᛷᛳᲁᛶ;

    .line 2
    .line 3
    iget-object v0, v0, Lyyds/ᛷᛳᲁᛶ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    iget-object v0, p1, Lyyds/ᛴᛷᲈ;->ᛵᛸᛸᛷ:Landroid/view/ViewGroup;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p1, Lyyds/ᛴᛷᲈ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Lyyds/ᛴᛷᛴᛱ;

    .line 32
    .line 33
    iget-object v2, v1, Lyyds/ᛴᛷᛴᛱ;->ᛲᲈᲁ:Landroid/view/View;

    .line 34
    .line 35
    if-nez p0, :cond_0

    .line 36
    .line 37
    iget v1, v1, Lyyds/ᛴᛷᛴᛱ;->ᛵᛸᛸᛷ:I

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    const/16 v1, 0x8

    .line 41
    .line 42
    :goto_1
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget-object p1, p1, Lyyds/ᛴᛷᲈ;->ᛲᲈᲁ:Lyyds/ᛷᛳᲁᛶ;

    .line 47
    .line 48
    iget-object p1, p1, Lyyds/ᛷᛳᲁᛶ;->ᲀᛲᛳᲀ:Landroid/widget/ImageView;

    .line 49
    .line 50
    if-nez p0, :cond_2

    .line 51
    .line 52
    const/high16 p0, 0x42b40000    # 90.0f

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/4 p0, 0x0

    .line 56
    :goto_2
    invoke-virtual {p1, p0}, Landroid/view/View;->setRotation(F)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public static ᛱᲈᲁ(Ljava/lang/String;)Lyyds/ᛴᲀᲁᛲ;
    .locals 1

    .line 1
    const-string v0, "http/1.0"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lyyds/ᛴᲀᲁᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᲁᛲ;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string v0, "http/1.1"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    sget-object p0, Lyyds/ᛴᲀᲁᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛴᲀᲁᛲ;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    const-string v0, "h2_prior_knowledge"

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    sget-object p0, Lyyds/ᛴᲀᲁᛲ;->ᛱᲈᲁ:Lyyds/ᛴᲀᲁᛲ;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    const-string v0, "h2"

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    sget-object p0, Lyyds/ᛴᲀᲁᛲ;->ᛶᛷᛲᲁ:Lyyds/ᛴᲀᲁᛲ;

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_3
    const-string v0, "spdy/3.1"

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    sget-object p0, Lyyds/ᛴᲀᲁᛲ;->ᲇᲇᲇᛱ:Lyyds/ᛴᲀᲁᛲ;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_4
    const-string v0, "quic"

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    sget-object p0, Lyyds/ᛴᲀᲁᛲ;->ᛲᛳᛶᲁ:Lyyds/ᛴᲀᲁᛲ;

    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_5
    const-string v0, "h3"

    .line 68
    .line 69
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_6

    .line 74
    .line 75
    sget-object p0, Lyyds/ᛴᲀᲁᛲ;->ᛷᲈᲈᲁ:Lyyds/ᛴᲀᲁᛲ;

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_6
    const-string v0, "Unexpected protocol: "

    .line 79
    .line 80
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const/4 p0, 0x0

    .line 88
    return-object p0
.end method

.method public static ᛲᛳᛶᲁ(Landroid/content/Context;I)I
    .locals 2

    .line 1
    filled-new-array {p1}, [I

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    :try_start_0
    invoke-virtual {p1, v0, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-static {p0, v1}, Lyyds/ᲈᲈᲈᛴ;->ᛲᛴᛳᛲ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    .line 19
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_2

    .line 26
    :cond_0
    :try_start_1
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 27
    .line 28
    .line 29
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    goto :goto_0

    .line 31
    :goto_1
    if-eqz p0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0

    .line 38
    :cond_1
    return v0

    .line 39
    :goto_2
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 40
    .line 41
    .line 42
    throw p0
.end method

.method public static ᛲᲈᲁ(Ljava/lang/Object;)Ljava/util/Set;
    .locals 1

    .line 1
    instance-of v0, p0, Lyyds/ᛳᛱᲇᛴ;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p0, Lyyds/ᛸᛴᛳᲈ;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, "kotlin.collections.MutableSet"

    .line 11
    .line 12
    invoke-static {p0, v0}, Lyyds/ᛲᛷᛵᲇ;->ᲇᛱᛲ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    throw p0

    .line 17
    :cond_1
    :goto_0
    :try_start_0
    check-cast p0, Ljava/util/Set;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    return-object p0

    .line 20
    :catch_0
    move-exception p0

    .line 21
    const-class v0, Lyyds/ᛲᛷᛵᲇ;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {p0, v0}, Lyyds/ᛷᛴᲇᛲ;->ᛷᛵᲇᲀ(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p0
.end method

.method public static final ᛳᲁᲁᲇ(Landroid/view/View;Ljava/lang/StringBuilder;)V
    .locals 5

    .line 1
    instance-of v0, p0, Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/16 v2, 0x20

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-static {v1}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-nez v4, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v1, v3

    .line 31
    :goto_0
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {v0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    invoke-static {v0}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_2

    .line 56
    .line 57
    move-object v3, v0

    .line 58
    :cond_2
    if-eqz v3, :cond_3

    .line 59
    .line 60
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    :cond_3
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 67
    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    check-cast p0, Landroid/view/ViewGroup;

    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    const/4 v1, 0x0

    .line 77
    :goto_1
    if-ge v1, v0, :cond_4

    .line 78
    .line 79
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    const-wide v3, -0x6cf9e68a836eL

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    invoke-static {v2, p1}, Lyyds/ᛲᛷᛵᲇ;->ᛳᲁᲁᲇ(Landroid/view/View;Ljava/lang/StringBuilder;)V

    .line 92
    .line 93
    .line 94
    add-int/lit8 v1, v1, 0x1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_4
    return-void
.end method

.method public static ᛵᛶᛲᲀ(IIII)Z
    .locals 4

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x1

    .line 4
    const/4 v3, 0x0

    .line 5
    if-eq p2, v2, :cond_1

    .line 6
    .line 7
    if-eq p2, v1, :cond_1

    .line 8
    .line 9
    if-ne p2, v0, :cond_0

    .line 10
    .line 11
    if-eq p0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move p0, v3

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    move p0, v2

    .line 17
    :goto_1
    if-eq p3, v2, :cond_3

    .line 18
    .line 19
    if-eq p3, v1, :cond_3

    .line 20
    .line 21
    if-ne p3, v0, :cond_2

    .line 22
    .line 23
    if-eq p1, v1, :cond_2

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_2
    move p1, v3

    .line 27
    goto :goto_3

    .line 28
    :cond_3
    :goto_2
    move p1, v2

    .line 29
    :goto_3
    if-nez p0, :cond_5

    .line 30
    .line 31
    if-eqz p1, :cond_4

    .line 32
    .line 33
    goto :goto_4

    .line 34
    :cond_4
    return v3

    .line 35
    :cond_5
    :goto_4
    return v2
.end method

.method public static ᛵᛸᛸᛷ(Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-static {v0, p0}, Lyyds/ᛲᛷᛵᲇ;->ᛷᛲᲈᛱ(ILjava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string v0, "kotlin.jvm.functions.Function2"

    .line 12
    .line 13
    invoke-static {p0, v0}, Lyyds/ᛲᛷᛵᲇ;->ᲇᛱᛲ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0

    .line 18
    :cond_1
    :goto_0
    return-void
.end method

.method public static final ᛶᛳᛶᛵ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, Lyyds/ᲇᛵᲇ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Lyyds/ᲇᛵᲇ;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p0, v0, Lyyds/ᲇᛵᲇ;->ᛲᲈᲁ:Lyyds/ᲀᲀᛶᛸ;

    .line 13
    .line 14
    :cond_1
    return-object p0
.end method

.method public static ᛶᛷᛲᲁ(Lyyds/ᛴᲀᲈᛲ;ILjava/util/ArrayList;Lyyds/ᲁᛲᲁᛶ;)Lyyds/ᲁᛲᲁᛶ;
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget v0, p0, Lyyds/ᛴᲀᲈᛲ;->ᲇᛶᲀᲇ:I

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget v0, p0, Lyyds/ᛴᲀᲈᛲ;->ᛶᛵᲁᲈ:I

    .line 7
    .line 8
    :goto_0
    const/4 v1, 0x0

    .line 9
    const/4 v2, -0x1

    .line 10
    if-eq v0, v2, :cond_4

    .line 11
    .line 12
    if-eqz p3, :cond_1

    .line 13
    .line 14
    iget v3, p3, Lyyds/ᲁᛲᲁᛶ;->ᛵᛸᛸᛷ:I

    .line 15
    .line 16
    if-eq v0, v3, :cond_4

    .line 17
    .line 18
    :cond_1
    move v3, v1

    .line 19
    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-ge v3, v4, :cond_5

    .line 24
    .line 25
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Lyyds/ᲁᛲᲁᛶ;

    .line 30
    .line 31
    iget v5, v4, Lyyds/ᲁᛲᲁᛶ;->ᛵᛸᛸᛷ:I

    .line 32
    .line 33
    if-ne v5, v0, :cond_3

    .line 34
    .line 35
    if-eqz p3, :cond_2

    .line 36
    .line 37
    invoke-virtual {p3, p1, v4}, Lyyds/ᲁᛲᲁᛶ;->ᲀᛲᛳᲀ(ILyyds/ᲁᛲᲁᛶ;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_2
    move-object p3, v4

    .line 44
    goto :goto_2

    .line 45
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_4
    if-eq v0, v2, :cond_5

    .line 49
    .line 50
    return-object p3

    .line 51
    :cond_5
    :goto_2
    const/4 v0, 0x1

    .line 52
    if-nez p3, :cond_c

    .line 53
    .line 54
    instance-of v3, p0, Lyyds/ᛲᛸᛱᲀ;

    .line 55
    .line 56
    if-eqz v3, :cond_a

    .line 57
    .line 58
    move-object v3, p0

    .line 59
    check-cast v3, Lyyds/ᛲᛸᛱᲀ;

    .line 60
    .line 61
    move v4, v1

    .line 62
    :goto_3
    iget v5, v3, Lyyds/ᛲᛸᛱᲀ;->ᛱᛵᛳᛳ:I

    .line 63
    .line 64
    if-ge v4, v5, :cond_8

    .line 65
    .line 66
    iget-object v5, v3, Lyyds/ᛲᛸᛱᲀ;->ᛱᛵᲈᛸ:[Lyyds/ᛴᲀᲈᛲ;

    .line 67
    .line 68
    aget-object v5, v5, v4

    .line 69
    .line 70
    if-nez p1, :cond_6

    .line 71
    .line 72
    iget v6, v5, Lyyds/ᛴᲀᲈᛲ;->ᲇᛶᲀᲇ:I

    .line 73
    .line 74
    if-eq v6, v2, :cond_6

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_6
    if-ne p1, v0, :cond_7

    .line 78
    .line 79
    iget v6, v5, Lyyds/ᛴᲀᲈᛲ;->ᛶᛵᲁᲈ:I

    .line 80
    .line 81
    if-eq v6, v2, :cond_7

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_8
    move v6, v2

    .line 88
    :goto_4
    if-eq v6, v2, :cond_a

    .line 89
    .line 90
    move v3, v1

    .line 91
    :goto_5
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-ge v3, v4, :cond_a

    .line 96
    .line 97
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    check-cast v4, Lyyds/ᲁᛲᲁᛶ;

    .line 102
    .line 103
    iget v5, v4, Lyyds/ᲁᛲᲁᛶ;->ᛵᛸᛸᛷ:I

    .line 104
    .line 105
    if-ne v5, v6, :cond_9

    .line 106
    .line 107
    move-object p3, v4

    .line 108
    goto :goto_6

    .line 109
    :cond_9
    add-int/lit8 v3, v3, 0x1

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_a
    :goto_6
    if-nez p3, :cond_b

    .line 113
    .line 114
    new-instance p3, Lyyds/ᲁᛲᲁᛶ;

    .line 115
    .line 116
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 117
    .line 118
    .line 119
    new-instance v3, Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 122
    .line 123
    .line 124
    iput-object v3, p3, Lyyds/ᲁᛲᲁᛶ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 125
    .line 126
    const/4 v3, 0x0

    .line 127
    iput-object v3, p3, Lyyds/ᲁᛲᲁᛶ;->ᲇᲈᛵᛷ:Ljava/util/ArrayList;

    .line 128
    .line 129
    iput v2, p3, Lyyds/ᲁᛲᲁᛶ;->ᛲᛴᛳᛲ:I

    .line 130
    .line 131
    sget v2, Lyyds/ᲁᛲᲁᛶ;->ᲇᲇᲇᛱ:I

    .line 132
    .line 133
    add-int/lit8 v3, v2, 0x1

    .line 134
    .line 135
    sput v3, Lyyds/ᲁᛲᲁᛶ;->ᲇᲇᲇᛱ:I

    .line 136
    .line 137
    iput v2, p3, Lyyds/ᲁᛲᲁᛶ;->ᛵᛸᛸᛷ:I

    .line 138
    .line 139
    iput p1, p3, Lyyds/ᲁᛲᲁᛶ;->ᲀᛲᛳᲀ:I

    .line 140
    .line 141
    :cond_b
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    :cond_c
    iget-object v2, p3, Lyyds/ᲁᛲᲁᛶ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-eqz v3, :cond_d

    .line 151
    .line 152
    return-object p3

    .line 153
    :cond_d
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    instance-of v2, p0, Lyyds/ᲀᲀᲁᛳ;

    .line 157
    .line 158
    if-eqz v2, :cond_f

    .line 159
    .line 160
    move-object v2, p0

    .line 161
    check-cast v2, Lyyds/ᲀᲀᲁᛳ;

    .line 162
    .line 163
    iget-object v3, v2, Lyyds/ᲀᲀᲁᛳ;->ᛸᲇᛱᲇ:Lyyds/ᲀᲈᲁᛲ;

    .line 164
    .line 165
    iget v2, v2, Lyyds/ᲀᲀᲁᛳ;->ᲁᲀᛱᛴ:I

    .line 166
    .line 167
    if-nez v2, :cond_e

    .line 168
    .line 169
    move v1, v0

    .line 170
    :cond_e
    invoke-virtual {v3, v1, p2, p3}, Lyyds/ᲀᲈᲁᛲ;->ᛵᛸᛸᛷ(ILjava/util/ArrayList;Lyyds/ᲁᛲᲁᛶ;)V

    .line 171
    .line 172
    .line 173
    :cond_f
    iget v0, p3, Lyyds/ᲁᛲᲁᛶ;->ᛵᛸᛸᛷ:I

    .line 174
    .line 175
    if-nez p1, :cond_10

    .line 176
    .line 177
    iput v0, p0, Lyyds/ᛴᲀᲈᛲ;->ᲇᛶᲀᲇ:I

    .line 178
    .line 179
    iget-object v0, p0, Lyyds/ᛴᲀᲈᛲ;->ᛷᲇᛲᛱ:Lyyds/ᲀᲈᲁᛲ;

    .line 180
    .line 181
    invoke-virtual {v0, p1, p2, p3}, Lyyds/ᲀᲈᲁᛲ;->ᛵᛸᛸᛷ(ILjava/util/ArrayList;Lyyds/ᲁᛲᲁᛶ;)V

    .line 182
    .line 183
    .line 184
    iget-object v0, p0, Lyyds/ᛴᲀᲈᛲ;->ᛲᛱᲁᛳ:Lyyds/ᲀᲈᲁᛲ;

    .line 185
    .line 186
    invoke-virtual {v0, p1, p2, p3}, Lyyds/ᲀᲈᲁᛲ;->ᛵᛸᛸᛷ(ILjava/util/ArrayList;Lyyds/ᲁᛲᲁᛶ;)V

    .line 187
    .line 188
    .line 189
    goto :goto_7

    .line 190
    :cond_10
    iput v0, p0, Lyyds/ᛴᲀᲈᛲ;->ᛶᛵᲁᲈ:I

    .line 191
    .line 192
    iget-object v0, p0, Lyyds/ᛴᲀᲈᛲ;->ᲈᛷᲈᛶ:Lyyds/ᲀᲈᲁᛲ;

    .line 193
    .line 194
    invoke-virtual {v0, p1, p2, p3}, Lyyds/ᲀᲈᲁᛲ;->ᛵᛸᛸᛷ(ILjava/util/ArrayList;Lyyds/ᲁᛲᲁᛶ;)V

    .line 195
    .line 196
    .line 197
    iget-object v0, p0, Lyyds/ᛴᲀᲈᛲ;->ᛸᛴᛵᛶ:Lyyds/ᲀᲈᲁᛲ;

    .line 198
    .line 199
    invoke-virtual {v0, p1, p2, p3}, Lyyds/ᲀᲈᲁᛲ;->ᛵᛸᛸᛷ(ILjava/util/ArrayList;Lyyds/ᲁᛲᲁᛶ;)V

    .line 200
    .line 201
    .line 202
    iget-object v0, p0, Lyyds/ᛴᲀᲈᛲ;->ᛱᛸᲁᲇ:Lyyds/ᲀᲈᲁᛲ;

    .line 203
    .line 204
    invoke-virtual {v0, p1, p2, p3}, Lyyds/ᲀᲈᲁᛲ;->ᛵᛸᛸᛷ(ILjava/util/ArrayList;Lyyds/ᲁᛲᲁᛶ;)V

    .line 205
    .line 206
    .line 207
    :goto_7
    iget-object p0, p0, Lyyds/ᛴᲀᲈᛲ;->ᛲᲀᛵᛷ:Lyyds/ᲀᲈᲁᛲ;

    .line 208
    .line 209
    invoke-virtual {p0, p1, p2, p3}, Lyyds/ᲀᲈᲁᛲ;->ᛵᛸᛸᛷ(ILjava/util/ArrayList;Lyyds/ᲁᛲᲁᛶ;)V

    .line 210
    .line 211
    .line 212
    return-object p3
.end method

.method public static ᛷᛲᲈᛱ(ILjava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lyyds/ᛳᛳᲀᛳ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_6

    .line 5
    .line 6
    instance-of v0, p1, Lyyds/ᛴᛷᛴᛶ;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p1, Lyyds/ᛴᛷᛴᛶ;

    .line 12
    .line 13
    invoke-interface {p1}, Lyyds/ᛴᛷᛴᛶ;->ᲀᛲᛳᲀ()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    instance-of v0, p1, Lyyds/ᲁᛶᲁᲀ;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    move p1, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    instance-of v0, p1, Lyyds/ᛷᛴᲈᲀ;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    move p1, v2

    .line 29
    goto :goto_0

    .line 30
    :cond_2
    instance-of v0, p1, Lyyds/ᛲᲇᲁᛴ;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    const/4 p1, 0x2

    .line 35
    goto :goto_0

    .line 36
    :cond_3
    instance-of v0, p1, Lyyds/ᛲᛲᲀᛷ;

    .line 37
    .line 38
    if-eqz v0, :cond_4

    .line 39
    .line 40
    const/4 p1, 0x3

    .line 41
    goto :goto_0

    .line 42
    :cond_4
    instance-of p1, p1, Lyyds/ᛷᛴᛷᲈ;

    .line 43
    .line 44
    if-eqz p1, :cond_5

    .line 45
    .line 46
    const/4 p1, 0x4

    .line 47
    goto :goto_0

    .line 48
    :cond_5
    const/4 p1, -0x1

    .line 49
    :goto_0
    if-ne p1, p0, :cond_6

    .line 50
    .line 51
    return v2

    .line 52
    :cond_6
    return v1
.end method

.method public static final ᛷᲈᲈᲁ(Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛸᲀᛱᛴ;
    .locals 9

    .line 1
    instance-of v0, p0, Lyyds/ᛵᛶᛷ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lyyds/ᛸᲀᛱᛴ;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p0}, Lyyds/ᛸᲀᛱᛴ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    move-object v3, p0

    .line 13
    check-cast v3, Lyyds/ᛵᛶᛷ;

    .line 14
    .line 15
    sget-object v7, Lyyds/ᛲᛸᲈᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛲᛸᛴᛶ;

    .line 16
    .line 17
    sget-wide v0, Lyyds/ᛵᛶᛷ;->ᛷᲈᲈᲁ:J

    .line 18
    .line 19
    :cond_1
    :goto_0
    sget-object v2, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 20
    .line 21
    invoke-virtual {v2, v3, v0, v1}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    const/4 v8, 0x0

    .line 26
    if-nez v6, :cond_2

    .line 27
    .line 28
    invoke-virtual {v2, v3, v0, v1, v7}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    move-object v6, v8

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    instance-of v2, v6, Lyyds/ᛸᲀᛱᛴ;

    .line 34
    .line 35
    if-eqz v2, :cond_8

    .line 36
    .line 37
    :cond_3
    sget-object v2, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 38
    .line 39
    sget-wide v4, Lyyds/ᛵᛶᛷ;->ᛷᲈᲈᲁ:J

    .line 40
    .line 41
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_7

    .line 46
    .line 47
    check-cast v6, Lyyds/ᛸᲀᛱᛴ;

    .line 48
    .line 49
    :goto_1
    if-eqz v6, :cond_6

    .line 50
    .line 51
    sget-wide v0, Lyyds/ᛸᲀᛱᛴ;->ᛷᲈᲈᲁ:J

    .line 52
    .line 53
    invoke-virtual {v2, v6, v0, v1}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    instance-of v4, v3, Lyyds/ᛳᲁᛲᛸ;

    .line 58
    .line 59
    if-eqz v4, :cond_4

    .line 60
    .line 61
    check-cast v3, Lyyds/ᛳᲁᛲᛸ;

    .line 62
    .line 63
    iget-object v3, v3, Lyyds/ᛳᲁᛲᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 64
    .line 65
    if-eqz v3, :cond_4

    .line 66
    .line 67
    invoke-virtual {v6}, Lyyds/ᛸᲀᛱᛴ;->ᛵᛶᛲᲀ()V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    const v3, 0x1fffffff

    .line 72
    .line 73
    .line 74
    sget-wide v4, Lyyds/ᛸᲀᛱᛴ;->ᛱᲈᲁ:J

    .line 75
    .line 76
    invoke-virtual {v2, v6, v4, v5, v3}, Lsun/misc/Unsafe;->putIntVolatile(Ljava/lang/Object;JI)V

    .line 77
    .line 78
    .line 79
    sget-object v3, Lyyds/ᲈᛱᛶᲀ;->ᛲᲈᲁ:Lyyds/ᲈᛱᛶᲀ;

    .line 80
    .line 81
    invoke-virtual {v2, v6, v0, v1, v3}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    move-object v8, v6

    .line 85
    :goto_2
    if-nez v8, :cond_5

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_5
    return-object v8

    .line 89
    :cond_6
    :goto_3
    new-instance v0, Lyyds/ᛸᲀᛱᛴ;

    .line 90
    .line 91
    const/4 v1, 0x2

    .line 92
    invoke-direct {v0, v1, p0}, Lyyds/ᛸᲀᛱᛴ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 93
    .line 94
    .line 95
    return-object v0

    .line 96
    :cond_7
    invoke-virtual {v2, v3, v0, v1}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    if-eq v2, v6, :cond_3

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_8
    if-eq v6, v7, :cond_1

    .line 104
    .line 105
    instance-of v2, v6, Ljava/lang/Throwable;

    .line 106
    .line 107
    if-eqz v2, :cond_9

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_9
    const-string p0, "Inconsistent state "

    .line 111
    .line 112
    invoke-static {v6, p0}, Lyyds/ᛱᛸᛶᛲ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return-object v8
.end method

.method public static ᲇᛱᛲ(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "null"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :goto_0
    const-string v0, " cannot be cast to "

    .line 15
    .line 16
    invoke-static {p0, v0, p1}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛲᲈᛱ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance p1, Ljava/lang/ClassCastException;

    .line 21
    .line 22
    invoke-direct {p1, p0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-class p0, Lyyds/ᛲᛷᛵᲇ;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p1, p0}, Lyyds/ᛷᛴᲇᛲ;->ᛷᛵᲇᲀ(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1
.end method

.method public static ᲇᲇᲇᛱ(Landroid/content/Context;)Lyyds/ᛴᲈᛴᛱ;
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "Package manager required to locate emoji font provider"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lyyds/ᲁᛴᛵᛱ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/content/Intent;

    .line 11
    .line 12
    const-string v2, "androidx.content.action.LOAD_EMOJI_FONT"

    .line 13
    .line 14
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->queryIntentContentProviders(Landroid/content/Intent;I)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    const/4 v4, 0x0

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Landroid/content/pm/ResolveInfo;

    .line 38
    .line 39
    iget-object v3, v3, Landroid/content/pm/ResolveInfo;->providerInfo:Landroid/content/pm/ProviderInfo;

    .line 40
    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    iget-object v5, v3, Landroid/content/pm/ProviderInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 44
    .line 45
    if-eqz v5, :cond_0

    .line 46
    .line 47
    iget v5, v5, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 48
    .line 49
    const/4 v6, 0x1

    .line 50
    and-int/2addr v5, v6

    .line 51
    if-ne v5, v6, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move-object v3, v4

    .line 55
    :goto_0
    if-nez v3, :cond_2

    .line 56
    .line 57
    :goto_1
    move-object v5, v4

    .line 58
    goto :goto_3

    .line 59
    :cond_2
    :try_start_0
    iget-object v6, v3, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 60
    .line 61
    iget-object v7, v3, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 62
    .line 63
    const/16 v1, 0x40

    .line 64
    .line 65
    invoke-virtual {v0, v7, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 70
    .line 71
    new-instance v1, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    array-length v3, v0

    .line 77
    :goto_2
    if-ge v2, v3, :cond_3

    .line 78
    .line 79
    aget-object v5, v0, v2

    .line 80
    .line 81
    invoke-virtual {v5}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    add-int/lit8 v2, v2, 0x1

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    new-instance v5, Lyyds/ᛶᛸᲈᛳ;

    .line 96
    .line 97
    const-string v8, "emojicompat-emoji-font"

    .line 98
    .line 99
    const/4 v10, 0x0

    .line 100
    const/4 v11, 0x0

    .line 101
    invoke-direct/range {v5 .. v11}, Lyyds/ᛶᛸᲈᛳ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :catch_0
    move-exception v0

    .line 106
    const-string v1, "emoji2.text.DefaultEmojiConfig"

    .line 107
    .line 108
    invoke-static {v1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :goto_3
    if-nez v5, :cond_4

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_4
    new-instance v4, Lyyds/ᛴᲈᛴᛱ;

    .line 116
    .line 117
    new-instance v0, Lyyds/ᛸᲇᲇᲈ;

    .line 118
    .line 119
    invoke-direct {v0, p0, v5}, Lyyds/ᛸᲇᲇᲈ;-><init>(Landroid/content/Context;Lyyds/ᛶᛸᲈᛳ;)V

    .line 120
    .line 121
    .line 122
    invoke-direct {v4, v0}, Lyyds/ᛲᛵᲀᛳ;-><init>(Lyyds/ᛱᲇᛷᲈ;)V

    .line 123
    .line 124
    .line 125
    :goto_4
    return-object v4
.end method


# virtual methods
.method public abstract ᛲᛲᲈᲈ(Lyyds/ᛵᛲᛵᲁ;Ljava/lang/Thread;)V
.end method

.method public abstract ᛲᛴᛳᛲ(Lyyds/ᲈᛳᛵᛴ;Lyyds/ᛵᛲᛵᲁ;Lyyds/ᛵᛲᛵᲁ;)Z
.end method

.method public abstract ᛷᛵᲇᲀ(Lyyds/ᛵᛲᛵᲁ;Lyyds/ᛵᛲᛵᲁ;)V
.end method

.method public abstract ᲀᛲᛳᲀ(Lyyds/ᲈᛳᛵᛴ;Lyyds/ᛶᛵᛸᛲ;)Z
.end method

.method public abstract ᲇᲈᛵᛷ(Lyyds/ᲈᛳᛵᛴ;Ljava/lang/Object;Ljava/lang/Object;)Z
.end method

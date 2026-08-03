.class public abstract Lx6/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lk2/d;


# direct methods
.method public static final A(Landroid/text/Layout;ILandroid/graphics/Paint;)F
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineLeft(I)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Lj2/l;->a:Ljava/lang/ThreadLocal;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getEllipsisCount(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-lez v1, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v3, 0x1

    .line 19
    if-ne v1, v3, :cond_2

    .line 20
    .line 21
    cmpg-float v1, v0, v2

    .line 22
    .line 23
    if-gez v1, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineStart(I)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getEllipsisStart(I)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    add-int/2addr v2, v1

    .line 34
    invoke-virtual {p0, v2}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    sub-float/2addr v1, v0

    .line 39
    const-string v2, "\u2026"

    .line 40
    .line 41
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    add-float/2addr p2, v1

    .line 46
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getParagraphAlignment(I)Landroid/text/Layout$Alignment;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-nez p1, :cond_0

    .line 51
    .line 52
    const/4 p1, -0x1

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    sget-object v1, Ll2/d;->a:[I

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    aget p1, v1, p1

    .line 61
    .line 62
    :goto_0
    if-ne p1, v3, :cond_1

    .line 63
    .line 64
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    int-to-float p0, p0

    .line 73
    sub-float/2addr p0, p2

    .line 74
    const/high16 p2, 0x40000000    # 2.0f

    .line 75
    .line 76
    div-float/2addr p0, p2

    .line 77
    :goto_1
    add-float/2addr p0, p1

    .line 78
    return p0

    .line 79
    :cond_1
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    int-to-float p0, p0

    .line 88
    sub-float/2addr p0, p2

    .line 89
    goto :goto_1

    .line 90
    :cond_2
    return v2
.end method

.method public static final B(Landroid/text/Layout;ILandroid/graphics/Paint;)F
    .locals 3

    .line 1
    sget-object v0, Lj2/l;->a:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getEllipsisCount(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, -0x1

    .line 14
    if-ne v0, v1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    int-to-float v0, v0

    .line 21
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineRight(I)F

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    cmpg-float v0, v0, v2

    .line 26
    .line 27
    if-gez v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineStart(I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getEllipsisStart(I)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    add-int/2addr v2, v0

    .line 38
    invoke-virtual {p0, v2}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineRight(I)F

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    sub-float/2addr v2, v0

    .line 47
    const-string v0, "\u2026"

    .line 48
    .line 49
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    add-float/2addr p2, v2

    .line 54
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getParagraphAlignment(I)Landroid/text/Layout$Alignment;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-nez v0, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    sget-object v1, Ll2/d;->a:[I

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    aget v1, v1, v0

    .line 68
    .line 69
    :goto_0
    const/4 v0, 0x1

    .line 70
    if-ne v1, v0, :cond_1

    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    int-to-float v0, v0

    .line 77
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineRight(I)F

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    sub-float/2addr v0, p1

    .line 82
    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    int-to-float p0, p0

    .line 87
    sub-float/2addr p0, p2

    .line 88
    const/high16 p1, 0x40000000    # 2.0f

    .line 89
    .line 90
    div-float/2addr p0, p1

    .line 91
    :goto_1
    sub-float/2addr v0, p0

    .line 92
    return v0

    .line 93
    :cond_1
    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    int-to-float v0, v0

    .line 98
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineRight(I)F

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    sub-float/2addr v0, p1

    .line 103
    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    int-to-float p0, p0

    .line 108
    sub-float/2addr p0, p2

    .line 109
    goto :goto_1

    .line 110
    :cond_2
    const/4 p0, 0x0

    .line 111
    return p0
.end method

.method public static final C(Landroidx/lifecycle/x;)J
    .locals 6

    .line 1
    iget-object p0, p0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/DragEvent;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/DragEvent;->getX()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Landroid/view/DragEvent;->getY()F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    int-to-long v0, v0

    .line 18
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    int-to-long v2, p0

    .line 23
    const/16 p0, 0x20

    .line 24
    .line 25
    shl-long/2addr v0, p0

    .line 26
    const-wide v4, 0xffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    and-long/2addr v2, v4

    .line 32
    or-long/2addr v0, v2

    .line 33
    return-wide v0
.end method

.method public static final D(I)J
    .locals 2

    .line 1
    const-wide v0, 0x100000000L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    int-to-float p0, p0

    .line 7
    invoke-static {v0, v1, p0}, Lx6/d;->R(JF)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method

.method public static E(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string p0, "_"

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public static F(Ljava/lang/Class;Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    :goto_0
    if-eqz p0, :cond_3

    .line 9
    .line 10
    :try_start_0
    const-class v0, Ljava/lang/Object;

    .line 11
    .line 12
    if-eq p0, v0, :cond_3

    .line 13
    .line 14
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/lang/reflect/Field;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    const/4 p0, 0x1

    .line 45
    return p0

    .line 46
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 52
    return p0
.end method

.method public static H(Landroid/view/View;Landroidx/lifecycle/q;Lu3/c;Lc9/a1;Lc9/a1;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const v0, 0x7f06007d

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const p1, 0x7f060080

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    const p1, 0x7f060081

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1, p3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const p1, 0x7f06007e

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1, p4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static I(Lw4/d;Lw4/d;)Z
    .locals 4

    .line 1
    invoke-interface {p0}, Lw4/d;->getType()Lw4/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p1}, Lw4/d;->getType()Lw4/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lw4/c;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_1

    .line 16
    .line 17
    :cond_0
    iget v0, p0, Lw4/c;->h:I

    .line 18
    .line 19
    iget v1, p1, Lw4/c;->h:I

    .line 20
    .line 21
    const/16 v2, 0xa

    .line 22
    .line 23
    const/16 v3, 0x9

    .line 24
    .line 25
    if-ne v0, v2, :cond_1

    .line 26
    .line 27
    sget-object p0, Lw4/c;->E:Lw4/c;

    .line 28
    .line 29
    move v0, v3

    .line 30
    :cond_1
    if-ne v1, v2, :cond_2

    .line 31
    .line 32
    sget-object p1, Lw4/c;->E:Lw4/c;

    .line 33
    .line 34
    move v1, v3

    .line 35
    :cond_2
    if-ne v0, v3, :cond_a

    .line 36
    .line 37
    if-eq v1, v3, :cond_3

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    sget-object v0, Lw4/c;->x:Lw4/c;

    .line 41
    .line 42
    if-ne p0, v0, :cond_4

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_4
    if-ne p1, v0, :cond_5

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_5
    sget-object v0, Lw4/c;->E:Lw4/c;

    .line 49
    .line 50
    if-ne p0, v0, :cond_6

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_6
    invoke-virtual {p0}, Lw4/c;->p()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_9

    .line 58
    .line 59
    invoke-virtual {p1}, Lw4/c;->p()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_7

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_7
    invoke-virtual {p0}, Lw4/c;->k()Lw4/c;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p1}, Lw4/c;->k()Lw4/c;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p0}, Lw4/c;->p()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_8

    .line 79
    .line 80
    invoke-virtual {p1}, Lw4/c;->p()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_7

    .line 85
    .line 86
    :cond_8
    invoke-static {p0, p1}, Lx6/d;->I(Lw4/d;Lw4/d;)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    return p0

    .line 91
    :cond_9
    invoke-virtual {p1}, Lw4/c;->p()Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-eqz p1, :cond_b

    .line 96
    .line 97
    sget-object p1, Lw4/c;->F:Lw4/c;

    .line 98
    .line 99
    if-eq p0, p1, :cond_b

    .line 100
    .line 101
    sget-object p1, Lw4/c;->A:Lw4/c;

    .line 102
    .line 103
    if-ne p0, p1, :cond_c

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_a
    :goto_0
    invoke-virtual {p0}, Lw4/c;->s()Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    if-eqz p0, :cond_c

    .line 111
    .line 112
    invoke-virtual {p1}, Lw4/c;->s()Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-eqz p0, :cond_c

    .line 117
    .line 118
    :cond_b
    :goto_1
    const/4 p0, 0x1

    .line 119
    return p0

    .line 120
    :cond_c
    :goto_2
    const/4 p0, 0x0

    .line 121
    return p0
.end method

.method public static J(Ljava/lang/String;)Ljava/util/List;
    .locals 5

    .line 1
    const-string v0, "\r\n"

    .line 2
    .line 3
    const-string v1, "\n"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/16 v0, 0xd

    .line 11
    .line 12
    const/16 v1, 0xa

    .line 13
    .line 14
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_0
    invoke-static {p0, v1}, Log/m;->l0(Ljava/lang/CharSequence;C)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v3, 0x1

    .line 35
    const/4 v4, 0x6

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    invoke-static {v3, p0}, Log/m;->k0(ILjava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    new-array v0, v3, [C

    .line 43
    .line 44
    aput-char v1, v0, v2

    .line 45
    .line 46
    invoke-static {p0, v0, v4}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_1
    new-array v0, v3, [C

    .line 52
    .line 53
    aput-char v1, v0, v2

    .line 54
    .line 55
    invoke-static {p0, v0, v4}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method

.method public static final K(Landroid/content/Context;)Ljava/util/List;
    .locals 13

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "Hchat_group_chat_labels"

    .line 5
    .line 6
    invoke-static {p0, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "labels"

    .line 11
    .line 12
    const-string v1, ""

    .line 13
    .line 14
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v1, p0

    .line 22
    :goto_0
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 27
    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_1
    :try_start_0
    new-instance p0, Lorg/json/JSONArray;

    .line 32
    .line 33
    invoke-direct {p0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {}, La/a;->E()Luf/c;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    const/4 v3, 0x0

    .line 45
    move v4, v3

    .line 46
    :goto_1
    if-lt v4, v2, :cond_2

    .line 47
    .line 48
    invoke-static {v1}, La/a;->t(Luf/c;)Luf/c;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    goto/16 :goto_7

    .line 53
    .line 54
    :catchall_0
    move-exception p0

    .line 55
    goto/16 :goto_6

    .line 56
    .line 57
    :cond_2
    invoke-virtual {p0, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    if-eqz v5, :cond_8

    .line 62
    .line 63
    const-string v6, "id"

    .line 64
    .line 65
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    const-string v7, "name"

    .line 81
    .line 82
    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-static {v7}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    if-nez v8, :cond_8

    .line 102
    .line 103
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    if-eqz v8, :cond_3

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_3
    new-instance v8, Ljava/util/LinkedHashSet;

    .line 111
    .line 112
    invoke-direct {v8}, Ljava/util/LinkedHashSet;-><init>()V

    .line 113
    .line 114
    .line 115
    const-string v9, "groups"

    .line 116
    .line 117
    invoke-virtual {v5, v9}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    if-eqz v5, :cond_4

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_4
    new-instance v5, Lorg/json/JSONArray;

    .line 125
    .line 126
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 127
    .line 128
    .line 129
    :goto_2
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    .line 130
    .line 131
    .line 132
    move-result v9

    .line 133
    move v10, v3

    .line 134
    :goto_3
    if-lt v10, v9, :cond_5

    .line 135
    .line 136
    new-instance v5, Ln9/a;

    .line 137
    .line 138
    invoke-direct {v5, v6, v7, v8}, Ln9/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1, v5}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_5
    invoke-virtual {v5, v10}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v11

    .line 149
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-static {v11}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 153
    .line 154
    .line 155
    move-result-object v11

    .line 156
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v11

    .line 160
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 161
    .line 162
    .line 163
    move-result v12

    .line 164
    if-nez v12, :cond_6

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_6
    const/4 v11, 0x0

    .line 168
    :goto_4
    if-eqz v11, :cond_7

    .line 169
    .line 170
    invoke-virtual {v8, v11}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 171
    .line 172
    .line 173
    :cond_7
    add-int/lit8 v10, v10, 0x1

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_8
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 177
    .line 178
    goto/16 :goto_1

    .line 179
    .line 180
    :goto_6
    new-instance v1, Lsf/f;

    .line 181
    .line 182
    invoke-direct {v1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    move-object p0, v1

    .line 186
    :goto_7
    nop

    .line 187
    instance-of v1, p0, Lsf/f;

    .line 188
    .line 189
    if-eqz v1, :cond_9

    .line 190
    .line 191
    goto :goto_8

    .line 192
    :cond_9
    move-object v0, p0

    .line 193
    :goto_8
    check-cast v0, Ljava/util/List;

    .line 194
    .line 195
    return-object v0
.end method

.method public static L(I)[I
    .locals 0

    .line 1
    add-int/lit8 p0, p0, 0x1f

    .line 2
    .line 3
    shr-int/lit8 p0, p0, 0x5

    .line 4
    .line 5
    new-array p0, p0, [I

    .line 6
    .line 7
    return-object p0
.end method

.method public static M(Li4/u;Li4/u;)Li4/u;
    .locals 9

    .line 1
    iget-object v0, p0, Li4/u;->h:[Lw4/d;

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    array-length v1, v0

    .line 7
    iget-object v2, p1, Li4/u;->h:[Lw4/d;

    .line 8
    .line 9
    array-length v2, v2

    .line 10
    const/4 v3, 0x0

    .line 11
    if-ne v2, v1, :cond_6

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    move v4, v2

    .line 15
    move-object v5, v3

    .line 16
    :goto_0
    if-ge v4, v1, :cond_4

    .line 17
    .line 18
    aget-object v6, v0, v4

    .line 19
    .line 20
    iget-object v7, p1, Li4/u;->h:[Lw4/d;

    .line 21
    .line 22
    aget-object v7, v7, v4

    .line 23
    .line 24
    invoke-static {v6, v7}, Lx6/d;->O(Lw4/d;Lw4/d;)Lw4/d;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    if-eq v7, v6, :cond_3

    .line 29
    .line 30
    if-nez v5, :cond_1

    .line 31
    .line 32
    new-instance v5, Li4/u;

    .line 33
    .line 34
    array-length v6, v0

    .line 35
    invoke-direct {v5, v6}, Li4/u;-><init>(I)V

    .line 36
    .line 37
    .line 38
    iget-object v6, v5, Li4/u;->h:[Lw4/d;

    .line 39
    .line 40
    array-length v8, v0

    .line 41
    invoke-static {v0, v2, v6, v2, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 42
    .line 43
    .line 44
    :cond_1
    if-nez v7, :cond_2

    .line 45
    .line 46
    invoke-virtual {v5}, Lz4/j;->j()V

    .line 47
    .line 48
    .line 49
    iget-object v6, v5, Li4/u;->h:[Lw4/d;

    .line 50
    .line 51
    aput-object v3, v6, v4

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    invoke-virtual {v5, v4, v7}, Li4/u;->s(ILw4/d;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_4
    if-nez v5, :cond_5

    .line 61
    .line 62
    :goto_2
    return-object p0

    .line 63
    :cond_5
    iput-boolean v2, v5, Lz4/j;->g:Z

    .line 64
    .line 65
    return-object v5

    .line 66
    :cond_6
    new-instance p0, Li4/b0;

    .line 67
    .line 68
    const-string p1, "mismatched maxLocals values"

    .line 69
    .line 70
    invoke-direct {p0, p1, v3}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 71
    .line 72
    .line 73
    throw p0
.end method

.method public static N(Li4/n;Li4/n;)Li4/n;
    .locals 8

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    iget v0, p0, Li4/n;->i:I

    .line 5
    .line 6
    iget v1, p1, Li4/n;->i:I

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-ne v1, v0, :cond_6

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    move v3, v1

    .line 13
    move-object v4, v2

    .line 14
    :goto_0
    if-ge v3, v0, :cond_4

    .line 15
    .line 16
    invoke-virtual {p0, v3}, Li4/n;->o(I)Lw4/d;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-virtual {p1, v3}, Li4/n;->o(I)Lw4/d;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    invoke-static {v5, v6}, Lx6/d;->O(Lw4/d;Lw4/d;)Lw4/d;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    if-eq v7, v5, :cond_3

    .line 29
    .line 30
    if-nez v4, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Li4/n;->n()Li4/n;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    :cond_1
    if-eqz v7, :cond_2

    .line 37
    .line 38
    :try_start_0
    invoke-virtual {v4, v3, v7}, Li4/n;->m(ILw4/d;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :catch_0
    move-exception p0

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    new-instance p0, Li4/b0;

    .line 45
    .line 46
    new-instance p1, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v0, "incompatible: "

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v0, ", "

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-direct {p0, p1, v2}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 72
    .line 73
    .line 74
    throw p0
    :try_end_0
    .catch Li4/b0; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v0, "...while merging stack["

    .line 78
    .line 79
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v3}, La/a;->X0(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string v0, "]"

    .line 90
    .line 91
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p0, p1}, Lf4/a;->a(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p0

    .line 102
    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_4
    if-nez v4, :cond_5

    .line 106
    .line 107
    return-object p0

    .line 108
    :cond_5
    iput-boolean v1, v4, Lz4/j;->g:Z

    .line 109
    .line 110
    return-object v4

    .line 111
    :cond_6
    new-instance p0, Li4/b0;

    .line 112
    .line 113
    const-string p1, "mismatched stack depths"

    .line 114
    .line 115
    invoke-direct {p0, p1, v2}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 116
    .line 117
    .line 118
    throw p0
.end method

.method public static O(Lw4/d;Lw4/d;)Lw4/d;
    .locals 2

    .line 1
    if-eqz p0, :cond_9

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_1
    invoke-interface {p0}, Lw4/d;->getType()Lw4/c;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p1}, Lw4/d;->getType()Lw4/c;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-ne p0, p1, :cond_2

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_2
    invoke-virtual {p0}, Lw4/c;->t()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_7

    .line 30
    .line 31
    invoke-virtual {p1}, Lw4/c;->t()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_7

    .line 36
    .line 37
    sget-object v0, Lw4/c;->x:Lw4/c;

    .line 38
    .line 39
    if-ne p0, v0, :cond_3

    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_3
    if-ne p1, v0, :cond_4

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_4
    invoke-virtual {p0}, Lw4/c;->p()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_6

    .line 50
    .line 51
    invoke-virtual {p1}, Lw4/c;->p()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_6

    .line 56
    .line 57
    invoke-virtual {p0}, Lw4/c;->k()Lw4/c;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p1}, Lw4/c;->k()Lw4/c;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p0, p1}, Lx6/d;->O(Lw4/d;Lw4/d;)Lw4/d;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    if-nez p0, :cond_5

    .line 70
    .line 71
    sget-object p0, Lw4/c;->E:Lw4/c;

    .line 72
    .line 73
    return-object p0

    .line 74
    :cond_5
    check-cast p0, Lw4/c;

    .line 75
    .line 76
    invoke-virtual {p0}, Lw4/c;->e()Lw4/c;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :cond_6
    sget-object p0, Lw4/c;->E:Lw4/c;

    .line 82
    .line 83
    return-object p0

    .line 84
    :cond_7
    invoke-virtual {p0}, Lw4/c;->s()Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-eqz p0, :cond_8

    .line 89
    .line 90
    invoke-virtual {p1}, Lw4/c;->s()Z

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    if-eqz p0, :cond_8

    .line 95
    .line 96
    sget-object p0, Lw4/c;->t:Lw4/c;

    .line 97
    .line 98
    return-object p0

    .line 99
    :cond_8
    return-object v0

    .line 100
    :cond_9
    :goto_0
    return-object p0
.end method

.method public static Q(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x2e3b81

    .line 6
    .line 7
    .line 8
    const-string v2, "text"

    .line 9
    .line 10
    if-eq v0, v1, :cond_2

    .line 11
    .line 12
    const v1, 0x2e7b10

    .line 13
    .line 14
    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    const v1, 0x36452d

    .line 18
    .line 19
    .line 20
    if-eq v0, v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_3

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const-string v0, "card"

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    const-string v0, "both"

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_3

    .line 46
    .line 47
    :goto_0
    return-object v2

    .line 48
    :cond_3
    return-object p0
.end method

.method public static final R(JF)J
    .locals 4

    .line 1
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    int-to-long v0, p2

    .line 6
    const-wide v2, 0xffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    and-long/2addr v0, v2

    .line 12
    or-long/2addr p0, v0

    .line 13
    sget-object p2, Lu2/o;->b:[Lu2/p;

    .line 14
    .line 15
    return-wide p0
.end method

.method public static S(Ljava/lang/String;)Ljava/util/List;
    .locals 9

    .line 1
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, La/a;->E()Luf/c;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x0

    .line 24
    :goto_0
    if-lt v3, v2, :cond_1

    .line 25
    .line 26
    invoke-static {p0}, La/a;->t(Luf/c;)Luf/c;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    goto :goto_2

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    const-string v5, "groupId"

    .line 40
    .line 41
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {v5}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    const-string v6, "templateId"

    .line 57
    .line 58
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-lez v7, :cond_2

    .line 78
    .line 79
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    if-lez v7, :cond_2

    .line 84
    .line 85
    new-instance v7, Lq9/h;

    .line 86
    .line 87
    const-string v8, "label"

    .line 88
    .line 89
    invoke-virtual {v4, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-direct {v7, v5, v4, v6}, Lq9/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v7}, Luf/c;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    .line 109
    .line 110
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :goto_1
    new-instance v0, Lsf/f;

    .line 114
    .line 115
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    move-object p0, v0

    .line 119
    :goto_2
    nop

    .line 120
    instance-of v0, p0, Lsf/f;

    .line 121
    .line 122
    if-eqz v0, :cond_3

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_3
    move-object v1, p0

    .line 126
    :goto_3
    check-cast v1, Ljava/util/List;

    .line 127
    .line 128
    return-object v1
.end method

.method public static T(Ljava/lang/String;)Ljava/util/Set;
    .locals 6

    .line 1
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Ltf/v;->g:Ltf/v;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance p0, Luf/i;

    .line 16
    .line 17
    invoke-direct {p0}, Luf/i;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x0

    .line 25
    :goto_0
    if-lt v3, v2, :cond_1

    .line 26
    .line 27
    invoke-static {p0}, Lac/p;->h(Luf/i;)Luf/i;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    goto :goto_2

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-lez v5, :cond_2

    .line 54
    .line 55
    invoke-virtual {p0, v4}, Luf/i;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :goto_1
    new-instance v0, Lsf/f;

    .line 62
    .line 63
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    move-object p0, v0

    .line 67
    :goto_2
    nop

    .line 68
    instance-of v0, p0, Lsf/f;

    .line 69
    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_3
    move-object v1, p0

    .line 74
    :goto_3
    check-cast v1, Ljava/util/Set;

    .line 75
    .line 76
    return-object v1
.end method

.method public static U(Ljava/lang/String;)Ljava/util/List;
    .locals 19

    .line 1
    const-string v0, "text_first"

    .line 2
    .line 3
    const-string v1, "text"

    .line 4
    .line 5
    invoke-static/range {p0 .. p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    sget-object v3, Ltf/t;->g:Ltf/t;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    return-object v3

    .line 14
    :cond_0
    :try_start_0
    new-instance v2, Lorg/json/JSONArray;

    .line 15
    .line 16
    move-object/from16 v4, p0

    .line 17
    .line 18
    invoke-direct {v2, v4}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, La/a;->E()Luf/c;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    const/4 v6, 0x0

    .line 30
    move v7, v6

    .line 31
    :goto_0
    if-lt v7, v5, :cond_1

    .line 32
    .line 33
    invoke-static {v4}, La/a;->t(Luf/c;)Luf/c;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    goto/16 :goto_4

    .line 38
    .line 39
    :catchall_0
    move-exception v0

    .line 40
    goto/16 :goto_3

    .line 41
    .line 42
    :cond_1
    invoke-virtual {v2, v7}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    if-eqz v8, :cond_5

    .line 47
    .line 48
    const-string v9, "id"

    .line 49
    .line 50
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    if-eqz v10, :cond_2

    .line 59
    .line 60
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 61
    .line 62
    .line 63
    move-result-wide v9

    .line 64
    new-instance v11, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    const-string v12, "rename_"

    .line 70
    .line 71
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v11, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v9, "_"

    .line 78
    .line 79
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    :cond_2
    const-string v10, "name"

    .line 90
    .line 91
    invoke-virtual {v8, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 96
    .line 97
    .line 98
    move-result v11

    .line 99
    if-eqz v11, :cond_3

    .line 100
    .line 101
    add-int/lit8 v10, v7, 0x1

    .line 102
    .line 103
    new-instance v11, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    .line 108
    const-string v12, "\u6a21\u677f "

    .line 109
    .line 110
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    :cond_3
    const-string v11, "enabled"

    .line 121
    .line 122
    const/4 v12, 0x1

    .line 123
    invoke-virtual {v8, v11, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 124
    .line 125
    .line 126
    move-result v11

    .line 127
    const-string v12, "delaySeconds"

    .line 128
    .line 129
    invoke-virtual {v8, v12, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 130
    .line 131
    .line 132
    move-result v12

    .line 133
    const/16 v13, 0x258

    .line 134
    .line 135
    invoke-static {v12, v6, v13}, Lr9/e0;->r(III)I

    .line 136
    .line 137
    .line 138
    move-result v12

    .line 139
    const-string v13, "promptType"

    .line 140
    .line 141
    invoke-virtual {v8, v13, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v13

    .line 145
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-static {v13}, Lx6/d;->Q(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v13

    .line 152
    const-string v14, "bothOrder"

    .line 153
    .line 154
    invoke-virtual {v8, v14, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v14

    .line 158
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    const-string v15, "card_first"

    .line 162
    .line 163
    invoke-virtual {v14, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v14

    .line 167
    if-eqz v14, :cond_4

    .line 168
    .line 169
    move-object v14, v15

    .line 170
    goto :goto_1

    .line 171
    :cond_4
    move-object v14, v0

    .line 172
    :goto_1
    const-string v15, "%userName% \u5c06\u7fa4\u5185\u6635\u79f0\u4ece\u201c%oldGroupNickname%\u201d\u4fee\u6539\u4e3a\u201c%newGroupNickname%\u201d"

    .line 173
    .line 174
    invoke-virtual {v8, v1, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v15

    .line 178
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    const-string v6, "cardTitle"

    .line 182
    .line 183
    move-object/from16 v18, v0

    .line 184
    .line 185
    const-string v0, "%userName% \u4fee\u6539\u4e86\u7fa4\u5185\u6635\u79f0"

    .line 186
    .line 187
    invoke-virtual {v8, v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v16

    .line 191
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    const-string v0, "cardDesc"

    .line 195
    .line 196
    const-string v6, "\u65e7\u6635\u79f0\uff1a%oldGroupNickname%\n\u65b0\u6635\u79f0\uff1a%newGroupNickname%\n\u65f6\u95f4\uff1a%time%"

    .line 197
    .line 198
    invoke-virtual {v8, v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v17

    .line 202
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    new-instance v8, Lq9/g;

    .line 206
    .line 207
    invoke-direct/range {v8 .. v17}, Lq9/g;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v4, v8}, Luf/c;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 211
    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_5
    move-object/from16 v18, v0

    .line 215
    .line 216
    :goto_2
    add-int/lit8 v7, v7, 0x1

    .line 217
    .line 218
    move-object/from16 v0, v18

    .line 219
    .line 220
    const/4 v6, 0x0

    .line 221
    goto/16 :goto_0

    .line 222
    .line 223
    :goto_3
    new-instance v1, Lsf/f;

    .line 224
    .line 225
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 226
    .line 227
    .line 228
    move-object v0, v1

    .line 229
    :goto_4
    nop

    .line 230
    instance-of v1, v0, Lsf/f;

    .line 231
    .line 232
    if-eqz v1, :cond_6

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_6
    move-object v3, v0

    .line 236
    :goto_5
    check-cast v3, Ljava/util/List;

    .line 237
    .line 238
    return-object v3
.end method

.method public static W(II)Ljava/lang/String;
    .locals 1

    .line 1
    if-nez p1, :cond_1

    .line 2
    .line 3
    add-int/lit8 p0, p0, -0x1

    .line 4
    .line 5
    if-gez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    :cond_0
    const-string p1, ",0"

    .line 9
    .line 10
    invoke-static {p0, p1}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, ","

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public static X(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Long;
    .locals 3

    .line 1
    const-string v0, "\""

    .line 2
    .line 3
    :try_start_0
    invoke-static {p0, p1}, Lx6/d;->a0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    const-string v2, "^\\d+$"

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    return-object p0

    .line 30
    :catchall_0
    :cond_0
    :try_start_1
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string p1, "\"\\s*:\\s*(\"?)(\\d+)\\1"

    .line 47
    .line 48
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_1

    .line 68
    .line 69
    const/4 p1, 0x2

    .line 70
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 75
    .line 76
    .line 77
    move-result-wide p0

    .line 78
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 79
    .line 80
    .line 81
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 82
    return-object p0

    .line 83
    :catchall_1
    :cond_1
    const/4 p0, 0x0

    .line 84
    return-object p0
.end method

.method public static Y(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lx6/d;->f0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Ljava/lang/Number;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Number;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_1
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public static Z(Ljava/lang/Object;Ljava/lang/String;I)I
    .locals 4

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "optInt"

    .line 15
    .line 16
    const-class v2, Ljava/lang/String;

    .line 17
    .line 18
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 19
    .line 20
    filled-new-array {v2, v3}, [Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v0, v1, v2}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v0, p0, v1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    instance-of v1, v0, Ljava/lang/Number;

    .line 41
    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    check-cast v0, Ljava/lang/Number;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    return p0

    .line 51
    :catchall_0
    :cond_1
    :try_start_1
    invoke-static {p0, p1}, Lx6/d;->a0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-nez p1, :cond_2

    .line 60
    .line 61
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 65
    return p0

    .line 66
    :catchall_1
    :cond_2
    :goto_0
    return p2
.end method

.method public static final a(Lfg/a;Ly2/u;Ls0/d;Li0/h0;I)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v7, p3

    .line 6
    .line 7
    const v0, 0x3145f7ad

    .line 8
    .line 9
    .line 10
    invoke-virtual {v7, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v7, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v8, 0x4

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    move v0, v8

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v0, v3

    .line 24
    :goto_0
    or-int v0, p4, v0

    .line 25
    .line 26
    invoke-virtual {v7, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    const/16 v4, 0x20

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/16 v4, 0x10

    .line 36
    .line 37
    :goto_1
    or-int v10, v0, v4

    .line 38
    .line 39
    and-int/lit16 v0, v10, 0x93

    .line 40
    .line 41
    const/16 v4, 0x92

    .line 42
    .line 43
    const/4 v11, 0x1

    .line 44
    const/4 v12, 0x0

    .line 45
    if-eq v0, v4, :cond_2

    .line 46
    .line 47
    move v0, v11

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    move v0, v12

    .line 50
    :goto_2
    and-int/lit8 v4, v10, 0x1

    .line 51
    .line 52
    invoke-virtual {v7, v4, v0}, Li0/h0;->S(IZ)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_c

    .line 57
    .line 58
    sget-object v0, Ly1/i0;->f:Li0/m2;

    .line 59
    .line 60
    invoke-virtual {v7, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Landroid/view/View;

    .line 65
    .line 66
    sget-object v4, Ly1/h1;->h:Li0/m2;

    .line 67
    .line 68
    invoke-virtual {v7, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    move-object v5, v4

    .line 73
    check-cast v5, Lu2/c;

    .line 74
    .line 75
    sget-object v4, Ly1/h1;->n:Li0/m2;

    .line 76
    .line 77
    invoke-virtual {v7, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    check-cast v4, Lu2/m;

    .line 82
    .line 83
    invoke-static {v7}, Li0/r;->x(Li0/h0;)Li0/f0;

    .line 84
    .line 85
    .line 86
    move-result-object v13

    .line 87
    invoke-static/range {p2 .. p3}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 88
    .line 89
    .line 90
    move-result-object v14

    .line 91
    new-array v6, v12, [Ljava/lang/Object;

    .line 92
    .line 93
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v15

    .line 97
    sget-object v12, Li0/l;->a:Li0/e;

    .line 98
    .line 99
    if-ne v15, v12, :cond_3

    .line 100
    .line 101
    sget-object v15, Ly2/d;->h:Ly2/d;

    .line 102
    .line 103
    invoke-virtual {v7, v15}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_3
    check-cast v15, Lfg/a;

    .line 107
    .line 108
    const/16 v9, 0x30

    .line 109
    .line 110
    invoke-static {v6, v15, v7, v9}, Lv0/k;->c([Ljava/lang/Object;Lfg/a;Li0/h0;I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    check-cast v6, Ljava/util/UUID;

    .line 115
    .line 116
    invoke-virtual {v7, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    invoke-virtual {v7, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v15

    .line 124
    or-int/2addr v9, v15

    .line 125
    invoke-virtual {v7, v3}, Li0/h0;->d(I)Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    or-int/2addr v3, v9

    .line 130
    const/4 v9, 0x0

    .line 131
    invoke-virtual {v7, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v9

    .line 135
    or-int/2addr v3, v9

    .line 136
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v9

    .line 140
    if-nez v3, :cond_4

    .line 141
    .line 142
    if-ne v9, v12, :cond_5

    .line 143
    .line 144
    :cond_4
    move-object v3, v0

    .line 145
    new-instance v0, Ly2/v;

    .line 146
    .line 147
    invoke-direct/range {v0 .. v6}, Ly2/v;-><init>(Lfg/a;Ly2/u;Landroid/view/View;Lu2/m;Lu2/c;Ljava/util/UUID;)V

    .line 148
    .line 149
    .line 150
    new-instance v3, La1/h;

    .line 151
    .line 152
    const/4 v5, 0x5

    .line 153
    invoke-direct {v3, v14, v5}, La1/h;-><init>(Ljava/lang/Object;I)V

    .line 154
    .line 155
    .line 156
    new-instance v5, Ls0/d;

    .line 157
    .line 158
    const v6, -0x4fce98d3

    .line 159
    .line 160
    .line 161
    invoke-direct {v5, v6, v3, v11}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 162
    .line 163
    .line 164
    iget-object v3, v0, Ly2/v;->m:Ly2/t;

    .line 165
    .line 166
    invoke-virtual {v3, v13}, Ly1/a;->setParentCompositionContext(Li0/o;)V

    .line 167
    .line 168
    .line 169
    iget-object v6, v3, Ly2/t;->q:Li0/j1;

    .line 170
    .line 171
    invoke-virtual {v6, v5}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    iput-boolean v11, v3, Ly2/t;->u:Z

    .line 175
    .line 176
    invoke-virtual {v3}, Ly1/a;->e()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v7, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    move-object v9, v0

    .line 183
    :cond_5
    check-cast v9, Ly2/v;

    .line 184
    .line 185
    invoke-virtual {v7, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    if-nez v0, :cond_6

    .line 194
    .line 195
    if-ne v3, v12, :cond_7

    .line 196
    .line 197
    :cond_6
    new-instance v3, Ly2/a;

    .line 198
    .line 199
    const/4 v0, 0x0

    .line 200
    invoke-direct {v3, v9, v0}, Ly2/a;-><init>(Ly2/v;I)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v7, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    :cond_7
    check-cast v3, Lfg/l;

    .line 207
    .line 208
    invoke-static {v9, v3, v7}, Li0/r;->c(Ljava/lang/Object;Lfg/l;Li0/h0;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v7, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    and-int/lit8 v3, v10, 0xe

    .line 216
    .line 217
    if-ne v3, v8, :cond_8

    .line 218
    .line 219
    move v3, v11

    .line 220
    goto :goto_3

    .line 221
    :cond_8
    const/4 v3, 0x0

    .line 222
    :goto_3
    or-int/2addr v0, v3

    .line 223
    and-int/lit8 v3, v10, 0x70

    .line 224
    .line 225
    const/16 v5, 0x20

    .line 226
    .line 227
    if-ne v3, v5, :cond_9

    .line 228
    .line 229
    goto :goto_4

    .line 230
    :cond_9
    const/4 v11, 0x0

    .line 231
    :goto_4
    or-int/2addr v0, v11

    .line 232
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    invoke-virtual {v7, v3}, Li0/h0;->d(I)Z

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    or-int/2addr v0, v3

    .line 241
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    if-nez v0, :cond_a

    .line 246
    .line 247
    if-ne v3, v12, :cond_b

    .line 248
    .line 249
    :cond_a
    new-instance v3, Ly2/b;

    .line 250
    .line 251
    invoke-direct {v3, v9, v1, v2, v4}, Ly2/b;-><init>(Ly2/v;Lfg/a;Ly2/u;Lu2/m;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v7, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    :cond_b
    check-cast v3, Lfg/a;

    .line 258
    .line 259
    invoke-static {v3, v7}, Li0/r;->j(Lfg/a;Li0/h0;)V

    .line 260
    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_c
    invoke-virtual {v7}, Li0/h0;->V()V

    .line 264
    .line 265
    .line 266
    :goto_5
    invoke-virtual {v7}, Li0/h0;->t()Li0/r1;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    if-eqz v6, :cond_d

    .line 271
    .line 272
    new-instance v0, Ly1/g1;

    .line 273
    .line 274
    const/4 v5, 0x2

    .line 275
    move-object/from16 v3, p2

    .line 276
    .line 277
    move/from16 v4, p4

    .line 278
    .line 279
    invoke-direct/range {v0 .. v5}, Ly1/g1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lfg/p;II)V

    .line 280
    .line 281
    .line 282
    iput-object v0, v6, Li0/r1;->d:Lfg/p;

    .line 283
    .line 284
    :cond_d
    return-void
.end method

.method public static a0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "getString"

    .line 15
    .line 16
    const-class v2, Ljava/lang/String;

    .line 17
    .line 18
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {v0, v1, v2}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {v0, p0, p1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    return-object p0

    .line 41
    :catchall_0
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 42
    return-object p0
.end method

.method public static b0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lx6/d;->f0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Ljava/lang/Number;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Number;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide p0

    .line 19
    return-wide p0

    .line 20
    :cond_1
    const-wide/16 p0, 0x0

    .line 21
    .line 22
    return-wide p0
.end method

.method public static c0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object p0, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p0, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :goto_0
    if-nez p0, :cond_1

    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_1
    :try_start_0
    const-string p1, "d"

    .line 18
    .line 19
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_2
    invoke-static {p0, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :goto_1
    if-eqz v1, :cond_3

    .line 31
    .line 32
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    return-object p0

    .line 37
    :catchall_0
    :cond_3
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public static final d(Ls3/e;ZLfg/a;Lfg/a;Li0/h0;II)V
    .locals 11

    .line 1
    move-object v7, p4

    .line 2
    move/from16 v9, p5

    .line 3
    .line 4
    const v0, 0x48bee1a3

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 8
    .line 9
    .line 10
    and-int/lit8 v0, v9, 0x6

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p4, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v1, 0x2

    .line 23
    :goto_0
    or-int/2addr v1, v9

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move v1, v9

    .line 26
    :goto_1
    and-int/lit8 v2, v9, 0x30

    .line 27
    .line 28
    if-nez v2, :cond_3

    .line 29
    .line 30
    invoke-virtual {p4, p1}, Li0/h0;->g(Z)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    const/16 v3, 0x20

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    const/16 v3, 0x10

    .line 40
    .line 41
    :goto_2
    or-int/2addr v1, v3

    .line 42
    :cond_3
    and-int/lit8 v3, p6, 0x4

    .line 43
    .line 44
    if-eqz v3, :cond_4

    .line 45
    .line 46
    or-int/lit16 v1, v1, 0x180

    .line 47
    .line 48
    goto :goto_4

    .line 49
    :cond_4
    and-int/lit16 v4, v9, 0x180

    .line 50
    .line 51
    if-nez v4, :cond_6

    .line 52
    .line 53
    invoke-virtual {p4, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_5

    .line 58
    .line 59
    const/16 v5, 0x100

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_5
    const/16 v5, 0x80

    .line 63
    .line 64
    :goto_3
    or-int/2addr v1, v5

    .line 65
    :cond_6
    :goto_4
    and-int/lit16 v5, v9, 0xc00

    .line 66
    .line 67
    if-nez v5, :cond_8

    .line 68
    .line 69
    invoke-virtual {p4, p3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_7

    .line 74
    .line 75
    const/16 v5, 0x800

    .line 76
    .line 77
    goto :goto_5

    .line 78
    :cond_7
    const/16 v5, 0x400

    .line 79
    .line 80
    :goto_5
    or-int/2addr v1, v5

    .line 81
    :cond_8
    and-int/lit16 v5, v1, 0x493

    .line 82
    .line 83
    const/16 v8, 0x492

    .line 84
    .line 85
    if-eq v5, v8, :cond_9

    .line 86
    .line 87
    const/4 v5, 0x1

    .line 88
    goto :goto_6

    .line 89
    :cond_9
    const/4 v5, 0x0

    .line 90
    :goto_6
    and-int/lit8 v8, v1, 0x1

    .line 91
    .line 92
    invoke-virtual {p4, v8, v5}, Li0/h0;->S(IZ)Z

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    if-eqz v5, :cond_e

    .line 97
    .line 98
    sget-object v5, Li0/l;->a:Li0/e;

    .line 99
    .line 100
    if-eqz v3, :cond_b

    .line 101
    .line 102
    invoke-virtual {p4}, Li0/h0;->P()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    if-ne v3, v5, :cond_a

    .line 107
    .line 108
    new-instance v3, Lk/s1;

    .line 109
    .line 110
    const/4 v4, 0x7

    .line 111
    invoke-direct {v3, v4}, Lk/s1;-><init>(I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p4, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_a
    check-cast v3, Lfg/a;

    .line 118
    .line 119
    goto :goto_7

    .line 120
    :cond_b
    move-object v3, p2

    .line 121
    :goto_7
    invoke-virtual {p4}, Li0/h0;->P()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    if-ne v4, v5, :cond_c

    .line 126
    .line 127
    new-instance v4, Lk/s1;

    .line 128
    .line 129
    const/4 v8, 0x7

    .line 130
    invoke-direct {v4, v8}, Lk/s1;-><init>(I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p4, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_c
    check-cast v4, Lfg/a;

    .line 137
    .line 138
    invoke-virtual {p4}, Li0/h0;->P()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    if-ne v8, v5, :cond_d

    .line 143
    .line 144
    new-instance v8, Lk/s1;

    .line 145
    .line 146
    const/4 v5, 0x7

    .line 147
    invoke-direct {v8, v5}, Lk/s1;-><init>(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p4, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :cond_d
    check-cast v8, Lfg/a;

    .line 154
    .line 155
    and-int/lit8 v5, v1, 0xe

    .line 156
    .line 157
    or-int/lit16 v5, v5, 0xdb0

    .line 158
    .line 159
    shl-int/lit8 v1, v1, 0x9

    .line 160
    .line 161
    const v10, 0xe000

    .line 162
    .line 163
    .line 164
    and-int/2addr v10, v1

    .line 165
    or-int/2addr v5, v10

    .line 166
    const/high16 v10, 0x70000

    .line 167
    .line 168
    and-int/2addr v10, v1

    .line 169
    or-int/2addr v5, v10

    .line 170
    const/high16 v10, 0x380000

    .line 171
    .line 172
    and-int/2addr v1, v10

    .line 173
    or-int/2addr v1, v5

    .line 174
    move-object v5, v3

    .line 175
    move-object v3, v8

    .line 176
    move v8, v1

    .line 177
    const/4 v1, 0x0

    .line 178
    move-object v0, p0

    .line 179
    move-object v6, p3

    .line 180
    move-object v2, v4

    .line 181
    move v4, p1

    .line 182
    invoke-static/range {v0 .. v8}, Lx6/d;->e(Ls3/e;ZLfg/a;Lfg/a;ZLfg/a;Lfg/a;Li0/h0;I)V

    .line 183
    .line 184
    .line 185
    move-object v3, v5

    .line 186
    goto :goto_8

    .line 187
    :cond_e
    invoke-virtual {p4}, Li0/h0;->V()V

    .line 188
    .line 189
    .line 190
    move-object v3, p2

    .line 191
    :goto_8
    invoke-virtual {p4}, Li0/h0;->t()Li0/r1;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    if-eqz v7, :cond_f

    .line 196
    .line 197
    new-instance v0, Ls3/c;

    .line 198
    .line 199
    move-object v1, p0

    .line 200
    move v2, p1

    .line 201
    move-object v4, p3

    .line 202
    move/from16 v6, p6

    .line 203
    .line 204
    move v5, v9

    .line 205
    invoke-direct/range {v0 .. v6}, Ls3/c;-><init>(Ls3/e;ZLfg/a;Lfg/a;II)V

    .line 206
    .line 207
    .line 208
    iput-object v0, v7, Li0/r1;->d:Lfg/p;

    .line 209
    .line 210
    :cond_f
    return-void
.end method

.method public static d0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lx6/d;->f0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    if-nez p0, :cond_1

    .line 14
    .line 15
    const-string p0, ""

    .line 16
    .line 17
    :cond_1
    return-object p0
.end method

.method public static final e(Ls3/e;ZLfg/a;Lfg/a;ZLfg/a;Lfg/a;Li0/h0;I)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v9, p7

    .line 4
    .line 5
    move/from16 v8, p8

    .line 6
    .line 7
    const v0, 0x358b6fe0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v9, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v0, v8, 0x6

    .line 14
    .line 15
    const/4 v10, 0x4

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v9, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    move v0, v10

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x2

    .line 27
    :goto_0
    or-int/2addr v0, v8

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v0, v8

    .line 30
    :goto_1
    and-int/lit8 v2, v8, 0x30

    .line 31
    .line 32
    const/16 v3, 0x20

    .line 33
    .line 34
    if-nez v2, :cond_3

    .line 35
    .line 36
    move/from16 v2, p1

    .line 37
    .line 38
    invoke-virtual {v9, v2}, Li0/h0;->g(Z)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    move v4, v3

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 v4, 0x10

    .line 47
    .line 48
    :goto_2
    or-int/2addr v0, v4

    .line 49
    goto :goto_3

    .line 50
    :cond_3
    move/from16 v2, p1

    .line 51
    .line 52
    :goto_3
    and-int/lit16 v4, v8, 0x180

    .line 53
    .line 54
    const/16 v5, 0x100

    .line 55
    .line 56
    if-nez v4, :cond_5

    .line 57
    .line 58
    move-object/from16 v4, p2

    .line 59
    .line 60
    invoke-virtual {v9, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_4

    .line 65
    .line 66
    move v6, v5

    .line 67
    goto :goto_4

    .line 68
    :cond_4
    const/16 v6, 0x80

    .line 69
    .line 70
    :goto_4
    or-int/2addr v0, v6

    .line 71
    goto :goto_5

    .line 72
    :cond_5
    move-object/from16 v4, p2

    .line 73
    .line 74
    :goto_5
    and-int/lit16 v6, v8, 0xc00

    .line 75
    .line 76
    if-nez v6, :cond_7

    .line 77
    .line 78
    move-object/from16 v6, p3

    .line 79
    .line 80
    invoke-virtual {v9, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    if-eqz v11, :cond_6

    .line 85
    .line 86
    const/16 v11, 0x800

    .line 87
    .line 88
    goto :goto_6

    .line 89
    :cond_6
    const/16 v11, 0x400

    .line 90
    .line 91
    :goto_6
    or-int/2addr v0, v11

    .line 92
    goto :goto_7

    .line 93
    :cond_7
    move-object/from16 v6, p3

    .line 94
    .line 95
    :goto_7
    and-int/lit16 v11, v8, 0x6000

    .line 96
    .line 97
    if-nez v11, :cond_9

    .line 98
    .line 99
    move/from16 v11, p4

    .line 100
    .line 101
    invoke-virtual {v9, v11}, Li0/h0;->g(Z)Z

    .line 102
    .line 103
    .line 104
    move-result v13

    .line 105
    if-eqz v13, :cond_8

    .line 106
    .line 107
    const/16 v13, 0x4000

    .line 108
    .line 109
    goto :goto_8

    .line 110
    :cond_8
    const/16 v13, 0x2000

    .line 111
    .line 112
    :goto_8
    or-int/2addr v0, v13

    .line 113
    goto :goto_9

    .line 114
    :cond_9
    move/from16 v11, p4

    .line 115
    .line 116
    :goto_9
    const/high16 v13, 0x30000

    .line 117
    .line 118
    and-int/2addr v13, v8

    .line 119
    if-nez v13, :cond_b

    .line 120
    .line 121
    move-object/from16 v13, p5

    .line 122
    .line 123
    invoke-virtual {v9, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v15

    .line 127
    if-eqz v15, :cond_a

    .line 128
    .line 129
    const/high16 v15, 0x20000

    .line 130
    .line 131
    goto :goto_a

    .line 132
    :cond_a
    const/high16 v15, 0x10000

    .line 133
    .line 134
    :goto_a
    or-int/2addr v0, v15

    .line 135
    goto :goto_b

    .line 136
    :cond_b
    move-object/from16 v13, p5

    .line 137
    .line 138
    :goto_b
    const/high16 v15, 0x180000

    .line 139
    .line 140
    and-int/2addr v15, v8

    .line 141
    if-nez v15, :cond_d

    .line 142
    .line 143
    move-object/from16 v15, p6

    .line 144
    .line 145
    invoke-virtual {v9, v15}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v16

    .line 149
    if-eqz v16, :cond_c

    .line 150
    .line 151
    const/high16 v16, 0x100000

    .line 152
    .line 153
    goto :goto_c

    .line 154
    :cond_c
    const/high16 v16, 0x80000

    .line 155
    .line 156
    :goto_c
    or-int v0, v0, v16

    .line 157
    .line 158
    goto :goto_d

    .line 159
    :cond_d
    move-object/from16 v15, p6

    .line 160
    .line 161
    :goto_d
    const v16, 0x92493

    .line 162
    .line 163
    .line 164
    and-int v14, v0, v16

    .line 165
    .line 166
    const v12, 0x92492

    .line 167
    .line 168
    .line 169
    const/4 v7, 0x0

    .line 170
    const/16 v17, 0x1

    .line 171
    .line 172
    if-eq v14, v12, :cond_e

    .line 173
    .line 174
    move/from16 v12, v17

    .line 175
    .line 176
    goto :goto_e

    .line 177
    :cond_e
    move v12, v7

    .line 178
    :goto_e
    and-int/lit8 v14, v0, 0x1

    .line 179
    .line 180
    invoke-virtual {v9, v14, v12}, Li0/h0;->S(IZ)Z

    .line 181
    .line 182
    .line 183
    move-result v12

    .line 184
    if-eqz v12, :cond_25

    .line 185
    .line 186
    sget-object v12, Ly1/u1;->a:Li0/m2;

    .line 187
    .line 188
    invoke-virtual {v9, v12}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v12

    .line 192
    check-cast v12, Ljava/lang/Boolean;

    .line 193
    .line 194
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 195
    .line 196
    .line 197
    move-result v12

    .line 198
    if-eqz v12, :cond_f

    .line 199
    .line 200
    invoke-virtual {v9}, Li0/h0;->t()Li0/r1;

    .line 201
    .line 202
    .line 203
    move-result-object v10

    .line 204
    if-eqz v10, :cond_26

    .line 205
    .line 206
    new-instance v0, Ls3/d;

    .line 207
    .line 208
    const/4 v9, 0x0

    .line 209
    move-object v3, v4

    .line 210
    move-object v4, v6

    .line 211
    move v5, v11

    .line 212
    move-object v6, v13

    .line 213
    move-object v7, v15

    .line 214
    invoke-direct/range {v0 .. v9}, Ls3/d;-><init>(Ls3/e;ZLfg/a;Lfg/a;ZLfg/a;Lfg/a;II)V

    .line 215
    .line 216
    .line 217
    iput-object v0, v10, Li0/r1;->d:Lfg/p;

    .line 218
    .line 219
    return-void

    .line 220
    :cond_f
    sget-object v2, Ls3/b;->a:Li0/u;

    .line 221
    .line 222
    invoke-virtual {v9, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    check-cast v2, Lc9/a1;

    .line 227
    .line 228
    if-nez v2, :cond_14

    .line 229
    .line 230
    const v2, 0x38ac9bd8

    .line 231
    .line 232
    .line 233
    invoke-virtual {v9, v2}, Li0/h0;->a0(I)V

    .line 234
    .line 235
    .line 236
    sget-object v2, Ly1/i0;->f:Li0/m2;

    .line 237
    .line 238
    invoke-virtual {v9, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    check-cast v2, Landroid/view/View;

    .line 243
    .line 244
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    :goto_f
    const/4 v4, 0x0

    .line 248
    if-eqz v2, :cond_13

    .line 249
    .line 250
    const v6, 0x7f06007e

    .line 251
    .line 252
    .line 253
    invoke-virtual {v2, v6}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    instance-of v8, v6, Lc9/a1;

    .line 258
    .line 259
    if-eqz v8, :cond_10

    .line 260
    .line 261
    check-cast v6, Lc9/a1;

    .line 262
    .line 263
    goto :goto_10

    .line 264
    :cond_10
    move-object v6, v4

    .line 265
    :goto_10
    if-eqz v6, :cond_11

    .line 266
    .line 267
    move-object v2, v6

    .line 268
    goto :goto_11

    .line 269
    :cond_11
    invoke-static {v2}, Lfb/v0;->t(Landroid/view/View;)Landroid/view/ViewParent;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    instance-of v6, v2, Landroid/view/View;

    .line 274
    .line 275
    if-eqz v6, :cond_12

    .line 276
    .line 277
    check-cast v2, Landroid/view/View;

    .line 278
    .line 279
    goto :goto_f

    .line 280
    :cond_12
    move-object v2, v4

    .line 281
    goto :goto_f

    .line 282
    :cond_13
    move-object v2, v4

    .line 283
    :goto_11
    invoke-virtual {v9, v7}, Li0/h0;->p(Z)V

    .line 284
    .line 285
    .line 286
    goto :goto_12

    .line 287
    :cond_14
    const v4, 0x38ac9437

    .line 288
    .line 289
    .line 290
    invoke-virtual {v9, v4}, Li0/h0;->a0(I)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v9, v7}, Li0/h0;->p(Z)V

    .line 294
    .line 295
    .line 296
    :goto_12
    if-eqz v2, :cond_24

    .line 297
    .line 298
    iget v4, v2, Lc9/a1;->g:I

    .line 299
    .line 300
    packed-switch v4, :pswitch_data_0

    .line 301
    .line 302
    .line 303
    iget-object v2, v2, Lc9/a1;->k:Lr3/a;

    .line 304
    .line 305
    :goto_13
    move-object v11, v2

    .line 306
    goto :goto_14

    .line 307
    :pswitch_0
    iget-object v2, v2, Lc9/a1;->k:Lr3/a;

    .line 308
    .line 309
    goto :goto_13

    .line 310
    :pswitch_1
    iget-object v2, v2, Lc9/a1;->k:Lr3/a;

    .line 311
    .line 312
    goto :goto_13

    .line 313
    :pswitch_2
    iget-object v2, v2, Lc9/a1;->k:Lr3/a;

    .line 314
    .line 315
    goto :goto_13

    .line 316
    :pswitch_3
    iget-object v2, v2, Lc9/a1;->k:Lr3/a;

    .line 317
    .line 318
    goto :goto_13

    .line 319
    :pswitch_4
    iget-object v2, v2, Lc9/a1;->k:Lr3/a;

    .line 320
    .line 321
    goto :goto_13

    .line 322
    :goto_14
    and-int/lit8 v12, v0, 0xe

    .line 323
    .line 324
    if-ne v12, v10, :cond_15

    .line 325
    .line 326
    move/from16 v2, v17

    .line 327
    .line 328
    goto :goto_15

    .line 329
    :cond_15
    move v2, v7

    .line 330
    :goto_15
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v4

    .line 334
    sget-object v13, Li0/l;->a:Li0/e;

    .line 335
    .line 336
    if-nez v2, :cond_16

    .line 337
    .line 338
    if-ne v4, v13, :cond_17

    .line 339
    .line 340
    :cond_16
    new-instance v4, Ls3/a;

    .line 341
    .line 342
    iget-object v2, v1, Ls3/e;->c:Li0/j1;

    .line 343
    .line 344
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    check-cast v2, Lr3/c;

    .line 349
    .line 350
    new-instance v6, Lnb/a;

    .line 351
    .line 352
    const/16 v8, 0x9

    .line 353
    .line 354
    invoke-direct {v6, v1, v8}, Lnb/a;-><init>(Ljava/lang/Object;I)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 361
    .line 362
    .line 363
    iput-object v2, v4, Ls3/a;->a:Lr3/c;

    .line 364
    .line 365
    sget-object v2, Ltf/t;->g:Ltf/t;

    .line 366
    .line 367
    iput-object v2, v4, Ls3/a;->b:Ljava/util/List;

    .line 368
    .line 369
    iput-object v2, v4, Ls3/a;->c:Ljava/util/List;

    .line 370
    .line 371
    iput-boolean v7, v4, Ls3/a;->d:Z

    .line 372
    .line 373
    iput-boolean v7, v4, Ls3/a;->e:Z

    .line 374
    .line 375
    invoke-virtual {v9, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    :cond_17
    check-cast v4, Ls3/a;

    .line 379
    .line 380
    invoke-virtual {v9, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v2

    .line 384
    and-int/lit8 v6, v0, 0x70

    .line 385
    .line 386
    if-ne v6, v3, :cond_18

    .line 387
    .line 388
    move/from16 v3, v17

    .line 389
    .line 390
    goto :goto_16

    .line 391
    :cond_18
    move v3, v7

    .line 392
    :goto_16
    or-int/2addr v2, v3

    .line 393
    and-int/lit16 v3, v0, 0x380

    .line 394
    .line 395
    if-ne v3, v5, :cond_19

    .line 396
    .line 397
    move/from16 v3, v17

    .line 398
    .line 399
    goto :goto_17

    .line 400
    :cond_19
    move v3, v7

    .line 401
    :goto_17
    or-int/2addr v2, v3

    .line 402
    and-int/lit16 v3, v0, 0x1c00

    .line 403
    .line 404
    const/16 v5, 0x800

    .line 405
    .line 406
    if-ne v3, v5, :cond_1a

    .line 407
    .line 408
    move/from16 v3, v17

    .line 409
    .line 410
    goto :goto_18

    .line 411
    :cond_1a
    move v3, v7

    .line 412
    :goto_18
    or-int/2addr v2, v3

    .line 413
    const v3, 0xe000

    .line 414
    .line 415
    .line 416
    and-int/2addr v3, v0

    .line 417
    const/16 v5, 0x4000

    .line 418
    .line 419
    if-ne v3, v5, :cond_1b

    .line 420
    .line 421
    move/from16 v3, v17

    .line 422
    .line 423
    goto :goto_19

    .line 424
    :cond_1b
    move v3, v7

    .line 425
    :goto_19
    or-int/2addr v2, v3

    .line 426
    const/high16 v3, 0x70000

    .line 427
    .line 428
    and-int/2addr v3, v0

    .line 429
    const/high16 v5, 0x20000

    .line 430
    .line 431
    if-ne v3, v5, :cond_1c

    .line 432
    .line 433
    move/from16 v3, v17

    .line 434
    .line 435
    goto :goto_1a

    .line 436
    :cond_1c
    move v3, v7

    .line 437
    :goto_1a
    or-int/2addr v2, v3

    .line 438
    const/high16 v3, 0x380000

    .line 439
    .line 440
    and-int/2addr v0, v3

    .line 441
    const/high16 v3, 0x100000

    .line 442
    .line 443
    if-ne v0, v3, :cond_1d

    .line 444
    .line 445
    move/from16 v0, v17

    .line 446
    .line 447
    goto :goto_1b

    .line 448
    :cond_1d
    move v0, v7

    .line 449
    :goto_1b
    or-int/2addr v0, v2

    .line 450
    if-ne v12, v10, :cond_1e

    .line 451
    .line 452
    move/from16 v2, v17

    .line 453
    .line 454
    goto :goto_1c

    .line 455
    :cond_1e
    move v2, v7

    .line 456
    :goto_1c
    or-int/2addr v0, v2

    .line 457
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    if-nez v0, :cond_20

    .line 462
    .line 463
    if-ne v2, v13, :cond_1f

    .line 464
    .line 465
    goto :goto_1d

    .line 466
    :cond_1f
    move v14, v7

    .line 467
    goto :goto_1e

    .line 468
    :cond_20
    :goto_1d
    new-instance v0, Lia/y;

    .line 469
    .line 470
    move/from16 v2, p1

    .line 471
    .line 472
    move-object/from16 v3, p2

    .line 473
    .line 474
    move/from16 v5, p4

    .line 475
    .line 476
    move-object/from16 v6, p5

    .line 477
    .line 478
    move-object v8, v1

    .line 479
    move-object v1, v4

    .line 480
    move v14, v7

    .line 481
    move-object/from16 v4, p3

    .line 482
    .line 483
    move-object/from16 v7, p6

    .line 484
    .line 485
    invoke-direct/range {v0 .. v8}, Lia/y;-><init>(Ls3/a;ZLfg/a;Lfg/a;ZLfg/a;Lfg/a;Ls3/e;)V

    .line 486
    .line 487
    .line 488
    move-object v4, v1

    .line 489
    move-object v1, v8

    .line 490
    invoke-virtual {v9, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    move-object v2, v0

    .line 494
    :goto_1e
    check-cast v2, Lfg/a;

    .line 495
    .line 496
    invoke-static {v2, v9}, Li0/r;->j(Lfg/a;Li0/h0;)V

    .line 497
    .line 498
    .line 499
    if-ne v12, v10, :cond_21

    .line 500
    .line 501
    move/from16 v7, v17

    .line 502
    .line 503
    goto :goto_1f

    .line 504
    :cond_21
    move v7, v14

    .line 505
    :goto_1f
    invoke-virtual {v9, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    move-result v0

    .line 509
    or-int/2addr v0, v7

    .line 510
    invoke-virtual {v9, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    move-result v2

    .line 514
    or-int/2addr v0, v2

    .line 515
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    if-nez v0, :cond_22

    .line 520
    .line 521
    if-ne v2, v13, :cond_23

    .line 522
    .line 523
    :cond_22
    new-instance v2, Lb0/s;

    .line 524
    .line 525
    const/16 v0, 0x11

    .line 526
    .line 527
    invoke-direct {v2, v1, v4, v11, v0}, Lb0/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v9, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    :cond_23
    check-cast v2, Lfg/l;

    .line 534
    .line 535
    invoke-static {v1, v2, v9}, Li0/r;->c(Ljava/lang/Object;Lfg/l;Li0/h0;)V

    .line 536
    .line 537
    .line 538
    goto :goto_20

    .line 539
    :cond_24
    const-string v0, "No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner"

    .line 540
    .line 541
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    return-void

    .line 545
    :cond_25
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 546
    .line 547
    .line 548
    :goto_20
    invoke-virtual {v9}, Li0/h0;->t()Li0/r1;

    .line 549
    .line 550
    .line 551
    move-result-object v10

    .line 552
    if-eqz v10, :cond_26

    .line 553
    .line 554
    new-instance v0, Ls3/d;

    .line 555
    .line 556
    const/4 v9, 0x1

    .line 557
    move/from16 v2, p1

    .line 558
    .line 559
    move-object/from16 v3, p2

    .line 560
    .line 561
    move-object/from16 v4, p3

    .line 562
    .line 563
    move/from16 v5, p4

    .line 564
    .line 565
    move-object/from16 v6, p5

    .line 566
    .line 567
    move-object/from16 v7, p6

    .line 568
    .line 569
    move/from16 v8, p8

    .line 570
    .line 571
    invoke-direct/range {v0 .. v9}, Ls3/d;-><init>(Ls3/e;ZLfg/a;Lfg/a;ZLfg/a;Lfg/a;II)V

    .line 572
    .line 573
    .line 574
    iput-object v0, v10, Li0/r1;->d:Lfg/p;

    .line 575
    .line 576
    :cond_26
    return-void

    .line 577
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static e0([BI)I
    .locals 3

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    aget-byte v1, p0, p1

    .line 4
    .line 5
    add-int/lit8 v2, p1, 0x2

    .line 6
    .line 7
    aget-byte v0, p0, v0

    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x3

    .line 10
    .line 11
    aget-byte v2, p0, v2

    .line 12
    .line 13
    aget-byte p0, p0, p1

    .line 14
    .line 15
    and-int/lit16 p0, p0, 0xff

    .line 16
    .line 17
    shl-int/lit8 p0, p0, 0x18

    .line 18
    .line 19
    and-int/lit16 p1, v2, 0xff

    .line 20
    .line 21
    shl-int/lit8 p1, p1, 0x10

    .line 22
    .line 23
    or-int/2addr p0, p1

    .line 24
    and-int/lit16 p1, v0, 0xff

    .line 25
    .line 26
    shl-int/lit8 p1, p1, 0x8

    .line 27
    .line 28
    or-int/2addr p0, p1

    .line 29
    and-int/lit16 p1, v1, 0xff

    .line 30
    .line 31
    or-int/2addr p0, p1

    .line 32
    return p0
.end method

.method public static final f(Ly0/o;Lfg/p;Li0/h0;I)V
    .locals 8

    .line 1
    const v0, 0x4100086b

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p3, 0x6

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p2, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p3

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p3

    .line 23
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    const/16 v1, 0x10

    .line 37
    .line 38
    :goto_2
    or-int/2addr v0, v1

    .line 39
    :cond_3
    and-int/lit8 v1, v0, 0x13

    .line 40
    .line 41
    const/16 v2, 0x12

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    if-eq v1, v2, :cond_4

    .line 45
    .line 46
    move v1, v3

    .line 47
    goto :goto_3

    .line 48
    :cond_4
    const/4 v1, 0x0

    .line 49
    :goto_3
    and-int/lit8 v2, v0, 0x1

    .line 50
    .line 51
    invoke-virtual {p2, v2, v1}, Li0/h0;->S(IZ)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_7

    .line 56
    .line 57
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    sget-object v2, Li0/l;->a:Li0/e;

    .line 62
    .line 63
    if-ne v1, v2, :cond_5

    .line 64
    .line 65
    sget-object v1, Ly2/e;->b:Ly2/e;

    .line 66
    .line 67
    invoke-virtual {p2, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_5
    check-cast v1, Lv1/n0;

    .line 71
    .line 72
    shr-int/lit8 v2, v0, 0x3

    .line 73
    .line 74
    and-int/lit8 v2, v2, 0xe

    .line 75
    .line 76
    or-int/lit16 v2, v2, 0x180

    .line 77
    .line 78
    shl-int/lit8 v0, v0, 0x3

    .line 79
    .line 80
    and-int/lit8 v0, v0, 0x70

    .line 81
    .line 82
    or-int/2addr v0, v2

    .line 83
    iget-wide v4, p2, Li0/h0;->T:J

    .line 84
    .line 85
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    invoke-virtual {p2}, Li0/h0;->l()Ls0/h;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-static {p2, p0}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    sget-object v6, Lx1/g;->f:Lx1/f;

    .line 98
    .line 99
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    sget-object v6, Lx1/f;->b:Lx1/y;

    .line 103
    .line 104
    shl-int/lit8 v0, v0, 0x6

    .line 105
    .line 106
    and-int/lit16 v0, v0, 0x380

    .line 107
    .line 108
    or-int/lit8 v0, v0, 0x6

    .line 109
    .line 110
    invoke-virtual {p2}, Li0/h0;->d0()V

    .line 111
    .line 112
    .line 113
    iget-boolean v7, p2, Li0/h0;->S:Z

    .line 114
    .line 115
    if-eqz v7, :cond_6

    .line 116
    .line 117
    invoke-virtual {p2, v6}, Li0/h0;->k(Lfg/a;)V

    .line 118
    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_6
    invoke-virtual {p2}, Li0/h0;->n0()V

    .line 122
    .line 123
    .line 124
    :goto_4
    sget-object v6, Lx1/f;->e:Lx1/e;

    .line 125
    .line 126
    invoke-static {v6, p2, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    sget-object v1, Lx1/f;->d:Lx1/e;

    .line 130
    .line 131
    invoke-static {v1, p2, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    sget-object v2, Lx1/f;->f:Lx1/e;

    .line 139
    .line 140
    invoke-static {v2, p2, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    sget-object v1, Lx1/f;->g:Lx1/d;

    .line 144
    .line 145
    invoke-static {v1, p2}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 146
    .line 147
    .line 148
    sget-object v1, Lx1/f;->c:Lx1/e;

    .line 149
    .line 150
    invoke-static {v1, p2, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    shr-int/lit8 v0, v0, 0x6

    .line 154
    .line 155
    and-int/lit8 v0, v0, 0xe

    .line 156
    .line 157
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-interface {p1, p2, v0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p2, v3}, Li0/h0;->p(Z)V

    .line 165
    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_7
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 169
    .line 170
    .line 171
    :goto_5
    invoke-virtual {p2}, Li0/h0;->t()Li0/r1;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    if-eqz p2, :cond_8

    .line 176
    .line 177
    new-instance v0, Ly2/f;

    .line 178
    .line 179
    invoke-direct {v0, p0, p1, p3}, Ly2/f;-><init>(Ly0/o;Lfg/p;I)V

    .line 180
    .line 181
    .line 182
    iput-object v0, p2, Li0/r1;->d:Lfg/p;

    .line 183
    .line 184
    :cond_8
    return-void
.end method

.method public static f0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    invoke-static {p0, p1, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    return-object p1

    .line 11
    :cond_0
    invoke-static {p0, p2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_1
    invoke-static {p0, p3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static g0([II)V
    .locals 2

    .line 1
    shr-int/lit8 v0, p1, 0x5

    .line 2
    .line 3
    and-int/lit8 p1, p1, 0x1f

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    shl-int p1, v1, p1

    .line 7
    .line 8
    aget v1, p0, v0

    .line 9
    .line 10
    or-int/2addr p1, v1

    .line 11
    aput p1, p0, v0

    .line 12
    .line 13
    return-void
.end method

.method public static h0(Lud/r;Lke/e;Lud/j;)V
    .locals 3

    .line 1
    instance-of v0, p2, Lud/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p2, Lud/h;

    .line 6
    .line 7
    invoke-interface {p1, p0, p2}, Lke/e;->d(Lud/r;Lud/h;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    instance-of v0, p2, Lud/n;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    check-cast p2, Lud/n;

    .line 16
    .line 17
    invoke-interface {p1, p0, p2}, Lke/e;->a(Lud/r;Lud/n;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-interface {p2}, Lud/n;->u()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v1, Lbe/w;

    .line 28
    .line 29
    const/16 v2, 0xa

    .line 30
    .line 31
    invoke-direct {v1, p0, v2, p1}, Lbe/w;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v1}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-interface {p1, p0, p2}, Lke/e;->b(Lud/r;Lud/n;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    return-void
.end method

.method public static final i(Lh0/q0;Lh0/w;)Lh0/v;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lh0/q0;->d()Lh0/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Lh0/q0;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lh0/s;

    .line 8
    .line 9
    sget-object v1, Lh0/h;->g:Lh0/h;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    move v0, v3

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v2

    .line 18
    :goto_0
    new-instance v1, Lh0/v;

    .line 19
    .line 20
    invoke-static {p0, v0, v3, p1}, Lx6/d;->l(Lh0/s;ZZLh0/w;)Lh0/u;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {p0, v0, v2, p1}, Lx6/d;->l(Lh0/s;ZZLh0/w;)Lh0/u;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {v1, v3, p0, v0}, Lh0/v;-><init>(Lh0/u;Lh0/u;Z)V

    .line 29
    .line 30
    .line 31
    return-object v1
.end method

.method public static i0(Lud/r;Lke/d;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lud/r;->z:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x5

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    iget-object v2, p0, Lud/r;->G:Lxd/b;

    .line 11
    .line 12
    invoke-static {p0, p1, v2}, Lx6/d;->j0(Lud/r;Lke/d;Lud/j;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/lit8 v3, v1, 0x1

    .line 17
    .line 18
    if-gt v1, v0, :cond_1

    .line 19
    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    move v1, v3

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    new-instance v1, Laf/g;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object p0, p0, Lud/r;->z:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    new-instance v2, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v3, "Iterative traversal limit reached: limit: "

    .line 44
    .line 45
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v0, ", visitor: "

    .line 52
    .line 53
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string p1, ", blocks count: "

    .line 60
    .line 61
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v1
.end method

.method public static final j(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v2, 0x3

    .line 25
    if-ne v0, v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/4 v2, 0x1

    .line 32
    aget-object v0, v0, v2

    .line 33
    .line 34
    const-class v3, Lorg/json/JSONObject;

    .line 35
    .line 36
    invoke-static {v0, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const/4 v3, 0x2

    .line 47
    aget-object v0, v0, v3

    .line 48
    .line 49
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    invoke-static {v0, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    const-string v0, "com.tencent.mm.plugin.appbrand.jsapi."

    .line 58
    .line 59
    invoke-static {p0, v1, v0}, Leh/a;->A(Ljava/lang/reflect/Method;ZLjava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_0

    .line 64
    .line 65
    return v2

    .line 66
    :cond_0
    return v1
.end method

.method public static j0(Lud/r;Lke/d;Lud/j;)Z
    .locals 1

    .line 1
    instance-of v0, p2, Lud/n;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p2, Lud/n;

    .line 6
    .line 7
    invoke-interface {p1, p0, p2}, Lke/d;->c(Lud/r;Lud/n;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-interface {p2}, Lud/n;->u()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lud/j;

    .line 33
    .line 34
    :try_start_0
    invoke-static {p0, p1, v0}, Lx6/d;->j0(Lud/r;Lke/d;Lud/j;)Z

    .line 35
    .line 36
    .line 37
    move-result v0
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    :goto_0
    const/4 p0, 0x1

    .line 41
    return p0

    .line 42
    :catch_0
    new-instance p0, Laf/f;

    .line 43
    .line 44
    const-string p1, "Region traversal failed: Recursive call in traverseIterativeStepInternal method"

    .line 45
    .line 46
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p0

    .line 50
    :cond_2
    const/4 p0, 0x0

    .line 51
    return p0
.end method

.method public static final k(Lh0/q0;Lh0/s;Lh0/u;)Lh0/u;
    .locals 13

    .line 1
    iget v0, p1, Lh0/s;->c:I

    .line 2
    .line 3
    iget v1, p1, Lh0/s;->b:I

    .line 4
    .line 5
    iget-boolean v2, p0, Lh0/q0;->b:Z

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move v5, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v5, v0

    .line 12
    :goto_0
    iget-object v3, p1, Lh0/s;->e:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v9, v3

    .line 15
    check-cast v9, Li2/k0;

    .line 16
    .line 17
    iget v10, p1, Lh0/s;->d:I

    .line 18
    .line 19
    new-instance v3, Lsh/v;

    .line 20
    .line 21
    const/4 v4, 0x5

    .line 22
    invoke-direct {v3, v5, v4, p1}, Lsh/v;-><init>(IILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sget-object v11, Lsf/d;->h:Lsf/d;

    .line 26
    .line 27
    invoke-static {v11, v3}, Lbe/h;->G(Lsf/d;Lfg/a;)Lsf/c;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    move v6, v0

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v6, v1

    .line 36
    :goto_1
    new-instance v3, Lh0/x;

    .line 37
    .line 38
    move-object v7, p0

    .line 39
    move-object v4, p1

    .line 40
    invoke-direct/range {v3 .. v8}, Lh0/x;-><init>(Lh0/s;IILh0/q0;Lsf/c;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v11, v3}, Lbe/h;->G(Lsf/d;Lfg/a;)Lsf/c;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-wide/16 v6, 0x1

    .line 48
    .line 49
    iget-wide v11, p2, Lh0/u;->c:J

    .line 50
    .line 51
    cmp-long p1, v6, v11

    .line 52
    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    invoke-interface {p0}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Lh0/u;

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_2
    if-ne v5, v10, :cond_3

    .line 63
    .line 64
    return-object p2

    .line 65
    :cond_3
    iget-object p1, v9, Li2/k0;->b:Li2/o;

    .line 66
    .line 67
    invoke-virtual {p1, v10}, Li2/o;->d(I)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    invoke-interface {v8}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    check-cast v3, Ljava/lang/Number;

    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eq v3, p1, :cond_4

    .line 82
    .line 83
    invoke-interface {p0}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, Lh0/u;

    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_4
    iget p1, p2, Lh0/u;->b:I

    .line 91
    .line 92
    invoke-virtual {v9, p1}, Li2/k0;->j(I)J

    .line 93
    .line 94
    .line 95
    move-result-wide v6

    .line 96
    const/4 p2, -0x1

    .line 97
    if-ne v10, p2, :cond_5

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_5
    if-ne v5, v10, :cond_6

    .line 101
    .line 102
    goto :goto_6

    .line 103
    :cond_6
    sget-object p2, Lh0/h;->g:Lh0/h;

    .line 104
    .line 105
    if-ge v1, v0, :cond_7

    .line 106
    .line 107
    sget-object v0, Lh0/h;->h:Lh0/h;

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_7
    if-le v1, v0, :cond_8

    .line 111
    .line 112
    move-object v0, p2

    .line 113
    goto :goto_2

    .line 114
    :cond_8
    sget-object v0, Lh0/h;->i:Lh0/h;

    .line 115
    .line 116
    :goto_2
    if-ne v0, p2, :cond_9

    .line 117
    .line 118
    const/4 p2, 0x1

    .line 119
    goto :goto_3

    .line 120
    :cond_9
    const/4 p2, 0x0

    .line 121
    :goto_3
    xor-int/2addr p2, v2

    .line 122
    if-eqz p2, :cond_a

    .line 123
    .line 124
    if-ge v5, v10, :cond_d

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_a
    if-le v5, v10, :cond_d

    .line 128
    .line 129
    :goto_4
    sget p2, Li2/m0;->c:I

    .line 130
    .line 131
    const/16 p2, 0x20

    .line 132
    .line 133
    shr-long v0, v6, p2

    .line 134
    .line 135
    long-to-int p2, v0

    .line 136
    if-eq p1, p2, :cond_c

    .line 137
    .line 138
    const-wide v0, 0xffffffffL

    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    and-long/2addr v0, v6

    .line 144
    long-to-int p2, v0

    .line 145
    if-ne p1, p2, :cond_b

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_b
    invoke-virtual {v4, v5}, Lh0/s;->a(I)Lh0/u;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    return-object p0

    .line 153
    :cond_c
    :goto_5
    invoke-interface {p0}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    check-cast p0, Lh0/u;

    .line 158
    .line 159
    return-object p0

    .line 160
    :cond_d
    :goto_6
    invoke-virtual {v4, v5}, Lh0/s;->a(I)Lh0/u;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    return-object p0
.end method

.method public static final l(Lh0/s;ZZLh0/w;)Lh0/u;
    .locals 2

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget v0, p0, Lh0/s;->b:I

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget v0, p0, Lh0/s;->c:I

    .line 7
    .line 8
    :goto_0
    iget p3, p3, Lh0/w;->a:I

    .line 9
    .line 10
    packed-switch p3, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object p3, p0, Lh0/s;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p3, Li2/k0;

    .line 16
    .line 17
    invoke-virtual {p3, v0}, Li2/k0;->j(I)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    goto :goto_1

    .line 22
    :pswitch_0
    iget-object p3, p0, Lh0/s;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p3, Li2/k0;

    .line 25
    .line 26
    iget-object p3, p3, Li2/k0;->a:Li2/j0;

    .line 27
    .line 28
    iget-object p3, p3, Li2/j0;->a:Li2/g;

    .line 29
    .line 30
    iget-object p3, p3, Li2/g;->h:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {p3, v0}, Lw/s;->s(Ljava/lang/CharSequence;I)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-static {p3, v0}, Lw/s;->r(Ljava/lang/CharSequence;I)I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    invoke-static {v1, p3}, Li2/e0;->b(II)J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    :goto_1
    xor-int/2addr p1, p2

    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    sget p1, Li2/m0;->c:I

    .line 48
    .line 49
    const/16 p1, 0x20

    .line 50
    .line 51
    shr-long p1, v0, p1

    .line 52
    .line 53
    :goto_2
    long-to-int p1, p1

    .line 54
    goto :goto_3

    .line 55
    :cond_1
    sget p1, Li2/m0;->c:I

    .line 56
    .line 57
    const-wide p1, 0xffffffffL

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    and-long/2addr p1, v0

    .line 63
    goto :goto_2

    .line 64
    :goto_3
    invoke-virtual {p0, p1}, Lh0/s;->a(I)Lh0/u;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public static final m(Lai/b;Ljava/lang/String;Luh/d;Z)V
    .locals 9

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-wide v0, p2, Luh/d;->b:J

    .line 5
    .line 6
    iget-object v2, p2, Luh/d;->a:Luh/c;

    .line 7
    .line 8
    iget v3, v2, Luh/c;->a:F

    .line 9
    .line 10
    const/high16 v4, 0x3f000000    # 0.5f

    .line 11
    .line 12
    sub-float/2addr v3, v4

    .line 13
    iget v4, v2, Luh/c;->b:F

    .line 14
    .line 15
    const v5, 0x3f333333    # 0.7f

    .line 16
    .line 17
    .line 18
    sub-float/2addr v4, v5

    .line 19
    iget v2, v2, Luh/c;->c:F

    .line 20
    .line 21
    mul-float v5, v3, v3

    .line 22
    .line 23
    mul-float v6, v4, v4

    .line 24
    .line 25
    add-float/2addr v6, v5

    .line 26
    mul-float v5, v2, v2

    .line 27
    .line 28
    add-float/2addr v5, v6

    .line 29
    float-to-double v5, v5

    .line 30
    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    .line 31
    .line 32
    .line 33
    move-result-wide v5

    .line 34
    double-to-float v5, v5

    .line 35
    const v6, 0x358637bd    # 1.0E-6f

    .line 36
    .line 37
    .line 38
    cmpg-float v7, v5, v6

    .line 39
    .line 40
    if-gez v7, :cond_0

    .line 41
    .line 42
    move v5, v6

    .line 43
    :cond_0
    div-float/2addr v3, v5

    .line 44
    div-float/2addr v4, v5

    .line 45
    const-string v6, "lightDir"

    .line 46
    .line 47
    invoke-virtual {v6, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    div-float/2addr v2, v5

    .line 52
    iget-object v5, p0, Lai/b;->a:Landroid/graphics/RuntimeShader;

    .line 53
    .line 54
    invoke-static {v5, v6, v3, v4, v2}, Lai/a;->u(Landroid/graphics/RuntimeShader;Ljava/lang/String;FFF)V

    .line 55
    .line 56
    .line 57
    const-string v2, "lightColor"

    .line 58
    .line 59
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    const/high16 v5, 0x3f800000    # 1.0f

    .line 64
    .line 65
    invoke-static {v0, v1, v5}, Lf1/w;->b(JF)J

    .line 66
    .line 67
    .line 68
    move-result-wide v6

    .line 69
    iget-object v8, p0, Lai/b;->a:Landroid/graphics/RuntimeShader;

    .line 70
    .line 71
    invoke-static {v6, v7}, Lf1/c0;->w(J)I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    invoke-static {v8, v2, v6}, Lai/a;->v(Landroid/graphics/RuntimeShader;Ljava/lang/String;I)V

    .line 76
    .line 77
    .line 78
    const-string v2, "lightIntensity"

    .line 79
    .line 80
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-static {v0, v1}, Lf1/w;->d(J)F

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget p2, p2, Luh/d;->c:F

    .line 89
    .line 90
    mul-float/2addr v0, p2

    .line 91
    iget-object p2, p0, Lai/b;->a:Landroid/graphics/RuntimeShader;

    .line 92
    .line 93
    invoke-static {p2, v2, v0}, Lai/a;->s(Landroid/graphics/RuntimeShader;Ljava/lang/String;F)V

    .line 94
    .line 95
    .line 96
    if-eqz p3, :cond_3

    .line 97
    .line 98
    mul-float p2, v3, v3

    .line 99
    .line 100
    mul-float p3, v4, v4

    .line 101
    .line 102
    add-float/2addr p3, p2

    .line 103
    float-to-double p2, p3

    .line 104
    invoke-static {p2, p3}, Ljava/lang/Math;->sqrt(D)D

    .line 105
    .line 106
    .line 107
    move-result-wide p2

    .line 108
    double-to-float p2, p2

    .line 109
    const p3, 0x3a83126f    # 0.001f

    .line 110
    .line 111
    .line 112
    cmpl-float p3, p2, p3

    .line 113
    .line 114
    const-string v0, "axis"

    .line 115
    .line 116
    if-lez p3, :cond_1

    .line 117
    .line 118
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    div-float/2addr v3, p2

    .line 123
    div-float/2addr v4, p2

    .line 124
    iget-object p0, p0, Lai/b;->a:Landroid/graphics/RuntimeShader;

    .line 125
    .line 126
    invoke-static {p0, p1, v3, v4}, Lai/a;->t(Landroid/graphics/RuntimeShader;Ljava/lang/String;FF)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_1
    const-string p2, "1"

    .line 131
    .line 132
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    if-eqz p2, :cond_2

    .line 137
    .line 138
    const/high16 v5, -0x40800000    # -1.0f

    .line 139
    .line 140
    :cond_2
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    const/4 p2, 0x0

    .line 145
    iget-object p0, p0, Lai/b;->a:Landroid/graphics/RuntimeShader;

    .line 146
    .line 147
    invoke-static {p0, p1, p2, v5}, Lai/a;->t(Landroid/graphics/RuntimeShader;Ljava/lang/String;FF)V

    .line 148
    .line 149
    .line 150
    :cond_3
    return-void
.end method

.method public static final varargs n([Lsf/e;)Landroid/os/Bundle;
    .locals 9

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(I)V

    .line 5
    .line 6
    .line 7
    array-length v1, p0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1d

    .line 10
    .line 11
    aget-object v3, p0, v2

    .line 12
    .line 13
    iget-object v4, v3, Lsf/e;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Ljava/lang/String;

    .line 16
    .line 17
    iget-object v3, v3, Lsf/e;->h:Ljava/lang/Object;

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_2

    .line 26
    .line 27
    :cond_0
    instance-of v5, v3, Ljava/lang/Boolean;

    .line 28
    .line 29
    if-eqz v5, :cond_1

    .line 30
    .line 31
    check-cast v3, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_2

    .line 41
    .line 42
    :cond_1
    instance-of v5, v3, Ljava/lang/Byte;

    .line 43
    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    check-cast v3, Ljava/lang/Number;

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/Number;->byteValue()B

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putByte(Ljava/lang/String;B)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_2

    .line 56
    .line 57
    :cond_2
    instance-of v5, v3, Ljava/lang/Character;

    .line 58
    .line 59
    if-eqz v5, :cond_3

    .line 60
    .line 61
    check-cast v3, Ljava/lang/Character;

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Character;->charValue()C

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putChar(Ljava/lang/String;C)V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_2

    .line 71
    .line 72
    :cond_3
    instance-of v5, v3, Ljava/lang/Double;

    .line 73
    .line 74
    if-eqz v5, :cond_4

    .line 75
    .line 76
    check-cast v3, Ljava/lang/Number;

    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    .line 79
    .line 80
    .line 81
    move-result-wide v5

    .line 82
    invoke-virtual {v0, v4, v5, v6}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 83
    .line 84
    .line 85
    goto/16 :goto_2

    .line 86
    .line 87
    :cond_4
    instance-of v5, v3, Ljava/lang/Float;

    .line 88
    .line 89
    if-eqz v5, :cond_5

    .line 90
    .line 91
    check-cast v3, Ljava/lang/Number;

    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 98
    .line 99
    .line 100
    goto/16 :goto_2

    .line 101
    .line 102
    :cond_5
    instance-of v5, v3, Ljava/lang/Integer;

    .line 103
    .line 104
    if-eqz v5, :cond_6

    .line 105
    .line 106
    check-cast v3, Ljava/lang/Number;

    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 113
    .line 114
    .line 115
    goto/16 :goto_2

    .line 116
    .line 117
    :cond_6
    instance-of v5, v3, Ljava/lang/Long;

    .line 118
    .line 119
    if-eqz v5, :cond_7

    .line 120
    .line 121
    check-cast v3, Ljava/lang/Number;

    .line 122
    .line 123
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 124
    .line 125
    .line 126
    move-result-wide v5

    .line 127
    invoke-virtual {v0, v4, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 128
    .line 129
    .line 130
    goto/16 :goto_2

    .line 131
    .line 132
    :cond_7
    instance-of v5, v3, Ljava/lang/Short;

    .line 133
    .line 134
    if-eqz v5, :cond_8

    .line 135
    .line 136
    check-cast v3, Ljava/lang/Number;

    .line 137
    .line 138
    invoke-virtual {v3}, Ljava/lang/Number;->shortValue()S

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putShort(Ljava/lang/String;S)V

    .line 143
    .line 144
    .line 145
    goto/16 :goto_2

    .line 146
    .line 147
    :cond_8
    instance-of v5, v3, Landroid/os/Bundle;

    .line 148
    .line 149
    if-eqz v5, :cond_9

    .line 150
    .line 151
    check-cast v3, Landroid/os/Bundle;

    .line 152
    .line 153
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 154
    .line 155
    .line 156
    goto/16 :goto_2

    .line 157
    .line 158
    :cond_9
    instance-of v5, v3, Ljava/lang/CharSequence;

    .line 159
    .line 160
    if-eqz v5, :cond_a

    .line 161
    .line 162
    check-cast v3, Ljava/lang/CharSequence;

    .line 163
    .line 164
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 165
    .line 166
    .line 167
    goto/16 :goto_2

    .line 168
    .line 169
    :cond_a
    instance-of v5, v3, Landroid/os/Parcelable;

    .line 170
    .line 171
    if-eqz v5, :cond_b

    .line 172
    .line 173
    check-cast v3, Landroid/os/Parcelable;

    .line 174
    .line 175
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 176
    .line 177
    .line 178
    goto/16 :goto_2

    .line 179
    .line 180
    :cond_b
    instance-of v5, v3, [Z

    .line 181
    .line 182
    if-eqz v5, :cond_c

    .line 183
    .line 184
    check-cast v3, [Z

    .line 185
    .line 186
    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putBooleanArray(Ljava/lang/String;[Z)V

    .line 187
    .line 188
    .line 189
    goto/16 :goto_2

    .line 190
    .line 191
    :cond_c
    instance-of v5, v3, [B

    .line 192
    .line 193
    if-eqz v5, :cond_d

    .line 194
    .line 195
    check-cast v3, [B

    .line 196
    .line 197
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 198
    .line 199
    .line 200
    goto/16 :goto_2

    .line 201
    .line 202
    :cond_d
    instance-of v5, v3, [C

    .line 203
    .line 204
    if-eqz v5, :cond_e

    .line 205
    .line 206
    check-cast v3, [C

    .line 207
    .line 208
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putCharArray(Ljava/lang/String;[C)V

    .line 209
    .line 210
    .line 211
    goto/16 :goto_2

    .line 212
    .line 213
    :cond_e
    instance-of v5, v3, [D

    .line 214
    .line 215
    if-eqz v5, :cond_f

    .line 216
    .line 217
    check-cast v3, [D

    .line 218
    .line 219
    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putDoubleArray(Ljava/lang/String;[D)V

    .line 220
    .line 221
    .line 222
    goto/16 :goto_2

    .line 223
    .line 224
    :cond_f
    instance-of v5, v3, [F

    .line 225
    .line 226
    if-eqz v5, :cond_10

    .line 227
    .line 228
    check-cast v3, [F

    .line 229
    .line 230
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V

    .line 231
    .line 232
    .line 233
    goto/16 :goto_2

    .line 234
    .line 235
    :cond_10
    instance-of v5, v3, [I

    .line 236
    .line 237
    if-eqz v5, :cond_11

    .line 238
    .line 239
    check-cast v3, [I

    .line 240
    .line 241
    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    .line 242
    .line 243
    .line 244
    goto/16 :goto_2

    .line 245
    .line 246
    :cond_11
    instance-of v5, v3, [J

    .line 247
    .line 248
    if-eqz v5, :cond_12

    .line 249
    .line 250
    check-cast v3, [J

    .line 251
    .line 252
    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putLongArray(Ljava/lang/String;[J)V

    .line 253
    .line 254
    .line 255
    goto/16 :goto_2

    .line 256
    .line 257
    :cond_12
    instance-of v5, v3, [S

    .line 258
    .line 259
    if-eqz v5, :cond_13

    .line 260
    .line 261
    check-cast v3, [S

    .line 262
    .line 263
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putShortArray(Ljava/lang/String;[S)V

    .line 264
    .line 265
    .line 266
    goto/16 :goto_2

    .line 267
    .line 268
    :cond_13
    instance-of v5, v3, [Ljava/lang/Object;

    .line 269
    .line 270
    const/16 v6, 0x22

    .line 271
    .line 272
    const-string v7, " for key \""

    .line 273
    .line 274
    if-eqz v5, :cond_18

    .line 275
    .line 276
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    invoke-virtual {v5}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    move-result-object v5

    .line 284
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    const-class v8, Landroid/os/Parcelable;

    .line 288
    .line 289
    invoke-virtual {v8, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 290
    .line 291
    .line 292
    move-result v8

    .line 293
    if-eqz v8, :cond_14

    .line 294
    .line 295
    check-cast v3, [Landroid/os/Parcelable;

    .line 296
    .line 297
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 298
    .line 299
    .line 300
    goto :goto_2

    .line 301
    :cond_14
    const-class v8, Ljava/lang/String;

    .line 302
    .line 303
    invoke-virtual {v8, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 304
    .line 305
    .line 306
    move-result v8

    .line 307
    if-eqz v8, :cond_15

    .line 308
    .line 309
    check-cast v3, [Ljava/lang/String;

    .line 310
    .line 311
    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    goto :goto_2

    .line 315
    :cond_15
    const-class v8, Ljava/lang/CharSequence;

    .line 316
    .line 317
    invoke-virtual {v8, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 318
    .line 319
    .line 320
    move-result v8

    .line 321
    if-eqz v8, :cond_16

    .line 322
    .line 323
    check-cast v3, [Ljava/lang/CharSequence;

    .line 324
    .line 325
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putCharSequenceArray(Ljava/lang/String;[Ljava/lang/CharSequence;)V

    .line 326
    .line 327
    .line 328
    goto :goto_2

    .line 329
    :cond_16
    const-class v8, Ljava/io/Serializable;

    .line 330
    .line 331
    invoke-virtual {v8, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 332
    .line 333
    .line 334
    move-result v8

    .line 335
    if-eqz v8, :cond_17

    .line 336
    .line 337
    check-cast v3, Ljava/io/Serializable;

    .line 338
    .line 339
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 340
    .line 341
    .line 342
    goto :goto_2

    .line 343
    :cond_17
    invoke-virtual {v5}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object p0

    .line 347
    const-string v0, "Illegal value array type "

    .line 348
    .line 349
    invoke-static {p0, v0, v7, v4, v6}, Lah/a;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 350
    .line 351
    .line 352
    :goto_1
    const/4 p0, 0x0

    .line 353
    return-object p0

    .line 354
    :cond_18
    instance-of v5, v3, Ljava/io/Serializable;

    .line 355
    .line 356
    if-eqz v5, :cond_19

    .line 357
    .line 358
    check-cast v3, Ljava/io/Serializable;

    .line 359
    .line 360
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 361
    .line 362
    .line 363
    goto :goto_2

    .line 364
    :cond_19
    instance-of v5, v3, Landroid/os/IBinder;

    .line 365
    .line 366
    if-eqz v5, :cond_1a

    .line 367
    .line 368
    check-cast v3, Landroid/os/IBinder;

    .line 369
    .line 370
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 371
    .line 372
    .line 373
    goto :goto_2

    .line 374
    :cond_1a
    instance-of v5, v3, Landroid/util/Size;

    .line 375
    .line 376
    if-eqz v5, :cond_1b

    .line 377
    .line 378
    check-cast v3, Landroid/util/Size;

    .line 379
    .line 380
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putSize(Ljava/lang/String;Landroid/util/Size;)V

    .line 381
    .line 382
    .line 383
    goto :goto_2

    .line 384
    :cond_1b
    instance-of v5, v3, Landroid/util/SizeF;

    .line 385
    .line 386
    if-eqz v5, :cond_1c

    .line 387
    .line 388
    check-cast v3, Landroid/util/SizeF;

    .line 389
    .line 390
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putSizeF(Ljava/lang/String;Landroid/util/SizeF;)V

    .line 391
    .line 392
    .line 393
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 394
    .line 395
    goto/16 :goto_0

    .line 396
    .line 397
    :cond_1c
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    move-result-object p0

    .line 401
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object p0

    .line 405
    const-string v0, "Illegal value type "

    .line 406
    .line 407
    invoke-static {p0, v0, v7, v4, v6}, Lah/a;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 408
    .line 409
    .line 410
    goto :goto_1

    .line 411
    :cond_1d
    return-object v0
.end method

.method public static final o(Lh0/u;Lh0/s;I)Lh0/u;
    .locals 2

    .line 1
    iget-object p1, p1, Lh0/s;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Li2/k0;

    .line 4
    .line 5
    invoke-virtual {p1, p2}, Li2/k0;->a(I)Lt2/j;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-wide v0, p0, Lh0/u;->c:J

    .line 10
    .line 11
    new-instance p0, Lh0/u;

    .line 12
    .line 13
    invoke-direct {p0, p1, p2, v0, v1}, Lh0/u;-><init>(Lt2/j;IJ)V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public static p(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const v0, 0x7f06007d

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const v0, 0x7f060080

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const v0, 0x7f060081

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    const v0, 0x7f06007e

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static q([II)V
    .locals 2

    .line 1
    shr-int/lit8 v0, p1, 0x5

    .line 2
    .line 3
    and-int/lit8 p1, p1, 0x1f

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    shl-int p1, v1, p1

    .line 7
    .line 8
    aget v1, p0, v0

    .line 9
    .line 10
    not-int p1, p1

    .line 11
    and-int/2addr p1, v1

    .line 12
    aput p1, p0, v0

    .line 13
    .line 14
    return-void
.end method

.method public static final r(II)V
    .locals 3

    .line 1
    if-gt p0, p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const-string v0, ") is greater than size ("

    .line 5
    .line 6
    const-string v1, ")."

    .line 7
    .line 8
    const-string v2, "toIndex ("

    .line 9
    .line 10
    invoke-static {p0, p1, v2, v0, v1}, Leh/a;->k(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Lokio/a;->i(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static s(Ljava/lang/String;)Lhb/t;
    .locals 34

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    .line 7
    .line 8
    move-object/from16 v3, p0

    .line 9
    .line 10
    invoke-direct {v2, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v3, "retransmit"

    .line 14
    .line 15
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 16
    .line 17
    .line 18
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    const/4 v4, 0x1

    .line 20
    const-string v5, "imagePath"

    .line 21
    .line 22
    const-string v6, "content"

    .line 23
    .line 24
    const-string v7, "sourceTalker"

    .line 25
    .line 26
    const-string v8, "msgId"

    .line 27
    .line 28
    const/4 v9, 0x0

    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    :try_start_1
    new-instance v10, Lk8/t;

    .line 32
    .line 33
    invoke-virtual {v2, v8}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v11

    .line 37
    invoke-virtual {v3, v8, v11, v12}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 38
    .line 39
    .line 40
    move-result-wide v16

    .line 41
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v11

    .line 45
    invoke-virtual {v3, v7, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v13

    .line 49
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v11

    .line 56
    invoke-virtual {v3, v6, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v14

    .line 60
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    const-string v11, "retrType"

    .line 64
    .line 65
    const/4 v12, -0x1

    .line 66
    invoke-virtual {v3, v11, v12}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 67
    .line 68
    .line 69
    move-result v11

    .line 70
    const-string v12, "msgFromScene"

    .line 71
    .line 72
    const/4 v15, 0x2

    .line 73
    invoke-virtual {v3, v12, v15}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 74
    .line 75
    .line 76
    move-result v12

    .line 77
    const-string v15, "fileName"

    .line 78
    .line 79
    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v3, v15, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v15

    .line 87
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    const-string v1, "length"

    .line 91
    .line 92
    invoke-virtual {v3, v1, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 93
    .line 94
    .line 95
    move-result v18

    .line 96
    invoke-direct/range {v10 .. v18}, Lk8/t;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    .line 97
    .line 98
    .line 99
    if-ltz v11, :cond_0

    .line 100
    .line 101
    move v1, v4

    .line 102
    goto :goto_0

    .line 103
    :cond_0
    move v1, v9

    .line 104
    :goto_0
    if-eqz v1, :cond_1

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_1
    const/4 v10, 0x0

    .line 108
    :goto_1
    move-object/from16 v28, v10

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :catchall_0
    move-exception v0

    .line 112
    goto/16 :goto_7

    .line 113
    .line 114
    :cond_2
    const/16 v28, 0x0

    .line 115
    .line 116
    :goto_2
    invoke-virtual {v2, v8}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 117
    .line 118
    .line 119
    move-result-wide v20

    .line 120
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    move-result v22

    .line 124
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v23

    .line 128
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v24

    .line 135
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v25

    .line 142
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    const-string v1, "createTime"

    .line 146
    .line 147
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 148
    .line 149
    .line 150
    move-result-wide v26

    .line 151
    const-string v1, "voicePath"

    .line 152
    .line 153
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v29

    .line 157
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    const-string v1, "voiceDurationMillis"

    .line 161
    .line 162
    const/16 v3, 0x3e8

    .line 163
    .line 164
    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 165
    .line 166
    .line 167
    move-result v30

    .line 168
    const-string v1, "voiceFileName"

    .line 169
    .line 170
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-eqz v3, :cond_5

    .line 179
    .line 180
    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    const v2, 0xffff

    .line 189
    .line 190
    .line 191
    and-int/2addr v0, v2

    .line 192
    const/16 v2, 0x22

    .line 193
    .line 194
    if-ne v0, v2, :cond_3

    .line 195
    .line 196
    move v0, v4

    .line 197
    goto :goto_3

    .line 198
    :cond_3
    move v0, v9

    .line 199
    :goto_3
    if-eqz v0, :cond_4

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_4
    const/4 v1, 0x0

    .line 203
    :goto_4
    if-nez v1, :cond_5

    .line 204
    .line 205
    const-string v0, ""

    .line 206
    .line 207
    move-object v1, v0

    .line 208
    :cond_5
    move-object/from16 v31, v1

    .line 209
    .line 210
    new-instance v19, Lhb/t;

    .line 211
    .line 212
    const/16 v32, 0x0

    .line 213
    .line 214
    const/16 v33, 0x400

    .line 215
    .line 216
    invoke-direct/range {v19 .. v33}, Lhb/t;-><init>(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLk8/t;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;I)V

    .line 217
    .line 218
    .line 219
    move-object/from16 v0, v29

    .line 220
    .line 221
    const-wide/16 v1, 0x0

    .line 222
    .line 223
    cmp-long v1, v20, v1

    .line 224
    .line 225
    if-lez v1, :cond_6

    .line 226
    .line 227
    if-nez v28, :cond_7

    .line 228
    .line 229
    new-instance v1, Ljava/io/File;

    .line 230
    .line 231
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    .line 235
    .line 236
    .line 237
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 238
    if-eqz v0, :cond_6

    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_6
    move v4, v9

    .line 242
    :cond_7
    :goto_5
    if-eqz v4, :cond_8

    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_8
    const/16 v19, 0x0

    .line 246
    .line 247
    :goto_6
    move-object/from16 v1, v19

    .line 248
    .line 249
    goto :goto_8

    .line 250
    :goto_7
    new-instance v1, Lsf/f;

    .line 251
    .line 252
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 253
    .line 254
    .line 255
    :goto_8
    instance-of v0, v1, Lsf/f;

    .line 256
    .line 257
    if-eqz v0, :cond_9

    .line 258
    .line 259
    const/4 v1, 0x0

    .line 260
    :cond_9
    check-cast v1, Lhb/t;

    .line 261
    .line 262
    return-object v1
.end method

.method public static t(Ljava/util/List;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/json/JSONArray;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Ljava/util/HashSet;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v2, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    move-object v4, v3

    .line 34
    check-cast v4, Lq9/h;

    .line 35
    .line 36
    iget-object v4, v4, Lq9/h;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Lq9/h;

    .line 63
    .line 64
    new-instance v2, Lorg/json/JSONObject;

    .line 65
    .line 66
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 67
    .line 68
    .line 69
    iget-object v3, v1, Lq9/h;->a:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    const-string v4, "groupId"

    .line 80
    .line 81
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 82
    .line 83
    .line 84
    iget-object v3, v1, Lq9/h;->b:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    const-string v4, "label"

    .line 95
    .line 96
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 97
    .line 98
    .line 99
    iget-object v1, v1, Lq9/h;->c:Ljava/lang/String;

    .line 100
    .line 101
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    const-string v3, "templateId"

    .line 110
    .line 111
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_2
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    return-object p0
.end method

.method public static u(Ljava/util/Set;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    check-cast p0, Ljava/lang/Iterable;

    .line 7
    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v2, v1}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    move-object v3, v2

    .line 57
    check-cast v3, Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-lez v3, :cond_2

    .line 64
    .line 65
    const/4 v3, 0x1

    .line 66
    goto :goto_2

    .line 67
    :cond_2
    const/4 v3, 0x0

    .line 68
    :goto_2
    if-eqz v3, :cond_1

    .line 69
    .line 70
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    invoke-static {p0}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {p0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_4

    .line 91
    .line 92
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 99
    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    return-object p0
.end method

.method public static v(Ljava/util/List;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/json/JSONArray;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lq9/g;

    .line 24
    .line 25
    new-instance v2, Lorg/json/JSONObject;

    .line 26
    .line 27
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v3, "id"

    .line 31
    .line 32
    iget-object v4, v1, Lq9/g;->a:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    const-string v3, "name"

    .line 38
    .line 39
    iget-object v4, v1, Lq9/g;->b:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 42
    .line 43
    .line 44
    const-string v3, "enabled"

    .line 45
    .line 46
    iget-boolean v4, v1, Lq9/g;->c:Z

    .line 47
    .line 48
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 49
    .line 50
    .line 51
    iget v3, v1, Lq9/g;->d:I

    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    const/16 v5, 0x258

    .line 55
    .line 56
    invoke-static {v3, v4, v5}, Lr9/e0;->r(III)I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    const-string v4, "delaySeconds"

    .line 61
    .line 62
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 63
    .line 64
    .line 65
    iget-object v3, v1, Lq9/g;->e:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v3}, Lx6/d;->Q(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    const-string v4, "promptType"

    .line 72
    .line 73
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    .line 75
    .line 76
    iget-object v3, v1, Lq9/g;->f:Ljava/lang/String;

    .line 77
    .line 78
    const-string v4, "card_first"

    .line 79
    .line 80
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_0

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_0
    const-string v4, "text_first"

    .line 88
    .line 89
    :goto_1
    const-string v3, "bothOrder"

    .line 90
    .line 91
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 92
    .line 93
    .line 94
    const-string v3, "text"

    .line 95
    .line 96
    iget-object v4, v1, Lq9/g;->g:Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 99
    .line 100
    .line 101
    const-string v3, "cardTitle"

    .line 102
    .line 103
    iget-object v4, v1, Lq9/g;->h:Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 106
    .line 107
    .line 108
    const-string v3, "cardDesc"

    .line 109
    .line 110
    iget-object v1, v1, Lq9/g;->i:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_1
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    return-object p0
.end method

.method public static w(ILjava/lang/Object;)Ljava/lang/String;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const-string v1, "retcode"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {p1, v1, v2}, Lx6/d;->Z(Ljava/lang/Object;Ljava/lang/String;I)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const-string v2, "isSender"

    .line 13
    .line 14
    const/4 v3, -0x1

    .line 15
    invoke-static {p1, v2, v3}, Lx6/d;->Z(Ljava/lang/Object;Ljava/lang/String;I)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const-string v4, "receiveStatus"

    .line 20
    .line 21
    invoke-static {p1, v4, v3}, Lx6/d;->Z(Ljava/lang/Object;Ljava/lang/String;I)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez p0, :cond_6

    .line 26
    .line 27
    if-nez v1, :cond_6

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    if-ne v2, p0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const-string v1, "amount"

    .line 34
    .line 35
    invoke-static {p1, v1}, Lx6/d;->X(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Long;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    const-string v1, "receiveAmount"

    .line 42
    .line 43
    invoke-static {p1, v1}, Lx6/d;->X(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    :cond_2
    if-nez v1, :cond_3

    .line 48
    .line 49
    const-string v1, "recAmount"

    .line 50
    .line 51
    invoke-static {p1, v1}, Lx6/d;->X(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Long;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    :cond_3
    if-eqz v1, :cond_6

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 58
    .line 59
    .line 60
    move-result-wide v4

    .line 61
    const-wide/16 v6, 0x0

    .line 62
    .line 63
    cmp-long p1, v4, v6

    .line 64
    .line 65
    if-gtz p1, :cond_4

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    if-ltz v3, :cond_5

    .line 69
    .line 70
    if-eq v3, p0, :cond_5

    .line 71
    .line 72
    const/4 p0, 0x2

    .line 73
    if-eq v3, p0, :cond_5

    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 77
    .line 78
    .line 79
    move-result-wide p0

    .line 80
    long-to-double p0, p0

    .line 81
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    .line 82
    .line 83
    div-double/2addr p0, v0

    .line 84
    :try_start_0
    new-instance v0, Ljava/text/DecimalFormat;

    .line 85
    .line 86
    const-string v1, "0.00"

    .line 87
    .line 88
    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    sget-object v1, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/text/DecimalFormat;->setRoundingMode(Ljava/math/RoundingMode;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, p0, p1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    return-object p0

    .line 101
    :catchall_0
    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    :cond_6
    :goto_0
    return-object v0
.end method

.method public static x([II)I
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    and-int/lit8 v1, p1, 0x1f

    .line 3
    .line 4
    shr-int/lit8 p1, p1, 0x5

    .line 5
    .line 6
    :goto_0
    const/4 v2, -0x1

    .line 7
    if-ge p1, v0, :cond_2

    .line 8
    .line 9
    aget v3, p0, p1

    .line 10
    .line 11
    if-eqz v3, :cond_1

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    shl-int v1, v4, v1

    .line 15
    .line 16
    sub-int/2addr v1, v4

    .line 17
    not-int v1, v1

    .line 18
    and-int/2addr v1, v3

    .line 19
    invoke-static {v1}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/16 v3, 0x20

    .line 24
    .line 25
    if-ne v1, v3, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    move v2, v1

    .line 29
    :goto_1
    if-ltz v2, :cond_1

    .line 30
    .line 31
    shl-int/lit8 p0, p1, 0x5

    .line 32
    .line 33
    add-int/2addr p0, v2

    .line 34
    return p0

    .line 35
    :cond_1
    add-int/lit8 p1, p1, 0x1

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    goto :goto_0

    .line 39
    :cond_2
    return v2
.end method

.method public static y(Ljava/lang/Object;)Lhb/t;
    .locals 32

    .line 1
    move-object/from16 v13, p0

    .line 2
    .line 3
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v0, "field_msgId"

    .line 7
    .line 8
    const-string v1, "msgId"

    .line 9
    .line 10
    const-string v2, "getMsgId"

    .line 11
    .line 12
    invoke-static {v13, v2, v0, v1}, Lx6/d;->b0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-wide/16 v3, 0x0

    .line 21
    .line 22
    cmp-long v0, v0, v3

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    if-lez v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v2, v1

    .line 29
    :goto_0
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 32
    .line 33
    .line 34
    move-result-wide v5

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const-string v0, "msgID"

    .line 37
    .line 38
    const-string v2, "id"

    .line 39
    .line 40
    const-string v5, "getMsgID"

    .line 41
    .line 42
    invoke-static {v13, v5, v0, v2}, Lx6/d;->b0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J

    .line 43
    .line 44
    .line 45
    move-result-wide v5

    .line 46
    :goto_1
    cmp-long v0, v5, v3

    .line 47
    .line 48
    if-gtz v0, :cond_2

    .line 49
    .line 50
    goto/16 :goto_e

    .line 51
    .line 52
    :cond_2
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messageStore()Lk8/s;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    invoke-virtual {v0, v5, v6}, Lk8/s;->c(J)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 59
    .line 60
    .line 61
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    goto :goto_3

    .line 63
    :catchall_0
    move-exception v0

    .line 64
    goto :goto_2

    .line 65
    :cond_3
    move-object v0, v1

    .line 66
    goto :goto_3

    .line 67
    :goto_2
    new-instance v2, Lsf/f;

    .line 68
    .line 69
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    move-object v0, v2

    .line 73
    :goto_3
    nop

    .line 74
    instance-of v2, v0, Lsf/f;

    .line 75
    .line 76
    if-eqz v2, :cond_4

    .line 77
    .line 78
    move-object v0, v1

    .line 79
    :cond_4
    check-cast v0, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 80
    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    goto/16 :goto_8

    .line 84
    .line 85
    :cond_5
    const-string v0, "field_content"

    .line 86
    .line 87
    const-string v2, "content"

    .line 88
    .line 89
    const-string v3, "getContent"

    .line 90
    .line 91
    invoke-static {v13, v3, v0, v2}, Lx6/d;->d0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v25

    .line 95
    const-string v0, "field_type"

    .line 96
    .line 97
    const-string v2, "type"

    .line 98
    .line 99
    const-string v3, "getType"

    .line 100
    .line 101
    invoke-static {v13, v3, v0, v2}, Lx6/d;->Y(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    if-lez v0, :cond_6

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_6
    move-object v2, v1

    .line 113
    :goto_4
    if-eqz v2, :cond_7

    .line 114
    .line 115
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    :goto_5
    move/from16 v19, v0

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_7
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-static/range {v25 .. v25}, Ll8/d;->f(Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    goto :goto_5

    .line 132
    :goto_6
    if-gtz v19, :cond_8

    .line 133
    .line 134
    move-object v0, v1

    .line 135
    goto :goto_7

    .line 136
    :cond_8
    new-instance v14, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 137
    .line 138
    const-string v0, "field_msgSvrId"

    .line 139
    .line 140
    const-string v2, "msgSvrId"

    .line 141
    .line 142
    const-string v3, "getMsgSvrId"

    .line 143
    .line 144
    invoke-static {v13, v3, v0, v2}, Lx6/d;->b0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J

    .line 145
    .line 146
    .line 147
    move-result-wide v17

    .line 148
    const-string v0, "field_status"

    .line 149
    .line 150
    const-string v2, "status"

    .line 151
    .line 152
    const-string v3, "getStatus"

    .line 153
    .line 154
    invoke-static {v13, v3, v0, v2}, Lx6/d;->Y(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 155
    .line 156
    .line 157
    move-result v20

    .line 158
    const-string v0, "field_isSend"

    .line 159
    .line 160
    const-string v2, "isSend"

    .line 161
    .line 162
    const-string v3, "getIsSend"

    .line 163
    .line 164
    invoke-static {v13, v3, v0, v2}, Lx6/d;->Y(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 165
    .line 166
    .line 167
    move-result v21

    .line 168
    const-string v0, "field_createTime"

    .line 169
    .line 170
    const-string v2, "createTime"

    .line 171
    .line 172
    const-string v3, "getCreateTime"

    .line 173
    .line 174
    invoke-static {v13, v3, v0, v2}, Lx6/d;->b0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J

    .line 175
    .line 176
    .line 177
    move-result-wide v22

    .line 178
    const-string v0, "field_talker"

    .line 179
    .line 180
    const-string v2, "talker"

    .line 181
    .line 182
    const-string v3, "getTalker"

    .line 183
    .line 184
    invoke-static {v13, v3, v0, v2}, Lx6/d;->d0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v24

    .line 188
    const-string v0, "field_imgPath"

    .line 189
    .line 190
    const-string v2, "imgPath"

    .line 191
    .line 192
    const-string v3, "getImgPath"

    .line 193
    .line 194
    invoke-static {v13, v3, v0, v2}, Lx6/d;->d0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v26

    .line 198
    const-string v0, "field_msgSource"

    .line 199
    .line 200
    const-string v2, "msgSource"

    .line 201
    .line 202
    const-string v3, "getMsgSource"

    .line 203
    .line 204
    invoke-static {v13, v3, v0, v2}, Lx6/d;->d0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v30

    .line 208
    const-string v31, ""

    .line 209
    .line 210
    const-string v27, ""

    .line 211
    .line 212
    const-string v28, ""

    .line 213
    .line 214
    const/16 v29, 0x0

    .line 215
    .line 216
    move-wide v15, v5

    .line 217
    invoke-direct/range {v14 .. v31}, Lh/Hchat/hooks/api/model/WeChatMessage;-><init>(JJIIIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    move-object v0, v14

    .line 221
    :goto_7
    if-eqz v0, :cond_15

    .line 222
    .line 223
    :goto_8
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isSystem()Z

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    if-nez v2, :cond_15

    .line 228
    .line 229
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isRecalled()Z

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    if-nez v2, :cond_15

    .line 234
    .line 235
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVoip()Z

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    if-nez v2, :cond_15

    .line 240
    .line 241
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isRedPacket()Z

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    if-nez v2, :cond_15

    .line 246
    .line 247
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isTransfer()Z

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    if-eqz v2, :cond_9

    .line 252
    .line 253
    goto/16 :goto_e

    .line 254
    .line 255
    :cond_9
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVoice()Z

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    if-eqz v2, :cond_14

    .line 260
    .line 261
    iget-object v2, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->imagePath:Ljava/lang/String;

    .line 262
    .line 263
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    if-nez v3, :cond_a

    .line 268
    .line 269
    goto :goto_9

    .line 270
    :cond_a
    move-object v2, v1

    .line 271
    :goto_9
    if-eqz v2, :cond_b

    .line 272
    .line 273
    goto :goto_c

    .line 274
    :cond_b
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    const/4 v3, 0x2

    .line 279
    new-array v3, v3, [C

    .line 280
    .line 281
    fill-array-data v3, :array_0

    .line 282
    .line 283
    .line 284
    invoke-static {v2, v3}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    const/4 v4, 0x1

    .line 289
    new-array v5, v4, [C

    .line 290
    .line 291
    const/16 v6, 0x3a

    .line 292
    .line 293
    const/4 v7, 0x0

    .line 294
    aput-char v6, v5, v7

    .line 295
    .line 296
    const/4 v6, 0x6

    .line 297
    invoke-static {v3, v5, v6}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 302
    .line 303
    .line 304
    move-result v5

    .line 305
    const/4 v6, 0x3

    .line 306
    if-lt v5, v6, :cond_d

    .line 307
    .line 308
    const/16 v5, 0x3c

    .line 309
    .line 310
    invoke-static {v2, v5}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 311
    .line 312
    .line 313
    move-result v5

    .line 314
    if-nez v5, :cond_d

    .line 315
    .line 316
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 317
    .line 318
    .line 319
    move-result v2

    .line 320
    const/4 v5, 0x4

    .line 321
    if-ne v2, v5, :cond_c

    .line 322
    .line 323
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    :goto_a
    check-cast v2, Ljava/lang/String;

    .line 328
    .line 329
    goto :goto_b

    .line 330
    :cond_c
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    goto :goto_a

    .line 335
    :goto_b
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    goto :goto_c

    .line 344
    :cond_d
    sget-object v3, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 345
    .line 346
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    const-string v3, "filename"

    .line 350
    .line 351
    invoke-static {v2, v3}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 356
    .line 357
    .line 358
    move-result v5

    .line 359
    if-eqz v5, :cond_e

    .line 360
    .line 361
    const-string v4, "voiceurl"

    .line 362
    .line 363
    invoke-static {v2, v4}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    :cond_e
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 368
    .line 369
    .line 370
    move-result v5

    .line 371
    if-eqz v5, :cond_f

    .line 372
    .line 373
    invoke-static {v2, v3}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    goto :goto_c

    .line 378
    :cond_f
    move-object v2, v4

    .line 379
    :goto_c
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 380
    .line 381
    .line 382
    move-result v3

    .line 383
    if-eqz v3, :cond_10

    .line 384
    .line 385
    goto/16 :goto_e

    .line 386
    .line 387
    :cond_10
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 388
    .line 389
    .line 390
    move-result-object v3

    .line 391
    if-eqz v3, :cond_11

    .line 392
    .line 393
    iget-object v3, v3, Lj8/p;->b:Lj8/y;

    .line 394
    .line 395
    if-eqz v3, :cond_11

    .line 396
    .line 397
    invoke-virtual {v3, v2}, Lj8/y;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v3

    .line 401
    goto :goto_d

    .line 402
    :cond_11
    move-object v3, v1

    .line 403
    :goto_d
    if-nez v3, :cond_12

    .line 404
    .line 405
    const-string v3, ""

    .line 406
    .line 407
    :cond_12
    move-object v10, v3

    .line 408
    invoke-static {v10}, Leh/a;->y(Ljava/lang/String;)Z

    .line 409
    .line 410
    .line 411
    move-result v3

    .line 412
    if-nez v3, :cond_13

    .line 413
    .line 414
    goto/16 :goto_e

    .line 415
    .line 416
    :cond_13
    sget-object v1, Lj8/e;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 417
    .line 418
    iget-wide v3, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 419
    .line 420
    iget-object v1, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 421
    .line 422
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v5

    .line 426
    filled-new-array {v1, v5}, [Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    invoke-static {v1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 431
    .line 432
    .line 433
    move-result-object v5

    .line 434
    const/16 v6, 0x3e8

    .line 435
    .line 436
    move-object v1, v13

    .line 437
    invoke-static/range {v1 .. v6}, Lj8/e;->d(Ljava/lang/Object;Ljava/lang/String;JLjava/util/List;I)I

    .line 438
    .line 439
    .line 440
    move-result v11

    .line 441
    new-instance v1, Lhb/t;

    .line 442
    .line 443
    move-object v3, v1

    .line 444
    move-object v12, v2

    .line 445
    iget-wide v1, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 446
    .line 447
    move-object v4, v3

    .line 448
    iget v3, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 449
    .line 450
    move-object v5, v4

    .line 451
    iget-object v4, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 452
    .line 453
    move-object v6, v5

    .line 454
    iget-object v5, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 455
    .line 456
    move-object v7, v6

    .line 457
    iget-object v6, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->imagePath:Ljava/lang/String;

    .line 458
    .line 459
    move-object v9, v7

    .line 460
    iget-wide v7, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->createTime:J

    .line 461
    .line 462
    move-object v0, v9

    .line 463
    const/4 v9, 0x0

    .line 464
    move-object/from16 v13, p0

    .line 465
    .line 466
    invoke-direct/range {v0 .. v13}, Lhb/t;-><init>(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLk8/t;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    return-object v0

    .line 470
    :cond_14
    invoke-static {v0, v13}, Lfb/v0;->e(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/Object;)Lk8/t;

    .line 471
    .line 472
    .line 473
    move-result-object v9

    .line 474
    if-eqz v9, :cond_15

    .line 475
    .line 476
    new-instance v1, Lhb/t;

    .line 477
    .line 478
    move-object v3, v1

    .line 479
    iget-wide v1, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 480
    .line 481
    move-object v4, v3

    .line 482
    iget v3, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 483
    .line 484
    move-object v5, v4

    .line 485
    iget-object v4, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 486
    .line 487
    move-object v6, v5

    .line 488
    iget-object v5, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 489
    .line 490
    move-object v7, v6

    .line 491
    iget-object v6, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->imagePath:Ljava/lang/String;

    .line 492
    .line 493
    iget-wide v10, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->createTime:J

    .line 494
    .line 495
    const/4 v12, 0x0

    .line 496
    const/16 v14, 0x200

    .line 497
    .line 498
    move-object v0, v7

    .line 499
    move-wide v7, v10

    .line 500
    const-string v10, ""

    .line 501
    .line 502
    const/4 v11, 0x0

    .line 503
    invoke-direct/range {v0 .. v14}, Lhb/t;-><init>(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLk8/t;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;I)V

    .line 504
    .line 505
    .line 506
    return-object v0

    .line 507
    :cond_15
    :goto_e
    return-object v1

    .line 508
    nop

    .line 509
    :array_0
    .array-data 2
        0xas
        0xds
    .end array-data
.end method

.method public static z([II)Z
    .locals 2

    .line 1
    shr-int/lit8 v0, p1, 0x5

    .line 2
    .line 3
    and-int/lit8 p1, p1, 0x1f

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    shl-int p1, v1, p1

    .line 7
    .line 8
    aget p0, p0, v0

    .line 9
    .line 10
    and-int/2addr p0, p1

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method


# virtual methods
.method public abstract G(Lg6/b;)I
.end method

.method public abstract P(I)I
.end method

.method public abstract V(I)I
.end method

.method public b(I)I
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lx6/d;->P(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Lx6/d;->P(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ne v1, v0, :cond_1

    .line 14
    .line 15
    return v0

    .line 16
    :cond_1
    return p1
.end method

.method public c(I)I
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lx6/d;->V(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Lx6/d;->V(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ne v1, v0, :cond_1

    .line 14
    .line 15
    return v0

    .line 16
    :cond_1
    return p1
.end method

.method public g(I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lx6/d;->V(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public h(I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lx6/d;->P(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

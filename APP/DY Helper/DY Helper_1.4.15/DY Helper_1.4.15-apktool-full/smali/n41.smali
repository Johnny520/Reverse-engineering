.class public abstract Ln41;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/16 v0, 0x32

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x64

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/16 v2, 0x96

    .line 14
    .line 15
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/16 v3, 0xc8

    .line 20
    .line 21
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Ln41;->α:Ljava/util/Set;

    .line 34
    .line 35
    return-void
.end method

.method public static α(Landroid/view/View;IZ)Z
    .locals 5

    .line 1
    new-instance v0, Lsv0;

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lsv0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0}, Ln41;->β(Landroid/view/View;La80;)Landroid/widget/TextView;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 17
    .line 18
    .line 19
    const/4 v3, 0x2

    .line 20
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 21
    .line 22
    .line 23
    const-string v3, " \u6761"

    .line 24
    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    const-string p2, "\u7f13\u5b58\u6761\u6570\n\u5f85\u5e94\u7528 "

    .line 28
    .line 29
    :goto_0
    invoke-static {p2, p1, v3}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    const-string p2, "\u7f13\u5b58\u6761\u6570\n\u81ea\u5b9a\u4e49 "

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :goto_1
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    move p2, v1

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    move p2, v2

    .line 43
    :goto_2
    sget-object v0, Ln41;->α:Ljava/util/Set;

    .line 44
    .line 45
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_4

    .line 54
    .line 55
    new-instance v0, Lsv0;

    .line 56
    .line 57
    const/16 v3, 0x19

    .line 58
    .line 59
    invoke-direct {v0, v3}, Lsv0;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-static {p0, v0}, Ln41;->β(Landroid/view/View;La80;)Landroid/widget/TextView;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-eqz p0, :cond_4

    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    move v3, v2

    .line 77
    :goto_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-ge v3, v4, :cond_3

    .line 82
    .line 83
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    invoke-static {v4}, Ljx0;->Κ(C)Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-eqz v4, :cond_2

    .line 92
    .line 93
    const-string v0, " "

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_3
    const-string v0, ""

    .line 100
    .line 101
    :goto_4
    new-instance v3, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string p1, "\u6761"

    .line 113
    .line 114
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 122
    .line 123
    .line 124
    move p0, v1

    .line 125
    goto :goto_5

    .line 126
    :cond_4
    move p0, v2

    .line 127
    :goto_5
    if-nez p2, :cond_6

    .line 128
    .line 129
    if-eqz p0, :cond_5

    .line 130
    .line 131
    goto :goto_6

    .line 132
    :cond_5
    return v2

    .line 133
    :cond_6
    :goto_6
    return v1
.end method

.method public static β(Landroid/view/View;La80;)Landroid/widget/TextView;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    move v1, p0

    .line 11
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    if-nez v2, :cond_4

    .line 17
    .line 18
    const/16 v2, 0x100

    .line 19
    .line 20
    if-ge v1, v2, :cond_4

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Landroid/view/View;

    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    instance-of v4, v2, Landroid/widget/TextView;

    .line 31
    .line 32
    if-eqz v4, :cond_3

    .line 33
    .line 34
    move-object v4, v2

    .line 35
    check-cast v4, Landroid/widget/TextView;

    .line 36
    .line 37
    invoke-virtual {v4}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    if-eqz v5, :cond_1

    .line 42
    .line 43
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    :cond_1
    if-nez v3, :cond_2

    .line 48
    .line 49
    const-string v3, ""

    .line 50
    .line 51
    :cond_2
    invoke-interface {p1, v3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_3

    .line 62
    .line 63
    return-object v4

    .line 64
    :cond_3
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 65
    .line 66
    if-eqz v3, :cond_0

    .line 67
    .line 68
    check-cast v2, Landroid/view/ViewGroup;

    .line 69
    .line 70
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    move v4, p0

    .line 75
    :goto_0
    if-ge v4, v3, :cond_0

    .line 76
    .line 77
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v0, v5}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    add-int/lit8 v4, v4, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    return-object v3
.end method

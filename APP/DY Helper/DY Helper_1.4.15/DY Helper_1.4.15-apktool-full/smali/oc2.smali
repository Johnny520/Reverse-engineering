.class public final Loc2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final β:Loc2;


# instance fields
.field public final α:Llc2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Lkc2;->ξ:Loc2;

    .line 8
    .line 9
    sput-object v0, Loc2;->β:Loc2;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    sget-object v0, Lic2;->ν:Loc2;

    .line 13
    .line 14
    sput-object v0, Loc2;->β:Loc2;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsets;)V
    .locals 2

    .line 142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 143
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    .line 144
    new-instance v0, Lkc2;

    invoke-direct {v0, p0, p1}, Lkc2;-><init>(Loc2;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Loc2;->α:Llc2;

    return-void

    :cond_0
    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    .line 145
    new-instance v0, Ljc2;

    invoke-direct {v0, p0, p1}, Ljc2;-><init>(Loc2;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Loc2;->α:Llc2;

    return-void

    .line 146
    :cond_1
    new-instance v0, Lic2;

    invoke-direct {v0, p0, p1}, Lic2;-><init>(Loc2;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Loc2;->α:Llc2;

    return-void
.end method

.method public constructor <init>(Loc2;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_7

    .line 5
    .line 6
    iget-object p1, p1, Loc2;->α:Llc2;

    .line 7
    .line 8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v1, 0x22

    .line 11
    .line 12
    if-lt v0, v1, :cond_0

    .line 13
    .line 14
    instance-of v1, p1, Lkc2;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    new-instance v0, Lkc2;

    .line 19
    .line 20
    move-object v1, p1

    .line 21
    check-cast v1, Lkc2;

    .line 22
    .line 23
    invoke-direct {v0, p0, v1}, Lkc2;-><init>(Loc2;Lkc2;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Loc2;->α:Llc2;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/16 v1, 0x1f

    .line 30
    .line 31
    if-lt v0, v1, :cond_1

    .line 32
    .line 33
    instance-of v0, p1, Ljc2;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    new-instance v0, Ljc2;

    .line 38
    .line 39
    move-object v1, p1

    .line 40
    check-cast v1, Ljc2;

    .line 41
    .line 42
    invoke-direct {v0, p0, v1}, Ljc2;-><init>(Loc2;Ljc2;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Loc2;->α:Llc2;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    instance-of v0, p1, Lic2;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    new-instance v0, Lic2;

    .line 53
    .line 54
    move-object v1, p1

    .line 55
    check-cast v1, Lic2;

    .line 56
    .line 57
    invoke-direct {v0, p0, v1}, Lic2;-><init>(Loc2;Lic2;)V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Loc2;->α:Llc2;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    instance-of v0, p1, Lhc2;

    .line 64
    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    new-instance v0, Lhc2;

    .line 68
    .line 69
    move-object v1, p1

    .line 70
    check-cast v1, Lhc2;

    .line 71
    .line 72
    invoke-direct {v0, p0, v1}, Lhc2;-><init>(Loc2;Lhc2;)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, Loc2;->α:Llc2;

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    instance-of v0, p1, Lgc2;

    .line 79
    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    new-instance v0, Lgc2;

    .line 83
    .line 84
    move-object v1, p1

    .line 85
    check-cast v1, Lgc2;

    .line 86
    .line 87
    invoke-direct {v0, p0, v1}, Lgc2;-><init>(Loc2;Lgc2;)V

    .line 88
    .line 89
    .line 90
    iput-object v0, p0, Loc2;->α:Llc2;

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_4
    instance-of v0, p1, Lfc2;

    .line 94
    .line 95
    if-eqz v0, :cond_5

    .line 96
    .line 97
    new-instance v0, Lfc2;

    .line 98
    .line 99
    move-object v1, p1

    .line 100
    check-cast v1, Lfc2;

    .line 101
    .line 102
    invoke-direct {v0, p0, v1}, Lfc2;-><init>(Loc2;Lfc2;)V

    .line 103
    .line 104
    .line 105
    iput-object v0, p0, Loc2;->α:Llc2;

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_5
    instance-of v0, p1, Lec2;

    .line 109
    .line 110
    if-eqz v0, :cond_6

    .line 111
    .line 112
    new-instance v0, Lec2;

    .line 113
    .line 114
    move-object v1, p1

    .line 115
    check-cast v1, Lec2;

    .line 116
    .line 117
    invoke-direct {v0, p0, v1}, Lec2;-><init>(Loc2;Lec2;)V

    .line 118
    .line 119
    .line 120
    iput-object v0, p0, Loc2;->α:Llc2;

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_6
    new-instance v0, Llc2;

    .line 124
    .line 125
    invoke-direct {v0, p0}, Llc2;-><init>(Loc2;)V

    .line 126
    .line 127
    .line 128
    iput-object v0, p0, Loc2;->α:Llc2;

    .line 129
    .line 130
    :goto_0
    invoke-virtual {p1, p0}, Llc2;->ε(Loc2;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_7
    new-instance p1, Llc2;

    .line 135
    .line 136
    invoke-direct {p1, p0}, Llc2;-><init>(Loc2;)V

    .line 137
    .line 138
    .line 139
    iput-object p1, p0, Loc2;->α:Llc2;

    .line 140
    .line 141
    return-void
.end method

.method public static ε(Lnm0;IIII)Lnm0;
    .locals 5

    .line 1
    iget v0, p0, Lnm0;->α:I

    .line 2
    .line 3
    sub-int/2addr v0, p1

    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v2, p0, Lnm0;->β:I

    .line 10
    .line 11
    sub-int/2addr v2, p2

    .line 12
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    iget v3, p0, Lnm0;->γ:I

    .line 17
    .line 18
    sub-int/2addr v3, p3

    .line 19
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    iget v4, p0, Lnm0;->δ:I

    .line 24
    .line 25
    sub-int/2addr v4, p4

    .line 26
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-ne v0, p1, :cond_0

    .line 31
    .line 32
    if-ne v2, p2, :cond_0

    .line 33
    .line 34
    if-ne v3, p3, :cond_0

    .line 35
    .line 36
    if-ne v1, p4, :cond_0

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_0
    invoke-static {v0, v2, v3, v1}, Lnm0;->β(IIII)Lnm0;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public static θ(Landroid/view/View;Landroid/view/WindowInsets;)Loc2;
    .locals 2

    .line 1
    new-instance v0, Loc2;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p1}, Loc2;-><init>(Landroid/view/WindowInsets;)V

    .line 7
    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    sget-object p1, Lb92;->α:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-static {p0}, Lv82;->α(Landroid/view/View;)Loc2;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v1, v0, Loc2;->α:Llc2;

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Llc2;->υ(Loc2;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v1, p1}, Llc2;->δ(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    invoke-virtual {v1, p0}, Llc2;->φ(I)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Loc2;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    check-cast p1, Loc2;

    .line 12
    .line 13
    iget-object p0, p0, Loc2;->α:Llc2;

    .line 14
    .line 15
    iget-object p1, p1, Loc2;->α:Llc2;

    .line 16
    .line 17
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Loc2;->α:Llc2;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Llc2;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final α()I
    .locals 0

    .line 1
    iget-object p0, p0, Loc2;->α:Llc2;

    .line 2
    .line 3
    invoke-virtual {p0}, Llc2;->μ()Lnm0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget p0, p0, Lnm0;->δ:I

    .line 8
    .line 9
    return p0
.end method

.method public final β()I
    .locals 0

    .line 1
    iget-object p0, p0, Loc2;->α:Llc2;

    .line 2
    .line 3
    invoke-virtual {p0}, Llc2;->μ()Lnm0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget p0, p0, Lnm0;->α:I

    .line 8
    .line 9
    return p0
.end method

.method public final γ()I
    .locals 0

    .line 1
    iget-object p0, p0, Loc2;->α:Llc2;

    .line 2
    .line 3
    invoke-virtual {p0}, Llc2;->μ()Lnm0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget p0, p0, Lnm0;->γ:I

    .line 8
    .line 9
    return p0
.end method

.method public final δ()I
    .locals 0

    .line 1
    iget-object p0, p0, Loc2;->α:Llc2;

    .line 2
    .line 3
    invoke-virtual {p0}, Llc2;->μ()Lnm0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget p0, p0, Lnm0;->β:I

    .line 8
    .line 9
    return p0
.end method

.method public final ζ(IIII)Loc2;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lcc2;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcc2;-><init>(Loc2;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/16 v1, 0x1f

    .line 14
    .line 15
    if-lt v0, v1, :cond_1

    .line 16
    .line 17
    new-instance v0, Lbc2;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Lbc2;-><init>(Loc2;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    new-instance v0, Lac2;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Lac2;-><init>(Loc2;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-static {p1, p2, p3, p4}, Lnm0;->β(IIII)Lnm0;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {v0, p0}, Ldc2;->δ(Lnm0;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ldc2;->β()Loc2;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public final η()Landroid/view/WindowInsets;
    .locals 1

    .line 1
    iget-object p0, p0, Loc2;->α:Llc2;

    .line 2
    .line 3
    instance-of v0, p0, Lec2;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lec2;

    .line 8
    .line 9
    iget-object p0, p0, Lec2;->γ:Landroid/view/WindowInsets;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

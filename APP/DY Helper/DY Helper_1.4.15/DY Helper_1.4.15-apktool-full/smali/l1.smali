.class public final Ll1;
.super Landroidx/core/view/α;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;
.implements Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;
.implements Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;


# static fields
.field public static final Ρ:Lm11;


# instance fields
.field public Α:Z

.field public Β:Lg1;

.field public Γ:Ln11;

.field public final Δ:Lo11;

.field public final Ε:Ll11;

.field public final Ζ:Ll11;

.field public final Η:Ljava/lang/String;

.field public final Θ:Ljava/lang/String;

.field public final Ι:Lm6;

.field public final Κ:Ln11;

.field public Λ:Lcs1;

.field public Μ:Z

.field public final Ν:Ll11;

.field public final Ξ:Lν;

.field public final Ο:Ljava/util/ArrayList;

.field public final Π:Lj1;

.field public final θ:Landroidx/compose/ui/platform/AndroidComposeView;

.field public ι:I

.field public final κ:Lj1;

.field public final λ:Landroid/view/accessibility/AccessibilityManager;

.field public μ:J

.field public ν:Ljava/util/List;

.field public final ξ:Lf1;

.field public ο:I

.field public π:I

.field public final ρ:Ln11;

.field public final σ:Ln11;

.field public final τ:Lkz1;

.field public final υ:Lkz1;

.field public φ:I

.field public χ:Ljava/lang/Integer;

.field public final ψ:Ld7;

.field public final ω:Lwc;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sget v2, Lrm0;->α:I

    .line 9
    .line 10
    new-instance v2, Lm11;

    .line 11
    .line 12
    invoke-direct {v2, v0}, Lm11;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iget v3, v2, Lm11;->β:I

    .line 16
    .line 17
    if-ltz v3, :cond_2

    .line 18
    .line 19
    add-int/lit8 v4, v3, 0x20

    .line 20
    .line 21
    iget-object v5, v2, Lm11;->α:[I

    .line 22
    .line 23
    array-length v6, v5

    .line 24
    if-ge v6, v4, :cond_0

    .line 25
    .line 26
    array-length v6, v5

    .line 27
    mul-int/lit8 v6, v6, 0x3

    .line 28
    .line 29
    div-int/lit8 v6, v6, 0x2

    .line 30
    .line 31
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([II)[I

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    iput-object v5, v2, Lm11;->α:[I

    .line 40
    .line 41
    :cond_0
    iget-object v5, v2, Lm11;->α:[I

    .line 42
    .line 43
    iget v6, v2, Lm11;->β:I

    .line 44
    .line 45
    if-eq v3, v6, :cond_1

    .line 46
    .line 47
    invoke-static {v4, v3, v6, v5, v5}, Lg7;->Λ(III[I[I)V

    .line 48
    .line 49
    .line 50
    :cond_1
    const/4 v4, 0x0

    .line 51
    const/16 v6, 0xc

    .line 52
    .line 53
    invoke-static {v3, v4, v6, v1, v5}, Lg7;->Ο(III[I[I)V

    .line 54
    .line 55
    .line 56
    iget v1, v2, Lm11;->β:I

    .line 57
    .line 58
    add-int/2addr v1, v0

    .line 59
    iput v1, v2, Lm11;->β:I

    .line 60
    .line 61
    sput-object v2, Ll1;->Ρ:Lm11;

    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    const-string v0, ""

    .line 65
    .line 66
    invoke-static {v0}, Lγ;->η(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    nop

    .line 71
    :array_0
    .array-data 4
        0x7f090007
        0x7f090008
        0x7f090013
        0x7f09001e
        0x7f090021
        0x7f090022
        0x7f090023
        0x7f090024
        0x7f090025
        0x7f090026
        0x7f090009
        0x7f09000a
        0x7f09000b
        0x7f09000c
        0x7f09000d
        0x7f09000e
        0x7f09000f
        0x7f090010
        0x7f090011
        0x7f090012
        0x7f090014
        0x7f090015
        0x7f090016
        0x7f090017
        0x7f090018
        0x7f090019
        0x7f09001a
        0x7f09001b
        0x7f09001c
        0x7f09001d
        0x7f09001f
        0x7f090020
    .end array-data
.end method

.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Landroidx/core/view/α;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll1;->θ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 5
    .line 6
    const/high16 v0, -0x80000000

    .line 7
    .line 8
    iput v0, p0, Ll1;->ι:I

    .line 9
    .line 10
    new-instance v1, Lj1;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, p0, v2}, Lj1;-><init>(Ll1;I)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Ll1;->κ:Lj1;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v3, "accessibility"

    .line 23
    .line 24
    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    .line 32
    .line 33
    iput-object v1, p0, Ll1;->λ:Landroid/view/accessibility/AccessibilityManager;

    .line 34
    .line 35
    const-wide/16 v3, 0x64

    .line 36
    .line 37
    iput-wide v3, p0, Ll1;->μ:J

    .line 38
    .line 39
    new-instance v1, Landroid/os/Handler;

    .line 40
    .line 41
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 46
    .line 47
    .line 48
    new-instance v1, Lf1;

    .line 49
    .line 50
    invoke-direct {v1, p0}, Lf1;-><init>(Ll1;)V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Ll1;->ξ:Lf1;

    .line 54
    .line 55
    iput v0, p0, Ll1;->ο:I

    .line 56
    .line 57
    iput v0, p0, Ll1;->π:I

    .line 58
    .line 59
    new-instance v0, Ln11;

    .line 60
    .line 61
    invoke-direct {v0}, Ln11;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, Ll1;->ρ:Ln11;

    .line 65
    .line 66
    new-instance v0, Ln11;

    .line 67
    .line 68
    invoke-direct {v0}, Ln11;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Ll1;->σ:Ln11;

    .line 72
    .line 73
    new-instance v0, Lkz1;

    .line 74
    .line 75
    invoke-direct {v0, v2}, Lkz1;-><init>(I)V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, Ll1;->τ:Lkz1;

    .line 79
    .line 80
    new-instance v0, Lkz1;

    .line 81
    .line 82
    invoke-direct {v0, v2}, Lkz1;-><init>(I)V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, Ll1;->υ:Lkz1;

    .line 86
    .line 87
    const/4 v0, -0x1

    .line 88
    iput v0, p0, Ll1;->φ:I

    .line 89
    .line 90
    new-instance v0, Ld7;

    .line 91
    .line 92
    invoke-direct {v0, v2}, Ld7;-><init>(I)V

    .line 93
    .line 94
    .line 95
    iput-object v0, p0, Ll1;->ψ:Ld7;

    .line 96
    .line 97
    const/4 v0, 0x6

    .line 98
    const/4 v1, 0x1

    .line 99
    const/4 v2, 0x0

    .line 100
    invoke-static {v1, v2, v0}, Lln0;->β(ILuc;I)Lwc;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iput-object v0, p0, Ll1;->ω:Lwc;

    .line 105
    .line 106
    iput-boolean v1, p0, Ll1;->Α:Z

    .line 107
    .line 108
    sget-object v0, Ltm0;->α:Ln11;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iput-object v0, p0, Ll1;->Γ:Ln11;

    .line 114
    .line 115
    new-instance v2, Lo11;

    .line 116
    .line 117
    invoke-direct {v2}, Lo11;-><init>()V

    .line 118
    .line 119
    .line 120
    iput-object v2, p0, Ll1;->Δ:Lo11;

    .line 121
    .line 122
    new-instance v2, Ll11;

    .line 123
    .line 124
    invoke-direct {v2}, Ll11;-><init>()V

    .line 125
    .line 126
    .line 127
    iput-object v2, p0, Ll1;->Ε:Ll11;

    .line 128
    .line 129
    new-instance v2, Ll11;

    .line 130
    .line 131
    invoke-direct {v2}, Ll11;-><init>()V

    .line 132
    .line 133
    .line 134
    iput-object v2, p0, Ll1;->Ζ:Ll11;

    .line 135
    .line 136
    const-string v2, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL"

    .line 137
    .line 138
    iput-object v2, p0, Ll1;->Η:Ljava/lang/String;

    .line 139
    .line 140
    const-string v2, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL"

    .line 141
    .line 142
    iput-object v2, p0, Ll1;->Θ:Ljava/lang/String;

    .line 143
    .line 144
    new-instance v2, Lm6;

    .line 145
    .line 146
    const/16 v3, 0xf

    .line 147
    .line 148
    invoke-direct {v2, v3}, Lm6;-><init>(I)V

    .line 149
    .line 150
    .line 151
    iput-object v2, p0, Ll1;->Ι:Lm6;

    .line 152
    .line 153
    new-instance v2, Ln11;

    .line 154
    .line 155
    invoke-direct {v2}, Ln11;-><init>()V

    .line 156
    .line 157
    .line 158
    iput-object v2, p0, Ll1;->Κ:Ln11;

    .line 159
    .line 160
    new-instance v2, Lcs1;

    .line 161
    .line 162
    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Les1;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-virtual {v3}, Les1;->α()Lbs1;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-direct {v2, v3, v0}, Lcs1;-><init>(Lbs1;Lsm0;)V

    .line 171
    .line 172
    .line 173
    iput-object v2, p0, Ll1;->Λ:Lcs1;

    .line 174
    .line 175
    sget v0, Lqm0;->α:I

    .line 176
    .line 177
    new-instance v0, Ll11;

    .line 178
    .line 179
    invoke-direct {v0}, Ll11;-><init>()V

    .line 180
    .line 181
    .line 182
    iput-object v0, p0, Ll1;->Ν:Ll11;

    .line 183
    .line 184
    invoke-virtual {p1, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 185
    .line 186
    .line 187
    new-instance p1, Lν;

    .line 188
    .line 189
    invoke-direct {p1, v1, p0}, Lν;-><init>(ILjava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    iput-object p1, p0, Ll1;->Ξ:Lν;

    .line 193
    .line 194
    new-instance p1, Ljava/util/ArrayList;

    .line 195
    .line 196
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 197
    .line 198
    .line 199
    iput-object p1, p0, Ll1;->Ο:Ljava/util/ArrayList;

    .line 200
    .line 201
    new-instance p1, Lj1;

    .line 202
    .line 203
    invoke-direct {p1, p0, v1}, Lj1;-><init>(Ll1;I)V

    .line 204
    .line 205
    .line 206
    iput-object p1, p0, Ll1;->Π:Lj1;

    .line 207
    .line 208
    return-void
.end method

.method public static synthetic Γ(Ll1;IILjava/lang/Integer;I)V
    .locals 1

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move-object p3, v0

    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3, v0}, Ll1;->Β(IILjava/lang/Integer;Ljava/util/List;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static Ι(Lu81;FF)Landroid/graphics/Rect;
    .locals 4

    .line 1
    instance-of v0, p0, Ls81;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p0, Lt81;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0

    .line 12
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lu81;->ε()Lml1;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance v0, Landroid/graphics/Rect;

    .line 17
    .line 18
    iget v1, p0, Lml1;->α:F

    .line 19
    .line 20
    add-float/2addr v1, p1

    .line 21
    float-to-int v1, v1

    .line 22
    iget v2, p0, Lml1;->β:F

    .line 23
    .line 24
    add-float/2addr v2, p2

    .line 25
    float-to-int v2, v2

    .line 26
    iget v3, p0, Lml1;->γ:F

    .line 27
    .line 28
    add-float/2addr v3, p1

    .line 29
    float-to-int p1, v3

    .line 30
    iget p0, p0, Lml1;->δ:F

    .line 31
    .line 32
    add-float/2addr p0, p2

    .line 33
    float-to-int p0, p0

    .line 34
    invoke-direct {v0, v1, v2, p1, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public static Λ(Lu81;)[F
    .locals 13

    .line 1
    instance-of v0, p0, Lt81;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lt81;

    .line 6
    .line 7
    iget-object p0, p0, Lt81;->α:Lwo1;

    .line 8
    .line 9
    iget-wide v0, p0, Lwo1;->θ:J

    .line 10
    .line 11
    iget-wide v2, p0, Lwo1;->η:J

    .line 12
    .line 13
    iget-wide v4, p0, Lwo1;->ζ:J

    .line 14
    .line 15
    iget-wide v6, p0, Lwo1;->ε:J

    .line 16
    .line 17
    const/16 p0, 0x20

    .line 18
    .line 19
    shr-long v8, v6, p0

    .line 20
    .line 21
    long-to-int v8, v8

    .line 22
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 23
    .line 24
    .line 25
    move-result v8

    .line 26
    const-wide v9, 0xffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    and-long/2addr v6, v9

    .line 32
    long-to-int v6, v6

    .line 33
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    shr-long v11, v4, p0

    .line 38
    .line 39
    long-to-int v7, v11

    .line 40
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    and-long/2addr v4, v9

    .line 45
    long-to-int v4, v4

    .line 46
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    shr-long v11, v2, p0

    .line 51
    .line 52
    long-to-int v5, v11

    .line 53
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    and-long/2addr v2, v9

    .line 58
    long-to-int v2, v2

    .line 59
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    shr-long v11, v0, p0

    .line 64
    .line 65
    long-to-int p0, v11

    .line 66
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    and-long/2addr v0, v9

    .line 71
    long-to-int v0, v0

    .line 72
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    const/16 v1, 0x8

    .line 77
    .line 78
    new-array v1, v1, [F

    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    aput v8, v1, v3

    .line 82
    .line 83
    const/4 v3, 0x1

    .line 84
    aput v6, v1, v3

    .line 85
    .line 86
    const/4 v3, 0x2

    .line 87
    aput v7, v1, v3

    .line 88
    .line 89
    const/4 v3, 0x3

    .line 90
    aput v4, v1, v3

    .line 91
    .line 92
    const/4 v3, 0x4

    .line 93
    aput v5, v1, v3

    .line 94
    .line 95
    const/4 v3, 0x5

    .line 96
    aput v2, v1, v3

    .line 97
    .line 98
    const/4 v2, 0x6

    .line 99
    aput p0, v1, v2

    .line 100
    .line 101
    const/4 p0, 0x7

    .line 102
    aput v0, v1, p0

    .line 103
    .line 104
    return-object v1

    .line 105
    :cond_0
    const/4 p0, 0x0

    .line 106
    return-object p0
.end method

.method public static Μ(Lu81;FF)Landroid/graphics/Region;
    .locals 7

    .line 1
    instance-of v0, p0, Lr81;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Region;

    .line 6
    .line 7
    check-cast p0, Lr81;

    .line 8
    .line 9
    invoke-virtual {p0}, Lr81;->ε()Lml1;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, p1, p2}, Lml1;->δ(FF)Lml1;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, Landroid/graphics/Rect;

    .line 18
    .line 19
    iget v3, v1, Lml1;->α:F

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    add-float/2addr v3, v4

    .line 23
    float-to-int v3, v3

    .line 24
    iget v5, v1, Lml1;->β:F

    .line 25
    .line 26
    add-float/2addr v5, v4

    .line 27
    float-to-int v5, v5

    .line 28
    iget v6, v1, Lml1;->γ:F

    .line 29
    .line 30
    add-float/2addr v6, v4

    .line 31
    float-to-int v6, v6

    .line 32
    iget v1, v1, Lml1;->δ:F

    .line 33
    .line 34
    add-float/2addr v1, v4

    .line 35
    float-to-int v1, v1

    .line 36
    invoke-direct {v2, v3, v5, v6, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, v2}, Landroid/graphics/Region;-><init>(Landroid/graphics/Rect;)V

    .line 40
    .line 41
    .line 42
    new-instance v1, Landroid/graphics/Region;

    .line 43
    .line 44
    invoke-direct {v1}, Landroid/graphics/Region;-><init>()V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, Lr81;->α:Lz91;

    .line 48
    .line 49
    instance-of v2, p0, Lx2;

    .line 50
    .line 51
    if-eqz v2, :cond_0

    .line 52
    .line 53
    check-cast p0, Lx2;

    .line 54
    .line 55
    iget-object p0, p0, Lx2;->α:Landroid/graphics/Path;

    .line 56
    .line 57
    invoke-virtual {p0, p1, p2}, Landroid/graphics/Path;->offset(FF)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, p0, v0}, Landroid/graphics/Region;->setPath(Landroid/graphics/Path;Landroid/graphics/Region;)Z

    .line 61
    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 65
    .line 66
    const-string p1, "Unable to obtain android.graphics.Path"

    .line 67
    .line 68
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p0

    .line 72
    :cond_1
    const/4 p0, 0x0

    .line 73
    return-object p0
.end method

.method public static Ν(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const v1, 0x186a0

    .line 13
    .line 14
    .line 15
    if-gt v0, v1, :cond_1

    .line 16
    .line 17
    :goto_0
    return-object p0

    .line 18
    :cond_1
    const v0, 0x1869f

    .line 19
    .line 20
    .line 21
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-static {v2}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    move v1, v0

    .line 42
    :cond_2
    const/4 v0, 0x0

    .line 43
    invoke-interface {p0, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    return-object p0
.end method

.method public static τ(Lbs1;)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    iget-object p0, p0, Lbs1;->δ:Lxr1;

    .line 6
    .line 7
    iget-object v1, p0, Lxr1;->ε:Lb21;

    .line 8
    .line 9
    sget-object v2, Lfs1;->α:Lis1;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0, v2}, Lxr1;->γ(Lis1;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/util/List;

    .line 22
    .line 23
    const-string v1, ","

    .line 24
    .line 25
    const/16 v2, 0x3e

    .line 26
    .line 27
    invoke-static {p0, v1, v0, v2}, Lhu0;->α(Ljava/util/List;Ljava/lang/String;Lsv0;I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_1
    sget-object p0, Lfs1;->Ζ:Lis1;

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    invoke-virtual {v1, p0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-nez p0, :cond_2

    .line 45
    .line 46
    move-object p0, v0

    .line 47
    :cond_2
    check-cast p0, Lg4;

    .line 48
    .line 49
    if-eqz p0, :cond_5

    .line 50
    .line 51
    iget-object p0, p0, Lg4;->ζ:Ljava/lang/String;

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_3
    sget-object p0, Lfs1;->Β:Lis1;

    .line 55
    .line 56
    invoke-virtual {v1, p0}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-nez p0, :cond_4

    .line 61
    .line 62
    move-object p0, v0

    .line 63
    :cond_4
    check-cast p0, Ljava/util/List;

    .line 64
    .line 65
    if-eqz p0, :cond_5

    .line 66
    .line 67
    invoke-static {p0}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, Lg4;

    .line 72
    .line 73
    if-eqz p0, :cond_5

    .line 74
    .line 75
    iget-object p0, p0, Lg4;->ζ:Ljava/lang/String;

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_5
    :goto_0
    return-object v0
.end method


# virtual methods
.method public final onAccessibilityStateChanged(Z)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Ll1;->ν:Ljava/util/List;

    .line 3
    .line 4
    return-void
.end method

.method public final onTouchExplorationStateChanged(Z)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Ll1;->ν:Ljava/util/List;

    .line 3
    .line 4
    return-void
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Ll1;->λ:Landroid/view/accessibility/AccessibilityManager;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Ll1;->ν:Ljava/util/List;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityManager;->addAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Ll1;->θ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Ll1;->Ξ:Lν;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Ll1;->λ:Landroid/view/accessibility/AccessibilityManager;

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityManager;->removeAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final Α(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ll1;->φ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v1, 0x800

    .line 14
    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const v1, 0x8000

    .line 22
    .line 23
    .line 24
    :cond_1
    :try_start_0
    iget-object p0, p0, Ll1;->κ:Lj1;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lj1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    return p0

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    throw p0
.end method

.method public final Β(IILjava/lang/Integer;Ljava/util/List;)Z
    .locals 1

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    if-eq p1, v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {p0}, Ll1;->φ()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0, p1, p2}, Ll1;->ξ(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p3, :cond_1

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 23
    .line 24
    .line 25
    :cond_1
    if-eqz p4, :cond_2

    .line 26
    .line 27
    const/4 p2, 0x0

    .line 28
    const/16 p3, 0x3e

    .line 29
    .line 30
    const-string v0, ","

    .line 31
    .line 32
    invoke-static {p4, v0, p2, p3}, Lhu0;->α(Ljava/util/List;Ljava/lang/String;Lsv0;I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    invoke-virtual {p0, p1}, Ll1;->Α(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0

    .line 44
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 45
    return p0
.end method

.method public final Δ(IILjava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Ll1;->ψ(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/16 v0, 0x20

    .line 6
    .line 7
    invoke-virtual {p0, p1, v0}, Ll1;->ξ(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 12
    .line 13
    .line 14
    if-eqz p3, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0, p1}, Ll1;->Α(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final Ε(I)V
    .locals 6

    .line 1
    iget-object v0, p0, Ll1;->Β:Lg1;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Lg1;->α:Lbs1;

    .line 6
    .line 7
    iget v2, v1, Lbs1;->ζ:I

    .line 8
    .line 9
    if-eq p1, v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    iget-wide v4, v0, Lg1;->ζ:J

    .line 17
    .line 18
    sub-long/2addr v2, v4

    .line 19
    const-wide/16 v4, 0x3e8

    .line 20
    .line 21
    cmp-long p1, v2, v4

    .line 22
    .line 23
    if-gtz p1, :cond_1

    .line 24
    .line 25
    iget p1, v1, Lbs1;->ζ:I

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Ll1;->ψ(I)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/high16 v2, 0x20000

    .line 32
    .line 33
    invoke-virtual {p0, p1, v2}, Ll1;->ξ(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget v2, v0, Lg1;->δ:I

    .line 38
    .line 39
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 40
    .line 41
    .line 42
    iget v2, v0, Lg1;->ε:I

    .line 43
    .line 44
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 45
    .line 46
    .line 47
    iget v2, v0, Lg1;->β:I

    .line 48
    .line 49
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityEvent;->setAction(I)V

    .line 50
    .line 51
    .line 52
    iget v0, v0, Lg1;->γ:I

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setMovementGranularity(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v1}, Ll1;->τ(Lbs1;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p1}, Ll1;->Α(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 69
    .line 70
    .line 71
    :cond_1
    const/4 p1, 0x0

    .line 72
    iput-object p1, p0, Ll1;->Β:Lg1;

    .line 73
    .line 74
    return-void
.end method

.method public final Ζ(Lsm0;)V
    .locals 56

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    const/16 v1, 0x40

    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v7

    .line 11
    new-instance v8, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v9, v0, Ll1;->Ο:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    .line 19
    .line 20
    .line 21
    iget-object v10, v6, Lsm0;->β:[I

    .line 22
    .line 23
    iget-object v11, v6, Lsm0;->α:[J

    .line 24
    .line 25
    array-length v1, v11

    .line 26
    const/4 v12, 0x2

    .line 27
    add-int/lit8 v13, v1, -0x2

    .line 28
    .line 29
    const/4 v14, 0x0

    .line 30
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-ltz v13, :cond_58

    .line 35
    .line 36
    move v15, v14

    .line 37
    :goto_0
    aget-wide v3, v11, v15

    .line 38
    .line 39
    move/from16 v16, v12

    .line 40
    .line 41
    move/from16 v17, v13

    .line 42
    .line 43
    not-long v12, v3

    .line 44
    const/16 v18, 0x7

    .line 45
    .line 46
    shl-long v12, v12, v18

    .line 47
    .line 48
    and-long/2addr v12, v3

    .line 49
    const-wide v19, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    and-long v12, v12, v19

    .line 55
    .line 56
    cmp-long v1, v12, v19

    .line 57
    .line 58
    if-eqz v1, :cond_57

    .line 59
    .line 60
    sub-int v1, v15, v17

    .line 61
    .line 62
    not-int v1, v1

    .line 63
    ushr-int/lit8 v1, v1, 0x1f

    .line 64
    .line 65
    const/16 v12, 0x8

    .line 66
    .line 67
    rsub-int/lit8 v13, v1, 0x8

    .line 68
    .line 69
    move-wide/from16 v21, v3

    .line 70
    .line 71
    move v1, v14

    .line 72
    :goto_1
    if-ge v1, v13, :cond_56

    .line 73
    .line 74
    const-wide/16 v23, 0xff

    .line 75
    .line 76
    and-long v3, v21, v23

    .line 77
    .line 78
    const-wide/16 v25, 0x80

    .line 79
    .line 80
    cmp-long v3, v3, v25

    .line 81
    .line 82
    if-gez v3, :cond_55

    .line 83
    .line 84
    shl-int/lit8 v3, v15, 0x3

    .line 85
    .line 86
    add-int/2addr v3, v1

    .line 87
    aget v3, v10, v3

    .line 88
    .line 89
    iget-object v4, v0, Ll1;->Κ:Ln11;

    .line 90
    .line 91
    invoke-virtual {v4, v3}, Lsm0;->β(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    check-cast v4, Lcs1;

    .line 96
    .line 97
    if-nez v4, :cond_0

    .line 98
    .line 99
    goto/16 :goto_2b

    .line 100
    .line 101
    :cond_0
    iget-object v4, v4, Lcs1;->α:Lxr1;

    .line 102
    .line 103
    iget-object v5, v4, Lxr1;->ε:Lb21;

    .line 104
    .line 105
    invoke-virtual {v6, v3}, Lsm0;->β(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v27

    .line 109
    move-object/from16 v14, v27

    .line 110
    .line 111
    check-cast v14, Lds1;

    .line 112
    .line 113
    move/from16 v27, v12

    .line 114
    .line 115
    if-eqz v14, :cond_1

    .line 116
    .line 117
    iget-object v14, v14, Lds1;->α:Lbs1;

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_1
    const/4 v14, 0x0

    .line 121
    :goto_2
    if-eqz v14, :cond_54

    .line 122
    .line 123
    iget-object v12, v14, Lbs1;->γ:Lyp0;

    .line 124
    .line 125
    iget-object v6, v14, Lbs1;->δ:Lxr1;

    .line 126
    .line 127
    move-object/from16 v29, v10

    .line 128
    .line 129
    iget v10, v14, Lbs1;->ζ:I

    .line 130
    .line 131
    move-object/from16 v30, v11

    .line 132
    .line 133
    iget-object v11, v6, Lxr1;->ε:Lb21;

    .line 134
    .line 135
    move/from16 v31, v15

    .line 136
    .line 137
    iget-object v15, v11, Lb21;->β:[Ljava/lang/Object;

    .line 138
    .line 139
    move-object/from16 v32, v15

    .line 140
    .line 141
    iget-object v15, v11, Lb21;->γ:[Ljava/lang/Object;

    .line 142
    .line 143
    move-object/from16 v33, v15

    .line 144
    .line 145
    iget-object v15, v11, Lb21;->α:[J

    .line 146
    .line 147
    move/from16 v34, v1

    .line 148
    .line 149
    array-length v1, v15

    .line 150
    add-int/lit8 v1, v1, -0x2

    .line 151
    .line 152
    move-object/from16 v35, v15

    .line 153
    .line 154
    if-ltz v1, :cond_4e

    .line 155
    .line 156
    move-object/from16 v40, v12

    .line 157
    .line 158
    move/from16 v39, v13

    .line 159
    .line 160
    const/4 v15, 0x0

    .line 161
    const/16 v38, 0x0

    .line 162
    .line 163
    :goto_3
    aget-wide v12, v35, v15

    .line 164
    .line 165
    move-object/from16 v41, v14

    .line 166
    .line 167
    move/from16 v42, v15

    .line 168
    .line 169
    not-long v14, v12

    .line 170
    shl-long v14, v14, v18

    .line 171
    .line 172
    and-long/2addr v14, v12

    .line 173
    and-long v14, v14, v19

    .line 174
    .line 175
    cmp-long v14, v14, v19

    .line 176
    .line 177
    if-eqz v14, :cond_4d

    .line 178
    .line 179
    sub-int v15, v42, v1

    .line 180
    .line 181
    not-int v14, v15

    .line 182
    ushr-int/lit8 v14, v14, 0x1f

    .line 183
    .line 184
    rsub-int/lit8 v14, v14, 0x8

    .line 185
    .line 186
    const/4 v15, 0x0

    .line 187
    :goto_4
    if-ge v15, v14, :cond_4c

    .line 188
    .line 189
    and-long v43, v12, v23

    .line 190
    .line 191
    cmp-long v43, v43, v25

    .line 192
    .line 193
    if-gez v43, :cond_4b

    .line 194
    .line 195
    shl-int/lit8 v43, v42, 0x3

    .line 196
    .line 197
    add-int v43, v43, v15

    .line 198
    .line 199
    aget-object v44, v32, v43

    .line 200
    .line 201
    move/from16 v45, v1

    .line 202
    .line 203
    aget-object v1, v33, v43

    .line 204
    .line 205
    move-object/from16 v43, v4

    .line 206
    .line 207
    move-object/from16 v4, v44

    .line 208
    .line 209
    check-cast v4, Lis1;

    .line 210
    .line 211
    move-wide/from16 v46, v12

    .line 212
    .line 213
    sget-object v12, Lfs1;->φ:Lis1;

    .line 214
    .line 215
    invoke-static {v4, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v13

    .line 219
    if-nez v13, :cond_3

    .line 220
    .line 221
    sget-object v13, Lfs1;->χ:Lis1;

    .line 222
    .line 223
    invoke-static {v4, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v13

    .line 227
    if-eqz v13, :cond_2

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_2
    move/from16 v44, v15

    .line 231
    .line 232
    const/4 v15, 0x0

    .line 233
    goto :goto_9

    .line 234
    :cond_3
    :goto_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 235
    .line 236
    .line 237
    move-result v13

    .line 238
    move/from16 v44, v15

    .line 239
    .line 240
    const/4 v15, 0x0

    .line 241
    :goto_6
    if-ge v15, v13, :cond_5

    .line 242
    .line 243
    invoke-virtual {v8, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v48

    .line 247
    move/from16 v49, v13

    .line 248
    .line 249
    move-object/from16 v13, v48

    .line 250
    .line 251
    check-cast v13, Lbr1;

    .line 252
    .line 253
    iget v13, v13, Lbr1;->ε:I

    .line 254
    .line 255
    if-ne v13, v3, :cond_4

    .line 256
    .line 257
    invoke-virtual {v8, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v13

    .line 261
    check-cast v13, Lbr1;

    .line 262
    .line 263
    goto :goto_7

    .line 264
    :cond_4
    add-int/lit8 v15, v15, 0x1

    .line 265
    .line 266
    move/from16 v13, v49

    .line 267
    .line 268
    goto :goto_6

    .line 269
    :cond_5
    const/4 v13, 0x0

    .line 270
    :goto_7
    if-eqz v13, :cond_6

    .line 271
    .line 272
    const/4 v15, 0x0

    .line 273
    goto :goto_8

    .line 274
    :cond_6
    new-instance v13, Lbr1;

    .line 275
    .line 276
    invoke-direct {v13, v3, v9}, Lbr1;-><init>(ILjava/util/ArrayList;)V

    .line 277
    .line 278
    .line 279
    const/4 v15, 0x1

    .line 280
    :goto_8
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    :goto_9
    if-nez v15, :cond_9

    .line 284
    .line 285
    invoke-virtual {v5, v4}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v13

    .line 289
    if-nez v13, :cond_7

    .line 290
    .line 291
    const/4 v13, 0x0

    .line 292
    :cond_7
    invoke-static {v1, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v13

    .line 296
    if-eqz v13, :cond_9

    .line 297
    .line 298
    :cond_8
    :goto_a
    move v13, v3

    .line 299
    move-object/from16 v53, v7

    .line 300
    .line 301
    move-object/from16 v48, v8

    .line 302
    .line 303
    move/from16 v28, v14

    .line 304
    .line 305
    move-object/from16 v15, v40

    .line 306
    .line 307
    move/from16 v7, v45

    .line 308
    .line 309
    const/4 v3, 0x0

    .line 310
    const/16 v37, 0x1

    .line 311
    .line 312
    move-object v8, v2

    .line 313
    move-object v14, v5

    .line 314
    goto/16 :goto_25

    .line 315
    .line 316
    :cond_9
    sget-object v13, Lfs1;->δ:Lis1;

    .line 317
    .line 318
    invoke-static {v4, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v15

    .line 322
    if-eqz v15, :cond_a

    .line 323
    .line 324
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    check-cast v1, Ljava/lang/String;

    .line 328
    .line 329
    invoke-virtual {v5, v13}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v4

    .line 333
    move/from16 v13, v27

    .line 334
    .line 335
    if-eqz v4, :cond_8

    .line 336
    .line 337
    invoke-virtual {v0, v3, v13, v1}, Ll1;->Δ(IILjava/lang/String;)V

    .line 338
    .line 339
    .line 340
    goto :goto_a

    .line 341
    :cond_a
    move/from16 v13, v27

    .line 342
    .line 343
    sget-object v15, Lfs1;->β:Lis1;

    .line 344
    .line 345
    invoke-static {v4, v15}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v15

    .line 349
    if-eqz v15, :cond_b

    .line 350
    .line 351
    invoke-virtual {v0, v3}, Ll1;->ψ(I)I

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    const/16 v15, 0x800

    .line 356
    .line 357
    invoke-static {v0, v1, v15, v7, v13}, Ll1;->Γ(Ll1;IILjava/lang/Integer;I)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0, v3}, Ll1;->ψ(I)I

    .line 361
    .line 362
    .line 363
    move-result v1

    .line 364
    invoke-static {v0, v1, v15, v2, v13}, Ll1;->Γ(Ll1;IILjava/lang/Integer;I)V

    .line 365
    .line 366
    .line 367
    goto :goto_a

    .line 368
    :cond_b
    const/16 v15, 0x800

    .line 369
    .line 370
    sget-object v13, Lfs1;->Ι:Lis1;

    .line 371
    .line 372
    invoke-static {v4, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result v13

    .line 376
    if-eqz v13, :cond_c

    .line 377
    .line 378
    invoke-virtual {v0, v3}, Ll1;->ψ(I)I

    .line 379
    .line 380
    .line 381
    move-result v1

    .line 382
    const/16 v4, 0x2000

    .line 383
    .line 384
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 385
    .line 386
    .line 387
    move-result-object v4

    .line 388
    const/16 v13, 0x8

    .line 389
    .line 390
    invoke-static {v0, v1, v15, v4, v13}, Ll1;->Γ(Ll1;IILjava/lang/Integer;I)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v0, v3}, Ll1;->ψ(I)I

    .line 394
    .line 395
    .line 396
    move-result v1

    .line 397
    invoke-static {v0, v1, v15, v2, v13}, Ll1;->Γ(Ll1;IILjava/lang/Integer;I)V

    .line 398
    .line 399
    .line 400
    goto :goto_a

    .line 401
    :cond_c
    sget-object v13, Lfs1;->Λ:Lis1;

    .line 402
    .line 403
    invoke-static {v4, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v13

    .line 407
    if-eqz v13, :cond_d

    .line 408
    .line 409
    invoke-virtual {v0, v3}, Ll1;->ψ(I)I

    .line 410
    .line 411
    .line 412
    move-result v1

    .line 413
    const/16 v4, 0xc00

    .line 414
    .line 415
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 416
    .line 417
    .line 418
    move-result-object v4

    .line 419
    const/16 v13, 0x8

    .line 420
    .line 421
    invoke-static {v0, v1, v15, v4, v13}, Ll1;->Γ(Ll1;IILjava/lang/Integer;I)V

    .line 422
    .line 423
    .line 424
    goto :goto_a

    .line 425
    :cond_d
    sget-object v13, Lfs1;->γ:Lis1;

    .line 426
    .line 427
    invoke-static {v4, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result v13

    .line 431
    if-eqz v13, :cond_e

    .line 432
    .line 433
    invoke-virtual {v0, v3}, Ll1;->ψ(I)I

    .line 434
    .line 435
    .line 436
    move-result v1

    .line 437
    const/16 v13, 0x8

    .line 438
    .line 439
    invoke-static {v0, v1, v15, v7, v13}, Ll1;->Γ(Ll1;IILjava/lang/Integer;I)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v0, v3}, Ll1;->ψ(I)I

    .line 443
    .line 444
    .line 445
    move-result v1

    .line 446
    invoke-static {v0, v1, v15, v2, v13}, Ll1;->Γ(Ll1;IILjava/lang/Integer;I)V

    .line 447
    .line 448
    .line 449
    goto/16 :goto_a

    .line 450
    .line 451
    :cond_e
    sget-object v13, Lfs1;->Θ:Lis1;

    .line 452
    .line 453
    invoke-static {v4, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    move-result v15

    .line 457
    move-object/from16 v48, v8

    .line 458
    .line 459
    const/4 v8, 0x4

    .line 460
    if-eqz v15, :cond_1b

    .line 461
    .line 462
    sget-object v1, Lfs1;->ψ:Lis1;

    .line 463
    .line 464
    invoke-virtual {v11, v1}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    if-nez v1, :cond_f

    .line 469
    .line 470
    const/4 v1, 0x0

    .line 471
    :cond_f
    check-cast v1, Lso1;

    .line 472
    .line 473
    if-nez v1, :cond_11

    .line 474
    .line 475
    :cond_10
    const/4 v1, 0x0

    .line 476
    goto :goto_b

    .line 477
    :cond_11
    iget v1, v1, Lso1;->α:I

    .line 478
    .line 479
    if-ne v1, v8, :cond_10

    .line 480
    .line 481
    const/4 v1, 0x1

    .line 482
    :goto_b
    if-eqz v1, :cond_1a

    .line 483
    .line 484
    invoke-virtual {v11, v13}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    if-nez v1, :cond_12

    .line 489
    .line 490
    const/4 v1, 0x0

    .line 491
    :cond_12
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 492
    .line 493
    invoke-static {v1, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v1

    .line 497
    if-eqz v1, :cond_19

    .line 498
    .line 499
    invoke-virtual {v0, v3}, Ll1;->ψ(I)I

    .line 500
    .line 501
    .line 502
    move-result v1

    .line 503
    invoke-virtual {v0, v1, v8}, Ll1;->ξ(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    new-instance v4, Lbs1;

    .line 508
    .line 509
    move-object/from16 v13, v41

    .line 510
    .line 511
    iget-object v8, v13, Lbs1;->α:Lq01;

    .line 512
    .line 513
    move-object/from16 v15, v40

    .line 514
    .line 515
    const/4 v12, 0x1

    .line 516
    invoke-direct {v4, v8, v12, v15, v6}, Lbs1;-><init>(Lq01;ZLyp0;Lxr1;)V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v4}, Lbs1;->λ()Lxr1;

    .line 520
    .line 521
    .line 522
    move-result-object v8

    .line 523
    sget-object v12, Lfs1;->α:Lis1;

    .line 524
    .line 525
    iget-object v8, v8, Lxr1;->ε:Lb21;

    .line 526
    .line 527
    invoke-virtual {v8, v12}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v8

    .line 531
    if-nez v8, :cond_13

    .line 532
    .line 533
    const/4 v8, 0x0

    .line 534
    :cond_13
    check-cast v8, Ljava/util/List;

    .line 535
    .line 536
    const/16 v12, 0x3e

    .line 537
    .line 538
    move-object/from16 v40, v4

    .line 539
    .line 540
    const-string v4, ","

    .line 541
    .line 542
    move-object/from16 v41, v13

    .line 543
    .line 544
    const/4 v13, 0x0

    .line 545
    if-eqz v8, :cond_14

    .line 546
    .line 547
    invoke-static {v8, v4, v13, v12}, Lhu0;->α(Ljava/util/List;Ljava/lang/String;Lsv0;I)Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v8

    .line 551
    move-object v13, v8

    .line 552
    :cond_14
    invoke-virtual/range {v40 .. v40}, Lbs1;->λ()Lxr1;

    .line 553
    .line 554
    .line 555
    move-result-object v8

    .line 556
    sget-object v12, Lfs1;->Β:Lis1;

    .line 557
    .line 558
    iget-object v8, v8, Lxr1;->ε:Lb21;

    .line 559
    .line 560
    invoke-virtual {v8, v12}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v8

    .line 564
    if-nez v8, :cond_15

    .line 565
    .line 566
    const/4 v8, 0x0

    .line 567
    :cond_15
    check-cast v8, Ljava/util/List;

    .line 568
    .line 569
    move/from16 v28, v14

    .line 570
    .line 571
    const/4 v12, 0x0

    .line 572
    if-eqz v8, :cond_16

    .line 573
    .line 574
    const/16 v14, 0x3e

    .line 575
    .line 576
    invoke-static {v8, v4, v12, v14}, Lhu0;->α(Ljava/util/List;Ljava/lang/String;Lsv0;I)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v4

    .line 580
    goto :goto_c

    .line 581
    :cond_16
    move-object v4, v12

    .line 582
    :goto_c
    if-eqz v13, :cond_17

    .line 583
    .line 584
    invoke-virtual {v1, v13}, Landroid/view/accessibility/AccessibilityRecord;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 585
    .line 586
    .line 587
    :cond_17
    if-eqz v4, :cond_18

    .line 588
    .line 589
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 590
    .line 591
    .line 592
    move-result-object v8

    .line 593
    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    :cond_18
    invoke-virtual {v0, v1}, Ll1;->Α(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 597
    .line 598
    .line 599
    const/16 v13, 0x800

    .line 600
    .line 601
    goto :goto_d

    .line 602
    :cond_19
    move/from16 v28, v14

    .line 603
    .line 604
    move-object/from16 v15, v40

    .line 605
    .line 606
    const/4 v12, 0x0

    .line 607
    invoke-virtual {v0, v3}, Ll1;->ψ(I)I

    .line 608
    .line 609
    .line 610
    move-result v1

    .line 611
    const/16 v4, 0x8

    .line 612
    .line 613
    const/16 v13, 0x800

    .line 614
    .line 615
    invoke-static {v0, v1, v13, v2, v4}, Ll1;->Γ(Ll1;IILjava/lang/Integer;I)V

    .line 616
    .line 617
    .line 618
    goto :goto_d

    .line 619
    :cond_1a
    move/from16 v28, v14

    .line 620
    .line 621
    move-object/from16 v15, v40

    .line 622
    .line 623
    const/16 v4, 0x8

    .line 624
    .line 625
    const/4 v12, 0x0

    .line 626
    const/16 v13, 0x800

    .line 627
    .line 628
    invoke-virtual {v0, v3}, Ll1;->ψ(I)I

    .line 629
    .line 630
    .line 631
    move-result v1

    .line 632
    invoke-static {v0, v1, v13, v7, v4}, Ll1;->Γ(Ll1;IILjava/lang/Integer;I)V

    .line 633
    .line 634
    .line 635
    invoke-virtual {v0, v3}, Ll1;->ψ(I)I

    .line 636
    .line 637
    .line 638
    move-result v1

    .line 639
    invoke-static {v0, v1, v13, v2, v4}, Ll1;->Γ(Ll1;IILjava/lang/Integer;I)V

    .line 640
    .line 641
    .line 642
    :goto_d
    move-object v8, v2

    .line 643
    move v13, v3

    .line 644
    move-object v14, v5

    .line 645
    move-object/from16 v53, v7

    .line 646
    .line 647
    :goto_e
    move/from16 v7, v45

    .line 648
    .line 649
    :goto_f
    const/4 v3, 0x0

    .line 650
    const/16 v37, 0x1

    .line 651
    .line 652
    goto/16 :goto_25

    .line 653
    .line 654
    :cond_1b
    move/from16 v36, v8

    .line 655
    .line 656
    move/from16 v28, v14

    .line 657
    .line 658
    move-object/from16 v15, v40

    .line 659
    .line 660
    const/16 v13, 0x800

    .line 661
    .line 662
    const/4 v14, 0x0

    .line 663
    sget-object v8, Lfs1;->α:Lis1;

    .line 664
    .line 665
    invoke-static {v4, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 666
    .line 667
    .line 668
    move-result v8

    .line 669
    if-eqz v8, :cond_1c

    .line 670
    .line 671
    invoke-virtual {v0, v3}, Ll1;->ψ(I)I

    .line 672
    .line 673
    .line 674
    move-result v4

    .line 675
    invoke-static/range {v36 .. v36}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 676
    .line 677
    .line 678
    move-result-object v8

    .line 679
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 680
    .line 681
    .line 682
    check-cast v1, Ljava/util/List;

    .line 683
    .line 684
    invoke-virtual {v0, v4, v13, v8, v1}, Ll1;->Β(IILjava/lang/Integer;Ljava/util/List;)Z

    .line 685
    .line 686
    .line 687
    goto :goto_d

    .line 688
    :cond_1c
    sget-object v8, Lfs1;->Ζ:Lis1;

    .line 689
    .line 690
    invoke-static {v4, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 691
    .line 692
    .line 693
    move-result v13

    .line 694
    const-wide v49, 0xffffffffL

    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    const/16 v40, 0x20

    .line 700
    .line 701
    const-string v51, ""

    .line 702
    .line 703
    if-eqz v13, :cond_2d

    .line 704
    .line 705
    sget-object v1, Lwr1;->κ:Lis1;

    .line 706
    .line 707
    invoke-virtual {v11, v1}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 708
    .line 709
    .line 710
    move-result v1

    .line 711
    if-eqz v1, :cond_2c

    .line 712
    .line 713
    invoke-virtual {v5, v8}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v13

    .line 717
    if-nez v13, :cond_1d

    .line 718
    .line 719
    move-object v13, v14

    .line 720
    :cond_1d
    check-cast v13, Lg4;

    .line 721
    .line 722
    if-eqz v13, :cond_1e

    .line 723
    .line 724
    goto :goto_10

    .line 725
    :cond_1e
    move-object/from16 v13, v51

    .line 726
    .line 727
    :goto_10
    invoke-virtual {v11, v8}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v1

    .line 731
    if-nez v1, :cond_1f

    .line 732
    .line 733
    move-object v1, v14

    .line 734
    :cond_1f
    check-cast v1, Lg4;

    .line 735
    .line 736
    if-eqz v1, :cond_20

    .line 737
    .line 738
    goto :goto_11

    .line 739
    :cond_20
    move-object/from16 v1, v51

    .line 740
    .line 741
    :goto_11
    invoke-static {v1}, Ll1;->Ν(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 742
    .line 743
    .line 744
    move-result-object v4

    .line 745
    invoke-interface {v13}, Ljava/lang/CharSequence;->length()I

    .line 746
    .line 747
    .line 748
    move-result v8

    .line 749
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 750
    .line 751
    .line 752
    move-result v12

    .line 753
    if-le v8, v12, :cond_21

    .line 754
    .line 755
    move v14, v12

    .line 756
    goto :goto_12

    .line 757
    :cond_21
    move v14, v8

    .line 758
    :goto_12
    move-object/from16 v52, v2

    .line 759
    .line 760
    const/4 v2, 0x0

    .line 761
    :goto_13
    move-object/from16 v53, v7

    .line 762
    .line 763
    if-ge v2, v14, :cond_23

    .line 764
    .line 765
    invoke-interface {v13, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 766
    .line 767
    .line 768
    move-result v7

    .line 769
    move/from16 v51, v8

    .line 770
    .line 771
    invoke-interface {v1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 772
    .line 773
    .line 774
    move-result v8

    .line 775
    if-eq v7, v8, :cond_22

    .line 776
    .line 777
    goto :goto_14

    .line 778
    :cond_22
    add-int/lit8 v2, v2, 0x1

    .line 779
    .line 780
    move/from16 v8, v51

    .line 781
    .line 782
    move-object/from16 v7, v53

    .line 783
    .line 784
    goto :goto_13

    .line 785
    :cond_23
    move/from16 v51, v8

    .line 786
    .line 787
    :goto_14
    const/4 v7, 0x0

    .line 788
    :goto_15
    sub-int v8, v14, v2

    .line 789
    .line 790
    if-ge v7, v8, :cond_25

    .line 791
    .line 792
    add-int/lit8 v8, v51, -0x1

    .line 793
    .line 794
    sub-int/2addr v8, v7

    .line 795
    invoke-interface {v13, v8}, Ljava/lang/CharSequence;->charAt(I)C

    .line 796
    .line 797
    .line 798
    move-result v8

    .line 799
    add-int/lit8 v54, v12, -0x1

    .line 800
    .line 801
    move/from16 v55, v7

    .line 802
    .line 803
    sub-int v7, v54, v55

    .line 804
    .line 805
    invoke-interface {v1, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 806
    .line 807
    .line 808
    move-result v7

    .line 809
    if-eq v8, v7, :cond_24

    .line 810
    .line 811
    goto :goto_16

    .line 812
    :cond_24
    add-int/lit8 v7, v55, 0x1

    .line 813
    .line 814
    goto :goto_15

    .line 815
    :cond_25
    move/from16 v55, v7

    .line 816
    .line 817
    :goto_16
    sub-int v8, v51, v55

    .line 818
    .line 819
    sub-int/2addr v8, v2

    .line 820
    sub-int v1, v12, v55

    .line 821
    .line 822
    sub-int/2addr v1, v2

    .line 823
    sget-object v7, Lfs1;->Κ:Lis1;

    .line 824
    .line 825
    invoke-virtual {v5, v7}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 826
    .line 827
    .line 828
    move-result v14

    .line 829
    invoke-virtual {v11, v7}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 830
    .line 831
    .line 832
    move-result v7

    .line 833
    move/from16 v51, v7

    .line 834
    .line 835
    sget-object v7, Lfs1;->Ζ:Lis1;

    .line 836
    .line 837
    invoke-virtual {v5, v7}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 838
    .line 839
    .line 840
    move-result v7

    .line 841
    if-eqz v7, :cond_26

    .line 842
    .line 843
    if-nez v14, :cond_26

    .line 844
    .line 845
    if-eqz v51, :cond_26

    .line 846
    .line 847
    const/16 v54, 0x1

    .line 848
    .line 849
    goto :goto_17

    .line 850
    :cond_26
    const/16 v54, 0x0

    .line 851
    .line 852
    :goto_17
    if-eqz v7, :cond_27

    .line 853
    .line 854
    if-eqz v14, :cond_27

    .line 855
    .line 856
    if-nez v51, :cond_27

    .line 857
    .line 858
    const/4 v7, 0x1

    .line 859
    goto :goto_18

    .line 860
    :cond_27
    const/4 v7, 0x0

    .line 861
    :goto_18
    if-nez v54, :cond_29

    .line 862
    .line 863
    if-eqz v7, :cond_28

    .line 864
    .line 865
    goto :goto_19

    .line 866
    :cond_28
    invoke-virtual {v0, v3}, Ll1;->ψ(I)I

    .line 867
    .line 868
    .line 869
    move-result v12

    .line 870
    const/16 v14, 0x10

    .line 871
    .line 872
    invoke-virtual {v0, v12, v14}, Ll1;->ξ(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 873
    .line 874
    .line 875
    move-result-object v12

    .line 876
    invoke-virtual {v12, v2}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 877
    .line 878
    .line 879
    invoke-virtual {v12, v8}, Landroid/view/accessibility/AccessibilityRecord;->setRemovedCount(I)V

    .line 880
    .line 881
    .line 882
    invoke-virtual {v12, v1}, Landroid/view/accessibility/AccessibilityRecord;->setAddedCount(I)V

    .line 883
    .line 884
    .line 885
    invoke-virtual {v12, v13}, Landroid/view/accessibility/AccessibilityRecord;->setBeforeText(Ljava/lang/CharSequence;)V

    .line 886
    .line 887
    .line 888
    invoke-virtual {v12}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 889
    .line 890
    .line 891
    move-result-object v1

    .line 892
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 893
    .line 894
    .line 895
    move v13, v3

    .line 896
    move-object v14, v5

    .line 897
    move-object/from16 v2, v52

    .line 898
    .line 899
    goto :goto_1a

    .line 900
    :cond_29
    :goto_19
    invoke-virtual {v0, v3}, Ll1;->ψ(I)I

    .line 901
    .line 902
    .line 903
    move-result v1

    .line 904
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 905
    .line 906
    .line 907
    move-result-object v2

    .line 908
    move v8, v3

    .line 909
    move-object/from16 v3, v52

    .line 910
    .line 911
    move-object v14, v5

    .line 912
    move v13, v8

    .line 913
    move-object v5, v4

    .line 914
    move-object v4, v2

    .line 915
    move-object/from16 v2, v52

    .line 916
    .line 917
    invoke-virtual/range {v0 .. v5}, Ll1;->ο(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    .line 918
    .line 919
    .line 920
    move-result-object v12

    .line 921
    :goto_1a
    const-string v1, "android.widget.EditText"

    .line 922
    .line 923
    invoke-virtual {v12, v1}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 924
    .line 925
    .line 926
    invoke-virtual {v0, v12}, Ll1;->Α(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 927
    .line 928
    .line 929
    if-nez v54, :cond_2a

    .line 930
    .line 931
    if-eqz v7, :cond_2b

    .line 932
    .line 933
    :cond_2a
    sget-object v1, Lfs1;->Η:Lis1;

    .line 934
    .line 935
    invoke-virtual {v6, v1}, Lxr1;->γ(Lis1;)Ljava/lang/Object;

    .line 936
    .line 937
    .line 938
    move-result-object v1

    .line 939
    check-cast v1, Lr32;

    .line 940
    .line 941
    iget-wide v3, v1, Lr32;->α:J

    .line 942
    .line 943
    shr-long v7, v3, v40

    .line 944
    .line 945
    long-to-int v1, v7

    .line 946
    invoke-virtual {v12, v1}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 947
    .line 948
    .line 949
    and-long v3, v3, v49

    .line 950
    .line 951
    long-to-int v1, v3

    .line 952
    invoke-virtual {v12, v1}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 953
    .line 954
    .line 955
    invoke-virtual {v0, v12}, Ll1;->Α(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 956
    .line 957
    .line 958
    :cond_2b
    :goto_1b
    move-object v8, v2

    .line 959
    goto/16 :goto_e

    .line 960
    .line 961
    :cond_2c
    move v13, v3

    .line 962
    move-object v14, v5

    .line 963
    move-object/from16 v53, v7

    .line 964
    .line 965
    invoke-virtual {v0, v13}, Ll1;->ψ(I)I

    .line 966
    .line 967
    .line 968
    move-result v1

    .line 969
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 970
    .line 971
    .line 972
    move-result-object v3

    .line 973
    const/16 v4, 0x800

    .line 974
    .line 975
    const/16 v5, 0x8

    .line 976
    .line 977
    invoke-static {v0, v1, v4, v3, v5}, Ll1;->Γ(Ll1;IILjava/lang/Integer;I)V

    .line 978
    .line 979
    .line 980
    goto :goto_1b

    .line 981
    :cond_2d
    move v13, v3

    .line 982
    move-object v14, v5

    .line 983
    move-object/from16 v53, v7

    .line 984
    .line 985
    move/from16 v7, v45

    .line 986
    .line 987
    sget-object v3, Lfs1;->Η:Lis1;

    .line 988
    .line 989
    invoke-static {v4, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 990
    .line 991
    .line 992
    move-result v5

    .line 993
    if-eqz v5, :cond_31

    .line 994
    .line 995
    invoke-virtual {v11, v8}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 996
    .line 997
    .line 998
    move-result-object v1

    .line 999
    if-nez v1, :cond_2e

    .line 1000
    .line 1001
    const/4 v1, 0x0

    .line 1002
    :cond_2e
    check-cast v1, Lg4;

    .line 1003
    .line 1004
    if-eqz v1, :cond_30

    .line 1005
    .line 1006
    iget-object v1, v1, Lg4;->ζ:Ljava/lang/String;

    .line 1007
    .line 1008
    if-nez v1, :cond_2f

    .line 1009
    .line 1010
    goto :goto_1c

    .line 1011
    :cond_2f
    move-object/from16 v51, v1

    .line 1012
    .line 1013
    :cond_30
    :goto_1c
    invoke-virtual {v6, v3}, Lxr1;->γ(Lis1;)Ljava/lang/Object;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v1

    .line 1017
    check-cast v1, Lr32;

    .line 1018
    .line 1019
    iget-wide v3, v1, Lr32;->α:J

    .line 1020
    .line 1021
    invoke-virtual {v0, v13}, Ll1;->ψ(I)I

    .line 1022
    .line 1023
    .line 1024
    move-result v1

    .line 1025
    move v5, v1

    .line 1026
    shr-long v0, v3, v40

    .line 1027
    .line 1028
    long-to-int v0, v0

    .line 1029
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v0

    .line 1033
    and-long v3, v3, v49

    .line 1034
    .line 1035
    long-to-int v1, v3

    .line 1036
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v3

    .line 1040
    invoke-virtual/range {v51 .. v51}, Ljava/lang/String;->length()I

    .line 1041
    .line 1042
    .line 1043
    move-result v1

    .line 1044
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v4

    .line 1048
    invoke-static/range {v51 .. v51}, Ll1;->Ν(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v1

    .line 1052
    move v8, v5

    .line 1053
    move-object v5, v1

    .line 1054
    move v1, v8

    .line 1055
    move-object v8, v2

    .line 1056
    move-object v2, v0

    .line 1057
    move-object/from16 v0, p0

    .line 1058
    .line 1059
    invoke-virtual/range {v0 .. v5}, Ll1;->ο(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v1

    .line 1063
    invoke-virtual {v0, v1}, Ll1;->Α(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual {v0, v10}, Ll1;->Ε(I)V

    .line 1067
    .line 1068
    .line 1069
    goto/16 :goto_f

    .line 1070
    .line 1071
    :cond_31
    move-object v8, v2

    .line 1072
    invoke-static {v4, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1073
    .line 1074
    .line 1075
    move-result v2

    .line 1076
    if-nez v2, :cond_32

    .line 1077
    .line 1078
    sget-object v2, Lfs1;->χ:Lis1;

    .line 1079
    .line 1080
    invoke-static {v4, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1081
    .line 1082
    .line 1083
    move-result v2

    .line 1084
    if-eqz v2, :cond_33

    .line 1085
    .line 1086
    :cond_32
    const/4 v3, 0x0

    .line 1087
    const/16 v37, 0x1

    .line 1088
    .line 1089
    goto/16 :goto_22

    .line 1090
    .line 1091
    :cond_33
    sget-object v2, Lfs1;->μ:Lis1;

    .line 1092
    .line 1093
    invoke-static {v4, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1094
    .line 1095
    .line 1096
    move-result v2

    .line 1097
    if-eqz v2, :cond_35

    .line 1098
    .line 1099
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1100
    .line 1101
    .line 1102
    check-cast v1, Ljava/lang/Boolean;

    .line 1103
    .line 1104
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1105
    .line 1106
    .line 1107
    move-result v1

    .line 1108
    if-eqz v1, :cond_34

    .line 1109
    .line 1110
    invoke-virtual {v0, v10}, Ll1;->ψ(I)I

    .line 1111
    .line 1112
    .line 1113
    move-result v1

    .line 1114
    const/16 v4, 0x8

    .line 1115
    .line 1116
    invoke-virtual {v0, v1, v4}, Ll1;->ξ(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v1

    .line 1120
    invoke-virtual {v0, v1}, Ll1;->Α(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 1121
    .line 1122
    .line 1123
    goto :goto_1d

    .line 1124
    :cond_34
    const/16 v4, 0x8

    .line 1125
    .line 1126
    :goto_1d
    invoke-virtual {v0, v10}, Ll1;->ψ(I)I

    .line 1127
    .line 1128
    .line 1129
    move-result v1

    .line 1130
    const/16 v2, 0x800

    .line 1131
    .line 1132
    invoke-static {v0, v1, v2, v8, v4}, Ll1;->Γ(Ll1;IILjava/lang/Integer;I)V

    .line 1133
    .line 1134
    .line 1135
    goto/16 :goto_f

    .line 1136
    .line 1137
    :cond_35
    sget-object v2, Lwr1;->χ:Lis1;

    .line 1138
    .line 1139
    invoke-static {v4, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1140
    .line 1141
    .line 1142
    move-result v3

    .line 1143
    if-eqz v3, :cond_3b

    .line 1144
    .line 1145
    invoke-virtual {v6, v2}, Lxr1;->γ(Lis1;)Ljava/lang/Object;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v1

    .line 1149
    check-cast v1, Ljava/util/List;

    .line 1150
    .line 1151
    invoke-virtual {v14, v2}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v2

    .line 1155
    if-nez v2, :cond_36

    .line 1156
    .line 1157
    const/4 v2, 0x0

    .line 1158
    :cond_36
    check-cast v2, Ljava/util/List;

    .line 1159
    .line 1160
    if-eqz v2, :cond_39

    .line 1161
    .line 1162
    sget v3, Luq1;->α:I

    .line 1163
    .line 1164
    new-instance v3, Lc21;

    .line 1165
    .line 1166
    invoke-direct {v3}, Lc21;-><init>()V

    .line 1167
    .line 1168
    .line 1169
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 1170
    .line 1171
    .line 1172
    move-result v4

    .line 1173
    if-gtz v4, :cond_38

    .line 1174
    .line 1175
    new-instance v1, Lc21;

    .line 1176
    .line 1177
    invoke-direct {v1}, Lc21;-><init>()V

    .line 1178
    .line 1179
    .line 1180
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 1181
    .line 1182
    .line 1183
    move-result v4

    .line 1184
    if-gtz v4, :cond_37

    .line 1185
    .line 1186
    invoke-virtual {v3, v1}, Lc21;->equals(Ljava/lang/Object;)Z

    .line 1187
    .line 1188
    .line 1189
    move-result v1

    .line 1190
    const/16 v37, 0x1

    .line 1191
    .line 1192
    xor-int/lit8 v38, v1, 0x1

    .line 1193
    .line 1194
    goto/16 :goto_26

    .line 1195
    .line 1196
    :cond_37
    const/4 v3, 0x0

    .line 1197
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v0

    .line 1201
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1202
    .line 1203
    .line 1204
    invoke-static {}, Lγ;->β()V

    .line 1205
    .line 1206
    .line 1207
    return-void

    .line 1208
    :cond_38
    const/4 v3, 0x0

    .line 1209
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v0

    .line 1213
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1214
    .line 1215
    .line 1216
    invoke-static {}, Lγ;->β()V

    .line 1217
    .line 1218
    .line 1219
    return-void

    .line 1220
    :cond_39
    const/4 v3, 0x0

    .line 1221
    const/16 v37, 0x1

    .line 1222
    .line 1223
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1224
    .line 1225
    .line 1226
    move-result v1

    .line 1227
    if-nez v1, :cond_48

    .line 1228
    .line 1229
    :cond_3a
    :goto_1e
    move/from16 v38, v37

    .line 1230
    .line 1231
    goto/16 :goto_25

    .line 1232
    .line 1233
    :cond_3b
    const/4 v3, 0x0

    .line 1234
    const/16 v37, 0x1

    .line 1235
    .line 1236
    instance-of v2, v1, Lм;

    .line 1237
    .line 1238
    if-eqz v2, :cond_3a

    .line 1239
    .line 1240
    check-cast v1, Lм;

    .line 1241
    .line 1242
    invoke-virtual {v14, v4}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v2

    .line 1246
    if-nez v2, :cond_3c

    .line 1247
    .line 1248
    const/4 v2, 0x0

    .line 1249
    :cond_3c
    if-ne v1, v2, :cond_3d

    .line 1250
    .line 1251
    goto :goto_20

    .line 1252
    :cond_3d
    instance-of v4, v2, Lм;

    .line 1253
    .line 1254
    if-nez v4, :cond_3e

    .line 1255
    .line 1256
    goto :goto_1f

    .line 1257
    :cond_3e
    iget-object v4, v1, Lм;->α:Ljava/lang/String;

    .line 1258
    .line 1259
    check-cast v2, Lм;

    .line 1260
    .line 1261
    iget-object v5, v2, Lм;->β:Lm80;

    .line 1262
    .line 1263
    iget-object v2, v2, Lм;->α:Ljava/lang/String;

    .line 1264
    .line 1265
    invoke-static {v4, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1266
    .line 1267
    .line 1268
    move-result v2

    .line 1269
    if-nez v2, :cond_3f

    .line 1270
    .line 1271
    goto :goto_1f

    .line 1272
    :cond_3f
    iget-object v1, v1, Lм;->β:Lm80;

    .line 1273
    .line 1274
    if-nez v1, :cond_40

    .line 1275
    .line 1276
    if-eqz v5, :cond_40

    .line 1277
    .line 1278
    goto :goto_1f

    .line 1279
    :cond_40
    if-eqz v1, :cond_41

    .line 1280
    .line 1281
    if-nez v5, :cond_41

    .line 1282
    .line 1283
    :goto_1f
    move v12, v3

    .line 1284
    goto :goto_21

    .line 1285
    :cond_41
    :goto_20
    move/from16 v12, v37

    .line 1286
    .line 1287
    :goto_21
    if-nez v12, :cond_42

    .line 1288
    .line 1289
    goto :goto_1e

    .line 1290
    :cond_42
    move/from16 v38, v3

    .line 1291
    .line 1292
    goto :goto_25

    .line 1293
    :goto_22
    invoke-virtual {v0, v15}, Ll1;->χ(Lyp0;)V

    .line 1294
    .line 1295
    .line 1296
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 1297
    .line 1298
    .line 1299
    move-result v1

    .line 1300
    move v2, v3

    .line 1301
    :goto_23
    if-ge v2, v1, :cond_44

    .line 1302
    .line 1303
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v4

    .line 1307
    check-cast v4, Lbr1;

    .line 1308
    .line 1309
    iget v4, v4, Lbr1;->ε:I

    .line 1310
    .line 1311
    if-ne v4, v13, :cond_43

    .line 1312
    .line 1313
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v1

    .line 1317
    check-cast v1, Lbr1;

    .line 1318
    .line 1319
    goto :goto_24

    .line 1320
    :cond_43
    add-int/lit8 v2, v2, 0x1

    .line 1321
    .line 1322
    goto :goto_23

    .line 1323
    :cond_44
    const/4 v1, 0x0

    .line 1324
    :goto_24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1325
    .line 1326
    .line 1327
    invoke-virtual {v11, v12}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v2

    .line 1331
    if-nez v2, :cond_45

    .line 1332
    .line 1333
    const/4 v2, 0x0

    .line 1334
    :cond_45
    if-nez v2, :cond_4a

    .line 1335
    .line 1336
    sget-object v2, Lfs1;->χ:Lis1;

    .line 1337
    .line 1338
    invoke-virtual {v11, v2}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v2

    .line 1342
    if-nez v2, :cond_46

    .line 1343
    .line 1344
    const/4 v2, 0x0

    .line 1345
    :cond_46
    if-nez v2, :cond_49

    .line 1346
    .line 1347
    iget-object v2, v1, Lbr1;->ζ:Ljava/util/List;

    .line 1348
    .line 1349
    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1350
    .line 1351
    .line 1352
    move-result v2

    .line 1353
    if-nez v2, :cond_47

    .line 1354
    .line 1355
    goto :goto_25

    .line 1356
    :cond_47
    iget-object v2, v0, Ll1;->θ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 1357
    .line 1358
    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getSnapshotObserver()Ly81;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v2

    .line 1362
    new-instance v4, Lk1;

    .line 1363
    .line 1364
    invoke-direct {v4, v1, v0}, Lk1;-><init>(Lbr1;Ll1;)V

    .line 1365
    .line 1366
    .line 1367
    iget-object v2, v2, Ly81;->α:Lkx1;

    .line 1368
    .line 1369
    iget-object v5, v0, Ll1;->Π:Lj1;

    .line 1370
    .line 1371
    invoke-virtual {v2, v1, v5, v4}, Lkx1;->β(Ljava/lang/Object;La80;Lp70;)V

    .line 1372
    .line 1373
    .line 1374
    :cond_48
    :goto_25
    const/16 v4, 0x8

    .line 1375
    .line 1376
    goto :goto_27

    .line 1377
    :cond_49
    invoke-static {}, Lγ;->β()V

    .line 1378
    .line 1379
    .line 1380
    return-void

    .line 1381
    :cond_4a
    invoke-static {}, Lγ;->β()V

    .line 1382
    .line 1383
    .line 1384
    return-void

    .line 1385
    :cond_4b
    move-object/from16 v43, v4

    .line 1386
    .line 1387
    move-object/from16 v53, v7

    .line 1388
    .line 1389
    move-object/from16 v48, v8

    .line 1390
    .line 1391
    move-wide/from16 v46, v12

    .line 1392
    .line 1393
    move/from16 v28, v14

    .line 1394
    .line 1395
    move/from16 v44, v15

    .line 1396
    .line 1397
    move-object/from16 v15, v40

    .line 1398
    .line 1399
    const/16 v37, 0x1

    .line 1400
    .line 1401
    move v7, v1

    .line 1402
    move-object v8, v2

    .line 1403
    move v13, v3

    .line 1404
    move-object v14, v5

    .line 1405
    :goto_26
    const/4 v3, 0x0

    .line 1406
    goto :goto_25

    .line 1407
    :goto_27
    shr-long v1, v46, v4

    .line 1408
    .line 1409
    add-int/lit8 v5, v44, 0x1

    .line 1410
    .line 1411
    move/from16 v27, v4

    .line 1412
    .line 1413
    move v3, v13

    .line 1414
    move-object/from16 v40, v15

    .line 1415
    .line 1416
    move-object/from16 v4, v43

    .line 1417
    .line 1418
    move-wide v12, v1

    .line 1419
    move v15, v5

    .line 1420
    move v1, v7

    .line 1421
    move-object v2, v8

    .line 1422
    move-object v5, v14

    .line 1423
    move/from16 v14, v28

    .line 1424
    .line 1425
    move-object/from16 v8, v48

    .line 1426
    .line 1427
    move-object/from16 v7, v53

    .line 1428
    .line 1429
    goto/16 :goto_4

    .line 1430
    .line 1431
    :cond_4c
    move v13, v3

    .line 1432
    move-object/from16 v43, v4

    .line 1433
    .line 1434
    move-object/from16 v53, v7

    .line 1435
    .line 1436
    move-object/from16 v48, v8

    .line 1437
    .line 1438
    move v12, v14

    .line 1439
    move/from16 v4, v27

    .line 1440
    .line 1441
    move-object/from16 v15, v40

    .line 1442
    .line 1443
    const/4 v3, 0x0

    .line 1444
    const/16 v37, 0x1

    .line 1445
    .line 1446
    move v7, v1

    .line 1447
    move-object v8, v2

    .line 1448
    move-object v14, v5

    .line 1449
    if-ne v12, v4, :cond_4f

    .line 1450
    .line 1451
    :goto_28
    move/from16 v1, v42

    .line 1452
    .line 1453
    goto :goto_29

    .line 1454
    :cond_4d
    move v13, v3

    .line 1455
    move-object/from16 v43, v4

    .line 1456
    .line 1457
    move-object v14, v5

    .line 1458
    move-object/from16 v53, v7

    .line 1459
    .line 1460
    move-object/from16 v48, v8

    .line 1461
    .line 1462
    move-object/from16 v15, v40

    .line 1463
    .line 1464
    const/4 v3, 0x0

    .line 1465
    const/16 v37, 0x1

    .line 1466
    .line 1467
    move v7, v1

    .line 1468
    move-object v8, v2

    .line 1469
    goto :goto_28

    .line 1470
    :goto_29
    if-eq v1, v7, :cond_4f

    .line 1471
    .line 1472
    add-int/lit8 v1, v1, 0x1

    .line 1473
    .line 1474
    move-object v2, v8

    .line 1475
    move v3, v13

    .line 1476
    move-object v5, v14

    .line 1477
    move-object/from16 v40, v15

    .line 1478
    .line 1479
    move-object/from16 v14, v41

    .line 1480
    .line 1481
    move-object/from16 v4, v43

    .line 1482
    .line 1483
    move-object/from16 v8, v48

    .line 1484
    .line 1485
    const/16 v27, 0x8

    .line 1486
    .line 1487
    move v15, v1

    .line 1488
    move v1, v7

    .line 1489
    move-object/from16 v7, v53

    .line 1490
    .line 1491
    goto/16 :goto_3

    .line 1492
    .line 1493
    :cond_4e
    move-object/from16 v43, v4

    .line 1494
    .line 1495
    move-object/from16 v53, v7

    .line 1496
    .line 1497
    move-object/from16 v48, v8

    .line 1498
    .line 1499
    move/from16 v39, v13

    .line 1500
    .line 1501
    move-object/from16 v41, v14

    .line 1502
    .line 1503
    const/16 v37, 0x1

    .line 1504
    .line 1505
    move-object v8, v2

    .line 1506
    move v13, v3

    .line 1507
    const/4 v3, 0x0

    .line 1508
    move/from16 v38, v3

    .line 1509
    .line 1510
    :cond_4f
    if-nez v38, :cond_52

    .line 1511
    .line 1512
    invoke-virtual/range {v43 .. v43}, Lxr1;->iterator()Ljava/util/Iterator;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v1

    .line 1516
    :cond_50
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1517
    .line 1518
    .line 1519
    move-result v2

    .line 1520
    if-eqz v2, :cond_51

    .line 1521
    .line 1522
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v2

    .line 1526
    check-cast v2, Ljava/util/Map$Entry;

    .line 1527
    .line 1528
    invoke-virtual/range {v41 .. v41}, Lbs1;->λ()Lxr1;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v4

    .line 1532
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v2

    .line 1536
    check-cast v2, Lis1;

    .line 1537
    .line 1538
    iget-object v4, v4, Lxr1;->ε:Lb21;

    .line 1539
    .line 1540
    invoke-virtual {v4, v2}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 1541
    .line 1542
    .line 1543
    move-result v2

    .line 1544
    if-nez v2, :cond_50

    .line 1545
    .line 1546
    move/from16 v15, v37

    .line 1547
    .line 1548
    goto :goto_2a

    .line 1549
    :cond_51
    move v15, v3

    .line 1550
    :goto_2a
    move/from16 v38, v15

    .line 1551
    .line 1552
    :cond_52
    if-eqz v38, :cond_53

    .line 1553
    .line 1554
    invoke-virtual {v0, v13}, Ll1;->ψ(I)I

    .line 1555
    .line 1556
    .line 1557
    move-result v1

    .line 1558
    const/16 v13, 0x8

    .line 1559
    .line 1560
    const/16 v15, 0x800

    .line 1561
    .line 1562
    invoke-static {v0, v1, v15, v8, v13}, Ll1;->Γ(Ll1;IILjava/lang/Integer;I)V

    .line 1563
    .line 1564
    .line 1565
    goto :goto_2c

    .line 1566
    :cond_53
    const/16 v13, 0x8

    .line 1567
    .line 1568
    goto :goto_2c

    .line 1569
    :cond_54
    const-string v0, "no value for specified key"

    .line 1570
    .line 1571
    invoke-static {v0}, Llz1;->ε(Ljava/lang/String;)Lpm;

    .line 1572
    .line 1573
    .line 1574
    move-result-object v0

    .line 1575
    throw v0

    .line 1576
    :cond_55
    :goto_2b
    move/from16 v34, v1

    .line 1577
    .line 1578
    move-object/from16 v53, v7

    .line 1579
    .line 1580
    move-object/from16 v48, v8

    .line 1581
    .line 1582
    move-object/from16 v29, v10

    .line 1583
    .line 1584
    move-object/from16 v30, v11

    .line 1585
    .line 1586
    move/from16 v39, v13

    .line 1587
    .line 1588
    move v3, v14

    .line 1589
    move/from16 v31, v15

    .line 1590
    .line 1591
    move-object v8, v2

    .line 1592
    move v13, v12

    .line 1593
    :goto_2c
    shr-long v21, v21, v13

    .line 1594
    .line 1595
    add-int/lit8 v1, v34, 0x1

    .line 1596
    .line 1597
    move-object/from16 v6, p1

    .line 1598
    .line 1599
    move v14, v3

    .line 1600
    move-object v2, v8

    .line 1601
    move v12, v13

    .line 1602
    move-object/from16 v10, v29

    .line 1603
    .line 1604
    move-object/from16 v11, v30

    .line 1605
    .line 1606
    move/from16 v15, v31

    .line 1607
    .line 1608
    move/from16 v13, v39

    .line 1609
    .line 1610
    move-object/from16 v8, v48

    .line 1611
    .line 1612
    move-object/from16 v7, v53

    .line 1613
    .line 1614
    goto/16 :goto_1

    .line 1615
    .line 1616
    :cond_56
    move v3, v13

    .line 1617
    move v13, v12

    .line 1618
    move v12, v3

    .line 1619
    move-object/from16 v53, v7

    .line 1620
    .line 1621
    move-object/from16 v48, v8

    .line 1622
    .line 1623
    move-object/from16 v29, v10

    .line 1624
    .line 1625
    move-object/from16 v30, v11

    .line 1626
    .line 1627
    move v3, v14

    .line 1628
    move/from16 v31, v15

    .line 1629
    .line 1630
    move-object v8, v2

    .line 1631
    if-ne v12, v13, :cond_58

    .line 1632
    .line 1633
    move/from16 v14, v31

    .line 1634
    .line 1635
    :goto_2d
    move/from16 v1, v17

    .line 1636
    .line 1637
    goto :goto_2e

    .line 1638
    :cond_57
    move-object/from16 v53, v7

    .line 1639
    .line 1640
    move-object/from16 v48, v8

    .line 1641
    .line 1642
    move-object/from16 v29, v10

    .line 1643
    .line 1644
    move-object/from16 v30, v11

    .line 1645
    .line 1646
    move v3, v14

    .line 1647
    move-object v8, v2

    .line 1648
    move v14, v15

    .line 1649
    goto :goto_2d

    .line 1650
    :goto_2e
    if-eq v14, v1, :cond_58

    .line 1651
    .line 1652
    add-int/lit8 v15, v14, 0x1

    .line 1653
    .line 1654
    move-object/from16 v6, p1

    .line 1655
    .line 1656
    move v13, v1

    .line 1657
    move v14, v3

    .line 1658
    move-object v2, v8

    .line 1659
    move/from16 v12, v16

    .line 1660
    .line 1661
    move-object/from16 v10, v29

    .line 1662
    .line 1663
    move-object/from16 v11, v30

    .line 1664
    .line 1665
    move-object/from16 v8, v48

    .line 1666
    .line 1667
    move-object/from16 v7, v53

    .line 1668
    .line 1669
    goto/16 :goto_0

    .line 1670
    .line 1671
    :cond_58
    return-void
.end method

.method public final Η(Lyp0;Lo11;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lyp0;->Η()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_4

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Ll1;->θ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui()Landroidx/compose/ui/platform/AndroidViewsHandler;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidViewsHandler;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_1
    iget-object v0, p1, Lyp0;->Κ:Lk31;

    .line 28
    .line 29
    const/16 v1, 0x8

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lk31;->δ(I)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v2, 0x0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-virtual {p1}, Lyp0;->σ()Lyp0;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :goto_0
    if-eqz p1, :cond_4

    .line 44
    .line 45
    iget-object v0, p1, Lyp0;->Κ:Lk31;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lk31;->δ(I)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    invoke-virtual {p1}, Lyp0;->σ()Lyp0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    goto :goto_0

    .line 59
    :cond_4
    move-object p1, v2

    .line 60
    :goto_1
    if-eqz p1, :cond_a

    .line 61
    .line 62
    invoke-virtual {p1}, Lyp0;->υ()Lxr1;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-nez v0, :cond_5

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_5
    iget-boolean v0, v0, Lxr1;->η:Z

    .line 70
    .line 71
    const/4 v3, 0x1

    .line 72
    if-nez v0, :cond_8

    .line 73
    .line 74
    invoke-virtual {p1}, Lyp0;->σ()Lyp0;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    :goto_2
    if-eqz v0, :cond_7

    .line 79
    .line 80
    invoke-virtual {v0}, Lyp0;->υ()Lxr1;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    if-eqz v4, :cond_6

    .line 85
    .line 86
    iget-boolean v4, v4, Lxr1;->η:Z

    .line 87
    .line 88
    if-ne v4, v3, :cond_6

    .line 89
    .line 90
    move-object v2, v0

    .line 91
    goto :goto_3

    .line 92
    :cond_6
    invoke-virtual {v0}, Lyp0;->σ()Lyp0;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    goto :goto_2

    .line 97
    :cond_7
    :goto_3
    if-eqz v2, :cond_8

    .line 98
    .line 99
    move-object p1, v2

    .line 100
    :cond_8
    iget p1, p1, Lyp0;->ζ:I

    .line 101
    .line 102
    invoke-virtual {p2, p1}, Lo11;->α(I)Z

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    if-nez p2, :cond_9

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_9
    invoke-virtual {p0, p1}, Ll1;->ψ(I)I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    const/16 p2, 0x800

    .line 114
    .line 115
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-static {p0, p1, p2, v0, v1}, Ll1;->Γ(Ll1;IILjava/lang/Integer;I)V

    .line 120
    .line 121
    .line 122
    :cond_a
    :goto_4
    return-void
.end method

.method public final Θ(Lbs1;IIZ)Z
    .locals 10

    .line 1
    iget-object v0, p1, Lbs1;->δ:Lxr1;

    .line 2
    .line 3
    iget v1, p1, Lbs1;->ζ:I

    .line 4
    .line 5
    sget-object v2, Lwr1;->ι:Lis1;

    .line 6
    .line 7
    iget-object v0, v0, Lxr1;->ε:Lb21;

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lkn0;->ε(Lbs1;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object p0, p1, Lbs1;->δ:Lxr1;

    .line 23
    .line 24
    invoke-virtual {p0, v2}, Lxr1;->γ(Lis1;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Lм;

    .line 29
    .line 30
    iget-object p0, p0, Lм;->β:Lm80;

    .line 31
    .line 32
    check-cast p0, Lf80;

    .line 33
    .line 34
    if-eqz p0, :cond_2

    .line 35
    .line 36
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    invoke-interface {p0, p1, p2, p3}, Lf80;->α(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    return p0

    .line 59
    :cond_0
    if-ne p2, p3, :cond_1

    .line 60
    .line 61
    iget p4, p0, Ll1;->φ:I

    .line 62
    .line 63
    if-ne p3, p4, :cond_1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-static {p1}, Ll1;->τ(Lbs1;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    if-nez v9, :cond_3

    .line 71
    .line 72
    :cond_2
    :goto_0
    return v3

    .line 73
    :cond_3
    if-ltz p2, :cond_4

    .line 74
    .line 75
    if-ne p2, p3, :cond_4

    .line 76
    .line 77
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-gt p3, p1, :cond_4

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    const/4 p2, -0x1

    .line 85
    :goto_1
    iput p2, p0, Ll1;->φ:I

    .line 86
    .line 87
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    const/4 p2, 0x1

    .line 92
    if-lez p1, :cond_5

    .line 93
    .line 94
    move v3, p2

    .line 95
    :cond_5
    invoke-virtual {p0, v1}, Ll1;->ψ(I)I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    const/4 p1, 0x0

    .line 100
    if-eqz v3, :cond_6

    .line 101
    .line 102
    iget p3, p0, Ll1;->φ:I

    .line 103
    .line 104
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object p3

    .line 108
    move-object v6, p3

    .line 109
    goto :goto_2

    .line 110
    :cond_6
    move-object v6, p1

    .line 111
    :goto_2
    if-eqz v3, :cond_7

    .line 112
    .line 113
    iget p3, p0, Ll1;->φ:I

    .line 114
    .line 115
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object p3

    .line 119
    move-object v7, p3

    .line 120
    goto :goto_3

    .line 121
    :cond_7
    move-object v7, p1

    .line 122
    :goto_3
    if-eqz v3, :cond_8

    .line 123
    .line 124
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    :cond_8
    move-object v4, p0

    .line 133
    move-object v8, p1

    .line 134
    invoke-virtual/range {v4 .. v9}, Ll1;->ο(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-virtual {v4, p0}, Ll1;->Α(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4, v1}, Ll1;->Ε(I)V

    .line 142
    .line 143
    .line 144
    return p2
.end method

.method public final Κ(FFFF)Landroid/graphics/Rect;
    .locals 7

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-long v0, p1

    .line 6
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    int-to-long p1, p1

    .line 11
    const/16 v2, 0x20

    .line 12
    .line 13
    shl-long/2addr v0, v2

    .line 14
    const-wide v3, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long/2addr p1, v3

    .line 20
    or-long/2addr p1, v0

    .line 21
    iget-object p0, p0, Ll1;->θ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/AndroidComposeView;->τ(J)J

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    int-to-long v0, p3

    .line 32
    invoke-static {p4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    int-to-long p3, p3

    .line 37
    shl-long/2addr v0, v2

    .line 38
    and-long/2addr p3, v3

    .line 39
    or-long/2addr p3, v0

    .line 40
    invoke-virtual {p0, p3, p4}, Landroidx/compose/ui/platform/AndroidComposeView;->τ(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide p3

    .line 44
    new-instance p0, Landroid/graphics/Rect;

    .line 45
    .line 46
    shr-long v0, p1, v2

    .line 47
    .line 48
    long-to-int v0, v0

    .line 49
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    shr-long v5, p3, v2

    .line 54
    .line 55
    long-to-int v2, v5

    .line 56
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    invoke-static {v1, v5}, Ljava/lang/Math;->min(FF)F

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    float-to-double v5, v1

    .line 65
    invoke-static {v5, v6}, Ljava/lang/Math;->floor(D)D

    .line 66
    .line 67
    .line 68
    move-result-wide v5

    .line 69
    double-to-float v1, v5

    .line 70
    float-to-int v1, v1

    .line 71
    and-long/2addr p1, v3

    .line 72
    long-to-int p1, p1

    .line 73
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    and-long/2addr p3, v3

    .line 78
    long-to-int p3, p3

    .line 79
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 80
    .line 81
    .line 82
    move-result p4

    .line 83
    invoke-static {p2, p4}, Ljava/lang/Math;->min(FF)F

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    float-to-double v3, p2

    .line 88
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    .line 89
    .line 90
    .line 91
    move-result-wide v3

    .line 92
    double-to-float p2, v3

    .line 93
    float-to-int p2, p2

    .line 94
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 95
    .line 96
    .line 97
    move-result p4

    .line 98
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    invoke-static {p4, v0}, Ljava/lang/Math;->max(FF)F

    .line 103
    .line 104
    .line 105
    move-result p4

    .line 106
    float-to-double v2, p4

    .line 107
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 108
    .line 109
    .line 110
    move-result-wide v2

    .line 111
    double-to-float p4, v2

    .line 112
    float-to-int p4, p4

    .line 113
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 118
    .line 119
    .line 120
    move-result p3

    .line 121
    invoke-static {p1, p3}, Ljava/lang/Math;->max(FF)F

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    float-to-double v2, p1

    .line 126
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 127
    .line 128
    .line 129
    move-result-wide v2

    .line 130
    double-to-float p1, v2

    .line 131
    float-to-int p1, p1

    .line 132
    invoke-direct {p0, v1, p2, p4, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 133
    .line 134
    .line 135
    return-object p0
.end method

.method public final Ξ()V
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lo11;

    .line 4
    .line 5
    invoke-direct {v1}, Lo11;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Ll1;->Δ:Lo11;

    .line 9
    .line 10
    iget-object v3, v2, Lo11;->β:[I

    .line 11
    .line 12
    iget-object v4, v2, Lo11;->α:[J

    .line 13
    .line 14
    array-length v5, v4

    .line 15
    add-int/lit8 v5, v5, -0x2

    .line 16
    .line 17
    iget-object v6, v0, Ll1;->Κ:Ln11;

    .line 18
    .line 19
    const/16 v14, 0x8

    .line 20
    .line 21
    if-ltz v5, :cond_8

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    const-wide/16 v16, 0x80

    .line 25
    .line 26
    const-wide/16 v18, 0xff

    .line 27
    .line 28
    :goto_0
    aget-wide v9, v4, v7

    .line 29
    .line 30
    const/4 v8, 0x7

    .line 31
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    not-long v11, v9

    .line 37
    shl-long/2addr v11, v8

    .line 38
    and-long/2addr v11, v9

    .line 39
    and-long v11, v11, v20

    .line 40
    .line 41
    cmp-long v11, v11, v20

    .line 42
    .line 43
    if-eqz v11, :cond_7

    .line 44
    .line 45
    sub-int v11, v7, v5

    .line 46
    .line 47
    not-int v11, v11

    .line 48
    ushr-int/lit8 v11, v11, 0x1f

    .line 49
    .line 50
    rsub-int/lit8 v11, v11, 0x8

    .line 51
    .line 52
    const/4 v12, 0x0

    .line 53
    :goto_1
    if-ge v12, v11, :cond_6

    .line 54
    .line 55
    and-long v22, v9, v18

    .line 56
    .line 57
    cmp-long v13, v22, v16

    .line 58
    .line 59
    if-gez v13, :cond_4

    .line 60
    .line 61
    shl-int/lit8 v13, v7, 0x3

    .line 62
    .line 63
    add-int/2addr v13, v12

    .line 64
    aget v13, v3, v13

    .line 65
    .line 66
    move/from16 v22, v8

    .line 67
    .line 68
    invoke-virtual {v0}, Ll1;->σ()Lsm0;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    invoke-virtual {v8, v13}, Lsm0;->β(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    check-cast v8, Lds1;

    .line 77
    .line 78
    const/16 v23, 0x0

    .line 79
    .line 80
    if-eqz v8, :cond_0

    .line 81
    .line 82
    iget-object v8, v8, Lds1;->α:Lbs1;

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_0
    move-object/from16 v8, v23

    .line 86
    .line 87
    :goto_2
    if-eqz v8, :cond_1

    .line 88
    .line 89
    iget-object v8, v8, Lbs1;->δ:Lxr1;

    .line 90
    .line 91
    sget-object v15, Lfs1;->δ:Lis1;

    .line 92
    .line 93
    iget-object v8, v8, Lxr1;->ε:Lb21;

    .line 94
    .line 95
    invoke-virtual {v8, v15}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    if-nez v8, :cond_5

    .line 100
    .line 101
    :cond_1
    invoke-virtual {v1, v13}, Lo11;->α(I)Z

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6, v13}, Lsm0;->β(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    check-cast v8, Lcs1;

    .line 109
    .line 110
    if-eqz v8, :cond_3

    .line 111
    .line 112
    iget-object v8, v8, Lcs1;->α:Lxr1;

    .line 113
    .line 114
    sget-object v15, Lfs1;->δ:Lis1;

    .line 115
    .line 116
    iget-object v8, v8, Lxr1;->ε:Lb21;

    .line 117
    .line 118
    invoke-virtual {v8, v15}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    if-nez v8, :cond_2

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_2
    move-object/from16 v23, v8

    .line 126
    .line 127
    :goto_3
    check-cast v23, Ljava/lang/String;

    .line 128
    .line 129
    :cond_3
    move-object/from16 v8, v23

    .line 130
    .line 131
    const/16 v15, 0x20

    .line 132
    .line 133
    invoke-virtual {v0, v13, v15, v8}, Ll1;->Δ(IILjava/lang/String;)V

    .line 134
    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_4
    move/from16 v22, v8

    .line 138
    .line 139
    :cond_5
    :goto_4
    shr-long/2addr v9, v14

    .line 140
    add-int/lit8 v12, v12, 0x1

    .line 141
    .line 142
    move/from16 v8, v22

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_6
    move/from16 v22, v8

    .line 146
    .line 147
    if-ne v11, v14, :cond_9

    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_7
    move/from16 v22, v8

    .line 151
    .line 152
    :goto_5
    if-eq v7, v5, :cond_9

    .line 153
    .line 154
    add-int/lit8 v7, v7, 0x1

    .line 155
    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :cond_8
    const-wide/16 v16, 0x80

    .line 159
    .line 160
    const-wide/16 v18, 0xff

    .line 161
    .line 162
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    const/16 v22, 0x7

    .line 168
    .line 169
    :cond_9
    iget-object v3, v1, Lo11;->β:[I

    .line 170
    .line 171
    iget-object v1, v1, Lo11;->α:[J

    .line 172
    .line 173
    array-length v4, v1

    .line 174
    add-int/lit8 v4, v4, -0x2

    .line 175
    .line 176
    if-ltz v4, :cond_11

    .line 177
    .line 178
    const/4 v5, 0x0

    .line 179
    :goto_6
    aget-wide v7, v1, v5

    .line 180
    .line 181
    not-long v9, v7

    .line 182
    shl-long v9, v9, v22

    .line 183
    .line 184
    and-long/2addr v9, v7

    .line 185
    and-long v9, v9, v20

    .line 186
    .line 187
    cmp-long v9, v9, v20

    .line 188
    .line 189
    if-eqz v9, :cond_10

    .line 190
    .line 191
    sub-int v9, v5, v4

    .line 192
    .line 193
    not-int v9, v9

    .line 194
    ushr-int/lit8 v9, v9, 0x1f

    .line 195
    .line 196
    rsub-int/lit8 v9, v9, 0x8

    .line 197
    .line 198
    const/4 v10, 0x0

    .line 199
    :goto_7
    if-ge v10, v9, :cond_f

    .line 200
    .line 201
    and-long v11, v7, v18

    .line 202
    .line 203
    cmp-long v11, v11, v16

    .line 204
    .line 205
    if-gez v11, :cond_d

    .line 206
    .line 207
    shl-int/lit8 v11, v5, 0x3

    .line 208
    .line 209
    add-int/2addr v11, v10

    .line 210
    aget v11, v3, v11

    .line 211
    .line 212
    invoke-static {v11}, Ljava/lang/Integer;->hashCode(I)I

    .line 213
    .line 214
    .line 215
    move-result v12

    .line 216
    const v13, -0x3361d2af    # -8.293031E7f

    .line 217
    .line 218
    .line 219
    mul-int/2addr v12, v13

    .line 220
    shl-int/lit8 v13, v12, 0x10

    .line 221
    .line 222
    xor-int/2addr v12, v13

    .line 223
    and-int/lit8 v13, v12, 0x7f

    .line 224
    .line 225
    iget v15, v2, Lo11;->γ:I

    .line 226
    .line 227
    ushr-int/lit8 v12, v12, 0x7

    .line 228
    .line 229
    and-int/2addr v12, v15

    .line 230
    move/from16 v24, v14

    .line 231
    .line 232
    const/16 v23, 0x0

    .line 233
    .line 234
    :goto_8
    iget-object v14, v2, Lo11;->α:[J

    .line 235
    .line 236
    shr-int/lit8 v25, v12, 0x3

    .line 237
    .line 238
    and-int/lit8 v26, v12, 0x7

    .line 239
    .line 240
    move-object/from16 v27, v1

    .line 241
    .line 242
    shl-int/lit8 v1, v26, 0x3

    .line 243
    .line 244
    aget-wide v28, v14, v25

    .line 245
    .line 246
    ushr-long v28, v28, v1

    .line 247
    .line 248
    add-int/lit8 v25, v25, 0x1

    .line 249
    .line 250
    aget-wide v25, v14, v25

    .line 251
    .line 252
    rsub-int/lit8 v14, v1, 0x40

    .line 253
    .line 254
    shl-long v25, v25, v14

    .line 255
    .line 256
    move-wide/from16 v30, v7

    .line 257
    .line 258
    int-to-long v7, v1

    .line 259
    neg-long v7, v7

    .line 260
    const/16 v1, 0x3f

    .line 261
    .line 262
    shr-long/2addr v7, v1

    .line 263
    and-long v7, v25, v7

    .line 264
    .line 265
    or-long v7, v28, v7

    .line 266
    .line 267
    move v1, v15

    .line 268
    int-to-long v14, v13

    .line 269
    const-wide v25, 0x101010101010101L

    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    mul-long v14, v14, v25

    .line 275
    .line 276
    xor-long/2addr v14, v7

    .line 277
    sub-long v25, v14, v25

    .line 278
    .line 279
    not-long v14, v14

    .line 280
    and-long v14, v25, v14

    .line 281
    .line 282
    and-long v14, v14, v20

    .line 283
    .line 284
    :goto_9
    const-wide/16 v25, 0x0

    .line 285
    .line 286
    cmp-long v28, v14, v25

    .line 287
    .line 288
    if-eqz v28, :cond_b

    .line 289
    .line 290
    invoke-static {v14, v15}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 291
    .line 292
    .line 293
    move-result v25

    .line 294
    shr-int/lit8 v25, v25, 0x3

    .line 295
    .line 296
    add-int v25, v12, v25

    .line 297
    .line 298
    and-int v25, v25, v1

    .line 299
    .line 300
    move/from16 v28, v1

    .line 301
    .line 302
    iget-object v1, v2, Lo11;->β:[I

    .line 303
    .line 304
    aget v1, v1, v25

    .line 305
    .line 306
    if-ne v1, v11, :cond_a

    .line 307
    .line 308
    :goto_a
    move/from16 v1, v25

    .line 309
    .line 310
    goto :goto_b

    .line 311
    :cond_a
    const-wide/16 v25, 0x1

    .line 312
    .line 313
    sub-long v25, v14, v25

    .line 314
    .line 315
    and-long v14, v14, v25

    .line 316
    .line 317
    move/from16 v1, v28

    .line 318
    .line 319
    goto :goto_9

    .line 320
    :cond_b
    move/from16 v28, v1

    .line 321
    .line 322
    not-long v14, v7

    .line 323
    const/4 v1, 0x6

    .line 324
    shl-long/2addr v14, v1

    .line 325
    and-long/2addr v7, v14

    .line 326
    and-long v7, v7, v20

    .line 327
    .line 328
    cmp-long v1, v7, v25

    .line 329
    .line 330
    if-eqz v1, :cond_c

    .line 331
    .line 332
    const/16 v25, -0x1

    .line 333
    .line 334
    goto :goto_a

    .line 335
    :goto_b
    if-ltz v1, :cond_e

    .line 336
    .line 337
    invoke-virtual {v2, v1}, Lo11;->ζ(I)V

    .line 338
    .line 339
    .line 340
    goto :goto_c

    .line 341
    :cond_c
    add-int/lit8 v23, v23, 0x8

    .line 342
    .line 343
    add-int v12, v12, v23

    .line 344
    .line 345
    and-int v12, v12, v28

    .line 346
    .line 347
    move-object/from16 v1, v27

    .line 348
    .line 349
    move/from16 v15, v28

    .line 350
    .line 351
    move-wide/from16 v7, v30

    .line 352
    .line 353
    goto :goto_8

    .line 354
    :cond_d
    move-object/from16 v27, v1

    .line 355
    .line 356
    move-wide/from16 v30, v7

    .line 357
    .line 358
    move/from16 v24, v14

    .line 359
    .line 360
    :cond_e
    :goto_c
    shr-long v7, v30, v24

    .line 361
    .line 362
    add-int/lit8 v10, v10, 0x1

    .line 363
    .line 364
    move/from16 v14, v24

    .line 365
    .line 366
    move-object/from16 v1, v27

    .line 367
    .line 368
    goto/16 :goto_7

    .line 369
    .line 370
    :cond_f
    move-object/from16 v27, v1

    .line 371
    .line 372
    move v1, v14

    .line 373
    if-ne v9, v1, :cond_11

    .line 374
    .line 375
    goto :goto_d

    .line 376
    :cond_10
    move-object/from16 v27, v1

    .line 377
    .line 378
    :goto_d
    if-eq v5, v4, :cond_11

    .line 379
    .line 380
    add-int/lit8 v5, v5, 0x1

    .line 381
    .line 382
    move-object/from16 v1, v27

    .line 383
    .line 384
    const/16 v14, 0x8

    .line 385
    .line 386
    goto/16 :goto_6

    .line 387
    .line 388
    :cond_11
    invoke-virtual {v6}, Ln11;->γ()V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v0}, Ll1;->σ()Lsm0;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    iget-object v3, v1, Lsm0;->β:[I

    .line 396
    .line 397
    iget-object v4, v1, Lsm0;->γ:[Ljava/lang/Object;

    .line 398
    .line 399
    iget-object v1, v1, Lsm0;->α:[J

    .line 400
    .line 401
    array-length v5, v1

    .line 402
    add-int/lit8 v5, v5, -0x2

    .line 403
    .line 404
    if-ltz v5, :cond_16

    .line 405
    .line 406
    const/4 v7, 0x0

    .line 407
    :goto_e
    aget-wide v8, v1, v7

    .line 408
    .line 409
    not-long v10, v8

    .line 410
    shl-long v10, v10, v22

    .line 411
    .line 412
    and-long/2addr v10, v8

    .line 413
    and-long v10, v10, v20

    .line 414
    .line 415
    cmp-long v10, v10, v20

    .line 416
    .line 417
    if-eqz v10, :cond_15

    .line 418
    .line 419
    sub-int v10, v7, v5

    .line 420
    .line 421
    not-int v10, v10

    .line 422
    ushr-int/lit8 v10, v10, 0x1f

    .line 423
    .line 424
    const/16 v24, 0x8

    .line 425
    .line 426
    rsub-int/lit8 v14, v10, 0x8

    .line 427
    .line 428
    const/4 v10, 0x0

    .line 429
    :goto_f
    if-ge v10, v14, :cond_14

    .line 430
    .line 431
    and-long v11, v8, v18

    .line 432
    .line 433
    cmp-long v11, v11, v16

    .line 434
    .line 435
    if-gez v11, :cond_13

    .line 436
    .line 437
    shl-int/lit8 v11, v7, 0x3

    .line 438
    .line 439
    add-int/2addr v11, v10

    .line 440
    aget v12, v3, v11

    .line 441
    .line 442
    aget-object v11, v4, v11

    .line 443
    .line 444
    check-cast v11, Lds1;

    .line 445
    .line 446
    iget-object v11, v11, Lds1;->α:Lbs1;

    .line 447
    .line 448
    iget-object v13, v11, Lbs1;->δ:Lxr1;

    .line 449
    .line 450
    sget-object v15, Lfs1;->δ:Lis1;

    .line 451
    .line 452
    iget-object v13, v13, Lxr1;->ε:Lb21;

    .line 453
    .line 454
    invoke-virtual {v13, v15}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v13

    .line 458
    if-eqz v13, :cond_12

    .line 459
    .line 460
    invoke-virtual {v2, v12}, Lo11;->α(I)Z

    .line 461
    .line 462
    .line 463
    move-result v13

    .line 464
    if-eqz v13, :cond_12

    .line 465
    .line 466
    iget-object v13, v11, Lbs1;->δ:Lxr1;

    .line 467
    .line 468
    invoke-virtual {v13, v15}, Lxr1;->γ(Lis1;)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v13

    .line 472
    check-cast v13, Ljava/lang/String;

    .line 473
    .line 474
    const/16 v15, 0x10

    .line 475
    .line 476
    invoke-virtual {v0, v12, v15, v13}, Ll1;->Δ(IILjava/lang/String;)V

    .line 477
    .line 478
    .line 479
    :cond_12
    new-instance v13, Lcs1;

    .line 480
    .line 481
    invoke-virtual {v0}, Ll1;->σ()Lsm0;

    .line 482
    .line 483
    .line 484
    move-result-object v15

    .line 485
    invoke-direct {v13, v11, v15}, Lcs1;-><init>(Lbs1;Lsm0;)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v6, v12, v13}, Ln11;->η(ILjava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    :cond_13
    const/16 v11, 0x8

    .line 492
    .line 493
    shr-long/2addr v8, v11

    .line 494
    add-int/lit8 v10, v10, 0x1

    .line 495
    .line 496
    goto :goto_f

    .line 497
    :cond_14
    const/16 v11, 0x8

    .line 498
    .line 499
    if-ne v14, v11, :cond_16

    .line 500
    .line 501
    goto :goto_10

    .line 502
    :cond_15
    const/16 v11, 0x8

    .line 503
    .line 504
    :goto_10
    if-eq v7, v5, :cond_16

    .line 505
    .line 506
    add-int/lit8 v7, v7, 0x1

    .line 507
    .line 508
    goto :goto_e

    .line 509
    :cond_16
    new-instance v1, Lcs1;

    .line 510
    .line 511
    iget-object v2, v0, Ll1;->θ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 512
    .line 513
    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Les1;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    invoke-virtual {v2}, Les1;->α()Lbs1;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    invoke-virtual {v0}, Ll1;->σ()Lsm0;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    invoke-direct {v1, v2, v3}, Lcs1;-><init>(Lbs1;Lsm0;)V

    .line 526
    .line 527
    .line 528
    iput-object v1, v0, Ll1;->Λ:Lcs1;

    .line 529
    .line 530
    return-void
.end method

.method public final β(Landroid/view/View;)Ln;
    .locals 0

    .line 1
    iget-object p0, p0, Ll1;->ξ:Lf1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final κ(ILэ;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p2

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    iget-object v3, v3, Lэ;->α:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 12
    .line 13
    invoke-virtual {v0}, Ll1;->σ()Lsm0;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-virtual {v5, v1}, Lsm0;->β(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    check-cast v5, Lds1;

    .line 22
    .line 23
    if-eqz v5, :cond_25

    .line 24
    .line 25
    iget-object v5, v5, Lds1;->α:Lbs1;

    .line 26
    .line 27
    if-nez v5, :cond_0

    .line 28
    .line 29
    goto/16 :goto_15

    .line 30
    .line 31
    :cond_0
    iget-object v6, v5, Lbs1;->γ:Lyp0;

    .line 32
    .line 33
    iget-object v7, v5, Lbs1;->δ:Lxr1;

    .line 34
    .line 35
    iget-object v8, v7, Lxr1;->ε:Lb21;

    .line 36
    .line 37
    invoke-static {v5}, Ll1;->τ(Lbs1;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    iget-object v10, v0, Ll1;->Η:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v2, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v10

    .line 47
    const/4 v11, -0x1

    .line 48
    if-eqz v10, :cond_1

    .line 49
    .line 50
    iget-object v0, v0, Ll1;->Ε:Ll11;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ll11;->δ(I)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eq v0, v11, :cond_25

    .line 57
    .line 58
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_1
    iget-object v10, v0, Ll1;->Θ:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v2, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    if-eqz v10, :cond_2

    .line 73
    .line 74
    iget-object v0, v0, Ll1;->Ζ:Ll11;

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ll11;->δ(I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eq v0, v11, :cond_25

    .line 81
    .line 82
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_2
    sget-object v1, Lwr1;->α:Lis1;

    .line 91
    .line 92
    invoke-virtual {v8, v1}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    iget-object v10, v0, Ll1;->θ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 97
    .line 98
    const/4 v12, 0x0

    .line 99
    if-eqz v1, :cond_17

    .line 100
    .line 101
    if-eqz v4, :cond_17

    .line 102
    .line 103
    const-string v1, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"

    .line 104
    .line 105
    invoke-static {v2, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_17

    .line 110
    .line 111
    const-string v0, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX"

    .line 112
    .line 113
    invoke-virtual {v4, v0, v11}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    const-string v1, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH"

    .line 118
    .line 119
    invoke-virtual {v4, v1, v11}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-lez v1, :cond_16

    .line 124
    .line 125
    if-ltz v0, :cond_16

    .line 126
    .line 127
    if-eqz v9, :cond_3

    .line 128
    .line 129
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    goto :goto_0

    .line 134
    :cond_3
    const v4, 0x7fffffff

    .line 135
    .line 136
    .line 137
    :goto_0
    if-lt v0, v4, :cond_4

    .line 138
    .line 139
    goto/16 :goto_f

    .line 140
    .line 141
    :cond_4
    invoke-static {v7}, Lv71;->θ(Lxr1;)Lm32;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    if-nez v4, :cond_5

    .line 146
    .line 147
    goto/16 :goto_15

    .line 148
    .line 149
    :cond_5
    new-instance v6, Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 152
    .line 153
    .line 154
    const/4 v7, 0x0

    .line 155
    :goto_1
    if-ge v7, v1, :cond_15

    .line 156
    .line 157
    add-int v8, v0, v7

    .line 158
    .line 159
    iget-object v9, v4, Lm32;->α:Ll32;

    .line 160
    .line 161
    iget-object v9, v9, Ll32;->α:Lg4;

    .line 162
    .line 163
    iget-object v9, v9, Lg4;->ζ:Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 166
    .line 167
    .line 168
    move-result v9

    .line 169
    if-lt v8, v9, :cond_6

    .line 170
    .line 171
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move/from16 p0, v0

    .line 175
    .line 176
    move/from16 p4, v1

    .line 177
    .line 178
    move-object v14, v10

    .line 179
    goto/16 :goto_e

    .line 180
    .line 181
    :cond_6
    iget-object v9, v4, Lm32;->β:Lg11;

    .line 182
    .line 183
    iget-object v11, v9, Lg11;->γ:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v11, Lb8;

    .line 186
    .line 187
    iget-object v11, v11, Lb8;->β:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v11, Lg4;

    .line 190
    .line 191
    const/16 v15, 0x29

    .line 192
    .line 193
    const-string v12, "offset("

    .line 194
    .line 195
    if-ltz v8, :cond_7

    .line 196
    .line 197
    iget-object v14, v11, Lg4;->ζ:Ljava/lang/String;

    .line 198
    .line 199
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 200
    .line 201
    .line 202
    move-result v14

    .line 203
    if-ge v8, v14, :cond_7

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_7
    const-string v14, ") is out of bounds [0, "

    .line 207
    .line 208
    invoke-static {v8, v12, v14}, La12;->ζ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    move-result-object v14

    .line 212
    iget-object v11, v11, Lg4;->ζ:Ljava/lang/String;

    .line 213
    .line 214
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 215
    .line 216
    .line 217
    move-result v11

    .line 218
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v11

    .line 228
    invoke-static {v11}, Lbm0;->α(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    :goto_2
    iget-object v9, v9, Lg11;->ε:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v9, Ljava/util/ArrayList;

    .line 234
    .line 235
    invoke-static {v8, v9}, Lbd;->ο(ILjava/util/List;)I

    .line 236
    .line 237
    .line 238
    move-result v11

    .line 239
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v9

    .line 243
    check-cast v9, Lm91;

    .line 244
    .line 245
    iget-object v11, v9, Lm91;->α:Ls2;

    .line 246
    .line 247
    invoke-virtual {v9, v8}, Lm91;->α(I)I

    .line 248
    .line 249
    .line 250
    move-result v8

    .line 251
    iget-object v14, v11, Ls2;->ε:Ljava/lang/CharSequence;

    .line 252
    .line 253
    if-ltz v8, :cond_8

    .line 254
    .line 255
    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    .line 256
    .line 257
    .line 258
    move-result v13

    .line 259
    if-ge v8, v13, :cond_8

    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_8
    const-string v13, ") is out of bounds [0,"

    .line 263
    .line 264
    invoke-static {v8, v12, v13}, La12;->ζ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    move-result-object v12

    .line 268
    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    .line 269
    .line 270
    .line 271
    move-result v13

    .line 272
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v12

    .line 282
    invoke-static {v12}, Lbm0;->α(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    :goto_3
    iget-object v11, v11, Ls2;->δ:Lk32;

    .line 286
    .line 287
    iget-object v12, v11, Lk32;->ε:Landroid/text/Layout;

    .line 288
    .line 289
    invoke-virtual {v12, v8}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 290
    .line 291
    .line 292
    move-result v13

    .line 293
    invoke-virtual {v11, v13}, Lk32;->ζ(I)F

    .line 294
    .line 295
    .line 296
    move-result v14

    .line 297
    invoke-virtual {v11, v13}, Lk32;->δ(I)F

    .line 298
    .line 299
    .line 300
    move-result v15

    .line 301
    invoke-virtual {v12, v13}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 302
    .line 303
    .line 304
    move-result v13

    .line 305
    move/from16 p0, v0

    .line 306
    .line 307
    const/4 v0, 0x1

    .line 308
    if-ne v13, v0, :cond_9

    .line 309
    .line 310
    move v13, v0

    .line 311
    goto :goto_4

    .line 312
    :cond_9
    const/4 v13, 0x0

    .line 313
    :goto_4
    invoke-virtual {v12, v8}, Landroid/text/Layout;->isRtlCharAt(I)Z

    .line 314
    .line 315
    .line 316
    move-result v12

    .line 317
    if-eqz v13, :cond_a

    .line 318
    .line 319
    if-nez v12, :cond_a

    .line 320
    .line 321
    const/4 v0, 0x0

    .line 322
    invoke-virtual {v11, v8, v0}, Lk32;->η(IZ)F

    .line 323
    .line 324
    .line 325
    move-result v12

    .line 326
    add-int/lit8 v8, v8, 0x1

    .line 327
    .line 328
    const/4 v13, 0x1

    .line 329
    invoke-virtual {v11, v8, v13}, Lk32;->η(IZ)F

    .line 330
    .line 331
    .line 332
    move-result v8

    .line 333
    goto :goto_6

    .line 334
    :cond_a
    const/4 v0, 0x0

    .line 335
    if-eqz v13, :cond_b

    .line 336
    .line 337
    if-eqz v12, :cond_b

    .line 338
    .line 339
    invoke-virtual {v11, v8, v0}, Lk32;->θ(IZ)F

    .line 340
    .line 341
    .line 342
    move-result v12

    .line 343
    add-int/lit8 v8, v8, 0x1

    .line 344
    .line 345
    const/4 v13, 0x1

    .line 346
    invoke-virtual {v11, v8, v13}, Lk32;->θ(IZ)F

    .line 347
    .line 348
    .line 349
    move-result v8

    .line 350
    :goto_5
    move/from16 v21, v12

    .line 351
    .line 352
    move v12, v8

    .line 353
    move/from16 v8, v21

    .line 354
    .line 355
    goto :goto_6

    .line 356
    :cond_b
    const/4 v13, 0x1

    .line 357
    if-eqz v12, :cond_c

    .line 358
    .line 359
    invoke-virtual {v11, v8, v0}, Lk32;->η(IZ)F

    .line 360
    .line 361
    .line 362
    move-result v12

    .line 363
    add-int/lit8 v8, v8, 0x1

    .line 364
    .line 365
    invoke-virtual {v11, v8, v13}, Lk32;->η(IZ)F

    .line 366
    .line 367
    .line 368
    move-result v8

    .line 369
    goto :goto_5

    .line 370
    :cond_c
    invoke-virtual {v11, v8, v0}, Lk32;->θ(IZ)F

    .line 371
    .line 372
    .line 373
    move-result v12

    .line 374
    add-int/lit8 v8, v8, 0x1

    .line 375
    .line 376
    invoke-virtual {v11, v8, v13}, Lk32;->θ(IZ)F

    .line 377
    .line 378
    .line 379
    move-result v8

    .line 380
    :goto_6
    new-instance v0, Landroid/graphics/RectF;

    .line 381
    .line 382
    invoke-direct {v0, v12, v14, v8, v15}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 383
    .line 384
    .line 385
    iget v8, v0, Landroid/graphics/RectF;->left:F

    .line 386
    .line 387
    iget v11, v0, Landroid/graphics/RectF;->top:F

    .line 388
    .line 389
    iget v12, v0, Landroid/graphics/RectF;->right:F

    .line 390
    .line 391
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 392
    .line 393
    iget v9, v9, Lm91;->ζ:F

    .line 394
    .line 395
    const/4 v13, 0x0

    .line 396
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 397
    .line 398
    .line 399
    move-result v13

    .line 400
    int-to-long v13, v13

    .line 401
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 402
    .line 403
    .line 404
    move-result v9

    .line 405
    move v15, v0

    .line 406
    move/from16 p4, v1

    .line 407
    .line 408
    int-to-long v0, v9

    .line 409
    const/16 v9, 0x20

    .line 410
    .line 411
    shl-long/2addr v13, v9

    .line 412
    const-wide v16, 0xffffffffL

    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    and-long v0, v0, v16

    .line 418
    .line 419
    or-long/2addr v0, v13

    .line 420
    new-instance v13, Lml1;

    .line 421
    .line 422
    move/from16 v18, v9

    .line 423
    .line 424
    move-object v14, v10

    .line 425
    shr-long v9, v0, v18

    .line 426
    .line 427
    long-to-int v9, v9

    .line 428
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 429
    .line 430
    .line 431
    move-result v10

    .line 432
    add-float/2addr v10, v8

    .line 433
    and-long v0, v0, v16

    .line 434
    .line 435
    long-to-int v0, v0

    .line 436
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 437
    .line 438
    .line 439
    move-result v1

    .line 440
    add-float/2addr v1, v11

    .line 441
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 442
    .line 443
    .line 444
    move-result v8

    .line 445
    add-float/2addr v8, v12

    .line 446
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 447
    .line 448
    .line 449
    move-result v0

    .line 450
    add-float/2addr v0, v15

    .line 451
    invoke-direct {v13, v10, v1, v8, v0}, Lml1;-><init>(FFFF)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v5}, Lbs1;->δ()Lq31;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    const-wide/16 v8, 0x0

    .line 459
    .line 460
    if-eqz v0, :cond_e

    .line 461
    .line 462
    invoke-virtual {v0}, Lq31;->Х()Lq01;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    iget-boolean v1, v1, Lq01;->σ:Z

    .line 467
    .line 468
    if-eqz v1, :cond_d

    .line 469
    .line 470
    goto :goto_7

    .line 471
    :cond_d
    const/4 v0, 0x0

    .line 472
    :goto_7
    if-eqz v0, :cond_e

    .line 473
    .line 474
    invoke-virtual {v0, v8, v9}, Lq31;->ｂ(J)J

    .line 475
    .line 476
    .line 477
    move-result-wide v8

    .line 478
    :cond_e
    invoke-virtual {v13, v8, v9}, Lml1;->ε(J)Lml1;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    invoke-virtual {v5}, Lbs1;->η()Lml1;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    iget v8, v0, Lml1;->α:F

    .line 487
    .line 488
    iget v9, v1, Lml1;->γ:F

    .line 489
    .line 490
    cmpg-float v8, v8, v9

    .line 491
    .line 492
    if-gez v8, :cond_f

    .line 493
    .line 494
    const/4 v8, 0x1

    .line 495
    goto :goto_8

    .line 496
    :cond_f
    const/4 v8, 0x0

    .line 497
    :goto_8
    iget v9, v1, Lml1;->α:F

    .line 498
    .line 499
    iget v10, v0, Lml1;->γ:F

    .line 500
    .line 501
    cmpg-float v9, v9, v10

    .line 502
    .line 503
    if-gez v9, :cond_10

    .line 504
    .line 505
    const/4 v9, 0x1

    .line 506
    goto :goto_9

    .line 507
    :cond_10
    const/4 v9, 0x0

    .line 508
    :goto_9
    and-int/2addr v8, v9

    .line 509
    iget v9, v0, Lml1;->β:F

    .line 510
    .line 511
    iget v10, v1, Lml1;->δ:F

    .line 512
    .line 513
    cmpg-float v9, v9, v10

    .line 514
    .line 515
    if-gez v9, :cond_11

    .line 516
    .line 517
    const/4 v9, 0x1

    .line 518
    goto :goto_a

    .line 519
    :cond_11
    const/4 v9, 0x0

    .line 520
    :goto_a
    and-int/2addr v8, v9

    .line 521
    iget v9, v1, Lml1;->β:F

    .line 522
    .line 523
    iget v10, v0, Lml1;->δ:F

    .line 524
    .line 525
    cmpg-float v9, v9, v10

    .line 526
    .line 527
    if-gez v9, :cond_12

    .line 528
    .line 529
    const/4 v9, 0x1

    .line 530
    goto :goto_b

    .line 531
    :cond_12
    const/4 v9, 0x0

    .line 532
    :goto_b
    and-int/2addr v8, v9

    .line 533
    if-eqz v8, :cond_13

    .line 534
    .line 535
    invoke-virtual {v0, v1}, Lml1;->γ(Lml1;)Lml1;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    goto :goto_c

    .line 540
    :cond_13
    const/4 v0, 0x0

    .line 541
    :goto_c
    if-eqz v0, :cond_14

    .line 542
    .line 543
    iget v1, v0, Lml1;->α:F

    .line 544
    .line 545
    iget v8, v0, Lml1;->β:F

    .line 546
    .line 547
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 548
    .line 549
    .line 550
    move-result v1

    .line 551
    int-to-long v9, v1

    .line 552
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 553
    .line 554
    .line 555
    move-result v1

    .line 556
    int-to-long v11, v1

    .line 557
    shl-long v8, v9, v18

    .line 558
    .line 559
    and-long v10, v11, v16

    .line 560
    .line 561
    or-long/2addr v8, v10

    .line 562
    invoke-virtual {v14, v8, v9}, Landroidx/compose/ui/platform/AndroidComposeView;->τ(J)J

    .line 563
    .line 564
    .line 565
    move-result-wide v8

    .line 566
    iget v1, v0, Lml1;->γ:F

    .line 567
    .line 568
    iget v0, v0, Lml1;->δ:F

    .line 569
    .line 570
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 571
    .line 572
    .line 573
    move-result v1

    .line 574
    int-to-long v10, v1

    .line 575
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 576
    .line 577
    .line 578
    move-result v0

    .line 579
    int-to-long v0, v0

    .line 580
    shl-long v10, v10, v18

    .line 581
    .line 582
    and-long v0, v0, v16

    .line 583
    .line 584
    or-long/2addr v0, v10

    .line 585
    invoke-virtual {v14, v0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->τ(J)J

    .line 586
    .line 587
    .line 588
    move-result-wide v0

    .line 589
    new-instance v10, Landroid/graphics/RectF;

    .line 590
    .line 591
    shr-long v11, v8, v18

    .line 592
    .line 593
    long-to-int v11, v11

    .line 594
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 595
    .line 596
    .line 597
    move-result v12

    .line 598
    move-wide/from16 v19, v0

    .line 599
    .line 600
    shr-long v0, v19, v18

    .line 601
    .line 602
    long-to-int v0, v0

    .line 603
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 604
    .line 605
    .line 606
    move-result v1

    .line 607
    invoke-static {v12, v1}, Ljava/lang/Math;->min(FF)F

    .line 608
    .line 609
    .line 610
    move-result v1

    .line 611
    and-long v8, v8, v16

    .line 612
    .line 613
    long-to-int v8, v8

    .line 614
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 615
    .line 616
    .line 617
    move-result v9

    .line 618
    and-long v12, v19, v16

    .line 619
    .line 620
    long-to-int v12, v12

    .line 621
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 622
    .line 623
    .line 624
    move-result v13

    .line 625
    invoke-static {v9, v13}, Ljava/lang/Math;->min(FF)F

    .line 626
    .line 627
    .line 628
    move-result v9

    .line 629
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 630
    .line 631
    .line 632
    move-result v11

    .line 633
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 634
    .line 635
    .line 636
    move-result v0

    .line 637
    invoke-static {v11, v0}, Ljava/lang/Math;->max(FF)F

    .line 638
    .line 639
    .line 640
    move-result v0

    .line 641
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 642
    .line 643
    .line 644
    move-result v8

    .line 645
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 646
    .line 647
    .line 648
    move-result v11

    .line 649
    invoke-static {v8, v11}, Ljava/lang/Math;->max(FF)F

    .line 650
    .line 651
    .line 652
    move-result v8

    .line 653
    invoke-direct {v10, v1, v9, v0, v8}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 654
    .line 655
    .line 656
    goto :goto_d

    .line 657
    :cond_14
    const/4 v10, 0x0

    .line 658
    :goto_d
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    :goto_e
    add-int/lit8 v7, v7, 0x1

    .line 662
    .line 663
    move/from16 v0, p0

    .line 664
    .line 665
    move/from16 v1, p4

    .line 666
    .line 667
    move-object v10, v14

    .line 668
    const/4 v12, 0x0

    .line 669
    goto/16 :goto_1

    .line 670
    .line 671
    :cond_15
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    const/4 v1, 0x0

    .line 676
    new-array v1, v1, [Landroid/graphics/RectF;

    .line 677
    .line 678
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object v1

    .line 682
    check-cast v1, [Landroid/os/Parcelable;

    .line 683
    .line 684
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 685
    .line 686
    .line 687
    return-void

    .line 688
    :cond_16
    :goto_f
    const-string v0, "AccessibilityDelegate"

    .line 689
    .line 690
    const-string v1, "Invalid arguments for accessibility character locations"

    .line 691
    .line 692
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 693
    .line 694
    .line 695
    return-void

    .line 696
    :cond_17
    move-object v14, v10

    .line 697
    sget-object v1, Lfs1;->ω:Lis1;

    .line 698
    .line 699
    invoke-virtual {v8, v1}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 700
    .line 701
    .line 702
    move-result v7

    .line 703
    if-eqz v7, :cond_19

    .line 704
    .line 705
    if-eqz v4, :cond_19

    .line 706
    .line 707
    const-string v4, "androidx.compose.ui.semantics.testTag"

    .line 708
    .line 709
    invoke-static {v2, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 710
    .line 711
    .line 712
    move-result v4

    .line 713
    if-eqz v4, :cond_19

    .line 714
    .line 715
    invoke-virtual {v8, v1}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    if-nez v0, :cond_18

    .line 720
    .line 721
    const/4 v12, 0x0

    .line 722
    goto :goto_10

    .line 723
    :cond_18
    move-object v12, v0

    .line 724
    :goto_10
    check-cast v12, Ljava/lang/String;

    .line 725
    .line 726
    if-eqz v12, :cond_25

    .line 727
    .line 728
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 729
    .line 730
    .line 731
    move-result-object v0

    .line 732
    invoke-virtual {v0, v2, v12}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 733
    .line 734
    .line 735
    return-void

    .line 736
    :cond_19
    const-string v1, "androidx.compose.ui.semantics.id"

    .line 737
    .line 738
    invoke-static {v2, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 739
    .line 740
    .line 741
    move-result v1

    .line 742
    if-eqz v1, :cond_1a

    .line 743
    .line 744
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    iget v1, v5, Lbs1;->ζ:I

    .line 749
    .line 750
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 751
    .line 752
    .line 753
    return-void

    .line 754
    :cond_1a
    const-string v1, "androidx.compose.ui.semantics.shapeType"

    .line 755
    .line 756
    invoke-static {v2, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 757
    .line 758
    .line 759
    move-result v4

    .line 760
    const-string v7, "androidx.compose.ui.semantics.shapeRegion"

    .line 761
    .line 762
    const-string v9, "androidx.compose.ui.semantics.shapeCorners"

    .line 763
    .line 764
    const-string v10, "androidx.compose.ui.semantics.shapeRect"

    .line 765
    .line 766
    if-eqz v4, :cond_1f

    .line 767
    .line 768
    sget-object v2, Lfs1;->Ξ:Lis1;

    .line 769
    .line 770
    invoke-virtual {v8, v2}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v2

    .line 774
    if-nez v2, :cond_1b

    .line 775
    .line 776
    const/4 v12, 0x0

    .line 777
    goto :goto_11

    .line 778
    :cond_1b
    move-object v12, v2

    .line 779
    :goto_11
    check-cast v12, Liv1;

    .line 780
    .line 781
    if-eqz v12, :cond_25

    .line 782
    .line 783
    new-instance v2, Landroid/graphics/Rect;

    .line 784
    .line 785
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 786
    .line 787
    .line 788
    invoke-virtual {v3, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 789
    .line 790
    .line 791
    invoke-virtual {v0, v5, v2, v12}, Ll1;->υ(Lbs1;Landroid/graphics/Rect;Liv1;)Lml1;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    iget v2, v0, Lml1;->β:F

    .line 796
    .line 797
    iget v4, v0, Lml1;->α:F

    .line 798
    .line 799
    move-object v11, v14

    .line 800
    invoke-virtual {v0}, Lml1;->β()J

    .line 801
    .line 802
    .line 803
    move-result-wide v13

    .line 804
    iget-object v0, v6, Lyp0;->Δ:Lnp0;

    .line 805
    .line 806
    invoke-virtual {v11}, Landroidx/compose/ui/platform/AndroidComposeView;->getDensity()Lyr;

    .line 807
    .line 808
    .line 809
    move-result-object v5

    .line 810
    invoke-interface {v12, v13, v14, v0, v5}, Liv1;->α(JLnp0;Lyr;)Lu81;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    instance-of v5, v0, Ls81;

    .line 815
    .line 816
    if-eqz v5, :cond_1c

    .line 817
    .line 818
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 819
    .line 820
    .line 821
    move-result-object v5

    .line 822
    const/4 v6, 0x0

    .line 823
    invoke-virtual {v5, v1, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 824
    .line 825
    .line 826
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 827
    .line 828
    .line 829
    move-result-object v1

    .line 830
    invoke-static {v0, v4, v2}, Ll1;->Ι(Lu81;FF)Landroid/graphics/Rect;

    .line 831
    .line 832
    .line 833
    move-result-object v0

    .line 834
    invoke-virtual {v1, v10, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 835
    .line 836
    .line 837
    return-void

    .line 838
    :cond_1c
    instance-of v5, v0, Lt81;

    .line 839
    .line 840
    if-eqz v5, :cond_1d

    .line 841
    .line 842
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 843
    .line 844
    .line 845
    move-result-object v5

    .line 846
    const/4 v13, 0x1

    .line 847
    invoke-virtual {v5, v1, v13}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 848
    .line 849
    .line 850
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 851
    .line 852
    .line 853
    move-result-object v1

    .line 854
    invoke-static {v0, v4, v2}, Ll1;->Ι(Lu81;FF)Landroid/graphics/Rect;

    .line 855
    .line 856
    .line 857
    move-result-object v2

    .line 858
    invoke-virtual {v1, v10, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 859
    .line 860
    .line 861
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 862
    .line 863
    .line 864
    move-result-object v1

    .line 865
    invoke-static {v0}, Ll1;->Λ(Lu81;)[F

    .line 866
    .line 867
    .line 868
    move-result-object v0

    .line 869
    invoke-virtual {v1, v9, v0}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V

    .line 870
    .line 871
    .line 872
    return-void

    .line 873
    :cond_1d
    instance-of v5, v0, Lr81;

    .line 874
    .line 875
    if-eqz v5, :cond_1e

    .line 876
    .line 877
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 878
    .line 879
    .line 880
    move-result-object v5

    .line 881
    const/4 v6, 0x2

    .line 882
    invoke-virtual {v5, v1, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 883
    .line 884
    .line 885
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 886
    .line 887
    .line 888
    move-result-object v1

    .line 889
    invoke-static {v0, v4, v2}, Ll1;->Μ(Lu81;FF)Landroid/graphics/Region;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    invoke-virtual {v1, v7, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 894
    .line 895
    .line 896
    return-void

    .line 897
    :cond_1e
    invoke-static {}, Lγ;->κ()V

    .line 898
    .line 899
    .line 900
    return-void

    .line 901
    :cond_1f
    move-object v11, v14

    .line 902
    invoke-static {v2, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 903
    .line 904
    .line 905
    move-result v1

    .line 906
    if-eqz v1, :cond_21

    .line 907
    .line 908
    sget-object v1, Lfs1;->Ξ:Lis1;

    .line 909
    .line 910
    invoke-virtual {v8, v1}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 911
    .line 912
    .line 913
    move-result-object v1

    .line 914
    if-nez v1, :cond_20

    .line 915
    .line 916
    const/4 v12, 0x0

    .line 917
    goto :goto_12

    .line 918
    :cond_20
    move-object v12, v1

    .line 919
    :goto_12
    check-cast v12, Liv1;

    .line 920
    .line 921
    if-eqz v12, :cond_25

    .line 922
    .line 923
    new-instance v1, Landroid/graphics/Rect;

    .line 924
    .line 925
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 926
    .line 927
    .line 928
    invoke-virtual {v3, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 929
    .line 930
    .line 931
    invoke-virtual {v0, v5, v1, v12}, Ll1;->υ(Lbs1;Landroid/graphics/Rect;Liv1;)Lml1;

    .line 932
    .line 933
    .line 934
    move-result-object v0

    .line 935
    invoke-virtual {v0}, Lml1;->β()J

    .line 936
    .line 937
    .line 938
    move-result-wide v1

    .line 939
    iget-object v4, v6, Lyp0;->Δ:Lnp0;

    .line 940
    .line 941
    invoke-virtual {v11}, Landroidx/compose/ui/platform/AndroidComposeView;->getDensity()Lyr;

    .line 942
    .line 943
    .line 944
    move-result-object v5

    .line 945
    invoke-interface {v12, v1, v2, v4, v5}, Liv1;->α(JLnp0;Lyr;)Lu81;

    .line 946
    .line 947
    .line 948
    move-result-object v1

    .line 949
    iget v2, v0, Lml1;->α:F

    .line 950
    .line 951
    iget v0, v0, Lml1;->β:F

    .line 952
    .line 953
    invoke-static {v1, v2, v0}, Ll1;->Ι(Lu81;FF)Landroid/graphics/Rect;

    .line 954
    .line 955
    .line 956
    move-result-object v0

    .line 957
    if-eqz v0, :cond_25

    .line 958
    .line 959
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 960
    .line 961
    .line 962
    move-result-object v1

    .line 963
    invoke-virtual {v1, v10, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 964
    .line 965
    .line 966
    return-void

    .line 967
    :cond_21
    invoke-static {v2, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 968
    .line 969
    .line 970
    move-result v1

    .line 971
    if-eqz v1, :cond_23

    .line 972
    .line 973
    sget-object v1, Lfs1;->Ξ:Lis1;

    .line 974
    .line 975
    invoke-virtual {v8, v1}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 976
    .line 977
    .line 978
    move-result-object v1

    .line 979
    if-nez v1, :cond_22

    .line 980
    .line 981
    const/4 v12, 0x0

    .line 982
    goto :goto_13

    .line 983
    :cond_22
    move-object v12, v1

    .line 984
    :goto_13
    check-cast v12, Liv1;

    .line 985
    .line 986
    if-eqz v12, :cond_25

    .line 987
    .line 988
    new-instance v1, Landroid/graphics/Rect;

    .line 989
    .line 990
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 991
    .line 992
    .line 993
    invoke-virtual {v3, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 994
    .line 995
    .line 996
    invoke-virtual {v0, v5, v1, v12}, Ll1;->υ(Lbs1;Landroid/graphics/Rect;Liv1;)Lml1;

    .line 997
    .line 998
    .line 999
    move-result-object v0

    .line 1000
    invoke-virtual {v0}, Lml1;->β()J

    .line 1001
    .line 1002
    .line 1003
    move-result-wide v0

    .line 1004
    iget-object v2, v6, Lyp0;->Δ:Lnp0;

    .line 1005
    .line 1006
    invoke-virtual {v11}, Landroidx/compose/ui/platform/AndroidComposeView;->getDensity()Lyr;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v4

    .line 1010
    invoke-interface {v12, v0, v1, v2, v4}, Liv1;->α(JLnp0;Lyr;)Lu81;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v0

    .line 1014
    invoke-static {v0}, Ll1;->Λ(Lu81;)[F

    .line 1015
    .line 1016
    .line 1017
    move-result-object v0

    .line 1018
    if-eqz v0, :cond_25

    .line 1019
    .line 1020
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v1

    .line 1024
    invoke-virtual {v1, v9, v0}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V

    .line 1025
    .line 1026
    .line 1027
    return-void

    .line 1028
    :cond_23
    invoke-static {v2, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1029
    .line 1030
    .line 1031
    move-result v1

    .line 1032
    if-eqz v1, :cond_25

    .line 1033
    .line 1034
    sget-object v1, Lfs1;->Ξ:Lis1;

    .line 1035
    .line 1036
    invoke-virtual {v8, v1}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v1

    .line 1040
    if-nez v1, :cond_24

    .line 1041
    .line 1042
    const/4 v12, 0x0

    .line 1043
    goto :goto_14

    .line 1044
    :cond_24
    move-object v12, v1

    .line 1045
    :goto_14
    check-cast v12, Liv1;

    .line 1046
    .line 1047
    if-eqz v12, :cond_25

    .line 1048
    .line 1049
    new-instance v1, Landroid/graphics/Rect;

    .line 1050
    .line 1051
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {v3, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual {v0, v5, v1, v12}, Ll1;->υ(Lbs1;Landroid/graphics/Rect;Liv1;)Lml1;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v0

    .line 1061
    invoke-virtual {v0}, Lml1;->β()J

    .line 1062
    .line 1063
    .line 1064
    move-result-wide v1

    .line 1065
    iget-object v4, v6, Lyp0;->Δ:Lnp0;

    .line 1066
    .line 1067
    invoke-virtual {v11}, Landroidx/compose/ui/platform/AndroidComposeView;->getDensity()Lyr;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v5

    .line 1071
    invoke-interface {v12, v1, v2, v4, v5}, Liv1;->α(JLnp0;Lyr;)Lu81;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v1

    .line 1075
    iget v2, v0, Lml1;->α:F

    .line 1076
    .line 1077
    iget v0, v0, Lml1;->β:F

    .line 1078
    .line 1079
    invoke-static {v1, v2, v0}, Ll1;->Μ(Lu81;FF)Landroid/graphics/Region;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v0

    .line 1083
    if-eqz v0, :cond_25

    .line 1084
    .line 1085
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v1

    .line 1089
    invoke-virtual {v1, v7, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1090
    .line 1091
    .line 1092
    :cond_25
    :goto_15
    return-void
.end method

.method public final λ(Lpp;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, Lh1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lh1;

    .line 11
    .line 12
    iget v3, v2, Lh1;->μ:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lh1;->μ:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lh1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lh1;-><init>(Ll1;Lpp;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lh1;->κ:Ljava/lang/Object;

    .line 30
    .line 31
    iget v3, v2, Lh1;->μ:I

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    iget-object v5, v0, Ll1;->ψ:Ld7;

    .line 35
    .line 36
    const/4 v6, 0x1

    .line 37
    sget-object v7, Lcq;->ε:Lcq;

    .line 38
    .line 39
    if-eqz v3, :cond_3

    .line 40
    .line 41
    if-eq v3, v6, :cond_2

    .line 42
    .line 43
    if-ne v3, v4, :cond_1

    .line 44
    .line 45
    iget-object v3, v2, Lh1;->ι:Lvc;

    .line 46
    .line 47
    iget-object v8, v2, Lh1;->θ:Lo11;

    .line 48
    .line 49
    :try_start_0
    invoke-static {v1}, Li81;->Β(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    move v1, v4

    .line 53
    move-object/from16 p1, v5

    .line 54
    .line 55
    move v11, v6

    .line 56
    move-object v5, v7

    .line 57
    goto/16 :goto_8

    .line 58
    .line 59
    :catchall_0
    move-exception v0

    .line 60
    move-object/from16 p1, v5

    .line 61
    .line 62
    goto/16 :goto_9

    .line 63
    .line 64
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    return-object v0

    .line 71
    :cond_2
    iget-object v3, v2, Lh1;->ι:Lvc;

    .line 72
    .line 73
    iget-object v8, v2, Lh1;->θ:Lo11;

    .line 74
    .line 75
    :try_start_1
    invoke-static {v1}, Li81;->Β(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    invoke-static {v1}, Li81;->Β(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :try_start_2
    new-instance v1, Lo11;

    .line 83
    .line 84
    invoke-direct {v1}, Lo11;-><init>()V

    .line 85
    .line 86
    .line 87
    iget-object v3, v0, Ll1;->ω:Lwc;

    .line 88
    .line 89
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    new-instance v8, Lvc;

    .line 93
    .line 94
    invoke-direct {v8, v3}, Lvc;-><init>(Lwc;)V

    .line 95
    .line 96
    .line 97
    :goto_1
    iput-object v1, v2, Lh1;->θ:Lo11;

    .line 98
    .line 99
    iput-object v8, v2, Lh1;->ι:Lvc;

    .line 100
    .line 101
    iput v6, v2, Lh1;->μ:I

    .line 102
    .line 103
    invoke-virtual {v8, v2}, Lvc;->β(Lpp;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    if-ne v3, v7, :cond_4

    .line 108
    .line 109
    move-object v5, v7

    .line 110
    goto/16 :goto_7

    .line 111
    .line 112
    :cond_4
    move-object/from16 v18, v8

    .line 113
    .line 114
    move-object v8, v1

    .line 115
    move-object v1, v3

    .line 116
    move-object/from16 v3, v18

    .line 117
    .line 118
    :goto_2
    check-cast v1, Ljava/lang/Boolean;

    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_e

    .line 125
    .line 126
    invoke-virtual {v3}, Lvc;->γ()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Ll1;->φ()Z

    .line 130
    .line 131
    .line 132
    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 133
    iget-object v9, v0, Ll1;->σ:Ln11;

    .line 134
    .line 135
    iget-object v10, v0, Ll1;->ρ:Ln11;

    .line 136
    .line 137
    if-eqz v1, :cond_c

    .line 138
    .line 139
    :try_start_3
    iget v1, v5, Ld7;->η:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 140
    .line 141
    const/4 v11, 0x0

    .line 142
    move v12, v11

    .line 143
    :goto_3
    iget-object v13, v0, Ll1;->θ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 144
    .line 145
    if-ge v12, v1, :cond_9

    .line 146
    .line 147
    :try_start_4
    iget-object v14, v5, Ld7;->ζ:[Ljava/lang/Object;

    .line 148
    .line 149
    aget-object v14, v14, v12

    .line 150
    .line 151
    check-cast v14, Lyp0;

    .line 152
    .line 153
    invoke-virtual {v0, v14, v8}, Ll1;->Η(Lyp0;Lo11;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v14}, Lyp0;->Η()Z

    .line 157
    .line 158
    .line 159
    move-result v15

    .line 160
    if-nez v15, :cond_5

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_5
    invoke-virtual {v13}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui()Landroidx/compose/ui/platform/AndroidViewsHandler;

    .line 164
    .line 165
    .line 166
    move-result-object v13

    .line 167
    invoke-virtual {v13}, Landroidx/compose/ui/platform/AndroidViewsHandler;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 168
    .line 169
    .line 170
    move-result-object v13

    .line 171
    invoke-interface {v13, v14}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v13

    .line 175
    if-eqz v13, :cond_6

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_6
    iget v13, v14, Lyp0;->ζ:I

    .line 179
    .line 180
    invoke-virtual {v10, v13}, Lsm0;->β(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v14

    .line 184
    if-nez v14, :cond_8

    .line 185
    .line 186
    invoke-virtual {v9, v13}, Lsm0;->β(I)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v13

    .line 190
    if-nez v13, :cond_7

    .line 191
    .line 192
    :goto_4
    add-int/lit8 v12, v12, 0x1

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_7
    new-instance v0, Ljava/lang/ClassCastException;

    .line 196
    .line 197
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 198
    .line 199
    .line 200
    throw v0

    .line 201
    :cond_8
    new-instance v0, Ljava/lang/ClassCastException;

    .line 202
    .line 203
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 204
    .line 205
    .line 206
    throw v0

    .line 207
    :cond_9
    iput v11, v8, Lo11;->δ:I

    .line 208
    .line 209
    iget-object v1, v8, Lo11;->α:[J

    .line 210
    .line 211
    sget-object v11, Ltq1;->α:[J

    .line 212
    .line 213
    if-eq v1, v11, :cond_a

    .line 214
    .line 215
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    invoke-static {v11, v12, v1}, Lg7;->Φ(J[J)V

    .line 221
    .line 222
    .line 223
    iget-object v1, v8, Lo11;->α:[J

    .line 224
    .line 225
    iget v11, v8, Lo11;->γ:I

    .line 226
    .line 227
    shr-int/lit8 v12, v11, 0x3

    .line 228
    .line 229
    and-int/lit8 v11, v11, 0x7

    .line 230
    .line 231
    shl-int/lit8 v11, v11, 0x3

    .line 232
    .line 233
    aget-wide v14, v1, v12
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 234
    .line 235
    const-wide/16 v16, 0xff

    .line 236
    .line 237
    move-object/from16 p1, v5

    .line 238
    .line 239
    shl-long v4, v16, v11

    .line 240
    .line 241
    move-object/from16 v16, v7

    .line 242
    .line 243
    not-long v6, v4

    .line 244
    and-long/2addr v6, v14

    .line 245
    or-long/2addr v4, v6

    .line 246
    :try_start_5
    aput-wide v4, v1, v12

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_a
    move-object/from16 p1, v5

    .line 250
    .line 251
    move-object/from16 v16, v7

    .line 252
    .line 253
    :goto_5
    iget v1, v8, Lo11;->γ:I

    .line 254
    .line 255
    invoke-static {v1}, Ltq1;->α(I)I

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    iget v4, v8, Lo11;->δ:I

    .line 260
    .line 261
    sub-int/2addr v1, v4

    .line 262
    iput v1, v8, Lo11;->ε:I

    .line 263
    .line 264
    invoke-virtual {v13}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    iget-boolean v4, v0, Ll1;->Μ:Z

    .line 269
    .line 270
    if-nez v4, :cond_b

    .line 271
    .line 272
    if-eqz v1, :cond_b

    .line 273
    .line 274
    const/4 v11, 0x1

    .line 275
    iput-boolean v11, v0, Ll1;->Μ:Z

    .line 276
    .line 277
    iget-object v4, v0, Ll1;->Ξ:Lν;

    .line 278
    .line 279
    invoke-virtual {v1, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 280
    .line 281
    .line 282
    goto :goto_6

    .line 283
    :catchall_1
    move-exception v0

    .line 284
    goto :goto_9

    .line 285
    :cond_b
    const/4 v11, 0x1

    .line 286
    goto :goto_6

    .line 287
    :cond_c
    move-object/from16 p1, v5

    .line 288
    .line 289
    move v11, v6

    .line 290
    move-object/from16 v16, v7

    .line 291
    .line 292
    :goto_6
    invoke-virtual/range {p1 .. p1}, Ld7;->clear()V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v10}, Ln11;->γ()V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v9}, Ln11;->γ()V

    .line 299
    .line 300
    .line 301
    iget-wide v4, v0, Ll1;->μ:J

    .line 302
    .line 303
    iput-object v8, v2, Lh1;->θ:Lo11;

    .line 304
    .line 305
    iput-object v3, v2, Lh1;->ι:Lvc;

    .line 306
    .line 307
    const/4 v1, 0x2

    .line 308
    iput v1, v2, Lh1;->μ:I

    .line 309
    .line 310
    invoke-static {v4, v5, v2}, Ljx0;->τ(JLpp;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 314
    move-object/from16 v5, v16

    .line 315
    .line 316
    if-ne v4, v5, :cond_d

    .line 317
    .line 318
    :goto_7
    return-object v5

    .line 319
    :cond_d
    :goto_8
    move v4, v1

    .line 320
    move-object v7, v5

    .line 321
    move-object v1, v8

    .line 322
    move v6, v11

    .line 323
    move-object/from16 v5, p1

    .line 324
    .line 325
    move-object v8, v3

    .line 326
    goto/16 :goto_1

    .line 327
    .line 328
    :cond_e
    move-object/from16 p1, v5

    .line 329
    .line 330
    invoke-virtual/range {p1 .. p1}, Ld7;->clear()V

    .line 331
    .line 332
    .line 333
    sget-object v0, Ls62;->α:Ls62;

    .line 334
    .line 335
    return-object v0

    .line 336
    :goto_9
    invoke-virtual/range {p1 .. p1}, Ld7;->clear()V

    .line 337
    .line 338
    .line 339
    throw v0
.end method

.method public final μ(JZ)V
    .locals 20

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    move/from16 v2, p3

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    invoke-virtual {v3}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    goto/16 :goto_8

    .line 24
    .line 25
    :cond_0
    invoke-virtual/range {p0 .. p0}, Ll1;->σ()Lsm0;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1, v4, v5}, Lo41;->α(JJ)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-nez v4, :cond_d

    .line 39
    .line 40
    const-wide v4, 0x7fffffff7fffffffL

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    and-long/2addr v4, v0

    .line 46
    const-wide v6, 0x7fffff007fffffL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    add-long/2addr v4, v6

    .line 52
    const-wide v6, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    and-long/2addr v4, v6

    .line 58
    const-wide/16 v6, 0x0

    .line 59
    .line 60
    cmp-long v4, v4, v6

    .line 61
    .line 62
    if-nez v4, :cond_d

    .line 63
    .line 64
    const/4 v4, 0x1

    .line 65
    if-ne v2, v4, :cond_1

    .line 66
    .line 67
    sget-object v2, Lfs1;->χ:Lis1;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    if-nez v2, :cond_c

    .line 71
    .line 72
    sget-object v2, Lfs1;->φ:Lis1;

    .line 73
    .line 74
    :goto_0
    iget-object v5, v3, Lsm0;->γ:[Ljava/lang/Object;

    .line 75
    .line 76
    iget-object v3, v3, Lsm0;->α:[J

    .line 77
    .line 78
    array-length v6, v3

    .line 79
    add-int/lit8 v6, v6, -0x2

    .line 80
    .line 81
    if-ltz v6, :cond_d

    .line 82
    .line 83
    const/4 v8, 0x0

    .line 84
    :goto_1
    aget-wide v9, v3, v8

    .line 85
    .line 86
    not-long v11, v9

    .line 87
    const/4 v13, 0x7

    .line 88
    shl-long/2addr v11, v13

    .line 89
    and-long/2addr v11, v9

    .line 90
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    and-long/2addr v11, v13

    .line 96
    cmp-long v11, v11, v13

    .line 97
    .line 98
    if-eqz v11, :cond_b

    .line 99
    .line 100
    sub-int v11, v8, v6

    .line 101
    .line 102
    not-int v11, v11

    .line 103
    ushr-int/lit8 v11, v11, 0x1f

    .line 104
    .line 105
    const/16 v12, 0x8

    .line 106
    .line 107
    rsub-int/lit8 v11, v11, 0x8

    .line 108
    .line 109
    const/4 v13, 0x0

    .line 110
    :goto_2
    if-ge v13, v11, :cond_a

    .line 111
    .line 112
    const-wide/16 v14, 0xff

    .line 113
    .line 114
    and-long/2addr v14, v9

    .line 115
    const-wide/16 v16, 0x80

    .line 116
    .line 117
    cmp-long v14, v14, v16

    .line 118
    .line 119
    if-gez v14, :cond_9

    .line 120
    .line 121
    shl-int/lit8 v14, v8, 0x3

    .line 122
    .line 123
    add-int/2addr v14, v13

    .line 124
    aget-object v14, v5, v14

    .line 125
    .line 126
    check-cast v14, Lds1;

    .line 127
    .line 128
    iget-object v15, v14, Lds1;->β:Lym0;

    .line 129
    .line 130
    iget v4, v15, Lym0;->α:I

    .line 131
    .line 132
    int-to-float v4, v4

    .line 133
    iget v7, v15, Lym0;->β:I

    .line 134
    .line 135
    int-to-float v7, v7

    .line 136
    move/from16 v16, v12

    .line 137
    .line 138
    iget v12, v15, Lym0;->γ:I

    .line 139
    .line 140
    int-to-float v12, v12

    .line 141
    iget v15, v15, Lym0;->δ:I

    .line 142
    .line 143
    int-to-float v15, v15

    .line 144
    const/16 v17, 0x20

    .line 145
    .line 146
    shr-long v0, p1, v17

    .line 147
    .line 148
    long-to-int v0, v0

    .line 149
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    const-wide v17, 0xffffffffL

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    move/from16 v19, v0

    .line 159
    .line 160
    and-long v0, p1, v17

    .line 161
    .line 162
    long-to-int v0, v0

    .line 163
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    cmpl-float v1, v19, v4

    .line 168
    .line 169
    if-ltz v1, :cond_2

    .line 170
    .line 171
    const/4 v1, 0x1

    .line 172
    goto :goto_3

    .line 173
    :cond_2
    const/4 v1, 0x0

    .line 174
    :goto_3
    cmpg-float v4, v19, v12

    .line 175
    .line 176
    if-gez v4, :cond_3

    .line 177
    .line 178
    const/4 v4, 0x1

    .line 179
    goto :goto_4

    .line 180
    :cond_3
    const/4 v4, 0x0

    .line 181
    :goto_4
    and-int/2addr v1, v4

    .line 182
    cmpl-float v4, v0, v7

    .line 183
    .line 184
    if-ltz v4, :cond_4

    .line 185
    .line 186
    const/4 v4, 0x1

    .line 187
    goto :goto_5

    .line 188
    :cond_4
    const/4 v4, 0x0

    .line 189
    :goto_5
    and-int/2addr v1, v4

    .line 190
    cmpg-float v0, v0, v15

    .line 191
    .line 192
    if-gez v0, :cond_5

    .line 193
    .line 194
    const/4 v0, 0x1

    .line 195
    goto :goto_6

    .line 196
    :cond_5
    const/4 v0, 0x0

    .line 197
    :goto_6
    and-int/2addr v0, v1

    .line 198
    if-nez v0, :cond_6

    .line 199
    .line 200
    goto :goto_7

    .line 201
    :cond_6
    iget-object v0, v14, Lds1;->α:Lbs1;

    .line 202
    .line 203
    iget-object v0, v0, Lbs1;->δ:Lxr1;

    .line 204
    .line 205
    iget-object v0, v0, Lxr1;->ε:Lb21;

    .line 206
    .line 207
    invoke-virtual {v0, v2}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    if-nez v0, :cond_7

    .line 212
    .line 213
    const/4 v0, 0x0

    .line 214
    :cond_7
    if-nez v0, :cond_8

    .line 215
    .line 216
    goto :goto_7

    .line 217
    :cond_8
    invoke-static {}, Lγ;->β()V

    .line 218
    .line 219
    .line 220
    return-void

    .line 221
    :cond_9
    move/from16 v16, v12

    .line 222
    .line 223
    :goto_7
    shr-long v9, v9, v16

    .line 224
    .line 225
    add-int/lit8 v13, v13, 0x1

    .line 226
    .line 227
    move-wide/from16 v0, p1

    .line 228
    .line 229
    move/from16 v12, v16

    .line 230
    .line 231
    const/4 v4, 0x1

    .line 232
    goto :goto_2

    .line 233
    :cond_a
    move v0, v12

    .line 234
    if-ne v11, v0, :cond_d

    .line 235
    .line 236
    :cond_b
    if-eq v8, v6, :cond_d

    .line 237
    .line 238
    add-int/lit8 v8, v8, 0x1

    .line 239
    .line 240
    move-wide/from16 v0, p1

    .line 241
    .line 242
    const/4 v4, 0x1

    .line 243
    goto/16 :goto_1

    .line 244
    .line 245
    :cond_c
    invoke-static {}, Lγ;->κ()V

    .line 246
    .line 247
    .line 248
    :cond_d
    :goto_8
    return-void
.end method

.method public final ν()V
    .locals 2

    .line 1
    const-string v0, "sendAccessibilitySemanticsStructureChangeEvents"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, Ll1;->φ()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Ll1;->θ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Les1;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Les1;->α()Lbs1;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, Ll1;->Λ:Lcs1;

    .line 23
    .line 24
    invoke-virtual {p0, v0, v1}, Ll1;->ω(Lbs1;Lcs1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 28
    .line 29
    .line 30
    const-string v0, "sendSemanticsPropertyChangeEvents"

    .line 31
    .line 32
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :try_start_1
    invoke-virtual {p0}, Ll1;->σ()Lsm0;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p0, v0}, Ll1;->Ζ(Lsm0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 40
    .line 41
    .line 42
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 43
    .line 44
    .line 45
    const-string v0, "updateSemanticsNodesCopyAndPanes"

    .line 46
    .line 47
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :try_start_2
    invoke-virtual {p0}, Ll1;->Ξ()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 51
    .line 52
    .line 53
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 59
    .line 60
    .line 61
    throw p0

    .line 62
    :catchall_1
    move-exception p0

    .line 63
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 64
    .line 65
    .line 66
    throw p0

    .line 67
    :catchall_2
    move-exception p0

    .line 68
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 69
    .line 70
    .line 71
    throw p0
.end method

.method public final ξ(II)Landroid/view/accessibility/AccessibilityEvent;
    .locals 2

    .line 1
    invoke-static {p2}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setEnabled(Z)V

    .line 7
    .line 8
    .line 9
    const-string v0, "android.view.View"

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Ll1;->θ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, v0, p1}, Landroid/view/accessibility/AccessibilityRecord;->setSource(Landroid/view/View;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ll1;->φ()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Ll1;->σ()Lsm0;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0, p1}, Lsm0;->β(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Lds1;

    .line 45
    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    iget-object p0, p0, Lds1;->α:Lbs1;

    .line 49
    .line 50
    iget-object p1, p0, Lbs1;->δ:Lxr1;

    .line 51
    .line 52
    sget-object v0, Lfs1;->Κ:Lis1;

    .line 53
    .line 54
    iget-object p1, p1, Lxr1;->ε:Lb21;

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setPassword(Z)V

    .line 61
    .line 62
    .line 63
    iget-object p0, p0, Lbs1;->δ:Lxr1;

    .line 64
    .line 65
    sget-object p1, Lfs1;->ξ:Lis1;

    .line 66
    .line 67
    iget-object p0, p0, Lxr1;->ε:Lb21;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    if-nez p0, :cond_0

    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    :cond_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 83
    .line 84
    const/16 v0, 0x22

    .line 85
    .line 86
    if-lt p1, v0, :cond_1

    .line 87
    .line 88
    invoke-static {p2, p0}, Lп;->ι(Landroid/view/accessibility/AccessibilityEvent;Z)V

    .line 89
    .line 90
    .line 91
    :cond_1
    return-object p2
.end method

.method public final ο(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;
    .locals 1

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Ll1;->ξ(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    if-eqz p3, :cond_1

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 23
    .line 24
    .line 25
    :cond_1
    if-eqz p4, :cond_2

    .line 26
    .line 27
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    .line 32
    .line 33
    .line 34
    :cond_2
    if-eqz p5, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {p1, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_3
    return-object p0
.end method

.method public final π(Lbs1;)I
    .locals 2

    .line 1
    iget-object p1, p1, Lbs1;->δ:Lxr1;

    .line 2
    .line 3
    sget-object v0, Lfs1;->α:Lis1;

    .line 4
    .line 5
    iget-object v1, p1, Lxr1;->ε:Lb21;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lfs1;->Η:Lis1;

    .line 14
    .line 15
    iget-object v1, p1, Lxr1;->ε:Lb21;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lxr1;->γ(Lis1;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lr32;

    .line 28
    .line 29
    iget-wide p0, p0, Lr32;->α:J

    .line 30
    .line 31
    const-wide v0, 0xffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr p0, v0

    .line 37
    long-to-int p0, p0

    .line 38
    return p0

    .line 39
    :cond_0
    iget p0, p0, Ll1;->φ:I

    .line 40
    .line 41
    return p0
.end method

.method public final ρ(Lbs1;)I
    .locals 2

    .line 1
    iget-object p1, p1, Lbs1;->δ:Lxr1;

    .line 2
    .line 3
    sget-object v0, Lfs1;->α:Lis1;

    .line 4
    .line 5
    iget-object v1, p1, Lxr1;->ε:Lb21;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lfs1;->Η:Lis1;

    .line 14
    .line 15
    iget-object v1, p1, Lxr1;->ε:Lb21;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Lb21;->γ(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lxr1;->γ(Lis1;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lr32;

    .line 28
    .line 29
    iget-wide p0, p0, Lr32;->α:J

    .line 30
    .line 31
    const/16 v0, 0x20

    .line 32
    .line 33
    shr-long/2addr p0, v0

    .line 34
    long-to-int p0, p0

    .line 35
    return p0

    .line 36
    :cond_0
    iget p0, p0, Ll1;->φ:I

    .line 37
    .line 38
    return p0
.end method

.method public final σ()Lsm0;
    .locals 7

    .line 1
    iget-boolean v0, p0, Ll1;->Α:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Ll1;->Α:Z

    .line 7
    .line 8
    iget-object v0, p0, Ll1;->θ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Les1;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget-object v2, La1;->η:La1;

    .line 15
    .line 16
    invoke-static {v1, v2}, Lh62;->Χ(Les1;La80;)Ln11;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iput-object v1, p0, Ll1;->Γ:Ln11;

    .line 21
    .line 22
    invoke-virtual {p0}, Ll1;->φ()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    iget-object v1, p0, Ll1;->Γ:Ln11;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v2, p0, Ll1;->Ε:Ll11;

    .line 39
    .line 40
    invoke-virtual {v2}, Ll11;->α()V

    .line 41
    .line 42
    .line 43
    iget-object v3, p0, Ll1;->Ζ:Ll11;

    .line 44
    .line 45
    invoke-virtual {v3}, Ll11;->α()V

    .line 46
    .line 47
    .line 48
    const/4 v4, -0x1

    .line 49
    invoke-virtual {v1, v4}, Lsm0;->β(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    check-cast v4, Lds1;

    .line 54
    .line 55
    if-eqz v4, :cond_0

    .line 56
    .line 57
    iget-object v4, v4, Lds1;->α:Lbs1;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const/4 v4, 0x0

    .line 61
    :goto_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance v5, Lb0;

    .line 65
    .line 66
    const/4 v6, 0x4

    .line 67
    invoke-direct {v5, v6, v1}, Lb0;-><init>(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    new-instance v1, Lb0;

    .line 71
    .line 72
    const/4 v6, 0x5

    .line 73
    invoke-direct {v1, v6, v0}, Lb0;-><init>(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v4}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v4, v5, v1, v0}, Lks1;->β(Lbs1;Lb0;Lb0;Ljava/util/List;)Ljava/util/ArrayList;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    const/4 v4, 0x1

    .line 89
    sub-int/2addr v1, v4

    .line 90
    if-gt v4, v1, :cond_1

    .line 91
    .line 92
    :goto_1
    add-int/lit8 v5, v4, -0x1

    .line 93
    .line 94
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    check-cast v5, Lbs1;

    .line 99
    .line 100
    iget v5, v5, Lbs1;->ζ:I

    .line 101
    .line 102
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    check-cast v6, Lbs1;

    .line 107
    .line 108
    iget v6, v6, Lbs1;->ζ:I

    .line 109
    .line 110
    invoke-virtual {v2, v5, v6}, Ll11;->ζ(II)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v6, v5}, Ll11;->ζ(II)V

    .line 114
    .line 115
    .line 116
    if-eq v4, v1, :cond_1

    .line 117
    .line 118
    add-int/lit8 v4, v4, 0x1

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_1
    iget-object p0, p0, Ll1;->Γ:Ln11;

    .line 122
    .line 123
    return-object p0
.end method

.method public final υ(Lbs1;Landroid/graphics/Rect;Liv1;)Lml1;
    .locals 9

    .line 1
    new-instance v0, Li1;

    .line 2
    .line 3
    invoke-direct {v0, p3}, Li1;-><init>(Liv1;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lbs1;->γ:Lyp0;

    .line 7
    .line 8
    iget-object p3, p1, Lyp0;->Κ:Lk31;

    .line 9
    .line 10
    iget-object p3, p3, Lk31;->ζ:Lq01;

    .line 11
    .line 12
    iget v1, p3, Lq01;->θ:I

    .line 13
    .line 14
    and-int/lit8 v1, v1, 0x8

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x1

    .line 18
    const/4 v4, 0x0

    .line 19
    if-eqz v1, :cond_8

    .line 20
    .line 21
    :goto_0
    if-eqz p3, :cond_8

    .line 22
    .line 23
    iget v1, p3, Lq01;->η:I

    .line 24
    .line 25
    and-int/lit8 v1, v1, 0x8

    .line 26
    .line 27
    if-eqz v1, :cond_7

    .line 28
    .line 29
    move-object v1, p3

    .line 30
    move-object v5, v2

    .line 31
    :goto_1
    if-eqz v1, :cond_7

    .line 32
    .line 33
    instance-of v6, v1, Lzr1;

    .line 34
    .line 35
    if-eqz v6, :cond_0

    .line 36
    .line 37
    move-object v6, v1

    .line 38
    check-cast v6, Lzr1;

    .line 39
    .line 40
    invoke-interface {v6, v0}, Lzr1;->Ω(Ljs1;)V

    .line 41
    .line 42
    .line 43
    iget-boolean v6, v0, Li1;->ε:Z

    .line 44
    .line 45
    if-eqz v6, :cond_6

    .line 46
    .line 47
    move-object v2, v1

    .line 48
    goto :goto_4

    .line 49
    :cond_0
    iget v6, v1, Lq01;->η:I

    .line 50
    .line 51
    and-int/lit8 v6, v6, 0x8

    .line 52
    .line 53
    if-eqz v6, :cond_6

    .line 54
    .line 55
    instance-of v6, v1, Lya;

    .line 56
    .line 57
    if-eqz v6, :cond_6

    .line 58
    .line 59
    move-object v6, v1

    .line 60
    check-cast v6, Lya;

    .line 61
    .line 62
    iget-object v6, v6, Lya;->υ:Lq01;

    .line 63
    .line 64
    move v7, v4

    .line 65
    :goto_2
    if-eqz v6, :cond_5

    .line 66
    .line 67
    iget v8, v6, Lq01;->η:I

    .line 68
    .line 69
    and-int/lit8 v8, v8, 0x8

    .line 70
    .line 71
    if-eqz v8, :cond_4

    .line 72
    .line 73
    add-int/lit8 v7, v7, 0x1

    .line 74
    .line 75
    if-ne v7, v3, :cond_1

    .line 76
    .line 77
    move-object v1, v6

    .line 78
    goto :goto_3

    .line 79
    :cond_1
    if-nez v5, :cond_2

    .line 80
    .line 81
    new-instance v5, Lk21;

    .line 82
    .line 83
    const/16 v8, 0x10

    .line 84
    .line 85
    new-array v8, v8, [Lq01;

    .line 86
    .line 87
    invoke-direct {v5, v8}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    if-eqz v1, :cond_3

    .line 91
    .line 92
    invoke-virtual {v5, v1}, Lk21;->β(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    move-object v1, v2

    .line 96
    :cond_3
    invoke-virtual {v5, v6}, Lk21;->β(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_4
    :goto_3
    iget-object v6, v6, Lq01;->κ:Lq01;

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_5
    if-ne v7, v3, :cond_6

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_6
    invoke-static {v5}, Lh62;->γ(Lk21;)Lq01;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    goto :goto_1

    .line 110
    :cond_7
    iget v1, p3, Lq01;->θ:I

    .line 111
    .line 112
    and-int/lit8 v1, v1, 0x8

    .line 113
    .line 114
    if-eqz v1, :cond_8

    .line 115
    .line 116
    iget-object p3, p3, Lq01;->κ:Lq01;

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_8
    :goto_4
    check-cast v2, Lzr1;

    .line 120
    .line 121
    if-eqz v2, :cond_9

    .line 122
    .line 123
    move-object p3, v2

    .line 124
    check-cast p3, Lq01;

    .line 125
    .line 126
    iget-object p3, p3, Lq01;->ε:Lq01;

    .line 127
    .line 128
    iget-boolean p3, p3, Lq01;->σ:Z

    .line 129
    .line 130
    if-ne p3, v3, :cond_9

    .line 131
    .line 132
    invoke-static {v2}, Lh62;->х(Lur;)Lq31;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-static {p1}, Ls1;->ι(Lmp0;)Lmp0;

    .line 137
    .line 138
    .line 139
    move-result-object p3

    .line 140
    invoke-interface {p3, p1, v4}, Lmp0;->ж(Lmp0;Z)Lml1;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    iget p3, p1, Lml1;->α:F

    .line 145
    .line 146
    iget v0, p1, Lml1;->β:F

    .line 147
    .line 148
    iget v1, p1, Lml1;->γ:F

    .line 149
    .line 150
    iget p1, p1, Lml1;->δ:F

    .line 151
    .line 152
    invoke-virtual {p0, p3, v0, v1, p1}, Ll1;->Κ(FFFF)Landroid/graphics/Rect;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    iget p1, p0, Landroid/graphics/Rect;->left:I

    .line 157
    .line 158
    iget p3, p2, Landroid/graphics/Rect;->left:I

    .line 159
    .line 160
    sub-int/2addr p1, p3

    .line 161
    int-to-float p1, p1

    .line 162
    iget p3, p0, Landroid/graphics/Rect;->top:I

    .line 163
    .line 164
    iget p2, p2, Landroid/graphics/Rect;->top:I

    .line 165
    .line 166
    sub-int/2addr p3, p2

    .line 167
    int-to-float p2, p3

    .line 168
    new-instance p3, Lml1;

    .line 169
    .line 170
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    int-to-float v0, v0

    .line 175
    add-float/2addr v0, p1

    .line 176
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    int-to-float p0, p0

    .line 181
    add-float/2addr p0, p2

    .line 182
    invoke-direct {p3, p1, p2, v0, p0}, Lml1;-><init>(FFFF)V

    .line 183
    .line 184
    .line 185
    return-object p3

    .line 186
    :cond_9
    iget-object p0, p1, Lyp0;->Κ:Lk31;

    .line 187
    .line 188
    iget-object p0, p0, Lk31;->δ:Lq31;

    .line 189
    .line 190
    invoke-static {p0, v4}, Ls1;->ε(Lmp0;Z)Lml1;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    return-object p0
.end method

.method public final φ()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ll1;->λ:Landroid/view/accessibility/AccessibilityManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, Ll1;->ν:Ljava/util/List;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iput-object v1, p0, Ll1;->ν:Ljava/util/List;

    .line 19
    .line 20
    :cond_0
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-nez p0, :cond_1

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public final χ(Lyp0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll1;->ψ:Ld7;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ld7;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Ll1;->ω:Lwc;

    .line 10
    .line 11
    sget-object p1, Ls62;->α:Ls62;

    .line 12
    .line 13
    invoke-interface {p0, p1}, Lqs1;->μ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final ψ(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Ll1;->θ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Les1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Les1;->α()Lbs1;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget p0, p0, Lbs1;->ζ:I

    .line 12
    .line 13
    if-ne p1, p0, :cond_0

    .line 14
    .line 15
    const/4 p0, -0x1

    .line 16
    return p0

    .line 17
    :cond_0
    return p1
.end method

.method public final ω(Lbs1;Lcs1;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    sget-object v3, Lan0;->α:[I

    .line 8
    .line 9
    new-instance v3, Lo11;

    .line 10
    .line 11
    invoke-direct {v3}, Lo11;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x4

    .line 15
    invoke-static {v4, v1}, Lbs1;->κ(ILbs1;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    iget-object v6, v1, Lbs1;->γ:Lyp0;

    .line 20
    .line 21
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    const/4 v8, 0x0

    .line 26
    move v9, v8

    .line 27
    :goto_0
    if-ge v9, v7, :cond_2

    .line 28
    .line 29
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v10

    .line 33
    check-cast v10, Lbs1;

    .line 34
    .line 35
    invoke-virtual {v0}, Ll1;->σ()Lsm0;

    .line 36
    .line 37
    .line 38
    move-result-object v11

    .line 39
    iget v10, v10, Lbs1;->ζ:I

    .line 40
    .line 41
    invoke-virtual {v11, v10}, Lsm0;->α(I)Z

    .line 42
    .line 43
    .line 44
    move-result v11

    .line 45
    if-eqz v11, :cond_1

    .line 46
    .line 47
    iget-object v11, v2, Lcs1;->β:Lo11;

    .line 48
    .line 49
    invoke-virtual {v11, v10}, Lo11;->β(I)Z

    .line 50
    .line 51
    .line 52
    move-result v11

    .line 53
    if-nez v11, :cond_0

    .line 54
    .line 55
    invoke-virtual {v0, v6}, Ll1;->χ(Lyp0;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_0
    invoke-virtual {v3, v10}, Lo11;->α(I)Z

    .line 60
    .line 61
    .line 62
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    iget-object v2, v2, Lcs1;->β:Lo11;

    .line 66
    .line 67
    iget-object v5, v2, Lo11;->β:[I

    .line 68
    .line 69
    iget-object v2, v2, Lo11;->α:[J

    .line 70
    .line 71
    array-length v7, v2

    .line 72
    add-int/lit8 v7, v7, -0x2

    .line 73
    .line 74
    if-ltz v7, :cond_6

    .line 75
    .line 76
    move v9, v8

    .line 77
    :goto_1
    aget-wide v10, v2, v9

    .line 78
    .line 79
    not-long v12, v10

    .line 80
    const/4 v14, 0x7

    .line 81
    shl-long/2addr v12, v14

    .line 82
    and-long/2addr v12, v10

    .line 83
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    and-long/2addr v12, v14

    .line 89
    cmp-long v12, v12, v14

    .line 90
    .line 91
    if-eqz v12, :cond_5

    .line 92
    .line 93
    sub-int v12, v9, v7

    .line 94
    .line 95
    not-int v12, v12

    .line 96
    ushr-int/lit8 v12, v12, 0x1f

    .line 97
    .line 98
    const/16 v13, 0x8

    .line 99
    .line 100
    rsub-int/lit8 v12, v12, 0x8

    .line 101
    .line 102
    move v14, v8

    .line 103
    :goto_2
    if-ge v14, v12, :cond_4

    .line 104
    .line 105
    const-wide/16 v15, 0xff

    .line 106
    .line 107
    and-long/2addr v15, v10

    .line 108
    const-wide/16 v17, 0x80

    .line 109
    .line 110
    cmp-long v15, v15, v17

    .line 111
    .line 112
    if-gez v15, :cond_3

    .line 113
    .line 114
    shl-int/lit8 v15, v9, 0x3

    .line 115
    .line 116
    add-int/2addr v15, v14

    .line 117
    aget v15, v5, v15

    .line 118
    .line 119
    invoke-virtual {v3, v15}, Lo11;->β(I)Z

    .line 120
    .line 121
    .line 122
    move-result v15

    .line 123
    if-nez v15, :cond_3

    .line 124
    .line 125
    invoke-virtual {v0, v6}, Ll1;->χ(Lyp0;)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :cond_3
    shr-long/2addr v10, v13

    .line 130
    add-int/lit8 v14, v14, 0x1

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_4
    if-ne v12, v13, :cond_6

    .line 134
    .line 135
    :cond_5
    if-eq v9, v7, :cond_6

    .line 136
    .line 137
    add-int/lit8 v9, v9, 0x1

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_6
    invoke-static {v4, v1}, Lbs1;->κ(ILbs1;)Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    :goto_3
    if-ge v8, v2, :cond_8

    .line 149
    .line 150
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    check-cast v3, Lbs1;

    .line 155
    .line 156
    iget-object v4, v0, Ll1;->Κ:Ln11;

    .line 157
    .line 158
    iget v5, v3, Lbs1;->ζ:I

    .line 159
    .line 160
    invoke-virtual {v4, v5}, Lsm0;->β(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    check-cast v4, Lcs1;

    .line 165
    .line 166
    if-eqz v4, :cond_7

    .line 167
    .line 168
    invoke-virtual {v0}, Ll1;->σ()Lsm0;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    iget v6, v3, Lbs1;->ζ:I

    .line 173
    .line 174
    invoke-virtual {v5, v6}, Lsm0;->α(I)Z

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    if-eqz v5, :cond_7

    .line 179
    .line 180
    invoke-virtual {v0, v3, v4}, Ll1;->ω(Lbs1;Lcs1;)V

    .line 181
    .line 182
    .line 183
    :cond_7
    add-int/lit8 v8, v8, 0x1

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_8
    return-void
.end method

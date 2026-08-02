.class public abstract Ls11;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final b:Lkw;

.field public static final c:Leb;

.field public static final d:Ln4;

.field public static final e:Ldq1;

.field public static f:Lsx0;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Low;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, Low;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lkw;

    .line 9
    .line 10
    const v2, 0xac4057a

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v1, v2, v3, v0}, Lkw;-><init>(IZLun0;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Ls11;->b:Lkw;

    .line 18
    .line 19
    new-instance v0, Leb;

    .line 20
    .line 21
    const/16 v1, 0x14

    .line 22
    .line 23
    invoke-direct {v0, v1}, Leb;-><init>(I)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Ls11;->c:Leb;

    .line 27
    .line 28
    new-instance v0, Li51;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-direct {v0, v1}, Li51;-><init>(I)V

    .line 32
    .line 33
    .line 34
    new-instance v1, Ln4;

    .line 35
    .line 36
    const/16 v2, 0x19

    .line 37
    .line 38
    invoke-direct {v1, v2, v0}, Ln4;-><init>(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sput-object v1, Ls11;->d:Ln4;

    .line 42
    .line 43
    new-instance v0, Leg1;

    .line 44
    .line 45
    const/16 v1, 0x11

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-direct {v0, v2, v1}, Leg1;-><init>(BI)V

    .line 49
    .line 50
    .line 51
    new-instance v1, Leq1;

    .line 52
    .line 53
    const/16 v2, 0x15

    .line 54
    .line 55
    invoke-direct {v1, v2}, Leq1;-><init>(I)V

    .line 56
    .line 57
    .line 58
    new-instance v2, Ldq1;

    .line 59
    .line 60
    const/16 v3, 0xa

    .line 61
    .line 62
    invoke-direct {v2, v3, v0, v1}, Ldq1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    sput-object v2, Ls11;->e:Ldq1;

    .line 66
    .line 67
    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/16 v0, 0x1a

    .line 2
    .line 3
    iput v0, p0, Ls11;->a:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final A(Lzt0;)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_2

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p0, v0, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-ne p0, v0, :cond_0

    .line 12
    .line 13
    const-wide v0, 0xffdc2626L

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Lsp0;->c(J)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    return-wide v0

    .line 23
    :cond_0
    invoke-static {}, Lc80;->s()V

    .line 24
    .line 25
    .line 26
    const-wide/16 v0, 0x0

    .line 27
    .line 28
    return-wide v0

    .line 29
    :cond_1
    const-wide v0, 0xffd97706L

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1}, Lsp0;->c(J)J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    return-wide v0

    .line 39
    :cond_2
    const-wide v0, 0xff16a34aL

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1}, Lsp0;->c(J)J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    return-wide v0
.end method

.method public static final B(Lqd3;Lqd3;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget v1, p0, Lqd3;->a:F

    .line 6
    .line 7
    iget v2, p1, Lqd3;->a:F

    .line 8
    .line 9
    sub-float/2addr v1, v2

    .line 10
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const v2, 0x3a83126f    # 0.001f

    .line 15
    .line 16
    .line 17
    cmpg-float v1, v1, v2

    .line 18
    .line 19
    if-gez v1, :cond_1

    .line 20
    .line 21
    iget p0, p0, Lqd3;->b:F

    .line 22
    .line 23
    iget p1, p1, Lqd3;->b:F

    .line 24
    .line 25
    sub-float/2addr p0, p1

    .line 26
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    cmpg-float p0, p0, v2

    .line 31
    .line 32
    if-gez p0, :cond_1

    .line 33
    .line 34
    return v0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method public static C(Ljava/lang/String;)Lw80;
    .locals 9

    .line 1
    const-string v0, "selinuxfs-access"

    .line 2
    .line 3
    const-string v1, "selinuxfs-context"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    :try_start_0
    new-instance v5, Ljava/io/FileOutputStream;

    .line 9
    .line 10
    const-string v6, "/sys/fs/selinux/context"

    .line 11
    .line 12
    invoke-direct {v5, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    :try_start_1
    sget-object v6, Lwq;->a:Ljava/nio/charset/Charset;

    .line 16
    .line 17
    invoke-virtual {p0, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    array-length v8, v6

    .line 29
    invoke-static {v7, v6, v4, v8}, Landroid/system/Os;->write(Ljava/io/FileDescriptor;[BII)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 30
    .line 31
    .line 32
    :try_start_2
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V

    .line 33
    .line 34
    .line 35
    new-instance v5, Lw80;

    .line 36
    .line 37
    invoke-direct {v5, v3, v3, v1, v2}, Lw80;-><init>(ZZLjava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception v5

    .line 42
    goto :goto_0

    .line 43
    :catchall_1
    move-exception v6

    .line 44
    :try_start_3
    throw v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 45
    :catchall_2
    move-exception v7

    .line 46
    :try_start_4
    invoke-static {v5, v6}, Lpp0;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    throw v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 50
    :goto_0
    new-instance v6, Lx92;

    .line 51
    .line 52
    invoke-direct {v6, v5}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    move-object v5, v6

    .line 56
    :goto_1
    invoke-static {v5}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    if-nez v6, :cond_0

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_0
    :try_start_5
    instance-of v5, v6, Landroid/system/ErrnoException;

    .line 64
    .line 65
    if-eqz v5, :cond_1

    .line 66
    .line 67
    move-object v5, v6

    .line 68
    check-cast v5, Landroid/system/ErrnoException;

    .line 69
    .line 70
    iget v5, v5, Landroid/system/ErrnoException;->errno:I

    .line 71
    .line 72
    sget v7, Landroid/system/OsConstants;->EINVAL:I

    .line 73
    .line 74
    if-ne v5, v7, :cond_1

    .line 75
    .line 76
    new-instance v5, Lw80;

    .line 77
    .line 78
    invoke-direct {v5, v4, v3, v1, v2}, Lw80;-><init>(ZZLjava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    goto :goto_3

    .line 82
    :catchall_3
    move-exception v1

    .line 83
    goto :goto_2

    .line 84
    :cond_1
    throw v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 85
    :goto_2
    new-instance v5, Lx92;

    .line 86
    .line 87
    invoke-direct {v5, v1}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    :goto_3
    instance-of v1, v5, Lx92;

    .line 91
    .line 92
    if-eqz v1, :cond_2

    .line 93
    .line 94
    move-object v5, v2

    .line 95
    :cond_2
    check-cast v5, Lw80;

    .line 96
    .line 97
    if-eqz v5, :cond_3

    .line 98
    .line 99
    return-object v5

    .line 100
    :cond_3
    :try_start_6
    invoke-static {v4, p0, p0}, Ls11;->s(ILjava/lang/String;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    new-instance p0, Lw80;

    .line 104
    .line 105
    invoke-direct {p0, v3, v3, v0, v2}, Lw80;-><init>(ZZLjava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 106
    .line 107
    .line 108
    goto :goto_4

    .line 109
    :catchall_4
    move-exception p0

    .line 110
    new-instance v1, Lx92;

    .line 111
    .line 112
    invoke-direct {v1, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    move-object p0, v1

    .line 116
    :goto_4
    invoke-static {p0}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    if-nez v1, :cond_4

    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_4
    :try_start_7
    instance-of p0, v1, Landroid/system/ErrnoException;

    .line 124
    .line 125
    if-eqz p0, :cond_5

    .line 126
    .line 127
    move-object p0, v1

    .line 128
    check-cast p0, Landroid/system/ErrnoException;

    .line 129
    .line 130
    iget p0, p0, Landroid/system/ErrnoException;->errno:I

    .line 131
    .line 132
    sget v5, Landroid/system/OsConstants;->EINVAL:I

    .line 133
    .line 134
    if-ne p0, v5, :cond_5

    .line 135
    .line 136
    new-instance p0, Lw80;

    .line 137
    .line 138
    invoke-direct {p0, v4, v3, v0, v2}, Lw80;-><init>(ZZLjava/lang/String;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    goto :goto_6

    .line 142
    :catchall_5
    move-exception p0

    .line 143
    goto :goto_5

    .line 144
    :cond_5
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 145
    :goto_5
    new-instance v0, Lx92;

    .line 146
    .line 147
    invoke-direct {v0, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 148
    .line 149
    .line 150
    move-object p0, v0

    .line 151
    :goto_6
    invoke-static {p0}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    if-nez v0, :cond_6

    .line 156
    .line 157
    goto :goto_7

    .line 158
    :cond_6
    new-instance p0, Lw80;

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    const-string v1, "selinuxfs"

    .line 169
    .line 170
    invoke-direct {p0, v4, v4, v1, v0}, Lw80;-><init>(ZZLjava/lang/String;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    :goto_7
    check-cast p0, Lw80;

    .line 174
    .line 175
    return-object p0
.end method

.method public static D(Lid;F)Lid;
    .locals 10

    .line 1
    iget-object v0, p0, Lid;->j:Lnd;

    .line 2
    .line 3
    check-cast v0, Ljd;

    .line 4
    .line 5
    iget v0, v0, Ljd;->a:F

    .line 6
    .line 7
    iget-wide v5, p0, Lid;->k:J

    .line 8
    .line 9
    iget-wide v7, p0, Lid;->l:J

    .line 10
    .line 11
    iget-boolean v9, p0, Lid;->m:Z

    .line 12
    .line 13
    new-instance v1, Lid;

    .line 14
    .line 15
    iget-object v2, p0, Lid;->h:Ln43;

    .line 16
    .line 17
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    new-instance v4, Ljd;

    .line 22
    .line 23
    invoke-direct {v4, v0}, Ljd;-><init>(F)V

    .line 24
    .line 25
    .line 26
    invoke-direct/range {v1 .. v9}, Lid;-><init>(Ln43;Ljava/lang/Object;Lnd;JJZ)V

    .line 27
    .line 28
    .line 29
    return-object v1
.end method

.method public static E(Ljava/lang/CharSequence;Landroid/text/TextPaint;IILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IIZIIII)Landroid/text/StaticLayout;
    .locals 1

    .line 1
    if-ltz p3, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const-string v0, "invalid start value"

    .line 5
    .line 6
    invoke-static {v0}, Llz0;->a(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-ltz p3, :cond_1

    .line 14
    .line 15
    if-gt p3, v0, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    const-string v0, "invalid end value"

    .line 19
    .line 20
    invoke-static {v0}, Llz0;->a(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :goto_1
    if-ltz p6, :cond_2

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_2
    const-string v0, "invalid maxLines value"

    .line 27
    .line 28
    invoke-static {v0}, Llz0;->a(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :goto_2
    if-ltz p2, :cond_3

    .line 32
    .line 33
    goto :goto_3

    .line 34
    :cond_3
    const-string v0, "invalid width value"

    .line 35
    .line 36
    invoke-static {v0}, Llz0;->a(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :goto_3
    if-ltz p8, :cond_4

    .line 40
    .line 41
    goto :goto_4

    .line 42
    :cond_4
    const-string v0, "invalid ellipsizedWidth value"

    .line 43
    .line 44
    invoke-static {v0}, Llz0;->a(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :goto_4
    const/4 v0, 0x0

    .line 48
    invoke-static {p0, v0, p3, p1, p2}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0, p4}, Landroid/text/StaticLayout$Builder;->setTextDirection(Landroid/text/TextDirectionHeuristic;)Landroid/text/StaticLayout$Builder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p5}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p6}, Landroid/text/StaticLayout$Builder;->setMaxLines(I)Landroid/text/StaticLayout$Builder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p7}, Landroid/text/StaticLayout$Builder;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)Landroid/text/StaticLayout$Builder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p8}, Landroid/text/StaticLayout$Builder;->setEllipsizedWidth(I)Landroid/text/StaticLayout$Builder;

    .line 65
    .line 66
    .line 67
    const/4 p1, 0x0

    .line 68
    const/high16 p2, 0x3f800000    # 1.0f

    .line 69
    .line 70
    invoke-virtual {p0, p1, p2}, Landroid/text/StaticLayout$Builder;->setLineSpacing(FF)Landroid/text/StaticLayout$Builder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, p10}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, p11}, Landroid/text/StaticLayout$Builder;->setBreakStrategy(I)Landroid/text/StaticLayout$Builder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, p14}, Landroid/text/StaticLayout$Builder;->setHyphenationFrequency(I)Landroid/text/StaticLayout$Builder;

    .line 80
    .line 81
    .line 82
    const/4 p1, 0x0

    .line 83
    invoke-virtual {p0, p1, p1}, Landroid/text/StaticLayout$Builder;->setIndents([I[I)Landroid/text/StaticLayout$Builder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p9}, Landroid/text/StaticLayout$Builder;->setJustificationMode(I)Landroid/text/StaticLayout$Builder;

    .line 87
    .line 88
    .line 89
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 90
    .line 91
    const/16 p2, 0x1c

    .line 92
    .line 93
    if-lt p1, p2, :cond_5

    .line 94
    .line 95
    invoke-static {p0}, Lp90;->r(Landroid/text/StaticLayout$Builder;)V

    .line 96
    .line 97
    .line 98
    :cond_5
    const/16 p2, 0x21

    .line 99
    .line 100
    if-lt p1, p2, :cond_6

    .line 101
    .line 102
    invoke-static {}, Ld4;->a()Landroid/graphics/text/LineBreakConfig$Builder;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-static {p2, p12}, Ld4;->b(Landroid/graphics/text/LineBreakConfig$Builder;I)Landroid/graphics/text/LineBreakConfig$Builder;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    invoke-static {p2, p13}, Ld4;->s(Landroid/graphics/text/LineBreakConfig$Builder;I)Landroid/graphics/text/LineBreakConfig$Builder;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-static {p2}, Ld4;->c(Landroid/graphics/text/LineBreakConfig$Builder;)Landroid/graphics/text/LineBreakConfig;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-static {p0, p2}, Ld4;->m(Landroid/text/StaticLayout$Builder;Landroid/graphics/text/LineBreakConfig;)V

    .line 119
    .line 120
    .line 121
    :cond_6
    const/16 p2, 0x23

    .line 122
    .line 123
    if-lt p1, p2, :cond_7

    .line 124
    .line 125
    invoke-static {p0}, Lpz1;->c(Landroid/text/StaticLayout$Builder;)V

    .line 126
    .line 127
    .line 128
    :cond_7
    invoke-virtual {p0}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0
.end method

.method public static final F(Lsu;Lsu;)Lyy;
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Lwy;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-direct {p1, p0, p0, v0}, Lyy;-><init>(Lsu;Lsu;I)V

    .line 7
    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    iget-wide v0, p0, Lsu;->b:J

    .line 11
    .line 12
    const-wide v2, 0x300000000L

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, v2, v3}, Ltp0;->s(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-wide v0, p1, Lsu;->b:J

    .line 24
    .line 25
    invoke-static {v0, v1, v2, v3}, Ltp0;->s(JJ)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    new-instance v0, Lxy;

    .line 32
    .line 33
    check-cast p0, Lka2;

    .line 34
    .line 35
    check-cast p1, Lka2;

    .line 36
    .line 37
    invoke-direct {v0, p0, p1}, Lxy;-><init>(Lka2;Lka2;)V

    .line 38
    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_1
    new-instance v0, Lyy;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-direct {v0, p0, p1, v1}, Lyy;-><init>(Lsu;Lsu;I)V

    .line 45
    .line 46
    .line 47
    return-object v0
.end method

.method public static final G(Lcom/dokar/quickjs/QuickJs;Lfs1;J)V
    .locals 2

    .line 1
    new-instance v0, Lzc0;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, Lzc0;-><init>(Lfs1;Lcom/dokar/quickjs/QuickJs;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p1, Lfs1;->a:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p0, v1, v0, p2, p3}, Lcom/dokar/quickjs/QuickJs;->defineBinding-NW8rdx8(Ljava/lang/String;Les1;J)J

    .line 9
    .line 10
    .line 11
    move-result-wide p2

    .line 12
    iget-object p1, p1, Lfs1;->d:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lfs1;

    .line 29
    .line 30
    invoke-static {p0, v0, p2, p3}, Ls11;->G(Lcom/dokar/quickjs/QuickJs;Lfs1;J)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
.end method

.method public static H(Ljava/io/File;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Ls11;->g0()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {v0, p0}, Lup0;->r(Ljava/nio/file/Path;Ljava/nio/file/Path;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception p0

    .line 18
    new-instance v0, Ljava/lang/SecurityException;

    .line 19
    .line 20
    const-string v1, "Unable to create Native release storage"

    .line 21
    .line 22
    invoke-direct {v0, v1, p0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    throw v0
.end method

.method public static I(Lbi0;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lbi0;->b:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, " "

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string p1, "FastKV"

    .line 24
    .line 25
    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static final J(Lc61;)Lc61;
    .locals 2

    .line 1
    invoke-interface {p0}, Lc61;->j()Lc61;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    move-object v1, v0

    .line 6
    move-object v0, p0

    .line 7
    move-object p0, v1

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-interface {p0}, Lc61;->j()Lc61;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of p0, v0, Lzn1;

    .line 16
    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    move-object p0, v0

    .line 20
    check-cast p0, Lzn1;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    :goto_1
    if-nez p0, :cond_2

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_2
    iget-object v0, p0, Lzn1;->x:Lzn1;

    .line 28
    .line 29
    :goto_2
    move-object v1, v0

    .line 30
    move-object v0, p0

    .line 31
    move-object p0, v1

    .line 32
    if-eqz p0, :cond_3

    .line 33
    .line 34
    iget-object v0, p0, Lzn1;->x:Lzn1;

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_3
    return-object v0
.end method

.method public static final K()Lsx0;
    .locals 12

    .line 1
    sget-object v0, Ls11;->f:Lsx0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v1, Lrx0;

    .line 7
    .line 8
    const/4 v9, 0x0

    .line 9
    const/16 v11, 0x60

    .line 10
    .line 11
    const-string v2, "Filled.Refresh"

    .line 12
    .line 13
    const/high16 v3, 0x41c00000    # 24.0f

    .line 14
    .line 15
    const/high16 v4, 0x41c00000    # 24.0f

    .line 16
    .line 17
    const/high16 v5, 0x41c00000    # 24.0f

    .line 18
    .line 19
    const/high16 v6, 0x41c00000    # 24.0f

    .line 20
    .line 21
    const-wide/16 v7, 0x0

    .line 22
    .line 23
    const/4 v10, 0x0

    .line 24
    invoke-direct/range {v1 .. v11}, Lrx0;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 25
    .line 26
    .line 27
    sget v0, Ls93;->a:I

    .line 28
    .line 29
    new-instance v0, Lft2;

    .line 30
    .line 31
    sget-wide v2, Lju;->b:J

    .line 32
    .line 33
    invoke-direct {v0, v2, v3}, Lft2;-><init>(J)V

    .line 34
    .line 35
    .line 36
    new-instance v4, Lye0;

    .line 37
    .line 38
    const/4 v2, 0x3

    .line 39
    invoke-direct {v4, v2}, Lye0;-><init>(I)V

    .line 40
    .line 41
    .line 42
    const v2, 0x418d3333    # 17.65f

    .line 43
    .line 44
    .line 45
    const v3, 0x40cb3333    # 6.35f

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v2, v3}, Lye0;->k(FF)V

    .line 49
    .line 50
    .line 51
    const/high16 v9, 0x41400000    # 12.0f

    .line 52
    .line 53
    const/high16 v10, 0x40800000    # 4.0f

    .line 54
    .line 55
    const v5, 0x4181999a    # 16.2f

    .line 56
    .line 57
    .line 58
    const v6, 0x409ccccd    # 4.9f

    .line 59
    .line 60
    .line 61
    const v7, 0x41635c29    # 14.21f

    .line 62
    .line 63
    .line 64
    const/high16 v8, 0x40800000    # 4.0f

    .line 65
    .line 66
    invoke-virtual/range {v4 .. v10}, Lye0;->d(FFFFFF)V

    .line 67
    .line 68
    .line 69
    const v9, -0x3f0051ec    # -7.99f

    .line 70
    .line 71
    .line 72
    const/high16 v10, 0x41000000    # 8.0f

    .line 73
    .line 74
    const v5, -0x3f728f5c    # -4.42f

    .line 75
    .line 76
    .line 77
    const/4 v6, 0x0

    .line 78
    const v7, -0x3f0051ec    # -7.99f

    .line 79
    .line 80
    .line 81
    const v8, 0x40651eb8    # 3.58f

    .line 82
    .line 83
    .line 84
    invoke-virtual/range {v4 .. v10}, Lye0;->e(FFFFFF)V

    .line 85
    .line 86
    .line 87
    const v2, 0x40647ae1    # 3.57f

    .line 88
    .line 89
    .line 90
    const v3, 0x40ffae14    # 7.99f

    .line 91
    .line 92
    .line 93
    const/high16 v5, 0x41000000    # 8.0f

    .line 94
    .line 95
    invoke-virtual {v4, v2, v5, v3, v5}, Lye0;->m(FFFF)V

    .line 96
    .line 97
    .line 98
    const v9, 0x40f75c29    # 7.73f

    .line 99
    .line 100
    .line 101
    const/high16 v10, -0x3f400000    # -6.0f

    .line 102
    .line 103
    const v5, 0x406eb852    # 3.73f

    .line 104
    .line 105
    .line 106
    const v7, 0x40dae148    # 6.84f

    .line 107
    .line 108
    .line 109
    const v8, -0x3fdccccd    # -2.55f

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v4 .. v10}, Lye0;->e(FFFFFF)V

    .line 113
    .line 114
    .line 115
    const v2, -0x3ffae148    # -2.08f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v4, v2}, Lye0;->h(F)V

    .line 119
    .line 120
    .line 121
    const v9, -0x3f4b3333    # -5.65f

    .line 122
    .line 123
    .line 124
    const/high16 v10, 0x40800000    # 4.0f

    .line 125
    .line 126
    const v5, -0x40ae147b    # -0.82f

    .line 127
    .line 128
    .line 129
    const v6, 0x40151eb8    # 2.33f

    .line 130
    .line 131
    .line 132
    const v7, -0x3fbd70a4    # -3.04f

    .line 133
    .line 134
    .line 135
    const/high16 v8, 0x40800000    # 4.0f

    .line 136
    .line 137
    invoke-virtual/range {v4 .. v10}, Lye0;->e(FFFFFF)V

    .line 138
    .line 139
    .line 140
    const/high16 v9, -0x3f400000    # -6.0f

    .line 141
    .line 142
    const/high16 v10, -0x3f400000    # -6.0f

    .line 143
    .line 144
    const v5, -0x3fac28f6    # -3.31f

    .line 145
    .line 146
    .line 147
    const/4 v6, 0x0

    .line 148
    const/high16 v7, -0x3f400000    # -6.0f

    .line 149
    .line 150
    const v8, -0x3fd3d70a    # -2.69f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v4 .. v10}, Lye0;->e(FFFFFF)V

    .line 154
    .line 155
    .line 156
    const v2, 0x402c28f6    # 2.69f

    .line 157
    .line 158
    .line 159
    const/high16 v3, 0x40c00000    # 6.0f

    .line 160
    .line 161
    const/high16 v5, -0x3f400000    # -6.0f

    .line 162
    .line 163
    invoke-virtual {v4, v2, v5, v3, v5}, Lye0;->m(FFFF)V

    .line 164
    .line 165
    .line 166
    const v9, 0x40870a3d    # 4.22f

    .line 167
    .line 168
    .line 169
    const v10, 0x3fe3d70a    # 1.78f

    .line 170
    .line 171
    .line 172
    const v5, 0x3fd47ae1    # 1.66f

    .line 173
    .line 174
    .line 175
    const v7, 0x4048f5c3    # 3.14f

    .line 176
    .line 177
    .line 178
    const v8, 0x3f30a3d7    # 0.69f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v4 .. v10}, Lye0;->e(FFFFFF)V

    .line 182
    .line 183
    .line 184
    const/high16 v2, 0x41500000    # 13.0f

    .line 185
    .line 186
    const/high16 v3, 0x41300000    # 11.0f

    .line 187
    .line 188
    invoke-virtual {v4, v2, v3}, Lye0;->i(FF)V

    .line 189
    .line 190
    .line 191
    const/high16 v2, 0x40e00000    # 7.0f

    .line 192
    .line 193
    invoke-virtual {v4, v2}, Lye0;->h(F)V

    .line 194
    .line 195
    .line 196
    new-instance v2, Lpy1;

    .line 197
    .line 198
    const/high16 v3, 0x40800000    # 4.0f

    .line 199
    .line 200
    invoke-direct {v2, v3}, Lpy1;-><init>(F)V

    .line 201
    .line 202
    .line 203
    iget-object v3, v4, Lye0;->a:Ljava/util/ArrayList;

    .line 204
    .line 205
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    const v2, -0x3fe9999a    # -2.35f

    .line 209
    .line 210
    .line 211
    const v5, 0x40166666    # 2.35f

    .line 212
    .line 213
    .line 214
    invoke-virtual {v4, v2, v5}, Lye0;->j(FF)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v4}, Lye0;->c()V

    .line 218
    .line 219
    .line 220
    invoke-static {v1, v3, v0}, Lrx0;->a(Lrx0;Ljava/util/ArrayList;Lft2;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1}, Lrx0;->b()Lsx0;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    sput-object v0, Ls11;->f:Lsx0;

    .line 228
    .line 229
    return-object v0
.end method

.method public static L([B)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    mul-int/lit8 v1, v1, 0x2

    .line 5
    .line 6
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 7
    .line 8
    .line 9
    array-length v1, p0

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v1, :cond_0

    .line 12
    .line 13
    aget-byte v3, p0, v2

    .line 14
    .line 15
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 16
    .line 17
    and-int/lit16 v3, v3, 0xff

    .line 18
    .line 19
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const-string v5, "%02x"

    .line 28
    .line 29
    invoke-static {v4, v5, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public static M(Lbi0;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lbi0;->b:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, " "

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string p1, "FastKV"

    .line 24
    .line 25
    invoke-static {p1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static final N([F)[F
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget v2, v0, v1

    .line 5
    .line 6
    const/4 v3, 0x3

    .line 7
    aget v4, v0, v3

    .line 8
    .line 9
    const/4 v5, 0x6

    .line 10
    aget v6, v0, v5

    .line 11
    .line 12
    const/4 v7, 0x1

    .line 13
    aget v8, v0, v7

    .line 14
    .line 15
    const/4 v9, 0x4

    .line 16
    aget v10, v0, v9

    .line 17
    .line 18
    const/4 v11, 0x7

    .line 19
    aget v12, v0, v11

    .line 20
    .line 21
    const/4 v13, 0x2

    .line 22
    aget v14, v0, v13

    .line 23
    .line 24
    const/4 v15, 0x5

    .line 25
    aget v16, v0, v15

    .line 26
    .line 27
    const/16 v17, 0x8

    .line 28
    .line 29
    aget v18, v0, v17

    .line 30
    .line 31
    mul-float v19, v10, v18

    .line 32
    .line 33
    mul-float v20, v12, v16

    .line 34
    .line 35
    sub-float v19, v19, v20

    .line 36
    .line 37
    mul-float v20, v12, v14

    .line 38
    .line 39
    mul-float v21, v8, v18

    .line 40
    .line 41
    sub-float v20, v20, v21

    .line 42
    .line 43
    mul-float v21, v8, v16

    .line 44
    .line 45
    mul-float v22, v10, v14

    .line 46
    .line 47
    sub-float v21, v21, v22

    .line 48
    .line 49
    mul-float v22, v2, v19

    .line 50
    .line 51
    mul-float v23, v4, v20

    .line 52
    .line 53
    add-float v23, v23, v22

    .line 54
    .line 55
    mul-float v22, v6, v21

    .line 56
    .line 57
    add-float v22, v22, v23

    .line 58
    .line 59
    array-length v0, v0

    .line 60
    new-array v0, v0, [F

    .line 61
    .line 62
    div-float v19, v19, v22

    .line 63
    .line 64
    aput v19, v0, v1

    .line 65
    .line 66
    div-float v20, v20, v22

    .line 67
    .line 68
    aput v20, v0, v7

    .line 69
    .line 70
    div-float v21, v21, v22

    .line 71
    .line 72
    aput v21, v0, v13

    .line 73
    .line 74
    mul-float v1, v6, v16

    .line 75
    .line 76
    mul-float v7, v4, v18

    .line 77
    .line 78
    sub-float/2addr v1, v7

    .line 79
    div-float v1, v1, v22

    .line 80
    .line 81
    aput v1, v0, v3

    .line 82
    .line 83
    mul-float v18, v18, v2

    .line 84
    .line 85
    mul-float v1, v6, v14

    .line 86
    .line 87
    sub-float v18, v18, v1

    .line 88
    .line 89
    div-float v18, v18, v22

    .line 90
    .line 91
    aput v18, v0, v9

    .line 92
    .line 93
    mul-float/2addr v14, v4

    .line 94
    mul-float v16, v16, v2

    .line 95
    .line 96
    sub-float v14, v14, v16

    .line 97
    .line 98
    div-float v14, v14, v22

    .line 99
    .line 100
    aput v14, v0, v15

    .line 101
    .line 102
    mul-float v1, v4, v12

    .line 103
    .line 104
    mul-float v3, v6, v10

    .line 105
    .line 106
    sub-float/2addr v1, v3

    .line 107
    div-float v1, v1, v22

    .line 108
    .line 109
    aput v1, v0, v5

    .line 110
    .line 111
    mul-float/2addr v6, v8

    .line 112
    mul-float/2addr v12, v2

    .line 113
    sub-float/2addr v6, v12

    .line 114
    div-float v6, v6, v22

    .line 115
    .line 116
    aput v6, v0, v11

    .line 117
    .line 118
    mul-float/2addr v2, v10

    .line 119
    mul-float/2addr v4, v8

    .line 120
    sub-float/2addr v2, v4

    .line 121
    div-float v2, v2, v22

    .line 122
    .line 123
    aput v2, v0, v17

    .line 124
    .line 125
    return-object v0
.end method

.method public static final O(Lb03;Z)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lb03;->d:Lt91;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lt91;->c()Lc61;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Lop0;->D(Lc61;)Lo62;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, p1}, Lb03;->l(Z)J

    .line 16
    .line 17
    .line 18
    move-result-wide p0

    .line 19
    iget v1, v0, Lo62;->a:F

    .line 20
    .line 21
    iget v2, v0, Lo62;->c:F

    .line 22
    .line 23
    const/16 v3, 0x20

    .line 24
    .line 25
    shr-long v3, p0, v3

    .line 26
    .line 27
    long-to-int v3, v3

    .line 28
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    cmpg-float v1, v1, v3

    .line 33
    .line 34
    if-gtz v1, :cond_0

    .line 35
    .line 36
    cmpg-float v1, v3, v2

    .line 37
    .line 38
    if-gtz v1, :cond_0

    .line 39
    .line 40
    iget v1, v0, Lo62;->b:F

    .line 41
    .line 42
    iget v0, v0, Lo62;->d:F

    .line 43
    .line 44
    const-wide v2, 0xffffffffL

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    and-long/2addr p0, v2

    .line 50
    long-to-int p0, p0

    .line 51
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    cmpg-float p1, v1, p0

    .line 56
    .line 57
    if-gtz p1, :cond_0

    .line 58
    .line 59
    cmpg-float p0, p0, v0

    .line 60
    .line 61
    if-gtz p0, :cond_0

    .line 62
    .line 63
    const/4 p0, 0x1

    .line 64
    return p0

    .line 65
    :cond_0
    const/4 p0, 0x0

    .line 66
    return p0
.end method

.method public static final P(Lzt0;Lpx;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_2

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eq p0, v1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    if-ne p0, v1, :cond_0

    .line 13
    .line 14
    check-cast p1, Lgo0;

    .line 15
    .line 16
    const p0, -0x6c3abe5c

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p0}, Lgo0;->W(I)V

    .line 20
    .line 21
    .line 22
    const p0, 0x790b012c

    .line 23
    .line 24
    .line 25
    invoke-static {p0, p1}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p1, v0}, Lgo0;->p(Z)V

    .line 30
    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_0
    check-cast p1, Lgo0;

    .line 34
    .line 35
    const p0, -0x6c3ade4e

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p0}, Lgo0;->W(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Lgo0;->p(Z)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lc80;->s()V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_1
    check-cast p1, Lgo0;

    .line 50
    .line 51
    const p0, -0x6c3acbb7

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p0}, Lgo0;->W(I)V

    .line 55
    .line 56
    .line 57
    const p0, 0x790b012e

    .line 58
    .line 59
    .line 60
    invoke-static {p0, p1}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p1, v0}, Lgo0;->p(Z)V

    .line 65
    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_2
    check-cast p1, Lgo0;

    .line 69
    .line 70
    const p0, -0x6c3ad91c

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, p0}, Lgo0;->W(I)V

    .line 74
    .line 75
    .line 76
    const p0, 0x790b012d

    .line 77
    .line 78
    .line 79
    invoke-static {p0, p1}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {p1, v0}, Lgo0;->p(Z)V

    .line 84
    .line 85
    .line 86
    return-object p0
.end method

.method public static final Q([F[F)[F
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/16 v2, 0x9

    .line 6
    .line 7
    new-array v3, v2, [F

    .line 8
    .line 9
    array-length v4, v0

    .line 10
    if-ge v4, v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    array-length v4, v1

    .line 14
    if-ge v4, v2, :cond_1

    .line 15
    .line 16
    :goto_0
    return-object v3

    .line 17
    :cond_1
    const/4 v2, 0x0

    .line 18
    aget v4, v0, v2

    .line 19
    .line 20
    aget v5, v1, v2

    .line 21
    .line 22
    mul-float/2addr v4, v5

    .line 23
    const/4 v5, 0x3

    .line 24
    aget v6, v0, v5

    .line 25
    .line 26
    const/4 v7, 0x1

    .line 27
    aget v8, v1, v7

    .line 28
    .line 29
    mul-float v9, v6, v8

    .line 30
    .line 31
    add-float/2addr v9, v4

    .line 32
    const/4 v4, 0x6

    .line 33
    aget v10, v0, v4

    .line 34
    .line 35
    const/4 v11, 0x2

    .line 36
    aget v12, v1, v11

    .line 37
    .line 38
    mul-float v13, v10, v12

    .line 39
    .line 40
    add-float/2addr v13, v9

    .line 41
    aput v13, v3, v2

    .line 42
    .line 43
    aget v9, v0, v7

    .line 44
    .line 45
    aget v13, v1, v2

    .line 46
    .line 47
    mul-float/2addr v9, v13

    .line 48
    const/4 v14, 0x4

    .line 49
    aget v15, v0, v14

    .line 50
    .line 51
    mul-float/2addr v8, v15

    .line 52
    add-float/2addr v8, v9

    .line 53
    const/4 v9, 0x7

    .line 54
    aget v16, v0, v9

    .line 55
    .line 56
    mul-float v17, v16, v12

    .line 57
    .line 58
    add-float v17, v17, v8

    .line 59
    .line 60
    aput v17, v3, v7

    .line 61
    .line 62
    aget v8, v0, v11

    .line 63
    .line 64
    mul-float/2addr v8, v13

    .line 65
    const/4 v13, 0x5

    .line 66
    aget v17, v0, v13

    .line 67
    .line 68
    aget v18, v1, v7

    .line 69
    .line 70
    mul-float v18, v18, v17

    .line 71
    .line 72
    add-float v18, v18, v8

    .line 73
    .line 74
    const/16 v8, 0x8

    .line 75
    .line 76
    aget v19, v0, v8

    .line 77
    .line 78
    mul-float v12, v12, v19

    .line 79
    .line 80
    add-float v12, v12, v18

    .line 81
    .line 82
    aput v12, v3, v11

    .line 83
    .line 84
    aget v2, v0, v2

    .line 85
    .line 86
    aget v12, v1, v5

    .line 87
    .line 88
    mul-float/2addr v12, v2

    .line 89
    aget v18, v1, v14

    .line 90
    .line 91
    mul-float v6, v6, v18

    .line 92
    .line 93
    add-float/2addr v6, v12

    .line 94
    aget v12, v1, v13

    .line 95
    .line 96
    mul-float v20, v10, v12

    .line 97
    .line 98
    add-float v20, v20, v6

    .line 99
    .line 100
    aput v20, v3, v5

    .line 101
    .line 102
    aget v6, v0, v7

    .line 103
    .line 104
    aget v7, v1, v5

    .line 105
    .line 106
    mul-float v20, v6, v7

    .line 107
    .line 108
    mul-float v15, v15, v18

    .line 109
    .line 110
    add-float v15, v15, v20

    .line 111
    .line 112
    mul-float v18, v16, v12

    .line 113
    .line 114
    add-float v18, v18, v15

    .line 115
    .line 116
    aput v18, v3, v14

    .line 117
    .line 118
    aget v11, v0, v11

    .line 119
    .line 120
    mul-float/2addr v7, v11

    .line 121
    aget v15, v1, v14

    .line 122
    .line 123
    mul-float v17, v17, v15

    .line 124
    .line 125
    add-float v17, v17, v7

    .line 126
    .line 127
    mul-float v12, v12, v19

    .line 128
    .line 129
    add-float v12, v12, v17

    .line 130
    .line 131
    aput v12, v3, v13

    .line 132
    .line 133
    aget v7, v1, v4

    .line 134
    .line 135
    mul-float/2addr v2, v7

    .line 136
    aget v5, v0, v5

    .line 137
    .line 138
    aget v7, v1, v9

    .line 139
    .line 140
    mul-float/2addr v5, v7

    .line 141
    add-float/2addr v5, v2

    .line 142
    aget v2, v1, v8

    .line 143
    .line 144
    mul-float/2addr v10, v2

    .line 145
    add-float/2addr v10, v5

    .line 146
    aput v10, v3, v4

    .line 147
    .line 148
    aget v4, v1, v4

    .line 149
    .line 150
    mul-float/2addr v6, v4

    .line 151
    aget v5, v0, v14

    .line 152
    .line 153
    mul-float/2addr v5, v7

    .line 154
    add-float/2addr v5, v6

    .line 155
    mul-float v16, v16, v2

    .line 156
    .line 157
    add-float v16, v16, v5

    .line 158
    .line 159
    aput v16, v3, v9

    .line 160
    .line 161
    mul-float/2addr v11, v4

    .line 162
    aget v0, v0, v13

    .line 163
    .line 164
    aget v1, v1, v9

    .line 165
    .line 166
    mul-float/2addr v0, v1

    .line 167
    add-float/2addr v0, v11

    .line 168
    mul-float v19, v19, v2

    .line 169
    .line 170
    add-float v19, v19, v0

    .line 171
    .line 172
    aput v19, v3, v8

    .line 173
    .line 174
    return-object v3
.end method

.method public static final R([F[F)[F
    .locals 8

    .line 1
    array-length v0, p0

    .line 2
    const/16 v1, 0x9

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    array-length v0, p1

    .line 8
    const/4 v1, 0x3

    .line 9
    if-ge v0, v1, :cond_1

    .line 10
    .line 11
    :goto_0
    return-object p1

    .line 12
    :cond_1
    const/4 v0, 0x0

    .line 13
    aget v2, p1, v0

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    aget v4, p1, v3

    .line 17
    .line 18
    const/4 v5, 0x2

    .line 19
    aget v6, p1, v5

    .line 20
    .line 21
    aget v7, p0, v0

    .line 22
    .line 23
    mul-float/2addr v7, v2

    .line 24
    aget v1, p0, v1

    .line 25
    .line 26
    mul-float/2addr v1, v4

    .line 27
    add-float/2addr v1, v7

    .line 28
    const/4 v7, 0x6

    .line 29
    aget v7, p0, v7

    .line 30
    .line 31
    mul-float/2addr v7, v6

    .line 32
    add-float/2addr v7, v1

    .line 33
    aput v7, p1, v0

    .line 34
    .line 35
    aget v0, p0, v3

    .line 36
    .line 37
    mul-float/2addr v0, v2

    .line 38
    const/4 v1, 0x4

    .line 39
    aget v1, p0, v1

    .line 40
    .line 41
    mul-float/2addr v1, v4

    .line 42
    add-float/2addr v1, v0

    .line 43
    const/4 v0, 0x7

    .line 44
    aget v0, p0, v0

    .line 45
    .line 46
    mul-float/2addr v0, v6

    .line 47
    add-float/2addr v0, v1

    .line 48
    aput v0, p1, v3

    .line 49
    .line 50
    aget v0, p0, v5

    .line 51
    .line 52
    mul-float/2addr v0, v2

    .line 53
    const/4 v1, 0x5

    .line 54
    aget v1, p0, v1

    .line 55
    .line 56
    mul-float/2addr v1, v4

    .line 57
    add-float/2addr v1, v0

    .line 58
    const/16 v0, 0x8

    .line 59
    .line 60
    aget p0, p0, v0

    .line 61
    .line 62
    mul-float/2addr p0, v6

    .line 63
    add-float/2addr p0, v1

    .line 64
    aput p0, p1, v5

    .line 65
    .line 66
    return-object p1
.end method

.method public static final S(Lth1;Lxm0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lth1;->n:Lps1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lps1;

    .line 6
    .line 7
    move-object v1, p0

    .line 8
    check-cast v1, Los1;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lps1;-><init>(Los1;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lth1;->n:Lps1;

    .line 14
    .line 15
    :cond_0
    invoke-static {p0}, Lsp0;->f0(Lt60;)Lzv1;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lb7;

    .line 20
    .line 21
    invoke-virtual {p0}, Lb7;->getSnapshotObserver()Lbw1;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sget-object v1, Loq0;->o:Loq0;

    .line 26
    .line 27
    iget-object p0, p0, Lbw1;->a:Lts2;

    .line 28
    .line 29
    invoke-virtual {p0, v0, v1, p1}, Lts2;->c(Ljava/lang/Object;Lin0;Lxm0;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public static T(Luh1;FFI)Luh1;
    .locals 2

    .line 1
    and-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p1, v1

    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    move p2, v1

    .line 12
    :cond_1
    new-instance p3, Lss1;

    .line 13
    .line 14
    invoke-direct {p3, p1, p2}, Lss1;-><init>(FF)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0, p3}, Luh1;->c(Luh1;)Luh1;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static U(Ljava/io/File;)Ljava/nio/channels/FileChannel;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/io/File;

    .line 6
    .line 7
    const-string v2, "nuke-native-release.lock"

    .line 8
    .line 9
    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {v0, p0}, Lup0;->p(Ljava/nio/file/Path;Ljava/nio/file/Path;)Ljava/nio/file/Path;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/4 v0, 0x3

    .line 21
    new-array v0, v0, [Ljava/nio/file/OpenOption;

    .line 22
    .line 23
    sget-object v1, Ljava/nio/file/StandardOpenOption;->CREATE:Ljava/nio/file/StandardOpenOption;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    aput-object v1, v0, v2

    .line 27
    .line 28
    sget-object v1, Ljava/nio/file/StandardOpenOption;->WRITE:Ljava/nio/file/StandardOpenOption;

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    aput-object v1, v0, v2

    .line 32
    .line 33
    sget-object v1, Ljava/nio/file/LinkOption;->NOFOLLOW_LINKS:Ljava/nio/file/LinkOption;

    .line 34
    .line 35
    const/4 v2, 0x2

    .line 36
    aput-object v1, v0, v2

    .line 37
    .line 38
    invoke-static {p0, v0}, Ljava/nio/channels/FileChannel;->open(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/nio/channels/FileChannel;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public static V(Ljava/security/cert/X509Certificate;)Ljava/lang/String;
    .locals 13

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "sha256/"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lno;->k:Lno;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/security/Key;->getEncoded()[B

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    array-length v1, p0

    .line 22
    array-length v2, p0

    .line 23
    int-to-long v3, v2

    .line 24
    const-wide/16 v5, 0x0

    .line 25
    .line 26
    int-to-long v7, v1

    .line 27
    invoke-static/range {v3 .. v8}, Lqp0;->m(JJJ)V

    .line 28
    .line 29
    .line 30
    new-instance v2, Lno;

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-static {p0, v3, v1}, Lmg;->g0([BII)[B

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-direct {v2, p0}, Lno;-><init>([B)V

    .line 38
    .line 39
    .line 40
    const-string v1, "SHA-256"

    .line 41
    .line 42
    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v2}, Lno;->a()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    invoke-virtual {v1, p0, v3, v2}, Ljava/security/MessageDigest;->update([BII)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    new-instance v1, Lno;

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-direct {v1, p0}, Lno;-><init>([B)V

    .line 63
    .line 64
    .line 65
    sget-object v1, Ld;->a:[B

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    array-length v2, p0

    .line 71
    const/4 v4, 0x2

    .line 72
    add-int/2addr v2, v4

    .line 73
    div-int/lit8 v2, v2, 0x3

    .line 74
    .line 75
    mul-int/lit8 v2, v2, 0x4

    .line 76
    .line 77
    new-array v2, v2, [B

    .line 78
    .line 79
    array-length v5, p0

    .line 80
    array-length v6, p0

    .line 81
    rem-int/lit8 v6, v6, 0x3

    .line 82
    .line 83
    sub-int/2addr v5, v6

    .line 84
    move v6, v3

    .line 85
    :goto_0
    if-ge v3, v5, :cond_0

    .line 86
    .line 87
    add-int/lit8 v7, v3, 0x1

    .line 88
    .line 89
    aget-byte v8, p0, v3

    .line 90
    .line 91
    add-int/lit8 v9, v3, 0x2

    .line 92
    .line 93
    aget-byte v7, p0, v7

    .line 94
    .line 95
    add-int/lit8 v3, v3, 0x3

    .line 96
    .line 97
    aget-byte v9, p0, v9

    .line 98
    .line 99
    add-int/lit8 v10, v6, 0x1

    .line 100
    .line 101
    and-int/lit16 v11, v8, 0xff

    .line 102
    .line 103
    shr-int/2addr v11, v4

    .line 104
    aget-byte v11, v1, v11

    .line 105
    .line 106
    aput-byte v11, v2, v6

    .line 107
    .line 108
    add-int/lit8 v11, v6, 0x2

    .line 109
    .line 110
    and-int/lit8 v8, v8, 0x3

    .line 111
    .line 112
    shl-int/lit8 v8, v8, 0x4

    .line 113
    .line 114
    and-int/lit16 v12, v7, 0xff

    .line 115
    .line 116
    shr-int/lit8 v12, v12, 0x4

    .line 117
    .line 118
    or-int/2addr v8, v12

    .line 119
    aget-byte v8, v1, v8

    .line 120
    .line 121
    aput-byte v8, v2, v10

    .line 122
    .line 123
    add-int/lit8 v8, v6, 0x3

    .line 124
    .line 125
    and-int/lit8 v7, v7, 0xf

    .line 126
    .line 127
    shl-int/2addr v7, v4

    .line 128
    and-int/lit16 v10, v9, 0xff

    .line 129
    .line 130
    shr-int/lit8 v10, v10, 0x6

    .line 131
    .line 132
    or-int/2addr v7, v10

    .line 133
    aget-byte v7, v1, v7

    .line 134
    .line 135
    aput-byte v7, v2, v11

    .line 136
    .line 137
    add-int/lit8 v6, v6, 0x4

    .line 138
    .line 139
    and-int/lit8 v7, v9, 0x3f

    .line 140
    .line 141
    aget-byte v7, v1, v7

    .line 142
    .line 143
    aput-byte v7, v2, v8

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_0
    array-length v7, p0

    .line 147
    sub-int/2addr v7, v5

    .line 148
    const/4 v5, 0x1

    .line 149
    const/16 v8, 0x3d

    .line 150
    .line 151
    if-eq v7, v5, :cond_2

    .line 152
    .line 153
    if-eq v7, v4, :cond_1

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_1
    add-int/lit8 v5, v3, 0x1

    .line 157
    .line 158
    aget-byte v3, p0, v3

    .line 159
    .line 160
    aget-byte p0, p0, v5

    .line 161
    .line 162
    add-int/lit8 v5, v6, 0x1

    .line 163
    .line 164
    and-int/lit16 v7, v3, 0xff

    .line 165
    .line 166
    shr-int/2addr v7, v4

    .line 167
    aget-byte v7, v1, v7

    .line 168
    .line 169
    aput-byte v7, v2, v6

    .line 170
    .line 171
    add-int/lit8 v7, v6, 0x2

    .line 172
    .line 173
    and-int/lit8 v3, v3, 0x3

    .line 174
    .line 175
    shl-int/lit8 v3, v3, 0x4

    .line 176
    .line 177
    and-int/lit16 v9, p0, 0xff

    .line 178
    .line 179
    shr-int/lit8 v9, v9, 0x4

    .line 180
    .line 181
    or-int/2addr v3, v9

    .line 182
    aget-byte v3, v1, v3

    .line 183
    .line 184
    aput-byte v3, v2, v5

    .line 185
    .line 186
    add-int/lit8 v6, v6, 0x3

    .line 187
    .line 188
    and-int/lit8 p0, p0, 0xf

    .line 189
    .line 190
    shl-int/2addr p0, v4

    .line 191
    aget-byte p0, v1, p0

    .line 192
    .line 193
    aput-byte p0, v2, v7

    .line 194
    .line 195
    aput-byte v8, v2, v6

    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_2
    aget-byte p0, p0, v3

    .line 199
    .line 200
    add-int/lit8 v3, v6, 0x1

    .line 201
    .line 202
    and-int/lit16 v5, p0, 0xff

    .line 203
    .line 204
    shr-int/lit8 v4, v5, 0x2

    .line 205
    .line 206
    aget-byte v4, v1, v4

    .line 207
    .line 208
    aput-byte v4, v2, v6

    .line 209
    .line 210
    add-int/lit8 v4, v6, 0x2

    .line 211
    .line 212
    and-int/lit8 p0, p0, 0x3

    .line 213
    .line 214
    shl-int/lit8 p0, p0, 0x4

    .line 215
    .line 216
    aget-byte p0, v1, p0

    .line 217
    .line 218
    aput-byte p0, v2, v3

    .line 219
    .line 220
    add-int/lit8 v6, v6, 0x3

    .line 221
    .line 222
    aput-byte v8, v2, v4

    .line 223
    .line 224
    aput-byte v8, v2, v6

    .line 225
    .line 226
    :goto_1
    new-instance p0, Ljava/lang/String;

    .line 227
    .line 228
    sget-object v1, Lwq;->a:Ljava/nio/charset/Charset;

    .line 229
    .line 230
    invoke-direct {p0, v2, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    return-object p0
.end method

.method public static W(Ljava/io/File;)Ljava/io/File;
    .locals 8

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    const-string v1, "bootstrap.nkr"

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static {v1, v2}, Lup0;->y(Ljava/nio/file/Path;Ljava/nio/file/Path;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, ".tmp"

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    new-array v4, v3, [Ljava/nio/file/attribute/FileAttribute;

    .line 31
    .line 32
    const-string v5, "bootstrap."

    .line 33
    .line 34
    invoke-static {v1, v5, v2, v4}, Ljava/nio/file/Files;->createTempFile(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    sget-object v2, Lup0;->i:Landroid/content/Context;

    .line 39
    .line 40
    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const-string v4, "nuke/native/bootstrap.nkr"

    .line 45
    .line 46
    invoke-virtual {v2, v4}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    :try_start_0
    new-instance v4, Ljava/io/FileOutputStream;

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/nio/file/Path;->toFile()Ljava/io/File;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-direct {v4, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    const/16 v5, 0x4000

    .line 60
    .line 61
    :try_start_1
    new-array v5, v5, [B

    .line 62
    .line 63
    :goto_0
    invoke-virtual {v2, v5}, Ljava/io/InputStream;->read([B)I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    const/4 v7, -0x1

    .line 68
    if-eq v6, v7, :cond_1

    .line 69
    .line 70
    invoke-virtual {v4, v5, v3, v6}, Ljava/io/FileOutputStream;->write([BII)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v3}, Ljava/io/FileDescriptor;->sync()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 79
    .line 80
    .line 81
    :try_start_2
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {v0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-static {p0, v1, v2}, Lup0;->g(Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;)V

    .line 96
    .line 97
    .line 98
    return-object v0

    .line 99
    :catchall_0
    move-exception p0

    .line 100
    goto :goto_2

    .line 101
    :catchall_1
    move-exception p0

    .line 102
    :try_start_3
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :catchall_2
    move-exception v0

    .line 107
    :try_start_4
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    :goto_1
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 111
    :goto_2
    if-eqz v2, :cond_2

    .line 112
    .line 113
    :try_start_5
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :catchall_3
    move-exception v0

    .line 118
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    :cond_2
    :goto_3
    throw p0
.end method

.method public static X()Lql1;
    .locals 7

    .line 1
    invoke-static {}, Ls11;->g0()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ls11;->H(Ljava/io/File;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-static {v0}, Ls11;->U(Ljava/io/File;)Ljava/nio/channels/FileChannel;

    .line 9
    .line 10
    .line 11
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    :try_start_1
    invoke-virtual {v1}, Ljava/nio/channels/FileChannel;->lock()Ljava/nio/channels/FileLock;

    .line 13
    .line 14
    .line 15
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    :try_start_2
    invoke-static {v0}, Ls11;->Y(Ljava/io/File;)Ljava/io/File;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-static {v0}, Ls11;->W(Ljava/io/File;)Ljava/io/File;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const-wide/16 v5, 0x0

    .line 25
    .line 26
    invoke-static {v0, v4, v5, v6}, Ls11;->l0(Ljava/io/File;Ljava/io/File;J)Lud0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v3, v0}, Ls11;->a0(Ljava/io/File;Lud0;)Lql1;

    .line 31
    .line 32
    .line 33
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    :try_start_3
    invoke-virtual {v2}, Ljava/nio/channels/FileLock;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    goto :goto_2

    .line 42
    :cond_0
    :goto_0
    :try_start_4
    invoke-virtual {v1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :catchall_1
    move-exception v0

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    :try_start_5
    invoke-virtual {v2}, Ljava/nio/channels/FileLock;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :catchall_2
    move-exception v2

    .line 54
    :try_start_6
    invoke-virtual {v0, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    :goto_1
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 58
    :goto_2
    if-eqz v1, :cond_2

    .line 59
    .line 60
    :try_start_7
    invoke-virtual {v1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 61
    .line 62
    .line 63
    goto :goto_3

    .line 64
    :catchall_3
    move-exception v1

    .line 65
    :try_start_8
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    :cond_2
    :goto_3
    throw v0
    :try_end_8
    .catch Ljava/lang/SecurityException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 69
    :catch_0
    move-exception v0

    .line 70
    new-instance v1, Ljava/lang/SecurityException;

    .line 71
    .line 72
    const-string v2, "Unable to prepare bootstrap Native release"

    .line 73
    .line 74
    invoke-direct {v1, v2, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    throw v1

    .line 78
    :catch_1
    move-exception v0

    .line 79
    throw v0
.end method

.method public static Y(Ljava/io/File;)Ljava/io/File;
    .locals 9

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    sget-object v1, Lup0;->l:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Ljava/io/File;

    .line 9
    .line 10
    const-string v2, "bridge"

    .line 11
    .line 12
    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Ls11;->H(Ljava/io/File;)V

    .line 16
    .line 17
    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 24
    .line 25
    .line 26
    move-result-wide v3

    .line 27
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v3, "-"

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    new-instance v3, Ljava/io/File;

    .line 47
    .line 48
    const-string v4, "-libnuke_bridge.so"

    .line 49
    .line 50
    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-direct {v3, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v3}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-static {v2, v4}, Lup0;->y(Ljava/nio/file/Path;Ljava/nio/file/Path;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_0

    .line 70
    .line 71
    :try_start_0
    invoke-static {v3}, Lcm1;->k(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    return-object v3

    .line 75
    :catch_0
    invoke-virtual {v3}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-static {v2}, Ljava/nio/file/Files;->deleteIfExists(Ljava/nio/file/Path;)Z

    .line 80
    .line 81
    .line 82
    :cond_0
    new-instance v2, Ljava/util/zip/ZipFile;

    .line 83
    .line 84
    invoke-direct {v2, v0}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V

    .line 85
    .line 86
    .line 87
    :try_start_1
    const-string v0, "lib/arm64-v8a/libnuke_bridge.so"

    .line 88
    .line 89
    invoke-virtual {v2, v0}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-eqz v0, :cond_3

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-nez v4, :cond_3

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->getSize()J

    .line 102
    .line 103
    .line 104
    move-result-wide v4

    .line 105
    const-wide/16 v6, 0x0

    .line 106
    .line 107
    cmp-long v4, v4, v6

    .line 108
    .line 109
    if-lez v4, :cond_3

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    new-instance v4, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string v5, "."

    .line 128
    .line 129
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    const-string v5, ".tmp"

    .line 137
    .line 138
    const/4 v6, 0x0

    .line 139
    new-array v7, v6, [Ljava/nio/file/attribute/FileAttribute;

    .line 140
    .line 141
    invoke-static {v1, v4, v5, v7}, Ljava/nio/file/Files;->createTempFile(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v2, v0}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    .line 146
    .line 147
    .line 148
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 149
    :try_start_2
    new-instance v4, Ljava/io/FileOutputStream;

    .line 150
    .line 151
    invoke-interface {v1}, Ljava/nio/file/Path;->toFile()Ljava/io/File;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    invoke-direct {v4, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 156
    .line 157
    .line 158
    const/16 v5, 0x4000

    .line 159
    .line 160
    :try_start_3
    new-array v5, v5, [B

    .line 161
    .line 162
    :goto_0
    invoke-virtual {v0, v5}, Ljava/io/InputStream;->read([B)I

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    const/4 v8, -0x1

    .line 167
    if-eq v7, v8, :cond_1

    .line 168
    .line 169
    invoke-virtual {v4, v5, v6, v7}, Ljava/io/FileOutputStream;->write([BII)V

    .line 170
    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_1
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    invoke-virtual {v5}, Ljava/io/FileDescriptor;->sync()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 178
    .line 179
    .line 180
    :try_start_4
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 181
    .line 182
    .line 183
    :try_start_5
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 184
    .line 185
    .line 186
    invoke-interface {v1}, Ljava/nio/file/Path;->toFile()Ljava/io/File;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {v0}, Lcm1;->k(Ljava/io/File;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    invoke-virtual {v3}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-static {p0, v1, v0}, Lup0;->g(Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;)V

    .line 202
    .line 203
    .line 204
    const/4 p0, 0x1

    .line 205
    invoke-virtual {v3, p0, p0}, Ljava/io/File;->setReadable(ZZ)Z

    .line 206
    .line 207
    .line 208
    invoke-virtual {v3, p0, p0}, Ljava/io/File;->setExecutable(ZZ)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V

    .line 212
    .line 213
    .line 214
    return-object v3

    .line 215
    :catchall_0
    move-exception p0

    .line 216
    goto :goto_4

    .line 217
    :catchall_1
    move-exception p0

    .line 218
    goto :goto_2

    .line 219
    :catchall_2
    move-exception p0

    .line 220
    :try_start_6
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 221
    .line 222
    .line 223
    goto :goto_1

    .line 224
    :catchall_3
    move-exception v1

    .line 225
    :try_start_7
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 226
    .line 227
    .line 228
    :goto_1
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 229
    :goto_2
    if-eqz v0, :cond_2

    .line 230
    .line 231
    :try_start_8
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 232
    .line 233
    .line 234
    goto :goto_3

    .line 235
    :catchall_4
    move-exception v0

    .line 236
    :try_start_9
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 237
    .line 238
    .line 239
    :cond_2
    :goto_3
    throw p0

    .line 240
    :cond_3
    new-instance p0, Ljava/lang/SecurityException;

    .line 241
    .line 242
    const-string v0, "Bundled Native Bridge is missing"

    .line 243
    .line 244
    invoke-direct {p0, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    throw p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 248
    :goto_4
    :try_start_a
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 249
    .line 250
    .line 251
    goto :goto_5

    .line 252
    :catchall_5
    move-exception v0

    .line 253
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 254
    .line 255
    .line 256
    :goto_5
    throw p0
.end method

.method public static Z()Lql1;
    .locals 21

    .line 1
    invoke-static {}, Ls11;->g0()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ls11;->H(Ljava/io/File;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-static {v0}, Ls11;->U(Ljava/io/File;)Ljava/nio/channels/FileChannel;

    .line 9
    .line 10
    .line 11
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    :try_start_1
    invoke-virtual {v1}, Ljava/nio/channels/FileChannel;->lock()Ljava/nio/channels/FileLock;

    .line 13
    .line 14
    .line 15
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 16
    :try_start_2
    invoke-static {v0}, Ls11;->Y(Ljava/io/File;)Ljava/io/File;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-static {v0}, Ls11;->c0(Ljava/io/File;)Lud0;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    invoke-static {v0}, Ls11;->W(Ljava/io/File;)Ljava/io/File;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const-wide/16 v5, 0x0

    .line 31
    .line 32
    invoke-static {v0, v3, v5, v6}, Ls11;->l0(Ljava/io/File;Ljava/io/File;J)Lud0;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    iget-object v5, v3, Lud0;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v5, Lb5;

    .line 39
    .line 40
    iget-object v6, v3, Lud0;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v6, Ljava/io/File;

    .line 43
    .line 44
    iget-wide v7, v3, Lud0;->a:J

    .line 45
    .line 46
    invoke-static {v7, v8, v5, v0, v6}, Ls11;->r0(JLb5;Ljava/io/File;Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    :goto_0
    move-object/from16 v20, v1

    .line 52
    .line 53
    :goto_1
    move-object v1, v0

    .line 54
    goto/16 :goto_5

    .line 55
    .line 56
    :cond_0
    :goto_2
    :try_start_3
    iget-object v5, v3, Lud0;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v5, Lb5;

    .line 59
    .line 60
    iget-object v6, v5, Lb5;->i:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v6, Lh80;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 63
    .line 64
    :try_start_4
    iget-object v7, v6, Lh80;->a:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0, v7}, Ls11;->b0(Ljava/io/File;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    new-instance v0, Lql1;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 70
    .line 71
    :try_start_5
    iget-object v7, v5, Lb5;->j:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v7, Ljava/io/File;

    .line 74
    .line 75
    iget-object v8, v3, Lud0;->c:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v8, Ljava/io/File;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 78
    .line 79
    move-object v9, v7

    .line 80
    :try_start_6
    iget-object v7, v6, Lh80;->a:Ljava/lang/String;

    .line 81
    .line 82
    move-object v11, v8

    .line 83
    move-object v10, v9

    .line 84
    iget-wide v8, v6, Lh80;->b:J

    .line 85
    .line 86
    move-object v12, v10

    .line 87
    iget-object v10, v6, Lh80;->f:Ljava/lang/String;

    .line 88
    .line 89
    move-object v14, v11

    .line 90
    move-object v13, v12

    .line 91
    iget-wide v11, v3, Lud0;->a:J
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 92
    .line 93
    :try_start_7
    iget-object v3, v3, Lud0;->d:Ljava/io/Serializable;

    .line 94
    .line 95
    check-cast v3, Ljava/io/File;

    .line 96
    .line 97
    iget-object v5, v5, Lb5;->k:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v5, Ljava/lang/String;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 100
    .line 101
    :try_start_8
    invoke-virtual {v14}, Ljava/io/File;->length()J

    .line 102
    .line 103
    .line 104
    move-result-wide v15
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 105
    move-object/from16 v17, v0

    .line 106
    .line 107
    :try_start_9
    iget-object v0, v6, Lh80;->i:Ljava/io/Serializable;

    .line 108
    .line 109
    check-cast v0, Ljava/lang/String;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 110
    .line 111
    move-object/from16 v18, v0

    .line 112
    .line 113
    move-object/from16 v20, v1

    .line 114
    .line 115
    :try_start_a
    iget-wide v0, v6, Lh80;->g:J

    .line 116
    .line 117
    move-object v6, v14

    .line 118
    move-object v14, v5

    .line 119
    move-object v5, v13

    .line 120
    move-object v13, v3

    .line 121
    move-object/from16 v3, v17

    .line 122
    .line 123
    move-object/from16 v17, v18

    .line 124
    .line 125
    move-wide/from16 v18, v0

    .line 126
    .line 127
    invoke-direct/range {v3 .. v19}, Lql1;-><init>(Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/lang/String;JLjava/lang/String;JLjava/io/File;Ljava/lang/String;JLjava/lang/String;J)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 128
    .line 129
    .line 130
    move-object/from16 v17, v3

    .line 131
    .line 132
    if-eqz v2, :cond_1

    .line 133
    .line 134
    :try_start_b
    invoke-virtual {v2}, Ljava/nio/channels/FileLock;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 135
    .line 136
    .line 137
    goto :goto_4

    .line 138
    :catchall_1
    move-exception v0

    .line 139
    :goto_3
    move-object v1, v0

    .line 140
    goto :goto_7

    .line 141
    :cond_1
    :goto_4
    :try_start_c
    invoke-virtual/range {v20 .. v20}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_c
    .catch Ljava/lang/SecurityException; {:try_start_c .. :try_end_c} :catch_1
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    .line 142
    .line 143
    .line 144
    return-object v17

    .line 145
    :catchall_2
    move-exception v0

    .line 146
    goto :goto_1

    .line 147
    :catchall_3
    move-exception v0

    .line 148
    goto :goto_0

    .line 149
    :goto_5
    if-eqz v2, :cond_2

    .line 150
    .line 151
    :try_start_d
    invoke-virtual {v2}, Ljava/nio/channels/FileLock;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 152
    .line 153
    .line 154
    goto :goto_6

    .line 155
    :catchall_4
    move-exception v0

    .line 156
    :try_start_e
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    :cond_2
    :goto_6
    throw v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 160
    :catchall_5
    move-exception v0

    .line 161
    move-object/from16 v20, v1

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :goto_7
    if-eqz v20, :cond_3

    .line 165
    .line 166
    :try_start_f
    invoke-virtual/range {v20 .. v20}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 167
    .line 168
    .line 169
    goto :goto_8

    .line 170
    :catchall_6
    move-exception v0

    .line 171
    :try_start_10
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 172
    .line 173
    .line 174
    :cond_3
    :goto_8
    throw v1
    :try_end_10
    .catch Ljava/lang/SecurityException; {:try_start_10 .. :try_end_10} :catch_1
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_0

    .line 175
    :catch_0
    move-exception v0

    .line 176
    new-instance v1, Ljava/lang/SecurityException;

    .line 177
    .line 178
    const-string v2, "Unable to prepare Native runtime"

    .line 179
    .line 180
    invoke-direct {v1, v2, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 181
    .line 182
    .line 183
    throw v1

    .line 184
    :catch_1
    move-exception v0

    .line 185
    throw v0
.end method

.method public static a(FI)Lid;
    .locals 10

    .line 1
    and-int/lit8 p1, p1, 0x2

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    move p0, v0

    .line 7
    :cond_0
    new-instance v1, Lid;

    .line 8
    .line 9
    sget-object v2, Lrg3;->n:Ln43;

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    new-instance v4, Ljd;

    .line 16
    .line 17
    invoke-direct {v4, p0}, Ljd;-><init>(F)V

    .line 18
    .line 19
    .line 20
    const-wide/high16 v5, -0x8000000000000000L

    .line 21
    .line 22
    const-wide/high16 v7, -0x8000000000000000L

    .line 23
    .line 24
    const/4 v9, 0x0

    .line 25
    invoke-direct/range {v1 .. v9}, Lid;-><init>(Ln43;Ljava/lang/Object;Lnd;JJZ)V

    .line 26
    .line 27
    .line 28
    return-object v1
.end method

.method public static a0(Ljava/io/File;Lud0;)Lql1;
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    new-instance v1, Lql1;

    .line 4
    .line 5
    iget-object v2, v0, Lud0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lb5;

    .line 8
    .line 9
    iget-object v3, v2, Lb5;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Ljava/io/File;

    .line 12
    .line 13
    iget-object v4, v0, Lud0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Ljava/io/File;

    .line 16
    .line 17
    iget-object v5, v2, Lb5;->i:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v5, Lh80;

    .line 20
    .line 21
    move-object v6, v3

    .line 22
    move-object v3, v4

    .line 23
    iget-object v4, v5, Lh80;->a:Ljava/lang/String;

    .line 24
    .line 25
    iget-wide v7, v5, Lh80;->b:J

    .line 26
    .line 27
    iget-object v5, v5, Lh80;->f:Ljava/lang/String;

    .line 28
    .line 29
    move-object v10, v5

    .line 30
    move-wide/from16 v17, v7

    .line 31
    .line 32
    move-object v7, v6

    .line 33
    move-wide/from16 v5, v17

    .line 34
    .line 35
    iget-wide v8, v0, Lud0;->a:J

    .line 36
    .line 37
    iget-object v0, v0, Lud0;->d:Ljava/io/Serializable;

    .line 38
    .line 39
    check-cast v0, Ljava/io/File;

    .line 40
    .line 41
    iget-object v11, v2, Lb5;->k:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v11, Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/io/File;->length()J

    .line 46
    .line 47
    .line 48
    move-result-wide v12

    .line 49
    iget-object v2, v2, Lb5;->i:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Lh80;

    .line 52
    .line 53
    iget-object v14, v2, Lh80;->i:Ljava/io/Serializable;

    .line 54
    .line 55
    check-cast v14, Ljava/lang/String;

    .line 56
    .line 57
    move-object/from16 p1, v0

    .line 58
    .line 59
    move-object v15, v1

    .line 60
    iget-wide v0, v2, Lh80;->g:J

    .line 61
    .line 62
    move-wide/from16 v17, v0

    .line 63
    .line 64
    move-object v0, v15

    .line 65
    move-wide/from16 v15, v17

    .line 66
    .line 67
    move-object/from16 v1, p0

    .line 68
    .line 69
    move-object v2, v7

    .line 70
    move-object v7, v10

    .line 71
    move-object/from16 v10, p1

    .line 72
    .line 73
    invoke-direct/range {v0 .. v16}, Lql1;-><init>(Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/lang/String;JLjava/lang/String;JLjava/io/File;Ljava/lang/String;JLjava/lang/String;J)V

    .line 74
    .line 75
    .line 76
    move-object v15, v0

    .line 77
    return-object v15
.end method

.method public static final b(Lch;Lxm0;Lin0;Lpx;I)V
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v4, p4

    .line 4
    .line 5
    iget-object v0, v1, Lch;->f:Lfh;

    .line 6
    .line 7
    move-object/from16 v8, p3

    .line 8
    .line 9
    check-cast v8, Lgo0;

    .line 10
    .line 11
    const v2, 0x4901e0e0    # 531982.0f

    .line 12
    .line 13
    .line 14
    invoke-virtual {v8, v2}, Lgo0;->X(I)Lgo0;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v2, v4, 0x6

    .line 18
    .line 19
    const/4 v3, 0x4

    .line 20
    if-nez v2, :cond_2

    .line 21
    .line 22
    and-int/lit8 v2, v4, 0x8

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v8, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v8, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    :goto_0
    if-eqz v2, :cond_1

    .line 36
    .line 37
    move v2, v3

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const/4 v2, 0x2

    .line 40
    :goto_1
    or-int/2addr v2, v4

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move v2, v4

    .line 43
    :goto_2
    and-int/lit8 v5, v4, 0x30

    .line 44
    .line 45
    move-object/from16 v11, p1

    .line 46
    .line 47
    if-nez v5, :cond_4

    .line 48
    .line 49
    invoke-virtual {v8, v11}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_3

    .line 54
    .line 55
    const/16 v5, 0x20

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    const/16 v5, 0x10

    .line 59
    .line 60
    :goto_3
    or-int/2addr v2, v5

    .line 61
    :cond_4
    and-int/lit16 v5, v4, 0x180

    .line 62
    .line 63
    move-object/from16 v12, p2

    .line 64
    .line 65
    if-nez v5, :cond_6

    .line 66
    .line 67
    invoke-virtual {v8, v12}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_5

    .line 72
    .line 73
    const/16 v5, 0x100

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_5
    const/16 v5, 0x80

    .line 77
    .line 78
    :goto_4
    or-int/2addr v2, v5

    .line 79
    :cond_6
    and-int/lit16 v5, v2, 0x93

    .line 80
    .line 81
    const/16 v6, 0x92

    .line 82
    .line 83
    const/4 v7, 0x1

    .line 84
    if-eq v5, v6, :cond_7

    .line 85
    .line 86
    move v5, v7

    .line 87
    goto :goto_5

    .line 88
    :cond_7
    const/4 v5, 0x0

    .line 89
    :goto_5
    and-int/lit8 v6, v2, 0x1

    .line 90
    .line 91
    invoke-virtual {v8, v6, v5}, Lgo0;->O(IZ)Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-eqz v5, :cond_2c

    .line 96
    .line 97
    and-int/lit8 v5, v2, 0xe

    .line 98
    .line 99
    if-eq v5, v3, :cond_9

    .line 100
    .line 101
    and-int/lit8 v6, v2, 0x8

    .line 102
    .line 103
    if-eqz v6, :cond_8

    .line 104
    .line 105
    invoke-virtual {v8, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    if-eqz v6, :cond_8

    .line 110
    .line 111
    goto :goto_6

    .line 112
    :cond_8
    const/4 v6, 0x0

    .line 113
    goto :goto_7

    .line 114
    :cond_9
    :goto_6
    move v6, v7

    .line 115
    :goto_7
    invoke-virtual {v8}, Lgo0;->L()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    sget-object v10, Lnx;->a:Leb;

    .line 120
    .line 121
    if-nez v6, :cond_a

    .line 122
    .line 123
    if-ne v9, v10, :cond_b

    .line 124
    .line 125
    :cond_a
    iget v6, v1, Lch;->b:I

    .line 126
    .line 127
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    invoke-static {v6}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 132
    .line 133
    .line 134
    move-result-object v9

    .line 135
    invoke-virtual {v8, v9}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_b
    move-object v15, v9

    .line 139
    check-cast v15, Lxk1;

    .line 140
    .line 141
    if-eq v5, v3, :cond_d

    .line 142
    .line 143
    and-int/lit8 v6, v2, 0x8

    .line 144
    .line 145
    if-eqz v6, :cond_c

    .line 146
    .line 147
    invoke-virtual {v8, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-eqz v6, :cond_c

    .line 152
    .line 153
    goto :goto_8

    .line 154
    :cond_c
    const/4 v6, 0x0

    .line 155
    goto :goto_9

    .line 156
    :cond_d
    :goto_8
    move v6, v7

    .line 157
    :goto_9
    invoke-virtual {v8}, Lgo0;->L()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v9

    .line 161
    if-nez v6, :cond_e

    .line 162
    .line 163
    if-ne v9, v10, :cond_f

    .line 164
    .line 165
    :cond_e
    iget-wide v13, v1, Lch;->a:J

    .line 166
    .line 167
    invoke-static {v13, v14}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    invoke-static {v6}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 172
    .line 173
    .line 174
    move-result-object v9

    .line 175
    invoke-virtual {v8, v9}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    :cond_f
    move-object/from16 v22, v9

    .line 179
    .line 180
    check-cast v22, Lxk1;

    .line 181
    .line 182
    if-eq v5, v3, :cond_11

    .line 183
    .line 184
    and-int/lit8 v6, v2, 0x8

    .line 185
    .line 186
    if-eqz v6, :cond_10

    .line 187
    .line 188
    invoke-virtual {v8, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v6

    .line 192
    if-eqz v6, :cond_10

    .line 193
    .line 194
    goto :goto_a

    .line 195
    :cond_10
    const/4 v6, 0x0

    .line 196
    goto :goto_b

    .line 197
    :cond_11
    :goto_a
    move v6, v7

    .line 198
    :goto_b
    invoke-virtual {v8}, Lgo0;->L()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    if-nez v6, :cond_12

    .line 203
    .line 204
    if-ne v9, v10, :cond_13

    .line 205
    .line 206
    :cond_12
    iget-boolean v6, v0, Lfh;->a:Z

    .line 207
    .line 208
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    invoke-static {v6}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 213
    .line 214
    .line 215
    move-result-object v9

    .line 216
    invoke-virtual {v8, v9}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    :cond_13
    move-object/from16 v17, v9

    .line 220
    .line 221
    check-cast v17, Lxk1;

    .line 222
    .line 223
    if-eq v5, v3, :cond_15

    .line 224
    .line 225
    and-int/lit8 v6, v2, 0x8

    .line 226
    .line 227
    if-eqz v6, :cond_14

    .line 228
    .line 229
    invoke-virtual {v8, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v6

    .line 233
    if-eqz v6, :cond_14

    .line 234
    .line 235
    goto :goto_c

    .line 236
    :cond_14
    const/4 v6, 0x0

    .line 237
    goto :goto_d

    .line 238
    :cond_15
    :goto_c
    move v6, v7

    .line 239
    :goto_d
    invoke-virtual {v8}, Lgo0;->L()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v9

    .line 243
    if-nez v6, :cond_16

    .line 244
    .line 245
    if-ne v9, v10, :cond_17

    .line 246
    .line 247
    :cond_16
    iget-boolean v6, v1, Lch;->c:Z

    .line 248
    .line 249
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    invoke-static {v6}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 254
    .line 255
    .line 256
    move-result-object v9

    .line 257
    invoke-virtual {v8, v9}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    :cond_17
    move-object v14, v9

    .line 261
    check-cast v14, Lxk1;

    .line 262
    .line 263
    if-eq v5, v3, :cond_19

    .line 264
    .line 265
    and-int/lit8 v6, v2, 0x8

    .line 266
    .line 267
    if-eqz v6, :cond_18

    .line 268
    .line 269
    invoke-virtual {v8, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v6

    .line 273
    if-eqz v6, :cond_18

    .line 274
    .line 275
    goto :goto_e

    .line 276
    :cond_18
    const/4 v6, 0x0

    .line 277
    goto :goto_f

    .line 278
    :cond_19
    :goto_e
    move v6, v7

    .line 279
    :goto_f
    invoke-virtual {v8}, Lgo0;->L()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v9

    .line 283
    if-nez v6, :cond_1a

    .line 284
    .line 285
    if-ne v9, v10, :cond_1b

    .line 286
    .line 287
    :cond_1a
    iget-object v6, v1, Lch;->d:Ljava/util/Set;

    .line 288
    .line 289
    invoke-static {v6}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 290
    .line 291
    .line 292
    move-result-object v9

    .line 293
    invoke-virtual {v8, v9}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    :cond_1b
    check-cast v9, Lxk1;

    .line 297
    .line 298
    if-eq v5, v3, :cond_1d

    .line 299
    .line 300
    and-int/lit8 v6, v2, 0x8

    .line 301
    .line 302
    if-eqz v6, :cond_1c

    .line 303
    .line 304
    invoke-virtual {v8, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v6

    .line 308
    if-eqz v6, :cond_1c

    .line 309
    .line 310
    goto :goto_10

    .line 311
    :cond_1c
    const/4 v6, 0x0

    .line 312
    goto :goto_11

    .line 313
    :cond_1d
    :goto_10
    move v6, v7

    .line 314
    :goto_11
    invoke-virtual {v8}, Lgo0;->L()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v13

    .line 318
    if-nez v6, :cond_1e

    .line 319
    .line 320
    if-ne v13, v10, :cond_1f

    .line 321
    .line 322
    :cond_1e
    iget-object v6, v1, Lch;->e:Ljava/util/Set;

    .line 323
    .line 324
    invoke-static {v6}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 325
    .line 326
    .line 327
    move-result-object v13

    .line 328
    invoke-virtual {v8, v13}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    :cond_1f
    check-cast v13, Lxk1;

    .line 332
    .line 333
    invoke-virtual {v8}, Lgo0;->L()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v6

    .line 337
    if-ne v6, v10, :cond_20

    .line 338
    .line 339
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 340
    .line 341
    invoke-static {v6}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 342
    .line 343
    .line 344
    move-result-object v6

    .line 345
    invoke-virtual {v8, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    :cond_20
    check-cast v6, Lxk1;

    .line 349
    .line 350
    if-eq v5, v3, :cond_22

    .line 351
    .line 352
    and-int/lit8 v3, v2, 0x8

    .line 353
    .line 354
    if-eqz v3, :cond_21

    .line 355
    .line 356
    invoke-virtual {v8, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v3

    .line 360
    if-eqz v3, :cond_21

    .line 361
    .line 362
    goto :goto_12

    .line 363
    :cond_21
    const/4 v3, 0x0

    .line 364
    goto :goto_13

    .line 365
    :cond_22
    :goto_12
    move v3, v7

    .line 366
    :goto_13
    invoke-virtual {v8}, Lgo0;->L()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v5

    .line 370
    if-nez v3, :cond_23

    .line 371
    .line 372
    if-ne v5, v10, :cond_24

    .line 373
    .line 374
    :cond_23
    iget-object v0, v0, Lfh;->b:Ljava/lang/String;

    .line 375
    .line 376
    invoke-static {v0}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 377
    .line 378
    .line 379
    move-result-object v5

    .line 380
    invoke-virtual {v8, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    :cond_24
    move-object/from16 v18, v5

    .line 384
    .line 385
    check-cast v18, Lxk1;

    .line 386
    .line 387
    invoke-interface/range {v22 .. v22}, Lgu2;->getValue()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    check-cast v0, Ljava/lang/String;

    .line 392
    .line 393
    invoke-static {v0}, Lwv2;->f0(Ljava/lang/String;)Ljava/lang/Long;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    if-eqz v0, :cond_26

    .line 398
    .line 399
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 400
    .line 401
    .line 402
    move-result-wide v19

    .line 403
    const-wide/16 v23, 0x0

    .line 404
    .line 405
    cmp-long v3, v23, v19

    .line 406
    .line 407
    if-gtz v3, :cond_25

    .line 408
    .line 409
    const-wide/32 v23, 0xea61

    .line 410
    .line 411
    .line 412
    cmp-long v3, v19, v23

    .line 413
    .line 414
    if-gez v3, :cond_25

    .line 415
    .line 416
    move v3, v7

    .line 417
    goto :goto_14

    .line 418
    :cond_25
    const/4 v3, 0x0

    .line 419
    :goto_14
    if-eqz v3, :cond_26

    .line 420
    .line 421
    move/from16 v19, v7

    .line 422
    .line 423
    goto :goto_15

    .line 424
    :cond_26
    const/16 v19, 0x0

    .line 425
    .line 426
    :goto_15
    const v3, 0x790b0061

    .line 427
    .line 428
    .line 429
    invoke-static {v3, v8}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    const v5, 0x790b0062

    .line 434
    .line 435
    .line 436
    invoke-static {v5, v8}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v5

    .line 440
    const v7, 0x790b005a

    .line 441
    .line 442
    .line 443
    invoke-static {v7, v8}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v20

    .line 447
    const v7, 0x790b005d

    .line 448
    .line 449
    .line 450
    invoke-static {v7, v8}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v7

    .line 454
    invoke-interface {v14}, Lgu2;->getValue()Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v16

    .line 458
    check-cast v16, Ljava/lang/Boolean;

    .line 459
    .line 460
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Boolean;->booleanValue()Z

    .line 461
    .line 462
    .line 463
    move-result v16

    .line 464
    if-eqz v16, :cond_27

    .line 465
    .line 466
    invoke-interface {v9}, Lgu2;->getValue()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v16

    .line 470
    check-cast v16, Ljava/util/Set;

    .line 471
    .line 472
    :goto_16
    move-object/from16 v21, v16

    .line 473
    .line 474
    goto :goto_17

    .line 475
    :cond_27
    invoke-interface {v13}, Lgu2;->getValue()Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v16

    .line 479
    check-cast v16, Ljava/util/Set;

    .line 480
    .line 481
    goto :goto_16

    .line 482
    :goto_17
    invoke-interface {v6}, Lgu2;->getValue()Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v16

    .line 486
    check-cast v16, Ljava/lang/Boolean;

    .line 487
    .line 488
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Boolean;->booleanValue()Z

    .line 489
    .line 490
    .line 491
    move-result v16

    .line 492
    if-eqz v16, :cond_2b

    .line 493
    .line 494
    const v0, -0xe4f6c5d

    .line 495
    .line 496
    .line 497
    invoke-virtual {v8, v0}, Lgo0;->W(I)V

    .line 498
    .line 499
    .line 500
    invoke-interface {v14}, Lgu2;->getValue()Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    check-cast v0, Ljava/lang/Boolean;

    .line 505
    .line 506
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 507
    .line 508
    .line 509
    move-result v5

    .line 510
    invoke-virtual {v8}, Lgo0;->L()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    if-ne v0, v10, :cond_28

    .line 515
    .line 516
    new-instance v0, Lf0;

    .line 517
    .line 518
    const/16 v2, 0xa

    .line 519
    .line 520
    invoke-direct {v0, v6, v2}, Lf0;-><init>(Lxk1;I)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v8, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 524
    .line 525
    .line 526
    :cond_28
    move-object v7, v0

    .line 527
    check-cast v7, Lxm0;

    .line 528
    .line 529
    invoke-virtual {v8, v14}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    move-result v0

    .line 533
    invoke-virtual {v8, v9}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 534
    .line 535
    .line 536
    move-result v2

    .line 537
    or-int/2addr v0, v2

    .line 538
    invoke-virtual {v8, v13}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 539
    .line 540
    .line 541
    move-result v2

    .line 542
    or-int/2addr v0, v2

    .line 543
    invoke-virtual {v8}, Lgo0;->L()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    if-nez v0, :cond_29

    .line 548
    .line 549
    if-ne v2, v10, :cond_2a

    .line 550
    .line 551
    :cond_29
    new-instance v23, Llh;

    .line 552
    .line 553
    const/16 v28, 0x0

    .line 554
    .line 555
    move-object/from16 v27, v6

    .line 556
    .line 557
    move-object/from16 v25, v9

    .line 558
    .line 559
    move-object/from16 v26, v13

    .line 560
    .line 561
    move-object/from16 v24, v14

    .line 562
    .line 563
    invoke-direct/range {v23 .. v28}, Llh;-><init>(Lxk1;Lxk1;Lxk1;Lxk1;I)V

    .line 564
    .line 565
    .line 566
    move-object/from16 v2, v23

    .line 567
    .line 568
    invoke-virtual {v8, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 569
    .line 570
    .line 571
    :cond_2a
    check-cast v2, Lin0;

    .line 572
    .line 573
    const/16 v10, 0x180

    .line 574
    .line 575
    move-object v9, v8

    .line 576
    move-object/from16 v6, v21

    .line 577
    .line 578
    move-object v8, v2

    .line 579
    invoke-static/range {v5 .. v10}, Ls11;->q(ZLjava/util/Set;Lxm0;Lin0;Lpx;I)V

    .line 580
    .line 581
    .line 582
    move-object v8, v9

    .line 583
    const/4 v6, 0x0

    .line 584
    invoke-virtual {v8, v6}, Lgo0;->p(Z)V

    .line 585
    .line 586
    .line 587
    invoke-virtual {v8}, Lgo0;->r()Lb62;

    .line 588
    .line 589
    .line 590
    move-result-object v6

    .line 591
    if-eqz v6, :cond_2d

    .line 592
    .line 593
    new-instance v0, Lsh;

    .line 594
    .line 595
    const/4 v5, 0x0

    .line 596
    move-object v2, v11

    .line 597
    move-object v3, v12

    .line 598
    invoke-direct/range {v0 .. v5}, Lsh;-><init>(Lch;Lxm0;Lin0;II)V

    .line 599
    .line 600
    .line 601
    :goto_18
    iput-object v0, v6, Lb62;->d:Lmn0;

    .line 602
    .line 603
    return-void

    .line 604
    :cond_2b
    move-object/from16 v27, v6

    .line 605
    .line 606
    move-object/from16 v25, v9

    .line 607
    .line 608
    move-object/from16 v16, v13

    .line 609
    .line 610
    const/4 v6, 0x0

    .line 611
    const v1, -0xe48663e

    .line 612
    .line 613
    .line 614
    invoke-virtual {v8, v1}, Lgo0;->W(I)V

    .line 615
    .line 616
    .line 617
    invoke-virtual {v8, v6}, Lgo0;->p(Z)V

    .line 618
    .line 619
    .line 620
    const v1, 0x790b0053

    .line 621
    .line 622
    .line 623
    invoke-static {v1, v8}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v4

    .line 627
    new-instance v9, Lth;

    .line 628
    .line 629
    move-object/from16 v10, p1

    .line 630
    .line 631
    move-object/from16 v12, p2

    .line 632
    .line 633
    move-object v11, v0

    .line 634
    move-object v13, v15

    .line 635
    move-object/from16 v15, v25

    .line 636
    .line 637
    invoke-direct/range {v9 .. v19}, Lth;-><init>(Lxm0;Ljava/lang/Long;Lin0;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;Z)V

    .line 638
    .line 639
    .line 640
    const v0, 0x173e407d

    .line 641
    .line 642
    .line 643
    invoke-static {v0, v9, v8}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 644
    .line 645
    .line 646
    move-result-object v6

    .line 647
    move-object/from16 v24, v14

    .line 648
    .line 649
    new-instance v14, Luh;

    .line 650
    .line 651
    move-object/from16 v15, v24

    .line 652
    .line 653
    move-object/from16 v24, v18

    .line 654
    .line 655
    move-object/from16 v18, v15

    .line 656
    .line 657
    move-object/from16 v16, v3

    .line 658
    .line 659
    move-object v15, v13

    .line 660
    move-object/from16 v26, v17

    .line 661
    .line 662
    move/from16 v23, v19

    .line 663
    .line 664
    move-object/from16 v25, v27

    .line 665
    .line 666
    move-object/from16 v17, v5

    .line 667
    .line 668
    move-object/from16 v19, v7

    .line 669
    .line 670
    invoke-direct/range {v14 .. v26}, Luh;-><init>(Lxk1;Ljava/lang/String;Ljava/lang/String;Lxk1;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lxk1;ZLxk1;Lxk1;Lxk1;)V

    .line 671
    .line 672
    .line 673
    const v0, -0x2d7de5cc

    .line 674
    .line 675
    .line 676
    invoke-static {v0, v14, v8}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 677
    .line 678
    .line 679
    move-result-object v7

    .line 680
    and-int/lit8 v0, v2, 0x70

    .line 681
    .line 682
    const v1, 0x1b0006

    .line 683
    .line 684
    .line 685
    or-int v9, v0, v1

    .line 686
    .line 687
    const/16 v10, 0x14

    .line 688
    .line 689
    const/4 v1, 0x1

    .line 690
    const/4 v3, 0x0

    .line 691
    const/4 v5, 0x0

    .line 692
    move-object/from16 v2, p1

    .line 693
    .line 694
    invoke-static/range {v1 .. v10}, Lqp0;->d(ZLxm0;Luh1;Ljava/lang/String;Ln80;Lnn0;Lkw;Lpx;II)V

    .line 695
    .line 696
    .line 697
    goto :goto_19

    .line 698
    :cond_2c
    invoke-virtual {v8}, Lgo0;->R()V

    .line 699
    .line 700
    .line 701
    :goto_19
    invoke-virtual {v8}, Lgo0;->r()Lb62;

    .line 702
    .line 703
    .line 704
    move-result-object v6

    .line 705
    if-eqz v6, :cond_2d

    .line 706
    .line 707
    new-instance v0, Lsh;

    .line 708
    .line 709
    const/4 v5, 0x1

    .line 710
    move-object/from16 v1, p0

    .line 711
    .line 712
    move-object/from16 v2, p1

    .line 713
    .line 714
    move-object/from16 v3, p2

    .line 715
    .line 716
    move/from16 v4, p4

    .line 717
    .line 718
    invoke-direct/range {v0 .. v5}, Lsh;-><init>(Lch;Lxm0;Lin0;II)V

    .line 719
    .line 720
    .line 721
    goto :goto_18

    .line 722
    :cond_2d
    return-void
.end method

.method public static b0(Ljava/io/File;Ljava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, Lpl1;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lpl1;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_2

    .line 11
    .line 12
    array-length v0, p1

    .line 13
    const/4 v1, 0x2

    .line 14
    if-gt v0, v1, :cond_0

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_0
    new-instance v0, Lqa;

    .line 18
    .line 19
    const/4 v2, 0x5

    .line 20
    invoke-direct {v0, v2}, Lqa;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    array-length v0, p1

    .line 27
    if-ge v1, v0, :cond_2

    .line 28
    .line 29
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    aget-object v2, p1, v1

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v0, v2}, Lup0;->p(Ljava/nio/file/Path;Ljava/nio/file/Path;)Ljava/nio/file/Path;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    sget-object v3, Ljava/nio/file/LinkOption;->NOFOLLOW_LINKS:Ljava/nio/file/LinkOption;

    .line 44
    .line 45
    filled-new-array {v3}, [Ljava/nio/file/LinkOption;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-interface {v0, v3}, Ljava/nio/file/Path;->toRealPath([Ljava/nio/file/LinkOption;)Ljava/nio/file/Path;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {v2, v0}, Ljava/nio/file/Path;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_1

    .line 58
    .line 59
    new-instance v0, Lol1;

    .line 60
    .line 61
    invoke-direct {v0}, Lol1;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-static {v2, v0}, Ljava/nio/file/Files;->walkFileTree(Ljava/nio/file/Path;Ljava/nio/file/FileVisitor;)Ljava/nio/file/Path;

    .line 65
    .line 66
    .line 67
    invoke-interface {v2}, Ljava/nio/file/Path;->getParent()Ljava/nio/file/Path;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0}, Lup0;->t(Ljava/nio/file/Path;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    new-instance v0, Ljava/lang/SecurityException;

    .line 76
    .line 77
    const-string v2, "Refusing to delete Native release root"

    .line 78
    .line 79
    invoke-direct {v0, v2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    :catch_0
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    :goto_2
    return-void
.end method

.method public static final c(Ljava/lang/String;Lpx;I)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v10, p2

    .line 4
    .line 5
    move-object/from16 v7, p1

    .line 6
    .line 7
    check-cast v7, Lgo0;

    .line 8
    .line 9
    const v1, -0xf491748

    .line 10
    .line 11
    .line 12
    invoke-virtual {v7, v1}, Lgo0;->X(I)Lgo0;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v7, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v11, 0x4

    .line 20
    const/4 v2, 0x2

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    move v1, v11

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v1, v2

    .line 26
    :goto_0
    or-int/2addr v1, v10

    .line 27
    and-int/lit8 v3, v1, 0x3

    .line 28
    .line 29
    if-eq v3, v2, :cond_1

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/4 v2, 0x0

    .line 34
    :goto_1
    and-int/lit8 v3, v1, 0x1

    .line 35
    .line 36
    invoke-virtual {v7, v3, v2}, Lgo0;->O(IZ)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    const/high16 v16, 0x41000000    # 8.0f

    .line 43
    .line 44
    const/16 v17, 0x7

    .line 45
    .line 46
    sget-object v12, Lrh1;->a:Lrh1;

    .line 47
    .line 48
    const/4 v13, 0x0

    .line 49
    const/4 v14, 0x0

    .line 50
    const/4 v15, 0x0

    .line 51
    invoke-static/range {v12 .. v17}, Lfg1;->G(Luh1;FFFFI)Luh1;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    sget-object v3, Lur1;->a:Ltu2;

    .line 56
    .line 57
    invoke-virtual {v7, v3}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Llp1;

    .line 62
    .line 63
    iget-wide v13, v3, Llp1;->f:J

    .line 64
    .line 65
    const/16 v3, 0xd

    .line 66
    .line 67
    invoke-static {v3}, Lrg3;->D(I)J

    .line 68
    .line 69
    .line 70
    move-result-wide v15

    .line 71
    const/16 v3, 0x12

    .line 72
    .line 73
    invoke-static {v3}, Lrg3;->D(I)J

    .line 74
    .line 75
    .line 76
    move-result-wide v21

    .line 77
    sget-object v17, Lim0;->k:Lim0;

    .line 78
    .line 79
    new-instance v12, Lm13;

    .line 80
    .line 81
    const/16 v24, 0x0

    .line 82
    .line 83
    const v25, 0xfdfff8

    .line 84
    .line 85
    .line 86
    const-wide/16 v18, 0x0

    .line 87
    .line 88
    const/16 v20, 0x0

    .line 89
    .line 90
    const/16 v23, 0x0

    .line 91
    .line 92
    invoke-direct/range {v12 .. v25}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 93
    .line 94
    .line 95
    and-int/lit8 v1, v1, 0xe

    .line 96
    .line 97
    or-int/lit8 v8, v1, 0x30

    .line 98
    .line 99
    const/16 v9, 0x3f8

    .line 100
    .line 101
    const/4 v3, 0x0

    .line 102
    const/4 v4, 0x0

    .line 103
    const/4 v5, 0x0

    .line 104
    const/4 v6, 0x0

    .line 105
    move-object v1, v2

    .line 106
    move-object v2, v12

    .line 107
    invoke-static/range {v0 .. v9}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_2
    invoke-virtual {v7}, Lgo0;->R()V

    .line 112
    .line 113
    .line 114
    :goto_2
    invoke-virtual {v7}, Lgo0;->r()Lb62;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    if-eqz v1, :cond_3

    .line 119
    .line 120
    new-instance v2, Ln0;

    .line 121
    .line 122
    invoke-direct {v2, v0, v10, v11}, Ln0;-><init>(Ljava/lang/String;II)V

    .line 123
    .line 124
    .line 125
    iput-object v2, v1, Lb62;->d:Lmn0;

    .line 126
    .line 127
    :cond_3
    return-void
.end method

.method public static c0(Ljava/io/File;)Lud0;
    .locals 10

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    const-string v1, "active.json"

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static {v1, v2}, Lup0;->y(Ljava/nio/file/Path;Ljava/nio/file/Path;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    goto/16 :goto_1

    .line 24
    .line 25
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 26
    .line 27
    new-instance v3, Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v0}, Ls11;->d0(Ljava/io/File;)[B

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 34
    .line 35
    invoke-direct {v3, v0, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v1, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v3, Ljava/io/File;

    .line 46
    .line 47
    const-string v4, "packageFile"

    .line 48
    .line 49
    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-static {v0, v3}, Lup0;->p(Ljava/nio/file/Path;Ljava/nio/file/Path;)Ljava/nio/file/Path;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {p0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-static {v3, v0}, Lup0;->y(Ljava/nio/file/Path;Ljava/nio/file/Path;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-nez v3, :cond_1

    .line 73
    .line 74
    goto/16 :goto_1

    .line 75
    .line 76
    :cond_1
    invoke-interface {v0}, Ljava/nio/file/Path;->toFile()Ljava/io/File;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    invoke-static {p0, v1, v8}, Ls11;->e0(Ljava/io/File;Lorg/json/JSONObject;Ljava/io/File;)Lud0;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_2
    invoke-static {v8, p0}, Lzl1;->f(Ljava/io/File;Ljava/io/File;)Lb5;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    iget-object v0, v7, Lb5;->i:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Lh80;

    .line 94
    .line 95
    const-string v3, "releaseId"

    .line 96
    .line 97
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    iget-object v4, v0, Lh80;->a:Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_6

    .line 108
    .line 109
    const-string v3, "generation"

    .line 110
    .line 111
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 112
    .line 113
    .line 114
    move-result-wide v3

    .line 115
    iget-wide v5, v0, Lh80;->b:J

    .line 116
    .line 117
    cmp-long v3, v3, v5

    .line 118
    .line 119
    if-nez v3, :cond_6

    .line 120
    .line 121
    const-string v3, "kid"

    .line 122
    .line 123
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    iget-object v0, v0, Lh80;->f:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-nez v0, :cond_3

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_3
    const-string v0, "sequence"

    .line 137
    .line 138
    const-wide/16 v3, 0x0

    .line 139
    .line 140
    invoke-virtual {v1, v0, v3, v4}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 141
    .line 142
    .line 143
    move-result-wide v5

    .line 144
    cmp-long v0, v5, v3

    .line 145
    .line 146
    if-nez v0, :cond_4

    .line 147
    .line 148
    move-object v9, v2

    .line 149
    goto :goto_0

    .line 150
    :cond_4
    new-instance v1, Ljava/io/File;

    .line 151
    .line 152
    iget-object v3, v7, Lb5;->j:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v3, Ljava/io/File;

    .line 155
    .line 156
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    const-string v4, "activation.json"

    .line 161
    .line 162
    invoke-direct {v1, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    move-object v9, v1

    .line 166
    :goto_0
    if-lez v0, :cond_5

    .line 167
    .line 168
    invoke-virtual {p0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {v9}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-static {v0, v1}, Lup0;->y(Ljava/nio/file/Path;Ljava/nio/file/Path;)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-nez v0, :cond_5

    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_5
    invoke-static {v5, v6, v7, p0, v8}, Ls11;->r0(JLb5;Ljava/io/File;Ljava/io/File;)V

    .line 184
    .line 185
    .line 186
    new-instance v4, Lud0;

    .line 187
    .line 188
    invoke-direct/range {v4 .. v9}, Lud0;-><init>(JLb5;Ljava/io/File;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 189
    .line 190
    .line 191
    return-object v4

    .line 192
    :catch_0
    :cond_6
    :goto_1
    return-object v2
.end method

.method public static final d(Lkw;Lpx;I)V
    .locals 8

    .line 1
    check-cast p1, Lgo0;

    .line 2
    .line 3
    const v0, -0x64caa31a

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lgo0;->X(I)Lgo0;

    .line 7
    .line 8
    .line 9
    and-int/lit8 v0, p2, 0x3

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x1

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    move v0, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    and-int/lit8 v1, p2, 0x1

    .line 19
    .line 20
    invoke-virtual {p1, v1, v0}, Lgo0;->O(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    sget-object v0, Lte;->e:Lyi0;

    .line 27
    .line 28
    const/high16 v1, 0x435c0000    # 220.0f

    .line 29
    .line 30
    invoke-static {v0, v1}, Lte;->O(Luh1;F)Luh1;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sget-object v1, Lsn;->v:Lpk;

    .line 35
    .line 36
    sget-object v3, Ltp0;->d:Lz8;

    .line 37
    .line 38
    const/16 v4, 0x36

    .line 39
    .line 40
    invoke-static {v3, v1, p1, v4}, Lyu;->a(Lyf;Lpk;Lpx;I)Lav;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-wide v5, p1, Lgo0;->T:J

    .line 45
    .line 46
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    invoke-virtual {p1}, Lgo0;->l()Lyy1;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-static {p1, v0}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sget-object v6, Lhx;->c:Lgx;

    .line 59
    .line 60
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    sget-object v6, Lgx;->b:Ljy;

    .line 64
    .line 65
    invoke-virtual {p1}, Lgo0;->Z()V

    .line 66
    .line 67
    .line 68
    iget-boolean v7, p1, Lgo0;->S:Z

    .line 69
    .line 70
    if-eqz v7, :cond_1

    .line 71
    .line 72
    invoke-virtual {p1, v6}, Lgo0;->k(Lxm0;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    invoke-virtual {p1}, Lgo0;->i0()V

    .line 77
    .line 78
    .line 79
    :goto_1
    sget-object v6, Lgx;->e:Llc;

    .line 80
    .line 81
    invoke-static {p1, v6, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    sget-object v1, Lgx;->d:Llc;

    .line 85
    .line 86
    invoke-static {p1, v1, v5}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    sget-object v3, Lgx;->f:Llc;

    .line 94
    .line 95
    invoke-static {p1, v3, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    sget-object v1, Lgx;->g:Lv6;

    .line 99
    .line 100
    invoke-static {p1, v1}, Lyf3;->b(Lpx;Lin0;)V

    .line 101
    .line 102
    .line 103
    sget-object v1, Lgx;->c:Llc;

    .line 104
    .line 105
    invoke-static {p1, v1, v0}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    sget-object v0, Lbv;->a:Lbv;

    .line 109
    .line 110
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {p0, v0, p1, v1}, Lkw;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v2}, Lgo0;->p(Z)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_2
    invoke-virtual {p1}, Lgo0;->R()V

    .line 122
    .line 123
    .line 124
    :goto_2
    invoke-virtual {p1}, Lgo0;->r()Lb62;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    if-eqz p1, :cond_3

    .line 129
    .line 130
    new-instance v0, Lo0;

    .line 131
    .line 132
    invoke-direct {v0, p0, p2, v2}, Lo0;-><init>(Lkw;II)V

    .line 133
    .line 134
    .line 135
    iput-object v0, p1, Lb62;->d:Lmn0;

    .line 136
    .line 137
    :cond_3
    return-void
.end method

.method public static d0(Ljava/io/File;)[B
    .locals 4

    .line 1
    new-instance v0, Ljava/io/FileInputStream;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance p0, Ljava/io/ByteArrayOutputStream;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    .line 10
    .line 11
    const/16 v1, 0x2000

    .line 12
    .line 13
    :try_start_1
    new-array v1, v1, [B

    .line 14
    .line 15
    :goto_0
    invoke-virtual {v0, v1}, Ljava/io/FileInputStream;->read([B)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, -0x1

    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-virtual {p0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 30
    .line 31
    .line 32
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    :try_start_2
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 37
    .line 38
    .line 39
    return-object v1

    .line 40
    :catchall_1
    move-exception p0

    .line 41
    goto :goto_3

    .line 42
    :goto_1
    :try_start_3
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :catchall_2
    move-exception p0

    .line 47
    :try_start_4
    invoke-virtual {v1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    :goto_2
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 51
    :goto_3
    :try_start_5
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 52
    .line 53
    .line 54
    goto :goto_4

    .line 55
    :catchall_3
    move-exception v0

    .line 56
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    :goto_4
    throw p0
.end method

.method public static final e(Ljava/lang/String;Lpx;I)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v10, p2

    .line 4
    .line 5
    move-object/from16 v7, p1

    .line 6
    .line 7
    check-cast v7, Lgo0;

    .line 8
    .line 9
    const v1, -0x5b1a5cdc

    .line 10
    .line 11
    .line 12
    invoke-virtual {v7, v1}, Lgo0;->X(I)Lgo0;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v7, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x2

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const/4 v1, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v1, v2

    .line 25
    :goto_0
    or-int/2addr v1, v10

    .line 26
    and-int/lit8 v3, v1, 0x3

    .line 27
    .line 28
    if-eq v3, v2, :cond_1

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/4 v2, 0x0

    .line 33
    :goto_1
    and-int/lit8 v3, v1, 0x1

    .line 34
    .line 35
    invoke-virtual {v7, v3, v2}, Lgo0;->O(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    new-instance v2, Lm13;

    .line 42
    .line 43
    sget-object v3, Lur1;->a:Ltu2;

    .line 44
    .line 45
    invoke-virtual {v7, v3}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Llp1;

    .line 50
    .line 51
    iget-wide v12, v3, Llp1;->f:J

    .line 52
    .line 53
    const/16 v3, 0xd

    .line 54
    .line 55
    invoke-static {v3}, Lrg3;->D(I)J

    .line 56
    .line 57
    .line 58
    move-result-wide v14

    .line 59
    const/16 v3, 0x12

    .line 60
    .line 61
    invoke-static {v3}, Lrg3;->D(I)J

    .line 62
    .line 63
    .line 64
    move-result-wide v20

    .line 65
    const/16 v23, 0x0

    .line 66
    .line 67
    const v24, 0xfdfffc

    .line 68
    .line 69
    .line 70
    const/16 v16, 0x0

    .line 71
    .line 72
    const-wide/16 v17, 0x0

    .line 73
    .line 74
    const/16 v19, 0x0

    .line 75
    .line 76
    const/16 v22, 0x0

    .line 77
    .line 78
    move-object v11, v2

    .line 79
    invoke-direct/range {v11 .. v24}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 80
    .line 81
    .line 82
    and-int/lit8 v8, v1, 0xe

    .line 83
    .line 84
    const/16 v9, 0x3fa

    .line 85
    .line 86
    const/4 v1, 0x0

    .line 87
    const/4 v3, 0x0

    .line 88
    const/4 v4, 0x0

    .line 89
    const/4 v5, 0x0

    .line 90
    const/4 v6, 0x0

    .line 91
    invoke-static/range {v0 .. v9}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_2
    invoke-virtual {v7}, Lgo0;->R()V

    .line 96
    .line 97
    .line 98
    :goto_2
    invoke-virtual {v7}, Lgo0;->r()Lb62;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    if-eqz v1, :cond_3

    .line 103
    .line 104
    new-instance v2, Ln0;

    .line 105
    .line 106
    const/4 v3, 0x5

    .line 107
    invoke-direct {v2, v0, v10, v3}, Ln0;-><init>(Ljava/lang/String;II)V

    .line 108
    .line 109
    .line 110
    iput-object v2, v1, Lb62;->d:Lmn0;

    .line 111
    .line 112
    :cond_3
    return-void
.end method

.method public static e0(Ljava/io/File;Lorg/json/JSONObject;Ljava/io/File;)Lud0;
    .locals 27

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "[0-9a-f]{64}"

    .line 4
    .line 5
    const-string v2, "lib/arm64-v8a/"

    .line 6
    .line 7
    const-string v3, "release-"

    .line 8
    .line 9
    const-string v4, "libnuke_engine_"

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    :try_start_0
    const-string v6, "v"

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    invoke-virtual {v0, v6, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    const/4 v8, 0x2

    .line 20
    if-eq v6, v8, :cond_0

    .line 21
    .line 22
    goto/16 :goto_1

    .line 23
    .line 24
    :cond_0
    const-string v6, "releaseId"

    .line 25
    .line 26
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 31
    .line 32
    invoke-virtual {v6, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v10

    .line 36
    const-string v6, "generation"

    .line 37
    .line 38
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v11

    .line 42
    const-string v6, "kid"

    .line 43
    .line 44
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-virtual {v6, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    const-string v9, "packageSha256"

    .line 53
    .line 54
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    invoke-virtual {v9, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    const-string v13, "packageLength"

    .line 63
    .line 64
    invoke-virtual {v0, v13}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 65
    .line 66
    .line 67
    move-result-wide v13

    .line 68
    const-string v15, "engineSha256"

    .line 69
    .line 70
    invoke-virtual {v0, v15}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v15

    .line 74
    invoke-virtual {v15, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    const-string v15, "engineSize"

    .line 79
    .line 80
    invoke-virtual {v0, v15}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 81
    .line 82
    .line 83
    move-result-wide v19

    .line 84
    const-string v15, "sequence"

    .line 85
    .line 86
    move-object/from16 v18, v8

    .line 87
    .line 88
    const-wide/16 v7, 0x0

    .line 89
    .line 90
    invoke-virtual {v0, v15, v7, v8}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 91
    .line 92
    .line 93
    move-result-wide v22

    .line 94
    invoke-static {v10}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 95
    .line 96
    .line 97
    move-result-object v15

    .line 98
    invoke-virtual {v15}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v15

    .line 102
    invoke-virtual {v10, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v15

    .line 106
    if-eqz v15, :cond_5

    .line 107
    .line 108
    cmp-long v15, v11, v7

    .line 109
    .line 110
    if-lez v15, :cond_5

    .line 111
    .line 112
    const-string v15, "[0-9a-f]{8}"

    .line 113
    .line 114
    invoke-virtual {v6, v15}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result v15

    .line 118
    if-eqz v15, :cond_5

    .line 119
    .line 120
    invoke-virtual {v9, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 121
    .line 122
    .line 123
    move-result v15

    .line 124
    if-eqz v15, :cond_5

    .line 125
    .line 126
    move-object/from16 v15, v18

    .line 127
    .line 128
    invoke-virtual {v15, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-eqz v1, :cond_5

    .line 133
    .line 134
    cmp-long v1, v13, v7

    .line 135
    .line 136
    if-lez v1, :cond_5

    .line 137
    .line 138
    const-wide/32 v17, 0x4000000

    .line 139
    .line 140
    .line 141
    cmp-long v1, v13, v17

    .line 142
    .line 143
    if-gtz v1, :cond_5

    .line 144
    .line 145
    cmp-long v1, v19, v7

    .line 146
    .line 147
    if-lez v1, :cond_5

    .line 148
    .line 149
    cmp-long v1, v19, v17

    .line 150
    .line 151
    if-gtz v1, :cond_5

    .line 152
    .line 153
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->length()J

    .line 154
    .line 155
    .line 156
    move-result-wide v17

    .line 157
    cmp-long v1, v17, v13

    .line 158
    .line 159
    if-eqz v1, :cond_1

    .line 160
    .line 161
    goto/16 :goto_1

    .line 162
    .line 163
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string v4, "_"

    .line 172
    .line 173
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const/16 v4, 0xc

    .line 177
    .line 178
    const/4 v13, 0x0

    .line 179
    invoke-virtual {v15, v13, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const-string v4, ".so"

    .line 187
    .line 188
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual/range {p0 .. p0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    new-instance v13, Ljava/io/File;

    .line 200
    .line 201
    const-string v14, "engineFile"

    .line 202
    .line 203
    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-direct {v13, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v13}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-static {v4, v0}, Lup0;->p(Ljava/nio/file/Path;Ljava/nio/file/Path;)Ljava/nio/file/Path;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    new-instance v4, Ljava/io/File;

    .line 219
    .line 220
    invoke-virtual {v3, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    move-object/from16 v13, p0

    .line 225
    .line 226
    invoke-direct {v4, v13, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-interface {v0}, Ljava/nio/file/Path;->toFile()Ljava/io/File;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v14

    .line 237
    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v14

    .line 241
    if-eqz v14, :cond_5

    .line 242
    .line 243
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 244
    .line 245
    .line 246
    move-result-object v14

    .line 247
    invoke-virtual {v14, v4}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v14

    .line 251
    if-eqz v14, :cond_5

    .line 252
    .line 253
    invoke-virtual {v13}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 254
    .line 255
    .line 256
    move-result-object v14

    .line 257
    invoke-static {v14, v0}, Lup0;->y(Ljava/nio/file/Path;Ljava/nio/file/Path;)Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-eqz v0, :cond_5

    .line 262
    .line 263
    invoke-virtual {v3}, Ljava/io/File;->length()J

    .line 264
    .line 265
    .line 266
    move-result-wide v16

    .line 267
    cmp-long v0, v16, v19

    .line 268
    .line 269
    if-eqz v0, :cond_2

    .line 270
    .line 271
    goto :goto_1

    .line 272
    :cond_2
    cmp-long v0, v22, v7

    .line 273
    .line 274
    if-nez v0, :cond_3

    .line 275
    .line 276
    move-object/from16 v26, v5

    .line 277
    .line 278
    goto :goto_0

    .line 279
    :cond_3
    new-instance v7, Ljava/io/File;

    .line 280
    .line 281
    const-string v8, "activation.json"

    .line 282
    .line 283
    invoke-direct {v7, v4, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    move-object/from16 v26, v7

    .line 287
    .line 288
    :goto_0
    if-lez v0, :cond_4

    .line 289
    .line 290
    invoke-virtual {v13}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-virtual/range {v26 .. v26}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    invoke-static {v0, v4}, Lup0;->y(Ljava/nio/file/Path;Ljava/nio/file/Path;)Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-nez v0, :cond_4

    .line 303
    .line 304
    goto :goto_1

    .line 305
    :cond_4
    move-object v0, v9

    .line 306
    new-instance v9, Lh80;

    .line 307
    .line 308
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v17

    .line 312
    const/4 v13, 0x1

    .line 313
    const/4 v14, 0x1

    .line 314
    move-object/from16 v18, v15

    .line 315
    .line 316
    const/4 v15, 0x1

    .line 317
    move-object/from16 v16, v6

    .line 318
    .line 319
    invoke-direct/range {v9 .. v20}, Lh80;-><init>(Ljava/lang/String;JIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 320
    .line 321
    .line 322
    new-instance v1, Lb5;

    .line 323
    .line 324
    const/16 v2, 0x16

    .line 325
    .line 326
    invoke-direct {v1, v9, v3, v0, v2}, Lb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 327
    .line 328
    .line 329
    new-instance v21, Lud0;

    .line 330
    .line 331
    move-object/from16 v25, p2

    .line 332
    .line 333
    move-object/from16 v24, v1

    .line 334
    .line 335
    invoke-direct/range {v21 .. v26}, Lud0;-><init>(JLb5;Ljava/io/File;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 336
    .line 337
    .line 338
    return-object v21

    .line 339
    :catch_0
    :cond_5
    :goto_1
    return-object v5
.end method

.method public static final f(Lb03;Lkw;Lpx;I)V
    .locals 4

    .line 1
    check-cast p2, Lgo0;

    .line 2
    .line 3
    const v0, 0x7c0599e6

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2, v0}, Lgo0;->X(I)Lgo0;

    .line 7
    .line 8
    .line 9
    and-int/lit8 v0, p3, 0x6

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p2, p0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x2

    .line 22
    :goto_0
    or-int/2addr v0, p3

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v0, p3

    .line 25
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 26
    .line 27
    if-nez v1, :cond_3

    .line 28
    .line 29
    invoke-virtual {p2, p1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    const/16 v1, 0x20

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/16 v1, 0x10

    .line 39
    .line 40
    :goto_2
    or-int/2addr v0, v1

    .line 41
    :cond_3
    and-int/lit8 v1, v0, 0x13

    .line 42
    .line 43
    const/16 v2, 0x12

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    if-eq v1, v2, :cond_4

    .line 47
    .line 48
    move v1, v3

    .line 49
    goto :goto_3

    .line 50
    :cond_4
    const/4 v1, 0x0

    .line 51
    :goto_3
    and-int/lit8 v2, v0, 0x1

    .line 52
    .line 53
    invoke-virtual {p2, v2, v1}, Lgo0;->O(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_5

    .line 58
    .line 59
    and-int/lit8 v0, v0, 0x7e

    .line 60
    .line 61
    invoke-static {p0, p1, p2, v0}, Lt11;->b(Lb03;Lkw;Lpx;I)V

    .line 62
    .line 63
    .line 64
    goto :goto_4

    .line 65
    :cond_5
    invoke-virtual {p2}, Lgo0;->R()V

    .line 66
    .line 67
    .line 68
    :goto_4
    invoke-virtual {p2}, Lgo0;->r()Lb62;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    if-eqz p2, :cond_6

    .line 73
    .line 74
    new-instance v0, Lfv;

    .line 75
    .line 76
    invoke-direct {v0, p0, p1, p3, v3}, Lfv;-><init>(Lb03;Lkw;II)V

    .line 77
    .line 78
    .line 79
    iput-object v0, p2, Lb62;->d:Lmn0;

    .line 80
    .line 81
    :cond_6
    return-void
.end method

.method public static f0(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lwi0;->f0(Ljava/io/File;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    new-instance v0, Lx92;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    move-object p0, v0

    .line 26
    :goto_0
    nop

    .line 27
    instance-of v0, p0, Lx92;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    :cond_0
    check-cast p0, Ljava/lang/String;

    .line 33
    .line 34
    return-object p0
.end method

.method public static final g(ILpx;)V
    .locals 6

    .line 1
    move-object v3, p1

    .line 2
    check-cast v3, Lgo0;

    .line 3
    .line 4
    const p1, -0x7fcefbeb

    .line 5
    .line 6
    .line 7
    invoke-virtual {v3, p1}, Lgo0;->X(I)Lgo0;

    .line 8
    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    and-int/lit8 v0, p0, 0x1

    .line 16
    .line 17
    invoke-virtual {v3, v0, p1}, Lgo0;->O(IZ)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    const p1, 0x790b0123

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v3}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    sget-object v2, Ltp0;->h:Lkw;

    .line 31
    .line 32
    const/16 v4, 0x180

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-static/range {v0 .. v5}, Leu;->n(Luh1;Ljava/lang/String;Lkw;Lpx;II)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    invoke-virtual {v3}, Lgo0;->R()V

    .line 41
    .line 42
    .line 43
    :goto_1
    invoke-virtual {v3}, Lgo0;->r()Lb62;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    new-instance v0, Lye;

    .line 50
    .line 51
    const/16 v1, 0x1c

    .line 52
    .line 53
    invoke-direct {v0, p0, v1}, Lye;-><init>(II)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p1, Lb62;->d:Lmn0;

    .line 57
    .line 58
    :cond_2
    return-void
.end method

.method public static g0()Ljava/io/File;
    .locals 3

    .line 1
    sget-object v0, Lup0;->i:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/io/File;

    .line 8
    .line 9
    const-string v2, "nuke/native/releases"

    .line 10
    .line 11
    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {v0, v2}, Lup0;->r(Ljava/nio/file/Path;Ljava/nio/file/Path;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    :catch_0
    move-exception v0

    .line 27
    new-instance v1, Ljava/lang/SecurityException;

    .line 28
    .line 29
    const-string v2, "Unable to create Native release root"

    .line 30
    .line 31
    invoke-direct {v1, v2, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    throw v1
.end method

.method public static final h(Ljava/lang/String;Lzt0;Lpx;I)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v10, p3

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    check-cast v7, Lgo0;

    .line 8
    .line 9
    const v1, 0x5c905b64

    .line 10
    .line 11
    .line 12
    invoke-virtual {v7, v1}, Lgo0;->X(I)Lgo0;

    .line 13
    .line 14
    .line 15
    and-int/lit8 v1, v10, 0x6

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v7, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v1, 0x2

    .line 28
    :goto_0
    or-int/2addr v1, v10

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v1, v10

    .line 31
    :goto_1
    and-int/lit8 v2, v10, 0x30

    .line 32
    .line 33
    if-nez v2, :cond_3

    .line 34
    .line 35
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-virtual {v7, v2}, Lgo0;->d(I)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    const/16 v2, 0x20

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v2, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v1, v2

    .line 51
    :cond_3
    and-int/lit8 v2, v1, 0x13

    .line 52
    .line 53
    const/16 v3, 0x12

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    const/4 v11, 0x1

    .line 57
    if-eq v2, v3, :cond_4

    .line 58
    .line 59
    move v2, v11

    .line 60
    goto :goto_3

    .line 61
    :cond_4
    move v2, v4

    .line 62
    :goto_3
    and-int/lit8 v3, v1, 0x1

    .line 63
    .line 64
    invoke-virtual {v7, v3, v2}, Lgo0;->O(IZ)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_6

    .line 69
    .line 70
    invoke-static/range {p1 .. p1}, Ls11;->A(Lzt0;)J

    .line 71
    .line 72
    .line 73
    move-result-wide v13

    .line 74
    const v2, 0x4479c000    # 999.0f

    .line 75
    .line 76
    .line 77
    invoke-static {v2}, Lgb2;->a(F)Lfb2;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    sget-object v3, Lrh1;->a:Lrh1;

    .line 82
    .line 83
    invoke-static {v3, v2}, Lci0;->z(Luh1;Leq2;)Luh1;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    const v3, 0x3e051eb8    # 0.13f

    .line 88
    .line 89
    .line 90
    invoke-static {v3, v13, v14}, Lju;->b(FJ)J

    .line 91
    .line 92
    .line 93
    move-result-wide v5

    .line 94
    sget-object v3, Lsp0;->h:Liu0;

    .line 95
    .line 96
    invoke-static {v2, v5, v6, v3}, Lgf1;->n(Luh1;JLeq2;)Luh1;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    const/high16 v3, 0x41100000    # 9.0f

    .line 101
    .line 102
    const/high16 v5, 0x40800000    # 4.0f

    .line 103
    .line 104
    invoke-static {v2, v3, v5}, Lfg1;->D(Luh1;FF)Luh1;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    sget-object v3, Lsn;->n:Lrk;

    .line 109
    .line 110
    invoke-static {v3, v4}, Ldm;->d(Lr5;Z)Lnf1;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    iget-wide v4, v7, Lgo0;->T:J

    .line 115
    .line 116
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    invoke-virtual {v7}, Lgo0;->l()Lyy1;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-static {v7, v2}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    sget-object v6, Lhx;->c:Lgx;

    .line 129
    .line 130
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    sget-object v6, Lgx;->b:Ljy;

    .line 134
    .line 135
    invoke-virtual {v7}, Lgo0;->Z()V

    .line 136
    .line 137
    .line 138
    iget-boolean v8, v7, Lgo0;->S:Z

    .line 139
    .line 140
    if-eqz v8, :cond_5

    .line 141
    .line 142
    invoke-virtual {v7, v6}, Lgo0;->k(Lxm0;)V

    .line 143
    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_5
    invoke-virtual {v7}, Lgo0;->i0()V

    .line 147
    .line 148
    .line 149
    :goto_4
    sget-object v6, Lgx;->e:Llc;

    .line 150
    .line 151
    invoke-static {v7, v6, v3}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    sget-object v3, Lgx;->d:Llc;

    .line 155
    .line 156
    invoke-static {v7, v3, v5}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    sget-object v4, Lgx;->f:Llc;

    .line 164
    .line 165
    invoke-static {v7, v4, v3}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    sget-object v3, Lgx;->g:Lv6;

    .line 169
    .line 170
    invoke-static {v7, v3}, Lyf3;->b(Lpx;Lin0;)V

    .line 171
    .line 172
    .line 173
    sget-object v3, Lgx;->c:Llc;

    .line 174
    .line 175
    invoke-static {v7, v3, v2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    const/16 v2, 0xb

    .line 179
    .line 180
    invoke-static {v2}, Lrg3;->D(I)J

    .line 181
    .line 182
    .line 183
    move-result-wide v15

    .line 184
    const/16 v2, 0xe

    .line 185
    .line 186
    invoke-static {v2}, Lrg3;->D(I)J

    .line 187
    .line 188
    .line 189
    move-result-wide v21

    .line 190
    sget-object v17, Lim0;->l:Lim0;

    .line 191
    .line 192
    new-instance v12, Lm13;

    .line 193
    .line 194
    const/16 v24, 0x0

    .line 195
    .line 196
    const v25, 0xfdfff8

    .line 197
    .line 198
    .line 199
    const-wide/16 v18, 0x0

    .line 200
    .line 201
    const/16 v20, 0x0

    .line 202
    .line 203
    const/16 v23, 0x0

    .line 204
    .line 205
    invoke-direct/range {v12 .. v25}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 206
    .line 207
    .line 208
    const v3, 0x186000

    .line 209
    .line 210
    .line 211
    and-int/2addr v1, v2

    .line 212
    or-int v8, v1, v3

    .line 213
    .line 214
    const/16 v9, 0x3aa

    .line 215
    .line 216
    const/4 v1, 0x0

    .line 217
    const/4 v3, 0x2

    .line 218
    const/4 v4, 0x0

    .line 219
    const/4 v5, 0x1

    .line 220
    const/4 v6, 0x0

    .line 221
    move-object v2, v12

    .line 222
    invoke-static/range {v0 .. v9}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v7, v11}, Lgo0;->p(Z)V

    .line 226
    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_6
    invoke-virtual {v7}, Lgo0;->R()V

    .line 230
    .line 231
    .line 232
    :goto_5
    invoke-virtual {v7}, Lgo0;->r()Lb62;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    if-eqz v1, :cond_7

    .line 237
    .line 238
    new-instance v2, Lup;

    .line 239
    .line 240
    const/4 v3, 0x5

    .line 241
    move-object/from16 v4, p1

    .line 242
    .line 243
    invoke-direct {v2, v10, v3, v0, v4}, Lup;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    iput-object v2, v1, Lb62;->d:Lmn0;

    .line 247
    .line 248
    :cond_7
    return-void
.end method

.method public static h0(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {}, Ls11;->i0()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    move-object p0, v0

    .line 22
    :goto_0
    instance-of v1, p0, Ljava/lang/Boolean;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    check-cast p0, Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_1
    move-object p0, v0

    .line 30
    goto :goto_2

    .line 31
    :goto_1
    new-instance v1, Lx92;

    .line 32
    .line 33
    invoke-direct {v1, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object p0, v1

    .line 37
    :goto_2
    nop

    .line 38
    instance-of v1, p0, Lx92;

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_2
    move-object v0, p0

    .line 44
    :goto_3
    check-cast v0, Ljava/lang/Boolean;

    .line 45
    .line 46
    return-object v0
.end method

.method public static final i(Ljava/util/List;Lin0;Lpx;I)V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v3, p3

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-object/from16 v4, p2

    .line 14
    .line 15
    check-cast v4, Lgo0;

    .line 16
    .line 17
    const v0, 0x79a7922f

    .line 18
    .line 19
    .line 20
    invoke-virtual {v4, v0}, Lgo0;->X(I)Lgo0;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v4, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x2

    .line 32
    :goto_0
    or-int/2addr v0, v3

    .line 33
    invoke-virtual {v4, v2}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    const/16 v7, 0x10

    .line 38
    .line 39
    if-eqz v6, :cond_1

    .line 40
    .line 41
    const/16 v6, 0x20

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move v6, v7

    .line 45
    :goto_1
    or-int/2addr v6, v0

    .line 46
    and-int/lit8 v0, v6, 0x13

    .line 47
    .line 48
    const/16 v8, 0x12

    .line 49
    .line 50
    const/4 v10, 0x0

    .line 51
    if-eq v0, v8, :cond_2

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    move v0, v10

    .line 56
    :goto_2
    and-int/lit8 v8, v6, 0x1

    .line 57
    .line 58
    invoke-virtual {v4, v8, v0}, Lgo0;->O(IZ)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_20

    .line 63
    .line 64
    sget-object v0, Lr7;->b:Ltu2;

    .line 65
    .line 66
    invoke-virtual {v4, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    move-object v8, v0

    .line 71
    check-cast v8, Landroid/content/Context;

    .line 72
    .line 73
    invoke-virtual {v4}, Lgo0;->L()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    sget-object v11, Lnx;->a:Leb;

    .line 78
    .line 79
    if-ne v0, v11, :cond_3

    .line 80
    .line 81
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v4, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :cond_3
    move-object v12, v0

    .line 93
    check-cast v12, Lxk1;

    .line 94
    .line 95
    invoke-virtual {v4}, Lgo0;->L()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const/4 v13, 0x0

    .line 100
    if-ne v0, v11, :cond_4

    .line 101
    .line 102
    invoke-static {v13}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v4, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_4
    move-object v14, v0

    .line 110
    check-cast v14, Lxk1;

    .line 111
    .line 112
    invoke-interface {v12}, Lgu2;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, Ljava/lang/Number;

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    invoke-virtual {v4, v0}, Lgo0;->d(I)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    invoke-virtual {v4}, Lgo0;->L()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v15

    .line 130
    const/16 v9, 0xa

    .line 131
    .line 132
    if-nez v0, :cond_5

    .line 133
    .line 134
    if-ne v15, v11, :cond_a

    .line 135
    .line 136
    :cond_5
    sget-object v0, Lpp1;->a:Lpp1;

    .line 137
    .line 138
    invoke-static {}, Lpp1;->b()Lop1;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    :try_start_0
    const-string v15, "hooker_debug_records"

    .line 146
    .line 147
    new-instance v10, Lcg;

    .line 148
    .line 149
    sget-object v16, Lyt0;->Companion:Lyt0$b;

    .line 150
    .line 151
    invoke-virtual/range {v16 .. v16}, Lyt0$b;->serializer()Lw41;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    invoke-direct {v10, v5}, Lcg;-><init>(Lw41;)V

    .line 156
    .line 157
    .line 158
    invoke-static {v10}, Lse;->D(Lw41;)Lw41;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    invoke-virtual {v0, v5, v13, v15}, Lop1;->b(Lw41;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    check-cast v0, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :catchall_0
    move-exception v0

    .line 170
    new-instance v5, Lx92;

    .line 171
    .line 172
    invoke-direct {v5, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 173
    .line 174
    .line 175
    move-object v0, v5

    .line 176
    :goto_3
    nop

    .line 177
    instance-of v5, v0, Lx92;

    .line 178
    .line 179
    if-eqz v5, :cond_6

    .line 180
    .line 181
    move-object v0, v13

    .line 182
    :cond_6
    check-cast v0, Ljava/util/List;

    .line 183
    .line 184
    if-nez v0, :cond_7

    .line 185
    .line 186
    sget-object v0, Lbe0;->h:Lbe0;

    .line 187
    .line 188
    :cond_7
    invoke-static {v0, v9}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    invoke-static {v5}, Lxe1;->U(I)I

    .line 193
    .line 194
    .line 195
    move-result v5

    .line 196
    if-ge v5, v7, :cond_8

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_8
    move v7, v5

    .line 200
    :goto_4
    new-instance v15, Ljava/util/LinkedHashMap;

    .line 201
    .line 202
    invoke-direct {v15, v7}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 203
    .line 204
    .line 205
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v5

    .line 213
    if-eqz v5, :cond_9

    .line 214
    .line 215
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    move-object v7, v5

    .line 220
    check-cast v7, Lyt0;

    .line 221
    .line 222
    invoke-virtual {v7}, Lyt0;->l()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    invoke-interface {v15, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_9
    invoke-virtual {v4, v15}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    :cond_a
    check-cast v15, Ljava/util/Map;

    .line 234
    .line 235
    invoke-interface {v12}, Lgu2;->getValue()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    check-cast v0, Ljava/lang/Number;

    .line 240
    .line 241
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    and-int/lit8 v5, v6, 0xe

    .line 246
    .line 247
    const/4 v6, 0x4

    .line 248
    if-eq v5, v6, :cond_b

    .line 249
    .line 250
    const/4 v5, 0x0

    .line 251
    goto :goto_6

    .line 252
    :cond_b
    const/4 v5, 0x1

    .line 253
    :goto_6
    invoke-virtual {v4, v15}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    or-int/2addr v5, v6

    .line 258
    invoke-virtual {v4, v0}, Lgo0;->d(I)Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    or-int/2addr v0, v5

    .line 263
    invoke-virtual {v4, v8}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    or-int/2addr v0, v5

    .line 268
    invoke-virtual {v4}, Lgo0;->L()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    if-nez v0, :cond_c

    .line 273
    .line 274
    if-ne v5, v11, :cond_1b

    .line 275
    .line 276
    :cond_c
    new-instance v5, Ljava/util/ArrayList;

    .line 277
    .line 278
    invoke-static {v1, v9}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 283
    .line 284
    .line 285
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 286
    .line 287
    .line 288
    move-result-object v6

    .line 289
    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    if-eqz v0, :cond_1a

    .line 294
    .line 295
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    move-object v7, v0

    .line 300
    check-cast v7, Lvj;

    .line 301
    .line 302
    invoke-virtual {v7}, Lvj;->d()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    invoke-interface {v15, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    move-object/from16 v22, v0

    .line 311
    .line 312
    check-cast v22, Lyt0;

    .line 313
    .line 314
    iget-object v0, v7, Lvj;->b:Ljava/util/ArrayList;

    .line 315
    .line 316
    iget-boolean v9, v7, Lvj;->c:Z

    .line 317
    .line 318
    invoke-static {v0}, Ldu;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    move-object/from16 v23, v0

    .line 323
    .line 324
    check-cast v23, Ljava/lang/Throwable;

    .line 325
    .line 326
    if-nez v22, :cond_f

    .line 327
    .line 328
    if-eqz v23, :cond_d

    .line 329
    .line 330
    goto :goto_9

    .line 331
    :cond_d
    if-nez v9, :cond_e

    .line 332
    .line 333
    sget-object v0, Lzt0;->i:Lzt0;

    .line 334
    .line 335
    :goto_8
    move-object/from16 v20, v0

    .line 336
    .line 337
    goto :goto_a

    .line 338
    :cond_e
    sget-object v0, Lzt0;->h:Lzt0;

    .line 339
    .line 340
    goto :goto_8

    .line 341
    :cond_f
    :goto_9
    sget-object v0, Lzt0;->j:Lzt0;

    .line 342
    .line 343
    goto :goto_8

    .line 344
    :goto_a
    if-eqz v22, :cond_10

    .line 345
    .line 346
    invoke-virtual/range {v22 .. v22}, Lyt0;->n()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    :goto_b
    move-object/from16 v21, v0

    .line 351
    .line 352
    goto :goto_c

    .line 353
    :cond_10
    if-eqz v23, :cond_11

    .line 354
    .line 355
    const-string v0, "Throwable recorded in memory"

    .line 356
    .line 357
    goto :goto_b

    .line 358
    :cond_11
    if-nez v9, :cond_12

    .line 359
    .line 360
    const-string v0, "isAvailable = false"

    .line 361
    .line 362
    goto :goto_b

    .line 363
    :cond_12
    const-string v0, "No recorded exception"

    .line 364
    .line 365
    goto :goto_b

    .line 366
    :goto_c
    instance-of v9, v7, Lgw;

    .line 367
    .line 368
    if-eqz v9, :cond_13

    .line 369
    .line 370
    move-object v0, v7

    .line 371
    check-cast v0, Lgw;

    .line 372
    .line 373
    goto :goto_d

    .line 374
    :cond_13
    move-object v0, v13

    .line 375
    :goto_d
    if-eqz v0, :cond_16

    .line 376
    .line 377
    :try_start_1
    move-object v10, v7

    .line 378
    check-cast v10, Lgw;

    .line 379
    .line 380
    invoke-virtual {v0}, Lgw;->m()I

    .line 381
    .line 382
    .line 383
    move-result v0

    .line 384
    invoke-virtual {v8, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 388
    goto :goto_e

    .line 389
    :catchall_1
    move-exception v0

    .line 390
    new-instance v10, Lx92;

    .line 391
    .line 392
    invoke-direct {v10, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 393
    .line 394
    .line 395
    move-object v0, v10

    .line 396
    :goto_e
    nop

    .line 397
    instance-of v10, v0, Lx92;

    .line 398
    .line 399
    if-eqz v10, :cond_14

    .line 400
    .line 401
    move-object v0, v13

    .line 402
    :cond_14
    check-cast v0, Ljava/lang/String;

    .line 403
    .line 404
    if-eqz v0, :cond_16

    .line 405
    .line 406
    invoke-static {v0}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 407
    .line 408
    .line 409
    move-result v10

    .line 410
    if-nez v10, :cond_15

    .line 411
    .line 412
    goto :goto_f

    .line 413
    :cond_15
    move-object v0, v13

    .line 414
    :goto_f
    if-eqz v0, :cond_16

    .line 415
    .line 416
    :goto_10
    move-object/from16 v18, v0

    .line 417
    .line 418
    goto :goto_11

    .line 419
    :cond_16
    invoke-virtual {v7}, Lvj;->d()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    goto :goto_10

    .line 424
    :goto_11
    if-eqz v9, :cond_17

    .line 425
    .line 426
    move-object v0, v7

    .line 427
    check-cast v0, Lgw;

    .line 428
    .line 429
    goto :goto_12

    .line 430
    :cond_17
    move-object v0, v13

    .line 431
    :goto_12
    if-eqz v0, :cond_19

    .line 432
    .line 433
    invoke-virtual {v0}, Lgw;->k()Ljava/lang/Integer;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    if-eqz v0, :cond_19

    .line 438
    .line 439
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 440
    .line 441
    .line 442
    move-result v0

    .line 443
    :try_start_2
    move-object v9, v7

    .line 444
    check-cast v9, Lgw;

    .line 445
    .line 446
    invoke-virtual {v8, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 450
    goto :goto_13

    .line 451
    :catchall_2
    move-exception v0

    .line 452
    new-instance v9, Lx92;

    .line 453
    .line 454
    invoke-direct {v9, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 455
    .line 456
    .line 457
    move-object v0, v9

    .line 458
    :goto_13
    nop

    .line 459
    instance-of v9, v0, Lx92;

    .line 460
    .line 461
    if-eqz v9, :cond_18

    .line 462
    .line 463
    move-object v0, v13

    .line 464
    :cond_18
    check-cast v0, Ljava/lang/String;

    .line 465
    .line 466
    if-eqz v0, :cond_19

    .line 467
    .line 468
    invoke-static {v0}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 469
    .line 470
    .line 471
    move-result v9

    .line 472
    if-nez v9, :cond_19

    .line 473
    .line 474
    move-object/from16 v19, v0

    .line 475
    .line 476
    goto :goto_14

    .line 477
    :cond_19
    move-object/from16 v19, v13

    .line 478
    .line 479
    :goto_14
    new-instance v16, Lxt0;

    .line 480
    .line 481
    move-object/from16 v17, v7

    .line 482
    .line 483
    invoke-direct/range {v16 .. v23}, Lxt0;-><init>(Lvj;Ljava/lang/String;Ljava/lang/String;Lzt0;Ljava/lang/String;Lyt0;Ljava/lang/Throwable;)V

    .line 484
    .line 485
    .line 486
    move-object/from16 v0, v16

    .line 487
    .line 488
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    goto/16 :goto_7

    .line 492
    .line 493
    :cond_1a
    invoke-virtual {v4, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 494
    .line 495
    .line 496
    :cond_1b
    check-cast v5, Ljava/util/List;

    .line 497
    .line 498
    new-instance v0, Ltt0;

    .line 499
    .line 500
    const/4 v6, 0x0

    .line 501
    invoke-direct {v0, v2, v5, v14, v6}, Ltt0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 502
    .line 503
    .line 504
    const v5, -0x15aaed7c

    .line 505
    .line 506
    .line 507
    invoke-static {v5, v0, v4}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    const/4 v5, 0x6

    .line 512
    invoke-static {v0, v4, v5}, Lci0;->p(Lkw;Lpx;I)V

    .line 513
    .line 514
    .line 515
    invoke-interface {v14}, Lgu2;->getValue()Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    check-cast v0, Lxt0;

    .line 520
    .line 521
    if-nez v0, :cond_1c

    .line 522
    .line 523
    const v0, 0x13907ab2

    .line 524
    .line 525
    .line 526
    invoke-virtual {v4, v0}, Lgo0;->W(I)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v4, v6}, Lgo0;->p(Z)V

    .line 530
    .line 531
    .line 532
    goto :goto_15

    .line 533
    :cond_1c
    const v5, 0x13907ab3

    .line 534
    .line 535
    .line 536
    invoke-virtual {v4, v5}, Lgo0;->W(I)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v4}, Lgo0;->L()Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v5

    .line 543
    if-ne v5, v11, :cond_1d

    .line 544
    .line 545
    new-instance v5, Lf0;

    .line 546
    .line 547
    const/16 v6, 0x1a

    .line 548
    .line 549
    invoke-direct {v5, v14, v6}, Lf0;-><init>(Lxk1;I)V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v4, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 553
    .line 554
    .line 555
    :cond_1d
    check-cast v5, Lxm0;

    .line 556
    .line 557
    invoke-virtual {v4, v0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    move-result v6

    .line 561
    invoke-virtual {v4}, Lgo0;->L()Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v7

    .line 565
    if-nez v6, :cond_1e

    .line 566
    .line 567
    if-ne v7, v11, :cond_1f

    .line 568
    .line 569
    :cond_1e
    new-instance v7, Ls1;

    .line 570
    .line 571
    const/16 v6, 0xd

    .line 572
    .line 573
    invoke-direct {v7, v0, v12, v14, v6}, Ls1;-><init>(Ljava/lang/Object;Lxk1;Lxk1;I)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v4, v7}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 577
    .line 578
    .line 579
    :cond_1f
    check-cast v7, Lxm0;

    .line 580
    .line 581
    const/16 v6, 0x30

    .line 582
    .line 583
    invoke-static {v0, v5, v7, v4, v6}, Ls11;->j(Lxt0;Lxm0;Lxm0;Lpx;I)V

    .line 584
    .line 585
    .line 586
    const/4 v6, 0x0

    .line 587
    invoke-virtual {v4, v6}, Lgo0;->p(Z)V

    .line 588
    .line 589
    .line 590
    goto :goto_15

    .line 591
    :cond_20
    invoke-virtual {v4}, Lgo0;->R()V

    .line 592
    .line 593
    .line 594
    :goto_15
    invoke-virtual {v4}, Lgo0;->r()Lb62;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    if-eqz v0, :cond_21

    .line 599
    .line 600
    new-instance v4, Laf;

    .line 601
    .line 602
    invoke-direct {v4, v1, v2, v3}, Laf;-><init>(Ljava/util/List;Lin0;I)V

    .line 603
    .line 604
    .line 605
    iput-object v4, v0, Lb62;->d:Lmn0;

    .line 606
    .line 607
    :cond_21
    return-void
.end method

.method public static i0()Ljava/lang/Class;
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "android.os.SELinux"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    goto :goto_0

    .line 8
    :catchall_0
    move-exception v0

    .line 9
    new-instance v1, Lx92;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    move-object v0, v1

    .line 15
    :goto_0
    nop

    .line 16
    instance-of v1, v0, Lx92;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    :cond_0
    check-cast v0, Ljava/lang/Class;

    .line 22
    .line 23
    return-object v0
.end method

.method public static final j(Lxt0;Lxm0;Lxm0;Lpx;I)V
    .locals 14

    .line 1
    move-object/from16 v3, p2

    .line 2
    .line 3
    move-object/from16 v11, p3

    .line 4
    .line 5
    check-cast v11, Lgo0;

    .line 6
    .line 7
    const v0, 0x4c8d7f69    # 7.4185544E7f

    .line 8
    .line 9
    .line 10
    invoke-virtual {v11, v0}, Lgo0;->X(I)Lgo0;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v11, p0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x4

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move v0, v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x2

    .line 23
    :goto_0
    or-int v0, p4, v0

    .line 24
    .line 25
    invoke-virtual {v11, v3}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    const/16 v2, 0x100

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const/16 v2, 0x80

    .line 35
    .line 36
    :goto_1
    or-int/2addr v0, v2

    .line 37
    and-int/lit16 v2, v0, 0x93

    .line 38
    .line 39
    const/16 v4, 0x92

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    const/4 v6, 0x1

    .line 43
    if-eq v2, v4, :cond_2

    .line 44
    .line 45
    move v2, v6

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    move v2, v5

    .line 48
    :goto_2
    and-int/2addr v0, v6

    .line 49
    invoke-virtual {v11, v0, v2}, Lgo0;->O(IZ)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    const v0, 0x790b0124

    .line 56
    .line 57
    .line 58
    invoke-static {v0, v11}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    new-instance v0, Ltr;

    .line 63
    .line 64
    invoke-direct {v0, p1, p0, v3, v1}, Ltr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 65
    .line 66
    .line 67
    const v1, -0x72740854

    .line 68
    .line 69
    .line 70
    invoke-static {v1, v0, v11}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    new-instance v0, Lwt0;

    .line 75
    .line 76
    invoke-direct {v0, v5, p0}, Lwt0;-><init>(ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    const v1, 0x1cfd9995

    .line 80
    .line 81
    .line 82
    invoke-static {v1, v0, v11}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    const v12, 0x1b0036

    .line 87
    .line 88
    .line 89
    const/16 v13, 0x14

    .line 90
    .line 91
    const/4 v4, 0x1

    .line 92
    const/4 v6, 0x0

    .line 93
    const/4 v8, 0x0

    .line 94
    move-object v5, p1

    .line 95
    invoke-static/range {v4 .. v13}, Lqp0;->d(ZLxm0;Luh1;Ljava/lang/String;Ln80;Lnn0;Lkw;Lpx;II)V

    .line 96
    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_3
    invoke-virtual {v11}, Lgo0;->R()V

    .line 100
    .line 101
    .line 102
    :goto_3
    invoke-virtual {v11}, Lgo0;->r()Lb62;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    if-eqz v6, :cond_4

    .line 107
    .line 108
    new-instance v0, Ltt0;

    .line 109
    .line 110
    const/16 v5, 0x9

    .line 111
    .line 112
    move-object v1, p0

    .line 113
    move-object v2, p1

    .line 114
    move/from16 v4, p4

    .line 115
    .line 116
    invoke-direct/range {v0 .. v5}, Ltt0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 117
    .line 118
    .line 119
    iput-object v0, v6, Lb62;->d:Lmn0;

    .line 120
    .line 121
    :cond_4
    return-void
.end method

.method public static varargs j0(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {}, Ls11;->i0()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    array-length v2, p1

    .line 9
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, [Ljava/lang/Class;

    .line 14
    .line 15
    invoke-virtual {v1, p0, p1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    array-length p1, p2

    .line 22
    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, v0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    move-object p0, v0

    .line 34
    :goto_0
    instance-of p1, p0, Ljava/lang/String;

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_1
    move-object p0, v0

    .line 42
    goto :goto_2

    .line 43
    :goto_1
    new-instance p1, Lx92;

    .line 44
    .line 45
    invoke-direct {p1, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    move-object p0, p1

    .line 49
    :goto_2
    nop

    .line 50
    instance-of p1, p0, Lx92;

    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    move-object p0, v0

    .line 55
    :cond_2
    check-cast p0, Ljava/lang/String;

    .line 56
    .line 57
    if-eqz p0, :cond_3

    .line 58
    .line 59
    invoke-static {p0}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    :cond_3
    return-object v0
.end method

.method public static final k(Lxt0;ZLxm0;Lpx;I)V
    .locals 6

    .line 1
    move-object v3, p3

    .line 2
    check-cast v3, Lgo0;

    .line 3
    .line 4
    const p3, 0x2391a091

    .line 5
    .line 6
    .line 7
    invoke-virtual {v3, p3}, Lgo0;->X(I)Lgo0;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v3, p0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    if-eqz p3, :cond_0

    .line 15
    .line 16
    const/4 p3, 0x4

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p3, 0x2

    .line 19
    :goto_0
    or-int/2addr p3, p4

    .line 20
    invoke-virtual {v3, p1}, Lgo0;->g(Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    const/16 v0, 0x20

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/16 v0, 0x10

    .line 30
    .line 31
    :goto_1
    or-int/2addr p3, v0

    .line 32
    invoke-virtual {v3, p2}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    const/16 v0, 0x100

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    const/16 v0, 0x80

    .line 42
    .line 43
    :goto_2
    or-int/2addr p3, v0

    .line 44
    and-int/lit16 v0, p3, 0x93

    .line 45
    .line 46
    const/16 v1, 0x92

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    const/4 v4, 0x0

    .line 50
    if-eq v0, v1, :cond_3

    .line 51
    .line 52
    move v0, v2

    .line 53
    goto :goto_3

    .line 54
    :cond_3
    move v0, v4

    .line 55
    :goto_3
    and-int/2addr p3, v2

    .line 56
    invoke-virtual {v3, p3, v0}, Lgo0;->O(IZ)Z

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    if-eqz p3, :cond_5

    .line 61
    .line 62
    if-eqz p1, :cond_4

    .line 63
    .line 64
    const p3, 0x2fce5e06

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, p3}, Lgo0;->W(I)V

    .line 68
    .line 69
    .line 70
    const p3, 0x790b0127

    .line 71
    .line 72
    .line 73
    invoke-static {p3, v3}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    invoke-virtual {v3, v4}, Lgo0;->p(Z)V

    .line 78
    .line 79
    .line 80
    :goto_4
    move-object v1, p3

    .line 81
    goto :goto_5

    .line 82
    :cond_4
    const p3, 0x2fcf913d

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3, p3}, Lgo0;->W(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3, v4}, Lgo0;->p(Z)V

    .line 89
    .line 90
    .line 91
    const/4 p3, 0x0

    .line 92
    goto :goto_4

    .line 93
    :goto_5
    new-instance p3, Laf;

    .line 94
    .line 95
    const/16 v0, 0xb

    .line 96
    .line 97
    invoke-direct {p3, v0, p0, p2}, Laf;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    const v0, 0x60a03ff0

    .line 101
    .line 102
    .line 103
    invoke-static {v0, p3, v3}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    const/16 v4, 0x180

    .line 108
    .line 109
    const/4 v5, 0x1

    .line 110
    const/4 v0, 0x0

    .line 111
    invoke-static/range {v0 .. v5}, Leu;->n(Luh1;Ljava/lang/String;Lkw;Lpx;II)V

    .line 112
    .line 113
    .line 114
    goto :goto_6

    .line 115
    :cond_5
    invoke-virtual {v3}, Lgo0;->R()V

    .line 116
    .line 117
    .line 118
    :goto_6
    invoke-virtual {v3}, Lgo0;->r()Lb62;

    .line 119
    .line 120
    .line 121
    move-result-object p3

    .line 122
    if-eqz p3, :cond_6

    .line 123
    .line 124
    new-instance v0, Lrh;

    .line 125
    .line 126
    const/4 v5, 0x3

    .line 127
    move-object v1, p0

    .line 128
    move v2, p1

    .line 129
    move-object v3, p2

    .line 130
    move v4, p4

    .line 131
    invoke-direct/range {v0 .. v5}, Lrh;-><init>(Ljava/lang/Object;ZLun0;II)V

    .line 132
    .line 133
    .line 134
    iput-object v0, p3, Lb62;->d:Lmn0;

    .line 135
    .line 136
    :cond_6
    return-void
.end method

.method public static k0(Ljava/io/File;[BJ)Lql1;
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-eqz v1, :cond_3

    .line 5
    .line 6
    array-length v1, v0

    .line 7
    const/high16 v2, 0x10000

    .line 8
    .line 9
    if-gt v1, v2, :cond_3

    .line 10
    .line 11
    invoke-static {}, Ls11;->g0()Ljava/io/File;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, Ls11;->H(Ljava/io/File;)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-static {v1}, Ls11;->U(Ljava/io/File;)Ljava/nio/channels/FileChannel;

    .line 19
    .line 20
    .line 21
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    :try_start_1
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->lock()Ljava/nio/channels/FileLock;

    .line 23
    .line 24
    .line 25
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    :try_start_2
    invoke-static {v1}, Ls11;->Y(Ljava/io/File;)Ljava/io/File;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    move-object/from16 v4, p0

    .line 31
    .line 32
    move-wide/from16 v12, p2

    .line 33
    .line 34
    invoke-static {v1, v4, v12, v13}, Ls11;->l0(Ljava/io/File;Ljava/io/File;J)Lud0;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v4, v1, Lud0;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v4, Lb5;

    .line 41
    .line 42
    iget-object v6, v4, Lb5;->i:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v6, Lh80;

    .line 45
    .line 46
    iget-object v7, v4, Lb5;->j:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v7, Ljava/io/File;

    .line 49
    .line 50
    new-instance v14, Ljava/io/File;

    .line 51
    .line 52
    invoke-virtual {v7}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    const-string v9, "activation.json"

    .line 57
    .line 58
    invoke-direct {v14, v8, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {}, Ls11;->g0()Ljava/io/File;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    invoke-virtual {v8}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    invoke-virtual {v14}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    invoke-static {v8, v9, v0}, Lup0;->h(Ljava/nio/file/Path;Ljava/nio/file/Path;[B)V

    .line 74
    .line 75
    .line 76
    iget-object v0, v1, Lud0;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Ljava/io/File;

    .line 79
    .line 80
    new-instance v1, Lql1;

    .line 81
    .line 82
    iget-object v8, v6, Lh80;->a:Ljava/lang/String;

    .line 83
    .line 84
    iget-wide v9, v6, Lh80;->b:J

    .line 85
    .line 86
    iget-object v11, v6, Lh80;->f:Ljava/lang/String;

    .line 87
    .line 88
    iget-object v4, v4, Lb5;->k:Ljava/lang/Object;

    .line 89
    .line 90
    move-object v15, v4

    .line 91
    check-cast v15, Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 94
    .line 95
    .line 96
    move-result-wide v16

    .line 97
    iget-object v4, v6, Lh80;->i:Ljava/io/Serializable;

    .line 98
    .line 99
    move-object/from16 v18, v4

    .line 100
    .line 101
    check-cast v18, Ljava/lang/String;

    .line 102
    .line 103
    move-object/from16 p0, v0

    .line 104
    .line 105
    move-object v4, v1

    .line 106
    iget-wide v0, v6, Lh80;->g:J

    .line 107
    .line 108
    move-wide/from16 v19, v0

    .line 109
    .line 110
    move-object v6, v7

    .line 111
    move-object/from16 v7, p0

    .line 112
    .line 113
    invoke-direct/range {v4 .. v20}, Lql1;-><init>(Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/lang/String;JLjava/lang/String;JLjava/io/File;Ljava/lang/String;JLjava/lang/String;J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 114
    .line 115
    .line 116
    if-eqz v3, :cond_0

    .line 117
    .line 118
    :try_start_3
    invoke-virtual {v3}, Ljava/nio/channels/FileLock;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :catchall_0
    move-exception v0

    .line 123
    move-object v1, v0

    .line 124
    goto :goto_4

    .line 125
    :cond_0
    :goto_0
    :try_start_4
    invoke-virtual {v2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 126
    .line 127
    .line 128
    return-object v4

    .line 129
    :goto_1
    move-object v1, v0

    .line 130
    goto :goto_2

    .line 131
    :catchall_1
    move-exception v0

    .line 132
    goto :goto_1

    .line 133
    :goto_2
    if-eqz v3, :cond_1

    .line 134
    .line 135
    :try_start_5
    invoke-virtual {v3}, Ljava/nio/channels/FileLock;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 136
    .line 137
    .line 138
    goto :goto_3

    .line 139
    :catchall_2
    move-exception v0

    .line 140
    :try_start_6
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    :cond_1
    :goto_3
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 144
    :goto_4
    if-eqz v2, :cond_2

    .line 145
    .line 146
    :try_start_7
    invoke-virtual {v2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 147
    .line 148
    .line 149
    goto :goto_5

    .line 150
    :catchall_3
    move-exception v0

    .line 151
    :try_start_8
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 152
    .line 153
    .line 154
    :cond_2
    :goto_5
    throw v1
    :try_end_8
    .catch Ljava/lang/SecurityException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 155
    :catch_0
    move-exception v0

    .line 156
    new-instance v1, Ljava/lang/SecurityException;

    .line 157
    .line 158
    const-string v2, "Unable to stage Native release"

    .line 159
    .line 160
    invoke-direct {v1, v2, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    throw v1

    .line 164
    :catch_1
    move-exception v0

    .line 165
    throw v0

    .line 166
    :cond_3
    const-string v0, "Native activation envelope size is invalid"

    .line 167
    .line 168
    invoke-static {v0}, Lc80;->x(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    const/4 v0, 0x0

    .line 172
    return-object v0
.end method

.method public static final l(Lzt0;Lpx;I)V
    .locals 28

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    check-cast v8, Lgo0;

    .line 6
    .line 7
    const v1, 0x49af0696    # 1433810.8f

    .line 8
    .line 9
    .line 10
    invoke-virtual {v8, v1}, Lgo0;->X(I)Lgo0;

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {v8, v1}, Lgo0;->d(I)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v11, 0x2

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v1, v11

    .line 27
    :goto_0
    or-int/2addr v1, v0

    .line 28
    and-int/lit8 v2, v1, 0x3

    .line 29
    .line 30
    const/4 v12, 0x1

    .line 31
    const/4 v13, 0x0

    .line 32
    if-eq v2, v11, :cond_1

    .line 33
    .line 34
    move v2, v12

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v2, v13

    .line 37
    :goto_1
    and-int/2addr v1, v12

    .line 38
    invoke-virtual {v8, v1, v2}, Lgo0;->O(IZ)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_6

    .line 43
    .line 44
    invoke-static/range {p0 .. p0}, Ls11;->A(Lzt0;)J

    .line 45
    .line 46
    .line 47
    move-result-wide v3

    .line 48
    const/high16 v1, 0x42080000    # 34.0f

    .line 49
    .line 50
    sget-object v2, Lrh1;->a:Lrh1;

    .line 51
    .line 52
    invoke-static {v2, v1}, Lte;->g0(Luh1;F)Luh1;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const/high16 v5, 0x41300000    # 11.0f

    .line 57
    .line 58
    invoke-static {v5}, Lgb2;->a(F)Lfb2;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-static {v1, v5}, Lci0;->z(Luh1;Leq2;)Luh1;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const v5, 0x3e0f5c29    # 0.14f

    .line 67
    .line 68
    .line 69
    invoke-static {v5, v3, v4}, Lju;->b(FJ)J

    .line 70
    .line 71
    .line 72
    move-result-wide v5

    .line 73
    sget-object v7, Lsp0;->h:Liu0;

    .line 74
    .line 75
    invoke-static {v1, v5, v6, v7}, Lgf1;->n(Luh1;JLeq2;)Luh1;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    sget-object v5, Lsn;->n:Lrk;

    .line 80
    .line 81
    invoke-static {v5, v13}, Ldm;->d(Lr5;Z)Lnf1;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    iget-wide v6, v8, Lgo0;->T:J

    .line 86
    .line 87
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    invoke-virtual {v8}, Lgo0;->l()Lyy1;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    invoke-static {v8, v1}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    sget-object v9, Lhx;->c:Lgx;

    .line 100
    .line 101
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    sget-object v9, Lgx;->b:Ljy;

    .line 105
    .line 106
    invoke-virtual {v8}, Lgo0;->Z()V

    .line 107
    .line 108
    .line 109
    iget-boolean v10, v8, Lgo0;->S:Z

    .line 110
    .line 111
    if-eqz v10, :cond_2

    .line 112
    .line 113
    invoke-virtual {v8, v9}, Lgo0;->k(Lxm0;)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_2
    invoke-virtual {v8}, Lgo0;->i0()V

    .line 118
    .line 119
    .line 120
    :goto_2
    sget-object v9, Lgx;->e:Llc;

    .line 121
    .line 122
    invoke-static {v8, v9, v5}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    sget-object v5, Lgx;->d:Llc;

    .line 126
    .line 127
    invoke-static {v8, v5, v7}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    sget-object v6, Lgx;->f:Llc;

    .line 135
    .line 136
    invoke-static {v8, v6, v5}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    sget-object v5, Lgx;->g:Lv6;

    .line 140
    .line 141
    invoke-static {v8, v5}, Lyf3;->b(Lpx;Lin0;)V

    .line 142
    .line 143
    .line 144
    sget-object v5, Lgx;->c:Llc;

    .line 145
    .line 146
    invoke-static {v8, v5, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->ordinal()I

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-eqz v1, :cond_5

    .line 154
    .line 155
    const/16 v2, 0x12

    .line 156
    .line 157
    if-eq v1, v12, :cond_4

    .line 158
    .line 159
    if-ne v1, v11, :cond_3

    .line 160
    .line 161
    const v1, -0x73243a99

    .line 162
    .line 163
    .line 164
    invoke-virtual {v8, v1}, Lgo0;->W(I)V

    .line 165
    .line 166
    .line 167
    invoke-static {v2}, Lrg3;->D(I)J

    .line 168
    .line 169
    .line 170
    move-result-wide v17

    .line 171
    invoke-static {v2}, Lrg3;->D(I)J

    .line 172
    .line 173
    .line 174
    move-result-wide v23

    .line 175
    sget-object v19, Lim0;->m:Lim0;

    .line 176
    .line 177
    new-instance v14, Lm13;

    .line 178
    .line 179
    const/16 v26, 0x0

    .line 180
    .line 181
    const v27, 0xfdfff8

    .line 182
    .line 183
    .line 184
    const-wide/16 v20, 0x0

    .line 185
    .line 186
    const/16 v22, 0x0

    .line 187
    .line 188
    const/16 v25, 0x0

    .line 189
    .line 190
    move-wide v15, v3

    .line 191
    invoke-direct/range {v14 .. v27}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 192
    .line 193
    .line 194
    const/4 v9, 0x6

    .line 195
    const/16 v10, 0x3fa

    .line 196
    .line 197
    const-string v1, "!"

    .line 198
    .line 199
    const/4 v2, 0x0

    .line 200
    const/4 v4, 0x0

    .line 201
    const/4 v5, 0x0

    .line 202
    const/4 v6, 0x0

    .line 203
    const/4 v7, 0x0

    .line 204
    move-object v3, v14

    .line 205
    invoke-static/range {v1 .. v10}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v8, v13}, Lgo0;->p(Z)V

    .line 209
    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_3
    const v0, -0x7324842f

    .line 213
    .line 214
    .line 215
    invoke-virtual {v8, v0}, Lgo0;->W(I)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v8, v13}, Lgo0;->p(Z)V

    .line 219
    .line 220
    .line 221
    invoke-static {}, Lc80;->s()V

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :cond_4
    move-wide v15, v3

    .line 226
    const v1, -0x73246139

    .line 227
    .line 228
    .line 229
    invoke-virtual {v8, v1}, Lgo0;->W(I)V

    .line 230
    .line 231
    .line 232
    invoke-static {v2}, Lrg3;->D(I)J

    .line 233
    .line 234
    .line 235
    move-result-wide v17

    .line 236
    invoke-static {v2}, Lrg3;->D(I)J

    .line 237
    .line 238
    .line 239
    move-result-wide v23

    .line 240
    sget-object v19, Lim0;->m:Lim0;

    .line 241
    .line 242
    new-instance v14, Lm13;

    .line 243
    .line 244
    const/16 v26, 0x0

    .line 245
    .line 246
    const v27, 0xfdfff8

    .line 247
    .line 248
    .line 249
    const-wide/16 v20, 0x0

    .line 250
    .line 251
    const/16 v22, 0x0

    .line 252
    .line 253
    const/16 v25, 0x0

    .line 254
    .line 255
    invoke-direct/range {v14 .. v27}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 256
    .line 257
    .line 258
    const/4 v9, 0x6

    .line 259
    const/16 v10, 0x3fa

    .line 260
    .line 261
    const-string v1, "-"

    .line 262
    .line 263
    const/4 v2, 0x0

    .line 264
    const/4 v4, 0x0

    .line 265
    const/4 v5, 0x0

    .line 266
    const/4 v6, 0x0

    .line 267
    const/4 v7, 0x0

    .line 268
    move-object v3, v14

    .line 269
    invoke-static/range {v1 .. v10}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v8, v13}, Lgo0;->p(Z)V

    .line 273
    .line 274
    .line 275
    goto :goto_3

    .line 276
    :cond_5
    move-wide v15, v3

    .line 277
    const v1, -0x73247fe0

    .line 278
    .line 279
    .line 280
    invoke-virtual {v8, v1}, Lgo0;->W(I)V

    .line 281
    .line 282
    .line 283
    invoke-static {}, Lp7;->u()Lsx0;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    const/high16 v3, 0x41900000    # 18.0f

    .line 288
    .line 289
    invoke-static {v2, v3}, Lte;->g0(Luh1;F)Luh1;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    const/16 v6, 0x1b0

    .line 294
    .line 295
    move-object v5, v8

    .line 296
    move-wide v3, v15

    .line 297
    invoke-static/range {v1 .. v6}, Lfx0;->a(Lsx0;Luh1;JLpx;I)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v8, v13}, Lgo0;->p(Z)V

    .line 301
    .line 302
    .line 303
    :goto_3
    invoke-virtual {v8, v12}, Lgo0;->p(Z)V

    .line 304
    .line 305
    .line 306
    goto :goto_4

    .line 307
    :cond_6
    invoke-virtual {v8}, Lgo0;->R()V

    .line 308
    .line 309
    .line 310
    :goto_4
    invoke-virtual {v8}, Lgo0;->r()Lb62;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    if-eqz v1, :cond_7

    .line 315
    .line 316
    new-instance v2, Lbt0;

    .line 317
    .line 318
    move-object/from16 v3, p0

    .line 319
    .line 320
    invoke-direct {v2, v3, v0, v11}, Lbt0;-><init>(Lzt0;II)V

    .line 321
    .line 322
    .line 323
    iput-object v2, v1, Lb62;->d:Lmn0;

    .line 324
    .line 325
    :cond_7
    return-void
.end method

.method public static l0(Ljava/io/File;Ljava/io/File;J)Lud0;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-static {v1, v0}, Lzl1;->f(Ljava/io/File;Ljava/io/File;)Lb5;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    iget-object v2, v3, Lb5;->i:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lh80;

    .line 12
    .line 13
    new-instance v4, Ljava/io/File;

    .line 14
    .line 15
    iget-object v5, v3, Lb5;->j:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v5, Ljava/io/File;

    .line 18
    .line 19
    invoke-virtual {v5}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    const-string v6, "release.nkr"

    .line 24
    .line 25
    invoke-direct {v4, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v4, v1}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_0

    .line 33
    .line 34
    new-instance v0, Lud0;

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    move-wide/from16 v1, p2

    .line 38
    .line 39
    invoke-direct/range {v0 .. v5}, Lud0;-><init>(JLb5;Ljava/io/File;Ljava/io/File;)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_0
    invoke-static {}, Ls11;->g0()Ljava/io/File;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v5}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-virtual {v4}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-virtual {v6}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    new-instance v7, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v8, "."

    .line 72
    .line 73
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    const-string v8, ".tmp"

    .line 81
    .line 82
    const/4 v9, 0x0

    .line 83
    new-array v10, v9, [Ljava/nio/file/attribute/FileAttribute;

    .line 84
    .line 85
    invoke-static {v6, v7, v8, v10}, Ljava/nio/file/Files;->createTempFile(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-virtual {v1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    sget-object v7, Ljava/nio/file/LinkOption;->NOFOLLOW_LINKS:Ljava/nio/file/LinkOption;

    .line 94
    .line 95
    const/4 v8, 0x2

    .line 96
    new-array v10, v8, [Ljava/nio/file/OpenOption;

    .line 97
    .line 98
    sget-object v11, Ljava/nio/file/StandardOpenOption;->READ:Ljava/nio/file/StandardOpenOption;

    .line 99
    .line 100
    aput-object v11, v10, v9

    .line 101
    .line 102
    const/4 v11, 0x1

    .line 103
    aput-object v7, v10, v11

    .line 104
    .line 105
    invoke-static {v1, v10}, Ljava/nio/channels/FileChannel;->open(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/nio/channels/FileChannel;

    .line 106
    .line 107
    .line 108
    move-result-object v12

    .line 109
    :try_start_0
    new-array v1, v8, [Ljava/nio/file/OpenOption;

    .line 110
    .line 111
    sget-object v8, Ljava/nio/file/StandardOpenOption;->WRITE:Ljava/nio/file/StandardOpenOption;

    .line 112
    .line 113
    aput-object v8, v1, v9

    .line 114
    .line 115
    aput-object v7, v1, v11

    .line 116
    .line 117
    invoke-static {v6, v1}, Ljava/nio/channels/FileChannel;->open(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/nio/channels/FileChannel;

    .line 118
    .line 119
    .line 120
    move-result-object v17
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 121
    const-wide/16 v7, 0x0

    .line 122
    .line 123
    move-wide v13, v7

    .line 124
    :goto_0
    :try_start_1
    invoke-virtual {v12}, Ljava/nio/channels/FileChannel;->size()J

    .line 125
    .line 126
    .line 127
    move-result-wide v9

    .line 128
    cmp-long v1, v13, v9

    .line 129
    .line 130
    if-gez v1, :cond_2

    .line 131
    .line 132
    invoke-virtual {v12}, Ljava/nio/channels/FileChannel;->size()J

    .line 133
    .line 134
    .line 135
    move-result-wide v9

    .line 136
    sub-long v15, v9, v13

    .line 137
    .line 138
    invoke-virtual/range {v12 .. v17}, Ljava/nio/channels/FileChannel;->transferTo(JJLjava/nio/channels/WritableByteChannel;)J

    .line 139
    .line 140
    .line 141
    move-result-wide v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 142
    move-object/from16 v1, v17

    .line 143
    .line 144
    cmp-long v15, v9, v7

    .line 145
    .line 146
    if-lez v15, :cond_1

    .line 147
    .line 148
    add-long/2addr v13, v9

    .line 149
    move-object/from16 v17, v1

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_1
    :try_start_2
    new-instance v0, Ljava/lang/SecurityException;

    .line 153
    .line 154
    const-string v2, "Unable to copy Native release package"

    .line 155
    .line 156
    invoke-direct {v0, v2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw v0

    .line 160
    :catchall_0
    move-exception v0

    .line 161
    :goto_1
    move-object v2, v0

    .line 162
    goto :goto_2

    .line 163
    :catchall_1
    move-exception v0

    .line 164
    move-object/from16 v1, v17

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_2
    move-object/from16 v1, v17

    .line 168
    .line 169
    invoke-virtual {v1, v11}, Ljava/nio/channels/FileChannel;->force(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 170
    .line 171
    .line 172
    :try_start_3
    invoke-virtual {v1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 173
    .line 174
    .line 175
    invoke-virtual {v12}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v4}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-static {v5, v6, v1}, Lup0;->g(Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;)V

    .line 183
    .line 184
    .line 185
    invoke-static {v4, v0}, Lzl1;->f(Ljava/io/File;Ljava/io/File;)Lb5;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    iget-object v0, v7, Lb5;->i:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v0, Lh80;

    .line 192
    .line 193
    iget-object v1, v0, Lh80;->a:Ljava/lang/String;

    .line 194
    .line 195
    iget-object v5, v2, Lh80;->a:Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-eqz v1, :cond_3

    .line 202
    .line 203
    iget-wide v0, v0, Lh80;->b:J

    .line 204
    .line 205
    iget-wide v5, v2, Lh80;->b:J

    .line 206
    .line 207
    cmp-long v0, v0, v5

    .line 208
    .line 209
    if-nez v0, :cond_3

    .line 210
    .line 211
    iget-object v0, v7, Lb5;->k:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v0, Ljava/lang/String;

    .line 214
    .line 215
    iget-object v1, v3, Lb5;->k:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v1, Ljava/lang/String;

    .line 218
    .line 219
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-eqz v0, :cond_3

    .line 224
    .line 225
    move-object v8, v4

    .line 226
    new-instance v4, Lud0;

    .line 227
    .line 228
    const/4 v9, 0x0

    .line 229
    move-wide/from16 v5, p2

    .line 230
    .line 231
    invoke-direct/range {v4 .. v9}, Lud0;-><init>(JLb5;Ljava/io/File;Ljava/io/File;)V

    .line 232
    .line 233
    .line 234
    return-object v4

    .line 235
    :cond_3
    invoke-virtual {v4}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-static {v0}, Ljava/nio/file/Files;->deleteIfExists(Ljava/nio/file/Path;)Z

    .line 240
    .line 241
    .line 242
    const-string v0, "Native release changed while being staged"

    .line 243
    .line 244
    invoke-static {v0}, Lc80;->x(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    const/4 v0, 0x0

    .line 248
    return-object v0

    .line 249
    :catchall_2
    move-exception v0

    .line 250
    move-object v1, v0

    .line 251
    goto :goto_4

    .line 252
    :goto_2
    if-eqz v1, :cond_4

    .line 253
    .line 254
    :try_start_4
    invoke-virtual {v1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 255
    .line 256
    .line 257
    goto :goto_3

    .line 258
    :catchall_3
    move-exception v0

    .line 259
    :try_start_5
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 260
    .line 261
    .line 262
    :cond_4
    :goto_3
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 263
    :goto_4
    if-eqz v12, :cond_5

    .line 264
    .line 265
    :try_start_6
    invoke-virtual {v12}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 266
    .line 267
    .line 268
    goto :goto_5

    .line 269
    :catchall_4
    move-exception v0

    .line 270
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 271
    .line 272
    .line 273
    :cond_5
    :goto_5
    throw v1
.end method

.method public static final m(Lzt0;Lpx;I)V
    .locals 4

    .line 1
    check-cast p1, Lgo0;

    .line 2
    .line 3
    const v0, -0x2e8a21fe    # -6.599948E10f

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lgo0;->X(I)Lgo0;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p1, v0}, Lgo0;->d(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x2

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v0, v1

    .line 23
    :goto_0
    or-int/2addr v0, p2

    .line 24
    and-int/lit8 v2, v0, 0x3

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    if-eq v2, v1, :cond_1

    .line 28
    .line 29
    move v1, v3

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/4 v1, 0x0

    .line 32
    :goto_1
    and-int/lit8 v2, v0, 0x1

    .line 33
    .line 34
    invoke-virtual {p1, v2, v1}, Lgo0;->O(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    invoke-static {p0, p1}, Ls11;->P(Lzt0;Lpx;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    shl-int/lit8 v0, v0, 0x3

    .line 45
    .line 46
    and-int/lit8 v0, v0, 0x70

    .line 47
    .line 48
    invoke-static {v1, p0, p1, v0}, Ls11;->h(Ljava/lang/String;Lzt0;Lpx;I)V

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    invoke-virtual {p1}, Lgo0;->R()V

    .line 53
    .line 54
    .line 55
    :goto_2
    invoke-virtual {p1}, Lgo0;->r()Lb62;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    new-instance v0, Lbt0;

    .line 62
    .line 63
    invoke-direct {v0, p0, p2, v3}, Lbt0;-><init>(Lzt0;II)V

    .line 64
    .line 65
    .line 66
    iput-object v0, p1, Lb62;->d:Lmn0;

    .line 67
    .line 68
    :cond_3
    return-void
.end method

.method public static m0(Ljava/io/InputStream;Ljava/lang/String;JLjava/lang/String;Lrl1;)Ljava/io/File;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    const-string v3, "[0-9a-fA-F-]{36}"

    .line 8
    .line 9
    invoke-virtual {v0, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_7

    .line 14
    .line 15
    const-wide/16 v5, 0x0

    .line 16
    .line 17
    cmp-long v3, p2, v5

    .line 18
    .line 19
    if-lez v3, :cond_7

    .line 20
    .line 21
    const-wide/32 v7, 0x4000000

    .line 22
    .line 23
    .line 24
    cmp-long v3, p2, v7

    .line 25
    .line 26
    if-gtz v3, :cond_7

    .line 27
    .line 28
    const-string v3, "[0-9a-f]{64}"

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_7

    .line 35
    .line 36
    invoke-static {}, Ls11;->g0()Ljava/io/File;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    new-instance v9, Ljava/io/File;

    .line 41
    .line 42
    const-string v10, "downloads"

    .line 43
    .line 44
    invoke-direct {v9, v3, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v9}, Ls11;->H(Ljava/io/File;)V

    .line 48
    .line 49
    .line 50
    new-instance v10, Ljava/io/File;

    .line 51
    .line 52
    new-instance v11, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v0, "-"

    .line 61
    .line 62
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v0, ".nkr"

    .line 69
    .line 70
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-direct {v10, v9, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v9}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    new-instance v9, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v11

    .line 97
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v11, "."

    .line 101
    .line 102
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    const-string v11, ".tmp"

    .line 110
    .line 111
    const/4 v12, 0x0

    .line 112
    new-array v13, v12, [Ljava/nio/file/attribute/FileAttribute;

    .line 113
    .line 114
    invoke-static {v3, v9, v11, v13}, Ljava/nio/file/Files;->createTempFile(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;

    .line 115
    .line 116
    .line 117
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 118
    :try_start_1
    const-string v9, "SHA-256"

    .line 119
    .line 120
    invoke-static {v9}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 121
    .line 122
    .line 123
    move-result-object v9
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 124
    :try_start_2
    new-instance v11, Ljava/io/FileOutputStream;

    .line 125
    .line 126
    invoke-interface {v3}, Ljava/nio/file/Path;->toFile()Ljava/io/File;

    .line 127
    .line 128
    .line 129
    move-result-object v13

    .line 130
    invoke-direct {v11, v13}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 131
    .line 132
    .line 133
    const/16 v13, 0x4000

    .line 134
    .line 135
    :try_start_3
    new-array v13, v13, [B

    .line 136
    .line 137
    move-wide v14, v5

    .line 138
    move-object/from16 v5, p5

    .line 139
    .line 140
    :goto_0
    invoke-virtual {v1, v13}, Ljava/io/InputStream;->read([B)I

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    const/16 v16, 0x0

    .line 145
    .line 146
    const/4 v4, -0x1

    .line 147
    if-eq v6, v4, :cond_2

    .line 148
    .line 149
    move-wide/from16 v17, v7

    .line 150
    .line 151
    int-to-long v7, v6

    .line 152
    add-long/2addr v14, v7

    .line 153
    cmp-long v4, v14, p2

    .line 154
    .line 155
    if-gtz v4, :cond_1

    .line 156
    .line 157
    cmp-long v4, v14, v17

    .line 158
    .line 159
    if-gtz v4, :cond_1

    .line 160
    .line 161
    invoke-virtual {v11, v13, v12, v6}, Ljava/io/FileOutputStream;->write([BII)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v9, v13, v12, v6}, Ljava/security/MessageDigest;->update([BII)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 165
    .line 166
    .line 167
    if-eqz v5, :cond_0

    .line 168
    .line 169
    :try_start_4
    iget-object v4, v5, Lrl1;->a:Lmn0;

    .line 170
    .line 171
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    invoke-interface {v4, v6, v7}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 180
    .line 181
    .line 182
    goto :goto_1

    .line 183
    :catchall_0
    move-object/from16 v5, v16

    .line 184
    .line 185
    :cond_0
    :goto_1
    move-wide/from16 v7, v17

    .line 186
    .line 187
    goto :goto_0

    .line 188
    :catchall_1
    move-exception v0

    .line 189
    move-object v2, v0

    .line 190
    goto :goto_2

    .line 191
    :cond_1
    :try_start_5
    new-instance v0, Ljava/lang/SecurityException;

    .line 192
    .line 193
    const-string v2, "Native release download exceeds declared size"

    .line 194
    .line 195
    invoke-direct {v0, v2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw v0

    .line 199
    :cond_2
    invoke-virtual {v11}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    invoke-virtual {v4}, Ljava/io/FileDescriptor;->sync()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 204
    .line 205
    .line 206
    :try_start_6
    invoke-virtual {v11}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 207
    .line 208
    .line 209
    :try_start_7
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v9}, Ljava/security/MessageDigest;->digest()[B

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-static {v1}, Ls11;->L([B)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    cmp-long v4, v14, p2

    .line 221
    .line 222
    if-nez v4, :cond_3

    .line 223
    .line 224
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    if-eqz v1, :cond_3

    .line 229
    .line 230
    invoke-virtual {v10}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-static {v0, v3, v1}, Lup0;->g(Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;)V

    .line 235
    .line 236
    .line 237
    return-object v10

    .line 238
    :catch_0
    move-exception v0

    .line 239
    move-object v4, v3

    .line 240
    goto :goto_6

    .line 241
    :catch_1
    move-exception v0

    .line 242
    move-object v4, v3

    .line 243
    goto :goto_7

    .line 244
    :cond_3
    new-instance v0, Ljava/lang/SecurityException;

    .line 245
    .line 246
    const-string v1, "Native release download digest mismatch"

    .line 247
    .line 248
    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    throw v0
    :try_end_7
    .catch Ljava/lang/SecurityException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 252
    :catchall_2
    move-exception v0

    .line 253
    move-object v2, v0

    .line 254
    goto :goto_4

    .line 255
    :goto_2
    :try_start_8
    invoke-virtual {v11}, Ljava/io/FileOutputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 256
    .line 257
    .line 258
    goto :goto_3

    .line 259
    :catchall_3
    move-exception v0

    .line 260
    :try_start_9
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 261
    .line 262
    .line 263
    :goto_3
    throw v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 264
    :goto_4
    if-eqz v1, :cond_4

    .line 265
    .line 266
    :try_start_a
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 267
    .line 268
    .line 269
    goto :goto_5

    .line 270
    :catchall_4
    move-exception v0

    .line 271
    :try_start_b
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 272
    .line 273
    .line 274
    :cond_4
    :goto_5
    throw v2
    :try_end_b
    .catch Ljava/lang/SecurityException; {:try_start_b .. :try_end_b} :catch_1
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    .line 275
    :catch_2
    move-exception v0

    .line 276
    const/16 v16, 0x0

    .line 277
    .line 278
    move-object/from16 v4, v16

    .line 279
    .line 280
    goto :goto_6

    .line 281
    :catch_3
    move-exception v0

    .line 282
    const/16 v16, 0x0

    .line 283
    .line 284
    move-object/from16 v4, v16

    .line 285
    .line 286
    goto :goto_7

    .line 287
    :goto_6
    if-eqz v4, :cond_5

    .line 288
    .line 289
    :try_start_c
    invoke-static {v4}, Ljava/nio/file/Files;->deleteIfExists(Ljava/nio/file/Path;)Z
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_4

    .line 290
    .line 291
    .line 292
    :catch_4
    :cond_5
    new-instance v1, Ljava/lang/SecurityException;

    .line 293
    .line 294
    const-string v2, "Unable to store Native package download"

    .line 295
    .line 296
    invoke-direct {v1, v2, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 297
    .line 298
    .line 299
    throw v1

    .line 300
    :goto_7
    if-eqz v4, :cond_6

    .line 301
    .line 302
    :try_start_d
    invoke-static {v4}, Ljava/nio/file/Files;->deleteIfExists(Ljava/nio/file/Path;)Z
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_5

    .line 303
    .line 304
    .line 305
    :catch_5
    :cond_6
    throw v0

    .line 306
    :cond_7
    const/16 v16, 0x0

    .line 307
    .line 308
    const-string v0, "Native release download metadata is invalid"

    .line 309
    .line 310
    invoke-static {v0}, Lc80;->x(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    return-object v16
.end method

.method public static final n(Ljava/util/List;Lpx;I)V
    .locals 8

    .line 1
    move-object v3, p1

    .line 2
    check-cast v3, Lgo0;

    .line 3
    .line 4
    const p1, -0x2fd56c36

    .line 5
    .line 6
    .line 7
    invoke-virtual {v3, p1}, Lgo0;->X(I)Lgo0;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v3, p0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/4 v6, 0x4

    .line 15
    const/4 v0, 0x2

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    move p1, v6

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move p1, v0

    .line 21
    :goto_0
    or-int/2addr p1, p2

    .line 22
    and-int/lit8 v1, p1, 0x3

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    const/4 v4, 0x0

    .line 26
    if-eq v1, v0, :cond_1

    .line 27
    .line 28
    move v0, v2

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v0, v4

    .line 31
    :goto_1
    and-int/2addr p1, v2

    .line 32
    invoke-virtual {v3, p1, v0}, Lgo0;->O(IZ)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_e

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    if-eqz p0, :cond_2

    .line 40
    .line 41
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    move v1, v4

    .line 48
    goto :goto_3

    .line 49
    :cond_2
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    move v1, v4

    .line 54
    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_5

    .line 59
    .line 60
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Lxt0;

    .line 65
    .line 66
    iget-object v2, v2, Lxt0;->d:Lzt0;

    .line 67
    .line 68
    sget-object v5, Lzt0;->h:Lzt0;

    .line 69
    .line 70
    if-ne v2, v5, :cond_3

    .line 71
    .line 72
    add-int/lit8 v1, v1, 0x1

    .line 73
    .line 74
    if-ltz v1, :cond_4

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    invoke-static {}, Leu;->Z()V

    .line 78
    .line 79
    .line 80
    throw p1

    .line 81
    :cond_5
    :goto_3
    if-eqz p0, :cond_6

    .line 82
    .line 83
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_6

    .line 88
    .line 89
    move v2, v4

    .line 90
    goto :goto_5

    .line 91
    :cond_6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    move v2, v4

    .line 96
    :cond_7
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-eqz v5, :cond_9

    .line 101
    .line 102
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    check-cast v5, Lxt0;

    .line 107
    .line 108
    iget-object v5, v5, Lxt0;->d:Lzt0;

    .line 109
    .line 110
    sget-object v7, Lzt0;->i:Lzt0;

    .line 111
    .line 112
    if-ne v5, v7, :cond_7

    .line 113
    .line 114
    add-int/lit8 v2, v2, 0x1

    .line 115
    .line 116
    if-ltz v2, :cond_8

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_8
    invoke-static {}, Leu;->Z()V

    .line 120
    .line 121
    .line 122
    throw p1

    .line 123
    :cond_9
    :goto_5
    if-eqz p0, :cond_a

    .line 124
    .line 125
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eqz v0, :cond_a

    .line 130
    .line 131
    goto :goto_7

    .line 132
    :cond_a
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    :cond_b
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    if-eqz v5, :cond_d

    .line 141
    .line 142
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    check-cast v5, Lxt0;

    .line 147
    .line 148
    iget-object v5, v5, Lxt0;->d:Lzt0;

    .line 149
    .line 150
    sget-object v7, Lzt0;->j:Lzt0;

    .line 151
    .line 152
    if-ne v5, v7, :cond_b

    .line 153
    .line 154
    add-int/lit8 v4, v4, 0x1

    .line 155
    .line 156
    if-ltz v4, :cond_c

    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_c
    invoke-static {}, Leu;->Z()V

    .line 160
    .line 161
    .line 162
    throw p1

    .line 163
    :cond_d
    :goto_7
    const p1, 0x790b012f

    .line 164
    .line 165
    .line 166
    invoke-static {p1, v3}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    new-instance v0, Lut0;

    .line 171
    .line 172
    invoke-direct {v0, v1, v2, v4}, Lut0;-><init>(III)V

    .line 173
    .line 174
    .line 175
    const v1, -0x2332ec97

    .line 176
    .line 177
    .line 178
    invoke-static {v1, v0, v3}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    const/16 v4, 0x180

    .line 183
    .line 184
    const/4 v5, 0x1

    .line 185
    const/4 v0, 0x0

    .line 186
    move-object v1, p1

    .line 187
    invoke-static/range {v0 .. v5}, Leu;->n(Luh1;Ljava/lang/String;Lkw;Lpx;II)V

    .line 188
    .line 189
    .line 190
    goto :goto_8

    .line 191
    :cond_e
    invoke-virtual {v3}, Lgo0;->R()V

    .line 192
    .line 193
    .line 194
    :goto_8
    invoke-virtual {v3}, Lgo0;->r()Lb62;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    if-eqz p1, :cond_f

    .line 199
    .line 200
    new-instance v0, Lq1;

    .line 201
    .line 202
    invoke-direct {v0, p0, p2, v6}, Lq1;-><init>(Ljava/util/List;II)V

    .line 203
    .line 204
    .line 205
    iput-object v0, p1, Lb62;->d:Lmn0;

    .line 206
    .line 207
    :cond_f
    return-void
.end method

.method public static final n0(Luh1;Ldq1;Lvz2;Lwz2;Lj10;)Luh1;
    .locals 1

    .line 1
    new-instance v0, Lez2;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Lez2;-><init>(Ldq1;Lvz2;Lwz2;Lj10;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Luh1;->c(Luh1;)Luh1;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final o(Ls62;Lpx;I)V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v5, p1

    .line 6
    .line 7
    check-cast v5, Lgo0;

    .line 8
    .line 9
    const v2, 0x1afe640c

    .line 10
    .line 11
    .line 12
    invoke-virtual {v5, v2}, Lgo0;->X(I)Lgo0;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v5, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v12, 0x2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    const/4 v2, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v12

    .line 25
    :goto_0
    or-int v14, v1, v2

    .line 26
    .line 27
    and-int/lit8 v2, v14, 0x3

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    if-eq v2, v12, :cond_1

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v2, v3

    .line 35
    :goto_1
    and-int/lit8 v4, v14, 0x1

    .line 36
    .line 37
    invoke-virtual {v5, v4, v2}, Lgo0;->O(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_a

    .line 42
    .line 43
    sget-object v2, Lr7;->b:Ltu2;

    .line 44
    .line 45
    invoke-virtual {v5, v2}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Landroid/content/Context;

    .line 50
    .line 51
    sget-object v4, Lrh1;->a:Lrh1;

    .line 52
    .line 53
    const/high16 v6, 0x42280000    # 42.0f

    .line 54
    .line 55
    invoke-static {v4, v6}, Lte;->g0(Luh1;F)Luh1;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    sget-object v8, Lgb2;->a:Lfb2;

    .line 60
    .line 61
    invoke-static {v7, v8}, Lci0;->z(Luh1;Leq2;)Luh1;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    sget-object v9, Lur1;->a:Ltu2;

    .line 66
    .line 67
    invoke-virtual {v5, v9}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    check-cast v10, Llp1;

    .line 72
    .line 73
    iget-wide v10, v10, Llp1;->g:J

    .line 74
    .line 75
    const v6, 0x3e0f5c29    # 0.14f

    .line 76
    .line 77
    .line 78
    invoke-static {v6, v10, v11}, Lju;->b(FJ)J

    .line 79
    .line 80
    .line 81
    move-result-wide v10

    .line 82
    sget-object v6, Lsp0;->h:Liu0;

    .line 83
    .line 84
    invoke-static {v7, v10, v11, v6}, Lgf1;->n(Luh1;JLeq2;)Luh1;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    sget-object v7, Lsn;->n:Lrk;

    .line 89
    .line 90
    invoke-static {v7, v3}, Ldm;->d(Lr5;Z)Lnf1;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    iget-wide v10, v5, Lgo0;->T:J

    .line 95
    .line 96
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 97
    .line 98
    .line 99
    move-result v10

    .line 100
    invoke-virtual {v5}, Lgo0;->l()Lyy1;

    .line 101
    .line 102
    .line 103
    move-result-object v11

    .line 104
    invoke-static {v5, v6}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    sget-object v16, Lhx;->c:Lgx;

    .line 109
    .line 110
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    sget-object v3, Lgx;->b:Ljy;

    .line 114
    .line 115
    invoke-virtual {v5}, Lgo0;->Z()V

    .line 116
    .line 117
    .line 118
    iget-boolean v15, v5, Lgo0;->S:Z

    .line 119
    .line 120
    if-eqz v15, :cond_2

    .line 121
    .line 122
    invoke-virtual {v5, v3}, Lgo0;->k(Lxm0;)V

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_2
    invoke-virtual {v5}, Lgo0;->i0()V

    .line 127
    .line 128
    .line 129
    :goto_2
    sget-object v3, Lgx;->e:Llc;

    .line 130
    .line 131
    invoke-static {v5, v3, v7}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    sget-object v3, Lgx;->d:Llc;

    .line 135
    .line 136
    invoke-static {v5, v3, v11}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    sget-object v7, Lgx;->f:Llc;

    .line 144
    .line 145
    invoke-static {v5, v7, v3}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    sget-object v3, Lgx;->g:Lv6;

    .line 149
    .line 150
    invoke-static {v5, v3}, Lyf3;->b(Lpx;Lin0;)V

    .line 151
    .line 152
    .line 153
    sget-object v3, Lgx;->c:Llc;

    .line 154
    .line 155
    invoke-static {v5, v3, v6}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    iget-object v3, v0, Ls62;->b:Ljava/lang/String;

    .line 159
    .line 160
    invoke-static {v3}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    invoke-static {v3}, Lpv2;->n0(Ljava/lang/String;)Ljava/lang/Character;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    if-eqz v3, :cond_3

    .line 173
    .line 174
    invoke-virtual {v3}, Ljava/lang/Character;->charValue()C

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    goto :goto_3

    .line 187
    :cond_3
    const/4 v3, 0x0

    .line 188
    :goto_3
    if-nez v3, :cond_4

    .line 189
    .line 190
    const-string v3, ""

    .line 191
    .line 192
    :cond_4
    new-instance v17, Lm13;

    .line 193
    .line 194
    invoke-virtual {v5, v9}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    check-cast v6, Llp1;

    .line 199
    .line 200
    iget-wide v6, v6, Llp1;->g:J

    .line 201
    .line 202
    const/16 v9, 0xf

    .line 203
    .line 204
    invoke-static {v9}, Lrg3;->D(I)J

    .line 205
    .line 206
    .line 207
    move-result-wide v20

    .line 208
    sget-object v22, Lim0;->m:Lim0;

    .line 209
    .line 210
    const/16 v29, 0x0

    .line 211
    .line 212
    const v30, 0xfffff8

    .line 213
    .line 214
    .line 215
    const-wide/16 v23, 0x0

    .line 216
    .line 217
    const/16 v25, 0x0

    .line 218
    .line 219
    const-wide/16 v26, 0x0

    .line 220
    .line 221
    const/16 v28, 0x0

    .line 222
    .line 223
    move-wide/from16 v18, v6

    .line 224
    .line 225
    invoke-direct/range {v17 .. v30}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 226
    .line 227
    .line 228
    const/4 v10, 0x0

    .line 229
    const/16 v11, 0x3fa

    .line 230
    .line 231
    move-object v6, v2

    .line 232
    move-object v2, v3

    .line 233
    const/4 v3, 0x0

    .line 234
    move-object v9, v5

    .line 235
    const/4 v5, 0x0

    .line 236
    move-object v7, v6

    .line 237
    const/4 v6, 0x0

    .line 238
    move-object v15, v7

    .line 239
    const/4 v7, 0x0

    .line 240
    move-object/from16 v18, v8

    .line 241
    .line 242
    const/4 v8, 0x0

    .line 243
    move-object v13, v4

    .line 244
    move-object/from16 v4, v17

    .line 245
    .line 246
    move-object/from16 v12, v18

    .line 247
    .line 248
    move/from16 v18, v14

    .line 249
    .line 250
    const/high16 v14, 0x42280000    # 42.0f

    .line 251
    .line 252
    invoke-static/range {v2 .. v11}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 253
    .line 254
    .line 255
    iget-object v2, v0, Ls62;->c:Ljava/lang/String;

    .line 256
    .line 257
    invoke-static {v2}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    if-nez v2, :cond_9

    .line 262
    .line 263
    const v2, 0x10dbb1a9

    .line 264
    .line 265
    .line 266
    invoke-virtual {v9, v2}, Lgo0;->W(I)V

    .line 267
    .line 268
    .line 269
    invoke-static {v13, v14}, Lte;->g0(Luh1;F)Luh1;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    invoke-static {v2, v12}, Lci0;->z(Luh1;Leq2;)Luh1;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    sget-object v4, Lnx;->a:Leb;

    .line 282
    .line 283
    if-ne v2, v4, :cond_5

    .line 284
    .line 285
    new-instance v2, Lw;

    .line 286
    .line 287
    const/16 v5, 0x10

    .line 288
    .line 289
    invoke-direct {v2, v5}, Lw;-><init>(I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v9, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    :cond_5
    check-cast v2, Lin0;

    .line 296
    .line 297
    invoke-virtual {v9, v15}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    and-int/lit8 v6, v18, 0xe

    .line 302
    .line 303
    const/4 v7, 0x4

    .line 304
    if-ne v6, v7, :cond_6

    .line 305
    .line 306
    const/4 v6, 0x1

    .line 307
    goto :goto_4

    .line 308
    :cond_6
    const/4 v6, 0x0

    .line 309
    :goto_4
    or-int/2addr v5, v6

    .line 310
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    if-nez v5, :cond_7

    .line 315
    .line 316
    if-ne v6, v4, :cond_8

    .line 317
    .line 318
    :cond_7
    new-instance v6, Ld2;

    .line 319
    .line 320
    const/4 v4, 0x2

    .line 321
    invoke-direct {v6, v4, v15, v0}, Ld2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v9, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    :cond_8
    move-object v4, v6

    .line 328
    check-cast v4, Lin0;

    .line 329
    .line 330
    const/4 v6, 0x6

    .line 331
    const/4 v7, 0x0

    .line 332
    move-object v5, v9

    .line 333
    invoke-static/range {v2 .. v7}, Lpp0;->b(Lin0;Luh1;Lin0;Lpx;II)V

    .line 334
    .line 335
    .line 336
    const/4 v2, 0x0

    .line 337
    invoke-virtual {v9, v2}, Lgo0;->p(Z)V

    .line 338
    .line 339
    .line 340
    :goto_5
    const/4 v2, 0x1

    .line 341
    goto :goto_6

    .line 342
    :cond_9
    const/4 v2, 0x0

    .line 343
    const v3, 0x10e5fa5c

    .line 344
    .line 345
    .line 346
    invoke-virtual {v9, v3}, Lgo0;->W(I)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v9, v2}, Lgo0;->p(Z)V

    .line 350
    .line 351
    .line 352
    goto :goto_5

    .line 353
    :goto_6
    invoke-virtual {v9, v2}, Lgo0;->p(Z)V

    .line 354
    .line 355
    .line 356
    goto :goto_7

    .line 357
    :cond_a
    move-object v9, v5

    .line 358
    invoke-virtual {v9}, Lgo0;->R()V

    .line 359
    .line 360
    .line 361
    :goto_7
    invoke-virtual {v9}, Lgo0;->r()Lb62;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    if-eqz v2, :cond_b

    .line 366
    .line 367
    new-instance v3, Ls9;

    .line 368
    .line 369
    const/4 v4, 0x2

    .line 370
    invoke-direct {v3, v1, v4, v0}, Ls9;-><init>(IILjava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    iput-object v3, v2, Lb62;->d:Lmn0;

    .line 374
    .line 375
    :cond_b
    return-void
.end method

.method public static o0(ILsh0;)Lb5;
    .locals 6

    .line 1
    new-instance v1, Le9;

    .line 2
    .line 3
    const/4 v0, 0x6

    .line 4
    invoke-direct {v1, p0, v0}, Le9;-><init>(II)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lb5;

    .line 8
    .line 9
    const/16 v4, 0xb

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    sget-object v3, Ls11;->c:Leb;

    .line 13
    .line 14
    move-object v2, p1

    .line 15
    invoke-direct/range {v0 .. v5}, Lb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public static final p(Ls62;ZLin0;Lpx;I)V
    .locals 30

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v11, p3

    .line 8
    .line 9
    check-cast v11, Lgo0;

    .line 10
    .line 11
    const v0, 0x3ad4283a

    .line 12
    .line 13
    .line 14
    invoke-virtual {v11, v0}, Lgo0;->X(I)Lgo0;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v11, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x2

    .line 26
    :goto_0
    or-int v0, p4, v0

    .line 27
    .line 28
    invoke-virtual {v11, v2}, Lgo0;->g(Z)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    const/16 v5, 0x20

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    move v4, v5

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/16 v4, 0x10

    .line 39
    .line 40
    :goto_1
    or-int/2addr v0, v4

    .line 41
    invoke-virtual {v11, v3}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    const/16 v6, 0x100

    .line 46
    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    move v4, v6

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/16 v4, 0x80

    .line 52
    .line 53
    :goto_2
    or-int/2addr v0, v4

    .line 54
    and-int/lit16 v4, v0, 0x93

    .line 55
    .line 56
    const/16 v7, 0x92

    .line 57
    .line 58
    const/4 v8, 0x0

    .line 59
    const/4 v15, 0x1

    .line 60
    if-eq v4, v7, :cond_3

    .line 61
    .line 62
    move v4, v15

    .line 63
    goto :goto_3

    .line 64
    :cond_3
    move v4, v8

    .line 65
    :goto_3
    and-int/lit8 v7, v0, 0x1

    .line 66
    .line 67
    invoke-virtual {v11, v7, v4}, Lgo0;->O(IZ)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_b

    .line 72
    .line 73
    sget-object v4, Lte;->e:Lyi0;

    .line 74
    .line 75
    and-int/lit16 v7, v0, 0x380

    .line 76
    .line 77
    if-ne v7, v6, :cond_4

    .line 78
    .line 79
    move v6, v15

    .line 80
    goto :goto_4

    .line 81
    :cond_4
    move v6, v8

    .line 82
    :goto_4
    and-int/lit8 v7, v0, 0x70

    .line 83
    .line 84
    if-ne v7, v5, :cond_5

    .line 85
    .line 86
    move v5, v15

    .line 87
    goto :goto_5

    .line 88
    :cond_5
    move v5, v8

    .line 89
    :goto_5
    or-int/2addr v5, v6

    .line 90
    invoke-virtual {v11}, Lgo0;->L()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    if-nez v5, :cond_6

    .line 95
    .line 96
    sget-object v5, Lnx;->a:Leb;

    .line 97
    .line 98
    if-ne v6, v5, :cond_7

    .line 99
    .line 100
    :cond_6
    new-instance v6, Lqh;

    .line 101
    .line 102
    invoke-direct {v6, v8, v3, v2}, Lqh;-><init>(ILin0;Z)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v11, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_7
    check-cast v6, Lxm0;

    .line 109
    .line 110
    invoke-static {v4, v6}, Ltl;->O(Luh1;Lxm0;)Luh1;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    const/high16 v5, 0x40c00000    # 6.0f

    .line 115
    .line 116
    const/high16 v6, 0x41200000    # 10.0f

    .line 117
    .line 118
    invoke-static {v4, v5, v6}, Lfg1;->D(Luh1;FF)Luh1;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    sget-object v5, Lsn;->t:Lqk;

    .line 123
    .line 124
    sget-object v7, Ltp0;->a:Luf;

    .line 125
    .line 126
    const/16 v9, 0x30

    .line 127
    .line 128
    invoke-static {v7, v5, v11, v9}, Lnb2;->a(Lwf;Lqk;Lpx;I)Lob2;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    iget-wide v9, v11, Lgo0;->T:J

    .line 133
    .line 134
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    invoke-virtual {v11}, Lgo0;->l()Lyy1;

    .line 139
    .line 140
    .line 141
    move-result-object v9

    .line 142
    invoke-static {v11, v4}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    sget-object v10, Lhx;->c:Lgx;

    .line 147
    .line 148
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    sget-object v10, Lgx;->b:Ljy;

    .line 152
    .line 153
    invoke-virtual {v11}, Lgo0;->Z()V

    .line 154
    .line 155
    .line 156
    iget-boolean v12, v11, Lgo0;->S:Z

    .line 157
    .line 158
    if-eqz v12, :cond_8

    .line 159
    .line 160
    invoke-virtual {v11, v10}, Lgo0;->k(Lxm0;)V

    .line 161
    .line 162
    .line 163
    goto :goto_6

    .line 164
    :cond_8
    invoke-virtual {v11}, Lgo0;->i0()V

    .line 165
    .line 166
    .line 167
    :goto_6
    sget-object v12, Lgx;->e:Llc;

    .line 168
    .line 169
    invoke-static {v11, v12, v5}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    sget-object v5, Lgx;->d:Llc;

    .line 173
    .line 174
    invoke-static {v11, v5, v9}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    sget-object v9, Lgx;->f:Llc;

    .line 182
    .line 183
    invoke-static {v11, v9, v7}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    sget-object v7, Lgx;->g:Lv6;

    .line 187
    .line 188
    invoke-static {v11, v7}, Lyf3;->b(Lpx;Lin0;)V

    .line 189
    .line 190
    .line 191
    sget-object v13, Lgx;->c:Llc;

    .line 192
    .line 193
    invoke-static {v11, v13, v4}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    and-int/lit8 v4, v0, 0xe

    .line 197
    .line 198
    invoke-static {v1, v11, v4}, Ls11;->o(Ls62;Lpx;I)V

    .line 199
    .line 200
    .line 201
    const/high16 v4, 0x41400000    # 12.0f

    .line 202
    .line 203
    const/16 p3, 0x10

    .line 204
    .line 205
    sget-object v14, Lrh1;->a:Lrh1;

    .line 206
    .line 207
    invoke-static {v14, v4}, Lte;->q0(Luh1;F)Luh1;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    invoke-static {v11, v4}, Lrp0;->O(Lpx;Luh1;)V

    .line 212
    .line 213
    .line 214
    new-instance v4, Lg71;

    .line 215
    .line 216
    const/high16 v6, 0x3f800000    # 1.0f

    .line 217
    .line 218
    invoke-direct {v4, v6, v15}, Lg71;-><init>(FZ)V

    .line 219
    .line 220
    .line 221
    sget-object v6, Ltp0;->c:Lvf;

    .line 222
    .line 223
    sget-object v15, Lsn;->u:Lpk;

    .line 224
    .line 225
    invoke-static {v6, v15, v11, v8}, Lyu;->a(Lyf;Lpk;Lpx;I)Lav;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    iget-wide v2, v11, Lgo0;->T:J

    .line 230
    .line 231
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    invoke-virtual {v11}, Lgo0;->l()Lyy1;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-static {v11, v4}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    invoke-virtual {v11}, Lgo0;->Z()V

    .line 244
    .line 245
    .line 246
    iget-boolean v8, v11, Lgo0;->S:Z

    .line 247
    .line 248
    if-eqz v8, :cond_9

    .line 249
    .line 250
    invoke-virtual {v11, v10}, Lgo0;->k(Lxm0;)V

    .line 251
    .line 252
    .line 253
    goto :goto_7

    .line 254
    :cond_9
    invoke-virtual {v11}, Lgo0;->i0()V

    .line 255
    .line 256
    .line 257
    :goto_7
    invoke-static {v11, v12, v6}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    invoke-static {v11, v5, v3}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    invoke-static {v2, v11, v9, v11, v7}, Lvi0;->q(ILgo0;Llc;Lgo0;Lv6;)V

    .line 264
    .line 265
    .line 266
    invoke-static {v11, v13, v4}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    iget-object v4, v1, Ls62;->b:Ljava/lang/String;

    .line 270
    .line 271
    sget-object v2, Lur1;->a:Ltu2;

    .line 272
    .line 273
    invoke-virtual {v11, v2}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    check-cast v3, Llp1;

    .line 278
    .line 279
    iget-wide v5, v3, Llp1;->e:J

    .line 280
    .line 281
    const/16 v3, 0xe

    .line 282
    .line 283
    invoke-static {v3}, Lrg3;->D(I)J

    .line 284
    .line 285
    .line 286
    move-result-wide v19

    .line 287
    const/16 v3, 0x13

    .line 288
    .line 289
    invoke-static {v3}, Lrg3;->D(I)J

    .line 290
    .line 291
    .line 292
    move-result-wide v25

    .line 293
    sget-object v21, Lim0;->l:Lim0;

    .line 294
    .line 295
    new-instance v16, Lm13;

    .line 296
    .line 297
    const/16 v28, 0x0

    .line 298
    .line 299
    const v29, 0xfdfff8

    .line 300
    .line 301
    .line 302
    const-wide/16 v22, 0x0

    .line 303
    .line 304
    const/16 v24, 0x0

    .line 305
    .line 306
    const/16 v27, 0x0

    .line 307
    .line 308
    move-wide/from16 v17, v5

    .line 309
    .line 310
    invoke-direct/range {v16 .. v29}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 311
    .line 312
    .line 313
    const v12, 0x186000

    .line 314
    .line 315
    .line 316
    const/16 v13, 0x3aa

    .line 317
    .line 318
    const/4 v5, 0x0

    .line 319
    const/4 v7, 0x2

    .line 320
    const/4 v8, 0x0

    .line 321
    const/4 v9, 0x1

    .line 322
    const/4 v10, 0x0

    .line 323
    move-object/from16 v6, v16

    .line 324
    .line 325
    const/high16 v3, 0x41200000    # 10.0f

    .line 326
    .line 327
    invoke-static/range {v4 .. v13}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 328
    .line 329
    .line 330
    iget-boolean v4, v1, Ls62;->d:Z

    .line 331
    .line 332
    if-eqz v4, :cond_a

    .line 333
    .line 334
    const v4, 0x790b0059

    .line 335
    .line 336
    .line 337
    goto :goto_8

    .line 338
    :cond_a
    const v4, 0x790b0058

    .line 339
    .line 340
    .line 341
    :goto_8
    invoke-static {v4, v11}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    iget-object v5, v1, Ls62;->a:Ljava/lang/String;

    .line 346
    .line 347
    new-instance v6, Ljava/lang/StringBuilder;

    .line 348
    .line 349
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    const-string v4, " \u00b7 "

    .line 356
    .line 357
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    new-instance v16, Lm13;

    .line 368
    .line 369
    invoke-virtual {v11, v2}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    check-cast v2, Llp1;

    .line 374
    .line 375
    iget-wide v5, v2, Llp1;->f:J

    .line 376
    .line 377
    const/16 v2, 0xb

    .line 378
    .line 379
    invoke-static {v2}, Lrg3;->D(I)J

    .line 380
    .line 381
    .line 382
    move-result-wide v19

    .line 383
    invoke-static/range {p3 .. p3}, Lrg3;->D(I)J

    .line 384
    .line 385
    .line 386
    move-result-wide v25

    .line 387
    const/16 v28, 0x0

    .line 388
    .line 389
    const v29, 0xfdfffc

    .line 390
    .line 391
    .line 392
    const/16 v21, 0x0

    .line 393
    .line 394
    const-wide/16 v22, 0x0

    .line 395
    .line 396
    const/16 v24, 0x0

    .line 397
    .line 398
    const/16 v27, 0x0

    .line 399
    .line 400
    move-wide/from16 v17, v5

    .line 401
    .line 402
    invoke-direct/range {v16 .. v29}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 403
    .line 404
    .line 405
    const v12, 0x186000

    .line 406
    .line 407
    .line 408
    const/16 v13, 0x3aa

    .line 409
    .line 410
    const/4 v5, 0x0

    .line 411
    const/4 v7, 0x2

    .line 412
    const/4 v8, 0x0

    .line 413
    const/4 v9, 0x1

    .line 414
    const/4 v10, 0x0

    .line 415
    move-object/from16 v6, v16

    .line 416
    .line 417
    invoke-static/range {v4 .. v13}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 418
    .line 419
    .line 420
    const/4 v8, 0x1

    .line 421
    invoke-virtual {v11, v8}, Lgo0;->p(Z)V

    .line 422
    .line 423
    .line 424
    invoke-static {v14, v3}, Lte;->q0(Luh1;F)Luh1;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    invoke-static {v11, v2}, Lrp0;->O(Lpx;Luh1;)V

    .line 429
    .line 430
    .line 431
    shr-int/lit8 v0, v0, 0x3

    .line 432
    .line 433
    and-int/lit8 v7, v0, 0x7e

    .line 434
    .line 435
    const/4 v4, 0x0

    .line 436
    const/4 v5, 0x0

    .line 437
    move/from16 v2, p1

    .line 438
    .line 439
    move-object/from16 v3, p2

    .line 440
    .line 441
    move-object v6, v11

    .line 442
    invoke-static/range {v2 .. v7}, Lte;->g(ZLin0;Luh1;ZLpx;I)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v11, v8}, Lgo0;->p(Z)V

    .line 446
    .line 447
    .line 448
    goto :goto_9

    .line 449
    :cond_b
    invoke-virtual {v11}, Lgo0;->R()V

    .line 450
    .line 451
    .line 452
    :goto_9
    invoke-virtual {v11}, Lgo0;->r()Lb62;

    .line 453
    .line 454
    .line 455
    move-result-object v6

    .line 456
    if-eqz v6, :cond_c

    .line 457
    .line 458
    new-instance v0, Lrh;

    .line 459
    .line 460
    const/4 v5, 0x0

    .line 461
    move/from16 v2, p1

    .line 462
    .line 463
    move-object/from16 v3, p2

    .line 464
    .line 465
    move/from16 v4, p4

    .line 466
    .line 467
    invoke-direct/range {v0 .. v5}, Lrh;-><init>(Ljava/lang/Object;ZLun0;II)V

    .line 468
    .line 469
    .line 470
    iput-object v0, v6, Lb62;->d:Lmn0;

    .line 471
    .line 472
    :cond_c
    return-void
.end method

.method public static final p0(Lh12;JLin0;Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lh12;->a()Landroid/view/MotionEvent;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getAction()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz p4, :cond_0

    .line 12
    .line 13
    const/4 p4, 0x3

    .line 14
    invoke-virtual {p0, p4}, Landroid/view/MotionEvent;->setAction(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const/16 p4, 0x20

    .line 18
    .line 19
    shr-long v1, p1, p4

    .line 20
    .line 21
    long-to-int p4, v1

    .line 22
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    neg-float v1, v1

    .line 27
    const-wide v2, 0xffffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    and-long/2addr p1, v2

    .line 33
    long-to-int p1, p1

    .line 34
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    neg-float p2, p2

    .line 39
    invoke-virtual {p0, v1, p2}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p3, p0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-virtual {p0, p2, p1}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->setAction(I)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    const-string p0, "The PointerEvent receiver cannot have a null MotionEvent."

    .line 61
    .line 62
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public static final q(ZLjava/util/Set;Lxm0;Lin0;Lpx;I)V
    .locals 20

    .line 1
    move/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v4, p3

    .line 4
    .line 5
    move-object/from16 v12, p4

    .line 6
    .line 7
    check-cast v12, Lgo0;

    .line 8
    .line 9
    const v0, 0x7ff6d962

    .line 10
    .line 11
    .line 12
    invoke-virtual {v12, v0}, Lgo0;->X(I)Lgo0;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v12, v1}, Lgo0;->g(Z)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x2

    .line 24
    :goto_0
    or-int v0, p5, v0

    .line 25
    .line 26
    move-object/from16 v2, p1

    .line 27
    .line 28
    invoke-virtual {v12, v2}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const/16 v5, 0x20

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    move v3, v5

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/16 v3, 0x10

    .line 39
    .line 40
    :goto_1
    or-int/2addr v0, v3

    .line 41
    invoke-virtual {v12, v4}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    const/16 v3, 0x800

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v3, 0x400

    .line 51
    .line 52
    :goto_2
    or-int/2addr v0, v3

    .line 53
    and-int/lit16 v3, v0, 0x493

    .line 54
    .line 55
    const/16 v6, 0x492

    .line 56
    .line 57
    const/4 v7, 0x0

    .line 58
    const/4 v8, 0x1

    .line 59
    if-eq v3, v6, :cond_3

    .line 60
    .line 61
    move v3, v8

    .line 62
    goto :goto_3

    .line 63
    :cond_3
    move v3, v7

    .line 64
    :goto_3
    and-int/lit8 v6, v0, 0x1

    .line 65
    .line 66
    invoke-virtual {v12, v6, v3}, Lgo0;->O(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_15

    .line 71
    .line 72
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    sget-object v6, Lnx;->a:Leb;

    .line 77
    .line 78
    if-ne v3, v6, :cond_4

    .line 79
    .line 80
    const-string v3, ""

    .line 81
    .line 82
    invoke-static {v3}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v12, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :cond_4
    move-object/from16 v16, v3

    .line 90
    .line 91
    check-cast v16, Lxk1;

    .line 92
    .line 93
    and-int/lit8 v0, v0, 0x70

    .line 94
    .line 95
    if-eq v0, v5, :cond_5

    .line 96
    .line 97
    move v0, v7

    .line 98
    goto :goto_4

    .line 99
    :cond_5
    move v0, v8

    .line 100
    :goto_4
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    if-nez v0, :cond_6

    .line 105
    .line 106
    if-ne v3, v6, :cond_7

    .line 107
    .line 108
    :cond_6
    invoke-static {v2}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-virtual {v12, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_7
    move-object v15, v3

    .line 116
    check-cast v15, Lxk1;

    .line 117
    .line 118
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-ne v0, v6, :cond_8

    .line 123
    .line 124
    new-instance v0, Lkx1;

    .line 125
    .line 126
    invoke-direct {v0, v7}, Lkx1;-><init>(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :cond_8
    move-object/from16 v18, v0

    .line 133
    .line 134
    check-cast v18, Lkx1;

    .line 135
    .line 136
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    if-ne v0, v6, :cond_9

    .line 141
    .line 142
    sget-object v0, Lv62;->a:Lv62;

    .line 143
    .line 144
    invoke-static {v0}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {v12, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    :cond_9
    check-cast v0, Lxk1;

    .line 152
    .line 153
    invoke-virtual/range {v18 .. v18}, Lkx1;->g()I

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    const/4 v9, 0x0

    .line 166
    if-ne v5, v6, :cond_a

    .line 167
    .line 168
    new-instance v5, Lxh;

    .line 169
    .line 170
    invoke-direct {v5, v0, v9, v7}, Lxh;-><init>(Lxk1;Lt00;I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v12, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    :cond_a
    check-cast v5, Lmn0;

    .line 177
    .line 178
    invoke-static {v12, v5, v3}, Leu;->f(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    check-cast v3, Lw62;

    .line 186
    .line 187
    instance-of v5, v3, Lu62;

    .line 188
    .line 189
    if-eqz v5, :cond_b

    .line 190
    .line 191
    check-cast v3, Lu62;

    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_b
    move-object v3, v9

    .line 195
    :goto_5
    if-eqz v3, :cond_c

    .line 196
    .line 197
    iget-object v9, v3, Lu62;->a:Ljava/util/List;

    .line 198
    .line 199
    :cond_c
    if-nez v9, :cond_d

    .line 200
    .line 201
    sget-object v9, Lbe0;->h:Lbe0;

    .line 202
    .line 203
    :cond_d
    invoke-interface/range {v16 .. v16}, Lgu2;->getValue()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    check-cast v3, Ljava/lang/String;

    .line 208
    .line 209
    invoke-static {v3}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    invoke-virtual {v12, v9}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    invoke-virtual {v12, v3}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    or-int/2addr v5, v10

    .line 226
    invoke-virtual {v12}, Lgo0;->L()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v10

    .line 230
    if-nez v5, :cond_e

    .line 231
    .line 232
    if-ne v10, v6, :cond_13

    .line 233
    .line 234
    :cond_e
    invoke-static {v3}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    if-eqz v5, :cond_f

    .line 239
    .line 240
    goto :goto_7

    .line 241
    :cond_f
    new-instance v5, Ljava/util/ArrayList;

    .line 242
    .line 243
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 244
    .line 245
    .line 246
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    :cond_10
    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 251
    .line 252
    .line 253
    move-result v9

    .line 254
    if-eqz v9, :cond_12

    .line 255
    .line 256
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v9

    .line 260
    move-object v10, v9

    .line 261
    check-cast v10, Ls62;

    .line 262
    .line 263
    iget-object v11, v10, Ls62;->b:Ljava/lang/String;

    .line 264
    .line 265
    invoke-static {v11, v3, v8}, Lpv2;->h0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 266
    .line 267
    .line 268
    move-result v11

    .line 269
    if-nez v11, :cond_11

    .line 270
    .line 271
    iget-object v10, v10, Ls62;->a:Ljava/lang/String;

    .line 272
    .line 273
    invoke-static {v10, v3, v8}, Lpv2;->h0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 274
    .line 275
    .line 276
    move-result v10

    .line 277
    if-eqz v10, :cond_10

    .line 278
    .line 279
    :cond_11
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    goto :goto_6

    .line 283
    :cond_12
    move-object v9, v5

    .line 284
    :goto_7
    invoke-virtual {v12, v9}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    move-object v10, v9

    .line 288
    :cond_13
    move-object v14, v10

    .line 289
    check-cast v14, Ljava/util/List;

    .line 290
    .line 291
    if-eqz v1, :cond_14

    .line 292
    .line 293
    const v3, 0x790b006c

    .line 294
    .line 295
    .line 296
    goto :goto_8

    .line 297
    :cond_14
    const v3, 0x790b006b

    .line 298
    .line 299
    .line 300
    :goto_8
    invoke-static {v3, v12}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v8

    .line 304
    new-instance v3, Lih;

    .line 305
    .line 306
    move-object/from16 v6, p2

    .line 307
    .line 308
    invoke-direct {v3, v6, v4, v15, v7}, Lih;-><init>(Lxm0;Lin0;Lxk1;I)V

    .line 309
    .line 310
    .line 311
    const v5, 0x4e7cd365

    .line 312
    .line 313
    .line 314
    invoke-static {v5, v3, v12}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 315
    .line 316
    .line 317
    move-result-object v10

    .line 318
    new-instance v13, Ljh;

    .line 319
    .line 320
    const/16 v19, 0x0

    .line 321
    .line 322
    move-object/from16 v17, v0

    .line 323
    .line 324
    invoke-direct/range {v13 .. v19}, Ljh;-><init>(Ljava/util/List;Lxk1;Lxk1;Lxk1;Lkx1;I)V

    .line 325
    .line 326
    .line 327
    const v0, -0x4a025d72

    .line 328
    .line 329
    .line 330
    invoke-static {v0, v13, v12}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 331
    .line 332
    .line 333
    move-result-object v11

    .line 334
    const v13, 0x1b0036

    .line 335
    .line 336
    .line 337
    const/16 v14, 0x14

    .line 338
    .line 339
    const/4 v5, 0x1

    .line 340
    const/4 v7, 0x0

    .line 341
    const/4 v9, 0x0

    .line 342
    invoke-static/range {v5 .. v14}, Lqp0;->d(ZLxm0;Luh1;Ljava/lang/String;Ln80;Lnn0;Lkw;Lpx;II)V

    .line 343
    .line 344
    .line 345
    goto :goto_9

    .line 346
    :cond_15
    invoke-virtual {v12}, Lgo0;->R()V

    .line 347
    .line 348
    .line 349
    :goto_9
    invoke-virtual {v12}, Lgo0;->r()Lb62;

    .line 350
    .line 351
    .line 352
    move-result-object v7

    .line 353
    if-eqz v7, :cond_16

    .line 354
    .line 355
    new-instance v0, Lkh;

    .line 356
    .line 357
    const/4 v6, 0x0

    .line 358
    move-object/from16 v3, p2

    .line 359
    .line 360
    move/from16 v5, p5

    .line 361
    .line 362
    invoke-direct/range {v0 .. v6}, Lkh;-><init>(ZLjava/util/Set;Lxm0;Lin0;II)V

    .line 363
    .line 364
    .line 365
    iput-object v0, v7, Lb62;->d:Lmn0;

    .line 366
    .line 367
    :cond_16
    return-void
.end method

.method public static final q0(J)J
    .locals 6

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p0, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    int-to-float v1, v1

    .line 7
    const-wide v2, 0xffffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    and-long/2addr p0, v2

    .line 13
    long-to-int p0, p0

    .line 14
    int-to-float p0, p0

    .line 15
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    int-to-long v4, p1

    .line 20
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    int-to-long p0, p0

    .line 25
    shl-long v0, v4, v0

    .line 26
    .line 27
    and-long/2addr p0, v2

    .line 28
    or-long/2addr p0, v0

    .line 29
    return-wide p0
.end method

.method public static final r(Lcom/dokar/quickjs/binding/JsObject;Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 7

    .line 1
    invoke-virtual {p0, p1}, Lcom/dokar/quickjs/binding/JsObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    instance-of v1, p0, Ljava/lang/Boolean;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    check-cast p0, Ljava/lang/Boolean;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move-object p0, v0

    .line 17
    :goto_0
    if-eqz p0, :cond_2

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_2
    const-string p0, " must be a boolean."

    .line 21
    .line 22
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const/4 v5, 0x0

    .line 27
    const/16 v6, 0x1c

    .line 28
    .line 29
    const-string v1, "INVALID_ARGUMENT"

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-static/range {v1 .. v6}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public static r0(JLb5;Ljava/io/File;Ljava/io/File;)V
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "v"

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    const-string v1, "sequence"

    .line 13
    .line 14
    invoke-virtual {v0, v1, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 15
    .line 16
    .line 17
    iget-object p0, p2, Lb5;->i:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lh80;

    .line 20
    .line 21
    iget-object p1, p0, Lh80;->a:Ljava/lang/String;

    .line 22
    .line 23
    const-string v1, "releaseId"

    .line 24
    .line 25
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    const-string p1, "generation"

    .line 29
    .line 30
    iget-wide v1, p0, Lh80;->b:J

    .line 31
    .line 32
    invoke-virtual {v0, p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 33
    .line 34
    .line 35
    const-string p1, "kid"

    .line 36
    .line 37
    iget-object v1, p0, Lh80;->f:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 40
    .line 41
    .line 42
    iget-object p1, p2, Lb5;->k:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Ljava/lang/String;

    .line 45
    .line 46
    const-string v1, "packageSha256"

    .line 47
    .line 48
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 49
    .line 50
    .line 51
    const-string p1, "packageLength"

    .line 52
    .line 53
    invoke-virtual {p4}, Ljava/io/File;->length()J

    .line 54
    .line 55
    .line 56
    move-result-wide v1

    .line 57
    invoke-virtual {v0, p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 58
    .line 59
    .line 60
    const-string p1, "packageFile"

    .line 61
    .line 62
    invoke-virtual {p4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p4

    .line 66
    invoke-virtual {v0, p1, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lh80;->i:Ljava/io/Serializable;

    .line 70
    .line 71
    check-cast p1, Ljava/lang/String;

    .line 72
    .line 73
    const-string p4, "engineSha256"

    .line 74
    .line 75
    invoke-virtual {v0, p4, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 76
    .line 77
    .line 78
    const-string p1, "engineSize"

    .line 79
    .line 80
    iget-wide v1, p0, Lh80;->g:J

    .line 81
    .line 82
    invoke-virtual {v0, p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 83
    .line 84
    .line 85
    iget-object p0, p2, Lb5;->j:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p0, Ljava/io/File;

    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    const-string p1, "engineFile"

    .line 94
    .line 95
    invoke-virtual {v0, p1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p3}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    new-instance p1, Ljava/io/File;

    .line 103
    .line 104
    const-string p2, "active.json"

    .line 105
    .line 106
    invoke-direct {p1, p3, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    sget-object p3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 118
    .line 119
    invoke-virtual {p2, p3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-static {p0, p1, p2}, Lup0;->h(Ljava/nio/file/Path;Ljava/nio/file/Path;[B)V

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public static s(ILjava/lang/String;Ljava/lang/String;)I
    .locals 4

    .line 1
    const-string v0, " "

    .line 2
    .line 3
    new-instance v1, Ljava/io/RandomAccessFile;

    .line 4
    .line 5
    const-string v2, "/sys/fs/selinux/access"

    .line 6
    .line 7
    const-string v3, "rw"

    .line 8
    .line 9
    invoke-direct {v1, v2, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    sget-object p1, Lwq;->a:Ljava/nio/charset/Charset;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->getFD()Ljava/io/FileDescriptor;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    array-length v2, p0

    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-static {p2, p0, v3, v2}, Landroid/system/Os;->write(Ljava/io/FileDescriptor;[BII)I

    .line 52
    .line 53
    .line 54
    const/16 p0, 0x40

    .line 55
    .line 56
    new-array p0, p0, [B

    .line 57
    .line 58
    invoke-virtual {v1, p0}, Ljava/io/RandomAccessFile;->read([B)I

    .line 59
    .line 60
    .line 61
    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    if-gtz p2, :cond_0

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    .line 65
    .line 66
    .line 67
    return v3

    .line 68
    :cond_0
    :try_start_1
    new-instance v2, Ljava/lang/String;

    .line 69
    .line 70
    invoke-direct {v2, p0, v3, p2, p1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v2}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    filled-new-array {v0}, [Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-static {p0, p1}, Lpv2;->D0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {p0}, Ldu;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    check-cast p0, Ljava/lang/String;

    .line 94
    .line 95
    if-nez p0, :cond_1

    .line 96
    .line 97
    const-string p0, "0"

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :catchall_0
    move-exception p0

    .line 101
    goto :goto_1

    .line 102
    :cond_1
    :goto_0
    const/16 p1, 0x10

    .line 103
    .line 104
    invoke-static {p0, p1}, Ljava/lang/Integer;->parseUnsignedInt(Ljava/lang/String;I)I

    .line 105
    .line 106
    .line 107
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    .line 109
    .line 110
    .line 111
    return p0

    .line 112
    :goto_1
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 113
    :catchall_1
    move-exception p1

    .line 114
    invoke-static {v1, p0}, Lpp0;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    throw p1
.end method

.method public static s0(Lyn;IJ)V
    .locals 2

    .line 1
    invoke-static {p2, p3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    rsub-int/lit8 v0, v0, 0x40

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    :cond_0
    add-int/lit8 v0, v0, 0x7

    .line 11
    .line 12
    shr-int/lit8 v0, v0, 0x3

    .line 13
    .line 14
    mul-int/lit8 v1, v0, 0x8

    .line 15
    .line 16
    rsub-int/lit8 v1, v1, 0x40

    .line 17
    .line 18
    shr-long/2addr p2, v1

    .line 19
    add-int/lit8 v1, v0, -0x1

    .line 20
    .line 21
    shl-int/lit8 v1, v1, 0x5

    .line 22
    .line 23
    or-int/2addr p1, v1

    .line 24
    invoke-virtual {p0, p1}, Lyn;->i(I)V

    .line 25
    .line 26
    .line 27
    :goto_0
    if-lez v0, :cond_1

    .line 28
    .line 29
    long-to-int p1, p2

    .line 30
    int-to-byte p1, p1

    .line 31
    invoke-virtual {p0, p1}, Lyn;->i(I)V

    .line 32
    .line 33
    .line 34
    const/16 p1, 0x8

    .line 35
    .line 36
    shr-long/2addr p2, p1

    .line 37
    add-int/lit8 v0, v0, -0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    return-void
.end method

.method public static t(Lsu;)Lsu;
    .locals 11

    .line 1
    sget-object v3, Lpp0;->e:Lqd3;

    .line 2
    .line 3
    iget-wide v0, p0, Lsu;->b:J

    .line 4
    .line 5
    const-wide v4, 0x300000000L

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v4, v5}, Ltp0;->s(JJ)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    move-object v0, p0

    .line 17
    check-cast v0, Lka2;

    .line 18
    .line 19
    iget-object v1, v0, Lka2;->d:Lqd3;

    .line 20
    .line 21
    invoke-static {v1, v3}, Ls11;->B(Lqd3;Lqd3;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v3}, Lqd3;->a()[F

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    sget-object v2, Lj5;->c:Lj5;

    .line 33
    .line 34
    iget-object v2, v2, Lj5;->b:[F

    .line 35
    .line 36
    invoke-virtual {v1}, Lqd3;->a()[F

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v2, v1, p0}, Ls11;->y([F[F[F)[F

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    iget-object v1, v0, Lka2;->i:[F

    .line 45
    .line 46
    invoke-static {p0, v1}, Ls11;->Q([F[F)[F

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    move-object p0, v0

    .line 51
    new-instance v0, Lka2;

    .line 52
    .line 53
    iget-object v1, p0, Lsu;->a:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v2, p0, Lka2;->h:[F

    .line 56
    .line 57
    iget-object v5, p0, Lka2;->k:Lsa0;

    .line 58
    .line 59
    iget-object v6, p0, Lka2;->n:Lsa0;

    .line 60
    .line 61
    iget v7, p0, Lka2;->e:F

    .line 62
    .line 63
    iget v8, p0, Lka2;->f:F

    .line 64
    .line 65
    iget-object v9, p0, Lka2;->g:Ll33;

    .line 66
    .line 67
    const/4 v10, -0x1

    .line 68
    invoke-direct/range {v0 .. v10}, Lka2;-><init>(Ljava/lang/String;[FLqd3;[FLsa0;Lsa0;FFLl33;I)V

    .line 69
    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_1
    :goto_0
    return-object p0
.end method

.method public static t0(Lyn;IJ)V
    .locals 2

    .line 1
    invoke-static {p2, p3}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    rsub-int/lit8 v0, v0, 0x40

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    :cond_0
    add-int/lit8 v0, v0, 0x7

    .line 11
    .line 12
    shr-int/lit8 v0, v0, 0x3

    .line 13
    .line 14
    add-int/lit8 v1, v0, -0x1

    .line 15
    .line 16
    shl-int/lit8 v1, v1, 0x5

    .line 17
    .line 18
    or-int/2addr p1, v1

    .line 19
    invoke-virtual {p0, p1}, Lyn;->i(I)V

    .line 20
    .line 21
    .line 22
    :goto_0
    if-lez v0, :cond_1

    .line 23
    .line 24
    long-to-int p1, p2

    .line 25
    int-to-byte p1, p1

    .line 26
    invoke-virtual {p0, p1}, Lyn;->i(I)V

    .line 27
    .line 28
    .line 29
    const/16 p1, 0x8

    .line 30
    .line 31
    shr-long/2addr p2, p1

    .line 32
    add-int/lit8 v0, v0, -0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-void
.end method

.method public static varargs u([Lw80;)Lw80;
    .locals 8

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    const/4 v3, 0x1

    .line 5
    if-ge v2, v0, :cond_1

    .line 6
    .line 7
    aget-object v4, p0, v2

    .line 8
    .line 9
    iget-boolean v4, v4, Lw80;->a:Z

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move v0, v3

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    move v0, v1

    .line 19
    :goto_1
    array-length v2, p0

    .line 20
    move v4, v1

    .line 21
    :goto_2
    if-ge v4, v2, :cond_3

    .line 22
    .line 23
    aget-object v5, p0, v4

    .line 24
    .line 25
    iget-boolean v5, v5, Lw80;->b:Z

    .line 26
    .line 27
    if-eqz v5, :cond_2

    .line 28
    .line 29
    goto :goto_3

    .line 30
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_3
    move v3, v1

    .line 34
    :goto_3
    new-instance v2, Lgs;

    .line 35
    .line 36
    const/16 v4, 0xb

    .line 37
    .line 38
    invoke-direct {v2, v4}, Lgs;-><init>(I)V

    .line 39
    .line 40
    .line 41
    const/16 v4, 0x1e

    .line 42
    .line 43
    const-string v5, "+"

    .line 44
    .line 45
    invoke-static {p0, v5, v2, v4}, Lmg;->p0([Ljava/lang/Object;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const/16 v4, 0x60

    .line 50
    .line 51
    invoke-static {v2, v4}, Lpv2;->H0(Ljava/lang/String;I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    array-length v4, p0

    .line 56
    :goto_4
    const/4 v5, 0x0

    .line 57
    if-ge v1, v4, :cond_5

    .line 58
    .line 59
    aget-object v6, p0, v1

    .line 60
    .line 61
    iget-object v7, v6, Lw80;->d:Ljava/lang/String;

    .line 62
    .line 63
    if-eqz v7, :cond_4

    .line 64
    .line 65
    invoke-static {v7}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-eqz v7, :cond_6

    .line 70
    .line 71
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_5
    move-object v6, v5

    .line 75
    :cond_6
    if-eqz v6, :cond_7

    .line 76
    .line 77
    iget-object v5, v6, Lw80;->d:Ljava/lang/String;

    .line 78
    .line 79
    :cond_7
    new-instance p0, Lw80;

    .line 80
    .line 81
    invoke-direct {p0, v0, v3, v2, v5}, Lw80;-><init>(ZZLjava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-object p0
.end method

.method public static final v(Lc61;)Lo62;
    .locals 6

    .line 1
    invoke-interface {p0}, Lc61;->j()Lc61;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-interface {v0, p0, v1}, Lc61;->J(Lc61;Z)Lo62;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance v0, Lo62;

    .line 14
    .line 15
    invoke-interface {p0}, Lc61;->L()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    const/16 v3, 0x20

    .line 20
    .line 21
    shr-long/2addr v1, v3

    .line 22
    long-to-int v1, v1

    .line 23
    int-to-float v1, v1

    .line 24
    invoke-interface {p0}, Lc61;->L()J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    const-wide v4, 0xffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr v2, v4

    .line 34
    long-to-int p0, v2

    .line 35
    int-to-float p0, p0

    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-direct {v0, v2, v2, v1, p0}, Lo62;-><init>(FFFF)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method

.method public static final w(Lc61;Z)Lo62;
    .locals 14

    .line 1
    invoke-static {p0}, Ls11;->J(Lc61;)Lc61;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lc61;->L()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    const/16 v3, 0x20

    .line 10
    .line 11
    shr-long/2addr v1, v3

    .line 12
    long-to-int v1, v1

    .line 13
    int-to-float v1, v1

    .line 14
    invoke-interface {v0}, Lc61;->L()J

    .line 15
    .line 16
    .line 17
    move-result-wide v4

    .line 18
    const-wide v6, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr v4, v6

    .line 24
    long-to-int v2, v4

    .line 25
    int-to-float v2, v2

    .line 26
    invoke-interface {v0, p0, p1}, Lc61;->J(Lc61;Z)Lo62;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iget v4, p0, Lo62;->a:F

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    cmpg-float v8, v4, v5

    .line 36
    .line 37
    if-gez v8, :cond_0

    .line 38
    .line 39
    move v4, v5

    .line 40
    :cond_0
    cmpl-float v8, v4, v1

    .line 41
    .line 42
    if-lez v8, :cond_1

    .line 43
    .line 44
    move v4, v1

    .line 45
    :cond_1
    iget v8, p0, Lo62;->b:F

    .line 46
    .line 47
    if-eqz p1, :cond_3

    .line 48
    .line 49
    cmpg-float v9, v8, v5

    .line 50
    .line 51
    if-gez v9, :cond_2

    .line 52
    .line 53
    move v8, v5

    .line 54
    :cond_2
    cmpl-float v9, v8, v2

    .line 55
    .line 56
    if-lez v9, :cond_3

    .line 57
    .line 58
    move v8, v2

    .line 59
    :cond_3
    iget v9, p0, Lo62;->c:F

    .line 60
    .line 61
    if-eqz p1, :cond_6

    .line 62
    .line 63
    cmpg-float v10, v9, v5

    .line 64
    .line 65
    if-gez v10, :cond_4

    .line 66
    .line 67
    move v9, v5

    .line 68
    :cond_4
    cmpl-float v10, v9, v1

    .line 69
    .line 70
    if-lez v10, :cond_5

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_5
    move v1, v9

    .line 74
    :goto_0
    move v9, v1

    .line 75
    :cond_6
    iget p0, p0, Lo62;->d:F

    .line 76
    .line 77
    if-eqz p1, :cond_9

    .line 78
    .line 79
    cmpg-float p1, p0, v5

    .line 80
    .line 81
    if-gez p1, :cond_7

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_7
    move v5, p0

    .line 85
    :goto_1
    cmpl-float p0, v5, v2

    .line 86
    .line 87
    if-lez p0, :cond_8

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_8
    move v2, v5

    .line 91
    :goto_2
    move p0, v2

    .line 92
    :cond_9
    cmpg-float p1, v4, v9

    .line 93
    .line 94
    if-nez p1, :cond_a

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_a
    cmpg-float p1, v8, p0

    .line 98
    .line 99
    if-nez p1, :cond_b

    .line 100
    .line 101
    :goto_3
    sget-object p0, Lo62;->e:Lo62;

    .line 102
    .line 103
    return-object p0

    .line 104
    :cond_b
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    int-to-long v1, p1

    .line 109
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    int-to-long v10, p1

    .line 114
    shl-long/2addr v1, v3

    .line 115
    and-long/2addr v10, v6

    .line 116
    or-long/2addr v1, v10

    .line 117
    invoke-interface {v0, v1, v2}, Lc61;->h(J)J

    .line 118
    .line 119
    .line 120
    move-result-wide v1

    .line 121
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    int-to-long v10, p1

    .line 126
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    int-to-long v12, p1

    .line 131
    shl-long/2addr v10, v3

    .line 132
    and-long/2addr v12, v6

    .line 133
    or-long/2addr v10, v12

    .line 134
    invoke-interface {v0, v10, v11}, Lc61;->h(J)J

    .line 135
    .line 136
    .line 137
    move-result-wide v10

    .line 138
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    int-to-long v8, p1

    .line 143
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    int-to-long v12, p1

    .line 148
    shl-long/2addr v8, v3

    .line 149
    and-long/2addr v12, v6

    .line 150
    or-long/2addr v8, v12

    .line 151
    invoke-interface {v0, v8, v9}, Lc61;->h(J)J

    .line 152
    .line 153
    .line 154
    move-result-wide v8

    .line 155
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    int-to-long v4, p1

    .line 160
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    int-to-long p0, p0

    .line 165
    shl-long/2addr v4, v3

    .line 166
    and-long/2addr p0, v6

    .line 167
    or-long/2addr p0, v4

    .line 168
    invoke-interface {v0, p0, p1}, Lc61;->h(J)J

    .line 169
    .line 170
    .line 171
    move-result-wide p0

    .line 172
    shr-long v4, v1, v3

    .line 173
    .line 174
    long-to-int v0, v4

    .line 175
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    shr-long v4, v10, v3

    .line 180
    .line 181
    long-to-int v4, v4

    .line 182
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    shr-long v12, p0, v3

    .line 187
    .line 188
    long-to-int v5, v12

    .line 189
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    shr-long v12, v8, v3

    .line 194
    .line 195
    long-to-int v3, v12

    .line 196
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    invoke-static {v5, v3}, Ljava/lang/Math;->min(FF)F

    .line 201
    .line 202
    .line 203
    move-result v12

    .line 204
    invoke-static {v4, v12}, Ljava/lang/Math;->min(FF)F

    .line 205
    .line 206
    .line 207
    move-result v12

    .line 208
    invoke-static {v0, v12}, Ljava/lang/Math;->min(FF)F

    .line 209
    .line 210
    .line 211
    move-result v12

    .line 212
    invoke-static {v5, v3}, Ljava/lang/Math;->max(FF)F

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    invoke-static {v4, v3}, Ljava/lang/Math;->max(FF)F

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    invoke-static {v0, v3}, Ljava/lang/Math;->max(FF)F

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    and-long/2addr v1, v6

    .line 225
    long-to-int v1, v1

    .line 226
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    and-long v2, v10, v6

    .line 231
    .line 232
    long-to-int v2, v2

    .line 233
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    and-long/2addr p0, v6

    .line 238
    long-to-int p0, p0

    .line 239
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 240
    .line 241
    .line 242
    move-result p0

    .line 243
    and-long v3, v8, v6

    .line 244
    .line 245
    long-to-int p1, v3

    .line 246
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 247
    .line 248
    .line 249
    move-result p1

    .line 250
    invoke-static {p0, p1}, Ljava/lang/Math;->min(FF)F

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    invoke-static {p0, p1}, Ljava/lang/Math;->max(FF)F

    .line 263
    .line 264
    .line 265
    move-result p0

    .line 266
    invoke-static {v2, p0}, Ljava/lang/Math;->max(FF)F

    .line 267
    .line 268
    .line 269
    move-result p0

    .line 270
    invoke-static {v1, p0}, Ljava/lang/Math;->max(FF)F

    .line 271
    .line 272
    .line 273
    move-result p0

    .line 274
    new-instance p1, Lo62;

    .line 275
    .line 276
    invoke-direct {p1, v12, v3, v0, p0}, Lo62;-><init>(FFFF)V

    .line 277
    .line 278
    .line 279
    return-object p1
.end method

.method public static x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lw80;
    .locals 8

    .line 1
    const-string v0, "selinuxfs"

    .line 2
    .line 3
    const-class v1, Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "/sys/fs/selinux/class/"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    :try_start_0
    invoke-static {}, Ls11;->i0()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    if-eqz v5, :cond_1

    .line 14
    .line 15
    const-string v6, "checkSELinuxAccess"

    .line 16
    .line 17
    filled-new-array {v1, v1, v1, v1}, [Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v5, v6, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v5, Lw80;

    .line 29
    .line 30
    filled-new-array {p0, p1, p2, p3}, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    invoke-virtual {v1, v4, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    check-cast v1, Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    const-string v6, "android.os.SELinux"

    .line 48
    .line 49
    invoke-direct {v5, v1, v3, v6, v4}, Lw80;-><init>(ZZLjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :catchall_0
    move-exception v1

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    :goto_0
    move-object v5, v4

    .line 56
    goto :goto_2

    .line 57
    :goto_1
    new-instance v5, Lx92;

    .line 58
    .line 59
    invoke-direct {v5, v1}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    :goto_2
    instance-of v1, v5, Lx92;

    .line 63
    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    move-object v5, v4

    .line 67
    :cond_2
    check-cast v5, Lw80;

    .line 68
    .line 69
    if-eqz v5, :cond_3

    .line 70
    .line 71
    return-object v5

    .line 72
    :cond_3
    const/4 v1, 0x0

    .line 73
    :try_start_1
    new-instance v5, Ljava/io/File;

    .line 74
    .line 75
    new-instance v6, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v7, "/index"

    .line 84
    .line 85
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v5}, Lwi0;->f0(Ljava/io/File;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-static {v5}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    new-instance v6, Ljava/io/File;

    .line 112
    .line 113
    new-instance v7, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string p2, "/perms/"

    .line 122
    .line 123
    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v7, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    invoke-direct {v6, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v6}, Lwi0;->f0(Ljava/io/File;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    invoke-static {p2}, Lpv2;->I0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result p2

    .line 152
    invoke-static {v5, p0, p1}, Ls11;->s(ILjava/lang/String;Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    new-instance p1, Lw80;

    .line 157
    .line 158
    sub-int/2addr p2, v3

    .line 159
    shl-int p2, v3, p2

    .line 160
    .line 161
    and-int/2addr p0, p2

    .line 162
    if-eqz p0, :cond_4

    .line 163
    .line 164
    move p0, v3

    .line 165
    goto :goto_3

    .line 166
    :cond_4
    move p0, v1

    .line 167
    :goto_3
    invoke-direct {p1, p0, v3, v0, v4}, Lw80;-><init>(ZZLjava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 168
    .line 169
    .line 170
    goto :goto_4

    .line 171
    :catchall_1
    move-exception p0

    .line 172
    new-instance p1, Lx92;

    .line 173
    .line 174
    invoke-direct {p1, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    :goto_4
    invoke-static {p1}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    if-nez p0, :cond_5

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_5
    new-instance p1, Lw80;

    .line 185
    .line 186
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-direct {p1, v1, v1, v0, p0}, Lw80;-><init>(ZZLjava/lang/String;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    :goto_5
    check-cast p1, Lw80;

    .line 198
    .line 199
    return-object p1
.end method

.method public static final y([F[F[F)[F
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-static/range {p0 .. p1}, Ls11;->R([F[F)[F

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Ls11;->R([F[F)[F

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    aget v3, v1, v2

    .line 13
    .line 14
    aget v4, p1, v2

    .line 15
    .line 16
    div-float/2addr v3, v4

    .line 17
    const/4 v4, 0x1

    .line 18
    aget v5, v1, v4

    .line 19
    .line 20
    aget v6, p1, v4

    .line 21
    .line 22
    div-float/2addr v5, v6

    .line 23
    const/4 v6, 0x2

    .line 24
    aget v1, v1, v6

    .line 25
    .line 26
    aget v7, p1, v6

    .line 27
    .line 28
    div-float/2addr v1, v7

    .line 29
    const/4 v7, 0x3

    .line 30
    new-array v8, v7, [F

    .line 31
    .line 32
    aput v3, v8, v2

    .line 33
    .line 34
    aput v5, v8, v4

    .line 35
    .line 36
    aput v1, v8, v6

    .line 37
    .line 38
    invoke-static {v0}, Ls11;->N([F)[F

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    aget v3, v8, v2

    .line 43
    .line 44
    aget v5, v0, v2

    .line 45
    .line 46
    mul-float/2addr v5, v3

    .line 47
    aget v9, v8, v4

    .line 48
    .line 49
    aget v10, v0, v4

    .line 50
    .line 51
    mul-float/2addr v10, v9

    .line 52
    aget v8, v8, v6

    .line 53
    .line 54
    aget v11, v0, v6

    .line 55
    .line 56
    mul-float/2addr v11, v8

    .line 57
    aget v12, v0, v7

    .line 58
    .line 59
    mul-float/2addr v12, v3

    .line 60
    const/4 v13, 0x4

    .line 61
    aget v14, v0, v13

    .line 62
    .line 63
    mul-float/2addr v14, v9

    .line 64
    const/4 v15, 0x5

    .line 65
    aget v16, v0, v15

    .line 66
    .line 67
    mul-float v16, v16, v8

    .line 68
    .line 69
    const/16 v17, 0x6

    .line 70
    .line 71
    aget v18, v0, v17

    .line 72
    .line 73
    mul-float v3, v3, v18

    .line 74
    .line 75
    const/16 v18, 0x7

    .line 76
    .line 77
    aget v19, v0, v18

    .line 78
    .line 79
    mul-float v9, v9, v19

    .line 80
    .line 81
    const/16 v19, 0x8

    .line 82
    .line 83
    aget v0, v0, v19

    .line 84
    .line 85
    mul-float/2addr v8, v0

    .line 86
    const/16 v0, 0x9

    .line 87
    .line 88
    new-array v0, v0, [F

    .line 89
    .line 90
    aput v5, v0, v2

    .line 91
    .line 92
    aput v10, v0, v4

    .line 93
    .line 94
    aput v11, v0, v6

    .line 95
    .line 96
    aput v12, v0, v7

    .line 97
    .line 98
    aput v14, v0, v13

    .line 99
    .line 100
    aput v16, v0, v15

    .line 101
    .line 102
    aput v3, v0, v17

    .line 103
    .line 104
    aput v9, v0, v18

    .line 105
    .line 106
    aput v8, v0, v19

    .line 107
    .line 108
    invoke-static {v1, v0}, Ls11;->Q([F[F)[F

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    return-object v0
.end method

.method public static final z(Le41;La31;Ljava/lang/String;Lw80;)V
    .locals 4

    .line 1
    new-instance v0, Le41;

    .line 2
    .line 3
    invoke-direct {v0}, Le41;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, p3, Lw80;->a:Z

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-string v3, "hit"

    .line 13
    .line 14
    invoke-virtual {v0, v3, v2}, Le41;->b(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 15
    .line 16
    .line 17
    iget-boolean v2, p3, Lw80;->b:Z

    .line 18
    .line 19
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const-string v3, "available"

    .line 24
    .line 25
    invoke-virtual {v0, v3, v2}, Le41;->b(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 26
    .line 27
    .line 28
    const-string v2, "method"

    .line 29
    .line 30
    iget-object v3, p3, Lw80;->c:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, v2, v3}, Le41;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object p3, p3, Lw80;->d:Ljava/lang/String;

    .line 36
    .line 37
    if-eqz p3, :cond_1

    .line 38
    .line 39
    invoke-static {p3}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const-string v2, "error"

    .line 47
    .line 48
    invoke-virtual {v0, v2, p3}, Le41;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    :goto_0
    iget-object p0, p0, Le41;->h:Lmb1;

    .line 52
    .line 53
    invoke-virtual {p0, p2, v0}, Lmb1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    iget-object p0, p1, La31;->h:Ljava/util/ArrayList;

    .line 59
    .line 60
    new-instance p1, Lj41;

    .line 61
    .line 62
    invoke-direct {p1, p2}, Lj41;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    :cond_2
    return-void
.end method


# virtual methods
.method public hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Ls11;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    invoke-virtual {p0}, Ls11;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x1a
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Ls11;->a:I

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
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Lbt;->c()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_data_0
    .packed-switch 0x1a
        :pswitch_0
    .end packed-switch
.end method

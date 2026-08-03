.class public final L۟/ac;
.super L۟/gb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L۟/ac$a;,
        L۟/ac$b;,
        L۟/ac$c;
    }
.end annotation


# static fields
.field public static final synthetic ۥۡۤ:I


# instance fields
.field public final ۥۡ۠:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "L\u06df/j3;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥۡۡ:L۟/kb;

.field public final ۥۡۢ:L۟/kb;

.field public ۥۣۡ:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "L\u06df/j3;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x6

    .line 8
    new-array v2, v1, [B

    .line 9
    .line 10
    fill-array-data v2, :array_1

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    const/16 v0, 0x8

    .line 17
    .line 18
    new-array v0, v0, [B

    .line 19
    .line 20
    fill-array-data v0, :array_2

    .line 21
    .line 22
    .line 23
    new-array v2, v1, [B

    .line 24
    .line 25
    fill-array-data v2, :array_3

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0, p2}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/16 v0, 0x12

    .line 36
    .line 37
    new-array v0, v0, [B

    .line 38
    .line 39
    fill-array-data v0, :array_4

    .line 40
    .line 41
    .line 42
    new-array v1, v1, [B

    .line 43
    .line 44
    fill-array-data v1, :array_5

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-direct {p0, p1, v0}, L۟/gb;-><init>(Landroid/content/Context;Ljava/lang/CharSequence;)V

    .line 52
    .line 53
    .line 54
    iput-object p2, p0, L۟/ac;->ۥۡ۠:Ljava/util/List;

    .line 55
    .line 56
    new-instance p1, L۟/ac$d;

    .line 57
    .line 58
    invoke-direct {p1, p0}, L۟/ac$d;-><init>(L۟/ac;)V

    .line 59
    .line 60
    .line 61
    new-instance p2, L۟/kb;

    .line 62
    .line 63
    invoke-direct {p2, p1}, L۟/kb;-><init>(L۟/f3;)V

    .line 64
    .line 65
    .line 66
    iput-object p2, p0, L۟/ac;->ۥۡۡ:L۟/kb;

    .line 67
    .line 68
    new-instance p1, L۟/ac$f;

    .line 69
    .line 70
    invoke-direct {p1, p0}, L۟/ac$f;-><init>(L۟/ac;)V

    .line 71
    .line 72
    .line 73
    new-instance p2, L۟/kb;

    .line 74
    .line 75
    invoke-direct {p2, p1}, L۟/kb;-><init>(L۟/f3;)V

    .line 76
    .line 77
    .line 78
    iput-object p2, p0, L۟/ac;->ۥۡۢ:L۟/kb;

    .line 79
    .line 80
    return-void

    .line 81
    :array_0
    .array-data 1
        0x7t
        -0x68t
        -0x3et
    .end array-data

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    :array_1
    .array-data 1
        0x64t
        -0x20t
        -0x4at
        0x27t
        -0x1dt
        0xat
    .end array-data

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    nop

    .line 95
    :array_2
    .array-data 1
        0x6t
        -0x26t
        0x30t
        -0x26t
        -0x30t
        -0x7t
        0x1et
        -0x2et
    .end array-data

    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    :array_3
    .array-data 1
        0x6at
        -0x4dt
        0x43t
        -0x52t
        -0x6ct
        -0x68t
    .end array-data

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    nop

    .line 111
    :array_4
    .array-data 1
        -0x25t
        -0x72t
        0xat
        -0x66t
        0x20t
        0x57t
        -0x2ct
        -0x4ct
        0x1dt
        -0x6bt
        0x3ft
        0x4et
        -0x2at
        -0x52t
        0x33t
        -0x6at
        0x38t
        0x4bt
    .end array-data

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    nop

    .line 125
    :array_5
    .array-data 1
        0x33t
        0x20t
        -0x4bt
        0x73t
        -0x49t
        -0x7t
    .end array-data
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, L۟/gb;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, L۟/ac;->ۥۡۢ:L۟/kb;

    .line 5
    .line 6
    invoke-virtual {p1}, L۟/kb;->ۥ()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 11
    .line 12
    invoke-virtual {p0}, L۟/ac;->ۥۣ۠()L۟/ac$b;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, L۟/gb;->ۥ۠()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, L۟/ac;->ۥۣ۠()L۟/ac$b;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, L۟/ac$b;->ۥ()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    xor-int/lit8 p1, p1, 0x1

    .line 35
    .line 36
    const/4 v0, 0x6

    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    invoke-static {p0}, L۟/gb;->ۥ۠ۢ(L۟/gb;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, L۟/gb;->ۥ۟ۧ()Landroid/widget/Button;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const/16 v1, 0xc

    .line 47
    .line 48
    new-array v1, v1, [B

    .line 49
    .line 50
    fill-array-data v1, :array_0

    .line 51
    .line 52
    .line 53
    new-array v0, v0, [B

    .line 54
    .line 55
    fill-array-data v0, :array_1

    .line 56
    .line 57
    .line 58
    invoke-static {v1, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 63
    .line 64
    .line 65
    new-instance v0, L۟/ac$e;

    .line 66
    .line 67
    invoke-direct {v0, p0, p1}, L۟/ac$e;-><init>(L۟/ac;Landroid/widget/Button;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v0}, L۟/gb;->ۥ۠۠(L۟/f3;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    sget p1, L۟/o;->ۥ:I

    .line 75
    .line 76
    const/16 p1, 0x1e

    .line 77
    .line 78
    new-array p1, p1, [B

    .line 79
    .line 80
    fill-array-data p1, :array_2

    .line 81
    .line 82
    .line 83
    new-array v0, v0, [B

    .line 84
    .line 85
    fill-array-data v0, :array_3

    .line 86
    .line 87
    .line 88
    invoke-static {p1, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {p1}, L۟/o;->ۥ۠(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :goto_0
    return-void

    .line 96
    nop

    .line 97
    :array_0
    .array-data 1
        -0x20t
        -0x4et
        0x2ct
        0x20t
        -0x3at
        0xct
        -0x1et
        -0x48t
        0x17t
        0x2et
        -0x2at
        0x3t
    .end array-data

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    :array_1
    .array-data 1
        0x5t
        0x16t
        -0x4at
        -0x37t
        0x46t
        -0x7bt
    .end array-data

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    nop

    .line 115
    :array_2
    .array-data 1
        0x56t
        0x36t
        0x1et
        -0x3dt
        0x58t
        -0x65t
        0x56t
        0x1ft
        0x3dt
        -0x32t
        0x63t
        -0x5dt
        0x55t
        0x24t
        0x34t
        -0x3dt
        0x4bt
        -0x67t
        0x58t
        0x4t
        0x2t
        -0x3dt
        0x79t
        -0x42t
        0x54t
        0x12t
        0x8t
        -0x3ft
        0x6dt
        -0x6ft
    .end array-data

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    nop

    .line 135
    :array_3
    .array-data 1
        -0x50t
        -0x56t
        -0x4et
        0x26t
        -0x3ct
        0x2bt
    .end array-data
.end method

.method public final ۥ۟ۦ()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    .line 4
    iget-object v1, p0, L۟/ac;->ۥۡۢ:L۟/kb;

    .line 5
    .line 6
    invoke-virtual {v1}, L۟/kb;->ۥ()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    aput-object v1, v0, v2

    .line 14
    .line 15
    invoke-static {v0}, L۟/jb;->ۥ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public final ۥۣ۠()L۟/ac$b;
    .locals 1

    iget-object v0, p0, L۟/ac;->ۥۡۡ:L۟/kb;

    invoke-virtual {v0}, L۟/kb;->ۥ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, L۟/ac$b;

    return-object v0
.end method

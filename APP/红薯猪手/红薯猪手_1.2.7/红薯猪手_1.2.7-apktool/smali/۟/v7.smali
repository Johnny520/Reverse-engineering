.class public final L۟/v7;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/f3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/f3<",
        "Landroid/widget/TextView;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:Landroid/content/Context;

.field public final synthetic ۥ۟:L۟/t7;


# direct methods
.method public constructor <init>(Landroid/app/Activity;L۟/t7;)V
    .locals 0

    iput-object p1, p0, L۟/v7;->ۥ:Landroid/content/Context;

    iput-object p2, p0, L۟/v7;->ۥ۟:L۟/t7;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    iget-object v1, p0, L۟/v7;->ۥ:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, L۟/v7;->ۥ۟:L۟/t7;

    .line 9
    .line 10
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 11
    .line 12
    const/4 v3, -0x1

    .line 13
    const/4 v4, -0x2

    .line 14
    invoke-direct {v2, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 19
    .line 20
    const/high16 v4, 0x42480000    # 50.0f

    .line 21
    .line 22
    invoke-static {v3, v4}, L۟/c4;->ۥۣ۟(IF)F

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    float-to-int v4, v4

    .line 27
    const/4 v5, 0x0

    .line 28
    invoke-virtual {v2, v5, v4, v5, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 32
    .line 33
    .line 34
    const/high16 v2, 0x41700000    # 15.0f

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 37
    .line 38
    .line 39
    const/16 v2, 0x9

    .line 40
    .line 41
    new-array v2, v2, [B

    .line 42
    .line 43
    fill-array-data v2, :array_0

    .line 44
    .line 45
    .line 46
    const/4 v4, 0x6

    .line 47
    new-array v4, v4, [B

    .line 48
    .line 49
    fill-array-data v4, :array_1

    .line 50
    .line 51
    .line 52
    invoke-static {v2, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 61
    .line 62
    .line 63
    const/16 v2, 0x11

    .line 64
    .line 65
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 66
    .line 67
    .line 68
    iget-object v2, v1, L۟/t7;->ۥ۠ۤ:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-le v2, v3, :cond_0

    .line 75
    .line 76
    iget v2, v1, L۟/t7;->ۥ۠ۥ:I

    .line 77
    .line 78
    add-int/2addr v2, v3

    .line 79
    iget-object v1, v1, L۟/t7;->ۥ۠ۤ:Ljava/util/List;

    .line 80
    .line 81
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    new-instance v3, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v2, "/"

    .line 94
    .line 95
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    .line 107
    .line 108
    :cond_0
    return-object v0

    .line 109
    :array_0
    .array-data 1
        0x42t
        0x74t
        -0x3ft
        -0x17t
        -0x5dt
        -0x74t
        0x24t
        0x77t
        -0x3et
    .end array-data

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    nop

    .line 119
    :array_1
    .array-data 1
        0x61t
        0x32t
        -0x79t
        -0x54t
        -0x1at
        -0x37t
    .end array-data
.end method

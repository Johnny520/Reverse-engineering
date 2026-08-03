.class public final L۟/b2;
.super L۟/gb;
.source "SourceFile"


# instance fields
.field public final ۥۡ۠:Ljava/lang/String;

.field public final ۥۡۡ:Ljava/lang/String;

.field public final ۥۡۢ:L۟/g3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u06df/g3<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public ۥۣۡ:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L۟/g3;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "L\u06df/g3<",
            "-",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v2, v1, [B

    fill-array-data v2, :array_1

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x5

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    new-array v2, v1, [B

    fill-array-data v2, :array_3

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const/16 v0, 0x9

    new-array v0, v0, [B

    fill-array-data v0, :array_4

    new-array v2, v1, [B

    fill-array-data v2, :array_5

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p3}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x4

    new-array v0, v0, [B

    fill-array-data v0, :array_6

    new-array v2, v1, [B

    fill-array-data v2, :array_7

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    const/16 v0, 0xa

    new-array v0, v0, [B

    fill-array-data v0, :array_8

    new-array v1, v1, [B

    fill-array-data v1, :array_9

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    invoke-direct {p0, p1, p2}, L۟/gb;-><init>(Landroid/content/Context;Ljava/lang/CharSequence;)V

    iput-object p3, p0, L۟/b2;->ۥۡ۠:Ljava/lang/String;

    iput-object p4, p0, L۟/b2;->ۥۡۡ:Ljava/lang/String;

    iput-object p5, p0, L۟/b2;->ۥۡۢ:L۟/g3;

    return-void

    nop

    :array_0
    .array-data 1
        0x58t
        -0x10t
        0x4t
    .end array-data

    :array_1
    .array-data 1
        0x3bt
        -0x78t
        0x70t
        -0x15t
        -0x67t
        0x18t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x51t
        -0x44t
        0x50t
        -0x23t
        -0x1at
    .end array-data

    nop

    :array_3
    .array-data 1
        -0x25t
        -0x2bt
        0x24t
        -0x4ft
        -0x7dt
        0x7ft
    .end array-data

    nop

    :array_4
    .array-data 1
        -0xet
        0x21t
        0x11t
        -0x7dt
        -0x52t
        0x6et
        -0x16t
        0x31t
        0xct
    .end array-data

    nop

    :array_5
    .array-data 1
        -0x7at
        0x44t
        0x69t
        -0x9t
        -0x8t
        0xft
    .end array-data

    nop

    :array_6
    .array-data 1
        0x2dt
        0x22t
        0x2et
        0x27t
    .end array-data

    :array_7
    .array-data 1
        0x45t
        0x4bt
        0x40t
        0x53t
        0x4ct
        0x35t
    .end array-data

    nop

    :array_8
    .array-data 1
        -0x2at
        0x79t
        0x40t
        0x6t
        -0x6ft
        -0x25t
        -0x2ft
        0x65t
        0x5dt
        0xdt
    .end array-data

    nop

    :array_9
    .array-data 1
        -0x5bt
        0xct
        0x32t
        0x63t
        -0x30t
        -0x48t
    .end array-data
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, L۟/gb;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_0

    const v0, 0x20008

    invoke-virtual {p1, v0}, Landroid/view/Window;->clearFlags(I)V

    :cond_0
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    :cond_1
    new-instance p1, L۟/b2$a;

    invoke-direct {p1, p0}, L۟/b2$a;-><init>(L۟/b2;)V

    invoke-virtual {p0, p1}, L۟/gb;->ۥ۠ۡ(L۟/f3;)V

    return-void
.end method

.method public final ۥ۟ۦ()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/widget/EditText;

    .line 2
    .line 3
    iget-object v1, p0, L۟/ya;->ۥ:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const/high16 v1, 0x41600000    # 14.0f

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 25
    .line 26
    .line 27
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 28
    .line 29
    const/4 v3, -0x1

    .line 30
    const/4 v4, -0x2

    .line 31
    invoke-direct {v2, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 32
    .line 33
    .line 34
    const/high16 v3, 0x3f800000    # 1.0f

    .line 35
    .line 36
    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, L۟/b2;->ۥۡ۠:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_0

    .line 51
    .line 52
    iget-object v1, p0, L۟/b2;->ۥۡ۠:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    iput-object v0, p0, L۟/b2;->ۥۣۡ:Landroid/widget/EditText;

    .line 58
    .line 59
    iget-object v1, p0, L۟/b2;->ۥۡۡ:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, L۟/b2;->ۥۣۡ:Landroid/widget/EditText;

    .line 65
    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    invoke-static {v0}, L۟/jb;->ۥ۟ۦ(Ljava/lang/Object;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    return-object v0

    .line 73
    :cond_1
    const/16 v0, 0x9

    .line 74
    .line 75
    new-array v0, v0, [B

    .line 76
    .line 77
    fill-array-data v0, :array_0

    .line 78
    .line 79
    .line 80
    const/4 v1, 0x6

    .line 81
    new-array v1, v1, [B

    .line 82
    .line 83
    fill-array-data v1, :array_1

    .line 84
    .line 85
    .line 86
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v0}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const/4 v0, 0x0

    .line 94
    throw v0

    .line 95
    :array_0
    .array-data 1
        -0x6t
        -0x78t
        -0x21t
        0x60t
        0xat
        0x1t
        -0xet
        -0x4bt
        -0x31t
    .end array-data

    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    nop

    .line 105
    :array_1
    .array-data 1
        -0x69t
        -0x33t
        -0x45t
        0x9t
        0x7et
        0x55t
    .end array-data
.end method

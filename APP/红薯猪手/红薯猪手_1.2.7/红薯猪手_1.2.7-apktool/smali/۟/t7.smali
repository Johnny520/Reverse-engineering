.class public final L۟/t7;
.super L۟/ya;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "SetTextI18n"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L۟/t7$a;
    }
.end annotation


# static fields
.field public static final synthetic ۥۡ:I


# instance fields
.field public final ۥ۠ۤ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "L\u06df/i3;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۠ۥ:I

.field public final ۥ۠ۦ:L۟/kb;

.field public final ۥ۠ۧ:L۟/kb;

.field public final ۥ۠ۨ:L۟/kb;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/List;I)V
    .locals 3

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
    const/4 v0, 0x7

    .line 17
    new-array v0, v0, [B

    .line 18
    .line 19
    fill-array-data v0, :array_2

    .line 20
    .line 21
    .line 22
    new-array v1, v1, [B

    .line 23
    .line 24
    fill-array-data v1, :array_3

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-direct {p0, p1, v0}, L۟/ya;-><init>(Landroid/content/Context;I)V

    .line 32
    .line 33
    .line 34
    iput-object p2, p0, L۟/t7;->ۥ۠ۤ:Ljava/util/List;

    .line 35
    .line 36
    iput p3, p0, L۟/t7;->ۥ۠ۥ:I

    .line 37
    .line 38
    new-instance p2, L۟/v7;

    .line 39
    .line 40
    invoke-direct {p2, p1, p0}, L۟/v7;-><init>(Landroid/app/Activity;L۟/t7;)V

    .line 41
    .line 42
    .line 43
    new-instance p3, L۟/kb;

    .line 44
    .line 45
    invoke-direct {p3, p2}, L۟/kb;-><init>(L۟/f3;)V

    .line 46
    .line 47
    .line 48
    iput-object p3, p0, L۟/t7;->ۥ۠ۦ:L۟/kb;

    .line 49
    .line 50
    new-instance p2, L۟/u7;

    .line 51
    .line 52
    invoke-direct {p2, p0}, L۟/u7;-><init>(L۟/t7;)V

    .line 53
    .line 54
    .line 55
    new-instance p3, L۟/kb;

    .line 56
    .line 57
    invoke-direct {p3, p2}, L۟/kb;-><init>(L۟/f3;)V

    .line 58
    .line 59
    .line 60
    iput-object p3, p0, L۟/t7;->ۥ۠ۧ:L۟/kb;

    .line 61
    .line 62
    new-instance p2, L۟/x7;

    .line 63
    .line 64
    invoke-direct {p2, p1, p0}, L۟/x7;-><init>(Landroid/app/Activity;L۟/t7;)V

    .line 65
    .line 66
    .line 67
    new-instance p1, L۟/kb;

    .line 68
    .line 69
    invoke-direct {p1, p2}, L۟/kb;-><init>(L۟/f3;)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, L۟/t7;->ۥ۠ۨ:L۟/kb;

    .line 73
    .line 74
    return-void

    .line 75
    :array_0
    .array-data 1
        -0x50t
        -0x2at
        0x55t
    .end array-data

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    :array_1
    .array-data 1
        -0x2dt
        -0x52t
        0x21t
        0xat
        -0x67t
        -0x38t
    .end array-data

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    nop

    .line 89
    :array_2
    .array-data 1
        0x77t
        -0x66t
        -0x73t
        0x57t
        0x27t
        0x66t
        0x76t
    .end array-data

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    :array_3
    .array-data 1
        0x2t
        -0x18t
        -0x1ft
        0x1bt
        0x4et
        0x15t
    .end array-data
.end method


# virtual methods
.method public final ۥۣ۟()Landroid/view/View;
    .locals 2

    .line 1
    new-instance v0, Landroid/widget/FrameLayout;

    .line 2
    .line 3
    iget-object v1, p0, L۟/ya;->ۥ:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, L۟/t7;->ۥ۠ۦ:L۟/kb;

    .line 9
    .line 10
    invoke-virtual {v1}, L۟/kb;->ۥ()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Landroid/widget/TextView;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, L۟/t7;->ۥ۠ۨ:L۟/kb;

    .line 20
    .line 21
    invoke-virtual {v1}, L۟/kb;->ۥ()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, L۟/a3;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

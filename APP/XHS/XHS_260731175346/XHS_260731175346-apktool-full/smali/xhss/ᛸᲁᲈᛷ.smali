.class public final Lxhss/ᛸᲁᲈᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Landroid/widget/TextView;

.field public final ᛳᲁᲇᛸ:Landroid/widget/TextView;

.field public final ᛷᛴᛷᛱ:Landroid/widget/TextView;

.field public final ᛷᛵᛵᲈ:Landroid/widget/LinearLayout;

.field public final ᲇᛴᲇᛵ:Landroid/widget/TextView;

.field public final ᲇᛶᛴᲀ:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛸᲁᲈᛷ;->ᛷᛵᛵᲈ:Landroid/widget/LinearLayout;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᛸᲁᲈᛷ;->ᛱᛱᛲᲇ:Landroid/widget/TextView;

    .line 7
    .line 8
    iput-object p3, p0, Lxhss/ᛸᲁᲈᛷ;->ᛳᲁᲇᛸ:Landroid/widget/TextView;

    .line 9
    .line 10
    iput-object p4, p0, Lxhss/ᛸᲁᲈᛷ;->ᲇᛴᲇᛵ:Landroid/widget/TextView;

    .line 11
    .line 12
    iput-object p5, p0, Lxhss/ᛸᲁᲈᛷ;->ᛷᛴᛷᛱ:Landroid/widget/TextView;

    .line 13
    .line 14
    iput-object p6, p0, Lxhss/ᛸᲁᲈᛷ;->ᲇᛶᛴᲀ:Landroid/widget/TextView;

    .line 15
    .line 16
    return-void
.end method

.method public static ᛷᛵᛵᲈ(Landroid/view/LayoutInflater;Landroid/widget/LinearLayout;)Lxhss/ᛸᲁᲈᛷ;
    .locals 8

    .line 1
    const v0, 0x640b002e

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const p1, 0x64080063

    .line 10
    .line 11
    .line 12
    invoke-static {p0, p1}, Lxhss/ᛸᛶᛳᛷ;->ᲇᛶᛴᲀ(Landroid/view/View;I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object v3, v0

    .line 17
    check-cast v3, Landroid/widget/TextView;

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    const p1, 0x6408006b

    .line 22
    .line 23
    .line 24
    invoke-static {p0, p1}, Lxhss/ᛸᛶᛳᛷ;->ᲇᛶᛴᲀ(Landroid/view/View;I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    move-object v4, v0

    .line 29
    check-cast v4, Landroid/widget/TextView;

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    const p1, 0x6408009a

    .line 34
    .line 35
    .line 36
    invoke-static {p0, p1}, Lxhss/ᛸᛶᛳᛷ;->ᲇᛶᛴᲀ(Landroid/view/View;I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    move-object v5, v0

    .line 41
    check-cast v5, Landroid/widget/TextView;

    .line 42
    .line 43
    if-eqz v5, :cond_0

    .line 44
    .line 45
    const p1, 0x640800c6

    .line 46
    .line 47
    .line 48
    invoke-static {p0, p1}, Lxhss/ᛸᛶᛳᛷ;->ᲇᛶᛴᲀ(Landroid/view/View;I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    move-object v6, v0

    .line 53
    check-cast v6, Landroid/widget/TextView;

    .line 54
    .line 55
    if-eqz v6, :cond_0

    .line 56
    .line 57
    const p1, 0x640800cb

    .line 58
    .line 59
    .line 60
    invoke-static {p0, p1}, Lxhss/ᛸᛶᛳᛷ;->ᲇᛶᛴᲀ(Landroid/view/View;I)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    move-object v7, v0

    .line 65
    check-cast v7, Landroid/widget/TextView;

    .line 66
    .line 67
    if-eqz v7, :cond_0

    .line 68
    .line 69
    new-instance v1, Lxhss/ᛸᲁᲈᛷ;

    .line 70
    .line 71
    move-object v2, p0

    .line 72
    check-cast v2, Landroid/widget/LinearLayout;

    .line 73
    .line 74
    invoke-direct/range {v1 .. v7}, Lxhss/ᛸᲁᲈᛷ;-><init>(Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 75
    .line 76
    .line 77
    return-object v1

    .line 78
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    const-wide v0, -0x1435e1b858845L

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛸᛲᛷᛱ(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const/4 p0, 0x0

    .line 103
    return-object p0
.end method

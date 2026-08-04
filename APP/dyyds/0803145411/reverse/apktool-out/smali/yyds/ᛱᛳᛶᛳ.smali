.class public final Lyyds/ᛱᛳᛶᛳ;
.super Landroid/widget/ArrayAdapter;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lyyds/ᛱᛳᛶᛳ;->ᲀᛲᛳᲀ:Landroid/content/Context;

    .line 2
    .line 3
    const v0, 0x1090008

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, v0, p2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 1
    const-wide v0, -0x7920e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1, p2, p3}, Landroid/widget/ArrayAdapter;->getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    instance-of p2, p1, Landroid/widget/TextView;

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    move-object p2, p1

    .line 18
    check-cast p2, Landroid/widget/TextView;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p2, 0x0

    .line 22
    :goto_0
    if-eqz p2, :cond_1

    .line 23
    .line 24
    const p3, 0x660600f4

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lyyds/ᛱᛳᛶᛳ;->ᲀᛲᛳᲀ:Landroid/content/Context;

    .line 28
    .line 29
    invoke-virtual {p0, p3}, Landroid/content/Context;->getColor(I)I

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 34
    .line 35
    .line 36
    const p3, 0x660600c2

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p3}, Landroid/content/Context;->getColor(I)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    invoke-virtual {p2, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 44
    .line 45
    .line 46
    const/16 p0, 0x18

    .line 47
    .line 48
    const/16 p3, 0x12

    .line 49
    .line 50
    invoke-virtual {p2, p0, p3, p0, p3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 51
    .line 52
    .line 53
    :cond_1
    const-wide p2, -0x7927e68a836eL

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    invoke-static {p2, p3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    return-object p1
.end method

.class public final Lvb1;
.super Landroid/widget/ArrayAdapter;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic ε:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/List;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lvb1;->ε:Landroid/app/Activity;

    .line 2
    .line 3
    const v0, 0x1090009

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
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2, p3}, Landroid/widget/ArrayAdapter;->getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    instance-of p2, p1, Landroid/widget/TextView;

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    move-object p2, p1

    .line 13
    check-cast p2, Landroid/widget/TextView;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p2, 0x0

    .line 17
    :goto_0
    if-eqz p2, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, Lvb1;->ε:Landroid/app/Activity;

    .line 20
    .line 21
    invoke-static {p2, p0}, Lxn0;->η(Landroid/widget/TextView;Landroid/app/Activity;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    return-object p1
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2, p3}, Landroid/widget/ArrayAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    instance-of p2, p1, Landroid/widget/TextView;

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    move-object p2, p1

    .line 16
    check-cast p2, Landroid/widget/TextView;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p2, 0x0

    .line 20
    :goto_0
    if-eqz p2, :cond_1

    .line 21
    .line 22
    iget-object p0, p0, Lvb1;->ε:Landroid/app/Activity;

    .line 23
    .line 24
    invoke-static {p2, p0}, Lxn0;->η(Landroid/widget/TextView;Landroid/app/Activity;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-object p1
.end method

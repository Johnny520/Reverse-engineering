.class public final Lf91;
.super Landroid/database/DataSetObserver;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lv92;


# instance fields
.field public final synthetic α:Landroidx/viewpager/widget/PagerTitleStrip;


# direct methods
.method public constructor <init>(Landroidx/viewpager/widget/PagerTitleStrip;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf91;->α:Landroidx/viewpager/widget/PagerTitleStrip;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 3

    .line 1
    iget-object p0, p0, Lf91;->α:Landroidx/viewpager/widget/PagerTitleStrip;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->ε:Landroidx/viewpager/widget/ViewPager;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->ε:Landroidx/viewpager/widget/ViewPager;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Ld91;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroidx/viewpager/widget/PagerTitleStrip;->β(I)V

    .line 15
    .line 16
    .line 17
    iget v0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->κ:F

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    cmpl-float v2, v0, v1

    .line 21
    .line 22
    if-ltz v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v0, v1

    .line 26
    :goto_0
    iget-object v1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->ε:Landroidx/viewpager/widget/ViewPager;

    .line 27
    .line 28
    invoke-virtual {v1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-virtual {p0, v1, v0, v2}, Landroidx/viewpager/widget/PagerTitleStrip;->γ(IFZ)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

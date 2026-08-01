.class public final Le91;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroidx/viewpager/widget/PagerTabStrip;


# direct methods
.method public synthetic constructor <init>(Landroidx/viewpager/widget/PagerTabStrip;I)V
    .locals 0

    .line 1
    iput p2, p0, Le91;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Le91;->ζ:Landroidx/viewpager/widget/PagerTabStrip;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget p1, p0, Le91;->ε:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Le91;->ζ:Landroidx/viewpager/widget/PagerTabStrip;

    .line 7
    .line 8
    iget-object p0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->ε:Landroidx/viewpager/widget/ViewPager;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    add-int/lit8 p1, p1, 0x1

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object p0, p0, Le91;->ζ:Landroidx/viewpager/widget/PagerTabStrip;

    .line 21
    .line 22
    iget-object p0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->ε:Landroidx/viewpager/widget/ViewPager;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    add-int/lit8 p1, p1, -0x1

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

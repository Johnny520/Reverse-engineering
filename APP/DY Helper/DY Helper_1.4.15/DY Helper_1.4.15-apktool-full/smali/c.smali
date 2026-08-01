.class public final Lc;
.super Landroid/database/DataSetObserver;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Landroidx/appcompat/widget/ActivityChooserView;


# direct methods
.method public synthetic constructor <init>(Landroidx/appcompat/widget/ActivityChooserView;I)V
    .locals 0

    .line 1
    iput p2, p0, Lc;->α:I

    .line 2
    .line 3
    iput-object p1, p0, Lc;->β:Landroidx/appcompat/widget/ActivityChooserView;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 1

    .line 1
    iget v0, p0, Lc;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/database/DataSetObserver;->onChanged()V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lc;->β:Landroidx/appcompat/widget/ActivityChooserView;

    .line 10
    .line 11
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ε:Lf;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0

    .line 18
    :pswitch_0
    invoke-super {p0}, Landroid/database/DataSetObserver;->onChanged()V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lc;->β:Landroidx/appcompat/widget/ActivityChooserView;

    .line 22
    .line 23
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ε:Lf;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onInvalidated()V
    .locals 1

    .line 1
    iget v0, p0, Lc;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/database/DataSetObserver;->onInvalidated()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-super {p0}, Landroid/database/DataSetObserver;->onInvalidated()V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lc;->β:Landroidx/appcompat/widget/ActivityChooserView;

    .line 14
    .line 15
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ε:Lf;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

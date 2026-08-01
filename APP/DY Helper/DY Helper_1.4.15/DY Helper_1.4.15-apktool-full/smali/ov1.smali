.class public final synthetic Lov1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Lsv1;

.field public final synthetic γ:Ln71;


# direct methods
.method public synthetic constructor <init>(Lsv1;Ln71;I)V
    .locals 0

    .line 1
    iput p3, p0, Lov1;->α:I

    .line 2
    .line 3
    iput-object p1, p0, Lov1;->β:Lsv1;

    .line 4
    .line 5
    iput-object p2, p0, Lov1;->γ:Ln71;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .line 1
    iget v0, p0, Lov1;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lov1;->γ:Ln71;

    .line 10
    .line 11
    iget-object p1, p1, Ln71;->α:Ljava/lang/String;

    .line 12
    .line 13
    iget-object p0, p0, Lov1;->β:Lsv1;

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, Lsv1;->γ(Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lov1;->γ:Ln71;

    .line 23
    .line 24
    iget-object p1, p1, Ln71;->α:Ljava/lang/String;

    .line 25
    .line 26
    iget-object p0, p0, Lov1;->β:Lsv1;

    .line 27
    .line 28
    invoke-virtual {p0, p1, p2}, Lsv1;->γ(Ljava/lang/String;Z)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

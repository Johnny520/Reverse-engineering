.class public final synthetic Lk22;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/widget/LinearLayout;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/LinearLayout;I)V
    .locals 0

    .line 1
    iput p2, p0, Lk22;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lk22;->ζ:Landroid/widget/LinearLayout;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Lk22;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lk22;->ζ:Landroid/widget/LinearLayout;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, Lo22;->ν:Ljava/util/Set;

    .line 9
    .line 10
    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    sget-object v0, Lo22;->α:Lo22;

    .line 14
    .line 15
    invoke-static {p0}, Lo22;->γ(Landroid/widget/LinearLayout;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    sget-object v0, Lo22;->α:Lo22;

    .line 20
    .line 21
    invoke-static {p0}, Lo22;->γ(Landroid/widget/LinearLayout;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

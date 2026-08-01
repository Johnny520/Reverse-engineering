.class public final synthetic Ldg;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/view/View;

.field public final synthetic η:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILandroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 12
    iput p1, p0, Ldg;->ε:I

    iput-object p2, p0, Ldg;->ζ:Landroid/view/View;

    iput-object p3, p0, Ldg;->η:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/View;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ldg;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Ldg;->η:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p1, p0, Ldg;->ζ:Landroid/view/View;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Ldg;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Ldg;->η:Ljava/lang/String;

    .line 5
    .line 6
    iget-object p0, p0, Ldg;->ζ:Landroid/view/View;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    const-string v0, "entry-guard"

    .line 12
    .line 13
    sget-object v1, Lo22;->α:Lo22;

    .line 14
    .line 15
    invoke-virtual {v1, p0, v2, v0}, Lo22;->η(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    sget-object v0, Lq10;->α:Lq10;

    .line 20
    .line 21
    new-instance v0, Lsm1;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v2, p0, p0, v1}, Lq10;->γ(Lsm1;Ljava/lang/String;Landroid/view/View;Landroid/view/View;I)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    sget-object v0, Lq10;->α:Lq10;

    .line 31
    .line 32
    new-instance v0, Lsm1;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v2, p0, p0, v1}, Lq10;->γ(Lsm1;Ljava/lang/String;Landroid/view/View;Landroid/view/View;I)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_2
    sget-object v0, Lug;->α:Ltg;

    .line 42
    .line 43
    invoke-virtual {v0, p0, v2}, Ltg;->Τ(Landroid/view/View;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_3
    sget-object v0, Lug;->α:Ltg;

    .line 48
    .line 49
    invoke-virtual {v0, p0, v2}, Ltg;->υ(Landroid/view/View;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

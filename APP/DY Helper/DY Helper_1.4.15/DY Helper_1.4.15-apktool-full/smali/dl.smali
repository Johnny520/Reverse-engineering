.class public final synthetic Ldl;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lfl;


# direct methods
.method public synthetic constructor <init>(Lfl;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldl;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Ldl;->ζ:Lfl;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Ldl;->ε:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    iget-object p0, p0, Ldl;->ζ:Lfl;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    sget-object v2, Lll;->α:Lll;

    .line 12
    .line 13
    invoke-virtual {v2, p0, v0}, Lll;->γ(Lfl;Z)V

    .line 14
    .line 15
    .line 16
    return-object v1

    .line 17
    :pswitch_0
    sget-object v0, Lll;->ε:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    iget-object p0, p0, Lfl;->α:Landroid/view/View;

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lkl;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    sget-object v2, Lll;->α:Lll;

    .line 30
    .line 31
    invoke-static {p0, v0}, Lll;->ν(Landroid/view/View;Lkl;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-object v1

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

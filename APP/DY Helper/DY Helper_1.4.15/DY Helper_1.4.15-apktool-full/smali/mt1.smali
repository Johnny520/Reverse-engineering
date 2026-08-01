.class public final synthetic Lmt1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;I)V
    .locals 0

    .line 1
    iput p2, p0, Lmt1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lmt1;->ζ:Landroid/view/View;

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
    iget v0, p0, Lmt1;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lmt1;->ζ:Landroid/view/View;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, Lo22;->α:Lo22;

    .line 9
    .line 10
    invoke-static {p0}, Lo22;->Ι(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    sget-object v0, Lo22;->α:Lo22;

    .line 15
    .line 16
    sget-object v0, Lo22;->ι:Ljava/util/Set;

    .line 17
    .line 18
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {p0}, Lo22;->δ(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    return-void

    .line 29
    :pswitch_1
    sget-object v0, Lo22;->α:Lo22;

    .line 30
    .line 31
    invoke-static {p0}, Lo22;->Ι(Landroid/view/View;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_2
    const/16 v0, 0x8

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    const/high16 v0, 0x3f800000    # 1.0f

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

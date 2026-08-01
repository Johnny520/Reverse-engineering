.class public final synthetic Lpv1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Z

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 1
    iput p1, p0, Lpv1;->ε:I

    .line 2
    .line 3
    iput-boolean p4, p0, Lpv1;->ζ:Z

    .line 4
    .line 5
    iput-object p2, p0, Lpv1;->η:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lpv1;->θ:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget p1, p0, Lpv1;->ε:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lpv1;->η:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lgz1;

    .line 9
    .line 10
    iget-object v0, p0, Lpv1;->θ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lcu1;

    .line 13
    .line 14
    sget-object v1, Ljz1;->α:Ljava/util/LinkedHashSet;

    .line 15
    .line 16
    iget-object p1, p1, Lgz1;->α:Ljava/lang/String;

    .line 17
    .line 18
    iget-boolean p0, p0, Lpv1;->ζ:Z

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-virtual {v0}, Lcu1;->invoke()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_0
    iget-object p1, p0, Lpv1;->η:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Lsv1;

    .line 36
    .line 37
    iget-object v0, p0, Lpv1;->θ:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Ln71;

    .line 40
    .line 41
    iget-boolean p0, p0, Lpv1;->ζ:Z

    .line 42
    .line 43
    if-eqz p0, :cond_1

    .line 44
    .line 45
    iget-object p0, p1, Lsv1;->ε:Landroid/content/Context;

    .line 46
    .line 47
    iget-object p1, v0, Ln71;->β:Ljava/lang/String;

    .line 48
    .line 49
    const-string v0, "\u9700\u8981\u5185\u6d4b\u8d44\u683c"

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const/4 v0, 0x0

    .line 56
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    iget-object p0, v0, Ln71;->α:Ljava/lang/String;

    .line 65
    .line 66
    iget-object v0, p1, Lsv1;->ι:Ljava/util/LinkedHashSet;

    .line 67
    .line 68
    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    xor-int/lit8 v0, v0, 0x1

    .line 73
    .line 74
    invoke-virtual {p1, p0, v0}, Lsv1;->γ(Ljava/lang/String;Z)V

    .line 75
    .line 76
    .line 77
    :goto_1
    return-void

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

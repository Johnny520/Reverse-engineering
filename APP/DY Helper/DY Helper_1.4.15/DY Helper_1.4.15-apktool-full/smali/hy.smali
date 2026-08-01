.class public final Lhy;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final ζ:I

.field public final η:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/widget/ScrollView;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lhy;->ε:I

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lhy;->η:Ljava/lang/Object;

    iput p2, p0, Lhy;->ζ:I

    return-void
.end method

.method public constructor <init>(Ljava/util/List;ILjava/lang/Throwable;)V
    .locals 0

    .line 1
    const/4 p3, 0x0

    .line 2
    iput p3, p0, Lhy;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const-string p3, "initCallbacks cannot be null"

    .line 8
    .line 9
    invoke-static {p1, p3}, Lp91;->δ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance p3, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    iput-object p3, p0, Lhy;->η:Ljava/lang/Object;

    .line 18
    .line 19
    iput p2, p0, Lhy;->ζ:I

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lhy;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lhy;->η:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/widget/ScrollView;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iget v2, p0, Lhy;->ζ:I

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Landroid/widget/ScrollView;->smoothScrollBy(II)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Ljz1;->β:Landroid/os/Handler;

    .line 17
    .line 18
    const-wide/16 v1, 0x20

    .line 19
    .line 20
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    iget-object v0, p0, Lhy;->η:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iget p0, p0, Lhy;->ζ:I

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    const/4 v3, 0x0

    .line 36
    if-eq p0, v2, :cond_0

    .line 37
    .line 38
    :goto_0
    if-ge v3, v1, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Lgy;

    .line 45
    .line 46
    invoke-virtual {p0}, Lgy;->α()V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    :goto_1
    if-ge v3, v1, :cond_1

    .line 53
    .line 54
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Lgy;

    .line 59
    .line 60
    invoke-virtual {p0}, Lgy;->β()V

    .line 61
    .line 62
    .line 63
    add-int/lit8 v3, v3, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    return-void

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

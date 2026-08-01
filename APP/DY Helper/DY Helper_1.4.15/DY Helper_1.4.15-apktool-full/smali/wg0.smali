.class public final synthetic Lwg0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic α:Landroid/view/View;

.field public final synthetic β:Ljava/lang/String;

.field public final synthetic γ:Ljava/lang/Object;

.field public final synthetic δ:Ljava/lang/String;

.field public final synthetic ε:Z

.field public final synthetic ζ:Z


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwg0;->α:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, Lwg0;->β:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lwg0;->γ:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Lwg0;->δ:Ljava/lang/String;

    .line 11
    .line 12
    iput-boolean p5, p0, Lwg0;->ε:Z

    .line 13
    .line 14
    iput-boolean p6, p0, Lwg0;->ζ:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    if-ne p2, p6, :cond_0

    .line 2
    .line 3
    if-ne p3, p7, :cond_0

    .line 4
    .line 5
    if-ne p4, p8, :cond_0

    .line 6
    .line 7
    if-ne p5, p9, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const p1, 0x7e340002

    .line 11
    .line 12
    .line 13
    iget-object p3, p0, Lwg0;->α:Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {p3, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object p4, p0, Lwg0;->β:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {p1, p4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    const p1, 0x7e34000c

    .line 28
    .line 29
    .line 30
    invoke-virtual {p3, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    sget-object p5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-static {p2, p5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {p3, p1, p5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance p2, Lxg0;

    .line 47
    .line 48
    iget-object p5, p0, Lwg0;->γ:Ljava/lang/Object;

    .line 49
    .line 50
    iget-object p6, p0, Lwg0;->δ:Ljava/lang/String;

    .line 51
    .line 52
    iget-boolean p7, p0, Lwg0;->ε:Z

    .line 53
    .line 54
    iget-boolean p8, p0, Lwg0;->ζ:Z

    .line 55
    .line 56
    invoke-direct/range {p2 .. p8}, Lxg0;-><init>(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZZ)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p3, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 60
    .line 61
    .line 62
    :cond_2
    :goto_0
    return-void
.end method

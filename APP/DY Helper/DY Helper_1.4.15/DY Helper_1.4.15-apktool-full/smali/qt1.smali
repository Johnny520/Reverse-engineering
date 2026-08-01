.class public final synthetic Lqt1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic ε:Lwu1;

.field public final synthetic ζ:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lwu1;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqt1;->ε:Lwu1;

    .line 5
    .line 6
    iput-object p2, p0, Lqt1;->ζ:Landroid/app/Activity;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lqt1;->ε:Lwu1;

    .line 2
    .line 3
    iget-object p1, p1, Lwu1;->ε:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {p3, p1}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lux$α;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance p2, Landroid/app/AlertDialog$Builder;

    .line 15
    .line 16
    iget-object p0, p0, Lqt1;->ζ:Landroid/app/Activity;

    .line 17
    .line 18
    invoke-direct {p2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lux$α;->λ()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    invoke-virtual {p2, p3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-static {p1}, Lux;->ξ(Lux$α;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    invoke-virtual {p2, p3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    new-instance p3, Lbc0;

    .line 38
    .line 39
    const/16 p4, 0x9

    .line 40
    .line 41
    invoke-direct {p3, p0, p4, p1}, Lbc0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    const-string p0, "\u590d\u5236"

    .line 45
    .line 46
    invoke-virtual {p2, p0, p3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const-string p1, "\u5173\u95ed"

    .line 51
    .line 52
    const/4 p2, 0x0

    .line 53
    invoke-virtual {p0, p1, p2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 58
    .line 59
    .line 60
    return-void
.end method

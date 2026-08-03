.class public final synthetic La/ea;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:Ljava/util/ArrayList;

.field public final synthetic b:I

.field public final synthetic c:La/ra;

.field public final synthetic d:La/Sc;


# direct methods
.method public synthetic constructor <init>(ILa/ra;La/Sc;Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, La/ea;->a:Ljava/util/ArrayList;

    iput p1, p0, La/ea;->b:I

    iput-object p2, p0, La/ea;->c:La/ra;

    iput-object p3, p0, La/ea;->d:La/Sc;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    sget-object p1, La/K3;->a:La/K3$a;

    iget-object p2, p0, La/ea;->a:Ljava/util/ArrayList;

    iget v0, p0, La/ea;->b:I

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "id"

    invoke-static {p2, p1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, La/K3$a;->c()Ljava/util/LinkedHashSet;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-static {p1}, La/K3$a;->r(Ljava/util/Set;)V

    :cond_0
    iget-object p1, p0, La/ea;->c:La/ra;

    iget-object p2, p1, La/ra;->a:Landroid/app/Activity;

    const-string v0, "\u5df2\u79fb\u9664"

    const/4 v1, 0x0

    invoke-static {p2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/Toast;->show()V

    iget-object p2, p0, La/ea;->d:La/Sc;

    iget-object p2, p2, La/Sc;->a:Ljava/lang/Object;

    check-cast p2, Landroid/app/AlertDialog;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/app/Dialog;->dismiss()V

    :cond_1
    invoke-virtual {p1}, La/ra;->e()V

    return-void
.end method

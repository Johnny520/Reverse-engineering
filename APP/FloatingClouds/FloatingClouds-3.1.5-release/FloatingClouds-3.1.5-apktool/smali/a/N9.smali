.class public final synthetic La/N9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/io/Serializable;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/io/Serializable;Ljava/lang/Object;I)V
    .locals 0

    iput p3, p0, La/N9;->a:I

    iput-object p1, p0, La/N9;->b:Ljava/io/Serializable;

    iput-object p2, p0, La/N9;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget p1, p0, La/N9;->a:I

    packed-switch p1, :pswitch_data_0

    sget-object p1, La/K3;->a:La/K3$a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->c()Ljava/util/LinkedHashSet;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p1

    if-lez p1, :cond_0

    sget-object p1, La/b6;->a:La/b6;

    invoke-static {p1}, La/K3$a;->r(Ljava/util/Set;)V

    :cond_0
    invoke-static {}, La/m8$a;->b()V

    invoke-static {}, La/m8$a;->a()V

    sget-object p1, La/m8;->l:La/m8;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, La/m8;->s()V

    :cond_1
    sget-object p1, La/m8;->l:La/m8;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, La/m8;->r()V

    :cond_2
    iget-object p1, p0, La/N9;->b:Ljava/io/Serializable;

    check-cast p1, La/Sc;

    iget-object p1, p1, La/Sc;->a:Ljava/lang/Object;

    check-cast p1, Landroid/app/AlertDialog;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    :cond_3
    iget-object p1, p0, La/N9;->c:Ljava/lang/Object;

    check-cast p1, La/ra;

    invoke-virtual {p1}, La/ra;->e()V

    return-void

    :pswitch_0
    iget-object p1, p0, La/N9;->b:Ljava/io/Serializable;

    check-cast p1, Ljava/lang/String;

    iget-object p2, p0, La/N9;->c:Ljava/lang/Object;

    check-cast p2, Landroid/content/Context;

    :try_start_0
    sget-object v0, La/w1;->p:Landroid/content/Context;

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    const-string v1, "Label"

    invoke-static {v1, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string p1, "\u5df2\u590d\u5236 SnsId"

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

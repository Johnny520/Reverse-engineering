.class public final synthetic Lf0/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:LP0/a;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;LP0/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/F;->a:Landroid/app/Activity;

    iput-object p2, p0, Lf0/F;->b:LP0/a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    iget-object p1, p0, Lf0/F;->a:Landroid/app/Activity;

    const-string v0, "$host"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf0/F;->b:LP0/a;

    const-string v1, "$refresh"

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lf0/V;->a:Lf0/V;

    :try_start_0
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v2, "\u91cd\u7f6e\u6240\u6709\u529f\u80fd"

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const-string v2, "\u786e\u5b9a\u8981\u91cd\u7f6e\u6240\u6709\u529f\u80fd\u5417\uff1f\n\u6240\u6709\u5f00\u5173\u3001\u58c1\u7eb8\u3001\u6c14\u6ce1\u3001\u865a\u62df\u5b9a\u4f4d\u3001\u7b7e\u540d\u7b49\u8bbe\u7f6e\u5c06\u6062\u590d\u9ed8\u8ba4\uff0c\u91cd\u542f\u5fae\u4fe1\u540e\u5b8c\u5168\u751f\u6548\u3002"

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const-string v2, "\u91cd\u7f6e"

    new-instance v3, Lf0/p;

    invoke-direct {v3, p1, v0}, Lf0/p;-><init>(Landroid/app/Activity;LP0/a;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const-string v0, "\u53d6\u6d88"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_0
    return-void
.end method

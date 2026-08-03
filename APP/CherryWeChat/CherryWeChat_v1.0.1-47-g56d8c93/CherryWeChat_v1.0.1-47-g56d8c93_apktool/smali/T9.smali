.class public final synthetic LT9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lha;

.field public final synthetic b:Z

.field public final synthetic c:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lha;ZLandroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT9;->a:Lha;

    iput-boolean p2, p0, LT9;->b:Z

    iput-object p3, p0, LT9;->c:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, LT9;->a:Lha;

    iget-object v1, v0, Lha;->g:LWz;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1, v2}, LWz;->setRefreshing(Z)V

    :cond_0
    iget-boolean v1, p0, LT9;->b:Z

    if-eqz v1, :cond_1

    const-wide v3, -0x5c9bfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, LT9;->c:Landroid/app/Activity;

    invoke-static {v3, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    :cond_1
    invoke-virtual {v0}, Lha;->g()V

    return-void
.end method

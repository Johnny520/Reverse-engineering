.class public final synthetic Lc0/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lc0/j0;

.field public final synthetic c:Landroid/widget/TextView;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lc0/j0;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    iput p5, p0, Lc0/i0;->a:I

    iput-object p1, p0, Lc0/i0;->b:Lc0/j0;

    iput-object p2, p0, Lc0/i0;->c:Landroid/widget/TextView;

    iput-object p3, p0, Lc0/i0;->d:Ljava/lang/String;

    iput-object p4, p0, Lc0/i0;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    const-string v0, "$newText"

    iget-object v1, p0, Lc0/i0;->e:Ljava/lang/String;

    const-string v2, "$originalText"

    iget-object v3, p0, Lc0/i0;->d:Ljava/lang/String;

    const-string v4, "$tv"

    iget-object v5, p0, Lc0/i0;->c:Landroid/widget/TextView;

    const-string v6, "$ref"

    iget-object v7, p0, Lc0/i0;->b:Lc0/j0;

    iget v8, p0, Lc0/i0;->a:I

    packed-switch v8, :pswitch_data_0

    invoke-static {v7, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/n0;->a:Lc0/n0;

    invoke-static {v7, v5, v3, v1}, Lc0/n0;->d(Lc0/j0;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :pswitch_0
    invoke-static {v7, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/n0;->a:Lc0/n0;

    invoke-static {v7, v5, v3, v1}, Lc0/n0;->d(Lc0/j0;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :pswitch_1
    invoke-static {v7, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/n0;->a:Lc0/n0;

    invoke-static {v7, v5, v3, v1}, Lc0/n0;->d(Lc0/j0;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

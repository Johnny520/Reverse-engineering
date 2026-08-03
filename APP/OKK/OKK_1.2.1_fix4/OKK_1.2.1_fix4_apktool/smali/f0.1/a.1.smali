.class public final synthetic Lf0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lf0/e;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lf0/e;IILjava/lang/String;I)V
    .locals 0

    iput p5, p0, Lf0/a;->a:I

    iput-object p1, p0, Lf0/a;->b:Lf0/e;

    iput p2, p0, Lf0/a;->c:I

    iput p3, p0, Lf0/a;->d:I

    iput-object p4, p0, Lf0/a;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, Lf0/a;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "$progress"

    iget-object v1, p0, Lf0/a;->b:Lf0/e;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$title"

    iget-object v2, p0, Lf0/a;->e:Ljava/lang/String;

    invoke-static {v2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lf0/a;->c:I

    iget v3, p0, Lf0/a;->d:I

    invoke-virtual {v1, v0, v3, v2}, Lf0/e;->d(IILjava/lang/String;)V

    return-void

    :pswitch_0
    const-string v0, "$progress"

    iget-object v1, p0, Lf0/a;->b:Lf0/e;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$title"

    iget-object v2, p0, Lf0/a;->e:Ljava/lang/String;

    invoke-static {v2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lf0/a;->c:I

    iget v3, p0, Lf0/a;->d:I

    invoke-virtual {v1, v0, v3, v2}, Lf0/e;->d(IILjava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

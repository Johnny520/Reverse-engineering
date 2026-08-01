.class public final synthetic LL/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/io/Serializable;


# direct methods
.method public synthetic constructor <init>(LL/b;ILjava/io/Serializable;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, LL/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL/a;->c:Ljava/lang/Object;

    iput p2, p0, LL/a;->b:I

    iput-object p3, p0, LL/a;->d:Ljava/io/Serializable;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, LL/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL/a;->c:Ljava/lang/Object;

    iput-object p2, p0, LL/a;->d:Ljava/io/Serializable;

    iput p3, p0, LL/a;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, LL/a;->b:I

    .line 2
    .line 3
    iget-object v1, p0, LL/a;->d:Ljava/io/Serializable;

    .line 4
    .line 5
    iget-object v2, p0, LL/a;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iget v3, p0, LL/a;->a:I

    .line 8
    .line 9
    packed-switch v3, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v3, Lz0/q;->a:Landroid/os/Handler;

    .line 13
    .line 14
    check-cast v2, Landroid/content/Context;

    .line 15
    .line 16
    check-cast v1, Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v2, v1, v0}, Lz0/q;->j(Landroid/content/Context;Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    check-cast v2, LL/b;

    .line 23
    .line 24
    iget-object v2, v2, LL/b;->b:LL/f;

    .line 25
    .line 26
    invoke-interface {v2, v0, v1}, LL/f;->l(ILjava/io/Serializable;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

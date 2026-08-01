.class public final synthetic Lx0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lx0/a;->b:I

    iput-object p2, p0, Lx0/a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget p1, p0, Lx0/a;->b:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iget-object v0, p0, Lx0/a;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lq0/f;

    .line 10
    .line 11
    iput-boolean p1, v0, Lq0/f;->b:Z

    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    const/4 p1, 0x0

    .line 15
    iget-object v0, p0, Lx0/a;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lx0/b;

    .line 18
    .line 19
    iput-boolean p1, v0, Lx0/b;->d:Z

    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    const/4 p1, 0x0

    .line 23
    iget-object v0, p0, Lx0/a;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lx0/b;

    .line 26
    .line 27
    iput-boolean p1, v0, Lx0/b;->d:Z

    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

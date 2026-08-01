.class public final synthetic Lq0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lq0/f;


# direct methods
.method public synthetic constructor <init>(Lq0/f;I)V
    .locals 0

    .line 1
    iput p2, p0, Lq0/c;->b:I

    iput-object p1, p0, Lq0/c;->c:Lq0/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    iget p1, p0, Lq0/c;->b:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iget-object p2, p0, Lq0/c;->c:Lq0/f;

    .line 8
    .line 9
    iput-boolean p1, p2, Lq0/f;->a:Z

    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    const/4 p1, 0x1

    .line 13
    iget-object p2, p0, Lq0/c;->c:Lq0/f;

    .line 14
    .line 15
    iput-boolean p1, p2, Lq0/f;->a:Z

    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    const/4 p1, 0x0

    .line 19
    iget-object p2, p0, Lq0/c;->c:Lq0/f;

    .line 20
    .line 21
    iput-boolean p1, p2, Lq0/f;->a:Z

    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

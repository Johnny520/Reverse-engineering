.class public final synthetic Lr0/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lr0/d0;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lr0/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lr0/Y;->b:I

    iput-object p1, p0, Lr0/Y;->c:Lr0/d0;

    iput-object p2, p0, Lr0/Y;->d:Ljava/lang/String;

    iput-object p3, p0, Lr0/Y;->e:Ljava/lang/String;

    iput-object p4, p0, Lr0/Y;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lr0/Y;->f:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v0, p0, Lr0/Y;->e:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lr0/Y;->d:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Lr0/Y;->c:Lr0/d0;

    .line 8
    .line 9
    iget v3, p0, Lr0/Y;->b:I

    .line 10
    .line 11
    packed-switch v3, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v3, Lr0/d0;->U:Ljava/util/List;

    .line 15
    .line 16
    invoke-virtual {v2, v1, v0}, Lr0/d0;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, p1}, Lr0/d0;->s(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    sget-object v3, Lr0/d0;->U:Ljava/util/List;

    .line 24
    .line 25
    invoke-virtual {v2, v1, v0}, Lr0/d0;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, p1}, Lr0/d0;->s(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

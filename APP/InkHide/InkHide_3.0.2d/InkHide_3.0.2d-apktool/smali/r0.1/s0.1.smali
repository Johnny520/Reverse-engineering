.class public final synthetic Lr0/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lr0/H0;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lr0/H0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lr0/s0;->b:I

    iput-object p1, p0, Lr0/s0;->c:Lr0/H0;

    iput-object p2, p0, Lr0/s0;->d:Ljava/lang/String;

    iput-object p4, p0, Lr0/s0;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lr0/s0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v0, p0, Lr0/s0;->c:Lr0/H0;

    .line 4
    .line 5
    iget-object v1, p0, Lr0/s0;->d:Ljava/lang/String;

    .line 6
    .line 7
    iget v2, p0, Lr0/s0;->b:I

    .line 8
    .line 9
    packed-switch v2, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v2, Lr0/H0;->g0:Ljava/util/List;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lr0/H0;->m(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lr0/H0;->v(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    sget-object v2, Lr0/H0;->g0:Ljava/util/List;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lr0/H0;->m(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lr0/H0;->v(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    invoke-virtual {v0, v1}, Lr0/H0;->m(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lr0/H0;->v(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

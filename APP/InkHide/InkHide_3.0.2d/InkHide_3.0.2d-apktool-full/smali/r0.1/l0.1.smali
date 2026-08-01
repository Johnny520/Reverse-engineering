.class public final synthetic Lr0/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/H0;

.field public final synthetic c:Landroid/widget/PopupWindow;

.field public final synthetic d:Landroid/view/View;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:J

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lr0/H0;Landroid/widget/PopupWindow;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;I)V
    .locals 0

    .line 1
    iput p9, p0, Lr0/l0;->a:I

    iput-object p1, p0, Lr0/l0;->b:Lr0/H0;

    iput-object p2, p0, Lr0/l0;->c:Landroid/widget/PopupWindow;

    iput-object p3, p0, Lr0/l0;->d:Landroid/view/View;

    iput-object p4, p0, Lr0/l0;->e:Ljava/lang/String;

    iput-object p5, p0, Lr0/l0;->f:Ljava/lang/String;

    iput-wide p6, p0, Lr0/l0;->g:J

    iput-object p8, p0, Lr0/l0;->h:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, Lr0/l0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr0/l0;->h:Ljava/lang/String;

    .line 7
    .line 8
    const-string v1, "-post48"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v9

    .line 14
    iget-object v3, p0, Lr0/l0;->c:Landroid/widget/PopupWindow;

    .line 15
    .line 16
    iget-object v4, p0, Lr0/l0;->d:Landroid/view/View;

    .line 17
    .line 18
    iget-object v5, p0, Lr0/l0;->e:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v6, p0, Lr0/l0;->f:Ljava/lang/String;

    .line 21
    .line 22
    iget-wide v7, p0, Lr0/l0;->g:J

    .line 23
    .line 24
    iget-object v2, p0, Lr0/l0;->b:Lr0/H0;

    .line 25
    .line 26
    invoke-virtual/range {v2 .. v9}, Lr0/H0;->C1(Landroid/widget/PopupWindow;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    iget-object v0, p0, Lr0/l0;->h:Ljava/lang/String;

    .line 31
    .line 32
    const-string v1, "-post"

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v9

    .line 38
    iget-object v3, p0, Lr0/l0;->c:Landroid/widget/PopupWindow;

    .line 39
    .line 40
    iget-object v4, p0, Lr0/l0;->d:Landroid/view/View;

    .line 41
    .line 42
    iget-object v5, p0, Lr0/l0;->e:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v6, p0, Lr0/l0;->f:Ljava/lang/String;

    .line 45
    .line 46
    iget-wide v7, p0, Lr0/l0;->g:J

    .line 47
    .line 48
    iget-object v2, p0, Lr0/l0;->b:Lr0/H0;

    .line 49
    .line 50
    invoke-virtual/range {v2 .. v9}, Lr0/H0;->C1(Landroid/widget/PopupWindow;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

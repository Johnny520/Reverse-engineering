.class public final synthetic Ls0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Ls0/h;->b:I

    iput-object p1, p0, Ls0/h;->c:Ljava/lang/Object;

    iput-object p2, p0, Ls0/h;->d:Ljava/lang/Object;

    iput-object p3, p0, Ls0/h;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 1
    iget p1, p0, Ls0/h;->b:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ls0/h;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroid/content/Context;

    .line 9
    .line 10
    iget-object p2, p0, Ls0/h;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p2, Lz0/b;

    .line 13
    .line 14
    iget-object p2, p2, Lz0/b;->i:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v0, p0, Ls0/h;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lx0/b;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    :try_start_0
    new-instance v0, Lr0/n1;

    .line 24
    .line 25
    const/16 v1, 0xf

    .line 26
    .line 27
    invoke-direct {v0, v1}, Lr0/n1;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1, p2, v0}, Lu0/a;->b(Landroid/content/Context;Ljava/lang/String;LM0/l;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catch_0
    move-exception p1

    .line 35
    const-string p2, "\u4e0b\u8f7d\u94fe\u63a5\u6253\u5f00\u5931\u8d25"

    .line 36
    .line 37
    invoke-static {p2}, Lb1/h;->P(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    return-void

    .line 48
    :pswitch_0
    iget-object p1, p0, Ls0/h;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Ls0/l;

    .line 51
    .line 52
    iget-object p2, p1, Ls0/l;->o:Lt0/e;

    .line 53
    .line 54
    invoke-virtual {p2}, Lt0/c;->a()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Ls0/l;->d()V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Ls0/h;->e:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 63
    .line 64
    iget-object p2, p0, Ls0/h;->d:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p2, LC/d;

    .line 67
    .line 68
    invoke-virtual {p2, p1}, LC/d;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

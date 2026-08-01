.class public final synthetic Lr0/O0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lr0/O0;->b:I

    iput-object p2, p0, Lr0/O0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lr0/O0;->c:Ljava/lang/Object;

    .line 3
    .line 4
    iget v2, p0, Lr0/O0;->b:I

    .line 5
    .line 6
    packed-switch v2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance p1, Ls0/J;

    .line 10
    .line 11
    check-cast v1, Landroid/app/Activity;

    .line 12
    .line 13
    invoke-direct {p1, v1}, Ls0/J;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lt0/c;->g()V

    .line 17
    .line 18
    .line 19
    return v0

    .line 20
    :pswitch_0
    sget-boolean v2, Lz0/i;->a:Z

    .line 21
    .line 22
    invoke-static {}, Lz0/g;->H()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_3

    .line 27
    .line 28
    invoke-static {}, Lz0/g;->A()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    check-cast v1, Lr0/Y0;

    .line 36
    .line 37
    iget-object v2, v1, Lr0/Y0;->h:Ljava/util/Map;

    .line 38
    .line 39
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Lr0/P0;

    .line 44
    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget-object v2, p1, Lr0/P0;->a:Landroid/app/Activity;

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Lr0/Y0;->C(Landroid/app/Activity;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-nez v2, :cond_2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-virtual {v1, p1}, Lr0/Y0;->M(Lr0/P0;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    :goto_0
    const/4 v0, 0x0

    .line 62
    :goto_1
    return v0

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

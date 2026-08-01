.class public final synthetic Lr0/F0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/H0;

.field public final synthetic c:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lr0/H0;Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p3, p0, Lr0/F0;->a:I

    iput-object p1, p0, Lr0/F0;->b:Lr0/H0;

    iput-object p2, p0, Lr0/F0;->c:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lr0/F0;->c:Landroid/app/Activity;

    .line 3
    .line 4
    iget-object v2, p0, Lr0/F0;->b:Lr0/H0;

    .line 5
    .line 6
    iget v3, p0, Lr0/F0;->a:I

    .line 7
    .line 8
    packed-switch v3, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v3, Lr0/H0;->g0:Ljava/util/List;

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Lr0/H0;->A1(Landroid/app/Activity;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :cond_0
    invoke-virtual {v2, v0}, Lr0/H0;->n0(Landroid/view/View;)Z

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void

    .line 33
    :pswitch_0
    sget-object v3, Lr0/H0;->g0:Ljava/util/List;

    .line 34
    .line 35
    invoke-virtual {v2, v1}, Lr0/H0;->A1(Landroid/app/Activity;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_3

    .line 40
    .line 41
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    :cond_2
    invoke-virtual {v2, v0}, Lr0/H0;->n0(Landroid/view/View;)Z

    .line 52
    .line 53
    .line 54
    :cond_3
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic Lr0/H1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic b:Lr0/I1;

.field public final synthetic c:Lr0/M1;

.field public final synthetic d:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lr0/I1;Lr0/M1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lr0/H1;->b:Lr0/I1;

    iput-object p3, p0, Lr0/H1;->c:Lr0/M1;

    iput-object p1, p0, Lr0/H1;->d:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    iget-object v0, p0, Lr0/H1;->b:Lr0/I1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz p2, :cond_2

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-eq p2, v2, :cond_0

    .line 12
    .line 13
    const/4 v2, 0x3

    .line 14
    if-eq p2, v2, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    iget-object p2, v0, Lr0/I1;->a:LA0/r;

    .line 18
    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    :cond_1
    const/4 p1, 0x0

    .line 25
    iput-object p1, v0, Lr0/I1;->a:LA0/r;

    .line 26
    .line 27
    iget-boolean p1, v0, Lr0/I1;->b:Z

    .line 28
    .line 29
    return p1

    .line 30
    :cond_2
    iput-boolean v1, v0, Lr0/I1;->b:Z

    .line 31
    .line 32
    iget-object p2, v0, Lr0/I1;->a:LA0/r;

    .line 33
    .line 34
    if-eqz p2, :cond_3

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 37
    .line 38
    .line 39
    :cond_3
    new-instance p2, LA0/r;

    .line 40
    .line 41
    iget-object v2, p0, Lr0/H1;->d:Landroid/app/Activity;

    .line 42
    .line 43
    iget-object v3, p0, Lr0/H1;->c:Lr0/M1;

    .line 44
    .line 45
    invoke-direct {p2, v2, v0, v3}, LA0/r;-><init>(Landroid/app/Activity;Lr0/I1;Lr0/M1;)V

    .line 46
    .line 47
    .line 48
    iput-object p2, v0, Lr0/I1;->a:LA0/r;

    .line 49
    .line 50
    sget-boolean v0, Lz0/i;->a:Z

    .line 51
    .line 52
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getQuickDisplayLongPressMs()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    const/16 v2, 0xc8

    .line 61
    .line 62
    const/16 v3, 0xbb8

    .line 63
    .line 64
    invoke-static {v0, v2, v3}, LD/h;->g(III)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    int-to-long v2, v0

    .line 69
    invoke-virtual {p1, p2, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 70
    .line 71
    .line 72
    return v1
.end method

.class public final synthetic Ls0/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Ls0/J;

.field public final synthetic c:I

.field public final synthetic d:LN0/l;


# direct methods
.method public synthetic constructor <init>(ILN0/l;Ls0/J;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Ls0/D;->b:Ls0/J;

    iput p1, p0, Ls0/D;->c:I

    iput-object p2, p0, Ls0/D;->d:LN0/l;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Ls0/D;->b:Ls0/J;

    .line 2
    .line 3
    iget-object v0, p1, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getHiddenMessageVibrateMode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, Ls0/D;->c:I

    .line 10
    .line 11
    if-eq v0, v1, :cond_3

    .line 12
    .line 13
    iget-object p1, p1, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Lcom/lu/wxmask/bean/OptionData;->setHiddenMessageVibrateMode(I)V

    .line 16
    .line 17
    .line 18
    sget-boolean v0, Lz0/i;->a:Z

    .line 19
    .line 20
    invoke-static {p1}, Lz0/g;->O(Lcom/lu/wxmask/bean/OptionData;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    const/4 v0, 0x3

    .line 25
    invoke-static {v1, p1, v0}, LD/h;->g(III)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    const/4 v1, 0x2

    .line 32
    if-eq p1, v1, :cond_1

    .line 33
    .line 34
    if-eq p1, v0, :cond_0

    .line 35
    .line 36
    const-string p1, "\u9ed8\u8ba4"

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const-string p1, "\u8fde\u7eed"

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const-string p1, "\u5f3a\u70c8"

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const-string p1, "\u8f7b\u5fae"

    .line 46
    .line 47
    :goto_0
    const-string v0, "\u5df2\u4fdd\u5b58\u9707\u52a8\u65b9\u6848\uff1a"

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    iget-object p1, p0, Ls0/D;->d:LN0/l;

    .line 57
    .line 58
    iget-object p1, p1, LN0/l;->a:Ljava/lang/Object;

    .line 59
    .line 60
    if-eqz p1, :cond_4

    .line 61
    .line 62
    check-cast p1, Landroid/app/AlertDialog;

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_4
    const-string p1, "dialog"

    .line 69
    .line 70
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/4 p1, 0x0

    .line 74
    throw p1
.end method

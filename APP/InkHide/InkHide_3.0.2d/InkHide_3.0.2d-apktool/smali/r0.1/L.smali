.class public final synthetic Lr0/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lr0/L;->b:I

    iput-object p1, p0, Lr0/L;->c:Ljava/lang/Object;

    iput-object p2, p0, Lr0/L;->d:Ljava/lang/Object;

    iput-object p3, p0, Lr0/L;->e:Ljava/lang/Object;

    iput-object p4, p0, Lr0/L;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ls0/J;LN0/l;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lr0/L;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/L;->d:Ljava/lang/Object;

    iput-object p2, p0, Lr0/L;->e:Ljava/lang/Object;

    iput-object p3, p0, Lr0/L;->c:Ljava/lang/Object;

    iput-object p4, p0, Lr0/L;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lr0/L;->e:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v0, p0, Lr0/L;->d:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, Lr0/L;->f:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v2, p0, Lr0/L;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iget v3, p0, Lr0/L;->b:I

    .line 10
    .line 11
    packed-switch v3, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v2, Ls0/J;

    .line 15
    .line 16
    check-cast v1, LN0/l;

    .line 17
    .line 18
    check-cast v0, Ljava/lang/String;

    .line 19
    .line 20
    check-cast p1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v0, p1, v2, v1}, Ls0/J;->m(Ljava/lang/String;Ljava/lang/String;Ls0/J;LN0/l;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    check-cast v2, Landroid/widget/EditText;

    .line 27
    .line 28
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v2, 0x0

    .line 40
    :goto_0
    if-nez v2, :cond_1

    .line 41
    .line 42
    const-string v2, ""

    .line 43
    .line 44
    :cond_1
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    check-cast v0, Landroid/app/Activity;

    .line 49
    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    const-string p1, "\u8bf7\u8f93\u5165\u5bc6\u7801"

    .line 53
    .line 54
    invoke-static {v0, p1}, Lb1/h;->O(Landroid/content/Context;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    sget-boolean v3, Lz0/i;->a:Z

    .line 59
    .line 60
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v3}, Lcom/lu/wxmask/bean/OptionData;->getTripleTapPassword()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-nez v2, :cond_3

    .line 73
    .line 74
    const-string p1, "\u5bc6\u7801\u9519\u8bef"

    .line 75
    .line 76
    invoke-static {v0, p1}, Lb1/h;->O(Landroid/content/Context;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    check-cast p1, Lr0/M1;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-static {v0}, Lr0/M1;->j(Landroid/app/Activity;)V

    .line 86
    .line 87
    .line 88
    check-cast v1, Landroid/app/AlertDialog;

    .line 89
    .line 90
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 91
    .line 92
    .line 93
    :goto_1
    return-void

    .line 94
    :pswitch_1
    check-cast v2, Lr0/d0;

    .line 95
    .line 96
    check-cast v0, Ljava/lang/String;

    .line 97
    .line 98
    check-cast p1, Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v2, v0, p1}, Lr0/d0;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    check-cast v1, Landroid/widget/PopupWindow;

    .line 104
    .line 105
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic Ls0/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:Ls0/J;

.field public final synthetic b:LN0/l;


# direct methods
.method public synthetic constructor <init>(LN0/l;Ls0/J;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ls0/A;->a:Ls0/J;

    iput-object p1, p0, Ls0/A;->b:LN0/l;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ls0/A;->a:Ls0/J;

    .line 7
    .line 8
    iget-object v0, p1, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 9
    .line 10
    invoke-virtual {v0, p2}, Lcom/lu/wxmask/bean/OptionData;->setCloseFriendQuickDisplay(Z)V

    .line 11
    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    new-instance p2, Ls0/B;

    .line 16
    .line 17
    iget-object v0, p0, Ls0/A;->b:LN0/l;

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    invoke-direct {p2, v1, v0, p1}, Ls0/B;-><init>(ILN0/l;Ls0/J;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p2}, Ls0/J;->P(LM0/a;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method
